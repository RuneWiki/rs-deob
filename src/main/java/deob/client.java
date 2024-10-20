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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Date;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class114 {

    @ObfuscatedName("client.h")
    public static boolean field302 = true;

    @ObfuscatedName("client.p")
    public static int field303 = 1;

    @ObfuscatedName("client.j")
    public static int field304 = 0;

    @ObfuscatedName("client.r")
    public static int field306 = 0;

    @ObfuscatedName("client.o")
    public static boolean field308 = false;

    @ObfuscatedName("client.m")
    public static boolean field309 = false;

    @ObfuscatedName("client.s")
    public static int field310 = 0;

    @ObfuscatedName("client.z")
    public static int field313 = 0;

    @ObfuscatedName("client.t")
    public static boolean field374 = true;

    @ObfuscatedName("client.w")
    public static class118[] field366 = new class118[4];

    @ObfuscatedName("client.a")
    public static int field450 = 0;

    @ObfuscatedName("client.k")
    public static long field316 = -1L;

    @ObfuscatedName("client.g")
    public static int field476 = -1;

    @ObfuscatedName("client.e")
    public static int field319 = -1;

    @ObfuscatedName("client.ae")
    public static int field465 = -1;

    @ObfuscatedName("client.aq")
    public static boolean field321 = true;

    @ObfuscatedName("client.at")
    public static boolean field322 = false;

    @ObfuscatedName("client.au")
    public static int field323 = 0;

    @ObfuscatedName("client.am")
    public static int field552 = 0;

    @ObfuscatedName("client.ad")
    public static int field325 = 0;

    @ObfuscatedName("client.ai")
    public static int field326 = 0;

    @ObfuscatedName("client.ac")
    public static int field327 = 0;

    @ObfuscatedName("client.ao")
    public static int field521 = 0;

    @ObfuscatedName("client.as")
    public static int field329 = 0;

    @ObfuscatedName("client.aa")
    public static int field330 = 0;

    @ObfuscatedName("client.ah")
    public static int field331 = 0;

    @ObfuscatedName("client.ap")
    public static class41 field332 = class41.field837;

    @ObfuscatedName("client.ak")
    public static class41 field333 = class41.field837;

    @ObfuscatedName("client.al")
    public static int field334 = 0;

    @ObfuscatedName("client.ab")
    public static int field335 = 0;

    @ObfuscatedName("client.az")
    public static int field418 = 0;

    @ObfuscatedName("client.bk")
    public static int field407 = 0;

    @ObfuscatedName("client.bg")
    public static int field519 = 0;

    @ObfuscatedName("client.bh")
    public static int field362 = 0;

    @ObfuscatedName("client.bs")
    public static int field342 = 0;

    @ObfuscatedName("client.bq")
    public static int field343 = 0;

    @ObfuscatedName("client.cx")
    public static class36[] field484 = new class36[32768];

    @ObfuscatedName("client.cy")
    public static int field341 = 0;

    @ObfuscatedName("client.ct")
    public static int[] field346 = new int[32768];

    @ObfuscatedName("client.cf")
    public static int field347 = 0;

    @ObfuscatedName("client.cw")
    public static int[] field348 = new int[250];

    @ObfuscatedName("client.cn")
    public static class160 field349 = new class160(5000);

    @ObfuscatedName("client.cs")
    public static class160 field458 = new class160(5000);

    @ObfuscatedName("client.cg")
    public static class160 field351 = new class160(15000);

    @ObfuscatedName("client.cb")
    public static int field352 = 0;

    @ObfuscatedName("client.cp")
    public static int field353 = 0;

    @ObfuscatedName("client.cu")
    public static int field560 = 0;

    @ObfuscatedName("client.cm")
    public static int field355 = 0;

    @ObfuscatedName("client.ci")
    public static int field356 = 0;

    @ObfuscatedName("client.cr")
    public static int field357 = 0;

    @ObfuscatedName("client.ck")
    public static int field575 = 0;

    @ObfuscatedName("client.cd")
    public static int field359 = 0;

    @ObfuscatedName("client.cv")
    public static boolean field388 = false;

    @ObfuscatedName("client.dm")
    public static int field361 = 0;

    @ObfuscatedName("client.dd")
    public static int field487 = 1;

    @ObfuscatedName("client.dt")
    public static int field363 = 0;

    @ObfuscatedName("client.dn")
    public static int field382 = 1;

    @ObfuscatedName("client.dy")
    public static int field365 = 0;

    @ObfuscatedName("client.dv")
    public static boolean field301 = false;

    @ObfuscatedName("client.dw")
    public static int[][][] field368 = new int[4][13][13];

    @ObfuscatedName("client.dz")
    public static final int[] field369 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dk")
    public static int field482 = 0;

    @ObfuscatedName("client.dl")
    public static int field371 = 2;

    @ObfuscatedName("client.dg")
    public static int field372 = 0;

    @ObfuscatedName("client.db")
    public static int field373 = 2;

    @ObfuscatedName("client.dr")
    public static int field340 = 0;

    @ObfuscatedName("client.ek")
    public static int field440 = 1;

    @ObfuscatedName("client.eg")
    public static int field358 = 0;

    @ObfuscatedName("client.ej")
    public static int field354 = 0;

    @ObfuscatedName("client.eu")
    public static int field378 = 2;

    @ObfuscatedName("client.ef")
    public static int field390 = 0;

    @ObfuscatedName("client.eq")
    public static int field380 = 1;

    @ObfuscatedName("client.ex")
    public static int field579 = 0;

    @ObfuscatedName("client.ei")
    public static int field499 = 0;

    @ObfuscatedName("client.ep")
    public static int field336 = 2301979;

    @ObfuscatedName("client.eh")
    public static int field384 = 5063219;

    @ObfuscatedName("client.ec")
    public static int field377 = 3353893;

    @ObfuscatedName("client.el")
    public static int field405 = 7759444;

    @ObfuscatedName("client.er")
    public static boolean field387 = false;

    @ObfuscatedName("client.et")
    public static int field479 = 0;

    @ObfuscatedName("client.fc")
    public static int field542 = 128;

    @ObfuscatedName("client.fd")
    public static int field527 = 0;

    @ObfuscatedName("client.fv")
    public static int field391 = 0;

    @ObfuscatedName("client.fi")
    public static int field392 = 0;

    @ObfuscatedName("client.fp")
    public static int field393 = 0;

    @ObfuscatedName("client.fy")
    public static int field394 = 0;

    @ObfuscatedName("client.fm")
    public static int field395 = 50;

    @ObfuscatedName("client.fh")
    public static int field396 = 0;

    @ObfuscatedName("client.fa")
    public static boolean field397 = false;

    @ObfuscatedName("client.fs")
    public static int field398 = 0;

    @ObfuscatedName("client.fl")
    public static int field399 = 0;

    @ObfuscatedName("client.fr")
    public static int field466 = 50;

    @ObfuscatedName("client.fb")
    public static int[] field401 = new int[field466];

    @ObfuscatedName("client.fe")
    public static int[] field376 = new int[field466];

    @ObfuscatedName("client.ft")
    public static int[] field318 = new int[field466];

    @ObfuscatedName("client.fz")
    public static int[] field404 = new int[field466];

    @ObfuscatedName("client.fx")
    public static int[] field383 = new int[field466];

    @ObfuscatedName("client.fw")
    public static int[] field406 = new int[field466];

    @ObfuscatedName("client.fo")
    public static int[] field553 = new int[field466];

    @ObfuscatedName("client.gj")
    public static String[] field408 = new String[field466];

    @ObfuscatedName("client.ga")
    public static int[][] field409 = new int[104][104];

    @ObfuscatedName("client.ge")
    public static int field410 = 0;

    @ObfuscatedName("client.gl")
    public static int field411 = -1;

    @ObfuscatedName("client.gd")
    public static int field412 = -1;

    @ObfuscatedName("client.gg")
    public static int field413 = 0;

    @ObfuscatedName("client.gp")
    public static int field414 = 0;

    @ObfuscatedName("client.gz")
    public static int field415 = 0;

    @ObfuscatedName("client.gy")
    public static int field416 = 0;

    @ObfuscatedName("client.go")
    public static int field453 = 0;

    @ObfuscatedName("client.gt")
    public static int field445 = 0;

    @ObfuscatedName("client.gw")
    public static int field403 = 0;

    @ObfuscatedName("client.gx")
    public static int field360 = 0;

    @ObfuscatedName("client.gv")
    public static int field400 = 0;

    @ObfuscatedName("client.gk")
    public static int field502 = 0;

    @ObfuscatedName("client.gi")
    public static boolean field468 = false;

    @ObfuscatedName("client.gf")
    public static int field424 = 0;

    @ObfuscatedName("client.gs")
    public static int field425 = 0;

    @ObfuscatedName("client.gb")
    public static class24[] field426 = new class24[2048];

    @ObfuscatedName("client.gu")
    public static int field557 = -1;

    @ObfuscatedName("client.gn")
    public static int field428 = 0;

    @ObfuscatedName("client.hz")
    public static int field429 = 0;

    @ObfuscatedName("client.hd")
    public static int[] field389 = new int[1000];

    @ObfuscatedName("client.ht")
    public static final int[] field431 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hb")
    public static String[] field432 = new String[8];

    @ObfuscatedName("client.hn")
    public static boolean[] field375 = new boolean[8];

    @ObfuscatedName("client.hj")
    public static int[] field345 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hw")
    public static int field435 = -1;

    @ObfuscatedName("client.hq")
    public static class129[][][] field449 = new class129[4][104][104];

    @ObfuscatedName("client.hf")
    public static class129 field437 = new class129();

    @ObfuscatedName("client.hs")
    public static class129 field438 = new class129();

    @ObfuscatedName("client.he")
    public static class129 field419 = new class129();

    @ObfuscatedName("client.hu")
    public static int[] field385 = new int[25];

    @ObfuscatedName("client.hg")
    public static int[] field367 = new int[25];

    @ObfuscatedName("client.hm")
    public static int[] field442 = new int[25];

    @ObfuscatedName("client.hy")
    public static int field443 = 0;

    @ObfuscatedName("client.ho")
    public static boolean field444 = false;

    @ObfuscatedName("client.hp")
    public static int field578 = 0;

    @ObfuscatedName("client.hx")
    public static int[] field314 = new int[500];

    @ObfuscatedName("client.ha")
    public static int[] field447 = new int[500];

    @ObfuscatedName("client.iy")
    public static int[] field448 = new int[500];

    @ObfuscatedName("client.ie")
    public static int[] field492 = new int[500];

    @ObfuscatedName("client.id")
    public static String[] field417 = new String[500];

    @ObfuscatedName("client.ij")
    public static String[] field451 = new String[500];

    @ObfuscatedName("client.iq")
    public static boolean field315 = false;

    @ObfuscatedName("client.il")
    public static int field434 = -1;

    @ObfuscatedName("client.ih")
    public static boolean field454 = false;

    @ObfuscatedName("client.ir")
    public static int field455 = -1;

    @ObfuscatedName("client.ic")
    public static int field474 = -1;

    @ObfuscatedName("client.in")
    public static int field300 = 0;

    @ObfuscatedName("client.if")
    public static int field585 = 50;

    @ObfuscatedName("client.ip")
    public static int field459 = 0;

    @ObfuscatedName("client.it")
    public static String field460 = null;

    @ObfuscatedName("client.iu")
    public static boolean field512 = false;

    @ObfuscatedName("client.ik")
    public static int field462 = -1;

    @ObfuscatedName("client.ix")
    public static int field463 = -1;

    @ObfuscatedName("client.ia")
    public static String field464 = null;

    @ObfuscatedName("client.jy")
    public static String field381 = null;

    @ObfuscatedName("client.jo")
    public static int field523 = -1;

    @ObfuscatedName("client.ji")
    public static class126 field467 = new class126(8);

    @ObfuscatedName("client.jx")
    public static int field339 = 0;

    @ObfuscatedName("client.jr")
    public static int field469 = 0;

    @ObfuscatedName("client.jl")
    public static class170 field470 = null;

    @ObfuscatedName("client.jm")
    public static int field471 = 0;

    @ObfuscatedName("client.jt")
    public static int field472 = 0;

    @ObfuscatedName("client.jk")
    public static int field473 = 0;

    @ObfuscatedName("client.jz")
    public static int field515 = -1;

    @ObfuscatedName("client.jf")
    public static boolean field475 = false;

    @ObfuscatedName("client.jj")
    public static boolean field506 = false;

    @ObfuscatedName("client.jp")
    public static boolean field477 = false;

    @ObfuscatedName("client.jh")
    public static class170 field478 = null;

    @ObfuscatedName("client.jq")
    public static class170 field524 = null;

    @ObfuscatedName("client.jd")
    public static class170 field531 = null;

    @ObfuscatedName("client.jv")
    public static int field481 = 0;

    @ObfuscatedName("client.js")
    public static int field370 = 0;

    @ObfuscatedName("client.jc")
    public static class170 field344 = null;

    @ObfuscatedName("client.jg")
    public static boolean field517 = false;

    @ObfuscatedName("client.je")
    public static int field320 = -1;

    @ObfuscatedName("client.jw")
    public static int field486 = -1;

    @ObfuscatedName("client.ja")
    public static boolean field456 = false;

    @ObfuscatedName("client.ju")
    public static int field532 = -1;

    @ObfuscatedName("client.jb")
    public static int field489 = -1;

    @ObfuscatedName("client.jn")
    public static boolean field493 = false;

    @ObfuscatedName("client.kz")
    public static int field491 = 1;

    @ObfuscatedName("client.ks")
    public static int[] field446 = new int[32];

    @ObfuscatedName("client.kd")
    public static int field536 = 0;

    @ObfuscatedName("client.kc")
    public static int[] field494 = new int[32];

    @ObfuscatedName("client.kn")
    public static int field495 = 0;

    @ObfuscatedName("client.kw")
    public static int[] field496 = new int[32];

    @ObfuscatedName("client.ki")
    public static int field461 = 0;

    @ObfuscatedName("client.kp")
    public static int field498 = 0;

    @ObfuscatedName("client.km")
    public static int field452 = 0;

    @ObfuscatedName("client.kx")
    public static int field500 = 0;

    @ObfuscatedName("client.kj")
    public static int field501 = 0;

    @ObfuscatedName("client.kb")
    public static int field441 = 0;

    @ObfuscatedName("client.kl")
    public static int field503 = 0;

    @ObfuscatedName("client.ku")
    public static int field504 = 0;

    @ObfuscatedName("client.ka")
    public static class129 field436 = new class129();

    @ObfuscatedName("client.ky")
    public static class129 field544 = new class129();

    @ObfuscatedName("client.kq")
    public static class129 field507 = new class129();

    @ObfuscatedName("client.kh")
    public static class126 field508 = new class126(512);

    @ObfuscatedName("client.le")
    public static int field490 = 0;

    @ObfuscatedName("client.ll")
    public static int field510 = -2;

    @ObfuscatedName("client.lp")
    public static boolean[] field511 = new boolean[100];

    @ObfuscatedName("client.lv")
    public static boolean[] field427 = new boolean[100];

    @ObfuscatedName("client.lr")
    public static boolean[] field488 = new boolean[100];

    @ObfuscatedName("client.lc")
    public static int[] field514 = new int[100];

    @ObfuscatedName("client.ly")
    public static int[] field485 = new int[100];

    @ObfuscatedName("client.lo")
    public static int[] field516 = new int[100];

    @ObfuscatedName("client.lz")
    public static int[] field421 = new int[100];

    @ObfuscatedName("client.ln")
    public static int field518 = 0;

    @ObfuscatedName("client.lk")
    public static long field567 = 0L;

    @ObfuscatedName("client.ls")
    public static boolean field520 = true;

    @ObfuscatedName("client.lj")
    public static int field564 = 765;

    @ObfuscatedName("client.lh")
    public static int field522 = 1;

    @ObfuscatedName("client.lx")
    public static int[] field545 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lb")
    public static int field589 = 0;

    @ObfuscatedName("client.ld")
    public static int field525 = 0;

    @ObfuscatedName("client.lu")
    public static String field526 = "";

    @ObfuscatedName("client.lw")
    public static long[] field430 = new long[100];

    @ObfuscatedName("client.ma")
    public static int field558 = 0;

    @ObfuscatedName("client.mv")
    public static int field529 = 0;

    @ObfuscatedName("client.mq")
    public static int[] field530 = new int[128];

    @ObfuscatedName("client.mb")
    public static int[] field324 = new int[128];

    @ObfuscatedName("client.mu")
    public static long field420 = -1L;

    @ObfuscatedName("client.mi")
    public static String field533 = null;

    @ObfuscatedName("client.mj")
    public static String field534 = null;

    @ObfuscatedName("client.mx")
    public static int field535 = -1;

    @ObfuscatedName("client.mf")
    public static int field513 = 0;

    @ObfuscatedName("client.mt")
    public static int[] field537 = new int[1000];

    @ObfuscatedName("client.mg")
    public static int[] field538 = new int[1000];

    @ObfuscatedName("client.mh")
    public static class225[] field539 = new class225[1000];

    @ObfuscatedName("client.my")
    public static int field540 = 0;

    @ObfuscatedName("client.mp")
    public static int field541 = 0;

    @ObfuscatedName("client.mc")
    public static int field565 = 0;

    @ObfuscatedName("client.nh")
    public static int field543 = 255;

    @ObfuscatedName("client.nq")
    public static int field422 = -1;

    @ObfuscatedName("client.nk")
    public static boolean field546 = false;

    @ObfuscatedName("client.nv")
    public static int field480 = 127;

    @ObfuscatedName("client.na")
    public static int field547 = 127;

    @ObfuscatedName("client.nx")
    public static int field548 = 0;

    @ObfuscatedName("client.ng")
    public static int[] field549 = new int[50];

    @ObfuscatedName("client.nu")
    public static int[] field550 = new int[50];

    @ObfuscatedName("client.nr")
    public static int[] field551 = new int[50];

    @ObfuscatedName("client.nm")
    public static int[] field556 = new int[50];

    @ObfuscatedName("client.nj")
    public static class54[] field350 = new class54[50];

    @ObfuscatedName("client.nd")
    public static boolean field554 = false;

    @ObfuscatedName("client.oa")
    public static boolean[] field555 = new boolean[5];

    @ObfuscatedName("client.ow")
    public static int[] field328 = new int[5];

    @ObfuscatedName("client.oj")
    public static int[] field528 = new int[5];

    @ObfuscatedName("client.oi")
    public static int[] field312 = new int[5];

    @ObfuscatedName("client.ox")
    public static int[] field559 = new int[5];

    @ObfuscatedName("client.ob")
    public static short field386 = 256;

    @ObfuscatedName("client.om")
    public static short field561 = 205;

    @ObfuscatedName("client.ol")
    public static short field562 = 256;

    @ObfuscatedName("client.oq")
    public static short field563 = 320;

    @ObfuscatedName("client.oe")
    public static short field379 = 1;

    @ObfuscatedName("client.op")
    public static short field483 = 32767;

    @ObfuscatedName("client.ot")
    public static short field566 = 1;

    @ObfuscatedName("client.on")
    public static short field402 = 32767;

    @ObfuscatedName("client.ov")
    public static int field568 = 0;

    @ObfuscatedName("client.oc")
    public static int field569 = 0;

    @ObfuscatedName("client.of")
    public static int field570 = 0;

    @ObfuscatedName("client.od")
    public static int field571 = 0;

    @ObfuscatedName("client.og")
    public static int field572 = 0;

    @ObfuscatedName("client.or")
    public static int field573 = 0;

    @ObfuscatedName("client.os")
    public static int field574 = 0;

    @ObfuscatedName("client.oz")
    public static class15[] field423 = new class15[400];

    @ObfuscatedName("client.oy")
    public static class131 field576 = new class131();

    @ObfuscatedName("client.po")
    public static int field577 = 0;

    @ObfuscatedName("client.pw")
    public static class20[] field505 = new class20[400];

    @ObfuscatedName("client.pn")
    public static class167 field433 = new class167();

    @ObfuscatedName("client.pg")
    public static int field580 = -1;

    @ObfuscatedName("client.pr")
    public static int field581 = -1;

    @ObfuscatedName("client.py")
    public static class5[] field582 = new class5[8];

    @ObfuscatedName("client.pi")
    public static long field584 = -1L;

    @ObfuscatedName("client.pq")
    public static long field457 = -1L;

    @ObfuscatedName("client.ph")
    public static final class23 field586 = new class23();

    @ObfuscatedName("client.pa")
    public static int[] field587 = new int[50];

    @ObfuscatedName("client.pz")
    public static int[] field588 = new int[50];

    @ObfuscatedName("client.h(I)V")
    public final void method598() {
    }

    public final void init() {
        if (!this.method2051()) {
            return;
        }
        class215[] var1 = new class215[] { class215.field3169, class215.field3164, class215.field3161, class215.field3160, class215.field3166, class215.field3168, class215.field3170, class215.field3165, class215.field3162, class215.field3163, class215.field3167, class215.field3159, class215.field3171, class215.field3173, class215.field3172 };
        class215[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class215 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3174);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3174)) {
                    case 2:
                        field306 = Integer.parseInt(var5);
                        break;
                    case 3:
                        field303 = Integer.parseInt(var5);
                        break;
                    case 4:
                        Statics.field307 = (class180) class149.method2203(Statics.method814(), Integer.parseInt(var5));
                        if (Statics.field307 == class180.field2694) {
                            Statics.field245 = class229.field3247;
                        } else {
                            Statics.field245 = class229.field3255;
                        }
                    case 5:
                    case 11:
                    default:
                        break;
                    case 6:
                        Statics.field35 = var5;
                        break;
                    case 7:
                        field310 = Integer.parseInt(var5);
                        break;
                    case 8:
                        field304 = Integer.parseInt(var5);
                        break;
                    case 9:
                        Statics.field439 = Integer.parseInt(var5);
                        break;
                    case 10:
                        if (var5.equalsIgnoreCase(class38.field808)) {
                            field308 = true;
                        } else {
                            field308 = false;
                        }
                        break;
                    case 12:
                        int var6 = Integer.parseInt(var5);
                        class179[] var7 = new class179[] { class179.field2679, class179.field2681, class179.field2678, class179.field2680 };
                        class179[] var8 = var7;
                        int var9 = 0;
                        class179 var11;
                        while (true) {
                            if (var9 >= var8.length) {
                                var11 = null;
                                break;
                            }
                            class179 var10 = var8[var9];
                            if (var10.field2682 == var6) {
                                var11 = var10;
                                break;
                            }
                            var9++;
                        }
                        Statics.field305 = var11;
                        break;
                    case 13:
                        if (var5.equalsIgnoreCase(class38.field808)) {
                        }
                        break;
                    case 14:
                        Statics.field134 = Integer.parseInt(var5);
                        break;
                    case 15:
                        Statics.field311 = var5;
                }
            }
        }
        method2125();
        Statics.field1662 = this.getCodeBase().getHost();
        String var12 = Statics.field305.field2677;
        byte var13 = 0;
        try {
            class105.method3082("oldschool", var12, var13, 16);
        } catch (Exception var15) {
            class102.method811((String) null, var15);
        }
        Statics.field509 = this;
        this.method2049(765, 503, 135);
    }

    @ObfuscatedName("da.j(I)V")
    public static final void method2125() {
        class88.field1507 = false;
        field309 = false;
    }

    @ObfuscatedName("client.n(I)V")
    public final void method395() {
        Statics.field188 = field306 == 0 ? 43594 : field303 + 40000;
        Statics.field2159 = field306 == 0 ? 443 : field303 + 50000;
        Statics.field2000 = Statics.field188;
        Statics.field783 = class168.field2188;
        Statics.field1789 = class168.field2187;
        Statics.field2181 = class168.field2184;
        Statics.field953 = class168.field2186;
        class106.method151();
        class106.method3040(Statics.field1631);
        Canvas var1 = Statics.field1631;
        var1.addMouseListener(class116.field1813);
        var1.addMouseMotionListener(class116.field1813);
        var1.addFocusListener(class116.field1813);
        Statics.field260 = class113.method2046();
        if (Statics.field260 != null) {
            Statics.field260.method1989(Statics.field1631);
        }
        Statics.field2782 = new class117(255, class105.field1696, class105.field1697, 500000);
        Statics.field2736 = class31.method3023();
        Statics.field1811 = this.getToolkit().getSystemClipboard();
        class115.method701(this, Statics.field187);
        if (field306 != 0) {
            field322 = true;
        }
        method951(Statics.field2736.field717);
    }

    @ObfuscatedName("client.c(I)V")
    public final void method262() {
        field450++;
        this.method265();
        class184.method2865();
        try {
            if (class139.field1920 == 1) {
                int var1 = Statics.field1917.method2409();
                if (var1 > 0 && Statics.field1917.method2456()) {
                    int var2 = var1 - Statics.field1210;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field1917.method2408(var2);
                } else {
                    Statics.field1917.method2469();
                    Statics.field1917.method2491();
                    if (Statics.field2183 == null) {
                        class139.field1920 = 0;
                    } else {
                        class139.field1920 = 2;
                    }
                    Statics.field1922 = null;
                    Statics.field2683 = null;
                }
            }
        } catch (Exception var12) {
            var12.printStackTrace();
            Statics.field1917.method2469();
            class139.field1920 = 0;
            Statics.field1922 = null;
            Statics.field2683 = null;
            Statics.field2183 = null;
        }
        method92();
        class106.method243();
        class116 var4 = class116.field1813;
        synchronized (class116.field1813) {
            class116.field1795 = class116.field1810;
            class116.field1793 = class116.field1796;
            class116.field1800 = class116.field1803;
            class116.field1805 = class116.field1801;
            class116.field1797 = class116.field1802;
            class116.field1807 = class116.field1798;
            class116.field1808 = class116.field1804;
            class116.field1801 = 0;
        }
        if (Statics.field260 != null) {
            int var6 = Statics.field260.method1990();
            field504 = var6;
        }
        if (field313 == 0) {
            method1884();
            Statics.field2136.method1899();
            for (int var7 = 0; var7 < 32; var7++) {
                field1777[var7] = 0L;
            }
            for (int var8 = 0; var8 < 32; var8++) {
                field1772[var8] = 0L;
            }
            Statics.field945 = 0;
        } else if (field313 == 5) {
            class42.method253(this);
            method1884();
            Statics.field2136.method1899();
            for (int var9 = 0; var9 < 32; var9++) {
                field1777[var9] = 0L;
            }
            for (int var10 = 0; var10 < 32; var10++) {
                field1772[var10] = 0L;
            }
            Statics.field945 = 0;
        } else if (field313 == 10 || field313 == 11) {
            class42.method253(this);
        } else if (field313 == 20) {
            class42.method253(this);
            method203();
        } else if (field313 == 25) {
            method2984();
        }
        if (field313 == 30) {
            method803();
        } else if (field313 == 40 || field313 == 45) {
            method203();
        }
    }

    @ObfuscatedName("client.o(I)V")
    public final void method263() {
        boolean var1;
        label226: {
            try {
                if (class139.field1920 == 2) {
                    if (Statics.field1922 == null) {
                        Statics.field1922 = class145.method2580(Statics.field2183, Statics.field131, Statics.field1919);
                        if (Statics.field1922 == null) {
                            var1 = false;
                            break label226;
                        }
                    }
                    if (Statics.field2683 == null) {
                        Statics.field2683 = new class61(Statics.field1916, Statics.field1915);
                    }
                    if (Statics.field1917.method2492(Statics.field1922, Statics.field1918, Statics.field2683, 22050)) {
                        Statics.field1917.method2411();
                        Statics.field1917.method2408(Statics.field17);
                        Statics.field1917.method2436(Statics.field1922, Statics.field2164);
                        class139.field1920 = 0;
                        Statics.field1922 = null;
                        Statics.field2683 = null;
                        Statics.field2183 = null;
                        var1 = true;
                        break label226;
                    }
                }
            } catch (Exception var23) {
                var23.printStackTrace();
                Statics.field1917.method2469();
                class139.field1920 = 0;
                Statics.field1922 = null;
                Statics.field2683 = null;
                Statics.field2183 = null;
            }
            var1 = false;
        }
        if (var1 && field546 && Statics.field915 != null) {
            Statics.field915.method1133();
        }
        if (field313 == 10 || field313 == 20 || field313 == 30) {
            if (field567 != 0L && class156.method12() > field567) {
                method951(method98());
            } else if (field1783) {
                Canvas var4 = Statics.field1631;
                var4.removeKeyListener(class106.field1718);
                var4.removeFocusListener(class106.field1718);
                class106.field1727 = -1;
                Canvas var5 = Statics.field1631;
                var5.removeMouseListener(class116.field1813);
                var5.removeMouseMotionListener(class116.field1813);
                var5.removeFocusListener(class116.field1813);
                class116.field1810 = 0;
                if (Statics.field260 != null) {
                    Statics.field260.method1994(Statics.field1631);
                }
                Statics.field509.method2050();
                Statics.field1631.setBackground(Color.black);
                class106.method3040(Statics.field1631);
                Canvas var6 = Statics.field1631;
                var6.addMouseListener(class116.field1813);
                var6.addMouseMotionListener(class116.field1813);
                var6.addFocusListener(class116.field1813);
                if (Statics.field260 != null) {
                    Statics.field260.method1989(Statics.field1631);
                }
                if (field523 != -1) {
                    method792(false);
                }
                field1782 = true;
            }
        }
        Dimension var7 = this.method2057();
        if (Statics.field977 != var7.width || Statics.field620 != var7.height || field1782) {
            method194();
            field567 = class156.method12() + 500L;
            field1782 = false;
        }
        boolean var8 = false;
        if (field1784) {
            field1784 = false;
            var8 = true;
            for (int var9 = 0; var9 < 100; var9++) {
                field511[var9] = true;
            }
        }
        if (var8) {
            method612();
        }
        if (field313 == 0) {
            class114.method875(class42.field852, class42.field877, (Color) null, var8);
        } else if (field313 == 5) {
            class42.method861(Statics.field787, Statics.field155, Statics.field2652, var8);
        } else if (field313 == 10 || field313 == 11) {
            class42.method861(Statics.field787, Statics.field155, Statics.field2652, var8);
        } else if (field313 == 20) {
            class42.method861(Statics.field787, Statics.field155, Statics.field2652, var8);
        } else if (field313 == 25) {
            if (field365 == 1) {
                if (field361 > field487) {
                    field487 = field361;
                }
                int var10 = (field487 * 50 - field361 * 50) / field487;
                method204(class174.field2371 + class38.field811 + class38.field815 + var10 + "%" + class38.field809, false);
            } else if (field365 == 2) {
                if (field363 > field382) {
                    field382 = field363;
                }
                int var11 = (field382 * 50 - field363 * 50) / field382 + 50;
                method204(class174.field2371 + class38.field811 + class38.field815 + var11 + "%" + class38.field809, false);
            } else {
                method204(class174.field2371, false);
            }
        } else if (field313 == 30) {
            if (field523 != -1) {
                int var12 = field523;
                if (class170.method693(var12)) {
                    method82(Statics.field2197[var12], -1);
                }
            }
            for (int var13 = 0; var13 < field490; var13++) {
                if (field511[var13]) {
                    field427[var13] = true;
                }
                field488[var13] = field511[var13];
                field511[var13] = false;
            }
            field510 = field450;
            field455 = -1;
            field474 = -1;
            Statics.field1759 = null;
            if (field523 != -1) {
                field490 = 0;
                method205(field523, 0, 0, Statics.field759, Statics.field951, 0, 0, -1);
            }
            class220.method3859();
            if (field444) {
                method192();
            } else if (field455 != -1) {
                method3015(field455, field474);
            }
            if (field518 == 3) {
                for (int var14 = 0; var14 < field490; var14++) {
                    if (field488[var14]) {
                        class220.method3806(field514[var14], field485[var14], field516[var14], field421[var14], 16711935, 128);
                    } else if (field427[var14]) {
                        class220.method3806(field514[var14], field485[var14], field516[var14], field421[var14], 16711680, 128);
                    }
                }
            }
            class32.method2(Statics.field1569, Statics.field792.field638, Statics.field792.field625, field499);
            field499 = 0;
        } else if (field313 == 40) {
            method204(class174.field2372 + class38.field811 + class174.field2610, false);
        } else if (field313 == 45) {
            method204(class174.field2549, false);
        }
        if (field313 == 30 && field518 == 0 && !var8) {
            try {
                Graphics var15 = Statics.field1631.getGraphics();
                for (int var16 = 0; var16 < field490; var16++) {
                    if (field427[var16]) {
                        Statics.field691.method3791(var15, field514[var16], field485[var16], field516[var16], field421[var16]);
                        field427[var16] = false;
                    }
                }
            } catch (Exception var22) {
                Statics.field1631.repaint();
            }
        } else if (field313 > 0) {
            try {
                Graphics var18 = Statics.field1631.getGraphics();
                Statics.field691.method3802(var18, 0, 0);
                for (int var19 = 0; var19 < field490; var19++) {
                    field427[var19] = false;
                }
            } catch (Exception var21) {
                Statics.field1631.repaint();
            }
        }
    }

    @ObfuscatedName("client.s(I)V")
    public final void method264() {
        if (Statics.field232.method904()) {
            Statics.field232.method898();
        }
        if (Statics.field317 != null) {
            Statics.field317.field234 = false;
        }
        Statics.field317 = null;
        if (Statics.field2037 != null) {
            Statics.field2037.method2017();
            Statics.field2037 = null;
        }
        class106.method58();
        if (class116.field1813 != null) {
            class116 var1 = class116.field1813;
            synchronized (class116.field1813) {
                class116.field1813 = null;
            }
        }
        Statics.field260 = null;
        if (Statics.field915 != null) {
            Statics.field915.method1097();
        }
        if (Statics.field2190 != null) {
            Statics.field2190.method1097();
        }
        if (Statics.field2760 != null) {
            Statics.field2760.method2017();
        }
        class184.method568();
        class105.method237();
    }

    @ObfuscatedName("i.u(II)V")
    public static void method101(int arg0) {
        if (field313 == arg0) {
            return;
        }
        if (field313 == 0) {
            Statics.field66 = null;
            Statics.field2850 = null;
            Statics.field157 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field519 = 0;
            field362 = 0;
            field342 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2131 != null) {
            Statics.field2131.method2017();
            Statics.field2131 = null;
        }
        if (field313 == 25) {
            field365 = 0;
            field361 = 0;
            field487 = 1;
            field363 = 0;
            field382 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class42.method217(Statics.field1631, Statics.field822, Statics.field2168, true, 0);
        } else if (arg0 == 20) {
            class42.method217(Statics.field1631, Statics.field822, Statics.field2168, true, field313 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class42.method217(Statics.field1631, Statics.field822, Statics.field2168, false, 4);
        } else if (Statics.field842) {
            Statics.field872 = null;
            Statics.field3077 = null;
            Statics.field990 = null;
            Statics.field61 = null;
            Statics.field58 = null;
            Statics.field47 = null;
            Statics.field875 = null;
            Statics.field814 = null;
            Statics.field843 = null;
            Statics.field745 = null;
            Statics.field222 = null;
            Statics.field798 = null;
            Statics.field102 = null;
            Statics.field85 = null;
            Statics.field3129 = null;
            Statics.field723 = null;
            Statics.field62 = null;
            Statics.field848 = null;
            Statics.field855 = null;
            Statics.field243 = null;
            Statics.field873 = null;
            Statics.field1444 = null;
            class139.method2199(2);
            class186.method2036(true);
            Statics.field842 = false;
        }
        field313 = arg0;
    }

    @ObfuscatedName("client.b(B)V")
    public void method265() {
        if (field313 != 1000) {
            boolean var1 = class186.method2987();
            if (!var1) {
                this.method266();
            }
        }
    }

    @ObfuscatedName("client.v(B)V")
    public void method266() {
        if (class186.field2765 >= 4) {
            this.method2048("js5crc");
            field313 = 1000;
            return;
        }
        if (class186.field2766 >= 4) {
            if (field313 <= 5) {
                this.method2048("js5io");
                field313 = 1000;
                return;
            }
            field418 = 3000;
            class186.field2766 = 3;
        }
        if (--field418 + 1 > 0) {
            return;
        }
        try {
            if (field335 == 0) {
                Statics.field189 = Statics.field776.method1929(Statics.field1662, Statics.field2000);
                field335++;
            }
            if (field335 == 1) {
                if (Statics.field189.field1672 == 2) {
                    this.method267(-1);
                    return;
                }
                if (Statics.field189.field1672 == 1) {
                    field335++;
                }
            }
            if (field335 == 2) {
                Statics.field908 = new class111((Socket) Statics.field189.field1673, Statics.field776);
                class154 var1 = new class154(5);
                var1.method2751(15);
                var1.method2654(135);
                Statics.field908.method2013(var1.field2092, 0, 5);
                field335++;
                Statics.field293 = class156.method12();
            }
            if (field335 == 3) {
                if (field313 <= 5 || Statics.field908.method2027() > 0) {
                    int var2 = Statics.field908.method2015();
                    if (var2 != 0) {
                        this.method267(var2);
                        return;
                    }
                    field335++;
                } else if (class156.method12() - Statics.field293 > 30000L) {
                    this.method267(-2);
                    return;
                }
            }
            if (field335 == 4) {
                class111 var3 = Statics.field908;
                boolean var4 = field313 > 20;
                if (Statics.field2760 != null) {
                    try {
                        Statics.field2760.method2017();
                    } catch (Exception var14) {
                    }
                    Statics.field2760 = null;
                }
                Statics.field2760 = var3;
                class186.method2036(var4);
                class186.field2759.field2091 = 0;
                Statics.field2707 = null;
                Statics.field2002 = null;
                class186.field2749 = 0;
                while (true) {
                    class182 var6 = (class182) class186.field2757.method2264();
                    if (var6 == null) {
                        while (true) {
                            class182 var7 = (class182) class186.field2768.method2264();
                            if (var7 == null) {
                                if (class186.field2763 != 0) {
                                    try {
                                        class154 var8 = new class154(4);
                                        var8.method2751(4);
                                        var8.method2751(class186.field2763);
                                        var8.method2664(0);
                                        Statics.field2760.method2013(var8.field2092, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2760.method2017();
                                        } catch (Exception var12) {
                                        }
                                        class186.field2766++;
                                        Statics.field2760 = null;
                                    }
                                }
                                class186.field2748 = 0;
                                Statics.field2758 = class156.method12();
                                Statics.field189 = null;
                                Statics.field908 = null;
                                field335 = 0;
                                field407 = 0;
                                return;
                            }
                            class186.field2754.method2207(var7);
                            class186.field2755.method2261(var7, var7.field1882);
                            class186.field2752++;
                            class186.field2751--;
                        }
                    }
                    class186.field2750.method2261(var6, var6.field1882);
                    class186.field2764++;
                    class186.field2753--;
                }
            }
        } catch (IOException var15) {
            this.method267(-3);
        }
    }

    @ObfuscatedName("client.f(IB)V")
    public void method267(int arg0) {
        Statics.field189 = null;
        Statics.field908 = null;
        field335 = 0;
        if (Statics.field2000 == Statics.field188) {
            Statics.field2000 = Statics.field2159;
        } else {
            Statics.field2000 = Statics.field188;
        }
        field407++;
        if (field407 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field313 <= 5) {
                this.method2048("js5connect_full");
                field313 = 1000;
            } else {
                field418 = 3000;
            }
        } else if (field407 >= 2 && arg0 == 6) {
            this.method2048("js5connect_outofdate");
            field313 = 1000;
        } else if (field407 >= 4) {
            if (field313 <= 5) {
                this.method2048("js5connect");
                field313 = 1000;
            } else {
                field418 = 3000;
            }
        }
    }

    @ObfuscatedName("cb.z(B)V")
    public static void method1884() {
        if (field334 == 0) {
            Statics.field970 = new class88(4, 104, 104, class11.field114);
            for (int var0 = 0; var0 < 4; var0++) {
                field366[var0] = new class118(104, 104);
            }
            Statics.field184 = new class225(512, 512);
            class42.field877 = class174.field2382;
            class42.field852 = 5;
            field334 = 20;
        } else if (field334 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class85.field1469[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class88.method1725(var1, 500, 800, 512, 334);
            class42.field877 = class174.field2552;
            class42.field852 = 10;
            field334 = 30;
        } else if (field334 == 30) {
            Statics.field229 = method854(0, false, true, true);
            Statics.field24 = method854(1, false, true, true);
            Statics.field834 = method854(2, true, false, true);
            Statics.field1820 = method854(3, false, true, true);
            Statics.field337 = method854(4, false, true, true);
            Statics.field338 = method854(5, true, true, true);
            Statics.field128 = method854(6, true, true, false);
            Statics.field112 = method854(7, false, true, true);
            Statics.field2168 = method854(8, false, true, true);
            Statics.field1739 = method854(9, false, true, true);
            Statics.field822 = method854(10, false, true, true);
            Statics.field2045 = method854(11, false, true, true);
            Statics.field2014 = method854(12, false, true, true);
            Statics.field1 = method854(13, true, false, true);
            Statics.field255 = method854(14, false, true, false);
            Statics.field138 = method854(15, false, true, true);
            class42.field877 = class174.field2376;
            class42.field852 = 20;
            field334 = 40;
        } else if (field334 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field229.method3206() * 4 / 100;
            int var8 = var7 + Statics.field24.method3206() * 4 / 100;
            int var9 = var8 + Statics.field834.method3206() * 2 / 100;
            int var10 = var9 + Statics.field1820.method3206() * 2 / 100;
            int var11 = var10 + Statics.field337.method3206() * 6 / 100;
            int var12 = var11 + Statics.field338.method3206() * 4 / 100;
            int var13 = var12 + Statics.field128.method3206() * 2 / 100;
            int var14 = var13 + Statics.field112.method3206() * 60 / 100;
            int var15 = var14 + Statics.field2168.method3206() * 2 / 100;
            int var16 = var15 + Statics.field1739.method3206() * 2 / 100;
            int var17 = var16 + Statics.field822.method3206() * 2 / 100;
            int var18 = var17 + Statics.field2045.method3206() * 2 / 100;
            int var19 = var18 + Statics.field2014.method3206() * 2 / 100;
            int var20 = var19 + Statics.field1.method3206() * 2 / 100;
            int var21 = var20 + Statics.field255.method3206() * 2 / 100;
            int var22 = var21 + Statics.field138.method3206() * 2 / 100;
            if (var22 == 100) {
                class42.field877 = class174.field2378;
                class42.field852 = 30;
                field334 = 45;
            } else {
                if (var22 != 0) {
                    class42.field877 = class174.field2377 + var22 + "%";
                }
                class42.field852 = 30;
            }
        } else if (field334 == 45) {
            boolean var23 = !field309;
            Statics.field1062 = 22050;
            Statics.field1071 = var23;
            Statics.field1063 = 2;
            class140 var24 = new class140();
            var24.method2414(9, 128);
            Statics.field915 = class58.method780(Statics.field776, Statics.field1631, 0, 22050);
            Statics.field915.method1093(var24);
            class139.method3310(Statics.field138, Statics.field255, Statics.field337, var24);
            Statics.field2190 = class58.method780(Statics.field776, Statics.field1631, 1, 2048);
            Statics.field185 = new class52();
            Statics.field2190.method1093(Statics.field185);
            Statics.field707 = new class66(22050, Statics.field1062);
            class42.field877 = class174.field2606;
            class42.field852 = 35;
            field334 = 50;
        } else if (field334 == 50) {
            int var25 = 0;
            if (Statics.field155 == null) {
                Statics.field155 = class226.method1531(Statics.field2168, Statics.field1, "p11_full", "");
            } else {
                var25++;
            }
            if (Statics.field2652 == null) {
                Statics.field2652 = class226.method1531(Statics.field2168, Statics.field1, "p12_full", "");
            } else {
                var25++;
            }
            if (Statics.field787 == null) {
                Statics.field787 = class226.method1531(Statics.field2168, Statics.field1, "b12_full", "");
            } else {
                var25++;
            }
            if (var25 < 3) {
                class42.field877 = class174.field2404 + var25 * 100 / 3 + "%";
                class42.field852 = 40;
            } else {
                Statics.field1826 = new class231(true);
                class42.field877 = class174.field2381;
                class42.field852 = 40;
                field334 = 60;
            }
        } else if (field334 == 60) {
            int var26 = class42.method218(Statics.field822, Statics.field2168);
            int var27 = class42.method1445();
            if (var26 < var27) {
                class42.field877 = class174.field2581 + var26 * 100 / var27 + "%";
                class42.field852 = 50;
            } else {
                class42.field877 = class174.field2630;
                class42.field852 = 50;
                method101(5);
                field334 = 70;
            }
        } else if (field334 == 70) {
            if (Statics.field834.method3120()) {
                class201.method2009(Statics.field834);
                class192.method2886(Statics.field834);
                class185 var28 = Statics.field834;
                class185 var29 = Statics.field112;
                Statics.field2826 = var28;
                Statics.field2819 = var29;
                Statics.field3175 = Statics.field2826.method3126(3);
                class198.method2566(Statics.field834, Statics.field112, field309);
                class185 var30 = Statics.field834;
                class185 var31 = Statics.field112;
                Statics.field3006 = var30;
                Statics.field3004 = var31;
                class199.method2629(Statics.field834, Statics.field112, field308, Statics.field155);
                class202.method2572(Statics.field834, Statics.field229, Statics.field24);
                class185 var32 = Statics.field834;
                class185 var33 = Statics.field112;
                Statics.field2029 = var32;
                Statics.field7 = var33;
                class195.method684(Statics.field834);
                class188.method3092(Statics.field834);
                class185 var34 = Statics.field1820;
                class185 var35 = Statics.field112;
                class185 var36 = Statics.field2168;
                class185 var37 = Statics.field1;
                Statics.field2272 = var34;
                Statics.field2242 = var35;
                Statics.field2198 = var36;
                Statics.field2199 = var37;
                Statics.field2197 = new class170[Statics.field2272.method3127()][];
                Statics.field2195 = new boolean[Statics.field2272.method3127()];
                class187.method158(Statics.field834);
                class196.method783(Statics.field834);
                class185 var38 = Statics.field834;
                Statics.field2790 = var38;
                class185 var39 = Statics.field834;
                Statics.field2794 = var39;
                Statics.field232 = new class47();
                class197.method2983(Statics.field834, Statics.field2168, Statics.field1);
                class185 var40 = Statics.field834;
                class185 var41 = Statics.field2168;
                Statics.field2838 = var40;
                Statics.field2834 = var41;
                class42.field877 = class174.field2438;
                class42.field852 = 60;
                field334 = 80;
            } else {
                class42.field877 = class174.field2384 + Statics.field834.method3211() + "%";
                class42.field852 = 60;
            }
        } else if (field334 == 80) {
            int var42 = 0;
            if (Statics.field2796 == null) {
                class185 var43 = Statics.field2168;
                int var44 = var43.method3148("compass");
                int var45 = var43.method3132(var44, "");
                class225 var46 = class226.method3118(var43, var44, var45);
                Statics.field2796 = var46;
            } else {
                var42++;
            }
            if (Statics.field133 == null) {
                class185 var47 = Statics.field2168;
                int var48 = var47.method3148("mapedge");
                int var49 = var47.method3132(var48, "");
                class225 var50 = class226.method3118(var47, var48, var49);
                Statics.field133 = var50;
            } else {
                var42++;
            }
            if (Statics.field742 == null) {
                Statics.field742 = class226.method1887(Statics.field2168, "mapscene", "");
            } else {
                var42++;
            }
            if (Statics.field1356 == null) {
                Statics.field1356 = class226.method708(Statics.field2168, "mapfunction", "");
            } else {
                var42++;
            }
            if (Statics.field727 == null) {
                Statics.field727 = class226.method708(Statics.field2168, "headicons_pk", "");
            } else {
                var42++;
            }
            if (Statics.field126 == null) {
                Statics.field126 = class226.method708(Statics.field2168, "headicons_prayer", "");
            } else {
                var42++;
            }
            if (Statics.field2673 == null) {
                Statics.field2673 = class226.method708(Statics.field2168, "headicons_hint", "");
            } else {
                var42++;
            }
            if (Statics.field710 == null) {
                Statics.field710 = class226.method708(Statics.field2168, "mapmarker", "");
            } else {
                var42++;
            }
            if (Statics.field57 == null) {
                Statics.field57 = class226.method708(Statics.field2168, "cross", "");
            } else {
                var42++;
            }
            if (Statics.field132 == null) {
                Statics.field132 = class226.method708(Statics.field2168, "mapdots", "");
            } else {
                var42++;
            }
            if (Statics.field285 == null) {
                Statics.field285 = class226.method1887(Statics.field2168, "scrollbar", "");
            } else {
                var42++;
            }
            if (Statics.field216 == null) {
                Statics.field216 = class226.method1887(Statics.field2168, "mod_icons", "");
            } else {
                var42++;
            }
            if (var42 < 12) {
                class42.field877 = class174.field2386 + var42 * 100 / 12 + "%";
                class42.field852 = 70;
            } else {
                Statics.field3109 = Statics.field216;
                Statics.field133.method3955();
                int var51 = (int) (Math.random() * 21.0D) - 10;
                int var52 = (int) (Math.random() * 21.0D) - 10;
                int var53 = (int) (Math.random() * 21.0D) - 10;
                int var54 = (int) (Math.random() * 41.0D) - 20;
                for (int var55 = 0; var55 < Statics.field1356.length; var55++) {
                    Statics.field1356[var55].method3986(var51 + var54, var52 + var54, var53 + var54);
                }
                Statics.field742[0].method3891(var51 + var54, var52 + var54, var53 + var54);
                class42.field877 = class174.field2387;
                class42.field852 = 70;
                field334 = 90;
            }
        } else if (field334 == 90) {
            if (Statics.field1739.method3120()) {
                class75 var56 = new class75(Statics.field1739, Statics.field2168, 20, 0.8D, field309 ? 64 : 128);
                class85.method1625(var56);
                class85.method1626(0.8D);
                class42.field877 = class174.field2587;
                class42.field852 = 90;
                field334 = 110;
            } else {
                class42.field877 = class174.field2388 + Statics.field1739.method3211() + "%";
                class42.field852 = 90;
            }
        } else if (field334 == 110) {
            Statics.field317 = new class21();
            Statics.field776.method1930(Statics.field317, 10);
            class42.field877 = class174.field2390;
            class42.field852 = 94;
            field334 = 120;
        } else if (field334 == 120) {
            if (Statics.field822.method3134("huffman", "")) {
                class146 var57 = new class146(Statics.field822.method3151("huffman", ""));
                class211.method1931(var57);
                class42.field877 = class174.field2392;
                class42.field852 = 96;
                field334 = 130;
            } else {
                class42.field877 = class174.field2391 + "%";
                class42.field852 = 96;
            }
        } else if (field334 == 130) {
            if (!Statics.field1820.method3120()) {
                class42.field877 = class174.field2393 + Statics.field1820.method3211() * 4 / 5 + "%";
                class42.field852 = 100;
            } else if (!Statics.field2014.method3120()) {
                class42.field877 = class174.field2393 + (80 + Statics.field2014.method3211() / 6) + "%";
                class42.field852 = 100;
            } else if (Statics.field1.method3120()) {
                class42.field877 = class174.field2394;
                class42.field852 = 100;
                field334 = 140;
            } else {
                class42.field877 = class174.field2393 + (96 + Statics.field1.method3211() / 20) + "%";
                class42.field852 = 100;
            }
        } else if (field334 == 140) {
            method101(10);
        }
    }

    @ObfuscatedName("ak.t(IZZZI)Lge;")
    public static class185 method854(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class117 var4 = null;
        if (class105.field1696 != null) {
            var4 = new class117(arg0, class105.field1696, Statics.field1223[arg0], 1000000);
        }
        return new class185(var4, Statics.field2782, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("w.y(I)V")
    public static final void method203() {
        try {
            if (field519 == 0) {
                if (Statics.field2037 != null) {
                    Statics.field2037.method2017();
                    Statics.field2037 = null;
                }
                Statics.field144 = null;
                field388 = false;
                field362 = 0;
                field519 = 1;
            }
            if (field519 == 1) {
                if (Statics.field144 == null) {
                    Statics.field144 = Statics.field776.method1929(Statics.field1662, Statics.field2000);
                }
                if (Statics.field144.field1672 == 2) {
                    throw new IOException();
                }
                if (Statics.field144.field1672 == 1) {
                    Statics.field2037 = new class111((Socket) Statics.field144.field1673, Statics.field776);
                    Statics.field144 = null;
                    field519 = 2;
                }
            }
            if (field519 == 2) {
                field349.field2091 = 0;
                field349.method2751(14);
                Statics.field2037.method2013(field349.field2092, 0, 1);
                field351.field2091 = 0;
                field519 = 3;
            }
            if (field519 == 3) {
                if (Statics.field915 != null) {
                    Statics.field915.method1095();
                }
                if (Statics.field2190 != null) {
                    Statics.field2190.method1095();
                }
                int var0 = Statics.field2037.method2015();
                if (Statics.field915 != null) {
                    Statics.field915.method1095();
                }
                if (Statics.field2190 != null) {
                    Statics.field2190.method1095();
                }
                if (var0 != 0) {
                    method3233(var0);
                    return;
                }
                field351.field2091 = 0;
                field519 = 5;
            }
            if (field519 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field349.field2091 = 0;
                field349.method2751(1);
                field349.method2751(class42.field866.method815());
                field349.method2654(var1[0]);
                field349.method2654(var1[1]);
                field349.method2654(var1[2]);
                field349.method2654(var1[3]);
                switch(class42.field866.field1638) {
                    case 0:
                        field349.field2091 += 8;
                        break;
                    case 1:
                        field349.method2654((Integer) Statics.field2736.field718.get(class208.method251(class42.field864)));
                        field349.field2091 += 4;
                        break;
                    case 2:
                    case 3:
                        field349.method2794(Statics.field1729);
                        field349.field2091 += 5;
                }
                field349.method2657(class42.field865);
                field349.method2661(class40.field826, class40.field828);
                field458.field2091 = 0;
                if (field313 == 40) {
                    field458.method2751(18);
                } else {
                    field458.method2751(16);
                }
                field458.method2664(0);
                int var2 = field458.field2091;
                field458.method2654(135);
                field458.method2660(field349.field2092, 0, field349.field2091);
                int var3 = field458.field2091;
                field458.method2657(class42.field864);
                field458.method2751((field520 ? 1 : 0) << 1 | (field309 ? 1 : 0));
                field458.method2664(Statics.field759);
                field458.method2664(Statics.field951);
                class160 var4 = field458;
                byte[] var5 = new byte[24];
                try {
                    class105.field1693.method1388(0L);
                    class105.field1693.method1381(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var46) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2660(var5, 0, 24);
                field458.method2657(Statics.field311);
                field458.method2654(Statics.field134);
                class154 var9 = new class154(Statics.field1826.method4068());
                Statics.field1826.method4066(var9);
                field458.method2660(var9.field2092, 0, var9.field2092.length);
                field458.method2751(Statics.field439);
                field458.method2654(0);
                field458.method2654(Statics.field229.field2722);
                field458.method2654(Statics.field24.field2722);
                field458.method2654(Statics.field834.field2722);
                field458.method2654(Statics.field1820.field2722);
                field458.method2654(Statics.field337.field2722);
                field458.method2654(Statics.field338.field2722);
                field458.method2654(Statics.field128.field2722);
                field458.method2654(Statics.field112.field2722);
                field458.method2654(Statics.field2168.field2722);
                field458.method2654(Statics.field1739.field2722);
                field458.method2654(Statics.field822.field2722);
                field458.method2654(Statics.field2045.field2722);
                field458.method2654(Statics.field2014.field2722);
                field458.method2654(Statics.field1.field2722);
                field458.method2654(Statics.field255.field2722);
                field458.method2654(Statics.field138.field2722);
                field458.method2685(var1, var3, field458.field2091);
                field458.method2662(field458.field2091 - var2);
                Statics.field2037.method2013(field458.field2092, 0, field458.field2091);
                field349.method2893(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field351.method2893(var1);
                field519 = 6;
            }
            if (field519 == 6 && Statics.field2037.method2027() > 0) {
                int var11 = Statics.field2037.method2015();
                if (var11 == 21 && field313 == 20) {
                    field519 = 7;
                } else if (var11 == 2) {
                    field519 = 9;
                } else if (var11 == 15 && field313 == 40) {
                    field352 = -1;
                    field519 = 13;
                } else if (var11 == 23 && field342 < 1) {
                    field342++;
                    field519 = 0;
                } else if (var11 == 29) {
                    field519 = 11;
                } else {
                    method3233(var11);
                    return;
                }
            }
            if (field519 == 7 && Statics.field2037.method2027() > 0) {
                field343 = (Statics.field2037.method2015() + 3) * 60;
                field519 = 8;
            }
            if (field519 == 8) {
                field362 = 0;
                class42.method2397(class174.field2398, class174.field2471, field343 / 60 + class174.field2399);
                if (--field343 <= 0) {
                    field519 = 0;
                }
            } else {
                if (field519 == 9 && Statics.field2037.method2027() >= 13) {
                    boolean var12 = Statics.field2037.method2015() == 1;
                    Statics.field2037.method2016(field351.field2092, 0, 4);
                    field351.field2091 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field351.method2892() << 24;
                        int var15 = var14 | field351.method2892() << 16;
                        int var16 = var15 | field351.method2892() << 8;
                        int var17 = var16 | field351.method2892();
                        int var18 = class208.method251(class42.field864);
                        if (Statics.field2736.field718.size() >= 10 && !Statics.field2736.field718.containsKey(var18)) {
                            Iterator var19 = Statics.field2736.field718.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field2736.field718.put(var18, var17);
                        class31.method1906();
                    }
                    field473 = Statics.field2037.method2015();
                    field475 = Statics.field2037.method2015() == 1;
                    field557 = Statics.field2037.method2015();
                    field557 <<= 0x8;
                    field557 += Statics.field2037.method2015();
                    field428 = Statics.field2037.method2015();
                    Statics.field2037.method2016(field351.field2092, 0, 1);
                    field351.field2091 = 0;
                    field353 = field351.method2892();
                    Statics.field2037.method2016(field351.field2092, 0, 2);
                    field351.field2091 = 0;
                    field352 = field351.method2668();
                    try {
                        class101.method1908(Statics.field509, "zap");
                    } catch (Throwable var45) {
                    }
                    field519 = 10;
                }
                if (field519 != 10) {
                    if (field519 == 11 && Statics.field2037.method2027() >= 2) {
                        field351.field2091 = 0;
                        Statics.field2037.method2016(field351.field2092, 0, 2);
                        field351.field2091 = 0;
                        Statics.field1649 = field351.method2668();
                        field519 = 12;
                    }
                    if (field519 == 12 && Statics.field2037.method2027() >= Statics.field1649) {
                        field351.field2091 = 0;
                        Statics.field2037.method2016(field351.field2092, 0, Statics.field1649);
                        field351.field2091 = 0;
                        String var36 = field351.method2701();
                        String var37 = field351.method2701();
                        String var38 = field351.method2701();
                        class42.method2397(var36, var37, var38);
                        method101(10);
                    }
                    if (field519 == 13) {
                        if (field352 == -1) {
                            if (Statics.field2037.method2027() < 2) {
                                return;
                            }
                            Statics.field2037.method2016(field351.field2092, 0, 2);
                            field351.field2091 = 0;
                            field352 = field351.method2668();
                        }
                        if (Statics.field2037.method2027() >= field352) {
                            Statics.field2037.method2016(field351.field2092, 0, field352);
                            field351.field2091 = 0;
                            int var39 = field352;
                            field349.field2091 = 0;
                            field351.field2091 = 0;
                            field353 = -1;
                            field356 = -1;
                            field357 = -1;
                            field575 = -1;
                            field352 = 0;
                            field560 = 0;
                            field323 = 0;
                            method2647();
                            field565 = 0;
                            field540 = 0;
                            for (int var40 = 0; var40 < 2048; var40++) {
                                field426[var40] = null;
                            }
                            Statics.field792 = null;
                            for (int var41 = 0; var41 < field484.length; var41++) {
                                class36 var42 = field484[var41];
                                if (var42 != null) {
                                    var42.field650 = -1;
                                    var42.field651 = false;
                                }
                            }
                            class13.field145 = new class126(32);
                            method101(30);
                            for (int var43 = 0; var43 < 100; var43++) {
                                field511[var43] = true;
                            }
                            method97();
                            class46.method864(field351);
                            if (field351.field2091 != var39) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field362++;
                        if (field362 > 2000) {
                            if (field342 < 1) {
                                if (Statics.field2000 == Statics.field188) {
                                    Statics.field2000 = Statics.field2159;
                                } else {
                                    Statics.field2000 = Statics.field188;
                                }
                                field342++;
                                field519 = 0;
                            } else {
                                method3233(-3);
                            }
                        }
                    }
                } else if (Statics.field2037.method2027() >= field352) {
                    field351.field2091 = 0;
                    Statics.field2037.method2016(field351.field2092, 0, field352);
                    field316 = -1L;
                    field465 = -1;
                    Statics.field317.field227 = 0;
                    Statics.field1109 = true;
                    field321 = true;
                    field420 = -1L;
                    class228.field3246 = new class127();
                    field349.field2091 = 0;
                    field351.field2091 = 0;
                    field353 = -1;
                    field356 = -1;
                    field357 = -1;
                    field575 = -1;
                    field560 = 0;
                    field323 = 0;
                    field359 = 0;
                    field552 = 0;
                    method2647();
                    class116.field1794 = 0;
                    class48.method3108();
                    field459 = 0;
                    field512 = false;
                    field548 = 0;
                    field482 = (int) (Math.random() * 100.0D) - 50;
                    field372 = (int) (Math.random() * 110.0D) - 55;
                    field340 = (int) (Math.random() * 80.0D) - 40;
                    field354 = (int) (Math.random() * 120.0D) - 60;
                    field390 = (int) (Math.random() * 30.0D) - 20;
                    field527 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field565 = 0;
                    field535 = -1;
                    field540 = 0;
                    field541 = 0;
                    field332 = class41.field837;
                    field333 = class41.field837;
                    field341 = 0;
                    class46.field922 = 0;
                    for (int var21 = 0; var21 < 2048; var21++) {
                        class46.field921[var21] = null;
                        class46.field924[var21] = 1;
                    }
                    for (int var22 = 0; var22 < 2048; var22++) {
                        field426[var22] = null;
                    }
                    for (int var23 = 0; var23 < 32768; var23++) {
                        field484[var23] = null;
                    }
                    field435 = -1;
                    field438.method2313();
                    field419.method2313();
                    for (int var24 = 0; var24 < 4; var24++) {
                        for (int var25 = 0; var25 < 104; var25++) {
                            for (int var26 = 0; var26 < 104; var26++) {
                                field449[var24][var25][var26] = null;
                            }
                        }
                    }
                    field437 = new class129();
                    field574 = 0;
                    field573 = 0;
                    field577 = 0;
                    for (int var27 = 0; var27 < Statics.field2783; var27++) {
                        class188 var28 = class188.method3169(var27);
                        if (var28 != null) {
                            class166.field2162[var27] = 0;
                            class166.field2163[var27] = 0;
                        }
                    }
                    Statics.field232.method896();
                    field515 = -1;
                    if (field523 != -1) {
                        int var29 = field523;
                        if (var29 != -1 && Statics.field2195[var29]) {
                            Statics.field2272.method3128(var29);
                            if (Statics.field2197[var29] != null) {
                                boolean var30 = true;
                                for (int var31 = 0; var31 < Statics.field2197[var29].length; var31++) {
                                    if (Statics.field2197[var29][var31] != null) {
                                        if (Statics.field2197[var29][var31].field2208 == 2) {
                                            var30 = false;
                                        } else {
                                            Statics.field2197[var29][var31] = null;
                                        }
                                    }
                                }
                                if (var30) {
                                    Statics.field2197[var29] = null;
                                }
                                Statics.field2195[var29] = false;
                            }
                        }
                    }
                    for (class18 var32 = (class18) field467.method2264(); var32 != null; var32 = (class18) field467.method2272()) {
                        method669(var32, true);
                    }
                    field523 = -1;
                    field467 = new class126(8);
                    field470 = null;
                    method2647();
                    field433.method2993((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var33 = 0; var33 < 8; var33++) {
                        field432[var33] = null;
                        field375[var33] = false;
                    }
                    class13.field145 = new class126(32);
                    field374 = true;
                    for (int var34 = 0; var34 < 100; var34++) {
                        field511[var34] = true;
                    }
                    method97();
                    field533 = null;
                    Statics.field273 = 0;
                    Statics.field1205 = null;
                    for (int var35 = 0; var35 < 8; var35++) {
                        field582[var35] = new class5();
                    }
                    Statics.field1704 = null;
                    class46.method864(field351);
                    Statics.field2036 = -1;
                    method250(false);
                    field353 = -1;
                }
            }
        } catch (IOException var47) {
            if (field342 < 1) {
                if (Statics.field2000 == Statics.field188) {
                    Statics.field2000 = Statics.field2159;
                } else {
                    Statics.field2000 = Statics.field188;
                }
                field342++;
                field519 = 0;
            } else {
                method3233(-2);
            }
        }
    }

    @ObfuscatedName("gl.w(II)V")
    public static void method3233(int arg0) {
        if (arg0 == -3) {
            class42.method2397(class174.field2401, class174.field2495, class174.field2403);
        } else if (arg0 == -2) {
            class42.method2397(class174.field2590, class174.field2432, class174.field2406);
        } else if (arg0 == -1) {
            class42.method2397(class174.field2407, class174.field2400, class174.field2374);
        } else if (arg0 == 3) {
            class42.field859 = 3;
        } else if (arg0 == 4) {
            class42.method2397(class174.field2389, class174.field2411, class174.field2412);
        } else if (arg0 == 5) {
            class42.method2397(class174.field2413, class174.field2414, class174.field2617);
        } else if (arg0 == 6) {
            class42.method2397(class174.field2416, class174.field2417, class174.field2510);
        } else if (arg0 == 7) {
            class42.method2397(class174.field2459, class174.field2420, class174.field2496);
        } else if (arg0 == 8) {
            class42.method2397(class174.field2422, class174.field2375, class174.field2487);
        } else if (arg0 == 9) {
            class42.method2397(class174.field2577, class174.field2405, class174.field2427);
        } else if (arg0 == 10) {
            class42.method2397(class174.field2428, class174.field2429, class174.field2430);
        } else if (arg0 == 11) {
            class42.method2397(class174.field2440, class174.field2468, class174.field2433);
        } else if (arg0 == 12) {
            class42.method2397(class174.field2380, class174.field2435, class174.field2436);
        } else if (arg0 == 13) {
            class42.method2397(class174.field2437, class174.field2363, class174.field2439);
        } else if (arg0 == 14) {
            class42.method2397(class174.field2383, class174.field2423, class174.field2442);
        } else if (arg0 == 16) {
            class42.method2397(class174.field2443, class174.field2410, class174.field2445);
        } else if (arg0 == 17) {
            class42.method2397(class174.field2446, class174.field2554, class174.field2448);
        } else if (arg0 == 18) {
            class42.method2397(class174.field2449, class174.field2450, class174.field2451);
        } else if (arg0 == 19) {
            class42.method2397(class174.field2452, class174.field2453, class174.field2454);
        } else if (arg0 == 20) {
            class42.method2397(class174.field2455, class174.field2456, class174.field2457);
        } else if (arg0 == 22) {
            class42.method2397(class174.field2458, class174.field2508, class174.field2460);
        } else if (arg0 == 23) {
            class42.method2397(class174.field2461, class174.field2462, class174.field2463);
        } else if (arg0 == 24) {
            class42.method2397(class174.field2464, class174.field2465, class174.field2466);
        } else if (arg0 == 25) {
            class42.method2397(class174.field2467, class174.field2385, class174.field2469);
        } else if (arg0 == 26) {
            class42.method2397(class174.field2470, class174.field2624, class174.field2472);
        } else if (arg0 == 27) {
            class42.method2397(class174.field2473, class174.field2474, class174.field2475);
        } else if (arg0 == 31) {
            class42.method2397(class174.field2482, class174.field2499, class174.field2484);
        } else if (arg0 == 32) {
            class42.method2397(class174.field2485, class174.field2486, class174.field2625);
        } else if (arg0 == 37) {
            class42.method2397(class174.field2488, class174.field2489, class174.field2530);
        } else if (arg0 == 38) {
            class42.method2397(class174.field2491, class174.field2492, class174.field2493);
        } else if (arg0 == 55) {
            class42.method2397(class174.field2544, class174.field2490, class174.field2415);
        } else if (arg0 == 56) {
            class42.method2397(class174.field2497, class174.field2498, class174.field2362);
            method101(11);
            return;
        } else if (arg0 == 57) {
            class42.method2397(class174.field2500, class174.field2501, class174.field2502);
            method101(11);
            return;
        } else {
            class42.method2397(class174.field2503, class174.field2504, class174.field2364);
        }
        method101(10);
    }

    @ObfuscatedName("r.a(I)V")
    public static final void method74() {
        if (Statics.field2037 != null) {
            Statics.field2037.method2017();
            Statics.field2037 = null;
        }
        method3138();
        Statics.field970.method1683();
        for (int var0 = 0; var0 < 4; var0++) {
            field366[var0].method2170();
        }
        System.gc();
        class139.method2199(2);
        field422 = -1;
        field546 = false;
        class32.method2126();
        method101(10);
    }

    @ObfuscatedName("gj.k(I)V")
    public static final void method3138() {
        class201.method3031();
        class192.field2818.method2249();
        class193.method2988();
        class198.method608();
        class200.method185();
        class199.method224();
        class202.method632();
        class191.method2005();
        class195.field2853.method2249();
        class188.field2780.method2249();
        class197.field2871.method2249();
        class197.field2876.method2249();
        class197.field2873.method2249();
        class194.field2835.method2249();
        class194.field2836.method2249();
        class167.method209();
        class170.method2097();
        ((class75) Statics.field1466).method1426();
        class49.field971.method2249();
        Statics.field229.method3129();
        Statics.field24.method3129();
        Statics.field1820.method3129();
        Statics.field337.method3129();
        Statics.field338.method3129();
        Statics.field128.method3129();
        Statics.field112.method3129();
        Statics.field2168.method3129();
        Statics.field1739.method3129();
        Statics.field822.method3129();
        Statics.field2045.method3129();
        Statics.field2014.method3129();
    }

    @ObfuscatedName("as.l(I)V")
    public static final void method803() {
        if (field323 > 1) {
            field323--;
        }
        if (field359 > 0) {
            field359--;
        }
        if (field388) {
            field388 = false;
            if (field359 > 0) {
                method74();
            } else {
                method101(40);
                Statics.field2131 = Statics.field2037;
                Statics.field2037 = null;
            }
            return;
        }
        if (!field444) {
            method2647();
            field417[0] = class174.field2598;
            field451[0] = "";
            field448[0] = 1006;
            field578 = 1;
        }
        for (int var0 = 0; var0 < 100 && method1882(); var0++) {
        }
        if (field313 != 30) {
            return;
        }
        while (true) {
            class227 var1 = (class227) class228.field3246.method2281();
            boolean var2;
            if (var1 == null) {
                var2 = false;
            } else {
                var2 = true;
            }
            if (!var2) {
                Object var4 = Statics.field317.field226;
                synchronized (Statics.field317.field226) {
                    if (!field302) {
                        Statics.field317.field227 = 0;
                    } else if (class116.field1805 != 0 || Statics.field317.field227 >= 40) {
                        field349.method2896(98);
                        field349.method2751(0);
                        int var5 = field349.field2091;
                        int var6 = 0;
                        for (int var7 = 0; var7 < Statics.field317.field227 && field349.field2091 - var5 < 240; var7++) {
                            var6++;
                            int var8 = Statics.field317.field225[var7];
                            if (var8 < 0) {
                                var8 = 0;
                            } else if (var8 > 502) {
                                var8 = 502;
                            }
                            int var9 = Statics.field317.field235[var7];
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > 764) {
                                var9 = 764;
                            }
                            int var10 = var8 * 765 + var9;
                            if (Statics.field317.field225[var7] == -1 && Statics.field317.field235[var7] == -1) {
                                var9 = -1;
                                var8 = -1;
                                var10 = 524287;
                            }
                            if (field476 != var9 || field319 != var8) {
                                int var11 = var9 - field476;
                                field476 = var9;
                                int var12 = var8 - field319;
                                field319 = var8;
                                if (field465 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                    var11 += 32;
                                    var12 += 32;
                                    field349.method2664((field465 << 12) + (var11 << 6) + var12);
                                    field465 = 0;
                                } else if (field465 < 8) {
                                    field349.method2794((field465 << 19) + 8388608 + var10);
                                    field465 = 0;
                                } else {
                                    field349.method2654((field465 << 19) + -1073741824 + var10);
                                    field465 = 0;
                                }
                            } else if (field465 < 2047) {
                                field465++;
                            }
                        }
                        field349.method2663(field349.field2091 - var5);
                        if (var6 >= Statics.field317.field227) {
                            Statics.field317.field227 = 0;
                        } else {
                            Statics.field317.field227 -= var6;
                            for (int var13 = 0; var13 < Statics.field317.field227; var13++) {
                                Statics.field317.field235[var13] = Statics.field317.field235[var6 + var13];
                                Statics.field317.field225[var13] = Statics.field317.field225[var6 + var13];
                            }
                        }
                    }
                }
                if (class116.field1805 == 1 || !Statics.field174 && class116.field1805 == 4 || class116.field1805 == 2) {
                    long var15 = (class116.field1808 - field316) / 50L;
                    if (var15 > 4095L) {
                        var15 = 4095L;
                    }
                    field316 = class116.field1808;
                    int var17 = class116.field1807;
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (var17 > Statics.field951) {
                        var17 = Statics.field951;
                    }
                    int var18 = class116.field1797;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > Statics.field759) {
                        var18 = Statics.field759;
                    }
                    int var19 = (int) var15;
                    field349.method2896(187);
                    field349.method2664((class116.field1805 == 2 ? 1 : 0) + (var19 << 1));
                    field349.method2664(var18);
                    field349.method2664(var17);
                }
                if (class106.field1721 > 0) {
                    field349.method2896(116);
                    field349.method2664(0);
                    int var20 = field349.field2091;
                    long var21 = class156.method12();
                    for (int var23 = 0; var23 < class106.field1721; var23++) {
                        long var24 = var21 - field420;
                        if (var24 > 16777215L) {
                            var24 = 16777215L;
                        }
                        field420 = var21;
                        field349.method2690(class106.field1720[var23]);
                        field349.method2705((int) var24);
                    }
                    field349.method2662(field349.field2091 - var20);
                }
                if (field396 > 0) {
                    field396--;
                }
                if (class106.field1714[96] || class106.field1714[97] || class106.field1714[98] || class106.field1714[99]) {
                    field397 = true;
                }
                if (field397 && field396 <= 0) {
                    field396 = 20;
                    field397 = false;
                    field349.method2896(216);
                    field349.method2664(field527);
                    field349.method2695(field542);
                }
                if (Statics.field1109 && !field321) {
                    field321 = true;
                    field349.method2896(174);
                    field349.method2751(1);
                }
                if (!Statics.field1109 && field321) {
                    field321 = false;
                    field349.method2896(174);
                    field349.method2751(0);
                }
                if (Statics.field1569 != field535) {
                    field535 = Statics.field1569;
                    method813(Statics.field1569);
                }
                if (field313 != 30) {
                    return;
                }
                for (class26 var26 = (class26) field437.method2319(); var26 != null; var26 = (class26) field437.method2333()) {
                    if (var26.field604 > 0) {
                        var26.field604--;
                    }
                    if (var26.field604 != 0) {
                        if (var26.field603 > 0) {
                            var26.field603--;
                        }
                        if (var26.field603 == 0 && var26.field599 >= 1 && var26.field596 >= 1 && var26.field599 <= 102 && var26.field596 <= 102 && (var26.field600 < 0 || class11.method2507(var26.field600, var26.field609))) {
                            method188(var26.field595, var26.field594, var26.field599, var26.field596, var26.field600, var26.field601, var26.field609);
                            var26.field603 = -1;
                            if (var26.field600 == var26.field597 && var26.field597 == -1) {
                                var26.method2310();
                            } else if (var26.field600 == var26.field597 && var26.field601 == var26.field598 && var26.field609 == var26.field602) {
                                var26.method2310();
                            }
                        }
                    } else if (var26.field597 < 0 || class11.method2507(var26.field597, var26.field602)) {
                        method188(var26.field595, var26.field594, var26.field599, var26.field596, var26.field597, var26.field598, var26.field602);
                        var26.method2310();
                    }
                }
                int var10002;
                for (int var27 = 0; var27 < field548; var27++) {
                    var10002 = field551[var27]--;
                    if (field551[var27] >= -10) {
                        class54 var29 = field350[var27];
                        if (var29 == null) {
                            class54 var10000 = (class54) null;
                            var29 = class54.method1022(Statics.field337, field549[var27], 0);
                            if (var29 == null) {
                                continue;
                            }
                            field551[var27] += var29.method1025();
                            field350[var27] = var29;
                        }
                        if (field551[var27] < 0) {
                            int var36;
                            if (field556[var27] == 0) {
                                var36 = field480;
                            } else {
                                int var30 = (field556[var27] & 0xFF) * 128;
                                int var31 = field556[var27] >> 16 & 0xFF;
                                int var32 = var31 * 128 + 64 - Statics.field792.field638;
                                if (var32 < 0) {
                                    var32 = -var32;
                                }
                                int var33 = field556[var27] >> 8 & 0xFF;
                                int var34 = var33 * 128 + 64 - Statics.field792.field625;
                                if (var34 < 0) {
                                    var34 = -var34;
                                }
                                int var35 = var32 + var34 - 128;
                                if (var35 > var30) {
                                    field551[var27] = -100;
                                    continue;
                                }
                                if (var35 < 0) {
                                    var35 = 0;
                                }
                                var36 = field547 * (var30 - var35) / var30;
                            }
                            if (var36 > 0) {
                                class56 var37 = var29.method1023().method1067(Statics.field707);
                                class67 var38 = class67.method1200(var37, 100, var36);
                                var38.method1208(field550[var27] - 1);
                                Statics.field185.method968(var38);
                            }
                            field551[var27] = -100;
                        }
                    } else {
                        field548--;
                        for (int var28 = var27; var28 < field548; var28++) {
                            field549[var28] = field549[var28 + 1];
                            field350[var28] = field350[var28 + 1];
                            field550[var28] = field550[var28 + 1];
                            field551[var28] = field551[var28 + 1];
                            field556[var28] = field556[var28 + 1];
                        }
                        var27--;
                    }
                }
                if (field546) {
                    boolean var39;
                    if (class139.field1920 == 0) {
                        var39 = Statics.field1917.method2456();
                    } else {
                        var39 = true;
                    }
                    if (!var39) {
                        if (field543 != 0 && field422 != -1) {
                            class139.method1399(Statics.field128, field422, 0, field543, false);
                        }
                        field546 = false;
                    }
                }
                field560++;
                if (field560 > 750) {
                    if (field359 > 0) {
                        method74();
                    } else {
                        method101(40);
                        Statics.field2131 = Statics.field2037;
                        Statics.field2037 = null;
                    }
                    return;
                }
                method3786();
                for (int var40 = 0; var40 < field341; var40++) {
                    int var41 = field346[var40];
                    class36 var42 = field484[var41];
                    if (var42 != null) {
                        method2513(var42, var42.field789.field3011);
                    }
                }
                method781();
                field499++;
                if (field416 != 0) {
                    field415 += 20;
                    if (field415 >= 400) {
                        field416 = 0;
                    }
                }
                if (Statics.field844 != null) {
                    field453++;
                    if (field453 >= 15) {
                        method3099(Statics.field844);
                        Statics.field844 = null;
                    }
                }
                class170 var43 = Statics.field1788;
                class170 var44 = Statics.field2345;
                Statics.field1788 = null;
                Statics.field2345 = null;
                field344 = null;
                field456 = false;
                field517 = false;
                field529 = 0;
                while (class106.method2941() && field529 < 128) {
                    if (field473 >= 2 && class106.field1714[82] && Statics.field73 == 66) {
                        String var45 = "";
                        Iterator var46 = class48.field952.iterator();
                        while (var46.hasNext()) {
                            class22 var47 = (class22) var46.next();
                            var45 = var45 + var47.field247 + ':' + var47.field242 + '\n';
                        }
                        Statics.field1811.setContents(new StringSelection(var45), (ClipboardOwner) null);
                    } else {
                        field324[field529] = Statics.field73;
                        field530[field529] = Statics.field773;
                        field529++;
                    }
                }
                if (field523 != -1) {
                    int var50 = field523;
                    int var51 = Statics.field759;
                    int var52 = Statics.field951;
                    if (class170.method693(var50)) {
                        method99(Statics.field2197[var50], -1, 0, 0, var51, var52, 0, 0);
                    }
                }
                field491++;
                while (true) {
                    class19 var53;
                    class170 var54;
                    class170 var55;
                    do {
                        var53 = (class19) field544.method2320();
                        if (var53 == null) {
                            while (true) {
                                class19 var56;
                                class170 var57;
                                class170 var58;
                                do {
                                    var56 = (class19) field507.method2320();
                                    if (var56 == null) {
                                        while (true) {
                                            class19 var59;
                                            class170 var60;
                                            class170 var61;
                                            do {
                                                var59 = (class19) field436.method2320();
                                                if (var59 == null) {
                                                    method81();
                                                    if (field524 != null) {
                                                        method3090();
                                                    }
                                                    if (Statics.field8 != null) {
                                                        method3099(Statics.field8);
                                                        field424++;
                                                        if (class116.field1795 == 0) {
                                                            if (!field468) {
                                                                int var70 = method2726();
                                                                if (field578 > 2 && (field443 == 1 && !method193() || method2634(var70))) {
                                                                    method191(field360, field400);
                                                                } else if (field578 > 0) {
                                                                    int var71 = field360;
                                                                    int var72 = field400;
                                                                    method3466(Statics.field91, var71, var72);
                                                                    Statics.field91 = null;
                                                                }
                                                            } else if (Statics.field8 == Statics.field1759 && field502 != field403) {
                                                                class170 var62 = Statics.field8;
                                                                byte var63 = 0;
                                                                if (field469 == 1 && var62.field2321 == 206) {
                                                                    var63 = 1;
                                                                }
                                                                if (var62.field2324[field502] <= 0) {
                                                                    var63 = 0;
                                                                }
                                                                int var64 = method3421(var62);
                                                                boolean var65 = (var64 >> 29 & 0x1) != 0;
                                                                if (var65) {
                                                                    int var66 = field403;
                                                                    int var67 = field502;
                                                                    var62.field2324[var67] = var62.field2324[var66];
                                                                    var62.field2325[var67] = var62.field2325[var66];
                                                                    var62.field2324[var66] = -1;
                                                                    var62.field2325[var66] = 0;
                                                                } else if (var63 == 1) {
                                                                    int var68 = field403;
                                                                    int var69 = field502;
                                                                    while (var68 != var69) {
                                                                        if (var68 > var69) {
                                                                            var62.method3037(var68 - 1, var68);
                                                                            var68--;
                                                                        } else if (var68 < var69) {
                                                                            var62.method3037(var68 + 1, var68);
                                                                            var68++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var62.method3037(field502, field403);
                                                                }
                                                                field349.method2896(132);
                                                                field349.method2690(var63);
                                                                field349.method2697(field502);
                                                                field349.method2698(field403);
                                                                field349.method2852(Statics.field8.field2206);
                                                            }
                                                            field453 = 10;
                                                            class116.field1805 = 0;
                                                            Statics.field8 = null;
                                                        } else if (field424 >= 5 && (class116.field1793 > field360 + 5 || class116.field1793 < field360 - 5 || class116.field1800 > field400 + 5 || class116.field1800 < field400 - 5)) {
                                                            field468 = true;
                                                        }
                                                    }
                                                    if (class88.method1865()) {
                                                        int var73 = class88.field1523;
                                                        int var74 = class88.field1524;
                                                        field349.method2896(25);
                                                        field349.method2751(5);
                                                        field349.method2698(Statics.field60 + var73);
                                                        field349.method2751(class106.field1714[82] ? (class106.field1714[81] ? 2 : 1) : 0);
                                                        field349.method2697(Statics.field290 + var74);
                                                        class88.method1722();
                                                        field413 = class116.field1797;
                                                        field414 = class116.field1807;
                                                        field416 = 1;
                                                        field415 = 0;
                                                        field540 = var73;
                                                        field541 = var74;
                                                    }
                                                    if (Statics.field1788 != var43) {
                                                        if (var43 != null) {
                                                            method3099(var43);
                                                        }
                                                        if (Statics.field1788 != null) {
                                                            method3099(Statics.field1788);
                                                        }
                                                    }
                                                    if (Statics.field2345 != var44 && field585 == field300) {
                                                        if (var44 != null) {
                                                            method3099(var44);
                                                        }
                                                        if (Statics.field2345 != null) {
                                                            method3099(Statics.field2345);
                                                        }
                                                    }
                                                    if (Statics.field2345 == null) {
                                                        if (field300 > 0) {
                                                            field300--;
                                                        }
                                                    } else if (field300 < field585) {
                                                        field300++;
                                                        if (field585 == field300) {
                                                            method3099(Statics.field2345);
                                                        }
                                                    }
                                                    method2004();
                                                    if (field554) {
                                                        int var75 = Statics.field2117 * 128 + 64;
                                                        int var76 = Statics.field2087 * 128 + 64;
                                                        int var77 = method20(var75, var76, Statics.field1569) - Statics.field1581;
                                                        if (Statics.field1445 < var75) {
                                                            Statics.field1445 += Statics.field874 * (var75 - Statics.field1445) / 1000 + Statics.field46;
                                                            if (Statics.field1445 > var75) {
                                                                Statics.field1445 = var75;
                                                            }
                                                        }
                                                        if (Statics.field1445 > var75) {
                                                            Statics.field1445 -= Statics.field874 * (Statics.field1445 - var75) / 1000 + Statics.field46;
                                                            if (Statics.field1445 < var75) {
                                                                Statics.field1445 = var75;
                                                            }
                                                        }
                                                        if (Statics.field799 < var77) {
                                                            Statics.field799 += Statics.field874 * (var77 - Statics.field799) / 1000 + Statics.field46;
                                                            if (Statics.field799 > var77) {
                                                                Statics.field799 = var77;
                                                            }
                                                        }
                                                        if (Statics.field799 > var77) {
                                                            Statics.field799 -= Statics.field874 * (Statics.field799 - var77) / 1000 + Statics.field46;
                                                            if (Statics.field799 < var77) {
                                                                Statics.field799 = var77;
                                                            }
                                                        }
                                                        if (Statics.field806 < var76) {
                                                            Statics.field806 += Statics.field874 * (var76 - Statics.field806) / 1000 + Statics.field46;
                                                            if (Statics.field806 > var76) {
                                                                Statics.field806 = var76;
                                                            }
                                                        }
                                                        if (Statics.field806 > var76) {
                                                            Statics.field806 -= Statics.field874 * (Statics.field806 - var76) / 1000 + Statics.field46;
                                                            if (Statics.field806 < var76) {
                                                                Statics.field806 = var76;
                                                            }
                                                        }
                                                        int var78 = Statics.field741 * 128 + 64;
                                                        int var79 = Statics.field2150 * 128 + 64;
                                                        int var80 = method20(var78, var79, Statics.field1569) - Statics.field1921;
                                                        int var81 = var78 - Statics.field1445;
                                                        int var82 = var80 - Statics.field799;
                                                        int var83 = var79 - Statics.field806;
                                                        int var84 = (int) Math.sqrt((double) (var81 * var81 + var83 * var83));
                                                        int var85 = (int) (Math.atan2((double) var82, (double) var84) * 325.949D) & 0x7FF;
                                                        int var86 = (int) (Math.atan2((double) var81, (double) var83) * -325.949D) & 0x7FF;
                                                        if (var85 < 128) {
                                                            var85 = 128;
                                                        }
                                                        if (var85 > 383) {
                                                            var85 = 383;
                                                        }
                                                        if (Statics.field685 < var85) {
                                                            Statics.field685 += Statics.field1106 * (var85 - Statics.field685) / 1000 + Statics.field2728;
                                                            if (Statics.field685 > var85) {
                                                                Statics.field685 = var85;
                                                            }
                                                        }
                                                        if (Statics.field685 > var85) {
                                                            Statics.field685 -= Statics.field1106 * (Statics.field685 - var85) / 1000 + Statics.field2728;
                                                            if (Statics.field685 < var85) {
                                                                Statics.field685 = var85;
                                                            }
                                                        }
                                                        int var87 = var86 - Statics.field611;
                                                        if (var87 > 1024) {
                                                            var87 -= 2048;
                                                        }
                                                        if (var87 < -1024) {
                                                            var87 += 2048;
                                                        }
                                                        if (var87 > 0) {
                                                            Statics.field611 += Statics.field1106 * var87 / 1000 + Statics.field2728;
                                                            Statics.field611 &= 0x7FF;
                                                        }
                                                        if (var87 < 0) {
                                                            Statics.field611 -= Statics.field1106 * -var87 / 1000 + Statics.field2728;
                                                            Statics.field611 &= 0x7FF;
                                                        }
                                                        int var88 = var86 - Statics.field611;
                                                        if (var88 > 1024) {
                                                            var88 -= 2048;
                                                        }
                                                        if (var88 < -1024) {
                                                            var88 += 2048;
                                                        }
                                                        if (var88 < 0 && var87 > 0 || var88 > 0 && var87 < 0) {
                                                            Statics.field611 = var86;
                                                        }
                                                    }
                                                    for (int var89 = 0; var89 < 5; var89++) {
                                                        var10002 = field559[var89]++;
                                                    }
                                                    Statics.field232.method900();
                                                    int var90 = class116.method196();
                                                    int var91 = class106.method691();
                                                    if (var90 > 15000 && var91 > 15000) {
                                                        field359 = 250;
                                                        class116.field1794 = 14500;
                                                        field349.method2896(47);
                                                    }
                                                    field358++;
                                                    if (field358 > 500) {
                                                        field358 = 0;
                                                        int var92 = (int) (Math.random() * 8.0D);
                                                        if ((var92 & 0x1) == 1) {
                                                            field482 += field371;
                                                        }
                                                        if ((var92 & 0x2) == 2) {
                                                            field372 += field373;
                                                        }
                                                        if ((var92 & 0x4) == 4) {
                                                            field340 += field440;
                                                        }
                                                    }
                                                    if (field482 < -50) {
                                                        field371 = 2;
                                                    }
                                                    if (field482 > 50) {
                                                        field371 = -2;
                                                    }
                                                    if (field372 < -55) {
                                                        field373 = 2;
                                                    }
                                                    if (field372 > 55) {
                                                        field373 = -2;
                                                    }
                                                    if (field340 < -40) {
                                                        field440 = 1;
                                                    }
                                                    if (field340 > 40) {
                                                        field440 = -1;
                                                    }
                                                    field579++;
                                                    if (field579 > 500) {
                                                        field579 = 0;
                                                        int var93 = (int) (Math.random() * 8.0D);
                                                        if ((var93 & 0x1) == 1) {
                                                            field354 += field378;
                                                        }
                                                        if ((var93 & 0x2) == 2) {
                                                            field390 += field380;
                                                        }
                                                    }
                                                    if (field354 < -60) {
                                                        field378 = 2;
                                                    }
                                                    if (field354 > 60) {
                                                        field378 = -2;
                                                    }
                                                    if (field390 < -20) {
                                                        field380 = 1;
                                                    }
                                                    if (field390 > 10) {
                                                        field380 = -1;
                                                    }
                                                    for (class17 var94 = (class17) field576.method2349(); var94 != null; var94 = (class17) field576.method2350()) {
                                                        if ((long) var94.field182 < class156.method12() / 1000L - 5L) {
                                                            if (var94.field183 > 0) {
                                                                class48.method187(5, "", var94.field181 + class174.field2626);
                                                            }
                                                            if (var94.field183 == 0) {
                                                                class48.method187(5, "", var94.field181 + class174.field2582);
                                                            }
                                                            var94.method2357();
                                                        }
                                                    }
                                                    field355++;
                                                    if (field355 > 50) {
                                                        field349.method2896(8);
                                                    }
                                                    try {
                                                        if (Statics.field2037 != null && field349.field2091 > 0) {
                                                            Statics.field2037.method2013(field349.field2092, 0, field349.field2091);
                                                            field349.field2091 = 0;
                                                            field355 = 0;
                                                        }
                                                    } catch (IOException var96) {
                                                        if (field359 > 0) {
                                                            method74();
                                                        } else {
                                                            method101(40);
                                                            Statics.field2131 = Statics.field2037;
                                                            Statics.field2037 = null;
                                                        }
                                                    }
                                                    return;
                                                }
                                                var60 = var59.field199;
                                                if (var60.field2306 < 0) {
                                                    break;
                                                }
                                                var61 = class170.method3109(var60.field2225);
                                            } while (var61 == null || var61.field2330 == null || var60.field2306 >= var61.field2330.length || var61.field2330[var60.field2306] != var60);
                                            class33.method3098(var59, 200000);
                                        }
                                    }
                                    var57 = var56.field199;
                                    if (var57.field2306 < 0) {
                                        break;
                                    }
                                    var58 = class170.method3109(var57.field2225);
                                } while (var58 == null || var58.field2330 == null || var57.field2306 >= var58.field2330.length || var58.field2330[var57.field2306] != var57);
                                class33.method3298(var56);
                            }
                        }
                        var54 = var53.field199;
                        if (var54.field2306 < 0) {
                            break;
                        }
                        var55 = class170.method3109(var54.field2225);
                    } while (var55 == null || var55.field2330 == null || var54.field2306 >= var55.field2330.length || var55.field2330[var54.field2306] != var54);
                    class33.method3298(var53);
                }
            }
            field349.method2896(173);
            field349.method2751(0);
            int var3 = field349.field2091;
            class228.method3581(field349);
            field349.method2663(field349.field2091 - var3);
        }
    }

    @ObfuscatedName("c.x(I)V")
    public static final void method92() {
        if (Statics.field2190 != null) {
            Statics.field2190.method1094();
        }
        if (Statics.field915 != null) {
            Statics.field915.method1094();
        }
    }

    @ObfuscatedName("t.g(Lgf;IIII)V")
    public static void method198(class202 arg0, int arg1, int arg2, int arg3) {
        if (field548 >= 50 || field547 == 0 || arg0.field3060 == null || arg1 >= arg0.field3060.length) {
            return;
        }
        int var4 = arg0.field3060[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field549[field548] = var5;
        field550[field548] = var6;
        field551[field548] = 0;
        field350[field548] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field556[field548] = (var8 << 16) + (var9 << 8) + var7;
        field548++;
    }

    @ObfuscatedName("cw.e(IIIS)V")
    public static void method1619(int arg0, int arg1, int arg2) {
        if (field480 == 0 || arg1 == 0 || field548 >= 50) {
            return;
        }
        field549[field548] = arg0;
        field550[field548] = arg1;
        field551[field548] = arg2;
        field350[field548] = null;
        field556[field548] = 0;
        field548++;
    }

    @ObfuscatedName("s.ae(Lfu;III)V")
    public static final void method152(class170 arg0, int arg1, int arg2) {
        if (field565 != 0 && field565 != 3 || class116.field1805 != 1 && Statics.field174 || class116.field1805 != 4) {
            return;
        }
        class165 var3 = arg0.method3042(true);
        if (var3 == null) {
            return;
        }
        int var4 = class116.field1797 - arg1;
        int var5 = class116.field1807 - arg2;
        if (!var3.method2979(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2157 / 2;
        int var7 = var5 - var3.field2158 / 2;
        int var8 = field527 + field354 & 0x7FF;
        int var9 = class85.field1469[var8];
        int var10 = class85.field1463[var8];
        int var11 = (field390 + 256) * var9 >> 8;
        int var12 = (field390 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field792.field638 + var13 >> 7;
        int var16 = Statics.field792.field625 - var14 >> 7;
        field349.method2896(69);
        field349.method2751(18);
        field349.method2698(Statics.field60 + var15);
        field349.method2751(class106.field1714[82] ? (class106.field1714[81] ? 2 : 1) : 0);
        field349.method2697(Statics.field290 + var16);
        field349.method2751(var6);
        field349.method2751(var7);
        field349.method2664(field527);
        field349.method2751(57);
        field349.method2751(field354);
        field349.method2751(field390);
        field349.method2751(89);
        field349.method2664(Statics.field792.field638);
        field349.method2664(Statics.field792.field625);
        field349.method2751(63);
        field540 = var15;
        field541 = var16;
    }

    @ObfuscatedName("ac.aq(B)V")
    public static final void method781() {
        int[] var0 = class46.field932;
        for (int var1 = 0; var1 < class46.field922; var1++) {
            class24 var2 = field426[var0[var1]];
            if (var2 != null && var2.field639 > 0) {
                var2.field639--;
                if (var2.field639 == 0) {
                    var2.field664 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field341; var3++) {
            int var4 = field346[var3];
            class36 var5 = field484[var4];
            if (var5 != null && var5.field639 > 0) {
                var5.field639--;
                if (var5.field639 == 0) {
                    var5.field664 = null;
                }
            }
        }
    }

    @ObfuscatedName("an.at(Ljava/lang/String;I)V")
    public static final void method871(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field2736.field715 = !Statics.field2736.field715;
            class31.method1906();
            if (Statics.field2736.field715) {
                class48.method187(99, "", "Roofs are now all hidden");
            } else {
                class48.method187(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field322 = !field322;
        }
        if (field473 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field322 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field322 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                if (field359 > 0) {
                    method74();
                } else {
                    method101(40);
                    Statics.field2131 = Statics.field2037;
                    Statics.field2037 = null;
                }
            }
            if (arg0.equalsIgnoreCase("errortest") && field306 == 2) {
                throw new RuntimeException();
            }
        }
        field349.method2896(156);
        field349.method2751(arg0.length() + 1);
        field349.method2657(arg0);
    }

    @ObfuscatedName("dx.au(B)V")
    public static final void method2004() {
        int var0 = field482 + Statics.field792.field638;
        int var1 = field372 + Statics.field792.field625;
        if (Statics.field1474 - var0 < -500 || Statics.field1474 - var0 > 500 || Statics.field2699 - var1 < -500 || Statics.field2699 - var1 > 500) {
            Statics.field1474 = var0;
            Statics.field2699 = var1;
        }
        if (Statics.field1474 != var0) {
            Statics.field1474 += (var0 - Statics.field1474) / 16;
        }
        if (Statics.field2699 != var1) {
            Statics.field2699 += (var1 - Statics.field2699) / 16;
        }
        if (class116.field1795 == 4 && Statics.field174) {
            int var2 = class116.field1800 - field394;
            field392 = var2 * 2;
            field394 = var2 == -1 || var2 == 1 ? class116.field1800 : (field394 + class116.field1800) / 2;
            int var3 = field393 - class116.field1793;
            field391 = var3 * 2;
            field393 = var3 == -1 || var3 == 1 ? class116.field1793 : (field393 + class116.field1793) / 2;
        } else {
            if (class106.field1714[96]) {
                field391 += (-24 - field391) / 2;
            } else if (class106.field1714[97]) {
                field391 += (24 - field391) / 2;
            } else {
                field391 /= 2;
            }
            if (class106.field1714[98]) {
                field392 += (12 - field392) / 2;
            } else if (class106.field1714[99]) {
                field392 += (-12 - field392) / 2;
            } else {
                field392 /= 2;
            }
            field394 = class116.field1800;
            field393 = class116.field1793;
        }
        field527 = field391 / 2 + field527 & 0x7FF;
        field542 += field392 / 2;
        if (field542 < 128) {
            field542 = 128;
        }
        if (field542 > 383) {
            field542 = 383;
        }
        int var4 = Statics.field1474 >> 7;
        int var5 = Statics.field2699 >> 7;
        int var6 = method20(Statics.field1474, Statics.field2699, Statics.field1569);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field1569;
                    if (var10 < 3 && (class11.field111[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class11.field114[var10][var8][var9];
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
        if (var12 > field398) {
            field398 += (var12 - field398) / 24;
        } else if (var12 < field398) {
            field398 += (var12 - field398) / 80;
        }
    }

    @ObfuscatedName("ht.am(I)V")
    public static final void method3786() {
        int var0 = class46.field922;
        int[] var1 = class46.field932;
        for (int var2 = 0; var2 < var0; var2++) {
            class24 var3 = field426[var1[var2]];
            if (var3 != null) {
                method2513(var3, 1);
            }
        }
    }

    @ObfuscatedName("en.ad(Laq;II)V")
    public static final void method2513(class28 arg0, int arg1) {
        if (arg0.field670 > field450) {
            int var2 = arg0.field670 - field450;
            int var3 = arg0.field666 * 128 + arg0.field658 * 64;
            int var4 = arg0.field668 * 128 + arg0.field658 * 64;
            arg0.field638 += (var3 - arg0.field638) / var2;
            arg0.field625 += (var4 - arg0.field625) / var2;
            arg0.field682 = 0;
            arg0.field675 = arg0.field672;
        } else if (arg0.field671 >= field450) {
            if (field450 == arg0.field671 || arg0.field656 == -1 || arg0.field637 != 0 || arg0.field643 + 1 > class202.method3379(arg0.field656).field3064[arg0.field657]) {
                int var5 = arg0.field671 - arg0.field670;
                int var6 = field450 - arg0.field670;
                int var7 = arg0.field666 * 128 + arg0.field658 * 64;
                int var8 = arg0.field668 * 128 + arg0.field658 * 64;
                int var9 = arg0.field667 * 128 + arg0.field658 * 64;
                int var10 = arg0.field669 * 128 + arg0.field658 * 64;
                arg0.field638 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field625 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field682 = 0;
            arg0.field675 = arg0.field672;
            arg0.field626 = arg0.field675;
        } else {
            arg0.field633 = arg0.field660;
            if (arg0.field674 == 0) {
                arg0.field682 = 0;
            } else {
                label430: {
                    if (arg0.field656 != -1 && arg0.field637 == 0) {
                        class202 var11 = class202.method3379(arg0.field656);
                        if (arg0.field683 > 0 && var11.field3054 == 0) {
                            arg0.field682++;
                            break label430;
                        }
                        if (arg0.field683 <= 0 && var11.field3069 == 0) {
                            arg0.field682++;
                            break label430;
                        }
                    }
                    int var12 = arg0.field638;
                    int var13 = arg0.field625;
                    int var14 = arg0.field679[arg0.field674 - 1] * 128 + arg0.field658 * 64;
                    int var15 = arg0.field629[arg0.field674 - 1] * 128 + arg0.field658 * 64;
                    if (var12 < var14) {
                        if (var13 < var15) {
                            arg0.field675 = 1280;
                        } else if (var13 > var15) {
                            arg0.field675 = 1792;
                        } else {
                            arg0.field675 = 1536;
                        }
                    } else if (var12 > var14) {
                        if (var13 < var15) {
                            arg0.field675 = 768;
                        } else if (var13 > var15) {
                            arg0.field675 = 256;
                        } else {
                            arg0.field675 = 512;
                        }
                    } else if (var13 < var15) {
                        arg0.field675 = 1024;
                    } else if (var13 > var15) {
                        arg0.field675 = 0;
                    }
                    byte var16 = arg0.field681[arg0.field674 - 1];
                    if (var14 - var12 <= 256 && var14 - var12 >= -256 && var15 - var13 <= 256 && var15 - var13 >= -256) {
                        int var17 = arg0.field675 - arg0.field626 & 0x7FF;
                        if (var17 > 1024) {
                            var17 -= 2048;
                        }
                        int var18 = arg0.field653;
                        if (var17 >= -256 && var17 <= 256) {
                            var18 = arg0.field632;
                        } else if (var17 >= 256 && var17 < 768) {
                            var18 = arg0.field635;
                        } else if (var17 >= -768 && var17 <= -256) {
                            var18 = arg0.field634;
                        }
                        if (var18 == -1) {
                            var18 = arg0.field632;
                        }
                        arg0.field633 = var18;
                        int var19 = 4;
                        boolean var20 = true;
                        if (arg0 instanceof class36) {
                            var20 = ((class36) arg0).field789.field3037;
                        }
                        if (var20) {
                            if (arg0.field675 != arg0.field626 && arg0.field650 == -1 && arg0.field655 != 0) {
                                var19 = 2;
                            }
                            if (arg0.field674 > 2) {
                                var19 = 6;
                            }
                            if (arg0.field674 > 3) {
                                var19 = 8;
                            }
                            if (arg0.field682 > 0 && arg0.field674 > 1) {
                                var19 = 8;
                                arg0.field682--;
                            }
                        } else {
                            if (arg0.field674 > 1) {
                                var19 = 6;
                            }
                            if (arg0.field674 > 2) {
                                var19 = 8;
                            }
                            if (arg0.field682 > 0 && arg0.field674 > 1) {
                                var19 = 8;
                                arg0.field682--;
                            }
                        }
                        if (var16 == 2) {
                            var19 <<= 0x1;
                        }
                        if (var19 >= 8 && arg0.field633 == arg0.field632 && arg0.field680 != -1) {
                            arg0.field633 = arg0.field680;
                        }
                        if (var12 != var14 || var13 != var15) {
                            if (var12 < var14) {
                                arg0.field638 += var19;
                                if (arg0.field638 > var14) {
                                    arg0.field638 = var14;
                                }
                            } else if (var12 > var14) {
                                arg0.field638 -= var19;
                                if (arg0.field638 < var14) {
                                    arg0.field638 = var14;
                                }
                            }
                            if (var13 < var15) {
                                arg0.field625 += var19;
                                if (arg0.field625 > var15) {
                                    arg0.field625 = var15;
                                }
                            } else if (var13 > var15) {
                                arg0.field625 -= var19;
                                if (arg0.field625 < var15) {
                                    arg0.field625 = var15;
                                }
                            }
                        }
                        if (arg0.field638 == var14 && arg0.field625 == var15) {
                            arg0.field674--;
                            if (arg0.field683 > 0) {
                                arg0.field683--;
                            }
                        }
                    } else {
                        arg0.field638 = var14;
                        arg0.field625 = var15;
                        arg0.field674--;
                        if (arg0.field683 > 0) {
                            arg0.field683--;
                        }
                    }
                }
            }
        }
        if (arg0.field638 < 128 || arg0.field625 < 128 || arg0.field638 >= 13184 || arg0.field625 >= 13184) {
            arg0.field656 = -1;
            arg0.field659 = -1;
            arg0.field670 = 0;
            arg0.field671 = 0;
            arg0.field638 = arg0.field679[0] * 128 + arg0.field658 * 64;
            arg0.field625 = arg0.field629[0] * 128 + arg0.field658 * 64;
            arg0.method622();
        }
        if (Statics.field792 == arg0 && (arg0.field638 < 1536 || arg0.field625 < 1536 || arg0.field638 >= 11776 || arg0.field625 >= 11776)) {
            arg0.field656 = -1;
            arg0.field659 = -1;
            arg0.field670 = 0;
            arg0.field671 = 0;
            arg0.field638 = arg0.field679[0] * 128 + arg0.field658 * 64;
            arg0.field625 = arg0.field629[0] * 128 + arg0.field658 * 64;
            arg0.method622();
        }
        if (arg0.field655 != 0) {
            if (arg0.field650 != -1) {
                class28 var21 = null;
                if (arg0.field650 < 32768) {
                    var21 = field484[arg0.field650];
                } else if (arg0.field650 >= 32768) {
                    var21 = field426[arg0.field650 - 32768];
                }
                if (var21 != null) {
                    int var22 = arg0.field638 - var21.field638;
                    int var23 = arg0.field625 - var21.field625;
                    if (var22 != 0 || var23 != 0) {
                        arg0.field675 = (int) (Math.atan2((double) var22, (double) var23) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field651) {
                    arg0.field650 = -1;
                    arg0.field651 = false;
                }
            }
            if (arg0.field652 != -1 && (arg0.field674 == 0 || arg0.field682 > 0)) {
                arg0.field675 = arg0.field652;
                arg0.field652 = -1;
            }
            int var24 = arg0.field675 - arg0.field626 & 0x7FF;
            if (var24 == 0 && arg0.field651) {
                arg0.field650 = -1;
                arg0.field651 = false;
            }
            if (var24 == 0) {
                arg0.field676 = 0;
            } else {
                arg0.field676++;
                if (var24 > 1024) {
                    arg0.field626 -= arg0.field655;
                    boolean var25 = true;
                    if (var24 < arg0.field655 || var24 > 2048 - arg0.field655) {
                        arg0.field626 = arg0.field675;
                        var25 = false;
                    }
                    if (arg0.field660 == arg0.field633 && (arg0.field676 > 25 || var25)) {
                        if (arg0.field677 == -1) {
                            arg0.field633 = arg0.field632;
                        } else {
                            arg0.field633 = arg0.field677;
                        }
                    }
                } else {
                    arg0.field626 += arg0.field655;
                    boolean var26 = true;
                    if (var24 < arg0.field655 || var24 > 2048 - arg0.field655) {
                        arg0.field626 = arg0.field675;
                        var26 = false;
                    }
                    if (arg0.field660 == arg0.field633 && (arg0.field676 > 25 || var26)) {
                        if (arg0.field631 == -1) {
                            arg0.field633 = arg0.field632;
                        } else {
                            arg0.field633 = arg0.field631;
                        }
                    }
                }
                arg0.field626 &= 0x7FF;
            }
        }
        arg0.field628 = false;
        if (arg0.field633 != -1) {
            class202 var28 = class202.method3379(arg0.field633);
            if (var28 == null || var28.field3057 == null) {
                arg0.field633 = -1;
            } else {
                arg0.field636++;
                if (arg0.field654 < var28.field3057.length && arg0.field636 > var28.field3064[arg0.field654]) {
                    arg0.field636 = 1;
                    arg0.field654++;
                    method198(var28, arg0.field654, arg0.field638, arg0.field625);
                }
                if (arg0.field654 >= var28.field3057.length) {
                    arg0.field636 = 0;
                    arg0.field654 = 0;
                    method198(var28, arg0.field654, arg0.field638, arg0.field625);
                }
            }
        }
        if (arg0.field659 != -1 && field450 >= arg0.field640) {
            if (arg0.field662 < 0) {
                arg0.field662 = 0;
            }
            int var29 = class191.method1883(arg0.field659).field2808;
            if (var29 == -1) {
                arg0.field659 = -1;
            } else {
                class202 var30 = class202.method3379(var29);
                if (var30 == null || var30.field3057 == null) {
                    arg0.field659 = -1;
                } else {
                    arg0.field663++;
                    if (arg0.field662 < var30.field3057.length && arg0.field663 > var30.field3064[arg0.field662]) {
                        arg0.field663 = 1;
                        arg0.field662++;
                        method198(var30, arg0.field662, arg0.field638, arg0.field625);
                    }
                    if (arg0.field662 >= var30.field3057.length && (arg0.field662 < 0 || arg0.field662 >= var30.field3057.length)) {
                        arg0.field659 = -1;
                    }
                }
            }
        }
        if (arg0.field656 != -1 && arg0.field637 <= 1) {
            class202 var31 = class202.method3379(arg0.field656);
            if (var31.field3054 == 1 && arg0.field683 > 0 && arg0.field670 <= field450 && arg0.field671 < field450) {
                arg0.field637 = 1;
                return;
            }
        }
        if (arg0.field656 != -1 && arg0.field637 == 0) {
            class202 var32 = class202.method3379(arg0.field656);
            if (var32 == null || var32.field3057 == null) {
                arg0.field656 = -1;
            } else {
                arg0.field643++;
                if (arg0.field657 < var32.field3057.length && arg0.field643 > var32.field3064[arg0.field657]) {
                    arg0.field643 = 1;
                    arg0.field657++;
                    method198(var32, arg0.field657, arg0.field638, arg0.field625);
                }
                if (arg0.field657 >= var32.field3057.length) {
                    arg0.field657 -= var32.field3068;
                    arg0.field678++;
                    if (arg0.field678 >= var32.field3059) {
                        arg0.field656 = -1;
                    } else if (arg0.field657 >= 0 && arg0.field657 < var32.field3057.length) {
                        method198(var32, arg0.field657, arg0.field638, arg0.field625);
                    } else {
                        arg0.field656 = -1;
                    }
                }
                arg0.field628 = var32.field3063;
            }
        }
        if (arg0.field637 > 0) {
            arg0.field637--;
        }
    }

    @ObfuscatedName("az.ai(Lx;III)V")
    public static void method950(class24 arg0, int arg1, int arg2) {
        if (arg0.field656 == arg1 && arg1 != -1) {
            int var3 = class202.method3379(arg1).field3070;
            if (var3 == 1) {
                arg0.field657 = 0;
                arg0.field643 = 0;
                arg0.field637 = arg2;
                arg0.field678 = 0;
            }
            if (var3 == 2) {
                arg0.field678 = 0;
            }
        } else if (arg1 == -1 || arg0.field656 == -1 || class202.method3379(arg1).field3058 >= class202.method3379(arg0.field656).field3058) {
            arg0.field656 = arg1;
            arg0.field657 = 0;
            arg0.field643 = 0;
            arg0.field637 = arg2;
            arg0.field678 = 0;
            arg0.field683 = arg0.field674;
        }
    }

    @ObfuscatedName("i.ac(B)I")
    public static int method98() {
        return field520 ? 2 : 1;
    }

    @ObfuscatedName("az.ao(II)V")
    public static void method951(int arg0) {
        field567 = 0L;
        if (arg0 >= 2) {
            field520 = true;
        } else {
            field520 = false;
        }
        method194();
        if (field313 >= 25) {
            method97();
        }
        field1784 = true;
    }

    @ObfuscatedName("i.as(I)V")
    public static void method97() {
        field349.method2896(227);
        field349.method2751(method98());
        field349.method2664(Statics.field759);
        field349.method2664(Statics.field951);
    }

    @ObfuscatedName("t.aa(I)V")
    public static void method194() {
        client var0 = Statics.field509;
        synchronized (Statics.field509) {
            Container var1 = Statics.field509.method2059();
            if (var1 != null) {
                Statics.field977 = Math.max(var1.getSize().width, Statics.field684);
                Statics.field620 = Math.max(var1.getSize().height, Statics.field1684);
                if (Statics.field40 == var1) {
                    Insets var2 = Statics.field40.getInsets();
                    Statics.field977 -= var2.right + var2.left;
                    Statics.field620 -= var2.top + var2.bottom;
                }
                if (Statics.field977 <= 0) {
                    Statics.field977 = 1;
                }
                if (Statics.field620 <= 0) {
                    Statics.field620 = 1;
                }
                if (method98() == 1) {
                    Statics.field759 = field564;
                    Statics.field951 = field522 * 503;
                } else {
                    Statics.field759 = Math.min(Statics.field977, 7680);
                    Statics.field951 = Math.min(Statics.field620, 2160);
                }
                field1778 = (Statics.field977 - Statics.field759) / 2;
                field1785 = 0;
                Statics.field1631.setSize(Statics.field759, Statics.field951);
                Statics.field691 = class221.method3365(Statics.field759, Statics.field951, Statics.field1631);
                if (Statics.field40 == var1) {
                    Insets var3 = Statics.field40.getInsets();
                    Statics.field1631.setLocation(field1778 + var3.left, field1785 + var3.top);
                } else {
                    Statics.field1631.setLocation(field1778, field1785);
                }
                method2561();
                if (field523 != -1) {
                    method792(true);
                }
                method612();
            }
        }
    }

    @ObfuscatedName("ee.ah(I)V")
    public static void method2561() {
        int var0 = Statics.field759;
        int var1 = Statics.field951;
        if (Statics.field977 < var0) {
            int var2 = Statics.field977;
        }
        if (Statics.field620 < var1) {
            int var3 = Statics.field620;
        }
        if (Statics.field2736 != null) {
            try {
                class101.method1912(Statics.field509, "resize", new Object[] { method98() });
            } catch (Throwable var5) {
            }
        }
    }

    @ObfuscatedName("ae.aj(I)V")
    public static void method612() {
        int var0 = field1778;
        int var1 = field1785;
        int var2 = Statics.field977 - Statics.field759 - var0;
        int var3 = Statics.field620 - Statics.field951 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field509.method2059();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field40 == var4) {
                Insets var7 = Statics.field40.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field620);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field977, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field977 + var5 - var2, var6, var2, Statics.field620);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field620 + var6 - var3, Statics.field977, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("w.aw(Ljava/lang/String;ZI)V")
    public static final void method204(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field2652.method3702(arg0, 250);
        int var6 = Statics.field2652.method3772(arg0, 250) * 13;
        class220.method3812(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class220.method3818(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field2652.method3709(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method1180(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method707(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1631.getGraphics();
            Statics.field691.method3802(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1631.repaint();
        }
    }

    @ObfuscatedName("bf.ap(IIIIZI)V")
    public static final void method1406(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field561 - field386) * var5 / 100 + field386;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field566) {
            short var8 = field566;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field483) {
                var6 = field483;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class220.method3859();
                    class220.method3812(arg0, arg1, var10, arg3, -16777216);
                    class220.method3812(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field402) {
            short var11 = field402;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field379) {
                var6 = field379;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class220.method3859();
                    class220.method3812(arg0, arg1, arg2, var13, -16777216);
                    class220.method3812(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field563 - field562) * var5 / 100 + field562;
        field572 = arg3 * var6 * var14 / 85504 << 1;
        if (field570 != arg2 || field571 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class85.field1469[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class88.method1725(var15, 500, 800, arg2, arg3);
        }
        field568 = arg0;
        field569 = arg1;
        field570 = arg2;
        field571 = arg3;
    }

    @ObfuscatedName("et.ak(Lf;I)V")
    public static final void method2874(class16 arg0) {
        if (Statics.field792.field638 >> 7 == field540 && Statics.field792.field625 >> 7 == field541) {
            field540 = 0;
        }
        int var1 = class46.field922;
        int[] var2 = class46.field932;
        int var3 = var1;
        if (class16.field178 == arg0 || class16.field170 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class24 var5;
            int var6;
            if (class16.field178 == arg0) {
                var5 = Statics.field792;
                var6 = Statics.field792.field256 << 14;
            } else if (class16.field170 == arg0) {
                var5 = field426[field435];
                var6 = field435 << 14;
            } else {
                var5 = field426[var2[var4]];
                var6 = var2[var4] << 14;
                if (class16.field172 == arg0 && field435 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method233() && !var5.field277) {
                var5.field275 = false;
                if ((field309 && var1 > 50 || var1 > 200) && class16.field178 != arg0 && var5.field660 == var5.field633) {
                    var5.field275 = true;
                }
                int var7 = var5.field638 >> 7;
                int var8 = var5.field625 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field270 == null || field450 < var5.field265 || field450 >= var5.field266) {
                        if ((var5.field638 & 0x7F) == 64 && (var5.field625 & 0x7F) == 64) {
                            if (field410 == field409[var7][var8]) {
                                continue;
                            }
                            field409[var7][var8] = field410;
                        }
                        var5.field264 = method20(var5.field638, var5.field625, Statics.field1569);
                        Statics.field970.method1693(Statics.field1569, var5.field638, var5.field625, var5.field264, 60, var5, var5.field626, var6, var5.field628);
                    } else {
                        var5.field275 = false;
                        var5.field264 = method20(var5.field638, var5.field625, Statics.field1569);
                        Statics.field970.method1694(Statics.field1569, var5.field638, var5.field625, var5.field264, 60, var5, var5.field626, var6, var5.field271, var5.field283, var5.field272, var5.field274);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aj.al(I)V")
    public static final void method812() {
        for (class43 var0 = (class43) field438.method2319(); var0 != null; var0 = (class43) field438.method2333()) {
            if (Statics.field1569 != var0.field879 || field450 > var0.field878) {
                var0.method2310();
            } else if (field450 >= var0.field884) {
                if (var0.field888 > 0) {
                    class36 var1 = field484[var0.field888 - 1];
                    if (var1 != null && var1.field638 >= 0 && var1.field638 < 13312 && var1.field625 >= 0 && var1.field625 < 13312) {
                        var0.method856(var1.field638, var1.field625, method20(var1.field638, var1.field625, var0.field879) - var0.field882, field450);
                    }
                }
                if (var0.field888 < 0) {
                    int var2 = -var0.field888 - 1;
                    class24 var3;
                    if (field557 == var2) {
                        var3 = Statics.field792;
                    } else {
                        var3 = field426[var2];
                    }
                    if (var3 != null && var3.field638 >= 0 && var3.field638 < 13312 && var3.field625 >= 0 && var3.field625 < 13312) {
                        var0.method856(var3.field638, var3.field625, method20(var3.field638, var3.field625, var0.field879) - var0.field882, field450);
                    }
                }
                var0.method857(field499);
                Statics.field970.method1693(Statics.field1569, (int) var0.field890, (int) var0.field896, (int) var0.field889, 60, var0, var0.field883, -1, false);
            }
        }
    }

    @ObfuscatedName("m.an(S)I")
    public static final int method137() {
        if (Statics.field2736.field715) {
            return Statics.field1569;
        }
        int var0 = 3;
        if (Statics.field685 < 310) {
            int var1 = Statics.field1445 >> 7;
            int var2 = Statics.field806 >> 7;
            int var3 = Statics.field792.field638 >> 7;
            int var4 = Statics.field792.field625 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field1569;
            }
            if ((class11.field111[Statics.field1569][var1][var2] & 0x4) != 0) {
                var0 = Statics.field1569;
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
                    if ((class11.field111[Statics.field1569][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1569;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class11.field111[Statics.field1569][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1569;
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
                    if ((class11.field111[Statics.field1569][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1569;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class11.field111[Statics.field1569][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1569;
                        }
                    }
                }
            }
        }
        if (Statics.field792.field638 >= 0 && Statics.field792.field625 >= 0 && Statics.field792.field638 < 13312 && Statics.field792.field625 < 13312) {
            if ((class11.field111[Statics.field1569][Statics.field792.field638 >> 7][Statics.field792.field625 >> 7] & 0x4) != 0) {
                var0 = Statics.field1569;
            }
            return var0;
        } else {
            return Statics.field1569;
        }
    }

    @ObfuscatedName("au.ar(I)I")
    public static final int method668() {
        if (Statics.field2736.field715) {
            return Statics.field1569;
        } else {
            int var0 = method20(Statics.field1445, Statics.field806, Statics.field1569);
            return var0 - Statics.field799 >= 800 || (class11.field111[Statics.field1569][Statics.field1445 >> 7][Statics.field806 >> 7] & 0x4) == 0 ? 3 : Statics.field1569;
        }
    }

    @ObfuscatedName("fw.ab(Laq;IIIIII)V")
    public static final void method3110(class28 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method233()) {
            return;
        }
        if (arg0 instanceof class36) {
            class200 var6 = ((class36) arg0).field789;
            if (var6.field3033 != null) {
                var6 = var6.method3542();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class46.field922;
        int[] var8 = class46.field932;
        int var9 = 3;
        if (!arg0.field649.method2282()) {
            Statics.method216(arg0, arg0.field630 + 15);
            for (class35 var10 = (class35) arg0.field649.method2281(); var10 != null; var10 = (class35) arg0.field649.method2276()) {
                class29 var11 = var10.method785(field450);
                if (var11 != null) {
                    class194 var12 = var10.field781;
                    class225 var13 = var12.method3337();
                    class225 var14 = var12.method3351();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field2837;
                    } else {
                        if (var12.field2846 * 2 < var14.field3225) {
                            var15 = var12.field2846;
                        }
                        var16 = var14.field3225 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field450 - var11.field688;
                    int var20 = var11.field690 * var16 / var12.field2837;
                    int var23;
                    if (var11.field689 > var19) {
                        int var21 = var12.field2841 == 0 ? 0 : var19 / var12.field2841 * var12.field2841;
                        int var22 = var11.field687 * var16 / var12.field2837;
                        var23 = (var20 - var22) * var21 / var11.field689 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field689 + var12.field2839 - var19;
                        if (var12.field2840 >= 0) {
                            var17 = (var24 << 8) / (var12.field2839 - var12.field2840);
                        }
                    }
                    if (var11.field690 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field411 + arg2 - (var16 >> 1);
                    int var26 = field412 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field411 > -1) {
                            class220.method3812(var25, var26, var23, 5, 65280);
                            class220.method3812(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                            var13.method4009(var27, var26, var17);
                            class220.method3807(var27, var26, var27 + var28, var26 + var29);
                            var14.method4009(var27, var26, var17);
                        } else {
                            var13.method3941(var27, var26);
                            class220.method3807(var27, var26, var27 + var28, var26 + var29);
                            var14.method3941(var27, var26);
                        }
                        class220.method3832(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method786()) {
                    var10.method2310();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class24 var30 = (class24) arg0;
            if (var30.field277) {
                return;
            }
            if (var30.field258 != -1 || var30.field259 != -1) {
                Statics.method216(arg0, arg0.field630 + 15);
                if (field411 > -1) {
                    if (var30.field258 != -1) {
                        Statics.field727[var30.field258].method3941(field411 + arg2 - 12, field412 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field259 != -1) {
                        Statics.field126[var30.field259].method3941(field411 + arg2 - 12, field412 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field552 == 10 && field326 == var8[arg1]) {
                Statics.method216(arg0, arg0.field630 + 15);
                if (field411 > -1) {
                    Statics.field2673[1].method3941(field411 + arg2 - 12, field412 + arg3 - var9);
                }
            }
        } else {
            class200 var31 = ((class36) arg0).field789;
            if (var31.field3033 != null) {
                var31 = var31.method3542();
            }
            if (var31.field3008 >= 0 && var31.field3008 < Statics.field126.length) {
                Statics.method216(arg0, arg0.field630 + 15);
                if (field411 > -1) {
                    Statics.field126[var31.field3008].method3941(field411 + arg2 - 12, field412 + arg3 - 30);
                }
            }
            if (field552 == 1 && field325 == field346[arg1 - var7] && field450 % 20 < 10) {
                Statics.method216(arg0, arg0.field630 + 15);
                if (field411 > -1) {
                    Statics.field2673[0].method3941(field411 + arg2 - 12, field412 + arg3 - 28);
                }
            }
        }
        if (arg0.field664 != null && (arg1 >= var7 || !arg0.field624 && (field589 == 4 || !arg0.field627 && (field589 == 0 || field589 == 3 || field589 == 1 && method184(((class24) arg0).field263, false))))) {
            Statics.method216(arg0, arg0.field630);
            if (field411 > -1 && field399 < field466) {
                field404[field399] = Statics.field787.method3724(arg0.field664) / 2;
                field318[field399] = Statics.field787.field3106;
                field401[field399] = field411;
                field376[field399] = field412;
                field383[field399] = arg0.field641;
                field406[field399] = arg0.field642;
                field553[field399] = arg0.field639;
                field408[field399] = arg0.field664;
                field399++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field646[var32];
            int var34 = arg0.field644[var32];
            class197 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field450) {
                    continue;
                }
                var35 = class197.method955(arg0.field644[var32]);
                var36 = var35.field2877;
                if (var35 != null && var35.field2888 != null) {
                    var35 = var35.method3419();
                    if (var35 == null) {
                        arg0.field646[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field647[var32];
            class197 var38 = null;
            if (var37 >= 0) {
                var38 = class197.method955(var37);
                if (var38 != null && var38.field2888 != null) {
                    var38 = var38.method3419();
                }
            }
            if (var33 - var36 <= field450) {
                if (var35 == null) {
                    arg0.field646[var32] = -1;
                } else {
                    Statics.method216(arg0, arg0.field630 / 2);
                    if (field411 > -1) {
                        if (var32 == 1) {
                            field412 -= 20;
                        }
                        if (var32 == 2) {
                            field411 -= 15;
                            field412 -= 10;
                        }
                        if (var32 == 3) {
                            field411 += 15;
                            field412 -= 10;
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
                            var43 = var64.field3225;
                            int var65 = var64.field3222;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3223;
                        }
                        class225 var66 = var35.method3386();
                        if (var66 != null) {
                            var44 = var66.field3225;
                            int var67 = var66.field3222;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3223;
                        }
                        class225 var68 = var35.method3393();
                        if (var68 != null) {
                            var45 = var68.field3225;
                            int var69 = var68.field3222;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3223;
                        }
                        class225 var70 = var35.method3388();
                        if (var70 != null) {
                            var46 = var70.field3225;
                            int var71 = var70.field3222;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3223;
                        }
                        if (var38 != null) {
                            var51 = var38.method3385();
                            if (var51 != null) {
                                var55 = var51.field3225;
                                int var72 = var51.field3222;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3223;
                            }
                            var52 = var38.method3386();
                            if (var52 != null) {
                                var56 = var52.field3225;
                                int var73 = var52.field3222;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3223;
                            }
                            var53 = var38.method3393();
                            if (var53 != null) {
                                var57 = var53.field3225;
                                int var74 = var53.field3222;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3223;
                            }
                            var54 = var38.method3388();
                            if (var54 != null) {
                                var58 = var54.field3225;
                                int var75 = var54.field3222;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3223;
                            }
                        }
                        class209 var76 = var35.method3416();
                        if (var76 == null) {
                            var76 = Statics.field155;
                        }
                        class209 var77;
                        if (var38 == null) {
                            var77 = Statics.field155;
                        } else {
                            var77 = var38.method3416();
                            if (var77 == null) {
                                var77 = Statics.field155;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method3384(arg0.field645[var32]);
                        int var83 = var76.method3724(var82);
                        if (var38 != null) {
                            var79 = var38.method3384(arg0.field648[var32]);
                            var81 = var77.method3724(var79);
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
                        int var100 = arg0.field646[var32] - field450;
                        int var101 = var35.field2882 - var35.field2882 * var100 / var35.field2877;
                        int var102 = var35.field2883 * var100 / var35.field2877 + -var35.field2883;
                        int var103 = field411 + arg2 - (var92 >> 1) + var101;
                        int var104 = field412 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field2889 + var104 + 15;
                        int var108 = var107 - var76.field3113;
                        int var109 = var76.field3118 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field2889 + var104 + 15;
                            int var111 = var110 - var77.field3113;
                            int var112 = var77.field3118 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field2884 >= 0) {
                            var115 = (var100 << 8) / (var35.field2877 - var35.field2884);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method4009(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method4009(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method4009(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method4009(var93 + var103 - var50, var104, var115);
                            }
                            var76.method3706(var82, var90 + var103, var107, var35.field2878, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4009(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method4009(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method4009(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4009(var97 + var103 - var62, var104, var115);
                                }
                                var77.method3706(var79, var98 + var103, var110, var38.field2878, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method3941(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method3941(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method3941(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method3941(var93 + var103 - var50, var104);
                            }
                            var76.method3705(var82, var90 + var103, var107, var35.field2878 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method3941(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method3941(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method3941(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method3941(var97 + var103 - var62, var104);
                                }
                                var77.method3705(var79, var98 + var103, var110, var38.field2878 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ae.az(B)V")
    public static final void method613() {
        field425 = 0;
        int var0 = (Statics.field792.field638 >> 7) + Statics.field60;
        int var1 = (Statics.field792.field625 >> 7) + Statics.field290;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field425 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field425 = 1;
        }
        if (field425 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field425 = 0;
        }
    }

    @ObfuscatedName("fe.av(IIIB)V")
    public static final void method3101(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field411 = -1;
            field412 = -1;
            return;
        }
        int var3 = method20(arg0, arg1, Statics.field1569) - arg2;
        int var4 = arg0 - Statics.field1445;
        int var5 = var3 - Statics.field799;
        int var6 = arg1 - Statics.field806;
        int var7 = class85.field1469[Statics.field685];
        int var8 = class85.field1463[Statics.field685];
        int var9 = class85.field1469[Statics.field611];
        int var10 = class85.field1463[Statics.field611];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field411 = field572 * var11 / var15 + field570 / 2;
            field412 = field572 * var14 / var15 + field571 / 2;
        } else {
            field411 = -1;
            field412 = -1;
        }
    }

    @ObfuscatedName("h.af(IIIB)I")
    public static final int method20(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class11.field111[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class11.field114[var5][var3][var4] + class11.field114[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class11.field114[var5][var3][var4 + 1] + class11.field114[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("b.ax(IIIIIIB)V")
    public static final void method173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class85.field1469[var6];
            int var12 = class85.field1463[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class85.field1469[var7];
            int var15 = class85.field1463[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1445 = arg0 - var8;
        Statics.field799 = arg1 - var9;
        Statics.field806 = arg2 - var10;
        Statics.field685 = arg3;
        Statics.field611 = arg4;
    }

    @ObfuscatedName("x.bn(ZB)V")
    public static final void method250(boolean arg0) {
        field301 = arg0;
        if (!field301) {
            int var1 = field351.method2702();
            int var2 = field351.method2700();
            int var3 = field351.method2668();
            Statics.field1699 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field1699[var4][var5] = field351.method2798();
                }
            }
            Statics.field1857 = new int[var3];
            Statics.field836 = new int[var3];
            Statics.field2756 = new int[var3];
            Statics.field829 = new byte[var3][];
            Statics.field739 = new byte[var3][];
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
                        Statics.field1857[var7] = var10;
                        Statics.field836[var7] = Statics.field338.method3148("m" + var8 + "_" + var9);
                        Statics.field2756[var7] = Statics.field338.method3148("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method2594(var1, var2);
            return;
        }
        int var11 = field351.method2706();
        int var12 = field351.method2668();
        int var13 = field351.method2668();
        field351.method2895();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field351.method2918(1);
                    if (var17 == 1) {
                        field368[var14][var15][var16] = field351.method2918(26);
                    } else {
                        field368[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field351.method2897();
        Statics.field1699 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field1699[var18][var19] = field351.method2798();
            }
        }
        Statics.field1857 = new int[var13];
        Statics.field836 = new int[var13];
        Statics.field2756 = new int[var13];
        Statics.field829 = new byte[var13][];
        Statics.field739 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field368[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field1857[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field1857[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field836[var20] = Statics.field338.method3148("m" + var29 + "_" + var30);
                            Statics.field2756[var20] = Statics.field338.method3148("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method2594(var12, var11);
    }

    @ObfuscatedName("eo.bp(III)V")
    public static final void method2594(int arg0, int arg1) {
        if (Statics.field2036 == arg0 && Statics.field240 == arg1) {
            return;
        }
        Statics.field2036 = arg0;
        Statics.field240 = arg1;
        method101(25);
        method204(class174.field2371, true);
        int var2 = Statics.field60;
        int var3 = Statics.field290;
        Statics.field60 = (arg0 - 6) * 8;
        Statics.field290 = (arg1 - 6) * 8;
        int var4 = Statics.field60 - var2;
        int var5 = Statics.field290 - var3;
        int var6 = Statics.field60;
        int var7 = Statics.field290;
        for (int var8 = 0; var8 < 32768; var8++) {
            class36 var9 = field484[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field679[var10] -= var4;
                    var9.field629[var10] -= var5;
                }
                var9.field638 -= var4 * 128;
                var9.field625 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class24 var12 = field426[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field679[var13] -= var4;
                    var12.field629[var13] -= var5;
                }
                var12.field638 -= var4 * 128;
                var12.field625 -= var5 * 128;
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
                        field449[var24][var20][var21] = field449[var24][var22][var23];
                    } else {
                        field449[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class26 var25 = (class26) field437.method2319(); var25 != null; var25 = (class26) field437.method2333()) {
            var25.field599 -= var4;
            var25.field596 -= var5;
            if (var25.field599 < 0 || var25.field596 < 0 || var25.field599 >= 104 || var25.field596 >= 104) {
                var25.method2310();
            }
        }
        if (field540 != 0) {
            field540 -= var4;
            field541 -= var5;
        }
        field548 = 0;
        field554 = false;
        field535 = -1;
        field419.method2313();
        field438.method2313();
        for (int var26 = 0; var26 < 4; var26++) {
            field366[var26].method2170();
        }
    }

    @ObfuscatedName("aq.bt(ZB)V")
    public static final void method629(boolean arg0) {
        method92();
        field355++;
        if (field355 < 50 && !arg0) {
            return;
        }
        field355 = 0;
        if (field388 || Statics.field2037 == null) {
            return;
        }
        field349.method2896(8);
        try {
            Statics.field2037.method2013(field349.field2092, 0, field349.field2091);
            field349.field2091 = 0;
        } catch (IOException var2) {
            field388 = true;
        }
    }

    @ObfuscatedName("fp.bj(B)V")
    public static final void method2984() {
        method629(false);
        field361 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field829.length; var1++) {
            if (Statics.field836[var1] != -1 && Statics.field829[var1] == null) {
                Statics.field829[var1] = Statics.field338.method3133(Statics.field836[var1], 0);
                if (Statics.field829[var1] == null) {
                    var0 = false;
                    field361++;
                }
            }
            if (Statics.field2756[var1] != -1 && Statics.field739[var1] == null) {
                Statics.field739[var1] = Statics.field338.method3180(Statics.field2756[var1], 0, Statics.field1699[var1]);
                if (Statics.field739[var1] == null) {
                    var0 = false;
                    field361++;
                }
            }
        }
        if (!var0) {
            field365 = 1;
            return;
        }
        field363 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field829.length; var3++) {
            byte[] var4 = Statics.field739[var3];
            if (var4 != null) {
                int var5 = (Statics.field1857[var3] >> 8) * 64 - Statics.field60;
                int var6 = (Statics.field1857[var3] & 0xFF) * 64 - Statics.field290;
                if (field301) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class154 var9 = new class154(var4);
                int var10 = -1;
                label1159: while (true) {
                    int var11 = var9.method2679();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2679();
                            if (var16 == 0) {
                                continue label1159;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2666() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class198 var22 = class198.method3257(var10);
                                if (var19 != 22 || !field309 || var22.field2913 != 0 || var22.field2944 == 1 || var22.field2941) {
                                    if (!var22.method3428()) {
                                        field363++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2679();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2666();
                    }
                }
            }
        }
        if (!var2) {
            field365 = 2;
            return;
        }
        if (field365 != 0) {
            method204(class174.field2371 + class38.field811 + class38.field815 + 100 + "%" + class38.field809, true);
        }
        method92();
        method3138();
        method92();
        Statics.field970.method1683();
        method92();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field366[var23].method2170();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class11.field111[var24][var25][var26] = 0;
                }
            }
        }
        method92();
        class11.field96 = 99;
        Statics.field97 = new byte[4][104][104];
        Statics.field95 = new byte[4][104][104];
        Statics.field44 = new byte[4][104][104];
        Statics.field108 = new byte[4][104][104];
        Statics.field985 = new int[4][105][105];
        Statics.field119 = new byte[4][105][105];
        Statics.field100 = new int[105][105];
        Statics.field25 = new int[104];
        Statics.field292 = new int[104];
        Statics.field99 = new int[104];
        Statics.field2109 = new int[104];
        Statics.field103 = new int[104];
        int var27 = Statics.field829.length;
        class32.method2126();
        method629(true);
        if (!field301) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field1857[var28] >> 8) * 64 - Statics.field60;
                int var30 = (Statics.field1857[var28] & 0xFF) * 64 - Statics.field290;
                byte[] var31 = Statics.field829[var28];
                if (var31 != null) {
                    method92();
                    Statics.method171(var31, var29, var30, Statics.field2036 * 8 - 48, Statics.field240 * 8 - 48, field366);
                }
            }
            for (int var32 = 0; var32 < var27; var32++) {
                int var33 = (Statics.field1857[var32] >> 8) * 64 - Statics.field60;
                int var34 = (Statics.field1857[var32] & 0xFF) * 64 - Statics.field290;
                byte[] var35 = Statics.field829[var32];
                if (var35 == null && Statics.field240 < 800) {
                    method92();
                    class11.method1938(var33, var34, 64, 64);
                }
            }
            method629(true);
            for (int var36 = 0; var36 < var27; var36++) {
                byte[] var37 = Statics.field739[var36];
                if (var37 != null) {
                    int var38 = (Statics.field1857[var36] >> 8) * 64 - Statics.field60;
                    int var39 = (Statics.field1857[var36] & 0xFF) * 64 - Statics.field290;
                    method92();
                    class88 var40 = Statics.field970;
                    class118[] var41 = field366;
                    class154 var42 = new class154(var37);
                    int var43 = -1;
                    while (true) {
                        int var44 = var42.method2679();
                        if (var44 == 0) {
                            break;
                        }
                        var43 += var44;
                        int var45 = 0;
                        while (true) {
                            int var46 = var42.method2679();
                            if (var46 == 0) {
                                break;
                            }
                            var45 += var46 - 1;
                            int var47 = var45 & 0x3F;
                            int var48 = var45 >> 6 & 0x3F;
                            int var49 = var45 >> 12;
                            int var50 = var42.method2666();
                            int var51 = var50 >> 2;
                            int var52 = var50 & 0x3;
                            int var53 = var38 + var48;
                            int var54 = var39 + var47;
                            if (var53 > 0 && var54 > 0 && var53 < 103 && var54 < 103) {
                                int var55 = var49;
                                if ((class11.field111[1][var53][var54] & 0x2) == 2) {
                                    var55 = var49 - 1;
                                }
                                class118 var56 = null;
                                if (var55 >= 0) {
                                    var56 = var41[var55];
                                }
                                class11.method115(var49, var53, var54, var43, var52, var51, var40, var56);
                            }
                        }
                    }
                }
            }
        }
        if (field301) {
            for (int var57 = 0; var57 < 4; var57++) {
                method92();
                for (int var58 = 0; var58 < 13; var58++) {
                    for (int var59 = 0; var59 < 13; var59++) {
                        boolean var60 = false;
                        int var61 = field368[var57][var58][var59];
                        if (var61 != -1) {
                            int var62 = var61 >> 24 & 0x3;
                            int var63 = var61 >> 1 & 0x3;
                            int var64 = var61 >> 14 & 0x3FF;
                            int var65 = var61 >> 3 & 0x7FF;
                            int var66 = (var64 / 8 << 8) + var65 / 8;
                            for (int var67 = 0; var67 < Statics.field1857.length; var67++) {
                                if (Statics.field1857[var67] == var66 && Statics.field829[var67] != null) {
                                    byte[] var68 = Statics.field829[var67];
                                    int var69 = var58 * 8;
                                    int var70 = var59 * 8;
                                    int var71 = (var64 & 0x7) * 8;
                                    int var72 = (var65 & 0x7) * 8;
                                    class118[] var73 = field366;
                                    for (int var74 = 0; var74 < 8; var74++) {
                                        for (int var75 = 0; var75 < 8; var75++) {
                                            if (var69 + var74 > 0 && var69 + var74 < 103 && var70 + var75 > 0 && var70 + var75 < 103) {
                                                var73[var57].field1842[var69 + var74][var70 + var75] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class154 var76 = new class154(var68);
                                    for (int var77 = 0; var77 < 4; var77++) {
                                        for (int var78 = 0; var78 < 64; var78++) {
                                            for (int var79 = 0; var79 < 64; var79++) {
                                                if (var62 == var77 && var78 >= var71 && var78 < var71 + 8 && var79 >= var72 && var79 < var72 + 8) {
                                                    int var82 = var69 + class169.method952(var78 & 0x7, var79 & 0x7, var63);
                                                    int var84 = var78 & 0x7;
                                                    int var85 = var79 & 0x7;
                                                    int var87 = var63 & 0x3;
                                                    int var88;
                                                    if (var87 == 0) {
                                                        var88 = var85;
                                                    } else if (var87 == 1) {
                                                        var88 = 7 - var84;
                                                    } else if (var87 == 2) {
                                                        var88 = 7 - var85;
                                                    } else {
                                                        var88 = var84;
                                                    }
                                                    class11.method252(var76, var57, var82, var70 + var88, 0, 0, var63);
                                                } else {
                                                    class11.method252(var76, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var60 = true;
                                    break;
                                }
                            }
                        }
                        if (!var60) {
                            class11.method182(var57, var58 * 8, var59 * 8);
                        }
                    }
                }
            }
            for (int var89 = 0; var89 < 13; var89++) {
                for (int var90 = 0; var90 < 13; var90++) {
                    int var91 = field368[0][var89][var90];
                    if (var91 == -1) {
                        class11.method1938(var89 * 8, var90 * 8, 8, 8);
                    }
                }
            }
            method629(true);
            for (int var92 = 0; var92 < 4; var92++) {
                method92();
                for (int var93 = 0; var93 < 13; var93++) {
                    label987: for (int var94 = 0; var94 < 13; var94++) {
                        int var95 = field368[var92][var93][var94];
                        if (var95 != -1) {
                            int var96 = var95 >> 24 & 0x3;
                            int var97 = var95 >> 1 & 0x3;
                            int var98 = var95 >> 14 & 0x3FF;
                            int var99 = var95 >> 3 & 0x7FF;
                            int var100 = (var98 / 8 << 8) + var99 / 8;
                            for (int var101 = 0; var101 < Statics.field1857.length; var101++) {
                                if (Statics.field1857[var101] == var100 && Statics.field739[var101] != null) {
                                    byte[] var102 = Statics.field739[var101];
                                    int var103 = var93 * 8;
                                    int var104 = var94 * 8;
                                    int var105 = (var98 & 0x7) * 8;
                                    int var106 = (var99 & 0x7) * 8;
                                    class88 var107 = Statics.field970;
                                    class118[] var108 = field366;
                                    class154 var109 = new class154(var102);
                                    int var110 = -1;
                                    while (true) {
                                        int var111 = var109.method2679();
                                        if (var111 == 0) {
                                            continue label987;
                                        }
                                        var110 += var111;
                                        int var112 = 0;
                                        while (true) {
                                            int var113 = var109.method2679();
                                            if (var113 == 0) {
                                                break;
                                            }
                                            var112 += var113 - 1;
                                            int var114 = var112 & 0x3F;
                                            int var115 = var112 >> 6 & 0x3F;
                                            int var116 = var112 >> 12;
                                            int var117 = var109.method2666();
                                            int var118 = var117 >> 2;
                                            int var119 = var117 & 0x3;
                                            if (var96 == var116 && var115 >= var105 && var115 < var105 + 8 && var114 >= var106 && var114 < var106 + 8) {
                                                class198 var120 = class198.method3257(var110);
                                                int var122 = var115 & 0x7;
                                                int var123 = var114 & 0x7;
                                                int var125 = var120.field2909;
                                                int var126 = var120.field2917;
                                                if ((var119 & 0x1) == 1) {
                                                    int var127 = var125;
                                                    var125 = var126;
                                                    var126 = var127;
                                                }
                                                int var128 = var97 & 0x3;
                                                int var129;
                                                if (var128 == 0) {
                                                    var129 = var122;
                                                } else if (var128 == 1) {
                                                    var129 = var123;
                                                } else if (var128 == 2) {
                                                    var129 = 7 - var122 - (var125 - 1);
                                                } else {
                                                    var129 = 7 - var123 - (var126 - 1);
                                                }
                                                int var130 = var103 + var129;
                                                int var131 = var104 + class169.method1680(var115 & 0x7, var114 & 0x7, var97, var120.field2909, var120.field2917, var119);
                                                if (var130 > 0 && var131 > 0 && var130 < 103 && var131 < 103) {
                                                    int var132 = var92;
                                                    if ((class11.field111[1][var130][var131] & 0x2) == 2) {
                                                        var132 = var92 - 1;
                                                    }
                                                    class118 var133 = null;
                                                    if (var132 >= 0) {
                                                        var133 = var108[var132];
                                                    }
                                                    class11.method115(var92, var130, var131, var110, var97 + var119 & 0x3, var118, var107, var133);
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
        method629(true);
        method3138();
        method92();
        class88 var134 = Statics.field970;
        class118[] var135 = field366;
        for (int var136 = 0; var136 < 4; var136++) {
            for (int var137 = 0; var137 < 104; var137++) {
                for (int var138 = 0; var138 < 104; var138++) {
                    if ((class11.field111[var136][var137][var138] & 0x1) == 1) {
                        int var139 = var136;
                        if ((class11.field111[1][var137][var138] & 0x2) == 2) {
                            var139 = var136 - 1;
                        }
                        if (var139 >= 0) {
                            var135[var139].method2173(var137, var138);
                        }
                    }
                }
            }
        }
        class11.field101 += (int) (Math.random() * 5.0D) - 2;
        if (class11.field101 < -8) {
            class11.field101 = -8;
        }
        if (class11.field101 > 8) {
            class11.field101 = 8;
        }
        class11.field113 += (int) (Math.random() * 5.0D) - 2;
        if (class11.field113 < -16) {
            class11.field113 = -16;
        }
        if (class11.field113 > 16) {
            class11.field113 = 16;
        }
        for (int var140 = 0; var140 < 4; var140++) {
            byte[][] var141 = Statics.field119[var140];
            int var142 = (int) Math.sqrt(5100.0D);
            int var143 = var142 * 768 >> 8;
            for (int var144 = 1; var144 < 103; var144++) {
                for (int var145 = 1; var145 < 103; var145++) {
                    int var146 = class11.field114[var140][var145 + 1][var144] - class11.field114[var140][var145 - 1][var144];
                    int var147 = class11.field114[var140][var145][var144 + 1] - class11.field114[var140][var145][var144 - 1];
                    int var148 = (int) Math.sqrt((double) (var147 * var147 + var146 * var146 + 65536));
                    int var149 = (var146 << 8) / var148;
                    int var150 = 65536 / var148;
                    int var151 = (var147 << 8) / var148;
                    int var152 = (var151 * -50 + var149 * -50 + var150 * -10) / var143 + 96;
                    int var153 = (var141[var145][var144] >> 1) + (var141[var145][var144 + 1] >> 3) + (var141[var145][var144 - 1] >> 2) + (var141[var145 - 1][var144] >> 2) + (var141[var145 + 1][var144] >> 3);
                    Statics.field100[var145][var144] = var152 - var153;
                }
            }
            for (int var154 = 0; var154 < 104; var154++) {
                Statics.field25[var154] = 0;
                Statics.field292[var154] = 0;
                Statics.field99[var154] = 0;
                Statics.field2109[var154] = 0;
                Statics.field103[var154] = 0;
            }
            for (int var155 = -5; var155 < 109; var155++) {
                for (int var156 = 0; var156 < 104; var156++) {
                    int var157 = var155 + 5;
                    int var10002;
                    if (var157 >= 0 && var157 < 104) {
                        int var158 = Statics.field97[var140][var157][var156] & 0xFF;
                        if (var158 > 0) {
                            int var159 = var158 - 1;
                            class192 var160 = (class192) class192.field2818.method2258((long) var159);
                            class192 var161;
                            if (var160 == null) {
                                byte[] var162 = Statics.field2042.method3133(1, var159);
                                class192 var163 = new class192();
                                if (var162 != null) {
                                    var163.method3292(new class154(var162), var159);
                                }
                                var163.method3291();
                                class192.field2818.method2248(var163, (long) var159);
                                var161 = var163;
                            } else {
                                var161 = var160;
                            }
                            Statics.field25[var156] += var161.field2815;
                            Statics.field292[var156] += var161.field2813;
                            Statics.field99[var156] += var161.field2817;
                            Statics.field2109[var156] += var161.field2816;
                            var10002 = Statics.field103[var156]++;
                        }
                    }
                    int var165 = var155 - 5;
                    if (var165 >= 0 && var165 < 104) {
                        int var166 = Statics.field97[var140][var165][var156] & 0xFF;
                        if (var166 > 0) {
                            int var167 = var166 - 1;
                            class192 var168 = (class192) class192.field2818.method2258((long) var167);
                            class192 var169;
                            if (var168 == null) {
                                byte[] var170 = Statics.field2042.method3133(1, var167);
                                class192 var171 = new class192();
                                if (var170 != null) {
                                    var171.method3292(new class154(var170), var167);
                                }
                                var171.method3291();
                                class192.field2818.method2248(var171, (long) var167);
                                var169 = var171;
                            } else {
                                var169 = var168;
                            }
                            Statics.field25[var156] -= var169.field2815;
                            Statics.field292[var156] -= var169.field2813;
                            Statics.field99[var156] -= var169.field2817;
                            Statics.field2109[var156] -= var169.field2816;
                            var10002 = Statics.field103[var156]--;
                        }
                    }
                }
                if (var155 >= 1 && var155 < 103) {
                    int var173 = 0;
                    int var174 = 0;
                    int var175 = 0;
                    int var176 = 0;
                    int var177 = 0;
                    for (int var178 = -5; var178 < 109; var178++) {
                        int var179 = var178 + 5;
                        if (var179 >= 0 && var179 < 104) {
                            var173 += Statics.field25[var179];
                            var174 += Statics.field292[var179];
                            var175 += Statics.field99[var179];
                            var176 += Statics.field2109[var179];
                            var177 += Statics.field103[var179];
                        }
                        int var180 = var178 - 5;
                        if (var180 >= 0 && var180 < 104) {
                            var173 -= Statics.field25[var180];
                            var174 -= Statics.field292[var180];
                            var175 -= Statics.field99[var180];
                            var176 -= Statics.field2109[var180];
                            var177 -= Statics.field103[var180];
                        }
                        if (var178 >= 1 && var178 < 103 && (!field309 || (class11.field111[0][var155][var178] & 0x2) != 0 || (class11.field111[var140][var155][var178] & 0x10) == 0)) {
                            if (var140 < class11.field96) {
                                class11.field96 = var140;
                            }
                            int var181 = Statics.field97[var140][var155][var178] & 0xFF;
                            int var182 = Statics.field95[var140][var155][var178] & 0xFF;
                            if (var181 > 0 || var182 > 0) {
                                int var183 = class11.field114[var140][var155][var178];
                                int var184 = class11.field114[var140][var155 + 1][var178];
                                int var185 = class11.field114[var140][var155 + 1][var178 + 1];
                                int var186 = class11.field114[var140][var155][var178 + 1];
                                int var187 = Statics.field100[var155][var178];
                                int var188 = Statics.field100[var155 + 1][var178];
                                int var189 = Statics.field100[var155 + 1][var178 + 1];
                                int var190 = Statics.field100[var155][var178 + 1];
                                int var191 = -1;
                                int var192 = -1;
                                if (var181 > 0) {
                                    int var193 = var173 * 256 / var176;
                                    int var194 = var174 / var177;
                                    int var195 = var175 / var177;
                                    var191 = class11.method671(var193, var194, var195);
                                    int var196 = class11.field101 + var193 & 0xFF;
                                    int var197 = class11.field113 + var195;
                                    if (var197 < 0) {
                                        var197 = 0;
                                    } else if (var197 > 255) {
                                        var197 = 255;
                                    }
                                    var192 = class11.method671(var196, var194, var197);
                                }
                                if (var140 > 0) {
                                    boolean var198 = true;
                                    if (var181 == 0 && Statics.field44[var140][var155][var178] != 0) {
                                        var198 = false;
                                    }
                                    if (var182 > 0 && !class201.method3540(var182 - 1).field3041) {
                                        var198 = false;
                                    }
                                    if (var198 && var183 == var184 && var183 == var185 && var183 == var186) {
                                        Statics.field985[var140][var155][var178] |= 0x924;
                                    }
                                }
                                int var199 = 0;
                                if (var192 != -1) {
                                    var199 = class85.field1465[class11.method2120(var192, 96)];
                                }
                                if (var182 == 0) {
                                    var134.method1687(var140, var155, var178, 0, 0, -1, var183, var184, var185, var186, class11.method2120(var191, var187), class11.method2120(var191, var188), class11.method2120(var191, var189), class11.method2120(var191, var190), 0, 0, 0, 0, var199, 0);
                                } else {
                                    int var200 = Statics.field44[var140][var155][var178] + 1;
                                    byte var201 = Statics.field108[var140][var155][var178];
                                    int var202 = var182 - 1;
                                    class201 var203 = (class201) class201.field3042.method2258((long) var202);
                                    class201 var204;
                                    if (var203 == null) {
                                        byte[] var205 = Statics.field3039.method3133(4, var202);
                                        class201 var206 = new class201();
                                        if (var205 != null) {
                                            var206.method3561(new class154(var205), var202);
                                        }
                                        var206.method3560();
                                        class201.field3042.method2248(var206, (long) var202);
                                        var204 = var206;
                                    } else {
                                        var204 = var203;
                                    }
                                    int var208 = var204.field3040;
                                    int var209;
                                    int var210;
                                    if (var208 >= 0) {
                                        var209 = Statics.field1466.method1444(var208);
                                        var210 = -1;
                                    } else if (var204.field3051 == 16711935) {
                                        var210 = -2;
                                        var208 = -1;
                                        var209 = -2;
                                    } else {
                                        var210 = class11.method671(var204.field3045, var204.field3046, var204.field3047);
                                        int var211 = class11.field101 + var204.field3045 & 0xFF;
                                        int var212 = class11.field113 + var204.field3047;
                                        if (var212 < 0) {
                                            var212 = 0;
                                        } else if (var212 > 255) {
                                            var212 = 255;
                                        }
                                        var209 = class11.method671(var211, var204.field3046, var212);
                                    }
                                    int var213 = 0;
                                    if (var209 != -2) {
                                        var213 = class85.field1465[Statics.method153(var209, 96)];
                                    }
                                    if (var204.field3044 != -1) {
                                        int var214 = class11.field101 + var204.field3048 & 0xFF;
                                        int var215 = class11.field113 + var204.field3050;
                                        if (var215 < 0) {
                                            var215 = 0;
                                        } else if (var215 > 255) {
                                            var215 = 255;
                                        }
                                        int var216 = class11.method671(var214, var204.field3049, var215);
                                        var213 = class85.field1465[Statics.method153(var216, 96)];
                                    }
                                    var134.method1687(var140, var155, var178, var200, var201, var208, var183, var184, var185, var186, class11.method2120(var191, var187), class11.method2120(var191, var188), class11.method2120(var191, var189), class11.method2120(var191, var190), Statics.method153(var210, var187), Statics.method153(var210, var188), Statics.method153(var210, var189), Statics.method153(var210, var190), var199, var213);
                                }
                            }
                        }
                    }
                }
            }
            for (int var217 = 1; var217 < 103; var217++) {
                for (int var218 = 1; var218 < 103; var218++) {
                    var134.method1686(var140, var218, var217, class11.method1187(var140, var218, var217));
                }
            }
            Statics.field97[var140] = (byte[][]) null;
            Statics.field95[var140] = (byte[][]) null;
            Statics.field44[var140] = (byte[][]) null;
            Statics.field108[var140] = (byte[][]) null;
            Statics.field119[var140] = (byte[][]) null;
        }
        var134.method1713(-50, -10, -50);
        for (int var219 = 0; var219 < 104; var219++) {
            for (int var220 = 0; var220 < 104; var220++) {
                if ((class11.field111[1][var219][var220] & 0x2) == 2) {
                    var134.method1701(var219, var220);
                }
            }
        }
        int var221 = 1;
        int var222 = 2;
        int var223 = 4;
        for (int var224 = 0; var224 < 4; var224++) {
            if (var224 > 0) {
                var221 <<= 0x3;
                var222 <<= 0x3;
                var223 <<= 0x3;
            }
            for (int var225 = 0; var225 <= var224; var225++) {
                for (int var226 = 0; var226 <= 104; var226++) {
                    for (int var227 = 0; var227 <= 104; var227++) {
                        if ((Statics.field985[var225][var227][var226] & var221) != 0) {
                            int var228 = var226;
                            int var229 = var226;
                            int var230 = var225;
                            int var231 = var225;
                            while (var228 > 0 && (Statics.field985[var225][var227][var228 - 1] & var221) != 0) {
                                var228--;
                            }
                            while (var229 < 104 && (Statics.field985[var225][var227][var229 + 1] & var221) != 0) {
                                var229++;
                            }
                            label722: while (var230 > 0) {
                                for (int var232 = var228; var232 <= var229; var232++) {
                                    if ((Statics.field985[var230 - 1][var227][var232] & var221) == 0) {
                                        break label722;
                                    }
                                }
                                var230--;
                            }
                            label711: while (var231 < var224) {
                                for (int var233 = var228; var233 <= var229; var233++) {
                                    if ((Statics.field985[var231 + 1][var227][var233] & var221) == 0) {
                                        break label711;
                                    }
                                }
                                var231++;
                            }
                            int var234 = (var231 + 1 - var230) * (var229 - var228 + 1);
                            if (var234 >= 8) {
                                short var235 = 240;
                                int var236 = class11.field114[var231][var227][var228] - var235;
                                int var237 = class11.field114[var230][var227][var228];
                                class88.method1685(var224, 1, var227 * 128, var227 * 128, var228 * 128, var229 * 128 + 128, var236, var237);
                                for (int var238 = var230; var238 <= var231; var238++) {
                                    for (int var239 = var228; var239 <= var229; var239++) {
                                        Statics.field985[var238][var227][var239] &= ~var221;
                                    }
                                }
                            }
                        }
                        if ((Statics.field985[var225][var227][var226] & var222) != 0) {
                            int var240 = var227;
                            int var241 = var227;
                            int var242 = var225;
                            int var243 = var225;
                            while (var240 > 0 && (Statics.field985[var225][var240 - 1][var226] & var222) != 0) {
                                var240--;
                            }
                            while (var241 < 104 && (Statics.field985[var225][var241 + 1][var226] & var222) != 0) {
                                var241++;
                            }
                            label775: while (var242 > 0) {
                                for (int var244 = var240; var244 <= var241; var244++) {
                                    if ((Statics.field985[var242 - 1][var244][var226] & var222) == 0) {
                                        break label775;
                                    }
                                }
                                var242--;
                            }
                            label764: while (var243 < var224) {
                                for (int var245 = var240; var245 <= var241; var245++) {
                                    if ((Statics.field985[var243 + 1][var245][var226] & var222) == 0) {
                                        break label764;
                                    }
                                }
                                var243++;
                            }
                            int var246 = (var243 + 1 - var242) * (var241 - var240 + 1);
                            if (var246 >= 8) {
                                short var247 = 240;
                                int var248 = class11.field114[var243][var240][var226] - var247;
                                int var249 = class11.field114[var242][var240][var226];
                                class88.method1685(var224, 2, var240 * 128, var241 * 128 + 128, var226 * 128, var226 * 128, var248, var249);
                                for (int var250 = var242; var250 <= var243; var250++) {
                                    for (int var251 = var240; var251 <= var241; var251++) {
                                        Statics.field985[var250][var251][var226] &= ~var222;
                                    }
                                }
                            }
                        }
                        if ((Statics.field985[var225][var227][var226] & var223) != 0) {
                            int var252 = var227;
                            int var253 = var227;
                            int var254 = var226;
                            int var255 = var226;
                            while (var254 > 0 && (Statics.field985[var225][var227][var254 - 1] & var223) != 0) {
                                var254--;
                            }
                            while (var255 < 104 && (Statics.field985[var225][var227][var255 + 1] & var223) != 0) {
                                var255++;
                            }
                            label828: while (var252 > 0) {
                                for (int var256 = var254; var256 <= var255; var256++) {
                                    if ((Statics.field985[var225][var252 - 1][var256] & var223) == 0) {
                                        break label828;
                                    }
                                }
                                var252--;
                            }
                            label817: while (var253 < 104) {
                                for (int var257 = var254; var257 <= var255; var257++) {
                                    if ((Statics.field985[var225][var253 + 1][var257] & var223) == 0) {
                                        break label817;
                                    }
                                }
                                var253++;
                            }
                            if ((var253 - var252 + 1) * (var255 - var254 + 1) >= 4) {
                                int var258 = class11.field114[var225][var252][var254];
                                class88.method1685(var224, 4, var252 * 128, var253 * 128 + 128, var254 * 128, var255 * 128 + 128, var258, var258);
                                for (int var259 = var252; var259 <= var253; var259++) {
                                    for (int var260 = var254; var260 <= var255; var260++) {
                                        Statics.field985[var225][var259][var260] &= ~var223;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method629(true);
        int var261 = class11.field96;
        if (var261 > Statics.field1569) {
            var261 = Statics.field1569;
        }
        if (var261 < Statics.field1569 - 1) {
            int var262 = Statics.field1569 - 1;
        }
        if (field309) {
            Statics.field970.method1684(class11.field96);
        } else {
            Statics.field970.method1684(0);
        }
        for (int var263 = 0; var263 < 104; var263++) {
            for (int var264 = 0; var264 < 104; var264++) {
                method1881(var263, var264);
            }
        }
        method92();
        for (class26 var265 = (class26) field437.method2319(); var265 != null; var265 = (class26) field437.method2333()) {
            if (var265.field604 == -1) {
                var265.field603 = 0;
                method1962(var265);
            } else {
                var265.method2310();
            }
        }
        class198.field2897.method2249();
        if (Statics.field40 != null) {
            field349.method2896(59);
            field349.method2654(1057001181);
        }
        if (!field301) {
            int var266 = (Statics.field2036 - 6) / 8;
            int var267 = (Statics.field2036 + 6) / 8;
            int var268 = (Statics.field240 - 6) / 8;
            int var269 = (Statics.field240 + 6) / 8;
            for (int var270 = var266 - 1; var270 <= var267 + 1; var270++) {
                for (int var271 = var268 - 1; var271 <= var269 + 1; var271++) {
                    if (var270 < var266 || var270 > var267 || var271 < var268 || var271 > var269) {
                        Statics.field338.method3136("m" + var270 + "_" + var271);
                        Statics.field338.method3136("l" + var270 + "_" + var271);
                    }
                }
            }
        }
        method101(30);
        method92();
        Statics.field97 = (byte[][][]) null;
        Statics.field95 = (byte[][][]) null;
        Statics.field44 = (byte[][][]) null;
        Statics.field108 = (byte[][][]) null;
        Statics.field985 = (int[][][]) null;
        Statics.field119 = (byte[][][]) null;
        Statics.field100 = (int[][]) null;
        Statics.field25 = null;
        Statics.field292 = null;
        Statics.field99 = null;
        Statics.field2109 = null;
        Statics.field103 = null;
        field349.method2896(5);
        Statics.field2136.method1899();
        for (int var272 = 0; var272 < 32; var272++) {
            field1777[var272] = 0L;
        }
        for (int var273 = 0; var273 < 32; var273++) {
            field1772[var273] = 0L;
        }
        Statics.field945 = 0;
    }

    @ObfuscatedName("aw.bw(II)V")
    public static final void method813(int arg0) {
        int[] var1 = Statics.field184.field3227;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class11.field111[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field970.method1716(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class11.field111[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field970.method1716(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field184.method3960();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class11.field111[arg0][var10][var9] & 0x18) == 0) {
                    method195(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class11.field111[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method195(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field513 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field970.method1711(Statics.field1569, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class198.method3257(var14).field2922;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field366[Statics.field1569].field1842;
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
                        field539[field513] = Statics.field1356[var15];
                        field537[field513] = var16;
                        field538[field513] = var17;
                        field513++;
                    }
                }
            }
        }
        Statics.field691.method3884();
    }

    @ObfuscatedName("t.bd(IIIIII)V")
    public static final void method195(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field970.method1708(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field970.method1712(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field184.field3227;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class198 var13 = class198.method3257(var12);
            if (var13.field2934 == -1) {
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
                class223 var14 = Statics.field742[var13.field2934];
                if (var14 != null) {
                    int var15 = (var13.field2909 * 4 - var14.field3211) / 2;
                    int var16 = (var13.field2917 * 4 - var14.field3209) / 2;
                    var14.method3904(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field2917) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field970.method1813(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field970.method1712(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class198 var22 = class198.method3257(var21);
            if (var22.field2934 != -1) {
                class223 var23 = Statics.field742[var22.field2934];
                if (var23 != null) {
                    int var24 = (var22.field2909 * 4 - var23.field3211) / 2;
                    int var25 = (var22.field2917 * 4 - var23.field3209) / 2;
                    var23.method3904(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field2917) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field184.field3227;
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
        int var29 = Statics.field970.method1711(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class198 var31 = class198.method3257(var30);
        if (var31.field2934 == -1) {
            return;
        }
        class223 var32 = Statics.field742[var31.field2934];
        if (var32 != null) {
            int var33 = (var31.field2909 * 4 - var32.field3211) / 2;
            int var34 = (var31.field2917 * 4 - var32.field3209) / 2;
            var32.method3904(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field2917) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("cg.bu(B)Z")
    public static final boolean method1882() {
        if (Statics.field2037 == null) {
            return false;
        }
        try {
            int var0 = Statics.field2037.method2027();
            if (var0 == 0) {
                return false;
            }
            if (field353 == -1) {
                Statics.field2037.method2016(field351.field2092, 0, 1);
                field351.field2091 = 0;
                field353 = field351.method2892();
                field352 = class213.field3150[field353];
                var0--;
            }
            if (field352 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field2037.method2016(field351.field2092, 0, 1);
                field352 = field351.field2092[0] & 0xFF;
                var0--;
            }
            if (field352 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field2037.method2016(field351.field2092, 0, 2);
                field351.field2091 = 0;
                field352 = field351.method2668();
                var0 -= 2;
            }
            if (var0 < field352) {
                return false;
            }
            field351.field2091 = 0;
            Statics.field2037.method2016(field351.field2092, 0, field352);
            field560 = 0;
            field575 = field357;
            field357 = field356;
            field356 = field353;
            if (field353 == 38) {
                field554 = true;
                Statics.field2117 = field351.method2666();
                Statics.field2087 = field351.method2666();
                Statics.field1581 = field351.method2668();
                Statics.field46 = field351.method2666();
                Statics.field874 = field351.method2666();
                if (Statics.field874 >= 100) {
                    Statics.field1445 = Statics.field2117 * 128 + 64;
                    Statics.field806 = Statics.field2087 * 128 + 64;
                    Statics.field799 = method20(Statics.field1445, Statics.field806, Statics.field1569) - Statics.field1581;
                }
                field353 = -1;
                return true;
            }
            if (field353 == 171) {
                int var1 = field351.method2706();
                int var2 = field351.method2711();
                int var3 = field351.method2668();
                int var4 = field351.method2668();
                class170 var5 = class170.method3109(var2);
                if (var5.field2257 != var1 || var5.field2258 != var4 || var5.field2260 != var3) {
                    var5.field2257 = var1;
                    var5.field2258 = var4;
                    var5.field2260 = var3;
                    method3099(var5);
                }
                field353 = -1;
                return true;
            }
            if (field353 == 212) {
                int var6 = field351.method2700();
                class13.method2600(var6);
                field494[++field495 - 1 & 0x1F] = var6 & 0x7FFF;
                field353 = -1;
                return true;
            }
            if (field353 == 207) {
                method2116(true);
                field353 = -1;
                return true;
            }
            if (field353 == 170) {
                String var7 = field351.method2701();
                long var8 = field351.method2652();
                long var10 = (long) field351.method2668();
                long var12 = (long) field351.method2718();
                class178 var14 = (class178) class149.method2203(class178.method180(), field351.method2666());
                long var15 = (var10 << 32) + var12;
                boolean var17 = false;
                for (int var18 = 0; var18 < 100; var18++) {
                    if (field430[var18] == var15) {
                        var17 = true;
                        break;
                    }
                }
                if (var14.field2672 && Statics.method207(var7)) {
                    var17 = true;
                }
                if (!var17 && field425 == 0) {
                    field430[field558] = var15;
                    field558 = (field558 + 1) % 100;
                    String var19 = class210.method3761(class208.method772(class211.method1446(field351)));
                    if (var14.field2670 == -1) {
                        class48.method2037(9, var7, var19, class206.method2047(var8));
                    } else {
                        int var20 = var14.field2670;
                        String var21 = "<img=" + var20 + ">";
                        class48.method2037(9, var21 + var7, var19, class206.method2047(var8));
                    }
                }
                field353 = -1;
                return true;
            }
            if (field353 == 125) {
                int var22 = field351.method2666();
                int var23 = field351.method2666();
                int var24 = field351.method2666();
                int var25 = field351.method2666();
                field555[var22] = true;
                field328[var22] = var23;
                field528[var22] = var24;
                field312[var22] = var25;
                field559[var22] = 0;
                field353 = -1;
                return true;
            }
            if (field353 == 245) {
                int var26 = field351.method2666();
                if (field351.method2666() == 0) {
                    field582[var26] = new class5();
                    field351.field2091 += 18;
                } else {
                    field351.field2091--;
                    field582[var26] = new class5(field351, false);
                }
                field501 = field491;
                field353 = -1;
                return true;
            }
            if (field353 == 76) {
                method602();
                field471 = field351.method2666();
                field503 = field491;
                field353 = -1;
                return true;
            }
            if (field353 == 130) {
                field552 = field351.method2666();
                if (field552 == 1) {
                    field325 = field351.method2668();
                }
                if (field552 >= 2 && field552 <= 6) {
                    if (field552 == 2) {
                        field330 = 64;
                        field331 = 64;
                    }
                    if (field552 == 3) {
                        field330 = 0;
                        field331 = 64;
                    }
                    if (field552 == 4) {
                        field330 = 128;
                        field331 = 64;
                    }
                    if (field552 == 5) {
                        field330 = 64;
                        field331 = 0;
                    }
                    if (field552 == 6) {
                        field330 = 64;
                        field331 = 128;
                    }
                    field552 = 2;
                    field327 = field351.method2668();
                    field521 = field351.method2668();
                    field329 = field351.method2666();
                }
                if (field552 == 10) {
                    field326 = field351.method2668();
                }
                field353 = -1;
                return true;
            }
            if (field353 == 169) {
                boolean var27 = field351.method2666() == 1;
                if (var27) {
                    Statics.field767 = class156.method12() - field351.method2652();
                    Statics.field1704 = new class2(field351, true);
                } else {
                    Statics.field1704 = null;
                }
                field441 = field491;
                field353 = -1;
                return true;
            }
            if (field353 == 5) {
                while (field351.field2091 < field352) {
                    int var28 = field351.method2666();
                    boolean var29 = (var28 & 0x1) == 1;
                    String var30 = field351.method2701();
                    String var31 = field351.method2701();
                    field351.method2701();
                    for (int var32 = 0; var32 < field577; var32++) {
                        class20 var33 = field505[var32];
                        if (var29) {
                            if (var31.equals(var33.field223)) {
                                var33.field223 = var30;
                                var33.field218 = var31;
                                var30 = null;
                                break;
                            }
                        } else if (var30.equals(var33.field223)) {
                            var33.field223 = var30;
                            var33.field218 = var31;
                            var30 = null;
                            break;
                        }
                    }
                    if (var30 != null && field577 < 400) {
                        class20 var34 = new class20();
                        field505[field577] = var34;
                        var34.field223 = var30;
                        var34.field218 = var31;
                        field577++;
                    }
                }
                field452 = field491;
                field353 = -1;
                return true;
            }
            if (field353 == 43) {
                int var35 = field351.method2712();
                int var36 = field351.method2700();
                class170 var37 = class170.method3109(var35);
                if (var37 != null && var37.field2208 == 0) {
                    if (var36 > var37.field2248 - var37.field2196) {
                        var36 = var37.field2248 - var37.field2196;
                    }
                    if (var36 < 0) {
                        var36 = 0;
                    }
                    if (var37.field2252 != var36) {
                        var37.field2252 = var36;
                        method3099(var37);
                    }
                }
                field353 = -1;
                return true;
            }
            if (field353 == 53) {
                Statics.field2675 = class217.method2128(field351.method2666());
                field353 = -1;
                return true;
            }
            if (field353 == 113) {
                int var38 = field351.method2798();
                int var39 = field351.method2668();
                if (var38 < -70000) {
                    var39 += 32768;
                }
                class170 var40;
                if (var38 >= 0) {
                    var40 = class170.method3109(var38);
                } else {
                    var40 = null;
                }
                while (field351.field2091 < field352) {
                    int var41 = field351.method2679();
                    int var42 = field351.method2668();
                    int var43 = 0;
                    if (var42 != 0) {
                        var43 = field351.method2666();
                        if (var43 == 255) {
                            var43 = field351.method2798();
                        }
                    }
                    if (var40 != null && var41 >= 0 && var41 < var40.field2324.length) {
                        var40.field2324[var41] = var42;
                        var40.field2325[var41] = var43;
                    }
                    class13.method706(var39, var41, var42 - 1, var43);
                }
                if (var40 != null) {
                    method3099(var40);
                }
                method602();
                field494[++field495 - 1 & 0x1F] = var39 & 0x7FFF;
                field353 = -1;
                return true;
            }
            if (field353 == 68) {
                Statics.field82 = field351.method2694();
                Statics.field2705 = field351.method2730();
                for (int var44 = Statics.field2705; var44 < Statics.field2705 + 8; var44++) {
                    for (int var45 = Statics.field82; var45 < Statics.field82 + 8; var45++) {
                        if (field449[Statics.field1569][var44][var45] != null) {
                            field449[Statics.field1569][var44][var45] = null;
                            method1881(var44, var45);
                        }
                    }
                }
                for (class26 var46 = (class26) field437.method2319(); var46 != null; var46 = (class26) field437.method2333()) {
                    if (var46.field599 >= Statics.field2705 && var46.field599 < Statics.field2705 + 8 && var46.field596 >= Statics.field82 && var46.field596 < Statics.field82 + 8 && Statics.field1569 == var46.field595) {
                        var46.field604 = 0;
                    }
                }
                field353 = -1;
                return true;
            }
            if (field353 == 2) {
                class160 var47 = field351;
                int var48 = field352;
                class227 var49 = new class227();
                var49.field3243 = var47.method2666();
                var49.field3238 = var47.method2798();
                var49.field3236 = new int[var49.field3243];
                var49.field3239 = new int[var49.field3243];
                var49.field3240 = new Field[var49.field3243];
                var49.field3241 = new int[var49.field3243];
                var49.field3242 = new Method[var49.field3243];
                var49.field3237 = new byte[var49.field3243][][];
                for (int var50 = 0; var50 < var49.field3243; var50++) {
                    try {
                        int var51 = var47.method2666();
                        if (var51 == 0 || var51 == 1 || var51 == 2) {
                            String var52 = var47.method2701();
                            String var53 = var47.method2701();
                            int var54 = 0;
                            if (var51 == 1) {
                                var54 = var47.method2798();
                            }
                            var49.field3236[var50] = var51;
                            var49.field3241[var50] = var54;
                            if (class228.method2514(var52).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var49.field3240[var50] = class228.method2514(var52).getDeclaredField(var53);
                        } else if (var51 == 3 || var51 == 4) {
                            String var55 = var47.method2701();
                            String var56 = var47.method2701();
                            int var57 = var47.method2666();
                            String[] var58 = new String[var57];
                            for (int var59 = 0; var59 < var57; var59++) {
                                var58[var59] = var47.method2701();
                            }
                            String var60 = var47.method2701();
                            byte[][] var61 = new byte[var57][];
                            if (var51 == 3) {
                                for (int var62 = 0; var62 < var57; var62++) {
                                    int var63 = var47.method2798();
                                    var61[var62] = new byte[var63];
                                    var47.method2843(var61[var62], 0, var63);
                                }
                            }
                            var49.field3236[var50] = var51;
                            Class[] var64 = new Class[var57];
                            for (int var65 = 0; var65 < var57; var65++) {
                                var64[var65] = class228.method2514(var58[var65]);
                            }
                            Class var66 = class228.method2514(var60);
                            if (class228.method2514(var55).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var67 = class228.method2514(var55).getDeclaredMethods();
                            Method[] var68 = var67;
                            for (int var69 = 0; var69 < var68.length; var69++) {
                                Method var70 = var68[var69];
                                if (var70.getName().equals(var56)) {
                                    Class[] var71 = var70.getParameterTypes();
                                    if (var64.length == var71.length) {
                                        boolean var72 = true;
                                        for (int var73 = 0; var73 < var64.length; var73++) {
                                            if (var64[var73] != var71[var73]) {
                                                var72 = false;
                                                break;
                                            }
                                        }
                                        if (var72 && var66 == var70.getReturnType()) {
                                            var49.field3242[var50] = var70;
                                        }
                                    }
                                }
                            }
                            var49.field3237[var50] = var61;
                        }
                    } catch (ClassNotFoundException var397) {
                        var49.field3239[var50] = -1;
                    } catch (SecurityException var398) {
                        var49.field3239[var50] = -2;
                    } catch (NullPointerException var399) {
                        var49.field3239[var50] = -3;
                    } catch (Exception var400) {
                        var49.field3239[var50] = -4;
                    } catch (Throwable var401) {
                        var49.field3239[var50] = -5;
                    }
                }
                class228.field3246.method2296(var49);
                field353 = -1;
                return true;
            }
            if (field353 == 65) {
                method2116(false);
                field353 = -1;
                return true;
            }
            if (field353 == 126) {
                field540 = field351.method2666();
                if (field540 == 255) {
                    field540 = 0;
                }
                field541 = field351.method2666();
                if (field541 == 255) {
                    field541 = 0;
                }
                field353 = -1;
                return true;
            }
            if (field353 == 14) {
                String var79 = field351.method2701();
                long var80 = (long) field351.method2668();
                long var82 = (long) field351.method2718();
                class178 var84 = (class178) class149.method2203(class178.method180(), field351.method2666());
                long var85 = (var80 << 32) + var82;
                boolean var87 = false;
                for (int var88 = 0; var88 < 100; var88++) {
                    if (field430[var88] == var85) {
                        var87 = true;
                        break;
                    }
                }
                if (Statics.method207(var79)) {
                    var87 = true;
                }
                if (!var87 && field425 == 0) {
                    field430[field558] = var85;
                    field558 = (field558 + 1) % 100;
                    String var89 = class210.method3761(class208.method772(class211.method1446(field351)));
                    byte var90;
                    if (var84.field2671) {
                        var90 = 7;
                    } else {
                        var90 = 3;
                    }
                    if (var84.field2670 == -1) {
                        class48.method187(var90, var79, var89);
                    } else {
                        int var92 = var84.field2670;
                        String var93 = "<img=" + var92 + ">";
                        class48.method187(var90, var93 + var79, var89);
                    }
                }
                field353 = -1;
                return true;
            }
            if (field353 == 112) {
                for (int var94 = 0; var94 < field426.length; var94++) {
                    if (field426[var94] != null) {
                        field426[var94].field656 = -1;
                    }
                }
                for (int var95 = 0; var95 < field484.length; var95++) {
                    if (field484[var95] != null) {
                        field484[var95].field656 = -1;
                    }
                }
                field353 = -1;
                return true;
            }
            if (field353 == 105) {
                int var96 = field351.method2798();
                class18 var97 = (class18) field467.method2260((long) var96);
                if (var97 != null) {
                    method669(var97, true);
                }
                if (field470 != null) {
                    method3099(field470);
                    field470 = null;
                }
                field353 = -1;
                return true;
            }
            if (field353 == 238) {
                class160 var98 = field351;
                int var99 = field352;
                int var100 = var98.field2091;
                class46.field929 = 0;
                int var101 = 0;
                var98.method2895();
                for (int var102 = 0; var102 < class46.field922; var102++) {
                    int var103 = class46.field932[var102];
                    if ((class46.field919[var103] & 0x1) == 0) {
                        if (var101 > 0) {
                            var101--;
                            class46.field919[var103] = (byte) (class46.field919[var103] | 0x2);
                        } else {
                            int var104 = var98.method2918(1);
                            if (var104 == 0) {
                                var101 = class46.method1885(var98);
                                class46.field919[var103] = (byte) (class46.field919[var103] | 0x2);
                            } else {
                                class46.method57(var98, var103);
                            }
                        }
                    }
                }
                var98.method2897();
                if (var101 != 0) {
                    throw new RuntimeException();
                }
                var98.method2895();
                for (int var105 = 0; var105 < class46.field922; var105++) {
                    int var106 = class46.field932[var105];
                    if ((class46.field919[var106] & 0x1) != 0) {
                        if (var101 > 0) {
                            var101--;
                            class46.field919[var106] = (byte) (class46.field919[var106] | 0x2);
                        } else {
                            int var107 = var98.method2918(1);
                            if (var107 == 0) {
                                var101 = class46.method1885(var98);
                                class46.field919[var106] = (byte) (class46.field919[var106] | 0x2);
                            } else {
                                class46.method57(var98, var106);
                            }
                        }
                    }
                }
                var98.method2897();
                if (var101 != 0) {
                    throw new RuntimeException();
                }
                var98.method2895();
                for (int var108 = 0; var108 < class46.field930; var108++) {
                    int var109 = class46.field925[var108];
                    if ((class46.field919[var109] & 0x1) != 0) {
                        if (var101 > 0) {
                            var101--;
                            class46.field919[var109] = (byte) (class46.field919[var109] | 0x2);
                        } else {
                            int var110 = var98.method2918(1);
                            if (var110 == 0) {
                                var101 = class46.method1885(var98);
                                class46.field919[var109] = (byte) (class46.field919[var109] | 0x2);
                            } else if (class46.method855(var98, var109)) {
                                class46.field919[var109] = (byte) (class46.field919[var109] | 0x2);
                            }
                        }
                    }
                }
                var98.method2897();
                if (var101 != 0) {
                    throw new RuntimeException();
                }
                var98.method2895();
                for (int var111 = 0; var111 < class46.field930; var111++) {
                    int var112 = class46.field925[var111];
                    if ((class46.field919[var112] & 0x1) == 0) {
                        if (var101 > 0) {
                            var101--;
                            class46.field919[var112] = (byte) (class46.field919[var112] | 0x2);
                        } else {
                            int var113 = var98.method2918(1);
                            if (var113 == 0) {
                                var101 = class46.method1885(var98);
                                class46.field919[var112] = (byte) (class46.field919[var112] | 0x2);
                            } else if (class46.method855(var98, var112)) {
                                class46.field919[var112] = (byte) (class46.field919[var112] | 0x2);
                            }
                        }
                    }
                }
                var98.method2897();
                if (var101 != 0) {
                    throw new RuntimeException();
                }
                class46.field922 = 0;
                class46.field930 = 0;
                for (int var114 = 1; var114 < 2048; var114++) {
                    class46.field919[var114] = (byte) (class46.field919[var114] >> 1);
                    class24 var115 = field426[var114];
                    if (var115 == null) {
                        class46.field925[++class46.field930 - 1] = var114;
                    } else {
                        class46.field932[++class46.field922 - 1] = var114;
                    }
                }
                for (int var116 = 0; var116 < class46.field929; var116++) {
                    int var117 = class46.field917[var116];
                    class24 var118 = field426[var117];
                    int var119 = var98.method2666();
                    if ((var119 & 0x10) != 0) {
                        var119 += var98.method2666() << 8;
                    }
                    class46.method2869(var98, var117, var118, var119);
                }
                if (var98.field2091 - var100 != var99) {
                    throw new RuntimeException(var98.field2091 - var100 + " " + var99);
                }
                field353 = -1;
                return true;
            }
            if (field353 == 226) {
                field554 = true;
                Statics.field741 = field351.method2666();
                Statics.field2150 = field351.method2666();
                Statics.field1921 = field351.method2668();
                Statics.field2728 = field351.method2666();
                Statics.field1106 = field351.method2666();
                if (Statics.field1106 >= 100) {
                    int var120 = Statics.field741 * 128 + 64;
                    int var121 = Statics.field2150 * 128 + 64;
                    int var122 = method20(var120, var121, Statics.field1569) - Statics.field1921;
                    int var123 = var120 - Statics.field1445;
                    int var124 = var122 - Statics.field799;
                    int var125 = var121 - Statics.field806;
                    int var126 = (int) Math.sqrt((double) (var123 * var123 + var125 * var125));
                    Statics.field685 = (int) (Math.atan2((double) var124, (double) var126) * 325.949D) & 0x7FF;
                    Statics.field611 = (int) (Math.atan2((double) var123, (double) var125) * -325.949D) & 0x7FF;
                    if (Statics.field685 < 128) {
                        Statics.field685 = 128;
                    }
                    if (Statics.field685 > 383) {
                        Statics.field685 = 383;
                    }
                }
                field353 = -1;
                return true;
            }
            if (field353 == 203) {
                field589 = field351.method2666();
                field525 = field351.method2666();
                field353 = -1;
                return true;
            }
            if (field353 == 128) {
                int var127 = field351.method2681();
                int var128 = field351.method2788();
                int var129 = field351.method2703();
                class170 var130 = class170.method3109(var128);
                if (var130.field2215 != var129 || var130.field2194 != var127 || var130.field2292 != 0 || var130.field2218 != 0) {
                    var130.field2215 = var129;
                    var130.field2194 = var127;
                    var130.field2292 = 0;
                    var130.field2218 = 0;
                    method3099(var130);
                    method2010(var130);
                    if (var130.field2208 == 0) {
                        method2867(Statics.field2197[var128 >> 16], var130, false);
                    }
                }
                field353 = -1;
                return true;
            }
            if (field353 == 154) {
                int var131 = field351.method2712();
                int var132 = field351.method2706();
                class170 var133 = class170.method3109(var131);
                if (var133.field2249 != 1 || var133.field2247 != var132) {
                    var133.field2249 = 1;
                    var133.field2247 = var132;
                    method3099(var133);
                }
                field353 = -1;
                return true;
            }
            if (field353 == 167) {
                String var134 = field351.method2701();
                int var135 = field351.method2668();
                byte var136 = field351.method2835();
                boolean var137 = false;
                if (var136 == -128) {
                    var137 = true;
                }
                if (var137) {
                    if (Statics.field273 == 0) {
                        field353 = -1;
                        return true;
                    }
                    boolean var138 = false;
                    int var139;
                    for (var139 = 0; var139 < Statics.field273 && (!Statics.field1205[var139].field296.equals(var134) || Statics.field1205[var139].field291 != var135); var139++) {
                    }
                    if (var139 < Statics.field273) {
                        while (var139 < Statics.field273 - 1) {
                            Statics.field1205[var139] = Statics.field1205[var139 + 1];
                            var139++;
                        }
                        Statics.field273--;
                        Statics.field1205[Statics.field273] = null;
                    }
                } else {
                    field351.method2701();
                    class25 var140 = new class25();
                    var140.field296 = var134;
                    var140.field289 = class205.method1529(var140.field296, Statics.field245);
                    var140.field291 = var135;
                    var140.field299 = var136;
                    int var141;
                    for (var141 = Statics.field273 - 1; var141 >= 0; var141--) {
                        int var142 = Statics.field1205[var141].field289.compareTo(var140.field289);
                        if (var142 == 0) {
                            Statics.field1205[var141].field291 = var135;
                            Statics.field1205[var141].field299 = var136;
                            if (var134.equals(Statics.field792.field263)) {
                                Statics.field2943 = var136;
                            }
                            field500 = field491;
                            field353 = -1;
                            return true;
                        }
                        if (var142 < 0) {
                            break;
                        }
                    }
                    if (Statics.field273 >= Statics.field1205.length) {
                        field353 = -1;
                        return true;
                    }
                    for (int var143 = Statics.field273 - 1; var143 > var141; var143--) {
                        Statics.field1205[var143 + 1] = Statics.field1205[var143];
                    }
                    if (Statics.field273 == 0) {
                        Statics.field1205 = new class25[100];
                    }
                    Statics.field1205[var141 + 1] = var140;
                    Statics.field273++;
                    if (var134.equals(Statics.field792.field263)) {
                        Statics.field2943 = var136;
                    }
                }
                field500 = field491;
                field353 = -1;
                return true;
            }
            if (field353 == 49) {
                for (int var144 = 0; var144 < class166.field2163.length; var144++) {
                    if (class166.field2163[var144] != class166.field2162[var144]) {
                        class166.field2163[var144] = class166.field2162[var144];
                        method2593(var144);
                        field446[++field536 - 1 & 0x1F] = var144;
                    }
                }
                field353 = -1;
                return true;
            }
            if (field353 == 41) {
                int var145 = field351.method2798();
                int var146 = field351.method2798();
                if (Statics.field583 == null || !Statics.field583.isValid()) {
                    try {
                        Iterator var147 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var147.hasNext()) {
                            GarbageCollectorMXBean var148 = (GarbageCollectorMXBean) var147.next();
                            if (var148.isValid()) {
                                Statics.field583 = var148;
                                field457 = -1L;
                                field584 = -1L;
                            }
                        }
                    } catch (Throwable var396) {
                    }
                }
                long var150 = class156.method12();
                int var152 = -1;
                if (Statics.field583 != null) {
                    long var153 = Statics.field583.getCollectionTime();
                    if (field584 != -1L) {
                        long var155 = var153 - field584;
                        long var157 = var150 - field457;
                        if (var157 != 0L) {
                            var152 = (int) (var155 * 100L / var157);
                        }
                    }
                    field584 = var153;
                    field457 = var150;
                }
                field349.method2896(27);
                field349.method2690(var152);
                field349.method2751(field1775);
                field349.method2805(var145);
                field349.method2709(var146);
                field353 = -1;
                return true;
            }
            if (field353 == 101) {
                String var159 = field351.method2701();
                Object[] var160 = new Object[var159.length() + 1];
                for (int var161 = var159.length() - 1; var161 >= 0; var161--) {
                    if (var159.charAt(var161) == 's') {
                        var160[var161 + 1] = field351.method2701();
                    } else {
                        var160[var161 + 1] = Integer.valueOf(field351.method2798());
                    }
                }
                var160[0] = Integer.valueOf(field351.method2798());
                class19 var162 = new class19();
                var162.field210 = var160;
                class33.method3098(var162, 200000);
                field353 = -1;
                return true;
            }
            if (field353 == 229) {
                int var163 = field351.method2712();
                class170 var164 = class170.method3109(var163);
                for (int var165 = 0; var165 < var164.field2324.length; var165++) {
                    var164.field2324[var165] = -1;
                    var164.field2324[var165] = 0;
                }
                method3099(var164);
                field353 = -1;
                return true;
            }
            if (field353 == 211) {
                method602();
                field472 = field351.method2669();
                field503 = field491;
                field353 = -1;
                return true;
            }
            if (field353 == 253) {
                int var166 = field351.method2679();
                boolean var167 = field351.method2666() == 1;
                String var168 = "";
                boolean var169 = false;
                if (var167) {
                    var168 = field351.method2701();
                    if (Statics.method207(var168)) {
                        var169 = true;
                    }
                }
                String var170 = field351.method2701();
                if (!var169) {
                    class48.method187(var166, var168, var170);
                }
                field353 = -1;
                return true;
            }
            if (field353 == 107) {
                Statics.field2705 = field351.method2694();
                Statics.field82 = field351.method2666();
                while (field351.field2091 < field352) {
                    field353 = field351.method2666();
                    method69();
                }
                field353 = -1;
                return true;
            }
            if (field353 == 165) {
                String var171 = field351.method2701();
                Statics.field311 = var171;
                try {
                    String var172 = Statics.field509.getParameter(class215.field3171.field3174);
                    String var173 = Statics.field509.getParameter(class215.field3172.field3174);
                    String var174 = var172 + "settings=" + var171 + "; version=1; path=/; domain=" + var173;
                    String var175;
                    if (var171.length() == 0) {
                        var175 = var174 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        String var176 = var174 + "; Expires=";
                        long var177 = class156.method12() + 94608000000L;
                        class163.field2151.setTime(new Date(var177));
                        int var179 = class163.field2151.get(7);
                        int var180 = class163.field2151.get(5);
                        int var181 = class163.field2151.get(2);
                        int var182 = class163.field2151.get(1);
                        int var183 = class163.field2151.get(11);
                        int var184 = class163.field2151.get(12);
                        int var185 = class163.field2151.get(13);
                        String var186 = class163.field2152[var179 - 1] + ", " + var180 / 10 + var180 % 10 + "-" + class163.field2153[0][var181] + "-" + var182 + " " + var183 / 10 + var183 % 10 + ":" + var184 / 10 + var184 % 10 + ":" + var185 / 10 + var185 % 10 + " GMT";
                        var175 = var176 + var186 + "; Max-Age=" + 94608000L;
                    }
                    client var187 = Statics.field509;
                    String var188 = "document.cookie=\"" + var175 + "\"";
                    JSObject.getWindow(var187).eval(var188);
                } catch (Throwable var395) {
                }
                field353 = -1;
                return true;
            }
            if (field353 == 111) {
                field323 = field351.method2706() * 30;
                field503 = field491;
                field353 = -1;
                return true;
            }
            if (field353 == 98) {
                String var190 = field351.method2701();
                String var191 = class210.method3761(class208.method772(class211.method1446(field351)));
                class48.method187(6, var190, var191);
                field353 = -1;
                return true;
            }
            if (field353 == 19) {
                for (int var192 = 0; var192 < Statics.field2783; var192++) {
                    class188 var193 = class188.method3169(var192);
                    if (var193 != null) {
                        class166.field2162[var192] = 0;
                        class166.field2163[var192] = 0;
                    }
                }
                method602();
                field536 += 32;
                field353 = -1;
                return true;
            }
            if (field353 == 213) {
                int var194 = field351.method2711();
                int var195 = field351.method2700();
                if (var195 == 65535) {
                    var195 = -1;
                }
                int var196 = field351.method2798();
                int var197 = field351.method2706();
                if (var197 == 65535) {
                    var197 = -1;
                }
                for (int var198 = var195; var198 <= var197; var198++) {
                    long var199 = ((long) var196 << 32) + (long) var198;
                    class128 var201 = field508.method2260(var199);
                    if (var201 != null) {
                        var201.method2310();
                    }
                    field508.method2261(new class134(var194), var199);
                }
                field353 = -1;
                return true;
            }
            if (field353 == 54) {
                int var202 = field351.method2712();
                int var203 = field351.method2798();
                int var204 = field351.method2702();
                if (var204 == 65535) {
                    var204 = -1;
                }
                class170 var205 = class170.method3109(var202);
                if (var205.field2205) {
                    var205.field2326 = var204;
                    var205.field2327 = var203;
                    class199 var207 = class199.method1947(var204);
                    var205.field2257 = var207.field2968;
                    var205.field2258 = var207.field2966;
                    var205.field2214 = var207.field2967;
                    var205.field2255 = var207.field2965;
                    var205.field2256 = var207.field2969;
                    var205.field2260 = var207.field2991;
                    if (var207.field2995 == 1) {
                        var205.field2264 = 1;
                    } else {
                        var205.field2264 = 2;
                    }
                    if (var205.field2261 > 0) {
                        var205.field2260 = var205.field2260 * 32 / var205.field2261;
                    } else if (var205.field2211 > 0) {
                        var205.field2260 = var205.field2260 * 32 / var205.field2211;
                    }
                    method3099(var205);
                } else if (var204 == -1) {
                    var205.field2249 = 0;
                    field353 = -1;
                    return true;
                } else {
                    class199 var206 = class199.method1947(var204);
                    var205.field2249 = 4;
                    var205.field2247 = var204;
                    var205.field2257 = var206.field2968;
                    var205.field2258 = var206.field2966;
                    var205.field2260 = var206.field2991 * 100 / var203;
                    method3099(var205);
                }
                field353 = -1;
                return true;
            }
            if (field353 == 182) {
                int var208 = field351.method2711();
                int var209 = field351.method2666();
                int var210 = field351.method2700();
                class18 var211 = (class18) field467.method2260((long) var208);
                if (var211 != null) {
                    method669(var211, var211.field192 != var210);
                }
                class18 var212 = new class18();
                var212.field192 = var210;
                var212.field190 = var209;
                field467.method2261(var212, (long) var208);
                method135(var210);
                class170 var213 = class170.method3109(var208);
                method3099(var213);
                if (field470 != null) {
                    method3099(field470);
                    field470 = null;
                }
                method174();
                method2867(Statics.field2197[var208 >> 16], var213, false);
                class33.method2894(var210);
                if (field523 != -1) {
                    int var214 = field523;
                    if (class170.method693(var214)) {
                        method2982(Statics.field2197[var214], 1);
                    }
                }
                field353 = -1;
                return true;
            }
            if (field353 == 254) {
                if (field523 != -1) {
                    int var215 = field523;
                    if (class170.method693(var215)) {
                        method2982(Statics.field2197[var215], 0);
                    }
                }
                field353 = -1;
                return true;
            }
            if (field353 == 153 || field353 == 44 || field353 == 248 || field353 == 116 || field353 == 247 || field353 == 225 || field353 == 84 || field353 == 58 || field353 == 186 || field353 == 231) {
                method69();
                field353 = -1;
                return true;
            }
            if (field353 == 251) {
                int var216 = field351.method2700();
                byte var217 = field351.method2848();
                class166.field2162[var216] = var217;
                if (class166.field2163[var216] != var217) {
                    class166.field2163[var216] = var217;
                }
                method2593(var216);
                field446[++field536 - 1 & 0x1F] = var216;
                field353 = -1;
                return true;
            }
            if (field353 == 172) {
                method250(true);
                field351.method2892();
                int var218 = field351.method2668();
                class160 var219 = field351;
                int var220 = var219.field2091;
                class46.field929 = 0;
                int var221 = 0;
                var219.method2895();
                for (int var222 = 0; var222 < class46.field922; var222++) {
                    int var223 = class46.field932[var222];
                    if ((class46.field919[var223] & 0x1) == 0) {
                        if (var221 > 0) {
                            var221--;
                            class46.field919[var223] = (byte) (class46.field919[var223] | 0x2);
                        } else {
                            int var224 = var219.method2918(1);
                            if (var224 == 0) {
                                var221 = class46.method1885(var219);
                                class46.field919[var223] = (byte) (class46.field919[var223] | 0x2);
                            } else {
                                class46.method57(var219, var223);
                            }
                        }
                    }
                }
                var219.method2897();
                if (var221 != 0) {
                    throw new RuntimeException();
                }
                var219.method2895();
                for (int var225 = 0; var225 < class46.field922; var225++) {
                    int var226 = class46.field932[var225];
                    if ((class46.field919[var226] & 0x1) != 0) {
                        if (var221 > 0) {
                            var221--;
                            class46.field919[var226] = (byte) (class46.field919[var226] | 0x2);
                        } else {
                            int var227 = var219.method2918(1);
                            if (var227 == 0) {
                                var221 = class46.method1885(var219);
                                class46.field919[var226] = (byte) (class46.field919[var226] | 0x2);
                            } else {
                                class46.method57(var219, var226);
                            }
                        }
                    }
                }
                var219.method2897();
                if (var221 != 0) {
                    throw new RuntimeException();
                }
                var219.method2895();
                for (int var228 = 0; var228 < class46.field930; var228++) {
                    int var229 = class46.field925[var228];
                    if ((class46.field919[var229] & 0x1) != 0) {
                        if (var221 > 0) {
                            var221--;
                            class46.field919[var229] = (byte) (class46.field919[var229] | 0x2);
                        } else {
                            int var230 = var219.method2918(1);
                            if (var230 == 0) {
                                var221 = class46.method1885(var219);
                                class46.field919[var229] = (byte) (class46.field919[var229] | 0x2);
                            } else if (class46.method855(var219, var229)) {
                                class46.field919[var229] = (byte) (class46.field919[var229] | 0x2);
                            }
                        }
                    }
                }
                var219.method2897();
                if (var221 != 0) {
                    throw new RuntimeException();
                }
                var219.method2895();
                for (int var231 = 0; var231 < class46.field930; var231++) {
                    int var232 = class46.field925[var231];
                    if ((class46.field919[var232] & 0x1) == 0) {
                        if (var221 > 0) {
                            var221--;
                            class46.field919[var232] = (byte) (class46.field919[var232] | 0x2);
                        } else {
                            int var233 = var219.method2918(1);
                            if (var233 == 0) {
                                var221 = class46.method1885(var219);
                                class46.field919[var232] = (byte) (class46.field919[var232] | 0x2);
                            } else if (class46.method855(var219, var232)) {
                                class46.field919[var232] = (byte) (class46.field919[var232] | 0x2);
                            }
                        }
                    }
                }
                var219.method2897();
                if (var221 != 0) {
                    throw new RuntimeException();
                }
                class46.field922 = 0;
                class46.field930 = 0;
                for (int var234 = 1; var234 < 2048; var234++) {
                    class46.field919[var234] = (byte) (class46.field919[var234] >> 1);
                    class24 var235 = field426[var234];
                    if (var235 == null) {
                        class46.field925[++class46.field930 - 1] = var234;
                    } else {
                        class46.field932[++class46.field922 - 1] = var234;
                    }
                }
                for (int var236 = 0; var236 < class46.field929; var236++) {
                    int var237 = class46.field917[var236];
                    class24 var238 = field426[var237];
                    int var239 = var219.method2666();
                    if ((var239 & 0x10) != 0) {
                        var239 += var219.method2666() << 8;
                    }
                    class46.method2869(var219, var237, var238, var239);
                }
                if (var219.field2091 - var220 != var218) {
                    throw new RuntimeException(var219.field2091 - var220 + " " + var218);
                }
                field353 = -1;
                return true;
            }
            if (field353 == 29) {
                Statics.field82 = field351.method2692();
                Statics.field2705 = field351.method2730();
                field353 = -1;
                return true;
            }
            if (field353 == 6) {
                int var240 = field351.method2788();
                Statics.field935 = Statics.field776.method1934(var240);
                field353 = -1;
                return true;
            }
            if (field353 == 13) {
                class46.field922 = 0;
                for (int var241 = 0; var241 < 2048; var241++) {
                    class46.field921[var241] = null;
                    class46.field924[var241] = 1;
                }
                for (int var242 = 0; var242 < 2048; var242++) {
                    field426[var242] = null;
                }
                class46.method864(field351);
                field353 = -1;
                return true;
            }
            if (field353 == 164) {
                int var243 = field351.method2788();
                int var244 = field351.method2668();
                class170 var245 = class170.method3109(var243);
                if (var245.field2249 != 2 || var245.field2247 != var244) {
                    var245.field2249 = 2;
                    var245.field2247 = var244;
                    method3099(var245);
                }
                field353 = -1;
                return true;
            }
            if (field353 == 223) {
                int var246 = field351.method2798();
                int var247 = field351.method2668();
                if (var246 < -70000) {
                    var247 += 32768;
                }
                class170 var248;
                if (var246 >= 0) {
                    var248 = class170.method3109(var246);
                } else {
                    var248 = null;
                }
                if (var248 != null) {
                    for (int var249 = 0; var249 < var248.field2324.length; var249++) {
                        var248.field2324[var249] = 0;
                        var248.field2325[var249] = 0;
                    }
                }
                class13 var250 = (class13) class13.field145.method2260((long) var247);
                if (var250 != null) {
                    for (int var251 = 0; var251 < var250.field139.length; var251++) {
                        var250.field139[var251] = -1;
                        var250.field140[var251] = 0;
                    }
                }
                int var252 = field351.method2668();
                for (int var253 = 0; var253 < var252; var253++) {
                    int var254 = field351.method2694();
                    if (var254 == 255) {
                        var254 = field351.method2788();
                    }
                    int var255 = field351.method2668();
                    if (var248 != null && var253 < var248.field2324.length) {
                        var248.field2324[var253] = var255;
                        var248.field2325[var253] = var254;
                    }
                    class13.method706(var247, var253, var255 - 1, var254);
                }
                if (var248 != null) {
                    method3099(var248);
                }
                method602();
                field494[++field495 - 1 & 0x1F] = var247 & 0x7FFF;
                field353 = -1;
                return true;
            }
            if (field353 == 8) {
                int var256 = field351.method2711();
                int var257 = field351.method2668();
                class166.field2162[var257] = var256;
                if (class166.field2163[var257] != var256) {
                    class166.field2163[var257] = var256;
                }
                method2593(var257);
                field446[++field536 - 1 & 0x1F] = var257;
                field353 = -1;
                return true;
            }
            if (field353 == 124) {
                int var258 = field351.method2788();
                String var259 = field351.method2701();
                class170 var260 = class170.method3109(var258);
                if (!var259.equals(var260.field2266)) {
                    var260.field2266 = var259;
                    method3099(var260);
                }
                field353 = -1;
                return true;
            }
            if (field353 == 240) {
                field565 = field351.method2666();
                field353 = -1;
                return true;
            }
            if (field353 == 104) {
                int var261 = field351.method2711();
                int var262 = field351.method2711();
                class18 var263 = (class18) field467.method2260((long) var262);
                class18 var264 = (class18) field467.method2260((long) var261);
                if (var264 != null) {
                    method669(var264, var263 == null || var263.field192 != var264.field192);
                }
                if (var263 != null) {
                    var263.method2310();
                    field467.method2261(var263, (long) var261);
                }
                class170 var265 = class170.method3109(var262);
                if (var265 != null) {
                    method3099(var265);
                }
                class170 var266 = class170.method3109(var261);
                if (var266 != null) {
                    method3099(var266);
                    method2867(Statics.field2197[var266.field2206 >>> 16], var266, true);
                }
                if (field523 != -1) {
                    int var267 = field523;
                    if (class170.method693(var267)) {
                        method2982(Statics.field2197[var267], 1);
                    }
                }
                field353 = -1;
                return true;
            }
            if (field353 == 243) {
                while (field351.field2091 < field352) {
                    boolean var268 = field351.method2666() == 1;
                    String var269 = field351.method2701();
                    String var270 = field351.method2701();
                    int var271 = field351.method2668();
                    int var272 = field351.method2666();
                    int var273 = field351.method2666();
                    boolean var274 = (var273 & 0x2) != 0;
                    boolean var275 = (var273 & 0x1) != 0;
                    if (var271 > 0) {
                        field351.method2701();
                        field351.method2666();
                        field351.method2798();
                    }
                    field351.method2701();
                    for (int var276 = 0; var276 < field573; var276++) {
                        class15 var277 = field423[var276];
                        if (var268) {
                            if (var270.equals(var277.field166)) {
                                var277.field166 = var269;
                                var277.field161 = var270;
                                var269 = null;
                                break;
                            }
                        } else if (var269.equals(var277.field166)) {
                            if (var277.field164 != var271) {
                                boolean var278 = true;
                                for (class17 var279 = (class17) field576.method2349(); var279 != null; var279 = (class17) field576.method2350()) {
                                    if (var279.field181.equals(var269)) {
                                        if (var271 != 0 && var279.field183 == 0) {
                                            var279.method2357();
                                            var278 = false;
                                        } else if (var271 == 0 && var279.field183 != 0) {
                                            var279.method2357();
                                            var278 = false;
                                        }
                                    }
                                }
                                if (var278) {
                                    field576.method2348(new class17(var269, var271));
                                }
                                var277.field164 = var271;
                            }
                            var277.field161 = var270;
                            var277.field163 = var272;
                            var277.field162 = var274;
                            var277.field165 = var275;
                            var269 = null;
                            break;
                        }
                    }
                    if (var269 != null && field573 < 400) {
                        class15 var280 = new class15();
                        field423[field573] = var280;
                        var280.field166 = var269;
                        var280.field161 = var270;
                        var280.field164 = var271;
                        var280.field163 = var272;
                        var280.field162 = var274;
                        var280.field165 = var275;
                        field573++;
                    }
                }
                field574 = 2;
                field452 = field491;
                boolean var281 = false;
                int var282 = field573;
                while (var282 > 0) {
                    boolean var283 = true;
                    var282--;
                    for (int var284 = 0; var284 < var282; var284++) {
                        boolean var285 = false;
                        class15 var286 = field423[var284];
                        class15 var287 = field423[var284 + 1];
                        if (field303 != var286.field164 && field303 == var287.field164) {
                            var285 = true;
                        }
                        if (!var285 && var286.field164 == 0 && var287.field164 != 0) {
                            var285 = true;
                        }
                        if (!var285 && !var286.field162 && var287.field162) {
                            var285 = true;
                        }
                        if (!var285 && !var286.field165 && var287.field165) {
                            var285 = true;
                        }
                        if (var285) {
                            class15 var288 = field423[var284];
                            field423[var284] = field423[var284 + 1];
                            field423[var284 + 1] = var288;
                            var283 = false;
                        }
                    }
                    if (var283) {
                        break;
                    }
                }
                field353 = -1;
                return true;
            }
            if (field353 == 37) {
                field574 = 1;
                field452 = field491;
                field353 = -1;
                return true;
            }
            if (field353 == 0) {
                class30 var289 = new class30();
                var289.field696 = field351.method2701();
                var289.field700 = field351.method2668();
                int var290 = field351.method2798();
                var289.field703 = var290;
                method101(45);
                Statics.field2037.method2017();
                Statics.field2037 = null;
                class42.method3289(var289);
                field353 = -1;
                return false;
            }
            if (field353 == 147) {
                int var291 = field352 + field351.field2091;
                int var292 = field351.method2668();
                int var293 = field351.method2668();
                if (field523 != var292) {
                    field523 = var292;
                    method792(false);
                    method135(field523);
                    class33.method2894(field523);
                    for (int var294 = 0; var294 < 100; var294++) {
                        field511[var294] = true;
                    }
                }
                while (var293-- > 0) {
                    int var295 = field351.method2798();
                    int var296 = field351.method2668();
                    int var297 = field351.method2666();
                    class18 var298 = (class18) field467.method2260((long) var295);
                    if (var298 != null && var298.field192 != var296) {
                        method669(var298, true);
                        var298 = null;
                    }
                    if (var298 == null) {
                        class18 var299 = new class18();
                        var299.field192 = var296;
                        var299.field190 = var297;
                        field467.method2261(var299, (long) var295);
                        method135(var296);
                        class170 var300 = class170.method3109(var295);
                        method3099(var300);
                        if (field470 != null) {
                            method3099(field470);
                            field470 = null;
                        }
                        method174();
                        method2867(Statics.field2197[var295 >> 16], var300, false);
                        class33.method2894(var296);
                        if (field523 != -1) {
                            int var301 = field523;
                            if (class170.method693(var301)) {
                                method2982(Statics.field2197[var301], 1);
                            }
                        }
                        var298 = var299;
                    }
                    var298.field191 = true;
                }
                for (class18 var303 = (class18) field467.method2264(); var303 != null; var303 = (class18) field467.method2272()) {
                    if (var303.field191) {
                        var303.field191 = false;
                    } else {
                        method669(var303, true);
                    }
                }
                field508 = new class126(512);
                while (field351.field2091 < var291) {
                    int var304 = field351.method2798();
                    int var305 = field351.method2668();
                    int var306 = field351.method2668();
                    int var307 = field351.method2798();
                    for (int var308 = var305; var308 <= var306; var308++) {
                        long var309 = ((long) var304 << 32) + (long) var308;
                        field508.method2261(new class134(var307), var309);
                    }
                }
                field353 = -1;
                return true;
            }
            if (field353 == 252) {
                int var311 = field351.method2706();
                int var312 = field351.method2706();
                int var313 = field351.method2712();
                class170 var314 = class170.method3109(var313);
                var314.field2295 = (var311 << 16) + var312;
                field353 = -1;
                return true;
            }
            if (field353 == 85) {
                field554 = false;
                for (int var315 = 0; var315 < 5; var315++) {
                    field555[var315] = false;
                }
                field353 = -1;
                return true;
            }
            if (field353 == 91) {
                int var316 = field351.method2730();
                int var317 = field351.method2692();
                String var318 = field351.method2701();
                if (var316 >= 1 && var316 <= 8) {
                    if (var318.equalsIgnoreCase("null")) {
                        var318 = null;
                    }
                    field432[var316 - 1] = var318;
                    field375[var316 - 1] = var317 == 0;
                }
                field353 = -1;
                return true;
            }
            if (field353 == 42) {
                int var319 = field351.method2712();
                int var320 = field351.method2681();
                class170 var321 = class170.method3109(var319);
                if (var321.field2231 != var320 || var320 == -1) {
                    var321.field2231 = var320;
                    var321.field2328 = 0;
                    var321.field2329 = 0;
                    method3099(var321);
                }
                field353 = -1;
                return true;
            }
            if (field353 == 32) {
                int var322 = field351.method2706();
                if (var322 == 65535) {
                    var322 = -1;
                }
                if (var322 == -1 && !field546) {
                    Statics.field1917.method2469();
                    class139.field1920 = 1;
                    Statics.field2183 = null;
                } else if (var322 != -1 && field422 != var322 && field543 != 0 && !field546) {
                    class139.method2648(2, Statics.field128, var322, 0, field543, false);
                }
                field422 = var322;
                field353 = -1;
                return true;
            }
            if (field353 == 161) {
                int var323 = field351.method2656();
                int var324 = field351.method2702();
                if (var324 == 65535) {
                    var324 = -1;
                }
                if (field543 != 0 && var324 != -1) {
                    class139.method1399(Statics.field2045, var324, 0, field543, false);
                    field546 = true;
                }
                field353 = -1;
                return true;
            }
            if (field353 == 61) {
                int var325 = field351.method2702();
                field523 = var325;
                method792(false);
                method135(var325);
                class33.method2894(field523);
                for (int var326 = 0; var326 < 100; var326++) {
                    field511[var326] = true;
                }
                field353 = -1;
                return true;
            }
            if (field353 == 185) {
                field351.field2091 += 28;
                if (field351.method2688()) {
                    class160 var327 = field351;
                    int var328 = field351.field2091 - 28;
                    if (class105.field1693 != null) {
                        try {
                            class105.field1693.method1388(0L);
                            class105.field1693.method1371(var327.field2092, var328, 24);
                        } catch (Exception var394) {
                        }
                    }
                }
                field353 = -1;
                return true;
            }
            if (field353 == 187) {
                method250(false);
                field351.method2892();
                int var330 = field351.method2668();
                class160 var331 = field351;
                int var332 = var331.field2091;
                class46.field929 = 0;
                int var333 = 0;
                var331.method2895();
                for (int var334 = 0; var334 < class46.field922; var334++) {
                    int var335 = class46.field932[var334];
                    if ((class46.field919[var335] & 0x1) == 0) {
                        if (var333 > 0) {
                            var333--;
                            class46.field919[var335] = (byte) (class46.field919[var335] | 0x2);
                        } else {
                            int var336 = var331.method2918(1);
                            if (var336 == 0) {
                                var333 = class46.method1885(var331);
                                class46.field919[var335] = (byte) (class46.field919[var335] | 0x2);
                            } else {
                                class46.method57(var331, var335);
                            }
                        }
                    }
                }
                var331.method2897();
                if (var333 != 0) {
                    throw new RuntimeException();
                }
                var331.method2895();
                for (int var337 = 0; var337 < class46.field922; var337++) {
                    int var338 = class46.field932[var337];
                    if ((class46.field919[var338] & 0x1) != 0) {
                        if (var333 > 0) {
                            var333--;
                            class46.field919[var338] = (byte) (class46.field919[var338] | 0x2);
                        } else {
                            int var339 = var331.method2918(1);
                            if (var339 == 0) {
                                var333 = class46.method1885(var331);
                                class46.field919[var338] = (byte) (class46.field919[var338] | 0x2);
                            } else {
                                class46.method57(var331, var338);
                            }
                        }
                    }
                }
                var331.method2897();
                if (var333 != 0) {
                    throw new RuntimeException();
                }
                var331.method2895();
                for (int var340 = 0; var340 < class46.field930; var340++) {
                    int var341 = class46.field925[var340];
                    if ((class46.field919[var341] & 0x1) != 0) {
                        if (var333 > 0) {
                            var333--;
                            class46.field919[var341] = (byte) (class46.field919[var341] | 0x2);
                        } else {
                            int var342 = var331.method2918(1);
                            if (var342 == 0) {
                                var333 = class46.method1885(var331);
                                class46.field919[var341] = (byte) (class46.field919[var341] | 0x2);
                            } else if (class46.method855(var331, var341)) {
                                class46.field919[var341] = (byte) (class46.field919[var341] | 0x2);
                            }
                        }
                    }
                }
                var331.method2897();
                if (var333 != 0) {
                    throw new RuntimeException();
                }
                var331.method2895();
                for (int var343 = 0; var343 < class46.field930; var343++) {
                    int var344 = class46.field925[var343];
                    if ((class46.field919[var344] & 0x1) == 0) {
                        if (var333 > 0) {
                            var333--;
                            class46.field919[var344] = (byte) (class46.field919[var344] | 0x2);
                        } else {
                            int var345 = var331.method2918(1);
                            if (var345 == 0) {
                                var333 = class46.method1885(var331);
                                class46.field919[var344] = (byte) (class46.field919[var344] | 0x2);
                            } else if (class46.method855(var331, var344)) {
                                class46.field919[var344] = (byte) (class46.field919[var344] | 0x2);
                            }
                        }
                    }
                }
                var331.method2897();
                if (var333 != 0) {
                    throw new RuntimeException();
                }
                class46.field922 = 0;
                class46.field930 = 0;
                for (int var346 = 1; var346 < 2048; var346++) {
                    class46.field919[var346] = (byte) (class46.field919[var346] >> 1);
                    class24 var347 = field426[var346];
                    if (var347 == null) {
                        class46.field925[++class46.field930 - 1] = var346;
                    } else {
                        class46.field932[++class46.field922 - 1] = var346;
                    }
                }
                for (int var348 = 0; var348 < class46.field929; var348++) {
                    int var349 = class46.field917[var348];
                    class24 var350 = field426[var349];
                    int var351 = var331.method2666();
                    if ((var351 & 0x10) != 0) {
                        var351 += var331.method2666() << 8;
                    }
                    class46.method2869(var331, var349, var350, var351);
                }
                if (var331.field2091 - var332 != var330) {
                    throw new RuntimeException(var331.field2091 - var332 + " " + var330);
                }
                field353 = -1;
                return true;
            }
            if (field353 == 143) {
                method74();
                field353 = -1;
                return false;
            }
            if (field353 == 144) {
                int var352 = field351.method2711();
                boolean var353 = field351.method2692() == 1;
                class170 var354 = class170.method3109(var352);
                if (var354.field2226 != var353) {
                    var354.field2226 = var353;
                    method3099(var354);
                }
                field353 = -1;
                return true;
            }
            if (field353 == 73) {
                field500 = field491;
                if (field352 == 0) {
                    field533 = null;
                    field534 = null;
                    Statics.field273 = 0;
                    Statics.field1205 = null;
                    field353 = -1;
                    return true;
                }
                field534 = field351.method2701();
                long var355 = field351.method2652();
                long var357 = var355;
                String var359;
                if (var355 <= 0L || var355 >= 6582952005840035281L) {
                    var359 = null;
                } else if (var355 % 37L == 0L) {
                    var359 = null;
                } else {
                    int var360 = 0;
                    for (long var361 = var355; var361 != 0L; var361 /= 37L) {
                        var360++;
                    }
                    StringBuilder var363 = new StringBuilder(var360);
                    while (var357 != 0L) {
                        long var364 = var357;
                        var357 /= 37L;
                        var363.append(class206.field3087[(int) (var364 - var357 * 37L)]);
                    }
                    var359 = var363.reverse().toString();
                }
                field533 = var359;
                Statics.field1806 = field351.method2835();
                int var366 = field351.method2666();
                if (var366 == 255) {
                    field353 = -1;
                    return true;
                }
                Statics.field273 = var366;
                class25[] var367 = new class25[100];
                for (int var368 = 0; var368 < Statics.field273; var368++) {
                    var367[var368] = new class25();
                    var367[var368].field296 = field351.method2701();
                    var367[var368].field289 = class205.method1529(var367[var368].field296, Statics.field245);
                    var367[var368].field291 = field351.method2668();
                    var367[var368].field299 = field351.method2835();
                    field351.method2701();
                    if (var367[var368].field296.equals(Statics.field792.field263)) {
                        Statics.field2943 = var367[var368].field299;
                    }
                }
                boolean var369 = false;
                int var370 = Statics.field273;
                while (var370 > 0) {
                    boolean var371 = true;
                    var370--;
                    for (int var372 = 0; var372 < var370; var372++) {
                        if (var367[var372].field289.compareTo(var367[var372 + 1].field289) > 0) {
                            class25 var373 = var367[var372];
                            var367[var372] = var367[var372 + 1];
                            var367[var372 + 1] = var373;
                            var371 = false;
                        }
                    }
                    if (var371) {
                        break;
                    }
                }
                Statics.field1205 = var367;
                field353 = -1;
                return true;
            }
            if (field353 == 30) {
                method602();
                int var374 = field351.method2711();
                int var375 = field351.method2692();
                int var376 = field351.method2666();
                field442[var375] = var374;
                field385[var375] = var376;
                field367[var375] = 1;
                for (int var377 = 0; var377 < 98; var377++) {
                    if (var374 >= class173.field2353[var377]) {
                        field367[var375] = var377 + 2;
                    }
                }
                field496[++field461 - 1 & 0x1F] = var375;
                field353 = -1;
                return true;
            }
            if (field353 == 35) {
                int var378 = field351.method2668();
                int var379 = field351.method2666();
                int var380 = field351.method2668();
                method1619(var378, var379, var380);
                field353 = -1;
                return true;
            }
            if (field353 == 106) {
                int var381 = field351.method2788();
                class170 var382 = class170.method3109(var381);
                var382.field2249 = 3;
                var382.field2247 = Statics.field792.field284.method3001();
                method3099(var382);
                field353 = -1;
                return true;
            }
            if (field353 == 196) {
                int var383 = field351.method2706();
                int var384 = field351.method2712();
                int var385 = var383 >> 10 & 0x1F;
                int var386 = var383 >> 5 & 0x1F;
                int var387 = var383 & 0x1F;
                int var388 = (var387 << 3) + (var385 << 19) + (var386 << 11);
                class170 var389 = class170.method3109(var384);
                if (var389.field2232 != var388) {
                    var389.field2232 = var388;
                    method3099(var389);
                }
                field353 = -1;
                return true;
            }
            class102.method811("" + field353 + class38.field813 + field357 + class38.field813 + field575 + class38.field813 + field352, (Throwable) null);
            method74();
        } catch (IOException var402) {
            if (field359 > 0) {
                method74();
            } else {
                method101(40);
                Statics.field2131 = Statics.field2037;
                Statics.field2037 = null;
            }
        } catch (Exception var403) {
            String var392 = "" + field353 + class38.field813 + field357 + class38.field813 + field575 + class38.field813 + field352 + class38.field813 + (Statics.field60 + Statics.field792.field679[0]) + class38.field813 + (Statics.field290 + Statics.field792.field629[0]) + class38.field813;
            for (int var393 = 0; var393 < field352 && var393 < 50; var393++) {
                var392 = var392 + field351.field2092[var393] + class38.field813;
            }
            class102.method811(var392, var403);
            method74();
        }
        return true;
    }

    @ObfuscatedName("n.bo(I)V")
    public static final void method69() {
        if (field353 == 248) {
            byte var0 = field351.method2856();
            int var1 = field351.method2700();
            byte var2 = field351.method2848();
            int var3 = field351.method2706();
            byte var4 = field351.method2835();
            int var5 = field351.method2668();
            byte var6 = field351.method2856();
            int var7 = field351.method2706();
            int var8 = field351.method2692();
            int var9 = var8 >> 2;
            int var10 = var8 & 0x3;
            int var11 = field369[var9];
            int var12 = field351.method2666();
            int var13 = (var12 >> 4 & 0x7) + Statics.field2705;
            int var14 = (var12 & 0x7) + Statics.field82;
            class24 var15;
            if (field557 == var7) {
                var15 = Statics.field792;
            } else {
                var15 = field426[var7];
            }
            if (var15 != null) {
                class198 var16 = class198.method3257(var3);
                int var17;
                int var18;
                if (var10 == 1 || var10 == 3) {
                    var17 = var16.field2917;
                    var18 = var16.field2909;
                } else {
                    var17 = var16.field2909;
                    var18 = var16.field2917;
                }
                int var19 = (var17 >> 1) + var13;
                int var20 = (var17 + 1 >> 1) + var13;
                int var21 = (var18 >> 1) + var14;
                int var22 = (var18 + 1 >> 1) + var14;
                int[][] var23 = class11.field114[Statics.field1569];
                int var24 = var23[var19][var21] + var23[var20][var21] + var23[var19][var22] + var23[var20][var22] >> 2;
                int var25 = (var13 << 7) + (var17 << 6);
                int var26 = (var14 << 7) + (var18 << 6);
                class83 var27 = var16.method3460(var9, var10, var23, var25, var24, var26);
                if (var27 != null) {
                    method172(Statics.field1569, var13, var14, var11, -1, 0, 0, var1 + 1, var5 + 1);
                    var15.field265 = field450 + var1;
                    var15.field266 = field450 + var5;
                    var15.field270 = var27;
                    var15.field267 = var13 * 128 + var17 * 64;
                    var15.field269 = var14 * 128 + var18 * 64;
                    var15.field268 = var24;
                    if (var2 > var6) {
                        byte var28 = var2;
                        var2 = var6;
                        var6 = var28;
                    }
                    if (var4 > var0) {
                        byte var29 = var4;
                        var4 = var0;
                        var0 = var29;
                    }
                    var15.field271 = var2 + var13;
                    var15.field272 = var6 + var13;
                    var15.field283 = var4 + var14;
                    var15.field274 = var0 + var14;
                }
            }
        }
        if (field353 == 225) {
            int var30 = field351.method2666();
            int var31 = (var30 >> 4 & 0x7) + Statics.field2705;
            int var32 = (var30 & 0x7) + Statics.field82;
            int var33 = field351.method2700();
            if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                class129 var34 = field449[Statics.field1569][var31][var32];
                if (var34 != null) {
                    for (class44 var35 = (class44) var34.method2319(); var35 != null; var35 = (class44) var34.method2333()) {
                        if ((var33 & 0x7FFF) == var35.field911) {
                            var35.method2310();
                            break;
                        }
                    }
                    if (var34.method2319() == null) {
                        field449[Statics.field1569][var31][var32] = null;
                    }
                    method1881(var31, var32);
                }
            }
            return;
        }
        if (field353 == 153) {
            int var36 = field351.method2666();
            int var37 = (var36 >> 4 & 0x7) + Statics.field2705;
            int var38 = (var36 & 0x7) + Statics.field82;
            int var39 = field351.method2668();
            int var40 = field351.method2666();
            int var41 = var40 >> 4 & 0xF;
            int var42 = var40 & 0x7;
            int var43 = field351.method2666();
            if (var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104) {
                int var44 = var41 + 1;
                if (Statics.field792.field679[0] >= var37 - var44 && Statics.field792.field679[0] <= var37 + var44 && Statics.field792.field629[0] >= var38 - var44 && Statics.field792.field629[0] <= var38 + var44 && field547 != 0 && var42 > 0 && field548 < 50) {
                    field549[field548] = var39;
                    field550[field548] = var42;
                    field551[field548] = var43;
                    field350[field548] = null;
                    field556[field548] = (var37 << 16) + (var38 << 8) + var41;
                    field548++;
                }
            }
        }
        if (field353 == 84) {
            int var45 = field351.method2694();
            int var46 = (var45 >> 4 & 0x7) + Statics.field2705;
            int var47 = (var45 & 0x7) + Statics.field82;
            int var48 = field351.method2706();
            int var49 = field351.method2706();
            if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104) {
                class44 var50 = new class44();
                var50.field911 = var48;
                var50.field907 = var49;
                if (field449[Statics.field1569][var46][var47] == null) {
                    field449[Statics.field1569][var46][var47] = new class129();
                }
                field449[Statics.field1569][var46][var47].method2314(var50);
                method1881(var46, var47);
            }
        } else if (field353 == 247) {
            int var51 = field351.method2666();
            int var52 = (var51 >> 4 & 0x7) + Statics.field2705;
            int var53 = (var51 & 0x7) + Statics.field82;
            int var54 = var52 + field351.method2835();
            int var55 = var53 + field351.method2835();
            int var56 = field351.method2669();
            int var57 = field351.method2668();
            int var58 = field351.method2666() * 4;
            int var59 = field351.method2666() * 4;
            int var60 = field351.method2668();
            int var61 = field351.method2668();
            int var62 = field351.method2666();
            int var63 = field351.method2666();
            if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104 && var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104 && var57 != 65535) {
                int var64 = var52 * 128 + 64;
                int var65 = var53 * 128 + 64;
                int var66 = var54 * 128 + 64;
                int var67 = var55 * 128 + 64;
                class43 var68 = new class43(var57, Statics.field1569, var64, var65, method20(var64, var65, Statics.field1569) - var58, field450 + var60, field450 + var61, var62, var63, var56, var59);
                var68.method856(var66, var67, method20(var66, var67, Statics.field1569) - var59, field450 + var60);
                field438.method2314(var68);
            }
        } else if (field353 == 231) {
            int var69 = field351.method2694();
            int var70 = (var69 >> 4 & 0x7) + Statics.field2705;
            int var71 = (var69 & 0x7) + Statics.field82;
            int var72 = field351.method2694();
            int var73 = var72 >> 2;
            int var74 = var72 & 0x3;
            int var75 = field369[var73];
            int var76 = field351.method2700();
            if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104) {
                method172(Statics.field1569, var70, var71, var75, var76, var73, var74, 0, -1);
            }
        } else if (field353 == 116) {
            int var77 = field351.method2666();
            int var78 = (var77 >> 4 & 0x7) + Statics.field2705;
            int var79 = (var77 & 0x7) + Statics.field82;
            int var80 = field351.method2668();
            int var81 = field351.method2666();
            int var82 = field351.method2668();
            if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
                int var83 = var78 * 128 + 64;
                int var84 = var79 * 128 + 64;
                class34 var85 = new class34(var80, Statics.field1569, var83, var84, method20(var83, var84, Statics.field1569) - var81, var82, field450);
                field419.method2314(var85);
            }
        } else if (field353 == 58) {
            int var86 = field351.method2692();
            int var87 = (var86 >> 4 & 0x7) + Statics.field2705;
            int var88 = (var86 & 0x7) + Statics.field82;
            int var89 = field351.method2694();
            int var90 = var89 >> 2;
            int var91 = var89 & 0x3;
            int var92 = field369[var90];
            int var93 = field351.method2668();
            if (var87 >= 0 && var88 >= 0 && var87 < 103 && var88 < 103) {
                if (var92 == 0) {
                    class91 var94 = Statics.field970.method1704(Statics.field1569, var87, var88);
                    if (var94 != null) {
                        int var95 = var94.field1566 >> 14 & 0x7FFF;
                        if (var90 == 2) {
                            var94.field1563 = new class50(var95, 2, var91 + 4, Statics.field1569, var87, var88, var93, false, var94.field1563);
                            var94.field1565 = new class50(var95, 2, var91 + 1 & 0x3, Statics.field1569, var87, var88, var93, false, var94.field1565);
                        } else {
                            var94.field1563 = new class50(var95, var90, var91, Statics.field1569, var87, var88, var93, false, var94.field1563);
                        }
                    }
                }
                if (var92 == 1) {
                    class96 var96 = Statics.field970.method1862(Statics.field1569, var87, var88);
                    if (var96 != null) {
                        int var97 = var96.field1612 >> 14 & 0x7FFF;
                        if (var90 == 4 || var90 == 5) {
                            var96.field1610 = new class50(var97, 4, var91, Statics.field1569, var87, var88, var93, false, var96.field1610);
                        } else if (var90 == 6) {
                            var96.field1610 = new class50(var97, 4, var91 + 4, Statics.field1569, var87, var88, var93, false, var96.field1610);
                        } else if (var90 == 7) {
                            var96.field1610 = new class50(var97, 4, (var91 + 2 & 0x3) + 4, Statics.field1569, var87, var88, var93, false, var96.field1610);
                        } else if (var90 == 8) {
                            var96.field1610 = new class50(var97, 4, var91 + 4, Statics.field1569, var87, var88, var93, false, var96.field1610);
                            var96.field1611 = new class50(var97, 4, (var91 + 2 & 0x3) + 4, Statics.field1569, var87, var88, var93, false, var96.field1611);
                        }
                    }
                }
                if (var92 == 2) {
                    class97 var98 = Statics.field970.method1789(Statics.field1569, var87, var88);
                    if (var90 == 11) {
                        var90 = 10;
                    }
                    if (var98 != null) {
                        var98.field1621 = new class50(var98.field1627 >> 14 & 0x7FFF, var90, var91, Statics.field1569, var87, var88, var93, false, var98.field1621);
                    }
                }
                if (var92 == 3) {
                    class79 var99 = Statics.field970.method1707(Statics.field1569, var87, var88);
                    if (var99 != null) {
                        var99.field1311 = new class50(var99.field1312 >> 14 & 0x7FFF, 22, var91, Statics.field1569, var87, var88, var93, false, var99.field1311);
                    }
                }
            }
        } else if (field353 == 186) {
            int var100 = field351.method2730();
            int var101 = var100 >> 2;
            int var102 = var100 & 0x3;
            int var103 = field369[var101];
            int var104 = field351.method2730();
            int var105 = (var104 >> 4 & 0x7) + Statics.field2705;
            int var106 = (var104 & 0x7) + Statics.field82;
            if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104) {
                method172(Statics.field1569, var105, var106, var103, -1, var101, var102, 0, -1);
            }
        } else if (field353 == 44) {
            int var107 = field351.method2666();
            int var108 = (var107 >> 4 & 0x7) + Statics.field2705;
            int var109 = (var107 & 0x7) + Statics.field82;
            int var110 = field351.method2668();
            int var111 = field351.method2668();
            int var112 = field351.method2668();
            if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                class129 var113 = field449[Statics.field1569][var108][var109];
                if (var113 != null) {
                    for (class44 var114 = (class44) var113.method2319(); var114 != null; var114 = (class44) var113.method2333()) {
                        if ((var110 & 0x7FFF) == var114.field911 && var114.field907 == var111) {
                            var114.field907 = var112;
                            break;
                        }
                    }
                    method1881(var108, var109);
                }
            }
        }
    }

    @ObfuscatedName("b.bc(IIIIIIIIII)V")
    public static final void method172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class26 var9 = null;
        for (class26 var10 = (class26) field437.method2319(); var10 != null; var10 = (class26) field437.method2333()) {
            if (var10.field595 == arg0 && var10.field599 == arg1 && var10.field596 == arg2 && var10.field594 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class26();
            var9.field595 = arg0;
            var9.field594 = arg3;
            var9.field599 = arg1;
            var9.field596 = arg2;
            method1962(var9);
            field437.method2314(var9);
        }
        var9.field600 = arg4;
        var9.field609 = arg5;
        var9.field601 = arg6;
        var9.field603 = arg7;
        var9.field604 = arg8;
    }

    @ObfuscatedName("dh.bm(Le;I)V")
    public static final void method1962(class26 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field594 == 0) {
            var1 = Statics.field970.method1708(arg0.field595, arg0.field599, arg0.field596);
        }
        if (arg0.field594 == 1) {
            var1 = Statics.field970.method1746(arg0.field595, arg0.field599, arg0.field596);
        }
        if (arg0.field594 == 2) {
            var1 = Statics.field970.method1813(arg0.field595, arg0.field599, arg0.field596);
        }
        if (arg0.field594 == 3) {
            var1 = Statics.field970.method1711(arg0.field595, arg0.field599, arg0.field596);
        }
        if (var1 != 0) {
            int var5 = Statics.field970.method1712(arg0.field595, arg0.field599, arg0.field596, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field597 = var2;
        arg0.field602 = var3;
        arg0.field598 = var4;
    }

    @ObfuscatedName("z.be(IIIIIIIB)V")
    public static final void method188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field309 && Statics.field1569 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field970.method1708(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field970.method1746(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field970.method1813(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field970.method1711(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field970.method1712(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field970.method1699(arg0, arg2, arg3);
                class198 var15 = class198.method3257(var12);
                if (var15.field2944 != 0) {
                    field366[arg0].method2176(arg2, arg3, var13, var14, var15.field2912);
                }
            }
            if (arg1 == 1) {
                Statics.field970.method1700(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field970.method1778(arg0, arg2, arg3);
                class198 var16 = class198.method3257(var12);
                if (var16.field2909 + arg2 > 103 || var16.field2909 + arg3 > 103 || var16.field2917 + arg2 > 103 || var16.field2917 + arg3 > 103) {
                    return;
                }
                if (var16.field2944 != 0) {
                    field366[arg0].method2169(arg2, arg3, var16.field2909, var16.field2917, var14, var16.field2912);
                }
            }
            if (arg1 == 3) {
                Statics.field970.method1702(arg0, arg2, arg3);
                class198 var17 = class198.method3257(var12);
                if (var17.field2944 == 1) {
                    field366[arg0].method2185(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class11.field111[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class88 var19 = Statics.field970;
        class118 var20 = field366[arg0];
        class198 var21 = class198.method3257(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field2917;
            var23 = var21.field2909;
        } else {
            var22 = var21.field2909;
            var23 = var21.field2917;
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
        int[][] var28 = class11.field114[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field2913 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field2933 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class90 var34;
            if (var21.field2916 == -1 && var21.field2935 == null) {
                var34 = var21.method3460(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class50(arg4, 22, arg5, var18, arg2, arg3, var21.field2916, true, (class90) null);
            }
            var19.method1688(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field2944 == 1) {
                var20.method2174(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class90 var57;
            if (var21.field2916 == -1 && var21.field2935 == null) {
                var57 = var21.method3460(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class50(arg4, 10, arg5, var18, arg2, arg3, var21.field2916, true, (class90) null);
            }
            if (var57 != null) {
                var19.method1692(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field2944 != 0) {
                var20.method2195(arg2, arg3, var22, var23, var21.field2912);
            }
        } else if (arg6 >= 12) {
            class90 var35;
            if (var21.field2916 == -1 && var21.field2935 == null) {
                var35 = var21.method3460(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class50(arg4, arg6, arg5, var18, arg2, arg3, var21.field2916, true, (class90) null);
            }
            var19.method1692(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field2944 != 0) {
                var20.method2195(arg2, arg3, var22, var23, var21.field2912);
            }
        } else if (arg6 == 0) {
            class90 var36;
            if (var21.field2916 == -1 && var21.field2935 == null) {
                var36 = var21.method3460(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class50(arg4, 0, arg5, var18, arg2, arg3, var21.field2916, true, (class90) null);
            }
            var19.method1825(arg0, arg2, arg3, var29, var36, (class90) null, class11.field104[arg5], 0, var32, var33);
            if (var21.field2944 != 0) {
                var20.method2171(arg2, arg3, arg6, arg5, var21.field2912);
            }
        } else if (arg6 == 1) {
            class90 var37;
            if (var21.field2916 == -1 && var21.field2935 == null) {
                var37 = var21.method3460(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class50(arg4, 1, arg5, var18, arg2, arg3, var21.field2916, true, (class90) null);
            }
            var19.method1825(arg0, arg2, arg3, var29, var37, (class90) null, class11.field105[arg5], 0, var32, var33);
            if (var21.field2944 != 0) {
                var20.method2171(arg2, arg3, arg6, arg5, var21.field2912);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class90 var39;
            class90 var40;
            if (var21.field2916 == -1 && var21.field2935 == null) {
                var39 = var21.method3460(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method3460(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class50(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field2916, true, (class90) null);
                var40 = new class50(arg4, 2, var38, var18, arg2, arg3, var21.field2916, true, (class90) null);
            }
            var19.method1825(arg0, arg2, arg3, var29, var39, var40, class11.field104[arg5], class11.field104[var38], var32, var33);
            if (var21.field2944 != 0) {
                var20.method2171(arg2, arg3, arg6, arg5, var21.field2912);
            }
        } else if (arg6 == 3) {
            class90 var41;
            if (var21.field2916 == -1 && var21.field2935 == null) {
                var41 = var21.method3460(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class50(arg4, 3, arg5, var18, arg2, arg3, var21.field2916, true, (class90) null);
            }
            var19.method1825(arg0, arg2, arg3, var29, var41, (class90) null, class11.field105[arg5], 0, var32, var33);
            if (var21.field2944 != 0) {
                var20.method2171(arg2, arg3, arg6, arg5, var21.field2912);
            }
        } else if (arg6 == 9) {
            class90 var42;
            if (var21.field2916 == -1 && var21.field2935 == null) {
                var42 = var21.method3460(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class50(arg4, arg6, arg5, var18, arg2, arg3, var21.field2916, true, (class90) null);
            }
            var19.method1692(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field2944 != 0) {
                var20.method2195(arg2, arg3, var22, var23, var21.field2912);
            }
        } else if (arg6 == 4) {
            class90 var43;
            if (var21.field2916 == -1 && var21.field2935 == null) {
                var43 = var21.method3460(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class50(arg4, 4, arg5, var18, arg2, arg3, var21.field2916, true, (class90) null);
            }
            var19.method1691(arg0, arg2, arg3, var29, var43, (class90) null, class11.field104[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1708(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class198.method3257(var45 >> 14 & 0x7FFF).field2918;
            }
            class90 var46;
            if (var21.field2916 == -1 && var21.field2935 == null) {
                var46 = var21.method3460(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class50(arg4, 4, arg5, var18, arg2, arg3, var21.field2916, true, (class90) null);
            }
            var19.method1691(arg0, arg2, arg3, var29, var46, (class90) null, class11.field104[arg5], 0, class11.field106[arg5] * var44, class11.field107[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1708(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class198.method3257(var48 >> 14 & 0x7FFF).field2918 / 2;
            }
            class90 var49;
            if (var21.field2916 == -1 && var21.field2935 == null) {
                var49 = var21.method3460(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class50(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field2916, true, (class90) null);
            }
            var19.method1691(arg0, arg2, arg3, var29, var49, (class90) null, 256, arg5, class11.field98[arg5] * var47, class11.field109[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class90 var51;
            if (var21.field2916 == -1 && var21.field2935 == null) {
                var51 = var21.method3460(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class50(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field2916, true, (class90) null);
            }
            var19.method1691(arg0, arg2, arg3, var29, var51, (class90) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1708(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class198.method3257(var53 >> 14 & 0x7FFF).field2918 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class90 var55;
            class90 var56;
            if (var21.field2916 == -1 && var21.field2935 == null) {
                var55 = var21.method3460(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method3460(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class50(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field2916, true, (class90) null);
                var56 = new class50(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field2916, true, (class90) null);
            }
            var19.method1691(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class11.field98[arg5] * var52, class11.field109[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("cs.bb(III)V")
    public static final void method1881(int arg0, int arg1) {
        class129 var2 = field449[Statics.field1569][arg0][arg1];
        if (var2 == null) {
            Statics.field970.method1703(Statics.field1569, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class44 var5 = null;
        for (class44 var6 = (class44) var2.method2319(); var6 != null; var6 = (class44) var2.method2333()) {
            class199 var7 = class199.method1947(var6.field911);
            long var8 = (long) var7.field2971;
            if (var7.field2995 == 1) {
                var8 = (long) (var6.field907 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field970.method1703(Statics.field1569, arg0, arg1);
            return;
        }
        var2.method2315(var5);
        class44 var10 = null;
        class44 var11 = null;
        for (class44 var12 = (class44) var2.method2319(); var12 != null; var12 = (class44) var2.method2333()) {
            if (var5.field911 != var12.field911) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field911 != var12.field911 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field970.method1689(Statics.field1569, arg0, arg1, method20(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1569), var5, var13, var10, var11);
    }

    @ObfuscatedName("de.bl(ZI)V")
    public static final void method2116(boolean arg0) {
        field429 = 0;
        field347 = 0;
        method256();
        while (field351.method2898(field352) >= 27) {
            int var1 = field351.method2918(15);
            if (var1 == 32767) {
                break;
            }
            boolean var31 = false;
            if (field484[var1] == null) {
                field484[var1] = new class36();
                var31 = true;
            }
            class36 var32 = field484[var1];
            field346[++field341 - 1] = var1;
            var32.field673 = field450;
            int var33;
            if (arg0) {
                var33 = field351.method2918(8);
                if (var33 > 127) {
                    var33 -= 256;
                }
            } else {
                var33 = field351.method2918(5);
                if (var33 > 15) {
                    var33 -= 32;
                }
            }
            int var34 = field351.method2918(1);
            if (var34 == 1) {
                field348[++field347 - 1] = var1;
            }
            int var35 = field351.method2918(1);
            var32.field789 = class200.method175(field351.method2918(14));
            int var36 = field345[field351.method2918(3)];
            if (var31) {
                var32.field675 = var32.field626 = var36;
            }
            int var37;
            if (arg0) {
                var37 = field351.method2918(8);
                if (var37 > 127) {
                    var37 -= 256;
                }
            } else {
                var37 = field351.method2918(5);
                if (var37 > 15) {
                    var37 -= 32;
                }
            }
            var32.field658 = var32.field789.field3011;
            var32.field655 = var32.field789.field3032;
            if (var32.field655 == 0) {
                var32.field626 = 0;
            }
            var32.field632 = var32.field789.field3038;
            var32.field653 = var32.field789.field3016;
            var32.field634 = var32.field789.field3017;
            var32.field635 = var32.field789.field3018;
            var32.field660 = var32.field789.field3012;
            var32.field677 = var32.field789.field3013;
            var32.field631 = var32.field789.field3015;
            var32.method795(Statics.field792.field679[0] + var33, Statics.field792.field629[0] + var37, var35 == 1);
        }
        field351.method2897();
        for (int var2 = 0; var2 < field347; var2++) {
            int var3 = field348[var2];
            class36 var4 = field484[var3];
            int var5 = field351.method2666();
            if ((var5 & 0x10) != 0) {
                var4.field789 = class200.method175(field351.method2706());
                var4.field658 = var4.field789.field3011;
                var4.field655 = var4.field789.field3032;
                var4.field632 = var4.field789.field3038;
                var4.field653 = var4.field789.field3016;
                var4.field634 = var4.field789.field3017;
                var4.field635 = var4.field789.field3018;
                var4.field660 = var4.field789.field3012;
                var4.field677 = var4.field789.field3013;
                var4.field631 = var4.field789.field3015;
            }
            if ((var5 & 0x1) != 0) {
                int var6 = field351.method2668();
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = field351.method2692();
                if (var4.field656 == var6 && var6 != -1) {
                    int var8 = class202.method3379(var6).field3070;
                    if (var8 == 1) {
                        var4.field657 = 0;
                        var4.field643 = 0;
                        var4.field637 = var7;
                        var4.field678 = 0;
                    }
                    if (var8 == 2) {
                        var4.field678 = 0;
                    }
                } else if (var6 == -1 || var4.field656 == -1 || class202.method3379(var6).field3058 >= class202.method3379(var4.field656).field3058) {
                    var4.field656 = var6;
                    var4.field657 = 0;
                    var4.field643 = 0;
                    var4.field637 = var7;
                    var4.field678 = 0;
                    var4.field683 = var4.field674;
                }
            }
            if ((var5 & 0x2) != 0) {
                var4.field659 = field351.method2700();
                int var9 = field351.method2798();
                var4.field665 = var9 >> 16;
                var4.field640 = (var9 & 0xFFFF) + field450;
                var4.field662 = 0;
                var4.field663 = 0;
                if (var4.field640 > field450) {
                    var4.field662 = -1;
                }
                if (var4.field659 == 65535) {
                    var4.field659 = -1;
                }
            }
            if ((var5 & 0x40) != 0) {
                int var10 = field351.method2666();
                if (var10 > 0) {
                    for (int var11 = 0; var11 < var10; var11++) {
                        int var12 = -1;
                        int var13 = -1;
                        int var14 = -1;
                        int var15 = field351.method2679();
                        if (var15 == 32767) {
                            var15 = field351.method2679();
                            var13 = field351.method2679();
                            var12 = field351.method2679();
                            var14 = field351.method2679();
                        } else if (var15 == 32766) {
                            var15 = -1;
                        } else {
                            var13 = field351.method2679();
                        }
                        int var16 = field351.method2679();
                        var4.method616(var15, var13, var12, var14, field450, var16);
                    }
                }
                int var17 = field351.method2692();
                if (var17 > 0) {
                    for (int var18 = 0; var18 < var17; var18++) {
                        int var19 = field351.method2679();
                        int var20 = field351.method2679();
                        if (var20 == 32767) {
                            var4.method620(var19);
                        } else {
                            int var21 = field351.method2679();
                            int var22 = field351.method2730();
                            int var23 = var20 > 0 ? field351.method2666() : var22;
                            var4.method628(var19, field450, var20, var21, var22, var23);
                        }
                    }
                }
            }
            if ((var5 & 0x20) != 0) {
                var4.field664 = field351.method2701();
                var4.field639 = 100;
            }
            if ((var5 & 0x8) != 0) {
                var4.field650 = field351.method2700();
                if (var4.field650 == 65535) {
                    var4.field650 = -1;
                }
            }
            if ((var5 & 0x4) != 0) {
                int var24 = field351.method2700();
                int var25 = field351.method2702();
                int var26 = var4.field638 - (var24 - Statics.field60 - Statics.field60) * 64;
                int var27 = var4.field625 - (var25 - Statics.field290 - Statics.field290) * 64;
                if (var26 != 0 || var27 != 0) {
                    var4.field652 = (int) (Math.atan2((double) var26, (double) var27) * 325.949D) & 0x7FF;
                }
            }
        }
        for (int var28 = 0; var28 < field429; var28++) {
            int var29 = field389[var28];
            if (field450 != field484[var29].field673) {
                field484[var29].field789 = null;
                field484[var29] = null;
            }
        }
        if (field352 != field351.field2091) {
            throw new RuntimeException(field351.field2091 + class38.field813 + field352);
        }
        for (int var30 = 0; var30 < field341; var30++) {
            if (field484[field346[var30]] == null) {
                throw new RuntimeException(var30 + class38.field813 + field341);
            }
        }
    }

    @ObfuscatedName("g.bk(I)V")
    public static final void method256() {
        field351.method2895();
        int var0 = field351.method2918(8);
        if (var0 < field341) {
            for (int var1 = var0; var1 < field341; var1++) {
                field389[++field429 - 1] = field346[var1];
            }
        }
        if (var0 > field341) {
            throw new RuntimeException("");
        }
        field341 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field346[var2];
            class36 var4 = field484[var3];
            int var5 = field351.method2918(1);
            if (var5 == 0) {
                field346[++field341 - 1] = var3;
                var4.field673 = field450;
            } else {
                int var6 = field351.method2918(2);
                if (var6 == 0) {
                    field346[++field341 - 1] = var3;
                    var4.field673 = field450;
                    field348[++field347 - 1] = var3;
                } else if (var6 == 1) {
                    field346[++field341 - 1] = var3;
                    var4.field673 = field450;
                    int var7 = field351.method2918(3);
                    var4.method798(var7, (byte) 1);
                    int var8 = field351.method2918(1);
                    if (var8 == 1) {
                        field348[++field347 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field346[++field341 - 1] = var3;
                    var4.field673 = field450;
                    int var9 = field351.method2918(3);
                    var4.method798(var9, (byte) 2);
                    int var10 = field351.method2918(3);
                    var4.method798(var10, (byte) 2);
                    int var11 = field351.method2918(1);
                    if (var11 == 1) {
                        field348[++field347 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field389[++field429 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("eb.bg(III)Ldo;")
    public static class120 method2508(int arg0, int arg1) {
        field586.field1858 = arg0;
        field586.field1853 = arg1;
        field586.field1855 = 1;
        field586.field1856 = 1;
        return field586;
    }

    @ObfuscatedName("ec.bh(I)V")
    public static void method2647() {
        field578 = 0;
        field434 = -1;
        field444 = false;
    }

    @ObfuscatedName("fy.bs(III)V")
    public static final void method3015(int arg0, int arg1) {
        if (field578 < 2 && field459 == 0 && !field512) {
            return;
        }
        int var2 = method2726();
        String var3;
        if (field459 == 1 && field578 < 2) {
            var3 = class174.field2509 + class174.field2505 + field460 + " " + class38.field810;
        } else if (field512 && field578 < 2) {
            var3 = field464 + class174.field2505 + field381 + " " + class38.field810;
        } else {
            String var4;
            if (var2 < 0) {
                var4 = "";
            } else if (field451[var2].length() > 0) {
                var4 = field417[var2] + class174.field2505 + field451[var2];
            } else {
                var4 = field417[var2];
            }
            var3 = var4;
        }
        if (field578 > 2) {
            var3 = var3 + class38.method200(16777215) + " " + '/' + " " + (field578 - 2) + class174.field2513;
        }
        Statics.field787.method3713(var3, arg0 + 4, arg1 + 15, 16777215, 0, field450 / 1000);
    }

    @ObfuscatedName("t.bq(I)V")
    public static final void method192() {
        int var0 = Statics.field71;
        int var1 = Statics.field110;
        int var2 = Statics.field1737;
        int var3 = Statics.field286;
        int var4 = 6116423;
        class220.method3812(var0, var1, var2, var3, var4);
        class220.method3812(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class220.method3818(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field787.method3705(class174.field2512, var0 + 3, var1 + 14, var4, -1);
        int var5 = class116.field1793;
        int var6 = class116.field1800;
        for (int var7 = 0; var7 < field578; var7++) {
            int var8 = (field578 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class209 var10 = Statics.field787;
            String var11;
            if (var7 < 0) {
                var11 = "";
            } else if (field451[var7].length() > 0) {
                var11 = field417[var7] + class174.field2505 + field451[var7];
            } else {
                var11 = field417[var7];
            }
            var10.method3705(var11, var0 + 3, var8, var9, 0);
        }
        method707(Statics.field71, Statics.field110, Statics.field1737, Statics.field286);
    }

    @ObfuscatedName("bb.ba(IIIII)V")
    public static final void method1180(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field490; var4++) {
            if (field516[var4] + field514[var4] > arg0 && field514[var4] < arg0 + arg2 && field485[var4] + field421[var4] > arg1 && field485[var4] < arg1 + arg3) {
                field511[var4] = true;
            }
        }
    }

    @ObfuscatedName("ad.by(IIIIB)V")
    public static final void method707(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field490; var4++) {
            if (field516[var4] + field514[var4] > arg0 && field514[var4] < arg0 + arg2 && field485[var4] + field421[var4] > arg1 && field485[var4] < arg1 + arg3) {
                field427[var4] = true;
            }
        }
    }

    @ObfuscatedName("r.br(I)V")
    public static final void method81() {
        method1897();
        if (Statics.field8 != null || field524 != null) {
            return;
        }
        int var0 = class116.field1805;
        if (field444) {
            if (var0 != 1 && (Statics.field174 || var0 != 4)) {
                int var1 = class116.field1793;
                int var2 = class116.field1800;
                if (var1 < Statics.field71 - 10 || var1 > Statics.field71 + Statics.field1737 + 10 || var2 < Statics.field110 - 10 || var2 > Statics.field286 + Statics.field110 + 10) {
                    field444 = false;
                    method1180(Statics.field71, Statics.field110, Statics.field1737, Statics.field286);
                }
            }
            if (var0 == 1 || !Statics.field174 && var0 == 4) {
                int var3 = Statics.field71;
                int var4 = Statics.field110;
                int var5 = Statics.field1737;
                int var6 = class116.field1797;
                int var7 = class116.field1807;
                int var8 = -1;
                for (int var9 = 0; var9 < field578; var9++) {
                    int var10 = (field578 - 1 - var9) * 15 + var4 + 31;
                    if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                        var8 = var9;
                    }
                }
                if (var8 != -1) {
                    method3097(var8);
                }
                field444 = false;
                method1180(Statics.field71, Statics.field110, Statics.field1737, Statics.field286);
            }
            return;
        }
        int var11 = method2726();
        if ((var0 == 1 || !Statics.field174 && var0 == 4) && var11 >= 0) {
            int var12 = field448[var11];
            if (var12 == 39 || var12 == 40 || var12 == 41 || var12 == 42 || var12 == 43 || var12 == 33 || var12 == 34 || var12 == 35 || var12 == 36 || var12 == 37 || var12 == 38 || var12 == 1005) {
                label207: {
                    int var13 = field314[var11];
                    int var14 = field447[var11];
                    class170 var15 = class170.method3109(var14);
                    int var16 = method3421(var15);
                    boolean var17 = (var16 >> 28 & 0x1) != 0;
                    if (!var17) {
                        int var18 = method3421(var15);
                        boolean var19 = (var18 >> 29 & 0x1) != 0;
                        if (!var19) {
                            break label207;
                        }
                    }
                    if (Statics.field8 != null && !field468) {
                        int var20 = method2726();
                        if (field443 != 1 && !method2634(var20) && field578 > 0) {
                            int var21 = field360;
                            int var22 = field400;
                            method3466(Statics.field91, var21, var22);
                            Statics.field91 = null;
                        }
                    }
                    field468 = false;
                    field424 = 0;
                    if (Statics.field8 != null) {
                        method3099(Statics.field8);
                    }
                    Statics.field8 = class170.method3109(var14);
                    field403 = var13;
                    field360 = class116.field1797;
                    field400 = class116.field1807;
                    if (var11 >= 0) {
                        method2646(var11);
                    }
                    method3099(Statics.field8);
                    return;
                }
            }
        }
        if ((var0 == 1 || !Statics.field174 && var0 == 4) && (field443 == 1 && field578 > 2 && !method193() || method2634(var11))) {
            var0 = 2;
        }
        if ((var0 == 1 || !Statics.field174 && var0 == 4) && field578 > 0) {
            method3097(var11);
        }
        if (var0 == 2 && field578 > 0) {
            method191(class116.field1797, class116.field1807);
        }
    }

    @ObfuscatedName("t.bf(III)V")
    public static final void method191(int arg0, int arg1) {
        int var2 = Statics.field787.method3724(class174.field2512);
        for (int var3 = 0; var3 < field578; var3++) {
            class209 var4 = Statics.field787;
            String var5;
            if (var3 < 0) {
                var5 = "";
            } else if (field451[var3].length() > 0) {
                var5 = field417[var3] + class174.field2505 + field451[var3];
            } else {
                var5 = field417[var3];
            }
            int var6 = var4.method3724(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field578 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field759) {
            var8 = Statics.field759 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field951) {
            var9 = Statics.field951 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        Statics.field970.method1806(Statics.field1569, arg0, arg1, false);
        field444 = true;
        Statics.field71 = var8;
        Statics.field110 = var9;
        Statics.field1737 = var2;
        Statics.field286 = field578 * 15 + 22;
    }

    @ObfuscatedName("ez.bi(II)Z")
    public static final boolean method2634(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field448[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("fs.bv(II)V")
    public static final void method3097(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field314[arg0];
        int var2 = field447[arg0];
        int var3 = field448[arg0];
        int var4 = field492[arg0];
        String var5 = field417[arg0];
        String var6 = field451[arg0];
        method3095(var1, var2, var3, var4, var5, var6, class116.field1797, class116.field1807);
    }

    @ObfuscatedName("gx.bx(Laj;IIB)V")
    public static final void method3466(class39 arg0, int arg1, int arg2) {
        method3095(arg0.field821, arg0.field817, arg0.field818, arg0.field819, arg0.field820, arg0.field820, arg1, arg2);
    }

    @ObfuscatedName("fa.bz(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method3095(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 49) {
            class24 var8 = field426[arg3];
            if (var8 != null) {
                field413 = arg6;
                field414 = arg7;
                field416 = 2;
                field415 = 0;
                field540 = arg0;
                field541 = arg1;
                field349.method2896(176);
                field349.method2690(class106.field1714[82] ? 1 : 0);
                field349.method2697(arg3);
            }
        }
        if (arg2 == 1003) {
            field413 = arg6;
            field414 = arg7;
            field416 = 2;
            field415 = 0;
            class36 var9 = field484[arg3];
            if (var9 != null) {
                class200 var10 = var9.field789;
                if (var10.field3033 != null) {
                    var10 = var10.method3542();
                }
                if (var10 != null) {
                    field349.method2896(108);
                    field349.method2695(var10.field3009);
                }
            }
        }
        if (arg2 == 34) {
            field349.method2896(95);
            field349.method2654(arg1);
            field349.method2664(arg0);
            field349.method2664(arg3);
            field453 = 0;
            Statics.field844 = class170.method3109(arg1);
            field445 = arg0;
        }
        if (arg2 == 3) {
            field413 = arg6;
            field414 = arg7;
            field416 = 2;
            field415 = 0;
            field540 = arg0;
            field541 = arg1;
            field349.method2896(83);
            field349.method2698(Statics.field60 + arg0);
            field349.method2664(arg3 >> 14 & 0x7FFF);
            field349.method2664(Statics.field290 + arg1);
            field349.method2689(class106.field1714[82] ? 1 : 0);
        }
        if (arg2 == 4) {
            field413 = arg6;
            field414 = arg7;
            field416 = 2;
            field415 = 0;
            field540 = arg0;
            field541 = arg1;
            field349.method2896(161);
            field349.method2689(class106.field1714[82] ? 1 : 0);
            field349.method2697(arg3 >> 14 & 0x7FFF);
            field349.method2695(Statics.field60 + arg0);
            field349.method2698(Statics.field290 + arg1);
        }
        if (arg2 == 43) {
            field349.method2896(77);
            field349.method2698(arg3);
            field349.method2698(arg0);
            field349.method2654(arg1);
            field453 = 0;
            Statics.field844 = class170.method3109(arg1);
            field445 = arg0;
        }
        if (arg2 == 16) {
            field413 = arg6;
            field414 = arg7;
            field416 = 2;
            field415 = 0;
            field540 = arg0;
            field541 = arg1;
            field349.method2896(107);
            field349.method2664(Statics.field290 + arg1);
            field349.method2690(class106.field1714[82] ? 1 : 0);
            field349.method2695(Statics.field987);
            field349.method2697(Statics.field60 + arg0);
            field349.method2695(Statics.field771);
            field349.method2805(Statics.field1646);
            field349.method2664(arg3);
        }
        if (arg2 == 10) {
            class36 var11 = field484[arg3];
            if (var11 != null) {
                field413 = arg6;
                field414 = arg7;
                field416 = 2;
                field415 = 0;
                field540 = arg0;
                field541 = arg1;
                field349.method2896(135);
                field349.method2697(arg3);
                field349.method2690(class106.field1714[82] ? 1 : 0);
            }
        }
        if (arg2 == 18) {
            field413 = arg6;
            field414 = arg7;
            field416 = 2;
            field415 = 0;
            field540 = arg0;
            field541 = arg1;
            field349.method2896(35);
            field349.method2751(class106.field1714[82] ? 1 : 0);
            field349.method2697(Statics.field60 + arg0);
            field349.method2698(arg3);
            field349.method2697(Statics.field290 + arg1);
        }
        if (arg2 == 39) {
            field349.method2896(223);
            field349.method2698(arg3);
            field349.method2709(arg1);
            field349.method2697(arg0);
            field453 = 0;
            Statics.field844 = class170.method3109(arg1);
            field445 = arg0;
        }
        if (arg2 == 15) {
            class24 var12 = field426[arg3];
            if (var12 != null) {
                field413 = arg6;
                field414 = arg7;
                field416 = 2;
                field415 = 0;
                field540 = arg0;
                field541 = arg1;
                field349.method2896(10);
                field349.method2768(class106.field1714[82] ? 1 : 0);
                field349.method2697(field462);
                field349.method2654(Statics.field167);
                field349.method2697(arg3);
            }
        }
        if (arg2 == 51) {
            class24 var13 = field426[arg3];
            if (var13 != null) {
                field413 = arg6;
                field414 = arg7;
                field416 = 2;
                field415 = 0;
                field540 = arg0;
                field541 = arg1;
                field349.method2896(52);
                field349.method2698(arg3);
                field349.method2689(class106.field1714[82] ? 1 : 0);
            }
        }
        if (arg2 == 42) {
            field349.method2896(137);
            field349.method2805(arg1);
            field349.method2698(arg0);
            field349.method2695(arg3);
            field453 = 0;
            Statics.field844 = class170.method3109(arg1);
            field445 = arg0;
        }
        if (arg2 == 1) {
            field413 = arg6;
            field414 = arg7;
            field416 = 2;
            field415 = 0;
            field540 = arg0;
            field541 = arg1;
            field349.method2896(45);
            field349.method2690(class106.field1714[82] ? 1 : 0);
            field349.method2664(arg3 >> 14 & 0x7FFF);
            field349.method2697(Statics.field771);
            field349.method2664(Statics.field290 + arg1);
            field349.method2697(Statics.field60 + arg0);
            field349.method2805(Statics.field1646);
            field349.method2698(Statics.field987);
        }
        if (arg2 == 32) {
            field349.method2896(24);
            field349.method2697(arg0);
            field349.method2697(arg3);
            field349.method2852(arg1);
            field349.method2697(field462);
            field349.method2709(Statics.field167);
            field453 = 0;
            Statics.field844 = class170.method3109(arg1);
            field445 = arg0;
        }
        if (arg2 == 12) {
            class36 var14 = field484[arg3];
            if (var14 != null) {
                field413 = arg6;
                field414 = arg7;
                field416 = 2;
                field415 = 0;
                field540 = arg0;
                field541 = arg1;
                field349.method2896(171);
                field349.method2690(class106.field1714[82] ? 1 : 0);
                field349.method2697(arg3);
            }
        }
        if (arg2 == 41) {
            field349.method2896(220);
            field349.method2709(arg1);
            field349.method2695(arg3);
            field349.method2697(arg0);
            field453 = 0;
            Statics.field844 = class170.method3109(arg1);
            field445 = arg0;
        }
        if (arg2 == 50) {
            class24 var15 = field426[arg3];
            if (var15 != null) {
                field413 = arg6;
                field414 = arg7;
                field416 = 2;
                field415 = 0;
                field540 = arg0;
                field541 = arg1;
                field349.method2896(30);
                field349.method2698(arg3);
                field349.method2768(class106.field1714[82] ? 1 : 0);
            }
        }
        if (arg2 == 30 && field470 == null) {
            method859(arg1, arg0);
            field470 = class170.method1140(arg1, arg0);
            method3099(field470);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class170 var16 = class170.method1140(arg1, arg0);
            if (var16 != null) {
                int var17 = var16.field2326;
                class170 var18 = class170.method1140(arg1, arg0);
                if (var18 != null) {
                    if (var18.field2275 != null) {
                        class19 var19 = new class19();
                        var19.field199 = var18;
                        var19.field202 = arg3;
                        var19.field203 = arg5;
                        var19.field210 = var18.field2275;
                        class33.method3098(var19, 200000);
                    }
                    boolean var20 = true;
                    if (var18.field2321 > 0) {
                        var20 = method793(var18);
                    }
                    if (var20 && class171.method868(method3421(var18), arg3 - 1)) {
                        if (arg3 == 1) {
                            field349.method2896(100);
                            field349.method2654(arg1);
                            field349.method2664(arg0);
                            field349.method2664(var17);
                        }
                        if (arg3 == 2) {
                            field349.method2896(118);
                            field349.method2654(arg1);
                            field349.method2664(arg0);
                            field349.method2664(var17);
                        }
                        if (arg3 == 3) {
                            field349.method2896(168);
                            field349.method2654(arg1);
                            field349.method2664(arg0);
                            field349.method2664(var17);
                        }
                        if (arg3 == 4) {
                            field349.method2896(235);
                            field349.method2654(arg1);
                            field349.method2664(arg0);
                            field349.method2664(var17);
                        }
                        if (arg3 == 5) {
                            field349.method2896(234);
                            field349.method2654(arg1);
                            field349.method2664(arg0);
                            field349.method2664(var17);
                        }
                        if (arg3 == 6) {
                            field349.method2896(87);
                            field349.method2654(arg1);
                            field349.method2664(arg0);
                            field349.method2664(var17);
                        }
                        if (arg3 == 7) {
                            field349.method2896(55);
                            field349.method2654(arg1);
                            field349.method2664(arg0);
                            field349.method2664(var17);
                        }
                        if (arg3 == 8) {
                            field349.method2896(102);
                            field349.method2654(arg1);
                            field349.method2664(arg0);
                            field349.method2664(var17);
                        }
                        if (arg3 == 9) {
                            field349.method2896(249);
                            field349.method2654(arg1);
                            field349.method2664(arg0);
                            field349.method2664(var17);
                        }
                        if (arg3 == 10) {
                            field349.method2896(111);
                            field349.method2654(arg1);
                            field349.method2664(arg0);
                            field349.method2664(var17);
                        }
                    }
                }
            }
        }
        if (arg2 == 1004) {
            field413 = arg6;
            field414 = arg7;
            field416 = 2;
            field415 = 0;
            field349.method2896(133);
            field349.method2697(arg3);
        }
        if (arg2 == 1005) {
            class170 var21 = class170.method3109(arg1);
            if (var21 == null || var21.field2325[arg0] < 100000) {
                field349.method2896(133);
                field349.method2697(arg3);
            } else {
                class48.method187(27, "", var21.field2325[arg0] + " x " + class199.method1947(arg3).field2959);
            }
            field453 = 0;
            Statics.field844 = class170.method3109(arg1);
            field445 = arg0;
        }
        if (arg2 == 17) {
            field413 = arg6;
            field414 = arg7;
            field416 = 2;
            field415 = 0;
            field540 = arg0;
            field541 = arg1;
            field349.method2896(189);
            field349.method2698(arg3);
            field349.method2697(Statics.field290 + arg1);
            field349.method2690(class106.field1714[82] ? 1 : 0);
            field349.method2852(Statics.field167);
            field349.method2698(Statics.field60 + arg0);
            field349.method2664(field462);
        }
        if (arg2 == 45) {
            class24 var22 = field426[arg3];
            if (var22 != null) {
                field413 = arg6;
                field414 = arg7;
                field416 = 2;
                field415 = 0;
                field540 = arg0;
                field541 = arg1;
                field349.method2896(164);
                field349.method2768(class106.field1714[82] ? 1 : 0);
                field349.method2697(arg3);
            }
        }
        if (arg2 == 9) {
            class36 var23 = field484[arg3];
            if (var23 != null) {
                field413 = arg6;
                field414 = arg7;
                field416 = 2;
                field415 = 0;
                field540 = arg0;
                field541 = arg1;
                field349.method2896(226);
                field349.method2689(class106.field1714[82] ? 1 : 0);
                field349.method2695(arg3);
            }
        }
        if (arg2 == 28) {
            field349.method2896(208);
            field349.method2654(arg1);
            class170 var24 = class170.method3109(arg1);
            if (var24.field2318 != null && var24.field2318[0][0] == 5) {
                int var25 = var24.field2318[0][1];
                class166.field2163[var25] = 1 - class166.field2163[var25];
                method2593(var25);
            }
        }
        if (arg2 == 24) {
            class170 var26 = class170.method3109(arg1);
            boolean var27 = true;
            if (var26.field2321 > 0) {
                var27 = method793(var26);
            }
            if (var27) {
                field349.method2896(208);
                field349.method2654(arg1);
            }
        }
        if (arg2 == 33) {
            field349.method2896(148);
            field349.method2698(arg0);
            field349.method2709(arg1);
            field349.method2664(arg3);
            field453 = 0;
            Statics.field844 = class170.method3109(arg1);
            field445 = arg0;
        }
        if (arg2 == 6) {
            field413 = arg6;
            field414 = arg7;
            field416 = 2;
            field415 = 0;
            field540 = arg0;
            field541 = arg1;
            field349.method2896(158);
            field349.method2768(class106.field1714[82] ? 1 : 0);
            field349.method2697(Statics.field60 + arg0);
            field349.method2695(Statics.field290 + arg1);
            field349.method2664(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 38) {
            Statics.method2390();
            class170 var28 = class170.method3109(arg1);
            field459 = 1;
            Statics.field771 = arg0;
            Statics.field1646 = arg1;
            Statics.field987 = arg3;
            method3099(var28);
            field460 = class38.method200(16748608) + class199.method1947(arg3).field2959 + class38.method200(16777215);
            if (field460 == null) {
                field460 = "null";
            }
            return;
        }
        if (arg2 == 31) {
            field349.method2896(73);
            field349.method2698(arg0);
            field349.method2805(arg1);
            field349.method2664(arg3);
            field349.method2695(Statics.field987);
            field349.method2709(Statics.field1646);
            field349.method2695(Statics.field771);
            field453 = 0;
            Statics.field844 = class170.method3109(arg1);
            field445 = arg0;
        }
        if (arg2 == 7) {
            class36 var29 = field484[arg3];
            if (var29 != null) {
                field413 = arg6;
                field414 = arg7;
                field416 = 2;
                field415 = 0;
                field540 = arg0;
                field541 = arg1;
                field349.method2896(165);
                field349.method2698(Statics.field771);
                field349.method2664(arg3);
                field349.method2697(Statics.field987);
                field349.method2654(Statics.field1646);
                field349.method2689(class106.field1714[82] ? 1 : 0);
            }
        }
        if (arg2 == 5) {
            field413 = arg6;
            field414 = arg7;
            field416 = 2;
            field415 = 0;
            field540 = arg0;
            field541 = arg1;
            field349.method2896(78);
            field349.method2697(Statics.field60 + arg0);
            field349.method2695(arg3 >> 14 & 0x7FFF);
            field349.method2664(Statics.field290 + arg1);
            field349.method2690(class106.field1714[82] ? 1 : 0);
        }
        if (arg2 == 36) {
            field349.method2896(233);
            field349.method2805(arg1);
            field349.method2695(arg0);
            field349.method2697(arg3);
            field453 = 0;
            Statics.field844 = class170.method3109(arg1);
            field445 = arg0;
        }
        if (arg2 == 58) {
            class170 var30 = class170.method1140(arg1, arg0);
            if (var30 != null) {
                field349.method2896(85);
                field349.method2698(field462);
                field349.method2697(field463);
                field349.method2852(arg1);
                field349.method2697(arg0);
                field349.method2852(Statics.field167);
                field349.method2697(var30.field2326);
            }
        }
        if (arg2 == 37) {
            field349.method2896(200);
            field349.method2852(arg1);
            field349.method2695(arg3);
            field349.method2664(arg0);
            field453 = 0;
            Statics.field844 = class170.method3109(arg1);
            field445 = arg0;
        }
        if (arg2 == 29) {
            field349.method2896(208);
            field349.method2654(arg1);
            class170 var31 = class170.method3109(arg1);
            if (var31.field2318 != null && var31.field2318[0][0] == 5) {
                int var32 = var31.field2318[0][1];
                if (class166.field2163[var32] != var31.field2320[0]) {
                    class166.field2163[var32] = var31.field2320[0];
                    method2593(var32);
                }
            }
        }
        if (arg2 == 19) {
            field413 = arg6;
            field414 = arg7;
            field416 = 2;
            field415 = 0;
            field540 = arg0;
            field541 = arg1;
            field349.method2896(86);
            field349.method2664(arg3);
            field349.method2751(class106.field1714[82] ? 1 : 0);
            field349.method2697(Statics.field290 + arg1);
            field349.method2695(Statics.field60 + arg0);
        }
        if (arg2 == 2) {
            field413 = arg6;
            field414 = arg7;
            field416 = 2;
            field415 = 0;
            field540 = arg0;
            field541 = arg1;
            field349.method2896(222);
            field349.method2768(class106.field1714[82] ? 1 : 0);
            field349.method2697(field462);
            field349.method2695(arg3 >> 14 & 0x7FFF);
            field349.method2654(Statics.field167);
            field349.method2697(Statics.field60 + arg0);
            field349.method2695(Statics.field290 + arg1);
        }
        if (arg2 == 47) {
            class24 var33 = field426[arg3];
            if (var33 != null) {
                field413 = arg6;
                field414 = arg7;
                field416 = 2;
                field415 = 0;
                field540 = arg0;
                field541 = arg1;
                field349.method2896(42);
                field349.method2751(class106.field1714[82] ? 1 : 0);
                field349.method2698(arg3);
            }
        }
        if (arg2 == 46) {
            class24 var34 = field426[arg3];
            if (var34 != null) {
                field413 = arg6;
                field414 = arg7;
                field416 = 2;
                field415 = 0;
                field540 = arg0;
                field541 = arg1;
                field349.method2896(64);
                field349.method2689(class106.field1714[82] ? 1 : 0);
                field349.method2695(arg3);
            }
        }
        if (arg2 == 35) {
            field349.method2896(129);
            field349.method2805(arg1);
            field349.method2697(arg3);
            field349.method2698(arg0);
            field453 = 0;
            Statics.field844 = class170.method3109(arg1);
            field445 = arg0;
        }
        if (arg2 == 11) {
            class36 var35 = field484[arg3];
            if (var35 != null) {
                field413 = arg6;
                field414 = arg7;
                field416 = 2;
                field415 = 0;
                field540 = arg0;
                field541 = arg1;
                field349.method2896(92);
                field349.method2695(arg3);
                field349.method2690(class106.field1714[82] ? 1 : 0);
            }
        }
        if (arg2 == 21) {
            field413 = arg6;
            field414 = arg7;
            field416 = 2;
            field415 = 0;
            field540 = arg0;
            field541 = arg1;
            field349.method2896(248);
            field349.method2751(class106.field1714[82] ? 1 : 0);
            field349.method2695(arg3);
            field349.method2697(Statics.field290 + arg1);
            field349.method2697(Statics.field60 + arg0);
        }
        if (arg2 == 48) {
            class24 var36 = field426[arg3];
            if (var36 != null) {
                field413 = arg6;
                field414 = arg7;
                field416 = 2;
                field415 = 0;
                field540 = arg0;
                field541 = arg1;
                field349.method2896(7);
                field349.method2698(arg3);
                field349.method2689(class106.field1714[82] ? 1 : 0);
            }
        }
        if (arg2 == 25) {
            class170 var37 = class170.method1140(arg1, arg0);
            if (var37 != null) {
                Statics.method2390();
                method3102(arg1, arg0, class171.method179(method3421(var37)), var37.field2326);
                field459 = 0;
                field464 = method178(var37);
                if (field464 == null) {
                    field464 = "Null";
                }
                if (var37.field2205) {
                    field381 = var37.field2279 + class38.method200(16777215);
                } else {
                    field381 = class38.method200(65280) + var37.field2309 + class38.method200(16777215);
                }
            }
            return;
        }
        if (arg2 == 20) {
            field413 = arg6;
            field414 = arg7;
            field416 = 2;
            field415 = 0;
            field540 = arg0;
            field541 = arg1;
            field349.method2896(65);
            field349.method2664(arg3);
            field349.method2690(class106.field1714[82] ? 1 : 0);
            field349.method2698(Statics.field60 + arg0);
            field349.method2697(Statics.field290 + arg1);
        }
        if (arg2 == 13) {
            class36 var38 = field484[arg3];
            if (var38 != null) {
                field413 = arg6;
                field414 = arg7;
                field416 = 2;
                field415 = 0;
                field540 = arg0;
                field541 = arg1;
                field349.method2896(246);
                field349.method2695(arg3);
                field349.method2690(class106.field1714[82] ? 1 : 0);
            }
        }
        if (arg2 == 1001) {
            field413 = arg6;
            field414 = arg7;
            field416 = 2;
            field415 = 0;
            field540 = arg0;
            field541 = arg1;
            field349.method2896(58);
            field349.method2698(arg3 >> 14 & 0x7FFF);
            field349.method2689(class106.field1714[82] ? 1 : 0);
            field349.method2695(Statics.field60 + arg0);
            field349.method2695(Statics.field290 + arg1);
        }
        if (arg2 == 40) {
            field349.method2896(101);
            field349.method2852(arg1);
            field349.method2697(arg3);
            field349.method2695(arg0);
            field453 = 0;
            Statics.field844 = class170.method3109(arg1);
            field445 = arg0;
        }
        if (arg2 == 1002) {
            field413 = arg6;
            field414 = arg7;
            field416 = 2;
            field415 = 0;
            field349.method2896(71);
            field349.method2698(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 14) {
            class24 var39 = field426[arg3];
            if (var39 != null) {
                field413 = arg6;
                field414 = arg7;
                field416 = 2;
                field415 = 0;
                field540 = arg0;
                field541 = arg1;
                field349.method2896(244);
                field349.method2751(class106.field1714[82] ? 1 : 0);
                field349.method2695(Statics.field771);
                field349.method2852(Statics.field1646);
                field349.method2698(Statics.field987);
                field349.method2664(arg3);
            }
        }
        if (arg2 == 26) {
            field349.method2896(197);
            for (class18 var40 = (class18) field467.method2264(); var40 != null; var40 = (class18) field467.method2272()) {
                if (var40.field190 == 0 || var40.field190 == 3) {
                    method669(var40, true);
                }
            }
            if (field470 != null) {
                method3099(field470);
                field470 = null;
            }
        }
        if (arg2 == 44) {
            class24 var41 = field426[arg3];
            if (var41 != null) {
                field413 = arg6;
                field414 = arg7;
                field416 = 2;
                field415 = 0;
                field540 = arg0;
                field541 = arg1;
                field349.method2896(96);
                field349.method2664(arg3);
                field349.method2689(class106.field1714[82] ? 1 : 0);
            }
        }
        if (arg2 == 22) {
            field413 = arg6;
            field414 = arg7;
            field416 = 2;
            field415 = 0;
            field540 = arg0;
            field541 = arg1;
            field349.method2896(138);
            field349.method2695(Statics.field290 + arg1);
            field349.method2698(Statics.field60 + arg0);
            field349.method2690(class106.field1714[82] ? 1 : 0);
            field349.method2698(arg3);
        }
        if (arg2 == 23) {
            if (field444) {
                Statics.field970.method1767();
            } else {
                Statics.field970.method1806(Statics.field1569, arg0, arg1, true);
            }
        }
        if (arg2 == 8) {
            class36 var42 = field484[arg3];
            if (var42 != null) {
                field413 = arg6;
                field414 = arg7;
                field416 = 2;
                field415 = 0;
                field540 = arg0;
                field541 = arg1;
                field349.method2896(72);
                field349.method2768(class106.field1714[82] ? 1 : 0);
                field349.method2805(Statics.field167);
                field349.method2664(arg3);
                field349.method2695(field462);
            }
        }
        if (field459 != 0) {
            field459 = 0;
            method3099(class170.method3109(Statics.field1646));
        }
        if (field512) {
            Statics.method2390();
        }
        if (Statics.field844 != null && field453 == 0) {
            method3099(Statics.field844);
        }
    }

    @ObfuscatedName("ft.cq(IIIIB)V")
    public static void method3102(int arg0, int arg1, int arg2, int arg3) {
        class170 var4 = class170.method1140(arg0, arg1);
        if (var4 != null && var4.field2297 != null) {
            class19 var5 = new class19();
            var5.field199 = var4;
            var5.field210 = var4.field2297;
            class33.method3098(var5, 200000);
        }
        field463 = arg3;
        field512 = true;
        Statics.field167 = arg0;
        field462 = arg1;
        Statics.field740 = arg2;
        method3099(var4);
    }

    @ObfuscatedName("ag.cy(IIB)V")
    public static void method859(int arg0, int arg1) {
        field349.method2896(50);
        field349.method2664(arg1);
        field349.method2709(arg0);
    }

    @ObfuscatedName("ck.ct(I)V")
    public static final void method1897() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field578 - 1; var1++) {
                if (field448[var1] < 1000 && field448[var1 + 1] > 1000) {
                    String var2 = field451[var1];
                    field451[var1] = field451[var1 + 1];
                    field451[var1 + 1] = var2;
                    String var3 = field417[var1];
                    field417[var1] = field417[var1 + 1];
                    field417[var1 + 1] = var3;
                    int var4 = field448[var1];
                    field448[var1] = field448[var1 + 1];
                    field448[var1 + 1] = var4;
                    int var5 = field314[var1];
                    field314[var1] = field314[var1 + 1];
                    field314[var1 + 1] = var5;
                    int var6 = field447[var1];
                    field447[var1] = field447[var1 + 1];
                    field447[var1 + 1] = var6;
                    int var7 = field492[var1];
                    field492[var1] = field492[var1 + 1];
                    field492[var1 + 1] = var7;
                    if (field434 != -1) {
                        if (field434 == var1) {
                            field434 = var1 + 1;
                        } else if (field434 == var1 + 1) {
                            field434 = var1;
                        }
                    }
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("dq.cf(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2152(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method1530(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("cq.cw(Ljava/lang/String;Ljava/lang/String;IIIIZB)V")
    public static final void method1530(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field444 || field578 >= 500) {
            return;
        }
        field417[field578] = arg0;
        field451[field578] = arg1;
        field448[field578] = arg2;
        field492[field578] = arg3;
        field314[field578] = arg4;
        field447[field578] = arg5;
        if (arg6) {
            field434 = field578;
        }
        field578++;
    }

    @ObfuscatedName("el.cz(I)I")
    public static final int method2726() {
        if (field578 <= 0) {
            return -1;
        } else if (field454 && class106.field1714[81] && field434 != -1) {
            return field434;
        } else {
            return field578 - 1;
        }
    }

    @ObfuscatedName("t.ch(B)Z")
    public static final boolean method193() {
        if (field578 <= 0) {
            return false;
        } else {
            return field454 && class106.field1714[81] && field434 != -1;
        }
    }

    @ObfuscatedName("b.cj(B)V")
    public static void method174() {
        for (int var0 = 0; var0 < field578; var0++) {
            if (method2981(field448[var0])) {
                if (var0 < field578 - 1) {
                    for (int var1 = var0; var1 < field578 - 1; var1++) {
                        field417[var1] = field417[var1 + 1];
                        field451[var1] = field451[var1 + 1];
                        field448[var1] = field448[var1 + 1];
                        field492[var1] = field492[var1 + 1];
                        field314[var1] = field314[var1 + 1];
                        field447[var1] = field447[var1 + 1];
                    }
                }
                field578--;
            }
        }
    }

    @ObfuscatedName("fi.cn(II)Z")
    public static boolean method2981(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("ah.cs(IIIII)V")
    public static final void method810(int arg0, int arg1, int arg2, int arg3) {
        if (field459 == 0 && !field512) {
            method2152(class174.field2419, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class83.field1423; var6++) {
            int var7 = class83.field1383[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field970.method1712(Statics.field1569, var8, var9, var7) >= 0) {
                    class198 var12 = class198.method3257(var11);
                    if (var12.field2935 != null) {
                        var12 = var12.method3432();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field459 == 1) {
                        method2152(class174.field2509, field460 + " " + class38.field810 + " " + class38.method200(65535) + var12.field2904, 1, var7, var8, var9);
                    } else if (!field512) {
                        String[] var13 = var12.field2945;
                        if (field477) {
                            var13 = method2204(var13);
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
                                    method2152(var13[var14], class38.method200(65535) + var12.field2904, var15, var7, var8, var9);
                                }
                            }
                        }
                        method2152(class174.field2579, class38.method200(65535) + var12.field2904, 1002, var12.field2901 << 14, var8, var9);
                    } else if ((Statics.field740 & 0x4) == 4) {
                        method2152(field464, field381 + " " + class38.field810 + " " + class38.method200(65535) + var12.field2904, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class36 var16 = field484[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field789.field3011 == 1 && (var16.field638 & 0x7F) == 64 && (var16.field625 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field341; var17++) {
                            class36 var18 = field484[field346[var17]];
                            if (var18 != null && var16 != var18 && var18.field789.field3011 == 1 && var16.field638 == var18.field638 && var16.field625 == var18.field625) {
                                method102(var18.field789, field346[var17], var8, var9);
                            }
                        }
                        int var19 = class46.field922;
                        int[] var20 = class46.field932;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class24 var22 = field426[var20[var21]];
                            if (var22 != null && var16.field638 == var22.field638 && var16.field625 == var22.field625) {
                                method1886(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method102(var16.field789, var11, var8, var9);
                }
                if (var10 == 0) {
                    class24 var23 = field426[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field638 & 0x7F) == 64 && (var23.field625 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field341; var24++) {
                            class36 var25 = field484[field346[var24]];
                            if (var25 != null && var25.field789.field3011 == 1 && var23.field638 == var25.field638 && var23.field625 == var25.field625) {
                                method102(var25.field789, field346[var24], var8, var9);
                            }
                        }
                        int var26 = class46.field922;
                        int[] var27 = class46.field932;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class24 var29 = field426[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field638 == var29.field638 && var23.field625 == var29.field625) {
                                method1886(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field435 == var11) {
                        var4 = var7;
                    } else {
                        method1886(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class129 var30 = field449[Statics.field1569][var8][var9];
                    if (var30 != null) {
                        for (class44 var31 = (class44) var30.method2332(); var31 != null; var31 = (class44) var30.method2322()) {
                            class199 var32 = class199.method1947(var31.field911);
                            if (field459 == 1) {
                                method2152(class174.field2509, field460 + " " + class38.field810 + " " + class38.method200(16748608) + var32.field2959, 16, var31.field911, var8, var9);
                            } else if (!field512) {
                                String[] var33 = var32.field3002;
                                if (field477) {
                                    var33 = method2204(var33);
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
                                        method2152(var33[var34], class38.method200(16748608) + var32.field2959, var35, var31.field911, var8, var9);
                                    } else if (var34 == 2) {
                                        method2152(class174.field2379, class38.method200(16748608) + var32.field2959, 20, var31.field911, var8, var9);
                                    }
                                }
                                method2152(class174.field2579, class38.method200(16748608) + var32.field2959, 1004, var31.field911, var8, var9);
                            } else if ((Statics.field740 & 0x1) == 1) {
                                method2152(field464, field381 + " " + class38.field810 + " " + class38.method200(16748608) + var32.field2959, 17, var31.field911, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class24 var38 = field426[field435];
            method1886(var38, field435, var36, var37);
        }
    }

    @ObfuscatedName("i.cg(Lgk;IIIB)V")
    public static final void method102(class200 arg0, int arg1, int arg2, int arg3) {
        if (field578 >= 400) {
            return;
        }
        if (arg0.field3033 != null) {
            arg0 = arg0.method3542();
        }
        if (arg0 == null || !arg0.field3036 || arg0.field3003 && field515 != arg1) {
            return;
        }
        String var4 = arg0.field3010;
        if (arg0.field3025 != 0) {
            int var6 = arg0.field3025;
            int var7 = Statics.field792.field282;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class38.method200(16711680);
            } else if (var8 < -6) {
                var9 = class38.method200(16723968);
            } else if (var8 < -3) {
                var9 = class38.method200(16740352);
            } else if (var8 < 0) {
                var9 = class38.method200(16756736);
            } else if (var8 > 9) {
                var9 = class38.method200(65280);
            } else if (var8 > 6) {
                var9 = class38.method200(4259584);
            } else if (var8 > 3) {
                var9 = class38.method200(8453888);
            } else if (var8 > 0) {
                var9 = class38.method200(12648192);
            } else {
                var9 = class38.method200(16776960);
            }
            var4 = var4 + var9 + " " + class38.field815 + class174.field2536 + arg0.field3025 + class38.field809;
        }
        if (arg0.field3003 && field315) {
            method2152(class174.field2579, class38.method200(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field459 == 1) {
            method2152(class174.field2509, field460 + " " + class38.field810 + " " + class38.method200(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field512) {
            int var10 = arg0.field3003 && field315 ? 2000 : 0;
            String[] var11 = arg0.field3023;
            if (field477) {
                var11 = method2204(var11);
            }
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class174.field2511)) {
                        int var13 = 0;
                        if (var12 == 0) {
                            var13 = var10 + 9;
                        }
                        if (var12 == 1) {
                            var13 = var10 + 10;
                        }
                        if (var12 == 2) {
                            var13 = var10 + 11;
                        }
                        if (var12 == 3) {
                            var13 = var10 + 12;
                        }
                        if (var12 == 4) {
                            var13 = var10 + 13;
                        }
                        method2152(var11[var12], class38.method200(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class174.field2511)) {
                        short var15 = 0;
                        if (field333 != class41.field837) {
                            if (field333 == class41.field830 || field333 == class41.field832 && arg0.field3025 > Statics.field792.field282) {
                                var15 = 2000;
                            }
                            int var16 = 0;
                            if (var14 == 0) {
                                var16 = var15 + 9;
                            }
                            if (var14 == 1) {
                                var16 = var15 + 10;
                            }
                            if (var14 == 2) {
                                var16 = var15 + 11;
                            }
                            if (var14 == 3) {
                                var16 = var15 + 12;
                            }
                            if (var14 == 4) {
                                var16 = var15 + 13;
                            }
                            method2152(var11[var14], class38.method200(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3003 || !field315) {
                method2152(class174.field2579, class38.method200(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field740 & 0x2) == 2) {
            method2152(field464, field381 + " " + class38.field810 + " " + class38.method200(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("cp.cb(Lx;IIIS)V")
    public static final void method1886(class24 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field792 == arg0 || field578 >= 400) {
            return;
        }
        String var9;
        if (arg0.field257 == 0) {
            String var4 = arg0.field261[0] + arg0.field263 + arg0.field261[1];
            int var5 = arg0.field282;
            int var6 = Statics.field792.field282;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class38.method200(16711680);
            } else if (var7 < -6) {
                var8 = class38.method200(16723968);
            } else if (var7 < -3) {
                var8 = class38.method200(16740352);
            } else if (var7 < 0) {
                var8 = class38.method200(16756736);
            } else if (var7 > 9) {
                var8 = class38.method200(65280);
            } else if (var7 > 6) {
                var8 = class38.method200(4259584);
            } else if (var7 > 3) {
                var8 = class38.method200(8453888);
            } else if (var7 > 0) {
                var8 = class38.method200(12648192);
            } else {
                var8 = class38.method200(16776960);
            }
            var9 = var4 + var8 + " " + class38.field815 + class174.field2536 + arg0.field282 + class38.field809 + arg0.field261[2];
        } else {
            var9 = arg0.field261[0] + arg0.field263 + arg0.field261[1] + " " + class38.field815 + class174.field2516 + arg0.field257 + class38.field809 + arg0.field261[2];
        }
        if (field459 == 1) {
            method2152(class174.field2509, field460 + " " + class38.field810 + " " + class38.method200(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field512) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field432[var10] != null) {
                    short var11 = 0;
                    if (field432[var10].equalsIgnoreCase(class174.field2511)) {
                        if (field332 == class41.field837) {
                            continue;
                        }
                        if (field332 == class41.field830 || field332 == class41.field832 && arg0.field282 > Statics.field792.field282) {
                            var11 = 2000;
                        }
                        if (Statics.field792.field276 != 0 && arg0.field276 != 0) {
                            if (Statics.field792.field276 == arg0.field276) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field375[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field431[var10] + var11;
                    method2152(field432[var10], class38.method200(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field740 & 0x8) == 8) {
            method2152(field464, field381 + " " + class38.field810 + " " + class38.method200(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field578; var14++) {
            if (field448[var14] == 23) {
                field451[var14] = class38.method200(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("w.cp(IIIIIIIII)V")
    public static final void method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class170.method693(arg0)) {
            Statics.field1787 = null;
            method3197(Statics.field2197[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1787 != null) {
                method3197(Statics.field1787, -1412584499, arg1, arg2, arg3, arg4, Statics.field1844, Statics.field2662, arg7);
                Statics.field1787 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field511[var8] = true;
            }
        } else {
            field511[arg7] = true;
        }
    }

    @ObfuscatedName("ga.cu([Lfu;IIIIIIIII)V")
    public static final void method3197(class170[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class220.method3832(arg2, arg3, arg4, arg5);
        class85.method1621();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class170 var10 = arg0[var9];
            if (var10 != null && (var10.field2225 == arg1 || arg1 == -1412584499 && field524 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field514[field490] = var10.field2219 + arg6;
                    field485[field490] = var10.field2220 + arg7;
                    field516[field490] = var10.field2221;
                    field421[field490] = var10.field2196;
                    var11 = ++field490 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2337 = var11;
                var10.field2338 = field450;
                if (!var10.field2205 || !method1618(var10)) {
                    if (var10.field2321 > 0) {
                        method202(var10);
                    }
                    int var12 = var10.field2219 + arg6;
                    int var13 = var10.field2220 + arg7;
                    int var14 = var10.field2286;
                    if (field524 == var10) {
                        if (arg1 != -1412584499 && !var10.field2284) {
                            Statics.field1787 = arg0;
                            Statics.field1844 = arg6;
                            Statics.field2662 = arg7;
                            continue;
                        }
                        if (field493 && field517) {
                            int var15 = class116.field1793;
                            int var16 = class116.field1800;
                            int var17 = var15 - field481;
                            int var18 = var16 - field370;
                            if (var17 < field320) {
                                var17 = field320;
                            }
                            if (var10.field2221 + var17 > field320 + field531.field2221) {
                                var17 = field320 + field531.field2221 - var10.field2221;
                            }
                            if (var18 < field486) {
                                var18 = field486;
                            }
                            if (var10.field2196 + var18 > field486 + field531.field2196) {
                                var18 = field486 + field531.field2196 - var10.field2196;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2284) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2208 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2208 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2221 + var12;
                        int var26 = var10.field2196 + var13;
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
                        int var29 = var10.field2221 + var12;
                        int var30 = var10.field2196 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2205 || var19 < var21 && var20 < var22) {
                        if (var10.field2321 != 0) {
                            if (var10.field2321 == 1336) {
                                if (field322) {
                                    var13 += 15;
                                    Statics.field2652.method3707("Fps:" + field1775, var10.field2221 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field309) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field309) {
                                        var33 = 16711680;
                                    }
                                    Statics.field2652.method3707("Mem:" + var32 + "k", var10.field2221 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2321 == 1337) {
                                field455 = var12;
                                field474 = var13;
                                int var36 = var10.field2221;
                                int var37 = var10.field2196;
                                field410++;
                                method2874(class16.field178);
                                boolean var38 = false;
                                if (field435 >= 0) {
                                    int var39 = class46.field922;
                                    int[] var40 = class46.field932;
                                    for (int var41 = 0; var41 < var39; var41++) {
                                        if (field435 == var40[var41]) {
                                            var38 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var38) {
                                    method2874(class16.field170);
                                }
                                Statics.method2939(true);
                                method2874(var38 ? class16.field172 : class16.field171);
                                Statics.method2939(false);
                                method812();
                                for (class34 var42 = (class34) field419.method2319(); var42 != null; var42 = (class34) field419.method2333()) {
                                    if (Statics.field1569 != var42.field774 || var42.field769) {
                                        var42.method2310();
                                    } else if (field450 >= var42.field763) {
                                        var42.method774(field499);
                                        if (var42.field769) {
                                            var42.method2310();
                                        } else {
                                            Statics.field970.method1693(var42.field774, var42.field765, var42.field766, var42.field772, 60, var42, 0, -1, false);
                                        }
                                    }
                                }
                                method1406(var12, var13, var36, var37, true);
                                int var43 = field568;
                                int var44 = field569;
                                int var45 = field570;
                                int var46 = field571;
                                class220.method3832(var43, var44, var43 + var45, var44 + var46);
                                class85.method1621();
                                if (!field554) {
                                    int var47 = field542;
                                    if (field398 / 256 > var47) {
                                        var47 = field398 / 256;
                                    }
                                    if (field555[4] && field528[4] + 128 > var47) {
                                        var47 = field528[4] + 128;
                                    }
                                    int var48 = field527 + field340 & 0x7FF;
                                    method173(Statics.field1474, method20(Statics.field792.field638, Statics.field792.field625, Statics.field1569) - field395, Statics.field2699, var47, var48, var47 * 3 + 600);
                                }
                                int var49;
                                if (field554) {
                                    var49 = method668();
                                } else {
                                    var49 = method137();
                                }
                                int var50 = Statics.field1445;
                                int var51 = Statics.field799;
                                int var52 = Statics.field806;
                                int var53 = Statics.field685;
                                int var54 = Statics.field611;
                                for (int var55 = 0; var55 < 5; var55++) {
                                    if (field555[var55]) {
                                        int var56 = (int) (Math.random() * (double) (field328[var55] * 2 + 1) - (double) field328[var55] + Math.sin((double) field312[var55] / 100.0D * (double) field559[var55]) * (double) field528[var55]);
                                        if (var55 == 0) {
                                            Statics.field1445 += var56;
                                        }
                                        if (var55 == 1) {
                                            Statics.field799 += var56;
                                        }
                                        if (var55 == 2) {
                                            Statics.field806 += var56;
                                        }
                                        if (var55 == 3) {
                                            Statics.field611 = Statics.field611 + var56 & 0x7FF;
                                        }
                                        if (var55 == 4) {
                                            Statics.field685 += var56;
                                            if (Statics.field685 < 128) {
                                                Statics.field685 = 128;
                                            }
                                            if (Statics.field685 > 383) {
                                                Statics.field685 = 383;
                                            }
                                        }
                                    }
                                }
                                int var57 = class116.field1793;
                                int var58 = class116.field1800;
                                if (class116.field1805 != 0) {
                                    var57 = class116.field1797;
                                    var58 = class116.field1807;
                                }
                                if (var57 >= var43 && var57 < var43 + var45 && var58 >= var44 && var58 < var44 + var46) {
                                    class83.field1429 = true;
                                    class83.field1423 = 0;
                                    class83.field1430 = var57 - var43;
                                    class83.field1377 = var58 - var44;
                                } else {
                                    class83.field1429 = false;
                                    class83.field1423 = 0;
                                }
                                method92();
                                class220.method3812(var43, var44, var45, var46, 0);
                                method92();
                                int var59 = class85.field1446;
                                class85.field1446 = field572;
                                Statics.field970.method1723(Statics.field1445, Statics.field799, Statics.field806, Statics.field685, Statics.field611, var49);
                                class85.field1446 = var59;
                                method92();
                                Statics.field970.method1696();
                                field399 = 0;
                                boolean var60 = false;
                                int var61 = -1;
                                int var62 = class46.field922;
                                int[] var63 = class46.field932;
                                for (int var64 = 0; var64 < field341 + var62; var64++) {
                                    class28 var65;
                                    if (var64 < var62) {
                                        var65 = field426[var63[var64]];
                                        if (field435 == var63[var64]) {
                                            var60 = true;
                                            var61 = var64;
                                            continue;
                                        }
                                    } else {
                                        var65 = field484[field346[var64 - var62]];
                                    }
                                    method3110(var65, var64, var43, var44, var45, var46);
                                }
                                if (var60) {
                                    method3110(field426[field435], var61, var43, var44, var45, var46);
                                }
                                for (int var66 = 0; var66 < field399; var66++) {
                                    int var67 = field401[var66];
                                    int var68 = field376[var66];
                                    int var69 = field404[var66];
                                    int var70 = field318[var66];
                                    boolean var71 = true;
                                    while (var71) {
                                        var71 = false;
                                        for (int var72 = 0; var72 < var66; var72++) {
                                            if (var68 + 2 > field376[var72] - field318[var72] && var68 - var70 < field376[var72] + 2 && var67 - var69 < field404[var72] + field401[var72] && var67 + var69 > field401[var72] - field404[var72] && field376[var72] - field318[var72] < var68) {
                                                var68 = field376[var72] - field318[var72];
                                                var71 = true;
                                            }
                                        }
                                    }
                                    field411 = field401[var66];
                                    field412 = field376[var66] = var68;
                                    String var73 = field408[var66];
                                    if (field339 == 0) {
                                        int var74 = 16776960;
                                        if (field383[var66] < 6) {
                                            var74 = field545[field383[var66]];
                                        }
                                        if (field383[var66] == 6) {
                                            var74 = field410 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field383[var66] == 7) {
                                            var74 = field410 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field383[var66] == 8) {
                                            var74 = field410 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field383[var66] == 9) {
                                            int var75 = 150 - field553[var66];
                                            if (var75 < 50) {
                                                var74 = var75 * 1280 + 16711680;
                                            } else if (var75 < 100) {
                                                var74 = 16776960 - (var75 - 50) * 327680;
                                            } else if (var75 < 150) {
                                                var74 = (var75 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field383[var66] == 10) {
                                            int var76 = 150 - field553[var66];
                                            if (var76 < 50) {
                                                var74 = var76 * 5 + 16711680;
                                            } else if (var76 < 100) {
                                                var74 = 16711935 - (var76 - 50) * 327680;
                                            } else if (var76 < 150) {
                                                var74 = (var76 - 100) * 327680 + 255 - (var76 - 100) * 5;
                                            }
                                        }
                                        if (field383[var66] == 11) {
                                            int var77 = 150 - field553[var66];
                                            if (var77 < 50) {
                                                var74 = 16777215 - var77 * 327685;
                                            } else if (var77 < 100) {
                                                var74 = (var77 - 50) * 327685 + 65280;
                                            } else if (var77 < 150) {
                                                var74 = 16777215 - (var77 - 100) * 327680;
                                            }
                                        }
                                        if (field406[var66] == 0) {
                                            Statics.field787.method3708(var73, field411 + var43, field412 + var44, var74, 0);
                                        }
                                        if (field406[var66] == 1) {
                                            Statics.field787.method3774(var73, field411 + var43, field412 + var44, var74, 0, field410);
                                        }
                                        if (field406[var66] == 2) {
                                            Statics.field787.method3711(var73, field411 + var43, field412 + var44, var74, 0, field410);
                                        }
                                        if (field406[var66] == 3) {
                                            Statics.field787.method3725(var73, field411 + var43, field412 + var44, var74, 0, field410, 150 - field553[var66]);
                                        }
                                        if (field406[var66] == 4) {
                                            int var78 = (150 - field553[var66]) * (Statics.field787.method3724(var73) + 100) / 150;
                                            class220.method3807(field411 + var43 - 50, var44, field411 + var43 + 50, var44 + var46);
                                            Statics.field787.method3705(var73, field411 + var43 + 50 - var78, field412 + var44, var74, 0);
                                            class220.method3832(var43, var44, var43 + var45, var44 + var46);
                                        }
                                        if (field406[var66] == 5) {
                                            int var79 = 150 - field553[var66];
                                            int var80 = 0;
                                            if (var79 < 25) {
                                                var80 = var79 - 25;
                                            } else if (var79 > 125) {
                                                var80 = var79 - 125;
                                            }
                                            class220.method3807(var43, field412 + var44 - Statics.field787.field3106 - 1, var43 + var45, field412 + var44 + 5);
                                            Statics.field787.method3708(var73, field411 + var43, field412 + var44 + var80, var74, 0);
                                            class220.method3832(var43, var44, var43 + var45, var44 + var46);
                                        }
                                    } else {
                                        Statics.field787.method3708(var73, field411 + var43, field412 + var44, 16776960, 0);
                                    }
                                }
                                if (field552 == 2) {
                                    method3101((field327 - Statics.field60 << 7) + field330, (field521 - Statics.field290 << 7) + field331, field329 * 2);
                                    if (field411 > -1 && field450 % 20 < 10) {
                                        Statics.field2673[0].method3941(field411 + var43 - 12, field412 + var44 - 28);
                                    }
                                }
                                ((class75) Statics.field1466).method1427(field499);
                                if (field416 == 1) {
                                    Statics.field57[field415 / 100].method3941(field413 - 8, field414 - 8);
                                }
                                if (field416 == 2) {
                                    Statics.field57[field415 / 100 + 4].method3941(field413 - 8, field414 - 8);
                                }
                                method613();
                                Statics.field1445 = var50;
                                Statics.field799 = var51;
                                Statics.field806 = var52;
                                Statics.field685 = var53;
                                Statics.field611 = var54;
                                if (field374) {
                                    byte var81 = 0;
                                    int var82 = class186.field2764 + class186.field2753 + var81;
                                    if (var82 == 0) {
                                        field374 = false;
                                    }
                                }
                                if (field374) {
                                    class220.method3812(var43, var44, var45, var46, 0);
                                    method204(class174.field2371, false);
                                }
                                field511[var10.field2337] = true;
                                class220.method3832(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2321 == 1338) {
                                method92();
                                class165 var84 = var10.method3042(false);
                                if (var84 != null) {
                                    class220.method3832(var12, var13, var84.field2157 + var12, var84.field2158 + var13);
                                    if (field565 == 2 || field565 == 5) {
                                        class220.method3861(var12, var13, 0, var84.field2156, var84.field2155);
                                    } else {
                                        int var85 = field527 + field354 & 0x7FF;
                                        int var86 = Statics.field792.field638 / 32 + 48;
                                        int var87 = 464 - Statics.field792.field625 / 32;
                                        Statics.field184.method3990(var12, var13, var84.field2157, var84.field2158, var86, var87, var85, field390 + 256, var84.field2156, var84.field2155);
                                        for (int var88 = 0; var88 < field513; var88++) {
                                            int var89 = field537[var88] * 4 + 2 - Statics.field792.field638 / 32;
                                            int var90 = field538[var88] * 4 + 2 - Statics.field792.field625 / 32;
                                            method1545(var12, var13, var89, var90, field539[var88], var84);
                                        }
                                        int var91 = 0;
                                        while (true) {
                                            if (var91 >= 104) {
                                                for (int var96 = 0; var96 < field341; var96++) {
                                                    class36 var97 = field484[field346[var96]];
                                                    if (var97 != null && var97.method233()) {
                                                        class200 var98 = var97.field789;
                                                        if (var98 != null && var98.field3033 != null) {
                                                            var98 = var98.method3542();
                                                        }
                                                        if (var98 != null && var98.field3024 && var98.field3036) {
                                                            int var99 = var97.field638 / 32 - Statics.field792.field638 / 32;
                                                            int var100 = var97.field625 / 32 - Statics.field792.field625 / 32;
                                                            method1545(var12, var13, var99, var100, Statics.field132[1], var84);
                                                        }
                                                    }
                                                }
                                                int var101 = class46.field922;
                                                int[] var102 = class46.field932;
                                                for (int var103 = 0; var103 < var101; var103++) {
                                                    class24 var104 = field426[var102[var103]];
                                                    if (var104 != null && var104.method233() && !var104.field277 && Statics.field792 != var104) {
                                                        int var105 = var104.field638 / 32 - Statics.field792.field638 / 32;
                                                        int var106 = var104.field625 / 32 - Statics.field792.field625 / 32;
                                                        boolean var107 = false;
                                                        if (method184(var104.field263, true)) {
                                                            var107 = true;
                                                        }
                                                        boolean var108 = false;
                                                        for (int var109 = 0; var109 < Statics.field273; var109++) {
                                                            if (var104.field263.equals(Statics.field1205[var109].field296)) {
                                                                var108 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var110 = false;
                                                        if (Statics.field792.field276 != 0 && var104.field276 != 0 && Statics.field792.field276 == var104.field276) {
                                                            var110 = true;
                                                        }
                                                        if (var107) {
                                                            method1545(var12, var13, var105, var106, Statics.field132[3], var84);
                                                        } else if (var110) {
                                                            method1545(var12, var13, var105, var106, Statics.field132[4], var84);
                                                        } else if (var108) {
                                                            method1545(var12, var13, var105, var106, Statics.field132[5], var84);
                                                        } else {
                                                            method1545(var12, var13, var105, var106, Statics.field132[2], var84);
                                                        }
                                                    }
                                                }
                                                if (field552 != 0 && field450 % 20 < 10) {
                                                    if (field552 == 1 && field325 >= 0 && field325 < field484.length) {
                                                        class36 var111 = field484[field325];
                                                        if (var111 != null) {
                                                            int var112 = var111.field638 / 32 - Statics.field792.field638 / 32;
                                                            int var113 = var111.field625 / 32 - Statics.field792.field625 / 32;
                                                            method1960(var12, var13, var112, var113, Statics.field710[1], var84);
                                                        }
                                                    }
                                                    if (field552 == 2) {
                                                        int var114 = field327 * 4 - Statics.field60 * 4 + 2 - Statics.field792.field638 / 32;
                                                        int var115 = field521 * 4 - Statics.field290 * 4 + 2 - Statics.field792.field625 / 32;
                                                        method1960(var12, var13, var114, var115, Statics.field710[1], var84);
                                                    }
                                                    if (field552 == 10 && field326 >= 0 && field326 < field426.length) {
                                                        class24 var116 = field426[field326];
                                                        if (var116 != null) {
                                                            int var117 = var116.field638 / 32 - Statics.field792.field638 / 32;
                                                            int var118 = var116.field625 / 32 - Statics.field792.field625 / 32;
                                                            method1960(var12, var13, var117, var118, Statics.field710[1], var84);
                                                        }
                                                    }
                                                }
                                                if (field540 != 0) {
                                                    int var119 = field540 * 4 + 2 - Statics.field792.field638 / 32;
                                                    int var120 = field541 * 4 + 2 - Statics.field792.field625 / 32;
                                                    method1545(var12, var13, var119, var120, Statics.field710[0], var84);
                                                }
                                                if (!Statics.field792.field277) {
                                                    class220.method3812(var84.field2157 / 2 + var12 - 1, var84.field2158 / 2 + var13 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var92 = 0; var92 < 104; var92++) {
                                                class129 var93 = field449[Statics.field1569][var91][var92];
                                                if (var93 != null) {
                                                    int var94 = var91 * 4 + 2 - Statics.field792.field638 / 32;
                                                    int var95 = var92 * 4 + 2 - Statics.field792.field625 / 32;
                                                    method1545(var12, var13, var94, var95, Statics.field132[0], var84);
                                                }
                                            }
                                            var91++;
                                        }
                                    }
                                    field427[var11] = true;
                                }
                                class220.method3832(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2321 == 1339) {
                                class165 var121 = var10.method3042(false);
                                if (var121 != null) {
                                    if (field565 < 3) {
                                        Statics.field2796.method3990(var12, var13, var121.field2157, var121.field2158, 25, 25, field527, 256, var121.field2156, var121.field2155);
                                    } else {
                                        class220.method3861(var12, var13, 0, var121.field2156, var121.field2155);
                                    }
                                }
                                class220.method3832(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2208 == 0) {
                            if (!var10.field2205 && method1618(var10) && Statics.field1788 != var10) {
                                continue;
                            }
                            if (!var10.field2205) {
                                if (var10.field2252 > var10.field2248 - var10.field2196) {
                                    var10.field2252 = var10.field2248 - var10.field2196;
                                }
                                if (var10.field2252 < 0) {
                                    var10.field2252 = 0;
                                }
                            }
                            method3197(arg0, var10.field2206, var19, var20, var21, var22, var12 - var10.field2227, var13 - var10.field2252, var11);
                            if (var10.field2330 != null) {
                                method3197(var10.field2330, var10.field2206, var19, var20, var21, var22, var12 - var10.field2227, var13 - var10.field2252, var11);
                            }
                            class18 var122 = (class18) field467.method2260((long) var10.field2206);
                            if (var122 != null) {
                                method205(var122.field192, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class220.method3832(arg2, arg3, arg4, arg5);
                            class85.method1621();
                        }
                        if (field520 || field488[var11] || field518 > 1) {
                            if (var10.field2208 == 0 && !var10.field2205 && var10.field2248 > var10.field2196) {
                                int var123 = var10.field2221 + var12;
                                int var124 = var10.field2252;
                                int var125 = var10.field2196;
                                int var126 = var10.field2248;
                                Statics.field285[0].method3904(var123, var13);
                                Statics.field285[1].method3904(var123, var13 + var125 - 16);
                                class220.method3812(var123, var13 + 16, 16, var125 - 32, field336);
                                int var127 = (var125 - 32) * var125 / var126;
                                if (var127 < 8) {
                                    var127 = 8;
                                }
                                int var128 = (var125 - 32 - var127) * var124 / (var126 - var125);
                                class220.method3812(var123, var13 + 16 + var128, 16, var127, field384);
                                class220.method3822(var123, var13 + 16 + var128, var127, field405);
                                class220.method3822(var123 + 1, var13 + 16 + var128, var127, field405);
                                class220.method3820(var123, var13 + 16 + var128, 16, field405);
                                class220.method3820(var123, var13 + 17 + var128, 16, field405);
                                class220.method3822(var123 + 15, var13 + 16 + var128, var127, field377);
                                class220.method3822(var123 + 14, var13 + 17 + var128, var127 - 1, field377);
                                class220.method3820(var123, var13 + 15 + var128 + var127, 16, field377);
                                class220.method3820(var123 + 1, var13 + 14 + var128 + var127, 15, field377);
                            }
                            if (var10.field2208 != 1) {
                                if (var10.field2208 == 2) {
                                    int var129 = 0;
                                    for (int var130 = 0; var130 < var10.field2298; var130++) {
                                        for (int var131 = 0; var131 < var10.field2211; var131++) {
                                            int var132 = (var10.field2340 + 32) * var131 + var12;
                                            int var133 = (var10.field2273 + 32) * var130 + var13;
                                            if (var129 < 20) {
                                                var132 += var10.field2274[var129];
                                                var133 += var10.field2259[var129];
                                            }
                                            if (var10.field2324[var129] > 0) {
                                                boolean var134 = false;
                                                boolean var135 = false;
                                                int var136 = var10.field2324[var129] - 1;
                                                if (var132 + 32 > arg2 && var132 < arg4 && var133 + 32 > arg3 && var133 < arg5 || Statics.field8 == var10 && field403 == var129) {
                                                    class225 var137;
                                                    if (field459 == 1 && Statics.field771 == var129 && Statics.field1646 == var10.field2206) {
                                                        var137 = class199.method3111(var136, var10.field2325[var129], 2, 0, 2, false);
                                                    } else {
                                                        var137 = class199.method3111(var136, var10.field2325[var129], 1, 3153952, 2, false);
                                                    }
                                                    if (var137 == null) {
                                                        method3099(var10);
                                                    } else if (Statics.field8 == var10 && field403 == var129) {
                                                        int var138 = class116.field1793 - field360;
                                                        int var139 = class116.field1800 - field400;
                                                        if (var138 < 5 && var138 > -5) {
                                                            var138 = 0;
                                                        }
                                                        if (var139 < 5 && var139 > -5) {
                                                            var139 = 0;
                                                        }
                                                        if (field424 < 5) {
                                                            var138 = 0;
                                                            var139 = 0;
                                                        }
                                                        var137.method4009(var132 + var138, var133 + var139, 128);
                                                        if (arg1 != -1) {
                                                            class170 var140 = arg0[arg1 & 0xFFFF];
                                                            if (var133 + var139 < class220.field3192 && var140.field2252 > 0) {
                                                                int var141 = field499 * (class220.field3192 - var133 - var139) / 3;
                                                                if (var141 > field499 * 10) {
                                                                    var141 = field499 * 10;
                                                                }
                                                                if (var141 > var140.field2252) {
                                                                    var141 = var140.field2252;
                                                                }
                                                                var140.field2252 -= var141;
                                                                field400 += var141;
                                                                method3099(var140);
                                                            }
                                                            if (var133 + var139 + 32 > class220.field3193 && var140.field2252 < var140.field2248 - var140.field2196) {
                                                                int var142 = field499 * (var133 + var139 + 32 - class220.field3193) / 3;
                                                                if (var142 > field499 * 10) {
                                                                    var142 = field499 * 10;
                                                                }
                                                                if (var142 > var140.field2248 - var140.field2196 - var140.field2252) {
                                                                    var142 = var140.field2248 - var140.field2196 - var140.field2252;
                                                                }
                                                                var140.field2252 += var142;
                                                                field400 -= var142;
                                                                method3099(var140);
                                                            }
                                                        }
                                                    } else if (Statics.field844 == var10 && field445 == var129) {
                                                        var137.method4009(var132, var133, 128);
                                                    } else {
                                                        var137.method3941(var132, var133);
                                                    }
                                                }
                                            } else if (var10.field2276 != null && var129 < 20) {
                                                class225 var143 = var10.method3068(var129);
                                                if (var143 != null) {
                                                    var143.method3941(var132, var133);
                                                } else if (class170.field2262) {
                                                    method3099(var10);
                                                }
                                            }
                                            var129++;
                                        }
                                    }
                                } else if (var10.field2208 == 3) {
                                    int var144;
                                    if (method3107(var10)) {
                                        var144 = var10.field2314;
                                        if (Statics.field1788 == var10 && var10.field2322 != 0) {
                                            var144 = var10.field2322;
                                        }
                                    } else {
                                        var144 = var10.field2232;
                                        if (Statics.field1788 == var10 && var10.field2250 != 0) {
                                            var144 = var10.field2250;
                                        }
                                    }
                                    if (var10.field2235) {
                                        switch(var10.field2236.field3202) {
                                            case 1:
                                                class220.method3813(var12, var13, var10.field2221, var10.field2196, var10.field2232, var10.field2314, 256 - (var10.field2286 & 0xFF), 256 - (var10.field2238 & 0xFF));
                                                break;
                                            case 2:
                                                class220.method3814(var12, var13, var10.field2221, var10.field2196, var10.field2232, var10.field2314, 256 - (var10.field2286 & 0xFF), 256 - (var10.field2238 & 0xFF));
                                                break;
                                            case 3:
                                                class220.method3805(var12, var13, var10.field2221, var10.field2196, var10.field2232, var10.field2314, 256 - (var10.field2286 & 0xFF), 256 - (var10.field2238 & 0xFF));
                                                break;
                                            case 4:
                                                class220.method3842(var12, var13, var10.field2221, var10.field2196, var10.field2232, var10.field2314, 256 - (var10.field2286 & 0xFF), 256 - (var10.field2238 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class220.method3812(var12, var13, var10.field2221, var10.field2196, var144);
                                                } else {
                                                    class220.method3806(var12, var13, var10.field2221, var10.field2196, var144, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class220.method3818(var12, var13, var10.field2221, var10.field2196, var144);
                                    } else {
                                        class220.method3819(var12, var13, var10.field2221, var10.field2196, var144, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2208 == 4) {
                                    class209 var145 = var10.method3073();
                                    if (var145 != null) {
                                        String var146 = var10.field2266;
                                        int var147;
                                        if (method3107(var10)) {
                                            var147 = var10.field2314;
                                            if (Statics.field1788 == var10 && var10.field2322 != 0) {
                                                var147 = var10.field2322;
                                            }
                                            if (var10.field2222.length() > 0) {
                                                var146 = var10.field2222;
                                            }
                                        } else {
                                            var147 = var10.field2232;
                                            if (Statics.field1788 == var10 && var10.field2250 != 0) {
                                                var147 = var10.field2250;
                                            }
                                        }
                                        if (var10.field2205 && var10.field2326 != -1) {
                                            class199 var148 = class199.method1947(var10.field2326);
                                            var146 = var148.field2959;
                                            if (var146 == null) {
                                                var146 = "null";
                                            }
                                            if ((var148.field2995 == 1 || var10.field2327 != 1) && var10.field2327 != -1) {
                                                var146 = class38.method200(16748608) + var146 + class38.field812 + " " + 'x' + method3230(var10.field2327);
                                            }
                                        }
                                        if (field470 == var10) {
                                            class174 var10000 = (class174) null;
                                            var146 = class174.field2549;
                                            var147 = var10.field2232;
                                        }
                                        if (!var10.field2205) {
                                            var146 = method2633(var146, var10);
                                        }
                                        var145.method3709(var146, var12, var13, var10.field2221, var10.field2196, var147, var10.field2271 ? 0 : -1, var10.field2269, var10.field2270, var10.field2268);
                                    } else if (class170.field2262) {
                                        method3099(var10);
                                    }
                                } else if (var10.field2208 == 5) {
                                    if (var10.field2205) {
                                        class225 var150;
                                        if (var10.field2326 == -1) {
                                            var150 = var10.method3038(false);
                                        } else {
                                            var150 = class199.method3111(var10.field2326, var10.field2327, var10.field2245, var10.field2246, var10.field2264, false);
                                        }
                                        if (var150 != null) {
                                            int var151 = var150.field3230;
                                            int var152 = var150.field3226;
                                            if (var10.field2244) {
                                                class220.method3807(var12, var13, var10.field2221 + var12, var10.field2196 + var13);
                                                int var153 = (var10.field2221 + (var151 - 1)) / var151;
                                                int var154 = (var10.field2196 + (var152 - 1)) / var152;
                                                for (int var155 = 0; var155 < var153; var155++) {
                                                    for (int var156 = 0; var156 < var154; var156++) {
                                                        if (var10.field2243 != 0) {
                                                            var150.method3952(var151 / 2 + var151 * var155 + var12, var152 / 2 + var152 * var156 + var13, var10.field2243, 4096);
                                                        } else if (var14 == 0) {
                                                            var150.method3941(var151 * var155 + var12, var152 * var156 + var13);
                                                        } else {
                                                            var150.method4009(var151 * var155 + var12, var152 * var156 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class220.method3832(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var157 = var10.field2221 * 4096 / var151;
                                                if (var10.field2243 != 0) {
                                                    var150.method3952(var10.field2221 / 2 + var12, var10.field2196 / 2 + var13, var10.field2243, var157);
                                                } else if (var14 != 0) {
                                                    var150.method3957(var12, var13, var10.field2221, var10.field2196, 256 - (var14 & 0xFF));
                                                } else if (var10.field2221 == var151 && var10.field2196 == var152) {
                                                    var150.method3941(var12, var13);
                                                } else {
                                                    var150.method3943(var12, var13, var10.field2221, var10.field2196);
                                                }
                                            }
                                        } else if (class170.field2262) {
                                            method3099(var10);
                                        }
                                    } else {
                                        class225 var149 = var10.method3038(method3107(var10));
                                        if (var149 != null) {
                                            var149.method3941(var12, var13);
                                        } else if (class170.field2262) {
                                            method3099(var10);
                                        }
                                    }
                                } else if (var10.field2208 == 6) {
                                    boolean var158 = method3107(var10);
                                    int var159;
                                    if (var158) {
                                        var159 = var10.field2254;
                                    } else {
                                        var159 = var10.field2231;
                                    }
                                    class83 var160 = null;
                                    int var161 = 0;
                                    if (var10.field2326 != -1) {
                                        class199 var162 = class199.method1947(var10.field2326);
                                        if (var162 != null) {
                                            class199 var163 = var162.method3479(var10.field2327);
                                            var160 = var163.method3476(1);
                                            if (var160 == null) {
                                                method3099(var10);
                                            } else {
                                                var160.method1582();
                                                var161 = var160.field1558 / 2;
                                            }
                                        }
                                    } else if (var10.field2249 == 5) {
                                        if (var10.field2247 == 0) {
                                            var160 = field433.method3012((class202) null, -1, (class202) null, -1);
                                        } else {
                                            var160 = Statics.field792.method229();
                                        }
                                    } else if (var159 == -1) {
                                        var160 = var10.method3041((class202) null, -1, var158, Statics.field792.field284);
                                        if (var160 == null && class170.field2262) {
                                            method3099(var10);
                                        }
                                    } else {
                                        class202 var164 = class202.method3379(var159);
                                        var160 = var10.method3041(var164, var10.field2328, var158, Statics.field792.field284);
                                        if (var160 == null && class170.field2262) {
                                            method3099(var10);
                                        }
                                    }
                                    class85.method1647(var10.field2221 / 2 + var12, var10.field2196 / 2 + var13);
                                    int var165 = var10.field2260 * class85.field1469[var10.field2257] >> 16;
                                    int var166 = var10.field2260 * class85.field1463[var10.field2257] >> 16;
                                    if (var160 != null) {
                                        if (var10.field2205) {
                                            var160.method1582();
                                            if (var10.field2263) {
                                                var160.method1565(0, var10.field2258, var10.field2214, var10.field2257, var10.field2255, var10.field2256 + var161 + var165, var10.field2256 + var166, var10.field2260);
                                            } else {
                                                var160.method1564(0, var10.field2258, var10.field2214, var10.field2257, var10.field2255, var10.field2256 + var161 + var165, var10.field2256 + var166);
                                            }
                                        } else {
                                            var160.method1564(0, var10.field2258, 0, var10.field2257, 0, var165, var166);
                                        }
                                    }
                                    class85.method1623();
                                } else {
                                    if (var10.field2208 == 7) {
                                        class209 var167 = var10.method3073();
                                        if (var167 == null) {
                                            if (class170.field2262) {
                                                method3099(var10);
                                            }
                                            continue;
                                        }
                                        int var168 = 0;
                                        for (int var169 = 0; var169 < var10.field2298; var169++) {
                                            for (int var170 = 0; var170 < var10.field2211; var170++) {
                                                if (var10.field2324[var168] > 0) {
                                                    class199 var171 = class199.method1947(var10.field2324[var168] - 1);
                                                    String var172;
                                                    if (var171.field2995 != 1 && var10.field2325[var168] == 1) {
                                                        var172 = class38.method200(16748608) + var171.field2959 + class38.field812;
                                                    } else {
                                                        var172 = class38.method200(16748608) + var171.field2959 + class38.field812 + " " + 'x' + method3230(var10.field2325[var168]);
                                                    }
                                                    int var173 = (var10.field2340 + 115) * var170 + var12;
                                                    int var174 = (var10.field2273 + 12) * var169 + var13;
                                                    if (var10.field2269 == 0) {
                                                        var167.method3705(var172, var173, var174, var10.field2232, var10.field2271 ? 0 : -1);
                                                    } else if (var10.field2269 == 1) {
                                                        var167.method3708(var172, var10.field2221 / 2 + var173, var174, var10.field2232, var10.field2271 ? 0 : -1);
                                                    } else {
                                                        var167.method3707(var172, var10.field2221 + var173 - 1, var174, var10.field2232, var10.field2271 ? 0 : -1);
                                                    }
                                                }
                                                var168++;
                                            }
                                        }
                                    }
                                    if (var10.field2208 == 8 && Statics.field2345 == var10 && field585 == field300) {
                                        int var175 = 0;
                                        int var176 = 0;
                                        class209 var177 = Statics.field2652;
                                        String var178 = var10.field2266;
                                        String var179 = method2633(var178, var10);
                                        while (var179.length() > 0) {
                                            int var180 = var179.indexOf(class38.field811);
                                            String var181;
                                            if (var180 == -1) {
                                                var181 = var179;
                                                var179 = "";
                                            } else {
                                                var181 = var179.substring(0, var180);
                                                var179 = var179.substring(var180 + 4);
                                            }
                                            int var182 = var177.method3724(var181);
                                            if (var182 > var175) {
                                                var175 = var182;
                                            }
                                            var176 += var177.field3106 + 1;
                                        }
                                        var175 += 6;
                                        var176 += 7;
                                        int var183 = var10.field2221 + var12 - 5 - var175;
                                        int var184 = var10.field2196 + var13 + 5;
                                        if (var183 < var12 + 5) {
                                            var183 = var12 + 5;
                                        }
                                        if (var175 + var183 > arg4) {
                                            var183 = arg4 - var175;
                                        }
                                        if (var176 + var184 > arg5) {
                                            var184 = arg5 - var176;
                                        }
                                        class220.method3812(var183, var184, var175, var176, 16777120);
                                        class220.method3818(var183, var184, var175, var176, 0);
                                        String var185 = var10.field2266;
                                        int var186 = var177.field3106 + var184 + 2;
                                        String var187 = method2633(var185, var10);
                                        while (var187.length() > 0) {
                                            int var188 = var187.indexOf(class38.field811);
                                            String var189;
                                            if (var188 == -1) {
                                                var189 = var187;
                                                var187 = "";
                                            } else {
                                                var189 = var187.substring(0, var188);
                                                var187 = var187.substring(var188 + 4);
                                            }
                                            var177.method3705(var189, var183 + 3, var186, 0, -1);
                                            var186 += var177.field3106 + 1;
                                        }
                                    }
                                    if (var10.field2208 == 9) {
                                        if (var10.field2290 == 1) {
                                            int var190;
                                            int var191;
                                            int var192;
                                            int var193;
                                            if (var10.field2240) {
                                                var190 = var12;
                                                var191 = var10.field2196 + var13;
                                                var192 = var10.field2221 + var12;
                                                var193 = var13;
                                            } else {
                                                var190 = var12;
                                                var191 = var13;
                                                var192 = var10.field2221 + var12;
                                                var193 = var10.field2196 + var13;
                                            }
                                            class220.method3824(var190, var191, var192, var193, var10.field2232);
                                        } else {
                                            int var194 = var10.field2221 >= 0 ? var10.field2221 : -var10.field2221;
                                            int var195 = var10.field2196 >= 0 ? var10.field2196 : -var10.field2196;
                                            int var196 = var194;
                                            if (var194 < var195) {
                                                var196 = var195;
                                            }
                                            if (var196 != 0) {
                                                int var197 = (var10.field2221 << 16) / var196;
                                                int var198 = (var10.field2196 << 16) / var196;
                                                if (var198 <= var197) {
                                                    var197 = -var197;
                                                } else {
                                                    var198 = -var198;
                                                }
                                                int var199 = var10.field2290 * var198 >> 17;
                                                int var200 = var10.field2290 * var198 + 1 >> 17;
                                                int var201 = var10.field2290 * var197 >> 17;
                                                int var202 = var10.field2290 * var197 + 1 >> 17;
                                                int var203 = var12 + var199;
                                                int var204 = var12 - var200;
                                                int var205 = var10.field2221 + var12 - var200;
                                                int var206 = var10.field2221 + var12 + var199;
                                                int var207 = var13 + var201;
                                                int var208 = var13 - var202;
                                                int var209 = var10.field2196 + var13 - var202;
                                                int var210 = var10.field2196 + var13 + var201;
                                                class85.method1629(var203, var204, var205);
                                                class85.method1632(var207, var208, var209, var203, var204, var205, var10.field2232);
                                                class85.method1629(var203, var205, var206);
                                                class85.method1632(var207, var209, var210, var203, var205, var206, var10.field2232);
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

    @ObfuscatedName("ez.cm(Ljava/lang/String;Lfu;I)Ljava/lang/String;")
    public static String method2633(String arg0, class170 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method865(method2919(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field935 != null) {
                    var5 = class208.method2389(Statics.field935.field1668);
                    if (Statics.field935.field1673 != null) {
                        var5 = (String) Statics.field935.field1673;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("gl.ci(IS)Ljava/lang/String;")
    public static final String method3230(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class38.field813 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class38.method200(65408) + var1.substring(0, var1.length() - 8) + class174.field2520 + " " + class38.field815 + var1 + class38.field809 + class38.field812;
        } else if (var1.length() > 6) {
            return " " + class38.method200(16777215) + var1.substring(0, var1.length() - 4) + class174.field2441 + " " + class38.field815 + var1 + class38.field809 + class38.field812;
        } else {
            return " " + class38.method200(16776960) + var1 + class38.field812;
        }
    }

    @ObfuscatedName("ao.cr(ZB)V")
    public static final void method792(boolean arg0) {
        method247(field523, Statics.field759, Statics.field951, arg0);
    }

    @ObfuscatedName("dm.ck(Lfu;I)V")
    public static void method2010(class170 arg0) {
        class170 var1 = arg0.field2225 == -1 ? null : class170.method3109(arg0.field2225);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field759;
            var3 = Statics.field951;
        } else {
            var2 = var1.field2221;
            var3 = var1.field2196;
        }
        method2509(arg0, var2, var3, false);
        method3467(arg0, var2, var3);
    }

    @ObfuscatedName("er.cd([Lfu;Lfu;ZI)V")
    public static void method2867(class170[] arg0, class170 arg1, boolean arg2) {
        int var3 = arg1.field2229 == 0 ? arg1.field2221 : arg1.field2229;
        int var4 = arg1.field2248 == 0 ? arg1.field2196 : arg1.field2248;
        method1905(arg0, arg1.field2206, var3, var4, arg2);
        if (arg1.field2330 != null) {
            method1905(arg1.field2330, arg1.field2206, var3, var4, arg2);
        }
        class18 var5 = (class18) field467.method2260((long) arg1.field2206);
        if (var5 != null) {
            method247(var5.field192, var3, var4, arg2);
        }
        if (arg1.field2321 == 1337) {
        }
    }

    @ObfuscatedName("x.cv(IIIZB)V")
    public static final void method247(int arg0, int arg1, int arg2, boolean arg3) {
        if (class170.method693(arg0)) {
            method1905(Statics.field2197[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("co.co([Lfu;IIIZI)V")
    public static void method1905(class170[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class170 var6 = arg0[var5];
            if (var6 != null && var6.field2225 == arg1) {
                method2509(var6, arg2, arg3, arg4);
                method3467(var6, arg2, arg3);
                if (var6.field2227 > var6.field2229 - var6.field2221) {
                    var6.field2227 = var6.field2229 - var6.field2221;
                }
                if (var6.field2227 < 0) {
                    var6.field2227 = 0;
                }
                if (var6.field2252 > var6.field2248 - var6.field2196) {
                    var6.field2252 = var6.field2248 - var6.field2196;
                }
                if (var6.field2252 < 0) {
                    var6.field2252 = 0;
                }
                if (var6.field2208 == 0) {
                    method2867(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("en.cl(Lfu;IIZB)V")
    public static void method2509(class170 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2221;
        int var5 = arg0.field2196;
        if (arg0.field2216 == 0) {
            arg0.field2221 = arg0.field2211;
        } else if (arg0.field2216 == 1) {
            arg0.field2221 = arg1 - arg0.field2211;
        } else if (arg0.field2216 == 2) {
            arg0.field2221 = arg0.field2211 * arg1 >> 14;
        }
        if (arg0.field2313 == 0) {
            arg0.field2196 = arg0.field2298;
        } else if (arg0.field2313 == 1) {
            arg0.field2196 = arg2 - arg0.field2298;
        } else if (arg0.field2313 == 2) {
            arg0.field2196 = arg0.field2298 * arg2 >> 14;
        }
        if (arg0.field2216 == 4) {
            arg0.field2221 = arg0.field2223 * arg0.field2196 / arg0.field2224;
        }
        if (arg0.field2313 == 4) {
            arg0.field2196 = arg0.field2224 * arg0.field2221 / arg0.field2223;
        }
        if (field506 && arg0.field2208 == 0) {
            if (arg0.field2196 < 5 && arg0.field2221 < 5) {
                arg0.field2196 = 5;
                arg0.field2221 = 5;
            } else {
                if (arg0.field2196 <= 0) {
                    arg0.field2196 = 5;
                }
                if (arg0.field2221 <= 0) {
                    arg0.field2221 = 5;
                }
            }
        }
        if (arg0.field2321 == 1337) {
            field478 = arg0;
        }
        if (arg3 && arg0.field2212 != null && (arg0.field2221 != var4 || arg0.field2196 != var5)) {
            class19 var6 = new class19();
            var6.field199 = arg0;
            var6.field210 = arg0.field2212;
            field436.method2314(var6);
        }
    }

    @ObfuscatedName("gx.ce(Lfu;III)V")
    public static void method3467(class170 arg0, int arg1, int arg2) {
        if (arg0.field2292 == 0) {
            arg0.field2219 = arg0.field2215;
        } else if (arg0.field2292 == 1) {
            arg0.field2219 = (arg1 - arg0.field2221) / 2 + arg0.field2215;
        } else if (arg0.field2292 == 2) {
            arg0.field2219 = arg1 - arg0.field2221 - arg0.field2215;
        } else if (arg0.field2292 == 3) {
            arg0.field2219 = arg0.field2215 * arg1 >> 14;
        } else if (arg0.field2292 == 4) {
            arg0.field2219 = (arg0.field2215 * arg1 >> 14) + (arg1 - arg0.field2221) / 2;
        } else {
            arg0.field2219 = arg1 - arg0.field2221 - (arg0.field2215 * arg1 >> 14);
        }
        if (arg0.field2218 == 0) {
            arg0.field2220 = arg0.field2194;
        } else if (arg0.field2218 == 1) {
            arg0.field2220 = (arg2 - arg0.field2196) / 2 + arg0.field2194;
        } else if (arg0.field2218 == 2) {
            arg0.field2220 = arg2 - arg0.field2196 - arg0.field2194;
        } else if (arg0.field2218 == 3) {
            arg0.field2220 = arg0.field2194 * arg2 >> 14;
        } else if (arg0.field2218 == 4) {
            arg0.field2220 = (arg0.field2194 * arg2 >> 14) + (arg2 - arg0.field2196) / 2;
        } else {
            arg0.field2220 = arg2 - arg0.field2196 - (arg0.field2194 * arg2 >> 14);
        }
        if (!field506 || arg0.field2208 != 0) {
            return;
        }
        if (arg0.field2219 < 0) {
            arg0.field2219 = 0;
        } else if (arg0.field2221 + arg0.field2219 > arg1) {
            arg0.field2219 = arg1 - arg0.field2221;
        }
        if (arg0.field2220 < 0) {
            arg0.field2220 = 0;
        } else if (arg0.field2220 + arg0.field2196 > arg2) {
            arg0.field2220 = arg2 - arg0.field2196;
        }
    }

    @ObfuscatedName("ds.ca(Lfu;IIIIIII)V")
    public static final void method2168(class170 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field387) {
            field479 = 32;
        } else {
            field479 = 0;
        }
        field387 = false;
        if (class116.field1795 == 1 || !Statics.field174 && class116.field1795 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2252 -= 4;
                method3099(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2252 += 4;
                method3099(arg0);
            } else if (arg5 >= arg1 - field479 && arg5 < field479 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2252 = (arg4 - arg3) * var8 / var9;
                method3099(arg0);
                field387 = true;
            }
        }
        if (field504 == 0) {
            return;
        }
        int var10 = arg0.field2221;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2252 += field504 * 45;
            method3099(arg0);
        }
    }

    @ObfuscatedName("al.cc(IB)Ljava/lang/String;")
    public static final String method865(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("fz.dp(Lfu;I)Z")
    public static final boolean method3107(class170 arg0) {
        if (arg0.field2319 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2319.length; var1++) {
            int var2 = method2919(arg0, var1);
            int var3 = arg0.field2320[var1];
            if (arg0.field2319[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2319[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2319[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ff.dh(Lfu;II)I")
    public static final int method2919(class170 arg0, int arg1) {
        if (arg0.field2318 == null || arg1 >= arg0.field2318.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2318[arg1];
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
                    var7 = field385[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field367[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field442[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class170 var11 = class170.method3109(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class199.method1947(var12).field2985 || field308)) {
                        for (int var13 = 0; var13 < var11.field2324.length; var13++) {
                            if (var12 + 1 == var11.field2324[var13]) {
                                var7 += var11.field2325[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class166.field2163[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class173.field2353[field367[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class166.field2163[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field792.field282;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class173.field2355[var14]) {
                            var7 += field367[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class170 var17 = class170.method3109(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class199.method1947(var18).field2985 || field308)) {
                        for (int var19 = 0; var19 < var17.field2324.length; var19++) {
                            if (var18 + 1 == var17.field2324[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field471;
                }
                if (var6 == 12) {
                    var7 = field472;
                }
                if (var6 == 13) {
                    int var20 = class166.field2163[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class166.method2011(var22);
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
                    var7 = (Statics.field792.field638 >> 7) + Statics.field60;
                }
                if (var6 == 19) {
                    var7 = (Statics.field792.field625 >> 7) + Statics.field290;
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

    @ObfuscatedName("ah.du(Lfu;III)V")
    public static final void method806(class170 arg0, int arg1, int arg2) {
        if (arg0.field2213 == 1) {
            method2152(arg0.field2323, "", 24, 0, 0, arg0.field2206);
        }
        if (arg0.field2213 == 2 && !field512) {
            String var3 = method178(arg0);
            if (var3 != null) {
                method2152(var3, class38.method200(65280) + arg0.field2309, 25, 0, -1, arg0.field2206);
            }
        }
        if (arg0.field2213 == 3) {
            method2152(class174.field2518, "", 26, 0, 0, arg0.field2206);
        }
        if (arg0.field2213 == 4) {
            method2152(arg0.field2323, "", 28, 0, 0, arg0.field2206);
        }
        if (arg0.field2213 == 5) {
            method2152(arg0.field2323, "", 29, 0, 0, arg0.field2206);
        }
        if (arg0.field2213 == 6 && field470 == null) {
            method2152(arg0.field2323, "", 30, 0, -1, arg0.field2206);
        }
        if (arg0.field2208 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2196; var5++) {
                for (int var6 = 0; var6 < arg0.field2221; var6++) {
                    int var7 = (arg0.field2340 + 32) * var6;
                    int var8 = (arg0.field2273 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2274[var4];
                        var8 += arg0.field2259[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field502 = var4;
                        Statics.field1759 = arg0;
                        if (arg0.field2324[var4] > 0) {
                            label298: {
                                class199 var9 = class199.method1947(arg0.field2324[var4] - 1);
                                if (field459 == 1) {
                                    int var10 = method3421(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field1646 != arg0.field2206 || Statics.field771 != var4) {
                                            method2152(class174.field2509, field460 + " " + class38.field810 + " " + class38.method200(16748608) + var9.field2959, 31, var9.field2957, var4, arg0.field2206);
                                        }
                                        break label298;
                                    }
                                }
                                if (field512) {
                                    int var12 = method3421(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field740 & 0x10) == 16) {
                                            method2152(field464, field381 + " " + class38.field810 + " " + class38.method200(16748608) + var9.field2959, 32, var9.field2957, var4, arg0.field2206);
                                        }
                                        break label298;
                                    }
                                }
                                String[] var14 = var9.field2974;
                                if (field477) {
                                    var14 = method2204(var14);
                                }
                                int var15 = var9.method3482();
                                int var16 = method3421(arg0);
                                boolean var17 = (var16 >> 30 & 0x1) != 0;
                                if (var17) {
                                    for (int var18 = 4; var18 >= 3; var18--) {
                                        boolean var19 = var15 == var18;
                                        if (var14 != null && var14[var18] != null) {
                                            byte var20;
                                            if (var18 == 3) {
                                                var20 = 36;
                                            } else {
                                                var20 = 37;
                                            }
                                            method1530(var14[var18], class38.method200(16748608) + var9.field2959, var20, var9.field2957, var4, arg0.field2206, var19);
                                        } else if (var18 == 4) {
                                            method1530(class174.field2635, class38.method200(16748608) + var9.field2959, 37, var9.field2957, var4, arg0.field2206, var19);
                                        }
                                    }
                                }
                                class171 var10000 = (class171) null;
                                if (class171.method167(method3421(arg0))) {
                                    method2152(class174.field2509, class38.method200(16748608) + var9.field2959, 38, var9.field2957, var4, arg0.field2206);
                                }
                                int var21 = method3421(arg0);
                                boolean var22 = (var21 >> 30 & 0x1) != 0;
                                if (var22 && var14 != null) {
                                    for (int var23 = 2; var23 >= 0; var23--) {
                                        boolean var24 = var15 == var23;
                                        if (var14[var23] != null) {
                                            byte var25 = 0;
                                            if (var23 == 0) {
                                                var25 = 33;
                                            }
                                            if (var23 == 1) {
                                                var25 = 34;
                                            }
                                            if (var23 == 2) {
                                                var25 = 35;
                                            }
                                            method1530(var14[var23], class38.method200(16748608) + var9.field2959, var25, var9.field2957, var4, arg0.field2206, var24);
                                        }
                                    }
                                }
                                String[] var26 = arg0.field2277;
                                if (field477) {
                                    var26 = method2204(var26);
                                }
                                if (var26 != null) {
                                    for (int var27 = 4; var27 >= 0; var27--) {
                                        if (var26[var27] != null) {
                                            byte var28 = 0;
                                            if (var27 == 0) {
                                                var28 = 39;
                                            }
                                            if (var27 == 1) {
                                                var28 = 40;
                                            }
                                            if (var27 == 2) {
                                                var28 = 41;
                                            }
                                            if (var27 == 3) {
                                                var28 = 42;
                                            }
                                            if (var27 == 4) {
                                                var28 = 43;
                                            }
                                            method2152(var26[var27], class38.method200(16748608) + var9.field2959, var28, var9.field2957, var4, arg0.field2206);
                                        }
                                    }
                                }
                                method2152(class174.field2579, class38.method200(16748608) + var9.field2959, 1005, var9.field2957, var4, arg0.field2206);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2205) {
            return;
        }
        if (field512) {
            int var29 = method3421(arg0);
            boolean var30 = (var29 >> 21 & 0x1) != 0;
            if (var30 && (Statics.field740 & 0x20) == 32) {
                method2152(field464, field381 + " " + class38.field810 + " " + arg0.field2279, 58, 0, arg0.field2306, arg0.field2206);
            }
            return;
        }
        for (int var31 = 9; var31 >= 5; var31--) {
            String var32 = method637(arg0, var31);
            if (var32 != null) {
                method2152(var32, arg0.field2279, 1007, var31 + 1, arg0.field2306, arg0.field2206);
            }
        }
        String var33 = method178(arg0);
        if (var33 != null) {
            method2152(var33, arg0.field2279, 25, 0, arg0.field2306, arg0.field2206);
        }
        for (int var34 = 4; var34 >= 0; var34--) {
            String var35 = method637(arg0, var34);
            if (var35 != null) {
                method2152(var35, arg0.field2279, 57, var34 + 1, arg0.field2306, arg0.field2206);
            }
        }
        int var36 = method3421(arg0);
        boolean var37 = (var36 & 0x1) != 0;
        if (var37) {
            method2152(class174.field2367, "", 30, 0, arg0.field2306, arg0.field2206);
        }
    }

    @ObfuscatedName("i.dx([Lfu;IIIIIIII)V")
    public static final void method99(class170[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class170 var9 = arg0[var8];
            if (var9 != null && (!var9.field2205 || var9.field2208 == 0 || var9.field2310 || method3421(var9) != 0 || field531 == var9 || var9.field2321 == 1338) && var9.field2225 == arg1 && (!var9.field2205 || !method1618(var9))) {
                int var10 = var9.field2219 + arg6;
                int var11 = var9.field2220 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2208 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2208 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2221 + var10;
                    int var19 = var9.field2196 + var11;
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
                    int var22 = var9.field2221 + var10;
                    int var23 = var9.field2196 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field524 == var9) {
                    field456 = true;
                    field532 = var10;
                    field489 = var11;
                }
                if (!var9.field2205 || var12 < var14 && var13 < var15) {
                    int var24 = class116.field1793;
                    int var25 = class116.field1800;
                    if (class116.field1805 != 0) {
                        var24 = class116.field1797;
                        var25 = class116.field1807;
                    }
                    if (var9.field2321 == 1337) {
                        if (!field374 && !field444 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method810(var24, var25, var12, var13);
                        }
                    } else if (var9.field2321 == 1338) {
                        method152(var9, var10, var11);
                    } else {
                        if (!field444 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method806(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2208 == 0) {
                            if (!var9.field2205 && method1618(var9) && Statics.field1788 != var9) {
                                continue;
                            }
                            method99(arg0, var9.field2206, var12, var13, var14, var15, var10 - var9.field2227, var11 - var9.field2252);
                            if (var9.field2330 != null) {
                                method99(var9.field2330, var9.field2206, var12, var13, var14, var15, var10 - var9.field2227, var11 - var9.field2252);
                            }
                            class18 var26 = (class18) field467.method2260((long) var9.field2206);
                            if (var26 != null) {
                                if (var26.field190 == 0 && class116.field1793 >= var12 && class116.field1800 >= var13 && class116.field1793 < var14 && class116.field1800 < var15 && !field444 && !field506) {
                                    for (class19 var27 = (class19) field436.method2319(); var27 != null; var27 = (class19) field436.method2333()) {
                                        if (var27.field214) {
                                            var27.method2310();
                                            var27.field199.field2230 = false;
                                        }
                                    }
                                    if (Statics.field923 == 0) {
                                        field524 = null;
                                        field531 = null;
                                    }
                                    if (!field444) {
                                        method2647();
                                        field417[0] = class174.field2598;
                                        field451[0] = "";
                                        field448[0] = 1006;
                                        field578 = 1;
                                    }
                                }
                                int var28 = var26.field192;
                                if (class170.method693(var28)) {
                                    method99(Statics.field2197[var28], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2205) {
                            if (var9.field2233) {
                                if (class116.field1793 >= var12 && class116.field1800 >= var13 && class116.field1793 < var14 && class116.field1800 < var15) {
                                    for (class19 var29 = (class19) field436.method2319(); var29 != null; var29 = (class19) field436.method2333()) {
                                        if (var29.field214) {
                                            var29.method2310();
                                            var29.field199.field2230 = false;
                                        }
                                    }
                                    if (Statics.field923 == 0) {
                                        field524 = null;
                                        field531 = null;
                                    }
                                    if (!field444) {
                                        field417[0] = class174.field2598;
                                        field451[0] = "";
                                        field448[0] = 1006;
                                        field578 = 1;
                                    }
                                }
                            } else if (var9.field2200 && class116.field1793 >= var12 && class116.field1800 >= var13 && class116.field1793 < var14 && class116.field1800 < var15) {
                                for (class19 var30 = (class19) field436.method2319(); var30 != null; var30 = (class19) field436.method2333()) {
                                    if (var30.field214 && var30.field199.field2209 == var30.field210) {
                                        var30.method2310();
                                    }
                                }
                            }
                            boolean var31;
                            if (class116.field1793 >= var12 && class116.field1800 >= var13 && class116.field1793 < var14 && class116.field1800 < var15) {
                                var31 = true;
                            } else {
                                var31 = false;
                            }
                            boolean var32 = false;
                            if ((class116.field1795 == 1 || !Statics.field174 && class116.field1795 == 4) && var31) {
                                var32 = true;
                            }
                            boolean var33 = false;
                            if ((class116.field1805 == 1 || !Statics.field174 && class116.field1805 == 4) && class116.field1797 >= var12 && class116.field1807 >= var13 && class116.field1797 < var14 && class116.field1807 < var15) {
                                var33 = true;
                            }
                            if (var33) {
                                method177(var9, class116.field1797 - var10, class116.field1807 - var11);
                            }
                            if (field524 != null && field524 != var9 && var31 && class171.method2931(method3421(var9))) {
                                field344 = var9;
                            }
                            if (field531 == var9) {
                                field517 = true;
                                field320 = var10;
                                field486 = var11;
                            }
                            if (var9.field2310) {
                                if (var31 && field504 != 0 && var9.field2209 != null) {
                                    class19 var34 = new class19();
                                    var34.field214 = true;
                                    var34.field199 = var9;
                                    var34.field201 = field504;
                                    var34.field210 = var9.field2209;
                                    field436.method2314(var34);
                                }
                                if (field524 != null || Statics.field8 != null || field444) {
                                    var33 = false;
                                    var32 = false;
                                    var31 = false;
                                }
                                if (!var9.field2265 && var33) {
                                    var9.field2265 = true;
                                    if (var9.field2288 != null) {
                                        class19 var35 = new class19();
                                        var35.field214 = true;
                                        var35.field199 = var9;
                                        var35.field206 = class116.field1797 - var10;
                                        var35.field201 = class116.field1807 - var11;
                                        var35.field210 = var9.field2288;
                                        field436.method2314(var35);
                                    }
                                }
                                if (var9.field2265 && var32 && var9.field2289 != null) {
                                    class19 var36 = new class19();
                                    var36.field214 = true;
                                    var36.field199 = var9;
                                    var36.field206 = class116.field1793 - var10;
                                    var36.field201 = class116.field1800 - var11;
                                    var36.field210 = var9.field2289;
                                    field436.method2314(var36);
                                }
                                if (var9.field2265 && !var32) {
                                    var9.field2265 = false;
                                    if (var9.field2287 != null) {
                                        class19 var37 = new class19();
                                        var37.field214 = true;
                                        var37.field199 = var9;
                                        var37.field206 = class116.field1793 - var10;
                                        var37.field201 = class116.field1800 - var11;
                                        var37.field210 = var9.field2287;
                                        field507.method2314(var37);
                                    }
                                }
                                if (var32 && var9.field2291 != null) {
                                    class19 var38 = new class19();
                                    var38.field214 = true;
                                    var38.field199 = var9;
                                    var38.field206 = class116.field1793 - var10;
                                    var38.field201 = class116.field1800 - var11;
                                    var38.field210 = var9.field2291;
                                    field436.method2314(var38);
                                }
                                if (!var9.field2230 && var31) {
                                    var9.field2230 = true;
                                    if (var9.field2267 != null) {
                                        class19 var39 = new class19();
                                        var39.field214 = true;
                                        var39.field199 = var9;
                                        var39.field206 = class116.field1793 - var10;
                                        var39.field201 = class116.field1800 - var11;
                                        var39.field210 = var9.field2267;
                                        field436.method2314(var39);
                                    }
                                }
                                if (var9.field2230 && var31 && var9.field2293 != null) {
                                    class19 var40 = new class19();
                                    var40.field214 = true;
                                    var40.field199 = var9;
                                    var40.field206 = class116.field1793 - var10;
                                    var40.field201 = class116.field1800 - var11;
                                    var40.field210 = var9.field2293;
                                    field436.method2314(var40);
                                }
                                if (var9.field2230 && !var31) {
                                    var9.field2230 = false;
                                    if (var9.field2294 != null) {
                                        class19 var41 = new class19();
                                        var41.field214 = true;
                                        var41.field199 = var9;
                                        var41.field206 = class116.field1793 - var10;
                                        var41.field201 = class116.field1800 - var11;
                                        var41.field210 = var9.field2294;
                                        field507.method2314(var41);
                                    }
                                }
                                if (var9.field2305 != null) {
                                    class19 var42 = new class19();
                                    var42.field199 = var9;
                                    var42.field210 = var9.field2305;
                                    field544.method2314(var42);
                                }
                                if (var9.field2228 != null && field536 > var9.field2234) {
                                    if (var9.field2300 == null || field536 - var9.field2234 > 32) {
                                        class19 var47 = new class19();
                                        var47.field199 = var9;
                                        var47.field210 = var9.field2228;
                                        field436.method2314(var47);
                                    } else {
                                        label498: for (int var43 = var9.field2234; var43 < field536; var43++) {
                                            int var44 = field446[var43 & 0x1F];
                                            for (int var45 = 0; var45 < var9.field2300.length; var45++) {
                                                if (var9.field2300[var45] == var44) {
                                                    class19 var46 = new class19();
                                                    var46.field199 = var9;
                                                    var46.field210 = var9.field2228;
                                                    field436.method2314(var46);
                                                    break label498;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2234 = field536;
                                }
                                if (var9.field2204 != null && field495 > var9.field2335) {
                                    if (var9.field2302 == null || field495 - var9.field2335 > 32) {
                                        class19 var52 = new class19();
                                        var52.field199 = var9;
                                        var52.field210 = var9.field2204;
                                        field436.method2314(var52);
                                    } else {
                                        label474: for (int var48 = var9.field2335; var48 < field495; var48++) {
                                            int var49 = field494[var48 & 0x1F];
                                            for (int var50 = 0; var50 < var9.field2302.length; var50++) {
                                                if (var9.field2302[var50] == var49) {
                                                    class19 var51 = new class19();
                                                    var51.field199 = var9;
                                                    var51.field210 = var9.field2204;
                                                    field436.method2314(var51);
                                                    break label474;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2335 = field495;
                                }
                                if (var9.field2303 != null && field461 > var9.field2336) {
                                    if (var9.field2304 == null || field461 - var9.field2336 > 32) {
                                        class19 var57 = new class19();
                                        var57.field199 = var9;
                                        var57.field210 = var9.field2303;
                                        field436.method2314(var57);
                                    } else {
                                        label450: for (int var53 = var9.field2336; var53 < field461; var53++) {
                                            int var54 = field496[var53 & 0x1F];
                                            for (int var55 = 0; var55 < var9.field2304.length; var55++) {
                                                if (var9.field2304[var55] == var54) {
                                                    class19 var56 = new class19();
                                                    var56.field199 = var9;
                                                    var56.field210 = var9.field2303;
                                                    field436.method2314(var56);
                                                    break label450;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2336 = field461;
                                }
                                if (field498 > var9.field2333 && var9.field2308 != null) {
                                    class19 var58 = new class19();
                                    var58.field199 = var9;
                                    var58.field210 = var9.field2308;
                                    field436.method2314(var58);
                                }
                                if (field452 > var9.field2333 && var9.field2312 != null) {
                                    class19 var59 = new class19();
                                    var59.field199 = var9;
                                    var59.field210 = var9.field2312;
                                    field436.method2314(var59);
                                }
                                if (field500 > var9.field2333 && var9.field2311 != null) {
                                    class19 var60 = new class19();
                                    var60.field199 = var9;
                                    var60.field210 = var9.field2311;
                                    field436.method2314(var60);
                                }
                                if (field501 > var9.field2333 && var9.field2316 != null) {
                                    class19 var61 = new class19();
                                    var61.field199 = var9;
                                    var61.field210 = var9.field2316;
                                    field436.method2314(var61);
                                }
                                if (field441 > var9.field2333 && var9.field2317 != null) {
                                    class19 var62 = new class19();
                                    var62.field199 = var9;
                                    var62.field210 = var9.field2317;
                                    field436.method2314(var62);
                                }
                                if (field503 > var9.field2333 && var9.field2331 != null) {
                                    class19 var63 = new class19();
                                    var63.field199 = var9;
                                    var63.field210 = var9.field2331;
                                    field436.method2314(var63);
                                }
                                var9.field2333 = field491;
                                if (var9.field2285 != null) {
                                    for (int var64 = 0; var64 < field529; var64++) {
                                        class19 var65 = new class19();
                                        var65.field199 = var9;
                                        var65.field204 = field324[var64];
                                        var65.field205 = field530[var64];
                                        var65.field210 = var9.field2285;
                                        field436.method2314(var65);
                                    }
                                }
                            }
                        }
                        if (!var9.field2205 && field524 == null && Statics.field8 == null && !field444) {
                            if ((var9.field2315 >= 0 || var9.field2250 != 0) && class116.field1793 >= var12 && class116.field1800 >= var13 && class116.field1793 < var14 && class116.field1800 < var15) {
                                if (var9.field2315 >= 0) {
                                    Statics.field1788 = arg0[var9.field2315];
                                } else {
                                    Statics.field1788 = var9;
                                }
                            }
                            if (var9.field2208 == 8 && class116.field1793 >= var12 && class116.field1800 >= var13 && class116.field1793 < var14 && class116.field1800 < var15) {
                                Statics.field2345 = var9;
                            }
                            if (var9.field2248 > var9.field2196) {
                                method2168(var9, var9.field2221 + var10, var11, var9.field2196, var9.field2248, class116.field1793, class116.field1800);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fi.dm([Lfu;IB)V")
    public static final void method2982(class170[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class170 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2208 == 0) {
                    if (var3.field2330 != null) {
                        method2982(var3.field2330, arg1);
                    }
                    class18 var4 = (class18) field467.method2260((long) var3.field2206);
                    if (var4 != null) {
                        int var5 = var4.field192;
                        if (class170.method693(var5)) {
                            method2982(Statics.field2197[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2299 != null) {
                    class19 var6 = new class19();
                    var6.field199 = var3;
                    var6.field210 = var3.field2299;
                    class33.method3098(var6, 200000);
                }
                if (arg1 == 1 && var3.field2201 != null) {
                    if (var3.field2306 >= 0) {
                        class170 var7 = class170.method3109(var3.field2206);
                        if (var7 == null || var7.field2330 == null || var3.field2306 >= var7.field2330.length || var7.field2330[var3.field2306] != var3) {
                            continue;
                        }
                    }
                    class19 var8 = new class19();
                    var8.field199 = var3;
                    var8.field210 = var3.field2201;
                    class33.method3098(var8, 200000);
                }
            }
        }
    }

    @ObfuscatedName("v.dd(Lfu;III)V")
    public static final void method177(class170 arg0, int arg1, int arg2) {
        if (field524 != null || field444 || arg0 == null || method3787(arg0) == null) {
            return;
        }
        field524 = arg0;
        field531 = method3787(arg0);
        field481 = arg1;
        field370 = arg2;
        Statics.field923 = 0;
        field493 = false;
        int var3 = method2726();
        if (var3 != -1) {
            method2646(var3);
        }
    }

    @ObfuscatedName("fh.dt(S)V")
    public static final void method3090() {
        method3099(field524);
        Statics.field923++;
        if (field456 && field517) {
            int var0 = class116.field1793;
            int var1 = class116.field1800;
            int var2 = var0 - field481;
            int var3 = var1 - field370;
            if (var2 < field320) {
                var2 = field320;
            }
            if (field524.field2221 + var2 > field320 + field531.field2221) {
                var2 = field320 + field531.field2221 - field524.field2221;
            }
            if (var3 < field486) {
                var3 = field486;
            }
            if (field524.field2196 + var3 > field486 + field531.field2196) {
                var3 = field486 + field531.field2196 - field524.field2196;
            }
            int var4 = var2 - field532;
            int var5 = var3 - field489;
            int var6 = field524.field2282;
            if (Statics.field923 > field524.field2237 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field493 = true;
            }
            int var7 = field531.field2227 + (var2 - field320);
            int var8 = field531.field2252 + (var3 - field486);
            if (field524.field2283 != null && field493) {
                class19 var9 = new class19();
                var9.field199 = field524;
                var9.field206 = var7;
                var9.field201 = var8;
                var9.field210 = field524.field2283;
                class33.method3298(var9);
            }
            if (class116.field1795 == 0) {
                if (field493) {
                    if (field524.field2296 != null) {
                        class19 var10 = new class19();
                        var10.field199 = field524;
                        var10.field206 = var7;
                        var10.field201 = var8;
                        var10.field211 = field344;
                        var10.field210 = field524.field2296;
                        class33.method3098(var10, 200000);
                    }
                    if (field344 != null && method1681(field524) != null) {
                        field349.method2896(252);
                        field349.method2698(field524.field2326);
                        field349.method2654(field344.field2206);
                        field349.method2695(field344.field2326);
                        field349.method2695(field344.field2306);
                        field349.method2654(field524.field2206);
                        field349.method2695(field524.field2306);
                    }
                } else {
                    int var11 = method2726();
                    if (field578 > 2 && !(field443 != 1 || method193()) || method2634(var11)) {
                        method191(field532 + field481, field489 + field370);
                    } else if (field578 > 0) {
                        int var12 = field532 + field481;
                        int var13 = field489 + field370;
                        method3466(Statics.field91, var12, var13);
                        Statics.field91 = null;
                    }
                }
                field524 = null;
            }
        } else if (Statics.field923 > 1) {
            field524 = null;
        }
    }

    @ObfuscatedName("ec.dn(IB)V")
    public static void method2646(int arg0) {
        Statics.field91 = new class39();
        Statics.field91.field821 = field314[arg0];
        Statics.field91.field817 = field447[arg0];
        Statics.field91.field818 = field448[arg0];
        Statics.field91.field819 = field492[arg0];
        Statics.field91.field820 = field417[arg0];
    }

    @ObfuscatedName("fr.dy(Lfu;I)V")
    public static void method3099(class170 arg0) {
        if (field510 == arg0.field2338) {
            field511[arg0.field2337] = true;
        }
    }

    @ObfuscatedName("client.de(I)V")
    public static void method602() {
        for (class18 var0 = (class18) field467.method2264(); var0 != null; var0 = (class18) field467.method2272()) {
            int var1 = var0.field192;
            if (class170.method693(var1)) {
                boolean var2 = true;
                class170[] var3 = Statics.field2197[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2205;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field1882;
                    class170 var6 = class170.method3109(var5);
                    if (var6 != null) {
                        method3099(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("hn.da(Lfu;B)Lfu;")
    public static class170 method3787(class170 arg0) {
        class170 var1 = method1681(arg0);
        if (var1 == null) {
            var1 = arg0.field2281;
        }
        return var1;
    }

    @ObfuscatedName("do.dq([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method2204(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("m.ds(II)V")
    public static final void method135(int arg0) {
        if (!class170.method693(arg0)) {
            return;
        }
        class170[] var1 = Statics.field2197[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class170 var3 = var1[var2];
            if (var3 != null) {
                var3.field2328 = 0;
                var3.field2329 = 0;
            }
        }
    }

    @ObfuscatedName("r.df([Lfu;IB)V")
    public static final void method82(class170[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class170 var3 = arg0[var2];
            if (var3 != null && var3.field2225 == arg1 && (!var3.field2205 || !method1618(var3))) {
                if (var3.field2208 == 0) {
                    if (!var3.field2205 && method1618(var3) && Statics.field1788 != var3) {
                        continue;
                    }
                    method82(arg0, var3.field2206);
                    if (var3.field2330 != null) {
                        method82(var3.field2330, var3.field2206);
                    }
                    class18 var4 = (class18) field467.method2260((long) var3.field2206);
                    if (var4 != null) {
                        int var5 = var4.field192;
                        if (class170.method693(var5)) {
                            method82(Statics.field2197[var5], -1);
                        }
                    }
                }
                if (var3.field2208 == 6) {
                    if (var3.field2231 != -1 || var3.field2254 != -1) {
                        boolean var6 = method3107(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2254;
                        } else {
                            var7 = var3.field2231;
                        }
                        if (var7 != -1) {
                            class202 var8 = class202.method3379(var7);
                            var3.field2329 += field499;
                            while (var3.field2329 > var8.field3064[var3.field2328]) {
                                var3.field2329 -= var8.field3064[var3.field2328];
                                var3.field2328++;
                                if (var3.field2328 >= var8.field3057.length) {
                                    var3.field2328 -= var8.field3068;
                                    if (var3.field2328 < 0 || var3.field2328 >= var8.field3057.length) {
                                        var3.field2328 = 0;
                                    }
                                }
                                method3099(var3);
                            }
                        }
                    }
                    if (var3.field2295 != 0 && !var3.field2205) {
                        int var9 = var3.field2295 >> 16;
                        int var10 = var3.field2295 << 16 >> 16;
                        int var11 = field499 * var9;
                        int var12 = field499 * var10;
                        var3.field2257 = var3.field2257 + var11 & 0x7FF;
                        var3.field2258 = var3.field2258 + var12 & 0x7FF;
                        method3099(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("eo.dc(IB)V")
    public static final void method2593(int arg0) {
        method602();
        Statics.method2512();
        int var1 = class188.method3169(arg0).field2781;
        if (var1 == 0) {
            return;
        }
        int var2 = class166.field2163[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class85.method1626(0.9D);
                ((class75) Statics.field1466).method1422(0.9D);
            }
            if (var2 == 2) {
                class85.method1626(0.8D);
                ((class75) Statics.field1466).method1422(0.8D);
            }
            if (var2 == 3) {
                class85.method1626(0.7D);
                ((class75) Statics.field1466).method1422(0.7D);
            }
            if (var2 == 4) {
                class85.method1626(0.6D);
                ((class75) Statics.field1466).method1422(0.6D);
            }
            class199.method956();
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
            if (field543 != var3) {
                if (field543 == 0 && field422 != -1) {
                    class139.method1399(Statics.field128, field422, 0, var3, false);
                    field546 = false;
                } else if (var3 == 0) {
                    Statics.field1917.method2469();
                    class139.field1920 = 1;
                    Statics.field2183 = null;
                    field546 = false;
                } else if (class139.field1920 == 0) {
                    Statics.field1917.method2408(var3);
                } else {
                    Statics.field17 = var3;
                }
                field543 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field480 = 127;
            }
            if (var2 == 1) {
                field480 = 96;
            }
            if (var2 == 2) {
                field480 = 64;
            }
            if (var2 == 3) {
                field480 = 32;
            }
            if (var2 == 4) {
                field480 = 0;
            }
        }
        if (var1 == 5) {
            field443 = var2;
        }
        if (var1 == 6) {
            field339 = var2;
        }
        if (var1 == 9) {
            field469 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field547 = 127;
            }
            if (var2 == 1) {
                field547 = 96;
            }
            if (var2 == 2) {
                field547 = 64;
            }
            if (var2 == 3) {
                field547 = 32;
            }
            if (var2 == 4) {
                field547 = 0;
            }
        }
        if (var1 == 17) {
            field515 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class41[] var4 = new class41[] { class41.field837, class41.field831, class41.field832, class41.field830 };
            field332 = (class41) class149.method2203(var4, var2);
            if (field332 == null) {
                field332 = class41.field832;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field435 = -1;
            } else {
                field435 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class41[] var5 = new class41[] { class41.field837, class41.field831, class41.field832, class41.field830 };
        field333 = (class41) class149.method2203(var5, var2);
        if (field333 == null) {
            field333 = class41.field832;
        }
    }

    @ObfuscatedName("w.do(Lfu;I)V")
    public static final void method202(class170 arg0) {
        int var1 = arg0.field2321;
        if (var1 == 324) {
            if (field580 == -1) {
                field580 = arg0.field2241;
                field581 = arg0.field2339;
            }
            if (field433.field2171) {
                arg0.field2241 = field580;
            } else {
                arg0.field2241 = field581;
            }
        } else if (var1 == 325) {
            if (field580 == -1) {
                field580 = arg0.field2241;
                field581 = arg0.field2339;
            }
            if (field433.field2171) {
                arg0.field2241 = field581;
            } else {
                arg0.field2241 = field580;
            }
        } else if (var1 == 327) {
            arg0.field2257 = 150;
            arg0.field2258 = (int) (Math.sin((double) field450 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2249 = 5;
            arg0.field2247 = 0;
        } else if (var1 == 328) {
            arg0.field2257 = 150;
            arg0.field2258 = (int) (Math.sin((double) field450 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2249 = 5;
            arg0.field2247 = 1;
        }
    }

    @ObfuscatedName("el.dv(I)V")
    public static final void method2866() {
        field349.method2896(197);
        for (class18 var0 = (class18) field467.method2264(); var0 != null; var0 = (class18) field467.method2272()) {
            if (var0.field190 == 0 || var0.field190 == 3) {
                method669(var0, true);
            }
        }
        if (field470 != null) {
            method3099(field470);
            field470 = null;
        }
    }

    @ObfuscatedName("au.dw(Lt;ZI)V")
    public static final void method669(class18 arg0, boolean arg1) {
        int var2 = arg0.field192;
        int var3 = (int) arg0.field1882;
        arg0.method2310();
        if (arg1 && var2 != -1 && Statics.field2195[var2]) {
            Statics.field2272.method3128(var2);
            if (Statics.field2197[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2197[var2].length; var5++) {
                    if (Statics.field2197[var2][var5] != null) {
                        if (Statics.field2197[var2][var5].field2208 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2197[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2197[var2] = null;
                }
                Statics.field2195[var2] = false;
            }
        }
        method2570(var2);
        class170 var6 = class170.method3109(var3);
        if (var6 != null) {
            method3099(var6);
        }
        method174();
        if (field523 != -1) {
            int var7 = field523;
            if (class170.method693(var7)) {
                method2982(Statics.field2197[var7], 1);
            }
        }
    }

    @ObfuscatedName("ao.dz(Lfu;I)Z")
    public static final boolean method793(class170 arg0) {
        int var1 = arg0.field2321;
        if (var1 == 205) {
            field359 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field433.method3006(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field433.method2995(var4, var5 == 1);
        }
        if (var1 == 324) {
            field433.method2996(false);
        }
        if (var1 == 325) {
            field433.method2996(true);
        }
        if (var1 == 326) {
            field349.method2896(210);
            field433.method3013(field349);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("dp.di(IIIILhy;Lfi;I)V")
    public static final void method1960(int arg0, int arg1, int arg2, int arg3, class225 arg4, class165 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method1545(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field527 + field354 & 0x7FF;
        int var8 = class85.field1469[var7];
        int var9 = class85.field1463[var7];
        int var10 = var8 * 256 / (field390 + 256);
        int var11 = var9 * 256 / (field390 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field133.method4004(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("ct.dj(IIIILhy;Lfi;I)V")
    public static final void method1545(int arg0, int arg1, int arg2, int arg3, class225 arg4, class165 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field527 + field354 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class85.field1469[var6];
        int var9 = class85.field1463[var6];
        int var10 = var8 * 256 / (field390 + 256);
        int var11 = var9 * 256 / (field390 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method3964(arg5.field2157 / 2 + var12 - arg4.field3230 / 2, arg5.field2158 / 2 - var13 - arg4.field3226 / 2, arg0, arg1, arg5.field2157, arg5.field2158, arg5.field2156, arg5.field2155);
        } else {
            arg4.method3941(arg5.field2157 / 2 + arg0 + var12 - arg4.field3230 / 2, arg5.field2158 / 2 + arg1 - var13 - arg4.field3226 / 2);
        }
    }

    @ObfuscatedName("f.dk(Ljava/lang/String;ZI)Z")
    public static boolean method184(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class205.method1529(arg0, Statics.field245);
        for (int var3 = 0; var3 < field573; var3++) {
            if (var2.equalsIgnoreCase(class205.method1529(field423[var3].field166, Statics.field245)) && (!arg1 || field423[var3].field164 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class205.method1529(Statics.field792.field263, Statics.field245))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fs.dg(Ljava/lang/String;IB)V")
    public static final void method3096(String arg0, int arg1) {
        field349.method2896(241);
        field349.method2751(class154.method2202(arg0) + 1);
        field349.method2751(arg1);
        field349.method2657(arg0);
    }

    @ObfuscatedName("g.db(S)V")
    public static final void method254() {
        field349.method2896(152);
        field349.method2751(0);
    }

    @ObfuscatedName("ed.dr(II)V")
    public static void method2570(int arg0) {
        for (class134 var1 = (class134) field508.method2264(); var1 != null; var1 = (class134) field508.method2272()) {
            if ((var1.field1882 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method2310();
            }
        }
    }

    @ObfuscatedName("gw.ek(Lfu;B)I")
    public static int method3421(class170 arg0) {
        class134 var1 = (class134) field508.method2260(((long) arg0.field2206 << 32) + (long) arg0.field2306);
        return var1 == null ? arg0.field2278 : var1.field1896;
    }

    @ObfuscatedName("cj.eg(Lfu;I)Lfu;")
    public static class170 method1681(class170 arg0) {
        int var1 = method3421(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class170.method3109(arg0.field2225);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("cw.ej(Lfu;B)Z")
    public static boolean method1618(class170 arg0) {
        if (field506) {
            if (method3421(arg0) != 0) {
                return false;
            }
            if (arg0.field2208 == 0) {
                return false;
            }
        }
        return arg0.field2226;
    }

    @ObfuscatedName("at.eu(Lfu;II)Ljava/lang/String;")
    public static String method637(class170 arg0, int arg1) {
        if (!class171.method868(method3421(arg0), arg1) && arg0.field2275 == null) {
            return null;
        } else if (arg0.field2280 == null || arg0.field2280.length <= arg1 || arg0.field2280[arg1] == null || arg0.field2280[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2280[arg1];
        }
    }

    @ObfuscatedName("v.ef(Lfu;I)Ljava/lang/String;")
    public static String method178(class170 arg0) {
        int var1 = method3421(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2307 == null || arg0.field2307.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2307;
        }
    }

    @ObfuscatedName("al.eq(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method863(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field306 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field306 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field306 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field306 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field306 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field311 != null) {
            var3 = "/p=" + Statics.field311;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field310 + "/a=" + Statics.field134 + var3 + "/";
    }
}

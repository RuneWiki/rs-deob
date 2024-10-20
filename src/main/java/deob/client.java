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
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class114 {

    @ObfuscatedName("client.d")
    public static boolean field587 = true;

    @ObfuscatedName("client.w")
    public static class118[] field373 = new class118[4];

    @ObfuscatedName("client.h")
    public static int field583 = 1;

    @ObfuscatedName("client.u")
    public static int field375 = 0;

    @ObfuscatedName("client.g")
    public static int field382 = 0;

    @ObfuscatedName("client.v")
    public static boolean field314 = false;

    @ObfuscatedName("client.l")
    public static boolean field440 = false;

    @ObfuscatedName("client.s")
    public static int field410 = 0;

    @ObfuscatedName("client.b")
    public static int field318 = 0;

    @ObfuscatedName("client.t")
    public static boolean field319 = true;

    @ObfuscatedName("client.z")
    public static int field320 = 0;

    @ObfuscatedName("client.p")
    public static long field321 = -1L;

    @ObfuscatedName("client.a")
    public static int field323 = -1;

    @ObfuscatedName("client.o")
    public static int field324 = -1;

    @ObfuscatedName("client.an")
    public static int field315 = -1;

    @ObfuscatedName("client.ar")
    public static boolean field582 = true;

    @ObfuscatedName("client.aa")
    public static boolean field393 = false;

    @ObfuscatedName("client.af")
    public static int field328 = 0;

    @ObfuscatedName("client.ax")
    public static int field459 = 0;

    @ObfuscatedName("client.ah")
    public static int field330 = 0;

    @ObfuscatedName("client.az")
    public static int field363 = 0;

    @ObfuscatedName("client.at")
    public static int field332 = 0;

    @ObfuscatedName("client.ab")
    public static int field333 = 0;

    @ObfuscatedName("client.ae")
    public static int field334 = 0;

    @ObfuscatedName("client.ao")
    public static int field335 = 0;

    @ObfuscatedName("client.am")
    public static int field336 = 0;

    @ObfuscatedName("client.aq")
    public static class41 field337 = class41.field837;

    @ObfuscatedName("client.aj")
    public static class41 field338 = class41.field837;

    @ObfuscatedName("client.ai")
    public static int field339 = 0;

    @ObfuscatedName("client.as")
    public static int field493 = 0;

    @ObfuscatedName("client.al")
    public static int field341 = 0;

    @ObfuscatedName("client.bw")
    public static int field344 = 0;

    @ObfuscatedName("client.bu")
    public static int field572 = 0;

    @ObfuscatedName("client.bo")
    public static int field472 = 0;

    @ObfuscatedName("client.bx")
    public static int field566 = 0;

    @ObfuscatedName("client.bs")
    public static int field348 = 0;

    @ObfuscatedName("client.bg")
    public static byte[] field350 = null;

    @ObfuscatedName("client.cb")
    public static class36[] field351 = new class36[32768];

    @ObfuscatedName("client.cs")
    public static int field352 = 0;

    @ObfuscatedName("client.cj")
    public static int[] field571 = new int[32768];

    @ObfuscatedName("client.cf")
    public static int field354 = 0;

    @ObfuscatedName("client.cv")
    public static int[] field431 = new int[250];

    @ObfuscatedName("client.cx")
    public static class160 field310 = new class160(5000);

    @ObfuscatedName("client.cn")
    public static class160 field357 = new class160(5000);

    @ObfuscatedName("client.cl")
    public static class160 field358 = new class160(15000);

    @ObfuscatedName("client.cy")
    public static int field359 = 0;

    @ObfuscatedName("client.cz")
    public static int field360 = 0;

    @ObfuscatedName("client.cm")
    public static int field361 = 0;

    @ObfuscatedName("client.cq")
    public static int field498 = 0;

    @ObfuscatedName("client.cp")
    public static int field484 = 0;

    @ObfuscatedName("client.ch")
    public static int field364 = 0;

    @ObfuscatedName("client.cu")
    public static int field365 = 0;

    @ObfuscatedName("client.co")
    public static int field366 = 0;

    @ObfuscatedName("client.cr")
    public static boolean field588 = false;

    @ObfuscatedName("client.dc")
    public static int field390 = 0;

    @ObfuscatedName("client.dj")
    public static int field369 = 1;

    @ObfuscatedName("client.di")
    public static int field370 = 0;

    @ObfuscatedName("client.dx")
    public static int field454 = 1;

    @ObfuscatedName("client.dq")
    public static int field372 = 0;

    @ObfuscatedName("client.do")
    public static boolean field543 = false;

    @ObfuscatedName("client.dr")
    public static int[][][] field313 = new int[4][13][13];

    @ObfuscatedName("client.dm")
    public static final int[] field362 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dp")
    public static int field377 = 0;

    @ObfuscatedName("client.dv")
    public static int field378 = 2;

    @ObfuscatedName("client.df")
    public static int field416 = 0;

    @ObfuscatedName("client.eb")
    public static int field380 = 2;

    @ObfuscatedName("client.ea")
    public static int field381 = 0;

    @ObfuscatedName("client.en")
    public static int field443 = 1;

    @ObfuscatedName("client.ew")
    public static int field383 = 0;

    @ObfuscatedName("client.ej")
    public static int field384 = 0;

    @ObfuscatedName("client.ef")
    public static int field385 = 2;

    @ObfuscatedName("client.ep")
    public static int field386 = 0;

    @ObfuscatedName("client.ei")
    public static int field387 = 1;

    @ObfuscatedName("client.eh")
    public static int field388 = 0;

    @ObfuscatedName("client.em")
    public static int field329 = 0;

    @ObfuscatedName("client.ec")
    public static int field391 = 2301979;

    @ObfuscatedName("client.ek")
    public static int field418 = 5063219;

    @ObfuscatedName("client.eg")
    public static int field419 = 3353893;

    @ObfuscatedName("client.eu")
    public static int field394 = 7759444;

    @ObfuscatedName("client.ft")
    public static boolean field395 = false;

    @ObfuscatedName("client.fl")
    public static int field396 = 0;

    @ObfuscatedName("client.fx")
    public static int field397 = 128;

    @ObfuscatedName("client.fg")
    public static int field398 = 0;

    @ObfuscatedName("client.fq")
    public static int field448 = 0;

    @ObfuscatedName("client.fr")
    public static int field400 = 0;

    @ObfuscatedName("client.fb")
    public static int field401 = 0;

    @ObfuscatedName("client.fs")
    public static int field402 = 0;

    @ObfuscatedName("client.fy")
    public static int field403 = 50;

    @ObfuscatedName("client.fc")
    public static int field404 = 0;

    @ObfuscatedName("client.fp")
    public static boolean field405 = false;

    @ObfuscatedName("client.ff")
    public static int field504 = 0;

    @ObfuscatedName("client.fk")
    public static int field353 = 0;

    @ObfuscatedName("client.fe")
    public static int field327 = 50;

    @ObfuscatedName("client.fa")
    public static int[] field486 = new int[field327];

    @ObfuscatedName("client.fw")
    public static int[] field494 = new int[field327];

    @ObfuscatedName("client.fh")
    public static int[] field411 = new int[field327];

    @ObfuscatedName("client.fi")
    public static int[] field371 = new int[field327];

    @ObfuscatedName("client.fz")
    public static int[] field413 = new int[field327];

    @ObfuscatedName("client.gk")
    public static int[] field414 = new int[field327];

    @ObfuscatedName("client.ga")
    public static int[] field460 = new int[field327];

    @ObfuscatedName("client.gn")
    public static String[] field502 = new String[field327];

    @ObfuscatedName("client.gd")
    public static int[][] field374 = new int[104][104];

    @ObfuscatedName("client.gz")
    public static int field535 = 0;

    @ObfuscatedName("client.gu")
    public static int field356 = -1;

    @ObfuscatedName("client.gt")
    public static int field340 = -1;

    @ObfuscatedName("client.gm")
    public static int field423 = 0;

    @ObfuscatedName("client.gx")
    public static int field422 = 0;

    @ObfuscatedName("client.go")
    public static int field549 = 0;

    @ObfuscatedName("client.gg")
    public static int field424 = 0;

    @ObfuscatedName("client.gc")
    public static int field426 = 0;

    @ObfuscatedName("client.gs")
    public static int field407 = 0;

    @ObfuscatedName("client.gh")
    public static int field311 = 0;

    @ObfuscatedName("client.gw")
    public static int field428 = 0;

    @ObfuscatedName("client.gv")
    public static int field429 = 0;

    @ObfuscatedName("client.gy")
    public static int field409 = 0;

    @ObfuscatedName("client.ge")
    public static boolean field462 = false;

    @ObfuscatedName("client.gr")
    public static int field432 = 0;

    @ObfuscatedName("client.gf")
    public static int field433 = 0;

    @ObfuscatedName("client.gb")
    public static class24[] field434 = new class24[2048];

    @ObfuscatedName("client.hf")
    public static int field435 = -1;

    @ObfuscatedName("client.ho")
    public static int field530 = 0;

    @ObfuscatedName("client.hn")
    public static int field437 = 0;

    @ObfuscatedName("client.hi")
    public static int[] field438 = new int[1000];

    @ObfuscatedName("client.ha")
    public static final int[] field439 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hl")
    public static String[] field417 = new String[8];

    @ObfuscatedName("client.hz")
    public static boolean[] field464 = new boolean[8];

    @ObfuscatedName("client.hr")
    public static int[] field442 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hc")
    public static int field408 = -1;

    @ObfuscatedName("client.hh")
    public static class129[][][] field522 = new class129[4][104][104];

    @ObfuscatedName("client.hm")
    public static class129 field445 = new class129();

    @ObfuscatedName("client.hu")
    public static class129 field326 = new class129();

    @ObfuscatedName("client.hv")
    public static class129 field444 = new class129();

    @ObfuscatedName("client.hb")
    public static int[] field427 = new int[25];

    @ObfuscatedName("client.hs")
    public static int[] field449 = new int[25];

    @ObfuscatedName("client.hq")
    public static int[] field525 = new int[25];

    @ObfuscatedName("client.ht")
    public static int field389 = 0;

    @ObfuscatedName("client.he")
    public static boolean field452 = false;

    @ObfuscatedName("client.hp")
    public static int field453 = 0;

    @ObfuscatedName("client.il")
    public static int[] field532 = new int[500];

    @ObfuscatedName("client.ic")
    public static int[] field455 = new int[500];

    @ObfuscatedName("client.ih")
    public static int[] field456 = new int[500];

    @ObfuscatedName("client.ia")
    public static int[] field542 = new int[500];

    @ObfuscatedName("client.ig")
    public static String[] field458 = new String[500];

    @ObfuscatedName("client.ir")
    public static String[] field421 = new String[500];

    @ObfuscatedName("client.iy")
    public static boolean field347 = false;

    @ObfuscatedName("client.im")
    public static int field392 = -1;

    @ObfuscatedName("client.ik")
    public static boolean field562 = false;

    @ObfuscatedName("client.ij")
    public static int field463 = -1;

    @ObfuscatedName("client.ip")
    public static int field468 = -1;

    @ObfuscatedName("client.ib")
    public static int field349 = 0;

    @ObfuscatedName("client.ii")
    public static int field466 = 50;

    @ObfuscatedName("client.iq")
    public static int field467 = 0;

    @ObfuscatedName("client.iw")
    public static String field497 = null;

    @ObfuscatedName("client.is")
    public static boolean field469 = false;

    @ObfuscatedName("client.it")
    public static int field470 = -1;

    @ObfuscatedName("client.iv")
    public static int field406 = -1;

    @ObfuscatedName("client.jy")
    public static String field490 = null;

    @ObfuscatedName("client.ja")
    public static String field473 = null;

    @ObfuscatedName("client.jw")
    public static int field474 = -1;

    @ObfuscatedName("client.jl")
    public static class126 field346 = new class126(8);

    @ObfuscatedName("client.jq")
    public static int field476 = 0;

    @ObfuscatedName("client.jm")
    public static int field477 = 0;

    @ObfuscatedName("client.jd")
    public static class170 field478 = null;

    @ObfuscatedName("client.jz")
    public static int field479 = 0;

    @ObfuscatedName("client.jb")
    public static int field415 = 0;

    @ObfuscatedName("client.jf")
    public static int field481 = 0;

    @ObfuscatedName("client.jo")
    public static int field482 = -1;

    @ObfuscatedName("client.js")
    public static boolean field483 = false;

    @ObfuscatedName("client.jt")
    public static boolean field563 = false;

    @ObfuscatedName("client.jj")
    public static boolean field485 = false;

    @ObfuscatedName("client.jv")
    public static class170 field552 = null;

    @ObfuscatedName("client.jp")
    public static class170 field487 = null;

    @ObfuscatedName("client.ju")
    public static class170 field488 = null;

    @ObfuscatedName("client.jc")
    public static int field527 = 0;

    @ObfuscatedName("client.je")
    public static int field471 = 0;

    @ObfuscatedName("client.jh")
    public static class170 field491 = null;

    @ObfuscatedName("client.jr")
    public static boolean field492 = false;

    @ObfuscatedName("client.ji")
    public static int field345 = -1;

    @ObfuscatedName("client.jk")
    public static int field591 = -1;

    @ObfuscatedName("client.jn")
    public static boolean field451 = false;

    @ObfuscatedName("client.jx")
    public static int field496 = -1;

    @ObfuscatedName("client.kz")
    public static int field531 = -1;

    @ObfuscatedName("client.kj")
    public static boolean field399 = false;

    @ObfuscatedName("client.ki")
    public static int field499 = 1;

    @ObfuscatedName("client.kn")
    public static int[] field500 = new int[32];

    @ObfuscatedName("client.kb")
    public static int field501 = 0;

    @ObfuscatedName("client.kr")
    public static int[] field379 = new int[32];

    @ObfuscatedName("client.kd")
    public static int field503 = 0;

    @ObfuscatedName("client.kq")
    public static int[] field517 = new int[32];

    @ObfuscatedName("client.kw")
    public static int field505 = 0;

    @ObfuscatedName("client.ka")
    public static int field506 = 0;

    @ObfuscatedName("client.ko")
    public static int field507 = 0;

    @ObfuscatedName("client.kf")
    public static int field508 = 0;

    @ObfuscatedName("client.kc")
    public static int field546 = 0;

    @ObfuscatedName("client.kx")
    public static int field510 = 0;

    @ObfuscatedName("client.kk")
    public static int field511 = 0;

    @ObfuscatedName("client.kp")
    public static int field512 = 0;

    @ObfuscatedName("client.kg")
    public static class129 field513 = new class129();

    @ObfuscatedName("client.ku")
    public static class129 field514 = new class129();

    @ObfuscatedName("client.ll")
    public static class129 field515 = new class129();

    @ObfuscatedName("client.lz")
    public static class126 field516 = new class126(512);

    @ObfuscatedName("client.ls")
    public static int field312 = 0;

    @ObfuscatedName("client.lj")
    public static int field518 = -2;

    @ObfuscatedName("client.la")
    public static boolean[] field519 = new boolean[100];

    @ObfuscatedName("client.lp")
    public static boolean[] field489 = new boolean[100];

    @ObfuscatedName("client.lg")
    public static boolean[] field521 = new boolean[100];

    @ObfuscatedName("client.lm")
    public static int[] field316 = new int[100];

    @ObfuscatedName("client.ld")
    public static int[] field412 = new int[100];

    @ObfuscatedName("client.le")
    public static int[] field524 = new int[100];

    @ObfuscatedName("client.lb")
    public static int[] field520 = new int[100];

    @ObfuscatedName("client.lu")
    public static int field526 = 0;

    @ObfuscatedName("client.lx")
    public static long field343 = 0L;

    @ObfuscatedName("client.lw")
    public static boolean field528 = true;

    @ObfuscatedName("client.lo")
    public static int field529 = 765;

    @ObfuscatedName("client.lc")
    public static int field331 = 1;

    @ObfuscatedName("client.lk")
    public static int[] field465 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lv")
    public static int field308 = 0;

    @ObfuscatedName("client.lt")
    public static int field533 = 0;

    @ObfuscatedName("client.lq")
    public static String field534 = "";

    @ObfuscatedName("client.mm")
    public static long[] field556 = new long[100];

    @ObfuscatedName("client.mi")
    public static int field536 = 0;

    @ObfuscatedName("client.mw")
    public static int field475 = 0;

    @ObfuscatedName("client.mp")
    public static int[] field538 = new int[128];

    @ObfuscatedName("client.mc")
    public static int[] field539 = new int[128];

    @ObfuscatedName("client.mk")
    public static long field540 = -1L;

    @ObfuscatedName("client.my")
    public static String field541 = null;

    @ObfuscatedName("client.mq")
    public static String field436 = null;

    @ObfuscatedName("client.mt")
    public static int field544 = -1;

    @ObfuscatedName("client.me")
    public static int field586 = 0;

    @ObfuscatedName("client.mz")
    public static int[] field545 = new int[1000];

    @ObfuscatedName("client.mx")
    public static int[] field495 = new int[1000];

    @ObfuscatedName("client.mh")
    public static class225[] field547 = new class225[1000];

    @ObfuscatedName("client.mn")
    public static int field548 = 0;

    @ObfuscatedName("client.mv")
    public static int field425 = 0;

    @ObfuscatedName("client.nj")
    public static int field550 = 0;

    @ObfuscatedName("client.nd")
    public static int field551 = 255;

    @ObfuscatedName("client.nf")
    public static int field446 = -1;

    @ObfuscatedName("client.ni")
    public static boolean field553 = false;

    @ObfuscatedName("client.nw")
    public static int field554 = 127;

    @ObfuscatedName("client.nc")
    public static int field555 = 127;

    @ObfuscatedName("client.nx")
    public static int field420 = 0;

    @ObfuscatedName("client.nu")
    public static int[] field557 = new int[50];

    @ObfuscatedName("client.nb")
    public static int[] field558 = new int[50];

    @ObfuscatedName("client.na")
    public static int[] field559 = new int[50];

    @ObfuscatedName("client.nn")
    public static int[] field560 = new int[50];

    @ObfuscatedName("client.nq")
    public static class54[] field561 = new class54[50];

    @ObfuscatedName("client.ny")
    public static boolean field441 = false;

    @ObfuscatedName("client.oo")
    public static boolean[] field509 = new boolean[5];

    @ObfuscatedName("client.ol")
    public static int[] field564 = new int[5];

    @ObfuscatedName("client.oc")
    public static int[] field565 = new int[5];

    @ObfuscatedName("client.ox")
    public static int[] field355 = new int[5];

    @ObfuscatedName("client.or")
    public static int[] field567 = new int[5];

    @ObfuscatedName("client.od")
    public static short field568 = 256;

    @ObfuscatedName("client.os")
    public static short field569 = 205;

    @ObfuscatedName("client.oz")
    public static short field570 = 256;

    @ObfuscatedName("client.oq")
    public static short field523 = 320;

    @ObfuscatedName("client.om")
    public static short field325 = 1;

    @ObfuscatedName("client.ou")
    public static short field573 = 32767;

    @ObfuscatedName("client.ob")
    public static short field574 = 1;

    @ObfuscatedName("client.oj")
    public static short field575 = 32767;

    @ObfuscatedName("client.on")
    public static int field576 = 0;

    @ObfuscatedName("client.oh")
    public static int field457 = 0;

    @ObfuscatedName("client.ow")
    public static int field578 = 0;

    @ObfuscatedName("client.ok")
    public static int field579 = 0;

    @ObfuscatedName("client.og")
    public static int field580 = 0;

    @ObfuscatedName("client.oi")
    public static int field581 = 0;

    @ObfuscatedName("client.of")
    public static int field376 = 0;

    @ObfuscatedName("client.ps")
    public static class15[] field537 = new class15[400];

    @ObfuscatedName("client.pb")
    public static class131 field584 = new class131();

    @ObfuscatedName("client.pi")
    public static int field585 = 0;

    @ObfuscatedName("client.ph")
    public static class20[] field480 = new class20[400];

    @ObfuscatedName("client.pr")
    public static class167 field577 = new class167();

    @ObfuscatedName("client.pu")
    public static int field368 = -1;

    @ObfuscatedName("client.pv")
    public static int field589 = -1;

    @ObfuscatedName("client.pn")
    public static class5[] field590 = new class5[8];

    @ObfuscatedName("client.pz")
    public static long field367 = -1L;

    @ObfuscatedName("client.pc")
    public static long field592 = -1L;

    @ObfuscatedName("client.pp")
    public static final class23 field593 = new class23();

    @ObfuscatedName("client.pa")
    public static int[] field594 = new int[50];

    @ObfuscatedName("client.pt")
    public static int[] field595 = new int[50];

    @ObfuscatedName("client.c(B)V")
    public final void method281() {
    }

    public final void init() {
        if (!this.method2021()) {
            return;
        }
        class215[] var1 = new class215[] { class215.field3167, class215.field3168, class215.field3163, class215.field3175, class215.field3177, class215.field3166, class215.field3172, class215.field3165, class215.field3174, class215.field3170, class215.field3176, class215.field3162, class215.field3161, class215.field3173, class215.field3164 };
        class215[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class215 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3171);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3171)) {
                    case 1:
                        Statics.field302 = class179.method2842(Integer.parseInt(var5));
                        break;
                    case 2:
                        if (var5.equalsIgnoreCase(class38.field812)) {
                        }
                        break;
                    case 3:
                        Statics.field34 = var5;
                        break;
                    case 4:
                        field410 = Integer.parseInt(var5);
                    case 5:
                    case 6:
                    case 7:
                    default:
                        break;
                    case 8:
                        Statics.field2667 = var5;
                        break;
                    case 9:
                        Statics.field317 = Integer.parseInt(var5);
                        break;
                    case 10:
                        if (var5.equalsIgnoreCase(class38.field812)) {
                            field314 = true;
                        } else {
                            field314 = false;
                        }
                        break;
                    case 11:
                        field583 = Integer.parseInt(var5);
                        break;
                    case 12:
                        Statics.field612 = Integer.parseInt(var5);
                        break;
                    case 13:
                        field375 = Integer.parseInt(var5);
                        break;
                    case 14:
                        Statics.field219 = (class180) Statics.method78(class180.method3590(), Integer.parseInt(var5));
                        if (Statics.field219 == class180.field2677) {
                            Statics.field2156 = class229.field3254;
                        } else {
                            Statics.field2156 = class229.field3256;
                        }
                        break;
                    case 15:
                        field382 = Integer.parseInt(var5);
                }
            }
        }
        method1859();
        Statics.field1567 = this.getCodeBase().getHost();
        String var6 = Statics.field302.field2668;
        byte var7 = 0;
        try {
            Statics.field252 = 16;
            Statics.field235 = var7;
            try {
                Statics.field1484 = System.getProperty("os.name");
            } catch (Exception var28) {
                Statics.field1484 = "Unknown";
            }
            Statics.field1695 = Statics.field1484.toLowerCase();
            try {
                Statics.field725 = System.getProperty("user.home");
                if (Statics.field725 != null) {
                    Statics.field725 = Statics.field725 + "/";
                }
            } catch (Exception var27) {
            }
            try {
                if (Statics.field1695.startsWith("win")) {
                    if (Statics.field725 == null) {
                        Statics.field725 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field725 == null) {
                    Statics.field725 = System.getenv("HOME");
                }
                if (Statics.field725 != null) {
                    Statics.field725 = Statics.field725 + "/";
                }
            } catch (Exception var26) {
            }
            if (Statics.field725 == null) {
                Statics.field725 = "~/";
            }
            Statics.field1477 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field725, "/tmp/", "" };
            Statics.field3101 = new String[] { ".jagex_cache_" + Statics.field235, ".file_store_" + Statics.field235 };
            label158: for (int var11 = 0; var11 < 4; var11++) {
                Statics.field3184 = class105.method3196("oldschool", var6, var11);
                if (!Statics.field3184.exists()) {
                    Statics.field3184.mkdirs();
                }
                File[] var12 = Statics.field3184.listFiles();
                if (var12 == null) {
                    break;
                }
                File[] var13 = var12;
                int var14 = 0;
                while (true) {
                    if (var14 >= var13.length) {
                        break label158;
                    }
                    File var15 = var13[var14];
                    if (!class105.method279(var15, false)) {
                        break;
                    }
                    var14++;
                }
            }
            File var16 = Statics.field3184;
            Statics.field1742 = var16;
            if (!Statics.field1742.exists()) {
                throw new RuntimeException("");
            }
            class108.field1748 = true;
            try {
                File var17 = new File(Statics.field725, "random.dat");
                if (var17.exists()) {
                    class105.field1696 = new class73(new class74(var17, "rw", 25L), 24, 0);
                } else {
                    label136: for (int var18 = 0; var18 < Statics.field3101.length; var18++) {
                        for (int var19 = 0; var19 < Statics.field1477.length; var19++) {
                            File var20 = new File(Statics.field1477[var19] + Statics.field3101[var18] + File.separatorChar + "random.dat");
                            if (var20.exists()) {
                                class105.field1696 = new class73(new class74(var20, "rw", 25L), 24, 0);
                                break label136;
                            }
                        }
                    }
                }
                if (class105.field1696 == null) {
                    RandomAccessFile var21 = new RandomAccessFile(var17, "rw");
                    int var22 = var21.read();
                    var21.seek(0L);
                    var21.write(var22);
                    var21.seek(0L);
                    var21.close();
                    class105.field1696 = new class73(new class74(var17, "rw", 25L), 24, 0);
                }
            } catch (IOException var29) {
            }
            class105.field1697 = new class73(new class74(class108.method1509("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class105.field1692 = new class73(new class74(class108.method1509("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1699 = new class73[Statics.field252];
            for (int var24 = 0; var24 < Statics.field252; var24++) {
                Statics.field1699[var24] = new class73(new class74(class108.method1509("main_file_cache.idx" + var24), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var30) {
            class102.method702((String) null, var30);
        }
        Statics.field309 = this;
        this.method2019(765, 503, 138);
    }

    @ObfuscatedName("cl.w(B)V")
    public static final void method1859() {
        class88.field1489 = false;
        field440 = false;
    }

    @ObfuscatedName("client.u(I)V")
    public final void method284() {
        Statics.field239 = field382 == 0 ? 43594 : field583 + 40000;
        Statics.field447 = field382 == 0 ? 443 : field583 + 50000;
        Statics.field1637 = Statics.field239;
        Statics.field2146 = class168.field2173;
        Statics.field63 = class168.field2171;
        Statics.field188 = class168.field2174;
        Statics.field1922 = class168.field2172;
        class106.method1855();
        Canvas var1 = Statics.field1844;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class106.field1719);
        var1.addFocusListener(class106.field1719);
        Canvas var2 = Statics.field1844;
        var2.addMouseListener(class116.field1809);
        var2.addMouseMotionListener(class116.field1809);
        var2.addFocusListener(class116.field1809);
        class107 var3;
        try {
            var3 = new class107();
        } catch (Throwable var15) {
            var3 = null;
        }
        Statics.field1576 = var3;
        if (Statics.field1576 != null) {
            Statics.field1576.method1971(Statics.field1844);
        }
        Statics.field191 = new class117(255, class105.field1697, class105.field1692, 500000);
        class74 var5 = null;
        class31 var6 = new class31();
        try {
            var5 = class105.method34("", Statics.field219.field2678, false);
            byte[] var7 = new byte[(int) var5.method1395()];
            int var9;
            for (int var8 = 0; var8 < var7.length; var8 += var9) {
                var9 = var5.method1391(var7, var8, var7.length - var8);
                if (var9 == -1) {
                    throw new IOException();
                }
            }
            var6 = new class31(new class154(var7));
        } catch (Exception var16) {
        }
        try {
            if (var5 != null) {
                var5.method1394();
            }
        } catch (Exception var14) {
        }
        Statics.field85 = var6;
        Statics.field609 = this.getToolkit().getSystemClipboard();
        class115.method2089(this, Statics.field778);
        if (field382 != 0) {
            field393 = true;
        }
        int var13 = Statics.field85.field716;
        field343 = 0L;
        if (var13 >= 2) {
            field528 = true;
        } else {
            field528 = false;
        }
        method236();
        if (field318 >= 25) {
            method887();
        }
        field1788 = true;
    }

    @ObfuscatedName("client.y(B)V")
    public final void method285() {
        field320++;
        this.method288();
        class184.method854();
        try {
            if (class139.field1921 == 1) {
                int var1 = Statics.field1920.method2373();
                if (var1 > 0 && Statics.field1920.method2379()) {
                    int var2 = var1 - Statics.field303;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field1920.method2403(var2);
                } else {
                    Statics.field1920.method2378();
                    Statics.field1920.method2438();
                    if (Statics.field1917 == null) {
                        class139.field1921 = 0;
                    } else {
                        class139.field1921 = 2;
                    }
                    Statics.field2680 = null;
                    Statics.field722 = null;
                }
            }
        } catch (Exception var87) {
            var87.printStackTrace();
            Statics.field1920.method2378();
            class139.field1921 = 0;
            Statics.field2680 = null;
            Statics.field722 = null;
            Statics.field1917 = null;
        }
        method927();
        class106.method1853();
        Statics.method223();
        if (Statics.field1576 != null) {
            int var4 = Statics.field1576.method1973();
            field512 = var4;
        }
        if (field318 == 0) {
            method2117();
            class114.method1929();
        } else if (field318 == 5) {
            class42.method2086(this);
            method2117();
            Statics.field2130.method1881();
            for (int var5 = 0; var5 < 32; var5++) {
                field1784[var5] = 0L;
            }
            for (int var6 = 0; var6 < 32; var6++) {
                field1785[var6] = 0L;
            }
            Statics.field1227 = 0;
        } else if (field318 == 10 || field318 == 11) {
            class42.method2086(this);
        } else if (field318 == 20) {
            class42.method2086(this);
            method942();
        } else if (field318 == 25) {
            method919(false);
            field390 = 0;
            boolean var7 = true;
            for (int var8 = 0; var8 < Statics.field243.length; var8++) {
                if (Statics.field267[var8] != -1 && Statics.field243[var8] == null) {
                    Statics.field243[var8] = Statics.field779.method3121(Statics.field267[var8], 0);
                    if (Statics.field243[var8] == null) {
                        var7 = false;
                        field390++;
                    }
                }
                if (Statics.field66[var8] != -1 && Statics.field2020[var8] == null) {
                    Statics.field2020[var8] = Statics.field779.method3099(Statics.field66[var8], 0, Statics.field53[var8]);
                    if (Statics.field2020[var8] == null) {
                        var7 = false;
                        field390++;
                    }
                }
            }
            if (var7) {
                field370 = 0;
                boolean var9 = true;
                for (int var10 = 0; var10 < Statics.field243.length; var10++) {
                    byte[] var11 = Statics.field2020[var10];
                    if (var11 != null) {
                        int var12 = (Statics.field719[var10] >> 8) * 64 - Statics.field791;
                        int var13 = (Statics.field719[var10] & 0xFF) * 64 - Statics.field37;
                        if (field543) {
                            var12 = 10;
                            var13 = 10;
                        }
                        var9 &= class11.method2850(var11, var12, var13);
                    }
                }
                if (var9) {
                    if (field372 != 0) {
                        method239(class174.field2354 + class38.field820 + class38.field810 + 100 + "%" + class38.field814, true);
                    }
                    method927();
                    method2605();
                    method927();
                    Statics.field171.method1810();
                    method927();
                    System.gc();
                    for (int var14 = 0; var14 < 4; var14++) {
                        field373[var14].method2146();
                    }
                    for (int var15 = 0; var15 < 4; var15++) {
                        for (int var16 = 0; var16 < 104; var16++) {
                            for (int var17 = 0; var17 < 104; var17++) {
                                class11.field123[var15][var16][var17] = 0;
                            }
                        }
                    }
                    method927();
                    class11.method2865();
                    int var18 = Statics.field243.length;
                    class32.method668();
                    method919(true);
                    if (!field543) {
                        for (int var19 = 0; var19 < var18; var19++) {
                            int var20 = (Statics.field719[var19] >> 8) * 64 - Statics.field791;
                            int var21 = (Statics.field719[var19] & 0xFF) * 64 - Statics.field37;
                            byte[] var22 = Statics.field243[var19];
                            if (var22 != null) {
                                method927();
                                class11.method802(var22, var20, var21, Statics.field1204 * 8 - 48, Statics.field1436 * 8 - 48, field373);
                            }
                        }
                        for (int var23 = 0; var23 < var18; var23++) {
                            int var24 = (Statics.field719[var23] >> 8) * 64 - Statics.field791;
                            int var25 = (Statics.field719[var23] & 0xFF) * 64 - Statics.field37;
                            byte[] var26 = Statics.field243[var23];
                            if (var26 == null && Statics.field1436 < 800) {
                                method927();
                                class11.method600(var24, var25, 64, 64);
                            }
                        }
                        method919(true);
                        for (int var27 = 0; var27 < var18; var27++) {
                            byte[] var28 = Statics.field2020[var27];
                            if (var28 != null) {
                                int var29 = (Statics.field719[var27] >> 8) * 64 - Statics.field791;
                                int var30 = (Statics.field719[var27] & 0xFF) * 64 - Statics.field37;
                                method927();
                                class11.method103(var28, var29, var30, Statics.field171, field373);
                            }
                        }
                    }
                    if (field543) {
                        int var31 = 0;
                        label403: while (true) {
                            if (var31 >= 4) {
                                for (int var63 = 0; var63 < 13; var63++) {
                                    for (int var64 = 0; var64 < 13; var64++) {
                                        int var65 = field313[0][var63][var64];
                                        if (var65 == -1) {
                                            class11.method600(var63 * 8, var64 * 8, 8, 8);
                                        }
                                    }
                                }
                                method919(true);
                                int var66 = 0;
                                while (true) {
                                    if (var66 >= 4) {
                                        break label403;
                                    }
                                    method927();
                                    for (int var67 = 0; var67 < 13; var67++) {
                                        for (int var68 = 0; var68 < 13; var68++) {
                                            int var69 = field313[var66][var67][var68];
                                            if (var69 != -1) {
                                                int var70 = var69 >> 24 & 0x3;
                                                int var71 = var69 >> 1 & 0x3;
                                                int var72 = var69 >> 14 & 0x3FF;
                                                int var73 = var69 >> 3 & 0x7FF;
                                                int var74 = (var72 / 8 << 8) + var73 / 8;
                                                for (int var75 = 0; var75 < Statics.field719.length; var75++) {
                                                    if (Statics.field719[var75] == var74 && Statics.field2020[var75] != null) {
                                                        class11.method2848(Statics.field2020[var75], var66, var67 * 8, var68 * 8, var70, (var72 & 0x7) * 8, (var73 & 0x7) * 8, var71, Statics.field171, field373);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var66++;
                                }
                            }
                            method927();
                            for (int var32 = 0; var32 < 13; var32++) {
                                for (int var33 = 0; var33 < 13; var33++) {
                                    boolean var34 = false;
                                    int var35 = field313[var31][var32][var33];
                                    if (var35 != -1) {
                                        int var36 = var35 >> 24 & 0x3;
                                        int var37 = var35 >> 1 & 0x3;
                                        int var38 = var35 >> 14 & 0x3FF;
                                        int var39 = var35 >> 3 & 0x7FF;
                                        int var40 = (var38 / 8 << 8) + var39 / 8;
                                        for (int var41 = 0; var41 < Statics.field719.length; var41++) {
                                            if (Statics.field719[var41] == var40 && Statics.field243[var41] != null) {
                                                byte[] var42 = Statics.field243[var41];
                                                int var43 = var32 * 8;
                                                int var44 = var33 * 8;
                                                int var45 = (var38 & 0x7) * 8;
                                                int var46 = (var39 & 0x7) * 8;
                                                class118[] var47 = field373;
                                                for (int var48 = 0; var48 < 8; var48++) {
                                                    for (int var49 = 0; var49 < 8; var49++) {
                                                        if (var43 + var48 > 0 && var43 + var48 < 103 && var44 + var49 > 0 && var44 + var49 < 103) {
                                                            var47[var31].field1842[var43 + var48][var44 + var49] &= 0xFEFFFFFF;
                                                        }
                                                    }
                                                }
                                                class154 var50 = new class154(var42);
                                                for (int var51 = 0; var51 < 4; var51++) {
                                                    for (int var52 = 0; var52 < 64; var52++) {
                                                        for (int var53 = 0; var53 < 64; var53++) {
                                                            if (var36 == var51 && var52 >= var45 && var52 < var45 + 8 && var53 >= var46 && var53 < var46 + 8) {
                                                                int var56 = var43 + class169.method1963(var52 & 0x7, var53 & 0x7, var37);
                                                                int var58 = var52 & 0x7;
                                                                int var59 = var53 & 0x7;
                                                                int var61 = var37 & 0x3;
                                                                int var62;
                                                                if (var61 == 0) {
                                                                    var62 = var59;
                                                                } else if (var61 == 1) {
                                                                    var62 = 7 - var58;
                                                                } else if (var61 == 2) {
                                                                    var62 = 7 - var59;
                                                                } else {
                                                                    var62 = var58;
                                                                }
                                                                class11.method3071(var50, var31, var56, var44 + var62, 0, 0, var37);
                                                            } else {
                                                                class11.method3071(var50, 0, -1, -1, 0, 0, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                                var34 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var34) {
                                        class11.method2606(var31, var32 * 8, var33 * 8);
                                    }
                                }
                            }
                            var31++;
                        }
                    }
                    method919(true);
                    method2605();
                    method927();
                    class11.method1858(Statics.field171, field373);
                    method919(true);
                    int var76 = class11.field108;
                    if (var76 > Statics.field744) {
                        var76 = Statics.field744;
                    }
                    if (var76 < Statics.field744 - 1) {
                        int var77 = Statics.field744 - 1;
                    }
                    if (field440) {
                        Statics.field171.method1815(class11.field108);
                    } else {
                        Statics.field171.method1815(0);
                    }
                    for (int var78 = 0; var78 < 104; var78++) {
                        for (int var79 = 0; var79 < 104; var79++) {
                            method56(var78, var79);
                        }
                    }
                    method927();
                    for (class26 var80 = (class26) field445.method2290(); var80 != null; var80 = (class26) field445.method2287()) {
                        if (var80.field597 == -1) {
                            var80.field607 = 0;
                            method690(var80);
                        } else {
                            var80.method2278();
                        }
                    }
                    class198.field2898.method2225();
                    if (Statics.field207 != null) {
                        field310.method2874(137);
                        field310.method2627(1057001181);
                    }
                    if (!field543) {
                        int var81 = (Statics.field1204 - 6) / 8;
                        int var82 = (Statics.field1204 + 6) / 8;
                        int var83 = (Statics.field1436 - 6) / 8;
                        int var84 = (Statics.field1436 + 6) / 8;
                        for (int var85 = var81 - 1; var85 <= var82 + 1; var85++) {
                            for (int var86 = var83 - 1; var86 <= var84 + 1; var86++) {
                                if (var85 < var81 || var85 > var82 || var86 < var83 || var86 > var84) {
                                    Statics.field779.method3095("m" + var85 + "_" + var86);
                                    Statics.field779.method3095("l" + var85 + "_" + var86);
                                }
                            }
                        }
                    }
                    method3241(30);
                    method927();
                    class11.method2990();
                    field310.method2874(60);
                    class114.method1929();
                } else {
                    field372 = 2;
                }
            } else {
                field372 = 1;
            }
        }
        if (field318 == 30) {
            method1937();
        } else if (field318 == 40 || field318 == 45) {
            method942();
        }
    }

    @ObfuscatedName("client.e(B)V")
    public final void method475() {
        boolean var1 = class139.method857();
        if (var1 && field553 && Statics.field2090 != null) {
            Statics.field2090.method1096();
        }
        if (field318 == 10 || field318 == 20 || field318 == 30) {
            if (field343 != 0L && class156.method1888() > field343) {
                int var2 = method197();
                field343 = 0L;
                if (var2 >= 2) {
                    field528 = true;
                } else {
                    field528 = false;
                }
                method236();
                if (field318 >= 25) {
                    method887();
                }
                field1788 = true;
            } else if (field1776) {
                method1873();
            }
        }
        Dimension var3 = this.method2059();
        if (Statics.field209 != var3.width || Statics.field2669 != var3.height || field1790) {
            method236();
            field343 = class156.method1888() + 500L;
            field1790 = false;
        }
        boolean var4 = false;
        if (field1788) {
            field1788 = false;
            var4 = true;
            for (int var5 = 0; var5 < 100; var5++) {
                field519[var5] = true;
            }
        }
        if (var4) {
            method1430();
        }
        if (field318 == 0) {
            int var6 = class42.field873;
            String var7 = class42.field867;
            Color var8 = null;
            try {
                Graphics var9 = Statics.field1844.getGraphics();
                if (Statics.field1644 == null) {
                    Statics.field1644 = new Font("Helvetica", 1, 13);
                    Statics.field1472 = Statics.field1844.getFontMetrics(Statics.field1644);
                }
                if (var4) {
                    var9.setColor(Color.black);
                    var9.fillRect(0, 0, Statics.field1749, Statics.field2019);
                }
                if (var8 == null) {
                    var8 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field2043 == null) {
                        Statics.field2043 = Statics.field1844.createImage(304, 34);
                    }
                    Graphics var10 = Statics.field2043.getGraphics();
                    var10.setColor(var8);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, var6 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(var6 * 3 + 2, 2, 300 - var6 * 3, 30);
                    var10.setFont(Statics.field1644);
                    var10.setColor(Color.white);
                    var10.drawString(var7, (304 - Statics.field1472.stringWidth(var7)) / 2, 22);
                    var9.drawImage(Statics.field2043, Statics.field1749 / 2 - 152, Statics.field2019 / 2 - 18, (ImageObserver) null);
                } catch (Exception var44) {
                    int var12 = Statics.field1749 / 2 - 152;
                    int var13 = Statics.field2019 / 2 - 18;
                    var9.setColor(var8);
                    var9.drawRect(var12, var13, 303, 33);
                    var9.fillRect(var12 + 2, var13 + 2, var6 * 3, 30);
                    var9.setColor(Color.black);
                    var9.drawRect(var12 + 1, var13 + 1, 301, 31);
                    var9.fillRect(var6 * 3 + var12 + 2, var13 + 2, 300 - var6 * 3, 30);
                    var9.setFont(Statics.field1644);
                    var9.setColor(Color.white);
                    var9.drawString(var7, var12 + (304 - Statics.field1472.stringWidth(var7)) / 2, var13 + 22);
                }
            } catch (Exception var45) {
                Statics.field1844.repaint();
            }
        } else if (field318 == 5) {
            class42.method2091(Statics.field3199, Statics.field728, Statics.field186, var4);
        } else if (field318 == 10 || field318 == 11) {
            class42.method2091(Statics.field3199, Statics.field728, Statics.field186, var4);
        } else if (field318 == 20) {
            class42.method2091(Statics.field3199, Statics.field728, Statics.field186, var4);
        } else if (field318 == 25) {
            if (field372 == 1) {
                if (field390 > field369) {
                    field369 = field390;
                }
                int var15 = (field369 * 50 - field390 * 50) / field369;
                method239(class174.field2354 + class38.field820 + class38.field810 + var15 + "%" + class38.field814, false);
            } else if (field372 == 2) {
                if (field370 > field454) {
                    field454 = field370;
                }
                int var16 = (field454 * 50 - field370 * 50) / field454 + 50;
                method239(class174.field2354 + class38.field820 + class38.field810 + var16 + "%" + class38.field814, false);
            } else {
                method239(class174.field2354, false);
            }
        } else if (field318 == 30) {
            if (field474 != -1) {
                Statics.method798(field474);
            }
            for (int var17 = 0; var17 < field312; var17++) {
                if (field519[var17]) {
                    field489[var17] = true;
                }
                field521[var17] = field519[var17];
                field519[var17] = false;
            }
            field518 = field320;
            field463 = -1;
            field468 = -1;
            Statics.field39 = null;
            if (field474 != -1) {
                field312 = 0;
                method3621(field474, 0, 0, Statics.field1749, Statics.field2019, 0, 0, -1);
            }
            class220.method3776();
            if (field452) {
                int var22 = Statics.field4;
                int var23 = Statics.field149;
                int var24 = Statics.field1733;
                int var25 = Statics.field3041;
                int var26 = 6116423;
                class220.method3807(var22, var23, var24, var25, var26);
                class220.method3807(var22 + 1, var23 + 1, var24 - 2, 16, 0);
                class220.method3789(var22 + 1, var23 + 18, var24 - 2, var25 - 19, 0);
                Statics.field3199.method3668(class174.field2495, var22 + 3, var23 + 14, var26, -1);
                int var27 = class116.field1808;
                int var28 = class116.field1802 * 1476935015;
                for (int var29 = 0; var29 < field453; var29++) {
                    int var30 = (field453 - 1 - var29) * 15 + var23 + 31;
                    int var31 = 16777215;
                    if (var27 > var22 && var27 < var22 + var24 && var28 > var30 - 13 && var28 < var30 + 3) {
                        var31 = 16776960;
                    }
                    Statics.field3199.method3668(method270(var29), var22 + 3, var30, var31, 0);
                }
                int var32 = Statics.field4;
                int var33 = Statics.field149;
                int var34 = Statics.field1733;
                int var35 = Statics.field3041;
                for (int var36 = 0; var36 < field312; var36++) {
                    if (field524[var36] + field316[var36] > var32 && field316[var36] < var32 + var34 && field520[var36] + field412[var36] > var33 && field412[var36] < var33 + var35) {
                        field489[var36] = true;
                    }
                }
            } else if (field463 != -1) {
                int var18 = field463;
                int var19 = field468;
                if (field453 >= 2 || field467 != 0 || field469) {
                    int var20 = method2572();
                    String var21;
                    if (field467 == 1 && field453 < 2) {
                        var21 = class174.field2492 + class174.field2502 + field497 + " " + class38.field815;
                    } else if (field469 && field453 < 2) {
                        var21 = field490 + class174.field2502 + field473 + " " + class38.field815;
                    } else {
                        var21 = method270(var20);
                    }
                    if (field453 > 2) {
                        var21 = var21 + class38.method2134(16777215) + " " + '/' + " " + (field453 - 2) + class174.field2496;
                    }
                    Statics.field3199.method3676(var21, var18 + 4, var19 + 15, 16777215, 0, field320 / 1000);
                }
            }
            if (field526 == 3) {
                for (int var37 = 0; var37 < field312; var37++) {
                    if (field521[var37]) {
                        class220.method3782(field316[var37], field412[var37], field524[var37], field520[var37], 16711935, 128);
                    } else if (field489[var37]) {
                        class220.method3782(field316[var37], field412[var37], field524[var37], field520[var37], 16711680, 128);
                    }
                }
            }
            class32.method3093(Statics.field744, Statics.field266.field675, Statics.field266.field627, field329);
            field329 = 0;
        } else if (field318 == 40) {
            method239(class174.field2507 + class38.field820 + class174.field2565, false);
        } else if (field318 == 45) {
            method239(class174.field2500, false);
        }
        if (field318 == 30 && field526 == 0 && !var4) {
            try {
                Graphics var38 = Statics.field1844.getGraphics();
                for (int var39 = 0; var39 < field312; var39++) {
                    if (field489[var39]) {
                        Statics.field1580.method3773(var38, field316[var39], field412[var39], field524[var39], field520[var39]);
                        field489[var39] = false;
                    }
                }
            } catch (Exception var47) {
                Statics.field1844.repaint();
            }
        } else if (field318 > 0) {
            try {
                Graphics var41 = Statics.field1844.getGraphics();
                Statics.field1580.method3765(var41, 0, 0);
                for (int var42 = 0; var42 < field312; var42++) {
                    field489[var42] = false;
                }
            } catch (Exception var46) {
                Statics.field1844.repaint();
            }
        }
    }

    @ObfuscatedName("client.q(B)V")
    public final void method287() {
        if (Statics.field73.method916()) {
            Statics.field73.method898();
        }
        if (Statics.field322 != null) {
            Statics.field322.field250 = false;
        }
        Statics.field322 = null;
        if (Statics.field16 != null) {
            Statics.field16.method1991();
            Statics.field16 = null;
        }
        class106.method1432();
        if (class116.field1809 != null) {
            class116 var1 = class116.field1809;
            synchronized (class116.field1809) {
                class116.field1809 = null;
            }
        }
        Statics.field1576 = null;
        if (Statics.field2090 != null) {
            Statics.field2090.method1097();
        }
        if (Statics.field1978 != null) {
            Statics.field1978.method1097();
        }
        if (Statics.field2749 != null) {
            Statics.field2749.method1991();
        }
        class184.method208();
        try {
            class105.field1697.method1359();
            for (int var3 = 0; var3 < Statics.field252; var3++) {
                Statics.field1699[var3].method1359();
            }
            class105.field1692.method1359();
            class105.field1696.method1359();
        } catch (Exception var6) {
        }
    }

    @ObfuscatedName("gu.v(II)V")
    public static void method3241(int arg0) {
        if (field318 == arg0) {
            return;
        }
        if (field318 == 0) {
            Statics.field2043 = null;
            Statics.field1644 = null;
            Statics.field1472 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field572 = 0;
            field472 = 0;
            field566 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field89 != null) {
            Statics.field89.method1991();
            Statics.field89 = null;
        }
        if (field318 == 25) {
            field372 = 0;
            field390 = 0;
            field369 = 1;
            field370 = 0;
            field454 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class42.method1949(Statics.field1844, Statics.field1656, Statics.field3, true, 0);
        } else if (arg0 == 20) {
            class42.method1949(Statics.field1844, Statics.field1656, Statics.field3, true, field318 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class42.method1949(Statics.field1844, Statics.field1656, Statics.field3, false, 4);
        } else {
            class42.method214();
        }
        field318 = arg0;
    }

    @ObfuscatedName("client.l(I)V")
    public void method288() {
        if (field318 == 1000) {
            return;
        }
        long var1 = class156.method1888();
        int var3 = (int) (var1 - Statics.field2743);
        Statics.field2743 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class186.field2742 += var3;
        boolean var4;
        if (class186.field2752 == 0 && class186.field2760 == 0 && class186.field2750 == 0 && class186.field2745 == 0) {
            var4 = true;
        } else if (Statics.field2749 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class186.field2742 > 30000) {
                        throw new IOException();
                    }
                    while (class186.field2760 < 20 && class186.field2745 > 0) {
                        class182 var5 = (class182) class186.field2744.method2233();
                        class154 var6 = new class154(4);
                        var6.method2651(1);
                        var6.method2626((int) var5.field1885);
                        Statics.field2749.method1993(var6.field2091, 0, 4);
                        class186.field2746.method2245(var5, var5.field1885);
                        class186.field2745--;
                        class186.field2760++;
                    }
                    while (class186.field2752 < 20 && class186.field2750 > 0) {
                        class182 var7 = (class182) class186.field2748.method2176();
                        class154 var8 = new class154(4);
                        var8.method2651(0);
                        var8.method2626((int) var7.field1885);
                        Statics.field2749.method1993(var8.field2091, 0, 4);
                        var7.method2318();
                        class186.field2751.method2245(var7, var7.field1885);
                        class186.field2750--;
                        class186.field2752++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2749.method1992();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class186.field2742 = 0;
                        byte var11 = 0;
                        if (Statics.field2809 == null) {
                            var11 = 8;
                        } else if (class186.field2754 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class186.field2753.field2086;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2749.method1995(class186.field2753.field2091, class186.field2753.field2086, var12);
                            if (class186.field2757 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class186.field2753.field2091[class186.field2753.field2086 + var13] ^= class186.field2757;
                                }
                            }
                            class186.field2753.field2086 += var12;
                            if (class186.field2753.field2086 < var11) {
                                break;
                            }
                            if (Statics.field2809 == null) {
                                class186.field2753.field2086 = 0;
                                int var14 = class186.field2753.method2701();
                                int var15 = class186.field2753.method2745();
                                int var16 = class186.field2753.method2701();
                                int var17 = class186.field2753.method2644();
                                long var18 = (long) ((var14 << 16) + var15);
                                class182 var20 = (class182) class186.field2746.method2247(var18);
                                Statics.field2148 = true;
                                if (var20 == null) {
                                    var20 = (class182) class186.field2751.method2247(var18);
                                    Statics.field2148 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2809 = var20;
                                Statics.field1197 = new class154(var17 + var21 + Statics.field2809.field2695);
                                Statics.field1197.method2651(var16);
                                Statics.field1197.method2627(var17);
                                class186.field2754 = 8;
                                class186.field2753.field2086 = 0;
                            } else if (class186.field2754 == 0) {
                                if (class186.field2753.field2091[0] == -1) {
                                    class186.field2754 = 1;
                                    class186.field2753.field2086 = 0;
                                } else {
                                    Statics.field2809 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field1197.field2091.length - Statics.field2809.field2695;
                            int var23 = 512 - class186.field2754;
                            if (var23 > var22 - Statics.field1197.field2086) {
                                var23 = var22 - Statics.field1197.field2086;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2749.method1995(Statics.field1197.field2091, Statics.field1197.field2086, var23);
                            if (class186.field2757 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field1197.field2091[Statics.field1197.field2086 + var24] ^= class186.field2757;
                                }
                            }
                            Statics.field1197.field2086 += var23;
                            class186.field2754 += var23;
                            if (Statics.field1197.field2086 == var22) {
                                if (Statics.field2809.field1885 == 16711935L) {
                                    Statics.field3183 = Statics.field1197;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class185 var26 = class186.field2756[var25];
                                        if (var26 != null) {
                                            Statics.field3183.field2086 = var25 * 8 + 5;
                                            int var27 = Statics.field3183.method2644();
                                            int var28 = Statics.field3183.method2644();
                                            var26.method3199(var27, var28);
                                        }
                                    }
                                } else {
                                    class186.field2741.reset();
                                    class186.field2741.update(Statics.field1197.field2091, 0, var22);
                                    int var29 = (int) class186.field2741.getValue();
                                    if (Statics.field2809.field2693 != var29) {
                                        try {
                                            Statics.field2749.method1991();
                                        } catch (Exception var35) {
                                        }
                                        class186.field2747++;
                                        Statics.field2749 = null;
                                        class186.field2757 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class186.field2747 = 0;
                                    class186.field2759 = 0;
                                    Statics.field2809.field2696.method3200((int) (Statics.field2809.field1885 & 0xFFFFL), Statics.field1197.field2091, (Statics.field2809.field1885 & 0xFF0000L) == 16711680L, Statics.field2148);
                                }
                                Statics.field2809.method2278();
                                if (Statics.field2148) {
                                    class186.field2760--;
                                } else {
                                    class186.field2752--;
                                }
                                class186.field2754 = 0;
                                Statics.field2809 = null;
                                Statics.field1197 = null;
                            } else {
                                if (class186.field2754 != 512) {
                                    break;
                                }
                                class186.field2754 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2749.method1991();
                } catch (Exception var34) {
                }
                class186.field2759++;
                Statics.field2749 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method591();
        }
    }

    @ObfuscatedName("client.s(I)V")
    public void method591() {
        if (class186.field2747 >= 4) {
            this.method2027("js5crc");
            field318 = 1000;
            return;
        }
        if (class186.field2759 >= 4) {
            if (field318 <= 5) {
                this.method2027("js5io");
                field318 = 1000;
                return;
            }
            field341 = 3000;
            class186.field2759 = 3;
        }
        if (--field341 + 1 > 0) {
            return;
        }
        try {
            if (field493 == 0) {
                Statics.field1201 = Statics.field1194.method1905(Statics.field1567, Statics.field1637);
                field493++;
            }
            if (field493 == 1) {
                if (Statics.field1201.field1674 == 2) {
                    this.method290(-1);
                    return;
                }
                if (Statics.field1201.field1674 == 1) {
                    field493++;
                }
            }
            if (field493 == 2) {
                Statics.field910 = new class111((Socket) Statics.field1201.field1678, Statics.field1194);
                class154 var1 = new class154(5);
                var1.method2651(15);
                var1.method2627(138);
                Statics.field910.method1993(var1.field2091, 0, 5);
                field493++;
                Statics.field64 = class156.method1888();
            }
            if (field493 == 3) {
                if (field318 <= 5 || Statics.field910.method1992() > 0) {
                    int var2 = Statics.field910.method1994();
                    if (var2 != 0) {
                        this.method290(var2);
                        return;
                    }
                    field493++;
                } else if (class156.method1888() - Statics.field64 > 30000L) {
                    this.method290(-2);
                    return;
                }
            }
            if (field493 == 4) {
                class186.method2568(Statics.field910, field318 > 20);
                Statics.field1201 = null;
                Statics.field910 = null;
                field493 = 0;
                field344 = 0;
            }
        } catch (IOException var4) {
            this.method290(-3);
        }
    }

    @ObfuscatedName("client.r(IB)V")
    public void method290(int arg0) {
        Statics.field1201 = null;
        Statics.field910 = null;
        field493 = 0;
        if (Statics.field239 == Statics.field1637) {
            Statics.field1637 = Statics.field447;
        } else {
            Statics.field1637 = Statics.field239;
        }
        field344++;
        if (field344 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field318 <= 5) {
                this.method2027("js5connect_full");
                field318 = 1000;
            } else {
                field341 = 3000;
            }
        } else if (field344 >= 2 && arg0 == 6) {
            this.method2027("js5connect_outofdate");
            field318 = 1000;
        } else if (field344 >= 4) {
            if (field318 <= 5) {
                this.method2027("js5connect");
                field318 = 1000;
            } else {
                field341 = 3000;
            }
        }
    }

    @ObfuscatedName("dk.m(B)V")
    public static void method2117() {
        if (field339 == 0) {
            Statics.field171 = new class88(4, 104, 104, class11.field131);
            for (int var0 = 0; var0 < 4; var0++) {
                field373[var0] = new class118(104, 104);
            }
            Statics.field686 = new class225(512, 512);
            class42.field867 = class174.field2357;
            class42.field873 = 5;
            field339 = 20;
        } else if (field339 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class85.field1442[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class88.method1703(var1, 500, 800, 512, 334);
            class42.field867 = class174.field2512;
            class42.field873 = 10;
            field339 = 30;
        } else if (field339 == 30) {
            Statics.field342 = method3062(0, false, true, true);
            Statics.field2812 = method3062(1, false, true, true);
            Statics.field28 = method3062(2, true, false, true);
            Statics.field1766 = method3062(3, false, true, true);
            Statics.field2779 = method3062(4, false, true, true);
            Statics.field779 = method3062(5, true, true, true);
            Statics.field40 = method3062(6, true, true, false);
            Statics.field2860 = method3062(7, false, true, true);
            Statics.field3 = method3062(8, false, true, true);
            Statics.field2826 = method3062(9, false, true, true);
            Statics.field1656 = method3062(10, false, true, true);
            Statics.field13 = method3062(11, false, true, true);
            Statics.field1764 = method3062(12, false, true, true);
            Statics.field1966 = method3062(13, true, false, true);
            Statics.field821 = method3062(14, false, true, false);
            Statics.field461 = method3062(15, false, true, true);
            class42.field867 = class174.field2359;
            class42.field873 = 20;
            field339 = 40;
        } else if (field339 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field342.method3198() * 4 / 100;
            int var8 = var7 + Statics.field2812.method3198() * 4 / 100;
            int var9 = var8 + Statics.field28.method3198() * 2 / 100;
            int var10 = var9 + Statics.field1766.method3198() * 2 / 100;
            int var11 = var10 + Statics.field2779.method3198() * 6 / 100;
            int var12 = var11 + Statics.field779.method3198() * 4 / 100;
            int var13 = var12 + Statics.field40.method3198() * 2 / 100;
            int var14 = var13 + Statics.field2860.method3198() * 60 / 100;
            int var15 = var14 + Statics.field3.method3198() * 2 / 100;
            int var16 = var15 + Statics.field2826.method3198() * 2 / 100;
            int var17 = var16 + Statics.field1656.method3198() * 2 / 100;
            int var18 = var17 + Statics.field13.method3198() * 2 / 100;
            int var19 = var18 + Statics.field1764.method3198() * 2 / 100;
            int var20 = var19 + Statics.field1966.method3198() * 2 / 100;
            int var21 = var20 + Statics.field821.method3198() * 2 / 100;
            int var22 = var21 + Statics.field461.method3198() * 2 / 100;
            if (var22 == 100) {
                class42.field867 = class174.field2361;
                class42.field873 = 30;
                field339 = 45;
            } else {
                if (var22 != 0) {
                    class42.field867 = class174.field2360 + var22 + "%";
                }
                class42.field873 = 30;
            }
        } else if (field339 == 45) {
            boolean var23 = !field440;
            Statics.field2034 = 22050;
            Statics.field1059 = var23;
            Statics.field1052 = 2;
            class140 var24 = new class140();
            var24.method2380(9, 128);
            Statics.field2090 = class58.method754(Statics.field1194, Statics.field1844, 0, 22050);
            Statics.field2090.method1127(var24);
            class185 var25 = Statics.field461;
            class185 var26 = Statics.field821;
            class185 var27 = Statics.field2779;
            Statics.field1925 = var25;
            Statics.field1918 = var26;
            Statics.field1919 = var27;
            Statics.field1920 = var24;
            Statics.field1978 = class58.method754(Statics.field1194, Statics.field1844, 1, 2048);
            Statics.field2864 = new class52();
            Statics.field1978.method1127(Statics.field2864);
            Statics.field1225 = new class66(22050, Statics.field2034);
            class42.field867 = class174.field2362;
            class42.field873 = 35;
            field339 = 50;
        } else if (field339 == 50) {
            int var28 = 0;
            if (Statics.field728 == null) {
                Statics.field728 = class226.method3354(Statics.field3, Statics.field1966, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field186 == null) {
                Statics.field186 = class226.method3354(Statics.field3, Statics.field1966, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field3199 == null) {
                Statics.field3199 = class226.method3354(Statics.field3, Statics.field1966, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class42.field867 = class174.field2363 + var28 * 100 / 3 + "%";
                class42.field873 = 40;
            } else {
                Statics.field76 = new class231(true);
                class42.field867 = class174.field2364;
                class42.field873 = 40;
                field339 = 60;
            }
        } else if (field339 == 60) {
            int var29 = class42.method3251(Statics.field1656, Statics.field3);
            byte var30 = 9;
            if (var29 < var30) {
                class42.field867 = class174.field2501 + var29 * 100 / var30 + "%";
                class42.field873 = 50;
            } else {
                class42.field867 = class174.field2558;
                class42.field873 = 50;
                method3241(5);
                field339 = 70;
            }
        } else if (field339 == 70) {
            if (Statics.field28.method3102()) {
                class201.method2571(Statics.field28);
                class185 var32 = Statics.field28;
                Statics.field2807 = var32;
                class193.method670(Statics.field28, Statics.field2860);
                class185 var33 = Statics.field28;
                class185 var34 = Statics.field2860;
                boolean var35 = field440;
                Statics.field2941 = var33;
                Statics.field2896 = var34;
                class198.field2904 = var35;
                class200.method3091(Statics.field28, Statics.field2860);
                class199.method868(Statics.field28, Statics.field2860, field314, Statics.field728);
                class202.method1878(Statics.field28, Statics.field342, Statics.field2812);
                class191.method3529(Statics.field28, Statics.field2860);
                class195.method1890(Statics.field28);
                class188.method3762(Statics.field28);
                class185 var36 = Statics.field1766;
                class185 var37 = Statics.field2860;
                class185 var38 = Statics.field3;
                class185 var39 = Statics.field1966;
                Statics.field2270 = var36;
                Statics.field91 = var37;
                Statics.field2260 = var38;
                Statics.field1575 = var39;
                Statics.field2223 = new class170[Statics.field2270.method3109()][];
                Statics.field794 = new boolean[Statics.field2270.method3109()];
                class187.method2918(Statics.field28);
                class185 var40 = Statics.field28;
                Statics.field2851 = var40;
                class185 var41 = Statics.field28;
                Statics.field2776 = var41;
                Statics.method3090(Statics.field28);
                Statics.field73 = new class47();
                class185 var42 = Statics.field28;
                class185 var43 = Statics.field3;
                class185 var44 = Statics.field1966;
                Statics.field2884 = var42;
                Statics.field2866 = var43;
                Statics.field2888 = var44;
                class185 var45 = Statics.field28;
                class185 var46 = Statics.field3;
                Statics.field2828 = var45;
                Statics.field2827 = var46;
                class42.field867 = class174.field2368;
                class42.field873 = 60;
                field339 = 80;
            } else {
                class42.field867 = class174.field2367 + Statics.field28.method3207() + "%";
                class42.field873 = 60;
            }
        } else if (field339 == 80) {
            int var47 = 0;
            if (Statics.field194 == null) {
                class185 var48 = Statics.field3;
                int var49 = var48.method3113("compass");
                int var50 = var48.method3114(var49, "");
                class225 var51 = class226.method1887(var48, var49, var50);
                Statics.field194 = var51;
            } else {
                var47++;
            }
            if (Statics.field1584 == null) {
                class185 var52 = Statics.field3;
                int var53 = var52.method3113("mapedge");
                int var54 = var52.method3114(var53, "");
                class225 var55 = class226.method1887(var52, var53, var54);
                Statics.field1584 = var55;
            } else {
                var47++;
            }
            if (Statics.field1117 == null) {
                Statics.field1117 = class226.method16(Statics.field3, "mapscene", "");
            } else {
                var47++;
            }
            if (Statics.field2336 == null) {
                Statics.field2336 = class226.method2540(Statics.field3, "mapfunction", "");
            } else {
                var47++;
            }
            if (Statics.field195 == null) {
                Statics.field195 = class226.method2540(Statics.field3, "headicons_pk", "");
            } else {
                var47++;
            }
            if (Statics.field2038 == null) {
                Statics.field2038 = class226.method2540(Statics.field3, "headicons_prayer", "");
            } else {
                var47++;
            }
            if (Statics.field190 == null) {
                Statics.field190 = class226.method2540(Statics.field3, "headicons_hint", "");
            } else {
                var47++;
            }
            if (Statics.field130 == null) {
                Statics.field130 = class226.method2540(Statics.field3, "mapmarker", "");
            } else {
                var47++;
            }
            if (Statics.field450 == null) {
                Statics.field450 = class226.method2540(Statics.field3, "cross", "");
            } else {
                var47++;
            }
            if (Statics.field1224 == null) {
                Statics.field1224 = class226.method2540(Statics.field3, "mapdots", "");
            } else {
                var47++;
            }
            if (Statics.field1310 == null) {
                Statics.field1310 = class226.method16(Statics.field3, "scrollbar", "");
            } else {
                var47++;
            }
            if (Statics.field2801 == null) {
                Statics.field2801 = class226.method16(Statics.field3, "mod_icons", "");
            } else {
                var47++;
            }
            if (var47 < 12) {
                class42.field867 = class174.field2365 + var47 * 100 / 12 + "%";
                class42.field873 = 70;
            } else {
                Statics.field3117 = Statics.field2801;
                Statics.field1584.method3938();
                int var56 = (int) (Math.random() * 21.0D) - 10;
                int var57 = (int) (Math.random() * 21.0D) - 10;
                int var58 = (int) (Math.random() * 21.0D) - 10;
                int var59 = (int) (Math.random() * 41.0D) - 20;
                for (int var60 = 0; var60 < Statics.field2336.length; var60++) {
                    Statics.field2336[var60].method3972(var56 + var59, var57 + var59, var58 + var59);
                }
                Statics.field1117[0].method3854(var56 + var59, var57 + var59, var58 + var59);
                class42.field867 = class174.field2366;
                class42.field873 = 70;
                field339 = 90;
            }
        } else if (field339 == 90) {
            if (Statics.field2826.method3102()) {
                class75 var61 = new class75(Statics.field2826, Statics.field3, 20, 0.8D, field440 ? 64 : 128);
                class85.method1613(var61);
                class85.method1632(0.8D);
                class42.field867 = class174.field2372;
                class42.field873 = 90;
                field339 = 110;
            } else {
                class42.field867 = class174.field2371 + Statics.field2826.method3207() + "%";
                class42.field873 = 90;
            }
        } else if (field339 == 110) {
            Statics.field322 = new class21();
            Statics.field1194.method1906(Statics.field322, 10);
            class42.field867 = class174.field2373;
            class42.field873 = 94;
            field339 = 120;
        } else if (field339 == 120) {
            if (Statics.field1656.method3116("huffman", "")) {
                class146 var62 = new class146(Statics.field1656.method3115("huffman", ""));
                class211.method2483(var62);
                class42.field867 = class174.field2617;
                class42.field873 = 96;
                field339 = 130;
            } else {
                class42.field867 = class174.field2374 + "%";
                class42.field873 = 96;
            }
        } else if (field339 == 130) {
            if (!Statics.field1766.method3102()) {
                class42.field867 = class174.field2376 + Statics.field1766.method3207() * 4 / 5 + "%";
                class42.field873 = 100;
            } else if (!Statics.field1764.method3102()) {
                class42.field867 = class174.field2376 + (80 + Statics.field1764.method3207() / 6) + "%";
                class42.field873 = 100;
            } else if (Statics.field1966.method3102()) {
                class42.field867 = class174.field2381;
                class42.field873 = 100;
                field339 = 140;
            } else {
                class42.field867 = class174.field2376 + (96 + Statics.field1966.method3207() / 20) + "%";
                class42.field873 = 100;
            }
        } else if (field339 == 140) {
            method3241(10);
        }
    }

    @ObfuscatedName("fm.i(IZZZI)Lgn;")
    public static class185 method3062(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class117 var4 = null;
        if (class105.field1697 != null) {
            var4 = new class117(arg0, class105.field1697, Statics.field1699[arg0], 1000000);
        }
        return new class185(var4, Statics.field191, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("al.f(I)V")
    public static final void method942() {
        try {
            if (field572 == 0) {
                if (Statics.field16 != null) {
                    Statics.field16.method1991();
                    Statics.field16 = null;
                }
                Statics.field214 = null;
                field588 = false;
                field472 = 0;
                field572 = 1;
            }
            if (field572 == 1) {
                if (Statics.field214 == null) {
                    Statics.field214 = Statics.field1194.method1905(Statics.field1567, Statics.field1637);
                }
                if (Statics.field214.field1674 == 2) {
                    throw new IOException();
                }
                if (Statics.field214.field1674 == 1) {
                    Statics.field16 = new class111((Socket) Statics.field214.field1678, Statics.field1194);
                    Statics.field214 = null;
                    field572 = 2;
                }
            }
            if (field572 == 2) {
                field310.field2086 = 0;
                field310.method2651(14);
                Statics.field16.method1993(field310.field2091, 0, 1);
                field358.field2086 = 0;
                field572 = 3;
            }
            if (field572 == 3) {
                if (Statics.field2090 != null) {
                    Statics.field2090.method1095();
                }
                if (Statics.field1978 != null) {
                    Statics.field1978.method1095();
                }
                int var0 = Statics.field16.method1994();
                if (Statics.field2090 != null) {
                    Statics.field2090.method1095();
                }
                if (Statics.field1978 != null) {
                    Statics.field1978.method1095();
                }
                if (var0 != 0) {
                    method106(var0);
                    return;
                }
                field358.field2086 = 0;
                field572 = 4;
            }
            if (field572 == 4) {
                if (field358.field2086 < 8) {
                    int var1 = Statics.field16.method1992();
                    if (var1 > 8 - field358.field2086) {
                        var1 = 8 - field358.field2086;
                    }
                    if (var1 > 0) {
                        Statics.field16.method1995(field358.field2091, field358.field2086, var1);
                        field358.field2086 += var1;
                    }
                }
                if (field358.field2086 == 8) {
                    field358.field2086 = 0;
                    Statics.field217 = field358.method2645();
                    field572 = 5;
                }
            }
            if (field572 == 5) {
                int[] var2 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field217 >> 32), (int) (Statics.field217 & 0xFFFFFFFFFFFFFFFFL) };
                field310.field2086 = 0;
                field310.method2651(1);
                field310.method2651(class42.field875.method809());
                field310.method2627(var2[0]);
                field310.method2627(var2[1]);
                field310.method2627(var2[2]);
                field310.method2627(var2[3]);
                switch(class42.field875.field1643) {
                    case 0:
                        field310.method2627((Integer) Statics.field85.field723.get(class208.method2622(class42.field865)));
                        field310.field2086 += 4;
                        break;
                    case 1:
                    case 2:
                        field310.method2626(Statics.field782);
                        field310.field2086 += 5;
                        break;
                    case 3:
                        field310.field2086 += 8;
                }
                field310.method2630(class42.field874);
                field310.method2660(class40.field834, class40.field835);
                field357.field2086 = 0;
                if (field318 == 40) {
                    field357.method2651(18);
                } else {
                    field357.method2651(16);
                }
                field357.method2625(0);
                int var3 = field357.field2086;
                field357.method2627(138);
                field357.method2633(field310.field2091, 0, field310.field2086);
                int var4 = field357.field2086;
                field357.method2630(class42.field865);
                field357.method2651((field528 ? 1 : 0) << 1 | (field440 ? 1 : 0));
                field357.method2625(Statics.field1749);
                field357.method2625(Statics.field2019);
                class160 var5 = field357;
                if (field350 == null) {
                    byte[] var6 = new byte[24];
                    try {
                        class105.field1696.method1361(0L);
                        class105.field1696.method1363(var6);
                        int var7;
                        for (var7 = 0; var7 < 24 && var6[var7] == 0; var7++) {
                        }
                        if (var7 >= 24) {
                            throw new IOException();
                        }
                    } catch (Exception var35) {
                        for (int var9 = 0; var9 < 24; var9++) {
                            var6[var9] = -1;
                        }
                    }
                    var5.method2633(var6, 0, var6.length);
                } else {
                    var5.method2633(field350, 0, field350.length);
                }
                field357.method2630(Statics.field2667);
                field357.method2627(Statics.field317);
                class154 var12 = new class154(Statics.field76.method4047());
                Statics.field76.method4046(var12);
                field357.method2633(var12.field2091, 0, var12.field2091.length);
                field357.method2651(Statics.field612);
                field357.method2627(0);
                field357.method2627(Statics.field342.field2712);
                field357.method2627(Statics.field2812.field2712);
                field357.method2627(Statics.field28.field2712);
                field357.method2627(Statics.field1766.field2712);
                field357.method2627(Statics.field2779.field2712);
                field357.method2627(Statics.field779.field2712);
                field357.method2627(Statics.field40.field2712);
                field357.method2627(Statics.field2860.field2712);
                field357.method2627(Statics.field3.field2712);
                field357.method2627(Statics.field2826.field2712);
                field357.method2627(Statics.field1656.field2712);
                field357.method2627(Statics.field13.field2712);
                field357.method2627(Statics.field1764.field2712);
                field357.method2627(Statics.field1966.field2712);
                field357.method2627(Statics.field821.field2712);
                field357.method2627(Statics.field461.field2712);
                field357.method2658(var2, var4, field357.field2086);
                field357.method2753(field357.field2086 - var3);
                Statics.field16.method1993(field357.field2091, 0, field357.field2086);
                field310.method2888(var2);
                for (int var13 = 0; var13 < 4; var13++) {
                    var2[var13] += 50;
                }
                field358.method2888(var2);
                field572 = 6;
            }
            if (field572 == 6 && Statics.field16.method1992() > 0) {
                int var14 = Statics.field16.method1994();
                if (var14 == 21 && field318 == 20) {
                    field572 = 7;
                } else if (var14 == 2) {
                    field572 = 9;
                } else if (var14 == 15 && field318 == 40) {
                    field359 = -1;
                    field572 = 13;
                } else if (var14 == 23 && field566 < 1) {
                    field566++;
                    field572 = 0;
                } else if (var14 == 29) {
                    field572 = 11;
                } else {
                    method106(var14);
                    return;
                }
            }
            if (field572 == 7 && Statics.field16.method1992() > 0) {
                field348 = (Statics.field16.method1994() + 3) * 60;
                field572 = 8;
            }
            if (field572 == 8) {
                field472 = 0;
                class42.method68(class174.field2586, class174.field2382, field348 / 60 + class174.field2383);
                if (--field348 <= 0) {
                    field572 = 0;
                }
            } else {
                if (field572 == 9 && Statics.field16.method1992() >= 13) {
                    boolean var15 = Statics.field16.method1994() == 1;
                    Statics.field16.method1995(field358.field2091, 0, 4);
                    field358.field2086 = 0;
                    boolean var16 = false;
                    if (var15) {
                        int var17 = field358.method2877() << 24;
                        int var18 = var17 | field358.method2877() << 16;
                        int var19 = var18 | field358.method2877() << 8;
                        int var20 = var19 | field358.method2877();
                        int var21 = class208.method2622(class42.field865);
                        if (Statics.field85.field723.size() >= 10 && !Statics.field85.field723.containsKey(var21)) {
                            Iterator var22 = Statics.field85.field723.entrySet().iterator();
                            var22.next();
                            var22.remove();
                        }
                        Statics.field85.field723.put(var21, var20);
                        class31.method11();
                    }
                    field481 = Statics.field16.method1994();
                    field483 = Statics.field16.method1994() == 1;
                    field435 = Statics.field16.method1994();
                    field435 <<= 0x8;
                    field435 += Statics.field16.method1994();
                    field530 = Statics.field16.method1994();
                    Statics.field16.method1995(field358.field2091, 0, 1);
                    field358.field2086 = 0;
                    field360 = field358.method2877();
                    Statics.field16.method1995(field358.field2091, 0, 2);
                    field358.field2086 = 0;
                    field359 = field358.method2745();
                    try {
                        client var23 = Statics.field309;
                        JSObject.getWindow(var23).call("zap", (Object[]) null);
                    } catch (Throwable var34) {
                    }
                    field572 = 10;
                }
                if (field572 != 10) {
                    if (field572 == 11 && Statics.field16.method1992() >= 2) {
                        field358.field2086 = 0;
                        Statics.field16.method1995(field358.field2091, 0, 2);
                        field358.field2086 = 0;
                        Statics.field1202 = field358.method2745();
                        field572 = 12;
                    }
                    if (field572 == 12 && Statics.field16.method1992() >= Statics.field1202) {
                        field358.field2086 = 0;
                        Statics.field16.method1995(field358.field2091, 0, Statics.field1202);
                        field358.field2086 = 0;
                        String var25 = field358.method2699();
                        String var26 = field358.method2699();
                        String var27 = field358.method2699();
                        class42.method68(var25, var26, var27);
                        method3241(10);
                    }
                    if (field572 == 13) {
                        if (field359 == -1) {
                            if (Statics.field16.method1992() < 2) {
                                return;
                            }
                            Statics.field16.method1995(field358.field2091, 0, 2);
                            field358.field2086 = 0;
                            field359 = field358.method2745();
                        }
                        if (Statics.field16.method1992() >= field359) {
                            Statics.field16.method1995(field358.field2091, 0, field359);
                            field358.field2086 = 0;
                            int var28 = field359;
                            field310.field2086 = 0;
                            field358.field2086 = 0;
                            field360 = -1;
                            field484 = -1;
                            field364 = -1;
                            field365 = -1;
                            field359 = 0;
                            field361 = 0;
                            field328 = 0;
                            field453 = 0;
                            field392 = -1;
                            field452 = false;
                            field550 = 0;
                            field548 = 0;
                            for (int var29 = 0; var29 < 2048; var29++) {
                                field434[var29] = null;
                            }
                            Statics.field266 = null;
                            for (int var30 = 0; var30 < field351.length; var30++) {
                                class36 var31 = field351[var30];
                                if (var31 != null) {
                                    var31.field641 = -1;
                                    var31.field653 = false;
                                }
                            }
                            class13.method168();
                            method3241(30);
                            for (int var32 = 0; var32 < 100; var32++) {
                                field519[var32] = true;
                            }
                            method887();
                            class46.method217(field358);
                            if (field358.field2086 != var28) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field472++;
                        if (field472 > 2000) {
                            if (field566 < 1) {
                                if (Statics.field239 == Statics.field1637) {
                                    Statics.field1637 = Statics.field447;
                                } else {
                                    Statics.field1637 = Statics.field239;
                                }
                                field566++;
                                field572 = 0;
                            } else {
                                method106(-3);
                            }
                        }
                    }
                } else if (Statics.field16.method1992() >= field359) {
                    field358.field2086 = 0;
                    Statics.field16.method1995(field358.field2091, 0, field359);
                    method2846();
                    class46.method217(field358);
                    Statics.field1204 = -1;
                    method1666(false);
                    field360 = -1;
                }
            }
        } catch (IOException var36) {
            if (field566 < 1) {
                if (Statics.field239 == Statics.field1637) {
                    Statics.field1637 = Statics.field447;
                } else {
                    Statics.field1637 = Statics.field239;
                }
                field566++;
                field572 = 0;
            } else {
                method106(-2);
            }
        }
    }

    @ObfuscatedName("eg.b(I)V")
    public static void method2846() {
        field321 = -1L;
        field315 = -1;
        Statics.field322.field255 = 0;
        Statics.field1662 = true;
        field582 = true;
        field540 = -1L;
        class228.method1124();
        field310.field2086 = 0;
        field358.field2086 = 0;
        field360 = -1;
        field484 = -1;
        field364 = -1;
        field365 = -1;
        field361 = 0;
        field328 = 0;
        field366 = 0;
        field459 = 0;
        field453 = 0;
        field392 = -1;
        field452 = false;
        class116.field1803 = 0;
        class48.field956.clear();
        class48.field952.method2199();
        class48.field953.method2355();
        class48.field954 = 0;
        field467 = 0;
        field469 = false;
        field420 = 0;
        field377 = (int) (Math.random() * 100.0D) - 50;
        field416 = (int) (Math.random() * 110.0D) - 55;
        field381 = (int) (Math.random() * 80.0D) - 40;
        field384 = (int) (Math.random() * 120.0D) - 60;
        field386 = (int) (Math.random() * 30.0D) - 20;
        field398 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field550 = 0;
        field544 = -1;
        field548 = 0;
        field425 = 0;
        field337 = class41.field837;
        field338 = class41.field837;
        field352 = 0;
        class46.method3271();
        for (int var0 = 0; var0 < 2048; var0++) {
            field434[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field351[var1] = null;
        }
        field408 = -1;
        field326.method2284();
        field444.method2284();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field522[var2][var3][var4] = null;
                }
            }
        }
        field445 = new class129();
        field376 = 0;
        field581 = 0;
        field585 = 0;
        for (int var5 = 0; var5 < Statics.field2769; var5++) {
            class188 var6 = Statics.method1986(var5);
            if (var6 != null) {
                class166.field2153[var5] = 0;
                class166.field2154[var5] = 0;
            }
        }
        Statics.field73.method899();
        field482 = -1;
        if (field474 != -1) {
            int var7 = field474;
            if (var7 != -1 && Statics.field794[var7]) {
                Statics.field2270.method3110(var7);
                if (Statics.field2223[var7] != null) {
                    boolean var8 = true;
                    for (int var9 = 0; var9 < Statics.field2223[var7].length; var9++) {
                        if (Statics.field2223[var7][var9] != null) {
                            if (Statics.field2223[var7][var9].field2189 == 2) {
                                var8 = false;
                            } else {
                                Statics.field2223[var7][var9] = null;
                            }
                        }
                    }
                    if (var8) {
                        Statics.field2223[var7] = null;
                    }
                    Statics.field794[var7] = false;
                }
            }
        }
        for (class18 var10 = (class18) field346.method2233(); var10 != null; var10 = (class18) field346.method2234()) {
            method66(var10, true);
        }
        field474 = -1;
        field346 = new class126(8);
        field478 = null;
        field453 = 0;
        field392 = -1;
        field452 = false;
        field577.method2981((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var11 = 0; var11 < 8; var11++) {
            field417[var11] = null;
            field464[var11] = false;
        }
        class13.method168();
        field319 = true;
        for (int var12 = 0; var12 < 100; var12++) {
            field519[var12] = true;
        }
        method887();
        field541 = null;
        Statics.field95 = 0;
        Statics.field1916 = null;
        for (int var13 = 0; var13 < 8; var13++) {
            field590[var13] = new class5();
        }
        Statics.field1703 = null;
    }

    @ObfuscatedName("g.t(II)V")
    public static void method106(int arg0) {
        if (arg0 == -3) {
            class42.method68(class174.field2384, class174.field2454, class174.field2611);
        } else if (arg0 == -2) {
            class42.method68(class174.field2387, class174.field2448, class174.field2528);
        } else if (arg0 == -1) {
            class42.method68(class174.field2425, class174.field2391, class174.field2392);
        } else if (arg0 == 3) {
            class42.field866 = 3;
        } else if (arg0 == 4) {
            class42.method68(class174.field2393, class174.field2449, class174.field2395);
        } else if (arg0 == 5) {
            class42.method68(class174.field2396, class174.field2397, class174.field2390);
        } else if (arg0 == 6) {
            class42.method68(class174.field2399, class174.field2377, class174.field2461);
        } else if (arg0 == 7) {
            class42.method68(class174.field2402, class174.field2471, class174.field2404);
        } else if (arg0 == 8) {
            class42.method68(class174.field2552, class174.field2406, class174.field2407);
        } else if (arg0 == 9) {
            class42.method68(class174.field2408, class174.field2584, class174.field2582);
        } else if (arg0 == 10) {
            class42.method68(class174.field2411, class174.field2412, class174.field2413);
        } else if (arg0 == 11) {
            class42.method68(class174.field2414, class174.field2415, class174.field2416);
        } else if (arg0 == 12) {
            class42.method68(class174.field2417, class174.field2418, class174.field2419);
        } else if (arg0 == 13) {
            class42.method68(class174.field2420, class174.field2421, class174.field2460);
        } else if (arg0 == 14) {
            class42.method68(class174.field2423, class174.field2424, class174.field2358);
        } else if (arg0 == 16) {
            class42.method68(class174.field2426, class174.field2427, class174.field2438);
        } else if (arg0 == 17) {
            class42.method68(class174.field2429, class174.field2537, class174.field2431);
        } else if (arg0 == 18) {
            class42.method68(class174.field2432, class174.field2433, class174.field2434);
        } else if (arg0 == 19) {
            class42.method68(class174.field2435, class174.field2436, class174.field2437);
        } else if (arg0 == 20) {
            class42.method68(class174.field2621, class174.field2439, class174.field2385);
        } else if (arg0 == 22) {
            class42.method68(class174.field2441, class174.field2570, class174.field2483);
        } else if (arg0 == 23) {
            class42.method68(class174.field2444, class174.field2532, class174.field2446);
        } else if (arg0 == 24) {
            class42.method68(class174.field2447, class174.field2575, class174.field2450);
        } else if (arg0 == 25) {
            class42.method68(class174.field2525, class174.field2451, class174.field2430);
        } else if (arg0 == 26) {
            class42.method68(class174.field2453, class174.field2452, class174.field2614);
        } else if (arg0 == 27) {
            class42.method68(class174.field2456, class174.field2457, class174.field2458);
        } else if (arg0 == 31) {
            class42.method68(class174.field2355, class174.field2466, class174.field2467);
        } else if (arg0 == 32) {
            class42.method68(class174.field2398, class174.field2469, class174.field2499);
        } else if (arg0 == 37) {
            class42.method68(class174.field2442, class174.field2472, class174.field2486);
        } else if (arg0 == 38) {
            class42.method68(class174.field2474, class174.field2475, class174.field2476);
        } else if (arg0 == 55) {
            class42.method68(class174.field2369, class174.field2601, class174.field2401);
        } else if (arg0 == 56) {
            class42.method68(class174.field2480, class174.field2481, class174.field2482);
            method3241(11);
            return;
        } else if (arg0 == 57) {
            class42.method68(class174.field2533, class174.field2484, class174.field2485);
            method3241(11);
            return;
        } else {
            class42.method68(class174.field2428, class174.field2487, class174.field2409);
        }
        method3241(10);
    }

    @ObfuscatedName("cf.z(B)V")
    public static final void method1607() {
        if (Statics.field16 != null) {
            Statics.field16.method1991();
            Statics.field16 = null;
        }
        method2605();
        Statics.field171.method1810();
        for (int var0 = 0; var0 < 4; var0++) {
            field373[var0].method2146();
        }
        System.gc();
        class139.method1510(2);
        field446 = -1;
        field553 = false;
        class32.method668();
        method3241(10);
    }

    @ObfuscatedName("er.p(I)V")
    public static final void method2605() {
        class201.field3051.method2225();
        class192.field2803.method2225();
        class193.method2686();
        class198.method824();
        class200.method231();
        class199.method801();
        class202.method232();
        class191.field2800.method2225();
        class191.field2788.method2225();
        class195.field2847.method2225();
        class188.field2772.method2225();
        class197.field2868.method2225();
        class197.field2878.method2225();
        class197.field2870.method2225();
        class194.method3075();
        class167.field2169.method2225();
        class170.field2181.method2225();
        class170.field2200.method2225();
        class170.field2183.method2225();
        class170.field2184.method2225();
        ((class75) Statics.field1459).method1414();
        class49.field965.method2225();
        Statics.field342.method3132();
        Statics.field2812.method3132();
        Statics.field1766.method3132();
        Statics.field2779.method3132();
        Statics.field779.method3132();
        Statics.field40.method3132();
        Statics.field2860.method3132();
        Statics.field3.method3132();
        Statics.field2826.method3132();
        Statics.field1656.method3132();
        Statics.field13.method3132();
        Statics.field1764.method3132();
    }

    @ObfuscatedName("m.n(I)V")
    public static final void method204() {
        if (field366 > 0) {
            method1607();
        } else {
            method3241(40);
            Statics.field89 = Statics.field16;
            Statics.field16 = null;
        }
    }

    @ObfuscatedName("dl.a(I)V")
    public static final void method1937() {
        if (field328 > 1) {
            field328--;
        }
        if (field366 > 0) {
            field366--;
        }
        if (field588) {
            field588 = false;
            method204();
            return;
        }
        if (!field452) {
            field453 = 0;
            field392 = -1;
            field452 = false;
            field458[0] = class174.field2581;
            field421[0] = "";
            field456[0] = 1006;
            field453 = 1;
        }
        for (int var0 = 0; var0 < 100 && method2542(); var0++) {
        }
        if (field318 != 30) {
            return;
        }
        while (true) {
            class227 var1 = (class227) class228.field3249.method2253();
            boolean var2;
            if (var1 == null) {
                var2 = false;
            } else {
                var2 = true;
            }
            if (!var2) {
                Object var4 = Statics.field322.field254;
                synchronized (Statics.field322.field254) {
                    if (!field587) {
                        Statics.field322.field255 = 0;
                    } else if (class116.field1814 != 0 || Statics.field322.field255 >= 40) {
                        field310.method2874(252);
                        field310.method2651(0);
                        int var5 = field310.field2086;
                        int var6 = 0;
                        for (int var7 = 0; var7 < Statics.field322.field255 && field310.field2086 - var5 < 240; var7++) {
                            var6++;
                            int var8 = Statics.field322.field251[var7];
                            if (var8 < 0) {
                                var8 = 0;
                            } else if (var8 > 502) {
                                var8 = 502;
                            }
                            int var9 = Statics.field322.field248[var7];
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > 764) {
                                var9 = 764;
                            }
                            int var10 = var8 * 765 + var9;
                            if (Statics.field322.field251[var7] == -1 && Statics.field322.field248[var7] == -1) {
                                var9 = -1;
                                var8 = -1;
                                var10 = 524287;
                            }
                            if (field323 != var9 || field324 != var8) {
                                int var11 = var9 - field323;
                                field323 = var9;
                                int var12 = var8 - field324;
                                field324 = var8;
                                if (field315 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                    var11 += 32;
                                    var12 += 32;
                                    field310.method2625((field315 << 12) + (var11 << 6) + var12);
                                    field315 = 0;
                                } else if (field315 < 8) {
                                    field310.method2626((field315 << 19) + 8388608 + var10);
                                    field315 = 0;
                                } else {
                                    field310.method2627((field315 << 19) + -1073741824 + var10);
                                    field315 = 0;
                                }
                            } else if (field315 < 2047) {
                                field315++;
                            }
                        }
                        field310.method2636(field310.field2086 - var5);
                        if (var6 >= Statics.field322.field255) {
                            Statics.field322.field255 = 0;
                        } else {
                            Statics.field322.field255 -= var6;
                            for (int var13 = 0; var13 < Statics.field322.field255; var13++) {
                                Statics.field322.field248[var13] = Statics.field322.field248[var6 + var13];
                                Statics.field322.field251[var13] = Statics.field322.field251[var6 + var13];
                            }
                        }
                    }
                }
                if (class116.field1814 == 1 || !Statics.field3077 && class116.field1814 == 4 || class116.field1814 == 2) {
                    long var15 = (class116.field1817 - field321) / 50L;
                    if (var15 > 4095L) {
                        var15 = 4095L;
                    }
                    field321 = class116.field1817;
                    int var17 = class116.field1816;
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (var17 > Statics.field2019) {
                        var17 = Statics.field2019;
                    }
                    int var18 = class116.field1815;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > Statics.field1749) {
                        var18 = Statics.field1749;
                    }
                    int var19 = (int) var15;
                    field310.method2874(152);
                    field310.method2625((class116.field1814 == 2 ? 1 : 0) + (var19 << 1));
                    field310.method2625(var18);
                    field310.method2625(var17);
                }
                if (class106.field1717 > 0) {
                    field310.method2874(217);
                    field310.method2625(0);
                    int var20 = field310.field2086;
                    long var21 = class156.method1888();
                    for (int var23 = 0; var23 < class106.field1717; var23++) {
                        long var24 = var21 - field540;
                        if (var24 > 16777215L) {
                            var24 = 16777215L;
                        }
                        field540 = var21;
                        field310.method2679((int) var24);
                        field310.method2651(class106.field1736[var23]);
                    }
                    field310.method2753(field310.field2086 - var20);
                }
                if (field404 > 0) {
                    field404--;
                }
                if (class106.field1726[96] || class106.field1726[97] || class106.field1726[98] || class106.field1726[99]) {
                    field405 = true;
                }
                if (field405 && field404 <= 0) {
                    field404 = 20;
                    field405 = false;
                    field310.method2874(213);
                    field310.method2717(field397);
                    field310.method2717(field398);
                }
                if (Statics.field1662 && !field582) {
                    field582 = true;
                    field310.method2874(124);
                    field310.method2651(1);
                }
                if (!Statics.field1662 && field582) {
                    field582 = false;
                    field310.method2874(124);
                    field310.method2651(0);
                }
                if (Statics.field744 != field544) {
                    field544 = Statics.field744;
                    int var26 = Statics.field744;
                    int[] var27 = Statics.field686.field3231;
                    int var28 = var27.length;
                    for (int var29 = 0; var29 < var28; var29++) {
                        var27[var29] = 0;
                    }
                    for (int var30 = 1; var30 < 103; var30++) {
                        int var31 = (103 - var30) * 2048 + 24628;
                        for (int var32 = 1; var32 < 103; var32++) {
                            if ((class11.field123[var26][var32][var30] & 0x18) == 0) {
                                Statics.field171.method1784(var27, var31, 512, var26, var32, var30);
                            }
                            if (var26 < 3 && (class11.field123[var26 + 1][var32][var30] & 0x8) != 0) {
                                Statics.field171.method1784(var27, var31, 512, var26 + 1, var32, var30);
                            }
                            var31 += 4;
                        }
                    }
                    int var33 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                    int var34 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                    Statics.field686.method3893();
                    for (int var35 = 1; var35 < 103; var35++) {
                        for (int var36 = 1; var36 < 103; var36++) {
                            if ((class11.field123[var26][var36][var35] & 0x18) == 0) {
                                method13(var26, var36, var35, var33, var34);
                            }
                            if (var26 < 3 && (class11.field123[var26 + 1][var36][var35] & 0x8) != 0) {
                                method13(var26 + 1, var36, var35, var33, var34);
                            }
                        }
                    }
                    field586 = 0;
                    for (int var37 = 0; var37 < 104; var37++) {
                        for (int var38 = 0; var38 < 104; var38++) {
                            int var39 = Statics.field171.method1697(Statics.field744, var37, var38);
                            if (var39 != 0) {
                                int var40 = var39 >> 14 & 0x7FFF;
                                int var41 = class198.method3366(var40).field2923;
                                if (var41 >= 0) {
                                    int var42 = var37;
                                    int var43 = var38;
                                    if (var41 != 22 && var41 != 29 && var41 != 34 && var41 != 36 && var41 != 46 && var41 != 47 && var41 != 48) {
                                        int[][] var44 = field373[Statics.field744].field1842;
                                        for (int var45 = 0; var45 < 10; var45++) {
                                            int var46 = (int) (Math.random() * 4.0D);
                                            if (var46 == 0 && var42 > 0 && var42 > var37 - 3 && (var44[var42 - 1][var43] & 0x1240108) == 0) {
                                                var42--;
                                            }
                                            if (var46 == 1 && var42 < 103 && var42 < var37 + 3 && (var44[var42 + 1][var43] & 0x1240180) == 0) {
                                                var42++;
                                            }
                                            if (var46 == 2 && var43 > 0 && var43 > var38 - 3 && (var44[var42][var43 - 1] & 0x1240102) == 0) {
                                                var43--;
                                            }
                                            if (var46 == 3 && var43 < 103 && var43 < var38 + 3 && (var44[var42][var43 + 1] & 0x1240120) == 0) {
                                                var43++;
                                            }
                                        }
                                    }
                                    field547[field586] = Statics.field2336[var41];
                                    field545[field586] = var42;
                                    field495[field586] = var43;
                                    field586++;
                                }
                            }
                        }
                    }
                    Statics.field1580.method3852();
                }
                if (field318 != 30) {
                    return;
                }
                for (class26 var47 = (class26) field445.method2290(); var47 != null; var47 = (class26) field445.method2287()) {
                    if (var47.field597 > 0) {
                        var47.field597--;
                    }
                    if (var47.field597 != 0) {
                        if (var47.field607 > 0) {
                            var47.field607--;
                        }
                        if (var47.field607 == 0 && var47.field599 >= 1 && var47.field601 >= 1 && var47.field599 <= 102 && var47.field601 <= 102 && (var47.field613 < 0 || class11.method169(var47.field613, var47.field606))) {
                            method277(var47.field600, var47.field598, var47.field599, var47.field601, var47.field613, var47.field604, var47.field606);
                            var47.field607 = -1;
                            if (var47.field613 == var47.field605 && var47.field605 == -1) {
                                var47.method2278();
                            } else if (var47.field613 == var47.field605 && var47.field604 == var47.field602 && var47.field606 == var47.field603) {
                                var47.method2278();
                            }
                        }
                    } else if (var47.field605 < 0 || class11.method169(var47.field605, var47.field603)) {
                        method277(var47.field600, var47.field598, var47.field599, var47.field601, var47.field605, var47.field602, var47.field603);
                        var47.method2278();
                    }
                }
                method791();
                field361++;
                if (field361 > 750) {
                    method204();
                    return;
                }
                method2910();
                method3094();
                method21();
                field329++;
                if (field424 != 0) {
                    field549 += 20;
                    if (field549 >= 400) {
                        field424 = 0;
                    }
                }
                if (Statics.field1364 != null) {
                    field426++;
                    if (field426 >= 15) {
                        method37(Statics.field1364);
                        Statics.field1364 = null;
                    }
                }
                class170 var48 = Statics.field17;
                class170 var49 = Statics.field2810;
                Statics.field17 = null;
                Statics.field2810 = null;
                field491 = null;
                field451 = false;
                field492 = false;
                field475 = 0;
                while (class106.method1508() && field475 < 128) {
                    if (field481 >= 2 && class106.field1726[82] && Statics.field1203 == 66) {
                        String var50 = "";
                        Iterator var51 = class48.field952.iterator();
                        while (var51.hasNext()) {
                            class22 var52 = (class22) var51.next();
                            var50 = var50 + var52.field258 + ':' + var52.field259 + '\n';
                        }
                        Statics.field609.setContents(new StringSelection(var50), (ClipboardOwner) null);
                    } else {
                        field539[field475] = Statics.field1203;
                        field538[field475] = Statics.field2109;
                        field475++;
                    }
                }
                if (field474 != -1) {
                    int var55 = field474;
                    int var56 = Statics.field1749;
                    int var57 = Statics.field2019;
                    if (class170.method869(var55)) {
                        method605(Statics.field2223[var55], -1, 0, 0, var56, var57, 0, 0);
                    }
                }
                field499++;
                while (true) {
                    class19 var58;
                    class170 var59;
                    class170 var60;
                    do {
                        var58 = (class19) field514.method2288();
                        if (var58 == null) {
                            while (true) {
                                class19 var61;
                                class170 var62;
                                class170 var63;
                                do {
                                    var61 = (class19) field515.method2288();
                                    if (var61 == null) {
                                        while (true) {
                                            class19 var64;
                                            class170 var65;
                                            class170 var66;
                                            do {
                                                var64 = (class19) field513.method2288();
                                                if (var64 == null) {
                                                    boolean var67 = false;
                                                    while (!var67) {
                                                        var67 = true;
                                                        for (int var68 = 0; var68 < field453 - 1; var68++) {
                                                            if (field456[var68] < 1000 && field456[var68 + 1] > 1000) {
                                                                String var69 = field421[var68];
                                                                field421[var68] = field421[var68 + 1];
                                                                field421[var68 + 1] = var69;
                                                                String var70 = field458[var68];
                                                                field458[var68] = field458[var68 + 1];
                                                                field458[var68 + 1] = var70;
                                                                int var71 = field456[var68];
                                                                field456[var68] = field456[var68 + 1];
                                                                field456[var68 + 1] = var71;
                                                                int var72 = field532[var68];
                                                                field532[var68] = field532[var68 + 1];
                                                                field532[var68 + 1] = var72;
                                                                int var73 = field455[var68];
                                                                field455[var68] = field455[var68 + 1];
                                                                field455[var68 + 1] = var73;
                                                                int var74 = field542[var68];
                                                                field542[var68] = field542[var68 + 1];
                                                                field542[var68 + 1] = var74;
                                                                if (field392 != -1) {
                                                                    if (field392 == var68) {
                                                                        field392 = var68 + 1;
                                                                    } else if (field392 == var68 + 1) {
                                                                        field392 = var68;
                                                                    }
                                                                }
                                                                var67 = false;
                                                            }
                                                        }
                                                    }
                                                    if (Statics.field785 == null && field487 == null) {
                                                        int var75 = class116.field1814;
                                                        if (field452) {
                                                            if (var75 != 1 && (Statics.field3077 || var75 != 4)) {
                                                                int var76 = class116.field1808;
                                                                int var77 = class116.field1802 * 1476935015;
                                                                if (var76 < Statics.field4 - 10 || var76 > Statics.field4 + Statics.field1733 + 10 || var77 < Statics.field149 - 10 || var77 > Statics.field3041 + Statics.field149 + 10) {
                                                                    field452 = false;
                                                                    Statics.method209(Statics.field4, Statics.field149, Statics.field1733, Statics.field3041);
                                                                }
                                                            }
                                                            if (var75 == 1 || !Statics.field3077 && var75 == 4) {
                                                                int var78 = Statics.field4;
                                                                int var79 = Statics.field149;
                                                                int var80 = Statics.field1733;
                                                                int var81 = class116.field1815;
                                                                int var82 = class116.field1816;
                                                                int var83 = -1;
                                                                for (int var84 = 0; var84 < field453; var84++) {
                                                                    int var85 = (field453 - 1 - var84) * 15 + var79 + 31;
                                                                    if (var81 > var78 && var81 < var78 + var80 && var82 > var85 - 13 && var82 < var85 + 3) {
                                                                        var83 = var84;
                                                                    }
                                                                }
                                                                if (var83 != -1 && var83 >= 0) {
                                                                    int var86 = field532[var83];
                                                                    int var87 = field455[var83];
                                                                    int var88 = field456[var83];
                                                                    int var89 = field542[var83];
                                                                    String var90 = field458[var83];
                                                                    String var91 = field421[var83];
                                                                    method1199(var86, var87, var88, var89, var90, var91, class116.field1815, class116.field1816);
                                                                }
                                                                field452 = false;
                                                                Statics.method209(Statics.field4, Statics.field149, Statics.field1733, Statics.field3041);
                                                            }
                                                        } else {
                                                            label1297: {
                                                                int var92 = method2572();
                                                                if ((var75 == 1 || !Statics.field3077 && var75 == 4) && var92 >= 0) {
                                                                    int var93 = field456[var92];
                                                                    if (var93 == 39 || var93 == 40 || var93 == 41 || var93 == 42 || var93 == 43 || var93 == 33 || var93 == 34 || var93 == 35 || var93 == 36 || var93 == 37 || var93 == 38 || var93 == 1005) {
                                                                        int var94 = field532[var92];
                                                                        int var95 = field455[var92];
                                                                        class170 var96 = class170.method669(var95);
                                                                        if (class171.method2956(method3069(var96)) || class171.method2175(method3069(var96))) {
                                                                            if (Statics.field785 != null && !field462) {
                                                                                int var97 = method2572();
                                                                                if (field389 != 1 && !method273(var97) && field453 > 0) {
                                                                                    method1854(field428, field429);
                                                                                }
                                                                            }
                                                                            field462 = false;
                                                                            field432 = 0;
                                                                            if (Statics.field785 != null) {
                                                                                method37(Statics.field785);
                                                                            }
                                                                            Statics.field785 = class170.method669(var95);
                                                                            field311 = var94;
                                                                            field428 = class116.field1815;
                                                                            field429 = class116.field1816;
                                                                            if (var92 >= 0) {
                                                                                Statics.field1116 = new class39();
                                                                                Statics.field1116.field823 = field532[var92];
                                                                                Statics.field1116.field832 = field455[var92];
                                                                                Statics.field1116.field824 = field456[var92];
                                                                                Statics.field1116.field831 = field542[var92];
                                                                                Statics.field1116.field826 = field458[var92];
                                                                            }
                                                                            method37(Statics.field785);
                                                                            break label1297;
                                                                        }
                                                                    }
                                                                }
                                                                if (var75 == 1 || !Statics.field3077 && var75 == 4) {
                                                                    label1277: {
                                                                        label888: {
                                                                            if (field389 == 1 && field453 > 2) {
                                                                                boolean var98;
                                                                                if (field453 <= 0) {
                                                                                    var98 = false;
                                                                                } else if (field562 && class106.field1726[81] && field392 != -1) {
                                                                                    var98 = true;
                                                                                } else {
                                                                                    var98 = false;
                                                                                }
                                                                                if (!var98) {
                                                                                    break label888;
                                                                                }
                                                                            }
                                                                            if (!method273(var92)) {
                                                                                break label1277;
                                                                            }
                                                                        }
                                                                        var75 = 2;
                                                                    }
                                                                }
                                                                if ((var75 == 1 || !Statics.field3077 && var75 == 4) && field453 > 0 && var92 >= 0) {
                                                                    int var99 = field532[var92];
                                                                    int var100 = field455[var92];
                                                                    int var101 = field456[var92];
                                                                    int var102 = field542[var92];
                                                                    String var103 = field458[var92];
                                                                    String var104 = field421[var92];
                                                                    method1199(var99, var100, var101, var102, var103, var104, class116.field1815, class116.field1816);
                                                                }
                                                                if (var75 == 2 && field453 > 0) {
                                                                    method686(class116.field1815, class116.field1816);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (field487 != null) {
                                                        method941();
                                                    }
                                                    if (Statics.field785 != null) {
                                                        method37(Statics.field785);
                                                        field432++;
                                                        if (class116.field1807 == 0) {
                                                            if (!field462) {
                                                                label1243: {
                                                                    label1261: {
                                                                        int var111 = method2572();
                                                                        if (field453 > 2) {
                                                                            if (field389 == 1) {
                                                                                boolean var112;
                                                                                if (field453 <= 0) {
                                                                                    var112 = false;
                                                                                } else if (field562 && class106.field1726[81] && field392 != -1) {
                                                                                    var112 = true;
                                                                                } else {
                                                                                    var112 = false;
                                                                                }
                                                                                if (!var112) {
                                                                                    break label1261;
                                                                                }
                                                                            }
                                                                            if (method273(var111)) {
                                                                                break label1261;
                                                                            }
                                                                        }
                                                                        if (field453 > 0) {
                                                                            method1854(field428, field429);
                                                                        }
                                                                        break label1243;
                                                                    }
                                                                    method686(field428, field429);
                                                                }
                                                            } else if (Statics.field785 == Statics.field39 && field409 != field311) {
                                                                class170 var105 = Statics.field785;
                                                                byte var106 = 0;
                                                                if (field477 == 1 && var105.field2191 == 206) {
                                                                    var106 = 1;
                                                                }
                                                                if (var105.field2305[field409] <= 0) {
                                                                    var106 = 0;
                                                                }
                                                                if (class171.method2175(method3069(var105))) {
                                                                    int var107 = field311;
                                                                    int var108 = field409;
                                                                    var105.field2305[var108] = var105.field2305[var107];
                                                                    var105.field2306[var108] = var105.field2306[var107];
                                                                    var105.field2305[var107] = -1;
                                                                    var105.field2306[var107] = 0;
                                                                } else if (var106 == 1) {
                                                                    int var109 = field311;
                                                                    int var110 = field409;
                                                                    while (var109 != var110) {
                                                                        if (var109 > var110) {
                                                                            var105.method3007(var109 - 1, var109);
                                                                            var109--;
                                                                        } else if (var109 < var110) {
                                                                            var105.method3007(var109 + 1, var109);
                                                                            var109++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var105.method3007(field409, field311);
                                                                }
                                                                field310.method2874(151);
                                                                field310.method2672(field311);
                                                                field310.method2625(field409);
                                                                field310.method2651(var106);
                                                                field310.method2682(Statics.field785.field2187);
                                                            }
                                                            field426 = 10;
                                                            class116.field1814 = 0;
                                                            Statics.field785 = null;
                                                        } else if (field432 >= 5 && (class116.field1808 > field428 + 5 || class116.field1808 < field428 - 5 || class116.field1802 * 1476935015 > field429 + 5 || class116.field1802 * 1476935015 < field429 - 5)) {
                                                            field462 = true;
                                                        }
                                                    }
                                                    if (class88.method1848()) {
                                                        int var113 = class88.field1522;
                                                        int var114 = class88.field1523;
                                                        field310.method2874(147);
                                                        field310.method2651(5);
                                                        field310.method2663(class106.field1726[82] ? (class106.field1726[81] ? 2 : 1) : 0);
                                                        field310.method2717(Statics.field37 + var114);
                                                        field310.method2717(Statics.field791 + var113);
                                                        class88.method1708();
                                                        field423 = class116.field1815;
                                                        field422 = class116.field1816;
                                                        field424 = 1;
                                                        field549 = 0;
                                                        field548 = var113;
                                                        field425 = var114;
                                                    }
                                                    if (Statics.field17 != var48) {
                                                        if (var48 != null) {
                                                            method37(var48);
                                                        }
                                                        if (Statics.field17 != null) {
                                                            method37(Statics.field17);
                                                        }
                                                    }
                                                    if (Statics.field2810 != var49 && field466 == field349) {
                                                        if (var49 != null) {
                                                            method37(var49);
                                                        }
                                                        if (Statics.field2810 != null) {
                                                            method37(Statics.field2810);
                                                        }
                                                    }
                                                    if (Statics.field2810 == null) {
                                                        if (field349 > 0) {
                                                            field349--;
                                                        }
                                                    } else if (field349 < field466) {
                                                        field349++;
                                                        if (field466 == field349) {
                                                            method37(Statics.field2810);
                                                        }
                                                    }
                                                    int var115 = field377 + Statics.field266.field675;
                                                    int var116 = field416 + Statics.field266.field627;
                                                    if (Statics.field3216 - var115 < -500 || Statics.field3216 - var115 > 500 || Statics.field843 - var116 < -500 || Statics.field843 - var116 > 500) {
                                                        Statics.field3216 = var115;
                                                        Statics.field843 = var116;
                                                    }
                                                    if (Statics.field3216 != var115) {
                                                        Statics.field3216 += (var115 - Statics.field3216) / 16;
                                                    }
                                                    if (Statics.field843 != var116) {
                                                        Statics.field843 += (var116 - Statics.field843) / 16;
                                                    }
                                                    if (class116.field1807 == 4 && Statics.field3077) {
                                                        int var117 = class116.field1802 * 1476935015 - field402 * 1476935015;
                                                        field400 = var117 * 2;
                                                        field402 = (var117 == -1 || var117 == 1 ? class116.field1802 * 1476935015 : (field402 * 1476935015 + class116.field1802 * 1476935015) / 2) * -1992520105;
                                                        int var118 = field401 - class116.field1808;
                                                        field448 = var118 * 2;
                                                        field401 = var118 == -1 || var118 == 1 ? class116.field1808 : (field401 + class116.field1808) / 2;
                                                    } else {
                                                        if (class106.field1726[96]) {
                                                            field448 += (-24 - field448) / 2;
                                                        } else if (class106.field1726[97]) {
                                                            field448 += (24 - field448) / 2;
                                                        } else {
                                                            field448 /= 2;
                                                        }
                                                        if (class106.field1726[98]) {
                                                            field400 += (12 - field400) / 2;
                                                        } else if (class106.field1726[99]) {
                                                            field400 += (-12 - field400) / 2;
                                                        } else {
                                                            field400 /= 2;
                                                        }
                                                        field402 = class116.field1802;
                                                        field401 = class116.field1808;
                                                    }
                                                    field398 = field448 / 2 + field398 & 0x7FF;
                                                    field397 += field400 / 2;
                                                    if (field397 < 128) {
                                                        field397 = 128;
                                                    }
                                                    if (field397 > 383) {
                                                        field397 = 383;
                                                    }
                                                    int var119 = Statics.field3216 >> 7;
                                                    int var120 = Statics.field843 >> 7;
                                                    int var121 = method22(Statics.field3216, Statics.field843, Statics.field744);
                                                    int var122 = 0;
                                                    if (var119 > 3 && var120 > 3 && var119 < 100 && var120 < 100) {
                                                        for (int var123 = var119 - 4; var123 <= var119 + 4; var123++) {
                                                            for (int var124 = var120 - 4; var124 <= var120 + 4; var124++) {
                                                                int var125 = Statics.field744;
                                                                if (var125 < 3 && (class11.field123[1][var123][var124] & 0x2) == 2) {
                                                                    var125++;
                                                                }
                                                                int var126 = var121 - class11.field131[var125][var123][var124];
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
                                                    if (var127 > field504) {
                                                        field504 += (var127 - field504) / 24;
                                                    } else if (var127 < field504) {
                                                        field504 += (var127 - field504) / 80;
                                                    }
                                                    if (field441) {
                                                        method807();
                                                    }
                                                    for (int var128 = 0; var128 < 5; var128++) {
                                                        int var10002 = field567[var128]++;
                                                    }
                                                    Statics.field73.method902();
                                                    int var129 = class116.method2652();
                                                    int var130 = class106.method1877();
                                                    if (var129 > 15000 && var130 > 15000) {
                                                        field366 = 250;
                                                        class116.field1803 = 14500;
                                                        field310.method2874(255);
                                                    }
                                                    field383++;
                                                    if (field383 > 500) {
                                                        field383 = 0;
                                                        int var131 = (int) (Math.random() * 8.0D);
                                                        if ((var131 & 0x1) == 1) {
                                                            field377 += field378;
                                                        }
                                                        if ((var131 & 0x2) == 2) {
                                                            field416 += field380;
                                                        }
                                                        if ((var131 & 0x4) == 4) {
                                                            field381 += field443;
                                                        }
                                                    }
                                                    if (field377 < -50) {
                                                        field378 = 2;
                                                    }
                                                    if (field377 > 50) {
                                                        field378 = -2;
                                                    }
                                                    if (field416 < -55) {
                                                        field380 = 2;
                                                    }
                                                    if (field416 > 55) {
                                                        field380 = -2;
                                                    }
                                                    if (field381 < -40) {
                                                        field443 = 1;
                                                    }
                                                    if (field381 > 40) {
                                                        field443 = -1;
                                                    }
                                                    field388++;
                                                    if (field388 > 500) {
                                                        field388 = 0;
                                                        int var132 = (int) (Math.random() * 8.0D);
                                                        if ((var132 & 0x1) == 1) {
                                                            field384 += field385;
                                                        }
                                                        if ((var132 & 0x2) == 2) {
                                                            field386 += field387;
                                                        }
                                                    }
                                                    if (field384 < -60) {
                                                        field385 = 2;
                                                    }
                                                    if (field384 > 60) {
                                                        field385 = -2;
                                                    }
                                                    if (field386 < -20) {
                                                        field387 = 1;
                                                    }
                                                    if (field386 > 10) {
                                                        field387 = -1;
                                                    }
                                                    for (class17 var133 = (class17) field584.method2321(); var133 != null; var133 = (class17) field584.method2323()) {
                                                        if ((long) var133.field208 < class156.method1888() / 1000L - 5L) {
                                                            if (var133.field202 > 0) {
                                                                class48.method685(5, "", var133.field203 + class174.field2489);
                                                            }
                                                            if (var133.field202 == 0) {
                                                                class48.method685(5, "", var133.field203 + class174.field2490);
                                                            }
                                                            var133.method2333();
                                                        }
                                                    }
                                                    field498++;
                                                    if (field498 > 50) {
                                                        field310.method2874(184);
                                                    }
                                                    try {
                                                        if (Statics.field16 != null && field310.field2086 > 0) {
                                                            Statics.field16.method1993(field310.field2091, 0, field310.field2086);
                                                            field310.field2086 = 0;
                                                            field498 = 0;
                                                        }
                                                    } catch (IOException var135) {
                                                        method204();
                                                    }
                                                    return;
                                                }
                                                var65 = var64.field224;
                                                if (var65.field2220 < 0) {
                                                    break;
                                                }
                                                var66 = class170.method669(var65.field2255);
                                            } while (var66 == null || var66.field2311 == null || var65.field2220 >= var66.field2311.length || var66.field2311[var65.field2220] != var65);
                                            class33.method1870(var64);
                                        }
                                    }
                                    var62 = var61.field224;
                                    if (var62.field2220 < 0) {
                                        break;
                                    }
                                    var63 = class170.method669(var62.field2255);
                                } while (var63 == null || var63.field2311 == null || var62.field2220 >= var63.field2311.length || var63.field2311[var62.field2220] != var62);
                                class33.method1870(var61);
                            }
                        }
                        var59 = var58.field224;
                        if (var59.field2220 < 0) {
                            break;
                        }
                        var60 = class170.method669(var59.field2255);
                    } while (var60 == null || var60.field2311 == null || var59.field2220 >= var60.field2311.length || var60.field2311[var59.field2220] != var59);
                    class33.method1870(var58);
                }
            }
            field310.method2874(52);
            field310.method2651(0);
            int var3 = field310.field2086;
            class228.method948(field310);
            field310.method2636(field310.field2086 - var3);
        }
    }

    @ObfuscatedName("al.o(I)V")
    public static final void method927() {
        if (Statics.field1978 != null) {
            Statics.field1978.method1094();
        }
        if (Statics.field2090 != null) {
            Statics.field2090.method1094();
        }
    }

    @ObfuscatedName("ao.an(I)V")
    public static final void method791() {
        for (int var0 = 0; var0 < field420; var0++) {
            int var10002 = field559[var0]--;
            if (field559[var0] >= -10) {
                class54 var2 = field561[var0];
                if (var2 == null) {
                    class54 var10000 = (class54) null;
                    var2 = class54.method1032(Statics.field2779, field557[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field559[var0] += var2.method1024();
                    field561[var0] = var2;
                }
                if (field559[var0] < 0) {
                    int var9;
                    if (field560[var0] == 0) {
                        var9 = field554;
                    } else {
                        int var3 = (field560[var0] & 0xFF) * 128;
                        int var4 = field560[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field266.field675;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field560[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field266.field627;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field559[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field555 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class56 var10 = var2.method1023().method1065(Statics.field1225);
                        class67 var11 = class67.method1213(var10, 100, var9);
                        var11.method1279(field558[var0] - 1);
                        Statics.field2864.method973(var11);
                    }
                    field559[var0] = -100;
                }
            } else {
                field420--;
                for (int var1 = var0; var1 < field420; var1++) {
                    field557[var1] = field557[var1 + 1];
                    field561[var1] = field561[var1 + 1];
                    field558[var1] = field558[var1 + 1];
                    field559[var1] = field559[var1 + 1];
                    field560[var1] = field560[var1 + 1];
                }
                var0--;
            }
        }
        if (field553 && !class139.method200()) {
            if (field551 != 0 && field446 != -1) {
                Statics.method808(Statics.field40, field446, 0, field551, false);
            }
            field553 = false;
        }
    }

    @ObfuscatedName("er.ar(Lgy;IIIS)V")
    public static void method2604(class202 arg0, int arg1, int arg2, int arg3) {
        if (field420 >= 50 || field555 == 0 || arg0.field3062 == null || arg1 >= arg0.field3062.length) {
            return;
        }
        int var4 = arg0.field3062[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field557[field420] = var5;
        field558[field420] = var6;
        field559[field420] = 0;
        field561[field420] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field560[field420] = (var8 << 16) + (var9 << 8) + var7;
        field420++;
    }

    @ObfuscatedName("eo.aa(IIIB)V")
    public static void method2544(int arg0, int arg1, int arg2) {
        if (field554 == 0 || arg1 == 0 || field420 >= 50) {
            return;
        }
        field557[field420] = arg0;
        field558[field420] = arg1;
        field559[field420] = arg2;
        field561[field420] = null;
        field560[field420] = 0;
        field420++;
    }

    @ObfuscatedName("j.af(B)V")
    public static final void method21() {
        int[] var0 = class46.field926;
        for (int var1 = 0; var1 < class46.field935; var1++) {
            class24 var2 = field434[var0[var1]];
            if (var2 != null && var2.field642 > 0) {
                var2.field642--;
                if (var2.field642 == 0) {
                    var2.field639 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field352; var3++) {
            int var4 = field571[var3];
            class36 var5 = field351[var4];
            if (var5 != null && var5.field642 > 0) {
                var5.field642--;
                if (var5.field642 == 0) {
                    var5.field639 = null;
                }
            }
        }
    }

    @ObfuscatedName("dj.ax(Ljava/lang/String;I)V")
    public static final void method2015(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field85.field718 = !Statics.field85.field718;
            class31.method11();
            if (Statics.field85.field718) {
                class48.method685(99, "", "Roofs are now all hidden");
            } else {
                class48.method685(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field393 = !field393;
        }
        if (field481 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field393 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field393 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method204();
            }
            if (arg0.equalsIgnoreCase("errortest") && field382 == 2) {
                throw new RuntimeException();
            }
        }
        field310.method2874(13);
        field310.method2651(arg0.length() + 1);
        field310.method2630(arg0);
    }

    @ObfuscatedName("ay.ah(I)V")
    public static final void method807() {
        int var0 = Statics.field1686 * 128 + 64;
        int var1 = Statics.field3091 * 128 + 64;
        int var2 = method22(var0, var1, Statics.field744) - Statics.field2946;
        if (Statics.field1111 < var0) {
            Statics.field1111 += Statics.field101 * (var0 - Statics.field1111) / 1000 + Statics.field951;
            if (Statics.field1111 > var0) {
                Statics.field1111 = var0;
            }
        }
        if (Statics.field1111 > var0) {
            Statics.field1111 -= Statics.field101 * (Statics.field1111 - var0) / 1000 + Statics.field951;
            if (Statics.field1111 < var0) {
                Statics.field1111 = var0;
            }
        }
        if (Statics.field82 < var2) {
            Statics.field82 += Statics.field101 * (var2 - Statics.field82) / 1000 + Statics.field951;
            if (Statics.field82 > var2) {
                Statics.field82 = var2;
            }
        }
        if (Statics.field82 > var2) {
            Statics.field82 -= Statics.field101 * (Statics.field82 - var2) / 1000 + Statics.field951;
            if (Statics.field82 < var2) {
                Statics.field82 = var2;
            }
        }
        if (Statics.field784 < var1) {
            Statics.field784 += Statics.field101 * (var1 - Statics.field784) / 1000 + Statics.field951;
            if (Statics.field784 > var1) {
                Statics.field784 = var1;
            }
        }
        if (Statics.field784 > var1) {
            Statics.field784 -= Statics.field101 * (Statics.field784 - var1) / 1000 + Statics.field951;
            if (Statics.field784 < var1) {
                Statics.field784 = var1;
            }
        }
        int var3 = Statics.field1702 * 128 + 64;
        int var4 = Statics.field1579 * 128 + 64;
        int var5 = method22(var3, var4, Statics.field744) - Statics.field241;
        int var6 = var3 - Statics.field1111;
        int var7 = var5 - Statics.field82;
        int var8 = var4 - Statics.field784;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field610 < var10) {
            Statics.field610 += Statics.field48 * (var10 - Statics.field610) / 1000 + Statics.field1647;
            if (Statics.field610 > var10) {
                Statics.field610 = var10;
            }
        }
        if (Statics.field610 > var10) {
            Statics.field610 -= Statics.field48 * (Statics.field610 - var10) / 1000 + Statics.field1647;
            if (Statics.field610 < var10) {
                Statics.field610 = var10;
            }
        }
        int var12 = var11 - Statics.field1750;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1750 += Statics.field48 * var12 / 1000 + Statics.field1647;
            Statics.field1750 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1750 -= Statics.field48 * -var12 / 1000 + Statics.field1647;
            Statics.field1750 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1750;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1750 = var11;
        }
    }

    @ObfuscatedName("fn.az(I)V")
    public static final void method2910() {
        int var0 = class46.field935;
        int[] var1 = class46.field926;
        for (int var2 = 0; var2 < var0; var2++) {
            class24 var3 = field434[var1[var2]];
            if (var3 != null) {
                method206(var3, 1);
            }
        }
    }

    @ObfuscatedName("fz.at(I)V")
    public static final void method3094() {
        for (int var0 = 0; var0 < field352; var0++) {
            int var1 = field571[var0];
            class36 var2 = field351[var1];
            if (var2 != null) {
                method206(var2, var2.field795.field3009);
            }
        }
    }

    @ObfuscatedName("i.ab(Lar;II)V")
    public static final void method206(class28 arg0, int arg1) {
        if (arg0.field672 > field320) {
            method1851(arg0);
        } else if (arg0.field648 >= field320) {
            method2014(arg0);
        } else {
            method269(arg0);
        }
        if (arg0.field675 < 128 || arg0.field627 < 128 || arg0.field675 >= 13184 || arg0.field627 >= 13184) {
            arg0.field658 = -1;
            arg0.field634 = -1;
            arg0.field672 = 0;
            arg0.field648 = 0;
            arg0.field675 = arg0.field681[0] * 128 + arg0.field673 * 64;
            arg0.field627 = arg0.field632[0] * 128 + arg0.field673 * 64;
            arg0.method615();
        }
        if (Statics.field266 == arg0 && (arg0.field675 < 1536 || arg0.field627 < 1536 || arg0.field675 >= 11776 || arg0.field627 >= 11776)) {
            arg0.field658 = -1;
            arg0.field634 = -1;
            arg0.field672 = 0;
            arg0.field648 = 0;
            arg0.field675 = arg0.field681[0] * 128 + arg0.field673 * 64;
            arg0.field627 = arg0.field632[0] * 128 + arg0.field673 * 64;
            arg0.method615();
        }
        if (arg0.field679 != 0) {
            if (arg0.field641 != -1) {
                class28 var2 = null;
                if (arg0.field641 < 32768) {
                    var2 = field351[arg0.field641];
                } else if (arg0.field641 >= 32768) {
                    var2 = field434[arg0.field641 - 32768];
                }
                if (var2 != null) {
                    int var3 = arg0.field675 - var2.field675;
                    int var4 = arg0.field627 - var2.field627;
                    if (var3 != 0 || var4 != 0) {
                        arg0.field677 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field653) {
                    arg0.field641 = -1;
                    arg0.field653 = false;
                }
            }
            if (arg0.field654 != -1 && (arg0.field680 == 0 || arg0.field684 > 0)) {
                arg0.field677 = arg0.field654;
                arg0.field654 = -1;
            }
            int var5 = arg0.field677 - arg0.field628 & 0x7FF;
            if (var5 == 0 && arg0.field653) {
                arg0.field641 = -1;
                arg0.field653 = false;
            }
            if (var5 == 0) {
                arg0.field676 = 0;
            } else {
                arg0.field676++;
                if (var5 > 1024) {
                    arg0.field628 -= arg0.field679;
                    boolean var6 = true;
                    if (var5 < arg0.field679 || var5 > 2048 - arg0.field679) {
                        arg0.field628 = arg0.field677;
                        var6 = false;
                    }
                    if (arg0.field631 == arg0.field626 && (arg0.field676 > 25 || var6)) {
                        if (arg0.field685 == -1) {
                            arg0.field626 = arg0.field668;
                        } else {
                            arg0.field626 = arg0.field685;
                        }
                    }
                } else {
                    arg0.field628 += arg0.field679;
                    boolean var7 = true;
                    if (var5 < arg0.field679 || var5 > 2048 - arg0.field679) {
                        arg0.field628 = arg0.field677;
                        var7 = false;
                    }
                    if (arg0.field631 == arg0.field626 && (arg0.field676 > 25 || var7)) {
                        if (arg0.field633 == -1) {
                            arg0.field626 = arg0.field668;
                        } else {
                            arg0.field626 = arg0.field633;
                        }
                    }
                }
                arg0.field628 &= 0x7FF;
            }
        }
        method799(arg0);
    }

    @ObfuscatedName("cd.ae(Lar;I)V")
    public static final void method1851(class28 arg0) {
        int var1 = arg0.field672 - field320;
        int var2 = arg0.field673 * 64 + arg0.field651 * 128;
        int var3 = arg0.field673 * 64 + arg0.field670 * 128;
        arg0.field675 += (var2 - arg0.field675) / var1;
        arg0.field627 += (var3 - arg0.field627) / var1;
        arg0.field684 = 0;
        arg0.field677 = arg0.field674;
    }

    @ObfuscatedName("dj.ao(Lar;B)V")
    public static final void method2014(class28 arg0) {
        if (field320 == arg0.field648 || arg0.field658 == -1 || arg0.field661 != 0 || arg0.field660 + 1 > class202.method2997(arg0.field658).field3061[arg0.field659]) {
            int var1 = arg0.field648 - arg0.field672;
            int var2 = field320 - arg0.field672;
            int var3 = arg0.field673 * 64 + arg0.field651 * 128;
            int var4 = arg0.field673 * 64 + arg0.field670 * 128;
            int var5 = arg0.field673 * 64 + arg0.field664 * 128;
            int var6 = arg0.field673 * 64 + arg0.field671 * 128;
            arg0.field675 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field627 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field684 = 0;
        arg0.field677 = arg0.field674;
        arg0.field628 = arg0.field677;
    }

    @ObfuscatedName("n.am(Lar;I)V")
    public static final void method269(class28 arg0) {
        arg0.field626 = arg0.field631;
        if (arg0.field680 == 0) {
            arg0.field684 = 0;
            return;
        }
        if (arg0.field658 != -1 && arg0.field661 == 0) {
            class202 var1 = class202.method2997(arg0.field658);
            if (arg0.field637 > 0 && var1.field3070 == 0) {
                arg0.field684++;
                return;
            }
            if (arg0.field637 <= 0 && var1.field3071 == 0) {
                arg0.field684++;
                return;
            }
        }
        int var2 = arg0.field675;
        int var3 = arg0.field627;
        int var4 = arg0.field681[arg0.field680 - 1] * 128 + arg0.field673 * 64;
        int var5 = arg0.field632[arg0.field680 - 1] * 128 + arg0.field673 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field677 = 1280;
            } else if (var3 > var5) {
                arg0.field677 = 1792;
            } else {
                arg0.field677 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field677 = 768;
            } else if (var3 > var5) {
                arg0.field677 = 256;
            } else {
                arg0.field677 = 512;
            }
        } else if (var3 < var5) {
            arg0.field677 = 1024;
        } else if (var3 > var5) {
            arg0.field677 = 0;
        }
        byte var6 = arg0.field683[arg0.field680 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field675 = var4;
            arg0.field627 = var5;
            arg0.field680--;
            if (arg0.field637 > 0) {
                arg0.field637--;
            }
            return;
        }
        int var7 = arg0.field677 - arg0.field628 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field635;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field668;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field669;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field636;
        }
        if (var8 == -1) {
            var8 = arg0.field668;
        }
        arg0.field626 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class36) {
            var10 = ((class36) arg0).field795.field3037;
        }
        if (var10) {
            if (arg0.field677 != arg0.field628 && arg0.field641 == -1 && arg0.field679 != 0) {
                var9 = 2;
            }
            if (arg0.field680 > 2) {
                var9 = 6;
            }
            if (arg0.field680 > 3) {
                var9 = 8;
            }
            if (arg0.field684 > 0 && arg0.field680 > 1) {
                var9 = 8;
                arg0.field684--;
            }
        } else {
            if (arg0.field680 > 1) {
                var9 = 6;
            }
            if (arg0.field680 > 2) {
                var9 = 8;
            }
            if (arg0.field684 > 0 && arg0.field680 > 1) {
                var9 = 8;
                arg0.field684--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field668 == arg0.field626 && arg0.field652 != -1) {
            arg0.field626 = arg0.field652;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field675 += var9;
                if (arg0.field675 > var4) {
                    arg0.field675 = var4;
                }
            } else if (var2 > var4) {
                arg0.field675 -= var9;
                if (arg0.field675 < var4) {
                    arg0.field675 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field627 += var9;
                if (arg0.field627 > var5) {
                    arg0.field627 = var5;
                }
            } else if (var3 > var5) {
                arg0.field627 -= var9;
                if (arg0.field627 < var5) {
                    arg0.field627 = var5;
                }
            }
        }
        if (arg0.field675 == var4 && arg0.field627 == var5) {
            arg0.field680--;
            if (arg0.field637 > 0) {
                arg0.field637--;
            }
        }
    }

    @ObfuscatedName("ak.ak(Lar;B)V")
    public static final void method799(class28 arg0) {
        arg0.field629 = false;
        if (arg0.field626 != -1) {
            class202 var1 = class202.method2997(arg0.field626);
            if (var1 == null || var1.field3064 == null) {
                arg0.field626 = -1;
            } else {
                arg0.field657++;
                if (arg0.field656 < var1.field3064.length && arg0.field657 > var1.field3061[arg0.field656]) {
                    arg0.field657 = 1;
                    arg0.field656++;
                    method2604(var1, arg0.field656, arg0.field675, arg0.field627);
                }
                if (arg0.field656 >= var1.field3064.length) {
                    arg0.field657 = 0;
                    arg0.field656 = 0;
                    method2604(var1, arg0.field656, arg0.field675, arg0.field627);
                }
            }
        }
        if (arg0.field634 != -1 && field320 >= arg0.field666) {
            if (arg0.field663 < 0) {
                arg0.field663 = 0;
            }
            int var2 = class191.method3043(arg0.field634).field2793;
            if (var2 == -1) {
                arg0.field634 = -1;
            } else {
                class202 var3 = class202.method2997(var2);
                if (var3 == null || var3.field3064 == null) {
                    arg0.field634 = -1;
                } else {
                    arg0.field665++;
                    if (arg0.field663 < var3.field3064.length && arg0.field665 > var3.field3061[arg0.field663]) {
                        arg0.field665 = 1;
                        arg0.field663++;
                        method2604(var3, arg0.field663, arg0.field675, arg0.field627);
                    }
                    if (arg0.field663 >= var3.field3064.length && (arg0.field663 < 0 || arg0.field663 >= var3.field3064.length)) {
                        arg0.field634 = -1;
                    }
                }
            }
        }
        if (arg0.field658 != -1 && arg0.field661 <= 1) {
            class202 var4 = class202.method2997(arg0.field658);
            if (var4.field3070 == 1 && arg0.field637 > 0 && arg0.field672 <= field320 && arg0.field648 < field320) {
                arg0.field661 = 1;
                return;
            }
        }
        if (arg0.field658 != -1 && arg0.field661 == 0) {
            class202 var5 = class202.method2997(arg0.field658);
            if (var5 == null || var5.field3064 == null) {
                arg0.field658 = -1;
            } else {
                arg0.field660++;
                if (arg0.field659 < var5.field3064.length && arg0.field660 > var5.field3061[arg0.field659]) {
                    arg0.field660 = 1;
                    arg0.field659++;
                    method2604(var5, arg0.field659, arg0.field675, arg0.field627);
                }
                if (arg0.field659 >= var5.field3064.length) {
                    arg0.field659 -= var5.field3063;
                    arg0.field630++;
                    if (arg0.field630 >= var5.field3059) {
                        arg0.field658 = -1;
                    } else if (arg0.field659 >= 0 && arg0.field659 < var5.field3064.length) {
                        method2604(var5, arg0.field659, arg0.field675, arg0.field627);
                    } else {
                        arg0.field658 = -1;
                    }
                }
                arg0.field629 = var5.field3056;
            }
        }
        if (arg0.field661 > 0) {
            arg0.field661--;
        }
    }

    @ObfuscatedName("cm.ay(Ln;III)V")
    public static void method1872(class24 arg0, int arg1, int arg2) {
        if (arg0.field658 == arg1 && arg1 != -1) {
            int var3 = class202.method2997(arg1).field3072;
            if (var3 == 1) {
                arg0.field659 = 0;
                arg0.field660 = 0;
                arg0.field661 = arg2;
                arg0.field630 = 0;
            }
            if (var3 == 2) {
                arg0.field630 = 0;
            }
        } else if (arg1 == -1 || arg0.field658 == -1 || class202.method2997(arg1).field3066 >= class202.method2997(arg0.field658).field3066) {
            arg0.field658 = arg1;
            arg0.field659 = 0;
            arg0.field660 = 0;
            arg0.field661 = arg2;
            arg0.field630 = 0;
            arg0.field637 = arg0.field680;
        }
    }

    @ObfuscatedName("l.aq(S)I")
    public static int method197() {
        return field528 ? 2 : 1;
    }

    @ObfuscatedName("cm.aj(I)V")
    public static void method1873() {
        class106.method189(Statics.field1844);
        class116.method2484(Statics.field1844);
        if (Statics.field1576 != null) {
            Statics.field1576.method1972(Statics.field1844);
        }
        Statics.field309.method2020();
        Statics.field1844.setBackground(Color.black);
        Canvas var0 = Statics.field1844;
        var0.setFocusTraversalKeysEnabled(false);
        var0.addKeyListener(class106.field1719);
        var0.addFocusListener(class106.field1719);
        Canvas var1 = Statics.field1844;
        var1.addMouseListener(class116.field1809);
        var1.addMouseMotionListener(class116.field1809);
        var1.addFocusListener(class116.field1809);
        if (Statics.field1576 != null) {
            Statics.field1576.method1971(Statics.field1844);
        }
        if (field474 != -1) {
            method1871(false);
        }
        field1790 = true;
    }

    @ObfuscatedName("av.ap(I)V")
    public static void method887() {
        field310.method2874(230);
        field310.method2651(method197());
        field310.method2625(Statics.field1749);
        field310.method2625(Statics.field2019);
    }

    @ObfuscatedName("p.ai(I)V")
    public static void method236() {
        client var0 = Statics.field309;
        synchronized (Statics.field309) {
            Container var1 = Statics.field309.method2029();
            if (var1 != null) {
                Statics.field209 = Math.max(var1.getSize().width, Statics.field2341);
                Statics.field2669 = Math.max(var1.getSize().height, Statics.field1732);
                if (Statics.field207 == var1) {
                    Insets var2 = Statics.field207.getInsets();
                    Statics.field209 -= var2.right + var2.left;
                    Statics.field2669 -= var2.top + var2.bottom;
                }
                if (Statics.field209 <= 0) {
                    Statics.field209 = 1;
                }
                if (Statics.field2669 <= 0) {
                    Statics.field2669 = 1;
                }
                if (method197() == 1) {
                    Statics.field1749 = field529;
                    Statics.field2019 = field331 * 503;
                } else {
                    Statics.field1749 = Math.min(Statics.field209, 7680);
                    Statics.field2019 = Math.min(Statics.field2669, 2160);
                }
                field1786 = (Statics.field209 - Statics.field1749) / 2;
                field1791 = 0;
                Statics.field1844.setSize(Statics.field1749, Statics.field2019);
                Statics.field1580 = Statics.method3334(Statics.field1749, Statics.field2019, Statics.field1844);
                if (Statics.field207 == var1) {
                    Insets var3 = Statics.field207.getInsets();
                    Statics.field1844.setLocation(field1786 + var3.left, field1791 + var3.top);
                } else {
                    Statics.field1844.setLocation(field1786, field1791);
                }
                method3247();
                if (field474 != -1) {
                    method1871(true);
                }
                method1430();
            }
        }
    }

    @ObfuscatedName("gt.ac(I)V")
    public static void method3247() {
        int var0 = Statics.field1749;
        int var1 = Statics.field2019;
        if (Statics.field209 < var0) {
            int var2 = Statics.field209;
        }
        if (Statics.field2669 < var1) {
            int var3 = Statics.field2669;
        }
        if (Statics.field85 == null) {
            return;
        }
        try {
            client var4 = Statics.field309;
            Object[] var5 = new Object[] { method197() };
            JSObject.getWindow(var4).call("resize", var5);
        } catch (Throwable var7) {
        }
    }

    @ObfuscatedName("bh.av(B)V")
    public static void method1430() {
        int var0 = field1786;
        int var1 = field1791;
        int var2 = Statics.field209 - Statics.field1749 - var0;
        int var3 = Statics.field2669 - Statics.field2019 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field309.method2029();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field207 == var4) {
                Insets var7 = Statics.field207.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field2669);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field209, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field209 + var5 - var2, var6, var2, Statics.field2669);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field2669 + var6 - var3, Statics.field209, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("p.as(Ljava/lang/String;ZI)V")
    public static final void method239(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field186.method3710(arg0, 250);
        int var6 = Statics.field186.method3666(arg0, 250) * 13;
        class220.method3807(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class220.method3789(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field186.method3697(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        Statics.method209(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field1844.getGraphics();
                Statics.field1580.method3765(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field1844.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field312; var13++) {
            if (field524[var13] + field316[var13] > var9 && field316[var13] < var9 + var11 && field520[var13] + field412[var13] > var10 && field412[var13] < var10 + var12) {
                field489[var13] = true;
            }
        }
    }

    @ObfuscatedName("aq.al(IIIIZB)V")
    public static final void method811(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field569 - field568) * var5 / 100 + field568;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field574) {
            short var8 = field574;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field573) {
                var6 = field573;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class220.method3776();
                    class220.method3807(arg0, arg1, var10, arg3, -16777216);
                    class220.method3807(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field575) {
            short var11 = field575;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field325) {
                var6 = field325;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class220.method3776();
                    class220.method3807(arg0, arg1, arg2, var13, -16777216);
                    class220.method3807(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field523 - field570) * var5 / 100 + field570;
        field580 = arg3 * var6 * var14 / 85504 << 1;
        if (field578 != arg2 || field579 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class85.field1442[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class88.method1703(var15, 500, 800, arg2, arg3);
        }
        field576 = arg0;
        field457 = arg1;
        field578 = arg2;
        field579 = arg3;
    }

    @ObfuscatedName("eo.ag(Lr;I)V")
    public static final void method2546(class16 arg0) {
        if (Statics.field266.field675 >> 7 == field548 && Statics.field266.field627 >> 7 == field425) {
            field548 = 0;
        }
        int var1 = class46.field935;
        int[] var2 = class46.field926;
        int var3 = var1;
        if (class16.field185 == arg0 || class16.field200 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class24 var5;
            int var6;
            if (class16.field185 == arg0) {
                var5 = Statics.field266;
                var6 = Statics.field266.field277 << 14;
            } else if (class16.field200 == arg0) {
                var5 = field434[field408];
                var6 = field408 << 14;
            } else {
                var5 = field434[var2[var4]];
                var6 = var2[var4] << 14;
                if (class16.field201 == arg0 && field408 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method251() && !var5.field291) {
                var5.field295 = false;
                if ((field440 && var1 > 50 || var1 > 200) && class16.field185 != arg0 && var5.field631 == var5.field626) {
                    var5.field295 = true;
                }
                int var7 = var5.field675 >> 7;
                int var8 = var5.field627 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field284 == null || field320 < var5.field279 || field320 >= var5.field293) {
                        if ((var5.field675 & 0x7F) == 64 && (var5.field627 & 0x7F) == 64) {
                            if (field535 == field374[var7][var8]) {
                                continue;
                            }
                            field374[var7][var8] = field535;
                        }
                        var5.field278 = method22(var5.field675, var5.field627, Statics.field744);
                        Statics.field171.method1680(Statics.field744, var5.field675, var5.field627, var5.field278, 60, var5, var5.field628, var6, var5.field629);
                    } else {
                        var5.field295 = false;
                        var5.field278 = method22(var5.field675, var5.field627, Statics.field744);
                        Statics.field171.method1781(Statics.field744, var5.field675, var5.field627, var5.field278, 60, var5, var5.field628, var6, var5.field271, var5.field286, var5.field287, var5.field288);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aj.ad(B)V")
    public static final void method839() {
        for (class43 var0 = (class43) field326.method2290(); var0 != null; var0 = (class43) field326.method2287()) {
            if (Statics.field744 != var0.field885 || field320 > var0.field891) {
                var0.method2278();
            } else if (field320 >= var0.field889) {
                if (var0.field894 > 0) {
                    class36 var1 = field351[var0.field894 - 1];
                    if (var1 != null && var1.field675 >= 0 && var1.field675 < 13312 && var1.field627 >= 0 && var1.field627 < 13312) {
                        var0.method848(var1.field675, var1.field627, method22(var1.field675, var1.field627, var0.field885) - var0.field895, field320);
                    }
                }
                if (var0.field894 < 0) {
                    int var2 = -var0.field894 - 1;
                    class24 var3;
                    if (field435 == var2) {
                        var3 = Statics.field266;
                    } else {
                        var3 = field434[var2];
                    }
                    if (var3 != null && var3.field675 >= 0 && var3.field675 < 13312 && var3.field627 >= 0 && var3.field627 < 13312) {
                        var0.method848(var3.field675, var3.field627, method22(var3.field675, var3.field627, var0.field885) - var0.field895, field320);
                    }
                }
                var0.method847(field329);
                Statics.field171.method1680(Statics.field744, (int) var0.field909, (int) var0.field897, (int) var0.field902, 60, var0, var0.field888, -1, false);
            }
        }
    }

    @ObfuscatedName("al.au(I)V")
    public static final void method943() {
        for (class34 var0 = (class34) field444.method2290(); var0 != null; var0 = (class34) field444.method2287()) {
            if (Statics.field744 != var0.field767 || var0.field774) {
                var0.method2278();
            } else if (field320 >= var0.field766) {
                var0.method753(field329);
                if (var0.field774) {
                    var0.method2278();
                } else {
                    Statics.field171.method1680(var0.field767, var0.field768, var0.field769, var0.field777, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("h.bj(I)I")
    public static final int method79() {
        if (Statics.field85.field718) {
            return Statics.field744;
        }
        int var0 = 3;
        if (Statics.field610 < 310) {
            int var1 = Statics.field1111 >> 7;
            int var2 = Statics.field784 >> 7;
            int var3 = Statics.field266.field675 >> 7;
            int var4 = Statics.field266.field627 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field744;
            }
            if ((class11.field123[Statics.field744][var1][var2] & 0x4) != 0) {
                var0 = Statics.field744;
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
                    if ((class11.field123[Statics.field744][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field744;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class11.field123[Statics.field744][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field744;
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
                    if ((class11.field123[Statics.field744][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field744;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class11.field123[Statics.field744][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field744;
                        }
                    }
                }
            }
        }
        if (Statics.field266.field675 >= 0 && Statics.field266.field627 >= 0 && Statics.field266.field675 < 13312 && Statics.field266.field627 < 13312) {
            if ((class11.field123[Statics.field744][Statics.field266.field675 >> 7][Statics.field266.field627 >> 7] & 0x4) != 0) {
                var0 = Statics.field744;
            }
            return var0;
        } else {
            return Statics.field744;
        }
    }

    @ObfuscatedName("fr.bd(Lar;IIIIII)V")
    public static final void method2982(class28 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method251()) {
            return;
        }
        if (arg0 instanceof class36) {
            class200 var6 = ((class36) arg0).field795;
            if (var6.field3033 != null) {
                var6 = var6.method3506();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class46.field935;
        int[] var8 = class46.field926;
        int var9 = 3;
        if (!arg0.field638.method2256()) {
            method2908(arg0, arg0.field655 + 15);
            for (class35 var10 = (class35) arg0.field638.method2253(); var10 != null; var10 = (class35) arg0.field638.method2265()) {
                class29 var11 = var10.method761(field320);
                if (var11 != null) {
                    class194 var12 = var10.field790;
                    class225 var13 = var12.method3321();
                    class225 var14 = var12.method3320();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field2844;
                    } else {
                        if (var12.field2842 * 2 < var14.field3223) {
                            var15 = var12.field2842;
                        }
                        var16 = var14.field3223 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field320 - var11.field690;
                    int var20 = var11.field688 * var16 / var12.field2844;
                    int var23;
                    if (var11.field691 > var19) {
                        int var21 = var12.field2837 == 0 ? 0 : var19 / var12.field2837 * var12.field2837;
                        int var22 = var11.field689 * var16 / var12.field2844;
                        var23 = (var20 - var22) * var21 / var11.field691 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field691 + var12.field2830 - var19;
                        if (var12.field2836 >= 0) {
                            var17 = (var24 << 8) / (var12.field2830 - var12.field2836);
                        }
                    }
                    if (var11.field688 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field356 + arg2 - (var16 >> 1);
                    int var26 = field340 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field356 > -1) {
                            class220.method3807(var25, var26, var23, 5, 65280);
                            class220.method3807(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                            var13.method3919(var27, var26, var17);
                            class220.method3778(var27, var26, var27 + var28, var26 + var29);
                            var14.method3919(var27, var26, var17);
                        } else {
                            var13.method3903(var27, var26);
                            class220.method3778(var27, var26, var27 + var28, var26 + var29);
                            var14.method3903(var27, var26);
                        }
                        class220.method3795(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method762()) {
                    var10.method2278();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class24 var30 = (class24) arg0;
            if (var30.field291) {
                return;
            }
            if (var30.field272 != -1 || var30.field273 != -1) {
                method2908(arg0, arg0.field655 + 15);
                if (field356 > -1) {
                    if (var30.field272 != -1) {
                        Statics.field195[var30.field272].method3903(field356 + arg2 - 12, field340 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field273 != -1) {
                        Statics.field2038[var30.field273].method3903(field356 + arg2 - 12, field340 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field459 == 10 && field363 == var8[arg1]) {
                method2908(arg0, arg0.field655 + 15);
                if (field356 > -1) {
                    Statics.field190[1].method3903(field356 + arg2 - 12, field340 + arg3 - var9);
                }
            }
        } else {
            class200 var31 = ((class36) arg0).field795;
            if (var31.field3033 != null) {
                var31 = var31.method3506();
            }
            if (var31.field3031 >= 0 && var31.field3031 < Statics.field2038.length) {
                method2908(arg0, arg0.field655 + 15);
                if (field356 > -1) {
                    Statics.field2038[var31.field3031].method3903(field356 + arg2 - 12, field340 + arg3 - 30);
                }
            }
            if (field459 == 1 && field330 == field571[arg1 - var7] && field320 % 20 < 10) {
                method2908(arg0, arg0.field655 + 15);
                if (field356 > -1) {
                    Statics.field190[0].method3903(field356 + arg2 - 12, field340 + arg3 - 28);
                }
            }
        }
        if (arg0.field639 != null && (arg1 >= var7 || !arg0.field662 && (field308 == 4 || !arg0.field640 && (field308 == 0 || field308 == 3 || field308 == 1 && method229(((class24) arg0).field283, false))))) {
            method2908(arg0, arg0.field655);
            if (field356 > -1 && field353 < field327) {
                field371[field353] = Statics.field3199.method3663(arg0.field639) / 2;
                field411[field353] = Statics.field3199.field3121;
                field486[field353] = field356;
                field494[field353] = field340;
                field413[field353] = arg0.field643;
                field414[field353] = arg0.field644;
                field460[field353] = arg0.field642;
                field502[field353] = arg0.field639;
                field353++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field678[var32];
            int var34 = arg0.field646[var32];
            class197 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field320) {
                    continue;
                }
                var35 = class197.method3064(arg0.field646[var32]);
                var36 = var35.field2877;
                if (var35 != null && var35.field2865 != null) {
                    var35 = var35.method3372();
                    if (var35 == null) {
                        arg0.field678[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field682[var32];
            class197 var38 = null;
            if (var37 >= 0) {
                var38 = class197.method3064(var37);
                if (var38 != null && var38.field2865 != null) {
                    var38 = var38.method3372();
                }
            }
            if (var33 - var36 <= field320) {
                if (var35 == null) {
                    arg0.field678[var32] = -1;
                } else {
                    method2908(arg0, arg0.field655 / 2);
                    if (field356 > -1) {
                        if (var32 == 1) {
                            field340 -= 20;
                        }
                        if (var32 == 2) {
                            field356 -= 15;
                            field340 -= 10;
                        }
                        if (var32 == 3) {
                            field356 += 15;
                            field340 -= 10;
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
                        class225 var64 = var35.method3389();
                        if (var64 != null) {
                            var43 = var64.field3223;
                            int var65 = var64.field3222;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3230;
                        }
                        class225 var66 = var35.method3375();
                        if (var66 != null) {
                            var44 = var66.field3223;
                            int var67 = var66.field3222;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3230;
                        }
                        class225 var68 = var35.method3376();
                        if (var68 != null) {
                            var45 = var68.field3223;
                            int var69 = var68.field3222;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3230;
                        }
                        class225 var70 = var35.method3377();
                        if (var70 != null) {
                            var46 = var70.field3223;
                            int var71 = var70.field3222;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3230;
                        }
                        if (var38 != null) {
                            var51 = var38.method3389();
                            if (var51 != null) {
                                var55 = var51.field3223;
                                int var72 = var51.field3222;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3230;
                            }
                            var52 = var38.method3375();
                            if (var52 != null) {
                                var56 = var52.field3223;
                                int var73 = var52.field3222;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3230;
                            }
                            var53 = var38.method3376();
                            if (var53 != null) {
                                var57 = var53.field3223;
                                int var74 = var53.field3222;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3230;
                            }
                            var54 = var38.method3377();
                            if (var54 != null) {
                                var58 = var54.field3223;
                                int var75 = var54.field3222;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3230;
                            }
                        }
                        class209 var76 = var35.method3378();
                        if (var76 == null) {
                            var76 = Statics.field728;
                        }
                        class209 var77;
                        if (var38 == null) {
                            var77 = Statics.field728;
                        } else {
                            var77 = var38.method3378();
                            if (var77 == null) {
                                var77 = Statics.field728;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method3373(arg0.field647[var32]);
                        int var83 = var76.method3663(var82);
                        if (var38 != null) {
                            var79 = var38.method3373(arg0.field650[var32]);
                            var81 = var77.method3663(var79);
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
                        int var100 = arg0.field678[var32] - field320;
                        int var101 = var35.field2882 - var35.field2882 * var100 / var35.field2877;
                        int var102 = var35.field2883 * var100 / var35.field2877 + -var35.field2883;
                        int var103 = field356 + arg2 - (var92 >> 1) + var101;
                        int var104 = field340 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field2887 + var104 + 15;
                        int var108 = var107 - var76.field3115;
                        int var109 = var76.field3116 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field2887 + var104 + 15;
                            int var111 = var110 - var77.field3115;
                            int var112 = var77.field3116 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field2873 >= 0) {
                            var115 = (var100 << 8) / (var35.field2877 - var35.field2873);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method3919(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method3919(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method3919(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method3919(var93 + var103 - var50, var104, var115);
                            }
                            var76.method3669(var82, var90 + var103, var107, var35.field2876, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method3919(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method3919(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method3919(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method3919(var97 + var103 - var62, var104, var115);
                                }
                                var77.method3669(var79, var98 + var103, var110, var38.field2876, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method3903(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method3903(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method3903(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method3903(var93 + var103 - var50, var104);
                            }
                            var76.method3668(var82, var90 + var103, var107, var35.field2876 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method3903(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method3903(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method3903(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method3903(var97 + var103 - var62, var104);
                                }
                                var77.method3668(var79, var98 + var103, var110, var38.field2876 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dy.bb(IIIII)V")
    public static final void method1990(int arg0, int arg1, int arg2, int arg3) {
        field353 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class46.field935;
        int[] var7 = class46.field926;
        for (int var8 = 0; var8 < field352 + var6; var8++) {
            class28 var9;
            if (var8 < var6) {
                var9 = field434[var7[var8]];
                if (field408 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field351[field571[var8 - var6]];
            }
            method2982(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method2982(field434[field408], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field353; var10++) {
            int var11 = field486[var10];
            int var12 = field494[var10];
            int var13 = field371[var10];
            int var14 = field411[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field494[var16] - field411[var16] && var12 - var14 < field494[var16] + 2 && var11 - var13 < field486[var16] + field371[var16] && var11 + var13 > field486[var16] - field371[var16] && field494[var16] - field411[var16] < var12) {
                        var12 = field494[var16] - field411[var16];
                        var15 = true;
                    }
                }
            }
            field356 = field486[var10];
            field340 = field494[var10] = var12;
            String var17 = field502[var10];
            if (field476 == 0) {
                int var18 = 16776960;
                if (field413[var10] < 6) {
                    var18 = field465[field413[var10]];
                }
                if (field413[var10] == 6) {
                    var18 = field535 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field413[var10] == 7) {
                    var18 = field535 % 20 < 10 ? 255 : 65535;
                }
                if (field413[var10] == 8) {
                    var18 = field535 % 20 < 10 ? 45056 : 8454016;
                }
                if (field413[var10] == 9) {
                    int var19 = 150 - field460[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field413[var10] == 10) {
                    int var20 = 150 - field460[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field413[var10] == 11) {
                    int var21 = 150 - field460[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field414[var10] == 0) {
                    Statics.field3199.method3743(var17, field356 + arg0, field340 + arg1, var18, 0);
                }
                if (field414[var10] == 1) {
                    Statics.field3199.method3706(var17, field356 + arg0, field340 + arg1, var18, 0, field535);
                }
                if (field414[var10] == 2) {
                    Statics.field3199.method3674(var17, field356 + arg0, field340 + arg1, var18, 0, field535);
                }
                if (field414[var10] == 3) {
                    Statics.field3199.method3675(var17, field356 + arg0, field340 + arg1, var18, 0, field535, 150 - field460[var10]);
                }
                if (field414[var10] == 4) {
                    int var22 = (150 - field460[var10]) * (Statics.field3199.method3663(var17) + 100) / 150;
                    class220.method3778(field356 + arg0 - 50, arg1, field356 + arg0 + 50, arg1 + arg3);
                    Statics.field3199.method3668(var17, field356 + arg0 + 50 - var22, field340 + arg1, var18, 0);
                    class220.method3795(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field414[var10] == 5) {
                    int var23 = 150 - field460[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class220.method3778(arg0, field340 + arg1 - Statics.field3199.field3121 - 1, arg0 + arg2, field340 + arg1 + 5);
                    Statics.field3199.method3743(var17, field356 + arg0, field340 + arg1 + var24, var18, 0);
                    class220.method3795(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field3199.method3743(var17, field356 + arg0, field340 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("aw.bt(I)V")
    public static final void method951() {
        field433 = 0;
        int var0 = (Statics.field266.field675 >> 7) + Statics.field791;
        int var1 = (Statics.field266.field627 >> 7) + Statics.field37;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field433 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field433 = 1;
        }
        if (field433 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field433 = 0;
        }
    }

    @ObfuscatedName("fd.bl(Lar;II)V")
    public static final void method2908(class28 arg0, int arg1) {
        method224(arg0.field675, arg0.field627, arg1);
    }

    @ObfuscatedName("t.bv(IIII)V")
    public static final void method224(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field356 = -1;
            field340 = -1;
            return;
        }
        int var3 = method22(arg0, arg1, Statics.field744) - arg2;
        int var4 = arg0 - Statics.field1111;
        int var5 = var3 - Statics.field82;
        int var6 = arg1 - Statics.field784;
        int var7 = class85.field1442[Statics.field610];
        int var8 = class85.field1463[Statics.field610];
        int var9 = class85.field1442[Statics.field1750];
        int var10 = class85.field1463[Statics.field1750];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field356 = field580 * var11 / var15 + field578 / 2;
            field340 = field580 * var14 / var15 + field579 / 2;
        } else {
            field356 = -1;
            field340 = -1;
        }
    }

    @ObfuscatedName("j.bm(IIII)I")
    public static final int method22(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class11.field123[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class11.field131[var5][var3][var4] + class11.field131[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class11.field131[var5][var3][var4 + 1] + class11.field131[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ck.bc(ZI)V")
    public static final void method1666(boolean arg0) {
        field543 = arg0;
        if (!field543) {
            int var1 = field358.method2757();
            int var2 = field358.method2677();
            int var3 = field358.method2745();
            Statics.field53 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field53[var4][var5] = field358.method2644();
                }
            }
            Statics.field719 = new int[var3];
            Statics.field267 = new int[var3];
            Statics.field66 = new int[var3];
            Statics.field243 = new byte[var3][];
            Statics.field2020 = new byte[var3][];
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
                        Statics.field719[var7] = var10;
                        Statics.field267[var7] = Statics.field779.method3113("m" + var8 + "_" + var9);
                        Statics.field66[var7] = Statics.field779.method3113("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method3072(var2, var1);
            return;
        }
        int var11 = field358.method2677();
        int var12 = field358.method2745();
        int var13 = field358.method2745();
        field358.method2883();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field358.method2895(1);
                    if (var17 == 1) {
                        field313[var14][var15][var16] = field358.method2895(26);
                    } else {
                        field313[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field358.method2880();
        Statics.field53 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field53[var18][var19] = field358.method2644();
            }
        }
        Statics.field719 = new int[var13];
        Statics.field267 = new int[var13];
        Statics.field66 = new int[var13];
        Statics.field243 = new byte[var13][];
        Statics.field2020 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field313[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field719[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field719[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field267[var20] = Statics.field779.method3113("m" + var29 + "_" + var30);
                            Statics.field66[var20] = Statics.field779.method3113("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method3072(var11, var12);
    }

    @ObfuscatedName("ff.be(III)V")
    public static final void method3072(int arg0, int arg1) {
        if (Statics.field1204 == arg0 && Statics.field1436 == arg1) {
            return;
        }
        Statics.field1204 = arg0;
        Statics.field1436 = arg1;
        method3241(25);
        method239(class174.field2354, true);
        int var2 = Statics.field791;
        int var3 = Statics.field37;
        Statics.field791 = (arg0 - 6) * 8;
        Statics.field37 = (arg1 - 6) * 8;
        int var4 = Statics.field791 - var2;
        int var5 = Statics.field37 - var3;
        int var6 = Statics.field791;
        int var7 = Statics.field37;
        for (int var8 = 0; var8 < 32768; var8++) {
            class36 var9 = field351[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field681[var10] -= var4;
                    var9.field632[var10] -= var5;
                }
                var9.field675 -= var4 * 128;
                var9.field627 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class24 var12 = field434[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field681[var13] -= var4;
                    var12.field632[var13] -= var5;
                }
                var12.field675 -= var4 * 128;
                var12.field627 -= var5 * 128;
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
                        field522[var24][var20][var21] = field522[var24][var22][var23];
                    } else {
                        field522[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class26 var25 = (class26) field445.method2290(); var25 != null; var25 = (class26) field445.method2287()) {
            var25.field599 -= var4;
            var25.field601 -= var5;
            if (var25.field599 < 0 || var25.field601 < 0 || var25.field599 >= 104 || var25.field601 >= 104) {
                var25.method2278();
            }
        }
        if (field548 != 0) {
            field548 -= var4;
            field425 -= var5;
        }
        field420 = 0;
        field441 = false;
        field544 = -1;
        field444.method2284();
        field326.method2284();
        for (int var26 = 0; var26 < 4; var26++) {
            field373[var26].method2146();
        }
    }

    @ObfuscatedName("as.bk(ZI)V")
    public static final void method919(boolean arg0) {
        method927();
        field498++;
        if (field498 < 50 && !arg0) {
            return;
        }
        field498 = 0;
        if (field588 || Statics.field16 == null) {
            return;
        }
        field310.method2874(184);
        try {
            Statics.field16.method1993(field310.field2091, 0, field310.field2086);
            field310.field2086 = 0;
        } catch (IOException var2) {
            field588 = true;
        }
    }

    @ObfuscatedName("x.bq(IIIIII)V")
    public static final void method13(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field171.method1835(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field171.method1698(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field686.field3231;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class198 var13 = class198.method3366(var12);
            if (var13.field2943 == -1) {
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
                class223 var14 = Statics.field1117[var13.field2943];
                if (var14 != null) {
                    int var15 = (var13.field2910 * 4 - var14.field3210) / 2;
                    int var16 = (var13.field2911 * 4 - var14.field3211) / 2;
                    var14.method3855(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field2911) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field171.method1700(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field171.method1698(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class198 var22 = class198.method3366(var21);
            if (var22.field2943 != -1) {
                class223 var23 = Statics.field1117[var22.field2943];
                if (var23 != null) {
                    int var24 = (var22.field2910 * 4 - var23.field3210) / 2;
                    int var25 = (var22.field2911 * 4 - var23.field3211) / 2;
                    var23.method3855(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field2911) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field686.field3231;
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
        int var29 = Statics.field171.method1697(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class198 var31 = class198.method3366(var30);
        if (var31.field2943 == -1) {
            return;
        }
        class223 var32 = Statics.field1117[var31.field2943];
        if (var32 != null) {
            int var33 = (var31.field2910 * 4 - var32.field3210) / 2;
            int var34 = (var31.field2911 * 4 - var32.field3211) / 2;
            var32.method3855(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field2911) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("eo.bp(B)Z")
    public static final boolean method2542() {
        if (Statics.field16 == null) {
            return false;
        }
        try {
            int var0 = Statics.field16.method1992();
            if (var0 == 0) {
                return false;
            }
            if (field360 == -1) {
                Statics.field16.method1995(field358.field2091, 0, 1);
                field358.field2086 = 0;
                field360 = field358.method2877();
                field359 = class213.field3136[field360];
                var0--;
            }
            if (field359 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field16.method1995(field358.field2091, 0, 1);
                field359 = field358.field2091[0] & 0xFF;
                var0--;
            }
            if (field359 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field16.method1995(field358.field2091, 0, 2);
                field358.field2086 = 0;
                field359 = field358.method2745();
                var0 -= 2;
            }
            if (var0 < field359) {
                return false;
            }
            field358.field2086 = 0;
            Statics.field16.method1995(field358.field2091, 0, field359);
            field361 = 0;
            field365 = field364;
            field364 = field484;
            field484 = field360;
            if (field360 == 209) {
                Statics.field262 = field358.method2668();
                Statics.field2338 = field358.method2668();
                field360 = -1;
                return true;
            }
            if (field360 == 21) {
                int var1 = field358.method2814();
                int var2 = field358.method2677();
                class170 var3 = class170.method669(var1);
                if (var3.field2285 != 1 || var3.field2188 != var2) {
                    var3.field2285 = 1;
                    var3.field2188 = var2;
                    method37(var3);
                }
                field360 = -1;
                return true;
            }
            if (field360 == 25) {
                field441 = true;
                Statics.field1702 = field358.method2701();
                Statics.field1579 = field358.method2701();
                Statics.field241 = field358.method2745();
                Statics.field1647 = field358.method2701();
                Statics.field48 = field358.method2701();
                if (Statics.field48 >= 100) {
                    int var4 = Statics.field1702 * 128 + 64;
                    int var5 = Statics.field1579 * 128 + 64;
                    int var6 = method22(var4, var5, Statics.field744) - Statics.field241;
                    int var7 = var4 - Statics.field1111;
                    int var8 = var6 - Statics.field82;
                    int var9 = var5 - Statics.field784;
                    int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
                    Statics.field610 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
                    Statics.field1750 = (int) (Math.atan2((double) var7, (double) var9) * -325.949D) & 0x7FF;
                    if (Statics.field610 < 128) {
                        Statics.field610 = 128;
                    }
                    if (Statics.field610 > 383) {
                        Statics.field610 = 383;
                    }
                }
                field360 = -1;
                return true;
            }
            if (field360 == 88) {
                int var11 = field358.method2745();
                int var12 = field358.method2701();
                int var13 = field358.method2745();
                method2544(var11, var12, var13);
                field360 = -1;
                return true;
            }
            if (field360 == 80) {
                boolean var14 = field358.method2701() == 1;
                if (var14) {
                    Statics.field2663 = class156.method1888() - field358.method2645();
                    Statics.field1703 = new class2(field358, true);
                } else {
                    Statics.field1703 = null;
                }
                field510 = field499;
                field360 = -1;
                return true;
            }
            if (field360 == 41) {
                int var15 = field358.method2675();
                int var16 = field358.method2644();
                class166.field2153[var15] = var16;
                if (class166.field2154[var15] != var16) {
                    class166.field2154[var15] = var16;
                }
                method264(var15);
                field500[++field501 - 1 & 0x1F] = var15;
                field360 = -1;
                return true;
            }
            if (field360 == 68) {
                int var17 = field358.method2745();
                int var18 = field358.method2745();
                int var19 = field358.method2814();
                class170 var20 = class170.method669(var19);
                var20.field2243 = (var18 << 16) + var17;
                field360 = -1;
                return true;
            }
            if (field360 == 24) {
                int var21 = field359 + field358.field2086;
                int var22 = field358.method2745();
                int var23 = field358.method2745();
                if (field474 != var22) {
                    field474 = var22;
                    method1871(false);
                    method3364(field474);
                    Statics.method866(field474);
                    for (int var24 = 0; var24 < 100; var24++) {
                        field519[var24] = true;
                    }
                }
                while (var23-- > 0) {
                    int var25 = field358.method2644();
                    int var26 = field358.method2745();
                    int var27 = field358.method2701();
                    class18 var28 = (class18) field346.method2247((long) var25);
                    if (var28 != null && var28.field216 != var26) {
                        method66(var28, true);
                        var28 = null;
                    }
                    if (var28 == null) {
                        var28 = method212(var25, var26, var27);
                    }
                    var28.field212 = true;
                }
                for (class18 var29 = (class18) field346.method2233(); var29 != null; var29 = (class18) field346.method2234()) {
                    if (var29.field212) {
                        var29.field212 = false;
                    } else {
                        method66(var29, true);
                    }
                }
                field516 = new class126(512);
                while (field358.field2086 < var21) {
                    int var30 = field358.method2644();
                    int var31 = field358.method2745();
                    int var32 = field358.method2745();
                    int var33 = field358.method2644();
                    for (int var34 = var31; var34 <= var32; var34++) {
                        long var35 = ((long) var30 << 32) + (long) var34;
                        field516.method2245(new class134(var33), var35);
                    }
                }
                field360 = -1;
                return true;
            }
            if (field360 == 210) {
                field437 = 0;
                field354 = 0;
                field358.method2883();
                int var37 = field358.method2895(8);
                if (var37 < field352) {
                    for (int var38 = var37; var38 < field352; var38++) {
                        field438[++field437 - 1] = field571[var38];
                    }
                }
                if (var37 > field352) {
                    throw new RuntimeException("");
                }
                field352 = 0;
                for (int var39 = 0; var39 < var37; var39++) {
                    int var40 = field571[var39];
                    class36 var41 = field351[var40];
                    int var42 = field358.method2895(1);
                    if (var42 == 0) {
                        field571[++field352 - 1] = var40;
                        var41.field649 = field320;
                    } else {
                        int var43 = field358.method2895(2);
                        if (var43 == 0) {
                            field571[++field352 - 1] = var40;
                            var41.field649 = field320;
                            field431[++field354 - 1] = var40;
                        } else if (var43 == 1) {
                            field571[++field352 - 1] = var40;
                            var41.field649 = field320;
                            int var44 = field358.method2895(3);
                            var41.method772(var44, (byte) 1);
                            int var45 = field358.method2895(1);
                            if (var45 == 1) {
                                field431[++field354 - 1] = var40;
                            }
                        } else if (var43 == 2) {
                            field571[++field352 - 1] = var40;
                            var41.field649 = field320;
                            int var46 = field358.method2895(3);
                            var41.method772(var46, (byte) 2);
                            int var47 = field358.method2895(3);
                            var41.method772(var47, (byte) 2);
                            int var48 = field358.method2895(1);
                            if (var48 == 1) {
                                field431[++field354 - 1] = var40;
                            }
                        } else if (var43 == 3) {
                            field438[++field437 - 1] = var40;
                        }
                    }
                }
                while (field358.method2878(field359) >= 27) {
                    int var49 = field358.method2895(15);
                    if (var49 == 32767) {
                        break;
                    }
                    boolean var50 = false;
                    if (field351[var49] == null) {
                        field351[var49] = new class36();
                        var50 = true;
                    }
                    class36 var51 = field351[var49];
                    field571[++field352 - 1] = var49;
                    var51.field649 = field320;
                    int var52 = field358.method2895(5);
                    if (var52 > 15) {
                        var52 -= 32;
                    }
                    int var53 = field442[field358.method2895(3)];
                    if (var50) {
                        var51.field677 = var51.field628 = var53;
                    }
                    var51.field795 = class200.method1605(field358.method2895(14));
                    int var54 = field358.method2895(5);
                    if (var54 > 15) {
                        var54 -= 32;
                    }
                    int var55 = field358.method2895(1);
                    if (var55 == 1) {
                        field431[++field354 - 1] = var49;
                    }
                    int var56 = field358.method2895(1);
                    var51.field673 = var51.field795.field3009;
                    var51.field679 = var51.field795.field3032;
                    if (var51.field679 == 0) {
                        var51.field628 = 0;
                    }
                    var51.field668 = var51.field795.field3034;
                    var51.field635 = var51.field795.field3016;
                    var51.field636 = var51.field795.field3006;
                    var51.field669 = var51.field795.field3018;
                    var51.field631 = var51.field795.field3012;
                    var51.field685 = var51.field795.field3039;
                    var51.field633 = var51.field795.field3020;
                    var51.method774(Statics.field266.field681[0] + var52, Statics.field266.field632[0] + var54, var56 == 1);
                }
                field358.method2880();
                method3342();
                for (int var57 = 0; var57 < field437; var57++) {
                    int var58 = field438[var57];
                    if (field320 != field351[var58].field649) {
                        field351[var58].field795 = null;
                        field351[var58] = null;
                    }
                }
                if (field359 != field358.field2086) {
                    throw new RuntimeException(field358.field2086 + class38.field811 + field359);
                }
                for (int var59 = 0; var59 < field352; var59++) {
                    if (field351[field571[var59]] == null) {
                        throw new RuntimeException(var59 + class38.field811 + field352);
                    }
                }
                field360 = -1;
                return true;
            }
            if (field360 == 118) {
                field358.field2086 += 28;
                if (field358.method2693()) {
                    method238(field358, field358.field2086 - 28);
                }
                field360 = -1;
                return true;
            }
            if (field360 == 14) {
                field550 = field358.method2701();
                field360 = -1;
                return true;
            }
            if (field360 == 223) {
                method199();
                field415 = field358.method2695();
                field511 = field499;
                field360 = -1;
                return true;
            }
            if (field360 == 156) {
                int var60 = field358.method2644();
                int var61 = field358.method2745();
                if (var60 < -70000) {
                    var61 += 32768;
                }
                class170 var62;
                if (var60 >= 0) {
                    var62 = class170.method669(var60);
                } else {
                    var62 = null;
                }
                if (var62 != null) {
                    for (int var63 = 0; var63 < var62.field2305.length; var63++) {
                        var62.field2305[var63] = 0;
                        var62.field2306[var63] = 0;
                    }
                }
                class13.method2854(var61);
                int var64 = field358.method2745();
                for (int var65 = 0; var65 < var64; var65++) {
                    int var66 = field358.method2666();
                    if (var66 == 255) {
                        var66 = field358.method2644();
                    }
                    int var67 = field358.method2675();
                    if (var62 != null && var65 < var62.field2305.length) {
                        var62.field2305[var65] = var67;
                        var62.field2306[var65] = var66;
                    }
                    class13.method1900(var61, var65, var67 - 1, var66);
                }
                if (var62 != null) {
                    method37(var62);
                }
                method199();
                field379[++field503 - 1 & 0x1F] = var61 & 0x7FFF;
                field360 = -1;
                return true;
            }
            if (field360 == 47) {
                int var68 = field358.method2677();
                class13.method769(var68);
                field379[++field503 - 1 & 0x1F] = var68 & 0x7FFF;
                field360 = -1;
                return true;
            }
            if (field360 == 106) {
                for (int var69 = 0; var69 < class166.field2154.length; var69++) {
                    if (class166.field2154[var69] != class166.field2153[var69]) {
                        class166.field2154[var69] = class166.field2153[var69];
                        method264(var69);
                        field500[++field501 - 1 & 0x1F] = var69;
                    }
                }
                field360 = -1;
                return true;
            }
            if (field360 == 237) {
                String var70 = field358.method2699();
                long var71 = (long) field358.method2745();
                long var73 = (long) field358.method2643();
                class178[] var75 = new class178[] { class178.field2656, class178.field2660, class178.field2654, class178.field2653, class178.field2658, class178.field2655 };
                class178 var76 = (class178) Statics.method78(var75, field358.method2701());
                long var77 = (var71 << 32) + var73;
                boolean var79 = false;
                for (int var80 = 0; var80 < 100; var80++) {
                    if (field556[var80] == var77) {
                        var79 = true;
                        break;
                    }
                }
                if (method2088(var70)) {
                    var79 = true;
                }
                if (!var79 && field433 == 0) {
                    field556[field536] = var77;
                    field536 = (field536 + 1) % 100;
                    String var81 = class210.method3667(class208.method65(class211.method3068(field358)));
                    byte var82;
                    if (var76.field2662) {
                        var82 = 7;
                    } else {
                        var82 = 3;
                    }
                    if (var76.field2659 == -1) {
                        class48.method685(var82, var70, var81);
                    } else {
                        class48.method685(var82, class38.method2016(var76.field2659) + var70, var81);
                    }
                }
                field360 = -1;
                return true;
            }
            if (field360 == 201) {
                int var83 = field358.method2745();
                int var84 = field358.method2814();
                class170 var85 = class170.method669(var84);
                if (var85 != null && var85.field2189 == 0) {
                    if (var83 > var85.field2321 - var85.field2302) {
                        var83 = var85.field2321 - var85.field2302;
                    }
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var85.field2209 != var83) {
                        var85.field2209 = var83;
                        method37(var85);
                    }
                }
                field360 = -1;
                return true;
            }
            if (field360 == 221) {
                while (field358.field2086 < field359) {
                    boolean var86 = field358.method2701() == 1;
                    String var87 = field358.method2699();
                    String var88 = field358.method2699();
                    int var89 = field358.method2745();
                    int var90 = field358.method2701();
                    int var91 = field358.method2701();
                    boolean var92 = (var91 & 0x2) != 0;
                    boolean var93 = (var91 & 0x1) != 0;
                    if (var89 > 0) {
                        field358.method2699();
                        field358.method2701();
                        field358.method2644();
                    }
                    field358.method2699();
                    for (int var94 = 0; var94 < field581; var94++) {
                        class15 var95 = field537[var94];
                        if (var86) {
                            if (var88.equals(var95.field177)) {
                                var95.field177 = var87;
                                var95.field172 = var88;
                                var87 = null;
                                break;
                            }
                        } else if (var87.equals(var95.field177)) {
                            if (var95.field182 != var89) {
                                boolean var96 = true;
                                for (class17 var97 = (class17) field584.method2321(); var97 != null; var97 = (class17) field584.method2323()) {
                                    if (var97.field203.equals(var87)) {
                                        if (var89 != 0 && var97.field202 == 0) {
                                            var97.method2333();
                                            var96 = false;
                                        } else if (var89 == 0 && var97.field202 != 0) {
                                            var97.method2333();
                                            var96 = false;
                                        }
                                    }
                                }
                                if (var96) {
                                    field584.method2322(new class17(var87, var89));
                                }
                                var95.field182 = var89;
                            }
                            var95.field172 = var88;
                            var95.field174 = var90;
                            var95.field175 = var92;
                            var95.field173 = var93;
                            var87 = null;
                            break;
                        }
                    }
                    if (var87 != null && field581 < 400) {
                        class15 var98 = new class15();
                        field537[field581] = var98;
                        var98.field177 = var87;
                        var98.field172 = var88;
                        var98.field182 = var89;
                        var98.field174 = var90;
                        var98.field175 = var92;
                        var98.field173 = var93;
                        field581++;
                    }
                }
                field376 = 2;
                field507 = field499;
                boolean var99 = false;
                int var100 = field581;
                while (var100 > 0) {
                    boolean var101 = true;
                    var100--;
                    for (int var102 = 0; var102 < var100; var102++) {
                        boolean var103 = false;
                        class15 var104 = field537[var102];
                        class15 var105 = field537[var102 + 1];
                        if (field583 != var104.field182 && field583 == var105.field182) {
                            var103 = true;
                        }
                        if (!var103 && var104.field182 == 0 && var105.field182 != 0) {
                            var103 = true;
                        }
                        if (!var103 && !var104.field175 && var105.field175) {
                            var103 = true;
                        }
                        if (!var103 && !var104.field173 && var105.field173) {
                            var103 = true;
                        }
                        if (var103) {
                            class15 var106 = field537[var102];
                            field537[var102] = field537[var102 + 1];
                            field537[var102 + 1] = var106;
                            var101 = false;
                        }
                    }
                    if (var101) {
                        break;
                    }
                }
                field360 = -1;
                return true;
            }
            if (field360 == 208) {
                class30 var107 = new class30();
                var107.field706 = field358.method2699();
                var107.field703 = field358.method2745();
                int var108 = field358.method2644();
                var107.field700 = var108;
                method3241(45);
                Statics.field16.method1991();
                Statics.field16 = null;
                class42.method1433(var107);
                field360 = -1;
                return false;
            }
            if (field360 == 49) {
                field308 = field358.method2701();
                field533 = field358.method2701();
                field360 = -1;
                return true;
            }
            if (field360 == 28) {
                int var109 = field358.method2745();
                field474 = var109;
                method1871(false);
                method3364(var109);
                Statics.method866(field474);
                for (int var110 = 0; var110 < 100; var110++) {
                    field519[var110] = true;
                }
                field360 = -1;
                return true;
            }
            if (field360 == 206) {
                field441 = false;
                for (int var111 = 0; var111 < 5; var111++) {
                    field509[var111] = false;
                }
                field360 = -1;
                return true;
            }
            if (field360 == 92) {
                int var112 = field358.method2701();
                class217[] var113 = new class217[] { class217.field3179, class217.field3182, class217.field3180 };
                class217[] var114 = var113;
                int var115 = 0;
                class217 var117;
                while (true) {
                    if (var115 >= var114.length) {
                        var117 = null;
                        break;
                    }
                    class217 var116 = var114[var115];
                    if (var116.field3181 == var112) {
                        var117 = var116;
                        break;
                    }
                    var115++;
                }
                Statics.field1741 = var117;
                field360 = -1;
                return true;
            }
            if (field360 == 195) {
                int var118 = field358.method2675();
                if (var118 == 65535) {
                    var118 = -1;
                }
                if (var118 == -1 && !field553) {
                    Statics.field1920.method2378();
                    class139.field1921 = 1;
                    Statics.field1917 = null;
                } else if (var118 != -1 && field446 != var118 && field551 != 0 && !field553) {
                    class185 var119 = Statics.field40;
                    int var120 = field551;
                    class139.field1921 = 1;
                    Statics.field1917 = var119;
                    Statics.field1923 = var118;
                    Statics.field87 = 0;
                    Statics.field246 = var120;
                    Statics.field1924 = false;
                    Statics.field303 = 2;
                }
                field446 = var118;
                field360 = -1;
                return true;
            }
            if (field360 == 60) {
                int var121 = field358.method2680();
                int var122 = field358.method2745();
                if (var122 == 65535) {
                    var122 = -1;
                }
                if (field551 != 0 && var122 != -1) {
                    Statics.method808(Statics.field13, var122, 0, field551, false);
                    field553 = true;
                }
                field360 = -1;
                return true;
            }
            if (field360 == 168 || field360 == 23 || field360 == 97 || field360 == 232 || field360 == 73 || field360 == 251 || field360 == 143 || field360 == 29 || field360 == 186 || field360 == 117) {
                method190();
                field360 = -1;
                return true;
            }
            if (field360 == 61) {
                int var123 = field358.method2805();
                String var124 = field358.method2699();
                int var125 = field358.method2701();
                if (var125 >= 1 && var125 <= 8) {
                    if (var124.equalsIgnoreCase("null")) {
                        var124 = null;
                    }
                    field417[var125 - 1] = var124;
                    field464[var125 - 1] = var123 == 0;
                }
                field360 = -1;
                return true;
            }
            if (field360 == 129) {
                field441 = true;
                Statics.field1686 = field358.method2701();
                Statics.field3091 = field358.method2701();
                Statics.field2946 = field358.method2745();
                Statics.field951 = field358.method2701();
                Statics.field101 = field358.method2701();
                if (Statics.field101 >= 100) {
                    Statics.field1111 = Statics.field1686 * 128 + 64;
                    Statics.field784 = Statics.field3091 * 128 + 64;
                    Statics.field82 = method22(Statics.field1111, Statics.field784, Statics.field744) - Statics.field2946;
                }
                field360 = -1;
                return true;
            }
            if (field360 == 217) {
                int var126 = field358.method2677();
                int var127 = field358.method2677();
                int var128 = field358.method2675();
                int var129 = field358.method2684();
                class170 var130 = class170.method669(var129);
                if (var130.field2232 != var126 || var130.field2239 != var127 || var130.field2241 != var128) {
                    var130.field2232 = var126;
                    var130.field2239 = var127;
                    var130.field2241 = var128;
                    method37(var130);
                }
                field360 = -1;
                return true;
            }
            if (field360 == 43) {
                field437 = 0;
                field354 = 0;
                field358.method2883();
                int var131 = field358.method2895(8);
                if (var131 < field352) {
                    for (int var132 = var131; var132 < field352; var132++) {
                        field438[++field437 - 1] = field571[var132];
                    }
                }
                if (var131 > field352) {
                    throw new RuntimeException("");
                }
                field352 = 0;
                for (int var133 = 0; var133 < var131; var133++) {
                    int var134 = field571[var133];
                    class36 var135 = field351[var134];
                    int var136 = field358.method2895(1);
                    if (var136 == 0) {
                        field571[++field352 - 1] = var134;
                        var135.field649 = field320;
                    } else {
                        int var137 = field358.method2895(2);
                        if (var137 == 0) {
                            field571[++field352 - 1] = var134;
                            var135.field649 = field320;
                            field431[++field354 - 1] = var134;
                        } else if (var137 == 1) {
                            field571[++field352 - 1] = var134;
                            var135.field649 = field320;
                            int var138 = field358.method2895(3);
                            var135.method772(var138, (byte) 1);
                            int var139 = field358.method2895(1);
                            if (var139 == 1) {
                                field431[++field354 - 1] = var134;
                            }
                        } else if (var137 == 2) {
                            field571[++field352 - 1] = var134;
                            var135.field649 = field320;
                            int var140 = field358.method2895(3);
                            var135.method772(var140, (byte) 2);
                            int var141 = field358.method2895(3);
                            var135.method772(var141, (byte) 2);
                            int var142 = field358.method2895(1);
                            if (var142 == 1) {
                                field431[++field354 - 1] = var134;
                            }
                        } else if (var137 == 3) {
                            field438[++field437 - 1] = var134;
                        }
                    }
                }
                while (field358.method2878(field359) >= 27) {
                    int var143 = field358.method2895(15);
                    if (var143 == 32767) {
                        break;
                    }
                    boolean var144 = false;
                    if (field351[var143] == null) {
                        field351[var143] = new class36();
                        var144 = true;
                    }
                    class36 var145 = field351[var143];
                    field571[++field352 - 1] = var143;
                    var145.field649 = field320;
                    int var146 = field358.method2895(8);
                    if (var146 > 127) {
                        var146 -= 256;
                    }
                    int var147 = field442[field358.method2895(3)];
                    if (var144) {
                        var145.field677 = var145.field628 = var147;
                    }
                    var145.field795 = class200.method1605(field358.method2895(14));
                    int var148 = field358.method2895(8);
                    if (var148 > 127) {
                        var148 -= 256;
                    }
                    int var149 = field358.method2895(1);
                    if (var149 == 1) {
                        field431[++field354 - 1] = var143;
                    }
                    int var150 = field358.method2895(1);
                    var145.field673 = var145.field795.field3009;
                    var145.field679 = var145.field795.field3032;
                    if (var145.field679 == 0) {
                        var145.field628 = 0;
                    }
                    var145.field668 = var145.field795.field3034;
                    var145.field635 = var145.field795.field3016;
                    var145.field636 = var145.field795.field3006;
                    var145.field669 = var145.field795.field3018;
                    var145.field631 = var145.field795.field3012;
                    var145.field685 = var145.field795.field3039;
                    var145.field633 = var145.field795.field3020;
                    var145.method774(Statics.field266.field681[0] + var146, Statics.field266.field632[0] + var148, var150 == 1);
                }
                field358.method2880();
                method3342();
                for (int var151 = 0; var151 < field437; var151++) {
                    int var152 = field438[var151];
                    if (field320 != field351[var152].field649) {
                        field351[var152].field795 = null;
                        field351[var152] = null;
                    }
                }
                if (field359 != field358.field2086) {
                    throw new RuntimeException(field358.field2086 + class38.field811 + field359);
                }
                for (int var153 = 0; var153 < field352; var153++) {
                    if (field351[field571[var153]] == null) {
                        throw new RuntimeException(var153 + class38.field811 + field352);
                    }
                }
                field360 = -1;
                return true;
            }
            if (field360 == 202) {
                int var154 = field358.method2701();
                int var155 = field358.method2701();
                int var156 = field358.method2701();
                int var157 = field358.method2701();
                field509[var154] = true;
                field564[var154] = var155;
                field565[var154] = var156;
                field355[var154] = var157;
                field567[var154] = 0;
                field360 = -1;
                return true;
            }
            if (field360 == 155) {
                String var158 = field358.method2699();
                int var159 = field358.method2745();
                byte var160 = field358.method2640();
                boolean var161 = false;
                if (var160 == -128) {
                    var161 = true;
                }
                if (var161) {
                    if (Statics.field95 == 0) {
                        field360 = -1;
                        return true;
                    }
                    boolean var162 = false;
                    int var163;
                    for (var163 = 0; var163 < Statics.field95 && (!Statics.field1916[var163].field304.equals(var158) || Statics.field1916[var163].field300 != var159); var163++) {
                    }
                    if (var163 < Statics.field95) {
                        while (var163 < Statics.field95 - 1) {
                            Statics.field1916[var163] = Statics.field1916[var163 + 1];
                            var163++;
                        }
                        Statics.field95--;
                        Statics.field1916[Statics.field95] = null;
                    }
                } else {
                    field358.method2699();
                    class25 var164 = new class25();
                    var164.field304 = var158;
                    var164.field305 = class205.method1513(var164.field304, Statics.field2156);
                    var164.field300 = var159;
                    var164.field299 = var160;
                    int var165;
                    for (var165 = Statics.field95 - 1; var165 >= 0; var165--) {
                        int var166 = Statics.field1916[var165].field305.compareTo(var164.field305);
                        if (var166 == 0) {
                            Statics.field1916[var165].field300 = var159;
                            Statics.field1916[var165].field299 = var160;
                            if (var158.equals(Statics.field266.field283)) {
                                Statics.field104 = var160;
                            }
                            field508 = field499;
                            field360 = -1;
                            return true;
                        }
                        if (var166 < 0) {
                            break;
                        }
                    }
                    if (Statics.field95 >= Statics.field1916.length) {
                        field360 = -1;
                        return true;
                    }
                    for (int var167 = Statics.field95 - 1; var167 > var165; var167--) {
                        Statics.field1916[var167 + 1] = Statics.field1916[var167];
                    }
                    if (Statics.field95 == 0) {
                        Statics.field1916 = new class25[100];
                    }
                    Statics.field1916[var165 + 1] = var164;
                    Statics.field95++;
                    if (var158.equals(Statics.field266.field283)) {
                        Statics.field104 = var160;
                    }
                }
                field508 = field499;
                field360 = -1;
                return true;
            }
            if (field360 == 121) {
                method1607();
                field360 = -1;
                return false;
            }
            if (field360 == 170) {
                Statics.field2338 = field358.method2701();
                Statics.field262 = field358.method2701();
                for (int var168 = Statics.field2338; var168 < Statics.field2338 + 8; var168++) {
                    for (int var169 = Statics.field262; var169 < Statics.field262 + 8; var169++) {
                        if (field522[Statics.field744][var168][var169] != null) {
                            field522[Statics.field744][var168][var169] = null;
                            method56(var168, var169);
                        }
                    }
                }
                for (class26 var170 = (class26) field445.method2290(); var170 != null; var170 = (class26) field445.method2287()) {
                    if (var170.field599 >= Statics.field2338 && var170.field599 < Statics.field2338 + 8 && var170.field601 >= Statics.field262 && var170.field601 < Statics.field262 + 8 && Statics.field744 == var170.field600) {
                        var170.field597 = 0;
                    }
                }
                field360 = -1;
                return true;
            }
            if (field360 == 247) {
                String var171 = field358.method2699();
                Object[] var172 = new Object[var171.length() + 1];
                for (int var173 = var171.length() - 1; var173 >= 0; var173--) {
                    if (var171.charAt(var173) == 's') {
                        var172[var173 + 1] = field358.method2699();
                    } else {
                        var172[var173 + 1] = Integer.valueOf(field358.method2644());
                    }
                }
                var172[0] = Integer.valueOf(field358.method2644());
                class19 var174 = new class19();
                var174.field233 = var172;
                class33.method1870(var174);
                field360 = -1;
                return true;
            }
            if (field360 == 122) {
                int var175 = field358.method2675();
                byte var176 = field358.method2705();
                class166.field2153[var175] = var176;
                if (class166.field2154[var175] != var176) {
                    class166.field2154[var175] = var176;
                }
                method264(var175);
                field500[++field501 - 1 & 0x1F] = var175;
                field360 = -1;
                return true;
            }
            if (field360 == 179) {
                int var177 = field358.method2821();
                boolean var178 = field358.method2701() == 1;
                String var179 = "";
                boolean var180 = false;
                if (var178) {
                    var179 = field358.method2699();
                    if (method2088(var179)) {
                        var180 = true;
                    }
                }
                String var181 = field358.method2699();
                if (!var180) {
                    class48.method685(var177, var179, var181);
                }
                field360 = -1;
                return true;
            }
            if (field360 == 72) {
                String var182 = field358.method2699();
                String var183 = class210.method3667(class208.method65(class211.method3068(field358)));
                class48.method685(6, var182, var183);
                field360 = -1;
                return true;
            }
            if (field360 == 242) {
                int var184 = field358.method2676();
                int var185 = field358.method2678();
                class170 var186 = class170.method669(var184);
                if (var186.field2234 != var185 || var185 == -1) {
                    var186.field2234 = var185;
                    var186.field2309 = 0;
                    var186.field2214 = 0;
                    method37(var186);
                }
                field360 = -1;
                return true;
            }
            if (field360 == 65) {
                int var187 = field358.method2644();
                int var188 = field358.method2644();
                if (Statics.field833 == null || !Statics.field833.isValid()) {
                    try {
                        Iterator var189 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var189.hasNext()) {
                            GarbageCollectorMXBean var190 = (GarbageCollectorMXBean) var189.next();
                            if (var190.isValid()) {
                                Statics.field833 = var190;
                                field592 = -1L;
                                field367 = -1L;
                            }
                        }
                    } catch (Throwable var345) {
                    }
                }
                long var192 = class156.method1888();
                int var194 = -1;
                if (Statics.field833 != null) {
                    long var195 = Statics.field833.getCollectionTime();
                    if (field367 != -1L) {
                        long var197 = var195 - field367;
                        long var199 = var192 - field592;
                        if (var199 != 0L) {
                            var194 = (int) (var197 * 100L / var199);
                        }
                    }
                    field367 = var195;
                    field592 = var192;
                }
                field310.method2874(178);
                field310.method2627(var187);
                field310.method2682(var188);
                field310.method2770(field1787);
                field310.method2770(var194);
                field360 = -1;
                return true;
            }
            if (field360 == 226) {
                for (int var201 = 0; var201 < field434.length; var201++) {
                    if (field434[var201] != null) {
                        field434[var201].field658 = -1;
                    }
                }
                for (int var202 = 0; var202 < field351.length; var202++) {
                    if (field351[var202] != null) {
                        field351[var202].field658 = -1;
                    }
                }
                field360 = -1;
                return true;
            }
            if (field360 == 167) {
                method1666(false);
                field358.method2877();
                int var203 = field358.method2745();
                class46.method210(field358, var203);
                field360 = -1;
                return true;
            }
            if (field360 == 119) {
                int var204 = field358.method2644();
                int var205 = field358.method2814();
                class18 var206 = (class18) field346.method2247((long) var205);
                class18 var207 = (class18) field346.method2247((long) var204);
                if (var207 != null) {
                    method66(var207, var206 == null || var206.field216 != var207.field216);
                }
                if (var206 != null) {
                    var206.method2278();
                    field346.method2245(var206, (long) var204);
                }
                class170 var208 = class170.method669(var205);
                if (var208 != null) {
                    method37(var208);
                }
                class170 var209 = class170.method669(var204);
                if (var209 != null) {
                    method37(var209);
                    method1983(Statics.field2223[var209.field2187 >>> 16], var209, true);
                }
                if (field474 != -1) {
                    int var210 = field474;
                    if (class170.method869(var210)) {
                        method627(Statics.field2223[var210], 1);
                    }
                }
                field360 = -1;
                return true;
            }
            if (field360 == 81) {
                for (int var211 = 0; var211 < Statics.field2769; var211++) {
                    class188 var212 = Statics.method1986(var211);
                    if (var212 != null) {
                        class166.field2153[var211] = 0;
                        class166.field2154[var211] = 0;
                    }
                }
                method199();
                field501 += 32;
                field360 = -1;
                return true;
            }
            if (field360 == 133) {
                int var213 = field358.method2644();
                class170 var214 = class170.method669(var213);
                for (int var215 = 0; var215 < var214.field2305.length; var215++) {
                    var214.field2305[var215] = -1;
                    var214.field2305[var215] = 0;
                }
                method37(var214);
                field360 = -1;
                return true;
            }
            if (field360 == 86) {
                int var216 = field358.method2701();
                if (field358.method2701() == 0) {
                    field590[var216] = new class5();
                    field358.field2086 += 18;
                } else {
                    field358.field2086--;
                    field590[var216] = new class5(field358, false);
                }
                field546 = field499;
                field360 = -1;
                return true;
            }
            if (field360 == 151) {
                method199();
                field479 = field358.method2701();
                field511 = field499;
                field360 = -1;
                return true;
            }
            if (field360 == 35) {
                class46.method3271();
                for (int var217 = 0; var217 < 2048; var217++) {
                    field434[var217] = null;
                }
                class46.method217(field358);
                field360 = -1;
                return true;
            }
            if (field360 == 166) {
                while (field358.field2086 < field359) {
                    int var218 = field358.method2701();
                    boolean var219 = (var218 & 0x1) == 1;
                    String var220 = field358.method2699();
                    String var221 = field358.method2699();
                    field358.method2699();
                    for (int var222 = 0; var222 < field585; var222++) {
                        class20 var223 = field480[var222];
                        if (var219) {
                            if (var221.equals(var223.field244)) {
                                var223.field244 = var220;
                                var223.field240 = var221;
                                var220 = null;
                                break;
                            }
                        } else if (var220.equals(var223.field244)) {
                            var223.field244 = var220;
                            var223.field240 = var221;
                            var220 = null;
                            break;
                        }
                    }
                    if (var220 != null && field585 < 400) {
                        class20 var224 = new class20();
                        field480[field585] = var224;
                        var224.field244 = var220;
                        var224.field240 = var221;
                        field585++;
                    }
                }
                field507 = field499;
                field360 = -1;
                return true;
            }
            if (field360 == 238) {
                String var225 = field358.method2699();
                long var226 = field358.method2645();
                long var228 = (long) field358.method2745();
                long var230 = (long) field358.method2643();
                class178[] var232 = new class178[] { class178.field2656, class178.field2660, class178.field2654, class178.field2653, class178.field2658, class178.field2655 };
                class178 var233 = (class178) Statics.method78(var232, field358.method2701());
                long var234 = (var228 << 32) + var230;
                boolean var236 = false;
                for (int var237 = 0; var237 < 100; var237++) {
                    if (field556[var237] == var234) {
                        var236 = true;
                        break;
                    }
                }
                if (var233.field2661 && method2088(var225)) {
                    var236 = true;
                }
                if (!var236 && field433 == 0) {
                    field556[field536] = var234;
                    field536 = (field536 + 1) % 100;
                    String var238 = class210.method3667(class208.method65(class211.method3068(field358)));
                    if (var233.field2659 == -1) {
                        class48.method110(9, var225, var238, class206.method2994(var226));
                    } else {
                        class48.method110(9, class38.method2016(var233.field2659) + var225, var238, class206.method2994(var226));
                    }
                }
                field360 = -1;
                return true;
            }
            if (field360 == 51) {
                int var239 = field358.method2676();
                String var240 = field358.method2699();
                class170 var241 = class170.method669(var239);
                if (!var240.equals(var241.field2247)) {
                    var241.field2247 = var240;
                    method37(var241);
                }
                field360 = -1;
                return true;
            }
            if (field360 == 204) {
                int var242 = field358.method2684();
                class170 var243 = class170.method669(var242);
                var243.field2285 = 3;
                var243.field2188 = Statics.field266.field270.method2966();
                method37(var243);
                field360 = -1;
                return true;
            }
            if (field360 == 140) {
                int var244 = field358.method2675();
                if (var244 == 65535) {
                    var244 = -1;
                }
                int var245 = field358.method2684();
                int var246 = field358.method2644();
                int var247 = field358.method2745();
                if (var247 == 65535) {
                    var247 = -1;
                }
                for (int var248 = var247; var248 <= var244; var248++) {
                    long var249 = ((long) var245 << 32) + (long) var248;
                    class128 var251 = field516.method2247(var249);
                    if (var251 != null) {
                        var251.method2278();
                    }
                    field516.method2245(new class134(var246), var249);
                }
                field360 = -1;
                return true;
            }
            if (field360 == 77) {
                method1666(true);
                field358.method2877();
                int var252 = field358.method2745();
                class46.method210(field358, var252);
                field360 = -1;
                return true;
            }
            if (field360 == 176) {
                int var253 = field358.method2644();
                class18 var254 = (class18) field346.method2247((long) var253);
                if (var254 != null) {
                    method66(var254, true);
                }
                if (field478 != null) {
                    method37(field478);
                    field478 = null;
                }
                field360 = -1;
                return true;
            }
            if (field360 == 32) {
                field376 = 1;
                field507 = field499;
                field360 = -1;
                return true;
            }
            if (field360 == 99) {
                field548 = field358.method2701();
                if (field548 == 255) {
                    field548 = 0;
                }
                field425 = field358.method2701();
                if (field425 == 255) {
                    field425 = 0;
                }
                field360 = -1;
                return true;
            }
            if (field360 == 190) {
                method199();
                int var255 = field358.method2814();
                int var256 = field358.method2668();
                int var257 = field358.method2666();
                field525[var257] = var255;
                field427[var257] = var256;
                field449[var257] = 1;
                for (int var258 = 0; var258 < 98; var258++) {
                    if (var255 >= class173.field2334[var258]) {
                        field449[var257] = var258 + 2;
                    }
                }
                field517[++field505 - 1 & 0x1F] = var257;
                field360 = -1;
                return true;
            }
            if (field360 == 76) {
                int var259 = field358.method2745();
                int var260 = field358.method2701();
                int var261 = field358.method2676();
                class18 var262 = (class18) field346.method2247((long) var261);
                if (var262 != null) {
                    method66(var262, var262.field216 != var259);
                }
                method212(var261, var259, var260);
                field360 = -1;
                return true;
            }
            if (field360 == 136) {
                field508 = field499;
                if (field359 == 0) {
                    field541 = null;
                    field436 = null;
                    Statics.field95 = 0;
                    Statics.field1916 = null;
                    field360 = -1;
                    return true;
                }
                field436 = field358.method2699();
                long var263 = field358.method2645();
                field541 = class206.method952(var263);
                Statics.field1747 = field358.method2640();
                int var265 = field358.method2701();
                if (var265 == 255) {
                    field360 = -1;
                    return true;
                }
                Statics.field95 = var265;
                class25[] var266 = new class25[100];
                for (int var267 = 0; var267 < Statics.field95; var267++) {
                    var266[var267] = new class25();
                    var266[var267].field304 = field358.method2699();
                    var266[var267].field305 = class205.method1513(var266[var267].field304, Statics.field2156);
                    var266[var267].field300 = field358.method2745();
                    var266[var267].field299 = field358.method2640();
                    field358.method2699();
                    if (var266[var267].field304.equals(Statics.field266.field283)) {
                        Statics.field104 = var266[var267].field299;
                    }
                }
                boolean var268 = false;
                int var269 = Statics.field95;
                while (var269 > 0) {
                    boolean var270 = true;
                    var269--;
                    for (int var271 = 0; var271 < var269; var271++) {
                        if (var266[var271].field305.compareTo(var266[var271 + 1].field305) > 0) {
                            class25 var272 = var266[var271];
                            var266[var271] = var266[var271 + 1];
                            var266[var271 + 1] = var272;
                            var270 = false;
                        }
                    }
                    if (var270) {
                        break;
                    }
                }
                Statics.field1916 = var266;
                field360 = -1;
                return true;
            }
            if (field360 == 8) {
                Statics.field2338 = field358.method2668();
                Statics.field262 = field358.method2666();
                while (field358.field2086 < field359) {
                    field360 = field358.method2701();
                    method190();
                }
                field360 = -1;
                return true;
            }
            if (field360 == 89) {
                class46.method210(field358, field359);
                field360 = -1;
                return true;
            }
            if (field360 == 132) {
                int var273 = field358.method2757();
                int var274 = field358.method2684();
                class170 var275 = class170.method669(var274);
                if (var275.field2285 != 2 || var275.field2188 != var273) {
                    var275.field2285 = 2;
                    var275.field2188 = var273;
                    method37(var275);
                }
                field360 = -1;
                return true;
            }
            if (field360 == 127) {
                method275(field358.method2699());
                field360 = -1;
                return true;
            }
            if (field360 == 161) {
                field459 = field358.method2701();
                if (field459 == 1) {
                    field330 = field358.method2745();
                }
                if (field459 >= 2 && field459 <= 6) {
                    if (field459 == 2) {
                        field335 = 64;
                        field336 = 64;
                    }
                    if (field459 == 3) {
                        field335 = 0;
                        field336 = 64;
                    }
                    if (field459 == 4) {
                        field335 = 128;
                        field336 = 64;
                    }
                    if (field459 == 5) {
                        field335 = 64;
                        field336 = 0;
                    }
                    if (field459 == 6) {
                        field335 = 64;
                        field336 = 128;
                    }
                    field459 = 2;
                    field332 = field358.method2745();
                    field333 = field358.method2745();
                    field334 = field358.method2701();
                }
                if (field459 == 10) {
                    field363 = field358.method2745();
                }
                field360 = -1;
                return true;
            }
            if (field360 == 178) {
                int var276 = field358.method2676();
                Statics.field1734 = Statics.field1194.method1907(var276);
                field360 = -1;
                return true;
            }
            if (field360 == 2) {
                int var277 = field358.method2676();
                int var278 = field358.method2675();
                if (var278 == 65535) {
                    var278 = -1;
                }
                int var279 = field358.method2814();
                class170 var280 = class170.method669(var277);
                if (var280.field2277) {
                    var280.field2307 = var278;
                    var280.field2308 = var279;
                    class199 var282 = class199.method2849(var278);
                    var280.field2232 = var282.field2987;
                    var280.field2239 = var282.field3000;
                    var280.field2230 = var282.field3002;
                    var280.field2236 = var282.field2955;
                    var280.field2237 = var282.field2983;
                    var280.field2241 = var282.field2972;
                    if (var282.field2969 == 1) {
                        var280.field2245 = 1;
                    } else {
                        var280.field2245 = 2;
                    }
                    if (var280.field2180 > 0) {
                        var280.field2241 = var280.field2241 * 32 / var280.field2180;
                    } else if (var280.field2198 > 0) {
                        var280.field2241 = var280.field2241 * 32 / var280.field2198;
                    }
                    method37(var280);
                } else if (var278 == -1) {
                    var280.field2285 = 0;
                    field360 = -1;
                    return true;
                } else {
                    class199 var281 = class199.method2849(var278);
                    var280.field2285 = 4;
                    var280.field2188 = var278;
                    var280.field2232 = var281.field2987;
                    var280.field2239 = var281.field3000;
                    var280.field2241 = var281.field2972 * 100 / var279;
                    method37(var280);
                }
                field360 = -1;
                return true;
            }
            if (field360 == 124) {
                if (field474 != -1) {
                    int var283 = field474;
                    if (class170.method869(var283)) {
                        method627(Statics.field2223[var283], 0);
                    }
                }
                field360 = -1;
                return true;
            }
            if (field360 == 158) {
                class160 var284 = field358;
                int var285 = field359;
                class227 var286 = new class227();
                var286.field3241 = var284.method2701();
                var286.field3239 = var284.method2644();
                var286.field3240 = new int[var286.field3241];
                var286.field3242 = new int[var286.field3241];
                var286.field3243 = new Field[var286.field3241];
                var286.field3244 = new int[var286.field3241];
                var286.field3245 = new Method[var286.field3241];
                var286.field3246 = new byte[var286.field3241][][];
                for (int var287 = 0; var287 < var286.field3241; var287++) {
                    try {
                        int var288 = var284.method2701();
                        if (var288 == 0 || var288 == 1 || var288 == 2) {
                            String var289 = var284.method2699();
                            String var290 = var284.method2699();
                            int var291 = 0;
                            if (var288 == 1) {
                                var291 = var284.method2644();
                            }
                            var286.field3240[var287] = var288;
                            var286.field3244[var287] = var291;
                            if (class228.method2556(var289).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var286.field3243[var287] = class228.method2556(var289).getDeclaredField(var290);
                        } else if (var288 == 3 || var288 == 4) {
                            String var292 = var284.method2699();
                            String var293 = var284.method2699();
                            int var294 = var284.method2701();
                            String[] var295 = new String[var294];
                            for (int var296 = 0; var296 < var294; var296++) {
                                var295[var296] = var284.method2699();
                            }
                            String var297 = var284.method2699();
                            byte[][] var298 = new byte[var294][];
                            if (var288 == 3) {
                                for (int var299 = 0; var299 < var294; var299++) {
                                    int var300 = var284.method2644();
                                    var298[var299] = new byte[var300];
                                    var284.method2650(var298[var299], 0, var300);
                                }
                            }
                            var286.field3240[var287] = var288;
                            Class[] var301 = new Class[var294];
                            for (int var302 = 0; var302 < var294; var302++) {
                                var301[var302] = class228.method2556(var295[var302]);
                            }
                            Class var303 = class228.method2556(var297);
                            if (class228.method2556(var292).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var304 = class228.method2556(var292).getDeclaredMethods();
                            Method[] var305 = var304;
                            for (int var306 = 0; var306 < var305.length; var306++) {
                                Method var307 = var305[var306];
                                if (var307.getName().equals(var293)) {
                                    Class[] var308 = var307.getParameterTypes();
                                    if (var301.length == var308.length) {
                                        boolean var309 = true;
                                        for (int var310 = 0; var310 < var301.length; var310++) {
                                            if (var301[var310] != var308[var310]) {
                                                var309 = false;
                                                break;
                                            }
                                        }
                                        if (var309 && var303 == var307.getReturnType()) {
                                            var286.field3245[var287] = var307;
                                        }
                                    }
                                }
                            }
                            var286.field3246[var287] = var298;
                        }
                    } catch (ClassNotFoundException var340) {
                        var286.field3242[var287] = -1;
                    } catch (SecurityException var341) {
                        var286.field3242[var287] = -2;
                    } catch (NullPointerException var342) {
                        var286.field3242[var287] = -3;
                    } catch (Exception var343) {
                        var286.field3242[var287] = -4;
                    } catch (Throwable var344) {
                        var286.field3242[var287] = -5;
                    }
                }
                class228.field3249.method2266(var286);
                field360 = -1;
                return true;
            }
            if (field360 == 31) {
                field328 = field358.method2745() * 30;
                field511 = field499;
                field360 = -1;
                return true;
            }
            if (field360 == 194) {
                int var316 = field358.method2814();
                boolean var317 = field358.method2805() == 1;
                class170 var318 = class170.method669(var316);
                if (var318.field2207 != var317) {
                    var318.field2207 = var317;
                    method37(var318);
                }
                field360 = -1;
                return true;
            }
            if (field360 == 123) {
                int var319 = field358.method2644();
                int var320 = field358.method2677();
                int var321 = var320 >> 10 & 0x1F;
                int var322 = var320 >> 5 & 0x1F;
                int var323 = var320 & 0x1F;
                int var324 = (var323 << 3) + (var321 << 19) + (var322 << 11);
                class170 var325 = class170.method669(var319);
                if (var325.field2320 != var324) {
                    var325.field2320 = var324;
                    method37(var325);
                }
                field360 = -1;
                return true;
            }
            if (field360 == 79) {
                int var326 = field358.method2644();
                int var327 = field358.method2745();
                if (var326 < -70000) {
                    var327 += 32768;
                }
                class170 var328;
                if (var326 >= 0) {
                    var328 = class170.method669(var326);
                } else {
                    var328 = null;
                }
                while (field358.field2086 < field359) {
                    int var329 = field358.method2821();
                    int var330 = field358.method2745();
                    int var331 = 0;
                    if (var330 != 0) {
                        var331 = field358.method2701();
                        if (var331 == 255) {
                            var331 = field358.method2644();
                        }
                    }
                    if (var328 != null && var329 >= 0 && var329 < var328.field2305.length) {
                        var328.field2305[var329] = var330;
                        var328.field2306[var329] = var331;
                    }
                    class13.method1900(var327, var329, var330 - 1, var331);
                }
                if (var328 != null) {
                    method37(var328);
                }
                method199();
                field379[++field503 - 1 & 0x1F] = var327 & 0x7FFF;
                field360 = -1;
                return true;
            }
            if (field360 == 56) {
                int var332 = field358.method2676();
                int var333 = field358.method2695();
                int var334 = field358.method2695();
                class170 var335 = class170.method669(var332);
                if (var335.field2196 != var334 || var335.field2197 != var333 || var335.field2192 != 0 || var335.field2193 != 0) {
                    var335.field2196 = var334;
                    var335.field2197 = var333;
                    var335.field2192 = 0;
                    var335.field2193 = 0;
                    method37(var335);
                    Statics.method606(var335);
                    if (var335.field2189 == 0) {
                        method1983(Statics.field2223[var332 >> 16], var335, false);
                    }
                }
                field360 = -1;
                return true;
            }
            class102.method702("" + field360 + class38.field811 + field364 + class38.field811 + field365 + class38.field811 + field359, (Throwable) null);
            method1607();
        } catch (IOException var346) {
            method204();
        } catch (Exception var347) {
            String var338 = "" + field360 + class38.field811 + field364 + class38.field811 + field365 + class38.field811 + field359 + class38.field811 + (Statics.field791 + Statics.field266.field681[0]) + class38.field811 + (Statics.field37 + Statics.field266.field632[0]) + class38.field811;
            for (int var339 = 0; var339 < field359 && var339 < 50; var339++) {
                var338 = var338 + field358.field2091[var339] + class38.field811;
            }
            class102.method702(var338, var347);
            method1607();
        }
        return true;
    }

    @ObfuscatedName("v.by(I)V")
    public static final void method190() {
        if (field360 == 97) {
            int var0 = field358.method2677();
            int var1 = field358.method2675();
            int var2 = field358.method2745();
            byte var3 = field358.method2671();
            int var4 = field358.method2675();
            byte var5 = field358.method2705();
            byte var6 = field358.method2705();
            byte var7 = field358.method2669();
            int var8 = field358.method2666();
            int var9 = (var8 >> 4 & 0x7) + Statics.field2338;
            int var10 = (var8 & 0x7) + Statics.field262;
            int var11 = field358.method2805();
            int var12 = var11 >> 2;
            int var13 = var11 & 0x3;
            int var14 = field362[var12];
            class24 var15;
            if (field435 == var1) {
                var15 = Statics.field266;
            } else {
                var15 = field434[var1];
            }
            if (var15 != null) {
                class198 var16 = class198.method3366(var2);
                int var17;
                int var18;
                if (var13 == 1 || var13 == 3) {
                    var17 = var16.field2911;
                    var18 = var16.field2910;
                } else {
                    var17 = var16.field2910;
                    var18 = var16.field2911;
                }
                int var19 = (var17 >> 1) + var9;
                int var20 = (var17 + 1 >> 1) + var9;
                int var21 = (var18 >> 1) + var10;
                int var22 = (var18 + 1 >> 1) + var10;
                int[][] var23 = class11.field131[Statics.field744];
                int var24 = var23[var19][var21] + var23[var20][var21] + var23[var19][var22] + var23[var20][var22] >> 2;
                int var25 = (var9 << 7) + (var17 << 6);
                int var26 = (var10 << 7) + (var18 << 6);
                class83 var27 = var16.method3441(var12, var13, var23, var25, var24, var26);
                if (var27 != null) {
                    method1512(Statics.field744, var9, var10, var14, -1, 0, 0, var4 + 1, var0 + 1);
                    var15.field279 = field320 + var4;
                    var15.field293 = field320 + var0;
                    var15.field284 = var27;
                    var15.field281 = var9 * 128 + var17 * 64;
                    var15.field289 = var10 * 128 + var18 * 64;
                    var15.field280 = var24;
                    if (var6 > var7) {
                        byte var28 = var6;
                        var6 = var7;
                        var7 = var28;
                    }
                    if (var5 > var3) {
                        byte var29 = var5;
                        var5 = var3;
                        var3 = var29;
                    }
                    var15.field271 = var6 + var9;
                    var15.field287 = var7 + var9;
                    var15.field286 = var5 + var10;
                    var15.field288 = var3 + var10;
                }
            }
        }
        if (field360 == 29) {
            int var30 = field358.method2675();
            int var31 = field358.method2701();
            int var32 = var31 >> 2;
            int var33 = var31 & 0x3;
            int var34 = field362[var32];
            int var35 = field358.method2701();
            int var36 = (var35 >> 4 & 0x7) + Statics.field2338;
            int var37 = (var35 & 0x7) + Statics.field262;
            if (var36 >= 0 && var37 >= 0 && var36 < 103 && var37 < 103) {
                if (var34 == 0) {
                    class91 var38 = Statics.field171.method1676(Statics.field744, var36, var37);
                    if (var38 != null) {
                        int var39 = var38.field1564 >> 14 & 0x7FFF;
                        if (var32 == 2) {
                            var38.field1566 = new class50(var39, 2, var33 + 4, Statics.field744, var36, var37, var30, false, var38.field1566);
                            var38.field1563 = new class50(var39, 2, var33 + 1 & 0x3, Statics.field744, var36, var37, var30, false, var38.field1563);
                        } else {
                            var38.field1566 = new class50(var39, var32, var33, Statics.field744, var36, var37, var30, false, var38.field1566);
                        }
                    }
                }
                if (var34 == 1) {
                    class96 var40 = Statics.field171.method1691(Statics.field744, var36, var37);
                    if (var40 != null) {
                        int var41 = var40.field1617 >> 14 & 0x7FFF;
                        if (var32 == 4 || var32 == 5) {
                            var40.field1615 = new class50(var41, 4, var33, Statics.field744, var36, var37, var30, false, var40.field1615);
                        } else if (var32 == 6) {
                            var40.field1615 = new class50(var41, 4, var33 + 4, Statics.field744, var36, var37, var30, false, var40.field1615);
                        } else if (var32 == 7) {
                            var40.field1615 = new class50(var41, 4, (var33 + 2 & 0x3) + 4, Statics.field744, var36, var37, var30, false, var40.field1615);
                        } else if (var32 == 8) {
                            var40.field1615 = new class50(var41, 4, var33 + 4, Statics.field744, var36, var37, var30, false, var40.field1615);
                            var40.field1613 = new class50(var41, 4, (var33 + 2 & 0x3) + 4, Statics.field744, var36, var37, var30, false, var40.field1613);
                        }
                    }
                }
                if (var34 == 2) {
                    class97 var42 = Statics.field171.method1692(Statics.field744, var36, var37);
                    if (var32 == 11) {
                        var32 = 10;
                    }
                    if (var42 != null) {
                        var42.field1627 = new class50(var42.field1635 >> 14 & 0x7FFF, var32, var33, Statics.field744, var36, var37, var30, false, var42.field1627);
                    }
                }
                if (var34 == 3) {
                    class79 var43 = Statics.field171.method1693(Statics.field744, var36, var37);
                    if (var43 != null) {
                        var43.field1307 = new class50(var43.field1308 >> 14 & 0x7FFF, 22, var33, Statics.field744, var36, var37, var30, false, var43.field1307);
                    }
                }
            }
        } else if (field360 == 23) {
            int var44 = field358.method2701();
            int var45 = (var44 >> 4 & 0x7) + Statics.field2338;
            int var46 = (var44 & 0x7) + Statics.field262;
            int var47 = field358.method2745();
            int var48 = field358.method2745();
            int var49 = field358.method2745();
            if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104) {
                class129 var50 = field522[Statics.field744][var45][var46];
                if (var50 != null) {
                    for (class44 var51 = (class44) var50.method2290(); var51 != null; var51 = (class44) var50.method2287()) {
                        if ((var47 & 0x7FFF) == var51.field911 && var51.field913 == var48) {
                            var51.field913 = var49;
                            break;
                        }
                    }
                    method56(var45, var46);
                }
            }
        } else if (field360 == 73) {
            int var52 = field358.method2701();
            int var53 = (var52 >> 4 & 0x7) + Statics.field2338;
            int var54 = (var52 & 0x7) + Statics.field262;
            int var55 = var53 + field358.method2640();
            int var56 = var54 + field358.method2640();
            int var57 = field358.method2695();
            int var58 = field358.method2745();
            int var59 = field358.method2701() * 4;
            int var60 = field358.method2701() * 4;
            int var61 = field358.method2745();
            int var62 = field358.method2745();
            int var63 = field358.method2701();
            int var64 = field358.method2701();
            if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104 && var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104 && var58 != 65535) {
                int var65 = var53 * 128 + 64;
                int var66 = var54 * 128 + 64;
                int var67 = var55 * 128 + 64;
                int var68 = var56 * 128 + 64;
                class43 var69 = new class43(var58, Statics.field744, var65, var66, method22(var65, var66, Statics.field744) - var59, field320 + var61, field320 + var62, var63, var64, var57, var60);
                var69.method848(var67, var68, method22(var67, var68, Statics.field744) - var60, field320 + var61);
                field326.method2300(var69);
            }
        } else if (field360 == 143) {
            int var70 = field358.method2675();
            int var71 = field358.method2677();
            int var72 = field358.method2805();
            int var73 = (var72 >> 4 & 0x7) + Statics.field2338;
            int var74 = (var72 & 0x7) + Statics.field262;
            if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
                class44 var75 = new class44();
                var75.field911 = var70;
                var75.field913 = var71;
                if (field522[Statics.field744][var73][var74] == null) {
                    field522[Statics.field744][var73][var74] = new class129();
                }
                field522[Statics.field744][var73][var74].method2300(var75);
                method56(var73, var74);
            }
        } else if (field360 == 117) {
            int var76 = field358.method2805();
            int var77 = var76 >> 2;
            int var78 = var76 & 0x3;
            int var79 = field362[var77];
            int var80 = field358.method2677();
            int var81 = field358.method2805();
            int var82 = (var81 >> 4 & 0x7) + Statics.field2338;
            int var83 = (var81 & 0x7) + Statics.field262;
            if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104) {
                method1512(Statics.field744, var82, var83, var79, var80, var77, var78, 0, -1);
            }
        } else {
            if (field360 == 168) {
                int var84 = field358.method2701();
                int var85 = (var84 >> 4 & 0x7) + Statics.field2338;
                int var86 = (var84 & 0x7) + Statics.field262;
                int var87 = field358.method2745();
                int var88 = field358.method2701();
                int var89 = var88 >> 4 & 0xF;
                int var90 = var88 & 0x7;
                int var91 = field358.method2701();
                if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
                    int var92 = var89 + 1;
                    if (Statics.field266.field681[0] >= var85 - var92 && Statics.field266.field681[0] <= var85 + var92 && Statics.field266.field632[0] >= var86 - var92 && Statics.field266.field632[0] <= var86 + var92 && field555 != 0 && var90 > 0 && field420 < 50) {
                        field557[field420] = var87;
                        field558[field420] = var90;
                        field559[field420] = var91;
                        field561[field420] = null;
                        field560[field420] = (var85 << 16) + (var86 << 8) + var89;
                        field420++;
                    }
                }
            }
            if (field360 == 251) {
                int var93 = field358.method2668();
                int var94 = (var93 >> 4 & 0x7) + Statics.field2338;
                int var95 = (var93 & 0x7) + Statics.field262;
                int var96 = field358.method2675();
                if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                    class129 var97 = field522[Statics.field744][var94][var95];
                    if (var97 != null) {
                        for (class44 var98 = (class44) var97.method2290(); var98 != null; var98 = (class44) var97.method2287()) {
                            if ((var96 & 0x7FFF) == var98.field911) {
                                var98.method2278();
                                break;
                            }
                        }
                        if (var97.method2290() == null) {
                            field522[Statics.field744][var94][var95] = null;
                        }
                        method56(var94, var95);
                    }
                }
            } else if (field360 == 232) {
                int var99 = field358.method2701();
                int var100 = (var99 >> 4 & 0x7) + Statics.field2338;
                int var101 = (var99 & 0x7) + Statics.field262;
                int var102 = field358.method2745();
                int var103 = field358.method2701();
                int var104 = field358.method2745();
                if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
                    int var105 = var100 * 128 + 64;
                    int var106 = var101 * 128 + 64;
                    class34 var107 = new class34(var102, Statics.field744, var105, var106, method22(var105, var106, Statics.field744) - var103, var104, field320);
                    field444.method2300(var107);
                }
            } else if (field360 == 186) {
                int var108 = field358.method2805();
                int var109 = (var108 >> 4 & 0x7) + Statics.field2338;
                int var110 = (var108 & 0x7) + Statics.field262;
                int var111 = field358.method2805();
                int var112 = var111 >> 2;
                int var113 = var111 & 0x3;
                int var114 = field362[var112];
                if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104) {
                    method1512(Statics.field744, var109, var110, var114, -1, var112, var113, 0, -1);
                }
            }
        }
    }

    @ObfuscatedName("cw.bw(IIIIIIIIII)V")
    public static final void method1512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class26 var9 = null;
        for (class26 var10 = (class26) field445.method2290(); var10 != null; var10 = (class26) field445.method2287()) {
            if (var10.field600 == arg0 && var10.field599 == arg1 && var10.field601 == arg2 && var10.field598 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class26();
            var9.field600 = arg0;
            var9.field598 = arg3;
            var9.field599 = arg1;
            var9.field601 = arg2;
            method690(var9);
            field445.method2300(var9);
        }
        var9.field613 = arg4;
        var9.field606 = arg5;
        var9.field604 = arg6;
        var9.field607 = arg7;
        var9.field597 = arg8;
    }

    @ObfuscatedName("ah.bf(Lo;I)V")
    public static final void method690(class26 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field598 == 0) {
            var1 = Statics.field171.method1835(arg0.field600, arg0.field599, arg0.field601);
        }
        if (arg0.field598 == 1) {
            var1 = Statics.field171.method1837(arg0.field600, arg0.field599, arg0.field601);
        }
        if (arg0.field598 == 2) {
            var1 = Statics.field171.method1700(arg0.field600, arg0.field599, arg0.field601);
        }
        if (arg0.field598 == 3) {
            var1 = Statics.field171.method1697(arg0.field600, arg0.field599, arg0.field601);
        }
        if (var1 != 0) {
            int var5 = Statics.field171.method1698(arg0.field600, arg0.field599, arg0.field601, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field605 = var2;
        arg0.field603 = var3;
        arg0.field602 = var4;
    }

    @ObfuscatedName("a.bu(IIIIIIIB)V")
    public static final void method277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field440 && Statics.field744 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field171.method1835(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field171.method1837(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field171.method1700(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field171.method1697(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field171.method1698(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field171.method1686(arg0, arg2, arg3);
                class198 var15 = class198.method3366(var12);
                if (var15.field2912 != 0) {
                    field373[arg0].method2141(arg2, arg3, var13, var14, var15.field2921);
                }
            }
            if (arg1 == 1) {
                Statics.field171.method1687(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field171.method1688(arg0, arg2, arg3);
                class198 var16 = class198.method3366(var12);
                if (var16.field2910 + arg2 > 103 || var16.field2910 + arg3 > 103 || var16.field2911 + arg2 > 103 || var16.field2911 + arg3 > 103) {
                    return;
                }
                if (var16.field2912 != 0) {
                    field373[arg0].method2140(arg2, arg3, var16.field2910, var16.field2911, var14, var16.field2921);
                }
            }
            if (arg1 == 3) {
                Statics.field171.method1699(arg0, arg2, arg3);
                class198 var17 = class198.method3366(var12);
                if (var17.field2912 == 1) {
                    field373[arg0].method2144(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class11.field123[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class88 var19 = Statics.field171;
        class118 var20 = field373[arg0];
        class198 var21 = class198.method3366(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field2911;
            var23 = var21.field2910;
        } else {
            var22 = var21.field2910;
            var23 = var21.field2911;
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
        int[][] var28 = class11.field131[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field2914 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field2920 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class90 var34;
            if (var21.field2918 == -1 && var21.field2935 == null) {
                var34 = var21.method3441(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class50(arg4, 22, arg5, var18, arg2, arg3, var21.field2918, true, (class90) null);
            }
            var19.method1824(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field2912 == 1) {
                var20.method2166(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class90 var57;
            if (var21.field2918 == -1 && var21.field2935 == null) {
                var57 = var21.method3441(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class50(arg4, 10, arg5, var18, arg2, arg3, var21.field2918, true, (class90) null);
            }
            if (var57 != null) {
                var19.method1749(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field2912 != 0) {
                var20.method2138(arg2, arg3, var22, var23, var21.field2921);
            }
        } else if (arg6 >= 12) {
            class90 var35;
            if (var21.field2918 == -1 && var21.field2935 == null) {
                var35 = var21.method3441(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class50(arg4, arg6, arg5, var18, arg2, arg3, var21.field2918, true, (class90) null);
            }
            var19.method1749(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field2912 != 0) {
                var20.method2138(arg2, arg3, var22, var23, var21.field2921);
            }
        } else if (arg6 == 0) {
            class90 var36;
            if (var21.field2918 == -1 && var21.field2935 == null) {
                var36 = var21.method3441(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class50(arg4, 0, arg5, var18, arg2, arg3, var21.field2918, true, (class90) null);
            }
            var19.method1677(arg0, arg2, arg3, var29, var36, (class90) null, class11.field128[arg5], 0, var32, var33);
            if (var21.field2912 != 0) {
                var20.method2137(arg2, arg3, arg6, arg5, var21.field2921);
            }
        } else if (arg6 == 1) {
            class90 var37;
            if (var21.field2918 == -1 && var21.field2935 == null) {
                var37 = var21.method3441(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class50(arg4, 1, arg5, var18, arg2, arg3, var21.field2918, true, (class90) null);
            }
            var19.method1677(arg0, arg2, arg3, var29, var37, (class90) null, class11.field118[arg5], 0, var32, var33);
            if (var21.field2912 != 0) {
                var20.method2137(arg2, arg3, arg6, arg5, var21.field2921);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class90 var39;
            class90 var40;
            if (var21.field2918 == -1 && var21.field2935 == null) {
                var39 = var21.method3441(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method3441(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class50(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field2918, true, (class90) null);
                var40 = new class50(arg4, 2, var38, var18, arg2, arg3, var21.field2918, true, (class90) null);
            }
            var19.method1677(arg0, arg2, arg3, var29, var39, var40, class11.field128[arg5], class11.field128[var38], var32, var33);
            if (var21.field2912 != 0) {
                var20.method2137(arg2, arg3, arg6, arg5, var21.field2921);
            }
        } else if (arg6 == 3) {
            class90 var41;
            if (var21.field2918 == -1 && var21.field2935 == null) {
                var41 = var21.method3441(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class50(arg4, 3, arg5, var18, arg2, arg3, var21.field2918, true, (class90) null);
            }
            var19.method1677(arg0, arg2, arg3, var29, var41, (class90) null, class11.field118[arg5], 0, var32, var33);
            if (var21.field2912 != 0) {
                var20.method2137(arg2, arg3, arg6, arg5, var21.field2921);
            }
        } else if (arg6 == 9) {
            class90 var42;
            if (var21.field2918 == -1 && var21.field2935 == null) {
                var42 = var21.method3441(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class50(arg4, arg6, arg5, var18, arg2, arg3, var21.field2918, true, (class90) null);
            }
            var19.method1749(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field2912 != 0) {
                var20.method2138(arg2, arg3, var22, var23, var21.field2921);
            }
        } else if (arg6 == 4) {
            class90 var43;
            if (var21.field2918 == -1 && var21.field2935 == null) {
                var43 = var21.method3441(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class50(arg4, 4, arg5, var18, arg2, arg3, var21.field2918, true, (class90) null);
            }
            var19.method1764(arg0, arg2, arg3, var29, var43, (class90) null, class11.field128[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1835(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class198.method3366(var45 >> 14 & 0x7FFF).field2919;
            }
            class90 var46;
            if (var21.field2918 == -1 && var21.field2935 == null) {
                var46 = var21.method3441(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class50(arg4, 4, arg5, var18, arg2, arg3, var21.field2918, true, (class90) null);
            }
            var19.method1764(arg0, arg2, arg3, var29, var46, (class90) null, class11.field128[arg5], 0, class11.field119[arg5] * var44, class11.field124[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1835(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class198.method3366(var48 >> 14 & 0x7FFF).field2919 / 2;
            }
            class90 var49;
            if (var21.field2918 == -1 && var21.field2935 == null) {
                var49 = var21.method3441(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class50(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field2918, true, (class90) null);
            }
            var19.method1764(arg0, arg2, arg3, var29, var49, (class90) null, 256, arg5, class11.field121[arg5] * var47, class11.field110[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class90 var51;
            if (var21.field2918 == -1 && var21.field2935 == null) {
                var51 = var21.method3441(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class50(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field2918, true, (class90) null);
            }
            var19.method1764(arg0, arg2, arg3, var29, var51, (class90) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1835(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class198.method3366(var53 >> 14 & 0x7FFF).field2919 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class90 var55;
            class90 var56;
            if (var21.field2918 == -1 && var21.field2935 == null) {
                var55 = var21.method3441(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method3441(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class50(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field2918, true, (class90) null);
                var56 = new class50(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field2918, true, (class90) null);
            }
            var19.method1764(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class11.field121[arg5] * var52, class11.field110[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("w.bo(IIB)V")
    public static final void method56(int arg0, int arg1) {
        class129 var2 = field522[Statics.field744][arg0][arg1];
        if (var2 == null) {
            Statics.field171.method1689(Statics.field744, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class44 var5 = null;
        for (class44 var6 = (class44) var2.method2290(); var6 != null; var6 = (class44) var2.method2287()) {
            class199 var7 = class199.method2849(var6.field911);
            long var8 = (long) var7.field2993;
            if (var7.field2969 == 1) {
                var8 = (long) (var6.field913 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field171.method1689(Statics.field744, arg0, arg1);
            return;
        }
        var2.method2286(var5);
        class44 var10 = null;
        class44 var11 = null;
        for (class44 var12 = (class44) var2.method2290(); var12 != null; var12 = (class44) var2.method2287()) {
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
        Statics.field171.method1694(Statics.field744, arg0, arg1, method22(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field744), var5, var13, var10, var11);
    }

    @ObfuscatedName("gq.bx(B)V")
    public static final void method3342() {
        for (int var0 = 0; var0 < field354; var0++) {
            int var1 = field431[var0];
            class36 var2 = field351[var1];
            int var3 = field358.method2701();
            if ((var3 & 0x20) != 0) {
                var2.field634 = field358.method2677();
                int var4 = field358.method2684();
                var2.field667 = var4 >> 16;
                var2.field666 = (var4 & 0xFFFF) + field320;
                var2.field663 = 0;
                var2.field665 = 0;
                if (var2.field666 > field320) {
                    var2.field663 = -1;
                }
                if (var2.field634 == 65535) {
                    var2.field634 = -1;
                }
            }
            if ((var3 & 0x4) != 0) {
                int var5 = field358.method2668();
                if (var5 > 0) {
                    for (int var6 = 0; var6 < var5; var6++) {
                        int var7 = -1;
                        int var8 = -1;
                        int var9 = -1;
                        int var10 = field358.method2821();
                        if (var10 == 32767) {
                            var10 = field358.method2821();
                            var8 = field358.method2821();
                            var7 = field358.method2821();
                            var9 = field358.method2821();
                        } else if (var10 == 32766) {
                            var10 = -1;
                        } else {
                            var8 = field358.method2821();
                        }
                        int var11 = field358.method2821();
                        var2.method609(var10, var8, var7, var9, field320, var11);
                    }
                }
                int var12 = field358.method2668();
                if (var12 > 0) {
                    for (int var13 = 0; var13 < var12; var13++) {
                        int var14 = field358.method2821();
                        int var15 = field358.method2821();
                        if (var15 == 32767) {
                            var2.method607(var14);
                        } else {
                            int var16 = field358.method2821();
                            int var17 = field358.method2701();
                            int var18 = var15 > 0 ? field358.method2666() : var17;
                            var2.method608(var14, field320, var15, var16, var17, var18);
                        }
                    }
                }
            }
            if ((var3 & 0x1) != 0) {
                var2.field795 = class200.method1605(field358.method2757());
                var2.field673 = var2.field795.field3009;
                var2.field679 = var2.field795.field3032;
                var2.field668 = var2.field795.field3034;
                var2.field635 = var2.field795.field3016;
                var2.field636 = var2.field795.field3006;
                var2.field669 = var2.field795.field3018;
                var2.field631 = var2.field795.field3012;
                var2.field685 = var2.field795.field3039;
                var2.field633 = var2.field795.field3020;
            }
            if ((var3 & 0x40) != 0) {
                int var19 = field358.method2677();
                if (var19 == 65535) {
                    var19 = -1;
                }
                int var20 = field358.method2805();
                if (var2.field658 == var19 && var19 != -1) {
                    int var21 = class202.method2997(var19).field3072;
                    if (var21 == 1) {
                        var2.field659 = 0;
                        var2.field660 = 0;
                        var2.field661 = var20;
                        var2.field630 = 0;
                    }
                    if (var21 == 2) {
                        var2.field630 = 0;
                    }
                } else if (var19 == -1 || var2.field658 == -1 || class202.method2997(var19).field3066 >= class202.method2997(var2.field658).field3066) {
                    var2.field658 = var19;
                    var2.field659 = 0;
                    var2.field660 = 0;
                    var2.field661 = var20;
                    var2.field630 = 0;
                    var2.field637 = var2.field680;
                }
            }
            if ((var3 & 0x2) != 0) {
                int var22 = field358.method2677();
                int var23 = field358.method2677();
                int var24 = var2.field675 - (var22 - Statics.field791 - Statics.field791) * 64;
                int var25 = var2.field627 - (var23 - Statics.field37 - Statics.field37) * 64;
                if (var24 != 0 || var25 != 0) {
                    var2.field654 = (int) (Math.atan2((double) var24, (double) var25) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x10) != 0) {
                var2.field641 = field358.method2745();
                if (var2.field641 == 65535) {
                    var2.field641 = -1;
                }
            }
            if ((var3 & 0x8) != 0) {
                var2.field639 = field358.method2699();
                var2.field642 = 100;
            }
        }
    }

    @ObfuscatedName("ax.bi(III)V")
    public static final void method686(int arg0, int arg1) {
        int var2 = Statics.field3199.method3663(class174.field2495);
        for (int var3 = 0; var3 < field453; var3++) {
            int var4 = Statics.field3199.method3663(method270(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field453 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field1749) {
            var6 = Statics.field1749 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field2019) {
            var7 = Statics.field2019 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field171.method1705(Statics.field744, arg0, arg1, false);
        field452 = true;
        Statics.field4 = var6;
        Statics.field149 = var7;
        Statics.field1733 = var2;
        Statics.field3041 = field453 * 15 + 22;
    }

    @ObfuscatedName("n.bn(II)Z")
    public static final boolean method273(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field456[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("bw.bz(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1199(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 31) {
            field310.method2874(233);
            field310.method2681(arg1);
            field310.method2717(Statics.field1745);
            field310.method2672(Statics.field83);
            field310.method2682(Statics.field968);
            field310.method2673(arg0);
            field310.method2672(arg3);
            field426 = 0;
            Statics.field1364 = class170.method669(arg1);
            field407 = arg0;
        }
        if (arg2 == 14) {
            class24 var8 = field434[arg3];
            if (var8 != null) {
                field423 = arg6;
                field422 = arg7;
                field424 = 2;
                field549 = 0;
                field548 = arg0;
                field425 = arg1;
                field310.method2874(146);
                field310.method2651(class106.field1726[82] ? 1 : 0);
                field310.method2625(Statics.field83);
                field310.method2673(Statics.field1745);
                field310.method2625(arg3);
                field310.method2682(Statics.field968);
            }
        }
        if (arg2 == 12) {
            class36 var9 = field351[arg3];
            if (var9 != null) {
                field423 = arg6;
                field422 = arg7;
                field424 = 2;
                field549 = 0;
                field548 = arg0;
                field425 = arg1;
                field310.method2874(199);
                field310.method2665(class106.field1726[82] ? 1 : 0);
                field310.method2673(arg3);
            }
        }
        if (arg2 == 11) {
            class36 var10 = field351[arg3];
            if (var10 != null) {
                field423 = arg6;
                field422 = arg7;
                field424 = 2;
                field549 = 0;
                field548 = arg0;
                field425 = arg1;
                field310.method2874(45);
                field310.method2665(class106.field1726[82] ? 1 : 0);
                field310.method2673(arg3);
            }
        }
        if (arg2 == 24) {
            class170 var11 = class170.method669(arg1);
            boolean var12 = true;
            if (var11.field2191 > 0) {
                var12 = method770(var11);
            }
            if (var12) {
                field310.method2874(62);
                field310.method2627(arg1);
            }
        }
        if (arg2 == 30 && field478 == null) {
            field310.method2874(171);
            field310.method2672(arg0);
            field310.method2627(arg1);
            field478 = class170.method813(arg1, arg0);
            method37(field478);
        }
        if (arg2 == 48) {
            class24 var13 = field434[arg3];
            if (var13 != null) {
                field423 = arg6;
                field422 = arg7;
                field424 = 2;
                field549 = 0;
                field548 = arg0;
                field425 = arg1;
                field310.method2874(99);
                field310.method2625(arg3);
                field310.method2665(class106.field1726[82] ? 1 : 0);
            }
        }
        if (arg2 == 1002) {
            field423 = arg6;
            field422 = arg7;
            field424 = 2;
            field549 = 0;
            field310.method2874(88);
            field310.method2717(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 39) {
            field310.method2874(29);
            field310.method2717(arg0);
            field310.method2717(arg3);
            field310.method2682(arg1);
            field426 = 0;
            Statics.field1364 = class170.method669(arg1);
            field407 = arg0;
        }
        if (arg2 == 29) {
            field310.method2874(62);
            field310.method2627(arg1);
            class170 var14 = class170.method669(arg1);
            if (var14.field2299 != null && var14.field2299[0][0] == 5) {
                int var15 = var14.field2299[0][1];
                if (class166.field2154[var15] != var14.field2211[0]) {
                    class166.field2154[var15] = var14.field2211[0];
                    method264(var15);
                }
            }
        }
        if (arg2 == 15) {
            class24 var16 = field434[arg3];
            if (var16 != null) {
                field423 = arg6;
                field422 = arg7;
                field424 = 2;
                field549 = 0;
                field548 = arg0;
                field425 = arg1;
                field310.method2874(30);
                field310.method2625(field470);
                field310.method2717(arg3);
                field310.method2681(Statics.field622);
                field310.method2651(class106.field1726[82] ? 1 : 0);
            }
        }
        if (arg2 == 23) {
            if (field452) {
                Statics.field171.method1706();
            } else {
                Statics.field171.method1705(Statics.field744, arg0, arg1, true);
            }
        }
        if (arg2 == 49) {
            class24 var17 = field434[arg3];
            if (var17 != null) {
                field423 = arg6;
                field422 = arg7;
                field424 = 2;
                field549 = 0;
                field548 = arg0;
                field425 = arg1;
                field310.method2874(240);
                field310.method2663(class106.field1726[82] ? 1 : 0);
                field310.method2672(arg3);
            }
        }
        if (arg2 == 36) {
            field310.method2874(249);
            field310.method2717(arg0);
            field310.method2717(arg3);
            field310.method2683(arg1);
            field426 = 0;
            Statics.field1364 = class170.method669(arg1);
            field407 = arg0;
        }
        if (arg2 == 8) {
            class36 var18 = field351[arg3];
            if (var18 != null) {
                field423 = arg6;
                field422 = arg7;
                field424 = 2;
                field549 = 0;
                field548 = arg0;
                field425 = arg1;
                field310.method2874(241);
                field310.method2717(field470);
                field310.method2625(arg3);
                field310.method2770(class106.field1726[82] ? 1 : 0);
                field310.method2681(Statics.field622);
            }
        }
        if (arg2 == 32) {
            field310.method2874(19);
            field310.method2681(Statics.field622);
            field310.method2717(arg3);
            field310.method2717(field470);
            field310.method2681(arg1);
            field310.method2673(arg0);
            field426 = 0;
            Statics.field1364 = class170.method669(arg1);
            field407 = arg0;
        }
        if (arg2 == 1003) {
            field423 = arg6;
            field422 = arg7;
            field424 = 2;
            field549 = 0;
            class36 var19 = field351[arg3];
            if (var19 != null) {
                class200 var20 = var19.field795;
                if (var20.field3033 != null) {
                    var20 = var20.method3506();
                }
                if (var20 != null) {
                    field310.method2874(229);
                    field310.method2673(var20.field3007);
                }
            }
        }
        if (arg2 == 16) {
            field423 = arg6;
            field422 = arg7;
            field424 = 2;
            field549 = 0;
            field548 = arg0;
            field425 = arg1;
            field310.method2874(159);
            field310.method2717(Statics.field1745);
            field310.method2651(class106.field1726[82] ? 1 : 0);
            field310.method2717(Statics.field37 + arg1);
            field310.method2682(Statics.field968);
            field310.method2625(Statics.field791 + arg0);
            field310.method2625(Statics.field83);
            field310.method2672(arg3);
        }
        if (arg2 == 58) {
            class170 var21 = class170.method813(arg1, arg0);
            if (var21 != null) {
                field310.method2874(91);
                field310.method2672(field406);
                field310.method2681(Statics.field622);
                field310.method2717(field470);
                field310.method2672(arg0);
                field310.method2682(arg1);
                field310.method2673(var21.field2307);
            }
        }
        if (arg2 == 22) {
            field423 = arg6;
            field422 = arg7;
            field424 = 2;
            field549 = 0;
            field548 = arg0;
            field425 = arg1;
            field310.method2874(238);
            field310.method2673(arg3);
            field310.method2673(Statics.field791 + arg0);
            field310.method2665(class106.field1726[82] ? 1 : 0);
            field310.method2672(Statics.field37 + arg1);
        }
        if (arg2 == 20) {
            field423 = arg6;
            field422 = arg7;
            field424 = 2;
            field549 = 0;
            field548 = arg0;
            field425 = arg1;
            field310.method2874(27);
            field310.method2672(arg3);
            field310.method2673(Statics.field37 + arg1);
            field310.method2673(Statics.field791 + arg0);
            field310.method2651(class106.field1726[82] ? 1 : 0);
        }
        if (arg2 == 37) {
            field310.method2874(251);
            field310.method2627(arg1);
            field310.method2717(arg0);
            field310.method2672(arg3);
            field426 = 0;
            Statics.field1364 = class170.method669(arg1);
            field407 = arg0;
        }
        if (arg2 == 2) {
            field423 = arg6;
            field422 = arg7;
            field424 = 2;
            field549 = 0;
            field548 = arg0;
            field425 = arg1;
            field310.method2874(54);
            field310.method2673(Statics.field791 + arg0);
            field310.method2663(class106.field1726[82] ? 1 : 0);
            field310.method2673(arg3 >> 14 & 0x7FFF);
            field310.method2681(Statics.field622);
            field310.method2673(field470);
            field310.method2673(Statics.field37 + arg1);
        }
        if (arg2 == 21) {
            field423 = arg6;
            field422 = arg7;
            field424 = 2;
            field549 = 0;
            field548 = arg0;
            field425 = arg1;
            field310.method2874(28);
            field310.method2665(class106.field1726[82] ? 1 : 0);
            field310.method2673(arg3);
            field310.method2717(Statics.field37 + arg1);
            field310.method2717(Statics.field791 + arg0);
        }
        if (arg2 == 25) {
            class170 var22 = class170.method813(arg1, arg0);
            if (var22 != null) {
                if (field469) {
                    class170 var23 = class170.method813(Statics.field622, field470);
                    if (var23 != null && var23.field2279 != null) {
                        class19 var24 = new class19();
                        var24.field224 = var23;
                        var24.field233 = var23.field2279;
                        class33.method1870(var24);
                    }
                    field469 = false;
                    method37(var23);
                }
                int var25 = method3069(var22);
                int var26 = var25 >> 11 & 0x3F;
                int var28 = var22.field2307;
                class170 var29 = class170.method813(arg1, arg0);
                if (var29 != null && var29.field2278 != null) {
                    class19 var30 = new class19();
                    var30.field224 = var29;
                    var30.field233 = var29.field2278;
                    class33.method1870(var30);
                }
                field406 = var28;
                field469 = true;
                Statics.field622 = arg1;
                field470 = arg0;
                Statics.field74 = var26;
                method37(var29);
                field467 = 0;
                int var31 = method3069(var22);
                int var32 = var31 >> 11 & 0x3F;
                String var33;
                if (var32 == 0) {
                    var33 = null;
                } else if (var22.field2266 == null || var22.field2266.trim().length() == 0) {
                    var33 = null;
                } else {
                    var33 = var22.field2266;
                }
                field490 = var33;
                if (field490 == null) {
                    field490 = "Null";
                }
                if (var22.field2277) {
                    field473 = var22.field2248 + class38.method2134(16777215);
                } else {
                    field473 = class38.method2134(65280) + var22.field2283 + class38.method2134(16777215);
                }
            }
            return;
        }
        if (arg2 == 35) {
            field310.method2874(94);
            field310.method2672(arg3);
            field310.method2673(arg0);
            field310.method2627(arg1);
            field426 = 0;
            Statics.field1364 = class170.method669(arg1);
            field407 = arg0;
        }
        if (arg2 == 10) {
            class36 var34 = field351[arg3];
            if (var34 != null) {
                field423 = arg6;
                field422 = arg7;
                field424 = 2;
                field549 = 0;
                field548 = arg0;
                field425 = arg1;
                field310.method2874(100);
                field310.method2625(arg3);
                field310.method2770(class106.field1726[82] ? 1 : 0);
            }
        }
        if (arg2 == 51) {
            class24 var35 = field434[arg3];
            if (var35 != null) {
                field423 = arg6;
                field422 = arg7;
                field424 = 2;
                field549 = 0;
                field548 = arg0;
                field425 = arg1;
                field310.method2874(131);
                field310.method2673(arg3);
                field310.method2770(class106.field1726[82] ? 1 : 0);
            }
        }
        if (arg2 == 1001) {
            field423 = arg6;
            field422 = arg7;
            field424 = 2;
            field549 = 0;
            field548 = arg0;
            field425 = arg1;
            field310.method2874(130);
            field310.method2717(Statics.field791 + arg0);
            field310.method2665(class106.field1726[82] ? 1 : 0);
            field310.method2673(Statics.field37 + arg1);
            field310.method2673(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 46) {
            class24 var36 = field434[arg3];
            if (var36 != null) {
                field423 = arg6;
                field422 = arg7;
                field424 = 2;
                field549 = 0;
                field548 = arg0;
                field425 = arg1;
                field310.method2874(216);
                field310.method2672(arg3);
                field310.method2651(class106.field1726[82] ? 1 : 0);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class170 var37 = class170.method813(arg1, arg0);
            if (var37 != null) {
                method192(arg3, arg1, arg0, var37.field2307, arg5);
            }
        }
        if (arg2 == 42) {
            field310.method2874(58);
            field310.method2717(arg3);
            field310.method2683(arg1);
            field310.method2672(arg0);
            field426 = 0;
            Statics.field1364 = class170.method669(arg1);
            field407 = arg0;
        }
        if (arg2 == 33) {
            field310.method2874(132);
            field310.method2625(arg3);
            field310.method2673(arg0);
            field310.method2682(arg1);
            field426 = 0;
            Statics.field1364 = class170.method669(arg1);
            field407 = arg0;
        }
        if (arg2 == 44) {
            class24 var38 = field434[arg3];
            if (var38 != null) {
                field423 = arg6;
                field422 = arg7;
                field424 = 2;
                field549 = 0;
                field548 = arg0;
                field425 = arg1;
                field310.method2874(197);
                field310.method2672(arg3);
                field310.method2663(class106.field1726[82] ? 1 : 0);
            }
        }
        if (arg2 == 17) {
            field423 = arg6;
            field422 = arg7;
            field424 = 2;
            field549 = 0;
            field548 = arg0;
            field425 = arg1;
            field310.method2874(67);
            field310.method2717(field470);
            field310.method2665(class106.field1726[82] ? 1 : 0);
            field310.method2625(Statics.field791 + arg0);
            field310.method2672(arg3);
            field310.method2625(Statics.field37 + arg1);
            field310.method2682(Statics.field622);
        }
        if (arg2 == 41) {
            field310.method2874(161);
            field310.method2681(arg1);
            field310.method2672(arg3);
            field310.method2672(arg0);
            field426 = 0;
            Statics.field1364 = class170.method669(arg1);
            field407 = arg0;
        }
        if (arg2 == 1005) {
            class170 var39 = class170.method669(arg1);
            if (var39 == null || var39.field2306[arg0] < 100000) {
                field310.method2874(59);
                field310.method2672(arg3);
            } else {
                class48.method685(27, "", var39.field2306[arg0] + " x " + class199.method2849(arg3).field2958);
            }
            field426 = 0;
            Statics.field1364 = class170.method669(arg1);
            field407 = arg0;
        }
        if (arg2 == 47) {
            class24 var40 = field434[arg3];
            if (var40 != null) {
                field423 = arg6;
                field422 = arg7;
                field424 = 2;
                field549 = 0;
                field548 = arg0;
                field425 = arg1;
                field310.method2874(98);
                field310.method2663(class106.field1726[82] ? 1 : 0);
                field310.method2717(arg3);
            }
        }
        if (arg2 == 40) {
            field310.method2874(167);
            field310.method2717(arg3);
            field310.method2627(arg1);
            field310.method2673(arg0);
            field426 = 0;
            Statics.field1364 = class170.method669(arg1);
            field407 = arg0;
        }
        if (arg2 == 3) {
            field423 = arg6;
            field422 = arg7;
            field424 = 2;
            field549 = 0;
            field548 = arg0;
            field425 = arg1;
            field310.method2874(221);
            field310.method2673(Statics.field791 + arg0);
            field310.method2672(Statics.field37 + arg1);
            field310.method2665(class106.field1726[82] ? 1 : 0);
            field310.method2673(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 9) {
            class36 var41 = field351[arg3];
            if (var41 != null) {
                field423 = arg6;
                field422 = arg7;
                field424 = 2;
                field549 = 0;
                field548 = arg0;
                field425 = arg1;
                field310.method2874(39);
                field310.method2672(arg3);
                field310.method2665(class106.field1726[82] ? 1 : 0);
            }
        }
        if (arg2 == 38) {
            method3067();
            class170 var42 = class170.method669(arg1);
            field467 = 1;
            Statics.field1745 = arg0;
            Statics.field968 = arg1;
            Statics.field83 = arg3;
            method37(var42);
            field497 = class38.method2134(16748608) + class199.method2849(arg3).field2958 + class38.method2134(16777215);
            if (field497 == null) {
                field497 = "null";
            }
            return;
        }
        if (arg2 == 1) {
            field423 = arg6;
            field422 = arg7;
            field424 = 2;
            field549 = 0;
            field548 = arg0;
            field425 = arg1;
            field310.method2874(82);
            field310.method2672(Statics.field37 + arg1);
            field310.method2683(Statics.field968);
            field310.method2770(class106.field1726[82] ? 1 : 0);
            field310.method2673(Statics.field791 + arg0);
            field310.method2717(Statics.field1745);
            field310.method2625(Statics.field83);
            field310.method2672(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 50) {
            class24 var43 = field434[arg3];
            if (var43 != null) {
                field423 = arg6;
                field422 = arg7;
                field424 = 2;
                field549 = 0;
                field548 = arg0;
                field425 = arg1;
                field310.method2874(101);
                field310.method2672(arg3);
                field310.method2651(class106.field1726[82] ? 1 : 0);
            }
        }
        if (arg2 == 34) {
            field310.method2874(207);
            field310.method2627(arg1);
            field310.method2717(arg3);
            field310.method2625(arg0);
            field426 = 0;
            Statics.field1364 = class170.method669(arg1);
            field407 = arg0;
        }
        if (arg2 == 6) {
            field423 = arg6;
            field422 = arg7;
            field424 = 2;
            field549 = 0;
            field548 = arg0;
            field425 = arg1;
            field310.method2874(219);
            field310.method2625(Statics.field791 + arg0);
            field310.method2672(Statics.field37 + arg1);
            field310.method2770(class106.field1726[82] ? 1 : 0);
            field310.method2625(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 26) {
            method1987();
        }
        if (arg2 == 5) {
            field423 = arg6;
            field422 = arg7;
            field424 = 2;
            field549 = 0;
            field548 = arg0;
            field425 = arg1;
            field310.method2874(119);
            field310.method2717(Statics.field791 + arg0);
            field310.method2717(Statics.field37 + arg1);
            field310.method2770(class106.field1726[82] ? 1 : 0);
            field310.method2625(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 4) {
            field423 = arg6;
            field422 = arg7;
            field424 = 2;
            field549 = 0;
            field548 = arg0;
            field425 = arg1;
            field310.method2874(26);
            field310.method2625(Statics.field37 + arg1);
            field310.method2673(arg3 >> 14 & 0x7FFF);
            field310.method2665(class106.field1726[82] ? 1 : 0);
            field310.method2625(Statics.field791 + arg0);
        }
        if (arg2 == 19) {
            field423 = arg6;
            field422 = arg7;
            field424 = 2;
            field549 = 0;
            field548 = arg0;
            field425 = arg1;
            field310.method2874(93);
            field310.method2625(Statics.field791 + arg0);
            field310.method2663(class106.field1726[82] ? 1 : 0);
            field310.method2673(arg3);
            field310.method2625(Statics.field37 + arg1);
        }
        if (arg2 == 43) {
            field310.method2874(153);
            field310.method2625(arg0);
            field310.method2717(arg3);
            field310.method2627(arg1);
            field426 = 0;
            Statics.field1364 = class170.method669(arg1);
            field407 = arg0;
        }
        if (arg2 == 1004) {
            field423 = arg6;
            field422 = arg7;
            field424 = 2;
            field549 = 0;
            field310.method2874(59);
            field310.method2672(arg3);
        }
        if (arg2 == 28) {
            field310.method2874(62);
            field310.method2627(arg1);
            class170 var44 = class170.method669(arg1);
            if (var44.field2299 != null && var44.field2299[0][0] == 5) {
                int var45 = var44.field2299[0][1];
                class166.field2154[var45] = 1 - class166.field2154[var45];
                method264(var45);
            }
        }
        if (arg2 == 7) {
            class36 var46 = field351[arg3];
            if (var46 != null) {
                field423 = arg6;
                field422 = arg7;
                field424 = 2;
                field549 = 0;
                field548 = arg0;
                field425 = arg1;
                field310.method2874(222);
                field310.method2717(Statics.field83);
                field310.method2683(Statics.field968);
                field310.method2672(Statics.field1745);
                field310.method2625(arg3);
                field310.method2665(class106.field1726[82] ? 1 : 0);
            }
        }
        if (arg2 == 18) {
            field423 = arg6;
            field422 = arg7;
            field424 = 2;
            field549 = 0;
            field548 = arg0;
            field425 = arg1;
            field310.method2874(254);
            field310.method2651(class106.field1726[82] ? 1 : 0);
            field310.method2672(Statics.field37 + arg1);
            field310.method2672(Statics.field791 + arg0);
            field310.method2672(arg3);
        }
        if (arg2 == 45) {
            class24 var47 = field434[arg3];
            if (var47 != null) {
                field423 = arg6;
                field422 = arg7;
                field424 = 2;
                field549 = 0;
                field548 = arg0;
                field425 = arg1;
                field310.method2874(160);
                field310.method2717(arg3);
                field310.method2651(class106.field1726[82] ? 1 : 0);
            }
        }
        if (arg2 == 13) {
            class36 var48 = field351[arg3];
            if (var48 != null) {
                field423 = arg6;
                field422 = arg7;
                field424 = 2;
                field549 = 0;
                field548 = arg0;
                field425 = arg1;
                field310.method2874(110);
                field310.method2625(arg3);
                field310.method2651(class106.field1726[82] ? 1 : 0);
            }
        }
        if (field467 != 0) {
            field467 = 0;
            method37(class170.method669(Statics.field968));
        }
        if (field469 && field469) {
            class170 var49 = class170.method813(Statics.field622, field470);
            if (var49 != null && var49.field2279 != null) {
                class19 var50 = new class19();
                var50.field224 = var49;
                var50.field233 = var49.field2279;
                class33.method1870(var50);
            }
            field469 = false;
            method37(var49);
        }
        if (Statics.field1364 != null && field426 == 0) {
            method37(Statics.field1364);
        }
    }

    @ObfuscatedName("v.bh(ILjava/lang/String;B)V")
    public static void method175(int arg0, String arg1) {
        int var2 = class46.field935;
        int[] var3 = class46.field926;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class24 var6 = field434[var3[var5]];
            if (var6 != null && Statics.field266 != var6 && var6.field283 != null && var6.field283.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field310.method2874(197);
                    field310.method2672(var3[var5]);
                    field310.method2663(0);
                } else if (arg0 == 4) {
                    field310.method2874(98);
                    field310.method2663(0);
                    field310.method2717(var3[var5]);
                } else if (arg0 == 6) {
                    field310.method2874(240);
                    field310.method2663(0);
                    field310.method2672(var3[var5]);
                } else if (arg0 == 7) {
                    field310.method2874(101);
                    field310.method2672(var3[var5]);
                    field310.method2651(0);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class48.method685(4, "", class174.field2491 + arg1);
        }
    }

    @ObfuscatedName("fp.br(B)V")
    public static void method3067() {
        if (!field469) {
            return;
        }
        class170 var0 = class170.method813(Statics.field622, field470);
        if (var0 != null && var0.field2279 != null) {
            class19 var1 = new class19();
            var1.field224 = var0;
            var1.field233 = var0.field2279;
            class33.method1870(var1);
        }
        field469 = false;
        method37(var0);
    }

    @ObfuscatedName("v.bg(IIIILjava/lang/String;B)V")
    public static void method192(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class170 var5 = class170.method813(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2287 != null) {
            class19 var6 = new class19();
            var6.field224 = var5;
            var6.field227 = arg0;
            var6.field225 = arg4;
            var6.field233 = var5.field2287;
            class33.method1870(var6);
        }
        boolean var7 = true;
        if (var5.field2191 > 0) {
            var7 = method770(var5);
        }
        if (!var7 || !class171.method1879(method3069(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field310.method2874(168);
            field310.method2627(arg1);
            field310.method2625(arg2);
            field310.method2625(arg3);
        }
        if (arg0 == 2) {
            field310.method2874(34);
            field310.method2627(arg1);
            field310.method2625(arg2);
            field310.method2625(arg3);
        }
        if (arg0 == 3) {
            field310.method2874(86);
            field310.method2627(arg1);
            field310.method2625(arg2);
            field310.method2625(arg3);
        }
        if (arg0 == 4) {
            field310.method2874(186);
            field310.method2627(arg1);
            field310.method2625(arg2);
            field310.method2625(arg3);
        }
        if (arg0 == 5) {
            field310.method2874(103);
            field310.method2627(arg1);
            field310.method2625(arg2);
            field310.method2625(arg3);
        }
        if (arg0 == 6) {
            field310.method2874(76);
            field310.method2627(arg1);
            field310.method2625(arg2);
            field310.method2625(arg3);
        }
        if (arg0 == 7) {
            field310.method2874(185);
            field310.method2627(arg1);
            field310.method2625(arg2);
            field310.method2625(arg3);
        }
        if (arg0 == 8) {
            field310.method2874(63);
            field310.method2627(arg1);
            field310.method2625(arg2);
            field310.method2625(arg3);
        }
        if (arg0 == 9) {
            field310.method2874(148);
            field310.method2627(arg1);
            field310.method2625(arg2);
            field310.method2625(arg3);
        }
        if (arg0 == 10) {
            field310.method2874(204);
            field310.method2627(arg1);
            field310.method2625(arg2);
            field310.method2625(arg3);
        }
    }

    @ObfuscatedName("p.ba(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method243(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        Statics.method81(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("ex.cg(I)I")
    public static final int method2572() {
        if (field453 <= 0) {
            return -1;
        } else if (field562 && class106.field1726[81] && field392 != -1) {
            return field392;
        } else {
            return field453 - 1;
        }
    }

    @ObfuscatedName("q.cb(I)V")
    public static void method172() {
        for (int var0 = 0; var0 < field453; var0++) {
            if (method646(field456[var0])) {
                if (var0 < field453 - 1) {
                    for (int var1 = var0; var1 < field453 - 1; var1++) {
                        field458[var1] = field458[var1 + 1];
                        field421[var1] = field421[var1 + 1];
                        field456[var1] = field456[var1 + 1];
                        field542[var1] = field542[var1 + 1];
                        field532[var1] = field532[var1 + 1];
                        field455[var1] = field455[var1 + 1];
                    }
                }
                field453--;
            }
        }
    }

    @ObfuscatedName("af.cs(II)Z")
    public static boolean method646(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("n.cj(II)Ljava/lang/String;")
    public static String method270(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field421[arg0].length() > 0) {
            return field458[arg0] + class174.field2502 + field421[arg0];
        } else {
            return field458[arg0];
        }
    }

    @ObfuscatedName("l.cf(IIIIB)V")
    public static final void method198(int arg0, int arg1, int arg2, int arg3) {
        if (field467 == 0 && !field469) {
            method243(class174.field2497, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class83.field1423; var6++) {
            int var7 = class83.field1424[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field171.method1698(Statics.field744, var8, var9, var7) >= 0) {
                    class198 var12 = class198.method3366(var11);
                    if (var12.field2935 != null) {
                        var12 = var12.method3409();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field467 == 1) {
                        method243(class174.field2492, field497 + " " + class38.field815 + " " + class38.method2134(65535) + var12.field2905, 1, var7, var8, var9);
                    } else if (!field469) {
                        String[] var13 = var12.field2922;
                        if (field485) {
                            var13 = method856(var13);
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
                                    method243(var13[var14], class38.method2134(65535) + var12.field2905, var15, var7, var8, var9);
                                }
                            }
                        }
                        method243(class174.field2405, class38.method2134(65535) + var12.field2905, 1002, var12.field2902 << 14, var8, var9);
                    } else if ((Statics.field74 & 0x4) == 4) {
                        method243(field490, field473 + " " + class38.field815 + " " + class38.method2134(65535) + var12.field2905, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class36 var16 = field351[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field795.field3009 == 1 && (var16.field675 & 0x7F) == 64 && (var16.field627 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field352; var17++) {
                            class36 var18 = field351[field571[var17]];
                            if (var18 != null && var16 != var18 && var18.field795.field3009 == 1 && var16.field675 == var18.field675 && var16.field627 == var18.field627) {
                                method3649(var18.field795, field571[var17], var8, var9);
                            }
                        }
                        int var19 = class46.field935;
                        int[] var20 = class46.field926;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class24 var22 = field434[var20[var21]];
                            if (var22 != null && var16.field675 == var22.field675 && var16.field627 == var22.field627) {
                                method102(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method3649(var16.field795, var11, var8, var9);
                }
                if (var10 == 0) {
                    class24 var23 = field434[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field675 & 0x7F) == 64 && (var23.field627 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field352; var24++) {
                            class36 var25 = field351[field571[var24]];
                            if (var25 != null && var25.field795.field3009 == 1 && var23.field675 == var25.field675 && var23.field627 == var25.field627) {
                                method3649(var25.field795, field571[var24], var8, var9);
                            }
                        }
                        int var26 = class46.field935;
                        int[] var27 = class46.field926;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class24 var29 = field434[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field675 == var29.field675 && var23.field627 == var29.field627) {
                                method102(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field408 == var11) {
                        var4 = var7;
                    } else {
                        method102(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class129 var30 = field522[Statics.field744][var8][var9];
                    if (var30 != null) {
                        for (class44 var31 = (class44) var30.method2291(); var31 != null; var31 = (class44) var30.method2293()) {
                            class199 var32 = class199.method2849(var31.field911);
                            if (field467 == 1) {
                                method243(class174.field2492, field497 + " " + class38.field815 + " " + class38.method2134(16748608) + var32.field2958, 16, var31.field911, var8, var9);
                            } else if (!field469) {
                                String[] var33 = var32.field2982;
                                if (field485) {
                                    var33 = method856(var33);
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
                                        method243(var33[var34], class38.method2134(16748608) + var32.field2958, var35, var31.field911, var8, var9);
                                    } else if (var34 == 2) {
                                        method243(class174.field2345, class38.method2134(16748608) + var32.field2958, 20, var31.field911, var8, var9);
                                    }
                                }
                                method243(class174.field2405, class38.method2134(16748608) + var32.field2958, 1004, var31.field911, var8, var9);
                            } else if ((Statics.field74 & 0x1) == 1) {
                                method243(field490, field473 + " " + class38.field815 + " " + class38.method2134(16748608) + var32.field2958, 17, var31.field911, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class24 var38 = field434[field408];
            method102(var38, field408, var36, var37);
        }
    }

    @ObfuscatedName("gi.cv(Lgw;IIII)V")
    public static final void method3649(class200 arg0, int arg1, int arg2, int arg3) {
        if (field453 >= 400) {
            return;
        }
        if (arg0.field3033 != null) {
            arg0 = arg0.method3506();
        }
        if (arg0 == null || !arg0.field3036 || arg0.field3038 && field482 != arg1) {
            return;
        }
        String var4 = arg0.field3028;
        if (arg0.field3025 != 0) {
            var4 = var4 + method3000(arg0.field3025, Statics.field266.field276) + " " + class38.field810 + class174.field2498 + arg0.field3025 + class38.field814;
        }
        if (arg0.field3038 && field347) {
            method243(class174.field2405, class38.method2134(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field467 == 1) {
            method243(class174.field2492, field497 + " " + class38.field815 + " " + class38.method2134(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field469) {
            int var5 = arg0.field3038 && field347 ? 2000 : 0;
            String[] var6 = arg0.field3023;
            if (field485) {
                var6 = method856(var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class174.field2494)) {
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
                        method243(var6[var7], class38.method2134(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class174.field2494)) {
                        short var10 = 0;
                        if (field338 != class41.field837) {
                            if (field338 == class41.field836 || field338 == class41.field840 && arg0.field3025 > Statics.field266.field276) {
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
                            method243(var6[var9], class38.method2134(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3038 || !field347) {
                method243(class174.field2405, class38.method2134(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field74 & 0x2) == 2) {
            method243(field490, field473 + " " + class38.field815 + " " + class38.method2134(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("k.ce(Ln;IIII)V")
    public static final void method102(class24 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field266 == arg0 || field453 >= 400) {
            return;
        }
        String var4;
        if (arg0.field282 == 0) {
            var4 = arg0.field275[0] + arg0.field283 + arg0.field275[1] + method3000(arg0.field276, Statics.field266.field276) + " " + class38.field810 + class174.field2498 + arg0.field276 + class38.field814 + arg0.field275[2];
        } else {
            var4 = arg0.field275[0] + arg0.field283 + arg0.field275[1] + " " + class38.field810 + class174.field2548 + arg0.field282 + class38.field814 + arg0.field275[2];
        }
        if (field467 == 1) {
            method243(class174.field2492, field497 + " " + class38.field815 + " " + class38.method2134(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field469) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field417[var5] != null) {
                    short var6 = 0;
                    if (field417[var5].equalsIgnoreCase(class174.field2494)) {
                        if (field337 == class41.field837) {
                            continue;
                        }
                        if (field337 == class41.field836 || field337 == class41.field840 && arg0.field276 > Statics.field266.field276) {
                            var6 = 2000;
                        }
                        if (Statics.field266.field290 != 0 && arg0.field290 != 0) {
                            if (Statics.field266.field290 == arg0.field290) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field464[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field439[var5] + var6;
                    method243(field417[var5], class38.method2134(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field74 & 0x8) == 8) {
            method243(field490, field473 + " " + class38.field815 + " " + class38.method2134(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field453; var9++) {
            if (field456[var9] == 23) {
                field421[var9] = class38.method2134(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("fs.ck(III)Ljava/lang/String;")
    public static final String method3000(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class38.method2134(16711680);
        } else if (var2 < -6) {
            return class38.method2134(16723968);
        } else if (var2 < -3) {
            return class38.method2134(16740352);
        } else if (var2 < 0) {
            return class38.method2134(16756736);
        } else if (var2 > 9) {
            return class38.method2134(65280);
        } else if (var2 > 6) {
            return class38.method2134(4259584);
        } else if (var2 > 3) {
            return class38.method2134(8453888);
        } else if (var2 > 0) {
            return class38.method2134(12648192);
        } else {
            return class38.method2134(16776960);
        }
    }

    @ObfuscatedName("gb.cc(IIIIIIIII)V")
    public static final void method3621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class170.method869(arg0)) {
            Statics.field1214 = null;
            method1861(Statics.field2223[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1214 != null) {
                method1861(Statics.field1214, -1412584499, arg1, arg2, arg3, arg4, Statics.field750, Statics.field3130, arg7);
                Statics.field1214 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field519[var8] = true;
            }
        } else {
            field519[arg7] = true;
        }
    }

    @ObfuscatedName("cl.cd([Lfy;IIIIIIIIB)V")
    public static final void method1861(class170[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class220.method3795(arg2, arg3, arg4, arg5);
        class85.method1622();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class170 var10 = arg0[var9];
            if (var10 != null && (var10.field2255 == arg1 || arg1 == -1412584499 && field487 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field316[field312] = var10.field2253 + arg6;
                    field412[field312] = var10.field2201 + arg7;
                    field524[field312] = var10.field2202;
                    field520[field312] = var10.field2302;
                    var11 = ++field312 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2182 = var11;
                var10.field2319 = field320;
                if (!var10.field2277 || !method196(var10)) {
                    if (var10.field2191 > 0) {
                        int var12 = var10.field2191;
                        if (var12 == 324) {
                            if (field368 == -1) {
                                field368 = var10.field2222;
                                field589 = var10.field2298;
                            }
                            if (field577.field2162) {
                                var10.field2222 = field368;
                            } else {
                                var10.field2222 = field589;
                            }
                        } else if (var12 == 325) {
                            if (field368 == -1) {
                                field368 = var10.field2222;
                                field589 = var10.field2298;
                            }
                            if (field577.field2162) {
                                var10.field2222 = field589;
                            } else {
                                var10.field2222 = field368;
                            }
                        } else if (var12 == 327) {
                            var10.field2232 = 150;
                            var10.field2239 = (int) (Math.sin((double) field320 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2285 = 5;
                            var10.field2188 = 0;
                        } else if (var12 == 328) {
                            var10.field2232 = 150;
                            var10.field2239 = (int) (Math.sin((double) field320 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2285 = 5;
                            var10.field2188 = 1;
                        }
                    }
                    int var13 = var10.field2253 + arg6;
                    int var14 = var10.field2201 + arg7;
                    int var15 = var10.field2218;
                    if (field487 == var10) {
                        if (arg1 != -1412584499 && !var10.field2265) {
                            Statics.field1214 = arg0;
                            Statics.field750 = arg6;
                            Statics.field3130 = arg7;
                            continue;
                        }
                        if (field399 && field492) {
                            int var16 = class116.field1808;
                            int var17 = class116.field1802 * 1476935015;
                            int var18 = var16 - field527;
                            int var19 = var17 - field471;
                            if (var18 < field345) {
                                var18 = field345;
                            }
                            if (var10.field2202 + var18 > field345 + field488.field2202) {
                                var18 = field345 + field488.field2202 - var10.field2202;
                            }
                            if (var19 < field591) {
                                var19 = field591;
                            }
                            if (var10.field2302 + var19 > field591 + field488.field2302) {
                                var19 = field591 + field488.field2302 - var10.field2302;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2265) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2189 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2189 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2202 + var13;
                        int var27 = var10.field2302 + var14;
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
                        int var30 = var10.field2202 + var13;
                        int var31 = var10.field2302 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2277 || var20 < var22 && var21 < var23) {
                        if (var10.field2191 != 0) {
                            if (var10.field2191 == 1336) {
                                if (field393) {
                                    var14 += 15;
                                    Statics.field186.method3670("Fps:" + field1787, var10.field2202 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field440) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field440) {
                                        var34 = 16711680;
                                    }
                                    Statics.field186.method3670("Mem:" + var33 + "k", var10.field2202 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2191 == 1337) {
                                field463 = var13;
                                field468 = var14;
                                int var37 = var10.field2202;
                                int var38 = var10.field2302;
                                field535++;
                                method2546(class16.field185);
                                boolean var39 = false;
                                if (field408 >= 0) {
                                    int var40 = class46.field935;
                                    int[] var41 = class46.field926;
                                    for (int var42 = 0; var42 < var40; var42++) {
                                        if (field408 == var41[var42]) {
                                            var39 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var39) {
                                    method2546(class16.field200);
                                }
                                Statics.method891(true);
                                method2546(var39 ? class16.field201 : class16.field187);
                                Statics.method891(false);
                                method839();
                                method943();
                                method811(var13, var14, var37, var38, true);
                                int var43 = field576;
                                int var44 = field457;
                                int var45 = field578;
                                int var46 = field579;
                                class220.method3795(var43, var44, var43 + var45, var44 + var46);
                                class85.method1622();
                                if (!field441) {
                                    int var47 = field397;
                                    if (field504 / 256 > var47) {
                                        var47 = field504 / 256;
                                    }
                                    if (field509[4] && field565[4] + 128 > var47) {
                                        var47 = field565[4] + 128;
                                    }
                                    int var48 = field398 + field381 & 0x7FF;
                                    int var49 = Statics.field3216;
                                    int var50 = method22(Statics.field266.field675, Statics.field266.field627, Statics.field744) - field403;
                                    int var51 = Statics.field843;
                                    int var52 = var47 * 3 + 600;
                                    int var53 = 2048 - var47 & 0x7FF;
                                    int var54 = 2048 - var48 & 0x7FF;
                                    int var55 = 0;
                                    int var56 = 0;
                                    int var57 = var52;
                                    if (var53 != 0) {
                                        int var58 = class85.field1442[var53];
                                        int var59 = class85.field1463[var53];
                                        int var60 = var56 * var59 - var52 * var58 >> 16;
                                        var57 = var56 * var58 + var52 * var59 >> 16;
                                        var56 = var60;
                                    }
                                    if (var54 != 0) {
                                        int var61 = class85.field1442[var54];
                                        int var62 = class85.field1463[var54];
                                        int var63 = var55 * var62 + var57 * var61 >> 16;
                                        var57 = var57 * var62 - var55 * var61 >> 16;
                                        var55 = var63;
                                    }
                                    Statics.field1111 = var49 - var55;
                                    Statics.field82 = var50 - var56;
                                    Statics.field784 = var51 - var57;
                                    Statics.field610 = var47;
                                    Statics.field1750 = var48;
                                }
                                int var64;
                                if (field441) {
                                    int var65;
                                    if (Statics.field85.field718) {
                                        var65 = Statics.field744;
                                    } else {
                                        int var66 = method22(Statics.field1111, Statics.field784, Statics.field744);
                                        if (var66 - Statics.field82 >= 800 || (class11.field123[Statics.field744][Statics.field1111 >> 7][Statics.field784 >> 7] & 0x4) == 0) {
                                            var65 = 3;
                                        } else {
                                            var65 = Statics.field744;
                                        }
                                    }
                                    var64 = var65;
                                } else {
                                    var64 = method79();
                                }
                                int var67 = Statics.field1111;
                                int var68 = Statics.field82;
                                int var69 = Statics.field784;
                                int var70 = Statics.field610;
                                int var71 = Statics.field1750;
                                for (int var72 = 0; var72 < 5; var72++) {
                                    if (field509[var72]) {
                                        int var73 = (int) (Math.random() * (double) (field564[var72] * 2 + 1) - (double) field564[var72] + Math.sin((double) field355[var72] / 100.0D * (double) field567[var72]) * (double) field565[var72]);
                                        if (var72 == 0) {
                                            Statics.field1111 += var73;
                                        }
                                        if (var72 == 1) {
                                            Statics.field82 += var73;
                                        }
                                        if (var72 == 2) {
                                            Statics.field784 += var73;
                                        }
                                        if (var72 == 3) {
                                            Statics.field1750 = Statics.field1750 + var73 & 0x7FF;
                                        }
                                        if (var72 == 4) {
                                            Statics.field610 += var73;
                                            if (Statics.field610 < 128) {
                                                Statics.field610 = 128;
                                            }
                                            if (Statics.field610 > 383) {
                                                Statics.field610 = 383;
                                            }
                                        }
                                    }
                                }
                                int var74 = class116.field1808;
                                int var75 = class116.field1802 * 1476935015;
                                if (class116.field1814 != 0) {
                                    var74 = class116.field1815;
                                    var75 = class116.field1816;
                                }
                                if (var74 >= var43 && var74 < var43 + var45 && var75 >= var44 && var75 < var44 + var46) {
                                    class83.field1420 = true;
                                    class83.field1423 = 0;
                                    class83.field1421 = var74 - var43;
                                    class83.field1422 = var75 - var44;
                                } else {
                                    class83.field1420 = false;
                                    class83.field1423 = 0;
                                }
                                method927();
                                class220.method3807(var43, var44, var45, var46, 0);
                                method927();
                                int var76 = class85.field1448;
                                class85.field1448 = field580;
                                Statics.field171.method1709(Statics.field1111, Statics.field82, Statics.field784, Statics.field610, Statics.field1750, var64);
                                class85.field1448 = var76;
                                method927();
                                Statics.field171.method1683();
                                method1990(var43, var44, var45, var46);
                                if (field459 == 2) {
                                    method224((field332 - Statics.field791 << 7) + field335, (field333 - Statics.field37 << 7) + field336, field334 * 2);
                                    if (field356 > -1 && field320 % 20 < 10) {
                                        Statics.field190[0].method3903(field356 + var43 - 12, field340 + var44 - 28);
                                    }
                                }
                                ((class75) Statics.field1459).method1415(field329);
                                if (field424 == 1) {
                                    Statics.field450[field549 / 100].method3903(field423 - 8, field422 - 8);
                                }
                                if (field424 == 2) {
                                    Statics.field450[field549 / 100 + 4].method3903(field423 - 8, field422 - 8);
                                }
                                method951();
                                Statics.field1111 = var67;
                                Statics.field82 = var68;
                                Statics.field784 = var69;
                                Statics.field610 = var70;
                                Statics.field1750 = var71;
                                if (field319 && class186.method3078(true, false) == 0) {
                                    field319 = false;
                                }
                                if (field319) {
                                    class220.method3807(var43, var44, var45, var46, 0);
                                    method239(class174.field2354, false);
                                }
                                field519[var10.field2182] = true;
                                class220.method3795(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2191 == 1338) {
                                method927();
                                class165 var77 = var10.method3011(false);
                                if (var77 != null) {
                                    class220.method3795(var13, var14, var77.field2147 + var13, var77.field2151 + var14);
                                    if (field550 == 2 || field550 == 5) {
                                        class220.method3842(var13, var14, 0, var77.field2142, var77.field2143);
                                    } else {
                                        int var78 = field398 + field384 & 0x7FF;
                                        int var79 = Statics.field266.field675 / 32 + 48;
                                        int var80 = 464 - Statics.field266.field627 / 32;
                                        Statics.field686.method3914(var13, var14, var77.field2147, var77.field2151, var79, var80, var78, field386 + 256, var77.field2142, var77.field2143);
                                        for (int var81 = 0; var81 < field586; var81++) {
                                            int var82 = field545[var81] * 4 + 2 - Statics.field266.field675 / 32;
                                            int var83 = field495[var81] * 4 + 2 - Statics.field266.field627 / 32;
                                            Statics.method1970(var13, var14, var82, var83, field547[var81], var77);
                                        }
                                        int var84 = 0;
                                        while (true) {
                                            if (var84 >= 104) {
                                                for (int var89 = 0; var89 < field352; var89++) {
                                                    class36 var90 = field351[field571[var89]];
                                                    if (var90 != null && var90.method251()) {
                                                        class200 var91 = var90.field795;
                                                        if (var91 != null && var91.field3033 != null) {
                                                            var91 = var91.method3506();
                                                        }
                                                        if (var91 != null && var91.field3024 && var91.field3036) {
                                                            int var92 = var90.field675 / 32 - Statics.field266.field675 / 32;
                                                            int var93 = var90.field627 / 32 - Statics.field266.field627 / 32;
                                                            Statics.method1970(var13, var14, var92, var93, Statics.field1224[1], var77);
                                                        }
                                                    }
                                                }
                                                int var94 = class46.field935;
                                                int[] var95 = class46.field926;
                                                for (int var96 = 0; var96 < var94; var96++) {
                                                    class24 var97 = field434[var95[var96]];
                                                    if (var97 != null && var97.method251() && !var97.field291 && Statics.field266 != var97) {
                                                        int var98 = var97.field675 / 32 - Statics.field266.field675 / 32;
                                                        int var99 = var97.field627 / 32 - Statics.field266.field627 / 32;
                                                        boolean var100 = false;
                                                        if (method229(var97.field283, true)) {
                                                            var100 = true;
                                                        }
                                                        boolean var101 = false;
                                                        for (int var102 = 0; var102 < Statics.field95; var102++) {
                                                            if (var97.field283.equals(Statics.field1916[var102].field304)) {
                                                                var101 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var103 = false;
                                                        if (Statics.field266.field290 != 0 && var97.field290 != 0 && Statics.field266.field290 == var97.field290) {
                                                            var103 = true;
                                                        }
                                                        if (var100) {
                                                            Statics.method1970(var13, var14, var98, var99, Statics.field1224[3], var77);
                                                        } else if (var103) {
                                                            Statics.method1970(var13, var14, var98, var99, Statics.field1224[4], var77);
                                                        } else if (var101) {
                                                            Statics.method1970(var13, var14, var98, var99, Statics.field1224[5], var77);
                                                        } else {
                                                            Statics.method1970(var13, var14, var98, var99, Statics.field1224[2], var77);
                                                        }
                                                    }
                                                }
                                                if (field459 != 0 && field320 % 20 < 10) {
                                                    if (field459 == 1 && field330 >= 0 && field330 < field351.length) {
                                                        class36 var104 = field351[field330];
                                                        if (var104 != null) {
                                                            int var105 = var104.field675 / 32 - Statics.field266.field675 / 32;
                                                            int var106 = var104.field627 / 32 - Statics.field266.field627 / 32;
                                                            Statics.method33(var13, var14, var105, var106, Statics.field130[1], var77);
                                                        }
                                                    }
                                                    if (field459 == 2) {
                                                        int var107 = field332 * 4 - Statics.field791 * 4 + 2 - Statics.field266.field675 / 32;
                                                        int var108 = field333 * 4 - Statics.field37 * 4 + 2 - Statics.field266.field627 / 32;
                                                        Statics.method33(var13, var14, var107, var108, Statics.field130[1], var77);
                                                    }
                                                    if (field459 == 10 && field363 >= 0 && field363 < field434.length) {
                                                        class24 var109 = field434[field363];
                                                        if (var109 != null) {
                                                            int var110 = var109.field675 / 32 - Statics.field266.field675 / 32;
                                                            int var111 = var109.field627 / 32 - Statics.field266.field627 / 32;
                                                            Statics.method33(var13, var14, var110, var111, Statics.field130[1], var77);
                                                        }
                                                    }
                                                }
                                                if (field548 != 0) {
                                                    int var112 = field548 * 4 + 2 - Statics.field266.field675 / 32;
                                                    int var113 = field425 * 4 + 2 - Statics.field266.field627 / 32;
                                                    Statics.method1970(var13, var14, var112, var113, Statics.field130[0], var77);
                                                }
                                                if (!Statics.field266.field291) {
                                                    class220.method3807(var77.field2147 / 2 + var13 - 1, var77.field2151 / 2 + var14 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var85 = 0; var85 < 104; var85++) {
                                                class129 var86 = field522[Statics.field744][var84][var85];
                                                if (var86 != null) {
                                                    int var87 = var84 * 4 + 2 - Statics.field266.field675 / 32;
                                                    int var88 = var85 * 4 + 2 - Statics.field266.field627 / 32;
                                                    Statics.method1970(var13, var14, var87, var88, Statics.field1224[0], var77);
                                                }
                                            }
                                            var84++;
                                        }
                                    }
                                    field489[var11] = true;
                                }
                                class220.method3795(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2191 == 1339) {
                                method2009(var10, var13, var14, var11);
                                class220.method3795(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2189 == 0) {
                            if (!var10.field2277 && method196(var10) && Statics.field17 != var10) {
                                continue;
                            }
                            if (!var10.field2277) {
                                if (var10.field2209 > var10.field2321 - var10.field2302) {
                                    var10.field2209 = var10.field2321 - var10.field2302;
                                }
                                if (var10.field2209 < 0) {
                                    var10.field2209 = 0;
                                }
                            }
                            method1861(arg0, var10.field2187, var20, var21, var22, var23, var13 - var10.field2242, var14 - var10.field2209, var11);
                            if (var10.field2311 != null) {
                                method1861(var10.field2311, var10.field2187, var20, var21, var22, var23, var13 - var10.field2242, var14 - var10.field2209, var11);
                            }
                            class18 var114 = (class18) field346.method2247((long) var10.field2187);
                            if (var114 != null) {
                                method3621(var114.field216, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class220.method3795(arg2, arg3, arg4, arg5);
                            class85.method1622();
                        }
                        if (field528 || field521[var11] || field526 > 1) {
                            if (var10.field2189 == 0 && !var10.field2277 && var10.field2321 > var10.field2302) {
                                method2154(var10.field2202 + var13, var14, var10.field2209, var10.field2302, var10.field2321);
                            }
                            if (var10.field2189 != 1) {
                                if (var10.field2189 == 2) {
                                    int var115 = 0;
                                    for (int var116 = 0; var116 < var10.field2199; var116++) {
                                        for (int var117 = 0; var117 < var10.field2198; var117++) {
                                            int var118 = (var10.field2190 + 32) * var117 + var13;
                                            int var119 = (var10.field2240 + 32) * var116 + var14;
                                            if (var115 < 20) {
                                                var118 += var10.field2303[var115];
                                                var119 += var10.field2256[var115];
                                            }
                                            if (var10.field2305[var115] > 0) {
                                                boolean var120 = false;
                                                boolean var121 = false;
                                                int var122 = var10.field2305[var115] - 1;
                                                if (var118 + 32 > arg2 && var118 < arg4 && var119 + 32 > arg3 && var119 < arg5 || Statics.field785 == var10 && field311 == var115) {
                                                    class225 var123;
                                                    if (field467 == 1 && Statics.field1745 == var115 && Statics.field968 == var10.field2187) {
                                                        var123 = class199.method2087(var122, var10.field2306[var115], 2, 0, 2, false);
                                                    } else {
                                                        var123 = class199.method2087(var122, var10.field2306[var115], 1, 3153952, 2, false);
                                                    }
                                                    if (var123 == null) {
                                                        method37(var10);
                                                    } else if (Statics.field785 == var10 && field311 == var115) {
                                                        int var124 = class116.field1808 - field428;
                                                        int var125 = class116.field1802 * 1476935015 - field429;
                                                        if (var124 < 5 && var124 > -5) {
                                                            var124 = 0;
                                                        }
                                                        if (var125 < 5 && var125 > -5) {
                                                            var125 = 0;
                                                        }
                                                        if (field432 < 5) {
                                                            var124 = 0;
                                                            var125 = 0;
                                                        }
                                                        var123.method3919(var118 + var124, var119 + var125, 128);
                                                        if (arg1 != -1) {
                                                            class170 var126 = arg0[arg1 & 0xFFFF];
                                                            if (var119 + var125 < class220.field3192 && var126.field2209 > 0) {
                                                                int var127 = field329 * (class220.field3192 - var119 - var125) / 3;
                                                                if (var127 > field329 * 10) {
                                                                    var127 = field329 * 10;
                                                                }
                                                                if (var127 > var126.field2209) {
                                                                    var127 = var126.field2209;
                                                                }
                                                                var126.field2209 -= var127;
                                                                field429 += var127;
                                                                method37(var126);
                                                            }
                                                            if (var119 + var125 + 32 > class220.field3188 && var126.field2209 < var126.field2321 - var126.field2302) {
                                                                int var128 = field329 * (var119 + var125 + 32 - class220.field3188) / 3;
                                                                if (var128 > field329 * 10) {
                                                                    var128 = field329 * 10;
                                                                }
                                                                if (var128 > var126.field2321 - var126.field2302 - var126.field2209) {
                                                                    var128 = var126.field2321 - var126.field2302 - var126.field2209;
                                                                }
                                                                var126.field2209 += var128;
                                                                field429 -= var128;
                                                                method37(var126);
                                                            }
                                                        }
                                                    } else if (Statics.field1364 == var10 && field407 == var115) {
                                                        var123.method3919(var118, var119, 128);
                                                    } else {
                                                        var123.method3903(var118, var119);
                                                    }
                                                }
                                            } else if (var10.field2178 != null && var115 < 20) {
                                                class225 var129 = var10.method3004(var115);
                                                if (var129 != null) {
                                                    var129.method3903(var118, var119);
                                                } else if (class170.field2185) {
                                                    method37(var10);
                                                }
                                            }
                                            var115++;
                                        }
                                    }
                                } else if (var10.field2189 == 3) {
                                    int var130;
                                    if (method215(var10)) {
                                        var130 = var10.field2213;
                                        if (Statics.field17 == var10 && var10.field2215 != 0) {
                                            var130 = var10.field2215;
                                        }
                                    } else {
                                        var130 = var10.field2320;
                                        if (Statics.field17 == var10 && var10.field2224 != 0) {
                                            var130 = var10.field2224;
                                        }
                                    }
                                    if (var10.field2216) {
                                        switch(var10.field2195.field3206) {
                                            case 1:
                                                class220.method3784(var13, var14, var10.field2202, var10.field2302, var10.field2320, var10.field2213, 256 - (var10.field2218 & 0xFF), 256 - (var10.field2219 & 0xFF));
                                                break;
                                            case 2:
                                                class220.method3785(var13, var14, var10.field2202, var10.field2302, var10.field2320, var10.field2213, 256 - (var10.field2218 & 0xFF), 256 - (var10.field2219 & 0xFF));
                                                break;
                                            case 3:
                                                class220.method3786(var13, var14, var10.field2202, var10.field2302, var10.field2320, var10.field2213, 256 - (var10.field2218 & 0xFF), 256 - (var10.field2219 & 0xFF));
                                                break;
                                            case 4:
                                                class220.method3787(var13, var14, var10.field2202, var10.field2302, var10.field2320, var10.field2213, 256 - (var10.field2218 & 0xFF), 256 - (var10.field2219 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class220.method3807(var13, var14, var10.field2202, var10.field2302, var130);
                                                } else {
                                                    class220.method3782(var13, var14, var10.field2202, var10.field2302, var130, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class220.method3789(var13, var14, var10.field2202, var10.field2302, var130);
                                    } else {
                                        class220.method3790(var13, var14, var10.field2202, var10.field2302, var130, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2189 == 4) {
                                    class209 var131 = var10.method3009();
                                    if (var131 != null) {
                                        String var132 = var10.field2247;
                                        int var133;
                                        if (method215(var10)) {
                                            var133 = var10.field2213;
                                            if (Statics.field17 == var10 && var10.field2215 != 0) {
                                                var133 = var10.field2215;
                                            }
                                            if (var10.field2212.length() > 0) {
                                                var132 = var10.field2212;
                                            }
                                        } else {
                                            var133 = var10.field2320;
                                            if (Statics.field17 == var10 && var10.field2224 != 0) {
                                                var133 = var10.field2224;
                                            }
                                        }
                                        if (var10.field2277 && var10.field2307 != -1) {
                                            class199 var134 = class199.method2849(var10.field2307);
                                            var132 = var134.field2958;
                                            if (var132 == null) {
                                                var132 = "null";
                                            }
                                            if ((var134.field2969 == 1 || var10.field2308 != 1) && var10.field2308 != -1) {
                                                String var135 = class38.method2134(16748608) + var132 + class38.field817 + " " + 'x';
                                                int var136 = var10.field2308;
                                                String var137 = Integer.toString(var136);
                                                for (int var138 = var137.length() - 3; var138 > 0; var138 -= 3) {
                                                    var137 = var137.substring(0, var138) + class38.field811 + var137.substring(var138);
                                                }
                                                String var139;
                                                StringBuilder var10000;
                                                class174 var10001;
                                                if (var137.length() > 9) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class38.method2134(65408)).append(var137.substring(0, var137.length() - 8));
                                                    var10001 = (class174) null;
                                                    var139 = var10000.append(class174.field2503).append(" ").append(class38.field810).append(var137).append(class38.field814).append(class38.field817).toString();
                                                } else if (var137.length() > 6) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class38.method2134(16777215)).append(var137.substring(0, var137.length() - 4));
                                                    var10001 = (class174) null;
                                                    var139 = var10000.append(class174.field2505).append(" ").append(class38.field810).append(var137).append(class38.field814).append(class38.field817).toString();
                                                } else {
                                                    var139 = " " + class38.method2134(16776960) + var137 + class38.field817;
                                                }
                                                var132 = var135 + var139;
                                            }
                                        }
                                        if (field478 == var10) {
                                            class174 var207 = (class174) null;
                                            var132 = class174.field2500;
                                            var133 = var10.field2320;
                                        }
                                        if (!var10.field2277) {
                                            var132 = method2603(var132, var10);
                                        }
                                        var131.method3697(var132, var13, var14, var10.field2202, var10.field2302, var133, var10.field2252 ? 0 : -1, var10.field2250, var10.field2251, var10.field2249);
                                    } else if (class170.field2185) {
                                        method37(var10);
                                    }
                                } else if (var10.field2189 == 5) {
                                    if (var10.field2277) {
                                        class225 var141;
                                        if (var10.field2307 == -1) {
                                            var141 = var10.method3002(false);
                                        } else {
                                            var141 = class199.method2087(var10.field2307, var10.field2308, var10.field2226, var10.field2227, var10.field2245, false);
                                        }
                                        if (var141 != null) {
                                            int var142 = var141.field3225;
                                            int var143 = var141.field3226;
                                            if (var10.field2225) {
                                                class220.method3778(var13, var14, var10.field2202 + var13, var10.field2302 + var14);
                                                int var144 = (var10.field2202 + (var142 - 1)) / var142;
                                                int var145 = (var10.field2302 + (var143 - 1)) / var143;
                                                for (int var146 = 0; var146 < var144; var146++) {
                                                    for (int var147 = 0; var147 < var145; var147++) {
                                                        if (var10.field2301 != 0) {
                                                            var141.method3916(var142 / 2 + var142 * var146 + var13, var143 / 2 + var143 * var147 + var14, var10.field2301, 4096);
                                                        } else if (var15 == 0) {
                                                            var141.method3903(var142 * var146 + var13, var143 * var147 + var14);
                                                        } else {
                                                            var141.method3919(var142 * var146 + var13, var143 * var147 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class220.method3795(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var148 = var10.field2202 * 4096 / var142;
                                                if (var10.field2301 != 0) {
                                                    var141.method3916(var10.field2202 / 2 + var13, var10.field2302 / 2 + var14, var10.field2301, var148);
                                                } else if (var15 != 0) {
                                                    var141.method3911(var13, var14, var10.field2202, var10.field2302, 256 - (var15 & 0xFF));
                                                } else if (var10.field2202 == var142 && var10.field2302 == var143) {
                                                    var141.method3903(var13, var14);
                                                } else {
                                                    var141.method3905(var13, var14, var10.field2202, var10.field2302);
                                                }
                                            }
                                        } else if (class170.field2185) {
                                            method37(var10);
                                        }
                                    } else {
                                        class225 var140 = var10.method3002(method215(var10));
                                        if (var140 != null) {
                                            var140.method3903(var13, var14);
                                        } else if (class170.field2185) {
                                            method37(var10);
                                        }
                                    }
                                } else if (var10.field2189 == 6) {
                                    boolean var149 = method215(var10);
                                    int var150;
                                    if (var149) {
                                        var150 = var10.field2235;
                                    } else {
                                        var150 = var10.field2234;
                                    }
                                    class83 var151 = null;
                                    int var152 = 0;
                                    if (var10.field2307 != -1) {
                                        class199 var153 = class199.method2849(var10.field2307);
                                        if (var153 != null) {
                                            class199 var154 = var153.method3451(var10.field2308);
                                            var151 = var154.method3460(1);
                                            if (var151 == null) {
                                                method37(var10);
                                            } else {
                                                var151.method1532();
                                                var152 = var151.field1556 / 2;
                                            }
                                        }
                                    } else if (var10.field2285 == 5) {
                                        if (var10.field2188 == 0) {
                                            var151 = field577.method2964((class202) null, -1, (class202) null, -1);
                                        } else {
                                            var151 = Statics.field266.method247();
                                        }
                                    } else if (var150 == -1) {
                                        var151 = var10.method3010((class202) null, -1, var149, Statics.field266.field270);
                                        if (var151 == null && class170.field2185) {
                                            method37(var10);
                                        }
                                    } else {
                                        class202 var155 = class202.method2997(var150);
                                        var151 = var10.method3010(var155, var10.field2309, var149, Statics.field266.field270);
                                        if (var151 == null && class170.field2185) {
                                            method37(var10);
                                        }
                                    }
                                    class85.method1612(var10.field2202 / 2 + var13, var10.field2302 / 2 + var14);
                                    int var156 = var10.field2241 * class85.field1442[var10.field2232] >> 16;
                                    int var157 = var10.field2241 * class85.field1463[var10.field2232] >> 16;
                                    if (var151 != null) {
                                        if (var10.field2277) {
                                            var151.method1532();
                                            if (var10.field2244) {
                                                var151.method1604(0, var10.field2239, var10.field2230, var10.field2232, var10.field2236, var10.field2237 + var152 + var156, var10.field2237 + var157, var10.field2241);
                                            } else {
                                                var151.method1544(0, var10.field2239, var10.field2230, var10.field2232, var10.field2236, var10.field2237 + var152 + var156, var10.field2237 + var157);
                                            }
                                        } else {
                                            var151.method1544(0, var10.field2239, 0, var10.field2232, 0, var156, var157);
                                        }
                                    }
                                    class85.method1611();
                                } else {
                                    if (var10.field2189 == 7) {
                                        class209 var158 = var10.method3009();
                                        if (var158 == null) {
                                            if (class170.field2185) {
                                                method37(var10);
                                            }
                                            continue;
                                        }
                                        int var159 = 0;
                                        for (int var160 = 0; var160 < var10.field2199; var160++) {
                                            for (int var161 = 0; var161 < var10.field2198; var161++) {
                                                if (var10.field2305[var159] > 0) {
                                                    class199 var162 = class199.method2849(var10.field2305[var159] - 1);
                                                    String var163;
                                                    if (var162.field2969 != 1 && var10.field2306[var159] == 1) {
                                                        var163 = class38.method2134(16748608) + var162.field2958 + class38.field817;
                                                    } else {
                                                        String var164 = class38.method2134(16748608) + var162.field2958 + class38.field817 + " " + 'x';
                                                        int var165 = var10.field2306[var159];
                                                        String var166 = Integer.toString(var165);
                                                        for (int var167 = var166.length() - 3; var167 > 0; var167 -= 3) {
                                                            var166 = var166.substring(0, var167) + class38.field811 + var166.substring(var167);
                                                        }
                                                        String var168;
                                                        if (var166.length() > 9) {
                                                            var168 = " " + class38.method2134(65408) + var166.substring(0, var166.length() - 8) + class174.field2503 + " " + class38.field810 + var166 + class38.field814 + class38.field817;
                                                        } else if (var166.length() > 6) {
                                                            var168 = " " + class38.method2134(16777215) + var166.substring(0, var166.length() - 4) + class174.field2505 + " " + class38.field810 + var166 + class38.field814 + class38.field817;
                                                        } else {
                                                            var168 = " " + class38.method2134(16776960) + var166 + class38.field817;
                                                        }
                                                        var163 = var164 + var168;
                                                    }
                                                    int var169 = (var10.field2190 + 115) * var161 + var13;
                                                    int var170 = (var10.field2240 + 12) * var160 + var14;
                                                    if (var10.field2250 == 0) {
                                                        var158.method3668(var163, var169, var170, var10.field2320, var10.field2252 ? 0 : -1);
                                                    } else if (var10.field2250 == 1) {
                                                        var158.method3743(var163, var10.field2202 / 2 + var169, var170, var10.field2320, var10.field2252 ? 0 : -1);
                                                    } else {
                                                        var158.method3670(var163, var10.field2202 + var169 - 1, var170, var10.field2320, var10.field2252 ? 0 : -1);
                                                    }
                                                }
                                                var159++;
                                            }
                                        }
                                    }
                                    if (var10.field2189 == 8 && Statics.field2810 == var10 && field466 == field349) {
                                        int var171 = 0;
                                        int var172 = 0;
                                        class209 var173 = Statics.field186;
                                        String var174 = var10.field2247;
                                        String var175 = method2603(var174, var10);
                                        while (var175.length() > 0) {
                                            int var176 = var175.indexOf(class38.field820);
                                            String var177;
                                            if (var176 == -1) {
                                                var177 = var175;
                                                var175 = "";
                                            } else {
                                                var177 = var175.substring(0, var176);
                                                var175 = var175.substring(var176 + 4);
                                            }
                                            int var178 = var173.method3663(var177);
                                            if (var178 > var171) {
                                                var171 = var178;
                                            }
                                            var172 += var173.field3121 + 1;
                                        }
                                        var171 += 6;
                                        var172 += 7;
                                        int var179 = var10.field2202 + var13 - 5 - var171;
                                        int var180 = var10.field2302 + var14 + 5;
                                        if (var179 < var13 + 5) {
                                            var179 = var13 + 5;
                                        }
                                        if (var171 + var179 > arg4) {
                                            var179 = arg4 - var171;
                                        }
                                        if (var172 + var180 > arg5) {
                                            var180 = arg5 - var172;
                                        }
                                        class220.method3807(var179, var180, var171, var172, 16777120);
                                        class220.method3789(var179, var180, var171, var172, 0);
                                        String var181 = var10.field2247;
                                        int var182 = var173.field3121 + var180 + 2;
                                        String var183 = method2603(var181, var10);
                                        while (var183.length() > 0) {
                                            int var184 = var183.indexOf(class38.field820);
                                            String var185;
                                            if (var184 == -1) {
                                                var185 = var183;
                                                var183 = "";
                                            } else {
                                                var185 = var183.substring(0, var184);
                                                var183 = var183.substring(var184 + 4);
                                            }
                                            var173.method3668(var185, var179 + 3, var182, 0, -1);
                                            var182 += var173.field3121 + 1;
                                        }
                                    }
                                    if (var10.field2189 == 9) {
                                        if (var10.field2203 == 1) {
                                            int var186;
                                            int var187;
                                            int var188;
                                            int var189;
                                            if (var10.field2221) {
                                                var186 = var13;
                                                var187 = var10.field2302 + var14;
                                                var188 = var10.field2202 + var13;
                                                var189 = var14;
                                            } else {
                                                var186 = var13;
                                                var187 = var14;
                                                var188 = var10.field2202 + var13;
                                                var189 = var10.field2302 + var14;
                                            }
                                            class220.method3804(var186, var187, var188, var189, var10.field2320);
                                        } else {
                                            int var190 = var10.field2202 >= 0 ? var10.field2202 : -var10.field2202;
                                            int var191 = var10.field2302 >= 0 ? var10.field2302 : -var10.field2302;
                                            int var192 = var190;
                                            if (var190 < var191) {
                                                var192 = var191;
                                            }
                                            if (var192 != 0) {
                                                int var193 = (var10.field2202 << 16) / var192;
                                                int var194 = (var10.field2302 << 16) / var192;
                                                if (var194 <= var193) {
                                                    var193 = -var193;
                                                } else {
                                                    var194 = -var194;
                                                }
                                                int var195 = var10.field2203 * var194 >> 17;
                                                int var196 = var10.field2203 * var194 + 1 >> 17;
                                                int var197 = var10.field2203 * var193 >> 17;
                                                int var198 = var10.field2203 * var193 + 1 >> 17;
                                                int var199 = var13 + var195;
                                                int var200 = var13 - var196;
                                                int var201 = var10.field2202 + var13 - var196;
                                                int var202 = var10.field2202 + var13 + var195;
                                                int var203 = var14 + var197;
                                                int var204 = var14 - var198;
                                                int var205 = var10.field2302 + var14 - var198;
                                                int var206 = var10.field2302 + var14 + var197;
                                                class85.method1617(var199, var200, var201);
                                                class85.method1655(var203, var204, var205, var199, var200, var201, var10.field2320);
                                                class85.method1617(var199, var201, var202);
                                                class85.method1655(var203, var205, var206, var199, var201, var202, var10.field2320);
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

    @ObfuscatedName("el.cx(Ljava/lang/String;Lfy;I)Ljava/lang/String;")
    public static String method2603(String arg0, class170 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method804(arg1, var2 - 1);
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
                if (Statics.field1734 != null) {
                    var8 = class208.method2909(Statics.field1734.field1672);
                    if (Statics.field1734.field1678 != null) {
                        var8 = (String) Statics.field1734.field1678;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("cm.cn(ZB)V")
    public static final void method1871(boolean arg0) {
        int var1 = field474;
        int var2 = Statics.field1749;
        int var3 = Statics.field2019;
        if (class170.method869(var1)) {
            method3084(Statics.field2223[var1], -1, var2, var3, arg0);
        }
    }

    @ObfuscatedName("ds.cy([Lfy;Lfy;ZB)V")
    public static void method1983(class170[] arg0, class170 arg1, boolean arg2) {
        int var3 = arg1.field2261 == 0 ? arg1.field2202 : arg1.field2261;
        int var4 = arg1.field2321 == 0 ? arg1.field2302 : arg1.field2321;
        method3084(arg0, arg1.field2187, var3, var4, arg2);
        if (arg1.field2311 != null) {
            method3084(arg1.field2311, arg1.field2187, var3, var4, arg2);
        }
        class18 var5 = (class18) field346.method2247((long) arg1.field2187);
        if (var5 != null) {
            int var6 = var5.field216;
            if (class170.method869(var6)) {
                method3084(Statics.field2223[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2191 == 1337) {
        }
    }

    @ObfuscatedName("fw.cz([Lfy;IIIZB)V")
    public static void method3084(class170[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class170 var6 = arg0[var5];
            if (var6 != null && var6.field2255 == arg1) {
                method2607(var6, arg2, arg3, arg4);
                method36(var6, arg2, arg3);
                if (var6.field2242 > var6.field2261 - var6.field2202) {
                    var6.field2242 = var6.field2261 - var6.field2202;
                }
                if (var6.field2242 < 0) {
                    var6.field2242 = 0;
                }
                if (var6.field2209 > var6.field2321 - var6.field2302) {
                    var6.field2209 = var6.field2321 - var6.field2302;
                }
                if (var6.field2209 < 0) {
                    var6.field2209 = 0;
                }
                if (var6.field2189 == 0) {
                    method1983(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ez.cm(Lfy;IIZI)V")
    public static void method2607(class170 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2202;
        int var5 = arg0.field2302;
        if (arg0.field2186 == 0) {
            arg0.field2202 = arg0.field2198;
        } else if (arg0.field2186 == 1) {
            arg0.field2202 = arg1 - arg0.field2198;
        } else if (arg0.field2186 == 2) {
            arg0.field2202 = arg0.field2198 * arg1 >> 14;
        }
        if (arg0.field2208 == 0) {
            arg0.field2302 = arg0.field2199;
        } else if (arg0.field2208 == 1) {
            arg0.field2302 = arg2 - arg0.field2199;
        } else if (arg0.field2208 == 2) {
            arg0.field2302 = arg0.field2199 * arg2 >> 14;
        }
        if (arg0.field2186 == 4) {
            arg0.field2202 = arg0.field2302 * arg0.field2204 / arg0.field2264;
        }
        if (arg0.field2208 == 4) {
            arg0.field2302 = arg0.field2264 * arg0.field2202 / arg0.field2204;
        }
        if (field563 && arg0.field2189 == 0) {
            if (arg0.field2302 < 5 && arg0.field2202 < 5) {
                arg0.field2302 = 5;
                arg0.field2202 = 5;
            } else {
                if (arg0.field2302 <= 0) {
                    arg0.field2302 = 5;
                }
                if (arg0.field2202 <= 0) {
                    arg0.field2202 = 5;
                }
            }
        }
        if (arg0.field2191 == 1337) {
            field552 = arg0;
        }
        if (arg3 && arg0.field2296 != null && (arg0.field2202 != var4 || arg0.field2302 != var5)) {
            class19 var6 = new class19();
            var6.field224 = arg0;
            var6.field233 = arg0.field2296;
            field513.method2300(var6);
        }
    }

    @ObfuscatedName("c.cq(Lfy;III)V")
    public static void method36(class170 arg0, int arg1, int arg2) {
        if (arg0.field2192 == 0) {
            arg0.field2253 = arg0.field2196;
        } else if (arg0.field2192 == 1) {
            arg0.field2253 = (arg1 - arg0.field2202) / 2 + arg0.field2196;
        } else if (arg0.field2192 == 2) {
            arg0.field2253 = arg1 - arg0.field2202 - arg0.field2196;
        } else if (arg0.field2192 == 3) {
            arg0.field2253 = arg0.field2196 * arg1 >> 14;
        } else if (arg0.field2192 == 4) {
            arg0.field2253 = (arg0.field2196 * arg1 >> 14) + (arg1 - arg0.field2202) / 2;
        } else {
            arg0.field2253 = arg1 - arg0.field2202 - (arg0.field2196 * arg1 >> 14);
        }
        if (arg0.field2193 == 0) {
            arg0.field2201 = arg0.field2197;
        } else if (arg0.field2193 == 1) {
            arg0.field2201 = (arg2 - arg0.field2302) / 2 + arg0.field2197;
        } else if (arg0.field2193 == 2) {
            arg0.field2201 = arg2 - arg0.field2302 - arg0.field2197;
        } else if (arg0.field2193 == 3) {
            arg0.field2201 = arg0.field2197 * arg2 >> 14;
        } else if (arg0.field2193 == 4) {
            arg0.field2201 = (arg0.field2197 * arg2 >> 14) + (arg2 - arg0.field2302) / 2;
        } else {
            arg0.field2201 = arg2 - arg0.field2302 - (arg0.field2197 * arg2 >> 14);
        }
        if (!field563 || arg0.field2189 != 0) {
            return;
        }
        if (arg0.field2253 < 0) {
            arg0.field2253 = 0;
        } else if (arg0.field2253 + arg0.field2202 > arg1) {
            arg0.field2253 = arg1 - arg0.field2202;
        }
        if (arg0.field2201 < 0) {
            arg0.field2201 = 0;
        } else if (arg0.field2302 + arg0.field2201 > arg2) {
            arg0.field2201 = arg2 - arg0.field2302;
        }
    }

    @ObfuscatedName("ae.cp(Lfy;IIIIIII)V")
    public static final void method781(class170 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field395) {
            field396 = 32;
        } else {
            field396 = 0;
        }
        field395 = false;
        if (class116.field1807 == 1 || !Statics.field3077 && class116.field1807 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2209 -= 4;
                method37(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2209 += 4;
                method37(arg0);
            } else if (arg5 >= arg1 - field396 && arg5 < field396 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2209 = (arg4 - arg3) * var8 / var9;
                method37(arg0);
                field395 = true;
            }
        }
        if (field512 == 0) {
            return;
        }
        int var10 = arg0.field2202;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2209 += field512 * 45;
            method37(arg0);
        }
    }

    @ObfuscatedName("dt.ch(IIIIII)V")
    public static final void method2154(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1310[0].method3855(arg0, arg1);
        Statics.field1310[1].method3855(arg0, arg1 + arg3 - 16);
        class220.method3807(arg0, arg1 + 16, 16, arg3 - 32, field391);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class220.method3807(arg0, arg1 + 16 + var6, 16, var5, field418);
        class220.method3793(arg0, arg1 + 16 + var6, var5, field394);
        class220.method3793(arg0 + 1, arg1 + 16 + var6, var5, field394);
        class220.method3791(arg0, arg1 + 16 + var6, 16, field394);
        class220.method3791(arg0, arg1 + 17 + var6, 16, field394);
        class220.method3793(arg0 + 15, arg1 + 16 + var6, var5, field419);
        class220.method3793(arg0 + 14, arg1 + 17 + var6, var5 - 1, field419);
        class220.method3791(arg0, arg1 + 15 + var6 + var5, 16, field419);
        class220.method3791(arg0 + 1, arg1 + 14 + var6 + var5, 15, field419);
    }

    @ObfuscatedName("f.cu(Lfy;I)Z")
    public static final boolean method215(class170 arg0) {
        if (arg0.field2271 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2271.length; var1++) {
            int var2 = method804(arg0, var1);
            int var3 = arg0.field2211[var1];
            if (arg0.field2271[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2271[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2271[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ay.co(Lfy;II)I")
    public static final int method804(class170 arg0, int arg1) {
        if (arg0.field2299 == null || arg1 >= arg0.field2299.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2299[arg1];
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
                    var7 = field427[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field449[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field525[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class170 var11 = class170.method669(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class199.method2849(var12).field2971 || field314)) {
                        for (int var13 = 0; var13 < var11.field2305.length; var13++) {
                            if (var12 + 1 == var11.field2305[var13]) {
                                var7 += var11.field2306[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class166.field2154[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class173.field2334[field449[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class166.field2154[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field266.field276;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class173.field2333[var14]) {
                            var7 += field449[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class170 var17 = class170.method669(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class199.method2849(var18).field2971 || field314)) {
                        for (int var19 = 0; var19 < var17.field2305.length; var19++) {
                            if (var18 + 1 == var17.field2305[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field479;
                }
                if (var6 == 12) {
                    var7 = field415;
                }
                if (var6 == 13) {
                    int var20 = class166.field2154[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class166.method1852(var22);
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
                    var7 = (Statics.field266.field675 >> 7) + Statics.field791;
                }
                if (var6 == 19) {
                    var7 = (Statics.field266.field627 >> 7) + Statics.field37;
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

    @ObfuscatedName("u.cr(Lfy;III)V")
    public static final void method92(class170 arg0, int arg1, int arg2) {
        if (arg0.field2238 == 1) {
            method243(arg0.field2210, "", 24, 0, 0, arg0.field2187);
        }
        if (arg0.field2238 == 2 && !field469) {
            int var3 = method3069(arg0);
            int var4 = var3 >> 11 & 0x3F;
            String var5;
            if (var4 == 0) {
                var5 = null;
            } else if (arg0.field2266 == null || arg0.field2266.trim().length() == 0) {
                var5 = null;
            } else {
                var5 = arg0.field2266;
            }
            if (var5 != null) {
                method243(var5, class38.method2134(65280) + arg0.field2283, 25, 0, -1, arg0.field2187);
            }
        }
        if (arg0.field2238 == 3) {
            method243(class174.field2534, "", 26, 0, 0, arg0.field2187);
        }
        if (arg0.field2238 == 4) {
            method243(arg0.field2210, "", 28, 0, 0, arg0.field2187);
        }
        if (arg0.field2238 == 5) {
            method243(arg0.field2210, "", 29, 0, 0, arg0.field2187);
        }
        if (arg0.field2238 == 6 && field478 == null) {
            method243(arg0.field2210, "", 30, 0, -1, arg0.field2187);
        }
        if (arg0.field2189 == 2) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field2302; var8++) {
                for (int var9 = 0; var9 < arg0.field2202; var9++) {
                    int var10 = (arg0.field2190 + 32) * var9;
                    int var11 = (arg0.field2240 + 32) * var8;
                    if (var7 < 20) {
                        var10 += arg0.field2303[var7];
                        var11 += arg0.field2256[var7];
                    }
                    if (arg1 >= var10 && arg2 >= var11 && arg1 < var10 + 32 && arg2 < var11 + 32) {
                        field409 = var7;
                        Statics.field39 = arg0;
                        if (arg0.field2305[var7] > 0) {
                            label323: {
                                class199 var12 = class199.method2849(arg0.field2305[var7] - 1);
                                if (field467 == 1) {
                                    int var13 = method3069(arg0);
                                    boolean var14 = (var13 >> 30 & 0x1) != 0;
                                    if (var14) {
                                        if (Statics.field968 != arg0.field2187 || Statics.field1745 != var7) {
                                            method243(class174.field2492, field497 + " " + class38.field815 + " " + class38.method2134(16748608) + var12.field2958, 31, var12.field2956, var7, arg0.field2187);
                                        }
                                        break label323;
                                    }
                                }
                                if (field469) {
                                    int var15 = method3069(arg0);
                                    boolean var16 = (var15 >> 30 & 0x1) != 0;
                                    if (var16) {
                                        if ((Statics.field74 & 0x10) == 16) {
                                            method243(field490, field473 + " " + class38.field815 + " " + class38.method2134(16748608) + var12.field2958, 32, var12.field2956, var7, arg0.field2187);
                                        }
                                        break label323;
                                    }
                                }
                                String[] var17 = var12.field2973;
                                if (field485) {
                                    var17 = method856(var17);
                                }
                                int var18 = var12.method3481();
                                int var19 = method3069(arg0);
                                boolean var20 = (var19 >> 30 & 0x1) != 0;
                                if (var20) {
                                    for (int var21 = 4; var21 >= 3; var21--) {
                                        boolean var22 = var18 == var21;
                                        if (var17 != null && var17[var21] != null) {
                                            byte var23;
                                            if (var21 == 3) {
                                                var23 = 36;
                                            } else {
                                                var23 = 37;
                                            }
                                            Statics.method81(var17[var21], class38.method2134(16748608) + var12.field2958, var23, var12.field2956, var7, arg0.field2187, var22);
                                        } else if (var21 == 4) {
                                            Statics.method81(class174.field2346, class38.method2134(16748608) + var12.field2958, 37, var12.field2956, var7, arg0.field2187, var22);
                                        }
                                    }
                                }
                                int var24 = method3069(arg0);
                                boolean var25 = (var24 >> 31 & 0x1) != 0;
                                if (var25) {
                                    method243(class174.field2492, class38.method2134(16748608) + var12.field2958, 38, var12.field2956, var7, arg0.field2187);
                                }
                                int var26 = method3069(arg0);
                                boolean var27 = (var26 >> 30 & 0x1) != 0;
                                if (var27 && var17 != null) {
                                    for (int var28 = 2; var28 >= 0; var28--) {
                                        boolean var29 = var18 == var28;
                                        if (var17[var28] != null) {
                                            byte var30 = 0;
                                            if (var28 == 0) {
                                                var30 = 33;
                                            }
                                            if (var28 == 1) {
                                                var30 = 34;
                                            }
                                            if (var28 == 2) {
                                                var30 = 35;
                                            }
                                            Statics.method81(var17[var28], class38.method2134(16748608) + var12.field2958, var30, var12.field2956, var7, arg0.field2187, var29);
                                        }
                                    }
                                }
                                String[] var31 = arg0.field2258;
                                if (field485) {
                                    var31 = method856(var31);
                                }
                                if (var31 != null) {
                                    for (int var32 = 4; var32 >= 0; var32--) {
                                        if (var31[var32] != null) {
                                            byte var33 = 0;
                                            if (var32 == 0) {
                                                var33 = 39;
                                            }
                                            if (var32 == 1) {
                                                var33 = 40;
                                            }
                                            if (var32 == 2) {
                                                var33 = 41;
                                            }
                                            if (var32 == 3) {
                                                var33 = 42;
                                            }
                                            if (var32 == 4) {
                                                var33 = 43;
                                            }
                                            method243(var31[var32], class38.method2134(16748608) + var12.field2958, var33, var12.field2956, var7, arg0.field2187);
                                        }
                                    }
                                }
                                method243(class174.field2405, class38.method2134(16748608) + var12.field2958, 1005, var12.field2956, var7, arg0.field2187);
                            }
                        }
                    }
                    var7++;
                }
            }
        }
        if (!arg0.field2277) {
            return;
        }
        if (!field469) {
            for (int var34 = 9; var34 >= 5; var34--) {
                String var35 = method1869(arg0, var34);
                if (var35 != null) {
                    method243(var35, arg0.field2248, 1007, var34 + 1, arg0.field2220, arg0.field2187);
                }
            }
            int var36 = method3069(arg0);
            int var37 = var36 >> 11 & 0x3F;
            String var38;
            if (var37 == 0) {
                var38 = null;
            } else if (arg0.field2266 == null || arg0.field2266.trim().length() == 0) {
                var38 = null;
            } else {
                var38 = arg0.field2266;
            }
            if (var38 != null) {
                method243(var38, arg0.field2248, 25, 0, arg0.field2220, arg0.field2187);
            }
            for (int var40 = 4; var40 >= 0; var40--) {
                String var41 = method1869(arg0, var40);
                if (var41 != null) {
                    method243(var41, arg0.field2248, 57, var40 + 1, arg0.field2220, arg0.field2187);
                }
            }
            if (class171.method790(method3069(arg0))) {
                method243(class174.field2375, "", 30, 0, arg0.field2220, arg0.field2187);
            }
        } else if (class171.method14(method3069(arg0)) && (Statics.field74 & 0x20) == 32) {
            method243(field490, field473 + " " + class38.field815 + " " + arg0.field2248, 58, 0, arg0.field2220, arg0.field2187);
        }
    }

    @ObfuscatedName("an.ct([Lfy;IIIIIIII)V")
    public static final void method605(class170[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class170 var9 = arg0[var8];
            if (var9 != null && (!var9.field2277 || var9.field2189 == 0 || var9.field2179 || method3069(var9) != 0 || field488 == var9 || var9.field2191 == 1338) && var9.field2255 == arg1 && (!var9.field2277 || !method196(var9))) {
                int var10 = var9.field2253 + arg6;
                int var11 = var9.field2201 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2189 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2189 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2202 + var10;
                    int var19 = var9.field2302 + var11;
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
                    int var22 = var9.field2202 + var10;
                    int var23 = var9.field2302 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field487 == var9) {
                    field451 = true;
                    field496 = var10;
                    field531 = var11;
                }
                if (!var9.field2277 || var12 < var14 && var13 < var15) {
                    int var24 = class116.field1808;
                    int var25 = class116.field1802 * 1476935015;
                    if (class116.field1814 != 0) {
                        var24 = class116.field1815;
                        var25 = class116.field1816;
                    }
                    if (var9.field2191 == 1337) {
                        if (!field319 && !field452 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method198(var24, var25, var12, var13);
                        }
                    } else if (var9.field2191 != 1338) {
                        if (!field452 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method92(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2189 == 0) {
                            if (!var9.field2277 && method196(var9) && Statics.field17 != var9) {
                                continue;
                            }
                            method605(arg0, var9.field2187, var12, var13, var14, var15, var10 - var9.field2242, var11 - var9.field2209);
                            if (var9.field2311 != null) {
                                method605(var9.field2311, var9.field2187, var12, var13, var14, var15, var10 - var9.field2242, var11 - var9.field2209);
                            }
                            class18 var40 = (class18) field346.method2247((long) var9.field2187);
                            if (var40 != null) {
                                if (var40.field213 == 0 && class116.field1808 >= var12 && class116.field1802 * 1476935015 >= var13 && class116.field1808 < var14 && class116.field1802 * 1476935015 < var15 && !field452 && !field563) {
                                    for (class19 var41 = (class19) field513.method2290(); var41 != null; var41 = (class19) field513.method2287()) {
                                        if (var41.field238) {
                                            var41.method2278();
                                            var41.field224.field2312 = false;
                                        }
                                    }
                                    if (Statics.field710 == 0) {
                                        field487 = null;
                                        field488 = null;
                                    }
                                    if (!field452) {
                                        field453 = 0;
                                        field392 = -1;
                                        field452 = false;
                                        field458[0] = class174.field2581;
                                        field421[0] = "";
                                        field456[0] = 1006;
                                        field453 = 1;
                                    }
                                }
                                int var42 = var40.field216;
                                if (class170.method869(var42)) {
                                    method605(Statics.field2223[var42], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2277) {
                            if (var9.field2288) {
                                if (class116.field1808 >= var12 && class116.field1802 * 1476935015 >= var13 && class116.field1808 < var14 && class116.field1802 * 1476935015 < var15) {
                                    for (class19 var43 = (class19) field513.method2290(); var43 != null; var43 = (class19) field513.method2287()) {
                                        if (var43.field238) {
                                            var43.method2278();
                                            var43.field224.field2312 = false;
                                        }
                                    }
                                    if (Statics.field710 == 0) {
                                        field487 = null;
                                        field488 = null;
                                    }
                                    if (!field452) {
                                        field458[0] = class174.field2581;
                                        field421[0] = "";
                                        field456[0] = 1006;
                                        field453 = 1;
                                    }
                                }
                            } else if (var9.field2231 && class116.field1808 >= var12 && class116.field1802 * 1476935015 >= var13 && class116.field1808 < var14 && class116.field1802 * 1476935015 < var15) {
                                for (class19 var44 = (class19) field513.method2290(); var44 != null; var44 = (class19) field513.method2287()) {
                                    if (var44.field238 && var44.field224.field2318 == var44.field233) {
                                        var44.method2278();
                                    }
                                }
                            }
                            boolean var45;
                            if (class116.field1808 >= var12 && class116.field1802 * 1476935015 >= var13 && class116.field1808 < var14 && class116.field1802 * 1476935015 < var15) {
                                var45 = true;
                            } else {
                                var45 = false;
                            }
                            boolean var46 = false;
                            if ((class116.field1807 == 1 || !Statics.field3077 && class116.field1807 == 4) && var45) {
                                var46 = true;
                            }
                            boolean var47 = false;
                            if ((class116.field1814 == 1 || !Statics.field3077 && class116.field1814 == 4) && class116.field1815 >= var12 && class116.field1816 >= var13 && class116.field1815 < var14 && class116.field1816 < var15) {
                                var47 = true;
                            }
                            if (var47) {
                                method96(var9, class116.field1815 - var10, class116.field1816 - var11);
                            }
                            if (field487 != null && field487 != var9 && var45 && class171.method170(method3069(var9))) {
                                field491 = var9;
                            }
                            if (field488 == var9) {
                                field492 = true;
                                field345 = var10;
                                field591 = var11;
                            }
                            if (var9.field2179) {
                                if (var45 && field512 != 0 && var9.field2318 != null) {
                                    class19 var48 = new class19();
                                    var48.field238 = true;
                                    var48.field224 = var9;
                                    var48.field226 = field512;
                                    var48.field233 = var9.field2318;
                                    field513.method2300(var48);
                                }
                                if (field487 != null || Statics.field785 != null || field452) {
                                    var47 = false;
                                    var46 = false;
                                    var45 = false;
                                }
                                if (!var9.field2313 && var47) {
                                    var9.field2313 = true;
                                    if (var9.field2269 != null) {
                                        class19 var49 = new class19();
                                        var49.field238 = true;
                                        var49.field224 = var9;
                                        var49.field223 = class116.field1815 - var10;
                                        var49.field226 = class116.field1816 - var11;
                                        var49.field233 = var9.field2269;
                                        field513.method2300(var49);
                                    }
                                }
                                if (var9.field2313 && var46 && var9.field2254 != null) {
                                    class19 var50 = new class19();
                                    var50.field238 = true;
                                    var50.field224 = var9;
                                    var50.field223 = class116.field1808 - var10;
                                    var50.field226 = class116.field1802 * 1476935015 - var11;
                                    var50.field233 = var9.field2254;
                                    field513.method2300(var50);
                                }
                                if (var9.field2313 && !var46) {
                                    var9.field2313 = false;
                                    if (var9.field2310 != null) {
                                        class19 var51 = new class19();
                                        var51.field238 = true;
                                        var51.field224 = var9;
                                        var51.field223 = class116.field1808 - var10;
                                        var51.field226 = class116.field1802 * 1476935015 - var11;
                                        var51.field233 = var9.field2310;
                                        field515.method2300(var51);
                                    }
                                }
                                if (var46 && var9.field2272 != null) {
                                    class19 var52 = new class19();
                                    var52.field238 = true;
                                    var52.field224 = var9;
                                    var52.field223 = class116.field1808 - var10;
                                    var52.field226 = class116.field1802 * 1476935015 - var11;
                                    var52.field233 = var9.field2272;
                                    field513.method2300(var52);
                                }
                                if (!var9.field2312 && var45) {
                                    var9.field2312 = true;
                                    if (var9.field2273 != null) {
                                        class19 var53 = new class19();
                                        var53.field238 = true;
                                        var53.field224 = var9;
                                        var53.field223 = class116.field1808 - var10;
                                        var53.field226 = class116.field1802 * 1476935015 - var11;
                                        var53.field233 = var9.field2273;
                                        field513.method2300(var53);
                                    }
                                }
                                if (var9.field2312 && var45 && var9.field2274 != null) {
                                    class19 var54 = new class19();
                                    var54.field238 = true;
                                    var54.field224 = var9;
                                    var54.field223 = class116.field1808 - var10;
                                    var54.field226 = class116.field1802 * 1476935015 - var11;
                                    var54.field233 = var9.field2274;
                                    field513.method2300(var54);
                                }
                                if (var9.field2312 && !var45) {
                                    var9.field2312 = false;
                                    if (var9.field2275 != null) {
                                        class19 var55 = new class19();
                                        var55.field238 = true;
                                        var55.field224 = var9;
                                        var55.field223 = class116.field1808 - var10;
                                        var55.field226 = class116.field1802 * 1476935015 - var11;
                                        var55.field233 = var9.field2275;
                                        field515.method2300(var55);
                                    }
                                }
                                if (var9.field2286 != null) {
                                    class19 var56 = new class19();
                                    var56.field224 = var9;
                                    var56.field233 = var9.field2286;
                                    field514.method2300(var56);
                                }
                                if (var9.field2280 != null && field501 > var9.field2315) {
                                    if (var9.field2281 == null || field501 - var9.field2315 > 32) {
                                        class19 var61 = new class19();
                                        var61.field224 = var9;
                                        var61.field233 = var9.field2280;
                                        field513.method2300(var61);
                                    } else {
                                        label526: for (int var57 = var9.field2315; var57 < field501; var57++) {
                                            int var58 = field500[var57 & 0x1F];
                                            for (int var59 = 0; var59 < var9.field2281.length; var59++) {
                                                if (var9.field2281[var59] == var58) {
                                                    class19 var60 = new class19();
                                                    var60.field224 = var9;
                                                    var60.field233 = var9.field2280;
                                                    field513.method2300(var60);
                                                    break label526;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2315 = field501;
                                }
                                if (var9.field2282 != null && field503 > var9.field2316) {
                                    if (var9.field2206 == null || field503 - var9.field2316 > 32) {
                                        class19 var66 = new class19();
                                        var66.field224 = var9;
                                        var66.field233 = var9.field2282;
                                        field513.method2300(var66);
                                    } else {
                                        label502: for (int var62 = var9.field2316; var62 < field503; var62++) {
                                            int var63 = field379[var62 & 0x1F];
                                            for (int var64 = 0; var64 < var9.field2206.length; var64++) {
                                                if (var9.field2206[var64] == var63) {
                                                    class19 var65 = new class19();
                                                    var65.field224 = var9;
                                                    var65.field233 = var9.field2282;
                                                    field513.method2300(var65);
                                                    break label502;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2316 = field503;
                                }
                                if (var9.field2284 != null && field505 > var9.field2317) {
                                    if (var9.field2246 == null || field505 - var9.field2317 > 32) {
                                        class19 var71 = new class19();
                                        var71.field224 = var9;
                                        var71.field233 = var9.field2284;
                                        field513.method2300(var71);
                                    } else {
                                        label478: for (int var67 = var9.field2317; var67 < field505; var67++) {
                                            int var68 = field517[var67 & 0x1F];
                                            for (int var69 = 0; var69 < var9.field2246.length; var69++) {
                                                if (var9.field2246[var69] == var68) {
                                                    class19 var70 = new class19();
                                                    var70.field224 = var9;
                                                    var70.field233 = var9.field2284;
                                                    field513.method2300(var70);
                                                    break label478;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2317 = field505;
                                }
                                if (field506 > var9.field2314 && var9.field2289 != null) {
                                    class19 var72 = new class19();
                                    var72.field224 = var9;
                                    var72.field233 = var9.field2289;
                                    field513.method2300(var72);
                                }
                                if (field507 > var9.field2314 && var9.field2291 != null) {
                                    class19 var73 = new class19();
                                    var73.field224 = var9;
                                    var73.field233 = var9.field2291;
                                    field513.method2300(var73);
                                }
                                if (field508 > var9.field2314 && var9.field2292 != null) {
                                    class19 var74 = new class19();
                                    var74.field224 = var9;
                                    var74.field233 = var9.field2292;
                                    field513.method2300(var74);
                                }
                                if (field546 > var9.field2314 && var9.field2297 != null) {
                                    class19 var75 = new class19();
                                    var75.field224 = var9;
                                    var75.field233 = var9.field2297;
                                    field513.method2300(var75);
                                }
                                if (field510 > var9.field2314 && var9.field2300 != null) {
                                    class19 var76 = new class19();
                                    var76.field224 = var9;
                                    var76.field233 = var9.field2300;
                                    field513.method2300(var76);
                                }
                                if (field511 > var9.field2314 && var9.field2293 != null) {
                                    class19 var77 = new class19();
                                    var77.field224 = var9;
                                    var77.field233 = var9.field2293;
                                    field513.method2300(var77);
                                }
                                var9.field2314 = field499;
                                if (var9.field2290 != null) {
                                    for (int var78 = 0; var78 < field475; var78++) {
                                        class19 var79 = new class19();
                                        var79.field224 = var9;
                                        var79.field231 = field539[var78];
                                        var79.field230 = field538[var78];
                                        var79.field233 = var9.field2290;
                                        field513.method2300(var79);
                                    }
                                }
                            }
                        }
                        if (!var9.field2277 && field487 == null && Statics.field785 == null && !field452) {
                            if ((var9.field2205 >= 0 || var9.field2224 != 0) && class116.field1808 >= var12 && class116.field1802 * 1476935015 >= var13 && class116.field1808 < var14 && class116.field1802 * 1476935015 < var15) {
                                if (var9.field2205 >= 0) {
                                    Statics.field17 = arg0[var9.field2205];
                                } else {
                                    Statics.field17 = var9;
                                }
                            }
                            if (var9.field2189 == 8 && class116.field1808 >= var12 && class116.field1802 * 1476935015 >= var13 && class116.field1808 < var14 && class116.field1802 * 1476935015 < var15) {
                                Statics.field2810 = var9;
                            }
                            if (var9.field2321 > var9.field2302) {
                                method781(var9, var9.field2202 + var10, var11, var9.field2302, var9.field2321, class116.field1808, class116.field1802 * 1476935015);
                            }
                        }
                    } else if ((field550 == 0 || field550 == 3) && (class116.field1814 == 1 || !Statics.field3077 && class116.field1814 == 4)) {
                        class165 var26 = var9.method3011(true);
                        if (var26 != null) {
                            int var27 = class116.field1815 - var10;
                            int var28 = class116.field1816 - var11;
                            if (var26.method2953(var27, var28)) {
                                int var29 = var27 - var26.field2147 / 2;
                                int var30 = var28 - var26.field2151 / 2;
                                int var31 = field398 + field384 & 0x7FF;
                                int var32 = class85.field1442[var31];
                                int var33 = class85.field1463[var31];
                                int var34 = (field386 + 256) * var32 >> 8;
                                int var35 = (field386 + 256) * var33 >> 8;
                                int var36 = var29 * var35 + var30 * var34 >> 11;
                                int var37 = var30 * var35 - var29 * var34 >> 11;
                                int var38 = Statics.field266.field675 + var36 >> 7;
                                int var39 = Statics.field266.field627 - var37 >> 7;
                                field310.method2874(95);
                                field310.method2651(18);
                                field310.method2663(class106.field1726[82] ? (class106.field1726[81] ? 2 : 1) : 0);
                                field310.method2717(Statics.field37 + var39);
                                field310.method2717(Statics.field791 + var38);
                                field310.method2651(var29);
                                field310.method2651(var30);
                                field310.method2625(field398);
                                field310.method2651(57);
                                field310.method2651(field384);
                                field310.method2651(field386);
                                field310.method2651(89);
                                field310.method2625(Statics.field266.field675);
                                field310.method2625(Statics.field266.field627);
                                field310.method2651(63);
                                field548 = var38;
                                field425 = var39;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aa.ci([Lfy;II)V")
    public static final void method627(class170[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class170 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2189 == 0) {
                    if (var3.field2311 != null) {
                        method627(var3.field2311, arg1);
                    }
                    class18 var4 = (class18) field346.method2247((long) var3.field2187);
                    if (var4 != null) {
                        int var5 = var4.field216;
                        if (class170.method869(var5)) {
                            method627(Statics.field2223[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2294 != null) {
                    class19 var6 = new class19();
                    var6.field224 = var3;
                    var6.field233 = var3.field2294;
                    class33.method1870(var6);
                }
                if (arg1 == 1 && var3.field2295 != null) {
                    if (var3.field2220 >= 0) {
                        class170 var7 = class170.method669(var3.field2187);
                        if (var7 == null || var7.field2311 == null || var3.field2220 >= var7.field2311.length || var7.field2311[var3.field2220] != var3) {
                            continue;
                        }
                    }
                    class19 var8 = new class19();
                    var8.field224 = var3;
                    var8.field233 = var3.field2295;
                    class33.method1870(var8);
                }
            }
        }
    }

    @ObfuscatedName("k.ca(Lfy;IIB)V")
    public static final void method96(class170 arg0, int arg1, int arg2) {
        if (field487 != null || field452 || arg0 == null) {
            return;
        }
        class170 var3 = arg0;
        int var4 = method3069(arg0);
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
                var3 = class170.method669(var3.field2255);
                if (var3 == null) {
                    var7 = null;
                    break;
                }
                var8++;
            }
        }
        class170 var9 = var7;
        if (var7 == null) {
            var9 = arg0.field2262;
        }
        if (var9 == null) {
            return;
        }
        field487 = arg0;
        class170 var11 = arg0;
        int var12 = method3069(arg0);
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
                var11 = class170.method669(var11.field2255);
                if (var11 == null) {
                    var15 = null;
                    break;
                }
                var16++;
            }
        }
        class170 var17 = var15;
        if (var15 == null) {
            var17 = arg0.field2262;
        }
        field488 = var17;
        field527 = arg1;
        field471 = arg2;
        Statics.field710 = 0;
        field399 = false;
        int var19 = method2572();
        if (var19 != -1) {
            Statics.field1116 = new class39();
            Statics.field1116.field823 = field532[var19];
            Statics.field1116.field832 = field455[var19];
            Statics.field1116.field824 = field456[var19];
            Statics.field1116.field831 = field542[var19];
            Statics.field1116.field826 = field458[var19];
        }
        return;
    }

    @ObfuscatedName("al.dl(I)V")
    public static final void method941() {
        method37(field487);
        Statics.field710++;
        if (field451 && field492) {
            int var0 = class116.field1808;
            int var1 = class116.field1802 * 1476935015;
            int var2 = var0 - field527;
            int var3 = var1 - field471;
            if (var2 < field345) {
                var2 = field345;
            }
            if (field487.field2202 + var2 > field345 + field488.field2202) {
                var2 = field345 + field488.field2202 - field487.field2202;
            }
            if (var3 < field591) {
                var3 = field591;
            }
            if (field487.field2302 + var3 > field591 + field488.field2302) {
                var3 = field591 + field488.field2302 - field487.field2302;
            }
            int var4 = var2 - field496;
            int var5 = var3 - field531;
            int var6 = field487.field2263;
            if (Statics.field710 > field487.field2217 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field399 = true;
            }
            int var7 = field488.field2242 + (var2 - field345);
            int var8 = field488.field2209 + (var3 - field591);
            if (field487.field2276 != null && field399) {
                class19 var9 = new class19();
                var9.field224 = field487;
                var9.field223 = var7;
                var9.field226 = var8;
                var9.field233 = field487.field2276;
                class33.method1870(var9);
            }
            if (class116.field1807 == 0) {
                if (field399) {
                    if (field487.field2304 != null) {
                        class19 var10 = new class19();
                        var10.field224 = field487;
                        var10.field223 = var7;
                        var10.field226 = var8;
                        var10.field228 = field491;
                        var10.field233 = field487.field2304;
                        class33.method1870(var10);
                    }
                    if (field491 != null) {
                        class170 var11 = field487;
                        int var12 = method3069(var11);
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
                                var11 = class170.method669(var11.field2255);
                                if (var11 == null) {
                                    var15 = null;
                                    break;
                                }
                                var16++;
                            }
                        }
                        if (var15 != null) {
                            field310.method2874(157);
                            field310.method2672(field491.field2307);
                            field310.method2672(field487.field2220);
                            field310.method2673(field491.field2220);
                            field310.method2717(field487.field2307);
                            field310.method2681(field491.field2187);
                            field310.method2627(field487.field2187);
                        }
                    }
                } else {
                    label133: {
                        label138: {
                            int var17 = method2572();
                            if (field453 > 2) {
                                if (field389 == 1) {
                                    boolean var18;
                                    if (field453 <= 0) {
                                        var18 = false;
                                    } else if (field562 && class106.field1726[81] && field392 != -1) {
                                        var18 = true;
                                    } else {
                                        var18 = false;
                                    }
                                    if (!var18) {
                                        break label138;
                                    }
                                }
                                if (method273(var17)) {
                                    break label138;
                                }
                            }
                            if (field453 > 0) {
                                method1854(field527 + field496, field531 + field471);
                            }
                            break label133;
                        }
                        method686(field527 + field496, field531 + field471);
                    }
                }
                field487 = null;
            }
        } else if (Statics.field710 > 1) {
            field487 = null;
        }
    }

    @ObfuscatedName("cx.db(III)V")
    public static void method1854(int arg0, int arg1) {
        class39 var2 = Statics.field1116;
        method1199(var2.field823, var2.field832, var2.field824, var2.field831, var2.field826, var2.field826, arg0, arg1);
        Statics.field1116 = null;
    }

    @ObfuscatedName("c.dw(Lfy;B)V")
    public static void method37(class170 arg0) {
        if (field518 == arg0.field2319) {
            field519[arg0.field2182] = true;
        }
    }

    @ObfuscatedName("l.ds(I)V")
    public static void method199() {
        for (class18 var0 = (class18) field346.method2233(); var0 != null; var0 = (class18) field346.method2234()) {
            int var1 = var0.field216;
            if (class170.method869(var1)) {
                boolean var2 = true;
                class170[] var3 = Statics.field2223[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2277;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field1885;
                    class170 var6 = class170.method669(var5);
                    if (var6 != null) {
                        method37(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.dg([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method856(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("gs.dy(IB)V")
    public static final void method3364(int arg0) {
        if (!class170.method869(arg0)) {
            return;
        }
        class170[] var1 = Statics.field2223[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class170 var3 = var1[var2];
            if (var3 != null) {
                var3.field2309 = 0;
                var3.field2214 = 0;
            }
        }
    }

    @ObfuscatedName("u.dj([Lfy;II)V")
    public static final void method93(class170[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class170 var3 = arg0[var2];
            if (var3 != null && var3.field2255 == arg1 && (!var3.field2277 || !method196(var3))) {
                if (var3.field2189 == 0) {
                    if (!var3.field2277 && method196(var3) && Statics.field17 != var3) {
                        continue;
                    }
                    method93(arg0, var3.field2187);
                    if (var3.field2311 != null) {
                        method93(var3.field2311, var3.field2187);
                    }
                    class18 var4 = (class18) field346.method2247((long) var3.field2187);
                    if (var4 != null) {
                        Statics.method798(var4.field216);
                    }
                }
                if (var3.field2189 == 6) {
                    if (var3.field2234 != -1 || var3.field2235 != -1) {
                        boolean var5 = method215(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2235;
                        } else {
                            var6 = var3.field2234;
                        }
                        if (var6 != -1) {
                            class202 var7 = class202.method2997(var6);
                            var3.field2214 += field329;
                            while (var3.field2214 > var7.field3061[var3.field2309]) {
                                var3.field2214 -= var7.field3061[var3.field2309];
                                var3.field2309++;
                                if (var3.field2309 >= var7.field3064.length) {
                                    var3.field2309 -= var7.field3063;
                                    if (var3.field2309 < 0 || var3.field2309 >= var7.field3064.length) {
                                        var3.field2309 = 0;
                                    }
                                }
                                method37(var3);
                            }
                        }
                    }
                    if (var3.field2243 != 0 && !var3.field2277) {
                        int var8 = var3.field2243 >> 16;
                        int var9 = var3.field2243 << 16 >> 16;
                        int var10 = field329 * var8;
                        int var11 = field329 * var9;
                        var3.field2232 = var3.field2232 + var10 & 0x7FF;
                        var3.field2239 = var3.field2239 + var11 & 0x7FF;
                        method37(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("n.di(II)V")
    public static final void method264(int arg0) {
        method199();
        for (class32 var1 = (class32) class32.field742.method2290(); var1 != null; var1 = (class32) class32.field742.method2287()) {
            if (var1.field746 != null) {
                var1.method689();
            }
        }
        int var2 = Statics.method1986(arg0).field2770;
        if (var2 == 0) {
            return;
        }
        int var3 = class166.field2154[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class85.method1632(0.9D);
                ((class75) Statics.field1459).method1412(0.9D);
            }
            if (var3 == 2) {
                class85.method1632(0.8D);
                ((class75) Statics.field1459).method1412(0.8D);
            }
            if (var3 == 3) {
                class85.method1632(0.7D);
                ((class75) Statics.field1459).method1412(0.7D);
            }
            if (var3 == 4) {
                class85.method1632(0.6D);
                ((class75) Statics.field1459).method1412(0.6D);
            }
            class199.field2949.method2225();
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
            if (field551 != var4) {
                if (field551 == 0 && field446 != -1) {
                    Statics.method808(Statics.field40, field446, 0, var4, false);
                    field553 = false;
                } else if (var4 == 0) {
                    Statics.field1920.method2378();
                    class139.field1921 = 1;
                    Statics.field1917 = null;
                    field553 = false;
                } else {
                    class139.method64(var4);
                }
                field551 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field554 = 127;
            }
            if (var3 == 1) {
                field554 = 96;
            }
            if (var3 == 2) {
                field554 = 64;
            }
            if (var3 == 3) {
                field554 = 32;
            }
            if (var3 == 4) {
                field554 = 0;
            }
        }
        if (var2 == 5) {
            field389 = var3;
        }
        if (var2 == 6) {
            field476 = var3;
        }
        if (var2 == 9) {
            field477 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field555 = 127;
            }
            if (var3 == 1) {
                field555 = 96;
            }
            if (var3 == 2) {
                field555 = 64;
            }
            if (var3 == 3) {
                field555 = 32;
            }
            if (var3 == 4) {
                field555 = 0;
            }
        }
        if (var2 == 17) {
            field482 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class41[] var5 = new class41[] { class41.field840, class41.field838, class41.field836, class41.field837 };
            field337 = (class41) Statics.method78(var5, var3);
            if (field337 == null) {
                field337 = class41.field840;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field408 = -1;
            } else {
                field408 = var3 & 0x7FF;
            }
        }
        if (var2 != 22) {
            return;
        }
        class41[] var6 = new class41[] { class41.field840, class41.field838, class41.field836, class41.field837 };
        field338 = (class41) Statics.method78(var6, var3);
        if (field338 == null) {
            field338 = class41.field840;
        }
    }

    @ObfuscatedName("dg.dx(I)V")
    public static final void method1987() {
        field310.method2874(66);
        for (class18 var0 = (class18) field346.method2233(); var0 != null; var0 = (class18) field346.method2234()) {
            if (var0.field213 == 0 || var0.field213 == 3) {
                method66(var0, true);
            }
        }
        if (field478 != null) {
            method37(field478);
            field478 = null;
        }
    }

    @ObfuscatedName("f.dq(IIIB)Li;")
    public static final class18 method212(int arg0, int arg1, int arg2) {
        class18 var3 = new class18();
        var3.field216 = arg1;
        var3.field213 = arg2;
        field346.method2245(var3, (long) arg0);
        method3364(arg1);
        class170 var4 = class170.method669(arg0);
        method37(var4);
        if (field478 != null) {
            method37(field478);
            field478 = null;
        }
        method172();
        method1983(Statics.field2223[arg0 >> 16], var4, false);
        Statics.method866(arg1);
        if (field474 != -1) {
            int var5 = field474;
            if (class170.method869(var5)) {
                method627(Statics.field2223[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("w.dk(Li;ZI)V")
    public static final void method66(class18 arg0, boolean arg1) {
        int var2 = arg0.field216;
        int var3 = (int) arg0.field1885;
        arg0.method2278();
        if (arg1 && var2 != -1 && Statics.field794[var2]) {
            Statics.field2270.method3110(var2);
            if (Statics.field2223[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2223[var2].length; var5++) {
                    if (Statics.field2223[var2][var5] != null) {
                        if (Statics.field2223[var2][var5].field2189 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2223[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2223[var2] = null;
                }
                Statics.field794[var2] = false;
            }
        }
        method2879(var2);
        class170 var6 = class170.method669(var3);
        if (var6 != null) {
            method37(var6);
        }
        method172();
        if (field474 != -1) {
            int var7 = field474;
            if (class170.method869(var7)) {
                method627(Statics.field2223[var7], 1);
            }
        }
    }

    @ObfuscatedName("ab.dd(Lfy;I)Z")
    public static final boolean method770(class170 arg0) {
        int var1 = arg0.field2191;
        if (var1 == 205) {
            field366 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field577.method2959(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field577.method2960(var4, var5 == 1);
        }
        if (var1 == 324) {
            field577.method2962(false);
        }
        if (var1 == 325) {
            field577.method2962(true);
        }
        if (var1 == 326) {
            field310.method2874(23);
            field577.method2972(field310);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("dc.dt(Lfy;IIII)V")
    public static final void method2009(class170 arg0, int arg1, int arg2, int arg3) {
        class165 var4 = arg0.method3011(false);
        if (var4 == null) {
            return;
        }
        if (field550 < 3) {
            Statics.field194.method3914(arg1, arg2, var4.field2147, var4.field2151, 25, 25, field398, 256, var4.field2142, var4.field2143);
        } else {
            class220.method3842(arg1, arg2, 0, var4.field2142, var4.field2143);
        }
    }

    @ObfuscatedName("z.du(Ljava/lang/String;ZI)Z")
    public static boolean method229(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class205.method1513(arg0, Statics.field2156);
        for (int var3 = 0; var3 < field581; var3++) {
            if (var2.equalsIgnoreCase(class205.method1513(field537[var3].field177, Statics.field2156)) && (!arg1 || field537[var3].field182 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class205.method1513(Statics.field266.field283, Statics.field2156))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("dx.de(Ljava/lang/String;I)Z")
    public static boolean method2088(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class205.method1513(arg0, Statics.field2156);
        for (int var2 = 0; var2 < field585; var2++) {
            class20 var3 = field480[var2];
            if (var1.equalsIgnoreCase(class205.method1513(var3.field244, Statics.field2156))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class205.method1513(var3.field240, Statics.field2156))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("gn.do(Ljava/lang/String;I)V")
    public static final void method3213(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class205.method1513(arg0, Statics.field2156);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field585; var2++) {
            class20 var3 = field480[var2];
            String var4 = var3.field244;
            String var5 = class205.method1513(var4, Statics.field2156);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field585--;
                for (int var7 = var2; var7 < field585; var7++) {
                    field480[var7] = field480[var7 + 1];
                }
                field507 = field499;
                field310.method2874(237);
                field310.method2651(class154.method2955(arg0));
                field310.method2630(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("f.dr(Ljava/lang/String;S)V")
    public static final void method213(String arg0) {
        if (Statics.field1916 != null) {
            field310.method2874(214);
            field310.method2651(class154.method2955(arg0));
            field310.method2630(arg0);
        }
    }

    @ObfuscatedName("aa.dm(Ljava/lang/String;I)V")
    public static final void method624(String arg0) {
        if (!arg0.equals("")) {
            field310.method2874(164);
            field310.method2651(class154.method2955(arg0));
            field310.method2630(arg0);
        }
    }

    @ObfuscatedName("fu.da(IS)V")
    public static void method2879(int arg0) {
        for (class134 var1 = (class134) field516.method2233(); var1 != null; var1 = (class134) field516.method2234()) {
            if ((long) arg0 == (var1.field1885 >> 48 & 0xFFFFL)) {
                var1.method2278();
            }
        }
    }

    @ObfuscatedName("ff.dh(Lfy;S)I")
    public static int method3069(class170 arg0) {
        class134 var1 = (class134) field516.method2247(((long) arg0.field2187 << 32) + (long) arg0.field2220);
        return var1 == null ? arg0.field2259 : var1.field1898;
    }

    @ObfuscatedName("l.dp(Lfy;B)Z")
    public static boolean method196(class170 arg0) {
        if (field563) {
            if (method3069(arg0) != 0) {
                return false;
            }
            if (arg0.field2189 == 0) {
                return false;
            }
        }
        return arg0.field2207;
    }

    @ObfuscatedName("cy.dv(Lfy;IB)Ljava/lang/String;")
    public static String method1869(class170 arg0, int arg1) {
        if (!class171.method1879(method3069(arg0), arg1) && arg0.field2287 == null) {
            return null;
        } else if (arg0.field2267 == null || arg0.field2267.length <= arg1 || arg0.field2267[arg1] == null || arg0.field2267[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2267[arg1];
        }
    }

    @ObfuscatedName("cw.df(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method1511(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field382 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field382 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field382 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field382 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field382 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field2667 != null) {
            var3 = "/p=" + Statics.field2667;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field410 + "/a=" + Statics.field317 + var3 + "/";
    }

    @ObfuscatedName("n.eb(Ljava/lang/String;I)V")
    public static void method275(String arg0) {
        Statics.field2667 = arg0;
        try {
            String var1 = Statics.field309.getParameter(class215.field3173.field3171);
            String var2 = Statics.field309.getParameter(class215.field3174.field3171);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class163.method2608(class156.method1888() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class101.method1891(Statics.field309, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }

    @ObfuscatedName("x.ea([BIB)V")
    public static void method3(byte[] arg0, int arg1) {
        if (field350 == null) {
            field350 = new byte[24];
        }
        class164.method2923(arg0, arg1, field350, 0, 24);
    }

    @ObfuscatedName("p.en(Lek;IB)V")
    public static void method238(class154 arg0, int arg1) {
        method3(arg0.field2091, arg1);
        if (class105.field1696 == null) {
            return;
        }
        try {
            class105.field1696.method1361(0L);
            class105.field1696.method1365(arg0.field2091, arg1, 24);
        } catch (Exception var3) {
        }
    }
}

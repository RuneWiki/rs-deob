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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Date;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class144 {

    @ObfuscatedName("client.f")
    public static boolean field509 = true;

    @ObfuscatedName("client.h")
    public static int field291 = 1;

    @ObfuscatedName("client.a")
    public static int field292 = 0;

    @ObfuscatedName("client.p")
    public static int field293 = 0;

    @ObfuscatedName("client.d")
    public static boolean field296 = false;

    @ObfuscatedName("client.n")
    public static boolean field353 = false;

    @ObfuscatedName("client.z")
    public static int field367 = 0;

    @ObfuscatedName("client.w")
    public static class108[] field537 = new class108[4];

    @ObfuscatedName("client.l")
    public static int field300 = 0;

    @ObfuscatedName("client.j")
    public static boolean field463 = true;

    @ObfuscatedName("client.m")
    public static int field302 = 0;

    @ObfuscatedName("client.e")
    public static long field303 = 1L;

    @ObfuscatedName("client.t")
    public static int field304 = -1;

    @ObfuscatedName("client.q")
    public static int field305 = -1;

    @ObfuscatedName("client.ak")
    public static int field306 = -1;

    @ObfuscatedName("client.ap")
    public static boolean field362 = true;

    @ObfuscatedName("client.al")
    public static boolean field308 = false;

    @ObfuscatedName("client.ab")
    public static int field309 = 0;

    @ObfuscatedName("client.at")
    public static int field310 = 0;

    @ObfuscatedName("client.au")
    public static int field311 = 0;

    @ObfuscatedName("client.ae")
    public static int field312 = 0;

    @ObfuscatedName("client.ax")
    public static int field477 = 0;

    @ObfuscatedName("client.aq")
    public static int field318 = 0;

    @ObfuscatedName("client.az")
    public static int field359 = 0;

    @ObfuscatedName("client.ac")
    public static int field316 = 0;

    @ObfuscatedName("client.ai")
    public static int field317 = 0;

    @ObfuscatedName("client.af")
    public static class21 field535 = class21.field583;

    @ObfuscatedName("client.ag")
    public static int field542 = 0;

    @ObfuscatedName("client.aa")
    public static int field406 = 0;

    @ObfuscatedName("client.aw")
    public static int field543 = 0;

    @ObfuscatedName("client.bg")
    public static int field322 = 0;

    @ObfuscatedName("client.bz")
    public static int field323 = 0;

    @ObfuscatedName("client.be")
    public static int field324 = 0;

    @ObfuscatedName("client.bm")
    public static int field325 = 0;

    @ObfuscatedName("client.bl")
    public static int field326 = 0;

    @ObfuscatedName("client.cm")
    public static class35[] field470 = new class35[32768];

    @ObfuscatedName("client.ci")
    public static int field329 = 0;

    @ObfuscatedName("client.cw")
    public static int[] field330 = new int[32768];

    @ObfuscatedName("client.ch")
    public static int field331 = 0;

    @ObfuscatedName("client.cs")
    public static int[] field332 = new int[250];

    @ObfuscatedName("client.co")
    public static class122 field295 = new class122(5000);

    @ObfuscatedName("client.cq")
    public static class122 field555 = new class122(5000);

    @ObfuscatedName("client.cy")
    public static class122 field335 = new class122(15000);

    @ObfuscatedName("client.cc")
    public static int field384 = 0;

    @ObfuscatedName("client.cz")
    public static int field400 = 0;

    @ObfuscatedName("client.cf")
    public static int field333 = 0;

    @ObfuscatedName("client.cp")
    public static int field339 = 0;

    @ObfuscatedName("client.cx")
    public static int field430 = 0;

    @ObfuscatedName("client.cl")
    public static int field334 = 0;

    @ObfuscatedName("client.ct")
    public static int field342 = 0;

    @ObfuscatedName("client.cn")
    public static int field301 = 0;

    @ObfuscatedName("client.ce")
    public static boolean field344 = false;

    @ObfuscatedName("client.dq")
    public static int field356 = 0;

    @ObfuscatedName("client.dy")
    public static int field346 = 1;

    @ObfuscatedName("client.dw")
    public static int field307 = 0;

    @ObfuscatedName("client.da")
    public static int field498 = 1;

    @ObfuscatedName("client.dl")
    public static int field349 = 0;

    @ObfuscatedName("client.ds")
    public static boolean field361 = false;

    @ObfuscatedName("client.di")
    public static int[][][] field366 = new int[4][13][13];

    @ObfuscatedName("client.dt")
    public static final int[] field343 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dh")
    public static int field354 = 0;

    @ObfuscatedName("client.dm")
    public static int field529 = 2;

    @ObfuscatedName("client.de")
    public static int field445 = 0;

    @ObfuscatedName("client.db")
    public static int field357 = 2;

    @ObfuscatedName("client.dr")
    public static int field358 = 0;

    @ObfuscatedName("client.dx")
    public static int field488 = 1;

    @ObfuscatedName("client.ed")
    public static int field350 = 0;

    @ObfuscatedName("client.en")
    public static int field409 = 0;

    @ObfuscatedName("client.eb")
    public static int field381 = 2;

    @ObfuscatedName("client.et")
    public static int field363 = 0;

    @ObfuscatedName("client.eq")
    public static int field364 = 1;

    @ObfuscatedName("client.eg")
    public static int field365 = 0;

    @ObfuscatedName("client.em")
    public static int field566 = 0;

    @ObfuscatedName("client.eo")
    public static int field369 = 2301979;

    @ObfuscatedName("client.ex")
    public static int field370 = 5063219;

    @ObfuscatedName("client.el")
    public static int field371 = 3353893;

    @ObfuscatedName("client.ey")
    public static int field372 = 7759444;

    @ObfuscatedName("client.ej")
    public static boolean field373 = false;

    @ObfuscatedName("client.ef")
    public static int field374 = 0;

    @ObfuscatedName("client.fc")
    public static int field375 = 128;

    @ObfuscatedName("client.fi")
    public static int field376 = 0;

    @ObfuscatedName("client.fw")
    public static int field377 = 0;

    @ObfuscatedName("client.fy")
    public static int field378 = 0;

    @ObfuscatedName("client.fp")
    public static int field379 = 0;

    @ObfuscatedName("client.fn")
    public static int field380 = 0;

    @ObfuscatedName("client.fg")
    public static int field396 = 50;

    @ObfuscatedName("client.fe")
    public static int field500 = 0;

    @ObfuscatedName("client.fq")
    public static boolean field383 = false;

    @ObfuscatedName("client.fb")
    public static int field368 = 0;

    @ObfuscatedName("client.fh")
    public static int field385 = 0;

    @ObfuscatedName("client.fs")
    public static int field386 = 50;

    @ObfuscatedName("client.fa")
    public static int[] field387 = new int[field386];

    @ObfuscatedName("client.fj")
    public static int[] field348 = new int[field386];

    @ObfuscatedName("client.fr")
    public static int[] field485 = new int[field386];

    @ObfuscatedName("client.fz")
    public static int[] field495 = new int[field386];

    @ObfuscatedName("client.ft")
    public static int[] field391 = new int[field386];

    @ObfuscatedName("client.fk")
    public static int[] field392 = new int[field386];

    @ObfuscatedName("client.fu")
    public static int[] field393 = new int[field386];

    @ObfuscatedName("client.gl")
    public static String[] field394 = new String[field386];

    @ObfuscatedName("client.gw")
    public static int[][] field395 = new int[104][104];

    @ObfuscatedName("client.gc")
    public static int field551 = 0;

    @ObfuscatedName("client.gh")
    public static int field553 = -1;

    @ObfuscatedName("client.gx")
    public static int field398 = -1;

    @ObfuscatedName("client.gt")
    public static int field399 = 0;

    @ObfuscatedName("client.gd")
    public static int field516 = 0;

    @ObfuscatedName("client.ge")
    public static int field389 = 0;

    @ObfuscatedName("client.ga")
    public static int field402 = 0;

    @ObfuscatedName("client.gf")
    public static int field403 = 0;

    @ObfuscatedName("client.gv")
    public static int field347 = 0;

    @ObfuscatedName("client.gj")
    public static int field405 = 0;

    @ObfuscatedName("client.gu")
    public static int field382 = 0;

    @ObfuscatedName("client.gy")
    public static int field407 = 0;

    @ObfuscatedName("client.gs")
    public static int field408 = 0;

    @ObfuscatedName("client.gi")
    public static boolean field328 = false;

    @ObfuscatedName("client.gq")
    public static int field410 = 0;

    @ObfuscatedName("client.gz")
    public static int field411 = 0;

    @ObfuscatedName("client.gb")
    public static class3[] field412 = new class3[2048];

    @ObfuscatedName("client.gn")
    public static int field336 = -1;

    @ObfuscatedName("client.gp")
    public static int field414 = 0;

    @ObfuscatedName("client.hy")
    public static int field415 = 0;

    @ObfuscatedName("client.hc")
    public static int[] field416 = new int[1000];

    @ObfuscatedName("client.hl")
    public static final int[] field404 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hk")
    public static String[] field431 = new String[8];

    @ObfuscatedName("client.hg")
    public static boolean[] field419 = new boolean[8];

    @ObfuscatedName("client.hd")
    public static int[] field288 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ht")
    public static int field422 = -1;

    @ObfuscatedName("client.ha")
    public static class199[][][] field437 = new class199[4][104][104];

    @ObfuscatedName("client.hh")
    public static class199 field423 = new class199();

    @ObfuscatedName("client.hb")
    public static class199 field424 = new class199();

    @ObfuscatedName("client.hs")
    public static class199 field425 = new class199();

    @ObfuscatedName("client.hi")
    public static int[] field298 = new int[25];

    @ObfuscatedName("client.hv")
    public static int[] field476 = new int[25];

    @ObfuscatedName("client.hw")
    public static int[] field420 = new int[25];

    @ObfuscatedName("client.hm")
    public static int field429 = 0;

    @ObfuscatedName("client.hn")
    public static boolean field525 = false;

    @ObfuscatedName("client.hq")
    public static int field449 = 0;

    @ObfuscatedName("client.hp")
    public static int[] field432 = new int[500];

    @ObfuscatedName("client.hx")
    public static int[] field433 = new int[500];

    @ObfuscatedName("client.ib")
    public static int[] field290 = new int[500];

    @ObfuscatedName("client.iu")
    public static int[] field435 = new int[500];

    @ObfuscatedName("client.ia")
    public static String[] field465 = new String[500];

    @ObfuscatedName("client.ij")
    public static String[] field313 = new String[500];

    @ObfuscatedName("client.ie")
    public static int field438 = -1;

    @ObfuscatedName("client.ig")
    public static int field439 = -1;

    @ObfuscatedName("client.iw")
    public static int field440 = 0;

    @ObfuscatedName("client.is")
    public static int field441 = 50;

    @ObfuscatedName("client.iy")
    public static int field442 = 0;

    @ObfuscatedName("client.iz")
    public static String field443 = null;

    @ObfuscatedName("client.im")
    public static boolean field444 = false;

    @ObfuscatedName("client.iq")
    public static int field454 = -1;

    @ObfuscatedName("client.it")
    public static int field436 = -1;

    @ObfuscatedName("client.id")
    public static String field447 = null;

    @ObfuscatedName("client.ii")
    public static String field341 = null;

    @ObfuscatedName("client.ih")
    public static int field517 = -1;

    @ObfuscatedName("client.ik")
    public static class196 field450 = new class196(8);

    @ObfuscatedName("client.io")
    public static int field397 = 0;

    @ObfuscatedName("client.jh")
    public static int field452 = 0;

    @ObfuscatedName("client.ji")
    public static class173 field421 = null;

    @ObfuscatedName("client.jb")
    public static int field351 = 0;

    @ObfuscatedName("client.jf")
    public static int field455 = 0;

    @ObfuscatedName("client.jv")
    public static int field456 = 0;

    @ObfuscatedName("client.jg")
    public static int field457 = -1;

    @ObfuscatedName("client.jd")
    public static boolean field458 = false;

    @ObfuscatedName("client.jl")
    public static boolean field459 = false;

    @ObfuscatedName("client.jc")
    public static boolean field460 = false;

    @ObfuscatedName("client.jt")
    public static class173 field461 = null;

    @ObfuscatedName("client.jm")
    public static class173 field462 = null;

    @ObfuscatedName("client.jk")
    public static class173 field360 = null;

    @ObfuscatedName("client.je")
    public static int field464 = 0;

    @ObfuscatedName("client.jp")
    public static int field474 = 0;

    @ObfuscatedName("client.ja")
    public static class173 field466 = null;

    @ObfuscatedName("client.jo")
    public static boolean field467 = false;

    @ObfuscatedName("client.jz")
    public static int field401 = -1;

    @ObfuscatedName("client.js")
    public static int field469 = -1;

    @ObfuscatedName("client.jx")
    public static boolean field390 = false;

    @ObfuscatedName("client.jj")
    public static int field315 = -1;

    @ObfuscatedName("client.jw")
    public static int field472 = -1;

    @ObfuscatedName("client.jr")
    public static boolean field473 = false;

    @ObfuscatedName("client.ke")
    public static int field524 = 1;

    @ObfuscatedName("client.ko")
    public static int[] field475 = new int[32];

    @ObfuscatedName("client.kb")
    public static int field453 = 0;

    @ObfuscatedName("client.kj")
    public static int[] field434 = new int[32];

    @ObfuscatedName("client.kh")
    public static int field446 = 0;

    @ObfuscatedName("client.kl")
    public static int[] field479 = new int[32];

    @ObfuscatedName("client.kf")
    public static int field480 = 0;

    @ObfuscatedName("client.ki")
    public static int field481 = 0;

    @ObfuscatedName("client.kk")
    public static int field338 = 0;

    @ObfuscatedName("client.ky")
    public static int field483 = 0;

    @ObfuscatedName("client.kt")
    public static int field427 = 0;

    @ObfuscatedName("client.kd")
    public static int field426 = 0;

    @ObfuscatedName("client.kp")
    public static int field486 = 0;

    @ObfuscatedName("client.ks")
    public static int field505 = 0;

    @ObfuscatedName("client.kc")
    public static class199 field567 = new class199();

    @ObfuscatedName("client.kz")
    public static class199 field489 = new class199();

    @ObfuscatedName("client.kn")
    public static class199 field490 = new class199();

    @ObfuscatedName("client.kq")
    public static class196 field491 = new class196(512);

    @ObfuscatedName("client.ku")
    public static int field492 = 0;

    @ObfuscatedName("client.ka")
    public static int field493 = -2;

    @ObfuscatedName("client.kx")
    public static boolean[] field494 = new boolean[100];

    @ObfuscatedName("client.lk")
    public static boolean[] field557 = new boolean[100];

    @ObfuscatedName("client.lb")
    public static boolean[] field496 = new boolean[100];

    @ObfuscatedName("client.lf")
    public static int[] field497 = new int[100];

    @ObfuscatedName("client.le")
    public static int[] field340 = new int[100];

    @ObfuscatedName("client.lx")
    public static int[] field499 = new int[100];

    @ObfuscatedName("client.lg")
    public static int[] field531 = new int[100];

    @ObfuscatedName("client.lm")
    public static int field501 = 0;

    @ObfuscatedName("client.lj")
    public static long field502 = 0L;

    @ObfuscatedName("client.lr")
    public static boolean field503 = true;

    @ObfuscatedName("client.lp")
    public static int field337 = 765;

    @ObfuscatedName("client.ld")
    public static int field320 = 503;

    @ObfuscatedName("client.li")
    public static int[] field506 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lh")
    public static int field507 = 0;

    @ObfuscatedName("client.la")
    public static int field508 = 0;

    @ObfuscatedName("client.ly")
    public static String field418 = "";

    @ObfuscatedName("client.ln")
    public static long[] field510 = new long[100];

    @ObfuscatedName("client.ls")
    public static int field511 = 0;

    @ObfuscatedName("client.lv")
    public static int field512 = 0;

    @ObfuscatedName("client.lc")
    public static int[] field417 = new int[128];

    @ObfuscatedName("client.mi")
    public static int[] field514 = new int[128];

    @ObfuscatedName("client.mu")
    public static long field515 = -1L;

    @ObfuscatedName("client.md")
    public static String field478 = null;

    @ObfuscatedName("client.mq")
    public static String field513 = null;

    @ObfuscatedName("client.mj")
    public static int field518 = -1;

    @ObfuscatedName("client.mo")
    public static int field558 = 0;

    @ObfuscatedName("client.mb")
    public static int[] field520 = new int[1000];

    @ObfuscatedName("client.ms")
    public static int[] field521 = new int[1000];

    @ObfuscatedName("client.mk")
    public static class79[] field522 = new class79[1000];

    @ObfuscatedName("client.mg")
    public static int field523 = 0;

    @ObfuscatedName("client.mf")
    public static int field471 = 0;

    @ObfuscatedName("client.mn")
    public static int field345 = 0;

    @ObfuscatedName("client.ma")
    public static int field526 = 255;

    @ObfuscatedName("client.mm")
    public static int field528 = -1;

    @ObfuscatedName("client.mr")
    public static boolean field319 = false;

    @ObfuscatedName("client.nn")
    public static int field571 = 127;

    @ObfuscatedName("client.nc")
    public static int field530 = 127;

    @ObfuscatedName("client.ne")
    public static int field527 = 0;

    @ObfuscatedName("client.nw")
    public static int[] field532 = new int[50];

    @ObfuscatedName("client.nl")
    public static int[] field533 = new int[50];

    @ObfuscatedName("client.nm")
    public static int[] field534 = new int[50];

    @ObfuscatedName("client.nd")
    public static int[] field321 = new int[50];

    @ObfuscatedName("client.nh")
    public static class59[] field536 = new class59[50];

    @ObfuscatedName("client.nt")
    public static boolean field561 = false;

    @ObfuscatedName("client.ni")
    public static boolean[] field538 = new boolean[5];

    @ObfuscatedName("client.oq")
    public static int[] field539 = new int[5];

    @ObfuscatedName("client.oc")
    public static int[] field540 = new int[5];

    @ObfuscatedName("client.oo")
    public static int[] field541 = new int[5];

    @ObfuscatedName("client.oi")
    public static int[] field355 = new int[5];

    @ObfuscatedName("client.on")
    public static short field413 = 256;

    @ObfuscatedName("client.ob")
    public static short field544 = 205;

    @ObfuscatedName("client.oz")
    public static short field545 = 256;

    @ObfuscatedName("client.oy")
    public static short field546 = 320;

    @ObfuscatedName("client.oa")
    public static short field547 = 1;

    @ObfuscatedName("client.op")
    public static short field548 = 32767;

    @ObfuscatedName("client.oe")
    public static short field549 = 1;

    @ObfuscatedName("client.oh")
    public static short field550 = 32767;

    @ObfuscatedName("client.ov")
    public static int field297 = 0;

    @ObfuscatedName("client.os")
    public static int field552 = 0;

    @ObfuscatedName("client.og")
    public static int field451 = 0;

    @ObfuscatedName("client.ok")
    public static int field554 = 0;

    @ObfuscatedName("client.ox")
    public static int field562 = 0;

    @ObfuscatedName("client.od")
    public static int field556 = 0;

    @ObfuscatedName("client.ou")
    public static int field519 = 0;

    @ObfuscatedName("client.or")
    public static class18[] field314 = new class18[400];

    @ObfuscatedName("client.ow")
    public static class195 field559 = new class195();

    @ObfuscatedName("client.ol")
    public static int field560 = 0;

    @ObfuscatedName("client.of")
    public static class8[] field428 = new class8[400];

    @ObfuscatedName("client.ot")
    public static class179 field448 = new class179();

    @ObfuscatedName("client.pi")
    public static int field563 = -1;

    @ObfuscatedName("client.pk")
    public static int field564 = -1;

    @ObfuscatedName("client.px")
    public static class220[] field565 = new class220[8];

    @ObfuscatedName("client.pu")
    public static long field468 = -1L;

    @ObfuscatedName("client.pv")
    public static long field482 = -1L;

    @ObfuscatedName("client.pb")
    public static final class11 field568 = new class11();

    @ObfuscatedName("client.pg")
    public static int[] field569 = new int[50];

    @ObfuscatedName("client.pz")
    public static int[] field570 = new int[50];

    @ObfuscatedName("client.h(S)V")
    public final void method225() {
    }

    public final void init() {
        if (!this.method2799()) {
            return;
        }
        class190[] var1 = new class190[] { class190.field3037, class190.field3048, class190.field3051, class190.field3045, class190.field3050, class190.field3040, class190.field3046, class190.field3049, class190.field3042, class190.field3039, class190.field3038, class190.field3043, class190.field3041, class190.field3047, class190.field3052 };
        class190[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class190 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3044);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3044)) {
                    case 1:
                        Statics.field1965 = var5;
                        break;
                    case 2:
                        Statics.field709 = var5;
                        break;
                    case 3:
                        field292 = Integer.parseInt(var5);
                        break;
                    case 4:
                        Statics.field61 = Integer.parseInt(var5);
                    case 5:
                    case 8:
                    case 14:
                    default:
                        break;
                    case 6:
                        if (var5.equalsIgnoreCase(class2.field26)) {
                        }
                        break;
                    case 7:
                        field367 = Integer.parseInt(var5);
                        break;
                    case 9:
                        if (var5.equalsIgnoreCase(class2.field26)) {
                            field296 = true;
                        } else {
                            field296 = false;
                        }
                        break;
                    case 10:
                        field291 = Integer.parseInt(var5);
                        break;
                    case 11:
                        Statics.field294 = (class154) class109.method927(class154.method3451(), Integer.parseInt(var5));
                        if (Statics.field294 == class154.field2280) {
                            Statics.field484 = class212.field3122;
                        } else {
                            Statics.field484 = class212.field3118;
                        }
                        break;
                    case 12:
                        int var6 = Integer.parseInt(var5);
                        class153[] var7 = class153.method726();
                        int var8 = 0;
                        class153 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class153 var9 = var7[var8];
                            if (var9.field2271 == var6) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field1943 = var10;
                        break;
                    case 13:
                        Statics.field299 = Integer.parseInt(var5);
                        break;
                    case 15:
                        field293 = Integer.parseInt(var5);
                }
            }
        }
        Statics.method203();
        Statics.field28 = this.getCodeBase().getHost();
        String var11 = Statics.field1943.field2270;
        byte var12 = 0;
        try {
            Statics.field2221 = 16;
            Statics.field2161 = var12;
            try {
                Statics.field819 = System.getProperty("os.name");
            } catch (Exception var58) {
                Statics.field819 = "Unknown";
            }
            Statics.field818 = Statics.field819.toLowerCase();
            try {
                Statics.field783 = System.getProperty("user.home");
                if (Statics.field783 != null) {
                    Statics.field783 = Statics.field783 + "/";
                }
            } catch (Exception var57) {
            }
            try {
                if (Statics.field818.startsWith("win")) {
                    if (Statics.field783 == null) {
                        Statics.field783 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field783 == null) {
                    Statics.field783 = System.getenv("HOME");
                }
                if (Statics.field783 != null) {
                    Statics.field783 = Statics.field783 + "/";
                }
            } catch (Exception var56) {
            }
            if (Statics.field783 == null) {
                Statics.field783 = "~/";
            }
            Statics.field2224 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field783, "/tmp/", "" };
            Statics.field1039 = new String[] { ".jagex_cache_" + Statics.field2161, ".file_store_" + Statics.field2161 };
            int var16 = 0;
            label280: while (var16 < 4) {
                String var17 = var16 == 0 ? "" : "" + var16;
                Statics.field2223 = new File(Statics.field783, "jagex_cl_oldschool_" + var11 + var17 + ".dat");
                String var18 = null;
                String var19 = null;
                boolean var20 = false;
                if (Statics.field2223.exists()) {
                    try {
                        class227 var21 = new class227(Statics.field2223, "rw", 10000L);
                        class119 var22 = new class119((int) var21.method3815());
                        while (var22.field1984 < var22.field1988.length) {
                            int var23 = var21.method3816(var22.field1988, var22.field1984, var22.field1988.length - var22.field1984);
                            if (var23 == -1) {
                                throw new IOException();
                            }
                            var22.field1984 += var23;
                        }
                        var22.field1984 = 0;
                        int var24 = var22.method2310();
                        if (var24 < 1 || var24 > 3) {
                            throw new IOException("" + var24);
                        }
                        int var25 = 0;
                        if (var24 > 1) {
                            var25 = var22.method2310();
                        }
                        if (var24 <= 2) {
                            var18 = var22.method2455();
                            if (var25 == 1) {
                                var19 = var22.method2455();
                            }
                        } else {
                            var18 = var22.method2320();
                            if (var25 == 1) {
                                var19 = var22.method2320();
                            }
                        }
                        var21.method3813();
                    } catch (IOException var61) {
                        var61.printStackTrace();
                    }
                    if (var18 != null) {
                        File var27 = new File(var18);
                        if (!var27.exists()) {
                            var18 = null;
                        }
                    }
                    if (var18 != null) {
                        File var28 = new File(var18, "test.dat");
                        if (!class149.method119(var28, true)) {
                            var18 = null;
                        }
                    }
                }
                if (var18 == null && var16 == 0) {
                    label256: for (int var29 = 0; var29 < Statics.field1039.length; var29++) {
                        for (int var30 = 0; var30 < Statics.field2224.length; var30++) {
                            File var31 = new File(Statics.field2224[var30] + Statics.field1039[var29] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var31.exists() && class149.method119(new File(var31, "test.dat"), true)) {
                                var18 = var31.toString();
                                var20 = true;
                                break label256;
                            }
                        }
                    }
                }
                if (var18 == null) {
                    var18 = Statics.field783 + File.separatorChar + "jagexcache" + var17 + File.separatorChar + "oldschool" + File.separatorChar + var11 + File.separatorChar;
                    var20 = true;
                }
                if (var19 != null) {
                    File var32 = new File(var19);
                    File var33 = new File(var18);
                    try {
                        File[] var34 = var32.listFiles();
                        File[] var35 = var34;
                        for (int var36 = 0; var36 < var35.length; var36++) {
                            File var37 = var35[var36];
                            File var38 = new File(var33, var37.getName());
                            boolean var39 = var37.renameTo(var38);
                            if (!var39) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var60) {
                        var60.printStackTrace();
                    }
                    var20 = true;
                }
                if (var20) {
                    class149.method125(new File(var18), (File) null);
                }
                File var41 = new File(var18);
                Statics.field3144 = var41;
                if (!Statics.field3144.exists()) {
                    Statics.field3144.mkdirs();
                }
                File[] var42 = Statics.field3144.listFiles();
                if (var42 == null) {
                    break;
                }
                File[] var43 = var42;
                int var44 = 0;
                while (true) {
                    if (var44 >= var43.length) {
                        break label280;
                    }
                    File var45 = var43[var44];
                    if (!class149.method119(var45, false)) {
                        var16++;
                        break;
                    }
                    var44++;
                }
            }
            File var46 = Statics.field3144;
            Statics.field2076 = var46;
            if (!Statics.field2076.exists()) {
                throw new RuntimeException("");
            }
            class135.field2081 = true;
            try {
                File var47 = new File(Statics.field783, "random.dat");
                if (var47.exists()) {
                    class149.field2228 = new class228(new class227(var47, "rw", 25L), 24, 0);
                } else {
                    label209: for (int var48 = 0; var48 < Statics.field1039.length; var48++) {
                        for (int var49 = 0; var49 < Statics.field2224.length; var49++) {
                            File var50 = new File(Statics.field2224[var49] + Statics.field1039[var48] + File.separatorChar + "random.dat");
                            if (var50.exists()) {
                                class149.field2228 = new class228(new class227(var50, "rw", 25L), 24, 0);
                                break label209;
                            }
                        }
                    }
                }
                if (class149.field2228 == null) {
                    RandomAccessFile var51 = new RandomAccessFile(var47, "rw");
                    int var52 = var51.read();
                    var51.seek(0L);
                    var51.write(var52);
                    var51.seek(0L);
                    var51.close();
                    class149.field2228 = new class228(new class227(var47, "rw", 25L), 24, 0);
                }
            } catch (IOException var59) {
            }
            class149.field2227 = new class228(new class227(class135.method2253("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class149.field2235 = new class228(new class227(class135.method2253("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2229 = new class228[Statics.field2221];
            for (int var54 = 0; var54 < Statics.field2221; var54++) {
                Statics.field2229[var54] = new class228(new class227(class135.method2253("main_file_cache.idx" + var54), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var62) {
            Statics.method929((String) null, var62);
        }
        Statics.field289 = this;
        this.method2797(765, 503, 96);
    }

    @ObfuscatedName("client.p(I)V")
    public final void method227() {
        Statics.field893 = field293 == 0 ? 43594 : field291 + 40000;
        Statics.field327 = field293 == 0 ? 443 : field291 + 50000;
        Statics.field1080 = Statics.field893;
        Statics.field2909 = class174.field2878;
        Statics.field2253 = class174.field2875;
        Statics.field2910 = class174.field2876;
        Statics.field2952 = class174.field2880;
        if (Statics.field2086.toLowerCase().indexOf("microsoft") == -1) {
            class137.field2116[44] = 71;
            class137.field2116[45] = 26;
            class137.field2116[46] = 72;
            class137.field2116[47] = 73;
            class137.field2116[59] = 57;
            class137.field2116[61] = 27;
            class137.field2116[91] = 42;
            class137.field2116[92] = 74;
            class137.field2116[93] = 43;
            class137.field2116[192] = 28;
            class137.field2116[222] = 58;
            class137.field2116[520] = 59;
        } else {
            class137.field2116[186] = 57;
            class137.field2116[187] = 27;
            class137.field2116[188] = 71;
            class137.field2116[189] = 26;
            class137.field2116[190] = 72;
            class137.field2116[191] = 73;
            class137.field2116[192] = 58;
            class137.field2116[219] = 42;
            class137.field2116[220] = 74;
            class137.field2116[221] = 43;
            class137.field2116[222] = 59;
            class137.field2116[223] = 28;
        }
        class137.method2605(Statics.field773);
        Canvas var1 = Statics.field773;
        var1.addMouseListener(class140.field2153);
        var1.addMouseMotionListener(class140.field2153);
        var1.addFocusListener(class140.field2153);
        Statics.field240 = class131.method584();
        if (Statics.field240 != null) {
            Statics.field240.method2631(Statics.field773);
        }
        Statics.field149 = new class134(255, class149.field2227, class149.field2235, 500000);
        class227 var2 = null;
        class9 var3 = new class9();
        try {
            var2 = class149.method2241("", Statics.field294.field2282, false);
            byte[] var4 = new byte[(int) var2.method3815()];
            int var6;
            for (int var5 = 0; var5 < var4.length; var5 += var6) {
                var6 = var2.method3816(var4, var5, var4.length - var5);
                if (var6 == -1) {
                    throw new IOException();
                }
            }
            var3 = new class9(new class119(var4));
        } catch (Exception var13) {
        }
        try {
            if (var2 != null) {
                var2.method3813();
            }
        } catch (Exception var12) {
        }
        Statics.field187 = var3;
        Statics.field139 = this.getToolkit().getSystemClipboard();
        String var11 = Statics.field2014;
        class138.field2124 = this;
        class138.field2120 = var11;
        if (field293 != 0) {
            field308 = true;
        }
        method121(Statics.field187.field146);
    }

    @ObfuscatedName("client.r(B)V")
    public final void method228() {
        field302++;
        this.method231();
        class170.method113();
        class183.method696();
        method833();
        class137 var1 = class137.field2098;
        synchronized (class137.field2098) {
            class137.field2115++;
            class137.field2113 = class137.field2114;
            class137.field2099 = 0;
            if (class137.field2112 >= 0) {
                while (class137.field2112 != class137.field2106) {
                    int var3 = class137.field2111[class137.field2106];
                    class137.field2106 = class137.field2106 + 1 & 0x7F;
                    if (var3 < 0) {
                        class137.field2097[~var3] = false;
                    } else {
                        if (!class137.field2097[var3] && class137.field2099 < class137.field2110.length - 1) {
                            class137.field2110[++class137.field2099 - 1] = var3;
                        }
                        class137.field2097[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class137.field2097[var2] = false;
                }
                class137.field2112 = class137.field2106;
            }
            class137.field2114 = class137.field2096;
        }
        class140 var5 = class140.field2153;
        synchronized (class140.field2153) {
            class140.field2137 = class140.field2146;
            class140.field2143 = class140.field2135;
            class140.field2139 = class140.field2144 * 1473904573;
            class140.field2138 = class140.field2140;
            class140.field2145 = class140.field2141;
            class140.field2136 = class140.field2142;
            class140.field2147 = class140.field2148;
            class140.field2140 = 0;
        }
        if (Statics.field240 != null) {
            int var7 = Statics.field240.method2625();
            field505 = var7;
        }
        if (field300 == 0) {
            method2608();
            class144.method4();
        } else if (field300 == 5) {
            class32.method2248(this);
            method2608();
            class144.method4();
        } else if (field300 == 10 || field300 == 11) {
            class32.method2248(this);
        } else if (field300 == 20) {
            class32.method2248(this);
            method103();
        } else if (field300 == 25) {
            method2(false);
            field356 = 0;
            boolean var8 = true;
            for (int var9 = 0; var9 < Statics.field9.length; var9++) {
                if (Statics.field128[var9] != -1 && Statics.field9[var9] == null) {
                    Statics.field9[var9] = Statics.field998.method3080(Statics.field128[var9], 0);
                    if (Statics.field9[var9] == null) {
                        var8 = false;
                        field356++;
                    }
                }
                if (Statics.field2711[var9] != -1 && Statics.field1990[var9] == null) {
                    Statics.field1990[var9] = Statics.field998.method3063(Statics.field2711[var9], 0, Statics.field675[var9]);
                    if (Statics.field1990[var9] == null) {
                        var8 = false;
                        field356++;
                    }
                }
            }
            if (var8) {
                field307 = 0;
                boolean var10 = true;
                for (int var11 = 0; var11 < Statics.field9.length; var11++) {
                    byte[] var12 = Statics.field1990[var11];
                    if (var12 != null) {
                        int var13 = (Statics.field148[var11] >> 8) * 64 - Statics.field2644;
                        int var14 = (Statics.field148[var11] & 0xFF) * 64 - Statics.field934;
                        if (field361) {
                            var13 = 10;
                            var14 = 10;
                        }
                        var10 &= class6.method9(var12, var13, var14);
                    }
                }
                if (var10) {
                    if (field349 != 0) {
                        method578(class157.field2317 + class2.field33 + class2.field23 + 100 + "%" + class2.field22, true);
                    }
                    method833();
                    method2907();
                    method833();
                    Statics.field841.method1728();
                    method833();
                    System.gc();
                    for (int var15 = 0; var15 < 4; var15++) {
                        field537[var15].method2187();
                    }
                    for (int var16 = 0; var16 < 4; var16++) {
                        for (int var17 = 0; var17 < 104; var17++) {
                            for (int var18 = 0; var18 < 104; var18++) {
                                class6.field98[var16][var17][var18] = 0;
                            }
                        }
                    }
                    method833();
                    class6.field79 = 99;
                    Statics.field80 = new byte[4][104][104];
                    Statics.field1446 = new byte[4][104][104];
                    Statics.field1214 = new byte[4][104][104];
                    Statics.field81 = new byte[4][104][104];
                    Statics.field256 = new int[4][105][105];
                    Statics.field82 = new byte[4][105][105];
                    Statics.field83 = new int[105][105];
                    Statics.field2169 = new int[104];
                    Statics.field1681 = new int[104];
                    Statics.field3125 = new int[104];
                    Statics.field170 = new int[104];
                    Statics.field153 = new int[104];
                    int var19 = Statics.field9.length;
                    class24.method2642();
                    method2(true);
                    if (!field361) {
                        int var20 = 0;
                        label1205: while (true) {
                            if (var20 >= var19) {
                                for (int var34 = 0; var34 < var19; var34++) {
                                    int var35 = (Statics.field148[var34] >> 8) * 64 - Statics.field2644;
                                    int var36 = (Statics.field148[var34] & 0xFF) * 64 - Statics.field934;
                                    byte[] var37 = Statics.field9[var34];
                                    if (var37 == null && Statics.field20 < 800) {
                                        method833();
                                        class6.method2614(var35, var36, 64, 64);
                                    }
                                }
                                method2(true);
                                int var38 = 0;
                                while (true) {
                                    if (var38 >= var19) {
                                        break label1205;
                                    }
                                    byte[] var39 = Statics.field1990[var38];
                                    if (var39 != null) {
                                        int var40 = (Statics.field148[var38] >> 8) * 64 - Statics.field2644;
                                        int var41 = (Statics.field148[var38] & 0xFF) * 64 - Statics.field934;
                                        method833();
                                        class86 var42 = Statics.field841;
                                        class108[] var43 = field537;
                                        class119 var44 = new class119(var39);
                                        int var45 = -1;
                                        while (true) {
                                            int var46 = var44.method2323();
                                            if (var46 == 0) {
                                                break;
                                            }
                                            var45 += var46;
                                            int var47 = 0;
                                            while (true) {
                                                int var48 = var44.method2323();
                                                if (var48 == 0) {
                                                    break;
                                                }
                                                var47 += var48 - 1;
                                                int var49 = var47 & 0x3F;
                                                int var50 = var47 >> 6 & 0x3F;
                                                int var51 = var47 >> 12;
                                                int var52 = var44.method2310();
                                                int var53 = var52 >> 2;
                                                int var54 = var52 & 0x3;
                                                int var55 = var40 + var50;
                                                int var56 = var41 + var49;
                                                if (var55 > 0 && var56 > 0 && var55 < 103 && var56 < 103) {
                                                    int var57 = var51;
                                                    if ((class6.field98[1][var55][var56] & 0x2) == 2) {
                                                        var57 = var51 - 1;
                                                    }
                                                    class108 var58 = null;
                                                    if (var57 >= 0) {
                                                        var58 = var43[var57];
                                                    }
                                                    class6.method99(var51, var55, var56, var45, var54, var53, var42, var58);
                                                }
                                            }
                                        }
                                    }
                                    var38++;
                                }
                            }
                            int var21 = (Statics.field148[var20] >> 8) * 64 - Statics.field2644;
                            int var22 = (Statics.field148[var20] & 0xFF) * 64 - Statics.field934;
                            byte[] var23 = Statics.field9[var20];
                            if (var23 != null) {
                                method833();
                                int var24 = Statics.field579 * 8 - 48;
                                int var25 = Statics.field20 * 8 - 48;
                                class108[] var26 = field537;
                                int var27 = 0;
                                label1202: while (true) {
                                    if (var27 >= 4) {
                                        class119 var30 = new class119(var23);
                                        int var31 = 0;
                                        while (true) {
                                            if (var31 >= 4) {
                                                break label1202;
                                            }
                                            for (int var32 = 0; var32 < 64; var32++) {
                                                for (int var33 = 0; var33 < 64; var33++) {
                                                    class6.method585(var30, var31, var21 + var32, var22 + var33, var24, var25, 0);
                                                }
                                            }
                                            var31++;
                                        }
                                    }
                                    for (int var28 = 0; var28 < 64; var28++) {
                                        for (int var29 = 0; var29 < 64; var29++) {
                                            if (var21 + var28 > 0 && var21 + var28 < 103 && var22 + var29 > 0 && var22 + var29 < 103) {
                                                var26[var27].field1888[var21 + var28][var22 + var29] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var27++;
                                }
                            }
                            var20++;
                        }
                    }
                    if (field361) {
                        int var59 = 0;
                        label1138: while (true) {
                            if (var59 >= 4) {
                                for (int var89 = 0; var89 < 13; var89++) {
                                    for (int var90 = 0; var90 < 13; var90++) {
                                        int var91 = field366[0][var89][var90];
                                        if (var91 == -1) {
                                            class6.method2614(var89 * 8, var90 * 8, 8, 8);
                                        }
                                    }
                                }
                                method2(true);
                                int var92 = 0;
                                while (true) {
                                    if (var92 >= 4) {
                                        break label1138;
                                    }
                                    method833();
                                    for (int var93 = 0; var93 < 13; var93++) {
                                        label1027: for (int var94 = 0; var94 < 13; var94++) {
                                            int var95 = field366[var92][var93][var94];
                                            if (var95 != -1) {
                                                int var96 = var95 >> 24 & 0x3;
                                                int var97 = var95 >> 1 & 0x3;
                                                int var98 = var95 >> 14 & 0x3FF;
                                                int var99 = var95 >> 3 & 0x7FF;
                                                int var100 = (var98 / 8 << 8) + var99 / 8;
                                                for (int var101 = 0; var101 < Statics.field148.length; var101++) {
                                                    if (Statics.field148[var101] == var100 && Statics.field1990[var101] != null) {
                                                        byte[] var102 = Statics.field1990[var101];
                                                        int var103 = var93 * 8;
                                                        int var104 = var94 * 8;
                                                        int var105 = (var98 & 0x7) * 8;
                                                        int var106 = (var99 & 0x7) * 8;
                                                        class86 var107 = Statics.field841;
                                                        class108[] var108 = field537;
                                                        class119 var109 = new class119(var102);
                                                        int var110 = -1;
                                                        while (true) {
                                                            int var111 = var109.method2323();
                                                            if (var111 == 0) {
                                                                continue label1027;
                                                            }
                                                            var110 += var111;
                                                            int var112 = 0;
                                                            while (true) {
                                                                int var113 = var109.method2323();
                                                                if (var113 == 0) {
                                                                    break;
                                                                }
                                                                var112 += var113 - 1;
                                                                int var114 = var112 & 0x3F;
                                                                int var115 = var112 >> 6 & 0x3F;
                                                                int var116 = var112 >> 12;
                                                                int var117 = var109.method2310();
                                                                int var118 = var117 >> 2;
                                                                int var119 = var117 & 0x3;
                                                                if (var96 == var116 && var115 >= var105 && var115 < var105 + 8 && var114 >= var106 && var114 < var106 + 8) {
                                                                    class41 var120 = class41.method1443(var110);
                                                                    int var122 = var115 & 0x7;
                                                                    int var123 = var114 & 0x7;
                                                                    int var125 = var120.field944;
                                                                    int var126 = var120.field952;
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
                                                                    int var131 = var104 + class177.method2769(var115 & 0x7, var114 & 0x7, var97, var120.field944, var120.field952, var119);
                                                                    if (var130 > 0 && var131 > 0 && var130 < 103 && var131 < 103) {
                                                                        int var132 = var92;
                                                                        if ((class6.field98[1][var130][var131] & 0x2) == 2) {
                                                                            var132 = var92 - 1;
                                                                        }
                                                                        class108 var133 = null;
                                                                        if (var132 >= 0) {
                                                                            var133 = var108[var132];
                                                                        }
                                                                        class6.method99(var92, var130, var131, var110, var97 + var119 & 0x3, var118, var107, var133);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var92++;
                                }
                            }
                            method833();
                            for (int var60 = 0; var60 < 13; var60++) {
                                for (int var61 = 0; var61 < 13; var61++) {
                                    boolean var62 = false;
                                    int var63 = field366[var59][var60][var61];
                                    if (var63 != -1) {
                                        int var64 = var63 >> 24 & 0x3;
                                        int var65 = var63 >> 1 & 0x3;
                                        int var66 = var63 >> 14 & 0x3FF;
                                        int var67 = var63 >> 3 & 0x7FF;
                                        int var68 = (var66 / 8 << 8) + var67 / 8;
                                        for (int var69 = 0; var69 < Statics.field148.length; var69++) {
                                            if (Statics.field148[var69] == var68 && Statics.field9[var69] != null) {
                                                byte[] var70 = Statics.field9[var69];
                                                int var71 = var60 * 8;
                                                int var72 = var61 * 8;
                                                int var73 = (var66 & 0x7) * 8;
                                                int var74 = (var67 & 0x7) * 8;
                                                class108[] var75 = field537;
                                                for (int var76 = 0; var76 < 8; var76++) {
                                                    for (int var77 = 0; var77 < 8; var77++) {
                                                        if (var71 + var76 > 0 && var71 + var76 < 103 && var72 + var77 > 0 && var72 + var77 < 103) {
                                                            var75[var59].field1888[var71 + var76][var72 + var77] &= 0xFEFFFFFF;
                                                        }
                                                    }
                                                }
                                                class119 var78 = new class119(var70);
                                                for (int var79 = 0; var79 < 4; var79++) {
                                                    for (int var80 = 0; var80 < 64; var80++) {
                                                        for (int var81 = 0; var81 < 64; var81++) {
                                                            if (var64 == var79 && var80 >= var73 && var80 < var73 + 8 && var81 >= var74 && var81 < var74 + 8) {
                                                                class6.method585(var78, var59, var71 + class177.method2254(var80 & 0x7, var81 & 0x7, var65), var72 + class177.method3652(var80 & 0x7, var81 & 0x7, var65), 0, 0, var65);
                                                            } else {
                                                                class6.method585(var78, 0, -1, -1, 0, 0, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                                var62 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var62) {
                                        int var82 = var59;
                                        int var83 = var60 * 8;
                                        int var84 = var61 * 8;
                                        for (int var85 = 0; var85 < 8; var85++) {
                                            for (int var86 = 0; var86 < 8; var86++) {
                                                class6.field97[var82][var83 + var85][var84 + var86] = 0;
                                            }
                                        }
                                        if (var83 > 0) {
                                            for (int var87 = 1; var87 < 8; var87++) {
                                                class6.field97[var82][var83][var84 + var87] = class6.field97[var82][var83 - 1][var84 + var87];
                                            }
                                        }
                                        if (var84 > 0) {
                                            for (int var88 = 1; var88 < 8; var88++) {
                                                class6.field97[var82][var83 + var88][var84] = class6.field97[var82][var83 + var88][var84 - 1];
                                            }
                                        }
                                        if (var83 > 0 && class6.field97[var82][var83 - 1][var84] != 0) {
                                            class6.field97[var82][var83][var84] = class6.field97[var82][var83 - 1][var84];
                                        } else if (var84 > 0 && class6.field97[var82][var83][var84 - 1] != 0) {
                                            class6.field97[var82][var83][var84] = class6.field97[var82][var83][var84 - 1];
                                        } else if (var83 > 0 && var84 > 0 && class6.field97[var82][var83 - 1][var84 - 1] != 0) {
                                            class6.field97[var82][var83][var84] = class6.field97[var82][var83 - 1][var84 - 1];
                                        }
                                    }
                                }
                            }
                            var59++;
                        }
                    }
                    method2(true);
                    method2907();
                    method833();
                    class86 var134 = Statics.field841;
                    class108[] var135 = field537;
                    for (int var136 = 0; var136 < 4; var136++) {
                        for (int var137 = 0; var137 < 104; var137++) {
                            for (int var138 = 0; var138 < 104; var138++) {
                                if ((class6.field98[var136][var137][var138] & 0x1) == 1) {
                                    int var139 = var136;
                                    if ((class6.field98[1][var137][var138] & 0x2) == 2) {
                                        var139 = var136 - 1;
                                    }
                                    if (var139 >= 0) {
                                        var135[var139].method2218(var137, var138);
                                    }
                                }
                            }
                        }
                    }
                    class6.field91 += (int) (Math.random() * 5.0D) - 2;
                    if (class6.field91 < -8) {
                        class6.field91 = -8;
                    }
                    if (class6.field91 > 8) {
                        class6.field91 = 8;
                    }
                    class6.field94 += (int) (Math.random() * 5.0D) - 2;
                    if (class6.field94 < -16) {
                        class6.field94 = -16;
                    }
                    if (class6.field94 > 16) {
                        class6.field94 = 16;
                    }
                    for (int var140 = 0; var140 < 4; var140++) {
                        byte[][] var141 = Statics.field82[var140];
                        int var142 = (int) Math.sqrt(5100.0D);
                        int var143 = var142 * 768 >> 8;
                        for (int var144 = 1; var144 < 103; var144++) {
                            for (int var145 = 1; var145 < 103; var145++) {
                                int var146 = class6.field97[var140][var145 + 1][var144] - class6.field97[var140][var145 - 1][var144];
                                int var147 = class6.field97[var140][var145][var144 + 1] - class6.field97[var140][var145][var144 - 1];
                                int var148 = (int) Math.sqrt((double) (var147 * var147 + var146 * var146 + 65536));
                                int var149 = (var146 << 8) / var148;
                                int var150 = 65536 / var148;
                                int var151 = (var147 << 8) / var148;
                                int var152 = (var151 * -50 + var149 * -50 + var150 * -10) / var143 + 96;
                                int var153 = (var141[var145][var144] >> 1) + (var141[var145][var144 + 1] >> 3) + (var141[var145][var144 - 1] >> 2) + (var141[var145 - 1][var144] >> 2) + (var141[var145 + 1][var144] >> 3);
                                Statics.field83[var145][var144] = var152 - var153;
                            }
                        }
                        for (int var154 = 0; var154 < 104; var154++) {
                            Statics.field2169[var154] = 0;
                            Statics.field1681[var154] = 0;
                            Statics.field3125[var154] = 0;
                            Statics.field170[var154] = 0;
                            Statics.field153[var154] = 0;
                        }
                        for (int var155 = -5; var155 < 109; var155++) {
                            for (int var156 = 0; var156 < 104; var156++) {
                                int var157 = var155 + 5;
                                int var10002;
                                if (var157 >= 0 && var157 < 104) {
                                    int var158 = Statics.field80[var140][var157][var156] & 0xFF;
                                    if (var158 > 0) {
                                        class42 var159 = class42.method3199(var158 - 1);
                                        Statics.field2169[var156] += var159.field989;
                                        Statics.field1681[var156] += var159.field990;
                                        Statics.field3125[var156] += var159.field991;
                                        Statics.field170[var156] += var159.field992;
                                        var10002 = Statics.field153[var156]++;
                                    }
                                }
                                int var160 = var155 - 5;
                                if (var160 >= 0 && var160 < 104) {
                                    int var161 = Statics.field80[var140][var160][var156] & 0xFF;
                                    if (var161 > 0) {
                                        class42 var162 = class42.method3199(var161 - 1);
                                        Statics.field2169[var156] -= var162.field989;
                                        Statics.field1681[var156] -= var162.field990;
                                        Statics.field3125[var156] -= var162.field991;
                                        Statics.field170[var156] -= var162.field992;
                                        var10002 = Statics.field153[var156]--;
                                    }
                                }
                            }
                            if (var155 >= 1 && var155 < 103) {
                                int var163 = 0;
                                int var164 = 0;
                                int var165 = 0;
                                int var166 = 0;
                                int var167 = 0;
                                for (int var168 = -5; var168 < 109; var168++) {
                                    int var169 = var168 + 5;
                                    if (var169 >= 0 && var169 < 104) {
                                        var163 += Statics.field2169[var169];
                                        var164 += Statics.field1681[var169];
                                        var165 += Statics.field3125[var169];
                                        var166 += Statics.field170[var169];
                                        var167 += Statics.field153[var169];
                                    }
                                    int var170 = var168 - 5;
                                    if (var170 >= 0 && var170 < 104) {
                                        var163 -= Statics.field2169[var170];
                                        var164 -= Statics.field1681[var170];
                                        var165 -= Statics.field3125[var170];
                                        var166 -= Statics.field170[var170];
                                        var167 -= Statics.field153[var170];
                                    }
                                    if (var168 >= 1 && var168 < 103 && (!field353 || (class6.field98[0][var155][var168] & 0x2) != 0 || (class6.field98[var140][var155][var168] & 0x10) == 0)) {
                                        if (var140 < class6.field79) {
                                            class6.field79 = var140;
                                        }
                                        int var171 = Statics.field80[var140][var155][var168] & 0xFF;
                                        int var172 = Statics.field1446[var140][var155][var168] & 0xFF;
                                        if (var171 > 0 || var172 > 0) {
                                            int var173 = class6.field97[var140][var155][var168];
                                            int var174 = class6.field97[var140][var155 + 1][var168];
                                            int var175 = class6.field97[var140][var155 + 1][var168 + 1];
                                            int var176 = class6.field97[var140][var155][var168 + 1];
                                            int var177 = Statics.field83[var155][var168];
                                            int var178 = Statics.field83[var155 + 1][var168];
                                            int var179 = Statics.field83[var155 + 1][var168 + 1];
                                            int var180 = Statics.field83[var155][var168 + 1];
                                            int var181 = -1;
                                            int var182 = -1;
                                            if (var171 > 0) {
                                                int var183 = var163 * 256 / var166;
                                                int var184 = var164 / var167;
                                                int var185 = var165 / var167;
                                                var181 = class6.method972(var183, var184, var185);
                                                int var186 = class6.field91 + var183 & 0xFF;
                                                int var187 = class6.field94 + var185;
                                                if (var187 < 0) {
                                                    var187 = 0;
                                                } else if (var187 > 255) {
                                                    var187 = 255;
                                                }
                                                var182 = class6.method972(var186, var184, var187);
                                            }
                                            if (var140 > 0) {
                                                boolean var188 = true;
                                                if (var171 == 0 && Statics.field1214[var140][var155][var168] != 0) {
                                                    var188 = false;
                                                }
                                                if (var172 > 0 && !class47.method695(var172 - 1).field1066) {
                                                    var188 = false;
                                                }
                                                if (var188 && var173 == var174 && var173 == var175 && var173 == var176) {
                                                    Statics.field256[var140][var155][var168] |= 0x924;
                                                }
                                            }
                                            int var189 = 0;
                                            if (var182 != -1) {
                                                var189 = class91.field1577[class6.method2097(var182, 96)];
                                            }
                                            if (var172 == 0) {
                                                var134.method1733(var140, var155, var168, 0, 0, -1, var173, var174, var175, var176, class6.method2097(var181, var177), class6.method2097(var181, var178), class6.method2097(var181, var179), class6.method2097(var181, var180), 0, 0, 0, 0, var189, 0);
                                            } else {
                                                int var190 = Statics.field1214[var140][var155][var168] + 1;
                                                byte var191 = Statics.field81[var140][var155][var168];
                                                class47 var192 = class47.method695(var172 - 1);
                                                int var193 = var192.field1068;
                                                int var194;
                                                int var195;
                                                if (var193 >= 0) {
                                                    var194 = Statics.field1578.method1978(var193);
                                                    var195 = -1;
                                                } else if (var192.field1064 == 16711935) {
                                                    var195 = -2;
                                                    var193 = -1;
                                                    var194 = -2;
                                                } else {
                                                    var195 = class6.method972(var192.field1073, var192.field1069, var192.field1070);
                                                    int var196 = class6.field91 + var192.field1073 & 0xFF;
                                                    int var197 = class6.field94 + var192.field1070;
                                                    if (var197 < 0) {
                                                        var197 = 0;
                                                    } else if (var197 > 255) {
                                                        var197 = 255;
                                                    }
                                                    var194 = class6.method972(var196, var192.field1069, var197);
                                                }
                                                int var198 = 0;
                                                if (var194 != -2) {
                                                    var198 = class91.field1577[class6.method670(var194, 96)];
                                                }
                                                if (var192.field1067 != -1) {
                                                    int var199 = class6.field91 + var192.field1071 & 0xFF;
                                                    int var200 = class6.field94 + var192.field1065;
                                                    if (var200 < 0) {
                                                        var200 = 0;
                                                    } else if (var200 > 255) {
                                                        var200 = 255;
                                                    }
                                                    int var201 = class6.method972(var199, var192.field1072, var200);
                                                    var198 = class91.field1577[class6.method670(var201, 96)];
                                                }
                                                var134.method1733(var140, var155, var168, var190, var191, var193, var173, var174, var175, var176, class6.method2097(var181, var177), class6.method2097(var181, var178), class6.method2097(var181, var179), class6.method2097(var181, var180), class6.method670(var195, var177), class6.method670(var195, var178), class6.method670(var195, var179), class6.method670(var195, var180), var189, var198);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (int var202 = 1; var202 < 103; var202++) {
                            for (int var203 = 1; var203 < 103; var203++) {
                                var134.method1831(var140, var203, var202, class6.method2739(var140, var203, var202));
                            }
                        }
                        Statics.field80[var140] = (byte[][]) null;
                        Statics.field1446[var140] = (byte[][]) null;
                        Statics.field1214[var140] = (byte[][]) null;
                        Statics.field81[var140] = (byte[][]) null;
                        Statics.field82[var140] = (byte[][]) null;
                    }
                    var134.method1759(-50, -10, -50);
                    for (int var204 = 0; var204 < 104; var204++) {
                        for (int var205 = 0; var205 < 104; var205++) {
                            if ((class6.field98[1][var204][var205] & 0x2) == 2) {
                                var134.method1850(var204, var205);
                            }
                        }
                    }
                    int var206 = 1;
                    int var207 = 2;
                    int var208 = 4;
                    for (int var209 = 0; var209 < 4; var209++) {
                        if (var209 > 0) {
                            var206 <<= 0x3;
                            var207 <<= 0x3;
                            var208 <<= 0x3;
                        }
                        for (int var210 = 0; var210 <= var209; var210++) {
                            for (int var211 = 0; var211 <= 104; var211++) {
                                for (int var212 = 0; var212 <= 104; var212++) {
                                    if ((Statics.field256[var210][var212][var211] & var206) != 0) {
                                        int var213 = var211;
                                        int var214 = var211;
                                        int var215 = var210;
                                        int var216 = var210;
                                        while (var213 > 0 && (Statics.field256[var210][var212][var213 - 1] & var206) != 0) {
                                            var213--;
                                        }
                                        while (var214 < 104 && (Statics.field256[var210][var212][var214 + 1] & var206) != 0) {
                                            var214++;
                                        }
                                        label753: while (var215 > 0) {
                                            for (int var217 = var213; var217 <= var214; var217++) {
                                                if ((Statics.field256[var215 - 1][var212][var217] & var206) == 0) {
                                                    break label753;
                                                }
                                            }
                                            var215--;
                                        }
                                        label742: while (var216 < var209) {
                                            for (int var218 = var213; var218 <= var214; var218++) {
                                                if ((Statics.field256[var216 + 1][var212][var218] & var206) == 0) {
                                                    break label742;
                                                }
                                            }
                                            var216++;
                                        }
                                        int var219 = (var216 + 1 - var215) * (var214 - var213 + 1);
                                        if (var219 >= 8) {
                                            short var220 = 240;
                                            int var221 = class6.field97[var216][var212][var213] - var220;
                                            int var222 = class6.field97[var215][var212][var213];
                                            class86.method1791(var209, 1, var212 * 128, var212 * 128, var213 * 128, var214 * 128 + 128, var221, var222);
                                            for (int var223 = var215; var223 <= var216; var223++) {
                                                for (int var224 = var213; var224 <= var214; var224++) {
                                                    Statics.field256[var223][var212][var224] &= ~var206;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field256[var210][var212][var211] & var207) != 0) {
                                        int var225 = var212;
                                        int var226 = var212;
                                        int var227 = var210;
                                        int var228 = var210;
                                        while (var225 > 0 && (Statics.field256[var210][var225 - 1][var211] & var207) != 0) {
                                            var225--;
                                        }
                                        while (var226 < 104 && (Statics.field256[var210][var226 + 1][var211] & var207) != 0) {
                                            var226++;
                                        }
                                        label806: while (var227 > 0) {
                                            for (int var229 = var225; var229 <= var226; var229++) {
                                                if ((Statics.field256[var227 - 1][var229][var211] & var207) == 0) {
                                                    break label806;
                                                }
                                            }
                                            var227--;
                                        }
                                        label795: while (var228 < var209) {
                                            for (int var230 = var225; var230 <= var226; var230++) {
                                                if ((Statics.field256[var228 + 1][var230][var211] & var207) == 0) {
                                                    break label795;
                                                }
                                            }
                                            var228++;
                                        }
                                        int var231 = (var228 + 1 - var227) * (var226 - var225 + 1);
                                        if (var231 >= 8) {
                                            short var232 = 240;
                                            int var233 = class6.field97[var228][var225][var211] - var232;
                                            int var234 = class6.field97[var227][var225][var211];
                                            class86.method1791(var209, 2, var225 * 128, var226 * 128 + 128, var211 * 128, var211 * 128, var233, var234);
                                            for (int var235 = var227; var235 <= var228; var235++) {
                                                for (int var236 = var225; var236 <= var226; var236++) {
                                                    Statics.field256[var235][var236][var211] &= ~var207;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field256[var210][var212][var211] & var208) != 0) {
                                        int var237 = var212;
                                        int var238 = var212;
                                        int var239 = var211;
                                        int var240 = var211;
                                        while (var239 > 0 && (Statics.field256[var210][var212][var239 - 1] & var208) != 0) {
                                            var239--;
                                        }
                                        while (var240 < 104 && (Statics.field256[var210][var212][var240 + 1] & var208) != 0) {
                                            var240++;
                                        }
                                        label859: while (var237 > 0) {
                                            for (int var241 = var239; var241 <= var240; var241++) {
                                                if ((Statics.field256[var210][var237 - 1][var241] & var208) == 0) {
                                                    break label859;
                                                }
                                            }
                                            var237--;
                                        }
                                        label848: while (var238 < 104) {
                                            for (int var242 = var239; var242 <= var240; var242++) {
                                                if ((Statics.field256[var210][var238 + 1][var242] & var208) == 0) {
                                                    break label848;
                                                }
                                            }
                                            var238++;
                                        }
                                        if ((var238 - var237 + 1) * (var240 - var239 + 1) >= 4) {
                                            int var243 = class6.field97[var210][var237][var239];
                                            class86.method1791(var209, 4, var237 * 128, var238 * 128 + 128, var239 * 128, var240 * 128 + 128, var243, var243);
                                            for (int var244 = var237; var244 <= var238; var244++) {
                                                for (int var245 = var239; var245 <= var240; var245++) {
                                                    Statics.field256[var210][var244][var245] &= ~var208;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    method2(true);
                    int var246 = class6.field79;
                    if (var246 > Statics.field1963) {
                        var246 = Statics.field1963;
                    }
                    if (var246 < Statics.field1963 - 1) {
                        int var247 = Statics.field1963 - 1;
                    }
                    if (field353) {
                        Statics.field841.method1813(class6.field79);
                    } else {
                        Statics.field841.method1813(0);
                    }
                    for (int var248 = 0; var248 < 104; var248++) {
                        for (int var249 = 0; var249 < 104; var249++) {
                            method167(var248, var249);
                        }
                    }
                    method833();
                    for (class17 var250 = (class17) field423.method3535(); var250 != null; var250 = (class17) field423.method3537()) {
                        if (var250.field239 == -1) {
                            var250.field234 = 0;
                            method3(var250);
                        } else {
                            var250.method3624();
                        }
                    }
                    class41.field939.method3464();
                    if (Statics.field786 != null) {
                        field295.method2549(199);
                        field295.method2299(1057001181);
                    }
                    if (!field361) {
                        int var251 = (Statics.field579 - 6) / 8;
                        int var252 = (Statics.field579 + 6) / 8;
                        int var253 = (Statics.field20 - 6) / 8;
                        int var254 = (Statics.field20 + 6) / 8;
                        for (int var255 = var251 - 1; var255 <= var252 + 1; var255++) {
                            for (int var256 = var253 - 1; var256 <= var254 + 1; var256++) {
                                if (var255 < var251 || var255 > var252 || var256 < var253 || var256 > var254) {
                                    Statics.field998.method3038("m" + var255 + "_" + var256);
                                    Statics.field998.method3038("l" + var255 + "_" + var256);
                                }
                            }
                        }
                    }
                    method605(30);
                    method833();
                    Statics.field80 = (byte[][][]) null;
                    Statics.field1446 = (byte[][][]) null;
                    Statics.field1214 = (byte[][][]) null;
                    Statics.field81 = (byte[][][]) null;
                    Statics.field256 = (int[][][]) null;
                    Statics.field82 = (byte[][][]) null;
                    Statics.field83 = (int[][]) null;
                    Statics.field2169 = null;
                    Statics.field1681 = null;
                    Statics.field3125 = null;
                    Statics.field170 = null;
                    Statics.field153 = null;
                    field295.method2549(193);
                    class144.method4();
                } else {
                    field349 = 2;
                }
            } else {
                field349 = 1;
            }
        }
        if (field300 == 30) {
            method1531();
        } else if (field300 == 40 || field300 == 45) {
            method103();
        }
    }

    @ObfuscatedName("client.k(B)V")
    public final void method229() {
        boolean var1 = class183.method3194();
        if (var1 && field319 && Statics.field1989 != null) {
            Statics.field1989.method1121();
        }
        if (field300 == 10 || field300 == 20 || field300 == 30) {
            if (field502 != 0L && class115.method2906() > field502) {
                int var2 = field503 ? 2 : 1;
                method121(var2);
            } else if (field2190) {
                method535();
            }
        }
        Dimension var3 = this.method2808();
        if (Statics.field1973 != var3.width || Statics.field890 != var3.height || field2188) {
            method2731();
            field502 = class115.method2906() + 500L;
            field2188 = false;
        }
        boolean var4 = false;
        if (field2193) {
            field2193 = false;
            var4 = true;
            for (int var5 = 0; var5 < 100; var5++) {
                field494[var5] = true;
            }
        }
        if (var4) {
            method44();
        }
        if (field300 == 0) {
            class144.method586(class32.field746 * 5, class32.field739, (Color) null, var4);
        } else if (field300 == 5) {
            class32.method743(Statics.field1093, Statics.field1557, Statics.field1363, var4);
        } else if (field300 == 10 || field300 == 11) {
            class32.method743(Statics.field1093, Statics.field1557, Statics.field1363, var4);
        } else if (field300 == 20) {
            class32.method743(Statics.field1093, Statics.field1557, Statics.field1363, var4);
        } else if (field300 == 25) {
            if (field349 == 1) {
                if (field356 > field346) {
                    field346 = field356;
                }
                int var6 = (field346 * 50 - field356 * 50) / field346;
                method578(class157.field2317 + class2.field33 + class2.field23 + var6 + "%" + class2.field22, false);
            } else if (field349 == 2) {
                if (field307 > field498) {
                    field498 = field307;
                }
                int var7 = (field498 * 50 - field307 * 50) / field498 + 50;
                method578(class157.field2317 + class2.field33 + class2.field23 + var7 + "%" + class2.field22, false);
            } else {
                method578(class157.field2317, false);
            }
        } else if (field300 == 30) {
            method1474();
        } else if (field300 == 40) {
            method578(class157.field2318 + class2.field33 + class157.field2319, false);
        } else if (field300 == 45) {
            method578(class157.field2466, false);
        }
        if (field300 == 30 && field501 == 0 && !var4) {
            try {
                Graphics var8 = Statics.field773.getGraphics();
                for (int var9 = 0; var9 < field492; var9++) {
                    if (field557[var9]) {
                        Statics.field2029.method1486(var8, field497[var9], field340[var9], field499[var9], field531[var9]);
                        field557[var9] = false;
                    }
                }
            } catch (Exception var15) {
                Statics.field773.repaint();
            }
        } else if (field300 > 0) {
            try {
                Graphics var11 = Statics.field773.getGraphics();
                Statics.field2029.method1477(var11, 0, 0);
                for (int var12 = 0; var12 < field492; var12++) {
                    field557[var12] = false;
                }
            } catch (Exception var14) {
                Statics.field773.repaint();
            }
        }
    }

    @ObfuscatedName("client.d(B)V")
    public final void method230() {
        if (Statics.field683.method181()) {
            Statics.field683.method180();
        }
        if (Statics.field2269 != null) {
            Statics.field2269.field197 = false;
        }
        Statics.field2269 = null;
        if (Statics.field2947 != null) {
            Statics.field2947.method2779();
            Statics.field2947 = null;
        }
        class137.method2182();
        class140.method2912();
        Statics.field240 = null;
        if (Statics.field1989 != null) {
            Statics.field1989.method1122();
        }
        if (Statics.field2080 != null) {
            Statics.field2080.method1122();
        }
        class171.method158();
        Object var1 = class170.field2702;
        synchronized (class170.field2702) {
            if (class170.field2701 != 0) {
                class170.field2701 = 1;
                try {
                    class170.field2702.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        try {
            class149.field2227.method3832();
            for (int var4 = 0; var4 < Statics.field2221; var4++) {
                Statics.field2229[var4].method3832();
            }
            class149.field2235.method3832();
            class149.field2228.method3832();
        } catch (Exception var7) {
        }
    }

    @ObfuscatedName("ab.n(IB)V")
    public static void method605(int arg0) {
        if (field300 == arg0) {
            return;
        }
        if (field300 == 0) {
            Statics.field1454 = null;
            Statics.field1983 = null;
            Statics.field1967 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field323 = 0;
            field324 = 0;
            field325 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1053 != null) {
            Statics.field1053.method2779();
            Statics.field1053 = null;
        }
        if (field300 == 25) {
            field349 = 0;
            field356 = 0;
            field346 = 1;
            field307 = 0;
            field498 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class32.method1539(Statics.field773, Statics.field697, Statics.field133, true, 0);
        } else if (arg0 == 20) {
            class32.method1539(Statics.field773, Statics.field697, Statics.field133, true, field300 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class32.method1539(Statics.field773, Statics.field697, Statics.field133, false, 4);
        } else {
            class32.method2664();
        }
        field300 = arg0;
    }

    @ObfuscatedName("client.z(B)V")
    public void method231() {
        if (field300 == 1000) {
            return;
        }
        long var1 = class115.method2906();
        int var3 = (int) (var1 - Statics.field2126);
        Statics.field2126 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class171.field2712 += var3;
        boolean var4;
        if (class171.field2716 == 0 && class171.field2718 == 0 && class171.field2714 == 0 && class171.field2709 == 0) {
            var4 = true;
        } else if (Statics.field2724 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class171.field2712 > 30000) {
                        throw new IOException();
                    }
                    while (class171.field2718 < 20 && class171.field2709 > 0) {
                        class172 var5 = (class172) class171.field2725.method3496();
                        class119 var6 = new class119(4);
                        var6.method2296(1);
                        var6.method2298((int) var5.field3099);
                        Statics.field2724.method2778(var6.field1988, 0, 4);
                        class171.field2710.method3495(var5, var5.field3099);
                        class171.field2709--;
                        class171.field2718++;
                    }
                    while (class171.field2716 < 20 && class171.field2714 > 0) {
                        class172 var7 = (class172) class171.field2722.method3593();
                        class119 var8 = new class119(4);
                        var8.method2296(0);
                        var8.method2298((int) var7.field3099);
                        Statics.field2724.method2778(var8.field1988, 0, 4);
                        var7.method3605();
                        class171.field2715.method3495(var7, var7.field3099);
                        class171.field2714--;
                        class171.field2716++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2724.method2774();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class171.field2712 = 0;
                        byte var11 = 0;
                        if (Statics.field1057 == null) {
                            var11 = 8;
                        } else if (class171.field2708 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class171.field2717.field1984;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2724.method2775(class171.field2717.field1988, class171.field2717.field1984, var12);
                            if (class171.field2706 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class171.field2717.field1988[class171.field2717.field1984 + var13] ^= class171.field2706;
                                }
                            }
                            class171.field2717.field1984 += var12;
                            if (class171.field2717.field1984 < var11) {
                                break;
                            }
                            if (Statics.field1057 == null) {
                                class171.field2717.field1984 = 0;
                                int var14 = class171.field2717.method2310();
                                int var15 = class171.field2717.method2312();
                                int var16 = class171.field2717.method2310();
                                int var17 = class171.field2717.method2315();
                                long var18 = (long) ((var14 << 16) + var15);
                                class172 var20 = (class172) class171.field2710.method3509(var18);
                                Statics.field34 = true;
                                if (var20 == null) {
                                    var20 = (class172) class171.field2715.method3509(var18);
                                    Statics.field34 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1057 = var20;
                                Statics.field2071 = new class119(var17 + var21 + Statics.field1057.field2728);
                                Statics.field2071.method2296(var16);
                                Statics.field2071.method2299(var17);
                                class171.field2708 = 8;
                                class171.field2717.field1984 = 0;
                            } else if (class171.field2708 == 0) {
                                if (class171.field2717.field1988[0] == -1) {
                                    class171.field2708 = 1;
                                    class171.field2717.field1984 = 0;
                                } else {
                                    Statics.field1057 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2071.field1988.length - Statics.field1057.field2728;
                            int var23 = 512 - class171.field2708;
                            if (var23 > var22 - Statics.field2071.field1984) {
                                var23 = var22 - Statics.field2071.field1984;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2724.method2775(Statics.field2071.field1988, Statics.field2071.field1984, var23);
                            if (class171.field2706 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2071.field1988[Statics.field2071.field1984 + var24] ^= class171.field2706;
                                }
                            }
                            Statics.field2071.field1984 += var23;
                            class171.field2708 += var23;
                            if (Statics.field2071.field1984 == var22) {
                                if (Statics.field1057.field3099 == 16711935L) {
                                    Statics.field714 = Statics.field2071;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class168 var26 = class171.field2721[var25];
                                        if (var26 != null) {
                                            Statics.field714.field1984 = var25 * 8 + 5;
                                            int var27 = Statics.field714.method2315();
                                            int var28 = Statics.field714.method2315();
                                            var26.method3090(var27, var28);
                                        }
                                    }
                                } else {
                                    class171.field2720.reset();
                                    class171.field2720.update(Statics.field2071.field1988, 0, var22);
                                    int var29 = (int) class171.field2720.getValue();
                                    if (Statics.field1057.field2727 != var29) {
                                        try {
                                            Statics.field2724.method2779();
                                        } catch (Exception var35) {
                                        }
                                        class171.field2723++;
                                        Statics.field2724 = null;
                                        class171.field2706 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class171.field2723 = 0;
                                    class171.field2707 = 0;
                                    Statics.field1057.field2729.method3108((int) (Statics.field1057.field3099 & 0xFFFFL), Statics.field2071.field1988, (Statics.field1057.field3099 & 0xFF0000L) == 16711680L, Statics.field34);
                                }
                                Statics.field1057.method3624();
                                if (Statics.field34) {
                                    class171.field2718--;
                                } else {
                                    class171.field2716--;
                                }
                                class171.field2708 = 0;
                                Statics.field1057 = null;
                                Statics.field2071 = null;
                            } else {
                                if (class171.field2708 != 512) {
                                    break;
                                }
                                class171.field2708 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2724.method2779();
                } catch (Exception var34) {
                }
                class171.field2707++;
                Statics.field2724 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method352();
        }
    }

    @ObfuscatedName("client.c(I)V")
    public void method352() {
        if (class171.field2723 >= 4) {
            this.method2806("js5crc");
            field300 = 1000;
            return;
        }
        if (class171.field2707 >= 4) {
            if (field300 <= 5) {
                this.method2806("js5io");
                field300 = 1000;
                return;
            }
            field543 = 3000;
            class171.field2707 = 3;
        }
        if (--field543 + 1 > 0) {
            return;
        }
        try {
            if (field406 == 0) {
                Statics.field2255 = Statics.field1158.method2679(Statics.field28, Statics.field1080);
                field406++;
            }
            if (field406 == 1) {
                if (Statics.field2255.field2204 == 2) {
                    this.method233(-1);
                    return;
                }
                if (Statics.field2255.field2204 == 1) {
                    field406++;
                }
            }
            if (field406 == 2) {
                Statics.field2586 = new class143((Socket) Statics.field2255.field2212, Statics.field1158);
                class119 var1 = new class119(5);
                var1.method2296(15);
                var1.method2299(96);
                Statics.field2586.method2778(var1.field1988, 0, 5);
                field406++;
                Statics.field126 = class115.method2906();
            }
            if (field406 == 3) {
                if (field300 <= 5 || Statics.field2586.method2774() > 0) {
                    int var2 = Statics.field2586.method2773();
                    if (var2 != 0) {
                        this.method233(var2);
                        return;
                    }
                    field406++;
                } else if (class115.method2906() - Statics.field126 > 30000L) {
                    this.method233(-2);
                    return;
                }
            }
            if (field406 == 4) {
                class143 var3 = Statics.field2586;
                boolean var4 = field300 > 20;
                if (Statics.field2724 != null) {
                    try {
                        Statics.field2724.method2779();
                    } catch (Exception var14) {
                    }
                    Statics.field2724 = null;
                }
                Statics.field2724 = var3;
                class171.method2993(var4);
                class171.field2717.field1984 = 0;
                Statics.field1057 = null;
                Statics.field2071 = null;
                class171.field2708 = 0;
                while (true) {
                    class172 var6 = (class172) class171.field2710.method3496();
                    if (var6 == null) {
                        while (true) {
                            class172 var7 = (class172) class171.field2715.method3496();
                            if (var7 == null) {
                                if (class171.field2706 != 0) {
                                    try {
                                        class119 var8 = new class119(4);
                                        var8.method2296(4);
                                        var8.method2296(class171.field2706);
                                        var8.method2381(0);
                                        Statics.field2724.method2778(var8.field1988, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2724.method2779();
                                        } catch (Exception var12) {
                                        }
                                        class171.field2707++;
                                        Statics.field2724 = null;
                                    }
                                }
                                class171.field2712 = 0;
                                Statics.field2126 = class115.method2906();
                                Statics.field2255 = null;
                                Statics.field2586 = null;
                                field406 = 0;
                                field322 = 0;
                                return;
                            }
                            class171.field2722.method3591(var7);
                            class171.field2713.method3495(var7, var7.field3099);
                            class171.field2714++;
                            class171.field2716--;
                        }
                    }
                    class171.field2725.method3495(var6, var6.field3099);
                    class171.field2709++;
                    class171.field2718--;
                }
            }
        } catch (IOException var15) {
            this.method233(-3);
        }
    }

    @ObfuscatedName("client.b(II)V")
    public void method233(int arg0) {
        Statics.field2255 = null;
        Statics.field2586 = null;
        field406 = 0;
        if (Statics.field893 == Statics.field1080) {
            Statics.field1080 = Statics.field327;
        } else {
            Statics.field1080 = Statics.field893;
        }
        field322++;
        if (field322 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field300 <= 5) {
                this.method2806("js5connect_full");
                field300 = 1000;
            } else {
                field543 = 3000;
            }
        } else if (field322 >= 2 && arg0 == 6) {
            this.method2806("js5connect_outofdate");
            field300 = 1000;
        } else if (field322 >= 4) {
            if (field300 <= 5) {
                this.method2806("js5connect");
                field300 = 1000;
            } else {
                field543 = 3000;
            }
        }
    }

    @ObfuscatedName("de.w(I)V")
    public static void method2608() {
        if (field542 == 0) {
            Statics.field841 = new class86(4, 104, 104, class6.field97);
            for (int var0 = 0; var0 < 4; var0++) {
                field537[var0] = new class108(104, 104);
            }
            Statics.field680 = new class79(512, 512);
            class32.field739 = class157.field2438;
            class32.field746 = 1;
            field542 = 20;
        } else if (field542 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class91.field1558[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class86.method1763(var1, 500, 800, 512, 334);
            class32.field739 = class157.field2427;
            class32.field746 = 2;
            field542 = 30;
        } else if (field542 == 30) {
            Statics.field186 = method173(0, false, true, true);
            Statics.field235 = method173(1, false, true, true);
            Statics.field8 = method173(2, true, false, true);
            Statics.field2035 = method173(3, false, true, true);
            Statics.field218 = method173(4, false, true, true);
            Statics.field998 = method173(5, true, true, true);
            Statics.field159 = method173(6, true, true, false);
            Statics.field703 = method173(7, false, true, true);
            Statics.field133 = method173(8, false, true, true);
            Statics.field2677 = method173(9, false, true, true);
            Statics.field697 = method173(10, false, true, true);
            Statics.field487 = method173(11, false, true, true);
            Statics.field894 = method173(12, false, true, true);
            Statics.field572 = method173(13, true, false, true);
            Statics.field1347 = method173(14, false, true, false);
            Statics.field1947 = method173(15, false, true, true);
            class32.field739 = class157.field2365;
            class32.field746 = 4;
            field542 = 40;
        } else if (field542 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field186.method3089() * 4 / 100;
            int var8 = var7 + Statics.field235.method3089() * 4 / 100;
            int var9 = var8 + Statics.field8.method3089() * 2 / 100;
            int var10 = var9 + Statics.field2035.method3089() * 2 / 100;
            int var11 = var10 + Statics.field218.method3089() * 6 / 100;
            int var12 = var11 + Statics.field998.method3089() * 4 / 100;
            int var13 = var12 + Statics.field159.method3089() * 2 / 100;
            int var14 = var13 + Statics.field703.method3089() * 60 / 100;
            int var15 = var14 + Statics.field133.method3089() * 2 / 100;
            int var16 = var15 + Statics.field2677.method3089() * 2 / 100;
            int var17 = var16 + Statics.field697.method3089() * 2 / 100;
            int var18 = var17 + Statics.field487.method3089() * 2 / 100;
            int var19 = var18 + Statics.field894.method3089() * 2 / 100;
            int var20 = var19 + Statics.field572.method3089() * 2 / 100;
            int var21 = var20 + Statics.field1347.method3089() * 2 / 100;
            int var22 = var21 + Statics.field1947.method3089() * 2 / 100;
            if (var22 == 100) {
                class32.field739 = class157.field2324;
                class32.field746 = 6;
                field542 = 45;
            } else {
                if (var22 != 0) {
                    class32.field739 = class157.field2323 + var22 + "%";
                }
                class32.field746 = 6;
            }
        } else if (field542 == 45) {
            boolean var23 = !field353;
            Statics.field1192 = 22050;
            Statics.field1175 = var23;
            Statics.field1106 = 2;
            class184 var24 = new class184();
            var24.method3343(9, 128);
            Statics.field1989 = class57.method43(Statics.field1158, Statics.field773, 0, 22050);
            Statics.field1989.method1127(var24);
            class168 var25 = Statics.field1947;
            class168 var26 = Statics.field1347;
            class168 var27 = Statics.field218;
            Statics.field3126 = var25;
            Statics.field2948 = var26;
            Statics.field2945 = var27;
            Statics.field791 = var24;
            Statics.field2080 = class57.method43(Statics.field1158, Statics.field773, 1, 2048);
            Statics.field31 = new class56();
            Statics.field2080.method1127(Statics.field31);
            Statics.field72 = new class75(22050, Statics.field1192);
            class32.field739 = class157.field2325;
            class32.field746 = 7;
            field542 = 50;
        } else if (field542 == 50) {
            int var28 = 0;
            if (Statics.field1557 == null) {
                class168 var29 = Statics.field133;
                class168 var30 = Statics.field572;
                int var31 = var29.method3033("p11_full");
                int var32 = var29.method3035(var31, "");
                class224 var33 = class77.method872(var29, var30, var31, var32);
                Statics.field1557 = var33;
            } else {
                var28++;
            }
            if (Statics.field1363 == null) {
                class168 var34 = Statics.field133;
                class168 var35 = Statics.field572;
                int var36 = var34.method3033("p12_full");
                int var37 = var34.method3035(var36, "");
                class224 var38 = class77.method872(var34, var35, var36, var37);
                Statics.field1363 = var38;
            } else {
                var28++;
            }
            if (Statics.field1093 == null) {
                class168 var39 = Statics.field133;
                class168 var40 = Statics.field572;
                int var41 = var39.method3033("b12_full");
                int var42 = var39.method3035(var41, "");
                class224 var43 = class77.method872(var39, var40, var41, var42);
                Statics.field1093 = var43;
            } else {
                var28++;
            }
            if (var28 < 3) {
                class32.field739 = class157.field2326 + var28 * 100 / 3 + "%";
                class32.field746 = 8;
            } else {
                Statics.field1453 = new class160(true);
                class32.field739 = class157.field2327;
                class32.field746 = 8;
                field542 = 60;
            }
        } else if (field542 == 60) {
            class168 var44 = Statics.field697;
            class168 var45 = Statics.field133;
            int var46 = 0;
            if (var44.method3036("title.jpg", "")) {
                var46++;
            }
            if (var45.method3036("logo", "")) {
                var46++;
            }
            if (var45.method3036("logo_deadman_mode", "")) {
                var46++;
            }
            if (var45.method3036("titlebox", "")) {
                var46++;
            }
            if (var45.method3036("titlebutton", "")) {
                var46++;
            }
            if (var45.method3036("runes", "")) {
                var46++;
            }
            if (var45.method3036("title_mute", "")) {
                var46++;
            }
            if (var45.method3088("options_radio_buttons,0")) {
                var46++;
            }
            if (var45.method3088("options_radio_buttons,2")) {
                var46++;
            }
            var45.method3036("sl_back", "");
            var45.method3036("sl_flags", "");
            var45.method3036("sl_arrows", "");
            var45.method3036("sl_stars", "");
            var45.method3036("sl_button", "");
            int var49 = class32.method954();
            if (var46 < var49) {
                class32.field739 = class157.field2471 + var46 * 100 / var49 + "%";
                class32.field746 = 10;
            } else {
                class32.field739 = class157.field2473;
                class32.field746 = 10;
                method605(5);
                field542 = 70;
            }
        } else if (field542 == 70) {
            if (Statics.field8.method3022()) {
                class47.method5(Statics.field8);
                class42.method2717(Statics.field8);
                class168 var50 = Statics.field8;
                class168 var51 = Statics.field703;
                Statics.field1052 = var50;
                Statics.field1041 = var51;
                Statics.field1051 = Statics.field1052.method3078(3);
                class168 var52 = Statics.field8;
                class168 var53 = Statics.field703;
                boolean var54 = field353;
                Statics.field985 = var52;
                Statics.field937 = var53;
                class41.field967 = var54;
                class168 var55 = Statics.field8;
                class168 var56 = Statics.field703;
                Statics.field897 = var55;
                Statics.field898 = var56;
                class52.method1511(Statics.field8, Statics.field703, field296, Statics.field1557);
                class43.method2633(Statics.field8, Statics.field186, Statics.field235);
                class168 var57 = Statics.field8;
                class168 var58 = Statics.field703;
                Statics.field1037 = var57;
                Statics.field1022 = var58;
                class48.method1151(Statics.field8);
                class53.method594(Statics.field8);
                class173.method2909(Statics.field2035, Statics.field703, Statics.field133, Statics.field572);
                class51.method2593(Statics.field8);
                class49.method832(Statics.field8);
                class46.method1909(Statics.field8);
                class168 var59 = Statics.field8;
                Statics.field1100 = var59;
                Statics.field683 = new class20();
                class32.field739 = class157.field2559;
                class32.field746 = 12;
                field542 = 80;
            } else {
                class32.field739 = class157.field2488 + Statics.field8.method3091() + "%";
                class32.field746 = 12;
            }
        } else if (field542 == 80) {
            int var60 = 0;
            if (Statics.field1941 == null) {
                Statics.field1941 = class77.method767(Statics.field133, "compass", "");
            } else {
                var60++;
            }
            if (Statics.field1605 == null) {
                class168 var61 = Statics.field133;
                int var62 = var61.method3033("mapedge");
                int var63 = var61.method3035(var62, "");
                class79 var64 = class77.method164(var61, var62, var63);
                Statics.field1605 = var64;
            } else {
                var60++;
            }
            if (Statics.field2632 == null) {
                Statics.field2632 = class77.method2227(Statics.field133, "mapscene", "");
            } else {
                var60++;
            }
            if (Statics.field388 == null) {
                Statics.field388 = class77.method530(Statics.field133, "mapfunction", "");
            } else {
                var60++;
            }
            if (Statics.field1889 == null) {
                Statics.field1889 = class77.method530(Statics.field133, "hitmarks", "");
            } else {
                var60++;
            }
            if (Statics.field2154 == null) {
                Statics.field2154 = class77.method530(Statics.field133, "headicons_pk", "");
            } else {
                var60++;
            }
            if (Statics.field1526 == null) {
                Statics.field1526 = class77.method530(Statics.field133, "headicons_prayer", "");
            } else {
                var60++;
            }
            if (Statics.field3186 == null) {
                Statics.field3186 = class77.method530(Statics.field133, "headicons_hint", "");
            } else {
                var60++;
            }
            if (Statics.field504 == null) {
                Statics.field504 = class77.method530(Statics.field133, "mapmarker", "");
            } else {
                var60++;
            }
            if (Statics.field2951 == null) {
                Statics.field2951 = class77.method530(Statics.field133, "cross", "");
            } else {
                var60++;
            }
            if (Statics.field2060 == null) {
                Statics.field2060 = class77.method530(Statics.field133, "mapdots", "");
            } else {
                var60++;
            }
            if (Statics.field973 == null) {
                Statics.field973 = class77.method2227(Statics.field133, "scrollbar", "");
            } else {
                var60++;
            }
            if (Statics.field71 == null) {
                Statics.field71 = class77.method2227(Statics.field133, "mod_icons", "");
            } else {
                var60++;
            }
            if (var60 < 13) {
                class32.field739 = class157.field2332 + var60 * 100 / 13 + "%";
                class32.field746 = -30634 * -1149240939;
            } else {
                Statics.field3173 = Statics.field71;
                Statics.field1605.method1579();
                int var65 = (int) (Math.random() * 21.0D) - 10;
                int var66 = (int) (Math.random() * 21.0D) - 10;
                int var67 = (int) (Math.random() * 21.0D) - 10;
                int var68 = (int) (Math.random() * 41.0D) - 20;
                for (int var69 = 0; var69 < Statics.field388.length; var69++) {
                    Statics.field388[var69].method1545(var65 + var68, var66 + var68, var67 + var68);
                }
                Statics.field2632[0].method1692(var65 + var68, var66 + var68, var67 + var68);
                class32.field739 = class157.field2341;
                class32.field746 = -30634 * -1149240939;
                field542 = 90;
            }
        } else if (field542 == 90) {
            if (Statics.field2677.method3022()) {
                class95 var70 = new class95(Statics.field2677, Statics.field133, 20, 0.8D, field353 ? 64 : 128);
                class91.method1937(var70);
                class91.method1921(0.8D);
                class32.field739 = class157.field2335;
                class32.field746 = 18;
                field542 = 110;
            } else {
                class32.field739 = class157.field2334 + Statics.field2677.method3091() + "%";
                class32.field746 = 18;
            }
        } else if (field542 == 110) {
            Statics.field2269 = new class14();
            Statics.field1158.method2683(Statics.field2269, 10);
            class32.field739 = class157.field2336;
            class32.field746 = 858993478;
            field542 = 120;
        } else if (field542 == 120) {
            if (Statics.field697.method3036("huffman", "")) {
                class113 var71 = new class113(Statics.field697.method3044("huffman", ""));
                Statics.field3163 = var71;
                class32.field739 = class157.field2338;
                class32.field746 = -858993440;
                field542 = 130;
            } else {
                class32.field739 = class157.field2475 + "%";
                class32.field746 = -858993440;
            }
        } else if (field542 == 130) {
            if (!Statics.field2035.method3022()) {
                class32.field739 = class157.field2339 + Statics.field2035.method3091() * 4 / 5 + "%";
                class32.field746 = 20;
            } else if (!Statics.field894.method3022()) {
                class32.field739 = class157.field2339 + (80 + Statics.field894.method3091() / 6) + "%";
                class32.field746 = 20;
            } else if (Statics.field572.method3022()) {
                class32.field739 = class157.field2340;
                class32.field746 = 20;
                field542 = 140;
            } else {
                class32.field739 = class157.field2339 + (96 + Statics.field572.method3091() / 20) + "%";
                class32.field746 = 20;
            }
        } else if (field542 == 140) {
            method605(10);
        }
    }

    @ObfuscatedName("l.g(IZZZB)Lfg;")
    public static class168 method173(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class134 var4 = null;
        if (class149.field2227 != null) {
            var4 = new class134(arg0, class149.field2227, Statics.field2229[arg0], 1000000);
        }
        return new class168(var4, Statics.field149, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("r.x(I)V")
    public static final void method103() {
        try {
            if (field323 == 0) {
                if (Statics.field2947 != null) {
                    Statics.field2947.method2779();
                    Statics.field2947 = null;
                }
                Statics.field238 = null;
                field344 = false;
                field324 = 0;
                field323 = 1;
            }
            if (field323 == 1) {
                if (Statics.field238 == null) {
                    Statics.field238 = Statics.field1158.method2679(Statics.field28, Statics.field1080);
                }
                if (Statics.field238.field2204 == 2) {
                    throw new IOException();
                }
                if (Statics.field238.field2204 == 1) {
                    Statics.field2947 = new class143((Socket) Statics.field238.field2212, Statics.field1158);
                    Statics.field238 = null;
                    field323 = 2;
                }
            }
            if (field323 == 2) {
                field295.field1984 = 0;
                field295.method2296(14);
                Statics.field2947.method2778(field295.field1988, 0, 1);
                field335.field1984 = 0;
                field323 = 3;
            }
            if (field323 == 3) {
                if (Statics.field1989 != null) {
                    Statics.field1989.method1120();
                }
                if (Statics.field2080 != null) {
                    Statics.field2080.method1120();
                }
                int var0 = Statics.field2947.method2773();
                if (Statics.field1989 != null) {
                    Statics.field1989.method1120();
                }
                if (Statics.field2080 != null) {
                    Statics.field2080.method1120();
                }
                if (var0 != 0) {
                    Statics.method529(var0);
                    return;
                }
                field335.field1984 = 0;
                field323 = 5;
            }
            if (field323 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field295.field1984 = 0;
                field295.method2296(1);
                field295.method2296(class32.field732.method518());
                field295.method2299(var1[0]);
                field295.method2299(var1[1]);
                field295.method2299(var1[2]);
                field295.method2299(var1[3]);
                switch(class32.field732.field2593) {
                    case 0:
                    case 3:
                        field295.method2298(Statics.field2199);
                        field295.field1984 += 5;
                        break;
                    case 1:
                        field295.field1984 += 8;
                        break;
                    case 2:
                        field295.method2299((Integer) Statics.field187.field144.get(class163.method102(class32.field744)));
                        field295.field1984 += 4;
                }
                field295.method2302(class32.field745);
                field295.method2330(class5.field74, class5.field68);
                field555.field1984 = 0;
                if (field300 == 40) {
                    field555.method2296(18);
                } else {
                    field555.method2296(16);
                }
                field555.method2381(0);
                int var2 = field555.field1984;
                field555.method2299(96);
                field555.method2305(field295.field1988, 0, field295.field1984);
                int var3 = field555.field1984;
                field555.method2302(class32.field744);
                field555.method2296((field503 ? 1 : 0) << 1 | (field353 ? 1 : 0));
                field555.method2381(Statics.field2656);
                field555.method2381(Statics.field2160);
                class149.method2295(field555);
                field555.method2302(Statics.field709);
                field555.method2299(Statics.field61);
                class119 var4 = new class119(Statics.field1453.method2914());
                Statics.field1453.method2916(var4);
                field555.method2305(var4.field1988, 0, var4.field1988.length);
                field555.method2296(Statics.field299);
                field555.method2299(Statics.field186.field2672);
                field555.method2299(Statics.field235.field2672);
                field555.method2299(Statics.field8.field2672);
                field555.method2299(Statics.field2035.field2672);
                field555.method2299(Statics.field218.field2672);
                field555.method2299(Statics.field998.field2672);
                field555.method2299(Statics.field159.field2672);
                field555.method2299(Statics.field703.field2672);
                field555.method2299(Statics.field133.field2672);
                field555.method2299(Statics.field2677.field2672);
                field555.method2299(Statics.field697.field2672);
                field555.method2299(Statics.field487.field2672);
                field555.method2299(Statics.field894.field2672);
                field555.method2299(Statics.field572.field2672);
                field555.method2299(Statics.field1347.field2672);
                field555.method2299(Statics.field1947.field2672);
                field555.method2328(var1, var3, field555.field1984);
                field555.method2307(field555.field1984 - var2);
                Statics.field2947.method2778(field555.field1988, 0, field555.field1984);
                field295.method2548(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field335.method2548(var1);
                field323 = 6;
            }
            if (field323 == 6 && Statics.field2947.method2774() > 0) {
                int var6 = Statics.field2947.method2773();
                if (var6 == 21 && field300 == 20) {
                    field323 = 7;
                } else if (var6 == 2) {
                    field323 = 9;
                } else if (var6 == 15 && field300 == 40) {
                    field384 = -1;
                    field323 = 13;
                } else if (var6 == 23 && field325 < 1) {
                    field325++;
                    field323 = 0;
                } else if (var6 == 29) {
                    field323 = 11;
                } else {
                    Statics.method529(var6);
                    return;
                }
            }
            if (field323 == 7 && Statics.field2947.method2774() > 0) {
                field326 = (Statics.field2947.method2773() + 3) * 60;
                field323 = 8;
            }
            if (field323 == 8) {
                field324 = 0;
                class32.method902(class157.field2344, class157.field2345, field326 / 60 + class157.field2534);
                if (--field326 <= 0) {
                    field323 = 0;
                }
            } else {
                if (field323 == 9 && Statics.field2947.method2774() >= 13) {
                    boolean var7 = Statics.field2947.method2773() == 1;
                    Statics.field2947.method2775(field335.field1988, 0, 4);
                    field335.field1984 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field335.method2550() << 24;
                        int var10 = var9 | field335.method2550() << 16;
                        int var11 = var10 | field335.method2550() << 8;
                        int var12 = var11 | field335.method2550();
                        int var13 = class163.method102(class32.field744);
                        if (Statics.field187.field144.size() >= 10 && !Statics.field187.field144.containsKey(var13)) {
                            Iterator var14 = Statics.field187.field144.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field187.field144.put(var13, var12);
                        class9.method2088();
                    }
                    field456 = Statics.field2947.method2773();
                    field458 = Statics.field2947.method2773() == 1;
                    field336 = Statics.field2947.method2773();
                    field336 <<= 0x8;
                    field336 += Statics.field2947.method2773();
                    field414 = Statics.field2947.method2773();
                    Statics.field2947.method2775(field335.field1988, 0, 1);
                    field335.field1984 = 0;
                    field400 = field335.method2550();
                    Statics.field2947.method2775(field335.field1988, 0, 2);
                    field335.field1984 = 0;
                    field384 = field335.method2312();
                    if (field414 == 1) {
                        try {
                            client var15 = Statics.field289;
                            JSObject.getWindow(var15).call("zap", (Object[]) null);
                        } catch (Throwable var31) {
                        }
                    } else {
                        try {
                            client var17 = Statics.field289;
                            JSObject.getWindow(var17).call("unzap", (Object[]) null);
                        } catch (Throwable var30) {
                        }
                    }
                    field323 = 10;
                }
                if (field323 != 10) {
                    if (field323 == 11 && Statics.field2947.method2774() >= 2) {
                        field335.field1984 = 0;
                        Statics.field2947.method2775(field335.field1988, 0, 2);
                        field335.field1984 = 0;
                        Statics.field252 = field335.method2312();
                        field323 = 12;
                    }
                    if (field323 == 12 && Statics.field2947.method2774() >= Statics.field252) {
                        field335.field1984 = 0;
                        Statics.field2947.method2775(field335.field1988, 0, Statics.field252);
                        field335.field1984 = 0;
                        String var19 = field335.method2318();
                        String var20 = field335.method2318();
                        String var21 = field335.method2318();
                        class32.method902(var19, var20, var21);
                        method605(10);
                    }
                    if (field323 == 13) {
                        if (field384 == -1) {
                            if (Statics.field2947.method2774() < 2) {
                                return;
                            }
                            Statics.field2947.method2775(field335.field1988, 0, 2);
                            field335.field1984 = 0;
                            field384 = field335.method2312();
                        }
                        if (Statics.field2947.method2774() >= field384) {
                            Statics.field2947.method2775(field335.field1988, 0, field384);
                            field335.field1984 = 0;
                            int var22 = field384;
                            field295.field1984 = 0;
                            field335.field1984 = 0;
                            field400 = -1;
                            field430 = -1;
                            field334 = -1;
                            field342 = -1;
                            field384 = 0;
                            field333 = 0;
                            field309 = 0;
                            field449 = 0;
                            field525 = false;
                            field345 = 0;
                            field523 = 0;
                            for (int var23 = 0; var23 < 2048; var23++) {
                                field412[var23] = null;
                            }
                            Statics.field162 = null;
                            for (int var24 = 0; var24 < field470.length; var24++) {
                                class35 var25 = field470[var24];
                                if (var25 != null) {
                                    var25.field849 = -1;
                                    var25.field850 = false;
                                }
                            }
                            class16.field215 = new class196(32);
                            method605(30);
                            for (int var26 = 0; var26 < 100; var26++) {
                                field494[var26] = true;
                            }
                            field295.method2549(93);
                            class122 var27 = field295;
                            int var28 = field503 ? 2 : 1;
                            var27.method2296(var28);
                            field295.method2381(Statics.field2656);
                            field295.method2381(Statics.field2160);
                            class33.method107(field335);
                            if (field335.field1984 != var22) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field324++;
                        if (field324 > 2000) {
                            if (field325 < 1) {
                                if (Statics.field893 == Statics.field1080) {
                                    Statics.field1080 = Statics.field327;
                                } else {
                                    Statics.field1080 = Statics.field893;
                                }
                                field325++;
                                field323 = 0;
                            } else {
                                Statics.method529(-3);
                            }
                        }
                    }
                } else if (Statics.field2947.method2774() >= field384) {
                    field335.field1984 = 0;
                    Statics.field2947.method2775(field335.field1988, 0, field384);
                    method2718();
                    class33.method107(field335);
                    Statics.field579 = -1;
                    method47(false);
                    field400 = -1;
                }
            }
        } catch (IOException var32) {
            if (field325 < 1) {
                if (Statics.field893 == Statics.field1080) {
                    Statics.field1080 = Statics.field327;
                } else {
                    Statics.field1080 = Statics.field893;
                }
                field325++;
                field323 = 0;
            } else {
                Statics.method529(-2);
            }
        }
    }

    @ObfuscatedName("em.o(I)V")
    public static void method2718() {
        field303 = 1L;
        field306 = -1;
        Statics.field2269.field195 = 0;
        Statics.field3137 = true;
        field362 = true;
        field515 = -1L;
        class211.field3112 = new class202();
        field295.field1984 = 0;
        field335.field1984 = 0;
        field400 = -1;
        field430 = -1;
        field334 = -1;
        field342 = -1;
        field333 = 0;
        field309 = 0;
        field301 = 0;
        field310 = 0;
        field449 = 0;
        field525 = false;
        class140.method2584(0);
        class12.method3124();
        field442 = 0;
        field444 = false;
        field527 = 0;
        field354 = (int) (Math.random() * 100.0D) - 50;
        field445 = (int) (Math.random() * 110.0D) - 55;
        field358 = (int) (Math.random() * 80.0D) - 40;
        field409 = (int) (Math.random() * 120.0D) - 60;
        field363 = (int) (Math.random() * 30.0D) - 20;
        field376 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field345 = 0;
        field518 = -1;
        field523 = 0;
        field471 = 0;
        field535 = class21.field583;
        field329 = 0;
        class33.field768 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class33.field759[var0] = null;
            class33.field758[var0] = 1;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field412[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field470[var2] = null;
        }
        field422 = -1;
        field424.method3560();
        field425.method3560();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field437[var3][var4][var5] = null;
                }
            }
        }
        field423 = new class199();
        field519 = 0;
        field556 = 0;
        field560 = 0;
        for (int var6 = 0; var6 < Statics.field1162; var6++) {
            class53 var7 = (class53) class53.field1165.method3467((long) var6);
            class53 var8;
            if (var7 == null) {
                byte[] var9 = Statics.field1164.method3080(16, var6);
                class53 var10 = new class53();
                if (var9 != null) {
                    var10.method1028(new class119(var9));
                }
                class53.field1165.method3466(var10, (long) var6);
                var8 = var10;
            } else {
                var8 = var7;
            }
            if (var8 != null) {
                class176.field2894[var6] = 0;
                class176.field2895[var6] = 0;
            }
        }
        Statics.field683.method204();
        field457 = -1;
        if (field517 != -1) {
            int var12 = field517;
            if (var12 != -1 && Statics.field2805[var12]) {
                Statics.field2863.method3086(var12);
                if (Statics.field2817[var12] != null) {
                    boolean var13 = true;
                    for (int var14 = 0; var14 < Statics.field2817[var12].length; var14++) {
                        if (Statics.field2817[var12][var14] != null) {
                            if (Statics.field2817[var12][var14].field2742 == 2) {
                                var13 = false;
                            } else {
                                Statics.field2817[var12][var14] = null;
                            }
                        }
                    }
                    if (var13) {
                        Statics.field2817[var12] = null;
                    }
                    Statics.field2805[var12] = false;
                }
            }
        }
        for (class4 var15 = (class4) field450.method3496(); var15 != null; var15 = (class4) field450.method3500()) {
            method711(var15, true);
        }
        field517 = -1;
        field450 = new class196(8);
        field421 = null;
        field525 = false;
        field449 = 0;
        field448.method3227((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var16 = 0; var16 < 8; var16++) {
            field431[var16] = null;
            field419[var16] = false;
        }
        class16.field215 = new class196(32);
        field463 = true;
        for (int var17 = 0; var17 < 100; var17++) {
            field494[var17] = true;
        }
        field295.method2549(93);
        class122 var18 = field295;
        int var19 = field503 ? 2 : 1;
        var18.method2296(var19);
        field295.method2381(Statics.field2656);
        field295.method2381(Statics.field2160);
        field478 = null;
        Statics.field2726 = 0;
        Statics.field2655 = null;
        for (int var20 = 0; var20 < 8; var20++) {
            field565[var20] = new class220();
        }
        Statics.field166 = null;
    }

    @ObfuscatedName("ad.j(I)V")
    public static final void method979() {
        if (Statics.field2947 != null) {
            Statics.field2947.method2779();
            Statics.field2947 = null;
        }
        method2907();
        Statics.field841.method1728();
        for (int var0 = 0; var0 < 4; var0++) {
            field537[var0].method2187();
        }
        System.gc();
        class183.field2946 = 1;
        Statics.field2944 = null;
        Statics.field2950 = -1;
        Statics.field2949 = -1;
        Statics.field2031 = 0;
        Statics.field2121 = false;
        Statics.field2129 = 2;
        field528 = -1;
        field319 = false;
        class24.method2642();
        method605(10);
    }

    @ObfuscatedName("ej.m(I)V")
    public static final void method2907() {
        class47.method608();
        class42.field994.method3464();
        class45.field1054.method3464();
        class41.field951.method3464();
        class41.field939.method3464();
        class41.field963.method3464();
        class41.field975.method3464();
        class40.field899.method3464();
        class40.field900.method3464();
        class52.field1113.method3464();
        class52.field1160.method3464();
        class52.field1115.method3464();
        class43.field1002.method3464();
        class43.field996.method3464();
        class44.field1023.method3464();
        class44.field1024.method3464();
        class48.method2098();
        class53.method2010();
        class179.field2912.method3464();
        class173.method2006();
        ((class95) Statics.field1578).method1995();
        class23.field597.method3464();
        Statics.field186.method3031();
        Statics.field235.method3031();
        Statics.field2035.method3031();
        Statics.field218.method3031();
        Statics.field998.method3031();
        Statics.field159.method3031();
        Statics.field703.method3031();
        Statics.field133.method3031();
        Statics.field2677.method3031();
        Statics.field697.method3031();
        Statics.field487.method3031();
        Statics.field894.method3031();
    }

    @ObfuscatedName("o.e(I)V")
    public static final void method170() {
        if (field301 > 0) {
            method979();
        } else {
            method605(40);
            Statics.field1053 = Statics.field2947;
            Statics.field2947 = null;
        }
    }

    @ObfuscatedName("bt.u(B)V")
    public static final void method1531() {
        if (field309 > 1) {
            field309--;
        }
        if (field301 > 0) {
            field301--;
        }
        if (field344) {
            field344 = false;
            method170();
            return;
        }
        if (!field525) {
            field465[0] = class157.field2544;
            field313[0] = "";
            field290[0] = 1006;
            field449 = 1;
        }
        for (int var0 = 0; var0 < 100 && method2651(); var0++) {
        }
        if (field300 != 30) {
            return;
        }
        while (true) {
            class210 var1 = (class210) class211.field3112.method3586();
            boolean var2;
            if (var1 == null) {
                var2 = false;
            } else {
                var2 = true;
            }
            if (!var2) {
                Object var4 = Statics.field2269.field194;
                synchronized (Statics.field2269.field194) {
                    if (!field509) {
                        Statics.field2269.field195 = 0;
                    } else if (class140.field2138 != 0 || Statics.field2269.field195 >= 40) {
                        field295.method2549(49);
                        field295.method2296(0);
                        int var5 = field295.field1984;
                        int var6 = 0;
                        for (int var7 = 0; var7 < Statics.field2269.field195 && field295.field1984 - var5 < 240; var7++) {
                            var6++;
                            int var8 = Statics.field2269.field201[var7];
                            if (var8 < 0) {
                                var8 = 0;
                            } else if (var8 > 502) {
                                var8 = 502;
                            }
                            int var9 = Statics.field2269.field196[var7];
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > 764) {
                                var9 = 764;
                            }
                            int var10 = var8 * 765 + var9;
                            if (Statics.field2269.field201[var7] == -1 && Statics.field2269.field196[var7] == -1) {
                                var9 = -1;
                                var8 = -1;
                                var10 = 524287;
                            }
                            if (field304 != var9 || field305 != var8) {
                                int var11 = var9 - field304;
                                field304 = var9;
                                int var12 = var8 - field305;
                                field305 = var8;
                                if (field306 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                    var11 += 32;
                                    var12 += 32;
                                    field295.method2381((field306 << 12) + (var11 << 6) + var12);
                                    field306 = 0;
                                } else if (field306 < 8) {
                                    field295.method2298((field306 << 19) + 8388608 + var10);
                                    field306 = 0;
                                } else {
                                    field295.method2299((field306 << 19) + -1073741824 + var10);
                                    field306 = 0;
                                }
                            } else if (field306 < 2047) {
                                field306++;
                            }
                        }
                        field295.method2410(field295.field1984 - var5);
                        if (var6 >= Statics.field2269.field195) {
                            Statics.field2269.field195 = 0;
                        } else {
                            Statics.field2269.field195 -= var6;
                            for (int var13 = 0; var13 < Statics.field2269.field195; var13++) {
                                Statics.field2269.field196[var13] = Statics.field2269.field196[var6 + var13];
                                Statics.field2269.field201[var13] = Statics.field2269.field201[var6 + var13];
                            }
                        }
                    }
                }
                if (class140.field2138 == 1 || !Statics.field1652 && class140.field2138 == 4 || class140.field2138 == 2) {
                    long var15 = (class140.field2147 - field303 * -1L) / 50L;
                    if (var15 > 4095L) {
                        var15 = 4095L;
                    }
                    field303 = class140.field2147 * -1L;
                    int var17 = class140.field2136;
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (var17 > Statics.field2160) {
                        var17 = Statics.field2160;
                    }
                    int var18 = class140.field2145;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > Statics.field2656) {
                        var18 = Statics.field2656;
                    }
                    int var19 = (int) var15;
                    field295.method2549(194);
                    field295.method2381((class140.field2138 == 2 ? 1 : 0) + (var19 << 1));
                    field295.method2381(var18);
                    field295.method2381(var17);
                }
                if (class137.field2099 > 0) {
                    field295.method2549(225);
                    field295.method2381(0);
                    int var20 = field295.field1984;
                    long var21 = class115.method2906();
                    for (int var23 = 0; var23 < class137.field2099; var23++) {
                        long var24 = var21 - field515;
                        if (var24 > 16777215L) {
                            var24 = 16777215L;
                        }
                        field515 = var21;
                        field295.method2334(class137.field2110[var23]);
                        field295.method2349((int) var24);
                    }
                    field295.method2307(field295.field1984 - var20);
                }
                if (field500 > 0) {
                    field500--;
                }
                if (class137.field2097[96] || class137.field2097[97] || class137.field2097[98] || class137.field2097[99]) {
                    field383 = true;
                }
                if (field383 && field500 <= 0) {
                    field500 = 20;
                    field383 = false;
                    field295.method2549(21);
                    field295.method2343(field375);
                    field295.method2341(field376);
                }
                if (Statics.field3137 && !field362) {
                    field362 = true;
                    field295.method2549(43);
                    field295.method2296(1);
                }
                if (!Statics.field3137 && field362) {
                    field362 = false;
                    field295.method2549(43);
                    field295.method2296(0);
                }
                if (Statics.field1963 != field518) {
                    field518 = Statics.field1963;
                    method951(Statics.field1963);
                }
                if (field300 != 30) {
                    return;
                }
                method92();
                int var10002;
                for (int var26 = 0; var26 < field527; var26++) {
                    var10002 = field534[var26]--;
                    if (field534[var26] >= -10) {
                        class59 var28 = field536[var26];
                        if (var28 == null) {
                            class59 var10000 = (class59) null;
                            var28 = class59.method1165(Statics.field218, field532[var26], 0);
                            if (var28 == null) {
                                continue;
                            }
                            field534[var26] += var28.method1171();
                            field536[var26] = var28;
                        }
                        if (field534[var26] < 0) {
                            int var35;
                            if (field321[var26] == 0) {
                                var35 = field571;
                            } else {
                                int var29 = (field321[var26] & 0xFF) * 128;
                                int var30 = field321[var26] >> 16 & 0xFF;
                                int var31 = var30 * 128 + 64 - Statics.field162.field855;
                                if (var31 < 0) {
                                    var31 = -var31;
                                }
                                int var32 = field321[var26] >> 8 & 0xFF;
                                int var33 = var32 * 128 + 64 - Statics.field162.field825;
                                if (var33 < 0) {
                                    var33 = -var33;
                                }
                                int var34 = var31 + var33 - 128;
                                if (var34 > var29) {
                                    field534[var26] = -100;
                                    continue;
                                }
                                if (var34 < 0) {
                                    var34 = 0;
                                }
                                var35 = field530 * (var29 - var34) / var29;
                            }
                            if (var35 > 0) {
                                class63 var36 = var28.method1166().method1201(Statics.field72);
                                class65 var37 = class65.method1228(var36, 100, var35);
                                var37.method1236(field533[var26] - 1);
                                Statics.field31.method1075(var37);
                            }
                            field534[var26] = -100;
                        }
                    } else {
                        field527--;
                        for (int var27 = var26; var27 < field527; var27++) {
                            field532[var27] = field532[var27 + 1];
                            field536[var27] = field536[var27 + 1];
                            field533[var27] = field533[var27 + 1];
                            field534[var27] = field534[var27 + 1];
                            field321[var27] = field321[var27 + 1];
                        }
                        var26--;
                    }
                }
                if (field319) {
                    boolean var38;
                    if (class183.field2946 == 0) {
                        var38 = Statics.field791.method3370();
                    } else {
                        var38 = true;
                    }
                    if (!var38) {
                        if (field526 != 0 && field528 != -1) {
                            class183.method152(Statics.field159, field528, 0, field526, false);
                        }
                        field319 = false;
                    }
                }
                field333++;
                if (field333 > 750) {
                    method170();
                    return;
                }
                method1538();
                for (int var39 = 0; var39 < field329; var39++) {
                    int var40 = field330[var39];
                    class35 var41 = field470[var40];
                    if (var41 != null) {
                        method810(var41, var41.field790.field903);
                    }
                }
                method2911();
                field566++;
                if (field402 != 0) {
                    field389 += 20;
                    if (field389 >= 400) {
                        field402 = 0;
                    }
                }
                if (Statics.field2692 != null) {
                    field403++;
                    if (field403 >= 15) {
                        method645(Statics.field2692);
                        Statics.field2692 = null;
                    }
                }
                class173 var42 = Statics.field272;
                class173 var43 = Statics.field1105;
                Statics.field272 = null;
                Statics.field1105 = null;
                field466 = null;
                field390 = false;
                field467 = false;
                field512 = 0;
                while (class137.method2177() && field512 < 128) {
                    if (field456 >= 2 && class137.field2097[82] && Statics.field1612 == 66) {
                        String var44 = "";
                        Iterator var45 = class12.field167.iterator();
                        while (var45.hasNext()) {
                            class36 var46 = (class36) var45.next();
                            var44 = var44 + var46.field801 + ':' + var46.field798 + '\n';
                        }
                        Statics.field139.setContents(new StringSelection(var44), (ClipboardOwner) null);
                    } else {
                        field514[field512] = Statics.field1612;
                        field417[field512] = Statics.field2000;
                        field512++;
                    }
                }
                if (field517 != -1) {
                    int var49 = field517;
                    int var50 = Statics.field2656;
                    int var51 = Statics.field2160;
                    if (class173.method144(var49)) {
                        method3255(Statics.field2817[var49], -1, 0, 0, var50, var51, 0, 0);
                    }
                }
                field524++;
                while (true) {
                    class1 var52;
                    class173 var53;
                    class173 var54;
                    do {
                        var52 = (class1) field489.method3542();
                        if (var52 == null) {
                            while (true) {
                                class1 var55;
                                class173 var56;
                                class173 var57;
                                do {
                                    var55 = (class1) field490.method3542();
                                    if (var55 == null) {
                                        while (true) {
                                            class1 var58;
                                            class173 var59;
                                            class173 var60;
                                            do {
                                                var58 = (class1) field567.method3542();
                                                if (var58 == null) {
                                                    method545();
                                                    if (field462 != null) {
                                                        method2189();
                                                    }
                                                    if (Statics.field574 != null) {
                                                        method645(Statics.field574);
                                                        field410++;
                                                        if (class140.field2137 == 0) {
                                                            if (!field328) {
                                                                label738: {
                                                                    label525: {
                                                                        if (field429 != 1) {
                                                                            int var67 = field449 - 1;
                                                                            boolean var68;
                                                                            if (var67 < 0) {
                                                                                var68 = false;
                                                                            } else {
                                                                                int var69 = field290[var67];
                                                                                if (var69 >= 2000) {
                                                                                    var69 -= 2000;
                                                                                }
                                                                                if (var69 == 1007) {
                                                                                    var68 = true;
                                                                                } else {
                                                                                    var68 = false;
                                                                                }
                                                                            }
                                                                            if (!var68) {
                                                                                break label525;
                                                                            }
                                                                        }
                                                                        if (field449 > 2) {
                                                                            method2910(field382, field407);
                                                                            break label738;
                                                                        }
                                                                    }
                                                                    if (field449 > 0) {
                                                                        int var70 = field382;
                                                                        int var71 = field407;
                                                                        class31 var72 = Statics.field99;
                                                                        method55(var72.field710, var72.field717, var72.field707, var72.field705, var72.field718, var72.field718, var70, var71);
                                                                        Statics.field99 = null;
                                                                    }
                                                                }
                                                            } else if (Statics.field93 == Statics.field574 && field408 != field405) {
                                                                class173 var61 = Statics.field574;
                                                                byte var62 = 0;
                                                                if (field452 == 1 && var61.field2744 == 206) {
                                                                    var62 = 1;
                                                                }
                                                                if (var61.field2838[field408] <= 0) {
                                                                    var62 = 0;
                                                                }
                                                                if (class178.method3157(method572(var61))) {
                                                                    int var63 = field405;
                                                                    int var64 = field408;
                                                                    var61.field2838[var64] = var61.field2838[var63];
                                                                    var61.field2857[var64] = var61.field2857[var63];
                                                                    var61.field2838[var63] = -1;
                                                                    var61.field2857[var63] = 0;
                                                                } else if (var62 == 1) {
                                                                    int var65 = field405;
                                                                    int var66 = field408;
                                                                    while (var65 != var66) {
                                                                        if (var65 > var66) {
                                                                            var61.method3152(var65 - 1, var65);
                                                                            var65--;
                                                                        } else if (var65 < var66) {
                                                                            var61.method3152(var65 + 1, var65);
                                                                            var65++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var61.method3152(field408, field405);
                                                                }
                                                                field295.method2549(236);
                                                                field295.method2430(var62);
                                                                field295.method2466(field408);
                                                                field295.method2299(Statics.field574.field2740);
                                                                field295.method2343(field405);
                                                            }
                                                            field403 = 10;
                                                            class140.field2138 = 0;
                                                            Statics.field574 = null;
                                                        } else if (field410 >= 5 && (class140.field2143 > field382 + 5 || class140.field2143 < field382 - 5 || class140.field2139 * 869381013 > field407 + 5 || class140.field2139 * 869381013 < field407 - 5)) {
                                                            field328 = true;
                                                        }
                                                    }
                                                    if (class86.field1469 != -1) {
                                                        int var73 = class86.field1469;
                                                        int var74 = class86.field1491;
                                                        field295.method2549(28);
                                                        field295.method2296(5);
                                                        field295.method2296(class137.field2097[82] ? (class137.field2097[81] ? 2 : 1) : 0);
                                                        field295.method2343(Statics.field934 + var74);
                                                        field295.method2466(Statics.field2644 + var73);
                                                        class86.field1469 = -1;
                                                        field399 = class140.field2145;
                                                        field516 = class140.field2136;
                                                        field402 = 1;
                                                        field389 = 0;
                                                        field523 = var73;
                                                        field471 = var74;
                                                    }
                                                    if (Statics.field272 != var42) {
                                                        if (var42 != null) {
                                                            method645(var42);
                                                        }
                                                        if (Statics.field272 != null) {
                                                            method645(Statics.field272);
                                                        }
                                                    }
                                                    if (Statics.field1105 != var43 && field441 == field440) {
                                                        if (var43 != null) {
                                                            method645(var43);
                                                        }
                                                        if (Statics.field1105 != null) {
                                                            method645(Statics.field1105);
                                                        }
                                                    }
                                                    if (Statics.field1105 == null) {
                                                        if (field440 > 0) {
                                                            field440--;
                                                        }
                                                    } else if (field440 < field441) {
                                                        field440++;
                                                        if (field441 == field440) {
                                                            method645(Statics.field1105);
                                                        }
                                                    }
                                                    method746();
                                                    if (field561) {
                                                        method146();
                                                    }
                                                    for (int var75 = 0; var75 < 5; var75++) {
                                                        var10002 = field355[var75]++;
                                                    }
                                                    Statics.field683.method189();
                                                    int var76 = class140.method549();
                                                    int var77 = class137.field2115;
                                                    if (var76 > 15000 && var77 > 15000) {
                                                        field301 = 250;
                                                        class140.method2584(14500);
                                                        field295.method2549(238);
                                                    }
                                                    field350++;
                                                    if (field350 > 500) {
                                                        field350 = 0;
                                                        int var79 = (int) (Math.random() * 8.0D);
                                                        if ((var79 & 0x1) == 1) {
                                                            field354 += field529;
                                                        }
                                                        if ((var79 & 0x2) == 2) {
                                                            field445 += field357;
                                                        }
                                                        if ((var79 & 0x4) == 4) {
                                                            field358 += field488;
                                                        }
                                                    }
                                                    if (field354 < -50) {
                                                        field529 = 2;
                                                    }
                                                    if (field354 > 50) {
                                                        field529 = -2;
                                                    }
                                                    if (field445 < -55) {
                                                        field357 = 2;
                                                    }
                                                    if (field445 > 55) {
                                                        field357 = -2;
                                                    }
                                                    if (field358 < -40) {
                                                        field488 = 1;
                                                    }
                                                    if (field358 > 40) {
                                                        field488 = -1;
                                                    }
                                                    field365++;
                                                    if (field365 > 500) {
                                                        field365 = 0;
                                                        int var80 = (int) (Math.random() * 8.0D);
                                                        if ((var80 & 0x1) == 1) {
                                                            field409 += field381;
                                                        }
                                                        if ((var80 & 0x2) == 2) {
                                                            field363 += field364;
                                                        }
                                                    }
                                                    if (field409 < -60) {
                                                        field381 = 2;
                                                    }
                                                    if (field409 > 60) {
                                                        field381 = -2;
                                                    }
                                                    if (field363 < -20) {
                                                        field364 = 1;
                                                    }
                                                    if (field363 > 10) {
                                                        field364 = -1;
                                                    }
                                                    for (class39 var81 = (class39) field559.method3494(); var81 != null; var81 = (class39) field559.method3488()) {
                                                        if ((long) var81.field889 < class115.method2906() / 1000L - 5L) {
                                                            if (var81.field888 > 0) {
                                                                class12.method930(5, "", var81.field887 + class157.field2455);
                                                            }
                                                            if (var81.field888 == 0) {
                                                                class12.method930(5, "", var81.field887 + class157.field2329);
                                                            }
                                                            var81.method3621();
                                                        }
                                                    }
                                                    field339++;
                                                    if (field339 > 50) {
                                                        field295.method2549(37);
                                                    }
                                                    try {
                                                        if (Statics.field2947 != null && field295.field1984 > 0) {
                                                            Statics.field2947.method2778(field295.field1988, 0, field295.field1984);
                                                            field295.field1984 = 0;
                                                            field339 = 0;
                                                        }
                                                    } catch (IOException var83) {
                                                        method170();
                                                    }
                                                    return;
                                                }
                                                var59 = var58.field3;
                                                if (var59.field2766 < 0) {
                                                    break;
                                                }
                                                var60 = class173.method2988(var59.field2800);
                                            } while (var60 == null || var60.field2759 == null || var59.field2766 >= var60.field2759.length || var60.field2759[var59.field2766] != var59);
                                            class37.method521(var58, 200000);
                                        }
                                    }
                                    var56 = var55.field3;
                                    if (var56.field2766 < 0) {
                                        break;
                                    }
                                    var57 = class173.method2988(var56.field2800);
                                } while (var57 == null || var57.field2759 == null || var56.field2766 >= var57.field2759.length || var57.field2759[var56.field2766] != var56);
                                class37.method521(var55, 200000);
                            }
                        }
                        var53 = var52.field3;
                        if (var53.field2766 < 0) {
                            break;
                        }
                        var54 = class173.method2988(var53.field2800);
                    } while (var54 == null || var54.field2759 == null || var53.field2766 >= var54.field2759.length || var54.field2759[var53.field2766] != var53);
                    class37.method521(var52, 200000);
                }
            }
            field295.method2549(254);
            field295.method2296(0);
            int var3 = field295.field1984;
            class211.method602(field295);
            field295.method2410(field295.field1984 - var3);
        }
    }

    @ObfuscatedName("ag.y(I)V")
    public static final void method833() {
        if (Statics.field2080 != null) {
            Statics.field2080.method1119();
        }
        if (Statics.field1989 != null) {
            Statics.field1989.method1119();
        }
    }

    @ObfuscatedName("ay.t(Lag;IIIB)V")
    public static void method710(class43 arg0, int arg1, int arg2, int arg3) {
        if (field527 >= 50 || field530 == 0 || arg0.field1003 == null || arg1 >= arg0.field1003.length) {
            return;
        }
        int var4 = arg0.field1003[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field532[field527] = var5;
        field533[field527] = var6;
        field534[field527] = 0;
        field536[field527] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field321[field527] = (var8 << 16) + (var9 << 8) + var7;
        field527++;
    }

    @ObfuscatedName("p.q(IIIB)V")
    public static void method100(int arg0, int arg1, int arg2) {
        if (field571 == 0 || arg1 == 0 || field527 >= 50) {
            return;
        }
        field532[field527] = arg0;
        field533[field527] = arg1;
        field534[field527] = arg2;
        field536[field527] = null;
        field321[field527] = 0;
        field527++;
    }

    @ObfuscatedName("da.ap(Lfb;IIB)V")
    public static final void method2228(class173 arg0, int arg1, int arg2) {
        if (field345 != 0 && field345 != 3 || class140.field2138 != 1 && Statics.field1652 || class140.field2138 != 4) {
            return;
        }
        class175 var3 = arg0.method3192(true);
        if (var3 == null) {
            return;
        }
        int var4 = class140.field2145 - arg1;
        int var5 = class140.field2136 - arg2;
        if (!var3.method3196(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2884 / 2;
        int var7 = var5 - var3.field2886 / 2;
        int var8 = field409 + field376 & 0x7FF;
        int var9 = class91.field1558[var8];
        int var10 = class91.field1582[var8];
        int var11 = (field363 + 256) * var9 >> 8;
        int var12 = (field363 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field162.field855 + var13 >> 7;
        int var16 = Statics.field162.field825 - var14 >> 7;
        field295.method2549(219);
        field295.method2296(18);
        field295.method2296(class137.field2097[82] ? (class137.field2097[81] ? 2 : 1) : 0);
        field295.method2343(Statics.field934 + var16);
        field295.method2466(Statics.field2644 + var15);
        field295.method2296(var6);
        field295.method2296(var7);
        field295.method2381(field376);
        field295.method2296(57);
        field295.method2296(field409);
        field295.method2296(field363);
        field295.method2296(89);
        field295.method2381(Statics.field162.field855);
        field295.method2381(Statics.field162.field825);
        field295.method2296(63);
        field523 = var15;
        field471 = var16;
    }

    @ObfuscatedName("ff.al(B)V")
    public static final void method2911() {
        int[] var0 = class33.field761;
        for (int var1 = 0; var1 < class33.field768; var1++) {
            class3 var2 = field412[var0[var1]];
            if (var2 != null && var2.field840 > 0) {
                var2.field840--;
                if (var2.field840 == 0) {
                    var2.field885 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field329; var3++) {
            int var4 = field330[var3];
            class35 var5 = field470[var4];
            if (var5 != null && var5.field840 > 0) {
                var5.field840--;
                if (var5.field840 == 0) {
                    var5.field885 = null;
                }
            }
        }
    }

    @ObfuscatedName("ck.ab(Ljava/lang/String;I)V")
    public static final void method1722(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field187.field150 = !Statics.field187.field150;
            class9.method2088();
            if (Statics.field187.field150) {
                class12.method930(99, "", "Roofs are now all hidden");
            } else {
                class12.method930(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field308 = !field308;
        }
        if (field456 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field308 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field308 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method170();
            }
            if (arg0.equalsIgnoreCase("errortest") && field293 == 2) {
                throw new RuntimeException();
            }
        }
        field295.method2549(109);
        field295.method2296(arg0.length() + 1);
        field295.method2302(arg0);
    }

    @ObfuscatedName("c.at(B)V")
    public static final void method146() {
        int var0 = Statics.field24 * 128 + 64;
        int var1 = Statics.field2234 * 128 + 64;
        int var2 = method601(var0, var1, Statics.field1963) - Statics.field1378;
        if (Statics.field2892 < var0) {
            Statics.field2892 += Statics.field131 * (var0 - Statics.field2892) / 1000 + Statics.field891;
            if (Statics.field2892 > var0) {
                Statics.field2892 = var0;
            }
        }
        if (Statics.field2892 > var0) {
            Statics.field2892 -= Statics.field131 * (Statics.field2892 - var0) / 1000 + Statics.field891;
            if (Statics.field2892 < var0) {
                Statics.field2892 = var0;
            }
        }
        if (Statics.field820 < var2) {
            Statics.field820 += Statics.field131 * (var2 - Statics.field820) / 1000 + Statics.field891;
            if (Statics.field820 > var2) {
                Statics.field820 = var2;
            }
        }
        if (Statics.field820 > var2) {
            Statics.field820 -= Statics.field131 * (Statics.field820 - var2) / 1000 + Statics.field891;
            if (Statics.field820 < var2) {
                Statics.field820 = var2;
            }
        }
        if (Statics.field1890 < var1) {
            Statics.field1890 += Statics.field131 * (var1 - Statics.field1890) / 1000 + Statics.field891;
            if (Statics.field1890 > var1) {
                Statics.field1890 = var1;
            }
        }
        if (Statics.field1890 > var1) {
            Statics.field1890 -= Statics.field131 * (Statics.field1890 - var1) / 1000 + Statics.field891;
            if (Statics.field1890 < var1) {
                Statics.field1890 = var1;
            }
        }
        int var3 = Statics.field1048 * 128 + 64;
        int var4 = Statics.field682 * 128 + 64;
        int var5 = method601(var3, var4, Statics.field1963) - Statics.field1666;
        int var6 = var3 - Statics.field2892;
        int var7 = var5 - Statics.field820;
        int var8 = var4 - Statics.field1890;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field96 < var10) {
            Statics.field96 += Statics.field2882 * (var10 - Statics.field96) / 1000 + Statics.field14;
            if (Statics.field96 > var10) {
                Statics.field96 = var10;
            }
        }
        if (Statics.field96 > var10) {
            Statics.field96 -= Statics.field2882 * (Statics.field96 - var10) / 1000 + Statics.field14;
            if (Statics.field96 < var10) {
                Statics.field96 = var10;
            }
        }
        int var12 = var11 - Statics.field2200;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field2200 += Statics.field2882 * var12 / 1000 + Statics.field14;
            Statics.field2200 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field2200 -= Statics.field2882 * -var12 / 1000 + Statics.field14;
            Statics.field2200 &= 0x7FF;
        }
        int var13 = var11 - Statics.field2200;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field2200 = var11;
        }
    }

    @ObfuscatedName("aj.au(I)V")
    public static final void method746() {
        int var0 = field354 + Statics.field162.field855;
        int var1 = field445 + Statics.field162.field825;
        if (Statics.field580 - var0 < -500 || Statics.field580 - var0 > 500 || Statics.field661 - var1 < -500 || Statics.field661 - var1 > 500) {
            Statics.field580 = var0;
            Statics.field661 = var1;
        }
        if (Statics.field580 != var0) {
            Statics.field580 += (var0 - Statics.field580) / 16;
        }
        if (Statics.field661 != var1) {
            Statics.field661 += (var1 - Statics.field661) / 16;
        }
        if (class140.field2137 == 4 && Statics.field1652) {
            int var2 = class140.field2139 * 869381013 - field380 * 869381013;
            field378 = var2 * 2;
            field380 = (var2 == -1 || var2 == 1 ? class140.field2139 * 869381013 : (field380 * 869381013 + class140.field2139 * 869381013) / 2) * 1473904573;
            int var3 = field379 - class140.field2143;
            field377 = var3 * 2;
            field379 = var3 == -1 || var3 == 1 ? class140.field2143 : (field379 + class140.field2143) / 2;
        } else {
            if (class137.field2097[96]) {
                field377 += (-24 - field377) / 2;
            } else if (class137.field2097[97]) {
                field377 += (24 - field377) / 2;
            } else {
                field377 /= 2;
            }
            if (class137.field2097[98]) {
                field378 += (12 - field378) / 2;
            } else if (class137.field2097[99]) {
                field378 += (-12 - field378) / 2;
            } else {
                field378 /= 2;
            }
            field380 = class140.field2139;
            field379 = class140.field2143;
        }
        field376 = field377 / 2 + field376 & 0x7FF;
        field375 += field378 / 2;
        if (field375 < 128) {
            field375 = 128;
        }
        if (field375 > 383) {
            field375 = 383;
        }
        int var4 = Statics.field580 >> 7;
        int var5 = Statics.field661 >> 7;
        int var6 = method601(Statics.field580, Statics.field661, Statics.field1963);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field1963;
                    if (var10 < 3 && (class6.field98[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field97[var10][var8][var9];
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
        if (var12 > field368) {
            field368 += (var12 - field368) / 24;
        } else if (var12 < field368) {
            field368 += (var12 - field368) / 80;
        }
    }

    @ObfuscatedName("bv.ae(I)V")
    public static final void method1538() {
        int var0 = class33.field768;
        int[] var1 = class33.field761;
        for (int var2 = 0; var2 < var0; var2++) {
            class3 var3 = field412[var1[var2]];
            if (var3 != null) {
                method810(var3, 1);
            }
        }
    }

    @ObfuscatedName("ag.ax(Lai;IB)V")
    public static final void method810(class38 arg0, int arg1) {
        if (arg0.field869 > field302) {
            int var2 = arg0.field869 - field302;
            int var3 = arg0.field865 * 128 + arg0.field828 * 64;
            int var4 = arg0.field833 * 128 + arg0.field828 * 64;
            arg0.field855 += (var3 - arg0.field855) / var2;
            arg0.field825 += (var4 - arg0.field825) / var2;
            arg0.field881 = 0;
            arg0.field874 = arg0.field862;
        } else if (arg0.field870 >= field302) {
            if (field302 == arg0.field870 || arg0.field839 == -1 || arg0.field858 != 0 || arg0.field863 + 1 > class43.method3831(arg0.field839).field1010[arg0.field856]) {
                int var5 = arg0.field870 - arg0.field869;
                int var6 = field302 - arg0.field869;
                int var7 = arg0.field865 * 128 + arg0.field828 * 64;
                int var8 = arg0.field833 * 128 + arg0.field828 * 64;
                int var9 = arg0.field866 * 128 + arg0.field828 * 64;
                int var10 = arg0.field868 * 128 + arg0.field828 * 64;
                arg0.field855 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field825 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field881 = 0;
            arg0.field874 = arg0.field862;
            arg0.field826 = arg0.field874;
        } else {
            arg0.field832 = arg0.field829;
            if (arg0.field882 == 0) {
                arg0.field881 = 0;
            } else {
                label321: {
                    if (arg0.field839 != -1 && arg0.field858 == 0) {
                        class43 var11 = class43.method3831(arg0.field839);
                        if (arg0.field851 > 0 && var11.field1011 == 0) {
                            arg0.field881++;
                            break label321;
                        }
                        if (arg0.field851 <= 0 && var11.field1013 == 0) {
                            arg0.field881++;
                            break label321;
                        }
                    }
                    int var12 = arg0.field855;
                    int var13 = arg0.field825;
                    int var14 = arg0.field878[arg0.field882 - 1] * 128 + arg0.field828 * 64;
                    int var15 = arg0.field879[arg0.field882 - 1] * 128 + arg0.field828 * 64;
                    if (var12 < var14) {
                        if (var13 < var15) {
                            arg0.field874 = 1280;
                        } else if (var13 > var15) {
                            arg0.field874 = 1792;
                        } else {
                            arg0.field874 = 1536;
                        }
                    } else if (var12 > var14) {
                        if (var13 < var15) {
                            arg0.field874 = 768;
                        } else if (var13 > var15) {
                            arg0.field874 = 256;
                        } else {
                            arg0.field874 = 512;
                        }
                    } else if (var13 < var15) {
                        arg0.field874 = 1024;
                    } else if (var13 > var15) {
                        arg0.field874 = 0;
                    }
                    byte var16 = arg0.field880[arg0.field882 - 1];
                    if (var14 - var12 <= 256 && var14 - var12 >= -256 && var15 - var13 <= 256 && var15 - var13 >= -256) {
                        int var17 = arg0.field874 - arg0.field826 & 0x7FF;
                        if (var17 > 1024) {
                            var17 -= 2048;
                        }
                        int var18 = arg0.field876;
                        if (var17 >= -256 && var17 <= 256) {
                            var18 = arg0.field857;
                        } else if (var17 >= 256 && var17 < 768) {
                            var18 = arg0.field835;
                        } else if (var17 >= -768 && var17 <= -256) {
                            var18 = arg0.field883;
                        }
                        if (var18 == -1) {
                            var18 = arg0.field857;
                        }
                        arg0.field832 = var18;
                        int var19 = 4;
                        boolean var20 = true;
                        if (arg0 instanceof class35) {
                            var20 = ((class35) arg0).field790.field931;
                        }
                        if (var20) {
                            if (arg0.field874 != arg0.field826 && arg0.field849 == -1 && arg0.field884 != 0) {
                                var19 = 2;
                            }
                            if (arg0.field882 > 2) {
                                var19 = 6;
                            }
                            if (arg0.field882 > 3) {
                                var19 = 8;
                            }
                            if (arg0.field881 > 0 && arg0.field882 > 1) {
                                var19 = 8;
                                arg0.field881--;
                            }
                        } else {
                            if (arg0.field882 > 1) {
                                var19 = 6;
                            }
                            if (arg0.field882 > 2) {
                                var19 = 8;
                            }
                            if (arg0.field881 > 0 && arg0.field882 > 1) {
                                var19 = 8;
                                arg0.field881--;
                            }
                        }
                        if (var16 == 2) {
                            var19 <<= 0x1;
                        }
                        if (var19 >= 8 && arg0.field857 == arg0.field832 && arg0.field867 != -1) {
                            arg0.field832 = arg0.field867;
                        }
                        if (var12 != var14 || var13 != var15) {
                            if (var12 < var14) {
                                arg0.field855 += var19;
                                if (arg0.field855 > var14) {
                                    arg0.field855 = var14;
                                }
                            } else if (var12 > var14) {
                                arg0.field855 -= var19;
                                if (arg0.field855 < var14) {
                                    arg0.field855 = var14;
                                }
                            }
                            if (var13 < var15) {
                                arg0.field825 += var19;
                                if (arg0.field825 > var15) {
                                    arg0.field825 = var15;
                                }
                            } else if (var13 > var15) {
                                arg0.field825 -= var19;
                                if (arg0.field825 < var15) {
                                    arg0.field825 = var15;
                                }
                            }
                        }
                        if (arg0.field855 == var14 && arg0.field825 == var15) {
                            arg0.field882--;
                            if (arg0.field851 > 0) {
                                arg0.field851--;
                            }
                        }
                    } else {
                        arg0.field855 = var14;
                        arg0.field825 = var15;
                        arg0.field882--;
                        if (arg0.field851 > 0) {
                            arg0.field851--;
                        }
                    }
                }
            }
        }
        if (arg0.field855 < 128 || arg0.field825 < 128 || arg0.field855 >= 13184 || arg0.field825 >= 13184) {
            arg0.field839 = -1;
            arg0.field852 = -1;
            arg0.field869 = 0;
            arg0.field870 = 0;
            arg0.field855 = arg0.field878[0] * 128 + arg0.field828 * 64;
            arg0.field825 = arg0.field879[0] * 128 + arg0.field828 * 64;
            arg0.method698();
        }
        if (Statics.field162 == arg0 && (arg0.field855 < 1536 || arg0.field825 < 1536 || arg0.field855 >= 11776 || arg0.field825 >= 11776)) {
            arg0.field839 = -1;
            arg0.field852 = -1;
            arg0.field869 = 0;
            arg0.field870 = 0;
            arg0.field855 = arg0.field878[0] * 128 + arg0.field828 * 64;
            arg0.field825 = arg0.field879[0] * 128 + arg0.field828 * 64;
            arg0.method698();
        }
        if (arg0.field884 != 0) {
            if (arg0.field849 != -1) {
                class38 var21 = null;
                if (arg0.field849 < 32768) {
                    var21 = field470[arg0.field849];
                } else if (arg0.field849 >= 32768) {
                    var21 = field412[arg0.field849 - 32768];
                }
                if (var21 != null) {
                    int var22 = arg0.field855 - var21.field855;
                    int var23 = arg0.field825 - var21.field825;
                    if (var22 != 0 || var23 != 0) {
                        arg0.field874 = (int) (Math.atan2((double) var22, (double) var23) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field850) {
                    arg0.field849 = -1;
                    arg0.field850 = false;
                }
            }
            if (arg0.field830 != -1 && (arg0.field882 == 0 || arg0.field881 > 0)) {
                arg0.field874 = arg0.field830;
                arg0.field830 = -1;
            }
            int var24 = arg0.field874 - arg0.field826 & 0x7FF;
            if (var24 == 0 && arg0.field850) {
                arg0.field849 = -1;
                arg0.field850 = false;
            }
            if (var24 == 0) {
                arg0.field875 = 0;
            } else {
                arg0.field875++;
                if (var24 > 1024) {
                    arg0.field826 -= arg0.field884;
                    boolean var25 = true;
                    if (var24 < arg0.field884 || var24 > 2048 - arg0.field884) {
                        arg0.field826 = arg0.field874;
                        var25 = false;
                    }
                    if (arg0.field832 == arg0.field829 && (arg0.field875 > 25 || var25)) {
                        if (arg0.field827 == -1) {
                            arg0.field832 = arg0.field857;
                        } else {
                            arg0.field832 = arg0.field827;
                        }
                    }
                } else {
                    arg0.field826 += arg0.field884;
                    boolean var26 = true;
                    if (var24 < arg0.field884 || var24 > 2048 - arg0.field884) {
                        arg0.field826 = arg0.field874;
                        var26 = false;
                    }
                    if (arg0.field832 == arg0.field829 && (arg0.field875 > 25 || var26)) {
                        if (arg0.field831 == -1) {
                            arg0.field832 = arg0.field857;
                        } else {
                            arg0.field832 = arg0.field831;
                        }
                    }
                }
                arg0.field826 &= 0x7FF;
            }
        }
        method686(arg0);
    }

    @ObfuscatedName("az.aq(Lai;B)V")
    public static final void method686(class38 arg0) {
        arg0.field860 = false;
        if (arg0.field832 != -1) {
            class43 var1 = class43.method3831(arg0.field832);
            if (var1 == null || var1.field1000 == null) {
                arg0.field832 = -1;
            } else {
                arg0.field854++;
                if (arg0.field853 < var1.field1000.length && arg0.field854 > var1.field1010[arg0.field853]) {
                    arg0.field854 = 1;
                    arg0.field853++;
                    method710(var1, arg0.field853, arg0.field855, arg0.field825);
                }
                if (arg0.field853 >= var1.field1000.length) {
                    arg0.field854 = 0;
                    arg0.field853 = 0;
                    method710(var1, arg0.field853, arg0.field855, arg0.field825);
                }
            }
        }
        if (arg0.field852 != -1 && field302 >= arg0.field836) {
            if (arg0.field861 < 0) {
                arg0.field861 = 0;
            }
            int var2 = class44.method769(arg0.field852).field1027;
            if (var2 == -1) {
                arg0.field852 = -1;
            } else {
                class43 var3 = class43.method3831(var2);
                if (var3 == null || var3.field1000 == null) {
                    arg0.field852 = -1;
                } else {
                    arg0.field845++;
                    if (arg0.field861 < var3.field1000.length && arg0.field845 > var3.field1010[arg0.field861]) {
                        arg0.field845 = 1;
                        arg0.field861++;
                        method710(var3, arg0.field861, arg0.field855, arg0.field825);
                    }
                    if (arg0.field861 >= var3.field1000.length && (arg0.field861 < 0 || arg0.field861 >= var3.field1000.length)) {
                        arg0.field852 = -1;
                    }
                }
            }
        }
        if (arg0.field839 != -1 && arg0.field858 <= 1) {
            class43 var4 = class43.method3831(arg0.field839);
            if (var4.field1011 == 1 && arg0.field851 > 0 && arg0.field869 <= field302 && arg0.field870 < field302) {
                arg0.field858 = 1;
                return;
            }
        }
        if (arg0.field839 != -1 && arg0.field858 == 0) {
            class43 var5 = class43.method3831(arg0.field839);
            if (var5 == null || var5.field1000 == null) {
                arg0.field839 = -1;
            } else {
                arg0.field863++;
                if (arg0.field856 < var5.field1000.length && arg0.field863 > var5.field1010[arg0.field856]) {
                    arg0.field863 = 1;
                    arg0.field856++;
                    method710(var5, arg0.field856, arg0.field855, arg0.field825);
                }
                if (arg0.field856 >= var5.field1000.length) {
                    arg0.field856 -= var5.field1015;
                    arg0.field859++;
                    if (arg0.field859 >= var5.field1012) {
                        arg0.field839 = -1;
                    } else if (arg0.field856 >= 0 && arg0.field856 < var5.field1000.length) {
                        method710(var5, arg0.field856, arg0.field855, arg0.field825);
                    } else {
                        arg0.field839 = -1;
                    }
                }
                arg0.field860 = var5.field1006;
            }
        }
        if (arg0.field858 > 0) {
            arg0.field858--;
        }
    }

    @ObfuscatedName("x.az(Lf;III)V")
    public static void method168(class3 arg0, int arg1, int arg2) {
        if (arg0.field839 == arg1 && arg1 != -1) {
            int var3 = class43.method3831(arg1).field1004;
            if (var3 == 1) {
                arg0.field856 = 0;
                arg0.field863 = 0;
                arg0.field858 = arg2;
                arg0.field859 = 0;
            }
            if (var3 == 2) {
                arg0.field859 = 0;
            }
        } else if (arg1 == -1 || arg0.field839 == -1 || class43.method3831(arg1).field1007 >= class43.method3831(arg0.field839).field1007) {
            arg0.field839 = arg1;
            arg0.field856 = 0;
            arg0.field863 = 0;
            arg0.field858 = arg2;
            arg0.field859 = 0;
            arg0.field851 = arg0.field882;
        }
    }

    @ObfuscatedName("d.ac(II)V")
    public static void method121(int arg0) {
        field502 = 0L;
        if (arg0 >= 2) {
            field503 = true;
        } else {
            field503 = false;
        }
        method2731();
        if (field300 >= 25) {
            field295.method2549(93);
            class122 var1 = field295;
            int var2 = field503 ? 2 : 1;
            var1.method2296(var2);
            field295.method2381(Statics.field2656);
            field295.method2381(Statics.field2160);
        }
        field2193 = true;
    }

    @ObfuscatedName("u.ai(I)V")
    public static void method535() {
        class137.method2619(Statics.field773);
        class140.method89(Statics.field773);
        if (Statics.field240 != null) {
            Statics.field240.method2624(Statics.field773);
        }
        Statics.field289.method2829();
        Statics.field773.setBackground(Color.black);
        class137.method2605(Statics.field773);
        Canvas var0 = Statics.field773;
        var0.addMouseListener(class140.field2153);
        var0.addMouseMotionListener(class140.field2153);
        var0.addFocusListener(class140.field2153);
        if (Statics.field240 != null) {
            Statics.field240.method2631(Statics.field773);
        }
        if (field517 != -1) {
            int var1 = field517;
            int var2 = Statics.field2656;
            int var3 = Statics.field2160;
            if (class173.method144(var1)) {
                method1537(Statics.field2817[var1], -1, var2, var3, false);
            }
        }
        field2188 = true;
    }

    @ObfuscatedName("eh.ay(B)V")
    public static void method2731() {
        client var0 = Statics.field289;
        synchronized (Statics.field289) {
            Container var1 = Statics.field289.method2807();
            if (var1 != null) {
                Statics.field1973 = Math.max(var1.getSize().width, Statics.field1960);
                Statics.field890 = Math.max(var1.getSize().height, Statics.field203);
                if (Statics.field786 == var1) {
                    Insets var2 = Statics.field786.getInsets();
                    Statics.field1973 -= var2.right + var2.left;
                    Statics.field890 -= var2.top + var2.bottom;
                }
                if (Statics.field1973 <= 0) {
                    Statics.field1973 = 1;
                }
                if (Statics.field890 <= 0) {
                    Statics.field890 = 1;
                }
                int var3 = field503 ? 2 : 1;
                if (var3 == 1) {
                    Statics.field2656 = field337;
                    Statics.field2160 = field320;
                } else {
                    Statics.field2656 = Math.min(Statics.field1973, 7680);
                    Statics.field2160 = Math.min(Statics.field890, 2160);
                }
                field2202 = (Statics.field1973 - Statics.field2656) / 2;
                field2192 = 0;
                Statics.field773.setSize(Statics.field2656, Statics.field2160);
                Statics.field2029 = Statics.method548(Statics.field2656, Statics.field2160, Statics.field773);
                if (Statics.field786 == var1) {
                    Insets var4 = Statics.field786.getInsets();
                    Statics.field773.setLocation(field2202 + var4.left, field2192 + var4.top);
                } else {
                    Statics.field773.setLocation(field2202, field2192);
                }
                method122();
                if (field517 != -1) {
                    int var5 = field517;
                    int var6 = Statics.field2656;
                    int var7 = Statics.field2160;
                    if (class173.method144(var5)) {
                        method1537(Statics.field2817[var5], -1, var6, var7, true);
                    }
                }
                method44();
            }
        }
    }

    @ObfuscatedName("d.aj(B)V")
    public static void method122() {
        int var0 = Statics.field2656;
        int var1 = Statics.field2160;
        if (Statics.field1973 < var0) {
            int var2 = Statics.field1973;
        }
        if (Statics.field890 < var1) {
            int var3 = Statics.field890;
        }
        if (Statics.field187 == null) {
            return;
        }
        try {
            client var4 = Statics.field289;
            int var5 = field503 ? 2 : 1;
            Object[] var6 = new Object[] { var5 };
            JSObject.getWindow(var4).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("f.af(I)V")
    public static void method44() {
        int var0 = field2202;
        int var1 = field2192;
        int var2 = Statics.field1973 - Statics.field2656 - var0;
        int var3 = Statics.field890 - Statics.field2160 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field289.method2807();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field786 == var4) {
                Insets var7 = Statics.field786.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field890);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field1973, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field1973 + var5 - var2, var6, var2, Statics.field890);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field890 + var6 - var3, Statics.field1973, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("bq.ar(S)V")
    public static final void method1474() {
        if (field517 != -1) {
            int var0 = field517;
            if (class173.method144(var0)) {
                method88(Statics.field2817[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field492; var1++) {
            if (field494[var1]) {
                field557[var1] = true;
            }
            field496[var1] = field494[var1];
            field494[var1] = false;
        }
        field493 = field302;
        field438 = -1;
        field439 = -1;
        Statics.field93 = null;
        if (field517 != -1) {
            field492 = 0;
            int var2 = field517;
            int var3 = Statics.field2656;
            int var4 = Statics.field2160;
            if (class173.method144(var2)) {
                Statics.field2896 = null;
                method2008(Statics.field2817[var2], -1, 0, 0, var3, var4, 0, 0, -1);
                if (Statics.field2896 != null) {
                    method2008(Statics.field2896, -1412584499, 0, 0, var3, var4, Statics.field1371, Statics.field188, -1);
                    Statics.field2896 = null;
                }
            } else {
                for (int var5 = 0; var5 < 100; var5++) {
                    field494[var5] = true;
                }
            }
        }
        class80.method1631();
        if (field525) {
            method745();
        } else if (field438 != -1) {
            method859(field438, field439);
        }
        if (field501 == 3) {
            for (int var6 = 0; var6 < field492; var6++) {
                if (field496[var6]) {
                    class80.method1637(field497[var6], field340[var6], field499[var6], field531[var6], 16711935, 128);
                } else if (field557[var6]) {
                    class80.method1637(field497[var6], field340[var6], field499[var6], field531[var6], 16711680, 128);
                }
            }
        }
        int var7 = Statics.field1963;
        int var8 = Statics.field162.field855;
        int var9 = Statics.field162.field825;
        int var10 = field566;
        for (class24 var11 = (class24) class24.field607.method3535(); var11 != null; var11 = (class24) class24.field607.method3537()) {
            if (var11.field609 != -1 || var11.field613 != null) {
                int var12 = 0;
                if (var8 > var11.field610) {
                    var12 += var8 - var11.field610;
                } else if (var8 < var11.field604) {
                    var12 += var11.field604 - var8;
                }
                if (var9 > var11.field616) {
                    var12 += var9 - var11.field616;
                } else if (var9 < var11.field614) {
                    var12 += var11.field614 - var9;
                }
                if (var12 - 64 > var11.field608 || field530 == 0 || var11.field602 != var7) {
                    if (var11.field603 != null) {
                        Statics.field31.method1076(var11.field603);
                        var11.field603 = null;
                    }
                    if (var11.field615 != null) {
                        Statics.field31.method1076(var11.field615);
                        var11.field615 = null;
                    }
                } else {
                    var12 -= 64;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    int var13 = field530 * (var11.field608 - var12) / var11.field608;
                    class59 var10000;
                    if (var11.field603 != null) {
                        var11.field603.method1232(var13);
                    } else if (var11.field609 >= 0) {
                        var10000 = (class59) null;
                        class59 var14 = class59.method1165(Statics.field218, var11.field609, 0);
                        if (var14 != null) {
                            class63 var15 = var14.method1166().method1201(Statics.field72);
                            class65 var16 = class65.method1228(var15, 100, var13);
                            var16.method1236(-1);
                            Statics.field31.method1075(var16);
                            var11.field603 = var16;
                        }
                    }
                    if (var11.field615 != null) {
                        var11.field615.method1232(var13);
                        if (!var11.field615.method3625()) {
                            var11.field615 = null;
                        }
                    } else if (var11.field613 != null && (var11.field606 -= var10) <= 0) {
                        int var17 = (int) (Math.random() * (double) var11.field613.length);
                        var10000 = (class59) null;
                        class59 var18 = class59.method1165(Statics.field218, var11.field613[var17], 0);
                        if (var18 != null) {
                            class63 var19 = var18.method1166().method1201(Statics.field72);
                            class65 var20 = class65.method1228(var19, 100, var13);
                            var20.method1236(0);
                            Statics.field31.method1075(var20);
                            var11.field615 = var20;
                            var11.field606 = var11.field611 + (int) (Math.random() * (double) (var11.field612 - var11.field611));
                        }
                    }
                }
            }
        }
        field566 = 0;
    }

    @ObfuscatedName("q.ag(Ljava/lang/String;ZI)V")
    public static final void method578(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1363.method3722(arg0, 250);
        int var6 = Statics.field1363.method3723(arg0, 250) * 13;
        class80.method1638(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1688(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1363.method3772(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2990(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field773.getGraphics();
                Statics.field2029.method1477(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field773.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field492; var13++) {
            if (field499[var13] + field497[var13] > var9 && field497[var13] < var9 + var11 && field531[var13] + field340[var13] > var10 && field340[var13] < var10 + var12) {
                field557[var13] = true;
            }
        }
    }

    @ObfuscatedName("al.am(IIIIZI)V")
    public static final void method603(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field544 - field413) * var5 / 100 + field413;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field549) {
            short var8 = field549;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field548) {
                var6 = field548;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1631();
                    class80.method1638(arg0, arg1, var10, arg3, -16777216);
                    class80.method1638(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field550) {
            short var11 = field550;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field547) {
                var6 = field547;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1631();
                    class80.method1638(arg0, arg1, arg2, var13, -16777216);
                    class80.method1638(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field546 - field545) * var5 / 100 + field545;
        field562 = arg3 * var6 * var14 / 85504 << 1;
        if (field451 != arg2 || field554 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class91.field1558[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class86.method1763(var15, 500, 800, arg2, arg3);
        }
        field297 = arg0;
        field552 = arg1;
        field451 = arg2;
        field554 = arg3;
    }

    @ObfuscatedName("r.aa(Lax;B)V")
    public static final void method104(class34 arg0) {
        if (Statics.field162.field855 >> 7 == field523 && Statics.field162.field825 >> 7 == field471) {
            field523 = 0;
        }
        int var1 = class33.field768;
        int[] var2 = class33.field761;
        int var3 = var1;
        if (class34.field785 == arg0 || class34.field776 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field785 == arg0) {
                var5 = Statics.field162;
                var6 = Statics.field162.field56 << 14;
            } else if (class34.field776 == arg0) {
                var5 = field412[field422];
                var6 = field422 << 14;
            } else {
                var5 = field412[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field779 == arg0 && field422 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method20() && !var5.field54) {
                var5.field42 = false;
                if ((field353 && var1 > 50 || var1 > 200) && class34.field785 != arg0 && var5.field832 == var5.field829) {
                    var5.field42 = true;
                }
                int var7 = var5.field855 >> 7;
                int var8 = var5.field825 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field49 == null || field302 < var5.field36 || field302 >= var5.field43) {
                        if ((var5.field855 & 0x7F) == 64 && (var5.field825 & 0x7F) == 64) {
                            if (field551 == field395[var7][var8]) {
                                continue;
                            }
                            field395[var7][var8] = field551;
                        }
                        var5.field52 = method601(var5.field855, var5.field825, Statics.field1963);
                        Statics.field841.method1739(Statics.field1963, var5.field855, var5.field825, var5.field52, 60, var5, var5.field826, var6, var5.field860);
                    } else {
                        var5.field42 = false;
                        var5.field52 = method601(var5.field855, var5.field825, Statics.field1963);
                        Statics.field841.method1774(Statics.field1963, var5.field855, var5.field825, var5.field52, 60, var5, var5.field826, var6, var5.field48, var5.field39, var5.field60, var5.field37);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ej.aw(ZI)V")
    public static final void method2908(boolean arg0) {
        for (int var1 = 0; var1 < field329; var1++) {
            class35 var2 = field470[field330[var1]];
            int var3 = (field330[var1] << 14) + 536870912;
            if (var2 != null && var2.method20() && var2.field790.field922 == arg0 && var2.field790.method720()) {
                int var4 = var2.field855 >> 7;
                int var5 = var2.field825 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field828 == 1 && (var2.field855 & 0x7F) == 64 && (var2.field825 & 0x7F) == 64) {
                        if (field551 == field395[var4][var5]) {
                            continue;
                        }
                        field395[var4][var5] = field551;
                    }
                    if (!var2.field790.field930) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field841.method1739(Statics.field1963, var2.field855, var2.field825, method601(var2.field855 + (var2.field828 * 64 - 64), var2.field825 + (var2.field828 * 64 - 64), Statics.field1963), var2.field828 * 64 - 64 + 60, var2, var2.field826, var3, var2.field860);
                }
            }
        }
    }

    @ObfuscatedName("v.an(I)I")
    public static final int method10() {
        if (Statics.field187.field150) {
            return Statics.field1963;
        } else {
            int var0 = method601(Statics.field2892, Statics.field1890, Statics.field1963);
            return var0 - Statics.field820 >= 800 || (class6.field98[Statics.field1963][Statics.field2892 >> 7][Statics.field1890 >> 7] & 0x4) == 0 ? 3 : Statics.field1963;
        }
    }

    @ObfuscatedName("dr.as(Lai;IIIIIB)V")
    public static final void method2615(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method20()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field790;
            if (var6.field927 != null) {
                var6 = var6.method722();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class33.field768;
        int[] var8 = class33.field761;
        if (arg1 < var7) {
            int var9 = 30;
            class3 var10 = (class3) arg0;
            if (var10.field54) {
                return;
            }
            if (var10.field47 != -1 || var10.field38 != -1) {
                method2622(arg0, arg0.field873 + 15);
                if (field553 > -1) {
                    if (var10.field47 != -1) {
                        Statics.field2154[var10.field47].method1554(field553 + arg2 - 12, field398 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field38 != -1) {
                        Statics.field1526[var10.field38].method1554(field553 + arg2 - 12, field398 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field310 == 10 && field312 == var8[arg1]) {
                method2622(arg0, arg0.field873 + 15);
                if (field553 > -1) {
                    Statics.field3186[1].method1554(field553 + arg2 - 12, field398 + arg3 - var9);
                }
            }
        } else {
            class40 var11 = ((class35) arg0).field790;
            if (var11.field927 != null) {
                var11 = var11.method722();
            }
            if (var11.field925 >= 0 && var11.field925 < Statics.field1526.length) {
                method2622(arg0, arg0.field873 + 15);
                if (field553 > -1) {
                    Statics.field1526[var11.field925].method1554(field553 + arg2 - 12, field398 + arg3 - 30);
                }
            }
            if (field310 == 1 && field311 == field330[arg1 - var7] && field302 % 20 < 10) {
                method2622(arg0, arg0.field873 + 15);
                if (field553 > -1) {
                    Statics.field3186[0].method1554(field553 + arg2 - 12, field398 + arg3 - 28);
                }
            }
        }
        if (arg0.field885 != null && (arg1 >= var7 || !arg0.field837 && (field507 == 4 || !arg0.field838 && (field507 == 0 || field507 == 3 || field507 == 1 && method185(((class3) arg0).field51, false))))) {
            method2622(arg0, arg0.field873);
            if (field553 > -1 && field385 < field386) {
                field495[field385] = Statics.field1093.method3794(arg0.field885) / 2;
                field485[field385] = Statics.field1093.field3170;
                field387[field385] = field553;
                field348[field385] = field398;
                field391[field385] = arg0.field871;
                field392[field385] = arg0.field842;
                field393[field385] = arg0.field840;
                field394[field385] = arg0.field885;
                field385++;
            }
        }
        if (arg0.field846 > field302) {
            method2622(arg0, arg0.field873 + 15);
            if (field553 > -1) {
                int var12;
                if (arg1 < var7) {
                    var12 = 30;
                } else {
                    class40 var13 = ((class35) arg0).field790;
                    var12 = var13.field933;
                }
                int var14 = arg0.field847 * var12 / arg0.field877;
                if (var14 > var12) {
                    var14 = var12;
                } else if (var14 == 0 && arg0.field847 > 0) {
                    var14 = 1;
                }
                class80.method1638(field553 + arg2 - var12 / 2, field398 + arg3 - 3, var14, 5, 65280);
                class80.method1638(field553 + arg2 - var12 / 2 + var14, field398 + arg3 - 3, var12 - var14, 5, 16711680);
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            if (arg0.field848[var15] > field302) {
                method2622(arg0, arg0.field873 / 2);
                if (field553 > -1) {
                    if (var15 == 1) {
                        field398 -= 20;
                    }
                    if (var15 == 2) {
                        field553 -= 15;
                        field398 -= 10;
                    }
                    if (var15 == 3) {
                        field553 += 15;
                        field398 -= 10;
                    }
                    Statics.field1889[arg0.field844[var15]].method1554(field553 + arg2 - 12, field398 + arg3 - 12);
                    Statics.field1557.method3726(Integer.toString(arg0.field843[var15]), field553 + arg2 - 1, field398 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("dx.av(Lai;II)V")
    public static final void method2622(class38 arg0, int arg1) {
        method106(arg0.field855, arg0.field825, arg1);
    }

    @ObfuscatedName("r.ao(IIII)V")
    public static final void method106(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field553 = -1;
            field398 = -1;
            return;
        }
        int var3 = method601(arg0, arg1, Statics.field1963) - arg2;
        int var4 = arg0 - Statics.field2892;
        int var5 = var3 - Statics.field820;
        int var6 = arg1 - Statics.field1890;
        int var7 = class91.field1558[Statics.field96];
        int var8 = class91.field1582[Statics.field96];
        int var9 = class91.field1558[Statics.field2200];
        int var10 = class91.field1582[Statics.field2200];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field553 = field562 * var11 / var15 + field451 / 2;
            field398 = field562 * var14 / var15 + field554 / 2;
        } else {
            field553 = -1;
            field398 = -1;
        }
    }

    @ObfuscatedName("ap.ad(IIII)I")
    public static final int method601(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field98[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field97[var5][var3][var4] + class6.field97[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field97[var5][var3][var4 + 1] + class6.field97[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ak.bi(IIIIIII)V")
    public static final void method583(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class91.field1558[var6];
            int var12 = class91.field1582[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class91.field1558[var7];
            int var15 = class91.field1582[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field2892 = arg0 - var8;
        Statics.field820 = arg1 - var9;
        Statics.field1890 = arg2 - var10;
        Statics.field96 = arg3;
        Statics.field2200 = arg4;
    }

    @ObfuscatedName("h.bb(ZI)V")
    public static final void method47(boolean arg0) {
        field361 = arg0;
        if (!field361) {
            int var1 = field335.method2396();
            int var2 = field335.method2312();
            int var3 = field335.method2312();
            Statics.field675 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field675[var4][var5] = field335.method2315();
                }
            }
            Statics.field148 = new int[var3];
            Statics.field128 = new int[var3];
            Statics.field2711 = new int[var3];
            Statics.field9 = new byte[var3][];
            Statics.field1990 = new byte[var3][];
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
                        Statics.field148[var7] = var10;
                        Statics.field128[var7] = Statics.field998.method3033("m" + var8 + "_" + var9);
                        Statics.field2711[var7] = Statics.field998.method3033("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method607(var2, var1);
            return;
        }
        int var11 = field335.method2312();
        int var12 = field335.method2344();
        int var13 = field335.method2312();
        field335.method2551();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field335.method2567(1);
                    if (var17 == 1) {
                        field366[var14][var15][var16] = field335.method2567(26);
                    } else {
                        field366[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field335.method2552();
        Statics.field675 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field675[var18][var19] = field335.method2315();
            }
        }
        Statics.field148 = new int[var13];
        Statics.field128 = new int[var13];
        Statics.field2711 = new int[var13];
        Statics.field9 = new byte[var13][];
        Statics.field1990 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field366[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field148[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field148[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field128[var20] = Statics.field998.method3033("m" + var29 + "_" + var30);
                            Statics.field2711[var20] = Statics.field998.method3033("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method607(var11, var12);
    }

    @ObfuscatedName("ab.bp(IIB)V")
    public static final void method607(int arg0, int arg1) {
        if (Statics.field579 == arg0 && Statics.field20 == arg1) {
            return;
        }
        Statics.field579 = arg0;
        Statics.field20 = arg1;
        method605(25);
        method578(class157.field2317, true);
        int var2 = Statics.field2644;
        int var3 = Statics.field934;
        Statics.field2644 = (arg0 - 6) * 8;
        Statics.field934 = (arg1 - 6) * 8;
        int var4 = Statics.field2644 - var2;
        int var5 = Statics.field934 - var3;
        int var6 = Statics.field2644;
        int var7 = Statics.field934;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field470[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field878[var10] -= var4;
                    var9.field879[var10] -= var5;
                }
                var9.field855 -= var4 * 128;
                var9.field825 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field412[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field878[var13] -= var4;
                    var12.field879[var13] -= var5;
                }
                var12.field855 -= var4 * 128;
                var12.field825 -= var5 * 128;
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
                        field437[var24][var20][var21] = field437[var24][var22][var23];
                    } else {
                        field437[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field423.method3535(); var25 != null; var25 = (class17) field423.method3537()) {
            var25.field226 -= var4;
            var25.field244 -= var5;
            if (var25.field226 < 0 || var25.field244 < 0 || var25.field226 >= 104 || var25.field244 >= 104) {
                var25.method3624();
            }
        }
        if (field523 != 0) {
            field523 -= var4;
            field471 -= var5;
        }
        field527 = 0;
        field561 = false;
        field518 = -1;
        field425.method3560();
        field424.method3560();
        for (int var26 = 0; var26 < 4; var26++) {
            field537[var26].method2187();
        }
    }

    @ObfuscatedName("i.bd(ZB)V")
    public static final void method2(boolean arg0) {
        method833();
        field339++;
        if (field339 < 50 && !arg0) {
            return;
        }
        field339 = 0;
        if (field344 || Statics.field2947 == null) {
            return;
        }
        field295.method2549(37);
        try {
            Statics.field2947.method2778(field295.field1988, 0, field295.field1984);
            field295.field1984 = 0;
        } catch (IOException var2) {
            field344 = true;
        }
    }

    @ObfuscatedName("av.by(II)V")
    public static final void method951(int arg0) {
        int[] var1 = Statics.field680.field1401;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field98[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field841.method1762(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field98[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field841.method1762(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field680.method1591();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field98[arg0][var10][var9] & 0x18) == 0) {
                    method2796(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field98[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method2796(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field558 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field841.method1757(Statics.field1963, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class41.method1443(var14).field974;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field537[Statics.field1963].field1888;
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
                        field522[field558] = Statics.field388[var15];
                        field520[field558] = var16;
                        field521[field558] = var17;
                        field558++;
                    }
                }
            }
        }
        Statics.field2029.method1535();
    }

    @ObfuscatedName("eu.bc(IIIIII)V")
    public static final void method2796(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field841.method1754(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field841.method1758(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field680.field1401;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method1443(var12);
            if (var13.field965 == -1) {
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
                class81 var14 = Statics.field2632[var13.field965];
                if (var14 != null) {
                    int var15 = (var13.field944 * 4 - var14.field1421) / 2;
                    int var16 = (var13.field952 * 4 - var14.field1422) / 2;
                    var14.method1703(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field952) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field841.method1756(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field841.method1758(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method1443(var21);
            if (var22.field965 != -1) {
                class81 var23 = Statics.field2632[var22.field965];
                if (var23 != null) {
                    int var24 = (var22.field944 * 4 - var23.field1421) / 2;
                    int var25 = (var22.field952 * 4 - var23.field1422) / 2;
                    var23.method1703(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field952) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field680.field1401;
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
        int var29 = Statics.field841.method1757(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method1443(var30);
        if (var31.field965 == -1) {
            return;
        }
        class81 var32 = Statics.field2632[var31.field965];
        if (var32 != null) {
            int var33 = (var31.field944 * 4 - var32.field1421) / 2;
            int var34 = (var31.field952 * 4 - var32.field1422) / 2;
            var32.method1703(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field952) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("et.bs(B)Z")
    public static final boolean method2651() {
        if (Statics.field2947 == null) {
            return false;
        }
        try {
            int var0 = Statics.field2947.method2774();
            if (var0 == 0) {
                return false;
            }
            if (field400 == -1) {
                Statics.field2947.method2775(field335.field1988, 0, 1);
                field335.field1984 = 0;
                field400 = field335.method2550();
                field384 = class188.field3033[field400];
                var0--;
            }
            if (field384 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field2947.method2775(field335.field1988, 0, 1);
                field384 = field335.field1988[0] & 0xFF;
                var0--;
            }
            if (field384 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field2947.method2775(field335.field1988, 0, 2);
                field335.field1984 = 0;
                field384 = field335.method2312();
                var0 -= 2;
            }
            if (var0 < field384) {
                return false;
            }
            field335.field1984 = 0;
            Statics.field2947.method2775(field335.field1988, 0, field384);
            field333 = 0;
            field342 = field334;
            field334 = field430;
            field430 = field400;
            if (field400 == 119) {
                String var1 = field335.method2318();
                Statics.field709 = var1;
                try {
                    String var2 = Statics.field289.getParameter(class190.field3049.field3044);
                    String var3 = Statics.field289.getParameter(class190.field3050.field3044);
                    String var4 = var2 + "settings=" + var1 + "; version=1; path=/; domain=" + var3;
                    String var5;
                    if (var1.length() == 0) {
                        var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        String var6 = var4 + "; Expires=";
                        long var7 = class115.method2906() + 94608000000L;
                        class111.field1939.setTime(new Date(var7));
                        int var9 = class111.field1939.get(7);
                        int var10 = class111.field1939.get(5);
                        int var11 = class111.field1939.get(2);
                        int var12 = class111.field1939.get(1);
                        int var13 = class111.field1939.get(11);
                        int var14 = class111.field1939.get(12);
                        int var15 = class111.field1939.get(13);
                        String var16 = class111.field1940[var9 - 1] + ", " + var10 / 10 + var10 % 10 + "-" + class111.field1944[0][var11] + "-" + var12 + " " + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + ":" + var15 / 10 + var15 % 10 + " GMT";
                        var5 = var6 + var16 + "; Max-Age=" + 94608000L;
                    }
                    class132.method2635(Statics.field289, "document.cookie=\"" + var5 + "\"");
                } catch (Throwable var335) {
                }
                field400 = -1;
                return true;
            }
            if (field400 == 157) {
                String var18 = field335.method2318();
                Object[] var19 = new Object[var18.length() + 1];
                for (int var20 = var18.length() - 1; var20 >= 0; var20--) {
                    if (var18.charAt(var20) == 's') {
                        var19[var20 + 1] = field335.method2318();
                    } else {
                        var19[var20 + 1] = Integer.valueOf(field335.method2315());
                    }
                }
                var19[0] = Integer.valueOf(field335.method2315());
                class1 var21 = new class1();
                var21.field16 = var19;
                class37.method521(var21, 200000);
                field400 = -1;
                return true;
            }
            if (field400 == 121) {
                int var22 = field335.method2312();
                int var23 = field335.method2315();
                class173 var24 = class173.method2988(var23);
                if (var24.field2859 != 1 || var24.field2777 != var22) {
                    var24.field2859 = 1;
                    var24.field2777 = var22;
                    method645(var24);
                }
                field400 = -1;
                return true;
            }
            if (field400 == 246) {
                String var25 = field335.method2318();
                int var26 = field335.method2315();
                class173 var27 = class173.method2988(var26);
                if (!var25.equals(var27.field2798)) {
                    var27.field2798 = var25;
                    method645(var27);
                }
                field400 = -1;
                return true;
            }
            if (field400 == 88) {
                int var28 = field335.method2315();
                int var29 = field335.method2312();
                if (var28 < -70000) {
                    var29 += 32768;
                }
                class173 var30;
                if (var28 >= 0) {
                    var30 = class173.method2988(var28);
                } else {
                    var30 = null;
                }
                if (var30 != null) {
                    for (int var31 = 0; var31 < var30.field2838.length; var31++) {
                        var30.field2838[var31] = 0;
                        var30.field2857[var31] = 0;
                    }
                }
                class16 var32 = (class16) class16.field215.method3509((long) var29);
                if (var32 != null) {
                    for (int var33 = 0; var33 < var32.field217.length; var33++) {
                        var32.field217[var33] = -1;
                        var32.field214[var33] = 0;
                    }
                }
                int var34 = field335.method2312();
                for (int var35 = 0; var35 < var34; var35++) {
                    int var36 = field335.method2396();
                    int var37 = field335.method2303();
                    if (var37 == 255) {
                        var37 = field335.method2356();
                    }
                    if (var30 != null && var35 < var30.field2838.length) {
                        var30.field2838[var35] = var36;
                        var30.field2857[var35] = var37;
                    }
                    class16.method2007(var29, var35, var36 - 1, var37);
                }
                if (var30 != null) {
                    method645(var30);
                }
                method659();
                field434[++field446 - 1 & 0x1F] = var29 & 0x7FFF;
                field400 = -1;
                return true;
            }
            if (field400 == 228) {
                field523 = field335.method2310();
                if (field523 == 255) {
                    field523 = 0;
                }
                field471 = field335.method2310();
                if (field471 == 255) {
                    field471 = 0;
                }
                field400 = -1;
                return true;
            }
            if (field400 == 152) {
                int var38 = field335.method2312();
                int var39 = field335.method2310();
                int var40 = field335.method2312();
                method100(var38, var39, var40);
                field400 = -1;
                return true;
            }
            if (field400 == 201) {
                Statics.field2879 = field335.method2447();
                Statics.field704 = field335.method2362();
                field400 = -1;
                return true;
            }
            if (field400 == 66) {
                method47(false);
                field335.method2550();
                int var41 = field335.method2312();
                class33.method606(field335, var41);
                field400 = -1;
                return true;
            }
            if (field400 == 56) {
                String var42 = field335.method2318();
                long var43 = field335.method2316();
                long var45 = (long) field335.method2312();
                long var47 = (long) field335.method2314();
                class152 var49 = (class152) class109.method927(class152.method2976(), field335.method2310());
                long var50 = (var45 << 32) + var47;
                boolean var52 = false;
                for (int var53 = 0; var53 < 100; var53++) {
                    if (field510[var53] == var50) {
                        var52 = true;
                        break;
                    }
                }
                if (var49.field2256 && method2898(var42)) {
                    var52 = true;
                }
                if (!var52 && field411 == 0) {
                    field510[field511] = var50;
                    field511 = (field511 + 1) % 100;
                    String var54 = class223.method3742(class163.method836(Statics.method784(field335)));
                    if (var49.field2262 == -1) {
                        class12.method45(9, var42, var54, class162.method202(var43));
                    } else {
                        class12.method45(9, class2.method959(var49.field2262) + var42, var54, class162.method202(var43));
                    }
                }
                field400 = -1;
                return true;
            }
            if (field400 == 72) {
                Statics.field2879 = field335.method2362();
                Statics.field704 = field335.method2303();
                for (int var55 = Statics.field2879; var55 < Statics.field2879 + 8; var55++) {
                    for (int var56 = Statics.field704; var56 < Statics.field704 + 8; var56++) {
                        if (field437[Statics.field1963][var55][var56] != null) {
                            field437[Statics.field1963][var55][var56] = null;
                            method167(var55, var56);
                        }
                    }
                }
                for (class17 var57 = (class17) field423.method3535(); var57 != null; var57 = (class17) field423.method3537()) {
                    if (var57.field226 >= Statics.field2879 && var57.field226 < Statics.field2879 + 8 && var57.field244 >= Statics.field704 && var57.field244 < Statics.field704 + 8 && Statics.field1963 == var57.field227) {
                        var57.field239 = 0;
                    }
                }
                field400 = -1;
                return true;
            }
            if (field400 == 51) {
                int var58 = field335.method2313();
                int var59 = field335.method2436();
                int var60 = field335.method2315();
                class173 var61 = class173.method2988(var60);
                if (var61.field2825 != var59 || var61.field2750 != var58 || var61.field2745 != 0 || var61.field2746 != 0) {
                    var61.field2825 = var59;
                    var61.field2750 = var58;
                    var61.field2745 = 0;
                    var61.field2746 = 0;
                    method645(var61);
                    method12(var61);
                    if (var61.field2742 == 0) {
                        method1(Statics.field2817[var60 >> 16], var61, false);
                    }
                }
                field400 = -1;
                return true;
            }
            if (field400 == 53) {
                class26 var62 = new class26();
                var62.field639 = field335.method2318();
                var62.field636 = field335.method2312();
                int var63 = field335.method2315();
                var62.field637 = var63;
                method605(45);
                Statics.field2947.method2779();
                Statics.field2947 = null;
                class32.method48(var62);
                field400 = -1;
                return false;
            }
            if (field400 == 111) {
                field561 = true;
                Statics.field24 = field335.method2310();
                Statics.field2234 = field335.method2310();
                Statics.field1378 = field335.method2312();
                Statics.field891 = field335.method2310();
                Statics.field131 = field335.method2310();
                if (Statics.field131 >= 100) {
                    Statics.field2892 = Statics.field24 * 128 + 64;
                    Statics.field1890 = Statics.field2234 * 128 + 64;
                    Statics.field820 = method601(Statics.field2892, Statics.field1890, Statics.field1963) - Statics.field1378;
                }
                field400 = -1;
                return true;
            }
            if (field400 == 57) {
                int var64 = field335.method2315();
                class4 var65 = (class4) field450.method3509((long) var64);
                if (var65 != null) {
                    method711(var65, true);
                }
                if (field421 != null) {
                    method645(field421);
                    field421 = null;
                }
                field400 = -1;
                return true;
            }
            if (field400 == 141) {
                int var66 = field335.method2323();
                boolean var67 = field335.method2310() == 1;
                String var68 = "";
                boolean var69 = false;
                if (var67) {
                    var68 = field335.method2318();
                    if (method2898(var68)) {
                        var69 = true;
                    }
                }
                String var70 = field335.method2318();
                if (!var69) {
                    class12.method930(var66, var68, var70);
                }
                field400 = -1;
                return true;
            }
            if (field400 == 100) {
                int var71 = field335.method2345();
                Statics.method546(var71);
                field434[++field446 - 1 & 0x1F] = var71 & 0x7FFF;
                field400 = -1;
                return true;
            }
            if (field400 == 142) {
                field309 = field335.method2344() * 30;
                field486 = field524;
                field400 = -1;
                return true;
            }
            if (field400 == 170) {
                field335.field1984 += 28;
                if (field335.method2332()) {
                    class122 var72 = field335;
                    int var73 = field335.field1984 - 28;
                    if (class149.field2228 != null) {
                        try {
                            class149.field2228.method3836(0L);
                            class149.field2228.method3845(var72.field1988, var73, 24);
                        } catch (Exception var334) {
                        }
                    }
                }
                field400 = -1;
                return true;
            }
            if (field400 == 245) {
                field345 = field335.method2310();
                field400 = -1;
                return true;
            }
            if (field400 == 151) {
                String var75 = field335.method2318();
                long var76 = (long) field335.method2312();
                long var78 = (long) field335.method2314();
                class152 var80 = (class152) class109.method927(class152.method2976(), field335.method2310());
                long var81 = (var76 << 32) + var78;
                boolean var83 = false;
                for (int var84 = 0; var84 < 100; var84++) {
                    if (field510[var84] == var81) {
                        var83 = true;
                        break;
                    }
                }
                if (method2898(var75)) {
                    var83 = true;
                }
                if (!var83 && field411 == 0) {
                    field510[field511] = var81;
                    field511 = (field511 + 1) % 100;
                    String var85 = class223.method3742(class163.method836(Statics.method784(field335)));
                    byte var86;
                    if (var80.field2263) {
                        var86 = 7;
                    } else {
                        var86 = 3;
                    }
                    if (var80.field2262 == -1) {
                        class12.method930(var86, var75, var85);
                    } else {
                        int var88 = var80.field2262;
                        String var89 = "<img=" + var88 + ">";
                        class12.method930(var86, var89 + var75, var85);
                    }
                }
                field400 = -1;
                return true;
            }
            if (field400 == 235) {
                int var90 = field335.method2345();
                byte var91 = field335.method2311();
                class176.field2894[var90] = var91;
                if (class176.field2895[var90] != var91) {
                    class176.field2895[var90] = var91;
                    method116(var90);
                }
                field475[++field453 - 1 & 0x1F] = var90;
                field400 = -1;
                return true;
            }
            if (field400 == 23) {
                int var92 = field335.method2356();
                int var93 = field335.method2312();
                if (var93 == 65535) {
                    var93 = -1;
                }
                int var94 = field335.method2315();
                class173 var95 = class173.method2988(var94);
                if (var95.field2739) {
                    var95.field2858 = var93;
                    var95.field2741 = var92;
                    class52 var97 = class52.method2618(var93);
                    var95.field2780 = var97.field1124;
                    var95.field2730 = var97.field1125;
                    var95.field2865 = var97.field1118;
                    var95.field2767 = var97.field1154;
                    var95.field2788 = var97.field1128;
                    var95.field2792 = var97.field1123;
                    if (var97.field1129 == 1) {
                        var95.field2797 = 1;
                    } else {
                        var95.field2797 = 2;
                    }
                    if (var95.field2791 > 0) {
                        var95.field2792 = var95.field2792 * 32 / var95.field2791;
                    } else if (var95.field2751 > 0) {
                        var95.field2792 = var95.field2792 * 32 / var95.field2751;
                    }
                    method645(var95);
                } else if (var93 == -1) {
                    var95.field2859 = 0;
                    field400 = -1;
                    return true;
                } else {
                    class52 var96 = class52.method2618(var93);
                    var95.field2859 = 4;
                    var95.field2777 = var93;
                    var95.field2780 = var96.field1124;
                    var95.field2730 = var96.field1125;
                    var95.field2792 = var96.field1123 * 100 / var92;
                    method645(var95);
                }
                field400 = -1;
                return true;
            }
            if (field400 == 169) {
                int var98 = field335.method2396();
                if (var98 == 65535) {
                    var98 = -1;
                }
                if (var98 == -1 && !field319) {
                    class183.method2222();
                } else if (var98 != -1 && field528 != var98 && field526 != 0 && !field319) {
                    class183.method588(2, Statics.field159, var98, 0, field526, false);
                }
                field528 = var98;
                field400 = -1;
                return true;
            }
            if (field400 == 41) {
                int var99 = field335.method2345();
                if (var99 == 65535) {
                    var99 = -1;
                }
                int var100 = field335.method2350();
                Statics.method1473(var99, var100);
                field400 = -1;
                return true;
            }
            if (field400 == 78) {
                class33.method606(field335, field384);
                field400 = -1;
                return true;
            }
            if (field400 == 181) {
                method697(false);
                field400 = -1;
                return true;
            }
            if (field400 == 217) {
                int var101 = field335.method2356();
                int var102 = field335.method2315();
                class4 var103 = (class4) field450.method3509((long) var101);
                class4 var104 = (class4) field450.method3509((long) var102);
                if (var104 != null) {
                    method711(var104, var103 == null || var103.field65 != var104.field65);
                }
                if (var103 != null) {
                    var103.method3624();
                    field450.method3495(var103, (long) var102);
                }
                class173 var105 = class173.method2988(var101);
                if (var105 != null) {
                    method645(var105);
                }
                class173 var106 = class173.method2988(var102);
                if (var106 != null) {
                    method645(var106);
                    method1(Statics.field2817[var106.field2740 >>> 16], var106, true);
                }
                if (field517 != -1) {
                    int var107 = field517;
                    if (class173.method144(var107)) {
                        method1502(Statics.field2817[var107], 1);
                    }
                }
                field400 = -1;
                return true;
            }
            if (field400 == 149) {
                method659();
                field455 = field335.method2313();
                field486 = field524;
                field400 = -1;
                return true;
            }
            if (field400 == 177) {
                method47(true);
                field335.method2550();
                int var108 = field335.method2312();
                class33.method606(field335, var108);
                field400 = -1;
                return true;
            }
            if (field400 == 173) {
                while (field335.field1984 < field384) {
                    boolean var109 = field335.method2310() == 1;
                    String var110 = field335.method2318();
                    String var111 = field335.method2318();
                    int var112 = field335.method2312();
                    int var113 = field335.method2310();
                    int var114 = field335.method2310();
                    boolean var115 = (var114 & 0x2) != 0;
                    boolean var116 = (var114 & 0x1) != 0;
                    if (var112 > 0) {
                        field335.method2318();
                        field335.method2310();
                        field335.method2315();
                    }
                    field335.method2318();
                    for (int var117 = 0; var117 < field556; var117++) {
                        class18 var118 = field314[var117];
                        if (var109) {
                            if (var111.equals(var118.field254)) {
                                var118.field254 = var110;
                                var118.field247 = var111;
                                var110 = null;
                                break;
                            }
                        } else if (var110.equals(var118.field254)) {
                            if (var118.field250 != var112) {
                                boolean var119 = true;
                                for (class39 var120 = (class39) field559.method3494(); var120 != null; var120 = (class39) field559.method3488()) {
                                    if (var120.field887.equals(var110)) {
                                        if (var112 != 0 && var120.field888 == 0) {
                                            var120.method3621();
                                            var119 = false;
                                        } else if (var112 == 0 && var120.field888 != 0) {
                                            var120.method3621();
                                            var119 = false;
                                        }
                                    }
                                }
                                if (var119) {
                                    field559.method3490(new class39(var110, var112));
                                }
                                var118.field250 = var112;
                            }
                            var118.field247 = var111;
                            var118.field248 = var113;
                            var118.field253 = var115;
                            var118.field251 = var116;
                            var110 = null;
                            break;
                        }
                    }
                    if (var110 != null && field556 < 400) {
                        class18 var121 = new class18();
                        field314[field556] = var121;
                        var121.field254 = var110;
                        var121.field247 = var111;
                        var121.field250 = var112;
                        var121.field248 = var113;
                        var121.field253 = var115;
                        var121.field251 = var116;
                        field556++;
                    }
                }
                field519 = 2;
                field338 = field524;
                boolean var122 = false;
                int var123 = field556;
                while (var123 > 0) {
                    boolean var124 = true;
                    var123--;
                    for (int var125 = 0; var125 < var123; var125++) {
                        boolean var126 = false;
                        class18 var127 = field314[var125];
                        class18 var128 = field314[var125 + 1];
                        if (field291 != var127.field250 && field291 == var128.field250) {
                            var126 = true;
                        }
                        if (!var126 && var127.field250 == 0 && var128.field250 != 0) {
                            var126 = true;
                        }
                        if (!var126 && !var127.field253 && var128.field253) {
                            var126 = true;
                        }
                        if (!var126 && !var127.field251 && var128.field251) {
                            var126 = true;
                        }
                        if (var126) {
                            class18 var129 = field314[var125];
                            field314[var125] = field314[var125 + 1];
                            field314[var125 + 1] = var129;
                            var124 = false;
                        }
                    }
                    if (var124) {
                        break;
                    }
                }
                field400 = -1;
                return true;
            }
            if (field400 == 161) {
                Statics.field704 = field335.method2447();
                Statics.field2879 = field335.method2362();
                while (field335.field1984 < field384) {
                    field400 = field335.method2310();
                    method2878();
                }
                field400 = -1;
                return true;
            }
            if (field400 == 122) {
                field519 = 1;
                field338 = field524;
                field400 = -1;
                return true;
            }
            if (field400 == 34) {
                int var130 = field335.method2354();
                int var131 = field335.method2344();
                class173 var132 = class173.method2988(var130);
                if (var132 != null && var132.field2742 == 0) {
                    if (var131 > var132.field2764 - var132.field2781) {
                        var131 = var132.field2764 - var132.field2781;
                    }
                    if (var131 < 0) {
                        var131 = 0;
                    }
                    if (var132.field2762 != var131) {
                        var132.field2762 = var131;
                        method645(var132);
                    }
                }
                field400 = -1;
                return true;
            }
            if (field400 == 206) {
                if (field517 != -1) {
                    int var133 = field517;
                    if (class173.method144(var133)) {
                        method1502(Statics.field2817[var133], 0);
                    }
                }
                field400 = -1;
                return true;
            }
            if (field400 == 47) {
                int var134 = field384 + field335.field1984;
                int var135 = field335.method2312();
                int var136 = field335.method2312();
                if (field517 != var135) {
                    field517 = var135;
                    int var137 = field517;
                    int var138 = Statics.field2656;
                    int var139 = Statics.field2160;
                    if (class173.method144(var137)) {
                        method1537(Statics.field2817[var137], -1, var138, var139, false);
                    }
                    method2989(field517);
                    class37.method2977(field517);
                    for (int var140 = 0; var140 < 100; var140++) {
                        field494[var140] = true;
                    }
                }
                while (var136-- > 0) {
                    int var141 = field335.method2315();
                    int var142 = field335.method2312();
                    int var143 = field335.method2310();
                    class4 var144 = (class4) field450.method3509((long) var141);
                    if (var144 != null && var144.field65 != var142) {
                        method711(var144, true);
                        var144 = null;
                    }
                    if (var144 == null) {
                        class4 var145 = new class4();
                        var145.field65 = var142;
                        var145.field62 = var143;
                        field450.method3495(var145, (long) var141);
                        method2989(var142);
                        class173 var146 = class173.method2988(var141);
                        method645(var146);
                        if (field421 != null) {
                            method645(field421);
                            field421 = null;
                        }
                        method1908();
                        method1(Statics.field2817[var141 >> 16], var146, false);
                        class37.method2977(var142);
                        if (field517 != -1) {
                            int var147 = field517;
                            if (class173.method144(var147)) {
                                method1502(Statics.field2817[var147], 1);
                            }
                        }
                        var144 = var145;
                    }
                    var144.field63 = true;
                }
                for (class4 var149 = (class4) field450.method3496(); var149 != null; var149 = (class4) field450.method3500()) {
                    if (var149.field63) {
                        var149.field63 = false;
                    } else {
                        method711(var149, true);
                    }
                }
                field491 = new class196(512);
                while (field335.field1984 < var134) {
                    int var150 = field335.method2315();
                    int var151 = field335.method2312();
                    int var152 = field335.method2312();
                    int var153 = field335.method2315();
                    for (int var154 = var151; var154 <= var152; var154++) {
                        long var155 = ((long) var150 << 32) + (long) var154;
                        field491.method3495(new class201(var153), var155);
                    }
                }
                field400 = -1;
                return true;
            }
            if (field400 == 220 || field400 == 191 || field400 == 19 || field400 == 0 || field400 == 209 || field400 == 202 || field400 == 106 || field400 == 27 || field400 == 163 || field400 == 61) {
                method2878();
                field400 = -1;
                return true;
            }
            if (field400 == 221) {
                int var157 = field335.method2345();
                int var158 = field335.method2354();
                int var159 = field335.method2345();
                class173 var160 = class173.method2988(var158);
                var160.field2794 = (var159 << 16) + var157;
                field400 = -1;
                return true;
            }
            if (field400 == 211) {
                boolean var161 = field335.method2310() == 1;
                if (var161) {
                    Statics.field2304 = class115.method2906() - field335.method2316();
                    Statics.field166 = new class221(field335, true);
                } else {
                    Statics.field166 = null;
                }
                field426 = field524;
                field400 = -1;
                return true;
            }
            if (field400 == 108) {
                int var162 = field335.method2447();
                String var163 = field335.method2318();
                int var164 = field335.method2310();
                if (var164 >= 1 && var164 <= 8) {
                    if (var163.equalsIgnoreCase("null")) {
                        var163 = null;
                    }
                    field431[var164 - 1] = var163;
                    field419[var164 - 1] = var162 == 0;
                }
                field400 = -1;
                return true;
            }
            if (field400 == 103) {
                int var165 = field335.method2347();
                int var166 = field335.method2315();
                class173 var167 = class173.method2988(var166);
                if (var167.field2785 != var165 || var165 == -1) {
                    var167.field2785 = var165;
                    var167.field2793 = 0;
                    var167.field2827 = 0;
                    method645(var167);
                }
                field400 = -1;
                return true;
            }
            if (field400 == 164) {
                int var168 = field335.method2354();
                class173 var169 = class173.method2988(var168);
                for (int var170 = 0; var170 < var169.field2838.length; var170++) {
                    var169.field2838[var170] = -1;
                    var169.field2838[var170] = 0;
                }
                method645(var169);
                field400 = -1;
                return true;
            }
            if (field400 == 247) {
                for (int var171 = 0; var171 < field412.length; var171++) {
                    if (field412[var171] != null) {
                        field412[var171].field839 = -1;
                    }
                }
                for (int var172 = 0; var172 < field470.length; var172++) {
                    if (field470[var172] != null) {
                        field470[var172].field839 = -1;
                    }
                }
                field400 = -1;
                return true;
            }
            if (field400 == 12) {
                int var173 = field335.method2354();
                int var174 = field335.method2345();
                int var175 = var174 >> 10 & 0x1F;
                int var176 = var174 >> 5 & 0x1F;
                int var177 = var174 & 0x1F;
                int var178 = (var177 << 3) + (var175 << 19) + (var176 << 11);
                class173 var179 = class173.method2988(var173);
                if (var179.field2765 != var178) {
                    var179.field2765 = var178;
                    method645(var179);
                }
                field400 = -1;
                return true;
            }
            if (field400 == 186) {
                String var180 = field335.method2318();
                int var181 = field335.method2312();
                byte var182 = field335.method2311();
                boolean var183 = false;
                if (var182 == -128) {
                    var183 = true;
                }
                if (var183) {
                    if (Statics.field2726 == 0) {
                        field400 = -1;
                        return true;
                    }
                    boolean var184 = false;
                    int var185;
                    for (var185 = 0; var185 < Statics.field2726 && (!Statics.field2655[var185].field622.equals(var180) || Statics.field2655[var185].field620 != var181); var185++) {
                    }
                    if (var185 < Statics.field2726) {
                        while (var185 < Statics.field2726 - 1) {
                            Statics.field2655[var185] = Statics.field2655[var185 + 1];
                            var185++;
                        }
                        Statics.field2726--;
                        Statics.field2655[Statics.field2726] = null;
                    }
                } else {
                    field335.method2318();
                    class25 var186 = new class25();
                    var186.field622 = var180;
                    var186.field618 = class164.method610(var186.field622, Statics.field484);
                    var186.field620 = var181;
                    var186.field621 = var182;
                    int var187;
                    for (var187 = Statics.field2726 - 1; var187 >= 0; var187--) {
                        int var188 = Statics.field2655[var187].field618.compareTo(var186.field618);
                        if (var188 == 0) {
                            Statics.field2655[var187].field620 = var181;
                            Statics.field2655[var187].field621 = var182;
                            if (var180.equals(Statics.field162.field51)) {
                                Statics.field1946 = var182;
                            }
                            field483 = field524;
                            field400 = -1;
                            return true;
                        }
                        if (var188 < 0) {
                            break;
                        }
                    }
                    if (Statics.field2726 >= Statics.field2655.length) {
                        field400 = -1;
                        return true;
                    }
                    for (int var189 = Statics.field2726 - 1; var189 > var187; var189--) {
                        Statics.field2655[var189 + 1] = Statics.field2655[var189];
                    }
                    if (Statics.field2726 == 0) {
                        Statics.field2655 = new class25[100];
                    }
                    Statics.field2655[var187 + 1] = var186;
                    Statics.field2726++;
                    if (var180.equals(Statics.field162.field51)) {
                        Statics.field1946 = var182;
                    }
                }
                field483 = field524;
                field400 = -1;
                return true;
            }
            if (field400 == 240) {
                int var190 = field335.method2344();
                int var191 = field335.method2312();
                int var192 = field335.method2356();
                int var193 = field335.method2396();
                class173 var194 = class173.method2988(var192);
                if (var194.field2780 != var191 || var194.field2730 != var193 || var194.field2792 != var190) {
                    var194.field2780 = var191;
                    var194.field2730 = var193;
                    var194.field2792 = var190;
                    method645(var194);
                }
                field400 = -1;
                return true;
            }
            if (field400 == 118) {
                int var195 = field335.method2312();
                int var196 = field335.method2394();
                class176.field2894[var195] = var196;
                if (class176.field2895[var195] != var196) {
                    class176.field2895[var195] = var196;
                    method116(var195);
                }
                field475[++field453 - 1 & 0x1F] = var195;
                field400 = -1;
                return true;
            }
            if (field400 == 130) {
                int var197 = field335.method2315();
                Statics.field1766 = Statics.field1158.method2672(var197);
                field400 = -1;
                return true;
            }
            if (field400 == 74) {
                int var198 = field335.method2310();
                class130[] var199 = class130.method223();
                int var200 = 0;
                class130 var202;
                while (true) {
                    if (var200 >= var199.length) {
                        var202 = null;
                        break;
                    }
                    class130 var201 = var199[var200];
                    if (var201.field2050 == var198) {
                        var202 = var201;
                        break;
                    }
                    var200++;
                }
                Statics.field1897 = var202;
                field400 = -1;
                return true;
            }
            if (field400 == 89) {
                int var203 = field335.method2356();
                class173 var204 = class173.method2988(var203);
                var204.field2859 = 3;
                var204.field2777 = Statics.field162.field35.method3235();
                method645(var204);
                field400 = -1;
                return true;
            }
            if (field400 == 241) {
                int var205 = field335.method2344();
                if (var205 == 65535) {
                    var205 = -1;
                }
                int var206 = field335.method2354();
                int var207 = field335.method2345();
                if (var207 == 65535) {
                    var207 = -1;
                }
                int var208 = field335.method2394();
                for (int var209 = var205; var209 <= var207; var209++) {
                    long var210 = ((long) var208 << 32) + (long) var209;
                    class208 var212 = field491.method3509(var210);
                    if (var212 != null) {
                        var212.method3624();
                    }
                    field491.method3495(new class201(var206), var210);
                }
                field400 = -1;
                return true;
            }
            if (field400 == 199) {
                int var213 = field335.method2344();
                int var214 = field335.method2356();
                int var215 = field335.method2303();
                class4 var216 = (class4) field450.method3509((long) var214);
                if (var216 != null) {
                    method711(var216, var216.field65 != var213);
                }
                class4 var217 = new class4();
                var217.field65 = var213;
                var217.field62 = var215;
                field450.method3495(var217, (long) var214);
                method2989(var213);
                class173 var218 = class173.method2988(var214);
                method645(var218);
                if (field421 != null) {
                    method645(field421);
                    field421 = null;
                }
                method1908();
                method1(Statics.field2817[var214 >> 16], var218, false);
                class37.method2977(var213);
                if (field517 != -1) {
                    int var219 = field517;
                    if (class173.method144(var219)) {
                        method1502(Statics.field2817[var219], 1);
                    }
                }
                field400 = -1;
                return true;
            }
            if (field400 == 42) {
                method697(true);
                field400 = -1;
                return true;
            }
            if (field400 == 45) {
                int var220 = field335.method2396();
                field517 = var220;
                int var221 = field517;
                int var222 = Statics.field2656;
                int var223 = Statics.field2160;
                if (class173.method144(var221)) {
                    method1537(Statics.field2817[var221], -1, var222, var223, false);
                }
                method2989(var220);
                class37.method2977(field517);
                for (int var224 = 0; var224 < 100; var224++) {
                    field494[var224] = true;
                }
                field400 = -1;
                return true;
            }
            if (field400 == 104) {
                field310 = field335.method2310();
                if (field310 == 1) {
                    field311 = field335.method2312();
                }
                if (field310 >= 2 && field310 <= 6) {
                    if (field310 == 2) {
                        field316 = 64;
                        field317 = 64;
                    }
                    if (field310 == 3) {
                        field316 = 0;
                        field317 = 64;
                    }
                    if (field310 == 4) {
                        field316 = 128;
                        field317 = 64;
                    }
                    if (field310 == 5) {
                        field316 = 64;
                        field317 = 0;
                    }
                    if (field310 == 6) {
                        field316 = 64;
                        field317 = 128;
                    }
                    field310 = 2;
                    field477 = field335.method2312();
                    field318 = field335.method2312();
                    field359 = field335.method2310();
                }
                if (field310 == 10) {
                    field312 = field335.method2312();
                }
                field400 = -1;
                return true;
            }
            if (field400 == 83) {
                field561 = true;
                Statics.field1048 = field335.method2310();
                Statics.field682 = field335.method2310();
                Statics.field1666 = field335.method2312();
                Statics.field14 = field335.method2310();
                Statics.field2882 = field335.method2310();
                if (Statics.field2882 >= 100) {
                    int var225 = Statics.field1048 * 128 + 64;
                    int var226 = Statics.field682 * 128 + 64;
                    int var227 = method601(var225, var226, Statics.field1963) - Statics.field1666;
                    int var228 = var225 - Statics.field2892;
                    int var229 = var227 - Statics.field820;
                    int var230 = var226 - Statics.field1890;
                    int var231 = (int) Math.sqrt((double) (var228 * var228 + var230 * var230));
                    Statics.field96 = (int) (Math.atan2((double) var229, (double) var231) * 325.949D) & 0x7FF;
                    Statics.field2200 = (int) (Math.atan2((double) var228, (double) var230) * -325.949D) & 0x7FF;
                    if (Statics.field96 < 128) {
                        Statics.field96 = 128;
                    }
                    if (Statics.field96 > 383) {
                        Statics.field96 = 383;
                    }
                }
                field400 = -1;
                return true;
            }
            if (field400 == 226) {
                while (field335.field1984 < field384) {
                    int var232 = field335.method2310();
                    boolean var233 = (var232 & 0x1) == 1;
                    String var234 = field335.method2318();
                    String var235 = field335.method2318();
                    field335.method2318();
                    for (int var236 = 0; var236 < field560; var236++) {
                        class8 var237 = field428[var236];
                        if (var233) {
                            if (var235.equals(var237.field138)) {
                                var237.field138 = var234;
                                var237.field132 = var235;
                                var234 = null;
                                break;
                            }
                        } else if (var234.equals(var237.field138)) {
                            var237.field138 = var234;
                            var237.field132 = var235;
                            var234 = null;
                            break;
                        }
                    }
                    if (var234 != null && field560 < 400) {
                        class8 var238 = new class8();
                        field428[field560] = var238;
                        var238.field138 = var234;
                        var238.field132 = var235;
                        field560++;
                    }
                }
                field338 = field524;
                field400 = -1;
                return true;
            }
            if (field400 == 144) {
                for (int var239 = 0; var239 < Statics.field1162; var239++) {
                    class53 var240 = (class53) class53.field1165.method3467((long) var239);
                    class53 var241;
                    if (var240 == null) {
                        byte[] var242 = Statics.field1164.method3080(16, var239);
                        class53 var243 = new class53();
                        if (var242 != null) {
                            var243.method1028(new class119(var242));
                        }
                        class53.field1165.method3466(var243, (long) var239);
                        var241 = var243;
                    } else {
                        var241 = var240;
                    }
                    if (var241 != null) {
                        class176.field2894[var239] = 0;
                        class176.field2895[var239] = 0;
                    }
                }
                method659();
                field453 += 32;
                field400 = -1;
                return true;
            }
            if (field400 == 216) {
                int var245 = field335.method2310();
                if (field335.method2310() == 0) {
                    field565[var245] = new class220();
                    field335.field1984 += 18;
                } else {
                    field335.field1984--;
                    field565[var245] = new class220(field335, false);
                }
                field427 = field524;
                field400 = -1;
                return true;
            }
            if (field400 == 79) {
                field507 = field335.method2310();
                field508 = field335.method2310();
                field400 = -1;
                return true;
            }
            if (field400 == 31) {
                field483 = field524;
                if (field384 == 0) {
                    field478 = null;
                    field513 = null;
                    Statics.field2726 = 0;
                    Statics.field2655 = null;
                    field400 = -1;
                    return true;
                }
                field513 = field335.method2318();
                long var246 = field335.method2316();
                field478 = class162.method1472(var246);
                Statics.field245 = field335.method2311();
                int var248 = field335.method2310();
                if (var248 == 255) {
                    field400 = -1;
                    return true;
                }
                Statics.field2726 = var248;
                class25[] var249 = new class25[100];
                for (int var250 = 0; var250 < Statics.field2726; var250++) {
                    var249[var250] = new class25();
                    var249[var250].field622 = field335.method2318();
                    var249[var250].field618 = class164.method610(var249[var250].field622, Statics.field484);
                    var249[var250].field620 = field335.method2312();
                    var249[var250].field621 = field335.method2311();
                    field335.method2318();
                    if (var249[var250].field622.equals(Statics.field162.field51)) {
                        Statics.field1946 = var249[var250].field621;
                    }
                }
                boolean var251 = false;
                int var252 = Statics.field2726;
                while (var252 > 0) {
                    boolean var253 = true;
                    var252--;
                    for (int var254 = 0; var254 < var252; var254++) {
                        if (var249[var254].field618.compareTo(var249[var254 + 1].field618) > 0) {
                            class25 var255 = var249[var254];
                            var249[var254] = var249[var254 + 1];
                            var249[var254 + 1] = var255;
                            var253 = false;
                        }
                    }
                    if (var253) {
                        break;
                    }
                }
                Statics.field2655 = var249;
                field400 = -1;
                return true;
            }
            if (field400 == 73) {
                class122 var256 = field335;
                int var257 = field384;
                class210 var258 = new class210();
                var258.field3103 = var256.method2310();
                var258.field3105 = var256.method2315();
                var258.field3104 = new int[var258.field3103];
                var258.field3107 = new int[var258.field3103];
                var258.field3106 = new Field[var258.field3103];
                var258.field3108 = new int[var258.field3103];
                var258.field3109 = new Method[var258.field3103];
                var258.field3110 = new byte[var258.field3103][][];
                for (int var259 = 0; var259 < var258.field3103; var259++) {
                    try {
                        int var260 = var256.method2310();
                        if (var260 == 0 || var260 == 1 || var260 == 2) {
                            String var261 = var256.method2318();
                            String var262 = var256.method2318();
                            int var263 = 0;
                            if (var260 == 1) {
                                var263 = var256.method2315();
                            }
                            var258.field3104[var259] = var260;
                            var258.field3108[var259] = var263;
                            if (class211.method2768(var261).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var258.field3106[var259] = class211.method2768(var261).getDeclaredField(var262);
                        } else if (var260 == 3 || var260 == 4) {
                            String var264 = var256.method2318();
                            String var265 = var256.method2318();
                            int var266 = var256.method2310();
                            String[] var267 = new String[var266];
                            for (int var268 = 0; var268 < var266; var268++) {
                                var267[var268] = var256.method2318();
                            }
                            String var269 = var256.method2318();
                            byte[][] var270 = new byte[var266][];
                            if (var260 == 3) {
                                for (int var271 = 0; var271 < var266; var271++) {
                                    int var272 = var256.method2315();
                                    var270[var271] = new byte[var272];
                                    var256.method2339(var270[var271], 0, var272);
                                }
                            }
                            var258.field3104[var259] = var260;
                            Class[] var273 = new Class[var266];
                            for (int var274 = 0; var274 < var266; var274++) {
                                var273[var274] = class211.method2768(var267[var274]);
                            }
                            Class var275 = class211.method2768(var269);
                            if (class211.method2768(var264).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var276 = class211.method2768(var264).getDeclaredMethods();
                            Method[] var277 = var276;
                            for (int var278 = 0; var278 < var277.length; var278++) {
                                Method var279 = var277[var278];
                                if (var279.getName().equals(var265)) {
                                    Class[] var280 = var279.getParameterTypes();
                                    if (var273.length == var280.length) {
                                        boolean var281 = true;
                                        for (int var282 = 0; var282 < var273.length; var282++) {
                                            if (var273[var282] != var280[var282]) {
                                                var281 = false;
                                                break;
                                            }
                                        }
                                        if (var281 && var275 == var279.getReturnType()) {
                                            var258.field3109[var259] = var279;
                                        }
                                    }
                                }
                            }
                            var258.field3110[var259] = var270;
                        }
                    } catch (ClassNotFoundException var337) {
                        var258.field3107[var259] = -1;
                    } catch (SecurityException var338) {
                        var258.field3107[var259] = -2;
                    } catch (NullPointerException var339) {
                        var258.field3107[var259] = -3;
                    } catch (Exception var340) {
                        var258.field3107[var259] = -4;
                    } catch (Throwable var341) {
                        var258.field3107[var259] = -5;
                    }
                }
                class211.field3112.method3581(var258);
                field400 = -1;
                return true;
            }
            if (field400 == 96) {
                for (int var288 = 0; var288 < class176.field2895.length; var288++) {
                    if (class176.field2895[var288] != class176.field2894[var288]) {
                        class176.field2895[var288] = class176.field2894[var288];
                        method116(var288);
                        field475[++field453 - 1 & 0x1F] = var288;
                    }
                }
                field400 = -1;
                return true;
            }
            if (field400 == 193) {
                int var289 = field335.method2315();
                int var290 = field335.method2315();
                if (Statics.field1517 == null || !Statics.field1517.isValid()) {
                    try {
                        Iterator var291 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var291.hasNext()) {
                            GarbageCollectorMXBean var292 = (GarbageCollectorMXBean) var291.next();
                            if (var292.isValid()) {
                                Statics.field1517 = var292;
                                field482 = -1L;
                                field468 = -1L;
                            }
                        }
                    } catch (Throwable var336) {
                    }
                }
                long var294 = class115.method2906();
                int var296 = -1;
                if (Statics.field1517 != null) {
                    long var297 = Statics.field1517.getCollectionTime();
                    if (field468 != -1L) {
                        long var299 = var297 - field468;
                        long var301 = var294 - field482;
                        if (var301 != 0L) {
                            var296 = (int) (var299 * 100L / var301);
                        }
                    }
                    field468 = var297;
                    field482 = var294;
                }
                field295.method2549(142);
                field295.method2299(var289);
                field295.method2299(var290);
                field295.method2430(var296);
                field295.method2335(field2187);
                field400 = -1;
                return true;
            }
            if (field400 == 44) {
                method659();
                int var303 = field335.method2447();
                int var304 = field335.method2310();
                int var305 = field335.method2354();
                field420[var303] = var305;
                field298[var303] = var304;
                field476[var303] = 1;
                for (int var306 = 0; var306 < 98; var306++) {
                    if (var305 >= class155.field2292[var306]) {
                        field476[var303] = var306 + 2;
                    }
                }
                field479[++field480 - 1 & 0x1F] = var303;
                field400 = -1;
                return true;
            }
            if (field400 == 26) {
                method979();
                field400 = -1;
                return false;
            }
            if (field400 == 203) {
                class33.field768 = 0;
                for (int var307 = 0; var307 < 2048; var307++) {
                    class33.field759[var307] = null;
                    class33.field758[var307] = 1;
                }
                for (int var308 = 0; var308 < 2048; var308++) {
                    field412[var308] = null;
                }
                class33.method107(field335);
                field400 = -1;
                return true;
            }
            if (field400 == 115) {
                field561 = false;
                for (int var309 = 0; var309 < 5; var309++) {
                    field538[var309] = false;
                }
                field400 = -1;
                return true;
            }
            if (field400 == 208) {
                method659();
                field351 = field335.method2310();
                field486 = field524;
                field400 = -1;
                return true;
            }
            if (field400 == 140) {
                int var310 = field335.method2315();
                int var311 = field335.method2312();
                if (var310 < -70000) {
                    var311 += 32768;
                }
                class173 var312;
                if (var310 >= 0) {
                    var312 = class173.method2988(var310);
                } else {
                    var312 = null;
                }
                while (field335.field1984 < field384) {
                    int var313 = field335.method2323();
                    int var314 = field335.method2312();
                    int var315 = 0;
                    if (var314 != 0) {
                        var315 = field335.method2310();
                        if (var315 == 255) {
                            var315 = field335.method2315();
                        }
                    }
                    if (var312 != null && var313 >= 0 && var313 < var312.field2838.length) {
                        var312.field2838[var313] = var314;
                        var312.field2857[var313] = var315;
                    }
                    class16.method2007(var311, var313, var314 - 1, var315);
                }
                if (var312 != null) {
                    method645(var312);
                }
                method659();
                field434[++field446 - 1 & 0x1F] = var311 & 0x7FFF;
                field400 = -1;
                return true;
            }
            if (field400 == 230) {
                int var316 = field335.method2394();
                int var317 = field335.method2396();
                class173 var318 = class173.method2988(var316);
                if (var318.field2859 != 2 || var318.field2777 != var317) {
                    var318.field2859 = 2;
                    var318.field2777 = var317;
                    method645(var318);
                }
                field400 = -1;
                return true;
            }
            if (field400 == 18) {
                int var319 = field335.method2310();
                int var320 = field335.method2310();
                int var321 = field335.method2310();
                int var322 = field335.method2310();
                field538[var319] = true;
                field539[var319] = var320;
                field540[var319] = var321;
                field541[var319] = var322;
                field355[var319] = 0;
                field400 = -1;
                return true;
            }
            if (field400 == 166) {
                String var323 = field335.method2318();
                class122 var324 = field335;
                String var325 = class222.method3639(var324, 32767);
                String var326 = class223.method3742(class163.method836(var325));
                class12.method930(6, var323, var326);
                field400 = -1;
                return true;
            }
            if (field400 == 172) {
                int var327 = field335.method2356();
                boolean var328 = field335.method2447() == 1;
                class173 var329 = class173.method2988(var327);
                if (var329.field2832 != var328) {
                    var329.field2832 = var328;
                    method645(var329);
                }
                field400 = -1;
                return true;
            }
            Statics.method929("" + field400 + class2.field21 + field334 + class2.field21 + field342 + class2.field21 + field384, (Throwable) null);
            method979();
        } catch (IOException var342) {
            method170();
        } catch (Exception var343) {
            String var332 = "" + field400 + class2.field21 + field334 + class2.field21 + field342 + class2.field21 + field384 + class2.field21 + (Statics.field2644 + Statics.field162.field878[0]) + class2.field21 + (Statics.field934 + Statics.field162.field879[0]) + class2.field21;
            for (int var333 = 0; var333 < field384 && var333 < 50; var333++) {
                var332 = var332 + field335.field1988[var333] + class2.field21;
            }
            Statics.method929(var332, var343);
            method979();
        }
        return true;
    }

    @ObfuscatedName("ew.bw(B)V")
    public static final void method2878() {
        if (field400 == 106) {
            int var0 = field335.method2447();
            int var1 = (var0 >> 4 & 0x7) + Statics.field2879;
            int var2 = (var0 & 0x7) + Statics.field704;
            int var3 = field335.method2345();
            int var4 = field335.method2396();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class29 var5 = new class29();
                var5.field676 = var4;
                var5.field679 = var3;
                if (field437[Statics.field1963][var1][var2] == null) {
                    field437[Statics.field1963][var1][var2] = new class199();
                }
                field437[Statics.field1963][var1][var2].method3545(var5);
                method167(var1, var2);
            }
            return;
        }
        if (field400 == 19) {
            byte var6 = field335.method2340();
            byte var7 = field335.method2389();
            int var8 = field335.method2303();
            int var9 = (var8 >> 4 & 0x7) + Statics.field2879;
            int var10 = (var8 & 0x7) + Statics.field704;
            byte var11 = field335.method2389();
            int var12 = field335.method2396();
            int var13 = field335.method2345();
            byte var14 = field335.method2311();
            int var15 = field335.method2396();
            int var16 = field335.method2345();
            int var17 = field335.method2447();
            int var18 = var17 >> 2;
            int var19 = var17 & 0x3;
            int var20 = field343[var18];
            class3 var21;
            if (field336 == var15) {
                var21 = Statics.field162;
            } else {
                var21 = field412[var15];
            }
            if (var21 != null) {
                class41 var22 = class41.method1443(var12);
                int var23;
                int var24;
                if (var19 == 1 || var19 == 3) {
                    var23 = var22.field952;
                    var24 = var22.field944;
                } else {
                    var23 = var22.field944;
                    var24 = var22.field952;
                }
                int var25 = (var23 >> 1) + var9;
                int var26 = (var23 + 1 >> 1) + var9;
                int var27 = (var24 >> 1) + var10;
                int var28 = (var24 + 1 >> 1) + var10;
                int[][] var29 = class6.field97[Statics.field1963];
                int var30 = var29[var25][var27] + var29[var26][var27] + var29[var25][var28] + var29[var26][var28] >> 2;
                int var31 = (var9 << 7) + (var23 << 6);
                int var32 = (var10 << 7) + (var24 << 6);
                class105 var33 = var22.method754(var18, var19, var29, var31, var30, var32);
                if (var33 != null) {
                    method96(Statics.field1963, var9, var10, var20, -1, 0, 0, var16 + 1, var13 + 1);
                    var21.field36 = field302 + var16;
                    var21.field43 = field302 + var13;
                    var21.field49 = var33;
                    var21.field50 = var9 * 128 + var23 * 64;
                    var21.field46 = var10 * 128 + var24 * 64;
                    var21.field45 = var30;
                    if (var7 > var11) {
                        byte var34 = var7;
                        var7 = var11;
                        var11 = var34;
                    }
                    if (var14 > var6) {
                        byte var35 = var14;
                        var14 = var6;
                        var6 = var35;
                    }
                    var21.field48 = var7 + var9;
                    var21.field60 = var9 + var11;
                    var21.field39 = var10 + var14;
                    var21.field37 = var6 + var10;
                }
            }
        }
        if (field400 == 191) {
            int var36 = field335.method2310();
            int var37 = (var36 >> 4 & 0x7) + Statics.field2879;
            int var38 = (var36 & 0x7) + Statics.field704;
            int var39 = field335.method2312();
            int var40 = field335.method2312();
            int var41 = field335.method2312();
            if (var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104) {
                class199 var42 = field437[Statics.field1963][var37][var38];
                if (var42 != null) {
                    for (class29 var43 = (class29) var42.method3535(); var43 != null; var43 = (class29) var42.method3537()) {
                        if ((var39 & 0x7FFF) == var43.field676 && var43.field679 == var40) {
                            var43.field679 = var41;
                            break;
                        }
                    }
                    method167(var37, var38);
                }
            }
        } else if (field400 == 27) {
            int var44 = field335.method2310();
            int var45 = var44 >> 2;
            int var46 = var44 & 0x3;
            int var47 = field343[var45];
            int var48 = field335.method2345();
            int var49 = field335.method2310();
            int var50 = (var49 >> 4 & 0x7) + Statics.field2879;
            int var51 = (var49 & 0x7) + Statics.field704;
            if (var50 >= 0 && var51 >= 0 && var50 < 103 && var51 < 103) {
                if (var47 == 0) {
                    class87 var52 = Statics.field841.method1750(Statics.field1963, var50, var51);
                    if (var52 != null) {
                        int var53 = var52.field1524 >> 14 & 0x7FFF;
                        if (var45 == 2) {
                            var52.field1522 = new class13(var53, 2, var46 + 4, Statics.field1963, var50, var51, var48, false, var52.field1522);
                            var52.field1523 = new class13(var53, 2, var46 + 1 & 0x3, Statics.field1963, var50, var51, var48, false, var52.field1523);
                        } else {
                            var52.field1522 = new class13(var53, var45, var46, Statics.field1963, var50, var51, var48, false, var52.field1522);
                        }
                    }
                }
                if (var47 == 1) {
                    class94 var54 = Statics.field841.method1751(Statics.field1963, var50, var51);
                    if (var54 != null) {
                        int var55 = var54.field1603 >> 14 & 0x7FFF;
                        if (var45 == 4 || var45 == 5) {
                            var54.field1611 = new class13(var55, 4, var46, Statics.field1963, var50, var51, var48, false, var54.field1611);
                        } else if (var45 == 6) {
                            var54.field1611 = new class13(var55, 4, var46 + 4, Statics.field1963, var50, var51, var48, false, var54.field1611);
                        } else if (var45 == 7) {
                            var54.field1611 = new class13(var55, 4, (var46 + 2 & 0x3) + 4, Statics.field1963, var50, var51, var48, false, var54.field1611);
                        } else if (var45 == 8) {
                            var54.field1611 = new class13(var55, 4, var46 + 4, Statics.field1963, var50, var51, var48, false, var54.field1611);
                            var54.field1602 = new class13(var55, 4, (var46 + 2 & 0x3) + 4, Statics.field1963, var50, var51, var48, false, var54.field1602);
                        }
                    }
                }
                if (var47 == 2) {
                    class98 var56 = Statics.field841.method1752(Statics.field1963, var50, var51);
                    if (var45 == 11) {
                        var45 = 10;
                    }
                    if (var56 != null) {
                        var56.field1656 = new class13(var56.field1664 >> 14 & 0x7FFF, var45, var46, Statics.field1963, var50, var51, var48, false, var56.field1656);
                    }
                }
                if (var47 == 3) {
                    class93 var57 = Statics.field841.method1837(Statics.field1963, var50, var51);
                    if (var57 != null) {
                        var57.field1583 = new class13(var57.field1587 >> 14 & 0x7FFF, 22, var46, Statics.field1963, var50, var51, var48, false, var57.field1583);
                    }
                }
            }
        } else {
            if (field400 == 220) {
                int var58 = field335.method2310();
                int var59 = (var58 >> 4 & 0x7) + Statics.field2879;
                int var60 = (var58 & 0x7) + Statics.field704;
                int var61 = field335.method2312();
                int var62 = field335.method2310();
                int var63 = var62 >> 4 & 0xF;
                int var64 = var62 & 0x7;
                int var65 = field335.method2310();
                if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104) {
                    int var66 = var63 + 1;
                    if (Statics.field162.field878[0] >= var59 - var66 && Statics.field162.field878[0] <= var59 + var66 && Statics.field162.field879[0] >= var60 - var66 && Statics.field162.field879[0] <= var60 + var66 && field530 != 0 && var64 > 0 && field527 < 50) {
                        field532[field527] = var61;
                        field533[field527] = var64;
                        field534[field527] = var65;
                        field536[field527] = null;
                        field321[field527] = (var59 << 16) + (var60 << 8) + var63;
                        field527++;
                    }
                }
            }
            if (field400 == 209) {
                int var67 = field335.method2310();
                int var68 = (var67 >> 4 & 0x7) + Statics.field2879;
                int var69 = (var67 & 0x7) + Statics.field704;
                int var70 = var68 + field335.method2311();
                int var71 = var69 + field335.method2311();
                int var72 = field335.method2313();
                int var73 = field335.method2312();
                int var74 = field335.method2310() * 4;
                int var75 = field335.method2310() * 4;
                int var76 = field335.method2312();
                int var77 = field335.method2312();
                int var78 = field335.method2310();
                int var79 = field335.method2310();
                if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104 && var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104 && var73 != 65535) {
                    int var80 = var68 * 128 + 64;
                    int var81 = var69 * 128 + 64;
                    int var82 = var70 * 128 + 64;
                    int var83 = var71 * 128 + 64;
                    class7 var84 = new class7(var73, Statics.field1963, var80, var81, method601(var80, var81, Statics.field1963) - var74, field302 + var76, field302 + var77, var78, var79, var72, var75);
                    var84.method93(var82, var83, method601(var82, var83, Statics.field1963) - var75, field302 + var76);
                    field424.method3545(var84);
                }
            } else if (field400 == 0) {
                int var85 = field335.method2310();
                int var86 = (var85 >> 4 & 0x7) + Statics.field2879;
                int var87 = (var85 & 0x7) + Statics.field704;
                int var88 = field335.method2312();
                int var89 = field335.method2310();
                int var90 = field335.method2312();
                if (var86 >= 0 && var87 >= 0 && var86 < 104 && var87 < 104) {
                    int var91 = var86 * 128 + 64;
                    int var92 = var87 * 128 + 64;
                    class30 var93 = new class30(var88, Statics.field1963, var91, var92, method601(var91, var92, Statics.field1963) - var89, var90, field302);
                    field425.method3545(var93);
                }
            } else if (field400 == 61) {
                int var94 = field335.method2396();
                int var95 = field335.method2447();
                int var96 = (var95 >> 4 & 0x7) + Statics.field2879;
                int var97 = (var95 & 0x7) + Statics.field704;
                int var98 = field335.method2362();
                int var99 = var98 >> 2;
                int var100 = var98 & 0x3;
                int var101 = field343[var99];
                if (var96 >= 0 && var97 >= 0 && var96 < 104 && var97 < 104) {
                    method96(Statics.field1963, var96, var97, var101, var94, var99, var100, 0, -1);
                }
            } else if (field400 == 163) {
                int var102 = field335.method2303();
                int var103 = (var102 >> 4 & 0x7) + Statics.field2879;
                int var104 = (var102 & 0x7) + Statics.field704;
                int var105 = field335.method2303();
                int var106 = var105 >> 2;
                int var107 = var105 & 0x3;
                int var108 = field343[var106];
                if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104) {
                    method96(Statics.field1963, var103, var104, var108, -1, var106, var107, 0, -1);
                }
            } else if (field400 == 202) {
                int var109 = field335.method2310();
                int var110 = (var109 >> 4 & 0x7) + Statics.field2879;
                int var111 = (var109 & 0x7) + Statics.field704;
                int var112 = field335.method2312();
                if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                    class199 var113 = field437[Statics.field1963][var110][var111];
                    if (var113 != null) {
                        for (class29 var114 = (class29) var113.method3535(); var114 != null; var114 = (class29) var113.method3537()) {
                            if ((var112 & 0x7FFF) == var114.field676) {
                                var114.method3624();
                                break;
                            }
                        }
                        if (var113.method3535() == null) {
                            field437[Statics.field1963][var110][var111] = null;
                        }
                        method167(var110, var111);
                    }
                }
            }
        }
    }

    @ObfuscatedName("p.bn(IIIIIIIIIS)V")
    public static final void method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field423.method3535(); var10 != null; var10 = (class17) field423.method3537()) {
            if (var10.field227 == arg0 && var10.field226 == arg1 && var10.field244 == arg2 && var10.field225 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field227 = arg0;
            var9.field225 = arg3;
            var9.field226 = arg1;
            var9.field244 = arg2;
            method3(var9);
            field423.method3545(var9);
        }
        var9.field231 = arg4;
        var9.field237 = arg5;
        var9.field232 = arg6;
        var9.field234 = arg7;
        var9.field239 = arg8;
    }

    @ObfuscatedName("i.br(Lx;B)V")
    public static final void method3(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field225 == 0) {
            var1 = Statics.field841.method1754(arg0.field227, arg0.field226, arg0.field244);
        }
        if (arg0.field225 == 1) {
            var1 = Statics.field841.method1755(arg0.field227, arg0.field226, arg0.field244);
        }
        if (arg0.field225 == 2) {
            var1 = Statics.field841.method1756(arg0.field227, arg0.field226, arg0.field244);
        }
        if (arg0.field225 == 3) {
            var1 = Statics.field841.method1757(arg0.field227, arg0.field226, arg0.field244);
        }
        if (var1 != 0) {
            int var5 = Statics.field841.method1758(arg0.field227, arg0.field226, arg0.field244, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field236 = var2;
        arg0.field230 = var3;
        arg0.field229 = var4;
    }

    @ObfuscatedName("p.bk(S)V")
    public static final void method92() {
        for (class17 var0 = (class17) field423.method3535(); var0 != null; var0 = (class17) field423.method3537()) {
            if (var0.field239 > 0) {
                var0.field239--;
            }
            if (var0.field239 == 0) {
                if (var0.field236 >= 0) {
                    int var1 = var0.field236;
                    int var2 = var0.field230;
                    class41 var3 = class41.method1443(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method751(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method931(var0.field227, var0.field225, var0.field226, var0.field244, var0.field236, var0.field229, var0.field230);
                var0.method3624();
            } else {
                if (var0.field234 > 0) {
                    var0.field234--;
                }
                if (var0.field234 == 0 && var0.field226 >= 1 && var0.field244 >= 1 && var0.field226 <= 102 && var0.field244 <= 102) {
                    if (var0.field231 >= 0) {
                        int var5 = var0.field231;
                        int var6 = var0.field237;
                        class41 var7 = class41.method1443(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method751(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method931(var0.field227, var0.field225, var0.field226, var0.field244, var0.field231, var0.field232, var0.field237);
                    var0.field234 = -1;
                    if (var0.field236 == var0.field231 && var0.field236 == -1) {
                        var0.method3624();
                    } else if (var0.field236 == var0.field231 && var0.field232 == var0.field229 && var0.field237 == var0.field230) {
                        var0.method3624();
                    }
                }
            }
        }
    }

    @ObfuscatedName("an.bh(IIIIIIIB)V")
    public static final void method931(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field353 && Statics.field1963 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field841.method1754(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field841.method1755(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field841.method1756(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field841.method1757(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field841.method1758(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field841.method1745(arg0, arg2, arg3);
                class41 var15 = class41.method1443(var12);
                if (var15.field953 != 0) {
                    field537[arg0].method2193(arg2, arg3, var13, var14, var15.field954);
                }
            }
            if (arg1 == 1) {
                Statics.field841.method1746(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field841.method1747(arg0, arg2, arg3);
                class41 var16 = class41.method1443(var12);
                if (var16.field944 + arg2 > 103 || var16.field944 + arg3 > 103 || var16.field952 + arg2 > 103 || var16.field952 + arg3 > 103) {
                    return;
                }
                if (var16.field953 != 0) {
                    field537[arg0].method2194(arg2, arg3, var16.field944, var16.field952, var14, var16.field954);
                }
            }
            if (arg1 == 3) {
                Statics.field841.method1748(arg0, arg2, arg3);
                class41 var17 = class41.method1443(var12);
                if (var17.field953 == 1) {
                    field537[arg0].method2196(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field98[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class6.method2692(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field841, field537[arg0]);
    }

    @ObfuscatedName("x.bg(III)V")
    public static final void method167(int arg0, int arg1) {
        class199 var2 = field437[Statics.field1963][arg0][arg1];
        if (var2 == null) {
            Statics.field841.method1749(Statics.field1963, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3535(); var6 != null; var6 = (class29) var2.method3537()) {
            class52 var7 = class52.method2618(var6.field676);
            long var8 = (long) var7.field1117;
            if (var7.field1129 == 1) {
                var8 = (long) (var6.field679 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field841.method1749(Statics.field1963, arg0, arg1);
            return;
        }
        var2.method3531(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3535(); var12 != null; var12 = (class29) var2.method3537()) {
            if (var5.field676 != var12.field676) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field676 != var12.field676 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field841.method1735(Statics.field1963, arg0, arg1, method601(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1963), var5, var13, var10, var11);
    }

    @ObfuscatedName("ai.bz(ZI)V")
    public static final void method697(boolean arg0) {
        field415 = 0;
        field331 = 0;
        method534();
        method160(arg0);
        Statics.method856();
        for (int var1 = 0; var1 < field415; var1++) {
            int var2 = field416[var1];
            if (field302 != field470[var2].field872) {
                field470[var2].field790 = null;
                field470[var2] = null;
            }
        }
        if (field384 != field335.field1984) {
            throw new RuntimeException(field335.field1984 + class2.field21 + field384);
        }
        for (int var3 = 0; var3 < field329; var3++) {
            if (field470[field330[var3]] == null) {
                throw new RuntimeException(var3 + class2.field21 + field329);
            }
        }
    }

    @ObfuscatedName("u.be(I)V")
    public static final void method534() {
        field335.method2551();
        int var0 = field335.method2567(8);
        if (var0 < field329) {
            for (int var1 = var0; var1 < field329; var1++) {
                field416[++field415 - 1] = field330[var1];
            }
        }
        if (var0 > field329) {
            throw new RuntimeException("");
        }
        field329 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field330[var2];
            class35 var4 = field470[var3];
            int var5 = field335.method2567(1);
            if (var5 == 0) {
                field330[++field329 - 1] = var3;
                var4.field872 = field302;
            } else {
                int var6 = field335.method2567(2);
                if (var6 == 0) {
                    field330[++field329 - 1] = var3;
                    var4.field872 = field302;
                    field332[++field331 - 1] = var3;
                } else if (var6 == 1) {
                    field330[++field329 - 1] = var3;
                    var4.field872 = field302;
                    int var7 = field335.method2567(3);
                    var4.method673(var7, (byte) 1);
                    int var8 = field335.method2567(1);
                    if (var8 == 1) {
                        field332[++field331 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field330[++field329 - 1] = var3;
                    var4.field872 = field302;
                    int var9 = field335.method2567(3);
                    var4.method673(var9, (byte) 2);
                    int var10 = field335.method2567(3);
                    var4.method673(var10, (byte) 2);
                    int var11 = field335.method2567(1);
                    if (var11 == 1) {
                        field332[++field331 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field416[++field415 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("g.bf(ZB)V")
    public static final void method160(boolean arg0) {
        while (true) {
            if (field335.method2554(field384) >= 27) {
                int var1 = field335.method2567(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field470[var1] == null) {
                        field470[var1] = new class35();
                        var2 = true;
                    }
                    class35 var3 = field470[var1];
                    field330[++field329 - 1] = var1;
                    var3.field872 = field302;
                    int var4 = field288[field335.method2567(3)];
                    if (var2) {
                        var3.field874 = var3.field826 = var4;
                    }
                    int var5 = field335.method2567(1);
                    if (var5 == 1) {
                        field332[++field331 - 1] = var1;
                    }
                    int var6;
                    if (arg0) {
                        var6 = field335.method2567(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = field335.method2567(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    int var7;
                    if (arg0) {
                        var7 = field335.method2567(8);
                        if (var7 > 127) {
                            var7 -= 256;
                        }
                    } else {
                        var7 = field335.method2567(5);
                        if (var7 > 15) {
                            var7 -= 32;
                        }
                    }
                    int var8 = field335.method2567(1);
                    var3.field790 = class40.method151(field335.method2567(14));
                    var3.field828 = var3.field790.field903;
                    var3.field884 = var3.field790.field906;
                    if (var3.field884 == 0) {
                        var3.field826 = 0;
                    }
                    var3.field857 = var3.field790.field913;
                    var3.field876 = var3.field790.field910;
                    var3.field883 = var3.field790.field917;
                    var3.field835 = var3.field790.field912;
                    var3.field829 = var3.field790.field901;
                    var3.field827 = var3.field790.field907;
                    var3.field831 = var3.field790.field908;
                    var3.method672(Statics.field162.field878[0] + var7, Statics.field162.field879[0] + var6, var8 == 1);
                    continue;
                }
            }
            field335.method2552();
            return;
        }
    }

    @ObfuscatedName("fc.bl(Lf;IIBI)V")
    public static final void method2941(class3 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field878[0];
        int var5 = arg0.field879[0];
        int var6 = arg0.method16();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method16();
        field568.field1870 = arg1;
        field568.field1869 = arg2;
        field568.field1866 = 1;
        field568.field1867 = 1;
        class11 var8 = field568;
        class11 var9 = var8;
        class108 var10 = field537[arg0.field55];
        int[] var11 = field569;
        int[] var12 = field570;
        for (int var13 = 0; var13 < 128; var13++) {
            for (int var14 = 0; var14 < 128; var14++) {
                class106.field1855[var13][var14] = 0;
                class106.field1861[var13][var14] = 99999999;
            }
        }
        boolean var15;
        if (var7 == 1) {
            var15 = class106.method2730(var4, var5, var8, var10);
        } else if (var7 == 2) {
            var15 = class106.method609(var4, var5, var8, var10);
        } else {
            int var16 = var4;
            int var17 = var5;
            byte var18 = 64;
            byte var19 = 64;
            int var20 = var4 - var18;
            int var21 = var5 - var19;
            class106.field1855[var18][var19] = 99;
            class106.field1861[var18][var19] = 0;
            byte var22 = 0;
            int var23 = 0;
            class106.field1858[var22] = var4;
            int var64 = var22 + 1;
            class106.field1859[var22] = var5;
            int[][] var24 = var10.field1888;
            boolean var29;
            label421: while (true) {
                label419: while (true) {
                    int var25;
                    int var26;
                    int var27;
                    int var28;
                    int var30;
                    do {
                        do {
                            do {
                                label396: do {
                                    if (var64 == var23) {
                                        Statics.field95 = var16;
                                        Statics.field216 = var17;
                                        var29 = false;
                                        break label421;
                                    }
                                    var16 = class106.field1858[var23];
                                    var17 = class106.field1859[var23];
                                    var23 = var23 + 1 & 0xFFF;
                                    var25 = var16 - var20;
                                    var26 = var17 - var21;
                                    var27 = var16 - var10.field1877;
                                    var28 = var17 - var10.field1884;
                                    if (var9.method126(var7, var16, var17, var10)) {
                                        Statics.field95 = var16;
                                        Statics.field216 = var17;
                                        var29 = true;
                                        break label421;
                                    }
                                    var30 = class106.field1861[var25][var26] + 1;
                                    if (var25 > 0 && class106.field1855[var25 - 1][var26] == 0 && (var24[var27 - 1][var28] & 0x124010E) == 0 && (var24[var27 - 1][var7 + var28 - 1] & 0x1240138) == 0) {
                                        int var31 = 1;
                                        while (true) {
                                            if (var31 >= var7 - 1) {
                                                class106.field1858[var64] = var16 - 1;
                                                class106.field1859[var64] = var17;
                                                var64 = var64 + 1 & 0xFFF;
                                                class106.field1855[var25 - 1][var26] = 2;
                                                class106.field1861[var25 - 1][var26] = var30;
                                                break;
                                            }
                                            if ((var24[var27 - 1][var28 + var31] & 0x124013E) != 0) {
                                                break;
                                            }
                                            var31++;
                                        }
                                    }
                                    if (var25 < 128 - var7 && class106.field1855[var25 + 1][var26] == 0 && (var24[var7 + var27][var28] & 0x1240183) == 0 && (var24[var7 + var27][var7 + var28 - 1] & 0x12401E0) == 0) {
                                        int var32 = 1;
                                        while (true) {
                                            if (var32 >= var7 - 1) {
                                                class106.field1858[var64] = var16 + 1;
                                                class106.field1859[var64] = var17;
                                                var64 = var64 + 1 & 0xFFF;
                                                class106.field1855[var25 + 1][var26] = 8;
                                                class106.field1861[var25 + 1][var26] = var30;
                                                break;
                                            }
                                            if ((var24[var7 + var27][var28 + var32] & 0x12401E3) != 0) {
                                                break;
                                            }
                                            var32++;
                                        }
                                    }
                                    if (var26 > 0 && class106.field1855[var25][var26 - 1] == 0 && (var24[var27][var28 - 1] & 0x124010E) == 0 && (var24[var7 + var27 - 1][var28 - 1] & 0x1240183) == 0) {
                                        int var33 = 1;
                                        while (true) {
                                            if (var33 >= var7 - 1) {
                                                class106.field1858[var64] = var16;
                                                class106.field1859[var64] = var17 - 1;
                                                var64 = var64 + 1 & 0xFFF;
                                                class106.field1855[var25][var26 - 1] = 1;
                                                class106.field1861[var25][var26 - 1] = var30;
                                                break;
                                            }
                                            if ((var24[var27 + var33][var28 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var33++;
                                        }
                                    }
                                    if (var26 < 128 - var7 && class106.field1855[var25][var26 + 1] == 0 && (var24[var27][var7 + var28] & 0x1240138) == 0 && (var24[var7 + var27 - 1][var7 + var28] & 0x12401E0) == 0) {
                                        int var34 = 1;
                                        while (true) {
                                            if (var34 >= var7 - 1) {
                                                class106.field1858[var64] = var16;
                                                class106.field1859[var64] = var17 + 1;
                                                var64 = var64 + 1 & 0xFFF;
                                                class106.field1855[var25][var26 + 1] = 4;
                                                class106.field1861[var25][var26 + 1] = var30;
                                                break;
                                            }
                                            if ((var24[var27 + var34][var7 + var28] & 0x12401F8) != 0) {
                                                break;
                                            }
                                            var34++;
                                        }
                                    }
                                    if (var25 > 0 && var26 > 0 && class106.field1855[var25 - 1][var26 - 1] == 0 && (var24[var27 - 1][var28 - 1] & 0x124010E) == 0) {
                                        int var35 = 1;
                                        while (true) {
                                            if (var35 >= var7) {
                                                class106.field1858[var64] = var16 - 1;
                                                class106.field1859[var64] = var17 - 1;
                                                var64 = var64 + 1 & 0xFFF;
                                                class106.field1855[var25 - 1][var26 - 1] = 3;
                                                class106.field1861[var25 - 1][var26 - 1] = var30;
                                                break;
                                            }
                                            if ((var24[var27 - 1][var28 - 1 + var35] & 0x124013E) != 0 || (var24[var27 - 1 + var35][var28 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var35++;
                                        }
                                    }
                                    if (var25 < 128 - var7 && var26 > 0 && class106.field1855[var25 + 1][var26 - 1] == 0 && (var24[var7 + var27][var28 - 1] & 0x1240183) == 0) {
                                        int var36 = 1;
                                        while (true) {
                                            if (var36 >= var7) {
                                                class106.field1858[var64] = var16 + 1;
                                                class106.field1859[var64] = var17 - 1;
                                                var64 = var64 + 1 & 0xFFF;
                                                class106.field1855[var25 + 1][var26 - 1] = 9;
                                                class106.field1861[var25 + 1][var26 - 1] = var30;
                                                break;
                                            }
                                            if ((var24[var7 + var27][var28 - 1 + var36] & 0x12401E3) != 0 || (var24[var27 + var36][var28 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var36++;
                                        }
                                    }
                                    if (var25 > 0 && var26 < 128 - var7 && class106.field1855[var25 - 1][var26 + 1] == 0 && (var24[var27 - 1][var7 + var28] & 0x1240138) == 0) {
                                        for (int var37 = 1; var37 < var7; var37++) {
                                            if ((var24[var27 - 1][var28 + var37] & 0x124013E) != 0 || (var24[var27 - 1 + var37][var7 + var28] & 0x12401F8) != 0) {
                                                continue label396;
                                            }
                                        }
                                        class106.field1858[var64] = var16 - 1;
                                        class106.field1859[var64] = var17 + 1;
                                        var64 = var64 + 1 & 0xFFF;
                                        class106.field1855[var25 - 1][var26 + 1] = 6;
                                        class106.field1861[var25 - 1][var26 + 1] = var30;
                                    }
                                } while (var25 >= 128 - var7);
                            } while (var26 >= 128 - var7);
                        } while (class106.field1855[var25 + 1][var26 + 1] != 0);
                    } while ((var24[var7 + var27][var7 + var28] & 0x12401E0) != 0);
                    for (int var38 = 1; var38 < var7; var38++) {
                        if ((var24[var27 + var38][var7 + var28] & 0x12401F8) != 0 || (var24[var7 + var27][var28 + var38] & 0x12401E3) != 0) {
                            continue label419;
                        }
                    }
                    class106.field1858[var64] = var16 + 1;
                    class106.field1859[var64] = var17 + 1;
                    var64 = var64 + 1 & 0xFFF;
                    class106.field1855[var25 + 1][var26 + 1] = 12;
                    class106.field1861[var25 + 1][var26 + 1] = var30;
                }
            }
            var15 = var29;
        }
        int var57;
        label467: {
            int var39 = var4 - 64;
            int var40 = var5 - 64;
            int var41 = Statics.field95;
            int var42 = Statics.field216;
            if (!var15) {
                int var43 = Integer.MAX_VALUE;
                int var44 = Integer.MAX_VALUE;
                byte var45 = 10;
                int var46 = var9.field1870;
                int var47 = var9.field1869;
                int var48 = var9.field1866;
                int var49 = var9.field1867;
                for (int var50 = var46 - var45; var50 <= var45 + var46; var50++) {
                    for (int var51 = var47 - var45; var51 <= var45 + var47; var51++) {
                        int var52 = var50 - var39;
                        int var53 = var51 - var40;
                        if (var52 >= 0 && var53 >= 0 && var52 < 128 && var53 < 128 && class106.field1861[var52][var53] < 100) {
                            int var54 = 0;
                            if (var50 < var46) {
                                var54 = var46 - var50;
                            } else if (var50 > var46 + var48 - 1) {
                                var54 = var50 - (var46 + var48 - 1);
                            }
                            int var55 = 0;
                            if (var51 < var47) {
                                var55 = var47 - var51;
                            } else if (var51 > var47 + var49 - 1) {
                                var55 = var51 - (var47 + var49 - 1);
                            }
                            int var56 = var54 * var54 + var55 * var55;
                            if (var56 < var43 || var43 == var56 && class106.field1861[var52][var53] < var44) {
                                var43 = var56;
                                var44 = class106.field1861[var52][var53];
                                var41 = var50;
                                var42 = var51;
                            }
                        }
                    }
                }
                if (var43 == Integer.MAX_VALUE) {
                    var57 = -1;
                    break label467;
                }
            }
            if (var4 == var41 && var5 == var42) {
                var57 = 0;
            } else {
                byte var58 = 0;
                class106.field1858[var58] = var41;
                int var65 = var58 + 1;
                class106.field1859[var58] = var42;
                int var59;
                int var60 = var59 = class106.field1855[var41 - var39][var42 - var40];
                while (var4 != var41 || var5 != var42) {
                    if (var59 != var60) {
                        var59 = var60;
                        class106.field1858[var65] = var41;
                        class106.field1859[var65++] = var42;
                    }
                    if ((var60 & 0x2) != 0) {
                        var41++;
                    } else if ((var60 & 0x8) != 0) {
                        var41--;
                    }
                    if ((var60 & 0x1) != 0) {
                        var42++;
                    } else if ((var60 & 0x4) != 0) {
                        var42--;
                    }
                    var60 = class106.field1855[var41 - var39][var42 - var40];
                }
                int var61 = 0;
                while (var65-- > 0) {
                    var11[var61] = class106.field1858[var65];
                    var12[var61++] = class106.field1859[var65];
                    if (var61 >= var11.length) {
                        break;
                    }
                }
                var57 = var61;
            }
        }
        int var62 = var57;
        if (var57 >= 1) {
            for (int var63 = 0; var63 < var62 - 1; var63++) {
                arg0.method19(field569[var63], field570[var63], arg3);
            }
        }
    }

    @ObfuscatedName("am.ba(III)V")
    public static final void method859(int arg0, int arg1) {
        if (field449 < 2 && field442 == 0 && !field444) {
            return;
        }
        String var2;
        if (field442 == 1 && field449 < 2) {
            var2 = class157.field2420 + class157.field2468 + field443 + " " + class2.field25;
        } else if (field444 && field449 < 2) {
            var2 = field447 + class157.field2468 + field341 + " " + class2.field25;
        } else {
            int var3 = field449 - 1;
            String var4;
            if (field313[var3].length() > 0) {
                var4 = field465[var3] + class157.field2468 + field313[var3];
            } else {
                var4 = field465[var3];
            }
            var2 = var4;
        }
        if (field449 > 2) {
            var2 = var2 + class2.method2892(16777215) + " " + '/' + " " + (field449 - 2) + class157.field2508;
        }
        Statics.field1093.method3731(var2, arg0 + 4, arg1 + 15, 16777215, 0, field302 / 1000);
    }

    @ObfuscatedName("aj.bu(I)V")
    public static final void method745() {
        int var0 = Statics.field753;
        int var1 = Statics.field2983;
        int var2 = Statics.field121;
        int var3 = Statics.field30;
        int var4 = 6116423;
        class80.method1638(var0, var1, var2, var3, var4);
        class80.method1638(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class80.method1688(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field1093.method3724(class157.field2461, var0 + 3, var1 + 14, var4, -1);
        int var5 = class140.field2143;
        int var6 = class140.field2139 * 869381013;
        for (int var7 = 0; var7 < field449; var7++) {
            int var8 = (field449 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class224 var10 = Statics.field1093;
            String var11;
            if (field313[var7].length() > 0) {
                var11 = field465[var7] + class157.field2468 + field313[var7];
            } else {
                var11 = field465[var7];
            }
            var10.method3724(var11, var0 + 3, var8, var9, 0);
        }
        int var12 = Statics.field753;
        int var13 = Statics.field2983;
        int var14 = Statics.field121;
        int var15 = Statics.field30;
        for (int var16 = 0; var16 < field492; var16++) {
            if (field499[var16] + field497[var16] > var12 && field497[var16] < var12 + var14 && field531[var16] + field340[var16] > var13 && field340[var16] < var13 + var15) {
                field557[var16] = true;
            }
        }
    }

    @ObfuscatedName("fw.bo(IIIII)V")
    public static final void method2990(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field492; var4++) {
            if (field499[var4] + field497[var4] > arg0 && field497[var4] < arg0 + arg2 && field531[var4] + field340[var4] > arg1 && field340[var4] < arg1 + arg3) {
                field494[var4] = true;
            }
        }
    }

    @ObfuscatedName("y.bj(I)V")
    public static final void method545() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field449 - 1; var1++) {
                if (field290[var1] < 1000 && field290[var1 + 1] > 1000) {
                    String var2 = field313[var1];
                    field313[var1] = field313[var1 + 1];
                    field313[var1 + 1] = var2;
                    String var3 = field465[var1];
                    field465[var1] = field465[var1 + 1];
                    field465[var1 + 1] = var3;
                    int var4 = field290[var1];
                    field290[var1] = field290[var1 + 1];
                    field290[var1 + 1] = var4;
                    int var5 = field432[var1];
                    field432[var1] = field432[var1 + 1];
                    field432[var1 + 1] = var5;
                    int var6 = field433[var1];
                    field433[var1] = field433[var1 + 1];
                    field433[var1 + 1] = var6;
                    int var7 = field435[var1];
                    field435[var1] = field435[var1 + 1];
                    field435[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
        if (Statics.field574 != null || field462 != null) {
            return;
        }
        int var8 = class140.field2138;
        if (field525) {
            if (var8 != 1 && (Statics.field1652 || var8 != 4)) {
                int var9 = class140.field2143;
                int var10 = class140.field2139 * 869381013;
                if (var9 < Statics.field753 - 10 || var9 > Statics.field753 + Statics.field121 + 10 || var10 < Statics.field2983 - 10 || var10 > Statics.field30 + Statics.field2983 + 10) {
                    field525 = false;
                    method2990(Statics.field753, Statics.field2983, Statics.field121, Statics.field30);
                }
            }
            if (var8 == 1 || !Statics.field1652 && var8 == 4) {
                int var11 = Statics.field753;
                int var12 = Statics.field2983;
                int var13 = Statics.field121;
                int var14 = class140.field2145;
                int var15 = class140.field2136;
                int var16 = -1;
                for (int var17 = 0; var17 < field449; var17++) {
                    int var18 = (field449 - 1 - var17) * 15 + var12 + 31;
                    if (var14 > var11 && var14 < var11 + var13 && var15 > var18 - 13 && var15 < var18 + 3) {
                        var16 = var17;
                    }
                }
                if (var16 != -1 && var16 >= 0) {
                    int var19 = field432[var16];
                    int var20 = field433[var16];
                    int var21 = field290[var16];
                    int var22 = field435[var16];
                    String var23 = field465[var16];
                    String var24 = field313[var16];
                    method55(var19, var20, var21, var22, var23, var24, class140.field2145, class140.field2136);
                }
                field525 = false;
                method2990(Statics.field753, Statics.field2983, Statics.field121, Statics.field30);
            }
            return;
        }
        if ((var8 == 1 || !Statics.field1652 && var8 == 4) && field449 > 0) {
            int var25 = field290[field449 - 1];
            if (var25 == 39 || var25 == 40 || var25 == 41 || var25 == 42 || var25 == 43 || var25 == 33 || var25 == 34 || var25 == 35 || var25 == 36 || var25 == 37 || var25 == 38 || var25 == 1005) {
                int var26 = field432[field449 - 1];
                int var27 = field433[field449 - 1];
                class173 var28 = class173.method2988(var27);
                if (class178.method709(method572(var28)) || class178.method3157(method572(var28))) {
                    if (Statics.field574 != null && !field328 && field429 != 1) {
                        int var29 = field449 - 1;
                        boolean var30;
                        if (var29 < 0) {
                            var30 = false;
                        } else {
                            int var31 = field290[var29];
                            if (var31 >= 2000) {
                                var31 -= 2000;
                            }
                            if (var31 == 1007) {
                                var30 = true;
                            } else {
                                var30 = false;
                            }
                        }
                        if (!var30 && field449 > 0) {
                            int var32 = field382;
                            int var33 = field407;
                            class31 var34 = Statics.field99;
                            method55(var34.field710, var34.field717, var34.field707, var34.field705, var34.field718, var34.field718, var32, var33);
                            Statics.field99 = null;
                        }
                    }
                    field328 = false;
                    field410 = 0;
                    if (Statics.field574 != null) {
                        method645(Statics.field574);
                    }
                    Statics.field574 = class173.method2988(var27);
                    field405 = var26;
                    field382 = class140.field2145;
                    field407 = class140.field2136;
                    if (field449 > 0) {
                        method105(field449 - 1);
                    }
                    method645(Statics.field574);
                    return;
                }
            }
        }
        if (var8 == 1 || !Statics.field1652 && var8 == 4) {
            label248: {
                if (field429 != 1 || field449 <= 2) {
                    int var35 = field449 - 1;
                    boolean var36;
                    if (var35 < 0) {
                        var36 = false;
                    } else {
                        int var37 = field290[var35];
                        if (var37 >= 2000) {
                            var37 -= 2000;
                        }
                        if (var37 == 1007) {
                            var36 = true;
                        } else {
                            var36 = false;
                        }
                    }
                    if (!var36) {
                        break label248;
                    }
                }
                var8 = 2;
            }
        }
        if ((var8 == 1 || !Statics.field1652 && var8 == 4) && field449 > 0) {
            int var38 = field449 - 1;
            if (var38 >= 0) {
                int var39 = field432[var38];
                int var40 = field433[var38];
                int var41 = field290[var38];
                int var42 = field435[var38];
                String var43 = field465[var38];
                String var44 = field313[var38];
                method55(var39, var40, var41, var42, var43, var44, class140.field2145, class140.field2136);
            }
        }
        if (var8 == 2 && field449 > 0) {
            method2910(class140.field2145, class140.field2136);
        }
    }

    @ObfuscatedName("ef.bq(III)V")
    public static final void method2910(int arg0, int arg1) {
        int var2 = Statics.field1093.method3794(class157.field2461);
        for (int var3 = 0; var3 < field449; var3++) {
            class224 var4 = Statics.field1093;
            String var5;
            if (field313[var3].length() > 0) {
                var5 = field465[var3] + class157.field2468 + field313[var3];
            } else {
                var5 = field465[var3];
            }
            int var6 = var4.method3794(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field449 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field2656) {
            var8 = Statics.field2656 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field2160) {
            var9 = Statics.field2160 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field525 = true;
        Statics.field753 = var8;
        Statics.field2983 = var9;
        Statics.field121 = var2;
        Statics.field30 = field449 * 15 + 22;
    }

    @ObfuscatedName("a.bx(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method55(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 26) {
            field295.method2549(228);
            for (class4 var8 = (class4) field450.method3496(); var8 != null; var8 = (class4) field450.method3500()) {
                if (var8.field62 == 0 || var8.field62 == 3) {
                    method711(var8, true);
                }
            }
            if (field421 != null) {
                method645(field421);
                field421 = null;
            }
        }
        if (arg2 == 1001) {
            field399 = arg6;
            field516 = arg7;
            field402 = 2;
            field389 = 0;
            field523 = arg0;
            field471 = arg1;
            field295.method2549(113);
            field295.method2335(class137.field2097[82] ? 1 : 0);
            field295.method2466(Statics.field934 + arg1);
            field295.method2341(arg3 >> 14 & 0x7FFF);
            field295.method2341(Statics.field2644 + arg0);
        }
        if (arg2 == 48) {
            class3 var9 = field412[arg3];
            if (var9 != null) {
                field399 = arg6;
                field516 = arg7;
                field402 = 2;
                field389 = 0;
                field523 = arg0;
                field471 = arg1;
                field295.method2549(178);
                field295.method2341(arg3);
                field295.method2334(class137.field2097[82] ? 1 : 0);
            }
        }
        if (arg2 == 16) {
            field399 = arg6;
            field516 = arg7;
            field402 = 2;
            field389 = 0;
            field523 = arg0;
            field471 = arg1;
            field295.method2549(27);
            field295.method2381(Statics.field134);
            field295.method2343(Statics.field934 + arg1);
            field295.method2341(arg3);
            field295.method2343(Statics.field2644 + arg0);
            field295.method2351(Statics.field2284);
            field295.method2381(Statics.field892);
            field295.method2430(class137.field2097[82] ? 1 : 0);
        }
        if (arg2 == 1005) {
            class173 var10 = class173.method2988(arg1);
            if (var10 == null || var10.field2857[arg0] < 100000) {
                field295.method2549(39);
                field295.method2343(arg3);
            } else {
                class12.method930(27, "", var10.field2857[arg0] + " x " + class52.method2618(arg3).field1137);
            }
            field403 = 0;
            Statics.field2692 = class173.method2988(arg1);
            field347 = arg0;
        }
        if (arg2 == 34) {
            field295.method2549(115);
            field295.method2352(arg1);
            field295.method2343(arg3);
            field295.method2341(arg0);
            field403 = 0;
            Statics.field2692 = class173.method2988(arg1);
            field347 = arg0;
        }
        if (arg2 == 1004) {
            field399 = arg6;
            field516 = arg7;
            field402 = 2;
            field389 = 0;
            field295.method2549(39);
            field295.method2343(arg3);
        }
        if (arg2 == 1) {
            field399 = arg6;
            field516 = arg7;
            field402 = 2;
            field389 = 0;
            field523 = arg0;
            field471 = arg1;
            field295.method2549(222);
            field295.method2299(Statics.field2284);
            field295.method2466(arg3 >> 14 & 0x7FFF);
            field295.method2381(Statics.field934 + arg1);
            field295.method2343(Statics.field2644 + arg0);
            field295.method2381(Statics.field892);
            field295.method2335(class137.field2097[82] ? 1 : 0);
            field295.method2466(Statics.field134);
        }
        if (arg2 == 29) {
            field295.method2549(189);
            field295.method2299(arg1);
            class173 var11 = class173.method2988(arg1);
            if (var11.field2845 != null && var11.field2845[0][0] == 5) {
                int var12 = var11.field2845[0][1];
                if (class176.field2895[var12] != var11.field2852[0]) {
                    class176.field2895[var12] = var11.field2852[0];
                    method116(var12);
                }
            }
        }
        if (arg2 == 37) {
            field295.method2549(59);
            field295.method2353(arg1);
            field295.method2381(arg3);
            field295.method2341(arg0);
            field403 = 0;
            Statics.field2692 = class173.method2988(arg1);
            field347 = arg0;
        }
        if (arg2 == 44) {
            class3 var13 = field412[arg3];
            if (var13 != null) {
                field399 = arg6;
                field516 = arg7;
                field402 = 2;
                field389 = 0;
                field523 = arg0;
                field471 = arg1;
                field295.method2549(25);
                field295.method2296(class137.field2097[82] ? 1 : 0);
                field295.method2343(arg3);
            }
        }
        if (arg2 == 11) {
            class35 var14 = field470[arg3];
            if (var14 != null) {
                field399 = arg6;
                field516 = arg7;
                field402 = 2;
                field389 = 0;
                field523 = arg0;
                field471 = arg1;
                field295.method2549(157);
                field295.method2296(class137.field2097[82] ? 1 : 0);
                field295.method2381(arg3);
            }
        }
        if (arg2 == 8) {
            class35 var15 = field470[arg3];
            if (var15 != null) {
                field399 = arg6;
                field516 = arg7;
                field402 = 2;
                field389 = 0;
                field523 = arg0;
                field471 = arg1;
                field295.method2549(29);
                field295.method2343(arg3);
                field295.method2353(Statics.field1997);
                field295.method2430(class137.field2097[82] ? 1 : 0);
                field295.method2466(field454);
            }
        }
        if (arg2 == 6) {
            field399 = arg6;
            field516 = arg7;
            field402 = 2;
            field389 = 0;
            field523 = arg0;
            field471 = arg1;
            field295.method2549(40);
            field295.method2343(Statics.field934 + arg1);
            field295.method2343(Statics.field2644 + arg0);
            field295.method2381(arg3 >> 14 & 0x7FFF);
            field295.method2335(class137.field2097[82] ? 1 : 0);
        }
        if (arg2 == 28) {
            field295.method2549(189);
            field295.method2299(arg1);
            class173 var16 = class173.method2988(arg1);
            if (var16.field2845 != null && var16.field2845[0][0] == 5) {
                int var17 = var16.field2845[0][1];
                class176.field2895[var17] = 1 - class176.field2895[var17];
                method116(var17);
            }
        }
        if (arg2 == 31) {
            field295.method2549(188);
            field295.method2353(arg1);
            field295.method2341(arg0);
            field295.method2299(Statics.field2284);
            field295.method2466(Statics.field134);
            field295.method2381(Statics.field892);
            field295.method2381(arg3);
            field403 = 0;
            Statics.field2692 = class173.method2988(arg1);
            field347 = arg0;
        }
        if (arg2 == 12) {
            class35 var18 = field470[arg3];
            if (var18 != null) {
                field399 = arg6;
                field516 = arg7;
                field402 = 2;
                field389 = 0;
                field523 = arg0;
                field471 = arg1;
                field295.method2549(110);
                field295.method2430(class137.field2097[82] ? 1 : 0);
                field295.method2381(arg3);
            }
        }
        if (arg2 == 45) {
            class3 var19 = field412[arg3];
            if (var19 != null) {
                field399 = arg6;
                field516 = arg7;
                field402 = 2;
                field389 = 0;
                field523 = arg0;
                field471 = arg1;
                field295.method2549(141);
                field295.method2296(class137.field2097[82] ? 1 : 0);
                field295.method2466(arg3);
            }
        }
        if (arg2 == 47) {
            class3 var20 = field412[arg3];
            if (var20 != null) {
                field399 = arg6;
                field516 = arg7;
                field402 = 2;
                field389 = 0;
                field523 = arg0;
                field471 = arg1;
                field295.method2549(67);
                field295.method2343(arg3);
                field295.method2296(class137.field2097[82] ? 1 : 0);
            }
        }
        if (arg2 == 30 && field421 == null) {
            method2694(arg1, arg0);
            field421 = class173.method834(arg1, arg0);
            method645(field421);
        }
        if (arg2 == 3) {
            field399 = arg6;
            field516 = arg7;
            field402 = 2;
            field389 = 0;
            field523 = arg0;
            field471 = arg1;
            field295.method2549(83);
            field295.method2343(Statics.field2644 + arg0);
            field295.method2334(class137.field2097[82] ? 1 : 0);
            field295.method2341(arg3 >> 14 & 0x7FFF);
            field295.method2341(Statics.field934 + arg1);
        }
        if (arg2 == 20) {
            field399 = arg6;
            field516 = arg7;
            field402 = 2;
            field389 = 0;
            field523 = arg0;
            field471 = arg1;
            field295.method2549(139);
            field295.method2343(arg3);
            field295.method2334(class137.field2097[82] ? 1 : 0);
            field295.method2343(Statics.field2644 + arg0);
            field295.method2343(Statics.field934 + arg1);
        }
        if (arg2 == 49) {
            class3 var21 = field412[arg3];
            if (var21 != null) {
                field399 = arg6;
                field516 = arg7;
                field402 = 2;
                field389 = 0;
                field523 = arg0;
                field471 = arg1;
                field295.method2549(201);
                field295.method2430(class137.field2097[82] ? 1 : 0);
                field295.method2341(arg3);
            }
        }
        if (arg2 == 7) {
            class35 var22 = field470[arg3];
            if (var22 != null) {
                field399 = arg6;
                field516 = arg7;
                field402 = 2;
                field389 = 0;
                field523 = arg0;
                field471 = arg1;
                field295.method2549(235);
                field295.method2351(Statics.field2284);
                field295.method2381(Statics.field134);
                field295.method2381(arg3);
                field295.method2341(Statics.field892);
                field295.method2335(class137.field2097[82] ? 1 : 0);
            }
        }
        if (arg2 == 5) {
            field399 = arg6;
            field516 = arg7;
            field402 = 2;
            field389 = 0;
            field523 = arg0;
            field471 = arg1;
            field295.method2549(62);
            field295.method2341(arg3 >> 14 & 0x7FFF);
            field295.method2341(Statics.field934 + arg1);
            field295.method2341(Statics.field2644 + arg0);
            field295.method2334(class137.field2097[82] ? 1 : 0);
        }
        if (arg2 == 24) {
            class173 var23 = class173.method2988(arg1);
            boolean var24 = true;
            if (var23.field2744 > 0) {
                var24 = method143(var23);
            }
            if (var24) {
                field295.method2549(189);
                field295.method2299(arg1);
            }
        }
        if (arg2 == 23) {
            Statics.field841.method1765(Statics.field1963, arg0, arg1);
        }
        if (arg2 == 2) {
            field399 = arg6;
            field516 = arg7;
            field402 = 2;
            field389 = 0;
            field523 = arg0;
            field471 = arg1;
            field295.method2549(214);
            field295.method2343(arg3 >> 14 & 0x7FFF);
            field295.method2343(Statics.field934 + arg1);
            field295.method2341(field454);
            field295.method2352(Statics.field1997);
            field295.method2430(class137.field2097[82] ? 1 : 0);
            field295.method2343(Statics.field2644 + arg0);
        }
        if (arg2 == 1002) {
            field399 = arg6;
            field516 = arg7;
            field402 = 2;
            field389 = 0;
            field295.method2549(48);
            field295.method2341(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 21) {
            field399 = arg6;
            field516 = arg7;
            field402 = 2;
            field389 = 0;
            field523 = arg0;
            field471 = arg1;
            field295.method2549(77);
            field295.method2381(arg3);
            field295.method2341(Statics.field2644 + arg0);
            field295.method2296(class137.field2097[82] ? 1 : 0);
            field295.method2341(Statics.field934 + arg1);
        }
        if (arg2 == 17) {
            field399 = arg6;
            field516 = arg7;
            field402 = 2;
            field389 = 0;
            field523 = arg0;
            field471 = arg1;
            field295.method2549(170);
            field295.method2343(Statics.field2644 + arg0);
            field295.method2343(arg3);
            field295.method2353(Statics.field1997);
            field295.method2466(Statics.field934 + arg1);
            field295.method2430(class137.field2097[82] ? 1 : 0);
            field295.method2341(field454);
        }
        if (arg2 == 9) {
            class35 var25 = field470[arg3];
            if (var25 != null) {
                field399 = arg6;
                field516 = arg7;
                field402 = 2;
                field389 = 0;
                field523 = arg0;
                field471 = arg1;
                field295.method2549(125);
                field295.method2334(class137.field2097[82] ? 1 : 0);
                field295.method2343(arg3);
            }
        }
        if (arg2 == 15) {
            class3 var26 = field412[arg3];
            if (var26 != null) {
                field399 = arg6;
                field516 = arg7;
                field402 = 2;
                field389 = 0;
                field523 = arg0;
                field471 = arg1;
                field295.method2549(42);
                field295.method2381(field454);
                field295.method2430(class137.field2097[82] ? 1 : 0);
                field295.method2466(arg3);
                field295.method2299(Statics.field1997);
            }
        }
        if (arg2 == 51) {
            class3 var27 = field412[arg3];
            if (var27 != null) {
                field399 = arg6;
                field516 = arg7;
                field402 = 2;
                field389 = 0;
                field523 = arg0;
                field471 = arg1;
                field295.method2549(97);
                field295.method2466(arg3);
                field295.method2430(class137.field2097[82] ? 1 : 0);
            }
        }
        if (arg2 == 50) {
            class3 var28 = field412[arg3];
            if (var28 != null) {
                field399 = arg6;
                field516 = arg7;
                field402 = 2;
                field389 = 0;
                field523 = arg0;
                field471 = arg1;
                field295.method2549(0);
                field295.method2296(class137.field2097[82] ? 1 : 0);
                field295.method2343(arg3);
            }
        }
        if (arg2 == 25) {
            class173 var29 = class173.method834(arg1, arg0);
            if (var29 != null) {
                Statics.method179();
                int var30 = class178.method2767(method572(var29));
                int var31 = var29.field2858;
                class173 var32 = class173.method834(arg1, arg0);
                if (var32 != null && var32.field2829 != null) {
                    class1 var33 = new class1();
                    var33.field3 = var32;
                    var33.field16 = var32.field2829;
                    class37.method521(var33, 200000);
                }
                field436 = var31;
                field444 = true;
                Statics.field1997 = arg1;
                field454 = arg0;
                Statics.field221 = var30;
                method645(var32);
                field442 = 0;
                String var34;
                if (class178.method2767(method572(var29)) == 0) {
                    var34 = null;
                } else if (var29.field2864 == null || var29.field2864.trim().length() == 0) {
                    var34 = null;
                } else {
                    var34 = var29.field2864;
                }
                field447 = var34;
                if (field447 == null) {
                    field447 = "Null";
                }
                if (var29.field2739) {
                    field341 = var29.field2867 + class2.method2892(16777215);
                } else {
                    field341 = class2.method2892(65280) + var29.field2854 + class2.method2892(16777215);
                }
            }
            return;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class173 var35 = class173.method834(arg1, arg0);
            if (var35 != null) {
                int var36 = var35.field2858;
                class173 var37 = class173.method834(arg1, arg0);
                if (var37 != null) {
                    if (var37.field2866 != null) {
                        class1 var38 = new class1();
                        var38.field3 = var37;
                        var38.field6 = arg3;
                        var38.field10 = arg5;
                        var38.field16 = var37.field2866;
                        class37.method521(var38, 200000);
                    }
                    boolean var39 = true;
                    if (var37.field2744 > 0) {
                        var39 = method143(var37);
                    }
                    if (var39 && class178.method2974(method572(var37), arg3 - 1)) {
                        if (arg3 == 1) {
                            field295.method2549(38);
                            field295.method2299(arg1);
                            field295.method2381(arg0);
                            field295.method2381(var36);
                        }
                        if (arg3 == 2) {
                            field295.method2549(156);
                            field295.method2299(arg1);
                            field295.method2381(arg0);
                            field295.method2381(var36);
                        }
                        if (arg3 == 3) {
                            field295.method2549(138);
                            field295.method2299(arg1);
                            field295.method2381(arg0);
                            field295.method2381(var36);
                        }
                        if (arg3 == 4) {
                            field295.method2549(100);
                            field295.method2299(arg1);
                            field295.method2381(arg0);
                            field295.method2381(var36);
                        }
                        if (arg3 == 5) {
                            field295.method2549(165);
                            field295.method2299(arg1);
                            field295.method2381(arg0);
                            field295.method2381(var36);
                        }
                        if (arg3 == 6) {
                            field295.method2549(78);
                            field295.method2299(arg1);
                            field295.method2381(arg0);
                            field295.method2381(var36);
                        }
                        if (arg3 == 7) {
                            field295.method2549(30);
                            field295.method2299(arg1);
                            field295.method2381(arg0);
                            field295.method2381(var36);
                        }
                        if (arg3 == 8) {
                            field295.method2549(117);
                            field295.method2299(arg1);
                            field295.method2381(arg0);
                            field295.method2381(var36);
                        }
                        if (arg3 == 9) {
                            field295.method2549(172);
                            field295.method2299(arg1);
                            field295.method2381(arg0);
                            field295.method2381(var36);
                        }
                        if (arg3 == 10) {
                            field295.method2549(126);
                            field295.method2299(arg1);
                            field295.method2381(arg0);
                            field295.method2381(var36);
                        }
                    }
                }
            }
        }
        if (arg2 == 41) {
            field295.method2549(102);
            field295.method2352(arg1);
            field295.method2466(arg3);
            field295.method2341(arg0);
            field403 = 0;
            Statics.field2692 = class173.method2988(arg1);
            field347 = arg0;
        }
        if (arg2 == 42) {
            field295.method2549(203);
            field295.method2466(arg3);
            field295.method2299(arg1);
            field295.method2343(arg0);
            field403 = 0;
            Statics.field2692 = class173.method2988(arg1);
            field347 = arg0;
        }
        if (arg2 == 46) {
            class3 var40 = field412[arg3];
            if (var40 != null) {
                field399 = arg6;
                field516 = arg7;
                field402 = 2;
                field389 = 0;
                field523 = arg0;
                field471 = arg1;
                field295.method2549(131);
                field295.method2430(class137.field2097[82] ? 1 : 0);
                field295.method2343(arg3);
            }
        }
        if (arg2 == 35) {
            field295.method2549(166);
            field295.method2343(arg3);
            field295.method2299(arg1);
            field295.method2341(arg0);
            field403 = 0;
            Statics.field2692 = class173.method2988(arg1);
            field347 = arg0;
        }
        if (arg2 == 40) {
            field295.method2549(8);
            field295.method2351(arg1);
            field295.method2341(arg0);
            field295.method2343(arg3);
            field403 = 0;
            Statics.field2692 = class173.method2988(arg1);
            field347 = arg0;
        }
        if (arg2 == 14) {
            class3 var41 = field412[arg3];
            if (var41 != null) {
                field399 = arg6;
                field516 = arg7;
                field402 = 2;
                field389 = 0;
                field523 = arg0;
                field471 = arg1;
                field295.method2549(197);
                field295.method2341(Statics.field134);
                field295.method2299(Statics.field2284);
                field295.method2381(arg3);
                field295.method2466(Statics.field892);
                field295.method2334(class137.field2097[82] ? 1 : 0);
            }
        }
        if (arg2 == 32) {
            field295.method2549(252);
            field295.method2299(Statics.field1997);
            field295.method2466(field454);
            field295.method2343(arg0);
            field295.method2352(arg1);
            field295.method2466(arg3);
            field403 = 0;
            Statics.field2692 = class173.method2988(arg1);
            field347 = arg0;
        }
        if (arg2 == 33) {
            field295.method2549(147);
            field295.method2352(arg1);
            field295.method2341(arg3);
            field295.method2341(arg0);
            field403 = 0;
            Statics.field2692 = class173.method2988(arg1);
            field347 = arg0;
        }
        if (arg2 == 1003) {
            field399 = arg6;
            field516 = arg7;
            field402 = 2;
            field389 = 0;
            class35 var42 = field470[arg3];
            if (var42 != null) {
                class40 var43 = var42.field790;
                if (var43.field927 != null) {
                    var43 = var43.method722();
                }
                if (var43 != null) {
                    field295.method2549(82);
                    field295.method2381(var43.field911);
                }
            }
        }
        if (arg2 == 22) {
            field399 = arg6;
            field516 = arg7;
            field402 = 2;
            field389 = 0;
            field523 = arg0;
            field471 = arg1;
            field295.method2549(217);
            field295.method2334(class137.field2097[82] ? 1 : 0);
            field295.method2381(Statics.field934 + arg1);
            field295.method2381(arg3);
            field295.method2341(Statics.field2644 + arg0);
        }
        if (arg2 == 39) {
            field295.method2549(213);
            field295.method2466(arg0);
            field295.method2353(arg1);
            field295.method2341(arg3);
            field403 = 0;
            Statics.field2692 = class173.method2988(arg1);
            field347 = arg0;
        }
        if (arg2 == 19) {
            field399 = arg6;
            field516 = arg7;
            field402 = 2;
            field389 = 0;
            field523 = arg0;
            field471 = arg1;
            field295.method2549(167);
            field295.method2466(Statics.field934 + arg1);
            field295.method2381(Statics.field2644 + arg0);
            field295.method2335(class137.field2097[82] ? 1 : 0);
            field295.method2381(arg3);
        }
        if (arg2 == 38) {
            Statics.method179();
            class173 var44 = class173.method2988(arg1);
            field442 = 1;
            Statics.field134 = arg0;
            Statics.field2284 = arg1;
            Statics.field892 = arg3;
            method645(var44);
            field443 = class2.method2892(16748608) + class52.method2618(arg3).field1137 + class2.method2892(16777215);
            if (field443 == null) {
                field443 = "null";
            }
            return;
        }
        if (arg2 == 10) {
            class35 var45 = field470[arg3];
            if (var45 != null) {
                field399 = arg6;
                field516 = arg7;
                field402 = 2;
                field389 = 0;
                field523 = arg0;
                field471 = arg1;
                field295.method2549(186);
                field295.method2334(class137.field2097[82] ? 1 : 0);
                field295.method2341(arg3);
            }
        }
        if (arg2 == 18) {
            field399 = arg6;
            field516 = arg7;
            field402 = 2;
            field389 = 0;
            field523 = arg0;
            field471 = arg1;
            field295.method2549(155);
            field295.method2343(Statics.field2644 + arg0);
            field295.method2341(arg3);
            field295.method2296(class137.field2097[82] ? 1 : 0);
            field295.method2343(Statics.field934 + arg1);
        }
        if (arg2 == 43) {
            field295.method2549(160);
            field295.method2381(arg0);
            field295.method2299(arg1);
            field295.method2343(arg3);
            field403 = 0;
            Statics.field2692 = class173.method2988(arg1);
            field347 = arg0;
        }
        if (arg2 == 4) {
            field399 = arg6;
            field516 = arg7;
            field402 = 2;
            field389 = 0;
            field523 = arg0;
            field471 = arg1;
            field295.method2549(175);
            field295.method2341(Statics.field934 + arg1);
            field295.method2341(arg3 >> 14 & 0x7FFF);
            field295.method2341(Statics.field2644 + arg0);
            field295.method2430(class137.field2097[82] ? 1 : 0);
        }
        if (arg2 == 13) {
            class35 var46 = field470[arg3];
            if (var46 != null) {
                field399 = arg6;
                field516 = arg7;
                field402 = 2;
                field389 = 0;
                field523 = arg0;
                field471 = arg1;
                field295.method2549(173);
                field295.method2466(arg3);
                field295.method2334(class137.field2097[82] ? 1 : 0);
            }
        }
        if (arg2 == 36) {
            field295.method2549(124);
            field295.method2299(arg1);
            field295.method2466(arg3);
            field295.method2341(arg0);
            field403 = 0;
            Statics.field2692 = class173.method2988(arg1);
            field347 = arg0;
        }
        if (arg2 == 58) {
            class173 var47 = class173.method834(arg1, arg0);
            if (var47 != null) {
                field295.method2549(74);
                field295.method2353(arg1);
                field295.method2381(arg0);
                field295.method2381(var47.field2858);
                field295.method2352(Statics.field1997);
                field295.method2381(field436);
                field295.method2341(field454);
            }
        }
        if (field442 != 0) {
            field442 = 0;
            method645(class173.method2988(Statics.field2284));
        }
        if (field444) {
            Statics.method179();
        }
        if (Statics.field2692 != null && field403 == 0) {
            method645(Statics.field2692);
        }
    }

    @ObfuscatedName("x.bt(ILjava/lang/String;B)V")
    public static void method169(int arg0, String arg1) {
        int var2 = class33.field768;
        int[] var3 = class33.field761;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class3 var6 = field412[var3[var5]];
            if (var6 != null && Statics.field162 != var6 && var6.field51 != null && var6.field51.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field295.method2549(25);
                    field295.method2296(0);
                    field295.method2343(var3[var5]);
                } else if (arg0 == 4) {
                    field295.method2549(67);
                    field295.method2343(var3[var5]);
                    field295.method2296(0);
                } else if (arg0 == 6) {
                    field295.method2549(201);
                    field295.method2430(0);
                    field295.method2341(var3[var5]);
                } else if (arg0 == 7) {
                    field295.method2549(0);
                    field295.method2296(0);
                    field295.method2343(var3[var5]);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class12.method930(4, "", class157.field2457 + arg1);
        }
    }

    @ObfuscatedName("eg.cm(III)V")
    public static void method2694(int arg0, int arg1) {
        field295.method2549(47);
        field295.method2466(arg1);
        field295.method2351(arg0);
    }

    @ObfuscatedName("m.ci(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method517(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field525 || field449 >= 500) {
            return;
        }
        field465[field449] = arg0;
        field313[field449] = arg1;
        field290[field449] = arg2;
        field435[field449] = arg3;
        field432[field449] = arg4;
        field433[field449] = arg5;
        field449++;
    }

    @ObfuscatedName("co.cw(I)V")
    public static void method1908() {
        for (int var0 = 0; var0 < field449; var0++) {
            if (method162(field290[var0])) {
                if (var0 < field449 - 1) {
                    for (int var1 = var0; var1 < field449 - 1; var1++) {
                        field465[var1] = field465[var1 + 1];
                        field313[var1] = field313[var1 + 1];
                        field290[var1] = field290[var1 + 1];
                        field435[var1] = field435[var1 + 1];
                        field432[var1] = field432[var1 + 1];
                        field433[var1] = field433[var1 + 1];
                    }
                }
                field449--;
            }
        }
    }

    @ObfuscatedName("g.ch(II)Z")
    public static boolean method162(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("cc.cs(Laj;IIII)V")
    public static final void method1913(class40 arg0, int arg1, int arg2, int arg3) {
        if (field449 >= 400) {
            return;
        }
        if (arg0.field927 != null) {
            arg0 = arg0.method722();
        }
        if (arg0 == null || !arg0.field930 || arg0.field932 && field457 != arg1) {
            return;
        }
        String var4 = arg0.field902;
        if (arg0.field924 != 0) {
            var4 = var4 + method779(arg0.field924, Statics.field162.field44) + " " + class2.field23 + class157.field2464 + arg0.field924 + class2.field22;
        }
        if (field442 == 1) {
            method517(class157.field2420, field443 + " " + class2.field25 + " " + class2.method2892(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field444) {
            String[] var5 = arg0.field909;
            if (field460) {
                var5 = method148(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class157.field2472)) {
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
                        method517(var5[var6], class2.method2892(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class157.field2472)) {
                        short var9 = 0;
                        if (field535 == class21.field582 || field535 == class21.field583 && arg0.field924 > Statics.field162.field44) {
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
                        method517(var5[var8], class2.method2892(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method517(class157.field2459, class2.method2892(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field221 & 0x2) == 2) {
            method517(field447, field341 + " " + class2.field25 + " " + class2.method2892(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("dx.cd(Lf;IIII)V")
    public static final void method2616(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field162 == arg0 || field449 >= 400) {
            return;
        }
        String var4;
        if (arg0.field40 == 0) {
            var4 = arg0.field51 + method779(arg0.field44, Statics.field162.field44) + " " + class2.field23 + class157.field2464 + arg0.field44 + class2.field22;
        } else {
            var4 = arg0.field51 + " " + class2.field23 + class157.field2401 + arg0.field40 + class2.field22;
        }
        if (field442 == 1) {
            method517(class157.field2420, field443 + " " + class2.field25 + " " + class2.method2892(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field444) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field431[var5] != null) {
                    short var6 = 0;
                    if (field431[var5].equalsIgnoreCase(class157.field2472)) {
                        if (field535 == class21.field582 || field535 == class21.field583 && arg0.field44 > Statics.field162.field44) {
                            var6 = 2000;
                        }
                        if (Statics.field162.field53 != 0 && arg0.field53 != 0) {
                            if (Statics.field162.field53 == arg0.field53) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field419[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field404[var5] + var6;
                    method517(field431[var5], class2.method2892(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field221 & 0x8) == 8) {
            method517(field447, field341 + " " + class2.field25 + " " + class2.method2892(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field449; var9++) {
            if (field290[var9] == 23) {
                field313[var9] = class2.method2892(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("af.ck(IIS)Ljava/lang/String;")
    public static final String method779(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method2892(16711680);
        } else if (var2 < -6) {
            return class2.method2892(16723968);
        } else if (var2 < -3) {
            return class2.method2892(16740352);
        } else if (var2 < 0) {
            return class2.method2892(16756736);
        } else if (var2 > 9) {
            return class2.method2892(65280);
        } else if (var2 > 6) {
            return class2.method2892(4259584);
        } else if (var2 > 3) {
            return class2.method2892(8453888);
        } else if (var2 > 0) {
            return class2.method2892(12648192);
        } else {
            return class2.method2892(16776960);
        }
    }

    @ObfuscatedName("ce.cb([Lfb;IIIIIIIII)V")
    public static final void method2008(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1632(arg2, arg3, arg4, arg5);
        class91.method1917();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class173 var10 = arg0[var9];
            if (var10 != null && (var10.field2800 == arg1 || arg1 == -1412584499 && field462 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field497[field492] = var10.field2753 + arg6;
                    field340[field492] = var10.field2754 + arg7;
                    field499[field492] = var10.field2755;
                    field531[field492] = var10.field2781;
                    var11 = ++field492 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2869 = var11;
                var10.field2870 = field302;
                if (!var10.field2739 || !method2239(var10)) {
                    if (var10.field2744 > 0) {
                        method177(var10);
                    }
                    int var12 = var10.field2753 + arg6;
                    int var13 = var10.field2754 + arg7;
                    int var14 = var10.field2770;
                    if (field462 == var10) {
                        if (arg1 != -1412584499 && !var10.field2749) {
                            Statics.field2896 = arg0;
                            Statics.field1371 = arg6;
                            Statics.field188 = arg7;
                            continue;
                        }
                        if (field473 && field467) {
                            int var15 = class140.field2143;
                            int var16 = class140.field2139 * 869381013;
                            int var17 = var15 - field464;
                            int var18 = var16 - field474;
                            if (var17 < field401) {
                                var17 = field401;
                            }
                            if (var10.field2755 + var17 > field401 + field360.field2755) {
                                var17 = field401 + field360.field2755 - var10.field2755;
                            }
                            if (var18 < field469) {
                                var18 = field469;
                            }
                            if (var10.field2781 + var18 > field469 + field360.field2781) {
                                var18 = field469 + field360.field2781 - var10.field2781;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2749) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2742 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2742 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2755 + var12;
                        int var26 = var10.field2781 + var13;
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
                        int var29 = var10.field2755 + var12;
                        int var30 = var10.field2781 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2739 || var19 < var21 && var20 < var22) {
                        if (var10.field2744 != 0) {
                            if (var10.field2744 == 1336) {
                                if (field308) {
                                    var13 += 15;
                                    Statics.field1363.method3725("Fps:" + field2187, var10.field2755 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field353) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field353) {
                                        var33 = 16711680;
                                    }
                                    Statics.field1363.method3725("Mem:" + var32 + "k", var10.field2755 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2744 == 1337) {
                                field438 = var12;
                                field439 = var13;
                                Statics.method3115(var12, var13, var10.field2755, var10.field2781);
                                field494[var10.field2869] = true;
                                class80.method1632(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2744 == 1338) {
                                method51(var10, var12, var13, var11);
                                class80.method1632(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2744 == 1339) {
                                class175 var34 = var10.method3192(false);
                                if (var34 != null) {
                                    if (field345 < 3) {
                                        Statics.field1941.method1564(var12, var13, var34.field2884, var34.field2886, 25, 25, field376, 256, var34.field2890, var34.field2885);
                                    } else {
                                        class80.method1647(var12, var13, 0, var34.field2890, var34.field2885);
                                    }
                                }
                                class80.method1632(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2742 == 0) {
                            if (!var10.field2739 && method2239(var10) && Statics.field272 != var10) {
                                continue;
                            }
                            if (!var10.field2739) {
                                if (var10.field2762 > var10.field2764 - var10.field2781) {
                                    var10.field2762 = var10.field2764 - var10.field2781;
                                }
                                if (var10.field2762 < 0) {
                                    var10.field2762 = 0;
                                }
                            }
                            method2008(arg0, var10.field2740, var19, var20, var21, var22, var12 - var10.field2731, var13 - var10.field2762, var11);
                            if (var10.field2759 != null) {
                                method2008(var10.field2759, var10.field2740, var19, var20, var21, var22, var12 - var10.field2731, var13 - var10.field2762, var11);
                            }
                            class4 var35 = (class4) field450.method3509((long) var10.field2740);
                            if (var35 != null) {
                                int var36 = var35.field65;
                                if (class173.method144(var36)) {
                                    Statics.field2896 = null;
                                    method2008(Statics.field2817[var36], -1, var19, var20, var21, var22, var12, var13, var11);
                                    if (Statics.field2896 != null) {
                                        method2008(Statics.field2896, -1412584499, var19, var20, var21, var22, Statics.field1371, Statics.field188, var11);
                                        Statics.field2896 = null;
                                    }
                                } else if (var11 == -1) {
                                    for (int var37 = 0; var37 < 100; var37++) {
                                        field494[var37] = true;
                                    }
                                } else {
                                    field494[var11] = true;
                                }
                            }
                            class80.method1632(arg2, arg3, arg4, arg5);
                            class91.method1917();
                        }
                        if (field503 || field496[var11] || field501 > 1) {
                            if (var10.field2742 == 0 && !var10.field2739 && var10.field2764 > var10.field2781) {
                                method142(var10.field2755 + var12, var13, var10.field2762, var10.field2781, var10.field2764);
                            }
                            if (var10.field2742 != 1) {
                                if (var10.field2742 == 2) {
                                    int var38 = 0;
                                    for (int var39 = 0; var39 < var10.field2756; var39++) {
                                        for (int var40 = 0; var40 < var10.field2751; var40++) {
                                            int var41 = (var10.field2801 + 32) * var40 + var12;
                                            int var42 = (var10.field2871 + 32) * var39 + var13;
                                            if (var38 < 20) {
                                                var41 += var10.field2806[var38];
                                                var42 += var10.field2807[var38];
                                            }
                                            if (var10.field2838[var38] > 0) {
                                                boolean var43 = false;
                                                boolean var44 = false;
                                                int var45 = var10.field2838[var38] - 1;
                                                if (var41 + 32 > arg2 && var41 < arg4 && var42 + 32 > arg3 && var42 < arg5 || Statics.field574 == var10 && field405 == var38) {
                                                    class79 var46;
                                                    if (field442 == 1 && Statics.field134 == var38 && Statics.field2284 == var10.field2740) {
                                                        var46 = class52.method2975(var45, var10.field2857[var38], 2, 0, 2, false);
                                                    } else {
                                                        var46 = class52.method2975(var45, var10.field2857[var38], 1, 3153952, 2, false);
                                                    }
                                                    if (var46 == null) {
                                                        method645(var10);
                                                    } else if (Statics.field574 == var10 && field405 == var38) {
                                                        int var47 = class140.field2143 - field382;
                                                        int var48 = class140.field2139 * 869381013 - field407;
                                                        if (var47 < 5 && var47 > -5) {
                                                            var47 = 0;
                                                        }
                                                        if (var48 < 5 && var48 > -5) {
                                                            var48 = 0;
                                                        }
                                                        if (field410 < 5) {
                                                            var47 = 0;
                                                            var48 = 0;
                                                        }
                                                        var46.method1586(var41 + var47, var42 + var48, 128);
                                                        if (arg1 != -1) {
                                                            class173 var49 = arg0[arg1 & 0xFFFF];
                                                            if (var42 + var48 < class80.field1415 && var49.field2762 > 0) {
                                                                int var50 = field566 * (class80.field1415 - var42 - var48) / 3;
                                                                if (var50 > field566 * 10) {
                                                                    var50 = field566 * 10;
                                                                }
                                                                if (var50 > var49.field2762) {
                                                                    var50 = var49.field2762;
                                                                }
                                                                var49.field2762 -= var50;
                                                                field407 += var50;
                                                                method645(var49);
                                                            }
                                                            if (var42 + var48 + 32 > class80.field1412 && var49.field2762 < var49.field2764 - var49.field2781) {
                                                                int var51 = field566 * (var42 + var48 + 32 - class80.field1412) / 3;
                                                                if (var51 > field566 * 10) {
                                                                    var51 = field566 * 10;
                                                                }
                                                                if (var51 > var49.field2764 - var49.field2781 - var49.field2762) {
                                                                    var51 = var49.field2764 - var49.field2781 - var49.field2762;
                                                                }
                                                                var49.field2762 += var51;
                                                                field407 -= var51;
                                                                method645(var49);
                                                            }
                                                        }
                                                    } else if (Statics.field2692 == var10 && field347 == var38) {
                                                        var46.method1586(var41, var42, 128);
                                                    } else {
                                                        var46.method1554(var41, var42);
                                                    }
                                                }
                                            } else if (var10.field2779 != null && var38 < 20) {
                                                class79 var52 = var10.method3188(var38);
                                                if (var52 != null) {
                                                    var52.method1554(var41, var42);
                                                } else if (class173.field2738) {
                                                    method645(var10);
                                                }
                                            }
                                            var38++;
                                        }
                                    }
                                } else if (var10.field2742 == 3) {
                                    int var53;
                                    if (method2185(var10)) {
                                        var53 = var10.field2787;
                                        if (Statics.field272 == var10 && var10.field2768 != 0) {
                                            var53 = var10.field2768;
                                        }
                                    } else {
                                        var53 = var10.field2765;
                                        if (Statics.field272 == var10 && var10.field2804 != 0) {
                                            var53 = var10.field2804;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2769) {
                                            class80.method1638(var12, var13, var10.field2755, var10.field2781, var53);
                                        } else {
                                            class80.method1688(var12, var13, var10.field2755, var10.field2781, var53);
                                        }
                                    } else if (var10.field2769) {
                                        class80.method1637(var12, var13, var10.field2755, var10.field2781, var53, 256 - (var14 & 0xFF));
                                    } else {
                                        class80.method1641(var12, var13, var10.field2755, var10.field2781, var53, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2742 == 4) {
                                    class224 var54 = var10.method3187();
                                    if (var54 != null) {
                                        String var55 = var10.field2798;
                                        int var56;
                                        if (method2185(var10)) {
                                            var56 = var10.field2787;
                                            if (Statics.field272 == var10 && var10.field2768 != 0) {
                                                var56 = var10.field2768;
                                            }
                                            if (var10.field2799.length() > 0) {
                                                var55 = var10.field2799;
                                            }
                                        } else {
                                            var56 = var10.field2765;
                                            if (Statics.field272 == var10 && var10.field2804 != 0) {
                                                var56 = var10.field2804;
                                            }
                                        }
                                        if (var10.field2739 && var10.field2858 != -1) {
                                            class52 var57 = class52.method2618(var10.field2858);
                                            var55 = var57.field1137;
                                            if (var55 == null) {
                                                var55 = "null";
                                            }
                                            if ((var57.field1129 == 1 || var10.field2741 != 1) && var10.field2741 != -1) {
                                                var55 = class2.method2892(16748608) + var55 + class2.field29 + " " + 'x' + method1471(var10.field2741);
                                            }
                                        }
                                        if (field421 == var10) {
                                            class157 var10000 = (class157) null;
                                            var55 = class157.field2466;
                                            var56 = var10.field2765;
                                        }
                                        if (!var10.field2739) {
                                            var55 = method157(var55, var10);
                                        }
                                        var54.method3772(var55, var12, var13, var10.field2755, var10.field2781, var56, var10.field2803 ? 0 : -1, var10.field2782, var10.field2802, var10.field2840);
                                    } else if (class173.field2738) {
                                        method645(var10);
                                    }
                                } else if (var10.field2742 == 5) {
                                    if (var10.field2739) {
                                        class79 var59;
                                        if (var10.field2858 == -1) {
                                            var59 = var10.method3153(false);
                                        } else {
                                            var59 = class52.method2975(var10.field2858, var10.field2741, var10.field2789, var10.field2786, var10.field2797, false);
                                        }
                                        if (var59 != null) {
                                            int var60 = var59.field1405;
                                            int var61 = var59.field1406;
                                            if (var10.field2796) {
                                                class80.method1636(var12, var13, var10.field2755 + var12, var10.field2781 + var13);
                                                int var62 = (var10.field2755 + (var60 - 1)) / var60;
                                                int var63 = (var10.field2781 + (var61 - 1)) / var61;
                                                for (int var64 = 0; var64 < var62; var64++) {
                                                    for (int var65 = 0; var65 < var63; var65++) {
                                                        if (var10.field2775 != 0) {
                                                            var59.method1566(var60 / 2 + var60 * var64 + var12, var61 / 2 + var61 * var65 + var13, var10.field2775, 4096);
                                                        } else if (var14 == 0) {
                                                            var59.method1554(var60 * var64 + var12, var61 * var65 + var13);
                                                        } else {
                                                            var59.method1586(var60 * var64 + var12, var61 * var65 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1632(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var66 = var10.field2755 * 4096 / var60;
                                                if (var10.field2775 != 0) {
                                                    var59.method1566(var10.field2755 / 2 + var12, var10.field2781 / 2 + var13, var10.field2775, var66);
                                                } else if (var14 != 0) {
                                                    var59.method1562(var12, var13, var10.field2755, var10.field2781, 256 - (var14 & 0xFF));
                                                } else if (var10.field2755 == var60 && var10.field2781 == var61) {
                                                    var59.method1554(var12, var13);
                                                } else {
                                                    var59.method1556(var12, var13, var10.field2755, var10.field2781);
                                                }
                                            }
                                        } else if (class173.field2738) {
                                            method645(var10);
                                        }
                                    } else {
                                        class79 var58 = var10.method3153(method2185(var10));
                                        if (var58 != null) {
                                            var58.method1554(var12, var13);
                                        } else if (class173.field2738) {
                                            method645(var10);
                                        }
                                    }
                                } else if (var10.field2742 == 6) {
                                    boolean var67 = method2185(var10);
                                    int var68;
                                    if (var67) {
                                        var68 = var10.field2760;
                                    } else {
                                        var68 = var10.field2785;
                                    }
                                    class105 var69 = null;
                                    int var70 = 0;
                                    if (var10.field2858 != -1) {
                                        class52 var71 = class52.method2618(var10.field2858);
                                        if (var71 != null) {
                                            class52 var72 = var71.method982(var10.field2741);
                                            var69 = var72.method1018(1);
                                            if (var69 == null) {
                                                method645(var10);
                                            } else {
                                                var69.method2131();
                                                var70 = var69.field1452 / 2;
                                            }
                                        }
                                    } else if (var10.field2859 == 5) {
                                        if (var10.field2777 == 0) {
                                            var69 = field448.method3233((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var69 = Statics.field162.method29();
                                        }
                                    } else if (var68 == -1) {
                                        var69 = var10.method3156((class43) null, -1, var67, Statics.field162.field35);
                                        if (var69 == null && class173.field2738) {
                                            method645(var10);
                                        }
                                    } else {
                                        class43 var73 = class43.method3831(var68);
                                        var69 = var10.method3156(var73, var10.field2793, var67, Statics.field162.field35);
                                        if (var69 == null && class173.field2738) {
                                            method645(var10);
                                        }
                                    }
                                    class91.method1918(var10.field2755 / 2 + var12, var10.field2781 / 2 + var13);
                                    int var74 = var10.field2792 * class91.field1558[var10.field2780] >> 16;
                                    int var75 = var10.field2792 * class91.field1582[var10.field2780] >> 16;
                                    if (var69 != null) {
                                        if (var10.field2739) {
                                            var69.method2131();
                                            if (var10.field2795) {
                                                var69.method2108(0, var10.field2730, var10.field2865, var10.field2780, var10.field2767, var10.field2788 + var70 + var74, var10.field2788 + var75, var10.field2792);
                                            } else {
                                                var69.method2156(0, var10.field2730, var10.field2865, var10.field2780, var10.field2767, var10.field2788 + var70 + var74, var10.field2788 + var75);
                                            }
                                        } else {
                                            var69.method2156(0, var10.field2730, 0, var10.field2780, 0, var74, var75);
                                        }
                                    }
                                    class91.method1941();
                                } else {
                                    if (var10.field2742 == 7) {
                                        class224 var76 = var10.method3187();
                                        if (var76 == null) {
                                            if (class173.field2738) {
                                                method645(var10);
                                            }
                                            continue;
                                        }
                                        int var77 = 0;
                                        for (int var78 = 0; var78 < var10.field2756; var78++) {
                                            for (int var79 = 0; var79 < var10.field2751; var79++) {
                                                if (var10.field2838[var77] > 0) {
                                                    class52 var80 = class52.method2618(var10.field2838[var77] - 1);
                                                    String var81;
                                                    if (var80.field1129 != 1 && var10.field2857[var77] == 1) {
                                                        var81 = class2.method2892(16748608) + var80.field1137 + class2.field29;
                                                    } else {
                                                        var81 = class2.method2892(16748608) + var80.field1137 + class2.field29 + " " + 'x' + method1471(var10.field2857[var77]);
                                                    }
                                                    int var82 = (var10.field2801 + 115) * var79 + var12;
                                                    int var83 = (var10.field2871 + 12) * var78 + var13;
                                                    if (var10.field2782 == 0) {
                                                        var76.method3724(var81, var82, var83, var10.field2765, var10.field2803 ? 0 : -1);
                                                    } else if (var10.field2782 == 1) {
                                                        var76.method3726(var81, var10.field2755 / 2 + var82, var83, var10.field2765, var10.field2803 ? 0 : -1);
                                                    } else {
                                                        var76.method3725(var81, var10.field2755 + var82 - 1, var83, var10.field2765, var10.field2803 ? 0 : -1);
                                                    }
                                                }
                                                var77++;
                                            }
                                        }
                                    }
                                    if (var10.field2742 == 8 && Statics.field1105 == var10 && field441 == field440) {
                                        int var84 = 0;
                                        int var85 = 0;
                                        class224 var86 = Statics.field1363;
                                        String var87 = var10.field2798;
                                        String var88 = method157(var87, var10);
                                        while (var88.length() > 0) {
                                            int var89 = var88.indexOf(class2.field33);
                                            String var90;
                                            if (var89 == -1) {
                                                var90 = var88;
                                                var88 = "";
                                            } else {
                                                var90 = var88.substring(0, var89);
                                                var88 = var88.substring(var89 + 4);
                                            }
                                            int var91 = var86.method3794(var90);
                                            if (var91 > var84) {
                                                var84 = var91;
                                            }
                                            var85 += var86.field3170 + 1;
                                        }
                                        var84 += 6;
                                        var85 += 7;
                                        int var92 = var10.field2755 + var12 - 5 - var84;
                                        int var93 = var10.field2781 + var13 + 5;
                                        if (var92 < var12 + 5) {
                                            var92 = var12 + 5;
                                        }
                                        if (var84 + var92 > arg4) {
                                            var92 = arg4 - var84;
                                        }
                                        if (var85 + var93 > arg5) {
                                            var93 = arg5 - var85;
                                        }
                                        class80.method1638(var92, var93, var84, var85, 16777120);
                                        class80.method1688(var92, var93, var84, var85, 0);
                                        String var94 = var10.field2798;
                                        int var95 = var86.field3170 + var93 + 2;
                                        String var96 = method157(var94, var10);
                                        while (var96.length() > 0) {
                                            int var97 = var96.indexOf(class2.field33);
                                            String var98;
                                            if (var97 == -1) {
                                                var98 = var96;
                                                var96 = "";
                                            } else {
                                                var98 = var96.substring(0, var97);
                                                var96 = var96.substring(var97 + 4);
                                            }
                                            var86.method3724(var98, var92 + 3, var95, 0, -1);
                                            var95 += var86.field3170 + 1;
                                        }
                                    }
                                    if (var10.field2742 == 9) {
                                        if (var10.field2771 == 1) {
                                            int var99;
                                            int var100;
                                            int var101;
                                            int var102;
                                            if (var10.field2772) {
                                                var99 = var12;
                                                var100 = var10.field2781 + var13;
                                                var101 = var10.field2755 + var12;
                                                var102 = var13;
                                            } else {
                                                var99 = var12;
                                                var100 = var13;
                                                var101 = var10.field2755 + var12;
                                                var102 = var10.field2781 + var13;
                                            }
                                            class80.method1646(var99, var100, var101, var102, var10.field2765);
                                        } else {
                                            int var103 = var10.field2755 >= 0 ? var10.field2755 : -var10.field2755;
                                            int var104 = var10.field2781 >= 0 ? var10.field2781 : -var10.field2781;
                                            int var105 = var103;
                                            if (var103 < var104) {
                                                var105 = var104;
                                            }
                                            if (var105 != 0) {
                                                int var106 = (var10.field2755 << 16) / var105;
                                                int var107 = (var10.field2781 << 16) / var105;
                                                if (var107 <= var106) {
                                                    var106 = -var106;
                                                } else {
                                                    var107 = -var107;
                                                }
                                                int var108 = var10.field2771 * var107 >> 17;
                                                int var109 = var10.field2771 * var107 + 1 >> 17;
                                                int var110 = var10.field2771 * var106 >> 17;
                                                int var111 = var10.field2771 * var106 + 1 >> 17;
                                                int var112 = var12 + var108;
                                                int var113 = var12 - var109;
                                                int var114 = var10.field2755 + var12 - var109;
                                                int var115 = var10.field2755 + var12 + var108;
                                                int var116 = var13 + var110;
                                                int var117 = var13 - var111;
                                                int var118 = var10.field2781 + var13 - var111;
                                                int var119 = var10.field2781 + var13 + var110;
                                                class91.method1924(var112, var113, var114);
                                                class91.method1919(var116, var117, var118, var112, var113, var114, var10.field2765);
                                                class91.method1924(var112, var114, var115);
                                                class91.method1919(var116, var118, var119, var112, var114, var115, var10.field2765);
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

    @ObfuscatedName("w.co(Ljava/lang/String;Lfb;I)Ljava/lang/String;")
    public static String method157(String arg0, class173 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method3450(arg1, var2 - 1);
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
                if (Statics.field1766 != null) {
                    int var9 = Statics.field1766.field2210;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field1766.field2212 != null) {
                        var8 = (String) Statics.field1766.field2212;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("bq.cq(IS)Ljava/lang/String;")
    public static final String method1471(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field21 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2892(65408) + var1.substring(0, var1.length() - 8) + class157.field2469 + " " + class2.field23 + var1 + class2.field22 + class2.field29;
        } else if (var1.length() > 6) {
            return " " + class2.method2892(16777215) + var1.substring(0, var1.length() - 4) + class157.field2539 + " " + class2.field23 + var1 + class2.field22 + class2.field29;
        } else {
            return " " + class2.method2892(16776960) + var1 + class2.field29;
        }
    }

    @ObfuscatedName("v.cy(Lfb;B)V")
    public static void method12(class173 arg0) {
        class173 var1 = arg0.field2800 == -1 ? null : class173.method2988(arg0.field2800);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field2656;
            var3 = Statics.field2160;
        } else {
            var2 = var1.field2755;
            var3 = var1.field2781;
        }
        method3707(arg0, var2, var3, false);
        method1717(arg0, var2, var3);
    }

    @ObfuscatedName("i.cc([Lfb;Lfb;ZI)V")
    public static void method1(class173[] arg0, class173 arg1, boolean arg2) {
        int var3 = arg1.field2763 == 0 ? arg1.field2755 : arg1.field2763;
        int var4 = arg1.field2764 == 0 ? arg1.field2781 : arg1.field2764;
        method1537(arg0, arg1.field2740, var3, var4, arg2);
        if (arg1.field2759 != null) {
            method1537(arg1.field2759, arg1.field2740, var3, var4, arg2);
        }
        class4 var5 = (class4) field450.method3509((long) arg1.field2740);
        if (var5 != null) {
            int var6 = var5.field65;
            if (class173.method144(var6)) {
                method1537(Statics.field2817[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2744 == 1337) {
        }
    }

    @ObfuscatedName("bv.cz([Lfb;IIIZI)V")
    public static void method1537(class173[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class173 var6 = arg0[var5];
            if (var6 != null && var6.field2800 == arg1) {
                method3707(var6, arg2, arg3, arg4);
                method1717(var6, arg2, arg3);
                if (var6.field2731 > var6.field2763 - var6.field2755) {
                    var6.field2731 = var6.field2763 - var6.field2755;
                }
                if (var6.field2731 < 0) {
                    var6.field2731 = 0;
                }
                if (var6.field2762 > var6.field2764 - var6.field2781) {
                    var6.field2762 = var6.field2764 - var6.field2781;
                }
                if (var6.field2762 < 0) {
                    var6.field2762 = 0;
                }
                if (var6.field2742 == 0) {
                    method1(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("hb.cf(Lfb;IIZI)V")
    public static void method3707(class173 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2755;
        int var5 = arg0.field2781;
        if (arg0.field2747 == 0) {
            arg0.field2755 = arg0.field2751;
        } else if (arg0.field2747 == 1) {
            arg0.field2755 = arg1 - arg0.field2751;
        } else if (arg0.field2747 == 2) {
            arg0.field2755 = arg0.field2751 * arg1 >> 14;
        }
        if (arg0.field2849 == 0) {
            arg0.field2781 = arg0.field2756;
        } else if (arg0.field2849 == 1) {
            arg0.field2781 = arg2 - arg0.field2756;
        } else if (arg0.field2849 == 2) {
            arg0.field2781 = arg0.field2756 * arg2 >> 14;
        }
        if (arg0.field2747 == 4) {
            arg0.field2755 = arg0.field2831 * arg0.field2781 / arg0.field2758;
        }
        if (arg0.field2849 == 4) {
            arg0.field2781 = arg0.field2758 * arg0.field2755 / arg0.field2831;
        }
        if (field459 && arg0.field2742 == 0) {
            if (arg0.field2781 < 5 && arg0.field2755 < 5) {
                arg0.field2781 = 5;
                arg0.field2755 = 5;
            } else {
                if (arg0.field2781 <= 0) {
                    arg0.field2781 = 5;
                }
                if (arg0.field2755 <= 0) {
                    arg0.field2755 = 5;
                }
            }
        }
        if (arg0.field2744 == 1337) {
            field461 = arg0;
        }
        if (arg3 && arg0.field2847 != null && (arg0.field2755 != var4 || arg0.field2781 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field16 = arg0.field2847;
            field567.method3545(var6);
        }
    }

    @ObfuscatedName("cd.cp(Lfb;IIB)V")
    public static void method1717(class173 arg0, int arg1, int arg2) {
        if (arg0.field2745 == 0) {
            arg0.field2753 = arg0.field2825;
        } else if (arg0.field2745 == 1) {
            arg0.field2753 = (arg1 - arg0.field2755) / 2 + arg0.field2825;
        } else if (arg0.field2745 == 2) {
            arg0.field2753 = arg1 - arg0.field2755 - arg0.field2825;
        } else if (arg0.field2745 == 3) {
            arg0.field2753 = arg0.field2825 * arg1 >> 14;
        } else if (arg0.field2745 == 4) {
            arg0.field2753 = (arg0.field2825 * arg1 >> 14) + (arg1 - arg0.field2755) / 2;
        } else {
            arg0.field2753 = arg1 - arg0.field2755 - (arg0.field2825 * arg1 >> 14);
        }
        if (arg0.field2746 == 0) {
            arg0.field2754 = arg0.field2750;
        } else if (arg0.field2746 == 1) {
            arg0.field2754 = (arg2 - arg0.field2781) / 2 + arg0.field2750;
        } else if (arg0.field2746 == 2) {
            arg0.field2754 = arg2 - arg0.field2781 - arg0.field2750;
        } else if (arg0.field2746 == 3) {
            arg0.field2754 = arg0.field2750 * arg2 >> 14;
        } else if (arg0.field2746 == 4) {
            arg0.field2754 = (arg0.field2750 * arg2 >> 14) + (arg2 - arg0.field2781) / 2;
        } else {
            arg0.field2754 = arg2 - arg0.field2781 - (arg0.field2750 * arg2 >> 14);
        }
        if (!field459 || arg0.field2742 != 0) {
            return;
        }
        if (arg0.field2753 < 0) {
            arg0.field2753 = 0;
        } else if (arg0.field2755 + arg0.field2753 > arg1) {
            arg0.field2753 = arg1 - arg0.field2755;
        }
        if (arg0.field2754 < 0) {
            arg0.field2754 = 0;
        } else if (arg0.field2781 + arg0.field2754 > arg2) {
            arg0.field2754 = arg2 - arg0.field2781;
        }
    }

    @ObfuscatedName("z.cx(IIIIIB)V")
    public static final void method142(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field973[0].method1703(arg0, arg1);
        Statics.field973[1].method1703(arg0, arg1 + arg3 - 16);
        class80.method1638(arg0, arg1 + 16, 16, arg3 - 32, field369);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class80.method1638(arg0, arg1 + 16 + var6, 16, var5, field370);
        class80.method1644(arg0, arg1 + 16 + var6, var5, field372);
        class80.method1644(arg0 + 1, arg1 + 16 + var6, var5, field372);
        class80.method1642(arg0, arg1 + 16 + var6, 16, field372);
        class80.method1642(arg0, arg1 + 17 + var6, 16, field372);
        class80.method1644(arg0 + 15, arg1 + 16 + var6, var5, field371);
        class80.method1644(arg0 + 14, arg1 + 17 + var6, var5 - 1, field371);
        class80.method1642(arg0, arg1 + 15 + var6 + var5, 16, field371);
        class80.method1642(arg0 + 1, arg1 + 14 + var6 + var5, 15, field371);
    }

    @ObfuscatedName("dp.cl(Lfb;I)Z")
    public static final boolean method2185(class173 arg0) {
        if (arg0.field2851 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2851.length; var1++) {
            int var2 = method3450(arg0, var1);
            int var3 = arg0.field2852[var1];
            if (arg0.field2851[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2851[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2851[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gh.ct(Lfb;II)I")
    public static final int method3450(class173 arg0, int arg1) {
        if (arg0.field2845 == null || arg1 >= arg0.field2845.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2845[arg1];
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
                    var7 = field298[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field476[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field420[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class173 var11 = class173.method2988(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method2618(var12).field1131 || field296)) {
                        for (int var13 = 0; var13 < var11.field2838.length; var13++) {
                            if (var12 + 1 == var11.field2838[var13]) {
                                var7 += var11.field2857[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class176.field2895[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class155.field2292[field476[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class176.field2895[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field162.field44;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class155.field2287[var14]) {
                            var7 += field476[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class173 var17 = class173.method2988(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method2618(var18).field1131 || field296)) {
                        for (int var19 = 0; var19 < var17.field2838.length; var19++) {
                            if (var18 + 1 == var17.field2838[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field351;
                }
                if (var6 == 12) {
                    var7 = field455;
                }
                if (var6 == 13) {
                    int var20 = class176.field2895[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = Statics.method3146(var22);
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
                    var7 = (Statics.field162.field855 >> 7) + Statics.field2644;
                }
                if (var6 == 19) {
                    var7 = (Statics.field162.field825 >> 7) + Statics.field934;
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

    @ObfuscatedName("h.cn(Lfb;IIB)V")
    public static final void method46(class173 arg0, int arg1, int arg2) {
        if (arg0.field2743 == 1) {
            method517(arg0.field2813, "", 24, 0, 0, arg0.field2740);
        }
        if (arg0.field2743 == 2 && !field444) {
            String var3;
            if (class178.method2767(method572(arg0)) == 0) {
                var3 = null;
            } else if (arg0.field2864 == null || arg0.field2864.trim().length() == 0) {
                var3 = null;
            } else {
                var3 = arg0.field2864;
            }
            if (var3 != null) {
                method517(var3, class2.method2892(65280) + arg0.field2854, 25, 0, -1, arg0.field2740);
            }
        }
        if (arg0.field2743 == 3) {
            method517(class157.field2467, "", 26, 0, 0, arg0.field2740);
        }
        if (arg0.field2743 == 4) {
            method517(arg0.field2813, "", 28, 0, 0, arg0.field2740);
        }
        if (arg0.field2743 == 5) {
            method517(arg0.field2813, "", 29, 0, 0, arg0.field2740);
        }
        if (arg0.field2743 == 6 && field421 == null) {
            method517(arg0.field2813, "", 30, 0, -1, arg0.field2740);
        }
        if (arg0.field2742 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field2781; var6++) {
                for (int var7 = 0; var7 < arg0.field2755; var7++) {
                    int var8 = (arg0.field2801 + 32) * var7;
                    int var9 = (arg0.field2871 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg0.field2806[var5];
                        var9 += arg0.field2807[var5];
                    }
                    if (arg1 >= var8 && arg2 >= var9 && arg1 < var8 + 32 && arg2 < var9 + 32) {
                        field408 = var5;
                        Statics.field93 = arg0;
                        if (arg0.field2838[var5] > 0) {
                            label319: {
                                class52 var10 = class52.method2618(arg0.field2838[var5] - 1);
                                if (field442 == 1) {
                                    int var11 = method572(arg0);
                                    boolean var12 = (var11 >> 30 & 0x1) != 0;
                                    if (var12) {
                                        if (Statics.field2284 != arg0.field2740 || Statics.field134 != var5) {
                                            method517(class157.field2420, field443 + " " + class2.field25 + " " + class2.method2892(16748608) + var10.field1137, 31, var10.field1116, var5, arg0.field2740);
                                        }
                                        break label319;
                                    }
                                }
                                if (field444) {
                                    int var13 = method572(arg0);
                                    boolean var14 = (var13 >> 30 & 0x1) != 0;
                                    if (var14) {
                                        if ((Statics.field221 & 0x10) == 16) {
                                            method517(field447, field341 + " " + class2.field25 + " " + class2.method2892(16748608) + var10.field1137, 32, var10.field1116, var5, arg0.field2740);
                                        }
                                        break label319;
                                    }
                                }
                                String[] var15 = var10.field1133;
                                if (field460) {
                                    var15 = method148(var15);
                                }
                                int var16 = method572(arg0);
                                boolean var17 = (var16 >> 30 & 0x1) != 0;
                                if (var17) {
                                    for (int var18 = 4; var18 >= 3; var18--) {
                                        if (var15 != null && var15[var18] != null) {
                                            byte var19;
                                            if (var18 == 3) {
                                                var19 = 36;
                                            } else {
                                                var19 = 37;
                                            }
                                            method517(var15[var18], class2.method2892(16748608) + var10.field1137, var19, var10.field1116, var5, arg0.field2740);
                                        } else if (var18 == 4) {
                                            method517(class157.field2309, class2.method2892(16748608) + var10.field1137, 37, var10.field1116, var5, arg0.field2740);
                                        }
                                    }
                                }
                                int var20 = method572(arg0);
                                boolean var21 = (var20 >> 31 & 0x1) != 0;
                                if (var21) {
                                    method517(class157.field2420, class2.method2892(16748608) + var10.field1137, 38, var10.field1116, var5, arg0.field2740);
                                }
                                int var22 = method572(arg0);
                                boolean var23 = (var22 >> 30 & 0x1) != 0;
                                if (var23 && var15 != null) {
                                    for (int var24 = 2; var24 >= 0; var24--) {
                                        if (var15[var24] != null) {
                                            byte var25 = 0;
                                            if (var24 == 0) {
                                                var25 = 33;
                                            }
                                            if (var24 == 1) {
                                                var25 = 34;
                                            }
                                            if (var24 == 2) {
                                                var25 = 35;
                                            }
                                            method517(var15[var24], class2.method2892(16748608) + var10.field1137, var25, var10.field1116, var5, arg0.field2740);
                                        }
                                    }
                                }
                                String[] var26 = arg0.field2809;
                                if (field460) {
                                    var26 = method148(var26);
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
                                            method517(var26[var27], class2.method2892(16748608) + var10.field1137, var28, var10.field1116, var5, arg0.field2740);
                                        }
                                    }
                                }
                                method517(class157.field2459, class2.method2892(16748608) + var10.field1137, 1005, var10.field1116, var5, arg0.field2740);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field2739) {
            return;
        }
        if (field444) {
            int var29 = method572(arg0);
            boolean var30 = (var29 >> 21 & 0x1) != 0;
            if (var30 && (Statics.field221 & 0x20) == 32) {
                method517(field447, field341 + " " + class2.field25 + " " + arg0.field2867, 58, 0, arg0.field2766, arg0.field2740);
            }
            return;
        }
        for (int var31 = 9; var31 >= 5; var31--) {
            String var32 = method1726(arg0, var31);
            if (var32 != null) {
                method517(var32, arg0.field2867, 1007, var31 + 1, arg0.field2766, arg0.field2740);
            }
        }
        String var33;
        if (class178.method2767(method572(arg0)) == 0) {
            var33 = null;
        } else if (arg0.field2864 == null || arg0.field2864.trim().length() == 0) {
            var33 = null;
        } else {
            var33 = arg0.field2864;
        }
        if (var33 != null) {
            method517(var33, arg0.field2867, 25, 0, arg0.field2766, arg0.field2740);
        }
        for (int var35 = 4; var35 >= 0; var35--) {
            String var36 = method1726(arg0, var35);
            if (var36 != null) {
                method517(var36, arg0.field2867, 57, var35 + 1, arg0.field2766, arg0.field2740);
            }
        }
        if (class178.method2887(method572(arg0))) {
            method517(class157.field2465, "", 30, 0, arg0.field2766, arg0.field2740);
        }
    }

    @ObfuscatedName("fz.ce([Lfb;IIIIIIII)V")
    public static final void method3255(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class173 var9 = arg0[var8];
            if (var9 != null && (!var9.field2739 || var9.field2742 == 0 || var9.field2790 || method572(var9) != 0 || field360 == var9 || var9.field2744 == 1338) && var9.field2800 == arg1 && (!var9.field2739 || !method2239(var9))) {
                int var10 = var9.field2753 + arg6;
                int var11 = var9.field2754 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2742 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2742 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2755 + var10;
                    int var19 = var9.field2781 + var11;
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
                    int var22 = var9.field2755 + var10;
                    int var23 = var9.field2781 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field462 == var9) {
                    field390 = true;
                    field315 = var10;
                    field472 = var11;
                }
                if (!var9.field2739 || var12 < var14 && var13 < var15) {
                    int var24 = class140.field2143;
                    int var25 = class140.field2139 * 869381013;
                    if (class140.field2138 != 0) {
                        var24 = class140.field2145;
                        var25 = class140.field2136;
                    }
                    if (var9.field2744 == 1337) {
                        if (!field463 && !field525 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field442 == 0 && !field444) {
                                method517(class157.field2463, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class105.field1804; var28++) {
                                int var29 = class105.field1822[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field841.method1758(Statics.field1963, var30, var31, var29) >= 0) {
                                        class41 var34 = class41.method1443(var33);
                                        if (var34.field977 != null) {
                                            var34 = var34.method757();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field442 == 1) {
                                            method517(class157.field2420, field443 + " " + class2.field25 + " " + class2.method2892(65535) + var34.field969, 1, var29, var30, var31);
                                        } else if (!field444) {
                                            String[] var35 = var34.field943;
                                            if (field460) {
                                                var35 = method148(var35);
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
                                                        method517(var35[var36], class2.method2892(65535) + var34.field969, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method517(class157.field2459, class2.method2892(65535) + var34.field969, 1002, var34.field970 << 14, var30, var31);
                                        } else if ((Statics.field221 & 0x4) == 4) {
                                            method517(field447, field341 + " " + class2.field25 + " " + class2.method2892(65535) + var34.field969, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class35 var38 = field470[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field790.field903 == 1 && (var38.field855 & 0x7F) == 64 && (var38.field825 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field329; var39++) {
                                                class35 var40 = field470[field330[var39]];
                                                if (var40 != null && var38 != var40 && var40.field790.field903 == 1 && var38.field855 == var40.field855 && var38.field825 == var40.field825) {
                                                    method1913(var40.field790, field330[var39], var30, var31);
                                                }
                                            }
                                            int var41 = class33.field768;
                                            int[] var42 = class33.field761;
                                            for (int var43 = 0; var43 < var41; var43++) {
                                                class3 var44 = field412[var42[var43]];
                                                if (var44 != null && var38.field855 == var44.field855 && var38.field825 == var44.field825) {
                                                    method2616(var44, var42[var43], var30, var31);
                                                }
                                            }
                                        }
                                        method1913(var38.field790, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var45 = field412[var33];
                                        if (var45 == null) {
                                            continue;
                                        }
                                        if ((var45.field855 & 0x7F) == 64 && (var45.field825 & 0x7F) == 64) {
                                            for (int var46 = 0; var46 < field329; var46++) {
                                                class35 var47 = field470[field330[var46]];
                                                if (var47 != null && var47.field790.field903 == 1 && var45.field855 == var47.field855 && var45.field825 == var47.field825) {
                                                    method1913(var47.field790, field330[var46], var30, var31);
                                                }
                                            }
                                            int var48 = class33.field768;
                                            int[] var49 = class33.field761;
                                            for (int var50 = 0; var50 < var48; var50++) {
                                                class3 var51 = field412[var49[var50]];
                                                if (var51 != null && var45 != var51 && var45.field855 == var51.field855 && var45.field825 == var51.field825) {
                                                    method2616(var51, var49[var50], var30, var31);
                                                }
                                            }
                                        }
                                        if (field422 == var33) {
                                            var26 = var29;
                                        } else {
                                            method2616(var45, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class199 var52 = field437[Statics.field1963][var30][var31];
                                        if (var52 != null) {
                                            for (class29 var53 = (class29) var52.method3528(); var53 != null; var53 = (class29) var52.method3538()) {
                                                class52 var54 = class52.method2618(var53.field676);
                                                if (field442 == 1) {
                                                    method517(class157.field2420, field443 + " " + class2.field25 + " " + class2.method2892(16748608) + var54.field1137, 16, var53.field676, var30, var31);
                                                } else if (!field444) {
                                                    String[] var55 = var54.field1108;
                                                    if (field460) {
                                                        var55 = method148(var55);
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
                                                            method517(var55[var56], class2.method2892(16748608) + var54.field1137, var57, var53.field676, var30, var31);
                                                        } else if (var56 == 2) {
                                                            method517(class157.field2308, class2.method2892(16748608) + var54.field1137, 20, var53.field676, var30, var31);
                                                        }
                                                    }
                                                    method517(class157.field2459, class2.method2892(16748608) + var54.field1137, 1004, var53.field676, var30, var31);
                                                } else if ((Statics.field221 & 0x1) == 1) {
                                                    method517(field447, field341 + " " + class2.field25 + " " + class2.method2892(16748608) + var54.field1137, 17, var53.field676, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var58 = var26 & 0x7F;
                                int var59 = var26 >> 7 & 0x7F;
                                class3 var60 = field412[field422];
                                method2616(var60, field422, var58, var59);
                            }
                        }
                    } else if (var9.field2744 == 1338) {
                        method2228(var9, var10, var11);
                    } else {
                        if (!field525 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method46(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2742 == 0) {
                            if (!var9.field2739 && method2239(var9) && Statics.field272 != var9) {
                                continue;
                            }
                            method3255(arg0, var9.field2740, var12, var13, var14, var15, var10 - var9.field2731, var11 - var9.field2762);
                            if (var9.field2759 != null) {
                                method3255(var9.field2759, var9.field2740, var12, var13, var14, var15, var10 - var9.field2731, var11 - var9.field2762);
                            }
                            class4 var61 = (class4) field450.method3509((long) var9.field2740);
                            if (var61 != null) {
                                if (var61.field62 == 0 && class140.field2143 >= var12 && class140.field2139 * 869381013 >= var13 && class140.field2143 < var14 && class140.field2139 * 869381013 < var15 && !field525 && !field459) {
                                    for (class1 var62 = (class1) field567.method3535(); var62 != null; var62 = (class1) field567.method3537()) {
                                        if (var62.field2) {
                                            var62.method3624();
                                            var62.field3.field2811 = false;
                                        }
                                    }
                                    if (Statics.field41 == 0) {
                                        field462 = null;
                                        field360 = null;
                                    }
                                    if (!field525) {
                                        field465[0] = class157.field2544;
                                        field313[0] = "";
                                        field290[0] = 1006;
                                        field449 = 1;
                                    }
                                }
                                int var63 = var61.field65;
                                if (class173.method144(var63)) {
                                    method3255(Statics.field2817[var63], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2739) {
                            if (var9.field2748) {
                                if (class140.field2143 >= var12 && class140.field2139 * 869381013 >= var13 && class140.field2143 < var14 && class140.field2139 * 869381013 < var15) {
                                    for (class1 var64 = (class1) field567.method3535(); var64 != null; var64 = (class1) field567.method3537()) {
                                        if (var64.field2) {
                                            var64.method3624();
                                            var64.field3.field2811 = false;
                                        }
                                    }
                                    if (Statics.field41 == 0) {
                                        field462 = null;
                                        field360 = null;
                                    }
                                    if (!field525) {
                                        field465[0] = class157.field2544;
                                        field313[0] = "";
                                        field290[0] = 1006;
                                        field449 = 1;
                                    }
                                }
                            } else if (var9.field2872 && class140.field2143 >= var12 && class140.field2139 * 869381013 >= var13 && class140.field2143 < var14 && class140.field2139 * 869381013 < var15) {
                                for (class1 var65 = (class1) field567.method3535(); var65 != null; var65 = (class1) field567.method3537()) {
                                    if (var65.field2 && var65.field3.field2839 == var65.field16) {
                                        var65.method3624();
                                    }
                                }
                            }
                            boolean var66;
                            if (class140.field2143 >= var12 && class140.field2139 * 869381013 >= var13 && class140.field2143 < var14 && class140.field2139 * 869381013 < var15) {
                                var66 = true;
                            } else {
                                var66 = false;
                            }
                            boolean var67 = false;
                            if ((class140.field2137 == 1 || !Statics.field1652 && class140.field2137 == 4) && var66) {
                                var67 = true;
                            }
                            boolean var68 = false;
                            if ((class140.field2138 == 1 || !Statics.field1652 && class140.field2138 == 4) && class140.field2145 >= var12 && class140.field2136 >= var13 && class140.field2145 < var14 && class140.field2136 < var15) {
                                var68 = true;
                            }
                            if (var68) {
                                method2184(var9, class140.field2145 - var10, class140.field2136 - var11);
                            }
                            if (field462 != null && field462 != var9 && var66) {
                                int var69 = method572(var9);
                                boolean var70 = (var69 >> 20 & 0x1) != 0;
                                if (var70) {
                                    field466 = var9;
                                }
                            }
                            if (field360 == var9) {
                                field467 = true;
                                field401 = var10;
                                field469 = var11;
                            }
                            if (var9.field2790) {
                                if (var66 && field505 != 0 && var9.field2839 != null) {
                                    class1 var71 = new class1();
                                    var71.field2 = true;
                                    var71.field3 = var9;
                                    var71.field19 = field505;
                                    var71.field16 = var9.field2839;
                                    field567.method3545(var71);
                                }
                                if (field462 != null || Statics.field574 != null || field525) {
                                    var68 = false;
                                    var67 = false;
                                    var66 = false;
                                }
                                if (!var9.field2861 && var68) {
                                    var9.field2861 = true;
                                    if (var9.field2820 != null) {
                                        class1 var72 = new class1();
                                        var72.field2 = true;
                                        var72.field3 = var9;
                                        var72.field4 = class140.field2145 - var10;
                                        var72.field19 = class140.field2136 - var11;
                                        var72.field16 = var9.field2820;
                                        field567.method3545(var72);
                                    }
                                }
                                if (var9.field2861 && var67 && var9.field2850 != null) {
                                    class1 var73 = new class1();
                                    var73.field2 = true;
                                    var73.field3 = var9;
                                    var73.field4 = class140.field2143 - var10;
                                    var73.field19 = class140.field2139 * 869381013 - var11;
                                    var73.field16 = var9.field2850;
                                    field567.method3545(var73);
                                }
                                if (var9.field2861 && !var67) {
                                    var9.field2861 = false;
                                    if (var9.field2822 != null) {
                                        class1 var74 = new class1();
                                        var74.field2 = true;
                                        var74.field3 = var9;
                                        var74.field4 = class140.field2143 - var10;
                                        var74.field19 = class140.field2139 * 869381013 - var11;
                                        var74.field16 = var9.field2822;
                                        field490.method3545(var74);
                                    }
                                }
                                if (var67 && var9.field2823 != null) {
                                    class1 var75 = new class1();
                                    var75.field2 = true;
                                    var75.field3 = var9;
                                    var75.field4 = class140.field2143 - var10;
                                    var75.field19 = class140.field2139 * 869381013 - var11;
                                    var75.field16 = var9.field2823;
                                    field567.method3545(var75);
                                }
                                if (!var9.field2811 && var66) {
                                    var9.field2811 = true;
                                    if (var9.field2824 != null) {
                                        class1 var76 = new class1();
                                        var76.field2 = true;
                                        var76.field3 = var9;
                                        var76.field4 = class140.field2143 - var10;
                                        var76.field19 = class140.field2139 * 869381013 - var11;
                                        var76.field16 = var9.field2824;
                                        field567.method3545(var76);
                                    }
                                }
                                if (var9.field2811 && var66 && var9.field2860 != null) {
                                    class1 var77 = new class1();
                                    var77.field2 = true;
                                    var77.field3 = var9;
                                    var77.field4 = class140.field2143 - var10;
                                    var77.field19 = class140.field2139 * 869381013 - var11;
                                    var77.field16 = var9.field2860;
                                    field567.method3545(var77);
                                }
                                if (var9.field2811 && !var66) {
                                    var9.field2811 = false;
                                    if (var9.field2826 != null) {
                                        class1 var78 = new class1();
                                        var78.field2 = true;
                                        var78.field3 = var9;
                                        var78.field4 = class140.field2143 - var10;
                                        var78.field19 = class140.field2139 * 869381013 - var11;
                                        var78.field16 = var9.field2826;
                                        field490.method3545(var78);
                                    }
                                }
                                if (var9.field2837 != null) {
                                    class1 var79 = new class1();
                                    var79.field3 = var9;
                                    var79.field16 = var9.field2837;
                                    field489.method3545(var79);
                                }
                                if (var9.field2808 != null && field453 > var9.field2776) {
                                    if (var9.field2761 == null || field453 - var9.field2776 > 32) {
                                        class1 var84 = new class1();
                                        var84.field3 = var9;
                                        var84.field16 = var9.field2808;
                                        field567.method3545(var84);
                                    } else {
                                        label832: for (int var80 = var9.field2776; var80 < field453; var80++) {
                                            int var81 = field475[var80 & 0x1F];
                                            for (int var82 = 0; var82 < var9.field2761.length; var82++) {
                                                if (var9.field2761[var82] == var81) {
                                                    class1 var83 = new class1();
                                                    var83.field3 = var9;
                                                    var83.field16 = var9.field2808;
                                                    field567.method3545(var83);
                                                    break label832;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2776 = field453;
                                }
                                if (var9.field2833 != null && field446 > var9.field2821) {
                                    if (var9.field2834 == null || field446 - var9.field2821 > 32) {
                                        class1 var89 = new class1();
                                        var89.field3 = var9;
                                        var89.field16 = var9.field2833;
                                        field567.method3545(var89);
                                    } else {
                                        label808: for (int var85 = var9.field2821; var85 < field446; var85++) {
                                            int var86 = field434[var85 & 0x1F];
                                            for (int var87 = 0; var87 < var9.field2834.length; var87++) {
                                                if (var9.field2834[var87] == var86) {
                                                    class1 var88 = new class1();
                                                    var88.field3 = var9;
                                                    var88.field16 = var9.field2833;
                                                    field567.method3545(var88);
                                                    break label808;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2821 = field446;
                                }
                                if (var9.field2835 != null && field480 > var9.field2868) {
                                    if (var9.field2836 == null || field480 - var9.field2868 > 32) {
                                        class1 var94 = new class1();
                                        var94.field3 = var9;
                                        var94.field16 = var9.field2835;
                                        field567.method3545(var94);
                                    } else {
                                        label784: for (int var90 = var9.field2868; var90 < field480; var90++) {
                                            int var91 = field479[var90 & 0x1F];
                                            for (int var92 = 0; var92 < var9.field2836.length; var92++) {
                                                if (var9.field2836[var92] == var91) {
                                                    class1 var93 = new class1();
                                                    var93.field3 = var9;
                                                    var93.field16 = var9.field2835;
                                                    field567.method3545(var93);
                                                    break label784;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2868 = field480;
                                }
                                if (field481 > var9.field2855 && var9.field2816 != null) {
                                    class1 var95 = new class1();
                                    var95.field3 = var9;
                                    var95.field16 = var9.field2816;
                                    field567.method3545(var95);
                                }
                                if (field338 > var9.field2855 && var9.field2842 != null) {
                                    class1 var96 = new class1();
                                    var96.field3 = var9;
                                    var96.field16 = var9.field2842;
                                    field567.method3545(var96);
                                }
                                if (field483 > var9.field2855 && var9.field2843 != null) {
                                    class1 var97 = new class1();
                                    var97.field3 = var9;
                                    var97.field16 = var9.field2843;
                                    field567.method3545(var97);
                                }
                                if (field427 > var9.field2855 && var9.field2848 != null) {
                                    class1 var98 = new class1();
                                    var98.field3 = var9;
                                    var98.field16 = var9.field2848;
                                    field567.method3545(var98);
                                }
                                if (field426 > var9.field2855 && var9.field2856 != null) {
                                    class1 var99 = new class1();
                                    var99.field3 = var9;
                                    var99.field16 = var9.field2856;
                                    field567.method3545(var99);
                                }
                                if (field486 > var9.field2855 && var9.field2844 != null) {
                                    class1 var100 = new class1();
                                    var100.field3 = var9;
                                    var100.field16 = var9.field2844;
                                    field567.method3545(var100);
                                }
                                var9.field2855 = field524;
                                if (var9.field2841 != null) {
                                    for (int var101 = 0; var101 < field512; var101++) {
                                        class1 var102 = new class1();
                                        var102.field3 = var9;
                                        var102.field13 = field514[var101];
                                        var102.field12 = field417[var101];
                                        var102.field16 = var9.field2841;
                                        field567.method3545(var102);
                                    }
                                }
                            }
                        }
                        if (!var9.field2739 && field462 == null && Statics.field574 == null && !field525) {
                            if ((var9.field2853 >= 0 || var9.field2804 != 0) && class140.field2143 >= var12 && class140.field2139 * 869381013 >= var13 && class140.field2143 < var14 && class140.field2139 * 869381013 < var15) {
                                if (var9.field2853 >= 0) {
                                    Statics.field272 = arg0[var9.field2853];
                                } else {
                                    Statics.field272 = var9;
                                }
                            }
                            if (var9.field2742 == 8 && class140.field2143 >= var12 && class140.field2139 * 869381013 >= var13 && class140.field2143 < var14 && class140.field2139 * 869381013 < var15) {
                                Statics.field1105 = var9;
                            }
                            if (var9.field2764 > var9.field2781) {
                                int var103 = var9.field2755 + var10;
                                int var104 = var9.field2781;
                                int var105 = var9.field2764;
                                int var106 = class140.field2143;
                                int var107 = class140.field2139 * 869381013;
                                if (field373) {
                                    field374 = 32;
                                } else {
                                    field374 = 0;
                                }
                                field373 = false;
                                if (class140.field2137 == 1 || !Statics.field1652 && class140.field2137 == 4) {
                                    if (var106 >= var103 && var106 < var103 + 16 && var107 >= var11 && var107 < var11 + 16) {
                                        var9.field2762 -= 4;
                                        method645(var9);
                                    } else if (var106 >= var103 && var106 < var103 + 16 && var107 >= var11 + var104 - 16 && var107 < var11 + var104) {
                                        var9.field2762 += 4;
                                        method645(var9);
                                    } else if (var106 >= var103 - field374 && var106 < field374 + var103 + 16 && var107 >= var11 + 16 && var107 < var11 + var104 - 16) {
                                        int var108 = (var104 - 32) * var104 / var105;
                                        if (var108 < 8) {
                                            var108 = 8;
                                        }
                                        int var109 = var107 - var11 - 16 - var108 / 2;
                                        int var110 = var104 - 32 - var108;
                                        var9.field2762 = (var105 - var104) * var109 / var110;
                                        method645(var9);
                                        field373 = true;
                                    }
                                }
                                if (field505 != 0) {
                                    int var111 = var9.field2755;
                                    if (var106 >= var103 - var111 && var107 >= var11 && var106 < var103 + 16 && var107 <= var11 + var104) {
                                        var9.field2762 += field505 * 45;
                                        method645(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bx.cj([Lfb;II)V")
    public static final void method1502(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2742 == 0) {
                    if (var3.field2759 != null) {
                        method1502(var3.field2759, arg1);
                    }
                    class4 var4 = (class4) field450.method3509((long) var3.field2740);
                    if (var4 != null) {
                        int var5 = var4.field65;
                        if (class173.method144(var5)) {
                            method1502(Statics.field2817[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2732 != null) {
                    class1 var6 = new class1();
                    var6.field3 = var3;
                    var6.field16 = var3.field2732;
                    class37.method521(var6, 200000);
                }
                if (arg1 == 1 && var3.field2846 != null) {
                    if (var3.field2766 >= 0) {
                        class173 var7 = class173.method2988(var3.field2740);
                        if (var7 == null || var7.field2759 == null || var3.field2766 >= var7.field2759.length || var7.field2759[var3.field2766] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field3 = var3;
                    var8.field16 = var3.field2846;
                    class37.method521(var8, 200000);
                }
            }
        }
    }

    @ObfuscatedName("dp.cg(Lfb;IIB)V")
    public static final void method2184(class173 arg0, int arg1, int arg2) {
        if (field462 != null || field525 || arg0 == null || method2740(arg0) == null) {
            return;
        }
        field462 = arg0;
        field360 = method2740(arg0);
        field464 = arg1;
        field474 = arg2;
        Statics.field41 = 0;
        field473 = false;
        if (field449 > 0) {
            method105(field449 - 1);
        }
    }

    @ObfuscatedName("dq.cr(I)V")
    public static final void method2189() {
        method645(field462);
        Statics.field41++;
        if (field390 && field467) {
            int var0 = class140.field2143;
            int var1 = class140.field2139 * 869381013;
            int var2 = var0 - field464;
            int var3 = var1 - field474;
            if (var2 < field401) {
                var2 = field401;
            }
            if (field462.field2755 + var2 > field401 + field360.field2755) {
                var2 = field401 + field360.field2755 - field462.field2755;
            }
            if (var3 < field469) {
                var3 = field469;
            }
            if (field462.field2781 + var3 > field469 + field360.field2781) {
                var3 = field469 + field360.field2781 - field462.field2781;
            }
            int var4 = var2 - field315;
            int var5 = var3 - field472;
            int var6 = field462.field2814;
            if (Statics.field41 > field462.field2815 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field473 = true;
            }
            int var7 = field360.field2731 + (var2 - field401);
            int var8 = field360.field2762 + (var3 - field469);
            if (field462.field2818 != null && field473) {
                class1 var9 = new class1();
                var9.field3 = field462;
                var9.field4 = var7;
                var9.field19 = var8;
                var9.field16 = field462.field2818;
                class37.method521(var9, 200000);
            }
            if (class140.field2137 == 0) {
                if (field473) {
                    if (field462.field2828 != null) {
                        class1 var10 = new class1();
                        var10.field3 = field462;
                        var10.field4 = var7;
                        var10.field19 = var8;
                        var10.field1 = field466;
                        var10.field16 = field462.field2828;
                        class37.method521(var10, 200000);
                    }
                    if (field466 != null && method2569(field462) != null) {
                        field295.method2549(240);
                        field295.method2341(field466.field2858);
                        field295.method2466(field462.field2858);
                        field295.method2351(field466.field2740);
                        field295.method2381(field466.field2766);
                        field295.method2381(field462.field2766);
                        field295.method2352(field462.field2740);
                    }
                } else {
                    label99: {
                        label72: {
                            if (field429 != 1) {
                                int var11 = field449 - 1;
                                boolean var12;
                                if (var11 < 0) {
                                    var12 = false;
                                } else {
                                    int var13 = field290[var11];
                                    if (var13 >= 2000) {
                                        var13 -= 2000;
                                    }
                                    if (var13 == 1007) {
                                        var12 = true;
                                    } else {
                                        var12 = false;
                                    }
                                }
                                if (!var12) {
                                    break label72;
                                }
                            }
                            if (field449 > 2) {
                                method2910(field464 + field315, field474 + field472);
                                break label99;
                            }
                        }
                        if (field449 > 0) {
                            int var14 = field464 + field315;
                            int var15 = field474 + field472;
                            class31 var16 = Statics.field99;
                            method55(var16.field710, var16.field717, var16.field707, var16.field705, var16.field718, var16.field718, var14, var15);
                            Statics.field99 = null;
                        }
                    }
                }
                field462 = null;
            }
        } else if (Statics.field41 > 1) {
            field462 = null;
        }
    }

    @ObfuscatedName("r.ca(IB)V")
    public static void method105(int arg0) {
        Statics.field99 = new class31();
        Statics.field99.field710 = field432[arg0];
        Statics.field99.field717 = field433[arg0];
        Statics.field99.field707 = field290[arg0];
        Statics.field99.field705 = field435[arg0];
        Statics.field99.field718 = field465[arg0];
    }

    @ObfuscatedName("au.cu(Lfb;I)V")
    public static void method645(class173 arg0) {
        if (field493 == arg0.field2870) {
            field494[arg0.field2869] = true;
        }
    }

    @ObfuscatedName("ae.cv(I)V")
    public static void method659() {
        for (class4 var0 = (class4) field450.method3496(); var0 != null; var0 = (class4) field450.method3500()) {
            int var1 = var0.field65;
            if (class173.method144(var1)) {
                boolean var2 = true;
                class173[] var3 = Statics.field2817[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2739;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3099;
                    class173 var6 = class173.method2988(var5);
                    if (var6 != null) {
                        method645(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("eh.do(Lfb;I)Lfb;")
    public static class173 method2740(class173 arg0) {
        class173 var1 = method2569(arg0);
        if (var1 == null) {
            var1 = arg0.field2752;
        }
        return var1;
    }

    @ObfuscatedName("c.dv([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method148(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("fw.dp(IB)V")
    public static final void method2989(int arg0) {
        if (!class173.method144(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2817[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3 != null) {
                var3.field2793 = 0;
                var3.field2827 = 0;
            }
        }
    }

    @ObfuscatedName("s.dq([Lfb;II)V")
    public static final void method88(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null && var3.field2800 == arg1 && (!var3.field2739 || !method2239(var3))) {
                if (var3.field2742 == 0) {
                    if (!var3.field2739 && method2239(var3) && Statics.field272 != var3) {
                        continue;
                    }
                    method88(arg0, var3.field2740);
                    if (var3.field2759 != null) {
                        method88(var3.field2759, var3.field2740);
                    }
                    class4 var4 = (class4) field450.method3509((long) var3.field2740);
                    if (var4 != null) {
                        int var5 = var4.field65;
                        if (class173.method144(var5)) {
                            method88(Statics.field2817[var5], -1);
                        }
                    }
                }
                if (var3.field2742 == 6) {
                    if (var3.field2785 != -1 || var3.field2760 != -1) {
                        boolean var6 = method2185(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2760;
                        } else {
                            var7 = var3.field2785;
                        }
                        if (var7 != -1) {
                            class43 var8 = class43.method3831(var7);
                            var3.field2827 += field566;
                            while (var3.field2827 > var8.field1010[var3.field2793]) {
                                var3.field2827 -= var8.field1010[var3.field2793];
                                var3.field2793++;
                                if (var3.field2793 >= var8.field1000.length) {
                                    var3.field2793 -= var8.field1015;
                                    if (var3.field2793 < 0 || var3.field2793 >= var8.field1000.length) {
                                        var3.field2793 = 0;
                                    }
                                }
                                method645(var3);
                            }
                        }
                    }
                    if (var3.field2794 != 0 && !var3.field2739) {
                        int var9 = var3.field2794 >> 16;
                        int var10 = var3.field2794 << 16 >> 16;
                        int var11 = field566 * var9;
                        int var12 = field566 * var10;
                        var3.field2780 = var3.field2780 + var11 & 0x7FF;
                        var3.field2730 = var3.field2730 + var12 & 0x7FF;
                        method645(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("k.dy(II)V")
    public static final void method116(int arg0) {
        method659();
        class24.method54();
        class53 var1 = (class53) class53.field1165.method3467((long) arg0);
        class53 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1164.method3080(16, arg0);
            class53 var4 = new class53();
            if (var3 != null) {
                var4.method1028(new class119(var3));
            }
            class53.field1165.method3466(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var5 = var2.field1163;
        if (var5 == 0) {
            return;
        }
        int var6 = class176.field2895[arg0];
        if (var5 == 1) {
            if (var6 == 1) {
                class91.method1921(0.9D);
                ((class95) Statics.field1578).method1993(0.9D);
            }
            if (var6 == 2) {
                class91.method1921(0.8D);
                ((class95) Statics.field1578).method1993(0.8D);
            }
            if (var6 == 3) {
                class91.method1921(0.7D);
                ((class95) Statics.field1578).method1993(0.7D);
            }
            if (var6 == 4) {
                class91.method1921(0.6D);
                ((class95) Statics.field1578).method1993(0.6D);
            }
            class52.field1115.method3464();
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
            if (field526 != var7) {
                if (field526 == 0 && field528 != -1) {
                    class183.method152(Statics.field159, field528, 0, var7, false);
                    field319 = false;
                } else if (var7 == 0) {
                    class183.method2222();
                    field319 = false;
                } else if (class183.field2946 == 0) {
                    Statics.field791.method3362(var7);
                } else {
                    Statics.field2031 = var7;
                }
                field526 = var7;
            }
        }
        if (var5 == 4) {
            if (var6 == 0) {
                field571 = 127;
            }
            if (var6 == 1) {
                field571 = 96;
            }
            if (var6 == 2) {
                field571 = 64;
            }
            if (var6 == 3) {
                field571 = 32;
            }
            if (var6 == 4) {
                field571 = 0;
            }
        }
        if (var5 == 5) {
            field429 = var6;
        }
        if (var5 == 6) {
            field397 = var6;
        }
        if (var5 == 9) {
            field452 = var6;
        }
        if (var5 == 10) {
            if (var6 == 0) {
                field530 = 127;
            }
            if (var6 == 1) {
                field530 = 96;
            }
            if (var6 == 2) {
                field530 = 64;
            }
            if (var6 == 3) {
                field530 = 32;
            }
            if (var6 == 4) {
                field530 = 0;
            }
        }
        if (var5 == 17) {
            field457 = var6 & 0xFFFF;
        }
        if (var5 == 18) {
            field535 = (class21) class109.method927(class21.method171(), var6);
            if (field535 == null) {
                field535 = class21.field583;
            }
        }
        if (var5 != 19) {
            return;
        }
        if (var6 == -1) {
            field422 = -1;
        } else {
            field422 = var6 & 0x7FF;
        }
    }

    @ObfuscatedName("l.dw(Lfb;I)V")
    public static final void method177(class173 arg0) {
        int var1 = arg0.field2744;
        if (var1 == 324) {
            if (field563 == -1) {
                field563 = arg0.field2773;
                field564 = arg0.field2774;
            }
            if (field448.field2905) {
                arg0.field2773 = field563;
            } else {
                arg0.field2773 = field564;
            }
        } else if (var1 == 325) {
            if (field563 == -1) {
                field563 = arg0.field2773;
                field564 = arg0.field2774;
            }
            if (field448.field2905) {
                arg0.field2773 = field564;
            } else {
                arg0.field2773 = field563;
            }
        } else if (var1 == 327) {
            arg0.field2780 = 150;
            arg0.field2730 = (int) (Math.sin((double) field302 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2859 = 5;
            arg0.field2777 = 0;
        } else if (var1 == 328) {
            arg0.field2780 = 150;
            arg0.field2730 = (int) (Math.sin((double) field302 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2859 = 5;
            arg0.field2777 = 1;
        }
    }

    @ObfuscatedName("ay.da(Lh;ZI)V")
    public static final void method711(class4 arg0, boolean arg1) {
        int var2 = arg0.field65;
        int var3 = (int) arg0.field3099;
        arg0.method3624();
        if (arg1 && var2 != -1 && Statics.field2805[var2]) {
            Statics.field2863.method3086(var2);
            if (Statics.field2817[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2817[var2].length; var5++) {
                    if (Statics.field2817[var2][var5] != null) {
                        if (Statics.field2817[var2][var5].field2742 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2817[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2817[var2] = null;
                }
                Statics.field2805[var2] = false;
            }
        }
        for (class201 var6 = (class201) field491.method3496(); var6 != null; var6 = (class201) field491.method3500()) {
            if ((var6.field3099 >> 48 & 0xFFFFL) == (long) var2) {
                var6.method3624();
            }
        }
        class173 var7 = class173.method2988(var3);
        if (var7 != null) {
            method645(var7);
        }
        method1908();
        if (field517 != -1) {
            int var8 = field517;
            if (class173.method144(var8)) {
                method1502(Statics.field2817[var8], 1);
            }
        }
    }

    @ObfuscatedName("z.dl(Lfb;I)Z")
    public static final boolean method143(class173 arg0) {
        int var1 = arg0.field2744;
        if (var1 == 205) {
            field301 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field448.method3228(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field448.method3229(var4, var5 == 1);
        }
        if (var1 == 324) {
            field448.method3230(false);
        }
        if (var1 == 325) {
            field448.method3230(true);
        }
        if (var1 == 326) {
            field295.method2549(103);
            field448.method3231(field295);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("h.dc(Lfb;IIII)V")
    public static final void method51(class173 arg0, int arg1, int arg2, int arg3) {
        method833();
        class175 var4 = arg0.method3192(false);
        if (var4 == null) {
            return;
        }
        class80.method1632(arg1, arg2, var4.field2884 + arg1, var4.field2886 + arg2);
        if (field345 == 2 || field345 == 5) {
            class80.method1647(arg1, arg2, 0, var4.field2890, var4.field2885);
        } else {
            int var5 = field409 + field376 & 0x7FF;
            int var6 = Statics.field162.field855 / 32 + 48;
            int var7 = 464 - Statics.field162.field825 / 32;
            Statics.field680.method1564(arg1, arg2, var4.field2884, var4.field2886, var6, var7, var5, field363 + 256, var4.field2890, var4.field2885);
            for (int var8 = 0; var8 < field558; var8++) {
                int var9 = field520[var8] * 4 + 2 - Statics.field162.field855 / 32;
                int var10 = field521[var8] * 4 + 2 - Statics.field162.field825 / 32;
                method149(arg1, arg2, var9, var10, field522[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class199 var13 = field437[Statics.field1963][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field162.field855 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field162.field825 / 32;
                        method149(arg1, arg2, var14, var15, Statics.field2060[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field329; var16++) {
                class35 var17 = field470[field330[var16]];
                if (var17 != null && var17.method20()) {
                    class40 var18 = var17.field790;
                    if (var18 != null && var18.field927 != null) {
                        var18 = var18.method722();
                    }
                    if (var18 != null && var18.field918 && var18.field930) {
                        int var19 = var17.field855 / 32 - Statics.field162.field855 / 32;
                        int var20 = var17.field825 / 32 - Statics.field162.field825 / 32;
                        method149(arg1, arg2, var19, var20, Statics.field2060[1], var4);
                    }
                }
            }
            int var21 = class33.field768;
            int[] var22 = class33.field761;
            for (int var23 = 0; var23 < var21; var23++) {
                class3 var24 = field412[var22[var23]];
                if (var24 != null && var24.method20() && !var24.field54 && Statics.field162 != var24) {
                    int var25 = var24.field855 / 32 - Statics.field162.field855 / 32;
                    int var26 = var24.field825 / 32 - Statics.field162.field825 / 32;
                    boolean var27 = false;
                    if (method185(var24.field51, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field2726; var29++) {
                        if (var24.field51.equals(Statics.field2655[var29].field622)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field162.field53 != 0 && var24.field53 != 0 && Statics.field162.field53 == var24.field53) {
                        var30 = true;
                    }
                    if (var27) {
                        method149(arg1, arg2, var25, var26, Statics.field2060[3], var4);
                    } else if (var30) {
                        method149(arg1, arg2, var25, var26, Statics.field2060[4], var4);
                    } else if (var28) {
                        method149(arg1, arg2, var25, var26, Statics.field2060[5], var4);
                    } else {
                        method149(arg1, arg2, var25, var26, Statics.field2060[2], var4);
                    }
                }
            }
            if (field310 != 0 && field302 % 20 < 10) {
                if (field310 == 1 && field311 >= 0 && field311 < field470.length) {
                    class35 var31 = field470[field311];
                    if (var31 != null) {
                        int var32 = var31.field855 / 32 - Statics.field162.field855 / 32;
                        int var33 = var31.field825 / 32 - Statics.field162.field825 / 32;
                        method165(arg1, arg2, var32, var33, Statics.field504[1], var4);
                    }
                }
                if (field310 == 2) {
                    int var34 = field477 * 4 - Statics.field2644 * 4 + 2 - Statics.field162.field855 / 32;
                    int var35 = field318 * 4 - Statics.field934 * 4 + 2 - Statics.field162.field825 / 32;
                    method165(arg1, arg2, var34, var35, Statics.field504[1], var4);
                }
                if (field310 == 10 && field312 >= 0 && field312 < field412.length) {
                    class3 var36 = field412[field312];
                    if (var36 != null) {
                        int var37 = var36.field855 / 32 - Statics.field162.field855 / 32;
                        int var38 = var36.field825 / 32 - Statics.field162.field825 / 32;
                        method165(arg1, arg2, var37, var38, Statics.field504[1], var4);
                    }
                }
            }
            if (field523 != 0) {
                int var39 = field523 * 4 + 2 - Statics.field162.field855 / 32;
                int var40 = field471 * 4 + 2 - Statics.field162.field825 / 32;
                method149(arg1, arg2, var39, var40, Statics.field504[0], var4);
            }
            if (!Statics.field162.field54) {
                class80.method1638(var4.field2884 / 2 + arg1 - 1, var4.field2886 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field557[arg3] = true;
    }

    @ObfuscatedName("x.du(IIIILcm;Lfs;B)V")
    public static final void method165(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method149(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field409 + field376 & 0x7FF;
        int var8 = class91.field1558[var7];
        int var9 = class91.field1582[var7];
        int var10 = var8 * 256 / (field363 + 256);
        int var11 = var9 * 256 / (field363 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field1605.method1565(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("c.dn(IIIILcm;Lfs;S)V")
    public static final void method149(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field409 + field376 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class91.field1558[var6];
        int var9 = class91.field1582[var6];
        int var10 = var8 * 256 / (field363 + 256);
        int var11 = var9 * 256 / (field363 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1563(arg5.field2884 / 2 + var12 - arg4.field1405 / 2, arg5.field2886 / 2 - var13 - arg4.field1406 / 2, arg0, arg1, arg5.field2884, arg5.field2886, arg5.field2890, arg5.field2885);
        } else {
            arg4.method1554(arg5.field2884 / 2 + arg0 + var12 - arg4.field1405 / 2, arg5.field2886 / 2 + arg1 - var13 - arg4.field1406 / 2);
        }
    }

    @ObfuscatedName("j.dd(Ljava/lang/String;ZI)Z")
    public static boolean method185(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class164.method610(arg0, Statics.field484);
        for (int var3 = 0; var3 < field556; var3++) {
            if (var2.equalsIgnoreCase(class164.method610(field314[var3].field254, Statics.field484)) && (!arg1 || field314[var3].field250 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class164.method610(Statics.field162.field51, Statics.field484))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ex.dk(Ljava/lang/String;I)Z")
    public static boolean method2898(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class164.method610(arg0, Statics.field484);
        for (int var2 = 0; var2 < field560; var2++) {
            class8 var3 = field428[var2];
            if (var1.equalsIgnoreCase(class164.method610(var3.field138, Statics.field484))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class164.method610(var3.field132, Statics.field484))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ak.df(Ljava/lang/String;I)V")
    public static final void method587(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field556 < 200 || field414 == 1) || field556 >= 400) {
            class12.method930(30, "", class157.field2474);
            return;
        }
        String var1 = class164.method610(arg0, Statics.field484);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field556; var2++) {
            class18 var3 = field314[var2];
            String var4 = class164.method610(var3.field254, Statics.field484);
            if (var4 != null && var4.equals(var1)) {
                class12.method930(30, "", arg0 + class157.field2519);
                return;
            }
            if (var3.field247 != null) {
                String var5 = class164.method610(var3.field247, Statics.field484);
                if (var5 != null && var5.equals(var1)) {
                    class12.method930(30, "", arg0 + class157.field2519);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field560; var6++) {
            class8 var7 = field428[var6];
            String var8 = class164.method610(var7.field138, Statics.field484);
            if (var8 != null && var8.equals(var1)) {
                class12.method930(30, "", class157.field2480 + arg0 + class157.field2526);
                return;
            }
            if (var7.field132 != null) {
                String var9 = class164.method610(var7.field132, Statics.field484);
                if (var9 != null && var9.equals(var1)) {
                    class12.method930(30, "", class157.field2480 + arg0 + class157.field2526);
                    return;
                }
            }
        }
        if (class164.method610(Statics.field162.field51, Statics.field484).equals(var1)) {
            class12.method930(30, "", class157.field2495);
        } else {
            field295.method2549(149);
            field295.method2296(class119.method3638(arg0));
            field295.method2302(arg0);
        }
    }

    @ObfuscatedName("da.dj(Ljava/lang/String;I)V")
    public static final void method2229(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class164.method610(arg0, Statics.field484);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field556; var2++) {
            class18 var3 = field314[var2];
            String var4 = var3.field254;
            String var5 = class164.method610(var4, Statics.field484);
            if (class129.method2011(arg0, var1, var4, var5)) {
                field556--;
                for (int var6 = var2; var6 < field556; var6++) {
                    field314[var6] = field314[var6 + 1];
                }
                field338 = field524;
                field295.method2549(208);
                field295.method2296(class119.method3638(arg0));
                field295.method2302(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("c.ds(Ljava/lang/String;I)V")
    public static final void method150(String arg0) {
        if (!arg0.equals("")) {
            field295.method2549(94);
            field295.method2296(class119.method3638(arg0));
            field295.method2302(arg0);
        }
    }

    @ObfuscatedName("q.di(Lfb;I)I")
    public static int method572(class173 arg0) {
        class201 var1 = (class201) field491.method3509(((long) arg0.field2740 << 32) + (long) arg0.field2766);
        return var1 == null ? arg0.field2810 : var1.field3085;
    }

    @ObfuscatedName("dt.dt(Lfb;I)Lfb;")
    public static class173 method2569(class173 arg0) {
        int var1 = class178.method3114(method572(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class173.method2988(arg0.field2800);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("dc.dg(Lfb;I)Z")
    public static boolean method2239(class173 arg0) {
        if (field459) {
            if (method572(arg0) != 0) {
                return false;
            }
            if (arg0.field2742 == 0) {
                return false;
            }
        }
        return arg0.field2832;
    }

    @ObfuscatedName("ck.dz(Lfb;IB)Ljava/lang/String;")
    public static String method1726(class173 arg0, int arg1) {
        if (!class178.method2974(method572(arg0), arg1) && arg0.field2866 == null) {
            return null;
        } else if (arg0.field2757 == null || arg0.field2757.length <= arg1 || arg0.field2757[arg1] == null || arg0.field2757[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2757[arg1];
        }
    }

    @ObfuscatedName("cc.dh(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method1914(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field293 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field293 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field293 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field293 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field293 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field709 != null) {
            var3 = "/p=" + Statics.field709;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field367 + "/a=" + Statics.field61 + var3 + "/";
    }
}

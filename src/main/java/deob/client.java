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
import java.util.Date;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class144 {

    @ObfuscatedName("client.q")
    public static boolean field298 = true;

    @ObfuscatedName("client.g")
    public static int field441 = 1;

    @ObfuscatedName("client.m")
    public static int field398 = 0;

    @ObfuscatedName("client.j")
    public static int field301 = 0;

    @ObfuscatedName("client.i")
    public static boolean field570 = false;

    @ObfuscatedName("client.w")
    public static class108[] field359 = new class108[4];

    @ObfuscatedName("client.v")
    public static boolean field303 = false;

    @ObfuscatedName("client.o")
    public static int field304 = 0;

    @ObfuscatedName("client.r")
    public static int field305 = 0;

    @ObfuscatedName("client.d")
    public static boolean field401 = true;

    @ObfuscatedName("client.u")
    public static int field577 = 0;

    @ObfuscatedName("client.a")
    public static long field308 = 1L;

    @ObfuscatedName("client.h")
    public static int field310 = -1;

    @ObfuscatedName("client.e")
    public static int field338 = -1;

    @ObfuscatedName("client.ab")
    public static int field312 = -1;

    @ObfuscatedName("client.af")
    public static boolean field453 = true;

    @ObfuscatedName("client.au")
    public static boolean field314 = false;

    @ObfuscatedName("client.ae")
    public static int field384 = 0;

    @ObfuscatedName("client.ax")
    public static int field316 = 0;

    @ObfuscatedName("client.az")
    public static int field516 = 0;

    @ObfuscatedName("client.aa")
    public static int field318 = 0;

    @ObfuscatedName("client.ak")
    public static int field319 = 0;

    @ObfuscatedName("client.ac")
    public static int field320 = 0;

    @ObfuscatedName("client.ar")
    public static int field321 = 0;

    @ObfuscatedName("client.ah")
    public static int field322 = 0;

    @ObfuscatedName("client.an")
    public static int field323 = 0;

    @ObfuscatedName("client.am")
    public static class21 field325 = class21.field582;

    @ObfuscatedName("client.av")
    public static class21 field444 = class21.field582;

    @ObfuscatedName("client.ay")
    public static int field556 = 0;

    @ObfuscatedName("client.aj")
    public static int field450 = 0;

    @ObfuscatedName("client.ao")
    public static int field330 = 0;

    @ObfuscatedName("client.bm")
    public static int field505 = 0;

    @ObfuscatedName("client.bw")
    public static int field332 = 0;

    @ObfuscatedName("client.bd")
    public static int field333 = 0;

    @ObfuscatedName("client.bh")
    public static int field334 = 0;

    @ObfuscatedName("client.bc")
    public static int field335 = 0;

    @ObfuscatedName("client.cr")
    public static class35[] field512 = new class35[32768];

    @ObfuscatedName("client.cu")
    public static int field342 = 0;

    @ObfuscatedName("client.cb")
    public static int[] field311 = new int[32768];

    @ObfuscatedName("client.cd")
    public static int field572 = 0;

    @ObfuscatedName("client.cg")
    public static int[] field341 = new int[250];

    @ObfuscatedName("client.cv")
    public static class122 field493 = new class122(5000);

    @ObfuscatedName("client.ct")
    public static class122 field343 = new class122(5000);

    @ObfuscatedName("client.ck")
    public static class122 field482 = new class122(15000);

    @ObfuscatedName("client.cm")
    public static int field345 = 0;

    @ObfuscatedName("client.cc")
    public static int field346 = 0;

    @ObfuscatedName("client.cq")
    public static int field350 = 0;

    @ObfuscatedName("client.ca")
    public static int field348 = 0;

    @ObfuscatedName("client.ci")
    public static int field414 = 0;

    @ObfuscatedName("client.cn")
    public static int field528 = 0;

    @ObfuscatedName("client.cw")
    public static int field351 = 0;

    @ObfuscatedName("client.cj")
    public static int field352 = 0;

    @ObfuscatedName("client.cf")
    public static boolean field353 = false;

    @ObfuscatedName("client.df")
    public static int field313 = 0;

    @ObfuscatedName("client.dj")
    public static int field355 = 1;

    @ObfuscatedName("client.do")
    public static int field356 = 0;

    @ObfuscatedName("client.de")
    public static int field462 = 1;

    @ObfuscatedName("client.dq")
    public static int field439 = 0;

    @ObfuscatedName("client.dr")
    public static boolean field360 = false;

    @ObfuscatedName("client.da")
    public static int[][][] field545 = new int[4][13][13];

    @ObfuscatedName("client.dp")
    public static final int[] field362 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.di")
    public static int field363 = 0;

    @ObfuscatedName("client.dh")
    public static int field324 = 2;

    @ObfuscatedName("client.dv")
    public static int field365 = 0;

    @ObfuscatedName("client.dm")
    public static int field366 = 2;

    @ObfuscatedName("client.dy")
    public static int field480 = 0;

    @ObfuscatedName("client.ex")
    public static int field368 = 1;

    @ObfuscatedName("client.ep")
    public static int field515 = 0;

    @ObfuscatedName("client.ew")
    public static int field489 = 0;

    @ObfuscatedName("client.en")
    public static int field454 = 2;

    @ObfuscatedName("client.ey")
    public static int field372 = 0;

    @ObfuscatedName("client.ez")
    public static int field373 = 1;

    @ObfuscatedName("client.ee")
    public static int field374 = 0;

    @ObfuscatedName("client.eh")
    public static int field428 = 0;

    @ObfuscatedName("client.ed")
    public static int field377 = 2301979;

    @ObfuscatedName("client.ea")
    public static int field378 = 5063219;

    @ObfuscatedName("client.ei")
    public static int field379 = 3353893;

    @ObfuscatedName("client.ej")
    public static int field380 = 7759444;

    @ObfuscatedName("client.es")
    public static boolean field381 = false;

    @ObfuscatedName("client.fc")
    public static int field361 = 0;

    @ObfuscatedName("client.fv")
    public static int field383 = 128;

    @ObfuscatedName("client.fi")
    public static int field347 = 0;

    @ObfuscatedName("client.fm")
    public static int field385 = 0;

    @ObfuscatedName("client.fo")
    public static int field490 = 0;

    @ObfuscatedName("client.fx")
    public static int field387 = 0;

    @ObfuscatedName("client.fb")
    public static int field388 = 0;

    @ObfuscatedName("client.ft")
    public static int field389 = 50;

    @ObfuscatedName("client.fq")
    public static int field390 = 0;

    @ObfuscatedName("client.fd")
    public static boolean field391 = false;

    @ObfuscatedName("client.fl")
    public static int field426 = 0;

    @ObfuscatedName("client.fy")
    public static int field393 = 0;

    @ObfuscatedName("client.fj")
    public static int field394 = 50;

    @ObfuscatedName("client.fk")
    public static int[] field395 = new int[field394];

    @ObfuscatedName("client.fw")
    public static int[] field396 = new int[field394];

    @ObfuscatedName("client.fa")
    public static int[] field300 = new int[field394];

    @ObfuscatedName("client.fu")
    public static int[] field344 = new int[field394];

    @ObfuscatedName("client.fn")
    public static int[] field317 = new int[field394];

    @ObfuscatedName("client.fh")
    public static int[] field400 = new int[field394];

    @ObfuscatedName("client.gg")
    public static int[] field434 = new int[field394];

    @ObfuscatedName("client.gd")
    public static String[] field402 = new String[field394];

    @ObfuscatedName("client.ge")
    public static int[][] field403 = new int[104][104];

    @ObfuscatedName("client.gh")
    public static int field421 = 0;

    @ObfuscatedName("client.gn")
    public static int field340 = -1;

    @ObfuscatedName("client.gq")
    public static int field406 = -1;

    @ObfuscatedName("client.gk")
    public static int field407 = 0;

    @ObfuscatedName("client.go")
    public static int field408 = 0;

    @ObfuscatedName("client.gv")
    public static int field409 = 0;

    @ObfuscatedName("client.gf")
    public static int field410 = 0;

    @ObfuscatedName("client.ga")
    public static int field411 = 0;

    @ObfuscatedName("client.gl")
    public static int field412 = 0;

    @ObfuscatedName("client.gs")
    public static int field413 = 0;

    @ObfuscatedName("client.gi")
    public static int field327 = 0;

    @ObfuscatedName("client.gb")
    public static int field533 = 0;

    @ObfuscatedName("client.gx")
    public static int field416 = 0;

    @ObfuscatedName("client.gc")
    public static boolean field367 = false;

    @ObfuscatedName("client.gw")
    public static int field309 = 0;

    @ObfuscatedName("client.gj")
    public static int field419 = 0;

    @ObfuscatedName("client.gt")
    public static class3[] field296 = new class3[2048];

    @ObfuscatedName("client.gm")
    public static int field375 = -1;

    @ObfuscatedName("client.hw")
    public static int field422 = 0;

    @ObfuscatedName("client.hr")
    public static int field423 = 0;

    @ObfuscatedName("client.hj")
    public static int[] field424 = new int[1000];

    @ObfuscatedName("client.hq")
    public static final int[] field425 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.he")
    public static String[] field550 = new String[8];

    @ObfuscatedName("client.hi")
    public static boolean[] field427 = new boolean[8];

    @ObfuscatedName("client.ho")
    public static int[] field371 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ht")
    public static int field429 = -1;

    @ObfuscatedName("client.ha")
    public static class199[][][] field430 = new class199[4][104][104];

    @ObfuscatedName("client.hc")
    public static class199 field418 = new class199();

    @ObfuscatedName("client.hh")
    public static class199 field432 = new class199();

    @ObfuscatedName("client.hf")
    public static class199 field514 = new class199();

    @ObfuscatedName("client.hp")
    public static int[] field382 = new int[25];

    @ObfuscatedName("client.hb")
    public static int[] field435 = new int[25];

    @ObfuscatedName("client.hz")
    public static int[] field436 = new int[25];

    @ObfuscatedName("client.hd")
    public static int field527 = 0;

    @ObfuscatedName("client.hn")
    public static boolean field337 = false;

    @ObfuscatedName("client.hg")
    public static int field326 = 0;

    @ObfuscatedName("client.hm")
    public static int[] field440 = new int[500];

    @ObfuscatedName("client.if")
    public static int[] field455 = new int[500];

    @ObfuscatedName("client.ir")
    public static int[] field329 = new int[500];

    @ObfuscatedName("client.io")
    public static int[] field443 = new int[500];

    @ObfuscatedName("client.ib")
    public static String[] field399 = new String[500];

    @ObfuscatedName("client.is")
    public static String[] field445 = new String[500];

    @ObfuscatedName("client.id")
    public static int field446 = -1;

    @ObfuscatedName("client.ij")
    public static int field417 = -1;

    @ObfuscatedName("client.ig")
    public static int field448 = 0;

    @ObfuscatedName("client.ih")
    public static int field449 = 50;

    @ObfuscatedName("client.ic")
    public static int field404 = 0;

    @ObfuscatedName("client.iz")
    public static String field451 = null;

    @ObfuscatedName("client.iv")
    public static boolean field452 = false;

    @ObfuscatedName("client.ip")
    public static int field486 = -1;

    @ObfuscatedName("client.it")
    public static int field525 = -1;

    @ObfuscatedName("client.ia")
    public static String field370 = null;

    @ObfuscatedName("client.in")
    public static String field456 = null;

    @ObfuscatedName("client.iw")
    public static int field457 = -1;

    @ObfuscatedName("client.ik")
    public static class196 field458 = new class196(8);

    @ObfuscatedName("client.js")
    public static int field459 = 0;

    @ObfuscatedName("client.jy")
    public static int field460 = 0;

    @ObfuscatedName("client.jr")
    public static class173 field461 = null;

    @ObfuscatedName("client.jf")
    public static int field358 = 0;

    @ObfuscatedName("client.jt")
    public static int field431 = 0;

    @ObfuscatedName("client.ju")
    public static int field569 = 0;

    @ObfuscatedName("client.jn")
    public static int field465 = -1;

    @ObfuscatedName("client.jg")
    public static boolean field466 = false;

    @ObfuscatedName("client.jx")
    public static boolean field339 = false;

    @ObfuscatedName("client.jq")
    public static boolean field420 = false;

    @ObfuscatedName("client.jd")
    public static class173 field469 = null;

    @ObfuscatedName("client.jh")
    public static class173 field470 = null;

    @ObfuscatedName("client.jv")
    public static class173 field463 = null;

    @ObfuscatedName("client.jb")
    public static int field472 = 0;

    @ObfuscatedName("client.jp")
    public static int field473 = 0;

    @ObfuscatedName("client.jz")
    public static class173 field474 = null;

    @ObfuscatedName("client.jc")
    public static boolean field475 = false;

    @ObfuscatedName("client.je")
    public static int field476 = -1;

    @ObfuscatedName("client.jm")
    public static int field477 = -1;

    @ObfuscatedName("client.jo")
    public static boolean field478 = false;

    @ObfuscatedName("client.jl")
    public static int field479 = -1;

    @ObfuscatedName("client.jk")
    public static int field442 = -1;

    @ObfuscatedName("client.jw")
    public static boolean field481 = false;

    @ObfuscatedName("client.kh")
    public static int field302 = 1;

    @ObfuscatedName("client.kf")
    public static int[] field483 = new int[32];

    @ObfuscatedName("client.kn")
    public static int field484 = 0;

    @ObfuscatedName("client.kp")
    public static int[] field485 = new int[32];

    @ObfuscatedName("client.ks")
    public static int field357 = 0;

    @ObfuscatedName("client.kl")
    public static int[] field498 = new int[32];

    @ObfuscatedName("client.ke")
    public static int field488 = 0;

    @ObfuscatedName("client.ka")
    public static int field376 = 0;

    @ObfuscatedName("client.kv")
    public static int field487 = 0;

    @ObfuscatedName("client.kj")
    public static int field491 = 0;

    @ObfuscatedName("client.ki")
    public static int field492 = 0;

    @ObfuscatedName("client.kx")
    public static int field331 = 0;

    @ObfuscatedName("client.ku")
    public static int field328 = 0;

    @ObfuscatedName("client.kz")
    public static int field495 = 0;

    @ObfuscatedName("client.kk")
    public static class199 field496 = new class199();

    @ObfuscatedName("client.kg")
    public static class199 field497 = new class199();

    @ObfuscatedName("client.kd")
    public static class199 field467 = new class199();

    @ObfuscatedName("client.kr")
    public static class196 field499 = new class196(512);

    @ObfuscatedName("client.km")
    public static int field500 = 0;

    @ObfuscatedName("client.kc")
    public static int field501 = -2;

    @ObfuscatedName("client.ln")
    public static boolean[] field502 = new boolean[100];

    @ObfuscatedName("client.lp")
    public static boolean[] field503 = new boolean[100];

    @ObfuscatedName("client.lc")
    public static boolean[] field504 = new boolean[100];

    @ObfuscatedName("client.lv")
    public static int[] field541 = new int[100];

    @ObfuscatedName("client.lg")
    public static int[] field506 = new int[100];

    @ObfuscatedName("client.lj")
    public static int[] field507 = new int[100];

    @ObfuscatedName("client.ls")
    public static int[] field508 = new int[100];

    @ObfuscatedName("client.lo")
    public static int field509 = 0;

    @ObfuscatedName("client.lu")
    public static long field510 = 0L;

    @ObfuscatedName("client.la")
    public static boolean field511 = true;

    @ObfuscatedName("client.lr")
    public static int field315 = 765;

    @ObfuscatedName("client.lq")
    public static int field513 = 1;

    @ObfuscatedName("client.lw")
    public static int[] field349 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ld")
    public static int field415 = 0;

    @ObfuscatedName("client.li")
    public static int field438 = 0;

    @ObfuscatedName("client.lm")
    public static String field517 = "";

    @ObfuscatedName("client.lx")
    public static long[] field518 = new long[100];

    @ObfuscatedName("client.lz")
    public static int field519 = 0;

    @ObfuscatedName("client.lf")
    public static int field354 = 0;

    @ObfuscatedName("client.mv")
    public static int[] field521 = new int[128];

    @ObfuscatedName("client.mb")
    public static int[] field522 = new int[128];

    @ObfuscatedName("client.mm")
    public static long field523 = -1L;

    @ObfuscatedName("client.mo")
    public static String field524 = null;

    @ObfuscatedName("client.mj")
    public static String field520 = null;

    @ObfuscatedName("client.mc")
    public static int field526 = -1;

    @ObfuscatedName("client.mu")
    public static int field392 = 0;

    @ObfuscatedName("client.mt")
    public static int[] field471 = new int[1000];

    @ObfuscatedName("client.mr")
    public static int[] field529 = new int[1000];

    @ObfuscatedName("client.mx")
    public static class79[] field530 = new class79[1000];

    @ObfuscatedName("client.mq")
    public static int field531 = 0;

    @ObfuscatedName("client.mn")
    public static int field532 = 0;

    @ObfuscatedName("client.mi")
    public static int field494 = 0;

    @ObfuscatedName("client.mz")
    public static int field299 = 255;

    @ObfuscatedName("client.mk")
    public static int field535 = -1;

    @ObfuscatedName("client.my")
    public static boolean field386 = false;

    @ObfuscatedName("client.ni")
    public static int field537 = 127;

    @ObfuscatedName("client.na")
    public static int field538 = 127;

    @ObfuscatedName("client.nw")
    public static int field539 = 0;

    @ObfuscatedName("client.nn")
    public static int[] field540 = new int[50];

    @ObfuscatedName("client.no")
    public static int[] field397 = new int[50];

    @ObfuscatedName("client.nj")
    public static int[] field542 = new int[50];

    @ObfuscatedName("client.nr")
    public static int[] field543 = new int[50];

    @ObfuscatedName("client.ne")
    public static class59[] field547 = new class59[50];

    @ObfuscatedName("client.ns")
    public static boolean field548 = false;

    @ObfuscatedName("client.ob")
    public static boolean[] field546 = new boolean[5];

    @ObfuscatedName("client.oi")
    public static int[] field369 = new int[5];

    @ObfuscatedName("client.oj")
    public static int[] field447 = new int[5];

    @ObfuscatedName("client.os")
    public static int[] field549 = new int[5];

    @ObfuscatedName("client.ov")
    public static int[] field433 = new int[5];

    @ObfuscatedName("client.ox")
    public static short field551 = 256;

    @ObfuscatedName("client.on")
    public static short field307 = 205;

    @ObfuscatedName("client.of")
    public static short field553 = 256;

    @ObfuscatedName("client.oy")
    public static short field554 = 320;

    @ObfuscatedName("client.ol")
    public static short field555 = 1;

    @ObfuscatedName("client.ok")
    public static short field561 = 32767;

    @ObfuscatedName("client.ot")
    public static short field557 = 1;

    @ObfuscatedName("client.oh")
    public static short field558 = 32767;

    @ObfuscatedName("client.op")
    public static int field559 = 0;

    @ObfuscatedName("client.ou")
    public static int field560 = 0;

    @ObfuscatedName("client.od")
    public static int field437 = 0;

    @ObfuscatedName("client.oe")
    public static int field562 = 0;

    @ObfuscatedName("client.om")
    public static int field563 = 0;

    @ObfuscatedName("client.oo")
    public static int field564 = 0;

    @ObfuscatedName("client.ow")
    public static int field565 = 0;

    @ObfuscatedName("client.og")
    public static class18[] field566 = new class18[400];

    @ObfuscatedName("client.oz")
    public static class195 field567 = new class195();

    @ObfuscatedName("client.oc")
    public static int field568 = 0;

    @ObfuscatedName("client.oa")
    public static class8[] field468 = new class8[400];

    @ObfuscatedName("client.pa")
    public static class179 field534 = new class179();

    @ObfuscatedName("client.pf")
    public static int field571 = -1;

    @ObfuscatedName("client.pi")
    public static int field552 = -1;

    @ObfuscatedName("client.pw")
    public static class220[] field573 = new class220[8];

    @ObfuscatedName("client.pk")
    public static long field464 = -1L;

    @ObfuscatedName("client.pu")
    public static long field575 = -1L;

    @ObfuscatedName("client.pp")
    public static final class11 field576 = new class11();

    @ObfuscatedName("client.pz")
    public static int[] field544 = new int[50];

    @ObfuscatedName("client.pd")
    public static int[] field578 = new int[50];

    @ObfuscatedName("client.m(I)V")
    public final void method230() {
    }

    public final void init() {
        if (!this.method2830()) {
            return;
        }
        class190[] var1 = new class190[] { class190.field3050, class190.field3047, class190.field3046, class190.field3056, class190.field3041, class190.field3048, class190.field3045, class190.field3054, class190.field3043, class190.field3051, class190.field3042, class190.field3044, class190.field3053, class190.field3052, class190.field3049 };
        class190[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class190 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3055);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3055)) {
                    case 1:
                        field301 = Integer.parseInt(var5);
                        break;
                    case 2:
                        int var6 = Integer.parseInt(var5);
                        class153[] var7 = class153.method1573();
                        int var8 = 0;
                        class153 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class153 var9 = var7[var8];
                            if (var9.field2262 == var6) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field2699 = var10;
                        break;
                    case 3:
                        field441 = Integer.parseInt(var5);
                        break;
                    case 4:
                        Statics.field2195 = Integer.parseInt(var5);
                        break;
                    case 5:
                        field398 = Integer.parseInt(var5);
                        break;
                    case 6:
                        if (var5.equalsIgnoreCase(class2.field18)) {
                            field570 = true;
                        } else {
                            field570 = false;
                        }
                        break;
                    case 7:
                        if (var5.equalsIgnoreCase(class2.field18)) {
                        }
                    case 8:
                    case 11:
                    case 12:
                    default:
                        break;
                    case 9:
                        Statics.field2905 = Integer.parseInt(var5);
                        break;
                    case 10:
                        field304 = Integer.parseInt(var5);
                        break;
                    case 13:
                        Statics.field1974 = (class154) class109.method2796(class154.method2053(), Integer.parseInt(var5));
                        if (Statics.field1974 == class154.field2269) {
                            Statics.field3198 = class212.field3128;
                        } else {
                            Statics.field3198 = class212.field3130;
                        }
                        break;
                    case 14:
                        Statics.field175 = var5;
                        break;
                    case 15:
                        Statics.field1628 = var5;
                }
            }
        }
        class86.field1498 = false;
        field303 = false;
        Statics.field2285 = this.getCodeBase().getHost();
        String var11 = Statics.field2699.field2261;
        byte var12 = 0;
        try {
            Statics.field2222 = 16;
            Statics.field668 = var12;
            try {
                Statics.field2645 = System.getProperty("os.name");
            } catch (Exception var32) {
                Statics.field2645 = "Unknown";
            }
            Statics.field2264 = Statics.field2645.toLowerCase();
            try {
                Statics.field185 = System.getProperty("user.home");
                if (Statics.field185 != null) {
                    Statics.field185 = Statics.field185 + "/";
                }
            } catch (Exception var31) {
            }
            try {
                if (Statics.field2264.startsWith("win")) {
                    if (Statics.field185 == null) {
                        Statics.field185 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field185 == null) {
                    Statics.field185 = System.getenv("HOME");
                }
                if (Statics.field185 != null) {
                    Statics.field185 = Statics.field185 + "/";
                }
            } catch (Exception var30) {
            }
            if (Statics.field185 == null) {
                Statics.field185 = "~/";
            }
            Statics.field224 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field185, "/tmp/", "" };
            Statics.field212 = new String[] { ".jagex_cache_" + Statics.field668, ".file_store_" + Statics.field668 };
            label155: for (int var16 = 0; var16 < 4; var16++) {
                Statics.field2893 = class149.method2150("oldschool", var11, var16);
                if (!Statics.field2893.exists()) {
                    Statics.field2893.mkdirs();
                }
                File[] var17 = Statics.field2893.listFiles();
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
                    if (!class149.method574(var20, false)) {
                        break;
                    }
                    var19++;
                }
            }
            class135.method556(Statics.field2893);
            try {
                File var21 = new File(Statics.field185, "random.dat");
                if (var21.exists()) {
                    class149.field2220 = new class228(new class227(var21, "rw", 25L), 24, 0);
                } else {
                    label135: for (int var22 = 0; var22 < Statics.field212.length; var22++) {
                        for (int var23 = 0; var23 < Statics.field224.length; var23++) {
                            File var24 = new File(Statics.field224[var23] + Statics.field212[var22] + File.separatorChar + "random.dat");
                            if (var24.exists()) {
                                class149.field2220 = new class228(new class227(var24, "rw", 25L), 24, 0);
                                break label135;
                            }
                        }
                    }
                }
                if (class149.field2220 == null) {
                    RandomAccessFile var25 = new RandomAccessFile(var21, "rw");
                    int var26 = var25.read();
                    var25.seek(0L);
                    var25.write(var26);
                    var25.seek(0L);
                    var25.close();
                    class149.field2220 = new class228(new class227(var21, "rw", 25L), 24, 0);
                }
            } catch (IOException var33) {
            }
            class149.field2226 = new class228(new class227(class135.method2301("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class149.field2228 = new class228(new class227(class135.method2301("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2229 = new class228[Statics.field2222];
            for (int var28 = 0; var28 < Statics.field2222; var28++) {
                Statics.field2229[var28] = new class228(new class227(class135.method2301("main_file_cache.idx" + var28), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var34) {
            class148.method1532((String) null, var34);
        }
        Statics.field297 = this;
        this.method2878(765, 503, 101);
    }

    @ObfuscatedName("client.j(I)V")
    public final void method386() {
        Statics.field1749 = field301 == 0 ? 43594 : field441 + 40000;
        Statics.field198 = field301 == 0 ? 443 : field441 + 50000;
        Statics.field2715 = Statics.field1749;
        Statics.field80 = class174.field2887;
        Statics.field1970 = class174.field2879;
        Statics.field2913 = class174.field2880;
        Statics.field2897 = class174.field2881;
        if (Statics.field2102.toLowerCase().indexOf("microsoft") == -1) {
            class137.field2126[44] = 71;
            class137.field2126[45] = 26;
            class137.field2126[46] = 72;
            class137.field2126[47] = 73;
            class137.field2126[59] = 57;
            class137.field2126[61] = 27;
            class137.field2126[91] = 42;
            class137.field2126[92] = 74;
            class137.field2126[93] = 43;
            class137.field2126[192] = 28;
            class137.field2126[222] = 58;
            class137.field2126[520] = 59;
        } else {
            class137.field2126[186] = 57;
            class137.field2126[187] = 27;
            class137.field2126[188] = 71;
            class137.field2126[189] = 26;
            class137.field2126[190] = 72;
            class137.field2126[191] = 73;
            class137.field2126[192] = 58;
            class137.field2126[219] = 42;
            class137.field2126[220] = 74;
            class137.field2126[221] = 43;
            class137.field2126[222] = 59;
            class137.field2126[223] = 28;
        }
        Canvas var1 = Statics.field176;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class137.field2118);
        var1.addFocusListener(class137.field2118);
        class140.method173(Statics.field176);
        class145 var2;
        try {
            var2 = new class145();
        } catch (Throwable var7) {
            var2 = null;
        }
        Statics.field1358 = var2;
        if (Statics.field1358 != null) {
            Statics.field1358.method2661(Statics.field176);
        }
        Statics.field288 = new class134(255, class149.field2226, class149.field2228, 500000);
        Statics.field2060 = class9.method2060();
        Statics.field1066 = this.getToolkit().getSystemClipboard();
        String var5 = Statics.field1905;
        class138.field2128 = this;
        class138.field2129 = var5;
        if (field301 != 0) {
            field314 = true;
        }
        int var6 = Statics.field2060.field150;
        field510 = 0L;
        if (var6 >= 2) {
            field511 = true;
        } else {
            field511 = false;
        }
        method2967();
        if (field305 >= 25) {
            method92();
        }
        field2190 = true;
    }

    @ObfuscatedName("client.n(I)V")
    public final void method234() {
        field577++;
        this.method237();
        while (true) {
            class199 var1 = class170.field2696;
            class169 var2;
            synchronized (class170.field2696) {
                var2 = (class169) class170.field2698.method3564();
            }
            if (var2 == null) {
                try {
                    if (class183.field2950 == 1) {
                        int var4 = Statics.field3134.method3376();
                        if (var4 > 0 && Statics.field3134.method3471()) {
                            int var5 = var4 - Statics.field2209;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field3134.method3375(var5);
                        } else {
                            Statics.field3134.method3380();
                            Statics.field3134.method3378();
                            if (Statics.field2947 == null) {
                                class183.field2950 = 0;
                            } else {
                                class183.field2950 = 2;
                            }
                            Statics.field1226 = null;
                            Statics.field2949 = null;
                        }
                    }
                } catch (Exception var21) {
                    var21.printStackTrace();
                    Statics.field3134.method3380();
                    class183.field2950 = 0;
                    Statics.field1226 = null;
                    Statics.field2949 = null;
                    Statics.field2947 = null;
                }
                method306();
                class137 var7 = class137.field2118;
                synchronized (class137.field2118) {
                    class137.field2125++;
                    class137.field2122 = class137.field2124;
                    class137.field2108 = 0;
                    if (class137.field2103 >= 0) {
                        while (class137.field2116 != class137.field2103) {
                            int var9 = class137.field2115[class137.field2116];
                            class137.field2116 = class137.field2116 + 1 & 0x7F;
                            if (var9 < 0) {
                                class137.field2114[~var9] = false;
                            } else {
                                if (!class137.field2114[var9] && class137.field2108 < class137.field2120.length - 1) {
                                    class137.field2120[++class137.field2108 - 1] = var9;
                                }
                                class137.field2114[var9] = true;
                            }
                        }
                    } else {
                        for (int var8 = 0; var8 < 112; var8++) {
                            class137.field2114[var8] = false;
                        }
                        class137.field2103 = class137.field2116;
                    }
                    class137.field2124 = class137.field2123;
                }
                class140 var11 = class140.field2148;
                synchronized (class140.field2148) {
                    class140.field2155 = class140.field2153;
                    class140.field2144 = class140.field2141;
                    class140.field2138 = class140.field2143;
                    class140.field2150 = class140.field2146;
                    class140.field2151 = class140.field2147;
                    class140.field2152 = class140.field2140;
                    class140.field2149 = class140.field2142;
                    class140.field2146 = 0;
                }
                if (Statics.field1358 != null) {
                    int var13 = Statics.field1358.method2662();
                    field495 = var13;
                }
                if (field305 == 0) {
                    method3480();
                    Statics.field2062.method2677();
                    for (int var14 = 0; var14 < 32; var14++) {
                        field2185[var14] = 0L;
                    }
                    for (int var15 = 0; var15 < 32; var15++) {
                        field2197[var15] = 0L;
                    }
                    Statics.field788 = 0;
                } else if (field305 == 5) {
                    class32.method557(this);
                    method3480();
                    Statics.field2062.method2677();
                    for (int var16 = 0; var16 < 32; var16++) {
                        field2185[var16] = 0L;
                    }
                    for (int var17 = 0; var17 < 32; var17++) {
                        field2197[var17] = 0L;
                    }
                    Statics.field788 = 0;
                } else if (field305 == 10 || field305 == 11) {
                    class32.method557(this);
                } else if (field305 == 20) {
                    class32.method557(this);
                    method816();
                } else if (field305 == 25) {
                    method204();
                }
                if (field305 == 30) {
                    method160();
                } else if (field305 == 40 || field305 == 45) {
                    method816();
                }
                return;
            }
            var2.field2687.method3122(var2.field2684, (int) var2.field3105, var2.field2685, false);
        }
    }

    @ObfuscatedName("client.l(I)V")
    public final void method235() {
        boolean var1 = class183.method1963();
        if (var1 && field386 && Statics.field1022 != null) {
            Statics.field1022.method1167();
        }
        if (field305 == 10 || field305 == 20 || field305 == 30) {
            if (field510 != 0L && class115.method645() > field510) {
                int var2 = method562();
                field510 = 0L;
                if (var2 >= 2) {
                    field511 = true;
                } else {
                    field511 = false;
                }
                method2967();
                if (field305 >= 25) {
                    method92();
                }
                field2190 = true;
            } else if (field2193) {
                Canvas var3 = Statics.field176;
                var3.removeKeyListener(class137.field2118);
                var3.removeFocusListener(class137.field2118);
                class137.field2103 = -1;
                class140.method3260(Statics.field176);
                if (Statics.field1358 != null) {
                    Statics.field1358.method2667(Statics.field176);
                }
                Statics.field297.method2854();
                Statics.field176.setBackground(Color.black);
                Canvas var4 = Statics.field176;
                var4.setFocusTraversalKeysEnabled(false);
                var4.addKeyListener(class137.field2118);
                var4.addFocusListener(class137.field2118);
                class140.method173(Statics.field176);
                if (Statics.field1358 != null) {
                    Statics.field1358.method2661(Statics.field176);
                }
                if (field457 != -1) {
                    method2042(false);
                }
                field2192 = true;
            }
        }
        Dimension var5 = this.method2841();
        if (Statics.field759 != var5.width || Statics.field2130 != var5.height || field2192) {
            method2967();
            field510 = class115.method645() + 500L;
            field2192 = false;
        }
        boolean var6 = false;
        if (field2190) {
            field2190 = false;
            var6 = true;
            for (int var7 = 0; var7 < 100; var7++) {
                field502[var7] = true;
            }
        }
        if (var6) {
            method1492();
        }
        if (field305 == 0) {
            int var8 = class32.field729;
            String var9 = class32.field731;
            Color var10 = null;
            try {
                Graphics var11 = Statics.field176.getGraphics();
                if (Statics.field2165 == null) {
                    Statics.field2165 = new Font("Helvetica", 1, 13);
                    Statics.field598 = Statics.field176.getFontMetrics(Statics.field2165);
                }
                if (var6) {
                    var11.setColor(Color.black);
                    var11.fillRect(0, 0, Statics.field882, Statics.field158);
                }
                if (var10 == null) {
                    var10 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1678 == null) {
                        Statics.field1678 = Statics.field176.createImage(304, 34);
                    }
                    Graphics var12 = Statics.field1678.getGraphics();
                    var12.setColor(var10);
                    var12.drawRect(0, 0, 303, 33);
                    var12.fillRect(2, 2, var8 * 3, 30);
                    var12.setColor(Color.black);
                    var12.drawRect(1, 1, 301, 31);
                    var12.fillRect(var8 * 3 + 2, 2, 300 - var8 * 3, 30);
                    var12.setFont(Statics.field2165);
                    var12.setColor(Color.white);
                    var12.drawString(var9, (304 - Statics.field598.stringWidth(var9)) / 2, 22);
                    var11.drawImage(Statics.field1678, Statics.field882 / 2 - 152, Statics.field158 / 2 - 18, (ImageObserver) null);
                } catch (Exception var45) {
                    int var14 = Statics.field882 / 2 - 152;
                    int var15 = Statics.field158 / 2 - 18;
                    var11.setColor(var10);
                    var11.drawRect(var14, var15, 303, 33);
                    var11.fillRect(var14 + 2, var15 + 2, var8 * 3, 30);
                    var11.setColor(Color.black);
                    var11.drawRect(var14 + 1, var15 + 1, 301, 31);
                    var11.fillRect(var8 * 3 + var14 + 2, var15 + 2, 300 - var8 * 3, 30);
                    var11.setFont(Statics.field2165);
                    var11.setColor(Color.white);
                    var11.drawString(var9, var14 + (304 - Statics.field598.stringWidth(var9)) / 2, var15 + 22);
                }
            } catch (Exception var46) {
                Statics.field176.repaint();
            }
        } else if (field305 == 5) {
            class32.method549(Statics.field166, Statics.field2896, Statics.field1006, var6);
        } else if (field305 == 10 || field305 == 11) {
            class32.method549(Statics.field166, Statics.field2896, Statics.field1006, var6);
        } else if (field305 == 20) {
            class32.method549(Statics.field166, Statics.field2896, Statics.field1006, var6);
        } else if (field305 == 25) {
            if (field439 == 1) {
                if (field313 > field355) {
                    field355 = field313;
                }
                int var17 = (field355 * 50 - field313 * 50) / field355;
                method3079(class157.field2305 + class2.field15 + class2.field19 + var17 + "%" + class2.field25, false);
            } else if (field439 == 2) {
                if (field356 > field462) {
                    field462 = field356;
                }
                int var18 = (field462 * 50 - field356 * 50) / field462 + 50;
                method3079(class157.field2305 + class2.field15 + class2.field19 + var18 + "%" + class2.field25, false);
            } else {
                method3079(class157.field2305, false);
            }
        } else if (field305 == 30) {
            if (field457 != -1) {
                int var19 = field457;
                if (class173.method584(var19)) {
                    method2703(Statics.field2803[var19], -1);
                }
            }
            for (int var20 = 0; var20 < field500; var20++) {
                if (field502[var20]) {
                    field503[var20] = true;
                }
                field504[var20] = field502[var20];
                field502[var20] = false;
            }
            field501 = field577;
            field446 = -1;
            field417 = -1;
            Statics.field1768 = null;
            if (field457 != -1) {
                field500 = 0;
                method187(field457, 0, 0, Statics.field882, Statics.field158, 0, 0, -1);
            }
            class80.method1748();
            if (field337) {
                method995();
            } else if (field446 != -1) {
                int var21 = field446;
                int var22 = field417;
                if (field326 >= 2 || field404 != 0 || field452) {
                    String var23;
                    if (field404 == 1 && field326 < 2) {
                        var23 = class157.field2446 + class157.field2441 + field451 + " " + class2.field20;
                    } else if (field452 && field326 < 2) {
                        var23 = field370 + class157.field2441 + field456 + " " + class2.field20;
                    } else {
                        var23 = method46(field326 - 1);
                    }
                    if (field326 > 2) {
                        var23 = var23 + class2.method4(16777215) + " " + '/' + " " + (field326 - 2) + class157.field2450;
                    }
                    Statics.field166.method3776(var23, var21 + 4, var22 + 15, 16777215, 0, field577 / 1000);
                }
            }
            if (field509 == 3) {
                for (int var24 = 0; var24 < field500; var24++) {
                    if (field504[var24]) {
                        class80.method1708(field541[var24], field506[var24], field507[var24], field508[var24], 16711935, 128);
                    } else if (field503[var24]) {
                        class80.method1708(field541[var24], field506[var24], field507[var24], field508[var24], 16711680, 128);
                    }
                }
            }
            int var25 = Statics.field1961;
            int var26 = Statics.field2054.field828;
            int var27 = Statics.field2054.field818;
            int var28 = field428;
            for (class24 var29 = (class24) class24.field618.method3566(); var29 != null; var29 = (class24) class24.field618.method3567()) {
                if (var29.field624 != -1 || var29.field612 != null) {
                    int var30 = 0;
                    if (var26 > var29.field615) {
                        var30 += var26 - var29.field615;
                    } else if (var26 < var29.field613) {
                        var30 += var29.field613 - var26;
                    }
                    if (var27 > var29.field616) {
                        var30 += var27 - var29.field616;
                    } else if (var27 < var29.field614) {
                        var30 += var29.field614 - var27;
                    }
                    if (var30 - 64 > var29.field627 || field538 == 0 || var29.field611 != var25) {
                        if (var29.field619 != null) {
                            Statics.field1900.method1135(var29.field619);
                            var29.field619 = null;
                        }
                        if (var29.field620 != null) {
                            Statics.field1900.method1135(var29.field620);
                            var29.field620 = null;
                        }
                    } else {
                        var30 -= 64;
                        if (var30 < 0) {
                            var30 = 0;
                        }
                        int var31 = field538 * (var29.field627 - var30) / var29.field627;
                        class59 var10000;
                        if (var29.field619 != null) {
                            var29.field619.method1286(var31);
                        } else if (var29.field624 >= 0) {
                            var10000 = (class59) null;
                            class59 var32 = class59.method1219(Statics.field152, var29.field624, 0);
                            if (var32 != null) {
                                class63 var33 = var32.method1213().method1256(Statics.field630);
                                class65 var34 = class65.method1282(var33, 100, var31);
                                var34.method1285(-1);
                                Statics.field1900.method1119(var34);
                                var29.field619 = var34;
                            }
                        }
                        if (var29.field620 != null) {
                            var29.field620.method1286(var31);
                            if (!var29.field620.method3666()) {
                                var29.field620 = null;
                            }
                        } else if (var29.field612 != null && (var29.field623 -= var28) <= 0) {
                            int var35 = (int) (Math.random() * (double) var29.field612.length);
                            var10000 = (class59) null;
                            class59 var36 = class59.method1219(Statics.field152, var29.field612[var35], 0);
                            if (var36 != null) {
                                class63 var37 = var36.method1213().method1256(Statics.field630);
                                class65 var38 = class65.method1282(var37, 100, var31);
                                var38.method1285(0);
                                Statics.field1900.method1119(var38);
                                var29.field620 = var38;
                                var29.field623 = var29.field629 + (int) (Math.random() * (double) (var29.field621 - var29.field629));
                            }
                        }
                    }
                }
            }
            field428 = 0;
        } else if (field305 == 40) {
            method3079(class157.field2486 + class2.field15 + class157.field2549, false);
        } else if (field305 == 45) {
            method3079(class157.field2297, false);
        }
        if (field305 == 30 && field509 == 0 && !var6) {
            try {
                Graphics var39 = Statics.field176.getGraphics();
                for (int var40 = 0; var40 < field500; var40++) {
                    if (field503[var40]) {
                        Statics.field2056.method1538(var39, field541[var40], field506[var40], field507[var40], field508[var40]);
                        field503[var40] = false;
                    }
                }
            } catch (Exception var48) {
                Statics.field176.repaint();
            }
        } else if (field305 > 0) {
            try {
                Graphics var42 = Statics.field176.getGraphics();
                Statics.field2056.method1541(var42, 0, 0);
                for (int var43 = 0; var43 < field500; var43++) {
                    field503[var43] = false;
                }
            } catch (Exception var47) {
                Statics.field176.repaint();
            }
        }
    }

    @ObfuscatedName("client.i(I)V")
    public final void method236() {
        if (Statics.field1048.method225()) {
            Statics.field1048.method196();
        }
        if (Statics.field364 != null) {
            Statics.field364.field206 = false;
        }
        Statics.field364 = null;
        if (Statics.field280 != null) {
            Statics.field280.method2817();
            Statics.field280 = null;
        }
        if (class137.field2118 != null) {
            class137 var1 = class137.field2118;
            synchronized (class137.field2118) {
                class137.field2118 = null;
            }
        }
        class140.method925();
        Statics.field1358 = null;
        if (Statics.field1022 != null) {
            Statics.field1022.method1168();
        }
        if (Statics.field1536 != null) {
            Statics.field1536.method1168();
        }
        class171.method2239();
        class170.method622();
        class149.method2683();
    }

    @ObfuscatedName("fa.w(II)V")
    public static void method3288(int arg0) {
        if (field305 == arg0) {
            return;
        }
        if (field305 == 0) {
            class144.method2238();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field332 = 0;
            field333 = 0;
            field334 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field3057 != null) {
            Statics.field3057.method2817();
            Statics.field3057 = null;
        }
        if (field305 == 25) {
            field439 = 0;
            field313 = 0;
            field355 = 1;
            field356 = 0;
            field462 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class32.method2594(Statics.field176, Statics.field883, Statics.field1751, true, 0);
        } else if (arg0 == 20) {
            class32.method2594(Statics.field176, Statics.field883, Statics.field1751, true, field305 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class32.method2594(Statics.field176, Statics.field883, Statics.field1751, false, 4);
        } else {
            class32.method1497();
        }
        field305 = arg0;
    }

    @ObfuscatedName("client.v(I)V")
    public void method237() {
        if (field305 != 1000) {
            boolean var1 = class171.method1495();
            if (!var1) {
                this.method238();
            }
        }
    }

    @ObfuscatedName("client.o(I)V")
    public void method238() {
        if (class171.field2720 >= 4) {
            this.method2839("js5crc");
            field305 = 1000;
            return;
        }
        if (class171.field2716 >= 4) {
            if (field305 <= 5) {
                this.method2839("js5io");
                field305 = 1000;
                return;
            }
            field330 = 3000;
            class171.field2716 = 3;
        }
        if (--field330 + 1 > 0) {
            return;
        }
        try {
            if (field450 == 0) {
                Statics.field197 = Statics.field2245.method2713(Statics.field2285, Statics.field2715);
                field450++;
            }
            if (field450 == 1) {
                if (Statics.field197.field2206 == 2) {
                    this.method239(-1);
                    return;
                }
                if (Statics.field197.field2206 == 1) {
                    field450++;
                }
            }
            if (field450 == 2) {
                Statics.field405 = new class143((Socket) Statics.field197.field2205, Statics.field2245);
                class119 var1 = new class119(5);
                var1.method2426(15);
                var1.method2351(101);
                Statics.field405.method2804(var1.field2000, 0, 5);
                field450++;
                Statics.field136 = class115.method645();
            }
            if (field450 == 3) {
                if (field305 <= 5 || Statics.field405.method2802() > 0) {
                    int var2 = Statics.field405.method2814();
                    if (var2 != 0) {
                        this.method239(var2);
                        return;
                    }
                    field450++;
                } else if (class115.method645() - Statics.field136 > 30000L) {
                    this.method239(-2);
                    return;
                }
            }
            if (field450 == 4) {
                class143 var3 = Statics.field405;
                boolean var4 = field305 > 20;
                if (Statics.field2706 != null) {
                    try {
                        Statics.field2706.method2817();
                    } catch (Exception var14) {
                    }
                    Statics.field2706 = null;
                }
                Statics.field2706 = var3;
                class171.method2062(var4);
                class171.field2710.field1994 = 0;
                Statics.field2633 = null;
                Statics.field278 = null;
                class171.field2723 = 0;
                while (true) {
                    class172 var6 = (class172) class171.field2707.method3543();
                    if (var6 == null) {
                        while (true) {
                            class172 var7 = (class172) class171.field2712.method3543();
                            if (var7 == null) {
                                if (class171.field2719 != 0) {
                                    try {
                                        class119 var8 = new class119(4);
                                        var8.method2426(4);
                                        var8.method2426(class171.field2719);
                                        var8.method2349(0);
                                        Statics.field2706.method2804(var8.field2000, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2706.method2817();
                                        } catch (Exception var12) {
                                        }
                                        class171.field2716++;
                                        Statics.field2706 = null;
                                    }
                                }
                                class171.field2703 = 0;
                                Statics.field2704 = class115.method645();
                                Statics.field197 = null;
                                Statics.field405 = null;
                                field450 = 0;
                                field505 = 0;
                                return;
                            }
                            class171.field2709.method3622(var7);
                            class171.field2713.method3534(var7, var7.field3105);
                            class171.field2711++;
                            class171.field2702--;
                        }
                    }
                    class171.field2722.method3534(var6, var6.field3105);
                    class171.field2721++;
                    class171.field2708--;
                }
            }
        } catch (IOException var15) {
            this.method239(-3);
        }
    }

    @ObfuscatedName("client.p(II)V")
    public void method239(int arg0) {
        Statics.field197 = null;
        Statics.field405 = null;
        field450 = 0;
        if (Statics.field2715 == Statics.field1749) {
            Statics.field2715 = Statics.field198;
        } else {
            Statics.field2715 = Statics.field1749;
        }
        field505++;
        if (field505 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field305 <= 5) {
                this.method2839("js5connect_full");
                field305 = 1000;
            } else {
                field330 = 3000;
            }
        } else if (field505 >= 2 && arg0 == 6) {
            this.method2839("js5connect_outofdate");
            field305 = 1000;
        } else if (field505 >= 4) {
            if (field305 <= 5) {
                this.method2839("js5connect");
                field305 = 1000;
            } else {
                field330 = 3000;
            }
        }
    }

    @ObfuscatedName("ge.b(B)V")
    public static void method3480() {
        if (field556 == 0) {
            Statics.field1793 = new class86(4, 104, 104, class6.field81);
            for (int var0 = 0; var0 < 4; var0++) {
                field359[var0] = new class108(104, 104);
            }
            Statics.field921 = new class79(512, 512);
            class32.field731 = class157.field2308;
            class32.field729 = 5;
            field556 = 20;
        } else if (field556 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class91.field1579[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class86.method1823(var1, 500, 800, 512, 334);
            class32.field731 = class157.field2526;
            class32.field729 = 10;
            field556 = 30;
        } else if (field556 == 30) {
            Statics.field96 = method957(0, false, true, true);
            Statics.field3195 = method957(1, false, true, true);
            Statics.field140 = method957(2, true, false, true);
            Statics.field1968 = method957(3, false, true, true);
            Statics.field152 = method957(4, false, true, true);
            Statics.field11 = method957(5, true, true, true);
            Statics.field108 = method957(6, true, true, false);
            Statics.field155 = method957(7, false, true, true);
            Statics.field1751 = method957(8, false, true, true);
            Statics.field603 = method957(9, false, true, true);
            Statics.field883 = method957(10, false, true, true);
            Statics.field1008 = method957(11, false, true, true);
            Statics.field2052 = method957(12, false, true, true);
            Statics.field129 = method957(13, true, false, true);
            Statics.field1219 = method957(14, false, true, false);
            Statics.field133 = method957(15, false, true, true);
            class32.field731 = class157.field2310;
            class32.field729 = 20;
            field556 = 40;
        } else if (field556 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field96.method3121() * 4 / 100;
            int var8 = var7 + Statics.field3195.method3121() * 4 / 100;
            int var9 = var8 + Statics.field140.method3121() * 2 / 100;
            int var10 = var9 + Statics.field1968.method3121() * 2 / 100;
            int var11 = var10 + Statics.field152.method3121() * 6 / 100;
            int var12 = var11 + Statics.field11.method3121() * 4 / 100;
            int var13 = var12 + Statics.field108.method3121() * 2 / 100;
            int var14 = var13 + Statics.field155.method3121() * 60 / 100;
            int var15 = var14 + Statics.field1751.method3121() * 2 / 100;
            int var16 = var15 + Statics.field603.method3121() * 2 / 100;
            int var17 = var16 + Statics.field883.method3121() * 2 / 100;
            int var18 = var17 + Statics.field1008.method3121() * 2 / 100;
            int var19 = var18 + Statics.field2052.method3121() * 2 / 100;
            int var20 = var19 + Statics.field129.method3121() * 2 / 100;
            int var21 = var20 + Statics.field1219.method3121() * 2 / 100;
            int var22 = var21 + Statics.field133.method3121() * 2 / 100;
            if (var22 == 100) {
                class32.field731 = class157.field2312;
                class32.field729 = 30;
                field556 = 45;
            } else {
                if (var22 != 0) {
                    class32.field731 = class157.field2311 + var22 + "%";
                }
                class32.field729 = 30;
            }
        } else if (field556 == 45) {
            boolean var23 = !field303;
            Statics.field3153 = 22050;
            Statics.field1195 = var23;
            Statics.field1180 = 2;
            class184 var24 = new class184();
            var24.method3456(9, 128);
            Statics.field1022 = class57.method133(Statics.field2245, Statics.field176, 0, 22050);
            Statics.field1022.method1163(var24);
            class168 var25 = Statics.field133;
            class168 var26 = Statics.field1219;
            class168 var27 = Statics.field152;
            Statics.field2946 = var25;
            Statics.field664 = var26;
            Statics.field2948 = var27;
            Statics.field3134 = var24;
            Statics.field1536 = class57.method133(Statics.field2245, Statics.field176, 1, 2048);
            Statics.field1900 = new class56();
            Statics.field1536.method1163(Statics.field1900);
            Statics.field630 = new class75(22050, Statics.field3153);
            class32.field731 = class157.field2313;
            class32.field729 = 35;
            field556 = 50;
        } else if (field556 == 50) {
            int var28 = 0;
            if (Statics.field2896 == null) {
                class168 var29 = Statics.field1751;
                class168 var30 = Statics.field129;
                int var31 = var29.method3052("p11_full");
                int var32 = var29.method3048(var31, "");
                class224 var33;
                if (Statics.method2690(var29, var31, var32)) {
                    var33 = class77.method2153(var30.method3038(var31, var32));
                } else {
                    var33 = null;
                }
                Statics.field2896 = var33;
            } else {
                var28++;
            }
            if (Statics.field1006 == null) {
                class168 var35 = Statics.field1751;
                class168 var36 = Statics.field129;
                int var37 = var35.method3052("p12_full");
                int var38 = var35.method3048(var37, "");
                class224 var39;
                if (Statics.method2690(var35, var37, var38)) {
                    var39 = class77.method2153(var36.method3038(var37, var38));
                } else {
                    var39 = null;
                }
                Statics.field1006 = var39;
            } else {
                var28++;
            }
            if (Statics.field166 == null) {
                class168 var41 = Statics.field1751;
                class168 var42 = Statics.field129;
                int var43 = var41.method3052("b12_full");
                int var44 = var41.method3048(var43, "");
                class224 var45;
                if (Statics.method2690(var41, var43, var44)) {
                    var45 = class77.method2153(var42.method3038(var43, var44));
                } else {
                    var45 = null;
                }
                Statics.field166 = var45;
            } else {
                var28++;
            }
            if (var28 < 3) {
                class32.field731 = class157.field2314 + var28 * 100 / 3 + "%";
                class32.field729 = 40;
            } else {
                Statics.field2041 = new class160(true);
                class32.field731 = class157.field2304;
                class32.field729 = 40;
                field556 = 60;
            }
        } else if (field556 == 60) {
            class168 var47 = Statics.field883;
            class168 var48 = Statics.field1751;
            int var49 = 0;
            if (var47.method3116("title.jpg", "")) {
                var49++;
            }
            if (var48.method3116("logo", "")) {
                var49++;
            }
            if (var48.method3116("logo_deadman_mode", "")) {
                var49++;
            }
            if (var48.method3116("titlebox", "")) {
                var49++;
            }
            if (var48.method3116("titlebutton", "")) {
                var49++;
            }
            if (var48.method3116("runes", "")) {
                var49++;
            }
            if (var48.method3116("title_mute", "")) {
                var49++;
            }
            if (var48.method3056("options_radio_buttons,0")) {
                var49++;
            }
            if (var48.method3056("options_radio_buttons,2")) {
                var49++;
            }
            var48.method3116("sl_back", "");
            var48.method3116("sl_flags", "");
            var48.method3116("sl_arrows", "");
            var48.method3116("sl_stars", "");
            var48.method3116("sl_button", "");
            int var52 = class32.method656();
            if (var49 < var52) {
                class32.field731 = class157.field2480 + var49 * 100 / var52 + "%";
                class32.field729 = 50;
            } else {
                class32.field731 = class157.field2516;
                class32.field729 = 50;
                method3288(5);
                field556 = 70;
            }
        } else if (field556 == 70) {
            if (Statics.field140.method3042()) {
                Statics.method2689(Statics.field140);
                class42.method2063(Statics.field140);
                Statics.method707(Statics.field140, Statics.field155);
                class168 var53 = Statics.field140;
                class168 var54 = Statics.field155;
                boolean var55 = field303;
                Statics.field925 = var53;
                Statics.field948 = var54;
                class41.field970 = var55;
                class168 var56 = Statics.field140;
                class168 var57 = Statics.field155;
                Statics.field894 = var56;
                Statics.field885 = var57;
                class168 var58 = Statics.field140;
                class168 var59 = Statics.field155;
                boolean var60 = field570;
                class224 var61 = Statics.field2896;
                Statics.field1112 = var58;
                Statics.field3135 = var59;
                Statics.field1148 = var60;
                Statics.field1114 = Statics.field1112.method3047(10);
                Statics.field1118 = var61;
                class168 var62 = Statics.field140;
                class168 var63 = Statics.field96;
                class168 var64 = Statics.field3195;
                Statics.field994 = var62;
                Statics.field1565 = var63;
                Statics.field989 = var64;
                class168 var65 = Statics.field140;
                class168 var66 = Statics.field155;
                Statics.field1019 = var65;
                Statics.field1012 = var66;
                class48.method2798(Statics.field140);
                class168 var67 = Statics.field140;
                Statics.field1171 = var67;
                Statics.field1164 = Statics.field1171.method3047(16);
                class173.method2044(Statics.field1968, Statics.field155, Statics.field1751, Statics.field129);
                class51.method880(Statics.field140);
                class168 var68 = Statics.field140;
                Statics.field1089 = var68;
                class168 var69 = Statics.field140;
                Statics.field1047 = var69;
                class50.method1778(Statics.field140);
                Statics.field1048 = new class20();
                class32.field731 = class157.field2347;
                class32.field729 = 60;
                field556 = 80;
            } else {
                class32.field731 = class157.field2459 + Statics.field140.method3124() + "%";
                class32.field729 = 60;
            }
        } else if (field556 == 80) {
            int var70 = 0;
            if (Statics.field1373 == null) {
                class168 var71 = Statics.field1751;
                int var72 = var71.method3052("compass");
                int var73 = var71.method3048(var72, "");
                class79 var74;
                if (Statics.method2690(var71, var72, var73)) {
                    var74 = class77.method3724();
                } else {
                    var74 = null;
                }
                Statics.field1373 = var74;
            } else {
                var70++;
            }
            if (Statics.field1762 == null) {
                class168 var76 = Statics.field1751;
                int var77 = var76.method3052("mapedge");
                int var78 = var76.method3048(var77, "");
                class79 var79;
                if (Statics.method2690(var76, var77, var78)) {
                    var79 = class77.method3724();
                } else {
                    var79 = null;
                }
                Statics.field1762 = var79;
            } else {
                var70++;
            }
            if (Statics.field1166 == null) {
                Statics.field1166 = class77.method2619(Statics.field1751, "mapscene", "");
            } else {
                var70++;
            }
            if (Statics.field1027 == null) {
                Statics.field1027 = class77.method654(Statics.field1751, "mapfunction", "");
            } else {
                var70++;
            }
            if (Statics.field3108 == null) {
                Statics.field3108 = class77.method654(Statics.field1751, "hitmarks", "");
            } else {
                var70++;
            }
            if (Statics.field1374 == null) {
                Statics.field1374 = class77.method654(Statics.field1751, "headicons_pk", "");
            } else {
                var70++;
            }
            if (Statics.field184 == null) {
                Statics.field184 = class77.method654(Statics.field1751, "headicons_prayer", "");
            } else {
                var70++;
            }
            if (Statics.field2682 == null) {
                Statics.field2682 = class77.method654(Statics.field1751, "headicons_hint", "");
            } else {
                var70++;
            }
            if (Statics.field1380 == null) {
                Statics.field1380 = class77.method654(Statics.field1751, "mapmarker", "");
            } else {
                var70++;
            }
            if (Statics.field536 == null) {
                Statics.field536 = class77.method654(Statics.field1751, "cross", "");
            } else {
                var70++;
            }
            if (Statics.field1539 == null) {
                Statics.field1539 = class77.method654(Statics.field1751, "mapdots", "");
            } else {
                var70++;
            }
            if (Statics.field293 == null) {
                Statics.field293 = class77.method2619(Statics.field1751, "scrollbar", "");
            } else {
                var70++;
            }
            if (Statics.field244 == null) {
                Statics.field244 = class77.method2619(Statics.field1751, "mod_icons", "");
            } else {
                var70++;
            }
            if (var70 < 13) {
                class32.field731 = class157.field2320 + var70 * 100 / 13 + "%";
                class32.field729 = 70;
            } else {
                Statics.field3178 = Statics.field244;
                Statics.field1762.method1648();
                int var81 = (int) (Math.random() * 21.0D) - 10;
                int var82 = (int) (Math.random() * 21.0D) - 10;
                int var83 = (int) (Math.random() * 21.0D) - 10;
                int var84 = (int) (Math.random() * 41.0D) - 20;
                for (int var85 = 0; var85 < Statics.field1027.length; var85++) {
                    Statics.field1027[var85].method1615(var81 + var84, var82 + var84, var83 + var84);
                }
                Statics.field1166[0].method1753(var81 + var84, var82 + var84, var83 + var84);
                class32.field731 = class157.field2321;
                class32.field729 = 70;
                field556 = 90;
            }
        } else if (field556 == 90) {
            if (Statics.field603.method3042()) {
                class95 var86 = new class95(Statics.field603, Statics.field1751, 20, 0.8D, field303 ? 64 : 128);
                class91.method1969(var86);
                class91.method2004(0.8D);
                class32.field731 = class157.field2567;
                class32.field729 = 90;
                field556 = 110;
            } else {
                class32.field731 = class157.field2322 + Statics.field603.method3124() + "%";
                class32.field729 = 90;
            }
        } else if (field556 == 110) {
            Statics.field364 = new class14();
            Statics.field2245.method2714(Statics.field364, 10);
            class32.field731 = class157.field2329;
            class32.field729 = 94;
            field556 = 120;
        } else if (field556 == 120) {
            if (Statics.field883.method3116("huffman", "")) {
                class113 var87 = new class113(Statics.field883.method3054("huffman", ""));
                Statics.method2236(var87);
                class32.field731 = class157.field2307;
                class32.field729 = 96;
                field556 = 130;
            } else {
                class32.field731 = class157.field2325 + "%";
                class32.field729 = 96;
            }
        } else if (field556 == 130) {
            if (!Statics.field1968.method3042()) {
                class32.field731 = class157.field2327 + Statics.field1968.method3124() * 4 / 5 + "%";
                class32.field729 = 100;
            } else if (!Statics.field2052.method3042()) {
                class32.field731 = class157.field2327 + (80 + Statics.field2052.method3124() / 6) + "%";
                class32.field729 = 100;
            } else if (Statics.field129.method3042()) {
                class32.field731 = class157.field2328;
                class32.field729 = 100;
                field556 = 140;
            } else {
                class32.field731 = class157.field2327 + (96 + Statics.field129.method3124() / 20) + "%";
                class32.field729 = 100;
            }
        } else if (field556 == 140) {
            method3288(10);
        }
    }

    @ObfuscatedName("aj.z(IZZZI)Lfb;")
    public static class168 method957(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class134 var4 = null;
        if (class149.field2226 != null) {
            var4 = new class134(arg0, class149.field2226, Statics.field2229[arg0], 1000000);
        }
        return new class168(var4, Statics.field288, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("am.k(I)V")
    public static final void method816() {
        try {
            if (field332 == 0) {
                if (Statics.field280 != null) {
                    Statics.field280.method2817();
                    Statics.field280 = null;
                }
                Statics.field1398 = null;
                field353 = false;
                field333 = 0;
                field332 = 1;
            }
            if (field332 == 1) {
                if (Statics.field1398 == null) {
                    Statics.field1398 = Statics.field2245.method2713(Statics.field2285, Statics.field2715);
                }
                if (Statics.field1398.field2206 == 2) {
                    throw new IOException();
                }
                if (Statics.field1398.field2206 == 1) {
                    Statics.field280 = new class143((Socket) Statics.field1398.field2205, Statics.field2245);
                    Statics.field1398 = null;
                    field332 = 2;
                }
            }
            if (field332 == 2) {
                field493.field1994 = 0;
                field493.method2426(14);
                Statics.field280.method2804(field493.field2000, 0, 1);
                field482.field1994 = 0;
                field332 = 3;
            }
            if (field332 == 3) {
                if (Statics.field1022 != null) {
                    Statics.field1022.method1166();
                }
                if (Statics.field1536 != null) {
                    Statics.field1536.method1166();
                }
                int var0 = Statics.field280.method2814();
                if (Statics.field1022 != null) {
                    Statics.field1022.method1166();
                }
                if (Statics.field1536 != null) {
                    Statics.field1536.method1166();
                }
                if (var0 != 0) {
                    method1775(var0);
                    return;
                }
                field482.field1994 = 0;
                field332 = 5;
            }
            if (field332 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field493.field1994 = 0;
                field493.method2426(1);
                field493.method2426(class32.field747.method552());
                field493.method2351(var1[0]);
                field493.method2351(var1[1]);
                field493.method2351(var1[2]);
                field493.method2351(var1[3]);
                switch(class32.field747.field2578) {
                    case 0:
                    case 3:
                        field493.method2496(Statics.field2917);
                        field493.field1994 += 5;
                        break;
                    case 1:
                        field493.method2351((Integer) Statics.field2060.field151.get(class163.method845(class32.field730)));
                        field493.field1994 += 4;
                        break;
                    case 2:
                        field493.field1994 += 8;
                }
                field493.method2354(class32.field736);
                field493.method2383(class5.field78, class5.field71);
                field343.field1994 = 0;
                if (field305 == 40) {
                    field343.method2426(18);
                } else {
                    field343.method2426(16);
                }
                field343.method2349(0);
                int var2 = field343.field1994;
                field343.method2351(101);
                field343.method2357(field493.field2000, 0, field493.field1994);
                int var3 = field343.field1994;
                field343.method2354(class32.field730);
                field343.method2426((field511 ? 1 : 0) << 1 | (field303 ? 1 : 0));
                field343.method2349(Statics.field882);
                field343.method2349(Statics.field158);
                class122 var4 = field343;
                byte[] var5 = new byte[24];
                try {
                    class149.field2220.method3868(0L);
                    class149.field2220.method3870(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var50) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2357(var5, 0, 24);
                field343.method2354(Statics.field175);
                field343.method2351(Statics.field2905);
                class119 var9 = new class119(Statics.field2041.method2940());
                Statics.field2041.method2939(var9);
                field343.method2357(var9.field2000, 0, var9.field2000.length);
                field343.method2426(Statics.field2195);
                field343.method2351(Statics.field96.field2665);
                field343.method2351(Statics.field3195.field2665);
                field343.method2351(Statics.field140.field2665);
                field343.method2351(Statics.field1968.field2665);
                field343.method2351(Statics.field152.field2665);
                field343.method2351(Statics.field11.field2665);
                field343.method2351(Statics.field108.field2665);
                field343.method2351(Statics.field155.field2665);
                field343.method2351(Statics.field1751.field2665);
                field343.method2351(Statics.field603.field2665);
                field343.method2351(Statics.field883.field2665);
                field343.method2351(Statics.field1008.field2665);
                field343.method2351(Statics.field2052.field2665);
                field343.method2351(Statics.field129.field2665);
                field343.method2351(Statics.field1219.field2665);
                field343.method2351(Statics.field133.field2665);
                field343.method2381(var1, var3, field343.field1994);
                field343.method2521(field343.field1994 - var2);
                Statics.field280.method2804(field343.field2000, 0, field343.field1994);
                field493.method2598(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field482.method2598(var1);
                field332 = 6;
            }
            if (field332 == 6 && Statics.field280.method2802() > 0) {
                int var11 = Statics.field280.method2814();
                if (var11 == 21 && field305 == 20) {
                    field332 = 7;
                } else if (var11 == 2) {
                    field332 = 9;
                } else if (var11 == 15 && field305 == 40) {
                    field345 = -1;
                    field332 = 13;
                } else if (var11 == 23 && field334 < 1) {
                    field334++;
                    field332 = 0;
                } else if (var11 == 29) {
                    field332 = 11;
                } else {
                    method1775(var11);
                    return;
                }
            }
            if (field332 == 7 && Statics.field280.method2802() > 0) {
                field335 = (Statics.field280.method2814() + 3) * 60;
                field332 = 8;
            }
            if (field332 == 8) {
                field333 = 0;
                Statics.method976(class157.field2444, class157.field2333, field335 / 60 + class157.field2396);
                if (--field335 <= 0) {
                    field332 = 0;
                }
            } else {
                if (field332 == 9 && Statics.field280.method2802() >= 13) {
                    boolean var12 = Statics.field280.method2814() == 1;
                    Statics.field280.method2823(field482.field2000, 0, 4);
                    field482.field1994 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field482.method2600() << 24;
                        int var15 = var14 | field482.method2600() << 16;
                        int var16 = var15 | field482.method2600() << 8;
                        int var17 = var16 | field482.method2600();
                        int var18 = class163.method845(class32.field730);
                        if (Statics.field2060.field151.size() >= 10 && !Statics.field2060.field151.containsKey(var18)) {
                            Iterator var19 = Statics.field2060.field151.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field2060.field151.put(var18, var17);
                        class9.method1958();
                    }
                    field569 = Statics.field280.method2814();
                    field466 = Statics.field280.method2814() == 1;
                    field375 = Statics.field280.method2814();
                    field375 <<= 0x8;
                    field375 += Statics.field280.method2814();
                    field422 = Statics.field280.method2814();
                    Statics.field280.method2823(field482.field2000, 0, 1);
                    field482.field1994 = 0;
                    field346 = field482.method2600();
                    Statics.field280.method2823(field482.field2000, 0, 2);
                    field482.field1994 = 0;
                    field345 = field482.method2353();
                    if (field422 == 1) {
                        try {
                            client var20 = Statics.field297;
                            JSObject.getWindow(var20).call("zap", (Object[]) null);
                        } catch (Throwable var49) {
                        }
                    } else {
                        try {
                            client var22 = Statics.field297;
                            JSObject.getWindow(var22).call("unzap", (Object[]) null);
                        } catch (Throwable var48) {
                        }
                    }
                    field332 = 10;
                }
                if (field332 != 10) {
                    if (field332 == 11 && Statics.field280.method2802() >= 2) {
                        field482.field1994 = 0;
                        Statics.field280.method2823(field482.field2000, 0, 2);
                        field482.field1994 = 0;
                        Statics.field1199 = field482.method2353();
                        field332 = 12;
                    }
                    if (field332 == 12 && Statics.field280.method2802() >= Statics.field1199) {
                        field482.field1994 = 0;
                        Statics.field280.method2823(field482.field2000, 0, Statics.field1199);
                        field482.field1994 = 0;
                        String var39 = field482.method2365();
                        String var40 = field482.method2365();
                        String var41 = field482.method2365();
                        Statics.method976(var39, var40, var41);
                        method3288(10);
                    }
                    if (field332 == 13) {
                        if (field345 == -1) {
                            if (Statics.field280.method2802() < 2) {
                                return;
                            }
                            Statics.field280.method2823(field482.field2000, 0, 2);
                            field482.field1994 = 0;
                            field345 = field482.method2353();
                        }
                        if (Statics.field280.method2802() >= field345) {
                            Statics.field280.method2823(field482.field2000, 0, field345);
                            field482.field1994 = 0;
                            int var42 = field345;
                            field493.field1994 = 0;
                            field482.field1994 = 0;
                            field346 = -1;
                            field414 = -1;
                            field528 = -1;
                            field351 = -1;
                            field345 = 0;
                            field350 = 0;
                            field384 = 0;
                            field326 = 0;
                            field337 = false;
                            field494 = 0;
                            field531 = 0;
                            for (int var43 = 0; var43 < 2048; var43++) {
                                field296[var43] = null;
                            }
                            Statics.field2054 = null;
                            for (int var44 = 0; var44 < field512.length; var44++) {
                                class35 var45 = field512[var44];
                                if (var45 != null) {
                                    var45.field841 = -1;
                                    var45.field817 = false;
                                }
                            }
                            class16.field225 = new class196(32);
                            method3288(30);
                            for (int var46 = 0; var46 < 100; var46++) {
                                field502[var46] = true;
                            }
                            method92();
                            class33.method3166(field482);
                            if (field482.field1994 != var42) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field333++;
                        if (field333 > 2000) {
                            if (field334 < 1) {
                                if (Statics.field2715 == Statics.field1749) {
                                    Statics.field2715 = Statics.field198;
                                } else {
                                    Statics.field2715 = Statics.field1749;
                                }
                                field334++;
                                field332 = 0;
                            } else {
                                method1775(-3);
                            }
                        }
                    }
                } else if (Statics.field280.method2802() >= field345) {
                    field482.field1994 = 0;
                    Statics.field280.method2823(field482.field2000, 0, field345);
                    field308 = 1L;
                    field312 = -1;
                    Statics.field364.field213 = 0;
                    Statics.field1969 = true;
                    field453 = true;
                    field523 = -1L;
                    class211.method48();
                    field493.field1994 = 0;
                    field482.field1994 = 0;
                    field346 = -1;
                    field414 = -1;
                    field528 = -1;
                    field351 = -1;
                    field350 = 0;
                    field384 = 0;
                    field352 = 0;
                    field316 = 0;
                    field326 = 0;
                    field337 = false;
                    class140.method741(0);
                    class12.field181.clear();
                    class12.field183.method3549();
                    class12.field182.method3601();
                    class12.field179 = 0;
                    field404 = 0;
                    field452 = false;
                    field539 = 0;
                    field363 = (int) (Math.random() * 100.0D) - 50;
                    field365 = (int) (Math.random() * 110.0D) - 55;
                    field480 = (int) (Math.random() * 80.0D) - 40;
                    field489 = (int) (Math.random() * 120.0D) - 60;
                    field372 = (int) (Math.random() * 30.0D) - 20;
                    field347 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field494 = 0;
                    field526 = -1;
                    field531 = 0;
                    field532 = 0;
                    field325 = class21.field582;
                    field444 = class21.field582;
                    field342 = 0;
                    class33.field751 = 0;
                    for (int var24 = 0; var24 < 2048; var24++) {
                        class33.field755[var24] = null;
                        class33.field766[var24] = 1;
                    }
                    for (int var25 = 0; var25 < 2048; var25++) {
                        field296[var25] = null;
                    }
                    for (int var26 = 0; var26 < 32768; var26++) {
                        field512[var26] = null;
                    }
                    field429 = -1;
                    field432.method3560();
                    field514.method3560();
                    for (int var27 = 0; var27 < 4; var27++) {
                        for (int var28 = 0; var28 < 104; var28++) {
                            for (int var29 = 0; var29 < 104; var29++) {
                                field430[var27][var28][var29] = null;
                            }
                        }
                    }
                    field418 = new class199();
                    field565 = 0;
                    field564 = 0;
                    field568 = 0;
                    for (int var30 = 0; var30 < Statics.field1164; var30++) {
                        class53 var31 = Statics.method146(var30);
                        if (var31 != null) {
                            class176.field2899[var30] = 0;
                            class176.field2900[var30] = 0;
                        }
                    }
                    Statics.field1048.method194();
                    field465 = -1;
                    if (field457 != -1) {
                        int var32 = field457;
                        if (var32 != -1 && Statics.field2753[var32]) {
                            Statics.field2783.method3055(var32);
                            if (Statics.field2803[var32] != null) {
                                boolean var33 = true;
                                for (int var34 = 0; var34 < Statics.field2803[var32].length; var34++) {
                                    if (Statics.field2803[var32][var34] != null) {
                                        if (Statics.field2803[var32][var34].field2746 == 2) {
                                            var33 = false;
                                        } else {
                                            Statics.field2803[var32][var34] = null;
                                        }
                                    }
                                }
                                if (var33) {
                                    Statics.field2803[var32] = null;
                                }
                                Statics.field2753[var32] = false;
                            }
                        }
                    }
                    for (class4 var35 = (class4) field458.method3543(); var35 != null; var35 = (class4) field458.method3537()) {
                        method3227(var35, true);
                    }
                    field457 = -1;
                    field458 = new class196(8);
                    field461 = null;
                    field337 = false;
                    field326 = 0;
                    field534.method3280((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var36 = 0; var36 < 8; var36++) {
                        field550[var36] = null;
                        field427[var36] = false;
                    }
                    class16.field225 = new class196(32);
                    field401 = true;
                    for (int var37 = 0; var37 < 100; var37++) {
                        field502[var37] = true;
                    }
                    method92();
                    field524 = null;
                    Statics.field245 = 0;
                    Statics.field2075 = null;
                    for (int var38 = 0; var38 < 8; var38++) {
                        field573[var38] = new class220();
                    }
                    Statics.field161 = null;
                    class33.method3166(field482);
                    Statics.field591 = -1;
                    method2298(false);
                    field346 = -1;
                }
            }
        } catch (IOException var51) {
            if (field334 < 1) {
                if (Statics.field2715 == Statics.field1749) {
                    Statics.field2715 = Statics.field198;
                } else {
                    Statics.field2715 = Statics.field1749;
                }
                field334++;
                field332 = 0;
            } else {
                method1775(-2);
            }
        }
    }

    @ObfuscatedName("cg.r(II)V")
    public static void method1775(int arg0) {
        if (arg0 == -3) {
            Statics.method976(class157.field2530, class157.field2336, class157.field2393);
        } else if (arg0 == -2) {
            Statics.method976(class157.field2338, class157.field2339, class157.field2340);
        } else if (arg0 == -1) {
            Statics.method976(class157.field2341, class157.field2342, class157.field2343);
        } else if (arg0 == 3) {
            Statics.method976(class157.field2344, class157.field2345, class157.field2346);
        } else if (arg0 == 4) {
            Statics.method976(class157.field2495, class157.field2348, class157.field2349);
        } else if (arg0 == 5) {
            Statics.method976(class157.field2350, class157.field2377, class157.field2352);
        } else if (arg0 == 6) {
            Statics.method976(class157.field2509, class157.field2379, class157.field2362);
        } else if (arg0 == 7) {
            Statics.method976(class157.field2566, class157.field2405, class157.field2358);
        } else if (arg0 == 8) {
            Statics.method976(class157.field2355, class157.field2360, class157.field2361);
        } else if (arg0 == 9) {
            Statics.method976(class157.field2514, class157.field2296, class157.field2364);
        } else if (arg0 == 10) {
            Statics.method976(class157.field2365, class157.field2366, class157.field2367);
        } else if (arg0 == 11) {
            Statics.method976(class157.field2368, class157.field2369, class157.field2370);
        } else if (arg0 == 12) {
            Statics.method976(class157.field2506, class157.field2492, class157.field2373);
        } else if (arg0 == 13) {
            Statics.method976(class157.field2502, class157.field2375, class157.field2376);
        } else if (arg0 == 14) {
            Statics.method976(class157.field2460, class157.field2415, class157.field2400);
        } else if (arg0 == 16) {
            Statics.method976(class157.field2380, class157.field2299, class157.field2382);
        } else if (arg0 == 17) {
            Statics.method976(class157.field2383, class157.field2384, class157.field2385);
        } else if (arg0 == 18) {
            Statics.method976(class157.field2386, class157.field2387, class157.field2388);
        } else if (arg0 == 19) {
            Statics.method976(class157.field2389, class157.field2421, class157.field2392);
        } else if (arg0 == 20) {
            Statics.method976(class157.field2351, class157.field2532, class157.field2394);
        } else if (arg0 == 22) {
            Statics.method976(class157.field2395, class157.field2453, class157.field2397);
        } else if (arg0 == 23) {
            Statics.method976(class157.field2398, class157.field2399, class157.field2337);
        } else if (arg0 == 24) {
            Statics.method976(class157.field2401, class157.field2402, class157.field2403);
        } else if (arg0 == 25) {
            Statics.method976(class157.field2404, class157.field2319, class157.field2406);
        } else if (arg0 == 26) {
            Statics.method976(class157.field2407, class157.field2306, class157.field2326);
        } else if (arg0 == 27) {
            Statics.method976(class157.field2410, class157.field2411, class157.field2412);
        } else if (arg0 == 31) {
            Statics.method976(class157.field2559, class157.field2545, class157.field2300);
        } else if (arg0 == 32) {
            Statics.method976(class157.field2422, class157.field2423, class157.field2424);
        } else if (arg0 == 37) {
            Statics.method976(class157.field2563, class157.field2426, class157.field2390);
        } else if (arg0 == 38) {
            Statics.method976(class157.field2428, class157.field2374, class157.field2430);
        } else if (arg0 == 55) {
            Statics.method976(class157.field2431, class157.field2432, class157.field2433);
        } else if (arg0 == 56) {
            Statics.method976(class157.field2434, class157.field2435, class157.field2436);
            method3288(11);
            return;
        } else if (arg0 == 57) {
            Statics.method976(class157.field2505, class157.field2438, class157.field2439);
            method3288(11);
            return;
        } else {
            Statics.method976(class157.field2484, class157.field2323, class157.field2442);
        }
        method3288(10);
    }

    @ObfuscatedName("f.d(I)V")
    public static final void method2() {
        if (Statics.field280 != null) {
            Statics.field280.method2817();
            Statics.field280 = null;
        }
        method2243();
        Statics.field1793.method1788();
        for (int var0 = 0; var0 < 4; var0++) {
            field359[var0].method2242();
        }
        System.gc();
        class183.field2950 = 1;
        Statics.field2947 = null;
        Statics.field2944 = -1;
        Statics.field1457 = -1;
        Statics.field63 = 0;
        Statics.field673 = false;
        Statics.field2209 = 2;
        field535 = -1;
        field386 = false;
        class24.method1961();
        method3288(10);
    }

    @ObfuscatedName("dz.u(I)V")
    public static final void method2243() {
        class47.method3033();
        class42.field983.method3499();
        class45.field1034.method3499();
        class41.method740();
        Statics.method2935();
        class52.field1115.method3499();
        class52.field1116.method3499();
        class52.field1152.method3499();
        class43.method644();
        class44.method576();
        class48.field1072.method3499();
        class53.field1165.method3499();
        class179.field2916.method3499();
        class173.field2738.method3499();
        class173.field2807.method3499();
        class173.field2740.method3499();
        class173.field2797.method3499();
        ((class95) Statics.field1587).method2045();
        class23.field610.method3499();
        Statics.field96.method3049();
        Statics.field3195.method3049();
        Statics.field1968.method3049();
        Statics.field152.method3049();
        Statics.field11.method3049();
        Statics.field108.method3049();
        Statics.field155.method3049();
        Statics.field1751.method3049();
        Statics.field603.method3049();
        Statics.field883.method3049();
        Statics.field1008.method3049();
        Statics.field2052.method3049();
    }

    @ObfuscatedName("b.a(I)V")
    public static final void method160() {
        if (field384 > 1) {
            field384--;
        }
        if (field352 > 0) {
            field352--;
        }
        if (field353) {
            field353 = false;
            if (field352 > 0) {
                method2();
            } else {
                method3288(40);
                Statics.field3057 = Statics.field280;
                Statics.field280 = null;
            }
            return;
        }
        if (!field337) {
            field399[0] = class157.field2409;
            field445[0] = "";
            field329[0] = 1006;
            field326 = 1;
        }
        for (int var0 = 0; var0 < 100 && method693(); var0++) {
        }
        if (field305 != 30) {
            return;
        }
        while (class211.method1606()) {
            field493.method2617(171);
            field493.method2426(0);
            int var1 = field493.field1994;
            Statics.method2936(field493);
            field493.method2401(field493.field1994 - var1);
        }
        Object var2 = Statics.field364.field205;
        synchronized (Statics.field364.field205) {
            if (!field298) {
                Statics.field364.field213 = 0;
            } else if (class140.field2150 != 0 || Statics.field364.field213 >= 40) {
                field493.method2617(226);
                field493.method2426(0);
                int var3 = field493.field1994;
                int var4 = 0;
                for (int var5 = 0; var5 < Statics.field364.field213 && field493.field1994 - var3 < 240; var5++) {
                    var4++;
                    int var6 = Statics.field364.field208[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 502) {
                        var6 = 502;
                    }
                    int var7 = Statics.field364.field204[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var8 = var6 * 765 + var7;
                    if (Statics.field364.field208[var5] == -1 && Statics.field364.field204[var5] == -1) {
                        var7 = -1;
                        var6 = -1;
                        var8 = 524287;
                    }
                    if (field310 != var7 || field338 != var6) {
                        int var9 = var7 - field310;
                        field310 = var7;
                        int var10 = var6 - field338;
                        field338 = var6;
                        if (field312 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            field493.method2349((field312 << 12) + (var9 << 6) + var10);
                            field312 = 0;
                        } else if (field312 < 8) {
                            field493.method2496((field312 << 19) + 8388608 + var8);
                            field312 = 0;
                        } else {
                            field493.method2351((field312 << 19) + -1073741824 + var8);
                            field312 = 0;
                        }
                    } else if (field312 < 2047) {
                        field312++;
                    }
                }
                field493.method2401(field493.field1994 - var3);
                if (var4 >= Statics.field364.field213) {
                    Statics.field364.field213 = 0;
                } else {
                    Statics.field364.field213 -= var4;
                    for (int var11 = 0; var11 < Statics.field364.field213; var11++) {
                        Statics.field364.field204[var11] = Statics.field364.field204[var4 + var11];
                        Statics.field364.field208[var11] = Statics.field364.field208[var4 + var11];
                    }
                }
            }
        }
        if (class140.field2150 == 1 || !Statics.field306 && class140.field2150 == 4 || class140.field2150 == 2) {
            long var13 = (class140.field2149 - field308 * -1L) / 50L;
            if (var13 > 4095L) {
                var13 = 4095L;
            }
            field308 = class140.field2149 * -1L;
            int var15 = class140.field2152;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > Statics.field158) {
                var15 = Statics.field158;
            }
            int var16 = class140.field2151;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > Statics.field882) {
                var16 = Statics.field882;
            }
            int var17 = (int) var13;
            field493.method2617(218);
            field493.method2349((var17 << 1) + (class140.field2150 == 2 ? 1 : 0));
            field493.method2349(var16);
            field493.method2349(var15);
        }
        if (class137.field2108 > 0) {
            field493.method2617(103);
            field493.method2349(0);
            int var18 = field493.field1994;
            long var19 = class115.method645();
            for (int var21 = 0; var21 < class137.field2108; var21++) {
                long var22 = var19 - field523;
                if (var22 > 16777215L) {
                    var22 = 16777215L;
                }
                field523 = var19;
                field493.method2426(class137.field2120[var21]);
                field493.method2407((int) var22);
            }
            field493.method2521(field493.field1994 - var18);
        }
        if (field390 > 0) {
            field390--;
        }
        if (class137.field2114[96] || class137.field2114[97] || class137.field2114[98] || class137.field2114[99]) {
            field391 = true;
        }
        if (field391 && field390 <= 0) {
            field390 = 20;
            field391 = false;
            field493.method2617(142);
            field493.method2406(field383);
            field493.method2406(field347);
        }
        if (Statics.field1969 && !field453) {
            field453 = true;
            field493.method2617(249);
            field493.method2426(1);
        }
        if (!Statics.field1969 && field453) {
            field453 = false;
            field493.method2617(249);
            field493.method2426(0);
        }
        if (Statics.field1961 != field526) {
            field526 = Statics.field1961;
            method769(Statics.field1961);
        }
        if (field305 != 30) {
            return;
        }
        for (class17 var24 = (class17) field418.method3566(); var24 != null; var24 = (class17) field418.method3567()) {
            if (var24.field238 > 0) {
                var24.field238--;
            }
            if (var24.field238 != 0) {
                if (var24.field234 > 0) {
                    var24.field234--;
                }
                if (var24.field234 == 0 && var24.field243 >= 1 && var24.field249 >= 1 && var24.field243 <= 102 && var24.field249 <= 102 && (var24.field239 < 0 || class6.method2657(var24.field239, var24.field241))) {
                    method3146(var24.field242, var24.field233, var24.field243, var24.field249, var24.field239, var24.field240, var24.field241);
                    var24.field234 = -1;
                    if (var24.field239 == var24.field236 && var24.field236 == -1) {
                        var24.method3665();
                    } else if (var24.field239 == var24.field236 && var24.field240 == var24.field237 && var24.field241 == var24.field232) {
                        var24.method3665();
                    }
                }
            } else if (var24.field236 < 0 || class6.method2657(var24.field236, var24.field232)) {
                method3146(var24.field242, var24.field233, var24.field243, var24.field249, var24.field236, var24.field237, var24.field232);
                var24.method3665();
            }
        }
        method121();
        field350++;
        if (field350 <= 750) {
            method138();
            for (int var25 = 0; var25 < field342; var25++) {
                int var26 = field311[var25];
                class35 var27 = field512[var26];
                if (var27 != null) {
                    method2898(var27, var27.field789.field917);
                }
            }
            int[] var28 = class33.field752;
            for (int var29 = 0; var29 < class33.field751; var29++) {
                class3 var30 = field296[var28[var29]];
                if (var30 != null && var30.field822 > 0) {
                    var30.field822--;
                    if (var30.field822 == 0) {
                        var30.field830 = null;
                    }
                }
            }
            for (int var31 = 0; var31 < field342; var31++) {
                int var32 = field311[var31];
                class35 var33 = field512[var32];
                if (var33 != null && var33.field822 > 0) {
                    var33.field822--;
                    if (var33.field822 == 0) {
                        var33.field830 = null;
                    }
                }
            }
            field428++;
            if (field410 != 0) {
                field409 += 20;
                if (field409 >= 400) {
                    field410 = 0;
                }
            }
            if (Statics.field842 != null) {
                field411++;
                if (field411 >= 15) {
                    Statics.method1777(Statics.field842);
                    Statics.field842 = null;
                }
            }
            class173 var34 = Statics.field1794;
            class173 var35 = Statics.field156;
            Statics.field1794 = null;
            Statics.field156 = null;
            field474 = null;
            field478 = false;
            field475 = false;
            field354 = 0;
            while (class137.method122() && field354 < 128) {
                if (field569 >= 2 && class137.field2114[82] && Statics.field1949 == 66) {
                    String var36 = "";
                    Iterator var37 = class12.field183.iterator();
                    while (var37.hasNext()) {
                        class36 var38 = (class36) var37.next();
                        var36 = var36 + var38.field795 + ':' + var38.field797 + '\n';
                    }
                    Statics.field1066.setContents(new StringSelection(var36), (ClipboardOwner) null);
                } else {
                    field522[field354] = Statics.field1949;
                    field521[field354] = Statics.field1167;
                    field354++;
                }
            }
            if (field457 != -1) {
                int var41 = field457;
                int var42 = Statics.field882;
                int var43 = Statics.field158;
                if (class173.method584(var41)) {
                    method633(Statics.field2803[var41], -1, 0, 0, var42, var43, 0, 0);
                }
            }
            field302++;
            while (true) {
                class1 var44;
                class173 var45;
                class173 var46;
                do {
                    var44 = (class1) field497.method3564();
                    if (var44 == null) {
                        while (true) {
                            class1 var47;
                            class173 var48;
                            class173 var49;
                            do {
                                var47 = (class1) field467.method3564();
                                if (var47 == null) {
                                    while (true) {
                                        class1 var50;
                                        class173 var51;
                                        class173 var52;
                                        do {
                                            var50 = (class1) field496.method3564();
                                            if (var50 == null) {
                                                method1533();
                                                if (field470 != null) {
                                                    Statics.method1777(field470);
                                                    Statics.field271++;
                                                    if (field478 && field475) {
                                                        int var53 = class140.field2144;
                                                        int var54 = class140.field2138;
                                                        int var55 = var53 - field472;
                                                        int var56 = var54 - field473;
                                                        if (var55 < field476) {
                                                            var55 = field476;
                                                        }
                                                        if (field470.field2759 + var55 > field476 + field463.field2759) {
                                                            var55 = field476 + field463.field2759 - field470.field2759;
                                                        }
                                                        if (var56 < field477) {
                                                            var56 = field477;
                                                        }
                                                        if (field470.field2782 + var56 > field477 + field463.field2782) {
                                                            var56 = field477 + field463.field2782 - field470.field2782;
                                                        }
                                                        int var57 = var55 - field479;
                                                        int var58 = var56 - field442;
                                                        int var59 = field470.field2818;
                                                        if (Statics.field271 > field470.field2846 && (var57 > var59 || var57 < -var59 || var58 > var59 || var58 < -var59)) {
                                                            field481 = true;
                                                        }
                                                        int var60 = field463.field2765 + (var55 - field476);
                                                        int var61 = field463.field2766 + (var56 - field477);
                                                        if (field470.field2848 != null && field481) {
                                                            class1 var62 = new class1();
                                                            var62.field3 = field470;
                                                            var62.field1 = var60;
                                                            var62.field10 = var61;
                                                            var62.field9 = field470.field2848;
                                                            class37.method179(var62);
                                                        }
                                                        if (class140.field2155 == 0) {
                                                            if (field481) {
                                                                if (field470.field2863 != null) {
                                                                    class1 var63 = new class1();
                                                                    var63.field3 = field470;
                                                                    var63.field1 = var60;
                                                                    var63.field10 = var61;
                                                                    var63.field7 = field474;
                                                                    var63.field9 = field470.field2863;
                                                                    class37.method179(var63);
                                                                }
                                                                if (field474 != null) {
                                                                    class173 var64 = field470;
                                                                    int var65 = class178.method2281(method1237(var64));
                                                                    class173 var66;
                                                                    if (var65 == 0) {
                                                                        var66 = null;
                                                                    } else {
                                                                        int var67 = 0;
                                                                        while (true) {
                                                                            if (var67 >= var65) {
                                                                                var66 = var64;
                                                                                break;
                                                                            }
                                                                            var64 = class173.method2297(var64.field2831);
                                                                            if (var64 == null) {
                                                                                var66 = null;
                                                                                break;
                                                                            }
                                                                            var67++;
                                                                        }
                                                                    }
                                                                    if (var66 != null) {
                                                                        field493.method2617(205);
                                                                        field493.method2403(field474.field2744);
                                                                        field493.method2406(field470.field2745);
                                                                        field493.method2394(field470.field2752);
                                                                        field493.method2406(field474.field2752);
                                                                        field493.method2394(field474.field2745);
                                                                        field493.method2404(field470.field2744);
                                                                    }
                                                                }
                                                            } else if ((field527 == 1 || Statics.method153(field326 - 1)) && field326 > 2) {
                                                                method620(field479 + field472, field473 + field442);
                                                            } else if (field326 > 0) {
                                                                method781(field479 + field472, field473 + field442);
                                                            }
                                                            field470 = null;
                                                        }
                                                    } else if (Statics.field271 > 1) {
                                                        field470 = null;
                                                    }
                                                }
                                                if (Statics.field1965 != null) {
                                                    Statics.method1777(Statics.field1965);
                                                    field309++;
                                                    if (class140.field2155 == 0) {
                                                        if (field367) {
                                                            if (Statics.field1965 == Statics.field1768 && field416 != field413) {
                                                                class173 var68 = Statics.field1965;
                                                                byte var69 = 0;
                                                                if (field460 == 1 && var68.field2798 == 206) {
                                                                    var69 = 1;
                                                                }
                                                                if (var68.field2860[field416] <= 0) {
                                                                    var69 = 0;
                                                                }
                                                                if (class178.method2904(method1237(var68))) {
                                                                    int var70 = field413;
                                                                    int var71 = field416;
                                                                    var68.field2860[var71] = var68.field2860[var70];
                                                                    var68.field2861[var71] = var68.field2861[var70];
                                                                    var68.field2860[var70] = -1;
                                                                    var68.field2861[var70] = 0;
                                                                } else if (var69 == 1) {
                                                                    int var72 = field413;
                                                                    int var73 = field416;
                                                                    while (var72 != var73) {
                                                                        if (var72 > var73) {
                                                                            var68.method3185(var72 - 1, var72);
                                                                            var72--;
                                                                        } else if (var72 < var73) {
                                                                            var68.method3185(var72 + 1, var72);
                                                                            var72++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var68.method3185(field416, field413);
                                                                }
                                                                field493.method2617(119);
                                                                field493.method2349(field416);
                                                                field493.method2386(var69);
                                                                field493.method2403(Statics.field1965.field2744);
                                                                field493.method2394(field413);
                                                            }
                                                        } else if ((field527 == 1 || Statics.method153(field326 - 1)) && field326 > 2) {
                                                            method620(field327, field533);
                                                        } else if (field326 > 0) {
                                                            method781(field327, field533);
                                                        }
                                                        field411 = 10;
                                                        class140.field2150 = 0;
                                                        Statics.field1965 = null;
                                                    } else if (field309 >= 5 && (class140.field2144 > field327 + 5 || class140.field2144 < field327 - 5 || class140.field2138 > field533 + 5 || class140.field2138 < field533 - 5)) {
                                                        field367 = true;
                                                    }
                                                }
                                                if (class86.field1470 != -1) {
                                                    int var74 = class86.field1470;
                                                    int var75 = class86.field1499;
                                                    field493.method2617(53);
                                                    field493.method2426(5);
                                                    field493.method2386(class137.field2114[82] ? (class137.field2114[81] ? 2 : 1) : 0);
                                                    field493.method2406(Statics.field2576 + var74);
                                                    field493.method2349(Statics.field2133 + var75);
                                                    class86.field1470 = -1;
                                                    field407 = class140.field2151;
                                                    field408 = class140.field2152;
                                                    field410 = 1;
                                                    field409 = 0;
                                                    field531 = var74;
                                                    field532 = var75;
                                                }
                                                if (Statics.field1794 != var34) {
                                                    if (var34 != null) {
                                                        Statics.method1777(var34);
                                                    }
                                                    if (Statics.field1794 != null) {
                                                        Statics.method1777(Statics.field1794);
                                                    }
                                                }
                                                if (Statics.field156 != var35 && field449 == field448) {
                                                    if (var35 != null) {
                                                        Statics.method1777(var35);
                                                    }
                                                    if (Statics.field156 != null) {
                                                        Statics.method1777(Statics.field156);
                                                    }
                                                }
                                                if (Statics.field156 == null) {
                                                    if (field448 > 0) {
                                                        field448--;
                                                    }
                                                } else if (field448 < field449) {
                                                    field448++;
                                                    if (field449 == field448) {
                                                        Statics.method1777(Statics.field156);
                                                    }
                                                }
                                                method657();
                                                if (field548) {
                                                    int var76 = Statics.field253 * 128 + 64;
                                                    int var77 = Statics.field121 * 128 + 64;
                                                    int var78 = method226(var76, var77, Statics.field1961) - Statics.field923;
                                                    if (Statics.field2163 < var76) {
                                                        Statics.field2163 += Statics.field172 * (var76 - Statics.field2163) / 1000 + Statics.field785;
                                                        if (Statics.field2163 > var76) {
                                                            Statics.field2163 = var76;
                                                        }
                                                    }
                                                    if (Statics.field2163 > var76) {
                                                        Statics.field2163 -= Statics.field172 * (Statics.field2163 - var76) / 1000 + Statics.field785;
                                                        if (Statics.field2163 < var76) {
                                                            Statics.field2163 = var76;
                                                        }
                                                    }
                                                    if (Statics.field2214 < var78) {
                                                        Statics.field2214 += Statics.field172 * (var78 - Statics.field2214) / 1000 + Statics.field785;
                                                        if (Statics.field2214 > var78) {
                                                            Statics.field2214 = var78;
                                                        }
                                                    }
                                                    if (Statics.field2214 > var78) {
                                                        Statics.field2214 -= Statics.field172 * (Statics.field2214 - var78) / 1000 + Statics.field785;
                                                        if (Statics.field2214 < var78) {
                                                            Statics.field2214 = var78;
                                                        }
                                                    }
                                                    if (Statics.field55 < var77) {
                                                        Statics.field55 += Statics.field172 * (var77 - Statics.field55) / 1000 + Statics.field785;
                                                        if (Statics.field55 > var77) {
                                                            Statics.field55 = var77;
                                                        }
                                                    }
                                                    if (Statics.field55 > var77) {
                                                        Statics.field55 -= Statics.field172 * (Statics.field55 - var77) / 1000 + Statics.field785;
                                                        if (Statics.field55 < var77) {
                                                            Statics.field55 = var77;
                                                        }
                                                    }
                                                    int var79 = Statics.field2047 * 128 + 64;
                                                    int var80 = Statics.field2031 * 128 + 64;
                                                    int var81 = method226(var79, var80, Statics.field1961) - Statics.field1755;
                                                    int var82 = var79 - Statics.field2163;
                                                    int var83 = var81 - Statics.field2214;
                                                    int var84 = var80 - Statics.field55;
                                                    int var85 = (int) Math.sqrt((double) (var82 * var82 + var84 * var84));
                                                    int var86 = (int) (Math.atan2((double) var83, (double) var85) * 325.949D) & 0x7FF;
                                                    int var87 = (int) (Math.atan2((double) var82, (double) var84) * -325.949D) & 0x7FF;
                                                    if (var86 < 128) {
                                                        var86 = 128;
                                                    }
                                                    if (var86 > 383) {
                                                        var86 = 383;
                                                    }
                                                    if (Statics.field2137 < var86) {
                                                        Statics.field2137 += Statics.field654 * (var86 - Statics.field2137) / 1000 + Statics.field174;
                                                        if (Statics.field2137 > var86) {
                                                            Statics.field2137 = var86;
                                                        }
                                                    }
                                                    if (Statics.field2137 > var86) {
                                                        Statics.field2137 -= Statics.field654 * (Statics.field2137 - var86) / 1000 + Statics.field174;
                                                        if (Statics.field2137 < var86) {
                                                            Statics.field2137 = var86;
                                                        }
                                                    }
                                                    int var88 = var87 - Statics.field83;
                                                    if (var88 > 1024) {
                                                        var88 -= 2048;
                                                    }
                                                    if (var88 < -1024) {
                                                        var88 += 2048;
                                                    }
                                                    if (var88 > 0) {
                                                        Statics.field83 += Statics.field654 * var88 / 1000 + Statics.field174;
                                                        Statics.field83 &= 0x7FF;
                                                    }
                                                    if (var88 < 0) {
                                                        Statics.field83 -= Statics.field654 * -var88 / 1000 + Statics.field174;
                                                        Statics.field83 &= 0x7FF;
                                                    }
                                                    int var89 = var87 - Statics.field83;
                                                    if (var89 > 1024) {
                                                        var89 -= 2048;
                                                    }
                                                    if (var89 < -1024) {
                                                        var89 += 2048;
                                                    }
                                                    if (var89 < 0 && var88 > 0 || var89 > 0 && var88 < 0) {
                                                        Statics.field83 = var87;
                                                    }
                                                }
                                                for (int var90 = 0; var90 < 5; var90++) {
                                                    int var10002 = field433[var90]++;
                                                }
                                                Statics.field1048.method198();
                                                int var91 = ++class140.field2139 - 1;
                                                int var93 = class137.field2125;
                                                if (var91 > 15000 && var93 > 15000) {
                                                    field352 = 250;
                                                    class140.method741(14500);
                                                    field493.method2617(66);
                                                }
                                                field515++;
                                                if (field515 > 500) {
                                                    field515 = 0;
                                                    int var95 = (int) (Math.random() * 8.0D);
                                                    if ((var95 & 0x1) == 1) {
                                                        field363 += field324;
                                                    }
                                                    if ((var95 & 0x2) == 2) {
                                                        field365 += field366;
                                                    }
                                                    if ((var95 & 0x4) == 4) {
                                                        field480 += field368;
                                                    }
                                                }
                                                if (field363 < -50) {
                                                    field324 = 2;
                                                }
                                                if (field363 > 50) {
                                                    field324 = -2;
                                                }
                                                if (field365 < -55) {
                                                    field366 = 2;
                                                }
                                                if (field365 > 55) {
                                                    field366 = -2;
                                                }
                                                if (field480 < -40) {
                                                    field368 = 1;
                                                }
                                                if (field480 > 40) {
                                                    field368 = -1;
                                                }
                                                field374++;
                                                if (field374 > 500) {
                                                    field374 = 0;
                                                    int var96 = (int) (Math.random() * 8.0D);
                                                    if ((var96 & 0x1) == 1) {
                                                        field489 += field454;
                                                    }
                                                    if ((var96 & 0x2) == 2) {
                                                        field372 += field373;
                                                    }
                                                }
                                                if (field489 < -60) {
                                                    field454 = 2;
                                                }
                                                if (field489 > 60) {
                                                    field454 = -2;
                                                }
                                                if (field372 < -20) {
                                                    field373 = 1;
                                                }
                                                if (field372 > 10) {
                                                    field373 = -1;
                                                }
                                                for (class39 var97 = (class39) field567.method3527(); var97 != null; var97 = (class39) field567.method3525()) {
                                                    if ((long) var97.field880 < class115.method645() / 1000L - 5L) {
                                                        if (var97.field881 > 0) {
                                                            class12.method3488(5, "", var97.field879 + class157.field2443);
                                                        }
                                                        if (var97.field881 == 0) {
                                                            class12.method3488(5, "", var97.field879 + class157.field2491);
                                                        }
                                                        var97.method3663();
                                                    }
                                                }
                                                field348++;
                                                if (field348 > 50) {
                                                    field493.method2617(36);
                                                }
                                                try {
                                                    if (Statics.field280 != null && field493.field1994 > 0) {
                                                        Statics.field280.method2804(field493.field2000, 0, field493.field1994);
                                                        field493.field1994 = 0;
                                                        field348 = 0;
                                                    }
                                                } catch (IOException var99) {
                                                    if (field352 > 0) {
                                                        method2();
                                                    } else {
                                                        method3288(40);
                                                        Statics.field3057 = Statics.field280;
                                                        Statics.field280 = null;
                                                    }
                                                }
                                                return;
                                            }
                                            var51 = var50.field3;
                                            if (var51.field2745 < 0) {
                                                break;
                                            }
                                            var52 = class173.method2297(var51.field2831);
                                        } while (var52 == null || var52.field2866 == null || var51.field2745 >= var52.field2866.length || var52.field2866[var51.field2745] != var51);
                                        class37.method179(var50);
                                    }
                                }
                                var48 = var47.field3;
                                if (var48.field2745 < 0) {
                                    break;
                                }
                                var49 = class173.method2297(var48.field2831);
                            } while (var49 == null || var49.field2866 == null || var48.field2745 >= var49.field2866.length || var49.field2866[var48.field2745] != var48);
                            class37.method179(var47);
                        }
                    }
                    var45 = var44.field3;
                    if (var45.field2745 < 0) {
                        break;
                    }
                    var46 = class173.method2297(var45.field2831);
                } while (var46 == null || var46.field2866 == null || var45.field2745 >= var46.field2866.length || var46.field2866[var45.field2745] != var45);
                class37.method179(var44);
            }
        } else if (field352 > 0) {
            method2();
        } else {
            method3288(40);
            Statics.field3057 = Statics.field280;
            Statics.field280 = null;
        }
    }

    @ObfuscatedName("client.x(I)V")
    public static final void method306() {
        if (Statics.field1536 != null) {
            Statics.field1536.method1165();
        }
        if (Statics.field1022 != null) {
            Statics.field1022.method1165();
        }
    }

    @ObfuscatedName("l.y(I)V")
    public static final void method121() {
        for (int var0 = 0; var0 < field539; var0++) {
            int var10002 = field542[var0]--;
            if (field542[var0] >= -10) {
                class59 var2 = field547[var0];
                if (var2 == null) {
                    class59 var10000 = (class59) null;
                    var2 = class59.method1219(Statics.field152, field540[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field542[var0] += var2.method1214();
                    field547[var0] = var2;
                }
                if (field542[var0] < 0) {
                    int var9;
                    if (field543[var0] == 0) {
                        var9 = field537;
                    } else {
                        int var3 = (field543[var0] & 0xFF) * 128;
                        int var4 = field543[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field2054.field828;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field543[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field2054.field818;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field542[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field538 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1213().method1256(Statics.field630);
                        class65 var11 = class65.method1282(var10, 100, var9);
                        var11.method1285(field397[var0] - 1);
                        Statics.field1900.method1119(var11);
                    }
                    field542[var0] = -100;
                }
            } else {
                field539--;
                for (int var1 = var0; var1 < field539; var1++) {
                    field540[var1] = field540[var1 + 1];
                    field547[var1] = field547[var1 + 1];
                    field397[var1] = field397[var1 + 1];
                    field542[var1] = field542[var1 + 1];
                    field543[var1] = field543[var1 + 1];
                }
                var0--;
            }
        }
        if (!field386) {
            return;
        }
        boolean var12;
        if (class183.field2950 == 0) {
            var12 = Statics.field3134.method3471();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field299 != 0 && field535 != -1) {
                class183.method650(Statics.field108, field535, 0, field299, false);
            }
            field386 = false;
        }
    }

    @ObfuscatedName("as.c(Lai;IIII)V")
    public static void method1011(class43 arg0, int arg1, int arg2, int arg3) {
        if (field539 >= 50 || field538 == 0 || arg0.field999 == null || arg1 >= arg0.field999.length) {
            return;
        }
        int var4 = arg0.field999[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field540[field539] = var5;
        field397[field539] = var6;
        field542[field539] = 0;
        field547[field539] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field543[field539] = (var8 << 16) + (var9 << 8) + var7;
        field539++;
    }

    @ObfuscatedName("ch.h(III)V")
    public static void method2160(int arg0, int arg1) {
        if (field299 != 0 && arg0 != -1) {
            class183.method650(Statics.field1008, arg0, 0, field299, false);
            field386 = true;
        }
    }

    @ObfuscatedName("dz.e(Lfd;IIB)V")
    public static final void method2279(class173 arg0, int arg1, int arg2) {
        if (field494 != 0 && field494 != 3 || class140.field2150 != 1 && Statics.field306 || class140.field2150 != 4) {
            return;
        }
        class175 var3 = arg0.method3203(true);
        if (var3 == null) {
            return;
        }
        int var4 = class140.field2151 - arg1;
        int var5 = class140.field2152 - arg2;
        if (!var3.method3229(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2890 / 2;
        int var7 = var5 - var3.field2894 / 2;
        int var8 = field489 + field347 & 0x7FF;
        int var9 = class91.field1579[var8];
        int var10 = class91.field1591[var8];
        int var11 = (field372 + 256) * var9 >> 8;
        int var12 = (field372 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field2054.field828 + var13 >> 7;
        int var16 = Statics.field2054.field818 - var14 >> 7;
        field493.method2617(251);
        field493.method2426(18);
        field493.method2386(class137.field2114[82] ? (class137.field2114[81] ? 2 : 1) : 0);
        field493.method2406(Statics.field2576 + var15);
        field493.method2349(Statics.field2133 + var16);
        field493.method2426(var6);
        field493.method2426(var7);
        field493.method2349(field347);
        field493.method2426(57);
        field493.method2426(field489);
        field493.method2426(field372);
        field493.method2426(89);
        field493.method2349(Statics.field2054.field828);
        field493.method2349(Statics.field2054.field818);
        field493.method2426(63);
        field531 = var15;
        field532 = var16;
    }

    @ObfuscatedName("ap.ab(Ljava/lang/String;I)V")
    public static final void method939(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field2060.field153 = !Statics.field2060.field153;
            class9.method1958();
            if (Statics.field2060.field153) {
                class12.method3488(99, "", "Roofs are now all hidden");
            } else {
                class12.method3488(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field314 = !field314;
        }
        if (field569 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field314 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field314 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                if (field352 > 0) {
                    method2();
                } else {
                    method3288(40);
                    Statics.field3057 = Statics.field280;
                    Statics.field280 = null;
                }
            }
            if (arg0.equalsIgnoreCase("errortest") && field301 == 2) {
                throw new RuntimeException();
            }
        }
        field493.method2617(255);
        field493.method2426(arg0.length() + 1);
        field493.method2354(arg0);
    }

    @ObfuscatedName("az.af(I)V")
    public static final void method657() {
        int var0 = field363 + Statics.field2054.field828;
        int var1 = field365 + Statics.field2054.field818;
        if (Statics.field1095 - var0 < -500 || Statics.field1095 - var0 > 500 || Statics.field1773 - var1 < -500 || Statics.field1773 - var1 > 500) {
            Statics.field1095 = var0;
            Statics.field1773 = var1;
        }
        if (Statics.field1095 != var0) {
            Statics.field1095 += (var0 - Statics.field1095) / 16;
        }
        if (Statics.field1773 != var1) {
            Statics.field1773 += (var1 - Statics.field1773) / 16;
        }
        if (class140.field2155 == 4 && Statics.field306) {
            int var2 = class140.field2138 - field388;
            field490 = var2 * 2;
            field388 = var2 == -1 || var2 == 1 ? class140.field2138 : (field388 + class140.field2138) / 2;
            int var3 = field387 - class140.field2144;
            field385 = var3 * 2;
            field387 = var3 == -1 || var3 == 1 ? class140.field2144 : (field387 + class140.field2144) / 2;
        } else {
            if (class137.field2114[96]) {
                field385 += (-24 - field385) / 2;
            } else if (class137.field2114[97]) {
                field385 += (24 - field385) / 2;
            } else {
                field385 /= 2;
            }
            if (class137.field2114[98]) {
                field490 += (12 - field490) / 2;
            } else if (class137.field2114[99]) {
                field490 += (-12 - field490) / 2;
            } else {
                field490 /= 2;
            }
            field388 = class140.field2138;
            field387 = class140.field2144;
        }
        field347 = field385 / 2 + field347 & 0x7FF;
        field383 += field490 / 2;
        if (field383 < 128) {
            field383 = 128;
        }
        if (field383 > 383) {
            field383 = 383;
        }
        int var4 = Statics.field1095 >> 7;
        int var5 = Statics.field1773 >> 7;
        int var6 = method226(Statics.field1095, Statics.field1773, Statics.field1961);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field1961;
                    if (var10 < 3 && (class6.field91[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field81[var10][var8][var9];
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
        if (var12 > field426) {
            field426 += (var12 - field426) / 24;
        } else if (var12 < field426) {
            field426 += (var12 - field426) / 80;
        }
    }

    @ObfuscatedName("v.au(S)V")
    public static final void method138() {
        int var0 = class33.field751;
        int[] var1 = class33.field752;
        for (int var2 = 0; var2 < var0; var2++) {
            class3 var3 = field296[var1[var2]];
            if (var3 != null) {
                method2898(var3, 1);
            }
        }
    }

    @ObfuscatedName("ef.ae(Lan;IB)V")
    public static final void method2898(class38 arg0, int arg1) {
        if (arg0.field865 > field577) {
            int var2 = arg0.field865 - field577;
            int var3 = arg0.field845 * 128 + arg0.field821 * 64;
            int var4 = arg0.field860 * 128 + arg0.field821 * 64;
            arg0.field828 += (var3 - arg0.field828) / var2;
            arg0.field818 += (var4 - arg0.field818) / var2;
            arg0.field875 = 0;
            arg0.field867 = arg0.field864;
        } else if (arg0.field829 >= field577) {
            if (field577 == arg0.field829 || arg0.field848 == -1 || arg0.field851 != 0 || arg0.field850 + 1 > Statics.method653(arg0.field848).field995[arg0.field849]) {
                int var5 = arg0.field829 - arg0.field865;
                int var6 = field577 - arg0.field865;
                int var7 = arg0.field845 * 128 + arg0.field821 * 64;
                int var8 = arg0.field860 * 128 + arg0.field821 * 64;
                int var9 = arg0.field859 * 128 + arg0.field821 * 64;
                int var10 = arg0.field861 * 128 + arg0.field821 * 64;
                arg0.field828 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field818 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field875 = 0;
            arg0.field867 = arg0.field864;
            arg0.field819 = arg0.field867;
        } else {
            arg0.field874 = arg0.field852;
            if (arg0.field857 == 0) {
                arg0.field875 = 0;
            } else {
                label225: {
                    if (arg0.field848 != -1 && arg0.field851 == 0) {
                        class43 var11 = Statics.method653(arg0.field848);
                        if (arg0.field877 > 0 && var11.field1003 == 0) {
                            arg0.field875++;
                            break label225;
                        }
                        if (arg0.field877 <= 0 && var11.field1004 == 0) {
                            arg0.field875++;
                            break label225;
                        }
                    }
                    int var12 = arg0.field828;
                    int var13 = arg0.field818;
                    int var14 = arg0.field827[arg0.field857 - 1] * 128 + arg0.field821 * 64;
                    int var15 = arg0.field872[arg0.field857 - 1] * 128 + arg0.field821 * 64;
                    if (var12 < var14) {
                        if (var13 < var15) {
                            arg0.field867 = 1280;
                        } else if (var13 > var15) {
                            arg0.field867 = 1792;
                        } else {
                            arg0.field867 = 1536;
                        }
                    } else if (var12 > var14) {
                        if (var13 < var15) {
                            arg0.field867 = 768;
                        } else if (var13 > var15) {
                            arg0.field867 = 256;
                        } else {
                            arg0.field867 = 512;
                        }
                    } else if (var13 < var15) {
                        arg0.field867 = 1024;
                    } else if (var13 > var15) {
                        arg0.field867 = 0;
                    }
                    byte var16 = arg0.field873[arg0.field857 - 1];
                    if (var14 - var12 <= 256 && var14 - var12 >= -256 && var15 - var13 <= 256 && var15 - var13 >= -256) {
                        int var17 = arg0.field867 - arg0.field819 & 0x7FF;
                        if (var17 > 1024) {
                            var17 -= 2048;
                        }
                        int var18 = arg0.field826;
                        if (var17 >= -256 && var17 <= 256) {
                            var18 = arg0.field825;
                        } else if (var17 >= 256 && var17 < 768) {
                            var18 = arg0.field863;
                        } else if (var17 >= -768 && var17 <= -256) {
                            var18 = arg0.field862;
                        }
                        if (var18 == -1) {
                            var18 = arg0.field825;
                        }
                        arg0.field874 = var18;
                        int var19 = 4;
                        boolean var20 = true;
                        if (arg0 instanceof class35) {
                            var20 = ((class35) arg0).field789.field918;
                        }
                        if (var20) {
                            if (arg0.field867 != arg0.field819 && arg0.field841 == -1 && arg0.field869 != 0) {
                                var19 = 2;
                            }
                            if (arg0.field857 > 2) {
                                var19 = 6;
                            }
                            if (arg0.field857 > 3) {
                                var19 = 8;
                            }
                            if (arg0.field875 > 0 && arg0.field857 > 1) {
                                var19 = 8;
                                arg0.field875--;
                            }
                        } else {
                            if (arg0.field857 > 1) {
                                var19 = 6;
                            }
                            if (arg0.field857 > 2) {
                                var19 = 8;
                            }
                            if (arg0.field875 > 0 && arg0.field857 > 1) {
                                var19 = 8;
                                arg0.field875--;
                            }
                        }
                        if (var16 == 2) {
                            var19 <<= 0x1;
                        }
                        if (var19 >= 8 && arg0.field874 == arg0.field825 && arg0.field871 != -1) {
                            arg0.field874 = arg0.field871;
                        }
                        if (var12 != var14 || var13 != var15) {
                            if (var12 < var14) {
                                arg0.field828 += var19;
                                if (arg0.field828 > var14) {
                                    arg0.field828 = var14;
                                }
                            } else if (var12 > var14) {
                                arg0.field828 -= var19;
                                if (arg0.field828 < var14) {
                                    arg0.field828 = var14;
                                }
                            }
                            if (var13 < var15) {
                                arg0.field818 += var19;
                                if (arg0.field818 > var15) {
                                    arg0.field818 = var15;
                                }
                            } else if (var13 > var15) {
                                arg0.field818 -= var19;
                                if (arg0.field818 < var15) {
                                    arg0.field818 = var15;
                                }
                            }
                        }
                        if (arg0.field828 == var14 && arg0.field818 == var15) {
                            arg0.field857--;
                            if (arg0.field877 > 0) {
                                arg0.field877--;
                            }
                        }
                    } else {
                        arg0.field828 = var14;
                        arg0.field818 = var15;
                        arg0.field857--;
                        if (arg0.field877 > 0) {
                            arg0.field877--;
                        }
                    }
                }
            }
        }
        if (arg0.field828 < 128 || arg0.field818 < 128 || arg0.field828 >= 13184 || arg0.field818 >= 13184) {
            arg0.field848 = -1;
            arg0.field853 = -1;
            arg0.field865 = 0;
            arg0.field829 = 0;
            arg0.field828 = arg0.field827[0] * 128 + arg0.field821 * 64;
            arg0.field818 = arg0.field872[0] * 128 + arg0.field821 * 64;
            arg0.method730();
        }
        if (Statics.field2054 == arg0 && (arg0.field828 < 1536 || arg0.field818 < 1536 || arg0.field828 >= 11776 || arg0.field818 >= 11776)) {
            arg0.field848 = -1;
            arg0.field853 = -1;
            arg0.field865 = 0;
            arg0.field829 = 0;
            arg0.field828 = arg0.field827[0] * 128 + arg0.field821 * 64;
            arg0.field818 = arg0.field872[0] * 128 + arg0.field821 * 64;
            arg0.method730();
        }
        method177(arg0);
        method643(arg0);
    }

    @ObfuscatedName("k.ax(Lan;I)V")
    public static final void method177(class38 arg0) {
        if (arg0.field869 == 0) {
            return;
        }
        if (arg0.field841 != -1) {
            class38 var1 = null;
            if (arg0.field841 < 32768) {
                var1 = field512[arg0.field841];
            } else if (arg0.field841 >= 32768) {
                var1 = field296[arg0.field841 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field828 - var1.field828;
                int var3 = arg0.field818 - var1.field818;
                if (var2 != 0 || var3 != 0) {
                    arg0.field867 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field817) {
                arg0.field841 = -1;
                arg0.field817 = false;
            }
        }
        if (arg0.field833 != -1 && (arg0.field857 == 0 || arg0.field875 > 0)) {
            arg0.field867 = arg0.field833;
            arg0.field833 = -1;
        }
        int var4 = arg0.field867 - arg0.field819 & 0x7FF;
        if (var4 == 0 && arg0.field817) {
            arg0.field841 = -1;
            arg0.field817 = false;
        }
        if (var4 == 0) {
            arg0.field836 = 0;
            return;
        }
        arg0.field836++;
        if (var4 > 1024) {
            arg0.field819 -= arg0.field869;
            boolean var5 = true;
            if (var4 < arg0.field869 || var4 > 2048 - arg0.field869) {
                arg0.field819 = arg0.field867;
                var5 = false;
            }
            if (arg0.field874 == arg0.field852 && (arg0.field836 > 25 || var5)) {
                if (arg0.field834 == -1) {
                    arg0.field874 = arg0.field825;
                } else {
                    arg0.field874 = arg0.field834;
                }
            }
        } else {
            arg0.field819 += arg0.field869;
            boolean var6 = true;
            if (var4 < arg0.field869 || var4 > 2048 - arg0.field869) {
                arg0.field819 = arg0.field867;
                var6 = false;
            }
            if (arg0.field874 == arg0.field852 && (arg0.field836 > 25 || var6)) {
                if (arg0.field824 == -1) {
                    arg0.field874 = arg0.field825;
                } else {
                    arg0.field874 = arg0.field824;
                }
            }
        }
        arg0.field819 &= 0x7FF;
    }

    @ObfuscatedName("au.az(Lan;B)V")
    public static final void method643(class38 arg0) {
        arg0.field820 = false;
        if (arg0.field874 != -1) {
            class43 var1 = Statics.method653(arg0.field874);
            if (var1 == null || var1.field992 == null) {
                arg0.field874 = -1;
            } else {
                arg0.field847++;
                if (arg0.field846 < var1.field992.length && arg0.field847 > var1.field995[arg0.field846]) {
                    arg0.field847 = 1;
                    arg0.field846++;
                    method1011(var1, arg0.field846, arg0.field828, arg0.field818);
                }
                if (arg0.field846 >= var1.field992.length) {
                    arg0.field847 = 0;
                    arg0.field846 = 0;
                    method1011(var1, arg0.field846, arg0.field828, arg0.field818);
                }
            }
        }
        if (arg0.field853 != -1 && field577 >= arg0.field856) {
            if (arg0.field854 < 0) {
                arg0.field854 = 0;
            }
            int var2 = class44.method732(arg0.field853).field1017;
            if (var2 == -1) {
                arg0.field853 = -1;
            } else {
                class43 var3 = Statics.method653(var2);
                if (var3 == null || var3.field992 == null) {
                    arg0.field853 = -1;
                } else {
                    arg0.field855++;
                    if (arg0.field854 < var3.field992.length && arg0.field855 > var3.field995[arg0.field854]) {
                        arg0.field855 = 1;
                        arg0.field854++;
                        method1011(var3, arg0.field854, arg0.field828, arg0.field818);
                    }
                    if (arg0.field854 >= var3.field992.length && (arg0.field854 < 0 || arg0.field854 >= var3.field992.length)) {
                        arg0.field853 = -1;
                    }
                }
            }
        }
        if (arg0.field848 != -1 && arg0.field851 <= 1) {
            class43 var4 = Statics.method653(arg0.field848);
            if (var4.field1003 == 1 && arg0.field877 > 0 && arg0.field865 <= field577 && arg0.field829 < field577) {
                arg0.field851 = 1;
                return;
            }
        }
        if (arg0.field848 != -1 && arg0.field851 == 0) {
            class43 var5 = Statics.method653(arg0.field848);
            if (var5 == null || var5.field992 == null) {
                arg0.field848 = -1;
            } else {
                arg0.field850++;
                if (arg0.field849 < var5.field992.length && arg0.field850 > var5.field995[arg0.field849]) {
                    arg0.field850 = 1;
                    arg0.field849++;
                    method1011(var5, arg0.field849, arg0.field828, arg0.field818);
                }
                if (arg0.field849 >= var5.field992.length) {
                    arg0.field849 -= var5.field996;
                    arg0.field858++;
                    if (arg0.field858 >= var5.field1002) {
                        arg0.field848 = -1;
                    } else if (arg0.field849 >= 0 && arg0.field849 < var5.field992.length) {
                        method1011(var5, arg0.field849, arg0.field828, arg0.field818);
                    } else {
                        arg0.field848 = -1;
                    }
                }
                arg0.field820 = var5.field998;
            }
        }
        if (arg0.field851 > 0) {
            arg0.field851--;
        }
    }

    @ObfuscatedName("n.aa(Lq;III)V")
    public static void method103(class3 arg0, int arg1, int arg2) {
        if (arg0.field848 == arg1 && arg1 != -1) {
            int var3 = Statics.method653(arg1).field1005;
            if (var3 == 1) {
                arg0.field849 = 0;
                arg0.field850 = 0;
                arg0.field851 = arg2;
                arg0.field858 = 0;
            }
            if (var3 == 2) {
                arg0.field858 = 0;
            }
        } else if (arg1 == -1 || arg0.field848 == -1 || Statics.method653(arg1).field988 >= Statics.method653(arg0.field848).field988) {
            arg0.field848 = arg1;
            arg0.field849 = 0;
            arg0.field850 = 0;
            arg0.field851 = arg2;
            arg0.field858 = 0;
            arg0.field877 = arg0.field857;
        }
    }

    @ObfuscatedName("x.ak(I)I")
    public static int method562() {
        return field511 ? 2 : 1;
    }

    @ObfuscatedName("t.ac(B)V")
    public static void method92() {
        field493.method2617(174);
        field493.method2426(method562());
        field493.method2349(Statics.field882);
        field493.method2349(Statics.field158);
    }

    @ObfuscatedName("fp.ar(I)V")
    public static void method2967() {
        client var0 = Statics.field297;
        synchronized (Statics.field297) {
            Container var1 = Statics.field297.method2840();
            if (var1 != null) {
                Statics.field759 = Math.max(var1.getSize().width, Statics.field1103);
                Statics.field2130 = Math.max(var1.getSize().height, Statics.field791);
                if (Statics.field2189 == var1) {
                    Insets var2 = Statics.field2189.getInsets();
                    Statics.field759 -= var2.right + var2.left;
                    Statics.field2130 -= var2.top + var2.bottom;
                }
                if (Statics.field759 <= 0) {
                    Statics.field759 = 1;
                }
                if (Statics.field2130 <= 0) {
                    Statics.field2130 = 1;
                }
                if (method562() == 1) {
                    Statics.field882 = field315;
                    Statics.field158 = field513 * 503;
                } else {
                    Statics.field882 = Math.min(Statics.field759, 7680);
                    Statics.field158 = Math.min(Statics.field2130, 2160);
                }
                field2187 = (Statics.field759 - Statics.field882) / 2;
                field2188 = 0;
                Statics.field176.setSize(Statics.field882, Statics.field158);
                int var3 = Statics.field882;
                int var4 = Statics.field158;
                Canvas var5 = Statics.field176;
                class78 var7;
                try {
                    class82 var6 = new class82();
                    var6.method1536(var3, var4, var5);
                    var7 = var6;
                } catch (Throwable var12) {
                    class76 var9 = new class76();
                    var9.method1536(var3, var4, var5);
                    var7 = var9;
                }
                Statics.field2056 = var7;
                if (Statics.field2189 == var1) {
                    Insets var10 = Statics.field2189.getInsets();
                    Statics.field176.setLocation(field2187 + var10.left, field2188 + var10.top);
                } else {
                    Statics.field176.setLocation(field2187, field2188);
                }
                method2953();
                if (field457 != -1) {
                    method2042(true);
                }
                method1492();
            }
        }
    }

    @ObfuscatedName("ff.ah(I)V")
    public static void method2953() {
        int var0 = Statics.field882;
        int var1 = Statics.field158;
        if (Statics.field759 < var0) {
            int var2 = Statics.field759;
        }
        if (Statics.field2130 < var1) {
            int var3 = Statics.field2130;
        }
        if (Statics.field2060 == null) {
            return;
        }
        try {
            client var4 = Statics.field297;
            Object[] var5 = new Object[] { method562() };
            JSObject.getWindow(var4).call("resize", var5);
        } catch (Throwable var7) {
        }
    }

    @ObfuscatedName("bs.an(I)V")
    public static void method1492() {
        int var0 = field2187;
        int var1 = field2188;
        int var2 = Statics.field759 - Statics.field882 - var0;
        int var3 = Statics.field2130 - Statics.field158 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field297.method2840();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field2189 == var4) {
                Insets var7 = Statics.field2189.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field2130);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field759, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field759 + var5 - var2, var6, var2, Statics.field2130);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field2130 + var6 - var3, Statics.field759, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("fx.aq(Ljava/lang/String;ZB)V")
    public static final void method3079(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1006.method3766(arg0, 250);
        int var6 = Statics.field1006.method3813(arg0, 250) * 13;
        class80.method1746(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1714(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1006.method3759(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method186(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method135(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field176.getGraphics();
            Statics.field2056.method1541(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field176.repaint();
        }
    }

    @ObfuscatedName("hr.at(IIIII)V")
    public static final void method3684(int arg0, int arg1, int arg2, int arg3) {
        field421++;
        method879(class34.field780);
        boolean var4 = false;
        if (field429 >= 0) {
            int var5 = class33.field751;
            int[] var6 = class33.field752;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field429 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method879(class34.field781);
        }
        method2633(true);
        method879(var4 ? class34.field774 : class34.field775);
        method2633(false);
        method2797();
        for (class30 var8 = (class30) field514.method3566(); var8 != null; var8 = (class30) field514.method3567()) {
            if (Statics.field1961 != var8.field688 || var8.field692) {
                var8.method3665();
            } else if (field577 >= var8.field698) {
                var8.method646(field428);
                if (var8.field692) {
                    var8.method3665();
                } else {
                    Statics.field1793.method1934(var8.field688, var8.field689, var8.field690, var8.field691, 60, var8, 0, -1, false);
                }
            }
        }
        Statics.method2054(arg0, arg1, arg2, arg3, true);
        int var9 = field559;
        int var10 = field560;
        int var11 = field437;
        int var12 = field562;
        class80.method1703(var9, var10, var9 + var11, var10 + var12);
        class91.method1965();
        if (!field548) {
            int var13 = field383;
            if (field426 / 256 > var13) {
                var13 = field426 / 256;
            }
            if (field546[4] && field447[4] + 128 > var13) {
                var13 = field447[4] + 128;
            }
            int var14 = field480 + field347 & 0x7FF;
            int var15 = Statics.field1095;
            int var16 = method226(Statics.field2054.field828, Statics.field2054.field818, Statics.field1961) - field389;
            int var17 = Statics.field1773;
            int var18 = var13 * 3 + 600;
            int var19 = 2048 - var13 & 0x7FF;
            int var20 = 2048 - var14 & 0x7FF;
            int var21 = 0;
            int var22 = 0;
            int var23 = var18;
            if (var19 != 0) {
                int var24 = class91.field1579[var19];
                int var25 = class91.field1591[var19];
                int var26 = var22 * var25 - var18 * var24 >> 16;
                var23 = var22 * var24 + var18 * var25 >> 16;
                var22 = var26;
            }
            if (var20 != 0) {
                int var27 = class91.field1579[var20];
                int var28 = class91.field1591[var20];
                int var29 = var21 * var28 + var23 * var27 >> 16;
                var23 = var23 * var28 - var21 * var27 >> 16;
                var21 = var29;
            }
            Statics.field2163 = var15 - var21;
            Statics.field2214 = var16 - var22;
            Statics.field55 = var17 - var23;
            Statics.field2137 = var13;
            Statics.field83 = var14;
        }
        int var30;
        if (field548) {
            var30 = method188();
        } else {
            var30 = method636();
        }
        int var31 = Statics.field2163;
        int var32 = Statics.field2214;
        int var33 = Statics.field55;
        int var34 = Statics.field2137;
        int var35 = Statics.field83;
        for (int var36 = 0; var36 < 5; var36++) {
            if (field546[var36]) {
                int var37 = (int) (Math.random() * (double) (field369[var36] * 2 + 1) - (double) field369[var36] + Math.sin((double) field549[var36] / 100.0D * (double) field433[var36]) * (double) field447[var36]);
                if (var36 == 0) {
                    Statics.field2163 += var37;
                }
                if (var36 == 1) {
                    Statics.field2214 += var37;
                }
                if (var36 == 2) {
                    Statics.field55 += var37;
                }
                if (var36 == 3) {
                    Statics.field83 = Statics.field83 + var37 & 0x7FF;
                }
                if (var36 == 4) {
                    Statics.field2137 += var37;
                    if (Statics.field2137 < 128) {
                        Statics.field2137 = 128;
                    }
                    if (Statics.field2137 > 383) {
                        Statics.field2137 = 383;
                    }
                }
            }
        }
        int var38 = class140.field2144;
        int var39 = class140.field2138;
        if (class140.field2150 != 0) {
            var38 = class140.field2151;
            var39 = class140.field2152;
        }
        if (var38 >= var9 && var38 < var9 + var11 && var39 >= var10 && var39 < var10 + var12) {
            class105.field1850 = true;
            class105.field1853 = 0;
            class105.field1851 = var38 - var9;
            class105.field1846 = var39 - var10;
        } else {
            class105.field1850 = false;
            class105.field1853 = 0;
        }
        method306();
        class80.method1746(var9, var10, var11, var12, 0);
        method306();
        int var40 = class91.field1572;
        class91.field1572 = field563;
        Statics.field1793.method1898(Statics.field2163, Statics.field2214, Statics.field55, Statics.field2137, Statics.field83, var30);
        class91.field1572 = var40;
        method306();
        Statics.field1793.method1933();
        method2066(var9, var10, var11, var12);
        method3258(var9, var10);
        ((class95) Statics.field1587).method2047(field428);
        if (field410 == 1) {
            Statics.field536[field409 / 100].method1624(field407 - 8, field408 - 8);
        }
        if (field410 == 2) {
            Statics.field536[field409 / 100 + 4].method1624(field407 - 8, field408 - 8);
        }
        field419 = 0;
        int var41 = (Statics.field2054.field828 >> 7) + Statics.field2576;
        int var42 = (Statics.field2054.field818 >> 7) + Statics.field2133;
        if (var41 >= 3053 && var41 <= 3156 && var42 >= 3056 && var42 <= 3136) {
            field419 = 1;
        }
        if (var41 >= 3072 && var41 <= 3118 && var42 >= 9492 && var42 <= 9535) {
            field419 = 1;
        }
        if (field419 == 1 && var41 >= 3139 && var41 <= 3199 && var42 >= 3008 && var42 <= 3062) {
            field419 = 0;
        }
        Statics.field2163 = var31;
        Statics.field2214 = var32;
        Statics.field55 = var33;
        Statics.field2137 = var34;
        Statics.field83 = var35;
        if (field401 && class171.method127(true, false) == 0) {
            field401 = false;
        }
        if (field401) {
            class80.method1746(var9, var10, var11, var12, 0);
            method3079(class157.field2305, false);
        }
    }

    @ObfuscatedName("ai.av(Lak;I)V")
    public static final void method879(class34 arg0) {
        if (Statics.field2054.field828 >> 7 == field531 && Statics.field2054.field818 >> 7 == field532) {
            field531 = 0;
        }
        int var1 = class33.field751;
        int[] var2 = class33.field752;
        int var3 = var1;
        if (class34.field780 == arg0 || class34.field781 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field780 == arg0) {
                var5 = Statics.field2054;
                var6 = Statics.field2054.field51 << 14;
            } else if (class34.field781 == arg0) {
                var5 = field296[field429];
                var6 = field429 << 14;
            } else {
                var5 = field296[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field774 == arg0 && field429 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method28() && !var5.field49) {
                var5.field47 = false;
                if ((field303 && var1 > 50 || var1 > 200) && class34.field780 != arg0 && var5.field874 == var5.field852) {
                    var5.field47 = true;
                }
                int var7 = var5.field828 >> 7;
                int var8 = var5.field818 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field34 == null || field577 < var5.field53 || field577 >= var5.field38) {
                        if ((var5.field828 & 0x7F) == 64 && (var5.field818 & 0x7F) == 64) {
                            if (field421 == field403[var7][var8]) {
                                continue;
                            }
                            field403[var7][var8] = field421;
                        }
                        var5.field36 = method226(var5.field828, var5.field818, Statics.field1961);
                        Statics.field1793.method1934(Statics.field1961, var5.field828, var5.field818, var5.field36, 60, var5, var5.field819, var6, var5.field820);
                    } else {
                        var5.field47 = false;
                        var5.field36 = method226(var5.field828, var5.field818, Statics.field1961);
                        Statics.field1793.method1903(Statics.field1961, var5.field828, var5.field818, var5.field36, 60, var5, var5.field819, var6, var5.field43, var5.field44, var5.field42, var5.field46);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dp.ai(ZI)V")
    public static final void method2633(boolean arg0) {
        for (int var1 = 0; var1 < field342; var1++) {
            class35 var2 = field512[field311[var1]];
            int var3 = (field311[var1] << 14) + 536870912;
            if (var2 != null && var2.method28() && var2.field789.field893 == arg0 && var2.field789.method751()) {
                int var4 = var2.field828 >> 7;
                int var5 = var2.field818 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field821 == 1 && (var2.field828 & 0x7F) == 64 && (var2.field818 & 0x7F) == 64) {
                        if (field421 == field403[var4][var5]) {
                            continue;
                        }
                        field403[var4][var5] = field421;
                    }
                    if (!var2.field789.field919) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1793.method1934(Statics.field1961, var2.field828, var2.field818, method226(var2.field828 + (var2.field821 * 64 - 64), var2.field818 + (var2.field821 * 64 - 64), Statics.field1961), var2.field821 * 64 - 64 + 60, var2, var2.field819, var3, var2.field820);
                }
            }
        }
    }

    @ObfuscatedName("eu.ay(B)V")
    public static final void method2797() {
        for (class7 var0 = (class7) field432.method3566(); var0 != null; var0 = (class7) field432.method3567()) {
            if (Statics.field1961 != var0.field114 || field577 > var0.field110) {
                var0.method3665();
            } else if (field577 >= var0.field109) {
                if (var0.field119 > 0) {
                    class35 var1 = field512[var0.field119 - 1];
                    if (var1 != null && var1.field828 >= 0 && var1.field828 < 13312 && var1.field818 >= 0 && var1.field818 < 13312) {
                        var0.method95(var1.field828, var1.field818, method226(var1.field828, var1.field818, var0.field114) - var0.field113, field577);
                    }
                }
                if (var0.field119 < 0) {
                    int var2 = -var0.field119 - 1;
                    class3 var3;
                    if (field375 == var2) {
                        var3 = Statics.field2054;
                    } else {
                        var3 = field296[var2];
                    }
                    if (var3 != null && var3.field828 >= 0 && var3.field828 < 13312 && var3.field818 >= 0 && var3.field818 < 13312) {
                        var0.method95(var3.field828, var3.field818, method226(var3.field828, var3.field818, var0.field114) - var0.field113, field577);
                    }
                }
                var0.method96(field428);
                Statics.field1793.method1934(Statics.field1961, (int) var0.field115, (int) var0.field116, (int) var0.field131, 60, var0, var0.field123, -1, false);
            }
        }
    }

    @ObfuscatedName("af.aw(I)I")
    public static final int method636() {
        if (Statics.field2060.field153) {
            return Statics.field1961;
        }
        int var0 = 3;
        if (Statics.field2137 < 310) {
            int var1 = Statics.field2163 >> 7;
            int var2 = Statics.field55 >> 7;
            int var3 = Statics.field2054.field828 >> 7;
            int var4 = Statics.field2054.field818 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field1961;
            }
            if ((class6.field91[Statics.field1961][var1][var2] & 0x4) != 0) {
                var0 = Statics.field1961;
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
                    if ((class6.field91[Statics.field1961][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1961;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field91[Statics.field1961][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1961;
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
                    if ((class6.field91[Statics.field1961][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1961;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field91[Statics.field1961][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1961;
                        }
                    }
                }
            }
        }
        if (Statics.field2054.field828 >= 0 && Statics.field2054.field818 >= 0 && Statics.field2054.field828 < 13312 && Statics.field2054.field818 < 13312) {
            if ((class6.field91[Statics.field1961][Statics.field2054.field828 >> 7][Statics.field2054.field818 >> 7] & 0x4) != 0) {
                var0 = Statics.field1961;
            }
            return var0;
        } else {
            return Statics.field1961;
        }
    }

    @ObfuscatedName("d.ap(I)I")
    public static final int method188() {
        if (Statics.field2060.field153) {
            return Statics.field1961;
        } else {
            int var0 = method226(Statics.field2163, Statics.field55, Statics.field1961);
            return var0 - Statics.field2214 >= 800 || (class6.field91[Statics.field1961][Statics.field2163 >> 7][Statics.field55 >> 7] & 0x4) == 0 ? 3 : Statics.field1961;
        }
    }

    @ObfuscatedName("fw.aj(III)V")
    public static final void method3258(int arg0, int arg1) {
        if (field316 == 2) {
            method996((field319 - Statics.field2576 << 7) + field322, (field320 - Statics.field2133 << 7) + field323, field321 * 2);
            if (field340 > -1 && field577 % 20 < 10) {
                Statics.field2682[0].method1624(field340 + arg0 - 12, field406 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("cj.ao(Lan;IIIIII)V")
    public static final void method2059(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method28()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field789;
            if (var6.field914 != null) {
                var6 = var6.method750();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class33.field751;
        int[] var8 = class33.field752;
        if (arg1 < var7) {
            int var9 = 30;
            class3 var10 = (class3) arg0;
            if (var10.field49) {
                return;
            }
            if (var10.field39 != -1 || var10.field31 != -1) {
                method150(arg0, arg0.field866 + 15);
                if (field340 > -1) {
                    if (var10.field39 != -1) {
                        Statics.field1374[var10.field39].method1624(field340 + arg2 - 12, field406 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field31 != -1) {
                        Statics.field184[var10.field31].method1624(field340 + arg2 - 12, field406 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field316 == 10 && field318 == var8[arg1]) {
                method150(arg0, arg0.field866 + 15);
                if (field340 > -1) {
                    Statics.field2682[1].method1624(field340 + arg2 - 12, field406 + arg3 - var9);
                }
            }
        } else {
            class40 var11 = ((class35) arg0).field789;
            if (var11.field914 != null) {
                var11 = var11.method750();
            }
            if (var11.field912 >= 0 && var11.field912 < Statics.field184.length) {
                method150(arg0, arg0.field866 + 15);
                if (field340 > -1) {
                    Statics.field184[var11.field912].method1624(field340 + arg2 - 12, field406 + arg3 - 30);
                }
            }
            if (field316 == 1 && field516 == field311[arg1 - var7] && field577 % 20 < 10) {
                method150(arg0, arg0.field866 + 15);
                if (field340 > -1) {
                    Statics.field2682[0].method1624(field340 + arg2 - 12, field406 + arg3 - 28);
                }
            }
        }
        if (arg0.field830 != null && (arg1 >= var7 || !arg0.field844 && (field415 == 4 || !arg0.field831 && (field415 == 0 || field415 == 3 || field415 == 1 && method1785(((class3) arg0).field52, false))))) {
            method150(arg0, arg0.field866);
            if (field340 > -1 && field393 < field394) {
                field344[field393] = Statics.field166.method3764(arg0.field830) / 2;
                field300[field393] = Statics.field166.field3175;
                field395[field393] = field340;
                field396[field393] = field406;
                field317[field393] = arg0.field870;
                field400[field393] = arg0.field835;
                field434[field393] = arg0.field822;
                field402[field393] = arg0.field830;
                field393++;
            }
        }
        if (arg0.field839 > field577) {
            method150(arg0, arg0.field866 + 15);
            if (field340 > -1) {
                int var12;
                if (arg1 < var7) {
                    var12 = 30;
                } else {
                    class40 var13 = ((class35) arg0).field789;
                    var12 = var13.field920;
                }
                int var14 = arg0.field840 * var12 / arg0.field823;
                if (var14 > var12) {
                    var14 = var12;
                } else if (var14 == 0 && arg0.field840 > 0) {
                    var14 = 1;
                }
                class80.method1746(field340 + arg2 - var12 / 2, field406 + arg3 - 3, var14, 5, 65280);
                class80.method1746(field340 + arg2 - var12 / 2 + var14, field406 + arg3 - 3, var12 - var14, 5, 16711680);
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            if (arg0.field838[var15] > field577) {
                method150(arg0, arg0.field866 / 2);
                if (field340 > -1) {
                    if (var15 == 1) {
                        field406 -= 20;
                    }
                    if (var15 == 2) {
                        field340 -= 15;
                        field406 -= 10;
                    }
                    if (var15 == 3) {
                        field340 += 15;
                        field406 -= 10;
                    }
                    Statics.field3108[arg0.field837[var15]].method1624(field340 + arg2 - 12, field406 + arg3 - 12);
                    Statics.field2896.method3771(Integer.toString(arg0.field832[var15]), field340 + arg2 - 1, field406 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("cf.ad(IIIII)V")
    public static final void method2066(int arg0, int arg1, int arg2, int arg3) {
        field393 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class33.field751;
        int[] var7 = class33.field752;
        for (int var8 = 0; var8 < field342 + var6; var8++) {
            class38 var9;
            if (var8 < var6) {
                var9 = field296[var7[var8]];
                if (field429 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field512[field311[var8 - var6]];
            }
            method2059(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method2059(field296[field429], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field393; var10++) {
            int var11 = field395[var10];
            int var12 = field396[var10];
            int var13 = field344[var10];
            int var14 = field300[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field396[var16] - field300[var16] && var12 - var14 < field396[var16] + 2 && var11 - var13 < field395[var16] + field344[var16] && var11 + var13 > field395[var16] - field344[var16] && field396[var16] - field300[var16] < var12) {
                        var12 = field396[var16] - field300[var16];
                        var15 = true;
                    }
                }
            }
            field340 = field395[var10];
            field406 = field396[var10] = var12;
            String var17 = field402[var10];
            if (field459 == 0) {
                int var18 = 16776960;
                if (field317[var10] < 6) {
                    var18 = field349[field317[var10]];
                }
                if (field317[var10] == 6) {
                    var18 = field421 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field317[var10] == 7) {
                    var18 = field421 % 20 < 10 ? 255 : 65535;
                }
                if (field317[var10] == 8) {
                    var18 = field421 % 20 < 10 ? 45056 : 8454016;
                }
                if (field317[var10] == 9) {
                    int var19 = 150 - field434[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field317[var10] == 10) {
                    int var20 = 150 - field434[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field317[var10] == 11) {
                    int var21 = 150 - field434[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field400[var10] == 0) {
                    Statics.field166.method3771(var17, field340 + arg0, field406 + arg1, var18, 0);
                }
                if (field400[var10] == 1) {
                    Statics.field166.method3760(var17, field340 + arg0, field406 + arg1, var18, 0, field421);
                }
                if (field400[var10] == 2) {
                    Statics.field166.method3801(var17, field340 + arg0, field406 + arg1, var18, 0, field421);
                }
                if (field400[var10] == 3) {
                    Statics.field166.method3794(var17, field340 + arg0, field406 + arg1, var18, 0, field421, 150 - field434[var10]);
                }
                if (field400[var10] == 4) {
                    int var22 = (150 - field434[var10]) * (Statics.field166.method3764(var17) + 100) / 150;
                    class80.method1704(field340 + arg0 - 50, arg1, field340 + arg0 + 50, arg1 + arg3);
                    Statics.field166.method3796(var17, field340 + arg0 + 50 - var22, field406 + arg1, var18, 0);
                    class80.method1703(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field400[var10] == 5) {
                    int var23 = 150 - field434[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class80.method1704(arg0, field406 + arg1 - Statics.field166.field3175 - 1, arg0 + arg2, field406 + arg1 + 5);
                    Statics.field166.method3771(var17, field340 + arg0, field406 + arg1 + var24, var18, 0);
                    class80.method1703(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field166.method3771(var17, field340 + arg0, field406 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("o.ag(Lan;II)V")
    public static final void method150(class38 arg0, int arg1) {
        method996(arg0.field828, arg0.field818, arg1);
    }

    @ObfuscatedName("ag.al(IIII)V")
    public static final void method996(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field340 = -1;
            field406 = -1;
            return;
        }
        int var3 = method226(arg0, arg1, Statics.field1961) - arg2;
        int var4 = arg0 - Statics.field2163;
        int var5 = var3 - Statics.field2214;
        int var6 = arg1 - Statics.field55;
        int var7 = class91.field1579[Statics.field2137];
        int var8 = class91.field1591[Statics.field2137];
        int var9 = class91.field1579[Statics.field83];
        int var10 = class91.field1591[Statics.field83];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field340 = field563 * var11 / var15 + field437 / 2;
            field406 = field563 * var14 / var15 + field562 / 2;
        } else {
            field340 = -1;
            field406 = -1;
        }
    }

    @ObfuscatedName("u.as(IIIS)I")
    public static final int method226(int arg0, int arg1, int arg2) {
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
        int var8 = (128 - var6) * class6.field81[var5][var3][var4] + class6.field81[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field81[var5][var3][var4 + 1] + class6.field81[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("dg.bi(ZI)V")
    public static final void method2298(boolean arg0) {
        field360 = arg0;
        if (!field360) {
            int var1 = field482.method2353();
            int var2 = field482.method2397();
            int var3 = field482.method2353();
            Statics.field756 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field756[var4][var5] = field482.method2368();
                }
            }
            Statics.field685 = new int[var3];
            Statics.field209 = new int[var3];
            Statics.field2277 = new int[var3];
            Statics.field2255 = new byte[var3][];
            Statics.field177 = new byte[var3][];
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
                        Statics.field685[var7] = var10;
                        Statics.field209[var7] = Statics.field11.method3052("m" + var8 + "_" + var9);
                        Statics.field2277[var7] = Statics.field11.method3052("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method2749(var2, var1);
            return;
        }
        int var11 = field482.method2409();
        int var12 = field482.method2409();
        int var13 = field482.method2353();
        field482.method2601();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field482.method2602(1);
                    if (var17 == 1) {
                        field545[var14][var15][var16] = field482.method2602(26);
                    } else {
                        field545[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field482.method2603();
        Statics.field756 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field756[var18][var19] = field482.method2368();
            }
        }
        Statics.field685 = new int[var13];
        Statics.field209 = new int[var13];
        Statics.field2277 = new int[var13];
        Statics.field2255 = new byte[var13][];
        Statics.field177 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field545[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field685[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field685[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field209[var20] = Statics.field11.method3052("m" + var29 + "_" + var30);
                            Statics.field2277[var20] = Statics.field11.method3052("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method2749(var12, var11);
    }

    @ObfuscatedName("eh.be(III)V")
    public static final void method2749(int arg0, int arg1) {
        if (Statics.field591 == arg0 && Statics.field805 == arg1) {
            return;
        }
        Statics.field591 = arg0;
        Statics.field805 = arg1;
        method3288(25);
        method3079(class157.field2305, true);
        int var2 = Statics.field2576;
        int var3 = Statics.field2133;
        Statics.field2576 = (arg0 - 6) * 8;
        Statics.field2133 = (arg1 - 6) * 8;
        int var4 = Statics.field2576 - var2;
        int var5 = Statics.field2133 - var3;
        int var6 = Statics.field2576;
        int var7 = Statics.field2133;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field512[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field827[var10] -= var4;
                    var9.field872[var10] -= var5;
                }
                var9.field828 -= var4 * 128;
                var9.field818 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field296[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field827[var13] -= var4;
                    var12.field872[var13] -= var5;
                }
                var12.field828 -= var4 * 128;
                var12.field818 -= var5 * 128;
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
                        field430[var24][var20][var21] = field430[var24][var22][var23];
                    } else {
                        field430[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field418.method3566(); var25 != null; var25 = (class17) field418.method3567()) {
            var25.field243 -= var4;
            var25.field249 -= var5;
            if (var25.field243 < 0 || var25.field249 < 0 || var25.field243 >= 104 || var25.field249 >= 104) {
                var25.method3665();
            }
        }
        if (field531 != 0) {
            field531 -= var4;
            field532 -= var5;
        }
        field539 = 0;
        field548 = false;
        field526 = -1;
        field514.method3560();
        field432.method3560();
        for (int var26 = 0; var26 < 4; var26++) {
            field359[var26].method2242();
        }
    }

    @ObfuscatedName("ee.bg(ZI)V")
    public static final void method2739(boolean arg0) {
        method306();
        field348++;
        if (field348 < 50 && !arg0) {
            return;
        }
        field348 = 0;
        if (field353 || Statics.field280 == null) {
            return;
        }
        field493.method2617(36);
        try {
            Statics.field280.method2804(field493.field2000, 0, field493.field1994);
            field493.field1994 = 0;
        } catch (IOException var2) {
            field353 = true;
        }
    }

    @ObfuscatedName("u.br(I)V")
    public static final void method204() {
        method2739(false);
        field313 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field2255.length; var1++) {
            if (Statics.field209[var1] != -1 && Statics.field2255[var1] == null) {
                Statics.field2255[var1] = Statics.field11.method3038(Statics.field209[var1], 0);
                if (Statics.field2255[var1] == null) {
                    var0 = false;
                    field313++;
                }
            }
            if (Statics.field2277[var1] != -1 && Statics.field177[var1] == null) {
                Statics.field177[var1] = Statics.field11.method3104(Statics.field2277[var1], 0, Statics.field756[var1]);
                if (Statics.field177[var1] == null) {
                    var0 = false;
                    field313++;
                }
            }
        }
        if (!var0) {
            field439 = 1;
            return;
        }
        field356 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field2255.length; var3++) {
            byte[] var4 = Statics.field177[var3];
            if (var4 != null) {
                int var5 = (Statics.field685[var3] >> 8) * 64 - Statics.field2576;
                int var6 = (Statics.field685[var3] & 0xFF) * 64 - Statics.field2133;
                if (field360) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= Statics.method2057(var4, var5, var6);
            }
        }
        if (!var2) {
            field439 = 2;
            return;
        }
        if (field439 != 0) {
            method3079(class157.field2305 + class2.field15 + class2.field19 + 100 + "%" + class2.field25, true);
        }
        method306();
        method2243();
        method306();
        Statics.field1793.method1788();
        method306();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field359[var7].method2242();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class6.field91[var8][var9][var10] = 0;
                }
            }
        }
        method306();
        class6.method228();
        int var11 = Statics.field2255.length;
        for (class24 var12 = (class24) class24.field618.method3566(); var12 != null; var12 = (class24) class24.field618.method3567()) {
            if (var12.field619 != null) {
                Statics.field1900.method1135(var12.field619);
                var12.field619 = null;
            }
            if (var12.field620 != null) {
                Statics.field1900.method1135(var12.field620);
                var12.field620 = null;
            }
        }
        class24.field618.method3560();
        method2739(true);
        if (!field360) {
            for (int var13 = 0; var13 < var11; var13++) {
                int var14 = (Statics.field685[var13] >> 8) * 64 - Statics.field2576;
                int var15 = (Statics.field685[var13] & 0xFF) * 64 - Statics.field2133;
                byte[] var16 = Statics.field2255[var13];
                if (var16 != null) {
                    method306();
                    int var17 = Statics.field591 * 8 - 48;
                    int var18 = Statics.field805 * 8 - 48;
                    class108[] var19 = field359;
                    for (int var20 = 0; var20 < 4; var20++) {
                        for (int var21 = 0; var21 < 64; var21++) {
                            for (int var22 = 0; var22 < 64; var22++) {
                                if (var14 + var21 > 0 && var14 + var21 < 103 && var15 + var22 > 0 && var15 + var22 < 103) {
                                    var19[var20].field1899[var14 + var21][var15 + var22] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class119 var23 = new class119(var16);
                    for (int var24 = 0; var24 < 4; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            for (int var26 = 0; var26 < 64; var26++) {
                                Statics.method642(var23, var24, var14 + var25, var15 + var26, var17, var18, 0);
                            }
                        }
                    }
                }
            }
            for (int var27 = 0; var27 < var11; var27++) {
                int var28 = (Statics.field685[var27] >> 8) * 64 - Statics.field2576;
                int var29 = (Statics.field685[var27] & 0xFF) * 64 - Statics.field2133;
                byte[] var30 = Statics.field2255[var27];
                if (var30 == null && Statics.field805 < 800) {
                    method306();
                    Statics.method2966(var28, var29, 64, 64);
                }
            }
            method2739(true);
            for (int var31 = 0; var31 < var11; var31++) {
                byte[] var32 = Statics.field177[var31];
                if (var32 != null) {
                    int var33 = (Statics.field685[var31] >> 8) * 64 - Statics.field2576;
                    int var34 = (Statics.field685[var31] & 0xFF) * 64 - Statics.field2133;
                    method306();
                    class6.method43(var32, var33, var34, Statics.field1793, field359);
                }
            }
        }
        if (field360) {
            for (int var35 = 0; var35 < 4; var35++) {
                method306();
                for (int var36 = 0; var36 < 13; var36++) {
                    for (int var37 = 0; var37 < 13; var37++) {
                        boolean var38 = false;
                        int var39 = field545[var35][var36][var37];
                        if (var39 != -1) {
                            int var40 = var39 >> 24 & 0x3;
                            int var41 = var39 >> 1 & 0x3;
                            int var42 = var39 >> 14 & 0x3FF;
                            int var43 = var39 >> 3 & 0x7FF;
                            int var44 = (var42 / 8 << 8) + var43 / 8;
                            for (int var45 = 0; var45 < Statics.field685.length; var45++) {
                                if (Statics.field685[var45] == var44 && Statics.field2255[var45] != null) {
                                    class6.method1074(Statics.field2255[var45], var35, var36 * 8, var37 * 8, var40, (var42 & 0x7) * 8, (var43 & 0x7) * 8, var41, field359);
                                    var38 = true;
                                    break;
                                }
                            }
                        }
                        if (!var38) {
                            class6.method104(var35, var36 * 8, var37 * 8);
                        }
                    }
                }
            }
            for (int var46 = 0; var46 < 13; var46++) {
                for (int var47 = 0; var47 < 13; var47++) {
                    int var48 = field545[0][var46][var47];
                    if (var48 == -1) {
                        Statics.method2966(var46 * 8, var47 * 8, 8, 8);
                    }
                }
            }
            method2739(true);
            for (int var49 = 0; var49 < 4; var49++) {
                method306();
                for (int var50 = 0; var50 < 13; var50++) {
                    for (int var51 = 0; var51 < 13; var51++) {
                        int var52 = field545[var49][var50][var51];
                        if (var52 != -1) {
                            int var53 = var52 >> 24 & 0x3;
                            int var54 = var52 >> 1 & 0x3;
                            int var55 = var52 >> 14 & 0x3FF;
                            int var56 = var52 >> 3 & 0x7FF;
                            int var57 = (var55 / 8 << 8) + var56 / 8;
                            for (int var58 = 0; var58 < Statics.field685.length; var58++) {
                                if (Statics.field685[var58] == var57 && Statics.field177[var58] != null) {
                                    class6.method3677(Statics.field177[var58], var49, var50 * 8, var51 * 8, var53, (var55 & 0x7) * 8, (var56 & 0x7) * 8, var54, Statics.field1793, field359);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method2739(true);
        method2243();
        method306();
        class86 var59 = Statics.field1793;
        class108[] var60 = field359;
        for (int var61 = 0; var61 < 4; var61++) {
            for (int var62 = 0; var62 < 104; var62++) {
                for (int var63 = 0; var63 < 104; var63++) {
                    if ((class6.field91[var61][var62][var63] & 0x1) == 1) {
                        int var64 = var61;
                        if ((class6.field91[1][var62][var63] & 0x2) == 2) {
                            var64 = var61 - 1;
                        }
                        if (var64 >= 0) {
                            var60[var64].method2244(var62, var63);
                        }
                    }
                }
            }
        }
        class6.field94 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field94 < -8) {
            class6.field94 = -8;
        }
        if (class6.field94 > 8) {
            class6.field94 = 8;
        }
        class6.field95 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field95 < -16) {
            class6.field95 = -16;
        }
        if (class6.field95 > 16) {
            class6.field95 = 16;
        }
        for (int var65 = 0; var65 < 4; var65++) {
            byte[][] var66 = Statics.field85[var65];
            int var67 = (int) Math.sqrt(5100.0D);
            int var68 = var67 * 768 >> 8;
            for (int var69 = 1; var69 < 103; var69++) {
                for (int var70 = 1; var70 < 103; var70++) {
                    int var71 = class6.field81[var65][var70 + 1][var69] - class6.field81[var65][var70 - 1][var69];
                    int var72 = class6.field81[var65][var70][var69 + 1] - class6.field81[var65][var70][var69 - 1];
                    int var73 = (int) Math.sqrt((double) (var72 * var72 + var71 * var71 + 65536));
                    int var74 = (var71 << 8) / var73;
                    int var75 = 65536 / var73;
                    int var76 = (var72 << 8) / var73;
                    int var77 = (var76 * -50 + var74 * -50 + var75 * -10) / var68 + 96;
                    int var78 = (var66[var70][var69] >> 1) + (var66[var70][var69 + 1] >> 3) + (var66[var70][var69 - 1] >> 2) + (var66[var70 - 1][var69] >> 2) + (var66[var70 + 1][var69] >> 3);
                    Statics.field3161[var70][var69] = var77 - var78;
                }
            }
            for (int var79 = 0; var79 < 104; var79++) {
                Statics.field1879[var79] = 0;
                Statics.field87[var79] = 0;
                Statics.field3197[var79] = 0;
                Statics.field984[var79] = 0;
                Statics.field696[var79] = 0;
            }
            for (int var80 = -5; var80 < 109; var80++) {
                for (int var81 = 0; var81 < 104; var81++) {
                    int var82 = var80 + 5;
                    int var10002;
                    if (var82 >= 0 && var82 < 104) {
                        int var83 = Statics.field3196[var65][var82][var81] & 0xFF;
                        if (var83 > 0) {
                            class42 var84 = class42.method1010(var83 - 1);
                            Statics.field1879[var81] += var84.field980;
                            Statics.field87[var81] += var84.field985;
                            Statics.field3197[var81] += var84.field978;
                            Statics.field984[var81] += var84.field977;
                            var10002 = Statics.field696[var81]++;
                        }
                    }
                    int var85 = var80 - 5;
                    if (var85 >= 0 && var85 < 104) {
                        int var86 = Statics.field3196[var65][var85][var81] & 0xFF;
                        if (var86 > 0) {
                            class42 var87 = class42.method1010(var86 - 1);
                            Statics.field1879[var81] -= var87.field980;
                            Statics.field87[var81] -= var87.field985;
                            Statics.field3197[var81] -= var87.field978;
                            Statics.field984[var81] -= var87.field977;
                            var10002 = Statics.field696[var81]--;
                        }
                    }
                }
                if (var80 >= 1 && var80 < 103) {
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    int var91 = 0;
                    int var92 = 0;
                    for (int var93 = -5; var93 < 109; var93++) {
                        int var94 = var93 + 5;
                        if (var94 >= 0 && var94 < 104) {
                            var88 += Statics.field1879[var94];
                            var89 += Statics.field87[var94];
                            var90 += Statics.field3197[var94];
                            var91 += Statics.field984[var94];
                            var92 += Statics.field696[var94];
                        }
                        int var95 = var93 - 5;
                        if (var95 >= 0 && var95 < 104) {
                            var88 -= Statics.field1879[var95];
                            var89 -= Statics.field87[var95];
                            var90 -= Statics.field3197[var95];
                            var91 -= Statics.field984[var95];
                            var92 -= Statics.field696[var95];
                        }
                        if (var93 >= 1 && var93 < 103 && (!field303 || (class6.field91[0][var80][var93] & 0x2) != 0 || (class6.field91[var65][var80][var93] & 0x10) == 0)) {
                            if (var65 < class6.field92) {
                                class6.field92 = var65;
                            }
                            int var96 = Statics.field3196[var65][var80][var93] & 0xFF;
                            int var97 = Statics.field2650[var65][var80][var93] & 0xFF;
                            if (var96 > 0 || var97 > 0) {
                                int var98 = class6.field81[var65][var80][var93];
                                int var99 = class6.field81[var65][var80 + 1][var93];
                                int var100 = class6.field81[var65][var80 + 1][var93 + 1];
                                int var101 = class6.field81[var65][var80][var93 + 1];
                                int var102 = Statics.field3161[var80][var93];
                                int var103 = Statics.field3161[var80 + 1][var93];
                                int var104 = Statics.field3161[var80 + 1][var93 + 1];
                                int var105 = Statics.field3161[var80][var93 + 1];
                                int var106 = -1;
                                int var107 = -1;
                                if (var96 > 0) {
                                    int var108 = var88 * 256 / var91;
                                    int var109 = var89 / var92;
                                    int var110 = var90 / var92;
                                    var106 = class6.method2651(var108, var109, var110);
                                    int var111 = class6.field94 + var108 & 0xFF;
                                    int var112 = class6.field95 + var110;
                                    if (var112 < 0) {
                                        var112 = 0;
                                    } else if (var112 > 255) {
                                        var112 = 255;
                                    }
                                    var107 = class6.method2651(var111, var109, var112);
                                }
                                if (var65 > 0) {
                                    boolean var113 = true;
                                    if (var96 == 0 && Statics.field2688[var65][var80][var93] != 0) {
                                        var113 = false;
                                    }
                                    if (var97 > 0 && !class47.method652(var97 - 1).field1056) {
                                        var113 = false;
                                    }
                                    if (var113 && var98 == var99 && var98 == var100 && var98 == var101) {
                                        Statics.field2070[var65][var80][var93] |= 0x924;
                                    }
                                }
                                int var114 = 0;
                                if (var107 != -1) {
                                    var114 = class91.field1586[class6.method2296(var107, 96)];
                                }
                                if (var97 == 0) {
                                    var59.method1804(var65, var80, var93, 0, 0, -1, var98, var99, var100, var101, class6.method2296(var106, var102), class6.method2296(var106, var103), class6.method2296(var106, var104), class6.method2296(var106, var105), 0, 0, 0, 0, var114, 0);
                                } else {
                                    int var115 = Statics.field2688[var65][var80][var93] + 1;
                                    byte var116 = Statics.field84[var65][var80][var93];
                                    class47 var117 = class47.method652(var97 - 1);
                                    int var118 = var117.field1055;
                                    int var119;
                                    int var120;
                                    if (var118 >= 0) {
                                        var119 = Statics.field1587.method2030(var118);
                                        var120 = -1;
                                    } else if (var117.field1061 == 16711935) {
                                        var120 = -2;
                                        var118 = -1;
                                        var119 = -2;
                                    } else {
                                        var120 = class6.method2651(var117.field1058, var117.field1063, var117.field1060);
                                        int var121 = class6.field94 + var117.field1058 & 0xFF;
                                        int var122 = class6.field95 + var117.field1060;
                                        if (var122 < 0) {
                                            var122 = 0;
                                        } else if (var122 > 255) {
                                            var122 = 255;
                                        }
                                        var119 = class6.method2651(var121, var117.field1063, var122);
                                    }
                                    int var123 = 0;
                                    if (var119 != -2) {
                                        var123 = class91.field1586[class6.method2043(var119, 96)];
                                    }
                                    if (var117.field1059 != -1) {
                                        int var124 = class6.field94 + var117.field1057 & 0xFF;
                                        int var125 = class6.field95 + var117.field1065;
                                        if (var125 < 0) {
                                            var125 = 0;
                                        } else if (var125 > 255) {
                                            var125 = 255;
                                        }
                                        int var126 = class6.method2651(var124, var117.field1052, var125);
                                        var123 = class91.field1586[class6.method2043(var126, 96)];
                                    }
                                    var59.method1804(var65, var80, var93, var115, var116, var118, var98, var99, var100, var101, class6.method2296(var106, var102), class6.method2296(var106, var103), class6.method2296(var106, var104), class6.method2296(var106, var105), class6.method2043(var120, var102), class6.method2043(var120, var103), class6.method2043(var120, var104), class6.method2043(var120, var105), var114, var123);
                                }
                            }
                        }
                    }
                }
            }
            for (int var127 = 1; var127 < 103; var127++) {
                for (int var128 = 1; var128 < 103; var128++) {
                    var59.method1792(var65, var128, var127, class6.method3176(var65, var128, var127));
                }
            }
            Statics.field3196[var65] = (byte[][]) null;
            Statics.field2650[var65] = (byte[][]) null;
            Statics.field2688[var65] = (byte[][]) null;
            Statics.field84[var65] = (byte[][]) null;
            Statics.field85[var65] = (byte[][]) null;
        }
        var59.method1819(-50, -10, -50);
        for (int var129 = 0; var129 < 104; var129++) {
            for (int var130 = 0; var130 < 104; var130++) {
                if ((class6.field91[1][var129][var130] & 0x2) == 2) {
                    var59.method1790(var129, var130);
                }
            }
        }
        int var131 = 1;
        int var132 = 2;
        int var133 = 4;
        for (int var134 = 0; var134 < 4; var134++) {
            if (var134 > 0) {
                var131 <<= 0x3;
                var132 <<= 0x3;
                var133 <<= 0x3;
            }
            for (int var135 = 0; var135 <= var134; var135++) {
                for (int var136 = 0; var136 <= 104; var136++) {
                    for (int var137 = 0; var137 <= 104; var137++) {
                        if ((Statics.field2070[var135][var137][var136] & var131) != 0) {
                            int var138 = var136;
                            int var139 = var136;
                            int var140 = var135;
                            int var141 = var135;
                            while (var138 > 0 && (Statics.field2070[var135][var137][var138 - 1] & var131) != 0) {
                                var138--;
                            }
                            while (var139 < 104 && (Statics.field2070[var135][var137][var139 + 1] & var131) != 0) {
                                var139++;
                            }
                            label582: while (var140 > 0) {
                                for (int var142 = var138; var142 <= var139; var142++) {
                                    if ((Statics.field2070[var140 - 1][var137][var142] & var131) == 0) {
                                        break label582;
                                    }
                                }
                                var140--;
                            }
                            label571: while (var141 < var134) {
                                for (int var143 = var138; var143 <= var139; var143++) {
                                    if ((Statics.field2070[var141 + 1][var137][var143] & var131) == 0) {
                                        break label571;
                                    }
                                }
                                var141++;
                            }
                            int var144 = (var141 + 1 - var140) * (var139 - var138 + 1);
                            if (var144 >= 8) {
                                short var145 = 240;
                                int var146 = class6.field81[var141][var137][var138] - var145;
                                int var147 = class6.field81[var140][var137][var138];
                                class86.method1791(var134, 1, var137 * 128, var137 * 128, var138 * 128, var139 * 128 + 128, var146, var147);
                                for (int var148 = var140; var148 <= var141; var148++) {
                                    for (int var149 = var138; var149 <= var139; var149++) {
                                        Statics.field2070[var148][var137][var149] &= ~var131;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2070[var135][var137][var136] & var132) != 0) {
                            int var150 = var137;
                            int var151 = var137;
                            int var152 = var135;
                            int var153 = var135;
                            while (var150 > 0 && (Statics.field2070[var135][var150 - 1][var136] & var132) != 0) {
                                var150--;
                            }
                            while (var151 < 104 && (Statics.field2070[var135][var151 + 1][var136] & var132) != 0) {
                                var151++;
                            }
                            label635: while (var152 > 0) {
                                for (int var154 = var150; var154 <= var151; var154++) {
                                    if ((Statics.field2070[var152 - 1][var154][var136] & var132) == 0) {
                                        break label635;
                                    }
                                }
                                var152--;
                            }
                            label624: while (var153 < var134) {
                                for (int var155 = var150; var155 <= var151; var155++) {
                                    if ((Statics.field2070[var153 + 1][var155][var136] & var132) == 0) {
                                        break label624;
                                    }
                                }
                                var153++;
                            }
                            int var156 = (var153 + 1 - var152) * (var151 - var150 + 1);
                            if (var156 >= 8) {
                                short var157 = 240;
                                int var158 = class6.field81[var153][var150][var136] - var157;
                                int var159 = class6.field81[var152][var150][var136];
                                class86.method1791(var134, 2, var150 * 128, var151 * 128 + 128, var136 * 128, var136 * 128, var158, var159);
                                for (int var160 = var152; var160 <= var153; var160++) {
                                    for (int var161 = var150; var161 <= var151; var161++) {
                                        Statics.field2070[var160][var161][var136] &= ~var132;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2070[var135][var137][var136] & var133) != 0) {
                            int var162 = var137;
                            int var163 = var137;
                            int var164 = var136;
                            int var165 = var136;
                            while (var164 > 0 && (Statics.field2070[var135][var137][var164 - 1] & var133) != 0) {
                                var164--;
                            }
                            while (var165 < 104 && (Statics.field2070[var135][var137][var165 + 1] & var133) != 0) {
                                var165++;
                            }
                            label688: while (var162 > 0) {
                                for (int var166 = var164; var166 <= var165; var166++) {
                                    if ((Statics.field2070[var135][var162 - 1][var166] & var133) == 0) {
                                        break label688;
                                    }
                                }
                                var162--;
                            }
                            label677: while (var163 < 104) {
                                for (int var167 = var164; var167 <= var165; var167++) {
                                    if ((Statics.field2070[var135][var163 + 1][var167] & var133) == 0) {
                                        break label677;
                                    }
                                }
                                var163++;
                            }
                            if ((var163 - var162 + 1) * (var165 - var164 + 1) >= 4) {
                                int var168 = class6.field81[var135][var162][var164];
                                class86.method1791(var134, 4, var162 * 128, var163 * 128 + 128, var164 * 128, var165 * 128 + 128, var168, var168);
                                for (int var169 = var162; var169 <= var163; var169++) {
                                    for (int var170 = var164; var170 <= var165; var170++) {
                                        Statics.field2070[var135][var169][var170] &= ~var133;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method2739(true);
        int var171 = class6.field92;
        if (var171 > Statics.field1961) {
            var171 = Statics.field1961;
        }
        if (var171 < Statics.field1961 - 1) {
            int var172 = Statics.field1961 - 1;
        }
        if (field303) {
            Statics.field1793.method1789(class6.field92);
        } else {
            Statics.field1793.method1789(0);
        }
        for (int var173 = 0; var173 < 104; var173++) {
            for (int var174 = 0; var174 < 104; var174++) {
                method586(var173, var174);
            }
        }
        method306();
        method2157();
        class41.field928.method3499();
        if (Statics.field2189 != null) {
            field493.method2617(114);
            field493.method2351(1057001181);
        }
        if (!field360) {
            int var175 = (Statics.field591 - 6) / 8;
            int var176 = (Statics.field591 + 6) / 8;
            int var177 = (Statics.field805 - 6) / 8;
            int var178 = (Statics.field805 + 6) / 8;
            for (int var179 = var175 - 1; var179 <= var176 + 1; var179++) {
                for (int var180 = var177 - 1; var180 <= var178 + 1; var180++) {
                    if (var179 < var175 || var179 > var176 || var180 < var177 || var180 > var178) {
                        Statics.field11.method3057("m" + var179 + "_" + var180);
                        Statics.field11.method3057("l" + var179 + "_" + var180);
                    }
                }
            }
        }
        method3288(30);
        method306();
        class6.method6();
        field493.method2617(102);
        Statics.field2062.method2677();
        for (int var181 = 0; var181 < 32; var181++) {
            field2185[var181] = 0L;
        }
        for (int var182 = 0; var182 < 32; var182++) {
            field2197[var182] = 0L;
        }
        Statics.field788 = 0;
    }

    @ObfuscatedName("at.bk(IS)V")
    public static final void method769(int arg0) {
        int[] var1 = Statics.field921.field1411;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field91[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field1793.method1946(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field91[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field1793.method1946(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field921.method1614();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field91[arg0][var10][var9] & 0x18) == 0) {
                    method924(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field91[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method924(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field392 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field1793.method1817(Statics.field1961, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class41.method1009(var14).field953;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field359[Statics.field1961].field1899;
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
                        field530[field392] = Statics.field1027[var15];
                        field471[field392] = var16;
                        field529[field392] = var17;
                        field392++;
                    }
                }
            }
        }
        Statics.field2056.method1607();
    }

    @ObfuscatedName("aw.bp(IIIIII)V")
    public static final void method924(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1793.method1814(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1793.method1853(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field921.field1411;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method1009(var12);
            if (var13.field954 == -1) {
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
                class81 var14 = Statics.field1166[var13.field954];
                if (var14 != null) {
                    int var15 = (var13.field968 * 4 - var14.field1432) / 2;
                    int var16 = (var13.field926 * 4 - var14.field1437) / 2;
                    var14.method1759(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field926) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1793.method1816(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1793.method1853(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method1009(var21);
            if (var22.field954 != -1) {
                class81 var23 = Statics.field1166[var22.field954];
                if (var23 != null) {
                    int var24 = (var22.field968 * 4 - var23.field1432) / 2;
                    int var25 = (var22.field926 * 4 - var23.field1437) / 2;
                    var23.method1759(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field926) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field921.field1411;
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
        int var29 = Statics.field1793.method1817(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method1009(var30);
        if (var31.field954 == -1) {
            return;
        }
        class81 var32 = Statics.field1166[var31.field954];
        if (var32 != null) {
            int var33 = (var31.field968 * 4 - var32.field1432) / 2;
            int var34 = (var31.field926 * 4 - var32.field1437) / 2;
            var32.method1759(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field926) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("az.bx(I)Z")
    public static final boolean method693() {
        if (Statics.field280 == null) {
            return false;
        }
        try {
            int var0 = Statics.field280.method2802();
            if (var0 == 0) {
                return false;
            }
            if (field346 == -1) {
                Statics.field280.method2823(field482.field2000, 0, 1);
                field482.field1994 = 0;
                field346 = field482.method2600();
                field345 = class188.field3039[field346];
                var0--;
            }
            if (field345 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field280.method2823(field482.field2000, 0, 1);
                field345 = field482.field2000[0] & 0xFF;
                var0--;
            }
            if (field345 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field280.method2823(field482.field2000, 0, 2);
                field482.field1994 = 0;
                field345 = field482.method2353();
                var0 -= 2;
            }
            if (var0 < field345) {
                return false;
            }
            field482.field1994 = 0;
            Statics.field280.method2823(field482.field2000, 0, field345);
            field350 = 0;
            field351 = field528;
            field528 = field414;
            field414 = field346;
            if (field346 == 119) {
                int var1 = field482.method2353();
                int var2 = field482.method2363();
                int var3 = field482.method2353();
                if (field537 != 0 && var2 != 0 && field539 < 50) {
                    field540[field539] = var1;
                    field397[field539] = var2;
                    field542[field539] = var3;
                    field547[field539] = null;
                    field543[field539] = 0;
                    field539++;
                }
                field346 = -1;
                return true;
            }
            if (field346 == 218) {
                field491 = field302;
                if (field345 == 0) {
                    field524 = null;
                    field520 = null;
                    Statics.field245 = 0;
                    Statics.field2075 = null;
                    field346 = -1;
                    return true;
                }
                field520 = field482.method2365();
                long var7 = field482.method2398();
                field524 = class162.method3714(var7);
                Statics.field1906 = field482.method2364();
                int var9 = field482.method2363();
                if (var9 == 255) {
                    field346 = -1;
                    return true;
                }
                Statics.field245 = var9;
                class25[] var10 = new class25[100];
                for (int var11 = 0; var11 < Statics.field245; var11++) {
                    var10[var11] = new class25();
                    var10[var11].field636 = field482.method2365();
                    var10[var11].field632 = class164.method2754(var10[var11].field636, Statics.field3198);
                    var10[var11].field633 = field482.method2353();
                    var10[var11].field634 = field482.method2364();
                    field482.method2365();
                    if (var10[var11].field636.equals(Statics.field2054.field52)) {
                        Statics.field1044 = var10[var11].field634;
                    }
                }
                boolean var12 = false;
                int var13 = Statics.field245;
                while (var13 > 0) {
                    boolean var14 = true;
                    var13--;
                    for (int var15 = 0; var15 < var13; var15++) {
                        if (var10[var15].field632.compareTo(var10[var15 + 1].field632) > 0) {
                            class25 var16 = var10[var15];
                            var10[var15] = var10[var15 + 1];
                            var10[var15 + 1] = var16;
                            var14 = false;
                        }
                    }
                    if (var14) {
                        break;
                    }
                }
                Statics.field2075 = var10;
                field346 = -1;
                return true;
            }
            if (field346 == 165) {
                int var17 = field482.method2543();
                class173 var18 = class173.method2297(var17);
                var18.field2785 = 3;
                var18.field2786 = Statics.field2054.field50.method3263();
                Statics.method1777(var18);
                field346 = -1;
                return true;
            }
            if (field346 == 196) {
                int var19 = field345 + field482.field1994;
                int var20 = field482.method2353();
                int var21 = field482.method2353();
                if (field457 != var20) {
                    field457 = var20;
                    method2042(false);
                    method1959(field457);
                    class37.method1776(field457);
                    for (int var22 = 0; var22 < 100; var22++) {
                        field502[var22] = true;
                    }
                }
                while (var21-- > 0) {
                    int var23 = field482.method2368();
                    int var24 = field482.method2353();
                    int var25 = field482.method2363();
                    class4 var26 = (class4) field458.method3532((long) var23);
                    if (var26 != null && var26.field62 != var24) {
                        method3227(var26, true);
                        var26 = null;
                    }
                    if (var26 == null) {
                        class4 var27 = new class4();
                        var27.field62 = var24;
                        var27.field58 = var25;
                        field458.method3534(var27, (long) var23);
                        method1959(var24);
                        class173 var28 = class173.method2297(var23);
                        Statics.method1777(var28);
                        if (field461 != null) {
                            Statics.method1777(field461);
                            field461 = null;
                        }
                        method1196();
                        method2640(Statics.field2803[var23 >> 16], var28, false);
                        class37.method1776(var24);
                        if (field457 != -1) {
                            Statics.method2920(field457, 1);
                        }
                        var26 = var27;
                    }
                    var26.field69 = true;
                }
                for (class4 var30 = (class4) field458.method3543(); var30 != null; var30 = (class4) field458.method3537()) {
                    if (var30.field69) {
                        var30.field69 = false;
                    } else {
                        method3227(var30, true);
                    }
                }
                field499 = new class196(512);
                while (field482.field1994 < var19) {
                    int var31 = field482.method2368();
                    int var32 = field482.method2353();
                    int var33 = field482.method2353();
                    int var34 = field482.method2368();
                    for (int var35 = var32; var35 <= var33; var35++) {
                        long var36 = ((long) var31 << 32) + (long) var35;
                        field499.method3534(new class201(var34), var36);
                    }
                }
                field346 = -1;
                return true;
            }
            if (field346 == 80) {
                int var38 = field482.method2507();
                int var39 = field482.method2543();
                class173 var40 = class173.method2297(var39);
                if (var40.field2789 != var38 || var38 == -1) {
                    var40.field2789 = var38;
                    var40.field2864 = 0;
                    var40.field2865 = 0;
                    Statics.method1777(var40);
                }
                field346 = -1;
                return true;
            }
            if (field346 == 237) {
                String var41 = field482.method2365();
                Object[] var42 = new Object[var41.length() + 1];
                for (int var43 = var41.length() - 1; var43 >= 0; var43--) {
                    if (var41.charAt(var43) == 's') {
                        var42[var43 + 1] = field482.method2365();
                    } else {
                        var42[var43 + 1] = Integer.valueOf(field482.method2368());
                    }
                }
                var42[0] = Integer.valueOf(field482.method2368());
                class1 var44 = new class1();
                var44.field9 = var42;
                class37.method179(var44);
                field346 = -1;
                return true;
            }
            if (field346 == 67) {
                Statics.field700 = field482.method2363();
                Statics.field1566 = field482.method2363();
                while (field482.field1994 < field345) {
                    field346 = field482.method2363();
                    method93();
                }
                field346 = -1;
                return true;
            }
            if (field346 == 185) {
                String var45 = field482.method2365();
                long var46 = field482.method2398();
                long var48 = (long) field482.method2353();
                long var50 = (long) field482.method2414();
                class152[] var52 = new class152[] { class152.field2250, class152.field2248, class152.field2249, class152.field2246, class152.field2247 };
                class152 var53 = (class152) class109.method2796(var52, field482.method2363());
                long var54 = (var48 << 32) + var50;
                boolean var56 = false;
                for (int var57 = 0; var57 < 100; var57++) {
                    if (field518[var57] == var54) {
                        var56 = true;
                        break;
                    }
                }
                if (var53.field2254 && method2149(var45)) {
                    var56 = true;
                }
                if (!var56 && field419 == 0) {
                    field518[field519] = var54;
                    field519 = (field519 + 1) % 100;
                    class122 var58 = field482;
                    String var62;
                    try {
                        int var59 = var58.method2376();
                        if (var59 > 32767) {
                            var59 = 32767;
                        }
                        byte[] var60 = new byte[var59];
                        var58.field1994 += Statics.field3168.method2289(var58.field2000, var58.field1994, var60, 0, var59);
                        String var61 = Statics.method2934(var60, 0, var59);
                        var62 = var61;
                    } catch (Exception var495) {
                        var62 = "Cabbage";
                    }
                    String var65 = class223.method3774(class163.method2056(var62));
                    if (var53.field2252 == -1) {
                        class12.method2064(9, var45, var65, class162.method728(var46));
                    } else {
                        int var66 = var53.field2252;
                        String var67 = "<img=" + var66 + ">";
                        class12.method2064(9, var67 + var45, var65, class162.method728(var46));
                    }
                }
                field346 = -1;
                return true;
            }
            if (field346 == 141) {
                int var68 = field482.method2353();
                int var69 = field482.method2499();
                int var70 = field482.method2510();
                class173 var71 = class173.method2297(var70);
                var71.field2734 = (var68 << 16) + var69;
                field346 = -1;
                return true;
            }
            if (field346 == 138) {
                method2899(false);
                field346 = -1;
                return true;
            }
            if (field346 == 242) {
                int var72 = field482.method2409();
                int var73 = field482.method2397();
                int var74 = field482.method2348();
                int var75 = field482.method2499();
                class173 var76 = class173.method2297(var74);
                if (var76.field2793 != var72 || var76.field2794 != var73 || var76.field2796 != var75) {
                    var76.field2793 = var72;
                    var76.field2794 = var73;
                    var76.field2796 = var75;
                    Statics.method1777(var76);
                }
                field346 = -1;
                return true;
            }
            if (field346 == 162) {
                method2();
                field346 = -1;
                return false;
            }
            if (field346 == 166) {
                field548 = false;
                for (int var77 = 0; var77 < 5; var77++) {
                    field546[var77] = false;
                }
                field346 = -1;
                return true;
            }
            if (field346 == 111) {
                int var78 = field482.method2348();
                int var79 = field482.method2507();
                int var80 = field482.method2400();
                class173 var81 = class173.method2297(var78);
                if (var81.field2870 != var79 || var81.field2754 != var80 || var81.field2749 != 0 || var81.field2750 != 0) {
                    var81.field2870 = var79;
                    var81.field2754 = var80;
                    var81.field2749 = 0;
                    var81.field2750 = 0;
                    Statics.method1777(var81);
                    method959(var81);
                    if (var81.field2746 == 0) {
                        method2640(Statics.field2803[var78 >> 16], var81, false);
                    }
                }
                field346 = -1;
                return true;
            }
            if (field346 == 213) {
                field316 = field482.method2363();
                if (field316 == 1) {
                    field516 = field482.method2353();
                }
                if (field316 >= 2 && field316 <= 6) {
                    if (field316 == 2) {
                        field322 = 64;
                        field323 = 64;
                    }
                    if (field316 == 3) {
                        field322 = 0;
                        field323 = 64;
                    }
                    if (field316 == 4) {
                        field322 = 128;
                        field323 = 64;
                    }
                    if (field316 == 5) {
                        field322 = 64;
                        field323 = 0;
                    }
                    if (field316 == 6) {
                        field322 = 64;
                        field323 = 128;
                    }
                    field316 = 2;
                    field319 = field482.method2353();
                    field320 = field482.method2353();
                    field321 = field482.method2363();
                }
                if (field316 == 10) {
                    field318 = field482.method2353();
                }
                field346 = -1;
                return true;
            }
            if (field346 == 126) {
                method2899(true);
                field346 = -1;
                return true;
            }
            if (field346 == 30) {
                int var82 = field482.method2368();
                int var83 = field482.method2353();
                if (var82 < -70000) {
                    var83 += 32768;
                }
                class173 var84;
                if (var82 >= 0) {
                    var84 = class173.method2297(var82);
                } else {
                    var84 = null;
                }
                while (field482.field1994 < field345) {
                    int var85 = field482.method2376();
                    int var86 = field482.method2353();
                    int var87 = 0;
                    if (var86 != 0) {
                        var87 = field482.method2363();
                        if (var87 == 255) {
                            var87 = field482.method2368();
                        }
                    }
                    if (var84 != null && var85 >= 0 && var85 < var84.field2860.length) {
                        var84.field2860[var85] = var86;
                        var84.field2861[var85] = var87;
                    }
                    class16.method725(var83, var85, var86 - 1, var87);
                }
                if (var84 != null) {
                    Statics.method1777(var84);
                }
                method2632();
                field485[++field357 - 1 & 0x1F] = var83 & 0x7FFF;
                field346 = -1;
                return true;
            }
            if (field346 == 179) {
                int var88 = field482.method2445();
                int var89 = field482.method2390();
                String var90 = field482.method2365();
                if (var89 >= 1 && var89 <= 8) {
                    if (var90.equalsIgnoreCase("null")) {
                        var90 = null;
                    }
                    field550[var89 - 1] = var90;
                    field427[var89 - 1] = var88 == 0;
                }
                field346 = -1;
                return true;
            }
            if (field346 == 77) {
                Statics.field1566 = field482.method2445();
                Statics.field700 = field482.method2363();
                for (int var91 = Statics.field1566; var91 < Statics.field1566 + 8; var91++) {
                    for (int var92 = Statics.field700; var92 < Statics.field700 + 8; var92++) {
                        if (field430[Statics.field1961][var91][var92] != null) {
                            field430[Statics.field1961][var91][var92] = null;
                            method586(var91, var92);
                        }
                    }
                }
                for (class17 var93 = (class17) field418.method3566(); var93 != null; var93 = (class17) field418.method3567()) {
                    if (var93.field243 >= Statics.field1566 && var93.field243 < Statics.field1566 + 8 && var93.field249 >= Statics.field700 && var93.field249 < Statics.field700 + 8 && Statics.field1961 == var93.field242) {
                        var93.field238 = 0;
                    }
                }
                field346 = -1;
                return true;
            }
            if (field346 == 210) {
                int var94 = field482.method2368();
                int var95 = field482.method2499();
                class173 var96 = class173.method2297(var94);
                if (var96.field2785 != 1 || var96.field2786 != var95) {
                    var96.field2785 = 1;
                    var96.field2786 = var95;
                    Statics.method1777(var96);
                }
                field346 = -1;
                return true;
            }
            if (field346 == 134) {
                int var97 = field482.method2363();
                int var98 = field482.method2363();
                int var99 = field482.method2363();
                int var100 = field482.method2363();
                field546[var97] = true;
                field369[var97] = var98;
                field447[var97] = var99;
                field549[var97] = var100;
                field433[var97] = 0;
                field346 = -1;
                return true;
            }
            if (field346 == 94) {
                String var101 = field482.method2365();
                class122 var102 = field482;
                String var106;
                try {
                    int var103 = var102.method2376();
                    if (var103 > 32767) {
                        var103 = 32767;
                    }
                    byte[] var104 = new byte[var103];
                    var102.field1994 += Statics.field3168.method2289(var102.field2000, var102.field1994, var104, 0, var103);
                    String var105 = Statics.method2934(var104, 0, var103);
                    var106 = var105;
                } catch (Exception var494) {
                    var106 = "Cabbage";
                }
                String var109 = class223.method3774(class163.method2056(var106));
                class12.method3488(6, var101, var109);
                field346 = -1;
                return true;
            }
            if (field346 == 215) {
                method2152(field482.method2365());
                field346 = -1;
                return true;
            }
            if (field346 == 191) {
                int var110 = field482.method2543();
                int var111 = field482.method2499();
                int var112 = field482.method2445();
                class4 var113 = (class4) field458.method3532((long) var110);
                if (var113 != null) {
                    method3227(var113, var113.field62 != var111);
                }
                class4 var114 = new class4();
                var114.field62 = var111;
                var114.field58 = var112;
                field458.method3534(var114, (long) var110);
                method1959(var111);
                class173 var115 = class173.method2297(var110);
                Statics.method1777(var115);
                if (field461 != null) {
                    Statics.method1777(field461);
                    field461 = null;
                }
                method1196();
                method2640(Statics.field2803[var110 >> 16], var115, false);
                class37.method1776(var111);
                if (field457 != -1) {
                    Statics.method2920(field457, 1);
                }
                field346 = -1;
                return true;
            }
            if (field346 == 7) {
                while (field482.field1994 < field345) {
                    boolean var116 = field482.method2363() == 1;
                    String var117 = field482.method2365();
                    String var118 = field482.method2365();
                    int var119 = field482.method2353();
                    int var120 = field482.method2363();
                    int var121 = field482.method2363();
                    boolean var122 = (var121 & 0x2) != 0;
                    boolean var123 = (var121 & 0x1) != 0;
                    if (var119 > 0) {
                        field482.method2365();
                        field482.method2363();
                        field482.method2368();
                    }
                    field482.method2365();
                    for (int var124 = 0; var124 < field564; var124++) {
                        class18 var125 = field566[var124];
                        if (var116) {
                            if (var118.equals(var125.field262)) {
                                var125.field262 = var117;
                                var125.field256 = var118;
                                var117 = null;
                                break;
                            }
                        } else if (var117.equals(var125.field262)) {
                            if (var125.field255 != var119) {
                                boolean var126 = true;
                                for (class39 var127 = (class39) field567.method3527(); var127 != null; var127 = (class39) field567.method3525()) {
                                    if (var127.field879.equals(var117)) {
                                        if (var119 != 0 && var127.field881 == 0) {
                                            var127.method3663();
                                            var126 = false;
                                        } else if (var119 == 0 && var127.field881 != 0) {
                                            var127.method3663();
                                            var126 = false;
                                        }
                                    }
                                }
                                if (var126) {
                                    field567.method3526(new class39(var117, var119));
                                }
                                var125.field255 = var119;
                            }
                            var125.field256 = var118;
                            var125.field259 = var120;
                            var125.field254 = var122;
                            var125.field258 = var123;
                            var117 = null;
                            break;
                        }
                    }
                    if (var117 != null && field564 < 400) {
                        class18 var128 = new class18();
                        field566[field564] = var128;
                        var128.field262 = var117;
                        var128.field256 = var118;
                        var128.field255 = var119;
                        var128.field259 = var120;
                        var128.field254 = var122;
                        var128.field258 = var123;
                        field564++;
                    }
                }
                field565 = 2;
                field487 = field302;
                boolean var129 = false;
                int var130 = field564;
                while (var130 > 0) {
                    boolean var131 = true;
                    var130--;
                    for (int var132 = 0; var132 < var130; var132++) {
                        boolean var133 = false;
                        class18 var134 = field566[var132];
                        class18 var135 = field566[var132 + 1];
                        if (field441 != var134.field255 && field441 == var135.field255) {
                            var133 = true;
                        }
                        if (!var133 && var134.field255 == 0 && var135.field255 != 0) {
                            var133 = true;
                        }
                        if (!var133 && !var134.field254 && var135.field254) {
                            var133 = true;
                        }
                        if (!var133 && !var134.field258 && var135.field258) {
                            var133 = true;
                        }
                        if (var133) {
                            class18 var136 = field566[var132];
                            field566[var132] = field566[var132 + 1];
                            field566[var132 + 1] = var136;
                            var131 = false;
                        }
                    }
                    if (var131) {
                        break;
                    }
                }
                field346 = -1;
                return true;
            }
            if (field346 == 203) {
                int var137 = field482.method2353();
                class16 var138 = (class16) class16.field225.method3532((long) var137);
                if (var138 != null) {
                    var138.method3665();
                }
                field485[++field357 - 1 & 0x1F] = var137 & 0x7FFF;
                field346 = -1;
                return true;
            }
            if (field346 == 104) {
                int var139 = field482.method2363();
                class130[] var140 = new class130[] { class130.field2064, class130.field2063, class130.field2067 };
                class130[] var141 = var140;
                int var142 = 0;
                class130 var144;
                while (true) {
                    if (var142 >= var141.length) {
                        var144 = null;
                        break;
                    }
                    class130 var143 = var141[var142];
                    if (var143.field2066 == var139) {
                        var144 = var143;
                        break;
                    }
                    var142++;
                }
                Statics.field132 = var144;
                field346 = -1;
                return true;
            }
            if (field346 == 55) {
                int var145 = field482.method2368();
                class4 var146 = (class4) field458.method3532((long) var145);
                if (var146 != null) {
                    method3227(var146, true);
                }
                if (field461 != null) {
                    Statics.method1777(field461);
                    field461 = null;
                }
                field346 = -1;
                return true;
            }
            if (field346 == 186) {
                field548 = true;
                Statics.field253 = field482.method2363();
                Statics.field121 = field482.method2363();
                Statics.field923 = field482.method2353();
                Statics.field785 = field482.method2363();
                Statics.field172 = field482.method2363();
                if (Statics.field172 >= 100) {
                    Statics.field2163 = Statics.field253 * 128 + 64;
                    Statics.field55 = Statics.field121 * 128 + 64;
                    Statics.field2214 = method226(Statics.field2163, Statics.field55, Statics.field1961) - Statics.field923;
                }
                field346 = -1;
                return true;
            }
            if (field346 == 217) {
                int var147 = field482.method2409();
                if (var147 == 65535) {
                    var147 = -1;
                }
                int var148 = field482.method2368();
                int var149 = field482.method2510();
                class173 var150 = class173.method2297(var148);
                if (var150.field2743) {
                    var150.field2752 = var147;
                    var150.field2875 = var149;
                    class52 var152 = Statics.method975(var147);
                    var150.field2793 = var152.field1162;
                    var150.field2794 = var152.field1128;
                    var150.field2795 = var152.field1129;
                    var150.field2791 = var152.field1130;
                    var150.field2792 = var152.field1131;
                    var150.field2796 = var152.field1126;
                    if (var152.field1109 == 1) {
                        var150.field2800 = 1;
                    } else {
                        var150.field2800 = 2;
                    }
                    if (var150.field2871 > 0) {
                        var150.field2796 = var150.field2796 * 32 / var150.field2871;
                    } else if (var150.field2755 > 0) {
                        var150.field2796 = var150.field2796 * 32 / var150.field2755;
                    }
                    Statics.method1777(var150);
                } else if (var147 == -1) {
                    var150.field2785 = 0;
                    field346 = -1;
                    return true;
                } else {
                    class52 var151 = Statics.method975(var147);
                    var150.field2785 = 4;
                    var150.field2786 = var147;
                    var150.field2793 = var151.field1162;
                    var150.field2794 = var151.field1128;
                    var150.field2796 = var151.field1126 * 100 / var149;
                    Statics.method1777(var150);
                }
                field346 = -1;
                return true;
            }
            if (field346 == 108) {
                int var153 = field482.method2543();
                Statics.field2160 = Statics.field2245.method2712(var153);
                field346 = -1;
                return true;
            }
            if (field346 == 118) {
                int var154 = field482.method2510();
                int var155 = field482.method2397();
                class176.field2899[var155] = var154;
                if (class176.field2900[var155] != var154) {
                    class176.field2900[var155] = var154;
                    method961(var155);
                }
                field483[++field484 - 1 & 0x1F] = var155;
                field346 = -1;
                return true;
            }
            if (field346 == 201) {
                for (int var156 = 0; var156 < Statics.field1164; var156++) {
                    class53 var157 = Statics.method146(var156);
                    if (var157 != null) {
                        class176.field2899[var156] = 0;
                        class176.field2900[var156] = 0;
                    }
                }
                method2632();
                field484 += 32;
                field346 = -1;
                return true;
            }
            if (field346 == 105) {
                int var158 = field482.method2543();
                int var159 = field482.method2348();
                class4 var160 = (class4) field458.method3532((long) var159);
                class4 var161 = (class4) field458.method3532((long) var158);
                if (var161 != null) {
                    method3227(var161, var160 == null || var160.field62 != var161.field62);
                }
                if (var160 != null) {
                    var160.method3665();
                    field458.method3534(var160, (long) var158);
                }
                class173 var162 = class173.method2297(var159);
                if (var162 != null) {
                    Statics.method1777(var162);
                }
                class173 var163 = class173.method2297(var158);
                if (var163 != null) {
                    Statics.method1777(var163);
                    method2640(Statics.field2803[var163.field2744 >>> 16], var163, true);
                }
                if (field457 != -1) {
                    Statics.method2920(field457, 1);
                }
                field346 = -1;
                return true;
            }
            if (field346 == 4) {
                method2632();
                field358 = field482.method2363();
                field328 = field302;
                field346 = -1;
                return true;
            }
            if (field346 == 63 || field346 == 88 || field346 == 12 || field346 == 171 || field346 == 246 || field346 == 48 || field346 == 234 || field346 == 205 || field346 == 28 || field346 == 142) {
                method93();
                field346 = -1;
                return true;
            }
            if (field346 == 153) {
                for (int var164 = 0; var164 < field296.length; var164++) {
                    if (field296[var164] != null) {
                        field296[var164].field848 = -1;
                    }
                }
                for (int var165 = 0; var165 < field512.length; var165++) {
                    if (field512[var165] != null) {
                        field512[var165].field848 = -1;
                    }
                }
                field346 = -1;
                return true;
            }
            if (field346 == 92) {
                boolean var166 = field482.method2363() == 1;
                if (var166) {
                    Statics.field695 = class115.method645() - field482.method2398();
                    Statics.field161 = new class221(field482, true);
                } else {
                    Statics.field161 = null;
                }
                field331 = field302;
                field346 = -1;
                return true;
            }
            if (field346 == 66) {
                field482.field1994 += 28;
                if (field482.method2393()) {
                    class122 var167 = field482;
                    int var168 = field482.field1994 - 28;
                    if (class149.field2220 != null) {
                        try {
                            class149.field2220.method3868(0L);
                            class149.field2220.method3867(var167.field2000, var168, 24);
                        } catch (Exception var493) {
                        }
                    }
                }
                field346 = -1;
                return true;
            }
            if (field346 == 125) {
                int var170 = field482.method2409();
                if (var170 == 65535) {
                    var170 = -1;
                }
                int var171 = field482.method2368();
                int var172 = field482.method2510();
                int var173 = field482.method2353();
                if (var173 == 65535) {
                    var173 = -1;
                }
                for (int var174 = var173; var174 <= var170; var174++) {
                    long var175 = ((long) var172 << 32) + (long) var174;
                    class208 var177 = field499.method3532(var175);
                    if (var177 != null) {
                        var177.method3665();
                    }
                    field499.method3534(new class201(var171), var175);
                }
                field346 = -1;
                return true;
            }
            if (field346 == 184) {
                field531 = field482.method2363();
                if (field531 == 255) {
                    field531 = 0;
                }
                field532 = field482.method2363();
                if (field532 == 255) {
                    field532 = 0;
                }
                field346 = -1;
                return true;
            }
            if (field346 == 16) {
                class122 var178 = field482;
                int var179 = field345;
                class210 var180 = new class210();
                var180.field3117 = var178.method2363();
                var180.field3110 = var178.method2368();
                var180.field3111 = new int[var180.field3117];
                var180.field3112 = new int[var180.field3117];
                var180.field3113 = new Field[var180.field3117];
                var180.field3114 = new int[var180.field3117];
                var180.field3115 = new Method[var180.field3117];
                var180.field3116 = new byte[var180.field3117][][];
                for (int var181 = 0; var181 < var180.field3117; var181++) {
                    try {
                        int var182 = var178.method2363();
                        if (var182 == 0 || var182 == 1 || var182 == 2) {
                            String var183 = var178.method2365();
                            String var184 = var178.method2365();
                            int var185 = 0;
                            if (var182 == 1) {
                                var185 = var178.method2368();
                            }
                            var180.field3111[var181] = var182;
                            var180.field3114[var181] = var185;
                            if (class211.method3149(var183).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var180.field3113[var181] = class211.method3149(var183).getDeclaredField(var184);
                        } else if (var182 == 3 || var182 == 4) {
                            String var186 = var178.method2365();
                            String var187 = var178.method2365();
                            int var188 = var178.method2363();
                            String[] var189 = new String[var188];
                            for (int var190 = 0; var190 < var188; var190++) {
                                var189[var190] = var178.method2365();
                            }
                            String var191 = var178.method2365();
                            byte[][] var192 = new byte[var188][];
                            if (var182 == 3) {
                                for (int var193 = 0; var193 < var188; var193++) {
                                    int var194 = var178.method2368();
                                    var192[var193] = new byte[var194];
                                    var178.method2477(var192[var193], 0, var194);
                                }
                            }
                            var180.field3111[var181] = var182;
                            Class[] var195 = new Class[var188];
                            for (int var196 = 0; var196 < var188; var196++) {
                                var195[var196] = class211.method3149(var189[var196]);
                            }
                            Class var197 = class211.method3149(var191);
                            if (class211.method3149(var186).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var198 = class211.method3149(var186).getDeclaredMethods();
                            Method[] var199 = var198;
                            for (int var200 = 0; var200 < var199.length; var200++) {
                                Method var201 = var199[var200];
                                if (var201.getName().equals(var187)) {
                                    Class[] var202 = var201.getParameterTypes();
                                    if (var195.length == var202.length) {
                                        boolean var203 = true;
                                        for (int var204 = 0; var204 < var195.length; var204++) {
                                            if (var195[var204] != var202[var204]) {
                                                var203 = false;
                                                break;
                                            }
                                        }
                                        if (var203 && var197 == var201.getReturnType()) {
                                            var180.field3115[var181] = var201;
                                        }
                                    }
                                }
                            }
                            var180.field3116[var181] = var192;
                        }
                    } catch (ClassNotFoundException var497) {
                        var180.field3112[var181] = -1;
                    } catch (SecurityException var498) {
                        var180.field3112[var181] = -2;
                    } catch (NullPointerException var499) {
                        var180.field3112[var181] = -3;
                    } catch (Exception var500) {
                        var180.field3112[var181] = -4;
                    } catch (Throwable var501) {
                        var180.field3112[var181] = -5;
                    }
                }
                class211.field3121.method3607(var180);
                field346 = -1;
                return true;
            }
            if (field346 == 120) {
                class26 var210 = new class26();
                var210.field642 = field482.method2365();
                var210.field647 = field482.method2353();
                int var211 = field482.method2368();
                var210.field646 = var211;
                method3288(45);
                Statics.field280.method2817();
                Statics.field280 = null;
                class32.method2795(var210);
                field346 = -1;
                return false;
            }
            if (field346 == 226) {
                method2632();
                field431 = field482.method2507();
                field328 = field302;
                field346 = -1;
                return true;
            }
            if (field346 == 83) {
                String var212 = field482.method2365();
                int var213 = field482.method2510();
                class173 var214 = class173.method2297(var213);
                if (!var212.equals(var214.field2826)) {
                    var214.field2826 = var212;
                    Statics.method1777(var214);
                }
                field346 = -1;
                return true;
            }
            if (field346 == 54) {
                int var215 = field482.method2510();
                int var216 = field482.method2409();
                class173 var217 = class173.method2297(var215);
                if (var217.field2785 != 2 || var217.field2786 != var216) {
                    var217.field2785 = 2;
                    var217.field2786 = var216;
                    Statics.method1777(var217);
                }
                field346 = -1;
                return true;
            }
            if (field346 == 3) {
                int var218 = field482.method2348();
                int var219 = field482.method2353();
                class173 var220 = class173.method2297(var218);
                if (var220 != null && var220.field2746 == 0) {
                    if (var219 > var220.field2768 - var220.field2782) {
                        var219 = var220.field2768 - var220.field2782;
                    }
                    if (var219 < 0) {
                        var219 = 0;
                    }
                    if (var220.field2766 != var219) {
                        var220.field2766 = var219;
                        Statics.method1777(var220);
                    }
                }
                field346 = -1;
                return true;
            }
            if (field346 == 11) {
                int var221 = field482.method2363();
                if (field482.method2363() == 0) {
                    field573[var221] = new class220();
                    field482.field1994 += 18;
                } else {
                    field482.field1994--;
                    field573[var221] = new class220(field482, false);
                }
                field492 = field302;
                field346 = -1;
                return true;
            }
            if (field346 == 239) {
                if (field457 != -1) {
                    Statics.method2920(field457, 0);
                }
                field346 = -1;
                return true;
            }
            if (field346 == 143) {
                class33.field751 = 0;
                for (int var222 = 0; var222 < 2048; var222++) {
                    class33.field755[var222] = null;
                    class33.field766[var222] = 1;
                }
                for (int var223 = 0; var223 < 2048; var223++) {
                    field296[var223] = null;
                }
                class33.method3166(field482);
                field346 = -1;
                return true;
            }
            if (field346 == 79) {
                boolean var224 = field482.method2366() == 1;
                int var225 = field482.method2368();
                class173 var226 = class173.method2297(var225);
                if (var226.field2764 != var224) {
                    var226.field2764 = var224;
                    Statics.method1777(var226);
                }
                field346 = -1;
                return true;
            }
            if (field346 == 139) {
                field415 = field482.method2363();
                field438 = field482.method2363();
                field346 = -1;
                return true;
            }
            if (field346 == 127) {
                field565 = 1;
                field487 = field302;
                field346 = -1;
                return true;
            }
            if (field346 == 209) {
                String var227 = field482.method2365();
                long var228 = (long) field482.method2353();
                long var230 = (long) field482.method2414();
                class152[] var232 = new class152[] { class152.field2250, class152.field2248, class152.field2249, class152.field2246, class152.field2247 };
                class152 var233 = (class152) class109.method2796(var232, field482.method2363());
                long var234 = (var228 << 32) + var230;
                boolean var236 = false;
                for (int var237 = 0; var237 < 100; var237++) {
                    if (field518[var237] == var234) {
                        var236 = true;
                        break;
                    }
                }
                if (method2149(var227)) {
                    var236 = true;
                }
                if (!var236 && field419 == 0) {
                    field518[field519] = var234;
                    field519 = (field519 + 1) % 100;
                    class122 var238 = field482;
                    String var242;
                    try {
                        int var239 = var238.method2376();
                        if (var239 > 32767) {
                            var239 = 32767;
                        }
                        byte[] var240 = new byte[var239];
                        var238.field1994 += Statics.field3168.method2289(var238.field2000, var238.field1994, var240, 0, var239);
                        String var241 = Statics.method2934(var240, 0, var239);
                        var242 = var241;
                    } catch (Exception var492) {
                        var242 = "Cabbage";
                    }
                    String var245 = class223.method3774(class163.method2056(var242));
                    byte var246;
                    if (var233.field2253) {
                        var246 = 7;
                    } else {
                        var246 = 3;
                    }
                    if (var233.field2252 == -1) {
                        class12.method3488(var246, var227, var245);
                    } else {
                        int var248 = var233.field2252;
                        String var249 = "<img=" + var248 + ">";
                        class12.method3488(var246, var249 + var227, var245);
                    }
                }
                field346 = -1;
                return true;
            }
            if (field346 == 136) {
                byte var250 = field482.method2364();
                int var251 = field482.method2499();
                class176.field2899[var251] = var250;
                if (class176.field2900[var251] != var250) {
                    class176.field2900[var251] = var250;
                    method961(var251);
                }
                field483[++field484 - 1 & 0x1F] = var251;
                field346 = -1;
                return true;
            }
            if (field346 == 31) {
                method2298(true);
                field482.method2600();
                int var252 = field482.method2353();
                class122 var253 = field482;
                int var254 = var253.field1994;
                class33.field763 = 0;
                int var255 = 0;
                var253.method2601();
                for (int var256 = 0; var256 < class33.field751; var256++) {
                    int var257 = class33.field752[var256];
                    if ((class33.field753[var257] & 0x1) == 0) {
                        if (var255 > 0) {
                            var255--;
                            class33.field753[var257] = (byte) (class33.field753[var257] | 0x2);
                        } else {
                            int var258 = var253.method2602(1);
                            if (var258 == 0) {
                                var255 = class33.method2924(var253);
                                class33.field753[var257] = (byte) (class33.field753[var257] | 0x2);
                            } else {
                                class33.method159(var253, var257);
                            }
                        }
                    }
                }
                var253.method2603();
                if (var255 != 0) {
                    throw new RuntimeException();
                }
                var253.method2601();
                for (int var259 = 0; var259 < class33.field751; var259++) {
                    int var260 = class33.field752[var259];
                    if ((class33.field753[var260] & 0x1) != 0) {
                        if (var255 > 0) {
                            var255--;
                            class33.field753[var260] = (byte) (class33.field753[var260] | 0x2);
                        } else {
                            int var261 = var253.method2602(1);
                            if (var261 == 0) {
                                var255 = class33.method2924(var253);
                                class33.field753[var260] = (byte) (class33.field753[var260] | 0x2);
                            } else {
                                class33.method159(var253, var260);
                            }
                        }
                    }
                }
                var253.method2603();
                if (var255 != 0) {
                    throw new RuntimeException();
                }
                var253.method2601();
                for (int var262 = 0; var262 < class33.field758; var262++) {
                    int var263 = class33.field770[var262];
                    if ((class33.field753[var263] & 0x1) != 0) {
                        if (var255 > 0) {
                            var255--;
                            class33.field753[var263] = (byte) (class33.field753[var263] | 0x2);
                        } else {
                            int var264 = var253.method2602(1);
                            if (var264 == 0) {
                                var255 = class33.method2924(var253);
                                class33.field753[var263] = (byte) (class33.field753[var263] | 0x2);
                            } else if (class33.method253(var253, var263)) {
                                class33.field753[var263] = (byte) (class33.field753[var263] | 0x2);
                            }
                        }
                    }
                }
                var253.method2603();
                if (var255 != 0) {
                    throw new RuntimeException();
                }
                var253.method2601();
                for (int var265 = 0; var265 < class33.field758; var265++) {
                    int var266 = class33.field770[var265];
                    if ((class33.field753[var266] & 0x1) == 0) {
                        if (var255 > 0) {
                            var255--;
                            class33.field753[var266] = (byte) (class33.field753[var266] | 0x2);
                        } else {
                            int var267 = var253.method2602(1);
                            if (var267 == 0) {
                                var255 = class33.method2924(var253);
                                class33.field753[var266] = (byte) (class33.field753[var266] | 0x2);
                            } else if (class33.method253(var253, var266)) {
                                class33.field753[var266] = (byte) (class33.field753[var266] | 0x2);
                            }
                        }
                    }
                }
                var253.method2603();
                if (var255 != 0) {
                    throw new RuntimeException();
                }
                class33.field751 = 0;
                class33.field758 = 0;
                for (int var268 = 1; var268 < 2048; var268++) {
                    class33.field753[var268] = (byte) (class33.field753[var268] >> 1);
                    class3 var269 = field296[var268];
                    if (var269 == null) {
                        class33.field770[++class33.field758 - 1] = var268;
                    } else {
                        class33.field752[++class33.field751 - 1] = var268;
                    }
                }
                for (int var270 = 0; var270 < class33.field763; var270++) {
                    int var271 = class33.field764[var270];
                    class3 var272 = field296[var271];
                    int var273 = var253.method2363();
                    if ((var273 & 0x10) != 0) {
                        var273 += var253.method2363() << 8;
                    }
                    byte var274 = -1;
                    if ((var273 & 0x40) != 0) {
                        int var275 = var253.method2363();
                        byte[] var276 = new byte[var275];
                        class119 var277 = new class119(var276);
                        var253.method2477(var276, 0, var275);
                        class33.field755[var271] = var277;
                        var272.method20(var277);
                    }
                    if ((var273 & 0x20) != 0) {
                        int var278 = var253.method2353();
                        if (var278 == 65535) {
                            var278 = -1;
                        }
                        int var279 = var253.method2363();
                        method103(var272, var278, var279);
                    }
                    if ((var273 & 0x4) != 0) {
                        var272.field841 = var253.method2353();
                        if (var272.field841 == 65535) {
                            var272.field841 = -1;
                        }
                    }
                    if ((var273 & 0x80) != 0) {
                        var272.field830 = var253.method2365();
                        if (var272.field830.charAt(0) == '~') {
                            var272.field830 = var272.field830.substring(1);
                            class12.method3488(2, var272.field52, var272.field830);
                        } else if (Statics.field2054 == var272) {
                            class12.method3488(2, var272.field52, var272.field830);
                        }
                        var272.field831 = false;
                        var272.field870 = 0;
                        var272.field835 = 0;
                        var272.field822 = 150;
                    }
                    if ((var273 & 0x1) != 0) {
                        int var280 = var253.method2353();
                        int var281 = var253.method2363();
                        var272.method738(var280, var281, field577);
                        var272.field839 = field577 + 300;
                        var272.field840 = var253.method2363();
                        var272.field823 = var253.method2363();
                    }
                    if ((var273 & 0x2) != 0) {
                        var272.field833 = var253.method2353();
                        if (var272.field857 == 0) {
                            var272.field867 = var272.field833;
                            var272.field833 = -1;
                        }
                    }
                    if ((var273 & 0x8) != 0) {
                        int var282 = var253.method2353();
                        class152[] var283 = new class152[] { class152.field2250, class152.field2248, class152.field2249, class152.field2246, class152.field2247 };
                        class152 var284 = (class152) class109.method2796(var283, var253.method2363());
                        boolean var285 = var253.method2363() == 1;
                        int var286 = var253.method2363();
                        int var287 = var253.field1994;
                        if (var272.field52 != null && var272.field50 != null) {
                            boolean var288 = false;
                            if (var284.field2254 && method2149(var272.field52)) {
                                var288 = true;
                            }
                            if (!var288 && field419 == 0 && !var272.field49) {
                                class33.field765.field1994 = 0;
                                var253.method2477(class33.field765.field2000, 0, var286);
                                class33.field765.field1994 = 0;
                                class119 var289 = class33.field765;
                                String var293;
                                try {
                                    int var290 = var289.method2376();
                                    if (var290 > 32767) {
                                        var290 = 32767;
                                    }
                                    byte[] var291 = new byte[var290];
                                    var289.field1994 += Statics.field3168.method2289(var289.field2000, var289.field1994, var291, 0, var290);
                                    String var292 = Statics.method2934(var291, 0, var290);
                                    var293 = var292;
                                } catch (Exception var491) {
                                    var293 = "Cabbage";
                                }
                                String var296 = class223.method3774(class163.method2056(var293));
                                var272.field830 = var296.trim();
                                var272.field870 = var282 >> 8;
                                var272.field835 = var282 & 0xFF;
                                var272.field822 = 150;
                                var272.field831 = var285;
                                var272.field844 = Statics.field2054 != var272 && var284.field2254 && field517 != "" && var296.toLowerCase().indexOf(field517) == -1;
                                int var297;
                                if (var284.field2253) {
                                    var297 = var285 ? 91 : 1;
                                } else {
                                    var297 = var285 ? 90 : 2;
                                }
                                if (var284.field2252 == -1) {
                                    class12.method3488(var297, var272.field52, var296);
                                } else {
                                    int var299 = var284.field2252;
                                    String var300 = "<img=" + var299 + ">";
                                    class12.method3488(var297, var300 + var272.field52, var296);
                                }
                            }
                        }
                        var253.field1994 = var286 + var287;
                    }
                    if ((var273 & 0x800) != 0) {
                        var272.field853 = var253.method2353();
                        int var301 = var253.method2368();
                        var272.field843 = var301 >> 16;
                        var272.field856 = (var301 & 0xFFFF) + field577;
                        var272.field854 = 0;
                        var272.field855 = 0;
                        if (var272.field856 > field577) {
                            var272.field854 = -1;
                        }
                        if (var272.field853 == 65535) {
                            var272.field853 = -1;
                        }
                    }
                    if ((var273 & 0x400) != 0) {
                        var272.field845 = var253.method2364();
                        var272.field860 = var253.method2364();
                        var272.field859 = var253.method2364();
                        var272.field861 = var253.method2364();
                        var272.field865 = var253.method2353() + field577;
                        var272.field829 = var253.method2353() + field577;
                        var272.field864 = var253.method2353();
                        if (var272.field40) {
                            var272.field845 += var272.field41;
                            var272.field860 += var272.field54;
                            var272.field859 += var272.field41;
                            var272.field861 += var272.field54;
                            var272.field857 = 0;
                        } else {
                            var272.field845 += var272.field827[0];
                            var272.field860 += var272.field872[0];
                            var272.field859 += var272.field827[0];
                            var272.field861 += var272.field872[0];
                            var272.field857 = 1;
                        }
                        var272.field877 = 0;
                    }
                    if ((var273 & 0x100) != 0) {
                        int var302 = var253.method2353();
                        int var303 = var253.method2363();
                        var272.method738(var302, var303, field577);
                        var272.field839 = field577 + 300;
                        var272.field840 = var253.method2363();
                        var272.field823 = var253.method2363();
                    }
                    if ((var273 & 0x200) != 0) {
                        class33.field766[var271] = var253.method2364();
                    }
                    if ((var273 & 0x2000) != 0) {
                        var274 = var253.method2364();
                    }
                    if ((var273 & 0x1000) != 0) {
                        for (int var304 = 0; var304 < 3; var304++) {
                            var272.field29[var304] = var253.method2365();
                        }
                    }
                    if (var272.field40) {
                        if (var274 == 127) {
                            var272.method18(var272.field41, var272.field54);
                        } else {
                            byte var305;
                            if (var274 == -1) {
                                var305 = class33.field766[var271];
                            } else {
                                var305 = var274;
                            }
                            var272.method36(var272.field41, var272.field54, var305);
                        }
                    }
                }
                if (var253.field1994 - var254 != var252) {
                    throw new RuntimeException(var253.field1994 - var254 + " " + var252);
                }
                field346 = -1;
                return true;
            }
            if (field346 == 212) {
                method2632();
                int var306 = field482.method2363();
                int var307 = field482.method2510();
                int var308 = field482.method2366();
                field436[var308] = var307;
                field382[var308] = var306;
                field435[var308] = 1;
                for (int var309 = 0; var309 < 98; var309++) {
                    if (var307 >= class155.field2281[var309]) {
                        field435[var308] = var309 + 2;
                    }
                }
                field498[++field488 - 1 & 0x1F] = var308;
                field346 = -1;
                return true;
            }
            if (field346 == 195) {
                int var310 = field482.method2353();
                field457 = var310;
                method2042(false);
                method1959(var310);
                class37.method1776(field457);
                for (int var311 = 0; var311 < 100; var311++) {
                    field502[var311] = true;
                }
                field346 = -1;
                return true;
            }
            if (field346 == 35) {
                class122 var312 = field482;
                int var313 = field345;
                int var314 = var312.field1994;
                class33.field763 = 0;
                int var315 = 0;
                var312.method2601();
                for (int var316 = 0; var316 < class33.field751; var316++) {
                    int var317 = class33.field752[var316];
                    if ((class33.field753[var317] & 0x1) == 0) {
                        if (var315 > 0) {
                            var315--;
                            class33.field753[var317] = (byte) (class33.field753[var317] | 0x2);
                        } else {
                            int var318 = var312.method2602(1);
                            if (var318 == 0) {
                                var315 = class33.method2924(var312);
                                class33.field753[var317] = (byte) (class33.field753[var317] | 0x2);
                            } else {
                                class33.method159(var312, var317);
                            }
                        }
                    }
                }
                var312.method2603();
                if (var315 != 0) {
                    throw new RuntimeException();
                }
                var312.method2601();
                for (int var319 = 0; var319 < class33.field751; var319++) {
                    int var320 = class33.field752[var319];
                    if ((class33.field753[var320] & 0x1) != 0) {
                        if (var315 > 0) {
                            var315--;
                            class33.field753[var320] = (byte) (class33.field753[var320] | 0x2);
                        } else {
                            int var321 = var312.method2602(1);
                            if (var321 == 0) {
                                var315 = class33.method2924(var312);
                                class33.field753[var320] = (byte) (class33.field753[var320] | 0x2);
                            } else {
                                class33.method159(var312, var320);
                            }
                        }
                    }
                }
                var312.method2603();
                if (var315 != 0) {
                    throw new RuntimeException();
                }
                var312.method2601();
                for (int var322 = 0; var322 < class33.field758; var322++) {
                    int var323 = class33.field770[var322];
                    if ((class33.field753[var323] & 0x1) != 0) {
                        if (var315 > 0) {
                            var315--;
                            class33.field753[var323] = (byte) (class33.field753[var323] | 0x2);
                        } else {
                            int var324 = var312.method2602(1);
                            if (var324 == 0) {
                                var315 = class33.method2924(var312);
                                class33.field753[var323] = (byte) (class33.field753[var323] | 0x2);
                            } else if (class33.method253(var312, var323)) {
                                class33.field753[var323] = (byte) (class33.field753[var323] | 0x2);
                            }
                        }
                    }
                }
                var312.method2603();
                if (var315 != 0) {
                    throw new RuntimeException();
                }
                var312.method2601();
                for (int var325 = 0; var325 < class33.field758; var325++) {
                    int var326 = class33.field770[var325];
                    if ((class33.field753[var326] & 0x1) == 0) {
                        if (var315 > 0) {
                            var315--;
                            class33.field753[var326] = (byte) (class33.field753[var326] | 0x2);
                        } else {
                            int var327 = var312.method2602(1);
                            if (var327 == 0) {
                                var315 = class33.method2924(var312);
                                class33.field753[var326] = (byte) (class33.field753[var326] | 0x2);
                            } else if (class33.method253(var312, var326)) {
                                class33.field753[var326] = (byte) (class33.field753[var326] | 0x2);
                            }
                        }
                    }
                }
                var312.method2603();
                if (var315 != 0) {
                    throw new RuntimeException();
                }
                class33.field751 = 0;
                class33.field758 = 0;
                for (int var328 = 1; var328 < 2048; var328++) {
                    class33.field753[var328] = (byte) (class33.field753[var328] >> 1);
                    class3 var329 = field296[var328];
                    if (var329 == null) {
                        class33.field770[++class33.field758 - 1] = var328;
                    } else {
                        class33.field752[++class33.field751 - 1] = var328;
                    }
                }
                for (int var330 = 0; var330 < class33.field763; var330++) {
                    int var331 = class33.field764[var330];
                    class3 var332 = field296[var331];
                    int var333 = var312.method2363();
                    if ((var333 & 0x10) != 0) {
                        var333 += var312.method2363() << 8;
                    }
                    byte var334 = -1;
                    if ((var333 & 0x40) != 0) {
                        int var335 = var312.method2363();
                        byte[] var336 = new byte[var335];
                        class119 var337 = new class119(var336);
                        var312.method2477(var336, 0, var335);
                        class33.field755[var331] = var337;
                        var332.method20(var337);
                    }
                    if ((var333 & 0x20) != 0) {
                        int var338 = var312.method2353();
                        if (var338 == 65535) {
                            var338 = -1;
                        }
                        int var339 = var312.method2363();
                        method103(var332, var338, var339);
                    }
                    if ((var333 & 0x4) != 0) {
                        var332.field841 = var312.method2353();
                        if (var332.field841 == 65535) {
                            var332.field841 = -1;
                        }
                    }
                    if ((var333 & 0x80) != 0) {
                        var332.field830 = var312.method2365();
                        if (var332.field830.charAt(0) == '~') {
                            var332.field830 = var332.field830.substring(1);
                            class12.method3488(2, var332.field52, var332.field830);
                        } else if (Statics.field2054 == var332) {
                            class12.method3488(2, var332.field52, var332.field830);
                        }
                        var332.field831 = false;
                        var332.field870 = 0;
                        var332.field835 = 0;
                        var332.field822 = 150;
                    }
                    if ((var333 & 0x1) != 0) {
                        int var340 = var312.method2353();
                        int var341 = var312.method2363();
                        var332.method738(var340, var341, field577);
                        var332.field839 = field577 + 300;
                        var332.field840 = var312.method2363();
                        var332.field823 = var312.method2363();
                    }
                    if ((var333 & 0x2) != 0) {
                        var332.field833 = var312.method2353();
                        if (var332.field857 == 0) {
                            var332.field867 = var332.field833;
                            var332.field833 = -1;
                        }
                    }
                    if ((var333 & 0x8) != 0) {
                        int var342 = var312.method2353();
                        class152[] var343 = new class152[] { class152.field2250, class152.field2248, class152.field2249, class152.field2246, class152.field2247 };
                        class152 var344 = (class152) class109.method2796(var343, var312.method2363());
                        boolean var345 = var312.method2363() == 1;
                        int var346 = var312.method2363();
                        int var347 = var312.field1994;
                        if (var332.field52 != null && var332.field50 != null) {
                            boolean var348 = false;
                            if (var344.field2254 && method2149(var332.field52)) {
                                var348 = true;
                            }
                            if (!var348 && field419 == 0 && !var332.field49) {
                                class33.field765.field1994 = 0;
                                var312.method2477(class33.field765.field2000, 0, var346);
                                class33.field765.field1994 = 0;
                                class119 var349 = class33.field765;
                                String var353;
                                try {
                                    int var350 = var349.method2376();
                                    if (var350 > 32767) {
                                        var350 = 32767;
                                    }
                                    byte[] var351 = new byte[var350];
                                    var349.field1994 += Statics.field3168.method2289(var349.field2000, var349.field1994, var351, 0, var350);
                                    String var352 = Statics.method2934(var351, 0, var350);
                                    var353 = var352;
                                } catch (Exception var490) {
                                    var353 = "Cabbage";
                                }
                                String var356 = class223.method3774(class163.method2056(var353));
                                var332.field830 = var356.trim();
                                var332.field870 = var342 >> 8;
                                var332.field835 = var342 & 0xFF;
                                var332.field822 = 150;
                                var332.field831 = var345;
                                var332.field844 = Statics.field2054 != var332 && var344.field2254 && field517 != "" && var356.toLowerCase().indexOf(field517) == -1;
                                int var357;
                                if (var344.field2253) {
                                    var357 = var345 ? 91 : 1;
                                } else {
                                    var357 = var345 ? 90 : 2;
                                }
                                if (var344.field2252 == -1) {
                                    class12.method3488(var357, var332.field52, var356);
                                } else {
                                    int var359 = var344.field2252;
                                    String var360 = "<img=" + var359 + ">";
                                    class12.method3488(var357, var360 + var332.field52, var356);
                                }
                            }
                        }
                        var312.field1994 = var346 + var347;
                    }
                    if ((var333 & 0x800) != 0) {
                        var332.field853 = var312.method2353();
                        int var361 = var312.method2368();
                        var332.field843 = var361 >> 16;
                        var332.field856 = (var361 & 0xFFFF) + field577;
                        var332.field854 = 0;
                        var332.field855 = 0;
                        if (var332.field856 > field577) {
                            var332.field854 = -1;
                        }
                        if (var332.field853 == 65535) {
                            var332.field853 = -1;
                        }
                    }
                    if ((var333 & 0x400) != 0) {
                        var332.field845 = var312.method2364();
                        var332.field860 = var312.method2364();
                        var332.field859 = var312.method2364();
                        var332.field861 = var312.method2364();
                        var332.field865 = var312.method2353() + field577;
                        var332.field829 = var312.method2353() + field577;
                        var332.field864 = var312.method2353();
                        if (var332.field40) {
                            var332.field845 += var332.field41;
                            var332.field860 += var332.field54;
                            var332.field859 += var332.field41;
                            var332.field861 += var332.field54;
                            var332.field857 = 0;
                        } else {
                            var332.field845 += var332.field827[0];
                            var332.field860 += var332.field872[0];
                            var332.field859 += var332.field827[0];
                            var332.field861 += var332.field872[0];
                            var332.field857 = 1;
                        }
                        var332.field877 = 0;
                    }
                    if ((var333 & 0x100) != 0) {
                        int var362 = var312.method2353();
                        int var363 = var312.method2363();
                        var332.method738(var362, var363, field577);
                        var332.field839 = field577 + 300;
                        var332.field840 = var312.method2363();
                        var332.field823 = var312.method2363();
                    }
                    if ((var333 & 0x200) != 0) {
                        class33.field766[var331] = var312.method2364();
                    }
                    if ((var333 & 0x2000) != 0) {
                        var334 = var312.method2364();
                    }
                    if ((var333 & 0x1000) != 0) {
                        for (int var364 = 0; var364 < 3; var364++) {
                            var332.field29[var364] = var312.method2365();
                        }
                    }
                    if (var332.field40) {
                        if (var334 == 127) {
                            var332.method18(var332.field41, var332.field54);
                        } else {
                            byte var365;
                            if (var334 == -1) {
                                var365 = class33.field766[var331];
                            } else {
                                var365 = var334;
                            }
                            var332.method36(var332.field41, var332.field54, var365);
                        }
                    }
                }
                if (var312.field1994 - var314 != var313) {
                    throw new RuntimeException(var312.field1994 - var314 + " " + var313);
                }
                field346 = -1;
                return true;
            }
            if (field346 == 167) {
                field384 = field482.method2353() * 30;
                field328 = field302;
                field346 = -1;
                return true;
            }
            if (field346 == 187) {
                String var366 = field482.method2365();
                int var367 = field482.method2353();
                byte var368 = field482.method2364();
                boolean var369 = false;
                if (var368 == -128) {
                    var369 = true;
                }
                if (var369) {
                    if (Statics.field245 == 0) {
                        field346 = -1;
                        return true;
                    }
                    boolean var370 = false;
                    int var371;
                    for (var371 = 0; var371 < Statics.field245 && (!Statics.field2075[var371].field636.equals(var366) || Statics.field2075[var371].field633 != var367); var371++) {
                    }
                    if (var371 < Statics.field245) {
                        while (var371 < Statics.field245 - 1) {
                            Statics.field2075[var371] = Statics.field2075[var371 + 1];
                            var371++;
                        }
                        Statics.field245--;
                        Statics.field2075[Statics.field245] = null;
                    }
                } else {
                    field482.method2365();
                    class25 var372 = new class25();
                    var372.field636 = var366;
                    var372.field632 = class164.method2754(var372.field636, Statics.field3198);
                    var372.field633 = var367;
                    var372.field634 = var368;
                    int var373;
                    for (var373 = Statics.field245 - 1; var373 >= 0; var373--) {
                        int var374 = Statics.field2075[var373].field632.compareTo(var372.field632);
                        if (var374 == 0) {
                            Statics.field2075[var373].field633 = var367;
                            Statics.field2075[var373].field634 = var368;
                            if (var366.equals(Statics.field2054.field52)) {
                                Statics.field1044 = var368;
                            }
                            field491 = field302;
                            field346 = -1;
                            return true;
                        }
                        if (var374 < 0) {
                            break;
                        }
                    }
                    if (Statics.field245 >= Statics.field2075.length) {
                        field346 = -1;
                        return true;
                    }
                    for (int var375 = Statics.field245 - 1; var375 > var373; var375--) {
                        Statics.field2075[var375 + 1] = Statics.field2075[var375];
                    }
                    if (Statics.field245 == 0) {
                        Statics.field2075 = new class25[100];
                    }
                    Statics.field2075[var373 + 1] = var372;
                    Statics.field245++;
                    if (var366.equals(Statics.field2054.field52)) {
                        Statics.field1044 = var368;
                    }
                }
                field491 = field302;
                field346 = -1;
                return true;
            }
            if (field346 == 200) {
                for (int var376 = 0; var376 < class176.field2900.length; var376++) {
                    if (class176.field2900[var376] != class176.field2899[var376]) {
                        class176.field2900[var376] = class176.field2899[var376];
                        method961(var376);
                        field483[++field484 - 1 & 0x1F] = var376;
                    }
                }
                field346 = -1;
                return true;
            }
            if (field346 == 112) {
                int var377 = field482.method2510();
                int var378 = field482.method2409();
                int var379 = var378 >> 10 & 0x1F;
                int var380 = var378 >> 5 & 0x1F;
                int var381 = var378 & 0x1F;
                int var382 = (var381 << 3) + (var379 << 19) + (var380 << 11);
                class173 var383 = class173.method2297(var377);
                if (var383.field2769 != var382) {
                    var383.field2769 = var382;
                    Statics.method1777(var383);
                }
                field346 = -1;
                return true;
            }
            if (field346 == 76) {
                int var384 = field482.method2376();
                boolean var385 = field482.method2363() == 1;
                String var386 = "";
                boolean var387 = false;
                if (var385) {
                    var386 = field482.method2365();
                    if (method2149(var386)) {
                        var387 = true;
                    }
                }
                String var388 = field482.method2365();
                if (!var387) {
                    class12.method3488(var384, var386, var388);
                }
                field346 = -1;
                return true;
            }
            if (field346 == 43) {
                int var389 = field482.method2348();
                class173 var390 = class173.method2297(var389);
                for (int var391 = 0; var391 < var390.field2860.length; var391++) {
                    var390.field2860[var391] = -1;
                    var390.field2860[var391] = 0;
                }
                Statics.method1777(var390);
                field346 = -1;
                return true;
            }
            if (field346 == 129) {
                method2298(false);
                field482.method2600();
                int var392 = field482.method2353();
                class122 var393 = field482;
                int var394 = var393.field1994;
                class33.field763 = 0;
                int var395 = 0;
                var393.method2601();
                for (int var396 = 0; var396 < class33.field751; var396++) {
                    int var397 = class33.field752[var396];
                    if ((class33.field753[var397] & 0x1) == 0) {
                        if (var395 > 0) {
                            var395--;
                            class33.field753[var397] = (byte) (class33.field753[var397] | 0x2);
                        } else {
                            int var398 = var393.method2602(1);
                            if (var398 == 0) {
                                var395 = class33.method2924(var393);
                                class33.field753[var397] = (byte) (class33.field753[var397] | 0x2);
                            } else {
                                class33.method159(var393, var397);
                            }
                        }
                    }
                }
                var393.method2603();
                if (var395 != 0) {
                    throw new RuntimeException();
                }
                var393.method2601();
                for (int var399 = 0; var399 < class33.field751; var399++) {
                    int var400 = class33.field752[var399];
                    if ((class33.field753[var400] & 0x1) != 0) {
                        if (var395 > 0) {
                            var395--;
                            class33.field753[var400] = (byte) (class33.field753[var400] | 0x2);
                        } else {
                            int var401 = var393.method2602(1);
                            if (var401 == 0) {
                                var395 = class33.method2924(var393);
                                class33.field753[var400] = (byte) (class33.field753[var400] | 0x2);
                            } else {
                                class33.method159(var393, var400);
                            }
                        }
                    }
                }
                var393.method2603();
                if (var395 != 0) {
                    throw new RuntimeException();
                }
                var393.method2601();
                for (int var402 = 0; var402 < class33.field758; var402++) {
                    int var403 = class33.field770[var402];
                    if ((class33.field753[var403] & 0x1) != 0) {
                        if (var395 > 0) {
                            var395--;
                            class33.field753[var403] = (byte) (class33.field753[var403] | 0x2);
                        } else {
                            int var404 = var393.method2602(1);
                            if (var404 == 0) {
                                var395 = class33.method2924(var393);
                                class33.field753[var403] = (byte) (class33.field753[var403] | 0x2);
                            } else if (class33.method253(var393, var403)) {
                                class33.field753[var403] = (byte) (class33.field753[var403] | 0x2);
                            }
                        }
                    }
                }
                var393.method2603();
                if (var395 != 0) {
                    throw new RuntimeException();
                }
                var393.method2601();
                for (int var405 = 0; var405 < class33.field758; var405++) {
                    int var406 = class33.field770[var405];
                    if ((class33.field753[var406] & 0x1) == 0) {
                        if (var395 > 0) {
                            var395--;
                            class33.field753[var406] = (byte) (class33.field753[var406] | 0x2);
                        } else {
                            int var407 = var393.method2602(1);
                            if (var407 == 0) {
                                var395 = class33.method2924(var393);
                                class33.field753[var406] = (byte) (class33.field753[var406] | 0x2);
                            } else if (class33.method253(var393, var406)) {
                                class33.field753[var406] = (byte) (class33.field753[var406] | 0x2);
                            }
                        }
                    }
                }
                var393.method2603();
                if (var395 != 0) {
                    throw new RuntimeException();
                }
                class33.field751 = 0;
                class33.field758 = 0;
                for (int var408 = 1; var408 < 2048; var408++) {
                    class33.field753[var408] = (byte) (class33.field753[var408] >> 1);
                    class3 var409 = field296[var408];
                    if (var409 == null) {
                        class33.field770[++class33.field758 - 1] = var408;
                    } else {
                        class33.field752[++class33.field751 - 1] = var408;
                    }
                }
                for (int var410 = 0; var410 < class33.field763; var410++) {
                    int var411 = class33.field764[var410];
                    class3 var412 = field296[var411];
                    int var413 = var393.method2363();
                    if ((var413 & 0x10) != 0) {
                        var413 += var393.method2363() << 8;
                    }
                    byte var414 = -1;
                    if ((var413 & 0x40) != 0) {
                        int var415 = var393.method2363();
                        byte[] var416 = new byte[var415];
                        class119 var417 = new class119(var416);
                        var393.method2477(var416, 0, var415);
                        class33.field755[var411] = var417;
                        var412.method20(var417);
                    }
                    if ((var413 & 0x20) != 0) {
                        int var418 = var393.method2353();
                        if (var418 == 65535) {
                            var418 = -1;
                        }
                        int var419 = var393.method2363();
                        method103(var412, var418, var419);
                    }
                    if ((var413 & 0x4) != 0) {
                        var412.field841 = var393.method2353();
                        if (var412.field841 == 65535) {
                            var412.field841 = -1;
                        }
                    }
                    if ((var413 & 0x80) != 0) {
                        var412.field830 = var393.method2365();
                        if (var412.field830.charAt(0) == '~') {
                            var412.field830 = var412.field830.substring(1);
                            class12.method3488(2, var412.field52, var412.field830);
                        } else if (Statics.field2054 == var412) {
                            class12.method3488(2, var412.field52, var412.field830);
                        }
                        var412.field831 = false;
                        var412.field870 = 0;
                        var412.field835 = 0;
                        var412.field822 = 150;
                    }
                    if ((var413 & 0x1) != 0) {
                        int var420 = var393.method2353();
                        int var421 = var393.method2363();
                        var412.method738(var420, var421, field577);
                        var412.field839 = field577 + 300;
                        var412.field840 = var393.method2363();
                        var412.field823 = var393.method2363();
                    }
                    if ((var413 & 0x2) != 0) {
                        var412.field833 = var393.method2353();
                        if (var412.field857 == 0) {
                            var412.field867 = var412.field833;
                            var412.field833 = -1;
                        }
                    }
                    if ((var413 & 0x8) != 0) {
                        int var422 = var393.method2353();
                        class152[] var423 = new class152[] { class152.field2250, class152.field2248, class152.field2249, class152.field2246, class152.field2247 };
                        class152 var424 = (class152) class109.method2796(var423, var393.method2363());
                        boolean var425 = var393.method2363() == 1;
                        int var426 = var393.method2363();
                        int var427 = var393.field1994;
                        if (var412.field52 != null && var412.field50 != null) {
                            boolean var428 = false;
                            if (var424.field2254 && method2149(var412.field52)) {
                                var428 = true;
                            }
                            if (!var428 && field419 == 0 && !var412.field49) {
                                class33.field765.field1994 = 0;
                                var393.method2477(class33.field765.field2000, 0, var426);
                                class33.field765.field1994 = 0;
                                class119 var429 = class33.field765;
                                String var433;
                                try {
                                    int var430 = var429.method2376();
                                    if (var430 > 32767) {
                                        var430 = 32767;
                                    }
                                    byte[] var431 = new byte[var430];
                                    var429.field1994 += Statics.field3168.method2289(var429.field2000, var429.field1994, var431, 0, var430);
                                    String var432 = Statics.method2934(var431, 0, var430);
                                    var433 = var432;
                                } catch (Exception var489) {
                                    var433 = "Cabbage";
                                }
                                String var436 = class223.method3774(class163.method2056(var433));
                                var412.field830 = var436.trim();
                                var412.field870 = var422 >> 8;
                                var412.field835 = var422 & 0xFF;
                                var412.field822 = 150;
                                var412.field831 = var425;
                                var412.field844 = Statics.field2054 != var412 && var424.field2254 && field517 != "" && var436.toLowerCase().indexOf(field517) == -1;
                                int var437;
                                if (var424.field2253) {
                                    var437 = var425 ? 91 : 1;
                                } else {
                                    var437 = var425 ? 90 : 2;
                                }
                                if (var424.field2252 == -1) {
                                    class12.method3488(var437, var412.field52, var436);
                                } else {
                                    int var439 = var424.field2252;
                                    String var440 = "<img=" + var439 + ">";
                                    class12.method3488(var437, var440 + var412.field52, var436);
                                }
                            }
                        }
                        var393.field1994 = var426 + var427;
                    }
                    if ((var413 & 0x800) != 0) {
                        var412.field853 = var393.method2353();
                        int var441 = var393.method2368();
                        var412.field843 = var441 >> 16;
                        var412.field856 = (var441 & 0xFFFF) + field577;
                        var412.field854 = 0;
                        var412.field855 = 0;
                        if (var412.field856 > field577) {
                            var412.field854 = -1;
                        }
                        if (var412.field853 == 65535) {
                            var412.field853 = -1;
                        }
                    }
                    if ((var413 & 0x400) != 0) {
                        var412.field845 = var393.method2364();
                        var412.field860 = var393.method2364();
                        var412.field859 = var393.method2364();
                        var412.field861 = var393.method2364();
                        var412.field865 = var393.method2353() + field577;
                        var412.field829 = var393.method2353() + field577;
                        var412.field864 = var393.method2353();
                        if (var412.field40) {
                            var412.field845 += var412.field41;
                            var412.field860 += var412.field54;
                            var412.field859 += var412.field41;
                            var412.field861 += var412.field54;
                            var412.field857 = 0;
                        } else {
                            var412.field845 += var412.field827[0];
                            var412.field860 += var412.field872[0];
                            var412.field859 += var412.field827[0];
                            var412.field861 += var412.field872[0];
                            var412.field857 = 1;
                        }
                        var412.field877 = 0;
                    }
                    if ((var413 & 0x100) != 0) {
                        int var442 = var393.method2353();
                        int var443 = var393.method2363();
                        var412.method738(var442, var443, field577);
                        var412.field839 = field577 + 300;
                        var412.field840 = var393.method2363();
                        var412.field823 = var393.method2363();
                    }
                    if ((var413 & 0x200) != 0) {
                        class33.field766[var411] = var393.method2364();
                    }
                    if ((var413 & 0x2000) != 0) {
                        var414 = var393.method2364();
                    }
                    if ((var413 & 0x1000) != 0) {
                        for (int var444 = 0; var444 < 3; var444++) {
                            var412.field29[var444] = var393.method2365();
                        }
                    }
                    if (var412.field40) {
                        if (var414 == 127) {
                            var412.method18(var412.field41, var412.field54);
                        } else {
                            byte var445;
                            if (var414 == -1) {
                                var445 = class33.field766[var411];
                            } else {
                                var445 = var414;
                            }
                            var412.method36(var412.field41, var412.field54, var445);
                        }
                    }
                }
                if (var393.field1994 - var394 != var392) {
                    throw new RuntimeException(var393.field1994 - var394 + " " + var392);
                }
                field346 = -1;
                return true;
            }
            if (field346 == 85) {
                Statics.field1566 = field482.method2363();
                Statics.field700 = field482.method2445();
                field346 = -1;
                return true;
            }
            if (field346 == 180) {
                int var446 = field482.method2499();
                if (var446 == 65535) {
                    var446 = -1;
                }
                if (var446 == -1 && !field386) {
                    Statics.field3134.method3380();
                    class183.field2950 = 1;
                    Statics.field2947 = null;
                } else if (var446 != -1 && field535 != var446 && field299 != 0 && !field386) {
                    class183.method1534(2, Statics.field108, var446, 0, field299, false);
                }
                field535 = var446;
                field346 = -1;
                return true;
            }
            if (field346 == 155) {
                int var447 = field482.method2526();
                int var448 = field482.method2499();
                if (var448 == 65535) {
                    var448 = -1;
                }
                method2160(var448, var447);
                field346 = -1;
                return true;
            }
            if (field346 == 190) {
                int var449 = field482.method2368();
                int var450 = field482.method2368();
                if (Statics.field222 == null || !Statics.field222.isValid()) {
                    try {
                        Iterator var451 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var451.hasNext()) {
                            GarbageCollectorMXBean var452 = (GarbageCollectorMXBean) var451.next();
                            if (var452.isValid()) {
                                Statics.field222 = var452;
                                field575 = -1L;
                                field464 = -1L;
                            }
                        }
                    } catch (Throwable var496) {
                    }
                }
                long var454 = class115.method645();
                int var456 = -1;
                if (Statics.field222 != null) {
                    long var457 = Statics.field222.getCollectionTime();
                    if (field464 != -1L) {
                        long var459 = var457 - field464;
                        long var461 = var454 - field575;
                        if (var461 != 0L) {
                            var456 = (int) (var459 * 100L / var461);
                        }
                    }
                    field464 = var457;
                    field575 = var454;
                }
                field493.method2617(120);
                field493.method2514(var449);
                field493.method2351(var450);
                field493.method2392(var456);
                field493.method2386(field2184);
                field346 = -1;
                return true;
            }
            if (field346 == 137) {
                field494 = field482.method2363();
                field346 = -1;
                return true;
            }
            if (field346 == 27) {
                while (field482.field1994 < field345) {
                    int var463 = field482.method2363();
                    boolean var464 = (var463 & 0x1) == 1;
                    String var465 = field482.method2365();
                    String var466 = field482.method2365();
                    field482.method2365();
                    for (int var467 = 0; var467 < field568; var467++) {
                        class8 var468 = field468[var467];
                        if (var464) {
                            if (var466.equals(var468.field142)) {
                                var468.field142 = var465;
                                var468.field134 = var466;
                                var465 = null;
                                break;
                            }
                        } else if (var465.equals(var468.field142)) {
                            var468.field142 = var465;
                            var468.field134 = var466;
                            var465 = null;
                            break;
                        }
                    }
                    if (var465 != null && field568 < 400) {
                        class8 var469 = new class8();
                        field468[field568] = var469;
                        var469.field142 = var465;
                        var469.field134 = var466;
                        field568++;
                    }
                }
                field487 = field302;
                field346 = -1;
                return true;
            }
            if (field346 == 197) {
                int var470 = field482.method2368();
                int var471 = field482.method2353();
                if (var470 < -70000) {
                    var471 += 32768;
                }
                class173 var472;
                if (var470 >= 0) {
                    var472 = class173.method2297(var470);
                } else {
                    var472 = null;
                }
                if (var472 != null) {
                    for (int var473 = 0; var473 < var472.field2860.length; var473++) {
                        var472.field2860[var473] = 0;
                        var472.field2861[var473] = 0;
                    }
                }
                class16.method172(var471);
                int var474 = field482.method2353();
                for (int var475 = 0; var475 < var474; var475++) {
                    int var476 = field482.method2499();
                    int var477 = field482.method2390();
                    if (var477 == 255) {
                        var477 = field482.method2543();
                    }
                    if (var472 != null && var475 < var472.field2860.length) {
                        var472.field2860[var475] = var476;
                        var472.field2861[var475] = var477;
                    }
                    class16.method725(var471, var475, var476 - 1, var477);
                }
                if (var472 != null) {
                    Statics.method1777(var472);
                }
                method2632();
                field485[++field357 - 1 & 0x1F] = var471 & 0x7FFF;
                field346 = -1;
                return true;
            }
            if (field346 == 202) {
                field548 = true;
                Statics.field2047 = field482.method2363();
                Statics.field2031 = field482.method2363();
                Statics.field1755 = field482.method2353();
                Statics.field174 = field482.method2363();
                Statics.field654 = field482.method2363();
                if (Statics.field654 >= 100) {
                    int var478 = Statics.field2047 * 128 + 64;
                    int var479 = Statics.field2031 * 128 + 64;
                    int var480 = method226(var478, var479, Statics.field1961) - Statics.field1755;
                    int var481 = var478 - Statics.field2163;
                    int var482 = var480 - Statics.field2214;
                    int var483 = var479 - Statics.field55;
                    int var484 = (int) Math.sqrt((double) (var481 * var481 + var483 * var483));
                    Statics.field2137 = (int) (Math.atan2((double) var482, (double) var484) * 325.949D) & 0x7FF;
                    Statics.field83 = (int) (Math.atan2((double) var481, (double) var483) * -325.949D) & 0x7FF;
                    if (Statics.field2137 < 128) {
                        Statics.field2137 = 128;
                    }
                    if (Statics.field2137 > 383) {
                        Statics.field2137 = 383;
                    }
                }
                field346 = -1;
                return true;
            }
            class148.method1532("" + field346 + class2.field27 + field528 + class2.field27 + field351 + class2.field27 + field345, (Throwable) null);
            method2();
        } catch (IOException var502) {
            if (field352 > 0) {
                method2();
            } else {
                method3288(40);
                Statics.field3057 = Statics.field280;
                Statics.field280 = null;
            }
        } catch (Exception var503) {
            String var487 = "" + field346 + class2.field27 + field528 + class2.field27 + field351 + class2.field27 + field345 + class2.field27 + (Statics.field2576 + Statics.field2054.field827[0]) + class2.field27 + (Statics.field2133 + Statics.field2054.field872[0]) + class2.field27;
            for (int var488 = 0; var488 < field345 && var488 < 50; var488++) {
                var487 = var487 + field482.field2000[var488] + class2.field27;
            }
            class148.method1532(var487, var503);
            method2();
        }
        return true;
    }

    @ObfuscatedName("t.bl(I)V")
    public static final void method93() {
        if (field346 == 234) {
            int var0 = field482.method2353();
            int var1 = field482.method2445();
            int var2 = (var1 >> 4 & 0x7) + Statics.field1566;
            int var3 = (var1 & 0x7) + Statics.field700;
            int var4 = field482.method2397();
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class29 var5 = new class29();
                var5.field682 = var0;
                var5.field681 = var4;
                if (field430[Statics.field1961][var2][var3] == null) {
                    field430[Statics.field1961][var2][var3] = new class199();
                }
                field430[Statics.field1961][var2][var3].method3559(var5);
                method586(var2, var3);
            }
            return;
        }
        if (field346 == 63) {
            int var6 = field482.method2363();
            int var7 = (var6 >> 4 & 0x7) + Statics.field1566;
            int var8 = (var6 & 0x7) + Statics.field700;
            int var9 = field482.method2353();
            int var10 = field482.method2363();
            int var11 = var10 >> 4 & 0xF;
            int var12 = var10 & 0x7;
            int var13 = field482.method2363();
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                int var14 = var11 + 1;
                if (Statics.field2054.field827[0] >= var7 - var14 && Statics.field2054.field827[0] <= var7 + var14 && Statics.field2054.field872[0] >= var8 - var14 && Statics.field2054.field872[0] <= var8 + var14 && field538 != 0 && var12 > 0 && field539 < 50) {
                    field540[field539] = var9;
                    field397[field539] = var12;
                    field542[field539] = var13;
                    field547[field539] = null;
                    field543[field539] = (var7 << 16) + (var8 << 8) + var11;
                    field539++;
                }
            }
        }
        if (field346 == 246) {
            int var15 = field482.method2363();
            int var16 = (var15 >> 4 & 0x7) + Statics.field1566;
            int var17 = (var15 & 0x7) + Statics.field700;
            int var18 = var16 + field482.method2364();
            int var19 = var17 + field482.method2364();
            int var20 = field482.method2507();
            int var21 = field482.method2353();
            int var22 = field482.method2363() * 4;
            int var23 = field482.method2363() * 4;
            int var24 = field482.method2353();
            int var25 = field482.method2353();
            int var26 = field482.method2363();
            int var27 = field482.method2363();
            if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104 && var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104 && var21 != 65535) {
                int var28 = var16 * 128 + 64;
                int var29 = var17 * 128 + 64;
                int var30 = var18 * 128 + 64;
                int var31 = var19 * 128 + 64;
                class7 var32 = new class7(var21, Statics.field1961, var28, var29, method226(var28, var29, Statics.field1961) - var22, field577 + var24, field577 + var25, var26, var27, var20, var23);
                var32.method95(var30, var31, method226(var30, var31, Statics.field1961) - var23, field577 + var24);
                field432.method3559(var32);
            }
            return;
        }
        if (field346 == 12) {
            int var33 = field482.method2409();
            byte var34 = field482.method2364();
            int var35 = field482.method2499();
            byte var36 = field482.method2481();
            int var37 = field482.method2363();
            int var38 = (var37 >> 4 & 0x7) + Statics.field1566;
            int var39 = (var37 & 0x7) + Statics.field700;
            byte var40 = field482.method2371();
            byte var41 = field482.method2364();
            int var42 = field482.method2353();
            int var43 = field482.method2409();
            int var44 = field482.method2390();
            int var45 = var44 >> 2;
            int var46 = var44 & 0x3;
            int var47 = field362[var45];
            class3 var48;
            if (field375 == var43) {
                var48 = Statics.field2054;
            } else {
                var48 = field296[var43];
            }
            if (var48 != null) {
                class41 var49 = class41.method1009(var42);
                int var50;
                int var51;
                if (var46 == 1 || var46 == 3) {
                    var50 = var49.field926;
                    var51 = var49.field968;
                } else {
                    var50 = var49.field968;
                    var51 = var49.field926;
                }
                int var52 = (var50 >> 1) + var38;
                int var53 = (var50 + 1 >> 1) + var38;
                int var54 = (var51 >> 1) + var39;
                int var55 = (var51 + 1 >> 1) + var39;
                int[][] var56 = class6.field81[Statics.field1961];
                int var57 = var56[var52][var54] + var56[var53][var54] + var56[var52][var55] + var56[var53][var55] >> 2;
                int var58 = (var38 << 7) + (var50 << 6);
                int var59 = (var39 << 7) + (var51 << 6);
                class105 var60 = var49.method777(var45, var46, var56, var58, var57, var59);
                if (var60 != null) {
                    method2950(Statics.field1961, var38, var39, var47, -1, 0, 0, var33 + 1, var35 + 1);
                    var48.field53 = field577 + var33;
                    var48.field38 = field577 + var35;
                    var48.field34 = var60;
                    var48.field35 = var38 * 128 + var50 * 64;
                    var48.field37 = var39 * 128 + var51 * 64;
                    var48.field45 = var57;
                    if (var36 > var41) {
                        byte var61 = var36;
                        var36 = var41;
                        var41 = var61;
                    }
                    if (var34 > var40) {
                        byte var62 = var34;
                        var34 = var40;
                        var40 = var62;
                    }
                    var48.field43 = var36 + var38;
                    var48.field42 = var38 + var41;
                    var48.field44 = var34 + var39;
                    var48.field46 = var39 + var40;
                }
            }
        }
        if (field346 == 28) {
            int var63 = field482.method2390();
            int var64 = (var63 >> 4 & 0x7) + Statics.field1566;
            int var65 = (var63 & 0x7) + Statics.field700;
            int var66 = field482.method2445();
            int var67 = var66 >> 2;
            int var68 = var66 & 0x3;
            int var69 = field362[var67];
            if (var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104) {
                method2950(Statics.field1961, var64, var65, var69, -1, var67, var68, 0, -1);
            }
        } else if (field346 == 205) {
            int var70 = field482.method2445();
            int var71 = (var70 >> 4 & 0x7) + Statics.field1566;
            int var72 = (var70 & 0x7) + Statics.field700;
            int var73 = field482.method2353();
            int var74 = field482.method2390();
            int var75 = var74 >> 2;
            int var76 = var74 & 0x3;
            int var77 = field362[var75];
            if (var71 >= 0 && var72 >= 0 && var71 < 103 && var72 < 103) {
                if (var77 == 0) {
                    class87 var78 = Statics.field1793.method1810(Statics.field1961, var71, var72);
                    if (var78 != null) {
                        int var79 = var78.field1532 >> 14 & 0x7FFF;
                        if (var75 == 2) {
                            var78.field1530 = new class13(var79, 2, var76 + 4, Statics.field1961, var71, var72, var73, false, var78.field1530);
                            var78.field1526 = new class13(var79, 2, var76 + 1 & 0x3, Statics.field1961, var71, var72, var73, false, var78.field1526);
                        } else {
                            var78.field1530 = new class13(var79, var75, var76, Statics.field1961, var71, var72, var73, false, var78.field1530);
                        }
                    }
                }
                if (var77 == 1) {
                    class94 var80 = Statics.field1793.method1841(Statics.field1961, var71, var72);
                    if (var80 != null) {
                        int var81 = var80.field1615 >> 14 & 0x7FFF;
                        if (var75 == 4 || var75 == 5) {
                            var80.field1610 = new class13(var81, 4, var76, Statics.field1961, var71, var72, var73, false, var80.field1610);
                        } else if (var75 == 6) {
                            var80.field1610 = new class13(var81, 4, var76 + 4, Statics.field1961, var71, var72, var73, false, var80.field1610);
                        } else if (var75 == 7) {
                            var80.field1610 = new class13(var81, 4, (var76 + 2 & 0x3) + 4, Statics.field1961, var71, var72, var73, false, var80.field1610);
                        } else if (var75 == 8) {
                            var80.field1610 = new class13(var81, 4, var76 + 4, Statics.field1961, var71, var72, var73, false, var80.field1610);
                            var80.field1608 = new class13(var81, 4, (var76 + 2 & 0x3) + 4, Statics.field1961, var71, var72, var73, false, var80.field1608);
                        }
                    }
                }
                if (var77 == 2) {
                    class98 var82 = Statics.field1793.method1818(Statics.field1961, var71, var72);
                    if (var75 == 11) {
                        var75 = 10;
                    }
                    if (var82 != null) {
                        var82.field1657 = new class13(var82.field1665 >> 14 & 0x7FFF, var75, var76, Statics.field1961, var71, var72, var73, false, var82.field1657);
                    }
                }
                if (var77 == 3) {
                    class93 var83 = Statics.field1793.method1811(Statics.field1961, var71, var72);
                    if (var83 != null) {
                        var83.field1600 = new class13(var83.field1595 >> 14 & 0x7FFF, 22, var76, Statics.field1961, var71, var72, var73, false, var83.field1600);
                    }
                }
            }
        } else if (field346 == 171) {
            int var84 = field482.method2363();
            int var85 = (var84 >> 4 & 0x7) + Statics.field1566;
            int var86 = (var84 & 0x7) + Statics.field700;
            int var87 = field482.method2353();
            int var88 = field482.method2363();
            int var89 = field482.method2353();
            if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
                int var90 = var85 * 128 + 64;
                int var91 = var86 * 128 + 64;
                class30 var92 = new class30(var87, Statics.field1961, var90, var91, method226(var90, var91, Statics.field1961) - var88, var89, field577);
                field514.method3559(var92);
            }
        } else if (field346 == 88) {
            int var93 = field482.method2363();
            int var94 = (var93 >> 4 & 0x7) + Statics.field1566;
            int var95 = (var93 & 0x7) + Statics.field700;
            int var96 = field482.method2353();
            int var97 = field482.method2353();
            int var98 = field482.method2353();
            if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                class199 var99 = field430[Statics.field1961][var94][var95];
                if (var99 != null) {
                    for (class29 var100 = (class29) var99.method3566(); var100 != null; var100 = (class29) var99.method3567()) {
                        if ((var96 & 0x7FFF) == var100.field682 && var100.field681 == var97) {
                            var100.field681 = var98;
                            break;
                        }
                    }
                    method586(var94, var95);
                }
            }
        } else if (field346 == 48) {
            int var101 = field482.method2397();
            int var102 = field482.method2363();
            int var103 = (var102 >> 4 & 0x7) + Statics.field1566;
            int var104 = (var102 & 0x7) + Statics.field700;
            if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104) {
                class199 var105 = field430[Statics.field1961][var103][var104];
                if (var105 != null) {
                    for (class29 var106 = (class29) var105.method3566(); var106 != null; var106 = (class29) var105.method3567()) {
                        if ((var101 & 0x7FFF) == var106.field682) {
                            var106.method3665();
                            break;
                        }
                    }
                    if (var105.method3566() == null) {
                        field430[Statics.field1961][var103][var104] = null;
                    }
                    method586(var103, var104);
                }
            }
        } else if (field346 == 142) {
            int var107 = field482.method2366();
            int var108 = var107 >> 2;
            int var109 = var107 & 0x3;
            int var110 = field362[var108];
            int var111 = field482.method2363();
            int var112 = (var111 >> 4 & 0x7) + Statics.field1566;
            int var113 = (var111 & 0x7) + Statics.field700;
            int var114 = field482.method2499();
            if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104) {
                method2950(Statics.field1961, var112, var113, var110, var114, var108, var109, 0, -1);
            }
        }
    }

    @ObfuscatedName("fg.bu(IIIIIIIIII)V")
    public static final void method2950(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field418.method3566(); var10 != null; var10 = (class17) field418.method3567()) {
            if (var10.field242 == arg0 && var10.field243 == arg1 && var10.field249 == arg2 && var10.field233 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field242 = arg0;
            var9.field233 = arg3;
            var9.field243 = arg1;
            var9.field249 = arg2;
            Statics.method651(var9);
            field418.method3559(var9);
        }
        var9.field239 = arg4;
        var9.field241 = arg5;
        var9.field240 = arg6;
        var9.field234 = arg7;
        var9.field238 = arg8;
    }

    @ObfuscatedName("cz.bq(I)V")
    public static final void method2157() {
        for (class17 var0 = (class17) field418.method3566(); var0 != null; var0 = (class17) field418.method3567()) {
            if (var0.field238 == -1) {
                var0.field234 = 0;
                Statics.method651(var0);
            } else {
                var0.method3665();
            }
        }
    }

    @ObfuscatedName("ft.bn(IIIIIIII)V")
    public static final void method3146(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field303 && Statics.field1961 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1793.method1814(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1793.method1815(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1793.method1816(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1793.method1817(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1793.method1853(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1793.method1805(arg0, arg2, arg3);
                class41 var15 = class41.method1009(var12);
                if (var15.field973 != 0) {
                    field359[arg0].method2247(arg2, arg3, var13, var14, var15.field959);
                }
            }
            if (arg1 == 1) {
                Statics.field1793.method1806(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1793.method1904(arg0, arg2, arg3);
                class41 var16 = class41.method1009(var12);
                if (var16.field968 + arg2 > 103 || var16.field968 + arg3 > 103 || var16.field926 + arg2 > 103 || var16.field926 + arg3 > 103) {
                    return;
                }
                if (var16.field973 != 0) {
                    field359[arg0].method2248(arg2, arg3, var16.field968, var16.field926, var14, var16.field959);
                }
            }
            if (arg1 == 3) {
                Statics.field1793.method1928(arg0, arg2, arg3);
                class41 var17 = class41.method1009(var12);
                if (var17.field973 == 1) {
                    field359[arg0].method2250(arg2, arg3);
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
        class86 var19 = Statics.field1793;
        class108 var20 = field359[arg0];
        class41 var21 = class41.method1009(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field926;
            var23 = var21.field968;
        } else {
            var22 = var21.field968;
            var23 = var21.field926;
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
        int[][] var28 = class6.field81[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field944 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field924 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class85 var34;
            if (var21.field960 == -1 && var21.field966 == null) {
                var34 = var21.method777(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field960, true, (class85) null);
            }
            var19.method1794(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field973 == 1) {
                var20.method2267(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class85 var57;
            if (var21.field960 == -1 && var21.field966 == null) {
                var57 = var21.method777(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field960, true, (class85) null);
            }
            if (var57 != null) {
                var19.method1800(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field973 != 0) {
                var20.method2265(arg2, arg3, var22, var23, var21.field959);
            }
        } else if (arg6 >= 12) {
            class85 var35;
            if (var21.field960 == -1 && var21.field966 == null) {
                var35 = var21.method777(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field960, true, (class85) null);
            }
            var19.method1800(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field973 != 0) {
                var20.method2265(arg2, arg3, var22, var23, var21.field959);
            }
        } else if (arg6 == 0) {
            class85 var36;
            if (var21.field960 == -1 && var21.field966 == null) {
                var36 = var21.method777(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field960, true, (class85) null);
            }
            var19.method1796(arg0, arg2, arg3, var29, var36, (class85) null, class6.field88[arg5], 0, var32, var33);
            if (var21.field973 != 0) {
                var20.method2269(arg2, arg3, arg6, arg5, var21.field959);
            }
        } else if (arg6 == 1) {
            class85 var37;
            if (var21.field960 == -1 && var21.field966 == null) {
                var37 = var21.method777(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field960, true, (class85) null);
            }
            var19.method1796(arg0, arg2, arg3, var29, var37, (class85) null, class6.field89[arg5], 0, var32, var33);
            if (var21.field973 != 0) {
                var20.method2269(arg2, arg3, arg6, arg5, var21.field959);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class85 var39;
            class85 var40;
            if (var21.field960 == -1 && var21.field966 == null) {
                var39 = var21.method777(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method777(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field960, true, (class85) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field960, true, (class85) null);
            }
            var19.method1796(arg0, arg2, arg3, var29, var39, var40, class6.field88[arg5], class6.field88[var38], var32, var33);
            if (var21.field973 != 0) {
                var20.method2269(arg2, arg3, arg6, arg5, var21.field959);
            }
        } else if (arg6 == 3) {
            class85 var41;
            if (var21.field960 == -1 && var21.field966 == null) {
                var41 = var21.method777(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field960, true, (class85) null);
            }
            var19.method1796(arg0, arg2, arg3, var29, var41, (class85) null, class6.field89[arg5], 0, var32, var33);
            if (var21.field973 != 0) {
                var20.method2269(arg2, arg3, arg6, arg5, var21.field959);
            }
        } else if (arg6 == 9) {
            class85 var42;
            if (var21.field960 == -1 && var21.field966 == null) {
                var42 = var21.method777(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field960, true, (class85) null);
            }
            var19.method1800(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field973 != 0) {
                var20.method2265(arg2, arg3, var22, var23, var21.field959);
            }
        } else if (arg6 == 4) {
            class85 var43;
            if (var21.field960 == -1 && var21.field966 == null) {
                var43 = var21.method777(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field960, true, (class85) null);
            }
            var19.method1797(arg0, arg2, arg3, var29, var43, (class85) null, class6.field88[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1814(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class41.method1009(var45 >> 14 & 0x7FFF).field949;
            }
            class85 var46;
            if (var21.field960 == -1 && var21.field966 == null) {
                var46 = var21.method777(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field960, true, (class85) null);
            }
            var19.method1797(arg0, arg2, arg3, var29, var46, (class85) null, class6.field88[arg5], 0, class6.field90[arg5] * var44, class6.field86[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1814(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class41.method1009(var48 >> 14 & 0x7FFF).field949 / 2;
            }
            class85 var49;
            if (var21.field960 == -1 && var21.field966 == null) {
                var49 = var21.method777(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field960, true, (class85) null);
            }
            var19.method1797(arg0, arg2, arg3, var29, var49, (class85) null, 256, arg5, class6.field98[arg5] * var47, class6.field93[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class85 var51;
            if (var21.field960 == -1 && var21.field966 == null) {
                var51 = var21.method777(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field960, true, (class85) null);
            }
            var19.method1797(arg0, arg2, arg3, var29, var51, (class85) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1814(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class41.method1009(var53 >> 14 & 0x7FFF).field949 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class85 var55;
            class85 var56;
            if (var21.field960 == -1 && var21.field966 == null) {
                var55 = var21.method777(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method777(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field960, true, (class85) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field960, true, (class85) null);
            }
            var19.method1797(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field98[arg5] * var52, class6.field93[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("h.ba(IIB)V")
    public static final void method586(int arg0, int arg1) {
        class199 var2 = field430[Statics.field1961][arg0][arg1];
        if (var2 == null) {
            Statics.field1793.method1809(Statics.field1961, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3566(); var6 != null; var6 = (class29) var2.method3567()) {
            class52 var7 = Statics.method975(var6.field682);
            long var8 = (long) var7.field1133;
            if (var7.field1109 == 1) {
                var8 = (long) (var6.field681 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1793.method1809(Statics.field1961, arg0, arg1);
            return;
        }
        var2.method3561(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3566(); var12 != null; var12 = (class29) var2.method3567()) {
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
        Statics.field1793.method1807(Statics.field1961, arg0, arg1, method226(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1961), var5, var13, var10, var11);
    }

    @ObfuscatedName("ef.bt(ZI)V")
    public static final void method2899(boolean arg0) {
        field423 = 0;
        field572 = 0;
        field482.method2601();
        int var1 = field482.method2602(8);
        if (var1 < field342) {
            for (int var2 = var1; var2 < field342; var2++) {
                field424[++field423 - 1] = field311[var2];
            }
        }
        if (var1 > field342) {
            throw new RuntimeException("");
        }
        field342 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field311[var3];
            class35 var5 = field512[var4];
            int var6 = field482.method2602(1);
            if (var6 == 0) {
                field311[++field342 - 1] = var4;
                var5.field868 = field577;
            } else {
                int var7 = field482.method2602(2);
                if (var7 == 0) {
                    field311[++field342 - 1] = var4;
                    var5.field868 = field577;
                    field341[++field572 - 1] = var4;
                } else if (var7 == 1) {
                    field311[++field342 - 1] = var4;
                    var5.field868 = field577;
                    int var8 = field482.method2602(3);
                    var5.method710(var8, (byte) 1);
                    int var9 = field482.method2602(1);
                    if (var9 == 1) {
                        field341[++field572 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field311[++field342 - 1] = var4;
                    var5.field868 = field577;
                    int var10 = field482.method2602(3);
                    var5.method710(var10, (byte) 2);
                    int var11 = field482.method2602(3);
                    var5.method710(var11, (byte) 2);
                    int var12 = field482.method2602(1);
                    if (var12 == 1) {
                        field341[++field572 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field424[++field423 - 1] = var4;
                }
            }
        }
        while (field482.method2605(field345) >= 27) {
            int var13 = field482.method2602(15);
            if (var13 == 32767) {
                break;
            }
            boolean var17 = false;
            if (field512[var13] == null) {
                field512[var13] = new class35();
                var17 = true;
            }
            class35 var18 = field512[var13];
            field311[++field342 - 1] = var13;
            var18.field868 = field577;
            int var19;
            if (arg0) {
                var19 = field482.method2602(8);
                if (var19 > 127) {
                    var19 -= 256;
                }
            } else {
                var19 = field482.method2602(5);
                if (var19 > 15) {
                    var19 -= 32;
                }
            }
            int var20;
            if (arg0) {
                var20 = field482.method2602(8);
                if (var20 > 127) {
                    var20 -= 256;
                }
            } else {
                var20 = field482.method2602(5);
                if (var20 > 15) {
                    var20 -= 32;
                }
            }
            int var21 = field371[field482.method2602(3)];
            if (var17) {
                var18.field867 = var18.field819 = var21;
            }
            int var22 = field482.method2602(1);
            if (var22 == 1) {
                field341[++field572 - 1] = var13;
            }
            int var23 = field482.method2602(1);
            var18.field789 = class40.method2058(field482.method2602(14));
            var18.field821 = var18.field789.field917;
            var18.field869 = var18.field789.field890;
            if (var18.field869 == 0) {
                var18.field819 = 0;
            }
            var18.field825 = var18.field789.field896;
            var18.field826 = var18.field789.field897;
            var18.field862 = var18.field789.field898;
            var18.field863 = var18.field789.field899;
            var18.field852 = var18.field789.field911;
            var18.field834 = var18.field789.field888;
            var18.field824 = var18.field789.field906;
            var18.method713(Statics.field2054.field827[0] + var20, Statics.field2054.field872[0] + var19, var23 == 1);
        }
        field482.method2603();
        method706();
        for (int var14 = 0; var14 < field423; var14++) {
            int var15 = field424[var14];
            if (field577 != field512[var15].field868) {
                field512[var15].field789 = null;
                field512[var15] = null;
            }
        }
        if (field345 != field482.field1994) {
            throw new RuntimeException(field482.field1994 + class2.field27 + field345);
        }
        for (int var16 = 0; var16 < field342; var16++) {
            if (field512[field311[var16]] == null) {
                throw new RuntimeException(var16 + class2.field27 + field342);
            }
        }
    }

    @ObfuscatedName("aa.bm(B)V")
    public static final void method706() {
        for (int var0 = 0; var0 < field572; var0++) {
            int var1 = field341[var0];
            class35 var2 = field512[var1];
            int var3 = field482.method2363();
            if ((var3 & 0x40) != 0) {
                int var4 = field482.method2390();
                int var5 = field482.method2366();
                var2.method738(var4, var5, field577);
                var2.field839 = field577 + 300;
                var2.field840 = field482.method2409();
                var2.field823 = field482.method2409();
            }
            if ((var3 & 0x10) != 0) {
                int var6 = field482.method2499();
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = field482.method2390();
                if (var2.field848 == var6 && var6 != -1) {
                    int var8 = Statics.method653(var6).field1005;
                    if (var8 == 1) {
                        var2.field849 = 0;
                        var2.field850 = 0;
                        var2.field851 = var7;
                        var2.field858 = 0;
                    }
                    if (var8 == 2) {
                        var2.field858 = 0;
                    }
                } else if (var6 == -1 || var2.field848 == -1 || Statics.method653(var6).field988 >= Statics.method653(var2.field848).field988) {
                    var2.field848 = var6;
                    var2.field849 = 0;
                    var2.field850 = 0;
                    var2.field851 = var7;
                    var2.field858 = 0;
                    var2.field877 = var2.field857;
                }
            }
            if ((var3 & 0x20) != 0) {
                var2.field830 = field482.method2365();
                var2.field822 = 100;
            }
            if ((var3 & 0x80) != 0) {
                var2.field841 = field482.method2499();
                if (var2.field841 == 65535) {
                    var2.field841 = -1;
                }
            }
            if ((var3 & 0x2) != 0) {
                var2.field789 = class40.method2058(field482.method2409());
                var2.field821 = var2.field789.field917;
                var2.field869 = var2.field789.field890;
                var2.field825 = var2.field789.field896;
                var2.field826 = var2.field789.field897;
                var2.field862 = var2.field789.field898;
                var2.field863 = var2.field789.field899;
                var2.field852 = var2.field789.field911;
                var2.field834 = var2.field789.field888;
                var2.field824 = var2.field789.field906;
            }
            if ((var3 & 0x4) != 0) {
                var2.field853 = field482.method2353();
                int var9 = field482.method2510();
                var2.field843 = var9 >> 16;
                var2.field856 = (var9 & 0xFFFF) + field577;
                var2.field854 = 0;
                var2.field855 = 0;
                if (var2.field856 > field577) {
                    var2.field854 = -1;
                }
                if (var2.field853 == 65535) {
                    var2.field853 = -1;
                }
            }
            if ((var3 & 0x8) != 0) {
                int var10 = field482.method2353();
                int var11 = field482.method2353();
                int var12 = var2.field828 - (var10 - Statics.field2576 - Statics.field2576) * 64;
                int var13 = var2.field818 - (var11 - Statics.field2133 - Statics.field2133) * 64;
                if (var12 != 0 || var13 != 0) {
                    var2.field833 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x1) != 0) {
                int var14 = field482.method2390();
                int var15 = field482.method2366();
                var2.method738(var14, var15, field577);
                var2.field839 = field577 + 300;
                var2.field840 = field482.method2397();
                var2.field823 = field482.method2397();
            }
        }
    }

    @ObfuscatedName("bi.bw(Lq;IIBI)V")
    public static final void method1075(class3 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field827[0];
        int var5 = arg0.field872[0];
        int var6 = arg0.method17();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = class106.method2930(var4, var5, arg0.method17(), method1191(arg1, arg2), field359[arg0.field28], true, field544, field578);
        if (var7 >= 1) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg0.method19(field544[var8], field578[var8], arg3);
            }
        }
    }

    @ObfuscatedName("bk.bd(III)Ldc;")
    public static class107 method1191(int arg0, int arg1) {
        field576.field1875 = arg0;
        field576.field1880 = arg1;
        field576.field1877 = 1;
        field576.field1876 = 1;
        return field576;
    }

    @ObfuscatedName("ag.bh(I)V")
    public static final void method995() {
        int var0 = Statics.field2730;
        int var1 = Statics.field2073;
        int var2 = Statics.field2050;
        int var3 = Statics.field130;
        int var4 = 6116423;
        class80.method1746(var0, var1, var2, var3, var4);
        class80.method1746(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class80.method1714(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field166.method3796(class157.field2298, var0 + 3, var1 + 14, var4, -1);
        int var5 = class140.field2144;
        int var6 = class140.field2138;
        for (int var7 = 0; var7 < field326; var7++) {
            int var8 = (field326 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field166.method3796(method46(var7), var0 + 3, var8, var9, 0);
        }
        method135(Statics.field2730, Statics.field2073, Statics.field2050, Statics.field130);
    }

    @ObfuscatedName("d.bc(IIIIB)V")
    public static final void method186(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field500; var4++) {
            if (field541[var4] + field507[var4] > arg0 && field541[var4] < arg0 + arg2 && field508[var4] + field506[var4] > arg1 && field506[var4] < arg1 + arg3) {
                field502[var4] = true;
            }
        }
    }

    @ObfuscatedName("w.bz(IIIII)V")
    public static final void method135(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field500; var4++) {
            if (field541[var4] + field507[var4] > arg0 && field541[var4] < arg0 + arg2 && field508[var4] + field506[var4] > arg1 && field506[var4] < arg1 + arg3) {
                field503[var4] = true;
            }
        }
    }

    @ObfuscatedName("bb.bs(B)V")
    public static final void method1533() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field326 - 1; var1++) {
                if (field329[var1] < 1000 && field329[var1 + 1] > 1000) {
                    String var2 = field445[var1];
                    field445[var1] = field445[var1 + 1];
                    field445[var1 + 1] = var2;
                    String var3 = field399[var1];
                    field399[var1] = field399[var1 + 1];
                    field399[var1 + 1] = var3;
                    int var4 = field329[var1];
                    field329[var1] = field329[var1 + 1];
                    field329[var1 + 1] = var4;
                    int var5 = field440[var1];
                    field440[var1] = field440[var1 + 1];
                    field440[var1 + 1] = var5;
                    int var6 = field455[var1];
                    field455[var1] = field455[var1 + 1];
                    field455[var1 + 1] = var6;
                    int var7 = field443[var1];
                    field443[var1] = field443[var1 + 1];
                    field443[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
        if (Statics.field1965 != null || field470 != null) {
            return;
        }
        int var8 = class140.field2150;
        if (field337) {
            if (var8 != 1 && (Statics.field306 || var8 != 4)) {
                int var9 = class140.field2144;
                int var10 = class140.field2138;
                if (var9 < Statics.field2730 - 10 || var9 > Statics.field2730 + Statics.field2050 + 10 || var10 < Statics.field2073 - 10 || var10 > Statics.field2073 + Statics.field130 + 10) {
                    field337 = false;
                    method186(Statics.field2730, Statics.field2073, Statics.field2050, Statics.field130);
                }
            }
            if (var8 == 1 || !Statics.field306 && var8 == 4) {
                int var11 = Statics.field2730;
                int var12 = Statics.field2073;
                int var13 = Statics.field2050;
                int var14 = class140.field2151;
                int var15 = class140.field2152;
                int var16 = -1;
                for (int var17 = 0; var17 < field326; var17++) {
                    int var18 = (field326 - 1 - var17) * 15 + var12 + 31;
                    if (var14 > var11 && var14 < var11 + var13 && var15 > var18 - 13 && var15 < var18 + 3) {
                        var16 = var17;
                    }
                }
                if (var16 != -1) {
                    method2065(var16);
                }
                field337 = false;
                method186(Statics.field2730, Statics.field2073, Statics.field2050, Statics.field130);
            }
            return;
        }
        if ((var8 == 1 || !Statics.field306 && var8 == 4) && field326 > 0) {
            int var19 = field329[field326 - 1];
            if (var19 == 39 || var19 == 40 || var19 == 41 || var19 == 42 || var19 == 43 || var19 == 33 || var19 == 34 || var19 == 35 || var19 == 36 || var19 == 37 || var19 == 38 || var19 == 1005) {
                int var20 = field440[field326 - 1];
                int var21 = field455[field326 - 1];
                class173 var22 = class173.method2297(var21);
                if (class178.method3145(method1237(var22)) || class178.method2904(method1237(var22))) {
                    if (Statics.field1965 != null && !field367 && field527 != 1 && !Statics.method153(field326 - 1) && field326 > 0) {
                        method781(field327, field533);
                    }
                    field367 = false;
                    field309 = 0;
                    if (Statics.field1965 != null) {
                        Statics.method1777(Statics.field1965);
                    }
                    Statics.field1965 = class173.method2297(var21);
                    field413 = var20;
                    field327 = class140.field2151;
                    field533 = class140.field2152;
                    if (field326 > 0) {
                        method568(field326 - 1);
                    }
                    Statics.method1777(Statics.field1965);
                    return;
                }
            }
        }
        if ((var8 == 1 || !Statics.field306 && var8 == 4) && (field527 == 1 && field326 > 2 || Statics.method153(field326 - 1))) {
            var8 = 2;
        }
        if ((var8 == 1 || !Statics.field306 && var8 == 4) && field326 > 0) {
            method2065(field326 - 1);
        }
        if (var8 == 2 && field326 > 0) {
            method620(class140.field2151, class140.field2152);
        }
    }

    @ObfuscatedName("e.bo(III)V")
    public static final void method620(int arg0, int arg1) {
        int var2 = Statics.field166.method3764(class157.field2298);
        for (int var3 = 0; var3 < field326; var3++) {
            int var4 = Statics.field166.method3764(method46(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field326 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field882) {
            var6 = Statics.field882 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field158) {
            var7 = Statics.field158 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field337 = true;
        Statics.field2730 = var6;
        Statics.field2073 = var7;
        Statics.field2050 = var2;
        Statics.field130 = field326 * 15 + 22;
    }

    @ObfuscatedName("cf.bv(IS)V")
    public static final void method2065(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field440[arg0];
        int var2 = field455[arg0];
        int var3 = field329[arg0];
        int var4 = field443[arg0];
        String var5 = field399[arg0];
        String var6 = field445[arg0];
        method1238(var1, var2, var3, var4, var5, var6, class140.field2151, class140.field2152);
    }

    @ObfuscatedName("ch.bj(Lax;III)V")
    public static final void method2159(class31 arg0, int arg1, int arg2) {
        method1238(arg0.field710, arg0.field706, arg0.field707, arg0.field708, arg0.field709, arg0.field709, arg1, arg2);
    }

    @ObfuscatedName("bl.by(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1238(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 47) {
            class3 var8 = field296[arg3];
            if (var8 != null) {
                field407 = arg6;
                field408 = arg7;
                field410 = 2;
                field409 = 0;
                field531 = arg0;
                field532 = arg1;
                field493.method2617(97);
                field493.method2392(class137.field2114[82] ? 1 : 0);
                field493.method2395(arg3);
            }
        }
        if (arg2 == 2) {
            field407 = arg6;
            field408 = arg7;
            field410 = 2;
            field409 = 0;
            field531 = arg0;
            field532 = arg1;
            field493.method2617(99);
            field493.method2404(Statics.field2584);
            field493.method2349(Statics.field2576 + arg0);
            field493.method2394(Statics.field2133 + arg1);
            field493.method2349(arg3 >> 14 & 0x7FFF);
            field493.method2426(class137.field2114[82] ? 1 : 0);
            field493.method2349(field486);
        }
        if (arg2 == 58) {
            class173 var9 = class173.method1498(arg1, arg0);
            if (var9 != null) {
                field493.method2617(170);
                field493.method2351(Statics.field2584);
                field493.method2395(field486);
                field493.method2394(arg0);
                field493.method2394(var9.field2752);
                field493.method2514(arg1);
                field493.method2395(field525);
            }
        }
        if (arg2 == 38) {
            method143();
            class173 var10 = class173.method2297(arg1);
            field404 = 1;
            Statics.field202 = arg0;
            Statics.field2071 = arg1;
            Statics.field2044 = arg3;
            Statics.method1777(var10);
            field451 = class2.method4(16748608) + Statics.method975(arg3).field1117 + class2.method4(16777215);
            if (field451 == null) {
                field451 = "null";
            }
            return;
        }
        if (arg2 == 50) {
            class3 var11 = field296[arg3];
            if (var11 != null) {
                field407 = arg6;
                field408 = arg7;
                field410 = 2;
                field409 = 0;
                field531 = arg0;
                field532 = arg1;
                field493.method2617(81);
                field493.method2406(arg3);
                field493.method2392(class137.field2114[82] ? 1 : 0);
            }
        }
        if (arg2 == 41) {
            field493.method2617(208);
            field493.method2514(arg1);
            field493.method2349(arg0);
            field493.method2395(arg3);
            field411 = 0;
            Statics.field842 = class173.method2297(arg1);
            field412 = arg0;
        }
        if (arg2 == 25) {
            class173 var12 = class173.method1498(arg1, arg0);
            if (var12 != null) {
                method143();
                method727(arg1, arg0, class178.method2792(method1237(var12)), var12.field2752);
                field404 = 0;
                field370 = method822(var12);
                if (field370 == null) {
                    field370 = "Null";
                }
                if (var12.field2743) {
                    field456 = var12.field2815 + class2.method4(16777215);
                } else {
                    field456 = class2.method4(65280) + var12.field2858 + class2.method4(16777215);
                }
            }
            return;
        }
        if (arg2 == 3) {
            field407 = arg6;
            field408 = arg7;
            field410 = 2;
            field409 = 0;
            field531 = arg0;
            field532 = arg1;
            field493.method2617(192);
            field493.method2395(Statics.field2133 + arg1);
            field493.method2406(arg3 >> 14 & 0x7FFF);
            field493.method2402(class137.field2114[82] ? 1 : 0);
            field493.method2349(Statics.field2576 + arg0);
        }
        if (arg2 == 28) {
            field493.method2617(213);
            field493.method2351(arg1);
            class173 var13 = class173.method2297(arg1);
            if (var13.field2854 != null && var13.field2854[0][0] == 5) {
                int var14 = var13.field2854[0][1];
                class176.field2900[var14] = 1 - class176.field2900[var14];
                method961(var14);
            }
        }
        if (arg2 == 29) {
            field493.method2617(213);
            field493.method2351(arg1);
            class173 var15 = class173.method2297(arg1);
            if (var15.field2854 != null && var15.field2854[0][0] == 5) {
                int var16 = var15.field2854[0][1];
                if (class176.field2900[var16] != var15.field2856[0]) {
                    class176.field2900[var16] = var15.field2856[0];
                    method961(var16);
                }
            }
        }
        if (arg2 == 23) {
            Statics.field1793.method1825(Statics.field1961, arg0, arg1);
        }
        if (arg2 == 48) {
            class3 var17 = field296[arg3];
            if (var17 != null) {
                field407 = arg6;
                field408 = arg7;
                field410 = 2;
                field409 = 0;
                field531 = arg0;
                field532 = arg1;
                field493.method2617(48);
                field493.method2426(class137.field2114[82] ? 1 : 0);
                field493.method2406(arg3);
            }
        }
        if (arg2 == 1004) {
            field407 = arg6;
            field408 = arg7;
            field410 = 2;
            field409 = 0;
            field493.method2617(138);
            field493.method2394(arg3);
        }
        if (arg2 == 18) {
            field407 = arg6;
            field408 = arg7;
            field410 = 2;
            field409 = 0;
            field531 = arg0;
            field532 = arg1;
            field493.method2617(169);
            field493.method2395(Statics.field2576 + arg0);
            field493.method2395(arg3);
            field493.method2349(Statics.field2133 + arg1);
            field493.method2386(class137.field2114[82] ? 1 : 0);
        }
        if (arg2 == 22) {
            field407 = arg6;
            field408 = arg7;
            field410 = 2;
            field409 = 0;
            field531 = arg0;
            field532 = arg1;
            field493.method2617(117);
            field493.method2394(Statics.field2133 + arg1);
            field493.method2395(arg3);
            field493.method2386(class137.field2114[82] ? 1 : 0);
            field493.method2349(Statics.field2576 + arg0);
        }
        if (arg2 == 8) {
            class35 var18 = field512[arg3];
            if (var18 != null) {
                field407 = arg6;
                field408 = arg7;
                field410 = 2;
                field409 = 0;
                field531 = arg0;
                field532 = arg1;
                field493.method2617(136);
                field493.method2349(arg3);
                field493.method2426(class137.field2114[82] ? 1 : 0);
                field493.method2404(Statics.field2584);
                field493.method2394(field486);
            }
        }
        if (arg2 == 34) {
            field493.method2617(189);
            field493.method2349(arg0);
            field493.method2395(arg3);
            field493.method2403(arg1);
            field411 = 0;
            Statics.field842 = class173.method2297(arg1);
            field412 = arg0;
        }
        if (arg2 == 17) {
            field407 = arg6;
            field408 = arg7;
            field410 = 2;
            field409 = 0;
            field531 = arg0;
            field532 = arg1;
            field493.method2617(3);
            field493.method2402(class137.field2114[82] ? 1 : 0);
            field493.method2514(Statics.field2584);
            field493.method2349(arg3);
            field493.method2406(field486);
            field493.method2349(Statics.field2576 + arg0);
            field493.method2395(Statics.field2133 + arg1);
        }
        if (arg2 == 46) {
            class3 var19 = field296[arg3];
            if (var19 != null) {
                field407 = arg6;
                field408 = arg7;
                field410 = 2;
                field409 = 0;
                field531 = arg0;
                field532 = arg1;
                field493.method2617(222);
                field493.method2349(arg3);
                field493.method2402(class137.field2114[82] ? 1 : 0);
            }
        }
        if (arg2 == 1) {
            field407 = arg6;
            field408 = arg7;
            field410 = 2;
            field409 = 0;
            field531 = arg0;
            field532 = arg1;
            field493.method2617(47);
            field493.method2395(Statics.field2133 + arg1);
            field493.method2404(Statics.field2071);
            field493.method2394(arg3 >> 14 & 0x7FFF);
            field493.method2386(class137.field2114[82] ? 1 : 0);
            field493.method2395(Statics.field202);
            field493.method2406(Statics.field2576 + arg0);
            field493.method2349(Statics.field2044);
        }
        if (arg2 == 45) {
            class3 var20 = field296[arg3];
            if (var20 != null) {
                field407 = arg6;
                field408 = arg7;
                field410 = 2;
                field409 = 0;
                field531 = arg0;
                field532 = arg1;
                field493.method2617(127);
                field493.method2392(class137.field2114[82] ? 1 : 0);
                field493.method2406(arg3);
            }
        }
        if (arg2 == 1003) {
            field407 = arg6;
            field408 = arg7;
            field410 = 2;
            field409 = 0;
            class35 var21 = field512[arg3];
            if (var21 != null) {
                class40 var22 = var21.field789;
                if (var22.field914 != null) {
                    var22 = var22.method750();
                }
                if (var22 != null) {
                    field493.method2617(62);
                    field493.method2349(var22.field915);
                }
            }
        }
        if (arg2 == 20) {
            field407 = arg6;
            field408 = arg7;
            field410 = 2;
            field409 = 0;
            field531 = arg0;
            field532 = arg1;
            field493.method2617(248);
            field493.method2394(arg3);
            field493.method2394(Statics.field2576 + arg0);
            field493.method2392(class137.field2114[82] ? 1 : 0);
            field493.method2395(Statics.field2133 + arg1);
        }
        if (arg2 == 31) {
            field493.method2617(167);
            field493.method2403(arg1);
            field493.method2406(arg0);
            field493.method2406(Statics.field2044);
            field493.method2514(Statics.field2071);
            field493.method2349(arg3);
            field493.method2395(Statics.field202);
            field411 = 0;
            Statics.field842 = class173.method2297(arg1);
            field412 = arg0;
        }
        if (arg2 == 16) {
            field407 = arg6;
            field408 = arg7;
            field410 = 2;
            field409 = 0;
            field531 = arg0;
            field532 = arg1;
            field493.method2617(40);
            field493.method2395(Statics.field202);
            field493.method2426(class137.field2114[82] ? 1 : 0);
            field493.method2394(Statics.field2044);
            field493.method2406(arg3);
            field493.method2514(Statics.field2071);
            field493.method2395(Statics.field2576 + arg0);
            field493.method2406(Statics.field2133 + arg1);
        }
        if (arg2 == 26) {
            field493.method2617(237);
            for (class4 var23 = (class4) field458.method3543(); var23 != null; var23 = (class4) field458.method3537()) {
                if (var23.field58 == 0 || var23.field58 == 3) {
                    method3227(var23, true);
                }
            }
            if (field461 != null) {
                Statics.method1777(field461);
                field461 = null;
            }
        }
        if (arg2 == 40) {
            field493.method2617(227);
            field493.method2406(arg0);
            field493.method2403(arg1);
            field493.method2395(arg3);
            field411 = 0;
            Statics.field842 = class173.method2297(arg1);
            field412 = arg0;
        }
        if (arg2 == 9) {
            class35 var24 = field512[arg3];
            if (var24 != null) {
                field407 = arg6;
                field408 = arg7;
                field410 = 2;
                field409 = 0;
                field531 = arg0;
                field532 = arg1;
                field493.method2617(162);
                field493.method2394(arg3);
                field493.method2386(class137.field2114[82] ? 1 : 0);
            }
        }
        if (arg2 == 44) {
            class3 var25 = field296[arg3];
            if (var25 != null) {
                field407 = arg6;
                field408 = arg7;
                field410 = 2;
                field409 = 0;
                field531 = arg0;
                field532 = arg1;
                field493.method2617(46);
                field493.method2402(class137.field2114[82] ? 1 : 0);
                field493.method2349(arg3);
            }
        }
        if (arg2 == 7) {
            class35 var26 = field512[arg3];
            if (var26 != null) {
                field407 = arg6;
                field408 = arg7;
                field410 = 2;
                field409 = 0;
                field531 = arg0;
                field532 = arg1;
                field493.method2617(166);
                field493.method2386(class137.field2114[82] ? 1 : 0);
                field493.method2395(Statics.field202);
                field493.method2514(Statics.field2071);
                field493.method2406(Statics.field2044);
                field493.method2406(arg3);
            }
        }
        if (arg2 == 11) {
            class35 var27 = field512[arg3];
            if (var27 != null) {
                field407 = arg6;
                field408 = arg7;
                field410 = 2;
                field409 = 0;
                field531 = arg0;
                field532 = arg1;
                field493.method2617(63);
                field493.method2395(arg3);
                field493.method2392(class137.field2114[82] ? 1 : 0);
            }
        }
        if (arg2 == 10) {
            class35 var28 = field512[arg3];
            if (var28 != null) {
                field407 = arg6;
                field408 = arg7;
                field410 = 2;
                field409 = 0;
                field531 = arg0;
                field532 = arg1;
                field493.method2617(197);
                field493.method2386(class137.field2114[82] ? 1 : 0);
                field493.method2406(arg3);
            }
        }
        if (arg2 == 32) {
            field493.method2617(27);
            field493.method2394(field486);
            field493.method2514(arg1);
            field493.method2406(arg0);
            field493.method2395(arg3);
            field493.method2404(Statics.field2584);
            field411 = 0;
            Statics.field842 = class173.method2297(arg1);
            field412 = arg0;
        }
        if (arg2 == 1002) {
            field407 = arg6;
            field408 = arg7;
            field410 = 2;
            field409 = 0;
            field493.method2617(86);
            field493.method2349(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 39) {
            field493.method2617(90);
            field493.method2349(arg0);
            field493.method2349(arg3);
            field493.method2403(arg1);
            field411 = 0;
            Statics.field842 = class173.method2297(arg1);
            field412 = arg0;
        }
        if (arg2 == 1001) {
            field407 = arg6;
            field408 = arg7;
            field410 = 2;
            field409 = 0;
            field531 = arg0;
            field532 = arg1;
            field493.method2617(210);
            field493.method2395(arg3 >> 14 & 0x7FFF);
            field493.method2386(class137.field2114[82] ? 1 : 0);
            field493.method2349(Statics.field2576 + arg0);
            field493.method2394(Statics.field2133 + arg1);
        }
        if (arg2 == 5) {
            field407 = arg6;
            field408 = arg7;
            field410 = 2;
            field409 = 0;
            field531 = arg0;
            field532 = arg1;
            field493.method2617(199);
            field493.method2402(class137.field2114[82] ? 1 : 0);
            field493.method2395(Statics.field2133 + arg1);
            field493.method2349(arg3 >> 14 & 0x7FFF);
            field493.method2395(Statics.field2576 + arg0);
        }
        if (arg2 == 30 && field461 == null) {
            method132(arg1, arg0);
            field461 = class173.method1498(arg1, arg0);
            Statics.method1777(field461);
        }
        if (arg2 == 21) {
            field407 = arg6;
            field408 = arg7;
            field410 = 2;
            field409 = 0;
            field531 = arg0;
            field532 = arg1;
            field493.method2617(123);
            field493.method2426(class137.field2114[82] ? 1 : 0);
            field493.method2395(Statics.field2576 + arg0);
            field493.method2395(Statics.field2133 + arg1);
            field493.method2406(arg3);
        }
        if (arg2 == 1005) {
            class173 var29 = class173.method2297(arg1);
            if (var29 == null || var29.field2861[arg0] < 100000) {
                field493.method2617(138);
                field493.method2394(arg3);
            } else {
                class12.method3488(27, "", var29.field2861[arg0] + " x " + Statics.method975(arg3).field1117);
            }
            field411 = 0;
            Statics.field842 = class173.method2297(arg1);
            field412 = arg0;
        }
        if (arg2 == 33) {
            field493.method2617(107);
            field493.method2406(arg0);
            field493.method2395(arg3);
            field493.method2404(arg1);
            field411 = 0;
            Statics.field842 = class173.method2297(arg1);
            field412 = arg0;
        }
        if (arg2 == 36) {
            field493.method2617(69);
            field493.method2395(arg3);
            field493.method2406(arg0);
            field493.method2403(arg1);
            field411 = 0;
            Statics.field842 = class173.method2297(arg1);
            field412 = arg0;
        }
        if (arg2 == 24) {
            class173 var30 = class173.method2297(arg1);
            boolean var31 = true;
            if (var30.field2798 > 0) {
                var31 = method2659(var30);
            }
            if (var31) {
                field493.method2617(213);
                field493.method2351(arg1);
            }
        }
        if (arg2 == 13) {
            class35 var32 = field512[arg3];
            if (var32 != null) {
                field407 = arg6;
                field408 = arg7;
                field410 = 2;
                field409 = 0;
                field531 = arg0;
                field532 = arg1;
                field493.method2617(45);
                field493.method2392(class137.field2114[82] ? 1 : 0);
                field493.method2395(arg3);
            }
        }
        if (arg2 == 43) {
            field493.method2617(250);
            field493.method2406(arg3);
            field493.method2394(arg0);
            field493.method2403(arg1);
            field411 = 0;
            Statics.field842 = class173.method2297(arg1);
            field412 = arg0;
        }
        if (arg2 == 14) {
            class3 var33 = field296[arg3];
            if (var33 != null) {
                field407 = arg6;
                field408 = arg7;
                field410 = 2;
                field409 = 0;
                field531 = arg0;
                field532 = arg1;
                field493.method2617(245);
                field493.method2349(Statics.field202);
                field493.method2395(Statics.field2044);
                field493.method2406(arg3);
                field493.method2402(class137.field2114[82] ? 1 : 0);
                field493.method2403(Statics.field2071);
            }
        }
        if (arg2 == 4) {
            field407 = arg6;
            field408 = arg7;
            field410 = 2;
            field409 = 0;
            field531 = arg0;
            field532 = arg1;
            field493.method2617(153);
            field493.method2349(Statics.field2576 + arg0);
            field493.method2386(class137.field2114[82] ? 1 : 0);
            field493.method2406(Statics.field2133 + arg1);
            field493.method2395(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 42) {
            field493.method2617(52);
            field493.method2514(arg1);
            field493.method2394(arg3);
            field493.method2395(arg0);
            field411 = 0;
            Statics.field842 = class173.method2297(arg1);
            field412 = arg0;
        }
        if (arg2 == 19) {
            field407 = arg6;
            field408 = arg7;
            field410 = 2;
            field409 = 0;
            field531 = arg0;
            field532 = arg1;
            field493.method2617(130);
            field493.method2394(Statics.field2576 + arg0);
            field493.method2426(class137.field2114[82] ? 1 : 0);
            field493.method2395(Statics.field2133 + arg1);
            field493.method2395(arg3);
        }
        if (arg2 == 12) {
            class35 var34 = field512[arg3];
            if (var34 != null) {
                field407 = arg6;
                field408 = arg7;
                field410 = 2;
                field409 = 0;
                field531 = arg0;
                field532 = arg1;
                field493.method2617(200);
                field493.method2395(arg3);
                field493.method2426(class137.field2114[82] ? 1 : 0);
            }
        }
        if (arg2 == 15) {
            class3 var35 = field296[arg3];
            if (var35 != null) {
                field407 = arg6;
                field408 = arg7;
                field410 = 2;
                field409 = 0;
                field531 = arg0;
                field532 = arg1;
                field493.method2617(37);
                field493.method2349(arg3);
                field493.method2426(class137.field2114[82] ? 1 : 0);
                field493.method2403(Statics.field2584);
                field493.method2394(field486);
            }
        }
        if (arg2 == 37) {
            field493.method2617(129);
            field493.method2349(arg0);
            field493.method2514(arg1);
            field493.method2349(arg3);
            field411 = 0;
            Statics.field842 = class173.method2297(arg1);
            field412 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class173 var36 = class173.method1498(arg1, arg0);
            if (var36 != null) {
                int var37 = var36.field2752;
                class173 var38 = class173.method1498(arg1, arg0);
                if (var38 != null) {
                    if (var38.field2832 != null) {
                        class1 var39 = new class1();
                        var39.field3 = var38;
                        var39.field4 = arg3;
                        var39.field6 = arg5;
                        var39.field9 = var38.field2832;
                        class37.method179(var39);
                    }
                    boolean var40 = true;
                    if (var38.field2798 > 0) {
                        var40 = method2659(var38);
                    }
                    if (var40 && class178.method2280(method1237(var38), arg3 - 1)) {
                        if (arg3 == 1) {
                            field493.method2617(84);
                            field493.method2351(arg1);
                            field493.method2349(arg0);
                            field493.method2349(var37);
                        }
                        if (arg3 == 2) {
                            field493.method2617(202);
                            field493.method2351(arg1);
                            field493.method2349(arg0);
                            field493.method2349(var37);
                        }
                        if (arg3 == 3) {
                            field493.method2617(30);
                            field493.method2351(arg1);
                            field493.method2349(arg0);
                            field493.method2349(var37);
                        }
                        if (arg3 == 4) {
                            field493.method2617(134);
                            field493.method2351(arg1);
                            field493.method2349(arg0);
                            field493.method2349(var37);
                        }
                        if (arg3 == 5) {
                            field493.method2617(254);
                            field493.method2351(arg1);
                            field493.method2349(arg0);
                            field493.method2349(var37);
                        }
                        if (arg3 == 6) {
                            field493.method2617(182);
                            field493.method2351(arg1);
                            field493.method2349(arg0);
                            field493.method2349(var37);
                        }
                        if (arg3 == 7) {
                            field493.method2617(112);
                            field493.method2351(arg1);
                            field493.method2349(arg0);
                            field493.method2349(var37);
                        }
                        if (arg3 == 8) {
                            field493.method2617(211);
                            field493.method2351(arg1);
                            field493.method2349(arg0);
                            field493.method2349(var37);
                        }
                        if (arg3 == 9) {
                            field493.method2617(73);
                            field493.method2351(arg1);
                            field493.method2349(arg0);
                            field493.method2349(var37);
                        }
                        if (arg3 == 10) {
                            field493.method2617(209);
                            field493.method2351(arg1);
                            field493.method2349(arg0);
                            field493.method2349(var37);
                        }
                    }
                }
            }
        }
        if (arg2 == 49) {
            class3 var41 = field296[arg3];
            if (var41 != null) {
                field407 = arg6;
                field408 = arg7;
                field410 = 2;
                field409 = 0;
                field531 = arg0;
                field532 = arg1;
                field493.method2617(110);
                field493.method2426(class137.field2114[82] ? 1 : 0);
                field493.method2406(arg3);
            }
        }
        if (arg2 == 35) {
            field493.method2617(204);
            field493.method2403(arg1);
            field493.method2349(arg0);
            field493.method2349(arg3);
            field411 = 0;
            Statics.field842 = class173.method2297(arg1);
            field412 = arg0;
        }
        if (arg2 == 6) {
            field407 = arg6;
            field408 = arg7;
            field410 = 2;
            field409 = 0;
            field531 = arg0;
            field532 = arg1;
            field493.method2617(253);
            field493.method2394(Statics.field2133 + arg1);
            field493.method2394(Statics.field2576 + arg0);
            field493.method2406(arg3 >> 14 & 0x7FFF);
            field493.method2392(class137.field2114[82] ? 1 : 0);
        }
        if (arg2 == 51) {
            class3 var42 = field296[arg3];
            if (var42 != null) {
                field407 = arg6;
                field408 = arg7;
                field410 = 2;
                field409 = 0;
                field531 = arg0;
                field532 = arg1;
                field493.method2617(113);
                field493.method2349(arg3);
                field493.method2402(class137.field2114[82] ? 1 : 0);
            }
        }
        if (field404 != 0) {
            field404 = 0;
            Statics.method1777(class173.method2297(Statics.field2071));
        }
        if (field452) {
            method143();
        }
        if (Statics.field842 != null && field411 == 0) {
            Statics.method1777(Statics.field842);
        }
    }

    @ObfuscatedName("ah.cp(IIIII)V")
    public static void method727(int arg0, int arg1, int arg2, int arg3) {
        class173 var4 = class173.method1498(arg0, arg1);
        if (var4 != null && var4.field2833 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field9 = var4.field2833;
            class37.method179(var5);
        }
        field525 = arg3;
        field452 = true;
        Statics.field2584 = arg0;
        field486 = arg1;
        Statics.field712 = arg2;
        Statics.method1777(var4);
    }

    @ObfuscatedName("v.cr(I)V")
    public static void method143() {
        if (!field452) {
            return;
        }
        class173 var0 = class173.method1498(Statics.field2584, field486);
        if (var0 != null && var0.field2834 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field9 = var0.field2834;
            class37.method179(var1);
        }
        field452 = false;
        Statics.method1777(var0);
    }

    @ObfuscatedName("w.cu(III)V")
    public static void method132(int arg0, int arg1) {
        field493.method2617(181);
        field493.method2351(arg0);
        field493.method2406(arg1);
    }

    @ObfuscatedName("dc.cb(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2237(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field337 || field326 >= 500) {
            return;
        }
        field399[field326] = arg0;
        field445[field326] = arg1;
        field329[field326] = arg2;
        field443[field326] = arg3;
        field440[field326] = arg4;
        field455[field326] = arg5;
        field326++;
    }

    @ObfuscatedName("bk.cd(I)V")
    public static void method1196() {
        for (int var0 = 0; var0 < field326; var0++) {
            int var1 = field329[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field326 - 1) {
                    for (int var3 = var0; var3 < field326 - 1; var3++) {
                        field399[var3] = field399[var3 + 1];
                        field445[var3] = field445[var3 + 1];
                        field329[var3] = field329[var3 + 1];
                        field443[var3] = field443[var3 + 1];
                        field440[var3] = field440[var3 + 1];
                        field455[var3] = field455[var3 + 1];
                    }
                }
                field326--;
            }
        }
    }

    @ObfuscatedName("m.cg(II)Ljava/lang/String;")
    public static String method46(int arg0) {
        return field445[arg0].length() > 0 ? field399[arg0] + class157.field2441 + field445[arg0] : field399[arg0];
    }

    @ObfuscatedName("aj.cs(IIIII)V")
    public static final void method960(int arg0, int arg1, int arg2, int arg3) {
        if (field404 == 0 && !field452) {
            method2237(class157.field2451, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class105.field1853; var6++) {
            int var7 = class105.field1826[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field1793.method1853(Statics.field1961, var8, var9, var7) >= 0) {
                    class41 var12 = class41.method1009(var11);
                    if (var12.field966 != null) {
                        var12 = var12.method798();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field404 == 1) {
                        method2237(class157.field2446, field451 + " " + class2.field20 + " " + class2.method4(65535) + var12.field935, 1, var7, var8, var9);
                    } else if (!field452) {
                        String[] var13 = var12.field942;
                        if (field420) {
                            var13 = method130(var13);
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
                                    method2237(var13[var14], class2.method4(65535) + var12.field935, var15, var7, var8, var9);
                                }
                            }
                        }
                        method2237(class157.field2531, class2.method4(65535) + var12.field935, 1002, var12.field932 << 14, var8, var9);
                    } else if ((Statics.field712 & 0x4) == 4) {
                        method2237(field370, field456 + " " + class2.field20 + " " + class2.method4(65535) + var12.field935, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class35 var16 = field512[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field789.field917 == 1 && (var16.field828 & 0x7F) == 64 && (var16.field818 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field342; var17++) {
                            class35 var18 = field512[field311[var17]];
                            if (var18 != null && var16 != var18 && var18.field789.field917 == 1 && var16.field828 == var18.field828 && var16.field818 == var18.field818) {
                                method640(var18.field789, field311[var17], var8, var9);
                            }
                        }
                        int var19 = class33.field751;
                        int[] var20 = class33.field752;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class3 var22 = field296[var20[var21]];
                            if (var22 != null && var16.field828 == var22.field828 && var16.field818 == var22.field818) {
                                method623(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method640(var16.field789, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var23 = field296[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field828 & 0x7F) == 64 && (var23.field818 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field342; var24++) {
                            class35 var25 = field512[field311[var24]];
                            if (var25 != null && var25.field789.field917 == 1 && var23.field828 == var25.field828 && var23.field818 == var25.field818) {
                                method640(var25.field789, field311[var24], var8, var9);
                            }
                        }
                        int var26 = class33.field751;
                        int[] var27 = class33.field752;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class3 var29 = field296[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field828 == var29.field828 && var23.field818 == var29.field818) {
                                method623(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field429 == var11) {
                        var4 = var7;
                    } else {
                        method623(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class199 var30 = field430[Statics.field1961][var8][var9];
                    if (var30 != null) {
                        for (class29 var31 = (class29) var30.method3569(); var31 != null; var31 = (class29) var30.method3585()) {
                            class52 var32 = Statics.method975(var31.field682);
                            if (field404 == 1) {
                                method2237(class157.field2446, field451 + " " + class2.field20 + " " + class2.method4(16748608) + var32.field1117, 16, var31.field682, var8, var9);
                            } else if (!field452) {
                                String[] var33 = var32.field1135;
                                if (field420) {
                                    var33 = method130(var33);
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
                                        method2237(var33[var34], class2.method4(16748608) + var32.field1117, var35, var31.field682, var8, var9);
                                    } else if (var34 == 2) {
                                        method2237(class157.field2354, class2.method4(16748608) + var32.field1117, 20, var31.field682, var8, var9);
                                    }
                                }
                                method2237(class157.field2531, class2.method4(16748608) + var32.field1117, 1004, var31.field682, var8, var9);
                            } else if ((Statics.field712 & 0x1) == 1) {
                                method2237(field370, field456 + " " + class2.field20 + " " + class2.method4(16748608) + var32.field1117, 17, var31.field682, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class3 var38 = field296[field429];
            method623(var38, field429, var36, var37);
        }
    }

    @ObfuscatedName("af.cl(Lat;IIIB)V")
    public static final void method640(class40 arg0, int arg1, int arg2, int arg3) {
        if (field326 >= 400) {
            return;
        }
        if (arg0.field914 != null) {
            arg0 = arg0.method750();
        }
        if (arg0 == null || !arg0.field919 || arg0.field891 && field465 != arg1) {
            return;
        }
        String var4 = arg0.field889;
        if (arg0.field910 != 0) {
            int var6 = arg0.field910;
            int var7 = Statics.field2054.field30;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method4(16711680);
            } else if (var8 < -6) {
                var9 = class2.method4(16723968);
            } else if (var8 < -3) {
                var9 = class2.method4(16740352);
            } else if (var8 < 0) {
                var9 = class2.method4(16756736);
            } else if (var8 > 9) {
                var9 = class2.method4(65280);
            } else if (var8 > 6) {
                var9 = class2.method4(4259584);
            } else if (var8 > 3) {
                var9 = class2.method4(8453888);
            } else if (var8 > 0) {
                var9 = class2.method4(12648192);
            } else {
                var9 = class2.method4(16776960);
            }
            var4 = var4 + var9 + " " + class2.field19 + class157.field2471 + arg0.field910 + class2.field25;
        }
        if (field404 == 1) {
            method2237(class157.field2446, field451 + " " + class2.field20 + " " + class2.method4(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field452) {
            String[] var10 = arg0.field904;
            if (field420) {
                var10 = method130(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class157.field2448)) {
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
                        method2237(var10[var11], class2.method4(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class157.field2448)) {
                        short var14 = 0;
                        if (field444 != class21.field582) {
                            if (field444 == class21.field587 || field444 == class21.field590 && arg0.field910 > Statics.field2054.field30) {
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
                            method2237(var10[var13], class2.method4(16776960) + var4, var15, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method2237(class157.field2531, class2.method4(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field712 & 0x2) == 2) {
            method2237(field370, field456 + " " + class2.field20 + " " + class2.method4(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ab.cy(Lq;IIII)V")
    public static final void method623(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2054 == arg0 || field326 >= 400) {
            return;
        }
        String var9;
        if (arg0.field33 == 0) {
            String var4 = arg0.field29[0] + arg0.field52 + arg0.field29[1];
            int var5 = arg0.field30;
            int var6 = Statics.field2054.field30;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method4(16711680);
            } else if (var7 < -6) {
                var8 = class2.method4(16723968);
            } else if (var7 < -3) {
                var8 = class2.method4(16740352);
            } else if (var7 < 0) {
                var8 = class2.method4(16756736);
            } else if (var7 > 9) {
                var8 = class2.method4(65280);
            } else if (var7 > 6) {
                var8 = class2.method4(4259584);
            } else if (var7 > 3) {
                var8 = class2.method4(8453888);
            } else if (var7 > 0) {
                var8 = class2.method4(12648192);
            } else {
                var8 = class2.method4(16776960);
            }
            var9 = var4 + var8 + " " + class2.field19 + class157.field2471 + arg0.field30 + class2.field25 + arg0.field29[2];
        } else {
            var9 = arg0.field29[0] + arg0.field52 + arg0.field29[1] + " " + class2.field19 + class157.field2511 + arg0.field33 + class2.field25 + arg0.field29[2];
        }
        if (field404 == 1) {
            method2237(class157.field2446, field451 + " " + class2.field20 + " " + class2.method4(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field452) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field550[var10] != null) {
                    short var11 = 0;
                    if (field550[var10].equalsIgnoreCase(class157.field2448)) {
                        if (field325 == class21.field582) {
                            continue;
                        }
                        if (field325 == class21.field587 || field325 == class21.field590 && arg0.field30 > Statics.field2054.field30) {
                            var11 = 2000;
                        }
                        if (Statics.field2054.field48 != 0 && arg0.field48 != 0) {
                            if (Statics.field2054.field48 == arg0.field48) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field427[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field425[var10] + var11;
                    method2237(field550[var10], class2.method4(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field712 & 0x8) == 8) {
            method2237(field370, field456 + " " + class2.field20 + " " + class2.method4(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field326; var14++) {
            if (field329[var14] == 23) {
                field445[var14] = class2.method4(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("d.cv(IIIIIIIII)V")
    public static final void method187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class173.method584(arg0)) {
            Statics.field2898 = null;
            method3481(Statics.field2803[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2898 != null) {
                method3481(Statics.field2898, -1412584499, arg1, arg2, arg3, arg4, Statics.field26, Statics.field2256, arg7);
                Statics.field2898 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field502[var8] = true;
            }
        } else {
            field502[arg7] = true;
        }
    }

    @ObfuscatedName("ge.ct([Lfd;IIIIIIIII)V")
    public static final void method3481(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1703(arg2, arg3, arg4, arg5);
        class91.method1965();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class173 var10 = arg0[var9];
            if (var10 != null && (var10.field2831 == arg1 || arg1 == -1412584499 && field470 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field541[field500] = var10.field2830 + arg6;
                    field506[field500] = var10.field2758 + arg7;
                    field507[field500] = var10.field2759;
                    field508[field500] = var10.field2782;
                    var11 = ++field500 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2771 = var11;
                var10.field2857 = field577;
                if (!var10.field2743 || !method2688(var10)) {
                    if (var10.field2798 > 0) {
                        int var12 = var10.field2798;
                        if (var12 == 324) {
                            if (field571 == -1) {
                                field571 = var10.field2777;
                                field552 = var10.field2778;
                            }
                            if (field534.field2910) {
                                var10.field2777 = field571;
                            } else {
                                var10.field2777 = field552;
                            }
                        } else if (var12 == 325) {
                            if (field571 == -1) {
                                field571 = var10.field2777;
                                field552 = var10.field2778;
                            }
                            if (field534.field2910) {
                                var10.field2777 = field552;
                            } else {
                                var10.field2777 = field571;
                            }
                        } else if (var12 == 327) {
                            var10.field2793 = 150;
                            var10.field2794 = (int) (Math.sin((double) field577 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2785 = 5;
                            var10.field2786 = 0;
                        } else if (var12 == 328) {
                            var10.field2793 = 150;
                            var10.field2794 = (int) (Math.sin((double) field577 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2785 = 5;
                            var10.field2786 = 1;
                        }
                    }
                    int var13 = var10.field2830 + arg6;
                    int var14 = var10.field2758 + arg7;
                    int var15 = var10.field2774;
                    if (field470 == var10) {
                        if (arg1 != -1412584499 && !var10.field2748) {
                            Statics.field2898 = arg0;
                            Statics.field26 = arg6;
                            Statics.field2256 = arg7;
                            continue;
                        }
                        if (field481 && field475) {
                            int var16 = class140.field2144;
                            int var17 = class140.field2138;
                            int var18 = var16 - field472;
                            int var19 = var17 - field473;
                            if (var18 < field476) {
                                var18 = field476;
                            }
                            if (var10.field2759 + var18 > field476 + field463.field2759) {
                                var18 = field476 + field463.field2759 - var10.field2759;
                            }
                            if (var19 < field477) {
                                var19 = field477;
                            }
                            if (var10.field2782 + var19 > field477 + field463.field2782) {
                                var19 = field477 + field463.field2782 - var10.field2782;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2748) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2746 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2746 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2759 + var13;
                        int var27 = var10.field2782 + var14;
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
                        int var30 = var10.field2759 + var13;
                        int var31 = var10.field2782 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2743 || var20 < var22 && var21 < var23) {
                        if (var10.field2798 != 0) {
                            if (var10.field2798 == 1336) {
                                if (field314) {
                                    var14 += 15;
                                    Statics.field1006.method3788("Fps:" + field2184, var10.field2759 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field303) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field303) {
                                        var34 = 16711680;
                                    }
                                    Statics.field1006.method3788("Mem:" + var33 + "k", var10.field2759 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2798 == 1337) {
                                field446 = var13;
                                field417 = var14;
                                method3684(var13, var14, var10.field2759, var10.field2782);
                                field502[var10.field2771] = true;
                                class80.method1703(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2798 == 1338) {
                                method306();
                                class175 var35 = var10.method3203(false);
                                if (var35 != null) {
                                    class80.method1703(var13, var14, var35.field2890 + var13, var35.field2894 + var14);
                                    if (field494 == 2 || field494 == 5) {
                                        class80.method1717(var13, var14, 0, var35.field2892, var35.field2891);
                                    } else {
                                        int var36 = field489 + field347 & 0x7FF;
                                        int var37 = Statics.field2054.field828 / 32 + 48;
                                        int var38 = 464 - Statics.field2054.field818 / 32;
                                        Statics.field921.method1669(var13, var14, var35.field2890, var35.field2894, var37, var38, var36, field372 + 256, var35.field2892, var35.field2891);
                                        for (int var39 = 0; var39 < field392; var39++) {
                                            int var40 = field471[var39] * 4 + 2 - Statics.field2054.field828 / 32;
                                            int var41 = field529[var39] * 4 + 2 - Statics.field2054.field818 / 32;
                                            method5(var13, var14, var40, var41, field530[var39], var35);
                                        }
                                        int var42 = 0;
                                        while (true) {
                                            if (var42 >= 104) {
                                                for (int var47 = 0; var47 < field342; var47++) {
                                                    class35 var48 = field512[field311[var47]];
                                                    if (var48 != null && var48.method28()) {
                                                        class40 var49 = var48.field789;
                                                        if (var49 != null && var49.field914 != null) {
                                                            var49 = var49.method750();
                                                        }
                                                        if (var49 != null && var49.field905 && var49.field919) {
                                                            int var50 = var48.field828 / 32 - Statics.field2054.field828 / 32;
                                                            int var51 = var48.field818 / 32 - Statics.field2054.field818 / 32;
                                                            method5(var13, var14, var50, var51, Statics.field1539[1], var35);
                                                        }
                                                    }
                                                }
                                                int var52 = class33.field751;
                                                int[] var53 = class33.field752;
                                                for (int var54 = 0; var54 < var52; var54++) {
                                                    class3 var55 = field296[var53[var54]];
                                                    if (var55 != null && var55.method28() && !var55.field49 && Statics.field2054 != var55) {
                                                        int var56 = var55.field828 / 32 - Statics.field2054.field828 / 32;
                                                        int var57 = var55.field818 / 32 - Statics.field2054.field818 / 32;
                                                        boolean var58 = false;
                                                        if (method1785(var55.field52, true)) {
                                                            var58 = true;
                                                        }
                                                        boolean var59 = false;
                                                        for (int var60 = 0; var60 < Statics.field245; var60++) {
                                                            if (var55.field52.equals(Statics.field2075[var60].field636)) {
                                                                var59 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var61 = false;
                                                        if (Statics.field2054.field48 != 0 && var55.field48 != 0 && Statics.field2054.field48 == var55.field48) {
                                                            var61 = true;
                                                        }
                                                        if (var58) {
                                                            method5(var13, var14, var56, var57, Statics.field1539[3], var35);
                                                        } else if (var61) {
                                                            method5(var13, var14, var56, var57, Statics.field1539[4], var35);
                                                        } else if (var59) {
                                                            method5(var13, var14, var56, var57, Statics.field1539[5], var35);
                                                        } else {
                                                            method5(var13, var14, var56, var57, Statics.field1539[2], var35);
                                                        }
                                                    }
                                                }
                                                if (field316 != 0 && field577 % 20 < 10) {
                                                    if (field316 == 1 && field516 >= 0 && field516 < field512.length) {
                                                        class35 var62 = field512[field516];
                                                        if (var62 != null) {
                                                            int var63 = var62.field828 / 32 - Statics.field2054.field828 / 32;
                                                            int var64 = var62.field818 / 32 - Statics.field2054.field818 / 32;
                                                            Statics.method123(var13, var14, var63, var64, Statics.field1380[1], var35);
                                                        }
                                                    }
                                                    if (field316 == 2) {
                                                        int var65 = field319 * 4 - Statics.field2576 * 4 + 2 - Statics.field2054.field828 / 32;
                                                        int var66 = field320 * 4 - Statics.field2133 * 4 + 2 - Statics.field2054.field818 / 32;
                                                        Statics.method123(var13, var14, var65, var66, Statics.field1380[1], var35);
                                                    }
                                                    if (field316 == 10 && field318 >= 0 && field318 < field296.length) {
                                                        class3 var67 = field296[field318];
                                                        if (var67 != null) {
                                                            int var68 = var67.field828 / 32 - Statics.field2054.field828 / 32;
                                                            int var69 = var67.field818 / 32 - Statics.field2054.field818 / 32;
                                                            Statics.method123(var13, var14, var68, var69, Statics.field1380[1], var35);
                                                        }
                                                    }
                                                }
                                                if (field531 != 0) {
                                                    int var70 = field531 * 4 + 2 - Statics.field2054.field828 / 32;
                                                    int var71 = field532 * 4 + 2 - Statics.field2054.field818 / 32;
                                                    method5(var13, var14, var70, var71, Statics.field1380[0], var35);
                                                }
                                                if (!Statics.field2054.field49) {
                                                    class80.method1746(var35.field2890 / 2 + var13 - 1, var35.field2894 / 2 + var14 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var43 = 0; var43 < 104; var43++) {
                                                class199 var44 = field430[Statics.field1961][var42][var43];
                                                if (var44 != null) {
                                                    int var45 = var42 * 4 + 2 - Statics.field2054.field828 / 32;
                                                    int var46 = var43 * 4 + 2 - Statics.field2054.field818 / 32;
                                                    method5(var13, var14, var45, var46, Statics.field1539[0], var35);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                    field503[var11] = true;
                                }
                                class80.method1703(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2798 == 1339) {
                                class175 var72 = var10.method3203(false);
                                if (var72 != null) {
                                    if (field494 < 3) {
                                        Statics.field1373.method1669(var13, var14, var72.field2890, var72.field2894, 25, 25, field347, 256, var72.field2892, var72.field2891);
                                    } else {
                                        class80.method1717(var13, var14, 0, var72.field2892, var72.field2891);
                                    }
                                }
                                class80.method1703(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2746 == 0) {
                            if (!var10.field2743 && method2688(var10) && Statics.field1794 != var10) {
                                continue;
                            }
                            if (!var10.field2743) {
                                if (var10.field2766 > var10.field2768 - var10.field2782) {
                                    var10.field2766 = var10.field2768 - var10.field2782;
                                }
                                if (var10.field2766 < 0) {
                                    var10.field2766 = 0;
                                }
                            }
                            method3481(arg0, var10.field2744, var20, var21, var22, var23, var13 - var10.field2765, var14 - var10.field2766, var11);
                            if (var10.field2866 != null) {
                                method3481(var10.field2866, var10.field2744, var20, var21, var22, var23, var13 - var10.field2765, var14 - var10.field2766, var11);
                            }
                            class4 var73 = (class4) field458.method3532((long) var10.field2744);
                            if (var73 != null) {
                                method187(var73.field62, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class80.method1703(arg2, arg3, arg4, arg5);
                            class91.method1965();
                        }
                        if (field511 || field504[var11] || field509 > 1) {
                            if (var10.field2746 == 0 && !var10.field2743 && var10.field2768 > var10.field2782) {
                                method8(var10.field2759 + var13, var14, var10.field2766, var10.field2782, var10.field2768);
                            }
                            if (var10.field2746 != 1) {
                                if (var10.field2746 == 2) {
                                    int var74 = 0;
                                    for (int var75 = 0; var75 < var10.field2756; var75++) {
                                        for (int var76 = 0; var76 < var10.field2755; var76++) {
                                            int var77 = (var10.field2808 + 32) * var76 + var13;
                                            int var78 = (var10.field2809 + 32) * var75 + var14;
                                            if (var74 < 20) {
                                                var77 += var10.field2810[var74];
                                                var78 += var10.field2836[var74];
                                            }
                                            if (var10.field2860[var74] > 0) {
                                                boolean var79 = false;
                                                boolean var80 = false;
                                                int var81 = var10.field2860[var74] - 1;
                                                if (var77 + 32 > arg2 && var77 < arg4 && var78 + 32 > arg3 && var78 < arg5 || Statics.field1965 == var10 && field413 == var74) {
                                                    class79 var82;
                                                    if (field404 == 1 && Statics.field202 == var74 && Statics.field2071 == var10.field2744) {
                                                        var82 = class52.method2794(var81, var10.field2861[var74], 2, 0, 2, false);
                                                    } else {
                                                        var82 = class52.method2794(var81, var10.field2861[var74], 1, 3153952, 2, false);
                                                    }
                                                    if (var82 == null) {
                                                        Statics.method1777(var10);
                                                    } else if (Statics.field1965 == var10 && field413 == var74) {
                                                        int var83 = class140.field2144 - field327;
                                                        int var84 = class140.field2138 - field533;
                                                        if (var83 < 5 && var83 > -5) {
                                                            var83 = 0;
                                                        }
                                                        if (var84 < 5 && var84 > -5) {
                                                            var84 = 0;
                                                        }
                                                        if (field309 < 5) {
                                                            var83 = 0;
                                                            var84 = 0;
                                                        }
                                                        var82.method1630(var77 + var83, var78 + var84, 128);
                                                        if (arg1 != -1) {
                                                            class173 var85 = arg0[arg1 & 0xFFFF];
                                                            if (var78 + var84 < class80.field1425 && var85.field2766 > 0) {
                                                                int var86 = field428 * (class80.field1425 - var78 - var84) / 3;
                                                                if (var86 > field428 * 10) {
                                                                    var86 = field428 * 10;
                                                                }
                                                                if (var86 > var85.field2766) {
                                                                    var86 = var85.field2766;
                                                                }
                                                                var85.field2766 -= var86;
                                                                field533 += var86;
                                                                Statics.method1777(var85);
                                                            }
                                                            if (var78 + var84 + 32 > class80.field1427 && var85.field2766 < var85.field2768 - var85.field2782) {
                                                                int var87 = field428 * (var78 + var84 + 32 - class80.field1427) / 3;
                                                                if (var87 > field428 * 10) {
                                                                    var87 = field428 * 10;
                                                                }
                                                                if (var87 > var85.field2768 - var85.field2782 - var85.field2766) {
                                                                    var87 = var85.field2768 - var85.field2782 - var85.field2766;
                                                                }
                                                                var85.field2766 += var87;
                                                                field533 -= var87;
                                                                Statics.method1777(var85);
                                                            }
                                                        }
                                                    } else if (Statics.field842 == var10 && field412 == var74) {
                                                        var82.method1630(var77, var78, 128);
                                                    } else {
                                                        var82.method1624(var77, var78);
                                                    }
                                                }
                                            } else if (var10.field2873 != null && var74 < 20) {
                                                class79 var88 = var10.method3188(var74);
                                                if (var88 != null) {
                                                    var88.method1624(var77, var78);
                                                } else if (class173.field2790) {
                                                    Statics.method1777(var10);
                                                }
                                            }
                                            var74++;
                                        }
                                    }
                                } else if (var10.field2746 == 3) {
                                    int var89;
                                    if (method2240(var10)) {
                                        var89 = var10.field2741;
                                        if (Statics.field1794 == var10 && var10.field2772 != 0) {
                                            var89 = var10.field2772;
                                        }
                                    } else {
                                        var89 = var10.field2769;
                                        if (Statics.field1794 == var10 && var10.field2853 != 0) {
                                            var89 = var10.field2853;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2773) {
                                            class80.method1746(var13, var14, var10.field2759, var10.field2782, var89);
                                        } else {
                                            class80.method1714(var13, var14, var10.field2759, var10.field2782, var89);
                                        }
                                    } else if (var10.field2773) {
                                        class80.method1708(var13, var14, var10.field2759, var10.field2782, var89, 256 - (var15 & 0xFF));
                                    } else {
                                        class80.method1711(var13, var14, var10.field2759, var10.field2782, var89, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2746 == 4) {
                                    class224 var90 = var10.method3187();
                                    if (var90 != null) {
                                        String var91 = var10.field2826;
                                        int var92;
                                        if (method2240(var10)) {
                                            var92 = var10.field2741;
                                            if (Statics.field1794 == var10 && var10.field2772 != 0) {
                                                var92 = var10.field2772;
                                            }
                                            if (var10.field2835.length() > 0) {
                                                var91 = var10.field2835;
                                            }
                                        } else {
                                            var92 = var10.field2769;
                                            if (Statics.field1794 == var10 && var10.field2853 != 0) {
                                                var92 = var10.field2853;
                                            }
                                        }
                                        if (var10.field2743 && var10.field2752 != -1) {
                                            class52 var93 = Statics.method975(var10.field2752);
                                            var91 = var93.field1117;
                                            if (var91 == null) {
                                                var91 = "null";
                                            }
                                            if ((var93.field1109 == 1 || var10.field2875 != 1) && var10.field2875 != -1) {
                                                var91 = class2.method4(16748608) + var91 + class2.field22 + " " + 'x' + method101(var10.field2875);
                                            }
                                        }
                                        if (field461 == var10) {
                                            class157 var10000 = (class157) null;
                                            var91 = class157.field2297;
                                            var92 = var10.field2769;
                                        }
                                        if (!var10.field2743) {
                                            var91 = method3236(var91, var10);
                                        }
                                        var90.method3759(var91, var13, var14, var10.field2759, var10.field2782, var92, var10.field2862 ? 0 : -1, var10.field2805, var10.field2806, var10.field2812);
                                    } else if (class173.field2790) {
                                        Statics.method1777(var10);
                                    }
                                } else if (var10.field2746 == 5) {
                                    if (var10.field2743) {
                                        class79 var95;
                                        if (var10.field2752 == -1) {
                                            var95 = var10.method3200(false);
                                        } else {
                                            var95 = class52.method2794(var10.field2752, var10.field2875, var10.field2828, var10.field2739, var10.field2800, false);
                                        }
                                        if (var95 != null) {
                                            int var96 = var95.field1416;
                                            int var97 = var95.field1417;
                                            if (var10.field2780) {
                                                class80.method1704(var13, var14, var10.field2759 + var13, var10.field2782 + var14);
                                                int var98 = (var10.field2759 + (var96 - 1)) / var96;
                                                int var99 = (var10.field2782 + (var97 - 1)) / var97;
                                                for (int var100 = 0; var100 < var98; var100++) {
                                                    for (int var101 = 0; var101 < var99; var101++) {
                                                        if (var10.field2760 != 0) {
                                                            var95.method1637(var96 / 2 + var96 * var100 + var13, var97 / 2 + var97 * var101 + var14, var10.field2760, 4096);
                                                        } else if (var15 == 0) {
                                                            var95.method1624(var96 * var100 + var13, var97 * var101 + var14);
                                                        } else {
                                                            var95.method1630(var96 * var100 + var13, var97 * var101 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1703(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var102 = var10.field2759 * 4096 / var96;
                                                if (var10.field2760 != 0) {
                                                    var95.method1637(var10.field2759 / 2 + var13, var10.field2782 / 2 + var14, var10.field2760, var102);
                                                } else if (var15 != 0) {
                                                    var95.method1632(var13, var14, var10.field2759, var10.field2782, 256 - (var15 & 0xFF));
                                                } else if (var10.field2759 == var96 && var10.field2782 == var97) {
                                                    var95.method1624(var13, var14);
                                                } else {
                                                    var95.method1626(var13, var14, var10.field2759, var10.field2782);
                                                }
                                            }
                                        } else if (class173.field2790) {
                                            Statics.method1777(var10);
                                        }
                                    } else {
                                        class79 var94 = var10.method3200(method2240(var10));
                                        if (var94 != null) {
                                            var94.method1624(var13, var14);
                                        } else if (class173.field2790) {
                                            Statics.method1777(var10);
                                        }
                                    }
                                } else if (var10.field2746 == 6) {
                                    boolean var103 = method2240(var10);
                                    int var104;
                                    if (var103) {
                                        var104 = var10.field2742;
                                    } else {
                                        var104 = var10.field2789;
                                    }
                                    class105 var105 = null;
                                    int var106 = 0;
                                    if (var10.field2752 != -1) {
                                        class52 var107 = Statics.method975(var10.field2752);
                                        if (var107 != null) {
                                            class52 var108 = var107.method1045(var10.field2875);
                                            var105 = var108.method1018(1);
                                            if (var105 == null) {
                                                Statics.method1777(var10);
                                            } else {
                                                var105.method2161();
                                                var106 = var105.field1462 / 2;
                                            }
                                        }
                                    } else if (var10.field2785 == 5) {
                                        if (var10.field2786 == 0) {
                                            var105 = field534.method3271((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var105 = Statics.field2054.method16();
                                        }
                                    } else if (var104 == -1) {
                                        var105 = var10.method3189((class43) null, -1, var103, Statics.field2054.field50);
                                        if (var105 == null && class173.field2790) {
                                            Statics.method1777(var10);
                                        }
                                    } else {
                                        class43 var109 = Statics.method653(var104);
                                        var105 = var10.method3189(var109, var10.field2864, var103, Statics.field2054.field50);
                                        if (var105 == null && class173.field2790) {
                                            Statics.method1777(var10);
                                        }
                                    }
                                    class91.method2021(var10.field2759 / 2 + var13, var10.field2782 / 2 + var14);
                                    int var110 = var10.field2796 * class91.field1579[var10.field2793] >> 16;
                                    int var111 = var10.field2796 * class91.field1591[var10.field2793] >> 16;
                                    if (var105 != null) {
                                        if (var10.field2743) {
                                            var105.method2161();
                                            if (var10.field2799) {
                                                var105.method2189(0, var10.field2794, var10.field2795, var10.field2793, var10.field2791, var10.field2792 + var106 + var110, var10.field2792 + var111, var10.field2796);
                                            } else {
                                                var105.method2179(0, var10.field2794, var10.field2795, var10.field2793, var10.field2791, var10.field2792 + var106 + var110, var10.field2792 + var111);
                                            }
                                        } else {
                                            var105.method2179(0, var10.field2794, 0, var10.field2793, 0, var110, var111);
                                        }
                                    }
                                    class91.method1964();
                                } else {
                                    if (var10.field2746 == 7) {
                                        class224 var112 = var10.method3187();
                                        if (var112 == null) {
                                            if (class173.field2790) {
                                                Statics.method1777(var10);
                                            }
                                            continue;
                                        }
                                        int var113 = 0;
                                        for (int var114 = 0; var114 < var10.field2756; var114++) {
                                            for (int var115 = 0; var115 < var10.field2755; var115++) {
                                                if (var10.field2860[var113] > 0) {
                                                    class52 var116 = Statics.method975(var10.field2860[var113] - 1);
                                                    String var117;
                                                    if (var116.field1109 != 1 && var10.field2861[var113] == 1) {
                                                        var117 = class2.method4(16748608) + var116.field1117 + class2.field22;
                                                    } else {
                                                        var117 = class2.method4(16748608) + var116.field1117 + class2.field22 + " " + 'x' + method101(var10.field2861[var113]);
                                                    }
                                                    int var118 = (var10.field2808 + 115) * var115 + var13;
                                                    int var119 = (var10.field2809 + 12) * var114 + var14;
                                                    if (var10.field2805 == 0) {
                                                        var112.method3796(var117, var118, var119, var10.field2769, var10.field2862 ? 0 : -1);
                                                    } else if (var10.field2805 == 1) {
                                                        var112.method3771(var117, var10.field2759 / 2 + var118, var119, var10.field2769, var10.field2862 ? 0 : -1);
                                                    } else {
                                                        var112.method3788(var117, var10.field2759 + var118 - 1, var119, var10.field2769, var10.field2862 ? 0 : -1);
                                                    }
                                                }
                                                var113++;
                                            }
                                        }
                                    }
                                    if (var10.field2746 == 8 && Statics.field156 == var10 && field449 == field448) {
                                        int var120 = 0;
                                        int var121 = 0;
                                        class224 var122 = Statics.field1006;
                                        String var123 = var10.field2826;
                                        String var124 = method3236(var123, var10);
                                        while (var124.length() > 0) {
                                            int var125 = var124.indexOf(class2.field15);
                                            String var126;
                                            if (var125 == -1) {
                                                var126 = var124;
                                                var124 = "";
                                            } else {
                                                var126 = var124.substring(0, var125);
                                                var124 = var124.substring(var125 + 4);
                                            }
                                            int var127 = var122.method3764(var126);
                                            if (var127 > var120) {
                                                var120 = var127;
                                            }
                                            var121 += var122.field3175 + 1;
                                        }
                                        var120 += 6;
                                        var121 += 7;
                                        int var128 = var10.field2759 + var13 - 5 - var120;
                                        int var129 = var10.field2782 + var14 + 5;
                                        if (var128 < var13 + 5) {
                                            var128 = var13 + 5;
                                        }
                                        if (var120 + var128 > arg4) {
                                            var128 = arg4 - var120;
                                        }
                                        if (var121 + var129 > arg5) {
                                            var129 = arg5 - var121;
                                        }
                                        class80.method1746(var128, var129, var120, var121, 16777120);
                                        class80.method1714(var128, var129, var120, var121, 0);
                                        String var130 = var10.field2826;
                                        int var131 = var122.field3175 + var129 + 2;
                                        String var132 = method3236(var130, var10);
                                        while (var132.length() > 0) {
                                            int var133 = var132.indexOf(class2.field15);
                                            String var134;
                                            if (var133 == -1) {
                                                var134 = var132;
                                                var132 = "";
                                            } else {
                                                var134 = var132.substring(0, var133);
                                                var132 = var132.substring(var133 + 4);
                                            }
                                            var122.method3796(var134, var128 + 3, var131, 0, -1);
                                            var131 += var122.field3175 + 1;
                                        }
                                    }
                                    if (var10.field2746 == 9) {
                                        if (var10.field2775 == 1) {
                                            int var135;
                                            int var136;
                                            int var137;
                                            int var138;
                                            if (var10.field2776) {
                                                var135 = var13;
                                                var136 = var10.field2782 + var14;
                                                var137 = var10.field2759 + var13;
                                                var138 = var14;
                                            } else {
                                                var135 = var13;
                                                var136 = var14;
                                                var137 = var10.field2759 + var13;
                                                var138 = var10.field2782 + var14;
                                            }
                                            class80.method1716(var135, var136, var137, var138, var10.field2769);
                                        } else {
                                            int var139 = var10.field2759 >= 0 ? var10.field2759 : -var10.field2759;
                                            int var140 = var10.field2782 >= 0 ? var10.field2782 : -var10.field2782;
                                            int var141 = var139;
                                            if (var139 < var140) {
                                                var141 = var140;
                                            }
                                            if (var141 != 0) {
                                                int var142 = (var10.field2759 << 16) / var141;
                                                int var143 = (var10.field2782 << 16) / var141;
                                                if (var143 <= var142) {
                                                    var142 = -var142;
                                                } else {
                                                    var143 = -var143;
                                                }
                                                int var144 = var10.field2775 * var143 >> 17;
                                                int var145 = var10.field2775 * var143 + 1 >> 17;
                                                int var146 = var10.field2775 * var142 >> 17;
                                                int var147 = var10.field2775 * var142 + 1 >> 17;
                                                int var148 = var13 + var144;
                                                int var149 = var13 - var145;
                                                int var150 = var10.field2759 + var13 - var145;
                                                int var151 = var10.field2759 + var13 + var144;
                                                int var152 = var14 + var146;
                                                int var153 = var14 - var147;
                                                int var154 = var10.field2782 + var14 - var147;
                                                int var155 = var10.field2782 + var14 + var146;
                                                class91.method1979(var148, var149, var150);
                                                class91.method1975(var152, var153, var154, var148, var149, var150, var10.field2769);
                                                class91.method1979(var148, var150, var151);
                                                class91.method1975(var152, var154, var155, var148, var150, var151, var10.field2769);
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

    @ObfuscatedName("fk.ck(Ljava/lang/String;Lfd;B)Ljava/lang/String;")
    public static String method3236(String arg0, class173 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method161(method151(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field2160 != null) {
                    var5 = class163.method44(Statics.field2160.field2203);
                    if (Statics.field2160.field2205 != null) {
                        var5 = (String) Statics.field2160.field2205;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("n.cm(II)Ljava/lang/String;")
    public static final String method101(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field27 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method4(65408) + var1.substring(0, var1.length() - 8) + class157.field2457 + " " + class2.field19 + var1 + class2.field25 + class2.field22;
        } else if (var1.length() > 6) {
            return " " + class2.method4(16777215) + var1.substring(0, var1.length() - 4) + class157.field2464 + " " + class2.field19 + var1 + class2.field25 + class2.field22;
        } else {
            return " " + class2.method4(16776960) + var1 + class2.field22;
        }
    }

    @ObfuscatedName("cq.cc(ZB)V")
    public static final void method2042(boolean arg0) {
        method558(field457, Statics.field882, Statics.field158, arg0);
    }

    @ObfuscatedName("aj.cq(Lfd;I)V")
    public static void method959(class173 arg0) {
        class173 var1 = arg0.field2831 == -1 ? null : class173.method2297(arg0.field2831);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field882;
            var3 = Statics.field158;
        } else {
            var2 = var1.field2759;
            var3 = var1.field2782;
        }
        method7(arg0, var2, var3, false);
        method648(arg0, var2, var3);
    }

    @ObfuscatedName("dl.ca([Lfd;Lfd;ZI)V")
    public static void method2640(class173[] arg0, class173 arg1, boolean arg2) {
        int var3 = arg1.field2767 == 0 ? arg1.field2759 : arg1.field2767;
        int var4 = arg1.field2768 == 0 ? arg1.field2782 : arg1.field2768;
        method119(arg0, arg1.field2744, var3, var4, arg2);
        if (arg1.field2866 != null) {
            method119(arg1.field2866, arg1.field2744, var3, var4, arg2);
        }
        class4 var5 = (class4) field458.method3532((long) arg1.field2744);
        if (var5 != null) {
            method558(var5.field62, var3, var4, arg2);
        }
        if (arg1.field2798 == 1337) {
        }
    }

    @ObfuscatedName("a.ci(IIIZI)V")
    public static final void method558(int arg0, int arg1, int arg2, boolean arg3) {
        if (class173.method584(arg0)) {
            method119(Statics.field2803[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("l.cn([Lfd;IIIZI)V")
    public static void method119(class173[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class173 var6 = arg0[var5];
            if (var6 != null && var6.field2831 == arg1) {
                method7(var6, arg2, arg3, arg4);
                method648(var6, arg2, arg3);
                if (var6.field2765 > var6.field2767 - var6.field2759) {
                    var6.field2765 = var6.field2767 - var6.field2759;
                }
                if (var6.field2765 < 0) {
                    var6.field2765 = 0;
                }
                if (var6.field2766 > var6.field2768 - var6.field2782) {
                    var6.field2766 = var6.field2768 - var6.field2782;
                }
                if (var6.field2766 < 0) {
                    var6.field2766 = 0;
                }
                if (var6.field2746 == 0) {
                    method2640(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("s.cw(Lfd;IIZB)V")
    public static void method7(class173 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2759;
        int var5 = arg0.field2782;
        if (arg0.field2751 == 0) {
            arg0.field2759 = arg0.field2755;
        } else if (arg0.field2751 == 1) {
            arg0.field2759 = arg1 - arg0.field2755;
        } else if (arg0.field2751 == 2) {
            arg0.field2759 = arg0.field2755 * arg1 >> 14;
        }
        if (arg0.field2788 == 0) {
            arg0.field2782 = arg0.field2756;
        } else if (arg0.field2788 == 1) {
            arg0.field2782 = arg2 - arg0.field2756;
        } else if (arg0.field2788 == 2) {
            arg0.field2782 = arg0.field2756 * arg2 >> 14;
        }
        if (arg0.field2751 == 4) {
            arg0.field2759 = arg0.field2782 * arg0.field2761 / arg0.field2733;
        }
        if (arg0.field2788 == 4) {
            arg0.field2782 = arg0.field2759 * arg0.field2733 / arg0.field2761;
        }
        if (field339 && arg0.field2746 == 0) {
            if (arg0.field2782 < 5 && arg0.field2759 < 5) {
                arg0.field2782 = 5;
                arg0.field2759 = 5;
            } else {
                if (arg0.field2782 <= 0) {
                    arg0.field2782 = 5;
                }
                if (arg0.field2759 <= 0) {
                    arg0.field2759 = 5;
                }
            }
        }
        if (arg0.field2798 == 1337) {
            field469 = arg0;
        }
        if (arg3 && arg0.field2820 != null && (arg0.field2759 != var4 || arg0.field2782 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field9 = arg0.field2820;
            field496.method3559(var6);
        }
    }

    @ObfuscatedName("ae.cj(Lfd;III)V")
    public static void method648(class173 arg0, int arg1, int arg2) {
        if (arg0.field2749 == 0) {
            arg0.field2830 = arg0.field2870;
        } else if (arg0.field2749 == 1) {
            arg0.field2830 = (arg1 - arg0.field2759) / 2 + arg0.field2870;
        } else if (arg0.field2749 == 2) {
            arg0.field2830 = arg1 - arg0.field2759 - arg0.field2870;
        } else if (arg0.field2749 == 3) {
            arg0.field2830 = arg0.field2870 * arg1 >> 14;
        } else if (arg0.field2749 == 4) {
            arg0.field2830 = (arg0.field2870 * arg1 >> 14) + (arg1 - arg0.field2759) / 2;
        } else {
            arg0.field2830 = arg1 - arg0.field2759 - (arg0.field2870 * arg1 >> 14);
        }
        if (arg0.field2750 == 0) {
            arg0.field2758 = arg0.field2754;
        } else if (arg0.field2750 == 1) {
            arg0.field2758 = (arg2 - arg0.field2782) / 2 + arg0.field2754;
        } else if (arg0.field2750 == 2) {
            arg0.field2758 = arg2 - arg0.field2782 - arg0.field2754;
        } else if (arg0.field2750 == 3) {
            arg0.field2758 = arg0.field2754 * arg2 >> 14;
        } else if (arg0.field2750 == 4) {
            arg0.field2758 = (arg0.field2754 * arg2 >> 14) + (arg2 - arg0.field2782) / 2;
        } else {
            arg0.field2758 = arg2 - arg0.field2782 - (arg0.field2754 * arg2 >> 14);
        }
        if (!field339 || arg0.field2746 != 0) {
            return;
        }
        if (arg0.field2830 < 0) {
            arg0.field2830 = 0;
        } else if (arg0.field2830 + arg0.field2759 > arg1) {
            arg0.field2830 = arg1 - arg0.field2759;
        }
        if (arg0.field2758 < 0) {
            arg0.field2758 = 0;
        } else if (arg0.field2782 + arg0.field2758 > arg2) {
            arg0.field2758 = arg2 - arg0.field2782;
        }
    }

    @ObfuscatedName("s.cf(IIIIII)V")
    public static final void method8(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field293[0].method1759(arg0, arg1);
        Statics.field293[1].method1759(arg0, arg1 + arg3 - 16);
        class80.method1746(arg0, arg1 + 16, 16, arg3 - 32, field377);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class80.method1746(arg0, arg1 + 16 + var6, 16, var5, field378);
        class80.method1718(arg0, arg1 + 16 + var6, var5, field380);
        class80.method1718(arg0 + 1, arg1 + 16 + var6, var5, field380);
        class80.method1741(arg0, arg1 + 16 + var6, 16, field380);
        class80.method1741(arg0, arg1 + 17 + var6, 16, field380);
        class80.method1718(arg0 + 15, arg1 + 16 + var6, var5, field379);
        class80.method1718(arg0 + 14, arg1 + 17 + var6, var5 - 1, field379);
        class80.method1741(arg0, arg1 + 15 + var6 + var5, 16, field379);
        class80.method1741(arg0 + 1, arg1 + 14 + var6 + var5, 15, field379);
    }

    @ObfuscatedName("z.cx(IB)Ljava/lang/String;")
    public static final String method161(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("dc.ce(Lfd;I)Z")
    public static final boolean method2240(class173 arg0) {
        if (arg0.field2855 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2855.length; var1++) {
            int var2 = method151(arg0, var1);
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

    @ObfuscatedName("o.co(Lfd;II)I")
    public static final int method151(class173 arg0, int arg1) {
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
                    var7 = field382[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field435[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field436[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class173 var11 = class173.method2297(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!Statics.method975(var12).field1134 || field570)) {
                        for (int var13 = 0; var13 < var11.field2860.length; var13++) {
                            if (var12 + 1 == var11.field2860[var13]) {
                                var7 += var11.field2861[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class176.field2900[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class155.field2281[field435[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class176.field2900[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2054.field30;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class155.field2278[var14]) {
                            var7 += field435[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class173 var17 = class173.method2297(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!Statics.method975(var18).field1134 || field570)) {
                        for (int var19 = 0; var19 < var17.field2860.length; var19++) {
                            if (var18 + 1 == var17.field2860[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field358;
                }
                if (var6 == 12) {
                    var7 = field431;
                }
                if (var6 == 13) {
                    int var20 = class176.field2900[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class176.method1774(var22);
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
                    var7 = (Statics.field2054.field828 >> 7) + Statics.field2576;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2054.field818 >> 7) + Statics.field2133;
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

    @ObfuscatedName("af.cz([Lfd;IIIIIIII)V")
    public static final void method633(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class173 var9 = arg0[var8];
            if (var9 != null && (!var9.field2743 || var9.field2746 == 0 || var9.field2822 || method1237(var9) != 0 || field463 == var9 || var9.field2798 == 1338) && var9.field2831 == arg1 && (!var9.field2743 || !method2688(var9))) {
                int var10 = var9.field2830 + arg6;
                int var11 = var9.field2758 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2746 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2746 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2759 + var10;
                    int var19 = var9.field2782 + var11;
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
                    int var22 = var9.field2759 + var10;
                    int var23 = var9.field2782 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field470 == var9) {
                    field478 = true;
                    field479 = var10;
                    field442 = var11;
                }
                if (!var9.field2743 || var12 < var14 && var13 < var15) {
                    int var24 = class140.field2144;
                    int var25 = class140.field2138;
                    if (class140.field2150 != 0) {
                        var24 = class140.field2151;
                        var25 = class140.field2152;
                    }
                    if (var9.field2798 == 1337) {
                        if (!field401 && !field337 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method960(var24, var25, var12, var13);
                        }
                    } else if (var9.field2798 == 1338) {
                        method2279(var9, var10, var11);
                    } else {
                        if (!field337 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var26 = var24 - var10;
                            int var27 = var25 - var11;
                            if (var9.field2747 == 1) {
                                method2237(var9.field2842, "", 24, 0, 0, var9.field2744);
                            }
                            if (var9.field2747 == 2 && !field452) {
                                String var28 = method822(var9);
                                if (var28 != null) {
                                    method2237(var28, class2.method4(65280) + var9.field2858, 25, 0, -1, var9.field2744);
                                }
                            }
                            if (var9.field2747 == 3) {
                                method2237(class157.field2455, "", 26, 0, 0, var9.field2744);
                            }
                            if (var9.field2747 == 4) {
                                method2237(var9.field2842, "", 28, 0, 0, var9.field2744);
                            }
                            if (var9.field2747 == 5) {
                                method2237(var9.field2842, "", 29, 0, 0, var9.field2744);
                            }
                            if (var9.field2747 == 6 && field461 == null) {
                                method2237(var9.field2842, "", 30, 0, -1, var9.field2744);
                            }
                            if (var9.field2746 == 2) {
                                int var29 = 0;
                                for (int var30 = 0; var30 < var9.field2782; var30++) {
                                    for (int var31 = 0; var31 < var9.field2759; var31++) {
                                        int var32 = (var9.field2808 + 32) * var31;
                                        int var33 = (var9.field2809 + 32) * var30;
                                        if (var29 < 20) {
                                            var32 += var9.field2810[var29];
                                            var33 += var9.field2836[var29];
                                        }
                                        if (var26 >= var32 && var27 >= var33 && var26 < var32 + 32 && var27 < var33 + 32) {
                                            field416 = var29;
                                            Statics.field1768 = var9;
                                            if (var9.field2860[var29] > 0) {
                                                class52 var34 = Statics.method975(var9.field2860[var29] - 1);
                                                if (field404 == 1 && class178.method2923(method1237(var9))) {
                                                    if (Statics.field2071 != var9.field2744 || Statics.field202 != var29) {
                                                        method2237(class157.field2446, field451 + " " + class2.field20 + " " + class2.method4(16748608) + var34.field1117, 31, var34.field1119, var29, var9.field2744);
                                                    }
                                                } else if (!field452 || !class178.method2923(method1237(var9))) {
                                                    String[] var35 = var34.field1127;
                                                    if (field420) {
                                                        var35 = method130(var35);
                                                    }
                                                    if (class178.method2923(method1237(var9))) {
                                                        for (int var36 = 4; var36 >= 3; var36--) {
                                                            if (var35 != null && var35[var36] != null) {
                                                                byte var37;
                                                                if (var36 == 3) {
                                                                    var37 = 36;
                                                                } else {
                                                                    var37 = 37;
                                                                }
                                                                method2237(var35[var36], class2.method4(16748608) + var34.field1117, var37, var34.field1119, var29, var9.field2744);
                                                            } else if (var36 == 4) {
                                                                method2237(class157.field2391, class2.method4(16748608) + var34.field1117, 37, var34.field1119, var29, var9.field2744);
                                                            }
                                                        }
                                                    }
                                                    int var38 = method1237(var9);
                                                    boolean var39 = (var38 >> 31 & 0x1) != 0;
                                                    if (var39) {
                                                        method2237(class157.field2446, class2.method4(16748608) + var34.field1117, 38, var34.field1119, var29, var9.field2744);
                                                    }
                                                    class178 var10000 = (class178) null;
                                                    if (class178.method2923(method1237(var9)) && var35 != null) {
                                                        for (int var40 = 2; var40 >= 0; var40--) {
                                                            if (var35[var40] != null) {
                                                                byte var41 = 0;
                                                                if (var40 == 0) {
                                                                    var41 = 33;
                                                                }
                                                                if (var40 == 1) {
                                                                    var41 = 34;
                                                                }
                                                                if (var40 == 2) {
                                                                    var41 = 35;
                                                                }
                                                                method2237(var35[var40], class2.method4(16748608) + var34.field1117, var41, var34.field1119, var29, var9.field2744);
                                                            }
                                                        }
                                                    }
                                                    String[] var42 = var9.field2813;
                                                    if (field420) {
                                                        var42 = method130(var42);
                                                    }
                                                    if (var42 != null) {
                                                        for (int var43 = 4; var43 >= 0; var43--) {
                                                            if (var42[var43] != null) {
                                                                byte var44 = 0;
                                                                if (var43 == 0) {
                                                                    var44 = 39;
                                                                }
                                                                if (var43 == 1) {
                                                                    var44 = 40;
                                                                }
                                                                if (var43 == 2) {
                                                                    var44 = 41;
                                                                }
                                                                if (var43 == 3) {
                                                                    var44 = 42;
                                                                }
                                                                if (var43 == 4) {
                                                                    var44 = 43;
                                                                }
                                                                method2237(var42[var43], class2.method4(16748608) + var34.field1117, var44, var34.field1119, var29, var9.field2744);
                                                            }
                                                        }
                                                    }
                                                    method2237(class157.field2531, class2.method4(16748608) + var34.field1117, 1005, var34.field1119, var29, var9.field2744);
                                                } else if ((Statics.field712 & 0x10) == 16) {
                                                    method2237(field370, field456 + " " + class2.field20 + " " + class2.method4(16748608) + var34.field1117, 32, var34.field1119, var29, var9.field2744);
                                                }
                                            }
                                        }
                                        var29++;
                                    }
                                }
                            }
                            if (var9.field2743) {
                                if (field452) {
                                    int var45 = method1237(var9);
                                    boolean var46 = (var45 >> 21 & 0x1) != 0;
                                    if (var46 && (Statics.field712 & 0x20) == 32) {
                                        method2237(field370, field456 + " " + class2.field20 + " " + var9.field2815, 58, 0, var9.field2745, var9.field2744);
                                    }
                                } else {
                                    for (int var47 = 9; var47 >= 5; var47--) {
                                        String var48;
                                        if (!class178.method2280(method1237(var9), var47) && var9.field2832 == null) {
                                            var48 = null;
                                        } else if (var9.field2839 == null || var9.field2839.length <= var47 || var9.field2839[var47] == null || var9.field2839[var47].trim().length() == 0) {
                                            var48 = null;
                                        } else {
                                            var48 = var9.field2839[var47];
                                        }
                                        if (var48 != null) {
                                            method2237(var48, var9.field2815, 1007, var47 + 1, var9.field2745, var9.field2744);
                                        }
                                    }
                                    String var50 = method822(var9);
                                    if (var50 != null) {
                                        method2237(var50, var9.field2815, 25, 0, var9.field2745, var9.field2744);
                                    }
                                    for (int var51 = 4; var51 >= 0; var51--) {
                                        String var52;
                                        if (!class178.method2280(method1237(var9), var51) && var9.field2832 == null) {
                                            var52 = null;
                                        } else if (var9.field2839 == null || var9.field2839.length <= var51 || var9.field2839[var51] == null || var9.field2839[var51].trim().length() == 0) {
                                            var52 = null;
                                        } else {
                                            var52 = var9.field2839[var51];
                                        }
                                        if (var52 != null) {
                                            method2237(var52, var9.field2815, 57, var51 + 1, var9.field2745, var9.field2744);
                                        }
                                    }
                                    if (class178.method181(method1237(var9))) {
                                        method2237(class157.field2301, "", 30, 0, var9.field2745, var9.field2744);
                                    }
                                }
                            }
                        }
                        if (var9.field2746 == 0) {
                            if (!var9.field2743 && method2688(var9) && Statics.field1794 != var9) {
                                continue;
                            }
                            method633(arg0, var9.field2744, var12, var13, var14, var15, var10 - var9.field2765, var11 - var9.field2766);
                            if (var9.field2866 != null) {
                                method633(var9.field2866, var9.field2744, var12, var13, var14, var15, var10 - var9.field2765, var11 - var9.field2766);
                            }
                            class4 var54 = (class4) field458.method3532((long) var9.field2744);
                            if (var54 != null) {
                                if (var54.field58 == 0 && class140.field2144 >= var12 && class140.field2138 >= var13 && class140.field2144 < var14 && class140.field2138 < var15 && !field337 && !field339) {
                                    for (class1 var55 = (class1) field496.method3566(); var55 != null; var55 = (class1) field496.method3567()) {
                                        if (var55.field2) {
                                            var55.method3665();
                                            var55.field3.field2867 = false;
                                        }
                                    }
                                    if (Statics.field271 == 0) {
                                        field470 = null;
                                        field463 = null;
                                    }
                                    if (!field337) {
                                        field399[0] = class157.field2409;
                                        field445[0] = "";
                                        field329[0] = 1006;
                                        field326 = 1;
                                    }
                                }
                                int var56 = var54.field62;
                                if (class173.method584(var56)) {
                                    method633(Statics.field2803[var56], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2743) {
                            if (var9.field2762) {
                                if (class140.field2144 >= var12 && class140.field2138 >= var13 && class140.field2144 < var14 && class140.field2138 < var15) {
                                    for (class1 var57 = (class1) field496.method3566(); var57 != null; var57 = (class1) field496.method3567()) {
                                        if (var57.field2) {
                                            var57.method3665();
                                            var57.field3.field2867 = false;
                                        }
                                    }
                                    if (Statics.field271 == 0) {
                                        field470 = null;
                                        field463 = null;
                                    }
                                    if (!field337) {
                                        field399[0] = class157.field2409;
                                        field445[0] = "";
                                        field329[0] = 1006;
                                        field326 = 1;
                                    }
                                }
                            } else if (var9.field2876 && class140.field2144 >= var12 && class140.field2138 >= var13 && class140.field2144 < var14 && class140.field2138 < var15) {
                                for (class1 var58 = (class1) field496.method3566(); var58 != null; var58 = (class1) field496.method3567()) {
                                    if (var58.field2 && var58.field3.field2779 == var58.field9) {
                                        var58.method3665();
                                    }
                                }
                            }
                            boolean var59;
                            if (class140.field2144 >= var12 && class140.field2138 >= var13 && class140.field2144 < var14 && class140.field2138 < var15) {
                                var59 = true;
                            } else {
                                var59 = false;
                            }
                            boolean var60 = false;
                            if ((class140.field2155 == 1 || !Statics.field306 && class140.field2155 == 4) && var59) {
                                var60 = true;
                            }
                            boolean var61 = false;
                            if ((class140.field2150 == 1 || !Statics.field306 && class140.field2150 == 4) && class140.field2151 >= var12 && class140.field2152 >= var13 && class140.field2151 < var14 && class140.field2152 < var15) {
                                var61 = true;
                            }
                            if (var61) {
                                method3177(var9, class140.field2151 - var10, class140.field2152 - var11);
                            }
                            if (field470 != null && field470 != var9 && var59) {
                                int var62 = method1237(var9);
                                boolean var63 = (var62 >> 20 & 0x1) != 0;
                                if (var63) {
                                    field474 = var9;
                                }
                            }
                            if (field463 == var9) {
                                field475 = true;
                                field476 = var10;
                                field477 = var11;
                            }
                            if (var9.field2822) {
                                if (var59 && field495 != 0 && var9.field2779 != null) {
                                    class1 var64 = new class1();
                                    var64.field2 = true;
                                    var64.field3 = var9;
                                    var64.field10 = field495;
                                    var64.field9 = var9.field2779;
                                    field496.method3559(var64);
                                }
                                if (field470 != null || Statics.field1965 != null || field337) {
                                    var61 = false;
                                    var60 = false;
                                    var59 = false;
                                }
                                if (!var9.field2868 && var61) {
                                    var9.field2868 = true;
                                    if (var9.field2824 != null) {
                                        class1 var65 = new class1();
                                        var65.field2 = true;
                                        var65.field3 = var9;
                                        var65.field1 = class140.field2151 - var10;
                                        var65.field10 = class140.field2152 - var11;
                                        var65.field9 = var9.field2824;
                                        field496.method3559(var65);
                                    }
                                }
                                if (var9.field2868 && var60 && var9.field2825 != null) {
                                    class1 var66 = new class1();
                                    var66.field2 = true;
                                    var66.field3 = var9;
                                    var66.field1 = class140.field2144 - var10;
                                    var66.field10 = class140.field2138 - var11;
                                    var66.field9 = var9.field2825;
                                    field496.method3559(var66);
                                }
                                if (var9.field2868 && !var60) {
                                    var9.field2868 = false;
                                    if (var9.field2804 != null) {
                                        class1 var67 = new class1();
                                        var67.field2 = true;
                                        var67.field3 = var9;
                                        var67.field1 = class140.field2144 - var10;
                                        var67.field10 = class140.field2138 - var11;
                                        var67.field9 = var9.field2804;
                                        field467.method3559(var67);
                                    }
                                }
                                if (var60 && var9.field2827 != null) {
                                    class1 var68 = new class1();
                                    var68.field2 = true;
                                    var68.field3 = var9;
                                    var68.field1 = class140.field2144 - var10;
                                    var68.field10 = class140.field2138 - var11;
                                    var68.field9 = var9.field2827;
                                    field496.method3559(var68);
                                }
                                if (!var9.field2867 && var59) {
                                    var9.field2867 = true;
                                    if (var9.field2757 != null) {
                                        class1 var69 = new class1();
                                        var69.field2 = true;
                                        var69.field3 = var9;
                                        var69.field1 = class140.field2144 - var10;
                                        var69.field10 = class140.field2138 - var11;
                                        var69.field9 = var9.field2757;
                                        field496.method3559(var69);
                                    }
                                }
                                if (var9.field2867 && var59 && var9.field2829 != null) {
                                    class1 var70 = new class1();
                                    var70.field2 = true;
                                    var70.field3 = var9;
                                    var70.field1 = class140.field2144 - var10;
                                    var70.field10 = class140.field2138 - var11;
                                    var70.field9 = var9.field2829;
                                    field496.method3559(var70);
                                }
                                if (var9.field2867 && !var59) {
                                    var9.field2867 = false;
                                    if (var9.field2770 != null) {
                                        class1 var71 = new class1();
                                        var71.field2 = true;
                                        var71.field3 = var9;
                                        var71.field1 = class140.field2144 - var10;
                                        var71.field10 = class140.field2138 - var11;
                                        var71.field9 = var9.field2770;
                                        field467.method3559(var71);
                                    }
                                }
                                if (var9.field2841 != null) {
                                    class1 var72 = new class1();
                                    var72.field3 = var9;
                                    var72.field9 = var9.field2841;
                                    field497.method3559(var72);
                                }
                                if (var9.field2843 != null && field484 > var9.field2850) {
                                    if (var9.field2735 == null || field484 - var9.field2850 > 32) {
                                        class1 var77 = new class1();
                                        var77.field3 = var9;
                                        var77.field9 = var9.field2843;
                                        field496.method3559(var77);
                                    } else {
                                        label736: for (int var73 = var9.field2850; var73 < field484; var73++) {
                                            int var74 = field483[var73 & 0x1F];
                                            for (int var75 = 0; var75 < var9.field2735.length; var75++) {
                                                if (var9.field2735[var75] == var74) {
                                                    class1 var76 = new class1();
                                                    var76.field3 = var9;
                                                    var76.field9 = var9.field2843;
                                                    field496.method3559(var76);
                                                    break label736;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2850 = field484;
                                }
                                if (var9.field2837 != null && field357 > var9.field2802) {
                                    if (var9.field2838 == null || field357 - var9.field2802 > 32) {
                                        class1 var82 = new class1();
                                        var82.field3 = var9;
                                        var82.field9 = var9.field2837;
                                        field496.method3559(var82);
                                    } else {
                                        label712: for (int var78 = var9.field2802; var78 < field357; var78++) {
                                            int var79 = field485[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var9.field2838.length; var80++) {
                                                if (var9.field2838[var80] == var79) {
                                                    class1 var81 = new class1();
                                                    var81.field3 = var9;
                                                    var81.field9 = var9.field2837;
                                                    field496.method3559(var81);
                                                    break label712;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2802 = field357;
                                }
                                if (var9.field2851 != null && field488 > var9.field2872) {
                                    if (var9.field2840 == null || field488 - var9.field2872 > 32) {
                                        class1 var87 = new class1();
                                        var87.field3 = var9;
                                        var87.field9 = var9.field2851;
                                        field496.method3559(var87);
                                    } else {
                                        label688: for (int var83 = var9.field2872; var83 < field488; var83++) {
                                            int var84 = field498[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var9.field2840.length; var85++) {
                                                if (var9.field2840[var85] == var84) {
                                                    class1 var86 = new class1();
                                                    var86.field3 = var9;
                                                    var86.field9 = var9.field2851;
                                                    field496.method3559(var86);
                                                    break label688;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2872 = field488;
                                }
                                if (field376 > var9.field2869 && var9.field2844 != null) {
                                    class1 var88 = new class1();
                                    var88.field3 = var9;
                                    var88.field9 = var9.field2844;
                                    field496.method3559(var88);
                                }
                                if (field487 > var9.field2869 && var9.field2811 != null) {
                                    class1 var89 = new class1();
                                    var89.field3 = var9;
                                    var89.field9 = var9.field2811;
                                    field496.method3559(var89);
                                }
                                if (field491 > var9.field2869 && var9.field2847 != null) {
                                    class1 var90 = new class1();
                                    var90.field3 = var9;
                                    var90.field9 = var9.field2847;
                                    field496.method3559(var90);
                                }
                                if (field492 > var9.field2869 && var9.field2852 != null) {
                                    class1 var91 = new class1();
                                    var91.field3 = var9;
                                    var91.field9 = var9.field2852;
                                    field496.method3559(var91);
                                }
                                if (field331 > var9.field2869 && var9.field2874 != null) {
                                    class1 var92 = new class1();
                                    var92.field3 = var9;
                                    var92.field9 = var9.field2874;
                                    field496.method3559(var92);
                                }
                                if (field328 > var9.field2869 && var9.field2845 != null) {
                                    class1 var93 = new class1();
                                    var93.field3 = var9;
                                    var93.field9 = var9.field2845;
                                    field496.method3559(var93);
                                }
                                var9.field2869 = field302;
                                if (var9.field2781 != null) {
                                    for (int var94 = 0; var94 < field354; var94++) {
                                        class1 var95 = new class1();
                                        var95.field3 = var9;
                                        var95.field8 = field522[var94];
                                        var95.field12 = field521[var94];
                                        var95.field9 = var9.field2781;
                                        field496.method3559(var95);
                                    }
                                }
                            }
                        }
                        if (!var9.field2743 && field470 == null && Statics.field1965 == null && !field337) {
                            if ((var9.field2763 >= 0 || var9.field2853 != 0) && class140.field2144 >= var12 && class140.field2138 >= var13 && class140.field2144 < var14 && class140.field2138 < var15) {
                                if (var9.field2763 >= 0) {
                                    Statics.field1794 = arg0[var9.field2763];
                                } else {
                                    Statics.field1794 = var9;
                                }
                            }
                            if (var9.field2746 == 8 && class140.field2144 >= var12 && class140.field2138 >= var13 && class140.field2144 < var14 && class140.field2138 < var15) {
                                Statics.field156 = var9;
                            }
                            if (var9.field2768 > var9.field2782) {
                                int var96 = var9.field2759 + var10;
                                int var97 = var9.field2782;
                                int var98 = var9.field2768;
                                int var99 = class140.field2144;
                                int var100 = class140.field2138;
                                if (field381) {
                                    field361 = 32;
                                } else {
                                    field361 = 0;
                                }
                                field381 = false;
                                if (class140.field2155 == 1 || !Statics.field306 && class140.field2155 == 4) {
                                    if (var99 >= var96 && var99 < var96 + 16 && var100 >= var11 && var100 < var11 + 16) {
                                        var9.field2766 -= 4;
                                        Statics.method1777(var9);
                                    } else if (var99 >= var96 && var99 < var96 + 16 && var100 >= var11 + var97 - 16 && var100 < var11 + var97) {
                                        var9.field2766 += 4;
                                        Statics.method1777(var9);
                                    } else if (var99 >= var96 - field361 && var99 < field361 + var96 + 16 && var100 >= var11 + 16 && var100 < var11 + var97 - 16) {
                                        int var101 = (var97 - 32) * var97 / var98;
                                        if (var101 < 8) {
                                            var101 = 8;
                                        }
                                        int var102 = var100 - var11 - 16 - var101 / 2;
                                        int var103 = var97 - 32 - var101;
                                        var9.field2766 = (var98 - var97) * var102 / var103;
                                        Statics.method1777(var9);
                                        field381 = true;
                                    }
                                }
                                if (field495 != 0) {
                                    int var104 = var9.field2759;
                                    if (var99 >= var96 - var104 && var100 >= var11 && var99 < var96 + 16 && var100 <= var11 + var97) {
                                        var9.field2766 += field495 * 45;
                                        Statics.method1777(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("d.du([Lfd;II)V")
    public static final void method189(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2746 == 0) {
                    if (var3.field2866 != null) {
                        method189(var3.field2866, arg1);
                    }
                    class4 var4 = (class4) field458.method3532((long) var3.field2744);
                    if (var4 != null) {
                        Statics.method2920(var4.field62, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2849 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field9 = var3.field2849;
                    class37.method179(var5);
                }
                if (arg1 == 1 && var3.field2816 != null) {
                    if (var3.field2745 >= 0) {
                        class173 var6 = class173.method2297(var3.field2744);
                        if (var6 == null || var6.field2866 == null || var3.field2745 >= var6.field2866.length || var6.field2866[var3.field2745] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field9 = var3.field2816;
                    class37.method179(var7);
                }
            }
        }
    }

    @ObfuscatedName("fs.db(Lfd;III)V")
    public static final void method3177(class173 arg0, int arg1, int arg2) {
        if (field470 != null || field337 || arg0 == null || method3492(arg0) == null) {
            return;
        }
        field470 = arg0;
        field463 = method3492(arg0);
        field472 = arg1;
        field473 = arg2;
        Statics.field271 = 0;
        field481 = false;
        if (field326 > 0) {
            method568(field326 - 1);
        }
    }

    @ObfuscatedName("x.dc(II)V")
    public static void method568(int arg0) {
        Statics.field1527 = new class31();
        Statics.field1527.field710 = field440[arg0];
        Statics.field1527.field706 = field455[arg0];
        Statics.field1527.field707 = field329[arg0];
        Statics.field1527.field708 = field443[arg0];
        Statics.field1527.field709 = field399[arg0];
    }

    @ObfuscatedName("am.dz(IIB)V")
    public static void method781(int arg0, int arg1) {
        method2159(Statics.field1527, arg0, arg1);
        Statics.field1527 = null;
    }

    @ObfuscatedName("dp.dj(B)V")
    public static void method2632() {
        for (class4 var0 = (class4) field458.method3543(); var0 != null; var0 = (class4) field458.method3537()) {
            int var1 = var0.field62;
            if (class173.method584(var1)) {
                boolean var2 = true;
                class173[] var3 = Statics.field2803[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2743;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3105;
                    class173 var6 = class173.method2297(var5);
                    if (var6 != null) {
                        Statics.method1777(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("go.do(Lfd;I)Lfd;")
    public static class173 method3492(class173 arg0) {
        class173 var1 = arg0;
        int var2 = class178.method2281(method1237(arg0));
        class173 var3;
        if (var2 == 0) {
            var3 = null;
        } else {
            int var4 = 0;
            while (true) {
                if (var4 >= var2) {
                    var3 = var1;
                    break;
                }
                var1 = class173.method2297(var1.field2831);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class173 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2817;
        }
        return var5;
    }

    @ObfuscatedName("w.de([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method130(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("cy.dq(II)V")
    public static final void method1959(int arg0) {
        if (!class173.method584(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2803[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3 != null) {
                var3.field2864 = 0;
                var3.field2865 = 0;
            }
        }
    }

    @ObfuscatedName("z.dd(IB)V")
    public static final void method166(int arg0) {
        if (class173.method584(arg0)) {
            method2703(Statics.field2803[arg0], -1);
        }
    }

    @ObfuscatedName("en.dg([Lfd;II)V")
    public static final void method2703(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null && var3.field2831 == arg1 && (!var3.field2743 || !method2688(var3))) {
                if (var3.field2746 == 0) {
                    if (!var3.field2743 && method2688(var3) && Statics.field1794 != var3) {
                        continue;
                    }
                    method2703(arg0, var3.field2744);
                    if (var3.field2866 != null) {
                        method2703(var3.field2866, var3.field2744);
                    }
                    class4 var4 = (class4) field458.method3532((long) var3.field2744);
                    if (var4 != null) {
                        method166(var4.field62);
                    }
                }
                if (var3.field2746 == 6) {
                    if (var3.field2789 != -1 || var3.field2742 != -1) {
                        boolean var5 = method2240(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2742;
                        } else {
                            var6 = var3.field2789;
                        }
                        if (var6 != -1) {
                            class43 var7 = Statics.method653(var6);
                            var3.field2865 += field428;
                            while (var3.field2865 > var7.field995[var3.field2864]) {
                                var3.field2865 -= var7.field995[var3.field2864];
                                var3.field2864++;
                                if (var3.field2864 >= var7.field992.length) {
                                    var3.field2864 -= var7.field996;
                                    if (var3.field2864 < 0 || var3.field2864 >= var7.field992.length) {
                                        var3.field2864 = 0;
                                    }
                                }
                                Statics.method1777(var3);
                            }
                        }
                    }
                    if (var3.field2734 != 0 && !var3.field2743) {
                        int var8 = var3.field2734 >> 16;
                        int var9 = var3.field2734 << 16 >> 16;
                        int var10 = field428 * var8;
                        int var11 = field428 * var9;
                        var3.field2793 = var3.field2793 + var10 & 0x7FF;
                        var3.field2794 = var3.field2794 + var11 & 0x7FF;
                        Statics.method1777(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aj.dx(II)V")
    public static final void method961(int arg0) {
        method2632();
        class24.method2954();
        int var1 = Statics.method146(arg0).field1163;
        if (var1 == 0) {
            return;
        }
        int var2 = class176.field2900[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class91.method2004(0.9D);
                ((class95) Statics.field1587).method2048(0.9D);
            }
            if (var2 == 2) {
                class91.method2004(0.8D);
                ((class95) Statics.field1587).method2048(0.8D);
            }
            if (var2 == 3) {
                class91.method2004(0.7D);
                ((class95) Statics.field1587).method2048(0.7D);
            }
            if (var2 == 4) {
                class91.method2004(0.6D);
                ((class95) Statics.field1587).method2048(0.6D);
            }
            class52.method100();
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
            if (field299 != var3) {
                if (field299 == 0 && field535 != -1) {
                    class183.method650(Statics.field108, field535, 0, var3, false);
                    field386 = false;
                } else if (var3 == 0) {
                    Statics.field3134.method3380();
                    class183.field2950 = 1;
                    Statics.field2947 = null;
                    field386 = false;
                } else if (class183.field2950 == 0) {
                    Statics.field3134.method3375(var3);
                } else {
                    Statics.field63 = var3;
                }
                field299 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field537 = 127;
            }
            if (var2 == 1) {
                field537 = 96;
            }
            if (var2 == 2) {
                field537 = 64;
            }
            if (var2 == 3) {
                field537 = 32;
            }
            if (var2 == 4) {
                field537 = 0;
            }
        }
        if (var1 == 5) {
            field527 = var2;
        }
        if (var1 == 6) {
            field459 = var2;
        }
        if (var1 == 9) {
            field460 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field538 = 127;
            }
            if (var2 == 1) {
                field538 = 96;
            }
            if (var2 == 2) {
                field538 = 64;
            }
            if (var2 == 3) {
                field538 = 32;
            }
            if (var2 == 4) {
                field538 = 0;
            }
        }
        if (var1 == 17) {
            field465 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class21[] var4 = new class21[] { class21.field590, class21.field581, class21.field587, class21.field582 };
            field325 = (class21) class109.method2796(var4, var2);
            if (field325 == null) {
                field325 = class21.field590;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field429 = -1;
            } else {
                field429 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field444 = (class21) class109.method2796(class21.method2151(), var2);
            if (field444 == null) {
                field444 = class21.field590;
            }
        }
    }

    @ObfuscatedName("fl.dk(Lg;ZI)V")
    public static final void method3227(class4 arg0, boolean arg1) {
        int var2 = arg0.field62;
        int var3 = (int) arg0.field3105;
        arg0.method3665();
        if (arg1 && var2 != -1 && Statics.field2753[var2]) {
            Statics.field2783.method3055(var2);
            if (Statics.field2803[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2803[var2].length; var5++) {
                    if (Statics.field2803[var2][var5] != null) {
                        if (Statics.field2803[var2][var5].field2746 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2803[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2803[var2] = null;
                }
                Statics.field2753[var2] = false;
            }
        }
        method997(var2);
        class173 var6 = class173.method2297(var3);
        if (var6 != null) {
            Statics.method1777(var6);
        }
        method1196();
        if (field457 != -1) {
            Statics.method2920(field457, 1);
        }
    }

    @ObfuscatedName("dm.ds(Lfd;S)Z")
    public static final boolean method2659(class173 arg0) {
        int var1 = arg0.field2798;
        if (var1 == 205) {
            field352 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field534.method3285(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field534.method3277(var4, var5 == 1);
        }
        if (var1 == 324) {
            field534.method3266(false);
        }
        if (var1 == 325) {
            field534.method3266(true);
        }
        if (var1 == 326) {
            field493.method2617(252);
            field534.method3267(field493);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("f.dt(IIIILcp;Lfy;I)V")
    public static final void method5(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field489 + field347 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class91.field1579[var6];
        int var9 = class91.field1591[var6];
        int var10 = var8 * 256 / (field372 + 256);
        int var11 = var9 * 256 / (field372 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1634(arg5.field2890 / 2 + var12 - arg4.field1416 / 2, arg5.field2894 / 2 - var13 - arg4.field1417 / 2, arg0, arg1, arg5.field2890, arg5.field2894, arg5.field2892, arg5.field2891);
        } else {
            arg4.method1624(arg5.field2890 / 2 + arg0 + var12 - arg4.field1416 / 2, arg5.field2894 / 2 + arg1 - var13 - arg4.field1417 / 2);
        }
    }

    @ObfuscatedName("cs.dr(Ljava/lang/String;ZB)Z")
    public static boolean method1785(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class164.method2754(arg0, Statics.field3198);
        for (int var3 = 0; var3 < field564; var3++) {
            if (var2.equalsIgnoreCase(class164.method2754(field566[var3].field262, Statics.field3198)) && (!arg1 || field566[var3].field255 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class164.method2754(Statics.field2054.field52, Statics.field3198))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ce.da(Ljava/lang/String;I)Z")
    public static boolean method2149(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class164.method2754(arg0, Statics.field3198);
        for (int var2 = 0; var2 < field568; var2++) {
            class8 var3 = field468[var2];
            if (var1.equalsIgnoreCase(class164.method2754(var3.field142, Statics.field3198))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class164.method2754(var3.field134, Statics.field3198))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("di.dp(Ljava/lang/String;B)V")
    public static final void method2652(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class164.method2754(arg0, Statics.field3198);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field568; var2++) {
            class8 var3 = field468[var2];
            String var4 = var3.field142;
            String var5 = class164.method2754(var4, Statics.field3198);
            if (class129.method1960(arg0, var1, var4, var5)) {
                field568--;
                for (int var6 = var2; var6 < field568; var6++) {
                    field468[var6] = field468[var6 + 1];
                }
                field487 = field302;
                field493.method2617(179);
                field493.method2426(class119.method1572(arg0));
                field493.method2354(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("an.dw(Ljava/lang/String;II)V")
    public static final void method729(String arg0, int arg1) {
        field493.method2617(191);
        field493.method2426(class119.method1572(arg0) + 1);
        field493.method2426(arg1);
        field493.method2354(arg0);
    }

    @ObfuscatedName("fq.dl(Ljava/lang/String;I)V")
    public static final void method3179(String arg0) {
        if (!arg0.equals("")) {
            field493.method2617(38);
            field493.method2426(class119.method1572(arg0));
            field493.method2354(arg0);
        }
    }

    @ObfuscatedName("ag.di(IB)V")
    public static void method997(int arg0) {
        for (class201 var1 = (class201) field499.method3543(); var1 != null; var1 = (class201) field499.method3537()) {
            if ((var1.field3105 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method3665();
            }
        }
    }

    @ObfuscatedName("bl.dh(Lfd;B)I")
    public static int method1237(class173 arg0) {
        class201 var1 = (class201) field499.method3532(((long) arg0.field2744 << 32) + (long) arg0.field2745);
        return var1 == null ? arg0.field2814 : var1.field3092;
    }

    @ObfuscatedName("ew.dv(Lfd;I)Z")
    public static boolean method2688(class173 arg0) {
        if (field339) {
            if (method1237(arg0) != 0) {
                return false;
            }
            if (arg0.field2746 == 0) {
                return false;
            }
        }
        return arg0.field2764;
    }

    @ObfuscatedName("av.dm(Lfd;I)Ljava/lang/String;")
    public static String method822(class173 arg0) {
        if (class178.method2792(method1237(arg0)) == 0) {
            return null;
        } else if (arg0.field2821 == null || arg0.field2821.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2821;
        }
    }

    @ObfuscatedName("ap.dy(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method929(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field301 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field301 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field301 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field301 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field301 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field175 != null) {
            var3 = "/p=" + Statics.field175;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field304 + "/a=" + Statics.field2905 + var3 + "/";
    }

    @ObfuscatedName("co.ex(Ljava/lang/String;I)V")
    public static void method2152(String arg0) {
        Statics.field175 = arg0;
        try {
            String var1 = Statics.field297.getParameter(class190.field3053.field3055);
            String var2 = Statics.field297.getParameter(class190.field3044.field3055);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class115.method645() + 94608000000L;
                class111.field1948.setTime(new Date(var6));
                int var8 = class111.field1948.get(7);
                int var9 = class111.field1948.get(5);
                int var10 = class111.field1948.get(2);
                int var11 = class111.field1948.get(1);
                int var12 = class111.field1948.get(11);
                int var13 = class111.field1948.get(12);
                int var14 = class111.field1948.get(13);
                String var15 = class111.field1953[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class111.field1946[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            class132.method2671(Statics.field297, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var17) {
        }
    }
}

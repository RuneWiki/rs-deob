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

public final class client extends class144 {

    @ObfuscatedName("client.k")
    public static boolean field279 = true;

    @ObfuscatedName("client.f")
    public static int field524 = 1;

    @ObfuscatedName("client.d")
    public static int field480 = 0;

    @ObfuscatedName("client.r")
    public static int field468 = 0;

    @ObfuscatedName("client.n")
    public static boolean field536 = false;

    @ObfuscatedName("client.j")
    public static boolean field466 = false;

    @ObfuscatedName("client.a")
    public static int field456 = 0;

    @ObfuscatedName("client.i")
    public static int field288 = 0;

    @ObfuscatedName("client.t")
    public static boolean field383 = true;

    @ObfuscatedName("client.u")
    public static int field290 = 0;

    @ObfuscatedName("client.e")
    public static long field343 = -1L;

    @ObfuscatedName("client.s")
    public static int field351 = -1;

    @ObfuscatedName("client.w")
    public static class108[] field341 = new class108[4];

    @ObfuscatedName("client.o")
    public static int field293 = -1;

    @ObfuscatedName("client.aw")
    public static int field294 = -1;

    @ObfuscatedName("client.an")
    public static boolean field295 = true;

    @ObfuscatedName("client.ab")
    public static boolean field344 = false;

    @ObfuscatedName("client.al")
    public static int field297 = 0;

    @ObfuscatedName("client.ay")
    public static int field298 = 0;

    @ObfuscatedName("client.aq")
    public static int field280 = 0;

    @ObfuscatedName("client.ac")
    public static int field300 = 0;

    @ObfuscatedName("client.ak")
    public static int field301 = 0;

    @ObfuscatedName("client.am")
    public static int field500 = 0;

    @ObfuscatedName("client.aj")
    public static int field488 = 0;

    @ObfuscatedName("client.au")
    public static int field304 = 0;

    @ObfuscatedName("client.av")
    public static int field369 = 0;

    @ObfuscatedName("client.ai")
    public static class21 field306 = class21.field573;

    @ObfuscatedName("client.ah")
    public static int field307 = 0;

    @ObfuscatedName("client.ax")
    public static int field308 = 0;

    @ObfuscatedName("client.as")
    public static int field309 = 0;

    @ObfuscatedName("client.bg")
    public static int field311 = 0;

    @ObfuscatedName("client.bz")
    public static int field312 = 0;

    @ObfuscatedName("client.bt")
    public static int field313 = 0;

    @ObfuscatedName("client.bi")
    public static int field314 = 0;

    @ObfuscatedName("client.bh")
    public static int field315 = 0;

    @ObfuscatedName("client.cg")
    public static class35[] field316 = new class35[32768];

    @ObfuscatedName("client.cq")
    public static int field317 = 0;

    @ObfuscatedName("client.cl")
    public static int[] field302 = new int[32768];

    @ObfuscatedName("client.cs")
    public static int field551 = 0;

    @ObfuscatedName("client.cr")
    public static int[] field555 = new int[250];

    @ObfuscatedName("client.cm")
    public static class122 field321 = new class122(5000);

    @ObfuscatedName("client.cd")
    public static class122 field281 = new class122(5000);

    @ObfuscatedName("client.cu")
    public static class122 field448 = new class122(15000);

    @ObfuscatedName("client.co")
    public static int field324 = 0;

    @ObfuscatedName("client.ce")
    public static int field325 = 0;

    @ObfuscatedName("client.cy")
    public static int field326 = 0;

    @ObfuscatedName("client.ca")
    public static int field327 = 0;

    @ObfuscatedName("client.cp")
    public static int field328 = 0;

    @ObfuscatedName("client.ct")
    public static int field329 = 0;

    @ObfuscatedName("client.ck")
    public static int field330 = 0;

    @ObfuscatedName("client.cf")
    public static int field391 = 0;

    @ObfuscatedName("client.cx")
    public static boolean field332 = false;

    @ObfuscatedName("client.dv")
    public static int field334 = 0;

    @ObfuscatedName("client.dy")
    public static int field335 = 1;

    @ObfuscatedName("client.du")
    public static int field336 = 0;

    @ObfuscatedName("client.di")
    public static int field382 = 1;

    @ObfuscatedName("client.dn")
    public static int field338 = 0;

    @ObfuscatedName("client.dh")
    public static boolean field362 = false;

    @ObfuscatedName("client.dg")
    public static int[][][] field401 = new int[4][13][13];

    @ObfuscatedName("client.dc")
    public static final int[] field452 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dk")
    public static int field345 = 0;

    @ObfuscatedName("client.ds")
    public static int field346 = 2;

    @ObfuscatedName("client.dx")
    public static int field347 = 0;

    @ObfuscatedName("client.dq")
    public static int field504 = 2;

    @ObfuscatedName("client.dl")
    public static int field430 = 0;

    @ObfuscatedName("client.dz")
    public static int field350 = 1;

    @ObfuscatedName("client.ep")
    public static int field556 = 0;

    @ObfuscatedName("client.ew")
    public static int field352 = 0;

    @ObfuscatedName("client.eg")
    public static int field353 = 2;

    @ObfuscatedName("client.ea")
    public static int field354 = 0;

    @ObfuscatedName("client.eu")
    public static int field355 = 1;

    @ObfuscatedName("client.ey")
    public static int field405 = 0;

    @ObfuscatedName("client.em")
    public static int field357 = 0;

    @ObfuscatedName("client.el")
    public static int field359 = 2301979;

    @ObfuscatedName("client.ei")
    public static int field360 = 5063219;

    @ObfuscatedName("client.eb")
    public static int field303 = 3353893;

    @ObfuscatedName("client.ek")
    public static int field320 = 7759444;

    @ObfuscatedName("client.ec")
    public static boolean field363 = false;

    @ObfuscatedName("client.en")
    public static int field364 = 0;

    @ObfuscatedName("client.fc")
    public static int field365 = 128;

    @ObfuscatedName("client.fn")
    public static int field366 = 0;

    @ObfuscatedName("client.fy")
    public static int field367 = 0;

    @ObfuscatedName("client.fj")
    public static int field368 = 0;

    @ObfuscatedName("client.ff")
    public static int field464 = 0;

    @ObfuscatedName("client.fl")
    public static int field370 = 0;

    @ObfuscatedName("client.fz")
    public static int field371 = 50;

    @ObfuscatedName("client.fd")
    public static int field372 = 0;

    @ObfuscatedName("client.ft")
    public static boolean field373 = false;

    @ObfuscatedName("client.fe")
    public static int field374 = 0;

    @ObfuscatedName("client.fa")
    public static int field375 = 0;

    @ObfuscatedName("client.fr")
    public static int field475 = 50;

    @ObfuscatedName("client.fv")
    public static int[] field377 = new int[field475];

    @ObfuscatedName("client.fb")
    public static int[] field378 = new int[field475];

    @ObfuscatedName("client.fm")
    public static int[] field379 = new int[field475];

    @ObfuscatedName("client.fq")
    public static int[] field380 = new int[field475];

    @ObfuscatedName("client.fx")
    public static int[] field415 = new int[field475];

    @ObfuscatedName("client.fp")
    public static int[] field486 = new int[field475];

    @ObfuscatedName("client.fu")
    public static int[] field323 = new int[field475];

    @ObfuscatedName("client.gy")
    public static String[] field384 = new String[field475];

    @ObfuscatedName("client.gh")
    public static int[][] field473 = new int[104][104];

    @ObfuscatedName("client.gv")
    public static int field484 = 0;

    @ObfuscatedName("client.gz")
    public static int field425 = -1;

    @ObfuscatedName("client.gb")
    public static int field388 = -1;

    @ObfuscatedName("client.ga")
    public static int field389 = 0;

    @ObfuscatedName("client.gw")
    public static int field390 = 0;

    @ObfuscatedName("client.gg")
    public static int field381 = 0;

    @ObfuscatedName("client.gr")
    public static int field392 = 0;

    @ObfuscatedName("client.gl")
    public static int field393 = 0;

    @ObfuscatedName("client.gd")
    public static int field394 = 0;

    @ObfuscatedName("client.ge")
    public static int field310 = 0;

    @ObfuscatedName("client.gj")
    public static int field299 = 0;

    @ObfuscatedName("client.gi")
    public static int field397 = 0;

    @ObfuscatedName("client.gm")
    public static int field398 = 0;

    @ObfuscatedName("client.gc")
    public static boolean field399 = false;

    @ObfuscatedName("client.gq")
    public static int field521 = 0;

    @ObfuscatedName("client.gp")
    public static int field560 = 0;

    @ObfuscatedName("client.gf")
    public static class3[] field402 = new class3[2048];

    @ObfuscatedName("client.gs")
    public static int field278 = -1;

    @ObfuscatedName("client.gk")
    public static int field404 = 0;

    @ObfuscatedName("client.hj")
    public static int field400 = 0;

    @ObfuscatedName("client.hw")
    public static int[] field406 = new int[1000];

    @ObfuscatedName("client.hp")
    public static final int[] field286 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hh")
    public static String[] field408 = new String[8];

    @ObfuscatedName("client.ht")
    public static boolean[] field409 = new boolean[8];

    @ObfuscatedName("client.hg")
    public static int[] field410 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hl")
    public static int field411 = -1;

    @ObfuscatedName("client.hm")
    public static class199[][][] field412 = new class199[4][104][104];

    @ObfuscatedName("client.ha")
    public static class199 field522 = new class199();

    @ObfuscatedName("client.hv")
    public static class199 field414 = new class199();

    @ObfuscatedName("client.hd")
    public static class199 field537 = new class199();

    @ObfuscatedName("client.hf")
    public static int[] field416 = new int[25];

    @ObfuscatedName("client.hx")
    public static int[] field417 = new int[25];

    @ObfuscatedName("client.hi")
    public static int[] field418 = new int[25];

    @ObfuscatedName("client.hq")
    public static int field419 = 0;

    @ObfuscatedName("client.hs")
    public static boolean field552 = false;

    @ObfuscatedName("client.hy")
    public static int field421 = 0;

    @ObfuscatedName("client.hb")
    public static int[] field422 = new int[500];

    @ObfuscatedName("client.hu")
    public static int[] field423 = new int[500];

    @ObfuscatedName("client.io")
    public static int[] field424 = new int[500];

    @ObfuscatedName("client.ip")
    public static int[] field563 = new int[500];

    @ObfuscatedName("client.id")
    public static String[] field426 = new String[500];

    @ObfuscatedName("client.iv")
    public static String[] field470 = new String[500];

    @ObfuscatedName("client.iq")
    public static int field349 = -1;

    @ObfuscatedName("client.ia")
    public static int field429 = -1;

    @ObfuscatedName("client.ik")
    public static int field533 = 0;

    @ObfuscatedName("client.ij")
    public static int field431 = 50;

    @ObfuscatedName("client.ih")
    public static int field432 = 0;

    @ObfuscatedName("client.is")
    public static String field543 = null;

    @ObfuscatedName("client.ie")
    public static boolean field434 = false;

    @ObfuscatedName("client.ic")
    public static int field435 = -1;

    @ObfuscatedName("client.iw")
    public static int field436 = -1;

    @ObfuscatedName("client.ib")
    public static String field437 = null;

    @ObfuscatedName("client.ig")
    public static String field541 = null;

    @ObfuscatedName("client.iy")
    public static int field439 = -1;

    @ObfuscatedName("client.in")
    public static class196 field519 = new class196(8);

    @ObfuscatedName("client.il")
    public static int field441 = 0;

    @ObfuscatedName("client.jm")
    public static int field442 = 0;

    @ObfuscatedName("client.jj")
    public static class173 field443 = null;

    @ObfuscatedName("client.jr")
    public static int field460 = 0;

    @ObfuscatedName("client.jp")
    public static int field445 = 0;

    @ObfuscatedName("client.jy")
    public static int field446 = 0;

    @ObfuscatedName("client.jh")
    public static int field485 = -1;

    @ObfuscatedName("client.jd")
    public static boolean field513 = false;

    @ObfuscatedName("client.jw")
    public static boolean field449 = false;

    @ObfuscatedName("client.jk")
    public static boolean field450 = false;

    @ObfuscatedName("client.jo")
    public static class173 field451 = null;

    @ObfuscatedName("client.jc")
    public static class173 field277 = null;

    @ObfuscatedName("client.jt")
    public static class173 field453 = null;

    @ObfuscatedName("client.js")
    public static int field454 = 0;

    @ObfuscatedName("client.jx")
    public static int field455 = 0;

    @ObfuscatedName("client.jf")
    public static class173 field427 = null;

    @ObfuscatedName("client.je")
    public static boolean field457 = false;

    @ObfuscatedName("client.jl")
    public static int field458 = -1;

    @ObfuscatedName("client.jb")
    public static int field331 = -1;

    @ObfuscatedName("client.jz")
    public static boolean field292 = false;

    @ObfuscatedName("client.jn")
    public static int field461 = -1;

    @ObfuscatedName("client.jv")
    public static int field462 = -1;

    @ObfuscatedName("client.jg")
    public static boolean field463 = false;

    @ObfuscatedName("client.kp")
    public static int field516 = 1;

    @ObfuscatedName("client.kd")
    public static int[] field531 = new int[32];

    @ObfuscatedName("client.ki")
    public static int field444 = 0;

    @ObfuscatedName("client.kw")
    public static int[] field467 = new int[32];

    @ObfuscatedName("client.kt")
    public static int field289 = 0;

    @ObfuscatedName("client.ky")
    public static int[] field469 = new int[32];

    @ObfuscatedName("client.kq")
    public static int field305 = 0;

    @ObfuscatedName("client.kr")
    public static int field471 = 0;

    @ObfuscatedName("client.kj")
    public static int field490 = 0;

    @ObfuscatedName("client.kn")
    public static int field395 = 0;

    @ObfuscatedName("client.ka")
    public static int field474 = 0;

    @ObfuscatedName("client.kl")
    public static int field482 = 0;

    @ObfuscatedName("client.km")
    public static int field386 = 0;

    @ObfuscatedName("client.ks")
    public static int field477 = 0;

    @ObfuscatedName("client.kg")
    public static class199 field493 = new class199();

    @ObfuscatedName("client.ku")
    public static class199 field479 = new class199();

    @ObfuscatedName("client.kk")
    public static class199 field403 = new class199();

    @ObfuscatedName("client.kz")
    public static class196 field447 = new class196(512);

    @ObfuscatedName("client.ke")
    public static int field291 = 0;

    @ObfuscatedName("client.kv")
    public static int field465 = -2;

    @ObfuscatedName("client.kx")
    public static boolean[] field428 = new boolean[100];

    @ObfuscatedName("client.lb")
    public static boolean[] field413 = new boolean[100];

    @ObfuscatedName("client.ll")
    public static boolean[] field433 = new boolean[100];

    @ObfuscatedName("client.lg")
    public static int[] field487 = new int[100];

    @ObfuscatedName("client.lo")
    public static int[] field438 = new int[100];

    @ObfuscatedName("client.lz")
    public static int[] field283 = new int[100];

    @ObfuscatedName("client.ly")
    public static int[] field296 = new int[100];

    @ObfuscatedName("client.la")
    public static int field491 = 0;

    @ObfuscatedName("client.lk")
    public static long field492 = 0L;

    @ObfuscatedName("client.lt")
    public static boolean field557 = true;

    @ObfuscatedName("client.ln")
    public static int field494 = 765;

    @ObfuscatedName("client.lc")
    public static int field495 = 1;

    @ObfuscatedName("client.lw")
    public static int[] field496 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.le")
    public static int field497 = 0;

    @ObfuscatedName("client.ld")
    public static int field498 = 0;

    @ObfuscatedName("client.lr")
    public static String field499 = "";

    @ObfuscatedName("client.ls")
    public static long[] field472 = new long[100];

    @ObfuscatedName("client.lx")
    public static int field501 = 0;

    @ObfuscatedName("client.lh")
    public static int field502 = 0;

    @ObfuscatedName("client.lp")
    public static int[] field503 = new int[128];

    @ObfuscatedName("client.mc")
    public static int[] field459 = new int[128];

    @ObfuscatedName("client.my")
    public static long field505 = -1L;

    @ObfuscatedName("client.mn")
    public static String field506 = null;

    @ObfuscatedName("client.mv")
    public static String field507 = null;

    @ObfuscatedName("client.md")
    public static int field508 = -1;

    @ObfuscatedName("client.mz")
    public static int field509 = 0;

    @ObfuscatedName("client.mf")
    public static int[] field510 = new int[1000];

    @ObfuscatedName("client.mr")
    public static int[] field511 = new int[1000];

    @ObfuscatedName("client.mo")
    public static class79[] field512 = new class79[1000];

    @ObfuscatedName("client.mq")
    public static int field483 = 0;

    @ObfuscatedName("client.mt")
    public static int field514 = 0;

    @ObfuscatedName("client.mw")
    public static int field530 = 0;

    @ObfuscatedName("client.mk")
    public static int field517 = 255;

    @ObfuscatedName("client.mm")
    public static int field518 = -1;

    @ObfuscatedName("client.mg")
    public static boolean field489 = false;

    @ObfuscatedName("client.nl")
    public static int field319 = 127;

    @ObfuscatedName("client.ny")
    public static int field342 = 127;

    @ObfuscatedName("client.np")
    public static int field285 = 0;

    @ObfuscatedName("client.ne")
    public static int[] field523 = new int[50];

    @ObfuscatedName("client.nj")
    public static int[] field534 = new int[50];

    @ObfuscatedName("client.nq")
    public static int[] field525 = new int[50];

    @ObfuscatedName("client.nr")
    public static int[] field526 = new int[50];

    @ObfuscatedName("client.nu")
    public static class59[] field527 = new class59[50];

    @ObfuscatedName("client.nc")
    public static boolean field528 = false;

    @ObfuscatedName("client.nn")
    public static boolean[] field529 = new boolean[5];

    @ObfuscatedName("client.ox")
    public static int[] field478 = new int[5];

    @ObfuscatedName("client.oh")
    public static int[] field376 = new int[5];

    @ObfuscatedName("client.oj")
    public static int[] field532 = new int[5];

    @ObfuscatedName("client.oe")
    public static int[] field440 = new int[5];

    @ObfuscatedName("client.od")
    public static short field407 = 256;

    @ObfuscatedName("client.on")
    public static short field535 = 205;

    @ObfuscatedName("client.ow")
    public static short field420 = 256;

    @ObfuscatedName("client.oz")
    public static short field337 = 320;

    @ObfuscatedName("client.ov")
    public static short field538 = 1;

    @ObfuscatedName("client.ok")
    public static short field539 = 32767;

    @ObfuscatedName("client.of")
    public static short field540 = 1;

    @ObfuscatedName("client.or")
    public static short field348 = 32767;

    @ObfuscatedName("client.oa")
    public static int field542 = 0;

    @ObfuscatedName("client.oi")
    public static int field358 = 0;

    @ObfuscatedName("client.om")
    public static int field544 = 0;

    @ObfuscatedName("client.oo")
    public static int field545 = 0;

    @ObfuscatedName("client.ob")
    public static int field546 = 0;

    @ObfuscatedName("client.ol")
    public static int field547 = 0;

    @ObfuscatedName("client.oy")
    public static int field548 = 0;

    @ObfuscatedName("client.ou")
    public static class18[] field549 = new class18[400];

    @ObfuscatedName("client.oc")
    public static class195 field550 = new class195();

    @ObfuscatedName("client.oq")
    public static int field322 = 0;

    @ObfuscatedName("client.op")
    public static class8[] field476 = new class8[400];

    @ObfuscatedName("client.os")
    public static class179 field553 = new class179();

    @ObfuscatedName("client.pd")
    public static int field554 = -1;

    @ObfuscatedName("client.pw")
    public static int field356 = -1;

    @ObfuscatedName("client.pc")
    public static class220[] field396 = new class220[8];

    @ObfuscatedName("client.pu")
    public static long field481 = -1L;

    @ObfuscatedName("client.pn")
    public static long field558 = -1L;

    @ObfuscatedName("client.pe")
    public static final class11 field559 = new class11();

    @ObfuscatedName("client.pz")
    public static int[] field318 = new int[50];

    @ObfuscatedName("client.pr")
    public static int[] field561 = new int[50];

    @ObfuscatedName("client.q(B)V")
    public final void method422() {
    }

    public final void init() {
        if (!this.method2791()) {
            return;
        }
        class190[] var1 = new class190[] { class190.field3037, class190.field3043, class190.field3038, class190.field3044, class190.field3039, class190.field3049, class190.field3046, class190.field3040, class190.field3047, class190.field3048, class190.field3041, class190.field3050, class190.field3036, class190.field3042, class190.field3045 };
        class190[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class190 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3051);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3051)) {
                    case 1:
                        Statics.field2896 = Integer.parseInt(var5);
                        break;
                    case 2:
                        Statics.field1053 = var5;
                        break;
                    case 3:
                        field480 = Integer.parseInt(var5);
                        break;
                    case 4:
                        Statics.field1679 = Integer.parseInt(var5);
                        break;
                    case 5:
                        field524 = Integer.parseInt(var5);
                        break;
                    case 6:
                        if (var5.equalsIgnoreCase(class2.field21)) {
                            field536 = true;
                        } else {
                            field536 = false;
                        }
                        break;
                    case 7:
                        Statics.field3165 = var5;
                        break;
                    case 8:
                        class154[] var6 = new class154[] { class154.field2285, class154.field2277, class154.field2279, class154.field2281, class154.field2278, class154.field2282 };
                        Statics.field284 = (class154) class109.method2221(var6, Integer.parseInt(var5));
                        if (Statics.field284 == class154.field2282) {
                            Statics.field2027 = class212.field3121;
                        } else {
                            Statics.field2027 = class212.field3120;
                        }
                        break;
                    case 9:
                        Statics.field282 = Statics.method2716(Integer.parseInt(var5));
                    case 10:
                    case 11:
                    default:
                        break;
                    case 12:
                        field456 = Integer.parseInt(var5);
                        break;
                    case 13:
                        field468 = Integer.parseInt(var5);
                        break;
                    case 14:
                        if (var5.equalsIgnoreCase(class2.field21)) {
                        }
                }
            }
        }
        method1889();
        Statics.field1552 = this.getCodeBase().getHost();
        String var7 = Statics.field282.field2270;
        byte var8 = 0;
        try {
            Statics.field3166 = 16;
            Statics.field2233 = var8;
            try {
                Statics.field1873 = System.getProperty("os.name");
            } catch (Exception var54) {
                Statics.field1873 = "Unknown";
            }
            Statics.field1385 = Statics.field1873.toLowerCase();
            try {
                Statics.field2299 = System.getProperty("user.home");
                if (Statics.field2299 != null) {
                    Statics.field2299 = Statics.field2299 + "/";
                }
            } catch (Exception var53) {
            }
            try {
                if (Statics.field1385.startsWith("win")) {
                    if (Statics.field2299 == null) {
                        Statics.field2299 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2299 == null) {
                    Statics.field2299 = System.getenv("HOME");
                }
                if (Statics.field2299 != null) {
                    Statics.field2299 = Statics.field2299 + "/";
                }
            } catch (Exception var52) {
            }
            if (Statics.field2299 == null) {
                Statics.field2299 = "~/";
            }
            Statics.field867 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2299, "/tmp/", "" };
            Statics.field1551 = new String[] { ".jagex_cache_" + Statics.field2233, ".file_store_" + Statics.field2233 };
            int var12 = 0;
            label285: while (var12 < 4) {
                String var13 = var12 == 0 ? "" : "" + var12;
                Statics.field1885 = new File(Statics.field2299, "jagex_cl_oldschool_" + var7 + var13 + ".dat");
                String var14 = null;
                String var15 = null;
                boolean var16 = false;
                if (Statics.field1885.exists()) {
                    try {
                        class227 var17 = new class227(Statics.field1885, "rw", 10000L);
                        class119 var18 = new class119((int) var17.method3770());
                        while (var18.field1986 < var18.field1987.length) {
                            int var19 = var17.method3771(var18.field1987, var18.field1986, var18.field1987.length - var18.field1986);
                            if (var19 == -1) {
                                throw new IOException();
                            }
                            var18.field1986 += var19;
                        }
                        var18.field1986 = 0;
                        int var20 = var18.method2457();
                        if (var20 < 1 || var20 > 3) {
                            throw new IOException("" + var20);
                        }
                        int var21 = 0;
                        if (var20 > 1) {
                            var21 = var18.method2457();
                        }
                        if (var20 <= 2) {
                            var14 = var18.method2310();
                            if (var21 == 1) {
                                var15 = var18.method2310();
                            }
                        } else {
                            var14 = var18.method2311();
                            if (var21 == 1) {
                                var15 = var18.method2311();
                            }
                        }
                        var17.method3769();
                    } catch (IOException var57) {
                        var57.printStackTrace();
                    }
                    if (var14 != null) {
                        File var23 = new File(var14);
                        if (!var23.exists()) {
                            var14 = null;
                        }
                    }
                    if (var14 != null) {
                        File var24 = new File(var14, "test.dat");
                        if (!class149.method699(var24, true)) {
                            var14 = null;
                        }
                    }
                }
                if (var14 == null && var12 == 0) {
                    label259: for (int var25 = 0; var25 < Statics.field1551.length; var25++) {
                        for (int var26 = 0; var26 < Statics.field867.length; var26++) {
                            File var27 = new File(Statics.field867[var26] + Statics.field1551[var25] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var27.exists() && class149.method699(new File(var27, "test.dat"), true)) {
                                var14 = var27.toString();
                                var16 = true;
                                break label259;
                            }
                        }
                    }
                }
                if (var14 == null) {
                    var14 = Statics.field2299 + File.separatorChar + "jagexcache" + var13 + File.separatorChar + "oldschool" + File.separatorChar + var7 + File.separatorChar;
                    var16 = true;
                }
                if (var15 != null) {
                    File var28 = new File(var15);
                    File var29 = new File(var14);
                    try {
                        File[] var30 = var28.listFiles();
                        File[] var31 = var30;
                        for (int var32 = 0; var32 < var31.length; var32++) {
                            File var33 = var31[var32];
                            File var34 = new File(var29, var33.getName());
                            boolean var35 = var33.renameTo(var34);
                            if (!var35) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var56) {
                        var56.printStackTrace();
                    }
                    var16 = true;
                }
                if (var16) {
                    class149.method2639(new File(var14), (File) null);
                }
                File var37 = new File(var14);
                Statics.field2144 = var37;
                if (!Statics.field2144.exists()) {
                    Statics.field2144.mkdirs();
                }
                File[] var38 = Statics.field2144.listFiles();
                if (var38 != null) {
                    File[] var39 = var38;
                    for (int var40 = 0; var40 < var39.length; var40++) {
                        File var41 = var39[var40];
                        if (!class149.method699(var41, false)) {
                            var12++;
                            continue label285;
                        }
                    }
                }
                break;
            }
            File var42 = Statics.field2144;
            Statics.field3168 = var42;
            if (!Statics.field3168.exists()) {
                throw new RuntimeException("");
            }
            class135.field2079 = true;
            try {
                File var43 = new File(Statics.field2299, "random.dat");
                if (var43.exists()) {
                    class149.field2237 = new class228(new class227(var43, "rw", 25L), 24, 0);
                } else {
                    label208: for (int var44 = 0; var44 < Statics.field1551.length; var44++) {
                        for (int var45 = 0; var45 < Statics.field867.length; var45++) {
                            File var46 = new File(Statics.field867[var45] + Statics.field1551[var44] + File.separatorChar + "random.dat");
                            if (var46.exists()) {
                                class149.field2237 = new class228(new class227(var46, "rw", 25L), 24, 0);
                                break label208;
                            }
                        }
                    }
                }
                if (class149.field2237 == null) {
                    RandomAccessFile var47 = new RandomAccessFile(var43, "rw");
                    int var48 = var47.read();
                    var47.seek(0L);
                    var47.write(var48);
                    var47.seek(0L);
                    var47.close();
                    class149.field2237 = new class228(new class227(var43, "rw", 25L), 24, 0);
                }
            } catch (IOException var55) {
            }
            class149.field2236 = new class228(new class227(class135.method2223("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class149.field2239 = new class228(new class227(class135.method2223("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1525 = new class228[Statics.field3166];
            for (int var50 = 0; var50 < Statics.field3166; var50++) {
                Statics.field1525[var50] = new class228(new class227(class135.method2223("main_file_cache.idx" + var50), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var58) {
            class148.method623((String) null, var58);
        }
        Statics.field287 = this;
        this.method2789(765, 503, 98);
    }

    @ObfuscatedName("co.f(S)V")
    public static final void method1889() {
        class86.field1513 = false;
        field466 = false;
    }

    @ObfuscatedName("client.d(I)V")
    public final void method222() {
        Statics.field2157 = field468 == 0 ? 43594 : field524 + 40000;
        Statics.field2043 = field468 == 0 ? 443 : field524 + 50000;
        Statics.field262 = Statics.field2157;
        Statics.field3198 = class174.field2877;
        Statics.field2902 = class174.field2878;
        Statics.field768 = class174.field2880;
        Statics.field2644 = class174.field2882;
        class137.method117();
        class137.method2585(Statics.field147);
        class140.method626(Statics.field147);
        Statics.field2710 = class131.method961();
        if (Statics.field2710 != null) {
            Statics.field2710.method2626(Statics.field147);
        }
        Statics.field2033 = new class134(255, class149.field2236, class149.field2239, 500000);
        Statics.field2026 = class9.method1042();
        Statics.field811 = this.getToolkit().getSystemClipboard();
        String var2 = Statics.field2054;
        class138.field2134 = this;
        class138.field2135 = var2;
        if (field468 != 0) {
            field344 = true;
        }
        int var3 = Statics.field2026.field142;
        field492 = 0L;
        if (var3 >= 2) {
            field557 = true;
        } else {
            field557 = false;
        }
        Statics.method48();
        if (field288 >= 25) {
            method127();
        }
        field2195 = true;
    }

    @ObfuscatedName("client.l(B)V")
    public final void method223() {
        field290++;
        this.method226();
        while (true) {
            class199 var1 = class170.field2698;
            class169 var2;
            synchronized (class170.field2698) {
                var2 = (class169) class170.field2694.method3494();
            }
            if (var2 == null) {
                try {
                    if (class183.field2944 == 1) {
                        int var4 = Statics.field2943.method3299();
                        if (var4 > 0 && Statics.field2943.method3362()) {
                            int var5 = var4 - Statics.field2632;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2943.method3374(var5);
                        } else {
                            Statics.field2943.method3302();
                            Statics.field2943.method3391();
                            if (Statics.field2945 == null) {
                                class183.field2944 = 0;
                            } else {
                                class183.field2944 = 2;
                            }
                            Statics.field3133 = null;
                            Statics.field1967 = null;
                        }
                    }
                } catch (Exception var124) {
                    var124.printStackTrace();
                    Statics.field2943.method3302();
                    class183.field2944 = 0;
                    Statics.field3133 = null;
                    Statics.field1967 = null;
                    Statics.field2945 = null;
                }
                method2079();
                class137.method637();
                class140 var7 = class140.field2167;
                synchronized (class140.field2167) {
                    class140.field2161 = class140.field2160;
                    class140.field2152 = class140.field2149;
                    class140.field2156 = class140.field2153 * 788867405;
                    class140.field2151 = class140.field2155;
                    class140.field2154 = class140.field2158;
                    class140.field2163 = class140.field2159;
                    class140.field2164 = class140.field2162;
                    class140.field2155 = 0;
                }
                if (Statics.field2710 != null) {
                    int var9 = Statics.field2710.method2630();
                    field477 = var9;
                }
                if (field288 == 0) {
                    method553();
                    class144.method935();
                } else if (field288 == 5) {
                    class32.method561(this);
                    method553();
                    class144.method935();
                } else if (field288 == 10 || field288 == 11) {
                    class32.method561(this);
                } else if (field288 == 20) {
                    class32.method561(this);
                    method2888();
                } else if (field288 == 25) {
                    method2650();
                }
                if (field288 == 30) {
                    if (field297 > 1) {
                        field297--;
                    }
                    if (field391 > 0) {
                        field391--;
                    }
                    if (field332) {
                        field332 = false;
                        method2897();
                    } else {
                        if (!field552) {
                            field426[0] = class157.field2542;
                            field470[0] = "";
                            field424[0] = 1006;
                            field421 = 1;
                        }
                        for (int var10 = 0; var10 < 100 && method44(); var10++) {
                        }
                        if (field288 == 30) {
                            while (true) {
                                class210 var11 = (class210) class211.field3116.method3541();
                                boolean var12;
                                if (var11 == null) {
                                    var12 = false;
                                } else {
                                    var12 = true;
                                }
                                if (!var12) {
                                    Object var14 = Statics.field1998.field201;
                                    synchronized (Statics.field1998.field201) {
                                        if (!field279) {
                                            Statics.field1998.field194 = 0;
                                        } else if (class140.field2151 != 0 || Statics.field1998.field194 >= 40) {
                                            field321.method2547(76);
                                            field321.method2285(0);
                                            int var15 = field321.field1986;
                                            int var16 = 0;
                                            for (int var17 = 0; var17 < Statics.field1998.field194 && field321.field1986 - var15 < 240; var17++) {
                                                var16++;
                                                int var18 = Statics.field1998.field197[var17];
                                                if (var18 < 0) {
                                                    var18 = 0;
                                                } else if (var18 > 502) {
                                                    var18 = 502;
                                                }
                                                int var19 = Statics.field1998.field196[var17];
                                                if (var19 < 0) {
                                                    var19 = 0;
                                                } else if (var19 > 764) {
                                                    var19 = 764;
                                                }
                                                int var20 = var18 * 765 + var19;
                                                if (Statics.field1998.field197[var17] == -1 && Statics.field1998.field196[var17] == -1) {
                                                    var19 = -1;
                                                    var18 = -1;
                                                    var20 = 524287;
                                                }
                                                if (field351 != var19 || field293 != var18) {
                                                    int var21 = var19 - field351;
                                                    field351 = var19;
                                                    int var22 = var18 - field293;
                                                    field293 = var18;
                                                    if (field294 < 8 && var21 >= -32 && var21 <= 31 && var22 >= -32 && var22 <= 31) {
                                                        var21 += 32;
                                                        var22 += 32;
                                                        field321.method2287((field294 << 12) + (var21 << 6) + var22);
                                                        field294 = 0;
                                                    } else if (field294 < 8) {
                                                        field321.method2288((field294 << 19) + 8388608 + var20);
                                                        field294 = 0;
                                                    } else {
                                                        field321.method2289((field294 << 19) + -1073741824 + var20);
                                                        field294 = 0;
                                                    }
                                                } else if (field294 < 2047) {
                                                    field294++;
                                                }
                                            }
                                            field321.method2298(field321.field1986 - var15);
                                            if (var16 >= Statics.field1998.field194) {
                                                Statics.field1998.field194 = 0;
                                            } else {
                                                Statics.field1998.field194 -= var16;
                                                for (int var23 = 0; var23 < Statics.field1998.field194; var23++) {
                                                    Statics.field1998.field196[var23] = Statics.field1998.field196[var16 + var23];
                                                    Statics.field1998.field197[var23] = Statics.field1998.field197[var16 + var23];
                                                }
                                            }
                                        }
                                    }
                                    if (class140.field2151 == 1 || !Statics.field215 && class140.field2151 == 4 || class140.field2151 == 2) {
                                        long var25 = (class140.field2164 - field343) / 50L;
                                        if (var25 > 4095L) {
                                            var25 = 4095L;
                                        }
                                        field343 = class140.field2164;
                                        int var27 = class140.field2163;
                                        if (var27 < 0) {
                                            var27 = 0;
                                        } else if (var27 > Statics.field2096) {
                                            var27 = Statics.field2096;
                                        }
                                        int var28 = class140.field2154;
                                        if (var28 < 0) {
                                            var28 = 0;
                                        } else if (var28 > Statics.field2056) {
                                            var28 = Statics.field2056;
                                        }
                                        int var29 = (int) var25;
                                        field321.method2547(50);
                                        field321.method2287((var29 << 1) + (class140.field2151 == 2 ? 1 : 0));
                                        field321.method2287(var28);
                                        field321.method2287(var27);
                                    }
                                    if (class137.field2124 > 0) {
                                        field321.method2547(119);
                                        field321.method2287(0);
                                        int var30 = field321.field1986;
                                        long var31 = class115.method82();
                                        for (int var33 = 0; var33 < class137.field2124; var33++) {
                                            long var34 = var31 - field505;
                                            if (var34 > 16777215L) {
                                                var34 = 16777215L;
                                            }
                                            field505 = var31;
                                            field321.method2362(class137.field2118[var33]);
                                            field321.method2288((int) var34);
                                        }
                                        field321.method2453(field321.field1986 - var30);
                                    }
                                    if (field372 > 0) {
                                        field372--;
                                    }
                                    if (class137.field2114[96] || class137.field2114[97] || class137.field2114[98] || class137.field2114[99]) {
                                        field373 = true;
                                    }
                                    if (field373 && field372 <= 0) {
                                        field372 = 20;
                                        field373 = false;
                                        field321.method2547(194);
                                        field321.method2332(field365);
                                        field321.method2287(field366);
                                    }
                                    if (Statics.field146 && !field295) {
                                        field295 = true;
                                        field321.method2547(242);
                                        field321.method2285(1);
                                    }
                                    if (!Statics.field146 && field295) {
                                        field295 = false;
                                        field321.method2547(242);
                                        field321.method2285(0);
                                    }
                                    if (Statics.field2179 != field508) {
                                        field508 = Statics.field2179;
                                        int var36 = Statics.field2179;
                                        int[] var37 = Statics.field777.field1400;
                                        int var38 = var37.length;
                                        for (int var39 = 0; var39 < var38; var39++) {
                                            var37[var39] = 0;
                                        }
                                        int var40 = 1;
                                        while (true) {
                                            if (var40 >= 103) {
                                                int var43 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                                                int var44 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                                                Statics.field777.method1625();
                                                for (int var45 = 1; var45 < 103; var45++) {
                                                    for (int var46 = 1; var46 < 103; var46++) {
                                                        if ((class6.field79[var36][var46][var45] & 0x18) == 0) {
                                                            method2894(var36, var46, var45, var43, var44);
                                                        }
                                                        if (var36 < 3 && (class6.field79[var36 + 1][var46][var45] & 0x8) != 0) {
                                                            method2894(var36 + 1, var46, var45, var43, var44);
                                                        }
                                                    }
                                                }
                                                field509 = 0;
                                                for (int var47 = 0; var47 < 104; var47++) {
                                                    for (int var48 = 0; var48 < 104; var48++) {
                                                        int var49 = Statics.field2175.method1751(Statics.field2179, var47, var48);
                                                        if (var49 != 0) {
                                                            int var50 = var49 >> 14 & 0x7FFF;
                                                            int var51 = class41.method3664(var50).field926;
                                                            if (var51 >= 0) {
                                                                int var52 = var47;
                                                                int var53 = var48;
                                                                if (var51 != 22 && var51 != 29 && var51 != 34 && var51 != 36 && var51 != 46 && var51 != 47 && var51 != 48) {
                                                                    int[][] var54 = field341[Statics.field2179].field1892;
                                                                    for (int var55 = 0; var55 < 10; var55++) {
                                                                        int var56 = (int) (Math.random() * 4.0D);
                                                                        if (var56 == 0 && var52 > 0 && var52 > var47 - 3 && (var54[var52 - 1][var53] & 0x1240108) == 0) {
                                                                            var52--;
                                                                        }
                                                                        if (var56 == 1 && var52 < 103 && var52 < var47 + 3 && (var54[var52 + 1][var53] & 0x1240180) == 0) {
                                                                            var52++;
                                                                        }
                                                                        if (var56 == 2 && var53 > 0 && var53 > var48 - 3 && (var54[var52][var53 - 1] & 0x1240102) == 0) {
                                                                            var53--;
                                                                        }
                                                                        if (var56 == 3 && var53 < 103 && var53 < var48 + 3 && (var54[var52][var53 + 1] & 0x1240120) == 0) {
                                                                            var53++;
                                                                        }
                                                                    }
                                                                }
                                                                field512[field509] = Statics.field2013[var51];
                                                                field510[field509] = var52;
                                                                field511[field509] = var53;
                                                                field509++;
                                                            }
                                                        }
                                                    }
                                                }
                                                Statics.field2003.method1534();
                                                break;
                                            }
                                            int var41 = (103 - var40) * 2048 + 24628;
                                            for (int var42 = 1; var42 < 103; var42++) {
                                                if ((class6.field79[var36][var42][var40] & 0x18) == 0) {
                                                    Statics.field2175.method1756(var37, var41, 512, var36, var42, var40);
                                                }
                                                if (var36 < 3 && (class6.field79[var36 + 1][var42][var40] & 0x8) != 0) {
                                                    Statics.field2175.method1756(var37, var41, 512, var36 + 1, var42, var40);
                                                }
                                                var41 += 4;
                                            }
                                            var40++;
                                        }
                                    }
                                    if (field288 == 30) {
                                        for (class17 var57 = (class17) field522.method3502(); var57 != null; var57 = (class17) field522.method3489()) {
                                            if (var57.field238 > 0) {
                                                var57.field238--;
                                            }
                                            if (var57.field238 != 0) {
                                                if (var57.field231 > 0) {
                                                    var57.field231--;
                                                }
                                                if (var57.field231 == 0 && var57.field223 >= 1 && var57.field224 >= 1 && var57.field223 <= 102 && var57.field224 <= 102 && (var57.field228 < 0 || class6.method184(var57.field228, var57.field221))) {
                                                    method2092(var57.field240, var57.field230, var57.field223, var57.field224, var57.field228, var57.field229, var57.field221);
                                                    var57.field231 = -1;
                                                    if (var57.field232 == var57.field228 && var57.field232 == -1) {
                                                        var57.method3583();
                                                    } else if (var57.field232 == var57.field228 && var57.field229 == var57.field225 && var57.field227 == var57.field221) {
                                                        var57.method3583();
                                                    }
                                                }
                                            } else if (var57.field232 < 0 || class6.method184(var57.field232, var57.field227)) {
                                                method2092(var57.field240, var57.field230, var57.field223, var57.field224, var57.field232, var57.field225, var57.field227);
                                                var57.method3583();
                                            }
                                        }
                                        method1986();
                                        field326++;
                                        if (field326 > 750) {
                                            method2897();
                                        } else {
                                            method2768();
                                            method602();
                                            method2613();
                                            field357++;
                                            if (field392 != 0) {
                                                field381 += 20;
                                                if (field381 >= 400) {
                                                    field392 = 0;
                                                }
                                            }
                                            if (Statics.field2024 != null) {
                                                field393++;
                                                if (field393 >= 15) {
                                                    method2240(Statics.field2024);
                                                    Statics.field2024 = null;
                                                }
                                            }
                                            class173 var58 = Statics.field683;
                                            class173 var59 = Statics.field1371;
                                            Statics.field683 = null;
                                            Statics.field1371 = null;
                                            field427 = null;
                                            field292 = false;
                                            field457 = false;
                                            field502 = 0;
                                            while (true) {
                                                while (Statics.method601() && field502 < 128) {
                                                    if (field446 >= 2 && class137.field2114[82] && Statics.field2288 == 66) {
                                                        String var60 = "";
                                                        Iterator var61 = class12.field162.iterator();
                                                        while (var61.hasNext()) {
                                                            class36 var62 = (class36) var61.next();
                                                            var60 = var60 + var62.field770 + ':' + var62.field773 + '\n';
                                                        }
                                                        Statics.field811.setContents(new StringSelection(var60), (ClipboardOwner) null);
                                                    } else {
                                                        field459[field502] = Statics.field2288;
                                                        field503[field502] = Statics.field730;
                                                        field502++;
                                                    }
                                                }
                                                if (field439 != -1) {
                                                    int var65 = field439;
                                                    int var66 = Statics.field2056;
                                                    int var67 = Statics.field2096;
                                                    if (Statics.method2098(var65)) {
                                                        method73(Statics.field2802[var65], -1, 0, 0, var66, var67, 0, 0);
                                                    }
                                                }
                                                field516++;
                                                while (true) {
                                                    class1 var68;
                                                    class173 var69;
                                                    class173 var70;
                                                    do {
                                                        var68 = (class1) field479.method3494();
                                                        if (var68 == null) {
                                                            while (true) {
                                                                class1 var71;
                                                                class173 var72;
                                                                class173 var73;
                                                                do {
                                                                    var71 = (class1) field403.method3494();
                                                                    if (var71 == null) {
                                                                        while (true) {
                                                                            class1 var74;
                                                                            class173 var75;
                                                                            class173 var76;
                                                                            do {
                                                                                var74 = (class1) field493.method3494();
                                                                                if (var74 == null) {
                                                                                    method1989();
                                                                                    if (field277 != null) {
                                                                                        method871();
                                                                                    }
                                                                                    if (Statics.field1350 != null) {
                                                                                        method2240(Statics.field1350);
                                                                                        field521++;
                                                                                        if (class140.field2161 == 0) {
                                                                                            if (field399) {
                                                                                                if (Statics.field962 == Statics.field1350 && field398 != field310) {
                                                                                                    class173 var77 = Statics.field1350;
                                                                                                    byte var78 = 0;
                                                                                                    if (field442 == 1 && var77.field2870 == 206) {
                                                                                                        var78 = 1;
                                                                                                    }
                                                                                                    if (var77.field2816[field398] <= 0) {
                                                                                                        var78 = 0;
                                                                                                    }
                                                                                                    if (class178.method565(method136(var77))) {
                                                                                                        int var79 = field310;
                                                                                                        int var80 = field398;
                                                                                                        var77.field2816[var80] = var77.field2816[var79];
                                                                                                        var77.field2736[var80] = var77.field2736[var79];
                                                                                                        var77.field2816[var79] = -1;
                                                                                                        var77.field2736[var79] = 0;
                                                                                                    } else if (var78 == 1) {
                                                                                                        int var81 = field310;
                                                                                                        int var82 = field398;
                                                                                                        while (var81 != var82) {
                                                                                                            if (var81 > var82) {
                                                                                                                var77.method3126(var81 - 1, var81);
                                                                                                                var81--;
                                                                                                            } else if (var81 < var82) {
                                                                                                                var77.method3126(var81 + 1, var81);
                                                                                                                var81++;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        var77.method3126(field398, field310);
                                                                                                    }
                                                                                                    field321.method2547(222);
                                                                                                    field321.method2333(field310);
                                                                                                    field321.method2342(Statics.field1350.field2783);
                                                                                                    field321.method2373(field398);
                                                                                                    field321.method2285(var78);
                                                                                                }
                                                                                            } else if ((field419 == 1 || method1444(field421 - 1)) && field421 > 2) {
                                                                                                method2(field299, field397);
                                                                                            } else if (field421 > 0) {
                                                                                                method2974(field299, field397);
                                                                                            }
                                                                                            field393 = 10;
                                                                                            class140.field2151 = 0;
                                                                                            Statics.field1350 = null;
                                                                                        } else if (field521 >= 5 && (class140.field2152 > field299 + 5 || class140.field2152 < field299 - 5 || class140.field2156 * 121255813 > field397 + 5 || class140.field2156 * 121255813 < field397 - 5)) {
                                                                                            field399 = true;
                                                                                        }
                                                                                    }
                                                                                    if (class86.field1489 != -1) {
                                                                                        int var83 = class86.field1489;
                                                                                        int var84 = class86.field1501;
                                                                                        field321.method2547(83);
                                                                                        field321.method2285(5);
                                                                                        field321.method2326(class137.field2114[82] ? (class137.field2114[81] ? 2 : 1) : 0);
                                                                                        field321.method2287(Statics.field2893 + var84);
                                                                                        field321.method2287(Statics.field86 + var83);
                                                                                        class86.field1489 = -1;
                                                                                        field389 = class140.field2154;
                                                                                        field390 = class140.field2163;
                                                                                        field392 = 1;
                                                                                        field381 = 0;
                                                                                        field483 = var83;
                                                                                        field514 = var84;
                                                                                    }
                                                                                    if (Statics.field683 != var58) {
                                                                                        if (var58 != null) {
                                                                                            method2240(var58);
                                                                                        }
                                                                                        if (Statics.field683 != null) {
                                                                                            method2240(Statics.field683);
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field1371 != var59 && field533 == field431) {
                                                                                        if (var59 != null) {
                                                                                            method2240(var59);
                                                                                        }
                                                                                        if (Statics.field1371 != null) {
                                                                                            method2240(Statics.field1371);
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field1371 == null) {
                                                                                        if (field533 > 0) {
                                                                                            field533--;
                                                                                        }
                                                                                    } else if (field533 < field431) {
                                                                                        field533++;
                                                                                        if (field533 == field431) {
                                                                                            method2240(Statics.field1371);
                                                                                        }
                                                                                    }
                                                                                    int var85 = field345 + Statics.field859.field826;
                                                                                    int var86 = field347 + Statics.field859.field801;
                                                                                    if (Statics.field565 - var85 < -500 || Statics.field565 - var85 > 500 || Statics.field2183 - var86 < -500 || Statics.field2183 - var86 > 500) {
                                                                                        Statics.field565 = var85;
                                                                                        Statics.field2183 = var86;
                                                                                    }
                                                                                    if (Statics.field565 != var85) {
                                                                                        Statics.field565 += (var85 - Statics.field565) / 16;
                                                                                    }
                                                                                    if (Statics.field2183 != var86) {
                                                                                        Statics.field2183 += (var86 - Statics.field2183) / 16;
                                                                                    }
                                                                                    if (class140.field2161 == 4 && Statics.field215) {
                                                                                        int var87 = class140.field2156 * 121255813 - field370 * 121255813;
                                                                                        field368 = var87 * 2;
                                                                                        field370 = (var87 == -1 || var87 == 1 ? class140.field2156 * 121255813 : (field370 * 121255813 + class140.field2156 * 121255813) / 2) * 788867405;
                                                                                        int var88 = field464 - class140.field2152;
                                                                                        field367 = var88 * 2;
                                                                                        field464 = var88 == -1 || var88 == 1 ? class140.field2152 : (field464 + class140.field2152) / 2;
                                                                                    } else {
                                                                                        if (class137.field2114[96]) {
                                                                                            field367 += (-24 - field367) / 2;
                                                                                        } else if (class137.field2114[97]) {
                                                                                            field367 += (24 - field367) / 2;
                                                                                        } else {
                                                                                            field367 /= 2;
                                                                                        }
                                                                                        if (class137.field2114[98]) {
                                                                                            field368 += (12 - field368) / 2;
                                                                                        } else if (class137.field2114[99]) {
                                                                                            field368 += (-12 - field368) / 2;
                                                                                        } else {
                                                                                            field368 /= 2;
                                                                                        }
                                                                                        field370 = class140.field2156;
                                                                                        field464 = class140.field2152;
                                                                                    }
                                                                                    field366 = field367 / 2 + field366 & 0x7FF;
                                                                                    field365 += field368 / 2;
                                                                                    if (field365 < 128) {
                                                                                        field365 = 128;
                                                                                    }
                                                                                    if (field365 > 383) {
                                                                                        field365 = 383;
                                                                                    }
                                                                                    int var89 = Statics.field565 >> 7;
                                                                                    int var90 = Statics.field2183 >> 7;
                                                                                    int var91 = method819(Statics.field565, Statics.field2183, Statics.field2179);
                                                                                    int var92 = 0;
                                                                                    if (var89 > 3 && var90 > 3 && var89 < 100 && var90 < 100) {
                                                                                        for (int var93 = var89 - 4; var93 <= var89 + 4; var93++) {
                                                                                            for (int var94 = var90 - 4; var94 <= var90 + 4; var94++) {
                                                                                                int var95 = Statics.field2179;
                                                                                                if (var95 < 3 && (class6.field79[1][var93][var94] & 0x2) == 2) {
                                                                                                    var95++;
                                                                                                }
                                                                                                int var96 = var91 - class6.field98[var95][var93][var94];
                                                                                                if (var96 > var92) {
                                                                                                    var92 = var96;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    int var97 = var92 * 192;
                                                                                    if (var97 > 98048) {
                                                                                        var97 = 98048;
                                                                                    }
                                                                                    if (var97 < 32768) {
                                                                                        var97 = 32768;
                                                                                    }
                                                                                    if (var97 > field374) {
                                                                                        field374 += (var97 - field374) / 24;
                                                                                    } else if (var97 < field374) {
                                                                                        field374 += (var97 - field374) / 80;
                                                                                    }
                                                                                    if (field528) {
                                                                                        int var98 = Statics.field1057 * 128 + 64;
                                                                                        int var99 = Statics.field1860 * 128 + 64;
                                                                                        int var100 = method819(var98, var99, Statics.field2179) - Statics.field248;
                                                                                        if (Statics.field186 < var98) {
                                                                                            Statics.field186 += Statics.field653 * (var98 - Statics.field186) / 1000 + Statics.field1956;
                                                                                            if (Statics.field186 > var98) {
                                                                                                Statics.field186 = var98;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field186 > var98) {
                                                                                            Statics.field186 -= Statics.field653 * (Statics.field186 - var98) / 1000 + Statics.field1956;
                                                                                            if (Statics.field186 < var98) {
                                                                                                Statics.field186 = var98;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field1095 < var100) {
                                                                                            Statics.field1095 += Statics.field653 * (var100 - Statics.field1095) / 1000 + Statics.field1956;
                                                                                            if (Statics.field1095 > var100) {
                                                                                                Statics.field1095 = var100;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field1095 > var100) {
                                                                                            Statics.field1095 -= Statics.field653 * (Statics.field1095 - var100) / 1000 + Statics.field1956;
                                                                                            if (Statics.field1095 < var100) {
                                                                                                Statics.field1095 = var100;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field967 < var99) {
                                                                                            Statics.field967 += Statics.field653 * (var99 - Statics.field967) / 1000 + Statics.field1956;
                                                                                            if (Statics.field967 > var99) {
                                                                                                Statics.field967 = var99;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field967 > var99) {
                                                                                            Statics.field967 -= Statics.field653 * (Statics.field967 - var99) / 1000 + Statics.field1956;
                                                                                            if (Statics.field967 < var99) {
                                                                                                Statics.field967 = var99;
                                                                                            }
                                                                                        }
                                                                                        int var101 = Statics.field1009 * 128 + 64;
                                                                                        int var102 = Statics.field781 * 128 + 64;
                                                                                        int var103 = method819(var101, var102, Statics.field2179) - Statics.field63;
                                                                                        int var104 = var101 - Statics.field186;
                                                                                        int var105 = var103 - Statics.field1095;
                                                                                        int var106 = var102 - Statics.field967;
                                                                                        int var107 = (int) Math.sqrt((double) (var104 * var104 + var106 * var106));
                                                                                        int var108 = (int) (Math.atan2((double) var105, (double) var107) * 325.949D) & 0x7FF;
                                                                                        int var109 = (int) (Math.atan2((double) var104, (double) var106) * -325.949D) & 0x7FF;
                                                                                        if (var108 < 128) {
                                                                                            var108 = 128;
                                                                                        }
                                                                                        if (var108 > 383) {
                                                                                            var108 = 383;
                                                                                        }
                                                                                        if (Statics.field2302 < var108) {
                                                                                            Statics.field2302 += Statics.field590 * (var108 - Statics.field2302) / 1000 + Statics.field868;
                                                                                            if (Statics.field2302 > var108) {
                                                                                                Statics.field2302 = var108;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field2302 > var108) {
                                                                                            Statics.field2302 -= Statics.field590 * (Statics.field2302 - var108) / 1000 + Statics.field868;
                                                                                            if (Statics.field2302 < var108) {
                                                                                                Statics.field2302 = var108;
                                                                                            }
                                                                                        }
                                                                                        int var110 = var109 - Statics.field2174;
                                                                                        if (var110 > 1024) {
                                                                                            var110 -= 2048;
                                                                                        }
                                                                                        if (var110 < -1024) {
                                                                                            var110 += 2048;
                                                                                        }
                                                                                        if (var110 > 0) {
                                                                                            Statics.field2174 += Statics.field590 * var110 / 1000 + Statics.field868;
                                                                                            Statics.field2174 &= 0x7FF;
                                                                                        }
                                                                                        if (var110 < 0) {
                                                                                            Statics.field2174 -= Statics.field590 * -var110 / 1000 + Statics.field868;
                                                                                            Statics.field2174 &= 0x7FF;
                                                                                        }
                                                                                        int var111 = var109 - Statics.field2174;
                                                                                        if (var111 > 1024) {
                                                                                            var111 -= 2048;
                                                                                        }
                                                                                        if (var111 < -1024) {
                                                                                            var111 += 2048;
                                                                                        }
                                                                                        if (var111 < 0 && var110 > 0 || var111 > 0 && var110 < 0) {
                                                                                            Statics.field2174 = var109;
                                                                                        }
                                                                                    }
                                                                                    for (int var112 = 0; var112 < 5; var112++) {
                                                                                        int var10002 = field440[var112]++;
                                                                                    }
                                                                                    Statics.field60.method195();
                                                                                    int var113 = class140.method2236();
                                                                                    int var114 = class137.field2128;
                                                                                    if (var113 > 15000 && var114 > 15000) {
                                                                                        field391 = 250;
                                                                                        class140.method622(14500);
                                                                                        field321.method2547(27);
                                                                                    }
                                                                                    field556++;
                                                                                    if (field556 > 500) {
                                                                                        field556 = 0;
                                                                                        int var116 = (int) (Math.random() * 8.0D);
                                                                                        if ((var116 & 0x1) == 1) {
                                                                                            field345 += field346;
                                                                                        }
                                                                                        if ((var116 & 0x2) == 2) {
                                                                                            field347 += field504;
                                                                                        }
                                                                                        if ((var116 & 0x4) == 4) {
                                                                                            field430 += field350;
                                                                                        }
                                                                                    }
                                                                                    if (field345 < -50) {
                                                                                        field346 = 2;
                                                                                    }
                                                                                    if (field345 > 50) {
                                                                                        field346 = -2;
                                                                                    }
                                                                                    if (field347 < -55) {
                                                                                        field504 = 2;
                                                                                    }
                                                                                    if (field347 > 55) {
                                                                                        field504 = -2;
                                                                                    }
                                                                                    if (field430 < -40) {
                                                                                        field350 = 1;
                                                                                    }
                                                                                    if (field430 > 40) {
                                                                                        field350 = -1;
                                                                                    }
                                                                                    field405++;
                                                                                    if (field405 > 500) {
                                                                                        field405 = 0;
                                                                                        int var117 = (int) (Math.random() * 8.0D);
                                                                                        if ((var117 & 0x1) == 1) {
                                                                                            field352 += field353;
                                                                                        }
                                                                                        if ((var117 & 0x2) == 2) {
                                                                                            field354 += field355;
                                                                                        }
                                                                                    }
                                                                                    if (field352 < -60) {
                                                                                        field353 = 2;
                                                                                    }
                                                                                    if (field352 > 60) {
                                                                                        field353 = -2;
                                                                                    }
                                                                                    if (field354 < -20) {
                                                                                        field355 = 1;
                                                                                    }
                                                                                    if (field354 > 10) {
                                                                                        field355 = -1;
                                                                                    }
                                                                                    for (class39 var118 = (class39) field550.method3454(); var118 != null; var118 = (class39) field550.method3455()) {
                                                                                        if ((long) var118.field866 < class115.method82() / 1000L - 5L) {
                                                                                            if (var118.field864 > 0) {
                                                                                                class12.method2763(5, "", var118.field863 + class157.field2453);
                                                                                            }
                                                                                            if (var118.field864 == 0) {
                                                                                                class12.method2763(5, "", var118.field863 + class157.field2454);
                                                                                            }
                                                                                            var118.method3578();
                                                                                        }
                                                                                    }
                                                                                    field327++;
                                                                                    if (field327 > 50) {
                                                                                        field321.method2547(218);
                                                                                    }
                                                                                    try {
                                                                                        if (Statics.field134 != null && field321.field1986 > 0) {
                                                                                            Statics.field134.method2769(field321.field1987, 0, field321.field1986);
                                                                                            field321.field1986 = 0;
                                                                                            field327 = 0;
                                                                                            return;
                                                                                        }
                                                                                    } catch (IOException var120) {
                                                                                        method2897();
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                var75 = var74.field3;
                                                                                if (var75.field2745 < 0) {
                                                                                    break;
                                                                                }
                                                                                var76 = class173.method899(var75.field2752);
                                                                            } while (var76 == null || var76.field2844 == null || var75.field2745 >= var76.field2844.length || var76.field2844[var75.field2745] != var75);
                                                                            class37.method105(var74);
                                                                        }
                                                                    }
                                                                    var72 = var71.field3;
                                                                    if (var72.field2745 < 0) {
                                                                        break;
                                                                    }
                                                                    var73 = class173.method899(var72.field2752);
                                                                } while (var73 == null || var73.field2844 == null || var72.field2745 >= var73.field2844.length || var73.field2844[var72.field2745] != var72);
                                                                class37.method105(var71);
                                                            }
                                                        }
                                                        var69 = var68.field3;
                                                        if (var69.field2745 < 0) {
                                                            break;
                                                        }
                                                        var70 = class173.method899(var69.field2752);
                                                    } while (var70 == null || var70.field2844 == null || var69.field2745 >= var70.field2844.length || var70.field2844[var69.field2745] != var69);
                                                    class37.method105(var68);
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                                field321.method2547(167);
                                field321.method2285(0);
                                int var13 = field321.field1986;
                                class211.method2963(field321);
                                field321.method2298(field321.field1986 - var13);
                            }
                        }
                    }
                } else if (field288 == 40 || field288 == 45) {
                    method2888();
                }
                return;
            }
            var2.field2691.method3072(var2.field2689, (int) var2.field3102, var2.field2687, false);
        }
    }

    @ObfuscatedName("client.r(I)V")
    public final void method224() {
        boolean var1;
        label344: {
            try {
                if (class183.field2944 == 2) {
                    if (Statics.field3133 == null) {
                        Statics.field3133 = class180.method3216(Statics.field2945, Statics.field1767, Statics.field2942);
                        if (Statics.field3133 == null) {
                            var1 = false;
                            break label344;
                        }
                    }
                    if (Statics.field1967 == null) {
                        Statics.field1967 = new class60(Statics.field2940, Statics.field2941);
                    }
                    if (Statics.field2943.method3307(Statics.field3133, Statics.field2947, Statics.field1967, 22050)) {
                        Statics.field2943.method3300();
                        Statics.field2943.method3374(Statics.field2727);
                        Statics.field2943.method3306(Statics.field3133, Statics.field2946);
                        class183.field2944 = 0;
                        Statics.field3133 = null;
                        Statics.field1967 = null;
                        Statics.field2945 = null;
                        var1 = true;
                        break label344;
                    }
                }
            } catch (Exception var44) {
                var44.printStackTrace();
                Statics.field2943.method3302();
                class183.field2944 = 0;
                Statics.field3133 = null;
                Statics.field1967 = null;
                Statics.field2945 = null;
            }
            var1 = false;
        }
        if (var1 && field489 && Statics.field578 != null) {
            Statics.field578.method1144();
        }
        if (field288 == 10 || field288 == 20 || field288 == 30) {
            if (field492 != 0L && class115.method82() > field492) {
                int var4 = method612();
                field492 = 0L;
                if (var4 >= 2) {
                    field557 = true;
                } else {
                    field557 = false;
                }
                Statics.method48();
                if (field288 >= 25) {
                    method127();
                }
                field2195 = true;
            } else if (field2209) {
                Canvas var5 = Statics.field147;
                var5.removeKeyListener(class137.field2110);
                var5.removeFocusListener(class137.field2110);
                class137.field2105 = -1;
                Canvas var6 = Statics.field147;
                var6.removeMouseListener(class140.field2167);
                var6.removeMouseMotionListener(class140.field2167);
                var6.removeFocusListener(class140.field2167);
                class140.field2160 = 0;
                if (Statics.field2710 != null) {
                    Statics.field2710.method2625(Statics.field147);
                }
                Statics.field287.method2790();
                Statics.field147.setBackground(Color.black);
                class137.method2585(Statics.field147);
                class140.method626(Statics.field147);
                if (Statics.field2710 != null) {
                    Statics.field2710.method2626(Statics.field147);
                }
                if (field439 != -1) {
                    int var7 = field439;
                    int var8 = Statics.field2056;
                    int var9 = Statics.field2096;
                    if (Statics.method2098(var7)) {
                        method1887(Statics.field2802[var7], -1, var8, var9, false);
                    }
                }
                field2199 = true;
            }
        }
        Dimension var10 = this.method2802();
        if (Statics.field614 != var10.width || Statics.field1606 != var10.height || field2199) {
            Statics.method48();
            field492 = class115.method82() + 500L;
            field2199 = false;
        }
        boolean var11 = false;
        if (field2195) {
            field2195 = false;
            var11 = true;
            for (int var12 = 0; var12 < 100; var12++) {
                field428[var12] = true;
            }
        }
        if (var11) {
            method3183();
        }
        if (field288 == 0) {
            class144.method2609(class32.field712, class32.field714, (Color) null, var11);
        } else if (field288 == 5) {
            class32.method3174(Statics.field333, Statics.field2295, Statics.field782, var11);
        } else if (field288 == 10 || field288 == 11) {
            class32.method3174(Statics.field333, Statics.field2295, Statics.field782, var11);
        } else if (field288 == 20) {
            class32.method3174(Statics.field333, Statics.field2295, Statics.field782, var11);
        } else if (field288 == 25) {
            if (field338 == 1) {
                if (field334 > field335) {
                    field335 = field334;
                }
                int var13 = (field335 * 50 - field334 * 50) / field335;
                method46(class157.field2330 + class2.field24 + class2.field26 + var13 + "%" + class2.field22, false);
            } else if (field338 == 2) {
                if (field336 > field382) {
                    field382 = field336;
                }
                int var14 = (field382 * 50 - field336 * 50) / field382 + 50;
                method46(class157.field2330 + class2.field24 + class2.field26 + var14 + "%" + class2.field22, false);
            } else {
                method46(class157.field2330, false);
            }
        } else if (field288 == 30) {
            if (field439 != -1) {
                method1(field439);
            }
            for (int var15 = 0; var15 < field291; var15++) {
                if (field428[var15]) {
                    field413[var15] = true;
                }
                field433[var15] = field428[var15];
                field428[var15] = false;
            }
            field465 = field290;
            field349 = -1;
            field429 = -1;
            Statics.field962 = null;
            if (field439 != -1) {
                field291 = 0;
                method3045(field439, 0, 0, Statics.field2056, Statics.field2096, 0, 0, -1);
            }
            class80.method1665();
            if (field552) {
                method47();
            } else if (field349 != -1) {
                int var16 = field349;
                int var17 = field429;
                if (field421 >= 2 || field432 != 0 || field434) {
                    String var18;
                    if (field432 == 1 && field421 < 2) {
                        var18 = class157.field2456 + class157.field2308 + field543 + " " + class2.field23;
                    } else if (field434 && field421 < 2) {
                        var18 = field437 + class157.field2308 + field541 + " " + class2.field23;
                    } else {
                        int var19 = field421 - 1;
                        String var20;
                        if (field470[var19].length() > 0) {
                            var20 = field426[var19] + class157.field2308 + field470[var19];
                        } else {
                            var20 = field426[var19];
                        }
                        var18 = var20;
                    }
                    if (field421 > 2) {
                        var18 = var18 + class2.method968(16777215) + " " + '/' + " " + (field421 - 2) + class157.field2460;
                    }
                    Statics.field333.method3690(var18, var16 + 4, var17 + 15, 16777215, 0, field290 / 1000);
                }
            }
            if (field491 == 3) {
                for (int var21 = 0; var21 < field291; var21++) {
                    if (field433[var21]) {
                        class80.method1685(field487[var21], field438[var21], field283[var21], field296[var21], 16711935, 128);
                    } else if (field413[var21]) {
                        class80.method1685(field487[var21], field438[var21], field283[var21], field296[var21], 16711680, 128);
                    }
                }
            }
            int var22 = Statics.field2179;
            int var23 = Statics.field859.field826;
            int var24 = Statics.field859.field801;
            int var25 = field357;
            for (class24 var26 = (class24) class24.field602.method3502(); var26 != null; var26 = (class24) class24.field602.method3489()) {
                if (var26.field601 != -1 || var26.field603 != null) {
                    int var27 = 0;
                    if (var23 > var26.field596) {
                        var27 += var23 - var26.field596;
                    } else if (var23 < var26.field594) {
                        var27 += var26.field594 - var23;
                    }
                    if (var24 > var26.field597) {
                        var27 += var24 - var26.field597;
                    } else if (var24 < var26.field595) {
                        var27 += var26.field595 - var24;
                    }
                    if (var27 - 64 > var26.field607 || field342 == 0 || var26.field593 != var22) {
                        if (var26.field600 != null) {
                            Statics.field562.method1119(var26.field600);
                            var26.field600 = null;
                        }
                        if (var26.field605 != null) {
                            Statics.field562.method1119(var26.field605);
                            var26.field605 = null;
                        }
                    } else {
                        var27 -= 64;
                        if (var27 < 0) {
                            var27 = 0;
                        }
                        int var28 = field342 * (var26.field607 - var27) / var26.field607;
                        class59 var10000;
                        if (var26.field600 != null) {
                            var26.field600.method1237(var28);
                        } else if (var26.field601 >= 0) {
                            var10000 = (class59) null;
                            class59 var29 = class59.method1181(Statics.field580, var26.field601, 0);
                            if (var29 != null) {
                                class63 var30 = var29.method1182().method1208(Statics.field963);
                                class65 var31 = class65.method1233(var30, 100, var28);
                                var31.method1236(-1);
                                Statics.field562.method1093(var31);
                                var26.field600 = var31;
                            }
                        }
                        if (var26.field605 != null) {
                            var26.field605.method1237(var28);
                            if (!var26.field605.method3586()) {
                                var26.field605 = null;
                            }
                        } else if (var26.field603 != null && (var26.field599 -= var25) <= 0) {
                            int var32 = (int) (Math.random() * (double) var26.field603.length);
                            var10000 = (class59) null;
                            class59 var33 = class59.method1181(Statics.field580, var26.field603[var32], 0);
                            if (var33 != null) {
                                class63 var34 = var33.method1182().method1208(Statics.field963);
                                class65 var35 = class65.method1233(var34, 100, var28);
                                var35.method1236(0);
                                Statics.field562.method1093(var35);
                                var26.field605 = var35;
                                var26.field599 = var26.field598 + (int) (Math.random() * (double) (var26.field604 - var26.field598));
                            }
                        }
                    }
                }
            }
            field357 = 0;
        } else if (field288 == 40) {
            method46(class157.field2316 + class2.field24 + class157.field2318, false);
        } else if (field288 == 45) {
            method46(class157.field2464, false);
        }
        if (field288 == 30 && field491 == 0 && !var11) {
            try {
                Graphics var36 = Statics.field147.getGraphics();
                for (int var37 = 0; var37 < field291; var37++) {
                    if (field413[var37]) {
                        Statics.field2003.method1473(var36, field487[var37], field438[var37], field283[var37], field296[var37]);
                        field413[var37] = false;
                    }
                }
            } catch (Exception var43) {
                Statics.field147.repaint();
            }
        } else if (field288 > 0) {
            try {
                Graphics var39 = Statics.field147.getGraphics();
                Statics.field2003.method1490(var39, 0, 0);
                for (int var40 = 0; var40 < field291; var40++) {
                    field413[var40] = false;
                }
            } catch (Exception var42) {
                Statics.field147.repaint();
            }
        }
    }

    @ObfuscatedName("client.g(I)V")
    public final void method225() {
        if (Statics.field60.method196()) {
            Statics.field60.method193();
        }
        if (Statics.field1998 != null) {
            Statics.field1998.field195 = false;
        }
        Statics.field1998 = null;
        if (Statics.field134 != null) {
            Statics.field134.method2765();
            Statics.field134 = null;
        }
        if (class137.field2110 != null) {
            class137 var1 = class137.field2110;
            synchronized (class137.field2110) {
                class137.field2110 = null;
            }
        }
        if (class140.field2167 != null) {
            class140 var3 = class140.field2167;
            synchronized (class140.field2167) {
                class140.field2167 = null;
            }
        }
        Statics.field2710 = null;
        if (Statics.field578 != null) {
            Statics.field578.method1148();
        }
        if (Statics.field2693 != null) {
            Statics.field2693.method1148();
        }
        class171.method928();
        class170.method865();
        class149.method1536();
    }

    @ObfuscatedName("a.h(II)V")
    public static void method162(int arg0) {
        if (field288 == arg0) {
            return;
        }
        if (field288 == 0) {
            class144.method624();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field312 = 0;
            field313 = 0;
            field314 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field751 != null) {
            Statics.field751.method2765();
            Statics.field751 = null;
        }
        if (field288 == 25) {
            field338 = 0;
            field334 = 0;
            field335 = 1;
            field336 = 0;
            field382 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class32.method1968(Statics.field147, Statics.field2017, Statics.field2723, true, 0);
        } else if (arg0 == 20) {
            class32.method1968(Statics.field147, Statics.field2017, Statics.field2723, true, field288 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class32.method1968(Statics.field147, Statics.field2017, Statics.field2723, false, 4);
        } else {
            class32.method166();
        }
        field288 = arg0;
    }

    @ObfuscatedName("client.n(B)V")
    public void method226() {
        if (field288 == 1000) {
            return;
        }
        long var1 = class115.method82();
        int var3 = (int) (var1 - Statics.field2704);
        Statics.field2704 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class171.field2705 += var3;
        boolean var4;
        if (class171.field2707 == 0 && class171.field2711 == 0 && class171.field2708 == 0 && class171.field2703 == 0) {
            var4 = true;
        } else if (Statics.field971 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class171.field2705 > 30000) {
                        throw new IOException();
                    }
                    while (class171.field2711 < 20 && class171.field2703 > 0) {
                        class172 var5 = (class172) class171.field2702.method3464();
                        class119 var6 = new class119(4);
                        var6.method2285(1);
                        var6.method2288((int) var5.field3102);
                        Statics.field971.method2769(var6.field1987, 0, 4);
                        class171.field2720.method3470(var5, var5.field3102);
                        class171.field2703--;
                        class171.field2711++;
                    }
                    while (class171.field2707 < 20 && class171.field2708 > 0) {
                        class172 var7 = (class172) class171.field2706.method3549();
                        class119 var8 = new class119(4);
                        var8.method2285(0);
                        var8.method2288((int) var7.field3102);
                        Statics.field971.method2769(var8.field1987, 0, 4);
                        var7.method3565();
                        class171.field2709.method3470(var7, var7.field3102);
                        class171.field2708--;
                        class171.field2707++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field971.method2767();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class171.field2705 = 0;
                        byte var11 = 0;
                        if (Statics.field1353 == null) {
                            var11 = 8;
                        } else if (class171.field2713 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class171.field2712.field1986;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field971.method2777(class171.field2712.field1987, class171.field2712.field1986, var12);
                            if (class171.field2701 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class171.field2712.field1987[class171.field2712.field1986 + var13] ^= class171.field2701;
                                }
                            }
                            class171.field2712.field1986 += var12;
                            if (class171.field2712.field1986 < var11) {
                                break;
                            }
                            if (Statics.field1353 == null) {
                                class171.field2712.field1986 = 0;
                                int var14 = class171.field2712.method2457();
                                int var15 = class171.field2712.method2415();
                                int var16 = class171.field2712.method2457();
                                int var17 = class171.field2712.method2306();
                                long var18 = (long) ((var14 << 16) + var15);
                                class172 var20 = (class172) class171.field2720.method3462(var18);
                                Statics.field2716 = true;
                                if (var20 == null) {
                                    var20 = (class172) class171.field2709.method3462(var18);
                                    Statics.field2716 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1353 = var20;
                                Statics.field2214 = new class119(var17 + var21 + Statics.field1353.field2726);
                                Statics.field2214.method2285(var16);
                                Statics.field2214.method2289(var17);
                                class171.field2713 = 8;
                                class171.field2712.field1986 = 0;
                            } else if (class171.field2713 == 0) {
                                if (class171.field2712.field1987[0] == -1) {
                                    class171.field2713 = 1;
                                    class171.field2712.field1986 = 0;
                                } else {
                                    Statics.field1353 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2214.field1987.length - Statics.field1353.field2726;
                            int var23 = 512 - class171.field2713;
                            if (var23 > var22 - Statics.field2214.field1986) {
                                var23 = var22 - Statics.field2214.field1986;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field971.method2777(Statics.field2214.field1987, Statics.field2214.field1986, var23);
                            if (class171.field2701 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2214.field1987[Statics.field2214.field1986 + var24] ^= class171.field2701;
                                }
                            }
                            Statics.field2214.field1986 += var23;
                            class171.field2713 += var23;
                            if (Statics.field2214.field1986 == var22) {
                                if (Statics.field1353.field3102 == 16711935L) {
                                    Statics.field1962 = Statics.field2214;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class168 var26 = class171.field2715[var25];
                                        if (var26 != null) {
                                            Statics.field1962.field1986 = var25 * 8 + 5;
                                            int var27 = Statics.field1962.method2306();
                                            int var28 = Statics.field1962.method2306();
                                            var26.method3070(var27, var28);
                                        }
                                    }
                                } else {
                                    class171.field2714.reset();
                                    class171.field2714.update(Statics.field2214.field1987, 0, var22);
                                    int var29 = (int) class171.field2714.getValue();
                                    if (Statics.field1353.field2725 != var29) {
                                        try {
                                            Statics.field971.method2765();
                                        } catch (Exception var35) {
                                        }
                                        class171.field2717++;
                                        Statics.field971 = null;
                                        class171.field2701 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class171.field2717 = 0;
                                    class171.field2700 = 0;
                                    Statics.field1353.field2730.method3077((int) (Statics.field1353.field3102 & 0xFFFFL), Statics.field2214.field1987, (Statics.field1353.field3102 & 0xFF0000L) == 16711680L, Statics.field2716);
                                }
                                Statics.field1353.method3583();
                                if (Statics.field2716) {
                                    class171.field2711--;
                                } else {
                                    class171.field2707--;
                                }
                                class171.field2713 = 0;
                                Statics.field1353 = null;
                                Statics.field2214 = null;
                            } else {
                                if (class171.field2713 != 512) {
                                    break;
                                }
                                class171.field2713 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field971.method2765();
                } catch (Exception var34) {
                }
                class171.field2700++;
                Statics.field971 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method227();
        }
    }

    @ObfuscatedName("client.j(B)V")
    public void method227() {
        if (class171.field2717 >= 4) {
            this.method2834("js5crc");
            field288 = 1000;
            return;
        }
        if (class171.field2700 >= 4) {
            if (field288 <= 5) {
                this.method2834("js5io");
                field288 = 1000;
                return;
            }
            field309 = 3000;
            class171.field2700 = 3;
        }
        if (--field309 + 1 > 0) {
            return;
        }
        try {
            if (field308 == 0) {
                Statics.field1175 = Statics.field606.method2674(Statics.field1552, Statics.field262);
                field308++;
            }
            if (field308 == 1) {
                if (Statics.field1175.field2224 == 2) {
                    this.method354(-1);
                    return;
                }
                if (Statics.field1175.field2224 == 1) {
                    field308++;
                }
            }
            if (field308 == 2) {
                Statics.field613 = new class143((Socket) Statics.field1175.field2222, Statics.field606);
                class119 var1 = new class119(5);
                var1.method2285(15);
                var1.method2289(98);
                Statics.field613.method2769(var1.field1987, 0, 5);
                field308++;
                Statics.field99 = class115.method82();
            }
            if (field308 == 3) {
                if (field288 <= 5 || Statics.field613.method2767() > 0) {
                    int var2 = Statics.field613.method2781();
                    if (var2 != 0) {
                        this.method354(var2);
                        return;
                    }
                    field308++;
                } else if (class115.method82() - Statics.field99 > 30000L) {
                    this.method354(-2);
                    return;
                }
            }
            if (field308 == 4) {
                class143 var3 = Statics.field613;
                boolean var4 = field288 > 20;
                if (Statics.field971 != null) {
                    try {
                        Statics.field971.method2765();
                    } catch (Exception var14) {
                    }
                    Statics.field971 = null;
                }
                Statics.field971 = var3;
                class171.method2901(var4);
                class171.field2712.field1986 = 0;
                Statics.field1353 = null;
                Statics.field2214 = null;
                class171.field2713 = 0;
                while (true) {
                    class172 var6 = (class172) class171.field2720.method3464();
                    if (var6 == null) {
                        while (true) {
                            class172 var7 = (class172) class171.field2709.method3464();
                            if (var7 == null) {
                                if (class171.field2701 != 0) {
                                    try {
                                        class119 var8 = new class119(4);
                                        var8.method2285(4);
                                        var8.method2285(class171.field2701);
                                        var8.method2287(0);
                                        Statics.field971.method2769(var8.field1987, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field971.method2765();
                                        } catch (Exception var12) {
                                        }
                                        class171.field2700++;
                                        Statics.field971 = null;
                                    }
                                }
                                class171.field2705 = 0;
                                Statics.field2704 = class115.method82();
                                Statics.field1175 = null;
                                Statics.field613 = null;
                                field308 = 0;
                                field311 = 0;
                                return;
                            }
                            class171.field2706.method3547(var7);
                            class171.field2718.method3470(var7, var7.field3102);
                            class171.field2708++;
                            class171.field2707--;
                        }
                    }
                    class171.field2702.method3470(var6, var6.field3102);
                    class171.field2703++;
                    class171.field2711--;
                }
            }
        } catch (IOException var15) {
            this.method354(-3);
        }
    }

    @ObfuscatedName("client.a(II)V")
    public void method354(int arg0) {
        Statics.field1175 = null;
        Statics.field613 = null;
        field308 = 0;
        if (Statics.field262 == Statics.field2157) {
            Statics.field262 = Statics.field2043;
        } else {
            Statics.field262 = Statics.field2157;
        }
        field311++;
        if (field311 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field288 <= 5) {
                this.method2834("js5connect_full");
                field288 = 1000;
            } else {
                field309 = 3000;
            }
        } else if (field311 >= 2 && arg0 == 6) {
            this.method2834("js5connect_outofdate");
            field288 = 1000;
        } else if (field311 >= 4) {
            if (field288 <= 5) {
                this.method2834("js5connect");
                field288 = 1000;
            } else {
                field309 = 3000;
            }
        }
    }

    @ObfuscatedName("s.b(I)V")
    public static void method553() {
        if (field307 == 0) {
            Statics.field2175 = new class86(4, 104, 104, class6.field98);
            for (int var0 = 0; var0 < 4; var0++) {
                field341[var0] = new class108(104, 104);
            }
            Statics.field777 = new class79(512, 512);
            class32.field714 = class157.field2444;
            class32.field712 = 5;
            field307 = 20;
        } else if (field307 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class91.field1580[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class86.method1757(var1, 500, 800, 512, 334);
            class32.field714 = class157.field2319;
            class32.field712 = 10;
            field307 = 30;
        } else if (field307 == 30) {
            Statics.field387 = method2962(0, false, true, true);
            Statics.field78 = method2962(1, false, true, true);
            Statics.field2900 = method2962(2, true, false, true);
            Statics.field2002 = method2962(3, false, true, true);
            Statics.field580 = method2962(4, false, true, true);
            Statics.field993 = method2962(5, true, true, true);
            Statics.field1608 = method2962(6, true, true, false);
            Statics.field206 = method2962(7, false, true, true);
            Statics.field2723 = method2962(8, false, true, true);
            Statics.field202 = method2962(9, false, true, true);
            Statics.field2017 = method2962(10, false, true, true);
            Statics.field2977 = method2962(11, false, true, true);
            Statics.field2001 = method2962(12, false, true, true);
            Statics.field621 = method2962(13, true, false, true);
            Statics.field2638 = method2962(14, false, true, false);
            Statics.field18 = method2962(15, false, true, true);
            class32.field714 = class157.field2320;
            class32.field712 = 20;
            field307 = 40;
        } else if (field307 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field387.method3069() * 4 / 100;
            int var8 = var7 + Statics.field78.method3069() * 4 / 100;
            int var9 = var8 + Statics.field2900.method3069() * 2 / 100;
            int var10 = var9 + Statics.field2002.method3069() * 2 / 100;
            int var11 = var10 + Statics.field580.method3069() * 6 / 100;
            int var12 = var11 + Statics.field993.method3069() * 4 / 100;
            int var13 = var12 + Statics.field1608.method3069() * 2 / 100;
            int var14 = var13 + Statics.field206.method3069() * 60 / 100;
            int var15 = var14 + Statics.field2723.method3069() * 2 / 100;
            int var16 = var15 + Statics.field202.method3069() * 2 / 100;
            int var17 = var16 + Statics.field2017.method3069() * 2 / 100;
            int var18 = var17 + Statics.field2977.method3069() * 2 / 100;
            int var19 = var18 + Statics.field2001.method3069() * 2 / 100;
            int var20 = var19 + Statics.field621.method3069() * 2 / 100;
            int var21 = var20 + Statics.field2638.method3069() * 2 / 100;
            int var22 = var21 + Statics.field18.method3069() * 2 / 100;
            if (var22 == 100) {
                class32.field714 = class157.field2322;
                class32.field712 = 30;
                field307 = 45;
            } else {
                if (var22 != 0) {
                    class32.field714 = class157.field2508 + var22 + "%";
                }
                class32.field712 = 30;
            }
        } else if (field307 == 45) {
            boolean var23 = !field466;
            Statics.field1194 = 22050;
            Statics.field1173 = var23;
            Statics.field576 = 2;
            class184 var24 = new class184();
            var24.method3304(9, 128);
            Statics.field578 = class57.method2589(Statics.field606, Statics.field147, 0, 22050);
            Statics.field578.method1146(var24);
            class168 var25 = Statics.field18;
            class168 var26 = Statics.field2638;
            class168 var27 = Statics.field580;
            Statics.field2947 = var25;
            Statics.field2941 = var26;
            Statics.field2940 = var27;
            Statics.field2943 = var24;
            Statics.field2693 = class57.method2589(Statics.field606, Statics.field147, 1, 2048);
            Statics.field562 = new class56();
            Statics.field2693.method1146(Statics.field562);
            Statics.field963 = new class75(22050, Statics.field1194);
            class32.field714 = class157.field2323;
            class32.field712 = 35;
            field307 = 50;
        } else if (field307 == 50) {
            int var28 = 0;
            if (Statics.field2295 == null) {
                class168 var29 = Statics.field2723;
                class168 var30 = Statics.field621;
                int var31 = var29.method3021("p11_full");
                int var32 = var29.method3002(var31, "");
                class224 var33;
                if (class77.method1440(var29, var31, var32)) {
                    byte[] var34 = var30.method2986(var31, var32);
                    class224 var35;
                    if (var34 == null) {
                        var35 = null;
                    } else {
                        class224 var36 = new class224(var34, Statics.field1377, Statics.field3134, Statics.field3148, Statics.field1379, Statics.field2303, Statics.field1381);
                        class77.method3086();
                        var35 = var36;
                    }
                    var33 = var35;
                } else {
                    var33 = null;
                }
                Statics.field2295 = var33;
            } else {
                var28++;
            }
            if (Statics.field782 == null) {
                class168 var38 = Statics.field2723;
                class168 var39 = Statics.field621;
                int var40 = var38.method3021("p12_full");
                int var41 = var38.method3002(var40, "");
                class224 var42;
                if (class77.method1440(var38, var40, var41)) {
                    byte[] var43 = var39.method2986(var40, var41);
                    class224 var44;
                    if (var43 == null) {
                        var44 = null;
                    } else {
                        class224 var45 = new class224(var43, Statics.field1377, Statics.field3134, Statics.field3148, Statics.field1379, Statics.field2303, Statics.field1381);
                        class77.method3086();
                        var44 = var45;
                    }
                    var42 = var44;
                } else {
                    var42 = null;
                }
                Statics.field782 = var42;
            } else {
                var28++;
            }
            if (Statics.field333 == null) {
                class168 var47 = Statics.field2723;
                class168 var48 = Statics.field621;
                int var49 = var47.method3021("b12_full");
                int var50 = var47.method3002(var49, "");
                class224 var51;
                if (class77.method1440(var47, var49, var50)) {
                    byte[] var52 = var48.method2986(var49, var50);
                    class224 var53;
                    if (var52 == null) {
                        var53 = null;
                    } else {
                        class224 var54 = new class224(var52, Statics.field1377, Statics.field3134, Statics.field3148, Statics.field1379, Statics.field2303, Statics.field1381);
                        class77.method3086();
                        var53 = var54;
                    }
                    var51 = var53;
                } else {
                    var51 = null;
                }
                Statics.field333 = var51;
            } else {
                var28++;
            }
            if (var28 < 3) {
                class32.field714 = class157.field2389 + var28 * 100 / 3 + "%";
                class32.field712 = 40;
            } else {
                Statics.field1161 = new class160(true);
                class32.field714 = class157.field2325;
                class32.field712 = 40;
                field307 = 60;
            }
        } else if (field307 == 60) {
            class168 var56 = Statics.field2017;
            class168 var57 = Statics.field2723;
            int var58 = 0;
            if (var56.method3046("title.jpg", "")) {
                var58++;
            }
            if (var57.method3046("logo", "")) {
                var58++;
            }
            if (var57.method3046("logo_deadman_mode", "")) {
                var58++;
            }
            if (var57.method3046("titlebox", "")) {
                var58++;
            }
            if (var57.method3046("titlebutton", "")) {
                var58++;
            }
            if (var57.method3046("runes", "")) {
                var58++;
            }
            if (var57.method3046("title_mute", "")) {
                var58++;
            }
            if (var57.method3005("options_radio_buttons,0")) {
                var58++;
            }
            if (var57.method3005("options_radio_buttons,2")) {
                var58++;
            }
            var57.method3046("sl_back", "");
            var57.method3046("sl_flags", "");
            var57.method3046("sl_arrows", "");
            var57.method3046("sl_stars", "");
            var57.method3046("sl_button", "");
            int var61 = class32.method164();
            if (var58 < var61) {
                class32.field714 = class157.field2326 + var58 * 100 / var61 + "%";
                class32.field712 = 50;
            } else {
                class32.field714 = class157.field2327;
                class32.field712 = 50;
                method162(5);
                field307 = 70;
            }
        } else if (field307 == 70) {
            if (Statics.field2900.method2990()) {
                class168 var62 = Statics.field2900;
                Statics.field1048 = var62;
                class168 var63 = Statics.field2900;
                Statics.field3149 = var63;
                class45.method615(Statics.field2900, Statics.field206);
                class41.method759(Statics.field2900, Statics.field206, field466);
                class168 var64 = Statics.field2900;
                class168 var65 = Statics.field206;
                Statics.field896 = var64;
                Statics.field895 = var65;
                class168 var66 = Statics.field2900;
                class168 var67 = Statics.field206;
                boolean var68 = field536;
                class224 var69 = Statics.field2295;
                Statics.field1102 = var66;
                Statics.field1099 = var67;
                Statics.field1104 = var68;
                Statics.field2697 = Statics.field1102.method2996(10);
                Statics.field1144 = var69;
                class168 var70 = Statics.field2900;
                class168 var71 = Statics.field387;
                class168 var72 = Statics.field78;
                Statics.field978 = var70;
                Statics.field975 = var71;
                Statics.field979 = var72;
                class168 var73 = Statics.field2900;
                class168 var74 = Statics.field206;
                Statics.field1005 = var73;
                Statics.field999 = var74;
                class168 var75 = Statics.field2900;
                Statics.field1054 = var75;
                class53.method599(Statics.field2900);
                class173.method2890(Statics.field2002, Statics.field206, Statics.field2723, Statics.field621);
                class51.method126(Statics.field2900);
                class49.method116(Statics.field2900);
                Statics.method2619(Statics.field2900);
                class50.method679(Statics.field2900);
                Statics.field60 = new class20();
                class32.field714 = class157.field2543;
                class32.field712 = 60;
                field307 = 80;
            } else {
                class32.field714 = class157.field2328 + Statics.field2900.method3075() + "%";
                class32.field712 = 60;
            }
        } else if (field307 == 80) {
            int var76 = 0;
            if (Statics.field813 == null) {
                class168 var77 = Statics.field2723;
                int var78 = var77.method3021("compass");
                int var79 = var77.method3002(var78, "");
                class79 var80 = class77.method872(var77, var78, var79);
                Statics.field813 = var80;
            } else {
                var76++;
            }
            if (Statics.field161 == null) {
                class168 var81 = Statics.field2723;
                int var82 = var81.method3021("mapedge");
                int var83 = var81.method3002(var82, "");
                class79 var84 = class77.method872(var81, var82, var83);
                Statics.field161 = var84;
            } else {
                var76++;
            }
            if (Statics.field1035 == null) {
                Statics.field1035 = class77.method3119(Statics.field2723, "mapscene", "");
            } else {
                var76++;
            }
            if (Statics.field2013 == null) {
                Statics.field2013 = class77.method106(Statics.field2723, "mapfunction", "");
            } else {
                var76++;
            }
            if (Statics.field164 == null) {
                Statics.field164 = class77.method106(Statics.field2723, "hitmarks", "");
            } else {
                var76++;
            }
            if (Statics.field1023 == null) {
                Statics.field1023 = class77.method106(Statics.field2723, "headicons_pk", "");
            } else {
                var76++;
            }
            if (Statics.field123 == null) {
                Statics.field123 = class77.method106(Statics.field2723, "headicons_prayer", "");
            } else {
                var76++;
            }
            if (Statics.field159 == null) {
                Statics.field159 = class77.method106(Statics.field2723, "headicons_hint", "");
            } else {
                var76++;
            }
            if (Statics.field361 == null) {
                Statics.field361 = class77.method106(Statics.field2723, "mapmarker", "");
            } else {
                var76++;
            }
            if (Statics.field2194 == null) {
                Statics.field2194 = class77.method106(Statics.field2723, "cross", "");
            } else {
                var76++;
            }
            if (Statics.field3158 == null) {
                Statics.field3158 = class77.method106(Statics.field2723, "mapdots", "");
            } else {
                var76++;
            }
            if (Statics.field1959 == null) {
                Statics.field1959 = class77.method3119(Statics.field2723, "scrollbar", "");
            } else {
                var76++;
            }
            if (Statics.field2077 == null) {
                Statics.field2077 = class77.method3119(Statics.field2723, "mod_icons", "");
            } else {
                var76++;
            }
            if (var76 < 13) {
                class32.field714 = class157.field2335 + var76 * 100 / 13 + "%";
                class32.field712 = 70;
            } else {
                Statics.field3179 = Statics.field2077;
                Statics.field161.method1545();
                int var85 = (int) (Math.random() * 21.0D) - 10;
                int var86 = (int) (Math.random() * 21.0D) - 10;
                int var87 = (int) (Math.random() * 21.0D) - 10;
                int var88 = (int) (Math.random() * 41.0D) - 20;
                for (int var89 = 0; var89 < Statics.field2013.length; var89++) {
                    Statics.field2013[var89].method1544(var85 + var88, var86 + var88, var87 + var88);
                }
                Statics.field1035[0].method1694(var85 + var88, var86 + var88, var87 + var88);
                class32.field714 = class157.field2331;
                class32.field712 = 70;
                field307 = 90;
            }
        } else if (field307 == 90) {
            if (Statics.field202.method2990()) {
                class95 var90 = new class95(Statics.field202, Statics.field2723, 20, 0.8D, field466 ? 64 : 128);
                class91.method1906(var90);
                class91.method1897(0.8D);
                class32.field714 = class157.field2333;
                class32.field712 = 90;
                field307 = 110;
            } else {
                class32.field714 = class157.field2332 + Statics.field202.method3075() + "%";
                class32.field712 = 90;
            }
        } else if (field307 == 110) {
            Statics.field1998 = new class14();
            Statics.field606.method2675(Statics.field1998, 10);
            class32.field714 = class157.field2334;
            class32.field712 = 94;
            field307 = 120;
        } else if (field307 == 120) {
            if (Statics.field2017.method3046("huffman", "")) {
                class113 var91 = new class113(Statics.field2017.method3003("huffman", ""));
                Statics.field3169 = var91;
                class32.field714 = class157.field2534;
                class32.field712 = 96;
                field307 = 130;
            } else {
                class32.field714 = class157.field2457 + "%";
                class32.field712 = 96;
            }
        } else if (field307 == 130) {
            if (!Statics.field2002.method2990()) {
                class32.field714 = class157.field2337 + Statics.field2002.method3075() * 4 / 5 + "%";
                class32.field712 = 100;
            } else if (!Statics.field2001.method2990()) {
                class32.field714 = class157.field2337 + (80 + Statics.field2001.method3075() / 6) + "%";
                class32.field712 = 100;
            } else if (Statics.field621.method2990()) {
                class32.field714 = class157.field2338;
                class32.field712 = 100;
                field307 = 140;
            } else {
                class32.field714 = class157.field2337 + (96 + Statics.field621.method3075() / 20) + "%";
                class32.field712 = 100;
            }
        } else if (field307 == 140) {
            method162(10);
        }
    }

    @ObfuscatedName("fy.c(IZZZI)Lfz;")
    public static class168 method2962(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class134 var4 = null;
        if (class149.field2236 != null) {
            var4 = new class134(arg0, class149.field2236, Statics.field1525[arg0], 1000000);
        }
        return new class168(var4, Statics.field2033, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ee.v(I)V")
    public static final void method2888() {
        try {
            if (field312 == 0) {
                if (Statics.field134 != null) {
                    Statics.field134.method2765();
                    Statics.field134 = null;
                }
                Statics.field1893 = null;
                field332 = false;
                field313 = 0;
                field312 = 1;
            }
            if (field312 == 1) {
                if (Statics.field1893 == null) {
                    Statics.field1893 = Statics.field606.method2674(Statics.field1552, Statics.field262);
                }
                if (Statics.field1893.field2224 == 2) {
                    throw new IOException();
                }
                if (Statics.field1893.field2224 == 1) {
                    Statics.field134 = new class143((Socket) Statics.field1893.field2222, Statics.field606);
                    Statics.field1893 = null;
                    field312 = 2;
                }
            }
            if (field312 == 2) {
                field321.field1986 = 0;
                field321.method2285(14);
                Statics.field134.method2769(field321.field1987, 0, 1);
                field448.field1986 = 0;
                field312 = 3;
            }
            if (field312 == 3) {
                if (Statics.field578 != null) {
                    Statics.field578.method1132();
                }
                if (Statics.field2693 != null) {
                    Statics.field2693.method1132();
                }
                int var0 = Statics.field134.method2781();
                if (Statics.field578 != null) {
                    Statics.field578.method1132();
                }
                if (Statics.field2693 != null) {
                    Statics.field2693.method1132();
                }
                if (var0 != 0) {
                    method2226(var0);
                    return;
                }
                field448.field1986 = 0;
                field312 = 5;
            }
            if (field312 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field321.field1986 = 0;
                field321.method2285(1);
                field321.method2285(class32.field721.method544());
                field321.method2289(var1[0]);
                field321.method2289(var1[1]);
                field321.method2289(var1[2]);
                field321.method2289(var1[3]);
                switch(class32.field721.field2589) {
                    case 0:
                        field321.method2289((Integer) Statics.field2026.field145.get(class163.method1890(class32.field719)));
                        field321.field1986 += 4;
                        break;
                    case 1:
                        field321.field1986 += 8;
                        break;
                    case 2:
                    case 3:
                        field321.method2288(Statics.field158);
                        field321.field1986 += 5;
                }
                field321.method2393(class32.field720);
                field321.method2321(class5.field68, class5.field69);
                field281.field1986 = 0;
                if (field288 == 40) {
                    field281.method2285(18);
                } else {
                    field281.method2285(16);
                }
                field281.method2287(0);
                int var2 = field281.field1986;
                field281.method2289(98);
                field281.method2295(field321.field1987, 0, field321.field1986);
                int var3 = field281.field1986;
                field281.method2393(class32.field719);
                field281.method2285((field557 ? 1 : 0) << 1 | (field466 ? 1 : 0));
                field281.method2287(Statics.field2056);
                field281.method2287(Statics.field2096);
                class149.method2588(field281);
                field281.method2393(Statics.field1053);
                field281.method2289(Statics.field2896);
                class119 var4 = new class119(Statics.field1161.method2909());
                Statics.field1161.method2904(var4);
                field281.method2295(var4.field1987, 0, var4.field1987.length);
                field281.method2285(Statics.field1679);
                field281.method2289(Statics.field387.field2666);
                field281.method2289(Statics.field78.field2666);
                field281.method2289(Statics.field2900.field2666);
                field281.method2289(Statics.field2002.field2666);
                field281.method2289(Statics.field580.field2666);
                field281.method2289(Statics.field993.field2666);
                field281.method2289(Statics.field1608.field2666);
                field281.method2289(Statics.field206.field2666);
                field281.method2289(Statics.field2723.field2666);
                field281.method2289(Statics.field202.field2666);
                field281.method2289(Statics.field2017.field2666);
                field281.method2289(Statics.field2977.field2666);
                field281.method2289(Statics.field2001.field2666);
                field281.method2289(Statics.field621.field2666);
                field281.method2289(Statics.field2638.field2666);
                field281.method2289(Statics.field18.field2666);
                field281.method2421(var1, var3, field281.field1986);
                field281.method2453(field281.field1986 - var2);
                Statics.field134.method2769(field281.field1987, 0, field281.field1986);
                field321.method2549(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field448.method2549(var1);
                field312 = 6;
            }
            if (field312 == 6 && Statics.field134.method2767() > 0) {
                int var6 = Statics.field134.method2781();
                if (var6 == 21 && field288 == 20) {
                    field312 = 7;
                } else if (var6 == 2) {
                    field312 = 9;
                } else if (var6 == 15 && field288 == 40) {
                    field324 = -1;
                    field312 = 13;
                } else if (var6 == 23 && field314 < 1) {
                    field314++;
                    field312 = 0;
                } else if (var6 == 29) {
                    field312 = 11;
                } else {
                    method2226(var6);
                    return;
                }
            }
            if (field312 == 7 && Statics.field134.method2767() > 0) {
                field315 = (Statics.field134.method2781() + 3) * 60;
                field312 = 8;
            }
            if (field312 == 8) {
                field313 = 0;
                class32.method163(class157.field2448, class157.field2426, field315 / 60 + class157.field2344);
                if (--field315 <= 0) {
                    field312 = 0;
                }
            } else {
                if (field312 == 9 && Statics.field134.method2767() >= 13) {
                    boolean var7 = Statics.field134.method2781() == 1;
                    Statics.field134.method2777(field448.field1987, 0, 4);
                    field448.field1986 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field448.method2546() << 24;
                        int var10 = var9 | field448.method2546() << 16;
                        int var11 = var10 | field448.method2546() << 8;
                        int var12 = var11 | field448.method2546();
                        int var13 = class163.method1890(class32.field719);
                        if (Statics.field2026.field145.size() >= 10 && !Statics.field2026.field145.containsKey(var13)) {
                            Iterator var14 = Statics.field2026.field145.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field2026.field145.put(var13, var12);
                        class9.method3591();
                    }
                    field446 = Statics.field134.method2781();
                    field513 = Statics.field134.method2781() == 1;
                    field278 = Statics.field134.method2781();
                    field278 <<= 0x8;
                    field278 += Statics.field134.method2781();
                    field404 = Statics.field134.method2781();
                    Statics.field134.method2777(field448.field1987, 0, 1);
                    field448.field1986 = 0;
                    field325 = field448.method2546();
                    Statics.field134.method2777(field448.field1987, 0, 2);
                    field448.field1986 = 0;
                    field324 = field448.method2415();
                    if (field404 == 1) {
                        try {
                            class132.method2642(Statics.field287, "zap");
                        } catch (Throwable var38) {
                        }
                    } else {
                        try {
                            class132.method2642(Statics.field287, "unzap");
                        } catch (Throwable var37) {
                        }
                    }
                    field312 = 10;
                }
                if (field312 != 10) {
                    if (field312 == 11 && Statics.field134.method2767() >= 2) {
                        field448.field1986 = 0;
                        Statics.field134.method2777(field448.field1987, 0, 2);
                        field448.field1986 = 0;
                        Statics.field779 = field448.method2415();
                        field312 = 12;
                    }
                    if (field312 == 12 && Statics.field134.method2767() >= Statics.field779) {
                        field448.field1986 = 0;
                        Statics.field134.method2777(field448.field1987, 0, Statics.field779);
                        field448.field1986 = 0;
                        String var32 = field448.method2309();
                        String var33 = field448.method2309();
                        String var34 = field448.method2309();
                        class32.method163(var32, var33, var34);
                        method162(10);
                    }
                    if (field312 == 13) {
                        if (field324 == -1) {
                            if (Statics.field134.method2767() < 2) {
                                return;
                            }
                            Statics.field134.method2777(field448.field1987, 0, 2);
                            field448.field1986 = 0;
                            field324 = field448.method2415();
                        }
                        if (Statics.field134.method2767() >= field324) {
                            Statics.field134.method2777(field448.field1987, 0, field324);
                            field448.field1986 = 0;
                            int var35 = field324;
                            method2080();
                            class33.method132(field448);
                            if (field448.field1986 != var35) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field313++;
                        if (field313 > 2000) {
                            if (field314 < 1) {
                                if (Statics.field262 == Statics.field2157) {
                                    Statics.field262 = Statics.field2043;
                                } else {
                                    Statics.field262 = Statics.field2157;
                                }
                                field314++;
                                field312 = 0;
                            } else {
                                method2226(-3);
                            }
                        }
                    }
                } else if (Statics.field134.method2767() >= field324) {
                    field448.field1986 = 0;
                    Statics.field134.method2777(field448.field1987, 0, field324);
                    field343 = -1L;
                    field294 = -1;
                    Statics.field1998.field194 = 0;
                    Statics.field146 = true;
                    field295 = true;
                    field505 = -1L;
                    class211.method128();
                    field321.field1986 = 0;
                    field448.field1986 = 0;
                    field325 = -1;
                    field328 = -1;
                    field329 = -1;
                    field330 = -1;
                    field326 = 0;
                    field297 = 0;
                    field391 = 0;
                    field298 = 0;
                    field421 = 0;
                    field552 = false;
                    class140.method622(0);
                    class12.method5();
                    field432 = 0;
                    field434 = false;
                    field285 = 0;
                    field345 = (int) (Math.random() * 100.0D) - 50;
                    field347 = (int) (Math.random() * 110.0D) - 55;
                    field430 = (int) (Math.random() * 80.0D) - 40;
                    field352 = (int) (Math.random() * 120.0D) - 60;
                    field354 = (int) (Math.random() * 30.0D) - 20;
                    field366 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field530 = 0;
                    field508 = -1;
                    field483 = 0;
                    field514 = 0;
                    field306 = class21.field573;
                    field317 = 0;
                    class33.field739 = 0;
                    for (int var17 = 0; var17 < 2048; var17++) {
                        class33.field735[var17] = null;
                        class33.field737[var17] = 1;
                    }
                    for (int var18 = 0; var18 < 2048; var18++) {
                        field402[var18] = null;
                    }
                    for (int var19 = 0; var19 < 32768; var19++) {
                        field316[var19] = null;
                    }
                    field411 = -1;
                    field414.method3490();
                    field537.method3490();
                    for (int var20 = 0; var20 < 4; var20++) {
                        for (int var21 = 0; var21 < 104; var21++) {
                            for (int var22 = 0; var22 < 104; var22++) {
                                field412[var20][var21][var22] = null;
                            }
                        }
                    }
                    field522 = new class199();
                    field548 = 0;
                    field547 = 0;
                    field322 = 0;
                    for (int var23 = 0; var23 < Statics.field1156; var23++) {
                        class53 var24 = Statics.method2235(var23);
                        if (var24 != null) {
                            class176.field2890[var23] = 0;
                            class176.field2892[var23] = 0;
                        }
                    }
                    Statics.field60.method192();
                    field485 = -1;
                    if (field439 != -1) {
                        int var25 = field439;
                        if (var25 != -1 && Statics.field2749[var25]) {
                            Statics.field2739.method3014(var25);
                            if (Statics.field2802[var25] != null) {
                                boolean var26 = true;
                                for (int var27 = 0; var27 < Statics.field2802[var25].length; var27++) {
                                    if (Statics.field2802[var25][var27] != null) {
                                        if (Statics.field2802[var25][var27].field2746 == 2) {
                                            var26 = false;
                                        } else {
                                            Statics.field2802[var25][var27] = null;
                                        }
                                    }
                                }
                                if (var26) {
                                    Statics.field2802[var25] = null;
                                }
                                Statics.field2749[var25] = false;
                            }
                        }
                    }
                    for (class4 var28 = (class4) field519.method3464(); var28 != null; var28 = (class4) field519.method3465()) {
                        method683(var28, true);
                    }
                    field439 = -1;
                    field519 = new class196(8);
                    field443 = null;
                    field552 = false;
                    field421 = 0;
                    field553.method3185((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var29 = 0; var29 < 8; var29++) {
                        field408[var29] = null;
                        field409[var29] = false;
                    }
                    class16.method1969();
                    field383 = true;
                    for (int var30 = 0; var30 < 100; var30++) {
                        field428[var30] = true;
                    }
                    method127();
                    field506 = null;
                    Statics.field2250 = 0;
                    Statics.field76 = null;
                    for (int var31 = 0; var31 < 8; var31++) {
                        field396[var31] = new class220();
                    }
                    Statics.field233 = null;
                    class33.method132(field448);
                    Statics.field1451 = -1;
                    method135(false);
                    field325 = -1;
                }
            }
        } catch (IOException var39) {
            if (field314 < 1) {
                if (Statics.field262 == Statics.field2157) {
                    Statics.field262 = Statics.field2043;
                } else {
                    Statics.field262 = Statics.field2157;
                }
                field314++;
                field312 = 0;
            } else {
                method2226(-2);
            }
        }
    }

    @ObfuscatedName("cj.p(I)V")
    public static void method2080() {
        field321.field1986 = 0;
        field448.field1986 = 0;
        field325 = -1;
        field328 = -1;
        field329 = -1;
        field330 = -1;
        field324 = 0;
        field326 = 0;
        field297 = 0;
        field421 = 0;
        field552 = false;
        field530 = 0;
        field483 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field402[var0] = null;
        }
        Statics.field859 = null;
        for (int var1 = 0; var1 < field316.length; var1++) {
            class35 var2 = field316[var1];
            if (var2 != null) {
                var2.field832 = -1;
                var2.field857 = false;
            }
        }
        class16.method1969();
        method162(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field428[var3] = true;
        }
        method127();
    }

    @ObfuscatedName("di.i(IB)V")
    public static void method2226(int arg0) {
        if (arg0 == -3) {
            class32.method163(class157.field2371, class157.field2346, class157.field2347);
        } else if (arg0 == -2) {
            class32.method163(class157.field2375, class157.field2349, class157.field2372);
        } else if (arg0 == -1) {
            class32.method163(class157.field2395, class157.field2397, class157.field2569);
        } else if (arg0 == 3) {
            class32.method163(class157.field2487, class157.field2355, class157.field2356);
        } else if (arg0 == 4) {
            class32.method163(class157.field2357, class157.field2353, class157.field2343);
        } else if (arg0 == 5) {
            class32.method163(class157.field2374, class157.field2532, class157.field2362);
        } else if (arg0 == 6) {
            class32.method163(class157.field2315, class157.field2324, class157.field2365);
        } else if (arg0 == 7) {
            class32.method163(class157.field2488, class157.field2311, class157.field2559);
        } else if (arg0 == 8) {
            class32.method163(class157.field2369, class157.field2370, class157.field2404);
        } else if (arg0 == 9) {
            class32.method163(class157.field2495, class157.field2373, class157.field2485);
        } else if (arg0 == 10) {
            class32.method163(class157.field2545, class157.field2376, class157.field2377);
        } else if (arg0 == 11) {
            class32.method163(class157.field2378, class157.field2366, class157.field2484);
        } else if (arg0 == 12) {
            class32.method163(class157.field2381, class157.field2382, class157.field2364);
        } else if (arg0 == 13) {
            class32.method163(class157.field2384, class157.field2385, class157.field2386);
        } else if (arg0 == 14) {
            class32.method163(class157.field2549, class157.field2425, class157.field2458);
        } else if (arg0 == 16) {
            class32.method163(class157.field2390, class157.field2391, class157.field2392);
        } else if (arg0 == 17) {
            class32.method163(class157.field2393, class157.field2394, class157.field2383);
        } else if (arg0 == 18) {
            class32.method163(class157.field2477, class157.field2403, class157.field2398);
        } else if (arg0 == 19) {
            class32.method163(class157.field2399, class157.field2387, class157.field2401);
        } else if (arg0 == 20) {
            class32.method163(class157.field2402, class157.field2436, class157.field2540);
        } else if (arg0 == 22) {
            class32.method163(class157.field2405, class157.field2406, class157.field2407);
        } else if (arg0 == 23) {
            class32.method163(class157.field2408, class157.field2409, class157.field2410);
        } else if (arg0 == 24) {
            class32.method163(class157.field2557, class157.field2412, class157.field2522);
        } else if (arg0 == 25) {
            class32.method163(class157.field2414, class157.field2551, class157.field2519);
        } else if (arg0 == 26) {
            class32.method163(class157.field2368, class157.field2418, class157.field2419);
        } else if (arg0 == 27) {
            class32.method163(class157.field2358, class157.field2421, class157.field2422);
        } else if (arg0 == 31) {
            class32.method163(class157.field2429, class157.field2430, class157.field2431);
        } else if (arg0 == 32) {
            class32.method163(class157.field2432, class157.field2433, class157.field2434);
        } else if (arg0 == 37) {
            class32.method163(class157.field2413, class157.field2336, class157.field2361);
        } else if (arg0 == 38) {
            class32.method163(class157.field2435, class157.field2439, class157.field2440);
        } else if (arg0 == 55) {
            class32.method163(class157.field2348, class157.field2486, class157.field2411);
        } else if (arg0 == 56) {
            class32.method163(class157.field2388, class157.field2445, class157.field2446);
            method162(11);
            return;
        } else if (arg0 == 57) {
            class32.method163(class157.field2556, class157.field2305, class157.field2449);
            method162(11);
            return;
        } else {
            class32.method163(class157.field2450, class157.field2451, class157.field2452);
        }
        method162(10);
    }

    @ObfuscatedName("dg.t(B)V")
    public static final void method2544() {
        if (Statics.field134 != null) {
            Statics.field134.method2765();
            Statics.field134 = null;
        }
        method3414();
        Statics.field2175.method1854();
        for (int var0 = 0; var0 < 4; var0++) {
            field341[var0].method2206();
        }
        System.gc();
        class183.method2916(2);
        field518 = -1;
        field489 = false;
        for (class24 var1 = (class24) class24.field602.method3502(); var1 != null; var1 = (class24) class24.field602.method3489()) {
            if (var1.field600 != null) {
                Statics.field562.method1119(var1.field600);
                var1.field600 = null;
            }
            if (var1.field605 != null) {
                Statics.field562.method1119(var1.field605);
                var1.field605 = null;
            }
        }
        class24.field602.method3490();
        method162(10);
    }

    @ObfuscatedName("gz.u(B)V")
    public static final void method3414() {
        class47.field1038.method3430();
        class42.method9();
        class45.field1018.method3430();
        class41.field915.method3430();
        class41.field916.method3430();
        class41.field917.method3430();
        class41.field918.method3430();
        class40.method563();
        class52.field1134.method3430();
        class52.field1129.method3430();
        class52.field1107.method3430();
        class43.method2091();
        class44.method682();
        class48.method1994();
        class53.field1155.method3430();
        class179.field2910.method3430();
        Statics.method598();
        ((class95) Statics.field1572).method1974();
        class23.field584.method3430();
        Statics.field387.method2999();
        Statics.field78.method2999();
        Statics.field2002.method2999();
        Statics.field580.method2999();
        Statics.field993.method2999();
        Statics.field1608.method2999();
        Statics.field206.method2999();
        Statics.field2723.method2999();
        Statics.field202.method2999();
        Statics.field2017.method2999();
        Statics.field2977.method2999();
        Statics.field2001.method2999();
    }

    @ObfuscatedName("fh.e(I)V")
    public static final void method2897() {
        if (field391 > 0) {
            method2544();
        } else {
            method162(40);
            Statics.field751 = Statics.field134;
            Statics.field134 = null;
        }
    }

    @ObfuscatedName("cz.m(I)V")
    public static final void method2079() {
        if (Statics.field2693 != null) {
            Statics.field2693.method1135();
        }
        if (Statics.field578 != null) {
            Statics.field578.method1135();
        }
    }

    @ObfuscatedName("ck.s(I)V")
    public static final void method1986() {
        for (int var0 = 0; var0 < field285; var0++) {
            int var10002 = field525[var0]--;
            if (field525[var0] >= -10) {
                class59 var2 = field527[var0];
                if (var2 == null) {
                    class59 var10000 = (class59) null;
                    var2 = class59.method1181(Statics.field580, field523[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field525[var0] += var2.method1173();
                    field527[var0] = var2;
                }
                if (field525[var0] < 0) {
                    int var9;
                    if (field526[var0] == 0) {
                        var9 = field319;
                    } else {
                        int var3 = (field526[var0] & 0xFF) * 128;
                        int var4 = field526[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field859.field826;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field526[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field859.field801;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field525[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field342 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1182().method1208(Statics.field963);
                        class65 var11 = class65.method1233(var10, 100, var9);
                        var11.method1236(field534[var0] - 1);
                        Statics.field562.method1093(var11);
                    }
                    field525[var0] = -100;
                }
            } else {
                field285--;
                for (int var1 = var0; var1 < field285; var1++) {
                    field523[var1] = field523[var1 + 1];
                    field527[var1] = field527[var1 + 1];
                    field534[var1] = field534[var1 + 1];
                    field525[var1] = field525[var1 + 1];
                    field526[var1] = field526[var1 + 1];
                }
                var0--;
            }
        }
        if (field489 && !class183.method555()) {
            if (field517 != 0 && field518 != -1) {
                class183.method96(Statics.field1608, field518, 0, field517, false);
            }
            field489 = false;
        }
    }

    @ObfuscatedName("cc.x(Lah;IIII)V")
    public static void method1720(class43 arg0, int arg1, int arg2, int arg3) {
        if (field285 >= 50 || field342 == 0 || arg0.field982 == null || arg1 >= arg0.field982.length) {
            return;
        }
        int var4 = arg0.field982[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field523[field285] = var5;
        field534[field285] = var6;
        field525[field285] = 0;
        field527[field285] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field526[field285] = (var8 << 16) + (var9 << 8) + var7;
        field285++;
    }

    @ObfuscatedName("bv.y(IIII)V")
    public static void method1503(int arg0, int arg1, int arg2) {
        if (field319 == 0 || arg1 == 0 || field285 >= 50) {
            return;
        }
        field523[field285] = arg0;
        field534[field285] = arg1;
        field525[field285] = arg2;
        field527[field285] = null;
        field526[field285] = 0;
        field285++;
    }

    @ObfuscatedName("dl.w(B)V")
    public static final void method2613() {
        int[] var0 = class33.field734;
        for (int var1 = 0; var1 < class33.field739; var1++) {
            class3 var2 = field402[var0[var1]];
            if (var2 != null && var2.field834 > 0) {
                var2.field834--;
                if (var2.field834 == 0) {
                    var2.field837 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field317; var3++) {
            int var4 = field302[var3];
            class35 var5 = field316[var4];
            if (var5 != null && var5.field834 > 0) {
                var5.field834--;
                if (var5.field834 == 0) {
                    var5.field837 = null;
                }
            }
        }
    }

    @ObfuscatedName("eq.o(B)V")
    public static final void method2768() {
        int var0 = class33.field739;
        int[] var1 = class33.field734;
        for (int var2 = 0; var2 < var0; var2++) {
            class3 var3 = field402[var1[var2]];
            if (var3 != null) {
                method14(var3, 1);
            }
        }
    }

    @ObfuscatedName("aw.aw(I)V")
    public static final void method602() {
        for (int var0 = 0; var0 < field317; var0++) {
            int var1 = field302[var0];
            class35 var2 = field316[var1];
            if (var2 != null) {
                method14(var2, var2.field765.field878);
            }
        }
    }

    @ObfuscatedName("q.an(Lav;II)V")
    public static final void method14(class38 arg0, int arg1) {
        if (arg0.field825 > field290) {
            method702(arg0);
        } else if (arg0.field816 >= field290) {
            method51(arg0);
        } else {
            method2898(arg0);
        }
        if (arg0.field826 < 128 || arg0.field801 < 128 || arg0.field826 >= 13184 || arg0.field801 >= 13184) {
            arg0.field831 = -1;
            arg0.field829 = -1;
            arg0.field825 = 0;
            arg0.field816 = 0;
            arg0.field826 = arg0.field854[0] * 128 + arg0.field804 * 64;
            arg0.field801 = arg0.field855[0] * 128 + arg0.field804 * 64;
            arg0.method717();
        }
        if (Statics.field859 == arg0 && (arg0.field826 < 1536 || arg0.field801 < 1536 || arg0.field826 >= 11776 || arg0.field801 >= 11776)) {
            arg0.field831 = -1;
            arg0.field829 = -1;
            arg0.field825 = 0;
            arg0.field816 = 0;
            arg0.field826 = arg0.field854[0] * 128 + arg0.field804 * 64;
            arg0.field801 = arg0.field855[0] * 128 + arg0.field804 * 64;
            arg0.method717();
        }
        if (arg0.field812 != 0) {
            if (arg0.field832 != -1) {
                class38 var2 = null;
                if (arg0.field832 < 32768) {
                    var2 = field316[arg0.field832];
                } else if (arg0.field832 >= 32768) {
                    var2 = field402[arg0.field832 - 32768];
                }
                if (var2 != null) {
                    int var3 = arg0.field826 - var2.field826;
                    int var4 = arg0.field801 - var2.field801;
                    if (var3 != 0 || var4 != 0) {
                        arg0.field850 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field857) {
                    arg0.field832 = -1;
                    arg0.field857 = false;
                }
            }
            if (arg0.field838 != -1 && (arg0.field853 == 0 || arg0.field810 > 0)) {
                arg0.field850 = arg0.field838;
                arg0.field838 = -1;
            }
            int var5 = arg0.field850 - arg0.field800 & 0x7FF;
            if (var5 == 0 && arg0.field857) {
                arg0.field832 = -1;
                arg0.field857 = false;
            }
            if (var5 == 0) {
                arg0.field851 = 0;
            } else {
                arg0.field851++;
                if (var5 > 1024) {
                    arg0.field800 -= arg0.field812;
                    boolean var6 = true;
                    if (var5 < arg0.field812 || var5 > 2048 - arg0.field812) {
                        arg0.field800 = arg0.field850;
                        var6 = false;
                    }
                    if (arg0.field828 == arg0.field805 && (arg0.field851 > 25 || var6)) {
                        if (arg0.field806 == -1) {
                            arg0.field828 = arg0.field808;
                        } else {
                            arg0.field828 = arg0.field806;
                        }
                    }
                } else {
                    arg0.field800 += arg0.field812;
                    boolean var7 = true;
                    if (var5 < arg0.field812 || var5 > 2048 - arg0.field812) {
                        arg0.field800 = arg0.field850;
                        var7 = false;
                    }
                    if (arg0.field828 == arg0.field805 && (arg0.field851 > 25 || var7)) {
                        if (arg0.field807 == -1) {
                            arg0.field828 = arg0.field808;
                        } else {
                            arg0.field828 = arg0.field807;
                        }
                    }
                }
                arg0.field800 &= 0x7FF;
            }
        }
        method2097(arg0);
    }

    @ObfuscatedName("au.ab(Lav;B)V")
    public static final void method702(class38 arg0) {
        int var1 = arg0.field825 - field290;
        int var2 = arg0.field841 * 128 + arg0.field804 * 64;
        int var3 = arg0.field843 * 128 + arg0.field804 * 64;
        arg0.field826 += (var2 - arg0.field826) / var1;
        arg0.field801 += (var3 - arg0.field801) / var1;
        arg0.field810 = 0;
        arg0.field850 = arg0.field847;
    }

    @ObfuscatedName("d.al(Lav;I)V")
    public static final void method51(class38 arg0) {
        if (field290 == arg0.field816 || arg0.field831 == -1 || arg0.field833 != 0 || arg0.field845 + 1 > class43.method72(arg0.field831).field981[arg0.field852]) {
            int var1 = arg0.field816 - arg0.field825;
            int var2 = field290 - arg0.field825;
            int var3 = arg0.field841 * 128 + arg0.field804 * 64;
            int var4 = arg0.field843 * 128 + arg0.field804 * 64;
            int var5 = arg0.field844 * 128 + arg0.field804 * 64;
            int var6 = arg0.field827 * 128 + arg0.field804 * 64;
            arg0.field826 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field801 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field810 = 0;
        arg0.field850 = arg0.field847;
        arg0.field800 = arg0.field850;
    }

    @ObfuscatedName("fk.ay(Lav;I)V")
    public static final void method2898(class38 arg0) {
        arg0.field828 = arg0.field805;
        if (arg0.field853 == 0) {
            arg0.field810 = 0;
            return;
        }
        if (arg0.field831 != -1 && arg0.field833 == 0) {
            class43 var1 = class43.method72(arg0.field831);
            if (arg0.field858 > 0 && var1.field988 == 0) {
                arg0.field810++;
                return;
            }
            if (arg0.field858 <= 0 && var1.field991 == 0) {
                arg0.field810++;
                return;
            }
        }
        int var2 = arg0.field826;
        int var3 = arg0.field801;
        int var4 = arg0.field854[arg0.field853 - 1] * 128 + arg0.field804 * 64;
        int var5 = arg0.field855[arg0.field853 - 1] * 128 + arg0.field804 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field850 = 1280;
            } else if (var3 > var5) {
                arg0.field850 = 1792;
            } else {
                arg0.field850 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field850 = 768;
            } else if (var3 > var5) {
                arg0.field850 = 256;
            } else {
                arg0.field850 = 512;
            }
        } else if (var3 < var5) {
            arg0.field850 = 1024;
        } else if (var3 > var5) {
            arg0.field850 = 0;
        }
        byte var6 = arg0.field856[arg0.field853 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field826 = var4;
            arg0.field801 = var5;
            arg0.field853--;
            if (arg0.field858 > 0) {
                arg0.field858--;
            }
            return;
        }
        int var7 = arg0.field850 - arg0.field800 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field809;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field808;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field820;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field842;
        }
        if (var8 == -1) {
            var8 = arg0.field808;
        }
        arg0.field828 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class35) {
            var10 = ((class35) arg0).field765.field906;
        }
        if (var10) {
            if (arg0.field850 != arg0.field800 && arg0.field832 == -1 && arg0.field812 != 0) {
                var9 = 2;
            }
            if (arg0.field853 > 2) {
                var9 = 6;
            }
            if (arg0.field853 > 3) {
                var9 = 8;
            }
            if (arg0.field810 > 0 && arg0.field853 > 1) {
                var9 = 8;
                arg0.field810--;
            }
        } else {
            if (arg0.field853 > 1) {
                var9 = 6;
            }
            if (arg0.field853 > 2) {
                var9 = 8;
            }
            if (arg0.field810 > 0 && arg0.field853 > 1) {
                var9 = 8;
                arg0.field810--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field828 == arg0.field808 && arg0.field819 != -1) {
            arg0.field828 = arg0.field819;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field826 += var9;
                if (arg0.field826 > var4) {
                    arg0.field826 = var4;
                }
            } else if (var2 > var4) {
                arg0.field826 -= var9;
                if (arg0.field826 < var4) {
                    arg0.field826 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field801 += var9;
                if (arg0.field801 > var5) {
                    arg0.field801 = var5;
                }
            } else if (var3 > var5) {
                arg0.field801 -= var9;
                if (arg0.field801 < var5) {
                    arg0.field801 = var5;
                }
            }
        }
        if (arg0.field826 == var4 && arg0.field801 == var5) {
            arg0.field853--;
            if (arg0.field858 > 0) {
                arg0.field858--;
            }
        }
    }

    @ObfuscatedName("ch.aq(Lav;I)V")
    public static final void method2097(class38 arg0) {
        arg0.field803 = false;
        if (arg0.field828 != -1) {
            class43 var1 = class43.method72(arg0.field828);
            if (var1 == null || var1.field974 == null) {
                arg0.field828 = -1;
            } else {
                arg0.field830++;
                if (arg0.field846 < var1.field974.length && arg0.field830 > var1.field981[arg0.field846]) {
                    arg0.field830 = 1;
                    arg0.field846++;
                    method1720(var1, arg0.field846, arg0.field826, arg0.field801);
                }
                if (arg0.field846 >= var1.field974.length) {
                    arg0.field830 = 0;
                    arg0.field846 = 0;
                    method1720(var1, arg0.field846, arg0.field826, arg0.field801);
                }
            }
        }
        if (arg0.field829 != -1 && field290 >= arg0.field839) {
            if (arg0.field802 < 0) {
                arg0.field802 = 0;
            }
            int var2 = class44.method216(arg0.field829).field1004;
            if (var2 == -1) {
                arg0.field829 = -1;
            } else {
                class43 var3 = class43.method72(var2);
                if (var3 == null || var3.field974 == null) {
                    arg0.field829 = -1;
                } else {
                    arg0.field860++;
                    if (arg0.field802 < var3.field974.length && arg0.field860 > var3.field981[arg0.field802]) {
                        arg0.field860 = 1;
                        arg0.field802++;
                        method1720(var3, arg0.field802, arg0.field826, arg0.field801);
                    }
                    if (arg0.field802 >= var3.field974.length && (arg0.field802 < 0 || arg0.field802 >= var3.field974.length)) {
                        arg0.field829 = -1;
                    }
                }
            }
        }
        if (arg0.field831 != -1 && arg0.field833 <= 1) {
            class43 var4 = class43.method72(arg0.field831);
            if (var4.field988 == 1 && arg0.field858 > 0 && arg0.field825 <= field290 && arg0.field816 < field290) {
                arg0.field833 = 1;
                return;
            }
        }
        if (arg0.field831 != -1 && arg0.field833 == 0) {
            class43 var5 = class43.method72(arg0.field831);
            if (var5 == null || var5.field974 == null) {
                arg0.field831 = -1;
            } else {
                arg0.field845++;
                if (arg0.field852 < var5.field974.length && arg0.field845 > var5.field981[arg0.field852]) {
                    arg0.field845 = 1;
                    arg0.field852++;
                    method1720(var5, arg0.field852, arg0.field826, arg0.field801);
                }
                if (arg0.field852 >= var5.field974.length) {
                    arg0.field852 -= var5.field977;
                    arg0.field835++;
                    if (arg0.field835 >= var5.field976) {
                        arg0.field831 = -1;
                    } else if (arg0.field852 >= 0 && arg0.field852 < var5.field974.length) {
                        method1720(var5, arg0.field852, arg0.field826, arg0.field801);
                    } else {
                        arg0.field831 = -1;
                    }
                }
                arg0.field803 = var5.field983;
            }
        }
        if (arg0.field833 > 0) {
            arg0.field833--;
        }
    }

    @ObfuscatedName("ad.ac(Lk;III)V")
    public static void method724(class3 arg0, int arg1, int arg2) {
        if (arg0.field831 == arg1 && arg1 != -1) {
            int var3 = class43.method72(arg1).field992;
            if (var3 == 1) {
                arg0.field852 = 0;
                arg0.field845 = 0;
                arg0.field833 = arg2;
                arg0.field835 = 0;
            }
            if (var3 == 2) {
                arg0.field835 = 0;
            }
        } else if (arg1 == -1 || arg0.field831 == -1 || class43.method72(arg1).field986 >= class43.method72(arg0.field831).field986) {
            arg0.field831 = arg1;
            arg0.field852 = 0;
            arg0.field845 = 0;
            arg0.field833 = arg2;
            arg0.field835 = 0;
            arg0.field858 = arg0.field853;
        }
    }

    @ObfuscatedName("an.ak(I)I")
    public static int method612() {
        return field557 ? 2 : 1;
    }

    @ObfuscatedName("n.am(B)V")
    public static void method127() {
        field321.method2547(173);
        field321.method2285(method612());
        field321.method2287(Statics.field2056);
        field321.method2287(Statics.field2096);
    }

    @ObfuscatedName("fm.au(I)V")
    public static void method3183() {
        int var0 = field2215;
        int var1 = field2206;
        int var2 = Statics.field614 - Statics.field2056 - var0;
        int var3 = Statics.field1606 - Statics.field2096 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field287.method2796();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field1628 == var4) {
                Insets var7 = Statics.field1628.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field1606);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field614, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field614 + var5 - var2, var6, var2, Statics.field1606);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field1606 + var6 - var3, Statics.field614, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("f.av(Ljava/lang/String;ZB)V")
    public static final void method46(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field782.method3735(arg0, 250);
        int var6 = Statics.field782.method3743(arg0, 250) * 13;
        class80.method1640(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1638(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field782.method3730(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method543(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method113(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field147.getGraphics();
            Statics.field2003.method1490(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field147.repaint();
        }
    }

    @ObfuscatedName("ar.ad(IIIIZI)V")
    public static final void method945(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field535 - field407) * var5 / 100 + field407;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field540) {
            short var8 = field540;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field539) {
                var6 = field539;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1665();
                    class80.method1640(arg0, arg1, var10, arg3, -16777216);
                    class80.method1640(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field348) {
            short var11 = field348;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field538) {
                var6 = field538;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1665();
                    class80.method1640(arg0, arg1, arg2, var13, -16777216);
                    class80.method1640(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field337 - field420) * var5 / 100 + field420;
        field546 = arg3 * var6 * var14 / 85504 << 1;
        if (field544 != arg2 || field545 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class91.field1580[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class86.method1757(var15, 500, 800, arg2, arg3);
        }
        field542 = arg0;
        field358 = arg1;
        field544 = arg2;
        field545 = arg3;
    }

    @ObfuscatedName("m.ae(Lak;I)V")
    public static final void method542(class34 arg0) {
        if (Statics.field859.field826 >> 7 == field483 && Statics.field859.field801 >> 7 == field514) {
            field483 = 0;
        }
        int var1 = class33.field739;
        int[] var2 = class33.field734;
        int var3 = var1;
        if (class34.field761 == arg0 || class34.field756 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field761 == arg0) {
                var5 = Statics.field859;
                var6 = Statics.field859.field47 << 14;
            } else if (class34.field756 == arg0) {
                var5 = field402[field411];
                var6 = field411 << 14;
            } else {
                var5 = field402[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field758 == arg0 && field411 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method22() && !var5.field30) {
                var5.field49 = false;
                if ((field466 && var1 > 50 || var1 > 200) && class34.field761 != arg0 && var5.field828 == var5.field805) {
                    var5.field49 = true;
                }
                int var7 = var5.field826 >> 7;
                int var8 = var5.field801 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field44 == null || field290 < var5.field39 || field290 >= var5.field51) {
                        if ((var5.field826 & 0x7F) == 64 && (var5.field801 & 0x7F) == 64) {
                            if (field484 == field473[var7][var8]) {
                                continue;
                            }
                            field473[var7][var8] = field484;
                        }
                        var5.field32 = method819(var5.field826, var5.field801, Statics.field2179);
                        Statics.field2175.method1731(Statics.field2179, var5.field826, var5.field801, var5.field32, 60, var5, var5.field800, var6, var5.field803);
                    } else {
                        var5.field49 = false;
                        var5.field32 = method819(var5.field826, var5.field801, Statics.field2179);
                        Statics.field2175.method1734(Statics.field2179, var5.field826, var5.field801, var5.field32, 60, var5, var5.field800, var6, var5.field45, var5.field46, var5.field48, var5.field54);
                    }
                }
            }
        }
    }

    @ObfuscatedName("k.ai(ZS)V")
    public static final void method42(boolean arg0) {
        for (int var1 = 0; var1 < field317; var1++) {
            class35 var2 = field316[field302[var1]];
            int var3 = (field302[var1] << 14) + 536870912;
            if (var2 != null && var2.method22() && var2.field765.field897 == arg0 && var2.field765.method733()) {
                int var4 = var2.field826 >> 7;
                int var5 = var2.field801 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field804 == 1 && (var2.field826 & 0x7F) == 64 && (var2.field801 & 0x7F) == 64) {
                        if (field484 == field473[var4][var5]) {
                            continue;
                        }
                        field473[var4][var5] = field484;
                    }
                    if (!var2.field765.field905) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field2175.method1731(Statics.field2179, var2.field826, var2.field801, method819(var2.field826 + (var2.field804 * 64 - 64), var2.field801 + (var2.field804 * 64 - 64), Statics.field2179), var2.field804 * 64 - 64 + 60, var2, var2.field800, var3, var2.field803);
                }
            }
        }
    }

    @ObfuscatedName("k.at(I)I")
    public static final int method43() {
        if (Statics.field2026.field138) {
            return Statics.field2179;
        }
        int var0 = 3;
        if (Statics.field2302 < 310) {
            int var1 = Statics.field186 >> 7;
            int var2 = Statics.field967 >> 7;
            int var3 = Statics.field859.field826 >> 7;
            int var4 = Statics.field859.field801 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field2179;
            }
            if ((class6.field79[Statics.field2179][var1][var2] & 0x4) != 0) {
                var0 = Statics.field2179;
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
                    if ((class6.field79[Statics.field2179][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field2179;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field79[Statics.field2179][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field2179;
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
                    if ((class6.field79[Statics.field2179][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field2179;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field79[Statics.field2179][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field2179;
                        }
                    }
                }
            }
        }
        if (Statics.field859.field826 >= 0 && Statics.field859.field801 >= 0 && Statics.field859.field826 < 13312 && Statics.field859.field801 < 13312) {
            if ((class6.field79[Statics.field2179][Statics.field859.field826 >> 7][Statics.field859.field801 >> 7] & 0x4) != 0) {
                var0 = Statics.field2179;
            }
            return var0;
        } else {
            return Statics.field2179;
        }
    }

    @ObfuscatedName("client.aa(Lav;IIIIII)V")
    public static final void method531(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method22()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field765;
            if (var6.field876 != null) {
                var6 = var6.method732();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class33.field739;
        int[] var8 = class33.field734;
        if (arg1 < var7) {
            int var9 = 30;
            class3 var10 = (class3) arg0;
            if (var10.field30) {
                return;
            }
            if (var10.field40 != -1 || var10.field38 != -1) {
                method3412(arg0, arg0.field849 + 15);
                if (field425 > -1) {
                    if (var10.field40 != -1) {
                        Statics.field1023[var10.field40].method1553(field425 + arg2 - 12, field388 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field38 != -1) {
                        Statics.field123[var10.field38].method1553(field425 + arg2 - 12, field388 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field298 == 10 && field300 == var8[arg1]) {
                method3412(arg0, arg0.field849 + 15);
                if (field425 > -1) {
                    Statics.field159[1].method1553(field425 + arg2 - 12, field388 + arg3 - var9);
                }
            }
        } else {
            class40 var11 = ((class35) arg0).field765;
            if (var11.field876 != null) {
                var11 = var11.method732();
            }
            if (var11.field900 >= 0 && var11.field900 < Statics.field123.length) {
                method3412(arg0, arg0.field849 + 15);
                if (field425 > -1) {
                    Statics.field123[var11.field900].method1553(field425 + arg2 - 12, field388 + arg3 - 30);
                }
            }
            if (field298 == 1 && field280 == field302[arg1 - var7] && field290 % 20 < 10) {
                method3412(arg0, arg0.field849 + 15);
                if (field425 > -1) {
                    Statics.field159[0].method1553(field425 + arg2 - 12, field388 + arg3 - 28);
                }
            }
        }
        if (arg0.field837 != null && (arg1 >= var7 || !arg0.field815 && (field497 == 4 || !arg0.field814 && (field497 == 0 || field497 == 3 || field497 == 1 && method1469(((class3) arg0).field37, false))))) {
            method3412(arg0, arg0.field849);
            if (field425 > -1 && field375 < field475) {
                field380[field375] = Statics.field333.method3724(arg0.field837) / 2;
                field379[field375] = Statics.field333.field3176;
                field377[field375] = field425;
                field378[field375] = field388;
                field415[field375] = arg0.field817;
                field486[field375] = arg0.field818;
                field323[field375] = arg0.field834;
                field384[field375] = arg0.field837;
                field375++;
            }
        }
        if (arg0.field822 > field290) {
            method3412(arg0, arg0.field849 + 15);
            if (field425 > -1) {
                int var12;
                if (arg1 < var7) {
                    var12 = 30;
                } else {
                    class40 var13 = ((class35) arg0).field765;
                    var12 = var13.field908;
                }
                int var14 = arg0.field823 * var12 / arg0.field824;
                if (var14 > var12) {
                    var14 = var12;
                } else if (var14 == 0 && arg0.field823 > 0) {
                    var14 = 1;
                }
                class80.method1640(field425 + arg2 - var12 / 2, field388 + arg3 - 3, var14, 5, 65280);
                class80.method1640(field425 + arg2 - var12 / 2 + var14, field388 + arg3 - 3, var12 - var14, 5, 16711680);
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            if (arg0.field821[var15] > field290) {
                method3412(arg0, arg0.field849 / 2);
                if (field425 > -1) {
                    if (var15 == 1) {
                        field388 -= 20;
                    }
                    if (var15 == 2) {
                        field425 -= 15;
                        field388 -= 10;
                    }
                    if (var15 == 3) {
                        field425 += 15;
                        field388 -= 10;
                    }
                    Statics.field164[arg0.field836[var15]].method1553(field425 + arg2 - 12, field388 + arg3 - 12);
                    Statics.field2295.method3692(Integer.toString(arg0.field861[var15]), field425 + arg2 - 1, field388 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("gv.ax(Lav;II)V")
    public static final void method3412(class38 arg0, int arg1) {
        method2248(arg0.field826, arg0.field801, arg1);
    }

    @ObfuscatedName("de.as(IIII)V")
    public static final void method2248(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field425 = -1;
            field388 = -1;
            return;
        }
        int var3 = method819(arg0, arg1, Statics.field2179) - arg2;
        int var4 = arg0 - Statics.field186;
        int var5 = var3 - Statics.field1095;
        int var6 = arg1 - Statics.field967;
        int var7 = class91.field1580[Statics.field2302];
        int var8 = class91.field1566[Statics.field2302];
        int var9 = class91.field1580[Statics.field2174];
        int var10 = class91.field1566[Statics.field2174];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field425 = field546 * var11 / var15 + field544 / 2;
            field388 = field546 * var14 / var15 + field545 / 2;
        } else {
            field425 = -1;
            field388 = -1;
        }
    }

    @ObfuscatedName("at.ar(IIII)I")
    public static final int method819(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field79[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field98[var5][var3][var4] + class6.field98[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field98[var5][var3][var4 + 1] + class6.field98[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("j.ap(ZI)V")
    public static final void method135(boolean arg0) {
        field362 = arg0;
        if (!field362) {
            int var1 = field448.method2334();
            int var2 = field448.method2334();
            int var3 = field448.method2415();
            Statics.field2268 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field2268[var4][var5] = field448.method2306();
                }
            }
            Statics.field339 = new int[var3];
            Statics.field764 = new int[var3];
            Statics.field1588 = new int[var3];
            Statics.field2912 = new byte[var3][];
            Statics.field340 = new byte[var3][];
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
                        Statics.field339[var7] = var10;
                        Statics.field764[var7] = Statics.field993.method3021("m" + var8 + "_" + var9);
                        Statics.field1588[var7] = Statics.field993.method3021("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method2911(var2, var1);
            return;
        }
        int var11 = field448.method2334();
        int var12 = field448.method2335();
        int var13 = field448.method2415();
        field448.method2565();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field448.method2550(1);
                    if (var17 == 1) {
                        field401[var14][var15][var16] = field448.method2550(26);
                    } else {
                        field401[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field448.method2551();
        Statics.field2268 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field2268[var18][var19] = field448.method2306();
            }
        }
        Statics.field339 = new int[var13];
        Statics.field764 = new int[var13];
        Statics.field1588 = new int[var13];
        Statics.field2912 = new byte[var13][];
        Statics.field340 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field401[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field339[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field339[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field764[var20] = Statics.field993.method3021("m" + var29 + "_" + var30);
                            Statics.field1588[var20] = Statics.field993.method3021("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method2911(var12, var11);
    }

    @ObfuscatedName("fg.ag(IIB)V")
    public static final void method2911(int arg0, int arg1) {
        if (Statics.field1451 == arg0 && Statics.field1660 == arg1) {
            return;
        }
        Statics.field1451 = arg0;
        Statics.field1660 = arg1;
        method162(25);
        method46(class157.field2330, true);
        int var2 = Statics.field86;
        int var3 = Statics.field2893;
        Statics.field86 = (arg0 - 6) * 8;
        Statics.field2893 = (arg1 - 6) * 8;
        int var4 = Statics.field86 - var2;
        int var5 = Statics.field2893 - var3;
        int var6 = Statics.field86;
        int var7 = Statics.field2893;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field316[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field854[var10] -= var4;
                    var9.field855[var10] -= var5;
                }
                var9.field826 -= var4 * 128;
                var9.field801 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field402[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field854[var13] -= var4;
                    var12.field855[var13] -= var5;
                }
                var12.field826 -= var4 * 128;
                var12.field801 -= var5 * 128;
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
                        field412[var24][var20][var21] = field412[var24][var22][var23];
                    } else {
                        field412[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field522.method3502(); var25 != null; var25 = (class17) field522.method3489()) {
            var25.field223 -= var4;
            var25.field224 -= var5;
            if (var25.field223 < 0 || var25.field224 < 0 || var25.field223 >= 104 || var25.field224 >= 104) {
                var25.method3583();
            }
        }
        if (field483 != 0) {
            field483 -= var4;
            field514 -= var5;
        }
        field285 = 0;
        field528 = false;
        field508 = -1;
        field537.method3490();
        field414.method3490();
        for (int var26 = 0; var26 < 4; var26++) {
            field341[var26].method2206();
        }
    }

    @ObfuscatedName("ec.af(ZB)V")
    public static final void method2896(boolean arg0) {
        method2079();
        field327++;
        if (field327 < 50 && !arg0) {
            return;
        }
        field327 = 0;
        if (field332 || Statics.field134 == null) {
            return;
        }
        field321.method2547(218);
        try {
            Statics.field134.method2769(field321.field1987, 0, field321.field1986);
            field321.field1986 = 0;
        } catch (IOException var2) {
            field332 = true;
        }
    }

    @ObfuscatedName("eg.az(I)V")
    public static final void method2650() {
        method2896(false);
        field334 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field2912.length; var1++) {
            if (Statics.field764[var1] != -1 && Statics.field2912[var1] == null) {
                Statics.field2912[var1] = Statics.field993.method2986(Statics.field764[var1], 0);
                if (Statics.field2912[var1] == null) {
                    var0 = false;
                    field334++;
                }
            }
            if (Statics.field1588[var1] != -1 && Statics.field340[var1] == null) {
                Statics.field340[var1] = Statics.field993.method2987(Statics.field1588[var1], 0, Statics.field2268[var1]);
                if (Statics.field340[var1] == null) {
                    var0 = false;
                    field334++;
                }
            }
        }
        if (!var0) {
            field338 = 1;
            return;
        }
        field336 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field2912.length; var3++) {
            byte[] var4 = Statics.field340[var3];
            if (var4 != null) {
                int var5 = (Statics.field339[var3] >> 8) * 64 - Statics.field86;
                int var6 = (Statics.field339[var3] & 0xFF) * 64 - Statics.field2893;
                if (field362) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class6.method2657(var4, var5, var6);
            }
        }
        if (!var2) {
            field338 = 2;
            return;
        }
        if (field338 != 0) {
            method46(class157.field2330 + class2.field24 + class2.field26 + 100 + "%" + class2.field22, true);
        }
        method2079();
        method3414();
        method2079();
        Statics.field2175.method1854();
        method2079();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field341[var7].method2206();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class6.field79[var8][var9][var10] = 0;
                }
            }
        }
        method2079();
        class6.method625();
        int var11 = Statics.field2912.length;
        for (class24 var12 = (class24) class24.field602.method3502(); var12 != null; var12 = (class24) class24.field602.method3489()) {
            if (var12.field600 != null) {
                Statics.field562.method1119(var12.field600);
                var12.field600 = null;
            }
            if (var12.field605 != null) {
                Statics.field562.method1119(var12.field605);
                var12.field605 = null;
            }
        }
        class24.field602.method3490();
        method2896(true);
        if (!field362) {
            for (int var13 = 0; var13 < var11; var13++) {
                int var14 = (Statics.field339[var13] >> 8) * 64 - Statics.field86;
                int var15 = (Statics.field339[var13] & 0xFF) * 64 - Statics.field2893;
                byte[] var16 = Statics.field2912[var13];
                if (var16 != null) {
                    method2079();
                    class6.method2925(var16, var14, var15, Statics.field1451 * 8 - 48, Statics.field1660 * 8 - 48, field341);
                }
            }
            for (int var17 = 0; var17 < var11; var17++) {
                int var18 = (Statics.field339[var17] >> 8) * 64 - Statics.field86;
                int var19 = (Statics.field339[var17] & 0xFF) * 64 - Statics.field2893;
                byte[] var20 = Statics.field2912[var17];
                if (var20 == null && Statics.field1660 < 800) {
                    method2079();
                    class6.method3120(var18, var19, 64, 64);
                }
            }
            method2896(true);
            for (int var21 = 0; var21 < var11; var21++) {
                byte[] var22 = Statics.field340[var21];
                if (var22 != null) {
                    int var23 = (Statics.field339[var21] >> 8) * 64 - Statics.field86;
                    int var24 = (Statics.field339[var21] & 0xFF) * 64 - Statics.field2893;
                    method2079();
                    class86 var25 = Statics.field2175;
                    class108[] var26 = field341;
                    class119 var27 = new class119(var22);
                    int var28 = -1;
                    while (true) {
                        int var29 = var27.method2301();
                        if (var29 == 0) {
                            break;
                        }
                        var28 += var29;
                        int var30 = 0;
                        while (true) {
                            int var31 = var27.method2301();
                            if (var31 == 0) {
                                break;
                            }
                            var30 += var31 - 1;
                            int var32 = var30 & 0x3F;
                            int var33 = var30 >> 6 & 0x3F;
                            int var34 = var30 >> 12;
                            int var35 = var27.method2457();
                            int var36 = var35 >> 2;
                            int var37 = var35 & 0x3;
                            int var38 = var23 + var33;
                            int var39 = var24 + var32;
                            if (var38 > 0 && var39 > 0 && var38 < 103 && var39 < 103) {
                                int var40 = var34;
                                if ((class6.field79[1][var38][var39] & 0x2) == 2) {
                                    var40 = var34 - 1;
                                }
                                class108 var41 = null;
                                if (var40 >= 0) {
                                    var41 = var26[var40];
                                }
                                class6.method965(var34, var38, var39, var28, var37, var36, var25, var41);
                            }
                        }
                    }
                }
            }
        }
        if (field362) {
            for (int var42 = 0; var42 < 4; var42++) {
                method2079();
                for (int var43 = 0; var43 < 13; var43++) {
                    for (int var44 = 0; var44 < 13; var44++) {
                        boolean var45 = false;
                        int var46 = field401[var42][var43][var44];
                        if (var46 != -1) {
                            int var47 = var46 >> 24 & 0x3;
                            int var48 = var46 >> 1 & 0x3;
                            int var49 = var46 >> 14 & 0x3FF;
                            int var50 = var46 >> 3 & 0x7FF;
                            int var51 = (var49 / 8 << 8) + var50 / 8;
                            for (int var52 = 0; var52 < Statics.field339.length; var52++) {
                                if (Statics.field339[var52] == var51 && Statics.field2912[var52] != null) {
                                    class6.method3167(Statics.field2912[var52], var42, var43 * 8, var44 * 8, var47, (var49 & 0x7) * 8, (var50 & 0x7) * 8, var48, field341);
                                    var45 = true;
                                    break;
                                }
                            }
                        }
                        if (!var45) {
                            class6.method1990(var42, var43 * 8, var44 * 8);
                        }
                    }
                }
            }
            for (int var53 = 0; var53 < 13; var53++) {
                for (int var54 = 0; var54 < 13; var54++) {
                    int var55 = field401[0][var53][var54];
                    if (var55 == -1) {
                        class6.method3120(var53 * 8, var54 * 8, 8, 8);
                    }
                }
            }
            method2896(true);
            for (int var56 = 0; var56 < 4; var56++) {
                method2079();
                for (int var57 = 0; var57 < 13; var57++) {
                    label891: for (int var58 = 0; var58 < 13; var58++) {
                        int var59 = field401[var56][var57][var58];
                        if (var59 != -1) {
                            int var60 = var59 >> 24 & 0x3;
                            int var61 = var59 >> 1 & 0x3;
                            int var62 = var59 >> 14 & 0x3FF;
                            int var63 = var59 >> 3 & 0x7FF;
                            int var64 = (var62 / 8 << 8) + var63 / 8;
                            for (int var65 = 0; var65 < Statics.field339.length; var65++) {
                                if (Statics.field339[var65] == var64 && Statics.field340[var65] != null) {
                                    byte[] var66 = Statics.field340[var65];
                                    int var67 = var57 * 8;
                                    int var68 = var58 * 8;
                                    int var69 = (var62 & 0x7) * 8;
                                    int var70 = (var63 & 0x7) * 8;
                                    class86 var71 = Statics.field2175;
                                    class108[] var72 = field341;
                                    class119 var73 = new class119(var66);
                                    int var74 = -1;
                                    while (true) {
                                        int var75 = var73.method2301();
                                        if (var75 == 0) {
                                            continue label891;
                                        }
                                        var74 += var75;
                                        int var76 = 0;
                                        while (true) {
                                            int var77 = var73.method2301();
                                            if (var77 == 0) {
                                                break;
                                            }
                                            var76 += var77 - 1;
                                            int var78 = var76 & 0x3F;
                                            int var79 = var76 >> 6 & 0x3F;
                                            int var80 = var76 >> 12;
                                            int var81 = var73.method2457();
                                            int var82 = var81 >> 2;
                                            int var83 = var81 & 0x3;
                                            if (var60 == var80 && var79 >= var69 && var79 < var69 + 8 && var78 >= var70 && var78 < var70 + 8) {
                                                class41 var84 = class41.method3664(var74);
                                                int var86 = var79 & 0x7;
                                                int var87 = var78 & 0x7;
                                                int var89 = var84.field928;
                                                int var90 = var84.field929;
                                                if ((var83 & 0x1) == 1) {
                                                    int var91 = var89;
                                                    var89 = var90;
                                                    var90 = var91;
                                                }
                                                int var92 = var61 & 0x3;
                                                int var93;
                                                if (var92 == 0) {
                                                    var93 = var86;
                                                } else if (var92 == 1) {
                                                    var93 = var87;
                                                } else if (var92 == 2) {
                                                    var93 = 7 - var86 - (var89 - 1);
                                                } else {
                                                    var93 = 7 - var87 - (var90 - 1);
                                                }
                                                int var94 = var67 + var93;
                                                int var95 = var68 + class177.method2724(var79 & 0x7, var78 & 0x7, var61, var84.field928, var84.field929, var83);
                                                if (var94 > 0 && var95 > 0 && var94 < 103 && var95 < 103) {
                                                    int var96 = var56;
                                                    if ((class6.field79[1][var94][var95] & 0x2) == 2) {
                                                        var96 = var56 - 1;
                                                    }
                                                    class108 var97 = null;
                                                    if (var96 >= 0) {
                                                        var97 = var72[var96];
                                                    }
                                                    class6.method965(var56, var94, var95, var74, var61 + var83 & 0x3, var82, var71, var97);
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
        method2896(true);
        method3414();
        method2079();
        class86 var98 = Statics.field2175;
        class108[] var99 = field341;
        for (int var100 = 0; var100 < 4; var100++) {
            for (int var101 = 0; var101 < 104; var101++) {
                for (int var102 = 0; var102 < 104; var102++) {
                    if ((class6.field79[var100][var101][var102] & 0x1) == 1) {
                        int var103 = var100;
                        if ((class6.field79[1][var101][var102] & 0x2) == 2) {
                            var103 = var100 - 1;
                        }
                        if (var103 >= 0) {
                            var99[var103].method2185(var101, var102);
                        }
                    }
                }
            }
        }
        class6.field80 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field80 < -8) {
            class6.field80 = -8;
        }
        if (class6.field80 > 8) {
            class6.field80 = 8;
        }
        class6.field95 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field95 < -16) {
            class6.field95 = -16;
        }
        if (class6.field95 > 16) {
            class6.field95 = 16;
        }
        for (int var104 = 0; var104 < 4; var104++) {
            byte[][] var105 = Statics.field85[var104];
            int var106 = (int) Math.sqrt(5100.0D);
            int var107 = var106 * 768 >> 8;
            for (int var108 = 1; var108 < 103; var108++) {
                for (int var109 = 1; var109 < 103; var109++) {
                    int var110 = class6.field98[var104][var109 + 1][var108] - class6.field98[var104][var109 - 1][var108];
                    int var111 = class6.field98[var104][var109][var108 + 1] - class6.field98[var104][var109][var108 - 1];
                    int var112 = (int) Math.sqrt((double) (var111 * var111 + var110 * var110 + 65536));
                    int var113 = (var110 << 8) / var112;
                    int var114 = 65536 / var112;
                    int var115 = (var111 << 8) / var112;
                    int var116 = (var115 * -50 + var113 * -50 + var114 * -10) / var107 + 96;
                    int var117 = (var105[var109][var108] >> 1) + (var105[var109][var108 + 1] >> 3) + (var105[var109][var108 - 1] >> 2) + (var105[var109 - 1][var108] >> 2) + (var105[var109 + 1][var108] >> 3);
                    Statics.field97[var109][var108] = var116 - var117;
                }
            }
            for (int var118 = 0; var118 < 104; var118++) {
                Statics.field759[var118] = 0;
                Statics.field1897[var118] = 0;
                Statics.field2048[var118] = 0;
                Statics.field87[var118] = 0;
                Statics.field188[var118] = 0;
            }
            for (int var119 = -5; var119 < 109; var119++) {
                for (int var120 = 0; var120 < 104; var120++) {
                    int var121 = var119 + 5;
                    int var10002;
                    if (var121 >= 0 && var121 < 104) {
                        int var122 = Statics.field81[var104][var121][var120] & 0xFF;
                        if (var122 > 0) {
                            int var123 = var122 - 1;
                            class42 var124 = (class42) class42.field970.method3439((long) var123);
                            class42 var125;
                            if (var124 == null) {
                                byte[] var126 = Statics.field3149.method2986(1, var123);
                                class42 var127 = new class42();
                                if (var126 != null) {
                                    var127.method804(new class119(var126), var123);
                                }
                                var127.method820();
                                class42.field970.method3429(var127, (long) var123);
                                var125 = var127;
                            } else {
                                var125 = var124;
                            }
                            Statics.field759[var120] += var125.field972;
                            Statics.field1897[var120] += var125.field965;
                            Statics.field2048[var120] += var125.field968;
                            Statics.field87[var120] += var125.field964;
                            var10002 = Statics.field188[var120]++;
                        }
                    }
                    int var129 = var119 - 5;
                    if (var129 >= 0 && var129 < 104) {
                        int var130 = Statics.field81[var104][var129][var120] & 0xFF;
                        if (var130 > 0) {
                            int var131 = var130 - 1;
                            class42 var132 = (class42) class42.field970.method3439((long) var131);
                            class42 var133;
                            if (var132 == null) {
                                byte[] var134 = Statics.field3149.method2986(1, var131);
                                class42 var135 = new class42();
                                if (var134 != null) {
                                    var135.method804(new class119(var134), var131);
                                }
                                var135.method820();
                                class42.field970.method3429(var135, (long) var131);
                                var133 = var135;
                            } else {
                                var133 = var132;
                            }
                            Statics.field759[var120] -= var133.field972;
                            Statics.field1897[var120] -= var133.field965;
                            Statics.field2048[var120] -= var133.field968;
                            Statics.field87[var120] -= var133.field964;
                            var10002 = Statics.field188[var120]--;
                        }
                    }
                }
                if (var119 >= 1 && var119 < 103) {
                    int var137 = 0;
                    int var138 = 0;
                    int var139 = 0;
                    int var140 = 0;
                    int var141 = 0;
                    for (int var142 = -5; var142 < 109; var142++) {
                        int var143 = var142 + 5;
                        if (var143 >= 0 && var143 < 104) {
                            var137 += Statics.field759[var143];
                            var138 += Statics.field1897[var143];
                            var139 += Statics.field2048[var143];
                            var140 += Statics.field87[var143];
                            var141 += Statics.field188[var143];
                        }
                        int var144 = var142 - 5;
                        if (var144 >= 0 && var144 < 104) {
                            var137 -= Statics.field759[var144];
                            var138 -= Statics.field1897[var144];
                            var139 -= Statics.field2048[var144];
                            var140 -= Statics.field87[var144];
                            var141 -= Statics.field188[var144];
                        }
                        if (var142 >= 1 && var142 < 103 && (!field466 || (class6.field79[0][var119][var142] & 0x2) != 0 || (class6.field79[var104][var119][var142] & 0x10) == 0)) {
                            if (var104 < class6.field94) {
                                class6.field94 = var104;
                            }
                            int var145 = Statics.field81[var104][var119][var142] & 0xFF;
                            int var146 = Statics.field82[var104][var119][var142] & 0xFF;
                            if (var145 > 0 || var146 > 0) {
                                int var147 = class6.field98[var104][var119][var142];
                                int var148 = class6.field98[var104][var119 + 1][var142];
                                int var149 = class6.field98[var104][var119 + 1][var142 + 1];
                                int var150 = class6.field98[var104][var119][var142 + 1];
                                int var151 = Statics.field97[var119][var142];
                                int var152 = Statics.field97[var119 + 1][var142];
                                int var153 = Statics.field97[var119 + 1][var142 + 1];
                                int var154 = Statics.field97[var119][var142 + 1];
                                int var155 = -1;
                                int var156 = -1;
                                if (var145 > 0) {
                                    int var157 = var137 * 256 / var140;
                                    int var158 = var138 / var141;
                                    int var159 = var139 / var141;
                                    var155 = class6.method2572(var157, var158, var159);
                                    int var160 = class6.field80 + var157 & 0xFF;
                                    int var161 = class6.field95 + var159;
                                    if (var161 < 0) {
                                        var161 = 0;
                                    } else if (var161 > 255) {
                                        var161 = 255;
                                    }
                                    var156 = class6.method2572(var160, var158, var161);
                                }
                                if (var104 > 0) {
                                    boolean var162 = true;
                                    if (var145 == 0 && Statics.field83[var104][var119][var142] != 0) {
                                        var162 = false;
                                    }
                                    if (var146 > 0 && !class47.method1886(var146 - 1).field1037) {
                                        var162 = false;
                                    }
                                    if (var162 && var147 == var148 && var147 == var149 && var147 == var150) {
                                        Statics.field1060[var104][var119][var142] |= 0x924;
                                    }
                                }
                                int var163 = 0;
                                if (var156 != -1) {
                                    var163 = class91.field1575[class6.method678(var156, 96)];
                                }
                                if (var146 == 0) {
                                    var98.method1727(var104, var119, var142, 0, 0, -1, var147, var148, var149, var150, class6.method678(var155, var151), class6.method678(var155, var152), class6.method678(var155, var153), class6.method678(var155, var154), 0, 0, 0, 0, var163, 0);
                                } else {
                                    int var164 = Statics.field83[var104][var119][var142] + 1;
                                    byte var165 = Statics.field84[var104][var119][var142];
                                    class47 var166 = class47.method1886(var146 - 1);
                                    int var167 = var166.field1045;
                                    int var168;
                                    int var169;
                                    if (var167 >= 0) {
                                        var168 = Statics.field1572.method1966(var167);
                                        var169 = -1;
                                    } else if (var166.field1039 == 16711935) {
                                        var169 = -2;
                                        var167 = -1;
                                        var168 = -2;
                                    } else {
                                        var169 = class6.method2572(var166.field1049, var166.field1044, var166.field1043);
                                        int var170 = class6.field80 + var166.field1049 & 0xFF;
                                        int var171 = class6.field95 + var166.field1043;
                                        if (var171 < 0) {
                                            var171 = 0;
                                        } else if (var171 > 255) {
                                            var171 = 255;
                                        }
                                        var168 = class6.method2572(var170, var166.field1044, var171);
                                    }
                                    int var172 = 0;
                                    if (var168 != -2) {
                                        var172 = class91.field1575[class6.method118(var168, 96)];
                                    }
                                    if (var166.field1042 != -1) {
                                        int var173 = class6.field80 + var166.field1046 & 0xFF;
                                        int var174 = class6.field95 + var166.field1047;
                                        if (var174 < 0) {
                                            var174 = 0;
                                        } else if (var174 > 255) {
                                            var174 = 255;
                                        }
                                        int var175 = class6.method2572(var173, var166.field1051, var174);
                                        var172 = class91.field1575[class6.method118(var175, 96)];
                                    }
                                    var98.method1727(var104, var119, var142, var164, var165, var167, var147, var148, var149, var150, class6.method678(var155, var151), class6.method678(var155, var152), class6.method678(var155, var153), class6.method678(var155, var154), class6.method118(var169, var151), class6.method118(var169, var152), class6.method118(var169, var153), class6.method118(var169, var154), var163, var172);
                                }
                            }
                        }
                    }
                }
            }
            for (int var176 = 1; var176 < 103; var176++) {
                for (int var177 = 1; var177 < 103; var177++) {
                    var98.method1810(var104, var177, var176, class6.method554(var104, var177, var176));
                }
            }
            Statics.field81[var104] = (byte[][]) null;
            Statics.field82[var104] = (byte[][]) null;
            Statics.field83[var104] = (byte[][]) null;
            Statics.field84[var104] = (byte[][]) null;
            Statics.field85[var104] = (byte[][]) null;
        }
        var98.method1753(-50, -10, -50);
        for (int var178 = 0; var178 < 104; var178++) {
            for (int var179 = 0; var179 < 104; var179++) {
                if ((class6.field79[1][var178][var179] & 0x2) == 2) {
                    var98.method1724(var178, var179);
                }
            }
        }
        int var180 = 1;
        int var181 = 2;
        int var182 = 4;
        for (int var183 = 0; var183 < 4; var183++) {
            if (var183 > 0) {
                var180 <<= 0x3;
                var181 <<= 0x3;
                var182 <<= 0x3;
            }
            for (int var184 = 0; var184 <= var183; var184++) {
                for (int var185 = 0; var185 <= 104; var185++) {
                    for (int var186 = 0; var186 <= 104; var186++) {
                        if ((Statics.field1060[var184][var186][var185] & var180) != 0) {
                            int var187 = var185;
                            int var188 = var185;
                            int var189 = var184;
                            int var190 = var184;
                            while (var187 > 0 && (Statics.field1060[var184][var186][var187 - 1] & var180) != 0) {
                                var187--;
                            }
                            while (var188 < 104 && (Statics.field1060[var184][var186][var188 + 1] & var180) != 0) {
                                var188++;
                            }
                            label626: while (var189 > 0) {
                                for (int var191 = var187; var191 <= var188; var191++) {
                                    if ((Statics.field1060[var189 - 1][var186][var191] & var180) == 0) {
                                        break label626;
                                    }
                                }
                                var189--;
                            }
                            label615: while (var190 < var183) {
                                for (int var192 = var187; var192 <= var188; var192++) {
                                    if ((Statics.field1060[var190 + 1][var186][var192] & var180) == 0) {
                                        break label615;
                                    }
                                }
                                var190++;
                            }
                            int var193 = (var190 + 1 - var189) * (var188 - var187 + 1);
                            if (var193 >= 8) {
                                short var194 = 240;
                                int var195 = class6.field98[var190][var186][var187] - var194;
                                int var196 = class6.field98[var189][var186][var187];
                                class86.method1733(var183, 1, var186 * 128, var186 * 128, var187 * 128, var188 * 128 + 128, var195, var196);
                                for (int var197 = var189; var197 <= var190; var197++) {
                                    for (int var198 = var187; var198 <= var188; var198++) {
                                        Statics.field1060[var197][var186][var198] &= ~var180;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1060[var184][var186][var185] & var181) != 0) {
                            int var199 = var186;
                            int var200 = var186;
                            int var201 = var184;
                            int var202 = var184;
                            while (var199 > 0 && (Statics.field1060[var184][var199 - 1][var185] & var181) != 0) {
                                var199--;
                            }
                            while (var200 < 104 && (Statics.field1060[var184][var200 + 1][var185] & var181) != 0) {
                                var200++;
                            }
                            label679: while (var201 > 0) {
                                for (int var203 = var199; var203 <= var200; var203++) {
                                    if ((Statics.field1060[var201 - 1][var203][var185] & var181) == 0) {
                                        break label679;
                                    }
                                }
                                var201--;
                            }
                            label668: while (var202 < var183) {
                                for (int var204 = var199; var204 <= var200; var204++) {
                                    if ((Statics.field1060[var202 + 1][var204][var185] & var181) == 0) {
                                        break label668;
                                    }
                                }
                                var202++;
                            }
                            int var205 = (var202 + 1 - var201) * (var200 - var199 + 1);
                            if (var205 >= 8) {
                                short var206 = 240;
                                int var207 = class6.field98[var202][var199][var185] - var206;
                                int var208 = class6.field98[var201][var199][var185];
                                class86.method1733(var183, 2, var199 * 128, var200 * 128 + 128, var185 * 128, var185 * 128, var207, var208);
                                for (int var209 = var201; var209 <= var202; var209++) {
                                    for (int var210 = var199; var210 <= var200; var210++) {
                                        Statics.field1060[var209][var210][var185] &= ~var181;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1060[var184][var186][var185] & var182) != 0) {
                            int var211 = var186;
                            int var212 = var186;
                            int var213 = var185;
                            int var214 = var185;
                            while (var213 > 0 && (Statics.field1060[var184][var186][var213 - 1] & var182) != 0) {
                                var213--;
                            }
                            while (var214 < 104 && (Statics.field1060[var184][var186][var214 + 1] & var182) != 0) {
                                var214++;
                            }
                            label732: while (var211 > 0) {
                                for (int var215 = var213; var215 <= var214; var215++) {
                                    if ((Statics.field1060[var184][var211 - 1][var215] & var182) == 0) {
                                        break label732;
                                    }
                                }
                                var211--;
                            }
                            label721: while (var212 < 104) {
                                for (int var216 = var213; var216 <= var214; var216++) {
                                    if ((Statics.field1060[var184][var212 + 1][var216] & var182) == 0) {
                                        break label721;
                                    }
                                }
                                var212++;
                            }
                            if ((var212 - var211 + 1) * (var214 - var213 + 1) >= 4) {
                                int var217 = class6.field98[var184][var211][var213];
                                class86.method1733(var183, 4, var211 * 128, var212 * 128 + 128, var213 * 128, var214 * 128 + 128, var217, var217);
                                for (int var218 = var211; var218 <= var212; var218++) {
                                    for (int var219 = var213; var219 <= var214; var219++) {
                                        Statics.field1060[var184][var218][var219] &= ~var182;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method2896(true);
        int var220 = class6.field94;
        if (var220 > Statics.field2179) {
            var220 = Statics.field2179;
        }
        if (var220 < Statics.field2179 - 1) {
            int var221 = Statics.field2179 - 1;
        }
        if (field466) {
            Statics.field2175.method1875(class6.field94);
        } else {
            Statics.field2175.method1875(0);
        }
        for (int var222 = 0; var222 < 104; var222++) {
            for (int var223 = 0; var223 < 104; var223++) {
                method569(var222, var223);
            }
        }
        method2079();
        method458();
        class41.field916.method3430();
        if (Statics.field1628 != null) {
            field321.method2547(231);
            field321.method2289(1057001181);
        }
        if (!field362) {
            int var224 = (Statics.field1451 - 6) / 8;
            int var225 = (Statics.field1451 + 6) / 8;
            int var226 = (Statics.field1660 - 6) / 8;
            int var227 = (Statics.field1660 + 6) / 8;
            for (int var228 = var224 - 1; var228 <= var225 + 1; var228++) {
                for (int var229 = var226 - 1; var229 <= var227 + 1; var229++) {
                    if (var228 < var224 || var228 > var225 || var229 < var226 || var229 > var227) {
                        Statics.field993.method3006("m" + var228 + "_" + var229);
                        Statics.field993.method3006("l" + var228 + "_" + var229);
                    }
                }
            }
        }
        method162(30);
        method2079();
        Statics.field81 = (byte[][][]) null;
        Statics.field82 = (byte[][][]) null;
        Statics.field83 = (byte[][][]) null;
        Statics.field84 = (byte[][][]) null;
        Statics.field1060 = (int[][][]) null;
        Statics.field85 = (byte[][][]) null;
        Statics.field97 = (int[][]) null;
        Statics.field759 = null;
        Statics.field1897 = null;
        Statics.field2048 = null;
        Statics.field87 = null;
        Statics.field188 = null;
        field321.method2547(65);
        class144.method935();
    }

    @ObfuscatedName("eb.bo(IIIIII)V")
    public static final void method2894(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field2175.method1748(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field2175.method1857(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field777.field1400;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method3664(var12);
            if (var13.field927 == -1) {
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
                class81 var14 = Statics.field1035[var13.field927];
                if (var14 != null) {
                    int var15 = (var13.field928 * 4 - var14.field1417) / 2;
                    int var16 = (var13.field929 * 4 - var14.field1422) / 2;
                    var14.method1693(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field929) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field2175.method1750(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field2175.method1857(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method3664(var21);
            if (var22.field927 != -1) {
                class81 var23 = Statics.field1035[var22.field927];
                if (var23 != null) {
                    int var24 = (var22.field928 * 4 - var23.field1417) / 2;
                    int var25 = (var22.field929 * 4 - var23.field1422) / 2;
                    var23.method1693(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field929) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field777.field1400;
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
        int var29 = Statics.field2175.method1751(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method3664(var30);
        if (var31.field927 == -1) {
            return;
        }
        class81 var32 = Statics.field1035[var31.field927];
        if (var32 != null) {
            int var33 = (var31.field928 * 4 - var32.field1417) / 2;
            int var34 = (var31.field929 * 4 - var32.field1422) / 2;
            var32.method1693(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field929) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("f.bu(B)Z")
    public static final boolean method44() {
        if (Statics.field134 == null) {
            return false;
        }
        try {
            int var0 = Statics.field134.method2767();
            if (var0 == 0) {
                return false;
            }
            if (field325 == -1) {
                Statics.field134.method2777(field448.field1987, 0, 1);
                field448.field1986 = 0;
                field325 = field448.method2546();
                field324 = class188.field3020[field325];
                var0--;
            }
            if (field324 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field134.method2777(field448.field1987, 0, 1);
                field324 = field448.field1987[0] & 0xFF;
                var0--;
            }
            if (field324 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field134.method2777(field448.field1987, 0, 2);
                field448.field1986 = 0;
                field324 = field448.method2415();
                var0 -= 2;
            }
            if (var0 < field324) {
                return false;
            }
            field448.field1986 = 0;
            Statics.field134.method2777(field448.field1987, 0, field324);
            field326 = 0;
            field330 = field329;
            field329 = field328;
            field328 = field325;
            if (field325 == 56) {
                int var1 = field448.method2336();
                class16 var2 = (class16) class16.field218.method3462((long) var1);
                if (var2 != null) {
                    var2.method3583();
                }
                field467[++field289 - 1 & 0x1F] = var1 & 0x7FFF;
                field325 = -1;
                return true;
            }
            if (field325 == 131) {
                method2089(true);
                field325 = -1;
                return true;
            }
            if (field325 == 19) {
                int var3 = field448.method2306();
                int var4 = field448.method2306();
                if (Statics.field170 == null || !Statics.field170.isValid()) {
                    try {
                        Iterator var5 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var5.hasNext()) {
                            GarbageCollectorMXBean var6 = (GarbageCollectorMXBean) var5.next();
                            if (var6.isValid()) {
                                Statics.field170 = var6;
                                field558 = -1L;
                                field481 = -1L;
                            }
                        }
                    } catch (Throwable var311) {
                    }
                }
                long var8 = class115.method82();
                int var10 = -1;
                if (Statics.field170 != null) {
                    long var11 = Statics.field170.getCollectionTime();
                    if (field481 != -1L) {
                        long var13 = var11 - field481;
                        long var15 = var8 - field558;
                        if (var15 != 0L) {
                            var10 = (int) (var13 * 100L / var15);
                        }
                    }
                    field481 = var11;
                    field558 = var8;
                }
                field321.method2547(223);
                field321.method2460(var3);
                field321.method2340(var4);
                field321.method2362(field2201);
                field321.method2326(var10);
                field325 = -1;
                return true;
            }
            if (field325 == 250) {
                field528 = true;
                Statics.field1057 = field448.method2457();
                Statics.field1860 = field448.method2457();
                Statics.field248 = field448.method2415();
                Statics.field1956 = field448.method2457();
                Statics.field653 = field448.method2457();
                if (Statics.field653 >= 100) {
                    Statics.field186 = Statics.field1057 * 128 + 64;
                    Statics.field967 = Statics.field1860 * 128 + 64;
                    Statics.field1095 = method819(Statics.field186, Statics.field967, Statics.field2179) - Statics.field248;
                }
                field325 = -1;
                return true;
            }
            if (field325 == 98) {
                int var17 = field448.method2379();
                class173 var18 = class173.method899(var17);
                for (int var19 = 0; var19 < var18.field2816.length; var19++) {
                    var18.field2816[var19] = -1;
                    var18.field2816[var19] = 0;
                }
                method2240(var18);
                field325 = -1;
                return true;
            }
            if (field325 == 87) {
                int var20 = field448.method2335();
                int var21 = field448.method2343();
                class173 var22 = class173.method899(var21);
                if (var22 != null && var22.field2746 == 0) {
                    if (var20 > var22.field2768 - var22.field2775) {
                        var20 = var22.field2768 - var22.field2775;
                    }
                    if (var20 < 0) {
                        var20 = 0;
                    }
                    if (var22.field2766 != var20) {
                        var22.field2766 = var20;
                        method2240(var22);
                    }
                }
                field325 = -1;
                return true;
            }
            if (field325 == 140) {
                class122 var23 = field448;
                int var24 = field324;
                class210 var25 = new class210();
                var25.field3113 = var23.method2457();
                var25.field3109 = var23.method2306();
                var25.field3108 = new int[var25.field3113];
                var25.field3107 = new int[var25.field3113];
                var25.field3110 = new Field[var25.field3113];
                var25.field3111 = new int[var25.field3113];
                var25.field3112 = new Method[var25.field3113];
                var25.field3106 = new byte[var25.field3113][][];
                for (int var26 = 0; var26 < var25.field3113; var26++) {
                    try {
                        int var27 = var23.method2457();
                        if (var27 == 0 || var27 == 1 || var27 == 2) {
                            String var28 = var23.method2309();
                            String var29 = var23.method2309();
                            int var30 = 0;
                            if (var27 == 1) {
                                var30 = var23.method2306();
                            }
                            var25.field3108[var26] = var27;
                            var25.field3111[var26] = var30;
                            if (class211.method962(var28).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var25.field3110[var26] = class211.method962(var28).getDeclaredField(var29);
                        } else if (var27 == 3 || var27 == 4) {
                            String var31 = var23.method2309();
                            String var32 = var23.method2309();
                            int var33 = var23.method2457();
                            String[] var34 = new String[var33];
                            for (int var35 = 0; var35 < var33; var35++) {
                                var34[var35] = var23.method2309();
                            }
                            String var36 = var23.method2309();
                            byte[][] var37 = new byte[var33][];
                            if (var27 == 3) {
                                for (int var38 = 0; var38 < var33; var38++) {
                                    int var39 = var23.method2306();
                                    var37[var38] = new byte[var39];
                                    var23.method2312(var37[var38], 0, var39);
                                }
                            }
                            var25.field3108[var26] = var27;
                            Class[] var40 = new Class[var33];
                            for (int var41 = 0; var41 < var33; var41++) {
                                var40[var41] = class211.method962(var34[var41]);
                            }
                            Class var42 = class211.method962(var36);
                            if (class211.method962(var31).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var43 = class211.method962(var31).getDeclaredMethods();
                            Method[] var44 = var43;
                            for (int var45 = 0; var45 < var44.length; var45++) {
                                Method var46 = var44[var45];
                                if (var46.getName().equals(var32)) {
                                    Class[] var47 = var46.getParameterTypes();
                                    if (var40.length == var47.length) {
                                        boolean var48 = true;
                                        for (int var49 = 0; var49 < var40.length; var49++) {
                                            if (var40[var49] != var47[var49]) {
                                                var48 = false;
                                                break;
                                            }
                                        }
                                        if (var48 && var42 == var46.getReturnType()) {
                                            var25.field3112[var26] = var46;
                                        }
                                    }
                                }
                            }
                            var25.field3106[var26] = var37;
                        }
                    } catch (ClassNotFoundException var306) {
                        var25.field3107[var26] = -1;
                    } catch (SecurityException var307) {
                        var25.field3107[var26] = -2;
                    } catch (NullPointerException var308) {
                        var25.field3107[var26] = -3;
                    } catch (Exception var309) {
                        var25.field3107[var26] = -4;
                    } catch (Throwable var310) {
                        var25.field3107[var26] = -5;
                    }
                }
                class211.field3116.method3535(var25);
                field325 = -1;
                return true;
            }
            if (field325 == 101) {
                method2544();
                field325 = -1;
                return false;
            }
            if (field325 == 242) {
                method135(false);
                field448.method2546();
                int var55 = field448.method2415();
                class33.method2592(field448, var55);
                field325 = -1;
                return true;
            }
            if (field325 == 85) {
                int var56 = field448.method2306();
                int var57 = field448.method2415();
                if (var56 < -70000) {
                    var57 += 32768;
                }
                class173 var58;
                if (var56 >= 0) {
                    var58 = class173.method899(var56);
                } else {
                    var58 = null;
                }
                if (var58 != null) {
                    for (int var59 = 0; var59 < var58.field2816.length; var59++) {
                        var58.field2816[var59] = 0;
                        var58.field2736[var59] = 0;
                    }
                }
                class16 var60 = (class16) class16.field218.method3462((long) var57);
                if (var60 != null) {
                    for (int var61 = 0; var61 < var60.field213.length; var61++) {
                        var60.field213[var61] = -1;
                        var60.field214[var61] = 0;
                    }
                }
                int var62 = field448.method2415();
                for (int var63 = 0; var63 < var62; var63++) {
                    int var64 = field448.method2336();
                    int var65 = field448.method2327();
                    if (var65 == 255) {
                        var65 = field448.method2344();
                    }
                    if (var58 != null && var63 < var58.field2816.length) {
                        var58.field2816[var63] = var64;
                        var58.field2736[var63] = var65;
                    }
                    class16.method1970(var57, var63, var64 - 1, var65);
                }
                if (var58 != null) {
                    method2240(var58);
                }
                method1197();
                field467[++field289 - 1 & 0x1F] = var57 & 0x7FFF;
                field325 = -1;
                return true;
            }
            if (field325 == 59) {
                field298 = field448.method2457();
                if (field298 == 1) {
                    field280 = field448.method2415();
                }
                if (field298 >= 2 && field298 <= 6) {
                    if (field298 == 2) {
                        field304 = 64;
                        field369 = 64;
                    }
                    if (field298 == 3) {
                        field304 = 0;
                        field369 = 64;
                    }
                    if (field298 == 4) {
                        field304 = 128;
                        field369 = 64;
                    }
                    if (field298 == 5) {
                        field304 = 64;
                        field369 = 0;
                    }
                    if (field298 == 6) {
                        field304 = 64;
                        field369 = 128;
                    }
                    field298 = 2;
                    field301 = field448.method2415();
                    field500 = field448.method2415();
                    field488 = field448.method2457();
                }
                if (field298 == 10) {
                    field300 = field448.method2415();
                }
                field325 = -1;
                return true;
            }
            if (field325 == 228) {
                int var66 = field448.method2379();
                boolean var67 = field448.method2327() == 1;
                class173 var68 = class173.method899(var66);
                if (var68.field2764 != var67) {
                    var68.field2764 = var67;
                    method2240(var68);
                }
                field325 = -1;
                return true;
            }
            if (field325 == 233) {
                class26 var69 = new class26();
                var69.field635 = field448.method2309();
                var69.field632 = field448.method2415();
                int var70 = field448.method2306();
                var69.field638 = var70;
                method162(45);
                Statics.field134.method2765();
                Statics.field134 = null;
                class32.method2892(var69);
                field325 = -1;
                return false;
            }
            if (field325 == 153) {
                int var71 = field324 + field448.field1986;
                int var72 = field448.method2415();
                int var73 = field448.method2415();
                if (field439 != var72) {
                    field439 = var72;
                    int var74 = field439;
                    int var75 = Statics.field2056;
                    int var76 = Statics.field2096;
                    if (Statics.method2098(var74)) {
                        method1887(Statics.field2802[var74], -1, var75, var76, false);
                    }
                    method3095(field439);
                    class37.method176(field439);
                    for (int var77 = 0; var77 < 100; var77++) {
                        field428[var77] = true;
                    }
                }
                while (var73-- > 0) {
                    int var78 = field448.method2306();
                    int var79 = field448.method2415();
                    int var80 = field448.method2457();
                    class4 var81 = (class4) field519.method3462((long) var78);
                    if (var81 != null && var81.field65 != var79) {
                        method683(var81, true);
                        var81 = null;
                    }
                    if (var81 == null) {
                        var81 = method973(var78, var79, var80);
                    }
                    var81.field59 = true;
                }
                for (class4 var82 = (class4) field519.method3464(); var82 != null; var82 = (class4) field519.method3465()) {
                    if (var82.field59) {
                        var82.field59 = false;
                    } else {
                        method683(var82, true);
                    }
                }
                field447 = new class196(512);
                while (field448.field1986 < var71) {
                    int var83 = field448.method2306();
                    int var84 = field448.method2415();
                    int var85 = field448.method2415();
                    int var86 = field448.method2306();
                    for (int var87 = var84; var87 <= var85; var87++) {
                        long var88 = ((long) var83 << 32) + (long) var87;
                        field447.method3470(new class201(var86), var88);
                    }
                }
                field325 = -1;
                return true;
            }
            if (field325 == 209) {
                method1888(field448.method2309());
                field325 = -1;
                return true;
            }
            if (field325 == 237) {
                method1197();
                field460 = field448.method2457();
                field386 = field516;
                field325 = -1;
                return true;
            }
            if (field325 == 253) {
                int var90 = field448.method2344();
                int var91 = field448.method2334();
                class173 var92 = class173.method899(var90);
                if (var92.field2785 != 2 || var92.field2786 != var91) {
                    var92.field2785 = 2;
                    var92.field2786 = var91;
                    method2240(var92);
                }
                field325 = -1;
                return true;
            }
            if (field325 == 65) {
                String var93 = field448.method2309();
                Object[] var94 = new Object[var93.length() + 1];
                for (int var95 = var93.length() - 1; var95 >= 0; var95--) {
                    if (var93.charAt(var95) == 's') {
                        var94[var95 + 1] = field448.method2309();
                    } else {
                        var94[var95 + 1] = Integer.valueOf(field448.method2306());
                    }
                }
                var94[0] = Integer.valueOf(field448.method2306());
                class1 var96 = new class1();
                var96.field17 = var94;
                class37.method105(var96);
                field325 = -1;
                return true;
            }
            if (field325 == 210) {
                class33.method2592(field448, field324);
                field325 = -1;
                return true;
            }
            if (field325 == 102) {
                for (int var97 = 0; var97 < field402.length; var97++) {
                    if (field402[var97] != null) {
                        field402[var97].field831 = -1;
                    }
                }
                for (int var98 = 0; var98 < field316.length; var98++) {
                    if (field316[var98] != null) {
                        field316[var98].field831 = -1;
                    }
                }
                field325 = -1;
                return true;
            }
            if (field325 == 74) {
                for (int var99 = 0; var99 < Statics.field1156; var99++) {
                    class53 var100 = Statics.method2235(var99);
                    if (var100 != null) {
                        class176.field2890[var99] = 0;
                        class176.field2892[var99] = 0;
                    }
                }
                method1197();
                field444 += 32;
                field325 = -1;
                return true;
            }
            if (field325 == 248) {
                field528 = true;
                Statics.field1009 = field448.method2457();
                Statics.field781 = field448.method2457();
                Statics.field63 = field448.method2415();
                Statics.field868 = field448.method2457();
                Statics.field590 = field448.method2457();
                if (Statics.field590 >= 100) {
                    int var101 = Statics.field1009 * 128 + 64;
                    int var102 = Statics.field781 * 128 + 64;
                    int var103 = method819(var101, var102, Statics.field2179) - Statics.field63;
                    int var104 = var101 - Statics.field186;
                    int var105 = var103 - Statics.field1095;
                    int var106 = var102 - Statics.field967;
                    int var107 = (int) Math.sqrt((double) (var104 * var104 + var106 * var106));
                    Statics.field2302 = (int) (Math.atan2((double) var105, (double) var107) * 325.949D) & 0x7FF;
                    Statics.field2174 = (int) (Math.atan2((double) var104, (double) var106) * -325.949D) & 0x7FF;
                    if (Statics.field2302 < 128) {
                        Statics.field2302 = 128;
                    }
                    if (Statics.field2302 > 383) {
                        Statics.field2302 = 383;
                    }
                }
                field325 = -1;
                return true;
            }
            if (field325 == 16) {
                String var108 = field448.method2309();
                int var109 = field448.method2415();
                byte var110 = field448.method2423();
                boolean var111 = false;
                if (var110 == -128) {
                    var111 = true;
                }
                if (var111) {
                    if (Statics.field2250 == 0) {
                        field325 = -1;
                        return true;
                    }
                    boolean var112 = false;
                    int var113;
                    for (var113 = 0; var113 < Statics.field2250 && (!Statics.field76[var113].field619.equals(var108) || Statics.field76[var113].field617 != var109); var113++) {
                    }
                    if (var113 < Statics.field2250) {
                        while (var113 < Statics.field2250 - 1) {
                            Statics.field76[var113] = Statics.field76[var113 + 1];
                            var113++;
                        }
                        Statics.field2250--;
                        Statics.field76[Statics.field2250] = null;
                    }
                } else {
                    field448.method2309();
                    class25 var114 = new class25();
                    var114.field619 = var108;
                    var114.field610 = class164.method535(var114.field619, Statics.field2027);
                    var114.field617 = var109;
                    var114.field612 = var110;
                    int var115;
                    for (var115 = Statics.field2250 - 1; var115 >= 0; var115--) {
                        int var116 = Statics.field76[var115].field610.compareTo(var114.field610);
                        if (var116 == 0) {
                            Statics.field76[var115].field617 = var109;
                            Statics.field76[var115].field612 = var110;
                            if (var108.equals(Statics.field859.field37)) {
                                Statics.field762 = var110;
                            }
                            field395 = field516;
                            field325 = -1;
                            return true;
                        }
                        if (var116 < 0) {
                            break;
                        }
                    }
                    if (Statics.field2250 >= Statics.field76.length) {
                        field325 = -1;
                        return true;
                    }
                    for (int var117 = Statics.field2250 - 1; var117 > var115; var117--) {
                        Statics.field76[var117 + 1] = Statics.field76[var117];
                    }
                    if (Statics.field2250 == 0) {
                        Statics.field76 = new class25[100];
                    }
                    Statics.field76[var115 + 1] = var114;
                    Statics.field2250++;
                    if (var108.equals(Statics.field859.field37)) {
                        Statics.field762 = var110;
                    }
                }
                field395 = field516;
                field325 = -1;
                return true;
            }
            if (field325 == 217) {
                while (field448.field1986 < field324) {
                    boolean var118 = field448.method2457() == 1;
                    String var119 = field448.method2309();
                    String var120 = field448.method2309();
                    int var121 = field448.method2415();
                    int var122 = field448.method2457();
                    int var123 = field448.method2457();
                    boolean var124 = (var123 & 0x2) != 0;
                    boolean var125 = (var123 & 0x1) != 0;
                    if (var121 > 0) {
                        field448.method2309();
                        field448.method2457();
                        field448.method2306();
                    }
                    field448.method2309();
                    for (int var126 = 0; var126 < field547; var126++) {
                        class18 var127 = field549[var126];
                        if (var118) {
                            if (var120.equals(var127.field253)) {
                                var127.field253 = var119;
                                var127.field243 = var120;
                                var119 = null;
                                break;
                            }
                        } else if (var119.equals(var127.field253)) {
                            if (var127.field247 != var121) {
                                boolean var128 = true;
                                for (class39 var129 = (class39) field550.method3454(); var129 != null; var129 = (class39) field550.method3455()) {
                                    if (var129.field863.equals(var119)) {
                                        if (var121 != 0 && var129.field864 == 0) {
                                            var129.method3578();
                                            var128 = false;
                                        } else if (var121 == 0 && var129.field864 != 0) {
                                            var129.method3578();
                                            var128 = false;
                                        }
                                    }
                                }
                                if (var128) {
                                    field550.method3459(new class39(var119, var121));
                                }
                                var127.field247 = var121;
                            }
                            var127.field243 = var120;
                            var127.field245 = var122;
                            var127.field251 = var124;
                            var127.field246 = var125;
                            var119 = null;
                            break;
                        }
                    }
                    if (var119 != null && field547 < 400) {
                        class18 var130 = new class18();
                        field549[field547] = var130;
                        var130.field253 = var119;
                        var130.field243 = var120;
                        var130.field247 = var121;
                        var130.field245 = var122;
                        var130.field251 = var124;
                        var130.field246 = var125;
                        field547++;
                    }
                }
                field548 = 2;
                field490 = field516;
                boolean var131 = false;
                int var132 = field547;
                while (var132 > 0) {
                    boolean var133 = true;
                    var132--;
                    for (int var134 = 0; var134 < var132; var134++) {
                        boolean var135 = false;
                        class18 var136 = field549[var134];
                        class18 var137 = field549[var134 + 1];
                        if (field524 != var136.field247 && field524 == var137.field247) {
                            var135 = true;
                        }
                        if (!var135 && var136.field247 == 0 && var137.field247 != 0) {
                            var135 = true;
                        }
                        if (!var135 && !var136.field251 && var137.field251) {
                            var135 = true;
                        }
                        if (!var135 && !var136.field246 && var137.field246) {
                            var135 = true;
                        }
                        if (var135) {
                            class18 var138 = field549[var134];
                            field549[var134] = field549[var134 + 1];
                            field549[var134 + 1] = var138;
                            var133 = false;
                        }
                    }
                    if (var133) {
                        break;
                    }
                }
                field325 = -1;
                return true;
            }
            if (field325 == 138) {
                method2089(false);
                field325 = -1;
                return true;
            }
            if (field325 == 227) {
                method135(true);
                field448.method2546();
                int var139 = field448.method2415();
                class33.method2592(field448, var139);
                field325 = -1;
                return true;
            }
            if (field325 == 162) {
                for (int var140 = 0; var140 < class176.field2892.length; var140++) {
                    if (class176.field2892[var140] != class176.field2890[var140]) {
                        class176.field2892[var140] = class176.field2890[var140];
                        method2179(var140);
                        field531[++field444 - 1 & 0x1F] = var140;
                    }
                }
                field325 = -1;
                return true;
            }
            if (field325 == 82) {
                Statics.field132 = field448.method2329();
                Statics.field212 = field448.method2457();
                field325 = -1;
                return true;
            }
            if (field325 == 106) {
                Statics.field212 = field448.method2327();
                Statics.field132 = field448.method2329();
                while (field448.field1986 < field324) {
                    field325 = field448.method2457();
                    method2602();
                }
                field325 = -1;
                return true;
            }
            if (field325 == 23) {
                int var141 = field448.method2344();
                int var142 = field448.method2343();
                int var143 = field448.method2415();
                if (var143 == 65535) {
                    var143 = -1;
                }
                class173 var144 = class173.method899(var142);
                if (var144.field2861) {
                    var144.field2867 = var143;
                    var144.field2863 = var141;
                    class52 var146 = class52.method10(var143);
                    var144.field2862 = var146.field1100;
                    var144.field2794 = var146.field1118;
                    var144.field2795 = var146.field1119;
                    var144.field2791 = var146.field1120;
                    var144.field2750 = var146.field1121;
                    var144.field2734 = var146.field1116;
                    if (var146.field1122 == 1) {
                        var144.field2751 = 1;
                    } else {
                        var144.field2751 = 2;
                    }
                    if (var144.field2780 > 0) {
                        var144.field2734 = var144.field2734 * 32 / var144.field2780;
                    } else if (var144.field2755 > 0) {
                        var144.field2734 = var144.field2734 * 32 / var144.field2755;
                    }
                    method2240(var144);
                } else if (var143 == -1) {
                    var144.field2785 = 0;
                    field325 = -1;
                    return true;
                } else {
                    class52 var145 = class52.method10(var143);
                    var144.field2785 = 4;
                    var144.field2786 = var143;
                    var144.field2862 = var145.field1100;
                    var144.field2794 = var145.field1118;
                    var144.field2734 = var145.field1116 * 100 / var141;
                    method2240(var144);
                }
                field325 = -1;
                return true;
            }
            if (field325 == 15) {
                field448.field1986 += 28;
                if (field448.method2323()) {
                    class149.method2095(field448, field448.field1986 - 28);
                }
                field325 = -1;
                return true;
            }
            if (field325 == 81) {
                while (field448.field1986 < field324) {
                    int var147 = field448.method2457();
                    boolean var148 = (var147 & 0x1) == 1;
                    String var149 = field448.method2309();
                    String var150 = field448.method2309();
                    field448.method2309();
                    for (int var151 = 0; var151 < field322; var151++) {
                        class8 var152 = field476[var151];
                        if (var148) {
                            if (var150.equals(var152.field137)) {
                                var152.field137 = var149;
                                var152.field133 = var150;
                                var149 = null;
                                break;
                            }
                        } else if (var149.equals(var152.field137)) {
                            var152.field137 = var149;
                            var152.field133 = var150;
                            var149 = null;
                            break;
                        }
                    }
                    if (var149 != null && field322 < 400) {
                        class8 var153 = new class8();
                        field476[field322] = var153;
                        var153.field137 = var149;
                        var153.field133 = var150;
                        field322++;
                    }
                }
                field490 = field516;
                field325 = -1;
                return true;
            }
            if (field325 == 249) {
                int var154 = field448.method2415();
                int var155 = field448.method2457();
                int var156 = field448.method2415();
                method1503(var154, var155, var156);
                field325 = -1;
                return true;
            }
            if (field325 == 187) {
                int var157 = field448.method2306();
                int var158 = field448.method2335();
                int var159 = var158 >> 10 & 0x1F;
                int var160 = var158 >> 5 & 0x1F;
                int var161 = var158 & 0x1F;
                int var162 = (var161 << 3) + (var159 << 19) + (var160 << 11);
                class173 var163 = class173.method899(var157);
                if (var163.field2769 != var162) {
                    var163.field2769 = var162;
                    method2240(var163);
                }
                field325 = -1;
                return true;
            }
            if (field325 == 168) {
                field483 = field448.method2457();
                if (field483 == 255) {
                    field483 = 0;
                }
                field514 = field448.method2457();
                if (field514 == 255) {
                    field514 = 0;
                }
                field325 = -1;
                return true;
            }
            if (field325 == 134) {
                field497 = field448.method2457();
                field498 = field448.method2457();
                field325 = -1;
                return true;
            }
            if (field325 == 177) {
                int var164 = field448.method2344();
                int var165 = field448.method2430();
                int var166 = field448.method2338();
                class173 var167 = class173.method899(var164);
                if (var167.field2753 != var166 || var167.field2754 != var165 || var167.field2747 != 0 || var167.field2843 != 0) {
                    var167.field2753 = var166;
                    var167.field2754 = var165;
                    var167.field2747 = 0;
                    var167.field2843 = 0;
                    method2240(var167);
                    method152(var167);
                    if (var167.field2746 == 0) {
                        method3094(Statics.field2802[var164 >> 16], var167, false);
                    }
                }
                field325 = -1;
                return true;
            }
            if (field325 == 213) {
                int var168 = field448.method2457();
                int var169 = field448.method2457();
                int var170 = field448.method2457();
                int var171 = field448.method2457();
                field529[var168] = true;
                field478[var168] = var169;
                field376[var168] = var170;
                field532[var168] = var171;
                field440[var168] = 0;
                field325 = -1;
                return true;
            }
            if (field325 == 185) {
                String var172 = field448.method2309();
                String var173 = class223.method3717(class163.method2895(class222.method1130(field448)));
                class12.method2763(6, var172, var173);
                field325 = -1;
                return true;
            }
            if (field325 == 196) {
                field297 = field448.method2415() * 30;
                field386 = field516;
                field325 = -1;
                return true;
            }
            if (field325 == 123) {
                method1197();
                field445 = field448.method2494();
                field386 = field516;
                field325 = -1;
                return true;
            }
            if (field325 == 226) {
                int var174 = field448.method2335();
                if (var174 == 65535) {
                    var174 = -1;
                }
                int var175 = field448.method2344();
                int var176 = field448.method2415();
                if (var176 == 65535) {
                    var176 = -1;
                }
                int var177 = field448.method2379();
                for (int var178 = var176; var178 <= var174; var178++) {
                    long var179 = ((long) var175 << 32) + (long) var178;
                    class208 var181 = field447.method3462(var179);
                    if (var181 != null) {
                        var181.method3583();
                    }
                    field447.method3470(new class201(var177), var179);
                }
                field325 = -1;
                return true;
            }
            if (field325 == 247) {
                int var182 = field448.method2335();
                int var183 = field448.method2335();
                int var184 = field448.method2379();
                class173 var185 = class173.method899(var184);
                var185.field2798 = (var183 << 16) + var182;
                field325 = -1;
                return true;
            }
            if (field325 == 149) {
                int var186 = field448.method2301();
                boolean var187 = field448.method2457() == 1;
                String var188 = "";
                boolean var189 = false;
                if (var187) {
                    var188 = field448.method2309();
                    if (method2936(var188)) {
                        var189 = true;
                    }
                }
                String var190 = field448.method2309();
                if (!var189) {
                    class12.method2763(var186, var188, var190);
                }
                field325 = -1;
                return true;
            }
            if (field325 == 117) {
                boolean var191 = field448.method2457() == 1;
                if (var191) {
                    Statics.field385 = class115.method82() - field448.method2307();
                    Statics.field233 = new class221(field448, true);
                } else {
                    Statics.field233 = null;
                }
                field482 = field516;
                field325 = -1;
                return true;
            }
            if (field325 == 30) {
                int var192 = field448.method2337();
                int var193 = field448.method2343();
                class173 var194 = class173.method899(var193);
                if (var194.field2789 != var192 || var192 == -1) {
                    var194.field2789 = var192;
                    var194.field2864 = 0;
                    var194.field2865 = 0;
                    method2240(var194);
                }
                field325 = -1;
                return true;
            }
            if (field325 == 164) {
                field548 = 1;
                field490 = field516;
                field325 = -1;
                return true;
            }
            if (field325 == 92) {
                String var195 = field448.method2309();
                int var196 = field448.method2344();
                class173 var197 = class173.method899(var196);
                if (!var195.equals(var197.field2741)) {
                    var197.field2741 = var195;
                    method2240(var197);
                }
                field325 = -1;
                return true;
            }
            if (field325 == 160) {
                int var198 = field448.method2335();
                field439 = var198;
                int var199 = field439;
                int var200 = Statics.field2056;
                int var201 = Statics.field2096;
                if (Statics.method2098(var199)) {
                    method1887(Statics.field2802[var199], -1, var200, var201, false);
                }
                method3095(var198);
                class37.method176(field439);
                for (int var202 = 0; var202 < 100; var202++) {
                    field428[var202] = true;
                }
                field325 = -1;
                return true;
            }
            if (field325 == 132) {
                Statics.field1052 = class130.method2624(field448.method2457());
                field325 = -1;
                return true;
            }
            if (field325 == 42) {
                int var203 = field448.method2306();
                class4 var204 = (class4) field519.method3462((long) var203);
                if (var204 != null) {
                    method683(var204, true);
                }
                if (field443 != null) {
                    method2240(field443);
                    field443 = null;
                }
                field325 = -1;
                return true;
            }
            if (field325 == 165) {
                int var205 = field448.method2335();
                if (var205 == 65535) {
                    var205 = -1;
                }
                if (var205 == -1 && !field489) {
                    Statics.field2943.method3302();
                    class183.field2944 = 1;
                    Statics.field2945 = null;
                } else if (var205 != -1 && field518 != var205 && field517 != 0 && !field489) {
                    class168 var206 = Statics.field1608;
                    int var207 = field517;
                    class183.field2944 = 1;
                    Statics.field2945 = var206;
                    Statics.field1767 = var205;
                    Statics.field2942 = 0;
                    Statics.field2727 = var207;
                    Statics.field2946 = false;
                    Statics.field2632 = 2;
                }
                field518 = var205;
                field325 = -1;
                return true;
            }
            if (field325 == 48) {
                int var208 = field448.method2305();
                int var209 = field448.method2335();
                if (var209 == 65535) {
                    var209 = -1;
                }
                if (field517 != 0 && var209 != -1) {
                    class183.method96(Statics.field2977, var209, 0, field517, false);
                    field489 = true;
                }
                field325 = -1;
                return true;
            }
            if (field325 == 254) {
                method1197();
                int var210 = field448.method2457();
                int var211 = field448.method2457();
                int var212 = field448.method2343();
                field418[var211] = var212;
                field416[var211] = var210;
                field417[var211] = 1;
                for (int var213 = 0; var213 < 98; var213++) {
                    if (var212 >= class155.field2291[var213]) {
                        field417[var211] = var213 + 2;
                    }
                }
                field469[++field305 - 1 & 0x1F] = var211;
                field325 = -1;
                return true;
            }
            if (field325 == 194) {
                int var214 = field448.method2306();
                int var215 = field448.method2415();
                if (var214 < -70000) {
                    var215 += 32768;
                }
                class173 var216;
                if (var214 >= 0) {
                    var216 = class173.method899(var214);
                } else {
                    var216 = null;
                }
                while (field448.field1986 < field324) {
                    int var217 = field448.method2301();
                    int var218 = field448.method2415();
                    int var219 = 0;
                    if (var218 != 0) {
                        var219 = field448.method2457();
                        if (var219 == 255) {
                            var219 = field448.method2306();
                        }
                    }
                    if (var216 != null && var217 >= 0 && var217 < var216.field2816.length) {
                        var216.field2816[var217] = var218;
                        var216.field2736[var217] = var219;
                    }
                    class16.method1970(var215, var217, var218 - 1, var219);
                }
                if (var216 != null) {
                    method2240(var216);
                }
                method1197();
                field467[++field289 - 1 & 0x1F] = var215 & 0x7FFF;
                field325 = -1;
                return true;
            }
            if (field325 == 255) {
                if (field439 != -1) {
                    int var220 = field439;
                    if (Statics.method2098(var220)) {
                        method3182(Statics.field2802[var220], 0);
                    }
                }
                field325 = -1;
                return true;
            }
            if (field325 == 57) {
                int var221 = field448.method2306();
                class173 var222 = class173.method899(var221);
                var222.field2785 = 3;
                var222.field2786 = Statics.field859.field53.method3188();
                method2240(var222);
                field325 = -1;
                return true;
            }
            if (field325 == 18) {
                byte var223 = field448.method2330();
                int var224 = field448.method2334();
                class176.field2890[var224] = var223;
                if (class176.field2892[var224] != var223) {
                    class176.field2892[var224] = var223;
                    method2179(var224);
                }
                field531[++field444 - 1 & 0x1F] = var224;
                field325 = -1;
                return true;
            }
            if (field325 == 152) {
                Statics.field212 = field448.method2457();
                Statics.field132 = field448.method2457();
                for (int var225 = Statics.field132; var225 < Statics.field132 + 8; var225++) {
                    for (int var226 = Statics.field212; var226 < Statics.field212 + 8; var226++) {
                        if (field412[Statics.field2179][var225][var226] != null) {
                            field412[Statics.field2179][var225][var226] = null;
                            method569(var225, var226);
                        }
                    }
                }
                for (class17 var227 = (class17) field522.method3502(); var227 != null; var227 = (class17) field522.method3489()) {
                    if (var227.field223 >= Statics.field132 && var227.field223 < Statics.field132 + 8 && var227.field224 >= Statics.field212 && var227.field224 < Statics.field212 + 8 && Statics.field2179 == var227.field240) {
                        var227.field238 = 0;
                    }
                }
                field325 = -1;
                return true;
            }
            if (field325 == 124) {
                field528 = false;
                for (int var228 = 0; var228 < 5; var228++) {
                    field529[var228] = false;
                }
                field325 = -1;
                return true;
            }
            if (field325 == 40) {
                field395 = field516;
                if (field324 == 0) {
                    field506 = null;
                    field507 = null;
                    Statics.field2250 = 0;
                    Statics.field76 = null;
                    field325 = -1;
                    return true;
                }
                field507 = field448.method2309();
                long var229 = field448.method2307();
                field506 = class162.method1052(var229);
                Statics.field2049 = field448.method2423();
                int var231 = field448.method2457();
                if (var231 == 255) {
                    field325 = -1;
                    return true;
                }
                Statics.field2250 = var231;
                class25[] var232 = new class25[100];
                for (int var233 = 0; var233 < Statics.field2250; var233++) {
                    var232[var233] = new class25();
                    var232[var233].field619 = field448.method2309();
                    var232[var233].field610 = class164.method535(var232[var233].field619, Statics.field2027);
                    var232[var233].field617 = field448.method2415();
                    var232[var233].field612 = field448.method2423();
                    field448.method2309();
                    if (var232[var233].field619.equals(Statics.field859.field37)) {
                        Statics.field762 = var232[var233].field612;
                    }
                }
                boolean var234 = false;
                int var235 = Statics.field2250;
                while (var235 > 0) {
                    boolean var236 = true;
                    var235--;
                    for (int var237 = 0; var237 < var235; var237++) {
                        if (var232[var237].field610.compareTo(var232[var237 + 1].field610) > 0) {
                            class25 var238 = var232[var237];
                            var232[var237] = var232[var237 + 1];
                            var232[var237 + 1] = var238;
                            var236 = false;
                        }
                    }
                    if (var236) {
                        break;
                    }
                }
                Statics.field76 = var232;
                field325 = -1;
                return true;
            }
            if (field325 == 172) {
                int var239 = field448.method2334();
                int var240 = field448.method2344();
                class176.field2890[var239] = var240;
                if (class176.field2892[var239] != var240) {
                    class176.field2892[var239] = var240;
                    method2179(var239);
                }
                field531[++field444 - 1 & 0x1F] = var239;
                field325 = -1;
                return true;
            }
            if (field325 == 238) {
                String var241 = field448.method2309();
                long var242 = (long) field448.method2415();
                long var244 = (long) field448.method2305();
                class152[] var246 = new class152[] { class152.field2263, class152.field2261, class152.field2260, class152.field2259, class152.field2258 };
                class152 var247 = (class152) class109.method2221(var246, field448.method2457());
                long var248 = (var242 << 32) + var244;
                boolean var250 = false;
                for (int var251 = 0; var251 < 100; var251++) {
                    if (field472[var251] == var248) {
                        var250 = true;
                        break;
                    }
                }
                if (method2936(var241)) {
                    var250 = true;
                }
                if (!var250 && field560 == 0) {
                    field472[field501] = var248;
                    field501 = (field501 + 1) % 100;
                    String var252 = class223.method3717(class163.method2895(class222.method1130(field448)));
                    byte var253;
                    if (var247.field2265) {
                        var253 = 7;
                    } else {
                        var253 = 3;
                    }
                    if (var247.field2264 == -1) {
                        class12.method2763(var253, var241, var252);
                    } else {
                        int var255 = var247.field2264;
                        String var256 = "<img=" + var255 + ">";
                        class12.method2763(var253, var256 + var241, var252);
                    }
                }
                field325 = -1;
                return true;
            }
            if (field325 == 4) {
                int var257 = field448.method2306();
                Statics.field1093 = Statics.field606.method2683(var257);
                field325 = -1;
                return true;
            }
            if (field325 == 8) {
                int var258 = field448.method2457();
                if (field448.method2457() == 0) {
                    field396[var258] = new class220();
                    field448.field1986 += 18;
                } else {
                    field448.field1986--;
                    field396[var258] = new class220(field448, false);
                }
                field474 = field516;
                field325 = -1;
                return true;
            }
            if (field325 == 220) {
                int var259 = field448.method2335();
                int var260 = field448.method2343();
                int var261 = field448.method2334();
                int var262 = field448.method2335();
                class173 var263 = class173.method899(var260);
                if (var263.field2862 != var262 || var263.field2794 != var259 || var263.field2734 != var261) {
                    var263.field2862 = var262;
                    var263.field2794 = var259;
                    var263.field2734 = var261;
                    method2240(var263);
                }
                field325 = -1;
                return true;
            }
            if (field325 == 54) {
                class33.field739 = 0;
                for (int var264 = 0; var264 < 2048; var264++) {
                    class33.field735[var264] = null;
                    class33.field737[var264] = 1;
                }
                for (int var265 = 0; var265 < 2048; var265++) {
                    field402[var265] = null;
                }
                class33.method132(field448);
                field325 = -1;
                return true;
            }
            if (field325 == 3) {
                field530 = field448.method2457();
                field325 = -1;
                return true;
            }
            if (field325 == 167) {
                int var266 = field448.method2344();
                int var267 = field448.method2343();
                class4 var268 = (class4) field519.method3462((long) var267);
                class4 var269 = (class4) field519.method3462((long) var266);
                if (var269 != null) {
                    method683(var269, var268 == null || var268.field65 != var269.field65);
                }
                if (var268 != null) {
                    var268.method3583();
                    field519.method3470(var268, (long) var266);
                }
                class173 var270 = class173.method899(var267);
                if (var270 != null) {
                    method2240(var270);
                }
                class173 var271 = class173.method899(var266);
                if (var271 != null) {
                    method2240(var271);
                    method3094(Statics.field2802[var271.field2783 >>> 16], var271, true);
                }
                if (field439 != -1) {
                    int var272 = field439;
                    if (Statics.method2098(var272)) {
                        method3182(Statics.field2802[var272], 1);
                    }
                }
                field325 = -1;
                return true;
            }
            if (field325 == 97 || field325 == 146 || field325 == 155 || field325 == 9 || field325 == 43 || field325 == 100 || field325 == 158 || field325 == 60 || field325 == 224 || field325 == 26) {
                method2602();
                field325 = -1;
                return true;
            }
            if (field325 == 176) {
                int var273 = field448.method2343();
                int var274 = field448.method2336();
                class173 var275 = class173.method899(var273);
                if (var275.field2785 != 1 || var275.field2786 != var274) {
                    var275.field2785 = 1;
                    var275.field2786 = var274;
                    method2240(var275);
                }
                field325 = -1;
                return true;
            }
            if (field325 == 79) {
                String var276 = field448.method2309();
                long var277 = field448.method2307();
                long var279 = (long) field448.method2415();
                long var281 = (long) field448.method2305();
                class152[] var283 = new class152[] { class152.field2263, class152.field2261, class152.field2260, class152.field2259, class152.field2258 };
                class152 var284 = (class152) class109.method2221(var283, field448.method2457());
                long var285 = (var279 << 32) + var281;
                boolean var287 = false;
                for (int var288 = 0; var288 < 100; var288++) {
                    if (field472[var288] == var285) {
                        var287 = true;
                        break;
                    }
                }
                if (var284.field2266 && method2936(var276)) {
                    var287 = true;
                }
                if (!var287 && field560 == 0) {
                    field472[field501] = var285;
                    field501 = (field501 + 1) % 100;
                    String var289 = class223.method3717(class163.method2895(class222.method1130(field448)));
                    if (var284.field2264 == -1) {
                        class12.method816(9, var276, var289, class162.method1995(var277));
                    } else {
                        int var290 = var284.field2264;
                        String var291 = "<img=" + var290 + ">";
                        class12.method816(9, var291 + var276, var289, class162.method1995(var277));
                    }
                }
                field325 = -1;
                return true;
            }
            if (field325 == 53) {
                int var292 = field448.method2328();
                String var293 = field448.method2309();
                int var294 = field448.method2328();
                if (var294 >= 1 && var294 <= 8) {
                    if (var293.equalsIgnoreCase("null")) {
                        var293 = null;
                    }
                    field408[var294 - 1] = var293;
                    field409[var294 - 1] = var292 == 0;
                }
                field325 = -1;
                return true;
            }
            if (field325 == 181) {
                int var295 = field448.method2327();
                int var296 = field448.method2379();
                int var297 = field448.method2336();
                class4 var298 = (class4) field519.method3462((long) var296);
                if (var298 != null) {
                    method683(var298, var298.field65 != var297);
                }
                class4 var299 = new class4();
                var299.field65 = var297;
                var299.field58 = var295;
                field519.method3470(var299, (long) var296);
                method3095(var297);
                class173 var300 = class173.method899(var296);
                method2240(var300);
                if (field443 != null) {
                    method2240(field443);
                    field443 = null;
                }
                method975();
                method3094(Statics.field2802[var296 >> 16], var300, false);
                class37.method176(var297);
                if (field439 != -1) {
                    int var301 = field439;
                    if (Statics.method2098(var301)) {
                        method3182(Statics.field2802[var301], 1);
                    }
                }
                field325 = -1;
                return true;
            }
            class148.method623("" + field325 + class2.field19 + field329 + class2.field19 + field330 + class2.field19 + field324, (Throwable) null);
            method2544();
        } catch (IOException var312) {
            method2897();
        } catch (Exception var313) {
            String var304 = "" + field325 + class2.field19 + field329 + class2.field19 + field330 + class2.field19 + field324 + class2.field19 + (Statics.field86 + Statics.field859.field854[0]) + class2.field19 + (Statics.field2893 + Statics.field859.field855[0]) + class2.field19;
            for (int var305 = 0; var305 < field324 && var305 < 50; var305++) {
                var304 = var304 + field448.field1987[var305] + class2.field19;
            }
            class148.method623(var304, var313);
            method2544();
        }
        return true;
    }

    @ObfuscatedName("ds.bw(I)V")
    public static final void method2602() {
        if (field325 == 146) {
            int var0 = field448.method2457();
            int var1 = (var0 >> 4 & 0x7) + Statics.field132;
            int var2 = (var0 & 0x7) + Statics.field212;
            int var3 = field448.method2415();
            int var4 = field448.method2415();
            int var5 = field448.method2415();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class199 var6 = field412[Statics.field2179][var1][var2];
                if (var6 != null) {
                    for (class29 var7 = (class29) var6.method3502(); var7 != null; var7 = (class29) var6.method3489()) {
                        if ((var3 & 0x7FFF) == var7.field664 && var7.field662 == var4) {
                            var7.field662 = var5;
                            break;
                        }
                    }
                    method569(var1, var2);
                }
            }
        } else if (field325 == 100) {
            int var8 = field448.method2334();
            int var9 = field448.method2329();
            int var10 = (var9 >> 4 & 0x7) + Statics.field132;
            int var11 = (var9 & 0x7) + Statics.field212;
            if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104) {
                class199 var12 = field412[Statics.field2179][var10][var11];
                if (var12 != null) {
                    for (class29 var13 = (class29) var12.method3502(); var13 != null; var13 = (class29) var12.method3489()) {
                        if ((var8 & 0x7FFF) == var13.field664) {
                            var13.method3583();
                            break;
                        }
                    }
                    if (var12.method3502() == null) {
                        field412[Statics.field2179][var10][var11] = null;
                    }
                    method569(var10, var11);
                }
            }
        } else if (field325 == 158) {
            int var14 = field448.method2334();
            int var15 = field448.method2327();
            int var16 = (var15 >> 4 & 0x7) + Statics.field132;
            int var17 = (var15 & 0x7) + Statics.field212;
            int var18 = field448.method2335();
            if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                class29 var19 = new class29();
                var19.field664 = var18;
                var19.field662 = var14;
                if (field412[Statics.field2179][var16][var17] == null) {
                    field412[Statics.field2179][var16][var17] = new class199();
                }
                field412[Statics.field2179][var16][var17].method3491(var19);
                method569(var16, var17);
            }
        } else if (field325 == 26) {
            int var20 = field448.method2329();
            int var21 = (var20 >> 4 & 0x7) + Statics.field132;
            int var22 = (var20 & 0x7) + Statics.field212;
            int var23 = field448.method2328();
            int var24 = var23 >> 2;
            int var25 = var23 & 0x3;
            int var26 = field452[var24];
            int var27 = field448.method2415();
            if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104) {
                method2893(Statics.field2179, var21, var22, var26, var27, var24, var25, 0, -1);
            }
        } else {
            if (field325 == 155) {
                int var28 = field448.method2328();
                int var29 = (var28 >> 4 & 0x7) + Statics.field132;
                int var30 = (var28 & 0x7) + Statics.field212;
                int var31 = field448.method2335();
                byte var32 = field448.method2330();
                byte var33 = field448.method2330();
                byte var34 = field448.method2423();
                int var35 = field448.method2335();
                int var36 = field448.method2415();
                int var37 = field448.method2327();
                int var38 = var37 >> 2;
                int var39 = var37 & 0x3;
                int var40 = field452[var38];
                int var41 = field448.method2336();
                byte var42 = field448.method2423();
                class3 var43;
                if (field278 == var36) {
                    var43 = Statics.field859;
                } else {
                    var43 = field402[var36];
                }
                if (var43 != null) {
                    class41 var44 = class41.method3664(var41);
                    int var45;
                    int var46;
                    if (var39 == 1 || var39 == 3) {
                        var45 = var44.field929;
                        var46 = var44.field928;
                    } else {
                        var45 = var44.field928;
                        var46 = var44.field929;
                    }
                    int var47 = (var45 >> 1) + var29;
                    int var48 = (var45 + 1 >> 1) + var29;
                    int var49 = (var46 >> 1) + var30;
                    int var50 = (var46 + 1 >> 1) + var30;
                    int[][] var51 = class6.field98[Statics.field2179];
                    int var52 = var51[var47][var49] + var51[var48][var49] + var51[var47][var50] + var51[var48][var50] >> 2;
                    int var53 = (var29 << 7) + (var45 << 6);
                    int var54 = (var30 << 7) + (var46 << 6);
                    class105 var55 = var44.method767(var38, var39, var51, var53, var52, var54);
                    if (var55 != null) {
                        method2893(Statics.field2179, var29, var30, var40, -1, 0, 0, var35 + 1, var31 + 1);
                        var43.field39 = field290 + var35;
                        var43.field51 = field290 + var31;
                        var43.field44 = var55;
                        var43.field41 = var29 * 128 + var45 * 64;
                        var43.field43 = var30 * 128 + var46 * 64;
                        var43.field42 = var52;
                        if (var33 > var42) {
                            byte var56 = var33;
                            var33 = var42;
                            var42 = var56;
                        }
                        if (var34 > var32) {
                            byte var57 = var34;
                            var34 = var32;
                            var32 = var57;
                        }
                        var43.field45 = var29 + var33;
                        var43.field48 = var29 + var42;
                        var43.field46 = var30 + var34;
                        var43.field54 = var30 + var32;
                    }
                }
            }
            if (field325 == 60) {
                int var58 = field448.method2457();
                int var59 = (var58 >> 4 & 0x7) + Statics.field132;
                int var60 = (var58 & 0x7) + Statics.field212;
                int var61 = field448.method2328();
                int var62 = var61 >> 2;
                int var63 = var61 & 0x3;
                int var64 = field452[var62];
                int var65 = field448.method2334();
                if (var59 >= 0 && var60 >= 0 && var59 < 103 && var60 < 103) {
                    if (var64 == 0) {
                        class87 var66 = Statics.field2175.method1744(Statics.field2179, var59, var60);
                        if (var66 != null) {
                            int var67 = var66.field1523 >> 14 & 0x7FFF;
                            if (var62 == 2) {
                                var66.field1521 = new class13(var67, 2, var63 + 4, Statics.field2179, var59, var60, var65, false, var66.field1521);
                                var66.field1520 = new class13(var67, 2, var63 + 1 & 0x3, Statics.field2179, var59, var60, var65, false, var66.field1520);
                            } else {
                                var66.field1521 = new class13(var67, var62, var63, Statics.field2179, var59, var60, var65, false, var66.field1521);
                            }
                        }
                    }
                    if (var64 == 1) {
                        class94 var68 = Statics.field2175.method1782(Statics.field2179, var59, var60);
                        if (var68 != null) {
                            int var69 = var68.field1596 >> 14 & 0x7FFF;
                            if (var62 == 4 || var62 == 5) {
                                var68.field1599 = new class13(var69, 4, var63, Statics.field2179, var59, var60, var65, false, var68.field1599);
                            } else if (var62 == 6) {
                                var68.field1599 = new class13(var69, 4, var63 + 4, Statics.field2179, var59, var60, var65, false, var68.field1599);
                            } else if (var62 == 7) {
                                var68.field1599 = new class13(var69, 4, (var63 + 2 & 0x3) + 4, Statics.field2179, var59, var60, var65, false, var68.field1599);
                            } else if (var62 == 8) {
                                var68.field1599 = new class13(var69, 4, var63 + 4, Statics.field2179, var59, var60, var65, false, var68.field1599);
                                var68.field1600 = new class13(var69, 4, (var63 + 2 & 0x3) + 4, Statics.field2179, var59, var60, var65, false, var68.field1600);
                            }
                        }
                    }
                    if (var64 == 2) {
                        class98 var70 = Statics.field2175.method1746(Statics.field2179, var59, var60);
                        if (var62 == 11) {
                            var62 = 10;
                        }
                        if (var70 != null) {
                            var70.field1656 = new class13(var70.field1664 >> 14 & 0x7FFF, var62, var63, Statics.field2179, var59, var60, var65, false, var70.field1656);
                        }
                    }
                    if (var64 == 3) {
                        class93 var71 = Statics.field2175.method1747(Statics.field2179, var59, var60);
                        if (var71 != null) {
                            var71.field1584 = new class13(var71.field1585 >> 14 & 0x7FFF, 22, var63, Statics.field2179, var59, var60, var65, false, var71.field1584);
                        }
                    }
                }
            } else if (field325 == 9) {
                int var72 = field448.method2457();
                int var73 = (var72 >> 4 & 0x7) + Statics.field132;
                int var74 = (var72 & 0x7) + Statics.field212;
                int var75 = field448.method2415();
                int var76 = field448.method2457();
                int var77 = field448.method2415();
                if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
                    int var78 = var73 * 128 + 64;
                    int var79 = var74 * 128 + 64;
                    class30 var80 = new class30(var75, Statics.field2179, var78, var79, method819(var78, var79, Statics.field2179) - var76, var77, field290);
                    field537.method3491(var80);
                }
            } else {
                if (field325 == 97) {
                    int var81 = field448.method2457();
                    int var82 = (var81 >> 4 & 0x7) + Statics.field132;
                    int var83 = (var81 & 0x7) + Statics.field212;
                    int var84 = field448.method2415();
                    int var85 = field448.method2457();
                    int var86 = var85 >> 4 & 0xF;
                    int var87 = var85 & 0x7;
                    int var88 = field448.method2457();
                    if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104) {
                        int var89 = var86 + 1;
                        if (Statics.field859.field854[0] >= var82 - var89 && Statics.field859.field854[0] <= var82 + var89 && Statics.field859.field855[0] >= var83 - var89 && Statics.field859.field855[0] <= var83 + var89 && field342 != 0 && var87 > 0 && field285 < 50) {
                            field523[field285] = var84;
                            field534[field285] = var87;
                            field525[field285] = var88;
                            field527[field285] = null;
                            field526[field285] = (var82 << 16) + (var83 << 8) + var86;
                            field285++;
                        }
                    }
                }
                if (field325 == 224) {
                    int var90 = field448.method2328();
                    int var91 = var90 >> 2;
                    int var92 = var90 & 0x3;
                    int var93 = field452[var91];
                    int var94 = field448.method2328();
                    int var95 = (var94 >> 4 & 0x7) + Statics.field132;
                    int var96 = (var94 & 0x7) + Statics.field212;
                    if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                        method2893(Statics.field2179, var95, var96, var93, -1, var91, var92, 0, -1);
                    }
                } else if (field325 == 43) {
                    int var97 = field448.method2457();
                    int var98 = (var97 >> 4 & 0x7) + Statics.field132;
                    int var99 = (var97 & 0x7) + Statics.field212;
                    int var100 = var98 + field448.method2423();
                    int var101 = var99 + field448.method2423();
                    int var102 = field448.method2494();
                    int var103 = field448.method2415();
                    int var104 = field448.method2457() * 4;
                    int var105 = field448.method2457() * 4;
                    int var106 = field448.method2415();
                    int var107 = field448.method2415();
                    int var108 = field448.method2457();
                    int var109 = field448.method2457();
                    if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104 && var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104 && var103 != 65535) {
                        int var110 = var98 * 128 + 64;
                        int var111 = var99 * 128 + 64;
                        int var112 = var100 * 128 + 64;
                        int var113 = var101 * 128 + 64;
                        class7 var114 = new class7(var103, Statics.field2179, var110, var111, method819(var110, var111, Statics.field2179) - var104, field290 + var106, field290 + var107, var108, var109, var102, var105);
                        var114.method97(var112, var113, method819(var112, var113, Statics.field2179) - var105, field290 + var106);
                        field414.method3491(var114);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ei.bk(IIIIIIIIII)V")
    public static final void method2893(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field522.method3502(); var10 != null; var10 = (class17) field522.method3489()) {
            if (var10.field240 == arg0 && var10.field223 == arg1 && var10.field224 == arg2 && var10.field230 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field240 = arg0;
            var9.field230 = arg3;
            var9.field223 = arg1;
            var9.field224 = arg2;
            method1157(var9);
            field522.method3491(var9);
        }
        var9.field228 = arg4;
        var9.field221 = arg5;
        var9.field229 = arg6;
        var9.field231 = arg7;
        var9.field238 = arg8;
    }

    @ObfuscatedName("client.bj(I)V")
    public static final void method458() {
        for (class17 var0 = (class17) field522.method3502(); var0 != null; var0 = (class17) field522.method3489()) {
            if (var0.field238 == -1) {
                var0.field231 = 0;
                method1157(var0);
            } else {
                var0.method3583();
            }
        }
    }

    @ObfuscatedName("bj.bd(Li;I)V")
    public static final void method1157(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field230 == 0) {
            var1 = Statics.field2175.method1748(arg0.field240, arg0.field223, arg0.field224);
        }
        if (arg0.field230 == 1) {
            var1 = Statics.field2175.method1749(arg0.field240, arg0.field223, arg0.field224);
        }
        if (arg0.field230 == 2) {
            var1 = Statics.field2175.method1750(arg0.field240, arg0.field223, arg0.field224);
        }
        if (arg0.field230 == 3) {
            var1 = Statics.field2175.method1751(arg0.field240, arg0.field223, arg0.field224);
        }
        if (var1 != 0) {
            int var5 = Statics.field2175.method1857(arg0.field240, arg0.field223, arg0.field224, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field232 = var2;
        arg0.field227 = var3;
        arg0.field225 = var4;
    }

    @ObfuscatedName("cw.bc(IIIIIIIB)V")
    public static final void method2092(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field466 && Statics.field2179 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field2175.method1748(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2175.method1749(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2175.method1750(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2175.method1751(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field2175.method1857(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2175.method1739(arg0, arg2, arg3);
                class41 var15 = class41.method3664(var12);
                if (var15.field930 != 0) {
                    field341[arg0].method2187(arg2, arg3, var13, var14, var15.field955);
                }
            }
            if (arg1 == 1) {
                Statics.field2175.method1740(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2175.method1741(arg0, arg2, arg3);
                class41 var16 = class41.method3664(var12);
                if (var16.field928 + arg2 > 103 || var16.field928 + arg3 > 103 || var16.field929 + arg2 > 103 || var16.field929 + arg3 > 103) {
                    return;
                }
                if (var16.field930 != 0) {
                    field341[arg0].method2188(arg2, arg3, var16.field928, var16.field929, var14, var16.field955);
                }
            }
            if (arg1 == 3) {
                Statics.field2175.method1783(arg0, arg2, arg3);
                class41 var17 = class41.method3664(var12);
                if (var17.field930 == 1) {
                    field341[arg0].method2190(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field79[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class86 var19 = Statics.field2175;
        class108 var20 = field341[arg0];
        class41 var21 = class41.method3664(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field929;
            var23 = var21.field928;
        } else {
            var22 = var21.field928;
            var23 = var21.field929;
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
        int[][] var28 = class6.field98[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field932 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field922 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class85 var34;
            if (var21.field937 == -1 && var21.field954 == null) {
                var34 = var21.method767(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1728(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field930 == 1) {
                var20.method2186(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class85 var57;
            if (var21.field937 == -1 && var21.field954 == null) {
                var57 = var21.method767(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            if (var57 != null) {
                var19.method1732(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field930 != 0) {
                var20.method2184(arg2, arg3, var22, var23, var21.field955);
            }
        } else if (arg6 >= 12) {
            class85 var35;
            if (var21.field937 == -1 && var21.field954 == null) {
                var35 = var21.method767(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1732(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field930 != 0) {
                var20.method2184(arg2, arg3, var22, var23, var21.field955);
            }
        } else if (arg6 == 0) {
            class85 var36;
            if (var21.field937 == -1 && var21.field954 == null) {
                var36 = var21.method767(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1781(arg0, arg2, arg3, var29, var36, (class85) null, class6.field88[arg5], 0, var32, var33);
            if (var21.field930 != 0) {
                var20.method2209(arg2, arg3, arg6, arg5, var21.field955);
            }
        } else if (arg6 == 1) {
            class85 var37;
            if (var21.field937 == -1 && var21.field954 == null) {
                var37 = var21.method767(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1781(arg0, arg2, arg3, var29, var37, (class85) null, class6.field89[arg5], 0, var32, var33);
            if (var21.field930 != 0) {
                var20.method2209(arg2, arg3, arg6, arg5, var21.field955);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class85 var39;
            class85 var40;
            if (var21.field937 == -1 && var21.field954 == null) {
                var39 = var21.method767(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method767(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field937, true, (class85) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1781(arg0, arg2, arg3, var29, var39, var40, class6.field88[arg5], class6.field88[var38], var32, var33);
            if (var21.field930 != 0) {
                var20.method2209(arg2, arg3, arg6, arg5, var21.field955);
            }
        } else if (arg6 == 3) {
            class85 var41;
            if (var21.field937 == -1 && var21.field954 == null) {
                var41 = var21.method767(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1781(arg0, arg2, arg3, var29, var41, (class85) null, class6.field89[arg5], 0, var32, var33);
            if (var21.field930 != 0) {
                var20.method2209(arg2, arg3, arg6, arg5, var21.field955);
            }
        } else if (arg6 == 9) {
            class85 var42;
            if (var21.field937 == -1 && var21.field954 == null) {
                var42 = var21.method767(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1732(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field930 != 0) {
                var20.method2184(arg2, arg3, var22, var23, var21.field955);
            }
        } else if (arg6 == 4) {
            class85 var43;
            if (var21.field937 == -1 && var21.field954 == null) {
                var43 = var21.method767(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1765(arg0, arg2, arg3, var29, var43, (class85) null, class6.field88[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1748(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class41.method3664(var45 >> 14 & 0x7FFF).field941;
            }
            class85 var46;
            if (var21.field937 == -1 && var21.field954 == null) {
                var46 = var21.method767(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1765(arg0, arg2, arg3, var29, var46, (class85) null, class6.field88[arg5], 0, class6.field90[arg5] * var44, class6.field91[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1748(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class41.method3664(var48 >> 14 & 0x7FFF).field941 / 2;
            }
            class85 var49;
            if (var21.field937 == -1 && var21.field954 == null) {
                var49 = var21.method767(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1765(arg0, arg2, arg3, var29, var49, (class85) null, 256, arg5, class6.field92[arg5] * var47, class6.field93[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class85 var51;
            if (var21.field937 == -1 && var21.field954 == null) {
                var51 = var21.method767(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1765(arg0, arg2, arg3, var29, var51, (class85) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1748(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class41.method3664(var53 >> 14 & 0x7FFF).field941 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class85 var55;
            class85 var56;
            if (var21.field937 == -1 && var21.field954 == null) {
                var55 = var21.method767(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method767(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field937, true, (class85) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1765(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field92[arg5] * var52, class6.field93[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("o.bb(III)V")
    public static final void method569(int arg0, int arg1) {
        class199 var2 = field412[Statics.field2179][arg0][arg1];
        if (var2 == null) {
            Statics.field2175.method1722(Statics.field2179, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3502(); var6 != null; var6 = (class29) var2.method3489()) {
            class52 var7 = class52.method10(var6.field664);
            long var8 = (long) var7.field1123;
            if (var7.field1122 == 1) {
                var8 = (long) (var6.field662 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field2175.method1722(Statics.field2179, arg0, arg1);
            return;
        }
        var2.method3498(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3502(); var12 != null; var12 = (class29) var2.method3489()) {
            if (var5.field664 != var12.field664) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field664 != var12.field664 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field2175.method1729(Statics.field2179, arg0, arg1, method819(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2179), var5, var13, var10, var11);
    }

    @ObfuscatedName("cw.bl(ZB)V")
    public static final void method2089(boolean arg0) {
        field400 = 0;
        field551 = 0;
        field448.method2565();
        int var1 = field448.method2550(8);
        if (var1 < field317) {
            for (int var2 = var1; var2 < field317; var2++) {
                field406[++field400 - 1] = field302[var2];
            }
        }
        if (var1 > field317) {
            throw new RuntimeException("");
        }
        field317 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field302[var3];
            class35 var5 = field316[var4];
            int var6 = field448.method2550(1);
            if (var6 == 0) {
                field302[++field317 - 1] = var4;
                var5.field848 = field290;
            } else {
                int var7 = field448.method2550(2);
                if (var7 == 0) {
                    field302[++field317 - 1] = var4;
                    var5.field848 = field290;
                    field555[++field551 - 1] = var4;
                } else if (var7 == 1) {
                    field302[++field317 - 1] = var4;
                    var5.field848 = field290;
                    int var8 = field448.method2550(3);
                    var5.method686(var8, (byte) 1);
                    int var9 = field448.method2550(1);
                    if (var9 == 1) {
                        field555[++field551 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field302[++field317 - 1] = var4;
                    var5.field848 = field290;
                    int var10 = field448.method2550(3);
                    var5.method686(var10, (byte) 2);
                    int var11 = field448.method2550(3);
                    var5.method686(var11, (byte) 2);
                    int var12 = field448.method2550(1);
                    if (var12 == 1) {
                        field555[++field551 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field406[++field400 - 1] = var4;
                }
            }
        }
        while (field448.method2554(field324) >= 27) {
            int var13 = field448.method2550(15);
            if (var13 == 32767) {
                break;
            }
            boolean var33 = false;
            if (field316[var13] == null) {
                field316[var13] = new class35();
                var33 = true;
            }
            class35 var34 = field316[var13];
            field302[++field317 - 1] = var13;
            var34.field848 = field290;
            int var35 = field448.method2550(1);
            if (var35 == 1) {
                field555[++field551 - 1] = var13;
            }
            int var36 = field448.method2550(1);
            int var37;
            if (arg0) {
                var37 = field448.method2550(8);
                if (var37 > 127) {
                    var37 -= 256;
                }
            } else {
                var37 = field448.method2550(5);
                if (var37 > 15) {
                    var37 -= 32;
                }
            }
            int var38 = field410[field448.method2550(3)];
            if (var33) {
                var34.field850 = var34.field800 = var38;
            }
            var34.field765 = class40.method2177(field448.method2550(14));
            int var39;
            if (arg0) {
                var39 = field448.method2550(8);
                if (var39 > 127) {
                    var39 -= 256;
                }
            } else {
                var39 = field448.method2550(5);
                if (var39 > 15) {
                    var39 -= 32;
                }
            }
            var34.field804 = var34.field765.field878;
            var34.field812 = var34.field765.field901;
            if (var34.field812 == 0) {
                var34.field800 = 0;
            }
            var34.field808 = var34.field765.field884;
            var34.field809 = var34.field765.field885;
            var34.field842 = var34.field765.field911;
            var34.field820 = var34.field765.field882;
            var34.field805 = var34.field765.field886;
            var34.field806 = var34.field765.field903;
            var34.field807 = var34.field765.field883;
            var34.method685(Statics.field859.field854[0] + var39, Statics.field859.field855[0] + var37, var36 == 1);
        }
        field448.method2551();
        for (int var14 = 0; var14 < field551; var14++) {
            int var15 = field555[var14];
            class35 var16 = field316[var15];
            int var17 = field448.method2457();
            if ((var17 & 0x40) != 0) {
                var16.field765 = class40.method2177(field448.method2335());
                var16.field804 = var16.field765.field878;
                var16.field812 = var16.field765.field901;
                var16.field808 = var16.field765.field884;
                var16.field809 = var16.field765.field885;
                var16.field842 = var16.field765.field911;
                var16.field820 = var16.field765.field882;
                var16.field805 = var16.field765.field886;
                var16.field806 = var16.field765.field903;
                var16.field807 = var16.field765.field883;
            }
            if ((var17 & 0x8) != 0) {
                int var18 = field448.method2327();
                int var19 = field448.method2457();
                var16.method716(var18, var19, field290);
                var16.field822 = field290 + 300;
                var16.field823 = field448.method2415();
                var16.field824 = field448.method2334();
            }
            if ((var17 & 0x1) != 0) {
                var16.field832 = field448.method2415();
                if (var16.field832 == 65535) {
                    var16.field832 = -1;
                }
            }
            if ((var17 & 0x2) != 0) {
                int var20 = field448.method2335();
                if (var20 == 65535) {
                    var20 = -1;
                }
                int var21 = field448.method2327();
                if (var16.field831 == var20 && var20 != -1) {
                    int var22 = class43.method72(var20).field992;
                    if (var22 == 1) {
                        var16.field852 = 0;
                        var16.field845 = 0;
                        var16.field833 = var21;
                        var16.field835 = 0;
                    }
                    if (var22 == 2) {
                        var16.field835 = 0;
                    }
                } else if (var20 == -1 || var16.field831 == -1 || class43.method72(var20).field986 >= class43.method72(var16.field831).field986) {
                    var16.field831 = var20;
                    var16.field852 = 0;
                    var16.field845 = 0;
                    var16.field833 = var21;
                    var16.field835 = 0;
                    var16.field858 = var16.field853;
                }
            }
            if ((var17 & 0x10) != 0) {
                var16.field829 = field448.method2415();
                int var23 = field448.method2306();
                var16.field840 = var23 >> 16;
                var16.field839 = (var23 & 0xFFFF) + field290;
                var16.field802 = 0;
                var16.field860 = 0;
                if (var16.field839 > field290) {
                    var16.field802 = -1;
                }
                if (var16.field829 == 65535) {
                    var16.field829 = -1;
                }
            }
            if ((var17 & 0x80) != 0) {
                var16.field837 = field448.method2309();
                var16.field834 = 100;
            }
            if ((var17 & 0x4) != 0) {
                int var24 = field448.method2329();
                int var25 = field448.method2329();
                var16.method716(var24, var25, field290);
                var16.field822 = field290 + 300;
                var16.field823 = field448.method2415();
                var16.field824 = field448.method2415();
            }
            if ((var17 & 0x20) != 0) {
                int var26 = field448.method2415();
                int var27 = field448.method2335();
                int var28 = var16.field826 - (var26 - Statics.field86 - Statics.field86) * 64;
                int var29 = var16.field801 - (var27 - Statics.field2893 - Statics.field2893) * 64;
                if (var28 != 0 || var29 != 0) {
                    var16.field838 = (int) (Math.atan2((double) var28, (double) var29) * 325.949D) & 0x7FF;
                }
            }
        }
        for (int var30 = 0; var30 < field400; var30++) {
            int var31 = field406[var30];
            if (field290 != field316[var31].field848) {
                field316[var31].field765 = null;
                field316[var31] = null;
            }
        }
        if (field324 != field448.field1986) {
            throw new RuntimeException(field448.field1986 + class2.field19 + field324);
        }
        for (int var32 = 0; var32 < field317; var32++) {
            if (field316[field302[var32]] == null) {
                throw new RuntimeException(var32 + class2.field19 + field317);
            }
        }
    }

    @ObfuscatedName("f.bp(I)V")
    public static final void method47() {
        int var0 = Statics.field2671;
        int var1 = Statics.field760;
        int var2 = Statics.field2021;
        int var3 = Statics.field611;
        int var4 = 6116423;
        class80.method1640(var0, var1, var2, var3, var4);
        class80.method1640(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class80.method1638(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field333.method3683(class157.field2459, var0 + 3, var1 + 14, var4, -1);
        int var5 = class140.field2152;
        int var6 = class140.field2156 * 121255813;
        for (int var7 = 0; var7 < field421; var7++) {
            int var8 = (field421 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class224 var10 = Statics.field333;
            String var11;
            if (field470[var7].length() > 0) {
                var11 = field426[var7] + class157.field2308 + field470[var7];
            } else {
                var11 = field426[var7];
            }
            var10.method3683(var11, var0 + 3, var8, var9, 0);
        }
        method113(Statics.field2671, Statics.field760, Statics.field2021, Statics.field611);
    }

    @ObfuscatedName("m.ba(IIIII)V")
    public static final void method543(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field291; var4++) {
            if (field487[var4] + field283[var4] > arg0 && field487[var4] < arg0 + arg2 && field438[var4] + field296[var4] > arg1 && field438[var4] < arg1 + arg3) {
                field428[var4] = true;
            }
        }
    }

    @ObfuscatedName("h.bm(IIIII)V")
    public static final void method113(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field291; var4++) {
            if (field487[var4] + field283[var4] > arg0 && field487[var4] < arg0 + arg2 && field438[var4] + field296[var4] > arg1 && field438[var4] < arg1 + arg3) {
                field413[var4] = true;
            }
        }
    }

    @ObfuscatedName("ck.bg(I)V")
    public static final void method1989() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field421 - 1; var1++) {
                if (field424[var1] < 1000 && field424[var1 + 1] > 1000) {
                    String var2 = field470[var1];
                    field470[var1] = field470[var1 + 1];
                    field470[var1 + 1] = var2;
                    String var3 = field426[var1];
                    field426[var1] = field426[var1 + 1];
                    field426[var1 + 1] = var3;
                    int var4 = field424[var1];
                    field424[var1] = field424[var1 + 1];
                    field424[var1 + 1] = var4;
                    int var5 = field422[var1];
                    field422[var1] = field422[var1 + 1];
                    field422[var1 + 1] = var5;
                    int var6 = field423[var1];
                    field423[var1] = field423[var1 + 1];
                    field423[var1 + 1] = var6;
                    int var7 = field563[var1];
                    field563[var1] = field563[var1 + 1];
                    field563[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
        if (Statics.field1350 != null || field277 != null) {
            return;
        }
        int var26;
        int var27;
        label222: {
            int var8 = class140.field2151;
            if (field552) {
                if (var8 != 1 && (Statics.field215 || var8 != 4)) {
                    int var9 = class140.field2152;
                    int var10 = class140.field2156 * 121255813;
                    if (var9 < Statics.field2671 - 10 || var9 > Statics.field2671 + Statics.field2021 + 10 || var10 < Statics.field760 - 10 || var10 > Statics.field760 + Statics.field611 + 10) {
                        field552 = false;
                        method543(Statics.field2671, Statics.field760, Statics.field2021, Statics.field611);
                    }
                }
                if (var8 == 1 || !Statics.field215 && var8 == 4) {
                    int var11 = Statics.field2671;
                    int var12 = Statics.field760;
                    int var13 = Statics.field2021;
                    int var14 = class140.field2154;
                    int var15 = class140.field2163;
                    int var16 = -1;
                    for (int var17 = 0; var17 < field421; var17++) {
                        int var18 = (field421 - 1 - var17) * 15 + var12 + 31;
                        if (var14 > var11 && var14 < var11 + var13 && var15 > var18 - 13 && var15 < var18 + 3) {
                            var16 = var17;
                        }
                    }
                    if (var16 != -1 && var16 >= 0) {
                        int var19 = field422[var16];
                        int var20 = field423[var16];
                        int var21 = field424[var16];
                        int var22 = field563[var16];
                        String var23 = field426[var16];
                        String var24 = field470[var16];
                        method2637(var19, var20, var21, var22, var23, var24, class140.field2154, class140.field2163);
                    }
                    field552 = false;
                    method543(Statics.field2671, Statics.field760, Statics.field2021, Statics.field611);
                }
            } else {
                if ((var8 == 1 || !Statics.field215 && var8 == 4) && field421 > 0) {
                    int var25 = field424[field421 - 1];
                    if (var25 == 39 || var25 == 40 || var25 == 41 || var25 == 42 || var25 == 43 || var25 == 33 || var25 == 34 || var25 == 35 || var25 == 36 || var25 == 37 || var25 == 38 || var25 == 1005) {
                        var26 = field422[field421 - 1];
                        var27 = field423[field421 - 1];
                        class173 var28 = class173.method899(var27);
                        int var29 = method136(var28);
                        boolean var30 = (var29 >> 28 & 0x1) != 0;
                        if (var30) {
                            break label222;
                        }
                        class178 var10000 = (class178) null;
                        if (class178.method565(method136(var28))) {
                            break label222;
                        }
                    }
                }
                if ((var8 == 1 || !Statics.field215 && var8 == 4) && (field419 == 1 && field421 > 2 || method1444(field421 - 1))) {
                    var8 = 2;
                }
                if ((var8 == 1 || !Statics.field215 && var8 == 4) && field421 > 0) {
                    int var32 = field421 - 1;
                    if (var32 >= 0) {
                        int var33 = field422[var32];
                        int var34 = field423[var32];
                        int var35 = field424[var32];
                        int var36 = field563[var32];
                        String var37 = field426[var32];
                        String var38 = field470[var32];
                        method2637(var33, var34, var35, var36, var37, var38, class140.field2154, class140.field2163);
                    }
                }
                if (var8 == 2 && field421 > 0) {
                    method2(class140.field2154, class140.field2163);
                }
            }
            return;
        }
        if (Statics.field1350 != null && !field399 && field419 != 1 && !method1444(field421 - 1) && field421 > 0) {
            method2974(field299, field397);
        }
        field399 = false;
        field521 = 0;
        if (Statics.field1350 != null) {
            method2240(Statics.field1350);
        }
        Statics.field1350 = class173.method899(var27);
        field310 = var26;
        field299 = class140.field2154;
        field397 = class140.field2163;
        if (field421 > 0) {
            int var31 = field421 - 1;
            Statics.field1029 = new class31();
            Statics.field1029.field688 = field422[var31];
            Statics.field1029.field682 = field423[var31];
            Statics.field1029.field684 = field424[var31];
            Statics.field1029.field691 = field563[var31];
            Statics.field1029.field686 = field426[var31];
        }
        method2240(Statics.field1350);
    }

    @ObfuscatedName("z.bz(III)V")
    public static final void method2(int arg0, int arg1) {
        int var2 = Statics.field333.method3724(class157.field2459);
        for (int var3 = 0; var3 < field421; var3++) {
            class224 var4 = Statics.field333;
            String var5;
            if (field470[var3].length() > 0) {
                var5 = field426[var3] + class157.field2308 + field470[var3];
            } else {
                var5 = field426[var3];
            }
            int var6 = var4.method3724(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field421 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field2056) {
            var8 = Statics.field2056 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field2096) {
            var9 = Statics.field2096 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field552 = true;
        Statics.field2671 = var8;
        Statics.field760 = var9;
        Statics.field2021 = var2;
        Statics.field611 = field421 * 15 + 22;
    }

    @ObfuscatedName("by.bt(II)Z")
    public static final boolean method1444(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field424[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("ax.bi(Lay;III)V")
    public static final void method912(class31 arg0, int arg1, int arg2) {
        method2637(arg0.field688, arg0.field682, arg0.field684, arg0.field691, arg0.field686, arg0.field686, arg1, arg2);
    }

    @ObfuscatedName("ep.bh(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method2637(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 51) {
            class3 var8 = field402[arg3];
            if (var8 != null) {
                field389 = arg6;
                field390 = arg7;
                field392 = 2;
                field381 = 0;
                field483 = arg0;
                field514 = arg1;
                field321.method2547(23);
                field321.method2362(class137.field2114[82] ? 1 : 0);
                field321.method2332(arg3);
            }
        }
        if (arg2 == 7) {
            class35 var9 = field316[arg3];
            if (var9 != null) {
                field389 = arg6;
                field390 = arg7;
                field392 = 2;
                field381 = 0;
                field483 = arg0;
                field514 = arg1;
                field321.method2547(122);
                field321.method2326(class137.field2114[82] ? 1 : 0);
                field321.method2287(Statics.field2032);
                field321.method2332(Statics.field129);
                field321.method2340(Statics.field100);
                field321.method2287(arg3);
            }
        }
        if (arg2 == 31) {
            field321.method2547(175);
            field321.method2373(Statics.field2032);
            field321.method2332(Statics.field129);
            field321.method2340(Statics.field100);
            field321.method2289(arg1);
            field321.method2373(arg0);
            field321.method2373(arg3);
            field393 = 0;
            Statics.field2024 = class173.method899(arg1);
            field394 = arg0;
        }
        if (arg2 == 49) {
            class3 var10 = field402[arg3];
            if (var10 != null) {
                field389 = arg6;
                field390 = arg7;
                field392 = 2;
                field381 = 0;
                field483 = arg0;
                field514 = arg1;
                field321.method2547(66);
                field321.method2285(class137.field2114[82] ? 1 : 0);
                field321.method2332(arg3);
            }
        }
        if (arg2 == 39) {
            field321.method2547(187);
            field321.method2373(arg3);
            field321.method2287(arg0);
            field321.method2342(arg1);
            field393 = 0;
            Statics.field2024 = class173.method899(arg1);
            field394 = arg0;
        }
        if (arg2 == 20) {
            field389 = arg6;
            field390 = arg7;
            field392 = 2;
            field381 = 0;
            field483 = arg0;
            field514 = arg1;
            field321.method2547(238);
            field321.method2333(arg3);
            field321.method2362(class137.field2114[82] ? 1 : 0);
            field321.method2333(Statics.field2893 + arg1);
            field321.method2373(Statics.field86 + arg0);
        }
        if (arg2 == 41) {
            field321.method2547(91);
            field321.method2287(arg3);
            field321.method2332(arg0);
            field321.method2340(arg1);
            field393 = 0;
            Statics.field2024 = class173.method899(arg1);
            field394 = arg0;
        }
        if (arg2 == 12) {
            class35 var11 = field316[arg3];
            if (var11 != null) {
                field389 = arg6;
                field390 = arg7;
                field392 = 2;
                field381 = 0;
                field483 = arg0;
                field514 = arg1;
                field321.method2547(174);
                field321.method2333(arg3);
                field321.method2326(class137.field2114[82] ? 1 : 0);
            }
        }
        if (arg2 == 34) {
            field321.method2547(202);
            field321.method2373(arg0);
            field321.method2340(arg1);
            field321.method2332(arg3);
            field393 = 0;
            Statics.field2024 = class173.method899(arg1);
            field394 = arg0;
        }
        if (arg2 == 9) {
            class35 var12 = field316[arg3];
            if (var12 != null) {
                field389 = arg6;
                field390 = arg7;
                field392 = 2;
                field381 = 0;
                field483 = arg0;
                field514 = arg1;
                field321.method2547(188);
                field321.method2454(class137.field2114[82] ? 1 : 0);
                field321.method2287(arg3);
            }
        }
        if (arg2 == 44) {
            class3 var13 = field402[arg3];
            if (var13 != null) {
                field389 = arg6;
                field390 = arg7;
                field392 = 2;
                field381 = 0;
                field483 = arg0;
                field514 = arg1;
                field321.method2547(160);
                field321.method2454(class137.field2114[82] ? 1 : 0);
                field321.method2333(arg3);
            }
        }
        if (arg2 == 1004) {
            field389 = arg6;
            field390 = arg7;
            field392 = 2;
            field381 = 0;
            field321.method2547(37);
            field321.method2332(arg3);
        }
        if (arg2 == 45) {
            class3 var14 = field402[arg3];
            if (var14 != null) {
                field389 = arg6;
                field390 = arg7;
                field392 = 2;
                field381 = 0;
                field483 = arg0;
                field514 = arg1;
                field321.method2547(227);
                field321.method2332(arg3);
                field321.method2454(class137.field2114[82] ? 1 : 0);
            }
        }
        if (arg2 == 21) {
            field389 = arg6;
            field390 = arg7;
            field392 = 2;
            field381 = 0;
            field483 = arg0;
            field514 = arg1;
            field321.method2547(247);
            field321.method2373(arg3);
            field321.method2332(Statics.field2893 + arg1);
            field321.method2333(Statics.field86 + arg0);
            field321.method2362(class137.field2114[82] ? 1 : 0);
        }
        if (arg2 == 30 && field443 == null) {
            field321.method2547(147);
            field321.method2333(arg0);
            field321.method2460(arg1);
            field443 = class173.method1026(arg1, arg0);
            method2240(field443);
        }
        if (arg2 == 2) {
            field389 = arg6;
            field390 = arg7;
            field392 = 2;
            field381 = 0;
            field483 = arg0;
            field514 = arg1;
            field321.method2547(117);
            field321.method2340(Statics.field173);
            field321.method2373(arg3 >> 14 & 0x7FFF);
            field321.method2326(class137.field2114[82] ? 1 : 0);
            field321.method2333(Statics.field86 + arg0);
            field321.method2373(Statics.field2893 + arg1);
            field321.method2332(field435);
        }
        if (arg2 == 5) {
            field389 = arg6;
            field390 = arg7;
            field392 = 2;
            field381 = 0;
            field483 = arg0;
            field514 = arg1;
            field321.method2547(156);
            field321.method2373(Statics.field2893 + arg1);
            field321.method2285(class137.field2114[82] ? 1 : 0);
            field321.method2333(Statics.field86 + arg0);
            field321.method2332(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class173 var15 = class173.method1026(arg1, arg0);
            if (var15 != null) {
                method2646(arg3, arg1, arg0, var15.field2867, arg5);
            }
        }
        if (arg2 == 1) {
            field389 = arg6;
            field390 = arg7;
            field392 = 2;
            field381 = 0;
            field483 = arg0;
            field514 = arg1;
            field321.method2547(78);
            field321.method2362(class137.field2114[82] ? 1 : 0);
            field321.method2373(arg3 >> 14 & 0x7FFF);
            field321.method2333(Statics.field2893 + arg1);
            field321.method2287(Statics.field129);
            field321.method2460(Statics.field100);
            field321.method2373(Statics.field86 + arg0);
            field321.method2333(Statics.field2032);
        }
        if (arg2 == 58) {
            class173 var16 = class173.method1026(arg1, arg0);
            if (var16 != null) {
                field321.method2547(22);
                field321.method2373(field435);
                field321.method2373(var16.field2867);
                field321.method2460(Statics.field173);
                field321.method2373(arg0);
                field321.method2289(arg1);
                field321.method2332(field436);
            }
        }
        if (arg2 == 43) {
            field321.method2547(244);
            field321.method2460(arg1);
            field321.method2287(arg0);
            field321.method2373(arg3);
            field393 = 0;
            Statics.field2024 = class173.method899(arg1);
            field394 = arg0;
        }
        if (arg2 == 37) {
            field321.method2547(252);
            field321.method2287(arg0);
            field321.method2460(arg1);
            field321.method2287(arg3);
            field393 = 0;
            Statics.field2024 = class173.method899(arg1);
            field394 = arg0;
        }
        if (arg2 == 38) {
            method1039();
            class173 var17 = class173.method899(arg1);
            field432 = 1;
            Statics.field2032 = arg0;
            Statics.field100 = arg1;
            Statics.field129 = arg3;
            method2240(var17);
            field543 = class2.method968(16748608) + class52.method10(arg3).field1127 + class2.method968(16777215);
            if (field543 == null) {
                field543 = "null";
            }
            return;
        }
        if (arg2 == 48) {
            class3 var18 = field402[arg3];
            if (var18 != null) {
                field389 = arg6;
                field390 = arg7;
                field392 = 2;
                field381 = 0;
                field483 = arg0;
                field514 = arg1;
                field321.method2547(153);
                field321.method2332(arg3);
                field321.method2326(class137.field2114[82] ? 1 : 0);
            }
        }
        if (arg2 == 36) {
            field321.method2547(46);
            field321.method2342(arg1);
            field321.method2332(arg3);
            field321.method2373(arg0);
            field393 = 0;
            Statics.field2024 = class173.method899(arg1);
            field394 = arg0;
        }
        if (arg2 == 24) {
            class173 var19 = class173.method899(arg1);
            boolean var20 = true;
            if (var19.field2870 > 0) {
                var20 = method2222(var19);
            }
            if (var20) {
                field321.method2547(186);
                field321.method2289(arg1);
            }
        }
        if (arg2 == 33) {
            field321.method2547(28);
            field321.method2373(arg0);
            field321.method2289(arg1);
            field321.method2333(arg3);
            field393 = 0;
            Statics.field2024 = class173.method899(arg1);
            field394 = arg0;
        }
        if (arg2 == 46) {
            class3 var21 = field402[arg3];
            if (var21 != null) {
                field389 = arg6;
                field390 = arg7;
                field392 = 2;
                field381 = 0;
                field483 = arg0;
                field514 = arg1;
                field321.method2547(90);
                field321.method2326(class137.field2114[82] ? 1 : 0);
                field321.method2287(arg3);
            }
        }
        if (arg2 == 23) {
            Statics.field2175.method1745(Statics.field2179, arg0, arg1);
        }
        if (arg2 == 1003) {
            field389 = arg6;
            field390 = arg7;
            field392 = 2;
            field381 = 0;
            class35 var22 = field316[arg3];
            if (var22 != null) {
                class40 var23 = var22.field765;
                if (var23.field876 != null) {
                    var23 = var23.method732();
                }
                if (var23 != null) {
                    field321.method2547(168);
                    field321.method2373(var23.field887);
                }
            }
        }
        if (arg2 == 11) {
            class35 var24 = field316[arg3];
            if (var24 != null) {
                field389 = arg6;
                field390 = arg7;
                field392 = 2;
                field381 = 0;
                field483 = arg0;
                field514 = arg1;
                field321.method2547(131);
                field321.method2454(class137.field2114[82] ? 1 : 0);
                field321.method2333(arg3);
            }
        }
        if (arg2 == 3) {
            field389 = arg6;
            field390 = arg7;
            field392 = 2;
            field381 = 0;
            field483 = arg0;
            field514 = arg1;
            field321.method2547(208);
            field321.method2287(Statics.field2893 + arg1);
            field321.method2287(arg3 >> 14 & 0x7FFF);
            field321.method2332(Statics.field86 + arg0);
            field321.method2362(class137.field2114[82] ? 1 : 0);
        }
        if (arg2 == 8) {
            class35 var25 = field316[arg3];
            if (var25 != null) {
                field389 = arg6;
                field390 = arg7;
                field392 = 2;
                field381 = 0;
                field483 = arg0;
                field514 = arg1;
                field321.method2547(245);
                field321.method2333(arg3);
                field321.method2373(field435);
                field321.method2285(class137.field2114[82] ? 1 : 0);
                field321.method2460(Statics.field173);
            }
        }
        if (arg2 == 1002) {
            field389 = arg6;
            field390 = arg7;
            field392 = 2;
            field381 = 0;
            field321.method2547(82);
            field321.method2373(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 29) {
            field321.method2547(186);
            field321.method2289(arg1);
            class173 var26 = class173.method899(arg1);
            if (var26.field2854 != null && var26.field2854[0][0] == 5) {
                int var27 = var26.field2854[0][1];
                if (class176.field2892[var27] != var26.field2856[0]) {
                    class176.field2892[var27] = var26.field2856[0];
                    method2179(var27);
                }
            }
        }
        if (arg2 == 32) {
            field321.method2547(179);
            field321.method2340(Statics.field173);
            field321.method2289(arg1);
            field321.method2332(field435);
            field321.method2373(arg3);
            field321.method2333(arg0);
            field393 = 0;
            Statics.field2024 = class173.method899(arg1);
            field394 = arg0;
        }
        if (arg2 == 17) {
            field389 = arg6;
            field390 = arg7;
            field392 = 2;
            field381 = 0;
            field483 = arg0;
            field514 = arg1;
            field321.method2547(48);
            field321.method2333(arg3);
            field321.method2460(Statics.field173);
            field321.method2326(class137.field2114[82] ? 1 : 0);
            field321.method2332(Statics.field86 + arg0);
            field321.method2332(field435);
            field321.method2373(Statics.field2893 + arg1);
        }
        if (arg2 == 28) {
            field321.method2547(186);
            field321.method2289(arg1);
            class173 var28 = class173.method899(arg1);
            if (var28.field2854 != null && var28.field2854[0][0] == 5) {
                int var29 = var28.field2854[0][1];
                class176.field2892[var29] = 1 - class176.field2892[var29];
                method2179(var29);
            }
        }
        if (arg2 == 10) {
            class35 var30 = field316[arg3];
            if (var30 != null) {
                field389 = arg6;
                field390 = arg7;
                field392 = 2;
                field381 = 0;
                field483 = arg0;
                field514 = arg1;
                field321.method2547(171);
                field321.method2326(class137.field2114[82] ? 1 : 0);
                field321.method2287(arg3);
            }
        }
        if (arg2 == 18) {
            field389 = arg6;
            field390 = arg7;
            field392 = 2;
            field381 = 0;
            field483 = arg0;
            field514 = arg1;
            field321.method2547(8);
            field321.method2332(Statics.field2893 + arg1);
            field321.method2362(class137.field2114[82] ? 1 : 0);
            field321.method2287(arg3);
            field321.method2287(Statics.field86 + arg0);
        }
        if (arg2 == 6) {
            field389 = arg6;
            field390 = arg7;
            field392 = 2;
            field381 = 0;
            field483 = arg0;
            field514 = arg1;
            field321.method2547(3);
            field321.method2287(Statics.field86 + arg0);
            field321.method2333(Statics.field2893 + arg1);
            field321.method2362(class137.field2114[82] ? 1 : 0);
            field321.method2333(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 22) {
            field389 = arg6;
            field390 = arg7;
            field392 = 2;
            field381 = 0;
            field483 = arg0;
            field514 = arg1;
            field321.method2547(74);
            field321.method2373(arg3);
            field321.method2362(class137.field2114[82] ? 1 : 0);
            field321.method2373(Statics.field2893 + arg1);
            field321.method2373(Statics.field86 + arg0);
        }
        if (arg2 == 35) {
            field321.method2547(136);
            field321.method2340(arg1);
            field321.method2333(arg0);
            field321.method2332(arg3);
            field393 = 0;
            Statics.field2024 = class173.method899(arg1);
            field394 = arg0;
        }
        if (arg2 == 4) {
            field389 = arg6;
            field390 = arg7;
            field392 = 2;
            field381 = 0;
            field483 = arg0;
            field514 = arg1;
            field321.method2547(201);
            field321.method2332(Statics.field86 + arg0);
            field321.method2454(class137.field2114[82] ? 1 : 0);
            field321.method2333(arg3 >> 14 & 0x7FFF);
            field321.method2332(Statics.field2893 + arg1);
        }
        if (arg2 == 25) {
            class173 var31 = class173.method1026(arg1, arg0);
            if (var31 != null) {
                method1039();
                int var34 = method136(var31);
                int var35 = var34 >> 11 & 0x3F;
                method129(arg1, arg0, var35, var31.field2867);
                field432 = 0;
                field437 = method725(var31);
                if (field437 == null) {
                    field437 = "Null";
                }
                if (var31.field2861) {
                    field541 = var31.field2815 + class2.method968(16777215);
                } else {
                    field541 = class2.method968(65280) + var31.field2858 + class2.method968(16777215);
                }
            }
            return;
        }
        if (arg2 == 14) {
            class3 var36 = field402[arg3];
            if (var36 != null) {
                field389 = arg6;
                field390 = arg7;
                field392 = 2;
                field381 = 0;
                field483 = arg0;
                field514 = arg1;
                field321.method2547(203);
                field321.method2333(Statics.field2032);
                field321.method2333(Statics.field129);
                field321.method2289(Statics.field100);
                field321.method2326(class137.field2114[82] ? 1 : 0);
                field321.method2333(arg3);
            }
        }
        if (arg2 == 26) {
            field321.method2547(176);
            for (class4 var37 = (class4) field519.method3464(); var37 != null; var37 = (class4) field519.method3465()) {
                if (var37.field58 == 0 || var37.field58 == 3) {
                    method683(var37, true);
                }
            }
            if (field443 != null) {
                method2240(field443);
                field443 = null;
            }
        }
        if (arg2 == 40) {
            field321.method2547(47);
            field321.method2340(arg1);
            field321.method2287(arg0);
            field321.method2332(arg3);
            field393 = 0;
            Statics.field2024 = class173.method899(arg1);
            field394 = arg0;
        }
        if (arg2 == 19) {
            field389 = arg6;
            field390 = arg7;
            field392 = 2;
            field381 = 0;
            field483 = arg0;
            field514 = arg1;
            field321.method2547(177);
            field321.method2373(arg3);
            field321.method2332(Statics.field2893 + arg1);
            field321.method2326(class137.field2114[82] ? 1 : 0);
            field321.method2287(Statics.field86 + arg0);
        }
        if (arg2 == 42) {
            field321.method2547(29);
            field321.method2333(arg3);
            field321.method2460(arg1);
            field321.method2287(arg0);
            field393 = 0;
            Statics.field2024 = class173.method899(arg1);
            field394 = arg0;
        }
        if (arg2 == 13) {
            class35 var38 = field316[arg3];
            if (var38 != null) {
                field389 = arg6;
                field390 = arg7;
                field392 = 2;
                field381 = 0;
                field483 = arg0;
                field514 = arg1;
                field321.method2547(162);
                field321.method2333(arg3);
                field321.method2362(class137.field2114[82] ? 1 : 0);
            }
        }
        if (arg2 == 16) {
            field389 = arg6;
            field390 = arg7;
            field392 = 2;
            field381 = 0;
            field483 = arg0;
            field514 = arg1;
            field321.method2547(6);
            field321.method2373(Statics.field2893 + arg1);
            field321.method2326(class137.field2114[82] ? 1 : 0);
            field321.method2333(Statics.field2032);
            field321.method2460(Statics.field100);
            field321.method2373(arg3);
            field321.method2287(Statics.field129);
            field321.method2373(Statics.field86 + arg0);
        }
        if (arg2 == 1001) {
            field389 = arg6;
            field390 = arg7;
            field392 = 2;
            field381 = 0;
            field483 = arg0;
            field514 = arg1;
            field321.method2547(236);
            field321.method2373(Statics.field86 + arg0);
            field321.method2332(Statics.field2893 + arg1);
            field321.method2287(arg3 >> 14 & 0x7FFF);
            field321.method2362(class137.field2114[82] ? 1 : 0);
        }
        if (arg2 == 15) {
            class3 var39 = field402[arg3];
            if (var39 != null) {
                field389 = arg6;
                field390 = arg7;
                field392 = 2;
                field381 = 0;
                field483 = arg0;
                field514 = arg1;
                field321.method2547(36);
                field321.method2373(field435);
                field321.method2333(arg3);
                field321.method2285(class137.field2114[82] ? 1 : 0);
                field321.method2340(Statics.field173);
            }
        }
        if (arg2 == 1005) {
            class173 var40 = class173.method899(arg1);
            if (var40 == null || var40.field2736[arg0] < 100000) {
                field321.method2547(37);
                field321.method2332(arg3);
            } else {
                class12.method2763(27, "", var40.field2736[arg0] + " x " + class52.method10(arg3).field1127);
            }
            field393 = 0;
            Statics.field2024 = class173.method899(arg1);
            field394 = arg0;
        }
        if (arg2 == 50) {
            class3 var41 = field402[arg3];
            if (var41 != null) {
                field389 = arg6;
                field390 = arg7;
                field392 = 2;
                field381 = 0;
                field483 = arg0;
                field514 = arg1;
                field321.method2547(85);
                field321.method2373(arg3);
                field321.method2326(class137.field2114[82] ? 1 : 0);
            }
        }
        if (arg2 == 47) {
            class3 var42 = field402[arg3];
            if (var42 != null) {
                field389 = arg6;
                field390 = arg7;
                field392 = 2;
                field381 = 0;
                field483 = arg0;
                field514 = arg1;
                field321.method2547(96);
                field321.method2373(arg3);
                field321.method2285(class137.field2114[82] ? 1 : 0);
            }
        }
        if (field432 != 0) {
            field432 = 0;
            method2240(class173.method899(Statics.field100));
        }
        if (field434) {
            method1039();
        }
        if (Statics.field2024 != null && field393 == 0) {
            method2240(Statics.field2024);
        }
    }

    @ObfuscatedName("j.bf(IIIIB)V")
    public static void method129(int arg0, int arg1, int arg2, int arg3) {
        class173 var4 = class173.method1026(arg0, arg1);
        if (var4 != null && var4.field2833 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field17 = var4.field2833;
            class37.method105(var5);
        }
        field436 = arg3;
        field434 = true;
        Statics.field173 = arg0;
        field435 = arg1;
        Statics.field1361 = arg2;
        method2240(var4);
    }

    @ObfuscatedName("az.br(B)V")
    public static void method1039() {
        if (!field434) {
            return;
        }
        class173 var0 = class173.method1026(Statics.field173, field435);
        if (var0 != null && var0.field2796 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field17 = var0.field2796;
            class37.method105(var1);
        }
        field434 = false;
        method2240(var0);
    }

    @ObfuscatedName("eg.by(IIIILjava/lang/String;I)V")
    public static void method2646(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class173 var5 = class173.method1026(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2842 != null) {
            class1 var6 = new class1();
            var6.field3 = var5;
            var6.field5 = arg0;
            var6.field10 = arg4;
            var6.field17 = var5.field2842;
            class37.method105(var6);
        }
        boolean var7 = true;
        if (var5.field2870 > 0) {
            var7 = method2222(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method136(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            field321.method2547(145);
            field321.method2289(arg1);
            field321.method2287(arg2);
            field321.method2287(arg3);
        }
        if (arg0 == 2) {
            field321.method2547(254);
            field321.method2289(arg1);
            field321.method2287(arg2);
            field321.method2287(arg3);
        }
        if (arg0 == 3) {
            field321.method2547(115);
            field321.method2289(arg1);
            field321.method2287(arg2);
            field321.method2287(arg3);
        }
        if (arg0 == 4) {
            field321.method2547(140);
            field321.method2289(arg1);
            field321.method2287(arg2);
            field321.method2287(arg3);
        }
        if (arg0 == 5) {
            field321.method2547(11);
            field321.method2289(arg1);
            field321.method2287(arg2);
            field321.method2287(arg3);
        }
        if (arg0 == 6) {
            field321.method2547(198);
            field321.method2289(arg1);
            field321.method2287(arg2);
            field321.method2287(arg3);
        }
        if (arg0 == 7) {
            field321.method2547(41);
            field321.method2289(arg1);
            field321.method2287(arg2);
            field321.method2287(arg3);
        }
        if (arg0 == 8) {
            field321.method2547(57);
            field321.method2289(arg1);
            field321.method2287(arg2);
            field321.method2287(arg3);
        }
        if (arg0 == 9) {
            field321.method2547(228);
            field321.method2289(arg1);
            field321.method2287(arg2);
            field321.method2287(arg3);
        }
        if (arg0 == 10) {
            field321.method2547(159);
            field321.method2289(arg1);
            field321.method2287(arg2);
            field321.method2287(arg3);
        }
    }

    @ObfuscatedName("at.bx(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method815(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field552 || field421 >= 500) {
            return;
        }
        field426[field421] = arg0;
        field470[field421] = arg1;
        field424[field421] = arg2;
        field563[field421] = arg3;
        field422[field421] = arg4;
        field423[field421] = arg5;
        field421++;
    }

    @ObfuscatedName("ag.bn(I)V")
    public static void method975() {
        for (int var0 = 0; var0 < field421; var0++) {
            if (method125(field424[var0])) {
                if (var0 < field421 - 1) {
                    for (int var1 = var0; var1 < field421 - 1; var1++) {
                        field426[var1] = field426[var1 + 1];
                        field470[var1] = field470[var1 + 1];
                        field424[var1] = field424[var1 + 1];
                        field563[var1] = field563[var1 + 1];
                        field422[var1] = field422[var1 + 1];
                        field423[var1] = field423[var1 + 1];
                    }
                }
                field421--;
            }
        }
    }

    @ObfuscatedName("n.bv(IB)Z")
    public static boolean method125(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("eu.be(Lae;IIII)V")
    public static final void method2667(class40 arg0, int arg1, int arg2, int arg3) {
        if (field421 >= 400) {
            return;
        }
        if (arg0.field876 != null) {
            arg0 = arg0.method732();
        }
        if (arg0 == null || !arg0.field905 || arg0.field907 && field485 != arg1) {
            return;
        }
        String var4 = arg0.field877;
        if (arg0.field894 != 0) {
            int var6 = arg0.field894;
            int var7 = Statics.field859.field36;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method968(16711680);
            } else if (var8 < -6) {
                var9 = class2.method968(16723968);
            } else if (var8 < -3) {
                var9 = class2.method968(16740352);
            } else if (var8 < 0) {
                var9 = class2.method968(16756736);
            } else if (var8 > 9) {
                var9 = class2.method968(65280);
            } else if (var8 > 6) {
                var9 = class2.method968(4259584);
            } else if (var8 > 3) {
                var9 = class2.method968(8453888);
            } else if (var8 > 0) {
                var9 = class2.method968(12648192);
            } else {
                var9 = class2.method968(16776960);
            }
            var4 = var4 + var9 + " " + class2.field26 + class157.field2462 + arg0.field894 + class2.field22;
        }
        if (field432 == 1) {
            method815(class157.field2456, field543 + " " + class2.field23 + " " + class2.method968(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field434) {
            String[] var10 = arg0.field892;
            if (field450) {
                var10 = method2242(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class157.field2321)) {
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
                        method815(var10[var11], class2.method968(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class157.field2321)) {
                        short var14 = 0;
                        if (field306 == class21.field567 || field306 == class21.field573 && arg0.field894 > Statics.field859.field36) {
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
                        method815(var10[var13], class2.method968(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method815(class157.field2352, class2.method968(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1361 & 0x2) == 2) {
            method815(field437, field541 + " " + class2.field23 + " " + class2.method968(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("c.bq(Lk;IIII)V")
    public static final void method165(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field859 == arg0 || field421 >= 400) {
            return;
        }
        String var9;
        if (arg0.field31 == 0) {
            String var4 = arg0.field35[0] + arg0.field37 + arg0.field35[1];
            int var5 = arg0.field36;
            int var6 = Statics.field859.field36;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method968(16711680);
            } else if (var7 < -6) {
                var8 = class2.method968(16723968);
            } else if (var7 < -3) {
                var8 = class2.method968(16740352);
            } else if (var7 < 0) {
                var8 = class2.method968(16756736);
            } else if (var7 > 9) {
                var8 = class2.method968(65280);
            } else if (var7 > 6) {
                var8 = class2.method968(4259584);
            } else if (var7 > 3) {
                var8 = class2.method968(8453888);
            } else if (var7 > 0) {
                var8 = class2.method968(12648192);
            } else {
                var8 = class2.method968(16776960);
            }
            var9 = var4 + var8 + " " + class2.field26 + class157.field2462 + arg0.field36 + class2.field22 + arg0.field35[2];
        } else {
            var9 = arg0.field35[0] + arg0.field37 + arg0.field35[1] + " " + class2.field26 + class157.field2463 + arg0.field31 + class2.field22 + arg0.field35[2];
        }
        if (field432 == 1) {
            method815(class157.field2456, field543 + " " + class2.field23 + " " + class2.method968(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field434) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field408[var10] != null) {
                    short var11 = 0;
                    if (field408[var10].equalsIgnoreCase(class157.field2321)) {
                        if (field306 == class21.field567 || field306 == class21.field573 && arg0.field36 > Statics.field859.field36) {
                            var11 = 2000;
                        }
                        if (Statics.field859.field50 != 0 && arg0.field50 != 0) {
                            if (Statics.field859.field50 == arg0.field50) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field409[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field286[var10] + var11;
                    method815(field408[var10], class2.method968(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1361 & 0x8) == 8) {
            method815(field437, field541 + " " + class2.field23 + " " + class2.method968(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field421; var14++) {
            if (field424[var14] == 23) {
                field470[var14] = class2.method968(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("fl.cg(IIIIIIIII)V")
    public static final void method3045(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (Statics.method2098(arg0)) {
            Statics.field865 = null;
            Statics.method1993(Statics.field2802[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field865 != null) {
                Statics.method1993(Statics.field865, -1412584499, arg1, arg2, arg3, arg4, Statics.field1769, Statics.field27, arg7);
                Statics.field865 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field428[var8] = true;
            }
        } else {
            field428[arg7] = true;
        }
    }

    @ObfuscatedName("aj.cl(Ljava/lang/String;Lfe;I)Ljava/lang/String;")
    public static String method694(String arg0, class173 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method49(arg1, var2 - 1);
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
                if (Statics.field1093 != null) {
                    int var9 = Statics.field1093.field2223;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field1093.field2222 != null) {
                        var8 = (String) Statics.field1093.field2222;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("dl.cs(II)Ljava/lang/String;")
    public static final String method2614(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field19 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method968(65408) + var1.substring(0, var1.length() - 8) + class157.field2467 + " " + class2.field26 + var1 + class2.field22 + class2.field25;
        } else if (var1.length() > 6) {
            return " " + class2.method968(16777215) + var1.substring(0, var1.length() - 4) + class157.field2469 + " " + class2.field26 + var1 + class2.field22 + class2.field25;
        } else {
            return " " + class2.method968(16776960) + var1 + class2.field25;
        }
    }

    @ObfuscatedName("a.cr(Lfe;I)V")
    public static void method152(class173 arg0) {
        class173 var1 = arg0.field2752 == -1 ? null : class173.method899(arg0.field2752);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field2056;
            var3 = Statics.field2096;
        } else {
            var2 = var1.field2759;
            var3 = var1.field2775;
        }
        Statics.method567(arg0, var2, var3, false);
        method12(arg0, var2, var3);
    }

    @ObfuscatedName("fz.cb([Lfe;Lfe;ZB)V")
    public static void method3094(class173[] arg0, class173 arg1, boolean arg2) {
        int var3 = arg1.field2767 == 0 ? arg1.field2759 : arg1.field2767;
        int var4 = arg1.field2768 == 0 ? arg1.field2775 : arg1.field2768;
        method1887(arg0, arg1.field2783, var3, var4, arg2);
        if (arg1.field2844 != null) {
            method1887(arg1.field2844, arg1.field2783, var3, var4, arg2);
        }
        class4 var5 = (class4) field519.method3462((long) arg1.field2783);
        if (var5 != null) {
            int var6 = var5.field65;
            if (Statics.method2098(var6)) {
                method1887(Statics.field2802[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2870 == 1337) {
        }
    }

    @ObfuscatedName("cu.cc([Lfe;IIIZI)V")
    public static void method1887(class173[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class173 var6 = arg0[var5];
            if (var6 != null && var6.field2752 == arg1) {
                Statics.method567(var6, arg2, arg3, arg4);
                method12(var6, arg2, arg3);
                if (var6.field2765 > var6.field2767 - var6.field2759) {
                    var6.field2765 = var6.field2767 - var6.field2759;
                }
                if (var6.field2765 < 0) {
                    var6.field2765 = 0;
                }
                if (var6.field2766 > var6.field2768 - var6.field2775) {
                    var6.field2766 = var6.field2768 - var6.field2775;
                }
                if (var6.field2766 < 0) {
                    var6.field2766 = 0;
                }
                if (var6.field2746 == 0) {
                    method3094(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("q.cm(Lfe;III)V")
    public static void method12(class173 arg0, int arg1, int arg2) {
        if (arg0.field2747 == 0) {
            arg0.field2757 = arg0.field2753;
        } else if (arg0.field2747 == 1) {
            arg0.field2757 = (arg1 - arg0.field2759) / 2 + arg0.field2753;
        } else if (arg0.field2747 == 2) {
            arg0.field2757 = arg1 - arg0.field2759 - arg0.field2753;
        } else if (arg0.field2747 == 3) {
            arg0.field2757 = arg0.field2753 * arg1 >> 14;
        } else if (arg0.field2747 == 4) {
            arg0.field2757 = (arg0.field2753 * arg1 >> 14) + (arg1 - arg0.field2759) / 2;
        } else {
            arg0.field2757 = arg1 - arg0.field2759 - (arg0.field2753 * arg1 >> 14);
        }
        if (arg0.field2843 == 0) {
            arg0.field2758 = arg0.field2754;
        } else if (arg0.field2843 == 1) {
            arg0.field2758 = (arg2 - arg0.field2775) / 2 + arg0.field2754;
        } else if (arg0.field2843 == 2) {
            arg0.field2758 = arg2 - arg0.field2775 - arg0.field2754;
        } else if (arg0.field2843 == 3) {
            arg0.field2758 = arg0.field2754 * arg2 >> 14;
        } else if (arg0.field2843 == 4) {
            arg0.field2758 = (arg0.field2754 * arg2 >> 14) + (arg2 - arg0.field2775) / 2;
        } else {
            arg0.field2758 = arg2 - arg0.field2775 - (arg0.field2754 * arg2 >> 14);
        }
        if (!field449 || arg0.field2746 != 0) {
            return;
        }
        if (arg0.field2757 < 0) {
            arg0.field2757 = 0;
        } else if (arg0.field2759 + arg0.field2757 > arg1) {
            arg0.field2757 = arg1 - arg0.field2759;
        }
        if (arg0.field2758 < 0) {
            arg0.field2758 = 0;
        } else if (arg0.field2775 + arg0.field2758 > arg2) {
            arg0.field2758 = arg2 - arg0.field2775;
        }
    }

    @ObfuscatedName("fp.cd(Lfe;IIIIIII)V")
    public static final void method3225(class173 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field363) {
            field364 = 32;
        } else {
            field364 = 0;
        }
        field363 = false;
        if (class140.field2161 == 1 || !Statics.field215 && class140.field2161 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2766 -= 4;
                method2240(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2766 += 4;
                method2240(arg0);
            } else if (arg5 >= arg1 - field364 && arg5 < field364 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2766 = (arg4 - arg3) * var8 / var9;
                method2240(arg0);
                field363 = true;
            }
        }
        if (field477 == 0) {
            return;
        }
        int var10 = arg0.field2759;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2766 += field477 * 45;
            method2240(arg0);
        }
    }

    @ObfuscatedName("ac.cu(Lfe;I)Z")
    public static final boolean method680(class173 arg0) {
        if (arg0.field2855 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2855.length; var1++) {
            int var2 = method49(arg0, var1);
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

    @ObfuscatedName("f.co(Lfe;IB)I")
    public static final int method49(class173 arg0, int arg1) {
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
                    var7 = field416[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field417[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field418[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class173 var11 = class173.method899(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method10(var12).field1124 || field536)) {
                        for (int var13 = 0; var13 < var11.field2816.length; var13++) {
                            if (var12 + 1 == var11.field2816[var13]) {
                                var7 += var11.field2736[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class176.field2892[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class155.field2291[field417[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class176.field2892[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field859.field36;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class155.field2290[var14]) {
                            var7 += field417[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class173 var17 = class173.method899(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method10(var18).field1124 || field536)) {
                        for (int var19 = 0; var19 < var17.field2816.length; var19++) {
                            if (var18 + 1 == var17.field2816[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field460;
                }
                if (var6 == 12) {
                    var7 = field445;
                }
                if (var6 == 13) {
                    int var20 = class176.field2892[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class176.method951(var22);
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
                    var7 = (Statics.field859.field826 >> 7) + Statics.field86;
                }
                if (var6 == 19) {
                    var7 = (Statics.field859.field801 >> 7) + Statics.field2893;
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

    @ObfuscatedName("f.ce(Lfe;III)V")
    public static final void method45(class173 arg0, int arg1, int arg2) {
        if (arg0.field2756 == 1) {
            method815(arg0.field2804, "", 24, 0, 0, arg0.field2783);
        }
        if (arg0.field2756 == 2 && !field434) {
            String var3 = method725(arg0);
            if (var3 != null) {
                method815(var3, class2.method968(65280) + arg0.field2858, 25, 0, -1, arg0.field2783);
            }
        }
        if (arg0.field2756 == 3) {
            method815(class157.field2465, "", 26, 0, 0, arg0.field2783);
        }
        if (arg0.field2756 == 4) {
            method815(arg0.field2804, "", 28, 0, 0, arg0.field2783);
        }
        if (arg0.field2756 == 5) {
            method815(arg0.field2804, "", 29, 0, 0, arg0.field2783);
        }
        if (arg0.field2756 == 6 && field443 == null) {
            method815(arg0.field2804, "", 30, 0, -1, arg0.field2783);
        }
        if (arg0.field2746 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2775; var5++) {
                for (int var6 = 0; var6 < arg0.field2759; var6++) {
                    int var7 = (arg0.field2808 + 32) * var6;
                    int var8 = (arg0.field2800 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2810[var4];
                        var8 += arg0.field2846[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field398 = var4;
                        Statics.field962 = arg0;
                        if (arg0.field2816[var4] > 0) {
                            class52 var9 = class52.method10(arg0.field2816[var4] - 1);
                            if (field432 == 1 && class178.method2706(method136(arg0))) {
                                if (Statics.field100 != arg0.field2783 || Statics.field2032 != var4) {
                                    method815(class157.field2456, field543 + " " + class2.field23 + " " + class2.method968(16748608) + var9.field1127, 31, var9.field1109, var4, arg0.field2783);
                                }
                            } else if (!field434 || !class178.method2706(method136(arg0))) {
                                String[] var10 = var9.field1126;
                                if (field450) {
                                    var10 = method2242(var10);
                                }
                                if (class178.method2706(method136(arg0))) {
                                    for (int var11 = 4; var11 >= 3; var11--) {
                                        if (var10 != null && var10[var11] != null) {
                                            byte var12;
                                            if (var11 == 3) {
                                                var12 = 36;
                                            } else {
                                                var12 = 37;
                                            }
                                            method815(var10[var11], class2.method968(16748608) + var9.field1127, var12, var9.field1109, var4, arg0.field2783);
                                        } else if (var11 == 4) {
                                            method815(class157.field2359, class2.method968(16748608) + var9.field1127, 37, var9.field1109, var4, arg0.field2783);
                                        }
                                    }
                                }
                                int var13 = method136(arg0);
                                boolean var14 = (var13 >> 31 & 0x1) != 0;
                                if (var14) {
                                    method815(class157.field2456, class2.method968(16748608) + var9.field1127, 38, var9.field1109, var4, arg0.field2783);
                                }
                                class178 var10000 = (class178) null;
                                if (class178.method2706(method136(arg0)) && var10 != null) {
                                    for (int var15 = 2; var15 >= 0; var15--) {
                                        if (var10[var15] != null) {
                                            byte var16 = 0;
                                            if (var15 == 0) {
                                                var16 = 33;
                                            }
                                            if (var15 == 1) {
                                                var16 = 34;
                                            }
                                            if (var15 == 2) {
                                                var16 = 35;
                                            }
                                            method815(var10[var15], class2.method968(16748608) + var9.field1127, var16, var9.field1109, var4, arg0.field2783);
                                        }
                                    }
                                }
                                String[] var17 = arg0.field2813;
                                if (field450) {
                                    var17 = method2242(var17);
                                }
                                if (var17 != null) {
                                    for (int var18 = 4; var18 >= 0; var18--) {
                                        if (var17[var18] != null) {
                                            byte var19 = 0;
                                            if (var18 == 0) {
                                                var19 = 39;
                                            }
                                            if (var18 == 1) {
                                                var19 = 40;
                                            }
                                            if (var18 == 2) {
                                                var19 = 41;
                                            }
                                            if (var18 == 3) {
                                                var19 = 42;
                                            }
                                            if (var18 == 4) {
                                                var19 = 43;
                                            }
                                            method815(var17[var18], class2.method968(16748608) + var9.field1127, var19, var9.field1109, var4, arg0.field2783);
                                        }
                                    }
                                }
                                method815(class157.field2352, class2.method968(16748608) + var9.field1127, 1005, var9.field1109, var4, arg0.field2783);
                            } else if ((Statics.field1361 & 0x10) == 16) {
                                method815(field437, field541 + " " + class2.field23 + " " + class2.method968(16748608) + var9.field1127, 32, var9.field1109, var4, arg0.field2783);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2861) {
            return;
        }
        if (!field434) {
            for (int var20 = 9; var20 >= 5; var20--) {
                String var21 = method2180(arg0, var20);
                if (var21 != null) {
                    method815(var21, arg0.field2815, 1007, var20 + 1, arg0.field2745, arg0.field2783);
                }
            }
            String var22 = method725(arg0);
            if (var22 != null) {
                method815(var22, arg0.field2815, 25, 0, arg0.field2745, arg0.field2783);
            }
            for (int var23 = 4; var23 >= 0; var23--) {
                String var24 = method2180(arg0, var23);
                if (var24 != null) {
                    method815(var24, arg0.field2815, 57, var23 + 1, arg0.field2745, arg0.field2783);
                }
            }
            int var25 = method136(arg0);
            boolean var26 = (var25 & 0x1) != 0;
            if (var26) {
                method815(class157.field2415, "", 30, 0, arg0.field2745, arg0.field2783);
            }
        } else if (class178.method2621(method136(arg0)) && (Statics.field1361 & 0x20) == 32) {
            method815(field437, field541 + " " + class2.field23 + " " + arg0.field2815, 58, 0, arg0.field2745, arg0.field2783);
        }
    }

    @ObfuscatedName("l.cy([Lfe;IIIIIIIB)V")
    public static final void method73(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class173 var9 = arg0[var8];
            if (var9 != null && (!var9.field2861 || var9.field2746 == 0 || var9.field2822 || method136(var9) != 0 || field453 == var9 || var9.field2870 == 1338) && var9.field2752 == arg1 && (!var9.field2861 || !Statics.method1988(var9))) {
                int var10 = var9.field2757 + arg6;
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
                    int var19 = var9.field2775 + var11;
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
                    int var23 = var9.field2775 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field277 == var9) {
                    field292 = true;
                    field461 = var10;
                    field462 = var11;
                }
                if (!var9.field2861 || var12 < var14 && var13 < var15) {
                    int var24 = class140.field2152;
                    int var25 = class140.field2156 * 121255813;
                    if (class140.field2151 != 0) {
                        var24 = class140.field2154;
                        var25 = class140.field2163;
                    }
                    if (var9.field2870 == 1337) {
                        if (!field383 && !field552 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field432 == 0 && !field434) {
                                method815(class157.field2461, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class105.field1851; var28++) {
                                int var29 = class105.field1852[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field2175.method1857(Statics.field2179, var30, var31, var29) >= 0) {
                                        class41 var34 = class41.method3664(var33);
                                        if (var34.field954 != null) {
                                            var34 = var34.method770();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field432 == 1) {
                                            method815(class157.field2456, field543 + " " + class2.field23 + " " + class2.method968(65535) + var34.field923, 1, var29, var30, var31);
                                        } else if (!field434) {
                                            String[] var35 = var34.field913;
                                            if (field450) {
                                                var35 = method2242(var35);
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
                                                        method815(var35[var36], class2.method968(65535) + var34.field923, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method815(class157.field2352, class2.method968(65535) + var34.field923, 1002, var34.field920 << 14, var30, var31);
                                        } else if ((Statics.field1361 & 0x4) == 4) {
                                            method815(field437, field541 + " " + class2.field23 + " " + class2.method968(65535) + var34.field923, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class35 var38 = field316[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field765.field878 == 1 && (var38.field826 & 0x7F) == 64 && (var38.field801 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field317; var39++) {
                                                class35 var40 = field316[field302[var39]];
                                                if (var40 != null && var38 != var40 && var40.field765.field878 == 1 && var38.field826 == var40.field826 && var38.field801 == var40.field801) {
                                                    method2667(var40.field765, field302[var39], var30, var31);
                                                }
                                            }
                                            int var41 = class33.field739;
                                            int[] var42 = class33.field734;
                                            for (int var43 = 0; var43 < var41; var43++) {
                                                class3 var44 = field402[var42[var43]];
                                                if (var44 != null && var38.field826 == var44.field826 && var38.field801 == var44.field801) {
                                                    method165(var44, var42[var43], var30, var31);
                                                }
                                            }
                                        }
                                        method2667(var38.field765, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var45 = field402[var33];
                                        if (var45 == null) {
                                            continue;
                                        }
                                        if ((var45.field826 & 0x7F) == 64 && (var45.field801 & 0x7F) == 64) {
                                            for (int var46 = 0; var46 < field317; var46++) {
                                                class35 var47 = field316[field302[var46]];
                                                if (var47 != null && var47.field765.field878 == 1 && var45.field826 == var47.field826 && var45.field801 == var47.field801) {
                                                    method2667(var47.field765, field302[var46], var30, var31);
                                                }
                                            }
                                            int var48 = class33.field739;
                                            int[] var49 = class33.field734;
                                            for (int var50 = 0; var50 < var48; var50++) {
                                                class3 var51 = field402[var49[var50]];
                                                if (var51 != null && var45 != var51 && var45.field826 == var51.field826 && var45.field801 == var51.field801) {
                                                    method165(var51, var49[var50], var30, var31);
                                                }
                                            }
                                        }
                                        if (field411 == var33) {
                                            var26 = var29;
                                        } else {
                                            method165(var45, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class199 var52 = field412[Statics.field2179][var30][var31];
                                        if (var52 != null) {
                                            for (class29 var53 = (class29) var52.method3522(); var53 != null; var53 = (class29) var52.method3499()) {
                                                class52 var54 = class52.method10(var53.field664);
                                                if (field432 == 1) {
                                                    method815(class157.field2456, field543 + " " + class2.field23 + " " + class2.method968(16748608) + var54.field1127, 16, var53.field664, var30, var31);
                                                } else if (!field434) {
                                                    String[] var55 = var54.field1131;
                                                    if (field450) {
                                                        var55 = method2242(var55);
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
                                                            method815(var55[var56], class2.method968(16748608) + var54.field1127, var57, var53.field664, var30, var31);
                                                        } else if (var56 == 2) {
                                                            method815(class157.field2306, class2.method968(16748608) + var54.field1127, 20, var53.field664, var30, var31);
                                                        }
                                                    }
                                                    method815(class157.field2352, class2.method968(16748608) + var54.field1127, 1004, var53.field664, var30, var31);
                                                } else if ((Statics.field1361 & 0x1) == 1) {
                                                    method815(field437, field541 + " " + class2.field23 + " " + class2.method968(16748608) + var54.field1127, 17, var53.field664, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var58 = var26 & 0x7F;
                                int var59 = var26 >> 7 & 0x7F;
                                class3 var60 = field402[field411];
                                method165(var60, field411, var58, var59);
                            }
                        }
                    } else if (var9.field2870 != 1338) {
                        if (!field552 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method45(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2746 == 0) {
                            if (!var9.field2861 && Statics.method1988(var9) && Statics.field683 != var9) {
                                continue;
                            }
                            method73(arg0, var9.field2783, var12, var13, var14, var15, var10 - var9.field2765, var11 - var9.field2766);
                            if (var9.field2844 != null) {
                                method73(var9.field2844, var9.field2783, var12, var13, var14, var15, var10 - var9.field2765, var11 - var9.field2766);
                            }
                            class4 var75 = (class4) field519.method3462((long) var9.field2783);
                            if (var75 != null) {
                                if (var75.field58 == 0 && class140.field2152 >= var12 && class140.field2156 * 121255813 >= var13 && class140.field2152 < var14 && class140.field2156 * 121255813 < var15 && !field552 && !field449) {
                                    for (class1 var76 = (class1) field493.method3502(); var76 != null; var76 = (class1) field493.method3489()) {
                                        if (var76.field2) {
                                            var76.method3583();
                                            var76.field3.field2744 = false;
                                        }
                                    }
                                    if (Statics.field909 == 0) {
                                        field277 = null;
                                        field453 = null;
                                    }
                                    if (!field552) {
                                        field426[0] = class157.field2542;
                                        field470[0] = "";
                                        field424[0] = 1006;
                                        field421 = 1;
                                    }
                                }
                                int var77 = var75.field65;
                                if (Statics.method2098(var77)) {
                                    method73(Statics.field2802[var77], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2861) {
                            if (var9.field2875) {
                                if (class140.field2152 >= var12 && class140.field2156 * 121255813 >= var13 && class140.field2152 < var14 && class140.field2156 * 121255813 < var15) {
                                    for (class1 var78 = (class1) field493.method3502(); var78 != null; var78 = (class1) field493.method3489()) {
                                        if (var78.field2) {
                                            var78.method3583();
                                            var78.field3.field2744 = false;
                                        }
                                    }
                                    if (Statics.field909 == 0) {
                                        field277 = null;
                                        field453 = null;
                                    }
                                    if (!field552) {
                                        field426[0] = class157.field2542;
                                        field470[0] = "";
                                        field424[0] = 1006;
                                        field421 = 1;
                                    }
                                }
                            } else if (var9.field2876 && class140.field2152 >= var12 && class140.field2156 * 121255813 >= var13 && class140.field2152 < var14 && class140.field2156 * 121255813 < var15) {
                                for (class1 var79 = (class1) field493.method3502(); var79 != null; var79 = (class1) field493.method3489()) {
                                    if (var79.field2 && var79.field3.field2807 == var79.field17) {
                                        var79.method3583();
                                    }
                                }
                            }
                            boolean var80;
                            if (class140.field2152 >= var12 && class140.field2156 * 121255813 >= var13 && class140.field2152 < var14 && class140.field2156 * 121255813 < var15) {
                                var80 = true;
                            } else {
                                var80 = false;
                            }
                            boolean var81 = false;
                            if ((class140.field2161 == 1 || !Statics.field215 && class140.field2161 == 4) && var80) {
                                var81 = true;
                            }
                            boolean var82 = false;
                            if ((class140.field2151 == 1 || !Statics.field215 && class140.field2151 == 4) && class140.field2154 >= var12 && class140.field2163 >= var13 && class140.field2154 < var14 && class140.field2163 < var15) {
                                var82 = true;
                            }
                            if (var82) {
                                method723(var9, class140.field2154 - var10, class140.field2163 - var11);
                            }
                            if (field277 != null && field277 != var9 && var80) {
                                int var83 = method136(var9);
                                boolean var84 = (var83 >> 20 & 0x1) != 0;
                                if (var84) {
                                    field427 = var9;
                                }
                            }
                            if (field453 == var9) {
                                field457 = true;
                                field458 = var10;
                                field331 = var11;
                            }
                            if (var9.field2822) {
                                if (var80 && field477 != 0 && var9.field2807 != null) {
                                    class1 var85 = new class1();
                                    var85.field2 = true;
                                    var85.field3 = var9;
                                    var85.field8 = field477;
                                    var85.field17 = var9.field2807;
                                    field493.method3491(var85);
                                }
                                if (field277 != null || Statics.field1350 != null || field552) {
                                    var82 = false;
                                    var81 = false;
                                    var80 = false;
                                }
                                if (!var9.field2868 && var82) {
                                    var9.field2868 = true;
                                    if (var9.field2779 != null) {
                                        class1 var86 = new class1();
                                        var86.field2 = true;
                                        var86.field3 = var9;
                                        var86.field4 = class140.field2154 - var10;
                                        var86.field8 = class140.field2163 - var11;
                                        var86.field17 = var9.field2779;
                                        field493.method3491(var86);
                                    }
                                }
                                if (var9.field2868 && var81 && var9.field2825 != null) {
                                    class1 var87 = new class1();
                                    var87.field2 = true;
                                    var87.field3 = var9;
                                    var87.field4 = class140.field2152 - var10;
                                    var87.field8 = class140.field2156 * 121255813 - var11;
                                    var87.field17 = var9.field2825;
                                    field493.method3491(var87);
                                }
                                if (var9.field2868 && !var81) {
                                    var9.field2868 = false;
                                    if (var9.field2826 != null) {
                                        class1 var88 = new class1();
                                        var88.field2 = true;
                                        var88.field3 = var9;
                                        var88.field4 = class140.field2152 - var10;
                                        var88.field8 = class140.field2156 * 121255813 - var11;
                                        var88.field17 = var9.field2826;
                                        field403.method3491(var88);
                                    }
                                }
                                if (var81 && var9.field2827 != null) {
                                    class1 var89 = new class1();
                                    var89.field2 = true;
                                    var89.field3 = var9;
                                    var89.field4 = class140.field2152 - var10;
                                    var89.field8 = class140.field2156 * 121255813 - var11;
                                    var89.field17 = var9.field2827;
                                    field493.method3491(var89);
                                }
                                if (!var9.field2744 && var80) {
                                    var9.field2744 = true;
                                    if (var9.field2828 != null) {
                                        class1 var90 = new class1();
                                        var90.field2 = true;
                                        var90.field3 = var9;
                                        var90.field4 = class140.field2152 - var10;
                                        var90.field8 = class140.field2156 * 121255813 - var11;
                                        var90.field17 = var9.field2828;
                                        field493.method3491(var90);
                                    }
                                }
                                if (var9.field2744 && var80 && var9.field2801 != null) {
                                    class1 var91 = new class1();
                                    var91.field2 = true;
                                    var91.field3 = var9;
                                    var91.field4 = class140.field2152 - var10;
                                    var91.field8 = class140.field2156 * 121255813 - var11;
                                    var91.field17 = var9.field2801;
                                    field493.method3491(var91);
                                }
                                if (var9.field2744 && !var80) {
                                    var9.field2744 = false;
                                    if (var9.field2830 != null) {
                                        class1 var92 = new class1();
                                        var92.field2 = true;
                                        var92.field3 = var9;
                                        var92.field4 = class140.field2152 - var10;
                                        var92.field8 = class140.field2156 * 121255813 - var11;
                                        var92.field17 = var9.field2830;
                                        field403.method3491(var92);
                                    }
                                }
                                if (var9.field2841 != null) {
                                    class1 var93 = new class1();
                                    var93.field3 = var9;
                                    var93.field17 = var9.field2841;
                                    field479.method3491(var93);
                                }
                                if (var9.field2809 != null && field444 > var9.field2763) {
                                    if (var9.field2836 == null || field444 - var9.field2763 > 32) {
                                        class1 var98 = new class1();
                                        var98.field3 = var9;
                                        var98.field17 = var9.field2809;
                                        field493.method3491(var98);
                                    } else {
                                        label799: for (int var94 = var9.field2763; var94 < field444; var94++) {
                                            int var95 = field531[var94 & 0x1F];
                                            for (int var96 = 0; var96 < var9.field2836.length; var96++) {
                                                if (var9.field2836[var96] == var95) {
                                                    class1 var97 = new class1();
                                                    var97.field3 = var9;
                                                    var97.field17 = var9.field2809;
                                                    field493.method3491(var97);
                                                    break label799;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2763 = field444;
                                }
                                if (var9.field2837 != null && field289 > var9.field2871) {
                                    if (var9.field2770 == null || field289 - var9.field2871 > 32) {
                                        class1 var103 = new class1();
                                        var103.field3 = var9;
                                        var103.field17 = var9.field2837;
                                        field493.method3491(var103);
                                    } else {
                                        label775: for (int var99 = var9.field2871; var99 < field289; var99++) {
                                            int var100 = field467[var99 & 0x1F];
                                            for (int var101 = 0; var101 < var9.field2770.length; var101++) {
                                                if (var9.field2770[var101] == var100) {
                                                    class1 var102 = new class1();
                                                    var102.field3 = var9;
                                                    var102.field17 = var9.field2837;
                                                    field493.method3491(var102);
                                                    break label775;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2871 = field289;
                                }
                                if (var9.field2839 != null && field305 > var9.field2872) {
                                    if (var9.field2840 == null || field305 - var9.field2872 > 32) {
                                        class1 var108 = new class1();
                                        var108.field3 = var9;
                                        var108.field17 = var9.field2839;
                                        field493.method3491(var108);
                                    } else {
                                        label751: for (int var104 = var9.field2872; var104 < field305; var104++) {
                                            int var105 = field469[var104 & 0x1F];
                                            for (int var106 = 0; var106 < var9.field2840.length; var106++) {
                                                if (var9.field2840[var106] == var105) {
                                                    class1 var107 = new class1();
                                                    var107.field3 = var9;
                                                    var107.field17 = var9.field2839;
                                                    field493.method3491(var107);
                                                    break label751;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2872 = field305;
                                }
                                if (field471 > var9.field2820 && var9.field2860 != null) {
                                    class1 var109 = new class1();
                                    var109.field3 = var9;
                                    var109.field17 = var9.field2860;
                                    field493.method3491(var109);
                                }
                                if (field490 > var9.field2820 && var9.field2760 != null) {
                                    class1 var110 = new class1();
                                    var110.field3 = var9;
                                    var110.field17 = var9.field2760;
                                    field493.method3491(var110);
                                }
                                if (field395 > var9.field2820 && var9.field2847 != null) {
                                    class1 var111 = new class1();
                                    var111.field3 = var9;
                                    var111.field17 = var9.field2847;
                                    field493.method3491(var111);
                                }
                                if (field474 > var9.field2820 && var9.field2852 != null) {
                                    class1 var112 = new class1();
                                    var112.field3 = var9;
                                    var112.field17 = var9.field2852;
                                    field493.method3491(var112);
                                }
                                if (field482 > var9.field2820 && var9.field2853 != null) {
                                    class1 var113 = new class1();
                                    var113.field3 = var9;
                                    var113.field17 = var9.field2853;
                                    field493.method3491(var113);
                                }
                                if (field386 > var9.field2820 && var9.field2748 != null) {
                                    class1 var114 = new class1();
                                    var114.field3 = var9;
                                    var114.field17 = var9.field2748;
                                    field493.method3491(var114);
                                }
                                var9.field2820 = field516;
                                if (var9.field2845 != null) {
                                    for (int var115 = 0; var115 < field502; var115++) {
                                        class1 var116 = new class1();
                                        var116.field3 = var9;
                                        var116.field7 = field459[var115];
                                        var116.field6 = field503[var115];
                                        var116.field17 = var9.field2845;
                                        field493.method3491(var116);
                                    }
                                }
                            }
                        }
                        if (!var9.field2861 && field277 == null && Statics.field1350 == null && !field552) {
                            if ((var9.field2857 >= 0 || var9.field2838 != 0) && class140.field2152 >= var12 && class140.field2156 * 121255813 >= var13 && class140.field2152 < var14 && class140.field2156 * 121255813 < var15) {
                                if (var9.field2857 >= 0) {
                                    Statics.field683 = arg0[var9.field2857];
                                } else {
                                    Statics.field683 = var9;
                                }
                            }
                            if (var9.field2746 == 8 && class140.field2152 >= var12 && class140.field2156 * 121255813 >= var13 && class140.field2152 < var14 && class140.field2156 * 121255813 < var15) {
                                Statics.field1371 = var9;
                            }
                            if (var9.field2768 > var9.field2775) {
                                method3225(var9, var9.field2759 + var10, var11, var9.field2775, var9.field2768, class140.field2152, class140.field2156 * 121255813);
                            }
                        }
                    } else if ((field530 == 0 || field530 == 3) && (class140.field2151 == 1 || !Statics.field215 && class140.field2151 == 4)) {
                        class175 var61 = var9.method3142(true);
                        if (var61 != null) {
                            int var62 = class140.field2154 - var10;
                            int var63 = class140.field2163 - var11;
                            if (var61.method3163(var62, var63)) {
                                int var64 = var62 - var61.field2884 / 2;
                                int var65 = var63 - var61.field2887 / 2;
                                int var66 = field366 + field352 & 0x7FF;
                                int var67 = class91.field1580[var66];
                                int var68 = class91.field1566[var66];
                                int var69 = (field354 + 256) * var67 >> 8;
                                int var70 = (field354 + 256) * var68 >> 8;
                                int var71 = var64 * var70 + var65 * var69 >> 11;
                                int var72 = var65 * var70 - var64 * var69 >> 11;
                                int var73 = Statics.field859.field826 + var71 >> 7;
                                int var74 = Statics.field859.field801 - var72 >> 7;
                                field321.method2547(240);
                                field321.method2285(18);
                                field321.method2326(class137.field2114[82] ? (class137.field2114[81] ? 2 : 1) : 0);
                                field321.method2287(Statics.field2893 + var74);
                                field321.method2287(Statics.field86 + var73);
                                field321.method2285(var64);
                                field321.method2285(var65);
                                field321.method2287(field366);
                                field321.method2285(57);
                                field321.method2285(field352);
                                field321.method2285(field354);
                                field321.method2285(89);
                                field321.method2287(Statics.field859.field826);
                                field321.method2287(Statics.field859.field801);
                                field321.method2285(63);
                                field483 = var73;
                                field514 = var74;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fm.ca([Lfe;II)V")
    public static final void method3182(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2746 == 0) {
                    if (var3.field2844 != null) {
                        method3182(var3.field2844, arg1);
                    }
                    class4 var4 = (class4) field519.method3462((long) var3.field2783);
                    if (var4 != null) {
                        int var5 = var4.field65;
                        if (Statics.method2098(var5)) {
                            method3182(Statics.field2802[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2849 != null) {
                    class1 var6 = new class1();
                    var6.field3 = var3;
                    var6.field17 = var3.field2849;
                    class37.method105(var6);
                }
                if (arg1 == 1 && var3.field2850 != null) {
                    if (var3.field2745 >= 0) {
                        class173 var7 = class173.method899(var3.field2783);
                        if (var7 == null || var7.field2844 == null || var3.field2745 >= var7.field2844.length || var7.field2844[var3.field2745] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field3 = var3;
                    var8.field17 = var3.field2850;
                    class37.method105(var8);
                }
            }
        }
    }

    @ObfuscatedName("ad.cp(Lfe;III)V")
    public static final void method723(class173 arg0, int arg1, int arg2) {
        if (field277 != null || field552 || arg0 == null) {
            return;
        }
        class173 var3 = arg0;
        int var4 = method136(arg0);
        int var5 = var4 >> 17 & 0x7;
        int var6 = var5;
        class173 var7;
        if (var5 == 0) {
            var7 = null;
        } else {
            int var8 = 0;
            while (true) {
                if (var8 >= var6) {
                    var7 = var3;
                    break;
                }
                var3 = class173.method899(var3.field2752);
                if (var3 == null) {
                    var7 = null;
                    break;
                }
                var8++;
            }
        }
        class173 var9 = var7;
        if (var7 == null) {
            var9 = arg0.field2817;
        }
        if (var9 == null) {
            return;
        }
        field277 = arg0;
        class173 var11 = arg0;
        int var12 = method136(arg0);
        int var13 = var12 >> 17 & 0x7;
        int var14 = var13;
        class173 var15;
        if (var13 == 0) {
            var15 = null;
        } else {
            int var16 = 0;
            while (true) {
                if (var16 >= var14) {
                    var15 = var11;
                    break;
                }
                var11 = class173.method899(var11.field2752);
                if (var11 == null) {
                    var15 = null;
                    break;
                }
                var16++;
            }
        }
        class173 var17 = var15;
        if (var15 == null) {
            var17 = arg0.field2817;
        }
        field453 = var17;
        field454 = arg1;
        field455 = arg2;
        Statics.field909 = 0;
        field463 = false;
        if (field421 > 0) {
            int var19 = field421 - 1;
            Statics.field1029 = new class31();
            Statics.field1029.field688 = field422[var19];
            Statics.field1029.field682 = field423[var19];
            Statics.field1029.field684 = field424[var19];
            Statics.field1029.field691 = field563[var19];
            Statics.field1029.field686 = field426[var19];
        }
        return;
    }

    @ObfuscatedName("ao.ct(I)V")
    public static final void method871() {
        method2240(field277);
        Statics.field909++;
        if (field292 && field457) {
            int var0 = class140.field2152;
            int var1 = class140.field2156 * 121255813;
            int var2 = var0 - field454;
            int var3 = var1 - field455;
            if (var2 < field458) {
                var2 = field458;
            }
            if (field277.field2759 + var2 > field458 + field453.field2759) {
                var2 = field458 + field453.field2759 - field277.field2759;
            }
            if (var3 < field331) {
                var3 = field331;
            }
            if (field277.field2775 + var3 > field331 + field453.field2775) {
                var3 = field331 + field453.field2775 - field277.field2775;
            }
            int var4 = var2 - field461;
            int var5 = var3 - field462;
            int var6 = field277.field2743;
            if (Statics.field909 > field277.field2848 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field463 = true;
            }
            int var7 = field453.field2765 + (var2 - field458);
            int var8 = field453.field2766 + (var3 - field331);
            if (field277.field2831 != null && field463) {
                class1 var9 = new class1();
                var9.field3 = field277;
                var9.field4 = var7;
                var9.field8 = var8;
                var9.field17 = field277.field2831;
                class37.method105(var9);
            }
            if (class140.field2161 == 0) {
                if (field463) {
                    if (field277.field2832 != null) {
                        class1 var10 = new class1();
                        var10.field3 = field277;
                        var10.field4 = var7;
                        var10.field8 = var8;
                        var10.field1 = field427;
                        var10.field17 = field277.field2832;
                        class37.method105(var10);
                    }
                    if (field427 != null) {
                        class173 var11 = field277;
                        int var12 = method136(var11);
                        int var13 = var12 >> 17 & 0x7;
                        int var14 = var13;
                        class173 var15;
                        if (var13 == 0) {
                            var15 = null;
                        } else {
                            int var16 = 0;
                            while (true) {
                                if (var16 >= var14) {
                                    var15 = var11;
                                    break;
                                }
                                var11 = class173.method899(var11.field2752);
                                if (var11 == null) {
                                    var15 = null;
                                    break;
                                }
                                var16++;
                            }
                        }
                        if (var15 != null) {
                            field321.method2547(209);
                            field321.method2373(field427.field2867);
                            field321.method2342(field277.field2783);
                            field321.method2342(field427.field2783);
                            field321.method2287(field277.field2867);
                            field321.method2332(field427.field2745);
                            field321.method2373(field277.field2745);
                        }
                    }
                } else if ((field419 == 1 || method1444(field421 - 1)) && field421 > 2) {
                    method2(field461 + field454, field462 + field455);
                } else if (field421 > 0) {
                    method2974(field461 + field454, field462 + field455);
                }
                field277 = null;
            }
        } else if (Statics.field909 > 1) {
            field277 = null;
        }
    }

    @ObfuscatedName("fj.ck(III)V")
    public static void method2974(int arg0, int arg1) {
        method912(Statics.field1029, arg0, arg1);
        Statics.field1029 = null;
    }

    @ObfuscatedName("dt.cf(Lfe;B)V")
    public static void method2240(class173 arg0) {
        if (field465 == arg0.field2874) {
            field428[arg0.field2873] = true;
        }
    }

    @ObfuscatedName("bb.cx(I)V")
    public static void method1197() {
        for (class4 var0 = (class4) field519.method3464(); var0 != null; var0 = (class4) field519.method3465()) {
            int var1 = var0.field65;
            if (Statics.method2098(var1)) {
                boolean var2 = true;
                class173[] var3 = Statics.field2802[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2861;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3102;
                    class173 var6 = class173.method899(var5);
                    if (var6 != null) {
                        method2240(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("de.cv([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2242(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("fs.cn(IB)V")
    public static final void method3095(int arg0) {
        if (!Statics.method2098(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2802[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3 != null) {
                var3.field2864 = 0;
                var3.field2865 = 0;
            }
        }
    }

    @ObfuscatedName("z.cz(II)V")
    public static final void method1(int arg0) {
        if (Statics.method2098(arg0)) {
            method600(Statics.field2802[arg0], -1);
        }
    }

    @ObfuscatedName("aw.cj([Lfe;II)V")
    public static final void method600(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null && var3.field2752 == arg1 && (!var3.field2861 || !Statics.method1988(var3))) {
                if (var3.field2746 == 0) {
                    if (!var3.field2861 && Statics.method1988(var3) && Statics.field683 != var3) {
                        continue;
                    }
                    method600(arg0, var3.field2783);
                    if (var3.field2844 != null) {
                        method600(var3.field2844, var3.field2783);
                    }
                    class4 var4 = (class4) field519.method3462((long) var3.field2783);
                    if (var4 != null) {
                        method1(var4.field65);
                    }
                }
                if (var3.field2746 == 6) {
                    if (var3.field2789 != -1 || var3.field2790 != -1) {
                        boolean var5 = method680(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2790;
                        } else {
                            var6 = var3.field2789;
                        }
                        if (var6 != -1) {
                            class43 var7 = class43.method72(var6);
                            var3.field2865 += field357;
                            while (var3.field2865 > var7.field981[var3.field2864]) {
                                var3.field2865 -= var7.field981[var3.field2864];
                                var3.field2864++;
                                if (var3.field2864 >= var7.field974.length) {
                                    var3.field2864 -= var7.field977;
                                    if (var3.field2864 < 0 || var3.field2864 >= var7.field974.length) {
                                        var3.field2864 = 0;
                                    }
                                }
                                method2240(var3);
                            }
                        }
                    }
                    if (var3.field2798 != 0 && !var3.field2861) {
                        int var8 = var3.field2798 >> 16;
                        int var9 = var3.field2798 << 16 >> 16;
                        int var10 = field357 * var8;
                        int var11 = field357 * var9;
                        var3.field2862 = var3.field2862 + var10 & 0x7FF;
                        var3.field2794 = var3.field2794 + var11 & 0x7FF;
                        method2240(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("df.cw(IB)V")
    public static final void method2179(int arg0) {
        method1197();
        for (class24 var1 = (class24) class24.field602.method3502(); var1 != null; var1 = (class24) class24.field602.method3489()) {
            if (var1.field592 != null) {
                var1.method557();
            }
        }
        int var2 = Statics.method2235(arg0).field1153;
        if (var2 == 0) {
            return;
        }
        int var3 = class176.field2892[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class91.method1897(0.9D);
                ((class95) Statics.field1572).method1975(0.9D);
            }
            if (var3 == 2) {
                class91.method1897(0.8D);
                ((class95) Statics.field1572).method1975(0.8D);
            }
            if (var3 == 3) {
                class91.method1897(0.7D);
                ((class95) Statics.field1572).method1975(0.7D);
            }
            if (var3 == 4) {
                class91.method1897(0.6D);
                ((class95) Statics.field1572).method1975(0.6D);
            }
            class52.field1107.method3430();
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
            if (field517 != var4) {
                if (field517 == 0 && field518 != -1) {
                    class183.method96(Statics.field1608, field518, 0, var4, false);
                    field489 = false;
                } else if (var4 == 0) {
                    Statics.field2943.method3302();
                    class183.field2944 = 1;
                    Statics.field2945 = null;
                    field489 = false;
                } else if (class183.field2944 == 0) {
                    Statics.field2943.method3374(var4);
                } else {
                    Statics.field2727 = var4;
                }
                field517 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field319 = 127;
            }
            if (var3 == 1) {
                field319 = 96;
            }
            if (var3 == 2) {
                field319 = 64;
            }
            if (var3 == 3) {
                field319 = 32;
            }
            if (var3 == 4) {
                field319 = 0;
            }
        }
        if (var2 == 5) {
            field419 = var3;
        }
        if (var2 == 6) {
            field441 = var3;
        }
        if (var2 == 9) {
            field442 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field342 = 127;
            }
            if (var3 == 1) {
                field342 = 96;
            }
            if (var3 == 2) {
                field342 = 64;
            }
            if (var3 == 3) {
                field342 = 32;
            }
            if (var3 == 4) {
                field342 = 0;
            }
        }
        if (var2 == 17) {
            field485 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field306 = (class21) class109.method2221(class21.method104(), var3);
            if (field306 == null) {
                field306 = class21.field573;
            }
        }
        if (var2 != 19) {
            return;
        }
        if (var3 == -1) {
            field411 = -1;
        } else {
            field411 = var3 & 0x7FF;
        }
    }

    @ObfuscatedName("ey.ch(Lfe;B)V")
    public static final void method2672(class173 arg0) {
        int var1 = arg0.field2870;
        if (var1 == 324) {
            if (field554 == -1) {
                field554 = arg0.field2777;
                field356 = arg0.field2778;
            }
            if (field553.field2904) {
                arg0.field2777 = field554;
            } else {
                arg0.field2777 = field356;
            }
        } else if (var1 == 325) {
            if (field554 == -1) {
                field554 = arg0.field2777;
                field356 = arg0.field2778;
            }
            if (field553.field2904) {
                arg0.field2777 = field356;
            } else {
                arg0.field2777 = field554;
            }
        } else if (var1 == 327) {
            arg0.field2862 = 150;
            arg0.field2794 = (int) (Math.sin((double) field290 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2785 = 5;
            arg0.field2786 = 0;
        } else if (var1 == 328) {
            arg0.field2862 = 150;
            arg0.field2794 = (int) (Math.sin((double) field290 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2785 = 5;
            arg0.field2786 = 1;
        }
    }

    @ObfuscatedName("ag.db(IIII)Lf;")
    public static final class4 method973(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field65 = arg1;
        var3.field58 = arg2;
        field519.method3470(var3, (long) arg0);
        method3095(arg1);
        class173 var4 = class173.method899(arg0);
        method2240(var4);
        if (field443 != null) {
            method2240(field443);
            field443 = null;
        }
        method975();
        method3094(Statics.field2802[arg0 >> 16], var4, false);
        class37.method176(arg1);
        if (field439 != -1) {
            int var5 = field439;
            if (Statics.method2098(var5)) {
                method3182(Statics.field2802[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("ak.df(Lf;ZI)V")
    public static final void method683(class4 arg0, boolean arg1) {
        int var2 = arg0.field65;
        int var3 = (int) arg0.field3102;
        arg0.method3583();
        if (arg1 && var2 != -1 && Statics.field2749[var2]) {
            Statics.field2739.method3014(var2);
            if (Statics.field2802[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2802[var2].length; var5++) {
                    if (Statics.field2802[var2][var5] != null) {
                        if (Statics.field2802[var2][var5].field2746 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2802[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2802[var2] = null;
                }
                Statics.field2749[var2] = false;
            }
        }
        method3418(var2);
        class173 var6 = class173.method899(var3);
        if (var6 != null) {
            method2240(var6);
        }
        method975();
        if (field439 != -1) {
            int var7 = field439;
            if (Statics.method2098(var7)) {
                method3182(Statics.field2802[var7], 1);
            }
        }
    }

    @ObfuscatedName("dy.dd(Lfe;S)Z")
    public static final boolean method2222(class173 arg0) {
        int var1 = arg0.field2870;
        if (var1 == 205) {
            field391 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field553.method3190(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field553.method3203(var4, var5 == 1);
        }
        if (var1 == 324) {
            field553.method3207(false);
        }
        if (var1 == 325) {
            field553.method3207(true);
        }
        if (var1 == 326) {
            field321.method2547(248);
            field553.method3198(field321);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fk.dv(Lfe;IIII)V")
    public static final void method2900(class173 arg0, int arg1, int arg2, int arg3) {
        class175 var4 = arg0.method3142(false);
        if (var4 == null) {
            return;
        }
        if (field530 < 3) {
            Statics.field813.method1564(arg1, arg2, var4.field2884, var4.field2887, 25, 25, field366, 256, var4.field2885, var4.field2886);
        } else {
            class80.method1649(arg1, arg2, 0, var4.field2885, var4.field2886);
        }
    }

    @ObfuscatedName("bj.dy(IIIILcg;Lfr;I)V")
    public static final void method1138(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            Statics.method123(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field366 + field352 & 0x7FF;
        int var8 = class91.field1580[var7];
        int var9 = class91.field1566[var7];
        int var10 = var8 * 256 / (field354 + 256);
        int var11 = var9 * 256 / (field354 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field161.method1565(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("bn.di(Ljava/lang/String;ZB)Z")
    public static boolean method1469(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class164.method535(arg0, Statics.field2027);
        for (int var3 = 0; var3 < field547; var3++) {
            if (var2.equalsIgnoreCase(class164.method535(field549[var3].field253, Statics.field2027)) && (!arg1 || field549[var3].field247 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class164.method535(Statics.field859.field37, Statics.field2027))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fn.dn(Ljava/lang/String;B)Z")
    public static boolean method2936(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class164.method535(arg0, Statics.field2027);
        for (int var2 = 0; var2 < field322; var2++) {
            class8 var3 = field476[var2];
            if (var1.equalsIgnoreCase(class164.method535(var3.field137, Statics.field2027))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class164.method535(var3.field133, Statics.field2027))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("y.dm(Ljava/lang/String;I)V")
    public static final void method560(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field547 < 200 || field404 == 1) || field547 >= 400) {
            class12.method2763(30, "", class157.field2472);
            return;
        }
        String var1 = class164.method535(arg0, Statics.field2027);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field547; var2++) {
            class18 var3 = field549[var2];
            String var4 = class164.method535(var3.field253, Statics.field2027);
            if (var4 != null && var4.equals(var1)) {
                class12.method2763(30, "", arg0 + class157.field2573);
                return;
            }
            if (var3.field243 != null) {
                String var5 = class164.method535(var3.field243, Statics.field2027);
                if (var5 != null && var5.equals(var1)) {
                    class12.method2763(30, "", arg0 + class157.field2573);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field322; var6++) {
            class8 var7 = field476[var6];
            String var8 = class164.method535(var7.field137, Statics.field2027);
            if (var8 != null && var8.equals(var1)) {
                class12.method2763(30, "", class157.field2417 + arg0 + class157.field2438);
                return;
            }
            if (var7.field133 != null) {
                String var9 = class164.method535(var7.field133, Statics.field2027);
                if (var9 != null && var9.equals(var1)) {
                    class12.method2763(30, "", class157.field2417 + arg0 + class157.field2438);
                    return;
                }
            }
        }
        if (class164.method535(Statics.field859.field37, Statics.field2027).equals(var1)) {
            class12.method2763(30, "", class157.field2476);
        } else {
            field321.method2547(38);
            field321.method2285(class119.method2618(arg0));
            field321.method2393(arg0);
        }
    }

    @ObfuscatedName("r.do(Ljava/lang/String;I)V")
    public static final void method99(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class164.method535(arg0, Statics.field2027);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field547; var2++) {
            class18 var3 = field549[var2];
            String var4 = var3.field253;
            String var5 = class164.method535(var4, Statics.field2027);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field547--;
                for (int var7 = var2; var7 < field547; var7++) {
                    field549[var7] = field549[var7 + 1];
                }
                field490 = field516;
                field321.method2547(137);
                field321.method2285(class119.method2618(arg0));
                field321.method2393(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("aa.dt(Ljava/lang/String;B)V")
    public static final void method895(String arg0) {
        if (Statics.field76 != null) {
            field321.method2547(182);
            field321.method2285(class119.method2618(arg0));
            field321.method2393(arg0);
        }
    }

    @ObfuscatedName("dz.de(Ljava/lang/String;B)V")
    public static final void method2617(String arg0) {
        if (!arg0.equals("")) {
            field321.method2547(93);
            field321.method2285(class119.method2618(arg0));
            field321.method2393(arg0);
        }
    }

    @ObfuscatedName("u.dw(S)V")
    public static final void method183() {
        field321.method2547(93);
        field321.method2285(0);
    }

    @ObfuscatedName("gz.dr(II)V")
    public static void method3418(int arg0) {
        for (class201 var1 = (class201) field447.method3464(); var1 != null; var1 = (class201) field447.method3465()) {
            if ((long) arg0 == (var1.field3102 >> 48 & 0xFFFFL)) {
                var1.method3583();
            }
        }
    }

    @ObfuscatedName("a.da(Lfe;I)I")
    public static int method136(class173 arg0) {
        class201 var1 = (class201) field447.method3462(((long) arg0.field2783 << 32) + (long) arg0.field2745);
        return var1 == null ? arg0.field2814 : var1.field3088;
    }

    @ObfuscatedName("dd.dg(Lfe;II)Ljava/lang/String;")
    public static String method2180(class173 arg0, int arg1) {
        int var2 = method136(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2842 == null) {
            return null;
        } else if (arg0.field2835 == null || arg0.field2835.length <= arg1 || arg0.field2835[arg1] == null || arg0.field2835[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2835[arg1];
        }
    }

    @ObfuscatedName("ad.dc(Lfe;B)Ljava/lang/String;")
    public static String method725(class173 arg0) {
        int var1 = method136(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2821 == null || arg0.field2821.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2821;
        }
    }

    @ObfuscatedName("ch.dj(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method2099(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field468 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field468 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field468 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field468 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field468 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1053 != null) {
            var3 = "/p=" + Statics.field1053;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field456 + "/a=" + Statics.field2896 + var3 + "/";
    }

    @ObfuscatedName("cu.dp(Ljava/lang/String;B)V")
    public static void method1888(String arg0) {
        Statics.field1053 = arg0;
        try {
            String var1 = Statics.field287.getParameter(class190.field3048.field3051);
            String var2 = Statics.field287.getParameter(class190.field3049.field3051);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class115.method82() + 94608000000L;
                class111.field1950.setTime(new Date(var6));
                int var8 = class111.field1950.get(7);
                int var9 = class111.field1950.get(5);
                int var10 = class111.field1950.get(2);
                int var11 = class111.field1950.get(1);
                int var12 = class111.field1950.get(11);
                int var13 = class111.field1950.get(12);
                int var14 = class111.field1950.get(13);
                String var15 = class111.field1945[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class111.field1948[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            class132.method2641(Statics.field287, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var17) {
        }
    }
}

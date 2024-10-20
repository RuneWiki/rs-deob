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
import java.util.LinkedHashMap;

public final class client extends class145 {

    @ObfuscatedName("client.g")
    public static boolean field414 = true;

    @ObfuscatedName("client.h")
    public static int field479 = 1;

    @ObfuscatedName("client.z")
    public static int field284 = 0;

    @ObfuscatedName("client.f")
    public static int field385 = 0;

    @ObfuscatedName("client.l")
    public static boolean field287 = false;

    @ObfuscatedName("client.p")
    public static boolean field288 = false;

    @ObfuscatedName("client.k")
    public static int field289 = 0;

    @ObfuscatedName("client.u")
    public static int field463 = 0;

    @ObfuscatedName("client.c")
    public static boolean field293 = true;

    @ObfuscatedName("client.n")
    public static int field333 = 0;

    @ObfuscatedName("client.q")
    public static long field309 = -1L;

    @ObfuscatedName("client.m")
    public static int field296 = -1;

    @ObfuscatedName("client.w")
    public static class109[] field345 = new class109[4];

    @ObfuscatedName("client.e")
    public static int field297 = -1;

    @ObfuscatedName("client.ad")
    public static int field298 = -1;

    @ObfuscatedName("client.as")
    public static boolean field299 = true;

    @ObfuscatedName("client.ag")
    public static boolean field377 = false;

    @ObfuscatedName("client.al")
    public static int field301 = 0;

    @ObfuscatedName("client.av")
    public static int field302 = 0;

    @ObfuscatedName("client.ar")
    public static int field407 = 0;

    @ObfuscatedName("client.ay")
    public static int field507 = 0;

    @ObfuscatedName("client.aq")
    public static int field305 = 0;

    @ObfuscatedName("client.ai")
    public static int field306 = 0;

    @ObfuscatedName("client.an")
    public static int field307 = 0;

    @ObfuscatedName("client.aw")
    public static int field308 = 0;

    @ObfuscatedName("client.ap")
    public static int field524 = 0;

    @ObfuscatedName("client.ao")
    public static class21 field310 = class21.field571;

    @ObfuscatedName("client.aj")
    public static class21 field459 = class21.field571;

    @ObfuscatedName("client.ae")
    public static int field312 = 0;

    @ObfuscatedName("client.ab")
    public static int field314 = 0;

    @ObfuscatedName("client.am")
    public static int field315 = 0;

    @ObfuscatedName("client.by")
    public static int field529 = 0;

    @ObfuscatedName("client.bt")
    public static int field317 = 0;

    @ObfuscatedName("client.bm")
    public static int field318 = 0;

    @ObfuscatedName("client.bv")
    public static int field319 = 0;

    @ObfuscatedName("client.bk")
    public static int field361 = 0;

    @ObfuscatedName("client.cv")
    public static class35[] field321 = new class35[32768];

    @ObfuscatedName("client.ct")
    public static int field294 = 0;

    @ObfuscatedName("client.cf")
    public static int[] field323 = new int[32768];

    @ObfuscatedName("client.cb")
    public static int field324 = 0;

    @ObfuscatedName("client.ci")
    public static int[] field286 = new int[250];

    @ObfuscatedName("client.cc")
    public static class123 field326 = new class123(5000);

    @ObfuscatedName("client.cm")
    public static class123 field327 = new class123(5000);

    @ObfuscatedName("client.cy")
    public static class123 field328 = new class123(15000);

    @ObfuscatedName("client.cr")
    public static int field329 = 0;

    @ObfuscatedName("client.cx")
    public static int field330 = 0;

    @ObfuscatedName("client.cu")
    public static int field482 = 0;

    @ObfuscatedName("client.cw")
    public static int field515 = 0;

    @ObfuscatedName("client.ck")
    public static int field391 = 0;

    @ObfuscatedName("client.cs")
    public static int field334 = 0;

    @ObfuscatedName("client.cl")
    public static int field335 = 0;

    @ObfuscatedName("client.cn")
    public static int field336 = 0;

    @ObfuscatedName("client.ce")
    public static boolean field337 = false;

    @ObfuscatedName("client.ds")
    public static int field339 = 0;

    @ObfuscatedName("client.dq")
    public static int field340 = 1;

    @ObfuscatedName("client.di")
    public static int field341 = 0;

    @ObfuscatedName("client.dz")
    public static int field342 = 1;

    @ObfuscatedName("client.dm")
    public static int field404 = 0;

    @ObfuscatedName("client.dj")
    public static boolean field346 = false;

    @ObfuscatedName("client.dv")
    public static int[][][] field347 = new int[4][13][13];

    @ObfuscatedName("client.dx")
    public static final int[] field348 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.df")
    public static int field446 = 0;

    @ObfuscatedName("client.dh")
    public static int field350 = 2;

    @ObfuscatedName("client.dn")
    public static int field351 = 0;

    @ObfuscatedName("client.dy")
    public static int field352 = 2;

    @ObfuscatedName("client.dl")
    public static int field353 = 0;

    @ObfuscatedName("client.eg")
    public static int field354 = 1;

    @ObfuscatedName("client.es")
    public static int field355 = 0;

    @ObfuscatedName("client.em")
    public static int field356 = 0;

    @ObfuscatedName("client.et")
    public static int field357 = 2;

    @ObfuscatedName("client.ef")
    public static int field358 = 0;

    @ObfuscatedName("client.ea")
    public static int field408 = 1;

    @ObfuscatedName("client.ek")
    public static int field360 = 0;

    @ObfuscatedName("client.ez")
    public static int field331 = 0;

    @ObfuscatedName("client.ex")
    public static int field362 = 2301979;

    @ObfuscatedName("client.el")
    public static int field363 = 5063219;

    @ObfuscatedName("client.ei")
    public static int field364 = 3353893;

    @ObfuscatedName("client.ej")
    public static int field365 = 7759444;

    @ObfuscatedName("client.ec")
    public static boolean field458 = false;

    @ObfuscatedName("client.fl")
    public static int field367 = 0;

    @ObfuscatedName("client.fh")
    public static int field368 = 128;

    @ObfuscatedName("client.fi")
    public static int field303 = 0;

    @ObfuscatedName("client.fo")
    public static int field370 = 0;

    @ObfuscatedName("client.fm")
    public static int field510 = 0;

    @ObfuscatedName("client.fw")
    public static int field372 = 0;

    @ObfuscatedName("client.fp")
    public static int field373 = 0;

    @ObfuscatedName("client.fe")
    public static int field374 = 50;

    @ObfuscatedName("client.ft")
    public static int field384 = 0;

    @ObfuscatedName("client.fb")
    public static boolean field498 = false;

    @ObfuscatedName("client.fr")
    public static int field472 = 0;

    @ObfuscatedName("client.fq")
    public static int field378 = 0;

    @ObfuscatedName("client.fv")
    public static int field379 = 50;

    @ObfuscatedName("client.fz")
    public static int[] field555 = new int[field379];

    @ObfuscatedName("client.fk")
    public static int[] field381 = new int[field379];

    @ObfuscatedName("client.fc")
    public static int[] field382 = new int[field379];

    @ObfuscatedName("client.fs")
    public static int[] field431 = new int[field379];

    @ObfuscatedName("client.fd")
    public static int[] field551 = new int[field379];

    @ObfuscatedName("client.fy")
    public static int[] field369 = new int[field379];

    @ObfuscatedName("client.gl")
    public static int[] field386 = new int[field379];

    @ObfuscatedName("client.gd")
    public static String[] field448 = new String[field379];

    @ObfuscatedName("client.gj")
    public static int[][] field388 = new int[104][104];

    @ObfuscatedName("client.gx")
    public static int field389 = 0;

    @ObfuscatedName("client.gh")
    public static int field390 = -1;

    @ObfuscatedName("client.gw")
    public static int field366 = -1;

    @ObfuscatedName("client.gq")
    public static int field392 = 0;

    @ObfuscatedName("client.gf")
    public static int field322 = 0;

    @ObfuscatedName("client.gi")
    public static int field394 = 0;

    @ObfuscatedName("client.gy")
    public static int field395 = 0;

    @ObfuscatedName("client.gv")
    public static int field565 = 0;

    @ObfuscatedName("client.gs")
    public static int field398 = 0;

    @ObfuscatedName("client.gt")
    public static int field399 = 0;

    @ObfuscatedName("client.gm")
    public static int field425 = 0;

    @ObfuscatedName("client.gr")
    public static int field316 = 0;

    @ObfuscatedName("client.gz")
    public static int field402 = 0;

    @ObfuscatedName("client.ge")
    public static boolean field403 = false;

    @ObfuscatedName("client.gb")
    public static int field441 = 0;

    @ObfuscatedName("client.gk")
    public static int field405 = 0;

    @ObfuscatedName("client.gu")
    public static class3[] field406 = new class3[2048];

    @ObfuscatedName("client.gg")
    public static int field461 = -1;

    @ObfuscatedName("client.he")
    public static int field452 = 0;

    @ObfuscatedName("client.hf")
    public static int field517 = 0;

    @ObfuscatedName("client.hn")
    public static int[] field410 = new int[1000];

    @ObfuscatedName("client.ht")
    public static final int[] field411 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hw")
    public static String[] field462 = new String[8];

    @ObfuscatedName("client.hr")
    public static boolean[] field413 = new boolean[8];

    @ObfuscatedName("client.hp")
    public static int[] field439 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hb")
    public static int field485 = -1;

    @ObfuscatedName("client.hq")
    public static class200[][][] field416 = new class200[4][104][104];

    @ObfuscatedName("client.hi")
    public static class200 field543 = new class200();

    @ObfuscatedName("client.hu")
    public static class200 field418 = new class200();

    @ObfuscatedName("client.ho")
    public static class200 field447 = new class200();

    @ObfuscatedName("client.hm")
    public static int[] field304 = new int[25];

    @ObfuscatedName("client.hs")
    public static int[] field421 = new int[25];

    @ObfuscatedName("client.hv")
    public static int[] field422 = new int[25];

    @ObfuscatedName("client.hx")
    public static int field423 = 0;

    @ObfuscatedName("client.hy")
    public static boolean field424 = false;

    @ObfuscatedName("client.hl")
    public static int field295 = 0;

    @ObfuscatedName("client.hk")
    public static int[] field426 = new int[500];

    @ObfuscatedName("client.il")
    public static int[] field427 = new int[500];

    @ObfuscatedName("client.iw")
    public static int[] field393 = new int[500];

    @ObfuscatedName("client.ir")
    public static int[] field503 = new int[500];

    @ObfuscatedName("client.ij")
    public static String[] field430 = new String[500];

    @ObfuscatedName("client.if")
    public static String[] field338 = new String[500];

    @ObfuscatedName("client.ih")
    public static int field432 = -1;

    @ObfuscatedName("client.id")
    public static int field376 = -1;

    @ObfuscatedName("client.ip")
    public static int field434 = 0;

    @ObfuscatedName("client.im")
    public static int field435 = 50;

    @ObfuscatedName("client.ia")
    public static int field380 = 0;

    @ObfuscatedName("client.it")
    public static String field464 = null;

    @ObfuscatedName("client.in")
    public static boolean field438 = false;

    @ObfuscatedName("client.iu")
    public static int field343 = -1;

    @ObfuscatedName("client.is")
    public static int field440 = -1;

    @ObfuscatedName("client.ie")
    public static String field433 = null;

    @ObfuscatedName("client.iv")
    public static String field442 = null;

    @ObfuscatedName("client.io")
    public static int field443 = -1;

    @ObfuscatedName("client.ik")
    public static class197 field444 = new class197(8);

    @ObfuscatedName("client.jb")
    public static int field445 = 0;

    @ObfuscatedName("client.jr")
    public static int field451 = 0;

    @ObfuscatedName("client.jg")
    public static class174 field400 = null;

    @ObfuscatedName("client.jy")
    public static int field532 = 0;

    @ObfuscatedName("client.jj")
    public static int field449 = 0;

    @ObfuscatedName("client.jt")
    public static int field450 = 0;

    @ObfuscatedName("client.jl")
    public static int field371 = -1;

    @ObfuscatedName("client.jh")
    public static boolean field540 = false;

    @ObfuscatedName("client.jp")
    public static boolean field453 = false;

    @ObfuscatedName("client.ji")
    public static boolean field454 = false;

    @ObfuscatedName("client.jk")
    public static class174 field455 = null;

    @ObfuscatedName("client.je")
    public static class174 field456 = null;

    @ObfuscatedName("client.jf")
    public static class174 field457 = null;

    @ObfuscatedName("client.ju")
    public static int field492 = 0;

    @ObfuscatedName("client.ja")
    public static int field349 = 0;

    @ObfuscatedName("client.jd")
    public static class174 field460 = null;

    @ObfuscatedName("client.jv")
    public static boolean field417 = false;

    @ObfuscatedName("client.jo")
    public static int field280 = -1;

    @ObfuscatedName("client.jm")
    public static int field409 = -1;

    @ObfuscatedName("client.jw")
    public static boolean field428 = false;

    @ObfuscatedName("client.jz")
    public static int field504 = -1;

    @ObfuscatedName("client.js")
    public static int field466 = -1;

    @ObfuscatedName("client.jq")
    public static boolean field514 = false;

    @ObfuscatedName("client.kz")
    public static int field468 = 1;

    @ObfuscatedName("client.kh")
    public static int[] field513 = new int[32];

    @ObfuscatedName("client.kd")
    public static int field470 = 0;

    @ObfuscatedName("client.km")
    public static int[] field471 = new int[32];

    @ObfuscatedName("client.ko")
    public static int field387 = 0;

    @ObfuscatedName("client.ks")
    public static int[] field473 = new int[32];

    @ObfuscatedName("client.ke")
    public static int field474 = 0;

    @ObfuscatedName("client.kc")
    public static int field475 = 0;

    @ObfuscatedName("client.ku")
    public static int field476 = 0;

    @ObfuscatedName("client.ky")
    public static int field383 = 0;

    @ObfuscatedName("client.kt")
    public static int field478 = 0;

    @ObfuscatedName("client.kl")
    public static int field538 = 0;

    @ObfuscatedName("client.kj")
    public static int field480 = 0;

    @ObfuscatedName("client.kw")
    public static int field481 = 0;

    @ObfuscatedName("client.ka")
    public static class200 field396 = new class200();

    @ObfuscatedName("client.kq")
    public static class200 field483 = new class200();

    @ObfuscatedName("client.kx")
    public static class200 field484 = new class200();

    @ObfuscatedName("client.kb")
    public static class197 field429 = new class197(512);

    @ObfuscatedName("client.kp")
    public static int field486 = 0;

    @ObfuscatedName("client.kr")
    public static int field469 = -2;

    @ObfuscatedName("client.ld")
    public static boolean[] field397 = new boolean[100];

    @ObfuscatedName("client.lr")
    public static boolean[] field489 = new boolean[100];

    @ObfuscatedName("client.ly")
    public static boolean[] field547 = new boolean[100];

    @ObfuscatedName("client.lm")
    public static int[] field491 = new int[100];

    @ObfuscatedName("client.lb")
    public static int[] field437 = new int[100];

    @ObfuscatedName("client.lf")
    public static int[] field536 = new int[100];

    @ObfuscatedName("client.lu")
    public static int[] field494 = new int[100];

    @ObfuscatedName("client.le")
    public static int field495 = 0;

    @ObfuscatedName("client.la")
    public static long field496 = 0L;

    @ObfuscatedName("client.ls")
    public static boolean field497 = true;

    @ObfuscatedName("client.lt")
    public static int field566 = 765;

    @ObfuscatedName("client.lc")
    public static int field499 = 1;

    @ObfuscatedName("client.lw")
    public static int[] field500 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lh")
    public static int field501 = 0;

    @ObfuscatedName("client.lx")
    public static int field502 = 0;

    @ObfuscatedName("client.lp")
    public static String field300 = "";

    @ObfuscatedName("client.lg")
    public static long[] field488 = new long[100];

    @ObfuscatedName("client.lv")
    public static int field505 = 0;

    @ObfuscatedName("client.lo")
    public static int field506 = 0;

    @ObfuscatedName("client.mb")
    public static int[] field563 = new int[128];

    @ObfuscatedName("client.mf")
    public static int[] field508 = new int[128];

    @ObfuscatedName("client.mh")
    public static long field509 = -1L;

    @ObfuscatedName("client.mc")
    public static String field283 = null;

    @ObfuscatedName("client.mw")
    public static String field511 = null;

    @ObfuscatedName("client.mt")
    public static int field512 = -1;

    @ObfuscatedName("client.md")
    public static int field311 = 0;

    @ObfuscatedName("client.mz")
    public static int[] field412 = new int[1000];

    @ObfuscatedName("client.mm")
    public static int[] field493 = new int[1000];

    @ObfuscatedName("client.mv")
    public static class79[] field465 = new class79[1000];

    @ObfuscatedName("client.mq")
    public static int field546 = 0;

    @ObfuscatedName("client.mx")
    public static int field518 = 0;

    @ObfuscatedName("client.mg")
    public static int field550 = 0;

    @ObfuscatedName("client.ms")
    public static int field520 = 255;

    @ObfuscatedName("client.me")
    public static int field521 = -1;

    @ObfuscatedName("client.mn")
    public static boolean field522 = false;

    @ObfuscatedName("client.ne")
    public static int field561 = 127;

    @ObfuscatedName("client.nm")
    public static int field375 = 127;

    @ObfuscatedName("client.nh")
    public static int field525 = 0;

    @ObfuscatedName("client.nc")
    public static int[] field526 = new int[50];

    @ObfuscatedName("client.np")
    public static int[] field320 = new int[50];

    @ObfuscatedName("client.nx")
    public static int[] field528 = new int[50];

    @ObfuscatedName("client.nv")
    public static int[] field533 = new int[50];

    @ObfuscatedName("client.ni")
    public static class59[] field530 = new class59[50];

    @ObfuscatedName("client.nu")
    public static boolean field531 = false;

    @ObfuscatedName("client.on")
    public static boolean[] field487 = new boolean[5];

    @ObfuscatedName("client.os")
    public static int[] field282 = new int[5];

    @ObfuscatedName("client.ol")
    public static int[] field534 = new int[5];

    @ObfuscatedName("client.oi")
    public static int[] field535 = new int[5];

    @ObfuscatedName("client.op")
    public static int[] field467 = new int[5];

    @ObfuscatedName("client.ou")
    public static short field537 = 256;

    @ObfuscatedName("client.oe")
    public static short field420 = 205;

    @ObfuscatedName("client.ox")
    public static short field539 = 256;

    @ObfuscatedName("client.oq")
    public static short field519 = 320;

    @ObfuscatedName("client.or")
    public static short field541 = 1;

    @ObfuscatedName("client.oj")
    public static short field542 = 32767;

    @ObfuscatedName("client.ow")
    public static short field527 = 1;

    @ObfuscatedName("client.om")
    public static short field544 = 32767;

    @ObfuscatedName("client.ov")
    public static int field545 = 0;

    @ObfuscatedName("client.oy")
    public static int field490 = 0;

    @ObfuscatedName("client.ot")
    public static int field415 = 0;

    @ObfuscatedName("client.oz")
    public static int field548 = 0;

    @ObfuscatedName("client.oh")
    public static int field549 = 0;

    @ObfuscatedName("client.od")
    public static int field419 = 0;

    @ObfuscatedName("client.oo")
    public static int field523 = 0;

    @ObfuscatedName("client.ob")
    public static class18[] field552 = new class18[400];

    @ObfuscatedName("client.of")
    public static class196 field553 = new class196();

    @ObfuscatedName("client.oc")
    public static int field554 = 0;

    @ObfuscatedName("client.ok")
    public static class8[] field401 = new class8[400];

    @ObfuscatedName("client.pb")
    public static class180 field556 = new class180();

    @ObfuscatedName("client.pt")
    public static int field557 = -1;

    @ObfuscatedName("client.po")
    public static int field558 = -1;

    @ObfuscatedName("client.pq")
    public static class221[] field559 = new class221[8];

    @ObfuscatedName("client.pj")
    public static long field477 = -1L;

    @ObfuscatedName("client.py")
    public static long field562 = -1L;

    @ObfuscatedName("client.pc")
    public static final class11 field325 = new class11();

    @ObfuscatedName("client.pa")
    public static int[] field564 = new int[50];

    @ObfuscatedName("client.px")
    public static int[] field436 = new int[50];

    @ObfuscatedName("client.g(I)V")
    public final void method207() {
    }

    public final void init() {
        if (!this.method2807()) {
            return;
        }
        class191[] var1 = new class191[] { class191.field3072, class191.field3079, class191.field3070, class191.field3066, class191.field3073, class191.field3076, class191.field3071, class191.field3074, class191.field3069, class191.field3078, class191.field3080, class191.field3081, class191.field3077, class191.field3067, class191.field3075 };
        class191[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class191 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3068);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3068)) {
                    case 1:
                        if (var5.equalsIgnoreCase(class2.field28)) {
                        }
                        break;
                    case 2:
                        Statics.field132 = Integer.parseInt(var5);
                        break;
                    case 3:
                        field479 = Integer.parseInt(var5);
                        break;
                    case 4:
                        field289 = Integer.parseInt(var5);
                        break;
                    case 5:
                        field284 = Integer.parseInt(var5);
                    case 6:
                    case 9:
                    case 11:
                    default:
                        break;
                    case 7:
                        Statics.field290 = var5;
                        break;
                    case 8:
                        int var6 = Integer.parseInt(var5);
                        class154[] var7 = class154.method2008();
                        int var8 = 0;
                        class154 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class154 var9 = var7[var8];
                            if (var9.field2304 == var6) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field285 = var10;
                        break;
                    case 10:
                        Statics.field291 = Integer.parseInt(var5);
                        break;
                    case 12:
                        class155[] var11 = new class155[] { class155.field2320, class155.field2314, class155.field2312, class155.field2311, class155.field2315, class155.field2313 };
                        Statics.field3159 = (class155) class110.method632(var11, Integer.parseInt(var5));
                        if (Statics.field3159 == class155.field2311) {
                            Statics.field1642 = class213.field3154;
                        } else {
                            Statics.field1642 = class213.field3152;
                        }
                        break;
                    case 13:
                        if (var5.equalsIgnoreCase(class2.field28)) {
                            field287 = true;
                        } else {
                            field287 = false;
                        }
                        break;
                    case 14:
                        field385 = Integer.parseInt(var5);
                        break;
                    case 15:
                        Statics.field2767 = var5;
                }
            }
        }
        class87.field1531 = false;
        field288 = false;
        Statics.field2671 = this.getCodeBase().getHost();
        String var12 = Statics.field285.field2308;
        byte var13 = 0;
        try {
            Statics.field2266 = 16;
            Statics.field1958 = var13;
            try {
                Statics.field2041 = System.getProperty("os.name");
            } catch (Exception var33) {
                Statics.field2041 = "Unknown";
            }
            Statics.field1777 = Statics.field2041.toLowerCase();
            try {
                Statics.field2273 = System.getProperty("user.home");
                if (Statics.field2273 != null) {
                    Statics.field2273 = Statics.field2273 + "/";
                }
            } catch (Exception var32) {
            }
            try {
                if (Statics.field1777.startsWith("win")) {
                    if (Statics.field2273 == null) {
                        Statics.field2273 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2273 == null) {
                    Statics.field2273 = System.getenv("HOME");
                }
                if (Statics.field2273 != null) {
                    Statics.field2273 = Statics.field2273 + "/";
                }
            } catch (Exception var31) {
            }
            if (Statics.field2273 == null) {
                Statics.field2273 = "~/";
            }
            Statics.field2272 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2273, "/tmp/", "" };
            Statics.field144 = new String[] { ".jagex_cache_" + Statics.field1958, ".file_store_" + Statics.field1958 };
            label154: for (int var17 = 0; var17 < 4; var17++) {
                Statics.field2271 = class150.method2100("oldschool", var12, var17);
                if (!Statics.field2271.exists()) {
                    Statics.field2271.mkdirs();
                }
                File[] var18 = Statics.field2271.listFiles();
                if (var18 == null) {
                    break;
                }
                File[] var19 = var18;
                int var20 = 0;
                while (true) {
                    if (var20 >= var19.length) {
                        break label154;
                    }
                    File var21 = var19[var20];
                    if (!class150.method2643(var21, false)) {
                        break;
                    }
                    var20++;
                }
            }
            class136.method846(Statics.field2271);
            try {
                File var22 = new File(Statics.field2273, "random.dat");
                if (var22.exists()) {
                    class150.field2270 = new class229(new class228(var22, "rw", 25L), 24, 0);
                } else {
                    label134: for (int var23 = 0; var23 < Statics.field144.length; var23++) {
                        for (int var24 = 0; var24 < Statics.field2272.length; var24++) {
                            File var25 = new File(Statics.field2272[var24] + Statics.field144[var23] + File.separatorChar + "random.dat");
                            if (var25.exists()) {
                                class150.field2270 = new class229(new class228(var25, "rw", 25L), 24, 0);
                                break label134;
                            }
                        }
                    }
                }
                if (class150.field2270 == null) {
                    RandomAccessFile var26 = new RandomAccessFile(var22, "rw");
                    int var27 = var26.read();
                    var26.seek(0L);
                    var26.write(var27);
                    var26.seek(0L);
                    var26.close();
                    class150.field2270 = new class229(new class228(var22, "rw", 25L), 24, 0);
                }
            } catch (IOException var34) {
            }
            class150.field2265 = new class229(new class228(class136.method743("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class150.field2269 = new class229(new class228(class136.method743("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2094 = new class229[Statics.field2266];
            for (int var29 = 0; var29 < Statics.field2266; var29++) {
                Statics.field2094[var29] = new class229(new class228(class136.method743("main_file_cache.idx" + var29), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var35) {
            class149.method635((String) null, var35);
        }
        Statics.field281 = this;
        this.method2814(765, 503, 115);
    }

    @ObfuscatedName("client.z(I)V")
    public final void method418() {
        Statics.field1940 = field385 == 0 ? 43594 : field479 + 40000;
        Statics.field1887 = field385 == 0 ? 443 : field479 + 50000;
        Statics.field783 = Statics.field1940;
        Statics.field1050 = class175.field2913;
        Statics.field2061 = class175.field2912;
        Statics.field2107 = class175.field2914;
        Statics.field2941 = class175.field2915;
        class138.method408();
        class138.method1711(Statics.field1222);
        class141.method2189(Statics.field1222);
        Statics.field1069 = class132.method1709();
        if (Statics.field1069 != null) {
            Statics.field1069.method2631(Statics.field1222);
        }
        Statics.field621 = new class135(255, class150.field2265, class150.field2269, 500000);
        class228 var1 = null;
        class9 var2 = new class9();
        try {
            var1 = class150.method161("", Statics.field3159.field2317, false);
            byte[] var3 = new byte[(int) var1.method3804()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method3815(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class9(new class120(var3));
        } catch (Exception var12) {
        }
        try {
            if (var1 != null) {
                var1.method3803();
            }
        } catch (Exception var11) {
        }
        Statics.field1989 = var2;
        Statics.field2624 = this.getToolkit().getSystemClipboard();
        String var10 = Statics.field1205;
        class139.field2157 = this;
        class139.field2156 = var10;
        if (field385 != 0) {
            field377 = true;
        }
        method1138(Statics.field1989.field141);
    }

    @ObfuscatedName("client.r(B)V")
    public final void method210() {
        field333++;
        this.method213();
        class171.method2191();
        try {
            if (class184.field2982 == 1) {
                int var1 = Statics.field2977.method3321();
                if (var1 > 0 && Statics.field2977.method3327()) {
                    int var2 = var1 - Statics.field2981;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2977.method3369(var2);
                } else {
                    Statics.field2977.method3347();
                    Statics.field2977.method3402();
                    if (Statics.field615 == null) {
                        class184.field2982 = 0;
                    } else {
                        class184.field2982 = 2;
                    }
                    Statics.field2975 = null;
                    Statics.field591 = null;
                }
            }
        } catch (Exception var10) {
            var10.printStackTrace();
            Statics.field2977.method3347();
            class184.field2982 = 0;
            Statics.field2975 = null;
            Statics.field591 = null;
            Statics.field615 = null;
        }
        method2678();
        class138 var4 = class138.field2138;
        synchronized (class138.field2138) {
            class138.field2154++;
            class138.field2151 = class138.field2140;
            class138.field2150 = 0;
            if (class138.field2146 >= 0) {
                while (class138.field2149 != class138.field2146) {
                    int var6 = class138.field2144[class138.field2149];
                    class138.field2149 = class138.field2149 + 1 & 0x7F;
                    if (var6 < 0) {
                        class138.field2134[~var6] = false;
                    } else {
                        if (!class138.field2134[var6] && class138.field2150 < class138.field2147.length - 1) {
                            class138.field2147[++class138.field2150 - 1] = var6;
                        }
                        class138.field2134[var6] = true;
                    }
                }
            } else {
                for (int var5 = 0; var5 < 112; var5++) {
                    class138.field2134[var5] = false;
                }
                class138.field2146 = class138.field2149;
            }
            class138.field2140 = class138.field2145;
        }
        class141.method549();
        if (Statics.field1069 != null) {
            int var8 = Statics.field1069.method2633();
            field481 = var8;
        }
        if (field463 == 0) {
            method2241();
            class145.method3640();
        } else if (field463 == 5) {
            class32.method564(this);
            method2241();
            class145.method3640();
        } else if (field463 == 10 || field463 == 11) {
            class32.method564(this);
        } else if (field463 == 20) {
            class32.method564(this);
            method2574();
        } else if (field463 == 25) {
            method1537();
        }
        if (field463 == 30) {
            method2998();
        } else if (field463 == 40 || field463 == 45) {
            method2574();
        }
    }

    @ObfuscatedName("client.f(I)V")
    public final void method459() {
        boolean var1 = class184.method2508();
        if (var1 && field522 && Statics.field248 != null) {
            Statics.field248.method1105();
        }
        if (field463 == 10 || field463 == 20 || field463 == 30) {
            if (field496 != 0L && class116.method2586() > field496) {
                int var2 = field497 ? 2 : 1;
                method1138(var2);
            } else if (field2235) {
                method2003();
            }
        }
        Dimension var3 = this.method2819();
        if (Statics.field2050 != var3.width || Statics.field1916 != var3.height || field2238) {
            method2245();
            field496 = class116.method2586() + 500L;
            field2238 = false;
        }
        boolean var4 = false;
        if (field2236) {
            field2236 = false;
            var4 = true;
            for (int var5 = 0; var5 < 100; var5++) {
                field397[var5] = true;
            }
        }
        if (var4) {
            Statics.method1985();
        }
        if (field463 == 0) {
            int var6 = class32.field716;
            String var7 = class32.field736;
            Color var8 = null;
            try {
                Graphics var9 = Statics.field1222.getGraphics();
                if (Statics.field2263 == null) {
                    Statics.field2263 = new Font("Helvetica", 1, 13);
                    Statics.field1051 = Statics.field1222.getFontMetrics(Statics.field2263);
                }
                if (var4) {
                    var9.setColor(Color.black);
                    var9.fillRect(0, 0, Statics.field163, Statics.field967);
                }
                if (var8 == null) {
                    var8 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field2627 == null) {
                        Statics.field2627 = Statics.field1222.createImage(304, 34);
                    }
                    Graphics var10 = Statics.field2627.getGraphics();
                    var10.setColor(var8);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, var6 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(var6 * 3 + 2, 2, 300 - var6 * 3, 30);
                    var10.setFont(Statics.field2263);
                    var10.setColor(Color.white);
                    var10.drawString(var7, (304 - Statics.field1051.stringWidth(var7)) / 2, 22);
                    var9.drawImage(Statics.field2627, Statics.field163 / 2 - 152, Statics.field967 / 2 - 18, (ImageObserver) null);
                } catch (Exception var23) {
                    int var12 = Statics.field163 / 2 - 152;
                    int var13 = Statics.field967 / 2 - 18;
                    var9.setColor(var8);
                    var9.drawRect(var12, var13, 303, 33);
                    var9.fillRect(var12 + 2, var13 + 2, var6 * 3, 30);
                    var9.setColor(Color.black);
                    var9.drawRect(var12 + 1, var13 + 1, 301, 31);
                    var9.fillRect(var6 * 3 + var12 + 2, var13 + 2, 300 - var6 * 3, 30);
                    var9.setFont(Statics.field2263);
                    var9.setColor(Color.white);
                    var9.drawString(var7, var12 + (304 - Statics.field1051.stringWidth(var7)) / 2, var13 + 22);
                }
            } catch (Exception var24) {
                Statics.field1222.repaint();
            }
        } else if (field463 == 5) {
            class32.method684(Statics.field80, Statics.field27, Statics.field1441, var4);
        } else if (field463 == 10 || field463 == 11) {
            class32.method684(Statics.field80, Statics.field27, Statics.field1441, var4);
        } else if (field463 == 20) {
            class32.method684(Statics.field80, Statics.field27, Statics.field1441, var4);
        } else if (field463 == 25) {
            if (field404 == 1) {
                if (field339 > field340) {
                    field340 = field339;
                }
                int var15 = (field340 * 50 - field339 * 50) / field340;
                method1525(class158.field2346 + class2.field25 + class2.field20 + var15 + "%" + class2.field23, false);
            } else if (field404 == 2) {
                if (field341 > field342) {
                    field342 = field341;
                }
                int var16 = (field342 * 50 - field341 * 50) / field342 + 50;
                method1525(class158.field2346 + class2.field25 + class2.field20 + var16 + "%" + class2.field23, false);
            } else {
                method1525(class158.field2346, false);
            }
        } else if (field463 == 30) {
            method180();
        } else if (field463 == 40) {
            method1525(class158.field2445 + class2.field25 + class158.field2348, false);
        } else if (field463 == 45) {
            method1525(class158.field2492, false);
        }
        if (field463 == 30 && field495 == 0 && !var4) {
            try {
                Graphics var17 = Statics.field1222.getGraphics();
                for (int var18 = 0; var18 < field486; var18++) {
                    if (field489[var18]) {
                        Statics.field1647.method1460(var17, field491[var18], field437[var18], field536[var18], field494[var18]);
                        field489[var18] = false;
                    }
                }
            } catch (Exception var26) {
                Statics.field1222.repaint();
            }
        } else if (field463 > 0) {
            try {
                Graphics var20 = Statics.field1222.getGraphics();
                Statics.field1647.method1459(var20, 0, 0);
                for (int var21 = 0; var21 < field486; var21++) {
                    field489[var21] = false;
                }
            } catch (Exception var25) {
                Statics.field1222.repaint();
            }
        }
    }

    @ObfuscatedName("client.s(I)V")
    public final void method212() {
        if (Statics.field1880.method175()) {
            Statics.field1880.method197();
        }
        if (Statics.field1083 != null) {
            Statics.field1083.field209 = false;
        }
        Statics.field1083 = null;
        if (Statics.field1113 != null) {
            Statics.field1113.method2786();
            Statics.field1113 = null;
        }
        if (class138.field2138 != null) {
            class138 var1 = class138.field2138;
            synchronized (class138.field2138) {
                class138.field2138 = null;
            }
        }
        class141.method2193();
        Statics.field1069 = null;
        if (Statics.field248 != null) {
            Statics.field248.method1106();
        }
        if (Statics.field332 != null) {
            Statics.field332.method1106();
        }
        if (Statics.field1024 != null) {
            Statics.field1024.method2786();
        }
        class171.method2697();
        class150.method2001();
    }

    @ObfuscatedName("g.d(IB)V")
    public static void method15(int arg0) {
        if (field463 == arg0) {
            return;
        }
        if (field463 == 0) {
            Statics.field2627 = null;
            Statics.field2263 = null;
            Statics.field1051 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field317 = 0;
            field318 = 0;
            field319 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1562 != null) {
            Statics.field1562.method2786();
            Statics.field1562 = null;
        }
        if (field463 == 25) {
            field404 = 0;
            field339 = 0;
            field340 = 1;
            field341 = 0;
            field342 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class32.method2627(Statics.field1222, Statics.field2162, Statics.field204, true, 0);
        } else if (arg0 == 20) {
            class32.method2627(Statics.field1222, Statics.field2162, Statics.field204, true, field463 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class32.method2627(Statics.field1222, Statics.field2162, Statics.field204, false, 4);
        } else if (Statics.field717) {
            Statics.field2082 = null;
            Statics.field705 = null;
            Statics.field1917 = null;
            Statics.field1101 = null;
            Statics.field706 = null;
            Statics.field2102 = null;
            Statics.field712 = null;
            Statics.field72 = null;
            Statics.field1466 = null;
            Statics.field2718 = null;
            Statics.field1957 = null;
            Statics.field187 = null;
            Statics.field1040 = null;
            Statics.field1542 = null;
            Statics.field2006 = null;
            Statics.field1635 = null;
            Statics.field272 = null;
            Statics.field1065 = null;
            Statics.field2679 = null;
            Statics.field701 = null;
            Statics.field753 = null;
            Statics.field137 = null;
            class184.method540(2);
            if (Statics.field1024 != null) {
                try {
                    class120 var1 = new class120(4);
                    var1.method2293(2);
                    var1.method2295(0);
                    Statics.field1024.method2790(var1.field2002, 0, 4);
                } catch (IOException var5) {
                    try {
                        Statics.field1024.method2786();
                    } catch (Exception var4) {
                    }
                    class172.field2753++;
                    Statics.field1024 = null;
                }
            }
            Statics.field717 = false;
        }
        field463 = arg0;
    }

    @ObfuscatedName("client.l(I)V")
    public void method213() {
        if (field463 != 1000) {
            boolean var1 = class172.method2081();
            if (!var1) {
                this.method511();
            }
        }
    }

    @ObfuscatedName("client.y(I)V")
    public void method511() {
        if (class172.field2759 >= 4) {
            this.method2817("js5crc");
            field463 = 1000;
            return;
        }
        if (class172.field2753 >= 4) {
            if (field463 <= 5) {
                this.method2817("js5io");
                field463 = 1000;
                return;
            }
            field315 = 3000;
            class172.field2753 = 3;
        }
        if (--field315 + 1 > 0) {
            return;
        }
        try {
            if (field314 == 0) {
                Statics.field313 = Statics.field1401.method2700(Statics.field2671, Statics.field783);
                field314++;
            }
            if (field314 == 1) {
                if (Statics.field313.field2250 == 2) {
                    this.method215(-1);
                    return;
                }
                if (Statics.field313.field2250 == 1) {
                    field314++;
                }
            }
            if (field314 == 2) {
                Statics.field2168 = new class144((Socket) Statics.field313.field2247, Statics.field1401);
                class120 var1 = new class120(5);
                var1.method2293(15);
                var1.method2296(115);
                Statics.field2168.method2790(var1.field2002, 0, 5);
                field314++;
                Statics.field12 = class116.method2586();
            }
            if (field314 == 3) {
                if (field463 <= 5 || Statics.field2168.method2806() > 0) {
                    int var2 = Statics.field2168.method2787();
                    if (var2 != 0) {
                        this.method215(var2);
                        return;
                    }
                    field314++;
                } else if (class116.method2586() - Statics.field12 > 30000L) {
                    this.method215(-2);
                    return;
                }
            }
            if (field314 == 4) {
                class172.method128(Statics.field2168, field463 > 20);
                Statics.field313 = null;
                Statics.field2168 = null;
                field314 = 0;
                field529 = 0;
            }
        } catch (IOException var4) {
            this.method215(-3);
        }
    }

    @ObfuscatedName("client.p(II)V")
    public void method215(int arg0) {
        Statics.field313 = null;
        Statics.field2168 = null;
        field314 = 0;
        if (Statics.field783 == Statics.field1940) {
            Statics.field783 = Statics.field1887;
        } else {
            Statics.field783 = Statics.field1940;
        }
        field529++;
        if (field529 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field463 <= 5) {
                this.method2817("js5connect_full");
                field463 = 1000;
            } else {
                field315 = 3000;
            }
        } else if (field529 >= 2 && arg0 == 6) {
            this.method2817("js5connect_outofdate");
            field463 = 1000;
        } else if (field529 >= 4) {
            if (field463 <= 5) {
                this.method2817("js5connect");
                field463 = 1000;
            } else {
                field315 = 3000;
            }
        }
    }

    @ObfuscatedName("da.k(B)V")
    public static void method2241() {
        if (field312 == 0) {
            Statics.field3162 = new class87(4, 104, 104, class6.field101);
            for (int var0 = 0; var0 < 4; var0++) {
                field345[var0] = new class109(104, 104);
            }
            Statics.field1768 = new class79(512, 512);
            class32.field736 = class158.field2454;
            class32.field716 = 5;
            field312 = 20;
        } else if (field312 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class92.field1603[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class87.method1766(var1, 500, 800, 512, 334);
            class32.field736 = class158.field2350;
            class32.field716 = 10;
            field312 = 30;
        } else if (field312 == 30) {
            Statics.field224 = method33(0, false, true, true);
            Statics.field766 = method33(1, false, true, true);
            Statics.field2242 = method33(2, true, false, true);
            Statics.field577 = method33(3, false, true, true);
            Statics.field1001 = method33(4, false, true, true);
            Statics.field273 = method33(5, true, true, true);
            Statics.field1784 = method33(6, true, true, false);
            Statics.field2029 = method33(7, false, true, true);
            Statics.field204 = method33(8, false, true, true);
            Statics.field3025 = method33(9, false, true, true);
            Statics.field2162 = method33(10, false, true, true);
            Statics.field1879 = method33(11, false, true, true);
            Statics.field2068 = method33(12, false, true, true);
            Statics.field1372 = method33(13, true, false, true);
            Statics.field68 = method33(14, false, true, false);
            Statics.field77 = method33(15, false, true, true);
            class32.field736 = class158.field2351;
            class32.field716 = 20;
            field312 = 40;
        } else if (field312 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field224.method3099() * 4 / 100;
            int var8 = var7 + Statics.field766.method3099() * 4 / 100;
            int var9 = var8 + Statics.field2242.method3099() * 2 / 100;
            int var10 = var9 + Statics.field577.method3099() * 2 / 100;
            int var11 = var10 + Statics.field1001.method3099() * 6 / 100;
            int var12 = var11 + Statics.field273.method3099() * 4 / 100;
            int var13 = var12 + Statics.field1784.method3099() * 2 / 100;
            int var14 = var13 + Statics.field2029.method3099() * 60 / 100;
            int var15 = var14 + Statics.field204.method3099() * 2 / 100;
            int var16 = var15 + Statics.field3025.method3099() * 2 / 100;
            int var17 = var16 + Statics.field2162.method3099() * 2 / 100;
            int var18 = var17 + Statics.field1879.method3099() * 2 / 100;
            int var19 = var18 + Statics.field2068.method3099() * 2 / 100;
            int var20 = var19 + Statics.field1372.method3099() * 2 / 100;
            int var21 = var20 + Statics.field68.method3099() * 2 / 100;
            int var22 = var21 + Statics.field77.method3099() * 2 / 100;
            if (var22 == 100) {
                class32.field736 = class158.field2418;
                class32.field716 = 30;
                field312 = 45;
            } else {
                if (var22 != 0) {
                    class32.field736 = class158.field2352 + var22 + "%";
                }
                class32.field716 = 30;
            }
        } else if (field312 == 45) {
            boolean var23 = !field288;
            Statics.field1195 = 22050;
            Statics.field576 = var23;
            Statics.field1185 = 2;
            class185 var24 = new class185();
            var24.method3394(9, 128);
            Statics.field248 = class57.method1457(Statics.field1401, Statics.field1222, 0, 22050);
            Statics.field248.method1102(var24);
            class169 var25 = Statics.field77;
            class169 var26 = Statics.field68;
            class169 var27 = Statics.field1001;
            Statics.field2979 = var25;
            Statics.field1573 = var26;
            Statics.field2976 = var27;
            Statics.field2977 = var24;
            Statics.field332 = class57.method1457(Statics.field1401, Statics.field1222, 1, 2048);
            Statics.field2066 = new class56();
            Statics.field332.method1102(Statics.field2066);
            Statics.field1165 = new class75(22050, Statics.field1195);
            class32.field736 = class158.field2515;
            class32.field716 = 35;
            field312 = 50;
        } else if (field312 == 50) {
            int var28 = 0;
            if (Statics.field27 == null) {
                class169 var29 = Statics.field204;
                class169 var30 = Statics.field1372;
                int var31 = var29.method3017("p11_full");
                int var32 = var29.method3018(var31, "");
                class225 var33 = class77.method86(var29, var30, var31, var32);
                Statics.field27 = var33;
            } else {
                var28++;
            }
            if (Statics.field1441 == null) {
                class169 var34 = Statics.field204;
                class169 var35 = Statics.field1372;
                int var36 = var34.method3017("p12_full");
                int var37 = var34.method3018(var36, "");
                class225 var38 = class77.method86(var34, var35, var36, var37);
                Statics.field1441 = var38;
            } else {
                var28++;
            }
            if (Statics.field80 == null) {
                class169 var39 = Statics.field204;
                class169 var40 = Statics.field1372;
                int var41 = var39.method3017("b12_full");
                int var42 = var39.method3018(var41, "");
                class225 var43 = class77.method86(var39, var40, var41, var42);
                Statics.field80 = var43;
            } else {
                var28++;
            }
            if (var28 < 3) {
                class32.field736 = class158.field2355 + var28 * 100 / 3 + "%";
                class32.field716 = 40;
            } else {
                Statics.field63 = new class161(true);
                class32.field736 = class158.field2356;
                class32.field716 = 40;
                field312 = 60;
            }
        } else if (field312 == 60) {
            class169 var44 = Statics.field2162;
            class169 var45 = Statics.field204;
            int var46 = 0;
            if (var44.method3008("title.jpg", "")) {
                var46++;
            }
            if (var45.method3008("logo", "")) {
                var46++;
            }
            if (var45.method3008("logo_deadman_mode", "")) {
                var46++;
            }
            if (var45.method3008("titlebox", "")) {
                var46++;
            }
            if (var45.method3008("titlebutton", "")) {
                var46++;
            }
            if (var45.method3008("runes", "")) {
                var46++;
            }
            if (var45.method3008("title_mute", "")) {
                var46++;
            }
            if (var45.method3062("options_radio_buttons,0")) {
                var46++;
            }
            if (var45.method3062("options_radio_buttons,2")) {
                var46++;
            }
            var45.method3008("sl_back", "");
            var45.method3008("sl_flags", "");
            var45.method3008("sl_arrows", "");
            var45.method3008("sl_stars", "");
            var45.method3008("sl_button", "");
            byte var49 = 9;
            if (var46 < var49) {
                class32.field736 = class158.field2358 + var46 * 100 / var49 + "%";
                class32.field716 = 50;
            } else {
                class32.field736 = class158.field2347;
                class32.field716 = 50;
                method15(5);
                field312 = 70;
            }
        } else if (field312 == 70) {
            if (Statics.field2242.method3006()) {
                class47.method789(Statics.field2242);
                class42.method808(Statics.field2242);
                class169 var51 = Statics.field2242;
                class169 var52 = Statics.field2029;
                Statics.field2937 = var51;
                Statics.field3171 = var52;
                Statics.field1031 = Statics.field2937.method3012(3);
                class41.method2729(Statics.field2242, Statics.field2029, field288);
                class40.method2927(Statics.field2242, Statics.field2029);
                class169 var53 = Statics.field2242;
                class169 var54 = Statics.field2029;
                boolean var55 = field287;
                class225 var56 = Statics.field27;
                Statics.field1164 = var53;
                Statics.field3219 = var54;
                Statics.field1161 = var55;
                Statics.field1126 = Statics.field1164.method3012(10);
                Statics.field1133 = var56;
                class169 var57 = Statics.field2242;
                class169 var58 = Statics.field224;
                class169 var59 = Statics.field766;
                Statics.field994 = var57;
                Statics.field997 = var58;
                Statics.field999 = var59;
                class44.method2591(Statics.field2242, Statics.field2029);
                class48.method935(Statics.field2242);
                class169 var60 = Statics.field2242;
                Statics.field1173 = var60;
                Statics.field1169 = Statics.field1173.method3012(16);
                class169 var61 = Statics.field577;
                class169 var62 = Statics.field2029;
                class169 var63 = Statics.field204;
                class169 var64 = Statics.field1372;
                Statics.field2854 = var61;
                Statics.field2837 = var62;
                Statics.field762 = var63;
                Statics.field2682 = var64;
                Statics.field3169 = new class174[Statics.field2854.method3013()][];
                Statics.field2801 = new boolean[Statics.field2854.method3013()];
                class169 var65 = Statics.field2242;
                Statics.field1110 = var65;
                class169 var66 = Statics.field2242;
                Statics.field2207 = var66;
                class169 var67 = Statics.field2242;
                Statics.field1047 = var67;
                class50.method624(Statics.field2242);
                Statics.field1880 = new class20();
                class32.field736 = class158.field2360;
                class32.field716 = 60;
                field312 = 80;
            } else {
                class32.field736 = class158.field2359 + Statics.field2242.method3092() + "%";
                class32.field716 = 60;
            }
        } else if (field312 == 80) {
            int var68 = 0;
            if (Statics.field2696 == null) {
                Statics.field2696 = class77.method1452(Statics.field204, "compass", "");
            } else {
                var68++;
            }
            if (Statics.field1036 == null) {
                Statics.field1036 = class77.method1452(Statics.field204, "mapedge", "");
            } else {
                var68++;
            }
            if (Statics.field782 == null) {
                Statics.field782 = class77.method3630(Statics.field204, "mapscene", "");
            } else {
                var68++;
            }
            if (Statics.field1380 == null) {
                Statics.field1380 = class77.method941(Statics.field204, "mapfunction", "");
            } else {
                var68++;
            }
            if (Statics.field619 == null) {
                Statics.field619 = class77.method941(Statics.field204, "hitmarks", "");
            } else {
                var68++;
            }
            if (Statics.field215 == null) {
                Statics.field215 = class77.method941(Statics.field204, "headicons_pk", "");
            } else {
                var68++;
            }
            if (Statics.field172 == null) {
                Statics.field172 = class77.method941(Statics.field204, "headicons_prayer", "");
            } else {
                var68++;
            }
            if (Statics.field2267 == null) {
                Statics.field2267 = class77.method941(Statics.field204, "headicons_hint", "");
            } else {
                var68++;
            }
            if (Statics.field1095 == null) {
                Statics.field1095 = class77.method941(Statics.field204, "mapmarker", "");
            } else {
                var68++;
            }
            if (Statics.field2286 == null) {
                Statics.field2286 = class77.method941(Statics.field204, "cross", "");
            } else {
                var68++;
            }
            if (Statics.field1909 == null) {
                Statics.field1909 = class77.method941(Statics.field204, "mapdots", "");
            } else {
                var68++;
            }
            if (Statics.field2244 == null) {
                Statics.field2244 = class77.method3630(Statics.field204, "scrollbar", "");
            } else {
                var68++;
            }
            if (Statics.field249 == null) {
                Statics.field249 = class77.method3630(Statics.field204, "mod_icons", "");
            } else {
                var68++;
            }
            if (var68 < 13) {
                class32.field736 = class158.field2361 + var68 * 100 / 13 + "%";
                class32.field716 = 70;
            } else {
                Statics.field3196 = Statics.field249;
                Statics.field1036.method1578();
                int var69 = (int) (Math.random() * 21.0D) - 10;
                int var70 = (int) (Math.random() * 21.0D) - 10;
                int var71 = (int) (Math.random() * 21.0D) - 10;
                int var72 = (int) (Math.random() * 41.0D) - 20;
                for (int var73 = 0; var73 < Statics.field1380.length; var73++) {
                    Statics.field1380[var73].method1547(var69 + var72, var70 + var72, var71 + var72);
                }
                Statics.field782[0].method1702(var69 + var72, var70 + var72, var71 + var72);
                class32.field736 = class158.field2362;
                class32.field716 = 70;
                field312 = 90;
            }
        } else if (field312 == 90) {
            if (Statics.field3025.method3006()) {
                class96 var74 = new class96(Statics.field3025, Statics.field204, 20, 0.8D, field288 ? 64 : 128);
                class92.method1915(var74);
                class92.method1916(0.8D);
                class32.field736 = class158.field2364;
                class32.field716 = 90;
                field312 = 110;
            } else {
                class32.field736 = class158.field2363 + Statics.field3025.method3092() + "%";
                class32.field716 = 90;
            }
        } else if (field312 == 110) {
            Statics.field1083 = new class14();
            Statics.field1401.method2701(Statics.field1083, 10);
            class32.field736 = class158.field2614;
            class32.field716 = 94;
            field312 = 120;
        } else if (field312 == 120) {
            if (Statics.field2162.method3008("huffman", "")) {
                class114 var75 = new class114(Statics.field2162.method3060("huffman", ""));
                Statics.field3186 = var75;
                class32.field736 = class158.field2602;
                class32.field716 = 96;
                field312 = 130;
            } else {
                class32.field736 = class158.field2366 + "%";
                class32.field716 = 96;
            }
        } else if (field312 == 130) {
            if (!Statics.field577.method3006()) {
                class32.field736 = class158.field2368 + Statics.field577.method3092() * 4 / 5 + "%";
                class32.field716 = 100;
            } else if (!Statics.field2068.method3006()) {
                class32.field736 = class158.field2368 + (80 + Statics.field2068.method3092() / 6) + "%";
                class32.field716 = 100;
            } else if (Statics.field1372.method3006()) {
                class32.field736 = class158.field2564;
                class32.field716 = 100;
                field312 = 140;
            } else {
                class32.field736 = class158.field2368 + (96 + Statics.field1372.method3092() / 20) + "%";
                class32.field716 = 100;
            }
        } else if (field312 == 140) {
            method15(10);
        }
    }

    @ObfuscatedName("g.o(IZZZI)Lfe;")
    public static class169 method33(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class135 var4 = null;
        if (class150.field2265 != null) {
            var4 = new class135(arg0, class150.field2265, Statics.field2094[arg0], 1000000);
        }
        return new class169(var4, Statics.field621, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("du.b(I)V")
    public static final void method2574() {
        try {
            if (field317 == 0) {
                if (Statics.field1113 != null) {
                    Statics.field1113.method2786();
                    Statics.field1113 = null;
                }
                Statics.field2700 = null;
                field337 = false;
                field318 = 0;
                field317 = 1;
            }
            if (field317 == 1) {
                if (Statics.field2700 == null) {
                    Statics.field2700 = Statics.field1401.method2700(Statics.field2671, Statics.field783);
                }
                if (Statics.field2700.field2250 == 2) {
                    throw new IOException();
                }
                if (Statics.field2700.field2250 == 1) {
                    Statics.field1113 = new class144((Socket) Statics.field2700.field2247, Statics.field1401);
                    Statics.field2700 = null;
                    field317 = 2;
                }
            }
            if (field317 == 2) {
                field326.field2001 = 0;
                field326.method2293(14);
                Statics.field1113.method2790(field326.field2002, 0, 1);
                field328.field2001 = 0;
                field317 = 3;
            }
            if (field317 == 3) {
                if (Statics.field248 != null) {
                    Statics.field248.method1104();
                }
                if (Statics.field332 != null) {
                    Statics.field332.method1104();
                }
                int var0 = Statics.field1113.method2787();
                if (Statics.field248 != null) {
                    Statics.field248.method1104();
                }
                if (Statics.field332 != null) {
                    Statics.field332.method1104();
                }
                if (var0 != 0) {
                    method2082(var0);
                    return;
                }
                field328.field2001 = 0;
                field317 = 5;
            }
            if (field317 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field326.field2001 = 0;
                field326.method2293(1);
                field326.method2293(class32.field725.method537());
                field326.method2296(var1[0]);
                field326.method2296(var1[1]);
                field326.method2296(var1[2]);
                field326.method2296(var1[3]);
                switch(class32.field725.field2630) {
                    case 0:
                        class123 var2 = field326;
                        LinkedHashMap var3 = Statics.field1989.field142;
                        String var4 = class32.field723;
                        int var5 = var4.length();
                        int var6 = 0;
                        for (int var7 = 0; var7 < var5; var7++) {
                            var6 = (var6 << 5) - var6 + var4.charAt(var7);
                        }
                        var2.method2296((Integer) var3.get(var6));
                        field326.field2001 += 4;
                        break;
                    case 1:
                    case 2:
                        field326.method2295(Statics.field34);
                        field326.field2001 += 5;
                        break;
                    case 3:
                        field326.field2001 += 8;
                }
                field326.method2426(class32.field724);
                field326.method2480(class5.field78, class5.field71);
                field327.field2001 = 0;
                if (field463 == 40) {
                    field327.method2293(18);
                } else {
                    field327.method2293(16);
                }
                field327.method2294(0);
                int var9 = field327.field2001;
                field327.method2296(115);
                field327.method2302(field326.field2002, 0, field326.field2001);
                int var10 = field327.field2001;
                field327.method2426(class32.field723);
                field327.method2293((field497 ? 1 : 0) << 1 | (field288 ? 1 : 0));
                field327.method2294(Statics.field163);
                field327.method2294(Statics.field967);
                class150.method888(field327);
                field327.method2426(Statics.field290);
                field327.method2296(Statics.field132);
                class120 var11 = new class120(Statics.field63.method2931());
                Statics.field63.method2934(var11);
                field327.method2302(var11.field2002, 0, var11.field2002.length);
                field327.method2293(Statics.field291);
                field327.method2296(Statics.field224.field2714);
                field327.method2296(Statics.field766.field2714);
                field327.method2296(Statics.field2242.field2714);
                field327.method2296(Statics.field577.field2714);
                field327.method2296(Statics.field1001.field2714);
                field327.method2296(Statics.field273.field2714);
                field327.method2296(Statics.field1784.field2714);
                field327.method2296(Statics.field2029.field2714);
                field327.method2296(Statics.field204.field2714);
                field327.method2296(Statics.field3025.field2714);
                field327.method2296(Statics.field2162.field2714);
                field327.method2296(Statics.field1879.field2714);
                field327.method2296(Statics.field2068.field2714);
                field327.method2296(Statics.field1372.field2714);
                field327.method2296(Statics.field68.field2714);
                field327.method2296(Statics.field77.field2714);
                field327.method2326(var1, var10, field327.field2001);
                field327.method2311(field327.field2001 - var9);
                Statics.field1113.method2790(field327.field2002, 0, field327.field2001);
                field326.method2549(var1);
                for (int var12 = 0; var12 < 4; var12++) {
                    var1[var12] += 50;
                }
                field328.method2549(var1);
                field317 = 6;
            }
            if (field317 == 6 && Statics.field1113.method2806() > 0) {
                int var13 = Statics.field1113.method2787();
                if (var13 == 21 && field463 == 20) {
                    field317 = 7;
                } else if (var13 == 2) {
                    field317 = 9;
                } else if (var13 == 15 && field463 == 40) {
                    field329 = -1;
                    field317 = 13;
                } else if (var13 == 23 && field319 < 1) {
                    field319++;
                    field317 = 0;
                } else if (var13 == 29) {
                    field317 = 11;
                } else {
                    method2082(var13);
                    return;
                }
            }
            if (field317 == 7 && Statics.field1113.method2806() > 0) {
                field361 = (Statics.field1113.method2787() + 3) * 60;
                field317 = 8;
            }
            if (field317 == 8) {
                field318 = 0;
                class32.method955(class158.field2373, class158.field2365, field361 / 60 + class158.field2375);
                if (--field361 <= 0) {
                    field317 = 0;
                }
            } else {
                if (field317 == 9 && Statics.field1113.method2806() >= 13) {
                    boolean var14 = Statics.field1113.method2787() == 1;
                    Statics.field1113.method2789(field328.field2002, 0, 4);
                    field328.field2001 = 0;
                    boolean var15 = false;
                    if (var14) {
                        int var16 = field328.method2568() << 24;
                        int var17 = var16 | field328.method2568() << 16;
                        int var18 = var17 | field328.method2568() << 8;
                        int var19 = var18 | field328.method2568();
                        String var20 = class32.field723;
                        int var21 = var20.length();
                        int var22 = 0;
                        for (int var23 = 0; var23 < var21; var23++) {
                            var22 = (var22 << 5) - var22 + var20.charAt(var23);
                        }
                        if (Statics.field1989.field142.size() >= 10 && !Statics.field1989.field142.containsKey(var22)) {
                            Iterator var26 = Statics.field1989.field142.entrySet().iterator();
                            var26.next();
                            var26.remove();
                        }
                        Statics.field1989.field142.put(var22, var19);
                        class9.method581();
                    }
                    field450 = Statics.field1113.method2787();
                    field540 = Statics.field1113.method2787() == 1;
                    field461 = Statics.field1113.method2787();
                    field461 <<= 0x8;
                    field461 += Statics.field1113.method2787();
                    field452 = Statics.field1113.method2787();
                    Statics.field1113.method2789(field328.field2002, 0, 1);
                    field328.field2001 = 0;
                    field330 = field328.method2568();
                    Statics.field1113.method2789(field328.field2002, 0, 2);
                    field328.field2001 = 0;
                    field329 = field328.method2310();
                    if (field452 == 1) {
                        try {
                            class133.method2647(Statics.field281, "zap");
                        } catch (Throwable var39) {
                        }
                    } else {
                        try {
                            class133.method2647(Statics.field281, "unzap");
                        } catch (Throwable var38) {
                        }
                    }
                    field317 = 10;
                }
                if (field317 != 10) {
                    if (field317 == 11 && Statics.field1113.method2806() >= 2) {
                        field328.field2001 = 0;
                        Statics.field1113.method2789(field328.field2002, 0, 2);
                        field328.field2001 = 0;
                        Statics.field1543 = field328.method2310();
                        field317 = 12;
                    }
                    if (field317 == 12 && Statics.field1113.method2806() >= Statics.field1543) {
                        field328.field2001 = 0;
                        Statics.field1113.method2789(field328.field2002, 0, Statics.field1543);
                        field328.field2001 = 0;
                        String var29 = field328.method2316();
                        String var30 = field328.method2316();
                        String var31 = field328.method2316();
                        class32.method955(var29, var30, var31);
                        method15(10);
                    }
                    if (field317 == 13) {
                        if (field329 == -1) {
                            if (Statics.field1113.method2806() < 2) {
                                return;
                            }
                            Statics.field1113.method2789(field328.field2002, 0, 2);
                            field328.field2001 = 0;
                            field329 = field328.method2310();
                        }
                        if (Statics.field1113.method2806() >= field329) {
                            Statics.field1113.method2789(field328.field2002, 0, field329);
                            field328.field2001 = 0;
                            int var32 = field329;
                            field326.field2001 = 0;
                            field328.field2001 = 0;
                            field330 = -1;
                            field391 = -1;
                            field334 = -1;
                            field335 = -1;
                            field329 = 0;
                            field482 = 0;
                            field301 = 0;
                            field295 = 0;
                            field424 = false;
                            field550 = 0;
                            field546 = 0;
                            for (int var33 = 0; var33 < 2048; var33++) {
                                field406[var33] = null;
                            }
                            Statics.field2302 = null;
                            for (int var34 = 0; var34 < field321.length; var34++) {
                                class35 var35 = field321[var34];
                                if (var35 != null) {
                                    var35.field829 = -1;
                                    var35.field830 = false;
                                }
                            }
                            class16.field223 = new class197(32);
                            method15(30);
                            for (int var36 = 0; var36 < 100; var36++) {
                                field397[var36] = true;
                            }
                            method3444();
                            class33.method2969(field328);
                            if (field328.field2001 != var32) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field318++;
                        if (field318 > 2000) {
                            if (field319 < 1) {
                                if (Statics.field783 == Statics.field1940) {
                                    Statics.field783 = Statics.field1887;
                                } else {
                                    Statics.field783 = Statics.field1940;
                                }
                                field319++;
                                field317 = 0;
                            } else {
                                method2082(-3);
                            }
                        }
                    }
                } else if (Statics.field1113.method2806() >= field329) {
                    field328.field2001 = 0;
                    Statics.field1113.method2789(field328.field2002, 0, field329);
                    method690();
                    class33.method2969(field328);
                    Statics.field965 = -1;
                    method3631(false);
                    field330 = -1;
                }
            }
        } catch (IOException var40) {
            if (field319 < 1) {
                if (Statics.field783 == Statics.field1940) {
                    Statics.field783 = Statics.field1887;
                } else {
                    Statics.field783 = Statics.field1940;
                }
                field319++;
                field317 = 0;
            } else {
                method2082(-2);
            }
        }
    }

    @ObfuscatedName("ai.j(I)V")
    public static void method690() {
        field309 = -1L;
        field298 = -1;
        Statics.field1083.field207 = 0;
        Statics.field671 = true;
        field299 = true;
        field509 = -1L;
        class212.field3142 = new class203();
        field326.field2001 = 0;
        field328.field2001 = 0;
        field330 = -1;
        field391 = -1;
        field334 = -1;
        field335 = -1;
        field482 = 0;
        field301 = 0;
        field336 = 0;
        field302 = 0;
        field295 = 0;
        field424 = false;
        class141.method2002(0);
        class12.method860();
        field380 = 0;
        field438 = false;
        field525 = 0;
        field446 = (int) (Math.random() * 100.0D) - 50;
        field351 = (int) (Math.random() * 110.0D) - 55;
        field353 = (int) (Math.random() * 80.0D) - 40;
        field356 = (int) (Math.random() * 120.0D) - 60;
        field358 = (int) (Math.random() * 30.0D) - 20;
        field303 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field550 = 0;
        field512 = -1;
        field546 = 0;
        field518 = 0;
        field310 = class21.field571;
        field459 = class21.field571;
        field294 = 0;
        class33.method625();
        for (int var0 = 0; var0 < 2048; var0++) {
            field406[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field321[var1] = null;
        }
        field485 = -1;
        field418.method3509();
        field447.method3509();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field416[var2][var3][var4] = null;
                }
            }
        }
        field543 = new class200();
        field523 = 0;
        field419 = 0;
        field554 = 0;
        for (int var5 = 0; var5 < Statics.field1169; var5++) {
            class53 var6 = class53.method548(var5);
            if (var6 != null) {
                class177.field2925[var5] = 0;
                class177.field2924[var5] = 0;
            }
        }
        Statics.field1880.method183();
        field371 = -1;
        if (field443 != -1) {
            class174.method622(field443);
        }
        for (class4 var7 = (class4) field444.method3488(); var7 != null; var7 = (class4) field444.method3489()) {
            method880(var7, true);
        }
        field443 = -1;
        field444 = new class197(8);
        field400 = null;
        field424 = false;
        field295 = 0;
        field556.method3204((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field462[var8] = null;
            field413[var8] = false;
        }
        class16.field223 = new class197(32);
        field293 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field397[var9] = true;
        }
        field326.method2573(159);
        class123 var10 = field326;
        int var11 = field497 ? 2 : 1;
        var10.method2293(var11);
        field326.method2294(Statics.field163);
        field326.method2294(Statics.field967);
        field283 = null;
        Statics.field275 = 0;
        Statics.field279 = null;
        for (int var12 = 0; var12 < 8; var12++) {
            field559[var12] = new class221();
        }
        Statics.field2180 = null;
    }

    @ObfuscatedName("cz.a(II)V")
    public static void method2082(int arg0) {
        if (arg0 == -3) {
            class32.method955(class158.field2376, class158.field2377, class158.field2378);
        } else if (arg0 == -2) {
            class32.method955(class158.field2561, class158.field2380, class158.field2473);
        } else if (arg0 == -1) {
            class32.method955(class158.field2382, class158.field2507, class158.field2384);
        } else if (arg0 == 3) {
            class32.field718 = 3;
        } else if (arg0 == 4) {
            class32.method955(class158.field2385, class158.field2353, class158.field2387);
        } else if (arg0 == 5) {
            class32.method955(class158.field2388, class158.field2498, class158.field2390);
        } else if (arg0 == 6) {
            class32.method955(class158.field2391, class158.field2392, class158.field2393);
        } else if (arg0 == 7) {
            class32.method955(class158.field2394, class158.field2349, class158.field2525);
        } else if (arg0 == 8) {
            class32.method955(class158.field2397, class158.field2398, class158.field2399);
        } else if (arg0 == 9) {
            class32.method955(class158.field2428, class158.field2517, class158.field2501);
        } else if (arg0 == 10) {
            class32.method955(class158.field2519, class158.field2597, class158.field2405);
        } else if (arg0 == 11) {
            class32.method955(class158.field2406, class158.field2407, class158.field2582);
        } else if (arg0 == 12) {
            class32.method955(class158.field2409, class158.field2410, class158.field2411);
        } else if (arg0 == 13) {
            class32.method955(class158.field2412, class158.field2413, class158.field2414);
        } else if (arg0 == 14) {
            class32.method955(class158.field2415, class158.field2416, class158.field2417);
        } else if (arg0 == 16) {
            class32.method955(class158.field2487, class158.field2510, class158.field2420);
        } else if (arg0 == 17) {
            class32.method955(class158.field2615, class158.field2422, class158.field2423);
        } else if (arg0 == 18) {
            class32.method955(class158.field2493, class158.field2425, class158.field2426);
        } else if (arg0 == 19) {
            class32.method955(class158.field2427, class158.field2521, class158.field2403);
        } else if (arg0 == 20) {
            class32.method955(class158.field2430, class158.field2431, class158.field2432);
        } else if (arg0 == 22) {
            class32.method955(class158.field2464, class158.field2434, class158.field2435);
        } else if (arg0 == 23) {
            class32.method955(class158.field2436, class158.field2437, class158.field2438);
        } else if (arg0 == 24) {
            class32.method955(class158.field2568, class158.field2336, class158.field2441);
        } else if (arg0 == 25) {
            class32.method955(class158.field2442, class158.field2443, class158.field2482);
        } else if (arg0 == 26) {
            class32.method955(class158.field2578, class158.field2595, class158.field2447);
        } else if (arg0 == 27) {
            class32.method955(class158.field2513, class158.field2449, class158.field2450);
        } else if (arg0 == 31) {
            class32.method955(class158.field2457, class158.field2379, class158.field2463);
        } else if (arg0 == 32) {
            class32.method955(class158.field2440, class158.field2461, class158.field2462);
        } else if (arg0 == 37) {
            class32.method955(class158.field2532, class158.field2613, class158.field2400);
        } else if (arg0 == 38) {
            class32.method955(class158.field2466, class158.field2467, class158.field2468);
        } else if (arg0 == 55) {
            class32.method955(class158.field2469, class158.field2470, class158.field2554);
        } else if (arg0 == 56) {
            class32.method955(class158.field2395, class158.field2354, class158.field2588);
            method15(11);
            return;
        } else if (arg0 == 57) {
            class32.method955(class158.field2476, class158.field2540, class158.field2477);
            method15(11);
            return;
        } else {
            class32.method955(class158.field2478, class158.field2479, class158.field2480);
        }
        method15(10);
    }

    @ObfuscatedName("hn.u(I)V")
    public static final void method3616() {
        if (Statics.field1113 != null) {
            Statics.field1113.method2786();
            Statics.field1113 = null;
        }
        method165();
        Statics.field3162.method1731();
        for (int var0 = 0; var0 < 4; var0++) {
            field345[var0].method2195();
        }
        System.gc();
        class184.method540(2);
        field521 = -1;
        field522 = false;
        for (class24 var1 = (class24) class24.field600.method3534(); var1 != null; var1 = (class24) class24.field600.method3516()) {
            if (var1.field604 != null) {
                Statics.field2066.method1060(var1.field604);
                var1.field604 = null;
            }
            if (var1.field601 != null) {
                Statics.field2066.method1060(var1.field601);
                var1.field601 = null;
            }
        }
        class24.field600.method3509();
        method15(10);
    }

    @ObfuscatedName("c.c(I)V")
    public static final void method165() {
        class47.field1053.method3454();
        class42.field978.method3454();
        Statics.method2878();
        class41.field933.method3454();
        class41.field918.method3454();
        class41.field919.method3454();
        class41.field920.method3454();
        class40.field880.method3454();
        class40.field881.method3454();
        class52.method169();
        Statics.method204();
        class44.field1006.method3454();
        class44.field1007.method3454();
        class48.method3632();
        class53.field1170.method3454();
        class180.field2945.method3454();
        class174.field2769.method3454();
        class174.field2772.method3454();
        class174.field2773.method3454();
        class174.field2879.method3454();
        ((class96) Statics.field1600).method1997();
        class23.field594.method3454();
        Statics.field224.method3019();
        Statics.field766.method3019();
        Statics.field577.method3019();
        Statics.field1001.method3019();
        Statics.field273.method3019();
        Statics.field1784.method3019();
        Statics.field2029.method3019();
        Statics.field204.method3019();
        Statics.field3025.method3019();
        Statics.field2162.method3019();
        Statics.field1879.method3019();
        Statics.field2068.method3019();
    }

    @ObfuscatedName("eo.n(B)V")
    public static final void method2780() {
        if (field336 > 0) {
            method3616();
        } else {
            method15(40);
            Statics.field1562 = Statics.field1113;
            Statics.field1113 = null;
        }
    }

    @ObfuscatedName("fw.q(B)V")
    public static final void method2998() {
        if (field301 > 1) {
            field301--;
        }
        if (field336 > 0) {
            field336--;
        }
        if (field337) {
            field337 = false;
            method2780();
            return;
        }
        if (!field424) {
            field430[0] = class158.field2573;
            field338[0] = "";
            field393[0] = 1006;
            field295 = 1;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field1113 == null) {
                var1 = false;
            } else {
                label2763: {
                    try {
                        int var2 = Statics.field1113.method2806();
                        if (var2 == 0) {
                            var1 = false;
                            break label2763;
                        }
                        if (field330 == -1) {
                            Statics.field1113.method2789(field328.field2002, 0, 1);
                            field328.field2001 = 0;
                            field330 = field328.method2568();
                            field329 = class189.field3060[field330];
                            var2--;
                        }
                        if (field329 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2763;
                            }
                            Statics.field1113.method2789(field328.field2002, 0, 1);
                            field329 = field328.field2002[0] & 0xFF;
                            var2--;
                        }
                        if (field329 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2763;
                            }
                            Statics.field1113.method2789(field328.field2002, 0, 2);
                            field328.field2001 = 0;
                            field329 = field328.method2310();
                            var2 -= 2;
                        }
                        if (var2 < field329) {
                            var1 = false;
                            break label2763;
                        }
                        field328.field2001 = 0;
                        Statics.field1113.method2789(field328.field2002, 0, field329);
                        field482 = 0;
                        field335 = field334;
                        field334 = field391;
                        field391 = field330;
                        if (field330 == 73) {
                            int var3 = field328.method2353();
                            int var4 = field328.method2344();
                            class174 var5 = class174.method3117(var3);
                            if (var5.field2872 != 1 || var5.field2830 != var4) {
                                var5.field2872 = 1;
                                var5.field2830 = var4;
                                method538(var5);
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 45) {
                            Statics.field873 = field328.method2453();
                            Statics.field2223 = field328.method2334();
                            for (int var6 = Statics.field873; var6 < Statics.field873 + 8; var6++) {
                                for (int var7 = Statics.field2223; var7 < Statics.field2223 + 8; var7++) {
                                    if (field416[Statics.field755][var6][var7] != null) {
                                        field416[Statics.field755][var6][var7] = null;
                                        method36(var6, var7);
                                    }
                                }
                            }
                            for (class17 var8 = (class17) field543.method3534(); var8 != null; var8 = (class17) field543.method3516()) {
                                if (var8.field227 >= Statics.field873 && var8.field227 < Statics.field873 + 8 && var8.field228 >= Statics.field2223 && var8.field228 < Statics.field2223 + 8 && Statics.field755 == var8.field230) {
                                    var8.field236 = 0;
                                }
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 245) {
                            Statics.field873 = field328.method2334();
                            Statics.field2223 = field328.method2334();
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 152) {
                            field302 = field328.method2334();
                            if (field302 == 1) {
                                field407 = field328.method2310();
                            }
                            if (field302 >= 2 && field302 <= 6) {
                                if (field302 == 2) {
                                    field308 = 64;
                                    field524 = 64;
                                }
                                if (field302 == 3) {
                                    field308 = 0;
                                    field524 = 64;
                                }
                                if (field302 == 4) {
                                    field308 = 128;
                                    field524 = 64;
                                }
                                if (field302 == 5) {
                                    field308 = 64;
                                    field524 = 0;
                                }
                                if (field302 == 6) {
                                    field308 = 64;
                                    field524 = 128;
                                }
                                field302 = 2;
                                field305 = field328.method2310();
                                field306 = field328.method2310();
                                field307 = field328.method2334();
                            }
                            if (field302 == 10) {
                                field507 = field328.method2310();
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 175) {
                            String var9 = field328.method2316();
                            Object[] var10 = new Object[var9.length() + 1];
                            for (int var11 = var9.length() - 1; var11 >= 0; var11--) {
                                if (var9.charAt(var11) == 's') {
                                    var10[var11 + 1] = field328.method2316();
                                } else {
                                    var10[var11 + 1] = Integer.valueOf(field328.method2345());
                                }
                            }
                            var10[0] = Integer.valueOf(field328.method2345());
                            class1 var12 = new class1();
                            var12.field6 = var10;
                            class37.method3136(var12);
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 156) {
                            int var13 = field328.method2353();
                            int var14 = field328.method2345();
                            int var15 = field328.method2310();
                            if (var15 == 65535) {
                                var15 = -1;
                            }
                            int var16 = field328.method2486();
                            if (var16 == 65535) {
                                var16 = -1;
                            }
                            for (int var17 = var15; var17 <= var16; var17++) {
                                long var18 = ((long) var14 << 32) + (long) var17;
                                class209 var20 = field429.method3485(var18);
                                if (var20 != null) {
                                    var20.method3607();
                                }
                                field429.method3486(new class202(var13), var18);
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 164) {
                            method151();
                            field449 = field328.method2478();
                            field480 = field468;
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 252) {
                            int var21 = field329 + field328.field2001;
                            int var22 = field328.method2310();
                            int var23 = field328.method2310();
                            if (field443 != var22) {
                                field443 = var22;
                                method2778(false);
                                int var24 = field443;
                                if (class174.method3153(var24)) {
                                    class174[] var25 = Statics.field3169[var24];
                                    for (int var26 = 0; var26 < var25.length; var26++) {
                                        class174 var27 = var25[var26];
                                        if (var27 != null) {
                                            var27.field2899 = 0;
                                            var27.field2768 = 0;
                                        }
                                    }
                                }
                                class37.method1984(field443);
                                for (int var28 = 0; var28 < 100; var28++) {
                                    field397[var28] = true;
                                }
                            }
                            while (var23-- > 0) {
                                int var29 = field328.method2345();
                                int var30 = field328.method2310();
                                int var31 = field328.method2334();
                                class4 var32 = (class4) field444.method3485((long) var29);
                                if (var32 != null && var32.field66 != var30) {
                                    method880(var32, true);
                                    var32 = null;
                                }
                                if (var32 == null) {
                                    var32 = method753(var29, var30, var31);
                                }
                                var32.field67 = true;
                            }
                            for (class4 var33 = (class4) field444.method3488(); var33 != null; var33 = (class4) field444.method3489()) {
                                if (var33.field67) {
                                    var33.field67 = false;
                                } else {
                                    method880(var33, true);
                                }
                            }
                            field429 = new class197(512);
                            while (field328.field2001 < var21) {
                                int var34 = field328.method2345();
                                int var35 = field328.method2310();
                                int var36 = field328.method2310();
                                int var37 = field328.method2345();
                                for (int var38 = var35; var38 <= var36; var38++) {
                                    long var39 = ((long) var34 << 32) + (long) var38;
                                    field429.method3486(new class202(var37), var39);
                                }
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 138) {
                            field501 = field328.method2334();
                            field502 = field328.method2334();
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 155) {
                            int var41 = field328.method2453();
                            int var42 = field328.method2453();
                            String var43 = field328.method2316();
                            if (var41 >= 1 && var41 <= 8) {
                                if (var43.equalsIgnoreCase("null")) {
                                    var43 = null;
                                }
                                field462[var41 - 1] = var43;
                                field413[var41 - 1] = var42 == 0;
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 184) {
                            String var44 = field328.method2316();
                            String var45 = class224.method3704(class164.method152(class223.method3446(field328)));
                            class12.method683(6, var44, var45);
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 80) {
                            while (field328.field2001 < field329) {
                                int var46 = field328.method2334();
                                boolean var47 = (var46 & 0x1) == 1;
                                String var48 = field328.method2316();
                                String var49 = field328.method2316();
                                field328.method2316();
                                for (int var50 = 0; var50 < field554; var50++) {
                                    class8 var51 = field401[var50];
                                    if (var47) {
                                        if (var49.equals(var51.field136)) {
                                            var51.field136 = var48;
                                            var51.field135 = var49;
                                            var48 = null;
                                            break;
                                        }
                                    } else if (var48.equals(var51.field136)) {
                                        var51.field136 = var48;
                                        var51.field135 = var49;
                                        var48 = null;
                                        break;
                                    }
                                }
                                if (var48 != null && field554 < 400) {
                                    class8 var52 = new class8();
                                    field401[field554] = var52;
                                    var52.field136 = var48;
                                    var52.field135 = var49;
                                    field554++;
                                }
                            }
                            field476 = field468;
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 214) {
                            int var53 = field328.method2353();
                            int var54 = field328.method2478();
                            class174 var55 = class174.method3117(var53);
                            if (var55.field2894 != var54 || var54 == -1) {
                                var55.field2894 = var54;
                                var55.field2899 = 0;
                                var55.field2768 = 0;
                                method538(var55);
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 143) {
                            int var56 = field328.method2354();
                            boolean var57 = field328.method2334() == 1;
                            class174 var58 = class174.method3117(var56);
                            if (var58.field2876 != var57) {
                                var58.field2876 = var57;
                                method538(var58);
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 130) {
                            method151();
                            field532 = field328.method2334();
                            field480 = field468;
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 76) {
                            Statics.field2223 = field328.method2453();
                            Statics.field873 = field328.method2463();
                            while (field328.field2001 < field329) {
                                field330 = field328.method2334();
                                method2917();
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 236) {
                            Statics.field2080 = class131.method69(field328.method2334());
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 237) {
                            class123 var59 = field328;
                            int var60 = field329;
                            class211 var61 = new class211();
                            var61.field3136 = var59.method2334();
                            var61.field3132 = var59.method2345();
                            var61.field3131 = new int[var61.field3136];
                            var61.field3135 = new int[var61.field3136];
                            var61.field3134 = new Field[var61.field3136];
                            var61.field3133 = new int[var61.field3136];
                            var61.field3137 = new Method[var61.field3136];
                            var61.field3138 = new byte[var61.field3136][][];
                            for (int var62 = 0; var62 < var61.field3136; var62++) {
                                try {
                                    int var63 = var59.method2334();
                                    if (var63 == 0 || var63 == 1 || var63 == 2) {
                                        String var64 = var59.method2316();
                                        String var65 = var59.method2316();
                                        int var66 = 0;
                                        if (var63 == 1) {
                                            var66 = var59.method2345();
                                        }
                                        var61.field3131[var62] = var63;
                                        var61.field3133[var62] = var66;
                                        if (class212.method68(var64).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                        var61.field3134[var62] = class212.method68(var64).getDeclaredField(var65);
                                    } else if (var63 == 3 || var63 == 4) {
                                        String var67 = var59.method2316();
                                        String var68 = var59.method2316();
                                        int var69 = var59.method2334();
                                        String[] var70 = new String[var69];
                                        for (int var71 = 0; var71 < var69; var71++) {
                                            var70[var71] = var59.method2316();
                                        }
                                        String var72 = var59.method2316();
                                        byte[][] var73 = new byte[var69][];
                                        if (var63 == 3) {
                                            for (int var74 = 0; var74 < var69; var74++) {
                                                int var75 = var59.method2345();
                                                var73[var74] = new byte[var75];
                                                var59.method2319(var73[var74], 0, var75);
                                            }
                                        }
                                        var61.field3131[var62] = var63;
                                        Class[] var76 = new Class[var69];
                                        for (int var77 = 0; var77 < var69; var77++) {
                                            var76[var77] = class212.method68(var70[var77]);
                                        }
                                        Class var78 = class212.method68(var72);
                                        if (class212.method68(var67).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                        Method[] var79 = class212.method68(var67).getDeclaredMethods();
                                        Method[] var80 = var79;
                                        for (int var81 = 0; var81 < var80.length; var81++) {
                                            Method var82 = var80[var81];
                                            if (var82.getName().equals(var68)) {
                                                Class[] var83 = var82.getParameterTypes();
                                                if (var76.length == var83.length) {
                                                    boolean var84 = true;
                                                    for (int var85 = 0; var85 < var76.length; var85++) {
                                                        if (var76[var85] != var83[var85]) {
                                                            var84 = false;
                                                            break;
                                                        }
                                                    }
                                                    if (var84 && var78 == var82.getReturnType()) {
                                                        var61.field3137[var62] = var82;
                                                    }
                                                }
                                            }
                                        }
                                        var61.field3138[var62] = var73;
                                    }
                                } catch (ClassNotFoundException var440) {
                                    var61.field3135[var62] = -1;
                                } catch (SecurityException var441) {
                                    var61.field3135[var62] = -2;
                                } catch (NullPointerException var442) {
                                    var61.field3135[var62] = -3;
                                } catch (Exception var443) {
                                    var61.field3135[var62] = -4;
                                } catch (Throwable var444) {
                                    var61.field3135[var62] = -5;
                                }
                            }
                            class212.field3142.method3552(var61);
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 16) {
                            class33.method625();
                            for (int var91 = 0; var91 < 2048; var91++) {
                                field406[var91] = null;
                            }
                            class33.method2969(field328);
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 50) {
                            field550 = field328.method2334();
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 234) {
                            method151();
                            int var92 = field328.method2334();
                            int var93 = field328.method2345();
                            int var94 = field328.method2334();
                            field422[var92] = var93;
                            field304[var92] = var94;
                            field421[var92] = 1;
                            for (int var95 = 0; var95 < 98; var95++) {
                                if (var93 >= class156.field2325[var95]) {
                                    field421[var92] = var95 + 2;
                                }
                            }
                            field473[++field474 - 1 & 0x1F] = var92;
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 140) {
                            int var96 = field328.method2385();
                            int var97 = field328.method2352();
                            class174 var98 = class174.method3117(var97);
                            if (var98.field2872 != 2 || var98.field2830 != var96) {
                                var98.field2872 = 2;
                                var98.field2830 = var96;
                                method538(var98);
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 96) {
                            int var99 = field328.method2486();
                            byte var100 = field328.method2337();
                            class177.field2925[var99] = var100;
                            if (class177.field2924[var99] != var100) {
                                class177.field2924[var99] = var100;
                            }
                            Statics.method1528(var99);
                            field513[++field470 - 1 & 0x1F] = var99;
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 123) {
                            int var101 = field328.method2385();
                            int var102 = field328.method2453();
                            int var103 = field328.method2354();
                            class4 var104 = (class4) field444.method3485((long) var103);
                            if (var104 != null) {
                                method880(var104, var104.field66 != var101);
                            }
                            method753(var103, var101, var102);
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 206) {
                            int var105 = field328.method2345();
                            int var106 = field328.method2310();
                            if (var105 < -70000) {
                                var106 += 32768;
                            }
                            class174 var107;
                            if (var105 >= 0) {
                                var107 = class174.method3117(var105);
                            } else {
                                var107 = null;
                            }
                            if (var107 != null) {
                                for (int var108 = 0; var108 < var107.field2850.length; var108++) {
                                    var107.field2850[var108] = 0;
                                    var107.field2869[var108] = 0;
                                }
                            }
                            class16 var109 = (class16) class16.field223.method3485((long) var106);
                            if (var109 != null) {
                                for (int var110 = 0; var110 < var109.field221.length; var110++) {
                                    var109.field221[var110] = -1;
                                    var109.field222[var110] = 0;
                                }
                            }
                            int var111 = field328.method2310();
                            for (int var112 = 0; var112 < var111; var112++) {
                                int var113 = field328.method2344();
                                int var114 = field328.method2334();
                                if (var114 == 255) {
                                    var114 = field328.method2345();
                                }
                                if (var107 != null && var112 < var107.field2850.length) {
                                    var107.field2850[var112] = var113;
                                    var107.field2869[var112] = var114;
                                }
                                class16.method917(var106, var112, var113 - 1, var114);
                            }
                            if (var107 != null) {
                                method538(var107);
                            }
                            method151();
                            field471[++field387 - 1 & 0x1F] = var106 & 0x7FFF;
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 89) {
                            field383 = field468;
                            if (field329 == 0) {
                                field283 = null;
                                field511 = null;
                                Statics.field275 = 0;
                                Statics.field279 = null;
                                field330 = -1;
                                var1 = true;
                            } else {
                                field511 = field328.method2316();
                                long var115 = field328.method2314();
                                field283 = class163.method1524(var115);
                                Statics.field1376 = field328.method2309();
                                int var117 = field328.method2334();
                                if (var117 == 255) {
                                    field330 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field275 = var117;
                                    class25[] var118 = new class25[100];
                                    for (int var119 = 0; var119 < Statics.field275; var119++) {
                                        var118[var119] = new class25();
                                        var118[var119].field623 = field328.method2316();
                                        var118[var119].field622 = class165.method695(var118[var119].field623, Statics.field1642);
                                        var118[var119].field616 = field328.method2310();
                                        var118[var119].field617 = field328.method2309();
                                        field328.method2316();
                                        if (var118[var119].field623.equals(Statics.field2302.field40)) {
                                            Statics.field1357 = var118[var119].field617;
                                        }
                                    }
                                    boolean var120 = false;
                                    int var121 = Statics.field275;
                                    while (var121 > 0) {
                                        boolean var122 = true;
                                        var121--;
                                        for (int var123 = 0; var123 < var121; var123++) {
                                            if (var118[var123].field622.compareTo(var118[var123 + 1].field622) > 0) {
                                                class25 var124 = var118[var123];
                                                var118[var123] = var118[var123 + 1];
                                                var118[var123 + 1] = var124;
                                                var122 = false;
                                            }
                                        }
                                        if (var122) {
                                            break;
                                        }
                                    }
                                    Statics.field279 = var118;
                                    field330 = -1;
                                    var1 = true;
                                }
                            }
                            break label2763;
                        }
                        if (field330 == 75) {
                            field531 = false;
                            for (int var125 = 0; var125 < 5; var125++) {
                                field487[var125] = false;
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 34) {
                            int var126 = field328.method2486();
                            class16 var127 = (class16) class16.field223.method3485((long) var126);
                            if (var127 != null) {
                                var127.method3607();
                            }
                            field471[++field387 - 1 & 0x1F] = var126 & 0x7FFF;
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 18) {
                            method3631(false);
                            field328.method2568();
                            int var128 = field328.method2310();
                            class33.method2234(field328, var128);
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 94) {
                            int var129 = field328.method2345();
                            int var130 = field328.method2310();
                            if (var129 < -70000) {
                                var130 += 32768;
                            }
                            class174 var131;
                            if (var129 >= 0) {
                                var131 = class174.method3117(var129);
                            } else {
                                var131 = null;
                            }
                            while (field328.field2001 < field329) {
                                int var132 = field328.method2321();
                                int var133 = field328.method2310();
                                int var134 = 0;
                                if (var133 != 0) {
                                    var134 = field328.method2334();
                                    if (var134 == 255) {
                                        var134 = field328.method2345();
                                    }
                                }
                                if (var131 != null && var132 >= 0 && var132 < var131.field2850.length) {
                                    var131.field2850[var132] = var133;
                                    var131.field2869[var132] = var134;
                                }
                                class16.method917(var130, var132, var133 - 1, var134);
                            }
                            if (var131 != null) {
                                method538(var131);
                            }
                            method151();
                            field471[++field387 - 1 & 0x1F] = var130 & 0x7FFF;
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 235) {
                            int var135 = field328.method2345();
                            class4 var136 = (class4) field444.method3485((long) var135);
                            if (var136 != null) {
                                method880(var136, true);
                            }
                            if (field400 != null) {
                                method538(field400);
                                field400 = null;
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 88) {
                            int var137 = field328.method2478();
                            int var138 = field328.method2387();
                            int var139 = field328.method2354();
                            class174 var140 = class174.method3117(var139);
                            if (var140.field2816 != var137 || var140.field2787 != var138 || var140.field2782 != 0 || var140.field2783 != 0) {
                                var140.field2816 = var137;
                                var140.field2787 = var138;
                                var140.field2782 = 0;
                                var140.field2783 = 0;
                                method538(var140);
                                method150(var140);
                                if (var140.field2779 == 0) {
                                    method903(Statics.field3169[var139 >> 16], var140, false);
                                }
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 222) {
                            String var141 = field328.method2316();
                            int var142 = field328.method2310();
                            byte var143 = field328.method2309();
                            boolean var144 = false;
                            if (var143 == -128) {
                                var144 = true;
                            }
                            if (var144) {
                                if (Statics.field275 == 0) {
                                    field330 = -1;
                                    var1 = true;
                                    break label2763;
                                }
                                boolean var145 = false;
                                int var146;
                                for (var146 = 0; var146 < Statics.field275 && (!Statics.field279[var146].field623.equals(var141) || Statics.field279[var146].field616 != var142); var146++) {
                                }
                                if (var146 < Statics.field275) {
                                    while (var146 < Statics.field275 - 1) {
                                        Statics.field279[var146] = Statics.field279[var146 + 1];
                                        var146++;
                                    }
                                    Statics.field275--;
                                    Statics.field279[Statics.field275] = null;
                                }
                            } else {
                                field328.method2316();
                                class25 var147 = new class25();
                                var147.field623 = var141;
                                var147.field622 = class165.method695(var147.field623, Statics.field1642);
                                var147.field616 = var142;
                                var147.field617 = var143;
                                int var148;
                                for (var148 = Statics.field275 - 1; var148 >= 0; var148--) {
                                    int var149 = Statics.field279[var148].field622.compareTo(var147.field622);
                                    if (var149 == 0) {
                                        Statics.field279[var148].field616 = var142;
                                        Statics.field279[var148].field617 = var143;
                                        if (var141.equals(Statics.field2302.field40)) {
                                            Statics.field1357 = var143;
                                        }
                                        field383 = field468;
                                        field330 = -1;
                                        var1 = true;
                                        break label2763;
                                    }
                                    if (var149 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field275 >= Statics.field279.length) {
                                    field330 = -1;
                                    var1 = true;
                                    break label2763;
                                }
                                for (int var150 = Statics.field275 - 1; var150 > var148; var150--) {
                                    Statics.field279[var150 + 1] = Statics.field279[var150];
                                }
                                if (Statics.field275 == 0) {
                                    Statics.field279 = new class25[100];
                                }
                                Statics.field279[var148 + 1] = var147;
                                Statics.field275++;
                                if (var141.equals(Statics.field2302.field40)) {
                                    Statics.field1357 = var143;
                                }
                            }
                            field383 = field468;
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 168) {
                            int var151 = field328.method2345();
                            int var152 = field328.method2345();
                            if (Statics.field1990 == null || !Statics.field1990.isValid()) {
                                try {
                                    Iterator var153 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                    while (var153.hasNext()) {
                                        GarbageCollectorMXBean var154 = (GarbageCollectorMXBean) var153.next();
                                        if (var154.isValid()) {
                                            Statics.field1990 = var154;
                                            field562 = -1L;
                                            field477 = -1L;
                                        }
                                    }
                                } catch (Throwable var439) {
                                }
                            }
                            long var156 = class116.method2586();
                            int var158 = -1;
                            if (Statics.field1990 != null) {
                                long var159 = Statics.field1990.getCollectionTime();
                                if (field477 != -1L) {
                                    long var161 = var159 - field477;
                                    long var163 = var156 - field562;
                                    if (var163 != 0L) {
                                        var158 = (int) (var161 * 100L / var163);
                                    }
                                }
                                field477 = var159;
                                field562 = var156;
                            }
                            field326.method2573(71);
                            field326.method2434(field2225);
                            field326.method2328(var158);
                            field326.method2350(var151);
                            field326.method2349(var152);
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 69) {
                            int var165 = field328.method2344();
                            if (var165 == 65535) {
                                var165 = -1;
                            }
                            method795(var165);
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 180) {
                            int var166 = field328.method2486();
                            if (var166 == 65535) {
                                var166 = -1;
                            }
                            int var167 = field328.method2304();
                            method567(var166, var167);
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 240) {
                            int var168 = field328.method2486();
                            int var169 = field328.method2354();
                            int var170 = var168 >> 10 & 0x1F;
                            int var171 = var168 >> 5 & 0x1F;
                            int var172 = var168 & 0x1F;
                            int var173 = (var172 << 3) + (var170 << 19) + (var171 << 11);
                            class174 var174 = class174.method3117(var169);
                            if (var174.field2798 != var173) {
                                var174.field2798 = var173;
                                method538(var174);
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 188) {
                            field523 = 1;
                            field476 = field468;
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 118) {
                            field328.field2001 += 28;
                            if (field328.method2330()) {
                                class150.method2572(field328, field328.field2001 - 28);
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 141) {
                            field531 = true;
                            Statics.field1097 = field328.method2334();
                            Statics.field1465 = field328.method2334();
                            Statics.field157 = field328.method2310();
                            Statics.field2231 = field328.method2334();
                            Statics.field2096 = field328.method2334();
                            if (Statics.field2096 >= 100) {
                                int var175 = Statics.field1097 * 128 + 64;
                                int var176 = Statics.field1465 * 128 + 64;
                                int var177 = method138(var175, var176, Statics.field755) - Statics.field157;
                                int var178 = var175 - Statics.field156;
                                int var179 = var177 - Statics.field206;
                                int var180 = var176 - Statics.field82;
                                int var181 = (int) Math.sqrt((double) (var178 * var178 + var180 * var180));
                                Statics.field2165 = (int) (Math.atan2((double) var179, (double) var181) * 325.949D) & 0x7FF;
                                Statics.field270 = (int) (Math.atan2((double) var178, (double) var180) * -325.949D) & 0x7FF;
                                if (Statics.field2165 < 128) {
                                    Statics.field2165 = 128;
                                }
                                if (Statics.field2165 > 383) {
                                    Statics.field2165 = 383;
                                }
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 233) {
                            int var182 = field328.method2310();
                            int var183 = field328.method2334();
                            int var184 = field328.method2310();
                            if (field561 != 0 && var183 != 0 && field525 < 50) {
                                field526[field525] = var182;
                                field320[field525] = var183;
                                field528[field525] = var184;
                                field530[field525] = null;
                                field533[field525] = 0;
                                field525++;
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 161) {
                            int var188 = field328.method2352();
                            int var189 = field328.method2352();
                            class4 var190 = (class4) field444.method3485((long) var188);
                            class4 var191 = (class4) field444.method3485((long) var189);
                            if (var191 != null) {
                                method880(var191, var190 == null || var190.field66 != var191.field66);
                            }
                            if (var190 != null) {
                                var190.method3607();
                                field444.method3486(var190, (long) var189);
                            }
                            class174 var192 = class174.method3117(var188);
                            if (var192 != null) {
                                method538(var192);
                            }
                            class174 var193 = class174.method3117(var189);
                            if (var193 != null) {
                                method538(var193);
                                method903(Statics.field3169[var193.field2777 >>> 16], var193, true);
                            }
                            if (field443 != -1) {
                                int var194 = field443;
                                if (class174.method3153(var194)) {
                                    method131(Statics.field3169[var194], 1);
                                }
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 205) {
                            int var195 = field328.method2486();
                            int var196 = field328.method2353();
                            int var197 = field328.method2310();
                            int var198 = field328.method2486();
                            class174 var199 = class174.method3117(var196);
                            if (var199.field2790 != var198 || var199.field2799 != var197 || var199.field2831 != var195) {
                                var199.field2790 = var198;
                                var199.field2799 = var197;
                                var199.field2831 = var195;
                                method538(var199);
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 176) {
                            for (int var200 = 0; var200 < class177.field2924.length; var200++) {
                                if (class177.field2925[var200] != class177.field2924[var200]) {
                                    class177.field2924[var200] = class177.field2925[var200];
                                    Statics.method1528(var200);
                                    field513[++field470 - 1 & 0x1F] = var200;
                                }
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 126) {
                            for (int var201 = 0; var201 < Statics.field1169; var201++) {
                                class53 var202 = class53.method548(var201);
                                if (var202 != null) {
                                    class177.field2925[var201] = 0;
                                    class177.field2924[var201] = 0;
                                }
                            }
                            method151();
                            field470 += 32;
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 33) {
                            for (int var203 = 0; var203 < field406.length; var203++) {
                                if (field406[var203] != null) {
                                    field406[var203].field835 = -1;
                                }
                            }
                            for (int var204 = 0; var204 < field321.length; var204++) {
                                if (field321[var204] != null) {
                                    field321[var204].field835 = -1;
                                }
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 60) {
                            int var205 = field328.method2352();
                            class174 var206 = class174.method3117(var205);
                            for (int var207 = 0; var207 < var206.field2850.length; var207++) {
                                var206.field2850[var207] = -1;
                                var206.field2850[var207] = 0;
                            }
                            method538(var206);
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 124) {
                            String var208 = field328.method2316();
                            long var209 = (long) field328.method2310();
                            long var211 = (long) field328.method2312();
                            class153[] var213 = new class153[] { class153.field2300, class153.field2295, class153.field2294, class153.field2291, class153.field2292 };
                            class153 var214 = (class153) class110.method632(var213, field328.method2334());
                            long var215 = (var209 << 32) + var211;
                            boolean var217 = false;
                            for (int var218 = 0; var218 < 100; var218++) {
                                if (field488[var218] == var215) {
                                    var217 = true;
                                    break;
                                }
                            }
                            if (method193(var208)) {
                                var217 = true;
                            }
                            if (!var217 && field405 == 0) {
                                field488[field505] = var215;
                                field505 = (field505 + 1) % 100;
                                String var219 = class224.method3704(class164.method152(class223.method3446(field328)));
                                byte var220;
                                if (var214.field2298) {
                                    var220 = 7;
                                } else {
                                    var220 = 3;
                                }
                                if (var214.field2297 == -1) {
                                    class12.method683(var220, var208, var219);
                                } else {
                                    int var222 = var214.field2297;
                                    String var223 = "<img=" + var222 + ">";
                                    class12.method683(var220, var223 + var208, var219);
                                }
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 37) {
                            boolean var224 = field328.method2334() == 1;
                            if (var224) {
                                Statics.field560 = class116.method2586() - field328.method2314();
                                Statics.field2180 = new class222(field328, true);
                            } else {
                                Statics.field2180 = null;
                            }
                            field538 = field468;
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 148) {
                            int var225 = field328.method2353();
                            String var226 = field328.method2316();
                            class174 var227 = class174.method3117(var225);
                            if (!var226.equals(var227.field2833)) {
                                var227.field2833 = var226;
                                method538(var227);
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 10) {
                            field546 = field328.method2334();
                            if (field546 == 255) {
                                field546 = 0;
                            }
                            field518 = field328.method2334();
                            if (field518 == 255) {
                                field518 = 0;
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 90) {
                            method713(false);
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 59) {
                            int var228 = field328.method2486();
                            if (var228 == 65535) {
                                var228 = -1;
                            }
                            int var229 = field328.method2345();
                            int var230 = field328.method2345();
                            class174 var231 = class174.method3117(var230);
                            if (var231.field2776) {
                                var231.field2897 = var228;
                                var231.field2898 = var229;
                                class52 var233 = class52.method2583(var228);
                                var231.field2790 = var233.field1127;
                                var231.field2799 = var233.field1128;
                                var231.field2800 = var233.field1145;
                                var231.field2844 = var233.field1111;
                                var231.field2827 = var233.field1131;
                                var231.field2831 = var233.field1112;
                                if (var233.field1132 == 1) {
                                    var231.field2835 = 1;
                                } else {
                                    var231.field2835 = 2;
                                }
                                if (var231.field2866 > 0) {
                                    var231.field2831 = var231.field2831 * 32 / var231.field2866;
                                } else if (var231.field2788 > 0) {
                                    var231.field2831 = var231.field2831 * 32 / var231.field2788;
                                }
                                method538(var231);
                            } else {
                                if (var228 == -1) {
                                    var231.field2872 = 0;
                                    field330 = -1;
                                    var1 = true;
                                    break label2763;
                                }
                                class52 var232 = class52.method2583(var228);
                                var231.field2872 = 4;
                                var231.field2830 = var228;
                                var231.field2790 = var232.field1127;
                                var231.field2799 = var232.field1128;
                                var231.field2831 = var232.field1112 * 100 / var229;
                                method538(var231);
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 203 || field330 == 171 || field330 == 208 || field330 == 58 || field330 == 79 || field330 == 44 || field330 == 100 || field330 == 0 || field330 == 251 || field330 == 38) {
                            method2917();
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 92) {
                            class33.method2234(field328, field329);
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 98) {
                            while (field328.field2001 < field329) {
                                boolean var234 = field328.method2334() == 1;
                                String var235 = field328.method2316();
                                String var236 = field328.method2316();
                                int var237 = field328.method2310();
                                int var238 = field328.method2334();
                                int var239 = field328.method2334();
                                boolean var240 = (var239 & 0x2) != 0;
                                boolean var241 = (var239 & 0x1) != 0;
                                if (var237 > 0) {
                                    field328.method2316();
                                    field328.method2334();
                                    field328.method2345();
                                }
                                field328.method2316();
                                for (int var242 = 0; var242 < field419; var242++) {
                                    class18 var243 = field552[var242];
                                    if (var234) {
                                        if (var236.equals(var243.field240)) {
                                            var243.field240 = var235;
                                            var243.field239 = var236;
                                            var235 = null;
                                            break;
                                        }
                                    } else if (var235.equals(var243.field240)) {
                                        if (var243.field250 != var237) {
                                            boolean var244 = true;
                                            for (class39 var245 = (class39) field553.method3472(); var245 != null; var245 = (class39) field553.method3474()) {
                                                if (var245.field866.equals(var235)) {
                                                    if (var237 != 0 && var245.field868 == 0) {
                                                        var245.method3598();
                                                        var244 = false;
                                                    } else if (var237 == 0 && var245.field868 != 0) {
                                                        var245.method3598();
                                                        var244 = false;
                                                    }
                                                }
                                            }
                                            if (var244) {
                                                field553.method3476(new class39(var235, var237));
                                            }
                                            var243.field250 = var237;
                                        }
                                        var243.field239 = var236;
                                        var243.field238 = var238;
                                        var243.field242 = var240;
                                        var243.field243 = var241;
                                        var235 = null;
                                        break;
                                    }
                                }
                                if (var235 != null && field419 < 400) {
                                    class18 var246 = new class18();
                                    field552[field419] = var246;
                                    var246.field240 = var235;
                                    var246.field239 = var236;
                                    var246.field250 = var237;
                                    var246.field238 = var238;
                                    var246.field242 = var240;
                                    var246.field243 = var241;
                                    field419++;
                                }
                            }
                            field523 = 2;
                            field476 = field468;
                            boolean var247 = false;
                            int var248 = field419;
                            while (var248 > 0) {
                                boolean var249 = true;
                                var248--;
                                for (int var250 = 0; var250 < var248; var250++) {
                                    boolean var251 = false;
                                    class18 var252 = field552[var250];
                                    class18 var253 = field552[var250 + 1];
                                    if (field479 != var252.field250 && field479 == var253.field250) {
                                        var251 = true;
                                    }
                                    if (!var251 && var252.field250 == 0 && var253.field250 != 0) {
                                        var251 = true;
                                    }
                                    if (!var251 && !var252.field242 && var253.field242) {
                                        var251 = true;
                                    }
                                    if (!var251 && !var252.field243 && var253.field243) {
                                        var251 = true;
                                    }
                                    if (var251) {
                                        class18 var254 = field552[var250];
                                        field552[var250] = field552[var250 + 1];
                                        field552[var250 + 1] = var254;
                                        var249 = false;
                                    }
                                }
                                if (var249) {
                                    break;
                                }
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 11) {
                            method713(true);
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 112) {
                            if (field443 != -1) {
                                int var255 = field443;
                                if (class174.method3153(var255)) {
                                    method131(Statics.field3169[var255], 0);
                                }
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 253) {
                            field531 = true;
                            Statics.field1637 = field328.method2334();
                            Statics.field673 = field328.method2334();
                            Statics.field1645 = field328.method2310();
                            Statics.field2301 = field328.method2334();
                            Statics.field152 = field328.method2334();
                            if (Statics.field152 >= 100) {
                                Statics.field156 = Statics.field1637 * 128 + 64;
                                Statics.field82 = Statics.field673 * 128 + 64;
                                Statics.field206 = method138(Statics.field156, Statics.field82, Statics.field755) - Statics.field1645;
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 166) {
                            method3631(true);
                            field328.method2568();
                            int var256 = field328.method2310();
                            class33.method2234(field328, var256);
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 192) {
                            int var257 = field328.method2353();
                            Statics.field2169 = Statics.field1401.method2690(var257);
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 23) {
                            int var258 = field328.method2344();
                            field443 = var258;
                            method2778(false);
                            if (class174.method3153(var258)) {
                                class174[] var259 = Statics.field3169[var258];
                                for (int var260 = 0; var260 < var259.length; var260++) {
                                    class174 var261 = var259[var260];
                                    if (var261 != null) {
                                        var261.field2899 = 0;
                                        var261.field2768 = 0;
                                    }
                                }
                            }
                            class37.method1984(field443);
                            for (int var262 = 0; var262 < 100; var262++) {
                                field397[var262] = true;
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 204) {
                            String var263 = field328.method2316();
                            Statics.field290 = var263;
                            try {
                                String var264 = Statics.field281.getParameter(class191.field3078.field3068);
                                String var265 = Statics.field281.getParameter(class191.field3079.field3068);
                                String var266 = var264 + "settings=" + var263 + "; version=1; path=/; domain=" + var265;
                                String var267;
                                if (var263.length() == 0) {
                                    var267 = var266 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                                } else {
                                    String var268 = var266 + "; Expires=";
                                    long var269 = class116.method2586() + 94608000000L;
                                    class112.field1964.setTime(new Date(var269));
                                    int var271 = class112.field1964.get(7);
                                    int var272 = class112.field1964.get(5);
                                    int var273 = class112.field1964.get(2);
                                    int var274 = class112.field1964.get(1);
                                    int var275 = class112.field1964.get(11);
                                    int var276 = class112.field1964.get(12);
                                    int var277 = class112.field1964.get(13);
                                    String var278 = class112.field1959[var271 - 1] + ", " + var272 / 10 + var272 % 10 + "-" + class112.field1966[0][var273] + "-" + var274 + " " + var275 / 10 + var275 % 10 + ":" + var276 / 10 + var276 % 10 + ":" + var277 / 10 + var277 % 10 + " GMT";
                                    var267 = var268 + var278 + "; Max-Age=" + 94608000L;
                                }
                                class133.method2653(Statics.field281, "document.cookie=\"" + var267 + "\"");
                            } catch (Throwable var437) {
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 212) {
                            class26 var280 = new class26();
                            var280.field641 = field328.method2316();
                            var280.field638 = field328.method2310();
                            int var281 = field328.method2345();
                            var280.field646 = var281;
                            method15(45);
                            Statics.field1113.method2786();
                            Statics.field1113 = null;
                            class32.method1491(var280);
                            field330 = -1;
                            var1 = false;
                            break label2763;
                        }
                        if (field330 == 87) {
                            method3616();
                            field330 = -1;
                            var1 = false;
                            break label2763;
                        }
                        if (field330 == 182) {
                            int var282 = field328.method2334();
                            int var283 = field328.method2334();
                            int var284 = field328.method2334();
                            int var285 = field328.method2334();
                            field487[var282] = true;
                            field282[var282] = var283;
                            field534[var282] = var284;
                            field535[var282] = var285;
                            field467[var282] = 0;
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 91) {
                            String var286 = field328.method2316();
                            long var287 = field328.method2314();
                            long var289 = (long) field328.method2310();
                            long var291 = (long) field328.method2312();
                            class153[] var293 = new class153[] { class153.field2300, class153.field2295, class153.field2294, class153.field2291, class153.field2292 };
                            class153 var294 = (class153) class110.method632(var293, field328.method2334());
                            long var295 = (var289 << 32) + var291;
                            boolean var297 = false;
                            for (int var298 = 0; var298 < 100; var298++) {
                                if (field488[var298] == var295) {
                                    var297 = true;
                                    break;
                                }
                            }
                            if (var294.field2299 && method193(var286)) {
                                var297 = true;
                            }
                            if (!var297 && field405 == 0) {
                                field488[field505] = var295;
                                field505 = (field505 + 1) % 100;
                                String var299 = class224.method3704(class164.method152(class223.method3446(field328)));
                                if (var294.field2297 == -1) {
                                    class12.method316(9, var286, var299, class163.method35(var287));
                                } else {
                                    int var300 = var294.field2297;
                                    String var301 = "<img=" + var300 + ">";
                                    class12.method316(9, var301 + var286, var299, class163.method35(var287));
                                }
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 244) {
                            int var302 = field328.method2345();
                            int var303 = field328.method2486();
                            int var304 = field328.method2310();
                            class174 var305 = class174.method3117(var302);
                            var305.field2870 = (var304 << 16) + var303;
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 191) {
                            int var306 = field328.method2321();
                            boolean var307 = field328.method2334() == 1;
                            String var308 = "";
                            boolean var309 = false;
                            if (var307) {
                                var308 = field328.method2316();
                                if (method193(var308)) {
                                    var309 = true;
                                }
                            }
                            String var310 = field328.method2316();
                            if (!var309) {
                                class12.method683(var306, var308, var310);
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 99) {
                            int var311 = field328.method2353();
                            int var312 = field328.method2310();
                            class174 var313 = class174.method3117(var311);
                            if (var313 != null && var313.field2779 == 0) {
                                if (var312 > var313.field2824 - var313.field2793) {
                                    var312 = var313.field2824 - var313.field2793;
                                }
                                if (var312 < 0) {
                                    var312 = 0;
                                }
                                if (var313.field2862 != var312) {
                                    var313.field2862 = var312;
                                    method538(var313);
                                }
                            }
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 216) {
                            int var314 = field328.method2334();
                            if (field328.method2334() == 0) {
                                field559[var314] = new class221();
                                field328.field2001 += 18;
                            } else {
                                field328.field2001--;
                                field559[var314] = new class221(field328, false);
                            }
                            field478 = field468;
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 174) {
                            int var315 = field328.method2385();
                            int var316 = field328.method2352();
                            class177.field2925[var315] = var316;
                            if (class177.field2924[var315] != var316) {
                                class177.field2924[var315] = var316;
                            }
                            Statics.method1528(var315);
                            field513[++field470 - 1 & 0x1F] = var315;
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 52) {
                            field301 = field328.method2486() * 30;
                            field480 = field468;
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        if (field330 == 25) {
                            int var317 = field328.method2345();
                            class174 var318 = class174.method3117(var317);
                            var318.field2872 = 3;
                            var318.field2830 = Statics.field2302.field60.method3211();
                            method538(var318);
                            field330 = -1;
                            var1 = true;
                            break label2763;
                        }
                        class149.method635("" + field330 + class2.field35 + field334 + class2.field35 + field335 + class2.field35 + field329, (Throwable) null);
                        method3616();
                    } catch (IOException var445) {
                        method2780();
                    } catch (Exception var446) {
                        String var321 = "" + field330 + class2.field35 + field334 + class2.field35 + field335 + class2.field35 + field329 + class2.field35 + (Statics.field1566 + Statics.field2302.field848[0]) + class2.field35 + (Statics.field359 + Statics.field2302.field840[0]) + class2.field35;
                        for (int var322 = 0; var322 < field329 && var322 < 50; var322++) {
                            var321 = var321 + field328.field2002[var322] + class2.field35;
                        }
                        class149.method635(var321, var446);
                        method3616();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field463 != 30) {
            return;
        }
        while (class212.method2225()) {
            field326.method2573(49);
            field326.method2293(0);
            int var323 = field326.field2001;
            class212.method5(field326);
            field326.method2305(field326.field2001 - var323);
        }
        Object var324 = Statics.field1083.field205;
        synchronized (Statics.field1083.field205) {
            if (!field414) {
                Statics.field1083.field207 = 0;
            } else if (class141.field2186 != 0 || Statics.field1083.field207 >= 40) {
                field326.method2573(171);
                field326.method2293(0);
                int var325 = field326.field2001;
                int var326 = 0;
                for (int var327 = 0; var327 < Statics.field1083.field207 && field326.field2001 - var325 < 240; var327++) {
                    var326++;
                    int var328 = Statics.field1083.field203[var327];
                    if (var328 < 0) {
                        var328 = 0;
                    } else if (var328 > 502) {
                        var328 = 502;
                    }
                    int var329 = Statics.field1083.field202[var327];
                    if (var329 < 0) {
                        var329 = 0;
                    } else if (var329 > 764) {
                        var329 = 764;
                    }
                    int var330 = var328 * 765 + var329;
                    if (Statics.field1083.field203[var327] == -1 && Statics.field1083.field202[var327] == -1) {
                        var329 = -1;
                        var328 = -1;
                        var330 = 524287;
                    }
                    if (field296 != var329 || field297 != var328) {
                        int var331 = var329 - field296;
                        field296 = var329;
                        int var332 = var328 - field297;
                        field297 = var328;
                        if (field298 < 8 && var331 >= -32 && var331 <= 31 && var332 >= -32 && var332 <= 31) {
                            var331 += 32;
                            var332 += 32;
                            field326.method2294((field298 << 12) + (var331 << 6) + var332);
                            field298 = 0;
                        } else if (field298 < 8) {
                            field326.method2295((field298 << 19) + 8388608 + var330);
                            field298 = 0;
                        } else {
                            field326.method2296((field298 << 19) + -1073741824 + var330);
                            field298 = 0;
                        }
                    } else if (field298 < 2047) {
                        field298++;
                    }
                }
                field326.method2305(field326.field2001 - var325);
                if (var326 >= Statics.field1083.field207) {
                    Statics.field1083.field207 = 0;
                } else {
                    Statics.field1083.field207 -= var326;
                    for (int var333 = 0; var333 < Statics.field1083.field207; var333++) {
                        Statics.field1083.field202[var333] = Statics.field1083.field202[var326 + var333];
                        Statics.field1083.field203[var333] = Statics.field1083.field203[var326 + var333];
                    }
                }
            }
        }
        if (class141.field2186 == 1 || !Statics.field1756 && class141.field2186 == 4 || class141.field2186 == 2) {
            long var335 = (class141.field2189 - field309) / 50L;
            if (var335 > 4095L) {
                var335 = 4095L;
            }
            field309 = class141.field2189;
            int var337 = class141.field2188;
            if (var337 < 0) {
                var337 = 0;
            } else if (var337 > Statics.field967) {
                var337 = Statics.field967;
            }
            int var338 = class141.field2191;
            if (var338 < 0) {
                var338 = 0;
            } else if (var338 > Statics.field163) {
                var338 = Statics.field163;
            }
            int var339 = (int) var335;
            field326.method2573(150);
            field326.method2294((var339 << 1) + (class141.field2186 == 2 ? 1 : 0));
            field326.method2294(var338);
            field326.method2294(var337);
        }
        if (class138.field2150 > 0) {
            field326.method2573(164);
            field326.method2294(0);
            int var340 = field326.field2001;
            long var341 = class116.method2586();
            for (int var343 = 0; var343 < class138.field2150; var343++) {
                long var344 = var341 - field509;
                if (var344 > 16777215L) {
                    var344 = 16777215L;
                }
                field509 = var341;
                field326.method2347((int) var344);
                field326.method2328(class138.field2147[var343]);
            }
            field326.method2311(field326.field2001 - var340);
        }
        if (field384 > 0) {
            field384--;
        }
        if (class138.field2134[96] || class138.field2134[97] || class138.field2134[98] || class138.field2134[99]) {
            field498 = true;
        }
        if (field498 && field384 <= 0) {
            field384 = 20;
            field498 = false;
            field326.method2573(203);
            field326.method2342(field368);
            field326.method2341(field303);
        }
        if (Statics.field671 && !field299) {
            field299 = true;
            field326.method2573(145);
            field326.method2293(1);
        }
        if (!Statics.field671 && field299) {
            field299 = false;
            field326.method2573(145);
            field326.method2293(0);
        }
        method1908();
        if (field463 != 30) {
            return;
        }
        for (class17 var346 = (class17) field543.method3534(); var346 != null; var346 = (class17) field543.method3516()) {
            if (var346.field236 > 0) {
                var346.field236--;
            }
            if (var346.field236 != 0) {
                if (var346.field235 > 0) {
                    var346.field235--;
                }
                if (var346.field235 == 0 && var346.field227 >= 1 && var346.field228 >= 1 && var346.field227 <= 102 && var346.field228 <= 102 && (var346.field232 < 0 || class6.method712(var346.field232, var346.field226))) {
                    method633(var346.field230, var346.field231, var346.field227, var346.field228, var346.field232, var346.field233, var346.field226);
                    var346.field235 = -1;
                    if (var346.field232 == var346.field225 && var346.field225 == -1) {
                        var346.method3607();
                    } else if (var346.field232 == var346.field225 && var346.field234 == var346.field233 && var346.field229 == var346.field226) {
                        var346.method3607();
                    }
                }
            } else if (var346.field225 < 0 || class6.method712(var346.field225, var346.field229)) {
                method633(var346.field230, var346.field231, var346.field227, var346.field228, var346.field225, var346.field234, var346.field229);
                var346.method3607();
            }
        }
        int var10002;
        for (int var347 = 0; var347 < field525; var347++) {
            var10002 = field528[var347]--;
            if (field528[var347] >= -10) {
                class59 var349 = field530[var347];
                if (var349 == null) {
                    class59 var447 = (class59) null;
                    var349 = class59.method1156(Statics.field1001, field526[var347], 0);
                    if (var349 == null) {
                        continue;
                    }
                    field528[var347] += var349.method1164();
                    field530[var347] = var349;
                }
                if (field528[var347] < 0) {
                    int var356;
                    if (field533[var347] == 0) {
                        var356 = field561;
                    } else {
                        int var350 = (field533[var347] & 0xFF) * 128;
                        int var351 = field533[var347] >> 16 & 0xFF;
                        int var352 = var351 * 128 + 64 - Statics.field2302.field810;
                        if (var352 < 0) {
                            var352 = -var352;
                        }
                        int var353 = field533[var347] >> 8 & 0xFF;
                        int var354 = var353 * 128 + 64 - Statics.field2302.field805;
                        if (var354 < 0) {
                            var354 = -var354;
                        }
                        int var355 = var352 + var354 - 128;
                        if (var355 > var350) {
                            field528[var347] = -100;
                            continue;
                        }
                        if (var355 < 0) {
                            var355 = 0;
                        }
                        var356 = field375 * (var350 - var355) / var350;
                    }
                    if (var356 > 0) {
                        class63 var357 = var349.method1157().method1189(Statics.field1165);
                        class65 var358 = class65.method1211(var357, 100, var356);
                        var358.method1214(field320[var347] - 1);
                        Statics.field2066.method1062(var358);
                    }
                    field528[var347] = -100;
                }
            } else {
                field525--;
                for (int var348 = var347; var348 < field525; var348++) {
                    field526[var348] = field526[var348 + 1];
                    field530[var348] = field530[var348 + 1];
                    field320[var348] = field320[var348 + 1];
                    field528[var348] = field528[var348 + 1];
                    field533[var348] = field533[var348 + 1];
                }
                var347--;
            }
        }
        if (field522 && !class184.method1999()) {
            if (field520 != 0 && field521 != -1) {
                class184.method2084(Statics.field1784, field521, 0, field520, false);
            }
            field522 = false;
        }
        field482++;
        if (field482 > 750) {
            method2780();
            return;
        }
        int var359 = class33.field742;
        int[] var360 = class33.field743;
        for (int var361 = 0; var361 < var359; var361++) {
            class3 var362 = field406[var360[var361]];
            if (var362 != null) {
                method845(var362, 1);
            }
        }
        for (int var363 = 0; var363 < field294; var363++) {
            int var364 = field323[var363];
            class35 var365 = field321[var364];
            if (var365 != null) {
                method845(var365, var365.field773.field882);
            }
        }
        int[] var366 = class33.field743;
        for (int var367 = 0; var367 < class33.field742; var367++) {
            class3 var368 = field406[var366[var367]];
            if (var368 != null && var368.field843 > 0) {
                var368.field843--;
                if (var368.field843 == 0) {
                    var368.field817 = null;
                }
            }
        }
        for (int var369 = 0; var369 < field294; var369++) {
            int var370 = field323[var369];
            class35 var371 = field321[var370];
            if (var371 != null && var371.field843 > 0) {
                var371.field843--;
                if (var371.field843 == 0) {
                    var371.field817 = null;
                }
            }
        }
        field331++;
        if (field395 != 0) {
            field394 += 20;
            if (field394 >= 400) {
                field395 = 0;
            }
        }
        if (Statics.field292 != null) {
            field565++;
            if (field565 >= 15) {
                method538(Statics.field292);
                Statics.field292 = null;
            }
        }
        class174 var372 = Statics.field2083;
        class174 var373 = Statics.field618;
        Statics.field2083 = null;
        Statics.field618 = null;
        field460 = null;
        field428 = false;
        field417 = false;
        field506 = 0;
        while (class138.method2644() && field506 < 128) {
            if (field450 >= 2 && class138.field2134[82] && Statics.field2143 == 66) {
                String var374 = class12.method534();
                Statics.field2624.setContents(new StringSelection(var374), (ClipboardOwner) null);
            } else {
                field508[field506] = Statics.field2143;
                field563[field506] = Statics.field626;
                field506++;
            }
        }
        if (field443 != -1) {
            method532(field443, 0, 0, Statics.field163, Statics.field967, 0, 0);
        }
        field468++;
        while (true) {
            class1 var375;
            class174 var376;
            class174 var377;
            do {
                var375 = (class1) field483.method3526();
                if (var375 == null) {
                    while (true) {
                        class1 var378;
                        class174 var379;
                        class174 var380;
                        do {
                            var378 = (class1) field484.method3526();
                            if (var378 == null) {
                                while (true) {
                                    class1 var381;
                                    class174 var382;
                                    class174 var383;
                                    do {
                                        var381 = (class1) field396.method3526();
                                        if (var381 == null) {
                                            method1171();
                                            if (Statics.field127 == null && field456 == null) {
                                                int var384 = class141.field2186;
                                                if (field424) {
                                                    if (var384 != 1 && (Statics.field1756 || var384 != 4)) {
                                                        int var385 = class141.field2193;
                                                        int var386 = class141.field2190;
                                                        if (var385 < Statics.field966 - 10 || var385 > Statics.field966 + Statics.field2177 + 10 || var386 < Statics.field669 - 10 || var386 > Statics.field669 + Statics.field654 + 10) {
                                                            field424 = false;
                                                            method656(Statics.field966, Statics.field669, Statics.field2177, Statics.field654);
                                                        }
                                                    }
                                                    if (var384 == 1 || !Statics.field1756 && var384 == 4) {
                                                        int var387 = Statics.field966;
                                                        int var388 = Statics.field669;
                                                        int var389 = Statics.field2177;
                                                        int var390 = class141.field2191;
                                                        int var391 = class141.field2188;
                                                        int var392 = -1;
                                                        for (int var393 = 0; var393 < field295; var393++) {
                                                            int var394 = (field295 - 1 - var393) * 15 + var388 + 31;
                                                            if (var390 > var387 && var390 < var387 + var389 && var391 > var394 - 13 && var391 < var394 + 3) {
                                                                var392 = var393;
                                                            }
                                                        }
                                                        if (var392 != -1 && var392 >= 0) {
                                                            int var395 = field426[var392];
                                                            int var396 = field427[var392];
                                                            int var397 = field393[var392];
                                                            int var398 = field503[var392];
                                                            String var399 = field430[var392];
                                                            String var400 = field338[var392];
                                                            method2547(var395, var396, var397, var398, var399, var400, class141.field2191, class141.field2188);
                                                        }
                                                        field424 = false;
                                                        int var401 = Statics.field966;
                                                        int var402 = Statics.field669;
                                                        int var403 = Statics.field2177;
                                                        int var404 = Statics.field654;
                                                        for (int var405 = 0; var405 < field486; var405++) {
                                                            if (field536[var405] + field491[var405] > var401 && field491[var405] < var401 + var403 && field494[var405] + field437[var405] > var402 && field437[var405] < var402 + var404) {
                                                                field397[var405] = true;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    label2878: {
                                                        int var407;
                                                        int var408;
                                                        label2980: {
                                                            if ((var384 == 1 || !Statics.field1756 && var384 == 4) && field295 > 0) {
                                                                int var406 = field393[field295 - 1];
                                                                if (var406 == 39 || var406 == 40 || var406 == 41 || var406 == 42 || var406 == 43 || var406 == 33 || var406 == 34 || var406 == 35 || var406 == 36 || var406 == 37 || var406 == 38 || var406 == 1005) {
                                                                    var407 = field426[field295 - 1];
                                                                    var408 = field427[field295 - 1];
                                                                    class174 var409 = class174.method3117(var408);
                                                                    if (class179.method3135(method2739(var409))) {
                                                                        break label2980;
                                                                    }
                                                                    int var410 = method2739(var409);
                                                                    boolean var411 = (var410 >> 29 & 0x1) != 0;
                                                                    if (var411) {
                                                                        break label2980;
                                                                    }
                                                                }
                                                            }
                                                            if ((var384 == 1 || !Statics.field1756 && var384 == 4) && (field423 == 1 && field295 > 2 || method1909(field295 - 1))) {
                                                                var384 = 2;
                                                            }
                                                            if ((var384 == 1 || !Statics.field1756 && var384 == 4) && field295 > 0) {
                                                                int var412 = field295 - 1;
                                                                if (var412 >= 0) {
                                                                    int var413 = field426[var412];
                                                                    int var414 = field427[var412];
                                                                    int var415 = field393[var412];
                                                                    int var416 = field503[var412];
                                                                    String var417 = field430[var412];
                                                                    String var418 = field338[var412];
                                                                    method2547(var413, var414, var415, var416, var417, var418, class141.field2191, class141.field2188);
                                                                }
                                                            }
                                                            if (var384 == 2 && field295 > 0) {
                                                                method164(class141.field2191, class141.field2188);
                                                            }
                                                            break label2878;
                                                        }
                                                        if (Statics.field127 != null && !field403 && field423 != 1 && !method1909(field295 - 1) && field295 > 0) {
                                                            method659(field425, field316);
                                                        }
                                                        field403 = false;
                                                        field441 = 0;
                                                        if (Statics.field127 != null) {
                                                            method538(Statics.field127);
                                                        }
                                                        Statics.field127 = class174.method3117(var408);
                                                        field399 = var407;
                                                        field425 = class141.field2191;
                                                        field316 = class141.field2188;
                                                        if (field295 > 0) {
                                                            method2620(field295 - 1);
                                                        }
                                                        method538(Statics.field127);
                                                    }
                                                }
                                            }
                                            if (field456 != null) {
                                                method1();
                                            }
                                            if (Statics.field127 != null) {
                                                method538(Statics.field127);
                                                field441++;
                                                if (class141.field2179 == 0) {
                                                    if (field403) {
                                                        if (Statics.field178 == Statics.field127 && field402 != field399) {
                                                            class174 var419 = Statics.field127;
                                                            byte var420 = 0;
                                                            if (field451 == 1 && var419.field2781 == 206) {
                                                                var420 = 1;
                                                            }
                                                            if (var419.field2850[field402] <= 0) {
                                                                var420 = 0;
                                                            }
                                                            if (class179.method2675(method2739(var419))) {
                                                                int var421 = field399;
                                                                int var422 = field402;
                                                                var419.field2850[var422] = var419.field2850[var421];
                                                                var419.field2869[var422] = var419.field2869[var421];
                                                                var419.field2850[var421] = -1;
                                                                var419.field2869[var421] = 0;
                                                            } else if (var420 == 1) {
                                                                int var423 = field399;
                                                                int var424 = field402;
                                                                while (var423 != var424) {
                                                                    if (var423 > var424) {
                                                                        var419.method3143(var423 - 1, var423);
                                                                        var423--;
                                                                    } else if (var423 < var424) {
                                                                        var419.method3143(var423 + 1, var423);
                                                                        var423++;
                                                                    }
                                                                }
                                                            } else {
                                                                var419.method3143(field402, field399);
                                                            }
                                                            field326.method2573(160);
                                                            field326.method2328(var420);
                                                            field326.method2342(field402);
                                                            field326.method2342(field399);
                                                            field326.method2296(Statics.field127.field2777);
                                                        }
                                                    } else if ((field423 == 1 || method1909(field295 - 1)) && field295 > 2) {
                                                        method164(field425, field316);
                                                    } else if (field295 > 0) {
                                                        method659(field425, field316);
                                                    }
                                                    field565 = 10;
                                                    class141.field2186 = 0;
                                                    Statics.field127 = null;
                                                } else if (field441 >= 5 && (class141.field2193 > field425 + 5 || class141.field2193 < field425 - 5 || class141.field2190 > field316 + 5 || class141.field2190 < field316 - 5)) {
                                                    field403 = true;
                                                }
                                            }
                                            if (class87.field1487 != -1) {
                                                int var425 = class87.field1487;
                                                int var426 = class87.field1493;
                                                field326.method2573(44);
                                                field326.method2293(5);
                                                field326.method2332(class138.field2134[82] ? (class138.field2134[81] ? 2 : 1) : 0);
                                                field326.method2340(Statics.field1566 + var425);
                                                field326.method2294(Statics.field359 + var426);
                                                class87.field1487 = -1;
                                                field392 = class141.field2191;
                                                field322 = class141.field2188;
                                                field395 = 1;
                                                field394 = 0;
                                                field546 = var425;
                                                field518 = var426;
                                            }
                                            if (Statics.field2083 != var372) {
                                                if (var372 != null) {
                                                    method538(var372);
                                                }
                                                if (Statics.field2083 != null) {
                                                    method538(Statics.field2083);
                                                }
                                            }
                                            if (Statics.field618 != var373 && field435 == field434) {
                                                if (var373 != null) {
                                                    method538(var373);
                                                }
                                                if (Statics.field618 != null) {
                                                    method538(Statics.field618);
                                                }
                                            }
                                            if (Statics.field618 == null) {
                                                if (field434 > 0) {
                                                    field434--;
                                                }
                                            } else if (field434 < field435) {
                                                field434++;
                                                if (field435 == field434) {
                                                    method538(Statics.field618);
                                                }
                                            }
                                            method85();
                                            if (field531) {
                                                method2626();
                                            }
                                            for (int var427 = 0; var427 < 5; var427++) {
                                                var10002 = field467[var427]++;
                                            }
                                            Statics.field1880.method179();
                                            int var428 = ++class141.field2175 - 1;
                                            int var430 = class138.field2154;
                                            if (var428 > 15000 && var430 > 15000) {
                                                field336 = 250;
                                                class141.method2002(14500);
                                                field326.method2573(12);
                                            }
                                            field355++;
                                            if (field355 > 500) {
                                                field355 = 0;
                                                int var432 = (int) (Math.random() * 8.0D);
                                                if ((var432 & 0x1) == 1) {
                                                    field446 += field350;
                                                }
                                                if ((var432 & 0x2) == 2) {
                                                    field351 += field352;
                                                }
                                                if ((var432 & 0x4) == 4) {
                                                    field353 += field354;
                                                }
                                            }
                                            if (field446 < -50) {
                                                field350 = 2;
                                            }
                                            if (field446 > 50) {
                                                field350 = -2;
                                            }
                                            if (field351 < -55) {
                                                field352 = 2;
                                            }
                                            if (field351 > 55) {
                                                field352 = -2;
                                            }
                                            if (field353 < -40) {
                                                field354 = 1;
                                            }
                                            if (field353 > 40) {
                                                field354 = -1;
                                            }
                                            field360++;
                                            if (field360 > 500) {
                                                field360 = 0;
                                                int var433 = (int) (Math.random() * 8.0D);
                                                if ((var433 & 0x1) == 1) {
                                                    field356 += field357;
                                                }
                                                if ((var433 & 0x2) == 2) {
                                                    field358 += field408;
                                                }
                                            }
                                            if (field356 < -60) {
                                                field357 = 2;
                                            }
                                            if (field356 > 60) {
                                                field357 = -2;
                                            }
                                            if (field358 < -20) {
                                                field408 = 1;
                                            }
                                            if (field358 > 10) {
                                                field408 = -1;
                                            }
                                            for (class39 var434 = (class39) field553.method3472(); var434 != null; var434 = (class39) field553.method3474()) {
                                                if ((long) var434.field871 < class116.method2586() / 1000L - 5L) {
                                                    if (var434.field868 > 0) {
                                                        class12.method683(5, "", var434.field866 + class158.field2481);
                                                    }
                                                    if (var434.field868 == 0) {
                                                        class12.method683(5, "", var434.field866 + class158.field2404);
                                                    }
                                                    var434.method3598();
                                                }
                                            }
                                            field515++;
                                            if (field515 > 50) {
                                                field326.method2573(133);
                                            }
                                            try {
                                                if (Statics.field1113 != null && field326.field2001 > 0) {
                                                    Statics.field1113.method2790(field326.field2002, 0, field326.field2001);
                                                    field326.field2001 = 0;
                                                    field515 = 0;
                                                }
                                            } catch (IOException var436) {
                                                method2780();
                                            }
                                            return;
                                        }
                                        var382 = var381.field3;
                                        if (var382.field2778 < 0) {
                                            break;
                                        }
                                        var383 = class174.method3117(var382.field2796);
                                    } while (var383 == null || var383.field2771 == null || var382.field2778 >= var383.field2771.length || var383.field2771[var382.field2778] != var382);
                                    class37.method3136(var381);
                                }
                            }
                            var379 = var378.field3;
                            if (var379.field2778 < 0) {
                                break;
                            }
                            var380 = class174.method3117(var379.field2796);
                        } while (var380 == null || var380.field2771 == null || var379.field2778 >= var380.field2771.length || var380.field2771[var379.field2778] != var379);
                        class37.method3136(var378);
                    }
                }
                var376 = var375.field3;
                if (var376.field2778 < 0) {
                    break;
                }
                var377 = class174.method3117(var376.field2796);
            } while (var377 == null || var377.field2771 == null || var376.field2778 >= var377.field2771.length || var377.field2771[var376.field2778] != var376);
            class37.method3136(var375);
        }
    }

    @ObfuscatedName("ea.x(S)V")
    public static final void method2678() {
        if (Statics.field332 != null) {
            Statics.field332.method1136();
        }
        if (Statics.field248 != null) {
            Statics.field248.method1136();
        }
    }

    @ObfuscatedName("di.v(Lah;IIII)V")
    public static void method2229(class43 arg0, int arg1, int arg2, int arg3) {
        if (field525 >= 50 || field375 == 0 || arg0.field989 == null || arg1 >= arg0.field989.length) {
            return;
        }
        int var4 = arg0.field989[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field526[field525] = var5;
        field320[field525] = var6;
        field528[field525] = 0;
        field530[field525] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field533[field525] = (var8 << 16) + (var9 << 8) + var7;
        field525++;
    }

    @ObfuscatedName("ao.m(IS)V")
    public static void method795(int arg0) {
        if (arg0 == -1 && !field522) {
            class184.method3137();
        } else if (arg0 != -1 && field521 != arg0 && field520 != 0 && !field522) {
            class184.method2924(2, Statics.field1784, arg0, 0, field520, false);
        }
        field521 = arg0;
    }

    @ObfuscatedName("w.w(III)V")
    public static void method567(int arg0, int arg1) {
        if (field520 != 0 && arg0 != -1) {
            class184.method2084(Statics.field1879, arg0, 0, field520, false);
            field522 = true;
        }
    }

    @ObfuscatedName("cy.e(I)V")
    public static final void method1908() {
        if (Statics.field755 != field512) {
            field512 = Statics.field755;
            method2733(Statics.field755);
        }
    }

    @ObfuscatedName("ey.ad(Ljava/lang/String;I)V")
    public static final void method2890(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1989.field139 = !Statics.field1989.field139;
            class9.method581();
            if (Statics.field1989.field139) {
                class12.method683(99, "", "Roofs are now all hidden");
            } else {
                class12.method683(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field377 = !field377;
        }
        if (field450 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field377 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field377 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method2780();
            }
            if (arg0.equalsIgnoreCase("errortest") && field385 == 2) {
                throw new RuntimeException();
            }
        }
        field326.method2573(205);
        field326.method2293(arg0.length() + 1);
        field326.method2426(arg0);
    }

    @ObfuscatedName("eg.as(I)V")
    public static final void method2626() {
        int var0 = Statics.field1637 * 128 + 64;
        int var1 = Statics.field673 * 128 + 64;
        int var2 = method138(var0, var1, Statics.field755) - Statics.field1645;
        if (Statics.field156 < var0) {
            Statics.field156 += Statics.field152 * (var0 - Statics.field156) / 1000 + Statics.field2301;
            if (Statics.field156 > var0) {
                Statics.field156 = var0;
            }
        }
        if (Statics.field156 > var0) {
            Statics.field156 -= Statics.field152 * (Statics.field156 - var0) / 1000 + Statics.field2301;
            if (Statics.field156 < var0) {
                Statics.field156 = var0;
            }
        }
        if (Statics.field206 < var2) {
            Statics.field206 += Statics.field152 * (var2 - Statics.field206) / 1000 + Statics.field2301;
            if (Statics.field206 > var2) {
                Statics.field206 = var2;
            }
        }
        if (Statics.field206 > var2) {
            Statics.field206 -= Statics.field152 * (Statics.field206 - var2) / 1000 + Statics.field2301;
            if (Statics.field206 < var2) {
                Statics.field206 = var2;
            }
        }
        if (Statics.field82 < var1) {
            Statics.field82 += Statics.field152 * (var1 - Statics.field82) / 1000 + Statics.field2301;
            if (Statics.field82 > var1) {
                Statics.field82 = var1;
            }
        }
        if (Statics.field82 > var1) {
            Statics.field82 -= Statics.field152 * (Statics.field82 - var1) / 1000 + Statics.field2301;
            if (Statics.field82 < var1) {
                Statics.field82 = var1;
            }
        }
        int var3 = Statics.field1097 * 128 + 64;
        int var4 = Statics.field1465 * 128 + 64;
        int var5 = method138(var3, var4, Statics.field755) - Statics.field157;
        int var6 = var3 - Statics.field156;
        int var7 = var5 - Statics.field206;
        int var8 = var4 - Statics.field82;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field2165 < var10) {
            Statics.field2165 += Statics.field2096 * (var10 - Statics.field2165) / 1000 + Statics.field2231;
            if (Statics.field2165 > var10) {
                Statics.field2165 = var10;
            }
        }
        if (Statics.field2165 > var10) {
            Statics.field2165 -= Statics.field2096 * (Statics.field2165 - var10) / 1000 + Statics.field2231;
            if (Statics.field2165 < var10) {
                Statics.field2165 = var10;
            }
        }
        int var12 = var11 - Statics.field270;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field270 += Statics.field2096 * var12 / 1000 + Statics.field2231;
            Statics.field270 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field270 -= Statics.field2096 * -var12 / 1000 + Statics.field2231;
            Statics.field270 &= 0x7FF;
        }
        int var13 = var11 - Statics.field270;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field270 = var11;
        }
    }

    @ObfuscatedName("s.ag(I)V")
    public static final void method85() {
        int var0 = field446 + Statics.field2302.field810;
        int var1 = field351 + Statics.field2302.field805;
        if (Statics.field1391 - var0 < -500 || Statics.field1391 - var0 > 500 || Statics.field1201 - var1 < -500 || Statics.field1201 - var1 > 500) {
            Statics.field1391 = var0;
            Statics.field1201 = var1;
        }
        if (Statics.field1391 != var0) {
            Statics.field1391 += (var0 - Statics.field1391) / 16;
        }
        if (Statics.field1201 != var1) {
            Statics.field1201 += (var1 - Statics.field1201) / 16;
        }
        if (class141.field2179 == 4 && Statics.field1756) {
            int var2 = class141.field2190 - field373;
            field510 = var2 * 2;
            field373 = var2 == -1 || var2 == 1 ? class141.field2190 : (field373 + class141.field2190) / 2;
            int var3 = field372 - class141.field2193;
            field370 = var3 * 2;
            field372 = var3 == -1 || var3 == 1 ? class141.field2193 : (field372 + class141.field2193) / 2;
        } else {
            if (class138.field2134[96]) {
                field370 += (-24 - field370) / 2;
            } else if (class138.field2134[97]) {
                field370 += (24 - field370) / 2;
            } else {
                field370 /= 2;
            }
            if (class138.field2134[98]) {
                field510 += (12 - field510) / 2;
            } else if (class138.field2134[99]) {
                field510 += (-12 - field510) / 2;
            } else {
                field510 /= 2;
            }
            field373 = class141.field2190;
            field372 = class141.field2193;
        }
        field303 = field370 / 2 + field303 & 0x7FF;
        field368 += field510 / 2;
        if (field368 < 128) {
            field368 = 128;
        }
        if (field368 > 383) {
            field368 = 383;
        }
        int var4 = Statics.field1391 >> 7;
        int var5 = Statics.field1201 >> 7;
        int var6 = method138(Statics.field1391, Statics.field1201, Statics.field755);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field755;
                    if (var10 < 3 && (class6.field84[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field101[var10][var8][var9];
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
        if (var12 > field472) {
            field472 += (var12 - field472) / 24;
        } else if (var12 < field472) {
            field472 += (var12 - field472) / 80;
        }
    }

    @ObfuscatedName("ah.al(Lap;II)V")
    public static final void method845(class38 arg0, int arg1) {
        if (arg0.field849 > field333) {
            method3249(arg0);
        } else if (arg0.field850 >= field333) {
            method1530(arg0);
        } else {
            arg0.field828 = arg0.field809;
            if (arg0.field857 == 0) {
                arg0.field861 = 0;
            } else {
                label213: {
                    if (arg0.field835 != -1 && arg0.field825 == 0) {
                        class43 var2 = class43.method168(arg0.field835);
                        if (arg0.field862 > 0 && var2.field990 == 0) {
                            arg0.field861++;
                            break label213;
                        }
                        if (arg0.field862 <= 0 && var2.field993 == 0) {
                            arg0.field861++;
                            break label213;
                        }
                    }
                    int var3 = arg0.field810;
                    int var4 = arg0.field805;
                    int var5 = arg0.field848[arg0.field857 - 1] * 128 + arg0.field808 * 64;
                    int var6 = arg0.field840[arg0.field857 - 1] * 128 + arg0.field808 * 64;
                    if (var3 < var5) {
                        if (var4 < var6) {
                            arg0.field832 = 1280;
                        } else if (var4 > var6) {
                            arg0.field832 = 1792;
                        } else {
                            arg0.field832 = 1536;
                        }
                    } else if (var3 > var5) {
                        if (var4 < var6) {
                            arg0.field832 = 768;
                        } else if (var4 > var6) {
                            arg0.field832 = 256;
                        } else {
                            arg0.field832 = 512;
                        }
                    } else if (var4 < var6) {
                        arg0.field832 = 1024;
                    } else if (var4 > var6) {
                        arg0.field832 = 0;
                    }
                    byte var7 = arg0.field860[arg0.field857 - 1];
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        int var8 = arg0.field832 - arg0.field806 & 0x7FF;
                        if (var8 > 1024) {
                            var8 -= 2048;
                        }
                        int var9 = arg0.field813;
                        if (var8 >= -256 && var8 <= 256) {
                            var9 = arg0.field812;
                        } else if (var8 >= 256 && var8 < 768) {
                            var9 = arg0.field858;
                        } else if (var8 >= -768 && var8 <= -256) {
                            var9 = arg0.field815;
                        }
                        if (var9 == -1) {
                            var9 = arg0.field812;
                        }
                        arg0.field828 = var9;
                        int var10 = 4;
                        boolean var11 = true;
                        if (arg0 instanceof class35) {
                            var11 = ((class35) arg0).field773.field907;
                        }
                        if (var11) {
                            if (arg0.field832 != arg0.field806 && arg0.field829 == -1 && arg0.field864 != 0) {
                                var10 = 2;
                            }
                            if (arg0.field857 > 2) {
                                var10 = 6;
                            }
                            if (arg0.field857 > 3) {
                                var10 = 8;
                            }
                            if (arg0.field861 > 0 && arg0.field857 > 1) {
                                var10 = 8;
                                arg0.field861--;
                            }
                        } else {
                            if (arg0.field857 > 1) {
                                var10 = 6;
                            }
                            if (arg0.field857 > 2) {
                                var10 = 8;
                            }
                            if (arg0.field861 > 0 && arg0.field857 > 1) {
                                var10 = 8;
                                arg0.field861--;
                            }
                        }
                        if (var7 == 2) {
                            var10 <<= 0x1;
                        }
                        if (var10 >= 8 && arg0.field828 == arg0.field812 && arg0.field816 != -1) {
                            arg0.field828 = arg0.field816;
                        }
                        if (var3 != var5 || var4 != var6) {
                            if (var3 < var5) {
                                arg0.field810 += var10;
                                if (arg0.field810 > var5) {
                                    arg0.field810 = var5;
                                }
                            } else if (var3 > var5) {
                                arg0.field810 -= var10;
                                if (arg0.field810 < var5) {
                                    arg0.field810 = var5;
                                }
                            }
                            if (var4 < var6) {
                                arg0.field805 += var10;
                                if (arg0.field805 > var6) {
                                    arg0.field805 = var6;
                                }
                            } else if (var4 > var6) {
                                arg0.field805 -= var10;
                                if (arg0.field805 < var6) {
                                    arg0.field805 = var6;
                                }
                            }
                        }
                        if (arg0.field810 == var5 && arg0.field805 == var6) {
                            arg0.field857--;
                            if (arg0.field862 > 0) {
                                arg0.field862--;
                            }
                        }
                    } else {
                        arg0.field810 = var5;
                        arg0.field805 = var6;
                        arg0.field857--;
                        if (arg0.field862 > 0) {
                            arg0.field862--;
                        }
                    }
                }
            }
        }
        if (arg0.field810 < 128 || arg0.field805 < 128 || arg0.field810 >= 13184 || arg0.field805 >= 13184) {
            arg0.field835 = -1;
            arg0.field837 = -1;
            arg0.field849 = 0;
            arg0.field850 = 0;
            arg0.field810 = arg0.field848[0] * 128 + arg0.field808 * 64;
            arg0.field805 = arg0.field840[0] * 128 + arg0.field808 * 64;
            arg0.method705();
        }
        if (Statics.field2302 == arg0 && (arg0.field810 < 1536 || arg0.field805 < 1536 || arg0.field810 >= 11776 || arg0.field805 >= 11776)) {
            arg0.field835 = -1;
            arg0.field837 = -1;
            arg0.field849 = 0;
            arg0.field850 = 0;
            arg0.field810 = arg0.field848[0] * 128 + arg0.field808 * 64;
            arg0.field805 = arg0.field840[0] * 128 + arg0.field808 * 64;
            arg0.method705();
        }
        method2925(arg0);
        method123(arg0);
    }

    @ObfuscatedName("fy.av(Lap;I)V")
    public static final void method3249(class38 arg0) {
        int var1 = arg0.field849 - field333;
        int var2 = arg0.field814 * 128 + arg0.field808 * 64;
        int var3 = arg0.field847 * 128 + arg0.field808 * 64;
        arg0.field810 += (var2 - arg0.field810) / var1;
        arg0.field805 += (var3 - arg0.field805) / var1;
        arg0.field861 = 0;
        arg0.field832 = arg0.field851;
    }

    @ObfuscatedName("bp.ar(Lap;I)V")
    public static final void method1530(class38 arg0) {
        if (field333 == arg0.field850 || arg0.field835 == -1 || arg0.field825 != 0 || arg0.field819 + 1 > class43.method168(arg0.field835).field988[arg0.field820]) {
            int var1 = arg0.field850 - arg0.field849;
            int var2 = field333 - arg0.field849;
            int var3 = arg0.field814 * 128 + arg0.field808 * 64;
            int var4 = arg0.field847 * 128 + arg0.field808 * 64;
            int var5 = arg0.field846 * 128 + arg0.field808 * 64;
            int var6 = arg0.field856 * 128 + arg0.field808 * 64;
            arg0.field810 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field805 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field861 = 0;
        arg0.field832 = arg0.field851;
        arg0.field806 = arg0.field832;
    }

    @ObfuscatedName("fj.ay(Lap;B)V")
    public static final void method2925(class38 arg0) {
        if (arg0.field864 == 0) {
            return;
        }
        if (arg0.field829 != -1) {
            class38 var1 = null;
            if (arg0.field829 < 32768) {
                var1 = field321[arg0.field829];
            } else if (arg0.field829 >= 32768) {
                var1 = field406[arg0.field829 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field810 - var1.field810;
                int var3 = arg0.field805 - var1.field805;
                if (var2 != 0 || var3 != 0) {
                    arg0.field832 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field830) {
                arg0.field829 = -1;
                arg0.field830 = false;
            }
        }
        if (arg0.field831 != -1 && (arg0.field857 == 0 || arg0.field861 > 0)) {
            arg0.field832 = arg0.field831;
            arg0.field831 = -1;
        }
        int var4 = arg0.field832 - arg0.field806 & 0x7FF;
        if (var4 == 0 && arg0.field830) {
            arg0.field829 = -1;
            arg0.field830 = false;
        }
        if (var4 == 0) {
            arg0.field855 = 0;
            return;
        }
        arg0.field855++;
        if (var4 > 1024) {
            arg0.field806 -= arg0.field864;
            boolean var5 = true;
            if (var4 < arg0.field864 || var4 > 2048 - arg0.field864) {
                arg0.field806 = arg0.field832;
                var5 = false;
            }
            if (arg0.field828 == arg0.field809 && (arg0.field855 > 25 || var5)) {
                if (arg0.field838 == -1) {
                    arg0.field828 = arg0.field812;
                } else {
                    arg0.field828 = arg0.field838;
                }
            }
        } else {
            arg0.field806 += arg0.field864;
            boolean var6 = true;
            if (var4 < arg0.field864 || var4 > 2048 - arg0.field864) {
                arg0.field806 = arg0.field832;
                var6 = false;
            }
            if (arg0.field828 == arg0.field809 && (arg0.field855 > 25 || var6)) {
                if (arg0.field811 == -1) {
                    arg0.field828 = arg0.field812;
                } else {
                    arg0.field828 = arg0.field811;
                }
            }
        }
        arg0.field806 &= 0x7FF;
    }

    @ObfuscatedName("p.aq(Lap;I)V")
    public static final void method123(class38 arg0) {
        arg0.field807 = false;
        if (arg0.field828 != -1) {
            class43 var1 = class43.method168(arg0.field828);
            if (var1 == null || var1.field986 == null) {
                arg0.field828 = -1;
            } else {
                arg0.field834++;
                if (arg0.field833 < var1.field986.length && arg0.field834 > var1.field988[arg0.field833]) {
                    arg0.field834 = 1;
                    arg0.field833++;
                    method2229(var1, arg0.field833, arg0.field810, arg0.field805);
                }
                if (arg0.field833 >= var1.field986.length) {
                    arg0.field834 = 0;
                    arg0.field833 = 0;
                    method2229(var1, arg0.field833, arg0.field810, arg0.field805);
                }
            }
        }
        if (arg0.field837 != -1 && field333 >= arg0.field844) {
            if (arg0.field841 < 0) {
                arg0.field841 = 0;
            }
            int var2 = class44.method153(arg0.field837).field1015;
            if (var2 == -1) {
                arg0.field837 = -1;
            } else {
                class43 var3 = class43.method168(var2);
                if (var3 == null || var3.field986 == null) {
                    arg0.field837 = -1;
                } else {
                    arg0.field842++;
                    if (arg0.field841 < var3.field986.length && arg0.field842 > var3.field988[arg0.field841]) {
                        arg0.field842 = 1;
                        arg0.field841++;
                        method2229(var3, arg0.field841, arg0.field810, arg0.field805);
                    }
                    if (arg0.field841 >= var3.field986.length && (arg0.field841 < 0 || arg0.field841 >= var3.field986.length)) {
                        arg0.field837 = -1;
                    }
                }
            }
        }
        if (arg0.field835 != -1 && arg0.field825 <= 1) {
            class43 var4 = class43.method168(arg0.field835);
            if (var4.field990 == 1 && arg0.field862 > 0 && arg0.field849 <= field333 && arg0.field850 < field333) {
                arg0.field825 = 1;
                return;
            }
        }
        if (arg0.field835 != -1 && arg0.field825 == 0) {
            class43 var5 = class43.method168(arg0.field835);
            if (var5 == null || var5.field986 == null) {
                arg0.field835 = -1;
            } else {
                arg0.field819++;
                if (arg0.field820 < var5.field986.length && arg0.field819 > var5.field988[arg0.field820]) {
                    arg0.field819 = 1;
                    arg0.field820++;
                    method2229(var5, arg0.field820, arg0.field810, arg0.field805);
                }
                if (arg0.field820 >= var5.field986.length) {
                    arg0.field820 -= var5.field982;
                    arg0.field839++;
                    if (arg0.field839 >= var5.field996) {
                        arg0.field835 = -1;
                    } else if (arg0.field820 >= 0 && arg0.field820 < var5.field986.length) {
                        method2229(var5, arg0.field820, arg0.field810, arg0.field805);
                    } else {
                        arg0.field835 = -1;
                    }
                }
                arg0.field807 = var5.field992;
            }
        }
        if (arg0.field825 > 0) {
            arg0.field825--;
        }
    }

    @ObfuscatedName("i.ai(Lg;III)V")
    public static void method3(class3 arg0, int arg1, int arg2) {
        if (arg0.field835 == arg1 && arg1 != -1) {
            int var3 = class43.method168(arg1).field987;
            if (var3 == 1) {
                arg0.field820 = 0;
                arg0.field819 = 0;
                arg0.field825 = arg2;
                arg0.field839 = 0;
            }
            if (var3 == 2) {
                arg0.field839 = 0;
            }
        } else if (arg1 == -1 || arg0.field835 == -1 || class43.method168(arg1).field984 >= class43.method168(arg0.field835).field984) {
            arg0.field835 = arg1;
            arg0.field820 = 0;
            arg0.field819 = 0;
            arg0.field825 = arg2;
            arg0.field839 = 0;
            arg0.field862 = arg0.field857;
        }
    }

    @ObfuscatedName("bg.an(II)V")
    public static void method1138(int arg0) {
        field496 = 0L;
        if (arg0 >= 2) {
            field497 = true;
        } else {
            field497 = false;
        }
        method2245();
        if (field463 >= 25) {
            method3444();
        }
        field2236 = true;
    }

    @ObfuscatedName("cq.aw(I)V")
    public static void method2003() {
        Canvas var0 = Statics.field1222;
        var0.removeKeyListener(class138.field2138);
        var0.removeFocusListener(class138.field2138);
        class138.field2146 = -1;
        Canvas var1 = Statics.field1222;
        var1.removeMouseListener(class141.field2187);
        var1.removeMouseMotionListener(class141.field2187);
        var1.removeFocusListener(class141.field2187);
        class141.field2176 = 0;
        if (Statics.field1069 != null) {
            Statics.field1069.method2632(Statics.field1222);
        }
        Statics.field281.method2815();
        Statics.field1222.setBackground(Color.black);
        class138.method1711(Statics.field1222);
        class141.method2189(Statics.field1222);
        if (Statics.field1069 != null) {
            Statics.field1069.method2631(Statics.field1222);
        }
        if (field443 != -1) {
            method2778(false);
        }
        field2238 = true;
    }

    @ObfuscatedName("gf.ap(I)V")
    public static void method3444() {
        field326.method2573(159);
        class123 var0 = field326;
        int var1 = field497 ? 2 : 1;
        var0.method2293(var1);
        field326.method2294(Statics.field163);
        field326.method2294(Statics.field967);
    }

    @ObfuscatedName("da.ak(I)V")
    public static void method2245() {
        client var0 = Statics.field281;
        synchronized (Statics.field281) {
            Container var1 = Statics.field281.method2860();
            if (var1 != null) {
                Statics.field2050 = Math.max(var1.getSize().width, Statics.field1017);
                Statics.field1916 = Math.max(var1.getSize().height, Statics.field691);
                if (Statics.field1023 == var1) {
                    Insets var2 = Statics.field1023.getInsets();
                    Statics.field2050 -= var2.right + var2.left;
                    Statics.field1916 -= var2.top + var2.bottom;
                }
                if (Statics.field2050 <= 0) {
                    Statics.field2050 = 1;
                }
                if (Statics.field1916 <= 0) {
                    Statics.field1916 = 1;
                }
                int var3 = field497 ? 2 : 1;
                if (var3 == 1) {
                    Statics.field163 = field566;
                    Statics.field967 = field499 * 503;
                } else {
                    Statics.field163 = Math.min(Statics.field2050, 7680);
                    Statics.field967 = Math.min(Statics.field1916, 2160);
                }
                field2227 = (Statics.field2050 - Statics.field163) / 2;
                field2243 = 0;
                Statics.field1222.setSize(Statics.field163, Statics.field967);
                Statics.field1647 = class78.method129(Statics.field163, Statics.field967, Statics.field1222);
                if (Statics.field1023 == var1) {
                    Insets var4 = Statics.field1023.getInsets();
                    Statics.field1222.setLocation(field2227 + var4.left, field2243 + var4.top);
                } else {
                    Statics.field1222.setLocation(field2227, field2243);
                }
                method37();
                if (field443 != -1) {
                    method2778(true);
                }
                Statics.method1985();
            }
        }
    }

    @ObfuscatedName("z.ac(I)V")
    public static void method37() {
        int var0 = Statics.field163;
        int var1 = Statics.field967;
        if (Statics.field2050 < var0) {
            int var2 = Statics.field2050;
        }
        if (Statics.field1916 < var1) {
            int var3 = Statics.field1916;
        }
        if (Statics.field1989 == null) {
            return;
        }
        try {
            client var4 = Statics.field281;
            int var5 = field497 ? 2 : 1;
            class133.method2655(var4, "resize", new Object[] { var5 });
        } catch (Throwable var7) {
        }
    }

    @ObfuscatedName("n.aj(I)V")
    public static final void method180() {
        if (field443 != -1) {
            int var0 = field443;
            if (class174.method3153(var0)) {
                method619(Statics.field3169[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field486; var1++) {
            if (field397[var1]) {
                field489[var1] = true;
            }
            field547[var1] = field397[var1];
            field397[var1] = false;
        }
        field469 = field333;
        field432 = -1;
        field376 = -1;
        Statics.field178 = null;
        if (field443 != -1) {
            field486 = 0;
            int var2 = field443;
            int var3 = Statics.field163;
            int var4 = Statics.field967;
            if (class174.method3153(var2)) {
                Statics.field19 = null;
                method66(Statics.field3169[var2], -1, 0, 0, var3, var4, 0, 0, -1);
                if (Statics.field19 != null) {
                    method66(Statics.field19, -1412584499, 0, 0, var3, var4, Statics.field1103, Statics.field625, -1);
                    Statics.field19 = null;
                }
            } else {
                for (int var5 = 0; var5 < 100; var5++) {
                    field397[var5] = true;
                }
            }
        }
        class80.method1675();
        if (field424) {
            int var9 = Statics.field966;
            int var10 = Statics.field669;
            int var11 = Statics.field2177;
            int var12 = Statics.field654;
            int var13 = 6116423;
            class80.method1666(var9, var10, var11, var12, var13);
            class80.method1666(var9 + 1, var10 + 1, var11 - 2, 16, 0);
            class80.method1653(var9 + 1, var10 + 18, var11 - 2, var12 - 19, 0);
            Statics.field80.method3705(class158.field2594, var9 + 3, var10 + 14, var13, -1);
            int var14 = class141.field2193;
            int var15 = class141.field2190;
            for (int var16 = 0; var16 < field295; var16++) {
                int var17 = (field295 - 1 - var16) * 15 + var10 + 31;
                int var18 = 16777215;
                if (var14 > var9 && var14 < var9 + var11 && var15 > var17 - 13 && var15 < var17 + 3) {
                    var18 = 16776960;
                }
                Statics.field80.method3705(method897(var16), var9 + 3, var17, var18, 0);
            }
            method2006(Statics.field966, Statics.field669, Statics.field2177, Statics.field654);
        } else if (field432 != -1) {
            int var6 = field432;
            int var7 = field376;
            if (field295 >= 2 || field380 != 0 || field438) {
                String var8;
                if (field380 == 1 && field295 < 2) {
                    var8 = class158.field2484 + class158.field2494 + field464 + " " + class2.field24;
                } else if (field438 && field295 < 2) {
                    var8 = field433 + class158.field2494 + field442 + " " + class2.field24;
                } else {
                    var8 = method897(field295 - 1);
                }
                if (field295 > 2) {
                    var8 = var8 + class2.method2916(16777215) + " " + '/' + " " + (field295 - 2) + class158.field2488;
                }
                Statics.field80.method3739(var8, var6 + 4, var7 + 15, 16777215, 0, field333 / 1000);
            }
        }
        if (field495 == 3) {
            for (int var19 = 0; var19 < field486; var19++) {
                if (field547[var19]) {
                    class80.method1639(field491[var19], field437[var19], field536[var19], field494[var19], 16711935, 128);
                } else if (field489[var19]) {
                    class80.method1639(field491[var19], field437[var19], field536[var19], field494[var19], 16711680, 128);
                }
            }
        }
        int var20 = Statics.field755;
        int var21 = Statics.field2302.field810;
        int var22 = Statics.field2302.field805;
        int var23 = field331;
        for (class24 var24 = (class24) class24.field600.method3534(); var24 != null; var24 = (class24) class24.field600.method3516()) {
            if (var24.field603 != -1 || var24.field607 != null) {
                int var25 = 0;
                if (var21 > var24.field613) {
                    var25 += var21 - var24.field613;
                } else if (var21 < var24.field596) {
                    var25 += var24.field596 - var21;
                }
                if (var22 > var24.field606) {
                    var25 += var22 - var24.field606;
                } else if (var22 < var24.field610) {
                    var25 += var24.field610 - var22;
                }
                if (var25 - 64 > var24.field602 || field375 == 0 || var24.field597 != var20) {
                    if (var24.field604 != null) {
                        Statics.field2066.method1060(var24.field604);
                        var24.field604 = null;
                    }
                    if (var24.field601 != null) {
                        Statics.field2066.method1060(var24.field601);
                        var24.field601 = null;
                    }
                } else {
                    var25 -= 64;
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    int var26 = field375 * (var24.field602 - var25) / var24.field602;
                    class59 var10000;
                    if (var24.field604 != null) {
                        var24.field604.method1215(var26);
                    } else if (var24.field603 >= 0) {
                        var10000 = (class59) null;
                        class59 var27 = class59.method1156(Statics.field1001, var24.field603, 0);
                        if (var27 != null) {
                            class63 var28 = var27.method1157().method1189(Statics.field1165);
                            class65 var29 = class65.method1211(var28, 100, var26);
                            var29.method1214(-1);
                            Statics.field2066.method1062(var29);
                            var24.field604 = var29;
                        }
                    }
                    if (var24.field601 != null) {
                        var24.field601.method1215(var26);
                        if (!var24.field601.method3601()) {
                            var24.field601 = null;
                        }
                    } else if (var24.field607 != null && (var24.field608 -= var23) <= 0) {
                        int var30 = (int) (Math.random() * (double) var24.field607.length);
                        var10000 = (class59) null;
                        class59 var31 = class59.method1156(Statics.field1001, var24.field607[var30], 0);
                        if (var31 != null) {
                            class63 var32 = var31.method1157().method1189(Statics.field1165);
                            class65 var33 = class65.method1211(var32, 100, var26);
                            var33.method1214(0);
                            Statics.field2066.method1062(var33);
                            var24.field601 = var33;
                            var24.field608 = var24.field598 + (int) (Math.random() * (double) (var24.field605 - var24.field598));
                        }
                    }
                }
            }
        }
        field331 = 0;
    }

    @ObfuscatedName("bp.ah(Ljava/lang/String;ZI)V")
    public static final void method1525(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1441.method3756(arg0, 250);
        int var6 = Statics.field1441.method3718(arg0, 250) * 13;
        class80.method1666(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1653(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1441.method3722(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method656(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method2006(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1222.getGraphics();
            Statics.field1647.method1459(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1222.repaint();
        }
    }

    @ObfuscatedName("fr.ae(IIIII)V")
    public static final void method3184(int arg0, int arg1, int arg2, int arg3) {
        field389++;
        Statics.method121(class34.field767);
        boolean var4 = false;
        if (field485 >= 0) {
            int var5 = class33.field742;
            int[] var6 = class33.field743;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field485 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            Statics.method121(class34.field759);
        }
        method6(true);
        Statics.method121(var4 ? class34.field761 : class34.field760);
        method6(false);
        method1538();
        method1522();
        method636(arg0, arg1, arg2, arg3, true);
        int var8 = field545;
        int var9 = field490;
        int var10 = field415;
        int var11 = field548;
        class80.method1634(var8, var9, var8 + var10, var9 + var11);
        class92.method1945();
        if (!field531) {
            int var12 = field368;
            if (field472 / 256 > var12) {
                var12 = field472 / 256;
            }
            if (field487[4] && field534[4] + 128 > var12) {
                var12 = field534[4] + 128;
            }
            int var13 = field353 + field303 & 0x7FF;
            method2629(Statics.field1391, method138(Statics.field2302.field810, Statics.field2302.field805, Statics.field755) - field374, Statics.field1201, var12, var13, var12 * 3 + 600);
        }
        int var14;
        if (field531) {
            int var15;
            if (Statics.field1989.field139) {
                var15 = Statics.field755;
            } else {
                int var16 = method138(Statics.field156, Statics.field82, Statics.field755);
                if (var16 - Statics.field206 >= 800 || (class6.field84[Statics.field755][Statics.field156 >> 7][Statics.field82 >> 7] & 0x4) == 0) {
                    var15 = 3;
                } else {
                    var15 = Statics.field755;
                }
            }
            var14 = var15;
        } else {
            var14 = method634();
        }
        int var17 = Statics.field156;
        int var18 = Statics.field206;
        int var19 = Statics.field82;
        int var20 = Statics.field2165;
        int var21 = Statics.field270;
        for (int var22 = 0; var22 < 5; var22++) {
            if (field487[var22]) {
                int var23 = (int) (Math.random() * (double) (field282[var22] * 2 + 1) - (double) field282[var22] + Math.sin((double) field535[var22] / 100.0D * (double) field467[var22]) * (double) field534[var22]);
                if (var22 == 0) {
                    Statics.field156 += var23;
                }
                if (var22 == 1) {
                    Statics.field206 += var23;
                }
                if (var22 == 2) {
                    Statics.field82 += var23;
                }
                if (var22 == 3) {
                    Statics.field270 = Statics.field270 + var23 & 0x7FF;
                }
                if (var22 == 4) {
                    Statics.field2165 += var23;
                    if (Statics.field2165 < 128) {
                        Statics.field2165 = 128;
                    }
                    if (Statics.field2165 > 383) {
                        Statics.field2165 = 383;
                    }
                }
            }
        }
        int var24 = class141.field2193;
        int var25 = class141.field2190;
        if (class141.field2186 != 0) {
            var24 = class141.field2191;
            var25 = class141.field2188;
        }
        if (var24 >= var8 && var24 < var8 + var10 && var25 >= var9 && var25 < var9 + var11) {
            class106.field1861 = true;
            class106.field1864 = 0;
            class106.field1806 = var24 - var8;
            class106.field1863 = var25 - var9;
        } else {
            class106.field1861 = false;
            class106.field1864 = 0;
        }
        method2678();
        class80.method1666(var8, var9, var10, var11, 0);
        method2678();
        int var26 = class92.field1587;
        class92.field1587 = field549;
        Statics.field3162.method1870(Statics.field156, Statics.field206, Statics.field82, Statics.field2165, Statics.field270, var14);
        class92.field1587 = var26;
        method2678();
        Statics.field3162.method1745();
        method916(var8, var9, var10, var11);
        if (field302 == 2) {
            method658((field305 - Statics.field1566 << 7) + field308, (field306 - Statics.field359 << 7) + field524, field307 * 2);
            if (field390 > -1 && field333 % 20 < 10) {
                Statics.field2267[0].method1548(field390 + var8 - 12, field366 + var9 - 28);
            }
        }
        ((class96) Statics.field1600).method1989(field331);
        if (field395 == 1) {
            Statics.field2286[field394 / 100].method1548(field392 - 8, field322 - 8);
        }
        if (field395 == 2) {
            Statics.field2286[field394 / 100 + 4].method1548(field392 - 8, field322 - 8);
        }
        method848();
        Statics.field156 = var17;
        Statics.field206 = var18;
        Statics.field82 = var19;
        Statics.field2165 = var20;
        Statics.field270 = var21;
        if (field293 && class172.method1139(true, false) == 0) {
            field293 = false;
        }
        if (field293) {
            class80.method1666(var8, var9, var10, var11, 0);
            method1525(class158.field2346, false);
        }
    }

    @ObfuscatedName("av.aa(IIIIZB)V")
    public static final void method636(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field420 - field537) * var5 / 100 + field537;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field527) {
            short var8 = field527;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field542) {
                var6 = field542;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1675();
                    class80.method1666(arg0, arg1, var10, arg3, -16777216);
                    class80.method1666(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field544) {
            short var11 = field544;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field541) {
                var6 = field541;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1675();
                    class80.method1666(arg0, arg1, arg2, var13, -16777216);
                    class80.method1666(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field519 - field539) * var5 / 100 + field539;
        field549 = arg3 * var6 * var14 / 85504 << 1;
        if (field415 != arg2 || field548 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class92.field1603[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class87.method1766(var15, 500, 800, arg2, arg3);
        }
        field545 = arg0;
        field490 = arg1;
        field415 = arg2;
        field548 = arg3;
    }

    @ObfuscatedName("i.ab(ZI)V")
    public static final void method6(boolean arg0) {
        for (int var1 = 0; var1 < field294; var1++) {
            class35 var2 = field321[field323[var1]];
            int var3 = (field323[var1] << 14) + 536870912;
            if (var2 != null && var2.method25() && var2.field773.field903 == arg0 && var2.field773.method734()) {
                int var4 = var2.field810 >> 7;
                int var5 = var2.field805 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field808 == 1 && (var2.field810 & 0x7F) == 64 && (var2.field805 & 0x7F) == 64) {
                        if (field389 == field388[var4][var5]) {
                            continue;
                        }
                        field388[var4][var5] = field389;
                    }
                    if (!var2.field773.field911) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field3162.method1764(Statics.field755, var2.field810, var2.field805, method138(var2.field810 + (var2.field808 * 64 - 64), var2.field805 + (var2.field808 * 64 - 64), Statics.field755), var2.field808 * 64 - 64 + 60, var2, var2.field806, var3, var2.field807);
                }
            }
        }
    }

    @ObfuscatedName("bz.am(I)V")
    public static final void method1538() {
        for (class7 var0 = (class7) field418.method3534(); var0 != null; var0 = (class7) field418.method3516()) {
            if (Statics.field755 != var0.field118 || field333 > var0.field124) {
                var0.method3607();
            } else if (field333 >= var0.field108) {
                if (var0.field121 > 0) {
                    class35 var1 = field321[var0.field121 - 1];
                    if (var1 != null && var1.field810 >= 0 && var1.field810 < 13312 && var1.field805 >= 0 && var1.field805 < 13312) {
                        var0.method70(var1.field810, var1.field805, method138(var1.field810, var1.field805, var0.field118) - var0.field109, field333);
                    }
                }
                if (var0.field121 < 0) {
                    int var2 = -var0.field121 - 1;
                    class3 var3;
                    if (field461 == var2) {
                        var3 = Statics.field2302;
                    } else {
                        var3 = field406[var2];
                    }
                    if (var3 != null && var3.field810 >= 0 && var3.field810 < 13312 && var3.field805 >= 0 && var3.field805 < 13312) {
                        var0.method70(var3.field810, var3.field805, method138(var3.field810, var3.field805, var0.field118) - var0.field109, field333);
                    }
                }
                var0.method72(field331);
                Statics.field3162.method1764(Statics.field755, (int) var0.field114, (int) var0.field115, (int) var0.field116, 60, var0, var0.field122, -1, false);
            }
        }
    }

    @ObfuscatedName("bp.at(I)V")
    public static final void method1522() {
        for (class30 var0 = (class30) field447.method3534(); var0 != null; var0 = (class30) field447.method3516()) {
            if (Statics.field755 != var0.field685 || var0.field692) {
                var0.method3607();
            } else if (field333 >= var0.field684) {
                var0.method628(field331);
                if (var0.field692) {
                    var0.method3607();
                } else {
                    Statics.field3162.method1764(var0.field685, var0.field686, var0.field694, var0.field688, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("av.az(I)I")
    public static final int method634() {
        if (Statics.field1989.field139) {
            return Statics.field755;
        }
        int var0 = 3;
        if (Statics.field2165 < 310) {
            int var1 = Statics.field156 >> 7;
            int var2 = Statics.field82 >> 7;
            int var3 = Statics.field2302.field810 >> 7;
            int var4 = Statics.field2302.field805 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field755;
            }
            if ((class6.field84[Statics.field755][var1][var2] & 0x4) != 0) {
                var0 = Statics.field755;
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
                    if ((class6.field84[Statics.field755][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field755;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field84[Statics.field755][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field755;
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
                    if ((class6.field84[Statics.field755][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field755;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field84[Statics.field755][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field755;
                        }
                    }
                }
            }
        }
        if (Statics.field2302.field810 >= 0 && Statics.field2302.field805 >= 0 && Statics.field2302.field810 < 13312 && Statics.field2302.field805 < 13312) {
            if ((class6.field84[Statics.field755][Statics.field2302.field810 >> 7][Statics.field2302.field805 >> 7] & 0x4) != 0) {
                var0 = Statics.field755;
            }
            return var0;
        } else {
            return Statics.field755;
        }
    }

    @ObfuscatedName("p.af(Lap;IIIIIS)V")
    public static final void method124(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method25()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field773;
            if (var6.field908 != null) {
                var6 = var6.method720();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class33.field742;
        int[] var8 = class33.field743;
        if (arg1 < var7) {
            int var9 = 30;
            class3 var10 = (class3) arg0;
            if (var10.field57) {
                return;
            }
            if (var10.field38 != -1 || var10.field39 != -1) {
                int var11 = arg0.field853 + 15;
                method658(arg0.field810, arg0.field805, var11);
                if (field390 > -1) {
                    if (var10.field38 != -1) {
                        Statics.field215[var10.field38].method1548(field390 + arg2 - 12, field366 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field39 != -1) {
                        Statics.field172[var10.field39].method1548(field390 + arg2 - 12, field366 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field302 == 10 && field507 == var8[arg1]) {
                int var12 = arg0.field853 + 15;
                method658(arg0.field810, arg0.field805, var12);
                if (field390 > -1) {
                    Statics.field2267[1].method1548(field390 + arg2 - 12, field366 + arg3 - var9);
                }
            }
        } else {
            class40 var13 = ((class35) arg0).field773;
            if (var13.field908 != null) {
                var13 = var13.method720();
            }
            if (var13.field892 >= 0 && var13.field892 < Statics.field172.length) {
                int var14 = arg0.field853 + 15;
                method658(arg0.field810, arg0.field805, var14);
                if (field390 > -1) {
                    Statics.field172[var13.field892].method1548(field390 + arg2 - 12, field366 + arg3 - 30);
                }
            }
            if (field302 == 1 && field407 == field323[arg1 - var7] && field333 % 20 < 10) {
                int var15 = arg0.field853 + 15;
                method658(arg0.field810, arg0.field805, var15);
                if (field390 > -1) {
                    Statics.field2267[0].method1548(field390 + arg2 - 12, field366 + arg3 - 28);
                }
            }
        }
        if (arg0.field817 != null && (arg1 >= var7 || !arg0.field836 && (field501 == 4 || !arg0.field818 && (field501 == 0 || field501 == 3 || field501 == 1 && method930(((class3) arg0).field40, false))))) {
            int var16 = arg0.field853;
            method658(arg0.field810, arg0.field805, var16);
            if (field390 > -1 && field378 < field379) {
                field431[field378] = Statics.field80.method3700(arg0.field817) / 2;
                field382[field378] = Statics.field80.field3194;
                field555[field378] = field390;
                field381[field378] = field366;
                field551[field378] = arg0.field821;
                field369[field378] = arg0.field822;
                field386[field378] = arg0.field843;
                field448[field378] = arg0.field817;
                field378++;
            }
        }
        if (arg0.field859 > field333) {
            int var17 = arg0.field853 + 15;
            method658(arg0.field810, arg0.field805, var17);
            if (field390 > -1) {
                int var18;
                if (arg1 < var7) {
                    var18 = 30;
                } else {
                    class40 var19 = ((class35) arg0).field773;
                    var18 = var19.field914;
                }
                int var20 = arg0.field827 * var18 / arg0.field845;
                if (var20 > var18) {
                    var20 = var18;
                } else if (var20 == 0 && arg0.field827 > 0) {
                    var20 = 1;
                }
                class80.method1666(field390 + arg2 - var18 / 2, field366 + arg3 - 3, var20, 5, 65280);
                class80.method1666(field390 + arg2 - var18 / 2 + var20, field366 + arg3 - 3, var18 - var20, 5, 16711680);
            }
        }
        for (int var21 = 0; var21 < 4; var21++) {
            if (arg0.field854[var21] > field333) {
                int var22 = arg0.field853 / 2;
                method658(arg0.field810, arg0.field805, var22);
                if (field390 > -1) {
                    if (var21 == 1) {
                        field366 -= 20;
                    }
                    if (var21 == 2) {
                        field390 -= 15;
                        field366 -= 10;
                    }
                    if (var21 == 3) {
                        field390 += 15;
                        field366 -= 10;
                    }
                    Statics.field619[arg0.field852[var21]].method1548(field390 + arg2 - 12, field366 + arg3 - 12);
                    Statics.field27.method3707(Integer.toString(arg0.field823[var21]), field390 + arg2 - 1, field366 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("ab.ax(IIIII)V")
    public static final void method916(int arg0, int arg1, int arg2, int arg3) {
        field378 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class33.field742;
        int[] var7 = class33.field743;
        for (int var8 = 0; var8 < field294 + var6; var8++) {
            class38 var9;
            if (var8 < var6) {
                var9 = field406[var7[var8]];
                if (field485 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field321[field323[var8 - var6]];
            }
            method124(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method124(field406[field485], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field378; var10++) {
            int var11 = field555[var10];
            int var12 = field381[var10];
            int var13 = field431[var10];
            int var14 = field382[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field381[var16] - field382[var16] && var12 - var14 < field381[var16] + 2 && var11 - var13 < field555[var16] + field431[var16] && var11 + var13 > field555[var16] - field431[var16] && field381[var16] - field382[var16] < var12) {
                        var12 = field381[var16] - field382[var16];
                        var15 = true;
                    }
                }
            }
            field390 = field555[var10];
            field366 = field381[var10] = var12;
            String var17 = field448[var10];
            if (field445 == 0) {
                int var18 = 16776960;
                if (field551[var10] < 6) {
                    var18 = field500[field551[var10]];
                }
                if (field551[var10] == 6) {
                    var18 = field389 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field551[var10] == 7) {
                    var18 = field389 % 20 < 10 ? 255 : 65535;
                }
                if (field551[var10] == 8) {
                    var18 = field389 % 20 < 10 ? 45056 : 8454016;
                }
                if (field551[var10] == 9) {
                    int var19 = 150 - field386[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field551[var10] == 10) {
                    int var20 = 150 - field386[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field551[var10] == 11) {
                    int var21 = 150 - field386[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field369[var10] == 0) {
                    Statics.field80.method3707(var17, field390 + arg0, field366 + arg1, var18, 0);
                }
                if (field369[var10] == 1) {
                    Statics.field80.method3709(var17, field390 + arg0, field366 + arg1, var18, 0, field389);
                }
                if (field369[var10] == 2) {
                    Statics.field80.method3792(var17, field390 + arg0, field366 + arg1, var18, 0, field389);
                }
                if (field369[var10] == 3) {
                    Statics.field80.method3711(var17, field390 + arg0, field366 + arg1, var18, 0, field389, 150 - field386[var10]);
                }
                if (field369[var10] == 4) {
                    int var22 = (150 - field386[var10]) * (Statics.field80.method3700(var17) + 100) / 150;
                    class80.method1681(field390 + arg0 - 50, arg1, field390 + arg0 + 50, arg1 + arg3);
                    Statics.field80.method3705(var17, field390 + arg0 + 50 - var22, field366 + arg1, var18, 0);
                    class80.method1634(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field369[var10] == 5) {
                    int var23 = 150 - field386[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class80.method1681(arg0, field366 + arg1 - Statics.field80.field3194 - 1, arg0 + arg2, field366 + arg1 + 5);
                    Statics.field80.method3707(var17, field390 + arg0, field366 + arg1 + var24, var18, 0);
                    class80.method1634(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field80.method3707(var17, field390 + arg0, field366 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("ah.bf(B)V")
    public static final void method848() {
        field405 = 0;
        int var0 = (Statics.field2302.field810 >> 7) + Statics.field1566;
        int var1 = (Statics.field2302.field805 >> 7) + Statics.field359;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field405 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field405 = 1;
        }
        if (field405 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field405 = 0;
        }
    }

    @ObfuscatedName("ar.bi(IIII)V")
    public static final void method658(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field390 = -1;
            field366 = -1;
            return;
        }
        int var3 = method138(arg0, arg1, Statics.field755) - arg2;
        int var4 = arg0 - Statics.field156;
        int var5 = var3 - Statics.field206;
        int var6 = arg1 - Statics.field82;
        int var7 = class92.field1603[Statics.field2165];
        int var8 = class92.field1604[Statics.field2165];
        int var9 = class92.field1603[Statics.field270];
        int var10 = class92.field1604[Statics.field270];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field390 = field549 * var11 / var15 + field415 / 2;
            field366 = field549 * var14 / var15 + field548 / 2;
        } else {
            field390 = -1;
            field366 = -1;
        }
    }

    @ObfuscatedName("b.br(IIII)I")
    public static final int method138(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field84[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field101[var5][var3][var4] + class6.field101[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field101[var5][var3][var4 + 1] + class6.field101[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("eg.bd(IIIIIII)V")
    public static final void method2629(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class92.field1603[var6];
            int var12 = class92.field1604[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class92.field1603[var7];
            int var15 = class92.field1604[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field156 = arg0 - var8;
        Statics.field206 = arg1 - var9;
        Statics.field82 = arg2 - var10;
        Statics.field2165 = arg3;
        Statics.field270 = arg4;
    }

    @ObfuscatedName("hr.bg(ZI)V")
    public static final void method3631(boolean arg0) {
        field346 = arg0;
        if (!field346) {
            int var1 = field328.method2344();
            int var2 = field328.method2486();
            int var3 = field328.method2310();
            Statics.field747 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field747[var4][var5] = field328.method2345();
                }
            }
            Statics.field2692 = new int[var3];
            Statics.field1685 = new int[var3];
            Statics.field344 = new int[var3];
            Statics.field1981 = new byte[var3][];
            Statics.field588 = new byte[var3][];
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
                        Statics.field2692[var7] = var10;
                        Statics.field1685[var7] = Statics.field273.method3017("m" + var8 + "_" + var9);
                        Statics.field344[var7] = Statics.field273.method3017("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method820(var1, var2);
            return;
        }
        int var11 = field328.method2385();
        int var12 = field328.method2310();
        int var13 = field328.method2310();
        field328.method2566();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field328.method2553(1);
                    if (var17 == 1) {
                        field347[var14][var15][var16] = field328.method2553(26);
                    } else {
                        field347[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field328.method2554();
        Statics.field747 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field747[var18][var19] = field328.method2345();
            }
        }
        Statics.field2692 = new int[var13];
        Statics.field1685 = new int[var13];
        Statics.field344 = new int[var13];
        Statics.field1981 = new byte[var13][];
        Statics.field588 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field347[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field2692[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field2692[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field1685[var20] = Statics.field273.method3017("m" + var29 + "_" + var30);
                            Statics.field344[var20] = Statics.field273.method3017("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method820(var11, var12);
    }

    @ObfuscatedName("ah.bh(III)V")
    public static final void method820(int arg0, int arg1) {
        if (Statics.field965 == arg0 && Statics.field733 == arg1) {
            return;
        }
        Statics.field965 = arg0;
        Statics.field733 = arg1;
        method15(25);
        method1525(class158.field2346, true);
        int var2 = Statics.field1566;
        int var3 = Statics.field359;
        Statics.field1566 = (arg0 - 6) * 8;
        Statics.field359 = (arg1 - 6) * 8;
        int var4 = Statics.field1566 - var2;
        int var5 = Statics.field359 - var3;
        int var6 = Statics.field1566;
        int var7 = Statics.field359;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field321[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field848[var10] -= var4;
                    var9.field840[var10] -= var5;
                }
                var9.field810 -= var4 * 128;
                var9.field805 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field406[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field848[var13] -= var4;
                    var12.field840[var13] -= var5;
                }
                var12.field810 -= var4 * 128;
                var12.field805 -= var5 * 128;
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
        for (class17 var25 = (class17) field543.method3534(); var25 != null; var25 = (class17) field543.method3516()) {
            var25.field227 -= var4;
            var25.field228 -= var5;
            if (var25.field227 < 0 || var25.field228 < 0 || var25.field227 >= 104 || var25.field228 >= 104) {
                var25.method3607();
            }
        }
        if (field546 != 0) {
            field546 -= var4;
            field518 -= var5;
        }
        field525 = 0;
        field531 = false;
        field512 = -1;
        field447.method3509();
        field418.method3509();
        for (int var26 = 0; var26 < 4; var26++) {
            field345[var26].method2195();
        }
    }

    @ObfuscatedName("w.bn(ZB)V")
    public static final void method563(boolean arg0) {
        method2678();
        field515++;
        if (field515 < 50 && !arg0) {
            return;
        }
        field515 = 0;
        if (field337 || Statics.field1113 == null) {
            return;
        }
        field326.method2573(133);
        try {
            Statics.field1113.method2790(field326.field2002, 0, field326.field2001);
            field326.field2001 = 0;
        } catch (IOException var2) {
            field337 = true;
        }
    }

    @ObfuscatedName("bz.bb(S)V")
    public static final void method1537() {
        method563(false);
        field339 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field1981.length; var1++) {
            if (Statics.field1685[var1] != -1 && Statics.field1981[var1] == null) {
                Statics.field1981[var1] = Statics.field273.method3002(Statics.field1685[var1], 0);
                if (Statics.field1981[var1] == null) {
                    var0 = false;
                    field339++;
                }
            }
            if (Statics.field344[var1] != -1 && Statics.field588[var1] == null) {
                Statics.field588[var1] = Statics.field273.method3003(Statics.field344[var1], 0, Statics.field747[var1]);
                if (Statics.field588[var1] == null) {
                    var0 = false;
                    field339++;
                }
            }
        }
        if (!var0) {
            field404 = 1;
            return;
        }
        field341 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field1981.length; var3++) {
            byte[] var4 = Statics.field588[var3];
            if (var4 != null) {
                int var5 = (Statics.field2692[var3] >> 8) * 64 - Statics.field1566;
                int var6 = (Statics.field2692[var3] & 0xFF) * 64 - Statics.field359;
                if (field346) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class120 var9 = new class120(var4);
                int var10 = -1;
                label1180: while (true) {
                    int var11 = var9.method2321();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2321();
                            if (var16 == 0) {
                                continue label1180;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2334() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class41 var22 = class41.method948(var10);
                                if (var19 != 22 || !field288 || var22.field925 != 0 || var22.field932 == 1 || var22.field953) {
                                    if (!var22.method761()) {
                                        field341++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2321();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2334();
                    }
                }
            }
        }
        if (!var2) {
            field404 = 2;
            return;
        }
        if (field404 != 0) {
            method1525(class158.field2346 + class2.field25 + class2.field20 + 100 + "%" + class2.field23, true);
        }
        method2678();
        method165();
        method2678();
        Statics.field3162.method1731();
        method2678();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field345[var23].method2195();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class6.field84[var24][var25][var26] = 0;
                }
            }
        }
        method2678();
        class6.field85 = 99;
        Statics.field2673 = new byte[4][104][104];
        Statics.field88 = new byte[4][104][104];
        Statics.field87 = new byte[4][104][104];
        Statics.field1082 = new byte[4][104][104];
        Statics.field1775 = new int[4][105][105];
        Statics.field93 = new byte[4][105][105];
        Statics.field89 = new int[105][105];
        Statics.field1076 = new int[104];
        Statics.field1392 = new int[104];
        Statics.field1975 = new int[104];
        Statics.field251 = new int[104];
        Statics.field90 = new int[104];
        int var27 = Statics.field1981.length;
        class24.method568();
        method563(true);
        if (!field346) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field2692[var28] >> 8) * 64 - Statics.field1566;
                int var30 = (Statics.field2692[var28] & 0xFF) * 64 - Statics.field359;
                byte[] var31 = Statics.field1981[var28];
                if (var31 != null) {
                    method2678();
                    class6.method162(var31, var29, var30, Statics.field965 * 8 - 48, Statics.field733 * 8 - 48, field345);
                }
            }
            for (int var32 = 0; var32 < var27; var32++) {
                int var33 = (Statics.field2692[var32] >> 8) * 64 - Statics.field1566;
                int var34 = (Statics.field2692[var32] & 0xFF) * 64 - Statics.field359;
                byte[] var35 = Statics.field1981[var32];
                if (var35 == null && Statics.field733 < 800) {
                    method2678();
                    class6.method2243(var33, var34, 64, 64);
                }
            }
            method563(true);
            for (int var36 = 0; var36 < var27; var36++) {
                byte[] var37 = Statics.field588[var36];
                if (var37 != null) {
                    int var38 = (Statics.field2692[var36] >> 8) * 64 - Statics.field1566;
                    int var39 = (Statics.field2692[var36] & 0xFF) * 64 - Statics.field359;
                    method2678();
                    class87 var40 = Statics.field3162;
                    class109[] var41 = field345;
                    class120 var42 = new class120(var37);
                    int var43 = -1;
                    while (true) {
                        int var44 = var42.method2321();
                        if (var44 == 0) {
                            break;
                        }
                        var43 += var44;
                        int var45 = 0;
                        while (true) {
                            int var46 = var42.method2321();
                            if (var46 == 0) {
                                break;
                            }
                            var45 += var46 - 1;
                            int var47 = var45 & 0x3F;
                            int var48 = var45 >> 6 & 0x3F;
                            int var49 = var45 >> 12;
                            int var50 = var42.method2334();
                            int var51 = var50 >> 2;
                            int var52 = var50 & 0x3;
                            int var53 = var38 + var48;
                            int var54 = var39 + var47;
                            if (var53 > 0 && var54 > 0 && var53 < 103 && var54 < 103) {
                                int var55 = var49;
                                if ((class6.field84[1][var53][var54] & 0x2) == 2) {
                                    var55 = var49 - 1;
                                }
                                class109 var56 = null;
                                if (var55 >= 0) {
                                    var56 = var41[var55];
                                }
                                class6.method2597(var49, var53, var54, var43, var52, var51, var40, var56);
                            }
                        }
                    }
                }
            }
        }
        if (field346) {
            for (int var57 = 0; var57 < 4; var57++) {
                method2678();
                for (int var58 = 0; var58 < 13; var58++) {
                    for (int var59 = 0; var59 < 13; var59++) {
                        boolean var60 = false;
                        int var61 = field347[var57][var58][var59];
                        if (var61 != -1) {
                            int var62 = var61 >> 24 & 0x3;
                            int var63 = var61 >> 1 & 0x3;
                            int var64 = var61 >> 14 & 0x3FF;
                            int var65 = var61 >> 3 & 0x7FF;
                            int var66 = (var64 / 8 << 8) + var65 / 8;
                            for (int var67 = 0; var67 < Statics.field2692.length; var67++) {
                                if (Statics.field2692[var67] == var66 && Statics.field1981[var67] != null) {
                                    byte[] var68 = Statics.field1981[var67];
                                    int var69 = var58 * 8;
                                    int var70 = var59 * 8;
                                    int var71 = (var64 & 0x7) * 8;
                                    int var72 = (var65 & 0x7) * 8;
                                    class109[] var73 = field345;
                                    for (int var74 = 0; var74 < 8; var74++) {
                                        for (int var75 = 0; var75 < 8; var75++) {
                                            if (var69 + var74 > 0 && var69 + var74 < 103 && var70 + var75 > 0 && var70 + var75 < 103) {
                                                var73[var57].field1907[var69 + var74][var70 + var75] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class120 var76 = new class120(var68);
                                    for (int var77 = 0; var77 < 4; var77++) {
                                        for (int var78 = 0; var78 < 64; var78++) {
                                            for (int var79 = 0; var79 < 64; var79++) {
                                                if (var62 == var77 && var78 >= var71 && var78 < var71 + 8 && var79 >= var72 && var79 < var72 + 8) {
                                                    class6.method2087(var76, var57, var69 + class178.method2663(var78 & 0x7, var79 & 0x7, var63), var70 + class178.method3185(var78 & 0x7, var79 & 0x7, var63), 0, 0, var63);
                                                } else {
                                                    class6.method2087(var76, 0, -1, -1, 0, 0, 0);
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
                            int var80 = var57;
                            int var81 = var58 * 8;
                            int var82 = var59 * 8;
                            for (int var83 = 0; var83 < 8; var83++) {
                                for (int var84 = 0; var84 < 8; var84++) {
                                    class6.field101[var80][var81 + var83][var82 + var84] = 0;
                                }
                            }
                            if (var81 > 0) {
                                for (int var85 = 1; var85 < 8; var85++) {
                                    class6.field101[var80][var81][var82 + var85] = class6.field101[var80][var81 - 1][var82 + var85];
                                }
                            }
                            if (var82 > 0) {
                                for (int var86 = 1; var86 < 8; var86++) {
                                    class6.field101[var80][var81 + var86][var82] = class6.field101[var80][var81 + var86][var82 - 1];
                                }
                            }
                            if (var81 > 0 && class6.field101[var80][var81 - 1][var82] != 0) {
                                class6.field101[var80][var81][var82] = class6.field101[var80][var81 - 1][var82];
                            } else if (var82 > 0 && class6.field101[var80][var81][var82 - 1] != 0) {
                                class6.field101[var80][var81][var82] = class6.field101[var80][var81][var82 - 1];
                            } else if (var81 > 0 && var82 > 0 && class6.field101[var80][var81 - 1][var82 - 1] != 0) {
                                class6.field101[var80][var81][var82] = class6.field101[var80][var81 - 1][var82 - 1];
                            }
                        }
                    }
                }
            }
            for (int var87 = 0; var87 < 13; var87++) {
                for (int var88 = 0; var88 < 13; var88++) {
                    int var89 = field347[0][var87][var88];
                    if (var89 == -1) {
                        class6.method2243(var87 * 8, var88 * 8, 8, 8);
                    }
                }
            }
            method563(true);
            for (int var90 = 0; var90 < 4; var90++) {
                method2678();
                for (int var91 = 0; var91 < 13; var91++) {
                    label974: for (int var92 = 0; var92 < 13; var92++) {
                        int var93 = field347[var90][var91][var92];
                        if (var93 != -1) {
                            int var94 = var93 >> 24 & 0x3;
                            int var95 = var93 >> 1 & 0x3;
                            int var96 = var93 >> 14 & 0x3FF;
                            int var97 = var93 >> 3 & 0x7FF;
                            int var98 = (var96 / 8 << 8) + var97 / 8;
                            for (int var99 = 0; var99 < Statics.field2692.length; var99++) {
                                if (Statics.field2692[var99] == var98 && Statics.field588[var99] != null) {
                                    byte[] var100 = Statics.field588[var99];
                                    int var101 = var91 * 8;
                                    int var102 = var92 * 8;
                                    int var103 = (var96 & 0x7) * 8;
                                    int var104 = (var97 & 0x7) * 8;
                                    class87 var105 = Statics.field3162;
                                    class109[] var106 = field345;
                                    class120 var107 = new class120(var100);
                                    int var108 = -1;
                                    while (true) {
                                        int var109 = var107.method2321();
                                        if (var109 == 0) {
                                            continue label974;
                                        }
                                        var108 += var109;
                                        int var110 = 0;
                                        while (true) {
                                            int var111 = var107.method2321();
                                            if (var111 == 0) {
                                                break;
                                            }
                                            var110 += var111 - 1;
                                            int var112 = var110 & 0x3F;
                                            int var113 = var110 >> 6 & 0x3F;
                                            int var114 = var110 >> 12;
                                            int var115 = var107.method2334();
                                            int var116 = var115 >> 2;
                                            int var117 = var115 & 0x3;
                                            if (var94 == var114 && var113 >= var103 && var113 < var103 + 8 && var112 >= var104 && var112 < var104 + 8) {
                                                class41 var118 = class41.method948(var108);
                                                int var120 = var113 & 0x7;
                                                int var121 = var112 & 0x7;
                                                int var123 = var118.field955;
                                                int var124 = var118.field924;
                                                if ((var117 & 0x1) == 1) {
                                                    int var125 = var123;
                                                    var123 = var124;
                                                    var124 = var125;
                                                }
                                                int var126 = var95 & 0x3;
                                                int var127;
                                                if (var126 == 0) {
                                                    var127 = var120;
                                                } else if (var126 == 1) {
                                                    var127 = var121;
                                                } else if (var126 == 2) {
                                                    var127 = 7 - var120 - (var123 - 1);
                                                } else {
                                                    var127 = 7 - var121 - (var124 - 1);
                                                }
                                                int var128 = var101 + var127;
                                                int var130 = var113 & 0x7;
                                                int var131 = var112 & 0x7;
                                                int var133 = var118.field955;
                                                int var134 = var118.field924;
                                                if ((var117 & 0x1) == 1) {
                                                    int var135 = var133;
                                                    var133 = var134;
                                                    var134 = var135;
                                                }
                                                int var136 = var95 & 0x3;
                                                int var137;
                                                if (var136 == 0) {
                                                    var137 = var131;
                                                } else if (var136 == 1) {
                                                    var137 = 7 - var130 - (var133 - 1);
                                                } else if (var136 == 2) {
                                                    var137 = 7 - var131 - (var134 - 1);
                                                } else {
                                                    var137 = var130;
                                                }
                                                int var138 = var102 + var137;
                                                if (var128 > 0 && var138 > 0 && var128 < 103 && var138 < 103) {
                                                    int var139 = var90;
                                                    if ((class6.field84[1][var128][var138] & 0x2) == 2) {
                                                        var139 = var90 - 1;
                                                    }
                                                    class109 var140 = null;
                                                    if (var139 >= 0) {
                                                        var140 = var106[var139];
                                                    }
                                                    class6.method2597(var90, var128, var138, var108, var95 + var117 & 0x3, var116, var105, var140);
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
        method563(true);
        method165();
        method2678();
        class87 var141 = Statics.field3162;
        class109[] var142 = field345;
        for (int var143 = 0; var143 < 4; var143++) {
            for (int var144 = 0; var144 < 104; var144++) {
                for (int var145 = 0; var145 < 104; var145++) {
                    if ((class6.field84[var143][var144][var145] & 0x1) == 1) {
                        int var146 = var143;
                        if ((class6.field84[1][var144][var145] & 0x2) == 2) {
                            var146 = var143 - 1;
                        }
                        if (var146 >= 0) {
                            var142[var146].method2200(var144, var145);
                        }
                    }
                }
            }
        }
        class6.field97 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field97 < -8) {
            class6.field97 = -8;
        }
        if (class6.field97 > 8) {
            class6.field97 = 8;
        }
        class6.field98 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field98 < -16) {
            class6.field98 = -16;
        }
        if (class6.field98 > 16) {
            class6.field98 = 16;
        }
        for (int var147 = 0; var147 < 4; var147++) {
            byte[][] var148 = Statics.field93[var147];
            int var149 = (int) Math.sqrt(5100.0D);
            int var150 = var149 * 768 >> 8;
            for (int var151 = 1; var151 < 103; var151++) {
                for (int var152 = 1; var152 < 103; var152++) {
                    int var153 = class6.field101[var147][var152 + 1][var151] - class6.field101[var147][var152 - 1][var151];
                    int var154 = class6.field101[var147][var152][var151 + 1] - class6.field101[var147][var152][var151 - 1];
                    int var155 = (int) Math.sqrt((double) (var154 * var154 + var153 * var153 + 65536));
                    int var156 = (var153 << 8) / var155;
                    int var157 = 65536 / var155;
                    int var158 = (var154 << 8) / var155;
                    int var159 = (var158 * -50 + var156 * -50 + var157 * -10) / var150 + 96;
                    int var160 = (var148[var152][var151] >> 1) + (var148[var152][var151 + 1] >> 3) + (var148[var152][var151 - 1] >> 2) + (var148[var152 - 1][var151] >> 2) + (var148[var152 + 1][var151] >> 3);
                    Statics.field89[var152][var151] = var159 - var160;
                }
            }
            for (int var161 = 0; var161 < 104; var161++) {
                Statics.field1076[var161] = 0;
                Statics.field1392[var161] = 0;
                Statics.field1975[var161] = 0;
                Statics.field251[var161] = 0;
                Statics.field90[var161] = 0;
            }
            for (int var162 = -5; var162 < 109; var162++) {
                for (int var163 = 0; var163 < 104; var163++) {
                    int var164 = var162 + 5;
                    int var10002;
                    if (var164 >= 0 && var164 < 104) {
                        int var165 = Statics.field2673[var147][var164][var163] & 0xFF;
                        if (var165 > 0) {
                            class42 var166 = class42.method666(var165 - 1);
                            Statics.field1076[var163] += var166.field969;
                            Statics.field1392[var163] += var166.field975;
                            Statics.field1975[var163] += var166.field971;
                            Statics.field251[var163] += var166.field974;
                            var10002 = Statics.field90[var163]++;
                        }
                    }
                    int var167 = var162 - 5;
                    if (var167 >= 0 && var167 < 104) {
                        int var168 = Statics.field2673[var147][var167][var163] & 0xFF;
                        if (var168 > 0) {
                            class42 var169 = class42.method666(var168 - 1);
                            Statics.field1076[var163] -= var169.field969;
                            Statics.field1392[var163] -= var169.field975;
                            Statics.field1975[var163] -= var169.field971;
                            Statics.field251[var163] -= var169.field974;
                            var10002 = Statics.field90[var163]--;
                        }
                    }
                }
                if (var162 >= 1 && var162 < 103) {
                    int var170 = 0;
                    int var171 = 0;
                    int var172 = 0;
                    int var173 = 0;
                    int var174 = 0;
                    for (int var175 = -5; var175 < 109; var175++) {
                        int var176 = var175 + 5;
                        if (var176 >= 0 && var176 < 104) {
                            var170 += Statics.field1076[var176];
                            var171 += Statics.field1392[var176];
                            var172 += Statics.field1975[var176];
                            var173 += Statics.field251[var176];
                            var174 += Statics.field90[var176];
                        }
                        int var177 = var175 - 5;
                        if (var177 >= 0 && var177 < 104) {
                            var170 -= Statics.field1076[var177];
                            var171 -= Statics.field1392[var177];
                            var172 -= Statics.field1975[var177];
                            var173 -= Statics.field251[var177];
                            var174 -= Statics.field90[var177];
                        }
                        if (var175 >= 1 && var175 < 103 && (!field288 || (class6.field84[0][var162][var175] & 0x2) != 0 || (class6.field84[var147][var162][var175] & 0x10) == 0)) {
                            if (var147 < class6.field85) {
                                class6.field85 = var147;
                            }
                            int var178 = Statics.field2673[var147][var162][var175] & 0xFF;
                            int var179 = Statics.field88[var147][var162][var175] & 0xFF;
                            if (var178 > 0 || var179 > 0) {
                                int var180 = class6.field101[var147][var162][var175];
                                int var181 = class6.field101[var147][var162 + 1][var175];
                                int var182 = class6.field101[var147][var162 + 1][var175 + 1];
                                int var183 = class6.field101[var147][var162][var175 + 1];
                                int var184 = Statics.field89[var162][var175];
                                int var185 = Statics.field89[var162 + 1][var175];
                                int var186 = Statics.field89[var162 + 1][var175 + 1];
                                int var187 = Statics.field89[var162][var175 + 1];
                                int var188 = -1;
                                int var189 = -1;
                                if (var178 > 0) {
                                    int var190 = var170 * 256 / var173;
                                    int var191 = var171 / var174;
                                    int var192 = var172 / var174;
                                    var188 = class6.method552(var190, var191, var192);
                                    int var193 = class6.field97 + var190 & 0xFF;
                                    int var194 = class6.field98 + var192;
                                    if (var194 < 0) {
                                        var194 = 0;
                                    } else if (var194 > 255) {
                                        var194 = 255;
                                    }
                                    var189 = class6.method552(var193, var191, var194);
                                }
                                if (var147 > 0) {
                                    boolean var195 = true;
                                    if (var178 == 0 && Statics.field87[var147][var162][var175] != 0) {
                                        var195 = false;
                                    }
                                    if (var179 > 0) {
                                        int var196 = var179 - 1;
                                        class47 var197 = (class47) class47.field1053.method3453((long) var196);
                                        class47 var198;
                                        if (var197 == null) {
                                            byte[] var199 = Statics.field1054.method3002(4, var196);
                                            class47 var200 = new class47();
                                            if (var199 != null) {
                                                var200.method900(new class120(var199), var196);
                                            }
                                            var200.method899();
                                            class47.field1053.method3461(var200, (long) var196);
                                            var198 = var200;
                                        } else {
                                            var198 = var197;
                                        }
                                        if (!var198.field1056) {
                                            var195 = false;
                                        }
                                    }
                                    if (var195 && var180 == var181 && var180 == var182 && var180 == var183) {
                                        Statics.field1775[var147][var162][var175] |= 0x924;
                                    }
                                }
                                int var201 = 0;
                                if (var189 != -1) {
                                    var201 = class92.field1580[class6.method711(var189, 96)];
                                }
                                if (var179 == 0) {
                                    var141.method1790(var147, var162, var175, 0, 0, -1, var180, var181, var182, var183, class6.method711(var188, var184), class6.method711(var188, var185), class6.method711(var188, var186), class6.method711(var188, var187), 0, 0, 0, 0, var201, 0);
                                } else {
                                    int var202 = Statics.field87[var147][var162][var175] + 1;
                                    byte var203 = Statics.field1082[var147][var162][var175];
                                    int var204 = var179 - 1;
                                    class47 var205 = (class47) class47.field1053.method3453((long) var204);
                                    class47 var206;
                                    if (var205 == null) {
                                        byte[] var207 = Statics.field1054.method3002(4, var204);
                                        class47 var208 = new class47();
                                        if (var207 != null) {
                                            var208.method900(new class120(var207), var204);
                                        }
                                        var208.method899();
                                        class47.field1053.method3461(var208, (long) var204);
                                        var206 = var208;
                                    } else {
                                        var206 = var205;
                                    }
                                    int var210 = var206.field1068;
                                    int var211;
                                    int var212;
                                    if (var210 >= 0) {
                                        var211 = Statics.field1600.method1973(var210);
                                        var212 = -1;
                                    } else if (var206.field1067 == 16711935) {
                                        var212 = -2;
                                        var210 = -1;
                                        var211 = -2;
                                    } else {
                                        var212 = class6.method552(var206.field1058, var206.field1059, var206.field1060);
                                        int var213 = class6.field97 + var206.field1058 & 0xFF;
                                        int var214 = class6.field98 + var206.field1060;
                                        if (var214 < 0) {
                                            var214 = 0;
                                        } else if (var214 > 255) {
                                            var214 = 255;
                                        }
                                        var211 = class6.method552(var213, var206.field1059, var214);
                                    }
                                    int var215 = 0;
                                    if (var211 != -2) {
                                        var215 = class92.field1580[class6.method2248(var211, 96)];
                                    }
                                    if (var206.field1052 != -1) {
                                        int var216 = class6.field97 + var206.field1061 & 0xFF;
                                        int var217 = class6.field98 + var206.field1063;
                                        if (var217 < 0) {
                                            var217 = 0;
                                        } else if (var217 > 255) {
                                            var217 = 255;
                                        }
                                        int var218 = class6.method552(var216, var206.field1066, var217);
                                        var215 = class92.field1580[class6.method2248(var218, 96)];
                                    }
                                    var141.method1790(var147, var162, var175, var202, var203, var210, var180, var181, var182, var183, class6.method711(var188, var184), class6.method711(var188, var185), class6.method711(var188, var186), class6.method711(var188, var187), class6.method2248(var212, var184), class6.method2248(var212, var185), class6.method2248(var212, var186), class6.method2248(var212, var187), var201, var215);
                                }
                            }
                        }
                    }
                }
            }
            for (int var219 = 1; var219 < 103; var219++) {
                for (int var220 = 1; var220 < 103; var220++) {
                    var141.method1735(var147, var220, var219, class6.method1729(var147, var220, var219));
                }
            }
            Statics.field2673[var147] = (byte[][]) null;
            Statics.field88[var147] = (byte[][]) null;
            Statics.field87[var147] = (byte[][]) null;
            Statics.field1082[var147] = (byte[][]) null;
            Statics.field93[var147] = (byte[][]) null;
        }
        var141.method1762(-50, -10, -50);
        for (int var221 = 0; var221 < 104; var221++) {
            for (int var222 = 0; var222 < 104; var222++) {
                if ((class6.field84[1][var221][var222] & 0x2) == 2) {
                    var141.method1733(var221, var222);
                }
            }
        }
        int var223 = 1;
        int var224 = 2;
        int var225 = 4;
        for (int var226 = 0; var226 < 4; var226++) {
            if (var226 > 0) {
                var223 <<= 0x3;
                var224 <<= 0x3;
                var225 <<= 0x3;
            }
            for (int var227 = 0; var227 <= var226; var227++) {
                for (int var228 = 0; var228 <= 104; var228++) {
                    for (int var229 = 0; var229 <= 104; var229++) {
                        if ((Statics.field1775[var227][var229][var228] & var223) != 0) {
                            int var230 = var228;
                            int var231 = var228;
                            int var232 = var227;
                            int var233 = var227;
                            while (var230 > 0 && (Statics.field1775[var227][var229][var230 - 1] & var223) != 0) {
                                var230--;
                            }
                            while (var231 < 104 && (Statics.field1775[var227][var229][var231 + 1] & var223) != 0) {
                                var231++;
                            }
                            label709: while (var232 > 0) {
                                for (int var234 = var230; var234 <= var231; var234++) {
                                    if ((Statics.field1775[var232 - 1][var229][var234] & var223) == 0) {
                                        break label709;
                                    }
                                }
                                var232--;
                            }
                            label698: while (var233 < var226) {
                                for (int var235 = var230; var235 <= var231; var235++) {
                                    if ((Statics.field1775[var233 + 1][var229][var235] & var223) == 0) {
                                        break label698;
                                    }
                                }
                                var233++;
                            }
                            int var236 = (var233 + 1 - var232) * (var231 - var230 + 1);
                            if (var236 >= 8) {
                                short var237 = 240;
                                int var238 = class6.field101[var233][var229][var230] - var237;
                                int var239 = class6.field101[var232][var229][var230];
                                class87.method1734(var226, 1, var229 * 128, var229 * 128, var230 * 128, var231 * 128 + 128, var238, var239);
                                for (int var240 = var232; var240 <= var233; var240++) {
                                    for (int var241 = var230; var241 <= var231; var241++) {
                                        Statics.field1775[var240][var229][var241] &= ~var223;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1775[var227][var229][var228] & var224) != 0) {
                            int var242 = var229;
                            int var243 = var229;
                            int var244 = var227;
                            int var245 = var227;
                            while (var242 > 0 && (Statics.field1775[var227][var242 - 1][var228] & var224) != 0) {
                                var242--;
                            }
                            while (var243 < 104 && (Statics.field1775[var227][var243 + 1][var228] & var224) != 0) {
                                var243++;
                            }
                            label762: while (var244 > 0) {
                                for (int var246 = var242; var246 <= var243; var246++) {
                                    if ((Statics.field1775[var244 - 1][var246][var228] & var224) == 0) {
                                        break label762;
                                    }
                                }
                                var244--;
                            }
                            label751: while (var245 < var226) {
                                for (int var247 = var242; var247 <= var243; var247++) {
                                    if ((Statics.field1775[var245 + 1][var247][var228] & var224) == 0) {
                                        break label751;
                                    }
                                }
                                var245++;
                            }
                            int var248 = (var245 + 1 - var244) * (var243 - var242 + 1);
                            if (var248 >= 8) {
                                short var249 = 240;
                                int var250 = class6.field101[var245][var242][var228] - var249;
                                int var251 = class6.field101[var244][var242][var228];
                                class87.method1734(var226, 2, var242 * 128, var243 * 128 + 128, var228 * 128, var228 * 128, var250, var251);
                                for (int var252 = var244; var252 <= var245; var252++) {
                                    for (int var253 = var242; var253 <= var243; var253++) {
                                        Statics.field1775[var252][var253][var228] &= ~var224;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1775[var227][var229][var228] & var225) != 0) {
                            int var254 = var229;
                            int var255 = var229;
                            int var256 = var228;
                            int var257 = var228;
                            while (var256 > 0 && (Statics.field1775[var227][var229][var256 - 1] & var225) != 0) {
                                var256--;
                            }
                            while (var257 < 104 && (Statics.field1775[var227][var229][var257 + 1] & var225) != 0) {
                                var257++;
                            }
                            label815: while (var254 > 0) {
                                for (int var258 = var256; var258 <= var257; var258++) {
                                    if ((Statics.field1775[var227][var254 - 1][var258] & var225) == 0) {
                                        break label815;
                                    }
                                }
                                var254--;
                            }
                            label804: while (var255 < 104) {
                                for (int var259 = var256; var259 <= var257; var259++) {
                                    if ((Statics.field1775[var227][var255 + 1][var259] & var225) == 0) {
                                        break label804;
                                    }
                                }
                                var255++;
                            }
                            if ((var255 - var254 + 1) * (var257 - var256 + 1) >= 4) {
                                int var260 = class6.field101[var227][var254][var256];
                                class87.method1734(var226, 4, var254 * 128, var255 * 128 + 128, var256 * 128, var257 * 128 + 128, var260, var260);
                                for (int var261 = var254; var261 <= var255; var261++) {
                                    for (int var262 = var256; var262 <= var257; var262++) {
                                        Statics.field1775[var227][var261][var262] &= ~var225;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method563(true);
        int var263 = class6.field85;
        if (var263 > Statics.field755) {
            var263 = Statics.field755;
        }
        if (var263 < Statics.field755 - 1) {
            int var264 = Statics.field755 - 1;
        }
        if (field288) {
            Statics.field3162.method1732(class6.field85);
        } else {
            Statics.field3162.method1732(0);
        }
        for (int var265 = 0; var265 < 104; var265++) {
            for (int var266 = 0; var266 < 104; var266++) {
                method36(var265, var266);
            }
        }
        method2678();
        method81();
        class41.field918.method3454();
        if (Statics.field1023 != null) {
            field326.method2573(119);
            field326.method2296(1057001181);
        }
        if (!field346) {
            int var267 = (Statics.field965 - 6) / 8;
            int var268 = (Statics.field965 + 6) / 8;
            int var269 = (Statics.field733 - 6) / 8;
            int var270 = (Statics.field733 + 6) / 8;
            for (int var271 = var267 - 1; var271 <= var268 + 1; var271++) {
                for (int var272 = var269 - 1; var272 <= var270 + 1; var272++) {
                    if (var271 < var267 || var271 > var268 || var272 < var269 || var272 > var270) {
                        Statics.field273.method3022("m" + var271 + "_" + var272);
                        Statics.field273.method3022("l" + var271 + "_" + var272);
                    }
                }
            }
        }
        method15(30);
        method2678();
        Statics.field2673 = (byte[][][]) null;
        Statics.field88 = (byte[][][]) null;
        Statics.field87 = (byte[][][]) null;
        Statics.field1082 = (byte[][][]) null;
        Statics.field1775 = (int[][][]) null;
        Statics.field93 = (byte[][][]) null;
        Statics.field89 = (int[][]) null;
        Statics.field1076 = null;
        Statics.field1392 = null;
        Statics.field1975 = null;
        Statics.field251 = null;
        Statics.field90 = null;
        field326.method2573(23);
        class145.method3640();
    }

    @ObfuscatedName("ez.ba(II)V")
    public static final void method2733(int arg0) {
        int[] var1 = Statics.field1768.field1410;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field84[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field3162.method1901(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field84[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field3162.method1901(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1768.method1546();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field84[arg0][var10][var9] & 0x18) == 0) {
                    method796(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field84[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method796(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field311 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field3162.method1760(Statics.field755, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class41.method948(var14).field943;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field345[Statics.field755].field1907;
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
                        field465[field311] = Statics.field1380[var15];
                        field412[field311] = var16;
                        field493[field311] = var17;
                        field311++;
                    }
                }
            }
        }
        Statics.field1647.method1539();
    }

    @ObfuscatedName("ao.bw(IIIIII)V")
    public static final void method796(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field3162.method1851(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field3162.method1855(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1768.field1410;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method948(var12);
            if (var13.field940 == -1) {
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
                class81 var14 = Statics.field782[var13.field940];
                if (var14 != null) {
                    int var15 = (var13.field955 * 4 - var14.field1425) / 2;
                    int var16 = (var13.field924 * 4 - var14.field1426) / 2;
                    var14.method1703(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field924) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field3162.method1775(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field3162.method1855(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method948(var21);
            if (var22.field940 != -1) {
                class81 var23 = Statics.field782[var22.field940];
                if (var23 != null) {
                    int var24 = (var22.field955 * 4 - var23.field1425) / 2;
                    int var25 = (var22.field924 * 4 - var23.field1426) / 2;
                    var23.method1703(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field924) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1768.field1410;
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
        int var29 = Statics.field3162.method1760(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method948(var30);
        if (var31.field940 == -1) {
            return;
        }
        class81 var32 = Statics.field782[var31.field940];
        if (var32 != null) {
            int var33 = (var31.field955 * 4 - var32.field1425) / 2;
            int var34 = (var31.field924 * 4 - var32.field1426) / 2;
            var32.method1703(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field924) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("ec.bl(B)V")
    public static final void method2917() {
        if (field330 == 79) {
            int var0 = field328.method2334();
            int var1 = (var0 >> 4 & 0x7) + Statics.field873;
            int var2 = (var0 & 0x7) + Statics.field2223;
            int var3 = var1 + field328.method2309();
            int var4 = var2 + field328.method2309();
            int var5 = field328.method2478();
            int var6 = field328.method2310();
            int var7 = field328.method2334() * 4;
            int var8 = field328.method2334() * 4;
            int var9 = field328.method2310();
            int var10 = field328.method2310();
            int var11 = field328.method2334();
            int var12 = field328.method2334();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104 && var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104 && var6 != 65535) {
                int var13 = var1 * 128 + 64;
                int var14 = var2 * 128 + 64;
                int var15 = var3 * 128 + 64;
                int var16 = var4 * 128 + 64;
                class7 var17 = new class7(var6, Statics.field755, var13, var14, method138(var13, var14, Statics.field755) - var7, field333 + var9, field333 + var10, var11, var12, var5, var8);
                var17.method70(var15, var16, method138(var15, var16, Statics.field755) - var8, field333 + var9);
                field418.method3508(var17);
            }
        } else if (field330 == 44) {
            int var18 = field328.method2334();
            int var19 = (var18 >> 4 & 0x7) + Statics.field873;
            int var20 = (var18 & 0x7) + Statics.field2223;
            int var21 = field328.method2486();
            if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                class200 var22 = field416[Statics.field755][var19][var20];
                if (var22 != null) {
                    for (class29 var23 = (class29) var22.method3534(); var23 != null; var23 = (class29) var22.method3516()) {
                        if ((var21 & 0x7FFF) == var23.field678) {
                            var23.method3607();
                            break;
                        }
                    }
                    if (var22.method3534() == null) {
                        field416[Statics.field755][var19][var20] = null;
                    }
                    method36(var19, var20);
                }
            }
        } else {
            if (field330 == 203) {
                int var24 = field328.method2334();
                int var25 = (var24 >> 4 & 0x7) + Statics.field873;
                int var26 = (var24 & 0x7) + Statics.field2223;
                int var27 = field328.method2310();
                int var28 = field328.method2334();
                int var29 = var28 >> 4 & 0xF;
                int var30 = var28 & 0x7;
                int var31 = field328.method2334();
                if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                    int var32 = var29 + 1;
                    if (Statics.field2302.field848[0] >= var25 - var32 && Statics.field2302.field848[0] <= var25 + var32 && Statics.field2302.field840[0] >= var26 - var32 && Statics.field2302.field840[0] <= var26 + var32 && field375 != 0 && var30 > 0 && field525 < 50) {
                        field526[field525] = var27;
                        field320[field525] = var30;
                        field528[field525] = var31;
                        field530[field525] = null;
                        field533[field525] = (var25 << 16) + (var26 << 8) + var29;
                        field525++;
                    }
                }
            }
            if (field330 == 100) {
                int var33 = field328.method2334();
                int var34 = (var33 >> 4 & 0x7) + Statics.field873;
                int var35 = (var33 & 0x7) + Statics.field2223;
                int var36 = field328.method2385();
                int var37 = field328.method2310();
                if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
                    class29 var38 = new class29();
                    var38.field678 = var37;
                    var38.field672 = var36;
                    if (field416[Statics.field755][var34][var35] == null) {
                        field416[Statics.field755][var34][var35] = new class200();
                    }
                    field416[Statics.field755][var34][var35].method3508(var38);
                    method36(var34, var35);
                }
            } else if (field330 == 0) {
                int var39 = field328.method2335();
                int var40 = (var39 >> 4 & 0x7) + Statics.field873;
                int var41 = (var39 & 0x7) + Statics.field2223;
                int var42 = field328.method2334();
                int var43 = var42 >> 2;
                int var44 = var42 & 0x3;
                int var45 = field348[var43];
                int var46 = field328.method2385();
                if (var40 >= 0 && var41 >= 0 && var40 < 103 && var41 < 103) {
                    if (var45 == 0) {
                        class88 var47 = Statics.field3162.method1753(Statics.field755, var40, var41);
                        if (var47 != null) {
                            int var48 = var47.field1544 >> 14 & 0x7FFF;
                            if (var43 == 2) {
                                var47.field1536 = new class13(var48, 2, var44 + 4, Statics.field755, var40, var41, var46, false, var47.field1536);
                                var47.field1539 = new class13(var48, 2, var44 + 1 & 0x3, Statics.field755, var40, var41, var46, false, var47.field1539);
                            } else {
                                var47.field1536 = new class13(var48, var43, var44, Statics.field755, var40, var41, var46, false, var47.field1536);
                            }
                        }
                    }
                    if (var45 == 1) {
                        class95 var49 = Statics.field3162.method1754(Statics.field755, var40, var41);
                        if (var49 != null) {
                            int var50 = var49.field1620 >> 14 & 0x7FFF;
                            if (var43 == 4 || var43 == 5) {
                                var49.field1621 = new class13(var50, 4, var44, Statics.field755, var40, var41, var46, false, var49.field1621);
                            } else if (var43 == 6) {
                                var49.field1621 = new class13(var50, 4, var44 + 4, Statics.field755, var40, var41, var46, false, var49.field1621);
                            } else if (var43 == 7) {
                                var49.field1621 = new class13(var50, 4, (var44 + 2 & 0x3) + 4, Statics.field755, var40, var41, var46, false, var49.field1621);
                            } else if (var43 == 8) {
                                var49.field1621 = new class13(var50, 4, var44 + 4, Statics.field755, var40, var41, var46, false, var49.field1621);
                                var49.field1617 = new class13(var50, 4, (var44 + 2 & 0x3) + 4, Statics.field755, var40, var41, var46, false, var49.field1617);
                            }
                        }
                    }
                    if (var45 == 2) {
                        class99 var51 = Statics.field3162.method1755(Statics.field755, var40, var41);
                        if (var43 == 11) {
                            var43 = 10;
                        }
                        if (var51 != null) {
                            var51.field1686 = new class13(var51.field1679 >> 14 & 0x7FFF, var43, var44, Statics.field755, var40, var41, var46, false, var51.field1686);
                        }
                    }
                    if (var45 == 3) {
                        class94 var52 = Statics.field3162.method1756(Statics.field755, var40, var41);
                        if (var52 != null) {
                            var52.field1608 = new class13(var52.field1609 >> 14 & 0x7FFF, 22, var44, Statics.field755, var40, var41, var46, false, var52.field1608);
                        }
                    }
                }
            } else if (field330 == 171) {
                int var53 = field328.method2334();
                int var54 = (var53 >> 4 & 0x7) + Statics.field873;
                int var55 = (var53 & 0x7) + Statics.field2223;
                int var56 = field328.method2310();
                int var57 = field328.method2310();
                int var58 = field328.method2310();
                if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
                    class200 var59 = field416[Statics.field755][var54][var55];
                    if (var59 != null) {
                        for (class29 var60 = (class29) var59.method3534(); var60 != null; var60 = (class29) var59.method3516()) {
                            if ((var56 & 0x7FFF) == var60.field678 && var60.field672 == var57) {
                                var60.field672 = var58;
                                break;
                            }
                        }
                        method36(var54, var55);
                    }
                }
            } else if (field330 == 38) {
                int var61 = field328.method2334();
                int var62 = (var61 >> 4 & 0x7) + Statics.field873;
                int var63 = (var61 & 0x7) + Statics.field2223;
                int var64 = field328.method2463();
                int var65 = var64 >> 2;
                int var66 = var64 & 0x3;
                int var67 = field348[var65];
                int var68 = field328.method2310();
                if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104) {
                    method681(Statics.field755, var62, var63, var67, var68, var65, var66, 0, -1);
                }
            } else {
                if (field330 == 208) {
                    byte var69 = field328.method2309();
                    int var70 = field328.method2486();
                    int var71 = field328.method2310();
                    byte var72 = field328.method2499();
                    int var73 = field328.method2334();
                    int var74 = var73 >> 2;
                    int var75 = var73 & 0x3;
                    int var76 = field348[var74];
                    int var77 = field328.method2486();
                    byte var78 = field328.method2441();
                    int var79 = field328.method2453();
                    int var80 = (var79 >> 4 & 0x7) + Statics.field873;
                    int var81 = (var79 & 0x7) + Statics.field2223;
                    byte var82 = field328.method2309();
                    int var83 = field328.method2486();
                    class3 var84;
                    if (field461 == var83) {
                        var84 = Statics.field2302;
                    } else {
                        var84 = field406[var83];
                    }
                    if (var84 != null) {
                        class41 var85 = class41.method948(var70);
                        int var86;
                        int var87;
                        if (var75 == 1 || var75 == 3) {
                            var86 = var85.field924;
                            var87 = var85.field955;
                        } else {
                            var86 = var85.field955;
                            var87 = var85.field924;
                        }
                        int var88 = (var86 >> 1) + var80;
                        int var89 = (var86 + 1 >> 1) + var80;
                        int var90 = (var87 >> 1) + var81;
                        int var91 = (var87 + 1 >> 1) + var81;
                        int[][] var92 = class6.field101[Statics.field755];
                        int var93 = var92[var88][var90] + var92[var89][var90] + var92[var88][var91] + var92[var89][var91] >> 2;
                        int var94 = (var80 << 7) + (var86 << 6);
                        int var95 = (var81 << 7) + (var87 << 6);
                        class106 var96 = var85.method763(var74, var75, var92, var94, var93, var95);
                        if (var96 != null) {
                            method681(Statics.field755, var80, var81, var76, -1, 0, 0, var71 + 1, var77 + 1);
                            var84.field54 = field333 + var71;
                            var84.field46 = field333 + var77;
                            var84.field36 = var96;
                            var84.field47 = var80 * 128 + var86 * 64;
                            var84.field53 = var81 * 128 + var87 * 64;
                            var84.field48 = var93;
                            if (var69 > var72) {
                                byte var97 = var69;
                                var69 = var72;
                                var72 = var97;
                            }
                            if (var82 > var78) {
                                byte var98 = var82;
                                var82 = var78;
                                var78 = var98;
                            }
                            var84.field61 = var69 + var80;
                            var84.field37 = var72 + var80;
                            var84.field50 = var81 + var82;
                            var84.field51 = var78 + var81;
                        }
                    }
                }
                if (field330 == 58) {
                    int var99 = field328.method2334();
                    int var100 = (var99 >> 4 & 0x7) + Statics.field873;
                    int var101 = (var99 & 0x7) + Statics.field2223;
                    int var102 = field328.method2310();
                    int var103 = field328.method2334();
                    int var104 = field328.method2310();
                    if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
                        int var105 = var100 * 128 + 64;
                        int var106 = var101 * 128 + 64;
                        class30 var107 = new class30(var102, Statics.field755, var105, var106, method138(var105, var106, Statics.field755) - var103, var104, field333);
                        field447.method3508(var107);
                    }
                } else if (field330 == 251) {
                    int var108 = field328.method2334();
                    int var109 = var108 >> 2;
                    int var110 = var108 & 0x3;
                    int var111 = field348[var109];
                    int var112 = field328.method2453();
                    int var113 = (var112 >> 4 & 0x7) + Statics.field873;
                    int var114 = (var112 & 0x7) + Statics.field2223;
                    if (var113 >= 0 && var114 >= 0 && var113 < 104 && var114 < 104) {
                        method681(Statics.field755, var113, var114, var111, -1, var109, var110, 0, -1);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ay.bj(IIIIIIIIII)V")
    public static final void method681(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field543.method3534(); var10 != null; var10 = (class17) field543.method3516()) {
            if (var10.field230 == arg0 && var10.field227 == arg1 && var10.field228 == arg2 && var10.field231 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field230 = arg0;
            var9.field231 = arg3;
            var9.field227 = arg1;
            var9.field228 = arg2;
            method3318(var9);
            field543.method3508(var9);
        }
        var9.field232 = arg4;
        var9.field226 = arg5;
        var9.field233 = arg6;
        var9.field235 = arg7;
        var9.field236 = arg8;
    }

    @ObfuscatedName("s.bx(I)V")
    public static final void method81() {
        for (class17 var0 = (class17) field543.method3534(); var0 != null; var0 = (class17) field543.method3516()) {
            if (var0.field236 == -1) {
                var0.field235 = 0;
                method3318(var0);
            } else {
                var0.method3607();
            }
        }
    }

    @ObfuscatedName("gd.bu(La;I)V")
    public static final void method3318(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field231 == 0) {
            var1 = Statics.field3162.method1851(arg0.field230, arg0.field227, arg0.field228);
        }
        if (arg0.field231 == 1) {
            var1 = Statics.field3162.method1758(arg0.field230, arg0.field227, arg0.field228);
        }
        if (arg0.field231 == 2) {
            var1 = Statics.field3162.method1775(arg0.field230, arg0.field227, arg0.field228);
        }
        if (arg0.field231 == 3) {
            var1 = Statics.field3162.method1760(arg0.field230, arg0.field227, arg0.field228);
        }
        if (var1 != 0) {
            int var5 = Statics.field3162.method1855(arg0.field230, arg0.field227, arg0.field228, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field225 = var2;
        arg0.field229 = var3;
        arg0.field234 = var4;
    }

    @ObfuscatedName("av.by(IIIIIIII)V")
    public static final void method633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field288 && Statics.field755 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field3162.method1851(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field3162.method1758(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field3162.method1775(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field3162.method1760(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field3162.method1855(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field3162.method1748(arg0, arg2, arg3);
                class41 var15 = class41.method948(var12);
                if (var15.field932 != 0) {
                    field345[arg0].method2201(arg2, arg3, var13, var14, var15.field938);
                }
            }
            if (arg1 == 1) {
                Statics.field3162.method1787(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field3162.method1750(arg0, arg2, arg3);
                class41 var16 = class41.method948(var12);
                if (var16.field955 + arg2 > 103 || var16.field955 + arg3 > 103 || var16.field924 + arg2 > 103 || var16.field924 + arg3 > 103) {
                    return;
                }
                if (var16.field932 != 0) {
                    field345[arg0].method2217(arg2, arg3, var16.field955, var16.field924, var14, var16.field938);
                }
            }
            if (arg1 == 3) {
                Statics.field3162.method1875(arg0, arg2, arg3);
                class41 var17 = class41.method948(var12);
                if (var17.field932 == 1) {
                    field345[arg0].method2204(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field84[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class87 var19 = Statics.field3162;
        class109 var20 = field345[arg0];
        class41 var21 = class41.method948(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field924;
            var23 = var21.field955;
        } else {
            var22 = var21.field955;
            var23 = var21.field924;
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
        int[][] var28 = class6.field101[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field925 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field945 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class86 var34;
            if (var21.field928 == -1 && var21.field956 == null) {
                var34 = var21.method763(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field928, true, (class86) null);
            }
            var19.method1757(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field932 == 1) {
                var20.method2199(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class86 var57;
            if (var21.field928 == -1 && var21.field956 == null) {
                var57 = var21.method763(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field928, true, (class86) null);
            }
            if (var57 != null) {
                var19.method1741(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field932 != 0) {
                var20.method2206(arg2, arg3, var22, var23, var21.field938);
            }
        } else if (arg6 >= 12) {
            class86 var35;
            if (var21.field928 == -1 && var21.field956 == null) {
                var35 = var21.method763(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field928, true, (class86) null);
            }
            var19.method1741(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field932 != 0) {
                var20.method2206(arg2, arg3, var22, var23, var21.field938);
            }
        } else if (arg6 == 0) {
            class86 var36;
            if (var21.field928 == -1 && var21.field956 == null) {
                var36 = var21.method763(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field928, true, (class86) null);
            }
            var19.method1899(arg0, arg2, arg3, var29, var36, (class86) null, class6.field91[arg5], 0, var32, var33);
            if (var21.field932 != 0) {
                var20.method2202(arg2, arg3, arg6, arg5, var21.field938);
            }
        } else if (arg6 == 1) {
            class86 var37;
            if (var21.field928 == -1 && var21.field956 == null) {
                var37 = var21.method763(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field928, true, (class86) null);
            }
            var19.method1899(arg0, arg2, arg3, var29, var37, (class86) null, class6.field92[arg5], 0, var32, var33);
            if (var21.field932 != 0) {
                var20.method2202(arg2, arg3, arg6, arg5, var21.field938);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class86 var39;
            class86 var40;
            if (var21.field928 == -1 && var21.field956 == null) {
                var39 = var21.method763(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method763(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field928, true, (class86) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field928, true, (class86) null);
            }
            var19.method1899(arg0, arg2, arg3, var29, var39, var40, class6.field91[arg5], class6.field91[var38], var32, var33);
            if (var21.field932 != 0) {
                var20.method2202(arg2, arg3, arg6, arg5, var21.field938);
            }
        } else if (arg6 == 3) {
            class86 var41;
            if (var21.field928 == -1 && var21.field956 == null) {
                var41 = var21.method763(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field928, true, (class86) null);
            }
            var19.method1899(arg0, arg2, arg3, var29, var41, (class86) null, class6.field92[arg5], 0, var32, var33);
            if (var21.field932 != 0) {
                var20.method2202(arg2, arg3, arg6, arg5, var21.field938);
            }
        } else if (arg6 == 9) {
            class86 var42;
            if (var21.field928 == -1 && var21.field956 == null) {
                var42 = var21.method763(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field928, true, (class86) null);
            }
            var19.method1741(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field932 != 0) {
                var20.method2206(arg2, arg3, var22, var23, var21.field938);
            }
        } else if (arg6 == 4) {
            class86 var43;
            if (var21.field928 == -1 && var21.field956 == null) {
                var43 = var21.method763(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field928, true, (class86) null);
            }
            var19.method1883(arg0, arg2, arg3, var29, var43, (class86) null, class6.field91[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1851(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class41.method948(var45 >> 14 & 0x7FFF).field939;
            }
            class86 var46;
            if (var21.field928 == -1 && var21.field956 == null) {
                var46 = var21.method763(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field928, true, (class86) null);
            }
            var19.method1883(arg0, arg2, arg3, var29, var46, (class86) null, class6.field91[arg5], 0, class6.field86[arg5] * var44, class6.field94[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1851(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class41.method948(var48 >> 14 & 0x7FFF).field939 / 2;
            }
            class86 var49;
            if (var21.field928 == -1 && var21.field956 == null) {
                var49 = var21.method763(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field928, true, (class86) null);
            }
            var19.method1883(arg0, arg2, arg3, var29, var49, (class86) null, 256, arg5, class6.field83[arg5] * var47, class6.field96[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class86 var51;
            if (var21.field928 == -1 && var21.field956 == null) {
                var51 = var21.method763(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field928, true, (class86) null);
            }
            var19.method1883(arg0, arg2, arg3, var29, var51, (class86) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1851(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class41.method948(var53 >> 14 & 0x7FFF).field939 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class86 var55;
            class86 var56;
            if (var21.field928 == -1 && var21.field956 == null) {
                var55 = var21.method763(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method763(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field928, true, (class86) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field928, true, (class86) null);
            }
            var19.method1883(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field83[arg5] * var52, class6.field96[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("h.bt(IIB)V")
    public static final void method36(int arg0, int arg1) {
        class200 var2 = field416[Statics.field755][arg0][arg1];
        if (var2 == null) {
            Statics.field3162.method1822(Statics.field755, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3534(); var6 != null; var6 = (class29) var2.method3516()) {
            class52 var7 = class52.method2583(var6.field678);
            long var8 = (long) var7.field1118;
            if (var7.field1132 == 1) {
                var8 = (long) (var6.field672 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field3162.method1822(Statics.field755, arg0, arg1);
            return;
        }
        var2.method3525(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3534(); var12 != null; var12 = (class29) var2.method3516()) {
            if (var5.field678 != var12.field678) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field678 != var12.field678 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field3162.method1849(Statics.field755, arg0, arg1, method138(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field755), var5, var13, var10, var11);
    }

    @ObfuscatedName("ak.bm(ZB)V")
    public static final void method713(boolean arg0) {
        field517 = 0;
        field324 = 0;
        method166();
        method2101(arg0);
        method629();
        for (int var1 = 0; var1 < field517; var1++) {
            int var2 = field410[var1];
            if (field333 != field321[var2].field824) {
                field321[var2].field773 = null;
                field321[var2] = null;
            }
        }
        if (field329 != field328.field2001) {
            throw new RuntimeException(field328.field2001 + class2.field35 + field329);
        }
        for (int var3 = 0; var3 < field294; var3++) {
            if (field321[field323[var3]] == null) {
                throw new RuntimeException(var3 + class2.field35 + field294);
            }
        }
    }

    @ObfuscatedName("c.bv(I)V")
    public static final void method166() {
        field328.method2566();
        int var0 = field328.method2553(8);
        if (var0 < field294) {
            for (int var1 = var0; var1 < field294; var1++) {
                field410[++field517 - 1] = field323[var1];
            }
        }
        if (var0 > field294) {
            throw new RuntimeException("");
        }
        field294 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field323[var2];
            class35 var4 = field321[var3];
            int var5 = field328.method2553(1);
            if (var5 == 0) {
                field323[++field294 - 1] = var3;
                var4.field824 = field333;
            } else {
                int var6 = field328.method2553(2);
                if (var6 == 0) {
                    field323[++field294 - 1] = var3;
                    var4.field824 = field333;
                    field286[++field324 - 1] = var3;
                } else if (var6 == 1) {
                    field323[++field294 - 1] = var3;
                    var4.field824 = field333;
                    int var7 = field328.method2553(3);
                    var4.method688(var7, (byte) 1);
                    int var8 = field328.method2553(1);
                    if (var8 == 1) {
                        field286[++field324 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field323[++field294 - 1] = var3;
                    var4.field824 = field333;
                    int var9 = field328.method2553(3);
                    var4.method688(var9, (byte) 2);
                    int var10 = field328.method2553(3);
                    var4.method688(var10, (byte) 2);
                    int var11 = field328.method2553(1);
                    if (var11 == 1) {
                        field286[++field324 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field410[++field517 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("dw.bk(ZI)V")
    public static final void method2101(boolean arg0) {
        while (true) {
            if (field328.method2555(field329) >= 27) {
                int var1 = field328.method2553(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field321[var1] == null) {
                        field321[var1] = new class35();
                        var2 = true;
                    }
                    class35 var3 = field321[var1];
                    field323[++field294 - 1] = var1;
                    var3.field824 = field333;
                    int var4;
                    if (arg0) {
                        var4 = field328.method2553(8);
                        if (var4 > 127) {
                            var4 -= 256;
                        }
                    } else {
                        var4 = field328.method2553(5);
                        if (var4 > 15) {
                            var4 -= 32;
                        }
                    }
                    int var5;
                    if (arg0) {
                        var5 = field328.method2553(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = field328.method2553(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6 = field328.method2553(1);
                    if (var6 == 1) {
                        field286[++field324 - 1] = var1;
                    }
                    var3.field773 = class40.method160(field328.method2553(14));
                    int var7 = field439[field328.method2553(3)];
                    if (var2) {
                        var3.field832 = var3.field806 = var7;
                    }
                    int var8 = field328.method2553(1);
                    var3.field808 = var3.field773.field882;
                    var3.field864 = var3.field773.field898;
                    if (var3.field864 == 0) {
                        var3.field806 = 0;
                    }
                    var3.field812 = var3.field773.field899;
                    var3.field813 = var3.field773.field891;
                    var3.field815 = var3.field773.field890;
                    var3.field858 = var3.field773.field904;
                    var3.field809 = var3.field773.field887;
                    var3.field838 = var3.field773.field878;
                    var3.field811 = var3.field773.field889;
                    var3.method685(Statics.field2302.field848[0] + var5, Statics.field2302.field840[0] + var4, var8 == 1);
                    continue;
                }
            }
            field328.method2554();
            return;
        }
    }

    @ObfuscatedName("al.be(I)V")
    public static final void method629() {
        for (int var0 = 0; var0 < field324; var0++) {
            int var1 = field286[var0];
            class35 var2 = field321[var1];
            int var3 = field328.method2334();
            if ((var3 & 0x4) != 0) {
                int var4 = field328.method2335();
                int var5 = field328.method2335();
                var2.method706(var4, var5, field333);
                var2.field859 = field333 + 300;
                var2.field827 = field328.method2344();
                var2.field845 = field328.method2385();
            }
            if ((var3 & 0x10) != 0) {
                var2.field837 = field328.method2385();
                int var6 = field328.method2345();
                var2.field804 = var6 >> 16;
                var2.field844 = (var6 & 0xFFFF) + field333;
                var2.field841 = 0;
                var2.field842 = 0;
                if (var2.field844 > field333) {
                    var2.field841 = -1;
                }
                if (var2.field837 == 65535) {
                    var2.field837 = -1;
                }
            }
            if ((var3 & 0x80) != 0) {
                int var7 = field328.method2335();
                int var8 = field328.method2463();
                var2.method706(var7, var8, field333);
                var2.field859 = field333 + 300;
                var2.field827 = field328.method2344();
                var2.field845 = field328.method2310();
            }
            if ((var3 & 0x20) != 0) {
                var2.field773 = class40.method160(field328.method2344());
                var2.field808 = var2.field773.field882;
                var2.field864 = var2.field773.field898;
                var2.field812 = var2.field773.field899;
                var2.field813 = var2.field773.field891;
                var2.field815 = var2.field773.field890;
                var2.field858 = var2.field773.field904;
                var2.field809 = var2.field773.field887;
                var2.field838 = var2.field773.field878;
                var2.field811 = var2.field773.field889;
            }
            if ((var3 & 0x8) != 0) {
                var2.field817 = field328.method2316();
                var2.field843 = 100;
            }
            if ((var3 & 0x2) != 0) {
                var2.field829 = field328.method2344();
                if (var2.field829 == 65535) {
                    var2.field829 = -1;
                }
            }
            if ((var3 & 0x1) != 0) {
                int var9 = field328.method2385();
                int var10 = field328.method2344();
                int var11 = var2.field810 - (var9 - Statics.field1566 - Statics.field1566) * 64;
                int var12 = var2.field805 - (var10 - Statics.field359 - Statics.field359) * 64;
                if (var11 != 0 || var12 != 0) {
                    var2.field831 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x40) != 0) {
                int var13 = field328.method2486();
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = field328.method2335();
                if (var2.field835 == var13 && var13 != -1) {
                    int var15 = class43.method168(var13).field987;
                    if (var15 == 1) {
                        var2.field820 = 0;
                        var2.field819 = 0;
                        var2.field825 = var14;
                        var2.field839 = 0;
                    }
                    if (var15 == 2) {
                        var2.field839 = 0;
                    }
                } else if (var13 == -1 || var2.field835 == -1 || class43.method168(var13).field984 >= class43.method168(var2.field835).field984) {
                    var2.field835 = var13;
                    var2.field820 = 0;
                    var2.field819 = 0;
                    var2.field825 = var14;
                    var2.field839 = 0;
                    var2.field862 = var2.field857;
                }
            }
        }
    }

    @ObfuscatedName("ar.bs(IIIII)V")
    public static final void method656(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field486; var4++) {
            if (field536[var4] + field491[var4] > arg0 && field491[var4] < arg0 + arg2 && field494[var4] + field437[var4] > arg1 && field437[var4] < arg1 + arg3) {
                field397[var4] = true;
            }
        }
    }

    @ObfuscatedName("cq.bq(IIIII)V")
    public static final void method2006(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field486; var4++) {
            if (field536[var4] + field491[var4] > arg0 && field491[var4] < arg0 + arg2 && field494[var4] + field437[var4] > arg1 && field437[var4] < arg1 + arg3) {
                field489[var4] = true;
            }
        }
    }

    @ObfuscatedName("c.bo(IIB)V")
    public static final void method164(int arg0, int arg1) {
        int var2 = Statics.field80.method3700(class158.field2594);
        for (int var3 = 0; var3 < field295; var3++) {
            int var4 = Statics.field80.method3700(method897(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field295 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field163) {
            var6 = Statics.field163 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field967) {
            var7 = Statics.field967 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field424 = true;
        Statics.field966 = var6;
        Statics.field669 = var7;
        Statics.field2177 = var2;
        Statics.field654 = field295 * 15 + 22;
    }

    @ObfuscatedName("cy.bc(II)Z")
    public static final boolean method1909(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field393[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("ax.bp(Lav;IIS)V")
    public static final void method1014(class31 arg0, int arg1, int arg2) {
        method2547(arg0.field696, arg0.field697, arg0.field698, arg0.field699, arg0.field700, arg0.field700, arg1, arg2);
    }

    @ObfuscatedName("dv.bz(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method2547(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 31) {
            field326.method2573(216);
            field326.method2323(Statics.field2209);
            field326.method2341(arg0);
            field326.method2349(arg1);
            field326.method2342(arg3);
            field326.method2341(Statics.field2039);
            field326.method2294(Statics.field2060);
            field565 = 0;
            Statics.field292 = class174.method3117(arg1);
            field398 = arg0;
        }
        if (arg2 == 9) {
            class35 var8 = field321[arg3];
            if (var8 != null) {
                field392 = arg6;
                field322 = arg7;
                field395 = 2;
                field394 = 0;
                field546 = arg0;
                field518 = arg1;
                field326.method2573(90);
                field326.method2434(class138.field2134[82] ? 1 : 0);
                field326.method2294(arg3);
            }
        }
        if (arg2 == 15) {
            class3 var9 = field406[arg3];
            if (var9 != null) {
                field392 = arg6;
                field322 = arg7;
                field395 = 2;
                field394 = 0;
                field546 = arg0;
                field518 = arg1;
                field326.method2573(183);
                field326.method2293(class138.field2134[82] ? 1 : 0);
                field326.method2341(arg3);
                field326.method2341(field343);
                field326.method2323(Statics.field670);
            }
        }
        if (arg2 == 12) {
            class35 var10 = field321[arg3];
            if (var10 != null) {
                field392 = arg6;
                field322 = arg7;
                field395 = 2;
                field394 = 0;
                field546 = arg0;
                field518 = arg1;
                field326.method2573(138);
                field326.method2293(class138.field2134[82] ? 1 : 0);
                field326.method2341(arg3);
            }
        }
        if (arg2 == 28) {
            field326.method2573(132);
            field326.method2296(arg1);
            class174 var11 = class174.method3117(arg1);
            if (var11.field2889 != null && var11.field2889[0][0] == 5) {
                int var12 = var11.field2889[0][1];
                class177.field2924[var12] = 1 - class177.field2924[var12];
                Statics.method1528(var12);
            }
        }
        if (arg2 == 48) {
            class3 var13 = field406[arg3];
            if (var13 != null) {
                field392 = arg6;
                field322 = arg7;
                field395 = 2;
                field394 = 0;
                field546 = arg0;
                field518 = arg1;
                field326.method2573(99);
                field326.method2328(class138.field2134[82] ? 1 : 0);
                field326.method2294(arg3);
            }
        }
        if (arg2 == 23) {
            Statics.field3162.method1768(Statics.field755, arg0, arg1);
        }
        if (arg2 == 22) {
            field392 = arg6;
            field322 = arg7;
            field395 = 2;
            field394 = 0;
            field546 = arg0;
            field518 = arg1;
            field326.method2573(54);
            field326.method2341(arg3);
            field326.method2293(class138.field2134[82] ? 1 : 0);
            field326.method2294(Statics.field359 + arg1);
            field326.method2294(Statics.field1566 + arg0);
        }
        if (arg2 == 32) {
            field326.method2573(230);
            field326.method2296(arg1);
            field326.method2323(Statics.field670);
            field326.method2341(arg3);
            field326.method2294(arg0);
            field326.method2294(field343);
            field565 = 0;
            Statics.field292 = class174.method3117(arg1);
            field398 = arg0;
        }
        if (arg2 == 44) {
            class3 var14 = field406[arg3];
            if (var14 != null) {
                field392 = arg6;
                field322 = arg7;
                field395 = 2;
                field394 = 0;
                field546 = arg0;
                field518 = arg1;
                field326.method2573(79);
                field326.method2340(arg3);
                field326.method2434(class138.field2134[82] ? 1 : 0);
            }
        }
        if (arg2 == 20) {
            field392 = arg6;
            field322 = arg7;
            field395 = 2;
            field394 = 0;
            field546 = arg0;
            field518 = arg1;
            field326.method2573(213);
            field326.method2342(Statics.field1566 + arg0);
            field326.method2434(class138.field2134[82] ? 1 : 0);
            field326.method2294(Statics.field359 + arg1);
            field326.method2340(arg3);
        }
        if (arg2 == 13) {
            class35 var15 = field321[arg3];
            if (var15 != null) {
                field392 = arg6;
                field322 = arg7;
                field395 = 2;
                field394 = 0;
                field546 = arg0;
                field518 = arg1;
                field326.method2573(33);
                field326.method2434(class138.field2134[82] ? 1 : 0);
                field326.method2340(arg3);
            }
        }
        if (arg2 == 2) {
            field392 = arg6;
            field322 = arg7;
            field395 = 2;
            field394 = 0;
            field546 = arg0;
            field518 = arg1;
            field326.method2573(241);
            field326.method2328(class138.field2134[82] ? 1 : 0);
            field326.method2340(arg3 >> 14 & 0x7FFF);
            field326.method2340(Statics.field1566 + arg0);
            field326.method2341(Statics.field359 + arg1);
            field326.method2349(Statics.field670);
            field326.method2342(field343);
        }
        if (arg2 == 8) {
            class35 var16 = field321[arg3];
            if (var16 != null) {
                field392 = arg6;
                field322 = arg7;
                field395 = 2;
                field394 = 0;
                field546 = arg0;
                field518 = arg1;
                field326.method2573(105);
                field326.method2294(arg3);
                field326.method2294(field343);
                field326.method2349(Statics.field670);
                field326.method2332(class138.field2134[82] ? 1 : 0);
            }
        }
        if (arg2 == 4) {
            field392 = arg6;
            field322 = arg7;
            field395 = 2;
            field394 = 0;
            field546 = arg0;
            field518 = arg1;
            field326.method2573(36);
            field326.method2341(Statics.field1566 + arg0);
            field326.method2293(class138.field2134[82] ? 1 : 0);
            field326.method2342(arg3 >> 14 & 0x7FFF);
            field326.method2340(Statics.field359 + arg1);
        }
        if (arg2 == 24) {
            class174 var17 = class174.method3117(arg1);
            boolean var18 = true;
            if (var17.field2781 > 0) {
                var18 = method2083(var17);
            }
            if (var18) {
                field326.method2573(132);
                field326.method2296(arg1);
            }
        }
        if (arg2 == 14) {
            class3 var19 = field406[arg3];
            if (var19 != null) {
                field392 = arg6;
                field322 = arg7;
                field395 = 2;
                field394 = 0;
                field546 = arg0;
                field518 = arg1;
                field326.method2573(118);
                field326.method2340(Statics.field2039);
                field326.method2350(Statics.field2209);
                field326.method2332(class138.field2134[82] ? 1 : 0);
                field326.method2341(arg3);
                field326.method2340(Statics.field2060);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class174 var20 = class174.method1454(arg1, arg0);
            if (var20 != null) {
                method125(arg3, arg1, arg0, var20.field2897, arg5);
            }
        }
        if (arg2 == 45) {
            class3 var21 = field406[arg3];
            if (var21 != null) {
                field392 = arg6;
                field322 = arg7;
                field395 = 2;
                field394 = 0;
                field546 = arg0;
                field518 = arg1;
                field326.method2573(115);
                field326.method2332(class138.field2134[82] ? 1 : 0);
                field326.method2294(arg3);
            }
        }
        if (arg2 == 58) {
            class174 var22 = class174.method1454(arg1, arg0);
            if (var22 != null) {
                field326.method2573(207);
                field326.method2323(arg1);
                field326.method2341(field343);
                field326.method2340(var22.field2897);
                field326.method2350(Statics.field670);
                field326.method2342(field440);
                field326.method2294(arg0);
            }
        }
        if (arg2 == 11) {
            class35 var23 = field321[arg3];
            if (var23 != null) {
                field392 = arg6;
                field322 = arg7;
                field395 = 2;
                field394 = 0;
                field546 = arg0;
                field518 = arg1;
                field326.method2573(199);
                field326.method2328(class138.field2134[82] ? 1 : 0);
                field326.method2340(arg3);
            }
        }
        if (arg2 == 1001) {
            field392 = arg6;
            field322 = arg7;
            field395 = 2;
            field394 = 0;
            field546 = arg0;
            field518 = arg1;
            field326.method2573(181);
            field326.method2340(Statics.field359 + arg1);
            field326.method2342(Statics.field1566 + arg0);
            field326.method2342(arg3 >> 14 & 0x7FFF);
            field326.method2332(class138.field2134[82] ? 1 : 0);
        }
        if (arg2 == 50) {
            class3 var24 = field406[arg3];
            if (var24 != null) {
                field392 = arg6;
                field322 = arg7;
                field395 = 2;
                field394 = 0;
                field546 = arg0;
                field518 = arg1;
                field326.method2573(38);
                field326.method2342(arg3);
                field326.method2332(class138.field2134[82] ? 1 : 0);
            }
        }
        if (arg2 == 1003) {
            field392 = arg6;
            field322 = arg7;
            field395 = 2;
            field394 = 0;
            class35 var25 = field321[arg3];
            if (var25 != null) {
                class40 var26 = var25.field773;
                if (var26.field908 != null) {
                    var26 = var26.method720();
                }
                if (var26 != null) {
                    field326.method2573(43);
                    field326.method2294(var26.field912);
                }
            }
        }
        if (arg2 == 26) {
            field326.method2573(39);
            for (class4 var27 = (class4) field444.method3488(); var27 != null; var27 = (class4) field444.method3489()) {
                if (var27.field65 == 0 || var27.field65 == 3) {
                    method880(var27, true);
                }
            }
            if (field400 != null) {
                method538(field400);
                field400 = null;
            }
        }
        if (arg2 == 3) {
            field392 = arg6;
            field322 = arg7;
            field395 = 2;
            field394 = 0;
            field546 = arg0;
            field518 = arg1;
            field326.method2573(121);
            field326.method2341(Statics.field359 + arg1);
            field326.method2341(arg3 >> 14 & 0x7FFF);
            field326.method2340(Statics.field1566 + arg0);
            field326.method2332(class138.field2134[82] ? 1 : 0);
        }
        if (arg2 == 25) {
            class174 var28 = class174.method1454(arg1, arg0);
            if (var28 != null) {
                method2190();
                int var31 = method2739(var28);
                int var32 = var31 >> 11 & 0x3F;
                method2228(arg1, arg0, var32, var28.field2897);
                field380 = 0;
                int var33 = method2739(var28);
                int var34 = var33 >> 11 & 0x3F;
                String var35;
                if (var34 == 0) {
                    var35 = null;
                } else if (var28.field2797 == null || var28.field2797.trim().length() == 0) {
                    var35 = null;
                } else {
                    var35 = var28.field2797;
                }
                field433 = var35;
                if (field433 == null) {
                    field433 = "Null";
                }
                if (var28.field2776) {
                    field442 = var28.field2834 + class2.method2916(16777215);
                } else {
                    field442 = class2.method2916(65280) + var28.field2893 + class2.method2916(16777215);
                }
            }
            return;
        }
        if (arg2 == 19) {
            field392 = arg6;
            field322 = arg7;
            field395 = 2;
            field394 = 0;
            field546 = arg0;
            field518 = arg1;
            field326.method2573(32);
            field326.method2340(arg3);
            field326.method2294(Statics.field1566 + arg0);
            field326.method2328(class138.field2134[82] ? 1 : 0);
            field326.method2340(Statics.field359 + arg1);
        }
        if (arg2 == 43) {
            field326.method2573(134);
            field326.method2350(arg1);
            field326.method2342(arg3);
            field326.method2342(arg0);
            field565 = 0;
            Statics.field292 = class174.method3117(arg1);
            field398 = arg0;
        }
        if (arg2 == 47) {
            class3 var36 = field406[arg3];
            if (var36 != null) {
                field392 = arg6;
                field322 = arg7;
                field395 = 2;
                field394 = 0;
                field546 = arg0;
                field518 = arg1;
                field326.method2573(87);
                field326.method2341(arg3);
                field326.method2434(class138.field2134[82] ? 1 : 0);
            }
        }
        if (arg2 == 16) {
            field392 = arg6;
            field322 = arg7;
            field395 = 2;
            field394 = 0;
            field546 = arg0;
            field518 = arg1;
            field326.method2573(214);
            field326.method2294(Statics.field2039);
            field326.method2340(Statics.field1566 + arg0);
            field326.method2296(Statics.field2209);
            field326.method2341(arg3);
            field326.method2340(Statics.field2060);
            field326.method2342(Statics.field359 + arg1);
            field326.method2434(class138.field2134[82] ? 1 : 0);
        }
        if (arg2 == 36) {
            field326.method2573(127);
            field326.method2350(arg1);
            field326.method2342(arg0);
            field326.method2340(arg3);
            field565 = 0;
            Statics.field292 = class174.method3117(arg1);
            field398 = arg0;
        }
        if (arg2 == 33) {
            field326.method2573(8);
            field326.method2341(arg3);
            field326.method2349(arg1);
            field326.method2341(arg0);
            field565 = 0;
            Statics.field292 = class174.method3117(arg1);
            field398 = arg0;
        }
        if (arg2 == 17) {
            field392 = arg6;
            field322 = arg7;
            field395 = 2;
            field394 = 0;
            field546 = arg0;
            field518 = arg1;
            field326.method2573(178);
            field326.method2328(class138.field2134[82] ? 1 : 0);
            field326.method2342(field343);
            field326.method2350(Statics.field670);
            field326.method2340(Statics.field359 + arg1);
            field326.method2340(Statics.field1566 + arg0);
            field326.method2342(arg3);
        }
        if (arg2 == 1002) {
            field392 = arg6;
            field322 = arg7;
            field395 = 2;
            field394 = 0;
            field326.method2573(57);
            field326.method2294(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 1) {
            field392 = arg6;
            field322 = arg7;
            field395 = 2;
            field394 = 0;
            field546 = arg0;
            field518 = arg1;
            field326.method2573(244);
            field326.method2341(arg3 >> 14 & 0x7FFF);
            field326.method2293(class138.field2134[82] ? 1 : 0);
            field326.method2340(Statics.field2060);
            field326.method2296(Statics.field2209);
            field326.method2340(Statics.field2039);
            field326.method2340(Statics.field1566 + arg0);
            field326.method2294(Statics.field359 + arg1);
        }
        if (arg2 == 51) {
            class3 var37 = field406[arg3];
            if (var37 != null) {
                field392 = arg6;
                field322 = arg7;
                field395 = 2;
                field394 = 0;
                field546 = arg0;
                field518 = arg1;
                field326.method2573(108);
                field326.method2340(arg3);
                field326.method2434(class138.field2134[82] ? 1 : 0);
            }
        }
        if (arg2 == 30 && field400 == null) {
            method3195(arg1, arg0);
            field400 = class174.method1454(arg1, arg0);
            method538(field400);
        }
        if (arg2 == 1004) {
            field392 = arg6;
            field322 = arg7;
            field395 = 2;
            field394 = 0;
            field326.method2573(152);
            field326.method2294(arg3);
        }
        if (arg2 == 1005) {
            class174 var38 = class174.method3117(arg1);
            if (var38 == null || var38.field2869[arg0] < 100000) {
                field326.method2573(152);
                field326.method2294(arg3);
            } else {
                class12.method683(27, "", var38.field2869[arg0] + " x " + class52.method2583(arg3).field1121);
            }
            field565 = 0;
            Statics.field292 = class174.method3117(arg1);
            field398 = arg0;
        }
        if (arg2 == 18) {
            field392 = arg6;
            field322 = arg7;
            field395 = 2;
            field394 = 0;
            field546 = arg0;
            field518 = arg1;
            field326.method2573(63);
            field326.method2340(arg3);
            field326.method2340(Statics.field359 + arg1);
            field326.method2332(class138.field2134[82] ? 1 : 0);
            field326.method2340(Statics.field1566 + arg0);
        }
        if (arg2 == 21) {
            field392 = arg6;
            field322 = arg7;
            field395 = 2;
            field394 = 0;
            field546 = arg0;
            field518 = arg1;
            field326.method2573(151);
            field326.method2340(Statics.field359 + arg1);
            field326.method2294(arg3);
            field326.method2340(Statics.field1566 + arg0);
            field326.method2328(class138.field2134[82] ? 1 : 0);
        }
        if (arg2 == 46) {
            class3 var39 = field406[arg3];
            if (var39 != null) {
                field392 = arg6;
                field322 = arg7;
                field395 = 2;
                field394 = 0;
                field546 = arg0;
                field518 = arg1;
                field326.method2573(11);
                field326.method2328(class138.field2134[82] ? 1 : 0);
                field326.method2341(arg3);
            }
        }
        if (arg2 == 35) {
            field326.method2573(96);
            field326.method2341(arg0);
            field326.method2296(arg1);
            field326.method2340(arg3);
            field565 = 0;
            Statics.field292 = class174.method3117(arg1);
            field398 = arg0;
        }
        if (arg2 == 40) {
            field326.method2573(40);
            field326.method2296(arg1);
            field326.method2341(arg0);
            field326.method2341(arg3);
            field565 = 0;
            Statics.field292 = class174.method3117(arg1);
            field398 = arg0;
        }
        if (arg2 == 7) {
            class35 var40 = field321[arg3];
            if (var40 != null) {
                field392 = arg6;
                field322 = arg7;
                field395 = 2;
                field394 = 0;
                field546 = arg0;
                field518 = arg1;
                field326.method2573(64);
                field326.method2340(Statics.field2060);
                field326.method2350(Statics.field2209);
                field326.method2294(Statics.field2039);
                field326.method2340(arg3);
                field326.method2328(class138.field2134[82] ? 1 : 0);
            }
        }
        if (arg2 == 29) {
            field326.method2573(132);
            field326.method2296(arg1);
            class174 var41 = class174.method3117(arg1);
            if (var41.field2889 != null && var41.field2889[0][0] == 5) {
                int var42 = var41.field2889[0][1];
                if (class177.field2924[var42] != var41.field2891[0]) {
                    class177.field2924[var42] = var41.field2891[0];
                    Statics.method1528(var42);
                }
            }
        }
        if (arg2 == 37) {
            field326.method2573(245);
            field326.method2323(arg1);
            field326.method2341(arg0);
            field326.method2342(arg3);
            field565 = 0;
            Statics.field292 = class174.method3117(arg1);
            field398 = arg0;
        }
        if (arg2 == 39) {
            field326.method2573(236);
            field326.method2340(arg3);
            field326.method2296(arg1);
            field326.method2294(arg0);
            field565 = 0;
            Statics.field292 = class174.method3117(arg1);
            field398 = arg0;
        }
        if (arg2 == 42) {
            field326.method2573(172);
            field326.method2341(arg3);
            field326.method2294(arg0);
            field326.method2323(arg1);
            field565 = 0;
            Statics.field292 = class174.method3117(arg1);
            field398 = arg0;
        }
        if (arg2 == 49) {
            class3 var43 = field406[arg3];
            if (var43 != null) {
                field392 = arg6;
                field322 = arg7;
                field395 = 2;
                field394 = 0;
                field546 = arg0;
                field518 = arg1;
                field326.method2573(89);
                field326.method2328(class138.field2134[82] ? 1 : 0);
                field326.method2340(arg3);
            }
        }
        if (arg2 == 41) {
            field326.method2573(252);
            field326.method2323(arg1);
            field326.method2340(arg3);
            field326.method2294(arg0);
            field565 = 0;
            Statics.field292 = class174.method3117(arg1);
            field398 = arg0;
        }
        if (arg2 == 10) {
            class35 var44 = field321[arg3];
            if (var44 != null) {
                field392 = arg6;
                field322 = arg7;
                field395 = 2;
                field394 = 0;
                field546 = arg0;
                field518 = arg1;
                field326.method2573(176);
                field326.method2328(class138.field2134[82] ? 1 : 0);
                field326.method2294(arg3);
            }
        }
        if (arg2 == 38) {
            method2190();
            class174 var45 = class174.method3117(arg1);
            field380 = 1;
            Statics.field2060 = arg0;
            Statics.field2209 = arg1;
            Statics.field2039 = arg3;
            method538(var45);
            field464 = class2.method2916(16748608) + class52.method2583(arg3).field1121 + class2.method2916(16777215);
            if (field464 == null) {
                field464 = "null";
            }
            return;
        }
        if (arg2 == 6) {
            field392 = arg6;
            field322 = arg7;
            field395 = 2;
            field394 = 0;
            field546 = arg0;
            field518 = arg1;
            field326.method2573(162);
            field326.method2294(arg3 >> 14 & 0x7FFF);
            field326.method2342(Statics.field1566 + arg0);
            field326.method2328(class138.field2134[82] ? 1 : 0);
            field326.method2294(Statics.field359 + arg1);
        }
        if (arg2 == 5) {
            field392 = arg6;
            field322 = arg7;
            field395 = 2;
            field394 = 0;
            field546 = arg0;
            field518 = arg1;
            field326.method2573(113);
            field326.method2340(arg3 >> 14 & 0x7FFF);
            field326.method2342(Statics.field1566 + arg0);
            field326.method2294(Statics.field359 + arg1);
            field326.method2328(class138.field2134[82] ? 1 : 0);
        }
        if (arg2 == 34) {
            field326.method2573(195);
            field326.method2340(arg0);
            field326.method2341(arg3);
            field326.method2350(arg1);
            field565 = 0;
            Statics.field292 = class174.method3117(arg1);
            field398 = arg0;
        }
        if (field380 != 0) {
            field380 = 0;
            method538(class174.method3117(Statics.field2209));
        }
        if (field438) {
            method2190();
        }
        if (Statics.field292 != null && field565 == 0) {
            method538(Statics.field292);
        }
    }

    @ObfuscatedName("db.cj(ILjava/lang/String;I)V")
    public static void method2192(int arg0, String arg1) {
        int var2 = class33.field742;
        int[] var3 = class33.field743;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class3 var6 = field406[var3[var5]];
            if (var6 != null && Statics.field2302 != var6 && var6.field40 != null && var6.field40.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field326.method2573(79);
                    field326.method2340(var3[var5]);
                    field326.method2434(0);
                } else if (arg0 == 4) {
                    field326.method2573(87);
                    field326.method2341(var3[var5]);
                    field326.method2434(0);
                } else if (arg0 == 6) {
                    field326.method2573(89);
                    field326.method2328(0);
                    field326.method2340(var3[var5]);
                } else if (arg0 == 7) {
                    field326.method2573(38);
                    field326.method2342(var3[var5]);
                    field326.method2332(0);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class12.method683(4, "", class158.field2483 + arg1);
        }
    }

    @ObfuscatedName("di.cv(IIIIB)V")
    public static void method2228(int arg0, int arg1, int arg2, int arg3) {
        class174 var4 = class174.method1454(arg0, arg1);
        if (var4 != null && var4.field2871 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field6 = var4.field2871;
            class37.method3136(var5);
        }
        field440 = arg3;
        field438 = true;
        Statics.field670 = arg0;
        field343 = arg1;
        Statics.field70 = arg2;
        method538(var4);
    }

    @ObfuscatedName("dt.ct(I)V")
    public static void method2190() {
        if (!field438) {
            return;
        }
        class174 var0 = class174.method1454(Statics.field670, field343);
        if (var0 != null && var0.field2826 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field6 = var0.field2826;
            class37.method3136(var1);
        }
        field438 = false;
        method538(var0);
    }

    @ObfuscatedName("fc.cf(III)V")
    public static void method3195(int arg0, int arg1) {
        field326.method2573(215);
        field326.method2340(arg1);
        field326.method2350(arg0);
    }

    @ObfuscatedName("p.cb(IIIILjava/lang/String;I)V")
    public static void method125(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class174 var5 = class174.method1454(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2848 != null) {
            class1 var6 = new class1();
            var6.field3 = var5;
            var6.field13 = arg0;
            var6.field10 = arg4;
            var6.field6 = var5.field2848;
            class37.method3136(var6);
        }
        boolean var7 = true;
        if (var5.field2781 > 0) {
            var7 = method2083(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method2739(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            field326.method2573(116);
            field326.method2296(arg1);
            field326.method2294(arg2);
            field326.method2294(arg3);
        }
        if (arg0 == 2) {
            field326.method2573(73);
            field326.method2296(arg1);
            field326.method2294(arg2);
            field326.method2294(arg3);
        }
        if (arg0 == 3) {
            field326.method2573(124);
            field326.method2296(arg1);
            field326.method2294(arg2);
            field326.method2294(arg3);
        }
        if (arg0 == 4) {
            field326.method2573(229);
            field326.method2296(arg1);
            field326.method2294(arg2);
            field326.method2294(arg3);
        }
        if (arg0 == 5) {
            field326.method2573(60);
            field326.method2296(arg1);
            field326.method2294(arg2);
            field326.method2294(arg3);
        }
        if (arg0 == 6) {
            field326.method2573(226);
            field326.method2296(arg1);
            field326.method2294(arg2);
            field326.method2294(arg3);
        }
        if (arg0 == 7) {
            field326.method2573(109);
            field326.method2296(arg1);
            field326.method2294(arg2);
            field326.method2294(arg3);
        }
        if (arg0 == 8) {
            field326.method2573(250);
            field326.method2296(arg1);
            field326.method2294(arg2);
            field326.method2294(arg3);
        }
        if (arg0 == 9) {
            field326.method2573(103);
            field326.method2296(arg1);
            field326.method2294(arg2);
            field326.method2294(arg3);
        }
        if (arg0 == 10) {
            field326.method2573(240);
            field326.method2296(arg1);
            field326.method2294(arg2);
            field326.method2294(arg3);
        }
    }

    @ObfuscatedName("bb.ci(B)V")
    public static final void method1171() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field295 - 1; var1++) {
                if (field393[var1] < 1000 && field393[var1 + 1] > 1000) {
                    String var2 = field338[var1];
                    field338[var1] = field338[var1 + 1];
                    field338[var1 + 1] = var2;
                    String var3 = field430[var1];
                    field430[var1] = field430[var1 + 1];
                    field430[var1 + 1] = var3;
                    int var4 = field393[var1];
                    field393[var1] = field393[var1 + 1];
                    field393[var1 + 1] = var4;
                    int var5 = field426[var1];
                    field426[var1] = field426[var1 + 1];
                    field426[var1 + 1] = var5;
                    int var6 = field427[var1];
                    field427[var1] = field427[var1 + 1];
                    field427[var1 + 1] = var6;
                    int var7 = field503[var1];
                    field503[var1] = field503[var1 + 1];
                    field503[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("g.ch(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method34(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field424 || field295 >= 500) {
            return;
        }
        field430[field295] = arg0;
        field338[field295] = arg1;
        field393[field295] = arg2;
        field503[field295] = arg3;
        field426[field295] = arg4;
        field427[field295] = arg5;
        field295++;
    }

    @ObfuscatedName("au.cg(IB)Ljava/lang/String;")
    public static String method897(int arg0) {
        return field338[arg0].length() > 0 ? field430[arg0] + class158.field2494 + field338[arg0] : field430[arg0];
    }

    @ObfuscatedName("ft.co(IIIIB)V")
    public static final void method3134(int arg0, int arg1, int arg2, int arg3) {
        if (field380 == 0 && !field438) {
            method34(class158.field2489, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class106.field1864; var6++) {
            int var7 = class106.field1865[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field3162.method1855(Statics.field755, var8, var9, var7) >= 0) {
                    class41 var12 = class41.method948(var11);
                    if (var12.field956 != null) {
                        var12 = var12.method766();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field380 == 1) {
                        method34(class158.field2484, field464 + " " + class2.field24 + " " + class2.method2916(65535) + var12.field964, 1, var7, var8, var9);
                    } else if (!field438) {
                        String[] var13 = var12.field942;
                        if (field454) {
                            var13 = method2598(var13);
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
                                    method34(var13[var14], class2.method2916(65535) + var12.field964, var15, var7, var8, var9);
                                }
                            }
                        }
                        method34(class158.field2485, class2.method2916(65535) + var12.field964, 1002, var12.field922 << 14, var8, var9);
                    } else if ((Statics.field70 & 0x4) == 4) {
                        method34(field433, field442 + " " + class2.field24 + " " + class2.method2916(65535) + var12.field964, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class35 var16 = field321[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field773.field882 == 1 && (var16.field810 & 0x7F) == 64 && (var16.field805 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field294; var17++) {
                            class35 var18 = field321[field323[var17]];
                            if (var18 != null && var16 != var18 && var18.field773.field882 == 1 && var16.field810 == var18.field810 && var16.field805 == var18.field805) {
                                method710(var18.field773, field323[var17], var8, var9);
                            }
                        }
                        int var19 = class33.field742;
                        int[] var20 = class33.field743;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class3 var22 = field406[var20[var21]];
                            if (var22 != null && var16.field810 == var22.field810 && var16.field805 == var22.field805) {
                                method2509(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method710(var16.field773, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var23 = field406[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field810 & 0x7F) == 64 && (var23.field805 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field294; var24++) {
                            class35 var25 = field321[field323[var24]];
                            if (var25 != null && var25.field773.field882 == 1 && var23.field810 == var25.field810 && var23.field805 == var25.field805) {
                                method710(var25.field773, field323[var24], var8, var9);
                            }
                        }
                        int var26 = class33.field742;
                        int[] var27 = class33.field743;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class3 var29 = field406[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field810 == var29.field810 && var23.field805 == var29.field805) {
                                method2509(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field485 == var11) {
                        var4 = var7;
                    } else {
                        method2509(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class200 var30 = field416[Statics.field755][var8][var9];
                    if (var30 != null) {
                        for (class29 var31 = (class29) var30.method3514(); var31 != null; var31 = (class29) var30.method3517()) {
                            class52 var32 = class52.method2583(var31.field678);
                            if (field380 == 1) {
                                method34(class158.field2484, field464 + " " + class2.field24 + " " + class2.method2916(16748608) + var32.field1121, 16, var31.field678, var8, var9);
                            } else if (!field438) {
                                String[] var33 = var32.field1156;
                                if (field454) {
                                    var33 = method2598(var33);
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
                                        method34(var33[var34], class2.method2916(16748608) + var32.field1121, var35, var31.field678, var8, var9);
                                    } else if (var34 == 2) {
                                        method34(class158.field2448, class2.method2916(16748608) + var32.field1121, 20, var31.field678, var8, var9);
                                    }
                                }
                                method34(class158.field2485, class2.method2916(16748608) + var32.field1121, 1004, var31.field678, var8, var9);
                            } else if ((Statics.field70 & 0x1) == 1) {
                                method34(field433, field442 + " " + class2.field24 + " " + class2.method2916(16748608) + var32.field1121, 17, var31.field678, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class3 var38 = field406[field485];
            method2509(var38, field485, var36, var37);
        }
    }

    @ObfuscatedName("ak.cc(Lac;IIII)V")
    public static final void method710(class40 arg0, int arg1, int arg2, int arg3) {
        if (field295 >= 400) {
            return;
        }
        if (arg0.field908 != null) {
            arg0 = arg0.method720();
        }
        if (arg0 == null || !arg0.field911 || arg0.field913 && field371 != arg1) {
            return;
        }
        String var4 = arg0.field886;
        if (arg0.field900 != 0) {
            int var6 = arg0.field900;
            int var7 = Statics.field2302.field42;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method2916(16711680);
            } else if (var8 < -6) {
                var9 = class2.method2916(16723968);
            } else if (var8 < -3) {
                var9 = class2.method2916(16740352);
            } else if (var8 < 0) {
                var9 = class2.method2916(16756736);
            } else if (var8 > 9) {
                var9 = class2.method2916(65280);
            } else if (var8 > 6) {
                var9 = class2.method2916(4259584);
            } else if (var8 > 3) {
                var9 = class2.method2916(8453888);
            } else if (var8 > 0) {
                var9 = class2.method2916(12648192);
            } else {
                var9 = class2.method2916(16776960);
            }
            var4 = var4 + var9 + " " + class2.field20 + class158.field2490 + arg0.field900 + class2.field23;
        }
        if (field380 == 1) {
            method34(class158.field2484, field464 + " " + class2.field24 + " " + class2.method2916(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field438) {
            String[] var10 = arg0.field893;
            if (field454) {
                var10 = method2598(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class158.field2486)) {
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
                        method34(var10[var11], class2.method2916(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class158.field2486)) {
                        short var14 = 0;
                        if (field459 != class21.field571) {
                            if (field459 == class21.field572 || field459 == class21.field570 && arg0.field900 > Statics.field2302.field42) {
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
                            method34(var10[var13], class2.method2916(16776960) + var4, var15, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method34(class158.field2485, class2.method2916(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field70 & 0x2) == 2) {
            method34(field433, field442 + " " + class2.field24 + " " + class2.method2916(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("dr.cm(Lg;IIII)V")
    public static final void method2509(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2302 == arg0 || field295 >= 400) {
            return;
        }
        String var9;
        if (arg0.field55 == 0) {
            String var4 = arg0.field41[0] + arg0.field40 + arg0.field41[1];
            int var5 = arg0.field42;
            int var6 = Statics.field2302.field42;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method2916(16711680);
            } else if (var7 < -6) {
                var8 = class2.method2916(16723968);
            } else if (var7 < -3) {
                var8 = class2.method2916(16740352);
            } else if (var7 < 0) {
                var8 = class2.method2916(16756736);
            } else if (var7 > 9) {
                var8 = class2.method2916(65280);
            } else if (var7 > 6) {
                var8 = class2.method2916(4259584);
            } else if (var7 > 3) {
                var8 = class2.method2916(8453888);
            } else if (var7 > 0) {
                var8 = class2.method2916(12648192);
            } else {
                var8 = class2.method2916(16776960);
            }
            var9 = var4 + var8 + " " + class2.field20 + class158.field2490 + arg0.field42 + class2.field23 + arg0.field41[2];
        } else {
            var9 = arg0.field41[0] + arg0.field40 + arg0.field41[1] + " " + class2.field20 + class158.field2491 + arg0.field55 + class2.field23 + arg0.field41[2];
        }
        if (field380 == 1) {
            method34(class158.field2484, field464 + " " + class2.field24 + " " + class2.method2916(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field438) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field462[var10] != null) {
                    short var11 = 0;
                    if (field462[var10].equalsIgnoreCase(class158.field2486)) {
                        if (field310 == class21.field571) {
                            continue;
                        }
                        if (field310 == class21.field572 || field310 == class21.field570 && arg0.field42 > Statics.field2302.field42) {
                            var11 = 2000;
                        }
                        if (Statics.field2302.field56 != 0 && arg0.field56 != 0) {
                            if (Statics.field2302.field56 == arg0.field56) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field413[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field411[var10] + var11;
                    method34(field462[var10], class2.method2916(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field70 & 0x8) == 8) {
            method34(field433, field442 + " " + class2.field24 + " " + class2.method2916(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field295; var14++) {
            if (field393[var14] == 23) {
                field338[var14] = class2.method2916(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("r.cy([Lfr;IIIIIIIII)V")
    public static final void method66(class174[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1634(arg2, arg3, arg4, arg5);
        class92.method1945();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class174 var10 = arg0[var9];
            if (var10 != null && (var10.field2796 == arg1 || arg1 == -1412584499 && field456 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field491[field486] = var10.field2877 + arg6;
                    field437[field486] = var10.field2802 + arg7;
                    field536[field486] = var10.field2792;
                    field494[field486] = var10.field2793;
                    var11 = ++field486 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2814 = var11;
                var10.field2909 = field333;
                if (!var10.field2776 || !method137(var10)) {
                    if (var10.field2781 > 0) {
                        int var12 = var10.field2781;
                        if (var12 == 324) {
                            if (field557 == -1) {
                                field557 = var10.field2812;
                                field558 = var10.field2908;
                            }
                            if (field556.field2943) {
                                var10.field2812 = field557;
                            } else {
                                var10.field2812 = field558;
                            }
                        } else if (var12 == 325) {
                            if (field557 == -1) {
                                field557 = var10.field2812;
                                field558 = var10.field2908;
                            }
                            if (field556.field2943) {
                                var10.field2812 = field558;
                            } else {
                                var10.field2812 = field557;
                            }
                        } else if (var12 == 327) {
                            var10.field2790 = 150;
                            var10.field2799 = (int) (Math.sin((double) field333 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2872 = 5;
                            var10.field2830 = 0;
                        } else if (var12 == 328) {
                            var10.field2790 = 150;
                            var10.field2799 = (int) (Math.sin((double) field333 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2872 = 5;
                            var10.field2830 = 1;
                        }
                    }
                    int var13 = var10.field2877 + arg6;
                    int var14 = var10.field2802 + arg7;
                    int var15 = var10.field2808;
                    if (field456 == var10) {
                        if (arg1 != -1412584499 && !var10.field2855) {
                            Statics.field19 = arg0;
                            Statics.field1103 = arg6;
                            Statics.field625 = arg7;
                            continue;
                        }
                        if (field514 && field417) {
                            int var16 = class141.field2193;
                            int var17 = class141.field2190;
                            int var18 = var16 - field492;
                            int var19 = var17 - field349;
                            if (var18 < field280) {
                                var18 = field280;
                            }
                            if (var10.field2792 + var18 > field280 + field457.field2792) {
                                var18 = field280 + field457.field2792 - var10.field2792;
                            }
                            if (var19 < field409) {
                                var19 = field409;
                            }
                            if (var10.field2793 + var19 > field409 + field457.field2793) {
                                var19 = field409 + field457.field2793 - var10.field2793;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2855) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2779 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2779 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2792 + var13;
                        int var27 = var10.field2793 + var14;
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
                        int var30 = var10.field2792 + var13;
                        int var31 = var10.field2793 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2776 || var20 < var22 && var21 < var23) {
                        if (var10.field2781 != 0) {
                            if (var10.field2781 == 1336) {
                                if (field377) {
                                    var14 += 15;
                                    Statics.field1441.method3703("Fps:" + field2225, var10.field2792 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field288) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field288) {
                                        var34 = 16711680;
                                    }
                                    Statics.field1441.method3703("Mem:" + var33 + "k", var10.field2792 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2781 == 1337) {
                                field432 = var13;
                                field376 = var14;
                                method3184(var13, var14, var10.field2792, var10.field2793);
                                field397[var10.field2814] = true;
                                class80.method1634(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2781 == 1338) {
                                method553(var10, var13, var14, var11);
                                class80.method1634(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2781 == 1339) {
                                method2947(var10, var13, var14, var11);
                                class80.method1634(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2779 == 0) {
                            if (!var10.field2776 && method137(var10) && Statics.field2083 != var10) {
                                continue;
                            }
                            if (!var10.field2776) {
                                if (var10.field2862 > var10.field2824 - var10.field2793) {
                                    var10.field2862 = var10.field2824 - var10.field2793;
                                }
                                if (var10.field2862 < 0) {
                                    var10.field2862 = 0;
                                }
                            }
                            method66(arg0, var10.field2777, var20, var21, var22, var23, var13 - var10.field2836, var14 - var10.field2862, var11);
                            if (var10.field2771 != null) {
                                method66(var10.field2771, var10.field2777, var20, var21, var22, var23, var13 - var10.field2836, var14 - var10.field2862, var11);
                            }
                            class4 var35 = (class4) field444.method3485((long) var10.field2777);
                            if (var35 != null) {
                                int var36 = var35.field66;
                                if (class174.method3153(var36)) {
                                    Statics.field19 = null;
                                    method66(Statics.field3169[var36], -1, var20, var21, var22, var23, var13, var14, var11);
                                    if (Statics.field19 != null) {
                                        method66(Statics.field19, -1412584499, var20, var21, var22, var23, Statics.field1103, Statics.field625, var11);
                                        Statics.field19 = null;
                                    }
                                } else if (var11 == -1) {
                                    for (int var37 = 0; var37 < 100; var37++) {
                                        field397[var37] = true;
                                    }
                                } else {
                                    field397[var11] = true;
                                }
                            }
                            class80.method1634(arg2, arg3, arg4, arg5);
                            class92.method1945();
                        }
                        if (field497 || field547[var11] || field495 > 1) {
                            if (var10.field2779 == 0 && !var10.field2776 && var10.field2824 > var10.field2793) {
                                int var38 = var10.field2792 + var13;
                                int var39 = var10.field2862;
                                int var40 = var10.field2793;
                                int var41 = var10.field2824;
                                Statics.field2244[0].method1703(var38, var14);
                                Statics.field2244[1].method1703(var38, var14 + var40 - 16);
                                class80.method1666(var38, var14 + 16, 16, var40 - 32, field362);
                                int var42 = (var40 - 32) * var40 / var41;
                                if (var42 < 8) {
                                    var42 = 8;
                                }
                                int var43 = (var40 - 32 - var42) * var39 / (var41 - var40);
                                class80.method1666(var38, var14 + 16 + var43, 16, var42, field363);
                                class80.method1688(var38, var14 + 16 + var43, var42, field365);
                                class80.method1688(var38 + 1, var14 + 16 + var43, var42, field365);
                                class80.method1640(var38, var14 + 16 + var43, 16, field365);
                                class80.method1640(var38, var14 + 17 + var43, 16, field365);
                                class80.method1688(var38 + 15, var14 + 16 + var43, var42, field364);
                                class80.method1688(var38 + 14, var14 + 17 + var43, var42 - 1, field364);
                                class80.method1640(var38, var14 + 15 + var43 + var42, 16, field364);
                                class80.method1640(var38 + 1, var14 + 14 + var43 + var42, 15, field364);
                            }
                            if (var10.field2779 != 1) {
                                if (var10.field2779 == 2) {
                                    int var44 = 0;
                                    for (int var45 = 0; var45 < var10.field2789; var45++) {
                                        for (int var46 = 0; var46 < var10.field2788; var46++) {
                                            int var47 = (var10.field2849 + 32) * var46 + var13;
                                            int var48 = (var10.field2813 + 32) * var45 + var14;
                                            if (var44 < 20) {
                                                var47 += var10.field2845[var44];
                                                var48 += var10.field2846[var44];
                                            }
                                            if (var10.field2850[var44] > 0) {
                                                boolean var49 = false;
                                                boolean var50 = false;
                                                int var51 = var10.field2850[var44] - 1;
                                                if (var47 + 32 > arg2 && var47 < arg4 && var48 + 32 > arg3 && var48 < arg5 || Statics.field127 == var10 && field399 == var44) {
                                                    class79 var52;
                                                    if (field380 == 1 && Statics.field2060 == var44 && Statics.field2209 == var10.field2777) {
                                                        var52 = class52.method533(var51, var10.field2869[var44], 2, 0, 2, false);
                                                    } else {
                                                        var52 = class52.method533(var51, var10.field2869[var44], 1, 3153952, 2, false);
                                                    }
                                                    if (var52 == null) {
                                                        method538(var10);
                                                    } else if (Statics.field127 == var10 && field399 == var44) {
                                                        int var53 = class141.field2193 - field425;
                                                        int var54 = class141.field2190 - field316;
                                                        if (var53 < 5 && var53 > -5) {
                                                            var53 = 0;
                                                        }
                                                        if (var54 < 5 && var54 > -5) {
                                                            var54 = 0;
                                                        }
                                                        if (field441 < 5) {
                                                            var53 = 0;
                                                            var54 = 0;
                                                        }
                                                        var52.method1581(var47 + var53, var48 + var54, 128);
                                                        if (arg1 != -1) {
                                                            class174 var55 = arg0[arg1 & 0xFFFF];
                                                            if (var48 + var54 < class80.field1417 && var55.field2862 > 0) {
                                                                int var56 = field331 * (class80.field1417 - var48 - var54) / 3;
                                                                if (var56 > field331 * 10) {
                                                                    var56 = field331 * 10;
                                                                }
                                                                if (var56 > var55.field2862) {
                                                                    var56 = var55.field2862;
                                                                }
                                                                var55.field2862 -= var56;
                                                                field316 += var56;
                                                                method538(var55);
                                                            }
                                                            if (var48 + var54 + 32 > class80.field1420 && var55.field2862 < var55.field2824 - var55.field2793) {
                                                                int var57 = field331 * (var48 + var54 + 32 - class80.field1420) / 3;
                                                                if (var57 > field331 * 10) {
                                                                    var57 = field331 * 10;
                                                                }
                                                                if (var57 > var55.field2824 - var55.field2793 - var55.field2862) {
                                                                    var57 = var55.field2824 - var55.field2793 - var55.field2862;
                                                                }
                                                                var55.field2862 += var57;
                                                                field316 -= var57;
                                                                method538(var55);
                                                            }
                                                        }
                                                    } else if (Statics.field292 == var10 && field398 == var44) {
                                                        var52.method1581(var47, var48, 128);
                                                    } else {
                                                        var52.method1548(var47, var48);
                                                    }
                                                }
                                            } else if (var10.field2847 != null && var44 < 20) {
                                                class79 var58 = var10.method3146(var44);
                                                if (var58 != null) {
                                                    var58.method1548(var47, var48);
                                                } else if (class174.field2775) {
                                                    method538(var10);
                                                }
                                            }
                                            var44++;
                                        }
                                    }
                                } else if (var10.field2779 == 3) {
                                    int var59;
                                    if (method1535(var10)) {
                                        var59 = var10.field2803;
                                        if (Statics.field2083 == var10 && var10.field2805 != 0) {
                                            var59 = var10.field2805;
                                        }
                                    } else {
                                        var59 = var10.field2798;
                                        if (Statics.field2083 == var10 && var10.field2804 != 0) {
                                            var59 = var10.field2804;
                                        }
                                    }
                                    if (var10.field2896) {
                                        switch(var10.field2807.field1432) {
                                            case 1:
                                                class80.method1641(var13, var14, var10.field2792, var10.field2793, var10.field2798, var10.field2803, 256 - (var10.field2808 & 0xFF), 256 - (var10.field2786 & 0xFF));
                                                break;
                                            case 2:
                                                class80.method1669(var13, var14, var10.field2792, var10.field2793, var10.field2798, var10.field2803, 256 - (var10.field2808 & 0xFF), 256 - (var10.field2786 & 0xFF));
                                                break;
                                            case 3:
                                                class80.method1659(var13, var14, var10.field2792, var10.field2793, var10.field2798, var10.field2803, 256 - (var10.field2808 & 0xFF), 256 - (var10.field2786 & 0xFF));
                                                break;
                                            case 4:
                                                class80.method1644(var13, var14, var10.field2792, var10.field2793, var10.field2798, var10.field2803, 256 - (var10.field2808 & 0xFF), 256 - (var10.field2786 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class80.method1666(var13, var14, var10.field2792, var10.field2793, var59);
                                                } else {
                                                    class80.method1639(var13, var14, var10.field2792, var10.field2793, var59, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class80.method1653(var13, var14, var10.field2792, var10.field2793, var59);
                                    } else {
                                        class80.method1647(var13, var14, var10.field2792, var10.field2793, var59, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2779 == 4) {
                                    class225 var60 = var10.method3145();
                                    if (var60 != null) {
                                        String var61 = var10.field2833;
                                        int var62;
                                        if (method1535(var10)) {
                                            var62 = var10.field2803;
                                            if (Statics.field2083 == var10 && var10.field2805 != 0) {
                                                var62 = var10.field2805;
                                            }
                                            if (var10.field2838.length() > 0) {
                                                var61 = var10.field2838;
                                            }
                                        } else {
                                            var62 = var10.field2798;
                                            if (Statics.field2083 == var10 && var10.field2804 != 0) {
                                                var62 = var10.field2804;
                                            }
                                        }
                                        if (var10.field2776 && var10.field2897 != -1) {
                                            class52 var63 = class52.method2583(var10.field2897);
                                            var61 = var63.field1121;
                                            if (var61 == null) {
                                                var61 = "null";
                                            }
                                            if ((var63.field1132 == 1 || var10.field2898 != 1) && var10.field2898 != -1) {
                                                var61 = class2.method2916(16748608) + var61 + class2.field26 + " " + 'x' + method84(var10.field2898);
                                            }
                                        }
                                        if (field400 == var10) {
                                            class158 var10000 = (class158) null;
                                            var61 = class158.field2492;
                                            var62 = var10.field2798;
                                        }
                                        if (!var10.field2776) {
                                            var61 = method1455(var61, var10);
                                        }
                                        var60.method3722(var61, var13, var14, var10.field2792, var10.field2793, var62, var10.field2842 ? 0 : -1, var10.field2840, var10.field2841, var10.field2839);
                                    } else if (class174.field2775) {
                                        method538(var10);
                                    }
                                } else if (var10.field2779 == 5) {
                                    if (var10.field2776) {
                                        class79 var65;
                                        if (var10.field2897 == -1) {
                                            var65 = var10.method3174(false);
                                        } else {
                                            var65 = class52.method533(var10.field2897, var10.field2898, var10.field2770, var10.field2817, var10.field2835, false);
                                        }
                                        if (var65 != null) {
                                            int var66 = var65.field1409;
                                            int var67 = var65.field1412;
                                            if (var10.field2815) {
                                                class80.method1681(var13, var14, var10.field2792 + var13, var10.field2793 + var14);
                                                int var68 = (var10.field2792 + (var66 - 1)) / var66;
                                                int var69 = (var10.field2793 + (var67 - 1)) / var67;
                                                for (int var70 = 0; var70 < var68; var70++) {
                                                    for (int var71 = 0; var71 < var69; var71++) {
                                                        if (var10.field2858 != 0) {
                                                            var65.method1619(var66 / 2 + var66 * var70 + var13, var67 / 2 + var67 * var71 + var14, var10.field2858, 4096);
                                                        } else if (var15 == 0) {
                                                            var65.method1548(var66 * var70 + var13, var67 * var71 + var14);
                                                        } else {
                                                            var65.method1581(var66 * var70 + var13, var67 * var71 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1634(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var72 = var10.field2792 * 4096 / var66;
                                                if (var10.field2858 != 0) {
                                                    var65.method1619(var10.field2792 / 2 + var13, var10.field2793 / 2 + var14, var10.field2858, var72);
                                                } else if (var15 != 0) {
                                                    var65.method1564(var13, var14, var10.field2792, var10.field2793, 256 - (var15 & 0xFF));
                                                } else if (var10.field2792 == var66 && var10.field2793 == var67) {
                                                    var65.method1548(var13, var14);
                                                } else {
                                                    var65.method1558(var13, var14, var10.field2792, var10.field2793);
                                                }
                                            }
                                        } else if (class174.field2775) {
                                            method538(var10);
                                        }
                                    } else {
                                        class79 var64 = var10.method3174(method1535(var10));
                                        if (var64 != null) {
                                            var64.method1548(var13, var14);
                                        } else if (class174.field2775) {
                                            method538(var10);
                                        }
                                    }
                                } else if (var10.field2779 == 6) {
                                    boolean var73 = method1535(var10);
                                    int var74;
                                    if (var73) {
                                        var74 = var10.field2843;
                                    } else {
                                        var74 = var10.field2894;
                                    }
                                    class106 var75 = null;
                                    int var76 = 0;
                                    if (var10.field2897 != -1) {
                                        class52 var77 = class52.method2583(var10.field2897);
                                        if (var77 != null) {
                                            class52 var78 = var77.method967(var10.field2898);
                                            var75 = var78.method966(1);
                                            if (var75 == null) {
                                                method538(var10);
                                            } else {
                                                var75.method2107();
                                                var76 = var75.field1467 / 2;
                                            }
                                        }
                                    } else if (var10.field2872 == 5) {
                                        if (var10.field2830 == 0) {
                                            var75 = field556.method3209((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var75 = Statics.field2302.method11();
                                        }
                                    } else if (var74 == -1) {
                                        var75 = var10.method3173((class43) null, -1, var73, Statics.field2302.field60);
                                        if (var75 == null && class174.field2775) {
                                            method538(var10);
                                        }
                                    } else {
                                        class43 var79 = class43.method168(var74);
                                        var75 = var10.method3173(var79, var10.field2899, var73, Statics.field2302.field60);
                                        if (var75 == null && class174.field2775) {
                                            method538(var10);
                                        }
                                    }
                                    class92.method1963(var10.field2792 / 2 + var13, var10.field2793 / 2 + var14);
                                    int var80 = var10.field2831 * class92.field1603[var10.field2790] >> 16;
                                    int var81 = var10.field2831 * class92.field1604[var10.field2790] >> 16;
                                    if (var75 != null) {
                                        if (var10.field2776) {
                                            var75.method2107();
                                            if (var10.field2856) {
                                                var75.method2118(0, var10.field2799, var10.field2800, var10.field2790, var10.field2844, var10.field2827 + var76 + var80, var10.field2827 + var81, var10.field2831);
                                            } else {
                                                var75.method2117(0, var10.field2799, var10.field2800, var10.field2790, var10.field2844, var10.field2827 + var76 + var80, var10.field2827 + var81);
                                            }
                                        } else {
                                            var75.method2117(0, var10.field2799, 0, var10.field2790, 0, var80, var81);
                                        }
                                    }
                                    class92.method1913();
                                } else {
                                    if (var10.field2779 == 7) {
                                        class225 var82 = var10.method3145();
                                        if (var82 == null) {
                                            if (class174.field2775) {
                                                method538(var10);
                                            }
                                            continue;
                                        }
                                        int var83 = 0;
                                        for (int var84 = 0; var84 < var10.field2789; var84++) {
                                            for (int var85 = 0; var85 < var10.field2788; var85++) {
                                                if (var10.field2850[var83] > 0) {
                                                    class52 var86 = class52.method2583(var10.field2850[var83] - 1);
                                                    String var87;
                                                    if (var86.field1132 != 1 && var10.field2869[var83] == 1) {
                                                        var87 = class2.method2916(16748608) + var86.field1121 + class2.field26;
                                                    } else {
                                                        var87 = class2.method2916(16748608) + var86.field1121 + class2.field26 + " " + 'x' + method84(var10.field2869[var83]);
                                                    }
                                                    int var88 = (var10.field2849 + 115) * var85 + var13;
                                                    int var89 = (var10.field2813 + 12) * var84 + var14;
                                                    if (var10.field2840 == 0) {
                                                        var82.method3705(var87, var88, var89, var10.field2798, var10.field2842 ? 0 : -1);
                                                    } else if (var10.field2840 == 1) {
                                                        var82.method3707(var87, var10.field2792 / 2 + var88, var89, var10.field2798, var10.field2842 ? 0 : -1);
                                                    } else {
                                                        var82.method3703(var87, var10.field2792 + var88 - 1, var89, var10.field2798, var10.field2842 ? 0 : -1);
                                                    }
                                                }
                                                var83++;
                                            }
                                        }
                                    }
                                    if (var10.field2779 == 8 && Statics.field618 == var10 && field435 == field434) {
                                        int var90 = 0;
                                        int var91 = 0;
                                        class225 var92 = Statics.field1441;
                                        String var93 = var10.field2833;
                                        String var94 = method1455(var93, var10);
                                        while (var94.length() > 0) {
                                            int var95 = var94.indexOf(class2.field25);
                                            String var96;
                                            if (var95 == -1) {
                                                var96 = var94;
                                                var94 = "";
                                            } else {
                                                var96 = var94.substring(0, var95);
                                                var94 = var94.substring(var95 + 4);
                                            }
                                            int var97 = var92.method3700(var96);
                                            if (var97 > var90) {
                                                var90 = var97;
                                            }
                                            var91 += var92.field3194 + 1;
                                        }
                                        var90 += 6;
                                        var91 += 7;
                                        int var98 = var10.field2792 + var13 - 5 - var90;
                                        int var99 = var10.field2793 + var14 + 5;
                                        if (var98 < var13 + 5) {
                                            var98 = var13 + 5;
                                        }
                                        if (var90 + var98 > arg4) {
                                            var98 = arg4 - var90;
                                        }
                                        if (var91 + var99 > arg5) {
                                            var99 = arg5 - var91;
                                        }
                                        class80.method1666(var98, var99, var90, var91, 16777120);
                                        class80.method1653(var98, var99, var90, var91, 0);
                                        String var100 = var10.field2833;
                                        int var101 = var92.field3194 + var99 + 2;
                                        String var102 = method1455(var100, var10);
                                        while (var102.length() > 0) {
                                            int var103 = var102.indexOf(class2.field25);
                                            String var104;
                                            if (var103 == -1) {
                                                var104 = var102;
                                                var102 = "";
                                            } else {
                                                var104 = var102.substring(0, var103);
                                                var102 = var102.substring(var103 + 4);
                                            }
                                            var92.method3705(var104, var98 + 3, var101, 0, -1);
                                            var101 += var92.field3194 + 1;
                                        }
                                    }
                                    if (var10.field2779 == 9) {
                                        if (var10.field2810 == 1) {
                                            int var105;
                                            int var106;
                                            int var107;
                                            int var108;
                                            if (var10.field2811) {
                                                var105 = var13;
                                                var106 = var10.field2793 + var14;
                                                var107 = var10.field2792 + var13;
                                                var108 = var14;
                                            } else {
                                                var105 = var13;
                                                var106 = var14;
                                                var107 = var10.field2792 + var13;
                                                var108 = var10.field2793 + var14;
                                            }
                                            class80.method1652(var105, var106, var107, var108, var10.field2798);
                                        } else {
                                            int var109 = var10.field2792 >= 0 ? var10.field2792 : -var10.field2792;
                                            int var110 = var10.field2793 >= 0 ? var10.field2793 : -var10.field2793;
                                            int var111 = var109;
                                            if (var109 < var110) {
                                                var111 = var110;
                                            }
                                            if (var111 != 0) {
                                                int var112 = (var10.field2792 << 16) / var111;
                                                int var113 = (var10.field2793 << 16) / var111;
                                                if (var113 <= var112) {
                                                    var112 = -var112;
                                                } else {
                                                    var113 = -var113;
                                                }
                                                int var114 = var10.field2810 * var113 >> 17;
                                                int var115 = var10.field2810 * var113 + 1 >> 17;
                                                int var116 = var10.field2810 * var112 >> 17;
                                                int var117 = var10.field2810 * var112 + 1 >> 17;
                                                int var118 = var13 + var114;
                                                int var119 = var13 - var115;
                                                int var120 = var10.field2792 + var13 - var115;
                                                int var121 = var10.field2792 + var13 + var114;
                                                int var122 = var14 + var116;
                                                int var123 = var14 - var117;
                                                int var124 = var10.field2793 + var14 - var117;
                                                int var125 = var10.field2793 + var14 + var116;
                                                class92.method1919(var118, var119, var120);
                                                class92.method1922(var122, var123, var124, var118, var119, var120, var10.field2798);
                                                class92.method1919(var118, var120, var121);
                                                class92.method1922(var122, var124, var125, var118, var120, var121, var10.field2798);
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

    @ObfuscatedName("bo.cr(Ljava/lang/String;Lfr;I)Ljava/lang/String;")
    public static String method1455(String arg0, class174 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method1540(arg1, var2 - 1);
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
                if (Statics.field2169 != null) {
                    var8 = class164.method136(Statics.field2169.field2252);
                    if (Statics.field2169.field2247 != null) {
                        var8 = (String) Statics.field2169.field2247;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("s.cx(II)Ljava/lang/String;")
    public static final String method84(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field35 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2916(65408) + var1.substring(0, var1.length() - 8) + class158.field2605 + " " + class2.field20 + var1 + class2.field23 + class2.field26;
        } else if (var1.length() > 6) {
            return " " + class2.method2916(16777215) + var1.substring(0, var1.length() - 4) + class158.field2497 + " " + class2.field20 + var1 + class2.field23 + class2.field26;
        } else {
            return " " + class2.method2916(16776960) + var1 + class2.field26;
        }
    }

    @ObfuscatedName("er.cu(ZB)V")
    public static final void method2778(boolean arg0) {
        int var1 = field443;
        int var2 = Statics.field163;
        int var3 = Statics.field967;
        if (class174.method3153(var1)) {
            method539(Statics.field3169[var1], -1, var2, var3, arg0);
        }
    }

    @ObfuscatedName("j.cw(Lfr;I)V")
    public static void method150(class174 arg0) {
        class174 var1 = arg0.field2796 == -1 ? null : class174.method3117(arg0.field2796);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field163;
            var3 = Statics.field967;
        } else {
            var2 = var1.field2792;
            var3 = var1.field2793;
        }
        method3445(arg0, var2, var3, false);
        method3183(arg0, var2, var3);
    }

    @ObfuscatedName("ab.ck([Lfr;Lfr;ZB)V")
    public static void method903(class174[] arg0, class174 arg1, boolean arg2) {
        int var3 = arg1.field2895 == 0 ? arg1.field2792 : arg1.field2895;
        int var4 = arg1.field2824 == 0 ? arg1.field2793 : arg1.field2824;
        method539(arg0, arg1.field2777, var3, var4, arg2);
        if (arg1.field2771 != null) {
            method539(arg1.field2771, arg1.field2777, var3, var4, arg2);
        }
        class4 var5 = (class4) field444.method3485((long) arg1.field2777);
        if (var5 != null) {
            int var6 = var5.field66;
            if (class174.method3153(var6)) {
                method539(Statics.field3169[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2781 == 1337) {
        }
    }

    @ObfuscatedName("q.cs([Lfr;IIIZS)V")
    public static void method539(class174[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class174 var6 = arg0[var5];
            if (var6 != null && var6.field2796 == arg1) {
                method3445(var6, arg2, arg3, arg4);
                method3183(var6, arg2, arg3);
                if (var6.field2836 > var6.field2895 - var6.field2792) {
                    var6.field2836 = var6.field2895 - var6.field2792;
                }
                if (var6.field2836 < 0) {
                    var6.field2836 = 0;
                }
                if (var6.field2862 > var6.field2824 - var6.field2793) {
                    var6.field2862 = var6.field2824 - var6.field2793;
                }
                if (var6.field2862 < 0) {
                    var6.field2862 = 0;
                }
                if (var6.field2779 == 0) {
                    method903(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("gy.cl(Lfr;IIZI)V")
    public static void method3445(class174 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2792;
        int var5 = arg0.field2793;
        if (arg0.field2784 == 0) {
            arg0.field2792 = arg0.field2788;
        } else if (arg0.field2784 == 1) {
            arg0.field2792 = arg1 - arg0.field2788;
        } else if (arg0.field2784 == 2) {
            arg0.field2792 = arg0.field2788 * arg1 >> 14;
        }
        if (arg0.field2785 == 0) {
            arg0.field2793 = arg0.field2789;
        } else if (arg0.field2785 == 1) {
            arg0.field2793 = arg2 - arg0.field2789;
        } else if (arg0.field2785 == 2) {
            arg0.field2793 = arg0.field2789 * arg2 >> 14;
        }
        if (arg0.field2784 == 4) {
            arg0.field2792 = arg0.field2794 * arg0.field2793 / arg0.field2795;
        }
        if (arg0.field2785 == 4) {
            arg0.field2793 = arg0.field2795 * arg0.field2792 / arg0.field2794;
        }
        if (field453 && arg0.field2779 == 0) {
            if (arg0.field2793 < 5 && arg0.field2792 < 5) {
                arg0.field2793 = 5;
                arg0.field2792 = 5;
            } else {
                if (arg0.field2793 <= 0) {
                    arg0.field2793 = 5;
                }
                if (arg0.field2792 <= 0) {
                    arg0.field2792 = 5;
                }
            }
        }
        if (arg0.field2781 == 1337) {
            field455 = arg0;
        }
        if (arg3 && arg0.field2886 != null && (arg0.field2792 != var4 || arg0.field2793 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field6 = arg0.field2886;
            field396.method3508(var6);
        }
    }

    @ObfuscatedName("fr.cn(Lfr;III)V")
    public static void method3183(class174 arg0, int arg1, int arg2) {
        if (arg0.field2782 == 0) {
            arg0.field2877 = arg0.field2816;
        } else if (arg0.field2782 == 1) {
            arg0.field2877 = (arg1 - arg0.field2792) / 2 + arg0.field2816;
        } else if (arg0.field2782 == 2) {
            arg0.field2877 = arg1 - arg0.field2792 - arg0.field2816;
        } else if (arg0.field2782 == 3) {
            arg0.field2877 = arg0.field2816 * arg1 >> 14;
        } else if (arg0.field2782 == 4) {
            arg0.field2877 = (arg0.field2816 * arg1 >> 14) + (arg1 - arg0.field2792) / 2;
        } else {
            arg0.field2877 = arg1 - arg0.field2792 - (arg0.field2816 * arg1 >> 14);
        }
        if (arg0.field2783 == 0) {
            arg0.field2802 = arg0.field2787;
        } else if (arg0.field2783 == 1) {
            arg0.field2802 = (arg2 - arg0.field2793) / 2 + arg0.field2787;
        } else if (arg0.field2783 == 2) {
            arg0.field2802 = arg2 - arg0.field2793 - arg0.field2787;
        } else if (arg0.field2783 == 3) {
            arg0.field2802 = arg0.field2787 * arg2 >> 14;
        } else if (arg0.field2783 == 4) {
            arg0.field2802 = (arg0.field2787 * arg2 >> 14) + (arg2 - arg0.field2793) / 2;
        } else {
            arg0.field2802 = arg2 - arg0.field2793 - (arg0.field2787 * arg2 >> 14);
        }
        if (!field453 || arg0.field2779 != 0) {
            return;
        }
        if (arg0.field2877 < 0) {
            arg0.field2877 = 0;
        } else if (arg0.field2877 + arg0.field2792 > arg1) {
            arg0.field2877 = arg1 - arg0.field2792;
        }
        if (arg0.field2802 < 0) {
            arg0.field2802 = 0;
        } else if (arg0.field2802 + arg0.field2793 > arg2) {
            arg0.field2802 = arg2 - arg0.field2793;
        }
    }

    @ObfuscatedName("ey.ce(Lfr;IIIIIIB)V")
    public static final void method2879(class174 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field458) {
            field367 = 32;
        } else {
            field367 = 0;
        }
        field458 = false;
        if (class141.field2179 == 1 || !Statics.field1756 && class141.field2179 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2862 -= 4;
                method538(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2862 += 4;
                method538(arg0);
            } else if (arg5 >= arg1 - field367 && arg5 < field367 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2862 = (arg4 - arg3) * var8 / var9;
                method538(arg0);
                field458 = true;
            }
        }
        if (field481 == 0) {
            return;
        }
        int var10 = arg0.field2792;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2862 += field481 * 45;
            method538(arg0);
        }
    }

    @ObfuscatedName("bz.cq(Lfr;I)Z")
    public static final boolean method1535(class174 arg0) {
        if (arg0.field2890 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2890.length; var1++) {
            int var2 = method1540(arg0, var1);
            int var3 = arg0.field2891[var1];
            if (arg0.field2890[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2890[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2890[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("bz.ca(Lfr;II)I")
    public static final int method1540(class174 arg0, int arg1) {
        if (arg0.field2889 == null || arg1 >= arg0.field2889.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2889[arg1];
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
                    var7 = field304[var2[var4++]];
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
                    class174 var11 = class174.method3117(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method2583(var12).field1135 || field287)) {
                        for (int var13 = 0; var13 < var11.field2850.length; var13++) {
                            if (var12 + 1 == var11.field2850[var13]) {
                                var7 += var11.field2869[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class177.field2924[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class156.field2325[field421[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class177.field2924[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2302.field42;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class156.field2324[var14]) {
                            var7 += field421[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class174 var17 = class174.method3117(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method2583(var18).field1135 || field287)) {
                        for (int var19 = 0; var19 < var17.field2850.length; var19++) {
                            if (var18 + 1 == var17.field2850[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field532;
                }
                if (var6 == 12) {
                    var7 = field449;
                }
                if (var6 == 13) {
                    int var20 = class177.field2924[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class177.method135(var22);
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
                    var7 = (Statics.field2302.field810 >> 7) + Statics.field1566;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2302.field805 >> 7) + Statics.field359;
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

    @ObfuscatedName("client.cz(IIIIIIIB)V")
    public static final void method532(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class174.method3153(arg0)) {
            method82(Statics.field3169[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("s.cp([Lfr;IIIIIIII)V")
    public static final void method82(class174[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class174 var9 = arg0[var8];
            if (var9 != null && (!var9.field2776 || var9.field2779 == 0 || var9.field2857 || method2739(var9) != 0 || field457 == var9 || var9.field2781 == 1338) && var9.field2796 == arg1 && (!var9.field2776 || !method137(var9))) {
                int var10 = var9.field2877 + arg6;
                int var11 = var9.field2802 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2779 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2779 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2792 + var10;
                    int var19 = var9.field2793 + var11;
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
                    int var22 = var9.field2792 + var10;
                    int var23 = var9.field2793 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field456 == var9) {
                    field428 = true;
                    field504 = var10;
                    field466 = var11;
                }
                if (!var9.field2776 || var12 < var14 && var13 < var15) {
                    int var24 = class141.field2193;
                    int var25 = class141.field2190;
                    if (class141.field2186 != 0) {
                        var24 = class141.field2191;
                        var25 = class141.field2188;
                    }
                    if (var9.field2781 == 1337) {
                        if (!field293 && !field424 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method3134(var24, var25, var12, var13);
                        }
                    } else if (var9.field2781 != 1338) {
                        if (!field424 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var40 = var24 - var10;
                            int var41 = var25 - var11;
                            if (var9.field2780 == 1) {
                                method34(var9.field2873, "", 24, 0, 0, var9.field2777);
                            }
                            if (var9.field2780 == 2 && !field438) {
                                int var42 = method2739(var9);
                                int var43 = var42 >> 11 & 0x3F;
                                String var44;
                                if (var43 == 0) {
                                    var44 = null;
                                } else if (var9.field2797 == null || var9.field2797.trim().length() == 0) {
                                    var44 = null;
                                } else {
                                    var44 = var9.field2797;
                                }
                                if (var44 != null) {
                                    method34(var44, class2.method2916(65280) + var9.field2893, 25, 0, -1, var9.field2777);
                                }
                            }
                            if (var9.field2780 == 3) {
                                method34(class158.field2374, "", 26, 0, 0, var9.field2777);
                            }
                            if (var9.field2780 == 4) {
                                method34(var9.field2873, "", 28, 0, 0, var9.field2777);
                            }
                            if (var9.field2780 == 5) {
                                method34(var9.field2873, "", 29, 0, 0, var9.field2777);
                            }
                            if (var9.field2780 == 6 && field400 == null) {
                                method34(var9.field2873, "", 30, 0, -1, var9.field2777);
                            }
                            if (var9.field2779 == 2) {
                                int var46 = 0;
                                for (int var47 = 0; var47 < var9.field2793; var47++) {
                                    for (int var48 = 0; var48 < var9.field2792; var48++) {
                                        int var49 = (var9.field2849 + 32) * var48;
                                        int var50 = (var9.field2813 + 32) * var47;
                                        if (var46 < 20) {
                                            var49 += var9.field2845[var46];
                                            var50 += var9.field2846[var46];
                                        }
                                        if (var40 >= var49 && var41 >= var50 && var40 < var49 + 32 && var41 < var50 + 32) {
                                            field402 = var46;
                                            Statics.field178 = var9;
                                            if (var9.field2850[var46] > 0) {
                                                class52 var51 = class52.method2583(var9.field2850[var46] - 1);
                                                if (field380 == 1 && class179.method682(method2739(var9))) {
                                                    if (Statics.field2209 != var9.field2777 || Statics.field2060 != var46) {
                                                        method34(class158.field2484, field464 + " " + class2.field24 + " " + class2.method2916(16748608) + var51.field1121, 31, var51.field1119, var46, var9.field2777);
                                                    }
                                                } else if (!field438 || !class179.method682(method2739(var9))) {
                                                    String[] var52 = var51.field1122;
                                                    if (field454) {
                                                        var52 = method2598(var52);
                                                    }
                                                    if (class179.method682(method2739(var9))) {
                                                        for (int var53 = 4; var53 >= 3; var53--) {
                                                            if (var52 != null && var52[var53] != null) {
                                                                byte var54;
                                                                if (var53 == 3) {
                                                                    var54 = 36;
                                                                } else {
                                                                    var54 = 37;
                                                                }
                                                                method34(var52[var53], class2.method2916(16748608) + var51.field1121, var54, var51.field1119, var46, var9.field2777);
                                                            } else if (var53 == 4) {
                                                                method34(class158.field2338, class2.method2916(16748608) + var51.field1121, 37, var51.field1119, var46, var9.field2777);
                                                            }
                                                        }
                                                    }
                                                    int var55 = method2739(var9);
                                                    boolean var56 = (var55 >> 31 & 0x1) != 0;
                                                    if (var56) {
                                                        method34(class158.field2484, class2.method2916(16748608) + var51.field1121, 38, var51.field1119, var46, var9.field2777);
                                                    }
                                                    class179 var10000 = (class179) null;
                                                    if (class179.method682(method2739(var9)) && var52 != null) {
                                                        for (int var57 = 2; var57 >= 0; var57--) {
                                                            if (var52[var57] != null) {
                                                                byte var58 = 0;
                                                                if (var57 == 0) {
                                                                    var58 = 33;
                                                                }
                                                                if (var57 == 1) {
                                                                    var58 = 34;
                                                                }
                                                                if (var57 == 2) {
                                                                    var58 = 35;
                                                                }
                                                                method34(var52[var57], class2.method2916(16748608) + var51.field1121, var58, var51.field1119, var46, var9.field2777);
                                                            }
                                                        }
                                                    }
                                                    String[] var59 = var9.field2806;
                                                    if (field454) {
                                                        var59 = method2598(var59);
                                                    }
                                                    if (var59 != null) {
                                                        for (int var60 = 4; var60 >= 0; var60--) {
                                                            if (var59[var60] != null) {
                                                                byte var61 = 0;
                                                                if (var60 == 0) {
                                                                    var61 = 39;
                                                                }
                                                                if (var60 == 1) {
                                                                    var61 = 40;
                                                                }
                                                                if (var60 == 2) {
                                                                    var61 = 41;
                                                                }
                                                                if (var60 == 3) {
                                                                    var61 = 42;
                                                                }
                                                                if (var60 == 4) {
                                                                    var61 = 43;
                                                                }
                                                                method34(var59[var60], class2.method2916(16748608) + var51.field1121, var61, var51.field1119, var46, var9.field2777);
                                                            }
                                                        }
                                                    }
                                                    method34(class158.field2485, class2.method2916(16748608) + var51.field1121, 1005, var51.field1119, var46, var9.field2777);
                                                } else if ((Statics.field70 & 0x10) == 16) {
                                                    method34(field433, field442 + " " + class2.field24 + " " + class2.method2916(16748608) + var51.field1121, 32, var51.field1119, var46, var9.field2777);
                                                }
                                            }
                                        }
                                        var46++;
                                    }
                                }
                            }
                            if (var9.field2776) {
                                if (field438) {
                                    int var62 = method2739(var9);
                                    boolean var63 = (var62 >> 21 & 0x1) != 0;
                                    if (var63 && (Statics.field70 & 0x20) == 32) {
                                        method34(field433, field442 + " " + class2.field24 + " " + var9.field2834, 58, 0, var9.field2778, var9.field2777);
                                    }
                                } else {
                                    for (int var64 = 9; var64 >= 5; var64--) {
                                        String var65 = method1724(var9, var64);
                                        if (var65 != null) {
                                            method34(var65, var9.field2834, 1007, var64 + 1, var9.field2778, var9.field2777);
                                        }
                                    }
                                    int var66 = method2739(var9);
                                    int var67 = var66 >> 11 & 0x3F;
                                    String var68;
                                    if (var67 == 0) {
                                        var68 = null;
                                    } else if (var9.field2797 == null || var9.field2797.trim().length() == 0) {
                                        var68 = null;
                                    } else {
                                        var68 = var9.field2797;
                                    }
                                    if (var68 != null) {
                                        method34(var68, var9.field2834, 25, 0, var9.field2778, var9.field2777);
                                    }
                                    for (int var70 = 4; var70 >= 0; var70--) {
                                        String var71 = method1724(var9, var70);
                                        if (var71 != null) {
                                            method34(var71, var9.field2834, 57, var70 + 1, var9.field2778, var9.field2777);
                                        }
                                    }
                                    if (Statics.method2922(method2739(var9))) {
                                        method34(class158.field2342, "", 30, 0, var9.field2778, var9.field2777);
                                    }
                                }
                            }
                        }
                        if (var9.field2779 == 0) {
                            if (!var9.field2776 && method137(var9) && Statics.field2083 != var9) {
                                continue;
                            }
                            method82(arg0, var9.field2777, var12, var13, var14, var15, var10 - var9.field2836, var11 - var9.field2862);
                            if (var9.field2771 != null) {
                                method82(var9.field2771, var9.field2777, var12, var13, var14, var15, var10 - var9.field2836, var11 - var9.field2862);
                            }
                            class4 var72 = (class4) field444.method3485((long) var9.field2777);
                            if (var72 != null) {
                                if (var72.field65 == 0 && class141.field2193 >= var12 && class141.field2190 >= var13 && class141.field2193 < var14 && class141.field2190 < var15 && !field424 && !field453) {
                                    for (class1 var73 = (class1) field396.method3534(); var73 != null; var73 = (class1) field396.method3516()) {
                                        if (var73.field2) {
                                            var73.method3607();
                                            var73.field3.field2825 = false;
                                        }
                                    }
                                    if (Statics.field29 == 0) {
                                        field456 = null;
                                        field457 = null;
                                    }
                                    if (!field424) {
                                        field430[0] = class158.field2573;
                                        field338[0] = "";
                                        field393[0] = 1006;
                                        field295 = 1;
                                    }
                                }
                                method532(var72.field66, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2776) {
                            if (var9.field2910) {
                                if (class141.field2193 >= var12 && class141.field2190 >= var13 && class141.field2193 < var14 && class141.field2190 < var15) {
                                    for (class1 var74 = (class1) field396.method3534(); var74 != null; var74 = (class1) field396.method3516()) {
                                        if (var74.field2) {
                                            var74.method3607();
                                            var74.field3.field2825 = false;
                                        }
                                    }
                                    if (Statics.field29 == 0) {
                                        field456 = null;
                                        field457 = null;
                                    }
                                    if (!field424) {
                                        field430[0] = class158.field2573;
                                        field338[0] = "";
                                        field393[0] = 1006;
                                        field295 = 1;
                                    }
                                }
                            } else if (var9.field2911 && class141.field2193 >= var12 && class141.field2190 >= var13 && class141.field2193 < var14 && class141.field2190 < var15) {
                                for (class1 var75 = (class1) field396.method3534(); var75 != null; var75 = (class1) field396.method3516()) {
                                    if (var75.field2 && var75.field3.field2874 == var75.field6) {
                                        var75.method3607();
                                    }
                                }
                            }
                            boolean var76;
                            if (class141.field2193 >= var12 && class141.field2190 >= var13 && class141.field2193 < var14 && class141.field2190 < var15) {
                                var76 = true;
                            } else {
                                var76 = false;
                            }
                            boolean var77 = false;
                            if ((class141.field2179 == 1 || !Statics.field1756 && class141.field2179 == 4) && var76) {
                                var77 = true;
                            }
                            boolean var78 = false;
                            if ((class141.field2186 == 1 || !Statics.field1756 && class141.field2186 == 4) && class141.field2191 >= var12 && class141.field2188 >= var13 && class141.field2191 < var14 && class141.field2188 < var15) {
                                var78 = true;
                            }
                            if (var78) {
                                Statics.method83(var9, class141.field2191 - var10, class141.field2188 - var11);
                            }
                            if (field456 != null && field456 != var9 && var76 && class179.method2182(method2739(var9))) {
                                field460 = var9;
                            }
                            if (field457 == var9) {
                                field417 = true;
                                field280 = var10;
                                field409 = var11;
                            }
                            if (var9.field2857) {
                                if (var76 && field481 != 0 && var9.field2874 != null) {
                                    class1 var79 = new class1();
                                    var79.field2 = true;
                                    var79.field3 = var9;
                                    var79.field5 = field481;
                                    var79.field6 = var9.field2874;
                                    field396.method3508(var79);
                                }
                                if (field456 != null || Statics.field127 != null || field424) {
                                    var78 = false;
                                    var77 = false;
                                    var76 = false;
                                }
                                if (!var9.field2821 && var78) {
                                    var9.field2821 = true;
                                    if (var9.field2859 != null) {
                                        class1 var80 = new class1();
                                        var80.field2 = true;
                                        var80.field3 = var9;
                                        var80.field7 = class141.field2191 - var10;
                                        var80.field5 = class141.field2188 - var11;
                                        var80.field6 = var9.field2859;
                                        field396.method3508(var80);
                                    }
                                }
                                if (var9.field2821 && var77 && var9.field2860 != null) {
                                    class1 var81 = new class1();
                                    var81.field2 = true;
                                    var81.field3 = var9;
                                    var81.field7 = class141.field2193 - var10;
                                    var81.field5 = class141.field2190 - var11;
                                    var81.field6 = var9.field2860;
                                    field396.method3508(var81);
                                }
                                if (var9.field2821 && !var77) {
                                    var9.field2821 = false;
                                    if (var9.field2861 != null) {
                                        class1 var82 = new class1();
                                        var82.field2 = true;
                                        var82.field3 = var9;
                                        var82.field7 = class141.field2193 - var10;
                                        var82.field5 = class141.field2190 - var11;
                                        var82.field6 = var9.field2861;
                                        field484.method3508(var82);
                                    }
                                }
                                if (var77 && var9.field2829 != null) {
                                    class1 var83 = new class1();
                                    var83.field2 = true;
                                    var83.field3 = var9;
                                    var83.field7 = class141.field2193 - var10;
                                    var83.field5 = class141.field2190 - var11;
                                    var83.field6 = var9.field2829;
                                    field396.method3508(var83);
                                }
                                if (!var9.field2825 && var76) {
                                    var9.field2825 = true;
                                    if (var9.field2863 != null) {
                                        class1 var84 = new class1();
                                        var84.field2 = true;
                                        var84.field3 = var9;
                                        var84.field7 = class141.field2193 - var10;
                                        var84.field5 = class141.field2190 - var11;
                                        var84.field6 = var9.field2863;
                                        field396.method3508(var84);
                                    }
                                }
                                if (var9.field2825 && var76 && var9.field2864 != null) {
                                    class1 var85 = new class1();
                                    var85.field2 = true;
                                    var85.field3 = var9;
                                    var85.field7 = class141.field2193 - var10;
                                    var85.field5 = class141.field2190 - var11;
                                    var85.field6 = var9.field2864;
                                    field396.method3508(var85);
                                }
                                if (var9.field2825 && !var76) {
                                    var9.field2825 = false;
                                    if (var9.field2865 != null) {
                                        class1 var86 = new class1();
                                        var86.field2 = true;
                                        var86.field3 = var9;
                                        var86.field7 = class141.field2193 - var10;
                                        var86.field5 = class141.field2190 - var11;
                                        var86.field6 = var9.field2865;
                                        field484.method3508(var86);
                                    }
                                }
                                if (var9.field2820 != null) {
                                    class1 var87 = new class1();
                                    var87.field3 = var9;
                                    var87.field6 = var9.field2820;
                                    field483.method3508(var87);
                                }
                                if (var9.field2900 != null && field470 > var9.field2905) {
                                    if (var9.field2901 == null || field470 - var9.field2905 > 32) {
                                        class1 var92 = new class1();
                                        var92.field3 = var9;
                                        var92.field6 = var9.field2900;
                                        field396.method3508(var92);
                                    } else {
                                        label688: for (int var88 = var9.field2905; var88 < field470; var88++) {
                                            int var89 = field513[var88 & 0x1F];
                                            for (int var90 = 0; var90 < var9.field2901.length; var90++) {
                                                if (var9.field2901[var90] == var89) {
                                                    class1 var91 = new class1();
                                                    var91.field3 = var9;
                                                    var91.field6 = var9.field2900;
                                                    field396.method3508(var91);
                                                    break label688;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2905 = field470;
                                }
                                if (var9.field2774 != null && field387 > var9.field2906) {
                                    if (var9.field2902 == null || field387 - var9.field2906 > 32) {
                                        class1 var97 = new class1();
                                        var97.field3 = var9;
                                        var97.field6 = var9.field2774;
                                        field396.method3508(var97);
                                    } else {
                                        label664: for (int var93 = var9.field2906; var93 < field387; var93++) {
                                            int var94 = field471[var93 & 0x1F];
                                            for (int var95 = 0; var95 < var9.field2902.length; var95++) {
                                                if (var9.field2902[var95] == var94) {
                                                    class1 var96 = new class1();
                                                    var96.field3 = var9;
                                                    var96.field6 = var9.field2774;
                                                    field396.method3508(var96);
                                                    break label664;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2906 = field387;
                                }
                                if (var9.field2903 != null && field474 > var9.field2907) {
                                    if (var9.field2875 == null || field474 - var9.field2907 > 32) {
                                        class1 var102 = new class1();
                                        var102.field3 = var9;
                                        var102.field6 = var9.field2903;
                                        field396.method3508(var102);
                                    } else {
                                        label640: for (int var98 = var9.field2907; var98 < field474; var98++) {
                                            int var99 = field473[var98 & 0x1F];
                                            for (int var100 = 0; var100 < var9.field2875.length; var100++) {
                                                if (var9.field2875[var100] == var99) {
                                                    class1 var101 = new class1();
                                                    var101.field3 = var9;
                                                    var101.field6 = var9.field2903;
                                                    field396.method3508(var101);
                                                    break label640;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2907 = field474;
                                }
                                if (field475 > var9.field2904 && var9.field2809 != null) {
                                    class1 var103 = new class1();
                                    var103.field3 = var9;
                                    var103.field6 = var9.field2809;
                                    field396.method3508(var103);
                                }
                                if (field476 > var9.field2904 && var9.field2881 != null) {
                                    class1 var104 = new class1();
                                    var104.field3 = var9;
                                    var104.field6 = var9.field2881;
                                    field396.method3508(var104);
                                }
                                if (field383 > var9.field2904 && var9.field2882 != null) {
                                    class1 var105 = new class1();
                                    var105.field3 = var9;
                                    var105.field6 = var9.field2882;
                                    field396.method3508(var105);
                                }
                                if (field478 > var9.field2904 && var9.field2887 != null) {
                                    class1 var106 = new class1();
                                    var106.field3 = var9;
                                    var106.field6 = var9.field2887;
                                    field396.method3508(var106);
                                }
                                if (field538 > var9.field2904 && var9.field2888 != null) {
                                    class1 var107 = new class1();
                                    var107.field3 = var9;
                                    var107.field6 = var9.field2888;
                                    field396.method3508(var107);
                                }
                                if (field480 > var9.field2904 && var9.field2883 != null) {
                                    class1 var108 = new class1();
                                    var108.field3 = var9;
                                    var108.field6 = var9.field2883;
                                    field396.method3508(var108);
                                }
                                var9.field2904 = field468;
                                if (var9.field2880 != null) {
                                    for (int var109 = 0; var109 < field506; var109++) {
                                        class1 var110 = new class1();
                                        var110.field3 = var9;
                                        var110.field8 = field508[var109];
                                        var110.field9 = field563[var109];
                                        var110.field6 = var9.field2880;
                                        field396.method3508(var110);
                                    }
                                }
                            }
                        }
                        if (!var9.field2776 && field456 == null && Statics.field127 == null && !field424) {
                            if ((var9.field2892 >= 0 || var9.field2804 != 0) && class141.field2193 >= var12 && class141.field2190 >= var13 && class141.field2193 < var14 && class141.field2190 < var15) {
                                if (var9.field2892 >= 0) {
                                    Statics.field2083 = arg0[var9.field2892];
                                } else {
                                    Statics.field2083 = var9;
                                }
                            }
                            if (var9.field2779 == 8 && class141.field2193 >= var12 && class141.field2190 >= var13 && class141.field2193 < var14 && class141.field2190 < var15) {
                                Statics.field618 = var9;
                            }
                            if (var9.field2824 > var9.field2793) {
                                method2879(var9, var9.field2792 + var10, var11, var9.field2793, var9.field2824, class141.field2193, class141.field2190);
                            }
                        }
                    } else if ((field550 == 0 || field550 == 3) && (class141.field2186 == 1 || !Statics.field1756 && class141.field2186 == 4)) {
                        class176 var26 = var9.method3148(true);
                        if (var26 != null) {
                            int var27 = class141.field2191 - var10;
                            int var28 = class141.field2188 - var11;
                            if (var26.method3186(var27, var28)) {
                                int var29 = var27 - var26.field2919 / 2;
                                int var30 = var28 - var26.field2918 / 2;
                                int var31 = field356 + field303 & 0x7FF;
                                int var32 = class92.field1603[var31];
                                int var33 = class92.field1604[var31];
                                int var34 = (field358 + 256) * var32 >> 8;
                                int var35 = (field358 + 256) * var33 >> 8;
                                int var36 = var29 * var35 + var30 * var34 >> 11;
                                int var37 = var30 * var35 - var29 * var34 >> 11;
                                int var38 = Statics.field2302.field810 + var36 >> 7;
                                int var39 = Statics.field2302.field805 - var37 >> 7;
                                field326.method2573(83);
                                field326.method2293(18);
                                field326.method2332(class138.field2134[82] ? (class138.field2134[81] ? 2 : 1) : 0);
                                field326.method2340(Statics.field1566 + var38);
                                field326.method2294(Statics.field359 + var39);
                                field326.method2293(var29);
                                field326.method2293(var30);
                                field326.method2294(field303);
                                field326.method2293(57);
                                field326.method2293(field356);
                                field326.method2293(field358);
                                field326.method2293(89);
                                field326.method2294(Statics.field2302.field810);
                                field326.method2294(Statics.field2302.field805);
                                field326.method2293(63);
                                field546 = var38;
                                field518 = var39;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("o.cd([Lfr;II)V")
    public static final void method131(class174[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class174 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2779 == 0) {
                    if (var3.field2771 != null) {
                        method131(var3.field2771, arg1);
                    }
                    class4 var4 = (class4) field444.method3485((long) var3.field2777);
                    if (var4 != null) {
                        int var5 = var4.field66;
                        if (class174.method3153(var5)) {
                            method131(Statics.field3169[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2884 != null) {
                    class1 var6 = new class1();
                    var6.field3 = var3;
                    var6.field6 = var3.field2884;
                    class37.method3136(var6);
                }
                if (arg1 == 1 && var3.field2885 != null) {
                    if (var3.field2778 >= 0) {
                        class174 var7 = class174.method3117(var3.field2777);
                        if (var7 == null || var7.field2771 == null || var3.field2778 >= var7.field2771.length || var7.field2771[var3.field2778] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field3 = var3;
                    var8.field6 = var3.field2885;
                    class37.method3136(var8);
                }
            }
        }
    }

    @ObfuscatedName("t.dk(I)V")
    public static final void method1() {
        method538(field456);
        Statics.field29++;
        if (field428 && field417) {
            int var0 = class141.field2193;
            int var1 = class141.field2190;
            int var2 = var0 - field492;
            int var3 = var1 - field349;
            if (var2 < field280) {
                var2 = field280;
            }
            if (field456.field2792 + var2 > field280 + field457.field2792) {
                var2 = field280 + field457.field2792 - field456.field2792;
            }
            if (var3 < field409) {
                var3 = field409;
            }
            if (field456.field2793 + var3 > field409 + field457.field2793) {
                var3 = field409 + field457.field2793 - field456.field2793;
            }
            int var4 = var2 - field504;
            int var5 = var3 - field466;
            int var6 = field456.field2853;
            if (Statics.field29 > field456.field2832 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field514 = true;
            }
            int var7 = field457.field2836 + (var2 - field280);
            int var8 = field457.field2862 + (var3 - field409);
            if (field456.field2791 != null && field514) {
                class1 var9 = new class1();
                var9.field3 = field456;
                var9.field7 = var7;
                var9.field5 = var8;
                var9.field6 = field456.field2791;
                class37.method3136(var9);
            }
            if (class141.field2179 == 0) {
                if (field514) {
                    if (field456.field2867 != null) {
                        class1 var10 = new class1();
                        var10.field3 = field456;
                        var10.field7 = var7;
                        var10.field5 = var8;
                        var10.field11 = field460;
                        var10.field6 = field456.field2867;
                        class37.method3136(var10);
                    }
                    if (field460 != null) {
                        class174 var11 = field456;
                        int var12 = class179.method630(method2739(var11));
                        class174 var13;
                        if (var12 == 0) {
                            var13 = null;
                        } else {
                            int var14 = 0;
                            while (true) {
                                if (var14 >= var12) {
                                    var13 = var11;
                                    break;
                                }
                                var11 = class174.method3117(var11.field2796);
                                if (var11 == null) {
                                    var13 = null;
                                    break;
                                }
                                var14++;
                            }
                        }
                        if (var13 != null) {
                            field326.method2573(88);
                            field326.method2349(field456.field2777);
                            field326.method2342(field460.field2778);
                            field326.method2349(field460.field2777);
                            field326.method2294(field456.field2778);
                            field326.method2341(field460.field2897);
                            field326.method2341(field456.field2897);
                        }
                    }
                } else if ((field423 == 1 || method1909(field295 - 1)) && field295 > 2) {
                    method164(field504 + field492, field466 + field349);
                } else if (field295 > 0) {
                    method659(field504 + field492, field466 + field349);
                }
                field456 = null;
            }
        } else if (Statics.field29 > 1) {
            field456 = null;
        }
    }

    @ObfuscatedName("dn.dt(IB)V")
    public static void method2620(int arg0) {
        Statics.field567 = new class31();
        Statics.field567.field696 = field426[arg0];
        Statics.field567.field697 = field427[arg0];
        Statics.field567.field698 = field393[arg0];
        Statics.field567.field699 = field503[arg0];
        Statics.field567.field700 = field430[arg0];
    }

    @ObfuscatedName("ar.db(III)V")
    public static void method659(int arg0, int arg1) {
        method1014(Statics.field567, arg0, arg1);
        Statics.field567 = null;
    }

    @ObfuscatedName("q.ds(Lfr;I)V")
    public static void method538(class174 arg0) {
        if (field469 == arg0.field2909) {
            field397[arg0.field2814] = true;
        }
    }

    @ObfuscatedName("j.dq(I)V")
    public static void method151() {
        for (class4 var0 = (class4) field444.method3488(); var0 != null; var0 = (class4) field444.method3489()) {
            int var1 = var0.field66;
            if (class174.method3153(var1)) {
                boolean var2 = true;
                class174[] var3 = Statics.field3169[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2776;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3126;
                    class174 var6 = class174.method3117(var5);
                    if (var6 != null) {
                        method538(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("df.di([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2598(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("as.dz([Lfr;II)V")
    public static final void method619(class174[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class174 var3 = arg0[var2];
            if (var3 != null && var3.field2796 == arg1 && (!var3.field2776 || !method137(var3))) {
                if (var3.field2779 == 0) {
                    if (!var3.field2776 && method137(var3) && Statics.field2083 != var3) {
                        continue;
                    }
                    method619(arg0, var3.field2777);
                    if (var3.field2771 != null) {
                        method619(var3.field2771, var3.field2777);
                    }
                    class4 var4 = (class4) field444.method3485((long) var3.field2777);
                    if (var4 != null) {
                        int var5 = var4.field66;
                        if (class174.method3153(var5)) {
                            method619(Statics.field3169[var5], -1);
                        }
                    }
                }
                if (var3.field2779 == 6) {
                    if (var3.field2894 != -1 || var3.field2843 != -1) {
                        boolean var6 = method1535(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2843;
                        } else {
                            var7 = var3.field2894;
                        }
                        if (var7 != -1) {
                            class43 var8 = class43.method168(var7);
                            var3.field2768 += field331;
                            while (var3.field2768 > var8.field988[var3.field2899]) {
                                var3.field2768 -= var8.field988[var3.field2899];
                                var3.field2899++;
                                if (var3.field2899 >= var8.field986.length) {
                                    var3.field2899 -= var8.field982;
                                    if (var3.field2899 < 0 || var3.field2899 >= var8.field986.length) {
                                        var3.field2899 = 0;
                                    }
                                }
                                method538(var3);
                            }
                        }
                    }
                    if (var3.field2870 != 0 && !var3.field2776) {
                        int var9 = var3.field2870 >> 16;
                        int var10 = var3.field2870 << 16 >> 16;
                        int var11 = field331 * var9;
                        int var12 = field331 * var10;
                        var3.field2790 = var3.field2790 + var11 & 0x7FF;
                        var3.field2799 = var3.field2799 + var12 & 0x7FF;
                        method538(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fg.da(I)V")
    public static final void method2937() {
        field326.method2573(39);
        for (class4 var0 = (class4) field444.method3488(); var0 != null; var0 = (class4) field444.method3489()) {
            if (var0.field65 == 0 || var0.field65 == 3) {
                method880(var0, true);
            }
        }
        if (field400 != null) {
            method538(field400);
            field400 = null;
        }
    }

    @ObfuscatedName("ac.de(IIII)Lh;")
    public static final class4 method753(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field66 = arg1;
        var3.field65 = arg2;
        field444.method3486(var3, (long) arg0);
        if (class174.method3153(arg1)) {
            class174[] var4 = Statics.field3169[arg1];
            for (int var5 = 0; var5 < var4.length; var5++) {
                class174 var6 = var4[var5];
                if (var6 != null) {
                    var6.field2899 = 0;
                    var6.field2768 = 0;
                }
            }
        }
        class174 var7 = class174.method3117(arg0);
        method538(var7);
        if (field400 != null) {
            method538(field400);
            field400 = null;
        }
        for (int var8 = 0; var8 < field295; var8++) {
            int var9 = field393[var8];
            boolean var10 = var9 == 57 || var9 == 58 || var9 == 1007 || var9 == 25 || var9 == 30;
            if (var10) {
                if (var8 < field295 - 1) {
                    for (int var11 = var8; var11 < field295 - 1; var11++) {
                        field430[var11] = field430[var11 + 1];
                        field338[var11] = field338[var11 + 1];
                        field393[var11] = field393[var11 + 1];
                        field503[var11] = field503[var11 + 1];
                        field426[var11] = field426[var11 + 1];
                        field427[var11] = field427[var11 + 1];
                    }
                }
                field295--;
            }
        }
        method903(Statics.field3169[arg0 >> 16], var7, false);
        class37.method1984(arg1);
        if (field443 != -1) {
            int var12 = field443;
            if (class174.method3153(var12)) {
                method131(Statics.field3169[var12], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("aa.dp(Lh;ZB)V")
    public static final void method880(class4 arg0, boolean arg1) {
        int var2 = arg0.field66;
        int var3 = (int) arg0.field3126;
        arg0.method3607();
        if (arg1) {
            class174.method622(var2);
        }
        for (class202 var4 = (class202) field429.method3488(); var4 != null; var4 = (class202) field429.method3489()) {
            if ((var4.field3126 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method3607();
            }
        }
        class174 var5 = class174.method3117(var3);
        if (var5 != null) {
            method538(var5);
        }
        for (int var6 = 0; var6 < field295; var6++) {
            int var7 = field393[var6];
            boolean var8 = var7 == 57 || var7 == 58 || var7 == 1007 || var7 == 25 || var7 == 30;
            if (var8) {
                if (var6 < field295 - 1) {
                    for (int var9 = var6; var9 < field295 - 1; var9++) {
                        field430[var9] = field430[var9 + 1];
                        field338[var9] = field338[var9 + 1];
                        field393[var9] = field393[var9 + 1];
                        field503[var9] = field503[var9 + 1];
                        field426[var9] = field426[var9 + 1];
                        field427[var9] = field427[var9 + 1];
                    }
                }
                field295--;
            }
        }
        if (field443 != -1) {
            int var10 = field443;
            if (class174.method3153(var10)) {
                method131(Statics.field3169[var10], 1);
            }
        }
    }

    @ObfuscatedName("cz.dc(Lfr;B)Z")
    public static final boolean method2083(class174 arg0) {
        int var1 = arg0.field2781;
        if (var1 == 205) {
            field336 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field556.method3205(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field556.method3222(var4, var5 == 1);
        }
        if (var1 == 324) {
            field556.method3225(false);
        }
        if (var1 == 325) {
            field556.method3225(true);
        }
        if (var1 == 326) {
            field326.method2573(161);
            field556.method3214(field326);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("v.dg(Lfr;IIII)V")
    public static final void method553(class174 arg0, int arg1, int arg2, int arg3) {
        method2678();
        class176 var4 = arg0.method3148(false);
        if (var4 == null) {
            return;
        }
        class80.method1634(arg1, arg2, var4.field2919 + arg1, var4.field2918 + arg2);
        if (field550 == 2 || field550 == 5) {
            class80.method1633(arg1, arg2, 0, var4.field2921, var4.field2923);
        } else {
            int var5 = field356 + field303 & 0x7FF;
            int var6 = Statics.field2302.field810 / 32 + 48;
            int var7 = 464 - Statics.field2302.field805 / 32;
            Statics.field1768.method1617(arg1, arg2, var4.field2919, var4.field2918, var6, var7, var5, field358 + 256, var4.field2921, var4.field2923);
            for (int var8 = 0; var8 < field311; var8++) {
                int var9 = field412[var8] * 4 + 2 - Statics.field2302.field810 / 32;
                int var10 = field493[var8] * 4 + 2 - Statics.field2302.field805 / 32;
                Statics.method75(arg1, arg2, var9, var10, field465[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class200 var13 = field416[Statics.field755][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field2302.field810 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field2302.field805 / 32;
                        Statics.method75(arg1, arg2, var14, var15, Statics.field1909[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field294; var16++) {
                class35 var17 = field321[field323[var16]];
                if (var17 != null && var17.method25()) {
                    class40 var18 = var17.field773;
                    if (var18 != null && var18.field908 != null) {
                        var18 = var18.method720();
                    }
                    if (var18 != null && var18.field884 && var18.field911) {
                        int var19 = var17.field810 / 32 - Statics.field2302.field810 / 32;
                        int var20 = var17.field805 / 32 - Statics.field2302.field805 / 32;
                        Statics.method75(arg1, arg2, var19, var20, Statics.field1909[1], var4);
                    }
                }
            }
            int var21 = class33.field742;
            int[] var22 = class33.field743;
            for (int var23 = 0; var23 < var21; var23++) {
                class3 var24 = field406[var22[var23]];
                if (var24 != null && var24.method25() && !var24.field57 && Statics.field2302 != var24) {
                    int var25 = var24.field810 / 32 - Statics.field2302.field810 / 32;
                    int var26 = var24.field805 / 32 - Statics.field2302.field805 / 32;
                    boolean var27 = false;
                    if (method930(var24.field40, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field275; var29++) {
                        if (var24.field40.equals(Statics.field279[var29].field623)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field2302.field56 != 0 && var24.field56 != 0 && Statics.field2302.field56 == var24.field56) {
                        var30 = true;
                    }
                    if (var27) {
                        Statics.method75(arg1, arg2, var25, var26, Statics.field1909[3], var4);
                    } else if (var30) {
                        Statics.method75(arg1, arg2, var25, var26, Statics.field1909[4], var4);
                    } else if (var28) {
                        Statics.method75(arg1, arg2, var25, var26, Statics.field1909[5], var4);
                    } else {
                        Statics.method75(arg1, arg2, var25, var26, Statics.field1909[2], var4);
                    }
                }
            }
            if (field302 != 0 && field333 % 20 < 10) {
                if (field302 == 1 && field407 >= 0 && field407 < field321.length) {
                    class35 var31 = field321[field407];
                    if (var31 != null) {
                        int var32 = var31.field810 / 32 - Statics.field2302.field810 / 32;
                        int var33 = var31.field805 / 32 - Statics.field2302.field805 / 32;
                        method1456(arg1, arg2, var32, var33, Statics.field1095[1], var4);
                    }
                }
                if (field302 == 2) {
                    int var34 = field305 * 4 - Statics.field1566 * 4 + 2 - Statics.field2302.field810 / 32;
                    int var35 = field306 * 4 - Statics.field359 * 4 + 2 - Statics.field2302.field805 / 32;
                    method1456(arg1, arg2, var34, var35, Statics.field1095[1], var4);
                }
                if (field302 == 10 && field507 >= 0 && field507 < field406.length) {
                    class3 var36 = field406[field507];
                    if (var36 != null) {
                        int var37 = var36.field810 / 32 - Statics.field2302.field810 / 32;
                        int var38 = var36.field805 / 32 - Statics.field2302.field805 / 32;
                        method1456(arg1, arg2, var37, var38, Statics.field1095[1], var4);
                    }
                }
            }
            if (field546 != 0) {
                int var39 = field546 * 4 + 2 - Statics.field2302.field810 / 32;
                int var40 = field518 * 4 + 2 - Statics.field2302.field805 / 32;
                Statics.method75(arg1, arg2, var39, var40, Statics.field1095[0], var4);
            }
            if (!Statics.field2302.field57) {
                class80.method1666(var4.field2919 / 2 + arg1 - 1, var4.field2918 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field489[arg3] = true;
    }

    @ObfuscatedName("fh.dd(Lfr;IIIB)V")
    public static final void method2947(class174 arg0, int arg1, int arg2, int arg3) {
        class176 var4 = arg0.method3148(false);
        if (var4 == null) {
            return;
        }
        if (field550 < 3) {
            Statics.field2696.method1617(arg1, arg2, var4.field2919, var4.field2918, 25, 25, field303, 256, var4.field2921, var4.field2923);
        } else {
            class80.method1633(arg1, arg2, 0, var4.field2921, var4.field2923);
        }
    }

    @ObfuscatedName("bo.dr(IIIILcj;Lfv;I)V")
    public static final void method1456(int arg0, int arg1, int arg2, int arg3, class79 arg4, class176 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            Statics.method75(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field356 + field303 & 0x7FF;
        int var8 = class92.field1603[var7];
        int var9 = class92.field1604[var7];
        int var10 = var8 * 256 / (field358 + 256);
        int var11 = var9 * 256 / (field358 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field1036.method1554(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("am.dv(Ljava/lang/String;ZI)Z")
    public static boolean method930(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class165.method695(arg0, Statics.field1642);
        for (int var3 = 0; var3 < field419; var3++) {
            if (var2.equalsIgnoreCase(class165.method695(field552[var3].field240, Statics.field1642)) && (!arg1 || field552[var3].field250 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class165.method695(Statics.field2302.field40, Statics.field1642))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("n.dx(Ljava/lang/String;I)Z")
    public static boolean method193(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class165.method695(arg0, Statics.field1642);
        for (int var2 = 0; var2 < field554; var2++) {
            class8 var3 = field401[var2];
            if (var1.equalsIgnoreCase(class165.method695(var3.field136, Statics.field1642))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class165.method695(var3.field135, Statics.field1642))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("p.du(Ljava/lang/String;I)V")
    public static final void method120(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field419 < 200 || field452 == 1) || field419 >= 400) {
            class12.method683(30, "", class158.field2500);
            return;
        }
        String var1 = class165.method695(arg0, Statics.field1642);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field419; var2++) {
            class18 var3 = field552[var2];
            String var4 = class165.method695(var3.field240, Statics.field1642);
            if (var4 != null && var4.equals(var1)) {
                class12.method683(30, "", arg0 + class158.field2367);
                return;
            }
            if (var3.field239 != null) {
                String var5 = class165.method695(var3.field239, Statics.field1642);
                if (var5 != null && var5.equals(var1)) {
                    class12.method683(30, "", arg0 + class158.field2367);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field554; var6++) {
            class8 var7 = field401[var6];
            String var8 = class165.method695(var7.field136, Statics.field1642);
            if (var8 != null && var8.equals(var1)) {
                class12.method683(30, "", class158.field2506 + arg0 + class158.field2453);
                return;
            }
            if (var7.field135 != null) {
                String var9 = class165.method695(var7.field135, Statics.field1642);
                if (var9 != null && var9.equals(var1)) {
                    class12.method683(30, "", class158.field2506 + arg0 + class158.field2453);
                    return;
                }
            }
        }
        if (class165.method695(Statics.field2302.field40, Statics.field1642).equals(var1)) {
            class12.method683(30, "", class158.field2504);
        } else {
            field326.method2573(94);
            field326.method2293(class120.method2086(arg0));
            field326.method2426(arg0);
        }
    }

    @ObfuscatedName("ec.do(Ljava/lang/String;ZI)V")
    public static final void method2918(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field554 < 100 || field452 == 1) || field554 >= 400) {
            class12.method683(31, "", class158.field2502);
            return;
        }
        String var2 = class165.method695(arg0, Statics.field1642);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field554; var3++) {
            class8 var4 = field401[var3];
            String var5 = class165.method695(var4.field136, Statics.field1642);
            if (var5 != null && var5.equals(var2)) {
                class12.method683(31, "", arg0 + class158.field2503);
                return;
            }
            if (var4.field135 != null) {
                String var6 = class165.method695(var4.field135, Statics.field1642);
                if (var6 != null && var6.equals(var2)) {
                    class12.method683(31, "", arg0 + class158.field2503);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field419; var7++) {
            class18 var8 = field552[var7];
            String var9 = class165.method695(var8.field240, Statics.field1642);
            if (var9 != null && var9.equals(var2)) {
                class12.method683(31, "", class158.field2508 + arg0 + class158.field2509);
                return;
            }
            if (var8.field239 != null) {
                String var10 = class165.method695(var8.field239, Statics.field1642);
                if (var10 != null && var10.equals(var2)) {
                    class12.method683(31, "", class158.field2508 + arg0 + class158.field2509);
                    return;
                }
            }
        }
        if (class165.method695(Statics.field2302.field40, Statics.field1642).equals(var2)) {
            class12.method683(31, "", class158.field2505);
        } else {
            field326.method2573(188);
            field326.method2293(class120.method2086(arg0));
            field326.method2426(arg0);
        }
    }

    @ObfuscatedName("fu.df(Ljava/lang/String;I)V")
    public static final void method2923(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class165.method695(arg0, Statics.field1642);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field419; var2++) {
            class18 var3 = field552[var2];
            String var4 = var3.field240;
            String var5 = class165.method695(var4, Statics.field1642);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field419--;
                for (int var7 = var2; var7 < field419; var7++) {
                    field552[var7] = field552[var7 + 1];
                }
                field476 = field468;
                field326.method2573(251);
                field326.method2293(class120.method2086(arg0));
                field326.method2426(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("cs.dh(Ljava/lang/String;I)V")
    public static final void method1998(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class165.method695(arg0, Statics.field1642);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field554; var2++) {
            class8 var3 = field401[var2];
            String var4 = var3.field136;
            String var5 = class165.method695(var4, Statics.field1642);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field554--;
                for (int var7 = var2; var7 < field554; var7++) {
                    field401[var7] = field401[var7 + 1];
                }
                field476 = field468;
                field326.method2573(182);
                field326.method2293(class120.method2086(arg0));
                field326.method2426(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("u.dn(Ljava/lang/String;II)V")
    public static final void method157(String arg0, int arg1) {
        field326.method2573(3);
        field326.method2293(class120.method2086(arg0) + 1);
        field326.method2426(arg0);
        field326.method2434(arg1);
    }

    @ObfuscatedName("f.dy(Ljava/lang/String;S)V")
    public static final void method76(String arg0) {
        if (!arg0.equals("")) {
            field326.method2573(93);
            field326.method2293(class120.method2086(arg0));
            field326.method2426(arg0);
        }
    }

    @ObfuscatedName("cd.dl(I)V")
    public static final void method2094() {
        field326.method2573(93);
        field326.method2293(0);
    }

    @ObfuscatedName("ep.eg(Lfr;I)I")
    public static int method2739(class174 arg0) {
        class202 var1 = (class202) field429.method3485(((long) arg0.field2777 << 32) + (long) arg0.field2778);
        return var1 == null ? arg0.field2818 : var1.field3112;
    }

    @ObfuscatedName("b.es(Lfr;I)Z")
    public static boolean method137(class174 arg0) {
        if (field453) {
            if (method2739(arg0) != 0) {
                return false;
            }
            if (arg0.field2779 == 0) {
                return false;
            }
        }
        return arg0.field2876;
    }

    @ObfuscatedName("ch.em(Lfr;IB)Ljava/lang/String;")
    public static String method1724(class174 arg0, int arg1) {
        int var2 = method2739(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2848 == null) {
            return null;
        } else if (arg0.field2851 == null || arg0.field2851.length <= arg1 || arg0.field2851[arg1] == null || arg0.field2851[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2851[arg1];
        }
    }

    @ObfuscatedName("u.et(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method158(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field385 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field385 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field385 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field385 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field385 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field290 != null) {
            var3 = "/p=" + Statics.field290;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field289 + "/a=" + Statics.field132 + var3 + "/";
    }
}

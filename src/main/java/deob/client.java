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
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class145 {

    @ObfuscatedName("client.j")
    public static boolean field286 = true;

    @ObfuscatedName("client.d")
    public static int field287 = 1;

    @ObfuscatedName("client.r")
    public static int field478 = 0;

    @ObfuscatedName("client.l")
    public static int field549 = 0;

    @ObfuscatedName("client.n")
    public static boolean field291 = false;

    @ObfuscatedName("client.w")
    public static class109[] field292 = new class109[4];

    @ObfuscatedName("client.z")
    public static boolean field384 = false;

    @ObfuscatedName("client.k")
    public static int field293 = 0;

    @ObfuscatedName("client.a")
    public static int field295 = 0;

    @ObfuscatedName("client.f")
    public static boolean field296 = true;

    @ObfuscatedName("client.q")
    public static int field297 = 0;

    @ObfuscatedName("client.m")
    public static long field298 = -1L;

    @ObfuscatedName("client.i")
    public static int field334 = -1;

    @ObfuscatedName("client.e")
    public static int field300 = -1;

    @ObfuscatedName("client.aw")
    public static int field301 = -1;

    @ObfuscatedName("client.an")
    public static boolean field302 = true;

    @ObfuscatedName("client.ag")
    public static boolean field303 = false;

    @ObfuscatedName("client.ae")
    public static int field520 = 0;

    @ObfuscatedName("client.aj")
    public static int field324 = 0;

    @ObfuscatedName("client.ah")
    public static int field306 = 0;

    @ObfuscatedName("client.af")
    public static int field307 = 0;

    @ObfuscatedName("client.az")
    public static int field308 = 0;

    @ObfuscatedName("client.ax")
    public static int field309 = 0;

    @ObfuscatedName("client.ac")
    public static int field310 = 0;

    @ObfuscatedName("client.ar")
    public static int field311 = 0;

    @ObfuscatedName("client.aq")
    public static int field459 = 0;

    @ObfuscatedName("client.as")
    public static class21 field313 = class21.field575;

    @ObfuscatedName("client.ak")
    public static class21 field314 = class21.field575;

    @ObfuscatedName("client.av")
    public static int field315 = 0;

    @ObfuscatedName("client.ab")
    public static int field316 = 0;

    @ObfuscatedName("client.ai")
    public static int field317 = 0;

    @ObfuscatedName("client.bv")
    public static int field299 = 0;

    @ObfuscatedName("client.bn")
    public static int field483 = 0;

    @ObfuscatedName("client.bw")
    public static int field346 = 0;

    @ObfuscatedName("client.bo")
    public static int field567 = 0;

    @ObfuscatedName("client.bq")
    public static int field469 = 0;

    @ObfuscatedName("client.cp")
    public static class35[] field327 = new class35[32768];

    @ObfuscatedName("client.cr")
    public static int field450 = 0;

    @ObfuscatedName("client.cs")
    public static int[] field319 = new int[32768];

    @ObfuscatedName("client.cc")
    public static int field463 = 0;

    @ObfuscatedName("client.cl")
    public static int[] field331 = new int[250];

    @ObfuscatedName("client.cu")
    public static class123 field332 = new class123(5000);

    @ObfuscatedName("client.cj")
    public static class123 field480 = new class123(5000);

    @ObfuscatedName("client.cy")
    public static class123 field333 = new class123(15000);

    @ObfuscatedName("client.cq")
    public static int field335 = 0;

    @ObfuscatedName("client.cf")
    public static int field336 = 0;

    @ObfuscatedName("client.ce")
    public static int field442 = 0;

    @ObfuscatedName("client.cn")
    public static int field338 = 0;

    @ObfuscatedName("client.ct")
    public static int field339 = 0;

    @ObfuscatedName("client.cz")
    public static int field407 = 0;

    @ObfuscatedName("client.cv")
    public static int field541 = 0;

    @ObfuscatedName("client.ca")
    public static int field400 = 0;

    @ObfuscatedName("client.cd")
    public static boolean field343 = false;

    @ObfuscatedName("client.dr")
    public static int field555 = 0;

    @ObfuscatedName("client.dn")
    public static int field381 = 1;

    @ObfuscatedName("client.dx")
    public static int field347 = 0;

    @ObfuscatedName("client.dl")
    public static int field288 = 1;

    @ObfuscatedName("client.dm")
    public static int field349 = 0;

    @ObfuscatedName("client.du")
    public static boolean field569 = false;

    @ObfuscatedName("client.dz")
    public static int[][][] field352 = new int[4][13][13];

    @ObfuscatedName("client.da")
    public static final int[] field370 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dp")
    public static int field445 = 0;

    @ObfuscatedName("client.dy")
    public static int field344 = 2;

    @ObfuscatedName("client.dj")
    public static int field524 = 0;

    @ObfuscatedName("client.dg")
    public static int field414 = 2;

    @ObfuscatedName("client.dk")
    public static int field358 = 0;

    @ObfuscatedName("client.eh")
    public static int field373 = 1;

    @ObfuscatedName("client.ei")
    public static int field412 = 0;

    @ObfuscatedName("client.ej")
    public static int field361 = 0;

    @ObfuscatedName("client.eo")
    public static int field362 = 2;

    @ObfuscatedName("client.el")
    public static int field559 = 0;

    @ObfuscatedName("client.ef")
    public static int field364 = 1;

    @ObfuscatedName("client.ed")
    public static int field365 = 0;

    @ObfuscatedName("client.ex")
    public static int field539 = 0;

    @ObfuscatedName("client.en")
    public static int field367 = 2301979;

    @ObfuscatedName("client.em")
    public static int field368 = 5063219;

    @ObfuscatedName("client.et")
    public static int field369 = 3353893;

    @ObfuscatedName("client.eu")
    public static int field326 = 7759444;

    @ObfuscatedName("client.ec")
    public static boolean field371 = false;

    @ObfuscatedName("client.fm")
    public static int field534 = 0;

    @ObfuscatedName("client.fp")
    public static int field404 = 128;

    @ObfuscatedName("client.fc")
    public static int field323 = 0;

    @ObfuscatedName("client.fz")
    public static int field376 = 0;

    @ObfuscatedName("client.fk")
    public static int field377 = 0;

    @ObfuscatedName("client.fn")
    public static int field391 = 0;

    @ObfuscatedName("client.fl")
    public static int field379 = 0;

    @ObfuscatedName("client.fw")
    public static int field380 = 50;

    @ObfuscatedName("client.fs")
    public static int field383 = 0;

    @ObfuscatedName("client.fu")
    public static boolean field382 = false;

    @ObfuscatedName("client.fb")
    public static int field451 = 0;

    @ObfuscatedName("client.ft")
    public static int field490 = 0;

    @ObfuscatedName("client.fi")
    public static int field385 = 50;

    @ObfuscatedName("client.ff")
    public static int[] field386 = new int[field385];

    @ObfuscatedName("client.fr")
    public static int[] field387 = new int[field385];

    @ObfuscatedName("client.fx")
    public static int[] field456 = new int[field385];

    @ObfuscatedName("client.fv")
    public static int[] field389 = new int[field385];

    @ObfuscatedName("client.fy")
    public static int[] field390 = new int[field385];

    @ObfuscatedName("client.fh")
    public static int[] field458 = new int[field385];

    @ObfuscatedName("client.gr")
    public static int[] field392 = new int[field385];

    @ObfuscatedName("client.go")
    public static String[] field393 = new String[field385];

    @ObfuscatedName("client.gg")
    public static int[][] field394 = new int[104][104];

    @ObfuscatedName("client.gc")
    public static int field566 = 0;

    @ObfuscatedName("client.gn")
    public static int field396 = -1;

    @ObfuscatedName("client.ge")
    public static int field545 = -1;

    @ObfuscatedName("client.gw")
    public static int field398 = 0;

    @ObfuscatedName("client.gj")
    public static int field399 = 0;

    @ObfuscatedName("client.gz")
    public static int field305 = 0;

    @ObfuscatedName("client.gy")
    public static int field401 = 0;

    @ObfuscatedName("client.gi")
    public static int field402 = 0;

    @ObfuscatedName("client.gu")
    public static int field403 = 0;

    @ObfuscatedName("client.gb")
    public static int field348 = 0;

    @ObfuscatedName("client.gd")
    public static int field405 = 0;

    @ObfuscatedName("client.gt")
    public static int field406 = 0;

    @ObfuscatedName("client.gq")
    public static int field321 = 0;

    @ObfuscatedName("client.gp")
    public static boolean field408 = false;

    @ObfuscatedName("client.gv")
    public static int field409 = 0;

    @ObfuscatedName("client.gk")
    public static int field410 = 0;

    @ObfuscatedName("client.gf")
    public static class3[] field411 = new class3[2048];

    @ObfuscatedName("client.gx")
    public static int field431 = -1;

    @ObfuscatedName("client.hk")
    public static int field413 = 0;

    @ObfuscatedName("client.hd")
    public static int field345 = 0;

    @ObfuscatedName("client.hq")
    public static int[] field415 = new int[1000];

    @ObfuscatedName("client.hl")
    public static final int[] field416 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hn")
    public static String[] field417 = new String[8];

    @ObfuscatedName("client.hs")
    public static boolean[] field418 = new boolean[8];

    @ObfuscatedName("client.ho")
    public static int[] field419 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hb")
    public static int field330 = -1;

    @ObfuscatedName("client.hj")
    public static class200[][][] field421 = new class200[4][104][104];

    @ObfuscatedName("client.hg")
    public static class200 field422 = new class200();

    @ObfuscatedName("client.hp")
    public static class200 field423 = new class200();

    @ObfuscatedName("client.hf")
    public static class200 field424 = new class200();

    @ObfuscatedName("client.hw")
    public static int[] field357 = new int[25];

    @ObfuscatedName("client.hv")
    public static int[] field426 = new int[25];

    @ObfuscatedName("client.hx")
    public static int[] field427 = new int[25];

    @ObfuscatedName("client.hc")
    public static int field428 = 0;

    @ObfuscatedName("client.hi")
    public static boolean field429 = false;

    @ObfuscatedName("client.hm")
    public static int field430 = 0;

    @ObfuscatedName("client.hu")
    public static int[] field420 = new int[500];

    @ObfuscatedName("client.if")
    public static int[] field432 = new int[500];

    @ObfuscatedName("client.ij")
    public static int[] field433 = new int[500];

    @ObfuscatedName("client.ii")
    public static int[] field434 = new int[500];

    @ObfuscatedName("client.im")
    public static String[] field435 = new String[500];

    @ObfuscatedName("client.is")
    public static String[] field397 = new String[500];

    @ObfuscatedName("client.id")
    public static int field437 = -1;

    @ObfuscatedName("client.ic")
    public static int field438 = -1;

    @ObfuscatedName("client.ih")
    public static int field519 = 0;

    @ObfuscatedName("client.iq")
    public static int field322 = 50;

    @ObfuscatedName("client.io")
    public static int field353 = 0;

    @ObfuscatedName("client.ik")
    public static String field350 = null;

    @ObfuscatedName("client.it")
    public static boolean field443 = false;

    @ObfuscatedName("client.iu")
    public static int field444 = -1;

    @ObfuscatedName("client.iv")
    public static int field320 = -1;

    @ObfuscatedName("client.in")
    public static String field446 = null;

    @ObfuscatedName("client.ie")
    public static String field447 = null;

    @ObfuscatedName("client.ir")
    public static int field457 = -1;

    @ObfuscatedName("client.ip")
    public static class197 field449 = new class197(8);

    @ObfuscatedName("client.jj")
    public static int field378 = 0;

    @ObfuscatedName("client.jk")
    public static int field363 = 0;

    @ObfuscatedName("client.jn")
    public static class174 field452 = null;

    @ObfuscatedName("client.jy")
    public static int field453 = 0;

    @ObfuscatedName("client.jx")
    public static int field454 = 0;

    @ObfuscatedName("client.jz")
    public static int field355 = 0;

    @ObfuscatedName("client.jh")
    public static int field375 = -1;

    @ObfuscatedName("client.jg")
    public static boolean field455 = false;

    @ObfuscatedName("client.jd")
    public static boolean field337 = false;

    @ObfuscatedName("client.ju")
    public static boolean field440 = false;

    @ObfuscatedName("client.ja")
    public static class174 field460 = null;

    @ObfuscatedName("client.ji")
    public static class174 field461 = null;

    @ObfuscatedName("client.jt")
    public static class174 field462 = null;

    @ObfuscatedName("client.jq")
    public static int field561 = 0;

    @ObfuscatedName("client.js")
    public static int field464 = 0;

    @ObfuscatedName("client.je")
    public static class174 field465 = null;

    @ObfuscatedName("client.jr")
    public static boolean field466 = false;

    @ObfuscatedName("client.jo")
    public static int field441 = -1;

    @ObfuscatedName("client.jv")
    public static int field448 = -1;

    @ObfuscatedName("client.jw")
    public static boolean field342 = false;

    @ObfuscatedName("client.jf")
    public static int field439 = -1;

    @ObfuscatedName("client.jl")
    public static int field471 = -1;

    @ObfuscatedName("client.jb")
    public static boolean field546 = false;

    @ObfuscatedName("client.kc")
    public static int field360 = 1;

    @ObfuscatedName("client.kg")
    public static int[] field474 = new int[32];

    @ObfuscatedName("client.ko")
    public static int field475 = 0;

    @ObfuscatedName("client.kr")
    public static int[] field476 = new int[32];

    @ObfuscatedName("client.ks")
    public static int field477 = 0;

    @ObfuscatedName("client.ky")
    public static int[] field472 = new int[32];

    @ObfuscatedName("client.kb")
    public static int field468 = 0;

    @ObfuscatedName("client.kq")
    public static int field436 = 0;

    @ObfuscatedName("client.ki")
    public static int field493 = 0;

    @ObfuscatedName("client.kn")
    public static int field289 = 0;

    @ObfuscatedName("client.km")
    public static int field328 = 0;

    @ObfuscatedName("client.kz")
    public static int field484 = 0;

    @ObfuscatedName("client.ke")
    public static int field485 = 0;

    @ObfuscatedName("client.kp")
    public static int field486 = 0;

    @ObfuscatedName("client.kd")
    public static class200 field487 = new class200();

    @ObfuscatedName("client.kh")
    public static class200 field488 = new class200();

    @ObfuscatedName("client.ka")
    public static class200 field489 = new class200();

    @ObfuscatedName("client.ku")
    public static class197 field312 = new class197(512);

    @ObfuscatedName("client.kk")
    public static int field491 = 0;

    @ObfuscatedName("client.kv")
    public static int field492 = -2;

    @ObfuscatedName("client.lz")
    public static boolean[] field508 = new boolean[100];

    @ObfuscatedName("client.lp")
    public static boolean[] field284 = new boolean[100];

    @ObfuscatedName("client.lq")
    public static boolean[] field495 = new boolean[100];

    @ObfuscatedName("client.lt")
    public static int[] field496 = new int[100];

    @ObfuscatedName("client.lr")
    public static int[] field497 = new int[100];

    @ObfuscatedName("client.lb")
    public static int[] field498 = new int[100];

    @ObfuscatedName("client.ld")
    public static int[] field499 = new int[100];

    @ObfuscatedName("client.lc")
    public static int field500 = 0;

    @ObfuscatedName("client.lf")
    public static long field501 = 0L;

    @ObfuscatedName("client.la")
    public static boolean field502 = true;

    @ObfuscatedName("client.le")
    public static int field503 = 765;

    @ObfuscatedName("client.lg")
    public static int field354 = 1;

    @ObfuscatedName("client.lw")
    public static int[] field563 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ls")
    public static int field356 = 0;

    @ObfuscatedName("client.lo")
    public static int field507 = 0;

    @ObfuscatedName("client.ln")
    public static String field504 = "";

    @ObfuscatedName("client.lk")
    public static long[] field351 = new long[100];

    @ObfuscatedName("client.lm")
    public static int field510 = 0;

    @ObfuscatedName("client.lu")
    public static int field511 = 0;

    @ObfuscatedName("client.mu")
    public static int[] field512 = new int[128];

    @ObfuscatedName("client.mm")
    public static int[] field513 = new int[128];

    @ObfuscatedName("client.mz")
    public static long field506 = -1L;

    @ObfuscatedName("client.my")
    public static String field515 = null;

    @ObfuscatedName("client.mf")
    public static String field516 = null;

    @ObfuscatedName("client.mn")
    public static int field304 = -1;

    @ObfuscatedName("client.mj")
    public static int field374 = 0;

    @ObfuscatedName("client.mg")
    public static int[] field294 = new int[1000];

    @ObfuscatedName("client.mq")
    public static int[] field388 = new int[1000];

    @ObfuscatedName("client.mo")
    public static class79[] field521 = new class79[1000];

    @ObfuscatedName("client.mw")
    public static int field522 = 0;

    @ObfuscatedName("client.mr")
    public static int field523 = 0;

    @ObfuscatedName("client.mi")
    public static int field494 = 0;

    @ObfuscatedName("client.ma")
    public static int field525 = 255;

    @ObfuscatedName("client.mc")
    public static int field526 = -1;

    @ObfuscatedName("client.mx")
    public static boolean field527 = false;

    @ObfuscatedName("client.np")
    public static int field528 = 127;

    @ObfuscatedName("client.nv")
    public static int field366 = 127;

    @ObfuscatedName("client.nd")
    public static int field505 = 0;

    @ObfuscatedName("client.nm")
    public static int[] field531 = new int[50];

    @ObfuscatedName("client.nj")
    public static int[] field532 = new int[50];

    @ObfuscatedName("client.nc")
    public static int[] field533 = new int[50];

    @ObfuscatedName("client.ng")
    public static int[] field481 = new int[50];

    @ObfuscatedName("client.nn")
    public static class59[] field535 = new class59[50];

    @ObfuscatedName("client.ns")
    public static boolean field536 = false;

    @ObfuscatedName("client.or")
    public static boolean[] field537 = new boolean[5];

    @ObfuscatedName("client.on")
    public static int[] field482 = new int[5];

    @ObfuscatedName("client.og")
    public static int[] field530 = new int[5];

    @ObfuscatedName("client.oq")
    public static int[] field540 = new int[5];

    @ObfuscatedName("client.op")
    public static int[] field325 = new int[5];

    @ObfuscatedName("client.ou")
    public static short field542 = 256;

    @ObfuscatedName("client.os")
    public static short field543 = 205;

    @ObfuscatedName("client.ox")
    public static short field544 = 256;

    @ObfuscatedName("client.oz")
    public static short field538 = 320;

    @ObfuscatedName("client.oa")
    public static short field548 = 1;

    @ObfuscatedName("client.oj")
    public static short field547 = 32767;

    @ObfuscatedName("client.ot")
    public static short field329 = 1;

    @ObfuscatedName("client.om")
    public static short field517 = 32767;

    @ObfuscatedName("client.ok")
    public static int field550 = 0;

    @ObfuscatedName("client.oh")
    public static int field551 = 0;

    @ObfuscatedName("client.oo")
    public static int field552 = 0;

    @ObfuscatedName("client.of")
    public static int field553 = 0;

    @ObfuscatedName("client.ol")
    public static int field554 = 0;

    @ObfuscatedName("client.oe")
    public static int field341 = 0;

    @ObfuscatedName("client.oc")
    public static int field556 = 0;

    @ObfuscatedName("client.ow")
    public static class18[] field557 = new class18[400];

    @ObfuscatedName("client.ob")
    public static class196 field558 = new class196();

    @ObfuscatedName("client.oy")
    public static int field514 = 0;

    @ObfuscatedName("client.ov")
    public static class8[] field560 = new class8[400];

    @ObfuscatedName("client.pu")
    public static class180 field340 = new class180();

    @ObfuscatedName("client.po")
    public static int field562 = -1;

    @ObfuscatedName("client.pz")
    public static int field518 = -1;

    @ObfuscatedName("client.pq")
    public static class221[] field529 = new class221[8];

    @ObfuscatedName("client.pf")
    public static long field565 = -1L;

    @ObfuscatedName("client.ph")
    public static long field425 = -1L;

    @ObfuscatedName("client.pj")
    public static final class11 field395 = new class11();

    @ObfuscatedName("client.pi")
    public static int[] field568 = new int[50];

    @ObfuscatedName("client.px")
    public static int[] field470 = new int[50];

    @ObfuscatedName("client.d(B)V")
    public final void method323() {
    }

    public final void init() {
        if (!this.method2901()) {
            return;
        }
        class191[] var1 = new class191[] { class191.field3062, class191.field3050, class191.field3053, class191.field3063, class191.field3052, class191.field3051, class191.field3057, class191.field3056, class191.field3064, class191.field3054, class191.field3058, class191.field3060, class191.field3059, class191.field3055, class191.field3061 };
        class191[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class191 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3065);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3065)) {
                    case 1:
                        field549 = Integer.parseInt(var5);
                        break;
                    case 2:
                        Statics.field1019 = Integer.parseInt(var5);
                    case 3:
                    case 6:
                    case 14:
                    default:
                        break;
                    case 4:
                        field293 = Integer.parseInt(var5);
                        break;
                    case 5:
                        if (var5.equalsIgnoreCase(class2.field22)) {
                            field291 = true;
                        } else {
                            field291 = false;
                        }
                        break;
                    case 7:
                        Statics.field1635 = var5;
                        break;
                    case 8:
                        class155[] var6 = new class155[] { class155.field2273, class155.field2271, class155.field2278, class155.field2272, class155.field2269, class155.field2270 };
                        Statics.field571 = (class155) class110.method2955(var6, Integer.parseInt(var5));
                        if (Statics.field571 == class155.field2278) {
                            Statics.field290 = class213.field3143;
                        } else {
                            Statics.field290 = class213.field3139;
                        }
                        break;
                    case 9:
                        int var7 = Integer.parseInt(var5);
                        class154[] var8 = class154.method1049();
                        int var9 = 0;
                        class154 var11;
                        while (true) {
                            if (var9 >= var8.length) {
                                var11 = null;
                                break;
                            }
                            class154 var10 = var8[var9];
                            if (var10.field2262 == var7) {
                                var11 = var10;
                                break;
                            }
                            var9++;
                        }
                        Statics.field2021 = var11;
                        break;
                    case 10:
                        field478 = Integer.parseInt(var5);
                        break;
                    case 11:
                        Statics.field564 = var5;
                        break;
                    case 12:
                        field287 = Integer.parseInt(var5);
                        break;
                    case 13:
                        if (var5.equalsIgnoreCase(class2.field22)) {
                        }
                        break;
                    case 15:
                        Statics.field255 = Integer.parseInt(var5);
                }
            }
        }
        class87.field1479 = false;
        field384 = false;
        Statics.field1003 = this.getCodeBase().getHost();
        String var12 = Statics.field2021.field2261;
        byte var13 = 0;
        try {
            class150.method36("oldschool", var12, var13, 16);
        } catch (Exception var15) {
            class149.method93((String) null, var15);
        }
        Statics.field285 = this;
        this.method2907(765, 503, 116);
    }

    @ObfuscatedName("client.y(I)V")
    public final void method227() {
        Statics.field201 = field549 == 0 ? 43594 : field287 + 40000;
        Statics.field473 = field549 == 0 ? 443 : field287 + 50000;
        Statics.field240 = Statics.field201;
        Statics.field2918 = class175.field2884;
        Statics.field761 = class175.field2885;
        Statics.field2923 = class175.field2886;
        Statics.field2920 = class175.field2888;
        if (Statics.field660.toLowerCase().indexOf("microsoft") == -1) {
            class138.field2108[44] = 71;
            class138.field2108[45] = 26;
            class138.field2108[46] = 72;
            class138.field2108[47] = 73;
            class138.field2108[59] = 57;
            class138.field2108[61] = 27;
            class138.field2108[91] = 42;
            class138.field2108[92] = 74;
            class138.field2108[93] = 43;
            class138.field2108[192] = 28;
            class138.field2108[222] = 58;
            class138.field2108[520] = 59;
        } else {
            class138.field2108[186] = 57;
            class138.field2108[187] = 27;
            class138.field2108[188] = 71;
            class138.field2108[189] = 26;
            class138.field2108[190] = 72;
            class138.field2108[191] = 73;
            class138.field2108[192] = 58;
            class138.field2108[219] = 42;
            class138.field2108[220] = 74;
            class138.field2108[221] = 43;
            class138.field2108[222] = 59;
            class138.field2108[223] = 28;
        }
        Canvas var1 = Statics.field1041;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class138.field2082);
        var1.addFocusListener(class138.field2082);
        class141.method648(Statics.field1041);
        Statics.field1747 = class132.method2984();
        if (Statics.field1747 != null) {
            Statics.field1747.method2696(Statics.field1041);
        }
        Statics.field1645 = new class135(255, class150.field2221, class150.field2222, 500000);
        Statics.field2638 = class9.method845();
        Statics.field1147 = this.getToolkit().getSystemClipboard();
        class139.method2266(this, Statics.field1023);
        if (field549 != 0) {
            field303 = true;
        }
        method1489(Statics.field2638.field132);
    }

    @ObfuscatedName("client.r(I)V")
    public final void method298() {
        field297++;
        this.method231();
        while (true) {
            class200 var1 = class171.field2705;
            class170 var2;
            synchronized (class171.field2705) {
                var2 = (class170) class171.field2703.method3564();
            }
            if (var2 == null) {
                try {
                    if (class184.field2954 == 1) {
                        int var4 = Statics.field2953.method3373();
                        if (var4 > 0 && Statics.field2953.method3456()) {
                            int var5 = var4 - Statics.field2956;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2953.method3372(var5);
                        } else {
                            Statics.field2953.method3378();
                            Statics.field2953.method3376();
                            if (Statics.field1076 == null) {
                                class184.field2954 = 0;
                            } else {
                                class184.field2954 = 2;
                            }
                            Statics.field1 = null;
                            Statics.field2907 = null;
                        }
                    }
                } catch (Exception var569) {
                    var569.printStackTrace();
                    Statics.field2953.method3378();
                    class184.field2954 = 0;
                    Statics.field1 = null;
                    Statics.field2907 = null;
                    Statics.field1076 = null;
                }
                method2654();
                class138.method3();
                class141 var7 = class141.field2132;
                synchronized (class141.field2132) {
                    class141.field2134 = class141.field2131;
                    class141.field2135 = class141.field2133;
                    class141.field2136 = class141.field2137;
                    class141.field2141 = class141.field2129;
                    class141.field2142 = class141.field2138;
                    class141.field2143 = class141.field2139;
                    class141.field2144 = class141.field2140;
                    class141.field2129 = 0;
                }
                if (Statics.field1747 != null) {
                    int var9 = Statics.field1747.method2691();
                    field486 = var9;
                }
                if (field295 == 0) {
                    method3218();
                    Statics.field1889.method2714();
                    for (int var10 = 0; var10 < 32; var10++) {
                        field2179[var10] = 0L;
                    }
                    for (int var11 = 0; var11 < 32; var11++) {
                        field2184[var11] = 0L;
                    }
                    Statics.field254 = 0;
                } else if (field295 == 5) {
                    class32.method2262(this);
                    method3218();
                    Statics.field1889.method2714();
                    for (int var12 = 0; var12 < 32; var12++) {
                        field2179[var12] = 0L;
                    }
                    for (int var13 = 0; var13 < 32; var13++) {
                        field2184[var13] = 0L;
                    }
                    Statics.field254 = 0;
                } else if (field295 == 10 || field295 == 11) {
                    class32.method2262(this);
                } else if (field295 == 20) {
                    class32.method2262(this);
                    method2935();
                } else if (field295 == 25) {
                    method156(false);
                    field555 = 0;
                    boolean var14 = true;
                    for (int var15 = 0; var15 < Statics.field200.length; var15++) {
                        if (Statics.field1185[var15] != -1 && Statics.field200[var15] == null) {
                            Statics.field200[var15] = Statics.field772.method3037(Statics.field1185[var15], 0);
                            if (Statics.field200[var15] == null) {
                                var14 = false;
                                field555++;
                            }
                        }
                        if (Statics.field1644[var15] != -1 && Statics.field2955[var15] == null) {
                            Statics.field2955[var15] = Statics.field772.method3038(Statics.field1644[var15], 0, Statics.field3164[var15]);
                            if (Statics.field2955[var15] == null) {
                                var14 = false;
                                field555++;
                            }
                        }
                    }
                    if (var14) {
                        field347 = 0;
                        boolean var16 = true;
                        for (int var17 = 0; var17 < Statics.field200.length; var17++) {
                            byte[] var18 = Statics.field2955[var17];
                            if (var18 != null) {
                                int var19 = (Statics.field2154[var17] >> 8) * 64 - Statics.field63;
                                int var20 = (Statics.field2154[var17] & 0xFF) * 64 - Statics.field1435;
                                if (field569) {
                                    var19 = 10;
                                    var20 = 10;
                                }
                                var16 &= class6.method163(var18, var19, var20);
                            }
                        }
                        if (var16) {
                            if (field349 != 0) {
                                method953(class158.field2307 + class2.field23 + class2.field20 + 100 + "%" + class2.field21, true);
                            }
                            method2654();
                            method2046();
                            method2654();
                            Statics.field2231.method1862();
                            method2654();
                            System.gc();
                            for (int var21 = 0; var21 < 4; var21++) {
                                field292[var21].method2252();
                            }
                            for (int var22 = 0; var22 < 4; var22++) {
                                for (int var23 = 0; var23 < 104; var23++) {
                                    for (int var24 = 0; var24 < 104; var24++) {
                                        class6.field70[var22][var23][var24] = 0;
                                    }
                                }
                            }
                            method2654();
                            class6.method3163();
                            int var25 = Statics.field200.length;
                            class24.method2044();
                            method156(true);
                            if (!field569) {
                                int var26 = 0;
                                label3413: while (true) {
                                    if (var26 >= var25) {
                                        for (int var40 = 0; var40 < var25; var40++) {
                                            int var41 = (Statics.field2154[var40] >> 8) * 64 - Statics.field63;
                                            int var42 = (Statics.field2154[var40] & 0xFF) * 64 - Statics.field1435;
                                            byte[] var43 = Statics.field200[var40];
                                            if (var43 == null && Statics.field372 < 800) {
                                                method2654();
                                                class6.method172(var41, var42, 64, 64);
                                            }
                                        }
                                        method156(true);
                                        int var44 = 0;
                                        while (true) {
                                            if (var44 >= var25) {
                                                break label3413;
                                            }
                                            byte[] var45 = Statics.field2955[var44];
                                            if (var45 != null) {
                                                int var46 = (Statics.field2154[var44] >> 8) * 64 - Statics.field63;
                                                int var47 = (Statics.field2154[var44] & 0xFF) * 64 - Statics.field1435;
                                                method2654();
                                                class87 var48 = Statics.field2231;
                                                class109[] var49 = field292;
                                                class120 var50 = new class120(var45);
                                                int var51 = -1;
                                                while (true) {
                                                    int var52 = var50.method2472();
                                                    if (var52 == 0) {
                                                        break;
                                                    }
                                                    var51 += var52;
                                                    int var53 = 0;
                                                    while (true) {
                                                        int var54 = var50.method2472();
                                                        if (var54 == 0) {
                                                            break;
                                                        }
                                                        var53 += var54 - 1;
                                                        int var55 = var53 & 0x3F;
                                                        int var56 = var53 >> 6 & 0x3F;
                                                        int var57 = var53 >> 12;
                                                        int var58 = var50.method2344();
                                                        int var59 = var58 >> 2;
                                                        int var60 = var58 & 0x3;
                                                        int var61 = var46 + var56;
                                                        int var62 = var47 + var55;
                                                        if (var61 > 0 && var62 > 0 && var61 < 103 && var62 < 103) {
                                                            int var63 = var57;
                                                            if ((class6.field70[1][var61][var62] & 0x2) == 2) {
                                                                var63 = var57 - 1;
                                                            }
                                                            class109 var64 = null;
                                                            if (var63 >= 0) {
                                                                var64 = var49[var63];
                                                            }
                                                            class6.method9(var57, var61, var62, var51, var60, var59, var48, var64);
                                                        }
                                                    }
                                                }
                                            }
                                            var44++;
                                        }
                                    }
                                    int var27 = (Statics.field2154[var26] >> 8) * 64 - Statics.field63;
                                    int var28 = (Statics.field2154[var26] & 0xFF) * 64 - Statics.field1435;
                                    byte[] var29 = Statics.field200[var26];
                                    if (var29 != null) {
                                        method2654();
                                        int var30 = Statics.field2266 * 8 - 48;
                                        int var31 = Statics.field372 * 8 - 48;
                                        class109[] var32 = field292;
                                        int var33 = 0;
                                        label3410: while (true) {
                                            if (var33 >= 4) {
                                                class120 var36 = new class120(var29);
                                                int var37 = 0;
                                                while (true) {
                                                    if (var37 >= 4) {
                                                        break label3410;
                                                    }
                                                    for (int var38 = 0; var38 < 64; var38++) {
                                                        for (int var39 = 0; var39 < 64; var39++) {
                                                            class6.method3229(var36, var37, var27 + var38, var28 + var39, var30, var31, 0);
                                                        }
                                                    }
                                                    var37++;
                                                }
                                            }
                                            for (int var34 = 0; var34 < 64; var34++) {
                                                for (int var35 = 0; var35 < 64; var35++) {
                                                    if (var27 + var34 > 0 && var27 + var34 < 103 && var28 + var35 > 0 && var28 + var35 < 103) {
                                                        var32[var33].field1885[var27 + var34][var28 + var35] &= 0xFEFFFFFF;
                                                    }
                                                }
                                            }
                                            var33++;
                                        }
                                    }
                                    var26++;
                                }
                            }
                            if (field569) {
                                int var65 = 0;
                                label3346: while (true) {
                                    if (var65 >= 4) {
                                        for (int var88 = 0; var88 < 13; var88++) {
                                            for (int var89 = 0; var89 < 13; var89++) {
                                                int var90 = field352[0][var88][var89];
                                                if (var90 == -1) {
                                                    class6.method172(var88 * 8, var89 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method156(true);
                                        int var91 = 0;
                                        while (true) {
                                            if (var91 >= 4) {
                                                break label3346;
                                            }
                                            method2654();
                                            for (int var92 = 0; var92 < 13; var92++) {
                                                label3269: for (int var93 = 0; var93 < 13; var93++) {
                                                    int var94 = field352[var91][var92][var93];
                                                    if (var94 != -1) {
                                                        int var95 = var94 >> 24 & 0x3;
                                                        int var96 = var94 >> 1 & 0x3;
                                                        int var97 = var94 >> 14 & 0x3FF;
                                                        int var98 = var94 >> 3 & 0x7FF;
                                                        int var99 = (var97 / 8 << 8) + var98 / 8;
                                                        for (int var100 = 0; var100 < Statics.field2154.length; var100++) {
                                                            if (Statics.field2154[var100] == var99 && Statics.field2955[var100] != null) {
                                                                byte[] var101 = Statics.field2955[var100];
                                                                int var102 = var92 * 8;
                                                                int var103 = var93 * 8;
                                                                int var104 = (var97 & 0x7) * 8;
                                                                int var105 = (var98 & 0x7) * 8;
                                                                class87 var106 = Statics.field2231;
                                                                class109[] var107 = field292;
                                                                class120 var108 = new class120(var101);
                                                                int var109 = -1;
                                                                while (true) {
                                                                    int var110 = var108.method2472();
                                                                    if (var110 == 0) {
                                                                        continue label3269;
                                                                    }
                                                                    var109 += var110;
                                                                    int var111 = 0;
                                                                    while (true) {
                                                                        int var112 = var108.method2472();
                                                                        if (var112 == 0) {
                                                                            break;
                                                                        }
                                                                        var111 += var112 - 1;
                                                                        int var113 = var111 & 0x3F;
                                                                        int var114 = var111 >> 6 & 0x3F;
                                                                        int var115 = var111 >> 12;
                                                                        int var116 = var108.method2344();
                                                                        int var117 = var116 >> 2;
                                                                        int var118 = var116 & 0x3;
                                                                        if (var95 == var115 && var114 >= var104 && var114 < var104 + 8 && var113 >= var105 && var113 < var105 + 8) {
                                                                            class41 var119 = class41.method3164(var109);
                                                                            int var121 = var114 & 0x7;
                                                                            int var122 = var113 & 0x7;
                                                                            int var124 = var119.field916;
                                                                            int var125 = var119.field905;
                                                                            if ((var118 & 0x1) == 1) {
                                                                                int var126 = var124;
                                                                                var124 = var125;
                                                                                var125 = var126;
                                                                            }
                                                                            int var127 = var96 & 0x3;
                                                                            int var128;
                                                                            if (var127 == 0) {
                                                                                var128 = var121;
                                                                            } else if (var127 == 1) {
                                                                                var128 = var122;
                                                                            } else if (var127 == 2) {
                                                                                var128 = 7 - var121 - (var124 - 1);
                                                                            } else {
                                                                                var128 = 7 - var122 - (var125 - 1);
                                                                            }
                                                                            int var129 = var102 + var128;
                                                                            int var131 = var114 & 0x7;
                                                                            int var132 = var113 & 0x7;
                                                                            int var134 = var119.field916;
                                                                            int var135 = var119.field905;
                                                                            if ((var118 & 0x1) == 1) {
                                                                                int var136 = var134;
                                                                                var134 = var135;
                                                                                var135 = var136;
                                                                            }
                                                                            int var137 = var96 & 0x3;
                                                                            int var138;
                                                                            if (var137 == 0) {
                                                                                var138 = var132;
                                                                            } else if (var137 == 1) {
                                                                                var138 = 7 - var131 - (var134 - 1);
                                                                            } else if (var137 == 2) {
                                                                                var138 = 7 - var132 - (var135 - 1);
                                                                            } else {
                                                                                var138 = var131;
                                                                            }
                                                                            int var139 = var103 + var138;
                                                                            if (var129 > 0 && var139 > 0 && var129 < 103 && var139 < 103) {
                                                                                int var140 = var91;
                                                                                if ((class6.field70[1][var129][var139] & 0x2) == 2) {
                                                                                    var140 = var91 - 1;
                                                                                }
                                                                                class109 var141 = null;
                                                                                if (var140 >= 0) {
                                                                                    var141 = var107[var140];
                                                                                }
                                                                                class6.method9(var91, var129, var139, var109, var96 + var118 & 0x3, var117, var106, var141);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var91++;
                                        }
                                    }
                                    method2654();
                                    for (int var66 = 0; var66 < 13; var66++) {
                                        for (int var67 = 0; var67 < 13; var67++) {
                                            boolean var68 = false;
                                            int var69 = field352[var65][var66][var67];
                                            if (var69 != -1) {
                                                int var70 = var69 >> 24 & 0x3;
                                                int var71 = var69 >> 1 & 0x3;
                                                int var72 = var69 >> 14 & 0x3FF;
                                                int var73 = var69 >> 3 & 0x7FF;
                                                int var74 = (var72 / 8 << 8) + var73 / 8;
                                                for (int var75 = 0; var75 < Statics.field2154.length; var75++) {
                                                    if (Statics.field2154[var75] == var74 && Statics.field200[var75] != null) {
                                                        byte[] var76 = Statics.field200[var75];
                                                        int var77 = var66 * 8;
                                                        int var78 = var67 * 8;
                                                        int var79 = (var72 & 0x7) * 8;
                                                        int var80 = (var73 & 0x7) * 8;
                                                        class109[] var81 = field292;
                                                        for (int var82 = 0; var82 < 8; var82++) {
                                                            for (int var83 = 0; var83 < 8; var83++) {
                                                                if (var77 + var82 > 0 && var77 + var82 < 103 && var78 + var83 > 0 && var78 + var83 < 103) {
                                                                    var81[var65].field1885[var77 + var82][var78 + var83] &= 0xFEFFFFFF;
                                                                }
                                                            }
                                                        }
                                                        class120 var84 = new class120(var76);
                                                        for (int var85 = 0; var85 < 4; var85++) {
                                                            for (int var86 = 0; var86 < 64; var86++) {
                                                                for (int var87 = 0; var87 < 64; var87++) {
                                                                    if (var70 == var85 && var86 >= var79 && var86 < var79 + 8 && var87 >= var80 && var87 < var80 + 8) {
                                                                        class6.method3229(var84, var65, var77 + class178.method2678(var86 & 0x7, var87 & 0x7, var71), var78 + class178.method164(var86 & 0x7, var87 & 0x7, var71), 0, 0, var71);
                                                                    } else {
                                                                        class6.method3229(var84, 0, -1, -1, 0, 0, 0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var68 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var68) {
                                                class6.method783(var65, var66 * 8, var67 * 8);
                                            }
                                        }
                                    }
                                    var65++;
                                }
                            }
                            method156(true);
                            method2046();
                            method2654();
                            class6.method39(Statics.field2231, field292);
                            method156(true);
                            int var142 = class6.field71;
                            if (var142 > Statics.field2194) {
                                var142 = Statics.field2194;
                            }
                            if (var142 < Statics.field2194 - 1) {
                                int var143 = Statics.field2194 - 1;
                            }
                            if (field384) {
                                Statics.field2231.method1939(class6.field71);
                            } else {
                                Statics.field2231.method1939(0);
                            }
                            for (int var144 = 0; var144 < 104; var144++) {
                                for (int var145 = 0; var145 < 104; var145++) {
                                    method2027(var144, var145);
                                }
                            }
                            method2654();
                            for (class17 var146 = (class17) field422.method3575(); var146 != null; var146 = (class17) field422.method3565()) {
                                if (var146.field234 == -1) {
                                    var146.field242 = 0;
                                    method555(var146);
                                } else {
                                    var146.method3647();
                                }
                            }
                            class41.field902.method3486();
                            if (Statics.field1347 != null) {
                                field332.method2611(194);
                                field332.method2332(1057001181);
                            }
                            if (!field569) {
                                int var147 = (Statics.field2266 - 6) / 8;
                                int var148 = (Statics.field2266 + 6) / 8;
                                int var149 = (Statics.field372 - 6) / 8;
                                int var150 = (Statics.field372 + 6) / 8;
                                for (int var151 = var147 - 1; var151 <= var148 + 1; var151++) {
                                    for (int var152 = var149 - 1; var152 <= var150 + 1; var152++) {
                                        if (var151 < var147 || var151 > var148 || var152 < var149 || var152 > var150) {
                                            Statics.field772.method3057("m" + var151 + "_" + var152);
                                            Statics.field772.method3057("l" + var151 + "_" + var152);
                                        }
                                    }
                                }
                            }
                            method900(30);
                            method2654();
                            Statics.field72 = (byte[][][]) null;
                            Statics.field73 = (byte[][][]) null;
                            Statics.field74 = (byte[][][]) null;
                            Statics.field1068 = (byte[][][]) null;
                            Statics.field2226 = (int[][][]) null;
                            Statics.field92 = (byte[][][]) null;
                            Statics.field958 = (int[][]) null;
                            Statics.field145 = null;
                            Statics.field213 = null;
                            Statics.field955 = null;
                            Statics.field1357 = null;
                            Statics.field162 = null;
                            field332.method2611(38);
                            Statics.field1889.method2714();
                            for (int var153 = 0; var153 < 32; var153++) {
                                field2179[var153] = 0L;
                            }
                            for (int var154 = 0; var154 < 32; var154++) {
                                field2184[var154] = 0L;
                            }
                            Statics.field254 = 0;
                        } else {
                            field349 = 2;
                        }
                    } else {
                        field349 = 1;
                    }
                }
                if (field295 == 30) {
                    if (field520 > 1) {
                        field520--;
                    }
                    if (field400 > 0) {
                        field400--;
                    }
                    if (field343) {
                        field343 = false;
                        method2954();
                    } else {
                        if (!field429) {
                            field435[0] = class158.field2534;
                            field397[0] = "";
                            field433[0] = 1006;
                            field430 = 1;
                        }
                        for (int var155 = 0; var155 < 100; var155++) {
                            boolean var156;
                            if (Statics.field196 == null) {
                                var156 = false;
                            } else {
                                label3680: {
                                    try {
                                        int var157 = Statics.field196.method2834();
                                        if (var157 == 0) {
                                            var156 = false;
                                            break label3680;
                                        }
                                        if (field336 == -1) {
                                            Statics.field196.method2835(field333.field1983, 0, 1);
                                            field333.field1977 = 0;
                                            field336 = field333.method2617();
                                            field335 = class189.field3046[field336];
                                            var157--;
                                        }
                                        if (field335 == -1) {
                                            if (var157 <= 0) {
                                                var156 = false;
                                                break label3680;
                                            }
                                            Statics.field196.method2835(field333.field1983, 0, 1);
                                            field335 = field333.field1983[0] & 0xFF;
                                            var157--;
                                        }
                                        if (field335 == -2) {
                                            if (var157 <= 1) {
                                                var156 = false;
                                                break label3680;
                                            }
                                            Statics.field196.method2835(field333.field1983, 0, 2);
                                            field333.field1977 = 0;
                                            field335 = field333.method2346();
                                            var157 -= 2;
                                        }
                                        if (var157 < field335) {
                                            var156 = false;
                                            break label3680;
                                        }
                                        field333.field1977 = 0;
                                        Statics.field196.method2835(field333.field1983, 0, field335);
                                        field442 = 0;
                                        field541 = field407;
                                        field407 = field339;
                                        field339 = field336;
                                        if (field336 == 208) {
                                            int var158 = field333.method2389();
                                            int var159 = field333.method2378();
                                            class174 var160 = class174.method2976(var158);
                                            if (var160 != null && var160.field2834 == 0) {
                                                if (var159 > var160.field2773 - var160.field2765) {
                                                    var159 = var160.field2773 - var160.field2765;
                                                }
                                                if (var159 < 0) {
                                                    var159 = 0;
                                                }
                                                if (var160.field2771 != var159) {
                                                    var160.field2771 = var159;
                                                    method38(var160);
                                                }
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 161) {
                                            String var161 = field333.method2352();
                                            int var162 = field333.method2346();
                                            byte var163 = field333.method2345();
                                            boolean var164 = false;
                                            if (var163 == -128) {
                                                var164 = true;
                                            }
                                            if (var164) {
                                                if (Statics.field1958 == 0) {
                                                    field336 = -1;
                                                    var156 = true;
                                                    break label3680;
                                                }
                                                boolean var165 = false;
                                                int var166;
                                                for (var166 = 0; var166 < Statics.field1958 && (!Statics.field924[var166].field618.equals(var161) || Statics.field924[var166].field620 != var162); var166++) {
                                                }
                                                if (var166 < Statics.field1958) {
                                                    while (var166 < Statics.field1958 - 1) {
                                                        Statics.field924[var166] = Statics.field924[var166 + 1];
                                                        var166++;
                                                    }
                                                    Statics.field1958--;
                                                    Statics.field924[Statics.field1958] = null;
                                                }
                                            } else {
                                                field333.method2352();
                                                class25 var167 = new class25();
                                                var167.field618 = var161;
                                                var167.field619 = class165.method777(var167.field618, Statics.field290);
                                                var167.field620 = var162;
                                                var167.field623 = var163;
                                                int var168;
                                                for (var168 = Statics.field1958 - 1; var168 >= 0; var168--) {
                                                    int var169 = Statics.field924[var168].field619.compareTo(var167.field619);
                                                    if (var169 == 0) {
                                                        Statics.field924[var168].field620 = var162;
                                                        Statics.field924[var168].field623 = var163;
                                                        if (var161.equals(Statics.field2263.field27)) {
                                                            Statics.field1987 = var163;
                                                        }
                                                        field289 = field360;
                                                        field336 = -1;
                                                        var156 = true;
                                                        break label3680;
                                                    }
                                                    if (var169 < 0) {
                                                        break;
                                                    }
                                                }
                                                if (Statics.field1958 >= Statics.field924.length) {
                                                    field336 = -1;
                                                    var156 = true;
                                                    break label3680;
                                                }
                                                for (int var170 = Statics.field1958 - 1; var170 > var168; var170--) {
                                                    Statics.field924[var170 + 1] = Statics.field924[var170];
                                                }
                                                if (Statics.field1958 == 0) {
                                                    Statics.field924 = new class25[100];
                                                }
                                                Statics.field924[var168 + 1] = var167;
                                                Statics.field1958++;
                                                if (var161.equals(Statics.field2263.field27)) {
                                                    Statics.field1987 = var163;
                                                }
                                            }
                                            field289 = field360;
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 122) {
                                            for (int var171 = 0; var171 < Statics.field1130; var171++) {
                                                class53 var172 = class53.method550(var171);
                                                if (var172 != null) {
                                                    class177.field2895[var171] = 0;
                                                    class177.field2897[var171] = 0;
                                                }
                                            }
                                            method1050();
                                            field475 += 32;
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 43) {
                                            int var173 = field333.method2349();
                                            int var174 = field333.method2346();
                                            if (var173 < -70000) {
                                                var174 += 32768;
                                            }
                                            class174 var175;
                                            if (var173 >= 0) {
                                                var175 = class174.method2976(var173);
                                            } else {
                                                var175 = null;
                                            }
                                            if (var175 != null) {
                                                for (int var176 = 0; var176 < var175.field2867.length; var176++) {
                                                    var175.field2867[var176] = 0;
                                                    var175.field2746[var176] = 0;
                                                }
                                            }
                                            class16.method1751(var174);
                                            int var177 = field333.method2346();
                                            for (int var178 = 0; var178 < var177; var178++) {
                                                int var179 = field333.method2372();
                                                if (var179 == 255) {
                                                    var179 = field333.method2349();
                                                }
                                                int var180 = field333.method2346();
                                                if (var175 != null && var178 < var175.field2867.length) {
                                                    var175.field2867[var178] = var180;
                                                    var175.field2746[var178] = var179;
                                                }
                                                class16.method2281(var174, var178, var180 - 1, var179);
                                            }
                                            if (var175 != null) {
                                                method38(var175);
                                            }
                                            method1050();
                                            field476[++field477 - 1 & 0x1F] = var174 & 0x7FFF;
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 44) {
                                            Statics.field265 = field333.method2404();
                                            Statics.field883 = field333.method2404();
                                            while (field333.field1977 < field335) {
                                                field336 = field333.method2344();
                                                method971();
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 226) {
                                            field556 = 1;
                                            field493 = field360;
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 237) {
                                            String var181 = field333.method2352();
                                            long var182 = field333.method2529();
                                            long var184 = (long) field333.method2346();
                                            long var186 = (long) field333.method2348();
                                            class153 var188 = (class153) class110.method2955(class153.method40(), field333.method2344());
                                            long var189 = (var184 << 32) + var186;
                                            boolean var191 = false;
                                            for (int var192 = 0; var192 < 100; var192++) {
                                                if (field351[var192] == var189) {
                                                    var191 = true;
                                                    break;
                                                }
                                            }
                                            if (var188.field2253 && method934(var181)) {
                                                var191 = true;
                                            }
                                            if (!var191 && field410 == 0) {
                                                field351[field510] = var189;
                                                field510 = (field510 + 1) % 100;
                                                class123 var193 = field333;
                                                String var194 = class223.method3220(var193, 32767);
                                                String var195 = class224.method3763(class164.method1755(var194));
                                                if (var188.field2250 == -1) {
                                                    class12.method568(9, var181, var195, class163.method2136(var182));
                                                } else {
                                                    class12.method568(9, class2.method1152(var188.field2250) + var181, var195, class163.method2136(var182));
                                                }
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 69) {
                                            field356 = field333.method2344();
                                            field507 = field333.method2344();
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 54) {
                                            int var196 = field333.method2378();
                                            int var197 = field333.method2389();
                                            int var198 = field333.method2491();
                                            class174 var199 = class174.method2976(var197);
                                            var199.field2780 = (var196 << 16) + var198;
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 11) {
                                            int var200 = field333.method2390();
                                            int var201 = field333.method2389();
                                            int var202 = field333.method2346();
                                            if (var202 == 65535) {
                                                var202 = -1;
                                            }
                                            class174 var203 = class174.method2976(var201);
                                            if (var203.field2742) {
                                                var203.field2869 = var202;
                                                var203.field2872 = var200;
                                                class52 var205 = class52.method727(var202);
                                                var203.field2840 = var205.field1092;
                                                var203.field2801 = var205.field1084;
                                                var203.field2845 = var205.field1094;
                                                var203.field2798 = var205.field1090;
                                                var203.field2799 = var205.field1096;
                                                var203.field2803 = var205.field1107;
                                                if (var205.field1097 == 1) {
                                                    var203.field2807 = 1;
                                                } else {
                                                    var203.field2807 = 2;
                                                }
                                                if (var203.field2804 > 0) {
                                                    var203.field2803 = var203.field2803 * 32 / var203.field2804;
                                                } else if (var203.field2760 > 0) {
                                                    var203.field2803 = var203.field2803 * 32 / var203.field2760;
                                                }
                                                method38(var203);
                                            } else {
                                                if (var202 == -1) {
                                                    var203.field2792 = 0;
                                                    field336 = -1;
                                                    var156 = true;
                                                    break label3680;
                                                }
                                                class52 var204 = class52.method727(var202);
                                                var203.field2792 = 4;
                                                var203.field2793 = var202;
                                                var203.field2840 = var204.field1092;
                                                var203.field2801 = var204.field1084;
                                                var203.field2803 = var204.field1107 * 100 / var200;
                                                method38(var203);
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 72) {
                                            int var206 = field333.method2472();
                                            boolean var207 = field333.method2344() == 1;
                                            String var208 = "";
                                            boolean var209 = false;
                                            if (var207) {
                                                var208 = field333.method2352();
                                                if (method934(var208)) {
                                                    var209 = true;
                                                }
                                            }
                                            String var210 = field333.method2352();
                                            if (!var209) {
                                                class12.method936(var206, var208, var210);
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 216) {
                                            int var211 = field333.method2349();
                                            int var212 = field333.method2346();
                                            if (var211 < -70000) {
                                                var212 += 32768;
                                            }
                                            class174 var213;
                                            if (var211 >= 0) {
                                                var213 = class174.method2976(var211);
                                            } else {
                                                var213 = null;
                                            }
                                            while (field333.field1977 < field335) {
                                                int var214 = field333.method2472();
                                                int var215 = field333.method2346();
                                                int var216 = 0;
                                                if (var215 != 0) {
                                                    var216 = field333.method2344();
                                                    if (var216 == 255) {
                                                        var216 = field333.method2349();
                                                    }
                                                }
                                                if (var213 != null && var214 >= 0 && var214 < var213.field2867.length) {
                                                    var213.field2867[var214] = var215;
                                                    var213.field2746[var214] = var216;
                                                }
                                                class16.method2281(var212, var214, var215 - 1, var216);
                                            }
                                            if (var213 != null) {
                                                method38(var213);
                                            }
                                            method1050();
                                            field476[++field477 - 1 & 0x1F] = var212 & 0x7FFF;
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 62) {
                                            int var217 = field333.method2390();
                                            int var218 = field333.method2370();
                                            int var219 = field333.method2380();
                                            class4 var220 = (class4) field449.method3538((long) var217);
                                            if (var220 != null) {
                                                method2795(var220, var220.field61 != var219);
                                            }
                                            method2960(var217, var219, var218);
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 131) {
                                            method2797(true);
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 198) {
                                            method2797(false);
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 253) {
                                            int var221 = field333.method2389();
                                            class174 var222 = class174.method2976(var221);
                                            for (int var223 = 0; var223 < var222.field2867.length; var223++) {
                                                var222.field2867[var223] = -1;
                                                var222.field2867[var223] = 0;
                                            }
                                            method38(var222);
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 186) {
                                            int var224 = field333.method2491();
                                            field457 = var224;
                                            method1777(field457, Statics.field1027, Statics.field2170, false);
                                            method161(var224);
                                            class37.method704(field457);
                                            for (int var225 = 0; var225 < 100; var225++) {
                                                field508[var225] = true;
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 38) {
                                            field522 = field333.method2344();
                                            if (field522 == 255) {
                                                field522 = 0;
                                            }
                                            field523 = field333.method2344();
                                            if (field523 == 255) {
                                                field523 = 0;
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 68) {
                                            for (int var226 = 0; var226 < field411.length; var226++) {
                                                if (field411[var226] != null) {
                                                    field411[var226].field802 = -1;
                                                }
                                            }
                                            for (int var227 = 0; var227 < field327.length; var227++) {
                                                if (field327[var227] != null) {
                                                    field327[var227].field802 = -1;
                                                }
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 225) {
                                            int var228 = field333.method2568();
                                            class174 var229 = class174.method2976(var228);
                                            var229.field2792 = 3;
                                            var229.field2793 = Statics.field2263.field50.method3259();
                                            method38(var229);
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 162) {
                                            int var230 = field333.method2389();
                                            int var231 = field333.method2491();
                                            class174 var232 = class174.method2976(var230);
                                            if (var232.field2792 != 2 || var232.field2793 != var231) {
                                                var232.field2792 = 2;
                                                var232.field2793 = var231;
                                                method38(var232);
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 46) {
                                            method2956();
                                            field336 = -1;
                                            var156 = false;
                                            break label3680;
                                        }
                                        if (field336 == 20) {
                                            method2729(field333.method2352());
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 223) {
                                            field536 = false;
                                            for (int var233 = 0; var233 < 5; var233++) {
                                                field537[var233] = false;
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 51) {
                                            if (field457 != -1) {
                                                int var234 = field457;
                                                if (class174.method1767(var234)) {
                                                    method698(Statics.field2751[var234], 0);
                                                }
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 212) {
                                            int var235 = field333.method2380();
                                            int var236 = field333.method2380();
                                            int var237 = field333.method2568();
                                            int var238 = field333.method2378();
                                            class174 var239 = class174.method2976(var237);
                                            if (var239.field2840 != var235 || var239.field2801 != var236 || var239.field2803 != var238) {
                                                var239.field2840 = var235;
                                                var239.field2801 = var236;
                                                var239.field2803 = var238;
                                                method38(var239);
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 114) {
                                            Statics.field157 = class131.method3477(field333.method2344());
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 172) {
                                            int var240 = field333.method2346();
                                            int var241 = field333.method2344();
                                            int var242 = field333.method2346();
                                            method997(var240, var241, var242);
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 86) {
                                            field536 = true;
                                            Statics.field135 = field333.method2344();
                                            Statics.field2935 = field333.method2344();
                                            Statics.field160 = field333.method2346();
                                            Statics.field952 = field333.method2344();
                                            Statics.field1951 = field333.method2344();
                                            if (Statics.field1951 >= 100) {
                                                int var243 = Statics.field135 * 128 + 64;
                                                int var244 = Statics.field2935 * 128 + 64;
                                                int var245 = method2246(var243, var244, Statics.field2194) - Statics.field160;
                                                int var246 = var243 - Statics.field671;
                                                int var247 = var245 - Statics.field1189;
                                                int var248 = var244 - Statics.field479;
                                                int var249 = (int) Math.sqrt((double) (var246 * var246 + var248 * var248));
                                                Statics.field2287 = (int) (Math.atan2((double) var247, (double) var249) * 325.949D) & 0x7FF;
                                                Statics.field2225 = (int) (Math.atan2((double) var246, (double) var248) * -325.949D) & 0x7FF;
                                                if (Statics.field2287 < 128) {
                                                    Statics.field2287 = 128;
                                                }
                                                if (Statics.field2287 > 383) {
                                                    Statics.field2287 = 383;
                                                }
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 252) {
                                            field494 = field333.method2344();
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 12) {
                                            class26 var250 = new class26();
                                            var250.field638 = field333.method2352();
                                            var250.field637 = field333.method2346();
                                            int var251 = field333.method2349();
                                            var250.field641 = var251;
                                            method900(45);
                                            Statics.field196.method2841();
                                            Statics.field196 = null;
                                            class32.method92(var250);
                                            field336 = -1;
                                            var156 = false;
                                            break label3680;
                                        }
                                        if (field336 == 213) {
                                            class33.method2292(field333, field335);
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 0) {
                                            int var252 = field335 + field333.field1977;
                                            int var253 = field333.method2346();
                                            int var254 = field333.method2346();
                                            if (field457 != var253) {
                                                field457 = var253;
                                                method1777(field457, Statics.field1027, Statics.field2170, false);
                                                method161(field457);
                                                class37.method704(field457);
                                                for (int var255 = 0; var255 < 100; var255++) {
                                                    field508[var255] = true;
                                                }
                                            }
                                            while (var254-- > 0) {
                                                int var256 = field333.method2349();
                                                int var257 = field333.method2346();
                                                int var258 = field333.method2344();
                                                class4 var259 = (class4) field449.method3538((long) var256);
                                                if (var259 != null && var259.field61 != var257) {
                                                    method2795(var259, true);
                                                    var259 = null;
                                                }
                                                if (var259 == null) {
                                                    var259 = method2960(var256, var257, var258);
                                                }
                                                var259.field54 = true;
                                            }
                                            for (class4 var260 = (class4) field449.method3530(); var260 != null; var260 = (class4) field449.method3531()) {
                                                if (var260.field54) {
                                                    var260.field54 = false;
                                                } else {
                                                    method2795(var260, true);
                                                }
                                            }
                                            field312 = new class197(512);
                                            while (field333.field1977 < var252) {
                                                int var261 = field333.method2349();
                                                int var262 = field333.method2346();
                                                int var263 = field333.method2346();
                                                int var264 = field333.method2349();
                                                for (int var265 = var262; var265 <= var263; var265++) {
                                                    long var266 = ((long) var261 << 32) + (long) var265;
                                                    field312.method3528(new class202(var264), var266);
                                                }
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 146) {
                                            int var268 = field333.method2344();
                                            if (field333.method2344() == 0) {
                                                field529[var268] = new class221();
                                                field333.field1977 += 18;
                                            } else {
                                                field333.field1977--;
                                                field529[var268] = new class221(field333, false);
                                            }
                                            field328 = field360;
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 135) {
                                            for (int var269 = 0; var269 < class177.field2897.length; var269++) {
                                                if (class177.field2897[var269] != class177.field2895[var269]) {
                                                    class177.field2897[var269] = class177.field2895[var269];
                                                    method41(var269);
                                                    field474[++field475 - 1 & 0x1F] = var269;
                                                }
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 81) {
                                            field289 = field360;
                                            if (field335 == 0) {
                                                field515 = null;
                                                field516 = null;
                                                Statics.field1958 = 0;
                                                Statics.field924 = null;
                                                field336 = -1;
                                                var156 = true;
                                                break label3680;
                                            }
                                            field516 = field333.method2352();
                                            long var270 = field333.method2529();
                                            long var272 = var270;
                                            String var274;
                                            if (var270 <= 0L || var270 >= 6582952005840035281L) {
                                                var274 = null;
                                            } else if (var270 % 37L == 0L) {
                                                var274 = null;
                                            } else {
                                                int var275 = 0;
                                                for (long var276 = var270; var276 != 0L; var276 /= 37L) {
                                                    var275++;
                                                }
                                                StringBuilder var278 = new StringBuilder(var275);
                                                while (var272 != 0L) {
                                                    long var279 = var272;
                                                    var272 /= 37L;
                                                    var278.append(class163.field2640[(int) (var279 - var272 * 37L)]);
                                                }
                                                var274 = var278.reverse().toString();
                                            }
                                            field515 = var274;
                                            Statics.field2265 = field333.method2345();
                                            int var281 = field333.method2344();
                                            if (var281 == 255) {
                                                field336 = -1;
                                                var156 = true;
                                                break label3680;
                                            }
                                            Statics.field1958 = var281;
                                            class25[] var282 = new class25[100];
                                            for (int var283 = 0; var283 < Statics.field1958; var283++) {
                                                var282[var283] = new class25();
                                                var282[var283].field618 = field333.method2352();
                                                var282[var283].field619 = class165.method777(var282[var283].field618, Statics.field290);
                                                var282[var283].field620 = field333.method2346();
                                                var282[var283].field623 = field333.method2345();
                                                field333.method2352();
                                                if (var282[var283].field618.equals(Statics.field2263.field27)) {
                                                    Statics.field1987 = var282[var283].field623;
                                                }
                                            }
                                            boolean var284 = false;
                                            int var285 = Statics.field1958;
                                            while (var285 > 0) {
                                                boolean var286 = true;
                                                var285--;
                                                for (int var287 = 0; var287 < var285; var287++) {
                                                    if (var282[var287].field619.compareTo(var282[var287 + 1].field619) > 0) {
                                                        class25 var288 = var282[var287];
                                                        var282[var287] = var282[var287 + 1];
                                                        var282[var287 + 1] = var288;
                                                        var286 = false;
                                                    }
                                                }
                                                if (var286) {
                                                    break;
                                                }
                                            }
                                            Statics.field924 = var282;
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 34) {
                                            int var289 = field333.method2380();
                                            int var290 = field333.method2389();
                                            class174 var291 = class174.method2976(var290);
                                            if (var291.field2792 != 1 || var291.field2793 != var289) {
                                                var291.field2792 = 1;
                                                var291.field2793 = var289;
                                                method38(var291);
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 153) {
                                            field333.field1977 += 28;
                                            if (field333.method2508()) {
                                                class123 var292 = field333;
                                                int var293 = field333.field1977 - 28;
                                                if (class150.field2220 != null) {
                                                    try {
                                                        class150.field2220.method3870(0L);
                                                        class150.field2220.method3861(var292.field1983, var293, 24);
                                                    } catch (Exception var562) {
                                                    }
                                                }
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 64) {
                                            int var295 = field333.method2344();
                                            int var296 = field333.method2344();
                                            int var297 = field333.method2344();
                                            int var298 = field333.method2344();
                                            field537[var295] = true;
                                            field482[var295] = var296;
                                            field530[var295] = var297;
                                            field540[var295] = var298;
                                            field325[var295] = 0;
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 63) {
                                            field520 = field333.method2346() * 30;
                                            field485 = field360;
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 210) {
                                            String var299 = field333.method2352();
                                            Object[] var300 = new Object[var299.length() + 1];
                                            for (int var301 = var299.length() - 1; var301 >= 0; var301--) {
                                                if (var299.charAt(var301) == 's') {
                                                    var300[var301 + 1] = field333.method2352();
                                                } else {
                                                    var300[var301 + 1] = Integer.valueOf(field333.method2349());
                                                }
                                            }
                                            var300[0] = Integer.valueOf(field333.method2349());
                                            class1 var302 = new class1();
                                            var302.field13 = var300;
                                            class37.method1948(var302, 200000);
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 241) {
                                            int var303 = field333.method2389();
                                            int var304 = field333.method2568();
                                            class4 var305 = (class4) field449.method3538((long) var303);
                                            class4 var306 = (class4) field449.method3538((long) var304);
                                            if (var306 != null) {
                                                method2795(var306, var305 == null || var305.field61 != var306.field61);
                                            }
                                            if (var305 != null) {
                                                var305.method3647();
                                                field449.method3528(var305, (long) var304);
                                            }
                                            class174 var307 = class174.method2976(var303);
                                            if (var307 != null) {
                                                method38(var307);
                                            }
                                            class174 var308 = class174.method2976(var304);
                                            if (var308 != null) {
                                                method38(var308);
                                                method120(Statics.field2751[var308.field2749 >>> 16], var308, true);
                                            }
                                            if (field457 != -1) {
                                                method713(field457, 1);
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 40) {
                                            field536 = true;
                                            Statics.field168 = field333.method2344();
                                            Statics.field2048 = field333.method2344();
                                            Statics.field1661 = field333.method2346();
                                            Statics.field1344 = field333.method2344();
                                            Statics.field245 = field333.method2344();
                                            if (Statics.field245 >= 100) {
                                                Statics.field671 = Statics.field168 * 128 + 64;
                                                Statics.field479 = Statics.field2048 * 128 + 64;
                                                Statics.field1189 = method2246(Statics.field671, Statics.field479, Statics.field2194) - Statics.field1661;
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 3) {
                                            method1050();
                                            field454 = field333.method2347();
                                            field485 = field360;
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 119) {
                                            String var309 = field333.method2352();
                                            class123 var310 = field333;
                                            String var311 = class223.method3220(var310, 32767);
                                            String var312 = class224.method3763(class164.method1755(var311));
                                            class12.method936(6, var309, var312);
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 173) {
                                            method1050();
                                            int var313 = field333.method2389();
                                            int var314 = field333.method2404();
                                            int var315 = field333.method2372();
                                            field427[var315] = var313;
                                            field357[var315] = var314;
                                            field426[var315] = 1;
                                            for (int var316 = 0; var316 < 98; var316++) {
                                                if (var313 >= class156.field2283[var316]) {
                                                    field426[var315] = var316 + 2;
                                                }
                                            }
                                            field472[++field468 - 1 & 0x1F] = var315;
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 14) {
                                            int var317 = field333.method2349();
                                            int var318 = field333.method2349();
                                            if (Statics.field239 == null || !Statics.field239.isValid()) {
                                                try {
                                                    Iterator var319 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                                    while (var319.hasNext()) {
                                                        GarbageCollectorMXBean var320 = (GarbageCollectorMXBean) var319.next();
                                                        if (var320.isValid()) {
                                                            Statics.field239 = var320;
                                                            field425 = -1L;
                                                            field565 = -1L;
                                                        }
                                                    }
                                                } catch (Throwable var566) {
                                                }
                                            }
                                            long var322 = class116.method1946();
                                            int var324 = -1;
                                            if (Statics.field239 != null) {
                                                long var325 = Statics.field239.getCollectionTime();
                                                if (field565 != -1L) {
                                                    long var327 = var325 - field565;
                                                    long var329 = var322 - field425;
                                                    if (var329 != 0L) {
                                                        var324 = (int) (var327 * 100L / var329);
                                                    }
                                                }
                                                field565 = var325;
                                                field425 = var322;
                                            }
                                            field332.method2611(193);
                                            field332.method2368(field2182);
                                            field332.method2480(var324);
                                            field332.method2387(var317);
                                            field332.method2332(var318);
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 136 || field336 == 222 || field336 == 127 || field336 == 35 || field336 == 71 || field336 == 77 || field336 == 45 || field336 == 16 || field336 == 232 || field336 == 197) {
                                            method971();
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 10) {
                                            class212.method2793(field333, field335);
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 247) {
                                            int var331 = field333.method2491();
                                            int var332 = field333.method2390();
                                            int var333 = var331 >> 10 & 0x1F;
                                            int var334 = var331 >> 5 & 0x1F;
                                            int var335 = var331 & 0x1F;
                                            int var336 = (var335 << 3) + (var333 << 19) + (var334 << 11);
                                            class174 var337 = class174.method2976(var332);
                                            if (var337.field2774 != var336) {
                                                var337.field2774 = var336;
                                                method38(var337);
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 52) {
                                            method1(true);
                                            field333.method2617();
                                            int var338 = field333.method2346();
                                            class33.method2292(field333, var338);
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 229) {
                                            method1050();
                                            field453 = field333.method2344();
                                            field485 = field360;
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 147) {
                                            while (field333.field1977 < field335) {
                                                int var339 = field333.method2344();
                                                boolean var340 = (var339 & 0x1) == 1;
                                                String var341 = field333.method2352();
                                                String var342 = field333.method2352();
                                                field333.method2352();
                                                for (int var343 = 0; var343 < field514; var343++) {
                                                    class8 var344 = field560[var343];
                                                    if (var340) {
                                                        if (var342.equals(var344.field125)) {
                                                            var344.field125 = var341;
                                                            var344.field123 = var342;
                                                            var341 = null;
                                                            break;
                                                        }
                                                    } else if (var341.equals(var344.field125)) {
                                                        var344.field125 = var341;
                                                        var344.field123 = var342;
                                                        var341 = null;
                                                        break;
                                                    }
                                                }
                                                if (var341 != null && field514 < 400) {
                                                    class8 var345 = new class8();
                                                    field560[field514] = var345;
                                                    var345.field125 = var341;
                                                    var345.field123 = var342;
                                                    field514++;
                                                }
                                            }
                                            field493 = field360;
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 117) {
                                            int var346 = field333.method2390();
                                            Statics.field251 = Statics.field925.method2752(var346);
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 2) {
                                            int var347 = field333.method2380();
                                            if (var347 == 65535) {
                                                var347 = -1;
                                            }
                                            if (var347 == -1 && !field527) {
                                                Statics.field2953.method3378();
                                                class184.field2954 = 1;
                                                Statics.field1076 = null;
                                            } else if (var347 != -1 && field526 != var347 && field525 != 0 && !field527) {
                                                class184.method152(2, Statics.field359, var347, 0, field525, false);
                                            }
                                            field526 = var347;
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 134) {
                                            int var348 = field333.method2536();
                                            int var349 = field333.method2346();
                                            if (var349 == 65535) {
                                                var349 = -1;
                                            }
                                            if (field525 != 0 && var349 != -1) {
                                                Statics.method1778(Statics.field1423, var349, 0, field525, false);
                                                field527 = true;
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 151) {
                                            int var350 = field333.method2349();
                                            int var351 = field333.method2347();
                                            int var352 = field333.method2381();
                                            class174 var353 = class174.method2976(var350);
                                            if (var353.field2763 != var351 || var353.field2785 != var352 || var353.field2754 != 0 || var353.field2755 != 0) {
                                                var353.field2763 = var351;
                                                var353.field2785 = var352;
                                                var353.field2754 = 0;
                                                var353.field2755 = 0;
                                                method38(var353);
                                                method779(var353);
                                                if (var353.field2834 == 0) {
                                                    method120(Statics.field2751[var350 >> 16], var353, false);
                                                }
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 59) {
                                            byte var354 = field333.method2345();
                                            int var355 = field333.method2380();
                                            class177.field2895[var355] = var354;
                                            if (class177.field2897[var355] != var354) {
                                                class177.field2897[var355] = var354;
                                            }
                                            method41(var355);
                                            field474[++field475 - 1 & 0x1F] = var355;
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 179) {
                                            boolean var356 = field333.method2344() == 1;
                                            if (var356) {
                                                Statics.field2577 = class116.method1946() - field333.method2529();
                                                Statics.field2173 = new class222(field333, true);
                                            } else {
                                                Statics.field2173 = null;
                                            }
                                            field484 = field360;
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 227) {
                                            int var357 = field333.method2390();
                                            int var358 = field333.method2382();
                                            class174 var359 = class174.method2976(var357);
                                            if (var359.field2753 != var358 || var358 == -1) {
                                                var359.field2753 = var358;
                                                var359.field2871 = 0;
                                                var359.field2856 = 0;
                                                method38(var359);
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 156) {
                                            Statics.field883 = field333.method2372();
                                            Statics.field265 = field333.method2370();
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 235) {
                                            class33.field739 = 0;
                                            for (int var360 = 0; var360 < 2048; var360++) {
                                                class33.field738[var360] = null;
                                                class33.field737[var360] = 1;
                                            }
                                            for (int var361 = 0; var361 < 2048; var361++) {
                                                field411[var361] = null;
                                            }
                                            class33.method2283(field333);
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 246) {
                                            String var362 = field333.method2352();
                                            long var363 = (long) field333.method2346();
                                            long var365 = (long) field333.method2348();
                                            class153 var367 = (class153) class110.method2955(class153.method40(), field333.method2344());
                                            long var368 = (var363 << 32) + var365;
                                            boolean var370 = false;
                                            for (int var371 = 0; var371 < 100; var371++) {
                                                if (field351[var371] == var368) {
                                                    var370 = true;
                                                    break;
                                                }
                                            }
                                            if (method934(var362)) {
                                                var370 = true;
                                            }
                                            if (!var370 && field410 == 0) {
                                                field351[field510] = var368;
                                                field510 = (field510 + 1) % 100;
                                                class123 var372 = field333;
                                                String var373 = class223.method3220(var372, 32767);
                                                String var374 = class224.method3763(class164.method1755(var373));
                                                byte var375;
                                                if (var367.field2251) {
                                                    var375 = 7;
                                                } else {
                                                    var375 = 3;
                                                }
                                                if (var367.field2250 == -1) {
                                                    class12.method936(var375, var362, var374);
                                                } else {
                                                    class12.method936(var375, class2.method1152(var367.field2250) + var362, var374);
                                                }
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 157) {
                                            while (field333.field1977 < field335) {
                                                boolean var376 = field333.method2344() == 1;
                                                String var377 = field333.method2352();
                                                String var378 = field333.method2352();
                                                int var379 = field333.method2346();
                                                int var380 = field333.method2344();
                                                int var381 = field333.method2344();
                                                boolean var382 = (var381 & 0x2) != 0;
                                                boolean var383 = (var381 & 0x1) != 0;
                                                if (var379 > 0) {
                                                    field333.method2352();
                                                    field333.method2344();
                                                    field333.method2349();
                                                }
                                                field333.method2352();
                                                for (int var384 = 0; var384 < field341; var384++) {
                                                    class18 var385 = field557[var384];
                                                    if (var376) {
                                                        if (var378.equals(var385.field244)) {
                                                            var385.field244 = var377;
                                                            var385.field247 = var378;
                                                            var377 = null;
                                                            break;
                                                        }
                                                    } else if (var377.equals(var385.field244)) {
                                                        if (var385.field250 != var379) {
                                                            boolean var386 = true;
                                                            for (class39 var387 = (class39) field558.method3524(); var387 != null; var387 = (class39) field558.method3517()) {
                                                                if (var387.field857.equals(var377)) {
                                                                    if (var379 != 0 && var387.field852 == 0) {
                                                                        var387.method3636();
                                                                        var386 = false;
                                                                    } else if (var379 == 0 && var387.field852 != 0) {
                                                                        var387.method3636();
                                                                        var386 = false;
                                                                    }
                                                                }
                                                            }
                                                            if (var386) {
                                                                field558.method3525(new class39(var377, var379));
                                                            }
                                                            var385.field250 = var379;
                                                        }
                                                        var385.field247 = var378;
                                                        var385.field249 = var380;
                                                        var385.field243 = var382;
                                                        var385.field248 = var383;
                                                        var377 = null;
                                                        break;
                                                    }
                                                }
                                                if (var377 != null && field341 < 400) {
                                                    class18 var388 = new class18();
                                                    field557[field341] = var388;
                                                    var388.field244 = var377;
                                                    var388.field247 = var378;
                                                    var388.field250 = var379;
                                                    var388.field249 = var380;
                                                    var388.field243 = var382;
                                                    var388.field248 = var383;
                                                    field341++;
                                                }
                                            }
                                            field556 = 2;
                                            field493 = field360;
                                            boolean var389 = false;
                                            int var390 = field341;
                                            while (var390 > 0) {
                                                boolean var391 = true;
                                                var390--;
                                                for (int var392 = 0; var392 < var390; var392++) {
                                                    boolean var393 = false;
                                                    class18 var394 = field557[var392];
                                                    class18 var395 = field557[var392 + 1];
                                                    if (field287 != var394.field250 && field287 == var395.field250) {
                                                        var393 = true;
                                                    }
                                                    if (!var393 && var394.field250 == 0 && var395.field250 != 0) {
                                                        var393 = true;
                                                    }
                                                    if (!var393 && !var394.field243 && var395.field243) {
                                                        var393 = true;
                                                    }
                                                    if (!var393 && !var394.field248 && var395.field248) {
                                                        var393 = true;
                                                    }
                                                    if (var393) {
                                                        class18 var396 = field557[var392];
                                                        field557[var392] = field557[var392 + 1];
                                                        field557[var392 + 1] = var396;
                                                        var391 = false;
                                                    }
                                                }
                                                if (var391) {
                                                    break;
                                                }
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 234) {
                                            field324 = field333.method2344();
                                            if (field324 == 1) {
                                                field306 = field333.method2346();
                                            }
                                            if (field324 >= 2 && field324 <= 6) {
                                                if (field324 == 2) {
                                                    field311 = 64;
                                                    field459 = 64;
                                                }
                                                if (field324 == 3) {
                                                    field311 = 0;
                                                    field459 = 64;
                                                }
                                                if (field324 == 4) {
                                                    field311 = 128;
                                                    field459 = 64;
                                                }
                                                if (field324 == 5) {
                                                    field311 = 64;
                                                    field459 = 0;
                                                }
                                                if (field324 == 6) {
                                                    field311 = 64;
                                                    field459 = 128;
                                                }
                                                field324 = 2;
                                                field308 = field333.method2346();
                                                field309 = field333.method2346();
                                                field310 = field333.method2344();
                                            }
                                            if (field324 == 10) {
                                                field307 = field333.method2346();
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 101) {
                                            Statics.field265 = field333.method2370();
                                            Statics.field883 = field333.method2404();
                                            for (int var397 = Statics.field883; var397 < Statics.field883 + 8; var397++) {
                                                for (int var398 = Statics.field265; var398 < Statics.field265 + 8; var398++) {
                                                    if (field421[Statics.field2194][var397][var398] != null) {
                                                        field421[Statics.field2194][var397][var398] = null;
                                                        method2027(var397, var398);
                                                    }
                                                }
                                            }
                                            for (class17 var399 = (class17) field422.method3575(); var399 != null; var399 = (class17) field422.method3565()) {
                                                if (var399.field226 >= Statics.field883 && var399.field226 < Statics.field883 + 8 && var399.field224 >= Statics.field265 && var399.field224 < Statics.field265 + 8 && Statics.field2194 == var399.field233) {
                                                    var399.field234 = 0;
                                                }
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 37) {
                                            int var400 = field333.method2390();
                                            String var401 = field333.method2352();
                                            class174 var402 = class174.method2976(var400);
                                            if (!var401.equals(var402.field2809)) {
                                                var402.field2809 = var401;
                                                method38(var402);
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 154) {
                                            int var403 = field333.method2349();
                                            class4 var404 = (class4) field449.method3538((long) var403);
                                            if (var404 != null) {
                                                method2795(var404, true);
                                            }
                                            if (field452 != null) {
                                                method38(field452);
                                                field452 = null;
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 209) {
                                            int var405 = field333.method2349();
                                            boolean var406 = field333.method2404() == 1;
                                            class174 var407 = class174.method2976(var405);
                                            if (var407.field2883 != var406) {
                                                var407.field2883 = var406;
                                                method38(var407);
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 239) {
                                            int var408 = field333.method2346();
                                            class16.method2766(var408);
                                            field476[++field477 - 1 & 0x1F] = var408 & 0x7FFF;
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 26) {
                                            String var409 = field333.method2352();
                                            int var410 = field333.method2372();
                                            int var411 = field333.method2404();
                                            if (var410 >= 1 && var410 <= 8) {
                                                if (var409.equalsIgnoreCase("null")) {
                                                    var409 = null;
                                                }
                                                field417[var410 - 1] = var409;
                                                field418[var410 - 1] = var411 == 0;
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 184) {
                                            int var412 = field333.method2389();
                                            int var413 = field333.method2346();
                                            if (var413 == 65535) {
                                                var413 = -1;
                                            }
                                            int var414 = field333.method2568();
                                            int var415 = field333.method2380();
                                            if (var415 == 65535) {
                                                var415 = -1;
                                            }
                                            for (int var416 = var413; var416 <= var415; var416++) {
                                                long var417 = ((long) var412 << 32) + (long) var416;
                                                class209 var419 = field312.method3538(var417);
                                                if (var419 != null) {
                                                    var419.method3647();
                                                }
                                                field312.method3528(new class202(var414), var417);
                                            }
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 41) {
                                            method1(false);
                                            field333.method2617();
                                            int var420 = field333.method2346();
                                            class33.method2292(field333, var420);
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        if (field336 == 123) {
                                            int var421 = field333.method2389();
                                            int var422 = field333.method2378();
                                            class177.field2895[var422] = var421;
                                            if (class177.field2897[var422] != var421) {
                                                class177.field2897[var422] = var421;
                                            }
                                            method41(var422);
                                            field474[++field475 - 1 & 0x1F] = var422;
                                            field336 = -1;
                                            var156 = true;
                                            break label3680;
                                        }
                                        class149.method93("" + field336 + class2.field18 + field407 + class2.field18 + field541 + class2.field18 + field335, (Throwable) null);
                                        method2956();
                                    } catch (IOException var567) {
                                        method2954();
                                    } catch (Exception var568) {
                                        String var425 = "" + field336 + class2.field18 + field407 + class2.field18 + field541 + class2.field18 + field335 + class2.field18 + (Statics.field63 + Statics.field2263.field845[0]) + class2.field18 + (Statics.field1435 + Statics.field2263.field832[0]) + class2.field18;
                                        for (int var426 = 0; var426 < field335 && var426 < 50; var426++) {
                                            var425 = var425 + field333.field1983[var426] + class2.field18;
                                        }
                                        class149.method93(var425, var568);
                                        method2956();
                                    }
                                    var156 = true;
                                }
                            }
                            if (!var156) {
                                break;
                            }
                        }
                        if (field295 == 30) {
                            while (class212.method178()) {
                                field332.method2611(225);
                                field332.method2480(0);
                                int var427 = field332.field1977;
                                Statics.method3249(field332);
                                field332.method2341(field332.field1977 - var427);
                            }
                            Object var428 = Statics.field183.field202;
                            synchronized (Statics.field183.field202) {
                                if (!field286) {
                                    Statics.field183.field198 = 0;
                                } else if (class141.field2141 != 0 || Statics.field183.field198 >= 40) {
                                    field332.method2611(80);
                                    field332.method2480(0);
                                    int var429 = field332.field1977;
                                    int var430 = 0;
                                    for (int var431 = 0; var431 < Statics.field183.field198 && field332.field1977 - var429 < 240; var431++) {
                                        var430++;
                                        int var432 = Statics.field183.field199[var431];
                                        if (var432 < 0) {
                                            var432 = 0;
                                        } else if (var432 > 502) {
                                            var432 = 502;
                                        }
                                        int var433 = Statics.field183.field203[var431];
                                        if (var433 < 0) {
                                            var433 = 0;
                                        } else if (var433 > 764) {
                                            var433 = 764;
                                        }
                                        int var434 = var432 * 765 + var433;
                                        if (Statics.field183.field199[var431] == -1 && Statics.field183.field203[var431] == -1) {
                                            var433 = -1;
                                            var432 = -1;
                                            var434 = 524287;
                                        }
                                        if (field334 != var433 || field300 != var432) {
                                            int var435 = var433 - field334;
                                            field334 = var433;
                                            int var436 = var432 - field300;
                                            field300 = var432;
                                            if (field301 < 8 && var435 >= -32 && var435 <= 31 && var436 >= -32 && var436 <= 31) {
                                                var435 += 32;
                                                var436 += 32;
                                                field332.method2525((field301 << 12) + (var435 << 6) + var436);
                                                field301 = 0;
                                            } else if (field301 < 8) {
                                                field332.method2331((field301 << 19) + 8388608 + var434);
                                                field301 = 0;
                                            } else {
                                                field332.method2332((field301 << 19) + -1073741824 + var434);
                                                field301 = 0;
                                            }
                                        } else if (field301 < 2047) {
                                            field301++;
                                        }
                                    }
                                    field332.method2341(field332.field1977 - var429);
                                    if (var430 >= Statics.field183.field198) {
                                        Statics.field183.field198 = 0;
                                    } else {
                                        Statics.field183.field198 -= var430;
                                        for (int var437 = 0; var437 < Statics.field183.field198; var437++) {
                                            Statics.field183.field203[var437] = Statics.field183.field203[var430 + var437];
                                            Statics.field183.field199[var437] = Statics.field183.field199[var430 + var437];
                                        }
                                    }
                                }
                            }
                            if (class141.field2141 == 1 || !Statics.field2632 && class141.field2141 == 4 || class141.field2141 == 2) {
                                long var439 = (class141.field2144 - field298) / 50L;
                                if (var439 > 4095L) {
                                    var439 = 4095L;
                                }
                                field298 = class141.field2144;
                                int var441 = class141.field2143;
                                if (var441 < 0) {
                                    var441 = 0;
                                } else if (var441 > Statics.field2170) {
                                    var441 = Statics.field2170;
                                }
                                int var442 = class141.field2142;
                                if (var442 < 0) {
                                    var442 = 0;
                                } else if (var442 > Statics.field1027) {
                                    var442 = Statics.field1027;
                                }
                                int var443 = (int) var439;
                                field332.method2611(35);
                                field332.method2525((class141.field2141 == 2 ? 1 : 0) + (var443 << 1));
                                field332.method2525(var442);
                                field332.method2525(var441);
                            }
                            if (class138.field2103 > 0) {
                                field332.method2611(12);
                                field332.method2525(0);
                                int var444 = field332.field1977;
                                long var445 = class116.method1946();
                                for (int var447 = 0; var447 < class138.field2103; var447++) {
                                    long var448 = var445 - field506;
                                    if (var448 > 16777215L) {
                                        var448 = 16777215L;
                                    }
                                    field506 = var445;
                                    field332.method2383((int) var448);
                                    field332.method2368(class138.field2102[var447]);
                                }
                                field332.method2340(field332.field1977 - var444);
                            }
                            if (field383 > 0) {
                                field383--;
                            }
                            if (class138.field2096[96] || class138.field2096[97] || class138.field2096[98] || class138.field2096[99]) {
                                field382 = true;
                            }
                            if (field382 && field383 <= 0) {
                                field383 = 20;
                                field382 = false;
                                field332.method2611(165);
                                field332.method2377(field404);
                                field332.method2525(field323);
                            }
                            if (Statics.field1872 && !field302) {
                                field302 = true;
                                field332.method2611(145);
                                field332.method2480(1);
                            }
                            if (!Statics.field1872 && field302) {
                                field302 = false;
                                field332.method2611(145);
                                field332.method2480(0);
                            }
                            if (Statics.field2194 != field304) {
                                field304 = Statics.field2194;
                                int var450 = Statics.field2194;
                                int[] var451 = Statics.field1018.field1381;
                                int var452 = var451.length;
                                for (int var453 = 0; var453 < var452; var453++) {
                                    var451[var453] = 0;
                                }
                                int var454 = 1;
                                while (true) {
                                    if (var454 >= 103) {
                                        int var457 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                                        int var458 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                                        Statics.field1018.method1644();
                                        for (int var459 = 1; var459 < 103; var459++) {
                                            for (int var460 = 1; var460 < 103; var460++) {
                                                if ((class6.field70[var450][var460][var459] & 0x18) == 0) {
                                                    method177(var450, var460, var459, var457, var458);
                                                }
                                                if (var450 < 3 && (class6.field70[var450 + 1][var460][var459] & 0x8) != 0) {
                                                    method177(var450 + 1, var460, var459, var457, var458);
                                                }
                                            }
                                        }
                                        field374 = 0;
                                        for (int var461 = 0; var461 < 104; var461++) {
                                            for (int var462 = 0; var462 < 104; var462++) {
                                                int var463 = Statics.field2231.method1810(Statics.field2194, var461, var462);
                                                if (var463 != 0) {
                                                    int var464 = var463 >> 14 & 0x7FFF;
                                                    int var465 = class41.method3164(var464).field929;
                                                    if (var465 >= 0) {
                                                        int var466 = var461;
                                                        int var467 = var462;
                                                        if (var465 != 22 && var465 != 29 && var465 != 34 && var465 != 36 && var465 != 46 && var465 != 47 && var465 != 48) {
                                                            int[][] var468 = field292[Statics.field2194].field1885;
                                                            for (int var469 = 0; var469 < 10; var469++) {
                                                                int var470 = (int) (Math.random() * 4.0D);
                                                                if (var470 == 0 && var466 > 0 && var466 > var461 - 3 && (var468[var466 - 1][var467] & 0x1240108) == 0) {
                                                                    var466--;
                                                                }
                                                                if (var470 == 1 && var466 < 103 && var466 < var461 + 3 && (var468[var466 + 1][var467] & 0x1240180) == 0) {
                                                                    var466++;
                                                                }
                                                                if (var470 == 2 && var467 > 0 && var467 > var462 - 3 && (var468[var466][var467 - 1] & 0x1240102) == 0) {
                                                                    var467--;
                                                                }
                                                                if (var470 == 3 && var467 < 103 && var467 < var462 + 3 && (var468[var466][var467 + 1] & 0x1240120) == 0) {
                                                                    var467++;
                                                                }
                                                            }
                                                        }
                                                        field521[field374] = Statics.field664[var465];
                                                        field294[field374] = var466;
                                                        field388[field374] = var467;
                                                        field374++;
                                                    }
                                                }
                                            }
                                        }
                                        Statics.field1050.method1571();
                                        break;
                                    }
                                    int var455 = (103 - var454) * 2048 + 24628;
                                    for (int var456 = 1; var456 < 103; var456++) {
                                        if ((class6.field70[var450][var456][var454] & 0x18) == 0) {
                                            Statics.field2231.method1921(var451, var455, 512, var450, var456, var454);
                                        }
                                        if (var450 < 3 && (class6.field70[var450 + 1][var456][var454] & 0x8) != 0) {
                                            Statics.field2231.method1921(var451, var455, 512, var450 + 1, var456, var454);
                                        }
                                        var455 += 4;
                                    }
                                    var454++;
                                }
                            }
                            if (field295 == 30) {
                                for (class17 var471 = (class17) field422.method3575(); var471 != null; var471 = (class17) field422.method3565()) {
                                    if (var471.field234 > 0) {
                                        var471.field234--;
                                    }
                                    if (var471.field234 != 0) {
                                        if (var471.field242 > 0) {
                                            var471.field242--;
                                        }
                                        if (var471.field242 == 0 && var471.field226 >= 1 && var471.field224 >= 1 && var471.field226 <= 102 && var471.field224 <= 102 && (var471.field231 < 0 || class6.method586(var471.field231, var471.field236))) {
                                            method955(var471.field233, var471.field225, var471.field226, var471.field224, var471.field231, var471.field232, var471.field236);
                                            var471.field242 = -1;
                                            if (var471.field231 == var471.field228 && var471.field228 == -1) {
                                                var471.method3647();
                                            } else if (var471.field231 == var471.field228 && var471.field241 == var471.field232 && var471.field236 == var471.field229) {
                                                var471.method3647();
                                            }
                                        }
                                    } else if (var471.field228 < 0 || class6.method586(var471.field228, var471.field229)) {
                                        method955(var471.field233, var471.field225, var471.field226, var471.field224, var471.field228, var471.field241, var471.field229);
                                        var471.method3647();
                                    }
                                }
                                method12();
                                field442++;
                                if (field442 > 750) {
                                    method2954();
                                } else {
                                    int var472 = class33.field739;
                                    int[] var473 = class33.field740;
                                    for (int var474 = 0; var474 < var472; var474++) {
                                        class3 var475 = field411[var473[var474]];
                                        if (var475 != null) {
                                            method2042(var475, 1);
                                        }
                                    }
                                    method3371();
                                    method3685();
                                    field539++;
                                    if (field401 != 0) {
                                        field305 += 20;
                                        if (field305 >= 400) {
                                            field401 = 0;
                                        }
                                    }
                                    if (Statics.field3171 != null) {
                                        field402++;
                                        if (field402 >= 15) {
                                            method38(Statics.field3171);
                                            Statics.field3171 = null;
                                        }
                                    }
                                    class174 var476 = Statics.field2733;
                                    class174 var477 = Statics.field2891;
                                    Statics.field2733 = null;
                                    Statics.field2891 = null;
                                    field465 = null;
                                    field342 = false;
                                    field466 = false;
                                    field511 = 0;
                                    while (true) {
                                        while (class138.method2037() && field511 < 128) {
                                            if (field355 >= 2 && class138.field2096[82] && Statics.field159 == 66) {
                                                String var478 = "";
                                                Iterator var479 = class12.field170.iterator();
                                                while (var479.hasNext()) {
                                                    class36 var480 = (class36) var479.next();
                                                    var478 = var478 + var480.field767 + ':' + var480.field769 + '\n';
                                                }
                                                Statics.field1147.setContents(new StringSelection(var478), (ClipboardOwner) null);
                                            } else {
                                                field513[field511] = Statics.field159;
                                                field512[field511] = Statics.field645;
                                                field511++;
                                            }
                                        }
                                        if (field457 != -1) {
                                            method217(field457, 0, 0, Statics.field1027, Statics.field2170, 0, 0);
                                        }
                                        field360++;
                                        while (true) {
                                            class1 var483;
                                            class174 var484;
                                            class174 var485;
                                            do {
                                                var483 = (class1) field488.method3564();
                                                if (var483 == null) {
                                                    while (true) {
                                                        class1 var486;
                                                        class174 var487;
                                                        class174 var488;
                                                        do {
                                                            var486 = (class1) field489.method3564();
                                                            if (var486 == null) {
                                                                while (true) {
                                                                    class1 var489;
                                                                    class174 var490;
                                                                    class174 var491;
                                                                    do {
                                                                        var489 = (class1) field487.method3564();
                                                                        if (var489 == null) {
                                                                            boolean var492 = false;
                                                                            while (!var492) {
                                                                                var492 = true;
                                                                                for (int var493 = 0; var493 < field430 - 1; var493++) {
                                                                                    if (field433[var493] < 1000 && field433[var493 + 1] > 1000) {
                                                                                        String var494 = field397[var493];
                                                                                        field397[var493] = field397[var493 + 1];
                                                                                        field397[var493 + 1] = var494;
                                                                                        String var495 = field435[var493];
                                                                                        field435[var493] = field435[var493 + 1];
                                                                                        field435[var493 + 1] = var495;
                                                                                        int var496 = field433[var493];
                                                                                        field433[var493] = field433[var493 + 1];
                                                                                        field433[var493 + 1] = var496;
                                                                                        int var497 = field420[var493];
                                                                                        field420[var493] = field420[var493 + 1];
                                                                                        field420[var493 + 1] = var497;
                                                                                        int var498 = field432[var493];
                                                                                        field432[var493] = field432[var493 + 1];
                                                                                        field432[var493 + 1] = var498;
                                                                                        int var499 = field434[var493];
                                                                                        field434[var493] = field434[var493 + 1];
                                                                                        field434[var493 + 1] = var499;
                                                                                        var492 = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (Statics.field850 == null && field461 == null) {
                                                                                int var500 = class141.field2141;
                                                                                if (field429) {
                                                                                    if (var500 != 1 && (Statics.field2632 || var500 != 4)) {
                                                                                        int var501 = class141.field2135;
                                                                                        int var502 = class141.field2136;
                                                                                        if (var501 < Statics.field235 - 10 || var501 > Statics.field235 + Statics.field2289 + 10 || var502 < Statics.field195 - 10 || var502 > Statics.field574 + Statics.field195 + 10) {
                                                                                            field429 = false;
                                                                                            method3139(Statics.field235, Statics.field195, Statics.field2289, Statics.field574);
                                                                                        }
                                                                                    }
                                                                                    if (var500 == 1 || !Statics.field2632 && var500 == 4) {
                                                                                        int var503 = Statics.field235;
                                                                                        int var504 = Statics.field195;
                                                                                        int var505 = Statics.field2289;
                                                                                        int var506 = class141.field2142;
                                                                                        int var507 = class141.field2143;
                                                                                        int var508 = -1;
                                                                                        for (int var509 = 0; var509 < field430; var509++) {
                                                                                            int var510 = (field430 - 1 - var509) * 15 + var504 + 31;
                                                                                            if (var506 > var503 && var506 < var503 + var505 && var507 > var510 - 13 && var507 < var510 + 3) {
                                                                                                var508 = var509;
                                                                                            }
                                                                                        }
                                                                                        if (var508 != -1) {
                                                                                            method3233(var508);
                                                                                        }
                                                                                        field429 = false;
                                                                                        method3139(Statics.field235, Statics.field195, Statics.field2289, Statics.field574);
                                                                                    }
                                                                                } else {
                                                                                    label3729: {
                                                                                        int var512;
                                                                                        int var513;
                                                                                        label3791: {
                                                                                            if ((var500 == 1 || !Statics.field2632 && var500 == 4) && field430 > 0) {
                                                                                                int var511 = field433[field430 - 1];
                                                                                                if (var511 == 39 || var511 == 40 || var511 == 41 || var511 == 42 || var511 == 43 || var511 == 33 || var511 == 34 || var511 == 35 || var511 == 36 || var511 == 37 || var511 == 38 || var511 == 1005) {
                                                                                                    var512 = field420[field430 - 1];
                                                                                                    var513 = field432[field430 - 1];
                                                                                                    class174 var514 = class174.method2976(var513);
                                                                                                    int var515 = method720(var514);
                                                                                                    boolean var516 = (var515 >> 28 & 0x1) != 0;
                                                                                                    if (var516) {
                                                                                                        break label3791;
                                                                                                    }
                                                                                                    class179 var570 = (class179) null;
                                                                                                    if (class179.method2934(method720(var514))) {
                                                                                                        break label3791;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            if ((var500 == 1 || !Statics.field2632 && var500 == 4) && (field428 == 1 && field430 > 2 || method2032(field430 - 1))) {
                                                                                                var500 = 2;
                                                                                            }
                                                                                            if ((var500 == 1 || !Statics.field2632 && var500 == 4) && field430 > 0) {
                                                                                                int var520 = field430 - 1;
                                                                                                if (var520 >= 0) {
                                                                                                    int var521 = field420[var520];
                                                                                                    int var522 = field432[var520];
                                                                                                    int var523 = field433[var520];
                                                                                                    int var524 = field434[var520];
                                                                                                    String var525 = field435[var520];
                                                                                                    String var526 = field397[var520];
                                                                                                    method2041(var521, var522, var523, var524, var525, var526, class141.field2142, class141.field2143);
                                                                                                }
                                                                                            }
                                                                                            if (var500 == 2 && field430 > 0) {
                                                                                                method147(class141.field2142, class141.field2143);
                                                                                            }
                                                                                            break label3729;
                                                                                        }
                                                                                        if (Statics.field850 != null && !field408 && field428 != 1 && !method2032(field430 - 1) && field430 > 0) {
                                                                                            int var517 = field405;
                                                                                            int var518 = field406;
                                                                                            class31 var519 = Statics.field124;
                                                                                            method2041(var519.field689, var519.field692, var519.field691, var519.field690, var519.field693, var519.field693, var517, var518);
                                                                                            Statics.field124 = null;
                                                                                        }
                                                                                        field408 = false;
                                                                                        field409 = 0;
                                                                                        if (Statics.field850 != null) {
                                                                                            method38(Statics.field850);
                                                                                        }
                                                                                        Statics.field850 = class174.method2976(var513);
                                                                                        field348 = var512;
                                                                                        field405 = class141.field2142;
                                                                                        field406 = class141.field2143;
                                                                                        if (field430 > 0) {
                                                                                            method2267(field430 - 1);
                                                                                        }
                                                                                        method38(Statics.field850);
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (field461 != null) {
                                                                                method38(field461);
                                                                                Statics.field1756++;
                                                                                if (field342 && field466) {
                                                                                    int var527 = class141.field2135;
                                                                                    int var528 = class141.field2136;
                                                                                    int var529 = var527 - field561;
                                                                                    int var530 = var528 - field464;
                                                                                    if (var529 < field441) {
                                                                                        var529 = field441;
                                                                                    }
                                                                                    if (field461.field2764 + var529 > field441 + field462.field2764) {
                                                                                        var529 = field441 + field462.field2764 - field461.field2764;
                                                                                    }
                                                                                    if (var530 < field448) {
                                                                                        var530 = field448;
                                                                                    }
                                                                                    if (field461.field2765 + var530 > field448 + field462.field2765) {
                                                                                        var530 = field448 + field462.field2765 - field461.field2765;
                                                                                    }
                                                                                    int var531 = var529 - field439;
                                                                                    int var532 = var530 - field471;
                                                                                    int var533 = field461.field2825;
                                                                                    if (Statics.field1756 > field461.field2826 && (var531 > var533 || var531 < -var533 || var532 > var533 || var532 < -var533)) {
                                                                                        field546 = true;
                                                                                    }
                                                                                    int var534 = field462.field2864 + (var529 - field441);
                                                                                    int var535 = field462.field2771 + (var530 - field448);
                                                                                    if (field461.field2770 != null && field546) {
                                                                                        class1 var536 = new class1();
                                                                                        var536.field11 = field461;
                                                                                        var536.field4 = var534;
                                                                                        var536.field5 = var535;
                                                                                        var536.field13 = field461.field2770;
                                                                                        class37.method2222(var536);
                                                                                    }
                                                                                    if (class141.field2134 == 0) {
                                                                                        if (field546) {
                                                                                            if (field461.field2805 != null) {
                                                                                                class1 var537 = new class1();
                                                                                                var537.field11 = field461;
                                                                                                var537.field4 = var534;
                                                                                                var537.field5 = var535;
                                                                                                var537.field7 = field465;
                                                                                                var537.field13 = field461.field2805;
                                                                                                class37.method2222(var537);
                                                                                            }
                                                                                            if (field465 != null && method2366(field461) != null) {
                                                                                                field332.method2611(83);
                                                                                                field332.method2525(field465.field2869);
                                                                                                field332.method2375(field461.field2869);
                                                                                                field332.method2523(field461.field2750);
                                                                                                field332.method2375(field465.field2750);
                                                                                                field332.method2386(field465.field2749);
                                                                                                field332.method2329(field461.field2749);
                                                                                            }
                                                                                        } else if ((field428 == 1 || method2032(field430 - 1)) && field430 > 2) {
                                                                                            method147(field561 + field439, field471 + field464);
                                                                                        } else if (field430 > 0) {
                                                                                            int var538 = field561 + field439;
                                                                                            int var539 = field471 + field464;
                                                                                            class31 var540 = Statics.field124;
                                                                                            method2041(var540.field689, var540.field692, var540.field691, var540.field690, var540.field693, var540.field693, var538, var539);
                                                                                            Statics.field124 = null;
                                                                                        }
                                                                                        field461 = null;
                                                                                    }
                                                                                } else if (Statics.field1756 > 1) {
                                                                                    field461 = null;
                                                                                }
                                                                            }
                                                                            if (Statics.field850 != null) {
                                                                                method38(Statics.field850);
                                                                                field409++;
                                                                                if (class141.field2134 == 0) {
                                                                                    if (field408) {
                                                                                        if (Statics.field850 == Statics.field1984 && field348 != field321) {
                                                                                            class174 var541 = Statics.field850;
                                                                                            byte var542 = 0;
                                                                                            if (field363 == 1 && var541.field2769 == 206) {
                                                                                                var542 = 1;
                                                                                            }
                                                                                            if (var541.field2867[field321] <= 0) {
                                                                                                var542 = 0;
                                                                                            }
                                                                                            if (class179.method2934(method720(var541))) {
                                                                                                int var543 = field348;
                                                                                                int var544 = field321;
                                                                                                var541.field2867[var544] = var541.field2867[var543];
                                                                                                var541.field2746[var544] = var541.field2746[var543];
                                                                                                var541.field2867[var543] = -1;
                                                                                                var541.field2746[var543] = 0;
                                                                                            } else if (var542 == 1) {
                                                                                                int var545 = field348;
                                                                                                int var546 = field321;
                                                                                                while (var545 != var546) {
                                                                                                    if (var545 > var546) {
                                                                                                        var541.method3170(var545 - 1, var545);
                                                                                                        var545--;
                                                                                                    } else if (var545 < var546) {
                                                                                                        var541.method3170(var545 + 1, var545);
                                                                                                        var545++;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var541.method3170(field321, field348);
                                                                                            }
                                                                                            field332.method2611(91);
                                                                                            field332.method2369(var542);
                                                                                            field332.method2387(Statics.field850.field2749);
                                                                                            field332.method2525(field348);
                                                                                            field332.method2375(field321);
                                                                                        }
                                                                                    } else if ((field428 == 1 || method2032(field430 - 1)) && field430 > 2) {
                                                                                        method147(field405, field406);
                                                                                    } else if (field430 > 0) {
                                                                                        int var547 = field405;
                                                                                        int var548 = field406;
                                                                                        class31 var549 = Statics.field124;
                                                                                        method2041(var549.field689, var549.field692, var549.field691, var549.field690, var549.field693, var549.field693, var547, var548);
                                                                                        Statics.field124 = null;
                                                                                    }
                                                                                    field402 = 10;
                                                                                    class141.field2141 = 0;
                                                                                    Statics.field850 = null;
                                                                                } else if (field409 >= 5 && (class141.field2135 > field405 + 5 || class141.field2135 < field405 - 5 || class141.field2136 > field406 + 5 || class141.field2136 < field406 - 5)) {
                                                                                    field408 = true;
                                                                                }
                                                                            }
                                                                            if (class87.field1495 != -1) {
                                                                                int var550 = class87.field1495;
                                                                                int var551 = class87.field1474;
                                                                                field332.method2611(2);
                                                                                field332.method2480(5);
                                                                                field332.method2368(class138.field2096[82] ? (class138.field2096[81] ? 2 : 1) : 0);
                                                                                field332.method2375(Statics.field63 + var550);
                                                                                field332.method2525(Statics.field1435 + var551);
                                                                                class87.field1495 = -1;
                                                                                field398 = class141.field2142;
                                                                                field399 = class141.field2143;
                                                                                field401 = 1;
                                                                                field305 = 0;
                                                                                field522 = var550;
                                                                                field523 = var551;
                                                                            }
                                                                            if (Statics.field2733 != var476) {
                                                                                if (var476 != null) {
                                                                                    method38(var476);
                                                                                }
                                                                                if (Statics.field2733 != null) {
                                                                                    method38(Statics.field2733);
                                                                                }
                                                                            }
                                                                            if (Statics.field2891 != var477 && field519 == field322) {
                                                                                if (var477 != null) {
                                                                                    method38(var477);
                                                                                }
                                                                                if (Statics.field2891 != null) {
                                                                                    method38(Statics.field2891);
                                                                                }
                                                                            }
                                                                            if (Statics.field2891 == null) {
                                                                                if (field519 > 0) {
                                                                                    field519--;
                                                                                }
                                                                            } else if (field519 < field322) {
                                                                                field519++;
                                                                                if (field519 == field322) {
                                                                                    method38(Statics.field2891);
                                                                                }
                                                                            }
                                                                            method653();
                                                                            if (field536) {
                                                                                method2047();
                                                                            }
                                                                            for (int var552 = 0; var552 < 5; var552++) {
                                                                                int var10002 = field325[var552]++;
                                                                            }
                                                                            Statics.field2125.method195();
                                                                            int var553 = ++class141.field2130 - 1;
                                                                            int var555 = class138.field2095;
                                                                            if (var553 > 15000 && var555 > 15000) {
                                                                                field400 = 250;
                                                                                class141.method1943(14500);
                                                                                field332.method2611(86);
                                                                            }
                                                                            field412++;
                                                                            if (field412 > 500) {
                                                                                field412 = 0;
                                                                                int var557 = (int) (Math.random() * 8.0D);
                                                                                if ((var557 & 0x1) == 1) {
                                                                                    field445 += field344;
                                                                                }
                                                                                if ((var557 & 0x2) == 2) {
                                                                                    field524 += field414;
                                                                                }
                                                                                if ((var557 & 0x4) == 4) {
                                                                                    field358 += field373;
                                                                                }
                                                                            }
                                                                            if (field445 < -50) {
                                                                                field344 = 2;
                                                                            }
                                                                            if (field445 > 50) {
                                                                                field344 = -2;
                                                                            }
                                                                            if (field524 < -55) {
                                                                                field414 = 2;
                                                                            }
                                                                            if (field524 > 55) {
                                                                                field414 = -2;
                                                                            }
                                                                            if (field358 < -40) {
                                                                                field373 = 1;
                                                                            }
                                                                            if (field358 > 40) {
                                                                                field373 = -1;
                                                                            }
                                                                            field365++;
                                                                            if (field365 > 500) {
                                                                                field365 = 0;
                                                                                int var558 = (int) (Math.random() * 8.0D);
                                                                                if ((var558 & 0x1) == 1) {
                                                                                    field361 += field362;
                                                                                }
                                                                                if ((var558 & 0x2) == 2) {
                                                                                    field559 += field364;
                                                                                }
                                                                            }
                                                                            if (field361 < -60) {
                                                                                field362 = 2;
                                                                            }
                                                                            if (field361 > 60) {
                                                                                field362 = -2;
                                                                            }
                                                                            if (field559 < -20) {
                                                                                field364 = 1;
                                                                            }
                                                                            if (field559 > 10) {
                                                                                field364 = -1;
                                                                            }
                                                                            for (class39 var559 = (class39) field558.method3524(); var559 != null; var559 = (class39) field558.method3517()) {
                                                                                if ((long) var559.field854 < class116.method1946() / 1000L - 5L) {
                                                                                    if (var559.field852 > 0) {
                                                                                        class12.method936(5, "", var559.field857 + class158.field2458);
                                                                                    }
                                                                                    if (var559.field852 == 0) {
                                                                                        class12.method936(5, "", var559.field857 + class158.field2443);
                                                                                    }
                                                                                    var559.method3636();
                                                                                }
                                                                            }
                                                                            field338++;
                                                                            if (field338 > 50) {
                                                                                field332.method2611(210);
                                                                            }
                                                                            try {
                                                                                if (Statics.field196 != null && field332.field1977 > 0) {
                                                                                    Statics.field196.method2836(field332.field1983, 0, field332.field1977);
                                                                                    field332.field1977 = 0;
                                                                                    field338 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var561) {
                                                                                method2954();
                                                                            }
                                                                            return;
                                                                        }
                                                                        var490 = var489.field11;
                                                                        if (var490.field2750 < 0) {
                                                                            break;
                                                                        }
                                                                        var491 = class174.method2976(var490.field2778);
                                                                    } while (var491 == null || var491.field2873 == null || var490.field2750 >= var491.field2873.length || var491.field2873[var490.field2750] != var490);
                                                                    class37.method1948(var489, 200000);
                                                                }
                                                            }
                                                            var487 = var486.field11;
                                                            if (var487.field2750 < 0) {
                                                                break;
                                                            }
                                                            var488 = class174.method2976(var487.field2778);
                                                        } while (var488 == null || var488.field2873 == null || var487.field2750 >= var488.field2873.length || var488.field2873[var487.field2750] != var487);
                                                        class37.method2222(var486);
                                                    }
                                                }
                                                var484 = var483.field11;
                                                if (var484.field2750 < 0) {
                                                    break;
                                                }
                                                var485 = class174.method2976(var484.field2778);
                                            } while (var485 == null || var485.field2873 == null || var484.field2750 >= var485.field2873.length || var485.field2873[var484.field2750] != var484);
                                            class37.method1948(var483, 200000);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (field295 == 40 || field295 == 45) {
                    method2935();
                }
                return;
            }
            var2.field2694.method3125(var2.field2696, (int) var2.field3114, var2.field2695, false);
        }
    }

    @ObfuscatedName("client.c(B)V")
    public final void method229() {
        boolean var1 = class184.method970();
        if (var1 && field527 && Statics.field1573 != null) {
            Statics.field1573.method1158();
        }
        if (field295 == 10 || field295 == 20 || field295 == 30) {
            if (field501 != 0L && class116.method1946() > field501) {
                int var2 = field502 ? 2 : 1;
                method1489(var2);
            } else if (field2190) {
                Canvas var3 = Statics.field1041;
                var3.removeKeyListener(class138.field2082);
                var3.removeFocusListener(class138.field2082);
                class138.field2099 = -1;
                class141.method2731(Statics.field1041);
                if (Statics.field1747 != null) {
                    Statics.field1747.method2690(Statics.field1041);
                }
                Statics.field285.method2882();
                Statics.field1041.setBackground(Color.black);
                Canvas var4 = Statics.field1041;
                var4.setFocusTraversalKeysEnabled(false);
                var4.addKeyListener(class138.field2082);
                var4.addFocusListener(class138.field2082);
                class141.method648(Statics.field1041);
                if (Statics.field1747 != null) {
                    Statics.field1747.method2696(Statics.field1041);
                }
                if (field457 != -1) {
                    method1777(field457, Statics.field1027, Statics.field2170, false);
                }
                field2189 = true;
            }
        }
        Dimension var5 = this.method2871();
        if (Statics.field1935 != var5.width || Statics.field1533 != var5.height || field2189) {
            method2785();
            field501 = class116.method1946() + 500L;
            field2189 = false;
        }
        boolean var6 = false;
        if (field2187) {
            field2187 = false;
            var6 = true;
            for (int var7 = 0; var7 < 100; var7++) {
                field508[var7] = true;
            }
        }
        if (var6) {
            method723();
        }
        if (field295 == 0) {
            int var8 = class32.field701;
            String var9 = class32.field710;
            Color var10 = null;
            try {
                Graphics var11 = Statics.field1041.getGraphics();
                if (Statics.field1169 == null) {
                    Statics.field1169 = new Font("Helvetica", 1, 13);
                    Statics.field2019 = Statics.field1041.getFontMetrics(Statics.field1169);
                }
                if (var6) {
                    var11.setColor(Color.black);
                    var11.fillRect(0, 0, Statics.field1027, Statics.field2170);
                }
                if (var10 == null) {
                    var10 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1855 == null) {
                        Statics.field1855 = Statics.field1041.createImage(304, 34);
                    }
                    Graphics var12 = Statics.field1855.getGraphics();
                    var12.setColor(var10);
                    var12.drawRect(0, 0, 303, 33);
                    var12.fillRect(2, 2, var8 * 3, 30);
                    var12.setColor(Color.black);
                    var12.drawRect(1, 1, 301, 31);
                    var12.fillRect(var8 * 3 + 2, 2, 300 - var8 * 3, 30);
                    var12.setFont(Statics.field1169);
                    var12.setColor(Color.white);
                    var12.drawString(var9, (304 - Statics.field2019.stringWidth(var9)) / 2, 22);
                    var11.drawImage(Statics.field1855, Statics.field1027 / 2 - 152, Statics.field2170 / 2 - 18, (ImageObserver) null);
                } catch (Exception var25) {
                    int var14 = Statics.field1027 / 2 - 152;
                    int var15 = Statics.field2170 / 2 - 18;
                    var11.setColor(var10);
                    var11.drawRect(var14, var15, 303, 33);
                    var11.fillRect(var14 + 2, var15 + 2, var8 * 3, 30);
                    var11.setColor(Color.black);
                    var11.drawRect(var14 + 1, var15 + 1, 301, 31);
                    var11.fillRect(var8 * 3 + var14 + 2, var15 + 2, 300 - var8 * 3, 30);
                    var11.setFont(Statics.field1169);
                    var11.setColor(Color.white);
                    var11.drawString(var9, var14 + (304 - Statics.field2019.stringWidth(var9)) / 2, var15 + 22);
                }
            } catch (Exception var26) {
                Statics.field1041.repaint();
            }
        } else if (field295 == 5) {
            class32.method91(Statics.field2637, Statics.field987, Statics.field1022, var6);
        } else if (field295 == 10 || field295 == 11) {
            class32.method91(Statics.field2637, Statics.field987, Statics.field1022, var6);
        } else if (field295 == 20) {
            class32.method91(Statics.field2637, Statics.field987, Statics.field1022, var6);
        } else if (field295 == 25) {
            if (field349 == 1) {
                if (field555 > field381) {
                    field381 = field555;
                }
                int var17 = (field381 * 50 - field555 * 50) / field381;
                method953(class158.field2307 + class2.field23 + class2.field20 + var17 + "%" + class2.field21, false);
            } else if (field349 == 2) {
                if (field347 > field288) {
                    field288 = field347;
                }
                int var18 = (field288 * 50 - field347 * 50) / field288 + 50;
                method953(class158.field2307 + class2.field23 + class2.field20 + var18 + "%" + class2.field21, false);
            } else {
                method953(class158.field2307, false);
            }
        } else if (field295 == 30) {
            method165();
        } else if (field295 == 40) {
            method953(class158.field2308 + class2.field23 + class158.field2494, false);
        } else if (field295 == 45) {
            method953(class158.field2497, false);
        }
        if (field295 == 30 && field500 == 0 && !var6) {
            try {
                Graphics var19 = Statics.field1041.getGraphics();
                for (int var20 = 0; var20 < field491; var20++) {
                    if (field284[var20]) {
                        Statics.field1050.method1517(var19, field496[var20], field497[var20], field498[var20], field499[var20]);
                        field284[var20] = false;
                    }
                }
            } catch (Exception var28) {
                Statics.field1041.repaint();
            }
        } else if (field295 > 0) {
            try {
                Graphics var22 = Statics.field1041.getGraphics();
                Statics.field1050.method1516(var22, 0, 0);
                for (int var23 = 0; var23 < field491; var23++) {
                    field284[var23] = false;
                }
            } catch (Exception var27) {
                Statics.field1041.repaint();
            }
        }
    }

    @ObfuscatedName("client.l(B)V")
    public final void method230() {
        if (Statics.field2125.method196()) {
            Statics.field2125.method193();
        }
        if (Statics.field183 != null) {
            Statics.field183.field197 = false;
        }
        Statics.field183 = null;
        if (Statics.field196 != null) {
            Statics.field196.method2841();
            Statics.field196 = null;
        }
        class138.method3033();
        if (class141.field2132 != null) {
            class141 var1 = class141.field2132;
            synchronized (class141.field2132) {
                class141.field2132 = null;
            }
        }
        Statics.field1747 = null;
        if (Statics.field1573 != null) {
            Statics.field1573.method1172();
        }
        if (Statics.field1075 != null) {
            Statics.field1075.method1172();
        }
        if (Statics.field2720 != null) {
            Statics.field2720.method2841();
        }
        Object var3 = class171.field2707;
        synchronized (class171.field2707) {
            if (class171.field2702 != 0) {
                class171.field2702 = 1;
                try {
                    class171.field2707.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        class150.method2680();
    }

    @ObfuscatedName("av.u(II)V")
    public static void method900(int arg0) {
        if (field295 == arg0) {
            return;
        }
        if (field295 == 0) {
            Statics.field1855 = null;
            Statics.field1169 = null;
            Statics.field2019 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field483 = 0;
            field346 = 0;
            field567 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1531 != null) {
            Statics.field1531.method2841();
            Statics.field1531 = null;
        }
        if (field295 == 25) {
            field349 = 0;
            field555 = 0;
            field381 = 1;
            field347 = 0;
            field288 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class32.method633(Statics.field1041, Statics.field187, Statics.field2039, true, 0);
        } else if (arg0 == 20) {
            class32.method633(Statics.field1041, Statics.field187, Statics.field2039, true, field295 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class32.method633(Statics.field1041, Statics.field187, Statics.field2039, false, 4);
        } else if (Statics.field702) {
            Statics.field709 = null;
            Statics.field715 = null;
            Statics.field721 = null;
            Statics.field700 = null;
            Statics.field731 = null;
            Statics.field697 = null;
            Statics.field1540 = null;
            Statics.field856 = null;
            Statics.field3118 = null;
            Statics.field2016 = null;
            Statics.field2660 = null;
            Statics.field1503 = null;
            Statics.field1406 = null;
            Statics.field615 = null;
            Statics.field166 = null;
            Statics.field707 = null;
            Statics.field2651 = null;
            Statics.field185 = null;
            Statics.field674 = null;
            Statics.field1407 = null;
            Statics.field789 = null;
            Statics.field1634 = null;
            class184.field2954 = 1;
            Statics.field1076 = null;
            Statics.field2904 = -1;
            Statics.field2952 = -1;
            Statics.field2930 = 0;
            Statics.field2957 = false;
            Statics.field2956 = 2;
            class172.method2043(true);
            Statics.field702 = false;
        }
        field295 = arg0;
    }

    @ObfuscatedName("client.p(B)V")
    public void method231() {
        if (field295 != 1000) {
            boolean var1 = class172.method2265();
            if (!var1) {
                this.method232();
            }
        }
    }

    @ObfuscatedName("client.n(I)V")
    public void method232() {
        if (class172.field2726 >= 4) {
            this.method2869("js5crc");
            field295 = 1000;
            return;
        }
        if (class172.field2711 >= 4) {
            if (field295 <= 5) {
                this.method2869("js5io");
                field295 = 1000;
                return;
            }
            field317 = 3000;
            class172.field2711 = 3;
        }
        if (--field317 + 1 > 0) {
            return;
        }
        try {
            if (field316 == 0) {
                Statics.field154 = Statics.field925.method2740(Statics.field1003, Statics.field240);
                field316++;
            }
            if (field316 == 1) {
                if (Statics.field154.field2200 == 2) {
                    this.method233(-1);
                    return;
                }
                if (Statics.field154.field2200 == 1) {
                    field316++;
                }
            }
            if (field316 == 2) {
                Statics.field1950 = new class144((Socket) Statics.field154.field2202, Statics.field925);
                class120 var1 = new class120(5);
                var1.method2480(15);
                var1.method2332(116);
                Statics.field1950.method2836(var1.field1983, 0, 5);
                field316++;
                Statics.field1751 = class116.method1946();
            }
            if (field316 == 3) {
                if (field295 <= 5 || Statics.field1950.method2834() > 0) {
                    int var2 = Statics.field1950.method2842();
                    if (var2 != 0) {
                        this.method233(var2);
                        return;
                    }
                    field316++;
                } else if (class116.method1946() - Statics.field1751 > 30000L) {
                    this.method233(-2);
                    return;
                }
            }
            if (field316 == 4) {
                class144 var3 = Statics.field1950;
                boolean var4 = field295 > 20;
                if (Statics.field2720 != null) {
                    try {
                        Statics.field2720.method2841();
                    } catch (Exception var14) {
                    }
                    Statics.field2720 = null;
                }
                Statics.field2720 = var3;
                class172.method2043(var4);
                class172.field2727.field1977 = 0;
                Statics.field2100 = null;
                Statics.field1349 = null;
                class172.field2722 = 0;
                while (true) {
                    class173 var6 = (class173) class172.field2713.method3530();
                    if (var6 == null) {
                        while (true) {
                            class173 var7 = (class173) class172.field2718.method3530();
                            if (var7 == null) {
                                if (class172.field2725 != 0) {
                                    try {
                                        class120 var8 = new class120(4);
                                        var8.method2480(4);
                                        var8.method2480(class172.field2725);
                                        var8.method2525(0);
                                        Statics.field2720.method2836(var8.field1983, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2720.method2841();
                                        } catch (Exception var12) {
                                        }
                                        class172.field2711++;
                                        Statics.field2720 = null;
                                    }
                                }
                                class172.field2710 = 0;
                                Statics.field3232 = class116.method1946();
                                Statics.field154 = null;
                                Statics.field1950 = null;
                                field316 = 0;
                                field299 = 0;
                                return;
                            }
                            class172.field2729.method3611(var7);
                            class172.field2716.method3528(var7, var7.field3114);
                            class172.field2717++;
                            class172.field2719--;
                        }
                    }
                    class172.field2721.method3528(var6, var6.field3114);
                    class172.field2712++;
                    class172.field2714--;
                }
            }
        } catch (IOException var15) {
            this.method233(-3);
        }
    }

    @ObfuscatedName("client.w(II)V")
    public void method233(int arg0) {
        Statics.field154 = null;
        Statics.field1950 = null;
        field316 = 0;
        if (Statics.field240 == Statics.field201) {
            Statics.field240 = Statics.field473;
        } else {
            Statics.field240 = Statics.field201;
        }
        field299++;
        if (field299 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field295 <= 5) {
                this.method2869("js5connect_full");
                field295 = 1000;
            } else {
                field317 = 3000;
            }
        } else if (field299 >= 2 && arg0 == 6) {
            this.method2869("js5connect_outofdate");
            field295 = 1000;
        } else if (field299 >= 4) {
            if (field295 <= 5) {
                this.method2869("js5connect");
                field295 = 1000;
            } else {
                field317 = 3000;
            }
        }
    }

    @ObfuscatedName("fi.z(B)V")
    public static void method3218() {
        if (field315 == 0) {
            Statics.field2231 = new class87(4, 104, 104, class6.field84);
            for (int var0 = 0; var0 < 4; var0++) {
                field292[var0] = new class109(104, 104);
            }
            Statics.field1018 = new class79(512, 512);
            class32.field710 = class158.field2310;
            class32.field701 = 5;
            field315 = 20;
        } else if (field315 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class92.field1564[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class87.method1848(var1, 500, 800, 512, 334);
            class32.field710 = class158.field2311;
            class32.field701 = 10;
            field315 = 30;
        } else if (field315 == 30) {
            Statics.field318 = method2826(0, false, true, true);
            Statics.field138 = method2826(1, false, true, true);
            Statics.field2186 = method2826(2, true, false, true);
            Statics.field1072 = method2826(3, false, true, true);
            Statics.field467 = method2826(4, false, true, true);
            Statics.field772 = method2826(5, true, true, true);
            Statics.field359 = method2826(6, true, true, false);
            Statics.field584 = method2826(7, false, true, true);
            Statics.field2039 = method2826(8, false, true, true);
            Statics.field2693 = method2826(9, false, true, true);
            Statics.field187 = method2826(10, false, true, true);
            Statics.field1423 = method2826(11, false, true, true);
            Statics.field2736 = method2826(12, false, true, true);
            Statics.field996 = method2826(13, true, false, true);
            Statics.field2070 = method2826(14, false, true, false);
            Statics.field1779 = method2826(15, false, true, true);
            class32.field710 = class158.field2312;
            class32.field701 = 20;
            field315 = 40;
        } else if (field315 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field318.method3117() * 4 / 100;
            int var8 = var7 + Statics.field138.method3117() * 4 / 100;
            int var9 = var8 + Statics.field2186.method3117() * 2 / 100;
            int var10 = var9 + Statics.field1072.method3117() * 2 / 100;
            int var11 = var10 + Statics.field467.method3117() * 6 / 100;
            int var12 = var11 + Statics.field772.method3117() * 4 / 100;
            int var13 = var12 + Statics.field359.method3117() * 2 / 100;
            int var14 = var13 + Statics.field584.method3117() * 60 / 100;
            int var15 = var14 + Statics.field2039.method3117() * 2 / 100;
            int var16 = var15 + Statics.field2693.method3117() * 2 / 100;
            int var17 = var16 + Statics.field187.method3117() * 2 / 100;
            int var18 = var17 + Statics.field1423.method3117() * 2 / 100;
            int var19 = var18 + Statics.field2736.method3117() * 2 / 100;
            int var20 = var19 + Statics.field996.method3117() * 2 / 100;
            int var21 = var20 + Statics.field2070.method3117() * 2 / 100;
            int var22 = var21 + Statics.field1779.method3117() * 2 / 100;
            if (var22 == 100) {
                class32.field710 = class158.field2390;
                class32.field701 = 30;
                field315 = 45;
            } else {
                if (var22 != 0) {
                    class32.field710 = class158.field2452 + var22 + "%";
                }
                class32.field701 = 30;
            }
        } else if (field315 == 45) {
            class57.method176(22050, !field384, 2);
            class185 var23 = new class185();
            var23.method3444(9, 128);
            Statics.field1573 = class57.method662(Statics.field925, Statics.field1041, 0, 22050);
            Statics.field1573.method1151(var23);
            class169 var24 = Statics.field1779;
            class169 var25 = Statics.field2070;
            class169 var26 = Statics.field467;
            Statics.field2959 = var24;
            Statics.field2951 = var25;
            Statics.field2958 = var26;
            Statics.field2953 = var23;
            Statics.field1075 = class57.method662(Statics.field925, Statics.field1041, 1, 2048);
            Statics.field1135 = new class56();
            Statics.field1075.method1151(Statics.field1135);
            Statics.field1590 = new class75(22050, Statics.field1154);
            class32.field710 = class158.field2315;
            class32.field701 = 35;
            field315 = 50;
        } else if (field315 == 50) {
            int var27 = 0;
            if (Statics.field987 == null) {
                class169 var28 = Statics.field2039;
                class169 var29 = Statics.field996;
                int var30 = var28.method3052("p11_full");
                int var31 = var28.method3053(var30, "");
                class225 var32;
                if (class77.method747(var28, var30, var31)) {
                    var32 = class77.method2930(var29.method3037(var30, var31));
                } else {
                    var32 = null;
                }
                Statics.field987 = var32;
            } else {
                var27++;
            }
            if (Statics.field1022 == null) {
                class169 var34 = Statics.field2039;
                class169 var35 = Statics.field996;
                int var36 = var34.method3052("p12_full");
                int var37 = var34.method3053(var36, "");
                class225 var38;
                if (class77.method747(var34, var36, var37)) {
                    var38 = class77.method2930(var35.method3037(var36, var37));
                } else {
                    var38 = null;
                }
                Statics.field1022 = var38;
            } else {
                var27++;
            }
            if (Statics.field2637 == null) {
                class169 var40 = Statics.field2039;
                class169 var41 = Statics.field996;
                int var42 = var40.method3052("b12_full");
                int var43 = var40.method3053(var42, "");
                class225 var44;
                if (class77.method747(var40, var42, var43)) {
                    var44 = class77.method2930(var41.method3037(var42, var43));
                } else {
                    var44 = null;
                }
                Statics.field2637 = var44;
            } else {
                var27++;
            }
            if (var27 < 3) {
                class32.field710 = class158.field2447 + var27 * 100 / 3 + "%";
                class32.field701 = 40;
            } else {
                Statics.field1743 = new class161(true);
                class32.field710 = class158.field2317;
                class32.field701 = 40;
                field315 = 60;
            }
        } else if (field315 == 60) {
            int var46 = class32.method88(Statics.field187, Statics.field2039);
            int var47 = class32.method2786();
            if (var46 < var47) {
                class32.field710 = class158.field2318 + var46 * 100 / var47 + "%";
                class32.field701 = 50;
            } else {
                class32.field710 = class158.field2319;
                class32.field701 = 50;
                method900(5);
                field315 = 70;
            }
        } else if (field315 == 70) {
            if (Statics.field2186.method3041()) {
                class47.method148(Statics.field2186);
                class169 var48 = Statics.field2186;
                Statics.field2023 = var48;
                class45.method1543(Statics.field2186, Statics.field584);
                class169 var49 = Statics.field2186;
                class169 var50 = Statics.field584;
                boolean var51 = field384;
                Statics.field901 = var49;
                Statics.field917 = var50;
                class41.field913 = var51;
                class40.method544(Statics.field2186, Statics.field584);
                class169 var52 = Statics.field2186;
                class169 var53 = Statics.field584;
                boolean var54 = field291;
                class225 var55 = Statics.field987;
                Statics.field762 = var52;
                Statics.field1074 = var53;
                Statics.field158 = var54;
                Statics.field1079 = Statics.field762.method3047(10);
                Statics.field1125 = var55;
                class169 var56 = Statics.field2186;
                class169 var57 = Statics.field318;
                class169 var58 = Statics.field138;
                Statics.field970 = var56;
                Statics.field963 = var57;
                Statics.field964 = var58;
                class169 var59 = Statics.field2186;
                class169 var60 = Statics.field584;
                Statics.field1002 = var59;
                Statics.field986 = var60;
                class169 var61 = Statics.field2186;
                Statics.field1045 = var61;
                class169 var62 = Statics.field2186;
                Statics.field1132 = var62;
                Statics.field1130 = Statics.field1132.method3047(16);
                class174.method2953(Statics.field1072, Statics.field584, Statics.field2039, Statics.field996);
                class51.method3104(Statics.field2186);
                class169 var63 = Statics.field2186;
                Statics.field1054 = var63;
                class46.method1752(Statics.field2186);
                class50.method741(Statics.field2186);
                Statics.field2125 = new class20();
                class32.field710 = class158.field2372;
                class32.field701 = 60;
                field315 = 80;
            } else {
                class32.field710 = class158.field2371 + Statics.field2186.method3124() + "%";
                class32.field701 = 60;
            }
        } else if (field315 == 80) {
            int var64 = 0;
            if (Statics.field2264 == null) {
                class169 var65 = Statics.field2039;
                int var66 = var65.method3052("compass");
                int var67 = var65.method3053(var66, "");
                class79 var68 = class77.method2838(var65, var66, var67);
                Statics.field2264 = var68;
            } else {
                var64++;
            }
            if (Statics.field2657 == null) {
                class169 var69 = Statics.field2039;
                int var70 = var69.method3052("mapedge");
                int var71 = var69.method3053(var70, "");
                class79 var72 = class77.method2838(var69, var70, var71);
                Statics.field2657 = var72;
            } else {
                var64++;
            }
            if (Statics.field2074 == null) {
                Statics.field2074 = class77.method551(Statics.field2039, "mapscene", "");
            } else {
                var64++;
            }
            if (Statics.field664 == null) {
                Statics.field664 = Statics.method941(Statics.field2039, "mapfunction", "");
            } else {
                var64++;
            }
            if (Statics.field2280 == null) {
                Statics.field2280 = Statics.method941(Statics.field2039, "hitmarks", "");
            } else {
                var64++;
            }
            if (Statics.field2633 == null) {
                Statics.field2633 = Statics.method941(Statics.field2039, "headicons_pk", "");
            } else {
                var64++;
            }
            if (Statics.field1947 == null) {
                Statics.field1947 = Statics.method941(Statics.field2039, "headicons_prayer", "");
            } else {
                var64++;
            }
            if (Statics.field1934 == null) {
                Statics.field1934 = Statics.method941(Statics.field2039, "headicons_hint", "");
            } else {
                var64++;
            }
            if (Statics.field3159 == null) {
                Statics.field3159 = Statics.method941(Statics.field2039, "mapmarker", "");
            } else {
                var64++;
            }
            if (Statics.field1919 == null) {
                Statics.field1919 = Statics.method941(Statics.field2039, "cross", "");
            } else {
                var64++;
            }
            if (Statics.field3181 == null) {
                Statics.field3181 = Statics.method941(Statics.field2039, "mapdots", "");
            } else {
                var64++;
            }
            if (Statics.field2906 == null) {
                Statics.field2906 = class77.method551(Statics.field2039, "scrollbar", "");
            } else {
                var64++;
            }
            if (Statics.field85 == null) {
                Statics.field85 = class77.method551(Statics.field2039, "mod_icons", "");
            } else {
                var64++;
            }
            if (var64 < 13) {
                class32.field710 = class158.field2385 + var64 * 100 / 13 + "%";
                class32.field701 = 70;
            } else {
                Statics.field3197 = Statics.field85;
                Statics.field2657.method1579();
                int var73 = (int) (Math.random() * 21.0D) - 10;
                int var74 = (int) (Math.random() * 21.0D) - 10;
                int var75 = (int) (Math.random() * 21.0D) - 10;
                int var76 = (int) (Math.random() * 41.0D) - 20;
                for (int var77 = 0; var77 < Statics.field664.length; var77++) {
                    Statics.field664[var77].method1580(var73 + var76, var74 + var76, var75 + var76);
                }
                Statics.field2074[0].method1740(var73 + var76, var74 + var76, var75 + var76);
                class32.field710 = class158.field2323;
                class32.field701 = 70;
                field315 = 90;
            }
        } else if (field315 == 90) {
            if (Statics.field2693.method3041()) {
                class96 var78 = new class96(Statics.field2693, Statics.field2039, 20, 0.8D, field384 ? 64 : 128);
                class92.method1953(var78);
                class92.method1949(0.8D);
                class32.field710 = class158.field2451;
                class32.field701 = 90;
                field315 = 110;
            } else {
                class32.field710 = class158.field2510 + Statics.field2693.method3124() + "%";
                class32.field701 = 90;
            }
        } else if (field315 == 110) {
            Statics.field183 = new class14();
            Statics.field925.method2741(Statics.field183, 10);
            class32.field710 = class158.field2326;
            class32.field701 = 94;
            field315 = 120;
        } else if (field315 == 120) {
            if (Statics.field187.method3112("huffman", "")) {
                class114 var79 = new class114(Statics.field187.method3065("huffman", ""));
                Statics.field3119 = var79;
                class32.field710 = class158.field2520;
                class32.field701 = 96;
                field315 = 130;
            } else {
                class32.field710 = class158.field2327 + "%";
                class32.field701 = 96;
            }
        } else if (field315 == 130) {
            if (!Statics.field1072.method3041()) {
                class32.field710 = class158.field2329 + Statics.field1072.method3124() * 4 / 5 + "%";
                class32.field701 = 100;
            } else if (!Statics.field2736.method3041()) {
                class32.field710 = class158.field2329 + (80 + Statics.field2736.method3124() / 6) + "%";
                class32.field701 = 100;
            } else if (Statics.field996.method3041()) {
                class32.field710 = class158.field2395;
                class32.field701 = 100;
                field315 = 140;
            } else {
                class32.field710 = class158.field2329 + (96 + Statics.field996.method3124() / 20) + "%";
                class32.field701 = 100;
            }
        } else if (field315 == 140) {
            method900(10);
        }
    }

    @ObfuscatedName("ev.k(IZZZI)Lfw;")
    public static class169 method2826(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class135 var4 = null;
        if (class150.field2221 != null) {
            var4 = new class135(arg0, class150.field2221, Statics.field622[arg0], 1000000);
        }
        return new class169(var4, Statics.field1645, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("en.o(I)V")
    public static final void method2935() {
        try {
            if (field483 == 0) {
                if (Statics.field196 != null) {
                    Statics.field196.method2841();
                    Statics.field196 = null;
                }
                Statics.field2047 = null;
                field343 = false;
                field346 = 0;
                field483 = 1;
            }
            if (field483 == 1) {
                if (Statics.field2047 == null) {
                    Statics.field2047 = Statics.field925.method2740(Statics.field1003, Statics.field240);
                }
                if (Statics.field2047.field2200 == 2) {
                    throw new IOException();
                }
                if (Statics.field2047.field2200 == 1) {
                    Statics.field196 = new class144((Socket) Statics.field2047.field2202, Statics.field925);
                    Statics.field2047 = null;
                    field483 = 2;
                }
            }
            if (field483 == 2) {
                field332.field1977 = 0;
                field332.method2480(14);
                Statics.field196.method2836(field332.field1983, 0, 1);
                field333.field1977 = 0;
                field483 = 3;
            }
            if (field483 == 3) {
                if (Statics.field1573 != null) {
                    Statics.field1573.method1162();
                }
                if (Statics.field1075 != null) {
                    Statics.field1075.method1162();
                }
                int var0 = Statics.field196.method2842();
                if (Statics.field1573 != null) {
                    Statics.field1573.method1162();
                }
                if (Statics.field1075 != null) {
                    Statics.field1075.method1162();
                }
                if (var0 != 0) {
                    method1945(var0);
                    return;
                }
                field333.field1977 = 0;
                field483 = 5;
            }
            if (field483 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field332.field1977 = 0;
                field332.method2480(1);
                field332.method2480(class32.field723.method547());
                field332.method2332(var1[0]);
                field332.method2332(var1[1]);
                field332.method2332(var1[2]);
                field332.method2332(var1[3]);
                switch(class32.field723.field2594) {
                    case 0:
                    case 3:
                        field332.method2331(Statics.field855);
                        field332.field1977 += 5;
                        break;
                    case 1:
                        field332.method2332((Integer) Statics.field2638.field134.get(class164.method1061(class32.field727)));
                        field332.field1977 += 4;
                        break;
                    case 2:
                        field332.field1977 += 8;
                }
                field332.method2335(class32.field717);
                field332.method2507(class5.field68, class5.field64);
                field480.field1977 = 0;
                if (field295 == 40) {
                    field480.method2480(18);
                } else {
                    field480.method2480(16);
                }
                field480.method2525(0);
                int var2 = field480.field1977;
                field480.method2332(116);
                field480.method2338(field332.field1983, 0, field332.field1977);
                int var3 = field480.field1977;
                field480.method2335(class32.field727);
                field480.method2480((field502 ? 1 : 0) << 1 | (field384 ? 1 : 0));
                field480.method2525(Statics.field1027);
                field480.method2525(Statics.field2170);
                class150.method3214(field480);
                field480.method2335(Statics.field564);
                field480.method2332(Statics.field255);
                class120 var4 = new class120(Statics.field1743.method2963());
                Statics.field1743.method2961(var4);
                field480.method2338(var4.field1983, 0, var4.field1983.length);
                field480.method2480(Statics.field1019);
                field480.method2332(Statics.field318.field2678);
                field480.method2332(Statics.field138.field2678);
                field480.method2332(Statics.field2186.field2678);
                field480.method2332(Statics.field1072.field2678);
                field480.method2332(Statics.field467.field2678);
                field480.method2332(Statics.field772.field2678);
                field480.method2332(Statics.field359.field2678);
                field480.method2332(Statics.field584.field2678);
                field480.method2332(Statics.field2039.field2678);
                field480.method2332(Statics.field2693.field2678);
                field480.method2332(Statics.field187.field2678);
                field480.method2332(Statics.field1423.field2678);
                field480.method2332(Statics.field2736.field2678);
                field480.method2332(Statics.field996.field2678);
                field480.method2332(Statics.field2070.field2678);
                field480.method2332(Statics.field1779.field2678);
                field480.method2362(var1, var3, field480.field1977);
                field480.method2340(field480.field1977 - var2);
                Statics.field196.method2836(field480.field1983, 0, field480.field1977);
                field332.method2610(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field333.method2610(var1);
                field483 = 6;
            }
            if (field483 == 6 && Statics.field196.method2834() > 0) {
                int var6 = Statics.field196.method2842();
                if (var6 == 21 && field295 == 20) {
                    field483 = 7;
                } else if (var6 == 2) {
                    field483 = 9;
                } else if (var6 == 15 && field295 == 40) {
                    field335 = -1;
                    field483 = 13;
                } else if (var6 == 23 && field567 < 1) {
                    field567++;
                    field483 = 0;
                } else if (var6 == 29) {
                    field483 = 11;
                } else {
                    method1945(var6);
                    return;
                }
            }
            if (field483 == 7 && Statics.field196.method2834() > 0) {
                field469 = (Statics.field196.method2842() + 3) * 60;
                field483 = 8;
            }
            if (field483 == 8) {
                field346 = 0;
                class32.method150(class158.field2334, class158.field2298, field469 / 60 + class158.field2336);
                if (--field469 <= 0) {
                    field483 = 0;
                }
            } else {
                if (field483 == 9 && Statics.field196.method2834() >= 13) {
                    boolean var7 = Statics.field196.method2842() == 1;
                    Statics.field196.method2835(field333.field1983, 0, 4);
                    field333.field1977 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field333.method2617() << 24;
                        int var10 = var9 | field333.method2617() << 16;
                        int var11 = var10 | field333.method2617() << 8;
                        int var12 = var11 | field333.method2617();
                        int var13 = class164.method1061(class32.field727);
                        if (Statics.field2638.field134.size() >= 10 && !Statics.field2638.field134.containsKey(var13)) {
                            Iterator var14 = Statics.field2638.field134.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field2638.field134.put(var13, var12);
                        class9.method95();
                    }
                    field355 = Statics.field196.method2842();
                    field455 = Statics.field196.method2842() == 1;
                    field431 = Statics.field196.method2842();
                    field431 <<= 0x8;
                    field431 += Statics.field196.method2842();
                    field413 = Statics.field196.method2842();
                    Statics.field196.method2835(field333.field1983, 0, 1);
                    field333.field1977 = 0;
                    field336 = field333.method2617();
                    Statics.field196.method2835(field333.field1983, 0, 2);
                    field333.field1977 = 0;
                    field335 = field333.method2346();
                    if (field413 == 1) {
                        try {
                            client var15 = Statics.field285;
                            JSObject.getWindow(var15).call("zap", (Object[]) null);
                        } catch (Throwable var39) {
                        }
                    } else {
                        try {
                            client var17 = Statics.field285;
                            JSObject.getWindow(var17).call("unzap", (Object[]) null);
                        } catch (Throwable var38) {
                        }
                    }
                    field483 = 10;
                }
                if (field483 != 10) {
                    if (field483 == 11 && Statics.field196.method2834() >= 2) {
                        field333.field1977 = 0;
                        Statics.field196.method2835(field333.field1983, 0, 2);
                        field333.field1977 = 0;
                        Statics.field2588 = field333.method2346();
                        field483 = 12;
                    }
                    if (field483 == 12 && Statics.field196.method2834() >= Statics.field2588) {
                        field333.field1977 = 0;
                        Statics.field196.method2835(field333.field1983, 0, Statics.field2588);
                        field333.field1977 = 0;
                        String var33 = field333.method2352();
                        String var34 = field333.method2352();
                        String var35 = field333.method2352();
                        class32.method150(var33, var34, var35);
                        method900(10);
                    }
                    if (field483 == 13) {
                        if (field335 == -1) {
                            if (Statics.field196.method2834() < 2) {
                                return;
                            }
                            Statics.field196.method2835(field333.field1983, 0, 2);
                            field333.field1977 = 0;
                            field335 = field333.method2346();
                        }
                        if (Statics.field196.method2834() >= field335) {
                            Statics.field196.method2835(field333.field1983, 0, field335);
                            field333.field1977 = 0;
                            int var36 = field335;
                            method552();
                            class33.method2283(field333);
                            if (field333.field1977 != var36) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field346++;
                        if (field346 > 2000) {
                            if (field567 < 1) {
                                if (Statics.field240 == Statics.field201) {
                                    Statics.field240 = Statics.field473;
                                } else {
                                    Statics.field240 = Statics.field201;
                                }
                                field567++;
                                field483 = 0;
                            } else {
                                method1945(-3);
                            }
                        }
                    }
                } else if (Statics.field196.method2834() >= field335) {
                    field333.field1977 = 0;
                    Statics.field196.method2835(field333.field1983, 0, field335);
                    field298 = -1L;
                    field301 = -1;
                    Statics.field183.field198 = 0;
                    Statics.field1872 = true;
                    field302 = true;
                    field506 = -1L;
                    class212.method2825();
                    field332.field1977 = 0;
                    field333.field1977 = 0;
                    field336 = -1;
                    field339 = -1;
                    field407 = -1;
                    field541 = -1;
                    field442 = 0;
                    field520 = 0;
                    field400 = 0;
                    field324 = 0;
                    field430 = 0;
                    field429 = false;
                    class141.method1943(0);
                    class12.method90();
                    field353 = 0;
                    field443 = false;
                    field505 = 0;
                    field445 = (int) (Math.random() * 100.0D) - 50;
                    field524 = (int) (Math.random() * 110.0D) - 55;
                    field358 = (int) (Math.random() * 80.0D) - 40;
                    field361 = (int) (Math.random() * 120.0D) - 60;
                    field559 = (int) (Math.random() * 30.0D) - 20;
                    field323 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field494 = 0;
                    field304 = -1;
                    field522 = 0;
                    field523 = 0;
                    field313 = class21.field575;
                    field314 = class21.field575;
                    field450 = 0;
                    class33.field739 = 0;
                    for (int var19 = 0; var19 < 2048; var19++) {
                        class33.field738[var19] = null;
                        class33.field737[var19] = 1;
                    }
                    for (int var20 = 0; var20 < 2048; var20++) {
                        field411[var20] = null;
                    }
                    for (int var21 = 0; var21 < 32768; var21++) {
                        field327[var21] = null;
                    }
                    field330 = -1;
                    field423.method3554();
                    field424.method3554();
                    for (int var22 = 0; var22 < 4; var22++) {
                        for (int var23 = 0; var23 < 104; var23++) {
                            for (int var24 = 0; var24 < 104; var24++) {
                                field421[var22][var23][var24] = null;
                            }
                        }
                    }
                    field422 = new class200();
                    field556 = 0;
                    field341 = 0;
                    field514 = 0;
                    for (int var25 = 0; var25 < Statics.field1130; var25++) {
                        class53 var26 = class53.method550(var25);
                        if (var26 != null) {
                            class177.field2895[var25] = 0;
                            class177.field2897[var25] = 0;
                        }
                    }
                    Statics.field2125.method197();
                    field375 = -1;
                    if (field457 != -1) {
                        class174.method988(field457);
                    }
                    for (class4 var27 = (class4) field449.method3530(); var27 != null; var27 = (class4) field449.method3531()) {
                        method2795(var27, true);
                    }
                    field457 = -1;
                    field449 = new class197(8);
                    field452 = null;
                    field429 = false;
                    field430 = 0;
                    field340.method3281((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var28 = 0; var28 < 8; var28++) {
                        field417[var28] = null;
                        field418[var28] = false;
                    }
                    class16.field222 = new class197(32);
                    field296 = true;
                    for (int var29 = 0; var29 < 100; var29++) {
                        field508[var29] = true;
                    }
                    field332.method2611(174);
                    class123 var30 = field332;
                    int var31 = field502 ? 2 : 1;
                    var30.method2480(var31);
                    field332.method2525(Statics.field1027);
                    field332.method2525(Statics.field2170);
                    field515 = null;
                    Statics.field1958 = 0;
                    Statics.field924 = null;
                    for (int var32 = 0; var32 < 8; var32++) {
                        field529[var32] = new class221();
                    }
                    Statics.field2173 = null;
                    class33.method2283(field333);
                    Statics.field2266 = -1;
                    method1(false);
                    field336 = -1;
                }
            }
        } catch (IOException var40) {
            if (field567 < 1) {
                if (Statics.field240 == Statics.field201) {
                    Statics.field240 = Statics.field473;
                } else {
                    Statics.field240 = Statics.field201;
                }
                field567++;
                field483 = 0;
            } else {
                method1945(-2);
            }
        }
    }

    @ObfuscatedName("f.t(B)V")
    public static void method552() {
        field332.field1977 = 0;
        field333.field1977 = 0;
        field336 = -1;
        field339 = -1;
        field407 = -1;
        field541 = -1;
        field335 = 0;
        field442 = 0;
        field520 = 0;
        field430 = 0;
        field429 = false;
        field494 = 0;
        field522 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field411[var0] = null;
        }
        Statics.field2263 = null;
        for (int var1 = 0; var1 < field327.length; var1++) {
            class35 var2 = field327[var1];
            if (var2 != null) {
                var2.field816 = -1;
                var2.field817 = false;
            }
        }
        class16.field222 = new class197(32);
        method900(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field508[var3] = true;
        }
        field332.method2611(174);
        class123 var4 = field332;
        int var5 = field502 ? 2 : 1;
        var4.method2480(var5);
        field332.method2525(Statics.field1027);
        field332.method2525(Statics.field2170);
    }

    @ObfuscatedName("cq.h(II)V")
    public static void method1945(int arg0) {
        if (arg0 == -3) {
            class32.method150(class158.field2337, class158.field2480, class158.field2339);
        } else if (arg0 == -2) {
            class32.method150(class158.field2420, class158.field2341, class158.field2342);
        } else if (arg0 == -1) {
            class32.method150(class158.field2440, class158.field2344, class158.field2345);
        } else if (arg0 == 3) {
            class32.field716 = 3;
        } else if (arg0 == 4) {
            class32.method150(class158.field2346, class158.field2444, class158.field2348);
        } else if (arg0 == 5) {
            class32.method150(class158.field2470, class158.field2350, class158.field2351);
        } else if (arg0 == 6) {
            class32.method150(class158.field2352, class158.field2370, class158.field2531);
        } else if (arg0 == 7) {
            class32.method150(class158.field2355, class158.field2356, class158.field2357);
        } else if (arg0 == 8) {
            class32.method150(class158.field2358, class158.field2402, class158.field2360);
        } else if (arg0 == 9) {
            class32.method150(class158.field2361, class158.field2362, class158.field2363);
        } else if (arg0 == 10) {
            class32.method150(class158.field2364, class158.field2365, class158.field2381);
        } else if (arg0 == 11) {
            class32.method150(class158.field2523, class158.field2453, class158.field2369);
        } else if (arg0 == 12) {
            class32.method150(class158.field2392, class158.field2297, class158.field2367);
        } else if (arg0 == 13) {
            class32.method150(class158.field2373, class158.field2374, class158.field2375);
        } else if (arg0 == 14) {
            class32.method150(class158.field2575, class158.field2354, class158.field2378);
        } else if (arg0 == 16) {
            class32.method150(class158.field2379, class158.field2563, class158.field2554);
        } else if (arg0 == 17) {
            class32.method150(class158.field2382, class158.field2314, class158.field2384);
        } else if (arg0 == 18) {
            class32.method150(class158.field2505, class158.field2386, class158.field2387);
        } else if (arg0 == 19) {
            class32.method150(class158.field2388, class158.field2389, class158.field2303);
        } else if (arg0 == 20) {
            class32.method150(class158.field2338, class158.field2511, class158.field2393);
        } else if (arg0 == 22) {
            class32.method150(class158.field2394, class158.field2498, class158.field2396);
        } else if (arg0 == 23) {
            class32.method150(class158.field2397, class158.field2398, class158.field2399);
        } else if (arg0 == 24) {
            class32.method150(class158.field2400, class158.field2401, class158.field2434);
        } else if (arg0 == 25) {
            class32.method150(class158.field2403, class158.field2404, class158.field2473);
        } else if (arg0 == 26) {
            class32.method150(class158.field2406, class158.field2407, class158.field2427);
        } else if (arg0 == 27) {
            class32.method150(class158.field2409, class158.field2410, class158.field2325);
        } else if (arg0 == 31) {
            class32.method150(class158.field2331, class158.field2419, class158.field2377);
        } else if (arg0 == 32) {
            class32.method150(class158.field2421, class158.field2422, class158.field2423);
        } else if (arg0 == 37) {
            class32.method150(class158.field2461, class158.field2425, class158.field2417);
        } else if (arg0 == 38) {
            class32.method150(class158.field2570, class158.field2428, class158.field2309);
        } else if (arg0 == 55) {
            class32.method150(class158.field2430, class158.field2431, class158.field2432);
        } else if (arg0 == 56) {
            class32.method150(class158.field2476, class158.field2568, class158.field2411);
            method900(11);
            return;
        } else if (arg0 == 57) {
            class32.method150(class158.field2436, class158.field2437, class158.field2438);
            method900(11);
            return;
        } else {
            class32.method150(class158.field2442, class158.field2566, class158.field2441);
        }
        method900(10);
    }

    @ObfuscatedName("fa.v(I)V")
    public static final void method2956() {
        if (Statics.field196 != null) {
            Statics.field196.method2841();
            Statics.field196 = null;
        }
        method2046();
        Statics.field2231.method1862();
        for (int var0 = 0; var0 < 4; var0++) {
            field292[var0].method2252();
        }
        System.gc();
        class184.field2954 = 1;
        Statics.field1076 = null;
        Statics.field2904 = -1;
        Statics.field2952 = -1;
        Statics.field2930 = 0;
        Statics.field2957 = false;
        Statics.field2956 = 2;
        field526 = -1;
        field527 = false;
        class24.method2044();
        method900(10);
    }

    @ObfuscatedName("cx.a(B)V")
    public static final void method2046() {
        class47.field1029.method3486();
        class42.method1513();
        class45.field1009.method3486();
        class41.method2263();
        class40.field862.method3486();
        class40.field863.method3486();
        class52.method745();
        class43.field973.method3486();
        class43.field962.method3486();
        class44.field985.method3486();
        class44.field994.method3486();
        class48.method2765();
        class53.field1131.method3486();
        class180.method2271();
        class174.field2743.method3486();
        class174.field2744.method3486();
        class174.field2745.method3486();
        class174.field2802.method3486();
        ((class96) Statics.field1561).method2030();
        class23.field595.method3486();
        Statics.field318.method3050();
        Statics.field138.method3050();
        Statics.field1072.method3050();
        Statics.field467.method3050();
        Statics.field772.method3050();
        Statics.field359.method3050();
        Statics.field584.method3050();
        Statics.field2039.method3050();
        Statics.field2693.method3050();
        Statics.field187.method3050();
        Statics.field1423.method3050();
        Statics.field2736.method3050();
    }

    @ObfuscatedName("fq.f(I)V")
    public static final void method2954() {
        if (field400 > 0) {
            method2956();
        } else {
            method900(40);
            Statics.field1531 = Statics.field196;
            Statics.field196 = null;
        }
    }

    @ObfuscatedName("dq.q(I)V")
    public static final void method2654() {
        if (Statics.field1075 != null) {
            Statics.field1075.method1161();
        }
        if (Statics.field1573 != null) {
            Statics.field1573.method1161();
        }
    }

    @ObfuscatedName("g.m(I)V")
    public static final void method12() {
        for (int var0 = 0; var0 < field505; var0++) {
            int var10002 = field533[var0]--;
            if (field533[var0] >= -10) {
                class59 var2 = field535[var0];
                if (var2 == null) {
                    class59 var10000 = (class59) null;
                    var2 = class59.method1203(Statics.field467, field531[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field533[var0] += var2.method1202();
                    field535[var0] = var2;
                }
                if (field533[var0] < 0) {
                    int var9;
                    if (field481[var0] == 0) {
                        var9 = field528;
                    } else {
                        int var3 = (field481[var0] & 0xFF) * 128;
                        int var4 = field481[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field2263.field814;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field481[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field2263.field792;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field533[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field366 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1209().method1238(Statics.field1590);
                        class65 var11 = class65.method1262(var10, 100, var9);
                        var11.method1265(field532[var0] - 1);
                        Statics.field1135.method1148(var11);
                    }
                    field533[var0] = -100;
                }
            } else {
                field505--;
                for (int var1 = var0; var1 < field505; var1++) {
                    field531[var1] = field531[var1 + 1];
                    field535[var1] = field535[var1 + 1];
                    field532[var1] = field532[var1 + 1];
                    field533[var1] = field533[var1 + 1];
                    field481[var1] = field481[var1 + 1];
                }
                var0--;
            }
        }
        if (!field527) {
            return;
        }
        boolean var12;
        if (class184.field2954 == 0) {
            var12 = Statics.field2953.method3456();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field525 != 0 && field526 != -1) {
                Statics.method1778(Statics.field359, field526, 0, field525, false);
            }
            field527 = false;
        }
    }

    @ObfuscatedName("da.s(Lau;IIIB)V")
    public static void method2638(class43 arg0, int arg1, int arg2, int arg3) {
        if (field505 >= 50 || field366 == 0 || arg0.field971 == null || arg1 >= arg0.field971.length) {
            return;
        }
        int var4 = arg0.field971[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field531[field505] = var5;
        field532[field505] = var6;
        field533[field505] = 0;
        field535[field505] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field481[field505] = (var8 << 16) + (var9 << 8) + var7;
        field505++;
    }

    @ObfuscatedName("al.i(IIIB)V")
    public static void method997(int arg0, int arg1, int arg2) {
        if (field528 == 0 || arg1 == 0 || field505 >= 50) {
            return;
        }
        field531[field505] = arg0;
        field532[field505] = arg1;
        field533[field505] = arg2;
        field535[field505] = null;
        field481[field505] = 0;
        field505++;
    }

    @ObfuscatedName("hs.e(I)V")
    public static final void method3685() {
        int[] var0 = class33.field740;
        for (int var1 = 0; var1 < class33.field739; var1++) {
            class3 var2 = field411[var0[var1]];
            if (var2 != null && var2.field807 > 0) {
                var2.field807--;
                if (var2.field807 == 0) {
                    var2.field804 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field450; var3++) {
            int var4 = field319[var3];
            class35 var5 = field327[var4];
            if (var5 != null && var5.field807 > 0) {
                var5.field807--;
                if (var5.field807 == 0) {
                    var5.field804 = null;
                }
            }
        }
    }

    @ObfuscatedName("cx.aw(I)V")
    public static final void method2047() {
        int var0 = Statics.field168 * 128 + 64;
        int var1 = Statics.field2048 * 128 + 64;
        int var2 = method2246(var0, var1, Statics.field2194) - Statics.field1661;
        if (Statics.field671 < var0) {
            Statics.field671 += Statics.field245 * (var0 - Statics.field671) / 1000 + Statics.field1344;
            if (Statics.field671 > var0) {
                Statics.field671 = var0;
            }
        }
        if (Statics.field671 > var0) {
            Statics.field671 -= Statics.field245 * (Statics.field671 - var0) / 1000 + Statics.field1344;
            if (Statics.field671 < var0) {
                Statics.field671 = var0;
            }
        }
        if (Statics.field1189 < var2) {
            Statics.field1189 += Statics.field245 * (var2 - Statics.field1189) / 1000 + Statics.field1344;
            if (Statics.field1189 > var2) {
                Statics.field1189 = var2;
            }
        }
        if (Statics.field1189 > var2) {
            Statics.field1189 -= Statics.field245 * (Statics.field1189 - var2) / 1000 + Statics.field1344;
            if (Statics.field1189 < var2) {
                Statics.field1189 = var2;
            }
        }
        if (Statics.field479 < var1) {
            Statics.field479 += Statics.field245 * (var1 - Statics.field479) / 1000 + Statics.field1344;
            if (Statics.field479 > var1) {
                Statics.field479 = var1;
            }
        }
        if (Statics.field479 > var1) {
            Statics.field479 -= Statics.field245 * (Statics.field479 - var1) / 1000 + Statics.field1344;
            if (Statics.field479 < var1) {
                Statics.field479 = var1;
            }
        }
        int var3 = Statics.field135 * 128 + 64;
        int var4 = Statics.field2935 * 128 + 64;
        int var5 = method2246(var3, var4, Statics.field2194) - Statics.field160;
        int var6 = var3 - Statics.field671;
        int var7 = var5 - Statics.field1189;
        int var8 = var4 - Statics.field479;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field2287 < var10) {
            Statics.field2287 += Statics.field1951 * (var10 - Statics.field2287) / 1000 + Statics.field952;
            if (Statics.field2287 > var10) {
                Statics.field2287 = var10;
            }
        }
        if (Statics.field2287 > var10) {
            Statics.field2287 -= Statics.field1951 * (Statics.field2287 - var10) / 1000 + Statics.field952;
            if (Statics.field2287 < var10) {
                Statics.field2287 = var10;
            }
        }
        int var12 = var11 - Statics.field2225;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field2225 += Statics.field1951 * var12 / 1000 + Statics.field952;
            Statics.field2225 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field2225 -= Statics.field1951 * -var12 / 1000 + Statics.field952;
            Statics.field2225 &= 0x7FF;
        }
        int var13 = var11 - Statics.field2225;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field2225 = var11;
        }
    }

    @ObfuscatedName("ae.an(B)V")
    public static final void method653() {
        int var0 = field445 + Statics.field2263.field814;
        int var1 = field524 + Statics.field2263.field792;
        if (Statics.field1962 - var0 < -500 || Statics.field1962 - var0 > 500 || Statics.field2649 - var1 < -500 || Statics.field2649 - var1 > 500) {
            Statics.field1962 = var0;
            Statics.field2649 = var1;
        }
        if (Statics.field1962 != var0) {
            Statics.field1962 += (var0 - Statics.field1962) / 16;
        }
        if (Statics.field2649 != var1) {
            Statics.field2649 += (var1 - Statics.field2649) / 16;
        }
        if (class141.field2134 == 4 && Statics.field2632) {
            int var2 = class141.field2136 - field379;
            field377 = var2 * 2;
            field379 = var2 == -1 || var2 == 1 ? class141.field2136 : (field379 + class141.field2136) / 2;
            int var3 = field391 - class141.field2135;
            field376 = var3 * 2;
            field391 = var3 == -1 || var3 == 1 ? class141.field2135 : (field391 + class141.field2135) / 2;
        } else {
            if (class138.field2096[96]) {
                field376 += (-24 - field376) / 2;
            } else if (class138.field2096[97]) {
                field376 += (24 - field376) / 2;
            } else {
                field376 /= 2;
            }
            if (class138.field2096[98]) {
                field377 += (12 - field377) / 2;
            } else if (class138.field2096[99]) {
                field377 += (-12 - field377) / 2;
            } else {
                field377 /= 2;
            }
            field379 = class141.field2136;
            field391 = class141.field2135;
        }
        field323 = field376 / 2 + field323 & 0x7FF;
        field404 += field377 / 2;
        if (field404 < 128) {
            field404 = 128;
        }
        if (field404 > 383) {
            field404 = 383;
        }
        int var4 = Statics.field1962 >> 7;
        int var5 = Statics.field2649 >> 7;
        int var6 = method2246(Statics.field1962, Statics.field2649, Statics.field2194);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field2194;
                    if (var10 < 3 && (class6.field70[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field84[var10][var8][var9];
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
        if (var12 > field451) {
            field451 += (var12 - field451) / 24;
        } else if (var12 < field451) {
            field451 += (var12 - field451) / 80;
        }
    }

    @ObfuscatedName("go.ag(I)V")
    public static final void method3371() {
        for (int var0 = 0; var0 < field450; var0++) {
            int var1 = field319[var0];
            class35 var2 = field327[var1];
            if (var2 != null) {
                method2042(var2, var2.field763.field866);
            }
        }
    }

    @ObfuscatedName("cd.ae(Laq;II)V")
    public static final void method2042(class38 arg0, int arg1) {
        if (arg0.field844 > field297) {
            method11(arg0);
        } else if (arg0.field846 >= field297) {
            if (field297 == arg0.field846 || arg0.field802 == -1 || arg0.field828 != 0 || arg0.field824 + 1 > class43.method175(arg0.field802).field984[arg0.field823]) {
                int var2 = arg0.field846 - arg0.field844;
                int var3 = field297 - arg0.field844;
                int var4 = arg0.field838 * 128 + arg0.field833 * 64;
                int var5 = arg0.field834 * 128 + arg0.field833 * 64;
                int var6 = arg0.field833 * 64 + arg0.field825 * 128;
                int var7 = arg0.field833 * 64 + arg0.field800 * 128;
                arg0.field814 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field792 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field848 = 0;
            arg0.field841 = arg0.field827;
            arg0.field793 = arg0.field841;
        } else {
            arg0.field819 = arg0.field796;
            if (arg0.field809 == 0) {
                arg0.field848 = 0;
            } else {
                label334: {
                    if (arg0.field802 != -1 && arg0.field828 == 0) {
                        class43 var8 = class43.method175(arg0.field802);
                        if (arg0.field837 > 0 && var8.field978 == 0) {
                            arg0.field848++;
                            break label334;
                        }
                        if (arg0.field837 <= 0 && var8.field979 == 0) {
                            arg0.field848++;
                            break label334;
                        }
                    }
                    int var9 = arg0.field814;
                    int var10 = arg0.field792;
                    int var11 = arg0.field845[arg0.field809 - 1] * 128 + arg0.field833 * 64;
                    int var12 = arg0.field832[arg0.field809 - 1] * 128 + arg0.field833 * 64;
                    if (var9 < var11) {
                        if (var10 < var12) {
                            arg0.field841 = 1280;
                        } else if (var10 > var12) {
                            arg0.field841 = 1792;
                        } else {
                            arg0.field841 = 1536;
                        }
                    } else if (var9 > var11) {
                        if (var10 < var12) {
                            arg0.field841 = 768;
                        } else if (var10 > var12) {
                            arg0.field841 = 256;
                        } else {
                            arg0.field841 = 512;
                        }
                    } else if (var10 < var12) {
                        arg0.field841 = 1024;
                    } else if (var10 > var12) {
                        arg0.field841 = 0;
                    }
                    byte var13 = arg0.field847[arg0.field809 - 1];
                    if (var11 - var9 <= 256 && var11 - var9 >= -256 && var12 - var10 <= 256 && var12 - var10 >= -256) {
                        int var14 = arg0.field841 - arg0.field793 & 0x7FF;
                        if (var14 > 1024) {
                            var14 -= 2048;
                        }
                        int var15 = arg0.field822;
                        if (var14 >= -256 && var14 <= 256) {
                            var15 = arg0.field799;
                        } else if (var14 >= 256 && var14 < 768) {
                            var15 = arg0.field849;
                        } else if (var14 >= -768 && var14 <= -256) {
                            var15 = arg0.field801;
                        }
                        if (var15 == -1) {
                            var15 = arg0.field799;
                        }
                        arg0.field819 = var15;
                        int var16 = 4;
                        boolean var17 = true;
                        if (arg0 instanceof class35) {
                            var17 = ((class35) arg0).field763.field889;
                        }
                        if (var17) {
                            if (arg0.field841 != arg0.field793 && arg0.field816 == -1 && arg0.field843 != 0) {
                                var16 = 2;
                            }
                            if (arg0.field809 > 2) {
                                var16 = 6;
                            }
                            if (arg0.field809 > 3) {
                                var16 = 8;
                            }
                            if (arg0.field848 > 0 && arg0.field809 > 1) {
                                var16 = 8;
                                arg0.field848--;
                            }
                        } else {
                            if (arg0.field809 > 1) {
                                var16 = 6;
                            }
                            if (arg0.field809 > 2) {
                                var16 = 8;
                            }
                            if (arg0.field848 > 0 && arg0.field809 > 1) {
                                var16 = 8;
                                arg0.field848--;
                            }
                        }
                        if (var13 == 2) {
                            var16 <<= 0x1;
                        }
                        if (var16 >= 8 && arg0.field819 == arg0.field799 && arg0.field803 != -1) {
                            arg0.field819 = arg0.field803;
                        }
                        if (var9 != var11 || var10 != var12) {
                            if (var9 < var11) {
                                arg0.field814 += var16;
                                if (arg0.field814 > var11) {
                                    arg0.field814 = var11;
                                }
                            } else if (var9 > var11) {
                                arg0.field814 -= var16;
                                if (arg0.field814 < var11) {
                                    arg0.field814 = var11;
                                }
                            }
                            if (var10 < var12) {
                                arg0.field792 += var16;
                                if (arg0.field792 > var12) {
                                    arg0.field792 = var12;
                                }
                            } else if (var10 > var12) {
                                arg0.field792 -= var16;
                                if (arg0.field792 < var12) {
                                    arg0.field792 = var12;
                                }
                            }
                        }
                        if (arg0.field814 == var11 && arg0.field792 == var12) {
                            arg0.field809--;
                            if (arg0.field837 > 0) {
                                arg0.field837--;
                            }
                        }
                    } else {
                        arg0.field814 = var11;
                        arg0.field792 = var12;
                        arg0.field809--;
                        if (arg0.field837 > 0) {
                            arg0.field837--;
                        }
                    }
                }
            }
        }
        if (arg0.field814 < 128 || arg0.field792 < 128 || arg0.field814 >= 13184 || arg0.field792 >= 13184) {
            arg0.field802 = -1;
            arg0.field836 = -1;
            arg0.field844 = 0;
            arg0.field846 = 0;
            arg0.field814 = arg0.field845[0] * 128 + arg0.field833 * 64;
            arg0.field792 = arg0.field832[0] * 128 + arg0.field833 * 64;
            arg0.method738();
        }
        if (Statics.field2263 == arg0 && (arg0.field814 < 1536 || arg0.field792 < 1536 || arg0.field814 >= 11776 || arg0.field792 >= 11776)) {
            arg0.field802 = -1;
            arg0.field836 = -1;
            arg0.field844 = 0;
            arg0.field846 = 0;
            arg0.field814 = arg0.field845[0] * 128 + arg0.field833 * 64;
            arg0.field792 = arg0.field832[0] * 128 + arg0.field833 * 64;
            arg0.method738();
        }
        method87(arg0);
        arg0.field794 = false;
        if (arg0.field819 != -1) {
            class43 var18 = class43.method175(arg0.field819);
            if (var18 == null || var18.field966 == null) {
                arg0.field819 = -1;
            } else {
                arg0.field821++;
                if (arg0.field820 < var18.field966.length && arg0.field821 > var18.field984[arg0.field820]) {
                    arg0.field821 = 1;
                    arg0.field820++;
                    method2638(var18, arg0.field820, arg0.field814, arg0.field792);
                }
                if (arg0.field820 >= var18.field966.length) {
                    arg0.field821 = 0;
                    arg0.field820 = 0;
                    method2638(var18, arg0.field820, arg0.field814, arg0.field792);
                }
            }
        }
        if (arg0.field836 != -1 && field297 >= arg0.field830) {
            if (arg0.field812 < 0) {
                arg0.field812 = 0;
            }
            int var19 = class44.method701(arg0.field836).field991;
            if (var19 == -1) {
                arg0.field836 = -1;
            } else {
                class43 var20 = class43.method175(var19);
                if (var20 == null || var20.field966 == null) {
                    arg0.field836 = -1;
                } else {
                    arg0.field829++;
                    if (arg0.field812 < var20.field966.length && arg0.field829 > var20.field984[arg0.field812]) {
                        arg0.field829 = 1;
                        arg0.field812++;
                        method2638(var20, arg0.field812, arg0.field814, arg0.field792);
                    }
                    if (arg0.field812 >= var20.field966.length && (arg0.field812 < 0 || arg0.field812 >= var20.field966.length)) {
                        arg0.field836 = -1;
                    }
                }
            }
        }
        if (arg0.field802 != -1 && arg0.field828 <= 1) {
            class43 var21 = class43.method175(arg0.field802);
            if (var21.field978 == 1 && arg0.field837 > 0 && arg0.field844 <= field297 && arg0.field846 < field297) {
                arg0.field828 = 1;
                return;
            }
        }
        if (arg0.field802 != -1 && arg0.field828 == 0) {
            class43 var22 = class43.method175(arg0.field802);
            if (var22 == null || var22.field966 == null) {
                arg0.field802 = -1;
            } else {
                arg0.field824++;
                if (arg0.field823 < var22.field966.length && arg0.field824 > var22.field984[arg0.field823]) {
                    arg0.field824 = 1;
                    arg0.field823++;
                    method2638(var22, arg0.field823, arg0.field814, arg0.field792);
                }
                if (arg0.field823 >= var22.field966.length) {
                    arg0.field823 -= var22.field967;
                    arg0.field826++;
                    if (arg0.field826 >= var22.field977) {
                        arg0.field802 = -1;
                    } else if (arg0.field823 >= 0 && arg0.field823 < var22.field966.length) {
                        method2638(var22, arg0.field823, arg0.field814, arg0.field792);
                    } else {
                        arg0.field802 = -1;
                    }
                }
                arg0.field794 = var22.field965;
            }
        }
        if (arg0.field828 > 0) {
            arg0.field828--;
        }
    }

    @ObfuscatedName("g.aj(Laq;I)V")
    public static final void method11(class38 arg0) {
        int var1 = arg0.field844 - field297;
        int var2 = arg0.field838 * 128 + arg0.field833 * 64;
        int var3 = arg0.field834 * 128 + arg0.field833 * 64;
        arg0.field814 += (var2 - arg0.field814) / var1;
        arg0.field792 += (var3 - arg0.field792) / var1;
        arg0.field848 = 0;
        arg0.field841 = arg0.field827;
    }

    @ObfuscatedName("r.ah(Laq;I)V")
    public static final void method87(class38 arg0) {
        if (arg0.field843 == 0) {
            return;
        }
        if (arg0.field816 != -1) {
            class38 var1 = null;
            if (arg0.field816 < 32768) {
                var1 = field327[arg0.field816];
            } else if (arg0.field816 >= 32768) {
                var1 = field411[arg0.field816 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field814 - var1.field814;
                int var3 = arg0.field792 - var1.field792;
                if (var2 != 0 || var3 != 0) {
                    arg0.field841 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field817) {
                arg0.field816 = -1;
                arg0.field817 = false;
            }
        }
        if (arg0.field818 != -1 && (arg0.field809 == 0 || arg0.field848 > 0)) {
            arg0.field841 = arg0.field818;
            arg0.field818 = -1;
        }
        int var4 = arg0.field841 - arg0.field793 & 0x7FF;
        if (var4 == 0 && arg0.field817) {
            arg0.field816 = -1;
            arg0.field817 = false;
        }
        if (var4 == 0) {
            arg0.field831 = 0;
            return;
        }
        arg0.field831++;
        if (var4 > 1024) {
            arg0.field793 -= arg0.field843;
            boolean var5 = true;
            if (var4 < arg0.field843 || var4 > 2048 - arg0.field843) {
                arg0.field793 = arg0.field841;
                var5 = false;
            }
            if (arg0.field819 == arg0.field796 && (arg0.field831 > 25 || var5)) {
                if (arg0.field797 == -1) {
                    arg0.field819 = arg0.field799;
                } else {
                    arg0.field819 = arg0.field797;
                }
            }
        } else {
            arg0.field793 += arg0.field843;
            boolean var6 = true;
            if (var4 < arg0.field843 || var4 > 2048 - arg0.field843) {
                arg0.field793 = arg0.field841;
                var6 = false;
            }
            if (arg0.field819 == arg0.field796 && (arg0.field831 > 25 || var6)) {
                if (arg0.field798 == -1) {
                    arg0.field819 = arg0.field799;
                } else {
                    arg0.field819 = arg0.field798;
                }
            }
        }
        arg0.field793 &= 0x7FF;
    }

    @ObfuscatedName("et.af(Lj;III)V")
    public static void method2941(class3 arg0, int arg1, int arg2) {
        if (arg0.field802 == arg1 && arg1 != -1) {
            int var3 = class43.method175(arg1).field980;
            if (var3 == 1) {
                arg0.field823 = 0;
                arg0.field824 = 0;
                arg0.field828 = arg2;
                arg0.field826 = 0;
            }
            if (var3 == 2) {
                arg0.field826 = 0;
            }
        } else if (arg1 == -1 || arg0.field802 == -1 || class43.method175(arg1).field974 >= class43.method175(arg0.field802).field974) {
            arg0.field802 = arg1;
            arg0.field823 = 0;
            arg0.field824 = 0;
            arg0.field828 = arg2;
            arg0.field826 = 0;
            arg0.field837 = arg0.field809;
        }
    }

    @ObfuscatedName("br.az(II)V")
    public static void method1489(int arg0) {
        field501 = 0L;
        if (arg0 >= 2) {
            field502 = true;
        } else {
            field502 = false;
        }
        method2785();
        if (field295 >= 25) {
            field332.method2611(174);
            class123 var1 = field332;
            int var2 = field502 ? 2 : 1;
            var1.method2480(var2);
            field332.method2525(Statics.field1027);
            field332.method2525(Statics.field2170);
        }
        field2187 = true;
    }

    @ObfuscatedName("ex.ax(I)V")
    public static void method2785() {
        client var0 = Statics.field285;
        synchronized (Statics.field285) {
            Container var1 = Statics.field285.method2870();
            if (var1 != null) {
                Statics.field1935 = Math.max(var1.getSize().width, Statics.field1783);
                Statics.field1533 = Math.max(var1.getSize().height, Statics.field151);
                if (Statics.field1347 == var1) {
                    Insets var2 = Statics.field1347.getInsets();
                    Statics.field1935 -= var2.right + var2.left;
                    Statics.field1533 -= var2.top + var2.bottom;
                }
                if (Statics.field1935 <= 0) {
                    Statics.field1935 = 1;
                }
                if (Statics.field1533 <= 0) {
                    Statics.field1533 = 1;
                }
                int var3 = field502 ? 2 : 1;
                if (var3 == 1) {
                    Statics.field1027 = field503;
                    Statics.field2170 = field354 * 503;
                } else {
                    Statics.field1027 = Math.min(Statics.field1935, 7680);
                    Statics.field2170 = Math.min(Statics.field1533, 2160);
                }
                field2185 = (Statics.field1935 - Statics.field1027) / 2;
                field2183 = 0;
                Statics.field1041.setSize(Statics.field1027, Statics.field2170);
                int var4 = Statics.field1027;
                int var5 = Statics.field2170;
                Canvas var6 = Statics.field1041;
                class78 var8;
                try {
                    class82 var7 = new class82();
                    var7.method1515(var4, var5, var6);
                    var8 = var7;
                } catch (Throwable var21) {
                    class76 var10 = new class76();
                    var10.method1515(var4, var5, var6);
                    var8 = var10;
                }
                Statics.field1050 = var8;
                if (Statics.field1347 == var1) {
                    Insets var11 = Statics.field1347.getInsets();
                    Statics.field1041.setLocation(field2185 + var11.left, field2183 + var11.top);
                } else {
                    Statics.field1041.setLocation(field2185, field2183);
                }
                int var12 = Statics.field1027;
                int var13 = Statics.field2170;
                if (Statics.field1935 < var12) {
                    int var14 = Statics.field1935;
                }
                if (Statics.field1533 < var13) {
                    int var15 = Statics.field1533;
                }
                if (Statics.field2638 != null) {
                    try {
                        client var16 = Statics.field285;
                        int var17 = field502 ? 2 : 1;
                        class133.method2704(var16, "resize", new Object[] { var17 });
                    } catch (Throwable var20) {
                    }
                }
                if (field457 != -1) {
                    method1777(field457, Statics.field1027, Statics.field2170, true);
                }
                method723();
            }
        }
    }

    @ObfuscatedName("ac.ac(B)V")
    public static void method723() {
        int var0 = field2185;
        int var1 = field2183;
        int var2 = Statics.field1935 - Statics.field1027 - var0;
        int var3 = Statics.field1533 - Statics.field2170 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field285.method2870();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field1347 == var4) {
                Insets var7 = Statics.field1347.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field1533);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field1935, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field1935 + var5 - var2, var6, var2, Statics.field1533);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field1533 + var6 - var3, Statics.field1935, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("k.ar(B)V")
    public static final void method165() {
        if (field457 != -1) {
            Statics.method2830(field457);
        }
        for (int var0 = 0; var0 < field491; var0++) {
            if (field508[var0]) {
                field284[var0] = true;
            }
            field495[var0] = field508[var0];
            field508[var0] = false;
        }
        field492 = field297;
        field437 = -1;
        field438 = -1;
        Statics.field1984 = null;
        if (field457 != -1) {
            field491 = 0;
            method269(field457, 0, 0, Statics.field1027, Statics.field2170, 0, 0, -1);
        }
        class80.method1701();
        if (field429) {
            method3479();
        } else if (field437 != -1) {
            method2213(field437, field438);
        }
        if (field500 == 3) {
            for (int var1 = 0; var1 < field491; var1++) {
                if (field495[var1]) {
                    class80.method1729(field496[var1], field497[var1], field498[var1], field499[var1], 16711935, 128);
                } else if (field284[var1]) {
                    class80.method1729(field496[var1], field497[var1], field498[var1], field499[var1], 16711680, 128);
                }
            }
        }
        class24.method162(Statics.field2194, Statics.field2263.field814, Statics.field2263.field792, field539);
        field539 = 0;
    }

    @ObfuscatedName("ai.aq(Ljava/lang/String;ZB)V")
    public static final void method953(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1022.method3761(arg0, 250);
        int var6 = Statics.field1022.method3762(arg0, 250) * 13;
        class80.method1739(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1726(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1022.method3767(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method3139(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field1041.getGraphics();
                Statics.field1050.method1516(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field1041.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field491; var13++) {
            if (field498[var13] + field496[var13] > var9 && field496[var13] < var9 + var11 && field499[var13] + field497[var13] > var10 && field497[var13] < var10 + var12) {
                field284[var13] = true;
            }
        }
    }

    @ObfuscatedName("cz.aa(IIIII)V")
    public static final void method2036(int arg0, int arg1, int arg2, int arg3) {
        field566++;
        method2035(class34.field754);
        boolean var4 = false;
        if (field330 >= 0) {
            int var5 = class33.field739;
            int[] var6 = class33.field740;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field330 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method2035(class34.field753);
        }
        method126(true);
        method2035(var4 ? class34.field757 : class34.field755);
        method126(false);
        method2730();
        for (class30 var8 = (class30) field424.method3575(); var8 != null; var8 = (class30) field424.method3565()) {
            if (Statics.field2194 != var8.field676 || var8.field685) {
                var8.method3647();
            } else if (field297 >= var8.field677) {
                var8.method647(field539);
                if (var8.field685) {
                    var8.method3647();
                } else {
                    Statics.field2231.method1792(var8.field676, var8.field679, var8.field684, var8.field681, 60, var8, 0, -1, false);
                }
            }
        }
        method2221(arg0, arg1, arg2, arg3, true);
        int var9 = field550;
        int var10 = field551;
        int var11 = field552;
        int var12 = field553;
        class80.method1667(var9, var10, var9 + var11, var10 + var12);
        class92.method1982();
        if (!field536) {
            int var13 = field404;
            if (field451 / 256 > var13) {
                var13 = field451 / 256;
            }
            if (field537[4] && field530[4] + 128 > var13) {
                var13 = field530[4] + 128;
            }
            int var14 = field358 + field323 & 0x7FF;
            int var15 = Statics.field1962;
            int var16 = method2246(Statics.field2263.field814, Statics.field2263.field792, Statics.field2194) - field380;
            int var17 = Statics.field2649;
            int var18 = var13 * 3 + 600;
            int var19 = 2048 - var13 & 0x7FF;
            int var20 = 2048 - var14 & 0x7FF;
            int var21 = 0;
            int var22 = 0;
            int var23 = var18;
            if (var19 != 0) {
                int var24 = class92.field1564[var19];
                int var25 = class92.field1565[var19];
                int var26 = var22 * var25 - var18 * var24 >> 16;
                var23 = var22 * var24 + var18 * var25 >> 16;
                var22 = var26;
            }
            if (var20 != 0) {
                int var27 = class92.field1564[var20];
                int var28 = class92.field1565[var20];
                int var29 = var21 * var28 + var23 * var27 >> 16;
                var23 = var23 * var28 - var21 * var27 >> 16;
                var21 = var29;
            }
            Statics.field671 = var15 - var21;
            Statics.field1189 = var16 - var22;
            Statics.field479 = var17 - var23;
            Statics.field2287 = var13;
            Statics.field2225 = var14;
        }
        int var30;
        if (field536) {
            int var31;
            if (Statics.field2638.field133) {
                var31 = Statics.field2194;
            } else {
                int var32 = method2246(Statics.field671, Statics.field479, Statics.field2194);
                if (var32 - Statics.field1189 >= 800 || (class6.field70[Statics.field2194][Statics.field671 >> 7][Statics.field479 >> 7] & 0x4) == 0) {
                    var31 = 3;
                } else {
                    var31 = Statics.field2194;
                }
            }
            var30 = var31;
        } else {
            var30 = method221();
        }
        int var33 = Statics.field671;
        int var34 = Statics.field1189;
        int var35 = Statics.field479;
        int var36 = Statics.field2287;
        int var37 = Statics.field2225;
        for (int var38 = 0; var38 < 5; var38++) {
            if (field537[var38]) {
                int var39 = (int) (Math.random() * (double) (field482[var38] * 2 + 1) - (double) field482[var38] + Math.sin((double) field540[var38] / 100.0D * (double) field325[var38]) * (double) field530[var38]);
                if (var38 == 0) {
                    Statics.field671 += var39;
                }
                if (var38 == 1) {
                    Statics.field1189 += var39;
                }
                if (var38 == 2) {
                    Statics.field479 += var39;
                }
                if (var38 == 3) {
                    Statics.field2225 = Statics.field2225 + var39 & 0x7FF;
                }
                if (var38 == 4) {
                    Statics.field2287 += var39;
                    if (Statics.field2287 < 128) {
                        Statics.field2287 = 128;
                    }
                    if (Statics.field2287 > 383) {
                        Statics.field2287 = 383;
                    }
                }
            }
        }
        int var40 = class141.field2135;
        int var41 = class141.field2136;
        if (class141.field2141 != 0) {
            var40 = class141.field2142;
            var41 = class141.field2143;
        }
        if (var40 >= var9 && var40 < var9 + var11 && var41 >= var10 && var41 < var10 + var12) {
            class106.field1793 = true;
            class106.field1844 = 0;
            class106.field1842 = var40 - var9;
            class106.field1823 = var41 - var10;
        } else {
            class106.field1793 = false;
            class106.field1844 = 0;
        }
        method2654();
        class80.method1739(var9, var10, var11, var12, 0);
        method2654();
        int var42 = class92.field1559;
        class92.field1559 = field554;
        Statics.field2231.method1819(Statics.field671, Statics.field1189, Statics.field479, Statics.field2287, Statics.field2225, var30);
        class92.field1559 = var42;
        method2654();
        Statics.field2231.method1896();
        method1488(var9, var10, var11, var12);
        method2038(var9, var10);
        ((class96) Statics.field1561).method2031(field539);
        method3726(var9, var10, var11, var12);
        Statics.field671 = var33;
        Statics.field1189 = var34;
        Statics.field479 = var35;
        Statics.field2287 = var36;
        Statics.field2225 = var37;
        if (field296 && class172.method746(true, false) == 0) {
            field296 = false;
        }
        if (field296) {
            class80.method1739(var9, var10, var11, var12, 0);
            method953(class158.field2307, false);
        }
    }

    @ObfuscatedName("dc.ay(IIIIZB)V")
    public static final void method2221(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field543 - field542) * var5 / 100 + field542;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field329) {
            short var8 = field329;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field547) {
                var6 = field547;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1701();
                    class80.method1739(arg0, arg1, var10, arg3, -16777216);
                    class80.method1739(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field517) {
            short var11 = field517;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field548) {
                var6 = field548;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1701();
                    class80.method1739(arg0, arg1, arg2, var13, -16777216);
                    class80.method1739(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field538 - field544) * var5 / 100 + field544;
        field554 = arg3 * var6 * var14 / 85504 << 1;
        if (field552 != arg2 || field553 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class92.field1564[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class87.method1848(var15, 500, 800, arg2, arg3);
        }
        field550 = arg0;
        field551 = arg1;
        field552 = arg2;
        field553 = arg3;
    }

    @ObfuscatedName("cz.as(Laz;I)V")
    public static final void method2035(class34 arg0) {
        if (Statics.field2263.field814 >> 7 == field522 && Statics.field2263.field792 >> 7 == field523) {
            field522 = 0;
        }
        int var1 = class33.field739;
        int[] var2 = class33.field740;
        int var3 = var1;
        if (class34.field754 == arg0 || class34.field753 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field754 == arg0) {
                var5 = Statics.field2263;
                var6 = Statics.field2263.field49 << 14;
            } else if (class34.field753 == arg0) {
                var5 = field411[field330];
                var6 = field330 << 14;
            } else {
                var5 = field411[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field757 == arg0 && field330 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method20() && !var5.field41) {
                var5.field45 = false;
                if ((field384 && var1 > 50 || var1 > 200) && class34.field754 != arg0 && var5.field819 == var5.field796) {
                    var5.field45 = true;
                }
                int var7 = var5.field814 >> 7;
                int var8 = var5.field792 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field26 == null || field297 < var5.field35 || field297 >= var5.field40) {
                        if ((var5.field814 & 0x7F) == 64 && (var5.field792 & 0x7F) == 64) {
                            if (field566 == field394[var7][var8]) {
                                continue;
                            }
                            field394[var7][var8] = field566;
                        }
                        var5.field34 = method2246(var5.field814, var5.field792, Statics.field2194);
                        Statics.field2231.method1792(Statics.field2194, var5.field814, var5.field792, var5.field34, 60, var5, var5.field793, var6, var5.field794);
                    } else {
                        var5.field45 = false;
                        var5.field34 = method2246(var5.field814, var5.field792, Statics.field2194);
                        Statics.field2231.method1802(Statics.field2194, var5.field814, var5.field792, var5.field34, 60, var5, var5.field793, var6, var5.field47, var5.field42, var5.field43, var5.field28);
                    }
                }
            }
        }
    }

    @ObfuscatedName("p.ak(ZI)V")
    public static final void method126(boolean arg0) {
        for (int var1 = 0; var1 < field450; var1++) {
            class35 var2 = field327[field319[var1]];
            int var3 = (field319[var1] << 14) + 536870912;
            if (var2 != null && var2.method20() && var2.field763.field877 == arg0 && var2.field763.method750()) {
                int var4 = var2.field814 >> 7;
                int var5 = var2.field792 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field833 == 1 && (var2.field814 & 0x7F) == 64 && (var2.field792 & 0x7F) == 64) {
                        if (field566 == field394[var4][var5]) {
                            continue;
                        }
                        field394[var4][var5] = field566;
                    }
                    if (!var2.field763.field893) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field2231.method1792(Statics.field2194, var2.field814, var2.field792, method2246(var2.field814 + (var2.field833 * 64 - 64), var2.field792 + (var2.field833 * 64 - 64), Statics.field2194), var2.field833 * 64 - 64 + 60, var2, var2.field793, var3, var2.field794);
                }
            }
        }
    }

    @ObfuscatedName("el.au(I)V")
    public static final void method2730() {
        for (class7 var0 = (class7) field423.method3575(); var0 != null; var0 = (class7) field423.method3565()) {
            if (Statics.field2194 != var0.field94 || field297 > var0.field100) {
                var0.method3647();
            } else if (field297 >= var0.field119) {
                if (var0.field107 > 0) {
                    class35 var1 = field327[var0.field107 - 1];
                    if (var1 != null && var1.field814 >= 0 && var1.field814 < 13312 && var1.field792 >= 0 && var1.field792 < 13312) {
                        var0.method81(var1.field814, var1.field792, method2246(var1.field814, var1.field792, var0.field94) - var0.field118, field297);
                    }
                }
                if (var0.field107 < 0) {
                    int var2 = -var0.field107 - 1;
                    class3 var3;
                    if (field431 == var2) {
                        var3 = Statics.field2263;
                    } else {
                        var3 = field411[var2];
                    }
                    if (var3 != null && var3.field814 >= 0 && var3.field814 < 13312 && var3.field792 >= 0 && var3.field792 < 13312) {
                        var0.method81(var3.field814, var3.field792, method2246(var3.field814, var3.field792, var0.field94) - var0.field118, field297);
                    }
                }
                var0.method82(field539);
                Statics.field2231.method1792(Statics.field2194, (int) var0.field93, (int) var0.field106, (int) var0.field105, 60, var0, var0.field113, -1, false);
            }
        }
    }

    @ObfuscatedName("a.av(I)I")
    public static final int method221() {
        if (Statics.field2638.field133) {
            return Statics.field2194;
        }
        int var0 = 3;
        if (Statics.field2287 < 310) {
            int var1 = Statics.field671 >> 7;
            int var2 = Statics.field479 >> 7;
            int var3 = Statics.field2263.field814 >> 7;
            int var4 = Statics.field2263.field792 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field2194;
            }
            if ((class6.field70[Statics.field2194][var1][var2] & 0x4) != 0) {
                var0 = Statics.field2194;
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
                    if ((class6.field70[Statics.field2194][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field2194;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field70[Statics.field2194][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field2194;
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
                    if ((class6.field70[Statics.field2194][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field2194;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field70[Statics.field2194][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field2194;
                        }
                    }
                }
            }
        }
        if (Statics.field2263.field814 >= 0 && Statics.field2263.field792 >= 0 && Statics.field2263.field814 < 13312 && Statics.field2263.field792 < 13312) {
            if ((class6.field70[Statics.field2194][Statics.field2263.field814 >> 7][Statics.field2263.field792 >> 7] & 0x4) != 0) {
                var0 = Statics.field2194;
            }
            return var0;
        } else {
            return Statics.field2194;
        }
    }

    @ObfuscatedName("cz.at(IIB)V")
    public static final void method2038(int arg0, int arg1) {
        if (field324 == 2) {
            method2028((field308 - Statics.field63 << 7) + field311, (field309 - Statics.field1435 << 7) + field459, field310 * 2);
            if (field396 > -1 && field297 % 20 < 10) {
                Statics.field1934[0].method1641(field396 + arg0 - 12, field545 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("l.am(Laq;IIIIII)V")
    public static final void method114(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method20()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field763;
            if (var6.field890 != null) {
                var6 = var6.method754();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class33.field739;
        int[] var8 = class33.field740;
        if (arg1 < var7) {
            int var9 = 30;
            class3 var10 = (class3) arg0;
            if (var10.field41) {
                return;
            }
            if (var10.field36 != -1 || var10.field29 != -1) {
                method37(arg0, arg0.field840 + 15);
                if (field396 > -1) {
                    if (var10.field36 != -1) {
                        Statics.field2633[var10.field36].method1641(field396 + arg2 - 12, field545 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field29 != -1) {
                        Statics.field1947[var10.field29].method1641(field396 + arg2 - 12, field545 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field324 == 10 && field307 == var8[arg1]) {
                method37(arg0, arg0.field840 + 15);
                if (field396 > -1) {
                    Statics.field1934[1].method1641(field396 + arg2 - 12, field545 + arg3 - var9);
                }
            }
        } else {
            class40 var11 = ((class35) arg0).field763;
            if (var11.field890 != null) {
                var11 = var11.method754();
            }
            if (var11.field871 >= 0 && var11.field871 < Statics.field1947.length) {
                method37(arg0, arg0.field840 + 15);
                if (field396 > -1) {
                    Statics.field1947[var11.field871].method1641(field396 + arg2 - 12, field545 + arg3 - 30);
                }
            }
            if (field324 == 1 && field306 == field319[arg1 - var7] && field297 % 20 < 10) {
                method37(arg0, arg0.field840 + 15);
                if (field396 > -1) {
                    Statics.field1934[0].method1641(field396 + arg2 - 12, field545 + arg3 - 28);
                }
            }
        }
        if (arg0.field804 != null && (arg1 >= var7 || !arg0.field806 && (field356 == 4 || !arg0.field842 && (field356 == 0 || field356 == 3 || field356 == 1 && method146(((class3) arg0).field27, false))))) {
            method37(arg0, arg0.field840);
            if (field396 > -1 && field490 < field385) {
                field389[field490] = Statics.field2637.method3759(arg0.field804) / 2;
                field456[field490] = Statics.field2637.field3191;
                field386[field490] = field396;
                field387[field490] = field545;
                field390[field490] = arg0.field808;
                field458[field490] = arg0.field805;
                field392[field490] = arg0.field807;
                field393[field490] = arg0.field804;
                field490++;
            }
        }
        if (arg0.field813 > field297) {
            method37(arg0, arg0.field840 + 15);
            if (field396 > -1) {
                int var12;
                if (arg1 < var7) {
                    var12 = 30;
                } else {
                    class40 var13 = ((class35) arg0).field763;
                    var12 = var13.field896;
                }
                int var14 = arg0.field795 * var12 / arg0.field815;
                if (var14 > var12) {
                    var14 = var12;
                } else if (var14 == 0 && arg0.field795 > 0) {
                    var14 = 1;
                }
                class80.method1739(field396 + arg2 - var12 / 2, field545 + arg3 - 3, var14, 5, 65280);
                class80.method1739(field396 + arg2 - var12 / 2 + var14, field545 + arg3 - 3, var12 - var14, 5, 16711680);
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            if (arg0.field791[var15] > field297) {
                method37(arg0, arg0.field840 / 2);
                if (field396 > -1) {
                    if (var15 == 1) {
                        field545 -= 20;
                    }
                    if (var15 == 2) {
                        field396 -= 15;
                        field545 -= 10;
                    }
                    if (var15 == 3) {
                        field396 += 15;
                        field545 -= 10;
                    }
                    Statics.field2280[arg0.field811[var15]].method1641(field396 + arg2 - 12, field545 + arg3 - 12);
                    Statics.field987.method3766(Integer.toString(arg0.field810[var15]), field396 + arg2 - 1, field545 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("br.ab(IIIII)V")
    public static final void method1488(int arg0, int arg1, int arg2, int arg3) {
        field490 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class33.field739;
        int[] var7 = class33.field740;
        for (int var8 = 0; var8 < field450 + var6; var8++) {
            class38 var9;
            if (var8 < var6) {
                var9 = field411[var7[var8]];
                if (field330 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field327[field319[var8 - var6]];
            }
            method114(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method114(field411[field330], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field490; var10++) {
            int var11 = field386[var10];
            int var12 = field387[var10];
            int var13 = field389[var10];
            int var14 = field456[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field387[var16] - field456[var16] && var12 - var14 < field387[var16] + 2 && var11 - var13 < field389[var16] + field386[var16] && var11 + var13 > field386[var16] - field389[var16] && field387[var16] - field456[var16] < var12) {
                        var12 = field387[var16] - field456[var16];
                        var15 = true;
                    }
                }
            }
            field396 = field386[var10];
            field545 = field387[var10] = var12;
            String var17 = field393[var10];
            if (field378 == 0) {
                int var18 = 16776960;
                if (field390[var10] < 6) {
                    var18 = field563[field390[var10]];
                }
                if (field390[var10] == 6) {
                    var18 = field566 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field390[var10] == 7) {
                    var18 = field566 % 20 < 10 ? 255 : 65535;
                }
                if (field390[var10] == 8) {
                    var18 = field566 % 20 < 10 ? 45056 : 8454016;
                }
                if (field390[var10] == 9) {
                    int var19 = 150 - field392[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field390[var10] == 10) {
                    int var20 = 150 - field392[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field390[var10] == 11) {
                    int var21 = 150 - field392[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field458[var10] == 0) {
                    Statics.field2637.method3766(var17, field396 + arg0, field545 + arg1, var18, 0);
                }
                if (field458[var10] == 1) {
                    Statics.field2637.method3768(var17, field396 + arg0, field545 + arg1, var18, 0, field566);
                }
                if (field458[var10] == 2) {
                    Statics.field2637.method3769(var17, field396 + arg0, field545 + arg1, var18, 0, field566);
                }
                if (field458[var10] == 3) {
                    Statics.field2637.method3801(var17, field396 + arg0, field545 + arg1, var18, 0, field566, 150 - field392[var10]);
                }
                if (field458[var10] == 4) {
                    int var22 = (150 - field392[var10]) * (Statics.field2637.method3759(var17) + 100) / 150;
                    class80.method1668(field396 + arg0 - 50, arg1, field396 + arg0 + 50, arg1 + arg3);
                    Statics.field2637.method3764(var17, field396 + arg0 + 50 - var22, field545 + arg1, var18, 0);
                    class80.method1667(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field458[var10] == 5) {
                    int var23 = 150 - field392[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class80.method1668(arg0, field545 + arg1 - Statics.field2637.field3191 - 1, arg0 + arg2, field545 + arg1 + 5);
                    Statics.field2637.method3766(var17, field396 + arg0, field545 + arg1 + var24, var18, 0);
                    class80.method1667(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field2637.method3766(var17, field396 + arg0, field545 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("hp.ai(IIIII)V")
    public static final void method3726(int arg0, int arg1, int arg2, int arg3) {
        if (field401 == 1) {
            Statics.field1919[field305 / 100].method1641(field398 - 8, field399 - 8);
        }
        if (field401 == 2) {
            Statics.field1919[field305 / 100 + 4].method1641(field398 - 8, field399 - 8);
        }
        field410 = 0;
        int var4 = (Statics.field2263.field814 >> 7) + Statics.field63;
        int var5 = (Statics.field2263.field792 >> 7) + Statics.field1435;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field410 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field410 = 1;
        }
        if (field410 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field410 = 0;
        }
    }

    @ObfuscatedName("d.ad(Laq;IB)V")
    public static final void method37(class38 arg0, int arg1) {
        method2028(arg0.field814, arg0.field792, arg1);
    }

    @ObfuscatedName("ct.ao(IIII)V")
    public static final void method2028(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field396 = -1;
            field545 = -1;
            return;
        }
        int var3 = method2246(arg0, arg1, Statics.field2194) - arg2;
        int var4 = arg0 - Statics.field671;
        int var5 = var3 - Statics.field1189;
        int var6 = arg1 - Statics.field479;
        int var7 = class92.field1564[Statics.field2287];
        int var8 = class92.field1565[Statics.field2287];
        int var9 = class92.field1564[Statics.field2225];
        int var10 = class92.field1565[Statics.field2225];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field396 = field554 * var11 / var15 + field552 / 2;
            field545 = field554 * var14 / var15 + field553 / 2;
        } else {
            field396 = -1;
            field545 = -1;
        }
    }

    @ObfuscatedName("dr.al(IIII)I")
    public static final int method2246(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field70[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field84[var5][var3][var4] + class6.field84[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field84[var5][var3][var4 + 1] + class6.field84[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("b.ap(ZB)V")
    public static final void method1(boolean arg0) {
        field569 = arg0;
        if (!field569) {
            int var1 = field333.method2378();
            int var2 = field333.method2378();
            int var3 = field333.method2346();
            Statics.field3164 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field3164[var4][var5] = field333.method2349();
                }
            }
            Statics.field2154 = new int[var3];
            Statics.field1185 = new int[var3];
            Statics.field1644 = new int[var3];
            Statics.field200 = new byte[var3][];
            Statics.field2955 = new byte[var3][];
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
                        Statics.field2154[var7] = var10;
                        Statics.field1185[var7] = Statics.field772.method3052("m" + var8 + "_" + var9);
                        Statics.field1644[var7] = Statics.field772.method3052("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method987(var1, var2);
            return;
        }
        int var11 = field333.method2491();
        int var12 = field333.method2491();
        int var13 = field333.method2346();
        field333.method2622();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field333.method2614(1);
                    if (var17 == 1) {
                        field352[var14][var15][var16] = field333.method2614(26);
                    } else {
                        field352[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field333.method2615();
        Statics.field3164 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field3164[var18][var19] = field333.method2349();
            }
        }
        Statics.field2154 = new int[var13];
        Statics.field1185 = new int[var13];
        Statics.field1644 = new int[var13];
        Statics.field200 = new byte[var13][];
        Statics.field2955 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field352[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field2154[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field2154[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field1185[var20] = Statics.field772.method3052("m" + var29 + "_" + var30);
                            Statics.field1644[var20] = Statics.field772.method3052("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method987(var12, var11);
    }

    @ObfuscatedName("ao.bc(III)V")
    public static final void method987(int arg0, int arg1) {
        if (Statics.field2266 == arg0 && Statics.field372 == arg1) {
            return;
        }
        Statics.field2266 = arg0;
        Statics.field372 = arg1;
        method900(25);
        method953(class158.field2307, true);
        int var2 = Statics.field63;
        int var3 = Statics.field1435;
        Statics.field63 = (arg0 - 6) * 8;
        Statics.field1435 = (arg1 - 6) * 8;
        int var4 = Statics.field63 - var2;
        int var5 = Statics.field1435 - var3;
        int var6 = Statics.field63;
        int var7 = Statics.field1435;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field327[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field845[var10] -= var4;
                    var9.field832[var10] -= var5;
                }
                var9.field814 -= var4 * 128;
                var9.field792 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field411[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field845[var13] -= var4;
                    var12.field832[var13] -= var5;
                }
                var12.field814 -= var4 * 128;
                var12.field792 -= var5 * 128;
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
                        field421[var24][var20][var21] = field421[var24][var22][var23];
                    } else {
                        field421[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field422.method3575(); var25 != null; var25 = (class17) field422.method3565()) {
            var25.field226 -= var4;
            var25.field224 -= var5;
            if (var25.field226 < 0 || var25.field224 < 0 || var25.field226 >= 104 || var25.field224 >= 104) {
                var25.method3647();
            }
        }
        if (field522 != 0) {
            field522 -= var4;
            field523 -= var5;
        }
        field505 = 0;
        field536 = false;
        field304 = -1;
        field424.method3554();
        field423.method3554();
        for (int var26 = 0; var26 < 4; var26++) {
            field292[var26].method2252();
        }
    }

    @ObfuscatedName("z.bj(ZI)V")
    public static final void method156(boolean arg0) {
        method2654();
        field338++;
        if (field338 < 50 && !arg0) {
            return;
        }
        field338 = 0;
        if (field343 || Statics.field196 == null) {
            return;
        }
        field332.method2611(210);
        try {
            Statics.field196.method2836(field332.field1983, 0, field332.field1977);
            field332.field1977 = 0;
        } catch (IOException var2) {
            field343 = true;
        }
    }

    @ObfuscatedName("h.bs(IIIIII)V")
    public static final void method177(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field2231.method1807(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field2231.method1811(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1018.field1381;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method3164(var12);
            if (var13.field904 == -1) {
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
                class81 var14 = Statics.field2074[var13.field904];
                if (var14 != null) {
                    int var15 = (var13.field916 * 4 - var14.field1391) / 2;
                    int var16 = (var13.field905 * 4 - var14.field1392) / 2;
                    var14.method1747(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field905) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field2231.method1809(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field2231.method1811(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method3164(var21);
            if (var22.field904 != -1) {
                class81 var23 = Statics.field2074[var22.field904];
                if (var23 != null) {
                    int var24 = (var22.field916 * 4 - var23.field1391) / 2;
                    int var25 = (var22.field905 * 4 - var23.field1392) / 2;
                    var23.method1747(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field905) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1018.field1381;
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
        int var29 = Statics.field2231.method1810(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method3164(var30);
        if (var31.field904 == -1) {
            return;
        }
        class81 var32 = Statics.field2074[var31.field904];
        if (var32 != null) {
            int var33 = (var31.field916 * 4 - var32.field1391) / 2;
            int var34 = (var31.field905 * 4 - var32.field1392) / 2;
            var32.method1747(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field905) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("ad.be(I)V")
    public static final void method971() {
        if (field336 == 45) {
            int var0 = field333.method2380();
            int var1 = field333.method2378();
            int var2 = field333.method2404();
            int var3 = (var2 >> 4 & 0x7) + Statics.field883;
            int var4 = (var2 & 0x7) + Statics.field265;
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                class29 var5 = new class29();
                var5.field673 = var0;
                var5.field672 = var1;
                if (field421[Statics.field2194][var3][var4] == null) {
                    field421[Statics.field2194][var3][var4] = new class200();
                }
                field421[Statics.field2194][var3][var4].method3550(var5);
                method2027(var3, var4);
            }
        } else if (field336 == 71) {
            int var6 = field333.method2344();
            int var7 = (var6 >> 4 & 0x7) + Statics.field883;
            int var8 = (var6 & 0x7) + Statics.field265;
            int var9 = var7 + field333.method2345();
            int var10 = var8 + field333.method2345();
            int var11 = field333.method2347();
            int var12 = field333.method2346();
            int var13 = field333.method2344() * 4;
            int var14 = field333.method2344() * 4;
            int var15 = field333.method2346();
            int var16 = field333.method2346();
            int var17 = field333.method2344();
            int var18 = field333.method2344();
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var12 != 65535) {
                int var19 = var7 * 128 + 64;
                int var20 = var8 * 128 + 64;
                int var21 = var9 * 128 + 64;
                int var22 = var10 * 128 + 64;
                class7 var23 = new class7(var12, Statics.field2194, var19, var20, method2246(var19, var20, Statics.field2194) - var13, field297 + var15, field297 + var16, var17, var18, var11, var14);
                var23.method81(var21, var22, method2246(var21, var22, Statics.field2194) - var14, field297 + var15);
                field423.method3550(var23);
            }
        } else if (field336 == 232) {
            int var24 = field333.method2372();
            int var25 = (var24 >> 4 & 0x7) + Statics.field883;
            int var26 = (var24 & 0x7) + Statics.field265;
            int var27 = field333.method2344();
            int var28 = var27 >> 2;
            int var29 = var27 & 0x3;
            int var30 = field370[var28];
            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                method2982(Statics.field2194, var25, var26, var30, -1, var28, var29, 0, -1);
            }
        } else {
            if (field336 == 127) {
                int var31 = field333.method2372();
                int var32 = var31 >> 2;
                int var33 = var31 & 0x3;
                int var34 = field370[var32];
                int var35 = field333.method2491();
                int var36 = field333.method2344();
                int var37 = (var36 >> 4 & 0x7) + Statics.field883;
                int var38 = (var36 & 0x7) + Statics.field265;
                byte var39 = field333.method2374();
                int var40 = field333.method2380();
                byte var41 = field333.method2373();
                byte var42 = field333.method2373();
                byte var43 = field333.method2373();
                int var44 = field333.method2346();
                int var45 = field333.method2491();
                class3 var46;
                if (field431 == var35) {
                    var46 = Statics.field2263;
                } else {
                    var46 = field411[var35];
                }
                if (var46 != null) {
                    class41 var47 = class41.method3164(var45);
                    int var48;
                    int var49;
                    if (var33 == 1 || var33 == 3) {
                        var48 = var47.field905;
                        var49 = var47.field916;
                    } else {
                        var48 = var47.field916;
                        var49 = var47.field905;
                    }
                    int var50 = (var48 >> 1) + var37;
                    int var51 = (var48 + 1 >> 1) + var37;
                    int var52 = (var49 >> 1) + var38;
                    int var53 = (var49 + 1 >> 1) + var38;
                    int[][] var54 = class6.field84[Statics.field2194];
                    int var55 = var54[var50][var52] + var54[var51][var52] + var54[var50][var53] + var54[var51][var53] >> 2;
                    int var56 = (var37 << 7) + (var48 << 6);
                    int var57 = (var38 << 7) + (var49 << 6);
                    class106 var58 = var47.method782(var32, var33, var54, var56, var55, var57);
                    if (var58 != null) {
                        method2982(Statics.field2194, var37, var38, var34, -1, 0, 0, var44 + 1, var40 + 1);
                        var46.field35 = field297 + var44;
                        var46.field40 = field297 + var40;
                        var46.field26 = var58;
                        var46.field37 = var37 * 128 + var48 * 64;
                        var46.field39 = var38 * 128 + var49 * 64;
                        var46.field38 = var55;
                        if (var43 > var41) {
                            byte var59 = var43;
                            var43 = var41;
                            var41 = var59;
                        }
                        if (var42 > var39) {
                            byte var60 = var42;
                            var42 = var39;
                            var39 = var60;
                        }
                        var46.field47 = var37 + var43;
                        var46.field43 = var37 + var41;
                        var46.field42 = var38 + var42;
                        var46.field28 = var38 + var39;
                    }
                }
            }
            if (field336 == 77) {
                int var61 = field333.method2346();
                int var62 = field333.method2404();
                int var63 = (var62 >> 4 & 0x7) + Statics.field883;
                int var64 = (var62 & 0x7) + Statics.field265;
                if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                    class200 var65 = field421[Statics.field2194][var63][var64];
                    if (var65 != null) {
                        for (class29 var66 = (class29) var65.method3575(); var66 != null; var66 = (class29) var65.method3565()) {
                            if ((var61 & 0x7FFF) == var66.field673) {
                                var66.method3647();
                                break;
                            }
                        }
                        if (var65.method3575() == null) {
                            field421[Statics.field2194][var63][var64] = null;
                        }
                        method2027(var63, var64);
                    }
                }
            } else {
                if (field336 == 136) {
                    int var67 = field333.method2344();
                    int var68 = (var67 >> 4 & 0x7) + Statics.field883;
                    int var69 = (var67 & 0x7) + Statics.field265;
                    int var70 = field333.method2346();
                    int var71 = field333.method2344();
                    int var72 = var71 >> 4 & 0xF;
                    int var73 = var71 & 0x7;
                    int var74 = field333.method2344();
                    if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104) {
                        int var75 = var72 + 1;
                        if (Statics.field2263.field845[0] >= var68 - var75 && Statics.field2263.field845[0] <= var68 + var75 && Statics.field2263.field832[0] >= var69 - var75 && Statics.field2263.field832[0] <= var69 + var75 && field366 != 0 && var73 > 0 && field505 < 50) {
                            field531[field505] = var70;
                            field532[field505] = var73;
                            field533[field505] = var74;
                            field535[field505] = null;
                            field481[field505] = (var68 << 16) + (var69 << 8) + var72;
                            field505++;
                        }
                    }
                }
                if (field336 == 197) {
                    int var76 = field333.method2491();
                    int var77 = field333.method2404();
                    int var78 = (var77 >> 4 & 0x7) + Statics.field883;
                    int var79 = (var77 & 0x7) + Statics.field265;
                    int var80 = field333.method2344();
                    int var81 = var80 >> 2;
                    int var82 = var80 & 0x3;
                    int var83 = field370[var81];
                    if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
                        method2982(Statics.field2194, var78, var79, var83, var76, var81, var82, 0, -1);
                    }
                } else if (field336 == 222) {
                    int var84 = field333.method2344();
                    int var85 = (var84 >> 4 & 0x7) + Statics.field883;
                    int var86 = (var84 & 0x7) + Statics.field265;
                    int var87 = field333.method2346();
                    int var88 = field333.method2346();
                    int var89 = field333.method2346();
                    if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
                        class200 var90 = field421[Statics.field2194][var85][var86];
                        if (var90 != null) {
                            for (class29 var91 = (class29) var90.method3575(); var91 != null; var91 = (class29) var90.method3565()) {
                                if ((var87 & 0x7FFF) == var91.field673 && var91.field672 == var88) {
                                    var91.field672 = var89;
                                    break;
                                }
                            }
                            method2027(var85, var86);
                        }
                    }
                } else if (field336 == 35) {
                    int var92 = field333.method2344();
                    int var93 = (var92 >> 4 & 0x7) + Statics.field883;
                    int var94 = (var92 & 0x7) + Statics.field265;
                    int var95 = field333.method2346();
                    int var96 = field333.method2344();
                    int var97 = field333.method2346();
                    if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
                        int var98 = var93 * 128 + 64;
                        int var99 = var94 * 128 + 64;
                        class30 var100 = new class30(var95, Statics.field2194, var98, var99, method2246(var98, var99, Statics.field2194) - var96, var97, field297);
                        field424.method3550(var100);
                    }
                } else if (field336 == 16) {
                    int var101 = field333.method2372();
                    int var102 = var101 >> 2;
                    int var103 = var101 & 0x3;
                    int var104 = field370[var102];
                    int var105 = field333.method2370();
                    int var106 = (var105 >> 4 & 0x7) + Statics.field883;
                    int var107 = (var105 & 0x7) + Statics.field265;
                    int var108 = field333.method2346();
                    if (var106 >= 0 && var107 >= 0 && var106 < 103 && var107 < 103) {
                        if (var104 == 0) {
                            class88 var109 = Statics.field2231.method1829(Statics.field2194, var106, var107);
                            if (var109 != null) {
                                int var110 = var109.field1507 >> 14 & 0x7FFF;
                                if (var102 == 2) {
                                    var109.field1505 = new class13(var110, 2, var103 + 4, Statics.field2194, var106, var107, var108, false, var109.field1505);
                                    var109.field1502 = new class13(var110, 2, var103 + 1 & 0x3, Statics.field2194, var106, var107, var108, false, var109.field1502);
                                } else {
                                    var109.field1505 = new class13(var110, var102, var103, Statics.field2194, var106, var107, var108, false, var109.field1505);
                                }
                            }
                        }
                        if (var104 == 1) {
                            class95 var111 = Statics.field2231.method1804(Statics.field2194, var106, var107);
                            if (var111 != null) {
                                int var112 = var111.field1585 >> 14 & 0x7FFF;
                                if (var102 == 4 || var102 == 5) {
                                    var111.field1584 = new class13(var112, 4, var103, Statics.field2194, var106, var107, var108, false, var111.field1584);
                                } else if (var102 == 6) {
                                    var111.field1584 = new class13(var112, 4, var103 + 4, Statics.field2194, var106, var107, var108, false, var111.field1584);
                                } else if (var102 == 7) {
                                    var111.field1584 = new class13(var112, 4, (var103 + 2 & 0x3) + 4, Statics.field2194, var106, var107, var108, false, var111.field1584);
                                } else if (var102 == 8) {
                                    var111.field1584 = new class13(var112, 4, var103 + 4, Statics.field2194, var106, var107, var108, false, var111.field1584);
                                    var111.field1580 = new class13(var112, 4, (var103 + 2 & 0x3) + 4, Statics.field2194, var106, var107, var108, false, var111.field1580);
                                }
                            }
                        }
                        if (var104 == 2) {
                            class99 var113 = Statics.field2231.method1866(Statics.field2194, var106, var107);
                            if (var102 == 11) {
                                var102 = 10;
                            }
                            if (var113 != null) {
                                var113.field1633 = new class13(var113.field1641 >> 14 & 0x7FFF, var102, var103, Statics.field2194, var106, var107, var108, false, var113.field1633);
                            }
                        }
                        if (var104 == 3) {
                            class94 var114 = Statics.field2231.method1806(Statics.field2194, var106, var107);
                            if (var114 != null) {
                                var114.field1569 = new class13(var114.field1570 >> 14 & 0x7FFF, 22, var103, Statics.field2194, var106, var107, var108, false, var114.field1569);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fp.bi(IIIIIIIIII)V")
    public static final void method2982(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field422.method3575(); var10 != null; var10 = (class17) field422.method3565()) {
            if (var10.field233 == arg0 && var10.field226 == arg1 && var10.field224 == arg2 && var10.field225 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field233 = arg0;
            var9.field225 = arg3;
            var9.field226 = arg1;
            var9.field224 = arg2;
            method555(var9);
            field422.method3550(var9);
        }
        var9.field231 = arg4;
        var9.field236 = arg5;
        var9.field232 = arg6;
        var9.field242 = arg7;
        var9.field234 = arg8;
    }

    @ObfuscatedName("q.ba(Lt;I)V")
    public static final void method555(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field225 == 0) {
            var1 = Statics.field2231.method1807(arg0.field233, arg0.field226, arg0.field224);
        }
        if (arg0.field225 == 1) {
            var1 = Statics.field2231.method1808(arg0.field233, arg0.field226, arg0.field224);
        }
        if (arg0.field225 == 2) {
            var1 = Statics.field2231.method1809(arg0.field233, arg0.field226, arg0.field224);
        }
        if (arg0.field225 == 3) {
            var1 = Statics.field2231.method1810(arg0.field233, arg0.field226, arg0.field224);
        }
        if (var1 != 0) {
            int var5 = Statics.field2231.method1811(arg0.field233, arg0.field226, arg0.field224, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field228 = var2;
        arg0.field229 = var3;
        arg0.field241 = var4;
    }

    @ObfuscatedName("ai.bp(IIIIIIIB)V")
    public static final void method955(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field384 && Statics.field2194 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field2231.method1807(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2231.method1808(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2231.method1809(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2231.method1810(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field2231.method1811(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2231.method1798(arg0, arg2, arg3);
                class41 var15 = class41.method3164(var12);
                if (var15.field918 != 0) {
                    field292[arg0].method2230(arg2, arg3, var13, var14, var15.field919);
                }
            }
            if (arg1 == 1) {
                Statics.field2231.method1799(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2231.method1842(arg0, arg2, arg3);
                class41 var16 = class41.method3164(var12);
                if (var16.field916 + arg2 > 103 || var16.field916 + arg3 > 103 || var16.field905 + arg2 > 103 || var16.field905 + arg3 > 103) {
                    return;
                }
                if (var16.field918 != 0) {
                    field292[arg0].method2231(arg2, arg3, var16.field916, var16.field905, var14, var16.field919);
                }
            }
            if (arg1 == 3) {
                Statics.field2231.method1836(arg0, arg2, arg3);
                class41 var17 = class41.method3164(var12);
                if (var17.field918 == 1) {
                    field292[arg0].method2233(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field70[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class87 var19 = Statics.field2231;
        class109 var20 = field292[arg0];
        class41 var21 = class41.method3164(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field905;
            var23 = var21.field916;
        } else {
            var22 = var21.field916;
            var23 = var21.field905;
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
        int[][] var28 = class6.field84[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field920 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field941 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class86 var34;
            if (var21.field946 == -1 && var21.field950 == null) {
                var34 = var21.method782(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field946, true, (class86) null);
            }
            var19.method1787(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field918 == 1) {
                var20.method2228(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class86 var57;
            if (var21.field946 == -1 && var21.field950 == null) {
                var57 = var21.method782(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field946, true, (class86) null);
            }
            if (var57 != null) {
                var19.method1801(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field918 != 0) {
                var20.method2226(arg2, arg3, var22, var23, var21.field919);
            }
        } else if (arg6 >= 12) {
            class86 var35;
            if (var21.field946 == -1 && var21.field950 == null) {
                var35 = var21.method782(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field946, true, (class86) null);
            }
            var19.method1801(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field918 != 0) {
                var20.method2226(arg2, arg3, var22, var23, var21.field919);
            }
        } else if (arg6 == 0) {
            class86 var36;
            if (var21.field946 == -1 && var21.field950 == null) {
                var36 = var21.method782(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field946, true, (class86) null);
            }
            var19.method1789(arg0, arg2, arg3, var29, var36, (class86) null, class6.field76[arg5], 0, var32, var33);
            if (var21.field918 != 0) {
                var20.method2225(arg2, arg3, arg6, arg5, var21.field919);
            }
        } else if (arg6 == 1) {
            class86 var37;
            if (var21.field946 == -1 && var21.field950 == null) {
                var37 = var21.method782(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field946, true, (class86) null);
            }
            var19.method1789(arg0, arg2, arg3, var29, var37, (class86) null, class6.field69[arg5], 0, var32, var33);
            if (var21.field918 != 0) {
                var20.method2225(arg2, arg3, arg6, arg5, var21.field919);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class86 var39;
            class86 var40;
            if (var21.field946 == -1 && var21.field950 == null) {
                var39 = var21.method782(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method782(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field946, true, (class86) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field946, true, (class86) null);
            }
            var19.method1789(arg0, arg2, arg3, var29, var39, var40, class6.field76[arg5], class6.field76[var38], var32, var33);
            if (var21.field918 != 0) {
                var20.method2225(arg2, arg3, arg6, arg5, var21.field919);
            }
        } else if (arg6 == 3) {
            class86 var41;
            if (var21.field946 == -1 && var21.field950 == null) {
                var41 = var21.method782(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field946, true, (class86) null);
            }
            var19.method1789(arg0, arg2, arg3, var29, var41, (class86) null, class6.field69[arg5], 0, var32, var33);
            if (var21.field918 != 0) {
                var20.method2225(arg2, arg3, arg6, arg5, var21.field919);
            }
        } else if (arg6 == 9) {
            class86 var42;
            if (var21.field946 == -1 && var21.field950 == null) {
                var42 = var21.method782(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field946, true, (class86) null);
            }
            var19.method1801(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field918 != 0) {
                var20.method2226(arg2, arg3, var22, var23, var21.field919);
            }
        } else if (arg6 == 4) {
            class86 var43;
            if (var21.field946 == -1 && var21.field950 == null) {
                var43 = var21.method782(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field946, true, (class86) null);
            }
            var19.method1909(arg0, arg2, arg3, var29, var43, (class86) null, class6.field76[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1807(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class41.method3164(var45 >> 14 & 0x7FFF).field909;
            }
            class86 var46;
            if (var21.field946 == -1 && var21.field950 == null) {
                var46 = var21.method782(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field946, true, (class86) null);
            }
            var19.method1909(arg0, arg2, arg3, var29, var46, (class86) null, class6.field76[arg5], 0, class6.field89[arg5] * var44, class6.field78[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1807(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class41.method3164(var48 >> 14 & 0x7FFF).field909 / 2;
            }
            class86 var49;
            if (var21.field946 == -1 && var21.field950 == null) {
                var49 = var21.method782(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field946, true, (class86) null);
            }
            var19.method1909(arg0, arg2, arg3, var29, var49, (class86) null, 256, arg5, class6.field77[arg5] * var47, class6.field81[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class86 var51;
            if (var21.field946 == -1 && var21.field950 == null) {
                var51 = var21.method782(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field946, true, (class86) null);
            }
            var19.method1909(arg0, arg2, arg3, var29, var51, (class86) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1807(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class41.method3164(var53 >> 14 & 0x7FFF).field909 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class86 var55;
            class86 var56;
            if (var21.field946 == -1 && var21.field950 == null) {
                var55 = var21.method782(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method782(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field946, true, (class86) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field946, true, (class86) null);
            }
            var19.method1909(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field77[arg5] * var52, class6.field81[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("cn.bz(IIB)V")
    public static final void method2027(int arg0, int arg1) {
        class200 var2 = field421[Statics.field2194][arg0][arg1];
        if (var2 == null) {
            Statics.field2231.method1865(Statics.field2194, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3575(); var6 != null; var6 = (class29) var2.method3565()) {
            class52 var7 = class52.method727(var6.field673);
            long var8 = (long) var7.field1098;
            if (var7.field1097 == 1) {
                var8 = (long) (var6.field672 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field2231.method1865(Statics.field2194, arg0, arg1);
            return;
        }
        var2.method3551(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3575(); var12 != null; var12 = (class29) var2.method3565()) {
            if (var5.field673 != var12.field673) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field673 != var12.field673 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field2231.method1788(Statics.field2194, arg0, arg1, method2246(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2194), var5, var13, var10, var11);
    }

    @ObfuscatedName("ey.bb(ZI)V")
    public static final void method2797(boolean arg0) {
        field345 = 0;
        field463 = 0;
        method718();
        while (field333.method2616(field335) >= 27) {
            int var1 = field333.method2614(15);
            if (var1 == 32767) {
                break;
            }
            boolean var5 = false;
            if (field327[var1] == null) {
                field327[var1] = new class35();
                var5 = true;
            }
            class35 var6 = field327[var1];
            field319[++field450 - 1] = var1;
            var6.field839 = field297;
            var6.field763 = class40.method3225(field333.method2614(14));
            int var7;
            if (arg0) {
                var7 = field333.method2614(8);
                if (var7 > 127) {
                    var7 -= 256;
                }
            } else {
                var7 = field333.method2614(5);
                if (var7 > 15) {
                    var7 -= 32;
                }
            }
            int var8 = field419[field333.method2614(3)];
            if (var5) {
                var6.field841 = var6.field793 = var8;
            }
            int var9;
            if (arg0) {
                var9 = field333.method2614(8);
                if (var9 > 127) {
                    var9 -= 256;
                }
            } else {
                var9 = field333.method2614(5);
                if (var9 > 15) {
                    var9 -= 32;
                }
            }
            int var10 = field333.method2614(1);
            int var11 = field333.method2614(1);
            if (var11 == 1) {
                field331[++field463 - 1] = var1;
            }
            var6.field833 = var6.field763.field866;
            var6.field843 = var6.field763.field892;
            if (var6.field843 == 0) {
                var6.field793 = 0;
            }
            var6.field799 = var6.field763.field872;
            var6.field822 = var6.field763.field895;
            var6.field801 = var6.field763.field874;
            var6.field849 = var6.field763.field867;
            var6.field796 = var6.field763.field869;
            var6.field797 = var6.field763.field870;
            var6.field798 = var6.field763.field861;
            var6.method716(Statics.field2263.field845[0] + var9, Statics.field2263.field832[0] + var7, var10 == 1);
        }
        field333.method2615();
        method2947();
        for (int var2 = 0; var2 < field345; var2++) {
            int var3 = field415[var2];
            if (field297 != field327[var3].field839) {
                field327[var3].field763 = null;
                field327[var3] = null;
            }
        }
        if (field335 != field333.field1977) {
            throw new RuntimeException(field333.field1977 + class2.field18 + field335);
        }
        for (int var4 = 0; var4 < field450; var4++) {
            if (field327[field319[var4]] == null) {
                throw new RuntimeException(var4 + class2.field18 + field450);
            }
        }
    }

    @ObfuscatedName("ax.bl(I)V")
    public static final void method718() {
        field333.method2622();
        int var0 = field333.method2614(8);
        if (var0 < field450) {
            for (int var1 = var0; var1 < field450; var1++) {
                field415[++field345 - 1] = field319[var1];
            }
        }
        if (var0 > field450) {
            throw new RuntimeException("");
        }
        field450 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field319[var2];
            class35 var4 = field327[var3];
            int var5 = field333.method2614(1);
            if (var5 == 0) {
                field319[++field450 - 1] = var3;
                var4.field839 = field297;
            } else {
                int var6 = field333.method2614(2);
                if (var6 == 0) {
                    field319[++field450 - 1] = var3;
                    var4.field839 = field297;
                    field331[++field463 - 1] = var3;
                } else if (var6 == 1) {
                    field319[++field450 - 1] = var3;
                    var4.field839 = field297;
                    int var7 = field333.method2614(3);
                    var4.method714(var7, (byte) 1);
                    int var8 = field333.method2614(1);
                    if (var8 == 1) {
                        field331[++field463 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field319[++field450 - 1] = var3;
                    var4.field839 = field297;
                    int var9 = field333.method2614(3);
                    var4.method714(var9, (byte) 2);
                    int var10 = field333.method2614(3);
                    var4.method714(var10, (byte) 2);
                    int var11 = field333.method2614(1);
                    if (var11 == 1) {
                        field331[++field463 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field415[++field345 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("et.bh(I)V")
    public static final void method2947() {
        for (int var0 = 0; var0 < field463; var0++) {
            int var1 = field331[var0];
            class35 var2 = field327[var1];
            int var3 = field333.method2344();
            if ((var3 & 0x10) != 0) {
                int var4 = field333.method2378();
                if (var4 == 65535) {
                    var4 = -1;
                }
                int var5 = field333.method2404();
                if (var2.field802 == var4 && var4 != -1) {
                    int var6 = class43.method175(var4).field980;
                    if (var6 == 1) {
                        var2.field823 = 0;
                        var2.field824 = 0;
                        var2.field828 = var5;
                        var2.field826 = 0;
                    }
                    if (var6 == 2) {
                        var2.field826 = 0;
                    }
                } else if (var4 == -1 || var2.field802 == -1 || class43.method175(var4).field974 >= class43.method175(var2.field802).field974) {
                    var2.field802 = var4;
                    var2.field823 = 0;
                    var2.field824 = 0;
                    var2.field828 = var5;
                    var2.field826 = 0;
                    var2.field837 = var2.field809;
                }
            }
            if ((var3 & 0x4) != 0) {
                int var7 = field333.method2344();
                int var8 = field333.method2344();
                var2.method740(var7, var8, field297);
                var2.field813 = field297 + 300;
                var2.field795 = field333.method2380();
                var2.field815 = field333.method2346();
            }
            if ((var3 & 0x20) != 0) {
                var2.field804 = field333.method2352();
                var2.field807 = 100;
            }
            if ((var3 & 0x80) != 0) {
                var2.field836 = field333.method2346();
                int var9 = field333.method2349();
                var2.field835 = var9 >> 16;
                var2.field830 = (var9 & 0xFFFF) + field297;
                var2.field812 = 0;
                var2.field829 = 0;
                if (var2.field830 > field297) {
                    var2.field812 = -1;
                }
                if (var2.field836 == 65535) {
                    var2.field836 = -1;
                }
            }
            if ((var3 & 0x2) != 0) {
                int var10 = field333.method2491();
                int var11 = field333.method2491();
                int var12 = var2.field814 - (var10 - Statics.field63 - Statics.field63) * 64;
                int var13 = var2.field792 - (var11 - Statics.field1435 - Statics.field1435) * 64;
                if (var12 != 0 || var13 != 0) {
                    var2.field818 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x8) != 0) {
                var2.field816 = field333.method2346();
                if (var2.field816 == 65535) {
                    var2.field816 = -1;
                }
            }
            if ((var3 & 0x40) != 0) {
                int var14 = field333.method2370();
                int var15 = field333.method2372();
                var2.method740(var14, var15, field297);
                var2.field813 = field297 + 300;
                var2.field795 = field333.method2346();
                var2.field815 = field333.method2380();
            }
            if ((var3 & 0x1) != 0) {
                var2.field763 = class40.method3225(field333.method2378());
                var2.field833 = var2.field763.field866;
                var2.field843 = var2.field763.field892;
                var2.field799 = var2.field763.field872;
                var2.field822 = var2.field763.field895;
                var2.field801 = var2.field763.field874;
                var2.field849 = var2.field763.field867;
                var2.field796 = var2.field763.field869;
                var2.field797 = var2.field763.field870;
                var2.field798 = var2.field763.field861;
            }
        }
    }

    @ObfuscatedName("ak.bt(Lj;IIBI)V")
    public static final void method842(class3 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field845[0];
        int var5 = arg0.field832[0];
        int var6 = arg0.method15();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method15();
        field395.field1865 = arg1;
        field395.field1862 = arg2;
        field395.field1861 = 1;
        field395.field1863 = 1;
        class11 var8 = field395;
        class11 var9 = var8;
        class109 var10 = field292[arg0.field48];
        int[] var11 = field568;
        int[] var12 = field470;
        for (int var13 = 0; var13 < 128; var13++) {
            for (int var14 = 0; var14 < 128; var14++) {
                class107.field1854[var13][var14] = 0;
                class107.field1852[var13][var14] = 99999999;
            }
        }
        boolean var30;
        if (var7 == 1) {
            int var15 = var4;
            int var16 = var5;
            byte var17 = 64;
            byte var18 = 64;
            int var19 = var4 - var17;
            int var20 = var5 - var18;
            class107.field1854[var17][var18] = 99;
            class107.field1852[var17][var18] = 0;
            byte var21 = 0;
            int var22 = 0;
            class107.field1857[var21] = var4;
            int var56 = var21 + 1;
            class107.field1858[var21] = var5;
            int[][] var23 = var10.field1885;
            boolean var28;
            while (true) {
                if (var56 == var22) {
                    Statics.field220 = var15;
                    Statics.field1024 = var16;
                    var28 = false;
                    break;
                }
                var15 = class107.field1857[var22];
                var16 = class107.field1858[var22];
                var22 = var22 + 1 & 0xFFF;
                int var24 = var15 - var19;
                int var25 = var16 - var20;
                int var26 = var15 - var10.field1881;
                int var27 = var16 - var10.field1874;
                if (var9.method122(1, var15, var16, var10)) {
                    Statics.field220 = var15;
                    Statics.field1024 = var16;
                    var28 = true;
                    break;
                }
                int var29 = class107.field1852[var24][var25] + 1;
                if (var24 > 0 && class107.field1854[var24 - 1][var25] == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0) {
                    class107.field1857[var56] = var15 - 1;
                    class107.field1858[var56] = var16;
                    var56 = var56 + 1 & 0xFFF;
                    class107.field1854[var24 - 1][var25] = 2;
                    class107.field1852[var24 - 1][var25] = var29;
                }
                if (var24 < 127 && class107.field1854[var24 + 1][var25] == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0) {
                    class107.field1857[var56] = var15 + 1;
                    class107.field1858[var56] = var16;
                    var56 = var56 + 1 & 0xFFF;
                    class107.field1854[var24 + 1][var25] = 8;
                    class107.field1852[var24 + 1][var25] = var29;
                }
                if (var25 > 0 && class107.field1854[var24][var25 - 1] == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                    class107.field1857[var56] = var15;
                    class107.field1858[var56] = var16 - 1;
                    var56 = var56 + 1 & 0xFFF;
                    class107.field1854[var24][var25 - 1] = 1;
                    class107.field1852[var24][var25 - 1] = var29;
                }
                if (var25 < 127 && class107.field1854[var24][var25 + 1] == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                    class107.field1857[var56] = var15;
                    class107.field1858[var56] = var16 + 1;
                    var56 = var56 + 1 & 0xFFF;
                    class107.field1854[var24][var25 + 1] = 4;
                    class107.field1852[var24][var25 + 1] = var29;
                }
                if (var24 > 0 && var25 > 0 && class107.field1854[var24 - 1][var25 - 1] == 0 && (var23[var26 - 1][var27 - 1] & 0x124010E) == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                    class107.field1857[var56] = var15 - 1;
                    class107.field1858[var56] = var16 - 1;
                    var56 = var56 + 1 & 0xFFF;
                    class107.field1854[var24 - 1][var25 - 1] = 3;
                    class107.field1852[var24 - 1][var25 - 1] = var29;
                }
                if (var24 < 127 && var25 > 0 && class107.field1854[var24 + 1][var25 - 1] == 0 && (var23[var26 + 1][var27 - 1] & 0x1240183) == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                    class107.field1857[var56] = var15 + 1;
                    class107.field1858[var56] = var16 - 1;
                    var56 = var56 + 1 & 0xFFF;
                    class107.field1854[var24 + 1][var25 - 1] = 9;
                    class107.field1852[var24 + 1][var25 - 1] = var29;
                }
                if (var24 > 0 && var25 < 127 && class107.field1854[var24 - 1][var25 + 1] == 0 && (var23[var26 - 1][var27 + 1] & 0x1240138) == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                    class107.field1857[var56] = var15 - 1;
                    class107.field1858[var56] = var16 + 1;
                    var56 = var56 + 1 & 0xFFF;
                    class107.field1854[var24 - 1][var25 + 1] = 6;
                    class107.field1852[var24 - 1][var25 + 1] = var29;
                }
                if (var24 < 127 && var25 < 127 && class107.field1854[var24 + 1][var25 + 1] == 0 && (var23[var26 + 1][var27 + 1] & 0x12401E0) == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                    class107.field1857[var56] = var15 + 1;
                    class107.field1858[var56] = var16 + 1;
                    var56 = var56 + 1 & 0xFFF;
                    class107.field1854[var24 + 1][var25 + 1] = 12;
                    class107.field1852[var24 + 1][var25 + 1] = var29;
                }
            }
            var30 = var28;
        } else if (var7 == 2) {
            var30 = class107.method634(var4, var5, var8, var10);
        } else {
            var30 = class107.method711(var4, var5, var7, var8, var10);
        }
        int var49;
        label285: {
            int var31 = var4 - 64;
            int var32 = var5 - 64;
            int var33 = Statics.field220;
            int var34 = Statics.field1024;
            if (!var30) {
                int var35 = Integer.MAX_VALUE;
                int var36 = Integer.MAX_VALUE;
                byte var37 = 10;
                int var38 = var9.field1865;
                int var39 = var9.field1862;
                int var40 = var9.field1861;
                int var41 = var9.field1863;
                for (int var42 = var38 - var37; var42 <= var37 + var38; var42++) {
                    for (int var43 = var39 - var37; var43 <= var37 + var39; var43++) {
                        int var44 = var42 - var31;
                        int var45 = var43 - var32;
                        if (var44 >= 0 && var45 >= 0 && var44 < 128 && var45 < 128 && class107.field1852[var44][var45] < 100) {
                            int var46 = 0;
                            if (var42 < var38) {
                                var46 = var38 - var42;
                            } else if (var42 > var38 + var40 - 1) {
                                var46 = var42 - (var38 + var40 - 1);
                            }
                            int var47 = 0;
                            if (var43 < var39) {
                                var47 = var39 - var43;
                            } else if (var43 > var39 + var41 - 1) {
                                var47 = var43 - (var39 + var41 - 1);
                            }
                            int var48 = var46 * var46 + var47 * var47;
                            if (var48 < var35 || var35 == var48 && class107.field1852[var44][var45] < var36) {
                                var35 = var48;
                                var36 = class107.field1852[var44][var45];
                                var33 = var42;
                                var34 = var43;
                            }
                        }
                    }
                }
                if (var35 == Integer.MAX_VALUE) {
                    var49 = -1;
                    break label285;
                }
            }
            if (var4 == var33 && var5 == var34) {
                var49 = 0;
            } else {
                byte var50 = 0;
                class107.field1857[var50] = var33;
                int var57 = var50 + 1;
                class107.field1858[var50] = var34;
                int var51;
                int var52 = var51 = class107.field1854[var33 - var31][var34 - var32];
                while (var4 != var33 || var5 != var34) {
                    if (var51 != var52) {
                        var51 = var52;
                        class107.field1857[var57] = var33;
                        class107.field1858[var57++] = var34;
                    }
                    if ((var52 & 0x2) != 0) {
                        var33++;
                    } else if ((var52 & 0x8) != 0) {
                        var33--;
                    }
                    if ((var52 & 0x1) != 0) {
                        var34++;
                    } else if ((var52 & 0x4) != 0) {
                        var34--;
                    }
                    var52 = class107.field1854[var33 - var31][var34 - var32];
                }
                int var53 = 0;
                while (var57-- > 0) {
                    var11[var53] = class107.field1857[var57];
                    var12[var53++] = class107.field1858[var57];
                    if (var53 >= var11.length) {
                        break;
                    }
                }
                var49 = var53;
            }
        }
        int var54 = var49;
        if (var49 >= 1) {
            for (int var55 = 0; var55 < var54 - 1; var55++) {
                arg0.method19(field568[var55], field470[var55], arg3);
            }
        }
    }

    @ObfuscatedName("dc.bx(III)V")
    public static final void method2213(int arg0, int arg1) {
        if (field430 < 2 && field353 == 0 && !field443) {
            return;
        }
        String var2;
        if (field353 == 1 && field430 < 2) {
            var2 = class158.field2304 + class158.field2455 + field350 + " " + class2.field25;
        } else if (field443 && field430 < 2) {
            var2 = field446 + class158.field2455 + field447 + " " + class2.field25;
        } else {
            int var3 = field430 - 1;
            String var4;
            if (field397[var3].length() > 0) {
                var4 = field435[var3] + class158.field2455 + field397[var3];
            } else {
                var4 = field435[var3];
            }
            var2 = var4;
        }
        if (field430 > 2) {
            var2 = var2 + class2.method2958(16777215) + " " + '/' + " " + (field430 - 2) + class158.field2449;
        }
        Statics.field2637.method3755(var2, arg0 + 4, arg1 + 15, 16777215, 0, field297 / 1000);
    }

    @ObfuscatedName("ge.bv(S)V")
    public static final void method3479() {
        int var0 = Statics.field235;
        int var1 = Statics.field195;
        int var2 = Statics.field2289;
        int var3 = Statics.field574;
        int var4 = 6116423;
        class80.method1739(var0, var1, var2, var3, var4);
        class80.method1739(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class80.method1726(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field2637.method3764(class158.field2448, var0 + 3, var1 + 14, var4, -1);
        int var5 = class141.field2135;
        int var6 = class141.field2136;
        for (int var7 = 0; var7 < field430; var7++) {
            int var8 = (field430 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class225 var10 = Statics.field2637;
            String var11;
            if (field397[var7].length() > 0) {
                var11 = field435[var7] + class158.field2455 + field397[var7];
            } else {
                var11 = field435[var7];
            }
            var10.method3764(var11, var0 + 3, var8, var9, 0);
        }
        int var12 = Statics.field235;
        int var13 = Statics.field195;
        int var14 = Statics.field2289;
        int var15 = Statics.field574;
        for (int var16 = 0; var16 < field491; var16++) {
            if (field498[var16] + field496[var16] > var12 && field496[var16] < var12 + var14 && field499[var16] + field497[var16] > var13 && field497[var16] < var13 + var15) {
                field284[var16] = true;
            }
        }
    }

    @ObfuscatedName("fw.bn(IIIIB)V")
    public static final void method3139(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field491; var4++) {
            if (field498[var4] + field496[var4] > arg0 && field496[var4] < arg0 + arg2 && field499[var4] + field497[var4] > arg1 && field497[var4] < arg1 + arg3) {
                field508[var4] = true;
            }
        }
    }

    @ObfuscatedName("n.bw(IIB)V")
    public static final void method147(int arg0, int arg1) {
        int var2 = Statics.field2637.method3759(class158.field2448);
        for (int var3 = 0; var3 < field430; var3++) {
            class225 var4 = Statics.field2637;
            String var5;
            if (field397[var3].length() > 0) {
                var5 = field435[var3] + class158.field2455 + field397[var3];
            } else {
                var5 = field435[var3];
            }
            int var6 = var4.method3759(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field430 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field1027) {
            var8 = Statics.field1027 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field2170) {
            var9 = Statics.field2170 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field429 = true;
        Statics.field235 = var8;
        Statics.field195 = var9;
        Statics.field2289 = var2;
        Statics.field574 = field430 * 15 + 22;
    }

    @ObfuscatedName("cz.bo(II)Z")
    public static final boolean method2032(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field433[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("fr.bq(IS)V")
    public static final void method3233(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field420[arg0];
        int var2 = field432[arg0];
        int var3 = field433[arg0];
        int var4 = field434[arg0];
        String var5 = field435[arg0];
        String var6 = field397[arg0];
        method2041(var1, var2, var3, var4, var5, var6, class141.field2142, class141.field2143);
    }

    @ObfuscatedName("cv.bf(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method2041(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class174 var8 = class174.method3018(arg1, arg0);
            if (var8 != null) {
                method974(arg3, arg1, arg0, var8.field2869, arg5);
            }
        }
        if (arg2 == 1005) {
            class174 var9 = class174.method2976(arg1);
            if (var9 == null || var9.field2746[arg0] < 100000) {
                field332.method2611(138);
                field332.method2525(arg3);
            } else {
                class12.method936(27, "", var9.field2746[arg0] + " x " + class52.method727(arg3).field1091);
            }
            field402 = 0;
            Statics.field3171 = class174.method2976(arg1);
            field403 = arg0;
        }
        if (arg2 == 19) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field305 = 0;
            field522 = arg0;
            field523 = arg1;
            field332.method2611(178);
            field332.method2523(Statics.field1435 + arg1);
            field332.method2523(arg3);
            field332.method2480(class138.field2096[82] ? 1 : 0);
            field332.method2525(Statics.field63 + arg0);
        }
        if (arg2 == 17) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field305 = 0;
            field522 = arg0;
            field523 = arg1;
            field332.method2611(23);
            field332.method2377(Statics.field63 + arg0);
            field332.method2369(class138.field2096[82] ? 1 : 0);
            field332.method2525(arg3);
            field332.method2377(Statics.field1435 + arg1);
            field332.method2332(Statics.field57);
            field332.method2525(field444);
        }
        if (arg2 == 38) {
            method566();
            class174 var10 = class174.method2976(arg1);
            field353 = 1;
            Statics.field1326 = arg0;
            Statics.field12 = arg1;
            Statics.field2910 = arg3;
            method38(var10);
            field350 = class2.method2958(16748608) + class52.method727(arg3).field1091 + class2.method2958(16777215);
            if (field350 == null) {
                field350 = "null";
            }
            return;
        }
        if (arg2 == 12) {
            class35 var11 = field327[arg3];
            if (var11 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field305 = 0;
                field522 = arg0;
                field523 = arg1;
                field332.method2611(230);
                field332.method2368(class138.field2096[82] ? 1 : 0);
                field332.method2377(arg3);
            }
        }
        if (arg2 == 1001) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field305 = 0;
            field522 = arg0;
            field523 = arg1;
            field332.method2611(231);
            field332.method2377(Statics.field1435 + arg1);
            field332.method2375(arg3 >> 14 & 0x7FFF);
            field332.method2427(class138.field2096[82] ? 1 : 0);
            field332.method2377(Statics.field63 + arg0);
        }
        if (arg2 == 21) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field305 = 0;
            field522 = arg0;
            field523 = arg1;
            field332.method2611(152);
            field332.method2525(Statics.field1435 + arg1);
            field332.method2523(arg3);
            field332.method2375(Statics.field63 + arg0);
            field332.method2368(class138.field2096[82] ? 1 : 0);
        }
        if (arg2 == 31) {
            field332.method2611(179);
            field332.method2332(Statics.field12);
            field332.method2375(arg0);
            field332.method2525(arg3);
            field332.method2375(Statics.field1326);
            field332.method2377(Statics.field2910);
            field332.method2332(arg1);
            field402 = 0;
            Statics.field3171 = class174.method2976(arg1);
            field403 = arg0;
        }
        if (arg2 == 30 && field452 == null) {
            field332.method2611(126);
            field332.method2525(arg0);
            field332.method2332(arg1);
            field452 = class174.method3018(arg1, arg0);
            method38(field452);
        }
        if (arg2 == 46) {
            class3 var12 = field411[arg3];
            if (var12 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field305 = 0;
                field522 = arg0;
                field523 = arg1;
                field332.method2611(115);
                field332.method2480(class138.field2096[82] ? 1 : 0);
                field332.method2377(arg3);
            }
        }
        if (arg2 == 36) {
            field332.method2611(206);
            field332.method2375(arg3);
            field332.method2387(arg1);
            field332.method2375(arg0);
            field402 = 0;
            Statics.field3171 = class174.method2976(arg1);
            field403 = arg0;
        }
        if (arg2 == 7) {
            class35 var13 = field327[arg3];
            if (var13 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field305 = 0;
                field522 = arg0;
                field523 = arg1;
                field332.method2611(100);
                field332.method2525(Statics.field1326);
                field332.method2377(arg3);
                field332.method2368(class138.field2096[82] ? 1 : 0);
                field332.method2523(Statics.field2910);
                field332.method2386(Statics.field12);
            }
        }
        if (arg2 == 48) {
            class3 var14 = field411[arg3];
            if (var14 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field305 = 0;
                field522 = arg0;
                field523 = arg1;
                field332.method2611(200);
                field332.method2377(arg3);
                field332.method2427(class138.field2096[82] ? 1 : 0);
            }
        }
        if (arg2 == 22) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field305 = 0;
            field522 = arg0;
            field523 = arg1;
            field332.method2611(58);
            field332.method2377(Statics.field63 + arg0);
            field332.method2375(arg3);
            field332.method2369(class138.field2096[82] ? 1 : 0);
            field332.method2523(Statics.field1435 + arg1);
        }
        if (arg2 == 47) {
            class3 var15 = field411[arg3];
            if (var15 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field305 = 0;
                field522 = arg0;
                field523 = arg1;
                field332.method2611(250);
                field332.method2377(arg3);
                field332.method2369(class138.field2096[82] ? 1 : 0);
            }
        }
        if (arg2 == 10) {
            class35 var16 = field327[arg3];
            if (var16 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field305 = 0;
                field522 = arg0;
                field523 = arg1;
                field332.method2611(235);
                field332.method2525(arg3);
                field332.method2427(class138.field2096[82] ? 1 : 0);
            }
        }
        if (arg2 == 1003) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field305 = 0;
            class35 var17 = field327[arg3];
            if (var17 != null) {
                class40 var18 = var17.field763;
                if (var18.field890 != null) {
                    var18 = var18.method754();
                }
                if (var18 != null) {
                    field332.method2611(161);
                    field332.method2377(var18.field868);
                }
            }
        }
        if (arg2 == 50) {
            class3 var19 = field411[arg3];
            if (var19 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field305 = 0;
                field522 = arg0;
                field523 = arg1;
                field332.method2611(228);
                field332.method2369(class138.field2096[82] ? 1 : 0);
                field332.method2525(arg3);
            }
        }
        if (arg2 == 8) {
            class35 var20 = field327[arg3];
            if (var20 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field305 = 0;
                field522 = arg0;
                field523 = arg1;
                field332.method2611(96);
                field332.method2375(field444);
                field332.method2369(class138.field2096[82] ? 1 : 0);
                field332.method2387(Statics.field57);
                field332.method2523(arg3);
            }
        }
        if (arg2 == 3) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field305 = 0;
            field522 = arg0;
            field523 = arg1;
            field332.method2611(176);
            field332.method2377(arg3 >> 14 & 0x7FFF);
            field332.method2369(class138.field2096[82] ? 1 : 0);
            field332.method2377(Statics.field63 + arg0);
            field332.method2377(Statics.field1435 + arg1);
        }
        if (arg2 == 1004) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field305 = 0;
            field332.method2611(138);
            field332.method2525(arg3);
        }
        if (arg2 == 4) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field305 = 0;
            field522 = arg0;
            field523 = arg1;
            field332.method2611(217);
            field332.method2375(arg3 >> 14 & 0x7FFF);
            field332.method2480(class138.field2096[82] ? 1 : 0);
            field332.method2375(Statics.field63 + arg0);
            field332.method2377(Statics.field1435 + arg1);
        }
        if (arg2 == 11) {
            class35 var21 = field327[arg3];
            if (var21 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field305 = 0;
                field522 = arg0;
                field523 = arg1;
                field332.method2611(180);
                field332.method2523(arg3);
                field332.method2427(class138.field2096[82] ? 1 : 0);
            }
        }
        if (arg2 == 26) {
            method2284();
        }
        if (arg2 == 13) {
            class35 var22 = field327[arg3];
            if (var22 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field305 = 0;
                field522 = arg0;
                field523 = arg1;
                field332.method2611(27);
                field332.method2368(class138.field2096[82] ? 1 : 0);
                field332.method2525(arg3);
            }
        }
        if (arg2 == 34) {
            field332.method2611(50);
            field332.method2377(arg0);
            field332.method2375(arg3);
            field332.method2386(arg1);
            field402 = 0;
            Statics.field3171 = class174.method2976(arg1);
            field403 = arg0;
        }
        if (arg2 == 41) {
            field332.method2611(81);
            field332.method2377(arg0);
            field332.method2525(arg3);
            field332.method2387(arg1);
            field402 = 0;
            Statics.field3171 = class174.method2976(arg1);
            field403 = arg0;
        }
        if (arg2 == 33) {
            field332.method2611(232);
            field332.method2523(arg0);
            field332.method2523(arg3);
            field332.method2329(arg1);
            field402 = 0;
            Statics.field3171 = class174.method2976(arg1);
            field403 = arg0;
        }
        if (arg2 == 49) {
            class3 var23 = field411[arg3];
            if (var23 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field305 = 0;
                field522 = arg0;
                field523 = arg1;
                field332.method2611(162);
                field332.method2368(class138.field2096[82] ? 1 : 0);
                field332.method2375(arg3);
            }
        }
        if (arg2 == 42) {
            field332.method2611(149);
            field332.method2375(arg0);
            field332.method2332(arg1);
            field332.method2375(arg3);
            field402 = 0;
            Statics.field3171 = class174.method2976(arg1);
            field403 = arg0;
        }
        if (arg2 == 24) {
            class174 var24 = class174.method2976(arg1);
            boolean var25 = true;
            if (var24.field2769 > 0) {
                var25 = method109(var24);
            }
            if (var25) {
                field332.method2611(220);
                field332.method2332(arg1);
            }
        }
        if (arg2 == 39) {
            field332.method2611(119);
            field332.method2525(arg0);
            field332.method2523(arg3);
            field332.method2332(arg1);
            field402 = 0;
            Statics.field3171 = class174.method2976(arg1);
            field403 = arg0;
        }
        if (arg2 == 18) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field305 = 0;
            field522 = arg0;
            field523 = arg1;
            field332.method2611(122);
            field332.method2480(class138.field2096[82] ? 1 : 0);
            field332.method2375(arg3);
            field332.method2375(Statics.field63 + arg0);
            field332.method2377(Statics.field1435 + arg1);
        }
        if (arg2 == 1) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field305 = 0;
            field522 = arg0;
            field523 = arg1;
            field332.method2611(101);
            field332.method2525(Statics.field2910);
            field332.method2525(Statics.field1326);
            field332.method2329(Statics.field12);
            field332.method2525(Statics.field1435 + arg1);
            field332.method2523(Statics.field63 + arg0);
            field332.method2377(arg3 >> 14 & 0x7FFF);
            field332.method2369(class138.field2096[82] ? 1 : 0);
        }
        if (arg2 == 28) {
            field332.method2611(220);
            field332.method2332(arg1);
            class174 var26 = class174.method2976(arg1);
            if (var26.field2861 != null && var26.field2861[0][0] == 5) {
                int var27 = var26.field2861[0][1];
                class177.field2897[var27] = 1 - class177.field2897[var27];
                method41(var27);
            }
        }
        if (arg2 == 58) {
            class174 var28 = class174.method3018(arg1, arg0);
            if (var28 != null) {
                field332.method2611(51);
                field332.method2386(Statics.field57);
                field332.method2525(arg0);
                field332.method2377(field320);
                field332.method2387(arg1);
                field332.method2523(field444);
                field332.method2523(var28.field2869);
            }
        }
        if (arg2 == 44) {
            class3 var29 = field411[arg3];
            if (var29 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field305 = 0;
                field522 = arg0;
                field523 = arg1;
                field332.method2611(25);
                field332.method2369(class138.field2096[82] ? 1 : 0);
                field332.method2375(arg3);
            }
        }
        if (arg2 == 25) {
            class174 var30 = class174.method3018(arg1, arg0);
            if (var30 != null) {
                method566();
                method2223(arg1, arg0, class179.method2291(method720(var30)), var30.field2869);
                field353 = 0;
                String var31;
                if (class179.method2291(method720(var30)) == 0) {
                    var31 = null;
                } else if (var30.field2870 == null || var30.field2870.trim().length() == 0) {
                    var31 = null;
                } else {
                    var31 = var30.field2870;
                }
                field446 = var31;
                if (field446 == null) {
                    field446 = "Null";
                }
                if (var30.field2742) {
                    field447 = var30.field2761 + class2.method2958(16777215);
                } else {
                    field447 = class2.method2958(65280) + var30.field2787 + class2.method2958(16777215);
                }
            }
            return;
        }
        if (arg2 == 5) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field305 = 0;
            field522 = arg0;
            field523 = arg1;
            field332.method2611(195);
            field332.method2377(arg3 >> 14 & 0x7FFF);
            field332.method2427(class138.field2096[82] ? 1 : 0);
            field332.method2377(Statics.field63 + arg0);
            field332.method2377(Statics.field1435 + arg1);
        }
        if (arg2 == 16) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field305 = 0;
            field522 = arg0;
            field523 = arg1;
            field332.method2611(246);
            field332.method2523(arg3);
            field332.method2377(Statics.field1435 + arg1);
            field332.method2480(class138.field2096[82] ? 1 : 0);
            field332.method2377(Statics.field2910);
            field332.method2329(Statics.field12);
            field332.method2525(Statics.field1326);
            field332.method2375(Statics.field63 + arg0);
        }
        if (arg2 == 32) {
            field332.method2611(216);
            field332.method2525(arg0);
            field332.method2332(arg1);
            field332.method2377(field444);
            field332.method2386(Statics.field57);
            field332.method2523(arg3);
            field402 = 0;
            Statics.field3171 = class174.method2976(arg1);
            field403 = arg0;
        }
        if (arg2 == 43) {
            field332.method2611(98);
            field332.method2386(arg1);
            field332.method2523(arg0);
            field332.method2377(arg3);
            field402 = 0;
            Statics.field3171 = class174.method2976(arg1);
            field403 = arg0;
        }
        if (arg2 == 37) {
            field332.method2611(242);
            field332.method2387(arg1);
            field332.method2377(arg0);
            field332.method2377(arg3);
            field402 = 0;
            Statics.field3171 = class174.method2976(arg1);
            field403 = arg0;
        }
        if (arg2 == 40) {
            field332.method2611(177);
            field332.method2375(arg3);
            field332.method2387(arg1);
            field332.method2525(arg0);
            field402 = 0;
            Statics.field3171 = class174.method2976(arg1);
            field403 = arg0;
        }
        if (arg2 == 14) {
            class3 var32 = field411[arg3];
            if (var32 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field305 = 0;
                field522 = arg0;
                field523 = arg1;
                field332.method2611(47);
                field332.method2375(arg3);
                field332.method2375(Statics.field2910);
                field332.method2387(Statics.field12);
                field332.method2368(class138.field2096[82] ? 1 : 0);
                field332.method2525(Statics.field1326);
            }
        }
        if (arg2 == 23) {
            Statics.field2231.method1818(Statics.field2194, arg0, arg1);
        }
        if (arg2 == 51) {
            class3 var33 = field411[arg3];
            if (var33 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field305 = 0;
                field522 = arg0;
                field523 = arg1;
                field332.method2611(54);
                field332.method2375(arg3);
                field332.method2369(class138.field2096[82] ? 1 : 0);
            }
        }
        if (arg2 == 1002) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field305 = 0;
            field332.method2611(74);
            field332.method2523(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 20) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field305 = 0;
            field522 = arg0;
            field523 = arg1;
            field332.method2611(62);
            field332.method2525(arg3);
            field332.method2480(class138.field2096[82] ? 1 : 0);
            field332.method2523(Statics.field63 + arg0);
            field332.method2525(Statics.field1435 + arg1);
        }
        if (arg2 == 29) {
            field332.method2611(220);
            field332.method2332(arg1);
            class174 var34 = class174.method2976(arg1);
            if (var34.field2861 != null && var34.field2861[0][0] == 5) {
                int var35 = var34.field2861[0][1];
                if (class177.field2897[var35] != var34.field2863[0]) {
                    class177.field2897[var35] = var34.field2863[0];
                    method41(var35);
                }
            }
        }
        if (arg2 == 2) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field305 = 0;
            field522 = arg0;
            field523 = arg1;
            field332.method2611(37);
            field332.method2377(field444);
            field332.method2523(arg3 >> 14 & 0x7FFF);
            field332.method2377(Statics.field1435 + arg1);
            field332.method2386(Statics.field57);
            field332.method2368(class138.field2096[82] ? 1 : 0);
            field332.method2377(Statics.field63 + arg0);
        }
        if (arg2 == 15) {
            class3 var36 = field411[arg3];
            if (var36 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field305 = 0;
                field522 = arg0;
                field523 = arg1;
                field332.method2611(147);
                field332.method2523(arg3);
                field332.method2525(field444);
                field332.method2387(Statics.field57);
                field332.method2368(class138.field2096[82] ? 1 : 0);
            }
        }
        if (arg2 == 45) {
            class3 var37 = field411[arg3];
            if (var37 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field305 = 0;
                field522 = arg0;
                field523 = arg1;
                field332.method2611(30);
                field332.method2523(arg3);
                field332.method2427(class138.field2096[82] ? 1 : 0);
            }
        }
        if (arg2 == 35) {
            field332.method2611(34);
            field332.method2523(arg0);
            field332.method2377(arg3);
            field332.method2386(arg1);
            field402 = 0;
            Statics.field3171 = class174.method2976(arg1);
            field403 = arg0;
        }
        if (arg2 == 9) {
            class35 var38 = field327[arg3];
            if (var38 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field305 = 0;
                field522 = arg0;
                field523 = arg1;
                field332.method2611(227);
                field332.method2369(class138.field2096[82] ? 1 : 0);
                field332.method2525(arg3);
            }
        }
        if (arg2 == 6) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field305 = 0;
            field522 = arg0;
            field523 = arg1;
            field332.method2611(88);
            field332.method2377(Statics.field1435 + arg1);
            field332.method2427(class138.field2096[82] ? 1 : 0);
            field332.method2377(Statics.field63 + arg0);
            field332.method2523(arg3 >> 14 & 0x7FFF);
        }
        if (field353 != 0) {
            field353 = 0;
            method38(class174.method2976(Statics.field12));
        }
        if (field443) {
            method566();
        }
        if (Statics.field3171 != null && field402 == 0) {
            method38(Statics.field3171);
        }
    }

    @ObfuscatedName("a.bm(ILjava/lang/String;I)V")
    public static void method219(int arg0, String arg1) {
        int var2 = class33.field739;
        int[] var3 = class33.field740;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class3 var6 = field411[var3[var5]];
            if (var6 != null && Statics.field2263 != var6 && var6.field27 != null && var6.field27.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field332.method2611(25);
                    field332.method2369(0);
                    field332.method2375(var3[var5]);
                } else if (arg0 == 4) {
                    field332.method2611(250);
                    field332.method2377(var3[var5]);
                    field332.method2369(0);
                } else if (arg0 == 6) {
                    field332.method2611(162);
                    field332.method2368(0);
                    field332.method2375(var3[var5]);
                } else if (arg0 == 7) {
                    field332.method2611(228);
                    field332.method2369(0);
                    field332.method2525(var3[var5]);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class12.method936(4, "", class158.field2330 + arg1);
        }
    }

    @ObfuscatedName("dh.br(IIIII)V")
    public static void method2223(int arg0, int arg1, int arg2, int arg3) {
        class174 var4 = class174.method3018(arg0, arg1);
        if (var4 != null && var4.field2748 != null) {
            class1 var5 = new class1();
            var5.field11 = var4;
            var5.field13 = var4.field2748;
            class37.method1948(var5, 200000);
        }
        field320 = arg3;
        field443 = true;
        Statics.field57 = arg0;
        field444 = arg1;
        Statics.field2116 = arg2;
        method38(var4);
    }

    @ObfuscatedName("m.bd(I)V")
    public static void method566() {
        if (!field443) {
            return;
        }
        class174 var0 = class174.method3018(Statics.field57, field444);
        if (var0 != null && var0.field2841 != null) {
            class1 var1 = new class1();
            var1.field11 = var0;
            var1.field13 = var0.field2841;
            class37.method2222(var1);
        }
        field443 = false;
        method38(var0);
    }

    @ObfuscatedName("ad.bk(IIIILjava/lang/String;B)V")
    public static void method974(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class174 var5 = class174.method3018(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2849 != null) {
            class1 var6 = new class1();
            var6.field11 = var5;
            var6.field6 = arg0;
            var6.field10 = arg4;
            var6.field13 = var5.field2849;
            class37.method1948(var6, 200000);
        }
        boolean var7 = true;
        if (var5.field2769 > 0) {
            var7 = method109(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method720(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            field332.method2611(191);
            field332.method2332(arg1);
            field332.method2525(arg2);
            field332.method2525(arg3);
        }
        if (arg0 == 2) {
            field332.method2611(8);
            field332.method2332(arg1);
            field332.method2525(arg2);
            field332.method2525(arg3);
        }
        if (arg0 == 3) {
            field332.method2611(247);
            field332.method2332(arg1);
            field332.method2525(arg2);
            field332.method2525(arg3);
        }
        if (arg0 == 4) {
            field332.method2611(77);
            field332.method2332(arg1);
            field332.method2525(arg2);
            field332.method2525(arg3);
        }
        if (arg0 == 5) {
            field332.method2611(209);
            field332.method2332(arg1);
            field332.method2525(arg2);
            field332.method2525(arg3);
        }
        if (arg0 == 6) {
            field332.method2611(106);
            field332.method2332(arg1);
            field332.method2525(arg2);
            field332.method2525(arg3);
        }
        if (arg0 == 7) {
            field332.method2611(213);
            field332.method2332(arg1);
            field332.method2525(arg2);
            field332.method2525(arg3);
        }
        if (arg0 == 8) {
            field332.method2611(155);
            field332.method2332(arg1);
            field332.method2525(arg2);
            field332.method2525(arg3);
        }
        if (arg0 == 9) {
            field332.method2611(19);
            field332.method2332(arg1);
            field332.method2525(arg2);
            field332.method2525(arg3);
        }
        if (arg0 == 10) {
            field332.method2611(65);
            field332.method2332(arg1);
            field332.method2525(arg2);
            field332.method2525(arg3);
        }
    }

    @ObfuscatedName("hb.by(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method3705(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field429 || field430 >= 500) {
            return;
        }
        field435[field430] = arg0;
        field397[field430] = arg1;
        field433[field430] = arg2;
        field434[field430] = arg3;
        field420[field430] = arg4;
        field432[field430] = arg5;
        field430++;
    }

    @ObfuscatedName("aw.bg(I)V")
    public static void method632() {
        for (int var0 = 0; var0 < field430; var0++) {
            int var1 = field433[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field430 - 1) {
                    for (int var3 = var0; var3 < field430 - 1; var3++) {
                        field435[var3] = field435[var3 + 1];
                        field397[var3] = field397[var3 + 1];
                        field433[var3] = field433[var3 + 1];
                        field434[var3] = field434[var3 + 1];
                        field420[var3] = field420[var3 + 1];
                        field432[var3] = field432[var3 + 1];
                    }
                }
                field430--;
            }
        }
    }

    @ObfuscatedName("cq.bu(IIIII)V")
    public static final void method1947(int arg0, int arg1, int arg2, int arg3) {
        if (field353 == 0 && !field443) {
            method3705(class158.field2450, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class106.field1844; var6++) {
            int var7 = class106.field1845[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field2231.method1811(Statics.field2194, var8, var9, var7) >= 0) {
                    class41 var12 = class41.method3164(var11);
                    if (var12.field950 != null) {
                        var12 = var12.method786();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field353 == 1) {
                        method3705(class158.field2304, field350 + " " + class2.field25 + " " + class2.method2958(65535) + var12.field911, 1, var7, var8, var9);
                    } else if (!field443) {
                        String[] var13 = var12.field928;
                        if (field440) {
                            var13 = method2(var13);
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
                                    method3705(var13[var14], class2.method2958(65535) + var12.field911, var15, var7, var8, var9);
                                }
                            }
                        }
                        method3705(class158.field2446, class2.method2958(65535) + var12.field911, 1002, var12.field908 << 14, var8, var9);
                    } else if ((Statics.field2116 & 0x4) == 4) {
                        method3705(field446, field447 + " " + class2.field25 + " " + class2.method2958(65535) + var12.field911, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class35 var16 = field327[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field763.field866 == 1 && (var16.field814 & 0x7F) == 64 && (var16.field792 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field450; var17++) {
                            class35 var18 = field327[field319[var17]];
                            if (var18 != null && var16 != var18 && var18.field763.field866 == 1 && var16.field814 == var18.field814 && var16.field792 == var18.field792) {
                                method79(var18.field763, field319[var17], var8, var9);
                            }
                        }
                        int var19 = class33.field739;
                        int[] var20 = class33.field740;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class3 var22 = field411[var20[var21]];
                            if (var22 != null && var16.field814 == var22.field814 && var16.field792 == var22.field792) {
                                method194(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method79(var16.field763, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var23 = field411[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field814 & 0x7F) == 64 && (var23.field792 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field450; var24++) {
                            class35 var25 = field327[field319[var24]];
                            if (var25 != null && var25.field763.field866 == 1 && var23.field814 == var25.field814 && var23.field792 == var25.field792) {
                                method79(var25.field763, field319[var24], var8, var9);
                            }
                        }
                        int var26 = class33.field739;
                        int[] var27 = class33.field740;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class3 var29 = field411[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field814 == var29.field814 && var23.field792 == var29.field792) {
                                method194(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field330 == var11) {
                        var4 = var7;
                    } else {
                        method194(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class200 var30 = field421[Statics.field2194][var8][var9];
                    if (var30 != null) {
                        for (class29 var31 = (class29) var30.method3555(); var31 != null; var31 = (class29) var30.method3557()) {
                            class52 var32 = class52.method727(var31.field673);
                            if (field353 == 1) {
                                method3705(class158.field2304, field350 + " " + class2.field25 + " " + class2.method2958(16748608) + var32.field1091, 16, var31.field673, var8, var9);
                            } else if (!field443) {
                                String[] var33 = var32.field1100;
                                if (field440) {
                                    var33 = method2(var33);
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
                                        method3705(var33[var34], class2.method2958(16748608) + var32.field1091, var35, var31.field673, var8, var9);
                                    } else if (var34 == 2) {
                                        method3705(class158.field2484, class2.method2958(16748608) + var32.field1091, 20, var31.field673, var8, var9);
                                    }
                                }
                                method3705(class158.field2446, class2.method2958(16748608) + var32.field1091, 1004, var31.field673, var8, var9);
                            } else if ((Statics.field2116 & 0x1) == 1) {
                                method3705(field446, field447 + " " + class2.field25 + " " + class2.method2958(16748608) + var32.field1091, 17, var31.field673, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class3 var38 = field411[field330];
            method194(var38, field330, var36, var37);
        }
    }

    @ObfuscatedName("y.ck(Lay;IIII)V")
    public static final void method79(class40 arg0, int arg1, int arg2, int arg3) {
        if (field430 >= 400) {
            return;
        }
        if (arg0.field890 != null) {
            arg0 = arg0.method754();
        }
        if (arg0 == null || !arg0.field893 || arg0.field894 && field375 != arg1) {
            return;
        }
        String var4 = arg0.field865;
        if (arg0.field882 != 0) {
            int var6 = arg0.field882;
            int var7 = Statics.field2263.field32;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method2958(16711680);
            } else if (var8 < -6) {
                var9 = class2.method2958(16723968);
            } else if (var8 < -3) {
                var9 = class2.method2958(16740352);
            } else if (var8 < 0) {
                var9 = class2.method2958(16756736);
            } else if (var8 > 9) {
                var9 = class2.method2958(65280);
            } else if (var8 > 6) {
                var9 = class2.method2958(4259584);
            } else if (var8 > 3) {
                var9 = class2.method2958(8453888);
            } else if (var8 > 0) {
                var9 = class2.method2958(12648192);
            } else {
                var9 = class2.method2958(16776960);
            }
            var4 = var4 + var9 + " " + class2.field20 + class158.field2368 + arg0.field882 + class2.field21;
        }
        if (field353 == 1) {
            method3705(class158.field2304, field350 + " " + class2.field25 + " " + class2.method2958(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field443) {
            String[] var10 = arg0.field880;
            if (field440) {
                var10 = method2(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class158.field2550)) {
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
                        method3705(var10[var11], class2.method2958(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class158.field2550)) {
                        short var14 = 0;
                        if (field314 != class21.field575) {
                            if (field314 == class21.field577 || field314 == class21.field576 && arg0.field882 > Statics.field2263.field32) {
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
                            method3705(var10[var13], class2.method2958(16776960) + var4, var15, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method3705(class158.field2446, class2.method2958(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field2116 & 0x2) == 2) {
            method3705(field446, field447 + " " + class2.field25 + " " + class2.method2958(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("a.cp(Lj;IIIB)V")
    public static final void method194(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2263 == arg0 || field430 >= 400) {
            return;
        }
        String var9;
        if (arg0.field44 == 0) {
            String var4 = arg0.field31[0] + arg0.field27 + arg0.field31[1];
            int var5 = arg0.field32;
            int var6 = Statics.field2263.field32;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method2958(16711680);
            } else if (var7 < -6) {
                var8 = class2.method2958(16723968);
            } else if (var7 < -3) {
                var8 = class2.method2958(16740352);
            } else if (var7 < 0) {
                var8 = class2.method2958(16756736);
            } else if (var7 > 9) {
                var8 = class2.method2958(65280);
            } else if (var7 > 6) {
                var8 = class2.method2958(4259584);
            } else if (var7 > 3) {
                var8 = class2.method2958(8453888);
            } else if (var7 > 0) {
                var8 = class2.method2958(12648192);
            } else {
                var8 = class2.method2958(16776960);
            }
            var9 = var4 + var8 + " " + class2.field20 + class158.field2368 + arg0.field32 + class2.field21 + arg0.field31[2];
        } else {
            var9 = arg0.field31[0] + arg0.field27 + arg0.field31[1] + " " + class2.field20 + class158.field2509 + arg0.field44 + class2.field21 + arg0.field31[2];
        }
        if (field353 == 1) {
            method3705(class158.field2304, field350 + " " + class2.field25 + " " + class2.method2958(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field443) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field417[var10] != null) {
                    short var11 = 0;
                    if (field417[var10].equalsIgnoreCase(class158.field2550)) {
                        if (field313 == class21.field575) {
                            continue;
                        }
                        if (field313 == class21.field577 || field313 == class21.field576 && arg0.field32 > Statics.field2263.field32) {
                            var11 = 2000;
                        }
                        if (Statics.field2263.field46 != 0 && arg0.field46 != 0) {
                            if (Statics.field2263.field46 == arg0.field46) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field418[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field416[var10] + var11;
                    method3705(field417[var10], class2.method2958(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2116 & 0x8) == 8) {
            method3705(field446, field447 + " " + class2.field25 + " " + class2.method2958(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field430; var14++) {
            if (field433[var14] == 23) {
                field397[var14] = class2.method2958(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("client.cr(IIIIIIIII)V")
    public static final void method269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class174.method1767(arg0)) {
            Statics.field969 = null;
            method1484(Statics.field2751[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field969 != null) {
                method1484(Statics.field969, -1412584499, arg1, arg2, arg3, arg4, Statics.field1741, Statics.field126, arg7);
                Statics.field969 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field508[var8] = true;
            }
        } else {
            field508[arg7] = true;
        }
    }

    @ObfuscatedName("br.cs([Lfb;IIIIIIIIB)V")
    public static final void method1484(class174[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1667(arg2, arg3, arg4, arg5);
        class92.method1982();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class174 var10 = arg0[var9];
            if (var10 != null && (var10.field2778 == arg1 || arg1 == -1412584499 && field461 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field496[field491] = var10.field2797 + arg6;
                    field497[field491] = var10.field2824 + arg7;
                    field498[field491] = var10.field2764;
                    field499[field491] = var10.field2765;
                    var11 = ++field491 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2880 = var11;
                var10.field2881 = field297;
                if (!var10.field2742 || !method149(var10)) {
                    if (var10.field2769 > 0) {
                        int var12 = var10.field2769;
                        if (var12 == 324) {
                            if (field562 == -1) {
                                field562 = var10.field2784;
                                field518 = var10.field2758;
                            }
                            if (field340.field2914) {
                                var10.field2784 = field562;
                            } else {
                                var10.field2784 = field518;
                            }
                        } else if (var12 == 325) {
                            if (field562 == -1) {
                                field562 = var10.field2784;
                                field518 = var10.field2758;
                            }
                            if (field340.field2914) {
                                var10.field2784 = field518;
                            } else {
                                var10.field2784 = field562;
                            }
                        } else if (var12 == 327) {
                            var10.field2840 = 150;
                            var10.field2801 = (int) (Math.sin((double) field297 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2792 = 5;
                            var10.field2793 = 0;
                        } else if (var12 == 328) {
                            var10.field2840 = 150;
                            var10.field2801 = (int) (Math.sin((double) field297 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2792 = 5;
                            var10.field2793 = 1;
                        }
                    }
                    int var13 = var10.field2797 + arg6;
                    int var14 = var10.field2824 + arg7;
                    int var15 = var10.field2831;
                    if (field461 == var10) {
                        if (arg1 != -1412584499 && !var10.field2827) {
                            Statics.field969 = arg0;
                            Statics.field1741 = arg6;
                            Statics.field126 = arg7;
                            continue;
                        }
                        if (field546 && field466) {
                            int var16 = class141.field2135;
                            int var17 = class141.field2136;
                            int var18 = var16 - field561;
                            int var19 = var17 - field464;
                            if (var18 < field441) {
                                var18 = field441;
                            }
                            if (var10.field2764 + var18 > field441 + field462.field2764) {
                                var18 = field441 + field462.field2764 - var10.field2764;
                            }
                            if (var19 < field448) {
                                var19 = field448;
                            }
                            if (var10.field2765 + var19 > field448 + field462.field2765) {
                                var19 = field448 + field462.field2765 - var10.field2765;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2827) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2834 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2834 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2764 + var13;
                        int var27 = var10.field2765 + var14;
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
                        int var30 = var10.field2764 + var13;
                        int var31 = var10.field2765 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2742 || var20 < var22 && var21 < var23) {
                        if (var10.field2769 != 0) {
                            if (var10.field2769 == 1336) {
                                if (field303) {
                                    var14 += 15;
                                    Statics.field1022.method3765("Fps:" + field2182, var10.field2764 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field384) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field384) {
                                        var34 = 16711680;
                                    }
                                    Statics.field1022.method3765("Mem:" + var33 + "k", var10.field2764 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2769 == 1337) {
                                field437 = var13;
                                field438 = var14;
                                method2036(var13, var14, var10.field2764, var10.field2765);
                                field508[var10.field2880] = true;
                                class80.method1667(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2769 == 1338) {
                                method2654();
                                class176 var35 = var10.method3174(false);
                                if (var35 != null) {
                                    class80.method1667(var13, var14, var35.field2889 + var13, var35.field2890 + var14);
                                    if (field494 == 2 || field494 == 5) {
                                        class80.method1732(var13, var14, 0, var35.field2892, var35.field2893);
                                    } else {
                                        int var36 = field361 + field323 & 0x7FF;
                                        int var37 = Statics.field2263.field814 / 32 + 48;
                                        int var38 = 464 - Statics.field2263.field792 / 32;
                                        Statics.field1018.method1599(var13, var14, var35.field2889, var35.field2890, var37, var38, var36, field559 + 256, var35.field2892, var35.field2893);
                                        for (int var39 = 0; var39 < field374; var39++) {
                                            int var40 = field294[var39] * 4 + 2 - Statics.field2263.field814 / 32;
                                            int var41 = field388[var39] * 4 + 2 - Statics.field2263.field792 / 32;
                                            method2672(var13, var14, var40, var41, field521[var39], var35);
                                        }
                                        int var42 = 0;
                                        while (true) {
                                            if (var42 >= 104) {
                                                for (int var47 = 0; var47 < field450; var47++) {
                                                    class35 var48 = field327[field319[var47]];
                                                    if (var48 != null && var48.method20()) {
                                                        class40 var49 = var48.field763;
                                                        if (var49 != null && var49.field890 != null) {
                                                            var49 = var49.method754();
                                                        }
                                                        if (var49 != null && var49.field881 && var49.field893) {
                                                            int var50 = var48.field814 / 32 - Statics.field2263.field814 / 32;
                                                            int var51 = var48.field792 / 32 - Statics.field2263.field792 / 32;
                                                            method2672(var13, var14, var50, var51, Statics.field3181[1], var35);
                                                        }
                                                    }
                                                }
                                                int var52 = class33.field739;
                                                int[] var53 = class33.field740;
                                                for (int var54 = 0; var54 < var52; var54++) {
                                                    class3 var55 = field411[var53[var54]];
                                                    if (var55 != null && var55.method20() && !var55.field41 && Statics.field2263 != var55) {
                                                        int var56 = var55.field814 / 32 - Statics.field2263.field814 / 32;
                                                        int var57 = var55.field792 / 32 - Statics.field2263.field792 / 32;
                                                        boolean var58 = false;
                                                        if (method146(var55.field27, true)) {
                                                            var58 = true;
                                                        }
                                                        boolean var59 = false;
                                                        for (int var60 = 0; var60 < Statics.field1958; var60++) {
                                                            if (var55.field27.equals(Statics.field924[var60].field618)) {
                                                                var59 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var61 = false;
                                                        if (Statics.field2263.field46 != 0 && var55.field46 != 0 && Statics.field2263.field46 == var55.field46) {
                                                            var61 = true;
                                                        }
                                                        if (var58) {
                                                            method2672(var13, var14, var56, var57, Statics.field3181[3], var35);
                                                        } else if (var61) {
                                                            method2672(var13, var14, var56, var57, Statics.field3181[4], var35);
                                                        } else if (var59) {
                                                            method2672(var13, var14, var56, var57, Statics.field3181[5], var35);
                                                        } else {
                                                            method2672(var13, var14, var56, var57, Statics.field3181[2], var35);
                                                        }
                                                    }
                                                }
                                                if (field324 != 0 && field297 % 20 < 10) {
                                                    if (field324 == 1 && field306 >= 0 && field306 < field327.length) {
                                                        class35 var62 = field327[field306];
                                                        if (var62 != null) {
                                                            int var63 = var62.field814 / 32 - Statics.field2263.field814 / 32;
                                                            int var64 = var62.field792 / 32 - Statics.field2263.field792 / 32;
                                                            method145(var13, var14, var63, var64, Statics.field3159[1], var35);
                                                        }
                                                    }
                                                    if (field324 == 2) {
                                                        int var65 = field308 * 4 - Statics.field63 * 4 + 2 - Statics.field2263.field814 / 32;
                                                        int var66 = field309 * 4 - Statics.field1435 * 4 + 2 - Statics.field2263.field792 / 32;
                                                        method145(var13, var14, var65, var66, Statics.field3159[1], var35);
                                                    }
                                                    if (field324 == 10 && field307 >= 0 && field307 < field411.length) {
                                                        class3 var67 = field411[field307];
                                                        if (var67 != null) {
                                                            int var68 = var67.field814 / 32 - Statics.field2263.field814 / 32;
                                                            int var69 = var67.field792 / 32 - Statics.field2263.field792 / 32;
                                                            method145(var13, var14, var68, var69, Statics.field3159[1], var35);
                                                        }
                                                    }
                                                }
                                                if (field522 != 0) {
                                                    int var70 = field522 * 4 + 2 - Statics.field2263.field814 / 32;
                                                    int var71 = field523 * 4 + 2 - Statics.field2263.field792 / 32;
                                                    method2672(var13, var14, var70, var71, Statics.field3159[0], var35);
                                                }
                                                if (!Statics.field2263.field41) {
                                                    class80.method1739(var35.field2889 / 2 + var13 - 1, var35.field2890 / 2 + var14 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var43 = 0; var43 < 104; var43++) {
                                                class200 var44 = field421[Statics.field2194][var42][var43];
                                                if (var44 != null) {
                                                    int var45 = var42 * 4 + 2 - Statics.field2263.field814 / 32;
                                                    int var46 = var43 * 4 + 2 - Statics.field2263.field792 / 32;
                                                    method2672(var13, var14, var45, var46, Statics.field3181[0], var35);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                    field284[var11] = true;
                                }
                                class80.method1667(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2769 == 1339) {
                                class176 var72 = var10.method3174(false);
                                if (var72 != null) {
                                    if (field494 < 3) {
                                        Statics.field2264.method1599(var13, var14, var72.field2889, var72.field2890, 25, 25, field323, 256, var72.field2892, var72.field2893);
                                    } else {
                                        class80.method1732(var13, var14, 0, var72.field2892, var72.field2893);
                                    }
                                }
                                class80.method1667(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2834 == 0) {
                            if (!var10.field2742 && method149(var10) && Statics.field2733 != var10) {
                                continue;
                            }
                            if (!var10.field2742) {
                                if (var10.field2771 > var10.field2773 - var10.field2765) {
                                    var10.field2771 = var10.field2773 - var10.field2765;
                                }
                                if (var10.field2771 < 0) {
                                    var10.field2771 = 0;
                                }
                            }
                            method1484(arg0, var10.field2749, var20, var21, var22, var23, var13 - var10.field2864, var14 - var10.field2771, var11);
                            if (var10.field2873 != null) {
                                method1484(var10.field2873, var10.field2749, var20, var21, var22, var23, var13 - var10.field2864, var14 - var10.field2771, var11);
                            }
                            class4 var73 = (class4) field449.method3538((long) var10.field2749);
                            if (var73 != null) {
                                method269(var73.field61, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class80.method1667(arg2, arg3, arg4, arg5);
                            class92.method1982();
                        }
                        if (field502 || field495[var11] || field500 > 1) {
                            if (var10.field2834 == 0 && !var10.field2742 && var10.field2773 > var10.field2765) {
                                method2682(var10.field2764 + var13, var14, var10.field2771, var10.field2765, var10.field2773);
                            }
                            if (var10.field2834 != 1) {
                                if (var10.field2834 == 2) {
                                    int var74 = 0;
                                    for (int var75 = 0; var75 < var10.field2766; var75++) {
                                        for (int var76 = 0; var76 < var10.field2760; var76++) {
                                            int var77 = (var10.field2815 + 32) * var76 + var13;
                                            int var78 = (var10.field2816 + 32) * var75 + var14;
                                            if (var74 < 20) {
                                                var77 += var10.field2817[var74];
                                                var78 += var10.field2818[var74];
                                            }
                                            if (var10.field2867[var74] > 0) {
                                                boolean var79 = false;
                                                boolean var80 = false;
                                                int var81 = var10.field2867[var74] - 1;
                                                if (var77 + 32 > arg2 && var77 < arg4 && var78 + 32 > arg3 && var78 < arg5 || Statics.field850 == var10 && field348 == var74) {
                                                    class79 var82;
                                                    if (field353 == 1 && Statics.field1326 == var74 && Statics.field12 == var10.field2749) {
                                                        var82 = class52.method775(var81, var10.field2746[var74], 2, 0, 2, false);
                                                    } else {
                                                        var82 = class52.method775(var81, var10.field2746[var74], 1, 3153952, 2, false);
                                                    }
                                                    if (var82 == null) {
                                                        method38(var10);
                                                    } else if (Statics.field850 == var10 && field348 == var74) {
                                                        int var83 = class141.field2135 - field405;
                                                        int var84 = class141.field2136 - field406;
                                                        if (var83 < 5 && var83 > -5) {
                                                            var83 = 0;
                                                        }
                                                        if (var84 < 5 && var84 > -5) {
                                                            var84 = 0;
                                                        }
                                                        if (field409 < 5) {
                                                            var83 = 0;
                                                            var84 = 0;
                                                        }
                                                        var82.method1594(var77 + var83, var78 + var84, 128);
                                                        if (arg1 != -1) {
                                                            class174 var85 = arg0[arg1 & 0xFFFF];
                                                            if (var78 + var84 < class80.field1385 && var85.field2771 > 0) {
                                                                int var86 = field539 * (class80.field1385 - var78 - var84) / 3;
                                                                if (var86 > field539 * 10) {
                                                                    var86 = field539 * 10;
                                                                }
                                                                if (var86 > var85.field2771) {
                                                                    var86 = var85.field2771;
                                                                }
                                                                var85.field2771 -= var86;
                                                                field406 += var86;
                                                                method38(var85);
                                                            }
                                                            if (var78 + var84 + 32 > class80.field1386 && var85.field2771 < var85.field2773 - var85.field2765) {
                                                                int var87 = field539 * (var78 + var84 + 32 - class80.field1386) / 3;
                                                                if (var87 > field539 * 10) {
                                                                    var87 = field539 * 10;
                                                                }
                                                                if (var87 > var85.field2773 - var85.field2765 - var85.field2771) {
                                                                    var87 = var85.field2773 - var85.field2765 - var85.field2771;
                                                                }
                                                                var85.field2771 += var87;
                                                                field406 -= var87;
                                                                method38(var85);
                                                            }
                                                        }
                                                    } else if (Statics.field3171 == var10 && field403 == var74) {
                                                        var82.method1594(var77, var78, 128);
                                                    } else {
                                                        var82.method1641(var77, var78);
                                                    }
                                                }
                                            } else if (var10.field2796 != null && var74 < 20) {
                                                class79 var88 = var10.method3172(var74);
                                                if (var88 != null) {
                                                    var88.method1641(var77, var78);
                                                } else if (class174.field2747) {
                                                    method38(var10);
                                                }
                                            }
                                            var74++;
                                        }
                                    }
                                } else if (var10.field2834 == 3) {
                                    int var89;
                                    if (method2033(var10)) {
                                        var89 = var10.field2756;
                                        if (Statics.field2733 == var10 && var10.field2777 != 0) {
                                            var89 = var10.field2777;
                                        }
                                    } else {
                                        var89 = var10.field2774;
                                        if (Statics.field2733 == var10 && var10.field2776 != 0) {
                                            var89 = var10.field2776;
                                        }
                                    }
                                    if (var10.field2851) {
                                        switch(var10.field2779.field1399) {
                                            case 1:
                                                class80.method1674(var13, var14, var10.field2764, var10.field2765, var10.field2774, var10.field2756, 256 - (var10.field2831 & 0xFF), 256 - (var10.field2781 & 0xFF));
                                                break;
                                            case 2:
                                                class80.method1675(var13, var14, var10.field2764, var10.field2765, var10.field2774, var10.field2756, 256 - (var10.field2831 & 0xFF), 256 - (var10.field2781 & 0xFF));
                                                break;
                                            case 3:
                                                class80.method1676(var13, var14, var10.field2764, var10.field2765, var10.field2774, var10.field2756, 256 - (var10.field2831 & 0xFF), 256 - (var10.field2781 & 0xFF));
                                                break;
                                            case 4:
                                                class80.method1731(var13, var14, var10.field2764, var10.field2765, var10.field2774, var10.field2756, 256 - (var10.field2831 & 0xFF), 256 - (var10.field2781 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class80.method1739(var13, var14, var10.field2764, var10.field2765, var89);
                                                } else {
                                                    class80.method1729(var13, var14, var10.field2764, var10.field2765, var89, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class80.method1726(var13, var14, var10.field2764, var10.field2765, var89);
                                    } else {
                                        class80.method1680(var13, var14, var10.field2764, var10.field2765, var89, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2834 == 4) {
                                    class225 var90 = var10.method3176();
                                    if (var90 != null) {
                                        String var91 = var10.field2809;
                                        int var92;
                                        if (method2033(var10)) {
                                            var92 = var10.field2756;
                                            if (Statics.field2733 == var10 && var10.field2777 != 0) {
                                                var92 = var10.field2777;
                                            }
                                            if (var10.field2810.length() > 0) {
                                                var91 = var10.field2810;
                                            }
                                        } else {
                                            var92 = var10.field2774;
                                            if (Statics.field2733 == var10 && var10.field2776 != 0) {
                                                var92 = var10.field2776;
                                            }
                                        }
                                        if (var10.field2742 && var10.field2869 != -1) {
                                            class52 var93 = class52.method727(var10.field2869);
                                            var91 = var93.field1091;
                                            if (var91 == null) {
                                                var91 = "null";
                                            }
                                            if ((var93.field1097 == 1 || var10.field2872 != 1) && var10.field2872 != -1) {
                                                var91 = class2.method2958(16748608) + var91 + class2.field24 + " " + 'x' + method22(var10.field2872);
                                            }
                                        }
                                        if (field452 == var10) {
                                            class158 var10000 = (class158) null;
                                            var91 = class158.field2497;
                                            var92 = var10.field2774;
                                        }
                                        if (!var10.field2742) {
                                            var91 = method2040(var91, var10);
                                        }
                                        var90.method3767(var91, var13, var14, var10.field2764, var10.field2765, var92, var10.field2800 ? 0 : -1, var10.field2812, var10.field2862, var10.field2814);
                                    } else if (class174.field2747) {
                                        method38(var10);
                                    }
                                } else if (var10.field2834 == 5) {
                                    if (var10.field2742) {
                                        class79 var95;
                                        if (var10.field2869 == -1) {
                                            var95 = var10.method3175(false);
                                        } else {
                                            var95 = class52.method775(var10.field2869, var10.field2872, var10.field2788, var10.field2739, var10.field2807, false);
                                        }
                                        if (var95 != null) {
                                            int var96 = var95.field1371;
                                            int var97 = var95.field1373;
                                            if (var10.field2854) {
                                                class80.method1668(var13, var14, var10.field2764 + var13, var10.field2765 + var14);
                                                int var98 = (var10.field2764 + (var96 - 1)) / var96;
                                                int var99 = (var10.field2765 + (var97 - 1)) / var97;
                                                for (int var100 = 0; var100 < var98; var100++) {
                                                    for (int var101 = 0; var101 < var99; var101++) {
                                                        if (var10.field2852 != 0) {
                                                            var95.method1601(var96 / 2 + var96 * var100 + var13, var97 / 2 + var97 * var101 + var14, var10.field2852, 4096);
                                                        } else if (var15 == 0) {
                                                            var95.method1641(var96 * var100 + var13, var97 * var101 + var14);
                                                        } else {
                                                            var95.method1594(var96 * var100 + var13, var97 * var101 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1667(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var102 = var10.field2764 * 4096 / var96;
                                                if (var10.field2852 != 0) {
                                                    var95.method1601(var10.field2764 / 2 + var13, var10.field2765 / 2 + var14, var10.field2852, var102);
                                                } else if (var15 != 0) {
                                                    var95.method1596(var13, var14, var10.field2764, var10.field2765, 256 - (var15 & 0xFF));
                                                } else if (var10.field2764 == var96 && var10.field2765 == var97) {
                                                    var95.method1641(var13, var14);
                                                } else {
                                                    var95.method1590(var13, var14, var10.field2764, var10.field2765);
                                                }
                                            }
                                        } else if (class174.field2747) {
                                            method38(var10);
                                        }
                                    } else {
                                        class79 var94 = var10.method3175(method2033(var10));
                                        if (var94 != null) {
                                            var94.method1641(var13, var14);
                                        } else if (class174.field2747) {
                                            method38(var10);
                                        }
                                    }
                                } else if (var10.field2834 == 6) {
                                    boolean var103 = method2033(var10);
                                    int var104;
                                    if (var103) {
                                        var104 = var10.field2846;
                                    } else {
                                        var104 = var10.field2753;
                                    }
                                    class106 var105 = null;
                                    int var106 = 0;
                                    if (var10.field2869 != -1) {
                                        class52 var107 = class52.method727(var10.field2869);
                                        if (var107 != null) {
                                            class52 var108 = var107.method1033(var10.field2872);
                                            var105 = var108.method1005(1);
                                            if (var105 == null) {
                                                method38(var10);
                                            } else {
                                                var105.method2164();
                                                var106 = var105.field1437 / 2;
                                            }
                                        }
                                    } else if (var10.field2792 == 5) {
                                        if (var10.field2793 == 0) {
                                            var105 = field340.method3284((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var105 = Statics.field2263.method16();
                                        }
                                    } else if (var104 == -1) {
                                        var105 = var10.method3173((class43) null, -1, var103, Statics.field2263.field50);
                                        if (var105 == null && class174.field2747) {
                                            method38(var10);
                                        }
                                    } else {
                                        class43 var109 = class43.method175(var104);
                                        var105 = var10.method3173(var109, var10.field2871, var103, Statics.field2263.field50);
                                        if (var105 == null && class174.field2747) {
                                            method38(var10);
                                        }
                                    }
                                    class92.method2003(var10.field2764 / 2 + var13, var10.field2765 / 2 + var14);
                                    int var110 = var10.field2803 * class92.field1564[var10.field2840] >> 16;
                                    int var111 = var10.field2803 * class92.field1565[var10.field2840] >> 16;
                                    if (var105 != null) {
                                        if (var10.field2742) {
                                            var105.method2164();
                                            if (var10.field2806) {
                                                var105.method2155(0, var10.field2801, var10.field2845, var10.field2840, var10.field2798, var10.field2799 + var106 + var110, var10.field2799 + var111, var10.field2803);
                                            } else {
                                                var105.method2156(0, var10.field2801, var10.field2845, var10.field2840, var10.field2798, var10.field2799 + var106 + var110, var10.field2799 + var111);
                                            }
                                        } else {
                                            var105.method2156(0, var10.field2801, 0, var10.field2840, 0, var110, var111);
                                        }
                                    }
                                    class92.method1998();
                                } else {
                                    if (var10.field2834 == 7) {
                                        class225 var112 = var10.method3176();
                                        if (var112 == null) {
                                            if (class174.field2747) {
                                                method38(var10);
                                            }
                                            continue;
                                        }
                                        int var113 = 0;
                                        for (int var114 = 0; var114 < var10.field2766; var114++) {
                                            for (int var115 = 0; var115 < var10.field2760; var115++) {
                                                if (var10.field2867[var113] > 0) {
                                                    class52 var116 = class52.method727(var10.field2867[var113] - 1);
                                                    String var117;
                                                    if (var116.field1097 != 1 && var10.field2746[var113] == 1) {
                                                        var117 = class2.method2958(16748608) + var116.field1091 + class2.field24;
                                                    } else {
                                                        var117 = class2.method2958(16748608) + var116.field1091 + class2.field24 + " " + 'x' + method22(var10.field2746[var113]);
                                                    }
                                                    int var118 = (var10.field2815 + 115) * var115 + var13;
                                                    int var119 = (var10.field2816 + 12) * var114 + var14;
                                                    if (var10.field2812 == 0) {
                                                        var112.method3764(var117, var118, var119, var10.field2774, var10.field2800 ? 0 : -1);
                                                    } else if (var10.field2812 == 1) {
                                                        var112.method3766(var117, var10.field2764 / 2 + var118, var119, var10.field2774, var10.field2800 ? 0 : -1);
                                                    } else {
                                                        var112.method3765(var117, var10.field2764 + var118 - 1, var119, var10.field2774, var10.field2800 ? 0 : -1);
                                                    }
                                                }
                                                var113++;
                                            }
                                        }
                                    }
                                    if (var10.field2834 == 8 && Statics.field2891 == var10 && field519 == field322) {
                                        int var120 = 0;
                                        int var121 = 0;
                                        class225 var122 = Statics.field1022;
                                        String var123 = var10.field2809;
                                        String var124 = method2040(var123, var10);
                                        while (var124.length() > 0) {
                                            int var125 = var124.indexOf(class2.field23);
                                            String var126;
                                            if (var125 == -1) {
                                                var126 = var124;
                                                var124 = "";
                                            } else {
                                                var126 = var124.substring(0, var125);
                                                var124 = var124.substring(var125 + 4);
                                            }
                                            int var127 = var122.method3759(var126);
                                            if (var127 > var120) {
                                                var120 = var127;
                                            }
                                            var121 += var122.field3191 + 1;
                                        }
                                        var120 += 6;
                                        var121 += 7;
                                        int var128 = var10.field2764 + var13 - 5 - var120;
                                        int var129 = var10.field2765 + var14 + 5;
                                        if (var128 < var13 + 5) {
                                            var128 = var13 + 5;
                                        }
                                        if (var120 + var128 > arg4) {
                                            var128 = arg4 - var120;
                                        }
                                        if (var121 + var129 > arg5) {
                                            var129 = arg5 - var121;
                                        }
                                        class80.method1739(var128, var129, var120, var121, 16777120);
                                        class80.method1726(var128, var129, var120, var121, 0);
                                        String var130 = var10.field2809;
                                        int var131 = var122.field3191 + var129 + 2;
                                        String var132 = method2040(var130, var10);
                                        while (var132.length() > 0) {
                                            int var133 = var132.indexOf(class2.field23);
                                            String var134;
                                            if (var133 == -1) {
                                                var134 = var132;
                                                var132 = "";
                                            } else {
                                                var134 = var132.substring(0, var133);
                                                var132 = var132.substring(var133 + 4);
                                            }
                                            var122.method3764(var134, var128 + 3, var131, 0, -1);
                                            var131 += var122.field3191 + 1;
                                        }
                                    }
                                    if (var10.field2834 == 9) {
                                        if (var10.field2782 == 1) {
                                            int var135;
                                            int var136;
                                            int var137;
                                            int var138;
                                            if (var10.field2783) {
                                                var135 = var13;
                                                var136 = var10.field2765 + var14;
                                                var137 = var10.field2764 + var13;
                                                var138 = var14;
                                            } else {
                                                var135 = var13;
                                                var136 = var14;
                                                var137 = var10.field2764 + var13;
                                                var138 = var10.field2765 + var14;
                                            }
                                            class80.method1677(var135, var136, var137, var138, var10.field2774);
                                        } else {
                                            int var139 = var10.field2764 >= 0 ? var10.field2764 : -var10.field2764;
                                            int var140 = var10.field2765 >= 0 ? var10.field2765 : -var10.field2765;
                                            int var141 = var139;
                                            if (var139 < var140) {
                                                var141 = var140;
                                            }
                                            if (var141 != 0) {
                                                int var142 = (var10.field2764 << 16) / var141;
                                                int var143 = (var10.field2765 << 16) / var141;
                                                if (var143 <= var142) {
                                                    var142 = -var142;
                                                } else {
                                                    var143 = -var143;
                                                }
                                                int var144 = var10.field2782 * var143 >> 17;
                                                int var145 = var10.field2782 * var143 + 1 >> 17;
                                                int var146 = var10.field2782 * var142 >> 17;
                                                int var147 = var10.field2782 * var142 + 1 >> 17;
                                                int var148 = var13 + var144;
                                                int var149 = var13 - var145;
                                                int var150 = var10.field2764 + var13 - var145;
                                                int var151 = var10.field2764 + var13 + var144;
                                                int var152 = var14 + var146;
                                                int var153 = var14 - var147;
                                                int var154 = var10.field2765 + var14 - var147;
                                                int var155 = var10.field2765 + var14 + var146;
                                                class92.method1957(var148, var149, var150);
                                                class92.method1951(var152, var153, var154, var148, var149, var150, var10.field2774);
                                                class92.method1957(var148, var150, var151);
                                                class92.method1951(var152, var154, var155, var148, var150, var151, var10.field2774);
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

    @ObfuscatedName("cv.cc(Ljava/lang/String;Lfb;B)Ljava/lang/String;")
    public static String method2040(String arg0, class174 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method2280(method43(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field251 != null) {
                    var5 = class164.method630(Statics.field251.field2201);
                    if (Statics.field251.field2202 != null) {
                        var5 = (String) Statics.field251.field2202;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("j.cl(II)Ljava/lang/String;")
    public static final String method22(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field18 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2958(65408) + var1.substring(0, var1.length() - 8) + class158.field2456 + " " + class2.field20 + var1 + class2.field21 + class2.field24;
        } else if (var1.length() > 6) {
            return " " + class2.method2958(16777215) + var1.substring(0, var1.length() - 4) + class158.field2405 + " " + class2.field20 + var1 + class2.field21 + class2.field24;
        } else {
            return " " + class2.method2958(16776960) + var1 + class2.field24;
        }
    }

    @ObfuscatedName("ay.cm(Lfb;B)V")
    public static void method779(class174 arg0) {
        class174 var1 = arg0.field2778 == -1 ? null : class174.method2976(arg0.field2778);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field1027;
            var3 = Statics.field2170;
        } else {
            var2 = var1.field2764;
            var3 = var1.field2765;
        }
        method173(arg0, var2, var3, false);
        method545(arg0, var2, var3);
    }

    @ObfuscatedName("u.ci([Lfb;Lfb;ZI)V")
    public static void method120(class174[] arg0, class174 arg1, boolean arg2) {
        int var3 = arg1.field2772 == 0 ? arg1.field2764 : arg1.field2772;
        int var4 = arg1.field2773 == 0 ? arg1.field2765 : arg1.field2773;
        method1055(arg0, arg1.field2749, var3, var4, arg2);
        if (arg1.field2873 != null) {
            method1055(arg1.field2873, arg1.field2749, var3, var4, arg2);
        }
        class4 var5 = (class4) field449.method3538((long) arg1.field2749);
        if (var5 != null) {
            method1777(var5.field61, var3, var4, arg2);
        }
        if (arg1.field2769 == 1337) {
        }
    }

    @ObfuscatedName("ci.cb(IIIZI)V")
    public static final void method1777(int arg0, int arg1, int arg2, boolean arg3) {
        if (class174.method1767(arg0)) {
            method1055(Statics.field2751[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("bc.cu([Lfb;IIIZI)V")
    public static void method1055(class174[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class174 var6 = arg0[var5];
            if (var6 != null && var6.field2778 == arg1) {
                method173(var6, arg2, arg3, arg4);
                method545(var6, arg2, arg3);
                if (var6.field2864 > var6.field2772 - var6.field2764) {
                    var6.field2864 = var6.field2772 - var6.field2764;
                }
                if (var6.field2864 < 0) {
                    var6.field2864 = 0;
                }
                if (var6.field2771 > var6.field2773 - var6.field2765) {
                    var6.field2771 = var6.field2773 - var6.field2765;
                }
                if (var6.field2771 < 0) {
                    var6.field2771 = 0;
                }
                if (var6.field2834 == 0) {
                    method120(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("t.cj(Lfb;IIZB)V")
    public static void method173(class174 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2764;
        int var5 = arg0.field2765;
        if (arg0.field2819 == 0) {
            arg0.field2764 = arg0.field2760;
        } else if (arg0.field2819 == 1) {
            arg0.field2764 = arg1 - arg0.field2760;
        } else if (arg0.field2819 == 2) {
            arg0.field2764 = arg0.field2760 * arg1 >> 14;
        }
        if (arg0.field2757 == 0) {
            arg0.field2765 = arg0.field2766;
        } else if (arg0.field2757 == 1) {
            arg0.field2765 = arg2 - arg0.field2766;
        } else if (arg0.field2757 == 2) {
            arg0.field2765 = arg0.field2766 * arg2 >> 14;
        }
        if (arg0.field2819 == 4) {
            arg0.field2764 = arg0.field2822 * arg0.field2765 / arg0.field2767;
        }
        if (arg0.field2757 == 4) {
            arg0.field2765 = arg0.field2767 * arg0.field2764 / arg0.field2822;
        }
        if (field337 && arg0.field2834 == 0) {
            if (arg0.field2765 < 5 && arg0.field2764 < 5) {
                arg0.field2765 = 5;
                arg0.field2764 = 5;
            } else {
                if (arg0.field2765 <= 0) {
                    arg0.field2765 = 5;
                }
                if (arg0.field2764 <= 0) {
                    arg0.field2764 = 5;
                }
            }
        }
        if (arg0.field2769 == 1337) {
            field460 = arg0;
        }
        if (arg3 && arg0.field2858 != null && (arg0.field2764 != var4 || arg0.field2765 != var5)) {
            class1 var6 = new class1();
            var6.field11 = arg0;
            var6.field13 = arg0.field2858;
            field487.method3550(var6);
        }
    }

    @ObfuscatedName("client.cy(Lfb;III)V")
    public static void method545(class174 arg0, int arg1, int arg2) {
        if (arg0.field2754 == 0) {
            arg0.field2797 = arg0.field2763;
        } else if (arg0.field2754 == 1) {
            arg0.field2797 = (arg1 - arg0.field2764) / 2 + arg0.field2763;
        } else if (arg0.field2754 == 2) {
            arg0.field2797 = arg1 - arg0.field2764 - arg0.field2763;
        } else if (arg0.field2754 == 3) {
            arg0.field2797 = arg0.field2763 * arg1 >> 14;
        } else if (arg0.field2754 == 4) {
            arg0.field2797 = (arg0.field2763 * arg1 >> 14) + (arg1 - arg0.field2764) / 2;
        } else {
            arg0.field2797 = arg1 - arg0.field2764 - (arg0.field2763 * arg1 >> 14);
        }
        if (arg0.field2755 == 0) {
            arg0.field2824 = arg0.field2785;
        } else if (arg0.field2755 == 1) {
            arg0.field2824 = (arg2 - arg0.field2765) / 2 + arg0.field2785;
        } else if (arg0.field2755 == 2) {
            arg0.field2824 = arg2 - arg0.field2765 - arg0.field2785;
        } else if (arg0.field2755 == 3) {
            arg0.field2824 = arg0.field2785 * arg2 >> 14;
        } else if (arg0.field2755 == 4) {
            arg0.field2824 = (arg0.field2785 * arg2 >> 14) + (arg2 - arg0.field2765) / 2;
        } else {
            arg0.field2824 = arg2 - arg0.field2765 - (arg0.field2785 * arg2 >> 14);
        }
        if (!field337 || arg0.field2834 != 0) {
            return;
        }
        if (arg0.field2797 < 0) {
            arg0.field2797 = 0;
        } else if (arg0.field2797 + arg0.field2764 > arg1) {
            arg0.field2797 = arg1 - arg0.field2764;
        }
        if (arg0.field2824 < 0) {
            arg0.field2824 = 0;
        } else if (arg0.field2824 + arg0.field2765 > arg2) {
            arg0.field2824 = arg2 - arg0.field2765;
        }
    }

    @ObfuscatedName("fl.cq(Lfb;IIIIIII)V")
    public static final void method3115(class174 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field371) {
            field534 = 32;
        } else {
            field534 = 0;
        }
        field371 = false;
        if (class141.field2134 == 1 || !Statics.field2632 && class141.field2134 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2771 -= 4;
                method38(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2771 += 4;
                method38(arg0);
            } else if (arg5 >= arg1 - field534 && arg5 < field534 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2771 = (arg4 - arg3) * var8 / var9;
                method38(arg0);
                field371 = true;
            }
        }
        if (field486 == 0) {
            return;
        }
        int var10 = arg0.field2764;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2771 += field486 * 45;
            method38(arg0);
        }
    }

    @ObfuscatedName("eh.cf(IIIIIB)V")
    public static final void method2682(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field2906[0].method1747(arg0, arg1);
        Statics.field2906[1].method1747(arg0, arg1 + arg3 - 16);
        class80.method1739(arg0, arg1 + 16, 16, arg3 - 32, field367);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class80.method1739(arg0, arg1 + 16 + var6, 16, var5, field368);
        class80.method1683(arg0, arg1 + 16 + var6, var5, field326);
        class80.method1683(arg0 + 1, arg1 + 16 + var6, var5, field326);
        class80.method1713(arg0, arg1 + 16 + var6, 16, field326);
        class80.method1713(arg0, arg1 + 17 + var6, 16, field326);
        class80.method1683(arg0 + 15, arg1 + 16 + var6, var5, field369);
        class80.method1683(arg0 + 14, arg1 + 17 + var6, var5 - 1, field369);
        class80.method1713(arg0, arg1 + 15 + var6 + var5, 16, field369);
        class80.method1713(arg0 + 1, arg1 + 14 + var6 + var5, 15, field369);
    }

    @ObfuscatedName("do.ce(II)Ljava/lang/String;")
    public static final String method2280(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("cz.cn(Lfb;I)Z")
    public static final boolean method2033(class174 arg0) {
        if (arg0.field2850 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2850.length; var1++) {
            int var2 = method43(arg0, var1);
            int var3 = arg0.field2863[var1];
            if (arg0.field2850[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2850[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2850[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("x.ct(Lfb;II)I")
    public static final int method43(class174 arg0, int arg1) {
        if (arg0.field2861 == null || arg1 >= arg0.field2861.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2861[arg1];
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
                    var7 = field357[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field426[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field427[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class174 var11 = class174.method2976(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method727(var12).field1099 || field291)) {
                        for (int var13 = 0; var13 < var11.field2867.length; var13++) {
                            if (var12 + 1 == var11.field2867[var13]) {
                                var7 += var11.field2746[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class177.field2897[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class156.field2283[field426[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class177.field2897[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2263.field32;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class156.field2281[var14]) {
                            var7 += field426[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class174 var17 = class174.method2976(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method727(var18).field1099 || field291)) {
                        for (int var19 = 0; var19 < var17.field2867.length; var19++) {
                            if (var18 + 1 == var17.field2867[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field453;
                }
                if (var6 == 12) {
                    var7 = field454;
                }
                if (var6 == 13) {
                    int var20 = class177.field2897[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class177.method89(var22);
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
                    var7 = (Statics.field2263.field814 >> 7) + Statics.field63;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2263.field792 >> 7) + Statics.field1435;
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

    @ObfuscatedName("a.cz(IIIIIIIB)V")
    public static final void method217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class174.method1767(arg0)) {
            method5(Statics.field2751[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("g.cv([Lfb;IIIIIIIB)V")
    public static final void method5(class174[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class174 var9 = arg0[var8];
            if (var9 != null && (!var9.field2742 || var9.field2834 == 0 || var9.field2768 || method720(var9) != 0 || field462 == var9 || var9.field2769 == 1338) && var9.field2778 == arg1 && (!var9.field2742 || !method149(var9))) {
                int var10 = var9.field2797 + arg6;
                int var11 = var9.field2824 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2834 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2834 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2764 + var10;
                    int var19 = var9.field2765 + var11;
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
                    int var22 = var9.field2764 + var10;
                    int var23 = var9.field2765 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field461 == var9) {
                    field342 = true;
                    field439 = var10;
                    field471 = var11;
                }
                if (!var9.field2742 || var12 < var14 && var13 < var15) {
                    int var24 = class141.field2135;
                    int var25 = class141.field2136;
                    if (class141.field2141 != 0) {
                        var24 = class141.field2142;
                        var25 = class141.field2143;
                    }
                    if (var9.field2769 == 1337) {
                        if (!field296 && !field429 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method1947(var24, var25, var12, var13);
                        }
                    } else if (var9.field2769 != 1338) {
                        if (!field429 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var40 = var24 - var10;
                            int var41 = var25 - var11;
                            if (var9.field2752 == 1) {
                                method3705(var9.field2866, "", 24, 0, 0, var9.field2749);
                            }
                            if (var9.field2752 == 2 && !field443) {
                                String var42;
                                if (class179.method2291(method720(var9)) == 0) {
                                    var42 = null;
                                } else if (var9.field2870 == null || var9.field2870.trim().length() == 0) {
                                    var42 = null;
                                } else {
                                    var42 = var9.field2870;
                                }
                                if (var42 != null) {
                                    method3705(var42, class2.method2958(65280) + var9.field2787, 25, 0, -1, var9.field2749);
                                }
                            }
                            if (var9.field2752 == 3) {
                                method3705(class158.field2454, "", 26, 0, 0, var9.field2749);
                            }
                            if (var9.field2752 == 4) {
                                method3705(var9.field2866, "", 28, 0, 0, var9.field2749);
                            }
                            if (var9.field2752 == 5) {
                                method3705(var9.field2866, "", 29, 0, 0, var9.field2749);
                            }
                            if (var9.field2752 == 6 && field452 == null) {
                                method3705(var9.field2866, "", 30, 0, -1, var9.field2749);
                            }
                            if (var9.field2834 == 2) {
                                int var44 = 0;
                                for (int var45 = 0; var45 < var9.field2765; var45++) {
                                    for (int var46 = 0; var46 < var9.field2764; var46++) {
                                        int var47 = (var9.field2815 + 32) * var46;
                                        int var48 = (var9.field2816 + 32) * var45;
                                        if (var44 < 20) {
                                            var47 += var9.field2817[var44];
                                            var48 += var9.field2818[var44];
                                        }
                                        if (var40 >= var47 && var41 >= var48 && var40 < var47 + 32 && var41 < var48 + 32) {
                                            field321 = var44;
                                            Statics.field1984 = var9;
                                            if (var9.field2867[var44] > 0) {
                                                class52 var49 = class52.method727(var9.field2867[var44] - 1);
                                                if (field353 == 1 && class179.method2949(method720(var9))) {
                                                    if (Statics.field12 != var9.field2749 || Statics.field1326 != var44) {
                                                        method3705(class158.field2304, field350 + " " + class2.field25 + " " + class2.method2958(16748608) + var49.field1091, 31, var49.field1093, var44, var9.field2749);
                                                    }
                                                } else if (!field443 || !class179.method2949(method720(var9))) {
                                                    String[] var50 = var49.field1106;
                                                    if (field440) {
                                                        var50 = method2(var50);
                                                    }
                                                    int var51 = method720(var9);
                                                    boolean var52 = (var51 >> 30 & 0x1) != 0;
                                                    if (var52) {
                                                        for (int var53 = 4; var53 >= 3; var53--) {
                                                            if (var50 != null && var50[var53] != null) {
                                                                byte var54;
                                                                if (var53 == 3) {
                                                                    var54 = 36;
                                                                } else {
                                                                    var54 = 37;
                                                                }
                                                                method3705(var50[var53], class2.method2958(16748608) + var49.field1091, var54, var49.field1093, var44, var9.field2749);
                                                            } else if (var53 == 4) {
                                                                method3705(class158.field2299, class2.method2958(16748608) + var49.field1091, 37, var49.field1093, var44, var9.field2749);
                                                            }
                                                        }
                                                    }
                                                    class179 var10000 = (class179) null;
                                                    if (class179.method631(method720(var9))) {
                                                        method3705(class158.field2304, class2.method2958(16748608) + var49.field1091, 38, var49.field1093, var44, var9.field2749);
                                                    }
                                                    var10000 = (class179) null;
                                                    if (class179.method2949(method720(var9)) && var50 != null) {
                                                        for (int var55 = 2; var55 >= 0; var55--) {
                                                            if (var50[var55] != null) {
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
                                                                method3705(var50[var55], class2.method2958(16748608) + var49.field1091, var56, var49.field1093, var44, var9.field2749);
                                                            }
                                                        }
                                                    }
                                                    String[] var57 = var9.field2820;
                                                    if (field440) {
                                                        var57 = method2(var57);
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
                                                                method3705(var57[var58], class2.method2958(16748608) + var49.field1091, var59, var49.field1093, var44, var9.field2749);
                                                            }
                                                        }
                                                    }
                                                    method3705(class158.field2446, class2.method2958(16748608) + var49.field1091, 1005, var49.field1093, var44, var9.field2749);
                                                } else if ((Statics.field2116 & 0x10) == 16) {
                                                    method3705(field446, field447 + " " + class2.field25 + " " + class2.method2958(16748608) + var49.field1091, 32, var49.field1093, var44, var9.field2749);
                                                }
                                            }
                                        }
                                        var44++;
                                    }
                                }
                            }
                            if (var9.field2742) {
                                if (!field443) {
                                    for (int var60 = 9; var60 >= 5; var60--) {
                                        String var61 = method112(var9, var60);
                                        if (var61 != null) {
                                            method3705(var61, var9.field2761, 1007, var60 + 1, var9.field2750, var9.field2749);
                                        }
                                    }
                                    String var62;
                                    if (class179.method2291(method720(var9)) == 0) {
                                        var62 = null;
                                    } else if (var9.field2870 == null || var9.field2870.trim().length() == 0) {
                                        var62 = null;
                                    } else {
                                        var62 = var9.field2870;
                                    }
                                    if (var62 != null) {
                                        method3705(var62, var9.field2761, 25, 0, var9.field2750, var9.field2749);
                                    }
                                    for (int var64 = 4; var64 >= 0; var64--) {
                                        String var65 = method112(var9, var64);
                                        if (var65 != null) {
                                            method3705(var65, var9.field2761, 57, var64 + 1, var9.field2750, var9.field2749);
                                        }
                                    }
                                    if (class179.method655(method720(var9))) {
                                        method3705(class158.field2482, "", 30, 0, var9.field2750, var9.field2749);
                                    }
                                } else if (class179.method3215(method720(var9)) && (Statics.field2116 & 0x20) == 32) {
                                    method3705(field446, field447 + " " + class2.field25 + " " + var9.field2761, 58, 0, var9.field2750, var9.field2749);
                                }
                            }
                        }
                        if (var9.field2834 == 0) {
                            if (!var9.field2742 && method149(var9) && Statics.field2733 != var9) {
                                continue;
                            }
                            method5(arg0, var9.field2749, var12, var13, var14, var15, var10 - var9.field2864, var11 - var9.field2771);
                            if (var9.field2873 != null) {
                                method5(var9.field2873, var9.field2749, var12, var13, var14, var15, var10 - var9.field2864, var11 - var9.field2771);
                            }
                            class4 var66 = (class4) field449.method3538((long) var9.field2749);
                            if (var66 != null) {
                                if (var66.field55 == 0 && class141.field2135 >= var12 && class141.field2136 >= var13 && class141.field2135 < var14 && class141.field2136 < var15 && !field429 && !field337) {
                                    for (class1 var67 = (class1) field487.method3575(); var67 != null; var67 = (class1) field487.method3565()) {
                                        if (var67.field2) {
                                            var67.method3647();
                                            var67.field11.field2874 = false;
                                        }
                                    }
                                    if (Statics.field1756 == 0) {
                                        field461 = null;
                                        field462 = null;
                                    }
                                    if (!field429) {
                                        field435[0] = class158.field2534;
                                        field397[0] = "";
                                        field433[0] = 1006;
                                        field430 = 1;
                                    }
                                }
                                method217(var66.field61, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2742) {
                            if (var9.field2762) {
                                if (class141.field2135 >= var12 && class141.field2136 >= var13 && class141.field2135 < var14 && class141.field2136 < var15) {
                                    for (class1 var68 = (class1) field487.method3575(); var68 != null; var68 = (class1) field487.method3565()) {
                                        if (var68.field2) {
                                            var68.method3647();
                                            var68.field11.field2874 = false;
                                        }
                                    }
                                    if (Statics.field1756 == 0) {
                                        field461 = null;
                                        field462 = null;
                                    }
                                    if (!field429) {
                                        field435[0] = class158.field2534;
                                        field397[0] = "";
                                        field433[0] = 1006;
                                        field430 = 1;
                                    }
                                }
                            } else if (var9.field2738 && class141.field2135 >= var12 && class141.field2136 >= var13 && class141.field2135 < var14 && class141.field2136 < var15) {
                                for (class1 var69 = (class1) field487.method3575(); var69 != null; var69 = (class1) field487.method3565()) {
                                    if (var69.field2 && var69.field11.field2838 == var69.field13) {
                                        var69.method3647();
                                    }
                                }
                            }
                            boolean var70;
                            if (class141.field2135 >= var12 && class141.field2136 >= var13 && class141.field2135 < var14 && class141.field2136 < var15) {
                                var70 = true;
                            } else {
                                var70 = false;
                            }
                            boolean var71 = false;
                            if ((class141.field2134 == 1 || !Statics.field2632 && class141.field2134 == 4) && var70) {
                                var71 = true;
                            }
                            boolean var72 = false;
                            if ((class141.field2141 == 1 || !Statics.field2632 && class141.field2141 == 4) && class141.field2142 >= var12 && class141.field2143 >= var13 && class141.field2142 < var14 && class141.field2143 < var15) {
                                var72 = true;
                            }
                            if (var72) {
                                method3021(var9, class141.field2142 - var10, class141.field2143 - var11);
                            }
                            if (field461 != null && field461 != var9 && var70 && class179.method151(method720(var9))) {
                                field465 = var9;
                            }
                            if (field462 == var9) {
                                field466 = true;
                                field441 = var10;
                                field448 = var11;
                            }
                            if (var9.field2768) {
                                if (var70 && field486 != 0 && var9.field2838 != null) {
                                    class1 var73 = new class1();
                                    var73.field2 = true;
                                    var73.field11 = var9;
                                    var73.field5 = field486;
                                    var73.field13 = var9.field2838;
                                    field487.method3550(var73);
                                }
                                if (field461 != null || Statics.field850 != null || field429) {
                                    var72 = false;
                                    var71 = false;
                                    var70 = false;
                                }
                                if (!var9.field2875 && var72) {
                                    var9.field2875 = true;
                                    if (var9.field2828 != null) {
                                        class1 var74 = new class1();
                                        var74.field2 = true;
                                        var74.field11 = var9;
                                        var74.field4 = class141.field2142 - var10;
                                        var74.field5 = class141.field2143 - var11;
                                        var74.field13 = var9.field2828;
                                        field487.method3550(var74);
                                    }
                                }
                                if (var9.field2875 && var71 && var9.field2759 != null) {
                                    class1 var75 = new class1();
                                    var75.field2 = true;
                                    var75.field11 = var9;
                                    var75.field4 = class141.field2135 - var10;
                                    var75.field5 = class141.field2136 - var11;
                                    var75.field13 = var9.field2759;
                                    field487.method3550(var75);
                                }
                                if (var9.field2875 && !var71) {
                                    var9.field2875 = false;
                                    if (var9.field2833 != null) {
                                        class1 var76 = new class1();
                                        var76.field2 = true;
                                        var76.field11 = var9;
                                        var76.field4 = class141.field2135 - var10;
                                        var76.field5 = class141.field2136 - var11;
                                        var76.field13 = var9.field2833;
                                        field489.method3550(var76);
                                    }
                                }
                                if (var71 && var9.field2876 != null) {
                                    class1 var77 = new class1();
                                    var77.field2 = true;
                                    var77.field11 = var9;
                                    var77.field4 = class141.field2135 - var10;
                                    var77.field5 = class141.field2136 - var11;
                                    var77.field13 = var9.field2876;
                                    field487.method3550(var77);
                                }
                                if (!var9.field2874 && var70) {
                                    var9.field2874 = true;
                                    if (var9.field2835 != null) {
                                        class1 var78 = new class1();
                                        var78.field2 = true;
                                        var78.field11 = var9;
                                        var78.field4 = class141.field2135 - var10;
                                        var78.field5 = class141.field2136 - var11;
                                        var78.field13 = var9.field2835;
                                        field487.method3550(var78);
                                    }
                                }
                                if (var9.field2874 && var70 && var9.field2865 != null) {
                                    class1 var79 = new class1();
                                    var79.field2 = true;
                                    var79.field11 = var9;
                                    var79.field4 = class141.field2135 - var10;
                                    var79.field5 = class141.field2136 - var11;
                                    var79.field13 = var9.field2865;
                                    field487.method3550(var79);
                                }
                                if (var9.field2874 && !var70) {
                                    var9.field2874 = false;
                                    if (var9.field2837 != null) {
                                        class1 var80 = new class1();
                                        var80.field2 = true;
                                        var80.field11 = var9;
                                        var80.field4 = class141.field2135 - var10;
                                        var80.field5 = class141.field2136 - var11;
                                        var80.field13 = var9.field2837;
                                        field489.method3550(var80);
                                    }
                                }
                                if (var9.field2848 != null) {
                                    class1 var81 = new class1();
                                    var81.field11 = var9;
                                    var81.field13 = var9.field2848;
                                    field488.method3550(var81);
                                }
                                if (var9.field2842 != null && field475 > var9.field2877) {
                                    if (var9.field2843 == null || field475 - var9.field2877 > 32) {
                                        class1 var86 = new class1();
                                        var86.field11 = var9;
                                        var86.field13 = var9.field2842;
                                        field487.method3550(var86);
                                    } else {
                                        label680: for (int var82 = var9.field2877; var82 < field475; var82++) {
                                            int var83 = field474[var82 & 0x1F];
                                            for (int var84 = 0; var84 < var9.field2843.length; var84++) {
                                                if (var9.field2843[var84] == var83) {
                                                    class1 var85 = new class1();
                                                    var85.field11 = var9;
                                                    var85.field13 = var9.field2842;
                                                    field487.method3550(var85);
                                                    break label680;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2877 = field475;
                                }
                                if (var9.field2844 != null && field477 > var9.field2786) {
                                    if (var9.field2882 == null || field477 - var9.field2786 > 32) {
                                        class1 var91 = new class1();
                                        var91.field11 = var9;
                                        var91.field13 = var9.field2844;
                                        field487.method3550(var91);
                                    } else {
                                        label656: for (int var87 = var9.field2786; var87 < field477; var87++) {
                                            int var88 = field476[var87 & 0x1F];
                                            for (int var89 = 0; var89 < var9.field2882.length; var89++) {
                                                if (var9.field2882[var89] == var88) {
                                                    class1 var90 = new class1();
                                                    var90.field11 = var9;
                                                    var90.field13 = var9.field2844;
                                                    field487.method3550(var90);
                                                    break label656;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2786 = field477;
                                }
                                if (var9.field2847 != null && field468 > var9.field2879) {
                                    if (var9.field2813 == null || field468 - var9.field2879 > 32) {
                                        class1 var96 = new class1();
                                        var96.field11 = var9;
                                        var96.field13 = var9.field2847;
                                        field487.method3550(var96);
                                    } else {
                                        label632: for (int var92 = var9.field2879; var92 < field468; var92++) {
                                            int var93 = field472[var92 & 0x1F];
                                            for (int var94 = 0; var94 < var9.field2813.length; var94++) {
                                                if (var9.field2813[var94] == var93) {
                                                    class1 var95 = new class1();
                                                    var95.field11 = var9;
                                                    var95.field13 = var9.field2847;
                                                    field487.method3550(var95);
                                                    break label632;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2879 = field468;
                                }
                                if (field436 > var9.field2832 && var9.field2741 != null) {
                                    class1 var97 = new class1();
                                    var97.field11 = var9;
                                    var97.field13 = var9.field2741;
                                    field487.method3550(var97);
                                }
                                if (field493 > var9.field2832 && var9.field2853 != null) {
                                    class1 var98 = new class1();
                                    var98.field11 = var9;
                                    var98.field13 = var9.field2853;
                                    field487.method3550(var98);
                                }
                                if (field289 > var9.field2832 && var9.field2878 != null) {
                                    class1 var99 = new class1();
                                    var99.field11 = var9;
                                    var99.field13 = var9.field2878;
                                    field487.method3550(var99);
                                }
                                if (field328 > var9.field2832 && var9.field2859 != null) {
                                    class1 var100 = new class1();
                                    var100.field11 = var9;
                                    var100.field13 = var9.field2859;
                                    field487.method3550(var100);
                                }
                                if (field484 > var9.field2832 && var9.field2860 != null) {
                                    class1 var101 = new class1();
                                    var101.field11 = var9;
                                    var101.field13 = var9.field2860;
                                    field487.method3550(var101);
                                }
                                if (field485 > var9.field2832 && var9.field2855 != null) {
                                    class1 var102 = new class1();
                                    var102.field11 = var9;
                                    var102.field13 = var9.field2855;
                                    field487.method3550(var102);
                                }
                                var9.field2832 = field360;
                                if (var9.field2808 != null) {
                                    for (int var103 = 0; var103 < field511; var103++) {
                                        class1 var104 = new class1();
                                        var104.field11 = var9;
                                        var104.field8 = field513[var103];
                                        var104.field9 = field512[var103];
                                        var104.field13 = var9.field2808;
                                        field487.method3550(var104);
                                    }
                                }
                            }
                        }
                        if (!var9.field2742 && field461 == null && Statics.field850 == null && !field429) {
                            if ((var9.field2791 >= 0 || var9.field2776 != 0) && class141.field2135 >= var12 && class141.field2136 >= var13 && class141.field2135 < var14 && class141.field2136 < var15) {
                                if (var9.field2791 >= 0) {
                                    Statics.field2733 = arg0[var9.field2791];
                                } else {
                                    Statics.field2733 = var9;
                                }
                            }
                            if (var9.field2834 == 8 && class141.field2135 >= var12 && class141.field2136 >= var13 && class141.field2135 < var14 && class141.field2136 < var15) {
                                Statics.field2891 = var9;
                            }
                            if (var9.field2773 > var9.field2765) {
                                method3115(var9, var9.field2764 + var10, var11, var9.field2765, var9.field2773, class141.field2135, class141.field2136);
                            }
                        }
                    } else if ((field494 == 0 || field494 == 3) && (class141.field2141 == 1 || !Statics.field2632 && class141.field2141 == 4)) {
                        class176 var26 = var9.method3174(true);
                        if (var26 != null) {
                            int var27 = class141.field2142 - var10;
                            int var28 = class141.field2143 - var11;
                            if (var26.method3217(var27, var28)) {
                                int var29 = var27 - var26.field2889 / 2;
                                int var30 = var28 - var26.field2890 / 2;
                                int var31 = field361 + field323 & 0x7FF;
                                int var32 = class92.field1564[var31];
                                int var33 = class92.field1565[var31];
                                int var34 = (field559 + 256) * var32 >> 8;
                                int var35 = (field559 + 256) * var33 >> 8;
                                int var36 = var29 * var35 + var30 * var34 >> 11;
                                int var37 = var30 * var35 - var29 * var34 >> 11;
                                int var38 = Statics.field2263.field814 + var36 >> 7;
                                int var39 = Statics.field2263.field792 - var37 >> 7;
                                field332.method2611(68);
                                field332.method2480(18);
                                field332.method2368(class138.field2096[82] ? (class138.field2096[81] ? 2 : 1) : 0);
                                field332.method2375(Statics.field63 + var38);
                                field332.method2525(Statics.field1435 + var39);
                                field332.method2480(var29);
                                field332.method2480(var30);
                                field332.method2525(field323);
                                field332.method2480(57);
                                field332.method2480(field361);
                                field332.method2480(field559);
                                field332.method2480(89);
                                field332.method2525(Statics.field2263.field814);
                                field332.method2525(Statics.field2263.field792);
                                field332.method2480(63);
                                field522 = var38;
                                field523 = var39;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("af.ca(IIB)V")
    public static final void method713(int arg0, int arg1) {
        if (class174.method1767(arg0)) {
            method698(Statics.field2751[arg0], arg1);
        }
    }

    @ObfuscatedName("ah.cd([Lfb;II)V")
    public static final void method698(class174[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class174 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2834 == 0) {
                    if (var3.field2873 != null) {
                        method698(var3.field2873, arg1);
                    }
                    class4 var4 = (class4) field449.method3538((long) var3.field2749);
                    if (var4 != null) {
                        method713(var4.field61, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2836 != null) {
                    class1 var5 = new class1();
                    var5.field11 = var3;
                    var5.field13 = var3.field2836;
                    class37.method1948(var5, 200000);
                }
                if (arg1 == 1 && var3.field2857 != null) {
                    if (var3.field2750 >= 0) {
                        class174 var6 = class174.method2976(var3.field2749);
                        if (var6 == null || var6.field2873 == null || var3.field2750 >= var6.field2873.length || var6.field2873[var3.field2750] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field11 = var3;
                    var7.field13 = var3.field2857;
                    class37.method1948(var7, 200000);
                }
            }
        }
    }

    @ObfuscatedName("fk.cx(Lfb;III)V")
    public static final void method3021(class174 arg0, int arg1, int arg2) {
        if (field461 != null || field429 || arg0 == null || method654(arg0) == null) {
            return;
        }
        field461 = arg0;
        field462 = method654(arg0);
        field561 = arg1;
        field464 = arg2;
        Statics.field1756 = 0;
        field546 = false;
        if (field430 > 0) {
            method2267(field430 - 1);
        }
    }

    @ObfuscatedName("dx.ch(IB)V")
    public static void method2267(int arg0) {
        Statics.field124 = new class31();
        Statics.field124.field689 = field420[arg0];
        Statics.field124.field692 = field432[arg0];
        Statics.field124.field691 = field433[arg0];
        Statics.field124.field690 = field434[arg0];
        Statics.field124.field693 = field435[arg0];
    }

    @ObfuscatedName("x.cw(Lfb;I)V")
    public static void method38(class174 arg0) {
        if (field492 == arg0.field2881) {
            field508[arg0.field2880] = true;
        }
    }

    @ObfuscatedName("bc.cg(I)V")
    public static void method1050() {
        for (class4 var0 = (class4) field449.method3530(); var0 != null; var0 = (class4) field449.method3531()) {
            int var1 = var0.field61;
            if (class174.method1767(var1)) {
                boolean var2 = true;
                class174[] var3 = Statics.field2751[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2742;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3114;
                    class174 var6 = class174.method2976(var5);
                    if (var6 != null) {
                        method38(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ae.co(Lfb;I)Lfb;")
    public static class174 method654(class174 arg0) {
        class174 var1 = method2366(arg0);
        if (var1 == null) {
            var1 = arg0.field2811;
        }
        return var1;
    }

    @ObfuscatedName("b.dt([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("k.dd(IB)V")
    public static final void method161(int arg0) {
        if (!class174.method1767(arg0)) {
            return;
        }
        class174[] var1 = Statics.field2751[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class174 var3 = var1[var2];
            if (var3 != null) {
                var3.field2871 = 0;
                var3.field2856 = 0;
            }
        }
    }

    @ObfuscatedName("fe.dh([Lfb;II)V")
    public static final void method2959(class174[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class174 var3 = arg0[var2];
            if (var3 != null && var3.field2778 == arg1 && (!var3.field2742 || !method149(var3))) {
                if (var3.field2834 == 0) {
                    if (!var3.field2742 && method149(var3) && Statics.field2733 != var3) {
                        continue;
                    }
                    method2959(arg0, var3.field2749);
                    if (var3.field2873 != null) {
                        method2959(var3.field2873, var3.field2749);
                    }
                    class4 var4 = (class4) field449.method3538((long) var3.field2749);
                    if (var4 != null) {
                        Statics.method2830(var4.field61);
                    }
                }
                if (var3.field2834 == 6) {
                    if (var3.field2753 != -1 || var3.field2846 != -1) {
                        boolean var5 = method2033(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2846;
                        } else {
                            var6 = var3.field2753;
                        }
                        if (var6 != -1) {
                            class43 var7 = class43.method175(var6);
                            var3.field2856 += field539;
                            while (var3.field2856 > var7.field984[var3.field2871]) {
                                var3.field2856 -= var7.field984[var3.field2871];
                                var3.field2871++;
                                if (var3.field2871 >= var7.field966.length) {
                                    var3.field2871 -= var7.field967;
                                    if (var3.field2871 < 0 || var3.field2871 >= var7.field966.length) {
                                        var3.field2871 = 0;
                                    }
                                }
                                method38(var3);
                            }
                        }
                    }
                    if (var3.field2780 != 0 && !var3.field2742) {
                        int var8 = var3.field2780 >> 16;
                        int var9 = var3.field2780 << 16 >> 16;
                        int var10 = field539 * var8;
                        int var11 = field539 * var9;
                        var3.field2840 = var3.field2840 + var10 & 0x7FF;
                        var3.field2801 = var3.field2801 + var11 & 0x7FF;
                        method38(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("x.dr(IB)V")
    public static final void method41(int arg0) {
        method1050();
        class24.method543();
        int var1 = class53.method550(arg0).field1133;
        if (var1 == 0) {
            return;
        }
        int var2 = class177.field2897[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class92.method1949(0.9D);
                ((class96) Statics.field1561).method2029(0.9D);
            }
            if (var2 == 2) {
                class92.method1949(0.8D);
                ((class96) Statics.field1561).method2029(0.8D);
            }
            if (var2 == 3) {
                class92.method1949(0.7D);
                ((class96) Statics.field1561).method2029(0.7D);
            }
            if (var2 == 4) {
                class92.method1949(0.6D);
                ((class96) Statics.field1561).method2029(0.6D);
            }
            class52.field1082.method3486();
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
            if (field525 != var3) {
                if (field525 == 0 && field526 != -1) {
                    Statics.method1778(Statics.field359, field526, 0, var3, false);
                    field527 = false;
                } else if (var3 == 0) {
                    Statics.field2953.method3378();
                    class184.field2954 = 1;
                    Statics.field1076 = null;
                    field527 = false;
                } else {
                    class184.method2791(var3);
                }
                field525 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field528 = 127;
            }
            if (var2 == 1) {
                field528 = 96;
            }
            if (var2 == 2) {
                field528 = 64;
            }
            if (var2 == 3) {
                field528 = 32;
            }
            if (var2 == 4) {
                field528 = 0;
            }
        }
        if (var1 == 5) {
            field428 = var2;
        }
        if (var1 == 6) {
            field378 = var2;
        }
        if (var1 == 9) {
            field363 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field366 = 127;
            }
            if (var2 == 1) {
                field366 = 96;
            }
            if (var2 == 2) {
                field366 = 64;
            }
            if (var2 == 3) {
                field366 = 32;
            }
            if (var2 == 4) {
                field366 = 0;
            }
        }
        if (var1 == 17) {
            field375 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class21[] var4 = new class21[] { class21.field576, class21.field572, class21.field575, class21.field577 };
            field313 = (class21) class110.method2955(var4, var2);
            if (field313 == null) {
                field313 = class21.field576;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field330 = -1;
            } else {
                field330 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class21[] var5 = new class21[] { class21.field576, class21.field572, class21.field575, class21.field577 };
        field314 = (class21) class110.method2955(var5, var2);
        if (field314 == null) {
            field314 = class21.field576;
        }
    }

    @ObfuscatedName("de.dn(I)V")
    public static final void method2284() {
        field332.method2611(102);
        for (class4 var0 = (class4) field449.method3530(); var0 != null; var0 = (class4) field449.method3531()) {
            if (var0.field55 == 0 || var0.field55 == 3) {
                method2795(var0, true);
            }
        }
        if (field452 != null) {
            method38(field452);
            field452 = null;
        }
    }

    @ObfuscatedName("fe.dx(IIII)Ld;")
    public static final class4 method2960(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field61 = arg1;
        var3.field55 = arg2;
        field449.method3528(var3, (long) arg0);
        method161(arg1);
        class174 var4 = class174.method2976(arg0);
        method38(var4);
        if (field452 != null) {
            method38(field452);
            field452 = null;
        }
        method632();
        method120(Statics.field2751[arg0 >> 16], var4, false);
        class37.method704(arg1);
        if (field457 != -1) {
            method713(field457, 1);
        }
        return var3;
    }

    @ObfuscatedName("ey.dl(Ld;ZI)V")
    public static final void method2795(class4 arg0, boolean arg1) {
        int var2 = arg0.field61;
        int var3 = (int) arg0.field3114;
        arg0.method3647();
        if (arg1) {
            class174.method988(var2);
        }
        method3706(var2);
        class174 var4 = class174.method2976(var3);
        if (var4 != null) {
            method38(var4);
        }
        method632();
        if (field457 != -1) {
            method713(field457, 1);
        }
    }

    @ObfuscatedName("l.dm(Lfb;I)Z")
    public static final boolean method109(class174 arg0) {
        int var1 = arg0.field2769;
        if (var1 == 205) {
            field400 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field340.method3252(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field340.method3253(var4, var5 == 1);
        }
        if (var1 == 324) {
            field340.method3285(false);
        }
        if (var1 == 325) {
            field340.method3285(true);
        }
        if (var1 == 326) {
            field332.method2611(130);
            field340.method3257(field332);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("n.do(IIIILck;Lfi;I)V")
    public static final void method145(int arg0, int arg1, int arg2, int arg3, class79 arg4, class176 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method2672(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field361 + field323 & 0x7FF;
        int var8 = class92.field1564[var7];
        int var9 = class92.field1565[var7];
        int var10 = var8 * 256 / (field559 + 256);
        int var11 = var9 * 256 / (field559 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field2657.method1581(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("dy.db(IIIILck;Lfi;I)V")
    public static final void method2672(int arg0, int arg1, int arg2, int arg3, class79 arg4, class176 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field361 + field323 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class92.field1564[var6];
        int var9 = class92.field1565[var6];
        int var10 = var8 * 256 / (field559 + 256);
        int var11 = var9 * 256 / (field559 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1598(arg5.field2889 / 2 + var12 - arg4.field1371 / 2, arg5.field2890 / 2 - var13 - arg4.field1373 / 2, arg0, arg1, arg5.field2889, arg5.field2890, arg5.field2892, arg5.field2893);
        } else {
            arg4.method1641(arg5.field2889 / 2 + arg0 + var12 - arg4.field1371 / 2, arg5.field2890 / 2 + arg1 - var13 - arg4.field1373 / 2);
        }
    }

    @ObfuscatedName("n.de(Ljava/lang/String;ZB)Z")
    public static boolean method146(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class165.method777(arg0, Statics.field290);
        for (int var3 = 0; var3 < field341; var3++) {
            if (var2.equalsIgnoreCase(class165.method777(field557[var3].field244, Statics.field290)) && (!arg1 || field557[var3].field250 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class165.method777(Statics.field2263.field27, Statics.field290))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("am.dv(Ljava/lang/String;B)Z")
    public static boolean method934(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class165.method777(arg0, Statics.field290);
        for (int var2 = 0; var2 < field514; var2++) {
            class8 var3 = field560[var2];
            if (var1.equalsIgnoreCase(class165.method777(var3.field125, Statics.field290))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class165.method777(var3.field123, Statics.field290))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("dy.dw(Ljava/lang/String;ZS)V")
    public static final void method2668(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field514 < 100 || field413 == 1) || field514 >= 400) {
            class12.method936(31, "", class158.field2463);
            return;
        }
        String var2 = class165.method777(arg0, Statics.field290);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field514; var3++) {
            class8 var4 = field560[var3];
            String var5 = class165.method777(var4.field125, Statics.field290);
            if (var5 != null && var5.equals(var2)) {
                class12.method936(31, "", arg0 + class158.field2426);
                return;
            }
            if (var4.field123 != null) {
                String var6 = class165.method777(var4.field123, Statics.field290);
                if (var6 != null && var6.equals(var2)) {
                    class12.method936(31, "", arg0 + class158.field2426);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field341; var7++) {
            class18 var8 = field557[var7];
            String var9 = class165.method777(var8.field244, Statics.field290);
            if (var9 != null && var9.equals(var2)) {
                class12.method936(31, "", class158.field2469 + arg0 + class158.field2435);
                return;
            }
            if (var8.field247 != null) {
                String var10 = class165.method777(var8.field247, Statics.field290);
                if (var10 != null && var10.equals(var2)) {
                    class12.method936(31, "", class158.field2469 + arg0 + class158.field2435);
                    return;
                }
            }
        }
        if (class165.method777(Statics.field2263.field27, Statics.field290).equals(var2)) {
            class12.method936(31, "", class158.field2539);
        } else {
            field332.method2611(168);
            field332.method2480(class120.method42(arg0));
            field332.method2335(arg0);
        }
    }

    @ObfuscatedName("ah.di(Ljava/lang/String;B)V")
    public static final void method659(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class165.method777(arg0, Statics.field290);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field341; var2++) {
            class18 var3 = field557[var2];
            String var4 = var3.field244;
            String var5 = class165.method777(var4, Statics.field290);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field341--;
                for (int var7 = var2; var7 < field341; var7++) {
                    field557[var7] = field557[var7 + 1];
                }
                field493 = field360;
                field332.method2611(188);
                field332.method2480(class120.method42(arg0));
                field332.method2335(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("hb.du(IB)V")
    public static void method3706(int arg0) {
        for (class202 var1 = (class202) field312.method3530(); var1 != null; var1 = (class202) field312.method3531()) {
            if ((long) arg0 == (var1.field3114 >> 48 & 0xFFFFL)) {
                var1.method3647();
            }
        }
    }

    @ObfuscatedName("ax.dz(Lfb;I)I")
    public static int method720(class174 arg0) {
        class202 var1 = (class202) field312.method3538(((long) arg0.field2749 << 32) + (long) arg0.field2750);
        return var1 == null ? arg0.field2821 : var1.field3101;
    }

    @ObfuscatedName("ds.da(Lfb;B)Lfb;")
    public static class174 method2366(class174 arg0) {
        int var1 = method720(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class174.method2976(arg0.field2778);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("w.df(Lfb;I)Z")
    public static boolean method149(class174 arg0) {
        if (field337) {
            if (method720(arg0) != 0) {
                return false;
            }
            if (arg0.field2834 == 0) {
                return false;
            }
        }
        return arg0.field2883;
    }

    @ObfuscatedName("l.dq(Lfb;II)Ljava/lang/String;")
    public static String method112(class174 arg0, int arg1) {
        int var2 = method720(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2849 == null) {
            return null;
        } else if (arg0.field2823 == null || arg0.field2823.length <= arg1 || arg0.field2823[arg1] == null || arg0.field2823[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2823[arg1];
        }
    }

    @ObfuscatedName("ft.dp(Ljava/lang/String;ZS)Ljava/lang/String;")
    public static String method3216(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field549 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field549 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field549 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field549 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field549 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field564 != null) {
            var3 = "/p=" + Statics.field564;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field293 + "/a=" + Statics.field255 + var3 + "/";
    }

    @ObfuscatedName("el.dy(Ljava/lang/String;I)V")
    public static void method2729(String arg0) {
        Statics.field564 = arg0;
        try {
            String var1 = Statics.field285.getParameter(class191.field3062.field3065);
            String var2 = Statics.field285.getParameter(class191.field3050.field3065);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class112.method1776(class116.method1946() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class133.method2701(Statics.field285, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }
}

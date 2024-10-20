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

public final class client extends class145 {

    @ObfuscatedName("client.p")
    public static boolean field278 = true;

    @ObfuscatedName("client.d")
    public static int field552 = 1;

    @ObfuscatedName("client.u")
    public static int field280 = 0;

    @ObfuscatedName("client.b")
    public static int field282 = 0;

    @ObfuscatedName("client.l")
    public static boolean field448 = false;

    @ObfuscatedName("client.t")
    public static boolean field494 = false;

    @ObfuscatedName("client.i")
    public static int field286 = 0;

    @ObfuscatedName("client.z")
    public static int field287 = 0;

    @ObfuscatedName("client.a")
    public static boolean field288 = true;

    @ObfuscatedName("client.w")
    public static class109[] field341 = new class109[4];

    @ObfuscatedName("client.g")
    public static int field336 = 0;

    @ObfuscatedName("client.f")
    public static long field290 = -1L;

    @ObfuscatedName("client.n")
    public static int field291 = -1;

    @ObfuscatedName("client.v")
    public static int field506 = -1;

    @ObfuscatedName("client.ab")
    public static int field490 = -1;

    @ObfuscatedName("client.ad")
    public static boolean field542 = true;

    @ObfuscatedName("client.an")
    public static boolean field283 = false;

    @ObfuscatedName("client.au")
    public static int field296 = 0;

    @ObfuscatedName("client.ap")
    public static int field477 = 0;

    @ObfuscatedName("client.am")
    public static int field298 = 0;

    @ObfuscatedName("client.ae")
    public static int field299 = 0;

    @ObfuscatedName("client.ao")
    public static int field300 = 0;

    @ObfuscatedName("client.as")
    public static int field544 = 0;

    @ObfuscatedName("client.ai")
    public static int field548 = 0;

    @ObfuscatedName("client.ah")
    public static int field303 = 0;

    @ObfuscatedName("client.ax")
    public static int field304 = 0;

    @ObfuscatedName("client.ay")
    public static class21 field305 = class21.field568;

    @ObfuscatedName("client.aj")
    public static class21 field306 = class21.field568;

    @ObfuscatedName("client.aw")
    public static int field307 = 0;

    @ObfuscatedName("client.al")
    public static int field310 = 0;

    @ObfuscatedName("client.ag")
    public static int field401 = 0;

    @ObfuscatedName("client.be")
    public static int field311 = 0;

    @ObfuscatedName("client.bz")
    public static int field312 = 0;

    @ObfuscatedName("client.bb")
    public static int field313 = 0;

    @ObfuscatedName("client.by")
    public static int field314 = 0;

    @ObfuscatedName("client.bc")
    public static int field315 = 0;

    @ObfuscatedName("client.cm")
    public static class35[] field516 = new class35[32768];

    @ObfuscatedName("client.cj")
    public static int field318 = 0;

    @ObfuscatedName("client.ci")
    public static int[] field319 = new int[32768];

    @ObfuscatedName("client.cb")
    public static int field320 = 0;

    @ObfuscatedName("client.co")
    public static int[] field321 = new int[250];

    @ObfuscatedName("client.cg")
    public static class123 field323 = new class123(5000);

    @ObfuscatedName("client.ct")
    public static class123 field547 = new class123(5000);

    @ObfuscatedName("client.ce")
    public static class123 field325 = new class123(15000);

    @ObfuscatedName("client.cr")
    public static int field326 = 0;

    @ObfuscatedName("client.cf")
    public static int field327 = 0;

    @ObfuscatedName("client.cc")
    public static int field511 = 0;

    @ObfuscatedName("client.cp")
    public static int field355 = 0;

    @ObfuscatedName("client.cz")
    public static int field330 = 0;

    @ObfuscatedName("client.cu")
    public static int field331 = 0;

    @ObfuscatedName("client.cl")
    public static int field332 = 0;

    @ObfuscatedName("client.cv")
    public static int field333 = 0;

    @ObfuscatedName("client.ch")
    public static boolean field334 = false;

    @ObfuscatedName("client.dc")
    public static int field474 = 0;

    @ObfuscatedName("client.de")
    public static int field526 = 1;

    @ObfuscatedName("client.dr")
    public static int field562 = 0;

    @ObfuscatedName("client.du")
    public static int field445 = 1;

    @ObfuscatedName("client.dk")
    public static int field339 = 0;

    @ObfuscatedName("client.dj")
    public static boolean field472 = false;

    @ObfuscatedName("client.dy")
    public static int[][][] field279 = new int[4][13][13];

    @ObfuscatedName("client.di")
    public static final int[] field344 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dv")
    public static int field343 = 0;

    @ObfuscatedName("client.da")
    public static int field499 = 2;

    @ObfuscatedName("client.dl")
    public static int field347 = 0;

    @ObfuscatedName("client.dw")
    public static int field348 = 2;

    @ObfuscatedName("client.do")
    public static int field349 = 0;

    @ObfuscatedName("client.ei")
    public static int field550 = 1;

    @ObfuscatedName("client.ez")
    public static int field441 = 0;

    @ObfuscatedName("client.ef")
    public static int field411 = 0;

    @ObfuscatedName("client.eb")
    public static int field353 = 2;

    @ObfuscatedName("client.ev")
    public static int field354 = 0;

    @ObfuscatedName("client.eo")
    public static int field301 = 1;

    @ObfuscatedName("client.ey")
    public static int field356 = 0;

    @ObfuscatedName("client.ec")
    public static int field357 = 0;

    @ObfuscatedName("client.ej")
    public static int field358 = 2301979;

    @ObfuscatedName("client.et")
    public static int field532 = 5063219;

    @ObfuscatedName("client.ex")
    public static int field328 = 3353893;

    @ObfuscatedName("client.en")
    public static int field528 = 7759444;

    @ObfuscatedName("client.ee")
    public static boolean field362 = false;

    @ObfuscatedName("client.fy")
    public static int field363 = 0;

    @ObfuscatedName("client.fh")
    public static int field364 = 128;

    @ObfuscatedName("client.fm")
    public static int field365 = 0;

    @ObfuscatedName("client.ft")
    public static int field366 = 0;

    @ObfuscatedName("client.fe")
    public static int field367 = 0;

    @ObfuscatedName("client.fc")
    public static int field368 = 0;

    @ObfuscatedName("client.fa")
    public static int field393 = 0;

    @ObfuscatedName("client.fg")
    public static int field370 = 50;

    @ObfuscatedName("client.fx")
    public static int field352 = 0;

    @ObfuscatedName("client.fj")
    public static boolean field372 = false;

    @ObfuscatedName("client.fu")
    public static int field373 = 0;

    @ObfuscatedName("client.fk")
    public static int field374 = 0;

    @ObfuscatedName("client.fs")
    public static int field375 = 50;

    @ObfuscatedName("client.fw")
    public static int[] field376 = new int[field375];

    @ObfuscatedName("client.fz")
    public static int[] field377 = new int[field375];

    @ObfuscatedName("client.fo")
    public static int[] field378 = new int[field375];

    @ObfuscatedName("client.fq")
    public static int[] field467 = new int[field375];

    @ObfuscatedName("client.ff")
    public static int[] field380 = new int[field375];

    @ObfuscatedName("client.fb")
    public static int[] field381 = new int[field375];

    @ObfuscatedName("client.gj")
    public static int[] field382 = new int[field375];

    @ObfuscatedName("client.gk")
    public static String[] field385 = new String[field375];

    @ObfuscatedName("client.gw")
    public static int[][] field553 = new int[104][104];

    @ObfuscatedName("client.ga")
    public static int field276 = 0;

    @ObfuscatedName("client.gg")
    public static int field386 = -1;

    @ObfuscatedName("client.gz")
    public static int field387 = -1;

    @ObfuscatedName("client.gl")
    public static int field388 = 0;

    @ObfuscatedName("client.gd")
    public static int field540 = 0;

    @ObfuscatedName("client.gc")
    public static int field390 = 0;

    @ObfuscatedName("client.gu")
    public static int field391 = 0;

    @ObfuscatedName("client.gi")
    public static int field392 = 0;

    @ObfuscatedName("client.gq")
    public static int field407 = 0;

    @ObfuscatedName("client.gx")
    public static int field360 = 0;

    @ObfuscatedName("client.gm")
    public static int field395 = 0;

    @ObfuscatedName("client.gs")
    public static int field396 = 0;

    @ObfuscatedName("client.gn")
    public static int field297 = 0;

    @ObfuscatedName("client.gb")
    public static boolean field398 = false;

    @ObfuscatedName("client.gh")
    public static int field418 = 0;

    @ObfuscatedName("client.ge")
    public static int field359 = 0;

    @ObfuscatedName("client.gf")
    public static class3[] field492 = new class3[2048];

    @ObfuscatedName("client.gt")
    public static int field292 = -1;

    @ObfuscatedName("client.hd")
    public static int field403 = 0;

    @ObfuscatedName("client.hq")
    public static int field404 = 0;

    @ObfuscatedName("client.he")
    public static int[] field405 = new int[1000];

    @ObfuscatedName("client.hy")
    public static final int[] field406 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hc")
    public static String[] field443 = new String[8];

    @ObfuscatedName("client.ht")
    public static boolean[] field295 = new boolean[8];

    @ObfuscatedName("client.hg")
    public static int[] field485 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hk")
    public static int field410 = -1;

    @ObfuscatedName("client.hr")
    public static class200[][][] field346 = new class200[4][104][104];

    @ObfuscatedName("client.hh")
    public static class200 field412 = new class200();

    @ObfuscatedName("client.hx")
    public static class200 field415 = new class200();

    @ObfuscatedName("client.ho")
    public static class200 field414 = new class200();

    @ObfuscatedName("client.hf")
    public static int[] field400 = new int[25];

    @ObfuscatedName("client.hz")
    public static int[] field416 = new int[25];

    @ObfuscatedName("client.hs")
    public static int[] field428 = new int[25];

    @ObfuscatedName("client.hn")
    public static int field546 = 0;

    @ObfuscatedName("client.hm")
    public static boolean field419 = false;

    @ObfuscatedName("client.hu")
    public static int field497 = 0;

    @ObfuscatedName("client.hv")
    public static int[] field421 = new int[500];

    @ObfuscatedName("client.ij")
    public static int[] field422 = new int[500];

    @ObfuscatedName("client.il")
    public static int[] field423 = new int[500];

    @ObfuscatedName("client.ik")
    public static int[] field379 = new int[500];

    @ObfuscatedName("client.ir")
    public static String[] field425 = new String[500];

    @ObfuscatedName("client.io")
    public static String[] field426 = new String[500];

    @ObfuscatedName("client.ib")
    public static int field427 = -1;

    @ObfuscatedName("client.is")
    public static int field444 = -1;

    @ObfuscatedName("client.id")
    public static int field429 = 0;

    @ObfuscatedName("client.im")
    public static int field430 = 50;

    @ObfuscatedName("client.ip")
    public static int field431 = 0;

    @ObfuscatedName("client.it")
    public static String field432 = null;

    @ObfuscatedName("client.ih")
    public static boolean field433 = false;

    @ObfuscatedName("client.ic")
    public static int field308 = -1;

    @ObfuscatedName("client.ie")
    public static int field435 = -1;

    @ObfuscatedName("client.if")
    public static String field436 = null;

    @ObfuscatedName("client.ig")
    public static String field437 = null;

    @ObfuscatedName("client.in")
    public static int field413 = -1;

    @ObfuscatedName("client.iu")
    public static class197 field309 = new class197(8);

    @ObfuscatedName("client.jh")
    public static int field440 = 0;

    @ObfuscatedName("client.jc")
    public static int field350 = 0;

    @ObfuscatedName("client.jw")
    public static class174 field442 = null;

    @ObfuscatedName("client.ji")
    public static int field302 = 0;

    @ObfuscatedName("client.jv")
    public static int field438 = 0;

    @ObfuscatedName("client.jd")
    public static int field518 = 0;

    @ObfuscatedName("client.jz")
    public static int field446 = -1;

    @ObfuscatedName("client.jx")
    public static boolean field503 = false;

    @ObfuscatedName("client.jn")
    public static boolean field536 = false;

    @ObfuscatedName("client.jq")
    public static boolean field449 = false;

    @ObfuscatedName("client.jg")
    public static class174 field450 = null;

    @ObfuscatedName("client.jk")
    public static class174 field451 = null;

    @ObfuscatedName("client.jo")
    public static class174 field289 = null;

    @ObfuscatedName("client.js")
    public static int field453 = 0;

    @ObfuscatedName("client.jt")
    public static int field454 = 0;

    @ObfuscatedName("client.jj")
    public static class174 field455 = null;

    @ObfuscatedName("client.ju")
    public static boolean field456 = false;

    @ObfuscatedName("client.jb")
    public static int field457 = -1;

    @ObfuscatedName("client.jf")
    public static int field458 = -1;

    @ObfuscatedName("client.jp")
    public static boolean field459 = false;

    @ObfuscatedName("client.jy")
    public static int field560 = -1;

    @ObfuscatedName("client.je")
    public static int field461 = -1;

    @ObfuscatedName("client.ja")
    public static boolean field462 = false;

    @ObfuscatedName("client.ka")
    public static int field463 = 1;

    @ObfuscatedName("client.kh")
    public static int[] field464 = new int[32];

    @ObfuscatedName("client.kv")
    public static int field465 = 0;

    @ObfuscatedName("client.kn")
    public static int[] field466 = new int[32];

    @ObfuscatedName("client.kl")
    public static int field447 = 0;

    @ObfuscatedName("client.kw")
    public static int[] field468 = new int[32];

    @ObfuscatedName("client.kd")
    public static int field469 = 0;

    @ObfuscatedName("client.ke")
    public static int field470 = 0;

    @ObfuscatedName("client.ky")
    public static int field471 = 0;

    @ObfuscatedName("client.kq")
    public static int field452 = 0;

    @ObfuscatedName("client.kr")
    public static int field439 = 0;

    @ObfuscatedName("client.kt")
    public static int field564 = 0;

    @ObfuscatedName("client.ks")
    public static int field475 = 0;

    @ObfuscatedName("client.ku")
    public static int field476 = 0;

    @ObfuscatedName("client.kb")
    public static class200 field284 = new class200();

    @ObfuscatedName("client.km")
    public static class200 field329 = new class200();

    @ObfuscatedName("client.kj")
    public static class200 field479 = new class200();

    @ObfuscatedName("client.kf")
    public static class197 field480 = new class197(512);

    @ObfuscatedName("client.ki")
    public static int field481 = 0;

    @ObfuscatedName("client.kg")
    public static int field488 = -2;

    @ObfuscatedName("client.le")
    public static boolean[] field483 = new boolean[100];

    @ObfuscatedName("client.lg")
    public static boolean[] field484 = new boolean[100];

    @ObfuscatedName("client.ld")
    public static boolean[] field369 = new boolean[100];

    @ObfuscatedName("client.lm")
    public static int[] field486 = new int[100];

    @ObfuscatedName("client.lb")
    public static int[] field487 = new int[100];

    @ObfuscatedName("client.ls")
    public static int[] field478 = new int[100];

    @ObfuscatedName("client.ln")
    public static int[] field489 = new int[100];

    @ObfuscatedName("client.la")
    public static int field507 = 0;

    @ObfuscatedName("client.lp")
    public static long field491 = 0L;

    @ObfuscatedName("client.lt")
    public static boolean field337 = true;

    @ObfuscatedName("client.lv")
    public static int field493 = 1;

    @ObfuscatedName("client.lq")
    public static int field342 = 503;

    @ObfuscatedName("client.ll")
    public static int[] field495 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lx")
    public static int field496 = 0;

    @ObfuscatedName("client.lw")
    public static int field293 = 0;

    @ObfuscatedName("client.lz")
    public static String field394 = "";

    @ObfuscatedName("client.lf")
    public static long[] field383 = new long[100];

    @ObfuscatedName("client.ly")
    public static int field531 = 0;

    @ObfuscatedName("client.lh")
    public static int field501 = 0;

    @ObfuscatedName("client.mr")
    public static int[] field502 = new int[128];

    @ObfuscatedName("client.mp")
    public static int[] field409 = new int[128];

    @ObfuscatedName("client.mu")
    public static long field504 = -1L;

    @ObfuscatedName("client.ms")
    public static String field505 = null;

    @ObfuscatedName("client.mv")
    public static String field417 = null;

    @ObfuscatedName("client.mf")
    public static int field508 = -1;

    @ObfuscatedName("client.mj")
    public static int field509 = 0;

    @ObfuscatedName("client.mt")
    public static int[] field510 = new int[1000];

    @ObfuscatedName("client.mq")
    public static int[] field523 = new int[1000];

    @ObfuscatedName("client.md")
    public static class79[] field512 = new class79[1000];

    @ObfuscatedName("client.mb")
    public static int field513 = 0;

    @ObfuscatedName("client.mw")
    public static int field514 = 0;

    @ObfuscatedName("client.mk")
    public static int field294 = 0;

    @ObfuscatedName("client.my")
    public static int field517 = 255;

    @ObfuscatedName("client.mx")
    public static int field371 = -1;

    @ObfuscatedName("client.ml")
    public static boolean field519 = false;

    @ObfuscatedName("client.nf")
    public static int field520 = 127;

    @ObfuscatedName("client.nc")
    public static int field521 = 127;

    @ObfuscatedName("client.nw")
    public static int field522 = 0;

    @ObfuscatedName("client.nt")
    public static int[] field538 = new int[50];

    @ObfuscatedName("client.nd")
    public static int[] field524 = new int[50];

    @ObfuscatedName("client.nk")
    public static int[] field525 = new int[50];

    @ObfuscatedName("client.nx")
    public static int[] field408 = new int[50];

    @ObfuscatedName("client.ni")
    public static class59[] field527 = new class59[50];

    @ObfuscatedName("client.ny")
    public static boolean field559 = false;

    @ObfuscatedName("client.oy")
    public static boolean[] field529 = new boolean[5];

    @ObfuscatedName("client.oh")
    public static int[] field530 = new int[5];

    @ObfuscatedName("client.ob")
    public static int[] field424 = new int[5];

    @ObfuscatedName("client.om")
    public static int[] field338 = new int[5];

    @ObfuscatedName("client.oj")
    public static int[] field533 = new int[5];

    @ObfuscatedName("client.ox")
    public static short field555 = 256;

    @ObfuscatedName("client.oi")
    public static short field535 = 205;

    @ObfuscatedName("client.ok")
    public static short field534 = 256;

    @ObfuscatedName("client.or")
    public static short field537 = 320;

    @ObfuscatedName("client.on")
    public static short field324 = 1;

    @ObfuscatedName("client.of")
    public static short field539 = 32767;

    @ObfuscatedName("client.og")
    public static short field402 = 1;

    @ObfuscatedName("client.ot")
    public static short field541 = 32767;

    @ObfuscatedName("client.ov")
    public static int field399 = 0;

    @ObfuscatedName("client.oz")
    public static int field543 = 0;

    @ObfuscatedName("client.oo")
    public static int field473 = 0;

    @ObfuscatedName("client.oa")
    public static int field384 = 0;

    @ObfuscatedName("client.oe")
    public static int field556 = 0;

    @ObfuscatedName("client.os")
    public static int field500 = 0;

    @ObfuscatedName("client.ol")
    public static int field545 = 0;

    @ObfuscatedName("client.oq")
    public static class18[] field549 = new class18[400];

    @ObfuscatedName("client.ou")
    public static class196 field317 = new class196();

    @ObfuscatedName("client.ow")
    public static int field551 = 0;

    @ObfuscatedName("client.oc")
    public static class8[] field345 = new class8[400];

    @ObfuscatedName("client.pd")
    public static class180 field351 = new class180();

    @ObfuscatedName("client.pu")
    public static int field554 = -1;

    @ObfuscatedName("client.ps")
    public static int field420 = -1;

    @ObfuscatedName("client.pv")
    public static class221[] field389 = new class221[8];

    @ObfuscatedName("client.py")
    public static long field557 = -1L;

    @ObfuscatedName("client.pj")
    public static long field558 = -1L;

    @ObfuscatedName("client.px")
    public static final class11 field434 = new class11();

    @ObfuscatedName("client.pn")
    public static int[] field498 = new int[50];

    @ObfuscatedName("client.pg")
    public static int[] field561 = new int[50];

    @ObfuscatedName("client.x(I)V")
    public final void method239() {
    }

    public final void init() {
        if (!this.method2849()) {
            return;
        }
        class191[] var1 = class191.method2650();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class191 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3078);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3078)) {
                    case 1:
                        class155[] var10 = new class155[] { class155.field2296, class155.field2294, class155.field2295, class155.field2298, class155.field2297, class155.field2300 };
                        Statics.field460 = (class155) class110.method1520(var10, Integer.parseInt(var4));
                        if (Statics.field460 == class155.field2297) {
                            Statics.field25 = class213.field3149;
                        } else {
                            Statics.field25 = class213.field3153;
                        }
                        break;
                    case 2:
                        Statics.field482 = var4;
                        break;
                    case 3:
                        if (var4.equalsIgnoreCase(class2.field20)) {
                            field448 = true;
                        } else {
                            field448 = false;
                        }
                        break;
                    case 4:
                        Statics.field209 = Integer.parseInt(var4);
                    case 5:
                    case 8:
                    case 12:
                    default:
                        break;
                    case 6:
                        Statics.field165 = var4;
                        break;
                    case 7:
                        if (var4.equalsIgnoreCase(class2.field20)) {
                        }
                        break;
                    case 9:
                        field280 = Integer.parseInt(var4);
                        break;
                    case 10:
                        field286 = Integer.parseInt(var4);
                        break;
                    case 11:
                        int var5 = Integer.parseInt(var4);
                        class154[] var6 = class154.method2793();
                        int var7 = 0;
                        class154 var9;
                        while (true) {
                            if (var7 >= var6.length) {
                                var9 = null;
                                break;
                            }
                            class154 var8 = var6[var7];
                            if (var8.field2291 == var5) {
                                var9 = var8;
                                break;
                            }
                            var7++;
                        }
                        Statics.field281 = var9;
                        break;
                    case 13:
                        field282 = Integer.parseInt(var4);
                        break;
                    case 14:
                        field552 = Integer.parseInt(var4);
                        break;
                    case 15:
                        Statics.field208 = Integer.parseInt(var4);
                }
            }
        }
        class87.field1480 = false;
        field494 = false;
        Statics.field2060 = this.getCodeBase().getHost();
        String var11 = Statics.field281.field2286;
        byte var12 = 0;
        try {
            Statics.field1072 = 16;
            Statics.field2246 = var12;
            try {
                Statics.field1806 = System.getProperty("os.name");
            } catch (Exception var58) {
                Statics.field1806 = "Unknown";
            }
            Statics.field2247 = Statics.field1806.toLowerCase();
            try {
                Statics.field259 = System.getProperty("user.home");
                if (Statics.field259 != null) {
                    Statics.field259 = Statics.field259 + "/";
                }
            } catch (Exception var57) {
            }
            try {
                if (Statics.field2247.startsWith("win")) {
                    if (Statics.field259 == null) {
                        Statics.field259 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field259 == null) {
                    Statics.field259 = System.getenv("HOME");
                }
                if (Statics.field259 != null) {
                    Statics.field259 = Statics.field259 + "/";
                }
            } catch (Exception var56) {
            }
            if (Statics.field259 == null) {
                Statics.field259 = "~/";
            }
            Statics.field1393 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field259, "/tmp/", "" };
            Statics.field584 = new String[] { ".jagex_cache_" + Statics.field2246, ".file_store_" + Statics.field2246 };
            int var16 = 0;
            label280: while (var16 < 4) {
                String var17 = var16 == 0 ? "" : "" + var16;
                Statics.field1978 = new File(Statics.field259, "jagex_cl_oldschool_" + var11 + var17 + ".dat");
                String var18 = null;
                String var19 = null;
                boolean var20 = false;
                if (Statics.field1978.exists()) {
                    try {
                        class228 var21 = new class228(Statics.field1978, "rw", 10000L);
                        class120 var22 = new class120((int) var21.method3840());
                        while (var22.field2006 < var22.field2008.length) {
                            int var23 = var21.method3851(var22.field2008, var22.field2006, var22.field2008.length - var22.field2006);
                            if (var23 == -1) {
                                throw new IOException();
                            }
                            var22.field2006 += var23;
                        }
                        var22.field2006 = 0;
                        int var24 = var22.method2338();
                        if (var24 < 1 || var24 > 3) {
                            throw new IOException("" + var24);
                        }
                        int var25 = 0;
                        if (var24 > 1) {
                            var25 = var22.method2338();
                        }
                        if (var24 <= 2) {
                            var18 = var22.method2347();
                            if (var25 == 1) {
                                var19 = var22.method2347();
                            }
                        } else {
                            var18 = var22.method2348();
                            if (var25 == 1) {
                                var19 = var22.method2348();
                            }
                        }
                        var21.method3853();
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
                        if (!Statics.method3115(var28, true)) {
                            var18 = null;
                        }
                    }
                }
                if (var18 == null && var16 == 0) {
                    label256: for (int var29 = 0; var29 < Statics.field584.length; var29++) {
                        for (int var30 = 0; var30 < Statics.field1393.length; var30++) {
                            File var31 = new File(Statics.field1393[var30] + Statics.field584[var29] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var31.exists() && Statics.method3115(new File(var31, "test.dat"), true)) {
                                var18 = var31.toString();
                                var20 = true;
                                break label256;
                            }
                        }
                    }
                }
                if (var18 == null) {
                    var18 = Statics.field259 + File.separatorChar + "jagexcache" + var17 + File.separatorChar + "oldschool" + File.separatorChar + var11 + File.separatorChar;
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
                    class150.method2945(new File(var18), (File) null);
                }
                File var41 = new File(var18);
                Statics.field73 = var41;
                if (!Statics.field73.exists()) {
                    Statics.field73.mkdirs();
                }
                File[] var42 = Statics.field73.listFiles();
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
                    if (!Statics.method3115(var45, false)) {
                        var16++;
                        break;
                    }
                    var44++;
                }
            }
            File var46 = Statics.field73;
            Statics.field2100 = var46;
            if (!Statics.field2100.exists()) {
                throw new RuntimeException("");
            }
            class136.field2102 = true;
            try {
                File var47 = new File(Statics.field259, "random.dat");
                if (var47.exists()) {
                    class150.field2243 = new class229(new class228(var47, "rw", 25L), 24, 0);
                } else {
                    label209: for (int var48 = 0; var48 < Statics.field584.length; var48++) {
                        for (int var49 = 0; var49 < Statics.field1393.length; var49++) {
                            File var50 = new File(Statics.field1393[var49] + Statics.field584[var48] + File.separatorChar + "random.dat");
                            if (var50.exists()) {
                                class150.field2243 = new class229(new class228(var50, "rw", 25L), 24, 0);
                                break label209;
                            }
                        }
                    }
                }
                if (class150.field2243 == null) {
                    RandomAccessFile var51 = new RandomAccessFile(var47, "rw");
                    int var52 = var51.read();
                    var51.seek(0L);
                    var51.write(var52);
                    var51.seek(0L);
                    var51.close();
                    class150.field2243 = new class229(new class228(var47, "rw", 25L), 24, 0);
                }
            } catch (IOException var59) {
            }
            class150.field2244 = new class229(new class228(class136.method682("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class150.field2245 = new class229(new class228(class136.method682("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field571 = new class229[Statics.field1072];
            for (int var54 = 0; var54 < Statics.field1072; var54++) {
                Statics.field571[var54] = new class229(new class228(class136.method682("main_file_cache.idx" + var54), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var62) {
            class149.method1942((String) null, var62);
        }
        Statics.field277 = this;
        this.method2860(765, 503, 114);
    }

    @ObfuscatedName("client.u(I)V")
    public final void method354() {
        Statics.field1224 = field282 == 0 ? 43594 : field552 + 40000;
        Statics.field2923 = field282 == 0 ? 443 : field552 + 50000;
        Statics.field1171 = Statics.field1224;
        Statics.field2926 = class175.field2901;
        Statics.field2674 = class175.field2908;
        Statics.field2934 = class175.field2903;
        Statics.field191 = class175.field2904;
        if (Statics.field2116.toLowerCase().indexOf("microsoft") == -1) {
            class138.field2146[44] = 71;
            class138.field2146[45] = 26;
            class138.field2146[46] = 72;
            class138.field2146[47] = 73;
            class138.field2146[59] = 57;
            class138.field2146[61] = 27;
            class138.field2146[91] = 42;
            class138.field2146[92] = 74;
            class138.field2146[93] = 43;
            class138.field2146[192] = 28;
            class138.field2146[222] = 58;
            class138.field2146[520] = 59;
        } else {
            class138.field2146[186] = 57;
            class138.field2146[187] = 27;
            class138.field2146[188] = 71;
            class138.field2146[189] = 26;
            class138.field2146[190] = 72;
            class138.field2146[191] = 73;
            class138.field2146[192] = 58;
            class138.field2146[219] = 42;
            class138.field2146[220] = 74;
            class138.field2146[221] = 43;
            class138.field2146[222] = 59;
            class138.field2146[223] = 28;
        }
        Canvas var1 = Statics.field2025;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class138.field2120);
        var1.addFocusListener(class138.field2120);
        class141.method1941(Statics.field2025);
        class146 var2;
        try {
            var2 = new class146();
        } catch (Throwable var13) {
            var2 = null;
        }
        Statics.field68 = var2;
        if (Statics.field68 != null) {
            Statics.field68.method2663(Statics.field2025);
        }
        Statics.field710 = new class135(255, class150.field2244, class150.field2245, 500000);
        class228 var4 = null;
        class9 var5 = new class9();
        try {
            var4 = class150.method609("", Statics.field460.field2293, false);
            byte[] var6 = new byte[(int) var4.method3840()];
            int var8;
            for (int var7 = 0; var7 < var6.length; var7 += var8) {
                var8 = var4.method3851(var6, var7, var6.length - var7);
                if (var8 == -1) {
                    throw new IOException();
                }
            }
            var5 = new class9(new class120(var6));
        } catch (Exception var14) {
        }
        try {
            if (var4 != null) {
                var4.method3853();
            }
        } catch (Exception var12) {
        }
        Statics.field1389 = var5;
        Statics.field2020 = this.getToolkit().getSystemClipboard();
        class139.method127(this, Statics.field2048);
        if (field282 != 0) {
            field283 = true;
        }
        method125(Statics.field1389.field145);
    }

    @ObfuscatedName("client.o(B)V")
    public final void method462() {
        field336++;
        this.method246();
        class171.method872();
        class184.method2136();
        method666();
        class138.method2606();
        class141 var1 = class141.field2159;
        synchronized (class141.field2159) {
            class141.field2162 = class141.field2172;
            class141.field2163 = class141.field2169;
            class141.field2164 = class141.field2161;
            class141.field2160 = class141.field2168;
            class141.field2170 = class141.field2166;
            class141.field2171 = class141.field2167;
            class141.field2165 = class141.field2157;
            class141.field2168 = 0;
        }
        if (Statics.field68 != null) {
            int var3 = Statics.field68.method2664();
            field476 = var3;
        }
        if (field287 == 0) {
            method2035();
            class145.method3683();
        } else if (field287 == 5) {
            class32.method1522(this);
            method2035();
            class145.method3683();
        } else if (field287 == 10 || field287 == 11) {
            class32.method1522(this);
        } else if (field287 == 20) {
            class32.method1522(this);
            method2261();
        } else if (field287 == 25) {
            method2762(false);
            field474 = 0;
            boolean var4 = true;
            for (int var5 = 0; var5 < Statics.field567.length; var5++) {
                if (Statics.field2660[var5] != -1 && Statics.field567[var5] == null) {
                    Statics.field567[var5] = Statics.field133.method3014(Statics.field2660[var5], 0);
                    if (Statics.field567[var5] == null) {
                        var4 = false;
                        field474++;
                    }
                }
                if (Statics.field173[var5] != -1 && Statics.field2062[var5] == null) {
                    Statics.field2062[var5] = Statics.field133.method3015(Statics.field173[var5], 0, Statics.field2971[var5]);
                    if (Statics.field2062[var5] == null) {
                        var4 = false;
                        field474++;
                    }
                }
            }
            if (var4) {
                field562 = 0;
                boolean var6 = true;
                for (int var7 = 0; var7 < Statics.field567.length; var7++) {
                    byte[] var8 = Statics.field2062[var7];
                    if (var8 != null) {
                        int var9 = (Statics.field2221[var7] >> 8) * 64 - Statics.field595;
                        int var10 = (Statics.field2221[var7] & 0xFF) * 64 - Statics.field1982;
                        if (field472) {
                            var9 = 10;
                            var10 = 10;
                        }
                        var6 &= class6.method927(var8, var9, var10);
                    }
                }
                if (var6) {
                    if (field339 != 0) {
                        method2919(class158.field2329 + class2.field23 + class2.field33 + 100 + "%" + class2.field22, true);
                    }
                    method666();
                    method3100();
                    method666();
                    Statics.field340.method1770();
                    method666();
                    System.gc();
                    for (int var11 = 0; var11 < 4; var11++) {
                        field341[var11].method2226();
                    }
                    for (int var12 = 0; var12 < 4; var12++) {
                        for (int var13 = 0; var13 < 104; var13++) {
                            for (int var14 = 0; var14 < 104; var14++) {
                                class6.field91[var12][var13][var14] = 0;
                            }
                        }
                    }
                    method666();
                    class6.field82 = 99;
                    Statics.field95 = new byte[4][104][104];
                    Statics.field87 = new byte[4][104][104];
                    Statics.field2913 = new byte[4][104][104];
                    Statics.field1775 = new byte[4][104][104];
                    Statics.field3143 = new int[4][105][105];
                    Statics.field85 = new byte[4][105][105];
                    Statics.field83 = new int[105][105];
                    Statics.field212 = new int[104];
                    Statics.field80 = new int[104];
                    Statics.field3132 = new int[104];
                    Statics.field2078 = new int[104];
                    Statics.field2233 = new int[104];
                    int var15 = Statics.field567.length;
                    for (class24 var16 = (class24) class24.field616.method3553(); var16 != null; var16 = (class24) class24.field616.method3558()) {
                        if (var16.field599 != null) {
                            Statics.field1979.method1097(var16.field599);
                            var16.field599 = null;
                        }
                        if (var16.field611 != null) {
                            Statics.field1979.method1097(var16.field611);
                            var16.field611 = null;
                        }
                    }
                    class24.field616.method3547();
                    method2762(true);
                    if (!field472) {
                        for (int var17 = 0; var17 < var15; var17++) {
                            int var18 = (Statics.field2221[var17] >> 8) * 64 - Statics.field595;
                            int var19 = (Statics.field2221[var17] & 0xFF) * 64 - Statics.field1982;
                            byte[] var20 = Statics.field567[var17];
                            if (var20 != null) {
                                method666();
                                class6.method195(var20, var18, var19, Statics.field1946 * 8 - 48, Statics.field1439 * 8 - 48, field341);
                            }
                        }
                        for (int var21 = 0; var21 < var15; var21++) {
                            int var22 = (Statics.field2221[var21] >> 8) * 64 - Statics.field595;
                            int var23 = (Statics.field2221[var21] & 0xFF) * 64 - Statics.field1982;
                            byte[] var24 = Statics.field567[var21];
                            if (var24 == null && Statics.field1439 < 800) {
                                method666();
                                class6.method2266(var22, var23, 64, 64);
                            }
                        }
                        method2762(true);
                        for (int var25 = 0; var25 < var15; var25++) {
                            byte[] var26 = Statics.field2062[var25];
                            if (var26 != null) {
                                int var27 = (Statics.field2221[var25] >> 8) * 64 - Statics.field595;
                                int var28 = (Statics.field2221[var25] & 0xFF) * 64 - Statics.field1982;
                                method666();
                                class6.method2130(var26, var27, var28, Statics.field340, field341);
                            }
                        }
                    }
                    if (field472) {
                        int var29 = 0;
                        label985: while (true) {
                            if (var29 >= 4) {
                                for (int var47 = 0; var47 < 13; var47++) {
                                    for (int var48 = 0; var48 < 13; var48++) {
                                        int var49 = field279[0][var47][var48];
                                        if (var49 == -1) {
                                            class6.method2266(var47 * 8, var48 * 8, 8, 8);
                                        }
                                    }
                                }
                                method2762(true);
                                int var50 = 0;
                                while (true) {
                                    if (var50 >= 4) {
                                        break label985;
                                    }
                                    method666();
                                    for (int var51 = 0; var51 < 13; var51++) {
                                        for (int var52 = 0; var52 < 13; var52++) {
                                            int var53 = field279[var50][var51][var52];
                                            if (var53 != -1) {
                                                int var54 = var53 >> 24 & 0x3;
                                                int var55 = var53 >> 1 & 0x3;
                                                int var56 = var53 >> 14 & 0x3FF;
                                                int var57 = var53 >> 3 & 0x7FF;
                                                int var58 = (var56 / 8 << 8) + var57 / 8;
                                                for (int var59 = 0; var59 < Statics.field2221.length; var59++) {
                                                    if (Statics.field2221[var59] == var58 && Statics.field2062[var59] != null) {
                                                        class6.method2922(Statics.field2062[var59], var50, var51 * 8, var52 * 8, var54, (var56 & 0x7) * 8, (var57 & 0x7) * 8, var55, Statics.field340, field341);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var50++;
                                }
                            }
                            method666();
                            for (int var30 = 0; var30 < 13; var30++) {
                                for (int var31 = 0; var31 < 13; var31++) {
                                    boolean var32 = false;
                                    int var33 = field279[var29][var30][var31];
                                    if (var33 != -1) {
                                        int var34 = var33 >> 24 & 0x3;
                                        int var35 = var33 >> 1 & 0x3;
                                        int var36 = var33 >> 14 & 0x3FF;
                                        int var37 = var33 >> 3 & 0x7FF;
                                        int var38 = (var36 / 8 << 8) + var37 / 8;
                                        for (int var39 = 0; var39 < Statics.field2221.length; var39++) {
                                            if (Statics.field2221[var39] == var38 && Statics.field567[var39] != null) {
                                                class6.method2234(Statics.field567[var39], var29, var30 * 8, var31 * 8, var34, (var36 & 0x7) * 8, (var37 & 0x7) * 8, var35, field341);
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var32) {
                                        int var40 = var29;
                                        int var41 = var30 * 8;
                                        int var42 = var31 * 8;
                                        for (int var43 = 0; var43 < 8; var43++) {
                                            for (int var44 = 0; var44 < 8; var44++) {
                                                class6.field94[var40][var41 + var43][var42 + var44] = 0;
                                            }
                                        }
                                        if (var41 > 0) {
                                            for (int var45 = 1; var45 < 8; var45++) {
                                                class6.field94[var40][var41][var42 + var45] = class6.field94[var40][var41 - 1][var42 + var45];
                                            }
                                        }
                                        if (var42 > 0) {
                                            for (int var46 = 1; var46 < 8; var46++) {
                                                class6.field94[var40][var41 + var46][var42] = class6.field94[var40][var41 + var46][var42 - 1];
                                            }
                                        }
                                        if (var41 > 0 && class6.field94[var40][var41 - 1][var42] != 0) {
                                            class6.field94[var40][var41][var42] = class6.field94[var40][var41 - 1][var42];
                                        } else if (var42 > 0 && class6.field94[var40][var41][var42 - 1] != 0) {
                                            class6.field94[var40][var41][var42] = class6.field94[var40][var41][var42 - 1];
                                        } else if (var41 > 0 && var42 > 0 && class6.field94[var40][var41 - 1][var42 - 1] != 0) {
                                            class6.field94[var40][var41][var42] = class6.field94[var40][var41 - 1][var42 - 1];
                                        }
                                    }
                                }
                            }
                            var29++;
                        }
                    }
                    method2762(true);
                    method3100();
                    method666();
                    class87 var60 = Statics.field340;
                    class109[] var61 = field341;
                    for (int var62 = 0; var62 < 4; var62++) {
                        for (int var63 = 0; var63 < 104; var63++) {
                            for (int var64 = 0; var64 < 104; var64++) {
                                if ((class6.field91[var62][var63][var64] & 0x1) == 1) {
                                    int var65 = var62;
                                    if ((class6.field91[1][var63][var64] & 0x2) == 2) {
                                        var65 = var62 - 1;
                                    }
                                    if (var65 >= 0) {
                                        var61[var65].method2230(var63, var64);
                                    }
                                }
                            }
                        }
                    }
                    class6.field81 += (int) (Math.random() * 5.0D) - 2;
                    if (class6.field81 < -8) {
                        class6.field81 = -8;
                    }
                    if (class6.field81 > 8) {
                        class6.field81 = 8;
                    }
                    class6.field84 += (int) (Math.random() * 5.0D) - 2;
                    if (class6.field84 < -16) {
                        class6.field84 = -16;
                    }
                    if (class6.field84 > 16) {
                        class6.field84 = 16;
                    }
                    for (int var66 = 0; var66 < 4; var66++) {
                        byte[][] var67 = Statics.field85[var66];
                        int var68 = (int) Math.sqrt(5100.0D);
                        int var69 = var68 * 768 >> 8;
                        for (int var70 = 1; var70 < 103; var70++) {
                            for (int var71 = 1; var71 < 103; var71++) {
                                int var72 = class6.field94[var66][var71 + 1][var70] - class6.field94[var66][var71 - 1][var70];
                                int var73 = class6.field94[var66][var71][var70 + 1] - class6.field94[var66][var71][var70 - 1];
                                int var74 = (int) Math.sqrt((double) (var73 * var73 + var72 * var72 + 65536));
                                int var75 = (var72 << 8) / var74;
                                int var76 = 65536 / var74;
                                int var77 = (var73 << 8) / var74;
                                int var78 = (var77 * -50 + var75 * -50 + var76 * -10) / var69 + 96;
                                int var79 = (var67[var71][var70] >> 1) + (var67[var71][var70 + 1] >> 3) + (var67[var71][var70 - 1] >> 2) + (var67[var71 - 1][var70] >> 2) + (var67[var71 + 1][var70] >> 3);
                                Statics.field83[var71][var70] = var78 - var79;
                            }
                        }
                        for (int var80 = 0; var80 < 104; var80++) {
                            Statics.field212[var80] = 0;
                            Statics.field80[var80] = 0;
                            Statics.field3132[var80] = 0;
                            Statics.field2078[var80] = 0;
                            Statics.field2233[var80] = 0;
                        }
                        for (int var81 = -5; var81 < 109; var81++) {
                            for (int var82 = 0; var82 < 104; var82++) {
                                int var83 = var81 + 5;
                                int var10002;
                                if (var83 >= 0 && var83 < 104) {
                                    int var84 = Statics.field95[var66][var83][var82] & 0xFF;
                                    if (var84 > 0) {
                                        class42 var85 = class42.method112(var84 - 1);
                                        Statics.field212[var82] += var85.field974;
                                        Statics.field80[var82] += var85.field978;
                                        Statics.field3132[var82] += var85.field979;
                                        Statics.field2078[var82] += var85.field980;
                                        var10002 = Statics.field2233[var82]++;
                                    }
                                }
                                int var86 = var81 - 5;
                                if (var86 >= 0 && var86 < 104) {
                                    int var87 = Statics.field95[var66][var86][var82] & 0xFF;
                                    if (var87 > 0) {
                                        class42 var88 = class42.method112(var87 - 1);
                                        Statics.field212[var82] -= var88.field974;
                                        Statics.field80[var82] -= var88.field978;
                                        Statics.field3132[var82] -= var88.field979;
                                        Statics.field2078[var82] -= var88.field980;
                                        var10002 = Statics.field2233[var82]--;
                                    }
                                }
                            }
                            if (var81 >= 1 && var81 < 103) {
                                int var89 = 0;
                                int var90 = 0;
                                int var91 = 0;
                                int var92 = 0;
                                int var93 = 0;
                                for (int var94 = -5; var94 < 109; var94++) {
                                    int var95 = var94 + 5;
                                    if (var95 >= 0 && var95 < 104) {
                                        var89 += Statics.field212[var95];
                                        var90 += Statics.field80[var95];
                                        var91 += Statics.field3132[var95];
                                        var92 += Statics.field2078[var95];
                                        var93 += Statics.field2233[var95];
                                    }
                                    int var96 = var94 - 5;
                                    if (var96 >= 0 && var96 < 104) {
                                        var89 -= Statics.field212[var96];
                                        var90 -= Statics.field80[var96];
                                        var91 -= Statics.field3132[var96];
                                        var92 -= Statics.field2078[var96];
                                        var93 -= Statics.field2233[var96];
                                    }
                                    if (var94 >= 1 && var94 < 103 && (!field494 || (class6.field91[0][var81][var94] & 0x2) != 0 || (class6.field91[var66][var81][var94] & 0x10) == 0)) {
                                        if (var66 < class6.field82) {
                                            class6.field82 = var66;
                                        }
                                        int var97 = Statics.field95[var66][var81][var94] & 0xFF;
                                        int var98 = Statics.field87[var66][var81][var94] & 0xFF;
                                        if (var97 > 0 || var98 > 0) {
                                            int var99 = class6.field94[var66][var81][var94];
                                            int var100 = class6.field94[var66][var81 + 1][var94];
                                            int var101 = class6.field94[var66][var81 + 1][var94 + 1];
                                            int var102 = class6.field94[var66][var81][var94 + 1];
                                            int var103 = Statics.field83[var81][var94];
                                            int var104 = Statics.field83[var81 + 1][var94];
                                            int var105 = Statics.field83[var81 + 1][var94 + 1];
                                            int var106 = Statics.field83[var81][var94 + 1];
                                            int var107 = -1;
                                            int var108 = -1;
                                            if (var97 > 0) {
                                                int var109 = var89 * 256 / var92;
                                                int var110 = var90 / var93;
                                                int var111 = var91 / var93;
                                                var107 = class6.method1019(var109, var110, var111);
                                                int var112 = class6.field81 + var109 & 0xFF;
                                                int var113 = class6.field84 + var111;
                                                if (var113 < 0) {
                                                    var113 = 0;
                                                } else if (var113 > 255) {
                                                    var113 = 255;
                                                }
                                                var108 = class6.method1019(var112, var110, var113);
                                            }
                                            if (var66 > 0) {
                                                boolean var114 = true;
                                                if (var97 == 0 && Statics.field2913[var66][var81][var94] != 0) {
                                                    var114 = false;
                                                }
                                                if (var98 > 0) {
                                                    int var115 = var98 - 1;
                                                    class47 var116 = (class47) class47.field1064.method3484((long) var115);
                                                    class47 var117;
                                                    if (var116 == null) {
                                                        byte[] var118 = Statics.field3130.method3014(4, var115);
                                                        class47 var119 = new class47();
                                                        if (var118 != null) {
                                                            var119.method917(new class120(var118), var115);
                                                        }
                                                        var119.method916();
                                                        class47.field1064.method3486(var119, (long) var115);
                                                        var117 = var119;
                                                    } else {
                                                        var117 = var116;
                                                    }
                                                    if (!var117.field1053) {
                                                        var114 = false;
                                                    }
                                                }
                                                if (var114 && var99 == var100 && var99 == var101 && var99 == var102) {
                                                    Statics.field3143[var66][var81][var94] |= 0x924;
                                                }
                                            }
                                            int var120 = 0;
                                            if (var108 != -1) {
                                                var120 = class92.field1581[class6.method2581(var108, 96)];
                                            }
                                            if (var98 == 0) {
                                                var60.method1916(var66, var81, var94, 0, 0, -1, var99, var100, var101, var102, class6.method2581(var107, var103), class6.method2581(var107, var104), class6.method2581(var107, var105), class6.method2581(var107, var106), 0, 0, 0, 0, var120, 0);
                                            } else {
                                                int var121 = Statics.field2913[var66][var81][var94] + 1;
                                                byte var122 = Statics.field1775[var66][var81][var94];
                                                int var123 = var98 - 1;
                                                class47 var124 = (class47) class47.field1064.method3484((long) var123);
                                                class47 var125;
                                                if (var124 == null) {
                                                    byte[] var126 = Statics.field3130.method3014(4, var123);
                                                    class47 var127 = new class47();
                                                    if (var126 != null) {
                                                        var127.method917(new class120(var126), var123);
                                                    }
                                                    var127.method916();
                                                    class47.field1064.method3486(var127, (long) var123);
                                                    var125 = var127;
                                                } else {
                                                    var125 = var124;
                                                }
                                                int var129 = var125.field1052;
                                                int var130;
                                                int var131;
                                                if (var129 >= 0) {
                                                    var130 = Statics.field1594.method2010(var129);
                                                    var131 = -1;
                                                } else if (var125.field1059 == 16711935) {
                                                    var131 = -2;
                                                    var129 = -1;
                                                    var130 = -2;
                                                } else {
                                                    var131 = class6.method1019(var125.field1055, var125.field1056, var125.field1050);
                                                    int var132 = class6.field81 + var125.field1055 & 0xFF;
                                                    int var133 = class6.field84 + var125.field1050;
                                                    if (var133 < 0) {
                                                        var133 = 0;
                                                    } else if (var133 > 255) {
                                                        var133 = 255;
                                                    }
                                                    var130 = class6.method1019(var132, var125.field1056, var133);
                                                }
                                                int var134 = 0;
                                                if (var130 != -2) {
                                                    var134 = class92.field1581[class6.method13(var130, 96)];
                                                }
                                                if (var125.field1054 != -1) {
                                                    int var135 = class6.field81 + var125.field1062 & 0xFF;
                                                    int var136 = class6.field84 + var125.field1060;
                                                    if (var136 < 0) {
                                                        var136 = 0;
                                                    } else if (var136 > 255) {
                                                        var136 = 255;
                                                    }
                                                    int var137 = class6.method1019(var135, var125.field1057, var136);
                                                    var134 = class92.field1581[class6.method13(var137, 96)];
                                                }
                                                var60.method1916(var66, var81, var94, var121, var122, var129, var99, var100, var101, var102, class6.method2581(var107, var103), class6.method2581(var107, var104), class6.method2581(var107, var105), class6.method2581(var107, var106), class6.method13(var131, var103), class6.method13(var131, var104), class6.method13(var131, var105), class6.method13(var131, var106), var120, var134);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (int var138 = 1; var138 < 103; var138++) {
                            for (int var139 = 1; var139 < 103; var139++) {
                                int var144;
                                if ((class6.field91[var66][var139][var138] & 0x8) != 0) {
                                    var144 = 0;
                                } else if (var66 <= 0 || (class6.field91[1][var139][var138] & 0x2) == 0) {
                                    var144 = var66;
                                } else {
                                    var144 = var66 - 1;
                                }
                                var60.method1774(var66, var139, var138, var144);
                            }
                        }
                        Statics.field95[var66] = (byte[][]) null;
                        Statics.field87[var66] = (byte[][]) null;
                        Statics.field2913[var66] = (byte[][]) null;
                        Statics.field1775[var66] = (byte[][]) null;
                        Statics.field85[var66] = (byte[][]) null;
                    }
                    var60.method1791(-50, -10, -50);
                    for (int var145 = 0; var145 < 104; var145++) {
                        for (int var146 = 0; var146 < 104; var146++) {
                            if ((class6.field91[1][var145][var146] & 0x2) == 2) {
                                var60.method1825(var145, var146);
                            }
                        }
                    }
                    int var147 = 1;
                    int var148 = 2;
                    int var149 = 4;
                    for (int var150 = 0; var150 < 4; var150++) {
                        if (var150 > 0) {
                            var147 <<= 0x3;
                            var148 <<= 0x3;
                            var149 <<= 0x3;
                        }
                        for (int var151 = 0; var151 <= var150; var151++) {
                            for (int var152 = 0; var152 <= 104; var152++) {
                                for (int var153 = 0; var153 <= 104; var153++) {
                                    if ((Statics.field3143[var151][var153][var152] & var147) != 0) {
                                        int var154 = var152;
                                        int var155 = var152;
                                        int var156 = var151;
                                        int var157 = var151;
                                        while (var154 > 0 && (Statics.field3143[var151][var153][var154 - 1] & var147) != 0) {
                                            var154--;
                                        }
                                        while (var155 < 104 && (Statics.field3143[var151][var153][var155 + 1] & var147) != 0) {
                                            var155++;
                                        }
                                        label636: while (var156 > 0) {
                                            for (int var158 = var154; var158 <= var155; var158++) {
                                                if ((Statics.field3143[var156 - 1][var153][var158] & var147) == 0) {
                                                    break label636;
                                                }
                                            }
                                            var156--;
                                        }
                                        label625: while (var157 < var150) {
                                            for (int var159 = var154; var159 <= var155; var159++) {
                                                if ((Statics.field3143[var157 + 1][var153][var159] & var147) == 0) {
                                                    break label625;
                                                }
                                            }
                                            var157++;
                                        }
                                        int var160 = (var157 + 1 - var156) * (var155 - var154 + 1);
                                        if (var160 >= 8) {
                                            short var161 = 240;
                                            int var162 = class6.field94[var157][var153][var154] - var161;
                                            int var163 = class6.field94[var156][var153][var154];
                                            class87.method1773(var150, 1, var153 * 128, var153 * 128, var154 * 128, var155 * 128 + 128, var162, var163);
                                            for (int var164 = var156; var164 <= var157; var164++) {
                                                for (int var165 = var154; var165 <= var155; var165++) {
                                                    Statics.field3143[var164][var153][var165] &= ~var147;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field3143[var151][var153][var152] & var148) != 0) {
                                        int var166 = var153;
                                        int var167 = var153;
                                        int var168 = var151;
                                        int var169 = var151;
                                        while (var166 > 0 && (Statics.field3143[var151][var166 - 1][var152] & var148) != 0) {
                                            var166--;
                                        }
                                        while (var167 < 104 && (Statics.field3143[var151][var167 + 1][var152] & var148) != 0) {
                                            var167++;
                                        }
                                        label689: while (var168 > 0) {
                                            for (int var170 = var166; var170 <= var167; var170++) {
                                                if ((Statics.field3143[var168 - 1][var170][var152] & var148) == 0) {
                                                    break label689;
                                                }
                                            }
                                            var168--;
                                        }
                                        label678: while (var169 < var150) {
                                            for (int var171 = var166; var171 <= var167; var171++) {
                                                if ((Statics.field3143[var169 + 1][var171][var152] & var148) == 0) {
                                                    break label678;
                                                }
                                            }
                                            var169++;
                                        }
                                        int var172 = (var169 + 1 - var168) * (var167 - var166 + 1);
                                        if (var172 >= 8) {
                                            short var173 = 240;
                                            int var174 = class6.field94[var169][var166][var152] - var173;
                                            int var175 = class6.field94[var168][var166][var152];
                                            class87.method1773(var150, 2, var166 * 128, var167 * 128 + 128, var152 * 128, var152 * 128, var174, var175);
                                            for (int var176 = var168; var176 <= var169; var176++) {
                                                for (int var177 = var166; var177 <= var167; var177++) {
                                                    Statics.field3143[var176][var177][var152] &= ~var148;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field3143[var151][var153][var152] & var149) != 0) {
                                        int var178 = var153;
                                        int var179 = var153;
                                        int var180 = var152;
                                        int var181 = var152;
                                        while (var180 > 0 && (Statics.field3143[var151][var153][var180 - 1] & var149) != 0) {
                                            var180--;
                                        }
                                        while (var181 < 104 && (Statics.field3143[var151][var153][var181 + 1] & var149) != 0) {
                                            var181++;
                                        }
                                        label742: while (var178 > 0) {
                                            for (int var182 = var180; var182 <= var181; var182++) {
                                                if ((Statics.field3143[var151][var178 - 1][var182] & var149) == 0) {
                                                    break label742;
                                                }
                                            }
                                            var178--;
                                        }
                                        label731: while (var179 < 104) {
                                            for (int var183 = var180; var183 <= var181; var183++) {
                                                if ((Statics.field3143[var151][var179 + 1][var183] & var149) == 0) {
                                                    break label731;
                                                }
                                            }
                                            var179++;
                                        }
                                        if ((var179 - var178 + 1) * (var181 - var180 + 1) >= 4) {
                                            int var184 = class6.field94[var151][var178][var180];
                                            class87.method1773(var150, 4, var178 * 128, var179 * 128 + 128, var180 * 128, var181 * 128 + 128, var184, var184);
                                            for (int var185 = var178; var185 <= var179; var185++) {
                                                for (int var186 = var180; var186 <= var181; var186++) {
                                                    Statics.field3143[var151][var185][var186] &= ~var149;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    method2762(true);
                    int var187 = class6.field82;
                    if (var187 > Statics.field582) {
                        var187 = Statics.field582;
                    }
                    if (var187 < Statics.field582 - 1) {
                        int var188 = Statics.field582 - 1;
                    }
                    if (field494) {
                        Statics.field340.method1930(class6.field82);
                    } else {
                        Statics.field340.method1930(0);
                    }
                    for (int var189 = 0; var189 < 104; var189++) {
                        for (int var190 = 0; var190 < 104; var190++) {
                            method156(var189, var190);
                        }
                    }
                    method666();
                    for (class17 var191 = (class17) field412.method3553(); var191 != null; var191 = (class17) field412.method3558()) {
                        if (var191.field231 == -1) {
                            var191.field229 = 0;
                            method2907(var191);
                        } else {
                            var191.method3639();
                        }
                    }
                    class41.field928.method3491();
                    if (Statics.field1465 != null) {
                        field323.method2583(203);
                        field323.method2326(1057001181);
                    }
                    if (!field472) {
                        int var192 = (Statics.field1946 - 6) / 8;
                        int var193 = (Statics.field1946 + 6) / 8;
                        int var194 = (Statics.field1439 - 6) / 8;
                        int var195 = (Statics.field1439 + 6) / 8;
                        for (int var196 = var192 - 1; var196 <= var193 + 1; var196++) {
                            for (int var197 = var194 - 1; var197 <= var195 + 1; var197++) {
                                if (var196 < var192 || var196 > var193 || var197 < var194 || var197 > var195) {
                                    Statics.field133.method3012("m" + var196 + "_" + var197);
                                    Statics.field133.method3012("l" + var196 + "_" + var197);
                                }
                            }
                        }
                    }
                    method183(30);
                    method666();
                    Statics.field95 = (byte[][][]) null;
                    Statics.field87 = (byte[][][]) null;
                    Statics.field2913 = (byte[][][]) null;
                    Statics.field1775 = (byte[][][]) null;
                    Statics.field3143 = (int[][][]) null;
                    Statics.field85 = (byte[][][]) null;
                    Statics.field83 = (int[][]) null;
                    Statics.field212 = null;
                    Statics.field80 = null;
                    Statics.field3132 = null;
                    Statics.field2078 = null;
                    Statics.field2233 = null;
                    field323.method2583(43);
                    class145.method3683();
                } else {
                    field339 = 2;
                }
            } else {
                field339 = 1;
            }
        }
        if (field287 == 30) {
            method2893();
        } else if (field287 == 40 || field287 == 45) {
            method2261();
        }
    }

    @ObfuscatedName("client.b(I)V")
    public final void method244() {
        boolean var1 = class184.method552();
        if (var1 && field519 && Statics.field64 != null) {
            Statics.field64.method1140();
        }
        if (field287 == 10 || field287 == 20 || field287 == 30) {
            if (field491 != 0L && class116.method157() > field491) {
                int var2 = field337 ? 2 : 1;
                method125(var2);
            } else if (field2215) {
                class138.method1480(Statics.field2025);
                class141.method2738(Statics.field2025);
                if (Statics.field68 != null) {
                    Statics.field68.method2662(Statics.field2025);
                }
                Statics.field277.method2896();
                Statics.field2025.setBackground(Color.black);
                Canvas var3 = Statics.field2025;
                var3.setFocusTraversalKeysEnabled(false);
                var3.addKeyListener(class138.field2120);
                var3.addFocusListener(class138.field2120);
                class141.method1941(Statics.field2025);
                if (Statics.field68 != null) {
                    Statics.field68.method2663(Statics.field2025);
                }
                if (field413 != -1) {
                    method123(false);
                }
                field2210 = true;
            }
        }
        Dimension var4 = this.method2828();
        if (Statics.field771 != var4.width || Statics.field2080 != var4.height || field2210) {
            method2127();
            field491 = class116.method157() + 500L;
            field2210 = false;
        }
        boolean var5 = false;
        if (field2213) {
            field2213 = false;
            var5 = true;
            for (int var6 = 0; var6 < 100; var6++) {
                field483[var6] = true;
            }
        }
        if (var5) {
            method1();
        }
        if (field287 == 0) {
            class145.method2687(class32.field731, class32.field732, (Color) null, var5);
        } else if (field287 == 5) {
            class32.method2037(Statics.field2666, Statics.field188, Statics.field2946, var5);
        } else if (field287 == 10 || field287 == 11) {
            class32.method2037(Statics.field2666, Statics.field188, Statics.field2946, var5);
        } else if (field287 == 20) {
            class32.method2037(Statics.field2666, Statics.field188, Statics.field2946, var5);
        } else if (field287 == 25) {
            if (field339 == 1) {
                if (field474 > field526) {
                    field526 = field474;
                }
                int var7 = (field526 * 50 - field474 * 50) / field526;
                method2919(class158.field2329 + class2.field23 + class2.field33 + var7 + "%" + class2.field22, false);
            } else if (field339 == 2) {
                if (field562 > field445) {
                    field445 = field562;
                }
                int var8 = (field445 * 50 - field562 * 50) / field445 + 50;
                method2919(class158.field2329 + class2.field23 + class2.field33 + var8 + "%" + class2.field22, false);
            } else {
                method2919(class158.field2329, false);
            }
        } else if (field287 == 30) {
            method3136();
        } else if (field287 == 40) {
            method2919(class158.field2418 + class2.field23 + class158.field2331, false);
        } else if (field287 == 45) {
            method2919(class158.field2338, false);
        }
        if (field287 == 30 && field507 == 0 && !var5) {
            try {
                Graphics var9 = Statics.field2025.getGraphics();
                for (int var10 = 0; var10 < field481; var10++) {
                    if (field484[var10]) {
                        Statics.field2095.method1494(var9, field486[var10], field487[var10], field478[var10], field489[var10]);
                        field484[var10] = false;
                    }
                }
            } catch (Exception var16) {
                Statics.field2025.repaint();
            }
        } else if (field287 > 0) {
            try {
                Graphics var12 = Statics.field2025.getGraphics();
                Statics.field2095.method1493(var12, 0, 0);
                for (int var13 = 0; var13 < field481; var13++) {
                    field484[var13] = false;
                }
            } catch (Exception var15) {
                Statics.field2025.repaint();
            }
        }
    }

    @ObfuscatedName("client.k(B)V")
    public final void method277() {
        if (Statics.field785.method225()) {
            Statics.field785.method222();
        }
        if (Statics.field1037 != null) {
            Statics.field1037.field194 = false;
        }
        Statics.field1037 = null;
        if (Statics.field2698 != null) {
            Statics.field2698.method2796();
            Statics.field2698 = null;
        }
        if (class138.field2120 != null) {
            class138 var1 = class138.field2120;
            synchronized (class138.field2120) {
                class138.field2120 = null;
            }
        }
        if (class141.field2159 != null) {
            class141 var3 = class141.field2159;
            synchronized (class141.field2159) {
                class141.field2159 = null;
            }
        }
        Statics.field68 = null;
        if (Statics.field64 != null) {
            Statics.field64.method1132();
        }
        if (Statics.field2155 != null) {
            Statics.field2155.method1132();
        }
        Statics.method2952();
        class171.method965();
        class150.method1936();
    }

    @ObfuscatedName("e.c(II)V")
    public static void method183(int arg0) {
        if (field287 == arg0) {
            return;
        }
        if (field287 == 0) {
            Statics.field1031 = null;
            Statics.field1696 = null;
            Statics.field2040 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field312 = 0;
            field313 = 0;
            field314 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field563 != null) {
            Statics.field563.method2796();
            Statics.field563 = null;
        }
        if (field287 == 25) {
            field339 = 0;
            field474 = 0;
            field526 = 1;
            field562 = 0;
            field445 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class32.method2622(Statics.field2025, Statics.field2664, Statics.field2059, true, 0);
        } else if (arg0 == 20) {
            class32.method2622(Statics.field2025, Statics.field2664, Statics.field2059, true, field287 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class32.method2622(Statics.field2025, Statics.field2664, Statics.field2059, false, 4);
        } else {
            class32.method168();
        }
        field287 = arg0;
    }

    @ObfuscatedName("client.l(I)V")
    public void method246() {
        if (field287 != 1000) {
            boolean var1 = class172.method2697();
            if (!var1) {
                this.method247();
            }
        }
    }

    @ObfuscatedName("client.t(I)V")
    public void method247() {
        if (class172.field2728 >= 4) {
            this.method2826("js5crc");
            field287 = 1000;
            return;
        }
        if (class172.field2742 >= 4) {
            if (field287 <= 5) {
                this.method2826("js5io");
                field287 = 1000;
                return;
            }
            field401 = 3000;
            class172.field2742 = 3;
        }
        if (--field401 + 1 > 0) {
            return;
        }
        try {
            if (field310 == 0) {
                Statics.field2051 = Statics.field879.method2706(Statics.field2060, Statics.field1171);
                field310++;
            }
            if (field310 == 1) {
                if (Statics.field2051.field2227 == 2) {
                    this.method248(-1);
                    return;
                }
                if (Statics.field2051.field2227 == 1) {
                    field310++;
                }
            }
            if (field310 == 2) {
                Statics.field921 = new class144((Socket) Statics.field2051.field2225, Statics.field879);
                class120 var1 = new class120(5);
                var1.method2323(15);
                var1.method2326(114);
                Statics.field921.method2800(var1.field2008, 0, 5);
                field310++;
                Statics.field2096 = class116.method157();
            }
            if (field310 == 3) {
                if (field287 <= 5 || Statics.field921.method2798() > 0) {
                    int var2 = Statics.field921.method2815();
                    if (var2 != 0) {
                        this.method248(var2);
                        return;
                    }
                    field310++;
                } else if (class116.method157() - Statics.field2096 > 30000L) {
                    this.method248(-2);
                    return;
                }
            }
            if (field310 == 4) {
                class144 var3 = Statics.field921;
                boolean var4 = field287 > 20;
                if (Statics.field2732 != null) {
                    try {
                        Statics.field2732.method2796();
                    } catch (Exception var14) {
                    }
                    Statics.field2732 = null;
                }
                Statics.field2732 = var3;
                class172.method2285(var4);
                class172.field2739.field2006 = 0;
                Statics.field2046 = null;
                Statics.field2736 = null;
                class172.field2734 = 0;
                while (true) {
                    class173 var6 = (class173) class172.field2727.method3521();
                    if (var6 == null) {
                        while (true) {
                            class173 var7 = (class173) class172.field2737.method3521();
                            if (var7 == null) {
                                if (class172.field2745 != 0) {
                                    try {
                                        class120 var8 = new class120(4);
                                        var8.method2323(4);
                                        var8.method2323(class172.field2745);
                                        var8.method2507(0);
                                        Statics.field2732.method2800(var8.field2008, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2732.method2796();
                                        } catch (Exception var12) {
                                        }
                                        class172.field2742++;
                                        Statics.field2732 = null;
                                    }
                                }
                                class172.field2740 = 0;
                                Statics.field2729 = class116.method157();
                                Statics.field2051 = null;
                                Statics.field921 = null;
                                field310 = 0;
                                field311 = 0;
                                return;
                            }
                            class172.field2744.method3602(var7);
                            class172.field2735.method3519(var7, var7.field3126);
                            class172.field2746++;
                            class172.field2738--;
                        }
                    }
                    class172.field2730.method3519(var6, var6.field3126);
                    class172.field2731++;
                    class172.field2733--;
                }
            }
        } catch (IOException var15) {
            this.method248(-3);
        }
    }

    @ObfuscatedName("client.i(II)V")
    public void method248(int arg0) {
        Statics.field2051 = null;
        Statics.field921 = null;
        field310 = 0;
        if (Statics.field1224 == Statics.field1171) {
            Statics.field1171 = Statics.field2923;
        } else {
            Statics.field1171 = Statics.field1224;
        }
        field311++;
        if (field311 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field287 <= 5) {
                this.method2826("js5connect_full");
                field287 = 1000;
            } else {
                field401 = 3000;
            }
        } else if (field311 >= 2 && arg0 == 6) {
            this.method2826("js5connect_outofdate");
            field287 = 1000;
        } else if (field311 >= 4) {
            if (field287 <= 5) {
                this.method2826("js5connect");
                field287 = 1000;
            } else {
                field401 = 3000;
            }
        }
    }

    @ObfuscatedName("ch.r(I)V")
    public static void method2035() {
        if (field307 == 0) {
            Statics.field340 = new class87(4, 104, 104, class6.field94);
            for (int var0 = 0; var0 < 4; var0++) {
                field341[var0] = new class109(104, 104);
            }
            Statics.field1371 = new class79(512, 512);
            class32.field732 = class158.field2332;
            class32.field731 = 5;
            field307 = 20;
        } else if (field307 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class92.field1597[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class87.method1877(var1, 500, 800, 512, 334);
            class32.field732 = class158.field2333;
            class32.field731 = 10;
            field307 = 30;
        } else if (field307 == 30) {
            Statics.field200 = Statics.method3207(0, false, true, true);
            Statics.field1989 = Statics.method3207(1, false, true, true);
            Statics.field3024 = Statics.method3207(2, true, false, true);
            Statics.field2906 = Statics.method3207(3, false, true, true);
            Statics.field683 = Statics.method3207(4, false, true, true);
            Statics.field133 = Statics.method3207(5, true, true, true);
            Statics.field1777 = Statics.method3207(6, true, true, false);
            Statics.field213 = Statics.method3207(7, false, true, true);
            Statics.field2059 = Statics.method3207(8, false, true, true);
            Statics.field1645 = Statics.method3207(9, false, true, true);
            Statics.field2664 = Statics.method3207(10, false, true, true);
            Statics.field66 = Statics.method3207(11, false, true, true);
            Statics.field156 = Statics.method3207(12, false, true, true);
            Statics.field148 = Statics.method3207(13, true, false, true);
            Statics.field335 = Statics.method3207(14, false, true, false);
            Statics.field76 = Statics.method3207(15, false, true, true);
            class32.field732 = class158.field2334;
            class32.field731 = 20;
            field307 = 40;
        } else if (field307 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field200.method3096() * 4 / 100;
            int var8 = var7 + Statics.field1989.method3096() * 4 / 100;
            int var9 = var8 + Statics.field3024.method3096() * 2 / 100;
            int var10 = var9 + Statics.field2906.method3096() * 2 / 100;
            int var11 = var10 + Statics.field683.method3096() * 6 / 100;
            int var12 = var11 + Statics.field133.method3096() * 4 / 100;
            int var13 = var12 + Statics.field1777.method3096() * 2 / 100;
            int var14 = var13 + Statics.field213.method3096() * 60 / 100;
            int var15 = var14 + Statics.field2059.method3096() * 2 / 100;
            int var16 = var15 + Statics.field1645.method3096() * 2 / 100;
            int var17 = var16 + Statics.field2664.method3096() * 2 / 100;
            int var18 = var17 + Statics.field66.method3096() * 2 / 100;
            int var19 = var18 + Statics.field156.method3096() * 2 / 100;
            int var20 = var19 + Statics.field148.method3096() * 2 / 100;
            int var21 = var20 + Statics.field335.method3096() * 2 / 100;
            int var22 = var21 + Statics.field76.method3096() * 2 / 100;
            if (var22 == 100) {
                class32.field732 = class158.field2336;
                class32.field731 = 30;
                field307 = 45;
            } else {
                if (var22 != 0) {
                    class32.field732 = class158.field2565 + var22 + "%";
                }
                class32.field731 = 30;
            }
        } else if (field307 == 45) {
            class57.method2269(22050, !field494, 2);
            class185 var23 = new class185();
            var23.method3356(9, 128);
            Statics.field64 = class57.method1555(Statics.field879, Statics.field2025, 0, 22050);
            Statics.field64.method1137(var23);
            class184.method1542(Statics.field76, Statics.field335, Statics.field683, var23);
            Statics.field2155 = class57.method1555(Statics.field879, Statics.field2025, 1, 2048);
            Statics.field1979 = new class56();
            Statics.field2155.method1137(Statics.field1979);
            Statics.field1961 = new class75(22050, Statics.field1187);
            class32.field732 = class158.field2337;
            class32.field731 = 35;
            field307 = 50;
        } else if (field307 == 50) {
            int var24 = 0;
            if (Statics.field188 == null) {
                Statics.field188 = class77.method2924(Statics.field2059, Statics.field148, "p11_full", "");
            } else {
                var24++;
            }
            if (Statics.field2946 == null) {
                Statics.field2946 = class77.method2924(Statics.field2059, Statics.field148, "p12_full", "");
            } else {
                var24++;
            }
            if (Statics.field2666 == null) {
                Statics.field2666 = class77.method2924(Statics.field2059, Statics.field148, "b12_full", "");
            } else {
                var24++;
            }
            if (var24 < 3) {
                class32.field732 = class158.field2587 + var24 * 100 / 3 + "%";
                class32.field731 = 40;
            } else {
                Statics.field2943 = new class161(true);
                class32.field732 = class158.field2339;
                class32.field731 = 40;
                field307 = 60;
            }
        } else if (field307 == 60) {
            class169 var25 = Statics.field2664;
            class169 var26 = Statics.field2059;
            int var27 = 0;
            if (var25.method3068("title.jpg", "")) {
                var27++;
            }
            if (var26.method3068("logo", "")) {
                var27++;
            }
            if (var26.method3068("logo_deadman_mode", "")) {
                var27++;
            }
            if (var26.method3068("titlebox", "")) {
                var27++;
            }
            if (var26.method3068("titlebutton", "")) {
                var27++;
            }
            if (var26.method3068("runes", "")) {
                var27++;
            }
            if (var26.method3068("title_mute", "")) {
                var27++;
            }
            if (var26.method3032("options_radio_buttons,0")) {
                var27++;
            }
            if (var26.method3032("options_radio_buttons,2")) {
                var27++;
            }
            var26.method3068("sl_back", "");
            var26.method3068("sl_flags", "");
            var26.method3068("sl_arrows", "");
            var26.method3068("sl_stars", "");
            var26.method3068("sl_button", "");
            int var30 = class32.method36();
            if (var27 < var30) {
                class32.field732 = class158.field2340 + var27 * 100 / var30 + "%";
                class32.field731 = 50;
            } else {
                class32.field732 = class158.field2341;
                class32.field731 = 50;
                method183(5);
                field307 = 70;
            }
        } else if (field307 == 70) {
            if (Statics.field3024.method3013()) {
                class47.method100(Statics.field3024);
                class169 var31 = Statics.field3024;
                Statics.field982 = var31;
                class45.method2765(Statics.field3024, Statics.field213);
                class169 var32 = Statics.field3024;
                class169 var33 = Statics.field213;
                boolean var34 = field494;
                Statics.field1783 = var32;
                Statics.field575 = var33;
                class41.field952 = var34;
                class169 var35 = Statics.field3024;
                class169 var36 = Statics.field213;
                Statics.field885 = var35;
                Statics.field913 = var36;
                class169 var37 = Statics.field3024;
                class169 var38 = Statics.field213;
                boolean var39 = field448;
                class225 var40 = Statics.field188;
                Statics.field2925 = var37;
                Statics.field1135 = var38;
                Statics.field1092 = var39;
                Statics.field1111 = Statics.field2925.method3024(10);
                Statics.field1568 = var40;
                class43.method544(Statics.field3024, Statics.field200, Statics.field1989);
                class169 var41 = Statics.field3024;
                class169 var42 = Statics.field213;
                Statics.field1003 = var41;
                Statics.field1004 = var42;
                class169 var43 = Statics.field3024;
                Statics.field1071 = var43;
                class169 var44 = Statics.field3024;
                Statics.field1168 = var44;
                Statics.field2054 = Statics.field1168.method3024(16);
                class169 var45 = Statics.field2906;
                class169 var46 = Statics.field213;
                class169 var47 = Statics.field2059;
                class169 var48 = Statics.field148;
                Statics.field2756 = var45;
                Statics.field2757 = var46;
                Statics.field2758 = var47;
                Statics.field2865 = var48;
                Statics.field3172 = new class174[Statics.field2756.method3025()][];
                Statics.field2839 = new boolean[Statics.field2756.method3025()];
                class51.method154(Statics.field3024);
                class169 var49 = Statics.field3024;
                Statics.field1085 = var49;
                class46.method2925(Statics.field3024);
                class169 var50 = Statics.field3024;
                Statics.field1091 = var50;
                Statics.field785 = new class20();
                class32.field732 = class158.field2343;
                class32.field731 = 60;
                field307 = 80;
            } else {
                class32.field732 = class158.field2342 + Statics.field3024.method3106() + "%";
                class32.field731 = 60;
            }
        } else if (field307 == 80) {
            int var51 = 0;
            if (Statics.field1692 == null) {
                class169 var52 = Statics.field2059;
                int var53 = var52.method3028("compass");
                int var54 = var52.method3029(var53, "");
                class79 var55;
                if (class77.method697(var52, var53, var54)) {
                    class79 var56 = new class79();
                    var56.field1417 = Statics.field3215;
                    var56.field1413 = Statics.field1387;
                    var56.field1411 = Statics.field1388[0];
                    var56.field1407 = Statics.field1391[0];
                    var56.field1408 = Statics.field1390[0];
                    var56.field1409 = Statics.field160[0];
                    int var57 = var56.field1409 * var56.field1408;
                    byte[] var58 = Statics.field576[0];
                    var56.field1415 = new int[var57];
                    for (int var59 = 0; var59 < var57; var59++) {
                        var56.field1415[var59] = Statics.field1397[var58[var59] & 0xFF];
                    }
                    class77.method628();
                    var55 = var56;
                } else {
                    var55 = null;
                }
                Statics.field1692 = var55;
            } else {
                var51++;
            }
            if (Statics.field621 == null) {
                class169 var62 = Statics.field2059;
                int var63 = var62.method3028("mapedge");
                int var64 = var62.method3029(var63, "");
                class79 var65;
                if (class77.method697(var62, var63, var64)) {
                    class79 var66 = new class79();
                    var66.field1417 = Statics.field3215;
                    var66.field1413 = Statics.field1387;
                    var66.field1411 = Statics.field1388[0];
                    var66.field1407 = Statics.field1391[0];
                    var66.field1408 = Statics.field1390[0];
                    var66.field1409 = Statics.field160[0];
                    int var67 = var66.field1409 * var66.field1408;
                    byte[] var68 = Statics.field576[0];
                    var66.field1415 = new int[var67];
                    for (int var69 = 0; var69 < var67; var69++) {
                        var66.field1415[var69] = Statics.field1397[var68[var69] & 0xFF];
                    }
                    class77.method628();
                    var65 = var66;
                } else {
                    var65 = null;
                }
                Statics.field621 = var65;
            } else {
                var51++;
            }
            if (Statics.field61 == null) {
                Statics.field61 = class77.method165(Statics.field2059, "mapscene", "");
            } else {
                var51++;
            }
            if (Statics.field2922 == null) {
                Statics.field2922 = class77.method150(Statics.field2059, "mapfunction", "");
            } else {
                var51++;
            }
            if (Statics.field1406 == null) {
                Statics.field1406 = class77.method150(Statics.field2059, "hitmarks", "");
            } else {
                var51++;
            }
            if (Statics.field3142 == null) {
                Statics.field3142 = class77.method150(Statics.field2059, "headicons_pk", "");
            } else {
                var51++;
            }
            if (Statics.field2669 == null) {
                Statics.field2669 = class77.method150(Statics.field2059, "headicons_prayer", "");
            } else {
                var51++;
            }
            if (Statics.field920 == null) {
                Statics.field920 = class77.method150(Statics.field2059, "headicons_hint", "");
            } else {
                var51++;
            }
            if (Statics.field1571 == null) {
                Statics.field1571 = class77.method150(Statics.field2059, "mapmarker", "");
            } else {
                var51++;
            }
            if (Statics.field2106 == null) {
                Statics.field2106 = class77.method150(Statics.field2059, "cross", "");
            } else {
                var51++;
            }
            if (Statics.field2147 == null) {
                Statics.field2147 = class77.method150(Statics.field2059, "mapdots", "");
            } else {
                var51++;
            }
            if (Statics.field2271 == null) {
                Statics.field2271 = class77.method165(Statics.field2059, "scrollbar", "");
            } else {
                var51++;
            }
            if (Statics.field1365 == null) {
                Statics.field1365 = class77.method165(Statics.field2059, "mod_icons", "");
            } else {
                var51++;
            }
            if (var51 < 13) {
                class32.field732 = class158.field2434 + var51 * 100 / 13 + "%";
                class32.field731 = 70;
            } else {
                Statics.field3193 = Statics.field1365;
                Statics.field621.method1562();
                int var72 = (int) (Math.random() * 21.0D) - 10;
                int var73 = (int) (Math.random() * 21.0D) - 10;
                int var74 = (int) (Math.random() * 21.0D) - 10;
                int var75 = (int) (Math.random() * 41.0D) - 20;
                for (int var76 = 0; var76 < Statics.field2922.length; var76++) {
                    Statics.field2922[var76].method1561(var72 + var75, var73 + var75, var74 + var75);
                }
                Statics.field61[0].method1734(var72 + var75, var73 + var75, var74 + var75);
                class32.field732 = class158.field2345;
                class32.field731 = 70;
                field307 = 90;
            }
        } else if (field307 == 90) {
            if (Statics.field1645.method3013()) {
                class96 var77 = new class96(Statics.field1645, Statics.field2059, 20, 0.8D, field494 ? 64 : 128);
                class92.method1949(var77);
                class92.method1969(0.8D);
                class32.field732 = class158.field2497;
                class32.field731 = 90;
                field307 = 110;
            } else {
                class32.field732 = class158.field2552 + Statics.field1645.method3106() + "%";
                class32.field731 = 90;
            }
        } else if (field307 == 110) {
            Statics.field1037 = new class14();
            Statics.field879.method2704(Statics.field1037, 10);
            class32.field732 = class158.field2348;
            class32.field731 = 94;
            field307 = 120;
        } else if (field307 == 120) {
            if (Statics.field2664.method3068("huffman", "")) {
                class114 var78 = new class114(Statics.field2664.method3030("huffman", ""));
                class223.method1489(var78);
                class32.field732 = class158.field2350;
                class32.field731 = 96;
                field307 = 130;
            } else {
                class32.field732 = class158.field2447 + "%";
                class32.field731 = 96;
            }
        } else if (field307 == 130) {
            if (!Statics.field2906.method3013()) {
                class32.field732 = class158.field2351 + Statics.field2906.method3106() * 4 / 5 + "%";
                class32.field731 = 100;
            } else if (!Statics.field156.method3013()) {
                class32.field732 = class158.field2351 + (80 + Statics.field156.method3106() / 6) + "%";
                class32.field731 = 100;
            } else if (Statics.field148.method3013()) {
                class32.field732 = class158.field2352;
                class32.field731 = 100;
                field307 = 140;
            } else {
                class32.field732 = class158.field2351 + (96 + Statics.field148.method3106() / 20) + "%";
                class32.field731 = 100;
            }
        } else if (field307 == 140) {
            method183(10);
        }
    }

    @ObfuscatedName("dc.e(S)V")
    public static final void method2261() {
        try {
            if (field312 == 0) {
                if (Statics.field2698 != null) {
                    Statics.field2698.method2796();
                    Statics.field2698 = null;
                }
                Statics.field322 = null;
                field334 = false;
                field313 = 0;
                field312 = 1;
            }
            if (field312 == 1) {
                if (Statics.field322 == null) {
                    Statics.field322 = Statics.field879.method2706(Statics.field2060, Statics.field1171);
                }
                if (Statics.field322.field2227 == 2) {
                    throw new IOException();
                }
                if (Statics.field322.field2227 == 1) {
                    Statics.field2698 = new class144((Socket) Statics.field322.field2225, Statics.field879);
                    Statics.field322 = null;
                    field312 = 2;
                }
            }
            if (field312 == 2) {
                field323.field2006 = 0;
                field323.method2323(14);
                Statics.field2698.method2800(field323.field2008, 0, 1);
                field325.field2006 = 0;
                field312 = 3;
            }
            if (field312 == 3) {
                if (Statics.field64 != null) {
                    Statics.field64.method1130();
                }
                if (Statics.field2155 != null) {
                    Statics.field2155.method1130();
                }
                int var0 = Statics.field2698.method2815();
                if (Statics.field64 != null) {
                    Statics.field64.method1130();
                }
                if (Statics.field2155 != null) {
                    Statics.field2155.method1130();
                }
                if (var0 != 0) {
                    method2688(var0);
                    return;
                }
                field325.field2006 = 0;
                field312 = 5;
            }
            if (field312 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field323.field2006 = 0;
                field323.method2323(1);
                field323.method2323(class32.field720.method541());
                field323.method2326(var1[0]);
                field323.method2326(var1[1]);
                field323.method2326(var1[2]);
                field323.method2326(var1[3]);
                switch(class32.field720.field2610) {
                    case 0:
                        field323.method2326((Integer) Statics.field1389.field147.get(class164.method698(class32.field738)));
                        field323.field2006 += 4;
                        break;
                    case 1:
                        field323.field2006 += 8;
                        break;
                    case 2:
                    case 3:
                        field323.method2452(Statics.field1541);
                        field323.field2006 += 5;
                }
                field323.method2329(class32.field741);
                field323.method2358(class5.field75, class5.field72);
                field547.field2006 = 0;
                if (field287 == 40) {
                    field547.method2323(18);
                } else {
                    field547.method2323(16);
                }
                field547.method2507(0);
                int var2 = field547.field2006;
                field547.method2326(114);
                field547.method2332(field323.field2008, 0, field323.field2006);
                int var3 = field547.field2006;
                field547.method2329(class32.field738);
                field547.method2323((field337 ? 1 : 0) << 1 | (field494 ? 1 : 0));
                field547.method2507(Statics.field215);
                field547.method2507(Statics.field216);
                class150.method2126(field547);
                field547.method2329(Statics.field165);
                field547.method2326(Statics.field208);
                class120 var4 = new class120(Statics.field2943.method2931());
                Statics.field2943.method2933(var4);
                field547.method2332(var4.field2008, 0, var4.field2008.length);
                field547.method2323(Statics.field209);
                field547.method2326(Statics.field200.field2691);
                field547.method2326(Statics.field1989.field2691);
                field547.method2326(Statics.field3024.field2691);
                field547.method2326(Statics.field2906.field2691);
                field547.method2326(Statics.field683.field2691);
                field547.method2326(Statics.field133.field2691);
                field547.method2326(Statics.field1777.field2691);
                field547.method2326(Statics.field213.field2691);
                field547.method2326(Statics.field2059.field2691);
                field547.method2326(Statics.field1645.field2691);
                field547.method2326(Statics.field2664.field2691);
                field547.method2326(Statics.field66.field2691);
                field547.method2326(Statics.field156.field2691);
                field547.method2326(Statics.field148.field2691);
                field547.method2326(Statics.field335.field2691);
                field547.method2326(Statics.field76.field2691);
                field547.method2499(var1, var3, field547.field2006);
                field547.method2370(field547.field2006 - var2);
                Statics.field2698.method2800(field547.field2008, 0, field547.field2006);
                field323.method2582(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field325.method2582(var1);
                field312 = 6;
            }
            if (field312 == 6 && Statics.field2698.method2798() > 0) {
                int var6 = Statics.field2698.method2815();
                if (var6 == 21 && field287 == 20) {
                    field312 = 7;
                } else if (var6 == 2) {
                    field312 = 9;
                } else if (var6 == 15 && field287 == 40) {
                    field326 = -1;
                    field312 = 13;
                } else if (var6 == 23 && field314 < 1) {
                    field314++;
                    field312 = 0;
                } else if (var6 == 29) {
                    field312 = 11;
                } else {
                    method2688(var6);
                    return;
                }
            }
            if (field312 == 7 && Statics.field2698.method2798() > 0) {
                field315 = (Statics.field2698.method2815() + 3) * 60;
                field312 = 8;
            }
            if (field312 == 8) {
                field313 = 0;
                class32.method105(class158.field2506, class158.field2357, field315 / 60 + class158.field2543);
                if (--field315 <= 0) {
                    field312 = 0;
                }
            } else {
                if (field312 == 9 && Statics.field2698.method2798() >= 13) {
                    boolean var7 = Statics.field2698.method2815() == 1;
                    Statics.field2698.method2797(field325.field2008, 0, 4);
                    field325.field2006 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field325.method2584() << 24;
                        int var10 = var9 | field325.method2584() << 16;
                        int var11 = var10 | field325.method2584() << 8;
                        int var12 = var11 | field325.method2584();
                        int var13 = class164.method698(class32.field738);
                        if (Statics.field1389.field147.size() >= 10 && !Statics.field1389.field147.containsKey(var13)) {
                            Iterator var14 = Statics.field1389.field147.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field1389.field147.put(var13, var12);
                        class9.method99();
                    }
                    field518 = Statics.field2698.method2815();
                    field503 = Statics.field2698.method2815() == 1;
                    field292 = Statics.field2698.method2815();
                    field292 <<= 0x8;
                    field292 += Statics.field2698.method2815();
                    field403 = Statics.field2698.method2815();
                    Statics.field2698.method2797(field325.field2008, 0, 1);
                    field325.field2006 = 0;
                    field327 = field325.method2584();
                    Statics.field2698.method2797(field325.field2008, 0, 2);
                    field325.field2006 = 0;
                    field326 = field325.method2430();
                    if (field403 == 1) {
                        try {
                            class133.method2677(Statics.field277, "zap");
                        } catch (Throwable var27) {
                        }
                    } else {
                        try {
                            class133.method2677(Statics.field277, "unzap");
                        } catch (Throwable var26) {
                        }
                    }
                    field312 = 10;
                }
                if (field312 != 10) {
                    if (field312 == 11 && Statics.field2698.method2798() >= 2) {
                        field325.field2006 = 0;
                        Statics.field2698.method2797(field325.field2008, 0, 2);
                        field325.field2006 = 0;
                        Statics.field3159 = field325.method2430();
                        field312 = 12;
                    }
                    if (field312 == 12 && Statics.field2698.method2798() >= Statics.field3159) {
                        field325.field2006 = 0;
                        Statics.field2698.method2797(field325.field2008, 0, Statics.field3159);
                        field325.field2006 = 0;
                        String var17 = field325.method2346();
                        String var18 = field325.method2346();
                        String var19 = field325.method2346();
                        class32.method105(var17, var18, var19);
                        method183(10);
                    }
                    if (field312 == 13) {
                        if (field326 == -1) {
                            if (Statics.field2698.method2798() < 2) {
                                return;
                            }
                            Statics.field2698.method2797(field325.field2008, 0, 2);
                            field325.field2006 = 0;
                            field326 = field325.method2430();
                        }
                        if (Statics.field2698.method2798() >= field326) {
                            Statics.field2698.method2797(field325.field2008, 0, field326);
                            field325.field2006 = 0;
                            int var20 = field326;
                            field323.field2006 = 0;
                            field325.field2006 = 0;
                            field327 = -1;
                            field330 = -1;
                            field331 = -1;
                            field332 = -1;
                            field326 = 0;
                            field511 = 0;
                            field296 = 0;
                            field497 = 0;
                            field419 = false;
                            field294 = 0;
                            field513 = 0;
                            for (int var21 = 0; var21 < 2048; var21++) {
                                field492[var21] = null;
                            }
                            Statics.field1882 = null;
                            for (int var22 = 0; var22 < field516.length; var22++) {
                                class35 var23 = field516[var22];
                                if (var23 != null) {
                                    var23.field838 = -1;
                                    var23.field839 = false;
                                }
                            }
                            class16.method133();
                            method183(30);
                            for (int var24 = 0; var24 < 100; var24++) {
                                field483[var24] = true;
                            }
                            method190();
                            class33.method887(field325);
                            if (field325.field2006 != var20) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field313++;
                        if (field313 > 2000) {
                            if (field314 < 1) {
                                if (Statics.field1224 == Statics.field1171) {
                                    Statics.field1171 = Statics.field2923;
                                } else {
                                    Statics.field1171 = Statics.field1224;
                                }
                                field314++;
                                field312 = 0;
                            } else {
                                method2688(-3);
                            }
                        }
                    }
                } else if (Statics.field2698.method2798() >= field326) {
                    field325.field2006 = 0;
                    Statics.field2698.method2797(field325.field2008, 0, field326);
                    method974();
                    class33.method887(field325);
                    Statics.field1946 = -1;
                    method3202(false);
                    field327 = -1;
                }
            }
        } catch (IOException var28) {
            if (field314 < 1) {
                if (Statics.field1224 == Statics.field1171) {
                    Statics.field1171 = Statics.field2923;
                } else {
                    Statics.field1171 = Statics.field1224;
                }
                field314++;
                field312 = 0;
            } else {
                method2688(-2);
            }
        }
    }

    @ObfuscatedName("az.h(I)V")
    public static void method974() {
        field290 = -1L;
        field490 = -1;
        Statics.field1037.field196 = 0;
        Statics.field2079 = true;
        field542 = true;
        field504 = -1L;
        class212.field3144 = new class203();
        field323.field2006 = 0;
        field325.field2006 = 0;
        field327 = -1;
        field330 = -1;
        field331 = -1;
        field332 = -1;
        field511 = 0;
        field296 = 0;
        field333 = 0;
        field477 = 0;
        field497 = 0;
        field419 = false;
        class141.method1033(0);
        class12.field169.clear();
        class12.field168.method3537();
        class12.field172.method3587();
        class12.field171 = 0;
        field431 = 0;
        field433 = false;
        field522 = 0;
        field343 = (int) (Math.random() * 100.0D) - 50;
        field347 = (int) (Math.random() * 110.0D) - 55;
        field349 = (int) (Math.random() * 80.0D) - 40;
        field411 = (int) (Math.random() * 120.0D) - 60;
        field354 = (int) (Math.random() * 30.0D) - 20;
        field365 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field294 = 0;
        field508 = -1;
        field513 = 0;
        field514 = 0;
        field305 = class21.field568;
        field306 = class21.field568;
        field318 = 0;
        class33.field756 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class33.field769[var0] = null;
            class33.field754[var0] = 1;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field492[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field516[var2] = null;
        }
        field410 = -1;
        field415.method3547();
        field414.method3547();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field346[var3][var4][var5] = null;
                }
            }
        }
        field412 = new class200();
        field545 = 0;
        field500 = 0;
        field551 = 0;
        for (int var6 = 0; var6 < Statics.field2054; var6++) {
            class53 var7 = class53.method39(var6);
            if (var7 != null) {
                class177.field2919[var6] = 0;
                class177.field2921[var6] = 0;
            }
        }
        Statics.field785.method211();
        field446 = -1;
        if (field413 != -1) {
            class174.method9(field413);
        }
        for (class4 var8 = (class4) field309.method3521(); var8 != null; var8 = (class4) field309.method3522()) {
            method717(var8, true);
        }
        field413 = -1;
        field309 = new class197(8);
        field442 = null;
        field419 = false;
        field497 = 0;
        field351.method3228((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var9 = 0; var9 < 8; var9++) {
            field443[var9] = null;
            field295[var9] = false;
        }
        class16.method133();
        field288 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            field483[var10] = true;
        }
        method190();
        field505 = null;
        Statics.field1960 = 0;
        Statics.field2613 = null;
        for (int var11 = 0; var11 < 8; var11++) {
            field389[var11] = new class221();
        }
        Statics.field872 = null;
    }

    @ObfuscatedName("eb.z(II)V")
    public static void method2688(int arg0) {
        if (arg0 == -3) {
            class32.method105(class158.field2359, class158.field2360, class158.field2361);
        } else if (arg0 == -2) {
            class32.method105(class158.field2362, class158.field2363, class158.field2364);
        } else if (arg0 == -1) {
            class32.method105(class158.field2365, class158.field2490, class158.field2367);
        } else if (arg0 == 3) {
            class32.field733 = 3;
        } else if (arg0 == 4) {
            class32.method105(class158.field2368, class158.field2413, class158.field2370);
        } else if (arg0 == 5) {
            class32.method105(class158.field2371, class158.field2452, class158.field2584);
        } else if (arg0 == 6) {
            class32.method105(class158.field2344, class158.field2375, class158.field2376);
        } else if (arg0 == 7) {
            class32.method105(class158.field2377, class158.field2378, class158.field2379);
        } else if (arg0 == 8) {
            class32.method105(class158.field2380, class158.field2381, class158.field2382);
        } else if (arg0 == 9) {
            class32.method105(class158.field2484, class158.field2384, class158.field2598);
        } else if (arg0 == 10) {
            class32.method105(class158.field2386, class158.field2387, class158.field2388);
        } else if (arg0 == 11) {
            class32.method105(class158.field2356, class158.field2505, class158.field2596);
        } else if (arg0 == 12) {
            class32.method105(class158.field2445, class158.field2393, class158.field2394);
        } else if (arg0 == 13) {
            class32.method105(class158.field2322, class158.field2396, class158.field2483);
        } else if (arg0 == 14) {
            class32.method105(class158.field2398, class158.field2399, class158.field2454);
        } else if (arg0 == 16) {
            class32.method105(class158.field2401, class158.field2402, class158.field2373);
        } else if (arg0 == 17) {
            class32.method105(class158.field2535, class158.field2405, class158.field2496);
        } else if (arg0 == 18) {
            class32.method105(class158.field2407, class158.field2408, class158.field2409);
        } else if (arg0 == 19) {
            class32.method105(class158.field2410, class158.field2511, class158.field2538);
        } else if (arg0 == 20) {
            class32.method105(class158.field2431, class158.field2414, class158.field2415);
        } else if (arg0 == 22) {
            class32.method105(class158.field2436, class158.field2592, class158.field2320);
        } else if (arg0 == 23) {
            class32.method105(class158.field2466, class158.field2420, class158.field2421);
        } else if (arg0 == 24) {
            class32.method105(class158.field2422, class158.field2423, class158.field2424);
        } else if (arg0 == 25) {
            class32.method105(class158.field2425, class158.field2426, class158.field2482);
        } else if (arg0 == 26) {
            class32.method105(class158.field2428, class158.field2429, class158.field2430);
        } else if (arg0 == 27) {
            class32.method105(class158.field2541, class158.field2524, class158.field2433);
        } else if (arg0 == 31) {
            class32.method105(class158.field2440, class158.field2441, class158.field2442);
        } else if (arg0 == 32) {
            class32.method105(class158.field2570, class158.field2444, class158.field2527);
        } else if (arg0 == 37) {
            class32.method105(class158.field2559, class158.field2353, class158.field2448);
        } else if (arg0 == 38) {
            class32.method105(class158.field2449, class158.field2450, class158.field2451);
        } else if (arg0 == 55) {
            class32.method105(class158.field2488, class158.field2515, class158.field2516);
        } else if (arg0 == 56) {
            class32.method105(class158.field2455, class158.field2456, class158.field2457);
            method183(11);
            return;
        } else if (arg0 == 57) {
            class32.method105(class158.field2458, class158.field2383, class158.field2319);
            method183(11);
            return;
        } else {
            class32.method105(class158.field2461, class158.field2462, class158.field2366);
        }
        method183(10);
    }

    @ObfuscatedName("m.a(I)V")
    public static final void method167() {
        if (Statics.field2698 != null) {
            Statics.field2698.method2796();
            Statics.field2698 = null;
        }
        method3100();
        Statics.field340.method1770();
        for (int var0 = 0; var0 < 4; var0++) {
            field341[var0].method2226();
        }
        System.gc();
        Statics.method128(2);
        field371 = -1;
        field519 = false;
        for (class24 var1 = (class24) class24.field616.method3553(); var1 != null; var1 = (class24) class24.field616.method3558()) {
            if (var1.field599 != null) {
                Statics.field1979.method1097(var1.field599);
                var1.field599 = null;
            }
            if (var1.field611 != null) {
                Statics.field1979.method1097(var1.field611);
                var1.field611 = null;
            }
        }
        class24.field616.method3547();
        method183(10);
    }

    @ObfuscatedName("fg.w(I)V")
    public static final void method3100() {
        class47.field1064.method3491();
        class42.method857();
        class45.field1026.method3491();
        class41.method3113();
        class40.method3193();
        class52.field1141.method3491();
        class52.field1132.method3491();
        class52.field1114.method3491();
        class43.method2281();
        class44.method38();
        class48.field1066.method3491();
        class53.method952();
        class180.method2271();
        class174.field2760.method3491();
        class174.field2761.method3491();
        class174.field2858.method3491();
        class174.field2763.method3491();
        ((class96) Statics.field1594).method2026();
        class23.field590.method3491();
        Statics.field200.method3027();
        Statics.field1989.method3027();
        Statics.field2906.method3027();
        Statics.field683.method3027();
        Statics.field133.method3027();
        Statics.field1777.method3027();
        Statics.field213.method3027();
        Statics.field2059.method3027();
        Statics.field1645.method3027();
        Statics.field2664.method3027();
        Statics.field66.method3027();
        Statics.field156.method3027();
    }

    @ObfuscatedName("dn.g(B)V")
    public static final void method2288() {
        if (field333 > 0) {
            method167();
        } else {
            method183(40);
            Statics.field563 = Statics.field2698;
            Statics.field2698 = null;
        }
    }

    @ObfuscatedName("er.y(B)V")
    public static final void method2893() {
        if (field296 > 1) {
            field296--;
        }
        if (field333 > 0) {
            field333--;
        }
        if (field334) {
            field334 = false;
            method2288();
            return;
        }
        if (!field419) {
            field425[0] = class158.field2556;
            field426[0] = "";
            field423[0] = 1006;
            field497 = 1;
        }
        for (int var0 = 0; var0 < 100 && method1495(); var0++) {
        }
        if (field287 != 30) {
            return;
        }
        while (true) {
            class211 var1 = (class211) class212.field3144.method3597();
            boolean var2;
            if (var1 == null) {
                var2 = false;
            } else {
                var2 = true;
            }
            if (!var2) {
                Object var4 = Statics.field1037.field193;
                synchronized (Statics.field1037.field193) {
                    if (!field278) {
                        Statics.field1037.field196 = 0;
                    } else if (class141.field2160 != 0 || Statics.field1037.field196 >= 40) {
                        field323.method2583(42);
                        field323.method2323(0);
                        int var5 = field323.field2006;
                        int var6 = 0;
                        for (int var7 = 0; var7 < Statics.field1037.field196 && field323.field2006 - var5 < 240; var7++) {
                            var6++;
                            int var8 = Statics.field1037.field192[var7];
                            if (var8 < 0) {
                                var8 = 0;
                            } else if (var8 > 502) {
                                var8 = 502;
                            }
                            int var9 = Statics.field1037.field195[var7];
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > 764) {
                                var9 = 764;
                            }
                            int var10 = var8 * 765 + var9;
                            if (Statics.field1037.field192[var7] == -1 && Statics.field1037.field195[var7] == -1) {
                                var9 = -1;
                                var8 = -1;
                                var10 = 524287;
                            }
                            if (field291 != var9 || field506 != var8) {
                                int var11 = var9 - field291;
                                field291 = var9;
                                int var12 = var8 - field506;
                                field506 = var8;
                                if (field490 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                    var11 += 32;
                                    var12 += 32;
                                    field323.method2507((field490 << 12) + (var11 << 6) + var12);
                                    field490 = 0;
                                } else if (field490 < 8) {
                                    field323.method2452((field490 << 19) + 8388608 + var10);
                                    field490 = 0;
                                } else {
                                    field323.method2326((field490 << 19) + -1073741824 + var10);
                                    field490 = 0;
                                }
                            } else if (field490 < 2047) {
                                field490++;
                            }
                        }
                        field323.method2408(field323.field2006 - var5);
                        if (var6 >= Statics.field1037.field196) {
                            Statics.field1037.field196 = 0;
                        } else {
                            Statics.field1037.field196 -= var6;
                            for (int var13 = 0; var13 < Statics.field1037.field196; var13++) {
                                Statics.field1037.field195[var13] = Statics.field1037.field195[var6 + var13];
                                Statics.field1037.field192[var13] = Statics.field1037.field192[var6 + var13];
                            }
                        }
                    }
                }
                if (class141.field2160 == 1 || !Statics.field1564 && class141.field2160 == 4 || class141.field2160 == 2) {
                    long var15 = (class141.field2165 - field290) / 50L;
                    if (var15 > 4095L) {
                        var15 = 4095L;
                    }
                    field290 = class141.field2165;
                    int var17 = class141.field2171;
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (var17 > Statics.field216) {
                        var17 = Statics.field216;
                    }
                    int var18 = class141.field2170;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > Statics.field215) {
                        var18 = Statics.field215;
                    }
                    int var19 = (int) var15;
                    field323.method2583(28);
                    field323.method2507((var19 << 1) + (class141.field2160 == 2 ? 1 : 0));
                    field323.method2507(var18);
                    field323.method2507(var17);
                }
                if (class138.field2141 > 0) {
                    field323.method2583(223);
                    field323.method2507(0);
                    int var20 = field323.field2006;
                    long var21 = class116.method157();
                    for (int var23 = 0; var23 < class138.field2141; var23++) {
                        long var24 = var21 - field504;
                        if (var24 > 16777215L) {
                            var24 = 16777215L;
                        }
                        field504 = var21;
                        field323.method2361((int) var24);
                        field323.method2362(class138.field2140[var23]);
                    }
                    field323.method2370(field323.field2006 - var20);
                }
                if (field352 > 0) {
                    field352--;
                }
                if (class138.field2121[96] || class138.field2121[97] || class138.field2121[98] || class138.field2121[99]) {
                    field372 = true;
                }
                if (field372 && field352 <= 0) {
                    field352 = 20;
                    field372 = false;
                    field323.method2583(165);
                    field323.method2507(field364);
                    field323.method2403(field365);
                }
                if (Statics.field2079 && !field542) {
                    field542 = true;
                    field323.method2583(236);
                    field323.method2323(1);
                }
                if (!Statics.field2079 && field542) {
                    field542 = false;
                    field323.method2583(236);
                    field323.method2323(0);
                }
                if (Statics.field582 != field508) {
                    field508 = Statics.field582;
                    method2647(Statics.field582);
                }
                if (field287 != 30) {
                    return;
                }
                for (class17 var26 = (class17) field412.method3553(); var26 != null; var26 = (class17) field412.method3558()) {
                    if (var26.field231 > 0) {
                        var26.field231--;
                    }
                    if (var26.field231 == 0) {
                        if (var26.field230 >= 0) {
                            int var27 = var26.field230;
                            int var28 = var26.field226;
                            class41 var29 = class41.method118(var27);
                            if (var28 == 11) {
                                var28 = 10;
                            }
                            if (var28 >= 5 && var28 <= 8) {
                                var28 = 4;
                            }
                            boolean var30 = var29.method787(var28);
                            if (!var30) {
                                continue;
                            }
                        }
                        method716(var26.field228, var26.field221, var26.field222, var26.field233, var26.field230, var26.field223, var26.field226);
                        var26.method3639();
                    } else {
                        if (var26.field229 > 0) {
                            var26.field229--;
                        }
                        if (var26.field229 == 0 && var26.field222 >= 1 && var26.field233 >= 1 && var26.field222 <= 102 && var26.field233 <= 102) {
                            if (var26.field224 >= 0) {
                                int var31 = var26.field224;
                                int var32 = var26.field220;
                                class41 var33 = class41.method118(var31);
                                if (var32 == 11) {
                                    var32 = 10;
                                }
                                if (var32 >= 5 && var32 <= 8) {
                                    var32 = 4;
                                }
                                boolean var34 = var33.method787(var32);
                                if (!var34) {
                                    continue;
                                }
                            }
                            method716(var26.field228, var26.field221, var26.field222, var26.field233, var26.field224, var26.field225, var26.field220);
                            var26.field229 = -1;
                            if (var26.field230 == var26.field224 && var26.field230 == -1) {
                                var26.method3639();
                            } else if (var26.field230 == var26.field224 && var26.field225 == var26.field223 && var26.field226 == var26.field220) {
                                var26.method3639();
                            }
                        }
                    }
                }
                method205();
                field511++;
                if (field511 > 750) {
                    method2288();
                    return;
                }
                int var35 = class33.field756;
                int[] var36 = class33.field757;
                for (int var37 = 0; var37 < var35; var37++) {
                    class3 var38 = field492[var36[var37]];
                    if (var38 != null) {
                        method1454(var38, 1);
                    }
                }
                method2019();
                method186();
                field357++;
                if (field391 != 0) {
                    field390 += 20;
                    if (field390 >= 400) {
                        field391 = 0;
                    }
                }
                if (Statics.field275 != null) {
                    field392++;
                    if (field392 >= 15) {
                        method687(Statics.field275);
                        Statics.field275 = null;
                    }
                }
                class174 var39 = Statics.field79;
                class174 var40 = Statics.field665;
                Statics.field79 = null;
                Statics.field665 = null;
                field455 = null;
                field459 = false;
                field456 = false;
                field501 = 0;
                while (class138.method546() && field501 < 128) {
                    if (field518 >= 2 && class138.field2121[82] && Statics.field2134 == 66) {
                        String var41 = "";
                        Iterator var42 = class12.field168.iterator();
                        while (var42.hasNext()) {
                            class36 var43 = (class36) var42.next();
                            var41 = var41 + var43.field796 + ':' + var43.field792 + '\n';
                        }
                        Statics.field2020.setContents(new StringSelection(var41), (ClipboardOwner) null);
                    } else {
                        field409[field501] = Statics.field2134;
                        field502[field501] = Statics.field1918;
                        field501++;
                    }
                }
                if (field413 != -1) {
                    method2616(field413, 0, 0, Statics.field215, Statics.field216, 0, 0);
                }
                field463++;
                while (true) {
                    class1 var46;
                    class174 var47;
                    class174 var48;
                    do {
                        var46 = (class1) field329.method3551();
                        if (var46 == null) {
                            while (true) {
                                class1 var49;
                                class174 var50;
                                class174 var51;
                                do {
                                    var49 = (class1) field479.method3551();
                                    if (var49 == null) {
                                        while (true) {
                                            class1 var52;
                                            class174 var53;
                                            class174 var54;
                                            do {
                                                var52 = (class1) field284.method3551();
                                                if (var52 == null) {
                                                    method138();
                                                    if (field451 != null) {
                                                        method913();
                                                    }
                                                    if (Statics.field627 != null) {
                                                        method687(Statics.field627);
                                                        field418++;
                                                        if (class141.field2162 == 0) {
                                                            if (field398) {
                                                                if (Statics.field643 == Statics.field627 && field360 != field297) {
                                                                    class174 var55 = Statics.field627;
                                                                    byte var56 = 0;
                                                                    if (field350 == 1 && var55.field2888 == 206) {
                                                                        var56 = 1;
                                                                    }
                                                                    if (var55.field2884[field297] <= 0) {
                                                                        var56 = 0;
                                                                    }
                                                                    if (class179.method914(method942(var55))) {
                                                                        int var57 = field360;
                                                                        int var58 = field297;
                                                                        var55.field2884[var58] = var55.field2884[var57];
                                                                        var55.field2885[var58] = var55.field2885[var57];
                                                                        var55.field2884[var57] = -1;
                                                                        var55.field2885[var57] = 0;
                                                                    } else if (var56 == 1) {
                                                                        int var59 = field360;
                                                                        int var60 = field297;
                                                                        while (var59 != var60) {
                                                                            if (var59 > var60) {
                                                                                var55.method3142(var59 - 1, var59);
                                                                                var59--;
                                                                            } else if (var59 < var60) {
                                                                                var55.method3142(var59 + 1, var59);
                                                                                var59++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var55.method3142(field297, field360);
                                                                    }
                                                                    field323.method2583(85);
                                                                    field323.method2433(Statics.field627.field2827);
                                                                    field323.method2436(var56);
                                                                    field323.method2371(field360);
                                                                    field323.method2403(field297);
                                                                }
                                                            } else if ((field546 == 1 || method681(field497 - 1)) && field497 > 2) {
                                                                method752(field395, field396);
                                                            } else if (field497 > 0) {
                                                                int var61 = field395;
                                                                int var62 = field396;
                                                                class31 var63 = Statics.field232;
                                                                method166(var63.field714, var63.field705, var63.field706, var63.field712, var63.field704, var63.field704, var61, var62);
                                                                Statics.field232 = null;
                                                            }
                                                            field392 = 10;
                                                            class141.field2160 = 0;
                                                            Statics.field627 = null;
                                                        } else if (field418 >= 5 && (class141.field2163 > field395 + 5 || class141.field2163 < field395 - 5 || class141.field2164 > field396 + 5 || class141.field2164 < field396 - 5)) {
                                                            field398 = true;
                                                        }
                                                    }
                                                    if (class87.field1472 != -1) {
                                                        int var64 = class87.field1472;
                                                        int var65 = class87.field1503;
                                                        field323.method2583(74);
                                                        field323.method2323(5);
                                                        field323.method2527(class138.field2121[82] ? (class138.field2121[81] ? 2 : 1) : 0);
                                                        field323.method2470(Statics.field595 + var64);
                                                        field323.method2403(Statics.field1982 + var65);
                                                        class87.field1472 = -1;
                                                        field388 = class141.field2170;
                                                        field540 = class141.field2171;
                                                        field391 = 1;
                                                        field390 = 0;
                                                        field513 = var64;
                                                        field514 = var65;
                                                    }
                                                    if (Statics.field79 != var39) {
                                                        if (var39 != null) {
                                                            method687(var39);
                                                        }
                                                        if (Statics.field79 != null) {
                                                            method687(Statics.field79);
                                                        }
                                                    }
                                                    if (Statics.field665 != var40 && field430 == field429) {
                                                        if (var40 != null) {
                                                            method687(var40);
                                                        }
                                                        if (Statics.field665 != null) {
                                                            method687(Statics.field665);
                                                        }
                                                    }
                                                    if (Statics.field665 == null) {
                                                        if (field429 > 0) {
                                                            field429--;
                                                        }
                                                    } else if (field429 < field430) {
                                                        field429++;
                                                        if (field430 == field429) {
                                                            method687(Statics.field665);
                                                        }
                                                    }
                                                    int var66 = field343 + Statics.field1882.field824;
                                                    int var67 = field347 + Statics.field1882.field814;
                                                    if (Statics.field237 - var66 < -500 || Statics.field237 - var66 > 500 || Statics.field2647 - var67 < -500 || Statics.field2647 - var67 > 500) {
                                                        Statics.field237 = var66;
                                                        Statics.field2647 = var67;
                                                    }
                                                    if (Statics.field237 != var66) {
                                                        Statics.field237 += (var66 - Statics.field237) / 16;
                                                    }
                                                    if (Statics.field2647 != var67) {
                                                        Statics.field2647 += (var67 - Statics.field2647) / 16;
                                                    }
                                                    if (class141.field2162 == 4 && Statics.field1564) {
                                                        int var68 = class141.field2164 - field393;
                                                        field367 = var68 * 2;
                                                        field393 = var68 == -1 || var68 == 1 ? class141.field2164 : (field393 + class141.field2164) / 2;
                                                        int var69 = field368 - class141.field2163;
                                                        field366 = var69 * 2;
                                                        field368 = var69 == -1 || var69 == 1 ? class141.field2163 : (field368 + class141.field2163) / 2;
                                                    } else {
                                                        if (class138.field2121[96]) {
                                                            field366 += (-24 - field366) / 2;
                                                        } else if (class138.field2121[97]) {
                                                            field366 += (24 - field366) / 2;
                                                        } else {
                                                            field366 /= 2;
                                                        }
                                                        if (class138.field2121[98]) {
                                                            field367 += (12 - field367) / 2;
                                                        } else if (class138.field2121[99]) {
                                                            field367 += (-12 - field367) / 2;
                                                        } else {
                                                            field367 /= 2;
                                                        }
                                                        field393 = class141.field2164;
                                                        field368 = class141.field2163;
                                                    }
                                                    field365 = field366 / 2 + field365 & 0x7FF;
                                                    field364 += field367 / 2;
                                                    if (field364 < 128) {
                                                        field364 = 128;
                                                    }
                                                    if (field364 > 383) {
                                                        field364 = 383;
                                                    }
                                                    int var70 = Statics.field237 >> 7;
                                                    int var71 = Statics.field2647 >> 7;
                                                    int var72 = method2223(Statics.field237, Statics.field2647, Statics.field582);
                                                    int var73 = 0;
                                                    if (var70 > 3 && var71 > 3 && var70 < 100 && var71 < 100) {
                                                        for (int var74 = var70 - 4; var74 <= var70 + 4; var74++) {
                                                            for (int var75 = var71 - 4; var75 <= var71 + 4; var75++) {
                                                                int var76 = Statics.field582;
                                                                if (var76 < 3 && (class6.field91[1][var74][var75] & 0x2) == 2) {
                                                                    var76++;
                                                                }
                                                                int var77 = var72 - class6.field94[var76][var74][var75];
                                                                if (var77 > var73) {
                                                                    var73 = var77;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int var78 = var73 * 192;
                                                    if (var78 > 98048) {
                                                        var78 = 98048;
                                                    }
                                                    if (var78 < 32768) {
                                                        var78 = 32768;
                                                    }
                                                    if (var78 > field373) {
                                                        field373 += (var78 - field373) / 24;
                                                    } else if (var78 < field373) {
                                                        field373 += (var78 - field373) / 80;
                                                    }
                                                    if (field559) {
                                                        int var79 = Statics.field2259 * 128 + 64;
                                                        int var80 = Statics.field242 * 128 + 64;
                                                        int var81 = method2223(var79, var80, Statics.field582) - Statics.field29;
                                                        if (Statics.field1405 < var79) {
                                                            Statics.field1405 += Statics.field1093 * (var79 - Statics.field1405) / 1000 + Statics.field2007;
                                                            if (Statics.field1405 > var79) {
                                                                Statics.field1405 = var79;
                                                            }
                                                        }
                                                        if (Statics.field1405 > var79) {
                                                            Statics.field1405 -= Statics.field1093 * (Statics.field1405 - var79) / 1000 + Statics.field2007;
                                                            if (Statics.field1405 < var79) {
                                                                Statics.field1405 = var79;
                                                            }
                                                        }
                                                        if (Statics.field139 < var81) {
                                                            Statics.field139 += Statics.field1093 * (var81 - Statics.field139) / 1000 + Statics.field2007;
                                                            if (Statics.field139 > var81) {
                                                                Statics.field139 = var81;
                                                            }
                                                        }
                                                        if (Statics.field139 > var81) {
                                                            Statics.field139 -= Statics.field1093 * (Statics.field139 - var81) / 1000 + Statics.field2007;
                                                            if (Statics.field139 < var81) {
                                                                Statics.field139 = var81;
                                                            }
                                                        }
                                                        if (Statics.field1354 < var80) {
                                                            Statics.field1354 += Statics.field1093 * (var80 - Statics.field1354) / 1000 + Statics.field2007;
                                                            if (Statics.field1354 > var80) {
                                                                Statics.field1354 = var80;
                                                            }
                                                        }
                                                        if (Statics.field1354 > var80) {
                                                            Statics.field1354 -= Statics.field1093 * (Statics.field1354 - var80) / 1000 + Statics.field2007;
                                                            if (Statics.field1354 < var80) {
                                                                Statics.field1354 = var80;
                                                            }
                                                        }
                                                        int var82 = Statics.field1073 * 128 + 64;
                                                        int var83 = Statics.field1635 * 128 + 64;
                                                        int var84 = method2223(var82, var83, Statics.field582) - Statics.field1392;
                                                        int var85 = var82 - Statics.field1405;
                                                        int var86 = var84 - Statics.field139;
                                                        int var87 = var83 - Statics.field1354;
                                                        int var88 = (int) Math.sqrt((double) (var85 * var85 + var87 * var87));
                                                        int var89 = (int) (Math.atan2((double) var86, (double) var88) * 325.949D) & 0x7FF;
                                                        int var90 = (int) (Math.atan2((double) var85, (double) var87) * -325.949D) & 0x7FF;
                                                        if (var89 < 128) {
                                                            var89 = 128;
                                                        }
                                                        if (var89 > 383) {
                                                            var89 = 383;
                                                        }
                                                        if (Statics.field1223 < var89) {
                                                            Statics.field1223 += Statics.field1203 * (var89 - Statics.field1223) / 1000 + Statics.field1780;
                                                            if (Statics.field1223 > var89) {
                                                                Statics.field1223 = var89;
                                                            }
                                                        }
                                                        if (Statics.field1223 > var89) {
                                                            Statics.field1223 -= Statics.field1203 * (Statics.field1223 - var89) / 1000 + Statics.field1780;
                                                            if (Statics.field1223 < var89) {
                                                                Statics.field1223 = var89;
                                                            }
                                                        }
                                                        int var91 = var90 - Statics.field751;
                                                        if (var91 > 1024) {
                                                            var91 -= 2048;
                                                        }
                                                        if (var91 < -1024) {
                                                            var91 += 2048;
                                                        }
                                                        if (var91 > 0) {
                                                            Statics.field751 += Statics.field1203 * var91 / 1000 + Statics.field1780;
                                                            Statics.field751 &= 0x7FF;
                                                        }
                                                        if (var91 < 0) {
                                                            Statics.field751 -= Statics.field1203 * -var91 / 1000 + Statics.field1780;
                                                            Statics.field751 &= 0x7FF;
                                                        }
                                                        int var92 = var90 - Statics.field751;
                                                        if (var92 > 1024) {
                                                            var92 -= 2048;
                                                        }
                                                        if (var92 < -1024) {
                                                            var92 += 2048;
                                                        }
                                                        if (var92 < 0 && var91 > 0 || var92 > 0 && var91 < 0) {
                                                            Statics.field751 = var90;
                                                        }
                                                    }
                                                    for (int var93 = 0; var93 < 5; var93++) {
                                                        int var10002 = field533[var93]++;
                                                    }
                                                    Statics.field785.method215();
                                                    int var94 = ++class141.field2158 - 1;
                                                    int var96 = class138.method1746();
                                                    if (var94 > 15000 && var96 > 15000) {
                                                        field333 = 250;
                                                        class141.method1033(14500);
                                                        field323.method2583(65);
                                                    }
                                                    field441++;
                                                    if (field441 > 500) {
                                                        field441 = 0;
                                                        int var97 = (int) (Math.random() * 8.0D);
                                                        if ((var97 & 0x1) == 1) {
                                                            field343 += field499;
                                                        }
                                                        if ((var97 & 0x2) == 2) {
                                                            field347 += field348;
                                                        }
                                                        if ((var97 & 0x4) == 4) {
                                                            field349 += field550;
                                                        }
                                                    }
                                                    if (field343 < -50) {
                                                        field499 = 2;
                                                    }
                                                    if (field343 > 50) {
                                                        field499 = -2;
                                                    }
                                                    if (field347 < -55) {
                                                        field348 = 2;
                                                    }
                                                    if (field347 > 55) {
                                                        field348 = -2;
                                                    }
                                                    if (field349 < -40) {
                                                        field550 = 1;
                                                    }
                                                    if (field349 > 40) {
                                                        field550 = -1;
                                                    }
                                                    field356++;
                                                    if (field356 > 500) {
                                                        field356 = 0;
                                                        int var98 = (int) (Math.random() * 8.0D);
                                                        if ((var98 & 0x1) == 1) {
                                                            field411 += field353;
                                                        }
                                                        if ((var98 & 0x2) == 2) {
                                                            field354 += field301;
                                                        }
                                                    }
                                                    if (field411 < -60) {
                                                        field353 = 2;
                                                    }
                                                    if (field411 > 60) {
                                                        field353 = -2;
                                                    }
                                                    if (field354 < -20) {
                                                        field301 = 1;
                                                    }
                                                    if (field354 > 10) {
                                                        field301 = -1;
                                                    }
                                                    for (class39 var99 = (class39) field317.method3505(); var99 != null; var99 = (class39) field317.method3506()) {
                                                        if ((long) var99.field878 < class116.method157() / 1000L - 5L) {
                                                            if (var99.field875 > 0) {
                                                                class12.method2629(5, "", var99.field876 + class158.field2464);
                                                            }
                                                            if (var99.field875 == 0) {
                                                                class12.method2629(5, "", var99.field876 + class158.field2465);
                                                            }
                                                            var99.method3635();
                                                        }
                                                    }
                                                    field355++;
                                                    if (field355 > 50) {
                                                        field323.method2583(60);
                                                    }
                                                    try {
                                                        if (Statics.field2698 != null && field323.field2006 > 0) {
                                                            Statics.field2698.method2800(field323.field2008, 0, field323.field2006);
                                                            field323.field2006 = 0;
                                                            field355 = 0;
                                                        }
                                                    } catch (IOException var101) {
                                                        method2288();
                                                    }
                                                    return;
                                                }
                                                var53 = var52.field9;
                                                if (var53.field2767 < 0) {
                                                    break;
                                                }
                                                var54 = class174.method634(var53.field2785);
                                            } while (var54 == null || var54.field2848 == null || var53.field2767 >= var54.field2848.length || var54.field2848[var53.field2767] != var53);
                                            class37.method192(var52);
                                        }
                                    }
                                    var50 = var49.field9;
                                    if (var50.field2767 < 0) {
                                        break;
                                    }
                                    var51 = class174.method634(var50.field2785);
                                } while (var51 == null || var51.field2848 == null || var50.field2767 >= var51.field2848.length || var51.field2848[var50.field2767] != var50);
                                class37.method192(var49);
                            }
                        }
                        var47 = var46.field9;
                        if (var47.field2767 < 0) {
                            break;
                        }
                        var48 = class174.method634(var47.field2785);
                    } while (var48 == null || var48.field2848 == null || var47.field2767 >= var48.field2848.length || var48.field2848[var47.field2767] != var47);
                    class37.method192(var46);
                }
            }
            field323.method2583(83);
            field323.method2323(0);
            int var3 = field323.field2006;
            class212.method2661(field323);
            field323.method2408(field323.field2006 - var3);
        }
    }

    @ObfuscatedName("am.f(I)V")
    public static final void method666() {
        if (Statics.field2155 != null) {
            Statics.field2155.method1128();
        }
        if (Statics.field64 != null) {
            Statics.field64.method1128();
        }
    }

    @ObfuscatedName("a.q(I)V")
    public static final void method205() {
        for (int var0 = 0; var0 < field522; var0++) {
            int var10002 = field525[var0]--;
            if (field525[var0] >= -10) {
                class59 var2 = field527[var0];
                if (var2 == null) {
                    class59 var10000 = (class59) null;
                    var2 = class59.method1187(Statics.field683, field538[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field525[var0] += var2.method1184();
                    field527[var0] = var2;
                }
                if (field525[var0] < 0) {
                    int var9;
                    if (field408[var0] == 0) {
                        var9 = field520;
                    } else {
                        int var3 = (field408[var0] & 0xFF) * 128;
                        int var4 = field408[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field1882.field824;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field408[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field1882.field814;
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
                        var9 = field521 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1181().method1215(Statics.field1961);
                        class65 var11 = class65.method1239(var10, 100, var9);
                        var11.method1372(field524[var0] - 1);
                        Statics.field1979.method1107(var11);
                    }
                    field525[var0] = -100;
                }
            } else {
                field522--;
                for (int var1 = var0; var1 < field522; var1++) {
                    field538[var1] = field538[var1 + 1];
                    field527[var1] = field527[var1 + 1];
                    field524[var1] = field524[var1 + 1];
                    field525[var1] = field525[var1 + 1];
                    field408[var1] = field408[var1 + 1];
                }
                var0--;
            }
        }
        if (!field519) {
            return;
        }
        boolean var12;
        if (class184.field2974 == 0) {
            var12 = Statics.field2973.method3355();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field517 != 0 && field371 != -1) {
                class184.method1747(Statics.field1777, field371, 0, field517, false);
            }
            field519 = false;
        }
    }

    @ObfuscatedName("r.n(Lar;IIIB)V")
    public static void method161(class43 arg0, int arg1, int arg2, int arg3) {
        if (field522 >= 50 || field521 == 0 || arg0.field990 == null || arg1 >= arg0.field990.length) {
            return;
        }
        int var4 = arg0.field990[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field538[field522] = var5;
        field524[field522] = var6;
        field525[field522] = 0;
        field527[field522] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field408[field522] = (var8 << 16) + (var9 << 8) + var7;
        field522++;
    }

    @ObfuscatedName("ex.v(IIII)V")
    public static void method2921(int arg0, int arg1, int arg2) {
        if (field520 == 0 || arg1 == 0 || field522 >= 50) {
            return;
        }
        field538[field522] = arg0;
        field524[field522] = arg1;
        field525[field522] = arg2;
        field527[field522] = null;
        field408[field522] = 0;
        field522++;
    }

    @ObfuscatedName("bo.ab(IS)V")
    public static void method1554(int arg0) {
        if (arg0 == -1 && !field519) {
            class184.method2225();
        } else if (arg0 != -1 && field371 != arg0 && field517 != 0 && !field519) {
            class169 var1 = Statics.field1777;
            int var2 = field517;
            class184.field2974 = 1;
            Statics.field2975 = var1;
            Statics.field3185 = arg0;
            Statics.field2269 = 0;
            Statics.field2972 = var2;
            Statics.field2978 = false;
            Statics.field2977 = 2;
        }
        field371 = arg0;
    }

    @ObfuscatedName("e.an(B)V")
    public static final void method186() {
        int[] var0 = class33.field757;
        for (int var1 = 0; var1 < class33.field756; var1++) {
            class3 var2 = field492[var0[var1]];
            if (var2 != null && var2.field829 > 0) {
                var2.field829--;
                if (var2.field829 == 0) {
                    var2.field820 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field318; var3++) {
            int var4 = field319[var3];
            class35 var5 = field516[var4];
            if (var5 != null && var5.field829 > 0) {
                var5.field829--;
                if (var5.field829 == 0) {
                    var5.field820 = null;
                }
            }
        }
    }

    @ObfuscatedName("cz.au(I)V")
    public static final void method2019() {
        for (int var0 = 0; var0 < field318; var0++) {
            int var1 = field319[var0];
            class35 var2 = field516[var1];
            if (var2 != null) {
                method1454(var2, var2.field783.field888);
            }
        }
    }

    @ObfuscatedName("bk.ap(Lax;IS)V")
    public static final void method1454(class38 arg0, int arg1) {
        if (arg0.field858 > field336) {
            method151(arg0);
        } else if (arg0.field813 >= field336) {
            if (field336 == arg0.field813 || arg0.field844 == -1 || arg0.field852 != 0 || arg0.field846 + 1 > class43.method43(arg0.field844).field1000[arg0.field845]) {
                int var2 = arg0.field813 - arg0.field858;
                int var3 = field336 - arg0.field858;
                int var4 = arg0.field873 * 64 + arg0.field854 * 128;
                int var5 = arg0.field873 * 64 + arg0.field819 * 128;
                int var6 = arg0.field873 * 64 + arg0.field855 * 128;
                int var7 = arg0.field873 * 64 + arg0.field857 * 128;
                arg0.field824 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field814 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field870 = 0;
            arg0.field863 = arg0.field837;
            arg0.field815 = arg0.field863;
        } else {
            arg0.field841 = arg0.field818;
            if (arg0.field842 == 0) {
                arg0.field870 = 0;
            } else {
                label430: {
                    if (arg0.field844 != -1 && arg0.field852 == 0) {
                        class43 var8 = class43.method43(arg0.field844);
                        if (arg0.field871 > 0 && var8.field998 == 0) {
                            arg0.field870++;
                            break label430;
                        }
                        if (arg0.field871 <= 0 && var8.field1002 == 0) {
                            arg0.field870++;
                            break label430;
                        }
                    }
                    int var9 = arg0.field824;
                    int var10 = arg0.field814;
                    int var11 = arg0.field867[arg0.field842 - 1] * 128 + arg0.field873 * 64;
                    int var12 = arg0.field864[arg0.field842 - 1] * 128 + arg0.field873 * 64;
                    if (var9 < var11) {
                        if (var10 < var12) {
                            arg0.field863 = 1280;
                        } else if (var10 > var12) {
                            arg0.field863 = 1792;
                        } else {
                            arg0.field863 = 1536;
                        }
                    } else if (var9 > var11) {
                        if (var10 < var12) {
                            arg0.field863 = 768;
                        } else if (var10 > var12) {
                            arg0.field863 = 256;
                        } else {
                            arg0.field863 = 512;
                        }
                    } else if (var10 < var12) {
                        arg0.field863 = 1024;
                    } else if (var10 > var12) {
                        arg0.field863 = 0;
                    }
                    byte var13 = arg0.field869[arg0.field842 - 1];
                    if (var11 - var9 <= 256 && var11 - var9 >= -256 && var12 - var10 <= 256 && var12 - var10 >= -256) {
                        int var14 = arg0.field863 - arg0.field815 & 0x7FF;
                        if (var14 > 1024) {
                            var14 -= 2048;
                        }
                        int var15 = arg0.field822;
                        if (var14 >= -256 && var14 <= 256) {
                            var15 = arg0.field821;
                        } else if (var14 >= 256 && var14 < 768) {
                            var15 = arg0.field856;
                        } else if (var14 >= -768 && var14 <= -256) {
                            var15 = arg0.field848;
                        }
                        if (var15 == -1) {
                            var15 = arg0.field821;
                        }
                        arg0.field841 = var15;
                        int var16 = 4;
                        boolean var17 = true;
                        if (arg0 instanceof class35) {
                            var17 = ((class35) arg0).field783.field917;
                        }
                        if (var17) {
                            if (arg0.field863 != arg0.field815 && arg0.field838 == -1 && arg0.field853 != 0) {
                                var16 = 2;
                            }
                            if (arg0.field842 > 2) {
                                var16 = 6;
                            }
                            if (arg0.field842 > 3) {
                                var16 = 8;
                            }
                            if (arg0.field870 > 0 && arg0.field842 > 1) {
                                var16 = 8;
                                arg0.field870--;
                            }
                        } else {
                            if (arg0.field842 > 1) {
                                var16 = 6;
                            }
                            if (arg0.field842 > 2) {
                                var16 = 8;
                            }
                            if (arg0.field870 > 0 && arg0.field842 > 1) {
                                var16 = 8;
                                arg0.field870--;
                            }
                        }
                        if (var13 == 2) {
                            var16 <<= 0x1;
                        }
                        if (var16 >= 8 && arg0.field841 == arg0.field821 && arg0.field851 != -1) {
                            arg0.field841 = arg0.field851;
                        }
                        if (var9 != var11 || var10 != var12) {
                            if (var9 < var11) {
                                arg0.field824 += var16;
                                if (arg0.field824 > var11) {
                                    arg0.field824 = var11;
                                }
                            } else if (var9 > var11) {
                                arg0.field824 -= var16;
                                if (arg0.field824 < var11) {
                                    arg0.field824 = var11;
                                }
                            }
                            if (var10 < var12) {
                                arg0.field814 += var16;
                                if (arg0.field814 > var12) {
                                    arg0.field814 = var12;
                                }
                            } else if (var10 > var12) {
                                arg0.field814 -= var16;
                                if (arg0.field814 < var12) {
                                    arg0.field814 = var12;
                                }
                            }
                        }
                        if (arg0.field824 == var11 && arg0.field814 == var12) {
                            arg0.field842--;
                            if (arg0.field871 > 0) {
                                arg0.field871--;
                            }
                        }
                    } else {
                        arg0.field824 = var11;
                        arg0.field814 = var12;
                        arg0.field842--;
                        if (arg0.field871 > 0) {
                            arg0.field871--;
                        }
                    }
                }
            }
        }
        if (arg0.field824 < 128 || arg0.field814 < 128 || arg0.field824 >= 13184 || arg0.field814 >= 13184) {
            arg0.field844 = -1;
            arg0.field849 = -1;
            arg0.field858 = 0;
            arg0.field813 = 0;
            arg0.field824 = arg0.field867[0] * 128 + arg0.field873 * 64;
            arg0.field814 = arg0.field864[0] * 128 + arg0.field873 * 64;
            arg0.method708();
        }
        if (Statics.field1882 == arg0 && (arg0.field824 < 1536 || arg0.field814 < 1536 || arg0.field824 >= 11776 || arg0.field814 >= 11776)) {
            arg0.field844 = -1;
            arg0.field849 = -1;
            arg0.field858 = 0;
            arg0.field813 = 0;
            arg0.field824 = arg0.field867[0] * 128 + arg0.field873 * 64;
            arg0.field814 = arg0.field864[0] * 128 + arg0.field873 * 64;
            arg0.method708();
        }
        if (arg0.field853 != 0) {
            if (arg0.field838 != -1) {
                class38 var18 = null;
                if (arg0.field838 < 32768) {
                    var18 = field516[arg0.field838];
                } else if (arg0.field838 >= 32768) {
                    var18 = field492[arg0.field838 - 32768];
                }
                if (var18 != null) {
                    int var19 = arg0.field824 - var18.field824;
                    int var20 = arg0.field814 - var18.field814;
                    if (var19 != 0 || var20 != 0) {
                        arg0.field863 = (int) (Math.atan2((double) var19, (double) var20) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field839) {
                    arg0.field838 = -1;
                    arg0.field839 = false;
                }
            }
            if (arg0.field825 != -1 && (arg0.field842 == 0 || arg0.field870 > 0)) {
                arg0.field863 = arg0.field825;
                arg0.field825 = -1;
            }
            int var21 = arg0.field863 - arg0.field815 & 0x7FF;
            if (var21 == 0 && arg0.field839) {
                arg0.field838 = -1;
                arg0.field839 = false;
            }
            if (var21 == 0) {
                arg0.field859 = 0;
            } else {
                arg0.field859++;
                if (var21 > 1024) {
                    arg0.field815 -= arg0.field853;
                    boolean var22 = true;
                    if (var21 < arg0.field853 || var21 > 2048 - arg0.field853) {
                        arg0.field815 = arg0.field863;
                        var22 = false;
                    }
                    if (arg0.field841 == arg0.field818 && (arg0.field859 > 25 || var22)) {
                        if (arg0.field861 == -1) {
                            arg0.field841 = arg0.field821;
                        } else {
                            arg0.field841 = arg0.field861;
                        }
                    }
                } else {
                    arg0.field815 += arg0.field853;
                    boolean var23 = true;
                    if (var21 < arg0.field853 || var21 > 2048 - arg0.field853) {
                        arg0.field815 = arg0.field863;
                        var23 = false;
                    }
                    if (arg0.field841 == arg0.field818 && (arg0.field859 > 25 || var23)) {
                        if (arg0.field840 == -1) {
                            arg0.field841 = arg0.field821;
                        } else {
                            arg0.field841 = arg0.field840;
                        }
                    }
                }
                arg0.field815 &= 0x7FF;
            }
        }
        arg0.field816 = false;
        if (arg0.field841 != -1) {
            class43 var25 = class43.method43(arg0.field841);
            if (var25 == null || var25.field987 == null) {
                arg0.field841 = -1;
            } else {
                arg0.field843++;
                if (arg0.field862 < var25.field987.length && arg0.field843 > var25.field1000[arg0.field862]) {
                    arg0.field843 = 1;
                    arg0.field862++;
                    method161(var25, arg0.field862, arg0.field824, arg0.field814);
                }
                if (arg0.field862 >= var25.field987.length) {
                    arg0.field843 = 0;
                    arg0.field862 = 0;
                    method161(var25, arg0.field862, arg0.field824, arg0.field814);
                }
            }
        }
        if (arg0.field849 != -1 && field336 >= arg0.field826) {
            if (arg0.field850 < 0) {
                arg0.field850 = 0;
            }
            int var26 = class44.method3263(arg0.field849).field1009;
            if (var26 == -1) {
                arg0.field849 = -1;
            } else {
                class43 var27 = class43.method43(var26);
                if (var27 == null || var27.field987 == null) {
                    arg0.field849 = -1;
                } else {
                    arg0.field823++;
                    if (arg0.field850 < var27.field987.length && arg0.field823 > var27.field1000[arg0.field850]) {
                        arg0.field823 = 1;
                        arg0.field850++;
                        method161(var27, arg0.field850, arg0.field824, arg0.field814);
                    }
                    if (arg0.field850 >= var27.field987.length && (arg0.field850 < 0 || arg0.field850 >= var27.field987.length)) {
                        arg0.field849 = -1;
                    }
                }
            }
        }
        if (arg0.field844 != -1 && arg0.field852 <= 1) {
            class43 var28 = class43.method43(arg0.field844);
            if (var28.field998 == 1 && arg0.field871 > 0 && arg0.field858 <= field336 && arg0.field813 < field336) {
                arg0.field852 = 1;
                return;
            }
        }
        if (arg0.field844 != -1 && arg0.field852 == 0) {
            class43 var29 = class43.method43(arg0.field844);
            if (var29 == null || var29.field987 == null) {
                arg0.field844 = -1;
            } else {
                arg0.field846++;
                if (arg0.field845 < var29.field987.length && arg0.field846 > var29.field1000[arg0.field845]) {
                    arg0.field846 = 1;
                    arg0.field845++;
                    method161(var29, arg0.field845, arg0.field824, arg0.field814);
                }
                if (arg0.field845 >= var29.field987.length) {
                    arg0.field845 -= var29.field992;
                    arg0.field827++;
                    if (arg0.field827 >= var29.field997) {
                        arg0.field844 = -1;
                    } else if (arg0.field845 >= 0 && arg0.field845 < var29.field987.length) {
                        method161(var29, arg0.field845, arg0.field824, arg0.field814);
                    } else {
                        arg0.field844 = -1;
                    }
                }
                arg0.field816 = var29.field993;
            }
        }
        if (arg0.field852 > 0) {
            arg0.field852--;
        }
    }

    @ObfuscatedName("t.am(Lax;I)V")
    public static final void method151(class38 arg0) {
        int var1 = arg0.field858 - field336;
        int var2 = arg0.field873 * 64 + arg0.field854 * 128;
        int var3 = arg0.field873 * 64 + arg0.field819 * 128;
        arg0.field824 += (var2 - arg0.field824) / var1;
        arg0.field814 += (var3 - arg0.field814) / var1;
        arg0.field870 = 0;
        arg0.field863 = arg0.field837;
    }

    @ObfuscatedName("z.ae(Lp;III)V")
    public static void method199(class3 arg0, int arg1, int arg2) {
        if (arg0.field844 == arg1 && arg1 != -1) {
            int var3 = class43.method43(arg1).field989;
            if (var3 == 1) {
                arg0.field845 = 0;
                arg0.field846 = 0;
                arg0.field852 = arg2;
                arg0.field827 = 0;
            }
            if (var3 == 2) {
                arg0.field827 = 0;
            }
        } else if (arg1 == -1 || arg0.field844 == -1 || class43.method43(arg1).field994 >= class43.method43(arg0.field844).field994) {
            arg0.field844 = arg1;
            arg0.field845 = 0;
            arg0.field846 = 0;
            arg0.field852 = arg2;
            arg0.field827 = 0;
            arg0.field871 = arg0.field842;
        }
    }

    @ObfuscatedName("c.ao(IB)V")
    public static void method125(int arg0) {
        field491 = 0L;
        if (arg0 >= 2) {
            field337 = true;
        } else {
            field337 = false;
        }
        method2127();
        if (field287 >= 25) {
            method190();
        }
        field2213 = true;
    }

    @ObfuscatedName("h.as(B)V")
    public static void method190() {
        field323.method2583(255);
        class123 var0 = field323;
        int var1 = field337 ? 2 : 1;
        var0.method2323(var1);
        field323.method2507(Statics.field215);
        field323.method2507(Statics.field216);
    }

    @ObfuscatedName("cn.ai(I)V")
    public static void method2127() {
        client var0 = Statics.field277;
        synchronized (Statics.field277) {
            Container var1 = Statics.field277.method2827();
            if (var1 != null) {
                Statics.field771 = Math.max(var1.getSize().width, Statics.field1683);
                Statics.field2080 = Math.max(var1.getSize().height, Statics.field2115);
                if (Statics.field1465 == var1) {
                    Insets var2 = Statics.field1465.getInsets();
                    Statics.field771 -= var2.right + var2.left;
                    Statics.field2080 -= var2.top + var2.bottom;
                }
                if (Statics.field771 <= 0) {
                    Statics.field771 = 1;
                }
                if (Statics.field2080 <= 0) {
                    Statics.field2080 = 1;
                }
                int var3 = field337 ? 2 : 1;
                if (var3 == 1) {
                    Statics.field215 = field493 * 765;
                    Statics.field216 = field342;
                } else {
                    Statics.field215 = Math.min(Statics.field771, 7680);
                    Statics.field216 = Math.min(Statics.field2080, 2160);
                }
                field2211 = (Statics.field771 - Statics.field215) / 2;
                field2212 = 0;
                Statics.field2025.setSize(Statics.field215, Statics.field216);
                Statics.field2095 = class78.method2267(Statics.field215, Statics.field216, Statics.field2025);
                if (Statics.field1465 == var1) {
                    Insets var4 = Statics.field1465.getInsets();
                    Statics.field2025.setLocation(field2211 + var4.left, field2212 + var4.top);
                } else {
                    Statics.field2025.setLocation(field2211, field2212);
                }
                method41();
                if (field413 != -1) {
                    method123(true);
                }
                method1();
            }
        }
    }

    @ObfuscatedName("d.ah(B)V")
    public static void method41() {
        int var0 = Statics.field215;
        int var1 = Statics.field216;
        if (Statics.field771 < var0) {
            int var2 = Statics.field771;
        }
        if (Statics.field2080 < var1) {
            int var3 = Statics.field2080;
        }
        if (Statics.field1389 == null) {
            return;
        }
        try {
            client var4 = Statics.field277;
            int var5 = field337 ? 2 : 1;
            Object[] var6 = new Object[] { var5 };
            JSObject.getWindow(var4).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("s.ax(B)V")
    public static void method1() {
        int var0 = field2211;
        int var1 = field2212;
        int var2 = Statics.field771 - Statics.field215 - var0;
        int var3 = Statics.field2080 - Statics.field216 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field277.method2827();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field1465 == var4) {
                Insets var7 = Statics.field1465.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field2080);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field771, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field771 + var5 - var2, var6, var2, Statics.field2080);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field2080 + var6 - var3, Statics.field771, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("fj.aa(I)V")
    public static final void method3136() {
        if (field413 != -1) {
            method3208(field413);
        }
        for (int var0 = 0; var0 < field481; var0++) {
            if (field483[var0]) {
                field484[var0] = true;
            }
            field369[var0] = field483[var0];
            field483[var0] = false;
        }
        field488 = field336;
        field427 = -1;
        field444 = -1;
        Statics.field643 = null;
        if (field413 != -1) {
            field481 = 0;
            method1200(field413, 0, 0, Statics.field215, Statics.field216, 0, 0, -1);
        }
        class80.method1660();
        if (field419) {
            int var1 = Statics.field883;
            int var2 = Statics.field137;
            int var3 = Statics.field2750;
            int var4 = Statics.field1;
            int var5 = 6116423;
            class80.method1702(var1, var2, var3, var4, var5);
            class80.method1702(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            class80.method1673(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
            Statics.field2666.method3743(class158.field2470, var1 + 3, var2 + 14, var5, -1);
            int var6 = class141.field2163;
            int var7 = class141.field2164;
            for (int var8 = 0; var8 < field497; var8++) {
                int var9 = (field497 - 1 - var8) * 15 + var2 + 31;
                int var10 = 16777215;
                if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
                    var10 = 16776960;
                }
                class225 var11 = Statics.field2666;
                String var12;
                if (field426[var8].length() > 0) {
                    var12 = field425[var8] + class158.field2477 + field426[var8];
                } else {
                    var12 = field425[var8];
                }
                var11.method3743(var12, var1 + 3, var9, var10, 0);
            }
            method114(Statics.field883, Statics.field137, Statics.field2750, Statics.field1);
        } else if (field427 != -1) {
            method610(field427, field444);
        }
        if (field507 == 3) {
            for (int var13 = 0; var13 < field481; var13++) {
                if (field369[var13]) {
                    class80.method1666(field486[var13], field487[var13], field478[var13], field489[var13], 16711935, 128);
                } else if (field484[var13]) {
                    class80.method1666(field486[var13], field487[var13], field478[var13], field489[var13], 16711680, 128);
                }
            }
        }
        int var14 = Statics.field582;
        int var15 = Statics.field1882.field824;
        int var16 = Statics.field1882.field814;
        int var17 = field357;
        for (class24 var18 = (class24) class24.field616.method3553(); var18 != null; var18 = (class24) class24.field616.method3558()) {
            if (var18.field605 != -1 || var18.field609 != null) {
                int var19 = 0;
                if (var15 > var18.field602) {
                    var19 += var15 - var18.field602;
                } else if (var15 < var18.field600) {
                    var19 += var18.field600 - var15;
                }
                if (var16 > var18.field603) {
                    var19 += var16 - var18.field603;
                } else if (var16 < var18.field601) {
                    var19 += var18.field601 - var16;
                }
                if (var19 - 64 > var18.field604 || field521 == 0 || var18.field607 != var14) {
                    if (var18.field599 != null) {
                        Statics.field1979.method1097(var18.field599);
                        var18.field599 = null;
                    }
                    if (var18.field611 != null) {
                        Statics.field1979.method1097(var18.field611);
                        var18.field611 = null;
                    }
                } else {
                    var19 -= 64;
                    if (var19 < 0) {
                        var19 = 0;
                    }
                    int var20 = field521 * (var18.field604 - var19) / var18.field604;
                    class59 var10000;
                    if (var18.field599 != null) {
                        var18.field599.method1243(var20);
                    } else if (var18.field605 >= 0) {
                        var10000 = (class59) null;
                        class59 var21 = class59.method1187(Statics.field683, var18.field605, 0);
                        if (var21 != null) {
                            class63 var22 = var21.method1181().method1215(Statics.field1961);
                            class65 var23 = class65.method1239(var22, 100, var20);
                            var23.method1372(-1);
                            Statics.field1979.method1107(var23);
                            var18.field599 = var23;
                        }
                    }
                    if (var18.field611 != null) {
                        var18.field611.method1243(var20);
                        if (!var18.field611.method3638()) {
                            var18.field611 = null;
                        }
                    } else if (var18.field609 != null && (var18.field610 -= var17) <= 0) {
                        int var24 = (int) (Math.random() * (double) var18.field609.length);
                        var10000 = (class59) null;
                        class59 var25 = class59.method1187(Statics.field683, var18.field609[var24], 0);
                        if (var25 != null) {
                            class63 var26 = var25.method1181().method1215(Statics.field1961);
                            class65 var27 = class65.method1239(var26, 100, var20);
                            var27.method1372(0);
                            Statics.field1979.method1107(var27);
                            var18.field611 = var27;
                            var18.field610 = var18.field598 + (int) (Math.random() * (double) (var18.field608 - var18.field598));
                        }
                    }
                }
            }
        }
        field357 = 0;
    }

    @ObfuscatedName("ex.aq(Ljava/lang/String;ZB)V")
    public static final void method2919(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field2946.method3764(arg0, 250);
        int var6 = Statics.field2946.method3741(arg0, 250) * 13;
        class80.method1702(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1673(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field2946.method3746(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method42(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method114(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field2025.getGraphics();
            Statics.field2095.method1493(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field2025.repaint();
        }
    }

    @ObfuscatedName("t.ay(IIIIZI)V")
    public static final void method135(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field535 - field555) * var5 / 100 + field555;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field402) {
            short var8 = field402;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field539) {
                var6 = field539;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1660();
                    class80.method1702(arg0, arg1, var10, arg3, -16777216);
                    class80.method1702(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field541) {
            short var11 = field541;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field324) {
                var6 = field324;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1660();
                    class80.method1702(arg0, arg1, arg2, var13, -16777216);
                    class80.method1702(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field537 - field534) * var5 / 100 + field534;
        field556 = arg3 * var6 * var14 / 85504 << 1;
        if (field473 != arg2 || field384 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class92.field1597[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class87.method1877(var15, 500, 800, arg2, arg3);
        }
        field399 = arg0;
        field543 = arg1;
        field473 = arg2;
        field384 = arg3;
    }

    @ObfuscatedName("bf.aj(Lao;B)V")
    public static final void method1163(class34 arg0) {
        if (Statics.field1882.field824 >> 7 == field513 && Statics.field1882.field814 >> 7 == field514) {
            field513 = 0;
        }
        int var1 = class33.field756;
        int[] var2 = class33.field757;
        int var3 = var1;
        if (class34.field774 == arg0 || class34.field775 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field774 == arg0) {
                var5 = Statics.field1882;
                var6 = Statics.field1882.field43 << 14;
            } else if (class34.field775 == arg0) {
                var5 = field492[field410];
                var6 = field410 << 14;
            } else {
                var5 = field492[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field779 == arg0 && field410 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method18() && !var5.field59) {
                var5.field53 = false;
                if ((field494 && var1 > 50 || var1 > 200) && class34.field774 != arg0 && var5.field841 == var5.field818) {
                    var5.field53 = true;
                }
                int var7 = var5.field824 >> 7;
                int var8 = var5.field814 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field55 == null || field336 < var5.field52 || field336 >= var5.field57) {
                        if ((var5.field824 & 0x7F) == 64 && (var5.field814 & 0x7F) == 64) {
                            if (field276 == field553[var7][var8]) {
                                continue;
                            }
                            field553[var7][var8] = field276;
                        }
                        var5.field42 = method2223(var5.field824, var5.field814, Statics.field582);
                        Statics.field340.method1781(Statics.field582, var5.field824, var5.field814, var5.field42, 60, var5, var5.field815, var6, var5.field816);
                    } else {
                        var5.field53 = false;
                        var5.field42 = method2223(var5.field824, var5.field814, Statics.field582);
                        Statics.field340.method1934(Statics.field582, var5.field824, var5.field814, var5.field42, 60, var5, var5.field815, var6, var5.field49, var5.field39, var5.field48, var5.field34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("t.ar(ZB)V")
    public static final void method136(boolean arg0) {
        for (int var1 = 0; var1 < field318; var1++) {
            class35 var2 = field516[field319[var1]];
            int var3 = (field319[var1] << 14) + 536870912;
            if (var2 != null && var2.method18() && var2.field783.field908 == arg0 && var2.field783.method719()) {
                int var4 = var2.field824 >> 7;
                int var5 = var2.field814 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field873 == 1 && (var2.field824 & 0x7F) == 64 && (var2.field814 & 0x7F) == 64) {
                        if (field276 == field553[var4][var5]) {
                            continue;
                        }
                        field553[var4][var5] = field276;
                    }
                    if (!var2.field783.field916) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field340.method1781(Statics.field582, var2.field824, var2.field814, method2223(var2.field824 + (var2.field873 * 64 - 64), var2.field814 + (var2.field873 * 64 - 64), Statics.field582), var2.field873 * 64 - 64 + 60, var2, var2.field815, var3, var2.field816);
                }
            }
        }
    }

    @ObfuscatedName("cd.aw(I)V")
    public static final void method2125() {
        for (class7 var0 = (class7) field415.method3553(); var0 != null; var0 = (class7) field415.method3558()) {
            if (Statics.field582 != var0.field109 || field336 > var0.field110) {
                var0.method3639();
            } else if (field336 >= var0.field128) {
                if (var0.field113 > 0) {
                    class35 var1 = field516[var0.field113 - 1];
                    if (var1 != null && var1.field824 >= 0 && var1.field824 < 13312 && var1.field814 >= 0 && var1.field814 < 13312) {
                        var0.method91(var1.field824, var1.field814, method2223(var1.field824, var1.field814, var0.field109) - var0.field108, field336);
                    }
                }
                if (var0.field113 < 0) {
                    int var2 = -var0.field113 - 1;
                    class3 var3;
                    if (field292 == var2) {
                        var3 = Statics.field1882;
                    } else {
                        var3 = field492[var2];
                    }
                    if (var3 != null && var3.field824 >= 0 && var3.field824 < 13312 && var3.field814 >= 0 && var3.field814 < 13312) {
                        var0.method91(var3.field824, var3.field814, method2223(var3.field824, var3.field814, var0.field109) - var0.field108, field336);
                    }
                }
                var0.method92(field357);
                Statics.field340.method1781(Statics.field582, (int) var0.field115, (int) var0.field116, (int) var0.field104, 60, var0, var0.field123, -1, false);
            }
        }
    }

    @ObfuscatedName("u.at(I)V")
    public static final void method88() {
        for (class30 var0 = (class30) field414.method3553(); var0 != null; var0 = (class30) field414.method3558()) {
            if (Statics.field582 != var0.field690 || var0.field697) {
                var0.method3639();
            } else if (field336 >= var0.field692) {
                var0.method630(field357);
                if (var0.field697) {
                    var0.method3639();
                } else {
                    Statics.field340.method1781(var0.field690, var0.field689, var0.field688, var0.field693, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("c.af(Lax;IIIIIS)V")
    public static final void method124(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method18()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field783;
            if (var6.field922 != null) {
                var6 = var6.method720();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class33.field756;
        int[] var8 = class33.field757;
        if (arg1 < var7) {
            int var9 = 30;
            class3 var10 = (class3) arg0;
            if (var10.field59) {
                return;
            }
            if (var10.field36 != -1 || var10.field50 != -1) {
                method113(arg0, arg0.field817 + 15);
                if (field386 > -1) {
                    if (var10.field36 != -1) {
                        Statics.field3142[var10.field36].method1570(field386 + arg2 - 12, field387 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field50 != -1) {
                        Statics.field2669[var10.field50].method1570(field386 + arg2 - 12, field387 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field477 == 10 && field299 == var8[arg1]) {
                method113(arg0, arg0.field817 + 15);
                if (field386 > -1) {
                    Statics.field920[1].method1570(field386 + arg2 - 12, field387 + arg3 - var9);
                }
            }
        } else {
            class40 var11 = ((class35) arg0).field783;
            if (var11.field922 != null) {
                var11 = var11.method720();
            }
            if (var11.field911 >= 0 && var11.field911 < Statics.field2669.length) {
                method113(arg0, arg0.field817 + 15);
                if (field386 > -1) {
                    Statics.field2669[var11.field911].method1570(field386 + arg2 - 12, field387 + arg3 - 30);
                }
            }
            if (field477 == 1 && field298 == field319[arg1 - var7] && field336 % 20 < 10) {
                method113(arg0, arg0.field817 + 15);
                if (field386 > -1) {
                    Statics.field920[0].method1570(field386 + arg2 - 12, field387 + arg3 - 28);
                }
            }
        }
        if (arg0.field820 != null && (arg1 >= var7 || !arg0.field866 && (field496 == 4 || !arg0.field828 && (field496 == 0 || field496 == 3 || field496 == 1 && method236(((class3) arg0).field60, false))))) {
            method113(arg0, arg0.field817);
            if (field386 > -1 && field374 < field375) {
                field467[field374] = Statics.field2666.method3738(arg0.field820) / 2;
                field378[field374] = Statics.field2666.field3190;
                field376[field374] = field386;
                field377[field374] = field387;
                field380[field374] = arg0.field830;
                field381[field374] = arg0.field831;
                field382[field374] = arg0.field829;
                field385[field374] = arg0.field820;
                field374++;
            }
        }
        if (arg0.field868 > field336) {
            method113(arg0, arg0.field817 + 15);
            if (field386 > -1) {
                int var12;
                if (arg1 < var7) {
                    var12 = 30;
                } else {
                    class40 var13 = ((class35) arg0).field783;
                    var12 = var13.field918;
                }
                int var14 = arg0.field847 * var12 / arg0.field836;
                if (var14 > var12) {
                    var14 = var12;
                } else if (var14 == 0 && arg0.field847 > 0) {
                    var14 = 1;
                }
                class80.method1702(field386 + arg2 - var12 / 2, field387 + arg3 - 3, var14, 5, 65280);
                class80.method1702(field386 + arg2 - var12 / 2 + var14, field387 + arg3 - 3, var12 - var14, 5, 16711680);
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            if (arg0.field834[var15] > field336) {
                method113(arg0, arg0.field817 / 2);
                if (field386 > -1) {
                    if (var15 == 1) {
                        field387 -= 20;
                    }
                    if (var15 == 2) {
                        field386 -= 15;
                        field387 -= 10;
                    }
                    if (var15 == 3) {
                        field386 += 15;
                        field387 -= 10;
                    }
                    Statics.field1406[arg0.field833[var15]].method1570(field386 + arg2 - 12, field387 + arg3 - 12);
                    Statics.field188.method3745(Integer.toString(arg0.field832[var15]), field386 + arg2 - 1, field387 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("aj.al(IIIII)V")
    public static final void method814(int arg0, int arg1, int arg2, int arg3) {
        field374 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class33.field756;
        int[] var7 = class33.field757;
        for (int var8 = 0; var8 < field318 + var6; var8++) {
            class38 var9;
            if (var8 < var6) {
                var9 = field492[var7[var8]];
                if (field410 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field516[field319[var8 - var6]];
            }
            method124(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method124(field492[field410], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field374; var10++) {
            int var11 = field376[var10];
            int var12 = field377[var10];
            int var13 = field467[var10];
            int var14 = field378[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field377[var16] - field378[var16] && var12 - var14 < field377[var16] + 2 && var11 - var13 < field467[var16] + field376[var16] && var11 + var13 > field376[var16] - field467[var16] && field377[var16] - field378[var16] < var12) {
                        var12 = field377[var16] - field378[var16];
                        var15 = true;
                    }
                }
            }
            field386 = field376[var10];
            field387 = field377[var10] = var12;
            String var17 = field385[var10];
            if (field440 == 0) {
                int var18 = 16776960;
                if (field380[var10] < 6) {
                    var18 = field495[field380[var10]];
                }
                if (field380[var10] == 6) {
                    var18 = field276 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field380[var10] == 7) {
                    var18 = field276 % 20 < 10 ? 255 : 65535;
                }
                if (field380[var10] == 8) {
                    var18 = field276 % 20 < 10 ? 45056 : 8454016;
                }
                if (field380[var10] == 9) {
                    int var19 = 150 - field382[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field380[var10] == 10) {
                    int var20 = 150 - field382[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field380[var10] == 11) {
                    int var21 = 150 - field382[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field381[var10] == 0) {
                    Statics.field2666.method3745(var17, field386 + arg0, field387 + arg1, var18, 0);
                }
                if (field381[var10] == 1) {
                    Statics.field2666.method3747(var17, field386 + arg0, field387 + arg1, var18, 0, field276);
                }
                if (field381[var10] == 2) {
                    Statics.field2666.method3748(var17, field386 + arg0, field387 + arg1, var18, 0, field276);
                }
                if (field381[var10] == 3) {
                    Statics.field2666.method3737(var17, field386 + arg0, field387 + arg1, var18, 0, field276, 150 - field382[var10]);
                }
                if (field381[var10] == 4) {
                    int var22 = (150 - field382[var10]) * (Statics.field2666.method3738(var17) + 100) / 150;
                    class80.method1662(field386 + arg0 - 50, arg1, field386 + arg0 + 50, arg1 + arg3);
                    Statics.field2666.method3743(var17, field386 + arg0 + 50 - var22, field387 + arg1, var18, 0);
                    class80.method1661(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field381[var10] == 5) {
                    int var23 = 150 - field382[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class80.method1662(arg0, field387 + arg1 - Statics.field2666.field3190 - 1, arg0 + arg2, field387 + arg1 + 5);
                    Statics.field2666.method3745(var17, field386 + arg0, field387 + arg1 + var24, var18, 0);
                    class80.method1661(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field2666.method3745(var17, field386 + arg0, field387 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("ch.ag(IIIII)V")
    public static final void method2036(int arg0, int arg1, int arg2, int arg3) {
        if (field391 == 1) {
            Statics.field2106[field390 / 100].method1570(field388 - 8, field540 - 8);
        }
        if (field391 == 2) {
            Statics.field2106[field390 / 100 + 4].method1570(field388 - 8, field540 - 8);
        }
        field359 = 0;
        int var4 = (Statics.field1882.field824 >> 7) + Statics.field595;
        int var5 = (Statics.field1882.field814 >> 7) + Statics.field1982;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field359 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field359 = 1;
        }
        if (field359 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field359 = 0;
        }
    }

    @ObfuscatedName("k.ac(Lax;II)V")
    public static final void method113(class38 arg0, int arg1) {
        method2129(arg0.field824, arg0.field814, arg1);
    }

    @ObfuscatedName("cn.ak(IIII)V")
    public static final void method2129(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field386 = -1;
            field387 = -1;
            return;
        }
        int var3 = method2223(arg0, arg1, Statics.field582) - arg2;
        int var4 = arg0 - Statics.field1405;
        int var5 = var3 - Statics.field139;
        int var6 = arg1 - Statics.field1354;
        int var7 = class92.field1597[Statics.field1223];
        int var8 = class92.field1598[Statics.field1223];
        int var9 = class92.field1597[Statics.field751];
        int var10 = class92.field1598[Statics.field751];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field386 = field556 * var11 / var15 + field473 / 2;
            field387 = field556 * var14 / var15 + field384 / 2;
        } else {
            field386 = -1;
            field387 = -1;
        }
    }

    @ObfuscatedName("dg.av(IIIB)I")
    public static final int method2223(int arg0, int arg1, int arg2) {
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
        int var8 = (128 - var6) * class6.field94[var5][var3][var4] + class6.field94[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field94[var5][var3][var4 + 1] + class6.field94[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("fs.az(ZI)V")
    public static final void method3202(boolean arg0) {
        field472 = arg0;
        if (!field472) {
            int var1 = field325.method2372();
            int var2 = field325.method2372();
            int var3 = field325.method2430();
            Statics.field2971 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field2971[var4][var5] = field325.method2343();
                }
            }
            Statics.field2221 = new int[var3];
            Statics.field2660 = new int[var3];
            Statics.field173 = new int[var3];
            Statics.field567 = new byte[var3][];
            Statics.field2062 = new byte[var3][];
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
                        Statics.field2221[var7] = var10;
                        Statics.field2660[var7] = Statics.field133.method3028("m" + var8 + "_" + var9);
                        Statics.field173[var7] = Statics.field133.method3028("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method2816(var2, var1);
            return;
        }
        int var11 = field325.method2373();
        int var12 = field325.method2372();
        int var13 = field325.method2430();
        field325.method2585();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field325.method2596(1);
                    if (var17 == 1) {
                        field279[var14][var15][var16] = field325.method2596(26);
                    } else {
                        field279[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field325.method2586();
        Statics.field2971 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field2971[var18][var19] = field325.method2343();
            }
        }
        Statics.field2221 = new int[var13];
        Statics.field2660 = new int[var13];
        Statics.field173 = new int[var13];
        Statics.field567 = new byte[var13][];
        Statics.field2062 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field279[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field2221[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field2221[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field2660[var20] = Statics.field133.method3028("m" + var29 + "_" + var30);
                            Statics.field173[var20] = Statics.field133.method3028("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method2816(var12, var11);
    }

    @ObfuscatedName("ew.bd(III)V")
    public static final void method2816(int arg0, int arg1) {
        if (Statics.field1946 == arg0 && Statics.field1439 == arg1) {
            return;
        }
        Statics.field1946 = arg0;
        Statics.field1439 = arg1;
        method183(25);
        method2919(class158.field2329, true);
        int var2 = Statics.field595;
        int var3 = Statics.field1982;
        Statics.field595 = (arg0 - 6) * 8;
        Statics.field1982 = (arg1 - 6) * 8;
        int var4 = Statics.field595 - var2;
        int var5 = Statics.field1982 - var3;
        int var6 = Statics.field595;
        int var7 = Statics.field1982;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field516[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field867[var10] -= var4;
                    var9.field864[var10] -= var5;
                }
                var9.field824 -= var4 * 128;
                var9.field814 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field492[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field867[var13] -= var4;
                    var12.field864[var13] -= var5;
                }
                var12.field824 -= var4 * 128;
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
                        field346[var24][var20][var21] = field346[var24][var22][var23];
                    } else {
                        field346[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field412.method3553(); var25 != null; var25 = (class17) field412.method3558()) {
            var25.field222 -= var4;
            var25.field233 -= var5;
            if (var25.field222 < 0 || var25.field233 < 0 || var25.field222 >= 104 || var25.field233 >= 104) {
                var25.method3639();
            }
        }
        if (field513 != 0) {
            field513 -= var4;
            field514 -= var5;
        }
        field522 = 0;
        field559 = false;
        field508 = -1;
        field414.method3547();
        field415.method3547();
        for (int var26 = 0; var26 < 4; var26++) {
            field341[var26].method2226();
        }
    }

    @ObfuscatedName("ep.bt(ZS)V")
    public static final void method2762(boolean arg0) {
        method666();
        field355++;
        if (field355 < 50 && !arg0) {
            return;
        }
        field355 = 0;
        if (field334 || Statics.field2698 == null) {
            return;
        }
        field323.method2583(60);
        try {
            Statics.field2698.method2800(field323.field2008, 0, field323.field2006);
            field323.field2006 = 0;
        } catch (IOException var2) {
            field334 = true;
        }
    }

    @ObfuscatedName("dl.bq(IB)V")
    public static final void method2647(int arg0) {
        int[] var1 = Statics.field1371.field1415;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field91[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field340.method1866(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field91[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field340.method1866(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1371.method1560();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field91[arg0][var10][var9] & 0x18) == 0) {
                    method573(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field91[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method573(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field509 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field340.method1799(Statics.field582, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class41.method118(var14).field953;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field341[Statics.field582].field1912;
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
                        field512[field509] = Statics.field2922[var15];
                        field510[field509] = var16;
                        field523[field509] = var17;
                        field509++;
                    }
                }
            }
        }
        Statics.field2095.method1548();
    }

    @ObfuscatedName("n.bj(IIIIII)V")
    public static final void method573(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field340.method1839(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field340.method1800(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1371.field1415;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method118(var12);
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
                class81 var14 = Statics.field61[var13.field954];
                if (var14 != null) {
                    int var15 = (var13.field940 * 4 - var14.field1428) / 2;
                    int var16 = (var13.field967 * 4 - var14.field1430) / 2;
                    var14.method1735(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field967) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field340.method1819(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field340.method1800(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method118(var21);
            if (var22.field954 != -1) {
                class81 var23 = Statics.field61[var22.field954];
                if (var23 != null) {
                    int var24 = (var22.field940 * 4 - var23.field1428) / 2;
                    int var25 = (var22.field967 * 4 - var23.field1430) / 2;
                    var23.method1735(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field967) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1371.field1415;
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
        int var29 = Statics.field340.method1799(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method118(var30);
        if (var31.field954 == -1) {
            return;
        }
        class81 var32 = Statics.field61[var31.field954];
        if (var32 != null) {
            int var33 = (var31.field940 * 4 - var32.field1428) / 2;
            int var34 = (var31.field967 * 4 - var32.field1430) / 2;
            var32.method1735(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field967) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("bl.bf(B)Z")
    public static final boolean method1495() {
        if (Statics.field2698 == null) {
            return false;
        }
        try {
            int var0 = Statics.field2698.method2798();
            if (var0 == 0) {
                return false;
            }
            if (field327 == -1) {
                Statics.field2698.method2797(field325.field2008, 0, 1);
                field325.field2006 = 0;
                field327 = field325.method2584();
                field326 = class189.field3064[field327];
                var0--;
            }
            if (field326 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field2698.method2797(field325.field2008, 0, 1);
                field326 = field325.field2008[0] & 0xFF;
                var0--;
            }
            if (field326 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field2698.method2797(field325.field2008, 0, 2);
                field325.field2006 = 0;
                field326 = field325.method2430();
                var0 -= 2;
            }
            if (var0 < field326) {
                return false;
            }
            field325.field2006 = 0;
            Statics.field2698.method2797(field325.field2008, 0, field326);
            field511 = 0;
            field332 = field331;
            field331 = field330;
            field330 = field327;
            if (field327 == 178) {
                field496 = field325.method2338();
                field293 = field325.method2338();
                field327 = -1;
                return true;
            }
            if (field327 == 40) {
                field559 = true;
                Statics.field1073 = field325.method2338();
                Statics.field1635 = field325.method2338();
                Statics.field1392 = field325.method2430();
                Statics.field1780 = field325.method2338();
                Statics.field1203 = field325.method2338();
                if (Statics.field1203 >= 100) {
                    int var1 = Statics.field1073 * 128 + 64;
                    int var2 = Statics.field1635 * 128 + 64;
                    int var3 = method2223(var1, var2, Statics.field582) - Statics.field1392;
                    int var4 = var1 - Statics.field1405;
                    int var5 = var3 - Statics.field139;
                    int var6 = var2 - Statics.field1354;
                    int var7 = (int) Math.sqrt((double) (var4 * var4 + var6 * var6));
                    Statics.field1223 = (int) (Math.atan2((double) var5, (double) var7) * 325.949D) & 0x7FF;
                    Statics.field751 = (int) (Math.atan2((double) var4, (double) var6) * -325.949D) & 0x7FF;
                    if (Statics.field1223 < 128) {
                        Statics.field1223 = 128;
                    }
                    if (Statics.field1223 > 383) {
                        Statics.field1223 = 383;
                    }
                }
                field327 = -1;
                return true;
            }
            if (field327 == 90) {
                method2139(true);
                field327 = -1;
                return true;
            }
            if (field327 == 172) {
                int var8 = field325.method2375();
                int var9 = field325.method2380();
                int var10 = field325.method2341();
                class174 var11 = class174.method634(var9);
                if (var11.field2775 != var10 || var11.field2776 != var8 || var11.field2771 != 0 || var11.field2811 != 0) {
                    var11.field2775 = var10;
                    var11.field2776 = var8;
                    var11.field2771 = 0;
                    var11.field2811 = 0;
                    method687(var11);
                    Statics.method1938(var11);
                    if (var11.field2768 == 0) {
                        method2638(Statics.field3172[var9 >> 16], var11, false);
                    }
                }
                field327 = -1;
                return true;
            }
            if (field327 == 246) {
                int var12 = field325.method2343();
                class4 var13 = (class4) field309.method3518((long) var12);
                if (var13 != null) {
                    method717(var13, true);
                }
                if (field442 != null) {
                    method687(field442);
                    field442 = null;
                }
                field327 = -1;
                return true;
            }
            if (field327 == 71) {
                int var14 = field325.method2338();
                int var15 = field325.method2338();
                int var16 = field325.method2338();
                int var17 = field325.method2338();
                field529[var14] = true;
                field530[var14] = var15;
                field424[var14] = var16;
                field338[var14] = var17;
                field533[var14] = 0;
                field327 = -1;
                return true;
            }
            if (field327 == 3) {
                for (int var18 = 0; var18 < Statics.field2054; var18++) {
                    class53 var19 = class53.method39(var18);
                    if (var19 != null) {
                        class177.field2919[var18] = 0;
                        class177.field2921[var18] = 0;
                    }
                }
                method110();
                field465 += 32;
                field327 = -1;
                return true;
            }
            if (field327 == 99) {
                method110();
                int var20 = field325.method2338();
                int var21 = field325.method2459();
                int var22 = field325.method2382();
                field428[var20] = var22;
                field400[var20] = var21;
                field416[var20] = 1;
                for (int var23 = 0; var23 < 98; var23++) {
                    if (var22 >= class156.field2302[var23]) {
                        field416[var20] = var23 + 2;
                    }
                }
                field468[++field469 - 1 & 0x1F] = var20;
                field327 = -1;
                return true;
            }
            if (field327 == 203) {
                int var24 = field325.method2372();
                field413 = var24;
                method123(false);
                method2929(var24);
                class37.method193(field413);
                for (int var25 = 0; var25 < 100; var25++) {
                    field483[var25] = true;
                }
                field327 = -1;
                return true;
            }
            if (field327 == 85) {
                method2139(false);
                field327 = -1;
                return true;
            }
            if (field327 == 12) {
                Statics.field2090 = field325.method2366();
                Statics.field1047 = field325.method2366();
                for (int var26 = Statics.field2090; var26 < Statics.field2090 + 8; var26++) {
                    for (int var27 = Statics.field1047; var27 < Statics.field1047 + 8; var27++) {
                        if (field346[Statics.field582][var26][var27] != null) {
                            field346[Statics.field582][var26][var27] = null;
                            method156(var26, var27);
                        }
                    }
                }
                for (class17 var28 = (class17) field412.method3553(); var28 != null; var28 = (class17) field412.method3558()) {
                    if (var28.field222 >= Statics.field2090 && var28.field222 < Statics.field2090 + 8 && var28.field233 >= Statics.field1047 && var28.field233 < Statics.field1047 + 8 && Statics.field582 == var28.field228) {
                        var28.field231 = 0;
                    }
                }
                field327 = -1;
                return true;
            }
            if (field327 == 143) {
                class33.method189(field325, field326);
                field327 = -1;
                return true;
            }
            if (field327 == 128) {
                field559 = true;
                Statics.field2259 = field325.method2338();
                Statics.field242 = field325.method2338();
                Statics.field29 = field325.method2430();
                Statics.field2007 = field325.method2338();
                Statics.field1093 = field325.method2338();
                if (Statics.field1093 >= 100) {
                    Statics.field1405 = Statics.field2259 * 128 + 64;
                    Statics.field1354 = Statics.field242 * 128 + 64;
                    Statics.field139 = method2223(Statics.field1405, Statics.field1354, Statics.field582) - Statics.field29;
                }
                field327 = -1;
                return true;
            }
            if (field327 == 191) {
                int var29 = field325.method2380();
                int var30 = field325.method2381();
                int var31 = field325.method2430();
                if (var31 == 65535) {
                    var31 = -1;
                }
                int var32 = field325.method2430();
                if (var32 == 65535) {
                    var32 = -1;
                }
                for (int var33 = var31; var33 <= var32; var33++) {
                    long var34 = ((long) var29 << 32) + (long) var33;
                    class209 var36 = field480.method3518(var34);
                    if (var36 != null) {
                        var36.method3639();
                    }
                    field480.method3519(new class202(var30), var34);
                }
                field327 = -1;
                return true;
            }
            if (field327 == 76) {
                int var37 = field325.method2343();
                int var38 = field325.method2343();
                if (Statics.field1204 == null || !Statics.field1204.isValid()) {
                    try {
                        Iterator var39 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var39.hasNext()) {
                            GarbageCollectorMXBean var40 = (GarbageCollectorMXBean) var39.next();
                            if (var40.isValid()) {
                                Statics.field1204 = var40;
                                field558 = -1L;
                                field557 = -1L;
                            }
                        }
                    } catch (Throwable var314) {
                    }
                }
                long var42 = class116.method157();
                int var44 = -1;
                if (Statics.field1204 != null) {
                    long var45 = Statics.field1204.getCollectionTime();
                    if (field557 != -1L) {
                        long var47 = var45 - field557;
                        long var49 = var42 - field558;
                        if (var49 != 0L) {
                            var44 = (int) (var47 * 100L / var49);
                        }
                    }
                    field557 = var45;
                    field558 = var42;
                }
                field323.method2583(125);
                field323.method2377(var37);
                field323.method2433(var38);
                field323.method2527(field2208);
                field323.method2527(var44);
                field327 = -1;
                return true;
            }
            if (field327 == 232) {
                int var51 = field325.method2382();
                int var52 = field325.method2375();
                class174 var53 = class174.method634(var51);
                if (var53.field2813 != var52 || var52 == -1) {
                    var53.field2813 = var52;
                    var53.field2835 = 0;
                    var53.field2755 = 0;
                    method687(var53);
                }
                field327 = -1;
                return true;
            }
            if (field327 == 112) {
                int var54 = field325.method2430();
                int var55 = field325.method2338();
                int var56 = field325.method2382();
                class4 var57 = (class4) field309.method3518((long) var56);
                if (var57 != null) {
                    method717(var57, var57.field70 != var54);
                }
                method116(var56, var54, var55);
                field327 = -1;
                return true;
            }
            if (field327 == 6) {
                method110();
                field302 = field325.method2338();
                field475 = field463;
                field327 = -1;
                return true;
            }
            if (field327 == 223 || field327 == 54 || field327 == 83 || field327 == 239 || field327 == 140 || field327 == 97 || field327 == 199 || field327 == 78 || field327 == 18 || field327 == 49) {
                method2135();
                field327 = -1;
                return true;
            }
            if (field327 == 119) {
                for (int var58 = 0; var58 < field492.length; var58++) {
                    if (field492[var58] != null) {
                        field492[var58].field844 = -1;
                    }
                }
                for (int var59 = 0; var59 < field516.length; var59++) {
                    if (field516[var59] != null) {
                        field516[var59].field844 = -1;
                    }
                }
                field327 = -1;
                return true;
            }
            if (field327 == 170) {
                class26 var60 = new class26();
                var60.field636 = field325.method2346();
                var60.field633 = field325.method2430();
                int var61 = field325.method2343();
                var60.field634 = var61;
                method183(45);
                Statics.field2698.method2796();
                Statics.field2698 = null;
                class32.method1943(var60);
                field327 = -1;
                return false;
            }
            if (field327 == 144) {
                int var62 = field325.method2343();
                int var63 = field325.method2430();
                if (var62 < -70000) {
                    var63 += 32768;
                }
                class174 var64;
                if (var62 >= 0) {
                    var64 = class174.method634(var62);
                } else {
                    var64 = null;
                }
                if (var64 != null) {
                    for (int var65 = 0; var65 < var64.field2884.length; var65++) {
                        var64.field2884[var65] = 0;
                        var64.field2885[var65] = 0;
                    }
                }
                class16 var66 = (class16) class16.field205.method3518((long) var63);
                if (var66 != null) {
                    for (int var67 = 0; var67 < var66.field211.length; var67++) {
                        var66.field211[var67] = -1;
                        var66.field207[var67] = 0;
                    }
                }
                int var68 = field325.method2430();
                for (int var69 = 0; var69 < var68; var69++) {
                    int var70 = field325.method2430();
                    int var71 = field325.method2338();
                    if (var71 == 255) {
                        var71 = field325.method2343();
                    }
                    if (var64 != null && var69 < var64.field2884.length) {
                        var64.field2884[var69] = var70;
                        var64.field2885[var69] = var71;
                    }
                    class16.method1027(var63, var69, var70 - 1, var71);
                }
                if (var64 != null) {
                    method687(var64);
                }
                method110();
                field466[++field447 - 1 & 0x1F] = var63 & 0x7FFF;
                field327 = -1;
                return true;
            }
            if (field327 == 116) {
                int var72 = field325.method2380();
                Statics.field1976 = Statics.field879.method2708(var72);
                field327 = -1;
                return true;
            }
            if (field327 == 187) {
                int var73 = field325.method2381();
                int var74 = field325.method2373();
                class177.field2919[var74] = var73;
                if (class177.field2921[var74] != var73) {
                    class177.field2921[var74] = var73;
                }
                method1049(var74);
                field464[++field465 - 1 & 0x1F] = var74;
                field327 = -1;
                return true;
            }
            if (field327 == 66) {
                method167();
                field327 = -1;
                return false;
            }
            if (field327 == 138) {
                field477 = field325.method2338();
                if (field477 == 1) {
                    field298 = field325.method2430();
                }
                if (field477 >= 2 && field477 <= 6) {
                    if (field477 == 2) {
                        field303 = 64;
                        field304 = 64;
                    }
                    if (field477 == 3) {
                        field303 = 0;
                        field304 = 64;
                    }
                    if (field477 == 4) {
                        field303 = 128;
                        field304 = 64;
                    }
                    if (field477 == 5) {
                        field303 = 64;
                        field304 = 0;
                    }
                    if (field477 == 6) {
                        field303 = 64;
                        field304 = 128;
                    }
                    field477 = 2;
                    field300 = field325.method2430();
                    field544 = field325.method2430();
                    field548 = field325.method2338();
                }
                if (field477 == 10) {
                    field299 = field325.method2430();
                }
                field327 = -1;
                return true;
            }
            if (field327 == 213) {
                String var75 = field325.method2346();
                String var76 = class224.method3742(class164.method694(Statics.method2918(field325)));
                class12.method2629(6, var75, var76);
                field327 = -1;
                return true;
            }
            if (field327 == 95) {
                boolean var77 = field325.method2338() == 1;
                if (var77) {
                    Statics.field67 = class116.method157() - field325.method2344();
                    Statics.field872 = new class222(field325, true);
                } else {
                    Statics.field872 = null;
                }
                field564 = field463;
                field327 = -1;
                return true;
            }
            if (field327 == 35) {
                int var78 = field325.method2372();
                int var79 = field325.method2380();
                class174 var80 = class174.method634(var79);
                if (var80.field2789 != 2 || var80.field2831 != var78) {
                    var80.field2789 = 2;
                    var80.field2831 = var78;
                    method687(var80);
                }
                field327 = -1;
                return true;
            }
            if (field327 == 240) {
                field559 = false;
                for (int var81 = 0; var81 < 5; var81++) {
                    field529[var81] = false;
                }
                field327 = -1;
                return true;
            }
            if (field327 == 207) {
                class123 var82 = field325;
                int var83 = field326;
                class211 var84 = new class211();
                var84.field3141 = var82.method2338();
                var84.field3137 = var82.method2343();
                var84.field3135 = new int[var84.field3141];
                var84.field3136 = new int[var84.field3141];
                var84.field3134 = new Field[var84.field3141];
                var84.field3138 = new int[var84.field3141];
                var84.field3139 = new Method[var84.field3141];
                var84.field3140 = new byte[var84.field3141][][];
                for (int var85 = 0; var85 < var84.field3141; var85++) {
                    try {
                        int var86 = var82.method2338();
                        if (var86 == 0 || var86 == 1 || var86 == 2) {
                            String var87 = var82.method2346();
                            String var88 = var82.method2346();
                            int var89 = 0;
                            if (var86 == 1) {
                                var89 = var82.method2343();
                            }
                            var84.field3135[var85] = var86;
                            var84.field3138[var85] = var89;
                            if (class212.method3244(var87).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var84.field3134[var85] = class212.method3244(var87).getDeclaredField(var88);
                        } else if (var86 == 3 || var86 == 4) {
                            String var90 = var82.method2346();
                            String var91 = var82.method2346();
                            int var92 = var82.method2338();
                            String[] var93 = new String[var92];
                            for (int var94 = 0; var94 < var92; var94++) {
                                var93[var94] = var82.method2346();
                            }
                            String var95 = var82.method2346();
                            byte[][] var96 = new byte[var92][];
                            if (var86 == 3) {
                                for (int var97 = 0; var97 < var92; var97++) {
                                    int var98 = var82.method2343();
                                    var96[var97] = new byte[var98];
                                    var82.method2349(var96[var97], 0, var98);
                                }
                            }
                            var84.field3135[var85] = var86;
                            Class[] var99 = new Class[var92];
                            for (int var100 = 0; var100 < var92; var100++) {
                                var99[var100] = class212.method3244(var93[var100]);
                            }
                            Class var101 = class212.method3244(var95);
                            if (class212.method3244(var90).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var102 = class212.method3244(var90).getDeclaredMethods();
                            Method[] var103 = var102;
                            for (int var104 = 0; var104 < var103.length; var104++) {
                                Method var105 = var103[var104];
                                if (var105.getName().equals(var91)) {
                                    Class[] var106 = var105.getParameterTypes();
                                    if (var99.length == var106.length) {
                                        boolean var107 = true;
                                        for (int var108 = 0; var108 < var99.length; var108++) {
                                            if (var99[var108] != var106[var108]) {
                                                var107 = false;
                                                break;
                                            }
                                        }
                                        if (var107 && var101 == var105.getReturnType()) {
                                            var84.field3139[var85] = var105;
                                        }
                                    }
                                }
                            }
                            var84.field3140[var85] = var96;
                        }
                    } catch (ClassNotFoundException var309) {
                        var84.field3136[var85] = -1;
                    } catch (SecurityException var310) {
                        var84.field3136[var85] = -2;
                    } catch (NullPointerException var311) {
                        var84.field3136[var85] = -3;
                    } catch (Exception var312) {
                        var84.field3136[var85] = -4;
                    } catch (Throwable var313) {
                        var84.field3136[var85] = -5;
                    }
                }
                class212.field3144.method3590(var84);
                field327 = -1;
                return true;
            }
            if (field327 == 195) {
                for (int var114 = 0; var114 < class177.field2921.length; var114++) {
                    if (class177.field2921[var114] != class177.field2919[var114]) {
                        class177.field2921[var114] = class177.field2919[var114];
                        method1049(var114);
                        field464[++field465 - 1 & 0x1F] = var114;
                    }
                }
                field327 = -1;
                return true;
            }
            if (field327 == 180) {
                int var115 = field325.method2430();
                int var116 = field325.method2338();
                int var117 = field325.method2430();
                method2921(var115, var116, var117);
                field327 = -1;
                return true;
            }
            if (field327 == 84) {
                int var118 = field325.method2382();
                class174 var119 = class174.method634(var118);
                for (int var120 = 0; var120 < var119.field2884.length; var120++) {
                    var119.field2884[var120] = -1;
                    var119.field2884[var120] = 0;
                }
                method687(var119);
                field327 = -1;
                return true;
            }
            if (field327 == 70) {
                field296 = field325.method2373() * 30;
                field475 = field463;
                field327 = -1;
                return true;
            }
            if (field327 == 111) {
                if (field413 != -1) {
                    Statics.method1940(field413, 0);
                }
                field327 = -1;
                return true;
            }
            if (field327 == 235) {
                int var121 = field325.method2372();
                class16 var122 = (class16) class16.field205.method3518((long) var121);
                if (var122 != null) {
                    var122.method3639();
                }
                field466[++field447 - 1 & 0x1F] = var121 & 0x7FFF;
                field327 = -1;
                return true;
            }
            if (field327 == 108) {
                String var123 = field325.method2346();
                long var124 = field325.method2344();
                long var126 = (long) field325.method2430();
                long var128 = (long) field325.method2359();
                class153 var130 = (class153) class110.method1520(class153.method2287(), field325.method2338());
                long var131 = (var126 << 32) + var128;
                boolean var133 = false;
                for (int var134 = 0; var134 < 100; var134++) {
                    if (field383[var134] == var131) {
                        var133 = true;
                        break;
                    }
                }
                if (var130.field2272 && method191(var123)) {
                    var133 = true;
                }
                if (!var133 && field359 == 0) {
                    field383[field531] = var131;
                    field531 = (field531 + 1) % 100;
                    String var135 = class224.method3742(class164.method694(Statics.method2918(field325)));
                    if (var130.field2284 == -1) {
                        class12.method1030(9, var123, var135, class163.method693(var124));
                    } else {
                        class12.method1030(9, class2.method2927(var130.field2284) + var123, var135, class163.method693(var124));
                    }
                }
                field327 = -1;
                return true;
            }
            if (field327 == 105) {
                Statics.field1047 = field325.method2366();
                Statics.field2090 = field325.method2366();
                while (field325.field2006 < field326) {
                    field327 = field325.method2338();
                    method2135();
                }
                field327 = -1;
                return true;
            }
            if (field327 == 31) {
                method110();
                field438 = field325.method2341();
                field475 = field463;
                field327 = -1;
                return true;
            }
            if (field327 == 250) {
                method3202(true);
                field325.method2584();
                int var136 = field325.method2430();
                class33.method189(field325, var136);
                field327 = -1;
                return true;
            }
            if (field327 == 126) {
                int var137 = field325.method2343();
                int var138 = field325.method2382();
                class4 var139 = (class4) field309.method3518((long) var138);
                class4 var140 = (class4) field309.method3518((long) var137);
                if (var140 != null) {
                    method717(var140, var139 == null || var139.field70 != var140.field70);
                }
                if (var139 != null) {
                    var139.method3639();
                    field309.method3519(var139, (long) var137);
                }
                class174 var141 = class174.method634(var138);
                if (var141 != null) {
                    method687(var141);
                }
                class174 var142 = class174.method634(var137);
                if (var142 != null) {
                    method687(var142);
                    method2638(Statics.field3172[var142.field2827 >>> 16], var142, true);
                }
                if (field413 != -1) {
                    Statics.method1940(field413, 1);
                }
                field327 = -1;
                return true;
            }
            if (field327 == 163) {
                String var143 = field325.method2346();
                int var144 = field325.method2381();
                class174 var145 = class174.method634(var144);
                if (!var143.equals(var145.field2826)) {
                    var145.field2826 = var143;
                    method687(var145);
                }
                field327 = -1;
                return true;
            }
            if (field327 == 177) {
                int var146 = field325.method2373();
                int var147 = field325.method2379();
                int var148 = field325.method2380();
                int var149 = field325.method2430();
                class174 var150 = class174.method634(var148);
                if (var150.field2817 != var147 || var150.field2818 != var149 || var150.field2820 != var146) {
                    var150.field2817 = var147;
                    var150.field2818 = var149;
                    var150.field2820 = var146;
                    method687(var150);
                }
                field327 = -1;
                return true;
            }
            if (field327 == 157) {
                class33.method611();
                for (int var151 = 0; var151 < 2048; var151++) {
                    field492[var151] = null;
                }
                class33.method887(field325);
                field327 = -1;
                return true;
            }
            if (field327 == 36) {
                int var152 = field325.method2343();
                int var153 = field325.method2430();
                if (var152 < -70000) {
                    var153 += 32768;
                }
                class174 var154;
                if (var152 >= 0) {
                    var154 = class174.method634(var152);
                } else {
                    var154 = null;
                }
                while (field325.field2006 < field326) {
                    int var155 = field325.method2351();
                    int var156 = field325.method2430();
                    int var157 = 0;
                    if (var156 != 0) {
                        var157 = field325.method2338();
                        if (var157 == 255) {
                            var157 = field325.method2343();
                        }
                    }
                    if (var154 != null && var155 >= 0 && var155 < var154.field2884.length) {
                        var154.field2884[var155] = var156;
                        var154.field2885[var155] = var157;
                    }
                    class16.method1027(var153, var155, var156 - 1, var157);
                }
                if (var154 != null) {
                    method687(var154);
                }
                method110();
                field466[++field447 - 1 & 0x1F] = var153 & 0x7FFF;
                field327 = -1;
                return true;
            }
            if (field327 == 2) {
                field545 = 1;
                field471 = field463;
                field327 = -1;
                return true;
            }
            if (field327 == 216) {
                while (field325.field2006 < field326) {
                    int var158 = field325.method2338();
                    boolean var159 = (var158 & 0x1) == 1;
                    String var160 = field325.method2346();
                    String var161 = field325.method2346();
                    field325.method2346();
                    for (int var162 = 0; var162 < field551; var162++) {
                        class8 var163 = field345[var162];
                        if (var159) {
                            if (var161.equals(var163.field134)) {
                                var163.field134 = var160;
                                var163.field136 = var161;
                                var160 = null;
                                break;
                            }
                        } else if (var160.equals(var163.field134)) {
                            var163.field134 = var160;
                            var163.field136 = var161;
                            var160 = null;
                            break;
                        }
                    }
                    if (var160 != null && field551 < 400) {
                        class8 var164 = new class8();
                        field345[field551] = var164;
                        var164.field134 = var160;
                        var164.field136 = var161;
                        field551++;
                    }
                }
                field471 = field463;
                field327 = -1;
                return true;
            }
            if (field327 == 65) {
                String var165 = field325.method2346();
                Statics.field165 = var165;
                try {
                    String var166 = Statics.field277.getParameter(class191.field3071.field3078);
                    String var167 = Statics.field277.getParameter(class191.field3079.field3078);
                    String var168 = var166 + "settings=" + var165 + "; version=1; path=/; domain=" + var167;
                    String var169;
                    if (var165.length() == 0) {
                        var169 = var168 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        String var170 = var168 + "; Expires=";
                        long var171 = class116.method157() + 94608000000L;
                        class112.field1965.setTime(new Date(var171));
                        int var173 = class112.field1965.get(7);
                        int var174 = class112.field1965.get(5);
                        int var175 = class112.field1965.get(2);
                        int var176 = class112.field1965.get(1);
                        int var177 = class112.field1965.get(11);
                        int var178 = class112.field1965.get(12);
                        int var179 = class112.field1965.get(13);
                        String var180 = class112.field1964[var173 - 1] + ", " + var174 / 10 + var174 % 10 + "-" + class112.field1967[0][var175] + "-" + var176 + " " + var177 / 10 + var177 % 10 + ":" + var178 / 10 + var178 % 10 + ":" + var179 / 10 + var179 % 10 + " GMT";
                        var169 = var170 + var180 + "; Max-Age=" + 94608000L;
                    }
                    client var181 = Statics.field277;
                    String var182 = "document.cookie=\"" + var169 + "\"";
                    JSObject.getWindow(var181).eval(var182);
                } catch (Throwable var308) {
                }
                field327 = -1;
                return true;
            }
            if (field327 == 168) {
                method3202(false);
                field325.method2584();
                int var184 = field325.method2430();
                class33.method189(field325, var184);
                field327 = -1;
                return true;
            }
            if (field327 == 200) {
                int var185 = field325.method2382();
                int var186 = field325.method2372();
                int var187 = field325.method2372();
                class174 var188 = class174.method634(var185);
                var188.field2822 = (var187 << 16) + var186;
                field327 = -1;
                return true;
            }
            if (field327 == 130) {
                int var189 = field325.method2373();
                if (var189 == 65535) {
                    var189 = -1;
                }
                int var190 = field325.method2380();
                int var191 = field325.method2382();
                class174 var192 = class174.method634(var191);
                if (var192.field2765) {
                    var192.field2886 = var189;
                    var192.field2781 = var190;
                    class52 var194 = class52.method126(var189);
                    var192.field2817 = var194.field1123;
                    var192.field2818 = var194.field1124;
                    var192.field2819 = var194.field1127;
                    var192.field2860 = var194.field1126;
                    var192.field2816 = var194.field1139;
                    var192.field2820 = var194.field1122;
                    if (var194.field1128 == 1) {
                        var192.field2824 = 1;
                    } else {
                        var192.field2824 = 2;
                    }
                    if (var192.field2821 > 0) {
                        var192.field2820 = var192.field2820 * 32 / var192.field2821;
                    } else if (var192.field2777 > 0) {
                        var192.field2820 = var192.field2820 * 32 / var192.field2777;
                    }
                    method687(var192);
                } else if (var189 == -1) {
                    var192.field2789 = 0;
                    field327 = -1;
                    return true;
                } else {
                    class52 var193 = class52.method126(var189);
                    var192.field2789 = 4;
                    var192.field2831 = var189;
                    var192.field2817 = var193.field1123;
                    var192.field2818 = var193.field1124;
                    var192.field2820 = var193.field1122 * 100 / var190;
                    method687(var192);
                }
                field327 = -1;
                return true;
            }
            if (field327 == 79) {
                int var195 = field325.method2459();
                int var196 = field325.method2364();
                String var197 = field325.method2346();
                if (var196 >= 1 && var196 <= 8) {
                    if (var197.equalsIgnoreCase("null")) {
                        var197 = null;
                    }
                    field443[var196 - 1] = var197;
                    field295[var196 - 1] = var195 == 0;
                }
                field327 = -1;
                return true;
            }
            if (field327 == 173) {
                field294 = field325.method2338();
                field327 = -1;
                return true;
            }
            if (field327 == 102) {
                Statics.field1378 = class131.method678(field325.method2338());
                field327 = -1;
                return true;
            }
            if (field327 == 145) {
                int var198 = field326 + field325.field2006;
                int var199 = field325.method2430();
                int var200 = field325.method2430();
                if (field413 != var199) {
                    field413 = var199;
                    method123(false);
                    method2929(field413);
                    class37.method193(field413);
                    for (int var201 = 0; var201 < 100; var201++) {
                        field483[var201] = true;
                    }
                }
                while (var200-- > 0) {
                    int var202 = field325.method2343();
                    int var203 = field325.method2430();
                    int var204 = field325.method2338();
                    class4 var205 = (class4) field309.method3518((long) var202);
                    if (var205 != null && var205.field70 != var203) {
                        method717(var205, true);
                        var205 = null;
                    }
                    if (var205 == null) {
                        var205 = method116(var202, var203, var204);
                    }
                    var205.field69 = true;
                }
                for (class4 var206 = (class4) field309.method3521(); var206 != null; var206 = (class4) field309.method3522()) {
                    if (var206.field69) {
                        var206.field69 = false;
                    } else {
                        method717(var206, true);
                    }
                }
                field480 = new class197(512);
                while (field325.field2006 < var198) {
                    int var207 = field325.method2343();
                    int var208 = field325.method2430();
                    int var209 = field325.method2430();
                    int var210 = field325.method2343();
                    for (int var211 = var208; var211 <= var209; var211++) {
                        long var212 = ((long) var207 << 32) + (long) var211;
                        field480.method3519(new class202(var210), var212);
                    }
                }
                field327 = -1;
                return true;
            }
            if (field327 == 129) {
                String var214 = field325.method2346();
                long var215 = (long) field325.method2430();
                long var217 = (long) field325.method2359();
                class153 var219 = (class153) class110.method1520(class153.method2287(), field325.method2338());
                long var220 = (var215 << 32) + var217;
                boolean var222 = false;
                for (int var223 = 0; var223 < 100; var223++) {
                    if (field383[var223] == var220) {
                        var222 = true;
                        break;
                    }
                }
                if (method191(var214)) {
                    var222 = true;
                }
                if (!var222 && field359 == 0) {
                    field383[field531] = var220;
                    field531 = (field531 + 1) % 100;
                    String var224 = class224.method3742(class164.method694(Statics.method2918(field325)));
                    byte var225;
                    if (var219.field2281) {
                        var225 = 7;
                    } else {
                        var225 = 3;
                    }
                    if (var219.field2284 == -1) {
                        class12.method2629(var225, var214, var224);
                    } else {
                        class12.method2629(var225, class2.method2927(var219.field2284) + var214, var224);
                    }
                }
                field327 = -1;
                return true;
            }
            if (field327 == 254) {
                String var226 = field325.method2346();
                int var227 = field325.method2430();
                byte var228 = field325.method2339();
                boolean var229 = false;
                if (var228 == -128) {
                    var229 = true;
                }
                if (var229) {
                    if (Statics.field1960 == 0) {
                        field327 = -1;
                        return true;
                    }
                    boolean var230 = false;
                    int var231;
                    for (var231 = 0; var231 < Statics.field1960 && (!Statics.field2613[var231].field617.equals(var226) || Statics.field2613[var231].field619 != var227); var231++) {
                    }
                    if (var231 < Statics.field1960) {
                        while (var231 < Statics.field1960 - 1) {
                            Statics.field2613[var231] = Statics.field2613[var231 + 1];
                            var231++;
                        }
                        Statics.field1960--;
                        Statics.field2613[Statics.field1960] = null;
                    }
                } else {
                    field325.method2346();
                    class25 var232 = new class25();
                    var232.field617 = var226;
                    var232.field618 = class165.method679(var232.field617, Statics.field25);
                    var232.field619 = var227;
                    var232.field623 = var228;
                    int var233;
                    for (var233 = Statics.field1960 - 1; var233 >= 0; var233--) {
                        int var234 = Statics.field2613[var233].field618.compareTo(var232.field618);
                        if (var234 == 0) {
                            Statics.field2613[var233].field619 = var227;
                            Statics.field2613[var233].field623 = var228;
                            if (var226.equals(Statics.field1882.field60)) {
                                Statics.field397 = var228;
                            }
                            field452 = field463;
                            field327 = -1;
                            return true;
                        }
                        if (var234 < 0) {
                            break;
                        }
                    }
                    if (Statics.field1960 >= Statics.field2613.length) {
                        field327 = -1;
                        return true;
                    }
                    for (int var235 = Statics.field1960 - 1; var235 > var233; var235--) {
                        Statics.field2613[var235 + 1] = Statics.field2613[var235];
                    }
                    if (Statics.field1960 == 0) {
                        Statics.field2613 = new class25[100];
                    }
                    Statics.field2613[var233 + 1] = var232;
                    Statics.field1960++;
                    if (var226.equals(Statics.field1882.field60)) {
                        Statics.field397 = var228;
                    }
                }
                field452 = field463;
                field327 = -1;
                return true;
            }
            if (field327 == 104) {
                int var236 = field325.method2351();
                boolean var237 = field325.method2338() == 1;
                String var238 = "";
                boolean var239 = false;
                if (var237) {
                    var238 = field325.method2346();
                    if (method191(var238)) {
                        var239 = true;
                    }
                }
                String var240 = field325.method2346();
                if (!var239) {
                    class12.method2629(var236, var238, var240);
                }
                field327 = -1;
                return true;
            }
            if (field327 == 125) {
                String var241 = field325.method2346();
                Object[] var242 = new Object[var241.length() + 1];
                for (int var243 = var241.length() - 1; var243 >= 0; var243--) {
                    if (var241.charAt(var243) == 's') {
                        var242[var243 + 1] = field325.method2346();
                    } else {
                        var242[var243 + 1] = Integer.valueOf(field325.method2343());
                    }
                }
                var242[0] = Integer.valueOf(field325.method2343());
                class1 var244 = new class1();
                var244.field13 = var242;
                class37.method192(var244);
                field327 = -1;
                return true;
            }
            if (field327 == 204) {
                int var245 = field325.method2379();
                if (var245 == 65535) {
                    var245 = -1;
                }
                method1554(var245);
                field327 = -1;
                return true;
            }
            if (field327 == 221) {
                int var246 = field325.method2376();
                int var247 = field325.method2430();
                if (var247 == 65535) {
                    var247 = -1;
                }
                Statics.method2273(var247, var246);
                field327 = -1;
                return true;
            }
            if (field327 == 227) {
                field452 = field463;
                if (field326 == 0) {
                    field505 = null;
                    field417 = null;
                    Statics.field1960 = 0;
                    Statics.field2613 = null;
                    field327 = -1;
                    return true;
                }
                field417 = field325.method2346();
                long var248 = field325.method2344();
                field505 = class163.method1764(var248);
                Statics.field780 = field325.method2339();
                int var250 = field325.method2338();
                if (var250 == 255) {
                    field327 = -1;
                    return true;
                }
                Statics.field1960 = var250;
                class25[] var251 = new class25[100];
                for (int var252 = 0; var252 < Statics.field1960; var252++) {
                    var251[var252] = new class25();
                    var251[var252].field617 = field325.method2346();
                    var251[var252].field618 = class165.method679(var251[var252].field617, Statics.field25);
                    var251[var252].field619 = field325.method2430();
                    var251[var252].field623 = field325.method2339();
                    field325.method2346();
                    if (var251[var252].field617.equals(Statics.field1882.field60)) {
                        Statics.field397 = var251[var252].field623;
                    }
                }
                boolean var253 = false;
                int var254 = Statics.field1960;
                while (var254 > 0) {
                    boolean var255 = true;
                    var254--;
                    for (int var256 = 0; var256 < var254; var256++) {
                        if (var251[var256].field618.compareTo(var251[var256 + 1].field618) > 0) {
                            class25 var257 = var251[var256];
                            var251[var256] = var251[var256 + 1];
                            var251[var256 + 1] = var257;
                            var255 = false;
                        }
                    }
                    if (var255) {
                        break;
                    }
                }
                Statics.field2613 = var251;
                field327 = -1;
                return true;
            }
            if (field327 == 161) {
                field325.field2006 += 28;
                if (field325.method2360()) {
                    class123 var258 = field325;
                    int var259 = field325.field2006 - 28;
                    if (class150.field2243 != null) {
                        try {
                            class150.field2243.method3873(0L);
                            class150.field2243.method3860(var258.field2008, var259, 24);
                        } catch (Exception var307) {
                        }
                    }
                }
                field327 = -1;
                return true;
            }
            if (field327 == 21) {
                while (field325.field2006 < field326) {
                    boolean var261 = field325.method2338() == 1;
                    String var262 = field325.method2346();
                    String var263 = field325.method2346();
                    int var264 = field325.method2430();
                    int var265 = field325.method2338();
                    int var266 = field325.method2338();
                    boolean var267 = (var266 & 0x2) != 0;
                    boolean var268 = (var266 & 0x1) != 0;
                    if (var264 > 0) {
                        field325.method2346();
                        field325.method2338();
                        field325.method2343();
                    }
                    field325.method2346();
                    for (int var269 = 0; var269 < field500; var269++) {
                        class18 var270 = field549[var269];
                        if (var261) {
                            if (var263.equals(var270.field248)) {
                                var270.field248 = var262;
                                var270.field241 = var263;
                                var262 = null;
                                break;
                            }
                        } else if (var262.equals(var270.field248)) {
                            if (var270.field245 != var264) {
                                boolean var271 = true;
                                for (class39 var272 = (class39) field317.method3505(); var272 != null; var272 = (class39) field317.method3506()) {
                                    if (var272.field876.equals(var262)) {
                                        if (var264 != 0 && var272.field875 == 0) {
                                            var272.method3635();
                                            var271 = false;
                                        } else if (var264 == 0 && var272.field875 != 0) {
                                            var272.method3635();
                                            var271 = false;
                                        }
                                    }
                                }
                                if (var271) {
                                    field317.method3504(new class39(var262, var264));
                                }
                                var270.field245 = var264;
                            }
                            var270.field241 = var263;
                            var270.field238 = var265;
                            var270.field239 = var267;
                            var270.field240 = var268;
                            var262 = null;
                            break;
                        }
                    }
                    if (var262 != null && field500 < 400) {
                        class18 var273 = new class18();
                        field549[field500] = var273;
                        var273.field248 = var262;
                        var273.field241 = var263;
                        var273.field245 = var264;
                        var273.field238 = var265;
                        var273.field239 = var267;
                        var273.field240 = var268;
                        field500++;
                    }
                }
                field545 = 2;
                field471 = field463;
                boolean var274 = false;
                int var275 = field500;
                while (var275 > 0) {
                    boolean var276 = true;
                    var275--;
                    for (int var277 = 0; var277 < var275; var277++) {
                        boolean var278 = false;
                        class18 var279 = field549[var277];
                        class18 var280 = field549[var277 + 1];
                        if (field552 != var279.field245 && field552 == var280.field245) {
                            var278 = true;
                        }
                        if (!var278 && var279.field245 == 0 && var280.field245 != 0) {
                            var278 = true;
                        }
                        if (!var278 && !var279.field239 && var280.field239) {
                            var278 = true;
                        }
                        if (!var278 && !var279.field240 && var280.field240) {
                            var278 = true;
                        }
                        if (var278) {
                            class18 var281 = field549[var277];
                            field549[var277] = field549[var277 + 1];
                            field549[var277 + 1] = var281;
                            var276 = false;
                        }
                    }
                    if (var276) {
                        break;
                    }
                }
                field327 = -1;
                return true;
            }
            if (field327 == 192) {
                int var282 = field325.method2372();
                int var283 = field325.method2380();
                class174 var284 = class174.method634(var283);
                if (var284.field2789 != 1 || var284.field2831 != var282) {
                    var284.field2789 = 1;
                    var284.field2831 = var282;
                    method687(var284);
                }
                field327 = -1;
                return true;
            }
            if (field327 == 7) {
                int var285 = field325.method2338();
                if (field325.method2338() == 0) {
                    field389[var285] = new class221();
                    field325.field2006 += 18;
                } else {
                    field325.field2006--;
                    field389[var285] = new class221(field325, false);
                }
                field439 = field463;
                field327 = -1;
                return true;
            }
            if (field327 == 234) {
                Statics.field1047 = field325.method2459();
                Statics.field2090 = field325.method2459();
                field327 = -1;
                return true;
            }
            if (field327 == 231) {
                int var286 = field325.method2379();
                int var287 = field325.method2380();
                int var288 = var286 >> 10 & 0x1F;
                int var289 = var286 >> 5 & 0x1F;
                int var290 = var286 & 0x1F;
                int var291 = (var290 << 3) + (var288 << 19) + (var289 << 11);
                class174 var292 = class174.method634(var287);
                if (var292.field2791 != var291) {
                    var292.field2791 = var291;
                    method687(var292);
                }
                field327 = -1;
                return true;
            }
            if (field327 == 152) {
                int var293 = field325.method2372();
                byte var294 = field325.method2530();
                class177.field2919[var293] = var294;
                if (class177.field2921[var293] != var294) {
                    class177.field2921[var293] = var294;
                }
                method1049(var293);
                field464[++field465 - 1 & 0x1F] = var293;
                field327 = -1;
                return true;
            }
            if (field327 == 58) {
                int var295 = field325.method2372();
                int var296 = field325.method2380();
                class174 var297 = class174.method634(var296);
                if (var297 != null && var297.field2768 == 0) {
                    if (var295 > var297.field2859 - var297.field2782) {
                        var295 = var297.field2859 - var297.field2782;
                    }
                    if (var295 < 0) {
                        var295 = 0;
                    }
                    if (var297.field2788 != var295) {
                        var297.field2788 = var295;
                        method687(var297);
                    }
                }
                field327 = -1;
                return true;
            }
            if (field327 == 164) {
                int var298 = field325.method2381();
                class174 var299 = class174.method634(var298);
                var299.field2789 = 3;
                var299.field2831 = Statics.field1882.field35.method3262();
                method687(var299);
                field327 = -1;
                return true;
            }
            if (field327 == 38) {
                int var300 = field325.method2382();
                boolean var301 = field325.method2459() == 1;
                class174 var302 = class174.method634(var300);
                if (var302.field2774 != var301) {
                    var302.field2774 = var301;
                    method687(var302);
                }
                field327 = -1;
                return true;
            }
            if (field327 == 151) {
                field513 = field325.method2338();
                if (field513 == 255) {
                    field513 = 0;
                }
                field514 = field325.method2338();
                if (field514 == 255) {
                    field514 = 0;
                }
                field327 = -1;
                return true;
            }
            class149.method1942("" + field327 + class2.field18 + field331 + class2.field18 + field332 + class2.field18 + field326, (Throwable) null);
            method167();
        } catch (IOException var315) {
            method2288();
        } catch (Exception var316) {
            String var305 = "" + field327 + class2.field18 + field331 + class2.field18 + field332 + class2.field18 + field326 + class2.field18 + (Statics.field595 + Statics.field1882.field867[0]) + class2.field18 + (Statics.field1982 + Statics.field1882.field864[0]) + class2.field18;
            for (int var306 = 0; var306 < field326 && var306 < 50; var306++) {
                var305 = var305 + field325.field2008[var306] + class2.field18;
            }
            class149.method1942(var305, var316);
            method167();
        }
        return true;
    }

    @ObfuscatedName("cx.br(I)V")
    public static final void method2135() {
        if (field327 == 18) {
            int var0 = field325.method2366();
            int var1 = var0 >> 2;
            int var2 = var0 & 0x3;
            int var3 = field344[var1];
            int var4 = field325.method2338();
            int var5 = (var4 >> 4 & 0x7) + Statics.field2090;
            int var6 = (var4 & 0x7) + Statics.field1047;
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                method2660(Statics.field582, var5, var6, var3, -1, var1, var2, 0, -1);
            }
        } else if (field327 == 97) {
            int var7 = field325.method2372();
            int var8 = field325.method2459();
            int var9 = (var8 >> 4 & 0x7) + Statics.field2090;
            int var10 = (var8 & 0x7) + Statics.field1047;
            if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
                class200 var11 = field346[Statics.field582][var9][var10];
                if (var11 != null) {
                    for (class29 var12 = (class29) var11.method3553(); var12 != null; var12 = (class29) var11.method3558()) {
                        if ((var7 & 0x7FFF) == var12.field687) {
                            var12.method3639();
                            break;
                        }
                    }
                    if (var11.method3553() == null) {
                        field346[Statics.field582][var9][var10] = null;
                    }
                    method156(var9, var10);
                }
            }
        } else if (field327 == 78) {
            int var13 = field325.method2459();
            int var14 = var13 >> 2;
            int var15 = var13 & 0x3;
            int var16 = field344[var14];
            int var17 = field325.method2379();
            int var18 = field325.method2338();
            int var19 = (var18 >> 4 & 0x7) + Statics.field2090;
            int var20 = (var18 & 0x7) + Statics.field1047;
            if (var19 >= 0 && var20 >= 0 && var19 < 103 && var20 < 103) {
                if (var16 == 0) {
                    class88 var21 = Statics.field340.method1855(Statics.field582, var19, var20);
                    if (var21 != null) {
                        int var22 = var21.field1536 >> 14 & 0x7FFF;
                        if (var14 == 2) {
                            var21.field1543 = new class13(var22, 2, var15 + 4, Statics.field582, var19, var20, var17, false, var21.field1543);
                            var21.field1544 = new class13(var22, 2, var15 + 1 & 0x3, Statics.field582, var19, var20, var17, false, var21.field1544);
                        } else {
                            var21.field1543 = new class13(var22, var14, var15, Statics.field582, var19, var20, var17, false, var21.field1543);
                        }
                    }
                }
                if (var16 == 1) {
                    class95 var23 = Statics.field340.method1793(Statics.field582, var19, var20);
                    if (var23 != null) {
                        int var24 = var23.field1620 >> 14 & 0x7FFF;
                        if (var14 == 4 || var14 == 5) {
                            var23.field1618 = new class13(var24, 4, var15, Statics.field582, var19, var20, var17, false, var23.field1618);
                        } else if (var14 == 6) {
                            var23.field1618 = new class13(var24, 4, var15 + 4, Statics.field582, var19, var20, var17, false, var23.field1618);
                        } else if (var14 == 7) {
                            var23.field1618 = new class13(var24, 4, (var15 + 2 & 0x3) + 4, Statics.field582, var19, var20, var17, false, var23.field1618);
                        } else if (var14 == 8) {
                            var23.field1618 = new class13(var24, 4, var15 + 4, Statics.field582, var19, var20, var17, false, var23.field1618);
                            var23.field1623 = new class13(var24, 4, (var15 + 2 & 0x3) + 4, Statics.field582, var19, var20, var17, false, var23.field1623);
                        }
                    }
                }
                if (var16 == 2) {
                    class99 var25 = Statics.field340.method1794(Statics.field582, var19, var20);
                    if (var14 == 11) {
                        var14 = 10;
                    }
                    if (var25 != null) {
                        var25.field1673 = new class13(var25.field1669 >> 14 & 0x7FFF, var14, var15, Statics.field582, var19, var20, var17, false, var25.field1673);
                    }
                }
                if (var16 == 3) {
                    class94 var26 = Statics.field340.method1777(Statics.field582, var19, var20);
                    if (var26 != null) {
                        var26.field1602 = new class13(var26.field1603 >> 14 & 0x7FFF, 22, var15, Statics.field582, var19, var20, var17, false, var26.field1602);
                    }
                }
            }
        } else {
            if (field327 == 83) {
                int var27 = field325.method2373();
                int var28 = field325.method2364();
                int var29 = (var28 >> 4 & 0x7) + Statics.field2090;
                int var30 = (var28 & 0x7) + Statics.field1047;
                byte var31 = field325.method2367();
                byte var32 = field325.method2368();
                int var33 = field325.method2459();
                int var34 = var33 >> 2;
                int var35 = var33 & 0x3;
                int var36 = field344[var34];
                int var37 = field325.method2372();
                byte var38 = field325.method2368();
                byte var39 = field325.method2530();
                int var40 = field325.method2430();
                int var41 = field325.method2373();
                class3 var42;
                if (field292 == var37) {
                    var42 = Statics.field1882;
                } else {
                    var42 = field492[var37];
                }
                if (var42 != null) {
                    class41 var43 = class41.method118(var41);
                    int var44;
                    int var45;
                    if (var35 == 1 || var35 == 3) {
                        var44 = var43.field967;
                        var45 = var43.field940;
                    } else {
                        var44 = var43.field940;
                        var45 = var43.field967;
                    }
                    int var46 = (var44 >> 1) + var29;
                    int var47 = (var44 + 1 >> 1) + var29;
                    int var48 = (var45 >> 1) + var30;
                    int var49 = (var45 + 1 >> 1) + var30;
                    int[][] var50 = class6.field94[Statics.field582];
                    int var51 = var50[var46][var48] + var50[var47][var48] + var50[var46][var49] + var50[var47][var49] >> 2;
                    int var52 = (var29 << 7) + (var44 << 6);
                    int var53 = (var30 << 7) + (var45 << 6);
                    class106 var54 = var43.method760(var34, var35, var50, var52, var51, var53);
                    if (var54 != null) {
                        method2660(Statics.field582, var29, var30, var36, -1, 0, 0, var27 + 1, var40 + 1);
                        var42.field52 = field336 + var27;
                        var42.field57 = field336 + var40;
                        var42.field55 = var54;
                        var42.field45 = var29 * 128 + var44 * 64;
                        var42.field47 = var30 * 128 + var45 * 64;
                        var42.field46 = var51;
                        if (var38 > var31) {
                            byte var55 = var38;
                            var38 = var31;
                            var31 = var55;
                        }
                        if (var39 > var32) {
                            byte var56 = var39;
                            var39 = var32;
                            var32 = var56;
                        }
                        var42.field49 = var29 + var38;
                        var42.field48 = var29 + var31;
                        var42.field39 = var30 + var39;
                        var42.field34 = var30 + var32;
                    }
                }
            }
            if (field327 == 239) {
                int var57 = field325.method2338();
                int var58 = (var57 >> 4 & 0x7) + Statics.field2090;
                int var59 = (var57 & 0x7) + Statics.field1047;
                int var60 = field325.method2430();
                int var61 = field325.method2338();
                int var62 = field325.method2430();
                if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                    int var63 = var58 * 128 + 64;
                    int var64 = var59 * 128 + 64;
                    class30 var65 = new class30(var60, Statics.field582, var63, var64, method2223(var63, var64, Statics.field582) - var61, var62, field336);
                    field414.method3548(var65);
                }
            } else if (field327 == 199) {
                int var66 = field325.method2364();
                int var67 = (var66 >> 4 & 0x7) + Statics.field2090;
                int var68 = (var66 & 0x7) + Statics.field1047;
                int var69 = field325.method2430();
                int var70 = field325.method2379();
                if (var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104) {
                    class29 var71 = new class29();
                    var71.field687 = var69;
                    var71.field681 = var70;
                    if (field346[Statics.field582][var67][var68] == null) {
                        field346[Statics.field582][var67][var68] = new class200();
                    }
                    field346[Statics.field582][var67][var68].method3548(var71);
                    method156(var67, var68);
                }
            } else if (field327 == 140) {
                int var72 = field325.method2338();
                int var73 = (var72 >> 4 & 0x7) + Statics.field2090;
                int var74 = (var72 & 0x7) + Statics.field1047;
                int var75 = var73 + field325.method2339();
                int var76 = var74 + field325.method2339();
                int var77 = field325.method2341();
                int var78 = field325.method2430();
                int var79 = field325.method2338() * 4;
                int var80 = field325.method2338() * 4;
                int var81 = field325.method2430();
                int var82 = field325.method2430();
                int var83 = field325.method2338();
                int var84 = field325.method2338();
                if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104 && var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104 && var78 != 65535) {
                    int var85 = var73 * 128 + 64;
                    int var86 = var74 * 128 + 64;
                    int var87 = var75 * 128 + 64;
                    int var88 = var76 * 128 + 64;
                    class7 var89 = new class7(var78, Statics.field582, var85, var86, method2223(var85, var86, Statics.field582) - var79, field336 + var81, field336 + var82, var83, var84, var77, var80);
                    var89.method91(var87, var88, method2223(var87, var88, Statics.field582) - var80, field336 + var81);
                    field415.method3548(var89);
                }
            } else if (field327 == 49) {
                int var90 = field325.method2366();
                int var91 = var90 >> 2;
                int var92 = var90 & 0x3;
                int var93 = field344[var91];
                int var94 = field325.method2373();
                int var95 = field325.method2338();
                int var96 = (var95 >> 4 & 0x7) + Statics.field2090;
                int var97 = (var95 & 0x7) + Statics.field1047;
                if (var96 >= 0 && var97 >= 0 && var96 < 104 && var97 < 104) {
                    method2660(Statics.field582, var96, var97, var93, var94, var91, var92, 0, -1);
                }
            } else {
                if (field327 == 223) {
                    int var98 = field325.method2338();
                    int var99 = (var98 >> 4 & 0x7) + Statics.field2090;
                    int var100 = (var98 & 0x7) + Statics.field1047;
                    int var101 = field325.method2430();
                    int var102 = field325.method2338();
                    int var103 = var102 >> 4 & 0xF;
                    int var104 = var102 & 0x7;
                    int var105 = field325.method2338();
                    if (var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104) {
                        int var106 = var103 + 1;
                        if (Statics.field1882.field867[0] >= var99 - var106 && Statics.field1882.field867[0] <= var99 + var106 && Statics.field1882.field864[0] >= var100 - var106 && Statics.field1882.field864[0] <= var100 + var106 && field521 != 0 && var104 > 0 && field522 < 50) {
                            field538[field522] = var101;
                            field524[field522] = var104;
                            field525[field522] = var105;
                            field527[field522] = null;
                            field408[field522] = (var99 << 16) + (var100 << 8) + var103;
                            field522++;
                        }
                    }
                }
                if (field327 == 54) {
                    int var107 = field325.method2338();
                    int var108 = (var107 >> 4 & 0x7) + Statics.field2090;
                    int var109 = (var107 & 0x7) + Statics.field1047;
                    int var110 = field325.method2430();
                    int var111 = field325.method2430();
                    int var112 = field325.method2430();
                    if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                        class200 var113 = field346[Statics.field582][var108][var109];
                        if (var113 != null) {
                            for (class29 var114 = (class29) var113.method3553(); var114 != null; var114 = (class29) var113.method3558()) {
                                if ((var110 & 0x7FFF) == var114.field687 && var114.field681 == var111) {
                                    var114.field681 = var112;
                                    break;
                                }
                            }
                            method156(var108, var109);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ei.bi(IIIIIIIIIB)V")
    public static final void method2660(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field412.method3553(); var10 != null; var10 = (class17) field412.method3558()) {
            if (var10.field228 == arg0 && var10.field222 == arg1 && var10.field233 == arg2 && var10.field221 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field228 = arg0;
            var9.field221 = arg3;
            var9.field222 = arg1;
            var9.field233 = arg2;
            method2907(var9);
            field412.method3548(var9);
        }
        var9.field224 = arg4;
        var9.field220 = arg5;
        var9.field225 = arg6;
        var9.field229 = arg7;
        var9.field231 = arg8;
    }

    @ObfuscatedName("ea.bh(Lh;I)V")
    public static final void method2907(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field221 == 0) {
            var1 = Statics.field340.method1839(arg0.field228, arg0.field222, arg0.field233);
        }
        if (arg0.field221 == 1) {
            var1 = Statics.field340.method1797(arg0.field228, arg0.field222, arg0.field233);
        }
        if (arg0.field221 == 2) {
            var1 = Statics.field340.method1819(arg0.field228, arg0.field222, arg0.field233);
        }
        if (arg0.field221 == 3) {
            var1 = Statics.field340.method1799(arg0.field228, arg0.field222, arg0.field233);
        }
        if (var1 != 0) {
            int var5 = Statics.field340.method1800(arg0.field228, arg0.field222, arg0.field233, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field230 = var2;
        arg0.field226 = var3;
        arg0.field223 = var4;
    }

    @ObfuscatedName("aa.bv(IIIIIIII)V")
    public static final void method716(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field494 && Statics.field582 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field340.method1839(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field340.method1797(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field340.method1819(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field340.method1799(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field340.method1800(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field340.method1775(arg0, arg2, arg3);
                class41 var15 = class41.method118(var12);
                if (var15.field942 != 0) {
                    field341[arg0].method2260(arg2, arg3, var13, var14, var15.field964);
                }
            }
            if (arg1 == 1) {
                Statics.field340.method1788(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field340.method1789(arg0, arg2, arg3);
                class41 var16 = class41.method118(var12);
                if (var16.field940 + arg2 > 103 || var16.field940 + arg3 > 103 || var16.field967 + arg2 > 103 || var16.field967 + arg3 > 103) {
                    return;
                }
                if (var16.field942 != 0) {
                    field341[arg0].method2231(arg2, arg3, var16.field940, var16.field967, var14, var16.field964);
                }
            }
            if (arg1 == 3) {
                Statics.field340.method1790(arg0, arg2, arg3);
                class41 var17 = class41.method118(var12);
                if (var17.field942 == 1) {
                    field341[arg0].method2233(arg2, arg3);
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
        class6.method152(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field340, field341[arg0]);
    }

    @ObfuscatedName("i.bx(IIB)V")
    public static final void method156(int arg0, int arg1) {
        class200 var2 = field346[Statics.field582][arg0][arg1];
        if (var2 == null) {
            Statics.field340.method1871(Statics.field582, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3553(); var6 != null; var6 = (class29) var2.method3558()) {
            class52 var7 = class52.method126(var6.field687);
            long var8 = (long) var7.field1112;
            if (var7.field1128 == 1) {
                var8 = (long) (var6.field681 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field340.method1871(Statics.field582, arg0, arg1);
            return;
        }
        var2.method3549(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3553(); var12 != null; var12 = (class29) var2.method3558()) {
            if (var5.field687 != var12.field687) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field687 != var12.field687 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field340.method1792(Statics.field582, arg0, arg1, method2223(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field582), var5, var13, var10, var11);
    }

    @ObfuscatedName("dm.ba(ZB)V")
    public static final void method2139(boolean arg0) {
        field404 = 0;
        field320 = 0;
        field325.method2585();
        int var1 = field325.method2596(8);
        if (var1 < field318) {
            for (int var2 = var1; var2 < field318; var2++) {
                field405[++field404 - 1] = field319[var2];
            }
        }
        if (var1 > field318) {
            throw new RuntimeException("");
        }
        field318 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field319[var3];
            class35 var5 = field516[var4];
            int var6 = field325.method2596(1);
            if (var6 == 0) {
                field319[++field318 - 1] = var4;
                var5.field865 = field336;
            } else {
                int var7 = field325.method2596(2);
                if (var7 == 0) {
                    field319[++field318 - 1] = var4;
                    var5.field865 = field336;
                    field321[++field320 - 1] = var4;
                } else if (var7 == 1) {
                    field319[++field318 - 1] = var4;
                    var5.field865 = field336;
                    int var8 = field325.method2596(3);
                    var5.method685(var8, (byte) 1);
                    int var9 = field325.method2596(1);
                    if (var9 == 1) {
                        field321[++field320 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field319[++field318 - 1] = var4;
                    var5.field865 = field336;
                    int var10 = field325.method2596(3);
                    var5.method685(var10, (byte) 2);
                    int var11 = field325.method2596(3);
                    var5.method685(var11, (byte) 2);
                    int var12 = field325.method2596(1);
                    if (var12 == 1) {
                        field321[++field320 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field405[++field404 - 1] = var4;
                }
            }
        }
        method627(arg0);
        for (int var13 = 0; var13 < field320; var13++) {
            int var14 = field321[var13];
            class35 var15 = field516[var14];
            int var16 = field325.method2338();
            if ((var16 & 0x20) != 0) {
                int var17 = field325.method2372();
                int var18 = field325.method2372();
                int var19 = var15.field824 - (var17 - Statics.field595 - Statics.field595) * 64;
                int var20 = var15.field814 - (var18 - Statics.field1982 - Statics.field1982) * 64;
                if (var19 != 0 || var20 != 0) {
                    var15.field825 = (int) (Math.atan2((double) var19, (double) var20) * 325.949D) & 0x7FF;
                }
            }
            if ((var16 & 0x2) != 0) {
                var15.field783 = class40.method2038(field325.method2373());
                var15.field873 = var15.field783.field888;
                var15.field853 = var15.field783.field896;
                var15.field821 = var15.field783.field895;
                var15.field822 = var15.field783.field910;
                var15.field848 = var15.field783.field893;
                var15.field856 = var15.field783.field898;
                var15.field818 = var15.field783.field915;
                var15.field861 = var15.field783.field900;
                var15.field840 = var15.field783.field894;
            }
            if ((var16 & 0x40) != 0) {
                int var21 = field325.method2338();
                int var22 = field325.method2338();
                var15.method709(var21, var22, field336);
                var15.field868 = field336 + 300;
                var15.field847 = field325.method2430();
                var15.field836 = field325.method2372();
            }
            if ((var16 & 0x10) != 0) {
                int var23 = field325.method2366();
                int var24 = field325.method2364();
                var15.method709(var23, var24, field336);
                var15.field868 = field336 + 300;
                var15.field847 = field325.method2372();
                var15.field836 = field325.method2379();
            }
            if ((var16 & 0x4) != 0) {
                var15.field849 = field325.method2373();
                int var25 = field325.method2343();
                var15.field860 = var25 >> 16;
                var15.field826 = (var25 & 0xFFFF) + field336;
                var15.field850 = 0;
                var15.field823 = 0;
                if (var15.field826 > field336) {
                    var15.field850 = -1;
                }
                if (var15.field849 == 65535) {
                    var15.field849 = -1;
                }
            }
            if ((var16 & 0x8) != 0) {
                var15.field838 = field325.method2430();
                if (var15.field838 == 65535) {
                    var15.field838 = -1;
                }
            }
            if ((var16 & 0x80) != 0) {
                int var26 = field325.method2379();
                if (var26 == 65535) {
                    var26 = -1;
                }
                int var27 = field325.method2338();
                if (var15.field844 == var26 && var26 != -1) {
                    int var28 = class43.method43(var26).field989;
                    if (var28 == 1) {
                        var15.field845 = 0;
                        var15.field846 = 0;
                        var15.field852 = var27;
                        var15.field827 = 0;
                    }
                    if (var28 == 2) {
                        var15.field827 = 0;
                    }
                } else if (var26 == -1 || var15.field844 == -1 || class43.method43(var26).field994 >= class43.method43(var15.field844).field994) {
                    var15.field844 = var26;
                    var15.field845 = 0;
                    var15.field846 = 0;
                    var15.field852 = var27;
                    var15.field827 = 0;
                    var15.field871 = var15.field842;
                }
            }
            if ((var16 & 0x1) != 0) {
                var15.field820 = field325.method2346();
                var15.field829 = 100;
            }
        }
        for (int var29 = 0; var29 < field404; var29++) {
            int var30 = field405[var29];
            if (field336 != field516[var30].field865) {
                field516[var30].field783 = null;
                field516[var30] = null;
            }
        }
        if (field326 != field325.field2006) {
            throw new RuntimeException(field325.field2006 + class2.field18 + field326);
        }
        for (int var31 = 0; var31 < field318; var31++) {
            if (field516[field319[var31]] == null) {
                throw new RuntimeException(var31 + class2.field18 + field318);
            }
        }
    }

    @ObfuscatedName("ad.bs(ZI)V")
    public static final void method627(boolean arg0) {
        while (true) {
            if (field325.method2587(field326) >= 27) {
                int var1 = field325.method2596(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field516[var1] == null) {
                        field516[var1] = new class35();
                        var2 = true;
                    }
                    class35 var3 = field516[var1];
                    field319[++field318 - 1] = var1;
                    var3.field865 = field336;
                    int var4;
                    if (arg0) {
                        var4 = field325.method2596(8);
                        if (var4 > 127) {
                            var4 -= 256;
                        }
                    } else {
                        var4 = field325.method2596(5);
                        if (var4 > 15) {
                            var4 -= 32;
                        }
                    }
                    int var5 = field485[field325.method2596(3)];
                    if (var2) {
                        var3.field863 = var3.field815 = var5;
                    }
                    int var6 = field325.method2596(1);
                    int var7 = field325.method2596(1);
                    if (var7 == 1) {
                        field321[++field320 - 1] = var1;
                    }
                    int var8;
                    if (arg0) {
                        var8 = field325.method2596(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = field325.method2596(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    var3.field783 = class40.method2038(field325.method2596(14));
                    var3.field873 = var3.field783.field888;
                    var3.field853 = var3.field783.field896;
                    if (var3.field853 == 0) {
                        var3.field815 = 0;
                    }
                    var3.field821 = var3.field783.field895;
                    var3.field822 = var3.field783.field910;
                    var3.field848 = var3.field783.field893;
                    var3.field856 = var3.field783.field898;
                    var3.field818 = var3.field783.field915;
                    var3.field861 = var3.field783.field900;
                    var3.field840 = var3.field783.field894;
                    var3.method686(Statics.field1882.field867[0] + var4, Statics.field1882.field864[0] + var8, var6 == 1);
                    continue;
                }
            }
            field325.method2586();
            return;
        }
    }

    @ObfuscatedName("ab.bg(III)V")
    public static final void method610(int arg0, int arg1) {
        if (field497 < 2 && field431 == 0 && !field433) {
            return;
        }
        String var2;
        if (field431 == 1 && field497 < 2) {
            var2 = class158.field2467 + class158.field2477 + field432 + " " + class2.field31;
        } else if (field433 && field497 < 2) {
            var2 = field436 + class158.field2477 + field437 + " " + class2.field31;
        } else {
            int var3 = field497 - 1;
            String var4;
            if (field426[var3].length() > 0) {
                var4 = field425[var3] + class158.field2477 + field426[var3];
            } else {
                var4 = field425[var3];
            }
            var2 = var4;
        }
        if (field497 > 2) {
            var2 = var2 + class2.method158(16777215) + " " + '/' + " " + (field497 - 2) + class158.field2471;
        }
        Statics.field2666.method3750(var2, arg0 + 4, arg1 + 15, 16777215, 0, field336 / 1000);
    }

    @ObfuscatedName("d.bn(IIIIB)V")
    public static final void method42(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field481; var4++) {
            if (field486[var4] + field478[var4] > arg0 && field486[var4] < arg0 + arg2 && field489[var4] + field487[var4] > arg1 && field487[var4] < arg1 + arg3) {
                field483[var4] = true;
            }
        }
    }

    @ObfuscatedName("k.be(IIIII)V")
    public static final void method114(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field481; var4++) {
            if (field486[var4] + field478[var4] > arg0 && field486[var4] < arg0 + arg2 && field489[var4] + field487[var4] > arg1 && field487[var4] < arg1 + arg3) {
                field484[var4] = true;
            }
        }
    }

    @ObfuscatedName("t.bz(I)V")
    public static final void method138() {
        method1456();
        if (Statics.field627 != null || field451 != null) {
            return;
        }
        int var12;
        int var13;
        label195: {
            int var0 = class141.field2160;
            if (field419) {
                if (var0 != 1 && (Statics.field1564 || var0 != 4)) {
                    int var1 = class141.field2163;
                    int var2 = class141.field2164;
                    if (var1 < Statics.field883 - 10 || var1 > Statics.field883 + Statics.field2750 + 10 || var2 < Statics.field137 - 10 || var2 > Statics.field137 + Statics.field1 + 10) {
                        field419 = false;
                        method42(Statics.field883, Statics.field137, Statics.field2750, Statics.field1);
                    }
                }
                if (var0 == 1 || !Statics.field1564 && var0 == 4) {
                    int var3 = Statics.field883;
                    int var4 = Statics.field137;
                    int var5 = Statics.field2750;
                    int var6 = class141.field2170;
                    int var7 = class141.field2171;
                    int var8 = -1;
                    for (int var9 = 0; var9 < field497; var9++) {
                        int var10 = (field497 - 1 - var9) * 15 + var4 + 31;
                        if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                            var8 = var9;
                        }
                    }
                    if (var8 != -1) {
                        method2915(var8);
                    }
                    field419 = false;
                    method42(Statics.field883, Statics.field137, Statics.field2750, Statics.field1);
                }
            } else {
                if ((var0 == 1 || !Statics.field1564 && var0 == 4) && field497 > 0) {
                    int var11 = field423[field497 - 1];
                    if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                        var12 = field421[field497 - 1];
                        var13 = field422[field497 - 1];
                        class174 var14 = class174.method634(var13);
                        int var15 = method942(var14);
                        boolean var16 = (var15 >> 28 & 0x1) != 0;
                        if (var16) {
                            break label195;
                        }
                        class179 var10000 = (class179) null;
                        if (class179.method914(method942(var14))) {
                            break label195;
                        }
                    }
                }
                if ((var0 == 1 || !Statics.field1564 && var0 == 4) && (field546 == 1 && field497 > 2 || method681(field497 - 1))) {
                    var0 = 2;
                }
                if ((var0 == 1 || !Statics.field1564 && var0 == 4) && field497 > 0) {
                    method2915(field497 - 1);
                }
                if (var0 == 2 && field497 > 0) {
                    method752(class141.field2170, class141.field2171);
                }
            }
            return;
        }
        if (Statics.field627 != null && !field398 && field546 != 1 && !method681(field497 - 1) && field497 > 0) {
            int var17 = field395;
            int var18 = field396;
            class31 var19 = Statics.field232;
            method166(var19.field714, var19.field705, var19.field706, var19.field712, var19.field704, var19.field704, var17, var18);
            Statics.field232 = null;
        }
        field398 = false;
        field418 = 0;
        if (Statics.field627 != null) {
            method687(Statics.field627);
        }
        Statics.field627 = class174.method634(var13);
        field360 = var12;
        field395 = class141.field2170;
        field396 = class141.field2171;
        if (field497 > 0) {
            method953(field497 - 1);
        }
        method687(Statics.field627);
    }

    @ObfuscatedName("aq.bb(III)V")
    public static final void method752(int arg0, int arg1) {
        int var2 = Statics.field2666.method3738(class158.field2470);
        for (int var3 = 0; var3 < field497; var3++) {
            class225 var4 = Statics.field2666;
            String var5;
            if (field426[var3].length() > 0) {
                var5 = field425[var3] + class158.field2477 + field426[var3];
            } else {
                var5 = field425[var3];
            }
            int var6 = var4.method3738(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field497 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field215) {
            var8 = Statics.field215 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field216) {
            var9 = Statics.field216 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field419 = true;
        Statics.field883 = var8;
        Statics.field137 = var9;
        Statics.field2750 = var2;
        Statics.field1 = field497 * 15 + 22;
    }

    @ObfuscatedName("ao.by(IS)Z")
    public static final boolean method681(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field423[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("ej.bc(II)V")
    public static final void method2915(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field421[arg0];
        int var2 = field422[arg0];
        int var3 = field423[arg0];
        int var4 = field379[arg0];
        String var5 = field425[arg0];
        String var6 = field426[arg0];
        method166(var1, var2, var3, var4, var5, var6, class141.field2170, class141.field2171);
    }

    @ObfuscatedName("r.bu(IIIILjava/lang/String;Ljava/lang/String;IIS)V")
    public static final void method166(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 41) {
            field323.method2583(54);
            field323.method2377(arg1);
            field323.method2371(arg3);
            field323.method2507(arg0);
            field392 = 0;
            Statics.field275 = class174.method634(arg1);
            field407 = arg0;
        }
        if (arg2 == 24) {
            class174 var8 = class174.method634(arg1);
            boolean var9 = true;
            if (var8.field2888 > 0) {
                var9 = method871(var8);
            }
            if (var9) {
                field323.method2583(69);
                field323.method2326(arg1);
            }
        }
        if (arg2 == 25) {
            class174 var10 = class174.method912(arg1, arg0);
            if (var10 != null) {
                method566();
                int var13 = method942(var10);
                int var14 = var13 >> 11 & 0x3F;
                method815(arg1, arg0, var14, var10.field2886);
                field431 = 0;
                int var15 = method942(var10);
                int var16 = var15 >> 11 & 0x3F;
                String var17;
                if (var16 == 0) {
                    var17 = null;
                } else if (var10.field2845 == null || var10.field2845.trim().length() == 0) {
                    var17 = null;
                } else {
                    var17 = var10.field2845;
                }
                field436 = var17;
                if (field436 == null) {
                    field436 = "Null";
                }
                if (var10.field2765) {
                    field437 = var10.field2790 + class2.method158(16777215);
                } else {
                    field437 = class2.method158(65280) + var10.field2882 + class2.method158(16777215);
                }
            }
            return;
        }
        if (arg2 == 10) {
            class35 var18 = field516[arg3];
            if (var18 != null) {
                field388 = arg6;
                field540 = arg7;
                field391 = 2;
                field390 = 0;
                field513 = arg0;
                field514 = arg1;
                field323.method2583(190);
                field323.method2436(class138.field2121[82] ? 1 : 0);
                field323.method2403(arg3);
            }
        }
        if (arg2 == 30 && field442 == null) {
            method56(arg1, arg0);
            field442 = class174.method912(arg1, arg0);
            method687(field442);
        }
        if (arg2 == 47) {
            class3 var19 = field492[arg3];
            if (var19 != null) {
                field388 = arg6;
                field540 = arg7;
                field391 = 2;
                field390 = 0;
                field513 = arg0;
                field514 = arg1;
                field323.method2583(128);
                field323.method2507(arg3);
                field323.method2527(class138.field2121[82] ? 1 : 0);
            }
        }
        if (arg2 == 6) {
            field388 = arg6;
            field540 = arg7;
            field391 = 2;
            field390 = 0;
            field513 = arg0;
            field514 = arg1;
            field323.method2583(35);
            field323.method2403(Statics.field595 + arg0);
            field323.method2371(arg3 >> 14 & 0x7FFF);
            field323.method2403(Statics.field1982 + arg1);
            field323.method2323(class138.field2121[82] ? 1 : 0);
        }
        if (arg2 == 1004) {
            field388 = arg6;
            field540 = arg7;
            field391 = 2;
            field390 = 0;
            field323.method2583(70);
            field323.method2470(arg3);
        }
        if (arg2 == 15) {
            class3 var20 = field492[arg3];
            if (var20 != null) {
                field388 = arg6;
                field540 = arg7;
                field391 = 2;
                field390 = 0;
                field513 = arg0;
                field514 = arg1;
                field323.method2583(243);
                field323.method2323(class138.field2121[82] ? 1 : 0);
                field323.method2507(field308);
                field323.method2470(arg3);
                field323.method2340(Statics.field2614);
            }
        }
        if (arg2 == 31) {
            field323.method2583(78);
            field323.method2377(Statics.field3128);
            field323.method2403(Statics.field2658);
            field323.method2340(arg1);
            field323.method2403(Statics.field641);
            field323.method2371(arg3);
            field323.method2470(arg0);
            field392 = 0;
            Statics.field275 = class174.method634(arg1);
            field407 = arg0;
        }
        if (arg2 == 58) {
            class174 var21 = class174.method912(arg1, arg0);
            if (var21 != null) {
                field323.method2583(216);
                field323.method2377(arg1);
                field323.method2507(var21.field2886);
                field323.method2470(arg0);
                field323.method2377(Statics.field2614);
                field323.method2371(field435);
                field323.method2371(field308);
            }
        }
        if (arg2 == 1) {
            field388 = arg6;
            field540 = arg7;
            field391 = 2;
            field390 = 0;
            field513 = arg0;
            field514 = arg1;
            field323.method2583(244);
            field323.method2403(Statics.field595 + arg0);
            field323.method2507(arg3 >> 14 & 0x7FFF);
            field323.method2377(Statics.field3128);
            field323.method2403(Statics.field641);
            field323.method2371(Statics.field2658);
            field323.method2436(class138.field2121[82] ? 1 : 0);
            field323.method2403(Statics.field1982 + arg1);
        }
        if (arg2 == 28) {
            field323.method2583(69);
            field323.method2326(arg1);
            class174 var22 = class174.method634(arg1);
            if (var22.field2810 != null && var22.field2810[0][0] == 5) {
                int var23 = var22.field2810[0][1];
                class177.field2921[var23] = 1 - class177.field2921[var23];
                method1049(var23);
            }
        }
        if (arg2 == 18) {
            field388 = arg6;
            field540 = arg7;
            field391 = 2;
            field390 = 0;
            field513 = arg0;
            field514 = arg1;
            field323.method2583(143);
            field323.method2470(Statics.field1982 + arg1);
            field323.method2507(arg3);
            field323.method2436(class138.field2121[82] ? 1 : 0);
            field323.method2507(Statics.field595 + arg0);
        }
        if (arg2 == 34) {
            field323.method2583(12);
            field323.method2507(arg0);
            field323.method2377(arg1);
            field323.method2507(arg3);
            field392 = 0;
            Statics.field275 = class174.method634(arg1);
            field407 = arg0;
        }
        if (arg2 == 50) {
            class3 var24 = field492[arg3];
            if (var24 != null) {
                field388 = arg6;
                field540 = arg7;
                field391 = 2;
                field390 = 0;
                field513 = arg0;
                field514 = arg1;
                field323.method2583(52);
                field323.method2371(arg3);
                field323.method2362(class138.field2121[82] ? 1 : 0);
            }
        }
        if (arg2 == 20) {
            field388 = arg6;
            field540 = arg7;
            field391 = 2;
            field390 = 0;
            field513 = arg0;
            field514 = arg1;
            field323.method2583(103);
            field323.method2403(arg3);
            field323.method2507(Statics.field595 + arg0);
            field323.method2403(Statics.field1982 + arg1);
            field323.method2323(class138.field2121[82] ? 1 : 0);
        }
        if (arg2 == 42) {
            field323.method2583(253);
            field323.method2433(arg1);
            field323.method2371(arg0);
            field323.method2507(arg3);
            field392 = 0;
            Statics.field275 = class174.method634(arg1);
            field407 = arg0;
        }
        if (arg2 == 44) {
            class3 var25 = field492[arg3];
            if (var25 != null) {
                field388 = arg6;
                field540 = arg7;
                field391 = 2;
                field390 = 0;
                field513 = arg0;
                field514 = arg1;
                field323.method2583(89);
                field323.method2436(class138.field2121[82] ? 1 : 0);
                field323.method2371(arg3);
            }
        }
        if (arg2 == 1003) {
            field388 = arg6;
            field540 = arg7;
            field391 = 2;
            field390 = 0;
            class35 var26 = field516[arg3];
            if (var26 != null) {
                class40 var27 = var26.field783;
                if (var27.field922 != null) {
                    var27 = var27.method720();
                }
                if (var27 != null) {
                    field323.method2583(177);
                    field323.method2403(var27.field887);
                }
            }
        }
        if (arg2 == 4) {
            field388 = arg6;
            field540 = arg7;
            field391 = 2;
            field390 = 0;
            field513 = arg0;
            field514 = arg1;
            field323.method2583(150);
            field323.method2470(Statics.field595 + arg0);
            field323.method2323(class138.field2121[82] ? 1 : 0);
            field323.method2470(arg3 >> 14 & 0x7FFF);
            field323.method2470(Statics.field1982 + arg1);
        }
        if (arg2 == 33) {
            field323.method2583(235);
            field323.method2403(arg0);
            field323.method2371(arg3);
            field323.method2326(arg1);
            field392 = 0;
            Statics.field275 = class174.method634(arg1);
            field407 = arg0;
        }
        if (arg2 == 3) {
            field388 = arg6;
            field540 = arg7;
            field391 = 2;
            field390 = 0;
            field513 = arg0;
            field514 = arg1;
            field323.method2583(241);
            field323.method2403(arg3 >> 14 & 0x7FFF);
            field323.method2507(Statics.field1982 + arg1);
            field323.method2527(class138.field2121[82] ? 1 : 0);
            field323.method2371(Statics.field595 + arg0);
        }
        if (arg2 == 22) {
            field388 = arg6;
            field540 = arg7;
            field391 = 2;
            field390 = 0;
            field513 = arg0;
            field514 = arg1;
            field323.method2583(40);
            field323.method2470(Statics.field595 + arg0);
            field323.method2527(class138.field2121[82] ? 1 : 0);
            field323.method2371(Statics.field1982 + arg1);
            field323.method2470(arg3);
        }
        if (arg2 == 39) {
            field323.method2583(247);
            field323.method2433(arg1);
            field323.method2507(arg3);
            field323.method2470(arg0);
            field392 = 0;
            Statics.field275 = class174.method634(arg1);
            field407 = arg0;
        }
        if (arg2 == 48) {
            class3 var28 = field492[arg3];
            if (var28 != null) {
                field388 = arg6;
                field540 = arg7;
                field391 = 2;
                field390 = 0;
                field513 = arg0;
                field514 = arg1;
                field323.method2583(3);
                field323.method2362(class138.field2121[82] ? 1 : 0);
                field323.method2507(arg3);
            }
        }
        if (arg2 == 40) {
            field323.method2583(13);
            field323.method2340(arg1);
            field323.method2371(arg0);
            field323.method2470(arg3);
            field392 = 0;
            Statics.field275 = class174.method634(arg1);
            field407 = arg0;
        }
        if (arg2 == 32) {
            field323.method2583(170);
            field323.method2371(arg3);
            field323.method2403(field308);
            field323.method2507(arg0);
            field323.method2433(arg1);
            field323.method2377(Statics.field2614);
            field392 = 0;
            Statics.field275 = class174.method634(arg1);
            field407 = arg0;
        }
        if (arg2 == 51) {
            class3 var29 = field492[arg3];
            if (var29 != null) {
                field388 = arg6;
                field540 = arg7;
                field391 = 2;
                field390 = 0;
                field513 = arg0;
                field514 = arg1;
                field323.method2583(222);
                field323.method2403(arg3);
                field323.method2436(class138.field2121[82] ? 1 : 0);
            }
        }
        if (arg2 == 11) {
            class35 var30 = field516[arg3];
            if (var30 != null) {
                field388 = arg6;
                field540 = arg7;
                field391 = 2;
                field390 = 0;
                field513 = arg0;
                field514 = arg1;
                field323.method2583(199);
                field323.method2362(class138.field2121[82] ? 1 : 0);
                field323.method2470(arg3);
            }
        }
        if (arg2 == 8) {
            class35 var31 = field516[arg3];
            if (var31 != null) {
                field388 = arg6;
                field540 = arg7;
                field391 = 2;
                field390 = 0;
                field513 = arg0;
                field514 = arg1;
                field323.method2583(226);
                field323.method2436(class138.field2121[82] ? 1 : 0);
                field323.method2403(field308);
                field323.method2403(arg3);
                field323.method2377(Statics.field2614);
            }
        }
        if (arg2 == 36) {
            field323.method2583(20);
            field323.method2340(arg1);
            field323.method2371(arg3);
            field323.method2403(arg0);
            field392 = 0;
            Statics.field275 = class174.method634(arg1);
            field407 = arg0;
        }
        if (arg2 == 7) {
            class35 var32 = field516[arg3];
            if (var32 != null) {
                field388 = arg6;
                field540 = arg7;
                field391 = 2;
                field390 = 0;
                field513 = arg0;
                field514 = arg1;
                field323.method2583(38);
                field323.method2371(Statics.field641);
                field323.method2362(class138.field2121[82] ? 1 : 0);
                field323.method2470(Statics.field2658);
                field323.method2470(arg3);
                field323.method2326(Statics.field3128);
            }
        }
        if (arg2 == 46) {
            class3 var33 = field492[arg3];
            if (var33 != null) {
                field388 = arg6;
                field540 = arg7;
                field391 = 2;
                field390 = 0;
                field513 = arg0;
                field514 = arg1;
                field323.method2583(248);
                field323.method2507(arg3);
                field323.method2362(class138.field2121[82] ? 1 : 0);
            }
        }
        if (arg2 == 17) {
            field388 = arg6;
            field540 = arg7;
            field391 = 2;
            field390 = 0;
            field513 = arg0;
            field514 = arg1;
            field323.method2583(118);
            field323.method2470(Statics.field1982 + arg1);
            field323.method2371(Statics.field595 + arg0);
            field323.method2340(Statics.field2614);
            field323.method2470(arg3);
            field323.method2436(class138.field2121[82] ? 1 : 0);
            field323.method2507(field308);
        }
        if (arg2 == 9) {
            class35 var34 = field516[arg3];
            if (var34 != null) {
                field388 = arg6;
                field540 = arg7;
                field391 = 2;
                field390 = 0;
                field513 = arg0;
                field514 = arg1;
                field323.method2583(41);
                field323.method2371(arg3);
                field323.method2362(class138.field2121[82] ? 1 : 0);
            }
        }
        if (arg2 == 21) {
            field388 = arg6;
            field540 = arg7;
            field391 = 2;
            field390 = 0;
            field513 = arg0;
            field514 = arg1;
            field323.method2583(44);
            field323.method2507(arg3);
            field323.method2470(Statics.field1982 + arg1);
            field323.method2527(class138.field2121[82] ? 1 : 0);
            field323.method2403(Statics.field595 + arg0);
        }
        if (arg2 == 38) {
            method566();
            class174 var35 = class174.method634(arg1);
            field431 = 1;
            Statics.field2658 = arg0;
            Statics.field3128 = arg1;
            Statics.field641 = arg3;
            method687(var35);
            field432 = class2.method158(16748608) + class52.method126(arg3).field1129 + class2.method158(16777215);
            if (field432 == null) {
                field432 = "null";
            }
            return;
        }
        if (arg2 == 43) {
            field323.method2583(187);
            field323.method2403(arg3);
            field323.method2371(arg0);
            field323.method2326(arg1);
            field392 = 0;
            Statics.field275 = class174.method634(arg1);
            field407 = arg0;
        }
        if (arg2 == 16) {
            field388 = arg6;
            field540 = arg7;
            field391 = 2;
            field390 = 0;
            field513 = arg0;
            field514 = arg1;
            field323.method2583(1);
            field323.method2377(Statics.field3128);
            field323.method2507(Statics.field595 + arg0);
            field323.method2470(arg3);
            field323.method2527(class138.field2121[82] ? 1 : 0);
            field323.method2507(Statics.field641);
            field323.method2470(Statics.field1982 + arg1);
            field323.method2470(Statics.field2658);
        }
        if (arg2 == 13) {
            class35 var36 = field516[arg3];
            if (var36 != null) {
                field388 = arg6;
                field540 = arg7;
                field391 = 2;
                field390 = 0;
                field513 = arg0;
                field514 = arg1;
                field323.method2583(59);
                field323.method2403(arg3);
                field323.method2436(class138.field2121[82] ? 1 : 0);
            }
        }
        if (arg2 == 14) {
            class3 var37 = field492[arg3];
            if (var37 != null) {
                field388 = arg6;
                field540 = arg7;
                field391 = 2;
                field390 = 0;
                field513 = arg0;
                field514 = arg1;
                field323.method2583(138);
                field323.method2433(Statics.field3128);
                field323.method2403(Statics.field2658);
                field323.method2371(arg3);
                field323.method2436(class138.field2121[82] ? 1 : 0);
                field323.method2507(Statics.field641);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class174 var38 = class174.method912(arg1, arg0);
            if (var38 != null) {
                int var39 = var38.field2886;
                class174 var40 = class174.method912(arg1, arg0);
                if (var40 != null) {
                    if (var40.field2866 != null) {
                        class1 var41 = new class1();
                        var41.field9 = var40;
                        var41.field6 = arg3;
                        var41.field10 = arg5;
                        var41.field13 = var40.field2866;
                        class37.method192(var41);
                    }
                    boolean var42 = true;
                    if (var40.field2888 > 0) {
                        var42 = method871(var40);
                    }
                    if (var42 && class179.method96(method942(var40), arg3 - 1)) {
                        if (arg3 == 1) {
                            field323.method2583(147);
                            field323.method2326(arg1);
                            field323.method2507(arg0);
                            field323.method2507(var39);
                        }
                        if (arg3 == 2) {
                            field323.method2583(163);
                            field323.method2326(arg1);
                            field323.method2507(arg0);
                            field323.method2507(var39);
                        }
                        if (arg3 == 3) {
                            field323.method2583(10);
                            field323.method2326(arg1);
                            field323.method2507(arg0);
                            field323.method2507(var39);
                        }
                        if (arg3 == 4) {
                            field323.method2583(202);
                            field323.method2326(arg1);
                            field323.method2507(arg0);
                            field323.method2507(var39);
                        }
                        if (arg3 == 5) {
                            field323.method2583(204);
                            field323.method2326(arg1);
                            field323.method2507(arg0);
                            field323.method2507(var39);
                        }
                        if (arg3 == 6) {
                            field323.method2583(94);
                            field323.method2326(arg1);
                            field323.method2507(arg0);
                            field323.method2507(var39);
                        }
                        if (arg3 == 7) {
                            field323.method2583(129);
                            field323.method2326(arg1);
                            field323.method2507(arg0);
                            field323.method2507(var39);
                        }
                        if (arg3 == 8) {
                            field323.method2583(139);
                            field323.method2326(arg1);
                            field323.method2507(arg0);
                            field323.method2507(var39);
                        }
                        if (arg3 == 9) {
                            field323.method2583(135);
                            field323.method2326(arg1);
                            field323.method2507(arg0);
                            field323.method2507(var39);
                        }
                        if (arg3 == 10) {
                            field323.method2583(62);
                            field323.method2326(arg1);
                            field323.method2507(arg0);
                            field323.method2507(var39);
                        }
                    }
                }
            }
        }
        if (arg2 == 23) {
            Statics.field340.method1807(Statics.field582, arg0, arg1);
        }
        if (arg2 == 19) {
            field388 = arg6;
            field540 = arg7;
            field391 = 2;
            field390 = 0;
            field513 = arg0;
            field514 = arg1;
            field323.method2583(195);
            field323.method2323(class138.field2121[82] ? 1 : 0);
            field323.method2371(Statics.field1982 + arg1);
            field323.method2371(arg3);
            field323.method2403(Statics.field595 + arg0);
        }
        if (arg2 == 49) {
            class3 var43 = field492[arg3];
            if (var43 != null) {
                field388 = arg6;
                field540 = arg7;
                field391 = 2;
                field390 = 0;
                field513 = arg0;
                field514 = arg1;
                field323.method2583(134);
                field323.method2323(class138.field2121[82] ? 1 : 0);
                field323.method2403(arg3);
            }
        }
        if (arg2 == 45) {
            class3 var44 = field492[arg3];
            if (var44 != null) {
                field388 = arg6;
                field540 = arg7;
                field391 = 2;
                field390 = 0;
                field513 = arg0;
                field514 = arg1;
                field323.method2583(176);
                field323.method2470(arg3);
                field323.method2436(class138.field2121[82] ? 1 : 0);
            }
        }
        if (arg2 == 35) {
            field323.method2583(154);
            field323.method2371(arg0);
            field323.method2326(arg1);
            field323.method2507(arg3);
            field392 = 0;
            Statics.field275 = class174.method634(arg1);
            field407 = arg0;
        }
        if (arg2 == 2) {
            field388 = arg6;
            field540 = arg7;
            field391 = 2;
            field390 = 0;
            field513 = arg0;
            field514 = arg1;
            field323.method2583(144);
            field323.method2362(class138.field2121[82] ? 1 : 0);
            field323.method2507(field308);
            field323.method2371(arg3 >> 14 & 0x7FFF);
            field323.method2326(Statics.field2614);
            field323.method2371(Statics.field1982 + arg1);
            field323.method2470(Statics.field595 + arg0);
        }
        if (arg2 == 37) {
            field323.method2583(127);
            field323.method2507(arg3);
            field323.method2340(arg1);
            field323.method2371(arg0);
            field392 = 0;
            Statics.field275 = class174.method634(arg1);
            field407 = arg0;
        }
        if (arg2 == 29) {
            field323.method2583(69);
            field323.method2326(arg1);
            class174 var45 = class174.method634(arg1);
            if (var45.field2810 != null && var45.field2810[0][0] == 5) {
                int var46 = var45.field2810[0][1];
                if (class177.field2921[var46] != var45.field2880[0]) {
                    class177.field2921[var46] = var45.field2880[0];
                    method1049(var46);
                }
            }
        }
        if (arg2 == 26) {
            field323.method2583(224);
            for (class4 var47 = (class4) field309.method3521(); var47 != null; var47 = (class4) field309.method3522()) {
                if (var47.field63 == 0 || var47.field63 == 3) {
                    method717(var47, true);
                }
            }
            if (field442 != null) {
                method687(field442);
                field442 = null;
            }
        }
        if (arg2 == 12) {
            class35 var48 = field516[arg3];
            if (var48 != null) {
                field388 = arg6;
                field540 = arg7;
                field391 = 2;
                field390 = 0;
                field513 = arg0;
                field514 = arg1;
                field323.method2583(77);
                field323.method2470(arg3);
                field323.method2323(class138.field2121[82] ? 1 : 0);
            }
        }
        if (arg2 == 1001) {
            field388 = arg6;
            field540 = arg7;
            field391 = 2;
            field390 = 0;
            field513 = arg0;
            field514 = arg1;
            field323.method2583(67);
            field323.method2323(class138.field2121[82] ? 1 : 0);
            field323.method2403(Statics.field1982 + arg1);
            field323.method2403(Statics.field595 + arg0);
            field323.method2403(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 1005) {
            class174 var49 = class174.method634(arg1);
            if (var49 == null || var49.field2885[arg0] < 100000) {
                field323.method2583(70);
                field323.method2470(arg3);
            } else {
                class12.method2629(27, "", var49.field2885[arg0] + " x " + class52.method126(arg3).field1129);
            }
            field392 = 0;
            Statics.field275 = class174.method634(arg1);
            field407 = arg0;
        }
        if (arg2 == 1002) {
            field388 = arg6;
            field540 = arg7;
            field391 = 2;
            field390 = 0;
            field323.method2583(45);
            field323.method2470(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 5) {
            field388 = arg6;
            field540 = arg7;
            field391 = 2;
            field390 = 0;
            field513 = arg0;
            field514 = arg1;
            field323.method2583(8);
            field323.method2403(Statics.field1982 + arg1);
            field323.method2436(class138.field2121[82] ? 1 : 0);
            field323.method2470(Statics.field595 + arg0);
            field323.method2371(arg3 >> 14 & 0x7FFF);
        }
        if (field431 != 0) {
            field431 = 0;
            method687(class174.method634(Statics.field3128));
        }
        if (field433) {
            method566();
        }
        if (Statics.field275 != null && field392 == 0) {
            method687(Statics.field275);
        }
    }

    @ObfuscatedName("aj.bk(IIIIB)V")
    public static void method815(int arg0, int arg1, int arg2, int arg3) {
        class174 var4 = class174.method912(arg0, arg1);
        if (var4 != null && var4.field2893 != null) {
            class1 var5 = new class1();
            var5.field9 = var4;
            var5.field13 = var4.field2893;
            class37.method192(var5);
        }
        field435 = arg3;
        field433 = true;
        Statics.field2614 = arg0;
        field308 = arg1;
        Statics.field1556 = arg2;
        method687(var4);
    }

    @ObfuscatedName("f.bw(B)V")
    public static void method566() {
        if (!field433) {
            return;
        }
        class174 var0 = class174.method912(Statics.field2614, field308);
        if (var0 != null && var0.field2801 != null) {
            class1 var1 = new class1();
            var1.field9 = var0;
            var1.field13 = var0.field2801;
            class37.method192(var1);
        }
        field433 = false;
        method687(var0);
    }

    @ObfuscatedName("u.bp(III)V")
    public static void method56(int arg0, int arg1) {
        field323.method2583(99);
        field323.method2507(arg1);
        field323.method2377(arg0);
    }

    @ObfuscatedName("bk.bl(B)V")
    public static final void method1456() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field497 - 1; var1++) {
                if (field423[var1] < 1000 && field423[var1 + 1] > 1000) {
                    String var2 = field426[var1];
                    field426[var1] = field426[var1 + 1];
                    field426[var1 + 1] = var2;
                    String var3 = field425[var1];
                    field425[var1] = field425[var1 + 1];
                    field425[var1 + 1] = var3;
                    int var4 = field423[var1];
                    field423[var1] = field423[var1 + 1];
                    field423[var1 + 1] = var4;
                    int var5 = field421[var1];
                    field421[var1] = field421[var1 + 1];
                    field421[var1 + 1] = var5;
                    int var6 = field422[var1];
                    field422[var1] = field422[var1 + 1];
                    field422[var1 + 1] = var6;
                    int var7 = field379[var1];
                    field379[var1] = field379[var1 + 1];
                    field379[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("m.bm(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method170(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field419 || field497 >= 500) {
            return;
        }
        field425[field497] = arg0;
        field426[field497] = arg1;
        field423[field497] = arg2;
        field379[field497] = arg3;
        field421[field497] = arg4;
        field422[field497] = arg5;
        field497++;
    }

    @ObfuscatedName("o.bo(I)V")
    public static void method95() {
        for (int var0 = 0; var0 < field497; var0++) {
            if (method1164(field423[var0])) {
                if (var0 < field497 - 1) {
                    for (int var1 = var0; var1 < field497 - 1; var1++) {
                        field425[var1] = field425[var1 + 1];
                        field426[var1] = field426[var1 + 1];
                        field423[var1] = field423[var1 + 1];
                        field379[var1] = field379[var1 + 1];
                        field421[var1] = field421[var1 + 1];
                        field422[var1] = field422[var1 + 1];
                    }
                }
                field497--;
            }
        }
    }

    @ObfuscatedName("bf.cs(II)Z")
    public static boolean method1164(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("i.cm(IIIII)V")
    public static final void method155(int arg0, int arg1, int arg2, int arg3) {
        if (field431 == 0 && !field433) {
            method170(class158.field2472, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class106.field1809; var6++) {
            int var7 = class106.field1868[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field340.method1800(Statics.field582, var8, var9, var7) >= 0) {
                    class41 var12 = class41.method118(var11);
                    if (var12.field966 != null) {
                        var12 = var12.method763();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field431 == 1) {
                        method170(class158.field2467, field432 + " " + class2.field31 + " " + class2.method158(65535) + var12.field935, 1, var7, var8, var9);
                    } else if (!field433) {
                        String[] var13 = var12.field963;
                        if (field449) {
                            var13 = method956(var13);
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
                                    method170(var13[var14], class2.method158(65535) + var12.field935, var15, var7, var8, var9);
                                }
                            }
                        }
                        method170(class158.field2397, class2.method158(65535) + var12.field935, 1002, var12.field932 << 14, var8, var9);
                    } else if ((Statics.field1556 & 0x4) == 4) {
                        method170(field436, field437 + " " + class2.field31 + " " + class2.method158(65535) + var12.field935, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class35 var16 = field516[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field783.field888 == 1 && (var16.field824 & 0x7F) == 64 && (var16.field814 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field318; var17++) {
                            class35 var18 = field516[field319[var17]];
                            if (var18 != null && var16 != var18 && var18.field783.field888 == 1 && var16.field824 == var18.field824 && var16.field814 == var18.field814) {
                                method2942(var18.field783, field319[var17], var8, var9);
                            }
                        }
                        int var19 = class33.field756;
                        int[] var20 = class33.field757;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class3 var22 = field492[var20[var21]];
                            if (var22 != null && var16.field824 == var22.field824 && var16.field814 == var22.field814) {
                                method153(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method2942(var16.field783, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var23 = field492[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field824 & 0x7F) == 64 && (var23.field814 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field318; var24++) {
                            class35 var25 = field516[field319[var24]];
                            if (var25 != null && var25.field783.field888 == 1 && var23.field824 == var25.field824 && var23.field814 == var25.field814) {
                                method2942(var25.field783, field319[var24], var8, var9);
                            }
                        }
                        int var26 = class33.field756;
                        int[] var27 = class33.field757;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class3 var29 = field492[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field824 == var29.field824 && var23.field814 == var29.field814) {
                                method153(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field410 == var11) {
                        var4 = var7;
                    } else {
                        method153(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class200 var30 = field346[Statics.field582][var8][var9];
                    if (var30 != null) {
                        for (class29 var31 = (class29) var30.method3572(); var31 != null; var31 = (class29) var30.method3555()) {
                            class52 var32 = class52.method126(var31.field687);
                            if (field431 == 1) {
                                method170(class158.field2467, field432 + " " + class2.field31 + " " + class2.method158(16748608) + var32.field1129, 16, var31.field687, var8, var9);
                            } else if (!field433) {
                                String[] var33 = var32.field1131;
                                if (field449) {
                                    var33 = method956(var33);
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
                                        method170(var33[var34], class2.method158(16748608) + var32.field1129, var35, var31.field687, var8, var9);
                                    } else if (var34 == 2) {
                                        method170(class158.field2463, class2.method158(16748608) + var32.field1129, 20, var31.field687, var8, var9);
                                    }
                                }
                                method170(class158.field2397, class2.method158(16748608) + var32.field1129, 1004, var31.field687, var8, var9);
                            } else if ((Statics.field1556 & 0x1) == 1) {
                                method170(field436, field437 + " " + class2.field31 + " " + class2.method158(16748608) + var32.field1129, 17, var31.field687, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class3 var38 = field492[field410];
            method153(var38, field410, var36, var37);
        }
    }

    @ObfuscatedName("fv.cj(Laq;IIII)V")
    public static final void method2942(class40 arg0, int arg1, int arg2, int arg3) {
        if (field497 >= 400) {
            return;
        }
        if (arg0.field922 != null) {
            arg0 = arg0.method720();
        }
        if (arg0 == null || !arg0.field916 || arg0.field897 && field446 != arg1) {
            return;
        }
        String var4 = arg0.field919;
        if (arg0.field901 != 0) {
            var4 = var4 + method134(arg0.field901, Statics.field1882.field40) + " " + class2.field33 + class158.field2473 + arg0.field901 + class2.field22;
        }
        if (field431 == 1) {
            method170(class158.field2467, field432 + " " + class2.field31 + " " + class2.method158(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field433) {
            String[] var5 = arg0.field903;
            if (field449) {
                var5 = method956(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class158.field2469)) {
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
                        method170(var5[var6], class2.method158(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class158.field2469)) {
                        short var9 = 0;
                        if (field306 != class21.field568) {
                            if (field306 == class21.field566 || field306 == class21.field572 && arg0.field901 > Statics.field1882.field40) {
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
                            method170(var5[var8], class2.method158(16776960) + var4, var10, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method170(class158.field2397, class2.method158(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1556 & 0x2) == 2) {
            method170(field436, field437 + " " + class2.field31 + " " + class2.method158(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("i.ci(Lp;IIII)V")
    public static final void method153(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1882 == arg0 || field497 >= 400) {
            return;
        }
        String var4;
        if (arg0.field41 == 0) {
            var4 = arg0.field51[0] + arg0.field60 + arg0.field51[1] + method134(arg0.field40, Statics.field1882.field40) + " " + class2.field33 + class158.field2473 + arg0.field40 + class2.field22 + arg0.field51[2];
        } else {
            var4 = arg0.field51[0] + arg0.field60 + arg0.field51[1] + " " + class2.field33 + class158.field2474 + arg0.field41 + class2.field22 + arg0.field51[2];
        }
        if (field431 == 1) {
            method170(class158.field2467, field432 + " " + class2.field31 + " " + class2.method158(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field433) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field443[var5] != null) {
                    short var6 = 0;
                    if (field443[var5].equalsIgnoreCase(class158.field2469)) {
                        if (field305 == class21.field568) {
                            continue;
                        }
                        if (field305 == class21.field566 || field305 == class21.field572 && arg0.field40 > Statics.field1882.field40) {
                            var6 = 2000;
                        }
                        if (Statics.field1882.field54 != 0 && arg0.field54 != 0) {
                            if (Statics.field1882.field54 == arg0.field54) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field295[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field406[var5] + var6;
                    method170(field443[var5], class2.method158(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1556 & 0x8) == 8) {
            method170(field436, field437 + " " + class2.field31 + " " + class2.method158(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field497; var9++) {
            if (field423[var9] == 23) {
                field426[var9] = class2.method158(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("l.cb(IIB)Ljava/lang/String;")
    public static final String method134(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method158(16711680);
        } else if (var2 < -6) {
            return class2.method158(16723968);
        } else if (var2 < -3) {
            return class2.method158(16740352);
        } else if (var2 < 0) {
            return class2.method158(16756736);
        } else if (var2 > 9) {
            return class2.method158(65280);
        } else if (var2 > 6) {
            return class2.method158(4259584);
        } else if (var2 > 3) {
            return class2.method158(8453888);
        } else if (var2 > 0) {
            return class2.method158(12648192);
        } else {
            return class2.method158(16776960);
        }
    }

    @ObfuscatedName("bh.co(IIIIIIIIB)V")
    public static final void method1200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class174.method3472(arg0)) {
            Statics.field1690 = null;
            method631(Statics.field3172[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1690 != null) {
                method631(Statics.field1690, -1412584499, arg1, arg2, arg3, arg4, Statics.field2292, Statics.field631, arg7);
                Statics.field1690 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field483[var8] = true;
            }
        } else {
            field483[arg7] = true;
        }
    }

    @ObfuscatedName("au.cw([Lfu;IIIIIIIIB)V")
    public static final void method631(class174[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1661(arg2, arg3, arg4, arg5);
        class92.method1945();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class174 var10 = arg0[var9];
            if (var10 != null && (var10.field2785 == arg1 || arg1 == -1412584499 && field451 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field486[field481] = var10.field2769 + arg6;
                    field487[field481] = var10.field2780 + arg7;
                    field478[field481] = var10.field2887;
                    field489[field481] = var10.field2782;
                    var11 = ++field481 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2897 = var11;
                var10.field2898 = field336;
                if (!var10.field2765 || !method1768(var10)) {
                    if (var10.field2888 > 0) {
                        int var12 = var10.field2888;
                        if (var12 == 324) {
                            if (field554 == -1) {
                                field554 = var10.field2891;
                                field420 = var10.field2802;
                            }
                            if (field351.field2937) {
                                var10.field2891 = field554;
                            } else {
                                var10.field2891 = field420;
                            }
                        } else if (var12 == 325) {
                            if (field554 == -1) {
                                field554 = var10.field2891;
                                field420 = var10.field2802;
                            }
                            if (field351.field2937) {
                                var10.field2891 = field420;
                            } else {
                                var10.field2891 = field554;
                            }
                        } else if (var12 == 327) {
                            var10.field2817 = 150;
                            var10.field2818 = (int) (Math.sin((double) field336 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2789 = 5;
                            var10.field2831 = 0;
                        } else if (var12 == 328) {
                            var10.field2817 = 150;
                            var10.field2818 = (int) (Math.sin((double) field336 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2789 = 5;
                            var10.field2831 = 1;
                        }
                    }
                    int var13 = var10.field2769 + arg6;
                    int var14 = var10.field2780 + arg7;
                    int var15 = var10.field2797;
                    if (field451 == var10) {
                        if (arg1 != -1412584499 && !var10.field2857) {
                            Statics.field1690 = arg0;
                            Statics.field2292 = arg6;
                            Statics.field631 = arg7;
                            continue;
                        }
                        if (field462 && field456) {
                            int var16 = class141.field2163;
                            int var17 = class141.field2164;
                            int var18 = var16 - field453;
                            int var19 = var17 - field454;
                            if (var18 < field457) {
                                var18 = field457;
                            }
                            if (var10.field2887 + var18 > field457 + field289.field2887) {
                                var18 = field457 + field289.field2887 - var10.field2887;
                            }
                            if (var19 < field458) {
                                var19 = field458;
                            }
                            if (var10.field2782 + var19 > field458 + field289.field2782) {
                                var19 = field458 + field289.field2782 - var10.field2782;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2857) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2768 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2768 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2887 + var13;
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
                        int var30 = var10.field2887 + var13;
                        int var31 = var10.field2782 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2765 || var20 < var22 && var21 < var23) {
                        if (var10.field2888 != 0) {
                            if (var10.field2888 == 1336) {
                                if (field283) {
                                    var14 += 15;
                                    Statics.field2946.method3744("Fps:" + field2208, var10.field2887 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field494) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field494) {
                                        var34 = 16711680;
                                    }
                                    Statics.field2946.method3744("Mem:" + var33 + "k", var10.field2887 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2888 == 1337) {
                                field427 = var13;
                                field444 = var14;
                                int var37 = var10.field2887;
                                int var38 = var10.field2782;
                                field276++;
                                method1163(class34.field774);
                                boolean var39 = false;
                                if (field410 >= 0) {
                                    int var40 = class33.field756;
                                    int[] var41 = class33.field757;
                                    for (int var42 = 0; var42 < var40; var42++) {
                                        if (field410 == var41[var42]) {
                                            var39 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var39) {
                                    method1163(class34.field775);
                                }
                                method136(true);
                                method1163(var39 ? class34.field779 : class34.field772);
                                method136(false);
                                method2125();
                                method88();
                                method135(var13, var14, var37, var38, true);
                                int var43 = field399;
                                int var44 = field543;
                                int var45 = field473;
                                int var46 = field384;
                                class80.method1661(var43, var44, var43 + var45, var44 + var46);
                                class92.method1945();
                                if (!field559) {
                                    int var47 = field364;
                                    if (field373 / 256 > var47) {
                                        var47 = field373 / 256;
                                    }
                                    if (field529[4] && field424[4] + 128 > var47) {
                                        var47 = field424[4] + 128;
                                    }
                                    int var48 = field365 + field349 & 0x7FF;
                                    int var49 = Statics.field237;
                                    int var50 = method2223(Statics.field1882.field824, Statics.field1882.field814, Statics.field582) - field370;
                                    int var51 = Statics.field2647;
                                    int var52 = var47 * 3 + 600;
                                    int var53 = 2048 - var47 & 0x7FF;
                                    int var54 = 2048 - var48 & 0x7FF;
                                    int var55 = 0;
                                    int var56 = 0;
                                    int var57 = var52;
                                    if (var53 != 0) {
                                        int var58 = class92.field1597[var53];
                                        int var59 = class92.field1598[var53];
                                        int var60 = var56 * var59 - var52 * var58 >> 16;
                                        var57 = var56 * var58 + var52 * var59 >> 16;
                                        var56 = var60;
                                    }
                                    if (var54 != 0) {
                                        int var61 = class92.field1597[var54];
                                        int var62 = class92.field1598[var54];
                                        int var63 = var55 * var62 + var57 * var61 >> 16;
                                        var57 = var57 * var62 - var55 * var61 >> 16;
                                        var55 = var63;
                                    }
                                    Statics.field1405 = var49 - var55;
                                    Statics.field139 = var50 - var56;
                                    Statics.field1354 = var51 - var57;
                                    Statics.field1223 = var47;
                                    Statics.field751 = var48;
                                }
                                int var76;
                                if (field559) {
                                    int var77;
                                    if (Statics.field1389.field149) {
                                        var77 = Statics.field582;
                                    } else {
                                        int var78 = method2223(Statics.field1405, Statics.field1354, Statics.field582);
                                        if (var78 - Statics.field139 >= 800 || (class6.field91[Statics.field582][Statics.field1405 >> 7][Statics.field1354 >> 7] & 0x4) == 0) {
                                            var77 = 3;
                                        } else {
                                            var77 = Statics.field582;
                                        }
                                    }
                                    var76 = var77;
                                } else {
                                    int var64;
                                    if (Statics.field1389.field149) {
                                        var64 = Statics.field582;
                                    } else {
                                        label1283: {
                                            int var65 = 3;
                                            if (Statics.field1223 < 310) {
                                                int var66 = Statics.field1405 >> 7;
                                                int var67 = Statics.field1354 >> 7;
                                                int var68 = Statics.field1882.field824 >> 7;
                                                int var69 = Statics.field1882.field814 >> 7;
                                                if (var66 < 0 || var67 < 0 || var66 >= 104 || var67 >= 104) {
                                                    var64 = Statics.field582;
                                                    break label1283;
                                                }
                                                if ((class6.field91[Statics.field582][var66][var67] & 0x4) != 0) {
                                                    var65 = Statics.field582;
                                                }
                                                int var70;
                                                if (var68 > var66) {
                                                    var70 = var68 - var66;
                                                } else {
                                                    var70 = var66 - var68;
                                                }
                                                int var71;
                                                if (var69 > var67) {
                                                    var71 = var69 - var67;
                                                } else {
                                                    var71 = var67 - var69;
                                                }
                                                if (var70 > var71) {
                                                    int var72 = var71 * 65536 / var70;
                                                    int var73 = 32768;
                                                    while (var66 != var68) {
                                                        if (var66 < var68) {
                                                            var66++;
                                                        } else if (var66 > var68) {
                                                            var66--;
                                                        }
                                                        if ((class6.field91[Statics.field582][var66][var67] & 0x4) != 0) {
                                                            var65 = Statics.field582;
                                                        }
                                                        var73 += var72;
                                                        if (var73 >= 65536) {
                                                            var73 -= 65536;
                                                            if (var67 < var69) {
                                                                var67++;
                                                            } else if (var67 > var69) {
                                                                var67--;
                                                            }
                                                            if ((class6.field91[Statics.field582][var66][var67] & 0x4) != 0) {
                                                                var65 = Statics.field582;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int var74 = var70 * 65536 / var71;
                                                    int var75 = 32768;
                                                    while (var67 != var69) {
                                                        if (var67 < var69) {
                                                            var67++;
                                                        } else if (var67 > var69) {
                                                            var67--;
                                                        }
                                                        if ((class6.field91[Statics.field582][var66][var67] & 0x4) != 0) {
                                                            var65 = Statics.field582;
                                                        }
                                                        var75 += var74;
                                                        if (var75 >= 65536) {
                                                            var75 -= 65536;
                                                            if (var66 < var68) {
                                                                var66++;
                                                            } else if (var66 > var68) {
                                                                var66--;
                                                            }
                                                            if ((class6.field91[Statics.field582][var66][var67] & 0x4) != 0) {
                                                                var65 = Statics.field582;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (Statics.field1882.field824 >= 0 && Statics.field1882.field814 >= 0 && Statics.field1882.field824 < 13312 && Statics.field1882.field814 < 13312) {
                                                if ((class6.field91[Statics.field582][Statics.field1882.field824 >> 7][Statics.field1882.field814 >> 7] & 0x4) != 0) {
                                                    var65 = Statics.field582;
                                                }
                                                var64 = var65;
                                            } else {
                                                var64 = Statics.field582;
                                            }
                                        }
                                    }
                                    var76 = var64;
                                }
                                int var79 = Statics.field1405;
                                int var80 = Statics.field139;
                                int var81 = Statics.field1354;
                                int var82 = Statics.field1223;
                                int var83 = Statics.field751;
                                for (int var84 = 0; var84 < 5; var84++) {
                                    if (field529[var84]) {
                                        int var85 = (int) (Math.random() * (double) (field530[var84] * 2 + 1) - (double) field530[var84] + Math.sin((double) field338[var84] / 100.0D * (double) field533[var84]) * (double) field424[var84]);
                                        if (var84 == 0) {
                                            Statics.field1405 += var85;
                                        }
                                        if (var84 == 1) {
                                            Statics.field139 += var85;
                                        }
                                        if (var84 == 2) {
                                            Statics.field1354 += var85;
                                        }
                                        if (var84 == 3) {
                                            Statics.field751 = Statics.field751 + var85 & 0x7FF;
                                        }
                                        if (var84 == 4) {
                                            Statics.field1223 += var85;
                                            if (Statics.field1223 < 128) {
                                                Statics.field1223 = 128;
                                            }
                                            if (Statics.field1223 > 383) {
                                                Statics.field1223 = 383;
                                            }
                                        }
                                    }
                                }
                                int var86 = class141.field2163;
                                int var87 = class141.field2164;
                                if (class141.field2160 != 0) {
                                    var86 = class141.field2170;
                                    var87 = class141.field2171;
                                }
                                if (var86 >= var43 && var86 < var43 + var45 && var87 >= var44 && var87 < var44 + var46) {
                                    class106.field1864 = true;
                                    class106.field1809 = 0;
                                    class106.field1865 = var86 - var43;
                                    class106.field1866 = var87 - var44;
                                } else {
                                    class106.field1864 = false;
                                    class106.field1809 = 0;
                                }
                                method666();
                                class80.method1702(var43, var44, var45, var46, 0);
                                method666();
                                int var88 = class92.field1588;
                                class92.field1588 = field556;
                                Statics.field340.method1795(Statics.field1405, Statics.field139, Statics.field1354, Statics.field1223, Statics.field751, var76);
                                class92.field1588 = var88;
                                method666();
                                Statics.field340.method1784();
                                method814(var43, var44, var45, var46);
                                if (field477 == 2) {
                                    method2129((field300 - Statics.field595 << 7) + field303, (field544 - Statics.field1982 << 7) + field304, field548 * 2);
                                    if (field386 > -1 && field336 % 20 < 10) {
                                        Statics.field920[0].method1570(field386 + var43 - 12, field387 + var44 - 28);
                                    }
                                }
                                ((class96) Statics.field1594).method2025(field357);
                                method2036(var43, var44, var45, var46);
                                Statics.field1405 = var79;
                                Statics.field139 = var80;
                                Statics.field1354 = var81;
                                Statics.field1223 = var82;
                                Statics.field751 = var83;
                                if (field288) {
                                    byte var89 = 0;
                                    int var90 = class172.field2733 + class172.field2731 + var89;
                                    if (var90 == 0) {
                                        field288 = false;
                                    }
                                }
                                if (field288) {
                                    class80.method1702(var43, var44, var45, var46, 0);
                                    method2919(class158.field2329, false);
                                }
                                field483[var10.field2897] = true;
                                class80.method1661(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2888 == 1338) {
                                method666();
                                class176 var92 = var10.method3175(false);
                                if (var92 != null) {
                                    class80.method1661(var13, var14, var92.field2915 + var13, var92.field2910 + var14);
                                    if (field294 == 2 || field294 == 5) {
                                        class80.method1680(var13, var14, 0, var92.field2912, var92.field2911);
                                    } else {
                                        int var93 = field411 + field365 & 0x7FF;
                                        int var94 = Statics.field1882.field824 / 32 + 48;
                                        int var95 = 464 - Statics.field1882.field814 / 32;
                                        Statics.field1371.method1581(var13, var14, var92.field2915, var92.field2910, var94, var95, var93, field354 + 256, var92.field2912, var92.field2911);
                                        for (int var96 = 0; var96 < field509; var96++) {
                                            int var97 = field510[var96] * 4 + 2 - Statics.field1882.field824 / 32;
                                            int var98 = field523[var96] * 4 + 2 - Statics.field1882.field814 / 32;
                                            method159(var13, var14, var97, var98, field512[var96], var92);
                                        }
                                        int var99 = 0;
                                        while (true) {
                                            if (var99 >= 104) {
                                                for (int var104 = 0; var104 < field318; var104++) {
                                                    class35 var105 = field516[field319[var104]];
                                                    if (var105 != null && var105.method18()) {
                                                        class40 var106 = var105.field783;
                                                        if (var106 != null && var106.field922 != null) {
                                                            var106 = var106.method720();
                                                        }
                                                        if (var106 != null && var106.field904 && var106.field916) {
                                                            int var107 = var105.field824 / 32 - Statics.field1882.field824 / 32;
                                                            int var108 = var105.field814 / 32 - Statics.field1882.field814 / 32;
                                                            method159(var13, var14, var107, var108, Statics.field2147[1], var92);
                                                        }
                                                    }
                                                }
                                                int var109 = class33.field756;
                                                int[] var110 = class33.field757;
                                                for (int var111 = 0; var111 < var109; var111++) {
                                                    class3 var112 = field492[var110[var111]];
                                                    if (var112 != null && var112.method18() && !var112.field59 && Statics.field1882 != var112) {
                                                        int var113 = var112.field824 / 32 - Statics.field1882.field824 / 32;
                                                        int var114 = var112.field814 / 32 - Statics.field1882.field814 / 32;
                                                        boolean var115 = false;
                                                        if (method236(var112.field60, true)) {
                                                            var115 = true;
                                                        }
                                                        boolean var116 = false;
                                                        for (int var117 = 0; var117 < Statics.field1960; var117++) {
                                                            if (var112.field60.equals(Statics.field2613[var117].field617)) {
                                                                var116 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var118 = false;
                                                        if (Statics.field1882.field54 != 0 && var112.field54 != 0 && Statics.field1882.field54 == var112.field54) {
                                                            var118 = true;
                                                        }
                                                        if (var115) {
                                                            method159(var13, var14, var113, var114, Statics.field2147[3], var92);
                                                        } else if (var118) {
                                                            method159(var13, var14, var113, var114, Statics.field2147[4], var92);
                                                        } else if (var116) {
                                                            method159(var13, var14, var113, var114, Statics.field2147[5], var92);
                                                        } else {
                                                            method159(var13, var14, var113, var114, Statics.field2147[2], var92);
                                                        }
                                                    }
                                                }
                                                if (field477 != 0 && field336 % 20 < 10) {
                                                    if (field477 == 1 && field298 >= 0 && field298 < field516.length) {
                                                        class35 var119 = field516[field298];
                                                        if (var119 != null) {
                                                            int var120 = var119.field824 / 32 - Statics.field1882.field824 / 32;
                                                            int var121 = var119.field814 / 32 - Statics.field1882.field814 / 32;
                                                            method813(var13, var14, var120, var121, Statics.field1571[1], var92);
                                                        }
                                                    }
                                                    if (field477 == 2) {
                                                        int var122 = field300 * 4 - Statics.field595 * 4 + 2 - Statics.field1882.field824 / 32;
                                                        int var123 = field544 * 4 - Statics.field1982 * 4 + 2 - Statics.field1882.field814 / 32;
                                                        method813(var13, var14, var122, var123, Statics.field1571[1], var92);
                                                    }
                                                    if (field477 == 10 && field299 >= 0 && field299 < field492.length) {
                                                        class3 var124 = field492[field299];
                                                        if (var124 != null) {
                                                            int var125 = var124.field824 / 32 - Statics.field1882.field824 / 32;
                                                            int var126 = var124.field814 / 32 - Statics.field1882.field814 / 32;
                                                            method813(var13, var14, var125, var126, Statics.field1571[1], var92);
                                                        }
                                                    }
                                                }
                                                if (field513 != 0) {
                                                    int var127 = field513 * 4 + 2 - Statics.field1882.field824 / 32;
                                                    int var128 = field514 * 4 + 2 - Statics.field1882.field814 / 32;
                                                    method159(var13, var14, var127, var128, Statics.field1571[0], var92);
                                                }
                                                if (!Statics.field1882.field59) {
                                                    class80.method1702(var92.field2915 / 2 + var13 - 1, var92.field2910 / 2 + var14 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var100 = 0; var100 < 104; var100++) {
                                                class200 var101 = field346[Statics.field582][var99][var100];
                                                if (var101 != null) {
                                                    int var102 = var99 * 4 + 2 - Statics.field1882.field824 / 32;
                                                    int var103 = var100 * 4 + 2 - Statics.field1882.field814 / 32;
                                                    method159(var13, var14, var102, var103, Statics.field2147[0], var92);
                                                }
                                            }
                                            var99++;
                                        }
                                    }
                                    field484[var11] = true;
                                }
                                class80.method1661(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2888 == 1339) {
                                class176 var129 = var10.method3175(false);
                                if (var129 != null) {
                                    if (field294 < 3) {
                                        Statics.field1692.method1581(var13, var14, var129.field2915, var129.field2910, 25, 25, field365, 256, var129.field2912, var129.field2911);
                                    } else {
                                        class80.method1680(var13, var14, 0, var129.field2912, var129.field2911);
                                    }
                                }
                                class80.method1661(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2768 == 0) {
                            if (!var10.field2765 && method1768(var10) && Statics.field79 != var10) {
                                continue;
                            }
                            if (!var10.field2765) {
                                if (var10.field2788 > var10.field2859 - var10.field2782) {
                                    var10.field2788 = var10.field2859 - var10.field2782;
                                }
                                if (var10.field2788 < 0) {
                                    var10.field2788 = 0;
                                }
                            }
                            method631(arg0, var10.field2827, var20, var21, var22, var23, var13 - var10.field2787, var14 - var10.field2788, var11);
                            if (var10.field2848 != null) {
                                method631(var10.field2848, var10.field2827, var20, var21, var22, var23, var13 - var10.field2787, var14 - var10.field2788, var11);
                            }
                            class4 var130 = (class4) field309.method3518((long) var10.field2827);
                            if (var130 != null) {
                                method1200(var130.field70, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class80.method1661(arg2, arg3, arg4, arg5);
                            class92.method1945();
                        }
                        if (field337 || field369[var11] || field507 > 1) {
                            if (var10.field2768 == 0 && !var10.field2765 && var10.field2859 > var10.field2782) {
                                int var131 = var10.field2887 + var13;
                                int var132 = var10.field2788;
                                int var133 = var10.field2782;
                                int var134 = var10.field2859;
                                Statics.field2271[0].method1735(var131, var14);
                                Statics.field2271[1].method1735(var131, var14 + var133 - 16);
                                class80.method1702(var131, var14 + 16, 16, var133 - 32, field358);
                                int var135 = (var133 - 32) * var133 / var134;
                                if (var135 < 8) {
                                    var135 = 8;
                                }
                                int var136 = (var133 - 32 - var135) * var132 / (var134 - var133);
                                class80.method1702(var131, var14 + 16 + var136, 16, var135, field532);
                                class80.method1690(var131, var14 + 16 + var136, var135, field528);
                                class80.method1690(var131 + 1, var14 + 16 + var136, var135, field528);
                                class80.method1675(var131, var14 + 16 + var136, 16, field528);
                                class80.method1675(var131, var14 + 17 + var136, 16, field528);
                                class80.method1690(var131 + 15, var14 + 16 + var136, var135, field328);
                                class80.method1690(var131 + 14, var14 + 17 + var136, var135 - 1, field328);
                                class80.method1675(var131, var14 + 15 + var136 + var135, 16, field328);
                                class80.method1675(var131 + 1, var14 + 14 + var136 + var135, 15, field328);
                            }
                            if (var10.field2768 != 1) {
                                if (var10.field2768 == 2) {
                                    int var137 = 0;
                                    for (int var138 = 0; var138 < var10.field2778; var138++) {
                                        for (int var139 = 0; var139 < var10.field2777; var139++) {
                                            int var140 = (var10.field2832 + 32) * var139 + var13;
                                            int var141 = (var10.field2833 + 32) * var138 + var14;
                                            if (var137 < 20) {
                                                var140 += var10.field2836[var137];
                                                var141 += var10.field2877[var137];
                                            }
                                            if (var10.field2884[var137] > 0) {
                                                boolean var142 = false;
                                                boolean var143 = false;
                                                int var144 = var10.field2884[var137] - 1;
                                                if (var140 + 32 > arg2 && var140 < arg4 && var141 + 32 > arg3 && var141 < arg5 || Statics.field627 == var10 && field360 == var137) {
                                                    class79 var145;
                                                    if (field431 == 1 && Statics.field2658 == var137 && Statics.field3128 == var10.field2827) {
                                                        var145 = class52.method34(var144, var10.field2885[var137], 2, 0, 2, false);
                                                    } else {
                                                        var145 = class52.method34(var144, var10.field2885[var137], 1, 3153952, 2, false);
                                                    }
                                                    if (var145 == null) {
                                                        method687(var10);
                                                    } else if (Statics.field627 == var10 && field360 == var137) {
                                                        int var146 = class141.field2163 - field395;
                                                        int var147 = class141.field2164 - field396;
                                                        if (var146 < 5 && var146 > -5) {
                                                            var146 = 0;
                                                        }
                                                        if (var147 < 5 && var147 > -5) {
                                                            var147 = 0;
                                                        }
                                                        if (field418 < 5) {
                                                            var146 = 0;
                                                            var147 = 0;
                                                        }
                                                        var145.method1591(var140 + var146, var141 + var147, 128);
                                                        if (arg1 != -1) {
                                                            class174 var148 = arg0[arg1 & 0xFFFF];
                                                            if (var141 + var147 < class80.field1424 && var148.field2788 > 0) {
                                                                int var149 = field357 * (class80.field1424 - var141 - var147) / 3;
                                                                if (var149 > field357 * 10) {
                                                                    var149 = field357 * 10;
                                                                }
                                                                if (var149 > var148.field2788) {
                                                                    var149 = var148.field2788;
                                                                }
                                                                var148.field2788 -= var149;
                                                                field396 += var149;
                                                                method687(var148);
                                                            }
                                                            if (var141 + var147 + 32 > class80.field1422 && var148.field2788 < var148.field2859 - var148.field2782) {
                                                                int var150 = field357 * (var141 + var147 + 32 - class80.field1422) / 3;
                                                                if (var150 > field357 * 10) {
                                                                    var150 = field357 * 10;
                                                                }
                                                                if (var150 > var148.field2859 - var148.field2782 - var148.field2788) {
                                                                    var150 = var148.field2859 - var148.field2782 - var148.field2788;
                                                                }
                                                                var148.field2788 += var150;
                                                                field396 -= var150;
                                                                method687(var148);
                                                            }
                                                        }
                                                    } else if (Statics.field275 == var10 && field407 == var137) {
                                                        var145.method1591(var140, var141, 128);
                                                    } else {
                                                        var145.method1570(var140, var141);
                                                    }
                                                }
                                            } else if (var10.field2862 != null && var137 < 20) {
                                                class79 var151 = var10.method3145(var137);
                                                if (var151 != null) {
                                                    var151.method1570(var140, var141);
                                                } else if (class174.field2867) {
                                                    method687(var10);
                                                }
                                            }
                                            var137++;
                                        }
                                    }
                                } else if (var10.field2768 == 3) {
                                    int var152;
                                    if (method2651(var10)) {
                                        var152 = var10.field2792;
                                        if (Statics.field79 == var10 && var10.field2798 != 0) {
                                            var152 = var10.field2798;
                                        }
                                    } else {
                                        var152 = var10.field2791;
                                        if (Statics.field79 == var10 && var10.field2828 != 0) {
                                            var152 = var10.field2828;
                                        }
                                    }
                                    if (var10.field2795) {
                                        switch(var10.field2796.field1440) {
                                            case 1:
                                                class80.method1672(var13, var14, var10.field2887, var10.field2782, var10.field2791, var10.field2792, 256 - (var10.field2797 & 0xFF), 256 - (var10.field2834 & 0xFF));
                                                break;
                                            case 2:
                                                class80.method1669(var13, var14, var10.field2887, var10.field2782, var10.field2791, var10.field2792, 256 - (var10.field2797 & 0xFF), 256 - (var10.field2834 & 0xFF));
                                                break;
                                            case 3:
                                                class80.method1667(var13, var14, var10.field2887, var10.field2782, var10.field2791, var10.field2792, 256 - (var10.field2797 & 0xFF), 256 - (var10.field2834 & 0xFF));
                                                break;
                                            case 4:
                                                class80.method1671(var13, var14, var10.field2887, var10.field2782, var10.field2791, var10.field2792, 256 - (var10.field2797 & 0xFF), 256 - (var10.field2834 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class80.method1702(var13, var14, var10.field2887, var10.field2782, var152);
                                                } else {
                                                    class80.method1666(var13, var14, var10.field2887, var10.field2782, var152, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class80.method1673(var13, var14, var10.field2887, var10.field2782, var152);
                                    } else {
                                        class80.method1674(var13, var14, var10.field2887, var10.field2782, var152, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2768 == 4) {
                                    class225 var153 = var10.method3181();
                                    if (var153 != null) {
                                        String var154 = var10.field2826;
                                        int var155;
                                        if (method2651(var10)) {
                                            var155 = var10.field2792;
                                            if (Statics.field79 == var10 && var10.field2798 != 0) {
                                                var155 = var10.field2798;
                                            }
                                            if (var10.field2779.length() > 0) {
                                                var154 = var10.field2779;
                                            }
                                        } else {
                                            var155 = var10.field2791;
                                            if (Statics.field79 == var10 && var10.field2828 != 0) {
                                                var155 = var10.field2828;
                                            }
                                        }
                                        if (var10.field2765 && var10.field2886 != -1) {
                                            class52 var156 = class52.method126(var10.field2886);
                                            var154 = var156.field1129;
                                            if (var154 == null) {
                                                var154 = "null";
                                            }
                                            if ((var156.field1128 == 1 || var10.field2781 != 1) && var10.field2781 != -1) {
                                                var154 = class2.method158(16748608) + var154 + class2.field24 + " " + 'x' + method2265(var10.field2781);
                                            }
                                        }
                                        if (field442 == var10) {
                                            class158 var10000 = (class158) null;
                                            var154 = class158.field2338;
                                            var155 = var10.field2791;
                                        }
                                        if (!var10.field2765) {
                                            var154 = method539(var154, var10);
                                        }
                                        var153.method3746(var154, var13, var14, var10.field2887, var10.field2782, var155, var10.field2770 ? 0 : -1, var10.field2829, var10.field2830, var10.field2900);
                                    } else if (class174.field2867) {
                                        method687(var10);
                                    }
                                } else if (var10.field2768 == 5) {
                                    if (var10.field2765) {
                                        class79 var158;
                                        if (var10.field2886 == -1) {
                                            var158 = var10.method3143(false);
                                        } else {
                                            var158 = class52.method34(var10.field2886, var10.field2781, var10.field2805, var10.field2806, var10.field2824, false);
                                        }
                                        if (var158 != null) {
                                            int var159 = var158.field1417;
                                            int var160 = var158.field1413;
                                            if (var10.field2804) {
                                                class80.method1662(var13, var14, var10.field2887 + var13, var10.field2782 + var14);
                                                int var161 = (var10.field2887 + (var159 - 1)) / var159;
                                                int var162 = (var10.field2782 + (var160 - 1)) / var160;
                                                for (int var163 = 0; var163 < var161; var163++) {
                                                    for (int var164 = 0; var164 < var162; var164++) {
                                                        if (var10.field2803 != 0) {
                                                            var158.method1583(var159 / 2 + var159 * var163 + var13, var160 / 2 + var160 * var164 + var14, var10.field2803, 4096);
                                                        } else if (var15 == 0) {
                                                            var158.method1570(var159 * var163 + var13, var160 * var164 + var14);
                                                        } else {
                                                            var158.method1591(var159 * var163 + var13, var160 * var164 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1661(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var165 = var10.field2887 * 4096 / var159;
                                                if (var10.field2803 != 0) {
                                                    var158.method1583(var10.field2887 / 2 + var13, var10.field2782 / 2 + var14, var10.field2803, var165);
                                                } else if (var15 != 0) {
                                                    var158.method1589(var13, var14, var10.field2887, var10.field2782, 256 - (var15 & 0xFF));
                                                } else if (var10.field2887 == var159 && var10.field2782 == var160) {
                                                    var158.method1570(var13, var14);
                                                } else {
                                                    var158.method1569(var13, var14, var10.field2887, var10.field2782);
                                                }
                                            }
                                        } else if (class174.field2867) {
                                            method687(var10);
                                        }
                                    } else {
                                        class79 var157 = var10.method3143(method2651(var10));
                                        if (var157 != null) {
                                            var157.method1570(var13, var14);
                                        } else if (class174.field2867) {
                                            method687(var10);
                                        }
                                    }
                                } else if (var10.field2768 == 6) {
                                    boolean var166 = method2651(var10);
                                    int var167;
                                    if (var166) {
                                        var167 = var10.field2814;
                                    } else {
                                        var167 = var10.field2813;
                                    }
                                    class106 var168 = null;
                                    int var169 = 0;
                                    if (var10.field2886 != -1) {
                                        class52 var170 = class52.method126(var10.field2886);
                                        if (var170 != null) {
                                            class52 var171 = var170.method972(var10.field2781);
                                            var168 = var171.method980(1);
                                            if (var168 == null) {
                                                method687(var10);
                                            } else {
                                                var168.method2145();
                                                var169 = var168.field1466 / 2;
                                            }
                                        }
                                    } else if (var10.field2789 == 5) {
                                        if (var10.field2831 == 0) {
                                            var168 = field351.method3234((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var168 = Statics.field1882.method14();
                                        }
                                    } else if (var167 == -1) {
                                        var168 = var10.method3146((class43) null, -1, var166, Statics.field1882.field35);
                                        if (var168 == null && class174.field2867) {
                                            method687(var10);
                                        }
                                    } else {
                                        class43 var172 = class43.method43(var167);
                                        var168 = var10.method3146(var172, var10.field2835, var166, Statics.field1882.field35);
                                        if (var168 == null && class174.field2867) {
                                            method687(var10);
                                        }
                                    }
                                    class92.method1948(var10.field2887 / 2 + var13, var10.field2782 / 2 + var14);
                                    int var173 = var10.field2820 * class92.field1597[var10.field2817] >> 16;
                                    int var174 = var10.field2820 * class92.field1598[var10.field2817] >> 16;
                                    if (var168 != null) {
                                        if (var10.field2765) {
                                            var168.method2145();
                                            if (var10.field2823) {
                                                var168.method2158(0, var10.field2818, var10.field2819, var10.field2817, var10.field2860, var10.field2816 + var169 + var173, var10.field2816 + var174, var10.field2820);
                                            } else {
                                                var168.method2157(0, var10.field2818, var10.field2819, var10.field2817, var10.field2860, var10.field2816 + var169 + var173, var10.field2816 + var174);
                                            }
                                        } else {
                                            var168.method2157(0, var10.field2818, 0, var10.field2817, 0, var173, var174);
                                        }
                                    }
                                    class92.method1947();
                                } else {
                                    if (var10.field2768 == 7) {
                                        class225 var175 = var10.method3181();
                                        if (var175 == null) {
                                            if (class174.field2867) {
                                                method687(var10);
                                            }
                                            continue;
                                        }
                                        int var176 = 0;
                                        for (int var177 = 0; var177 < var10.field2778; var177++) {
                                            for (int var178 = 0; var178 < var10.field2777; var178++) {
                                                if (var10.field2884[var176] > 0) {
                                                    class52 var179 = class52.method126(var10.field2884[var176] - 1);
                                                    String var180;
                                                    if (var179.field1128 != 1 && var10.field2885[var176] == 1) {
                                                        var180 = class2.method158(16748608) + var179.field1129 + class2.field24;
                                                    } else {
                                                        var180 = class2.method158(16748608) + var179.field1129 + class2.field24 + " " + 'x' + method2265(var10.field2885[var176]);
                                                    }
                                                    int var181 = (var10.field2832 + 115) * var178 + var13;
                                                    int var182 = (var10.field2833 + 12) * var177 + var14;
                                                    if (var10.field2829 == 0) {
                                                        var175.method3743(var180, var181, var182, var10.field2791, var10.field2770 ? 0 : -1);
                                                    } else if (var10.field2829 == 1) {
                                                        var175.method3745(var180, var10.field2887 / 2 + var181, var182, var10.field2791, var10.field2770 ? 0 : -1);
                                                    } else {
                                                        var175.method3744(var180, var10.field2887 + var181 - 1, var182, var10.field2791, var10.field2770 ? 0 : -1);
                                                    }
                                                }
                                                var176++;
                                            }
                                        }
                                    }
                                    if (var10.field2768 == 8 && Statics.field665 == var10 && field430 == field429) {
                                        int var183 = 0;
                                        int var184 = 0;
                                        class225 var185 = Statics.field2946;
                                        String var186 = var10.field2826;
                                        String var187 = method539(var186, var10);
                                        while (var187.length() > 0) {
                                            int var188 = var187.indexOf(class2.field23);
                                            String var189;
                                            if (var188 == -1) {
                                                var189 = var187;
                                                var187 = "";
                                            } else {
                                                var189 = var187.substring(0, var188);
                                                var187 = var187.substring(var188 + 4);
                                            }
                                            int var190 = var185.method3738(var189);
                                            if (var190 > var183) {
                                                var183 = var190;
                                            }
                                            var184 += var185.field3190 + 1;
                                        }
                                        var183 += 6;
                                        var184 += 7;
                                        int var191 = var10.field2887 + var13 - 5 - var183;
                                        int var192 = var10.field2782 + var14 + 5;
                                        if (var191 < var13 + 5) {
                                            var191 = var13 + 5;
                                        }
                                        if (var183 + var191 > arg4) {
                                            var191 = arg4 - var183;
                                        }
                                        if (var184 + var192 > arg5) {
                                            var192 = arg5 - var184;
                                        }
                                        class80.method1702(var191, var192, var183, var184, 16777120);
                                        class80.method1673(var191, var192, var183, var184, 0);
                                        String var193 = var10.field2826;
                                        int var194 = var185.field3190 + var192 + 2;
                                        String var195 = method539(var193, var10);
                                        while (var195.length() > 0) {
                                            int var196 = var195.indexOf(class2.field23);
                                            String var197;
                                            if (var196 == -1) {
                                                var197 = var195;
                                                var195 = "";
                                            } else {
                                                var197 = var195.substring(0, var196);
                                                var195 = var195.substring(var196 + 4);
                                            }
                                            var185.method3743(var197, var191 + 3, var194, 0, -1);
                                            var194 += var185.field3190 + 1;
                                        }
                                    }
                                    if (var10.field2768 == 9) {
                                        if (var10.field2799 == 1) {
                                            int var198;
                                            int var199;
                                            int var200;
                                            int var201;
                                            if (var10.field2800) {
                                                var198 = var13;
                                                var199 = var10.field2782 + var14;
                                                var200 = var10.field2887 + var13;
                                                var201 = var14;
                                            } else {
                                                var198 = var13;
                                                var199 = var14;
                                                var200 = var10.field2887 + var13;
                                                var201 = var10.field2782 + var14;
                                            }
                                            class80.method1679(var198, var199, var200, var201, var10.field2791);
                                        } else {
                                            int var202 = var10.field2887 >= 0 ? var10.field2887 : -var10.field2887;
                                            int var203 = var10.field2782 >= 0 ? var10.field2782 : -var10.field2782;
                                            int var204 = var202;
                                            if (var202 < var203) {
                                                var204 = var203;
                                            }
                                            if (var204 != 0) {
                                                int var205 = (var10.field2887 << 16) / var204;
                                                int var206 = (var10.field2782 << 16) / var204;
                                                if (var206 <= var205) {
                                                    var205 = -var205;
                                                } else {
                                                    var206 = -var206;
                                                }
                                                int var207 = var10.field2799 * var206 >> 17;
                                                int var208 = var10.field2799 * var206 + 1 >> 17;
                                                int var209 = var10.field2799 * var205 >> 17;
                                                int var210 = var10.field2799 * var205 + 1 >> 17;
                                                int var211 = var13 + var207;
                                                int var212 = var13 - var208;
                                                int var213 = var10.field2887 + var13 - var208;
                                                int var214 = var10.field2887 + var13 + var207;
                                                int var215 = var14 + var209;
                                                int var216 = var14 - var210;
                                                int var217 = var10.field2782 + var14 - var210;
                                                int var218 = var10.field2782 + var14 + var209;
                                                class92.method1953(var211, var212, var213);
                                                class92.method1965(var215, var216, var217, var211, var212, var213, var10.field2791);
                                                class92.method1953(var211, var213, var214);
                                                class92.method1965(var215, var217, var218, var211, var213, var214, var10.field2791);
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

    @ObfuscatedName("client.ca(Ljava/lang/String;Lfu;I)Ljava/lang/String;")
    public static String method539(String arg0, class174 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method2657(method2579(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field1976 != null) {
                    int var6 = Statics.field1976.field2229;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field1976.field2225 != null) {
                        var5 = (String) Statics.field1976.field2225;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("de.ck(IS)Ljava/lang/String;")
    public static final String method2265(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field18 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method158(65408) + var1.substring(0, var1.length() - 8) + class158.field2478 + " " + class2.field33 + var1 + class2.field22 + class2.field24;
        } else if (var1.length() > 6) {
            return " " + class2.method158(16777215) + var1.substring(0, var1.length() - 4) + class158.field2480 + " " + class2.field33 + var1 + class2.field22 + class2.field24;
        } else {
            return " " + class2.method158(16776960) + var1 + class2.field24;
        }
    }

    @ObfuscatedName("c.cg(ZI)V")
    public static final void method123(boolean arg0) {
        int var1 = field413;
        int var2 = Statics.field215;
        int var3 = Statics.field216;
        if (class174.method3472(var1)) {
            method3478(Statics.field3172[var1], -1, var2, var3, arg0);
        }
    }

    @ObfuscatedName("dv.ce([Lfu;Lfu;ZI)V")
    public static void method2638(class174[] arg0, class174 arg1, boolean arg2) {
        int var3 = arg1.field2849 == 0 ? arg1.field2887 : arg1.field2849;
        int var4 = arg1.field2859 == 0 ? arg1.field2782 : arg1.field2859;
        method3478(arg0, arg1.field2827, var3, var4, arg2);
        if (arg1.field2848 != null) {
            method3478(arg1.field2848, arg1.field2827, var3, var4, arg2);
        }
        class4 var5 = (class4) field309.method3518((long) arg1.field2827);
        if (var5 != null) {
            int var6 = var5.field70;
            if (class174.method3472(var6)) {
                method3478(Statics.field3172[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2888 == 1337) {
        }
    }

    @ObfuscatedName("gu.cr([Lfu;IIIZB)V")
    public static void method3478(class174[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class174 var6 = arg0[var5];
            if (var6 != null && var6.field2785 == arg1) {
                method2039(var6, arg2, arg3, arg4);
                method1457(var6, arg2, arg3);
                if (var6.field2787 > var6.field2849 - var6.field2887) {
                    var6.field2787 = var6.field2849 - var6.field2887;
                }
                if (var6.field2787 < 0) {
                    var6.field2787 = 0;
                }
                if (var6.field2788 > var6.field2859 - var6.field2782) {
                    var6.field2788 = var6.field2859 - var6.field2782;
                }
                if (var6.field2788 < 0) {
                    var6.field2788 = 0;
                }
                if (var6.field2768 == 0) {
                    method2638(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("cy.cf(Lfu;IIZI)V")
    public static void method2039(class174 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2887;
        int var5 = arg0.field2782;
        if (arg0.field2773 == 0) {
            arg0.field2887 = arg0.field2777;
        } else if (arg0.field2773 == 1) {
            arg0.field2887 = arg1 - arg0.field2777;
        } else if (arg0.field2773 == 2) {
            arg0.field2887 = arg0.field2777 * arg1 >> 14;
        }
        if (arg0.field2890 == 0) {
            arg0.field2782 = arg0.field2778;
        } else if (arg0.field2890 == 1) {
            arg0.field2782 = arg2 - arg0.field2778;
        } else if (arg0.field2890 == 2) {
            arg0.field2782 = arg0.field2778 * arg2 >> 14;
        }
        if (arg0.field2773 == 4) {
            arg0.field2887 = arg0.field2782 * arg0.field2766 / arg0.field2784;
        }
        if (arg0.field2890 == 4) {
            arg0.field2782 = arg0.field2887 * arg0.field2784 / arg0.field2766;
        }
        if (field536 && arg0.field2768 == 0) {
            if (arg0.field2782 < 5 && arg0.field2887 < 5) {
                arg0.field2782 = 5;
                arg0.field2887 = 5;
            } else {
                if (arg0.field2782 <= 0) {
                    arg0.field2782 = 5;
                }
                if (arg0.field2887 <= 0) {
                    arg0.field2887 = 5;
                }
            }
        }
        if (arg0.field2888 == 1337) {
            field450 = arg0;
        }
        if (arg3 && arg0.field2875 != null && (arg0.field2887 != var4 || arg0.field2782 != var5)) {
            class1 var6 = new class1();
            var6.field9 = arg0;
            var6.field13 = arg0.field2875;
            field284.method3548(var6);
        }
    }

    @ObfuscatedName("bk.cc(Lfu;IIS)V")
    public static void method1457(class174 arg0, int arg1, int arg2) {
        if (arg0.field2771 == 0) {
            arg0.field2769 = arg0.field2775;
        } else if (arg0.field2771 == 1) {
            arg0.field2769 = (arg1 - arg0.field2887) / 2 + arg0.field2775;
        } else if (arg0.field2771 == 2) {
            arg0.field2769 = arg1 - arg0.field2887 - arg0.field2775;
        } else if (arg0.field2771 == 3) {
            arg0.field2769 = arg0.field2775 * arg1 >> 14;
        } else if (arg0.field2771 == 4) {
            arg0.field2769 = (arg0.field2775 * arg1 >> 14) + (arg1 - arg0.field2887) / 2;
        } else {
            arg0.field2769 = arg1 - arg0.field2887 - (arg0.field2775 * arg1 >> 14);
        }
        if (arg0.field2811 == 0) {
            arg0.field2780 = arg0.field2776;
        } else if (arg0.field2811 == 1) {
            arg0.field2780 = (arg2 - arg0.field2782) / 2 + arg0.field2776;
        } else if (arg0.field2811 == 2) {
            arg0.field2780 = arg2 - arg0.field2782 - arg0.field2776;
        } else if (arg0.field2811 == 3) {
            arg0.field2780 = arg0.field2776 * arg2 >> 14;
        } else if (arg0.field2811 == 4) {
            arg0.field2780 = (arg0.field2776 * arg2 >> 14) + (arg2 - arg0.field2782) / 2;
        } else {
            arg0.field2780 = arg2 - arg0.field2782 - (arg0.field2776 * arg2 >> 14);
        }
        if (!field536 || arg0.field2768 != 0) {
            return;
        }
        if (arg0.field2769 < 0) {
            arg0.field2769 = 0;
        } else if (arg0.field2887 + arg0.field2769 > arg1) {
            arg0.field2769 = arg1 - arg0.field2887;
        }
        if (arg0.field2780 < 0) {
            arg0.field2780 = 0;
        } else if (arg0.field2782 + arg0.field2780 > arg2) {
            arg0.field2780 = arg2 - arg0.field2782;
        }
    }

    @ObfuscatedName("dz.cp(Lfu;IIIIIII)V")
    public static final void method2222(class174 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field362) {
            field363 = 32;
        } else {
            field363 = 0;
        }
        field362 = false;
        if (class141.field2162 == 1 || !Statics.field1564 && class141.field2162 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2788 -= 4;
                method687(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2788 += 4;
                method687(arg0);
            } else if (arg5 >= arg1 - field363 && arg5 < field363 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2788 = (arg4 - arg3) * var8 / var9;
                method687(arg0);
                field362 = true;
            }
        }
        if (field476 == 0) {
            return;
        }
        int var10 = arg0.field2887;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2788 += field476 * 45;
            method687(arg0);
        }
    }

    @ObfuscatedName("ei.cz(IB)Ljava/lang/String;")
    public static final String method2657(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("dl.cu(Lfu;B)Z")
    public static final boolean method2651(class174 arg0) {
        if (arg0.field2879 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2879.length; var1++) {
            int var2 = method2579(arg0, var1);
            int var3 = arg0.field2880[var1];
            if (arg0.field2879[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2879[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2879[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("dy.cl(Lfu;II)I")
    public static final int method2579(class174 arg0, int arg1) {
        if (arg0.field2810 == null || arg1 >= arg0.field2810.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2810[arg1];
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
                    var7 = field400[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field416[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field428[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class174 var11 = class174.method634(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method126(var12).field1130 || field448)) {
                        for (int var13 = 0; var13 < var11.field2884.length; var13++) {
                            if (var12 + 1 == var11.field2884[var13]) {
                                var7 += var11.field2885[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class177.field2921[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class156.field2302[field416[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class177.field2921[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1882.field40;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class156.field2303[var14]) {
                            var7 += field416[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class174 var17 = class174.method634(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method126(var18).field1130 || field448)) {
                        for (int var19 = 0; var19 < var17.field2884.length; var19++) {
                            if (var18 + 1 == var17.field2884[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field302;
                }
                if (var6 == 12) {
                    var7 = field438;
                }
                if (var6 == 13) {
                    int var20 = class177.field2921[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class177.method680(var22);
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
                    var7 = (Statics.field1882.field824 >> 7) + Statics.field595;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1882.field814 >> 7) + Statics.field1982;
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

    @ObfuscatedName("fa.cv(Lfu;III)V")
    public static final void method3041(class174 arg0, int arg1, int arg2) {
        if (arg0.field2838 == 1) {
            method170(arg0.field2883, "", 24, 0, 0, arg0.field2827);
        }
        if (arg0.field2838 == 2 && !field433) {
            int var3 = method942(arg0);
            int var4 = var3 >> 11 & 0x3F;
            String var5;
            if (var4 == 0) {
                var5 = null;
            } else if (arg0.field2845 == null || arg0.field2845.trim().length() == 0) {
                var5 = null;
            } else {
                var5 = arg0.field2845;
            }
            if (var5 != null) {
                method170(var5, class2.method158(65280) + arg0.field2882, 25, 0, -1, arg0.field2827);
            }
        }
        if (arg0.field2838 == 3) {
            method170(class158.field2437, "", 26, 0, 0, arg0.field2827);
        }
        if (arg0.field2838 == 4) {
            method170(arg0.field2883, "", 28, 0, 0, arg0.field2827);
        }
        if (arg0.field2838 == 5) {
            method170(arg0.field2883, "", 29, 0, 0, arg0.field2827);
        }
        if (arg0.field2838 == 6 && field442 == null) {
            method170(arg0.field2883, "", 30, 0, -1, arg0.field2827);
        }
        if (arg0.field2768 == 2) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field2782; var8++) {
                for (int var9 = 0; var9 < arg0.field2887; var9++) {
                    int var10 = (arg0.field2832 + 32) * var9;
                    int var11 = (arg0.field2833 + 32) * var8;
                    if (var7 < 20) {
                        var10 += arg0.field2836[var7];
                        var11 += arg0.field2877[var7];
                    }
                    if (arg1 >= var10 && arg2 >= var11 && arg1 < var10 + 32 && arg2 < var11 + 32) {
                        field297 = var7;
                        Statics.field643 = arg0;
                        if (arg0.field2884[var7] > 0) {
                            label324: {
                                class52 var12 = class52.method126(arg0.field2884[var7] - 1);
                                if (field431 == 1) {
                                    int var13 = method942(arg0);
                                    boolean var14 = (var13 >> 30 & 0x1) != 0;
                                    if (var14) {
                                        if (Statics.field3128 != arg0.field2827 || Statics.field2658 != var7) {
                                            method170(class158.field2467, field432 + " " + class2.field31 + " " + class2.method158(16748608) + var12.field1129, 31, var12.field1115, var7, arg0.field2827);
                                        }
                                        break label324;
                                    }
                                }
                                if (field433) {
                                    int var15 = method942(arg0);
                                    boolean var16 = (var15 >> 30 & 0x1) != 0;
                                    if (var16) {
                                        if ((Statics.field1556 & 0x10) == 16) {
                                            method170(field436, field437 + " " + class2.field31 + " " + class2.method158(16748608) + var12.field1129, 32, var12.field1115, var7, arg0.field2827);
                                        }
                                        break label324;
                                    }
                                }
                                String[] var17 = var12.field1125;
                                if (field449) {
                                    var17 = method956(var17);
                                }
                                int var18 = method942(arg0);
                                boolean var19 = (var18 >> 30 & 0x1) != 0;
                                if (var19) {
                                    for (int var20 = 4; var20 >= 3; var20--) {
                                        if (var17 != null && var17[var20] != null) {
                                            byte var21;
                                            if (var20 == 3) {
                                                var21 = 36;
                                            } else {
                                                var21 = 37;
                                            }
                                            method170(var17[var20], class2.method158(16748608) + var12.field1129, var21, var12.field1115, var7, arg0.field2827);
                                        } else if (var20 == 4) {
                                            method170(class158.field2321, class2.method158(16748608) + var12.field1129, 37, var12.field1115, var7, arg0.field2827);
                                        }
                                    }
                                }
                                int var22 = method942(arg0);
                                boolean var23 = (var22 >> 31 & 0x1) != 0;
                                if (var23) {
                                    method170(class158.field2467, class2.method158(16748608) + var12.field1129, 38, var12.field1115, var7, arg0.field2827);
                                }
                                int var24 = method942(arg0);
                                boolean var25 = (var24 >> 30 & 0x1) != 0;
                                if (var25 && var17 != null) {
                                    for (int var26 = 2; var26 >= 0; var26--) {
                                        if (var17[var26] != null) {
                                            byte var27 = 0;
                                            if (var26 == 0) {
                                                var27 = 33;
                                            }
                                            if (var26 == 1) {
                                                var27 = 34;
                                            }
                                            if (var26 == 2) {
                                                var27 = 35;
                                            }
                                            method170(var17[var26], class2.method158(16748608) + var12.field1129, var27, var12.field1115, var7, arg0.field2827);
                                        }
                                    }
                                }
                                String[] var28 = arg0.field2837;
                                if (field449) {
                                    var28 = method956(var28);
                                }
                                if (var28 != null) {
                                    for (int var29 = 4; var29 >= 0; var29--) {
                                        if (var28[var29] != null) {
                                            byte var30 = 0;
                                            if (var29 == 0) {
                                                var30 = 39;
                                            }
                                            if (var29 == 1) {
                                                var30 = 40;
                                            }
                                            if (var29 == 2) {
                                                var30 = 41;
                                            }
                                            if (var29 == 3) {
                                                var30 = 42;
                                            }
                                            if (var29 == 4) {
                                                var30 = 43;
                                            }
                                            method170(var28[var29], class2.method158(16748608) + var12.field1129, var30, var12.field1115, var7, arg0.field2827);
                                        }
                                    }
                                }
                                method170(class158.field2397, class2.method158(16748608) + var12.field1129, 1005, var12.field1115, var7, arg0.field2827);
                            }
                        }
                    }
                    var7++;
                }
            }
        }
        if (!arg0.field2765) {
            return;
        }
        if (field433) {
            int var31 = method942(arg0);
            boolean var32 = (var31 >> 21 & 0x1) != 0;
            if (var32 && (Statics.field1556 & 0x20) == 32) {
                method170(field436, field437 + " " + class2.field31 + " " + arg0.field2790, 58, 0, arg0.field2767, arg0.field2827);
            }
            return;
        }
        for (int var33 = 9; var33 >= 5; var33--) {
            String var34 = method187(arg0, var33);
            if (var34 != null) {
                method170(var34, arg0.field2790, 1007, var33 + 1, arg0.field2767, arg0.field2827);
            }
        }
        int var35 = method942(arg0);
        int var36 = var35 >> 11 & 0x3F;
        String var37;
        if (var36 == 0) {
            var37 = null;
        } else if (arg0.field2845 == null || arg0.field2845.trim().length() == 0) {
            var37 = null;
        } else {
            var37 = arg0.field2845;
        }
        if (var37 != null) {
            method170(var37, arg0.field2790, 25, 0, arg0.field2767, arg0.field2827);
        }
        for (int var39 = 4; var39 >= 0; var39--) {
            String var40 = method187(arg0, var39);
            if (var40 != null) {
                method170(var40, arg0.field2790, 57, var39 + 1, arg0.field2767, arg0.field2827);
            }
        }
        int var41 = method942(arg0);
        boolean var42 = (var41 & 0x1) != 0;
        if (var42) {
            method170(class158.field2325, "", 30, 0, arg0.field2767, arg0.field2827);
        }
    }

    @ObfuscatedName("dd.ch(IIIIIIII)V")
    public static final void method2616(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class174.method3472(arg0)) {
            method2928(Statics.field3172[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("fy.cy([Lfu;IIIIIIIB)V")
    public static final void method2928(class174[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class174 var9 = arg0[var8];
            if (var9 != null && (!var9.field2765 || var9.field2768 == 0 || var9.field2846 || method942(var9) != 0 || field289 == var9 || var9.field2888 == 1338) && var9.field2785 == arg1 && (!var9.field2765 || !method1768(var9))) {
                int var10 = var9.field2769 + arg6;
                int var11 = var9.field2780 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2768 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2768 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2887 + var10;
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
                    int var22 = var9.field2887 + var10;
                    int var23 = var9.field2782 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field451 == var9) {
                    field459 = true;
                    field560 = var10;
                    field461 = var11;
                }
                if (!var9.field2765 || var12 < var14 && var13 < var15) {
                    int var24 = class141.field2163;
                    int var25 = class141.field2164;
                    if (class141.field2160 != 0) {
                        var24 = class141.field2170;
                        var25 = class141.field2171;
                    }
                    if (var9.field2888 == 1337) {
                        if (!field288 && !field419 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method155(var24, var25, var12, var13);
                        }
                    } else if (var9.field2888 != 1338) {
                        if (!field419 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method3041(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2768 == 0) {
                            if (!var9.field2765 && method1768(var9) && Statics.field79 != var9) {
                                continue;
                            }
                            method2928(arg0, var9.field2827, var12, var13, var14, var15, var10 - var9.field2787, var11 - var9.field2788);
                            if (var9.field2848 != null) {
                                method2928(var9.field2848, var9.field2827, var12, var13, var14, var15, var10 - var9.field2787, var11 - var9.field2788);
                            }
                            class4 var40 = (class4) field309.method3518((long) var9.field2827);
                            if (var40 != null) {
                                if (var40.field63 == 0 && class141.field2163 >= var12 && class141.field2164 >= var13 && class141.field2163 < var14 && class141.field2164 < var15 && !field419 && !field536) {
                                    for (class1 var41 = (class1) field284.method3553(); var41 != null; var41 = (class1) field284.method3558()) {
                                        if (var41.field2) {
                                            var41.method3639();
                                            var41.field9.field2889 = false;
                                        }
                                    }
                                    if (Statics.field1189 == 0) {
                                        field451 = null;
                                        field289 = null;
                                    }
                                    if (!field419) {
                                        field425[0] = class158.field2556;
                                        field426[0] = "";
                                        field423[0] = 1006;
                                        field497 = 1;
                                    }
                                }
                                method2616(var40.field70, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2765) {
                            if (var9.field2899) {
                                if (class141.field2163 >= var12 && class141.field2164 >= var13 && class141.field2163 < var14 && class141.field2164 < var15) {
                                    for (class1 var42 = (class1) field284.method3553(); var42 != null; var42 = (class1) field284.method3558()) {
                                        if (var42.field2) {
                                            var42.method3639();
                                            var42.field9.field2889 = false;
                                        }
                                    }
                                    if (Statics.field1189 == 0) {
                                        field451 = null;
                                        field289 = null;
                                    }
                                    if (!field419) {
                                        field425[0] = class158.field2556;
                                        field426[0] = "";
                                        field423[0] = 1006;
                                        field497 = 1;
                                    }
                                }
                            } else if (var9.field2878 && class141.field2163 >= var12 && class141.field2164 >= var13 && class141.field2163 < var14 && class141.field2164 < var15) {
                                for (class1 var43 = (class1) field284.method3553(); var43 != null; var43 = (class1) field284.method3558()) {
                                    if (var43.field2 && var43.field9.field2844 == var43.field13) {
                                        var43.method3639();
                                    }
                                }
                            }
                            boolean var44;
                            if (class141.field2163 >= var12 && class141.field2164 >= var13 && class141.field2163 < var14 && class141.field2164 < var15) {
                                var44 = true;
                            } else {
                                var44 = false;
                            }
                            boolean var45 = false;
                            if ((class141.field2162 == 1 || !Statics.field1564 && class141.field2162 == 4) && var44) {
                                var45 = true;
                            }
                            boolean var46 = false;
                            if ((class141.field2160 == 1 || !Statics.field1564 && class141.field2160 == 4) && class141.field2170 >= var12 && class141.field2171 >= var13 && class141.field2170 < var14 && class141.field2171 < var15) {
                                var46 = true;
                            }
                            if (var46) {
                                method2652(var9, class141.field2170 - var10, class141.field2171 - var11);
                            }
                            if (field451 != null && field451 != var9 && var44) {
                                int var47 = method942(var9);
                                boolean var48 = (var47 >> 20 & 0x1) != 0;
                                if (var48) {
                                    field455 = var9;
                                }
                            }
                            if (field289 == var9) {
                                field456 = true;
                                field457 = var10;
                                field458 = var11;
                            }
                            if (var9.field2846) {
                                if (var44 && field476 != 0 && var9.field2844 != null) {
                                    class1 var49 = new class1();
                                    var49.field2 = true;
                                    var49.field9 = var9;
                                    var49.field5 = field476;
                                    var49.field13 = var9.field2844;
                                    field284.method3548(var49);
                                }
                                if (field451 != null || Statics.field627 != null || field419) {
                                    var46 = false;
                                    var45 = false;
                                    var44 = false;
                                }
                                if (!var9.field2892 && var46) {
                                    var9.field2892 = true;
                                    if (var9.field2873 != null) {
                                        class1 var50 = new class1();
                                        var50.field2 = true;
                                        var50.field9 = var9;
                                        var50.field15 = class141.field2170 - var10;
                                        var50.field5 = class141.field2171 - var11;
                                        var50.field13 = var9.field2873;
                                        field284.method3548(var50);
                                    }
                                }
                                if (var9.field2892 && var45 && var9.field2881 != null) {
                                    class1 var51 = new class1();
                                    var51.field2 = true;
                                    var51.field9 = var9;
                                    var51.field15 = class141.field2163 - var10;
                                    var51.field5 = class141.field2164 - var11;
                                    var51.field13 = var9.field2881;
                                    field284.method3548(var51);
                                }
                                if (var9.field2892 && !var45) {
                                    var9.field2892 = false;
                                    if (var9.field2850 != null) {
                                        class1 var52 = new class1();
                                        var52.field2 = true;
                                        var52.field9 = var9;
                                        var52.field15 = class141.field2163 - var10;
                                        var52.field5 = class141.field2164 - var11;
                                        var52.field13 = var9.field2850;
                                        field479.method3548(var52);
                                    }
                                }
                                if (var45 && var9.field2851 != null) {
                                    class1 var53 = new class1();
                                    var53.field2 = true;
                                    var53.field9 = var9;
                                    var53.field15 = class141.field2163 - var10;
                                    var53.field5 = class141.field2164 - var11;
                                    var53.field13 = var9.field2851;
                                    field284.method3548(var53);
                                }
                                if (!var9.field2889 && var44) {
                                    var9.field2889 = true;
                                    if (var9.field2852 != null) {
                                        class1 var54 = new class1();
                                        var54.field2 = true;
                                        var54.field9 = var9;
                                        var54.field15 = class141.field2163 - var10;
                                        var54.field5 = class141.field2164 - var11;
                                        var54.field13 = var9.field2852;
                                        field284.method3548(var54);
                                    }
                                }
                                if (var9.field2889 && var44 && var9.field2853 != null) {
                                    class1 var55 = new class1();
                                    var55.field2 = true;
                                    var55.field9 = var9;
                                    var55.field15 = class141.field2163 - var10;
                                    var55.field5 = class141.field2164 - var11;
                                    var55.field13 = var9.field2853;
                                    field284.method3548(var55);
                                }
                                if (var9.field2889 && !var44) {
                                    var9.field2889 = false;
                                    if (var9.field2854 != null) {
                                        class1 var56 = new class1();
                                        var56.field2 = true;
                                        var56.field9 = var9;
                                        var56.field15 = class141.field2163 - var10;
                                        var56.field5 = class141.field2164 - var11;
                                        var56.field13 = var9.field2854;
                                        field479.method3548(var56);
                                    }
                                }
                                if (var9.field2794 != null) {
                                    class1 var57 = new class1();
                                    var57.field9 = var9;
                                    var57.field13 = var9.field2794;
                                    field329.method3548(var57);
                                }
                                if (var9.field2809 != null && field465 > var9.field2894) {
                                    if (var9.field2772 == null || field465 - var9.field2894 > 32) {
                                        class1 var62 = new class1();
                                        var62.field9 = var9;
                                        var62.field13 = var9.field2809;
                                        field284.method3548(var62);
                                    } else {
                                        label528: for (int var58 = var9.field2894; var58 < field465; var58++) {
                                            int var59 = field464[var58 & 0x1F];
                                            for (int var60 = 0; var60 < var9.field2772.length; var60++) {
                                                if (var9.field2772[var60] == var59) {
                                                    class1 var61 = new class1();
                                                    var61.field9 = var9;
                                                    var61.field13 = var9.field2809;
                                                    field284.method3548(var61);
                                                    break label528;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2894 = field465;
                                }
                                if (var9.field2861 != null && field447 > var9.field2895) {
                                    if (var9.field2759 == null || field447 - var9.field2895 > 32) {
                                        class1 var67 = new class1();
                                        var67.field9 = var9;
                                        var67.field13 = var9.field2861;
                                        field284.method3548(var67);
                                    } else {
                                        label504: for (int var63 = var9.field2895; var63 < field447; var63++) {
                                            int var64 = field466[var63 & 0x1F];
                                            for (int var65 = 0; var65 < var9.field2759.length; var65++) {
                                                if (var9.field2759[var65] == var64) {
                                                    class1 var66 = new class1();
                                                    var66.field9 = var9;
                                                    var66.field13 = var9.field2861;
                                                    field284.method3548(var66);
                                                    break label504;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2895 = field447;
                                }
                                if (var9.field2863 != null && field469 > var9.field2896) {
                                    if (var9.field2864 == null || field469 - var9.field2896 > 32) {
                                        class1 var72 = new class1();
                                        var72.field9 = var9;
                                        var72.field13 = var9.field2863;
                                        field284.method3548(var72);
                                    } else {
                                        label480: for (int var68 = var9.field2896; var68 < field469; var68++) {
                                            int var69 = field468[var68 & 0x1F];
                                            for (int var70 = 0; var70 < var9.field2864.length; var70++) {
                                                if (var9.field2864[var70] == var69) {
                                                    class1 var71 = new class1();
                                                    var71.field9 = var9;
                                                    var71.field13 = var9.field2863;
                                                    field284.method3548(var71);
                                                    break label480;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2896 = field469;
                                }
                                if (field470 > var9.field2807 && var9.field2868 != null) {
                                    class1 var73 = new class1();
                                    var73.field9 = var9;
                                    var73.field13 = var9.field2868;
                                    field284.method3548(var73);
                                }
                                if (field471 > var9.field2807 && var9.field2870 != null) {
                                    class1 var74 = new class1();
                                    var74.field9 = var9;
                                    var74.field13 = var9.field2870;
                                    field284.method3548(var74);
                                }
                                if (field452 > var9.field2807 && var9.field2871 != null) {
                                    class1 var75 = new class1();
                                    var75.field9 = var9;
                                    var75.field13 = var9.field2871;
                                    field284.method3548(var75);
                                }
                                if (field439 > var9.field2807 && var9.field2876 != null) {
                                    class1 var76 = new class1();
                                    var76.field9 = var9;
                                    var76.field13 = var9.field2876;
                                    field284.method3548(var76);
                                }
                                if (field564 > var9.field2807 && var9.field2793 != null) {
                                    class1 var77 = new class1();
                                    var77.field9 = var9;
                                    var77.field13 = var9.field2793;
                                    field284.method3548(var77);
                                }
                                if (field475 > var9.field2807 && var9.field2783 != null) {
                                    class1 var78 = new class1();
                                    var78.field9 = var9;
                                    var78.field13 = var9.field2783;
                                    field284.method3548(var78);
                                }
                                var9.field2807 = field463;
                                if (var9.field2869 != null) {
                                    for (int var79 = 0; var79 < field501; var79++) {
                                        class1 var80 = new class1();
                                        var80.field9 = var9;
                                        var80.field8 = field409[var79];
                                        var80.field4 = field502[var79];
                                        var80.field13 = var9.field2869;
                                        field284.method3548(var80);
                                    }
                                }
                            }
                        }
                        if (!var9.field2765 && field451 == null && Statics.field627 == null && !field419) {
                            if ((var9.field2762 >= 0 || var9.field2828 != 0) && class141.field2163 >= var12 && class141.field2164 >= var13 && class141.field2163 < var14 && class141.field2164 < var15) {
                                if (var9.field2762 >= 0) {
                                    Statics.field79 = arg0[var9.field2762];
                                } else {
                                    Statics.field79 = var9;
                                }
                            }
                            if (var9.field2768 == 8 && class141.field2163 >= var12 && class141.field2164 >= var13 && class141.field2163 < var14 && class141.field2164 < var15) {
                                Statics.field665 = var9;
                            }
                            if (var9.field2859 > var9.field2782) {
                                method2222(var9, var9.field2887 + var10, var11, var9.field2782, var9.field2859, class141.field2163, class141.field2164);
                            }
                        }
                    } else if ((field294 == 0 || field294 == 3) && (class141.field2160 == 1 || !Statics.field1564 && class141.field2160 == 4)) {
                        class176 var26 = var9.method3175(true);
                        if (var26 != null) {
                            int var27 = class141.field2170 - var10;
                            int var28 = class141.field2171 - var11;
                            if (var26.method3198(var27, var28)) {
                                int var29 = var27 - var26.field2915 / 2;
                                int var30 = var28 - var26.field2910 / 2;
                                int var31 = field411 + field365 & 0x7FF;
                                int var32 = class92.field1597[var31];
                                int var33 = class92.field1598[var31];
                                int var34 = (field354 + 256) * var32 >> 8;
                                int var35 = (field354 + 256) * var33 >> 8;
                                int var36 = var29 * var35 + var30 * var34 >> 11;
                                int var37 = var30 * var35 - var29 * var34 >> 11;
                                int var38 = Statics.field1882.field824 + var36 >> 7;
                                int var39 = Statics.field1882.field814 - var37 >> 7;
                                field323.method2583(156);
                                field323.method2323(18);
                                field323.method2527(class138.field2121[82] ? (class138.field2121[81] ? 2 : 1) : 0);
                                field323.method2470(Statics.field595 + var38);
                                field323.method2403(Statics.field1982 + var39);
                                field323.method2323(var29);
                                field323.method2323(var30);
                                field323.method2507(field365);
                                field323.method2323(57);
                                field323.method2323(field411);
                                field323.method2323(field354);
                                field323.method2323(89);
                                field323.method2507(Statics.field1882.field824);
                                field323.method2507(Statics.field1882.field814);
                                field323.method2323(63);
                                field513 = var38;
                                field514 = var39;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("u.cd([Lfu;II)V")
    public static final void method89(class174[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class174 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2768 == 0) {
                    if (var3.field2848 != null) {
                        method89(var3.field2848, arg1);
                    }
                    class4 var4 = (class4) field309.method3518((long) var3.field2827);
                    if (var4 != null) {
                        Statics.method1940(var4.field70, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2764 != null) {
                    class1 var5 = new class1();
                    var5.field9 = var3;
                    var5.field13 = var3.field2764;
                    class37.method192(var5);
                }
                if (arg1 == 1 && var3.field2874 != null) {
                    if (var3.field2767 >= 0) {
                        class174 var6 = class174.method634(var3.field2827);
                        if (var6 == null || var6.field2848 == null || var3.field2767 >= var6.field2848.length || var6.field2848[var3.field2767] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field9 = var3;
                    var7.field13 = var3.field2874;
                    class37.method192(var7);
                }
            }
        }
    }

    @ObfuscatedName("do.cn(Lfu;III)V")
    public static final void method2652(class174 arg0, int arg1, int arg2) {
        if (field451 != null || field419 || arg0 == null) {
            return;
        }
        class174 var3 = method2272(arg0);
        if (var3 == null) {
            var3 = arg0.field2872;
        }
        if (var3 == null) {
            return;
        }
        field451 = arg0;
        class174 var5 = method2272(arg0);
        if (var5 == null) {
            var5 = arg0.field2872;
        }
        field289 = var5;
        field453 = arg1;
        field454 = arg2;
        Statics.field1189 = 0;
        field462 = false;
        if (field497 > 0) {
            method953(field497 - 1);
        }
        return;
    }

    @ObfuscatedName("af.cx(I)V")
    public static final void method913() {
        method687(field451);
        Statics.field1189++;
        if (field459 && field456) {
            int var0 = class141.field2163;
            int var1 = class141.field2164;
            int var2 = var0 - field453;
            int var3 = var1 - field454;
            if (var2 < field457) {
                var2 = field457;
            }
            if (field451.field2887 + var2 > field457 + field289.field2887) {
                var2 = field457 + field289.field2887 - field451.field2887;
            }
            if (var3 < field458) {
                var3 = field458;
            }
            if (field451.field2782 + var3 > field458 + field289.field2782) {
                var3 = field458 + field289.field2782 - field451.field2782;
            }
            int var4 = var2 - field560;
            int var5 = var3 - field461;
            int var6 = field451.field2842;
            if (Statics.field1189 > field451.field2843 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field462 = true;
            }
            int var7 = field289.field2787 + (var2 - field457);
            int var8 = field289.field2788 + (var3 - field458);
            if (field451.field2855 != null && field462) {
                class1 var9 = new class1();
                var9.field9 = field451;
                var9.field15 = var7;
                var9.field5 = var8;
                var9.field13 = field451.field2855;
                class37.method192(var9);
            }
            if (class141.field2162 == 0) {
                if (field462) {
                    if (field451.field2856 != null) {
                        class1 var10 = new class1();
                        var10.field9 = field451;
                        var10.field15 = var7;
                        var10.field5 = var8;
                        var10.field7 = field455;
                        var10.field13 = field451.field2856;
                        class37.method192(var10);
                    }
                    if (field455 != null && method2272(field451) != null) {
                        field323.method2583(124);
                        field323.method2507(field455.field2886);
                        field323.method2377(field455.field2827);
                        field323.method2340(field451.field2827);
                        field323.method2371(field451.field2767);
                        field323.method2403(field455.field2767);
                        field323.method2371(field451.field2886);
                    }
                } else if ((field546 == 1 || method681(field497 - 1)) && field497 > 2) {
                    method752(field560 + field453, field461 + field454);
                } else if (field497 > 0) {
                    int var11 = field560 + field453;
                    int var12 = field461 + field454;
                    class31 var13 = Statics.field232;
                    method166(var13.field714, var13.field705, var13.field706, var13.field712, var13.field704, var13.field704, var11, var12);
                    Statics.field232 = null;
                }
                field451 = null;
            }
        } else if (Statics.field1189 > 1) {
            field451 = null;
        }
    }

    @ObfuscatedName("ac.dm(II)V")
    public static void method953(int arg0) {
        Statics.field232 = new class31();
        Statics.field232.field714 = field421[arg0];
        Statics.field232.field705 = field422[arg0];
        Statics.field232.field706 = field423[arg0];
        Statics.field232.field712 = field379[arg0];
        Statics.field232.field704 = field425[arg0];
    }

    @ObfuscatedName("as.dh(Lfu;I)V")
    public static void method687(class174 arg0) {
        if (field488 == arg0.field2898) {
            field483[arg0.field2897] = true;
        }
    }

    @ObfuscatedName("k.dz(B)V")
    public static void method110() {
        for (class4 var0 = (class4) field309.method3521(); var0 != null; var0 = (class4) field309.method3522()) {
            int var1 = var0.field70;
            if (class174.method3472(var1)) {
                boolean var2 = true;
                class174[] var3 = Statics.field3172[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2765;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3126;
                    class174 var6 = class174.method634(var5);
                    if (var6 != null) {
                        method687(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.dg([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method956(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("fy.dc(II)V")
    public static final void method2929(int arg0) {
        if (!class174.method3472(arg0)) {
            return;
        }
        class174[] var1 = Statics.field3172[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class174 var3 = var1[var2];
            if (var3 != null) {
                var3.field2835 = 0;
                var3.field2755 = 0;
            }
        }
    }

    @ObfuscatedName("fw.de(II)V")
    public static final void method3208(int arg0) {
        if (class174.method3472(arg0)) {
            Statics.method198(Statics.field3172[arg0], -1);
        }
    }

    @ObfuscatedName("bd.du(II)V")
    public static final void method1049(int arg0) {
        method110();
        class24.method97();
        int var1 = class53.method39(arg0).field1164;
        if (var1 == 0) {
            return;
        }
        int var2 = class177.field2921[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class92.method1969(0.9D);
                ((class96) Statics.field1594).method2030(0.9D);
            }
            if (var2 == 2) {
                class92.method1969(0.8D);
                ((class96) Statics.field1594).method2030(0.8D);
            }
            if (var2 == 3) {
                class92.method1969(0.7D);
                ((class96) Statics.field1594).method2030(0.7D);
            }
            if (var2 == 4) {
                class92.method1969(0.6D);
                ((class96) Statics.field1594).method2030(0.6D);
            }
            class52.method3471();
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
            if (field517 != var3) {
                if (field517 == 0 && field371 != -1) {
                    class184.method1747(Statics.field1777, field371, 0, var3, false);
                    field519 = false;
                } else if (var3 == 0) {
                    class184.method2225();
                    field519 = false;
                } else if (class184.field2974 == 0) {
                    Statics.field2973.method3349(var3);
                } else {
                    Statics.field2972 = var3;
                }
                field517 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field520 = 127;
            }
            if (var2 == 1) {
                field520 = 96;
            }
            if (var2 == 2) {
                field520 = 64;
            }
            if (var2 == 3) {
                field520 = 32;
            }
            if (var2 == 4) {
                field520 = 0;
            }
        }
        if (var1 == 5) {
            field546 = var2;
        }
        if (var1 == 6) {
            field440 = var2;
        }
        if (var1 == 9) {
            field350 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field521 = 127;
            }
            if (var2 == 1) {
                field521 = 96;
            }
            if (var2 == 2) {
                field521 = 64;
            }
            if (var2 == 3) {
                field521 = 32;
            }
            if (var2 == 4) {
                field521 = 0;
            }
        }
        if (var1 == 17) {
            field446 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field305 = (class21) class110.method1520(class21.method35(), var2);
            if (field305 == null) {
                field305 = class21.field572;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field410 = -1;
            } else {
                field410 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class21[] var4 = new class21[] { class21.field573, class21.field566, class21.field568, class21.field572 };
        field306 = (class21) class110.method1520(var4, var2);
        if (field306 == null) {
            field306 = class21.field572;
        }
    }

    @ObfuscatedName("c.dk(IIII)Lx;")
    public static final class4 method116(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field70 = arg1;
        var3.field63 = arg2;
        field309.method3519(var3, (long) arg0);
        method2929(arg1);
        class174 var4 = class174.method634(arg0);
        method687(var4);
        if (field442 != null) {
            method687(field442);
            field442 = null;
        }
        method95();
        method2638(Statics.field3172[arg0 >> 16], var4, false);
        class37.method193(arg1);
        if (field413 != -1) {
            Statics.method1940(field413, 1);
        }
        return var3;
    }

    @ObfuscatedName("aa.dx(Lx;ZI)V")
    public static final void method717(class4 arg0, boolean arg1) {
        int var2 = arg0.field70;
        int var3 = (int) arg0.field3126;
        arg0.method3639();
        if (arg1) {
            class174.method9(var2);
        }
        method2280(var2);
        class174 var4 = class174.method634(var3);
        if (var4 != null) {
            method687(var4);
        }
        method95();
        if (field413 != -1) {
            Statics.method1940(field413, 1);
        }
    }

    @ObfuscatedName("aw.db(Lfu;I)Z")
    public static final boolean method871(class174 arg0) {
        int var1 = arg0.field2888;
        if (var1 == 205) {
            field333 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field351.method3229(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field351.method3237(var4, var5 == 1);
        }
        if (var1 == 324) {
            field351.method3231(false);
        }
        if (var1 == 325) {
            field351.method3231(true);
        }
        if (var1 == 326) {
            field323.method2583(7);
            field351.method3250(field323);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aj.dn(IIIILcs;Lfs;I)V")
    public static final void method813(int arg0, int arg1, int arg2, int arg3, class79 arg4, class176 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method159(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field411 + field365 & 0x7FF;
        int var8 = class92.field1597[var7];
        int var9 = class92.field1598[var7];
        int var10 = var8 * 256 / (field354 + 256);
        int var11 = var9 * 256 / (field354 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field621.method1582(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("r.dq(IIIILcs;Lfs;B)V")
    public static final void method159(int arg0, int arg1, int arg2, int arg3, class79 arg4, class176 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field411 + field365 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class92.field1597[var6];
        int var9 = class92.field1598[var6];
        int var10 = var8 * 256 / (field354 + 256);
        int var11 = var9 * 256 / (field354 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1580(arg5.field2915 / 2 + var12 - arg4.field1417 / 2, arg5.field2910 / 2 - var13 - arg4.field1413 / 2, arg0, arg1, arg5.field2915, arg5.field2910, arg5.field2912, arg5.field2911);
        } else {
            arg4.method1570(arg5.field2915 / 2 + arg0 + var12 - arg4.field1417 / 2, arg5.field2910 / 2 + arg1 - var13 - arg4.field1413 / 2);
        }
    }

    @ObfuscatedName("w.dt(Ljava/lang/String;ZI)Z")
    public static boolean method236(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class165.method679(arg0, Statics.field25);
        for (int var3 = 0; var3 < field500; var3++) {
            if (var2.equalsIgnoreCase(class165.method679(field549[var3].field248, Statics.field25)) && (!arg1 || field549[var3].field245 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class165.method679(Statics.field1882.field60, Statics.field25))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("h.dp(Ljava/lang/String;I)Z")
    public static boolean method191(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class165.method679(arg0, Statics.field25);
        for (int var2 = 0; var2 < field551; var2++) {
            class8 var3 = field345[var2];
            if (var1.equalsIgnoreCase(class165.method679(var3.field134, Statics.field25))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class165.method679(var3.field136, Statics.field25))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("j.ds(Ljava/lang/String;ZI)V")
    public static final void method7(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field551 < 100 || field403 == 1) || field551 >= 400) {
            class12.method2629(31, "", class158.field2481);
            return;
        }
        String var2 = class165.method679(arg0, Statics.field25);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field551; var3++) {
            class8 var4 = field345[var3];
            String var5 = class165.method679(var4.field134, Statics.field25);
            if (var5 != null && var5.equals(var2)) {
                class12.method2629(31, "", arg0 + class158.field2486);
                return;
            }
            if (var4.field136 != null) {
                String var6 = class165.method679(var4.field136, Statics.field25);
                if (var6 != null && var6.equals(var2)) {
                    class12.method2629(31, "", arg0 + class158.field2486);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field500; var7++) {
            class18 var8 = field549[var7];
            String var9 = class165.method679(var8.field248, Statics.field25);
            if (var9 != null && var9.equals(var2)) {
                class12.method2629(31, "", class158.field2491 + arg0 + class158.field2550);
                return;
            }
            if (var8.field241 != null) {
                String var10 = class165.method679(var8.field241, Statics.field25);
                if (var10 != null && var10.equals(var2)) {
                    class12.method2629(31, "", class158.field2491 + arg0 + class158.field2550);
                    return;
                }
            }
        }
        if (class165.method679(Statics.field1882.field60, Statics.field25).equals(var2)) {
            class12.method2629(31, "", class158.field2595);
        } else {
            field323.method2583(33);
            field323.method2323(class120.method636(arg0));
            field323.method2329(arg0);
        }
    }

    @ObfuscatedName("ec.dj(Ljava/lang/String;I)V")
    public static final void method2737(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class165.method679(arg0, Statics.field25);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field551; var2++) {
            class8 var3 = field345[var2];
            String var4 = var3.field134;
            String var5 = class165.method679(var4, Statics.field25);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field551--;
                for (int var7 = var2; var7 < field551; var7++) {
                    field345[var7] = field345[var7 + 1];
                }
                field471 = field463;
                field323.method2583(196);
                field323.method2323(class120.method636(arg0));
                field323.method2329(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("p.dy(Ljava/lang/String;II)V")
    public static final void method30(String arg0, int arg1) {
        field323.method2583(120);
        field323.method2323(class120.method636(arg0) + 1);
        field323.method2362(arg1);
        field323.method2329(arg0);
    }

    @ObfuscatedName("ds.di(I)V")
    public static final void method2540() {
        field323.method2583(21);
        field323.method2323(0);
    }

    @ObfuscatedName("dx.dd(II)V")
    public static void method2280(int arg0) {
        for (class202 var1 = (class202) field480.method3521(); var1 != null; var1 = (class202) field480.method3522()) {
            if ((long) arg0 == (var1.field3126 >> 48 & 0xFFFFL)) {
                var1.method3639();
            }
        }
    }

    @ObfuscatedName("ac.df(Lfu;I)I")
    public static int method942(class174 arg0) {
        class202 var1 = (class202) field480.method3518(((long) arg0.field2827 << 32) + (long) arg0.field2767);
        return var1 == null ? arg0.field2815 : var1.field3112;
    }

    @ObfuscatedName("du.dv(Lfu;B)Lfu;")
    public static class174 method2272(class174 arg0) {
        int var1 = class179.method2991(method942(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class174.method634(arg0.field2785);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("ca.da(Lfu;B)Z")
    public static boolean method1768(class174 arg0) {
        if (field536) {
            if (method942(arg0) != 0) {
                return false;
            }
            if (arg0.field2768 == 0) {
                return false;
            }
        }
        return arg0.field2774;
    }

    @ObfuscatedName("e.dl(Lfu;II)Ljava/lang/String;")
    public static String method187(class174 arg0, int arg1) {
        if (!class179.method96(method942(arg0), arg1) && arg0.field2866 == null) {
            return null;
        } else if (arg0.field2840 == null || arg0.field2840.length <= arg1 || arg0.field2840[arg1] == null || arg0.field2840[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2840[arg1];
        }
    }

    @ObfuscatedName("di.dw(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method2604(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field282 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field282 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field282 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field282 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field282 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field165 != null) {
            var3 = "/p=" + Statics.field165;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field286 + "/a=" + Statics.field208 + var3 + "/";
    }

    @ObfuscatedName("aj.do(Ljava/lang/String;ZI)V")
    public static void method816(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1111; var5++) {
            class52 var6 = class52.method126(var5);
            if ((!arg1 || var6.field1155) && var6.field1148 == -1 && var6.field1129.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field96 = -1;
                    Statics.field874 = null;
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
        Statics.field874 = var3;
        Statics.field1084 = 0;
        Statics.field96 = var4;
        String[] var9 = new String[Statics.field96];
        for (int var10 = 0; var10 < Statics.field96; var10++) {
            var9[var10] = class52.method126(var3[var10]).field1129;
        }
        short[] var11 = Statics.field874;
        class125.method2286(var9, var11, 0, var9.length - 1);
    }
}

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
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class144 {

    @ObfuscatedName("client.u")
    public static boolean field277 = true;

    @ObfuscatedName("client.b")
    public static int field543 = 1;

    @ObfuscatedName("client.p")
    public static int field435 = 0;

    @ObfuscatedName("client.t")
    public static int field280 = 0;

    @ObfuscatedName("client.w")
    public static class108[] field512 = new class108[4];

    @ObfuscatedName("client.l")
    public static boolean field282 = false;

    @ObfuscatedName("client.n")
    public static boolean field283 = false;

    @ObfuscatedName("client.q")
    public static int field284 = 0;

    @ObfuscatedName("client.r")
    public static int field546 = 0;

    @ObfuscatedName("client.i")
    public static boolean field287 = true;

    @ObfuscatedName("client.j")
    public static int field288 = 0;

    @ObfuscatedName("client.z")
    public static long field375 = -1L;

    @ObfuscatedName("client.g")
    public static int field459 = -1;

    @ObfuscatedName("client.c")
    public static int field291 = -1;

    @ObfuscatedName("client.ah")
    public static int field292 = -1;

    @ObfuscatedName("client.ap")
    public static boolean field371 = true;

    @ObfuscatedName("client.aa")
    public static boolean field509 = false;

    @ObfuscatedName("client.ay")
    public static int field295 = 0;

    @ObfuscatedName("client.ak")
    public static int field465 = 0;

    @ObfuscatedName("client.an")
    public static int field297 = 0;

    @ObfuscatedName("client.af")
    public static int field298 = 0;

    @ObfuscatedName("client.ao")
    public static int field299 = 0;

    @ObfuscatedName("client.as")
    public static int field300 = 0;

    @ObfuscatedName("client.am")
    public static int field301 = 0;

    @ObfuscatedName("client.ae")
    public static int field364 = 0;

    @ObfuscatedName("client.ax")
    public static int field507 = 0;

    @ObfuscatedName("client.av")
    public static class21 field309 = class21.field566;

    @ObfuscatedName("client.aq")
    public static class21 field305 = class21.field566;

    @ObfuscatedName("client.ar")
    public static int field351 = 0;

    @ObfuscatedName("client.au")
    public static int field307 = 0;

    @ObfuscatedName("client.aw")
    public static int field308 = 0;

    @ObfuscatedName("client.by")
    public static int field386 = 0;

    @ObfuscatedName("client.bh")
    public static int field311 = 0;

    @ObfuscatedName("client.bj")
    public static int field424 = 0;

    @ObfuscatedName("client.bu")
    public static int field313 = 0;

    @ObfuscatedName("client.bt")
    public static int field322 = 0;

    @ObfuscatedName("client.cc")
    public static class35[] field315 = new class35[32768];

    @ObfuscatedName("client.ce")
    public static int field339 = 0;

    @ObfuscatedName("client.cj")
    public static int[] field530 = new int[32768];

    @ObfuscatedName("client.ci")
    public static int field318 = 0;

    @ObfuscatedName("client.cs")
    public static int[] field286 = new int[250];

    @ObfuscatedName("client.co")
    public static class122 field312 = new class122(5000);

    @ObfuscatedName("client.cv")
    public static class122 field321 = new class122(5000);

    @ObfuscatedName("client.cq")
    public static class122 field407 = new class122(15000);

    @ObfuscatedName("client.ct")
    public static int field323 = 0;

    @ObfuscatedName("client.cm")
    public static int field334 = 0;

    @ObfuscatedName("client.cb")
    public static int field325 = 0;

    @ObfuscatedName("client.cz")
    public static int field296 = 0;

    @ObfuscatedName("client.ca")
    public static int field327 = 0;

    @ObfuscatedName("client.cl")
    public static int field328 = 0;

    @ObfuscatedName("client.cx")
    public static int field329 = 0;

    @ObfuscatedName("client.cd")
    public static int field330 = 0;

    @ObfuscatedName("client.cw")
    public static boolean field331 = false;

    @ObfuscatedName("client.dg")
    public static int field279 = 0;

    @ObfuscatedName("client.dr")
    public static int field473 = 1;

    @ObfuscatedName("client.de")
    public static int field354 = 0;

    @ObfuscatedName("client.dx")
    public static int field515 = 1;

    @ObfuscatedName("client.ds")
    public static int field397 = 0;

    @ObfuscatedName("client.dw")
    public static boolean field310 = false;

    @ObfuscatedName("client.dm")
    public static int[][][] field387 = new int[4][13][13];

    @ObfuscatedName("client.dt")
    public static final int[] field340 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dz")
    public static int field341 = 0;

    @ObfuscatedName("client.do")
    public static int field342 = 2;

    @ObfuscatedName("client.df")
    public static int field343 = 0;

    @ObfuscatedName("client.dq")
    public static int field344 = 2;

    @ObfuscatedName("client.du")
    public static int field345 = 0;

    @ObfuscatedName("client.ey")
    public static int field441 = 1;

    @ObfuscatedName("client.en")
    public static int field389 = 0;

    @ObfuscatedName("client.eu")
    public static int field348 = 0;

    @ObfuscatedName("client.eb")
    public static int field349 = 2;

    @ObfuscatedName("client.eh")
    public static int field350 = 0;

    @ObfuscatedName("client.ed")
    public static int field404 = 1;

    @ObfuscatedName("client.ev")
    public static int field380 = 0;

    @ObfuscatedName("client.eg")
    public static int field353 = 0;

    @ObfuscatedName("client.ek")
    public static int field533 = 2301979;

    @ObfuscatedName("client.ep")
    public static int field352 = 5063219;

    @ObfuscatedName("client.es")
    public static int field356 = 3353893;

    @ObfuscatedName("client.ez")
    public static int field357 = 7759444;

    @ObfuscatedName("client.ec")
    public static boolean field358 = false;

    @ObfuscatedName("client.fl")
    public static int field359 = 0;

    @ObfuscatedName("client.fd")
    public static int field360 = 128;

    @ObfuscatedName("client.fh")
    public static int field361 = 0;

    @ObfuscatedName("client.fo")
    public static int field401 = 0;

    @ObfuscatedName("client.fn")
    public static int field363 = 0;

    @ObfuscatedName("client.fq")
    public static int field511 = 0;

    @ObfuscatedName("client.fr")
    public static int field365 = 0;

    @ObfuscatedName("client.fs")
    public static int field320 = 50;

    @ObfuscatedName("client.fv")
    public static int field355 = 0;

    @ObfuscatedName("client.fa")
    public static boolean field490 = false;

    @ObfuscatedName("client.ft")
    public static int field425 = 0;

    @ObfuscatedName("client.ff")
    public static int field290 = 0;

    @ObfuscatedName("client.fm")
    public static int field319 = 50;

    @ObfuscatedName("client.fp")
    public static int[] field372 = new int[field319];

    @ObfuscatedName("client.fz")
    public static int[] field373 = new int[field319];

    @ObfuscatedName("client.fj")
    public static int[] field440 = new int[field319];

    @ObfuscatedName("client.fg")
    public static int[] field324 = new int[field319];

    @ObfuscatedName("client.fy")
    public static int[] field376 = new int[field319];

    @ObfuscatedName("client.fb")
    public static int[] field377 = new int[field319];

    @ObfuscatedName("client.gc")
    public static int[] field462 = new int[field319];

    @ObfuscatedName("client.gk")
    public static String[] field461 = new String[field319];

    @ObfuscatedName("client.gy")
    public static int[][] field333 = new int[104][104];

    @ObfuscatedName("client.gt")
    public static int field428 = 0;

    @ObfuscatedName("client.gw")
    public static int field382 = -1;

    @ObfuscatedName("client.gd")
    public static int field383 = -1;

    @ObfuscatedName("client.gm")
    public static int field480 = 0;

    @ObfuscatedName("client.gq")
    public static int field385 = 0;

    @ObfuscatedName("client.gj")
    public static int field534 = 0;

    @ObfuscatedName("client.gp")
    public static int field381 = 0;

    @ObfuscatedName("client.ga")
    public static int field388 = 0;

    @ObfuscatedName("client.gh")
    public static int field487 = 0;

    @ObfuscatedName("client.gu")
    public static int field390 = 0;

    @ObfuscatedName("client.gi")
    public static int field391 = 0;

    @ObfuscatedName("client.gs")
    public static int field392 = 0;

    @ObfuscatedName("client.gz")
    public static int field393 = 0;

    @ObfuscatedName("client.go")
    public static boolean field498 = false;

    @ObfuscatedName("client.gr")
    public static int field395 = 0;

    @ObfuscatedName("client.ge")
    public static int field396 = 0;

    @ObfuscatedName("client.gx")
    public static class3[] field337 = new class3[2048];

    @ObfuscatedName("client.gn")
    public static int field398 = -1;

    @ObfuscatedName("client.ho")
    public static int field399 = 0;

    @ObfuscatedName("client.hn")
    public static int field400 = 0;

    @ObfuscatedName("client.ha")
    public static int[] field336 = new int[1000];

    @ObfuscatedName("client.hv")
    public static final int[] field523 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hz")
    public static String[] field403 = new String[8];

    @ObfuscatedName("client.hj")
    public static boolean[] field439 = new boolean[8];

    @ObfuscatedName("client.hq")
    public static int[] field405 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hi")
    public static int field303 = -1;

    @ObfuscatedName("client.hc")
    public static class199[][][] field552 = new class199[4][104][104];

    @ObfuscatedName("client.hh")
    public static class199 field408 = new class199();

    @ObfuscatedName("client.hu")
    public static class199 field409 = new class199();

    @ObfuscatedName("client.he")
    public static class199 field558 = new class199();

    @ObfuscatedName("client.hy")
    public static int[] field411 = new int[25];

    @ObfuscatedName("client.hp")
    public static int[] field412 = new int[25];

    @ObfuscatedName("client.hw")
    public static int[] field413 = new int[25];

    @ObfuscatedName("client.ht")
    public static int field526 = 0;

    @ObfuscatedName("client.hb")
    public static boolean field415 = false;

    @ObfuscatedName("client.hm")
    public static int field416 = 0;

    @ObfuscatedName("client.hk")
    public static int[] field417 = new int[500];

    @ObfuscatedName("client.ib")
    public static int[] field418 = new int[500];

    @ObfuscatedName("client.il")
    public static int[] field419 = new int[500];

    @ObfuscatedName("client.iq")
    public static int[] field420 = new int[500];

    @ObfuscatedName("client.in")
    public static String[] field421 = new String[500];

    @ObfuscatedName("client.ir")
    public static String[] field332 = new String[500];

    @ObfuscatedName("client.ik")
    public static int field423 = -1;

    @ObfuscatedName("client.iu")
    public static int field541 = -1;

    @ObfuscatedName("client.ii")
    public static int field426 = 0;

    @ObfuscatedName("client.ia")
    public static int field427 = 50;

    @ObfuscatedName("client.ie")
    public static int field458 = 0;

    @ObfuscatedName("client.it")
    public static String field338 = null;

    @ObfuscatedName("client.ih")
    public static boolean field430 = false;

    @ObfuscatedName("client.iy")
    public static int field431 = -1;

    @ObfuscatedName("client.ic")
    public static int field432 = -1;

    @ObfuscatedName("client.ip")
    public static String field433 = null;

    @ObfuscatedName("client.ij")
    public static String field434 = null;

    @ObfuscatedName("client.iz")
    public static int field379 = -1;

    @ObfuscatedName("client.iw")
    public static class196 field436 = new class196(8);

    @ObfuscatedName("client.jj")
    public static int field437 = 0;

    @ObfuscatedName("client.jd")
    public static int field438 = 0;

    @ObfuscatedName("client.jl")
    public static class173 field454 = null;

    @ObfuscatedName("client.jp")
    public static int field369 = 0;

    @ObfuscatedName("client.ji")
    public static int field455 = 0;

    @ObfuscatedName("client.ju")
    public static int field442 = 0;

    @ObfuscatedName("client.jb")
    public static int field443 = -1;

    @ObfuscatedName("client.jk")
    public static boolean field444 = false;

    @ObfuscatedName("client.je")
    public static boolean field445 = false;

    @ObfuscatedName("client.jw")
    public static boolean field446 = false;

    @ObfuscatedName("client.jg")
    public static class173 field347 = null;

    @ObfuscatedName("client.jc")
    public static class173 field304 = null;

    @ObfuscatedName("client.js")
    public static class173 field449 = null;

    @ObfuscatedName("client.jx")
    public static int field275 = 0;

    @ObfuscatedName("client.ja")
    public static int field451 = 0;

    @ObfuscatedName("client.jh")
    public static class173 field452 = null;

    @ObfuscatedName("client.jf")
    public static boolean field453 = false;

    @ObfuscatedName("client.jo")
    public static int field503 = -1;

    @ObfuscatedName("client.jv")
    public static int field429 = -1;

    @ObfuscatedName("client.jt")
    public static boolean field456 = false;

    @ObfuscatedName("client.jy")
    public static int field457 = -1;

    @ObfuscatedName("client.jz")
    public static int field535 = -1;

    @ObfuscatedName("client.jr")
    public static boolean field294 = false;

    @ObfuscatedName("client.ke")
    public static int field460 = 1;

    @ObfuscatedName("client.kz")
    public static int[] field317 = new int[32];

    @ObfuscatedName("client.kw")
    public static int field370 = 0;

    @ObfuscatedName("client.ku")
    public static int[] field463 = new int[32];

    @ObfuscatedName("client.ks")
    public static int field464 = 0;

    @ObfuscatedName("client.kr")
    public static int[] field474 = new int[32];

    @ObfuscatedName("client.kp")
    public static int field466 = 0;

    @ObfuscatedName("client.ki")
    public static int field559 = 0;

    @ObfuscatedName("client.kb")
    public static int field468 = 0;

    @ObfuscatedName("client.kn")
    public static int field469 = 0;

    @ObfuscatedName("client.kc")
    public static int field471 = 0;

    @ObfuscatedName("client.kf")
    public static int field378 = 0;

    @ObfuscatedName("client.ka")
    public static int field472 = 0;

    @ObfuscatedName("client.kt")
    public static int field394 = 0;

    @ObfuscatedName("client.kj")
    public static class199 field410 = new class199();

    @ObfuscatedName("client.ko")
    public static class199 field475 = new class199();

    @ObfuscatedName("client.kv")
    public static class199 field476 = new class199();

    @ObfuscatedName("client.kd")
    public static class196 field477 = new class196(512);

    @ObfuscatedName("client.kg")
    public static int field478 = 0;

    @ObfuscatedName("client.kh")
    public static int field479 = -2;

    @ObfuscatedName("client.lr")
    public static boolean[] field450 = new boolean[100];

    @ObfuscatedName("client.lo")
    public static boolean[] field481 = new boolean[100];

    @ObfuscatedName("client.ln")
    public static boolean[] field482 = new boolean[100];

    @ObfuscatedName("client.lz")
    public static int[] field483 = new int[100];

    @ObfuscatedName("client.lc")
    public static int[] field484 = new int[100];

    @ObfuscatedName("client.lk")
    public static int[] field485 = new int[100];

    @ObfuscatedName("client.lu")
    public static int[] field486 = new int[100];

    @ObfuscatedName("client.lv")
    public static int field447 = 0;

    @ObfuscatedName("client.ls")
    public static long field488 = 0L;

    @ObfuscatedName("client.ll")
    public static boolean field510 = true;

    @ObfuscatedName("client.lp")
    public static int field402 = 765;

    @ObfuscatedName("client.lw")
    public static int field491 = 1;

    @ObfuscatedName("client.la")
    public static int[] field492 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lt")
    public static int field493 = 0;

    @ObfuscatedName("client.lm")
    public static int field494 = 0;

    @ObfuscatedName("client.lq")
    public static String field495 = "";

    @ObfuscatedName("client.lx")
    public static long[] field335 = new long[100];

    @ObfuscatedName("client.lj")
    public static int field497 = 0;

    @ObfuscatedName("client.le")
    public static int field367 = 0;

    @ObfuscatedName("client.mm")
    public static int[] field499 = new int[128];

    @ObfuscatedName("client.mg")
    public static int[] field500 = new int[128];

    @ObfuscatedName("client.ms")
    public static long field501 = -1L;

    @ObfuscatedName("client.ma")
    public static String field422 = null;

    @ObfuscatedName("client.me")
    public static String field316 = null;

    @ObfuscatedName("client.ml")
    public static int field504 = -1;

    @ObfuscatedName("client.mr")
    public static int field505 = 0;

    @ObfuscatedName("client.mx")
    public static int[] field506 = new int[1000];

    @ObfuscatedName("client.mv")
    public static int[] field517 = new int[1000];

    @ObfuscatedName("client.mt")
    public static class79[] field508 = new class79[1000];

    @ObfuscatedName("client.mo")
    public static int field314 = 0;

    @ObfuscatedName("client.mn")
    public static int field384 = 0;

    @ObfuscatedName("client.mc")
    public static int field366 = 0;

    @ObfuscatedName("client.mw")
    public static int field302 = 255;

    @ObfuscatedName("client.md")
    public static int field362 = -1;

    @ObfuscatedName("client.mu")
    public static boolean field514 = false;

    @ObfuscatedName("client.nm")
    public static int field306 = 127;

    @ObfuscatedName("client.no")
    public static int field516 = 127;

    @ObfuscatedName("client.nw")
    public static int field289 = 0;

    @ObfuscatedName("client.nk")
    public static int[] field518 = new int[50];

    @ObfuscatedName("client.nn")
    public static int[] field519 = new int[50];

    @ObfuscatedName("client.nt")
    public static int[] field414 = new int[50];

    @ObfuscatedName("client.ny")
    public static int[] field521 = new int[50];

    @ObfuscatedName("client.nq")
    public static class59[] field522 = new class59[50];

    @ObfuscatedName("client.nj")
    public static boolean field406 = false;

    @ObfuscatedName("client.ok")
    public static boolean[] field525 = new boolean[5];

    @ObfuscatedName("client.og")
    public static int[] field374 = new int[5];

    @ObfuscatedName("client.oi")
    public static int[] field527 = new int[5];

    @ObfuscatedName("client.ot")
    public static int[] field528 = new int[5];

    @ObfuscatedName("client.om")
    public static int[] field529 = new int[5];

    @ObfuscatedName("client.or")
    public static short field278 = 256;

    @ObfuscatedName("client.ou")
    public static short field531 = 205;

    @ObfuscatedName("client.on")
    public static short field532 = 256;

    @ObfuscatedName("client.ov")
    public static short field346 = 320;

    @ObfuscatedName("client.of")
    public static short field470 = 1;

    @ObfuscatedName("client.oe")
    public static short field448 = 32767;

    @ObfuscatedName("client.oy")
    public static short field536 = 1;

    @ObfuscatedName("client.ox")
    public static short field537 = 32767;

    @ObfuscatedName("client.od")
    public static int field538 = 0;

    @ObfuscatedName("client.ob")
    public static int field539 = 0;

    @ObfuscatedName("client.oj")
    public static int field513 = 0;

    @ObfuscatedName("client.oc")
    public static int field489 = 0;

    @ObfuscatedName("client.oq")
    public static int field542 = 0;

    @ObfuscatedName("client.oh")
    public static int field293 = 0;

    @ObfuscatedName("client.op")
    public static int field544 = 0;

    @ObfuscatedName("client.oo")
    public static class18[] field545 = new class18[400];

    @ObfuscatedName("client.ol")
    public static class195 field467 = new class195();

    @ObfuscatedName("client.oz")
    public static int field547 = 0;

    @ObfuscatedName("client.oa")
    public static class8[] field548 = new class8[400];

    @ObfuscatedName("client.po")
    public static class179 field549 = new class179();

    @ObfuscatedName("client.pj")
    public static int field550 = -1;

    @ObfuscatedName("client.pm")
    public static int field551 = -1;

    @ObfuscatedName("client.pg")
    public static class220[] field540 = new class220[8];

    @ObfuscatedName("client.pa")
    public static long field553 = -1L;

    @ObfuscatedName("client.pe")
    public static long field554 = -1L;

    @ObfuscatedName("client.pu")
    public static final class11 field555 = new class11();

    @ObfuscatedName("client.pr")
    public static int[] field556 = new int[50];

    @ObfuscatedName("client.pq")
    public static int[] field557 = new int[50];

    @ObfuscatedName("client.b(I)V")
    public final void method243() {
    }

    public final void init() {
        if (!this.method2850()) {
            return;
        }
        class190[] var1 = class190.method2277();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class190 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3058);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3058)) {
                    case 1:
                        Statics.field285 = var4;
                        break;
                    case 2:
                        int var5 = Integer.parseInt(var4);
                        class153[] var6 = class153.method3174();
                        int var7 = 0;
                        class153 var9;
                        while (true) {
                            if (var7 >= var6.length) {
                                var9 = null;
                                break;
                            }
                            class153 var8 = var6[var7];
                            if (var8.field2275 == var5) {
                                var9 = var8;
                                break;
                            }
                            var7++;
                        }
                        Statics.field2046 = var9;
                        break;
                    case 3:
                        if (var4.equalsIgnoreCase(class2.field27)) {
                        }
                        break;
                    case 4:
                        field435 = Integer.parseInt(var4);
                    case 5:
                    case 6:
                    case 13:
                    default:
                        break;
                    case 7:
                        if (var4.equalsIgnoreCase(class2.field27)) {
                            field282 = true;
                        } else {
                            field282 = false;
                        }
                        break;
                    case 8:
                        Statics.field2163 = var4;
                        break;
                    case 9:
                        field543 = Integer.parseInt(var4);
                        break;
                    case 10:
                        field284 = Integer.parseInt(var4);
                        break;
                    case 11:
                        Statics.field125 = Integer.parseInt(var4);
                        break;
                    case 12:
                        Statics.field808 = Integer.parseInt(var4);
                        break;
                    case 14:
                        Statics.field1946 = (class154) class109.method1468(class154.method2657(), Integer.parseInt(var4));
                        if (Statics.field1946 == class154.field2284) {
                            Statics.field281 = class212.field3131;
                        } else {
                            Statics.field281 = class212.field3133;
                        }
                        break;
                    case 15:
                        field280 = Integer.parseInt(var4);
                }
            }
        }
        class86.field1450 = false;
        field283 = false;
        Statics.field902 = this.getCodeBase().getHost();
        String var10 = Statics.field2046.field2274;
        byte var11 = 0;
        try {
            class149.method1752("oldschool", var10, var11, 16);
        } catch (Exception var13) {
            class148.method2262((String) null, var13);
        }
        Statics.field276 = this;
        this.method2835(765, 503, 104);
    }

    @ObfuscatedName("client.s(I)V")
    public final void method246() {
        Statics.field1667 = field280 == 0 ? 43594 : field543 + 40000;
        Statics.field119 = field280 == 0 ? 443 : field543 + 50000;
        Statics.field122 = Statics.field1667;
        Statics.field3149 = class174.field2893;
        Statics.field623 = class174.field2890;
        Statics.field2918 = class174.field2892;
        Statics.field1941 = class174.field2895;
        class137.method577();
        class137.method2257(Statics.field60);
        Canvas var1 = Statics.field60;
        var1.addMouseListener(class140.field2140);
        var1.addMouseMotionListener(class140.field2140);
        var1.addFocusListener(class140.field2140);
        class145 var2;
        try {
            var2 = new class145();
        } catch (Throwable var15) {
            var2 = null;
        }
        Statics.field873 = var2;
        if (Statics.field873 != null) {
            Statics.field873.method2668(Statics.field60);
        }
        Statics.field779 = new class134(255, class149.field2236, class149.field2227, 500000);
        class227 var4 = null;
        class9 var5 = new class9();
        try {
            var4 = class149.method2120("", Statics.field1946.field2285, false);
            byte[] var6 = new byte[(int) var4.method3867()];
            int var8;
            for (int var7 = 0; var7 < var6.length; var7 += var8) {
                var8 = var4.method3864(var6, var7, var6.length - var7);
                if (var8 == -1) {
                    throw new IOException();
                }
            }
            var5 = new class9(new class119(var6));
        } catch (Exception var16) {
        }
        try {
            if (var4 != null) {
                var4.method3866();
            }
        } catch (Exception var14) {
        }
        Statics.field2908 = var5;
        Statics.field1175 = this.getToolkit().getSystemClipboard();
        String var13 = Statics.field591;
        class138.field2133 = this;
        class138.field2127 = var13;
        if (field280 != 0) {
            field509 = true;
        }
        method640(Statics.field2908.field135);
    }

    @ObfuscatedName("client.y(B)V")
    public final void method476() {
        field288++;
        this.method250();
        while (true) {
            class199 var1 = class170.field2716;
            class169 var2;
            synchronized (class170.field2716) {
                var2 = (class169) class170.field2720.method3579();
            }
            if (var2 == null) {
                try {
                    if (class183.field2951 == 1) {
                        int var4 = Statics.field128.method3376();
                        if (var4 > 0 && Statics.field128.method3377()) {
                            int var5 = var4 - Statics.field2955;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field128.method3392(var5);
                        } else {
                            Statics.field128.method3427();
                            Statics.field128.method3379();
                            if (Statics.field2952 == null) {
                                class183.field2951 = 0;
                            } else {
                                class183.field2951 = 2;
                            }
                            Statics.field2958 = null;
                            Statics.field2948 = null;
                        }
                    }
                } catch (Exception var729) {
                    var729.printStackTrace();
                    Statics.field128.method3427();
                    class183.field2951 = 0;
                    Statics.field2958 = null;
                    Statics.field2948 = null;
                    Statics.field2952 = null;
                }
                method592();
                class137 var7 = class137.field2117;
                synchronized (class137.field2117) {
                    class137.field2122++;
                    class137.field2116 = class137.field2110;
                    class137.field2115 = 0;
                    if (class137.field2111 >= 0) {
                        while (class137.field2111 != class137.field2095) {
                            int var9 = class137.field2109[class137.field2095];
                            class137.field2095 = class137.field2095 + 1 & 0x7F;
                            if (var9 < 0) {
                                class137.field2124[~var9] = false;
                            } else {
                                if (!class137.field2124[var9] && class137.field2115 < class137.field2114.length - 1) {
                                    class137.field2114[++class137.field2115 - 1] = var9;
                                }
                                class137.field2124[var9] = true;
                            }
                        }
                    } else {
                        for (int var8 = 0; var8 < 112; var8++) {
                            class137.field2124[var8] = false;
                        }
                        class137.field2111 = class137.field2095;
                    }
                    class137.field2110 = class137.field2108;
                }
                class140.method645();
                if (Statics.field873 != null) {
                    int var11 = Statics.field873.method2670();
                    field394 = var11;
                }
                int var10002;
                if (field546 == 0) {
                    method3482();
                    class144.method2766();
                } else if (field546 == 5) {
                    class32.method162(this);
                    method3482();
                    class144.method2766();
                } else if (field546 == 10 || field546 == 11) {
                    class32.method162(this);
                } else if (field546 == 20) {
                    class32.method162(this);
                    method2961();
                } else if (field546 == 25) {
                    method88(false);
                    field279 = 0;
                    boolean var12 = true;
                    for (int var13 = 0; var13 < Statics.field1883.length; var13++) {
                        if (Statics.field2013[var13] != -1 && Statics.field1883[var13] == null) {
                            Statics.field1883[var13] = Statics.field3117.method3057(Statics.field2013[var13], 0);
                            if (Statics.field1883[var13] == null) {
                                var12 = false;
                                field279++;
                            }
                        }
                        if (Statics.field620[var13] != -1 && Statics.field650[var13] == null) {
                            Statics.field650[var13] = Statics.field3117.method3058(Statics.field620[var13], 0, Statics.field31[var13]);
                            if (Statics.field650[var13] == null) {
                                var12 = false;
                                field279++;
                            }
                        }
                    }
                    if (var12) {
                        field354 = 0;
                        boolean var14 = true;
                        for (int var15 = 0; var15 < Statics.field1883.length; var15++) {
                            byte[] var16 = Statics.field650[var15];
                            if (var16 != null) {
                                int var17 = (Statics.field1881[var15] >> 8) * 64 - Statics.field253;
                                int var18 = (Statics.field1881[var15] & 0xFF) * 64 - Statics.field2902;
                                if (field310) {
                                    var17 = 10;
                                    var18 = 10;
                                }
                                var14 &= class6.method3032(var16, var17, var18);
                            }
                        }
                        if (var14) {
                            if (field397 != 0) {
                                method1938(class157.field2316 + class2.field29 + class2.field30 + 100 + "%" + class2.field20, true);
                            }
                            method592();
                            method2036();
                            method592();
                            Statics.field3044.method1755();
                            method592();
                            System.gc();
                            for (int var19 = 0; var19 < 4; var19++) {
                                field512[var19].method2219();
                            }
                            for (int var20 = 0; var20 < 4; var20++) {
                                for (int var21 = 0; var21 < 104; var21++) {
                                    for (int var22 = 0; var22 < 104; var22++) {
                                        class6.field78[var20][var21][var22] = 0;
                                    }
                                }
                            }
                            method592();
                            class6.method3498();
                            int var23 = Statics.field1883.length;
                            for (class24 var24 = (class24) class24.field600.method3581(); var24 != null; var24 = (class24) class24.field600.method3583()) {
                                if (var24.field607 != null) {
                                    Statics.field2168.method1124(var24.field607);
                                    var24.field607 = null;
                                }
                                if (var24.field612 != null) {
                                    Statics.field2168.method1124(var24.field612);
                                    var24.field612 = null;
                                }
                            }
                            class24.field600.method3575();
                            method88(true);
                            if (!field310) {
                                for (int var25 = 0; var25 < var23; var25++) {
                                    int var26 = (Statics.field1881[var25] >> 8) * 64 - Statics.field253;
                                    int var27 = (Statics.field1881[var25] & 0xFF) * 64 - Statics.field2902;
                                    byte[] var28 = Statics.field1883[var25];
                                    if (var28 != null) {
                                        method592();
                                        class6.method736(var28, var26, var27, Statics.field240 * 8 - 48, Statics.field786 * 8 - 48, field512);
                                    }
                                }
                                for (int var29 = 0; var29 < var23; var29++) {
                                    int var30 = (Statics.field1881[var29] >> 8) * 64 - Statics.field253;
                                    int var31 = (Statics.field1881[var29] & 0xFF) * 64 - Statics.field2902;
                                    byte[] var32 = Statics.field1883[var29];
                                    if (var32 == null && Statics.field786 < 800) {
                                        method592();
                                        class6.method2735(var30, var31, 64, 64);
                                    }
                                }
                                method88(true);
                                for (int var33 = 0; var33 < var23; var33++) {
                                    byte[] var34 = Statics.field650[var33];
                                    if (var34 != null) {
                                        int var35 = (Statics.field1881[var33] >> 8) * 64 - Statics.field253;
                                        int var36 = (Statics.field1881[var33] & 0xFF) * 64 - Statics.field2902;
                                        method592();
                                        class86 var37 = Statics.field3044;
                                        class108[] var38 = field512;
                                        class119 var39 = new class119(var34);
                                        int var40 = -1;
                                        while (true) {
                                            int var41 = var39.method2350();
                                            if (var41 == 0) {
                                                break;
                                            }
                                            var40 += var41;
                                            int var42 = 0;
                                            while (true) {
                                                int var43 = var39.method2350();
                                                if (var43 == 0) {
                                                    break;
                                                }
                                                var42 += var43 - 1;
                                                int var44 = var42 & 0x3F;
                                                int var45 = var42 >> 6 & 0x3F;
                                                int var46 = var42 >> 12;
                                                int var47 = var39.method2427();
                                                int var48 = var47 >> 2;
                                                int var49 = var47 & 0x3;
                                                int var50 = var35 + var45;
                                                int var51 = var36 + var44;
                                                if (var50 > 0 && var51 > 0 && var50 < 103 && var51 < 103) {
                                                    int var52 = var46;
                                                    if ((class6.field78[1][var50][var51] & 0x2) == 2) {
                                                        var52 = var46 - 1;
                                                    }
                                                    class108 var53 = null;
                                                    if (var52 >= 0) {
                                                        var53 = var38[var52];
                                                    }
                                                    class6.method1029(var46, var50, var51, var40, var49, var48, var37, var53);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (field310) {
                                int var54 = 0;
                                label4029: while (true) {
                                    if (var54 >= 4) {
                                        for (int var92 = 0; var92 < 13; var92++) {
                                            for (int var93 = 0; var93 < 13; var93++) {
                                                int var94 = field387[0][var92][var93];
                                                if (var94 == -1) {
                                                    class6.method2735(var92 * 8, var93 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method88(true);
                                        int var95 = 0;
                                        while (true) {
                                            if (var95 >= 4) {
                                                break label4029;
                                            }
                                            method592();
                                            for (int var96 = 0; var96 < 13; var96++) {
                                                label3918: for (int var97 = 0; var97 < 13; var97++) {
                                                    int var98 = field387[var95][var96][var97];
                                                    if (var98 != -1) {
                                                        int var99 = var98 >> 24 & 0x3;
                                                        int var100 = var98 >> 1 & 0x3;
                                                        int var101 = var98 >> 14 & 0x3FF;
                                                        int var102 = var98 >> 3 & 0x7FF;
                                                        int var103 = (var101 / 8 << 8) + var102 / 8;
                                                        for (int var104 = 0; var104 < Statics.field1881.length; var104++) {
                                                            if (Statics.field1881[var104] == var103 && Statics.field650[var104] != null) {
                                                                byte[] var105 = Statics.field650[var104];
                                                                int var106 = var96 * 8;
                                                                int var107 = var97 * 8;
                                                                int var108 = (var101 & 0x7) * 8;
                                                                int var109 = (var102 & 0x7) * 8;
                                                                class86 var110 = Statics.field3044;
                                                                class108[] var111 = field512;
                                                                class119 var112 = new class119(var105);
                                                                int var113 = -1;
                                                                while (true) {
                                                                    int var114 = var112.method2350();
                                                                    if (var114 == 0) {
                                                                        continue label3918;
                                                                    }
                                                                    var113 += var114;
                                                                    int var115 = 0;
                                                                    while (true) {
                                                                        int var116 = var112.method2350();
                                                                        if (var116 == 0) {
                                                                            break;
                                                                        }
                                                                        var115 += var116 - 1;
                                                                        int var117 = var115 & 0x3F;
                                                                        int var118 = var115 >> 6 & 0x3F;
                                                                        int var119 = var115 >> 12;
                                                                        int var120 = var112.method2427();
                                                                        int var121 = var120 >> 2;
                                                                        int var122 = var120 & 0x3;
                                                                        if (var99 == var119 && var118 >= var108 && var118 < var108 + 8 && var117 >= var109 && var117 < var109 + 8) {
                                                                            class41 var123 = class41.method2808(var113);
                                                                            int var125 = var118 & 0x7;
                                                                            int var126 = var117 & 0x7;
                                                                            int var128 = var123.field934;
                                                                            int var129 = var123.field935;
                                                                            if ((var122 & 0x1) == 1) {
                                                                                int var130 = var128;
                                                                                var128 = var129;
                                                                                var129 = var130;
                                                                            }
                                                                            int var131 = var100 & 0x3;
                                                                            int var132;
                                                                            if (var131 == 0) {
                                                                                var132 = var125;
                                                                            } else if (var131 == 1) {
                                                                                var132 = var126;
                                                                            } else if (var131 == 2) {
                                                                                var132 = 7 - var125 - (var128 - 1);
                                                                            } else {
                                                                                var132 = 7 - var126 - (var129 - 1);
                                                                            }
                                                                            int var133 = var106 + var132;
                                                                            int var134 = var107 + class177.method2958(var118 & 0x7, var117 & 0x7, var100, var123.field934, var123.field935, var122);
                                                                            if (var133 > 0 && var134 > 0 && var133 < 103 && var134 < 103) {
                                                                                int var135 = var95;
                                                                                if ((class6.field78[1][var133][var134] & 0x2) == 2) {
                                                                                    var135 = var95 - 1;
                                                                                }
                                                                                class108 var136 = null;
                                                                                if (var135 >= 0) {
                                                                                    var136 = var111[var135];
                                                                                }
                                                                                class6.method1029(var95, var133, var134, var113, var100 + var122 & 0x3, var121, var110, var136);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var95++;
                                        }
                                    }
                                    method592();
                                    for (int var55 = 0; var55 < 13; var55++) {
                                        for (int var56 = 0; var56 < 13; var56++) {
                                            boolean var57 = false;
                                            int var58 = field387[var54][var55][var56];
                                            if (var58 != -1) {
                                                int var59 = var58 >> 24 & 0x3;
                                                int var60 = var58 >> 1 & 0x3;
                                                int var61 = var58 >> 14 & 0x3FF;
                                                int var62 = var58 >> 3 & 0x7FF;
                                                int var63 = (var61 / 8 << 8) + var62 / 8;
                                                for (int var64 = 0; var64 < Statics.field1881.length; var64++) {
                                                    if (Statics.field1881[var64] == var63 && Statics.field1883[var64] != null) {
                                                        byte[] var65 = Statics.field1883[var64];
                                                        int var66 = var55 * 8;
                                                        int var67 = var56 * 8;
                                                        int var68 = (var61 & 0x7) * 8;
                                                        int var69 = (var62 & 0x7) * 8;
                                                        class108[] var70 = field512;
                                                        for (int var71 = 0; var71 < 8; var71++) {
                                                            for (int var72 = 0; var72 < 8; var72++) {
                                                                if (var66 + var71 > 0 && var66 + var71 < 103 && var67 + var72 > 0 && var67 + var72 < 103) {
                                                                    var70[var54].field1875[var66 + var71][var67 + var72] &= 0xFEFFFFFF;
                                                                }
                                                            }
                                                        }
                                                        class119 var73 = new class119(var65);
                                                        for (int var74 = 0; var74 < 4; var74++) {
                                                            for (int var75 = 0; var75 < 64; var75++) {
                                                                for (int var76 = 0; var76 < 64; var76++) {
                                                                    if (var59 == var74 && var75 >= var68 && var75 < var68 + 8 && var76 >= var69 && var76 < var69 + 8) {
                                                                        int var80 = var75 & 0x7;
                                                                        int var81 = var76 & 0x7;
                                                                        int var83 = var60 & 0x3;
                                                                        int var84;
                                                                        if (var83 == 0) {
                                                                            var84 = var80;
                                                                        } else if (var83 == 1) {
                                                                            var84 = var81;
                                                                        } else if (var83 == 2) {
                                                                            var84 = 7 - var80;
                                                                        } else {
                                                                            var84 = 7 - var81;
                                                                        }
                                                                        class6.method98(var73, var54, var66 + var84, var67 + class177.method1741(var75 & 0x7, var76 & 0x7, var60), 0, 0, var60);
                                                                    } else {
                                                                        class6.method98(var73, 0, -1, -1, 0, 0, 0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var57 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var57) {
                                                int var85 = var54;
                                                int var86 = var55 * 8;
                                                int var87 = var56 * 8;
                                                for (int var88 = 0; var88 < 8; var88++) {
                                                    for (int var89 = 0; var89 < 8; var89++) {
                                                        class6.field79[var85][var86 + var88][var87 + var89] = 0;
                                                    }
                                                }
                                                if (var86 > 0) {
                                                    for (int var90 = 1; var90 < 8; var90++) {
                                                        class6.field79[var85][var86][var87 + var90] = class6.field79[var85][var86 - 1][var87 + var90];
                                                    }
                                                }
                                                if (var87 > 0) {
                                                    for (int var91 = 1; var91 < 8; var91++) {
                                                        class6.field79[var85][var86 + var91][var87] = class6.field79[var85][var86 + var91][var87 - 1];
                                                    }
                                                }
                                                if (var86 > 0 && class6.field79[var85][var86 - 1][var87] != 0) {
                                                    class6.field79[var85][var86][var87] = class6.field79[var85][var86 - 1][var87];
                                                } else if (var87 > 0 && class6.field79[var85][var86][var87 - 1] != 0) {
                                                    class6.field79[var85][var86][var87] = class6.field79[var85][var86][var87 - 1];
                                                } else if (var86 > 0 && var87 > 0 && class6.field79[var85][var86 - 1][var87 - 1] != 0) {
                                                    class6.field79[var85][var86][var87] = class6.field79[var85][var86 - 1][var87 - 1];
                                                }
                                            }
                                        }
                                    }
                                    var54++;
                                }
                            }
                            method88(true);
                            method2036();
                            method592();
                            class86 var137 = Statics.field3044;
                            class108[] var138 = field512;
                            for (int var139 = 0; var139 < 4; var139++) {
                                for (int var140 = 0; var140 < 104; var140++) {
                                    for (int var141 = 0; var141 < 104; var141++) {
                                        if ((class6.field78[var139][var140][var141] & 0x1) == 1) {
                                            int var142 = var139;
                                            if ((class6.field78[1][var140][var141] & 0x2) == 2) {
                                                var142 = var139 - 1;
                                            }
                                            if (var142 >= 0) {
                                                var138[var142].method2222(var140, var141);
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
                            class6.field92 += (int) (Math.random() * 5.0D) - 2;
                            if (class6.field92 < -16) {
                                class6.field92 = -16;
                            }
                            if (class6.field92 > 16) {
                                class6.field92 = 16;
                            }
                            for (int var143 = 0; var143 < 4; var143++) {
                                byte[][] var144 = Statics.field1617[var143];
                                int var145 = (int) Math.sqrt(5100.0D);
                                int var146 = var145 * 768 >> 8;
                                for (int var147 = 1; var147 < 103; var147++) {
                                    for (int var148 = 1; var148 < 103; var148++) {
                                        int var149 = class6.field79[var143][var148 + 1][var147] - class6.field79[var143][var148 - 1][var147];
                                        int var150 = class6.field79[var143][var148][var147 + 1] - class6.field79[var143][var148][var147 - 1];
                                        int var151 = (int) Math.sqrt((double) (var150 * var150 + var149 * var149 + 65536));
                                        int var152 = (var149 << 8) / var151;
                                        int var153 = 65536 / var151;
                                        int var154 = (var150 << 8) / var151;
                                        int var155 = (var154 * -50 + var152 * -50 + var153 * -10) / var146 + 96;
                                        int var156 = (var144[var148][var147] >> 1) + (var144[var148][var147 + 1] >> 3) + (var144[var148][var147 - 1] >> 2) + (var144[var148 - 1][var147] >> 2) + (var144[var148 + 1][var147] >> 3);
                                        Statics.field82[var148][var147] = var155 - var156;
                                    }
                                }
                                for (int var157 = 0; var157 < 104; var157++) {
                                    Statics.field1364[var157] = 0;
                                    Statics.field1860[var157] = 0;
                                    Statics.field704[var157] = 0;
                                    Statics.field1670[var157] = 0;
                                    Statics.field2287[var157] = 0;
                                }
                                for (int var158 = -5; var158 < 109; var158++) {
                                    for (int var159 = 0; var159 < 104; var159++) {
                                        int var160 = var158 + 5;
                                        if (var160 >= 0 && var160 < 104) {
                                            int var161 = Statics.field80[var143][var160][var159] & 0xFF;
                                            if (var161 > 0) {
                                                class42 var162 = class42.method101(var161 - 1);
                                                Statics.field1364[var159] += var162.field973;
                                                Statics.field1860[var159] += var162.field979;
                                                Statics.field704[var159] += var162.field978;
                                                Statics.field1670[var159] += var162.field976;
                                                var10002 = Statics.field2287[var159]++;
                                            }
                                        }
                                        int var163 = var158 - 5;
                                        if (var163 >= 0 && var163 < 104) {
                                            int var164 = Statics.field80[var143][var163][var159] & 0xFF;
                                            if (var164 > 0) {
                                                class42 var165 = class42.method101(var164 - 1);
                                                Statics.field1364[var159] -= var165.field973;
                                                Statics.field1860[var159] -= var165.field979;
                                                Statics.field704[var159] -= var165.field978;
                                                Statics.field1670[var159] -= var165.field976;
                                                var10002 = Statics.field2287[var159]--;
                                            }
                                        }
                                    }
                                    if (var158 >= 1 && var158 < 103) {
                                        int var166 = 0;
                                        int var167 = 0;
                                        int var168 = 0;
                                        int var169 = 0;
                                        int var170 = 0;
                                        for (int var171 = -5; var171 < 109; var171++) {
                                            int var172 = var171 + 5;
                                            if (var172 >= 0 && var172 < 104) {
                                                var166 += Statics.field1364[var172];
                                                var167 += Statics.field1860[var172];
                                                var168 += Statics.field704[var172];
                                                var169 += Statics.field1670[var172];
                                                var170 += Statics.field2287[var172];
                                            }
                                            int var173 = var171 - 5;
                                            if (var173 >= 0 && var173 < 104) {
                                                var166 -= Statics.field1364[var173];
                                                var167 -= Statics.field1860[var173];
                                                var168 -= Statics.field704[var173];
                                                var169 -= Statics.field1670[var173];
                                                var170 -= Statics.field2287[var173];
                                            }
                                            if (var171 >= 1 && var171 < 103 && (!field283 || (class6.field78[0][var158][var171] & 0x2) != 0 || (class6.field78[var143][var158][var171] & 0x10) == 0)) {
                                                if (var143 < class6.field77) {
                                                    class6.field77 = var143;
                                                }
                                                int var174 = Statics.field80[var143][var158][var171] & 0xFF;
                                                int var175 = Statics.field89[var143][var158][var171] & 0xFF;
                                                if (var174 > 0 || var175 > 0) {
                                                    int var176 = class6.field79[var143][var158][var171];
                                                    int var177 = class6.field79[var143][var158 + 1][var171];
                                                    int var178 = class6.field79[var143][var158 + 1][var171 + 1];
                                                    int var179 = class6.field79[var143][var158][var171 + 1];
                                                    int var180 = Statics.field82[var158][var171];
                                                    int var181 = Statics.field82[var158 + 1][var171];
                                                    int var182 = Statics.field82[var158 + 1][var171 + 1];
                                                    int var183 = Statics.field82[var158][var171 + 1];
                                                    int var184 = -1;
                                                    int var185 = -1;
                                                    if (var174 > 0) {
                                                        int var186 = var166 * 256 / var169;
                                                        int var187 = var167 / var170;
                                                        int var188 = var168 / var170;
                                                        var184 = class6.method186(var186, var187, var188);
                                                        int var189 = class6.field91 + var186 & 0xFF;
                                                        int var190 = class6.field92 + var188;
                                                        if (var190 < 0) {
                                                            var190 = 0;
                                                        } else if (var190 > 255) {
                                                            var190 = 255;
                                                        }
                                                        var185 = class6.method186(var189, var187, var190);
                                                    }
                                                    if (var143 > 0) {
                                                        boolean var191 = true;
                                                        if (var174 == 0 && Statics.field619[var143][var158][var171] != 0) {
                                                            var191 = false;
                                                        }
                                                        if (var175 > 0 && !class47.method122(var175 - 1).field1046) {
                                                            var191 = false;
                                                        }
                                                        if (var191 && var176 == var177 && var176 == var178 && var176 == var179) {
                                                            Statics.field83[var143][var158][var171] |= 0x924;
                                                        }
                                                    }
                                                    int var192 = 0;
                                                    if (var185 != -1) {
                                                        var192 = class91.field1566[class6.method715(var185, 96)];
                                                    }
                                                    if (var175 == 0) {
                                                        var137.method1874(var143, var158, var171, 0, 0, -1, var176, var177, var178, var179, class6.method715(var184, var180), class6.method715(var184, var181), class6.method715(var184, var182), class6.method715(var184, var183), 0, 0, 0, 0, var192, 0);
                                                    } else {
                                                        int var193 = Statics.field619[var143][var158][var171] + 1;
                                                        byte var194 = Statics.field1956[var143][var158][var171];
                                                        class47 var195 = class47.method122(var175 - 1);
                                                        int var196 = var195.field1047;
                                                        int var197;
                                                        int var198;
                                                        if (var196 >= 0) {
                                                            var197 = Statics.field1567.method2003(var196);
                                                            var198 = -1;
                                                        } else if (var195.field1053 == 16711935) {
                                                            var198 = -2;
                                                            var196 = -1;
                                                            var197 = -2;
                                                        } else {
                                                            var198 = class6.method186(var195.field1043, var195.field1049, var195.field1050);
                                                            int var199 = class6.field91 + var195.field1043 & 0xFF;
                                                            int var200 = class6.field92 + var195.field1050;
                                                            if (var200 < 0) {
                                                                var200 = 0;
                                                            } else if (var200 > 255) {
                                                                var200 = 255;
                                                            }
                                                            var197 = class6.method186(var199, var195.field1049, var200);
                                                        }
                                                        int var201 = 0;
                                                        if (var197 != -2) {
                                                            var201 = class91.field1566[class6.method100(var197, 96)];
                                                        }
                                                        if (var195.field1057 != -1) {
                                                            int var202 = class6.field91 + var195.field1048 & 0xFF;
                                                            int var203 = class6.field92 + var195.field1051;
                                                            if (var203 < 0) {
                                                                var203 = 0;
                                                            } else if (var203 > 255) {
                                                                var203 = 255;
                                                            }
                                                            int var204 = class6.method186(var202, var195.field1052, var203);
                                                            var201 = class91.field1566[class6.method100(var204, 96)];
                                                        }
                                                        var137.method1874(var143, var158, var171, var193, var194, var196, var176, var177, var178, var179, class6.method715(var184, var180), class6.method715(var184, var181), class6.method715(var184, var182), class6.method715(var184, var183), class6.method100(var198, var180), class6.method100(var198, var181), class6.method100(var198, var182), class6.method100(var198, var183), var192, var201);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var205 = 1; var205 < 103; var205++) {
                                    for (int var206 = 1; var206 < 103; var206++) {
                                        int var211;
                                        if ((class6.field78[var143][var206][var205] & 0x8) != 0) {
                                            var211 = 0;
                                        } else if (var143 <= 0 || (class6.field78[1][var206][var205] & 0x2) == 0) {
                                            var211 = var143;
                                        } else {
                                            var211 = var143 - 1;
                                        }
                                        var137.method1759(var143, var206, var205, var211);
                                    }
                                }
                                Statics.field80[var143] = (byte[][]) null;
                                Statics.field89[var143] = (byte[][]) null;
                                Statics.field619[var143] = (byte[][]) null;
                                Statics.field1956[var143] = (byte[][]) null;
                                Statics.field1617[var143] = (byte[][]) null;
                            }
                            var137.method1804(-50, -10, -50);
                            for (int var212 = 0; var212 < 104; var212++) {
                                for (int var213 = 0; var213 < 104; var213++) {
                                    if ((class6.field78[1][var212][var213] & 0x2) == 2) {
                                        var137.method1757(var212, var213);
                                    }
                                }
                            }
                            int var214 = 1;
                            int var215 = 2;
                            int var216 = 4;
                            for (int var217 = 0; var217 < 4; var217++) {
                                if (var217 > 0) {
                                    var214 <<= 0x3;
                                    var215 <<= 0x3;
                                    var216 <<= 0x3;
                                }
                                for (int var218 = 0; var218 <= var217; var218++) {
                                    for (int var219 = 0; var219 <= 104; var219++) {
                                        for (int var220 = 0; var220 <= 104; var220++) {
                                            if ((Statics.field83[var218][var220][var219] & var214) != 0) {
                                                int var221 = var219;
                                                int var222 = var219;
                                                int var223 = var218;
                                                int var224 = var218;
                                                while (var221 > 0 && (Statics.field83[var218][var220][var221 - 1] & var214) != 0) {
                                                    var221--;
                                                }
                                                while (var222 < 104 && (Statics.field83[var218][var220][var222 + 1] & var214) != 0) {
                                                    var222++;
                                                }
                                                label3637: while (var223 > 0) {
                                                    for (int var225 = var221; var225 <= var222; var225++) {
                                                        if ((Statics.field83[var223 - 1][var220][var225] & var214) == 0) {
                                                            break label3637;
                                                        }
                                                    }
                                                    var223--;
                                                }
                                                label3626: while (var224 < var217) {
                                                    for (int var226 = var221; var226 <= var222; var226++) {
                                                        if ((Statics.field83[var224 + 1][var220][var226] & var214) == 0) {
                                                            break label3626;
                                                        }
                                                    }
                                                    var224++;
                                                }
                                                int var227 = (var224 + 1 - var223) * (var222 - var221 + 1);
                                                if (var227 >= 8) {
                                                    short var228 = 240;
                                                    int var229 = class6.field79[var224][var220][var221] - var228;
                                                    int var230 = class6.field79[var223][var220][var221];
                                                    class86.method1758(var217, 1, var220 * 128, var220 * 128, var221 * 128, var222 * 128 + 128, var229, var230);
                                                    for (int var231 = var223; var231 <= var224; var231++) {
                                                        for (int var232 = var221; var232 <= var222; var232++) {
                                                            Statics.field83[var231][var220][var232] &= ~var214;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field83[var218][var220][var219] & var215) != 0) {
                                                int var233 = var220;
                                                int var234 = var220;
                                                int var235 = var218;
                                                int var236 = var218;
                                                while (var233 > 0 && (Statics.field83[var218][var233 - 1][var219] & var215) != 0) {
                                                    var233--;
                                                }
                                                while (var234 < 104 && (Statics.field83[var218][var234 + 1][var219] & var215) != 0) {
                                                    var234++;
                                                }
                                                label3690: while (var235 > 0) {
                                                    for (int var237 = var233; var237 <= var234; var237++) {
                                                        if ((Statics.field83[var235 - 1][var237][var219] & var215) == 0) {
                                                            break label3690;
                                                        }
                                                    }
                                                    var235--;
                                                }
                                                label3679: while (var236 < var217) {
                                                    for (int var238 = var233; var238 <= var234; var238++) {
                                                        if ((Statics.field83[var236 + 1][var238][var219] & var215) == 0) {
                                                            break label3679;
                                                        }
                                                    }
                                                    var236++;
                                                }
                                                int var239 = (var236 + 1 - var235) * (var234 - var233 + 1);
                                                if (var239 >= 8) {
                                                    short var240 = 240;
                                                    int var241 = class6.field79[var236][var233][var219] - var240;
                                                    int var242 = class6.field79[var235][var233][var219];
                                                    class86.method1758(var217, 2, var233 * 128, var234 * 128 + 128, var219 * 128, var219 * 128, var241, var242);
                                                    for (int var243 = var235; var243 <= var236; var243++) {
                                                        for (int var244 = var233; var244 <= var234; var244++) {
                                                            Statics.field83[var243][var244][var219] &= ~var215;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field83[var218][var220][var219] & var216) != 0) {
                                                int var245 = var220;
                                                int var246 = var220;
                                                int var247 = var219;
                                                int var248 = var219;
                                                while (var247 > 0 && (Statics.field83[var218][var220][var247 - 1] & var216) != 0) {
                                                    var247--;
                                                }
                                                while (var248 < 104 && (Statics.field83[var218][var220][var248 + 1] & var216) != 0) {
                                                    var248++;
                                                }
                                                label3743: while (var245 > 0) {
                                                    for (int var249 = var247; var249 <= var248; var249++) {
                                                        if ((Statics.field83[var218][var245 - 1][var249] & var216) == 0) {
                                                            break label3743;
                                                        }
                                                    }
                                                    var245--;
                                                }
                                                label3732: while (var246 < 104) {
                                                    for (int var250 = var247; var250 <= var248; var250++) {
                                                        if ((Statics.field83[var218][var246 + 1][var250] & var216) == 0) {
                                                            break label3732;
                                                        }
                                                    }
                                                    var246++;
                                                }
                                                if ((var246 - var245 + 1) * (var248 - var247 + 1) >= 4) {
                                                    int var251 = class6.field79[var218][var245][var247];
                                                    class86.method1758(var217, 4, var245 * 128, var246 * 128 + 128, var247 * 128, var248 * 128 + 128, var251, var251);
                                                    for (int var252 = var245; var252 <= var246; var252++) {
                                                        for (int var253 = var247; var253 <= var248; var253++) {
                                                            Statics.field83[var218][var252][var253] &= ~var216;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            method88(true);
                            int var254 = class6.field77;
                            if (var254 > Statics.field575) {
                                var254 = Statics.field575;
                            }
                            if (var254 < Statics.field575 - 1) {
                                int var255 = Statics.field575 - 1;
                            }
                            if (field283) {
                                Statics.field3044.method1863(class6.field77);
                            } else {
                                Statics.field3044.method1863(0);
                            }
                            for (int var256 = 0; var256 < 104; var256++) {
                                for (int var257 = 0; var257 < 104; var257++) {
                                    method2021(var256, var257);
                                }
                            }
                            method592();
                            for (class17 var258 = (class17) field408.method3581(); var258 != null; var258 = (class17) field408.method3583()) {
                                if (var258.field228 == -1) {
                                    var258.field217 = 0;
                                    method2615(var258);
                                } else {
                                    var258.method3670();
                                }
                            }
                            class41.field925.method3522();
                            if (Statics.field2747 != null) {
                                field312.method2612(242);
                                field312.method2327(1057001181);
                            }
                            if (!field310) {
                                int var259 = (Statics.field240 - 6) / 8;
                                int var260 = (Statics.field240 + 6) / 8;
                                int var261 = (Statics.field786 - 6) / 8;
                                int var262 = (Statics.field786 + 6) / 8;
                                for (int var263 = var259 - 1; var263 <= var260 + 1; var263++) {
                                    for (int var264 = var261 - 1; var264 <= var262 + 1; var264++) {
                                        if (var263 < var259 || var263 > var260 || var264 < var261 || var264 > var262) {
                                            Statics.field3117.method3077("m" + var263 + "_" + var264);
                                            Statics.field3117.method3077("l" + var263 + "_" + var264);
                                        }
                                    }
                                }
                            }
                            method633(30);
                            method592();
                            Statics.field80 = (byte[][][]) null;
                            Statics.field89 = (byte[][][]) null;
                            Statics.field619 = (byte[][][]) null;
                            Statics.field1956 = (byte[][][]) null;
                            Statics.field83 = (int[][][]) null;
                            Statics.field1617 = (byte[][][]) null;
                            Statics.field82 = (int[][]) null;
                            Statics.field1364 = null;
                            Statics.field1860 = null;
                            Statics.field704 = null;
                            Statics.field1670 = null;
                            Statics.field2287 = null;
                            field312.method2612(224);
                            class144.method2766();
                        } else {
                            field397 = 2;
                        }
                    } else {
                        field397 = 1;
                    }
                }
                if (field546 == 30) {
                    if (field295 > 1) {
                        field295--;
                    }
                    if (field330 > 0) {
                        field330--;
                    }
                    if (field331) {
                        field331 = false;
                        method104();
                    } else {
                        if (!field415) {
                            field421[0] = class157.field2543;
                            field332[0] = "";
                            field419[0] = 1006;
                            field416 = 1;
                        }
                        for (int var265 = 0; var265 < 100; var265++) {
                            boolean var266;
                            if (Statics.field269 == null) {
                                var266 = false;
                            } else {
                                label4386: {
                                    try {
                                        int var267 = Statics.field269.method2818();
                                        if (var267 == 0) {
                                            var266 = false;
                                            break label4386;
                                        }
                                        if (field334 == -1) {
                                            Statics.field269.method2819(field407.field1977, 0, 1);
                                            field407.field1974 = 0;
                                            field334 = field407.method2604();
                                            field323 = class188.field3043[field334];
                                            var267--;
                                        }
                                        if (field323 == -1) {
                                            if (var267 <= 0) {
                                                var266 = false;
                                                break label4386;
                                            }
                                            Statics.field269.method2819(field407.field1977, 0, 1);
                                            field323 = field407.field1977[0] & 0xFF;
                                            var267--;
                                        }
                                        if (field323 == -2) {
                                            if (var267 <= 1) {
                                                var266 = false;
                                                break label4386;
                                            }
                                            Statics.field269.method2819(field407.field1977, 0, 2);
                                            field407.field1974 = 0;
                                            field323 = field407.method2339();
                                            var267 -= 2;
                                        }
                                        if (var267 < field323) {
                                            var266 = false;
                                            break label4386;
                                        }
                                        field407.field1974 = 0;
                                        Statics.field269.method2819(field407.field1977, 0, field323);
                                        field325 = 0;
                                        field329 = field328;
                                        field328 = field327;
                                        field327 = field334;
                                        if (field334 == 101) {
                                            int var268 = field407.method2333();
                                            boolean var269 = field407.method2363() == 1;
                                            class173 var270 = class173.method2550(var268);
                                            if (var270.field2777 != var269) {
                                                var270.field2777 = var269;
                                                method239(var270);
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 235) {
                                            Statics.field1149 = field407.method2365();
                                            Statics.field26 = field407.method2365();
                                            for (int var271 = Statics.field26; var271 < Statics.field26 + 8; var271++) {
                                                for (int var272 = Statics.field1149; var272 < Statics.field1149 + 8; var272++) {
                                                    if (field552[Statics.field575][var271][var272] != null) {
                                                        field552[Statics.field575][var271][var272] = null;
                                                        method2021(var271, var272);
                                                    }
                                                }
                                            }
                                            for (class17 var273 = (class17) field408.method3581(); var273 != null; var273 = (class17) field408.method3583()) {
                                                if (var273.field219 >= Statics.field26 && var273.field219 < Statics.field26 + 8 && var273.field227 >= Statics.field1149 && var273.field227 < Statics.field1149 + 8 && Statics.field575 == var273.field230) {
                                                    var273.field228 = 0;
                                                }
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 222) {
                                            int var274 = field407.method2333();
                                            class173 var275 = class173.method2550(var274);
                                            var275.field2798 = 3;
                                            var275.field2799 = Statics.field159.field33.method3271();
                                            method239(var275);
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 13) {
                                            method1164(false);
                                            field407.method2604();
                                            int var276 = field407.method2339();
                                            class122 var277 = field407;
                                            int var278 = var277.field1974;
                                            class33.field756 = 0;
                                            int var279 = 0;
                                            var277.method2596();
                                            for (int var280 = 0; var280 < class33.field754; var280++) {
                                                int var281 = class33.field750[var280];
                                                if ((class33.field746[var281] & 0x1) == 0) {
                                                    if (var279 > 0) {
                                                        var279--;
                                                        class33.field746[var281] = (byte) (class33.field746[var281] | 0x2);
                                                    } else {
                                                        int var282 = var277.method2607(1);
                                                        if (var282 == 0) {
                                                            var279 = class33.method159(var277);
                                                            class33.field746[var281] = (byte) (class33.field746[var281] | 0x2);
                                                        } else {
                                                            class33.method1936(var277, var281);
                                                        }
                                                    }
                                                }
                                            }
                                            var277.method2598();
                                            if (var279 != 0) {
                                                throw new RuntimeException();
                                            }
                                            var277.method2596();
                                            for (int var283 = 0; var283 < class33.field754; var283++) {
                                                int var284 = class33.field750[var283];
                                                if ((class33.field746[var284] & 0x1) != 0) {
                                                    if (var279 > 0) {
                                                        var279--;
                                                        class33.field746[var284] = (byte) (class33.field746[var284] | 0x2);
                                                    } else {
                                                        int var285 = var277.method2607(1);
                                                        if (var285 == 0) {
                                                            var279 = class33.method159(var277);
                                                            class33.field746[var284] = (byte) (class33.field746[var284] | 0x2);
                                                        } else {
                                                            class33.method1936(var277, var284);
                                                        }
                                                    }
                                                }
                                            }
                                            var277.method2598();
                                            if (var279 != 0) {
                                                throw new RuntimeException();
                                            }
                                            var277.method2596();
                                            for (int var286 = 0; var286 < class33.field751; var286++) {
                                                int var287 = class33.field752[var286];
                                                if ((class33.field746[var287] & 0x1) != 0) {
                                                    if (var279 > 0) {
                                                        var279--;
                                                        class33.field746[var287] = (byte) (class33.field746[var287] | 0x2);
                                                    } else {
                                                        int var288 = var277.method2607(1);
                                                        if (var288 == 0) {
                                                            var279 = class33.method159(var277);
                                                            class33.field746[var287] = (byte) (class33.field746[var287] | 0x2);
                                                        } else if (class33.method2683(var277, var287)) {
                                                            class33.field746[var287] = (byte) (class33.field746[var287] | 0x2);
                                                        }
                                                    }
                                                }
                                            }
                                            var277.method2598();
                                            if (var279 != 0) {
                                                throw new RuntimeException();
                                            }
                                            var277.method2596();
                                            for (int var289 = 0; var289 < class33.field751; var289++) {
                                                int var290 = class33.field752[var289];
                                                if ((class33.field746[var290] & 0x1) == 0) {
                                                    if (var279 > 0) {
                                                        var279--;
                                                        class33.field746[var290] = (byte) (class33.field746[var290] | 0x2);
                                                    } else {
                                                        int var291 = var277.method2607(1);
                                                        if (var291 == 0) {
                                                            var279 = class33.method159(var277);
                                                            class33.field746[var290] = (byte) (class33.field746[var290] | 0x2);
                                                        } else if (class33.method2683(var277, var290)) {
                                                            class33.field746[var290] = (byte) (class33.field746[var290] | 0x2);
                                                        }
                                                    }
                                                }
                                            }
                                            var277.method2598();
                                            if (var279 != 0) {
                                                throw new RuntimeException();
                                            }
                                            class33.field754 = 0;
                                            class33.field751 = 0;
                                            for (int var292 = 1; var292 < 2048; var292++) {
                                                class33.field746[var292] = (byte) (class33.field746[var292] >> 1);
                                                class3 var293 = field337[var292];
                                                if (var293 == null) {
                                                    class33.field752[++class33.field751 - 1] = var292;
                                                } else {
                                                    class33.field750[++class33.field754 - 1] = var292;
                                                }
                                            }
                                            for (int var294 = 0; var294 < class33.field756; var294++) {
                                                int var295 = class33.field757[var294];
                                                class3 var296 = field337[var295];
                                                int var297 = var277.method2427();
                                                if ((var297 & 0x2) != 0) {
                                                    var297 += var277.method2427() << 8;
                                                }
                                                class33.method2814(var277, var295, var296, var297);
                                            }
                                            if (var277.field1974 - var278 != var276) {
                                                throw new RuntimeException(var277.field1974 - var278 + " " + var276);
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 68) {
                                            field407.field1974 += 28;
                                            if (field407.method2417()) {
                                                class149.method158(field407, field407.field1974 - 28);
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 24) {
                                            for (int var298 = 0; var298 < class176.field2906.length; var298++) {
                                                if (class176.field2906[var298] != class176.field2905[var298]) {
                                                    class176.field2906[var298] = class176.field2905[var298];
                                                    method2663(var298);
                                                    field317[++field370 - 1 & 0x1F] = var298;
                                                }
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 215) {
                                            field406 = false;
                                            for (int var299 = 0; var299 < 5; var299++) {
                                                field525[var299] = false;
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 187) {
                                            class33.field754 = 0;
                                            for (int var300 = 0; var300 < 2048; var300++) {
                                                class33.field748[var300] = null;
                                                class33.field749[var300] = 1;
                                            }
                                            for (int var301 = 0; var301 < 2048; var301++) {
                                                field337[var301] = null;
                                            }
                                            class33.method2020(field407);
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 103 || field334 == 171 || field334 == 211 || field334 == 107 || field334 == 55 || field334 == 199 || field334 == 159 || field334 == 177 || field334 == 231 || field334 == 255) {
                                            method8();
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 2) {
                                            method2115();
                                            field455 = field407.method2340();
                                            field472 = field460;
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 252) {
                                            int var302 = field407.method2333();
                                            int var303 = field407.method2381();
                                            int var304 = field407.method2339();
                                            if (var304 == 65535) {
                                                var304 = -1;
                                            }
                                            class173 var305 = class173.method2550(var303);
                                            if (var305.field2756) {
                                                var305.field2875 = var304;
                                                var305.field2876 = var302;
                                                class52 var307 = class52.method1933(var304);
                                                var305.field2806 = var307.field1109;
                                                var305.field2874 = var307.field1132;
                                                var305.field2808 = var307.field1113;
                                                var305.field2881 = var307.field1114;
                                                var305.field2805 = var307.field1098;
                                                var305.field2809 = var307.field1110;
                                                if (var307.field1102 == 1) {
                                                    var305.field2813 = 1;
                                                } else {
                                                    var305.field2813 = 2;
                                                }
                                                if (var305.field2800 > 0) {
                                                    var305.field2809 = var305.field2809 * 32 / var305.field2800;
                                                } else if (var305.field2768 > 0) {
                                                    var305.field2809 = var305.field2809 * 32 / var305.field2768;
                                                }
                                                method239(var305);
                                            } else {
                                                if (var304 == -1) {
                                                    var305.field2798 = 0;
                                                    field334 = -1;
                                                    var266 = true;
                                                    break label4386;
                                                }
                                                class52 var306 = class52.method1933(var304);
                                                var305.field2798 = 4;
                                                var305.field2799 = var304;
                                                var305.field2806 = var306.field1109;
                                                var305.field2874 = var306.field1132;
                                                var305.field2809 = var306.field1110 * 100 / var302;
                                                method239(var305);
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 207) {
                                            int var308 = field407.method2427();
                                            int var309 = field407.method2427();
                                            int var310 = field407.method2427();
                                            int var311 = field407.method2427();
                                            field525[var308] = true;
                                            field374[var308] = var309;
                                            field527[var308] = var310;
                                            field528[var308] = var311;
                                            field529[var308] = 0;
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 190) {
                                            int var312 = field407.method2427();
                                            if (field407.method2427() == 0) {
                                                field540[var312] = new class220();
                                                field407.field1974 += 18;
                                            } else {
                                                field407.field1974--;
                                                field540[var312] = new class220(field407, false);
                                            }
                                            field471 = field460;
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 117) {
                                            int var313 = field407.method2339();
                                            int var314 = field407.method2427();
                                            int var315 = field407.method2339();
                                            method752(var313, var314, var315);
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 115) {
                                            int var316 = field407.method2342();
                                            Statics.field255 = Statics.field2024.method2734(var316);
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 157) {
                                            String var317 = field407.method2528();
                                            Object[] var318 = new Object[var317.length() + 1];
                                            for (int var319 = var317.length() - 1; var319 >= 0; var319--) {
                                                if (var317.charAt(var319) == 's') {
                                                    var318[var319 + 1] = field407.method2528();
                                                } else {
                                                    var318[var319 + 1] = Integer.valueOf(field407.method2342());
                                                }
                                            }
                                            var318[0] = Integer.valueOf(field407.method2342());
                                            class1 var320 = new class1();
                                            var320.field1 = var318;
                                            class37.method2736(var320, 200000);
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 138) {
                                            for (int var321 = 0; var321 < field337.length; var321++) {
                                                if (field337[var321] != null) {
                                                    field337[var321].field842 = -1;
                                                }
                                            }
                                            for (int var322 = 0; var322 < field315.length; var322++) {
                                                if (field315[var322] != null) {
                                                    field315[var322].field842 = -1;
                                                }
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 94) {
                                            int var323 = field407.method2371();
                                            int var324 = field407.method2381();
                                            int var325 = var323 >> 10 & 0x1F;
                                            int var326 = var323 >> 5 & 0x1F;
                                            int var327 = var323 & 0x1F;
                                            int var328 = (var327 << 3) + (var325 << 19) + (var326 << 11);
                                            class173 var329 = class173.method2550(var324);
                                            if (var329.field2782 != var328) {
                                                var329.field2782 = var328;
                                                method239(var329);
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 164) {
                                            field295 = field407.method2339() * 30;
                                            field472 = field460;
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 248) {
                                            int var330 = field407.method2522();
                                            class16.method90(var330);
                                            field463[++field464 - 1 & 0x1F] = var330 & 0x7FFF;
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 40) {
                                            field406 = true;
                                            Statics.field765 = field407.method2427();
                                            Statics.field1081 = field407.method2427();
                                            Statics.field2702 = field407.method2339();
                                            Statics.field1746 = field407.method2427();
                                            Statics.field166 = field407.method2427();
                                            if (Statics.field166 >= 100) {
                                                int var331 = Statics.field765 * 128 + 64;
                                                int var332 = Statics.field1081 * 128 + 64;
                                                int var333 = method43(var331, var332, Statics.field575) - Statics.field2702;
                                                int var334 = var331 - Statics.field931;
                                                int var335 = var333 - Statics.field11;
                                                int var336 = var332 - Statics.field142;
                                                int var337 = (int) Math.sqrt((double) (var334 * var334 + var336 * var336));
                                                Statics.field577 = (int) (Math.atan2((double) var335, (double) var337) * 325.949D) & 0x7FF;
                                                Statics.field61 = (int) (Math.atan2((double) var334, (double) var336) * -325.949D) & 0x7FF;
                                                if (Statics.field577 < 128) {
                                                    Statics.field577 = 128;
                                                }
                                                if (Statics.field577 > 383) {
                                                    Statics.field577 = 383;
                                                }
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 75) {
                                            int var338 = field407.method2427();
                                            class130[] var339 = class130.method643();
                                            int var340 = 0;
                                            class130 var342;
                                            while (true) {
                                                if (var340 >= var339.length) {
                                                    var342 = null;
                                                    break;
                                                }
                                                class130 var341 = var339[var340];
                                                if (var341.field2044 == var338) {
                                                    var342 = var341;
                                                    break;
                                                }
                                                var340++;
                                            }
                                            Statics.field193 = var342;
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 175) {
                                            boolean var343 = field407.method2427() == 1;
                                            if (var343) {
                                                Statics.field1033 = class115.method102() - field407.method2343();
                                                Statics.field2635 = new class221(field407, true);
                                            } else {
                                                Statics.field2635 = null;
                                            }
                                            field378 = field460;
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 91) {
                                            class122 var344 = field407;
                                            int var345 = field323;
                                            int var346 = var344.field1974;
                                            class33.field756 = 0;
                                            int var347 = 0;
                                            var344.method2596();
                                            for (int var348 = 0; var348 < class33.field754; var348++) {
                                                int var349 = class33.field750[var348];
                                                if ((class33.field746[var349] & 0x1) == 0) {
                                                    if (var347 > 0) {
                                                        var347--;
                                                        class33.field746[var349] = (byte) (class33.field746[var349] | 0x2);
                                                    } else {
                                                        int var350 = var344.method2607(1);
                                                        if (var350 == 0) {
                                                            var347 = class33.method159(var344);
                                                            class33.field746[var349] = (byte) (class33.field746[var349] | 0x2);
                                                        } else {
                                                            class33.method1936(var344, var349);
                                                        }
                                                    }
                                                }
                                            }
                                            var344.method2598();
                                            if (var347 != 0) {
                                                throw new RuntimeException();
                                            }
                                            var344.method2596();
                                            for (int var351 = 0; var351 < class33.field754; var351++) {
                                                int var352 = class33.field750[var351];
                                                if ((class33.field746[var352] & 0x1) != 0) {
                                                    if (var347 > 0) {
                                                        var347--;
                                                        class33.field746[var352] = (byte) (class33.field746[var352] | 0x2);
                                                    } else {
                                                        int var353 = var344.method2607(1);
                                                        if (var353 == 0) {
                                                            var347 = class33.method159(var344);
                                                            class33.field746[var352] = (byte) (class33.field746[var352] | 0x2);
                                                        } else {
                                                            class33.method1936(var344, var352);
                                                        }
                                                    }
                                                }
                                            }
                                            var344.method2598();
                                            if (var347 != 0) {
                                                throw new RuntimeException();
                                            }
                                            var344.method2596();
                                            for (int var354 = 0; var354 < class33.field751; var354++) {
                                                int var355 = class33.field752[var354];
                                                if ((class33.field746[var355] & 0x1) != 0) {
                                                    if (var347 > 0) {
                                                        var347--;
                                                        class33.field746[var355] = (byte) (class33.field746[var355] | 0x2);
                                                    } else {
                                                        int var356 = var344.method2607(1);
                                                        if (var356 == 0) {
                                                            var347 = class33.method159(var344);
                                                            class33.field746[var355] = (byte) (class33.field746[var355] | 0x2);
                                                        } else if (class33.method2683(var344, var355)) {
                                                            class33.field746[var355] = (byte) (class33.field746[var355] | 0x2);
                                                        }
                                                    }
                                                }
                                            }
                                            var344.method2598();
                                            if (var347 != 0) {
                                                throw new RuntimeException();
                                            }
                                            var344.method2596();
                                            for (int var357 = 0; var357 < class33.field751; var357++) {
                                                int var358 = class33.field752[var357];
                                                if ((class33.field746[var358] & 0x1) == 0) {
                                                    if (var347 > 0) {
                                                        var347--;
                                                        class33.field746[var358] = (byte) (class33.field746[var358] | 0x2);
                                                    } else {
                                                        int var359 = var344.method2607(1);
                                                        if (var359 == 0) {
                                                            var347 = class33.method159(var344);
                                                            class33.field746[var358] = (byte) (class33.field746[var358] | 0x2);
                                                        } else if (class33.method2683(var344, var358)) {
                                                            class33.field746[var358] = (byte) (class33.field746[var358] | 0x2);
                                                        }
                                                    }
                                                }
                                            }
                                            var344.method2598();
                                            if (var347 != 0) {
                                                throw new RuntimeException();
                                            }
                                            class33.field754 = 0;
                                            class33.field751 = 0;
                                            for (int var360 = 1; var360 < 2048; var360++) {
                                                class33.field746[var360] = (byte) (class33.field746[var360] >> 1);
                                                class3 var361 = field337[var360];
                                                if (var361 == null) {
                                                    class33.field752[++class33.field751 - 1] = var360;
                                                } else {
                                                    class33.field750[++class33.field754 - 1] = var360;
                                                }
                                            }
                                            for (int var362 = 0; var362 < class33.field756; var362++) {
                                                int var363 = class33.field757[var362];
                                                class3 var364 = field337[var363];
                                                int var365 = var344.method2427();
                                                if ((var365 & 0x2) != 0) {
                                                    var365 += var344.method2427() << 8;
                                                }
                                                class33.method2814(var344, var363, var364, var365);
                                            }
                                            if (var344.field1974 - var346 != var345) {
                                                throw new RuntimeException(var344.field1974 - var346 + " " + var345);
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 48) {
                                            field406 = true;
                                            Statics.field524 = field407.method2427();
                                            Statics.field1207 = field407.method2427();
                                            Statics.field702 = field407.method2339();
                                            Statics.field1534 = field407.method2427();
                                            Statics.field1981 = field407.method2427();
                                            if (Statics.field1981 >= 100) {
                                                Statics.field931 = Statics.field524 * 128 + 64;
                                                Statics.field142 = Statics.field1207 * 128 + 64;
                                                Statics.field11 = method43(Statics.field931, Statics.field142, Statics.field575) - Statics.field702;
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 182) {
                                            for (int var366 = 0; var366 < Statics.field1148; var366++) {
                                                class53 var367 = class53.method3502(var366);
                                                if (var367 != null) {
                                                    class176.field2905[var366] = 0;
                                                    class176.field2906[var366] = 0;
                                                }
                                            }
                                            method2115();
                                            field370 += 32;
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 202) {
                                            int var368 = field407.method2342();
                                            class4 var369 = (class4) field436.method3545((long) var368);
                                            if (var369 != null) {
                                                method2590(var369, true);
                                            }
                                            if (field454 != null) {
                                                method239(field454);
                                                field454 = null;
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 162) {
                                            class26 var370 = new class26();
                                            var370.field636 = field407.method2528();
                                            var370.field653 = field407.method2339();
                                            int var371 = field407.method2342();
                                            var370.field641 = var371;
                                            method633(45);
                                            Statics.field269.method2816();
                                            Statics.field269 = null;
                                            class32.method117(var370);
                                            field334 = -1;
                                            var266 = false;
                                            break label4386;
                                        }
                                        if (field334 == 23) {
                                            String var372 = field407.method2528();
                                            long var373 = field407.method2343();
                                            long var375 = (long) field407.method2339();
                                            long var377 = (long) field407.method2341();
                                            class152[] var379 = new class152[] { class152.field2261, class152.field2268, class152.field2260, class152.field2263, class152.field2262 };
                                            class152 var380 = (class152) class109.method1468(var379, field407.method2427());
                                            long var381 = (var375 << 32) + var377;
                                            boolean var383 = false;
                                            for (int var384 = 0; var384 < 100; var384++) {
                                                if (field335[var384] == var381) {
                                                    var383 = true;
                                                    break;
                                                }
                                            }
                                            if (var380.field2264 && method83(var372)) {
                                                var383 = true;
                                            }
                                            if (!var383 && field396 == 0) {
                                                field335[field497] = var381;
                                                field497 = (field497 + 1) % 100;
                                                String var385 = class223.method3770(class163.method646(Statics.method648(field407)));
                                                if (var380.field2266 == -1) {
                                                    class12.method132(9, var372, var385, class162.method569(var373));
                                                } else {
                                                    int var386 = var380.field2266;
                                                    String var387 = "<img=" + var386 + ">";
                                                    class12.method132(9, var387 + var372, var385, class162.method569(var373));
                                                }
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 165) {
                                            int var388 = field407.method2350();
                                            boolean var389 = field407.method2427() == 1;
                                            String var390 = "";
                                            boolean var391 = false;
                                            if (var389) {
                                                var390 = field407.method2528();
                                                if (method83(var390)) {
                                                    var391 = true;
                                                }
                                            }
                                            String var392 = field407.method2528();
                                            if (!var391) {
                                                class12.method2960(var388, var390, var392);
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 151) {
                                            String var393 = field407.method2528();
                                            int var394 = field407.method2381();
                                            class173 var395 = class173.method2550(var394);
                                            if (!var393.equals(var395.field2815)) {
                                                var395.field2815 = var393;
                                                method239(var395);
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 37) {
                                            field493 = field407.method2427();
                                            field494 = field407.method2427();
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 99) {
                                            field366 = field407.method2427();
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 241) {
                                            method2115();
                                            field369 = field407.method2427();
                                            field472 = field460;
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 32) {
                                            int var396 = field407.method2364();
                                            String var397 = field407.method2528();
                                            int var398 = field407.method2364();
                                            if (var396 >= 1 && var396 <= 8) {
                                                if (var397.equalsIgnoreCase("null")) {
                                                    var397 = null;
                                                }
                                                field403[var396 - 1] = var397;
                                                field439[var396 - 1] = var398 == 0;
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 121) {
                                            int var399 = field407.method2522();
                                            if (var399 == 65535) {
                                                var399 = -1;
                                            }
                                            method99(var399);
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 244) {
                                            int var400 = field407.method2373();
                                            if (var400 == 65535) {
                                                var400 = -1;
                                            }
                                            int var401 = field407.method2415();
                                            if (field302 != 0 && var400 != -1) {
                                                class183.method2959(Statics.field1206, var400, 0, field302, false);
                                                field514 = true;
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 127) {
                                            int var402 = field407.method2342();
                                            int var403 = field407.method2373();
                                            class176.field2905[var403] = var402;
                                            if (class176.field2906[var403] != var402) {
                                                class176.field2906[var403] = var402;
                                            }
                                            method2663(var403);
                                            field317[++field370 - 1 & 0x1F] = var403;
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 29) {
                                            int var404 = field323 + field407.field1974;
                                            int var405 = field407.method2339();
                                            int var406 = field407.method2339();
                                            if (field379 != var405) {
                                                field379 = var405;
                                                int var407 = field379;
                                                int var408 = Statics.field1146;
                                                int var409 = Statics.field590;
                                                if (Statics.method2271(var407)) {
                                                    method3242(Statics.field2754[var407], -1, var408, var409, false);
                                                }
                                                method2946(field379);
                                                class37.method1743(field379);
                                                for (int var410 = 0; var410 < 100; var410++) {
                                                    field450[var410] = true;
                                                }
                                            }
                                            while (var406-- > 0) {
                                                int var411 = field407.method2342();
                                                int var412 = field407.method2339();
                                                int var413 = field407.method2427();
                                                class4 var414 = (class4) field436.method3545((long) var411);
                                                if (var414 != null && var414.field66 != var412) {
                                                    method2590(var414, true);
                                                    var414 = null;
                                                }
                                                if (var414 == null) {
                                                    var414 = method2255(var411, var412, var413);
                                                }
                                                var414.field65 = true;
                                            }
                                            for (class4 var415 = (class4) field436.method3548(); var415 != null; var415 = (class4) field436.method3546()) {
                                                if (var415.field65) {
                                                    var415.field65 = false;
                                                } else {
                                                    method2590(var415, true);
                                                }
                                            }
                                            field477 = new class196(512);
                                            while (field407.field1974 < var404) {
                                                int var416 = field407.method2342();
                                                int var417 = field407.method2339();
                                                int var418 = field407.method2339();
                                                int var419 = field407.method2342();
                                                for (int var420 = var417; var420 <= var418; var420++) {
                                                    long var421 = ((long) var416 << 32) + (long) var420;
                                                    field477.method3544(new class201(var419), var421);
                                                }
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 183) {
                                            int var423 = field407.method2342();
                                            int var424 = field407.method2339();
                                            if (var423 < -70000) {
                                                var424 += 32768;
                                            }
                                            class173 var425;
                                            if (var423 >= 0) {
                                                var425 = class173.method2550(var423);
                                            } else {
                                                var425 = null;
                                            }
                                            if (var425 != null) {
                                                for (int var426 = 0; var426 < var425.field2873.length; var426++) {
                                                    var425.field2873[var426] = 0;
                                                    var425.field2773[var426] = 0;
                                                }
                                            }
                                            class16 var427 = (class16) class16.field210.method3545((long) var424);
                                            if (var427 != null) {
                                                for (int var428 = 0; var428 < var427.field209.length; var428++) {
                                                    var427.field209[var428] = -1;
                                                    var427.field211[var428] = 0;
                                                }
                                            }
                                            int var429 = field407.method2339();
                                            for (int var430 = 0; var430 < var429; var430++) {
                                                int var431 = field407.method2363();
                                                if (var431 == 255) {
                                                    var431 = field407.method2381();
                                                }
                                                int var432 = field407.method2522();
                                                if (var425 != null && var430 < var425.field2873.length) {
                                                    var425.field2873[var430] = var432;
                                                    var425.field2773[var430] = var431;
                                                }
                                                class16.method578(var424, var430, var432 - 1, var431);
                                            }
                                            if (var425 != null) {
                                                method239(var425);
                                            }
                                            method2115();
                                            field463[++field464 - 1 & 0x1F] = var424 & 0x7FFF;
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 238) {
                                            int var433 = field407.method2490();
                                            int var434 = field407.method2380();
                                            class173 var435 = class173.method2550(var434);
                                            if (var435.field2862 != var433 || var433 == -1) {
                                                var435.field2862 = var433;
                                                var435.field2877 = 0;
                                                var435.field2878 = 0;
                                                method239(var435);
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 57) {
                                            int var436 = field407.method2374();
                                            int var437 = field407.method2374();
                                            int var438 = field407.method2381();
                                            class173 var439 = class173.method2550(var438);
                                            if (var439.field2766 != var436 || var439.field2837 != var437 || var439.field2762 != 0 || var439.field2763 != 0) {
                                                var439.field2766 = var436;
                                                var439.field2837 = var437;
                                                var439.field2762 = 0;
                                                var439.field2763 = 0;
                                                method239(var439);
                                                method745(var439);
                                                if (var439.field2759 == 0) {
                                                    method662(Statics.field2754[var438 >> 16], var439, false);
                                                }
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 95) {
                                            int var440 = field407.method2380();
                                            int var441 = field407.method2342();
                                            class4 var442 = (class4) field436.method3545((long) var440);
                                            class4 var443 = (class4) field436.method3545((long) var441);
                                            if (var443 != null) {
                                                method2590(var443, var442 == null || var442.field66 != var443.field66);
                                            }
                                            if (var442 != null) {
                                                var442.method3670();
                                                field436.method3544(var442, (long) var441);
                                            }
                                            class173 var444 = class173.method2550(var440);
                                            if (var444 != null) {
                                                method239(var444);
                                            }
                                            class173 var445 = class173.method2550(var441);
                                            if (var445 != null) {
                                                method239(var445);
                                                method662(Statics.field2754[var445.field2757 >>> 16], var445, true);
                                            }
                                            if (field379 != -1) {
                                                method193(field379, 1);
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 27) {
                                            String var446 = field407.method2528();
                                            long var447 = (long) field407.method2339();
                                            long var449 = (long) field407.method2341();
                                            class152[] var451 = new class152[] { class152.field2261, class152.field2268, class152.field2260, class152.field2263, class152.field2262 };
                                            class152 var452 = (class152) class109.method1468(var451, field407.method2427());
                                            long var453 = (var447 << 32) + var449;
                                            boolean var455 = false;
                                            for (int var456 = 0; var456 < 100; var456++) {
                                                if (field335[var456] == var453) {
                                                    var455 = true;
                                                    break;
                                                }
                                            }
                                            if (method83(var446)) {
                                                var455 = true;
                                            }
                                            if (!var455 && field396 == 0) {
                                                field335[field497] = var453;
                                                field497 = (field497 + 1) % 100;
                                                String var457 = class223.method3770(class163.method646(Statics.method648(field407)));
                                                byte var458;
                                                if (var452.field2267) {
                                                    var458 = 7;
                                                } else {
                                                    var458 = 3;
                                                }
                                                if (var452.field2266 == -1) {
                                                    class12.method2960(var458, var446, var457);
                                                } else {
                                                    int var460 = var452.field2266;
                                                    String var461 = "<img=" + var460 + ">";
                                                    class12.method2960(var458, var461 + var446, var457);
                                                }
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 8) {
                                            method674(false);
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 110) {
                                            Statics.field1149 = field407.method2364();
                                            Statics.field26 = field407.method2427();
                                            while (field407.field1974 < field323) {
                                                field334 = field407.method2427();
                                                method8();
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 152) {
                                            field465 = field407.method2427();
                                            if (field465 == 1) {
                                                field297 = field407.method2339();
                                            }
                                            if (field465 >= 2 && field465 <= 6) {
                                                if (field465 == 2) {
                                                    field364 = 64;
                                                    field507 = 64;
                                                }
                                                if (field465 == 3) {
                                                    field364 = 0;
                                                    field507 = 64;
                                                }
                                                if (field465 == 4) {
                                                    field364 = 128;
                                                    field507 = 64;
                                                }
                                                if (field465 == 5) {
                                                    field364 = 64;
                                                    field507 = 0;
                                                }
                                                if (field465 == 6) {
                                                    field364 = 64;
                                                    field507 = 128;
                                                }
                                                field465 = 2;
                                                field299 = field407.method2339();
                                                field300 = field407.method2339();
                                                field301 = field407.method2427();
                                            }
                                            if (field465 == 10) {
                                                field298 = field407.method2339();
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 146) {
                                            int var462 = field407.method2333();
                                            int var463 = field407.method2373();
                                            int var464 = field407.method2339();
                                            int var465 = field407.method2339();
                                            class173 var466 = class173.method2550(var462);
                                            if (var466.field2806 != var463 || var466.field2874 != var464 || var466.field2809 != var465) {
                                                var466.field2806 = var463;
                                                var466.field2874 = var464;
                                                var466.field2809 = var465;
                                                method239(var466);
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 179) {
                                            int var467 = field407.method2339();
                                            field379 = var467;
                                            int var468 = field379;
                                            int var469 = Statics.field1146;
                                            int var470 = Statics.field590;
                                            if (Statics.method2271(var468)) {
                                                method3242(Statics.field2754[var468], -1, var469, var470, false);
                                            }
                                            method2946(var467);
                                            class37.method1743(field379);
                                            for (int var471 = 0; var471 < 100; var471++) {
                                                field450[var471] = true;
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 247) {
                                            int var472 = field407.method2342();
                                            int var473 = field407.method2522();
                                            class173 var474 = class173.method2550(var472);
                                            if (var474.field2798 != 2 || var474.field2799 != var473) {
                                                var474.field2798 = 2;
                                                var474.field2799 = var473;
                                                method239(var474);
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 3) {
                                            field314 = field407.method2427();
                                            if (field314 == 255) {
                                                field314 = 0;
                                            }
                                            field384 = field407.method2427();
                                            if (field384 == 255) {
                                                field384 = 0;
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 205) {
                                            method2115();
                                            int var475 = field407.method2427();
                                            int var476 = field407.method2364();
                                            int var477 = field407.method2381();
                                            field413[var475] = var477;
                                            field411[var475] = var476;
                                            field412[var475] = 1;
                                            for (int var478 = 0; var478 < 98; var478++) {
                                                if (var477 >= class155.field2295[var478]) {
                                                    field412[var475] = var478 + 2;
                                                }
                                            }
                                            field474[++field466 - 1 & 0x1F] = var475;
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 130) {
                                            String var479 = field407.method2528();
                                            int var480 = field407.method2339();
                                            byte var481 = field407.method2338();
                                            boolean var482 = false;
                                            if (var481 == -128) {
                                                var482 = true;
                                            }
                                            if (var482) {
                                                if (Statics.field148 == 0) {
                                                    field334 = -1;
                                                    var266 = true;
                                                    break label4386;
                                                }
                                                boolean var483 = false;
                                                int var484;
                                                for (var484 = 0; var484 < Statics.field148 && (!Statics.field1658[var484].field618.equals(var479) || Statics.field1658[var484].field630 != var480); var484++) {
                                                }
                                                if (var484 < Statics.field148) {
                                                    while (var484 < Statics.field148 - 1) {
                                                        Statics.field1658[var484] = Statics.field1658[var484 + 1];
                                                        var484++;
                                                    }
                                                    Statics.field148--;
                                                    Statics.field1658[Statics.field148] = null;
                                                }
                                            } else {
                                                field407.method2528();
                                                class25 var485 = new class25();
                                                var485.field618 = var479;
                                                var485.field617 = class164.method928(var485.field618, Statics.field281);
                                                var485.field630 = var480;
                                                var485.field616 = var481;
                                                int var486;
                                                for (var486 = Statics.field148 - 1; var486 >= 0; var486--) {
                                                    int var487 = Statics.field1658[var486].field617.compareTo(var485.field617);
                                                    if (var487 == 0) {
                                                        Statics.field1658[var486].field630 = var480;
                                                        Statics.field1658[var486].field616 = var481;
                                                        if (var479.equals(Statics.field159.field58)) {
                                                            Statics.field2000 = var481;
                                                        }
                                                        field469 = field460;
                                                        field334 = -1;
                                                        var266 = true;
                                                        break label4386;
                                                    }
                                                    if (var487 < 0) {
                                                        break;
                                                    }
                                                }
                                                if (Statics.field148 >= Statics.field1658.length) {
                                                    field334 = -1;
                                                    var266 = true;
                                                    break label4386;
                                                }
                                                for (int var488 = Statics.field148 - 1; var488 > var486; var488--) {
                                                    Statics.field1658[var488 + 1] = Statics.field1658[var488];
                                                }
                                                if (Statics.field148 == 0) {
                                                    Statics.field1658 = new class25[100];
                                                }
                                                Statics.field1658[var486 + 1] = var485;
                                                Statics.field148++;
                                                if (var479.equals(Statics.field159.field58)) {
                                                    Statics.field2000 = var481;
                                                }
                                            }
                                            field469 = field460;
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 18) {
                                            method674(true);
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 12) {
                                            while (field407.field1974 < field323) {
                                                int var489 = field407.method2427();
                                                boolean var490 = (var489 & 0x1) == 1;
                                                String var491 = field407.method2528();
                                                String var492 = field407.method2528();
                                                field407.method2528();
                                                for (int var493 = 0; var493 < field547; var493++) {
                                                    class8 var494 = field548[var493];
                                                    if (var490) {
                                                        if (var492.equals(var494.field124)) {
                                                            var494.field124 = var491;
                                                            var494.field123 = var492;
                                                            var491 = null;
                                                            break;
                                                        }
                                                    } else if (var491.equals(var494.field124)) {
                                                        var494.field124 = var491;
                                                        var494.field123 = var492;
                                                        var491 = null;
                                                        break;
                                                    }
                                                }
                                                if (var491 != null && field547 < 400) {
                                                    class8 var495 = new class8();
                                                    field548[field547] = var495;
                                                    var495.field124 = var491;
                                                    var495.field123 = var492;
                                                    field547++;
                                                }
                                            }
                                            field468 = field460;
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 17) {
                                            String var496 = field407.method2528();
                                            String var497 = class223.method3770(class163.method646(Statics.method648(field407)));
                                            class12.method2960(6, var496, var497);
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 154) {
                                            int var498 = field407.method2381();
                                            int var499 = field407.method2339();
                                            class173 var500 = class173.method2550(var498);
                                            if (var500.field2798 != 1 || var500.field2799 != var499) {
                                                var500.field2798 = 1;
                                                var500.field2799 = var499;
                                                method239(var500);
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 214) {
                                            int var501 = field407.method2381();
                                            int var502 = field407.method2373();
                                            if (var502 == 65535) {
                                                var502 = -1;
                                            }
                                            int var503 = field407.method2381();
                                            int var504 = field407.method2339();
                                            if (var504 == 65535) {
                                                var504 = -1;
                                            }
                                            for (int var505 = var502; var505 <= var504; var505++) {
                                                long var506 = ((long) var501 << 32) + (long) var505;
                                                class208 var508 = field477.method3545(var506);
                                                if (var508 != null) {
                                                    var508.method3670();
                                                }
                                                field477.method3544(new class201(var503), var506);
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 203) {
                                            while (field407.field1974 < field323) {
                                                boolean var509 = field407.method2427() == 1;
                                                String var510 = field407.method2528();
                                                String var511 = field407.method2528();
                                                int var512 = field407.method2339();
                                                int var513 = field407.method2427();
                                                int var514 = field407.method2427();
                                                boolean var515 = (var514 & 0x2) != 0;
                                                boolean var516 = (var514 & 0x1) != 0;
                                                if (var512 > 0) {
                                                    field407.method2528();
                                                    field407.method2427();
                                                    field407.method2342();
                                                }
                                                field407.method2528();
                                                for (int var517 = 0; var517 < field293; var517++) {
                                                    class18 var518 = field545[var517];
                                                    if (var509) {
                                                        if (var511.equals(var518.field239)) {
                                                            var518.field239 = var510;
                                                            var518.field234 = var511;
                                                            var510 = null;
                                                            break;
                                                        }
                                                    } else if (var510.equals(var518.field239)) {
                                                        if (var518.field236 != var512) {
                                                            boolean var519 = true;
                                                            for (class39 var520 = (class39) field467.method3542(); var520 != null; var520 = (class39) field467.method3540()) {
                                                                if (var520.field871.equals(var510)) {
                                                                    if (var512 != 0 && var520.field872 == 0) {
                                                                        var520.method3664();
                                                                        var519 = false;
                                                                    } else if (var512 == 0 && var520.field872 != 0) {
                                                                        var520.method3664();
                                                                        var519 = false;
                                                                    }
                                                                }
                                                            }
                                                            if (var519) {
                                                                field467.method3536(new class39(var510, var512));
                                                            }
                                                            var518.field236 = var512;
                                                        }
                                                        var518.field234 = var511;
                                                        var518.field237 = var513;
                                                        var518.field238 = var515;
                                                        var518.field241 = var516;
                                                        var510 = null;
                                                        break;
                                                    }
                                                }
                                                if (var510 != null && field293 < 400) {
                                                    class18 var521 = new class18();
                                                    field545[field293] = var521;
                                                    var521.field239 = var510;
                                                    var521.field234 = var511;
                                                    var521.field236 = var512;
                                                    var521.field237 = var513;
                                                    var521.field238 = var515;
                                                    var521.field241 = var516;
                                                    field293++;
                                                }
                                            }
                                            field544 = 2;
                                            field468 = field460;
                                            boolean var522 = false;
                                            int var523 = field293;
                                            while (var523 > 0) {
                                                boolean var524 = true;
                                                var523--;
                                                for (int var525 = 0; var525 < var523; var525++) {
                                                    boolean var526 = false;
                                                    class18 var527 = field545[var525];
                                                    class18 var528 = field545[var525 + 1];
                                                    if (field543 != var527.field236 && field543 == var528.field236) {
                                                        var526 = true;
                                                    }
                                                    if (!var526 && var527.field236 == 0 && var528.field236 != 0) {
                                                        var526 = true;
                                                    }
                                                    if (!var526 && !var527.field238 && var528.field238) {
                                                        var526 = true;
                                                    }
                                                    if (!var526 && !var527.field241 && var528.field241) {
                                                        var526 = true;
                                                    }
                                                    if (var526) {
                                                        class18 var529 = field545[var525];
                                                        field545[var525] = field545[var525 + 1];
                                                        field545[var525 + 1] = var529;
                                                        var524 = false;
                                                    }
                                                }
                                                if (var524) {
                                                    break;
                                                }
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 239) {
                                            int var530 = field407.method2380();
                                            int var531 = field407.method2365();
                                            int var532 = field407.method2373();
                                            class4 var533 = (class4) field436.method3545((long) var530);
                                            if (var533 != null) {
                                                method2590(var533, var533.field66 != var532);
                                            }
                                            method2255(var530, var532, var531);
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 36) {
                                            int var534 = field407.method2333();
                                            class173 var535 = class173.method2550(var534);
                                            for (int var536 = 0; var536 < var535.field2873.length; var536++) {
                                                var535.field2873[var536] = -1;
                                                var535.field2873[var536] = 0;
                                            }
                                            method239(var535);
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 229) {
                                            int var537 = field407.method2342();
                                            int var538 = field407.method2339();
                                            if (var537 < -70000) {
                                                var538 += 32768;
                                            }
                                            class173 var539;
                                            if (var537 >= 0) {
                                                var539 = class173.method2550(var537);
                                            } else {
                                                var539 = null;
                                            }
                                            while (field407.field1974 < field323) {
                                                int var540 = field407.method2350();
                                                int var541 = field407.method2339();
                                                int var542 = 0;
                                                if (var541 != 0) {
                                                    var542 = field407.method2427();
                                                    if (var542 == 255) {
                                                        var542 = field407.method2342();
                                                    }
                                                }
                                                if (var539 != null && var540 >= 0 && var540 < var539.field2873.length) {
                                                    var539.field2873[var540] = var541;
                                                    var539.field2773[var540] = var542;
                                                }
                                                class16.method578(var538, var540, var541 - 1, var542);
                                            }
                                            if (var539 != null) {
                                                method239(var539);
                                            }
                                            method2115();
                                            field463[++field464 - 1 & 0x1F] = var538 & 0x7FFF;
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 26) {
                                            if (field379 != -1) {
                                                method193(field379, 0);
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 133) {
                                            int var543 = field407.method2333();
                                            int var544 = field407.method2373();
                                            class173 var545 = class173.method2550(var543);
                                            if (var545 != null && var545.field2759 == 0) {
                                                if (var544 > var545.field2781 - var545.field2796) {
                                                    var544 = var545.field2781 - var545.field2796;
                                                }
                                                if (var544 < 0) {
                                                    var544 = 0;
                                                }
                                                if (var545.field2779 != var544) {
                                                    var545.field2779 = var544;
                                                    method239(var545);
                                                }
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 254) {
                                            class122 var546 = field407;
                                            int var547 = field323;
                                            class210 var548 = new class210();
                                            var548.field3122 = var546.method2427();
                                            var548.field3115 = var546.method2342();
                                            var548.field3114 = new int[var548.field3122];
                                            var548.field3121 = new int[var548.field3122];
                                            var548.field3118 = new Field[var548.field3122];
                                            var548.field3119 = new int[var548.field3122];
                                            var548.field3120 = new Method[var548.field3122];
                                            var548.field3116 = new byte[var548.field3122][][];
                                            for (int var549 = 0; var549 < var548.field3122; var549++) {
                                                try {
                                                    int var550 = var546.method2427();
                                                    if (var550 == 0 || var550 == 1 || var550 == 2) {
                                                        String var551 = var546.method2528();
                                                        String var552 = var546.method2528();
                                                        int var553 = 0;
                                                        if (var550 == 1) {
                                                            var553 = var546.method2342();
                                                        }
                                                        var548.field3114[var549] = var550;
                                                        var548.field3119[var549] = var553;
                                                        if (class211.method931(var551).getClassLoader() == null) {
                                                            throw new SecurityException();
                                                        }
                                                        var548.field3118[var549] = class211.method931(var551).getDeclaredField(var552);
                                                    } else if (var550 == 3 || var550 == 4) {
                                                        String var554 = var546.method2528();
                                                        String var555 = var546.method2528();
                                                        int var556 = var546.method2427();
                                                        String[] var557 = new String[var556];
                                                        for (int var558 = 0; var558 < var556; var558++) {
                                                            var557[var558] = var546.method2528();
                                                        }
                                                        String var559 = var546.method2528();
                                                        byte[][] var560 = new byte[var556][];
                                                        if (var550 == 3) {
                                                            for (int var561 = 0; var561 < var556; var561++) {
                                                                int var562 = var546.method2342();
                                                                var560[var561] = new byte[var562];
                                                                var546.method2348(var560[var561], 0, var562);
                                                            }
                                                        }
                                                        var548.field3114[var549] = var550;
                                                        Class[] var563 = new Class[var556];
                                                        for (int var564 = 0; var564 < var556; var564++) {
                                                            var563[var564] = class211.method931(var557[var564]);
                                                        }
                                                        Class var565 = class211.method931(var559);
                                                        if (class211.method931(var554).getClassLoader() == null) {
                                                            throw new SecurityException();
                                                        }
                                                        Method[] var566 = class211.method931(var554).getDeclaredMethods();
                                                        Method[] var567 = var566;
                                                        for (int var568 = 0; var568 < var567.length; var568++) {
                                                            Method var569 = var567[var568];
                                                            if (var569.getName().equals(var555)) {
                                                                Class[] var570 = var569.getParameterTypes();
                                                                if (var563.length == var570.length) {
                                                                    boolean var571 = true;
                                                                    for (int var572 = 0; var572 < var563.length; var572++) {
                                                                        if (var563[var572] != var570[var572]) {
                                                                            var571 = false;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (var571 && var565 == var569.getReturnType()) {
                                                                        var548.field3120[var549] = var569;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var548.field3116[var549] = var560;
                                                    }
                                                } catch (ClassNotFoundException var721) {
                                                    var548.field3121[var549] = -1;
                                                } catch (SecurityException var722) {
                                                    var548.field3121[var549] = -2;
                                                } catch (NullPointerException var723) {
                                                    var548.field3121[var549] = -3;
                                                } catch (Exception var724) {
                                                    var548.field3121[var549] = -4;
                                                } catch (Throwable var725) {
                                                    var548.field3121[var549] = -5;
                                                }
                                            }
                                            class211.field3123.method3612(var548);
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 223) {
                                            method2636();
                                            field334 = -1;
                                            var266 = false;
                                            break label4386;
                                        }
                                        if (field334 == 15) {
                                            int var578 = field407.method2371();
                                            byte var579 = field407.method2541();
                                            class176.field2905[var578] = var579;
                                            if (class176.field2906[var578] != var579) {
                                                class176.field2906[var578] = var579;
                                            }
                                            method2663(var578);
                                            field317[++field370 - 1 & 0x1F] = var578;
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 206) {
                                            String var580 = field407.method2528();
                                            Statics.field285 = var580;
                                            try {
                                                String var581 = Statics.field276.getParameter(class190.field3062.field3058);
                                                String var582 = Statics.field276.getParameter(class190.field3063.field3058);
                                                String var583 = var581 + "settings=" + var580 + "; version=1; path=/; domain=" + var582;
                                                String var584;
                                                if (var580.length() == 0) {
                                                    var584 = var583 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                                                } else {
                                                    var584 = var583 + "; Expires=" + class111.method2019(class115.method102() + 94608000000L) + "; Max-Age=" + 94608000L;
                                                }
                                                client var585 = Statics.field276;
                                                String var586 = "document.cookie=\"" + var584 + "\"";
                                                JSObject.getWindow(var585).eval(var586);
                                            } catch (Throwable var717) {
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 76) {
                                            Statics.field26 = field407.method2363();
                                            Statics.field1149 = field407.method2364();
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 67) {
                                            int var588 = field407.method2342();
                                            int var589 = field407.method2342();
                                            if (Statics.field1009 == null || !Statics.field1009.isValid()) {
                                                try {
                                                    Iterator var590 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                                    while (var590.hasNext()) {
                                                        GarbageCollectorMXBean var591 = (GarbageCollectorMXBean) var590.next();
                                                        if (var591.isValid()) {
                                                            Statics.field1009 = var591;
                                                            field554 = -1L;
                                                            field553 = -1L;
                                                        }
                                                    }
                                                } catch (Throwable var720) {
                                                }
                                            }
                                            long var593 = class115.method102();
                                            int var595 = -1;
                                            if (Statics.field1009 != null) {
                                                long var596 = Statics.field1009.getCollectionTime();
                                                if (field553 != -1L) {
                                                    long var598 = var596 - field553;
                                                    long var600 = var593 - field554;
                                                    if (var600 != 0L) {
                                                        var595 = (int) (var598 * 100L / var600);
                                                    }
                                                }
                                                field553 = var596;
                                                field554 = var593;
                                            }
                                            field312.method2612(25);
                                            field312.method2520(var588);
                                            field312.method2454(var589);
                                            field312.method2360(field2194);
                                            field312.method2360(var595);
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 118) {
                                            field544 = 1;
                                            field468 = field460;
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 170) {
                                            field469 = field460;
                                            if (field323 == 0) {
                                                field422 = null;
                                                field316 = null;
                                                Statics.field148 = 0;
                                                Statics.field1658 = null;
                                                field334 = -1;
                                                var266 = true;
                                                break label4386;
                                            }
                                            field316 = field407.method2528();
                                            long var602 = field407.method2343();
                                            field422 = class162.method675(var602);
                                            Statics.field706 = field407.method2338();
                                            int var604 = field407.method2427();
                                            if (var604 == 255) {
                                                field334 = -1;
                                                var266 = true;
                                                break label4386;
                                            }
                                            Statics.field148 = var604;
                                            class25[] var605 = new class25[100];
                                            for (int var606 = 0; var606 < Statics.field148; var606++) {
                                                var605[var606] = new class25();
                                                var605[var606].field618 = field407.method2528();
                                                var605[var606].field617 = class164.method928(var605[var606].field618, Statics.field281);
                                                var605[var606].field630 = field407.method2339();
                                                var605[var606].field616 = field407.method2338();
                                                field407.method2528();
                                                if (var605[var606].field618.equals(Statics.field159.field58)) {
                                                    Statics.field2000 = var605[var606].field616;
                                                }
                                            }
                                            boolean var607 = false;
                                            int var608 = Statics.field148;
                                            while (var608 > 0) {
                                                boolean var609 = true;
                                                var608--;
                                                for (int var610 = 0; var610 < var608; var610++) {
                                                    if (var605[var610].field617.compareTo(var605[var610 + 1].field617) > 0) {
                                                        class25 var611 = var605[var610];
                                                        var605[var610] = var605[var610 + 1];
                                                        var605[var610 + 1] = var611;
                                                        var609 = false;
                                                    }
                                                }
                                                if (var609) {
                                                    break;
                                                }
                                            }
                                            Statics.field1658 = var605;
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 20) {
                                            int var612 = field407.method2522();
                                            int var613 = field407.method2371();
                                            int var614 = field407.method2342();
                                            class173 var615 = class173.method2550(var614);
                                            var615.field2811 = (var613 << 16) + var612;
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        if (field334 == 9) {
                                            method1164(true);
                                            field407.method2604();
                                            int var616 = field407.method2339();
                                            class122 var617 = field407;
                                            int var618 = var617.field1974;
                                            class33.field756 = 0;
                                            int var619 = 0;
                                            var617.method2596();
                                            for (int var620 = 0; var620 < class33.field754; var620++) {
                                                int var621 = class33.field750[var620];
                                                if ((class33.field746[var621] & 0x1) == 0) {
                                                    if (var619 > 0) {
                                                        var619--;
                                                        class33.field746[var621] = (byte) (class33.field746[var621] | 0x2);
                                                    } else {
                                                        int var622 = var617.method2607(1);
                                                        if (var622 == 0) {
                                                            var619 = class33.method159(var617);
                                                            class33.field746[var621] = (byte) (class33.field746[var621] | 0x2);
                                                        } else {
                                                            class33.method1936(var617, var621);
                                                        }
                                                    }
                                                }
                                            }
                                            var617.method2598();
                                            if (var619 != 0) {
                                                throw new RuntimeException();
                                            }
                                            var617.method2596();
                                            for (int var623 = 0; var623 < class33.field754; var623++) {
                                                int var624 = class33.field750[var623];
                                                if ((class33.field746[var624] & 0x1) != 0) {
                                                    if (var619 > 0) {
                                                        var619--;
                                                        class33.field746[var624] = (byte) (class33.field746[var624] | 0x2);
                                                    } else {
                                                        int var625 = var617.method2607(1);
                                                        if (var625 == 0) {
                                                            var619 = class33.method159(var617);
                                                            class33.field746[var624] = (byte) (class33.field746[var624] | 0x2);
                                                        } else {
                                                            class33.method1936(var617, var624);
                                                        }
                                                    }
                                                }
                                            }
                                            var617.method2598();
                                            if (var619 != 0) {
                                                throw new RuntimeException();
                                            }
                                            var617.method2596();
                                            for (int var626 = 0; var626 < class33.field751; var626++) {
                                                int var627 = class33.field752[var626];
                                                if ((class33.field746[var627] & 0x1) != 0) {
                                                    if (var619 > 0) {
                                                        var619--;
                                                        class33.field746[var627] = (byte) (class33.field746[var627] | 0x2);
                                                    } else {
                                                        int var628 = var617.method2607(1);
                                                        if (var628 == 0) {
                                                            var619 = class33.method159(var617);
                                                            class33.field746[var627] = (byte) (class33.field746[var627] | 0x2);
                                                        } else if (class33.method2683(var617, var627)) {
                                                            class33.field746[var627] = (byte) (class33.field746[var627] | 0x2);
                                                        }
                                                    }
                                                }
                                            }
                                            var617.method2598();
                                            if (var619 != 0) {
                                                throw new RuntimeException();
                                            }
                                            var617.method2596();
                                            for (int var629 = 0; var629 < class33.field751; var629++) {
                                                int var630 = class33.field752[var629];
                                                if ((class33.field746[var630] & 0x1) == 0) {
                                                    if (var619 > 0) {
                                                        var619--;
                                                        class33.field746[var630] = (byte) (class33.field746[var630] | 0x2);
                                                    } else {
                                                        int var631 = var617.method2607(1);
                                                        if (var631 == 0) {
                                                            var619 = class33.method159(var617);
                                                            class33.field746[var630] = (byte) (class33.field746[var630] | 0x2);
                                                        } else if (class33.method2683(var617, var630)) {
                                                            class33.field746[var630] = (byte) (class33.field746[var630] | 0x2);
                                                        }
                                                    }
                                                }
                                            }
                                            var617.method2598();
                                            if (var619 != 0) {
                                                throw new RuntimeException();
                                            }
                                            class33.field754 = 0;
                                            class33.field751 = 0;
                                            for (int var632 = 1; var632 < 2048; var632++) {
                                                class33.field746[var632] = (byte) (class33.field746[var632] >> 1);
                                                class3 var633 = field337[var632];
                                                if (var633 == null) {
                                                    class33.field752[++class33.field751 - 1] = var632;
                                                } else {
                                                    class33.field750[++class33.field754 - 1] = var632;
                                                }
                                            }
                                            for (int var634 = 0; var634 < class33.field756; var634++) {
                                                int var635 = class33.field757[var634];
                                                class3 var636 = field337[var635];
                                                int var637 = var617.method2427();
                                                if ((var637 & 0x2) != 0) {
                                                    var637 += var617.method2427() << 8;
                                                }
                                                class33.method2814(var617, var635, var636, var637);
                                            }
                                            if (var617.field1974 - var618 != var616) {
                                                throw new RuntimeException(var617.field1974 - var618 + " " + var616);
                                            }
                                            field334 = -1;
                                            var266 = true;
                                            break label4386;
                                        }
                                        class148.method2262("" + field334 + class2.field21 + field328 + class2.field21 + field329 + class2.field21 + field323, (Throwable) null);
                                        method2636();
                                    } catch (IOException var726) {
                                        method104();
                                    } catch (Exception var727) {
                                        String var640 = "" + field334 + class2.field21 + field328 + class2.field21 + field329 + class2.field21 + field323 + class2.field21 + (Statics.field253 + Statics.field159.field865[0]) + class2.field21 + (Statics.field2902 + Statics.field159.field827[0]) + class2.field21;
                                        for (int var641 = 0; var641 < field323 && var641 < 50; var641++) {
                                            var640 = var640 + field407.field1977[var641] + class2.field21;
                                        }
                                        class148.method2262(var640, var727);
                                        method2636();
                                    }
                                    var266 = true;
                                }
                            }
                            if (!var266) {
                                break;
                            }
                        }
                        if (field546 == 30) {
                            while (class211.method241()) {
                                field312.method2612(108);
                                field312.method2322(0);
                                int var642 = field312.field1974;
                                class211.method661(field312);
                                field312.method2334(field312.field1974 - var642);
                            }
                            Object var643 = Statics.field674.field184;
                            synchronized (Statics.field674.field184) {
                                if (!field277) {
                                    Statics.field674.field187 = 0;
                                } else if (class140.field2150 != 0 || Statics.field674.field187 >= 40) {
                                    field312.method2612(129);
                                    field312.method2322(0);
                                    int var644 = field312.field1974;
                                    int var645 = 0;
                                    for (int var646 = 0; var646 < Statics.field674.field187 && field312.field1974 - var644 < 240; var646++) {
                                        var645++;
                                        int var647 = Statics.field674.field183[var646];
                                        if (var647 < 0) {
                                            var647 = 0;
                                        } else if (var647 > 502) {
                                            var647 = 502;
                                        }
                                        int var648 = Statics.field674.field186[var646];
                                        if (var648 < 0) {
                                            var648 = 0;
                                        } else if (var648 > 764) {
                                            var648 = 764;
                                        }
                                        int var649 = var647 * 765 + var648;
                                        if (Statics.field674.field183[var646] == -1 && Statics.field674.field186[var646] == -1) {
                                            var648 = -1;
                                            var647 = -1;
                                            var649 = 524287;
                                        }
                                        if (field459 != var648 || field291 != var647) {
                                            int var650 = var648 - field459;
                                            field459 = var648;
                                            int var651 = var647 - field291;
                                            field291 = var647;
                                            if (field292 < 8 && var650 >= -32 && var650 <= 31 && var651 >= -32 && var651 <= 31) {
                                                var650 += 32;
                                                var651 += 32;
                                                field312.method2481((field292 << 12) + (var650 << 6) + var651);
                                                field292 = 0;
                                            } else if (field292 < 8) {
                                                field312.method2423((field292 << 19) + 8388608 + var649);
                                                field292 = 0;
                                            } else {
                                                field312.method2327((field292 << 19) + -1073741824 + var649);
                                                field292 = 0;
                                            }
                                        } else if (field292 < 2047) {
                                            field292++;
                                        }
                                    }
                                    field312.method2334(field312.field1974 - var644);
                                    if (var645 >= Statics.field674.field187) {
                                        Statics.field674.field187 = 0;
                                    } else {
                                        Statics.field674.field187 -= var645;
                                        for (int var652 = 0; var652 < Statics.field674.field187; var652++) {
                                            Statics.field674.field186[var652] = Statics.field674.field186[var645 + var652];
                                            Statics.field674.field183[var652] = Statics.field674.field183[var645 + var652];
                                        }
                                    }
                                }
                            }
                            if (class140.field2150 == 1 || !Statics.field977 && class140.field2150 == 4 || class140.field2150 == 2) {
                                long var654 = (class140.field2152 - field375) / 50L;
                                if (var654 > 4095L) {
                                    var654 = 4095L;
                                }
                                field375 = class140.field2152;
                                int var656 = class140.field2154;
                                if (var656 < 0) {
                                    var656 = 0;
                                } else if (var656 > Statics.field590) {
                                    var656 = Statics.field590;
                                }
                                int var657 = class140.field2151;
                                if (var657 < 0) {
                                    var657 = 0;
                                } else if (var657 > Statics.field1146) {
                                    var657 = Statics.field1146;
                                }
                                int var658 = (int) var654;
                                field312.method2612(157);
                                field312.method2481((var658 << 1) + (class140.field2150 == 2 ? 1 : 0));
                                field312.method2481(var657);
                                field312.method2481(var656);
                            }
                            if (class137.field2115 > 0) {
                                field312.method2612(204);
                                field312.method2481(0);
                                int var659 = field312.field1974;
                                long var660 = class115.method102();
                                for (int var662 = 0; var662 < class137.field2115; var662++) {
                                    long var663 = var660 - field501;
                                    if (var663 > 16777215L) {
                                        var663 = 16777215L;
                                    }
                                    field501 = var660;
                                    field312.method2423((int) var663);
                                    field312.method2360(class137.field2114[var662]);
                                }
                                field312.method2432(field312.field1974 - var659);
                            }
                            if (field355 > 0) {
                                field355--;
                            }
                            if (class137.field2124[96] || class137.field2124[97] || class137.field2124[98] || class137.field2124[99]) {
                                field490 = true;
                            }
                            if (field490 && field355 <= 0) {
                                field355 = 20;
                                field490 = false;
                                field312.method2612(170);
                                field312.method2481(field360);
                                field312.method2481(field361);
                            }
                            if (Statics.field1960 && !field371) {
                                field371 = true;
                                field312.method2612(173);
                                field312.method2322(1);
                            }
                            if (!Statics.field1960 && field371) {
                                field371 = false;
                                field312.method2612(173);
                                field312.method2322(0);
                            }
                            Statics.method48();
                            if (field546 == 30) {
                                method166();
                                for (int var665 = 0; var665 < field289; var665++) {
                                    var10002 = field414[var665]--;
                                    if (field414[var665] >= -10) {
                                        class59 var667 = field522[var665];
                                        if (var667 == null) {
                                            class59 var730 = (class59) null;
                                            var667 = class59.method1190(Statics.field151, field518[var665], 0);
                                            if (var667 == null) {
                                                continue;
                                            }
                                            field414[var665] += var667.method1185();
                                            field522[var665] = var667;
                                        }
                                        if (field414[var665] < 0) {
                                            int var674;
                                            if (field521[var665] == 0) {
                                                var674 = field306;
                                            } else {
                                                int var668 = (field521[var665] & 0xFF) * 128;
                                                int var669 = field521[var665] >> 16 & 0xFF;
                                                int var670 = var669 * 128 + 64 - Statics.field159.field845;
                                                if (var670 < 0) {
                                                    var670 = -var670;
                                                }
                                                int var671 = field521[var665] >> 8 & 0xFF;
                                                int var672 = var671 * 128 + 64 - Statics.field159.field812;
                                                if (var672 < 0) {
                                                    var672 = -var672;
                                                }
                                                int var673 = var670 + var672 - 128;
                                                if (var673 > var668) {
                                                    field414[var665] = -100;
                                                    continue;
                                                }
                                                if (var673 < 0) {
                                                    var673 = 0;
                                                }
                                                var674 = field516 * (var668 - var673) / var668;
                                            }
                                            if (var674 > 0) {
                                                class63 var675 = var667.method1184().method1216(Statics.field1013);
                                                class65 var676 = class65.method1266(var675, 100, var674);
                                                var676.method1242(field519[var665] - 1);
                                                Statics.field2168.method1090(var676);
                                            }
                                            field414[var665] = -100;
                                        }
                                    } else {
                                        field289--;
                                        for (int var666 = var665; var666 < field289; var666++) {
                                            field518[var666] = field518[var666 + 1];
                                            field522[var666] = field522[var666 + 1];
                                            field519[var666] = field519[var666 + 1];
                                            field414[var666] = field414[var666 + 1];
                                            field521[var666] = field521[var666 + 1];
                                        }
                                        var665--;
                                    }
                                }
                                if (field514) {
                                    boolean var677;
                                    if (class183.field2951 == 0) {
                                        var677 = Statics.field128.method3377();
                                    } else {
                                        var677 = true;
                                    }
                                    if (!var677) {
                                        if (field302 != 0 && field362 != -1) {
                                            class183.method2959(Statics.field2277, field362, 0, field302, false);
                                        }
                                        field514 = false;
                                    }
                                }
                                field325++;
                                if (field325 > 750) {
                                    method104();
                                } else {
                                    int var678 = class33.field754;
                                    int[] var679 = class33.field750;
                                    for (int var680 = 0; var680 < var678; var680++) {
                                        class3 var681 = field337[var679[var680]];
                                        if (var681 != null) {
                                            method1509(var681, 1);
                                        }
                                    }
                                    method204();
                                    method3243();
                                    field353++;
                                    if (field381 != 0) {
                                        field534 += 20;
                                        if (field534 >= 400) {
                                            field381 = 0;
                                        }
                                    }
                                    if (Statics.field2269 != null) {
                                        field388++;
                                        if (field388 >= 15) {
                                            method239(Statics.field2269);
                                            Statics.field2269 = null;
                                        }
                                    }
                                    class173 var682 = Statics.field2050;
                                    class173 var683 = Statics.field496;
                                    Statics.field2050 = null;
                                    Statics.field496 = null;
                                    field452 = null;
                                    field456 = false;
                                    field453 = false;
                                    field367 = 0;
                                    while (true) {
                                        while (class137.method712() && field367 < 128) {
                                            if (field442 >= 2 && class137.field2124[82] && Statics.field2025 == 66) {
                                                String var684 = class12.method10();
                                                Statics.field1175.setContents(new StringSelection(var684), (ClipboardOwner) null);
                                            } else {
                                                field500[field367] = Statics.field2025;
                                                field499[field367] = Statics.field1922;
                                                field367++;
                                            }
                                        }
                                        if (field379 != -1) {
                                            method2272(field379, 0, 0, Statics.field1146, Statics.field590, 0, 0);
                                        }
                                        field460++;
                                        while (true) {
                                            class1 var685;
                                            class173 var686;
                                            class173 var687;
                                            do {
                                                var685 = (class1) field475.method3579();
                                                if (var685 == null) {
                                                    while (true) {
                                                        class1 var688;
                                                        class173 var689;
                                                        class173 var690;
                                                        do {
                                                            var688 = (class1) field476.method3579();
                                                            if (var688 == null) {
                                                                while (true) {
                                                                    class1 var691;
                                                                    class173 var692;
                                                                    class173 var693;
                                                                    do {
                                                                        var691 = (class1) field410.method3579();
                                                                        if (var691 == null) {
                                                                            method2629();
                                                                            if (field304 != null) {
                                                                                method713();
                                                                            }
                                                                            if (Statics.field247 != null) {
                                                                                method239(Statics.field247);
                                                                                field395++;
                                                                                if (class140.field2141 == 0) {
                                                                                    if (!field498) {
                                                                                        label2636: {
                                                                                            label2635: {
                                                                                                if (field526 != 1) {
                                                                                                    int var702 = field416 - 1;
                                                                                                    boolean var703;
                                                                                                    if (var702 < 0) {
                                                                                                        var703 = false;
                                                                                                    } else {
                                                                                                        int var704 = field419[var702];
                                                                                                        if (var704 >= 2000) {
                                                                                                            var704 -= 2000;
                                                                                                        }
                                                                                                        if (var704 == 1007) {
                                                                                                            var703 = true;
                                                                                                        } else {
                                                                                                            var703 = false;
                                                                                                        }
                                                                                                    }
                                                                                                    if (!var703) {
                                                                                                        break label2635;
                                                                                                    }
                                                                                                }
                                                                                                if (field416 > 2) {
                                                                                                    method1937(field391, field392);
                                                                                                    break label2636;
                                                                                                }
                                                                                            }
                                                                                            if (field416 > 0) {
                                                                                                method744(field391, field392);
                                                                                            }
                                                                                        }
                                                                                    } else if (Statics.field247 == Statics.field2296 && field393 != field390) {
                                                                                        class173 var694 = Statics.field247;
                                                                                        byte var695 = 0;
                                                                                        if (field438 == 1 && var694.field2771 == 206) {
                                                                                            var695 = 1;
                                                                                        }
                                                                                        if (var694.field2873[field393] <= 0) {
                                                                                            var695 = 0;
                                                                                        }
                                                                                        int var696 = method878(var694);
                                                                                        boolean var697 = (var696 >> 29 & 0x1) != 0;
                                                                                        if (var697) {
                                                                                            int var698 = field390;
                                                                                            int var699 = field393;
                                                                                            var694.field2873[var699] = var694.field2873[var698];
                                                                                            var694.field2773[var699] = var694.field2773[var698];
                                                                                            var694.field2873[var698] = -1;
                                                                                            var694.field2773[var698] = 0;
                                                                                        } else if (var695 == 1) {
                                                                                            int var700 = field390;
                                                                                            int var701 = field393;
                                                                                            while (var700 != var701) {
                                                                                                if (var700 > var701) {
                                                                                                    var694.method3193(var700 - 1, var700);
                                                                                                    var700--;
                                                                                                } else if (var700 < var701) {
                                                                                                    var694.method3193(var700 + 1, var700);
                                                                                                    var700++;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            var694.method3193(field393, field390);
                                                                                        }
                                                                                        field312.method2612(12);
                                                                                        field312.method2369(field393);
                                                                                        field312.method2370(field390);
                                                                                        field312.method2327(Statics.field247.field2757);
                                                                                        field312.method2322(var695);
                                                                                    }
                                                                                    field388 = 10;
                                                                                    class140.field2150 = 0;
                                                                                    Statics.field247 = null;
                                                                                } else if (field395 >= 5 && (class140.field2144 > field391 + 5 || class140.field2144 < field391 - 5 || class140.field2145 > field392 + 5 || class140.field2145 < field392 - 5)) {
                                                                                    field498 = true;
                                                                                }
                                                                            }
                                                                            if (class86.field1498 != -1) {
                                                                                int var705 = class86.field1498;
                                                                                int var706 = class86.field1478;
                                                                                field312.method2612(199);
                                                                                field312.method2322(5);
                                                                                field312.method2369(Statics.field253 + var705);
                                                                                field312.method2369(Statics.field2902 + var706);
                                                                                field312.method2322(class137.field2124[82] ? (class137.field2124[81] ? 2 : 1) : 0);
                                                                                class86.field1498 = -1;
                                                                                field480 = class140.field2151;
                                                                                field385 = class140.field2154;
                                                                                field381 = 1;
                                                                                field534 = 0;
                                                                                field314 = var705;
                                                                                field384 = var706;
                                                                            }
                                                                            if (Statics.field2050 != var682) {
                                                                                if (var682 != null) {
                                                                                    method239(var682);
                                                                                }
                                                                                if (Statics.field2050 != null) {
                                                                                    method239(Statics.field2050);
                                                                                }
                                                                            }
                                                                            if (Statics.field496 != var683 && field427 == field426) {
                                                                                if (var683 != null) {
                                                                                    method239(var683);
                                                                                }
                                                                                if (Statics.field496 != null) {
                                                                                    method239(Statics.field496);
                                                                                }
                                                                            }
                                                                            if (Statics.field496 == null) {
                                                                                if (field426 > 0) {
                                                                                    field426--;
                                                                                }
                                                                            } else if (field426 < field427) {
                                                                                field426++;
                                                                                if (field427 == field426) {
                                                                                    method239(Statics.field496);
                                                                                }
                                                                            }
                                                                            method188();
                                                                            if (field406) {
                                                                                method714();
                                                                            }
                                                                            for (int var707 = 0; var707 < 5; var707++) {
                                                                                var10002 = field529[var707]++;
                                                                            }
                                                                            Statics.field777.method214();
                                                                            int var708 = ++class140.field2139 - 1;
                                                                            int var710 = class137.field2122;
                                                                            if (var708 > 15000 && var710 > 15000) {
                                                                                field330 = 250;
                                                                                class140.field2139 = 14500;
                                                                                field312.method2612(70);
                                                                            }
                                                                            field389++;
                                                                            if (field389 > 500) {
                                                                                field389 = 0;
                                                                                int var712 = (int) (Math.random() * 8.0D);
                                                                                if ((var712 & 0x1) == 1) {
                                                                                    field341 += field342;
                                                                                }
                                                                                if ((var712 & 0x2) == 2) {
                                                                                    field343 += field344;
                                                                                }
                                                                                if ((var712 & 0x4) == 4) {
                                                                                    field345 += field441;
                                                                                }
                                                                            }
                                                                            if (field341 < -50) {
                                                                                field342 = 2;
                                                                            }
                                                                            if (field341 > 50) {
                                                                                field342 = -2;
                                                                            }
                                                                            if (field343 < -55) {
                                                                                field344 = 2;
                                                                            }
                                                                            if (field343 > 55) {
                                                                                field344 = -2;
                                                                            }
                                                                            if (field345 < -40) {
                                                                                field441 = 1;
                                                                            }
                                                                            if (field345 > 40) {
                                                                                field441 = -1;
                                                                            }
                                                                            field380++;
                                                                            if (field380 > 500) {
                                                                                field380 = 0;
                                                                                int var713 = (int) (Math.random() * 8.0D);
                                                                                if ((var713 & 0x1) == 1) {
                                                                                    field348 += field349;
                                                                                }
                                                                                if ((var713 & 0x2) == 2) {
                                                                                    field350 += field404;
                                                                                }
                                                                            }
                                                                            if (field348 < -60) {
                                                                                field349 = 2;
                                                                            }
                                                                            if (field348 > 60) {
                                                                                field349 = -2;
                                                                            }
                                                                            if (field350 < -20) {
                                                                                field404 = 1;
                                                                            }
                                                                            if (field350 > 10) {
                                                                                field404 = -1;
                                                                            }
                                                                            for (class39 var714 = (class39) field467.method3542(); var714 != null; var714 = (class39) field467.method3540()) {
                                                                                if ((long) var714.field877 < class115.method102() / 1000L - 5L) {
                                                                                    if (var714.field872 > 0) {
                                                                                        class12.method2960(5, "", var714.field871 + class157.field2454);
                                                                                    }
                                                                                    if (var714.field872 == 0) {
                                                                                        class12.method2960(5, "", var714.field871 + class157.field2517);
                                                                                    }
                                                                                    var714.method3664();
                                                                                }
                                                                            }
                                                                            field296++;
                                                                            if (field296 > 50) {
                                                                                field312.method2612(113);
                                                                            }
                                                                            try {
                                                                                if (Statics.field269 != null && field312.field1974 > 0) {
                                                                                    Statics.field269.method2820(field312.field1977, 0, field312.field1974);
                                                                                    field312.field1974 = 0;
                                                                                    field296 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var716) {
                                                                                method104();
                                                                            }
                                                                            return;
                                                                        }
                                                                        var692 = var691.field3;
                                                                        if (var692.field2758 < 0) {
                                                                            break;
                                                                        }
                                                                        var693 = class173.method2550(var692.field2857);
                                                                    } while (var693 == null || var693.field2879 == null || var692.field2758 >= var693.field2879.length || var693.field2879[var692.field2758] != var692);
                                                                    class37.method2736(var691, 200000);
                                                                }
                                                            }
                                                            var689 = var688.field3;
                                                            if (var689.field2758 < 0) {
                                                                break;
                                                            }
                                                            var690 = class173.method2550(var689.field2857);
                                                        } while (var690 == null || var690.field2879 == null || var689.field2758 >= var690.field2879.length || var690.field2879[var689.field2758] != var689);
                                                        class37.method2736(var688, 200000);
                                                    }
                                                }
                                                var686 = var685.field3;
                                                if (var686.field2758 < 0) {
                                                    break;
                                                }
                                                var687 = class173.method2550(var686.field2857);
                                            } while (var687 == null || var687.field2879 == null || var686.field2758 >= var687.field2879.length || var687.field2879[var686.field2758] != var686);
                                            class37.method2736(var685, 200000);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (field546 == 40 || field546 == 45) {
                    method2961();
                }
                return;
            }
            var2.field2705.method3137(var2.field2707, (int) var2.field3113, var2.field2708, false);
        }
    }

    @ObfuscatedName("client.t(I)V")
    public final void method446() {
        boolean var1;
        label184: {
            try {
                if (class183.field2951 == 2) {
                    if (Statics.field2958 == null) {
                        Statics.field2958 = class180.method3297(Statics.field2952, Statics.field2953, Statics.field2654);
                        if (Statics.field2958 == null) {
                            var1 = false;
                            break label184;
                        }
                    }
                    if (Statics.field2948 == null) {
                        Statics.field2948 = new class60(Statics.field2950, Statics.field2954);
                    }
                    if (Statics.field128.method3436(Statics.field2958, Statics.field2956, Statics.field2948, 22050)) {
                        Statics.field128.method3378();
                        Statics.field128.method3392(Statics.field673);
                        Statics.field128.method3380(Statics.field2958, Statics.field2957);
                        class183.field2951 = 0;
                        Statics.field2958 = null;
                        Statics.field2948 = null;
                        Statics.field2952 = null;
                        var1 = true;
                        break label184;
                    }
                }
            } catch (Exception var22) {
                var22.printStackTrace();
                Statics.field128.method3427();
                class183.field2951 = 0;
                Statics.field2958 = null;
                Statics.field2948 = null;
                Statics.field2952 = null;
            }
            var1 = false;
        }
        if (var1 && field514 && Statics.field771 != null) {
            Statics.field771.method1133();
        }
        if (field546 == 10 || field546 == 20 || field546 == 30) {
            if (field488 != 0L && class115.method102() > field488) {
                int var4 = field510 ? 2 : 1;
                method640(var4);
            } else if (field2202) {
                class137.method2691(Statics.field60);
                class140.method2955(Statics.field60);
                if (Statics.field873 != null) {
                    Statics.field873.method2673(Statics.field60);
                }
                Statics.field276.method2836();
                Statics.field60.setBackground(Color.black);
                class137.method2257(Statics.field60);
                Canvas var5 = Statics.field60;
                var5.addMouseListener(class140.field2140);
                var5.addMouseMotionListener(class140.field2140);
                var5.addFocusListener(class140.field2140);
                if (Statics.field873 != null) {
                    Statics.field873.method2668(Statics.field60);
                }
                if (field379 != -1) {
                    int var6 = field379;
                    int var7 = Statics.field1146;
                    int var8 = Statics.field590;
                    if (Statics.method2271(var6)) {
                        method3242(Statics.field2754[var6], -1, var7, var8, false);
                    }
                }
                field2201 = true;
            }
        }
        Dimension var9 = this.method2849();
        if (Statics.field3049 != var9.width || Statics.field626 != var9.height || field2201) {
            method6();
            field488 = class115.method102() + 500L;
            field2201 = false;
        }
        boolean var10 = false;
        if (field2188) {
            field2188 = false;
            var10 = true;
            for (int var11 = 0; var11 < 100; var11++) {
                field450[var11] = true;
            }
        }
        if (var10) {
            method240();
        }
        if (field546 == 0) {
            class144.method955(class32.field725, class32.field743, (Color) null, var10);
        } else if (field546 == 5) {
            class32.method129(Statics.field580, Statics.field1659, Statics.field1034, var10);
        } else if (field546 == 10 || field546 == 11) {
            class32.method129(Statics.field580, Statics.field1659, Statics.field1034, var10);
        } else if (field546 == 20) {
            class32.method129(Statics.field580, Statics.field1659, Statics.field1034, var10);
        } else if (field546 == 25) {
            if (field397 == 1) {
                if (field279 > field473) {
                    field473 = field279;
                }
                int var12 = (field473 * 50 - field279 * 50) / field473;
                method1938(class157.field2316 + class2.field29 + class2.field30 + var12 + "%" + class2.field20, false);
            } else if (field397 == 2) {
                if (field354 > field515) {
                    field515 = field354;
                }
                int var13 = (field515 * 50 - field354 * 50) / field515 + 50;
                method1938(class157.field2316 + class2.field29 + class2.field30 + var13 + "%" + class2.field20, false);
            } else {
                method1938(class157.field2316, false);
            }
        } else if (field546 == 30) {
            method45();
        } else if (field546 == 40) {
            method1938(class157.field2317 + class2.field29 + class157.field2489, false);
        } else if (field546 == 45) {
            method1938(class157.field2497, false);
        }
        if (field546 == 30 && field447 == 0 && !var10) {
            try {
                Graphics var14 = Statics.field60.getGraphics();
                for (int var15 = 0; var15 < field478; var15++) {
                    if (field481[var15]) {
                        Statics.field2138.method1498(var14, field483[var15], field484[var15], field485[var15], field486[var15]);
                        field481[var15] = false;
                    }
                }
            } catch (Exception var21) {
                Statics.field60.repaint();
            }
        } else if (field546 > 0) {
            try {
                Graphics var17 = Statics.field60.getGraphics();
                Statics.field2138.method1479(var17, 0, 0);
                for (int var18 = 0; var18 < field478; var18++) {
                    field481[var18] = false;
                }
            } catch (Exception var20) {
                Statics.field60.repaint();
            }
        }
    }

    @ObfuscatedName("client.w(B)V")
    public final void method249() {
        if (Statics.field777.method225()) {
            Statics.field777.method211();
        }
        if (Statics.field674 != null) {
            Statics.field674.field197 = false;
        }
        Statics.field674 = null;
        if (Statics.field269 != null) {
            Statics.field269.method2816();
            Statics.field269 = null;
        }
        if (class137.field2117 != null) {
            class137 var1 = class137.field2117;
            synchronized (class137.field2117) {
                class137.field2117 = null;
            }
        }
        class140.method2035();
        Statics.field873 = null;
        if (Statics.field771 != null) {
            Statics.field771.method1142();
        }
        if (Statics.field875 != null) {
            Statics.field875.method1142();
        }
        if (Statics.field2726 != null) {
            Statics.field2726.method2816();
        }
        class170.method3019();
        class149.method913();
    }

    @ObfuscatedName("x.h(II)V")
    public static void method633(int arg0) {
        if (field546 == arg0) {
            return;
        }
        if (field546 == 0) {
            Statics.field2015 = null;
            Statics.field1953 = null;
            Statics.field2255 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field311 = 0;
            field424 = 0;
            field313 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field698 != null) {
            Statics.field698.method2816();
            Statics.field698 = null;
        }
        if (field546 == 25) {
            field397 = 0;
            field279 = 0;
            field473 = 1;
            field354 = 0;
            field515 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class32.method602(Statics.field60, Statics.field1578, Statics.field1147, true, 0);
        } else if (arg0 == 20) {
            class32.method602(Statics.field60, Statics.field1578, Statics.field1147, true, field546 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class32.method602(Statics.field60, Statics.field1578, Statics.field1147, false, 4);
        } else {
            class32.method1033();
        }
        field546 = arg0;
    }

    @ObfuscatedName("client.d(B)V")
    public void method250() {
        if (field546 == 1000) {
            return;
        }
        long var1 = class115.method102();
        int var3 = (int) (var1 - Statics.field2648);
        Statics.field2648 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class171.field2723 += var3;
        boolean var4;
        if (class171.field2732 == 0 && class171.field2722 == 0 && class171.field2741 == 0 && class171.field2734 == 0) {
            var4 = true;
        } else if (Statics.field2726 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class171.field2723 > 30000) {
                        throw new IOException();
                    }
                    while (class171.field2722 < 20 && class171.field2734 > 0) {
                        class172 var5 = (class172) class171.field2724.method3548();
                        class119 var6 = new class119(4);
                        var6.method2322(1);
                        var6.method2423((int) var5.field3113);
                        Statics.field2726.method2820(var6.field1977, 0, 4);
                        class171.field2727.method3544(var5, var5.field3113);
                        class171.field2734--;
                        class171.field2722++;
                    }
                    while (class171.field2732 < 20 && class171.field2741 > 0) {
                        class172 var7 = (class172) class171.field2728.method3628();
                        class119 var8 = new class119(4);
                        var8.method2322(0);
                        var8.method2423((int) var7.field3113);
                        Statics.field2726.method2820(var8.field1977, 0, 4);
                        var7.method3645();
                        class171.field2731.method3544(var7, var7.field3113);
                        class171.field2741--;
                        class171.field2732++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2726.method2818();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class171.field2723 = 0;
                        byte var11 = 0;
                        if (Statics.field694 == null) {
                            var11 = 8;
                        } else if (class171.field2733 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class171.field2730.field1974;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2726.method2819(class171.field2730.field1977, class171.field2730.field1974, var12);
                            if (class171.field2738 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class171.field2730.field1977[class171.field2730.field1974 + var13] ^= class171.field2738;
                                }
                            }
                            class171.field2730.field1974 += var12;
                            if (class171.field2730.field1974 < var11) {
                                break;
                            }
                            if (Statics.field694 == null) {
                                class171.field2730.field1974 = 0;
                                int var14 = class171.field2730.method2427();
                                int var15 = class171.field2730.method2339();
                                int var16 = class171.field2730.method2427();
                                int var17 = class171.field2730.method2342();
                                long var18 = (long) ((var14 << 16) + var15);
                                class172 var20 = (class172) class171.field2727.method3545(var18);
                                Statics.field2735 = true;
                                if (var20 == null) {
                                    var20 = (class172) class171.field2731.method3545(var18);
                                    Statics.field2735 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field694 = var20;
                                Statics.field772 = new class119(var17 + var21 + Statics.field694.field2745);
                                Statics.field772.method2322(var16);
                                Statics.field772.method2327(var17);
                                class171.field2733 = 8;
                                class171.field2730.field1974 = 0;
                            } else if (class171.field2733 == 0) {
                                if (class171.field2730.field1977[0] == -1) {
                                    class171.field2733 = 1;
                                    class171.field2730.field1974 = 0;
                                } else {
                                    Statics.field694 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field772.field1977.length - Statics.field694.field2745;
                            int var23 = 512 - class171.field2733;
                            if (var23 > var22 - Statics.field772.field1974) {
                                var23 = var22 - Statics.field772.field1974;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2726.method2819(Statics.field772.field1977, Statics.field772.field1974, var23);
                            if (class171.field2738 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field772.field1977[Statics.field772.field1974 + var24] ^= class171.field2738;
                                }
                            }
                            Statics.field772.field1974 += var23;
                            class171.field2733 += var23;
                            if (Statics.field772.field1974 == var22) {
                                if (Statics.field694.field3113 == 16711935L) {
                                    Statics.field181 = Statics.field772;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class168 var26 = class171.field2737[var25];
                                        if (var26 != null) {
                                            Statics.field181.field1974 = var25 * 8 + 5;
                                            int var27 = Statics.field181.method2342();
                                            int var28 = Statics.field181.method2342();
                                            var26.method3159(var27, var28);
                                        }
                                    }
                                } else {
                                    class171.field2736.reset();
                                    class171.field2736.update(Statics.field772.field1977, 0, var22);
                                    int var29 = (int) class171.field2736.getValue();
                                    if (Statics.field694.field2743 != var29) {
                                        try {
                                            Statics.field2726.method2816();
                                        } catch (Exception var35) {
                                        }
                                        class171.field2739++;
                                        Statics.field2726 = null;
                                        class171.field2738 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class171.field2739 = 0;
                                    class171.field2740 = 0;
                                    Statics.field694.field2746.method3136((int) (Statics.field694.field3113 & 0xFFFFL), Statics.field772.field1977, (Statics.field694.field3113 & 0xFF0000L) == 16711680L, Statics.field2735);
                                }
                                Statics.field694.method3670();
                                if (Statics.field2735) {
                                    class171.field2722--;
                                } else {
                                    class171.field2732--;
                                }
                                class171.field2733 = 0;
                                Statics.field694 = null;
                                Statics.field772 = null;
                            } else {
                                if (class171.field2733 != 512) {
                                    break;
                                }
                                class171.field2733 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2726.method2816();
                } catch (Exception var34) {
                }
                class171.field2740++;
                Statics.field2726 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method251();
        }
    }

    @ObfuscatedName("client.l(B)V")
    public void method251() {
        if (class171.field2739 >= 4) {
            this.method2888("js5crc");
            field546 = 1000;
            return;
        }
        if (class171.field2740 >= 4) {
            if (field546 <= 5) {
                this.method2888("js5io");
                field546 = 1000;
                return;
            }
            field308 = 3000;
            class171.field2740 = 3;
        }
        if (--field308 + 1 > 0) {
            return;
        }
        try {
            if (field307 == 0) {
                Statics.field2223 = Statics.field2024.method2709(Statics.field902, Statics.field122);
                field307++;
            }
            if (field307 == 1) {
                if (Statics.field2223.field2208 == 2) {
                    this.method252(-1);
                    return;
                }
                if (Statics.field2223.field2208 == 1) {
                    field307++;
                }
            }
            if (field307 == 2) {
                Statics.field1609 = new class143((Socket) Statics.field2223.field2215, Statics.field2024);
                class119 var1 = new class119(5);
                var1.method2322(15);
                var1.method2327(104);
                Statics.field1609.method2820(var1.field1977, 0, 5);
                field307++;
                Statics.field3136 = class115.method102();
            }
            if (field307 == 3) {
                if (field546 <= 5 || Statics.field1609.method2818() > 0) {
                    int var2 = Statics.field1609.method2817();
                    if (var2 != 0) {
                        this.method252(var2);
                        return;
                    }
                    field307++;
                } else if (class115.method102() - Statics.field3136 > 30000L) {
                    this.method252(-2);
                    return;
                }
            }
            if (field307 == 4) {
                class171.method3247(Statics.field1609, field546 > 20);
                Statics.field2223 = null;
                Statics.field1609 = null;
                field307 = 0;
                field386 = 0;
            }
        } catch (IOException var4) {
            this.method252(-3);
        }
    }

    @ObfuscatedName("client.n(II)V")
    public void method252(int arg0) {
        Statics.field2223 = null;
        Statics.field1609 = null;
        field307 = 0;
        if (Statics.field1667 == Statics.field122) {
            Statics.field122 = Statics.field119;
        } else {
            Statics.field122 = Statics.field1667;
        }
        field386++;
        if (field386 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field546 <= 5) {
                this.method2888("js5connect_full");
                field546 = 1000;
            } else {
                field308 = 3000;
            }
        } else if (field386 >= 2 && arg0 == 6) {
            this.method2888("js5connect_outofdate");
            field546 = 1000;
        } else if (field386 >= 4) {
            if (field546 <= 5) {
                this.method2888("js5connect");
                field546 = 1000;
            } else {
                field308 = 3000;
            }
        }
    }

    @ObfuscatedName("gk.q(B)V")
    public static void method3482() {
        if (field351 == 0) {
            Statics.field3044 = new class86(4, 104, 104, class6.field79);
            for (int var0 = 0; var0 < 4; var0++) {
                field512[var0] = new class108(104, 104);
            }
            Statics.field274 = new class79(512, 512);
            class32.field743 = class157.field2357;
            class32.field725 = 5;
            field351 = 20;
        } else if (field351 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class91.field1570[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class86.method1853(var1, 500, 800, 512, 334);
            class32.field743 = class157.field2320;
            class32.field725 = 10;
            field351 = 30;
        } else if (field351 == 30) {
            Statics.field1994 = method39(0, false, true, true);
            Statics.field368 = method39(1, false, true, true);
            Statics.field267 = method39(2, true, false, true);
            Statics.field1879 = method39(3, false, true, true);
            Statics.field151 = method39(4, false, true, true);
            Statics.field3117 = method39(5, true, true, true);
            Statics.field2277 = method39(6, true, true, false);
            Statics.field18 = method39(7, false, true, true);
            Statics.field1147 = method39(8, false, true, true);
            Statics.field2016 = method39(9, false, true, true);
            Statics.field1578 = method39(10, false, true, true);
            Statics.field1206 = method39(11, false, true, true);
            Statics.field2022 = method39(12, false, true, true);
            Statics.field2634 = method39(13, true, false, true);
            Statics.field2987 = method39(14, false, true, false);
            Statics.field3048 = method39(15, false, true, true);
            class32.field743 = class157.field2477;
            class32.field725 = 20;
            field351 = 40;
        } else if (field351 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1994.method3134() * 4 / 100;
            int var8 = var7 + Statics.field368.method3134() * 4 / 100;
            int var9 = var8 + Statics.field267.method3134() * 2 / 100;
            int var10 = var9 + Statics.field1879.method3134() * 2 / 100;
            int var11 = var10 + Statics.field151.method3134() * 6 / 100;
            int var12 = var11 + Statics.field3117.method3134() * 4 / 100;
            int var13 = var12 + Statics.field2277.method3134() * 2 / 100;
            int var14 = var13 + Statics.field18.method3134() * 60 / 100;
            int var15 = var14 + Statics.field1147.method3134() * 2 / 100;
            int var16 = var15 + Statics.field2016.method3134() * 2 / 100;
            int var17 = var16 + Statics.field1578.method3134() * 2 / 100;
            int var18 = var17 + Statics.field1206.method3134() * 2 / 100;
            int var19 = var18 + Statics.field2022.method3134() * 2 / 100;
            int var20 = var19 + Statics.field2634.method3134() * 2 / 100;
            int var21 = var20 + Statics.field2987.method3134() * 2 / 100;
            int var22 = var21 + Statics.field3048.method3134() * 2 / 100;
            if (var22 == 100) {
                class32.field743 = class157.field2474;
                class32.field725 = 30;
                field351 = 45;
            } else {
                if (var22 != 0) {
                    class32.field743 = class157.field2322 + var22 + "%";
                }
                class32.field725 = 30;
            }
        } else if (field351 == 45) {
            class57.method3483(22050, !field283, 2);
            class184 var23 = new class184();
            var23.method3420(9, 128);
            Statics.field771 = class57.method894(Statics.field2024, Statics.field60, 0, 22050);
            Statics.field771.method1130(var23);
            class168 var24 = Statics.field3048;
            class168 var25 = Statics.field2987;
            class168 var26 = Statics.field151;
            Statics.field2956 = var24;
            Statics.field2954 = var25;
            Statics.field2950 = var26;
            Statics.field128 = var23;
            Statics.field875 = class57.method894(Statics.field2024, Statics.field60, 1, 2048);
            Statics.field2168 = new class56();
            Statics.field875.method1130(Statics.field2168);
            Statics.field1013 = new class75(22050, Statics.field2641);
            class32.field743 = class157.field2324;
            class32.field725 = 35;
            field351 = 50;
        } else if (field351 == 50) {
            int var27 = 0;
            if (Statics.field1659 == null) {
                class168 var28 = Statics.field1147;
                class168 var29 = Statics.field2634;
                int var30 = var28.method3072("p11_full");
                int var31 = var28.method3073(var30, "");
                class224 var32;
                if (class77.method2420(var28, var30, var31)) {
                    var32 = class77.method2705(var29.method3057(var30, var31));
                } else {
                    var32 = null;
                }
                Statics.field1659 = var32;
            } else {
                var27++;
            }
            if (Statics.field1034 == null) {
                class168 var34 = Statics.field1147;
                class168 var35 = Statics.field2634;
                int var36 = var34.method3072("p12_full");
                int var37 = var34.method3073(var36, "");
                class224 var38;
                if (class77.method2420(var34, var36, var37)) {
                    var38 = class77.method2705(var35.method3057(var36, var37));
                } else {
                    var38 = null;
                }
                Statics.field1034 = var38;
            } else {
                var27++;
            }
            if (Statics.field580 == null) {
                class168 var40 = Statics.field1147;
                class168 var41 = Statics.field2634;
                int var42 = var40.method3072("b12_full");
                int var43 = var40.method3073(var42, "");
                class224 var44;
                if (class77.method2420(var40, var42, var43)) {
                    var44 = class77.method2705(var41.method3057(var42, var43));
                } else {
                    var44 = null;
                }
                Statics.field580 = var44;
            } else {
                var27++;
            }
            if (var27 < 3) {
                class32.field743 = class157.field2325 + var27 * 100 / 3 + "%";
                class32.field725 = 40;
            } else {
                Statics.field138 = new class160(true);
                class32.field743 = class157.field2326;
                class32.field725 = 40;
                field351 = 60;
            }
        } else if (field351 == 60) {
            class168 var46 = Statics.field1578;
            class168 var47 = Statics.field1147;
            int var48 = 0;
            if (var46.method3075("title.jpg", "")) {
                var48++;
            }
            if (var47.method3075("logo", "")) {
                var48++;
            }
            if (var47.method3075("logo_deadman_mode", "")) {
                var48++;
            }
            if (var47.method3075("titlebox", "")) {
                var48++;
            }
            if (var47.method3075("titlebutton", "")) {
                var48++;
            }
            if (var47.method3075("runes", "")) {
                var48++;
            }
            if (var47.method3075("title_mute", "")) {
                var48++;
            }
            if (var47.method3076("options_radio_buttons,0")) {
                var48++;
            }
            if (var47.method3076("options_radio_buttons,2")) {
                var48++;
            }
            var47.method3075("sl_back", "");
            var47.method3075("sl_flags", "");
            var47.method3075("sl_arrows", "");
            var47.method3075("sl_stars", "");
            var47.method3075("sl_button", "");
            byte var51 = 9;
            if (var48 < var51) {
                class32.field743 = class157.field2327 + var48 * 100 / var51 + "%";
                class32.field725 = 50;
            } else {
                class32.field743 = class157.field2328;
                class32.field725 = 50;
                method633(5);
                field351 = 70;
            }
        } else if (field351 == 70) {
            if (Statics.field267.method3098()) {
                class168 var53 = Statics.field267;
                Statics.field576 = var53;
                class42.method46(Statics.field267);
                class168 var54 = Statics.field267;
                class168 var55 = Statics.field18;
                Statics.field1036 = var54;
                Statics.field1023 = var55;
                Statics.field1958 = Statics.field1036.method3067(3);
                class41.method2986(Statics.field267, Statics.field18, field283);
                class40.method171(Statics.field267, Statics.field18);
                class52.method567(Statics.field267, Statics.field18, field282, Statics.field1659);
                class43.method716(Statics.field267, Statics.field1994, Statics.field368);
                class168 var56 = Statics.field267;
                class168 var57 = Statics.field18;
                Statics.field1018 = var56;
                Statics.field2910 = var57;
                class48.method155(Statics.field267);
                class168 var58 = Statics.field267;
                Statics.field1155 = var58;
                Statics.field1148 = Statics.field1155.method3067(16);
                class173.method1931(Statics.field1879, Statics.field18, Statics.field1147, Statics.field2634);
                class51.method3020(Statics.field267);
                class168 var59 = Statics.field267;
                Statics.field1080 = var59;
                class168 var60 = Statics.field267;
                Statics.field1038 = var60;
                class50.method2113(Statics.field267);
                Statics.field777 = new class20();
                class32.field743 = class157.field2528;
                class32.field725 = 60;
                field351 = 80;
            } else {
                class32.field743 = class157.field2329 + Statics.field267.method3160() + "%";
                class32.field725 = 60;
            }
        } else if (field351 == 80) {
            int var61 = 0;
            if (Statics.field2645 == null) {
                Statics.field2645 = class77.method2655(Statics.field1147, "compass", "");
            } else {
                var61++;
            }
            if (Statics.field221 == null) {
                Statics.field221 = class77.method2655(Statics.field1147, "mapedge", "");
            } else {
                var61++;
            }
            if (Statics.field152 == null) {
                Statics.field152 = class77.method604(Statics.field1147, "mapscene", "");
            } else {
                var61++;
            }
            if (Statics.field1363 == null) {
                Statics.field1363 = class77.method350(Statics.field1147, "mapfunction", "");
            } else {
                var61++;
            }
            if (Statics.field1346 == null) {
                Statics.field1346 = class77.method350(Statics.field1147, "hitmarks", "");
            } else {
                var61++;
            }
            if (Statics.field93 == null) {
                Statics.field93 = class77.method350(Statics.field1147, "headicons_pk", "");
            } else {
                var61++;
            }
            if (Statics.field2083 == null) {
                Statics.field2083 = class77.method350(Statics.field1147, "headicons_prayer", "");
            } else {
                var61++;
            }
            if (Statics.field2137 == null) {
                Statics.field2137 = class77.method350(Statics.field1147, "headicons_hint", "");
            } else {
                var61++;
            }
            if (Statics.field1607 == null) {
                Statics.field1607 = class77.method350(Statics.field1147, "mapmarker", "");
            } else {
                var61++;
            }
            if (Statics.field2704 == null) {
                Statics.field2704 = class77.method350(Statics.field1147, "cross", "");
            } else {
                var61++;
            }
            if (Statics.field1348 == null) {
                Statics.field1348 = class77.method350(Statics.field1147, "mapdots", "");
            } else {
                var61++;
            }
            if (Statics.field2053 == null) {
                Statics.field2053 = class77.method604(Statics.field1147, "scrollbar", "");
            } else {
                var61++;
            }
            if (Statics.field596 == null) {
                Statics.field596 = class77.method604(Statics.field1147, "mod_icons", "");
            } else {
                var61++;
            }
            if (var61 < 13) {
                class32.field743 = class157.field2527 + var61 * 100 / 13 + "%";
                class32.field725 = 70;
            } else {
                Statics.field3179 = Statics.field596;
                Statics.field221.method1559();
                int var62 = (int) (Math.random() * 21.0D) - 10;
                int var63 = (int) (Math.random() * 21.0D) - 10;
                int var64 = (int) (Math.random() * 21.0D) - 10;
                int var65 = (int) (Math.random() * 41.0D) - 20;
                for (int var66 = 0; var66 < Statics.field1363.length; var66++) {
                    Statics.field1363[var66].method1633(var62 + var65, var63 + var65, var64 + var65);
                }
                Statics.field152[0].method1713(var62 + var65, var63 + var65, var64 + var65);
                class32.field743 = class157.field2420;
                class32.field725 = 70;
                field351 = 90;
            }
        } else if (field351 == 90) {
            if (Statics.field2016.method3098()) {
                class95 var67 = new class95(Statics.field2016, Statics.field1147, 20, 0.8D, field283 ? 64 : 128);
                class91.method1944(var67);
                class91.method1943(0.8D);
                class32.field743 = class157.field2363;
                class32.field725 = 90;
                field351 = 110;
            } else {
                class32.field743 = class157.field2333 + Statics.field2016.method3160() + "%";
                class32.field725 = 90;
            }
        } else if (field351 == 110) {
            Statics.field674 = new class14();
            Statics.field2024.method2710(Statics.field674, 10);
            class32.field743 = class157.field2401;
            class32.field725 = 94;
            field351 = 120;
        } else if (field351 == 120) {
            if (Statics.field1578.method3075("huffman", "")) {
                class113 var68 = new class113(Statics.field1578.method3074("huffman", ""));
                class222.method2278(var68);
                class32.field743 = class157.field2337;
                class32.field725 = 96;
                field351 = 130;
            } else {
                class32.field743 = class157.field2336 + "%";
                class32.field725 = 96;
            }
        } else if (field351 == 130) {
            if (!Statics.field1879.method3098()) {
                class32.field743 = class157.field2338 + Statics.field1879.method3160() * 4 / 5 + "%";
                class32.field725 = 100;
            } else if (!Statics.field2022.method3098()) {
                class32.field743 = class157.field2338 + (80 + Statics.field2022.method3160() / 6) + "%";
                class32.field725 = 100;
            } else if (Statics.field2634.method3098()) {
                class32.field743 = class157.field2339;
                class32.field725 = 100;
                field351 = 140;
            } else {
                class32.field743 = class157.field2338 + (96 + Statics.field2634.method3160() / 20) + "%";
                class32.field725 = 100;
            }
        } else if (field351 == 140) {
            method633(10);
        }
    }

    @ObfuscatedName("u.f(IZZZI)Lfr;")
    public static class168 method39(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class134 var4 = null;
        if (class149.field2236 != null) {
            var4 = new class134(arg0, class149.field2236, Statics.field3148[arg0], 1000000);
        }
        return new class168(var4, Statics.field779, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("fw.v(S)V")
    public static final void method2961() {
        try {
            if (field311 == 0) {
                if (Statics.field269 != null) {
                    Statics.field269.method2816();
                    Statics.field269 = null;
                }
                Statics.field693 = null;
                field331 = false;
                field424 = 0;
                field311 = 1;
            }
            if (field311 == 1) {
                if (Statics.field693 == null) {
                    Statics.field693 = Statics.field2024.method2709(Statics.field902, Statics.field122);
                }
                if (Statics.field693.field2208 == 2) {
                    throw new IOException();
                }
                if (Statics.field693.field2208 == 1) {
                    Statics.field269 = new class143((Socket) Statics.field693.field2215, Statics.field2024);
                    Statics.field693 = null;
                    field311 = 2;
                }
            }
            if (field311 == 2) {
                field312.field1974 = 0;
                field312.method2322(14);
                Statics.field269.method2820(field312.field1977, 0, 1);
                field407.field1974 = 0;
                field311 = 3;
            }
            if (field311 == 3) {
                if (Statics.field771 != null) {
                    Statics.field771.method1132();
                }
                if (Statics.field875 != null) {
                    Statics.field875.method1132();
                }
                int var0 = Statics.field269.method2817();
                if (Statics.field771 != null) {
                    Statics.field771.method1132();
                }
                if (Statics.field875 != null) {
                    Statics.field875.method1132();
                }
                if (var0 != 0) {
                    method584(var0);
                    return;
                }
                field407.field1974 = 0;
                field311 = 5;
            }
            if (field311 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field312.field1974 = 0;
                field312.method2322(1);
                field312.method2322(class32.field744.method562());
                field312.method2327(var1[0]);
                field312.method2327(var1[1]);
                field312.method2327(var1[2]);
                field312.method2327(var1[3]);
                switch(class32.field744.field2594) {
                    case 0:
                    case 1:
                        field312.method2423(Statics.field1959);
                        field312.field1974 += 5;
                        break;
                    case 2:
                        field312.method2327((Integer) Statics.field2908.field136.get(class163.method2943(class32.field731)));
                        field312.field1974 += 4;
                        break;
                    case 3:
                        field312.field1974 += 8;
                }
                field312.method2328(class32.field732);
                field312.method2498(class5.field69, class5.field75);
                field321.field1974 = 0;
                if (field546 == 40) {
                    field321.method2322(18);
                } else {
                    field321.method2322(16);
                }
                field321.method2481(0);
                int var2 = field321.field1974;
                field321.method2327(104);
                field321.method2331(field312.field1977, 0, field312.field1974);
                int var3 = field321.field1974;
                field321.method2328(class32.field731);
                field321.method2322((field510 ? 1 : 0) << 1 | (field283 ? 1 : 0));
                field321.method2481(Statics.field1146);
                field321.method2481(Statics.field590);
                class122 var4 = field321;
                byte[] var5 = new byte[24];
                try {
                    class149.field2237.method3887(0L);
                    class149.field2237.method3908(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var29) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2331(var5, 0, 24);
                field321.method2328(Statics.field285);
                field321.method2327(Statics.field808);
                class119 var9 = new class119(Statics.field138.method2962());
                Statics.field138.method2963(var9);
                field321.method2331(var9.field1977, 0, var9.field1977.length);
                field321.method2322(Statics.field125);
                field321.method2327(Statics.field1994.field2687);
                field321.method2327(Statics.field368.field2687);
                field321.method2327(Statics.field267.field2687);
                field321.method2327(Statics.field1879.field2687);
                field321.method2327(Statics.field151.field2687);
                field321.method2327(Statics.field3117.field2687);
                field321.method2327(Statics.field2277.field2687);
                field321.method2327(Statics.field18.field2687);
                field321.method2327(Statics.field1147.field2687);
                field321.method2327(Statics.field2016.field2687);
                field321.method2327(Statics.field1578.field2687);
                field321.method2327(Statics.field1206.field2687);
                field321.method2327(Statics.field2022.field2687);
                field321.method2327(Statics.field2634.field2687);
                field321.method2327(Statics.field2987.field2687);
                field321.method2327(Statics.field3048.field2687);
                field321.method2510(var1, var3, field321.field1974);
                field321.method2432(field321.field1974 - var2);
                Statics.field269.method2820(field321.field1977, 0, field321.field1974);
                field312.method2594(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field407.method2594(var1);
                field311 = 6;
            }
            if (field311 == 6 && Statics.field269.method2818() > 0) {
                int var11 = Statics.field269.method2817();
                if (var11 == 21 && field546 == 20) {
                    field311 = 7;
                } else if (var11 == 2) {
                    field311 = 9;
                } else if (var11 == 15 && field546 == 40) {
                    field323 = -1;
                    field311 = 13;
                } else if (var11 == 23 && field313 < 1) {
                    field313++;
                    field311 = 0;
                } else if (var11 == 29) {
                    field311 = 11;
                } else {
                    method584(var11);
                    return;
                }
            }
            if (field311 == 7 && Statics.field269.method2818() > 0) {
                field322 = (Statics.field269.method2817() + 3) * 60;
                field311 = 8;
            }
            if (field311 == 8) {
                field424 = 0;
                class32.method2807(class157.field2343, class157.field2353, field322 / 60 + class157.field2355);
                if (--field322 <= 0) {
                    field311 = 0;
                }
            } else {
                if (field311 == 9 && Statics.field269.method2818() >= 13) {
                    boolean var12 = Statics.field269.method2817() == 1;
                    Statics.field269.method2819(field407.field1977, 0, 4);
                    field407.field1974 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field407.method2604() << 24;
                        int var15 = var14 | field407.method2604() << 16;
                        int var16 = var15 | field407.method2604() << 8;
                        int var17 = var16 | field407.method2604();
                        int var18 = class163.method2943(class32.field731);
                        if (Statics.field2908.field136.size() >= 10 && !Statics.field2908.field136.containsKey(var18)) {
                            Iterator var19 = Statics.field2908.field136.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field2908.field136.put(var18, var17);
                        class9.method96();
                    }
                    field442 = Statics.field269.method2817();
                    field444 = Statics.field269.method2817() == 1;
                    field398 = Statics.field269.method2817();
                    field398 <<= 0x8;
                    field398 += Statics.field269.method2817();
                    field399 = Statics.field269.method2817();
                    Statics.field269.method2819(field407.field1977, 0, 1);
                    field407.field1974 = 0;
                    field334 = field407.method2604();
                    Statics.field269.method2819(field407.field1977, 0, 2);
                    field407.field1974 = 0;
                    field323 = field407.method2339();
                    if (field399 == 1) {
                        try {
                            Statics.method2680(Statics.field276, "zap");
                        } catch (Throwable var28) {
                        }
                    } else {
                        try {
                            Statics.method2680(Statics.field276, "unzap");
                        } catch (Throwable var27) {
                        }
                    }
                    field311 = 10;
                }
                if (field311 != 10) {
                    if (field311 == 11 && Statics.field269.method2818() >= 2) {
                        field407.field1974 = 0;
                        Statics.field269.method2819(field407.field1977, 0, 2);
                        field407.field1974 = 0;
                        Statics.field2297 = field407.method2339();
                        field311 = 12;
                    }
                    if (field311 == 12 && Statics.field269.method2818() >= Statics.field2297) {
                        field407.field1974 = 0;
                        Statics.field269.method2819(field407.field1977, 0, Statics.field2297);
                        field407.field1974 = 0;
                        String var22 = field407.method2528();
                        String var23 = field407.method2528();
                        String var24 = field407.method2528();
                        class32.method2807(var22, var23, var24);
                        method633(10);
                    }
                    if (field311 == 13) {
                        if (field323 == -1) {
                            if (Statics.field269.method2818() < 2) {
                                return;
                            }
                            Statics.field269.method2819(field407.field1977, 0, 2);
                            field407.field1974 = 0;
                            field323 = field407.method2339();
                        }
                        if (Statics.field269.method2818() >= field323) {
                            Statics.field269.method2819(field407.field1977, 0, field323);
                            field407.field1974 = 0;
                            int var25 = field323;
                            method960();
                            class33.method2020(field407);
                            if (field407.field1974 != var25) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field424++;
                        if (field424 > 2000) {
                            if (field313 < 1) {
                                if (Statics.field1667 == Statics.field122) {
                                    Statics.field122 = Statics.field119;
                                } else {
                                    Statics.field122 = Statics.field1667;
                                }
                                field313++;
                                field311 = 0;
                            } else {
                                method584(-3);
                            }
                        }
                    }
                } else if (Statics.field269.method2818() >= field323) {
                    field407.field1974 = 0;
                    Statics.field269.method2819(field407.field1977, 0, field323);
                    Statics.method1932();
                    class33.method2020(field407);
                    Statics.field240 = -1;
                    method1164(false);
                    field334 = -1;
                }
            }
        } catch (IOException var30) {
            if (field313 < 1) {
                if (Statics.field1667 == Statics.field122) {
                    Statics.field122 = Statics.field119;
                } else {
                    Statics.field122 = Statics.field1667;
                }
                field313++;
                field311 = 0;
            } else {
                method584(-2);
            }
        }
    }

    @ObfuscatedName("aw.k(I)V")
    public static void method960() {
        field312.field1974 = 0;
        field407.field1974 = 0;
        field334 = -1;
        field327 = -1;
        field328 = -1;
        field329 = -1;
        field323 = 0;
        field325 = 0;
        field295 = 0;
        field416 = 0;
        field415 = false;
        field366 = 0;
        field314 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field337[var0] = null;
        }
        Statics.field159 = null;
        for (int var1 = 0; var1 < field315.length; var1++) {
            class35 var2 = field315[var1];
            if (var2 != null) {
                var2.field836 = -1;
                var2.field837 = false;
            }
        }
        class16.method2032();
        method633(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field450[var3] = true;
        }
        method44();
    }

    @ObfuscatedName("m.r(II)V")
    public static void method584(int arg0) {
        if (arg0 == -3) {
            class32.method2807(class157.field2309, class157.field2433, class157.field2341);
        } else if (arg0 == -2) {
            class32.method2807(class157.field2456, class157.field2544, class157.field2351);
        } else if (arg0 == -1) {
            class32.method2807(class157.field2352, class157.field2394, class157.field2354);
        } else if (arg0 == 3) {
            class32.method2807(class157.field2493, class157.field2356, class157.field2350);
        } else if (arg0 == 4) {
            class32.method2807(class157.field2358, class157.field2359, class157.field2390);
        } else if (arg0 == 5) {
            class32.method2807(class157.field2361, class157.field2522, class157.field2342);
        } else if (arg0 == 6) {
            class32.method2807(class157.field2364, class157.field2365, class157.field2366);
        } else if (arg0 == 7) {
            class32.method2807(class157.field2367, class157.field2344, class157.field2369);
        } else if (arg0 == 8) {
            class32.method2807(class157.field2370, class157.field2553, class157.field2372);
        } else if (arg0 == 9) {
            class32.method2807(class157.field2402, class157.field2389, class157.field2375);
        } else if (arg0 == 10) {
            class32.method2807(class157.field2376, class157.field2377, class157.field2378);
        } else if (arg0 == 11) {
            class32.method2807(class157.field2332, class157.field2380, class157.field2552);
        } else if (arg0 == 12) {
            class32.method2807(class157.field2382, class157.field2383, class157.field2384);
        } else if (arg0 == 13) {
            class32.method2807(class157.field2549, class157.field2386, class157.field2387);
        } else if (arg0 == 14) {
            class32.method2807(class157.field2388, class157.field2348, class157.field2557);
        } else if (arg0 == 16) {
            class32.method2807(class157.field2391, class157.field2371, class157.field2393);
        } else if (arg0 == 17) {
            class32.method2807(class157.field2521, class157.field2392, class157.field2396);
        } else if (arg0 == 18) {
            class32.method2807(class157.field2397, class157.field2398, class157.field2399);
        } else if (arg0 == 19) {
            class32.method2807(class157.field2400, class157.field2405, class157.field2374);
        } else if (arg0 == 20) {
            class32.method2807(class157.field2515, class157.field2404, class157.field2536);
        } else if (arg0 == 22) {
            class32.method2807(class157.field2412, class157.field2407, class157.field2408);
        } else if (arg0 == 23) {
            class32.method2807(class157.field2409, class157.field2410, class157.field2411);
        } else if (arg0 == 24) {
            class32.method2807(class157.field2335, class157.field2413, class157.field2414);
        } else if (arg0 == 25) {
            class32.method2807(class157.field2415, class157.field2416, class157.field2417);
        } else if (arg0 == 26) {
            class32.method2807(class157.field2418, class157.field2385, class157.field2406);
        } else if (arg0 == 27) {
            class32.method2807(class157.field2403, class157.field2422, class157.field2423);
        } else if (arg0 == 31) {
            class32.method2807(class157.field2430, class157.field2431, class157.field2432);
        } else if (arg0 == 32) {
            class32.method2807(class157.field2379, class157.field2434, class157.field2435);
        } else if (arg0 == 37) {
            class32.method2807(class157.field2436, class157.field2437, class157.field2438);
        } else if (arg0 == 38) {
            class32.method2807(class157.field2439, class157.field2514, class157.field2441);
        } else if (arg0 == 55) {
            class32.method2807(class157.field2442, class157.field2443, class157.field2444);
        } else if (arg0 == 56) {
            class32.method2807(class157.field2323, class157.field2564, class157.field2447);
            method633(11);
            return;
        } else if (arg0 == 57) {
            class32.method2807(class157.field2448, class157.field2449, class157.field2450);
            method633(11);
            return;
        } else {
            class32.method2807(class157.field2313, class157.field2331, class157.field2453);
        }
        method633(10);
    }

    @ObfuscatedName("dh.i(I)V")
    public static final void method2636() {
        if (Statics.field269 != null) {
            Statics.field269.method2816();
            Statics.field269 = null;
        }
        method2036();
        Statics.field3044.method1755();
        for (int var0 = 0; var0 < 4; var0++) {
            field512[var0].method2219();
        }
        System.gc();
        class183.method1(2);
        field362 = -1;
        field514 = false;
        class24.method169();
        method633(10);
    }

    @ObfuscatedName("cd.j(I)V")
    public static final void method2036() {
        class47.field1054.method3522();
        class42.field971.method3522();
        class45.method1934();
        class41.field921.method3522();
        class41.field925.method3522();
        class41.field923.method3522();
        class41.field968.method3522();
        class40.method750();
        class52.field1100.method3522();
        class52.field1101.method3522();
        class52.field1130.method3522();
        class43.field982.method3522();
        class43.field980.method3522();
        class44.field1001.method3522();
        class44.field1002.method3522();
        class48.method2616();
        class53.field1150.method3522();
        class179.field2914.method3522();
        class173.field2751.method3522();
        class173.field2752.method3522();
        class173.field2845.method3522();
        class173.field2839.method3522();
        ((class95) Statics.field1567).method2023();
        class23.field587.method3522();
        Statics.field1994.method3070();
        Statics.field368.method3070();
        Statics.field1879.method3070();
        Statics.field151.method3070();
        Statics.field3117.method3070();
        Statics.field2277.method3070();
        Statics.field18.method3070();
        Statics.field1147.method3070();
        Statics.field2016.method3070();
        Statics.field1578.method3070();
        Statics.field1206.method3070();
        Statics.field2022.method3070();
    }

    @ObfuscatedName("t.z(I)V")
    public static final void method104() {
        if (field330 > 0) {
            method2636();
        } else {
            method633(40);
            Statics.field698 = Statics.field269;
            Statics.field269 = null;
        }
    }

    @ObfuscatedName("g.m(I)V")
    public static final void method592() {
        if (Statics.field875 != null) {
            Statics.field875.method1131();
        }
        if (Statics.field771 != null) {
            Statics.field771.method1131();
        }
    }

    @ObfuscatedName("k.g(Lac;IIII)V")
    public static void method195(class43 arg0, int arg1, int arg2, int arg3) {
        if (field289 >= 50 || field516 == 0 || arg0.field995 == null || arg1 >= arg0.field995.length) {
            return;
        }
        int var4 = arg0.field995[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field518[field289] = var5;
        field519[field289] = var6;
        field414[field289] = 0;
        field522[field289] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field521[field289] = (var8 << 16) + (var9 << 8) + var7;
        field289++;
    }

    @ObfuscatedName("ab.c(IIIB)V")
    public static void method752(int arg0, int arg1, int arg2) {
        if (field306 == 0 || arg1 == 0 || field289 >= 50) {
            return;
        }
        field518[field289] = arg0;
        field519[field289] = arg1;
        field414[field289] = arg2;
        field522[field289] = null;
        field521[field289] = 0;
        field289++;
    }

    @ObfuscatedName("t.x(II)V")
    public static void method99(int arg0) {
        if (arg0 == -1 && !field514) {
            class183.method2250();
        } else if (arg0 != -1 && field362 != arg0 && field302 != 0 && !field514) {
            class168 var1 = Statics.field2277;
            int var2 = field302;
            class183.field2951 = 1;
            Statics.field2952 = var1;
            Statics.field2953 = arg0;
            Statics.field2654 = 0;
            Statics.field673 = var2;
            Statics.field2957 = false;
            Statics.field2955 = 2;
        }
        field362 = arg0;
    }

    @ObfuscatedName("n.ap(Lfa;IIB)V")
    public static final void method160(class173 arg0, int arg1, int arg2) {
        if (field366 != 0 && field366 != 3 || class140.field2150 != 1 && Statics.field977 || class140.field2150 != 4) {
            return;
        }
        class175 var3 = arg0.method3188(true);
        if (var3 == null) {
            return;
        }
        int var4 = class140.field2151 - arg1;
        int var5 = class140.field2154 - arg2;
        if (!var3.method3235(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2900 / 2;
        int var7 = var5 - var3.field2898 / 2;
        int var8 = field361 + field348 & 0x7FF;
        int var9 = class91.field1570[var8];
        int var10 = class91.field1571[var8];
        int var11 = (field350 + 256) * var9 >> 8;
        int var12 = (field350 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field159.field845 + var13 >> 7;
        int var16 = Statics.field159.field812 - var14 >> 7;
        field312.method2612(221);
        field312.method2322(18);
        field312.method2369(Statics.field253 + var15);
        field312.method2369(Statics.field2902 + var16);
        field312.method2322(class137.field2124[82] ? (class137.field2124[81] ? 2 : 1) : 0);
        field312.method2322(var6);
        field312.method2322(var7);
        field312.method2481(field361);
        field312.method2322(57);
        field312.method2322(field348);
        field312.method2322(field350);
        field312.method2322(89);
        field312.method2481(Statics.field159.field845);
        field312.method2481(Statics.field159.field812);
        field312.method2322(63);
        field314 = var15;
        field384 = var16;
    }

    @ObfuscatedName("fp.aa(B)V")
    public static final void method3243() {
        int[] var0 = class33.field750;
        for (int var1 = 0; var1 < class33.field754; var1++) {
            class3 var2 = field337[var0[var1]];
            if (var2 != null && var2.field824 > 0) {
                var2.field824--;
                if (var2.field824 == 0) {
                    var2.field829 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field339; var3++) {
            int var4 = field530[var3];
            class35 var5 = field315[var4];
            if (var5 != null && var5.field824 > 0) {
                var5.field824--;
                if (var5.field824 == 0) {
                    var5.field829 = null;
                }
            }
        }
    }

    @ObfuscatedName("ao.ay(B)V")
    public static final void method714() {
        int var0 = Statics.field524 * 128 + 64;
        int var1 = Statics.field1207 * 128 + 64;
        int var2 = method43(var0, var1, Statics.field575) - Statics.field702;
        if (Statics.field931 < var0) {
            Statics.field931 += Statics.field1981 * (var0 - Statics.field931) / 1000 + Statics.field1534;
            if (Statics.field931 > var0) {
                Statics.field931 = var0;
            }
        }
        if (Statics.field931 > var0) {
            Statics.field931 -= Statics.field1981 * (Statics.field931 - var0) / 1000 + Statics.field1534;
            if (Statics.field931 < var0) {
                Statics.field931 = var0;
            }
        }
        if (Statics.field11 < var2) {
            Statics.field11 += Statics.field1981 * (var2 - Statics.field11) / 1000 + Statics.field1534;
            if (Statics.field11 > var2) {
                Statics.field11 = var2;
            }
        }
        if (Statics.field11 > var2) {
            Statics.field11 -= Statics.field1981 * (Statics.field11 - var2) / 1000 + Statics.field1534;
            if (Statics.field11 < var2) {
                Statics.field11 = var2;
            }
        }
        if (Statics.field142 < var1) {
            Statics.field142 += Statics.field1981 * (var1 - Statics.field142) / 1000 + Statics.field1534;
            if (Statics.field142 > var1) {
                Statics.field142 = var1;
            }
        }
        if (Statics.field142 > var1) {
            Statics.field142 -= Statics.field1981 * (Statics.field142 - var1) / 1000 + Statics.field1534;
            if (Statics.field142 < var1) {
                Statics.field142 = var1;
            }
        }
        int var3 = Statics.field765 * 128 + 64;
        int var4 = Statics.field1081 * 128 + 64;
        int var5 = method43(var3, var4, Statics.field575) - Statics.field2702;
        int var6 = var3 - Statics.field931;
        int var7 = var5 - Statics.field11;
        int var8 = var4 - Statics.field142;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field577 < var10) {
            Statics.field577 += Statics.field166 * (var10 - Statics.field577) / 1000 + Statics.field1746;
            if (Statics.field577 > var10) {
                Statics.field577 = var10;
            }
        }
        if (Statics.field577 > var10) {
            Statics.field577 -= Statics.field166 * (Statics.field577 - var10) / 1000 + Statics.field1746;
            if (Statics.field577 < var10) {
                Statics.field577 = var10;
            }
        }
        int var12 = var11 - Statics.field61;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field61 += Statics.field166 * var12 / 1000 + Statics.field1746;
            Statics.field61 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field61 -= Statics.field166 * -var12 / 1000 + Statics.field1746;
            Statics.field61 &= 0x7FF;
        }
        int var13 = var11 - Statics.field61;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field61 = var11;
        }
    }

    @ObfuscatedName("a.ak(I)V")
    public static final void method188() {
        int var0 = field341 + Statics.field159.field845;
        int var1 = field343 + Statics.field159.field812;
        if (Statics.field24 - var0 < -500 || Statics.field24 - var0 > 500 || Statics.field1437 - var1 < -500 || Statics.field1437 - var1 > 500) {
            Statics.field24 = var0;
            Statics.field1437 = var1;
        }
        if (Statics.field24 != var0) {
            Statics.field24 += (var0 - Statics.field24) / 16;
        }
        if (Statics.field1437 != var1) {
            Statics.field1437 += (var1 - Statics.field1437) / 16;
        }
        if (class140.field2141 == 4 && Statics.field977) {
            int var2 = class140.field2145 - field365;
            field363 = var2 * 2;
            field365 = var2 == -1 || var2 == 1 ? class140.field2145 : (field365 + class140.field2145) / 2;
            int var3 = field511 - class140.field2144;
            field401 = var3 * 2;
            field511 = var3 == -1 || var3 == 1 ? class140.field2144 : (field511 + class140.field2144) / 2;
        } else {
            if (class137.field2124[96]) {
                field401 += (-24 - field401) / 2;
            } else if (class137.field2124[97]) {
                field401 += (24 - field401) / 2;
            } else {
                field401 /= 2;
            }
            if (class137.field2124[98]) {
                field363 += (12 - field363) / 2;
            } else if (class137.field2124[99]) {
                field363 += (-12 - field363) / 2;
            } else {
                field363 /= 2;
            }
            field365 = class140.field2145;
            field511 = class140.field2144;
        }
        field361 = field401 / 2 + field361 & 0x7FF;
        field360 += field363 / 2;
        if (field360 < 128) {
            field360 = 128;
        }
        if (field360 > 383) {
            field360 = 383;
        }
        int var4 = Statics.field24 >> 7;
        int var5 = Statics.field1437 >> 7;
        int var6 = method43(Statics.field24, Statics.field1437, Statics.field575);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field575;
                    if (var10 < 3 && (class6.field78[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field79[var10][var8][var9];
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
        if (var12 > field425) {
            field425 += (var12 - field425) / 24;
        } else if (var12 < field425) {
            field425 += (var12 - field425) / 80;
        }
    }

    @ObfuscatedName("r.an(B)V")
    public static final void method204() {
        for (int var0 = 0; var0 < field339; var0++) {
            int var1 = field530[var0];
            class35 var2 = field315[var1];
            if (var2 != null) {
                method1509(var2, var2.field778.field895);
            }
        }
    }

    @ObfuscatedName("bs.af(Lax;II)V")
    public static final void method1509(class38 arg0, int arg1) {
        if (arg0.field815 > field288) {
            method7(arg0);
        } else if (arg0.field857 >= field288) {
            if (field288 == arg0.field857 || arg0.field842 == -1 || arg0.field853 != 0 || arg0.field844 + 1 > class43.method774(arg0.field842).field986[arg0.field843]) {
                int var2 = arg0.field857 - arg0.field815;
                int var3 = field288 - arg0.field815;
                int var4 = arg0.field861 * 128 + arg0.field850 * 64;
                int var5 = arg0.field854 * 128 + arg0.field850 * 64;
                int var6 = arg0.field850 * 64 + arg0.field817 * 128;
                int var7 = arg0.field850 * 64 + arg0.field831 * 128;
                arg0.field845 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field812 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field832 = 0;
            arg0.field849 = arg0.field858;
            arg0.field813 = arg0.field849;
        } else {
            method1930(arg0);
        }
        if (arg0.field845 < 128 || arg0.field812 < 128 || arg0.field845 >= 13184 || arg0.field812 >= 13184) {
            arg0.field842 = -1;
            arg0.field847 = -1;
            arg0.field815 = 0;
            arg0.field857 = 0;
            arg0.field845 = arg0.field865[0] * 128 + arg0.field850 * 64;
            arg0.field812 = arg0.field827[0] * 128 + arg0.field850 * 64;
            arg0.method737();
        }
        if (Statics.field159 == arg0 && (arg0.field845 < 1536 || arg0.field812 < 1536 || arg0.field845 >= 11776 || arg0.field812 >= 11776)) {
            arg0.field842 = -1;
            arg0.field847 = -1;
            arg0.field815 = 0;
            arg0.field857 = 0;
            arg0.field845 = arg0.field865[0] * 128 + arg0.field850 * 64;
            arg0.field812 = arg0.field827[0] * 128 + arg0.field850 * 64;
            arg0.method737();
        }
        Statics.method1004(arg0);
        method748(arg0);
    }

    @ObfuscatedName("e.ao(Lax;B)V")
    public static final void method7(class38 arg0) {
        int var1 = arg0.field815 - field288;
        int var2 = arg0.field861 * 128 + arg0.field850 * 64;
        int var3 = arg0.field854 * 128 + arg0.field850 * 64;
        arg0.field845 += (var2 - arg0.field845) / var1;
        arg0.field812 += (var3 - arg0.field812) / var1;
        arg0.field832 = 0;
        arg0.field849 = arg0.field858;
    }

    @ObfuscatedName("ch.as(Lax;I)V")
    public static final void method1930(class38 arg0) {
        arg0.field816 = arg0.field826;
        if (arg0.field864 == 0) {
            arg0.field832 = 0;
            return;
        }
        if (arg0.field842 != -1 && arg0.field853 == 0) {
            class43 var1 = class43.method774(arg0.field842);
            if (arg0.field869 > 0 && var1.field983 == 0) {
                arg0.field832++;
                return;
            }
            if (arg0.field869 <= 0 && var1.field996 == 0) {
                arg0.field832++;
                return;
            }
        }
        int var2 = arg0.field845;
        int var3 = arg0.field812;
        int var4 = arg0.field865[arg0.field864 - 1] * 128 + arg0.field850 * 64;
        int var5 = arg0.field827[arg0.field864 - 1] * 128 + arg0.field850 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field849 = 1280;
            } else if (var3 > var5) {
                arg0.field849 = 1792;
            } else {
                arg0.field849 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field849 = 768;
            } else if (var3 > var5) {
                arg0.field849 = 256;
            } else {
                arg0.field849 = 512;
            }
        } else if (var3 < var5) {
            arg0.field849 = 1024;
        } else if (var3 > var5) {
            arg0.field849 = 0;
        }
        byte var6 = arg0.field848[arg0.field864 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field845 = var4;
            arg0.field812 = var5;
            arg0.field864--;
            if (arg0.field869 > 0) {
                arg0.field869--;
            }
            return;
        }
        int var7 = arg0.field849 - arg0.field813 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field820;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field825;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field822;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field821;
        }
        if (var8 == -1) {
            var8 = arg0.field825;
        }
        arg0.field816 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class35) {
            var10 = ((class35) arg0).field778.field911;
        }
        if (var10) {
            if (arg0.field849 != arg0.field813 && arg0.field836 == -1 && arg0.field863 != 0) {
                var9 = 2;
            }
            if (arg0.field864 > 2) {
                var9 = 6;
            }
            if (arg0.field864 > 3) {
                var9 = 8;
            }
            if (arg0.field832 > 0 && arg0.field864 > 1) {
                var9 = 8;
                arg0.field832--;
            }
        } else {
            if (arg0.field864 > 1) {
                var9 = 6;
            }
            if (arg0.field864 > 2) {
                var9 = 8;
            }
            if (arg0.field832 > 0 && arg0.field864 > 1) {
                var9 = 8;
                arg0.field832--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field825 == arg0.field816 && arg0.field823 != -1) {
            arg0.field816 = arg0.field823;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field845 += var9;
                if (arg0.field845 > var4) {
                    arg0.field845 = var4;
                }
            } else if (var2 > var4) {
                arg0.field845 -= var9;
                if (arg0.field845 < var4) {
                    arg0.field845 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field812 += var9;
                if (arg0.field812 > var5) {
                    arg0.field812 = var5;
                }
            } else if (var3 > var5) {
                arg0.field812 -= var9;
                if (arg0.field812 < var5) {
                    arg0.field812 = var5;
                }
            }
        }
        if (arg0.field845 == var4 && arg0.field812 == var5) {
            arg0.field864--;
            if (arg0.field869 > 0) {
                arg0.field869--;
            }
        }
    }

    @ObfuscatedName("aj.ae(Lax;B)V")
    public static final void method748(class38 arg0) {
        arg0.field814 = false;
        if (arg0.field816 != -1) {
            class43 var1 = class43.method774(arg0.field816);
            if (var1 == null || var1.field984 == null) {
                arg0.field816 = -1;
            } else {
                arg0.field841++;
                if (arg0.field840 < var1.field984.length && arg0.field841 > var1.field986[arg0.field840]) {
                    arg0.field841 = 1;
                    arg0.field840++;
                    method195(var1, arg0.field840, arg0.field845, arg0.field812);
                }
                if (arg0.field840 >= var1.field984.length) {
                    arg0.field841 = 0;
                    arg0.field840 = 0;
                    method195(var1, arg0.field840, arg0.field845, arg0.field812);
                }
            }
        }
        if (arg0.field847 != -1 && field288 >= arg0.field855) {
            if (arg0.field867 < 0) {
                arg0.field867 = 0;
            }
            int var2 = class44.method3260(arg0.field847).field1004;
            if (var2 == -1) {
                arg0.field847 = -1;
            } else {
                class43 var3 = class43.method774(var2);
                if (var3 == null || var3.field984 == null) {
                    arg0.field847 = -1;
                } else {
                    arg0.field860++;
                    if (arg0.field867 < var3.field984.length && arg0.field860 > var3.field986[arg0.field867]) {
                        arg0.field860 = 1;
                        arg0.field867++;
                        method195(var3, arg0.field867, arg0.field845, arg0.field812);
                    }
                    if (arg0.field867 >= var3.field984.length && (arg0.field867 < 0 || arg0.field867 >= var3.field984.length)) {
                        arg0.field847 = -1;
                    }
                }
            }
        }
        if (arg0.field842 != -1 && arg0.field853 <= 1) {
            class43 var4 = class43.method774(arg0.field842);
            if (var4.field983 == 1 && arg0.field869 > 0 && arg0.field815 <= field288 && arg0.field857 < field288) {
                arg0.field853 = 1;
                return;
            }
        }
        if (arg0.field842 != -1 && arg0.field853 == 0) {
            class43 var5 = class43.method774(arg0.field842);
            if (var5 == null || var5.field984 == null) {
                arg0.field842 = -1;
            } else {
                arg0.field844++;
                if (arg0.field843 < var5.field984.length && arg0.field844 > var5.field986[arg0.field843]) {
                    arg0.field844 = 1;
                    arg0.field843++;
                    method195(var5, arg0.field843, arg0.field845, arg0.field812);
                }
                if (arg0.field843 >= var5.field984.length) {
                    arg0.field843 -= var5.field992;
                    arg0.field846++;
                    if (arg0.field846 >= var5.field994) {
                        arg0.field842 = -1;
                    } else if (arg0.field843 >= 0 && arg0.field843 < var5.field984.length) {
                        method195(var5, arg0.field843, arg0.field845, arg0.field812);
                    } else {
                        arg0.field842 = -1;
                    }
                }
                arg0.field814 = var5.field990;
            }
        }
        if (arg0.field853 > 0) {
            arg0.field853--;
        }
    }

    @ObfuscatedName("u.ax(Lu;III)V")
    public static void method40(class3 arg0, int arg1, int arg2) {
        if (arg0.field842 == arg1 && arg1 != -1) {
            int var3 = class43.method774(arg1).field997;
            if (var3 == 1) {
                arg0.field843 = 0;
                arg0.field844 = 0;
                arg0.field853 = arg2;
                arg0.field846 = 0;
            }
            if (var3 == 2) {
                arg0.field846 = 0;
            }
        } else if (arg1 == -1 || arg0.field842 == -1 || class43.method774(arg1).field991 >= class43.method774(arg0.field842).field991) {
            arg0.field842 = arg1;
            arg0.field843 = 0;
            arg0.field844 = 0;
            arg0.field853 = arg2;
            arg0.field846 = 0;
            arg0.field869 = arg0.field864;
        }
    }

    @ObfuscatedName("bs.aj(I)I")
    public static int method1503() {
        return field510 ? 2 : 1;
    }

    @ObfuscatedName("x.ab(II)V")
    public static void method640(int arg0) {
        field488 = 0L;
        if (arg0 >= 2) {
            field510 = true;
        } else {
            field510 = false;
        }
        method6();
        if (field546 >= 25) {
            method44();
        }
        field2188 = true;
    }

    @ObfuscatedName("b.av(S)V")
    public static void method44() {
        field312.method2612(100);
        field312.method2322(method1503());
        field312.method2481(Statics.field1146);
        field312.method2481(Statics.field590);
    }

    @ObfuscatedName("e.aq(B)V")
    public static void method6() {
        client var0 = Statics.field276;
        synchronized (Statics.field276) {
            Container var1 = Statics.field276.method2848();
            if (var1 != null) {
                Statics.field3049 = Math.max(var1.getSize().width, Statics.field1546);
                Statics.field626 = Math.max(var1.getSize().height, Statics.field1943);
                if (Statics.field2747 == var1) {
                    Insets var2 = Statics.field2747.getInsets();
                    Statics.field3049 -= var2.right + var2.left;
                    Statics.field626 -= var2.top + var2.bottom;
                }
                if (Statics.field3049 <= 0) {
                    Statics.field3049 = 1;
                }
                if (Statics.field626 <= 0) {
                    Statics.field626 = 1;
                }
                if (method1503() == 1) {
                    Statics.field1146 = field402;
                    Statics.field590 = field491 * 503;
                } else {
                    Statics.field1146 = Math.min(Statics.field3049, 7680);
                    Statics.field590 = Math.min(Statics.field626, 2160);
                }
                field2203 = (Statics.field3049 - Statics.field1146) / 2;
                field2198 = 0;
                Statics.field60.setSize(Statics.field1146, Statics.field590);
                int var3 = Statics.field1146;
                int var4 = Statics.field590;
                Canvas var5 = Statics.field60;
                class78 var7;
                try {
                    class82 var6 = new class82();
                    var6.method1500(var3, var4, var5);
                    var7 = var6;
                } catch (Throwable var23) {
                    class76 var9 = new class76();
                    var9.method1500(var3, var4, var5);
                    var7 = var9;
                }
                Statics.field2138 = var7;
                if (Statics.field2747 == var1) {
                    Insets var10 = Statics.field2747.getInsets();
                    Statics.field60.setLocation(field2203 + var10.left, field2198 + var10.top);
                } else {
                    Statics.field60.setLocation(field2203, field2198);
                }
                int var11 = Statics.field1146;
                int var12 = Statics.field590;
                if (Statics.field3049 < var11) {
                    int var13 = Statics.field3049;
                }
                if (Statics.field626 < var12) {
                    int var14 = Statics.field626;
                }
                if (Statics.field2908 != null) {
                    try {
                        client var15 = Statics.field276;
                        int var16 = field510 ? 2 : 1;
                        class132.method2682(var15, "resize", new Object[] { var16 });
                    } catch (Throwable var22) {
                    }
                }
                if (field379 != -1) {
                    int var18 = field379;
                    int var19 = Statics.field1146;
                    int var20 = Statics.field590;
                    if (Statics.method2271(var18)) {
                        method3242(Statics.field2754[var18], -1, var19, var20, true);
                    }
                }
                method240();
            }
        }
    }

    @ObfuscatedName("i.ac(I)V")
    public static void method240() {
        int var0 = field2203;
        int var1 = field2198;
        int var2 = Statics.field3049 - Statics.field1146 - var0;
        int var3 = Statics.field626 - Statics.field590 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field276.method2848();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field2747 == var4) {
                Insets var7 = Statics.field2747.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field626);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field3049, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field3049 + var5 - var2, var6, var2, Statics.field626);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field626 + var6 - var3, Statics.field3049, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("b.ar(I)V")
    public static final void method45() {
        if (field379 != -1) {
            int var0 = field379;
            if (Statics.method2271(var0)) {
                method2954(Statics.field2754[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field478; var1++) {
            if (field450[var1]) {
                field481[var1] = true;
            }
            field482[var1] = field450[var1];
            field450[var1] = false;
        }
        field479 = field288;
        field423 = -1;
        field541 = -1;
        Statics.field2296 = null;
        if (field379 != -1) {
            field478 = 0;
            method672(field379, 0, 0, Statics.field1146, Statics.field590, 0, 0, -1);
        }
        class80.method1647();
        if (field415) {
            method2764();
        } else if (field423 != -1) {
            int var2 = field423;
            int var3 = field541;
            if (field416 >= 2 || field458 != 0 || field430) {
                String var4;
                if (field458 == 1 && field416 < 2) {
                    var4 = class157.field2457 + class157.field2467 + field338 + " " + class2.field25;
                } else if (field430 && field416 < 2) {
                    var4 = field433 + class157.field2467 + field434 + " " + class2.field25;
                } else {
                    int var5 = field416 - 1;
                    String var6;
                    if (field332[var5].length() > 0) {
                        var6 = field421[var5] + class157.field2467 + field332[var5];
                    } else {
                        var6 = field421[var5];
                    }
                    var4 = var6;
                }
                if (field416 > 2) {
                    var4 = var4 + Statics.method2947(16777215) + " " + '/' + " " + (field416 - 2) + class157.field2461;
                }
                Statics.field580.method3778(var4, var2 + 4, var3 + 15, 16777215, 0, field288 / 1000);
            }
        }
        if (field447 == 3) {
            for (int var7 = 0; var7 < field478; var7++) {
                if (field482[var7]) {
                    class80.method1653(field483[var7], field484[var7], field485[var7], field486[var7], 16711935, 128);
                } else if (field481[var7]) {
                    class80.method1653(field483[var7], field484[var7], field485[var7], field486[var7], 16711680, 128);
                }
            }
        }
        class24.method199(Statics.field575, Statics.field159.field845, Statics.field159.field812, field353);
        field353 = 0;
    }

    @ObfuscatedName("cq.az(Ljava/lang/String;ZB)V")
    public static final void method1938(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1034.method3823(arg0, 250);
        int var6 = Statics.field1034.method3769(arg0, 250) * 13;
        class80.method1697(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1656(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1034.method3774(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method841(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method200(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field60.getGraphics();
            Statics.field2138.method1479(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field60.repaint();
        }
    }

    @ObfuscatedName("k.ad(IIIII)V")
    public static final void method192(int arg0, int arg1, int arg2, int arg3) {
        field428++;
        method1199(class34.field768);
        boolean var4 = false;
        if (field303 >= 0) {
            int var5 = class33.field754;
            int[] var6 = class33.field750;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field303 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method1199(class34.field762);
        }
        method1744(true);
        method1199(var4 ? class34.field764 : class34.field763);
        method1744(false);
        method41();
        method125();
        method50(arg0, arg1, arg2, arg3, true);
        int var8 = field538;
        int var9 = field539;
        int var10 = field513;
        int var11 = field489;
        class80.method1645(var8, var9, var8 + var10, var9 + var11);
        class91.method1940();
        if (!field406) {
            int var12 = field360;
            if (field425 / 256 > var12) {
                var12 = field425 / 256;
            }
            if (field525[4] && field527[4] + 128 > var12) {
                var12 = field527[4] + 128;
            }
            int var13 = field361 + field345 & 0x7FF;
            method165(Statics.field24, method43(Statics.field159.field845, Statics.field159.field812, Statics.field575) - field320, Statics.field1437, var12, var13, var12 * 3 + 600);
        }
        int var14;
        if (field406) {
            int var15;
            if (Statics.field2908.field133) {
                var15 = Statics.field575;
            } else {
                int var16 = method43(Statics.field931, Statics.field142, Statics.field575);
                if (var16 - Statics.field11 >= 800 || (class6.field78[Statics.field575][Statics.field931 >> 7][Statics.field142 >> 7] & 0x4) == 0) {
                    var15 = 3;
                } else {
                    var15 = Statics.field575;
                }
            }
            var14 = var15;
        } else {
            var14 = method582();
        }
        int var17 = Statics.field931;
        int var18 = Statics.field11;
        int var19 = Statics.field142;
        int var20 = Statics.field577;
        int var21 = Statics.field61;
        for (int var22 = 0; var22 < 5; var22++) {
            if (field525[var22]) {
                int var23 = (int) (Math.random() * (double) (field374[var22] * 2 + 1) - (double) field374[var22] + Math.sin((double) field528[var22] / 100.0D * (double) field529[var22]) * (double) field527[var22]);
                if (var22 == 0) {
                    Statics.field931 += var23;
                }
                if (var22 == 1) {
                    Statics.field11 += var23;
                }
                if (var22 == 2) {
                    Statics.field142 += var23;
                }
                if (var22 == 3) {
                    Statics.field61 = Statics.field61 + var23 & 0x7FF;
                }
                if (var22 == 4) {
                    Statics.field577 += var23;
                    if (Statics.field577 < 128) {
                        Statics.field577 = 128;
                    }
                    if (Statics.field577 > 383) {
                        Statics.field577 = 383;
                    }
                }
            }
        }
        int var24 = class140.field2144;
        int var25 = class140.field2145;
        if (class140.field2150 != 0) {
            var24 = class140.field2151;
            var25 = class140.field2154;
        }
        if (var24 >= var8 && var24 < var8 + var10 && var25 >= var9 && var25 < var9 + var11) {
            class105.field1781 = true;
            class105.field1837 = 0;
            class105.field1815 = var24 - var8;
            class105.field1836 = var25 - var9;
        } else {
            class105.field1781 = false;
            class105.field1837 = 0;
        }
        method592();
        class80.method1697(var8, var9, var10, var11, 0);
        method592();
        int var26 = class91.field1556;
        class91.field1556 = field542;
        Statics.field3044.method1793(Statics.field931, Statics.field11, Statics.field142, Statics.field577, Statics.field61, var14);
        class91.field1556 = var26;
        method592();
        Statics.field3044.method1844();
        method749(var8, var9, var10, var11);
        method47(var8, var9);
        ((class95) Statics.field1567).method2026(field353);
        if (field381 == 1) {
            Statics.field2704[field534 / 100].method1553(field480 - 8, field385 - 8);
        }
        if (field381 == 2) {
            Statics.field2704[field534 / 100 + 4].method1553(field480 - 8, field385 - 8);
        }
        method3306();
        Statics.field931 = var17;
        Statics.field11 = var18;
        Statics.field142 = var19;
        Statics.field577 = var20;
        Statics.field61 = var21;
        if (field287 && class171.method666(true, false) == 0) {
            field287 = false;
        }
        if (field287) {
            class80.method1697(var8, var9, var10, var11, 0);
            method1938(class157.field2316, false);
        }
    }

    @ObfuscatedName("p.au(IIIIZB)V")
    public static final void method50(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field531 - field278) * var5 / 100 + field278;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field536) {
            short var8 = field536;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field448) {
                var6 = field448;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1647();
                    class80.method1697(arg0, arg1, var10, arg3, -16777216);
                    class80.method1697(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field537) {
            short var11 = field537;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field470) {
                var6 = field470;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1647();
                    class80.method1697(arg0, arg1, arg2, var13, -16777216);
                    class80.method1697(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field346 - field532) * var5 / 100 + field532;
        field542 = arg3 * var6 * var14 / 85504 << 1;
        if (field513 != arg2 || field489 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class91.field1570[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class86.method1853(var15, 500, 800, arg2, arg3);
        }
        field538 = arg0;
        field539 = arg1;
        field513 = arg2;
        field489 = arg3;
    }

    @ObfuscatedName("bc.aw(Lao;B)V")
    public static final void method1199(class34 arg0) {
        if (Statics.field159.field845 >> 7 == field314 && Statics.field159.field812 >> 7 == field384) {
            field314 = 0;
        }
        int var1 = class33.field754;
        int[] var2 = class33.field750;
        int var3 = var1;
        if (class34.field768 == arg0 || class34.field762 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field768 == arg0) {
                var5 = Statics.field159;
                var6 = Statics.field159.field35 << 14;
            } else if (class34.field762 == arg0) {
                var5 = field337[field303];
                var6 = field303 << 14;
            } else {
                var5 = field337[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field764 == arg0 && field303 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method18() && !var5.field53) {
                var5.field51 = false;
                if ((field283 && var1 > 50 || var1 > 200) && class34.field768 != arg0 && var5.field826 == var5.field816) {
                    var5.field51 = true;
                }
                int var7 = var5.field845 >> 7;
                int var8 = var5.field812 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field48 == null || field288 < var5.field41 || field288 >= var5.field42) {
                        if ((var5.field845 & 0x7F) == 64 && (var5.field812 & 0x7F) == 64) {
                            if (field428 == field333[var7][var8]) {
                                continue;
                            }
                            field333[var7][var8] = field428;
                        }
                        var5.field62 = method43(var5.field845, var5.field812, Statics.field575);
                        Statics.field3044.method1766(Statics.field575, var5.field845, var5.field812, var5.field62, 60, var5, var5.field813, var6, var5.field814);
                    } else {
                        var5.field51 = false;
                        var5.field62 = method43(var5.field845, var5.field812, Statics.field575);
                        Statics.field3044.method1898(Statics.field575, var5.field845, var5.field812, var5.field62, 60, var5, var5.field813, var6, var5.field47, var5.field40, var5.field45, var5.field50);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cs.ag(ZI)V")
    public static final void method1744(boolean arg0) {
        for (int var1 = 0; var1 < field339; var1++) {
            class35 var2 = field315[field530[var1]];
            int var3 = (field530[var1] << 14) + 536870912;
            if (var2 != null && var2.method18() && var2.field778.field878 == arg0 && var2.field778.method759()) {
                int var4 = var2.field845 >> 7;
                int var5 = var2.field812 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field850 == 1 && (var2.field845 & 0x7F) == 64 && (var2.field812 & 0x7F) == 64) {
                        if (field428 == field333[var4][var5]) {
                            continue;
                        }
                        field333[var4][var5] = field428;
                    }
                    if (!var2.field778.field883) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field3044.method1766(Statics.field575, var2.field845, var2.field812, method43(var2.field845 + (var2.field850 * 64 - 64), var2.field812 + (var2.field850 * 64 - 64), Statics.field575), var2.field850 * 64 - 64 + 60, var2, var2.field813, var3, var2.field814);
                }
            }
        }
    }

    @ObfuscatedName("u.al(I)V")
    public static final void method41() {
        for (class7 var0 = (class7) field409.method3581(); var0 != null; var0 = (class7) field409.method3583()) {
            if (Statics.field575 != var0.field112 || field288 > var0.field114) {
                var0.method3670();
            } else if (field288 >= var0.field115) {
                if (var0.field95 > 0) {
                    class35 var1 = field315[var0.field95 - 1];
                    if (var1 != null && var1.field845 >= 0 && var1.field845 < 13312 && var1.field812 >= 0 && var1.field812 < 13312) {
                        var0.method92(var1.field845, var1.field812, method43(var1.field845, var1.field812, var0.field112) - var0.field99, field288);
                    }
                }
                if (var0.field95 < 0) {
                    int var2 = -var0.field95 - 1;
                    class3 var3;
                    if (field398 == var2) {
                        var3 = Statics.field159;
                    } else {
                        var3 = field337[var2];
                    }
                    if (var3 != null && var3.field845 >= 0 && var3.field845 < 13312 && var3.field812 >= 0 && var3.field812 < 13312) {
                        var0.method92(var3.field845, var3.field812, method43(var3.field845, var3.field812, var0.field112) - var0.field99, field288);
                    }
                }
                var0.method97(field353);
                Statics.field3044.method1766(Statics.field575, (int) var0.field106, (int) var0.field109, (int) var0.field108, 60, var0, var0.field94, -1, false);
            }
        }
    }

    @ObfuscatedName("h.ai(I)V")
    public static final void method125() {
        for (class30 var0 = (class30) field558.method3581(); var0 != null; var0 = (class30) field558.method3583()) {
            if (Statics.field575 != var0.field691 || var0.field692) {
                var0.method3670();
            } else if (field288 >= var0.field686) {
                var0.method669(field353);
                if (var0.field692) {
                    var0.method3670();
                } else {
                    Statics.field3044.method1766(var0.field691, var0.field690, var0.field687, var0.field685, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("m.at(I)I")
    public static final int method582() {
        if (Statics.field2908.field133) {
            return Statics.field575;
        }
        int var0 = 3;
        if (Statics.field577 < 310) {
            int var1 = Statics.field931 >> 7;
            int var2 = Statics.field142 >> 7;
            int var3 = Statics.field159.field845 >> 7;
            int var4 = Statics.field159.field812 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field575;
            }
            if ((class6.field78[Statics.field575][var1][var2] & 0x4) != 0) {
                var0 = Statics.field575;
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
                    if ((class6.field78[Statics.field575][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field575;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field78[Statics.field575][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field575;
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
                    if ((class6.field78[Statics.field575][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field575;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field78[Statics.field575][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field575;
                        }
                    }
                }
            }
        }
        if (Statics.field159.field845 >= 0 && Statics.field159.field812 >= 0 && Statics.field159.field845 < 13312 && Statics.field159.field812 < 13312) {
            if ((class6.field78[Statics.field575][Statics.field159.field845 >> 7][Statics.field159.field812 >> 7] & 0x4) != 0) {
                var0 = Statics.field575;
            }
            return var0;
        } else {
            return Statics.field575;
        }
    }

    @ObfuscatedName("p.bp(III)V")
    public static final void method47(int arg0, int arg1) {
        if (field465 == 2) {
            method1544((field299 - Statics.field253 << 7) + field364, (field300 - Statics.field2902 << 7) + field507, field301 * 2);
            if (field382 > -1 && field288 % 20 < 10) {
                Statics.field2137[0].method1553(field382 + arg0 - 12, field383 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("c.bg(Lax;IIIIII)V")
    public static final void method603(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method18()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field778;
            if (var6.field907 != null) {
                var6 = var6.method758();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class33.field754;
        int[] var8 = class33.field750;
        if (arg1 < var7) {
            int var9 = 30;
            class3 var10 = (class3) arg0;
            if (var10.field53) {
                return;
            }
            if (var10.field56 != -1 || var10.field46 != -1) {
                method189(arg0, arg0.field811 + 15);
                if (field382 > -1) {
                    if (var10.field56 != -1) {
                        Statics.field93[var10.field56].method1553(field382 + arg2 - 12, field383 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field46 != -1) {
                        Statics.field2083[var10.field46].method1553(field382 + arg2 - 12, field383 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field465 == 10 && field298 == var8[arg1]) {
                method189(arg0, arg0.field811 + 15);
                if (field382 > -1) {
                    Statics.field2137[1].method1553(field382 + arg2 - 12, field383 + arg3 - var9);
                }
            }
        } else {
            class40 var11 = ((class35) arg0).field778;
            if (var11.field907 != null) {
                var11 = var11.method758();
            }
            if (var11.field905 >= 0 && var11.field905 < Statics.field2083.length) {
                method189(arg0, arg0.field811 + 15);
                if (field382 > -1) {
                    Statics.field2083[var11.field905].method1553(field382 + arg2 - 12, field383 + arg3 - 30);
                }
            }
            if (field465 == 1 && field297 == field530[arg1 - var7] && field288 % 20 < 10) {
                method189(arg0, arg0.field811 + 15);
                if (field382 > -1) {
                    Statics.field2137[0].method1553(field382 + arg2 - 12, field383 + arg3 - 28);
                }
            }
        }
        if (arg0.field829 != null && (arg1 >= var7 || !arg0.field856 && (field493 == 4 || !arg0.field866 && (field493 == 0 || field493 == 3 || field493 == 1 && method191(((class3) arg0).field58, false))))) {
            method189(arg0, arg0.field811);
            if (field382 > -1 && field290 < field319) {
                field324[field290] = Statics.field580.method3842(arg0.field829) / 2;
                field440[field290] = Statics.field580.field3170;
                field372[field290] = field382;
                field373[field290] = field383;
                field376[field290] = arg0.field828;
                field377[field290] = arg0.field819;
                field462[field290] = arg0.field824;
                field461[field290] = arg0.field829;
                field290++;
            }
        }
        if (arg0.field833 > field288) {
            method189(arg0, arg0.field811 + 15);
            if (field382 > -1) {
                int var12;
                if (arg1 < var7) {
                    var12 = 30;
                } else {
                    class40 var13 = ((class35) arg0).field778;
                    var12 = var13.field913;
                }
                int var14 = arg0.field834 * var12 / arg0.field835;
                if (var14 > var12) {
                    var14 = var12;
                } else if (var14 == 0 && arg0.field834 > 0) {
                    var14 = 1;
                }
                class80.method1697(field382 + arg2 - var12 / 2, field383 + arg3 - 3, var14, 5, 65280);
                class80.method1697(field382 + arg2 - var12 / 2 + var14, field383 + arg3 - 3, var12 - var14, 5, 16711680);
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            if (arg0.field839[var15] > field288) {
                method189(arg0, arg0.field811 / 2);
                if (field382 > -1) {
                    if (var15 == 1) {
                        field383 -= 20;
                    }
                    if (var15 == 2) {
                        field382 -= 15;
                        field383 -= 10;
                    }
                    if (var15 == 3) {
                        field382 += 15;
                        field383 -= 10;
                    }
                    Statics.field1346[arg0.field868[var15]].method1553(field382 + arg2 - 12, field383 + arg3 - 12);
                    Statics.field1659.method3788(Integer.toString(arg0.field830[var15]), field382 + arg2 - 1, field383 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("aj.bw(IIIII)V")
    public static final void method749(int arg0, int arg1, int arg2, int arg3) {
        field290 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class33.field754;
        int[] var7 = class33.field750;
        for (int var8 = 0; var8 < field339 + var6; var8++) {
            class38 var9;
            if (var8 < var6) {
                var9 = field337[var7[var8]];
                if (field303 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field315[field530[var8 - var6]];
            }
            method603(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method603(field337[field303], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field290; var10++) {
            int var11 = field372[var10];
            int var12 = field373[var10];
            int var13 = field324[var10];
            int var14 = field440[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field373[var16] - field440[var16] && var12 - var14 < field373[var16] + 2 && var11 - var13 < field372[var16] + field324[var16] && var11 + var13 > field372[var16] - field324[var16] && field373[var16] - field440[var16] < var12) {
                        var12 = field373[var16] - field440[var16];
                        var15 = true;
                    }
                }
            }
            field382 = field372[var10];
            field383 = field373[var10] = var12;
            String var17 = field461[var10];
            if (field437 == 0) {
                int var18 = 16776960;
                if (field376[var10] < 6) {
                    var18 = field492[field376[var10]];
                }
                if (field376[var10] == 6) {
                    var18 = field428 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field376[var10] == 7) {
                    var18 = field428 % 20 < 10 ? 255 : 65535;
                }
                if (field376[var10] == 8) {
                    var18 = field428 % 20 < 10 ? 45056 : 8454016;
                }
                if (field376[var10] == 9) {
                    int var19 = 150 - field462[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field376[var10] == 10) {
                    int var20 = 150 - field462[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field376[var10] == 11) {
                    int var21 = 150 - field462[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field377[var10] == 0) {
                    Statics.field580.method3788(var17, field382 + arg0, field383 + arg1, var18, 0);
                }
                if (field377[var10] == 1) {
                    Statics.field580.method3775(var17, field382 + arg0, field383 + arg1, var18, 0, field428);
                }
                if (field377[var10] == 2) {
                    Statics.field580.method3776(var17, field382 + arg0, field383 + arg1, var18, 0, field428);
                }
                if (field377[var10] == 3) {
                    Statics.field580.method3806(var17, field382 + arg0, field383 + arg1, var18, 0, field428, 150 - field462[var10]);
                }
                if (field377[var10] == 4) {
                    int var22 = (150 - field462[var10]) * (Statics.field580.method3842(var17) + 100) / 150;
                    class80.method1649(field382 + arg0 - 50, arg1, field382 + arg0 + 50, arg1 + arg3);
                    Statics.field580.method3785(var17, field382 + arg0 + 50 - var22, field383 + arg1, var18, 0);
                    class80.method1645(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field377[var10] == 5) {
                    int var23 = 150 - field462[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class80.method1649(arg0, field383 + arg1 - Statics.field580.field3170 - 1, arg0 + arg2, field383 + arg1 + 5);
                    Statics.field580.method3788(var17, field382 + arg0, field383 + arg1 + var24, var18, 0);
                    class80.method1645(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field580.method3788(var17, field382 + arg0, field383 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("fy.bl(I)V")
    public static final void method3306() {
        field396 = 0;
        int var0 = (Statics.field159.field845 >> 7) + Statics.field253;
        int var1 = (Statics.field159.field812 >> 7) + Statics.field2902;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field396 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field396 = 1;
        }
        if (field396 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field396 = 0;
        }
    }

    @ObfuscatedName("a.bf(Lax;II)V")
    public static final void method189(class38 arg0, int arg1) {
        method1544(arg0.field845, arg0.field812, arg1);
    }

    @ObfuscatedName("bb.be(IIII)V")
    public static final void method1544(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field382 = -1;
            field383 = -1;
            return;
        }
        int var3 = method43(arg0, arg1, Statics.field575) - arg2;
        int var4 = arg0 - Statics.field931;
        int var5 = var3 - Statics.field11;
        int var6 = arg1 - Statics.field142;
        int var7 = class91.field1570[Statics.field577];
        int var8 = class91.field1571[Statics.field577];
        int var9 = class91.field1570[Statics.field61];
        int var10 = class91.field1571[Statics.field61];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field382 = field542 * var11 / var15 + field513 / 2;
            field383 = field542 * var14 / var15 + field489 / 2;
        } else {
            field382 = -1;
            field383 = -1;
        }
    }

    @ObfuscatedName("u.bn(IIII)I")
    public static final int method43(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field78[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field79[var5][var3][var4] + class6.field79[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field79[var5][var3][var4 + 1] + class6.field79[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("q.bc(IIIIIII)V")
    public static final void method165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class91.field1570[var6];
            int var12 = class91.field1571[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class91.field1570[var7];
            int var15 = class91.field1571[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field931 = arg0 - var8;
        Statics.field11 = arg1 - var9;
        Statics.field142 = arg2 - var10;
        Statics.field577 = arg3;
        Statics.field61 = arg4;
    }

    @ObfuscatedName("bf.bd(ZI)V")
    public static final void method1164(boolean arg0) {
        field310 = arg0;
        if (!field310) {
            int var1 = field407.method2371();
            int var2 = field407.method2371();
            int var3 = field407.method2339();
            Statics.field31 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field31[var4][var5] = field407.method2342();
                }
            }
            Statics.field1881 = new int[var3];
            Statics.field2013 = new int[var3];
            Statics.field620 = new int[var3];
            Statics.field1883 = new byte[var3][];
            Statics.field650 = new byte[var3][];
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
                        Statics.field1881[var7] = var10;
                        Statics.field2013[var7] = Statics.field3117.method3072("m" + var8 + "_" + var9);
                        Statics.field620[var7] = Statics.field3117.method3072("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method2809(var2, var1);
            return;
        }
        int var11 = field407.method2371();
        int var12 = field407.method2371();
        int var13 = field407.method2339();
        field407.method2596();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field407.method2607(1);
                    if (var17 == 1) {
                        field387[var14][var15][var16] = field407.method2607(26);
                    } else {
                        field387[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field407.method2598();
        Statics.field31 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field31[var18][var19] = field407.method2342();
            }
        }
        Statics.field1881 = new int[var13];
        Statics.field2013 = new int[var13];
        Statics.field620 = new int[var13];
        Statics.field1883 = new byte[var13][];
        Statics.field650 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field387[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field1881[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field1881[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field2013[var20] = Statics.field3117.method3072("m" + var29 + "_" + var30);
                            Statics.field620[var20] = Statics.field3117.method3072("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method2809(var12, var11);
    }

    @ObfuscatedName("em.bx(III)V")
    public static final void method2809(int arg0, int arg1) {
        if (Statics.field240 == arg0 && Statics.field786 == arg1) {
            return;
        }
        Statics.field240 = arg0;
        Statics.field786 = arg1;
        method633(25);
        method1938(class157.field2316, true);
        int var2 = Statics.field253;
        int var3 = Statics.field2902;
        Statics.field253 = (arg0 - 6) * 8;
        Statics.field2902 = (arg1 - 6) * 8;
        int var4 = Statics.field253 - var2;
        int var5 = Statics.field2902 - var3;
        int var6 = Statics.field253;
        int var7 = Statics.field2902;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field315[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field865[var10] -= var4;
                    var9.field827[var10] -= var5;
                }
                var9.field845 -= var4 * 128;
                var9.field812 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field337[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field865[var13] -= var4;
                    var12.field827[var13] -= var5;
                }
                var12.field845 -= var4 * 128;
                var12.field812 -= var5 * 128;
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
                        field552[var24][var20][var21] = field552[var24][var22][var23];
                    } else {
                        field552[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field408.method3581(); var25 != null; var25 = (class17) field408.method3583()) {
            var25.field219 -= var4;
            var25.field227 -= var5;
            if (var25.field219 < 0 || var25.field227 < 0 || var25.field219 >= 104 || var25.field227 >= 104) {
                var25.method3670();
            }
        }
        if (field314 != 0) {
            field314 -= var4;
            field384 -= var5;
        }
        field289 = 0;
        field406 = false;
        field504 = -1;
        field558.method3575();
        field409.method3575();
        for (int var26 = 0; var26 < 4; var26++) {
            field512[var26].method2219();
        }
    }

    @ObfuscatedName("s.bq(ZI)V")
    public static final void method88(boolean arg0) {
        method592();
        field296++;
        if (field296 < 50 && !arg0) {
            return;
        }
        field296 = 0;
        if (field331 || Statics.field269 == null) {
            return;
        }
        field312.method2612(113);
        try {
            Statics.field269.method2820(field312.field1977, 0, field312.field1974);
            field312.field1974 = 0;
        } catch (IOException var2) {
            field331 = true;
        }
    }

    @ObfuscatedName("cy.bm(IIIIII)V")
    public static final void method2112(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field3044.method1781(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field3044.method1785(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field274.field1398;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method2808(var12);
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
                class81 var14 = Statics.field152[var13.field927];
                if (var14 != null) {
                    int var15 = (var13.field934 * 4 - var14.field1411) / 2;
                    int var16 = (var13.field935 * 4 - var14.field1412) / 2;
                    var14.method1714(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field935) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field3044.method1921(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field3044.method1785(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method2808(var21);
            if (var22.field927 != -1) {
                class81 var23 = Statics.field152[var22.field927];
                if (var23 != null) {
                    int var24 = (var22.field934 * 4 - var23.field1411) / 2;
                    int var25 = (var22.field935 * 4 - var23.field1412) / 2;
                    var23.method1714(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field935) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field274.field1398;
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
        int var29 = Statics.field3044.method1784(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method2808(var30);
        if (var31.field927 == -1) {
            return;
        }
        class81 var32 = Statics.field152[var31.field927];
        if (var32 != null) {
            int var33 = (var31.field934 * 4 - var32.field1411) / 2;
            int var34 = (var31.field935 * 4 - var32.field1412) / 2;
            var32.method1714(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field935) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("e.br(I)V")
    public static final void method8() {
        if (field334 == 103) {
            int var0 = field407.method2427();
            int var1 = (var0 >> 4 & 0x7) + Statics.field26;
            int var2 = (var0 & 0x7) + Statics.field1149;
            int var3 = field407.method2339();
            int var4 = field407.method2427();
            int var5 = var4 >> 4 & 0xF;
            int var6 = var4 & 0x7;
            int var7 = field407.method2427();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                int var8 = var5 + 1;
                if (Statics.field159.field865[0] >= var1 - var8 && Statics.field159.field865[0] <= var1 + var8 && Statics.field159.field827[0] >= var2 - var8 && Statics.field159.field827[0] <= var2 + var8 && field516 != 0 && var6 > 0 && field289 < 50) {
                    field518[field289] = var3;
                    field519[field289] = var6;
                    field414[field289] = var7;
                    field522[field289] = null;
                    field521[field289] = (var1 << 16) + (var2 << 8) + var5;
                    field289++;
                }
            }
        }
        if (field334 == 255) {
            int var9 = field407.method2363();
            int var10 = var9 >> 2;
            int var11 = var9 & 0x3;
            int var12 = field340[var10];
            int var13 = field407.method2365();
            int var14 = (var13 >> 4 & 0x7) + Statics.field26;
            int var15 = (var13 & 0x7) + Statics.field1149;
            int var16 = field407.method2373();
            if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
                method3175(Statics.field575, var14, var15, var12, var16, var10, var11, 0, -1);
            }
        } else if (field334 == 159) {
            int var17 = field407.method2364();
            int var18 = (var17 >> 4 & 0x7) + Statics.field26;
            int var19 = (var17 & 0x7) + Statics.field1149;
            int var20 = field407.method2373();
            int var21 = field407.method2522();
            if (var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104) {
                class29 var22 = new class29();
                var22.field680 = var20;
                var22.field678 = var21;
                if (field552[Statics.field575][var18][var19] == null) {
                    field552[Statics.field575][var18][var19] = new class199();
                }
                field552[Statics.field575][var18][var19].method3589(var22);
                method2021(var18, var19);
            }
        } else if (field334 == 199) {
            int var23 = field407.method2363();
            int var24 = (var23 >> 4 & 0x7) + Statics.field26;
            int var25 = (var23 & 0x7) + Statics.field1149;
            int var26 = field407.method2373();
            if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104) {
                class199 var27 = field552[Statics.field575][var24][var25];
                if (var27 != null) {
                    for (class29 var28 = (class29) var27.method3581(); var28 != null; var28 = (class29) var27.method3583()) {
                        if ((var26 & 0x7FFF) == var28.field680) {
                            var28.method3670();
                            break;
                        }
                    }
                    if (var27.method3581() == null) {
                        field552[Statics.field575][var24][var25] = null;
                    }
                    method2021(var24, var25);
                }
            }
        } else if (field334 == 55) {
            int var29 = field407.method2427();
            int var30 = (var29 >> 4 & 0x7) + Statics.field26;
            int var31 = (var29 & 0x7) + Statics.field1149;
            int var32 = var30 + field407.method2338();
            int var33 = var31 + field407.method2338();
            int var34 = field407.method2340();
            int var35 = field407.method2339();
            int var36 = field407.method2427() * 4;
            int var37 = field407.method2427() * 4;
            int var38 = field407.method2339();
            int var39 = field407.method2339();
            int var40 = field407.method2427();
            int var41 = field407.method2427();
            if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104 && var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104 && var35 != 65535) {
                int var42 = var30 * 128 + 64;
                int var43 = var31 * 128 + 64;
                int var44 = var32 * 128 + 64;
                int var45 = var33 * 128 + 64;
                class7 var46 = new class7(var35, Statics.field575, var42, var43, method43(var42, var43, Statics.field575) - var36, field288 + var38, field288 + var39, var40, var41, var34, var37);
                var46.method92(var44, var45, method43(var44, var45, Statics.field575) - var37, field288 + var38);
                field409.method3589(var46);
            }
        } else if (field334 == 171) {
            int var47 = field407.method2427();
            int var48 = (var47 >> 4 & 0x7) + Statics.field26;
            int var49 = (var47 & 0x7) + Statics.field1149;
            int var50 = field407.method2339();
            int var51 = field407.method2339();
            int var52 = field407.method2339();
            if (var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104) {
                class199 var53 = field552[Statics.field575][var48][var49];
                if (var53 != null) {
                    for (class29 var54 = (class29) var53.method3581(); var54 != null; var54 = (class29) var53.method3583()) {
                        if ((var50 & 0x7FFF) == var54.field680 && var54.field678 == var51) {
                            var54.field678 = var52;
                            break;
                        }
                    }
                    method2021(var48, var49);
                }
            }
        } else if (field334 == 177) {
            int var55 = field407.method2522();
            int var56 = field407.method2363();
            int var57 = (var56 >> 4 & 0x7) + Statics.field26;
            int var58 = (var56 & 0x7) + Statics.field1149;
            int var59 = field407.method2363();
            int var60 = var59 >> 2;
            int var61 = var59 & 0x3;
            int var62 = field340[var60];
            if (var57 >= 0 && var58 >= 0 && var57 < 103 && var58 < 103) {
                if (var62 == 0) {
                    class87 var63 = Statics.field3044.method1777(Statics.field575, var57, var58);
                    if (var63 != null) {
                        int var64 = var63.field1509 >> 14 & 0x7FFF;
                        if (var60 == 2) {
                            var63.field1504 = new class13(var64, 2, var61 + 4, Statics.field575, var57, var58, var55, false, var63.field1504);
                            var63.field1510 = new class13(var64, 2, var61 + 1 & 0x3, Statics.field575, var57, var58, var55, false, var63.field1510);
                        } else {
                            var63.field1504 = new class13(var64, var60, var61, Statics.field575, var57, var58, var55, false, var63.field1504);
                        }
                    }
                }
                if (var62 == 1) {
                    class94 var65 = Statics.field3044.method1778(Statics.field575, var57, var58);
                    if (var65 != null) {
                        int var66 = var65.field1592 >> 14 & 0x7FFF;
                        if (var60 == 4 || var60 == 5) {
                            var65.field1597 = new class13(var66, 4, var61, Statics.field575, var57, var58, var55, false, var65.field1597);
                        } else if (var60 == 6) {
                            var65.field1597 = new class13(var66, 4, var61 + 4, Statics.field575, var57, var58, var55, false, var65.field1597);
                        } else if (var60 == 7) {
                            var65.field1597 = new class13(var66, 4, (var61 + 2 & 0x3) + 4, Statics.field575, var57, var58, var55, false, var65.field1597);
                        } else if (var60 == 8) {
                            var65.field1597 = new class13(var66, 4, var61 + 4, Statics.field575, var57, var58, var55, false, var65.field1597);
                            var65.field1591 = new class13(var66, 4, (var61 + 2 & 0x3) + 4, Statics.field575, var57, var58, var55, false, var65.field1591);
                        }
                    }
                }
                if (var62 == 2) {
                    class98 var67 = Statics.field3044.method1779(Statics.field575, var57, var58);
                    if (var60 == 11) {
                        var60 = 10;
                    }
                    if (var67 != null) {
                        var67.field1644 = new class13(var67.field1656 >> 14 & 0x7FFF, var60, var61, Statics.field575, var57, var58, var55, false, var67.field1644);
                    }
                }
                if (var62 == 3) {
                    class93 var68 = Statics.field3044.method1888(Statics.field575, var57, var58);
                    if (var68 != null) {
                        var68.field1574 = new class13(var68.field1576 >> 14 & 0x7FFF, 22, var61, Statics.field575, var57, var58, var55, false, var68.field1574);
                    }
                }
            }
        } else if (field334 == 107) {
            int var69 = field407.method2427();
            int var70 = (var69 >> 4 & 0x7) + Statics.field26;
            int var71 = (var69 & 0x7) + Statics.field1149;
            int var72 = field407.method2339();
            int var73 = field407.method2427();
            int var74 = field407.method2339();
            if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104) {
                int var75 = var70 * 128 + 64;
                int var76 = var71 * 128 + 64;
                class30 var77 = new class30(var72, Statics.field575, var75, var76, method43(var75, var76, Statics.field575) - var73, var74, field288);
                field558.method3589(var77);
            }
        } else if (field334 == 231) {
            int var78 = field407.method2363();
            int var79 = (var78 >> 4 & 0x7) + Statics.field26;
            int var80 = (var78 & 0x7) + Statics.field1149;
            int var81 = field407.method2364();
            int var82 = var81 >> 2;
            int var83 = var81 & 0x3;
            int var84 = field340[var82];
            if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104) {
                method3175(Statics.field575, var79, var80, var84, -1, var82, var83, 0, -1);
            }
        } else if (field334 == 211) {
            int var85 = field407.method2522();
            int var86 = field407.method2365();
            int var87 = var86 >> 2;
            int var88 = var86 & 0x3;
            int var89 = field340[var87];
            byte var90 = field407.method2338();
            int var91 = field407.method2373();
            int var92 = field407.method2427();
            int var93 = (var92 >> 4 & 0x7) + Statics.field26;
            int var94 = (var92 & 0x7) + Statics.field1149;
            int var95 = field407.method2522();
            byte var96 = field407.method2352();
            byte var97 = field407.method2352();
            byte var98 = field407.method2352();
            int var99 = field407.method2373();
            class3 var100;
            if (field398 == var99) {
                var100 = Statics.field159;
            } else {
                var100 = field337[var99];
            }
            if (var100 != null) {
                class41 var101 = class41.method2808(var95);
                int var102;
                int var103;
                if (var88 == 1 || var88 == 3) {
                    var102 = var101.field935;
                    var103 = var101.field934;
                } else {
                    var102 = var101.field934;
                    var103 = var101.field935;
                }
                int var104 = (var102 >> 1) + var93;
                int var105 = (var102 + 1 >> 1) + var93;
                int var106 = (var103 >> 1) + var94;
                int var107 = (var103 + 1 >> 1) + var94;
                int[][] var108 = class6.field79[Statics.field575];
                int var109 = var108[var104][var106] + var108[var105][var106] + var108[var104][var107] + var108[var105][var107] >> 2;
                int var110 = (var93 << 7) + (var102 << 6);
                int var111 = (var94 << 7) + (var103 << 6);
                class105 var112 = var101.method787(var87, var88, var108, var110, var109, var111);
                if (var112 != null) {
                    method3175(Statics.field575, var93, var94, var89, -1, 0, 0, var91 + 1, var85 + 1);
                    var100.field41 = field288 + var91;
                    var100.field42 = field288 + var85;
                    var100.field48 = var112;
                    var100.field43 = var93 * 128 + var102 * 64;
                    var100.field57 = var94 * 128 + var103 * 64;
                    var100.field44 = var109;
                    if (var90 > var96) {
                        byte var113 = var90;
                        var90 = var96;
                        var96 = var113;
                    }
                    if (var98 > var97) {
                        byte var114 = var98;
                        var98 = var97;
                        var97 = var114;
                    }
                    var100.field47 = var90 + var93;
                    var100.field45 = var93 + var96;
                    var100.field40 = var94 + var98;
                    var100.field50 = var94 + var97;
                }
            }
        }
    }

    @ObfuscatedName("fx.bo(IIIIIIIIII)V")
    public static final void method3175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field408.method3581(); var10 != null; var10 = (class17) field408.method3583()) {
            if (var10.field230 == arg0 && var10.field219 == arg1 && var10.field227 == arg2 && var10.field218 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field230 = arg0;
            var9.field218 = arg3;
            var9.field219 = arg1;
            var9.field227 = arg2;
            method2615(var9);
            field408.method3589(var9);
        }
        var9.field220 = arg4;
        var9.field226 = arg5;
        var9.field233 = arg6;
        var9.field217 = arg7;
        var9.field228 = arg8;
    }

    @ObfuscatedName("dm.by(La;I)V")
    public static final void method2615(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field218 == 0) {
            var1 = Statics.field3044.method1781(arg0.field230, arg0.field219, arg0.field227);
        }
        if (arg0.field218 == 1) {
            var1 = Statics.field3044.method1782(arg0.field230, arg0.field219, arg0.field227);
        }
        if (arg0.field218 == 2) {
            var1 = Statics.field3044.method1921(arg0.field230, arg0.field219, arg0.field227);
        }
        if (arg0.field218 == 3) {
            var1 = Statics.field3044.method1784(arg0.field230, arg0.field219, arg0.field227);
        }
        if (var1 != 0) {
            int var5 = Statics.field3044.method1785(arg0.field230, arg0.field219, arg0.field227, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field225 = var2;
        arg0.field223 = var3;
        arg0.field222 = var4;
    }

    @ObfuscatedName("q.bh(I)V")
    public static final void method166() {
        for (class17 var0 = (class17) field408.method3581(); var0 != null; var0 = (class17) field408.method3583()) {
            if (var0.field228 > 0) {
                var0.field228--;
            }
            if (var0.field228 == 0) {
                if (var0.field225 >= 0) {
                    int var1 = var0.field225;
                    int var2 = var0.field223;
                    class41 var3 = class41.method2808(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method785(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method2749(var0.field230, var0.field218, var0.field219, var0.field227, var0.field225, var0.field222, var0.field223);
                var0.method3670();
            } else {
                if (var0.field217 > 0) {
                    var0.field217--;
                }
                if (var0.field217 == 0 && var0.field219 >= 1 && var0.field227 >= 1 && var0.field219 <= 102 && var0.field227 <= 102) {
                    if (var0.field220 >= 0) {
                        int var5 = var0.field220;
                        int var6 = var0.field226;
                        class41 var7 = class41.method2808(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method785(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method2749(var0.field230, var0.field218, var0.field219, var0.field227, var0.field220, var0.field233, var0.field226);
                    var0.field217 = -1;
                    if (var0.field225 == var0.field220 && var0.field225 == -1) {
                        var0.method3670();
                    } else if (var0.field225 == var0.field220 && var0.field233 == var0.field222 && var0.field226 == var0.field223) {
                        var0.method3670();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ev.bj(IIIIIIII)V")
    public static final void method2749(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field283 && Statics.field575 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field3044.method1781(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field3044.method1782(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field3044.method1921(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field3044.method1784(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field3044.method1785(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field3044.method1772(arg0, arg2, arg3);
                class41 var15 = class41.method2808(var12);
                if (var15.field936 != 0) {
                    field512[arg0].method2218(arg2, arg3, var13, var14, var15.field969);
                }
            }
            if (arg1 == 1) {
                Statics.field3044.method1773(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field3044.method1808(arg0, arg2, arg3);
                class41 var16 = class41.method2808(var12);
                if (var16.field934 + arg2 > 103 || var16.field934 + arg3 > 103 || var16.field935 + arg2 > 103 || var16.field935 + arg3 > 103) {
                    return;
                }
                if (var16.field936 != 0) {
                    field512[arg0].method2254(arg2, arg3, var16.field934, var16.field935, var14, var16.field969);
                }
            }
            if (arg1 == 3) {
                Statics.field3044.method1775(arg0, arg2, arg3);
                class41 var17 = class41.method2808(var12);
                if (var17.field936 == 1) {
                    field512[arg0].method2228(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field78[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class86 var19 = Statics.field3044;
        class108 var20 = field512[arg0];
        class41 var21 = class41.method2808(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field935;
            var23 = var21.field934;
        } else {
            var22 = var21.field934;
            var23 = var21.field935;
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
        int[][] var28 = class6.field79[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field938 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field924 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class85 var34;
            if (var21.field942 == -1 && var21.field960 == null) {
                var34 = var21.method787(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field942, true, (class85) null);
            }
            var19.method1761(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field936 == 1) {
                var20.method2220(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class85 var57;
            if (var21.field942 == -1 && var21.field960 == null) {
                var57 = var21.method787(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field942, true, (class85) null);
            }
            if (var57 != null) {
                var19.method1903(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field936 != 0) {
                var20.method2221(arg2, arg3, var22, var23, var21.field969);
            }
        } else if (arg6 >= 12) {
            class85 var35;
            if (var21.field942 == -1 && var21.field960 == null) {
                var35 = var21.method787(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field942, true, (class85) null);
            }
            var19.method1903(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field936 != 0) {
                var20.method2221(arg2, arg3, var22, var23, var21.field969);
            }
        } else if (arg6 == 0) {
            class85 var36;
            if (var21.field942 == -1 && var21.field960 == null) {
                var36 = var21.method787(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field942, true, (class85) null);
            }
            var19.method1763(arg0, arg2, arg3, var29, var36, (class85) null, class6.field84[arg5], 0, var32, var33);
            if (var21.field936 != 0) {
                var20.method2226(arg2, arg3, arg6, arg5, var21.field969);
            }
        } else if (arg6 == 1) {
            class85 var37;
            if (var21.field942 == -1 && var21.field960 == null) {
                var37 = var21.method787(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field942, true, (class85) null);
            }
            var19.method1763(arg0, arg2, arg3, var29, var37, (class85) null, class6.field86[arg5], 0, var32, var33);
            if (var21.field936 != 0) {
                var20.method2226(arg2, arg3, arg6, arg5, var21.field969);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class85 var39;
            class85 var40;
            if (var21.field942 == -1 && var21.field960 == null) {
                var39 = var21.method787(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method787(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field942, true, (class85) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field942, true, (class85) null);
            }
            var19.method1763(arg0, arg2, arg3, var29, var39, var40, class6.field84[arg5], class6.field84[var38], var32, var33);
            if (var21.field936 != 0) {
                var20.method2226(arg2, arg3, arg6, arg5, var21.field969);
            }
        } else if (arg6 == 3) {
            class85 var41;
            if (var21.field942 == -1 && var21.field960 == null) {
                var41 = var21.method787(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field942, true, (class85) null);
            }
            var19.method1763(arg0, arg2, arg3, var29, var41, (class85) null, class6.field86[arg5], 0, var32, var33);
            if (var21.field936 != 0) {
                var20.method2226(arg2, arg3, arg6, arg5, var21.field969);
            }
        } else if (arg6 == 9) {
            class85 var42;
            if (var21.field942 == -1 && var21.field960 == null) {
                var42 = var21.method787(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field942, true, (class85) null);
            }
            var19.method1903(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field936 != 0) {
                var20.method2221(arg2, arg3, var22, var23, var21.field969);
            }
        } else if (arg6 == 4) {
            class85 var43;
            if (var21.field942 == -1 && var21.field960 == null) {
                var43 = var21.method787(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field942, true, (class85) null);
            }
            var19.method1887(arg0, arg2, arg3, var29, var43, (class85) null, class6.field84[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1781(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class41.method2808(var45 >> 14 & 0x7FFF).field943;
            }
            class85 var46;
            if (var21.field942 == -1 && var21.field960 == null) {
                var46 = var21.method787(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field942, true, (class85) null);
            }
            var19.method1887(arg0, arg2, arg3, var29, var46, (class85) null, class6.field84[arg5], 0, class6.field87[arg5] * var44, class6.field88[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1781(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class41.method2808(var48 >> 14 & 0x7FFF).field943 / 2;
            }
            class85 var49;
            if (var21.field942 == -1 && var21.field960 == null) {
                var49 = var21.method787(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field942, true, (class85) null);
            }
            var19.method1887(arg0, arg2, arg3, var29, var49, (class85) null, 256, arg5, class6.field81[arg5] * var47, class6.field90[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class85 var51;
            if (var21.field942 == -1 && var21.field960 == null) {
                var51 = var21.method787(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field942, true, (class85) null);
            }
            var19.method1887(arg0, arg2, arg3, var29, var51, (class85) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1781(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class41.method2808(var53 >> 14 & 0x7FFF).field943 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class85 var55;
            class85 var56;
            if (var21.field942 == -1 && var21.field960 == null) {
                var55 = var21.method787(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method787(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field942, true, (class85) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field942, true, (class85) null);
            }
            var19.method1887(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field81[arg5] * var52, class6.field90[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("cb.bu(III)V")
    public static final void method2021(int arg0, int arg1) {
        class199 var2 = field552[Statics.field575][arg0][arg1];
        if (var2 == null) {
            Statics.field3044.method1878(Statics.field575, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3581(); var6 != null; var6 = (class29) var2.method3583()) {
            class52 var7 = class52.method1933(var6.field680);
            long var8 = (long) var7.field1115;
            if (var7.field1102 == 1) {
                var8 = (long) (var6.field678 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field3044.method1878(Statics.field575, arg0, arg1);
            return;
        }
        var2.method3590(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3581(); var12 != null; var12 = (class29) var2.method3583()) {
            if (var5.field680 != var12.field680) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field680 != var12.field680 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field3044.method1855(Statics.field575, arg0, arg1, method43(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field575), var5, var13, var10, var11);
    }

    @ObfuscatedName("ak.bt(ZI)V")
    public static final void method674(boolean arg0) {
        field400 = 0;
        field318 = 0;
        field407.method2596();
        int var1 = field407.method2607(8);
        if (var1 < field339) {
            for (int var2 = var1; var2 < field339; var2++) {
                field336[++field400 - 1] = field530[var2];
            }
        }
        if (var1 > field339) {
            throw new RuntimeException("");
        }
        field339 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field530[var3];
            class35 var5 = field315[var4];
            int var6 = field407.method2607(1);
            if (var6 == 0) {
                field530[++field339 - 1] = var4;
                var5.field859 = field288;
            } else {
                int var7 = field407.method2607(2);
                if (var7 == 0) {
                    field530[++field339 - 1] = var4;
                    var5.field859 = field288;
                    field286[++field318 - 1] = var4;
                } else if (var7 == 1) {
                    field530[++field339 - 1] = var4;
                    var5.field859 = field288;
                    int var8 = field407.method2607(3);
                    var5.method718(var8, (byte) 1);
                    int var9 = field407.method2607(1);
                    if (var9 == 1) {
                        field286[++field318 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field530[++field339 - 1] = var4;
                    var5.field859 = field288;
                    int var10 = field407.method2607(3);
                    var5.method718(var10, (byte) 2);
                    int var11 = field407.method2607(3);
                    var5.method718(var11, (byte) 2);
                    int var12 = field407.method2607(1);
                    if (var12 == 1) {
                        field286[++field318 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field336[++field400 - 1] = var4;
                }
            }
        }
        method2281(arg0);
        method1739();
        for (int var13 = 0; var13 < field400; var13++) {
            int var14 = field336[var13];
            if (field288 != field315[var14].field859) {
                field315[var14].field778 = null;
                field315[var14] = null;
            }
        }
        if (field323 != field407.field1974) {
            throw new RuntimeException(field407.field1974 + class2.field21 + field323);
        }
        for (int var15 = 0; var15 < field339; var15++) {
            if (field315[field530[var15]] == null) {
                throw new RuntimeException(var15 + class2.field21 + field339);
            }
        }
    }

    @ObfuscatedName("dv.ba(ZI)V")
    public static final void method2281(boolean arg0) {
        while (true) {
            if (field407.method2599(field323) >= 27) {
                int var1 = field407.method2607(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field315[var1] == null) {
                        field315[var1] = new class35();
                        var2 = true;
                    }
                    class35 var3 = field315[var1];
                    field530[++field339 - 1] = var1;
                    var3.field859 = field288;
                    int var4;
                    if (arg0) {
                        var4 = field407.method2607(8);
                        if (var4 > 127) {
                            var4 -= 256;
                        }
                    } else {
                        var4 = field407.method2607(5);
                        if (var4 > 15) {
                            var4 -= 32;
                        }
                    }
                    int var5;
                    if (arg0) {
                        var5 = field407.method2607(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = field407.method2607(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6 = field407.method2607(1);
                    var3.field778 = class40.method3484(field407.method2607(14));
                    int var7 = field407.method2607(1);
                    if (var7 == 1) {
                        field286[++field318 - 1] = var1;
                    }
                    int var8 = field405[field407.method2607(3)];
                    if (var2) {
                        var3.field849 = var3.field813 = var8;
                    }
                    var3.field850 = var3.field778.field895;
                    var3.field863 = var3.field778.field906;
                    if (var3.field863 == 0) {
                        var3.field813 = 0;
                    }
                    var3.field825 = var3.field778.field889;
                    var3.field820 = var3.field778.field890;
                    var3.field821 = var3.field778.field891;
                    var3.field822 = var3.field778.field892;
                    var3.field826 = var3.field778.field885;
                    var3.field852 = var3.field778.field887;
                    var3.field818 = var3.field778.field888;
                    var3.method719(Statics.field159.field865[0] + var5, Statics.field159.field827[0] + var4, var6 == 1);
                    continue;
                }
            }
            field407.method2598();
            return;
        }
    }

    @ObfuscatedName("cs.bi(I)V")
    public static final void method1739() {
        for (int var0 = 0; var0 < field318; var0++) {
            int var1 = field286[var0];
            class35 var2 = field315[var1];
            int var3 = field407.method2427();
            if ((var3 & 0x1) != 0) {
                int var4 = field407.method2427();
                int var5 = field407.method2365();
                var2.method739(var4, var5, field288);
                var2.field833 = field288 + 300;
                var2.field834 = field407.method2371();
                var2.field835 = field407.method2339();
            }
            if ((var3 & 0x2) != 0) {
                var2.field829 = field407.method2528();
                var2.field824 = 100;
            }
            if ((var3 & 0x8) != 0) {
                int var6 = field407.method2339();
                int var7 = field407.method2339();
                int var8 = var2.field845 - (var6 - Statics.field253 - Statics.field253) * 64;
                int var9 = var2.field812 - (var7 - Statics.field2902 - Statics.field2902) * 64;
                if (var8 != 0 || var9 != 0) {
                    var2.field838 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x40) != 0) {
                var2.field836 = field407.method2522();
                if (var2.field836 == 65535) {
                    var2.field836 = -1;
                }
            }
            if ((var3 & 0x80) != 0) {
                int var10 = field407.method2373();
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = field407.method2427();
                if (var2.field842 == var10 && var10 != -1) {
                    int var12 = class43.method774(var10).field997;
                    if (var12 == 1) {
                        var2.field843 = 0;
                        var2.field844 = 0;
                        var2.field853 = var11;
                        var2.field846 = 0;
                    }
                    if (var12 == 2) {
                        var2.field846 = 0;
                    }
                } else if (var10 == -1 || var2.field842 == -1 || class43.method774(var10).field991 >= class43.method774(var2.field842).field991) {
                    var2.field842 = var10;
                    var2.field843 = 0;
                    var2.field844 = 0;
                    var2.field853 = var11;
                    var2.field846 = 0;
                    var2.field869 = var2.field864;
                }
            }
            if ((var3 & 0x20) != 0) {
                var2.field847 = field407.method2371();
                int var13 = field407.method2381();
                var2.field851 = var13 >> 16;
                var2.field855 = (var13 & 0xFFFF) + field288;
                var2.field867 = 0;
                var2.field860 = 0;
                if (var2.field855 > field288) {
                    var2.field867 = -1;
                }
                if (var2.field847 == 65535) {
                    var2.field847 = -1;
                }
            }
            if ((var3 & 0x10) != 0) {
                int var14 = field407.method2427();
                int var15 = field407.method2365();
                var2.method739(var14, var15, field288);
                var2.field833 = field288 + 300;
                var2.field834 = field407.method2373();
                var2.field835 = field407.method2522();
            }
            if ((var3 & 0x4) != 0) {
                var2.field778 = class40.method3484(field407.method2522());
                var2.field850 = var2.field778.field895;
                var2.field863 = var2.field778.field906;
                var2.field825 = var2.field778.field889;
                var2.field820 = var2.field778.field890;
                var2.field821 = var2.field778.field891;
                var2.field822 = var2.field778.field892;
                var2.field826 = var2.field778.field885;
                var2.field852 = var2.field778.field887;
                var2.field818 = var2.field778.field888;
            }
        }
    }

    @ObfuscatedName("eg.bv(I)V")
    public static final void method2764() {
        int var0 = Statics.field652;
        int var1 = Statics.field1608;
        int var2 = Statics.field1927;
        int var3 = Statics.field1979;
        int var4 = 6116423;
        class80.method1697(var0, var1, var2, var3, var4);
        class80.method1697(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class80.method1656(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field580.method3785(class157.field2460, var0 + 3, var1 + 14, var4, -1);
        int var5 = class140.field2144;
        int var6 = class140.field2145;
        for (int var7 = 0; var7 < field416; var7++) {
            int var8 = (field416 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class224 var10 = Statics.field580;
            String var11;
            if (field332[var7].length() > 0) {
                var11 = field421[var7] + class157.field2467 + field332[var7];
            } else {
                var11 = field421[var7];
            }
            var10.method3785(var11, var0 + 3, var8, var9, 0);
        }
        method200(Statics.field652, Statics.field1608, Statics.field1927, Statics.field1979);
    }

    @ObfuscatedName("aq.bk(IIIII)V")
    public static final void method841(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field478; var4++) {
            if (field485[var4] + field483[var4] > arg0 && field483[var4] < arg0 + arg2 && field486[var4] + field484[var4] > arg1 && field484[var4] < arg1 + arg3) {
                field450[var4] = true;
            }
        }
    }

    @ObfuscatedName("r.bs(IIIII)V")
    public static final void method200(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field478; var4++) {
            if (field485[var4] + field483[var4] > arg0 && field483[var4] < arg0 + arg2 && field486[var4] + field484[var4] > arg1 && field484[var4] < arg1 + arg3) {
                field481[var4] = true;
            }
        }
    }

    @ObfuscatedName("dt.bb(B)V")
    public static final void method2629() {
        method2666();
        if (Statics.field247 != null || field304 != null) {
            return;
        }
        int var12;
        int var13;
        label229: {
            int var0 = class140.field2150;
            if (field415) {
                if (var0 != 1 && (Statics.field977 || var0 != 4)) {
                    int var1 = class140.field2144;
                    int var2 = class140.field2145;
                    if (var1 < Statics.field652 - 10 || var1 > Statics.field652 + Statics.field1927 + 10 || var2 < Statics.field1608 - 10 || var2 > Statics.field1979 + Statics.field1608 + 10) {
                        field415 = false;
                        method841(Statics.field652, Statics.field1608, Statics.field1927, Statics.field1979);
                    }
                }
                if (var0 == 1 || !Statics.field977 && var0 == 4) {
                    int var3 = Statics.field652;
                    int var4 = Statics.field1608;
                    int var5 = Statics.field1927;
                    int var6 = class140.field2151;
                    int var7 = class140.field2154;
                    int var8 = -1;
                    for (int var9 = 0; var9 < field416; var9++) {
                        int var10 = (field416 - 1 - var9) * 15 + var4 + 31;
                        if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                            var8 = var9;
                        }
                    }
                    if (var8 != -1) {
                        method2276(var8);
                    }
                    field415 = false;
                    method841(Statics.field652, Statics.field1608, Statics.field1927, Statics.field1979);
                }
            } else {
                if ((var0 == 1 || !Statics.field977 && var0 == 4) && field416 > 0) {
                    int var11 = field419[field416 - 1];
                    if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                        var12 = field417[field416 - 1];
                        var13 = field418[field416 - 1];
                        class173 var14 = class173.method2550(var13);
                        int var15 = method878(var14);
                        boolean var16 = (var15 >> 28 & 0x1) != 0;
                        if (var16) {
                            break label229;
                        }
                        int var17 = method878(var14);
                        boolean var18 = (var17 >> 29 & 0x1) != 0;
                        if (var18) {
                            break label229;
                        }
                    }
                }
                if (var0 == 1 || !Statics.field977 && var0 == 4) {
                    label236: {
                        if (field526 != 1 || field416 <= 2) {
                            int var22 = field416 - 1;
                            boolean var23;
                            if (var22 < 0) {
                                var23 = false;
                            } else {
                                int var24 = field419[var22];
                                if (var24 >= 2000) {
                                    var24 -= 2000;
                                }
                                if (var24 == 1007) {
                                    var23 = true;
                                } else {
                                    var23 = false;
                                }
                            }
                            if (!var23) {
                                break label236;
                            }
                        }
                        var0 = 2;
                    }
                }
                if ((var0 == 1 || !Statics.field977 && var0 == 4) && field416 > 0) {
                    method2276(field416 - 1);
                }
                if (var0 == 2 && field416 > 0) {
                    method1937(class140.field2151, class140.field2154);
                }
            }
            return;
        }
        if (Statics.field247 != null && !field498 && field526 != 1) {
            int var19 = field416 - 1;
            boolean var20;
            if (var19 < 0) {
                var20 = false;
            } else {
                int var21 = field419[var19];
                if (var21 >= 2000) {
                    var21 -= 2000;
                }
                if (var21 == 1007) {
                    var20 = true;
                } else {
                    var20 = false;
                }
            }
            if (!var20 && field416 > 0) {
                method744(field391, field392);
            }
        }
        field498 = false;
        field395 = 0;
        if (Statics.field247 != null) {
            method239(Statics.field247);
        }
        Statics.field247 = class173.method2550(var13);
        field390 = var12;
        field391 = class140.field2151;
        field392 = class140.field2154;
        if (field416 > 0) {
            method2915(field416 - 1);
        }
        method239(Statics.field247);
    }

    @ObfuscatedName("cq.bz(III)V")
    public static final void method1937(int arg0, int arg1) {
        int var2 = Statics.field580.method3842(class157.field2460);
        for (int var3 = 0; var3 < field416; var3++) {
            class224 var4 = Statics.field580;
            String var5;
            if (field332[var3].length() > 0) {
                var5 = field421[var3] + class157.field2467 + field332[var3];
            } else {
                var5 = field421[var3];
            }
            int var6 = var4.method3842(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field416 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field1146) {
            var8 = Statics.field1146 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field590) {
            var9 = Statics.field590 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field415 = true;
        Statics.field652 = var8;
        Statics.field1608 = var9;
        Statics.field1927 = var2;
        Statics.field1979 = field416 * 15 + 22;
    }

    @ObfuscatedName("dd.cu(II)V")
    public static final void method2276(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field417[arg0];
        int var2 = field418[arg0];
        int var3 = field419[arg0];
        int var4 = field420[arg0];
        String var5 = field421[arg0];
        String var6 = field332[arg0];
        method733(var1, var2, var3, var4, var5, var6, class140.field2151, class140.field2154);
    }

    @ObfuscatedName("ae.cc(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method733(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 12) {
            class35 var8 = field315[arg3];
            if (var8 != null) {
                field480 = arg6;
                field385 = arg7;
                field381 = 2;
                field534 = 0;
                field314 = arg0;
                field384 = arg1;
                field312.method2612(183);
                field312.method2361(class137.field2124[82] ? 1 : 0);
                field312.method2369(arg3);
            }
        }
        if (arg2 == 45) {
            class3 var9 = field337[arg3];
            if (var9 != null) {
                field480 = arg6;
                field385 = arg7;
                field381 = 2;
                field534 = 0;
                field314 = arg0;
                field384 = arg1;
                field312.method2612(9);
                field312.method2362(class137.field2124[82] ? 1 : 0);
                field312.method2369(arg3);
            }
        }
        if (arg2 == 44) {
            class3 var10 = field337[arg3];
            if (var10 != null) {
                field480 = arg6;
                field385 = arg7;
                field381 = 2;
                field534 = 0;
                field314 = arg0;
                field384 = arg1;
                field312.method2612(37);
                field312.method2369(arg3);
                field312.method2360(class137.field2124[82] ? 1 : 0);
            }
        }
        if (arg2 == 8) {
            class35 var11 = field315[arg3];
            if (var11 != null) {
                field480 = arg6;
                field385 = arg7;
                field381 = 2;
                field534 = 0;
                field314 = arg0;
                field384 = arg1;
                field312.method2612(79);
                field312.method2481(field431);
                field312.method2360(class137.field2124[82] ? 1 : 0);
                field312.method2454(Statics.field740);
                field312.method2370(arg3);
            }
        }
        if (arg2 == 22) {
            field480 = arg6;
            field385 = arg7;
            field381 = 2;
            field534 = 0;
            field314 = arg0;
            field384 = arg1;
            field312.method2612(158);
            field312.method2369(Statics.field253 + arg0);
            field312.method2360(class137.field2124[82] ? 1 : 0);
            field312.method2390(Statics.field2902 + arg1);
            field312.method2370(arg3);
        }
        if (arg2 == 7) {
            class35 var12 = field315[arg3];
            if (var12 != null) {
                field480 = arg6;
                field385 = arg7;
                field381 = 2;
                field534 = 0;
                field314 = arg0;
                field384 = arg1;
                field312.method2612(211);
                field312.method2322(class137.field2124[82] ? 1 : 0);
                field312.method2527(Statics.field1932);
                field312.method2369(Statics.field1952);
                field312.method2481(arg3);
                field312.method2370(Statics.field578);
            }
        }
        if (arg2 == 11) {
            class35 var13 = field315[arg3];
            if (var13 != null) {
                field480 = arg6;
                field385 = arg7;
                field381 = 2;
                field534 = 0;
                field314 = arg0;
                field384 = arg1;
                field312.method2612(169);
                field312.method2481(arg3);
                field312.method2361(class137.field2124[82] ? 1 : 0);
            }
        }
        if (arg2 == 29) {
            field312.method2612(121);
            field312.method2327(arg1);
            class173 var14 = class173.method2550(arg1);
            if (var14.field2867 != null && var14.field2867[0][0] == 5) {
                int var15 = var14.field2867[0][1];
                if (class176.field2906[var15] != var14.field2869[0]) {
                    class176.field2906[var15] = var14.field2869[0];
                    method2663(var15);
                }
            }
        }
        if (arg2 == 13) {
            class35 var16 = field315[arg3];
            if (var16 != null) {
                field480 = arg6;
                field385 = arg7;
                field381 = 2;
                field534 = 0;
                field314 = arg0;
                field384 = arg1;
                field312.method2612(71);
                field312.method2370(arg3);
                field312.method2361(class137.field2124[82] ? 1 : 0);
            }
        }
        if (arg2 == 33) {
            field312.method2612(237);
            field312.method2527(arg1);
            field312.method2481(arg0);
            field312.method2481(arg3);
            field388 = 0;
            Statics.field2269 = class173.method2550(arg1);
            field487 = arg0;
        }
        if (arg2 == 17) {
            field480 = arg6;
            field385 = arg7;
            field381 = 2;
            field534 = 0;
            field314 = arg0;
            field384 = arg1;
            field312.method2612(164);
            field312.method2481(Statics.field2902 + arg1);
            field312.method2369(field431);
            field312.method2520(Statics.field740);
            field312.method2361(class137.field2124[82] ? 1 : 0);
            field312.method2370(Statics.field253 + arg0);
            field312.method2370(arg3);
        }
        if (arg2 == 32) {
            field312.method2612(80);
            field312.method2327(arg1);
            field312.method2327(Statics.field740);
            field312.method2390(arg3);
            field312.method2390(arg0);
            field312.method2481(field431);
            field388 = 0;
            Statics.field2269 = class173.method2550(arg1);
            field487 = arg0;
        }
        if (arg2 == 49) {
            class3 var17 = field337[arg3];
            if (var17 != null) {
                field480 = arg6;
                field385 = arg7;
                field381 = 2;
                field534 = 0;
                field314 = arg0;
                field384 = arg1;
                field312.method2612(103);
                field312.method2481(arg3);
                field312.method2361(class137.field2124[82] ? 1 : 0);
            }
        }
        if (arg2 == 48) {
            class3 var18 = field337[arg3];
            if (var18 != null) {
                field480 = arg6;
                field385 = arg7;
                field381 = 2;
                field534 = 0;
                field314 = arg0;
                field384 = arg1;
                field312.method2612(98);
                field312.method2370(arg3);
                field312.method2362(class137.field2124[82] ? 1 : 0);
            }
        }
        if (arg2 == 42) {
            field312.method2612(89);
            field312.method2527(arg1);
            field312.method2481(arg0);
            field312.method2369(arg3);
            field388 = 0;
            Statics.field2269 = class173.method2550(arg1);
            field487 = arg0;
        }
        if (arg2 == 21) {
            field480 = arg6;
            field385 = arg7;
            field381 = 2;
            field534 = 0;
            field314 = arg0;
            field384 = arg1;
            field312.method2612(241);
            field312.method2369(Statics.field2902 + arg1);
            field312.method2370(arg3);
            field312.method2390(Statics.field253 + arg0);
            field312.method2360(class137.field2124[82] ? 1 : 0);
        }
        if (arg2 == 46) {
            class3 var19 = field337[arg3];
            if (var19 != null) {
                field480 = arg6;
                field385 = arg7;
                field381 = 2;
                field534 = 0;
                field314 = arg0;
                field384 = arg1;
                field312.method2612(192);
                field312.method2369(arg3);
                field312.method2360(class137.field2124[82] ? 1 : 0);
            }
        }
        if (arg2 == 51) {
            class3 var20 = field337[arg3];
            if (var20 != null) {
                field480 = arg6;
                field385 = arg7;
                field381 = 2;
                field534 = 0;
                field314 = arg0;
                field384 = arg1;
                field312.method2612(38);
                field312.method2481(arg3);
                field312.method2362(class137.field2124[82] ? 1 : 0);
            }
        }
        if (arg2 == 5) {
            field480 = arg6;
            field385 = arg7;
            field381 = 2;
            field534 = 0;
            field314 = arg0;
            field384 = arg1;
            field312.method2612(126);
            field312.method2390(Statics.field2902 + arg1);
            field312.method2481(arg3 >> 14 & 0x7FFF);
            field312.method2360(class137.field2124[82] ? 1 : 0);
            field312.method2369(Statics.field253 + arg0);
        }
        if (arg2 == 26) {
            method2263();
        }
        if (arg2 == 1002) {
            field480 = arg6;
            field385 = arg7;
            field381 = 2;
            field534 = 0;
            field312.method2612(5);
            field312.method2481(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 31) {
            field312.method2612(247);
            field312.method2527(Statics.field1932);
            field312.method2370(arg0);
            field312.method2481(Statics.field578);
            field312.method2481(arg3);
            field312.method2369(Statics.field1952);
            field312.method2520(arg1);
            field388 = 0;
            Statics.field2269 = class173.method2550(arg1);
            field487 = arg0;
        }
        if (arg2 == 34) {
            field312.method2612(57);
            field312.method2481(arg0);
            field312.method2390(arg3);
            field312.method2327(arg1);
            field388 = 0;
            Statics.field2269 = class173.method2550(arg1);
            field487 = arg0;
        }
        if (arg2 == 15) {
            class3 var21 = field337[arg3];
            if (var21 != null) {
                field480 = arg6;
                field385 = arg7;
                field381 = 2;
                field534 = 0;
                field314 = arg0;
                field384 = arg1;
                field312.method2612(27);
                field312.method2370(field431);
                field312.method2527(Statics.field740);
                field312.method2390(arg3);
                field312.method2322(class137.field2124[82] ? 1 : 0);
            }
        }
        if (arg2 == 43) {
            field312.method2612(55);
            field312.method2369(arg0);
            field312.method2370(arg3);
            field312.method2327(arg1);
            field388 = 0;
            Statics.field2269 = class173.method2550(arg1);
            field487 = arg0;
        }
        if (arg2 == 20) {
            field480 = arg6;
            field385 = arg7;
            field381 = 2;
            field534 = 0;
            field314 = arg0;
            field384 = arg1;
            field312.method2612(124);
            field312.method2369(Statics.field253 + arg0);
            field312.method2390(Statics.field2902 + arg1);
            field312.method2361(class137.field2124[82] ? 1 : 0);
            field312.method2390(arg3);
        }
        if (arg2 == 24) {
            class173 var22 = class173.method2550(arg1);
            boolean var23 = true;
            if (var22.field2771 > 0) {
                var23 = method644(var22);
            }
            if (var23) {
                field312.method2612(121);
                field312.method2327(arg1);
            }
        }
        if (arg2 == 38) {
            method38();
            class173 var24 = class173.method2550(arg1);
            field458 = 1;
            Statics.field578 = arg0;
            Statics.field1932 = arg1;
            Statics.field1952 = arg3;
            method239(var24);
            field338 = Statics.method2947(16748608) + class52.method1933(arg3).field1105 + Statics.method2947(16777215);
            if (field338 == null) {
                field338 = "null";
            }
            return;
        }
        if (arg2 == 2) {
            field480 = arg6;
            field385 = arg7;
            field381 = 2;
            field534 = 0;
            field314 = arg0;
            field384 = arg1;
            field312.method2612(212);
            field312.method2360(class137.field2124[82] ? 1 : 0);
            field312.method2327(Statics.field740);
            field312.method2481(field431);
            field312.method2481(Statics.field253 + arg0);
            field312.method2481(arg3 >> 14 & 0x7FFF);
            field312.method2390(Statics.field2902 + arg1);
        }
        if (arg2 == 1005) {
            class173 var25 = class173.method2550(arg1);
            if (var25 == null || var25.field2773[arg0] < 100000) {
                field312.method2612(132);
                field312.method2390(arg3);
            } else {
                class12.method2960(27, "", var25.field2773[arg0] + " x " + class52.method1933(arg3).field1105);
            }
            field388 = 0;
            Statics.field2269 = class173.method2550(arg1);
            field487 = arg0;
        }
        if (arg2 == 30 && field454 == null) {
            field312.method2612(87);
            field312.method2390(arg0);
            field312.method2454(arg1);
            field454 = class173.method908(arg1, arg0);
            method239(field454);
        }
        if (arg2 == 1004) {
            field480 = arg6;
            field385 = arg7;
            field381 = 2;
            field534 = 0;
            field312.method2612(132);
            field312.method2390(arg3);
        }
        if (arg2 == 3) {
            field480 = arg6;
            field385 = arg7;
            field381 = 2;
            field534 = 0;
            field314 = arg0;
            field384 = arg1;
            field312.method2612(196);
            field312.method2369(Statics.field253 + arg0);
            field312.method2390(Statics.field2902 + arg1);
            field312.method2370(arg3 >> 14 & 0x7FFF);
            field312.method2362(class137.field2124[82] ? 1 : 0);
        }
        if (arg2 == 25) {
            class173 var26 = class173.method908(arg1, arg0);
            if (var26 != null) {
                method38();
                int var27 = class178.method2591(method878(var26));
                int var28 = var26.field2875;
                class173 var29 = class173.method908(arg1, arg0);
                if (var29 != null && var29.field2846 != null) {
                    class1 var30 = new class1();
                    var30.field3 = var29;
                    var30.field1 = var29.field2846;
                    class37.method2736(var30, 200000);
                }
                field432 = var28;
                field430 = true;
                Statics.field740 = arg1;
                field431 = arg0;
                Statics.field1079 = var27;
                method239(var29);
                field458 = 0;
                String var31;
                if (class178.method2591(method878(var26)) == 0) {
                    var31 = null;
                } else if (var26.field2834 == null || var26.field2834.trim().length() == 0) {
                    var31 = null;
                } else {
                    var31 = var26.field2834;
                }
                field433 = var31;
                if (field433 == null) {
                    field433 = "Null";
                }
                if (var26.field2756) {
                    field434 = var26.field2828 + Statics.method2947(16777215);
                } else {
                    field434 = Statics.method2947(65280) + var26.field2812 + Statics.method2947(16777215);
                }
            }
            return;
        }
        if (arg2 == 18) {
            field480 = arg6;
            field385 = arg7;
            field381 = 2;
            field534 = 0;
            field314 = arg0;
            field384 = arg1;
            field312.method2612(254);
            field312.method2369(arg3);
            field312.method2390(Statics.field253 + arg0);
            field312.method2390(Statics.field2902 + arg1);
            field312.method2360(class137.field2124[82] ? 1 : 0);
        }
        if (arg2 == 41) {
            field312.method2612(53);
            field312.method2369(arg3);
            field312.method2527(arg1);
            field312.method2390(arg0);
            field388 = 0;
            Statics.field2269 = class173.method2550(arg1);
            field487 = arg0;
        }
        if (arg2 == 50) {
            class3 var32 = field337[arg3];
            if (var32 != null) {
                field480 = arg6;
                field385 = arg7;
                field381 = 2;
                field534 = 0;
                field314 = arg0;
                field384 = arg1;
                field312.method2612(244);
                field312.method2370(arg3);
                field312.method2322(class137.field2124[82] ? 1 : 0);
            }
        }
        if (arg2 == 23) {
            Statics.field3044.method1877(Statics.field575, arg0, arg1);
        }
        if (arg2 == 28) {
            field312.method2612(121);
            field312.method2327(arg1);
            class173 var33 = class173.method2550(arg1);
            if (var33.field2867 != null && var33.field2867[0][0] == 5) {
                int var34 = var33.field2867[0][1];
                class176.field2906[var34] = 1 - class176.field2906[var34];
                method2663(var34);
            }
        }
        if (arg2 == 40) {
            field312.method2612(219);
            field312.method2454(arg1);
            field312.method2369(arg3);
            field312.method2369(arg0);
            field388 = 0;
            Statics.field2269 = class173.method2550(arg1);
            field487 = arg0;
        }
        if (arg2 == 4) {
            field480 = arg6;
            field385 = arg7;
            field381 = 2;
            field534 = 0;
            field314 = arg0;
            field384 = arg1;
            field312.method2612(160);
            field312.method2360(class137.field2124[82] ? 1 : 0);
            field312.method2481(arg3 >> 14 & 0x7FFF);
            field312.method2390(Statics.field253 + arg0);
            field312.method2390(Statics.field2902 + arg1);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class173 var35 = class173.method908(arg1, arg0);
            if (var35 != null) {
                method863(arg3, arg1, arg0, var35.field2875, arg5);
            }
        }
        if (arg2 == 35) {
            field312.method2612(110);
            field312.method2520(arg1);
            field312.method2369(arg3);
            field312.method2370(arg0);
            field388 = 0;
            Statics.field2269 = class173.method2550(arg1);
            field487 = arg0;
        }
        if (arg2 == 1003) {
            field480 = arg6;
            field385 = arg7;
            field381 = 2;
            field534 = 0;
            class35 var36 = field315[arg3];
            if (var36 != null) {
                class40 var37 = var36.field778;
                if (var37.field907 != null) {
                    var37 = var37.method758();
                }
                if (var37 != null) {
                    field312.method2612(161);
                    field312.method2390(var37.field881);
                }
            }
        }
        if (arg2 == 14) {
            class3 var38 = field337[arg3];
            if (var38 != null) {
                field480 = arg6;
                field385 = arg7;
                field381 = 2;
                field534 = 0;
                field314 = arg0;
                field384 = arg1;
                field312.method2612(118);
                field312.method2481(arg3);
                field312.method2454(Statics.field1932);
                field312.method2322(class137.field2124[82] ? 1 : 0);
                field312.method2481(Statics.field1952);
                field312.method2481(Statics.field578);
            }
        }
        if (arg2 == 1) {
            field480 = arg6;
            field385 = arg7;
            field381 = 2;
            field534 = 0;
            field314 = arg0;
            field384 = arg1;
            field312.method2612(208);
            field312.method2481(Statics.field253 + arg0);
            field312.method2370(Statics.field2902 + arg1);
            field312.method2454(Statics.field1932);
            field312.method2481(arg3 >> 14 & 0x7FFF);
            field312.method2369(Statics.field1952);
            field312.method2361(class137.field2124[82] ? 1 : 0);
            field312.method2370(Statics.field578);
        }
        if (arg2 == 10) {
            class35 var39 = field315[arg3];
            if (var39 != null) {
                field480 = arg6;
                field385 = arg7;
                field381 = 2;
                field534 = 0;
                field314 = arg0;
                field384 = arg1;
                field312.method2612(250);
                field312.method2361(class137.field2124[82] ? 1 : 0);
                field312.method2390(arg3);
            }
        }
        if (arg2 == 39) {
            field312.method2612(180);
            field312.method2481(arg0);
            field312.method2481(arg3);
            field312.method2527(arg1);
            field388 = 0;
            Statics.field2269 = class173.method2550(arg1);
            field487 = arg0;
        }
        if (arg2 == 19) {
            field480 = arg6;
            field385 = arg7;
            field381 = 2;
            field534 = 0;
            field314 = arg0;
            field384 = arg1;
            field312.method2612(77);
            field312.method2481(arg3);
            field312.method2481(Statics.field2902 + arg1);
            field312.method2322(class137.field2124[82] ? 1 : 0);
            field312.method2369(Statics.field253 + arg0);
        }
        if (arg2 == 16) {
            field480 = arg6;
            field385 = arg7;
            field381 = 2;
            field534 = 0;
            field314 = arg0;
            field384 = arg1;
            field312.method2612(159);
            field312.method2369(arg3);
            field312.method2454(Statics.field1932);
            field312.method2370(Statics.field2902 + arg1);
            field312.method2390(Statics.field253 + arg0);
            field312.method2481(Statics.field578);
            field312.method2370(Statics.field1952);
            field312.method2322(class137.field2124[82] ? 1 : 0);
        }
        if (arg2 == 58) {
            class173 var40 = class173.method908(arg1, arg0);
            if (var40 != null) {
                field312.method2612(162);
                field312.method2370(arg0);
                field312.method2527(Statics.field740);
                field312.method2390(var40.field2875);
                field312.method2370(field432);
                field312.method2370(field431);
                field312.method2327(arg1);
            }
        }
        if (arg2 == 37) {
            field312.method2612(34);
            field312.method2327(arg1);
            field312.method2481(arg0);
            field312.method2370(arg3);
            field388 = 0;
            Statics.field2269 = class173.method2550(arg1);
            field487 = arg0;
        }
        if (arg2 == 9) {
            class35 var41 = field315[arg3];
            if (var41 != null) {
                field480 = arg6;
                field385 = arg7;
                field381 = 2;
                field534 = 0;
                field314 = arg0;
                field384 = arg1;
                field312.method2612(136);
                field312.method2360(class137.field2124[82] ? 1 : 0);
                field312.method2481(arg3);
            }
        }
        if (arg2 == 1001) {
            field480 = arg6;
            field385 = arg7;
            field381 = 2;
            field534 = 0;
            field314 = arg0;
            field384 = arg1;
            field312.method2612(90);
            field312.method2481(Statics.field253 + arg0);
            field312.method2362(class137.field2124[82] ? 1 : 0);
            field312.method2390(arg3 >> 14 & 0x7FFF);
            field312.method2369(Statics.field2902 + arg1);
        }
        if (arg2 == 36) {
            field312.method2612(66);
            field312.method2369(arg3);
            field312.method2527(arg1);
            field312.method2481(arg0);
            field388 = 0;
            Statics.field2269 = class173.method2550(arg1);
            field487 = arg0;
        }
        if (arg2 == 6) {
            field480 = arg6;
            field385 = arg7;
            field381 = 2;
            field534 = 0;
            field314 = arg0;
            field384 = arg1;
            field312.method2612(202);
            field312.method2481(arg3 >> 14 & 0x7FFF);
            field312.method2390(Statics.field2902 + arg1);
            field312.method2322(class137.field2124[82] ? 1 : 0);
            field312.method2481(Statics.field253 + arg0);
        }
        if (arg2 == 47) {
            class3 var42 = field337[arg3];
            if (var42 != null) {
                field480 = arg6;
                field385 = arg7;
                field381 = 2;
                field534 = 0;
                field314 = arg0;
                field384 = arg1;
                field312.method2612(36);
                field312.method2360(class137.field2124[82] ? 1 : 0);
                field312.method2370(arg3);
            }
        }
        if (field458 != 0) {
            field458 = 0;
            method239(class173.method2550(Statics.field1932));
        }
        if (field430) {
            method38();
        }
        if (Statics.field2269 != null && field388 == 0) {
            method239(Statics.field2269);
        }
    }

    @ObfuscatedName("k.ce(ILjava/lang/String;B)V")
    public static void method194(int arg0, String arg1) {
        int var2 = class33.field754;
        int[] var3 = class33.field750;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class3 var6 = field337[var3[var5]];
            if (var6 != null && Statics.field159 != var6 && var6.field58 != null && var6.field58.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field312.method2612(37);
                    field312.method2369(var3[var5]);
                    field312.method2360(0);
                } else if (arg0 == 4) {
                    field312.method2612(36);
                    field312.method2360(0);
                    field312.method2370(var3[var5]);
                } else if (arg0 == 6) {
                    field312.method2612(103);
                    field312.method2481(var3[var5]);
                    field312.method2361(0);
                } else if (arg0 == 7) {
                    field312.method2612(244);
                    field312.method2370(var3[var5]);
                    field312.method2322(0);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class12.method2960(4, "", class157.field2465 + arg1);
        }
    }

    @ObfuscatedName("u.cj(I)V")
    public static void method38() {
        if (!field430) {
            return;
        }
        class173 var0 = class173.method908(Statics.field740, field431);
        if (var0 != null && var0.field2847 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field1 = var0.field2847;
            class37.method2736(var1, 200000);
        }
        field430 = false;
        method239(var0);
    }

    @ObfuscatedName("ac.ci(IIIILjava/lang/String;I)V")
    public static void method863(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class173 var5 = class173.method908(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2819 != null) {
            class1 var6 = new class1();
            var6.field3 = var5;
            var6.field6 = arg0;
            var6.field10 = arg4;
            var6.field1 = var5.field2819;
            class37.method2736(var6, 200000);
        }
        boolean var7 = true;
        if (var5.field2771 > 0) {
            var7 = method644(var5);
        }
        if (!var7 || !class178.method570(method878(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field312.method2612(119);
            field312.method2327(arg1);
            field312.method2481(arg2);
            field312.method2481(arg3);
        }
        if (arg0 == 2) {
            field312.method2612(115);
            field312.method2327(arg1);
            field312.method2481(arg2);
            field312.method2481(arg3);
        }
        if (arg0 == 3) {
            field312.method2612(63);
            field312.method2327(arg1);
            field312.method2481(arg2);
            field312.method2481(arg3);
        }
        if (arg0 == 4) {
            field312.method2612(93);
            field312.method2327(arg1);
            field312.method2481(arg2);
            field312.method2481(arg3);
        }
        if (arg0 == 5) {
            field312.method2612(139);
            field312.method2327(arg1);
            field312.method2481(arg2);
            field312.method2481(arg3);
        }
        if (arg0 == 6) {
            field312.method2612(128);
            field312.method2327(arg1);
            field312.method2481(arg2);
            field312.method2481(arg3);
        }
        if (arg0 == 7) {
            field312.method2612(233);
            field312.method2327(arg1);
            field312.method2481(arg2);
            field312.method2481(arg3);
        }
        if (arg0 == 8) {
            field312.method2612(56);
            field312.method2327(arg1);
            field312.method2481(arg2);
            field312.method2481(arg3);
        }
        if (arg0 == 9) {
            field312.method2612(127);
            field312.method2327(arg1);
            field312.method2481(arg2);
            field312.method2481(arg3);
        }
        if (arg0 == 10) {
            field312.method2612(32);
            field312.method2327(arg1);
            field312.method2481(arg2);
            field312.method2481(arg3);
        }
    }

    @ObfuscatedName("du.cs(I)V")
    public static final void method2666() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field416 - 1; var1++) {
                if (field419[var1] < 1000 && field419[var1 + 1] > 1000) {
                    String var2 = field332[var1];
                    field332[var1] = field332[var1 + 1];
                    field332[var1 + 1] = var2;
                    String var3 = field421[var1];
                    field421[var1] = field421[var1 + 1];
                    field421[var1 + 1] = var3;
                    int var4 = field419[var1];
                    field419[var1] = field419[var1 + 1];
                    field419[var1 + 1] = var4;
                    int var5 = field417[var1];
                    field417[var1] = field417[var1 + 1];
                    field417[var1 + 1] = var5;
                    int var6 = field418[var1];
                    field418[var1] = field418[var1 + 1];
                    field418[var1 + 1] = var6;
                    int var7 = field420[var1];
                    field420[var1] = field420[var1 + 1];
                    field420[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("ch.cp(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method1929(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field415 || field416 >= 500) {
            return;
        }
        field421[field416] = arg0;
        field332[field416] = arg1;
        field419[field416] = arg2;
        field420[field416] = arg3;
        field417[field416] = arg4;
        field418[field416] = arg5;
        field416++;
    }

    @ObfuscatedName("ar.ck(I)V")
    public static void method895() {
        for (int var0 = 0; var0 < field416; var0++) {
            if (method893(field419[var0])) {
                if (var0 < field416 - 1) {
                    for (int var1 = var0; var1 < field416 - 1; var1++) {
                        field421[var1] = field421[var1 + 1];
                        field332[var1] = field332[var1 + 1];
                        field419[var1] = field419[var1 + 1];
                        field420[var1] = field420[var1 + 1];
                        field417[var1] = field417[var1 + 1];
                        field418[var1] = field418[var1 + 1];
                    }
                }
                field416--;
            }
        }
    }

    @ObfuscatedName("ar.ch(II)Z")
    public static boolean method893(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("ex.co(Lab;IIIB)V")
    public static final void method2769(class40 arg0, int arg1, int arg2, int arg3) {
        if (field416 >= 400) {
            return;
        }
        if (arg0.field907 != null) {
            arg0 = arg0.method758();
        }
        if (arg0 == null || !arg0.field883 || arg0.field910 && field443 != arg1) {
            return;
        }
        String var4 = arg0.field882;
        if (arg0.field899 != 0) {
            int var6 = arg0.field899;
            int var7 = Statics.field159.field38;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = Statics.method2947(16711680);
            } else if (var8 < -6) {
                var9 = Statics.method2947(16723968);
            } else if (var8 < -3) {
                var9 = Statics.method2947(16740352);
            } else if (var8 < 0) {
                var9 = Statics.method2947(16756736);
            } else if (var8 > 9) {
                var9 = Statics.method2947(65280);
            } else if (var8 > 6) {
                var9 = Statics.method2947(4259584);
            } else if (var8 > 3) {
                var9 = Statics.method2947(8453888);
            } else if (var8 > 0) {
                var9 = Statics.method2947(12648192);
            } else {
                var9 = Statics.method2947(16776960);
            }
            var4 = var4 + var9 + " " + class2.field30 + class157.field2506 + arg0.field899 + class2.field20;
        }
        if (field458 == 1) {
            method1929(class157.field2457, field338 + " " + class2.field25 + " " + Statics.method2947(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field430) {
            String[] var10 = arg0.field916;
            if (field446) {
                var10 = method2661(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class157.field2459)) {
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
                        method1929(var10[var11], Statics.method2947(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class157.field2459)) {
                        short var14 = 0;
                        if (field305 != class21.field566) {
                            if (field305 == class21.field563 || field305 == class21.field572 && arg0.field899 > Statics.field159.field38) {
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
                            method1929(var10[var13], Statics.method2947(16776960) + var4, var15, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method1929(class157.field2458, Statics.method2947(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1079 & 0x2) == 2) {
            method1929(field433, field434 + " " + class2.field25 + " " + Statics.method2947(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("db.cv(Lu;IIIS)V")
    public static final void method2270(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field159 == arg0 || field416 >= 400) {
            return;
        }
        String var9;
        if (arg0.field39 == 0) {
            String var4 = arg0.field37[0] + arg0.field58 + arg0.field37[1];
            int var5 = arg0.field38;
            int var6 = Statics.field159.field38;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = Statics.method2947(16711680);
            } else if (var7 < -6) {
                var8 = Statics.method2947(16723968);
            } else if (var7 < -3) {
                var8 = Statics.method2947(16740352);
            } else if (var7 < 0) {
                var8 = Statics.method2947(16756736);
            } else if (var7 > 9) {
                var8 = Statics.method2947(65280);
            } else if (var7 > 6) {
                var8 = Statics.method2947(4259584);
            } else if (var7 > 3) {
                var8 = Statics.method2947(8453888);
            } else if (var7 > 0) {
                var8 = Statics.method2947(12648192);
            } else {
                var8 = Statics.method2947(16776960);
            }
            var9 = var4 + var8 + " " + class2.field30 + class157.field2506 + arg0.field38 + class2.field20 + arg0.field37[2];
        } else {
            var9 = arg0.field37[0] + arg0.field58 + arg0.field37[1] + " " + class2.field30 + class157.field2306 + arg0.field39 + class2.field20 + arg0.field37[2];
        }
        if (field458 == 1) {
            method1929(class157.field2457, field338 + " " + class2.field25 + " " + Statics.method2947(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field430) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field403[var10] != null) {
                    short var11 = 0;
                    if (field403[var10].equalsIgnoreCase(class157.field2459)) {
                        if (field309 == class21.field566) {
                            continue;
                        }
                        if (field309 == class21.field563 || field309 == class21.field572 && arg0.field38 > Statics.field159.field38) {
                            var11 = 2000;
                        }
                        if (Statics.field159.field52 != 0 && arg0.field52 != 0) {
                            if (Statics.field159.field52 == arg0.field52) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field439[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field523[var10] + var11;
                    method1929(field403[var10], Statics.method2947(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1079 & 0x8) == 8) {
            method1929(field433, field434 + " " + class2.field25 + " " + Statics.method2947(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field416; var14++) {
            if (field419[var14] == 23) {
                field332[var14] = Statics.method2947(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("ak.cq(IIIIIIIIB)V")
    public static final void method672(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (Statics.method2271(arg0)) {
            Statics.field570 = null;
            method568(Statics.field2754[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field570 != null) {
                method568(Statics.field570, -1412584499, arg1, arg2, arg3, arg4, Statics.field1186, Statics.field2185, arg7);
                Statics.field570 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field450[var8] = true;
            }
        } else {
            field450[arg7] = true;
        }
    }

    @ObfuscatedName("j.ct([Lfa;IIIIIIIII)V")
    public static final void method568(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1645(arg2, arg3, arg4, arg5);
        class91.method1940();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class173 var10 = arg0[var9];
            if (var10 != null && (var10.field2857 == arg1 || arg1 == -1412584499 && field304 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field483[field478] = var10.field2770 + arg6;
                    field484[field478] = var10.field2826 + arg7;
                    field485[field478] = var10.field2807;
                    field486[field478] = var10.field2796;
                    var11 = ++field478 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2776 = var11;
                var10.field2887 = field288;
                if (!var10.field2756 || !Statics.method111(var10)) {
                    if (var10.field2771 > 0) {
                        Statics.method2659(var10);
                    }
                    int var12 = var10.field2770 + arg6;
                    int var13 = var10.field2826 + arg7;
                    int var14 = var10.field2787;
                    if (field304 == var10) {
                        if (arg1 != -1412584499 && !var10.field2833) {
                            Statics.field570 = arg0;
                            Statics.field1186 = arg6;
                            Statics.field2185 = arg7;
                            continue;
                        }
                        if (field294 && field453) {
                            int var15 = class140.field2144;
                            int var16 = class140.field2145;
                            int var17 = var15 - field275;
                            int var18 = var16 - field451;
                            if (var17 < field503) {
                                var17 = field503;
                            }
                            if (var10.field2807 + var17 > field503 + field449.field2807) {
                                var17 = field503 + field449.field2807 - var10.field2807;
                            }
                            if (var18 < field429) {
                                var18 = field429;
                            }
                            if (var10.field2796 + var18 > field429 + field449.field2796) {
                                var18 = field429 + field449.field2796 - var10.field2796;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2833) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2759 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2759 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2807 + var12;
                        int var26 = var10.field2796 + var13;
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
                        int var29 = var10.field2807 + var12;
                        int var30 = var10.field2796 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2756 || var19 < var21 && var20 < var22) {
                        if (var10.field2771 != 0) {
                            if (var10.field2771 == 1336) {
                                if (field509) {
                                    var13 += 15;
                                    Statics.field1034.method3808("Fps:" + field2194, var10.field2807 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field283) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field283) {
                                        var33 = 16711680;
                                    }
                                    Statics.field1034.method3808("Mem:" + var32 + "k", var10.field2807 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2771 == 1337) {
                                field423 = var12;
                                field541 = var13;
                                method192(var12, var13, var10.field2807, var10.field2796);
                                field450[var10.field2776] = true;
                                class80.method1645(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2771 == 1338) {
                                method592();
                                class175 var34 = var10.method3188(false);
                                if (var34 != null) {
                                    class80.method1645(var12, var13, var34.field2900 + var12, var34.field2898 + var13);
                                    if (field366 == 2 || field366 == 5) {
                                        class80.method1711(var12, var13, 0, var34.field2901, var34.field2903);
                                    } else {
                                        int var35 = field361 + field348 & 0x7FF;
                                        int var36 = Statics.field159.field845 / 32 + 48;
                                        int var37 = 464 - Statics.field159.field812 / 32;
                                        Statics.field274.method1578(var12, var13, var34.field2900, var34.field2898, var36, var37, var35, field350 + 256, var34.field2901, var34.field2903);
                                        for (int var38 = 0; var38 < field505; var38++) {
                                            int var39 = field506[var38] * 4 + 2 - Statics.field159.field845 / 32;
                                            int var40 = field517[var38] * 4 + 2 - Statics.field159.field812 / 32;
                                            method203(var12, var13, var39, var40, field508[var38], var34);
                                        }
                                        int var41 = 0;
                                        while (true) {
                                            if (var41 >= 104) {
                                                for (int var46 = 0; var46 < field339; var46++) {
                                                    class35 var47 = field315[field530[var46]];
                                                    if (var47 != null && var47.method18()) {
                                                        class40 var48 = var47.field778;
                                                        if (var48 != null && var48.field907 != null) {
                                                            var48 = var48.method758();
                                                        }
                                                        if (var48 != null && var48.field898 && var48.field883) {
                                                            int var49 = var47.field845 / 32 - Statics.field159.field845 / 32;
                                                            int var50 = var47.field812 / 32 - Statics.field159.field812 / 32;
                                                            method203(var12, var13, var49, var50, Statics.field1348[1], var34);
                                                        }
                                                    }
                                                }
                                                int var51 = class33.field754;
                                                int[] var52 = class33.field750;
                                                for (int var53 = 0; var53 < var51; var53++) {
                                                    class3 var54 = field337[var52[var53]];
                                                    if (var54 != null && var54.method18() && !var54.field53 && Statics.field159 != var54) {
                                                        int var55 = var54.field845 / 32 - Statics.field159.field845 / 32;
                                                        int var56 = var54.field812 / 32 - Statics.field159.field812 / 32;
                                                        boolean var57 = false;
                                                        if (method191(var54.field58, true)) {
                                                            var57 = true;
                                                        }
                                                        boolean var58 = false;
                                                        for (int var59 = 0; var59 < Statics.field148; var59++) {
                                                            if (var54.field58.equals(Statics.field1658[var59].field618)) {
                                                                var58 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var60 = false;
                                                        if (Statics.field159.field52 != 0 && var54.field52 != 0 && Statics.field159.field52 == var54.field52) {
                                                            var60 = true;
                                                        }
                                                        if (var57) {
                                                            method203(var12, var13, var55, var56, Statics.field1348[3], var34);
                                                        } else if (var60) {
                                                            method203(var12, var13, var55, var56, Statics.field1348[4], var34);
                                                        } else if (var58) {
                                                            method203(var12, var13, var55, var56, Statics.field1348[5], var34);
                                                        } else {
                                                            method203(var12, var13, var55, var56, Statics.field1348[2], var34);
                                                        }
                                                    }
                                                }
                                                if (field465 != 0 && field288 % 20 < 10) {
                                                    if (field465 == 1 && field297 >= 0 && field297 < field315.length) {
                                                        class35 var61 = field315[field297];
                                                        if (var61 != null) {
                                                            int var62 = var61.field845 / 32 - Statics.field159.field845 / 32;
                                                            int var63 = var61.field812 / 32 - Statics.field159.field812 / 32;
                                                            method201(var12, var13, var62, var63, Statics.field1607[1], var34);
                                                        }
                                                    }
                                                    if (field465 == 2) {
                                                        int var64 = field299 * 4 - Statics.field253 * 4 + 2 - Statics.field159.field845 / 32;
                                                        int var65 = field300 * 4 - Statics.field2902 * 4 + 2 - Statics.field159.field812 / 32;
                                                        method201(var12, var13, var64, var65, Statics.field1607[1], var34);
                                                    }
                                                    if (field465 == 10 && field298 >= 0 && field298 < field337.length) {
                                                        class3 var66 = field337[field298];
                                                        if (var66 != null) {
                                                            int var67 = var66.field845 / 32 - Statics.field159.field845 / 32;
                                                            int var68 = var66.field812 / 32 - Statics.field159.field812 / 32;
                                                            method201(var12, var13, var67, var68, Statics.field1607[1], var34);
                                                        }
                                                    }
                                                }
                                                if (field314 != 0) {
                                                    int var69 = field314 * 4 + 2 - Statics.field159.field845 / 32;
                                                    int var70 = field384 * 4 + 2 - Statics.field159.field812 / 32;
                                                    method203(var12, var13, var69, var70, Statics.field1607[0], var34);
                                                }
                                                if (!Statics.field159.field53) {
                                                    class80.method1697(var34.field2900 / 2 + var12 - 1, var34.field2898 / 2 + var13 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var42 = 0; var42 < 104; var42++) {
                                                class199 var43 = field552[Statics.field575][var41][var42];
                                                if (var43 != null) {
                                                    int var44 = var41 * 4 + 2 - Statics.field159.field845 / 32;
                                                    int var45 = var42 * 4 + 2 - Statics.field159.field812 / 32;
                                                    method203(var12, var13, var44, var45, Statics.field1348[0], var34);
                                                }
                                            }
                                            var41++;
                                        }
                                    }
                                    field481[var11] = true;
                                }
                                class80.method1645(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2771 == 1339) {
                                class175 var71 = var10.method3188(false);
                                if (var71 != null) {
                                    if (field366 < 3) {
                                        Statics.field2645.method1578(var12, var13, var71.field2900, var71.field2898, 25, 25, field361, 256, var71.field2901, var71.field2903);
                                    } else {
                                        class80.method1711(var12, var13, 0, var71.field2901, var71.field2903);
                                    }
                                }
                                class80.method1645(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2759 == 0) {
                            if (!var10.field2756 && Statics.method111(var10) && Statics.field2050 != var10) {
                                continue;
                            }
                            if (!var10.field2756) {
                                if (var10.field2779 > var10.field2781 - var10.field2796) {
                                    var10.field2779 = var10.field2781 - var10.field2796;
                                }
                                if (var10.field2779 < 0) {
                                    var10.field2779 = 0;
                                }
                            }
                            method568(arg0, var10.field2757, var19, var20, var21, var22, var12 - var10.field2778, var13 - var10.field2779, var11);
                            if (var10.field2879 != null) {
                                method568(var10.field2879, var10.field2757, var19, var20, var21, var22, var12 - var10.field2778, var13 - var10.field2779, var11);
                            }
                            class4 var72 = (class4) field436.method3545((long) var10.field2757);
                            if (var72 != null) {
                                method672(var72.field66, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class80.method1645(arg2, arg3, arg4, arg5);
                            class91.method1940();
                        }
                        if (field510 || field482[var11] || field447 > 1) {
                            if (var10.field2759 == 0 && !var10.field2756 && var10.field2781 > var10.field2796) {
                                method105(var10.field2807 + var12, var13, var10.field2779, var10.field2796, var10.field2781);
                            }
                            if (var10.field2759 != 1) {
                                if (var10.field2759 == 2) {
                                    int var73 = 0;
                                    for (int var74 = 0; var74 < var10.field2769; var74++) {
                                        for (int var75 = 0; var75 < var10.field2768; var75++) {
                                            int var76 = (var10.field2821 + 32) * var75 + var12;
                                            int var77 = (var10.field2822 + 32) * var74 + var13;
                                            if (var73 < 20) {
                                                var76 += var10.field2823[var73];
                                                var77 += var10.field2824[var73];
                                            }
                                            if (var10.field2873[var73] > 0) {
                                                boolean var78 = false;
                                                boolean var79 = false;
                                                int var80 = var10.field2873[var73] - 1;
                                                if (var76 + 32 > arg2 && var76 < arg4 && var77 + 32 > arg3 && var77 < arg5 || Statics.field247 == var10 && field390 == var73) {
                                                    class79 var81;
                                                    if (field458 == 1 && Statics.field578 == var73 && Statics.field1932 == var10.field2757) {
                                                        var81 = class52.method103(var80, var10.field2773[var73], 2, 0, 2, false);
                                                    } else {
                                                        var81 = class52.method103(var80, var10.field2773[var73], 1, 3153952, 2, false);
                                                    }
                                                    if (var81 == null) {
                                                        method239(var10);
                                                    } else if (Statics.field247 == var10 && field390 == var73) {
                                                        int var82 = class140.field2144 - field391;
                                                        int var83 = class140.field2145 - field392;
                                                        if (var82 < 5 && var82 > -5) {
                                                            var82 = 0;
                                                        }
                                                        if (var83 < 5 && var83 > -5) {
                                                            var83 = 0;
                                                        }
                                                        if (field395 < 5) {
                                                            var82 = 0;
                                                            var83 = 0;
                                                        }
                                                        var81.method1573(var76 + var82, var77 + var83, 128);
                                                        if (arg1 != -1) {
                                                            class173 var84 = arg0[arg1 & 0xFFFF];
                                                            if (var77 + var83 < class80.field1405 && var84.field2779 > 0) {
                                                                int var85 = field353 * (class80.field1405 - var77 - var83) / 3;
                                                                if (var85 > field353 * 10) {
                                                                    var85 = field353 * 10;
                                                                }
                                                                if (var85 > var84.field2779) {
                                                                    var85 = var84.field2779;
                                                                }
                                                                var84.field2779 -= var85;
                                                                field392 += var85;
                                                                method239(var84);
                                                            }
                                                            if (var77 + var83 + 32 > class80.field1406 && var84.field2779 < var84.field2781 - var84.field2796) {
                                                                int var86 = field353 * (var77 + var83 + 32 - class80.field1406) / 3;
                                                                if (var86 > field353 * 10) {
                                                                    var86 = field353 * 10;
                                                                }
                                                                if (var86 > var84.field2781 - var84.field2796 - var84.field2779) {
                                                                    var86 = var84.field2781 - var84.field2796 - var84.field2779;
                                                                }
                                                                var84.field2779 += var86;
                                                                field392 -= var86;
                                                                method239(var84);
                                                            }
                                                        }
                                                    } else if (Statics.field2269 == var10 && field487 == var73) {
                                                        var81.method1573(var76, var77, 128);
                                                    } else {
                                                        var81.method1553(var76, var77);
                                                    }
                                                }
                                            } else if (var10.field2866 != null && var73 < 20) {
                                                class79 var87 = var10.method3223(var73);
                                                if (var87 != null) {
                                                    var87.method1553(var76, var77);
                                                } else if (class173.field2755) {
                                                    method239(var10);
                                                }
                                            }
                                            var73++;
                                        }
                                    }
                                } else if (var10.field2759 == 3) {
                                    int var88;
                                    if (method573(var10)) {
                                        var88 = var10.field2783;
                                        if (Statics.field2050 == var10 && var10.field2785 != 0) {
                                            var88 = var10.field2785;
                                        }
                                    } else {
                                        var88 = var10.field2782;
                                        if (Statics.field2050 == var10 && var10.field2784 != 0) {
                                            var88 = var10.field2784;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2786) {
                                            class80.method1697(var12, var13, var10.field2807, var10.field2796, var88);
                                        } else {
                                            class80.method1656(var12, var13, var10.field2807, var10.field2796, var88);
                                        }
                                    } else if (var10.field2786) {
                                        class80.method1653(var12, var13, var10.field2807, var10.field2796, var88, 256 - (var14 & 0xFF));
                                    } else {
                                        class80.method1657(var12, var13, var10.field2807, var10.field2796, var88, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2759 == 4) {
                                    class224 var89 = var10.method3209();
                                    if (var89 != null) {
                                        String var90 = var10.field2815;
                                        int var91;
                                        if (method573(var10)) {
                                            var91 = var10.field2783;
                                            if (Statics.field2050 == var10 && var10.field2785 != 0) {
                                                var91 = var10.field2785;
                                            }
                                            if (var10.field2816.length() > 0) {
                                                var90 = var10.field2816;
                                            }
                                        } else {
                                            var91 = var10.field2782;
                                            if (Statics.field2050 == var10 && var10.field2784 != 0) {
                                                var91 = var10.field2784;
                                            }
                                        }
                                        if (var10.field2756 && var10.field2875 != -1) {
                                            class52 var92 = class52.method1933(var10.field2875);
                                            var90 = var92.field1105;
                                            if (var90 == null) {
                                                var90 = "null";
                                            }
                                            if ((var92.field1102 == 1 || var10.field2876 != 1) && var10.field2876 != -1) {
                                                var90 = Statics.method2947(16748608) + var90 + class2.field23 + " " + 'x' + method566(var10.field2876);
                                            }
                                        }
                                        if (field454 == var10) {
                                            class157 var10000 = (class157) null;
                                            var90 = class157.field2497;
                                            var91 = var10.field2782;
                                        }
                                        if (!var10.field2756) {
                                            var90 = method599(var90, var10);
                                        }
                                        var89.method3774(var90, var12, var13, var10.field2807, var10.field2796, var91, var10.field2764 ? 0 : -1, var10.field2818, var10.field2789, var10.field2817);
                                    } else if (class173.field2755) {
                                        method239(var10);
                                    }
                                } else if (var10.field2759 == 5) {
                                    if (var10.field2756) {
                                        class79 var94;
                                        if (var10.field2875 == -1) {
                                            var94 = var10.method3231(false);
                                        } else {
                                            var94 = class52.method103(var10.field2875, var10.field2876, var10.field2794, var10.field2795, var10.field2813, false);
                                        }
                                        if (var94 != null) {
                                            int var95 = var94.field1400;
                                            int var96 = var94.field1396;
                                            if (var10.field2761) {
                                                class80.method1649(var12, var13, var10.field2807 + var12, var10.field2796 + var13);
                                                int var97 = (var10.field2807 + (var95 - 1)) / var95;
                                                int var98 = (var10.field2796 + (var96 - 1)) / var96;
                                                for (int var99 = 0; var99 < var97; var99++) {
                                                    for (int var100 = 0; var100 < var98; var100++) {
                                                        if (var10.field2753 != 0) {
                                                            var94.method1597(var95 / 2 + var95 * var99 + var12, var96 / 2 + var96 * var100 + var13, var10.field2753, 4096);
                                                        } else if (var14 == 0) {
                                                            var94.method1553(var95 * var99 + var12, var96 * var100 + var13);
                                                        } else {
                                                            var94.method1573(var95 * var99 + var12, var96 * var100 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1645(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var101 = var10.field2807 * 4096 / var95;
                                                if (var10.field2753 != 0) {
                                                    var94.method1597(var10.field2807 / 2 + var12, var10.field2796 / 2 + var13, var10.field2753, var101);
                                                } else if (var14 != 0) {
                                                    var94.method1575(var12, var13, var10.field2807, var10.field2796, 256 - (var14 & 0xFF));
                                                } else if (var10.field2807 == var95 && var10.field2796 == var96) {
                                                    var94.method1553(var12, var13);
                                                } else {
                                                    var94.method1569(var12, var13, var10.field2807, var10.field2796);
                                                }
                                            }
                                        } else if (class173.field2755) {
                                            method239(var10);
                                        }
                                    } else {
                                        class79 var93 = var10.method3231(method573(var10));
                                        if (var93 != null) {
                                            var93.method1553(var12, var13);
                                        } else if (class173.field2755) {
                                            method239(var10);
                                        }
                                    }
                                } else if (var10.field2759 == 6) {
                                    boolean var102 = method573(var10);
                                    int var103;
                                    if (var102) {
                                        var103 = var10.field2803;
                                    } else {
                                        var103 = var10.field2862;
                                    }
                                    class105 var104 = null;
                                    int var105 = 0;
                                    if (var10.field2875 != -1) {
                                        class52 var106 = class52.method1933(var10.field2875);
                                        if (var106 != null) {
                                            class52 var107 = var106.method995(var10.field2876);
                                            var104 = var107.method994(1);
                                            if (var104 == null) {
                                                method239(var10);
                                            } else {
                                                var104.method2125();
                                                var105 = var104.field1441 / 2;
                                            }
                                        }
                                    } else if (var10.field2798 == 5) {
                                        if (var10.field2799 == 0) {
                                            var104 = field549.method3285((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var104 = Statics.field159.method14();
                                        }
                                    } else if (var103 == -1) {
                                        var104 = var10.method3217((class43) null, -1, var102, Statics.field159.field33);
                                        if (var104 == null && class173.field2755) {
                                            method239(var10);
                                        }
                                    } else {
                                        class43 var108 = class43.method774(var103);
                                        var104 = var10.method3217(var108, var10.field2877, var102, Statics.field159.field33);
                                        if (var104 == null && class173.field2755) {
                                            method239(var10);
                                        }
                                    }
                                    class91.method1999(var10.field2807 / 2 + var12, var10.field2796 / 2 + var13);
                                    int var109 = var10.field2809 * class91.field1570[var10.field2806] >> 16;
                                    int var110 = var10.field2809 * class91.field1571[var10.field2806] >> 16;
                                    if (var104 != null) {
                                        if (var10.field2756) {
                                            var104.method2125();
                                            if (var10.field2760) {
                                                var104.method2138(0, var10.field2874, var10.field2808, var10.field2806, var10.field2881, var10.field2805 + var105 + var109, var10.field2805 + var110, var10.field2809);
                                            } else {
                                                var104.method2201(0, var10.field2874, var10.field2808, var10.field2806, var10.field2881, var10.field2805 + var105 + var109, var10.field2805 + var110);
                                            }
                                        } else {
                                            var104.method2201(0, var10.field2874, 0, var10.field2806, 0, var109, var110);
                                        }
                                    }
                                    class91.method1942();
                                } else {
                                    if (var10.field2759 == 7) {
                                        class224 var111 = var10.method3209();
                                        if (var111 == null) {
                                            if (class173.field2755) {
                                                method239(var10);
                                            }
                                            continue;
                                        }
                                        int var112 = 0;
                                        for (int var113 = 0; var113 < var10.field2769; var113++) {
                                            for (int var114 = 0; var114 < var10.field2768; var114++) {
                                                if (var10.field2873[var112] > 0) {
                                                    class52 var115 = class52.method1933(var10.field2873[var112] - 1);
                                                    String var116;
                                                    if (var115.field1102 != 1 && var10.field2773[var112] == 1) {
                                                        var116 = Statics.method2947(16748608) + var115.field1105 + class2.field23;
                                                    } else {
                                                        var116 = Statics.method2947(16748608) + var115.field1105 + class2.field23 + " " + 'x' + method566(var10.field2773[var112]);
                                                    }
                                                    int var117 = (var10.field2821 + 115) * var114 + var12;
                                                    int var118 = (var10.field2822 + 12) * var113 + var13;
                                                    if (var10.field2818 == 0) {
                                                        var111.method3785(var116, var117, var118, var10.field2782, var10.field2764 ? 0 : -1);
                                                    } else if (var10.field2818 == 1) {
                                                        var111.method3788(var116, var10.field2807 / 2 + var117, var118, var10.field2782, var10.field2764 ? 0 : -1);
                                                    } else {
                                                        var111.method3808(var116, var10.field2807 + var117 - 1, var118, var10.field2782, var10.field2764 ? 0 : -1);
                                                    }
                                                }
                                                var112++;
                                            }
                                        }
                                    }
                                    if (var10.field2759 == 8 && Statics.field496 == var10 && field427 == field426) {
                                        int var119 = 0;
                                        int var120 = 0;
                                        class224 var121 = Statics.field1034;
                                        String var122 = var10.field2815;
                                        String var123 = method599(var122, var10);
                                        while (var123.length() > 0) {
                                            int var124 = var123.indexOf(class2.field29);
                                            String var125;
                                            if (var124 == -1) {
                                                var125 = var123;
                                                var123 = "";
                                            } else {
                                                var125 = var123.substring(0, var124);
                                                var123 = var123.substring(var124 + 4);
                                            }
                                            int var126 = var121.method3842(var125);
                                            if (var126 > var119) {
                                                var119 = var126;
                                            }
                                            var120 += var121.field3170 + 1;
                                        }
                                        var119 += 6;
                                        var120 += 7;
                                        int var127 = var10.field2807 + var12 - 5 - var119;
                                        int var128 = var10.field2796 + var13 + 5;
                                        if (var127 < var12 + 5) {
                                            var127 = var12 + 5;
                                        }
                                        if (var119 + var127 > arg4) {
                                            var127 = arg4 - var119;
                                        }
                                        if (var120 + var128 > arg5) {
                                            var128 = arg5 - var120;
                                        }
                                        class80.method1697(var127, var128, var119, var120, 16777120);
                                        class80.method1656(var127, var128, var119, var120, 0);
                                        String var129 = var10.field2815;
                                        int var130 = var121.field3170 + var128 + 2;
                                        String var131 = method599(var129, var10);
                                        while (var131.length() > 0) {
                                            int var132 = var131.indexOf(class2.field29);
                                            String var133;
                                            if (var132 == -1) {
                                                var133 = var131;
                                                var131 = "";
                                            } else {
                                                var133 = var131.substring(0, var132);
                                                var131 = var131.substring(var132 + 4);
                                            }
                                            var121.method3785(var133, var127 + 3, var130, 0, -1);
                                            var130 += var121.field3170 + 1;
                                        }
                                    }
                                    if (var10.field2759 == 9) {
                                        if (var10.field2788 == 1) {
                                            int var134;
                                            int var135;
                                            int var136;
                                            int var137;
                                            if (var10.field2843) {
                                                var134 = var12;
                                                var135 = var10.field2796 + var13;
                                                var136 = var10.field2807 + var12;
                                                var137 = var13;
                                            } else {
                                                var134 = var12;
                                                var135 = var13;
                                                var136 = var10.field2807 + var12;
                                                var137 = var10.field2796 + var13;
                                            }
                                            class80.method1662(var134, var135, var136, var137, var10.field2782);
                                        } else {
                                            int var138 = var10.field2807 >= 0 ? var10.field2807 : -var10.field2807;
                                            int var139 = var10.field2796 >= 0 ? var10.field2796 : -var10.field2796;
                                            int var140 = var138;
                                            if (var138 < var139) {
                                                var140 = var139;
                                            }
                                            if (var140 != 0) {
                                                int var141 = (var10.field2807 << 16) / var140;
                                                int var142 = (var10.field2796 << 16) / var140;
                                                if (var142 <= var141) {
                                                    var141 = -var141;
                                                } else {
                                                    var142 = -var142;
                                                }
                                                int var143 = var10.field2788 * var142 >> 17;
                                                int var144 = var10.field2788 * var142 + 1 >> 17;
                                                int var145 = var10.field2788 * var141 >> 17;
                                                int var146 = var10.field2788 * var141 + 1 >> 17;
                                                int var147 = var12 + var143;
                                                int var148 = var12 - var144;
                                                int var149 = var10.field2807 + var12 - var144;
                                                int var150 = var10.field2807 + var12 + var143;
                                                int var151 = var13 + var145;
                                                int var152 = var13 - var146;
                                                int var153 = var10.field2796 + var13 - var146;
                                                int var154 = var10.field2796 + var13 + var145;
                                                class91.method1948(var147, var148, var149);
                                                class91.method1951(var151, var152, var153, var147, var148, var149, var10.field2782);
                                                class91.method1948(var147, var149, var150);
                                                class91.method1951(var151, var153, var154, var147, var149, var150, var10.field2782);
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

    @ObfuscatedName("g.cm(Ljava/lang/String;Lfa;I)Ljava/lang/String;")
    public static String method599(String arg0, class173 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method9(arg1, var2 - 1);
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
                if (Statics.field255 != null) {
                    int var9 = Statics.field255.field2212;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field255.field2215 != null) {
                        var8 = (String) Statics.field255.field2215;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("j.cb(II)Ljava/lang/String;")
    public static final String method566(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field21 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + Statics.method2947(65408) + var1.substring(0, var1.length() - 8) + class157.field2468 + " " + class2.field30 + var1 + class2.field20 + class2.field23;
        } else if (var1.length() > 6) {
            return " " + Statics.method2947(16777215) + var1.substring(0, var1.length() - 4) + class157.field2470 + " " + class2.field30 + var1 + class2.field20 + class2.field23;
        } else {
            return " " + Statics.method2947(16776960) + var1 + class2.field23;
        }
    }

    @ObfuscatedName("ax.cz(Lfa;I)V")
    public static void method745(class173 arg0) {
        class173 var1 = arg0.field2857 == -1 ? null : class173.method2550(arg0.field2857);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field1146;
            var3 = Statics.field590;
        } else {
            var2 = var1.field2807;
            var3 = var1.field2796;
        }
        method2212(arg0, var2, var3, false);
        method2813(arg0, var2, var3);
    }

    @ObfuscatedName("ap.ca([Lfa;Lfa;ZB)V")
    public static void method662(class173[] arg0, class173 arg1, boolean arg2) {
        int var3 = arg1.field2780 == 0 ? arg1.field2807 : arg1.field2780;
        int var4 = arg1.field2781 == 0 ? arg1.field2796 : arg1.field2781;
        method3242(arg0, arg1.field2757, var3, var4, arg2);
        if (arg1.field2879 != null) {
            method3242(arg1.field2879, arg1.field2757, var3, var4, arg2);
        }
        class4 var5 = (class4) field436.method3545((long) arg1.field2757);
        if (var5 != null) {
            int var6 = var5.field66;
            if (Statics.method2271(var6)) {
                method3242(Statics.field2754[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2771 == 1337) {
        }
    }

    @ObfuscatedName("fm.cl([Lfa;IIIZB)V")
    public static void method3242(class173[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class173 var6 = arg0[var5];
            if (var6 != null && var6.field2857 == arg1) {
                method2212(var6, arg2, arg3, arg4);
                method2813(var6, arg2, arg3);
                if (var6.field2778 > var6.field2780 - var6.field2807) {
                    var6.field2778 = var6.field2780 - var6.field2807;
                }
                if (var6.field2778 < 0) {
                    var6.field2778 = 0;
                }
                if (var6.field2779 > var6.field2781 - var6.field2796) {
                    var6.field2779 = var6.field2781 - var6.field2796;
                }
                if (var6.field2779 < 0) {
                    var6.field2779 = 0;
                }
                if (var6.field2759 == 0) {
                    method662(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("dc.cx(Lfa;IIZI)V")
    public static void method2212(class173 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2807;
        int var5 = arg0.field2796;
        if (arg0.field2830 == 0) {
            arg0.field2807 = arg0.field2768;
        } else if (arg0.field2830 == 1) {
            arg0.field2807 = arg1 - arg0.field2768;
        } else if (arg0.field2830 == 2) {
            arg0.field2807 = arg0.field2768 * arg1 >> 14;
        }
        if (arg0.field2765 == 0) {
            arg0.field2796 = arg0.field2769;
        } else if (arg0.field2765 == 1) {
            arg0.field2796 = arg2 - arg0.field2769;
        } else if (arg0.field2765 == 2) {
            arg0.field2796 = arg0.field2769 * arg2 >> 14;
        }
        if (arg0.field2830 == 4) {
            arg0.field2807 = arg0.field2796 * arg0.field2774 / arg0.field2775;
        }
        if (arg0.field2765 == 4) {
            arg0.field2796 = arg0.field2807 * arg0.field2775 / arg0.field2774;
        }
        if (field445 && arg0.field2759 == 0) {
            if (arg0.field2796 < 5 && arg0.field2807 < 5) {
                arg0.field2796 = 5;
                arg0.field2807 = 5;
            } else {
                if (arg0.field2796 <= 0) {
                    arg0.field2796 = 5;
                }
                if (arg0.field2807 <= 0) {
                    arg0.field2807 = 5;
                }
            }
        }
        if (arg0.field2771 == 1337) {
            field347 = arg0;
        }
        if (arg3 && arg0.field2835 != null && (arg0.field2807 != var4 || arg0.field2796 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field1 = arg0.field2835;
            field410.method3589(var6);
        }
    }

    @ObfuscatedName("ee.cd(Lfa;IIB)V")
    public static void method2813(class173 arg0, int arg1, int arg2) {
        if (arg0.field2762 == 0) {
            arg0.field2770 = arg0.field2766;
        } else if (arg0.field2762 == 1) {
            arg0.field2770 = (arg1 - arg0.field2807) / 2 + arg0.field2766;
        } else if (arg0.field2762 == 2) {
            arg0.field2770 = arg1 - arg0.field2807 - arg0.field2766;
        } else if (arg0.field2762 == 3) {
            arg0.field2770 = arg0.field2766 * arg1 >> 14;
        } else if (arg0.field2762 == 4) {
            arg0.field2770 = (arg0.field2766 * arg1 >> 14) + (arg1 - arg0.field2807) / 2;
        } else {
            arg0.field2770 = arg1 - arg0.field2807 - (arg0.field2766 * arg1 >> 14);
        }
        if (arg0.field2763 == 0) {
            arg0.field2826 = arg0.field2837;
        } else if (arg0.field2763 == 1) {
            arg0.field2826 = (arg2 - arg0.field2796) / 2 + arg0.field2837;
        } else if (arg0.field2763 == 2) {
            arg0.field2826 = arg2 - arg0.field2796 - arg0.field2837;
        } else if (arg0.field2763 == 3) {
            arg0.field2826 = arg0.field2837 * arg2 >> 14;
        } else if (arg0.field2763 == 4) {
            arg0.field2826 = (arg0.field2837 * arg2 >> 14) + (arg2 - arg0.field2796) / 2;
        } else {
            arg0.field2826 = arg2 - arg0.field2796 - (arg0.field2837 * arg2 >> 14);
        }
        if (!field445 || arg0.field2759 != 0) {
            return;
        }
        if (arg0.field2770 < 0) {
            arg0.field2770 = 0;
        } else if (arg0.field2807 + arg0.field2770 > arg1) {
            arg0.field2770 = arg1 - arg0.field2807;
        }
        if (arg0.field2826 < 0) {
            arg0.field2826 = 0;
        } else if (arg0.field2826 + arg0.field2796 > arg2) {
            arg0.field2826 = arg2 - arg0.field2796;
        }
    }

    @ObfuscatedName("ae.cw(Lfa;IIIIIII)V")
    public static final void method732(class173 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field358) {
            field359 = 32;
        } else {
            field359 = 0;
        }
        field358 = false;
        if (class140.field2141 == 1 || !Statics.field977 && class140.field2141 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2779 -= 4;
                method239(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2779 += 4;
                method239(arg0);
            } else if (arg5 >= arg1 - field359 && arg5 < field359 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2779 = (arg4 - arg3) * var8 / var9;
                method239(arg0);
                field358 = true;
            }
        }
        if (field394 == 0) {
            return;
        }
        int var10 = arg0.field2807;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2779 += field394 * 45;
            method239(arg0);
        }
    }

    @ObfuscatedName("t.cf(IIIIII)V")
    public static final void method105(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field2053[0].method1714(arg0, arg1);
        Statics.field2053[1].method1714(arg0, arg1 + arg3 - 16);
        class80.method1697(arg0, arg1 + 16, 16, arg3 - 32, field533);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class80.method1697(arg0, arg1 + 16 + var6, 16, var5, field352);
        class80.method1648(arg0, arg1 + 16 + var6, var5, field357);
        class80.method1648(arg0 + 1, arg1 + 16 + var6, var5, field357);
        class80.method1658(arg0, arg1 + 16 + var6, 16, field357);
        class80.method1658(arg0, arg1 + 17 + var6, 16, field357);
        class80.method1648(arg0 + 15, arg1 + 16 + var6, var5, field356);
        class80.method1648(arg0 + 14, arg1 + 17 + var6, var5 - 1, field356);
        class80.method1658(arg0, arg1 + 15 + var6 + var5, 16, field356);
        class80.method1658(arg0 + 1, arg1 + 14 + var6 + var5, 15, field356);
    }

    @ObfuscatedName("z.cy(Lfa;I)Z")
    public static final boolean method573(class173 arg0) {
        if (arg0.field2868 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2868.length; var1++) {
            int var2 = method9(arg0, var1);
            int var3 = arg0.field2869[var1];
            if (arg0.field2868[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2868[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2868[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("e.cn(Lfa;II)I")
    public static final int method9(class173 arg0, int arg1) {
        if (arg0.field2867 == null || arg1 >= arg0.field2867.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2867[arg1];
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
                    var7 = field411[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field412[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field413[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class173 var11 = class173.method2550(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method1933(var12).field1118 || field282)) {
                        for (int var13 = 0; var13 < var11.field2873.length; var13++) {
                            if (var12 + 1 == var11.field2873[var13]) {
                                var7 += var11.field2773[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class176.field2906[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class155.field2295[field412[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class176.field2906[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field159.field38;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class155.field2294[var14]) {
                            var7 += field412[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class173 var17 = class173.method2550(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method1933(var18).field1118 || field282)) {
                        for (int var19 = 0; var19 < var17.field2873.length; var19++) {
                            if (var18 + 1 == var17.field2873[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field369;
                }
                if (var6 == 12) {
                    var7 = field455;
                }
                if (var6 == 13) {
                    int var20 = class176.field2906[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class176.method2678(var22);
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
                    var7 = (Statics.field159.field845 >> 7) + Statics.field253;
                }
                if (var6 == 19) {
                    var7 = (Statics.field159.field812 >> 7) + Statics.field2902;
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

    @ObfuscatedName("cp.cg(Lfa;IIB)V")
    public static final void method1746(class173 arg0, int arg1, int arg2) {
        if (arg0.field2797 == 1) {
            method1929(arg0.field2872, "", 24, 0, 0, arg0.field2757);
        }
        if (arg0.field2797 == 2 && !field430) {
            String var3;
            if (class178.method2591(method878(arg0)) == 0) {
                var3 = null;
            } else if (arg0.field2834 == null || arg0.field2834.trim().length() == 0) {
                var3 = null;
            } else {
                var3 = arg0.field2834;
            }
            if (var3 != null) {
                method1929(var3, Statics.method2947(65280) + arg0.field2812, 25, 0, -1, arg0.field2757);
            }
        }
        if (arg0.field2797 == 3) {
            method1929(class157.field2466, "", 26, 0, 0, arg0.field2757);
        }
        if (arg0.field2797 == 4) {
            method1929(arg0.field2872, "", 28, 0, 0, arg0.field2757);
        }
        if (arg0.field2797 == 5) {
            method1929(arg0.field2872, "", 29, 0, 0, arg0.field2757);
        }
        if (arg0.field2797 == 6 && field454 == null) {
            method1929(arg0.field2872, "", 30, 0, -1, arg0.field2757);
        }
        if (arg0.field2759 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field2796; var6++) {
                for (int var7 = 0; var7 < arg0.field2807; var7++) {
                    int var8 = (arg0.field2821 + 32) * var7;
                    int var9 = (arg0.field2822 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg0.field2823[var5];
                        var9 += arg0.field2824[var5];
                    }
                    if (arg1 >= var8 && arg2 >= var9 && arg1 < var8 + 32 && arg2 < var9 + 32) {
                        field393 = var5;
                        Statics.field2296 = arg0;
                        if (arg0.field2873[var5] > 0) {
                            class52 var10 = class52.method1933(arg0.field2873[var5] - 1);
                            if (field458 == 1 && class178.method1546(method878(arg0))) {
                                if (Statics.field1932 != arg0.field2757 || Statics.field578 != var5) {
                                    method1929(class157.field2457, field338 + " " + class2.field25 + " " + Statics.method2947(16748608) + var10.field1105, 31, var10.field1103, var5, arg0.field2757);
                                }
                            } else if (!field430 || !class178.method1546(method878(arg0))) {
                                String[] var11 = var10.field1117;
                                if (field446) {
                                    var11 = method2661(var11);
                                }
                                if (class178.method1546(method878(arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 36;
                                            } else {
                                                var13 = 37;
                                            }
                                            method1929(var11[var12], Statics.method2947(16748608) + var10.field1105, var13, var10.field1103, var5, arg0.field2757);
                                        } else if (var12 == 4) {
                                            method1929(class157.field2308, Statics.method2947(16748608) + var10.field1105, 37, var10.field1103, var5, arg0.field2757);
                                        }
                                    }
                                }
                                int var14 = method878(arg0);
                                boolean var15 = (var14 >> 31 & 0x1) != 0;
                                if (var15) {
                                    method1929(class157.field2457, Statics.method2947(16748608) + var10.field1105, 38, var10.field1103, var5, arg0.field2757);
                                }
                                class178 var10000 = (class178) null;
                                if (class178.method1546(method878(arg0)) && var11 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var11[var16] != null) {
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 33;
                                            }
                                            if (var16 == 1) {
                                                var17 = 34;
                                            }
                                            if (var16 == 2) {
                                                var17 = 35;
                                            }
                                            method1929(var11[var16], Statics.method2947(16748608) + var10.field1105, var17, var10.field1103, var5, arg0.field2757);
                                        }
                                    }
                                }
                                String[] var18 = arg0.field2793;
                                if (field446) {
                                    var18 = method2661(var18);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 39;
                                            }
                                            if (var19 == 1) {
                                                var20 = 40;
                                            }
                                            if (var19 == 2) {
                                                var20 = 41;
                                            }
                                            if (var19 == 3) {
                                                var20 = 42;
                                            }
                                            if (var19 == 4) {
                                                var20 = 43;
                                            }
                                            method1929(var18[var19], Statics.method2947(16748608) + var10.field1105, var20, var10.field1103, var5, arg0.field2757);
                                        }
                                    }
                                }
                                method1929(class157.field2458, Statics.method2947(16748608) + var10.field1105, 1005, var10.field1103, var5, arg0.field2757);
                            } else if ((Statics.field1079 & 0x10) == 16) {
                                method1929(field433, field434 + " " + class2.field25 + " " + Statics.method2947(16748608) + var10.field1105, 32, var10.field1103, var5, arg0.field2757);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field2756) {
            return;
        }
        if (field430) {
            int var21 = method878(arg0);
            boolean var22 = (var21 >> 21 & 0x1) != 0;
            if (var22 && (Statics.field1079 & 0x20) == 32) {
                method1929(field433, field434 + " " + class2.field25 + " " + arg0.field2828, 58, 0, arg0.field2758, arg0.field2757);
            }
            return;
        }
        for (int var23 = 9; var23 >= 5; var23--) {
            String var24 = method3501(arg0, var23);
            if (var24 != null) {
                method1929(var24, arg0.field2828, 1007, var23 + 1, arg0.field2758, arg0.field2757);
            }
        }
        String var25;
        if (class178.method2591(method878(arg0)) == 0) {
            var25 = null;
        } else if (arg0.field2834 == null || arg0.field2834.trim().length() == 0) {
            var25 = null;
        } else {
            var25 = arg0.field2834;
        }
        if (var25 != null) {
            method1929(var25, arg0.field2828, 25, 0, arg0.field2758, arg0.field2757);
        }
        for (int var27 = 4; var27 >= 0; var27--) {
            String var28 = method3501(arg0, var27);
            if (var28 != null) {
                method1929(var28, arg0.field2828, 57, var27 + 1, arg0.field2758, arg0.field2757);
            }
        }
        if (class178.method667(method878(arg0))) {
            method1929(class157.field2312, "", 30, 0, arg0.field2758, arg0.field2757);
        }
    }

    @ObfuscatedName("db.cr(IIIIIIIB)V")
    public static final void method2272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (Statics.method2271(arg0)) {
            method116(Statics.field2754[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("w.dk([Lfa;IIIIIIIB)V")
    public static final void method116(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class173 var9 = arg0[var8];
            if (var9 != null && (!var9.field2756 || var9.field2759 == 0 || var9.field2842 || method878(var9) != 0 || field449 == var9 || var9.field2771 == 1338) && var9.field2857 == arg1 && (!var9.field2756 || !Statics.method111(var9))) {
                int var10 = var9.field2770 + arg6;
                int var11 = var9.field2826 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2759 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2759 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2807 + var10;
                    int var19 = var9.field2796 + var11;
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
                    int var22 = var9.field2807 + var10;
                    int var23 = var9.field2796 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field304 == var9) {
                    field456 = true;
                    field457 = var10;
                    field535 = var11;
                }
                if (!var9.field2756 || var12 < var14 && var13 < var15) {
                    int var24 = class140.field2144;
                    int var25 = class140.field2145;
                    if (class140.field2150 != 0) {
                        var24 = class140.field2151;
                        var25 = class140.field2154;
                    }
                    if (var9.field2771 == 1337) {
                        if (!field287 && !field415 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field458 == 0 && !field430) {
                                method1929(class157.field2462, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class105.field1837; var28++) {
                                int var29 = class105.field1809[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field3044.method1785(Statics.field575, var30, var31, var29) >= 0) {
                                        class41 var34 = class41.method2808(var33);
                                        if (var34.field960 != null) {
                                            var34 = var34.method790();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field458 == 1) {
                                            method1929(class157.field2457, field338 + " " + class2.field25 + " " + Statics.method2947(65535) + var34.field929, 1, var29, var30, var31);
                                        } else if (!field430) {
                                            String[] var35 = var34.field949;
                                            if (field446) {
                                                var35 = method2661(var35);
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
                                                        method1929(var35[var36], Statics.method2947(65535) + var34.field929, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method1929(class157.field2458, Statics.method2947(65535) + var34.field929, 1002, var34.field926 << 14, var30, var31);
                                        } else if ((Statics.field1079 & 0x4) == 4) {
                                            method1929(field433, field434 + " " + class2.field25 + " " + Statics.method2947(65535) + var34.field929, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class35 var38 = field315[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field778.field895 == 1 && (var38.field845 & 0x7F) == 64 && (var38.field812 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field339; var39++) {
                                                class35 var40 = field315[field530[var39]];
                                                if (var40 != null && var38 != var40 && var40.field778.field895 == 1 && var38.field845 == var40.field845 && var38.field812 == var40.field812) {
                                                    method2769(var40.field778, field530[var39], var30, var31);
                                                }
                                            }
                                            int var41 = class33.field754;
                                            int[] var42 = class33.field750;
                                            for (int var43 = 0; var43 < var41; var43++) {
                                                class3 var44 = field337[var42[var43]];
                                                if (var44 != null && var38.field845 == var44.field845 && var38.field812 == var44.field812) {
                                                    method2270(var44, var42[var43], var30, var31);
                                                }
                                            }
                                        }
                                        method2769(var38.field778, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var45 = field337[var33];
                                        if (var45 == null) {
                                            continue;
                                        }
                                        if ((var45.field845 & 0x7F) == 64 && (var45.field812 & 0x7F) == 64) {
                                            for (int var46 = 0; var46 < field339; var46++) {
                                                class35 var47 = field315[field530[var46]];
                                                if (var47 != null && var47.field778.field895 == 1 && var45.field845 == var47.field845 && var45.field812 == var47.field812) {
                                                    method2769(var47.field778, field530[var46], var30, var31);
                                                }
                                            }
                                            int var48 = class33.field754;
                                            int[] var49 = class33.field750;
                                            for (int var50 = 0; var50 < var48; var50++) {
                                                class3 var51 = field337[var49[var50]];
                                                if (var51 != null && var45 != var51 && var45.field845 == var51.field845 && var45.field812 == var51.field812) {
                                                    method2270(var51, var49[var50], var30, var31);
                                                }
                                            }
                                        }
                                        if (field303 == var33) {
                                            var26 = var29;
                                        } else {
                                            method2270(var45, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class199 var52 = field552[Statics.field575][var30][var31];
                                        if (var52 != null) {
                                            for (class29 var53 = (class29) var52.method3584(); var53 != null; var53 = (class29) var52.method3586()) {
                                                class52 var54 = class52.method1933(var53.field680);
                                                if (field458 == 1) {
                                                    method1929(class157.field2457, field338 + " " + class2.field25 + " " + Statics.method2947(16748608) + var54.field1105, 16, var53.field680, var30, var31);
                                                } else if (!field430) {
                                                    String[] var55 = var54.field1106;
                                                    if (field446) {
                                                        var55 = method2661(var55);
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
                                                            method1929(var55[var56], Statics.method2947(16748608) + var54.field1105, var57, var53.field680, var30, var31);
                                                        } else if (var56 == 2) {
                                                            method1929(class157.field2505, Statics.method2947(16748608) + var54.field1105, 20, var53.field680, var30, var31);
                                                        }
                                                    }
                                                    method1929(class157.field2458, Statics.method2947(16748608) + var54.field1105, 1004, var53.field680, var30, var31);
                                                } else if ((Statics.field1079 & 0x1) == 1) {
                                                    method1929(field433, field434 + " " + class2.field25 + " " + Statics.method2947(16748608) + var54.field1105, 17, var53.field680, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var58 = var26 & 0x7F;
                                int var59 = var26 >> 7 & 0x7F;
                                class3 var60 = field337[field303];
                                method2270(var60, field303, var58, var59);
                            }
                        }
                    } else if (var9.field2771 == 1338) {
                        method160(var9, var10, var11);
                    } else {
                        if (!field415 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method1746(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2759 == 0) {
                            if (!var9.field2756 && Statics.method111(var9) && Statics.field2050 != var9) {
                                continue;
                            }
                            method116(arg0, var9.field2757, var12, var13, var14, var15, var10 - var9.field2778, var11 - var9.field2779);
                            if (var9.field2879 != null) {
                                method116(var9.field2879, var9.field2757, var12, var13, var14, var15, var10 - var9.field2778, var11 - var9.field2779);
                            }
                            class4 var61 = (class4) field436.method3545((long) var9.field2757);
                            if (var61 != null) {
                                if (var61.field64 == 0 && class140.field2144 >= var12 && class140.field2145 >= var13 && class140.field2144 < var14 && class140.field2145 < var15 && !field415 && !field445) {
                                    for (class1 var62 = (class1) field410.method3581(); var62 != null; var62 = (class1) field410.method3583()) {
                                        if (var62.field2) {
                                            var62.method3670();
                                            var62.field3.field2750 = false;
                                        }
                                    }
                                    if (Statics.field143 == 0) {
                                        field304 = null;
                                        field449 = null;
                                    }
                                    if (!field415) {
                                        field421[0] = class157.field2543;
                                        field332[0] = "";
                                        field419[0] = 1006;
                                        field416 = 1;
                                    }
                                }
                                method2272(var61.field66, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2756) {
                            if (var9.field2820) {
                                if (class140.field2144 >= var12 && class140.field2145 >= var13 && class140.field2144 < var14 && class140.field2145 < var15) {
                                    for (class1 var63 = (class1) field410.method3581(); var63 != null; var63 = (class1) field410.method3583()) {
                                        if (var63.field2) {
                                            var63.method3670();
                                            var63.field3.field2750 = false;
                                        }
                                    }
                                    if (Statics.field143 == 0) {
                                        field304 = null;
                                        field449 = null;
                                    }
                                    if (!field415) {
                                        field421[0] = class157.field2543;
                                        field332[0] = "";
                                        field419[0] = 1006;
                                        field416 = 1;
                                    }
                                }
                            } else if (var9.field2889 && class140.field2144 >= var12 && class140.field2145 >= var13 && class140.field2144 < var14 && class140.field2145 < var15) {
                                for (class1 var64 = (class1) field410.method3581(); var64 != null; var64 = (class1) field410.method3583()) {
                                    if (var64.field2 && var64.field3.field2886 == var64.field1) {
                                        var64.method3670();
                                    }
                                }
                            }
                            boolean var65;
                            if (class140.field2144 >= var12 && class140.field2145 >= var13 && class140.field2144 < var14 && class140.field2145 < var15) {
                                var65 = true;
                            } else {
                                var65 = false;
                            }
                            boolean var66 = false;
                            if ((class140.field2141 == 1 || !Statics.field977 && class140.field2141 == 4) && var65) {
                                var66 = true;
                            }
                            boolean var67 = false;
                            if ((class140.field2150 == 1 || !Statics.field977 && class140.field2150 == 4) && class140.field2151 >= var12 && class140.field2154 >= var13 && class140.field2151 < var14 && class140.field2154 < var15) {
                                var67 = true;
                            }
                            if (var67) {
                                method746(var9, class140.field2151 - var10, class140.field2154 - var11);
                            }
                            if (field304 != null && field304 != var9 && var65) {
                                int var68 = method878(var9);
                                boolean var69 = (var68 >> 20 & 0x1) != 0;
                                if (var69) {
                                    field452 = var9;
                                }
                            }
                            if (field449 == var9) {
                                field453 = true;
                                field503 = var10;
                                field429 = var11;
                            }
                            if (var9.field2842) {
                                if (var65 && field394 != 0 && var9.field2886 != null) {
                                    class1 var70 = new class1();
                                    var70.field2 = true;
                                    var70.field3 = var9;
                                    var70.field5 = field394;
                                    var70.field1 = var9.field2886;
                                    field410.method3589(var70);
                                }
                                if (field304 != null || Statics.field247 != null || field415) {
                                    var67 = false;
                                    var66 = false;
                                    var65 = false;
                                }
                                if (!var9.field2748 && var67) {
                                    var9.field2748 = true;
                                    if (var9.field2804 != null) {
                                        class1 var71 = new class1();
                                        var71.field2 = true;
                                        var71.field3 = var9;
                                        var71.field8 = class140.field2151 - var10;
                                        var71.field5 = class140.field2154 - var11;
                                        var71.field1 = var9.field2804;
                                        field410.method3589(var71);
                                    }
                                }
                                if (var9.field2748 && var66 && var9.field2838 != null) {
                                    class1 var72 = new class1();
                                    var72.field2 = true;
                                    var72.field3 = var9;
                                    var72.field8 = class140.field2144 - var10;
                                    var72.field5 = class140.field2145 - var11;
                                    var72.field1 = var9.field2838;
                                    field410.method3589(var72);
                                }
                                if (var9.field2748 && !var66) {
                                    var9.field2748 = false;
                                    if (var9.field2880 != null) {
                                        class1 var73 = new class1();
                                        var73.field2 = true;
                                        var73.field3 = var9;
                                        var73.field8 = class140.field2144 - var10;
                                        var73.field5 = class140.field2145 - var11;
                                        var73.field1 = var9.field2880;
                                        field476.method3589(var73);
                                    }
                                }
                                if (var66 && var9.field2840 != null) {
                                    class1 var74 = new class1();
                                    var74.field2 = true;
                                    var74.field3 = var9;
                                    var74.field8 = class140.field2144 - var10;
                                    var74.field5 = class140.field2145 - var11;
                                    var74.field1 = var9.field2840;
                                    field410.method3589(var74);
                                }
                                if (!var9.field2750 && var65) {
                                    var9.field2750 = true;
                                    if (var9.field2841 != null) {
                                        class1 var75 = new class1();
                                        var75.field2 = true;
                                        var75.field3 = var9;
                                        var75.field8 = class140.field2144 - var10;
                                        var75.field5 = class140.field2145 - var11;
                                        var75.field1 = var9.field2841;
                                        field410.method3589(var75);
                                    }
                                }
                                if (var9.field2750 && var65 && var9.field2856 != null) {
                                    class1 var76 = new class1();
                                    var76.field2 = true;
                                    var76.field3 = var9;
                                    var76.field8 = class140.field2144 - var10;
                                    var76.field5 = class140.field2145 - var11;
                                    var76.field1 = var9.field2856;
                                    field410.method3589(var76);
                                }
                                if (var9.field2750 && !var65) {
                                    var9.field2750 = false;
                                    if (var9.field2772 != null) {
                                        class1 var77 = new class1();
                                        var77.field2 = true;
                                        var77.field3 = var9;
                                        var77.field8 = class140.field2144 - var10;
                                        var77.field5 = class140.field2145 - var11;
                                        var77.field1 = var9.field2772;
                                        field476.method3589(var77);
                                    }
                                }
                                if (var9.field2854 != null) {
                                    class1 var78 = new class1();
                                    var78.field3 = var9;
                                    var78.field1 = var9.field2854;
                                    field475.method3589(var78);
                                }
                                if (var9.field2848 != null && field370 > var9.field2810) {
                                    if (var9.field2849 == null || field370 - var9.field2810 > 32) {
                                        class1 var83 = new class1();
                                        var83.field3 = var9;
                                        var83.field1 = var9.field2848;
                                        field410.method3589(var83);
                                    } else {
                                        label768: for (int var79 = var9.field2810; var79 < field370; var79++) {
                                            int var80 = field317[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var9.field2849.length; var81++) {
                                                if (var9.field2849[var81] == var80) {
                                                    class1 var82 = new class1();
                                                    var82.field3 = var9;
                                                    var82.field1 = var9.field2848;
                                                    field410.method3589(var82);
                                                    break label768;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2810 = field370;
                                }
                                if (var9.field2861 != null && field464 > var9.field2884) {
                                    if (var9.field2851 == null || field464 - var9.field2884 > 32) {
                                        class1 var88 = new class1();
                                        var88.field3 = var9;
                                        var88.field1 = var9.field2861;
                                        field410.method3589(var88);
                                    } else {
                                        label744: for (int var84 = var9.field2884; var84 < field464; var84++) {
                                            int var85 = field463[var84 & 0x1F];
                                            for (int var86 = 0; var86 < var9.field2851.length; var86++) {
                                                if (var9.field2851[var86] == var85) {
                                                    class1 var87 = new class1();
                                                    var87.field3 = var9;
                                                    var87.field1 = var9.field2861;
                                                    field410.method3589(var87);
                                                    break label744;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2884 = field464;
                                }
                                if (var9.field2852 != null && field466 > var9.field2767) {
                                    if (var9.field2853 == null || field466 - var9.field2767 > 32) {
                                        class1 var93 = new class1();
                                        var93.field3 = var9;
                                        var93.field1 = var9.field2852;
                                        field410.method3589(var93);
                                    } else {
                                        label720: for (int var89 = var9.field2767; var89 < field466; var89++) {
                                            int var90 = field474[var89 & 0x1F];
                                            for (int var91 = 0; var91 < var9.field2853.length; var91++) {
                                                if (var9.field2853[var91] == var90) {
                                                    class1 var92 = new class1();
                                                    var92.field3 = var9;
                                                    var92.field1 = var9.field2852;
                                                    field410.method3589(var92);
                                                    break label720;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2767 = field466;
                                }
                                if (field559 > var9.field2882 && var9.field2827 != null) {
                                    class1 var94 = new class1();
                                    var94.field3 = var9;
                                    var94.field1 = var9.field2827;
                                    field410.method3589(var94);
                                }
                                if (field468 > var9.field2882 && var9.field2859 != null) {
                                    class1 var95 = new class1();
                                    var95.field3 = var9;
                                    var95.field1 = var9.field2859;
                                    field410.method3589(var95);
                                }
                                if (field469 > var9.field2882 && var9.field2860 != null) {
                                    class1 var96 = new class1();
                                    var96.field3 = var9;
                                    var96.field1 = var9.field2860;
                                    field410.method3589(var96);
                                }
                                if (field471 > var9.field2882 && var9.field2865 != null) {
                                    class1 var97 = new class1();
                                    var97.field3 = var9;
                                    var97.field1 = var9.field2865;
                                    field410.method3589(var97);
                                }
                                if (field378 > var9.field2882 && var9.field2825 != null) {
                                    class1 var98 = new class1();
                                    var98.field3 = var9;
                                    var98.field1 = var9.field2825;
                                    field410.method3589(var98);
                                }
                                if (field472 > var9.field2882 && var9.field2885 != null) {
                                    class1 var99 = new class1();
                                    var99.field3 = var9;
                                    var99.field1 = var9.field2885;
                                    field410.method3589(var99);
                                }
                                var9.field2882 = field460;
                                if (var9.field2858 != null) {
                                    for (int var100 = 0; var100 < field367; var100++) {
                                        class1 var101 = new class1();
                                        var101.field3 = var9;
                                        var101.field16 = field500[var100];
                                        var101.field9 = field499[var100];
                                        var101.field1 = var9.field2858;
                                        field410.method3589(var101);
                                    }
                                }
                            }
                        }
                        if (!var9.field2756 && field304 == null && Statics.field247 == null && !field415) {
                            if ((var9.field2870 >= 0 || var9.field2784 != 0) && class140.field2144 >= var12 && class140.field2145 >= var13 && class140.field2144 < var14 && class140.field2145 < var15) {
                                if (var9.field2870 >= 0) {
                                    Statics.field2050 = arg0[var9.field2870];
                                } else {
                                    Statics.field2050 = var9;
                                }
                            }
                            if (var9.field2759 == 8 && class140.field2144 >= var12 && class140.field2145 >= var13 && class140.field2144 < var14 && class140.field2145 < var15) {
                                Statics.field496 = var9;
                            }
                            if (var9.field2781 > var9.field2796) {
                                method732(var9, var9.field2807 + var10, var11, var9.field2796, var9.field2781, class140.field2144, class140.field2145);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("k.dc(III)V")
    public static final void method193(int arg0, int arg1) {
        if (Statics.method2271(arg0)) {
            method4(Statics.field2754[arg0], arg1);
        }
    }

    @ObfuscatedName("e.da([Lfa;IB)V")
    public static final void method4(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2759 == 0) {
                    if (var3.field2879 != null) {
                        method4(var3.field2879, arg1);
                    }
                    class4 var4 = (class4) field436.method3545((long) var3.field2757);
                    if (var4 != null) {
                        method193(var4.field66, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2802 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field1 = var3.field2802;
                    class37.method2736(var5, 200000);
                }
                if (arg1 == 1 && var3.field2863 != null) {
                    if (var3.field2758 >= 0) {
                        class173 var6 = class173.method2550(var3.field2757);
                        if (var6 == null || var6.field2879 == null || var3.field2758 >= var6.field2879.length || var6.field2879[var3.field2758] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field1 = var3.field2863;
                    class37.method2736(var7, 200000);
                }
            }
        }
    }

    @ObfuscatedName("ax.dl(Lfa;III)V")
    public static final void method746(class173 arg0, int arg1, int arg2) {
        if (field304 != null || field415 || arg0 == null || method1512(arg0) == null) {
            return;
        }
        field304 = arg0;
        field449 = method1512(arg0);
        field275 = arg1;
        field451 = arg2;
        Statics.field143 = 0;
        field294 = false;
        if (field416 > 0) {
            method2915(field416 - 1);
        }
    }

    @ObfuscatedName("ao.dg(I)V")
    public static final void method713() {
        method239(field304);
        Statics.field143++;
        if (field456 && field453) {
            int var0 = class140.field2144;
            int var1 = class140.field2145;
            int var2 = var0 - field275;
            int var3 = var1 - field451;
            if (var2 < field503) {
                var2 = field503;
            }
            if (field304.field2807 + var2 > field503 + field449.field2807) {
                var2 = field503 + field449.field2807 - field304.field2807;
            }
            if (var3 < field429) {
                var3 = field429;
            }
            if (field304.field2796 + var3 > field429 + field449.field2796) {
                var3 = field429 + field449.field2796 - field304.field2796;
            }
            int var4 = var2 - field457;
            int var5 = var3 - field535;
            int var6 = field304.field2831;
            if (Statics.field143 > field304.field2832 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field294 = true;
            }
            int var7 = field449.field2778 + (var2 - field503);
            int var8 = field449.field2779 + (var3 - field429);
            if (field304.field2844 != null && field294) {
                class1 var9 = new class1();
                var9.field3 = field304;
                var9.field8 = var7;
                var9.field5 = var8;
                var9.field1 = field304.field2844;
                class37.method2736(var9, 200000);
            }
            if (class140.field2141 == 0) {
                if (field294) {
                    if (field304.field2792 != null) {
                        class1 var10 = new class1();
                        var10.field3 = field304;
                        var10.field8 = var7;
                        var10.field5 = var8;
                        var10.field7 = field452;
                        var10.field1 = field304.field2792;
                        class37.method2736(var10, 200000);
                    }
                    if (field452 != null && method2253(field304) != null) {
                        field312.method2612(137);
                        field312.method2520(field452.field2757);
                        field312.method2390(field304.field2875);
                        field312.method2390(field452.field2758);
                        field312.method2520(field304.field2757);
                        field312.method2481(field304.field2758);
                        field312.method2370(field452.field2875);
                    }
                } else {
                    label99: {
                        label72: {
                            if (field526 != 1) {
                                int var11 = field416 - 1;
                                boolean var12;
                                if (var11 < 0) {
                                    var12 = false;
                                } else {
                                    int var13 = field419[var11];
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
                            if (field416 > 2) {
                                method1937(field457 + field275, field535 + field451);
                                break label99;
                            }
                        }
                        if (field416 > 0) {
                            method744(field457 + field275, field535 + field451);
                        }
                    }
                }
                field304 = null;
            }
        } else if (Statics.field143 > 1) {
            field304 = null;
        }
    }

    @ObfuscatedName("ew.dr(IS)V")
    public static void method2915(int arg0) {
        Statics.field589 = new class31();
        Statics.field589.field699 = field417[arg0];
        Statics.field589.field703 = field418[arg0];
        Statics.field589.field700 = field419[arg0];
        Statics.field589.field701 = field420[arg0];
        Statics.field589.field709 = field421[arg0];
    }

    @ObfuscatedName("ax.de(III)V")
    public static void method744(int arg0, int arg1) {
        class31 var2 = Statics.field589;
        method733(var2.field699, var2.field703, var2.field700, var2.field701, var2.field709, var2.field709, arg0, arg1);
        Statics.field589 = null;
    }

    @ObfuscatedName("i.dx(Lfa;I)V")
    public static void method239(class173 arg0) {
        if (field479 == arg0.field2887) {
            field450[arg0.field2776] = true;
        }
    }

    @ObfuscatedName("cn.ds(I)V")
    public static void method2115() {
        for (class4 var0 = (class4) field436.method3548(); var0 != null; var0 = (class4) field436.method3546()) {
            int var1 = var0.field66;
            if (Statics.method2271(var1)) {
                boolean var2 = true;
                class173[] var3 = Statics.field2754[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2756;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3113;
                    class173 var6 = class173.method2550(var5);
                    if (var6 != null) {
                        method239(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bs.db(Lfa;I)Lfa;")
    public static class173 method1512(class173 arg0) {
        class173 var1 = method2253(arg0);
        if (var1 == null) {
            var1 = arg0.field2888;
        }
        return var1;
    }

    @ObfuscatedName("dq.dd([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method2661(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("ep.dv(II)V")
    public static final void method2946(int arg0) {
        if (!Statics.method2271(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2754[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3 != null) {
                var3.field2877 = 0;
                var3.field2878 = 0;
            }
        }
    }

    @ObfuscatedName("es.dy([Lfa;II)V")
    public static final void method2954(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null && var3.field2857 == arg1 && (!var3.field2756 || !Statics.method111(var3))) {
                if (var3.field2759 == 0) {
                    if (!var3.field2756 && Statics.method111(var3) && Statics.field2050 != var3) {
                        continue;
                    }
                    method2954(arg0, var3.field2757);
                    if (var3.field2879 != null) {
                        method2954(var3.field2879, var3.field2757);
                    }
                    class4 var4 = (class4) field436.method3545((long) var3.field2757);
                    if (var4 != null) {
                        int var5 = var4.field66;
                        if (Statics.method2271(var5)) {
                            method2954(Statics.field2754[var5], -1);
                        }
                    }
                }
                if (var3.field2759 == 6) {
                    if (var3.field2862 != -1 || var3.field2803 != -1) {
                        boolean var6 = method573(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2803;
                        } else {
                            var7 = var3.field2862;
                        }
                        if (var7 != -1) {
                            class43 var8 = class43.method774(var7);
                            var3.field2878 += field353;
                            while (var3.field2878 > var8.field986[var3.field2877]) {
                                var3.field2878 -= var8.field986[var3.field2877];
                                var3.field2877++;
                                if (var3.field2877 >= var8.field984.length) {
                                    var3.field2877 -= var8.field992;
                                    if (var3.field2877 < 0 || var3.field2877 >= var8.field984.length) {
                                        var3.field2877 = 0;
                                    }
                                }
                                method239(var3);
                            }
                        }
                    }
                    if (var3.field2811 != 0 && !var3.field2756) {
                        int var9 = var3.field2811 >> 16;
                        int var10 = var3.field2811 << 16 >> 16;
                        int var11 = field353 * var9;
                        int var12 = field353 * var10;
                        var3.field2806 = var3.field2806 + var11 & 0x7FF;
                        var3.field2874 = var3.field2874 + var12 & 0x7FF;
                        method239(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("du.dj(II)V")
    public static final void method2663(int arg0) {
        method2115();
        class24.method112();
        int var1 = class53.method3502(arg0).field1151;
        if (var1 == 0) {
            return;
        }
        int var2 = class176.field2906[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class91.method1943(0.9D);
                ((class95) Statics.field1567).method2024(0.9D);
            }
            if (var2 == 2) {
                class91.method1943(0.8D);
                ((class95) Statics.field1567).method2024(0.8D);
            }
            if (var2 == 3) {
                class91.method1943(0.7D);
                ((class95) Statics.field1567).method2024(0.7D);
            }
            if (var2 == 4) {
                class91.method1943(0.6D);
                ((class95) Statics.field1567).method2024(0.6D);
            }
            class52.field1130.method3522();
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
            if (field302 != var3) {
                if (field302 == 0 && field362 != -1) {
                    class183.method2959(Statics.field2277, field362, 0, var3, false);
                    field514 = false;
                } else if (var3 == 0) {
                    class183.method2250();
                    field514 = false;
                } else {
                    class183.method978(var3);
                }
                field302 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field306 = 127;
            }
            if (var2 == 1) {
                field306 = 96;
            }
            if (var2 == 2) {
                field306 = 64;
            }
            if (var2 == 3) {
                field306 = 32;
            }
            if (var2 == 4) {
                field306 = 0;
            }
        }
        if (var1 == 5) {
            field526 = var2;
        }
        if (var1 == 6) {
            field437 = var2;
        }
        if (var1 == 9) {
            field438 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field516 = 127;
            }
            if (var2 == 1) {
                field516 = 96;
            }
            if (var2 == 2) {
                field516 = 64;
            }
            if (var2 == 3) {
                field516 = 32;
            }
            if (var2 == 4) {
                field516 = 0;
            }
        }
        if (var1 == 17) {
            field443 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class21[] var4 = new class21[] { class21.field566, class21.field563, class21.field572, class21.field564 };
            field309 = (class21) class109.method1468(var4, var2);
            if (field309 == null) {
                field309 = class21.field572;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field303 = -1;
            } else {
                field303 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class21[] var5 = new class21[] { class21.field566, class21.field563, class21.field572, class21.field564 };
        field305 = (class21) class109.method1468(var5, var2);
        if (field305 == null) {
            field305 = class21.field572;
        }
    }

    @ObfuscatedName("de.dp(I)V")
    public static final void method2263() {
        field312.method2612(81);
        for (class4 var0 = (class4) field436.method3548(); var0 != null; var0 = (class4) field436.method3546()) {
            if (var0.field64 == 0 || var0.field64 == 3) {
                method2590(var0, true);
            }
        }
        if (field454 != null) {
            method239(field454);
            field454 = null;
        }
    }

    @ObfuscatedName("dl.dw(IIII)Lb;")
    public static final class4 method2255(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field66 = arg1;
        var3.field64 = arg2;
        field436.method3544(var3, (long) arg0);
        method2946(arg1);
        class173 var4 = class173.method2550(arg0);
        method239(var4);
        if (field454 != null) {
            method239(field454);
            field454 = null;
        }
        for (int var5 = 0; var5 < field416; var5++) {
            if (method893(field419[var5])) {
                if (var5 < field416 - 1) {
                    for (int var6 = var5; var6 < field416 - 1; var6++) {
                        field421[var6] = field421[var6 + 1];
                        field332[var6] = field332[var6 + 1];
                        field419[var6] = field419[var6 + 1];
                        field420[var6] = field420[var6 + 1];
                        field417[var6] = field417[var6 + 1];
                        field418[var6] = field418[var6 + 1];
                    }
                }
                field416--;
            }
        }
        method662(Statics.field2754[arg0 >> 16], var4, false);
        class37.method1743(arg1);
        if (field379 != -1) {
            method193(field379, 1);
        }
        return var3;
    }

    @ObfuscatedName("dw.dm(Lb;ZS)V")
    public static final void method2590(class4 arg0, boolean arg1) {
        int var2 = arg0.field66;
        int var3 = (int) arg0.field3113;
        arg0.method3670();
        if (arg1) {
            class173.method3037(var2);
        }
        for (class201 var4 = (class201) field477.method3548(); var4 != null; var4 = (class201) field477.method3546()) {
            if ((var4.field3113 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method3670();
            }
        }
        class173 var5 = class173.method2550(var3);
        if (var5 != null) {
            method239(var5);
        }
        method895();
        if (field379 != -1) {
            method193(field379, 1);
        }
    }

    @ObfuscatedName("ah.dt(Lfa;S)Z")
    public static final boolean method644(class173 arg0) {
        int var1 = arg0.field2771;
        if (var1 == 205) {
            field330 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field549.method3265(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field549.method3278(var4, var5 == 1);
        }
        if (var1 == 324) {
            field549.method3266(false);
        }
        if (var1 == 325) {
            field549.method3266(true);
        }
        if (var1 == 326) {
            field312.method2612(140);
            field549.method3267(field312);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("r.dh(IIIILcu;Lff;I)V")
    public static final void method201(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method203(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field361 + field348 & 0x7FF;
        int var8 = class91.field1570[var7];
        int var9 = class91.field1571[var7];
        int var10 = var8 * 256 / (field350 + 256);
        int var11 = var9 * 256 / (field350 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field221.method1619(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("r.dn(IIIILcu;Lff;B)V")
    public static final void method203(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field361 + field348 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class91.field1570[var6];
        int var9 = class91.field1571[var6];
        int var10 = var8 * 256 / (field350 + 256);
        int var11 = var9 * 256 / (field350 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1577(arg5.field2900 / 2 + var12 - arg4.field1400 / 2, arg5.field2898 / 2 - var13 - arg4.field1396 / 2, arg0, arg1, arg5.field2900, arg5.field2898, arg5.field2901, arg5.field2903);
        } else {
            arg4.method1553(arg5.field2900 / 2 + arg0 + var12 - arg4.field1400 / 2, arg5.field2898 / 2 + arg1 - var13 - arg4.field1396 / 2);
        }
    }

    @ObfuscatedName("a.dz(Ljava/lang/String;ZI)Z")
    public static boolean method191(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class164.method928(arg0, Statics.field281);
        for (int var3 = 0; var3 < field293; var3++) {
            if (var2.equalsIgnoreCase(class164.method928(field545[var3].field239, Statics.field281)) && (!arg1 || field545[var3].field236 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class164.method928(Statics.field159.field58, Statics.field281))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("s.do(Ljava/lang/String;I)Z")
    public static boolean method83(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class164.method928(arg0, Statics.field281);
        for (int var2 = 0; var2 < field547; var2++) {
            class8 var3 = field548[var2];
            if (var1.equalsIgnoreCase(class164.method928(var3.field124, Statics.field281))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class164.method928(var3.field123, Statics.field281))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("e.df(Ljava/lang/String;I)V")
    public static final void method5(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field293 < 200 || field399 == 1) || field293 >= 400) {
            class12.method2960(30, "", class157.field2473);
            return;
        }
        String var1 = class164.method928(arg0, Statics.field281);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field293; var2++) {
            class18 var3 = field545[var2];
            String var4 = class164.method928(var3.field239, Statics.field281);
            if (var4 != null && var4.equals(var1)) {
                class12.method2960(30, "", arg0 + class157.field2541);
                return;
            }
            if (var3.field234 != null) {
                String var5 = class164.method928(var3.field234, Statics.field281);
                if (var5 != null && var5.equals(var1)) {
                    class12.method2960(30, "", arg0 + class157.field2541);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field547; var6++) {
            class8 var7 = field548[var6];
            String var8 = class164.method928(var7.field124, Statics.field281);
            if (var8 != null && var8.equals(var1)) {
                class12.method2960(30, "", class157.field2479 + arg0 + class157.field2555);
                return;
            }
            if (var7.field123 != null) {
                String var9 = class164.method928(var7.field123, Statics.field281);
                if (var9 != null && var9.equals(var1)) {
                    class12.method2960(30, "", class157.field2479 + arg0 + class157.field2555);
                    return;
                }
            }
        }
        if (class164.method928(Statics.field159.field58, Statics.field281).equals(var1)) {
            class12.method2960(30, "", class157.field2314);
        } else {
            field312.method2612(97);
            field312.method2322(Statics.method2215(arg0));
            field312.method2328(arg0);
        }
    }

    @ObfuscatedName("da.dq(Ljava/lang/String;ZI)V")
    public static final void method2217(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field547 < 100 || field399 == 1) || field547 >= 400) {
            class12.method2960(31, "", class157.field2475);
            return;
        }
        String var2 = class164.method928(arg0, Statics.field281);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field547; var3++) {
            class8 var4 = field548[var3];
            String var5 = class164.method928(var4.field124, Statics.field281);
            if (var5 != null && var5.equals(var2)) {
                class12.method2960(31, "", arg0 + class157.field2476);
                return;
            }
            if (var4.field123 != null) {
                String var6 = class164.method928(var4.field123, Statics.field281);
                if (var6 != null && var6.equals(var2)) {
                    class12.method2960(31, "", arg0 + class157.field2476);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field293; var7++) {
            class18 var8 = field545[var7];
            String var9 = class164.method928(var8.field239, Statics.field281);
            if (var9 != null && var9.equals(var2)) {
                class12.method2960(31, "", class157.field2481 + arg0 + class157.field2482);
                return;
            }
            if (var8.field234 != null) {
                String var10 = class164.method928(var8.field234, Statics.field281);
                if (var10 != null && var10.equals(var2)) {
                    class12.method2960(31, "", class157.field2481 + arg0 + class157.field2482);
                    return;
                }
            }
        }
        if (class164.method928(Statics.field159.field58, Statics.field281).equals(var2)) {
            class12.method2960(31, "", class157.field2478);
        } else {
            field312.method2612(252);
            field312.method2322(Statics.method2215(arg0));
            field312.method2328(arg0);
        }
    }

    @ObfuscatedName("f.du(Ljava/lang/String;I)V")
    public static final void method170(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class164.method928(arg0, Statics.field281);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field547; var2++) {
            class8 var3 = field548[var2];
            String var4 = var3.field124;
            String var5 = class164.method928(var4, Statics.field281);
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
                    field548[var7] = field548[var7 + 1];
                }
                field468 = field460;
                field312.method2612(58);
                field312.method2322(Statics.method2215(arg0));
                field312.method2328(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("r.en(Ljava/lang/String;B)V")
    public static final void method197(String arg0) {
        if (Statics.field1658 != null) {
            field312.method2612(26);
            field312.method2322(Statics.method2215(arg0));
            field312.method2328(arg0);
        }
    }

    @ObfuscatedName("a.eu(Ljava/lang/String;I)V")
    public static final void method190(String arg0) {
        if (!arg0.equals("")) {
            field312.method2612(146);
            field312.method2322(Statics.method2215(arg0));
            field312.method2328(arg0);
        }
    }

    @ObfuscatedName("em.eb(I)V")
    public static final void method2806() {
        field312.method2612(146);
        field312.method2322(0);
    }

    @ObfuscatedName("ac.eh(Lfa;B)I")
    public static int method878(class173 arg0) {
        class201 var1 = (class201) field477.method3545(((long) arg0.field2757 << 32) + (long) arg0.field2758);
        return var1 == null ? arg0.field2790 : var1.field3098;
    }

    @ObfuscatedName("dl.ed(Lfa;I)Lfa;")
    public static class173 method2253(class173 arg0) {
        int var1 = class178.method2274(method878(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class173.method2550(arg0.field2857);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("gj.eg(Lfa;IB)Ljava/lang/String;")
    public static String method3501(class173 arg0, int arg1) {
        if (!class178.method570(method878(arg0), arg1) && arg0.field2819 == null) {
            return null;
        } else if (arg0.field2829 == null || arg0.field2829.length <= arg1 || arg0.field2829[arg1] == null || arg0.field2829[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2829[arg1];
        }
    }

    @ObfuscatedName("es.ex(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method2953(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field280 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field280 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field280 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field280 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field280 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field285 != null) {
            var3 = "/p=" + Statics.field285;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field284 + "/a=" + Statics.field808 + var3 + "/";
    }

    @ObfuscatedName("l.ef(Ljava/lang/String;ZI)V")
    public static void method153(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1099; var5++) {
            class52 var6 = class52.method1933(var5);
            if ((!arg1 || var6.field1143) && var6.field1136 == -1 && var6.field1105.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field798 = -1;
                    Statics.field203 = null;
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
        Statics.field203 = var3;
        Statics.field1870 = 0;
        Statics.field798 = var4;
        String[] var9 = new String[Statics.field798];
        for (int var10 = 0; var10 < Statics.field798; var10++) {
            var9[var10] = class52.method1933(var3[var10]).field1105;
        }
        class124.method2214(var9, Statics.field203);
    }
}
